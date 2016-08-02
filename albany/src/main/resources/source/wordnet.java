//
//
// Automatically generated from wordnet.m by the Mercury Compiler,
// version 14.01.1, configured for x86_64-unknown-linux-gnu
//
//

/* :- module wordnet. */

package jmercury;
// import array;
// import assoc_list;
// import bitmap;
// import bool;
// import builtin;
// import mr_char;
// import construct;
// import deconstruct;
// import mr_enum;
// import errors;
// import mr_int;
// import io;
// import list;
// import map;
// import maybe;
// import multi_map;
// import ops;
// import pair;
// import pretty_printer;
// import private_builtin;
// import random;
// import rtti_implementation;
// import sberrs;
// import set;
// import set_ordlist;
// import solutions;
// import stream;
// import string;
// import term;
// import time;
// import tree234;
// import type_desc;
// import univ;
// import xml;
public class wordnet {
  static {
    if (System.getenv("MERCURY_DEBUG_CLASS_INIT") != null) {
      System.out.println("[wordnet start init]");
    }
  }

// RttiDefns
  private static final jmercury.runtime.TypeInfo_Struct list__pti_list_1__plain_builtin__type_ctor_info_character_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] wordnet__field_types_ctp_0_0 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc wordnet__du_functor_desc_ctp_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] wordnet__field_types_ctp_0_1 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc wordnet__du_functor_desc_ctp_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] wordnet__du_stag_ordered_ctp_0_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final jmercury.runtime.DuPtagLayout[] wordnet__du_ptag_ordered_ctp_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] wordnet__du_name_ordered_ctp_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final int[] wordnet__functor_number_map_ctp_0 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct wordnet__type_ctor_info_ctp_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct maybe__ti_maybe_1wordnet__type_ctor_info_wndata_0 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct wordnet__type_ctor_info_mwndata_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc wordnet__enum_functor_desc_nountp_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] wordnet__enum_value_ordered_nountp_0 = new jmercury.runtime.EnumFunctorDesc[1];
  private static final jmercury.runtime.EnumFunctorDesc[] wordnet__enum_name_ordered_nountp_0 = new jmercury.runtime.EnumFunctorDesc[1];
  private static final int[] wordnet__functor_number_map_nountp_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct wordnet__type_ctor_info_nountp_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] wordnet__field_types_pptp_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc wordnet__du_functor_desc_pptp_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] wordnet__du_stag_ordered_pptp_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] wordnet__du_ptag_ordered_pptp_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] wordnet__du_name_ordered_pptp_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] wordnet__functor_number_map_pptp_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct wordnet__type_ctor_info_pptp_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc wordnet__enum_functor_desc_prep_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] wordnet__enum_value_ordered_prep_0 = new jmercury.runtime.EnumFunctorDesc[1];
  private static final jmercury.runtime.EnumFunctorDesc[] wordnet__enum_name_ordered_prep_0 = new jmercury.runtime.EnumFunctorDesc[1];
  private static final int[] wordnet__functor_number_map_prep_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct wordnet__type_ctor_info_prep_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc wordnet__enum_functor_desc_prontp_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc wordnet__enum_functor_desc_prontp_0_1 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc wordnet__enum_functor_desc_prontp_0_2 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc wordnet__enum_functor_desc_prontp_0_3 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] wordnet__enum_value_ordered_prontp_0 = new jmercury.runtime.EnumFunctorDesc[4];
  private static final jmercury.runtime.EnumFunctorDesc[] wordnet__enum_name_ordered_prontp_0 = new jmercury.runtime.EnumFunctorDesc[4];
  private static final int[] wordnet__functor_number_map_prontp_0 = new int[4];
  public static final jmercury.runtime.TypeCtorInfo_Struct wordnet__type_ctor_info_prontp_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc wordnet__enum_functor_desc_syncat_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc wordnet__enum_functor_desc_syncat_0_1 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc wordnet__enum_functor_desc_syncat_0_2 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc wordnet__enum_functor_desc_syncat_0_3 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] wordnet__enum_value_ordered_syncat_0 = new jmercury.runtime.EnumFunctorDesc[4];
  private static final jmercury.runtime.EnumFunctorDesc[] wordnet__enum_name_ordered_syncat_0 = new jmercury.runtime.EnumFunctorDesc[4];
  private static final int[] wordnet__functor_number_map_syncat_0 = new int[4];
  public static final jmercury.runtime.TypeCtorInfo_Struct wordnet__type_ctor_info_syncat_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1wordnet__type_ctor_info_wnspec_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__ti_tree234_2builtin__type_ctor_info_string_0list__ti_list_1wordnet__type_ctor_info_wnspec_0 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct wordnet__type_ctor_info_wdmap_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] wordnet__field_types_wnclause_0_0 = new jmercury.runtime.PseudoTypeInfo[4];
  private static final jmercury.runtime.DuFunctorDesc wordnet__du_functor_desc_wnclause_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] wordnet__du_stag_ordered_wnclause_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] wordnet__du_ptag_ordered_wnclause_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] wordnet__du_name_ordered_wnclause_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] wordnet__functor_number_map_wnclause_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct wordnet__type_ctor_info_wnclause_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] wordnet__field_types_wndata_0_0 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc wordnet__du_functor_desc_wndata_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] wordnet__du_stag_ordered_wndata_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] wordnet__du_ptag_ordered_wndata_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] wordnet__du_name_ordered_wndata_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] wordnet__functor_number_map_wndata_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct wordnet__type_ctor_info_wndata_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] wordnet__field_types_wnspec_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc wordnet__du_functor_desc_wnspec_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] wordnet__field_types_wnspec_0_1 = new jmercury.runtime.PseudoTypeInfo[4];
  private static final jmercury.runtime.DuFunctorDesc wordnet__du_functor_desc_wnspec_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] wordnet__du_stag_ordered_wnspec_0_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final jmercury.runtime.DuPtagLayout[] wordnet__du_ptag_ordered_wnspec_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] wordnet__du_name_ordered_wnspec_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final int[] wordnet__functor_number_map_wnspec_0 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct wordnet__type_ctor_info_wnspec_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  static {
    //
    //
    //
    list__pti_list_1__plain_builtin__type_ctor_info_character_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_character_0});
    //
    //
    wordnet__field_types_ctp_0_0[0] = (jmercury.runtime.PseudoTypeInfo) wordnet.wordnet__type_ctor_info_nountp_0;
    //
    wordnet__du_functor_desc_ctp_0_0.init("noun",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		0,
		wordnet.wordnet__field_types_ctp_0_0,
		null,
		null,
		null);
    //
    //
    wordnet__field_types_ctp_0_1[0] = (jmercury.runtime.PseudoTypeInfo) wordnet.wordnet__type_ctor_info_prontp_0;
    //
    wordnet__du_functor_desc_ctp_0_1.init("pron",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		wordnet.wordnet__field_types_ctp_0_1,
		null,
		null,
		null);
    //
    wordnet__du_stag_ordered_ctp_0_0[0] = wordnet.wordnet__du_functor_desc_ctp_0_0;
    wordnet__du_stag_ordered_ctp_0_0[1] = wordnet.wordnet__du_functor_desc_ctp_0_1;
    //
    wordnet__du_ptag_ordered_ctp_0[0] = new jmercury.runtime.DuPtagLayout(2,
		private_builtin.MR_SECTAG_REMOTE,
		wordnet.wordnet__du_stag_ordered_ctp_0_0);
    //
    wordnet__du_name_ordered_ctp_0[0] = wordnet.wordnet__du_functor_desc_ctp_0_0;
    wordnet__du_name_ordered_ctp_0[1] = wordnet.wordnet__du_functor_desc_ctp_0_1;
    //
    wordnet__functor_number_map_ctp_0[0] = 0;
    wordnet__functor_number_map_ctp_0[1] = 1;
    //
    wordnet__type_ctor_info_ctp_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(0))),
		((java.lang.Object) (new AddrOf2_0(1))),
		"wordnet",
		"ctp",
		new jmercury.runtime.TypeFunctors(wordnet.wordnet__du_name_ordered_ctp_0),
		new jmercury.runtime.TypeLayout(wordnet.wordnet__du_ptag_ordered_ctp_0),
		2,
		4,
		wordnet.wordnet__functor_number_map_ctp_0);
    //
    //
    //
    maybe__ti_maybe_1wordnet__type_ctor_info_wndata_0.init(maybe.maybe__type_ctor_info_maybe_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(wordnet.wordnet__type_ctor_info_wndata_0)});
    //
    wordnet__type_ctor_info_mwndata_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(2))),
		((java.lang.Object) (new AddrOf2_0(3))),
		"wordnet",
		"mwndata",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) wordnet.maybe__ti_maybe_1wordnet__type_ctor_info_wndata_0),
		-1,
		0,
		null);
    //
    wordnet__enum_functor_desc_nountp_0_0.init("wordnet",
		0);
    //
    wordnet__enum_value_ordered_nountp_0[0] = wordnet.wordnet__enum_functor_desc_nountp_0_0;
    //
    wordnet__enum_name_ordered_nountp_0[0] = wordnet.wordnet__enum_functor_desc_nountp_0_0;
    //
    wordnet__functor_number_map_nountp_0[0] = 0;
    //
    wordnet__type_ctor_info_nountp_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_DUMMY,
		((java.lang.Object) (new AddrOf2_0(4))),
		((java.lang.Object) (new AddrOf2_0(5))),
		"wordnet",
		"nountp",
		new jmercury.runtime.TypeFunctors(wordnet.wordnet__enum_name_ordered_nountp_0),
		new jmercury.runtime.TypeLayout(wordnet.wordnet__enum_value_ordered_nountp_0),
		1,
		4,
		wordnet.wordnet__functor_number_map_nountp_0);
    //
    //
    //
    //
    wordnet__field_types_pptp_0_0[0] = (jmercury.runtime.PseudoTypeInfo) wordnet.wordnet__type_ctor_info_prep_0;
    wordnet__field_types_pptp_0_0[1] = (jmercury.runtime.PseudoTypeInfo) wordnet.wordnet__type_ctor_info_ctp_0;
    wordnet__field_types_pptp_0_0[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    wordnet__du_functor_desc_pptp_0_0.init("pp",
		3,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		wordnet.wordnet__field_types_pptp_0_0,
		null,
		null,
		null);
    //
    wordnet__du_stag_ordered_pptp_0_0[0] = wordnet.wordnet__du_functor_desc_pptp_0_0;
    //
    wordnet__du_ptag_ordered_pptp_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		wordnet.wordnet__du_stag_ordered_pptp_0_0);
    //
    wordnet__du_name_ordered_pptp_0[0] = wordnet.wordnet__du_functor_desc_pptp_0_0;
    //
    wordnet__functor_number_map_pptp_0[0] = 0;
    //
    wordnet__type_ctor_info_pptp_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(6))),
		((java.lang.Object) (new AddrOf2_0(7))),
		"wordnet",
		"pptp",
		new jmercury.runtime.TypeFunctors(wordnet.wordnet__du_name_ordered_pptp_0),
		new jmercury.runtime.TypeLayout(wordnet.wordnet__du_ptag_ordered_pptp_0),
		1,
		4,
		wordnet.wordnet__functor_number_map_pptp_0);
    //
    wordnet__enum_functor_desc_prep_0_0.init("prep",
		0);
    //
    wordnet__enum_value_ordered_prep_0[0] = wordnet.wordnet__enum_functor_desc_prep_0_0;
    //
    wordnet__enum_name_ordered_prep_0[0] = wordnet.wordnet__enum_functor_desc_prep_0_0;
    //
    wordnet__functor_number_map_prep_0[0] = 0;
    //
    wordnet__type_ctor_info_prep_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_DUMMY,
		((java.lang.Object) (new AddrOf2_0(8))),
		((java.lang.Object) (new AddrOf2_0(9))),
		"wordnet",
		"prep",
		new jmercury.runtime.TypeFunctors(wordnet.wordnet__enum_name_ordered_prep_0),
		new jmercury.runtime.TypeLayout(wordnet.wordnet__enum_value_ordered_prep_0),
		1,
		4,
		wordnet.wordnet__functor_number_map_prep_0);
    //
    wordnet__enum_functor_desc_prontp_0_0.init("p1",
		0);
    //
    wordnet__enum_functor_desc_prontp_0_1.init("p2",
		1);
    //
    wordnet__enum_functor_desc_prontp_0_2.init("p3",
		2);
    //
    wordnet__enum_functor_desc_prontp_0_3.init("other",
		3);
    //
    wordnet__enum_value_ordered_prontp_0[0] = wordnet.wordnet__enum_functor_desc_prontp_0_0;
    wordnet__enum_value_ordered_prontp_0[1] = wordnet.wordnet__enum_functor_desc_prontp_0_1;
    wordnet__enum_value_ordered_prontp_0[2] = wordnet.wordnet__enum_functor_desc_prontp_0_2;
    wordnet__enum_value_ordered_prontp_0[3] = wordnet.wordnet__enum_functor_desc_prontp_0_3;
    //
    wordnet__enum_name_ordered_prontp_0[0] = wordnet.wordnet__enum_functor_desc_prontp_0_3;
    wordnet__enum_name_ordered_prontp_0[1] = wordnet.wordnet__enum_functor_desc_prontp_0_0;
    wordnet__enum_name_ordered_prontp_0[2] = wordnet.wordnet__enum_functor_desc_prontp_0_1;
    wordnet__enum_name_ordered_prontp_0[3] = wordnet.wordnet__enum_functor_desc_prontp_0_2;
    //
    wordnet__functor_number_map_prontp_0[0] = 1;
    wordnet__functor_number_map_prontp_0[1] = 2;
    wordnet__functor_number_map_prontp_0[2] = 3;
    wordnet__functor_number_map_prontp_0[3] = 0;
    //
    wordnet__type_ctor_info_prontp_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_ENUM,
		((java.lang.Object) (new AddrOf2_0(10))),
		((java.lang.Object) (new AddrOf2_0(11))),
		"wordnet",
		"prontp",
		new jmercury.runtime.TypeFunctors(wordnet.wordnet__enum_name_ordered_prontp_0),
		new jmercury.runtime.TypeLayout(wordnet.wordnet__enum_value_ordered_prontp_0),
		4,
		4,
		wordnet.wordnet__functor_number_map_prontp_0);
    //
    wordnet__enum_functor_desc_syncat_0_0.init("noun",
		0);
    //
    wordnet__enum_functor_desc_syncat_0_1.init("verb",
		1);
    //
    wordnet__enum_functor_desc_syncat_0_2.init("adjective",
		2);
    //
    wordnet__enum_functor_desc_syncat_0_3.init("adverb",
		3);
    //
    wordnet__enum_value_ordered_syncat_0[0] = wordnet.wordnet__enum_functor_desc_syncat_0_0;
    wordnet__enum_value_ordered_syncat_0[1] = wordnet.wordnet__enum_functor_desc_syncat_0_1;
    wordnet__enum_value_ordered_syncat_0[2] = wordnet.wordnet__enum_functor_desc_syncat_0_2;
    wordnet__enum_value_ordered_syncat_0[3] = wordnet.wordnet__enum_functor_desc_syncat_0_3;
    //
    wordnet__enum_name_ordered_syncat_0[0] = wordnet.wordnet__enum_functor_desc_syncat_0_2;
    wordnet__enum_name_ordered_syncat_0[1] = wordnet.wordnet__enum_functor_desc_syncat_0_3;
    wordnet__enum_name_ordered_syncat_0[2] = wordnet.wordnet__enum_functor_desc_syncat_0_0;
    wordnet__enum_name_ordered_syncat_0[3] = wordnet.wordnet__enum_functor_desc_syncat_0_1;
    //
    wordnet__functor_number_map_syncat_0[0] = 2;
    wordnet__functor_number_map_syncat_0[1] = 3;
    wordnet__functor_number_map_syncat_0[2] = 0;
    wordnet__functor_number_map_syncat_0[3] = 1;
    //
    wordnet__type_ctor_info_syncat_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_ENUM,
		((java.lang.Object) (new AddrOf2_0(12))),
		((java.lang.Object) (new AddrOf2_0(13))),
		"wordnet",
		"syncat",
		new jmercury.runtime.TypeFunctors(wordnet.wordnet__enum_name_ordered_syncat_0),
		new jmercury.runtime.TypeLayout(wordnet.wordnet__enum_value_ordered_syncat_0),
		4,
		4,
		wordnet.wordnet__functor_number_map_syncat_0);
    //
    //
    list__ti_list_1wordnet__type_ctor_info_wnspec_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(wordnet.wordnet__type_ctor_info_wnspec_0)});
    //
    //
    tree234__ti_tree234_2builtin__type_ctor_info_string_0list__ti_list_1wordnet__type_ctor_info_wnspec_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(wordnet.list__ti_list_1wordnet__type_ctor_info_wnspec_0)});
    //
    wordnet__type_ctor_info_wdmap_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(14))),
		((java.lang.Object) (new AddrOf2_0(15))),
		"wordnet",
		"wdmap",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) wordnet.tree234__ti_tree234_2builtin__type_ctor_info_string_0list__ti_list_1wordnet__type_ctor_info_wnspec_0),
		-1,
		0,
		null);
    //
    //
    //
    wordnet__field_types_wnclause_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    wordnet__field_types_wnclause_0_0[1] = (jmercury.runtime.PseudoTypeInfo) wordnet.wordnet__type_ctor_info_syncat_0;
    wordnet__field_types_wnclause_0_0[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    wordnet__field_types_wnclause_0_0[3] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    wordnet__du_functor_desc_wnclause_0_0.init("wordnet",
		4,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		wordnet.wordnet__field_types_wnclause_0_0,
		null,
		null,
		null);
    //
    wordnet__du_stag_ordered_wnclause_0_0[0] = wordnet.wordnet__du_functor_desc_wnclause_0_0;
    //
    wordnet__du_ptag_ordered_wnclause_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		wordnet.wordnet__du_stag_ordered_wnclause_0_0);
    //
    wordnet__du_name_ordered_wnclause_0[0] = wordnet.wordnet__du_functor_desc_wnclause_0_0;
    //
    wordnet__functor_number_map_wnclause_0[0] = 0;
    //
    wordnet__type_ctor_info_wnclause_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(16))),
		((java.lang.Object) (new AddrOf2_0(17))),
		"wordnet",
		"wnclause",
		new jmercury.runtime.TypeFunctors(wordnet.wordnet__du_name_ordered_wnclause_0),
		new jmercury.runtime.TypeLayout(wordnet.wordnet__du_ptag_ordered_wnclause_0),
		1,
		4,
		wordnet.wordnet__functor_number_map_wnclause_0);
    //
    wordnet__field_types_wndata_0_0[0] = (jmercury.runtime.PseudoTypeInfo) wordnet.tree234__ti_tree234_2builtin__type_ctor_info_string_0list__ti_list_1wordnet__type_ctor_info_wnspec_0;
    //
    wordnet__du_functor_desc_wndata_0_0.init("wndata",
		1,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		wordnet.wordnet__field_types_wndata_0_0,
		null,
		null,
		null);
    //
    wordnet__du_stag_ordered_wndata_0_0[0] = wordnet.wordnet__du_functor_desc_wndata_0_0;
    //
    wordnet__du_ptag_ordered_wndata_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		wordnet.wordnet__du_stag_ordered_wndata_0_0);
    //
    wordnet__du_name_ordered_wndata_0[0] = wordnet.wordnet__du_functor_desc_wndata_0_0;
    //
    wordnet__functor_number_map_wndata_0[0] = 0;
    //
    wordnet__type_ctor_info_wndata_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(18))),
		((java.lang.Object) (new AddrOf2_0(19))),
		"wordnet",
		"wndata",
		new jmercury.runtime.TypeFunctors(wordnet.wordnet__du_name_ordered_wndata_0),
		new jmercury.runtime.TypeLayout(wordnet.wordnet__du_ptag_ordered_wndata_0),
		1,
		4,
		wordnet.wordnet__functor_number_map_wndata_0);
    //
    wordnet__field_types_wnspec_0_0[0] = (jmercury.runtime.PseudoTypeInfo) wordnet.wordnet__type_ctor_info_syncat_0;
    wordnet__field_types_wnspec_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    wordnet__field_types_wnspec_0_0[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    wordnet__du_functor_desc_wnspec_0_0.init("word",
		3,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		0,
		wordnet.wordnet__field_types_wnspec_0_0,
		null,
		null,
		null);
    //
    wordnet__field_types_wnspec_0_1[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    wordnet__field_types_wnspec_0_1[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    wordnet__field_types_wnspec_0_1[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    wordnet__field_types_wnspec_0_1[3] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    wordnet__du_functor_desc_wnspec_0_1.init("component",
		4,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		wordnet.wordnet__field_types_wnspec_0_1,
		null,
		null,
		null);
    //
    wordnet__du_stag_ordered_wnspec_0_0[0] = wordnet.wordnet__du_functor_desc_wnspec_0_0;
    wordnet__du_stag_ordered_wnspec_0_0[1] = wordnet.wordnet__du_functor_desc_wnspec_0_1;
    //
    wordnet__du_ptag_ordered_wnspec_0[0] = new jmercury.runtime.DuPtagLayout(2,
		private_builtin.MR_SECTAG_REMOTE,
		wordnet.wordnet__du_stag_ordered_wnspec_0_0);
    //
    wordnet__du_name_ordered_wnspec_0[0] = wordnet.wordnet__du_functor_desc_wnspec_0_1;
    wordnet__du_name_ordered_wnspec_0[1] = wordnet.wordnet__du_functor_desc_wnspec_0_0;
    //
    wordnet__functor_number_map_wnspec_0[0] = 1;
    wordnet__functor_number_map_wnspec_0[1] = 0;
    //
    wordnet__type_ctor_info_wnspec_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(20))),
		((java.lang.Object) (new AddrOf2_0(21))),
		"wordnet",
		"wnspec",
		new jmercury.runtime.TypeFunctors(wordnet.wordnet__du_name_ordered_wnspec_0),
		new jmercury.runtime.TypeLayout(wordnet.wordnet__du_ptag_ordered_wnspec_0),
		2,
		4,
		wordnet.wordnet__functor_number_map_wnspec_0);
  }

// DataDefns
  static {
  }

// Scalar common data
  private static final jmercury.runtime.TypeInfo_Struct[] MR_scalar_common_1 = new jmercury.runtime.TypeInfo_Struct[4];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_3 = new /* generic_type */ java.lang.Object[2][];
  private static final list.List_1.F_nil_0[] MR_scalar_common_4 = new list.List_1.F_nil_0[1];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_5 = new /* generic_type */ java.lang.Object[1][];
  private static final list.List_1.F_cons_2[] MR_scalar_common_6 = new list.List_1.F_cons_2[9];
  private static void MR_init_scalars_0() {
    MR_scalar_common_1[0] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(maybe.maybe__type_ctor_info_maybe_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(wordnet.wordnet__type_ctor_info_wndata_0))));
    MR_scalar_common_1[1] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(wordnet.wordnet__type_ctor_info_wnspec_0))));
    MR_scalar_common_1[2] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(tree234.tree234__type_ctor_info_tree234_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(wordnet.MR_scalar_common_1[1]))));
    MR_scalar_common_1[3] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_character_0))));
    MR_scalar_common_3[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(2),
		((java.lang.Object) (wordnet.list__pti_list_1__plain_builtin__type_ctor_info_character_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_character_0))};
    MR_scalar_common_3[1] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(2),
		((java.lang.Object) (builtin.builtin__type_ctor_info_character_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_character_0))};
    MR_scalar_common_4[0] = new list.List_1.F_nil_0();
    MR_scalar_common_5[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(8),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (wordnet.wordnet__type_ctor_info_wndata_0)),
		((java.lang.Object) (wordnet.wordnet__type_ctor_info_wndata_0))};
    MR_scalar_common_6[0] = new list.List_1.F_cons_2(java.lang.Integer.valueOf((116)),
		(list.List_1) wordnet.MR_scalar_common_4[0]);
    MR_scalar_common_6[1] = new list.List_1.F_cons_2(java.lang.Integer.valueOf((114)),
		(list.List_1) wordnet.MR_scalar_common_6[0]);
    MR_scalar_common_6[2] = new list.List_1.F_cons_2(java.lang.Integer.valueOf((112)),
		(list.List_1) wordnet.MR_scalar_common_6[1]);
    MR_scalar_common_6[3] = new list.List_1.F_cons_2(java.lang.Integer.valueOf((109)),
		(list.List_1) wordnet.MR_scalar_common_6[2]);
    MR_scalar_common_6[4] = new list.List_1.F_cons_2(java.lang.Integer.valueOf((110)),
		(list.List_1) wordnet.MR_scalar_common_6[3]);
    MR_scalar_common_6[5] = new list.List_1.F_cons_2(java.lang.Integer.valueOf((108)),
		(list.List_1) wordnet.MR_scalar_common_6[4]);
    MR_scalar_common_6[6] = new list.List_1.F_cons_2(java.lang.Integer.valueOf((103)),
		(list.List_1) wordnet.MR_scalar_common_6[5]);
    MR_scalar_common_6[7] = new list.List_1.F_cons_2(java.lang.Integer.valueOf((100)),
		(list.List_1) wordnet.MR_scalar_common_6[6]);
    MR_scalar_common_6[8] = new list.List_1.F_cons_2(java.lang.Integer.valueOf((98)),
		(list.List_1) wordnet.MR_scalar_common_6[7]);
  }
  static {
    MR_init_scalars_0();
  }

// Vector common data
//  wordnet.m:235
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

  private static final wordnet.Vector_common_type_2_0 MR_vector_common_2[] = {
    new wordnet.Vector_common_type_2_0("I",
		0),
		new wordnet.Vector_common_type_2_0("all",
		1),
		new wordnet.Vector_common_type_2_0("another",
		2),
		new wordnet.Vector_common_type_2_0("anybody",
		3),
		new wordnet.Vector_common_type_2_0("anyone",
		4),
		new wordnet.Vector_common_type_2_0("anything",
		5),
		new wordnet.Vector_common_type_2_0("both",
		6),
		new wordnet.Vector_common_type_2_0("each",
		7),
		new wordnet.Vector_common_type_2_0("everybody",
		8),
		new wordnet.Vector_common_type_2_0("everyone",
		9),
		new wordnet.Vector_common_type_2_0("everything",
		10),
		new wordnet.Vector_common_type_2_0("he",
		11),
		new wordnet.Vector_common_type_2_0("her",
		12),
		new wordnet.Vector_common_type_2_0("him",
		13),
		new wordnet.Vector_common_type_2_0("himself",
		14),
		new wordnet.Vector_common_type_2_0("his",
		15),
		new wordnet.Vector_common_type_2_0("how",
		16),
		new wordnet.Vector_common_type_2_0("it",
		17),
		new wordnet.Vector_common_type_2_0("its",
		18),
		new wordnet.Vector_common_type_2_0("itself",
		19),
		new wordnet.Vector_common_type_2_0("many",
		20),
		new wordnet.Vector_common_type_2_0("me",
		21),
		new wordnet.Vector_common_type_2_0("most",
		22),
		new wordnet.Vector_common_type_2_0("my",
		23),
		new wordnet.Vector_common_type_2_0("myself",
		24),
		new wordnet.Vector_common_type_2_0("next",
		25),
		new wordnet.Vector_common_type_2_0("nobody",
		26),
		new wordnet.Vector_common_type_2_0("none",
		27),
		new wordnet.Vector_common_type_2_0("nothing",
		28),
		new wordnet.Vector_common_type_2_0("one",
		29),
		new wordnet.Vector_common_type_2_0("others",
		30),
		new wordnet.Vector_common_type_2_0("our",
		31),
		new wordnet.Vector_common_type_2_0("ourselves",
		32),
		new wordnet.Vector_common_type_2_0("she",
		33),
		new wordnet.Vector_common_type_2_0("some",
		34),
		new wordnet.Vector_common_type_2_0("someone",
		35),
		new wordnet.Vector_common_type_2_0("someplace",
		36),
		new wordnet.Vector_common_type_2_0("something",
		37),
		new wordnet.Vector_common_type_2_0("somewhere",
		38),
		new wordnet.Vector_common_type_2_0("that",
		39),
		new wordnet.Vector_common_type_2_0("their",
		40),
		new wordnet.Vector_common_type_2_0("them",
		41),
		new wordnet.Vector_common_type_2_0("themselves",
		42),
		new wordnet.Vector_common_type_2_0("there",
		43),
		new wordnet.Vector_common_type_2_0("these",
		44),
		new wordnet.Vector_common_type_2_0("they",
		45),
		new wordnet.Vector_common_type_2_0("this",
		46),
		new wordnet.Vector_common_type_2_0("those",
		47),
		new wordnet.Vector_common_type_2_0("us",
		48),
		new wordnet.Vector_common_type_2_0("we",
		49),
		new wordnet.Vector_common_type_2_0("what",
		50),
		new wordnet.Vector_common_type_2_0("when",
		51),
		new wordnet.Vector_common_type_2_0("which",
		52),
		new wordnet.Vector_common_type_2_0("you",
		53),
		new wordnet.Vector_common_type_2_0("your",
		54),
		new wordnet.Vector_common_type_2_0("yours",
		55),
		new wordnet.Vector_common_type_2_0("yourself",
		56),
		new wordnet.Vector_common_type_2_0("\'m",
		0),
		new wordnet.Vector_common_type_2_0("\'re",
		1),
		new wordnet.Vector_common_type_2_0("\'s",
		2),
		new wordnet.Vector_common_type_2_0("\'ve",
		3),
		new wordnet.Vector_common_type_2_0("am",
		4),
		new wordnet.Vector_common_type_2_0("are",
		5),
		new wordnet.Vector_common_type_2_0("be",
		6),
		new wordnet.Vector_common_type_2_0("been",
		7),
		new wordnet.Vector_common_type_2_0("being",
		8),
		new wordnet.Vector_common_type_2_0("did",
		9),
		new wordnet.Vector_common_type_2_0("do",
		10),
		new wordnet.Vector_common_type_2_0("does",
		11),
		new wordnet.Vector_common_type_2_0("doing",
		12),
		new wordnet.Vector_common_type_2_0("done",
		13),
		new wordnet.Vector_common_type_2_0("had",
		14),
		new wordnet.Vector_common_type_2_0("has",
		15),
		new wordnet.Vector_common_type_2_0("have",
		16),
		new wordnet.Vector_common_type_2_0("is",
		17),
		new wordnet.Vector_common_type_2_0("was",
		18),
		new wordnet.Vector_common_type_2_0("were",
		19),
		new wordnet.Vector_common_type_2_0("\'m",
		0),
		new wordnet.Vector_common_type_2_0("\'re",
		1),
		new wordnet.Vector_common_type_2_0("\'s",
		2),
		new wordnet.Vector_common_type_2_0("\'ve",
		3),
		new wordnet.Vector_common_type_2_0("am",
		4),
		new wordnet.Vector_common_type_2_0("are",
		5),
		new wordnet.Vector_common_type_2_0("be",
		6),
		new wordnet.Vector_common_type_2_0("been",
		7),
		new wordnet.Vector_common_type_2_0("being",
		8),
		new wordnet.Vector_common_type_2_0("did",
		9),
		new wordnet.Vector_common_type_2_0("do",
		10),
		new wordnet.Vector_common_type_2_0("does",
		11),
		new wordnet.Vector_common_type_2_0("doing",
		12),
		new wordnet.Vector_common_type_2_0("done",
		13),
		new wordnet.Vector_common_type_2_0("had",
		14),
		new wordnet.Vector_common_type_2_0("has",
		15),
		new wordnet.Vector_common_type_2_0("have",
		16),
		new wordnet.Vector_common_type_2_0("is",
		17),
		new wordnet.Vector_common_type_2_0("was",
		18),
		new wordnet.Vector_common_type_2_0("were",
		19),
		new wordnet.Vector_common_type_2_0("\'m",
		0),
		new wordnet.Vector_common_type_2_0("\'re",
		1),
		new wordnet.Vector_common_type_2_0("\'s",
		2),
		new wordnet.Vector_common_type_2_0("\'ve",
		3),
		new wordnet.Vector_common_type_2_0("am",
		4),
		new wordnet.Vector_common_type_2_0("are",
		5),
		new wordnet.Vector_common_type_2_0("be",
		6),
		new wordnet.Vector_common_type_2_0("been",
		7),
		new wordnet.Vector_common_type_2_0("being",
		8),
		new wordnet.Vector_common_type_2_0("did",
		9),
		new wordnet.Vector_common_type_2_0("do",
		10),
		new wordnet.Vector_common_type_2_0("does",
		11),
		new wordnet.Vector_common_type_2_0("doing",
		12),
		new wordnet.Vector_common_type_2_0("done",
		13),
		new wordnet.Vector_common_type_2_0("had",
		14),
		new wordnet.Vector_common_type_2_0("has",
		15),
		new wordnet.Vector_common_type_2_0("have",
		16),
		new wordnet.Vector_common_type_2_0("is",
		17),
		new wordnet.Vector_common_type_2_0("was",
		18),
		new wordnet.Vector_common_type_2_0("were",
		19),
		new wordnet.Vector_common_type_2_0("admitted",
		0),
		new wordnet.Vector_common_type_2_0("arose",
		1),
		new wordnet.Vector_common_type_2_0("ate",
		2),
		new wordnet.Vector_common_type_2_0("became",
		3),
		new wordnet.Vector_common_type_2_0("began",
		4),
		new wordnet.Vector_common_type_2_0("begun",
		5),
		new wordnet.Vector_common_type_2_0("bled",
		6),
		new wordnet.Vector_common_type_2_0("blew",
		7),
		new wordnet.Vector_common_type_2_0("born",
		8),
		new wordnet.Vector_common_type_2_0("borne",
		9),
		new wordnet.Vector_common_type_2_0("bought",
		10),
		new wordnet.Vector_common_type_2_0("broke",
		11),
		new wordnet.Vector_common_type_2_0("broken",
		12),
		new wordnet.Vector_common_type_2_0("brought",
		13),
		new wordnet.Vector_common_type_2_0("built",
		14),
		new wordnet.Vector_common_type_2_0("came",
		15),
		new wordnet.Vector_common_type_2_0("caught",
		16),
		new wordnet.Vector_common_type_2_0("chose",
		17),
		new wordnet.Vector_common_type_2_0("chosen",
		18),
		new wordnet.Vector_common_type_2_0("concurred",
		19),
		new wordnet.Vector_common_type_2_0("crept",
		20),
		new wordnet.Vector_common_type_2_0("dealt",
		21),
		new wordnet.Vector_common_type_2_0("drew",
		22),
		new wordnet.Vector_common_type_2_0("dropped",
		23),
		new wordnet.Vector_common_type_2_0("dropping",
		24),
		new wordnet.Vector_common_type_2_0("drove",
		25),
		new wordnet.Vector_common_type_2_0("fed",
		26),
		new wordnet.Vector_common_type_2_0("forgot",
		27),
		new wordnet.Vector_common_type_2_0("forgotten",
		28),
		new wordnet.Vector_common_type_2_0("fought",
		29),
		new wordnet.Vector_common_type_2_0("froze",
		30),
		new wordnet.Vector_common_type_2_0("frozen",
		31),
		new wordnet.Vector_common_type_2_0("gave",
		32),
		new wordnet.Vector_common_type_2_0("getting",
		33),
		new wordnet.Vector_common_type_2_0("given",
		34),
		new wordnet.Vector_common_type_2_0("goes",
		35),
		new wordnet.Vector_common_type_2_0("gone",
		36),
		new wordnet.Vector_common_type_2_0("got",
		37),
		new wordnet.Vector_common_type_2_0("gotten",
		38),
		new wordnet.Vector_common_type_2_0("grew",
		39),
		new wordnet.Vector_common_type_2_0("held",
		40),
		new wordnet.Vector_common_type_2_0("hidden",
		41),
		new wordnet.Vector_common_type_2_0("hung",
		42),
		new wordnet.Vector_common_type_2_0("incurring",
		43),
		new wordnet.Vector_common_type_2_0("inferred",
		44),
		new wordnet.Vector_common_type_2_0("kept",
		45),
		new wordnet.Vector_common_type_2_0("knew",
		46),
		new wordnet.Vector_common_type_2_0("laid",
		47),
		new wordnet.Vector_common_type_2_0("led",
		48),
		new wordnet.Vector_common_type_2_0("left",
		49),
		new wordnet.Vector_common_type_2_0("lent",
		50),
		new wordnet.Vector_common_type_2_0("lost",
		51),
		new wordnet.Vector_common_type_2_0("lying",
		52),
		new wordnet.Vector_common_type_2_0("made",
		53),
		new wordnet.Vector_common_type_2_0("meant",
		54),
		new wordnet.Vector_common_type_2_0("met",
		55),
		new wordnet.Vector_common_type_2_0("misled",
		56),
		new wordnet.Vector_common_type_2_0("misunderstood",
		57),
		new wordnet.Vector_common_type_2_0("occurred",
		58),
		new wordnet.Vector_common_type_2_0("overlapping",
		59),
		new wordnet.Vector_common_type_2_0("oversaw",
		60),
		new wordnet.Vector_common_type_2_0("paid",
		61),
		new wordnet.Vector_common_type_2_0("planning",
		62),
		new wordnet.Vector_common_type_2_0("ran",
		63),
		new wordnet.Vector_common_type_2_0("referred",
		64),
		new wordnet.Vector_common_type_2_0("referring",
		65),
		new wordnet.Vector_common_type_2_0("repaid",
		66),
		new wordnet.Vector_common_type_2_0("rode",
		67),
		new wordnet.Vector_common_type_2_0("rose",
		68),
		new wordnet.Vector_common_type_2_0("running",
		69),
		new wordnet.Vector_common_type_2_0("said",
		70),
		new wordnet.Vector_common_type_2_0("sat",
		71),
		new wordnet.Vector_common_type_2_0("seen",
		72),
		new wordnet.Vector_common_type_2_0("sent",
		73),
		new wordnet.Vector_common_type_2_0("shook",
		74),
		new wordnet.Vector_common_type_2_0("shot",
		75),
		new wordnet.Vector_common_type_2_0("shrank",
		76),
		new wordnet.Vector_common_type_2_0("shrunk",
		77),
		new wordnet.Vector_common_type_2_0("sitting",
		78),
		new wordnet.Vector_common_type_2_0("sold",
		79),
		new wordnet.Vector_common_type_2_0("sought",
		80),
		new wordnet.Vector_common_type_2_0("spent",
		81),
		new wordnet.Vector_common_type_2_0("spoke",
		82),
		new wordnet.Vector_common_type_2_0("spoken",
		83),
		new wordnet.Vector_common_type_2_0("stood",
		84),
		new wordnet.Vector_common_type_2_0("stopped",
		85),
		new wordnet.Vector_common_type_2_0("struck",
		86),
		new wordnet.Vector_common_type_2_0("stuck",
		87),
		new wordnet.Vector_common_type_2_0("sworn",
		88),
		new wordnet.Vector_common_type_2_0("swung",
		89),
		new wordnet.Vector_common_type_2_0("taught",
		90),
		new wordnet.Vector_common_type_2_0("thought",
		91),
		new wordnet.Vector_common_type_2_0("threw",
		92),
		new wordnet.Vector_common_type_2_0("told",
		93),
		new wordnet.Vector_common_type_2_0("took",
		94),
		new wordnet.Vector_common_type_2_0("torn",
		95),
		new wordnet.Vector_common_type_2_0("tying",
		96),
		new wordnet.Vector_common_type_2_0("underlying",
		97),
		new wordnet.Vector_common_type_2_0("understand",
		98),
		new wordnet.Vector_common_type_2_0("understood",
		99),
		new wordnet.Vector_common_type_2_0("undertake",
		100),
		new wordnet.Vector_common_type_2_0("undertook",
		101),
		new wordnet.Vector_common_type_2_0("underwritten",
		102),
		new wordnet.Vector_common_type_2_0("undone",
		103),
		new wordnet.Vector_common_type_2_0("unwound",
		104),
		new wordnet.Vector_common_type_2_0("went",
		105),
		new wordnet.Vector_common_type_2_0("woke",
		106),
		new wordnet.Vector_common_type_2_0("won",
		107),
		new wordnet.Vector_common_type_2_0("worn",
		108),
		new wordnet.Vector_common_type_2_0("written",
		109),
		new wordnet.Vector_common_type_2_0("wrote",
		110),
		new wordnet.Vector_common_type_2_0("about",
		0),
		new wordnet.Vector_common_type_2_0("across",
		1),
		new wordnet.Vector_common_type_2_0("after",
		2),
		new wordnet.Vector_common_type_2_0("against",
		3),
		new wordnet.Vector_common_type_2_0("alongside",
		4),
		new wordnet.Vector_common_type_2_0("amid",
		5),
		new wordnet.Vector_common_type_2_0("among",
		6),
		new wordnet.Vector_common_type_2_0("amongst",
		7),
		new wordnet.Vector_common_type_2_0("around",
		8),
		new wordnet.Vector_common_type_2_0("as",
		9),
		new wordnet.Vector_common_type_2_0("at",
		10),
		new wordnet.Vector_common_type_2_0("because",
		11),
		new wordnet.Vector_common_type_2_0("before",
		12),
		new wordnet.Vector_common_type_2_0("behind",
		13),
		new wordnet.Vector_common_type_2_0("below",
		14),
		new wordnet.Vector_common_type_2_0("between",
		15),
		new wordnet.Vector_common_type_2_0("beyond",
		16),
		new wordnet.Vector_common_type_2_0("by",
		17),
		new wordnet.Vector_common_type_2_0("down",
		18),
		new wordnet.Vector_common_type_2_0("during",
		19),
		new wordnet.Vector_common_type_2_0("except",
		20),
		new wordnet.Vector_common_type_2_0("for",
		21),
		new wordnet.Vector_common_type_2_0("from",
		22),
		new wordnet.Vector_common_type_2_0("in",
		23),
		new wordnet.Vector_common_type_2_0("into",
		24),
		new wordnet.Vector_common_type_2_0("like",
		25),
		new wordnet.Vector_common_type_2_0("of",
		26),
		new wordnet.Vector_common_type_2_0("on",
		27),
		new wordnet.Vector_common_type_2_0("over",
		28),
		new wordnet.Vector_common_type_2_0("since",
		29),
		new wordnet.Vector_common_type_2_0("than",
		30),
		new wordnet.Vector_common_type_2_0("through",
		31),
		new wordnet.Vector_common_type_2_0("towards",
		32),
		new wordnet.Vector_common_type_2_0("under",
		33),
		new wordnet.Vector_common_type_2_0("until",
		34),
		new wordnet.Vector_common_type_2_0("up",
		35),
		new wordnet.Vector_common_type_2_0("upon",
		36),
		new wordnet.Vector_common_type_2_0("with",
		37),
		new wordnet.Vector_common_type_2_0("within",
		38),
		new wordnet.Vector_common_type_2_0("without",
		39)
  };

// NonDataDefns
  private static boolean __Unify____ctp_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = wordnet.__Unify____ctp_0_0(((wordnet.Ctp_0) wrapper_arg_1), ((wordnet.Ctp_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____ctp_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = wordnet.__Compare____ctp_0_0(((wordnet.Ctp_0) wrapper_arg_2), ((wordnet.Ctp_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____mwndata_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = wordnet.__Unify____mwndata_0_0(((maybe.Maybe_1) wrapper_arg_1), ((maybe.Maybe_1) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____mwndata_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = wordnet.__Compare____mwndata_0_0(((maybe.Maybe_1) wrapper_arg_2), ((maybe.Maybe_1) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____nountp_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = wordnet.__Unify____nountp_0_0();
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____nountp_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = wordnet.__Compare____nountp_0_0();
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____pptp_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = wordnet.__Unify____pptp_0_0(((wordnet.Pptp_0) wrapper_arg_1), ((wordnet.Pptp_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____pptp_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = wordnet.__Compare____pptp_0_0(((wordnet.Pptp_0) wrapper_arg_2), ((wordnet.Pptp_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____prep_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = wordnet.__Unify____prep_0_0();
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____prep_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = wordnet.__Compare____prep_0_0();
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____prontp_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = wordnet.__Unify____prontp_0_0(((wordnet.Prontp_0) wrapper_arg_1), ((wordnet.Prontp_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____prontp_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = wordnet.__Compare____prontp_0_0(((wordnet.Prontp_0) wrapper_arg_2), ((wordnet.Prontp_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____syncat_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = wordnet.__Unify____syncat_0_0(((wordnet.Syncat_0) wrapper_arg_1), ((wordnet.Syncat_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____syncat_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = wordnet.__Compare____syncat_0_0(((wordnet.Syncat_0) wrapper_arg_2), ((wordnet.Syncat_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____wdmap_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = wordnet.__Unify____wdmap_0_0(((tree234.Tree234_2) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____wdmap_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = wordnet.__Compare____wdmap_0_0(((tree234.Tree234_2) wrapper_arg_2), ((tree234.Tree234_2) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____wnclause_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = wordnet.__Unify____wnclause_0_0(((wordnet.Wnclause_0) wrapper_arg_1), ((wordnet.Wnclause_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____wnclause_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = wordnet.__Compare____wnclause_0_0(((wordnet.Wnclause_0) wrapper_arg_2), ((wordnet.Wnclause_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____wndata_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = wordnet.__Unify____wndata_0_0(((wordnet.Wndata_0) wrapper_arg_1), ((wordnet.Wndata_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____wndata_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = wordnet.__Compare____wndata_0_0(((wordnet.Wndata_0) wrapper_arg_2), ((wordnet.Wndata_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____wnspec_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = wordnet.__Unify____wnspec_0_0(((wordnet.Wnspec_0) wrapper_arg_1), ((wordnet.Wnspec_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____wnspec_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = wordnet.__Compare____wnspec_0_0(((wordnet.Wnspec_0) wrapper_arg_2), ((wordnet.Wnspec_0) wrapper_arg_3));
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
              return_value = wordnet.__Unify____ctp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 1:
          {
            java.lang.Object return_value = null;

            {
              return_value = wordnet.__Compare____ctp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 2:
          {
            boolean return_value = false;

            {
              return_value = wordnet.__Unify____mwndata_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 3:
          {
            java.lang.Object return_value = null;

            {
              return_value = wordnet.__Compare____mwndata_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 4:
          {
            boolean return_value = false;

            {
              return_value = wordnet.__Unify____nountp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 5:
          {
            java.lang.Object return_value = null;

            {
              return_value = wordnet.__Compare____nountp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 6:
          {
            boolean return_value = false;

            {
              return_value = wordnet.__Unify____pptp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 7:
          {
            java.lang.Object return_value = null;

            {
              return_value = wordnet.__Compare____pptp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 8:
          {
            boolean return_value = false;

            {
              return_value = wordnet.__Unify____prep_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 9:
          {
            java.lang.Object return_value = null;

            {
              return_value = wordnet.__Compare____prep_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 10:
          {
            boolean return_value = false;

            {
              return_value = wordnet.__Unify____prontp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 11:
          {
            java.lang.Object return_value = null;

            {
              return_value = wordnet.__Compare____prontp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 12:
          {
            boolean return_value = false;

            {
              return_value = wordnet.__Unify____syncat_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 13:
          {
            java.lang.Object return_value = null;

            {
              return_value = wordnet.__Compare____syncat_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 14:
          {
            boolean return_value = false;

            {
              return_value = wordnet.__Unify____wdmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 15:
          {
            java.lang.Object return_value = null;

            {
              return_value = wordnet.__Compare____wdmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 16:
          {
            boolean return_value = false;

            {
              return_value = wordnet.__Unify____wnclause_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 17:
          {
            java.lang.Object return_value = null;

            {
              return_value = wordnet.__Compare____wnclause_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 18:
          {
            boolean return_value = false;

            {
              return_value = wordnet.__Unify____wndata_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 19:
          {
            java.lang.Object return_value = null;

            {
              return_value = wordnet.__Compare____wndata_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 20:
          {
            boolean return_value = false;

            {
              return_value = wordnet.__Unify____wnspec_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 21:
          {
            java.lang.Object return_value = null;

            {
              return_value = wordnet.__Compare____wnspec_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 22:
          {
            boolean return_value = false;

            {
              return_value = wordnet.IntroducedFrom__pred__is_all_consonant__351__1_2_p_0_4(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 23:
          {
            /* generic_type */ java.lang.Object return_value = null;

            {
              wordnet.IntroducedFrom__pred__is_all_consonant__351__1_2_p_0_3(((java.lang.Object) arg1), ((/* env_ptr */ java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 24:
          {
            /* generic_type */ java.lang.Object return_value = null;

            {
              wordnet.doubled_consonant_3_p_0_2(((java.lang.Integer) arg1).intValue(), ((/* env_ptr */ java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 25:
          {
            /* generic_type */ java.lang.Object return_value = null;

            {
              wordnet.check_word_3_p_0_4(((java.lang.Object) arg1), ((/* env_ptr */ java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 26:
          {
            /* generic_type */ java.lang.Object return_value = null;

            {
              wordnet.check_word_2_p_0_4(((java.lang.Object) arg1), ((/* env_ptr */ java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 27:
          {
            /* generic_type */ java.lang.Object return_value = null;

            {
              wordnet.check_word_2_p_0_8(((java.lang.Object) arg1), ((/* env_ptr */ java.lang.Object) arg2));
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

  private static final class AddrOf3_0
    implements jmercury.runtime.MethodPtr3
  {
    public /* generic_type */ java.lang.Object call___0_0(
      /* generic_type */ java.lang.Object arg1,
      /* generic_type */ java.lang.Object arg2,
      /* generic_type */ java.lang.Object arg3)
    {
      {
        /* generic_type */ java.lang.Object return_value = null;

        {
          wordnet.doubled_consonant_3_p_0_3(((/* generic_type */ java.lang.Object) arg1), ((jmercury.runtime.MethodPtr) arg2), ((/* env_ptr */ java.lang.Object) arg3));
        }
        return ((java.lang.Object) (return_value));
      }
    }

  }

  private static final class AddrOf4_0
    implements jmercury.runtime.MethodPtr4
  {
    public /* generic_type */ java.lang.Object call___0_0(
      /* generic_type */ java.lang.Object arg1,
      /* generic_type */ java.lang.Object arg2,
      /* generic_type */ java.lang.Object arg3,
      /* generic_type */ java.lang.Object arg4)
    {
      {
        /* generic_type */ java.lang.Object[] return_value = null;

        {
          return_value = wordnet.read_wordnet_8_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4));
        }
        return ((java.lang.Object) (return_value));
      }
    }

  }

//  wordnet.m:14
  public static class Ctp_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Pron_1
      extends wordnet.Ctp_0
    {
      public wordnet.Prontp_0 F1;

      public Pron_1()
      {
        {
        }
      }
      public Pron_1(
        wordnet.Prontp_0 F1)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
        }
      }
    }

    public static class Noun_1
      extends wordnet.Ctp_0
    {
      public wordnet.Nountp_0 F1;

      public Noun_1()
      {
        {
        }
      }
      public Noun_1(
        wordnet.Nountp_0 F1)
      {
        {
          (this).data_tag = 0;
          this.F1 = F1;
        }
      }
    }


  }

//  wordnet.m:9
  public static class Nountp_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Nountp_0 K0 = new Nountp_0(0);  /* wordnet */

      private Nountp_0(int val) {
        super(val);
      }

  }

//  wordnet.m:13
  public static class Pptp_0
    implements jmercury.runtime.MercuryType
  {
    public wordnet.Prep_0 F1;
    public wordnet.Ctp_0 F2;
    public java.lang.String F3;

    public Pptp_0()
    {
      {
      }
    }
    public Pptp_0(
      wordnet.Prep_0 F1,
      wordnet.Ctp_0 F2,
      java.lang.String F3)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
      }
    }
  }

//  wordnet.m:15
  public static class Prep_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Prep_0 K0 = new Prep_0(0);  /* prep */

      private Prep_0(int val) {
        super(val);
      }

  }

//  wordnet.m:11
  public static class Prontp_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Prontp_0 K0 = new Prontp_0(0);  /* p1 */
      public static final Prontp_0 K1 = new Prontp_0(1);  /* p2 */
      public static final Prontp_0 K2 = new Prontp_0(2);  /* p3 */
      public static final Prontp_0 K3 = new Prontp_0(3);  /* other */

      private Prontp_0(int val) {
        super(val);
      }

  }

//  wordnet.m:7
  public static class Syncat_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Syncat_0 K0 = new Syncat_0(0);  /* noun */
      public static final Syncat_0 K1 = new Syncat_0(1);  /* verb */
      public static final Syncat_0 K2 = new Syncat_0(2);  /* adjective */
      public static final Syncat_0 K3 = new Syncat_0(3);  /* adverb */

      private Syncat_0(int val) {
        super(val);
      }

  }

//  wordnet.m:39
  public static class Wnclause_0
    implements jmercury.runtime.MercuryType
  {
    public java.lang.String F1;
    public wordnet.Syncat_0 F2;
    public int F3;
    public int F4;

    public Wnclause_0()
    {
      {
      }
    }
    public Wnclause_0(
      java.lang.String F1,
      wordnet.Syncat_0 F2,
      int F3,
      int F4)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
        this.F4 = F4;
      }
    }
  }

//  wordnet.m:41
  public static class Wndata_0
    implements jmercury.runtime.MercuryType
  {
    public tree234.Tree234_2<java.lang.String, list.List_1<wordnet.Wnspec_0>> F1;

    public Wndata_0()
    {
      {
      }
    }
    public Wndata_0(
      tree234.Tree234_2<java.lang.String, list.List_1<wordnet.Wnspec_0>> F1)
    {
      {
        this.F1 = F1;
      }
    }
  }

//  wordnet.m:43
  public static class Wnspec_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Component_4
      extends wordnet.Wnspec_0
    {
      public int F1;
      public int F2;
      public int F3;
      public int F4;

      public Component_4()
      {
        {
        }
      }
      public Component_4(
        int F1,
        int F2,
        int F3,
        int F4)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
          this.F2 = F2;
          this.F3 = F3;
          this.F4 = F4;
        }
      }
    }

    public static class Word_3
      extends wordnet.Wnspec_0
    {
      public wordnet.Syncat_0 F1;
      public int F2;
      public int F3;

      public Word_3()
      {
        {
        }
      }
      public Word_3(
        wordnet.Syncat_0 F1,
        int F2,
        int F3)
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

//  wordnet.m:387
  private static java.lang.Object [] IntroducedFrom__pred__wordnet_clause__387__1_8_p_0(
    int Synset_10,
    int Pos_11,
    int N_16,
    java.lang.String HeadVar__4_33,
    int HeadVar__5_34,
    wordnet.Wndata_0 HeadVar__7_36)
  {
    {
      boolean succeeded = false;
      int HeadVar__6_35 = 0;
      wordnet.Wndata_0 HeadVar__8_37 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_13_56 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_14_57 = null;
      wordnet.Wnspec_0 V_38_38 = null;
      int V_39_39 = 0;
      tree234.Tree234_2 Map0_53 = null;
      tree234.Tree234_2 Map_54 = null;

//  wordnet.m:388
      {
        V_38_38 = new wordnet.Wnspec_0.Component_4(HeadVar__5_34, N_16, Synset_10, Pos_11);
      }
//  wordnet.m:393
      Map0_53 = ((wordnet.Wndata_0) HeadVar__7_36).F1;
      TypeCtorInfo_13_56 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
      TypeCtorInfo_14_57 = jmercury.runtime.TypeInfo_Struct.maybe_new(wordnet.wordnet__type_ctor_info_wnspec_0);
//  wordnet.m:394
      {
        Map_54 = multi_map.set_4_p_0(TypeCtorInfo_13_56, TypeCtorInfo_14_57, ((java.lang.Object) (HeadVar__4_33)), ((java.lang.Object) (V_38_38)), Map0_53);
      }
//  wordnet.m:395
      {
        HeadVar__8_37 = new wordnet.Wndata_0(Map_54);
      }
//  wordnet.m:389
      V_39_39 = 1;
      HeadVar__6_35 = (HeadVar__5_34 + V_39_39);
//  wordnet.m:387
return new java.lang.Object[] {
        java.lang.Integer.valueOf(HeadVar__6_35),
        ((java.lang.Object) (HeadVar__8_37))
      };
    }
  }
//  wordnet.m:353
  private static boolean IntroducedFrom__pred__is_all_consonant__351__1_2_p_0_4(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1)
  {
    {
      boolean succeeded = false;
      /* generic_type */ java.lang.Object closure = closure_arg;

      {
        succeeded = wordnet.IntroducedFrom__pred__is_all_consonant__353__1_2_p_0(((java.lang.Integer) (((java.lang.Object[]) closure)[3])).intValue(), ((java.lang.Integer) wrapper_arg_1).intValue());
      }
      return succeeded;
    }
  }
//  wordnet.m:351
  private static class introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0
    extends /* env_ptr */ java.lang.Object
  {
    public list.List_1 Cs_5;
    public jmercury.runtime.MethodPtr cont;
    public /* env_ptr */ java.lang.Object cont_env_ptr;
    public boolean succeeded;
    public int HeadVar__2_10;
    public jmercury.runtime.TypeInfo_Struct TypeCtorInfo_35_35;
    public /* closure */ java.lang.Object[] V_30_30;
//  wordnet.m:352
    public java.lang.Object conv0_HeadVar__2_10;

  }

  private static void IntroducedFrom__pred__is_all_consonant__351__1_2_p_0_3(
    java.lang.Object arg1,
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0 env_ptr = (wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0) env_ptr_arg;

      ((wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0) env_ptr).conv0_HeadVar__2_10 = arg1;
      {
        wordnet.IntroducedFrom__pred__is_all_consonant__351__1_2_p_0_2(env_ptr);
      }
    }
  }
  private static void IntroducedFrom__pred__is_all_consonant__351__1_2_p_0_2(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0 env_ptr = (wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0) env_ptr_arg;

      ((wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0) env_ptr).HeadVar__2_10 = ((java.lang.Integer) (((wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0) env_ptr).conv0_HeadVar__2_10)).intValue();
      {
        wordnet.IntroducedFrom__pred__is_all_consonant__351__1_2_p_0_1(env_ptr);
      }
    }
  }
//  wordnet.m:351
  private static void IntroducedFrom__pred__is_all_consonant__351__1_2_p_0_1(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0 env_ptr = (wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0) env_ptr_arg;

//  wordnet.m:353
      {
        ((wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0) env_ptr).V_30_30 = new /* closure */ java.lang.Object[] {((java.lang.Object) (wordnet.MR_scalar_common_3[1])), ((java.lang.Object) (new AddrOf2_0(22))), java.lang.Integer.valueOf(1), java.lang.Integer.valueOf(((wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0) env_ptr).HeadVar__2_10)};
      }
      {
        ((wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0) env_ptr).succeeded = list.all_true_2_p_0(((wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0) env_ptr).TypeCtorInfo_35_35, ((wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0) env_ptr).V_30_30, ((wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0) env_ptr).Cs_5);
      }
      if (((wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0) env_ptr).succeeded)
        {
          ((jmercury.runtime.MethodPtr2) (((wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0) env_ptr).cont)).call___0_0(java.lang.Integer.valueOf(((wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0) env_ptr).HeadVar__2_10), ((java.lang.Object) (((wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0) env_ptr).cont_env_ptr)));
        }
//  wordnet.m:351
    }
  }
  private static void IntroducedFrom__pred__is_all_consonant__351__1_2_p_0(
    list.List_1 Cs_5,
    jmercury.runtime.MethodPtr cont,
    /* env_ptr */ java.lang.Object cont_env_ptr)
  {
    {
      wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0 env = null;
      wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0 env_ptr = null;

      {
        env = new wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0();
      }
      env_ptr = env;
      ((wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0) env_ptr).Cs_5 = Cs_5;
      ((wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0) env_ptr).cont = cont;
      ((wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0) env_ptr).cont_env_ptr = cont_env_ptr;
      {
        list.List_1 V_11_11 = (list.List_1) wordnet.MR_scalar_common_6[8];

        ((wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0) env_ptr).TypeCtorInfo_35_35 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_character_0);
//  wordnet.m:352
        {
          list.member_2_p_1(((wordnet.introducedFrom__pred__is_all_consonant__351__1_2_p_0_env_0) env_ptr).TypeCtorInfo_35_35, V_11_11, new AddrOf2_0(23), env_ptr);
        }
//  wordnet.m:351
      }
    }
  }
//  wordnet.m:353
  private static boolean IntroducedFrom__pred__is_all_consonant__353__1_2_p_0(
    int HeadVar__1_10,
    int HeadVar__2_31)
  {
    {
      boolean succeeded = (HeadVar__2_31 == HeadVar__1_10);

      return succeeded;
    }
  }
//  wordnet.m:43
  private static builtin.Comparison_result_0 __Compare____wnspec_0_0(
    wordnet.Wnspec_0 HeadVar__2_2,
    wordnet.Wnspec_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_37 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_38 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_37 == CastY_38);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        if ((HeadVar__2_2.data_tag == 1))
          {
            int V_46_46 = ((wordnet.Wnspec_0.Component_4) HeadVar__2_2).F4;
            int V_47_47 = ((wordnet.Wnspec_0.Component_4) HeadVar__2_2).F3;
            int V_48_48 = ((wordnet.Wnspec_0.Component_4) HeadVar__2_2).F2;
            int V_49_49 = ((wordnet.Wnspec_0.Component_4) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 1))
              {
                int V_30_30 = ((wordnet.Wnspec_0.Component_4) HeadVar__3_3).F1;
                int V_31_31 = ((wordnet.Wnspec_0.Component_4) HeadVar__3_3).F2;
                int V_32_32 = ((wordnet.Wnspec_0.Component_4) HeadVar__3_3).F3;
                int V_33_33 = ((wordnet.Wnspec_0.Component_4) HeadVar__3_3).F4;
                builtin.Comparison_result_0 V_34_34 = null;

                {
                  V_34_34 = private_builtin.builtin_compare_int_3_p_0(V_49_49, V_30_30);
                }
                succeeded = (V_34_34.MR_value == builtin.Comparison_result_0.K0.MR_value);
                succeeded = !(succeeded);
                if (succeeded)
                  HeadVar__1_1 = V_34_34;
                else
                  {
                    builtin.Comparison_result_0 V_35_35 = null;

                    {
                      V_35_35 = private_builtin.builtin_compare_int_3_p_0(V_48_48, V_31_31);
                    }
                    succeeded = (V_35_35.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_35_35;
                    else
                      {
                        builtin.Comparison_result_0 V_36_36 = null;

                        {
                          V_36_36 = private_builtin.builtin_compare_int_3_p_0(V_47_47, V_32_32);
                        }
                        succeeded = (V_36_36.MR_value == builtin.Comparison_result_0.K0.MR_value);
                        succeeded = !(succeeded);
                        if (succeeded)
                          HeadVar__1_1 = V_36_36;
                        else
                          {
                            HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_46_46, V_33_33);
                          }
                      }
                  }
              }
            else
              HeadVar__1_1 = builtin.Comparison_result_0.K2;
          }
        else
          {
            int V_50_50 = ((wordnet.Wnspec_0.Word_3) HeadVar__2_2).F3;
            int V_51_51 = ((wordnet.Wnspec_0.Word_3) HeadVar__2_2).F2;
            wordnet.Syncat_0 V_52_52 = ((wordnet.Wnspec_0.Word_3) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 1))
              HeadVar__1_1 = builtin.Comparison_result_0.K1;
            else
              {
                wordnet.Syncat_0 V_7_7 = ((wordnet.Wnspec_0.Word_3) HeadVar__3_3).F1;
                int V_8_8 = ((wordnet.Wnspec_0.Word_3) HeadVar__3_3).F2;
                int V_9_9 = ((wordnet.Wnspec_0.Word_3) HeadVar__3_3).F3;
                builtin.Comparison_result_0 V_10_10 = null;
                int V_53_53 = (int) V_52_52.MR_value;
                int V_54_54 = (int) V_7_7.MR_value;

                {
                  V_10_10 = private_builtin.builtin_compare_int_3_p_0(V_53_53, V_54_54);
                }
                succeeded = (V_10_10.MR_value == builtin.Comparison_result_0.K0.MR_value);
                succeeded = !(succeeded);
                if (succeeded)
                  HeadVar__1_1 = V_10_10;
                else
                  {
                    builtin.Comparison_result_0 V_11_11 = null;

                    {
                      V_11_11 = private_builtin.builtin_compare_int_3_p_0(V_51_51, V_8_8);
                    }
                    succeeded = (V_11_11.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_11_11;
                    else
                      {
                        HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_50_50, V_9_9);
                      }
                  }
              }
          }
      return HeadVar__1_1;
    }
  }
  private static boolean __Unify____wnspec_0_0(
    wordnet.Wnspec_0 HeadVar__1_1,
    wordnet.Wnspec_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_17 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_18 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_17 == CastY_18);
      if (succeeded)
        succeeded = true;
      else
        if ((HeadVar__1_1.data_tag == 1))
          {
            int V_9_9 = ((wordnet.Wnspec_0.Component_4) HeadVar__1_1).F1;
            int V_10_10 = ((wordnet.Wnspec_0.Component_4) HeadVar__1_1).F2;
            int V_11_11 = ((wordnet.Wnspec_0.Component_4) HeadVar__1_1).F3;
            int V_12_12 = ((wordnet.Wnspec_0.Component_4) HeadVar__1_1).F4;
            int V_13_13 = 0;
            int V_14_14 = 0;
            int V_15_15 = 0;
            int V_16_16 = 0;

            succeeded = (HeadVar__2_2.data_tag == 1);
            if (succeeded)
              {
                V_13_13 = ((wordnet.Wnspec_0.Component_4) HeadVar__2_2).F1;
                V_14_14 = ((wordnet.Wnspec_0.Component_4) HeadVar__2_2).F2;
                V_15_15 = ((wordnet.Wnspec_0.Component_4) HeadVar__2_2).F3;
                V_16_16 = ((wordnet.Wnspec_0.Component_4) HeadVar__2_2).F4;
                succeeded = (V_9_9 == V_13_13);
                if (succeeded)
                  {
                    succeeded = (V_10_10 == V_14_14);
                    if (succeeded)
                      {
                        succeeded = (V_11_11 == V_15_15);
                        if (succeeded)
                          succeeded = (V_12_12 == V_16_16);
                      }
                  }
              }
          }
        else
          {
            wordnet.Syncat_0 V_3_3 = ((wordnet.Wnspec_0.Word_3) HeadVar__1_1).F1;
            int V_4_4 = ((wordnet.Wnspec_0.Word_3) HeadVar__1_1).F2;
            int V_5_5 = ((wordnet.Wnspec_0.Word_3) HeadVar__1_1).F3;
            wordnet.Syncat_0 V_6_6 = null;
            int V_7_7 = 0;
            int V_8_8 = 0;

            succeeded = (HeadVar__2_2.data_tag == 0);
            if (succeeded)
              {
                V_6_6 = ((wordnet.Wnspec_0.Word_3) HeadVar__2_2).F1;
                V_7_7 = ((wordnet.Wnspec_0.Word_3) HeadVar__2_2).F2;
                V_8_8 = ((wordnet.Wnspec_0.Word_3) HeadVar__2_2).F3;
                succeeded = (V_3_3.MR_value == V_6_6.MR_value);
                if (succeeded)
                  {
                    succeeded = (V_4_4 == V_7_7);
                    if (succeeded)
                      succeeded = (V_5_5 == V_8_8);
                  }
              }
          }
      return succeeded;
    }
  }
//  wordnet.m:41
  public static builtin.Comparison_result_0 __Compare____wndata_0_0(
    wordnet.Wndata_0 HeadVar__2_2,
    wordnet.Wndata_0 HeadVar__3_3)
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
          jmercury.runtime.TypeInfo_Struct TypeInfo_8_8 = jmercury.runtime.TypeInfo_Struct.maybe_new(wordnet.MR_scalar_common_1[2]);
          tree234.Tree234_2 V_4_4 = ((wordnet.Wndata_0) HeadVar__2_2).F1;
          tree234.Tree234_2 V_5_5 = ((wordnet.Wndata_0) HeadVar__3_3).F1;

          {
            HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_8_8, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_5_5)));
          }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____wndata_0_0(
    wordnet.Wndata_0 HeadVar__1_1,
    wordnet.Wndata_0 HeadVar__2_2)
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
          jmercury.runtime.TypeInfo_Struct TypeInfo_7_7 = jmercury.runtime.TypeInfo_Struct.maybe_new(wordnet.MR_scalar_common_1[2]);
          tree234.Tree234_2 V_3_3 = ((wordnet.Wndata_0) HeadVar__1_1).F1;
          tree234.Tree234_2 V_4_4 = ((wordnet.Wndata_0) HeadVar__2_2).F1;

          {
            succeeded = builtin.unify_2_p_0(TypeInfo_7_7, ((java.lang.Object) (V_3_3)), ((java.lang.Object) (V_4_4)));
          }
        }
      return succeeded;
    }
  }
//  wordnet.m:39
  private static builtin.Comparison_result_0 __Compare____wnclause_0_0(
    wordnet.Wnclause_0 HeadVar__2_2,
    wordnet.Wnclause_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_15 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_16 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_15 == CastY_16);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        {
          java.lang.String V_4_4 = ((wordnet.Wnclause_0) HeadVar__2_2).F1;
          wordnet.Syncat_0 V_5_5 = ((wordnet.Wnclause_0) HeadVar__2_2).F2;
          int V_6_6 = ((wordnet.Wnclause_0) HeadVar__2_2).F3;
          int V_7_7 = ((wordnet.Wnclause_0) HeadVar__2_2).F4;
          java.lang.String V_8_8 = ((wordnet.Wnclause_0) HeadVar__3_3).F1;
          wordnet.Syncat_0 V_9_9 = ((wordnet.Wnclause_0) HeadVar__3_3).F2;
          int V_10_10 = ((wordnet.Wnclause_0) HeadVar__3_3).F3;
          int V_11_11 = ((wordnet.Wnclause_0) HeadVar__3_3).F4;
          builtin.Comparison_result_0 V_12_12 = null;

          {
            V_12_12 = private_builtin.builtin_compare_string_3_p_0(V_4_4, V_8_8);
          }
          succeeded = (V_12_12.MR_value == builtin.Comparison_result_0.K0.MR_value);
          succeeded = !(succeeded);
          if (succeeded)
            HeadVar__1_1 = V_12_12;
          else
            {
              builtin.Comparison_result_0 V_13_13 = null;
              int V_21_21 = (int) V_5_5.MR_value;
              int V_22_22 = (int) V_9_9.MR_value;

              {
                V_13_13 = private_builtin.builtin_compare_int_3_p_0(V_21_21, V_22_22);
              }
              succeeded = (V_13_13.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_13_13;
              else
                {
                  builtin.Comparison_result_0 V_14_14 = null;

                  {
                    V_14_14 = private_builtin.builtin_compare_int_3_p_0(V_6_6, V_10_10);
                  }
                  succeeded = (V_14_14.MR_value == builtin.Comparison_result_0.K0.MR_value);
                  succeeded = !(succeeded);
                  if (succeeded)
                    HeadVar__1_1 = V_14_14;
                  else
                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_7_7, V_11_11);
                    }
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  private static boolean __Unify____wnclause_0_0(
    wordnet.Wnclause_0 HeadVar__1_1,
    wordnet.Wnclause_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_11 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_12 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_11 == CastY_12);
      if (succeeded)
        succeeded = true;
      else
        {
          java.lang.String V_3_3 = ((wordnet.Wnclause_0) HeadVar__1_1).F1;
          wordnet.Syncat_0 V_4_4 = ((wordnet.Wnclause_0) HeadVar__1_1).F2;
          int V_5_5 = ((wordnet.Wnclause_0) HeadVar__1_1).F3;
          int V_6_6 = ((wordnet.Wnclause_0) HeadVar__1_1).F4;
          java.lang.String V_7_7 = ((wordnet.Wnclause_0) HeadVar__2_2).F1;
          wordnet.Syncat_0 V_8_8 = ((wordnet.Wnclause_0) HeadVar__2_2).F2;
          int V_9_9 = ((wordnet.Wnclause_0) HeadVar__2_2).F3;
          int V_10_10 = ((wordnet.Wnclause_0) HeadVar__2_2).F4;

          succeeded = V_3_3.equals(V_7_7);
          if (succeeded)
            {
              succeeded = (V_4_4.MR_value == V_8_8.MR_value);
              if (succeeded)
                {
                  succeeded = (V_5_5 == V_9_9);
                  if (succeeded)
                    succeeded = (V_6_6 == V_10_10);
                }
            }
        }
      return succeeded;
    }
  }
//  wordnet.m:42
  private static builtin.Comparison_result_0 __Compare____wdmap_0_0(
    tree234.Tree234_2 HeadVar__2_2,
    tree234.Tree234_2 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(wordnet.MR_scalar_common_1[2]);
      tree234.Tree234_2 Cast_HeadVar1_4 = HeadVar__2_2;
      tree234.Tree234_2 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  private static boolean __Unify____wdmap_0_0(
    tree234.Tree234_2 HeadVar__1_1,
    tree234.Tree234_2 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(wordnet.MR_scalar_common_1[2]);
      tree234.Tree234_2 Cast_HeadVar1_3 = HeadVar__1_1;
      tree234.Tree234_2 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  wordnet.m:7
  public static builtin.Comparison_result_0 __Compare____syncat_0_0(
    wordnet.Syncat_0 HeadVar__2_2,
    wordnet.Syncat_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      int Cast_HeadVar1_4 = (int) HeadVar__2_2.MR_value;
      int Cast_HeadVar2_5 = (int) HeadVar__3_3.MR_value;

      {
        HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(Cast_HeadVar1_4, Cast_HeadVar2_5);
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____syncat_0_0(
    wordnet.Syncat_0 HeadVar__2_1,
    wordnet.Syncat_0 HeadVar__2_2)
  {
    {
      boolean succeeded = (HeadVar__2_1.MR_value == HeadVar__2_2.MR_value);

      return succeeded;
    }
  }
//  wordnet.m:11
  public static builtin.Comparison_result_0 __Compare____prontp_0_0(
    wordnet.Prontp_0 HeadVar__2_2,
    wordnet.Prontp_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      int Cast_HeadVar1_4 = (int) HeadVar__2_2.MR_value;
      int Cast_HeadVar2_5 = (int) HeadVar__3_3.MR_value;

      {
        HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(Cast_HeadVar1_4, Cast_HeadVar2_5);
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____prontp_0_0(
    wordnet.Prontp_0 HeadVar__2_1,
    wordnet.Prontp_0 HeadVar__2_2)
  {
    {
      boolean succeeded = (HeadVar__2_1.MR_value == HeadVar__2_2.MR_value);

      return succeeded;
    }
  }
//  wordnet.m:15
  public static builtin.Comparison_result_0 __Compare____prep_0_0()
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = builtin.Comparison_result_0.K0;

      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____prep_0_0()
  {
    {
      boolean succeeded = true;

      return succeeded;
    }
  }
//  wordnet.m:13
  public static builtin.Comparison_result_0 __Compare____pptp_0_0(
    wordnet.Pptp_0 HeadVar__2_2,
    wordnet.Pptp_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_11 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_12 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_11 == CastY_12);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        {
          wordnet.Ctp_0 V_5_5 = ((wordnet.Pptp_0) HeadVar__2_2).F2;
          java.lang.String V_6_6 = ((wordnet.Pptp_0) HeadVar__2_2).F3;
          wordnet.Ctp_0 V_8_8 = ((wordnet.Pptp_0) HeadVar__3_3).F2;
          java.lang.String V_9_9 = ((wordnet.Pptp_0) HeadVar__3_3).F3;
          builtin.Comparison_result_0 V_10_10 = null;

          {
            V_10_10 = wordnet.__Compare____ctp_0_0(V_5_5, V_8_8);
          }
          succeeded = (V_10_10.MR_value == builtin.Comparison_result_0.K0.MR_value);
          succeeded = !(succeeded);
          if (succeeded)
            HeadVar__1_1 = V_10_10;
          else
            {
              HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_6_6, V_9_9);
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____pptp_0_0(
    wordnet.Pptp_0 HeadVar__1_1,
    wordnet.Pptp_0 HeadVar__2_2)
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
          wordnet.Ctp_0 V_4_4 = ((wordnet.Pptp_0) HeadVar__1_1).F2;
          java.lang.String V_5_5 = ((wordnet.Pptp_0) HeadVar__1_1).F3;
          wordnet.Ctp_0 V_7_7 = ((wordnet.Pptp_0) HeadVar__2_2).F2;
          java.lang.String V_8_8 = ((wordnet.Pptp_0) HeadVar__2_2).F3;

          {
            succeeded = wordnet.__Unify____ctp_0_0(V_4_4, V_7_7);
          }
          if (succeeded)
            succeeded = V_5_5.equals(V_8_8);
        }
      return succeeded;
    }
  }
//  wordnet.m:9
  public static builtin.Comparison_result_0 __Compare____nountp_0_0()
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = builtin.Comparison_result_0.K0;

      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____nountp_0_0()
  {
    {
      boolean succeeded = true;

      return succeeded;
    }
  }
//  wordnet.m:18
  public static builtin.Comparison_result_0 __Compare____mwndata_0_0(
    maybe.Maybe_1 HeadVar__2_2,
    maybe.Maybe_1 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(wordnet.MR_scalar_common_1[0]);
      maybe.Maybe_1 Cast_HeadVar1_4 = HeadVar__2_2;
      maybe.Maybe_1 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____mwndata_0_0(
    maybe.Maybe_1 HeadVar__1_1,
    maybe.Maybe_1 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(wordnet.MR_scalar_common_1[0]);
      maybe.Maybe_1 Cast_HeadVar1_3 = HeadVar__1_1;
      maybe.Maybe_1 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  wordnet.m:14
  public static builtin.Comparison_result_0 __Compare____ctp_0_0(
    wordnet.Ctp_0 HeadVar__2_2,
    wordnet.Ctp_0 HeadVar__3_3)
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
        if ((HeadVar__2_2.data_tag == 0))
          if ((HeadVar__3_3.data_tag == 0))
            HeadVar__1_1 = builtin.Comparison_result_0.K0;
          else
            HeadVar__1_1 = builtin.Comparison_result_0.K1;
        else
          {
            wordnet.Prontp_0 V_16_16 = ((wordnet.Ctp_0.Pron_1) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 0))
              HeadVar__1_1 = builtin.Comparison_result_0.K2;
            else
              {
                wordnet.Prontp_0 V_11_11 = ((wordnet.Ctp_0.Pron_1) HeadVar__3_3).F1;
                int V_17_17 = (int) V_16_16.MR_value;
                int V_18_18 = (int) V_11_11.MR_value;

                {
                  HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_17_17, V_18_18);
                }
              }
          }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____ctp_0_0(
    wordnet.Ctp_0 HeadVar__1_1,
    wordnet.Ctp_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_7 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_8 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_7 == CastY_8);
      if (succeeded)
        succeeded = true;
      else
        if ((HeadVar__1_1.data_tag == 0))
          succeeded = (HeadVar__2_2.data_tag == 0);
        else
          {
            wordnet.Prontp_0 V_5_5 = ((wordnet.Ctp_0.Pron_1) HeadVar__1_1).F1;
            wordnet.Prontp_0 V_6_6 = null;

            succeeded = (HeadVar__2_2.data_tag == 1);
            if (succeeded)
              {
                V_6_6 = ((wordnet.Ctp_0.Pron_1) HeadVar__2_2).F1;
                succeeded = (V_5_5.MR_value == V_6_6.MR_value);
              }
          }
      return succeeded;
    }
  }
//  wordnet.m:387
  private static java.lang.Object [] read_wordnet_8_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_4)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      java.lang.Object wrapper_arg_5 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      int conv1_HeadVar__6_35 = 0;
      wordnet.Wndata_0 conv0_HeadVar__8_37 = null;

      {
        java.lang.Object [] result = wordnet.IntroducedFrom__pred__wordnet_clause__387__1_8_p_0(((java.lang.Integer) (((java.lang.Object[]) closure)[3])).intValue(), ((java.lang.Integer) (((java.lang.Object[]) closure)[4])).intValue(), ((java.lang.Integer) (((java.lang.Object[]) closure)[5])).intValue(), ((java.lang.String) wrapper_arg_1), ((java.lang.Integer) wrapper_arg_2).intValue(), ((wordnet.Wndata_0) wrapper_arg_4));
        conv1_HeadVar__6_35 = ((java.lang.Integer) result[0]).intValue();
        conv0_HeadVar__8_37 = (wordnet.Wndata_0) result[1];
      }
      wrapper_arg_3 = java.lang.Integer.valueOf(conv1_HeadVar__6_35);
      wrapper_arg_5 = ((java.lang.Object) (conv0_HeadVar__8_37));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_3)),
        ((java.lang.Object) (wrapper_arg_5))
      };
    }
  }
//  wordnet.m:368
  private static java.lang.Object [] read_wordnet_8_p_0(
    java.lang.String F_9,
    io.Input_stream_0 S_10,
    wordnet.Wndata_0 STATE_VARIABLE_Data_0_18,
    list.List_1 STATE_VARIABLE_Es_0_20)
  {
//  wordnet.m:370
    while (true)
      {
        /* tailcall optimized into a loop */
        {
          boolean succeeded = false;
          wordnet.Wndata_0 STATE_VARIABLE_Data_19 = null;
          list.List_1 STATE_VARIABLE_Es_21 = null;
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_33_33 = jmercury.runtime.TypeInfo_Struct.maybe_new(wordnet.wordnet__type_ctor_info_wnclause_0);
          io.Read_result_1 Res_14 = null;

//  wordnet.m:371
          {
            Res_14 = io.read_4_p_0(TypeCtorInfo_33_33, S_10);
          }
//  wordnet.m:375
          switch (Res_14.data_tag) {
            case 0:
              {
                STATE_VARIABLE_Data_19 = STATE_VARIABLE_Data_0_18;
                STATE_VARIABLE_Es_21 = STATE_VARIABLE_Es_0_20;
              }
              break;
            case 1:
//  wordnet.m:372
              {
                wordnet.Wnclause_0 C_15 = ((wordnet.Wnclause_0) ((io.Read_result_1.Ok_1) Res_14).F1);
                wordnet.Wndata_0 STATE_VARIABLE_Data_28_28 = null;
                java.lang.String Str_40 = ((wordnet.Wnclause_0) C_15).F1;
                wordnet.Syncat_0 Cat_41 = ((wordnet.Wnclause_0) C_15).F2;
                int Synset_42 = ((wordnet.Wnclause_0) C_15).F3;
                int Pos_43 = ((wordnet.Wnclause_0) C_15).F4;
                list.List_1 Ss_46 = null;
//  wordnet.m:386
                java.lang.String W_47 = null;
//  wordnet.m:384
                list.List_1 V_55_55 = null;

//  wordnet.m:383
                {
                  Ss_46 = string.words_1_f_0(Str_40);
                }
//  wordnet.m:384
                succeeded = (Ss_46.data_tag == 1);
                if (succeeded)
                  {
                    W_47 = ((java.lang.String) ((list.List_1.F_cons_2) Ss_46).F1);
                    V_55_55 = ((list.List_1.F_cons_2) Ss_46).F2;
                    succeeded = (V_55_55.data_tag == 0);
                  }
//  wordnet.m:386
                if (succeeded)
//  wordnet.m:385
                  {
                    jmercury.runtime.TypeInfo_Struct TypeCtorInfo_13_84 = null;
                    jmercury.runtime.TypeInfo_Struct TypeCtorInfo_14_85 = null;
                    wordnet.Wnspec_0 V_56_56 = null;
                    tree234.Tree234_2 Map0_81 = null;
                    tree234.Tree234_2 Map_82 = null;

                    {
                      V_56_56 = new wordnet.Wnspec_0.Word_3(Cat_41, Synset_42, Pos_43);
                    }
//  wordnet.m:393
                    Map0_81 = ((wordnet.Wndata_0) STATE_VARIABLE_Data_0_18).F1;
                    TypeCtorInfo_13_84 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
                    TypeCtorInfo_14_85 = jmercury.runtime.TypeInfo_Struct.maybe_new(wordnet.wordnet__type_ctor_info_wnspec_0);
//  wordnet.m:394
                    {
                      Map_82 = multi_map.set_4_p_0(TypeCtorInfo_13_84, TypeCtorInfo_14_85, ((java.lang.Object) (W_47)), ((java.lang.Object) (V_56_56)), Map0_81);
                    }
//  wordnet.m:395
                    {
                      STATE_VARIABLE_Data_28_28 = new wordnet.Wndata_0(Map_82);
                    }
//  wordnet.m:385
                  }
//  wordnet.m:386
                else
                  {
                    jmercury.runtime.TypeInfo_Struct TypeCtorInfo_45_73 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
                    jmercury.runtime.TypeInfo_Struct TypeCtorInfo_46_74 = null;
                    jmercury.runtime.TypeInfo_Struct TypeCtorInfo_47_75 = null;
                    int N_48 = 0;
                    /* closure */ java.lang.Object[] V_58_58 = null;
                    int V_59_59 = 0;
//  wordnet.m:387
                    int V_54_54 = 0;
                    java.lang.Object conv3_V_54_54 = null;
                    java.lang.Object conv2_STATE_VARIABLE_Data_28_28 = null;

//  wordnet.m:386
                    {
                      N_48 = list.length_2_p_0(TypeCtorInfo_45_73, Ss_46);
                    }
//  wordnet.m:387
                    {
                      V_58_58 = new /* closure */ java.lang.Object[] {((java.lang.Object) (wordnet.MR_scalar_common_5[0])), ((java.lang.Object) (new AddrOf4_0())), java.lang.Integer.valueOf(3), java.lang.Integer.valueOf(Synset_42), java.lang.Integer.valueOf(Pos_43), java.lang.Integer.valueOf(N_48)};
                    }
                    V_59_59 = 1;
                    TypeCtorInfo_46_74 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
                    TypeCtorInfo_47_75 = jmercury.runtime.TypeInfo_Struct.maybe_new(wordnet.wordnet__type_ctor_info_wndata_0);
                    {
                      java.lang.Object [] result = list.foldl2_6_p_0(TypeCtorInfo_45_73, TypeCtorInfo_46_74, TypeCtorInfo_47_75, V_58_58, Ss_46, java.lang.Integer.valueOf(V_59_59), ((java.lang.Object) (STATE_VARIABLE_Data_0_18)));
                      conv3_V_54_54 = (java.lang.Object) result[0];
                      conv2_STATE_VARIABLE_Data_28_28 = (java.lang.Object) result[1];
                    }
                    V_54_54 = ((java.lang.Integer) conv3_V_54_54).intValue();
                    STATE_VARIABLE_Data_28_28 = ((wordnet.Wndata_0) conv2_STATE_VARIABLE_Data_28_28);
//  wordnet.m:386
                  }
//  wordnet.m:374
                /* direct tailcall eliminated */
                {
                  wordnet.Wndata_0 STATE_VARIABLE_Data_0__tmp_copy_18 = STATE_VARIABLE_Data_28_28;

                  STATE_VARIABLE_Data_0_18 = STATE_VARIABLE_Data_0__tmp_copy_18;
                }
                continue;
//  wordnet.m:372
              }
//  wordnet.m:375
            case 2:
//  wordnet.m:376
              {
                jmercury.runtime.TypeInfo_Struct TypeCtorInfo_34_34 = null;
                java.lang.String Msg_16 = ((io.Read_result_1.Error_2) Res_14).F1;
                int N_17 = ((io.Read_result_1.Error_2) Res_14).F2;
                errors.Err_loc_0 V_25_25 = null;
                sberrs.Error_0 V_26_26 = null;

//  wordnet.m:377
                {
                  V_25_25 = new errors.Err_loc_0.File_2(F_9, N_17);
                }
                {
                  V_26_26 = new sberrs.Error_0.Io_1(Msg_16);
                }
                TypeCtorInfo_34_34 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
                {
                  STATE_VARIABLE_Es_21 = errors.add_error_4_p_0(TypeCtorInfo_34_34, V_25_25, ((java.lang.Object) (V_26_26)), STATE_VARIABLE_Es_0_20);
                }
                STATE_VARIABLE_Data_19 = STATE_VARIABLE_Data_0_18;
//  wordnet.m:376
              }
//  wordnet.m:375
              break;
            default: /*NOTREACHED*/
              throw new jmercury.runtime.UnreachableDefault();
          }
//  wordnet.m:370
return new java.lang.Object[] {
            ((java.lang.Object) (STATE_VARIABLE_Data_19)),
            ((java.lang.Object) (STATE_VARIABLE_Es_21))
          };
        }
      }
//  wordnet.m:368
  }
//  wordnet.m:351
  private static class Doubled_consonant_3_p_0_3_env_0
    extends /* env_ptr */ java.lang.Object
  {
    public jmercury.runtime.MethodPtr cont;
    public /* env_ptr */ java.lang.Object cont_env_ptr;
    public java.lang.Object wrapper_arg_1;
    public int conv0_HeadVar__2_10;

  }

  private static void doubled_consonant_3_p_0_2(
    int arg1,
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      wordnet.Doubled_consonant_3_p_0_3_env_0 env_ptr = (wordnet.Doubled_consonant_3_p_0_3_env_0) env_ptr_arg;

      ((wordnet.Doubled_consonant_3_p_0_3_env_0) env_ptr).conv0_HeadVar__2_10 = arg1;
      {
        wordnet.doubled_consonant_3_p_0_1(env_ptr);
      }
    }
  }
  private static void doubled_consonant_3_p_0_1(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      wordnet.Doubled_consonant_3_p_0_3_env_0 env_ptr = (wordnet.Doubled_consonant_3_p_0_3_env_0) env_ptr_arg;

      ((wordnet.Doubled_consonant_3_p_0_3_env_0) env_ptr).wrapper_arg_1 = java.lang.Integer.valueOf(((wordnet.Doubled_consonant_3_p_0_3_env_0) env_ptr).conv0_HeadVar__2_10);
      {
        ((jmercury.runtime.MethodPtr2) (((wordnet.Doubled_consonant_3_p_0_3_env_0) env_ptr).cont)).call___0_0(((java.lang.Object) (((wordnet.Doubled_consonant_3_p_0_3_env_0) env_ptr).wrapper_arg_1)), ((java.lang.Object) (((wordnet.Doubled_consonant_3_p_0_3_env_0) env_ptr).cont_env_ptr)));
      }
    }
  }
  private static void doubled_consonant_3_p_0_3(
    /* generic_type */ java.lang.Object closure_arg,
    jmercury.runtime.MethodPtr cont,
    /* env_ptr */ java.lang.Object cont_env_ptr)
  {
    {
      wordnet.Doubled_consonant_3_p_0_3_env_0 env = null;
      wordnet.Doubled_consonant_3_p_0_3_env_0 env_ptr = null;

      {
        env = new wordnet.Doubled_consonant_3_p_0_3_env_0();
      }
      env_ptr = env;
      ((wordnet.Doubled_consonant_3_p_0_3_env_0) env_ptr).cont = cont;
      ((wordnet.Doubled_consonant_3_p_0_3_env_0) env_ptr).cont_env_ptr = cont_env_ptr;
      {
        /* generic_type */ java.lang.Object closure = closure_arg;

        {
          wordnet.IntroducedFrom__pred__is_all_consonant__351__1_2_p_0(((list.List_1) ((java.lang.Object[]) closure)[3]), new AddrOf2_0(24), env_ptr);
        }
      }
    }
  }
//  wordnet.m:343
  private static java.lang.Object [] doubled_consonant_3_p_0(
    java.lang.String S0_4,
    java.lang.String Suffix_5)
  {
//  wordnet.m:344
    {
      boolean succeeded = false;
      java.lang.String S_6 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_36_46 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_38_48 = null;
      java.lang.String S1_7 = null;
      java.lang.String DC_8 = null;
      java.lang.String S2_9 = null;
      int C_10 = '\u0000';
      int V_11_11 = 0;
      java.lang.String V_12_12 = null;
      list.List_1 Cs_15 = null;
      /* closure */ java.lang.Object[] V_18_18 = null;
      list.List_1 V_19_19 = null;
      list.List_1 V_42_42 = null;
      list.List_1 V_47_47 = null;

//  wordnet.m:345
      {
        java.lang.Object [] result = string.remove_suffix_3_p_0(S0_4, Suffix_5);
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        S1_7 = (java.lang.String) result[1];
      }
//  wordnet.m:344
      if (succeeded)
        {
//  wordnet.m:345
          V_11_11 = 2;
          {
            DC_8 = string.right_3_p_0(S1_7, V_11_11);
          }
          {
            java.lang.Object [] result = string.remove_suffix_3_p_0(S1_7, DC_8);
            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
            S2_9 = (java.lang.String) result[1];
          }
//  wordnet.m:344
          if (succeeded)
            {
//  wordnet.m:350
              {
                Cs_15 = string.to_char_list_2_p_0(DC_8);
              }
//  wordnet.m:351
              {
                V_18_18 = new /* closure */ java.lang.Object[] {((java.lang.Object) (wordnet.MR_scalar_common_3[0])), ((java.lang.Object) (new AddrOf3_0())), java.lang.Integer.valueOf(1), ((java.lang.Object) (Cs_15))};
              }
//  wordnet.m:353
              V_42_42 = (list.List_1) wordnet.MR_scalar_common_4[0];
              TypeCtorInfo_36_46 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_character_0);
//  wordnet.m:351
              {
                V_19_19 = solutions.solutions_2_p_1(TypeCtorInfo_36_46, V_18_18);
              }
              succeeded = (V_19_19.data_tag == 1);
              if (succeeded)
                {
                  C_10 = ((java.lang.Integer) (((list.List_1.F_cons_2) V_19_19).F1)).intValue();
                  V_47_47 = ((list.List_1.F_cons_2) V_19_19).F2;
                  TypeInfo_38_48 = jmercury.runtime.TypeInfo_Struct.maybe_new(wordnet.MR_scalar_common_1[3]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_38_48, ((java.lang.Object) (V_42_42)), ((java.lang.Object) (V_47_47)));
                  }
//  wordnet.m:344
                  if (succeeded)
                    {
//  wordnet.m:346
                      {
                        V_12_12 = string.from_char_1_f_0(C_10);
                      }
                      {
                        S_6 = string.f_43_43_2_f_0(S2_9, V_12_12);
                      }
                      succeeded = true;
//  wordnet.m:344
                    }
//  wordnet.m:351
                }
//  wordnet.m:344
            }
        }
return new java.lang.Object[] {
        java.lang.Boolean.valueOf(succeeded),
        ((java.lang.Object) (S_6))
      };
    }
//  wordnet.m:343
  }
//  wordnet.m:301
  private static boolean prep_string_2_p_0(
    list.List_1 HeadVar__1_1)
  {
//  wordnet.m:302
    {
      boolean succeeded = (HeadVar__1_1.data_tag == 1);
      list.List_1 V_83_83 = null;
      java.lang.String V_84_84 = null;
      int lo_0 = 0;
      int hi_1 = 0;
      int mid_2 = 0;
      int result_3 = 0;
      int stop_loop_4 = 0;

      if (succeeded)
        {
          V_84_84 = ((java.lang.String) ((list.List_1.F_cons_2) HeadVar__1_1).F1);
          V_83_83 = ((list.List_1.F_cons_2) HeadVar__1_1).F2;
          succeeded = (V_83_83.data_tag == 0);
          if (succeeded)
            {
              /* binary string jump switch */
              succeeded = false;
              lo_0 = 0;
              hi_1 = 39;
              stop_loop_4 = 0;
              do
                {
                  mid_2 = ((lo_0 + hi_1) / 2);
                  result_3 = (V_84_84.compareTo(((wordnet.Vector_common_type_2_0) (MR_vector_common_2[228 + mid_2])).vct_2_f_0)) ;
                  if ((result_3 == 0))
                    {
                      switch (((wordnet.Vector_common_type_2_0) (MR_vector_common_2[228 + mid_2])).vct_2_f_1) {
                        case 0:
                          {
                            /* case "about" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
                          break;
                        case 1:
//  wordnet.m:303
                          {
                            /* case "across" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 2:
//  wordnet.m:304
                          {
                            /* case "after" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 3:
//  wordnet.m:305
                          {
                            /* case "against" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 4:
//  wordnet.m:306
                          {
                            /* case "alongside" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 5:
//  wordnet.m:307
                          {
                            /* case "amid" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 6:
//  wordnet.m:308
                          {
                            /* case "among" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 7:
//  wordnet.m:309
                          {
                            /* case "amongst" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 8:
//  wordnet.m:310
                          {
                            /* case "around" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 9:
//  wordnet.m:311
                          {
                            /* case "as" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 10:
//  wordnet.m:312
                          {
                            /* case "at" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 11:
//  wordnet.m:313
                          {
                            /* case "because" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 12:
//  wordnet.m:314
                          {
                            /* case "before" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 13:
//  wordnet.m:315
                          {
                            /* case "behind" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 14:
//  wordnet.m:316
                          {
                            /* case "below" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 15:
//  wordnet.m:317
                          {
                            /* case "between" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 16:
//  wordnet.m:318
                          {
                            /* case "beyond" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 17:
//  wordnet.m:319
                          {
                            /* case "by" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 18:
//  wordnet.m:320
                          {
                            /* case "down" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 19:
//  wordnet.m:321
                          {
                            /* case "during" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 20:
//  wordnet.m:322
                          {
                            /* case "except" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 21:
//  wordnet.m:323
                          {
                            /* case "for" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 22:
//  wordnet.m:324
                          {
                            /* case "from" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 23:
//  wordnet.m:325
                          {
                            /* case "in" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 24:
//  wordnet.m:326
                          {
                            /* case "into" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 25:
//  wordnet.m:327
                          {
                            /* case "like" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 26:
//  wordnet.m:328
                          {
                            /* case "of" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 27:
//  wordnet.m:329
                          {
                            /* case "on" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 28:
//  wordnet.m:330
                          {
                            /* case "over" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 29:
//  wordnet.m:331
                          {
                            /* case "since" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 30:
//  wordnet.m:332
                          {
                            /* case "than" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 31:
//  wordnet.m:333
                          {
                            /* case "through" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 32:
//  wordnet.m:334
                          {
                            /* case "towards" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 33:
//  wordnet.m:335
                          {
                            /* case "under" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 34:
//  wordnet.m:336
                          {
                            /* case "until" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 35:
//  wordnet.m:337
                          {
                            /* case "up" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 36:
//  wordnet.m:338
                          {
                            /* case "upon" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 37:
//  wordnet.m:339
                          {
                            /* case "with" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 38:
//  wordnet.m:340
                          {
                            /* case "within" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
                          break;
                        case 39:
//  wordnet.m:341
                          {
                            /* case "without" */
                            private_builtin.dummy_var = wordnet.Prep_0.K0;
                            succeeded = true;
                          }
//  wordnet.m:302
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
            }
        }
      return succeeded;
    }
//  wordnet.m:301
  }
//  wordnet.m:75
  private static java.lang.Object [] main_verb_3_p_0(
    maybe.Maybe_1 WN_4,
    java.lang.String S0_5)
  {
//  wordnet.m:78
    {
      boolean succeeded = false;
      java.lang.String Verb_6 = null;
//  wordnet.m:101
      int lo_0 = 0;
      int hi_1 = 0;
      int mid_2 = 0;
      int result_3 = 0;
      int stop_loop_4 = 0;

      /* binary string jump switch */
      succeeded = false;
      lo_0 = 0;
      hi_1 = 19;
      stop_loop_4 = 0;
      do
        {
          mid_2 = ((lo_0 + hi_1) / 2);
          result_3 = (S0_5.compareTo(((wordnet.Vector_common_type_2_0) (MR_vector_common_2[97 + mid_2])).vct_2_f_0)) ;
          if ((result_3 == 0))
            {
              switch (((wordnet.Vector_common_type_2_0) (MR_vector_common_2[97 + mid_2])).vct_2_f_1) {
                case 0:
//  wordnet.m:108
                  {
                    /* case "'m" */
                    succeeded = true;
                  }
//  wordnet.m:101
                  break;
                case 1:
//  wordnet.m:112
                  {
                    /* case "'re" */
                    succeeded = true;
                  }
//  wordnet.m:101
                  break;
                case 2:
//  wordnet.m:110
                  {
                    /* case "'s" */
                    succeeded = true;
                  }
//  wordnet.m:101
                  break;
                case 3:
//  wordnet.m:118
                  {
                    /* case "'ve" */
                    succeeded = true;
                  }
//  wordnet.m:101
                  break;
                case 4:
//  wordnet.m:107
                  {
                    /* case "am" */
                    succeeded = true;
                  }
//  wordnet.m:101
                  break;
                case 5:
//  wordnet.m:111
                  {
                    /* case "are" */
                    succeeded = true;
                  }
//  wordnet.m:101
                  break;
                case 6:
//  wordnet.m:106
                  {
                    /* case "be" */
                    succeeded = true;
                  }
//  wordnet.m:101
                  break;
                case 7:
//  wordnet.m:116
                  {
                    /* case "been" */
                    succeeded = true;
                  }
//  wordnet.m:101
                  break;
                case 8:
//  wordnet.m:115
                  {
                    /* case "being" */
                    succeeded = true;
                  }
//  wordnet.m:101
                  break;
                case 9:
//  wordnet.m:103
                  {
                    /* case "did" */
                    succeeded = true;
                  }
//  wordnet.m:101
                  break;
                case 10:
                  {
                    /* case "do" */
                    succeeded = true;
                  }
                  break;
                case 11:
//  wordnet.m:102
                  {
                    /* case "does" */
                    succeeded = true;
                  }
//  wordnet.m:101
                  break;
                case 12:
//  wordnet.m:104
                  {
                    /* case "doing" */
                    succeeded = true;
                  }
//  wordnet.m:101
                  break;
                case 13:
//  wordnet.m:105
                  {
                    /* case "done" */
                    succeeded = true;
                  }
//  wordnet.m:101
                  break;
                case 14:
//  wordnet.m:120
                  {
                    /* case "had" */
                    succeeded = true;
                  }
//  wordnet.m:101
                  break;
                case 15:
//  wordnet.m:119
                  {
                    /* case "has" */
                    succeeded = true;
                  }
//  wordnet.m:101
                  break;
                case 16:
//  wordnet.m:117
                  {
                    /* case "have" */
                    succeeded = true;
                  }
//  wordnet.m:101
                  break;
                case 17:
//  wordnet.m:109
                  {
                    /* case "is" */
                    succeeded = true;
                  }
//  wordnet.m:101
                  break;
                case 18:
//  wordnet.m:113
                  {
                    /* case "was" */
                    succeeded = true;
                  }
//  wordnet.m:101
                  break;
                case 19:
//  wordnet.m:114
                  {
                    /* case "were" */
                    succeeded = true;
                  }
//  wordnet.m:101
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
//  wordnet.m:78
      if (succeeded)
//  wordnet.m:77
        {
          Verb_6 = S0_5;
          succeeded = true;
        }
//  wordnet.m:78
      else
//  wordnet.m:79
        {
//  wordnet.m:78
          wordnet.Syncat_0 V_9_9 = wordnet.Syncat_0.K1;

          {
            succeeded = wordnet.check_word_3_p_0(WN_4, S0_5, V_9_9);
          }
//  wordnet.m:79
          if (succeeded)
//  wordnet.m:78
            {
              Verb_6 = S0_5;
              succeeded = true;
            }
//  wordnet.m:79
          else
//  wordnet.m:80
            {
              java.lang.String S_7 = null;
//  wordnet.m:79
              java.lang.String V_10_10 = "s";
              wordnet.Syncat_0 V_11_11 = null;

              {
                java.lang.Object [] result = string.remove_suffix_3_p_0(S0_5, V_10_10);
                succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                S_7 = (java.lang.String) result[1];
              }
              if (succeeded)
                {
                  V_11_11 = wordnet.Syncat_0.K1;
                  {
                    succeeded = wordnet.check_word_3_p_0(WN_4, S_7, V_11_11);
                  }
                }
//  wordnet.m:80
              if (succeeded)
//  wordnet.m:79
                {
                  Verb_6 = S_7;
                  succeeded = true;
                }
//  wordnet.m:80
              else
//  wordnet.m:81
                {
                  java.lang.String S_62 = null;
//  wordnet.m:80
                  java.lang.String V_12_12 = "d";
                  wordnet.Syncat_0 V_13_13 = null;

                  {
                    java.lang.Object [] result = string.remove_suffix_3_p_0(S0_5, V_12_12);
                    succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                    S_62 = (java.lang.String) result[1];
                  }
                  if (succeeded)
                    {
                      V_13_13 = wordnet.Syncat_0.K1;
                      {
                        succeeded = wordnet.check_word_3_p_0(WN_4, S_62, V_13_13);
                      }
                    }
//  wordnet.m:81
                  if (succeeded)
//  wordnet.m:80
                    {
                      Verb_6 = S_62;
                      succeeded = true;
                    }
//  wordnet.m:81
                  else
//  wordnet.m:82
                    {
                      java.lang.String S_61 = null;
//  wordnet.m:81
                      java.lang.String V_14_14 = "n";
                      wordnet.Syncat_0 V_15_15 = null;

                      {
                        java.lang.Object [] result = string.remove_suffix_3_p_0(S0_5, V_14_14);
                        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                        S_61 = (java.lang.String) result[1];
                      }
                      if (succeeded)
                        {
                          V_15_15 = wordnet.Syncat_0.K1;
                          {
                            succeeded = wordnet.check_word_3_p_0(WN_4, S_61, V_15_15);
                          }
                        }
//  wordnet.m:82
                      if (succeeded)
//  wordnet.m:81
                        {
                          Verb_6 = S_61;
                          succeeded = true;
                        }
//  wordnet.m:82
                      else
//  wordnet.m:83
                        {
                          java.lang.String S_60 = null;
//  wordnet.m:82
                          java.lang.String V_16_16 = "ed";
                          wordnet.Syncat_0 V_17_17 = null;

                          {
                            java.lang.Object [] result = string.remove_suffix_3_p_0(S0_5, V_16_16);
                            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                            S_60 = (java.lang.String) result[1];
                          }
                          if (succeeded)
                            {
                              V_17_17 = wordnet.Syncat_0.K1;
                              {
                                succeeded = wordnet.check_word_3_p_0(WN_4, S_60, V_17_17);
                              }
                            }
//  wordnet.m:83
                          if (succeeded)
//  wordnet.m:82
                            {
                              Verb_6 = S_60;
                              succeeded = true;
                            }
//  wordnet.m:83
                          else
//  wordnet.m:84
                            {
                              java.lang.String S_59 = null;
//  wordnet.m:83
                              java.lang.String V_18_18 = "en";
                              wordnet.Syncat_0 V_19_19 = null;

                              {
                                java.lang.Object [] result = string.remove_suffix_3_p_0(S0_5, V_18_18);
                                succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                                S_59 = (java.lang.String) result[1];
                              }
                              if (succeeded)
                                {
                                  V_19_19 = wordnet.Syncat_0.K1;
                                  {
                                    succeeded = wordnet.check_word_3_p_0(WN_4, S_59, V_19_19);
                                  }
                                }
//  wordnet.m:84
                              if (succeeded)
//  wordnet.m:83
                                {
                                  Verb_6 = S_59;
                                  succeeded = true;
                                }
//  wordnet.m:84
                              else
//  wordnet.m:85
                                {
                                  java.lang.String S_58 = null;
//  wordnet.m:84
                                  java.lang.String V_20_20 = "es";
                                  wordnet.Syncat_0 V_21_21 = null;

                                  {
                                    java.lang.Object [] result = string.remove_suffix_3_p_0(S0_5, V_20_20);
                                    succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                                    S_58 = (java.lang.String) result[1];
                                  }
                                  if (succeeded)
                                    {
                                      V_21_21 = wordnet.Syncat_0.K1;
                                      {
                                        succeeded = wordnet.check_word_3_p_0(WN_4, S_58, V_21_21);
                                      }
                                    }
//  wordnet.m:85
                                  if (succeeded)
//  wordnet.m:84
                                    {
                                      Verb_6 = S_58;
                                      succeeded = true;
                                    }
//  wordnet.m:85
                                  else
//  wordnet.m:86
                                    {
                                      java.lang.String S_57 = null;
//  wordnet.m:85
                                      java.lang.String V_22_22 = "ies";
                                      java.lang.String V_23_23 = null;
                                      wordnet.Syncat_0 V_24_24 = null;
                                      java.lang.String V_25_25 = null;

                                      {
                                        java.lang.Object [] result = string.remove_suffix_3_p_0(S0_5, V_22_22);
                                        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                                        S_57 = (java.lang.String) result[1];
                                      }
                                      if (succeeded)
                                        {
                                          V_25_25 = "y";
                                          {
                                            V_23_23 = string.f_43_43_2_f_0(S_57, V_25_25);
                                          }
                                          V_24_24 = wordnet.Syncat_0.K1;
                                          {
                                            succeeded = wordnet.check_word_3_p_0(WN_4, V_23_23, V_24_24);
                                          }
                                        }
//  wordnet.m:86
                                      if (succeeded)
//  wordnet.m:85
                                        {
                                          java.lang.String V_26_26 = "y";

                                          {
                                            Verb_6 = string.f_43_43_2_f_0(S_57, V_26_26);
                                          }
                                          succeeded = true;
                                        }
//  wordnet.m:86
                                      else
//  wordnet.m:87
                                        {
                                          java.lang.String S_56 = null;
//  wordnet.m:86
                                          java.lang.String V_27_27 = "ied";
                                          java.lang.String V_28_28 = null;
                                          wordnet.Syncat_0 V_29_29 = null;
                                          java.lang.String V_30_30 = null;

                                          {
                                            java.lang.Object [] result = string.remove_suffix_3_p_0(S0_5, V_27_27);
                                            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                                            S_56 = (java.lang.String) result[1];
                                          }
                                          if (succeeded)
                                            {
                                              V_30_30 = "y";
                                              {
                                                V_28_28 = string.f_43_43_2_f_0(S_56, V_30_30);
                                              }
                                              V_29_29 = wordnet.Syncat_0.K1;
                                              {
                                                succeeded = wordnet.check_word_3_p_0(WN_4, V_28_28, V_29_29);
                                              }
                                            }
//  wordnet.m:87
                                          if (succeeded)
//  wordnet.m:86
                                            {
                                              java.lang.String V_31_31 = "y";

                                              {
                                                Verb_6 = string.f_43_43_2_f_0(S_56, V_31_31);
                                              }
                                              succeeded = true;
                                            }
//  wordnet.m:87
                                          else
//  wordnet.m:88
                                            {
                                              java.lang.String S_55 = null;
//  wordnet.m:87
                                              java.lang.String V_32_32 = "ing";
                                              wordnet.Syncat_0 V_33_33 = null;

                                              {
                                                java.lang.Object [] result = string.remove_suffix_3_p_0(S0_5, V_32_32);
                                                succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                                                S_55 = (java.lang.String) result[1];
                                              }
                                              if (succeeded)
                                                {
                                                  V_33_33 = wordnet.Syncat_0.K1;
                                                  {
                                                    succeeded = wordnet.check_word_3_p_0(WN_4, S_55, V_33_33);
                                                  }
                                                }
//  wordnet.m:88
                                              if (succeeded)
//  wordnet.m:87
                                                {
                                                  Verb_6 = S_55;
                                                  succeeded = true;
                                                }
//  wordnet.m:88
                                              else
//  wordnet.m:89
                                                {
                                                  java.lang.String S_54 = null;
//  wordnet.m:88
                                                  java.lang.String V_34_34 = "ing";
                                                  java.lang.String V_35_35 = null;
                                                  wordnet.Syncat_0 V_36_36 = null;
                                                  java.lang.String V_37_37 = null;

                                                  {
                                                    java.lang.Object [] result = string.remove_suffix_3_p_0(S0_5, V_34_34);
                                                    succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                                                    S_54 = (java.lang.String) result[1];
                                                  }
                                                  if (succeeded)
                                                    {
                                                      V_37_37 = "e";
                                                      {
                                                        V_35_35 = string.f_43_43_2_f_0(S_54, V_37_37);
                                                      }
                                                      V_36_36 = wordnet.Syncat_0.K1;
                                                      {
                                                        succeeded = wordnet.check_word_3_p_0(WN_4, V_35_35, V_36_36);
                                                      }
                                                    }
//  wordnet.m:89
                                                  if (succeeded)
//  wordnet.m:88
                                                    {
                                                      java.lang.String V_38_38 = "e";

                                                      {
                                                        Verb_6 = string.f_43_43_2_f_0(S_54, V_38_38);
                                                      }
                                                      succeeded = true;
                                                    }
//  wordnet.m:89
                                                  else
//  wordnet.m:90
                                                    {
                                                      java.lang.String S_53 = null;
//  wordnet.m:89
                                                      java.lang.String V_39_39 = "ed";
                                                      wordnet.Syncat_0 V_40_40 = null;

                                                      {
                                                        java.lang.Object [] result = wordnet.doubled_consonant_3_p_0(S0_5, V_39_39);
                                                        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                                                        S_53 = (java.lang.String) result[1];
                                                      }
                                                      if (succeeded)
                                                        {
                                                          V_40_40 = wordnet.Syncat_0.K1;
                                                          {
                                                            succeeded = wordnet.check_word_3_p_0(WN_4, S_53, V_40_40);
                                                          }
                                                        }
//  wordnet.m:90
                                                      if (succeeded)
//  wordnet.m:89
                                                        {
                                                          Verb_6 = S_53;
                                                          succeeded = true;
                                                        }
//  wordnet.m:90
                                                      else
//  wordnet.m:91
                                                        {
                                                          java.lang.String S_52 = null;
//  wordnet.m:90
                                                          java.lang.String V_41_41 = "ing";
                                                          wordnet.Syncat_0 V_42_42 = null;

                                                          {
                                                            java.lang.Object [] result = wordnet.doubled_consonant_3_p_0(S0_5, V_41_41);
                                                            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                                                            S_52 = (java.lang.String) result[1];
                                                          }
                                                          if (succeeded)
                                                            {
                                                              V_42_42 = wordnet.Syncat_0.K1;
                                                              {
                                                                succeeded = wordnet.check_word_3_p_0(WN_4, S_52, V_42_42);
                                                              }
                                                            }
//  wordnet.m:91
                                                          if (succeeded)
//  wordnet.m:90
                                                            {
                                                              Verb_6 = S_52;
                                                              succeeded = true;
                                                            }
//  wordnet.m:91
                                                          else
//  wordnet.m:92
                                                            {
//  wordnet.m:91
                                                              java.lang.String V_43_43 = "re";
                                                              wordnet.Syncat_0 V_44_44 = null;
                                                              java.lang.String S_48 = null;

                                                              {
                                                                java.lang.Object [] result = string.remove_prefix_3_p_0(V_43_43, S0_5);
                                                                succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                                                                S_48 = (java.lang.String) result[1];
                                                              }
                                                              if (succeeded)
                                                                {
                                                                  V_44_44 = wordnet.Syncat_0.K1;
                                                                  {
                                                                    succeeded = wordnet.check_word_3_p_0(WN_4, S_48, V_44_44);
                                                                  }
                                                                }
//  wordnet.m:92
                                                              if (succeeded)
//  wordnet.m:91
                                                                {
                                                                  Verb_6 = S0_5;
                                                                  succeeded = true;
                                                                }
//  wordnet.m:92
                                                              else
//  wordnet.m:93
                                                                {
//  wordnet.m:92
                                                                  java.lang.String V_45_45 = "re-";
                                                                  wordnet.Syncat_0 V_46_46 = null;
                                                                  java.lang.String S_49 = null;

                                                                  {
                                                                    java.lang.Object [] result = string.remove_prefix_3_p_0(V_45_45, S0_5);
                                                                    succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                                                                    S_49 = (java.lang.String) result[1];
                                                                  }
                                                                  if (succeeded)
                                                                    {
                                                                      V_46_46 = wordnet.Syncat_0.K1;
                                                                      {
                                                                        succeeded = wordnet.check_word_3_p_0(WN_4, S_49, V_46_46);
                                                                      }
                                                                    }
//  wordnet.m:93
                                                                  if (succeeded)
//  wordnet.m:92
                                                                    {
                                                                      Verb_6 = S0_5;
                                                                      succeeded = true;
                                                                    }
//  wordnet.m:93
                                                                  else
                                                                    {
                                                                      wordnet.Syncat_0 V_47_47 = null;
//  wordnet.m:123
                                                                      int lo_5 = 0;
                                                                      int hi_6 = 0;
                                                                      int mid_7 = 0;
                                                                      int result_8 = 0;
                                                                      int stop_loop_9 = 0;

                                                                      /* binary string jump switch */
                                                                      succeeded = false;
                                                                      lo_5 = 0;
                                                                      hi_6 = 110;
                                                                      stop_loop_9 = 0;
                                                                      do
                                                                        {
                                                                          mid_7 = ((lo_5 + hi_6) / 2);
                                                                          result_8 = (S0_5.compareTo(((wordnet.Vector_common_type_2_0) (MR_vector_common_2[117 + mid_7])).vct_2_f_0)) ;
                                                                          if ((result_8 == 0))
                                                                            {
                                                                              switch (((wordnet.Vector_common_type_2_0) (MR_vector_common_2[117 + mid_7])).vct_2_f_1) {
                                                                                case 0:
                                                                                  {
                                                                                    /* case "admitted" */
                                                                                    Verb_6 = "admit";
                                                                                    succeeded = true;
                                                                                  }
                                                                                  break;
                                                                                case 1:
//  wordnet.m:124
                                                                                  {
                                                                                    /* case "arose" */
                                                                                    Verb_6 = "arise";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 2:
//  wordnet.m:125
                                                                                  {
                                                                                    /* case "ate" */
                                                                                    Verb_6 = "eat";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 3:
//  wordnet.m:126
                                                                                  {
                                                                                    /* case "became" */
                                                                                    Verb_6 = "become";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 4:
//  wordnet.m:127
                                                                                  {
                                                                                    /* case "began" */
                                                                                    Verb_6 = "begin";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 5:
//  wordnet.m:128
                                                                                  {
                                                                                    /* case "begun" */
                                                                                    Verb_6 = "begin";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 6:
//  wordnet.m:129
                                                                                  {
                                                                                    /* case "bled" */
                                                                                    Verb_6 = "bleed";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 7:
//  wordnet.m:130
                                                                                  {
                                                                                    /* case "blew" */
                                                                                    Verb_6 = "blow";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 8:
//  wordnet.m:131
                                                                                  {
                                                                                    /* case "born" */
                                                                                    Verb_6 = "bear";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 9:
//  wordnet.m:132
                                                                                  {
                                                                                    /* case "borne" */
                                                                                    Verb_6 = "bear";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 10:
//  wordnet.m:133
                                                                                  {
                                                                                    /* case "bought" */
                                                                                    Verb_6 = "buy";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 11:
//  wordnet.m:134
                                                                                  {
                                                                                    /* case "broke" */
                                                                                    Verb_6 = "break";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 12:
//  wordnet.m:135
                                                                                  {
                                                                                    /* case "broken" */
                                                                                    Verb_6 = "break";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 13:
//  wordnet.m:136
                                                                                  {
                                                                                    /* case "brought" */
                                                                                    Verb_6 = "bring";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 14:
//  wordnet.m:137
                                                                                  {
                                                                                    /* case "built" */
                                                                                    Verb_6 = "build";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 15:
//  wordnet.m:138
                                                                                  {
                                                                                    /* case "came" */
                                                                                    Verb_6 = "come";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 16:
//  wordnet.m:139
                                                                                  {
                                                                                    /* case "caught" */
                                                                                    Verb_6 = "catch";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 17:
//  wordnet.m:140
                                                                                  {
                                                                                    /* case "chose" */
                                                                                    Verb_6 = "choose";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 18:
//  wordnet.m:141
                                                                                  {
                                                                                    /* case "chosen" */
                                                                                    Verb_6 = "choose";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 19:
//  wordnet.m:142
                                                                                  {
                                                                                    /* case "concurred" */
                                                                                    Verb_6 = "concur";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 20:
//  wordnet.m:143
                                                                                  {
                                                                                    /* case "crept" */
                                                                                    Verb_6 = "creap";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 21:
//  wordnet.m:144
                                                                                  {
                                                                                    /* case "dealt" */
                                                                                    Verb_6 = "deal";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 22:
//  wordnet.m:145
                                                                                  {
                                                                                    /* case "drew" */
                                                                                    Verb_6 = "draw";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 23:
//  wordnet.m:146
                                                                                  {
                                                                                    /* case "dropped" */
                                                                                    Verb_6 = "drop";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 24:
//  wordnet.m:147
                                                                                  {
                                                                                    /* case "dropping" */
                                                                                    Verb_6 = "drop";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 25:
//  wordnet.m:148
                                                                                  {
                                                                                    /* case "drove" */
                                                                                    Verb_6 = "drive";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 26:
//  wordnet.m:149
                                                                                  {
                                                                                    /* case "fed" */
                                                                                    Verb_6 = "feed";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 27:
//  wordnet.m:150
                                                                                  {
                                                                                    /* case "forgot" */
                                                                                    Verb_6 = "forget";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 28:
//  wordnet.m:151
                                                                                  {
                                                                                    /* case "forgotten" */
                                                                                    Verb_6 = "forget";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 29:
//  wordnet.m:152
                                                                                  {
                                                                                    /* case "fought" */
                                                                                    Verb_6 = "fight";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 30:
//  wordnet.m:153
                                                                                  {
                                                                                    /* case "froze" */
                                                                                    Verb_6 = "freeze";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 31:
//  wordnet.m:154
                                                                                  {
                                                                                    /* case "frozen" */
                                                                                    Verb_6 = "freezen";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 32:
//  wordnet.m:155
                                                                                  {
                                                                                    /* case "gave" */
                                                                                    Verb_6 = "give";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 33:
//  wordnet.m:156
                                                                                  {
                                                                                    /* case "getting" */
                                                                                    Verb_6 = "get";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 34:
//  wordnet.m:157
                                                                                  {
                                                                                    /* case "given" */
                                                                                    Verb_6 = "give";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 35:
//  wordnet.m:158
                                                                                  {
                                                                                    /* case "goes" */
                                                                                    Verb_6 = "go";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 36:
//  wordnet.m:159
                                                                                  {
                                                                                    /* case "gone" */
                                                                                    Verb_6 = "go";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 37:
//  wordnet.m:160
                                                                                  {
                                                                                    /* case "got" */
                                                                                    Verb_6 = "get";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 38:
//  wordnet.m:161
                                                                                  {
                                                                                    /* case "gotten" */
                                                                                    Verb_6 = "get";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 39:
//  wordnet.m:162
                                                                                  {
                                                                                    /* case "grew" */
                                                                                    Verb_6 = "grow";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 40:
//  wordnet.m:163
                                                                                  {
                                                                                    /* case "held" */
                                                                                    Verb_6 = "hold";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 41:
//  wordnet.m:164
                                                                                  {
                                                                                    /* case "hidden" */
                                                                                    Verb_6 = "hide";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 42:
//  wordnet.m:165
                                                                                  {
                                                                                    /* case "hung" */
                                                                                    Verb_6 = "hang";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 43:
//  wordnet.m:166
                                                                                  {
                                                                                    /* case "incurring" */
                                                                                    Verb_6 = "incur";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 44:
//  wordnet.m:167
                                                                                  {
                                                                                    /* case "inferred" */
                                                                                    Verb_6 = "infer";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 45:
//  wordnet.m:168
                                                                                  {
                                                                                    /* case "kept" */
                                                                                    Verb_6 = "keep";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 46:
//  wordnet.m:169
                                                                                  {
                                                                                    /* case "knew" */
                                                                                    Verb_6 = "know";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 47:
//  wordnet.m:170
                                                                                  {
                                                                                    /* case "laid" */
                                                                                    Verb_6 = "lay";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 48:
//  wordnet.m:171
                                                                                  {
                                                                                    /* case "led" */
                                                                                    Verb_6 = "lead";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 49:
//  wordnet.m:172
                                                                                  {
                                                                                    /* case "left" */
                                                                                    Verb_6 = "leave";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 50:
//  wordnet.m:173
                                                                                  {
                                                                                    /* case "lent" */
                                                                                    Verb_6 = "lend";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 51:
//  wordnet.m:174
                                                                                  {
                                                                                    /* case "lost" */
                                                                                    Verb_6 = "lose";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 52:
//  wordnet.m:175
                                                                                  {
                                                                                    /* case "lying" */
                                                                                    Verb_6 = "lie";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 53:
//  wordnet.m:176
                                                                                  {
                                                                                    /* case "made" */
                                                                                    Verb_6 = "make";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 54:
//  wordnet.m:177
                                                                                  {
                                                                                    /* case "meant" */
                                                                                    Verb_6 = "mean";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 55:
//  wordnet.m:178
                                                                                  {
                                                                                    /* case "met" */
                                                                                    Verb_6 = "meet";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 56:
//  wordnet.m:179
                                                                                  {
                                                                                    /* case "misled" */
                                                                                    Verb_6 = "mislead";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 57:
//  wordnet.m:180
                                                                                  {
                                                                                    /* case "misunderstood" */
                                                                                    Verb_6 = "misunderstand";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 58:
//  wordnet.m:181
                                                                                  {
                                                                                    /* case "occurred" */
                                                                                    Verb_6 = "occur";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 59:
//  wordnet.m:182
                                                                                  {
                                                                                    /* case "overlapping" */
                                                                                    Verb_6 = "overlap";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 60:
//  wordnet.m:183
                                                                                  {
                                                                                    /* case "oversaw" */
                                                                                    Verb_6 = "oversee";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 61:
//  wordnet.m:184
                                                                                  {
                                                                                    /* case "paid" */
                                                                                    Verb_6 = "pay";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 62:
//  wordnet.m:185
                                                                                  {
                                                                                    /* case "planning" */
                                                                                    Verb_6 = "plan";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 63:
//  wordnet.m:186
                                                                                  {
                                                                                    /* case "ran" */
                                                                                    Verb_6 = "run";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 64:
//  wordnet.m:187
                                                                                  {
                                                                                    /* case "referred" */
                                                                                    Verb_6 = "refer";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 65:
//  wordnet.m:188
                                                                                  {
                                                                                    /* case "referring" */
                                                                                    Verb_6 = "refer";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 66:
//  wordnet.m:189
                                                                                  {
                                                                                    /* case "repaid" */
                                                                                    Verb_6 = "repay";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 67:
//  wordnet.m:190
                                                                                  {
                                                                                    /* case "rode" */
                                                                                    Verb_6 = "ride";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 68:
//  wordnet.m:191
                                                                                  {
                                                                                    /* case "rose" */
                                                                                    Verb_6 = "rise";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 69:
//  wordnet.m:192
                                                                                  {
                                                                                    /* case "running" */
                                                                                    Verb_6 = "run";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 70:
//  wordnet.m:193
                                                                                  {
                                                                                    /* case "said" */
                                                                                    Verb_6 = "say";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 71:
//  wordnet.m:194
                                                                                  {
                                                                                    /* case "sat" */
                                                                                    Verb_6 = "sit";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 72:
//  wordnet.m:195
                                                                                  {
                                                                                    /* case "seen" */
                                                                                    Verb_6 = "see";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 73:
//  wordnet.m:196
                                                                                  {
                                                                                    /* case "sent" */
                                                                                    Verb_6 = "send";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 74:
//  wordnet.m:197
                                                                                  {
                                                                                    /* case "shook" */
                                                                                    Verb_6 = "shake";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 75:
//  wordnet.m:198
                                                                                  {
                                                                                    /* case "shot" */
                                                                                    Verb_6 = "shoot";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 76:
//  wordnet.m:199
                                                                                  {
                                                                                    /* case "shrank" */
                                                                                    Verb_6 = "shrink";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 77:
//  wordnet.m:200
                                                                                  {
                                                                                    /* case "shrunk" */
                                                                                    Verb_6 = "shrink";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 78:
//  wordnet.m:201
                                                                                  {
                                                                                    /* case "sitting" */
                                                                                    Verb_6 = "sit";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 79:
//  wordnet.m:202
                                                                                  {
                                                                                    /* case "sold" */
                                                                                    Verb_6 = "sell";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 80:
//  wordnet.m:203
                                                                                  {
                                                                                    /* case "sought" */
                                                                                    Verb_6 = "seek";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 81:
//  wordnet.m:204
                                                                                  {
                                                                                    /* case "spent" */
                                                                                    Verb_6 = "spend";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 82:
//  wordnet.m:206
                                                                                  {
                                                                                    /* case "spoke" */
                                                                                    Verb_6 = "speak";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 83:
//  wordnet.m:205
                                                                                  {
                                                                                    /* case "spoken" */
                                                                                    Verb_6 = "speak";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 84:
//  wordnet.m:207
                                                                                  {
                                                                                    /* case "stood" */
                                                                                    Verb_6 = "stand";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 85:
//  wordnet.m:208
                                                                                  {
                                                                                    /* case "stopped" */
                                                                                    Verb_6 = "stop";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 86:
//  wordnet.m:209
                                                                                  {
                                                                                    /* case "struck" */
                                                                                    Verb_6 = "strike";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 87:
//  wordnet.m:210
                                                                                  {
                                                                                    /* case "stuck" */
                                                                                    Verb_6 = "stick";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 88:
//  wordnet.m:211
                                                                                  {
                                                                                    /* case "sworn" */
                                                                                    Verb_6 = "swear";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 89:
//  wordnet.m:212
                                                                                  {
                                                                                    /* case "swung" */
                                                                                    Verb_6 = "swing";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 90:
//  wordnet.m:213
                                                                                  {
                                                                                    /* case "taught" */
                                                                                    Verb_6 = "teach";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 91:
//  wordnet.m:214
                                                                                  {
                                                                                    /* case "thought" */
                                                                                    Verb_6 = "think";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 92:
//  wordnet.m:215
                                                                                  {
                                                                                    /* case "threw" */
                                                                                    Verb_6 = "throw";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 93:
//  wordnet.m:216
                                                                                  {
                                                                                    /* case "told" */
                                                                                    Verb_6 = "tell";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 94:
//  wordnet.m:217
                                                                                  {
                                                                                    /* case "took" */
                                                                                    Verb_6 = "take";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 95:
//  wordnet.m:218
                                                                                  {
                                                                                    /* case "torn" */
                                                                                    Verb_6 = "tear";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 96:
//  wordnet.m:219
                                                                                  {
                                                                                    /* case "tying" */
                                                                                    Verb_6 = "tie";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 97:
//  wordnet.m:220
                                                                                  {
                                                                                    /* case "underlying" */
                                                                                    Verb_6 = "underlie";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 98:
//  wordnet.m:221
                                                                                  {
                                                                                    /* case "understand" */
                                                                                    Verb_6 = "understood";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 99:
//  wordnet.m:222
                                                                                  {
                                                                                    /* case "understood" */
                                                                                    Verb_6 = "understand";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 100:
//  wordnet.m:223
                                                                                  {
                                                                                    /* case "undertake" */
                                                                                    Verb_6 = "undertook";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 101:
//  wordnet.m:224
                                                                                  {
                                                                                    /* case "undertook" */
                                                                                    Verb_6 = "undertake";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 102:
//  wordnet.m:225
                                                                                  {
                                                                                    /* case "underwritten" */
                                                                                    Verb_6 = "underwrite";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 103:
//  wordnet.m:226
                                                                                  {
                                                                                    /* case "undone" */
                                                                                    Verb_6 = "undo";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 104:
//  wordnet.m:227
                                                                                  {
                                                                                    /* case "unwound" */
                                                                                    Verb_6 = "unwind";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 105:
//  wordnet.m:228
                                                                                  {
                                                                                    /* case "went" */
                                                                                    Verb_6 = "go";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 106:
//  wordnet.m:229
                                                                                  {
                                                                                    /* case "woke" */
                                                                                    Verb_6 = "wake";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 107:
//  wordnet.m:230
                                                                                  {
                                                                                    /* case "won" */
                                                                                    Verb_6 = "win";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 108:
//  wordnet.m:231
                                                                                  {
                                                                                    /* case "worn" */
                                                                                    Verb_6 = "wear";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 109:
//  wordnet.m:232
                                                                                  {
                                                                                    /* case "written" */
                                                                                    Verb_6 = "write";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                case 110:
//  wordnet.m:233
                                                                                  {
                                                                                    /* case "wrote" */
                                                                                    Verb_6 = "write";
                                                                                    succeeded = true;
                                                                                  }
//  wordnet.m:123
                                                                                  break;
                                                                                default: /*NOTREACHED*/
                                                                                  throw new jmercury.runtime.UnreachableDefault();
                                                                              }
                                                                              stop_loop_9 = 1;
                                                                            }
                                                                          else
                                                                            if ((result_8 < 0))
                                                                              hi_6 = (mid_7 - 1);
                                                                            else
                                                                              lo_5 = (mid_7 + 1);
                                                                        }
                                                                      while (((stop_loop_9 == 0) && (lo_5 <= hi_6)));
//  wordnet.m:93
                                                                      if (succeeded)
                                                                        {
                                                                          V_47_47 = wordnet.Syncat_0.K1;
                                                                          {
                                                                            succeeded = wordnet.check_word_3_p_0(WN_4, Verb_6, V_47_47);
                                                                          }
                                                                        }
                                                                    }
                                                                }
//  wordnet.m:92
                                                            }
//  wordnet.m:91
                                                        }
//  wordnet.m:90
                                                    }
//  wordnet.m:89
                                                }
//  wordnet.m:88
                                            }
//  wordnet.m:87
                                        }
//  wordnet.m:86
                                    }
//  wordnet.m:85
                                }
//  wordnet.m:84
                            }
//  wordnet.m:83
                        }
//  wordnet.m:82
                    }
//  wordnet.m:81
                }
//  wordnet.m:80
            }
//  wordnet.m:79
        }
//  wordnet.m:78
return new java.lang.Object[] {
        java.lang.Boolean.valueOf(succeeded),
        ((java.lang.Object) (Verb_6))
      };
    }
//  wordnet.m:75
  }
//  wordnet.m:63
  private static java.lang.Object [] verb_phrase_5_p_0(
    maybe.Maybe_1 WN_1,
    list.List_1 HeadVar__2_2,
    bool.Bool_0 HeadVar__3_3)
  {
//  wordnet.m:64
    while (true)
      {
        /* tailcall optimized into a loop */
        {
          boolean succeeded = (HeadVar__2_2.data_tag == 1);
          bool.Bool_0 HeadVar__4_4 = null;
          java.lang.String Verb_5 = null;
          list.List_1 V_36_36 = null;
          java.lang.String V_37_37 = null;

          if (succeeded)
            {
              V_37_37 = ((java.lang.String) ((list.List_1.F_cons_2) HeadVar__2_2).F1);
              V_36_36 = ((list.List_1.F_cons_2) HeadVar__2_2).F2;
              if ((V_36_36.data_tag == 0))
//  wordnet.m:72
                {
//  wordnet.m:73
                  {
                    java.lang.Object [] result = wordnet.main_verb_3_p_0(WN_1, V_37_37);
                    succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                    Verb_5 = (java.lang.String) result[1];
                  }
//  wordnet.m:72
                  if (succeeded)
                    {
                      HeadVar__4_4 = HeadVar__3_3;
                      succeeded = true;
                    }
                }
//  wordnet.m:64
              else
                {
                  list.List_1 V_38_38 = ((list.List_1.F_cons_2) V_36_36).F2;
                  java.lang.String V_39_39 = ((java.lang.String) ((list.List_1.F_cons_2) V_36_36).F1);

                  if ((V_38_38.data_tag == 0))
//  wordnet.m:70
                    {
                      java.lang.String Vb_25 = null;
//  wordnet.m:101
                      int lo_0 = 0;
                      int hi_1 = 0;
                      int mid_2 = 0;
                      int result_3 = 0;
                      int stop_loop_4 = 0;

                      /* binary string jump switch */
                      succeeded = false;
                      lo_0 = 0;
                      hi_1 = 19;
                      stop_loop_4 = 0;
                      do
                        {
                          mid_2 = ((lo_0 + hi_1) / 2);
                          result_3 = (V_37_37.compareTo(((wordnet.Vector_common_type_2_0) (MR_vector_common_2[57 + mid_2])).vct_2_f_0)) ;
                          if ((result_3 == 0))
                            {
                              switch (((wordnet.Vector_common_type_2_0) (MR_vector_common_2[57 + mid_2])).vct_2_f_1) {
                                case 0:
//  wordnet.m:108
                                  {
                                    /* case "'m" */
                                    succeeded = true;
                                  }
//  wordnet.m:101
                                  break;
                                case 1:
//  wordnet.m:112
                                  {
                                    /* case "'re" */
                                    succeeded = true;
                                  }
//  wordnet.m:101
                                  break;
                                case 2:
//  wordnet.m:110
                                  {
                                    /* case "'s" */
                                    succeeded = true;
                                  }
//  wordnet.m:101
                                  break;
                                case 3:
//  wordnet.m:118
                                  {
                                    /* case "'ve" */
                                    succeeded = true;
                                  }
//  wordnet.m:101
                                  break;
                                case 4:
//  wordnet.m:107
                                  {
                                    /* case "am" */
                                    succeeded = true;
                                  }
//  wordnet.m:101
                                  break;
                                case 5:
//  wordnet.m:111
                                  {
                                    /* case "are" */
                                    succeeded = true;
                                  }
//  wordnet.m:101
                                  break;
                                case 6:
//  wordnet.m:106
                                  {
                                    /* case "be" */
                                    succeeded = true;
                                  }
//  wordnet.m:101
                                  break;
                                case 7:
//  wordnet.m:116
                                  {
                                    /* case "been" */
                                    succeeded = true;
                                  }
//  wordnet.m:101
                                  break;
                                case 8:
//  wordnet.m:115
                                  {
                                    /* case "being" */
                                    succeeded = true;
                                  }
//  wordnet.m:101
                                  break;
                                case 9:
//  wordnet.m:103
                                  {
                                    /* case "did" */
                                    succeeded = true;
                                  }
//  wordnet.m:101
                                  break;
                                case 10:
                                  {
                                    /* case "do" */
                                    succeeded = true;
                                  }
                                  break;
                                case 11:
//  wordnet.m:102
                                  {
                                    /* case "does" */
                                    succeeded = true;
                                  }
//  wordnet.m:101
                                  break;
                                case 12:
//  wordnet.m:104
                                  {
                                    /* case "doing" */
                                    succeeded = true;
                                  }
//  wordnet.m:101
                                  break;
                                case 13:
//  wordnet.m:105
                                  {
                                    /* case "done" */
                                    succeeded = true;
                                  }
//  wordnet.m:101
                                  break;
                                case 14:
//  wordnet.m:120
                                  {
                                    /* case "had" */
                                    succeeded = true;
                                  }
//  wordnet.m:101
                                  break;
                                case 15:
//  wordnet.m:119
                                  {
                                    /* case "has" */
                                    succeeded = true;
                                  }
//  wordnet.m:101
                                  break;
                                case 16:
//  wordnet.m:117
                                  {
                                    /* case "have" */
                                    succeeded = true;
                                  }
//  wordnet.m:101
                                  break;
                                case 17:
//  wordnet.m:109
                                  {
                                    /* case "is" */
                                    succeeded = true;
                                  }
//  wordnet.m:101
                                  break;
                                case 18:
//  wordnet.m:113
                                  {
                                    /* case "was" */
                                    succeeded = true;
                                  }
//  wordnet.m:101
                                  break;
                                case 19:
//  wordnet.m:114
                                  {
                                    /* case "were" */
                                    succeeded = true;
                                  }
//  wordnet.m:101
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
//  wordnet.m:69
                      if (succeeded)
                        {
                          java.lang.Object [] result = wordnet.main_verb_3_p_0(WN_1, V_39_39);
                          succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                          Vb_25 = (java.lang.String) result[1];
                        }
//  wordnet.m:70
                      if (succeeded)
//  wordnet.m:69
                        {
                          Verb_5 = Vb_25;
                          HeadVar__4_4 = HeadVar__3_3;
                          succeeded = true;
                        }
//  wordnet.m:70
                      else
//  wordnet.m:71
                        {
                          java.lang.String Vb_28 = null;

//  wordnet.m:96
                          if (V_37_37.equals("n\'t"))
//  wordnet.m:97
                            succeeded = true;
//  wordnet.m:96
                          else
                            if (V_37_37.equals("not"))
                              succeeded = true;
                            else
                              if (V_37_37.equals("never"))
//  wordnet.m:98
                                succeeded = true;
//  wordnet.m:96
                              else
                                succeeded = false;
//  wordnet.m:70
                          if (succeeded)
                            {
                              java.lang.Object [] result = wordnet.main_verb_3_p_0(WN_1, V_39_39);
                              succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                              Vb_28 = (java.lang.String) result[1];
                            }
//  wordnet.m:71
                          if (succeeded)
//  wordnet.m:70
                            {
                              Verb_5 = Vb_28;
                              HeadVar__4_4 = bool.Bool_0.K1;
                              succeeded = true;
                            }
//  wordnet.m:71
                          else
                            {
                              {
                                java.lang.Object [] result = wordnet.main_verb_3_p_0(WN_1, V_37_37);
                                succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                                Verb_5 = (java.lang.String) result[1];
                              }
                              if (succeeded)
                                {
//  wordnet.m:96
                                  if (V_39_39.equals("n\'t"))
//  wordnet.m:97
                                    succeeded = true;
//  wordnet.m:96
                                  else
                                    if (V_39_39.equals("not"))
                                      succeeded = true;
                                    else
                                      if (V_39_39.equals("never"))
//  wordnet.m:98
                                        succeeded = true;
//  wordnet.m:96
                                      else
                                        succeeded = false;
//  wordnet.m:71
                                  if (succeeded)
                                    {
                                      HeadVar__4_4 = bool.Bool_0.K1;
                                      succeeded = true;
                                    }
                                }
                            }
                        }
//  wordnet.m:70
                    }
//  wordnet.m:64
                  else
                    {
                      bool.Bool_0 B1_14 = null;

//  wordnet.m:96
                      if (V_37_37.equals("n\'t"))
//  wordnet.m:97
                        succeeded = true;
//  wordnet.m:96
                      else
                        if (V_37_37.equals("not"))
                          succeeded = true;
                        else
                          if (V_37_37.equals("never"))
//  wordnet.m:98
                            succeeded = true;
//  wordnet.m:96
                          else
                            succeeded = false;
//  wordnet.m:66
                      if (succeeded)
//  wordnet.m:65
                        {
                          B1_14 = bool.Bool_0.K1;
                          succeeded = true;
                        }
//  wordnet.m:66
                      else
                        {
//  wordnet.m:101
                          int lo_5 = 0;
                          int hi_6 = 0;
                          int mid_7 = 0;
                          int result_8 = 0;
                          int stop_loop_9 = 0;

                          /* binary string jump switch */
                          succeeded = false;
                          lo_5 = 0;
                          hi_6 = 19;
                          stop_loop_9 = 0;
                          do
                            {
                              mid_7 = ((lo_5 + hi_6) / 2);
                              result_8 = (V_37_37.compareTo(((wordnet.Vector_common_type_2_0) (MR_vector_common_2[77 + mid_7])).vct_2_f_0)) ;
                              if ((result_8 == 0))
                                {
                                  switch (((wordnet.Vector_common_type_2_0) (MR_vector_common_2[77 + mid_7])).vct_2_f_1) {
                                    case 0:
//  wordnet.m:108
                                      {
                                        /* case "'m" */
                                        succeeded = true;
                                      }
//  wordnet.m:101
                                      break;
                                    case 1:
//  wordnet.m:112
                                      {
                                        /* case "'re" */
                                        succeeded = true;
                                      }
//  wordnet.m:101
                                      break;
                                    case 2:
//  wordnet.m:110
                                      {
                                        /* case "'s" */
                                        succeeded = true;
                                      }
//  wordnet.m:101
                                      break;
                                    case 3:
//  wordnet.m:118
                                      {
                                        /* case "'ve" */
                                        succeeded = true;
                                      }
//  wordnet.m:101
                                      break;
                                    case 4:
//  wordnet.m:107
                                      {
                                        /* case "am" */
                                        succeeded = true;
                                      }
//  wordnet.m:101
                                      break;
                                    case 5:
//  wordnet.m:111
                                      {
                                        /* case "are" */
                                        succeeded = true;
                                      }
//  wordnet.m:101
                                      break;
                                    case 6:
//  wordnet.m:106
                                      {
                                        /* case "be" */
                                        succeeded = true;
                                      }
//  wordnet.m:101
                                      break;
                                    case 7:
//  wordnet.m:116
                                      {
                                        /* case "been" */
                                        succeeded = true;
                                      }
//  wordnet.m:101
                                      break;
                                    case 8:
//  wordnet.m:115
                                      {
                                        /* case "being" */
                                        succeeded = true;
                                      }
//  wordnet.m:101
                                      break;
                                    case 9:
//  wordnet.m:103
                                      {
                                        /* case "did" */
                                        succeeded = true;
                                      }
//  wordnet.m:101
                                      break;
                                    case 10:
                                      {
                                        /* case "do" */
                                        succeeded = true;
                                      }
                                      break;
                                    case 11:
//  wordnet.m:102
                                      {
                                        /* case "does" */
                                        succeeded = true;
                                      }
//  wordnet.m:101
                                      break;
                                    case 12:
//  wordnet.m:104
                                      {
                                        /* case "doing" */
                                        succeeded = true;
                                      }
//  wordnet.m:101
                                      break;
                                    case 13:
//  wordnet.m:105
                                      {
                                        /* case "done" */
                                        succeeded = true;
                                      }
//  wordnet.m:101
                                      break;
                                    case 14:
//  wordnet.m:120
                                      {
                                        /* case "had" */
                                        succeeded = true;
                                      }
//  wordnet.m:101
                                      break;
                                    case 15:
//  wordnet.m:119
                                      {
                                        /* case "has" */
                                        succeeded = true;
                                      }
//  wordnet.m:101
                                      break;
                                    case 16:
//  wordnet.m:117
                                      {
                                        /* case "have" */
                                        succeeded = true;
                                      }
//  wordnet.m:101
                                      break;
                                    case 17:
//  wordnet.m:109
                                      {
                                        /* case "is" */
                                        succeeded = true;
                                      }
//  wordnet.m:101
                                      break;
                                    case 18:
//  wordnet.m:113
                                      {
                                        /* case "was" */
                                        succeeded = true;
                                      }
//  wordnet.m:101
                                      break;
                                    case 19:
//  wordnet.m:114
                                      {
                                        /* case "were" */
                                        succeeded = true;
                                      }
//  wordnet.m:101
                                      break;
                                    default: /*NOTREACHED*/
                                      throw new jmercury.runtime.UnreachableDefault();
                                  }
                                  stop_loop_9 = 1;
                                }
                              else
                                if ((result_8 < 0))
                                  hi_6 = (mid_7 - 1);
                                else
                                  lo_5 = (mid_7 + 1);
                            }
                          while (((stop_loop_9 == 0) && (lo_5 <= hi_6)));
//  wordnet.m:66
                          if (succeeded)
                            {
                              B1_14 = HeadVar__3_3;
                              succeeded = true;
                            }
                        }
//  wordnet.m:64
                      if (succeeded)
//  wordnet.m:67
                        {
                          /* direct tailcall eliminated */
                          {
                            list.List_1 HeadVar__2__tmp_copy_2 = V_36_36;
                            bool.Bool_0 HeadVar__3__tmp_copy_3 = B1_14;

                            HeadVar__3_3 = HeadVar__3__tmp_copy_3;
                            HeadVar__2_2 = HeadVar__2__tmp_copy_2;
                          }
                          continue;
                        }
//  wordnet.m:64
                    }
                }
            }
return new java.lang.Object[] {
            java.lang.Boolean.valueOf(succeeded),
            ((java.lang.Object) (HeadVar__4_4)),
            ((java.lang.Object) (Verb_5))
          };
        }
      }
//  wordnet.m:63
  }
//  wordnet.m:34
  public static java.lang.Object [] pp_string_3_p_0(
    maybe.Maybe_1 WN_4,
    java.lang.String Str_5)
  {
//  wordnet.m:293
    {
      boolean succeeded = false;
      wordnet.Pptp_0 Tp_6 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_21_21 = null;
      list.List_1 RevSs_7 = null;
      java.lang.String Noun_8 = null;
      list.List_1 RevPs_9 = null;
      wordnet.Ctp_0 Ctp_12 = null;
      list.List_1 V_17_17 = null;
      list.List_1 V_19_19 = null;
//  wordnet.m:295
      java.lang.String V_11_11 = null;

//  wordnet.m:294
      {
        V_17_17 = string.words_1_f_0(Str_5);
      }
      TypeCtorInfo_21_21 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
      {
        RevSs_7 = list.reverse_2_p_0(TypeCtorInfo_21_21, V_17_17);
      }
      succeeded = (RevSs_7.data_tag == 1);
      if (succeeded)
        {
          Noun_8 = ((java.lang.String) ((list.List_1.F_cons_2) RevSs_7).F1);
          RevPs_9 = ((list.List_1.F_cons_2) RevSs_7).F2;
//  wordnet.m:295
          {
            java.lang.Object [] result = wordnet.noun_string_4_p_0(WN_4, Noun_8);
            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
            V_11_11 = (java.lang.String) result[1];
          }
//  wordnet.m:296
          if (succeeded)
//  wordnet.m:295
            {
              {
                Ctp_12 = new wordnet.Ctp_0.Noun_1(null);
              }
              succeeded = true;
            }
//  wordnet.m:296
          else
//  wordnet.m:297
            {
              wordnet.Prontp_0 Ptp_13 = null;
//  wordnet.m:296
              java.lang.String V_14_14 = null;

              {
                java.lang.Object [] result = wordnet.pronoun_string_3_p_0(Noun_8);
                succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                Ptp_13 = (wordnet.Prontp_0) result[1];
                V_14_14 = (java.lang.String) result[2];
              }
//  wordnet.m:297
              if (succeeded)
//  wordnet.m:296
                {
                  {
                    Ctp_12 = new wordnet.Ctp_0.Pron_1(Ptp_13);
                  }
                  succeeded = true;
                }
//  wordnet.m:297
              else
                {
                  java.lang.String V_18_18 = null;
                  wordnet.Prontp_0 Ptp_20 = null;
                  java.lang.String V_15_15 = null;

                  {
                    V_18_18 = string.to_lower_1_f_0(Noun_8);
                  }
                  {
                    java.lang.Object [] result = wordnet.pronoun_string_3_p_0(V_18_18);
                    succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                    Ptp_20 = (wordnet.Prontp_0) result[1];
                    V_15_15 = (java.lang.String) result[2];
                  }
                  if (succeeded)
                    {
                      {
                        Ctp_12 = new wordnet.Ctp_0.Pron_1(Ptp_20);
                      }
                      succeeded = true;
                    }
                }
            }
//  wordnet.m:293
          if (succeeded)
            {
//  wordnet.m:298
              {
                V_19_19 = list.reverse_1_f_0(TypeCtorInfo_21_21, RevPs_9);
              }
              {
                succeeded = wordnet.prep_string_2_p_0(V_19_19);
              }
//  wordnet.m:293
              if (succeeded)
                {
//  wordnet.m:299
                  {
                    Tp_6 = new wordnet.Pptp_0(null, Ctp_12, Noun_8);
                  }
                  succeeded = true;
//  wordnet.m:293
                }
            }
//  wordnet.m:294
        }
//  wordnet.m:293
return new java.lang.Object[] {
        java.lang.Boolean.valueOf(succeeded),
        ((java.lang.Object) (Tp_6))
      };
    }
//  wordnet.m:34
  }
//  wordnet.m:32
  public static java.lang.Object [] pronoun_string_3_p_0(
    java.lang.String HeadVar__1_1)
  {
//  wordnet.m:235
    {
      boolean succeeded = false;
      wordnet.Prontp_0 HeadVar__2_2 = null;
      java.lang.String HeadVar__3_3 = null;
      int lo_0 = 0;
      int hi_1 = 0;
      int mid_2 = 0;
      int result_3 = 0;
      int stop_loop_4 = 0;

      /* binary string jump switch */
      succeeded = false;
      lo_0 = 0;
      hi_1 = 56;
      stop_loop_4 = 0;
      do
        {
          mid_2 = ((lo_0 + hi_1) / 2);
          result_3 = (HeadVar__1_1.compareTo(((wordnet.Vector_common_type_2_0) (MR_vector_common_2[0 + mid_2])).vct_2_f_0)) ;
          if ((result_3 == 0))
            {
              switch (((wordnet.Vector_common_type_2_0) (MR_vector_common_2[0 + mid_2])).vct_2_f_1) {
                case 0:
                  {
                    /* case "I" */
                    HeadVar__2_2 = wordnet.Prontp_0.K0;
                    HeadVar__3_3 = "I";
                    succeeded = true;
                  }
                  break;
                case 1:
//  wordnet.m:278
                  {
                    /* case "all" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "they";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 2:
//  wordnet.m:282
                  {
                    /* case "another" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "it";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 3:
//  wordnet.m:284
                  {
                    /* case "anybody" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "it";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 4:
//  wordnet.m:283
                  {
                    /* case "anyone" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "it";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 5:
//  wordnet.m:270
                  {
                    /* case "anything" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "it";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 6:
//  wordnet.m:275
                  {
                    /* case "both" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "they";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 7:
//  wordnet.m:279
                  {
                    /* case "each" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "it";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 8:
//  wordnet.m:272
                  {
                    /* case "everybody" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "they";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 9:
//  wordnet.m:271
                  {
                    /* case "everyone" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "they";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 10:
//  wordnet.m:273
                  {
                    /* case "everything" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "they";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 11:
//  wordnet.m:247
                  {
                    /* case "he" */
                    HeadVar__2_2 = wordnet.Prontp_0.K2;
                    HeadVar__3_3 = "he";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 12:
//  wordnet.m:252
                  {
                    /* case "her" */
                    HeadVar__2_2 = wordnet.Prontp_0.K2;
                    HeadVar__3_3 = "she";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 13:
//  wordnet.m:249
                  {
                    /* case "him" */
                    HeadVar__2_2 = wordnet.Prontp_0.K2;
                    HeadVar__3_3 = "he";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 14:
//  wordnet.m:250
                  {
                    /* case "himself" */
                    HeadVar__2_2 = wordnet.Prontp_0.K2;
                    HeadVar__3_3 = "he";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 15:
//  wordnet.m:248
                  {
                    /* case "his" */
                    HeadVar__2_2 = wordnet.Prontp_0.K2;
                    HeadVar__3_3 = "he";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 16:
//  wordnet.m:291
                  {
                    /* case "how" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "it";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 17:
//  wordnet.m:257
                  {
                    /* case "it" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "it";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 18:
//  wordnet.m:258
                  {
                    /* case "its" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "it";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 19:
//  wordnet.m:259
                  {
                    /* case "itself" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "it";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 20:
//  wordnet.m:276
                  {
                    /* case "many" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "they";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 21:
//  wordnet.m:236
                  {
                    /* case "me" */
                    HeadVar__2_2 = wordnet.Prontp_0.K0;
                    HeadVar__3_3 = "I";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 22:
//  wordnet.m:277
                  {
                    /* case "most" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "they";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 23:
//  wordnet.m:237
                  {
                    /* case "my" */
                    HeadVar__2_2 = wordnet.Prontp_0.K0;
                    HeadVar__3_3 = "I";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 24:
//  wordnet.m:238
                  {
                    /* case "myself" */
                    HeadVar__2_2 = wordnet.Prontp_0.K0;
                    HeadVar__3_3 = "I";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 25:
//  wordnet.m:287
                  {
                    /* case "next" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "it";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 26:
//  wordnet.m:285
                  {
                    /* case "nobody" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "it";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 27:
//  wordnet.m:280
                  {
                    /* case "none" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "it";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 28:
//  wordnet.m:286
                  {
                    /* case "nothing" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "it";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 29:
//  wordnet.m:274
                  {
                    /* case "one" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "it";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 30:
//  wordnet.m:281
                  {
                    /* case "others" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "they";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 31:
//  wordnet.m:241
                  {
                    /* case "our" */
                    HeadVar__2_2 = wordnet.Prontp_0.K0;
                    HeadVar__3_3 = "we";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 32:
//  wordnet.m:242
                  {
                    /* case "ourselves" */
                    HeadVar__2_2 = wordnet.Prontp_0.K0;
                    HeadVar__3_3 = "we";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 33:
//  wordnet.m:251
                  {
                    /* case "she" */
                    HeadVar__2_2 = wordnet.Prontp_0.K2;
                    HeadVar__3_3 = "she";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 34:
//  wordnet.m:265
                  {
                    /* case "some" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "they";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 35:
//  wordnet.m:266
                  {
                    /* case "someone" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "it";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 36:
//  wordnet.m:268
                  {
                    /* case "someplace" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "it";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 37:
//  wordnet.m:267
                  {
                    /* case "something" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "it";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 38:
//  wordnet.m:269
                  {
                    /* case "somewhere" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "it";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 39:
//  wordnet.m:260
                  {
                    /* case "that" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "it";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 40:
//  wordnet.m:256
                  {
                    /* case "their" */
                    HeadVar__2_2 = wordnet.Prontp_0.K2;
                    HeadVar__3_3 = "they";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 41:
//  wordnet.m:254
                  {
                    /* case "them" */
                    HeadVar__2_2 = wordnet.Prontp_0.K2;
                    HeadVar__3_3 = "they";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 42:
//  wordnet.m:255
                  {
                    /* case "themselves" */
                    HeadVar__2_2 = wordnet.Prontp_0.K2;
                    HeadVar__3_3 = "they";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 43:
//  wordnet.m:262
                  {
                    /* case "there" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "it";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 44:
//  wordnet.m:263
                  {
                    /* case "these" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "they";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 45:
//  wordnet.m:253
                  {
                    /* case "they" */
                    HeadVar__2_2 = wordnet.Prontp_0.K2;
                    HeadVar__3_3 = "they";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 46:
//  wordnet.m:261
                  {
                    /* case "this" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "it";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 47:
//  wordnet.m:264
                  {
                    /* case "those" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "they";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 48:
//  wordnet.m:240
                  {
                    /* case "us" */
                    HeadVar__2_2 = wordnet.Prontp_0.K0;
                    HeadVar__3_3 = "we";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 49:
//  wordnet.m:239
                  {
                    /* case "we" */
                    HeadVar__2_2 = wordnet.Prontp_0.K0;
                    HeadVar__3_3 = "we";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 50:
//  wordnet.m:288
                  {
                    /* case "what" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "it";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 51:
//  wordnet.m:289
                  {
                    /* case "when" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "it";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 52:
//  wordnet.m:290
                  {
                    /* case "which" */
                    HeadVar__2_2 = wordnet.Prontp_0.K3;
                    HeadVar__3_3 = "it";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 53:
//  wordnet.m:243
                  {
                    /* case "you" */
                    HeadVar__2_2 = wordnet.Prontp_0.K1;
                    HeadVar__3_3 = "you";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 54:
//  wordnet.m:244
                  {
                    /* case "your" */
                    HeadVar__2_2 = wordnet.Prontp_0.K1;
                    HeadVar__3_3 = "you";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 55:
//  wordnet.m:245
                  {
                    /* case "yours" */
                    HeadVar__2_2 = wordnet.Prontp_0.K1;
                    HeadVar__3_3 = "you";
                    succeeded = true;
                  }
//  wordnet.m:235
                  break;
                case 56:
//  wordnet.m:246
                  {
                    /* case "yourself" */
                    HeadVar__2_2 = wordnet.Prontp_0.K1;
                    HeadVar__3_3 = "you";
                    succeeded = true;
                  }
//  wordnet.m:235
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
return new java.lang.Object[] {
        java.lang.Boolean.valueOf(succeeded),
        ((java.lang.Object) (HeadVar__2_2)),
        ((java.lang.Object) (HeadVar__3_3))
      };
    }
//  wordnet.m:32
  }
//  wordnet.m:30
  public static java.lang.Object [] verb_string_4_p_0(
    maybe.Maybe_1 WN_5,
    java.lang.String Str_6)
  {
//  wordnet.m:59
    {
      boolean succeeded = false;
      bool.Bool_0 Neg_7 = null;
      java.lang.String Verb_8 = null;
      list.List_1 V_9_9 = null;
      bool.Bool_0 V_10_10 = null;
      java.lang.String V_11_11 = null;

//  wordnet.m:60
      {
        V_11_11 = string.to_lower_1_f_0(Str_6);
      }
      {
        V_9_9 = string.words_1_f_0(V_11_11);
      }
      V_10_10 = bool.Bool_0.K0;
      {
        java.lang.Object [] result = wordnet.verb_phrase_5_p_0(WN_5, V_9_9, V_10_10);
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        Neg_7 = (bool.Bool_0) result[1];
        Verb_8 = (java.lang.String) result[2];
      }
//  wordnet.m:59
return new java.lang.Object[] {
        java.lang.Boolean.valueOf(succeeded),
        ((java.lang.Object) (Neg_7)),
        ((java.lang.Object) (Verb_8))
      };
    }
//  wordnet.m:30
  }
//  wordnet.m:28
  public static java.lang.Object [] noun_string_3_p_0(
    maybe.Maybe_1 WN_4,
    java.lang.String S0_5)
  {
//  wordnet.m:46
    {
      boolean succeeded = false;
      java.lang.String S_6 = null;

      {
        java.lang.Object [] result = wordnet.noun_string_4_p_0(WN_4, S0_5);
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        S_6 = (java.lang.String) result[1];
      }
return new java.lang.Object[] {
        java.lang.Boolean.valueOf(succeeded),
        ((java.lang.Object) (S_6))
      };
    }
//  wordnet.m:28
  }
//  wordnet.m:27
  public static java.lang.Object [] noun_string_4_p_0(
    maybe.Maybe_1 WN_5,
    java.lang.String S0_6)
  {
//  wordnet.m:49
    {
      boolean succeeded = false;
      java.lang.String S_8 = null;
//  wordnet.m:48
      wordnet.Syncat_0 V_10_10 = wordnet.Syncat_0.K0;

      {
        succeeded = wordnet.check_word_3_p_0(WN_5, S0_6, V_10_10);
      }
//  wordnet.m:49
      if (succeeded)
//  wordnet.m:48
        {
          private_builtin.dummy_var = wordnet.Nountp_0.K0;
          S_8 = S0_6;
          succeeded = true;
        }
//  wordnet.m:49
      else
//  wordnet.m:50
        {
//  wordnet.m:49
          java.lang.String V_11_11 = null;
          wordnet.Syncat_0 V_12_12 = null;

          {
            V_11_11 = string.to_lower_1_f_0(S0_6);
          }
          V_12_12 = wordnet.Syncat_0.K0;
          {
            succeeded = wordnet.check_word_3_p_0(WN_5, V_11_11, V_12_12);
          }
//  wordnet.m:50
          if (succeeded)
//  wordnet.m:49
            {
              private_builtin.dummy_var = wordnet.Nountp_0.K0;
              {
                S_8 = string.to_lower_1_f_0(S0_6);
              }
              succeeded = true;
            }
//  wordnet.m:50
          else
//  wordnet.m:51
            {
              java.lang.String S1_9 = null;
//  wordnet.m:50
              java.lang.String V_13_13 = "s";
              wordnet.Syncat_0 V_14_14 = null;

              {
                java.lang.Object [] result = string.remove_suffix_3_p_0(S0_6, V_13_13);
                succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                S1_9 = (java.lang.String) result[1];
              }
              if (succeeded)
                {
                  V_14_14 = wordnet.Syncat_0.K0;
                  {
                    succeeded = wordnet.check_word_3_p_0(WN_5, S1_9, V_14_14);
                  }
                }
//  wordnet.m:51
              if (succeeded)
//  wordnet.m:50
                {
                  private_builtin.dummy_var = wordnet.Nountp_0.K0;
                  S_8 = S1_9;
                  succeeded = true;
                }
//  wordnet.m:51
              else
//  wordnet.m:52
                {
                  java.lang.String S1_33 = null;
//  wordnet.m:51
                  java.lang.String V_15_15 = "es";
                  wordnet.Syncat_0 V_16_16 = null;

                  {
                    java.lang.Object [] result = string.remove_suffix_3_p_0(S0_6, V_15_15);
                    succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                    S1_33 = (java.lang.String) result[1];
                  }
                  if (succeeded)
                    {
                      V_16_16 = wordnet.Syncat_0.K0;
                      {
                        succeeded = wordnet.check_word_3_p_0(WN_5, S1_33, V_16_16);
                      }
                    }
//  wordnet.m:52
                  if (succeeded)
//  wordnet.m:51
                    {
                      private_builtin.dummy_var = wordnet.Nountp_0.K0;
                      S_8 = S1_33;
                      succeeded = true;
                    }
//  wordnet.m:52
                  else
//  wordnet.m:53
                    {
                      java.lang.String S1_32 = null;
//  wordnet.m:52
                      java.lang.String V_17_17 = "r";
                      wordnet.Syncat_0 V_18_18 = null;

                      {
                        java.lang.Object [] result = string.remove_suffix_3_p_0(S0_6, V_17_17);
                        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                        S1_32 = (java.lang.String) result[1];
                      }
                      if (succeeded)
                        {
                          V_18_18 = wordnet.Syncat_0.K0;
                          {
                            succeeded = wordnet.check_word_3_p_0(WN_5, S1_32, V_18_18);
                          }
                        }
//  wordnet.m:53
                      if (succeeded)
//  wordnet.m:52
                        {
                          private_builtin.dummy_var = wordnet.Nountp_0.K0;
                          S_8 = S1_32;
                          succeeded = true;
                        }
//  wordnet.m:53
                      else
//  wordnet.m:55
                        {
                          java.lang.String S1_31 = null;
//  wordnet.m:53
                          java.lang.String V_19_19 = "ies";
                          java.lang.String V_20_20 = null;
                          wordnet.Syncat_0 V_21_21 = null;
                          java.lang.String V_22_22 = null;

                          {
                            java.lang.Object [] result = string.remove_suffix_3_p_0(S0_6, V_19_19);
                            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                            S1_31 = (java.lang.String) result[1];
                          }
                          if (succeeded)
                            {
                              V_22_22 = "y";
                              {
                                V_20_20 = string.f_43_43_2_f_0(S1_31, V_22_22);
                              }
                              V_21_21 = wordnet.Syncat_0.K0;
                              {
                                succeeded = wordnet.check_word_3_p_0(WN_5, V_20_20, V_21_21);
                              }
                            }
//  wordnet.m:55
                          if (succeeded)
//  wordnet.m:54
                            {
                              java.lang.String V_23_23 = null;

                              private_builtin.dummy_var = wordnet.Nountp_0.K0;
                              V_23_23 = "y";
                              {
                                S_8 = string.f_43_43_2_f_0(S1_31, V_23_23);
                              }
                              succeeded = true;
                            }
//  wordnet.m:55
                          else
//  wordnet.m:57
                            {
                              java.lang.String S1_30 = null;
//  wordnet.m:55
                              java.lang.String V_24_24 = "ied";
                              java.lang.String V_25_25 = null;
                              wordnet.Syncat_0 V_26_26 = null;
                              java.lang.String V_27_27 = null;

                              {
                                java.lang.Object [] result = string.remove_suffix_3_p_0(S0_6, V_24_24);
                                succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                                S1_30 = (java.lang.String) result[1];
                              }
                              if (succeeded)
                                {
                                  V_27_27 = "y";
                                  {
                                    V_25_25 = string.f_43_43_2_f_0(S1_30, V_27_27);
                                  }
                                  V_26_26 = wordnet.Syncat_0.K0;
                                  {
                                    succeeded = wordnet.check_word_3_p_0(WN_5, V_25_25, V_26_26);
                                  }
                                }
//  wordnet.m:57
                              if (succeeded)
//  wordnet.m:56
                                {
                                  java.lang.String V_28_28 = null;

                                  private_builtin.dummy_var = wordnet.Nountp_0.K0;
                                  V_28_28 = "y";
                                  {
                                    S_8 = string.f_43_43_2_f_0(S1_30, V_28_28);
                                  }
                                  succeeded = true;
                                }
//  wordnet.m:57
                              else
                                {
                                  wordnet.Syncat_0 V_29_29 = wordnet.Syncat_0.K2;

                                  {
                                    succeeded = wordnet.check_word_3_p_0(WN_5, S0_6, V_29_29);
                                  }
                                  if (succeeded)
                                    {
                                      private_builtin.dummy_var = wordnet.Nountp_0.K0;
                                      S_8 = S0_6;
                                      succeeded = true;
                                    }
                                }
                            }
//  wordnet.m:55
                        }
//  wordnet.m:53
                    }
//  wordnet.m:52
                }
//  wordnet.m:51
            }
//  wordnet.m:50
        }
//  wordnet.m:49
return new java.lang.Object[] {
        java.lang.Boolean.valueOf(succeeded),
        ((java.lang.Object) (S_8))
      };
    }
//  wordnet.m:27
  }
//  wordnet.m:24
  private static class Check_word_3_p_0_env_0
    extends /* env_ptr */ java.lang.Object
  {
//  wordnet.m:402
    public boolean succeeded;
    public jmercury.runtime.Commit commit_0;
    public wordnet.Wnspec_0 V_11_11;
    public wordnet.Wnspec_0 V_14_14;
    public wordnet.Syncat_0 V_18_18;
    public int V_19_19;
    public int V_20_20;
    public wordnet.Syncat_0 V_31_31;
//  wordnet.m:403
    public java.lang.Object conv0_V_14_14;

  }

//  wordnet.m:402
  private static void check_word_3_p_0_1(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      wordnet.Check_word_3_p_0_env_0 env_ptr = (wordnet.Check_word_3_p_0_env_0) env_ptr_arg;

      ((wordnet.Check_word_3_p_0_env_0) env_ptr).commit_0 = new jmercury.runtime.Commit();
      throw ((wordnet.Check_word_3_p_0_env_0) env_ptr).commit_0;
    }
  }
//  wordnet.m:403
  private static void check_word_3_p_0_4(
    java.lang.Object arg1,
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      wordnet.Check_word_3_p_0_env_0 env_ptr = (wordnet.Check_word_3_p_0_env_0) env_ptr_arg;

      ((wordnet.Check_word_3_p_0_env_0) env_ptr).conv0_V_14_14 = arg1;
      {
        wordnet.check_word_3_p_0_3(env_ptr);
      }
    }
  }
  private static void check_word_3_p_0_3(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      wordnet.Check_word_3_p_0_env_0 env_ptr = (wordnet.Check_word_3_p_0_env_0) env_ptr_arg;

      ((wordnet.Check_word_3_p_0_env_0) env_ptr).V_14_14 = ((wordnet.Wnspec_0) ((wordnet.Check_word_3_p_0_env_0) env_ptr).conv0_V_14_14);
      {
        wordnet.check_word_3_p_0_2(env_ptr);
      }
    }
  }
//  wordnet.m:402
  private static void check_word_3_p_0_2(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      wordnet.Check_word_3_p_0_env_0 env_ptr = (wordnet.Check_word_3_p_0_env_0) env_ptr_arg;

//  wordnet.m:403
      ((wordnet.Check_word_3_p_0_env_0) env_ptr).succeeded = ((((wordnet.Check_word_3_p_0_env_0) env_ptr).V_14_14).data_tag == 0);
      if (((wordnet.Check_word_3_p_0_env_0) env_ptr).succeeded)
        {
          {
            ((wordnet.Check_word_3_p_0_env_0) env_ptr).V_18_18 = ((wordnet.Wnspec_0.Word_3) (((wordnet.Check_word_3_p_0_env_0) env_ptr).V_14_14)).F1;
            ((wordnet.Check_word_3_p_0_env_0) env_ptr).V_19_19 = ((wordnet.Wnspec_0.Word_3) (((wordnet.Check_word_3_p_0_env_0) env_ptr).V_14_14)).F2;
            ((wordnet.Check_word_3_p_0_env_0) env_ptr).V_20_20 = ((wordnet.Wnspec_0.Word_3) (((wordnet.Check_word_3_p_0_env_0) env_ptr).V_14_14)).F3;
          }
//  wordnet.m:402
          {
//  wordnet.m:403
            ((wordnet.Check_word_3_p_0_env_0) env_ptr).V_31_31 = ((wordnet.Wnspec_0.Word_3) (((wordnet.Check_word_3_p_0_env_0) env_ptr).V_11_11)).F1;
            ((wordnet.Wnspec_0.Word_3) (((wordnet.Check_word_3_p_0_env_0) env_ptr).V_11_11)).F2 = ((wordnet.Check_word_3_p_0_env_0) env_ptr).V_19_19;
            ((wordnet.Wnspec_0.Word_3) (((wordnet.Check_word_3_p_0_env_0) env_ptr).V_11_11)).F3 = ((wordnet.Check_word_3_p_0_env_0) env_ptr).V_20_20;
            ((wordnet.Check_word_3_p_0_env_0) env_ptr).succeeded = (((wordnet.Check_word_3_p_0_env_0) env_ptr).V_18_18.MR_value == ((wordnet.Check_word_3_p_0_env_0) env_ptr).V_31_31.MR_value);
            if (((wordnet.Check_word_3_p_0_env_0) env_ptr).succeeded)
              {
                wordnet.check_word_3_p_0_1(env_ptr);
              }
//  wordnet.m:402
          }
//  wordnet.m:403
        }
//  wordnet.m:402
    }
  }
//  wordnet.m:24
  public static boolean check_word_3_p_0(
    maybe.Maybe_1 HeadVar__1_1,
    java.lang.String Word_5,
    wordnet.Syncat_0 Cat_6)
  {
    {
      wordnet.Check_word_3_p_0_env_0 env = null;
      wordnet.Check_word_3_p_0_env_0 env_ptr = null;

      {
        env = new wordnet.Check_word_3_p_0_env_0();
      }
      env_ptr = env;
//  wordnet.m:402
      try
      {
        {
          {
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_12_12 = null;
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_13_13 = null;
            tree234.Tree234_2 Map_4 = null;
            list.List_1 Ss_7 = null;
            wordnet.Wndata_0 V_10_10 = null;
//  wordnet.m:403
            int V_8_8 = 0;
            int V_9_9 = 0;

//  wordnet.m:402
            ((wordnet.Check_word_3_p_0_env_0) env_ptr).succeeded = (HeadVar__1_1.data_tag == 1);
            if (((wordnet.Check_word_3_p_0_env_0) env_ptr).succeeded)
              {
                V_10_10 = ((wordnet.Wndata_0) ((maybe.Maybe_1.Yes_1) HeadVar__1_1).F1);
                Map_4 = ((wordnet.Wndata_0) V_10_10).F1;
                TypeCtorInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
                TypeCtorInfo_13_13 = jmercury.runtime.TypeInfo_Struct.maybe_new(wordnet.wordnet__type_ctor_info_wnspec_0);
//  wordnet.m:403
                {
                  java.lang.Object [] result = multi_map.search_3_p_0(TypeCtorInfo_12_12, TypeCtorInfo_13_13, Map_4, ((java.lang.Object) (Word_5)));
                  ((wordnet.Check_word_3_p_0_env_0) env_ptr).succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                  Ss_7 = (list.List_1) result[1];
                }
//  wordnet.m:402
                if (((wordnet.Check_word_3_p_0_env_0) env_ptr).succeeded)
                  {
//  wordnet.m:403
                    {
                      ((wordnet.Check_word_3_p_0_env_0) env_ptr).V_11_11 = new wordnet.Wnspec_0.Word_3(Cat_6, 0, 0);
                    }
                    {
                      list.member_2_p_1(TypeCtorInfo_13_13, Ss_7, new AddrOf2_0(25), env_ptr);
                    }
//  wordnet.m:402
                  }
              }
          }
          ((wordnet.Check_word_3_p_0_env_0) env_ptr).succeeded = false;
        }
      }
      catch (jmercury.runtime.Commit commit_variable)
      {
                ((wordnet.Check_word_3_p_0_env_0) env_ptr).succeeded = true;
      }
      return ((wordnet.Check_word_3_p_0_env_0) env_ptr).succeeded;
//  wordnet.m:24
    }
  }
//  wordnet.m:22
  private static class Check_word_2_p_0_env_0
    extends /* env_ptr */ java.lang.Object
  {
//  wordnet.m:397
    public boolean succeeded;
//  wordnet.m:398
    public jmercury.runtime.Commit commit_0;
    public wordnet.Wnspec_0 V_13_13;
    public wordnet.Wnspec_0 V_21_21;
    public wordnet.Syncat_0 V_26_26;
    public int V_27_27;
    public int V_28_28;
    public java.lang.Object conv0_V_21_21;
//  wordnet.m:400
    public jmercury.runtime.Commit commit_1;
    public wordnet.Wnspec_0 V_15_15;
    public wordnet.Wnspec_0 V_22_22;
    public wordnet.Syncat_0 V_42_42;
    public int V_43_43;
    public int V_44_44;
    public java.lang.Object conv1_V_22_22;

  }

//  wordnet.m:398
  private static void check_word_2_p_0_1(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      wordnet.Check_word_2_p_0_env_0 env_ptr = (wordnet.Check_word_2_p_0_env_0) env_ptr_arg;

      ((wordnet.Check_word_2_p_0_env_0) env_ptr).commit_0 = new jmercury.runtime.Commit();
      throw ((wordnet.Check_word_2_p_0_env_0) env_ptr).commit_0;
    }
  }
  private static void check_word_2_p_0_4(
    java.lang.Object arg1,
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      wordnet.Check_word_2_p_0_env_0 env_ptr = (wordnet.Check_word_2_p_0_env_0) env_ptr_arg;

      ((wordnet.Check_word_2_p_0_env_0) env_ptr).conv0_V_21_21 = arg1;
      {
        wordnet.check_word_2_p_0_3(env_ptr);
      }
    }
  }
  private static void check_word_2_p_0_3(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      wordnet.Check_word_2_p_0_env_0 env_ptr = (wordnet.Check_word_2_p_0_env_0) env_ptr_arg;

      ((wordnet.Check_word_2_p_0_env_0) env_ptr).V_21_21 = ((wordnet.Wnspec_0) ((wordnet.Check_word_2_p_0_env_0) env_ptr).conv0_V_21_21);
      {
        wordnet.check_word_2_p_0_2(env_ptr);
      }
    }
  }
  private static void check_word_2_p_0_2(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      wordnet.Check_word_2_p_0_env_0 env_ptr = (wordnet.Check_word_2_p_0_env_0) env_ptr_arg;

      ((wordnet.Check_word_2_p_0_env_0) env_ptr).succeeded = ((((wordnet.Check_word_2_p_0_env_0) env_ptr).V_21_21).data_tag == 0);
      if (((wordnet.Check_word_2_p_0_env_0) env_ptr).succeeded)
        {
          {
            ((wordnet.Check_word_2_p_0_env_0) env_ptr).V_26_26 = ((wordnet.Wnspec_0.Word_3) (((wordnet.Check_word_2_p_0_env_0) env_ptr).V_21_21)).F1;
            ((wordnet.Check_word_2_p_0_env_0) env_ptr).V_27_27 = ((wordnet.Wnspec_0.Word_3) (((wordnet.Check_word_2_p_0_env_0) env_ptr).V_21_21)).F2;
            ((wordnet.Check_word_2_p_0_env_0) env_ptr).V_28_28 = ((wordnet.Wnspec_0.Word_3) (((wordnet.Check_word_2_p_0_env_0) env_ptr).V_21_21)).F3;
          }
          {
            ((wordnet.Wnspec_0.Word_3) (((wordnet.Check_word_2_p_0_env_0) env_ptr).V_13_13)).F1 = ((wordnet.Check_word_2_p_0_env_0) env_ptr).V_26_26;
            ((wordnet.Wnspec_0.Word_3) (((wordnet.Check_word_2_p_0_env_0) env_ptr).V_13_13)).F2 = ((wordnet.Check_word_2_p_0_env_0) env_ptr).V_27_27;
            ((wordnet.Wnspec_0.Word_3) (((wordnet.Check_word_2_p_0_env_0) env_ptr).V_13_13)).F3 = ((wordnet.Check_word_2_p_0_env_0) env_ptr).V_28_28;
            {
              wordnet.check_word_2_p_0_1(env_ptr);
            }
          }
        }
    }
  }
//  wordnet.m:400
  private static void check_word_2_p_0_5(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      wordnet.Check_word_2_p_0_env_0 env_ptr = (wordnet.Check_word_2_p_0_env_0) env_ptr_arg;

      ((wordnet.Check_word_2_p_0_env_0) env_ptr).commit_1 = new jmercury.runtime.Commit();
      throw ((wordnet.Check_word_2_p_0_env_0) env_ptr).commit_1;
    }
  }
  private static void check_word_2_p_0_8(
    java.lang.Object arg1,
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      wordnet.Check_word_2_p_0_env_0 env_ptr = (wordnet.Check_word_2_p_0_env_0) env_ptr_arg;

      ((wordnet.Check_word_2_p_0_env_0) env_ptr).conv1_V_22_22 = arg1;
      {
        wordnet.check_word_2_p_0_7(env_ptr);
      }
    }
  }
  private static void check_word_2_p_0_7(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      wordnet.Check_word_2_p_0_env_0 env_ptr = (wordnet.Check_word_2_p_0_env_0) env_ptr_arg;

      ((wordnet.Check_word_2_p_0_env_0) env_ptr).V_22_22 = ((wordnet.Wnspec_0) ((wordnet.Check_word_2_p_0_env_0) env_ptr).conv1_V_22_22);
      {
        wordnet.check_word_2_p_0_6(env_ptr);
      }
    }
  }
  private static void check_word_2_p_0_6(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      wordnet.Check_word_2_p_0_env_0 env_ptr = (wordnet.Check_word_2_p_0_env_0) env_ptr_arg;

//  wordnet.m:398
      ((wordnet.Check_word_2_p_0_env_0) env_ptr).succeeded = ((((wordnet.Check_word_2_p_0_env_0) env_ptr).V_22_22).data_tag == 0);
      if (((wordnet.Check_word_2_p_0_env_0) env_ptr).succeeded)
        {
          {
            ((wordnet.Check_word_2_p_0_env_0) env_ptr).V_42_42 = ((wordnet.Wnspec_0.Word_3) (((wordnet.Check_word_2_p_0_env_0) env_ptr).V_22_22)).F1;
            ((wordnet.Check_word_2_p_0_env_0) env_ptr).V_43_43 = ((wordnet.Wnspec_0.Word_3) (((wordnet.Check_word_2_p_0_env_0) env_ptr).V_22_22)).F2;
            ((wordnet.Check_word_2_p_0_env_0) env_ptr).V_44_44 = ((wordnet.Wnspec_0.Word_3) (((wordnet.Check_word_2_p_0_env_0) env_ptr).V_22_22)).F3;
          }
//  wordnet.m:400
          {
//  wordnet.m:398
            ((wordnet.Wnspec_0.Word_3) (((wordnet.Check_word_2_p_0_env_0) env_ptr).V_15_15)).F1 = ((wordnet.Check_word_2_p_0_env_0) env_ptr).V_42_42;
            ((wordnet.Wnspec_0.Word_3) (((wordnet.Check_word_2_p_0_env_0) env_ptr).V_15_15)).F2 = ((wordnet.Check_word_2_p_0_env_0) env_ptr).V_43_43;
            ((wordnet.Wnspec_0.Word_3) (((wordnet.Check_word_2_p_0_env_0) env_ptr).V_15_15)).F3 = ((wordnet.Check_word_2_p_0_env_0) env_ptr).V_44_44;
            {
              wordnet.check_word_2_p_0_5(env_ptr);
            }
//  wordnet.m:400
          }
//  wordnet.m:398
        }
//  wordnet.m:400
    }
  }
//  wordnet.m:22
  public static boolean check_word_2_p_0(
    maybe.Maybe_1 HeadVar__1_1,
    java.lang.String Word_4)
  {
    {
      wordnet.Check_word_2_p_0_env_0 env = null;
      wordnet.Check_word_2_p_0_env_0 env_ptr = null;

      {
        env = new wordnet.Check_word_2_p_0_env_0();
      }
      env_ptr = env;
//  wordnet.m:397
      {
        tree234.Tree234_2 Map_3 = null;
        wordnet.Wndata_0 V_12_12 = null;

        ((wordnet.Check_word_2_p_0_env_0) env_ptr).succeeded = (HeadVar__1_1.data_tag == 1);
        if (((wordnet.Check_word_2_p_0_env_0) env_ptr).succeeded)
          {
            V_12_12 = ((wordnet.Wndata_0) ((maybe.Maybe_1.Yes_1) HeadVar__1_1).F1);
            Map_3 = ((wordnet.Wndata_0) V_12_12).F1;
//  wordnet.m:398
            try
            {
              {
                {
                  jmercury.runtime.TypeInfo_Struct TypeCtorInfo_17_17 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
                  jmercury.runtime.TypeInfo_Struct TypeCtorInfo_18_18 = jmercury.runtime.TypeInfo_Struct.maybe_new(wordnet.wordnet__type_ctor_info_wnspec_0);
                  list.List_1 Ss_5 = null;
                  wordnet.Syncat_0 V_6_6 = null;
                  int V_7_7 = 0;
                  int V_8_8 = 0;

                  {
                    java.lang.Object [] result = multi_map.search_3_p_0(TypeCtorInfo_17_17, TypeCtorInfo_18_18, Map_3, ((java.lang.Object) (Word_4)));
                    ((wordnet.Check_word_2_p_0_env_0) env_ptr).succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                    Ss_5 = (list.List_1) result[1];
                  }
                  if (((wordnet.Check_word_2_p_0_env_0) env_ptr).succeeded)
                    {
                      {
                        ((wordnet.Check_word_2_p_0_env_0) env_ptr).V_13_13 = new wordnet.Wnspec_0.Word_3(null, 0, 0);
                      }
                      {
                        list.member_2_p_1(TypeCtorInfo_18_18, Ss_5, new AddrOf2_0(26), env_ptr);
                      }
                    }
                }
                ((wordnet.Check_word_2_p_0_env_0) env_ptr).succeeded = false;
              }
            }
            catch (jmercury.runtime.Commit commit_variable)
            {
                            ((wordnet.Check_word_2_p_0_env_0) env_ptr).succeeded = true;
            }
//  wordnet.m:400
            if (((wordnet.Check_word_2_p_0_env_0) env_ptr).succeeded)
//  wordnet.m:399
              ((wordnet.Check_word_2_p_0_env_0) env_ptr).succeeded = true;
//  wordnet.m:400
            else
              {
                try
                {
                  {
                    {
                      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_19_19 = null;
                      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_20_20 = null;
                      java.lang.String V_14_14 = null;
                      list.List_1 Ss_16 = null;
                      wordnet.Syncat_0 V_9_9 = null;
                      int V_10_10 = 0;
                      int V_11_11 = 0;

                      {
                        V_14_14 = string.to_lower_1_f_0(Word_4);
                      }
                      TypeCtorInfo_19_19 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
                      TypeCtorInfo_20_20 = jmercury.runtime.TypeInfo_Struct.maybe_new(wordnet.wordnet__type_ctor_info_wnspec_0);
                      {
                        java.lang.Object [] result = multi_map.search_3_p_0(TypeCtorInfo_19_19, TypeCtorInfo_20_20, Map_3, ((java.lang.Object) (V_14_14)));
                        ((wordnet.Check_word_2_p_0_env_0) env_ptr).succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                        Ss_16 = (list.List_1) result[1];
                      }
                      if (((wordnet.Check_word_2_p_0_env_0) env_ptr).succeeded)
                        {
                          {
                            ((wordnet.Check_word_2_p_0_env_0) env_ptr).V_15_15 = new wordnet.Wnspec_0.Word_3(null, 0, 0);
                          }
                          {
                            list.member_2_p_1(TypeCtorInfo_20_20, Ss_16, new AddrOf2_0(27), env_ptr);
                          }
                        }
                    }
                    ((wordnet.Check_word_2_p_0_env_0) env_ptr).succeeded = false;
                  }
                }
                catch (jmercury.runtime.Commit commit_variable)
                {
                                    ((wordnet.Check_word_2_p_0_env_0) env_ptr).succeeded = true;
                }
              }
//  wordnet.m:397
          }
        return ((wordnet.Check_word_2_p_0_env_0) env_ptr).succeeded;
      }
//  wordnet.m:22
    }
  }
//  wordnet.m:20
  public static java.lang.Object [] new_wordnet_6_p_0(
    maybe.Maybe_1 HeadVar__1_1,
    list.List_1 STATE_VARIABLE_Es_0_3)
  {
//  wordnet.m:355
    {
      boolean succeeded = false;
      wordnet.Wndata_0 Data_2 = null;
      list.List_1 STATE_VARIABLE_Es_4 = null;

      if ((HeadVar__1_1.data_tag == 0))
//  wordnet.m:363
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_42_42 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_43_43 = jmercury.runtime.TypeInfo_Struct.maybe_new(wordnet.wordnet__type_ctor_info_wnspec_0);
          tree234.Tree234_2 V_36_36 = null;

//  wordnet.m:364
          {
            V_36_36 = multi_map.init_0_f_0(TypeCtorInfo_42_42, TypeCtorInfo_43_43);
          }
          {
            Data_2 = new wordnet.Wndata_0(V_36_36);
          }
//  wordnet.m:363
          STATE_VARIABLE_Es_4 = STATE_VARIABLE_Es_0_3;
        }
//  wordnet.m:355
      else
        {
          java.lang.String File_7 = ((java.lang.String) ((maybe.Maybe_1.Yes_1) HeadVar__1_1).F1);
          io.Res_1 Res_11 = null;

//  wordnet.m:356
          {
            Res_11 = io.open_input_4_p_0(File_7);
          }
//  wordnet.m:360
          if ((Res_11.data_tag == 1))
            {
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_39_39 = null;
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_40_40 = null;
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_41_41 = null;
              io.Error_0 Error_14 = ((io.Res_1.Error_1) Res_11).F1;
              java.lang.String Msg_15 = null;
              errors.Err_loc_0 V_21_21 = null;
              sberrs.Error_0 V_22_22 = null;
              tree234.Tree234_2 V_24_24 = null;

              {
                Msg_15 = io.error_message_2_p_0(Error_14);
              }
//  wordnet.m:361
              {
                V_21_21 = new errors.Err_loc_0.File_1(File_7);
              }
              {
                V_22_22 = new sberrs.Error_0.Io_1(Msg_15);
              }
              TypeCtorInfo_39_39 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
              {
                STATE_VARIABLE_Es_4 = errors.add_error_4_p_0(TypeCtorInfo_39_39, V_21_21, ((java.lang.Object) (V_22_22)), STATE_VARIABLE_Es_0_3);
              }
              TypeCtorInfo_40_40 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
              TypeCtorInfo_41_41 = jmercury.runtime.TypeInfo_Struct.maybe_new(wordnet.wordnet__type_ctor_info_wnspec_0);
//  wordnet.m:362
              {
                V_24_24 = multi_map.init_0_f_0(TypeCtorInfo_40_40, TypeCtorInfo_41_41);
              }
              {
                Data_2 = new wordnet.Wndata_0(V_24_24);
              }
//  wordnet.m:360
            }
          else
//  wordnet.m:357
            {
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_37_37 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_38_38 = jmercury.runtime.TypeInfo_Struct.maybe_new(wordnet.wordnet__type_ctor_info_wnspec_0);
              io.Input_stream_0 S_12 = ((io.Input_stream_0) ((io.Res_1.Ok_1) Res_11).F1);
              wordnet.Wndata_0 Data0_13 = null;
              tree234.Tree234_2 V_25_25 = null;

              {
                V_25_25 = multi_map.init_0_f_0(TypeCtorInfo_37_37, TypeCtorInfo_38_38);
              }
              {
                Data0_13 = new wordnet.Wndata_0(V_25_25);
              }
//  wordnet.m:358
              {
                java.lang.Object [] result = wordnet.read_wordnet_8_p_0(File_7, S_12, Data0_13, STATE_VARIABLE_Es_0_3);
                Data_2 = (wordnet.Wndata_0) result[0];
                STATE_VARIABLE_Es_4 = (list.List_1) result[1];
              }
//  wordnet.m:359
              {
                io.close_input_3_p_0(S_12);
              }
//  wordnet.m:357
            }
//  wordnet.m:355
        }
return new java.lang.Object[] {
        ((java.lang.Object) (Data_2)),
        ((java.lang.Object) (STATE_VARIABLE_Es_4))
      };
    }
//  wordnet.m:20
  }

// ExportDefns

// ExportedEnums

// InitPreds

// FinalPreds

// EnvVarNames
  static {
    if (System.getenv("MERCURY_DEBUG_CLASS_INIT") != null) {
      System.out.println("[wordnet end init]");
    }
  }
}
// :- end_module wordnet.
