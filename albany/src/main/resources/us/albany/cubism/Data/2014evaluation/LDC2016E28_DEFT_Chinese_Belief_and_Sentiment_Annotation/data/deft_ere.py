#!/usr/bin/env python
"""
This module contains classes to represent DEFT ERE annotations and methods
to read ERE XML annotations into an OOP representation.
"""
import xml.etree.ElementTree as ET
from xml.etree.ElementTree import tostring
from collections import defaultdict

__author__ = 'Daniel Bauer'
__email__ = 'bauer@cs.columbia.edu'
__date__ = 'May 31 2016'

class AnnotationFormatError(RuntimeError): 
    pass

class DocumentSource(object): 
    """
    a document source
    """
    def __init__(self, kit_id, doc_id, source_type='multi_post'):
        self.kit_id = kit_id
        self.doc_id = doc_id
        self.source_type = source_type


#Classes representing object types

class Entity(object):
    """
    an individul entity. 
    """
    def __init__(self, eid, etype, specificity='specific', source_doc=None):
        self.entity_id = eid 
        self.entity_type = etype
        self.specificity = specificity
        self.mentions = []
        
    def __repr__(self):
        return '<Entity {0}>'.format(self.entity_id)


class Relation(object):
    """
    an individual relation.
    """
    def __init__(self, rid, rtype, rsubtype):
        self.relation_id = rid
        self.relation_type = rtype
        self.relation_subtype = rsubtype
        self.mentions = []

    
    def __repr__(self):
        return '<Relation {0}>'.format(self.relation_id)


class Hopper(object):
    """
    an individual event.
    """
    def __init__(self, eid):
        self.event_id = eid
        self.mentions = []
    
    def __repr__(self):
        return '<Hopper {0}>'.format(self.event_id)

class Filler(object): 
    """
    an individual filler.
    """
    def __init__(self, fid, offset, length, ftype):
        self.filler_id = fid
        self.offset = offset
        self.length = length
        self.filler_type = ftype
        self.text = ''

    def __repr__(self):
        return '<Filler {0}>'.format(self.filler_id) 
        




#Objects representing individual mentions
class EntityMention(object): 
    """
    a single mention of an entity
    """
    def __init__(self, mention_id, noun_type, source, offset, length, entity = None):
        self.mention_id = mention_id
        self.noun_type = noun_type
        self.source = source
        self.offset = offset
        self.length = length
        self.entity = entity # reference to the entity type of this mention
        self.mention_text = '' 
        self.nom_head = None
        self.beliefs = [] # beliefs for which this entity mention is the source
        self.argument_beliefs = [] # argument beliefs for which this entity mention is the source 
        self.has_sentiments = [] # sentiments for which this entity mention is the source 
        self.sentiments = [] # sentiments towards this entity 

    def __repr__(self):
        return '<EntityMention {0}>'.format(self.mention_id)


class NomHead(object): 
    """
    a nominal head description
    """
    def __init__(self, offset, length, text, source):
        self.offset = offset
        self.length = length
        self.text = text
        self.source = source


class RelationMention(object):
    """
    a specific mention of a relation.
    """
    def __init__(self, mention_id, realis):
        self.mention_id = mention_id
        self.realis = realis
        self.rel_arg1 = None
        self.rel_arg2 = None
        self.trigger = None
        self.relation = None 
        self.beliefs = [] 
        self.sentiments = []

    def __repr__(self):
        return '<RelationMention {0}({1}) {2} {3}>'.format(self.mention_id, self.relation.relation_id, self.rel_arg1, self.rel_arg2) 

class Argument(object): 
    """
    argument of a relation or event 
    """
    def __init__(self, entity, entity_mention, role, realis = None, is_filler= False):
        self.entity = entity
        self.entity_mention = entity_mention
        if entity_mention:
            self.mention_id = entity_mention.mention_id
        else: 
            assert isinstance(entity, Filler)
            self.mention_id = entity.filler_id  
        self.role = role
        self.realis = None
        self.text = ''
        self.is_filler = is_filler 
        self.beliefs = []
    def __repr__(self):
        if self.is_filler: 
            return '<Argument mention: {0}, role: {1}>'.format(self.entity, self.role)
        else:
            return '<Argument mention: {0}, role: {1}>'.format(self.entity_mention.mention_id, self.role)


class EventMention(object):
    """
    a specific mention of an event.
    """
    def __init__(self, mention_id, etype, esubtype, realis):
        self.mention_id = mention_id
        self.event_type = etype
        self.event_subtype = esubtype
        self.realis = realis
        self.arguments = {} # role => Argument objects
        self.argument_index = defaultdict(list) # entity ID => list of Argument objects
        self.trigger = None
        self.hopper = None
        self.beliefs = []
        self.sentiments = []
    
    def __repr__(self):
        argstr = ",".join([str(x) for x in self.arguments.values()])
        return '<EventMention {0}({1}) {2}>'.format(self.mention_id, self.hopper.event_id, argstr) 


class Trigger(object):
    """
    Trigger of a relation or event mention.
    """
    def __init__(self, source, offset, length):
        self.source = source
        self.offset = offset
        self.length = length
        self.text = '' 

##############################################################################
# The following section contains a top-level class EREAnnotations that stores 
# ERE annotationsand functions to populate this object from an XML source. 

class EREAnnotations(object): 
    """
    Represent a set of EREAnnotations, possibly over multiple documents 
    """

    def __init__(self):
        self.sources = {}
        self.entities = {}
        self.entity_mentions = {}
        self.fillers = {}
        self.relations = {}
        self.relation_mentions = {}
        self.hoppers = {}
        self.event_mentions = {}

    def integrate_entities(self, etree, source):
        """
        Add the entities described in this etree object into the annotation data structure.
        Note that if an entity element uses an existing id, its entity mentions will just be
        added to the original entity object. 
        """
        for entity_et in etree: 
            assert entity_et.tag == 'entity'
           
            entity = Entity(entity_et.get('id'), entity_et.get('type'), entity_et.get('specificity'), source)
            if not self.entities.get(entity.entity_id):
                self.entities[entity.entity_id] = entity
            else: 
                entity = self.entities.get(entity.entity_id) 
            
            for mention_et in entity_et:  # add each mention id
                assert mention_et.tag == 'entity_mention'
                mention = EntityMention(mention_et.get('id'), mention_et.get('noun_type'), self.sources[mention_et.get('source')], 
                                        int(mention_et.get('offset')), int(mention_et.get('length')), entity)
                if not mention.mention_id in self.entity_mentions:
                    self.entity_mentions[mention.mention_id] = mention
                    entity.mentions.append(mention)
                else: 
                    mention = self.entity_mentions[mention.mention_id]
               
                for child_et in mention_et:
                    if child_et.tag == 'mention_text':
                        mention.mention_text = child_et.text
                    elif child_et.tag == 'nom_head': 
                        mention.nom_head = NomHead(int(child_et.get('offset')), int(child_et.get('length')), child_et.text, self.sources[child_et.get('source')])
                    else: 
                        raise AnnotationFormatError('unexpected XML element {0}, child of {1}.'.format(tostring(child_et), tostring(mention_et)))
        
    def integrate_relations(self, etree, source): 
        """
        Add the relations described in this etree object into the annotation data structure.
        """
        for relation_et in etree: 
            assert relation_et.tag == 'relation'

            relation = Relation(relation_et.get('id'), relation_et.get('type'), relation_et.get('subtype'))
            if not relation.relation_id in self.relations: 
                self.relations[relation.relation_id] = relation
            else: 
                relation = self.relations[relation.relation_id] 
            
            for mention_et in relation_et: 
                assert mention_et.tag == 'relation_mention'
                mention = RelationMention(mention_et.get('id'), mention_et.get('realis'))
                if not mention.mention_id in self.relation_mentions:
                    self.relation_mentions[mention.mention_id] = mention
                    relation.mentions.append(mention)
                    mention.relation = relation
                else: 
                    mention = self.relation_mentions[mention.mention_id]
                 

                for child_et in mention_et: 
                    if child_et.tag == 'rel_arg1':
                        if child_et.get('entity_id') is not None:
                            entity = self.entities[child_et.get('entity_id')]
                            entity_mention = self.entity_mentions[child_et.get('entity_mention_id')]
                            assert entity is entity_mention.entity
                            arg = Argument(entity, entity_mention, child_et.get('role'))
                            arg.text = child_et.text
                            mention.rel_arg1 = arg
                        elif child_et.get('filler_id') is not None:
                            filler = self.fillers[child_et.get('filler_id')]
                            arg = Argument(filler, None, child_et.get('role'))
                            arg.text = child_et.text
                            mention.rel_arg1 = arg
                        else: 
                            raise AnnotationFormatError('Invalid attributes for XML element {0}. Expected entity_id or filler_id.'.format(tostring(child_et)))
                  
                    elif child_et.tag == 'rel_arg2':
                        if child_et.get('entity_id') is not None:
                            entity = self.entities[child_et.get('entity_id')]
                            entity_mention = self.entity_mentions[child_et.get('entity_mention_id')]
                            assert entity is entity_mention.entity
                            arg = Argument(entity, entity_mention, child_et.get('role'))
                            arg.text = child_et.text
                            mention.rel_arg2 = arg
                        elif child_et.get('filler_id') is not None:
                            filler = self.fillers[child_et.get('filler_id')]
                            arg = Argument(filler, None, child_et.get('role'))
                            arg.text = child_et.text
                            mention.rel_arg2 = arg
                        else: 
                            raise AnnotationFormatError('Invalid attributes for XML element {0}. Expected entity_id or filler_id.'.format(tostring(child_et)))
                 

                    elif child_et.tag == 'trigger':
                        source = self.sources[child_et.get('source')]
                        trigger = Trigger(source, int(child_et.get('offset')), int(child_et.get('length'))) 
                        trigger.text = child_et.text
                        mention.trigger = trigger
                    else: 
                        raise AnnotationFormatError('unexpected XML element {0}, child of {1}.'.format(tostring(child_et), tostring(mention_et)))
 
    def integrate_hoppers(self, etree, source): 
        """
        Add the events ("hoppers") described in this etree object into the annotation data structure.
        """
        for hopper_et in etree: 
            assert hopper_et.tag == 'hopper'

            hopper = Hopper(hopper_et.get('id'))
            if not hopper.event_id in self.hoppers: 
                self.hoppers[hopper.event_id] = hopper
            else: 
                hopper = self.hoppers[hopper.event_id]
            
            for mention_et in hopper_et: 
                assert mention_et.tag == 'event_mention'
                mention = EventMention(mention_et.get('id'), mention_et.get('type'), mention_et.get('subtype'), mention_et.get('realis'))
                if not mention.mention_id in self.event_mentions:
                    self.event_mentions[mention.mention_id] = mention
                    mention.hopper= hopper
                    hopper.mentions.append(mention)
                else: 
                    mention = self.event_mentions[mention.mention_id]

                for child_et in mention_et:
                    if child_et.tag == 'em_arg':
                        if child_et.get('filler_id'): # Some mentions have filler arguments instead of entities
                            filler = self.fillers[child_et.get('filler_id')]
                            arg = Argument(filler, None, child_et.get('role'), child_et.get('realis'), is_filler = True)
                            mention.arguments[arg.role] = arg
                            mention.argument_index[arg.entity.filler_id].append(arg)
                        else:    
                            entity = self.entities[child_et.get('entity_id')]
                            entity_mention = self.entity_mentions[child_et.get('entity_mention_id')]
                            assert entity is entity_mention.entity
                            arg = Argument(entity, entity_mention, child_et.get('role'), child_et.get('realis'))
                            mention.arguments[arg.entity_mention.mention_id] = arg
                            mention.argument_index[arg.entity_mention.mention_id].append(arg)
                        arg.text = child_et.text
                    elif child_et.tag == 'trigger':
                        source = self.sources[child_et.get('source')]
                        trigger = Trigger(source, int(child_et.get('offset')), int(child_et.get('length'))) 
                        trigger.text = child_et.text
                        mention.trigger = trigger
                    else: 
                        raise AnnotationFormatError('unexpected XML element {0}, child of {1}.'.format(tostring(child_et), tostring(mention_et)))

    def integrate_fillers(self, etree, source):
        """
        Add the fillers described in this etree object into the annotation data structure.
        """
        for filler_et in etree:
            assert filler_et.tag == 'filler'
            filler = Filler(filler_et.get('id'), int(filler_et.get('offset')), int(filler_et.get('length')), filler_et.get('type'))
            if not filler.filler_id in self.fillers: 
                self.fillers[filler.filler_id] = filler
            else: 
                filler = self.fillers[filler.filler_id]
            filler.text = filler_et.text


    def integrate_etree(self, etree):
        """
        Add the content of an e-tree object into the annotation data structure.
        """
        root = etree.getroot()
        # Create a new source object
        source = DocumentSource(root.get('kit_id'), root.get('doc_id'), root.get('source_type')) 
        if not source.doc_id in self.sources: 
            self.sources[source.doc_id] = source
        else: 
            source = self.sources[source.doc_id] 
        
        # Now process the children
        for child in root: 
            if child.tag == 'entities':
                self.integrate_entities(child, source)
            elif child.tag == 'fillers':
                self.integrate_fillers(child, source)
            elif child.tag == 'relations':
                self.integrate_relations(child, source)
            elif child.tag == 'hoppers':
                self.integrate_hoppers(child, source) 
            else: 
                raise AnnotationFormatError('unexpected XML element {0} at top level.'.format(tostring(child)))
                 

def read_ere_xml(*sources):
    """
    Read in one or more XML sources and return an EREAnnotation object. 
    """  

    annotations = EREAnnotations(); # The new annotations object

    for source_f in sources: 
        et = ET.parse(source_f)
        annotations.integrate_etree(et)

    return annotations
