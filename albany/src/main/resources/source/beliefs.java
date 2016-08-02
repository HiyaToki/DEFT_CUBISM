//
//
// Automatically generated from beliefs.m by the Mercury Compiler,
// version 14.01.1, configured for x86_64-unknown-linux-gnu
//
//

/* :- module beliefs. */

package jmercury;
// import assoc_list;
// import bitmap;
// import bool;
// import builtin;
// import mr_char;
// import construct;
// import deconstruct;
// import mr_enum;
// import errors;
// import io;
// import list;
// import map;
// import maybe;
// import multi_map;
// import ops;
// import pair;
// import pretty_printer;
// import private_builtin;
// import rtti_implementation;
// import sberrs;
// import set;
// import set_ordlist;
// import stream;
// import string;
// import term;
// import time;
// import tree234;
// import type_desc;
// import univ;
// import wordnet;
// import xml;
public class beliefs {
  static {
    if (System.getenv("MERCURY_DEBUG_CLASS_INIT") != null) {
      System.out.println("[beliefs start init]");
    }
  }

// RttiDefns
  private static final jmercury.runtime.TypeInfo_Struct set_ordlist__ti_set_ordlist_1builtin__type_ctor_info_string_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1beliefs__type_ctor_info_belstmnt_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] beliefs__field_types_belfile_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc beliefs__du_functor_desc_belfile_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] beliefs__du_stag_ordered_belfile_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] beliefs__du_ptag_ordered_belfile_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] beliefs__du_name_ordered_belfile_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] beliefs__functor_number_map_belfile_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct beliefs__type_ctor_info_belfile_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1beliefs__type_ctor_info_prop_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] beliefs__field_types_belief_0_0 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc beliefs__du_functor_desc_belief_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] beliefs__du_stag_ordered_belief_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] beliefs__du_ptag_ordered_belief_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] beliefs__du_name_ordered_belief_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] beliefs__functor_number_map_belief_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct beliefs__type_ctor_info_belief_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] beliefs__field_types_belmod_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc beliefs__du_functor_desc_belmod_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] beliefs__du_stag_ordered_belmod_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] beliefs__du_ptag_ordered_belmod_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] beliefs__du_name_ordered_belmod_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] beliefs__functor_number_map_belmod_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct beliefs__type_ctor_info_belmod_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] beliefs__field_types_belstmnt_0_0 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc beliefs__du_functor_desc_belstmnt_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1beliefs__type_ctor_info_belmod_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1beliefs__type_ctor_info_beltriple_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] beliefs__field_types_belstmnt_0_1 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc beliefs__du_functor_desc_belstmnt_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] beliefs__du_stag_ordered_belstmnt_0_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final jmercury.runtime.DuPtagLayout[] beliefs__du_ptag_ordered_belstmnt_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] beliefs__du_name_ordered_belstmnt_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final int[] beliefs__functor_number_map_belstmnt_0 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct beliefs__type_ctor_info_belstmnt_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] beliefs__field_types_belstr_0_0 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc beliefs__du_functor_desc_belstr_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] beliefs__du_stag_ordered_belstr_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] beliefs__du_ptag_ordered_belstr_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] beliefs__du_name_ordered_belstr_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] beliefs__functor_number_map_belstr_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct beliefs__type_ctor_info_belstr_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct maybe__ti_maybe_1beliefs__type_ctor_info_belstr_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] beliefs__field_types_beltriple_0_0 = new jmercury.runtime.PseudoTypeInfo[6];
  private static final jmercury.runtime.DuFunctorDesc beliefs__du_functor_desc_beltriple_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] beliefs__du_stag_ordered_beltriple_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] beliefs__du_ptag_ordered_beltriple_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] beliefs__du_name_ordered_beltriple_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] beliefs__functor_number_map_beltriple_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct beliefs__type_ctor_info_beltriple_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.DuFunctorDesc beliefs__du_functor_desc_bstrtp_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] beliefs__field_types_bstrtp_0_1 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc beliefs__du_functor_desc_bstrtp_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc beliefs__du_functor_desc_bstrtp_0_2 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc beliefs__du_functor_desc_bstrtp_0_3 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc beliefs__du_functor_desc_bstrtp_0_4 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] beliefs__du_stag_ordered_bstrtp_0_0 = new jmercury.runtime.DuFunctorDesc[5];
  private static final jmercury.runtime.DuPtagLayout[] beliefs__du_ptag_ordered_bstrtp_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] beliefs__du_name_ordered_bstrtp_0 = new jmercury.runtime.DuFunctorDesc[5];
  private static final int[] beliefs__functor_number_map_bstrtp_0 = new int[5];
  public static final jmercury.runtime.TypeCtorInfo_Struct beliefs__type_ctor_info_bstrtp_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1beliefs__type_ctor_info_envmod_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1beliefs__type_ctor_info_envtriple_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__ti_tree234_2list__ti_list_1beliefs__type_ctor_info_envmod_0list__ti_list_1beliefs__type_ctor_info_envtriple_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] beliefs__field_types_envdata_0_0 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc beliefs__du_functor_desc_envdata_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] beliefs__du_stag_ordered_envdata_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] beliefs__du_ptag_ordered_envdata_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] beliefs__du_name_ordered_envdata_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] beliefs__functor_number_map_envdata_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct beliefs__type_ctor_info_envdata_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct beliefs__type_ctor_info_envmap_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] beliefs__field_types_envmod_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc beliefs__du_functor_desc_envmod_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] beliefs__du_stag_ordered_envmod_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] beliefs__du_ptag_ordered_envmod_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] beliefs__du_name_ordered_envmod_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] beliefs__functor_number_map_envmod_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct beliefs__type_ctor_info_envmod_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct maybe__ti_maybe_1builtin__type_ctor_info_string_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] beliefs__field_types_envtriple_0_0 = new jmercury.runtime.PseudoTypeInfo[6];
  private static final jmercury.runtime.DuFunctorDesc beliefs__du_functor_desc_envtriple_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] beliefs__du_stag_ordered_envtriple_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] beliefs__du_ptag_ordered_envtriple_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] beliefs__du_name_ordered_envtriple_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] beliefs__functor_number_map_envtriple_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct beliefs__type_ctor_info_envtriple_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc beliefs__enum_functor_desc_modality_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] beliefs__enum_value_ordered_modality_0 = new jmercury.runtime.EnumFunctorDesc[1];
  private static final jmercury.runtime.EnumFunctorDesc[] beliefs__enum_name_ordered_modality_0 = new jmercury.runtime.EnumFunctorDesc[1];
  private static final int[] beliefs__functor_number_map_modality_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct beliefs__type_ctor_info_modality_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] beliefs__field_types_prop_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc beliefs__du_functor_desc_prop_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] beliefs__du_stag_ordered_prop_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] beliefs__du_ptag_ordered_prop_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] beliefs__du_name_ordered_prop_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] beliefs__functor_number_map_prop_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct beliefs__type_ctor_info_prop_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] beliefs__field_types_proposition_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc beliefs__du_functor_desc_proposition_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] beliefs__field_types_proposition_0_1 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc beliefs__du_functor_desc_proposition_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] beliefs__du_stag_ordered_proposition_0_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final jmercury.runtime.DuPtagLayout[] beliefs__du_ptag_ordered_proposition_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] beliefs__du_name_ordered_proposition_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final int[] beliefs__functor_number_map_proposition_0 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct beliefs__type_ctor_info_proposition_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  static {
    //
    //
    //
    set_ordlist__ti_set_ordlist_1builtin__type_ctor_info_string_0.init(set_ordlist.set_ordlist__type_ctor_info_set_ordlist_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0)});
    //
    //
    //
    list__ti_list_1beliefs__type_ctor_info_belstmnt_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_belstmnt_0)});
    //
    beliefs__field_types_belfile_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    beliefs__field_types_belfile_0_0[1] = (jmercury.runtime.PseudoTypeInfo) beliefs.set_ordlist__ti_set_ordlist_1builtin__type_ctor_info_string_0;
    beliefs__field_types_belfile_0_0[2] = (jmercury.runtime.PseudoTypeInfo) beliefs.list__ti_list_1beliefs__type_ctor_info_belstmnt_0;
    //
    beliefs__du_functor_desc_belfile_0_0.init("belfile",
		3,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		beliefs.beliefs__field_types_belfile_0_0,
		null,
		null,
		null);
    //
    beliefs__du_stag_ordered_belfile_0_0[0] = beliefs.beliefs__du_functor_desc_belfile_0_0;
    //
    beliefs__du_ptag_ordered_belfile_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		beliefs.beliefs__du_stag_ordered_belfile_0_0);
    //
    beliefs__du_name_ordered_belfile_0[0] = beliefs.beliefs__du_functor_desc_belfile_0_0;
    //
    beliefs__functor_number_map_belfile_0[0] = 0;
    //
    beliefs__type_ctor_info_belfile_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(0))),
		((java.lang.Object) (new AddrOf2_0(1))),
		"beliefs",
		"belfile",
		new jmercury.runtime.TypeFunctors(beliefs.beliefs__du_name_ordered_belfile_0),
		new jmercury.runtime.TypeLayout(beliefs.beliefs__du_ptag_ordered_belfile_0),
		1,
		4,
		beliefs.beliefs__functor_number_map_belfile_0);
    //
    //
    list__ti_list_1beliefs__type_ctor_info_prop_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_prop_0)});
    //
    beliefs__field_types_belief_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    beliefs__field_types_belief_0_0[1] = (jmercury.runtime.PseudoTypeInfo) beliefs.list__ti_list_1beliefs__type_ctor_info_prop_0;
    //
    beliefs__du_functor_desc_belief_0_0.init("bel",
		2,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		beliefs.beliefs__field_types_belief_0_0,
		null,
		null,
		null);
    //
    beliefs__du_stag_ordered_belief_0_0[0] = beliefs.beliefs__du_functor_desc_belief_0_0;
    //
    beliefs__du_ptag_ordered_belief_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		beliefs.beliefs__du_stag_ordered_belief_0_0);
    //
    beliefs__du_name_ordered_belief_0[0] = beliefs.beliefs__du_functor_desc_belief_0_0;
    //
    beliefs__functor_number_map_belief_0[0] = 0;
    //
    beliefs__type_ctor_info_belief_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(2))),
		((java.lang.Object) (new AddrOf2_0(3))),
		"beliefs",
		"belief",
		new jmercury.runtime.TypeFunctors(beliefs.beliefs__du_name_ordered_belief_0),
		new jmercury.runtime.TypeLayout(beliefs.beliefs__du_ptag_ordered_belief_0),
		1,
		4,
		beliefs.beliefs__functor_number_map_belief_0);
    //
    //
    //
    //
    beliefs__field_types_belmod_0_0[0] = (jmercury.runtime.PseudoTypeInfo) beliefs.beliefs__type_ctor_info_belstr_0;
    beliefs__field_types_belmod_0_0[1] = (jmercury.runtime.PseudoTypeInfo) bool.bool__type_ctor_info_bool_0;
    beliefs__field_types_belmod_0_0[2] = (jmercury.runtime.PseudoTypeInfo) beliefs.beliefs__type_ctor_info_modality_0;
    //
    beliefs__du_functor_desc_belmod_0_0.init("belmod",
		3,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		beliefs.beliefs__field_types_belmod_0_0,
		null,
		null,
		null);
    //
    beliefs__du_stag_ordered_belmod_0_0[0] = beliefs.beliefs__du_functor_desc_belmod_0_0;
    //
    beliefs__du_ptag_ordered_belmod_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		beliefs.beliefs__du_stag_ordered_belmod_0_0);
    //
    beliefs__du_name_ordered_belmod_0[0] = beliefs.beliefs__du_functor_desc_belmod_0_0;
    //
    beliefs__functor_number_map_belmod_0[0] = 0;
    //
    beliefs__type_ctor_info_belmod_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(4))),
		((java.lang.Object) (new AddrOf2_0(5))),
		"beliefs",
		"belmod",
		new jmercury.runtime.TypeFunctors(beliefs.beliefs__du_name_ordered_belmod_0),
		new jmercury.runtime.TypeLayout(beliefs.beliefs__du_ptag_ordered_belmod_0),
		1,
		4,
		beliefs.beliefs__functor_number_map_belmod_0);
    //
    //
    beliefs__field_types_belstmnt_0_0[0] = (jmercury.runtime.PseudoTypeInfo) beliefs.beliefs__type_ctor_info_beltriple_0;
    //
    beliefs__du_functor_desc_belstmnt_0_0.init("one",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		0,
		beliefs.beliefs__field_types_belstmnt_0_0,
		null,
		null,
		null);
    //
    //
    list__ti_list_1beliefs__type_ctor_info_belmod_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_belmod_0)});
    //
    list__ti_list_1beliefs__type_ctor_info_beltriple_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_beltriple_0)});
    //
    beliefs__field_types_belstmnt_0_1[0] = (jmercury.runtime.PseudoTypeInfo) beliefs.list__ti_list_1beliefs__type_ctor_info_belmod_0;
    beliefs__field_types_belstmnt_0_1[1] = (jmercury.runtime.PseudoTypeInfo) beliefs.list__ti_list_1beliefs__type_ctor_info_beltriple_0;
    //
    beliefs__du_functor_desc_belstmnt_0_1.init("embedded",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		beliefs.beliefs__field_types_belstmnt_0_1,
		null,
		null,
		null);
    //
    beliefs__du_stag_ordered_belstmnt_0_0[0] = beliefs.beliefs__du_functor_desc_belstmnt_0_0;
    beliefs__du_stag_ordered_belstmnt_0_0[1] = beliefs.beliefs__du_functor_desc_belstmnt_0_1;
    //
    beliefs__du_ptag_ordered_belstmnt_0[0] = new jmercury.runtime.DuPtagLayout(2,
		private_builtin.MR_SECTAG_REMOTE,
		beliefs.beliefs__du_stag_ordered_belstmnt_0_0);
    //
    beliefs__du_name_ordered_belstmnt_0[0] = beliefs.beliefs__du_functor_desc_belstmnt_0_1;
    beliefs__du_name_ordered_belstmnt_0[1] = beliefs.beliefs__du_functor_desc_belstmnt_0_0;
    //
    beliefs__functor_number_map_belstmnt_0[0] = 1;
    beliefs__functor_number_map_belstmnt_0[1] = 0;
    //
    beliefs__type_ctor_info_belstmnt_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(6))),
		((java.lang.Object) (new AddrOf2_0(7))),
		"beliefs",
		"belstmnt",
		new jmercury.runtime.TypeFunctors(beliefs.beliefs__du_name_ordered_belstmnt_0),
		new jmercury.runtime.TypeLayout(beliefs.beliefs__du_ptag_ordered_belstmnt_0),
		2,
		4,
		beliefs.beliefs__functor_number_map_belstmnt_0);
    //
    //
    beliefs__field_types_belstr_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    beliefs__field_types_belstr_0_0[1] = (jmercury.runtime.PseudoTypeInfo) beliefs.beliefs__type_ctor_info_bstrtp_0;
    //
    beliefs__du_functor_desc_belstr_0_0.init("str",
		2,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		beliefs.beliefs__field_types_belstr_0_0,
		null,
		null,
		null);
    //
    beliefs__du_stag_ordered_belstr_0_0[0] = beliefs.beliefs__du_functor_desc_belstr_0_0;
    //
    beliefs__du_ptag_ordered_belstr_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		beliefs.beliefs__du_stag_ordered_belstr_0_0);
    //
    beliefs__du_name_ordered_belstr_0[0] = beliefs.beliefs__du_functor_desc_belstr_0_0;
    //
    beliefs__functor_number_map_belstr_0[0] = 0;
    //
    beliefs__type_ctor_info_belstr_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(8))),
		((java.lang.Object) (new AddrOf2_0(9))),
		"beliefs",
		"belstr",
		new jmercury.runtime.TypeFunctors(beliefs.beliefs__du_name_ordered_belstr_0),
		new jmercury.runtime.TypeLayout(beliefs.beliefs__du_ptag_ordered_belstr_0),
		1,
		4,
		beliefs.beliefs__functor_number_map_belstr_0);
    //
    //
    maybe__ti_maybe_1beliefs__type_ctor_info_belstr_0.init(maybe.maybe__type_ctor_info_maybe_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_belstr_0)});
    //
    //
    beliefs__field_types_beltriple_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    beliefs__field_types_beltriple_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    beliefs__field_types_beltriple_0_0[2] = (jmercury.runtime.PseudoTypeInfo) beliefs.beliefs__type_ctor_info_belstr_0;
    beliefs__field_types_beltriple_0_0[3] = (jmercury.runtime.PseudoTypeInfo) bool.bool__type_ctor_info_bool_0;
    beliefs__field_types_beltriple_0_0[4] = (jmercury.runtime.PseudoTypeInfo) beliefs.beliefs__type_ctor_info_belstr_0;
    beliefs__field_types_beltriple_0_0[5] = (jmercury.runtime.PseudoTypeInfo) beliefs.maybe__ti_maybe_1beliefs__type_ctor_info_belstr_0;
    //
    beliefs__du_functor_desc_beltriple_0_0.init("beltriple",
		6,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		beliefs.beliefs__field_types_beltriple_0_0,
		null,
		null,
		null);
    //
    beliefs__du_stag_ordered_beltriple_0_0[0] = beliefs.beliefs__du_functor_desc_beltriple_0_0;
    //
    beliefs__du_ptag_ordered_beltriple_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		beliefs.beliefs__du_stag_ordered_beltriple_0_0);
    //
    beliefs__du_name_ordered_beltriple_0[0] = beliefs.beliefs__du_functor_desc_beltriple_0_0;
    //
    beliefs__functor_number_map_beltriple_0[0] = 0;
    //
    beliefs__type_ctor_info_beltriple_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(10))),
		((java.lang.Object) (new AddrOf2_0(11))),
		"beliefs",
		"beltriple",
		new jmercury.runtime.TypeFunctors(beliefs.beliefs__du_name_ordered_beltriple_0),
		new jmercury.runtime.TypeLayout(beliefs.beliefs__du_ptag_ordered_beltriple_0),
		1,
		4,
		beliefs.beliefs__functor_number_map_beltriple_0);
    //
    beliefs__du_functor_desc_bstrtp_0_0.init("wordnet",
		0,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		0,
		null,
		null,
		null,
		null);
    //
    //
    beliefs__field_types_bstrtp_0_1[0] = (jmercury.runtime.PseudoTypeInfo) wordnet.wordnet__type_ctor_info_prontp_0;
    //
    beliefs__du_functor_desc_bstrtp_0_1.init("pronoun",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		4,
		1,
		beliefs.beliefs__field_types_bstrtp_0_1,
		null,
		null,
		null);
    //
    beliefs__du_functor_desc_bstrtp_0_2.init("pp",
		0,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		2,
		null,
		null,
		null,
		null);
    //
    beliefs__du_functor_desc_bstrtp_0_3.init("unrecognised",
		0,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		2,
		3,
		null,
		null,
		null,
		null);
    //
    beliefs__du_functor_desc_bstrtp_0_4.init("coref",
		0,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		3,
		4,
		null,
		null,
		null,
		null);
    //
    beliefs__du_stag_ordered_bstrtp_0_0[0] = beliefs.beliefs__du_functor_desc_bstrtp_0_0;
    beliefs__du_stag_ordered_bstrtp_0_0[1] = beliefs.beliefs__du_functor_desc_bstrtp_0_2;
    beliefs__du_stag_ordered_bstrtp_0_0[2] = beliefs.beliefs__du_functor_desc_bstrtp_0_3;
    beliefs__du_stag_ordered_bstrtp_0_0[3] = beliefs.beliefs__du_functor_desc_bstrtp_0_4;
    beliefs__du_stag_ordered_bstrtp_0_0[4] = beliefs.beliefs__du_functor_desc_bstrtp_0_1;
    //
    beliefs__du_ptag_ordered_bstrtp_0[0] = new jmercury.runtime.DuPtagLayout(5,
		private_builtin.MR_SECTAG_REMOTE,
		beliefs.beliefs__du_stag_ordered_bstrtp_0_0);
    //
    beliefs__du_name_ordered_bstrtp_0[0] = beliefs.beliefs__du_functor_desc_bstrtp_0_4;
    beliefs__du_name_ordered_bstrtp_0[1] = beliefs.beliefs__du_functor_desc_bstrtp_0_2;
    beliefs__du_name_ordered_bstrtp_0[2] = beliefs.beliefs__du_functor_desc_bstrtp_0_1;
    beliefs__du_name_ordered_bstrtp_0[3] = beliefs.beliefs__du_functor_desc_bstrtp_0_3;
    beliefs__du_name_ordered_bstrtp_0[4] = beliefs.beliefs__du_functor_desc_bstrtp_0_0;
    //
    beliefs__functor_number_map_bstrtp_0[0] = 4;
    beliefs__functor_number_map_bstrtp_0[1] = 2;
    beliefs__functor_number_map_bstrtp_0[2] = 1;
    beliefs__functor_number_map_bstrtp_0[3] = 3;
    beliefs__functor_number_map_bstrtp_0[4] = 0;
    //
    beliefs__type_ctor_info_bstrtp_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(12))),
		((java.lang.Object) (new AddrOf2_0(13))),
		"beliefs",
		"bstrtp",
		new jmercury.runtime.TypeFunctors(beliefs.beliefs__du_name_ordered_bstrtp_0),
		new jmercury.runtime.TypeLayout(beliefs.beliefs__du_ptag_ordered_bstrtp_0),
		5,
		4,
		beliefs.beliefs__functor_number_map_bstrtp_0);
    //
    //
    list__ti_list_1beliefs__type_ctor_info_envmod_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_envmod_0)});
    //
    //
    list__ti_list_1beliefs__type_ctor_info_envtriple_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_envtriple_0)});
    //
    //
    tree234__ti_tree234_2list__ti_list_1beliefs__type_ctor_info_envmod_0list__ti_list_1beliefs__type_ctor_info_envtriple_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.list__ti_list_1beliefs__type_ctor_info_envmod_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.list__ti_list_1beliefs__type_ctor_info_envtriple_0)});
    //
    beliefs__field_types_envdata_0_0[0] = (jmercury.runtime.PseudoTypeInfo) beliefs.tree234__ti_tree234_2list__ti_list_1beliefs__type_ctor_info_envmod_0list__ti_list_1beliefs__type_ctor_info_envtriple_0;
    //
    beliefs__du_functor_desc_envdata_0_0.init("envdata",
		1,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		beliefs.beliefs__field_types_envdata_0_0,
		null,
		null,
		null);
    //
    beliefs__du_stag_ordered_envdata_0_0[0] = beliefs.beliefs__du_functor_desc_envdata_0_0;
    //
    beliefs__du_ptag_ordered_envdata_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		beliefs.beliefs__du_stag_ordered_envdata_0_0);
    //
    beliefs__du_name_ordered_envdata_0[0] = beliefs.beliefs__du_functor_desc_envdata_0_0;
    //
    beliefs__functor_number_map_envdata_0[0] = 0;
    //
    beliefs__type_ctor_info_envdata_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(14))),
		((java.lang.Object) (new AddrOf2_0(15))),
		"beliefs",
		"envdata",
		new jmercury.runtime.TypeFunctors(beliefs.beliefs__du_name_ordered_envdata_0),
		new jmercury.runtime.TypeLayout(beliefs.beliefs__du_ptag_ordered_envdata_0),
		1,
		4,
		beliefs.beliefs__functor_number_map_envdata_0);
    //
    beliefs__type_ctor_info_envmap_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(16))),
		((java.lang.Object) (new AddrOf2_0(17))),
		"beliefs",
		"envmap",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) beliefs.tree234__ti_tree234_2list__ti_list_1beliefs__type_ctor_info_envmod_0list__ti_list_1beliefs__type_ctor_info_envtriple_0),
		-1,
		0,
		null);
    //
    beliefs__field_types_envmod_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    beliefs__field_types_envmod_0_0[1] = (jmercury.runtime.PseudoTypeInfo) bool.bool__type_ctor_info_bool_0;
    beliefs__field_types_envmod_0_0[2] = (jmercury.runtime.PseudoTypeInfo) beliefs.beliefs__type_ctor_info_modality_0;
    //
    beliefs__du_functor_desc_envmod_0_0.init("envmod",
		3,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		beliefs.beliefs__field_types_envmod_0_0,
		null,
		null,
		null);
    //
    beliefs__du_stag_ordered_envmod_0_0[0] = beliefs.beliefs__du_functor_desc_envmod_0_0;
    //
    beliefs__du_ptag_ordered_envmod_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		beliefs.beliefs__du_stag_ordered_envmod_0_0);
    //
    beliefs__du_name_ordered_envmod_0[0] = beliefs.beliefs__du_functor_desc_envmod_0_0;
    //
    beliefs__functor_number_map_envmod_0[0] = 0;
    //
    beliefs__type_ctor_info_envmod_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(18))),
		((java.lang.Object) (new AddrOf2_0(19))),
		"beliefs",
		"envmod",
		new jmercury.runtime.TypeFunctors(beliefs.beliefs__du_name_ordered_envmod_0),
		new jmercury.runtime.TypeLayout(beliefs.beliefs__du_ptag_ordered_envmod_0),
		1,
		4,
		beliefs.beliefs__functor_number_map_envmod_0);
    //
    maybe__ti_maybe_1builtin__type_ctor_info_string_0.init(maybe.maybe__type_ctor_info_maybe_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0)});
    //
    beliefs__field_types_envtriple_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    beliefs__field_types_envtriple_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    beliefs__field_types_envtriple_0_0[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    beliefs__field_types_envtriple_0_0[3] = (jmercury.runtime.PseudoTypeInfo) bool.bool__type_ctor_info_bool_0;
    beliefs__field_types_envtriple_0_0[4] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    beliefs__field_types_envtriple_0_0[5] = (jmercury.runtime.PseudoTypeInfo) beliefs.maybe__ti_maybe_1builtin__type_ctor_info_string_0;
    //
    beliefs__du_functor_desc_envtriple_0_0.init("envtriple",
		6,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		beliefs.beliefs__field_types_envtriple_0_0,
		null,
		null,
		null);
    //
    beliefs__du_stag_ordered_envtriple_0_0[0] = beliefs.beliefs__du_functor_desc_envtriple_0_0;
    //
    beliefs__du_ptag_ordered_envtriple_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		beliefs.beliefs__du_stag_ordered_envtriple_0_0);
    //
    beliefs__du_name_ordered_envtriple_0[0] = beliefs.beliefs__du_functor_desc_envtriple_0_0;
    //
    beliefs__functor_number_map_envtriple_0[0] = 0;
    //
    beliefs__type_ctor_info_envtriple_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(20))),
		((java.lang.Object) (new AddrOf2_0(21))),
		"beliefs",
		"envtriple",
		new jmercury.runtime.TypeFunctors(beliefs.beliefs__du_name_ordered_envtriple_0),
		new jmercury.runtime.TypeLayout(beliefs.beliefs__du_ptag_ordered_envtriple_0),
		1,
		4,
		beliefs.beliefs__functor_number_map_envtriple_0);
    //
    beliefs__enum_functor_desc_modality_0_0.init("belief",
		0);
    //
    beliefs__enum_value_ordered_modality_0[0] = beliefs.beliefs__enum_functor_desc_modality_0_0;
    //
    beliefs__enum_name_ordered_modality_0[0] = beliefs.beliefs__enum_functor_desc_modality_0_0;
    //
    beliefs__functor_number_map_modality_0[0] = 0;
    //
    beliefs__type_ctor_info_modality_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_DUMMY,
		((java.lang.Object) (new AddrOf2_0(22))),
		((java.lang.Object) (new AddrOf2_0(23))),
		"beliefs",
		"modality",
		new jmercury.runtime.TypeFunctors(beliefs.beliefs__enum_name_ordered_modality_0),
		new jmercury.runtime.TypeLayout(beliefs.beliefs__enum_value_ordered_modality_0),
		1,
		4,
		beliefs.beliefs__functor_number_map_modality_0);
    //
    beliefs__field_types_prop_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    beliefs__field_types_prop_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    beliefs__field_types_prop_0_0[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    beliefs__du_functor_desc_prop_0_0.init("prop",
		3,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		beliefs.beliefs__field_types_prop_0_0,
		null,
		null,
		null);
    //
    beliefs__du_stag_ordered_prop_0_0[0] = beliefs.beliefs__du_functor_desc_prop_0_0;
    //
    beliefs__du_ptag_ordered_prop_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		beliefs.beliefs__du_stag_ordered_prop_0_0);
    //
    beliefs__du_name_ordered_prop_0[0] = beliefs.beliefs__du_functor_desc_prop_0_0;
    //
    beliefs__functor_number_map_prop_0[0] = 0;
    //
    beliefs__type_ctor_info_prop_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(24))),
		((java.lang.Object) (new AddrOf2_0(25))),
		"beliefs",
		"prop",
		new jmercury.runtime.TypeFunctors(beliefs.beliefs__du_name_ordered_prop_0),
		new jmercury.runtime.TypeLayout(beliefs.beliefs__du_ptag_ordered_prop_0),
		1,
		4,
		beliefs.beliefs__functor_number_map_prop_0);
    //
    beliefs__field_types_proposition_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    beliefs__field_types_proposition_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    beliefs__field_types_proposition_0_0[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    beliefs__du_functor_desc_proposition_0_0.init("pred",
		3,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		0,
		beliefs.beliefs__field_types_proposition_0_0,
		null,
		null,
		null);
    //
    beliefs__field_types_proposition_0_1[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    beliefs__field_types_proposition_0_1[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    beliefs__du_functor_desc_proposition_0_1.init("copula",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		beliefs.beliefs__field_types_proposition_0_1,
		null,
		null,
		null);
    //
    beliefs__du_stag_ordered_proposition_0_0[0] = beliefs.beliefs__du_functor_desc_proposition_0_0;
    beliefs__du_stag_ordered_proposition_0_0[1] = beliefs.beliefs__du_functor_desc_proposition_0_1;
    //
    beliefs__du_ptag_ordered_proposition_0[0] = new jmercury.runtime.DuPtagLayout(2,
		private_builtin.MR_SECTAG_REMOTE,
		beliefs.beliefs__du_stag_ordered_proposition_0_0);
    //
    beliefs__du_name_ordered_proposition_0[0] = beliefs.beliefs__du_functor_desc_proposition_0_1;
    beliefs__du_name_ordered_proposition_0[1] = beliefs.beliefs__du_functor_desc_proposition_0_0;
    //
    beliefs__functor_number_map_proposition_0[0] = 1;
    beliefs__functor_number_map_proposition_0[1] = 0;
    //
    beliefs__type_ctor_info_proposition_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(26))),
		((java.lang.Object) (new AddrOf2_0(27))),
		"beliefs",
		"proposition",
		new jmercury.runtime.TypeFunctors(beliefs.beliefs__du_name_ordered_proposition_0),
		new jmercury.runtime.TypeLayout(beliefs.beliefs__du_ptag_ordered_proposition_0),
		2,
		4,
		beliefs.beliefs__functor_number_map_proposition_0);
  }

// DataDefns
  static {
  }

// Scalar common data
  private static final jmercury.runtime.TypeInfo_Struct[] MR_scalar_common_1 = new jmercury.runtime.TypeInfo_Struct[10];
  private static void MR_init_scalars_0() {
    MR_scalar_common_1[0] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(set_ordlist.set_ordlist__type_ctor_info_set_ordlist_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0))));
    MR_scalar_common_1[1] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_belstmnt_0))));
    MR_scalar_common_1[2] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_prop_0))));
    MR_scalar_common_1[3] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_belmod_0))));
    MR_scalar_common_1[4] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_beltriple_0))));
    MR_scalar_common_1[5] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(maybe.maybe__type_ctor_info_maybe_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_belstr_0))));
    MR_scalar_common_1[6] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_envmod_0))));
    MR_scalar_common_1[7] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_envtriple_0))));
    MR_scalar_common_1[8] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(tree234.tree234__type_ctor_info_tree234_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.MR_scalar_common_1[6]))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.MR_scalar_common_1[7]))));
    MR_scalar_common_1[9] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(maybe.maybe__type_ctor_info_maybe_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0))));
  }
  static {
    MR_init_scalars_0();
  }

// Vector common data
//  beliefs.m:30
  private static final class Vector_common_type_2_0
  {
    public final java.lang.String vct_2_f_0;
    public final int vct_2_f_1;

    public Vector_common_type_2_0(
      java.lang.String vct_2_f_0,
      int vct_2_f_1)
    {
      {
        this.vct_2_f_0 = vct_2_f_0;
        this.vct_2_f_1 = vct_2_f_1;
      }
    }
  }

  private static final beliefs.Vector_common_type_2_0 MR_vector_common_2[] = {
    new beliefs.Vector_common_type_2_0("assume",
		0),
		new beliefs.Vector_common_type_2_0("believe",
		1),
		new beliefs.Vector_common_type_2_0("know",
		2),
		new beliefs.Vector_common_type_2_0("presume",
		3),
		new beliefs.Vector_common_type_2_0("think",
		4)
  };

// NonDataDefns
  private static boolean __Unify____belfile_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = beliefs.__Unify____belfile_0_0(((beliefs.Belfile_0) wrapper_arg_1), ((beliefs.Belfile_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____belfile_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = beliefs.__Compare____belfile_0_0(((beliefs.Belfile_0) wrapper_arg_2), ((beliefs.Belfile_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____belief_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = beliefs.__Unify____belief_0_0(((beliefs.Belief_0) wrapper_arg_1), ((beliefs.Belief_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____belief_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = beliefs.__Compare____belief_0_0(((beliefs.Belief_0) wrapper_arg_2), ((beliefs.Belief_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____belmod_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = beliefs.__Unify____belmod_0_0(((beliefs.Belmod_0) wrapper_arg_1), ((beliefs.Belmod_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____belmod_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = beliefs.__Compare____belmod_0_0(((beliefs.Belmod_0) wrapper_arg_2), ((beliefs.Belmod_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____belstmnt_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = beliefs.__Unify____belstmnt_0_0(((beliefs.Belstmnt_0) wrapper_arg_1), ((beliefs.Belstmnt_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____belstmnt_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = beliefs.__Compare____belstmnt_0_0(((beliefs.Belstmnt_0) wrapper_arg_2), ((beliefs.Belstmnt_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____belstr_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = beliefs.__Unify____belstr_0_0(((beliefs.Belstr_0) wrapper_arg_1), ((beliefs.Belstr_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____belstr_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = beliefs.__Compare____belstr_0_0(((beliefs.Belstr_0) wrapper_arg_2), ((beliefs.Belstr_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____beltriple_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = beliefs.__Unify____beltriple_0_0(((beliefs.Beltriple_0) wrapper_arg_1), ((beliefs.Beltriple_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____beltriple_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = beliefs.__Compare____beltriple_0_0(((beliefs.Beltriple_0) wrapper_arg_2), ((beliefs.Beltriple_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____bstrtp_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = beliefs.__Unify____bstrtp_0_0(((beliefs.Bstrtp_0) wrapper_arg_1), ((beliefs.Bstrtp_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____bstrtp_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = beliefs.__Compare____bstrtp_0_0(((beliefs.Bstrtp_0) wrapper_arg_2), ((beliefs.Bstrtp_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____envdata_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = beliefs.__Unify____envdata_0_0(((beliefs.Envdata_0) wrapper_arg_1), ((beliefs.Envdata_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____envdata_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = beliefs.__Compare____envdata_0_0(((beliefs.Envdata_0) wrapper_arg_2), ((beliefs.Envdata_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____envmap_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = beliefs.__Unify____envmap_0_0(((tree234.Tree234_2) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____envmap_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = beliefs.__Compare____envmap_0_0(((tree234.Tree234_2) wrapper_arg_2), ((tree234.Tree234_2) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____envmod_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = beliefs.__Unify____envmod_0_0(((beliefs.Envmod_0) wrapper_arg_1), ((beliefs.Envmod_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____envmod_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = beliefs.__Compare____envmod_0_0(((beliefs.Envmod_0) wrapper_arg_2), ((beliefs.Envmod_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____envtriple_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = beliefs.__Unify____envtriple_0_0(((beliefs.Envtriple_0) wrapper_arg_1), ((beliefs.Envtriple_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____envtriple_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = beliefs.__Compare____envtriple_0_0(((beliefs.Envtriple_0) wrapper_arg_2), ((beliefs.Envtriple_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____modality_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = beliefs.__Unify____modality_0_0();
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____modality_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = beliefs.__Compare____modality_0_0();
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____prop_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = beliefs.__Unify____prop_0_0(((beliefs.Prop_0) wrapper_arg_1), ((beliefs.Prop_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____prop_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = beliefs.__Compare____prop_0_0(((beliefs.Prop_0) wrapper_arg_2), ((beliefs.Prop_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____proposition_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = beliefs.__Unify____proposition_0_0(((beliefs.Proposition_0) wrapper_arg_1), ((beliefs.Proposition_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____proposition_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = beliefs.__Compare____proposition_0_0(((beliefs.Proposition_0) wrapper_arg_2), ((beliefs.Proposition_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static final class AddrOf2_0
    implements jmercury.runtime.MethodPtr2
  {
    public final int ptr_num;
    public /* generic_type */ java.lang.Object call___0_0(
      /* generic_type */ java.lang.Object arg1,
      /* generic_type */ java.lang.Object arg2)
    {
      switch (ptr_num) {
        case 0:
          {
            boolean return_value = false;

            {
              return_value = beliefs.__Unify____belfile_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 1:
          {
            java.lang.Object return_value = null;

            {
              return_value = beliefs.__Compare____belfile_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 2:
          {
            boolean return_value = false;

            {
              return_value = beliefs.__Unify____belief_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 3:
          {
            java.lang.Object return_value = null;

            {
              return_value = beliefs.__Compare____belief_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 4:
          {
            boolean return_value = false;

            {
              return_value = beliefs.__Unify____belmod_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 5:
          {
            java.lang.Object return_value = null;

            {
              return_value = beliefs.__Compare____belmod_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 6:
          {
            boolean return_value = false;

            {
              return_value = beliefs.__Unify____belstmnt_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 7:
          {
            java.lang.Object return_value = null;

            {
              return_value = beliefs.__Compare____belstmnt_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 8:
          {
            boolean return_value = false;

            {
              return_value = beliefs.__Unify____belstr_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 9:
          {
            java.lang.Object return_value = null;

            {
              return_value = beliefs.__Compare____belstr_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 10:
          {
            boolean return_value = false;

            {
              return_value = beliefs.__Unify____beltriple_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 11:
          {
            java.lang.Object return_value = null;

            {
              return_value = beliefs.__Compare____beltriple_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 12:
          {
            boolean return_value = false;

            {
              return_value = beliefs.__Unify____bstrtp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 13:
          {
            java.lang.Object return_value = null;

            {
              return_value = beliefs.__Compare____bstrtp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 14:
          {
            boolean return_value = false;

            {
              return_value = beliefs.__Unify____envdata_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 15:
          {
            java.lang.Object return_value = null;

            {
              return_value = beliefs.__Compare____envdata_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 16:
          {
            boolean return_value = false;

            {
              return_value = beliefs.__Unify____envmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 17:
          {
            java.lang.Object return_value = null;

            {
              return_value = beliefs.__Compare____envmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 18:
          {
            boolean return_value = false;

            {
              return_value = beliefs.__Unify____envmod_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 19:
          {
            java.lang.Object return_value = null;

            {
              return_value = beliefs.__Compare____envmod_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 20:
          {
            boolean return_value = false;

            {
              return_value = beliefs.__Unify____envtriple_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 21:
          {
            java.lang.Object return_value = null;

            {
              return_value = beliefs.__Compare____envtriple_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 22:
          {
            boolean return_value = false;

            {
              return_value = beliefs.__Unify____modality_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 23:
          {
            java.lang.Object return_value = null;

            {
              return_value = beliefs.__Compare____modality_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 24:
          {
            boolean return_value = false;

            {
              return_value = beliefs.__Unify____prop_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 25:
          {
            java.lang.Object return_value = null;

            {
              return_value = beliefs.__Compare____prop_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 26:
          {
            boolean return_value = false;

            {
              return_value = beliefs.__Unify____proposition_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 27:
          {
            java.lang.Object return_value = null;

            {
              return_value = beliefs.__Compare____proposition_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
    }

    public AddrOf2_0(
      int ptr_num)
    {
      this.ptr_num = ptr_num;
    }
  }

//  beliefs.m:10
  public static class Belfile_0
    implements jmercury.runtime.MercuryType
  {
    public java.lang.String F1;
    public set_ordlist.Set_ordlist_1<java.lang.String> F2;
    public list.List_1<beliefs.Belstmnt_0> F3;

    public Belfile_0()
    {
      {
      }
    }
    public Belfile_0(
      java.lang.String F1,
      set_ordlist.Set_ordlist_1<java.lang.String> F2,
      list.List_1<beliefs.Belstmnt_0> F3)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
      }
    }
  }

//  beliefs.m:7
  public static class Belief_0
    implements jmercury.runtime.MercuryType
  {
    public java.lang.String F1;
    public list.List_1<beliefs.Prop_0> F2;

    public Belief_0()
    {
      {
      }
    }
    public Belief_0(
      java.lang.String F1,
      list.List_1<beliefs.Prop_0> F2)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
      }
    }
  }

//  beliefs.m:12
  public static class Belmod_0
    implements jmercury.runtime.MercuryType
  {
    public beliefs.Belstr_0 F1;
    public bool.Bool_0 F2;
    public beliefs.Modality_0 F3;

    public Belmod_0()
    {
      {
      }
    }
    public Belmod_0(
      beliefs.Belstr_0 F1,
      bool.Bool_0 F2,
      beliefs.Modality_0 F3)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
      }
    }
  }

//  beliefs.m:11
  public static class Belstmnt_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Embedded_2
      extends beliefs.Belstmnt_0
    {
      public list.List_1<beliefs.Belmod_0> F1;
      public list.List_1<beliefs.Beltriple_0> F2;

      public Embedded_2()
      {
        {
        }
      }
      public Embedded_2(
        list.List_1<beliefs.Belmod_0> F1,
        list.List_1<beliefs.Beltriple_0> F2)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class One_1
      extends beliefs.Belstmnt_0
    {
      public beliefs.Beltriple_0 F1;

      public One_1()
      {
        {
        }
      }
      public One_1(
        beliefs.Beltriple_0 F1)
      {
        {
          (this).data_tag = 0;
          this.F1 = F1;
        }
      }
    }


  }

//  beliefs.m:14
  public static class Belstr_0
    implements jmercury.runtime.MercuryType
  {
    public java.lang.String F1;
    public beliefs.Bstrtp_0 F2;

    public Belstr_0()
    {
      {
      }
    }
    public Belstr_0(
      java.lang.String F1,
      beliefs.Bstrtp_0 F2)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
      }
    }
  }

//  beliefs.m:13
  public static class Beltriple_0
    implements jmercury.runtime.MercuryType
  {
    public int F1;
    public java.lang.String F2;
    public beliefs.Belstr_0 F3;
    public bool.Bool_0 F4;
    public beliefs.Belstr_0 F5;
    public maybe.Maybe_1<beliefs.Belstr_0> F6;

    public Beltriple_0()
    {
      {
      }
    }
    public Beltriple_0(
      int F1,
      java.lang.String F2,
      beliefs.Belstr_0 F3,
      bool.Bool_0 F4,
      beliefs.Belstr_0 F5,
      maybe.Maybe_1<beliefs.Belstr_0> F6)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
        this.F4 = F4;
        this.F5 = F5;
        this.F6 = F6;
      }
    }
  }

//  beliefs.m:15
  public static class Bstrtp_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Coref_0
      extends beliefs.Bstrtp_0
    {

      public Coref_0()
      {
        {
          (this).data_tag = 3;
        }
      }
    }

    public static class Unrecognised_0
      extends beliefs.Bstrtp_0
    {

      public Unrecognised_0()
      {
        {
          (this).data_tag = 2;
        }
      }
    }

    public static class Pp_0
      extends beliefs.Bstrtp_0
    {

      public Pp_0()
      {
        {
          (this).data_tag = 1;
        }
      }
    }

    public static class Pronoun_1
      extends beliefs.Bstrtp_0
    {
      public wordnet.Prontp_0 F1;

      public Pronoun_1()
      {
        {
        }
      }
      public Pronoun_1(
        wordnet.Prontp_0 F1)
      {
        {
          (this).data_tag = 4;
          this.F1 = F1;
        }
      }
    }

    public static class Wordnet_0
      extends beliefs.Bstrtp_0
    {

      public Wordnet_0()
      {
        {
          (this).data_tag = 0;
        }
      }
    }


  }

//  beliefs.m:17
  public static class Envdata_0
    implements jmercury.runtime.MercuryType
  {
    public tree234.Tree234_2<list.List_1<beliefs.Envmod_0>, list.List_1<beliefs.Envtriple_0>> F1;

    public Envdata_0()
    {
      {
      }
    }
    public Envdata_0(
      tree234.Tree234_2<list.List_1<beliefs.Envmod_0>, list.List_1<beliefs.Envtriple_0>> F1)
    {
      {
        this.F1 = F1;
      }
    }
  }

//  beliefs.m:19
  public static class Envmod_0
    implements jmercury.runtime.MercuryType
  {
    public java.lang.String F1;
    public bool.Bool_0 F2;
    public beliefs.Modality_0 F3;

    public Envmod_0()
    {
      {
      }
    }
    public Envmod_0(
      java.lang.String F1,
      bool.Bool_0 F2,
      beliefs.Modality_0 F3)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
      }
    }
  }

//  beliefs.m:20
  public static class Envtriple_0
    implements jmercury.runtime.MercuryType
  {
    public java.lang.String F1;
    public int F2;
    public java.lang.String F3;
    public bool.Bool_0 F4;
    public java.lang.String F5;
    public maybe.Maybe_1<java.lang.String> F6;

    public Envtriple_0()
    {
      {
      }
    }
    public Envtriple_0(
      java.lang.String F1,
      int F2,
      java.lang.String F3,
      bool.Bool_0 F4,
      java.lang.String F5,
      maybe.Maybe_1<java.lang.String> F6)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
        this.F4 = F4;
        this.F5 = F5;
        this.F6 = F6;
      }
    }
  }

//  beliefs.m:22
  public static class Modality_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Modality_0 K0 = new Modality_0(0);  /* belief */

      private Modality_0(int val) {
        super(val);
      }

  }

//  beliefs.m:8
  public static class Prop_0
    implements jmercury.runtime.MercuryType
  {
    public java.lang.String F1;
    public java.lang.String F2;
    public java.lang.String F3;

    public Prop_0()
    {
      {
      }
    }
    public Prop_0(
      java.lang.String F1,
      java.lang.String F2,
      java.lang.String F3)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
      }
    }
  }

//  beliefs.m:24
  public static class Proposition_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Copula_2
      extends beliefs.Proposition_0
    {
      public java.lang.String F1;
      public java.lang.String F2;

      public Copula_2()
      {
        {
        }
      }
      public Copula_2(
        java.lang.String F1,
        java.lang.String F2)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Pred_3
      extends beliefs.Proposition_0
    {
      public java.lang.String F1;
      public java.lang.String F2;
      public java.lang.String F3;

      public Pred_3()
      {
        {
        }
      }
      public Pred_3(
        java.lang.String F1,
        java.lang.String F2,
        java.lang.String F3)
      {
        {
          (this).data_tag = 0;
          this.F1 = F1;
          this.F2 = F2;
          this.F3 = F3;
        }
      }
    }


  }

  public static builtin.Comparison_result_0 __Compare____proposition_0_0(
    beliefs.Proposition_0 HeadVar__2_2,
    beliefs.Proposition_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_27 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_28 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_27 == CastY_28);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        if ((HeadVar__2_2.data_tag == 1))
          {
            java.lang.String V_34_34 = ((beliefs.Proposition_0.Copula_2) HeadVar__2_2).F2;
            java.lang.String V_35_35 = ((beliefs.Proposition_0.Copula_2) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 1))
              {
                java.lang.String V_24_24 = ((beliefs.Proposition_0.Copula_2) HeadVar__3_3).F1;
                java.lang.String V_25_25 = ((beliefs.Proposition_0.Copula_2) HeadVar__3_3).F2;
                builtin.Comparison_result_0 V_26_26 = null;

                {
                  V_26_26 = private_builtin.builtin_compare_string_3_p_0(V_35_35, V_24_24);
                }
                succeeded = (V_26_26.MR_value == builtin.Comparison_result_0.K0.MR_value);
                succeeded = !(succeeded);
                if (succeeded)
                  HeadVar__1_1 = V_26_26;
                else
                  {
                    HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_34_34, V_25_25);
                  }
              }
            else
              HeadVar__1_1 = builtin.Comparison_result_0.K2;
          }
        else
          {
            java.lang.String V_36_36 = ((beliefs.Proposition_0.Pred_3) HeadVar__2_2).F3;
            java.lang.String V_37_37 = ((beliefs.Proposition_0.Pred_3) HeadVar__2_2).F2;
            java.lang.String V_38_38 = ((beliefs.Proposition_0.Pred_3) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 1))
              HeadVar__1_1 = builtin.Comparison_result_0.K1;
            else
              {
                java.lang.String V_7_7 = ((beliefs.Proposition_0.Pred_3) HeadVar__3_3).F1;
                java.lang.String V_8_8 = ((beliefs.Proposition_0.Pred_3) HeadVar__3_3).F2;
                java.lang.String V_9_9 = ((beliefs.Proposition_0.Pred_3) HeadVar__3_3).F3;
                builtin.Comparison_result_0 V_10_10 = null;

                {
                  V_10_10 = private_builtin.builtin_compare_string_3_p_0(V_38_38, V_7_7);
                }
                succeeded = (V_10_10.MR_value == builtin.Comparison_result_0.K0.MR_value);
                succeeded = !(succeeded);
                if (succeeded)
                  HeadVar__1_1 = V_10_10;
                else
                  {
                    builtin.Comparison_result_0 V_11_11 = null;

                    {
                      V_11_11 = private_builtin.builtin_compare_string_3_p_0(V_37_37, V_8_8);
                    }
                    succeeded = (V_11_11.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_11_11;
                    else
                      {
                        HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_36_36, V_9_9);
                      }
                  }
              }
          }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____proposition_0_0(
    beliefs.Proposition_0 HeadVar__1_1,
    beliefs.Proposition_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_13 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_14 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_13 == CastY_14);
      if (succeeded)
        succeeded = true;
      else
        if ((HeadVar__1_1.data_tag == 1))
          {
            java.lang.String V_9_9 = ((beliefs.Proposition_0.Copula_2) HeadVar__1_1).F1;
            java.lang.String V_10_10 = ((beliefs.Proposition_0.Copula_2) HeadVar__1_1).F2;
            java.lang.String V_11_11 = null;
            java.lang.String V_12_12 = null;

            succeeded = (HeadVar__2_2.data_tag == 1);
            if (succeeded)
              {
                V_11_11 = ((beliefs.Proposition_0.Copula_2) HeadVar__2_2).F1;
                V_12_12 = ((beliefs.Proposition_0.Copula_2) HeadVar__2_2).F2;
                succeeded = V_9_9.equals(V_11_11);
                if (succeeded)
                  succeeded = V_10_10.equals(V_12_12);
              }
          }
        else
          {
            java.lang.String V_3_3 = ((beliefs.Proposition_0.Pred_3) HeadVar__1_1).F1;
            java.lang.String V_4_4 = ((beliefs.Proposition_0.Pred_3) HeadVar__1_1).F2;
            java.lang.String V_5_5 = ((beliefs.Proposition_0.Pred_3) HeadVar__1_1).F3;
            java.lang.String V_6_6 = null;
            java.lang.String V_7_7 = null;
            java.lang.String V_8_8 = null;

            succeeded = (HeadVar__2_2.data_tag == 0);
            if (succeeded)
              {
                V_6_6 = ((beliefs.Proposition_0.Pred_3) HeadVar__2_2).F1;
                V_7_7 = ((beliefs.Proposition_0.Pred_3) HeadVar__2_2).F2;
                V_8_8 = ((beliefs.Proposition_0.Pred_3) HeadVar__2_2).F3;
                succeeded = V_3_3.equals(V_6_6);
                if (succeeded)
                  {
                    succeeded = V_4_4.equals(V_7_7);
                    if (succeeded)
                      succeeded = V_5_5.equals(V_8_8);
                  }
              }
          }
      return succeeded;
    }
  }
//  beliefs.m:8
  public static builtin.Comparison_result_0 __Compare____prop_0_0(
    beliefs.Prop_0 HeadVar__2_2,
    beliefs.Prop_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_12 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_13 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_12 == CastY_13);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        {
          java.lang.String V_4_4 = ((beliefs.Prop_0) HeadVar__2_2).F1;
          java.lang.String V_5_5 = ((beliefs.Prop_0) HeadVar__2_2).F2;
          java.lang.String V_6_6 = ((beliefs.Prop_0) HeadVar__2_2).F3;
          java.lang.String V_7_7 = ((beliefs.Prop_0) HeadVar__3_3).F1;
          java.lang.String V_8_8 = ((beliefs.Prop_0) HeadVar__3_3).F2;
          java.lang.String V_9_9 = ((beliefs.Prop_0) HeadVar__3_3).F3;
          builtin.Comparison_result_0 V_10_10 = null;

          {
            V_10_10 = private_builtin.builtin_compare_string_3_p_0(V_4_4, V_7_7);
          }
          succeeded = (V_10_10.MR_value == builtin.Comparison_result_0.K0.MR_value);
          succeeded = !(succeeded);
          if (succeeded)
            HeadVar__1_1 = V_10_10;
          else
            {
              builtin.Comparison_result_0 V_11_11 = null;

              {
                V_11_11 = private_builtin.builtin_compare_string_3_p_0(V_5_5, V_8_8);
              }
              succeeded = (V_11_11.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_11_11;
              else
                {
                  HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_6_6, V_9_9);
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____prop_0_0(
    beliefs.Prop_0 HeadVar__1_1,
    beliefs.Prop_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_9 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_10 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_9 == CastY_10);
      if (succeeded)
        succeeded = true;
      else
        {
          java.lang.String V_3_3 = ((beliefs.Prop_0) HeadVar__1_1).F1;
          java.lang.String V_4_4 = ((beliefs.Prop_0) HeadVar__1_1).F2;
          java.lang.String V_5_5 = ((beliefs.Prop_0) HeadVar__1_1).F3;
          java.lang.String V_6_6 = ((beliefs.Prop_0) HeadVar__2_2).F1;
          java.lang.String V_7_7 = ((beliefs.Prop_0) HeadVar__2_2).F2;
          java.lang.String V_8_8 = ((beliefs.Prop_0) HeadVar__2_2).F3;

          succeeded = V_3_3.equals(V_6_6);
          if (succeeded)
            {
              succeeded = V_4_4.equals(V_7_7);
              if (succeeded)
                succeeded = V_5_5.equals(V_8_8);
            }
        }
      return succeeded;
    }
  }
//  beliefs.m:22
  public static builtin.Comparison_result_0 __Compare____modality_0_0()
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = builtin.Comparison_result_0.K0;

      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____modality_0_0()
  {
    {
      boolean succeeded = true;

      return succeeded;
    }
  }
//  beliefs.m:20
  public static builtin.Comparison_result_0 __Compare____envtriple_0_0(
    beliefs.Envtriple_0 HeadVar__2_2,
    beliefs.Envtriple_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_21 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_22 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_21 == CastY_22);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        {
          java.lang.String V_4_4 = ((beliefs.Envtriple_0) HeadVar__2_2).F1;
          int V_5_5 = ((beliefs.Envtriple_0) HeadVar__2_2).F2;
          java.lang.String V_6_6 = ((beliefs.Envtriple_0) HeadVar__2_2).F3;
          bool.Bool_0 V_7_7 = ((beliefs.Envtriple_0) HeadVar__2_2).F4;
          java.lang.String V_8_8 = ((beliefs.Envtriple_0) HeadVar__2_2).F5;
          maybe.Maybe_1 V_9_9 = ((beliefs.Envtriple_0) HeadVar__2_2).F6;
          java.lang.String V_10_10 = ((beliefs.Envtriple_0) HeadVar__3_3).F1;
          int V_11_11 = ((beliefs.Envtriple_0) HeadVar__3_3).F2;
          java.lang.String V_12_12 = ((beliefs.Envtriple_0) HeadVar__3_3).F3;
          bool.Bool_0 V_13_13 = ((beliefs.Envtriple_0) HeadVar__3_3).F4;
          java.lang.String V_14_14 = ((beliefs.Envtriple_0) HeadVar__3_3).F5;
          maybe.Maybe_1 V_15_15 = ((beliefs.Envtriple_0) HeadVar__3_3).F6;
          builtin.Comparison_result_0 V_16_16 = null;

          {
            V_16_16 = private_builtin.builtin_compare_string_3_p_0(V_4_4, V_10_10);
          }
          succeeded = (V_16_16.MR_value == builtin.Comparison_result_0.K0.MR_value);
          succeeded = !(succeeded);
          if (succeeded)
            HeadVar__1_1 = V_16_16;
          else
            {
              builtin.Comparison_result_0 V_17_17 = null;

              {
                V_17_17 = private_builtin.builtin_compare_int_3_p_0(V_5_5, V_11_11);
              }
              succeeded = (V_17_17.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_17_17;
              else
                {
                  builtin.Comparison_result_0 V_18_18 = null;

                  {
                    V_18_18 = private_builtin.builtin_compare_string_3_p_0(V_6_6, V_12_12);
                  }
                  succeeded = (V_18_18.MR_value == builtin.Comparison_result_0.K0.MR_value);
                  succeeded = !(succeeded);
                  if (succeeded)
                    HeadVar__1_1 = V_18_18;
                  else
                    {
                      builtin.Comparison_result_0 V_19_19 = null;
                      int V_29_29 = (int) V_7_7.MR_value;
                      int V_30_30 = (int) V_13_13.MR_value;

                      {
                        V_19_19 = private_builtin.builtin_compare_int_3_p_0(V_29_29, V_30_30);
                      }
                      succeeded = (V_19_19.MR_value == builtin.Comparison_result_0.K0.MR_value);
                      succeeded = !(succeeded);
                      if (succeeded)
                        HeadVar__1_1 = V_19_19;
                      else
                        {
                          builtin.Comparison_result_0 V_20_20 = null;

                          {
                            V_20_20 = private_builtin.builtin_compare_string_3_p_0(V_8_8, V_14_14);
                          }
                          succeeded = (V_20_20.MR_value == builtin.Comparison_result_0.K0.MR_value);
                          succeeded = !(succeeded);
                          if (succeeded)
                            HeadVar__1_1 = V_20_20;
                          else
                            {
                              jmercury.runtime.TypeInfo_Struct TypeInfo_28_28 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.MR_scalar_common_1[9]);

                              {
                                HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_28_28, ((java.lang.Object) (V_9_9)), ((java.lang.Object) (V_15_15)));
                              }
                            }
                        }
                    }
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____envtriple_0_0(
    beliefs.Envtriple_0 HeadVar__1_1,
    beliefs.Envtriple_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_15 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_16 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_15 == CastY_16);
      if (succeeded)
        succeeded = true;
      else
        {
          jmercury.runtime.TypeInfo_Struct TypeInfo_17_17 = null;
          java.lang.String V_3_3 = ((beliefs.Envtriple_0) HeadVar__1_1).F1;
          int V_4_4 = ((beliefs.Envtriple_0) HeadVar__1_1).F2;
          java.lang.String V_5_5 = ((beliefs.Envtriple_0) HeadVar__1_1).F3;
          bool.Bool_0 V_6_6 = ((beliefs.Envtriple_0) HeadVar__1_1).F4;
          java.lang.String V_7_7 = ((beliefs.Envtriple_0) HeadVar__1_1).F5;
          maybe.Maybe_1 V_8_8 = ((beliefs.Envtriple_0) HeadVar__1_1).F6;
          java.lang.String V_9_9 = ((beliefs.Envtriple_0) HeadVar__2_2).F1;
          int V_10_10 = ((beliefs.Envtriple_0) HeadVar__2_2).F2;
          java.lang.String V_11_11 = ((beliefs.Envtriple_0) HeadVar__2_2).F3;
          bool.Bool_0 V_12_12 = ((beliefs.Envtriple_0) HeadVar__2_2).F4;
          java.lang.String V_13_13 = ((beliefs.Envtriple_0) HeadVar__2_2).F5;
          maybe.Maybe_1 V_14_14 = ((beliefs.Envtriple_0) HeadVar__2_2).F6;

          succeeded = V_3_3.equals(V_9_9);
          if (succeeded)
            {
              succeeded = (V_4_4 == V_10_10);
              if (succeeded)
                {
                  succeeded = V_5_5.equals(V_11_11);
                  if (succeeded)
                    {
                      succeeded = (V_6_6.MR_value == V_12_12.MR_value);
                      if (succeeded)
                        {
                          succeeded = V_7_7.equals(V_13_13);
                          if (succeeded)
                            {
                              TypeInfo_17_17 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.MR_scalar_common_1[9]);
                              {
                                succeeded = builtin.unify_2_p_0(TypeInfo_17_17, ((java.lang.Object) (V_8_8)), ((java.lang.Object) (V_14_14)));
                              }
                            }
                        }
                    }
                }
            }
        }
      return succeeded;
    }
  }
//  beliefs.m:19
  public static builtin.Comparison_result_0 __Compare____envmod_0_0(
    beliefs.Envmod_0 HeadVar__2_2,
    beliefs.Envmod_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_12 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_13 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_12 == CastY_13);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        {
          java.lang.String V_4_4 = ((beliefs.Envmod_0) HeadVar__2_2).F1;
          bool.Bool_0 V_5_5 = ((beliefs.Envmod_0) HeadVar__2_2).F2;
          java.lang.String V_7_7 = ((beliefs.Envmod_0) HeadVar__3_3).F1;
          bool.Bool_0 V_8_8 = ((beliefs.Envmod_0) HeadVar__3_3).F2;
          builtin.Comparison_result_0 V_10_10 = null;

          {
            V_10_10 = private_builtin.builtin_compare_string_3_p_0(V_4_4, V_7_7);
          }
          succeeded = (V_10_10.MR_value == builtin.Comparison_result_0.K0.MR_value);
          succeeded = !(succeeded);
          if (succeeded)
            HeadVar__1_1 = V_10_10;
          else
            {
              builtin.Comparison_result_0 V_11_11 = null;
              int V_16_16 = (int) V_5_5.MR_value;
              int V_17_17 = (int) V_8_8.MR_value;

              {
                V_11_11 = private_builtin.builtin_compare_int_3_p_0(V_16_16, V_17_17);
              }
              succeeded = (V_11_11.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_11_11;
              else
                HeadVar__1_1 = builtin.Comparison_result_0.K0;
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____envmod_0_0(
    beliefs.Envmod_0 HeadVar__1_1,
    beliefs.Envmod_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_9 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_10 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_9 == CastY_10);
      if (succeeded)
        succeeded = true;
      else
        {
          java.lang.String V_3_3 = ((beliefs.Envmod_0) HeadVar__1_1).F1;
          bool.Bool_0 V_4_4 = ((beliefs.Envmod_0) HeadVar__1_1).F2;
          java.lang.String V_6_6 = ((beliefs.Envmod_0) HeadVar__2_2).F1;
          bool.Bool_0 V_7_7 = ((beliefs.Envmod_0) HeadVar__2_2).F2;

          succeeded = V_3_3.equals(V_6_6);
          if (succeeded)
            succeeded = (V_4_4.MR_value == V_7_7.MR_value);
        }
      return succeeded;
    }
  }
//  beliefs.m:18
  public static builtin.Comparison_result_0 __Compare____envmap_0_0(
    tree234.Tree234_2 HeadVar__2_2,
    tree234.Tree234_2 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.MR_scalar_common_1[8]);
      tree234.Tree234_2 Cast_HeadVar1_4 = HeadVar__2_2;
      tree234.Tree234_2 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____envmap_0_0(
    tree234.Tree234_2 HeadVar__1_1,
    tree234.Tree234_2 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.MR_scalar_common_1[8]);
      tree234.Tree234_2 Cast_HeadVar1_3 = HeadVar__1_1;
      tree234.Tree234_2 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  beliefs.m:17
  public static builtin.Comparison_result_0 __Compare____envdata_0_0(
    beliefs.Envdata_0 HeadVar__2_2,
    beliefs.Envdata_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_6 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_7 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_6 == CastY_7);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        {
          jmercury.runtime.TypeInfo_Struct TypeInfo_8_8 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.MR_scalar_common_1[8]);
          tree234.Tree234_2 V_4_4 = ((beliefs.Envdata_0) HeadVar__2_2).F1;
          tree234.Tree234_2 V_5_5 = ((beliefs.Envdata_0) HeadVar__3_3).F1;

          {
            HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_8_8, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_5_5)));
          }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____envdata_0_0(
    beliefs.Envdata_0 HeadVar__1_1,
    beliefs.Envdata_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_5 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_6 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_5 == CastY_6);
      if (succeeded)
        succeeded = true;
      else
        {
          jmercury.runtime.TypeInfo_Struct TypeInfo_7_7 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.MR_scalar_common_1[8]);
          tree234.Tree234_2 V_3_3 = ((beliefs.Envdata_0) HeadVar__1_1).F1;
          tree234.Tree234_2 V_4_4 = ((beliefs.Envdata_0) HeadVar__2_2).F1;

          {
            succeeded = builtin.unify_2_p_0(TypeInfo_7_7, ((java.lang.Object) (V_3_3)), ((java.lang.Object) (V_4_4)));
          }
        }
      return succeeded;
    }
  }
//  beliefs.m:15
  public static builtin.Comparison_result_0 __Compare____bstrtp_0_0(
    beliefs.Bstrtp_0 HeadVar__2_2,
    beliefs.Bstrtp_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_14 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_15 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_14 == CastY_15);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        switch (HeadVar__2_2.data_tag) {
          case 0:
            switch (HeadVar__3_3.data_tag) {
              case 0:
                HeadVar__1_1 = builtin.Comparison_result_0.K0;
                break;
              case 1:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 2:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 3:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 4:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              default: /*NOTREACHED*/
                throw new jmercury.runtime.UnreachableDefault();
            }
            break;
          case 1:
            switch (HeadVar__3_3.data_tag) {
              case 0:
                HeadVar__1_1 = builtin.Comparison_result_0.K2;
                break;
              case 1:
                HeadVar__1_1 = builtin.Comparison_result_0.K0;
                break;
              case 2:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 3:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 4:
                HeadVar__1_1 = builtin.Comparison_result_0.K2;
                break;
              default: /*NOTREACHED*/
                throw new jmercury.runtime.UnreachableDefault();
            }
            break;
          case 2:
            switch (HeadVar__3_3.data_tag) {
              case 0:
                HeadVar__1_1 = builtin.Comparison_result_0.K2;
                break;
              case 1:
                HeadVar__1_1 = builtin.Comparison_result_0.K2;
                break;
              case 2:
                HeadVar__1_1 = builtin.Comparison_result_0.K0;
                break;
              case 3:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 4:
                HeadVar__1_1 = builtin.Comparison_result_0.K2;
                break;
              default: /*NOTREACHED*/
                throw new jmercury.runtime.UnreachableDefault();
            }
            break;
          case 3:
            switch (HeadVar__3_3.data_tag) {
              case 0:
                HeadVar__1_1 = builtin.Comparison_result_0.K2;
                break;
              case 1:
                HeadVar__1_1 = builtin.Comparison_result_0.K2;
                break;
              case 2:
                HeadVar__1_1 = builtin.Comparison_result_0.K2;
                break;
              case 3:
                HeadVar__1_1 = builtin.Comparison_result_0.K0;
                break;
              case 4:
                HeadVar__1_1 = builtin.Comparison_result_0.K2;
                break;
              default: /*NOTREACHED*/
                throw new jmercury.runtime.UnreachableDefault();
            }
            break;
          case 4:
            {
              wordnet.Prontp_0 V_17_17 = ((beliefs.Bstrtp_0.Pronoun_1) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 1:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 2:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 3:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 4:
                  {
                    wordnet.Prontp_0 V_7_7 = ((beliefs.Bstrtp_0.Pronoun_1) HeadVar__3_3).F1;
                    int V_18_18 = (int) V_17_17.MR_value;
                    int V_19_19 = (int) V_7_7.MR_value;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_18_18, V_19_19);
                    }
                  }
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          default: /*NOTREACHED*/
            throw new jmercury.runtime.UnreachableDefault();
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____bstrtp_0_0(
    beliefs.Bstrtp_0 HeadVar__1_1,
    beliefs.Bstrtp_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_5 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_6 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_5 == CastY_6);
      if (succeeded)
        succeeded = true;
      else
        switch (HeadVar__1_1.data_tag) {
          case 0:
            succeeded = (HeadVar__2_2.data_tag == 0);
            break;
          case 1:
            succeeded = (HeadVar__2_2.data_tag == 1);
            break;
          case 2:
            succeeded = (HeadVar__2_2.data_tag == 2);
            break;
          case 3:
            succeeded = (HeadVar__2_2.data_tag == 3);
            break;
          case 4:
            {
              wordnet.Prontp_0 V_3_3 = ((beliefs.Bstrtp_0.Pronoun_1) HeadVar__1_1).F1;
              wordnet.Prontp_0 V_4_4 = null;

              succeeded = (HeadVar__2_2.data_tag == 4);
              if (succeeded)
                {
                  V_4_4 = ((beliefs.Bstrtp_0.Pronoun_1) HeadVar__2_2).F1;
                  succeeded = (V_3_3.MR_value == V_4_4.MR_value);
                }
            }
            break;
          default: /*NOTREACHED*/
            throw new jmercury.runtime.UnreachableDefault();
        }
      return succeeded;
    }
  }
//  beliefs.m:13
  public static builtin.Comparison_result_0 __Compare____beltriple_0_0(
    beliefs.Beltriple_0 HeadVar__2_2,
    beliefs.Beltriple_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_21 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_22 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_21 == CastY_22);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        {
          int V_4_4 = ((beliefs.Beltriple_0) HeadVar__2_2).F1;
          java.lang.String V_5_5 = ((beliefs.Beltriple_0) HeadVar__2_2).F2;
          beliefs.Belstr_0 V_6_6 = ((beliefs.Beltriple_0) HeadVar__2_2).F3;
          bool.Bool_0 V_7_7 = ((beliefs.Beltriple_0) HeadVar__2_2).F4;
          beliefs.Belstr_0 V_8_8 = ((beliefs.Beltriple_0) HeadVar__2_2).F5;
          maybe.Maybe_1 V_9_9 = ((beliefs.Beltriple_0) HeadVar__2_2).F6;
          int V_10_10 = ((beliefs.Beltriple_0) HeadVar__3_3).F1;
          java.lang.String V_11_11 = ((beliefs.Beltriple_0) HeadVar__3_3).F2;
          beliefs.Belstr_0 V_12_12 = ((beliefs.Beltriple_0) HeadVar__3_3).F3;
          bool.Bool_0 V_13_13 = ((beliefs.Beltriple_0) HeadVar__3_3).F4;
          beliefs.Belstr_0 V_14_14 = ((beliefs.Beltriple_0) HeadVar__3_3).F5;
          maybe.Maybe_1 V_15_15 = ((beliefs.Beltriple_0) HeadVar__3_3).F6;
          builtin.Comparison_result_0 V_16_16 = null;

          {
            V_16_16 = private_builtin.builtin_compare_int_3_p_0(V_4_4, V_10_10);
          }
          succeeded = (V_16_16.MR_value == builtin.Comparison_result_0.K0.MR_value);
          succeeded = !(succeeded);
          if (succeeded)
            HeadVar__1_1 = V_16_16;
          else
            {
              builtin.Comparison_result_0 V_17_17 = null;

              {
                V_17_17 = private_builtin.builtin_compare_string_3_p_0(V_5_5, V_11_11);
              }
              succeeded = (V_17_17.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_17_17;
              else
                {
                  builtin.Comparison_result_0 V_18_18 = null;

                  {
                    V_18_18 = beliefs.__Compare____belstr_0_0(V_6_6, V_12_12);
                  }
                  succeeded = (V_18_18.MR_value == builtin.Comparison_result_0.K0.MR_value);
                  succeeded = !(succeeded);
                  if (succeeded)
                    HeadVar__1_1 = V_18_18;
                  else
                    {
                      builtin.Comparison_result_0 V_19_19 = null;
                      int V_29_29 = (int) V_7_7.MR_value;
                      int V_30_30 = (int) V_13_13.MR_value;

                      {
                        V_19_19 = private_builtin.builtin_compare_int_3_p_0(V_29_29, V_30_30);
                      }
                      succeeded = (V_19_19.MR_value == builtin.Comparison_result_0.K0.MR_value);
                      succeeded = !(succeeded);
                      if (succeeded)
                        HeadVar__1_1 = V_19_19;
                      else
                        {
                          builtin.Comparison_result_0 V_20_20 = null;

                          {
                            V_20_20 = beliefs.__Compare____belstr_0_0(V_8_8, V_14_14);
                          }
                          succeeded = (V_20_20.MR_value == builtin.Comparison_result_0.K0.MR_value);
                          succeeded = !(succeeded);
                          if (succeeded)
                            HeadVar__1_1 = V_20_20;
                          else
                            {
                              jmercury.runtime.TypeInfo_Struct TypeInfo_28_28 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.MR_scalar_common_1[5]);

                              {
                                HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_28_28, ((java.lang.Object) (V_9_9)), ((java.lang.Object) (V_15_15)));
                              }
                            }
                        }
                    }
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____beltriple_0_0(
    beliefs.Beltriple_0 HeadVar__1_1,
    beliefs.Beltriple_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_15 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_16 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_15 == CastY_16);
      if (succeeded)
        succeeded = true;
      else
        {
          jmercury.runtime.TypeInfo_Struct TypeInfo_17_17 = null;
          int V_3_3 = ((beliefs.Beltriple_0) HeadVar__1_1).F1;
          java.lang.String V_4_4 = ((beliefs.Beltriple_0) HeadVar__1_1).F2;
          beliefs.Belstr_0 V_5_5 = ((beliefs.Beltriple_0) HeadVar__1_1).F3;
          bool.Bool_0 V_6_6 = ((beliefs.Beltriple_0) HeadVar__1_1).F4;
          beliefs.Belstr_0 V_7_7 = ((beliefs.Beltriple_0) HeadVar__1_1).F5;
          maybe.Maybe_1 V_8_8 = ((beliefs.Beltriple_0) HeadVar__1_1).F6;
          int V_9_9 = ((beliefs.Beltriple_0) HeadVar__2_2).F1;
          java.lang.String V_10_10 = ((beliefs.Beltriple_0) HeadVar__2_2).F2;
          beliefs.Belstr_0 V_11_11 = ((beliefs.Beltriple_0) HeadVar__2_2).F3;
          bool.Bool_0 V_12_12 = ((beliefs.Beltriple_0) HeadVar__2_2).F4;
          beliefs.Belstr_0 V_13_13 = ((beliefs.Beltriple_0) HeadVar__2_2).F5;
          maybe.Maybe_1 V_14_14 = ((beliefs.Beltriple_0) HeadVar__2_2).F6;

          succeeded = (V_3_3 == V_9_9);
          if (succeeded)
            {
              succeeded = V_4_4.equals(V_10_10);
              if (succeeded)
                {
                  {
                    succeeded = beliefs.__Unify____belstr_0_0(V_5_5, V_11_11);
                  }
                  if (succeeded)
                    {
                      succeeded = (V_6_6.MR_value == V_12_12.MR_value);
                      if (succeeded)
                        {
                          {
                            succeeded = beliefs.__Unify____belstr_0_0(V_7_7, V_13_13);
                          }
                          if (succeeded)
                            {
                              TypeInfo_17_17 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.MR_scalar_common_1[5]);
                              {
                                succeeded = builtin.unify_2_p_0(TypeInfo_17_17, ((java.lang.Object) (V_8_8)), ((java.lang.Object) (V_14_14)));
                              }
                            }
                        }
                    }
                }
            }
        }
      return succeeded;
    }
  }
//  beliefs.m:14
  public static builtin.Comparison_result_0 __Compare____belstr_0_0(
    beliefs.Belstr_0 HeadVar__2_2,
    beliefs.Belstr_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_9 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_10 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_9 == CastY_10);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        {
          java.lang.String V_4_4 = ((beliefs.Belstr_0) HeadVar__2_2).F1;
          beliefs.Bstrtp_0 V_5_5 = ((beliefs.Belstr_0) HeadVar__2_2).F2;
          java.lang.String V_6_6 = ((beliefs.Belstr_0) HeadVar__3_3).F1;
          beliefs.Bstrtp_0 V_7_7 = ((beliefs.Belstr_0) HeadVar__3_3).F2;
          builtin.Comparison_result_0 V_8_8 = null;

          {
            V_8_8 = private_builtin.builtin_compare_string_3_p_0(V_4_4, V_6_6);
          }
          succeeded = (V_8_8.MR_value == builtin.Comparison_result_0.K0.MR_value);
          succeeded = !(succeeded);
          if (succeeded)
            HeadVar__1_1 = V_8_8;
          else
            {
              HeadVar__1_1 = beliefs.__Compare____bstrtp_0_0(V_5_5, V_7_7);
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____belstr_0_0(
    beliefs.Belstr_0 HeadVar__1_1,
    beliefs.Belstr_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_7 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_8 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_7 == CastY_8);
      if (succeeded)
        succeeded = true;
      else
        {
          java.lang.String V_3_3 = ((beliefs.Belstr_0) HeadVar__1_1).F1;
          beliefs.Bstrtp_0 V_4_4 = ((beliefs.Belstr_0) HeadVar__1_1).F2;
          java.lang.String V_5_5 = ((beliefs.Belstr_0) HeadVar__2_2).F1;
          beliefs.Bstrtp_0 V_6_6 = ((beliefs.Belstr_0) HeadVar__2_2).F2;

          succeeded = V_3_3.equals(V_5_5);
          if (succeeded)
            {
              succeeded = beliefs.__Unify____bstrtp_0_0(V_4_4, V_6_6);
            }
        }
      return succeeded;
    }
  }
//  beliefs.m:11
  public static builtin.Comparison_result_0 __Compare____belstmnt_0_0(
    beliefs.Belstmnt_0 HeadVar__2_2,
    beliefs.Belstmnt_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_17 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_18 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_17 == CastY_18);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        if ((HeadVar__2_2.data_tag == 1))
          {
            list.List_1 V_22_22 = ((beliefs.Belstmnt_0.Embedded_2) HeadVar__2_2).F2;
            list.List_1 V_23_23 = ((beliefs.Belstmnt_0.Embedded_2) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 1))
              {
                list.List_1 V_14_14 = ((beliefs.Belstmnt_0.Embedded_2) HeadVar__3_3).F1;
                list.List_1 V_15_15 = ((beliefs.Belstmnt_0.Embedded_2) HeadVar__3_3).F2;
                builtin.Comparison_result_0 V_16_16 = null;
                jmercury.runtime.TypeInfo_Struct TypeInfo_19_19 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.MR_scalar_common_1[3]);

                {
                  V_16_16 = builtin.compare_3_p_0(TypeInfo_19_19, ((java.lang.Object) (V_23_23)), ((java.lang.Object) (V_14_14)));
                }
                succeeded = (V_16_16.MR_value == builtin.Comparison_result_0.K0.MR_value);
                succeeded = !(succeeded);
                if (succeeded)
                  HeadVar__1_1 = V_16_16;
                else
                  {
                    jmercury.runtime.TypeInfo_Struct TypeInfo_20_20 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.MR_scalar_common_1[4]);

                    {
                      HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_20_20, ((java.lang.Object) (V_22_22)), ((java.lang.Object) (V_15_15)));
                    }
                  }
              }
            else
              HeadVar__1_1 = builtin.Comparison_result_0.K2;
          }
        else
          {
            beliefs.Beltriple_0 V_24_24 = ((beliefs.Belstmnt_0.One_1) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 1))
              HeadVar__1_1 = builtin.Comparison_result_0.K1;
            else
              {
                beliefs.Beltriple_0 V_5_5 = ((beliefs.Belstmnt_0.One_1) HeadVar__3_3).F1;

                {
                  HeadVar__1_1 = beliefs.__Compare____beltriple_0_0(V_24_24, V_5_5);
                }
              }
          }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____belstmnt_0_0(
    beliefs.Belstmnt_0 HeadVar__1_1,
    beliefs.Belstmnt_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_9 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_10 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_9 == CastY_10);
      if (succeeded)
        succeeded = true;
      else
        if ((HeadVar__1_1.data_tag == 1))
          {
            jmercury.runtime.TypeInfo_Struct TypeInfo_11_11 = null;
            jmercury.runtime.TypeInfo_Struct TypeInfo_12_12 = null;
            list.List_1 V_5_5 = ((beliefs.Belstmnt_0.Embedded_2) HeadVar__1_1).F1;
            list.List_1 V_6_6 = ((beliefs.Belstmnt_0.Embedded_2) HeadVar__1_1).F2;
            list.List_1 V_7_7 = null;
            list.List_1 V_8_8 = null;

            succeeded = (HeadVar__2_2.data_tag == 1);
            if (succeeded)
              {
                V_7_7 = ((beliefs.Belstmnt_0.Embedded_2) HeadVar__2_2).F1;
                V_8_8 = ((beliefs.Belstmnt_0.Embedded_2) HeadVar__2_2).F2;
                TypeInfo_11_11 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.MR_scalar_common_1[3]);
                {
                  succeeded = builtin.unify_2_p_0(TypeInfo_11_11, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_7_7)));
                }
                if (succeeded)
                  {
                    TypeInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.MR_scalar_common_1[4]);
                    {
                      succeeded = builtin.unify_2_p_0(TypeInfo_12_12, ((java.lang.Object) (V_6_6)), ((java.lang.Object) (V_8_8)));
                    }
                  }
              }
          }
        else
          {
            beliefs.Beltriple_0 V_3_3 = ((beliefs.Belstmnt_0.One_1) HeadVar__1_1).F1;
            beliefs.Beltriple_0 V_4_4 = null;

            succeeded = (HeadVar__2_2.data_tag == 0);
            if (succeeded)
              {
                V_4_4 = ((beliefs.Belstmnt_0.One_1) HeadVar__2_2).F1;
                {
                  succeeded = beliefs.__Unify____beltriple_0_0(V_3_3, V_4_4);
                }
              }
          }
      return succeeded;
    }
  }
//  beliefs.m:12
  public static builtin.Comparison_result_0 __Compare____belmod_0_0(
    beliefs.Belmod_0 HeadVar__2_2,
    beliefs.Belmod_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_12 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_13 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_12 == CastY_13);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        {
          beliefs.Belstr_0 V_4_4 = ((beliefs.Belmod_0) HeadVar__2_2).F1;
          bool.Bool_0 V_5_5 = ((beliefs.Belmod_0) HeadVar__2_2).F2;
          beliefs.Belstr_0 V_7_7 = ((beliefs.Belmod_0) HeadVar__3_3).F1;
          bool.Bool_0 V_8_8 = ((beliefs.Belmod_0) HeadVar__3_3).F2;
          builtin.Comparison_result_0 V_10_10 = null;

          {
            V_10_10 = beliefs.__Compare____belstr_0_0(V_4_4, V_7_7);
          }
          succeeded = (V_10_10.MR_value == builtin.Comparison_result_0.K0.MR_value);
          succeeded = !(succeeded);
          if (succeeded)
            HeadVar__1_1 = V_10_10;
          else
            {
              builtin.Comparison_result_0 V_11_11 = null;
              int V_16_16 = (int) V_5_5.MR_value;
              int V_17_17 = (int) V_8_8.MR_value;

              {
                V_11_11 = private_builtin.builtin_compare_int_3_p_0(V_16_16, V_17_17);
              }
              succeeded = (V_11_11.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_11_11;
              else
                HeadVar__1_1 = builtin.Comparison_result_0.K0;
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____belmod_0_0(
    beliefs.Belmod_0 HeadVar__1_1,
    beliefs.Belmod_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_9 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_10 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_9 == CastY_10);
      if (succeeded)
        succeeded = true;
      else
        {
          beliefs.Belstr_0 V_3_3 = ((beliefs.Belmod_0) HeadVar__1_1).F1;
          bool.Bool_0 V_4_4 = ((beliefs.Belmod_0) HeadVar__1_1).F2;
          beliefs.Belstr_0 V_6_6 = ((beliefs.Belmod_0) HeadVar__2_2).F1;
          bool.Bool_0 V_7_7 = ((beliefs.Belmod_0) HeadVar__2_2).F2;

          {
            succeeded = beliefs.__Unify____belstr_0_0(V_3_3, V_6_6);
          }
          if (succeeded)
            succeeded = (V_4_4.MR_value == V_7_7.MR_value);
        }
      return succeeded;
    }
  }
//  beliefs.m:7
  public static builtin.Comparison_result_0 __Compare____belief_0_0(
    beliefs.Belief_0 HeadVar__2_2,
    beliefs.Belief_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_9 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_10 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_9 == CastY_10);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        {
          java.lang.String V_4_4 = ((beliefs.Belief_0) HeadVar__2_2).F1;
          list.List_1 V_5_5 = ((beliefs.Belief_0) HeadVar__2_2).F2;
          java.lang.String V_6_6 = ((beliefs.Belief_0) HeadVar__3_3).F1;
          list.List_1 V_7_7 = ((beliefs.Belief_0) HeadVar__3_3).F2;
          builtin.Comparison_result_0 V_8_8 = null;

          {
            V_8_8 = private_builtin.builtin_compare_string_3_p_0(V_4_4, V_6_6);
          }
          succeeded = (V_8_8.MR_value == builtin.Comparison_result_0.K0.MR_value);
          succeeded = !(succeeded);
          if (succeeded)
            HeadVar__1_1 = V_8_8;
          else
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.MR_scalar_common_1[2]);

              {
                HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_12_12, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_7_7)));
              }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____belief_0_0(
    beliefs.Belief_0 HeadVar__1_1,
    beliefs.Belief_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_7 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_8 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_7 == CastY_8);
      if (succeeded)
        succeeded = true;
      else
        {
          jmercury.runtime.TypeInfo_Struct TypeInfo_9_9 = null;
          java.lang.String V_3_3 = ((beliefs.Belief_0) HeadVar__1_1).F1;
          list.List_1 V_4_4 = ((beliefs.Belief_0) HeadVar__1_1).F2;
          java.lang.String V_5_5 = ((beliefs.Belief_0) HeadVar__2_2).F1;
          list.List_1 V_6_6 = ((beliefs.Belief_0) HeadVar__2_2).F2;

          succeeded = V_3_3.equals(V_5_5);
          if (succeeded)
            {
              TypeInfo_9_9 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.MR_scalar_common_1[2]);
              {
                succeeded = builtin.unify_2_p_0(TypeInfo_9_9, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_6_6)));
              }
            }
        }
      return succeeded;
    }
  }
//  beliefs.m:10
  public static builtin.Comparison_result_0 __Compare____belfile_0_0(
    beliefs.Belfile_0 HeadVar__2_2,
    beliefs.Belfile_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_12 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_13 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_12 == CastY_13);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        {
          java.lang.String V_4_4 = ((beliefs.Belfile_0) HeadVar__2_2).F1;
          set_ordlist.Set_ordlist_1 V_5_5 = ((beliefs.Belfile_0) HeadVar__2_2).F2;
          list.List_1 V_6_6 = ((beliefs.Belfile_0) HeadVar__2_2).F3;
          java.lang.String V_7_7 = ((beliefs.Belfile_0) HeadVar__3_3).F1;
          set_ordlist.Set_ordlist_1 V_8_8 = ((beliefs.Belfile_0) HeadVar__3_3).F2;
          list.List_1 V_9_9 = ((beliefs.Belfile_0) HeadVar__3_3).F3;
          builtin.Comparison_result_0 V_10_10 = null;

          {
            V_10_10 = private_builtin.builtin_compare_string_3_p_0(V_4_4, V_7_7);
          }
          succeeded = (V_10_10.MR_value == builtin.Comparison_result_0.K0.MR_value);
          succeeded = !(succeeded);
          if (succeeded)
            HeadVar__1_1 = V_10_10;
          else
            {
              builtin.Comparison_result_0 V_11_11 = null;
              jmercury.runtime.TypeInfo_Struct TypeInfo_15_15 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.MR_scalar_common_1[0]);

              {
                V_11_11 = builtin.compare_3_p_0(TypeInfo_15_15, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_8_8)));
              }
              succeeded = (V_11_11.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_11_11;
              else
                {
                  jmercury.runtime.TypeInfo_Struct TypeInfo_16_16 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.MR_scalar_common_1[1]);

                  {
                    HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_16_16, ((java.lang.Object) (V_6_6)), ((java.lang.Object) (V_9_9)));
                  }
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____belfile_0_0(
    beliefs.Belfile_0 HeadVar__1_1,
    beliefs.Belfile_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_9 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_10 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_9 == CastY_10);
      if (succeeded)
        succeeded = true;
      else
        {
          jmercury.runtime.TypeInfo_Struct TypeInfo_11_11 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_12_12 = null;
          java.lang.String V_3_3 = ((beliefs.Belfile_0) HeadVar__1_1).F1;
          set_ordlist.Set_ordlist_1 V_4_4 = ((beliefs.Belfile_0) HeadVar__1_1).F2;
          list.List_1 V_5_5 = ((beliefs.Belfile_0) HeadVar__1_1).F3;
          java.lang.String V_6_6 = ((beliefs.Belfile_0) HeadVar__2_2).F1;
          set_ordlist.Set_ordlist_1 V_7_7 = ((beliefs.Belfile_0) HeadVar__2_2).F2;
          list.List_1 V_8_8 = ((beliefs.Belfile_0) HeadVar__2_2).F3;

          succeeded = V_3_3.equals(V_6_6);
          if (succeeded)
            {
              TypeInfo_11_11 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.MR_scalar_common_1[0]);
              {
                succeeded = builtin.unify_2_p_0(TypeInfo_11_11, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_7_7)));
              }
              if (succeeded)
                {
                  TypeInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.MR_scalar_common_1[1]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_12_12, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_8_8)));
                  }
                }
            }
        }
      return succeeded;
    }
  }
//  beliefs.m:26
  public static boolean modality_word_2_p_0(
    java.lang.String HeadVar__1_1)
  {
//  beliefs.m:30
    {
      boolean succeeded = false;
      int lo_0 = 0;
      int hi_1 = 0;
      int mid_2 = 0;
      int result_3 = 0;
      int stop_loop_4 = 0;

      /* binary string jump switch */
      succeeded = false;
      lo_0 = 0;
      hi_1 = 4;
      stop_loop_4 = 0;
      do
        {
          mid_2 = ((lo_0 + hi_1) / 2);
          result_3 = (HeadVar__1_1.compareTo(((beliefs.Vector_common_type_2_0) (MR_vector_common_2[0 + mid_2])).vct_2_f_0)) ;
          if ((result_3 == 0))
            {
              switch (((beliefs.Vector_common_type_2_0) (MR_vector_common_2[0 + mid_2])).vct_2_f_1) {
                case 0:
//  beliefs.m:33
                  {
                    /* case "assume" */
                    private_builtin.dummy_var = beliefs.Modality_0.K0;
                    succeeded = true;
                  }
//  beliefs.m:30
                  break;
                case 1:
//  beliefs.m:31
                  {
                    /* case "believe" */
                    private_builtin.dummy_var = beliefs.Modality_0.K0;
                    succeeded = true;
                  }
//  beliefs.m:30
                  break;
                case 2:
//  beliefs.m:32
                  {
                    /* case "know" */
                    private_builtin.dummy_var = beliefs.Modality_0.K0;
                    succeeded = true;
                  }
//  beliefs.m:30
                  break;
                case 3:
//  beliefs.m:34
                  {
                    /* case "presume" */
                    private_builtin.dummy_var = beliefs.Modality_0.K0;
                    succeeded = true;
                  }
//  beliefs.m:30
                  break;
                case 4:
                  {
                    /* case "think" */
                    private_builtin.dummy_var = beliefs.Modality_0.K0;
                    succeeded = true;
                  }
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
              stop_loop_4 = 1;
            }
          else
            if ((result_3 < 0))
              hi_1 = (mid_2 - 1);
            else
              lo_0 = (mid_2 + 1);
        }
      while (((stop_loop_4 == 0) && (lo_0 <= hi_1)));
      return succeeded;
    }
//  beliefs.m:26
  }

// ExportDefns

// ExportedEnums

// InitPreds

// FinalPreds

// EnvVarNames
  static {
    if (System.getenv("MERCURY_DEBUG_CLASS_INIT") != null) {
      System.out.println("[beliefs end init]");
    }
  }
}
// :- end_module beliefs.
