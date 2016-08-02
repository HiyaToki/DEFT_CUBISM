require 'nokogiri'
require 'pathname'

annotations = Dir[ARGV[0]]
parses = Dir[ARGV[1]]

ANNOTATION_SUFFIX = ".cb.xml"
PARSE_SUFFIX = ".cmp.txt.xml"
GOLD_SUFFIX = ".cmp.xml.tsv"
COUNT_SUFFIX = ".cmp.xml.count"

golds = Pathname.new(ARGV[0]).dirname.dirname.to_s + "/gold"

annotations.each_with_index do |annotation, i|
  axml = Nokogiri::XML.parse(File.read(annotation))
  pxml = Nokogiri::XML.parse(File.read(parses[i]))

  index = {}
  cb_map = {"CB" => "COMMITTED_BELIEF",
            "NCB" => "NON_COMMITTED_BELIEF",
            "ROB" => "NON_COMMITTED_BELIEF",
            "NA" => "NON_ATTRIBUTABLE_BELIEF"}

  pxml.css('token').each_with_index do |token, j|
    index[token.css('CharacterOffsetBegin').text] = j+1
  end

  File.open("#{golds}/#{File.basename(annotation, ANNOTATION_SUFFIX)}#{GOLD_SUFFIX}", 'w+') do |f|
    axml.css('annotation').each do |a|
      offset = a.attributes['offset'].text
      belief_type = a.css('belief_type').text
      text = a.css('annotation_text').text

      token_id = index[offset]


      f.puts("#{text}\t#{cb_map[belief_type]}\t#{token_id}") if token_id
    end

  end
  File.open("#{golds}/#{File.basename(annotation, ANNOTATION_SUFFIX)}#{COUNT_SUFFIX}", 'w+') do |f|
    f.puts pxml.css('token').size
  end

end