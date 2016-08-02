//
//
// Automatically generated from utils.m by the Mercury Compiler,
// version 14.01.1, configured for x86_64-unknown-linux-gnu
//
//

/* :- module utils. */

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
// import stream;
// import string;
// import term;
// import time;
// import tree234;
// import type_desc;
// import univ;
// import wordnet;
// import xml;
public class utils {
  static {
    if (System.getenv("MERCURY_DEBUG_CLASS_INIT") != null) {
      System.out.println("[utils start init]");
    }
  }

// RttiDefns
  private static final jmercury.runtime.TypeInfo_Struct maybe__pti_maybe_1__plain_wordnet__type_ctor_info_wndata_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1builtin__type_ctor_info_string_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__pti_pair_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1builtin__type_ctor_info_string_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_utils__type_ctor_info_corefdata_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__pti_pair_2__plain_builtin__type_ctor_info_string_0__plain_utils__type_ctor_info_corefs_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__pti_tree234_2__plain_list__ti_list_1builtin__type_ctor_info_string_0__plain_list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct set_ordlist__pti_set_ordlist_1__plain_pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__pti_pair_2__plain_list__ti_list_1builtin__type_ctor_info_string_0__plain_list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__pti_pair_2__plain_builtin__type_ctor_info_string_0__plain_list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__pti_tree234_2__plain_builtin__type_ctor_info_string_0__plain_list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__pti_list_1__plain_pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__pti_tree234_2__plain_pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_string_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__pti_list_1__plain_builtin__type_ctor_info_character_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__pti_pair_2__plain_builtin__type_ctor_info_string_0__plain_builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__pti_pair_2__plain_pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_string_0 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct utils__type_ctor_info_corefclass_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] utils__field_types_corefdata_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc utils__du_functor_desc_corefdata_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] utils__du_stag_ordered_corefdata_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] utils__du_ptag_ordered_corefdata_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] utils__du_name_ordered_corefdata_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] utils__functor_number_map_corefdata_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct utils__type_ctor_info_corefdata_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__ti_tree234_2builtin__type_ctor_info_int_0utils__type_ctor_info_corefdata_0 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct utils__type_ctor_info_corefmap_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] utils__field_types_corefs_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc utils__du_functor_desc_corefs_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] utils__du_stag_ordered_corefs_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] utils__du_ptag_ordered_corefs_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] utils__du_name_ordered_corefs_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] utils__functor_number_map_corefs_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct utils__type_ctor_info_corefs_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct utils__type_ctor_info_csym_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__ti_tree234_2pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0builtin__type_ctor_info_string_0 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct utils__type_ctor_info_csymmap_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  static {
    //
    //
    //
    maybe__pti_maybe_1__plain_wordnet__type_ctor_info_wndata_0.init(maybe.maybe__type_ctor_info_maybe_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) wordnet.wordnet__type_ctor_info_wndata_0});
    //
    //
    //
    list__ti_list_1builtin__type_ctor_info_string_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0)});
    //
    //
    //
    pair__pti_pair_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1builtin__type_ctor_info_string_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0,
		(jmercury.runtime.PseudoTypeInfo) utils.list__ti_list_1builtin__type_ctor_info_string_0});
    //
    //
    //
    tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_utils__type_ctor_info_corefdata_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0,
		(jmercury.runtime.PseudoTypeInfo) utils.utils__type_ctor_info_corefdata_0});
    //
    //
    pair__pti_pair_2__plain_builtin__type_ctor_info_string_0__plain_utils__type_ctor_info_corefs_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0,
		(jmercury.runtime.PseudoTypeInfo) utils.utils__type_ctor_info_corefs_0});
    //
    pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0)});
    //
    list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(utils.pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0)});
    //
    tree234__pti_tree234_2__plain_list__ti_list_1builtin__type_ctor_info_string_0__plain_list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) utils.list__ti_list_1builtin__type_ctor_info_string_0,
		(jmercury.runtime.PseudoTypeInfo) utils.list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0});
    //
    //
    set_ordlist__pti_set_ordlist_1__plain_pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0.init(set_ordlist.set_ordlist__type_ctor_info_set_ordlist_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) utils.pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0});
    //
    pair__pti_pair_2__plain_list__ti_list_1builtin__type_ctor_info_string_0__plain_list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) utils.list__ti_list_1builtin__type_ctor_info_string_0,
		(jmercury.runtime.PseudoTypeInfo) utils.list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0});
    //
    pair__pti_pair_2__plain_builtin__type_ctor_info_string_0__plain_list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0,
		(jmercury.runtime.PseudoTypeInfo) utils.list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0});
    //
    tree234__pti_tree234_2__plain_builtin__type_ctor_info_string_0__plain_list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0,
		(jmercury.runtime.PseudoTypeInfo) utils.list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0});
    //
    list__pti_list_1__plain_pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) utils.pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0});
    //
    tree234__pti_tree234_2__plain_pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_string_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) utils.pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0,
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0});
    //
    //
    list__pti_list_1__plain_builtin__type_ctor_info_character_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_character_0});
    //
    pair__pti_pair_2__plain_builtin__type_ctor_info_string_0__plain_builtin__type_ctor_info_int_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0,
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0});
    //
    pair__pti_pair_2__plain_pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_string_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) utils.pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0,
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0});
    //
    utils__type_ctor_info_corefclass_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(0))),
		((java.lang.Object) (new AddrOf2_0(1))),
		"utils",
		"corefclass",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0),
		-1,
		0,
		null);
    //
    utils__field_types_corefdata_0_0[0] = (jmercury.runtime.PseudoTypeInfo) utils.list__ti_list_1builtin__type_ctor_info_string_0;
    utils__field_types_corefdata_0_0[1] = (jmercury.runtime.PseudoTypeInfo) utils.list__ti_list_1builtin__type_ctor_info_string_0;
    utils__field_types_corefdata_0_0[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    utils__du_functor_desc_corefdata_0_0.init("corefdata",
		3,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		utils.utils__field_types_corefdata_0_0,
		null,
		null,
		null);
    //
    utils__du_stag_ordered_corefdata_0_0[0] = utils.utils__du_functor_desc_corefdata_0_0;
    //
    utils__du_ptag_ordered_corefdata_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		utils.utils__du_stag_ordered_corefdata_0_0);
    //
    utils__du_name_ordered_corefdata_0[0] = utils.utils__du_functor_desc_corefdata_0_0;
    //
    utils__functor_number_map_corefdata_0[0] = 0;
    //
    utils__type_ctor_info_corefdata_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(2))),
		((java.lang.Object) (new AddrOf2_0(3))),
		"utils",
		"corefdata",
		new jmercury.runtime.TypeFunctors(utils.utils__du_name_ordered_corefdata_0),
		new jmercury.runtime.TypeLayout(utils.utils__du_ptag_ordered_corefdata_0),
		1,
		4,
		utils.utils__functor_number_map_corefdata_0);
    //
    tree234__ti_tree234_2builtin__type_ctor_info_int_0utils__type_ctor_info_corefdata_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(utils.utils__type_ctor_info_corefdata_0)});
    //
    utils__type_ctor_info_corefmap_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(4))),
		((java.lang.Object) (new AddrOf2_0(5))),
		"utils",
		"corefmap",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) utils.tree234__ti_tree234_2builtin__type_ctor_info_int_0utils__type_ctor_info_corefdata_0),
		-1,
		0,
		null);
    //
    list__ti_list_1builtin__type_ctor_info_int_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0)});
    //
    utils__field_types_corefs_0_0[0] = (jmercury.runtime.PseudoTypeInfo) utils.list__ti_list_1builtin__type_ctor_info_int_0;
    utils__field_types_corefs_0_0[1] = (jmercury.runtime.PseudoTypeInfo) utils.list__ti_list_1builtin__type_ctor_info_int_0;
    utils__field_types_corefs_0_0[2] = (jmercury.runtime.PseudoTypeInfo) utils.tree234__ti_tree234_2builtin__type_ctor_info_int_0utils__type_ctor_info_corefdata_0;
    //
    utils__du_functor_desc_corefs_0_0.init("corefs",
		3,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		utils.utils__field_types_corefs_0_0,
		null,
		null,
		null);
    //
    utils__du_stag_ordered_corefs_0_0[0] = utils.utils__du_functor_desc_corefs_0_0;
    //
    utils__du_ptag_ordered_corefs_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		utils.utils__du_stag_ordered_corefs_0_0);
    //
    utils__du_name_ordered_corefs_0[0] = utils.utils__du_functor_desc_corefs_0_0;
    //
    utils__functor_number_map_corefs_0[0] = 0;
    //
    utils__type_ctor_info_corefs_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(6))),
		((java.lang.Object) (new AddrOf2_0(7))),
		"utils",
		"corefs",
		new jmercury.runtime.TypeFunctors(utils.utils__du_name_ordered_corefs_0),
		new jmercury.runtime.TypeLayout(utils.utils__du_ptag_ordered_corefs_0),
		1,
		4,
		utils.utils__functor_number_map_corefs_0);
    //
    utils__type_ctor_info_csym_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(8))),
		((java.lang.Object) (new AddrOf2_0(9))),
		"utils",
		"csym",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) utils.pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0),
		-1,
		0,
		null);
    //
    tree234__ti_tree234_2pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0builtin__type_ctor_info_string_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(utils.pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0)});
    //
    utils__type_ctor_info_csymmap_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(10))),
		((java.lang.Object) (new AddrOf2_0(11))),
		"utils",
		"csymmap",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) utils.tree234__ti_tree234_2pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0builtin__type_ctor_info_string_0),
		-1,
		0,
		null);
  }

// DataDefns
  static {
  }

// Scalar common data
  private static final jmercury.runtime.TypeInfo_Struct[] MR_scalar_common_1 = new jmercury.runtime.TypeInfo_Struct[15];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_2 = new /* generic_type */ java.lang.Object[2][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_3 = new /* generic_type */ java.lang.Object[1][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_4 = new /* generic_type */ java.lang.Object[6][];
  private static final list.List_1.F_nil_0[] MR_scalar_common_5 = new list.List_1.F_nil_0[1];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_6 = new /* generic_type */ java.lang.Object[2][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_7 = new /* generic_type */ java.lang.Object[4][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_8 = new /* generic_type */ java.lang.Object[2][];
  private static final list.List_1.F_cons_2[] MR_scalar_common_9 = new list.List_1.F_cons_2[1];
  private static void MR_init_scalars_0() {
    MR_scalar_common_1[0] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0))));
    MR_scalar_common_1[1] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[0]))));
    MR_scalar_common_1[2] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(tree234.tree234__type_ctor_info_tree234_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(utils.utils__type_ctor_info_corefdata_0))));
    MR_scalar_common_1[3] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))));
    MR_scalar_common_1[4] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[3]))));
    MR_scalar_common_1[5] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(utils.utils__type_ctor_info_corefs_0))));
    MR_scalar_common_1[6] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(tree234.tree234__type_ctor_info_tree234_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[0]))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[4]))));
    MR_scalar_common_1[7] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(set_ordlist.set_ordlist__type_ctor_info_set_ordlist_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[3]))));
    MR_scalar_common_1[8] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[0]))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[4]))));
    MR_scalar_common_1[9] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[4]))));
    MR_scalar_common_1[10] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(tree234.tree234__type_ctor_info_tree234_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[4]))));
    MR_scalar_common_1[11] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[3]))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0))));
    MR_scalar_common_1[12] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(tree234.tree234__type_ctor_info_tree234_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[3]))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0))));
    MR_scalar_common_1[13] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_character_0))));
    MR_scalar_common_1[14] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))));
    MR_scalar_common_2[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(4),
		((java.lang.Object) (utils.maybe__pti_maybe_1__plain_wordnet__type_ctor_info_wndata_0)),
		((java.lang.Object) (utils.pair__pti_pair_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1builtin__type_ctor_info_string_0)),
		((java.lang.Object) (utils.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_utils__type_ctor_info_corefdata_0)),
		((java.lang.Object) (utils.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_utils__type_ctor_info_corefdata_0))};
    MR_scalar_common_2[1] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(4),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (utils.list__pti_list_1__plain_pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0)),
		((java.lang.Object) (utils.tree234__pti_tree234_2__plain_pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_string_0)),
		((java.lang.Object) (utils.tree234__pti_tree234_2__plain_pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_string_0))};
    MR_scalar_common_3[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(9),
		((java.lang.Object) (utils.pair__pti_pair_2__plain_builtin__type_ctor_info_string_0__plain_utils__type_ctor_info_corefs_0)),
		((java.lang.Object) (utils.tree234__pti_tree234_2__plain_list__ti_list_1builtin__type_ctor_info_string_0__plain_list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0)),
		((java.lang.Object) (utils.tree234__pti_tree234_2__plain_list__ti_list_1builtin__type_ctor_info_string_0__plain_list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0)),
		((java.lang.Object) (utils.set_ordlist__pti_set_ordlist_1__plain_pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0)),
		((java.lang.Object) (utils.set_ordlist__pti_set_ordlist_1__plain_pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0)),
		((java.lang.Object) (utils.set_ordlist__pti_set_ordlist_1__plain_pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0)),
		((java.lang.Object) (utils.set_ordlist__pti_set_ordlist_1__plain_pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0)),
		((java.lang.Object) (utils.set_ordlist__pti_set_ordlist_1__plain_pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0)),
		((java.lang.Object) (utils.set_ordlist__pti_set_ordlist_1__plain_pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0))};
    MR_scalar_common_4[0] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (utils.MR_scalar_common_3[0])),
		((java.lang.Object) (new AddrOf6_0())),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_6[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(2),
		((java.lang.Object) (utils.pair__pti_pair_2__plain_list__ti_list_1builtin__type_ctor_info_string_0__plain_list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0)),
		((java.lang.Object) (utils.pair__pti_pair_2__plain_builtin__type_ctor_info_string_0__plain_list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0))};
    MR_scalar_common_4[1] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (utils.MR_scalar_common_6[0])),
		((java.lang.Object) (new AddrOf2_0(14))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_7[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(3),
		((java.lang.Object) (utils.pair__pti_pair_2__plain_builtin__type_ctor_info_string_0__plain_list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0)),
		((java.lang.Object) (utils.tree234__pti_tree234_2__plain_builtin__type_ctor_info_string_0__plain_list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0)),
		((java.lang.Object) (utils.tree234__pti_tree234_2__plain_builtin__type_ctor_info_string_0__plain_list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0))};
    MR_scalar_common_4[2] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (utils.MR_scalar_common_7[0])),
		((java.lang.Object) (new AddrOf3_0(2))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_4[3] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (utils.MR_scalar_common_2[1])),
		((java.lang.Object) (new AddrOf4_0(1))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_7[1] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(3),
		((java.lang.Object) (builtin.builtin__type_ctor_info_character_0)),
		((java.lang.Object) (utils.list__pti_list_1__plain_builtin__type_ctor_info_character_0)),
		((java.lang.Object) (utils.list__pti_list_1__plain_builtin__type_ctor_info_character_0))};
    MR_scalar_common_4[4] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (utils.MR_scalar_common_7[1])),
		((java.lang.Object) (new AddrOf3_0(3))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_6[1] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(2),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0))};
    MR_scalar_common_4[5] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (utils.MR_scalar_common_6[1])),
		((java.lang.Object) (new AddrOf2_0(15))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_5[0] = new list.List_1.F_nil_0();
    MR_scalar_common_7[2] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(3),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (utils.pair__pti_pair_2__plain_builtin__type_ctor_info_string_0__plain_builtin__type_ctor_info_int_0))};
    MR_scalar_common_7[3] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(3),
		((java.lang.Object) (utils.maybe__pti_maybe_1__plain_wordnet__type_ctor_info_wndata_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0))};
    MR_scalar_common_8[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(5),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (utils.utils__type_ctor_info_corefdata_0)),
		((java.lang.Object) (utils.tree234__pti_tree234_2__plain_list__ti_list_1builtin__type_ctor_info_string_0__plain_list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0)),
		((java.lang.Object) (utils.tree234__pti_tree234_2__plain_list__ti_list_1builtin__type_ctor_info_string_0__plain_list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0))};
    MR_scalar_common_8[1] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(5),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (utils.pair__pti_pair_2__plain_builtin__type_ctor_info_string_0__plain_builtin__type_ctor_info_int_0)),
		((java.lang.Object) (utils.pair__pti_pair_2__plain_pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_string_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0))};
    MR_scalar_common_9[0] = new list.List_1.F_cons_2(java.lang.Integer.valueOf((95)),
		(list.List_1) utils.MR_scalar_common_5[0]);
  }
  static {
    MR_init_scalars_0();
  }

// Vector common data

// NonDataDefns
  private static boolean __Unify____corefclass_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = utils.__Unify____corefclass_0_0(((java.lang.Integer) wrapper_arg_1).intValue(), ((java.lang.Integer) wrapper_arg_2).intValue());
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____corefclass_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = utils.__Compare____corefclass_0_0(((java.lang.Integer) wrapper_arg_2).intValue(), ((java.lang.Integer) wrapper_arg_3).intValue());
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____corefdata_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = utils.__Unify____corefdata_0_0(((utils.Corefdata_0) wrapper_arg_1), ((utils.Corefdata_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____corefdata_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = utils.__Compare____corefdata_0_0(((utils.Corefdata_0) wrapper_arg_2), ((utils.Corefdata_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____corefmap_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = utils.__Unify____corefmap_0_0(((tree234.Tree234_2) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____corefmap_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = utils.__Compare____corefmap_0_0(((tree234.Tree234_2) wrapper_arg_2), ((tree234.Tree234_2) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____corefs_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = utils.__Unify____corefs_0_0(((utils.Corefs_0) wrapper_arg_1), ((utils.Corefs_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____corefs_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = utils.__Compare____corefs_0_0(((utils.Corefs_0) wrapper_arg_2), ((utils.Corefs_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____csym_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = utils.__Unify____csym_0_0(((pair.Pair_2) wrapper_arg_1), ((pair.Pair_2) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____csym_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = utils.__Compare____csym_0_0(((pair.Pair_2) wrapper_arg_2), ((pair.Pair_2) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____csymmap_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = utils.__Unify____csymmap_0_0(((tree234.Tree234_2) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____csymmap_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = utils.__Compare____csymmap_0_0(((tree234.Tree234_2) wrapper_arg_2), ((tree234.Tree234_2) wrapper_arg_3));
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
              return_value = utils.__Unify____corefclass_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 1:
          {
            java.lang.Object return_value = null;

            {
              return_value = utils.__Compare____corefclass_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 2:
          {
            boolean return_value = false;

            {
              return_value = utils.__Unify____corefdata_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 3:
          {
            java.lang.Object return_value = null;

            {
              return_value = utils.__Compare____corefdata_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 4:
          {
            boolean return_value = false;

            {
              return_value = utils.__Unify____corefmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 5:
          {
            java.lang.Object return_value = null;

            {
              return_value = utils.__Compare____corefmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 6:
          {
            boolean return_value = false;

            {
              return_value = utils.__Unify____corefs_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 7:
          {
            java.lang.Object return_value = null;

            {
              return_value = utils.__Compare____corefs_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 8:
          {
            boolean return_value = false;

            {
              return_value = utils.__Unify____csym_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 9:
          {
            java.lang.Object return_value = null;

            {
              return_value = utils.__Compare____csym_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 10:
          {
            boolean return_value = false;

            {
              return_value = utils.__Unify____csymmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 11:
          {
            java.lang.Object return_value = null;

            {
              return_value = utils.__Compare____csymmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 12:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = utils.IntroducedFrom__pred__collect_corefs__29__1_4_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 13:
          {
            java.lang.Object return_value = null;

            {
              return_value = utils.finfo_9_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 14:
          {
            java.lang.Object return_value = null;

            {
              return_value = utils.create_symbols_2_p_0_2(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 15:
          {
            java.lang.Object return_value = null;

            {
              return_value = utils.gen_key_2_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2));
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
    public final int ptr_num;
    public /* generic_type */ java.lang.Object call___0_0(
      /* generic_type */ java.lang.Object arg1,
      /* generic_type */ java.lang.Object arg2,
      /* generic_type */ java.lang.Object arg3)
    {
      switch (ptr_num) {
        case 0:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = utils.IntroducedFrom__pred__create_symbols__51__1_4_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 1:
          {
            java.lang.Object return_value = null;

            {
              return_value = utils.collect_corefs_5_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 2:
          {
            java.lang.Object return_value = null;

            {
              return_value = utils.create_symbols_2_p_0_3(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 3:
          {
            java.lang.Object return_value = null;

            {
              return_value = utils.owlify_2_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
    }

    public AddrOf3_0(
      int ptr_num)
    {
      this.ptr_num = ptr_num;
    }
  }

  private static final class AddrOf4_0
    implements jmercury.runtime.MethodPtr4
  {
    public final int ptr_num;
    public /* generic_type */ java.lang.Object call___0_0(
      /* generic_type */ java.lang.Object arg1,
      /* generic_type */ java.lang.Object arg2,
      /* generic_type */ java.lang.Object arg3,
      /* generic_type */ java.lang.Object arg4)
    {
      switch (ptr_num) {
        case 0:
          {
            java.lang.Object return_value = null;

            {
              return_value = utils.finfo_9_p_0_2(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4));
            }
            return ((java.lang.Object) (return_value));
          }
        case 1:
          {
            java.lang.Object return_value = null;

            {
              return_value = utils.create_symbols_2_p_0_4(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4));
            }
            return ((java.lang.Object) (return_value));
          }
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
    }

    public AddrOf4_0(
      int ptr_num)
    {
      this.ptr_num = ptr_num;
    }
  }

  private static final class AddrOf6_0
    implements jmercury.runtime.MethodPtr6
  {
    public /* generic_type */ java.lang.Object call___0_0(
      /* generic_type */ java.lang.Object arg1,
      /* generic_type */ java.lang.Object arg2,
      /* generic_type */ java.lang.Object arg3,
      /* generic_type */ java.lang.Object arg4,
      /* generic_type */ java.lang.Object arg5,
      /* generic_type */ java.lang.Object arg6)
    {
      {
        /* generic_type */ java.lang.Object[] return_value = null;

        {
          return_value = utils.create_symbols_2_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4), ((java.lang.Object) arg5), ((java.lang.Object) arg6));
        }
        return ((java.lang.Object) (return_value));
      }
    }

  }

//  utils.m:8
  public static class Corefdata_0
    implements jmercury.runtime.MercuryType
  {
    public list.List_1<java.lang.String> F1;
    public list.List_1<java.lang.String> F2;
    public int F3;

    public Corefdata_0()
    {
      {
      }
    }
    public Corefdata_0(
      list.List_1<java.lang.String> F1,
      list.List_1<java.lang.String> F2,
      int F3)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
      }
    }
  }

//  utils.m:6
  public static class Corefs_0
    implements jmercury.runtime.MercuryType
  {
    public list.List_1<java.lang.Integer> F1;
    public list.List_1<java.lang.Integer> F2;
    public tree234.Tree234_2<java.lang.Integer, utils.Corefdata_0> F3;

    public Corefs_0()
    {
      {
      }
    }
    public Corefs_0(
      list.List_1<java.lang.Integer> F1,
      list.List_1<java.lang.Integer> F2,
      tree234.Tree234_2<java.lang.Integer, utils.Corefdata_0> F3)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
      }
    }
  }

//  utils.m:82
  private static java.lang.String IntroducedFrom__pred__gen_key__82__1_2_p_0(
    java.lang.String HeadVar__1_12)
  {
    {
      boolean succeeded = false;
      java.lang.String HeadVar__2_13 = null;
      int X0_8 = '\u0000';
//  utils.m:80
      java.lang.String V_9_9 = null;

      {
        java.lang.Object [] result = string.first_char_3_p_3(HeadVar__1_12);
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        X0_8 = ((java.lang.Integer) result[1]).intValue();
        V_9_9 = (java.lang.String) result[2];
      }
      if (succeeded)
        {
          succeeded = mr_char.is_alnum_or_underscore_1_p_0(X0_8);
        }
//  utils.m:82
      if (succeeded)
//  utils.m:81
        {
          int V_14_14 = '\u0000';

          {
            V_14_14 = mr_char.to_upper_1_f_0(X0_8);
          }
          {
            HeadVar__2_13 = string.from_char_1_f_0(V_14_14);
          }
        }
//  utils.m:82
      else
        HeadVar__2_13 = "X";
      return HeadVar__2_13;
    }
  }
//  utils.m:68
  private static tree234.Tree234_2 IntroducedFrom__pred__finfo__68__1_5_p_0(
    java.lang.String F_16,
    int HeadVar__2_49,
    utils.Corefdata_0 HeadVar__3_50,
    tree234.Tree234_2 HeadVar__4_51)
  {
    {
      boolean succeeded = false;
      tree234.Tree234_2 HeadVar__5_52 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_67_67 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
      list.List_1 Ws_27 = ((utils.Corefdata_0) HeadVar__3_50).F1;
      list.List_1 NWs_28 = ((utils.Corefdata_0) HeadVar__3_50).F2;
      list.List_1 Ss_30 = null;
      list.List_1 V_53_53 = null;
//  utils.m:69
      int V_29_29 = ((utils.Corefdata_0) HeadVar__3_50).F3;
//  utils.m:73
      list.List_1 Cs_31 = null;
//  utils.m:71
      jmercury.runtime.TypeInfo_Struct TypeInfo_68_68 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_69_69 = null;
      java.lang.Object conv0_Cs_31 = null;

//  utils.m:70
      {
        V_53_53 = list.append_2_f_0(TypeCtorInfo_67_67, Ws_27, NWs_28);
      }
      {
        Ss_30 = list.sort_and_remove_dups_2_p_0(TypeCtorInfo_67_67, V_53_53);
      }
      TypeInfo_68_68 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[0]);
      TypeInfo_69_69 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[4]);
//  utils.m:71
      {
        java.lang.Object [] result = map.search_3_p_0(TypeInfo_68_68, TypeInfo_69_69, HeadVar__4_51, ((java.lang.Object) (Ss_30)));
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        conv0_Cs_31 = (java.lang.Object) result[1];
      }
      if (succeeded)
        {
          Cs_31 = ((list.List_1) conv0_Cs_31);
          succeeded = true;
        }
//  utils.m:73
      if (succeeded)
//  utils.m:72
        {
          jmercury.runtime.TypeInfo_Struct TypeInfo_70_70 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_71_71 = null;
          list.List_1 V_54_54 = null;
          pair.Pair_2 V_55_55 = null;

          {
            V_55_55 = new pair.Pair_2(((java.lang.Object) (F_16)), java.lang.Integer.valueOf(HeadVar__2_49));
          }
          {
            V_54_54 = new list.List_1.F_cons_2(((java.lang.Object) (V_55_55)), Cs_31);
          }
          TypeInfo_70_70 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[0]);
          TypeInfo_71_71 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[4]);
          {
            HeadVar__5_52 = map.det_update_4_p_0(TypeInfo_70_70, TypeInfo_71_71, ((java.lang.Object) (Ss_30)), ((java.lang.Object) (V_54_54)), HeadVar__4_51);
          }
        }
//  utils.m:73
      else
        {
          jmercury.runtime.TypeInfo_Struct TypeInfo_72_72 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_73_73 = null;
          list.List_1 V_56_56 = null;
          pair.Pair_2 V_57_57 = null;
          list.List_1 V_58_58 = null;

          {
            V_57_57 = new pair.Pair_2(((java.lang.Object) (F_16)), java.lang.Integer.valueOf(HeadVar__2_49));
          }
          V_58_58 = (list.List_1) utils.MR_scalar_common_5[0];
          {
            V_56_56 = new list.List_1.F_cons_2(((java.lang.Object) (V_57_57)), V_58_58);
          }
          TypeInfo_72_72 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[0]);
          TypeInfo_73_73 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[4]);
          {
            HeadVar__5_52 = map.det_insert_4_p_0(TypeInfo_72_72, TypeInfo_73_73, ((java.lang.Object) (Ss_30)), ((java.lang.Object) (V_56_56)), HeadVar__4_51);
          }
        }
//  utils.m:68
      return HeadVar__5_52;
    }
  }
//  utils.m:64
  private static pair.Pair_2 IntroducedFrom__func__finfo__64__1_2_f_0(
    java.lang.String F_16,
    int HeadVar__2_39)
  {
    {
      boolean succeeded = false;
      pair.Pair_2 HeadVar__3_40 = null;

      {
        HeadVar__3_40 = new pair.Pair_2(((java.lang.Object) (F_16)), java.lang.Integer.valueOf(HeadVar__2_39));
      }
      return HeadVar__3_40;
    }
  }
//  utils.m:90
  private static list.List_1 IntroducedFrom__pred__owlify__90__1_3_p_0(
    int HeadVar__1_15,
    list.List_1 HeadVar__2_16)
  {
    {
      boolean succeeded = false;
      list.List_1 HeadVar__3_17 = null;

//  utils.m:88
      {
        succeeded = mr_char.is_alnum_or_underscore_1_p_0(HeadVar__1_15);
      }
//  utils.m:90
      if (succeeded)
//  utils.m:89
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_30_30 = null;
          list.List_1 V_18_18 = null;
          list.List_1 V_19_19 = (list.List_1) utils.MR_scalar_common_5[0];

          {
            V_18_18 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(HeadVar__1_15), V_19_19);
          }
          TypeCtorInfo_30_30 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_character_0);
          {
            HeadVar__3_17 = list.append_3_p_1(TypeCtorInfo_30_30, HeadVar__2_16, V_18_18);
          }
        }
//  utils.m:90
      else
//  utils.m:94
        {
//  utils.m:90
          succeeded = (HeadVar__1_15 == (32));
//  utils.m:94
          if (succeeded)
//  utils.m:91
            {
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_31_31 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_character_0);
              list.List_1 V_20_20 = (list.List_1) utils.MR_scalar_common_9[0];
              int V_21_21 = (95);
              list.List_1 V_22_22 = (list.List_1) utils.MR_scalar_common_5[0];

              {
                HeadVar__3_17 = list.append_3_p_1(TypeCtorInfo_31_31, HeadVar__2_16, V_20_20);
              }
            }
//  utils.m:94
          else
            {
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_32_32 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_character_0);
              list.List_1 V_23_23 = (list.List_1) utils.MR_scalar_common_9[0];
              int V_24_24 = (95);
              list.List_1 V_25_25 = (list.List_1) utils.MR_scalar_common_5[0];

              {
                HeadVar__3_17 = list.append_3_p_1(TypeCtorInfo_32_32, HeadVar__2_16, V_23_23);
              }
            }
        }
//  utils.m:90
      return HeadVar__3_17;
    }
  }
//  utils.m:52
  private static java.lang.Object [] IntroducedFrom__pred__create_symbols__51__1_4_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      java.lang.Object wrapper_arg_4 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      pair.Pair_2 conv1_HeadVar__3_61 = null;
      int conv0_HeadVar__5_63 = 0;

      {
        java.lang.Object [] result = utils.IntroducedFrom__pred__create_symbols__52__1_5_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((pair.Pair_2) wrapper_arg_1), ((java.lang.Integer) wrapper_arg_3).intValue());
        conv1_HeadVar__3_61 = (pair.Pair_2) result[0];
        conv0_HeadVar__5_63 = ((java.lang.Integer) result[1]).intValue();
      }
      wrapper_arg_2 = ((java.lang.Object) (conv1_HeadVar__3_61));
      wrapper_arg_4 = java.lang.Integer.valueOf(conv0_HeadVar__5_63);
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_2)),
        ((java.lang.Object) (wrapper_arg_4))
      };
    }
  }
//  utils.m:51
  private static tree234.Tree234_2 IntroducedFrom__pred__create_symbols__51__1_4_p_0(
    java.lang.String HeadVar__1_53,
    list.List_1 HeadVar__2_54,
    tree234.Tree234_2 HeadVar__3_55)
  {
    {
      boolean succeeded = false;
      tree234.Tree234_2 HeadVar__4_56 = null;

      if ((HeadVar__2_54.data_tag == 0))
//  utils.m:56
        HeadVar__4_56 = HeadVar__3_55;
//  utils.m:51
      else
        {
          list.List_1 V_114_114 = ((list.List_1.F_cons_2) HeadVar__2_54).F2;
          pair.Pair_2 V_115_115 = ((pair.Pair_2) ((list.List_1.F_cons_2) HeadVar__2_54).F1);

          if ((V_114_114.data_tag == 0))
//  utils.m:49
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_107_107 = null;
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_108_108 = null;
              java.lang.String Str_25 = null;
              java.lang.String V_67_67 = "1";

              {
                Str_25 = string.f_43_43_2_f_0(HeadVar__1_53, V_67_67);
              }
              TypeInfo_107_107 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[3]);
              TypeCtorInfo_108_108 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
//  utils.m:50
              {
                HeadVar__4_56 = map.det_insert_4_p_0(TypeInfo_107_107, TypeCtorInfo_108_108, ((java.lang.Object) (V_115_115)), ((java.lang.Object) (Str_25)), HeadVar__3_55);
              }
//  utils.m:49
            }
//  utils.m:51
          else
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_109_109 = null;
              jmercury.runtime.TypeInfo_Struct TypeInfo_110_110 = null;
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_111_111 = null;
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_112_112 = null;
              list.List_1 SPs_34 = null;
              /* closure */ java.lang.Object[] V_58_58 = null;
              int V_59_59 = 0;
//  utils.m:52
              int V_35_35 = 0;
              java.lang.Object conv2_V_35_35 = null;

              {
                V_58_58 = new /* closure */ java.lang.Object[] {((java.lang.Object) (utils.MR_scalar_common_8[1])), ((java.lang.Object) (new AddrOf3_0(0))), java.lang.Integer.valueOf(1), ((java.lang.Object) (HeadVar__1_53))};
              }
              V_59_59 = 1;
              TypeInfo_109_109 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[3]);
              TypeInfo_110_110 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[11]);
              TypeCtorInfo_111_111 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
              {
                java.lang.Object [] result = list.map_foldl_5_p_0(TypeInfo_109_109, TypeInfo_110_110, TypeCtorInfo_111_111, V_58_58, HeadVar__2_54, java.lang.Integer.valueOf(V_59_59));
                SPs_34 = (list.List_1) result[0];
                conv2_V_35_35 = (java.lang.Object) result[1];
              }
              V_35_35 = ((java.lang.Integer) conv2_V_35_35).intValue();
              TypeCtorInfo_112_112 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
//  utils.m:55
              {
                HeadVar__4_56 = map.det_insert_from_assoc_list_3_p_0(TypeInfo_109_109, TypeCtorInfo_112_112, SPs_34, HeadVar__3_55);
              }
//  utils.m:51
            }
        }
      return HeadVar__4_56;
    }
  }
//  utils.m:52
  private static java.lang.Object [] IntroducedFrom__pred__create_symbols__52__1_5_p_0(
    java.lang.String HeadVar__1_53,
    pair.Pair_2 HeadVar__2_60,
    int HeadVar__4_62)
  {
    {
      boolean succeeded = false;
      pair.Pair_2 HeadVar__3_61 = null;
      int HeadVar__5_63 = 0;
      java.lang.String W_33 = null;
      java.lang.String V_64_64 = null;
      int V_65_65 = 0;

//  utils.m:53
      {
        V_64_64 = string.int_to_string_1_f_0(HeadVar__4_62);
      }
      {
        W_33 = string.f_43_43_2_f_0(HeadVar__1_53, V_64_64);
      }
//  utils.m:54
      {
        HeadVar__3_61 = new pair.Pair_2(((java.lang.Object) (HeadVar__2_60)), ((java.lang.Object) (W_33)));
      }
      V_65_65 = 1;
      HeadVar__5_63 = (HeadVar__4_62 + V_65_65);
//  utils.m:52
return new java.lang.Object[] {
        ((java.lang.Object) (HeadVar__3_61)),
        java.lang.Integer.valueOf(HeadVar__5_63)
      };
    }
  }
//  utils.m:43
  private static tree234.Tree234_2 IntroducedFrom__pred__create_symbols__43__1_3_p_0(
    pair.Pair_2 HeadVar__1_47,
    tree234.Tree234_2 HeadVar__2_48)
  {
    {
      boolean succeeded = false;
      tree234.Tree234_2 HeadVar__3_49 = null;
      java.lang.String KS_16 = ((java.lang.String) ((pair.Pair_2) HeadVar__1_47).F1);
      list.List_1 Classes_17 = ((list.List_1) ((pair.Pair_2) HeadVar__1_47).F2);
//  utils.m:47
      list.List_1 Classes0_18 = null;
//  utils.m:45
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_98_98 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
      jmercury.runtime.TypeInfo_Struct TypeInfo_99_99 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[4]);
      java.lang.Object conv0_Classes0_18 = null;

      {
        java.lang.Object [] result = map.search_3_p_0(TypeCtorInfo_98_98, TypeInfo_99_99, HeadVar__2_48, ((java.lang.Object) (KS_16)));
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        conv0_Classes0_18 = (java.lang.Object) result[1];
      }
      if (succeeded)
        {
          Classes0_18 = ((list.List_1) conv0_Classes0_18);
          succeeded = true;
        }
//  utils.m:47
      if (succeeded)
//  utils.m:46
        {
          jmercury.runtime.TypeInfo_Struct TypeInfo_100_100 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[3]);
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_101_101 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_102_102 = null;
          list.List_1 V_50_50 = null;

          {
            V_50_50 = list.append_2_f_0(TypeInfo_100_100, Classes0_18, Classes_17);
          }
          TypeCtorInfo_101_101 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
          TypeInfo_102_102 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[4]);
          {
            HeadVar__3_49 = map.det_update_4_p_0(TypeCtorInfo_101_101, TypeInfo_102_102, ((java.lang.Object) (KS_16)), ((java.lang.Object) (V_50_50)), HeadVar__2_48);
          }
        }
//  utils.m:47
      else
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_103_103 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
          jmercury.runtime.TypeInfo_Struct TypeInfo_104_104 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[4]);

          {
            HeadVar__3_49 = map.det_insert_4_p_0(TypeCtorInfo_103_103, TypeInfo_104_104, ((java.lang.Object) (KS_16)), ((java.lang.Object) (Classes_17)), HeadVar__2_48);
          }
        }
//  utils.m:43
      return HeadVar__3_49;
    }
  }
//  utils.m:30
  private static java.lang.Object [] IntroducedFrom__pred__collect_corefs__29__1_4_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      boolean succeeded = false;
      /* generic_type */ java.lang.Object closure = closure_arg;
      java.lang.String conv0_HeadVar__3_3 = null;

      {
        java.lang.Object [] result = wordnet.noun_string_3_p_0(((maybe.Maybe_1) ((java.lang.Object[]) closure)[3]), ((java.lang.String) wrapper_arg_1));
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        conv0_HeadVar__3_3 = (java.lang.String) result[1];
      }
      if (succeeded)
        {
          wrapper_arg_2 = ((java.lang.Object) (conv0_HeadVar__3_3));
          succeeded = true;
        }
return new java.lang.Object[] {
        java.lang.Boolean.valueOf(succeeded),
        ((java.lang.Object) (wrapper_arg_2))
      };
    }
  }
//  utils.m:29
  private static tree234.Tree234_2 IntroducedFrom__pred__collect_corefs__29__1_4_p_0(
    maybe.Maybe_1 MWN_9,
    pair.Pair_2 HeadVar__2_23,
    tree234.Tree234_2 HeadVar__3_24)
  {
    {
      boolean succeeded = false;
      tree234.Tree234_2 HeadVar__4_25 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_35_35 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_37_37 = null;
      int C_15 = ((java.lang.Integer) (((pair.Pair_2) HeadVar__2_23).F1)).intValue();
      list.List_1 Ss_16 = ((list.List_1) ((pair.Pair_2) HeadVar__2_23).F2);
      list.List_1 Ws_17 = null;
      list.List_1 NWs_18 = null;
      utils.Corefdata_0 D_19 = null;
      /* closure */ java.lang.Object[] V_26_26 = null;
      int V_27_27 = 0;

//  utils.m:30
      {
        V_26_26 = new /* closure */ java.lang.Object[] {((java.lang.Object) (utils.MR_scalar_common_7[3])), ((java.lang.Object) (new AddrOf2_0(12))), java.lang.Integer.valueOf(1), ((java.lang.Object) (MWN_9))};
      }
      TypeCtorInfo_35_35 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
      {
        java.lang.Object [] result = list.filter_map_4_p_0(TypeCtorInfo_35_35, TypeCtorInfo_35_35, V_26_26, Ss_16);
        Ws_17 = (list.List_1) result[0];
        NWs_18 = (list.List_1) result[1];
      }
//  utils.m:31
      V_27_27 = -1;
      {
        D_19 = new utils.Corefdata_0(Ws_17, NWs_18, V_27_27);
      }
      TypeCtorInfo_37_37 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.utils__type_ctor_info_corefdata_0);
//  utils.m:32
      {
        HeadVar__4_25 = map.f_84_121_112_101_83_112_101_99_79_102_95_95_112_114_101_100_95_95_100_101_116_95_105_110_115_101_114_116_95_95_91_75_32_61_32_105_110_116_93_95_48_95_49_4_p_0(TypeCtorInfo_37_37, C_15, ((java.lang.Object) (D_19)), HeadVar__3_24);
      }
//  utils.m:29
      return HeadVar__4_25;
    }
  }
//  utils.m:11
  public static builtin.Comparison_result_0 __Compare____csymmap_0_0(
    tree234.Tree234_2 HeadVar__2_2,
    tree234.Tree234_2 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[12]);
      tree234.Tree234_2 Cast_HeadVar1_4 = HeadVar__2_2;
      tree234.Tree234_2 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____csymmap_0_0(
    tree234.Tree234_2 HeadVar__1_1,
    tree234.Tree234_2 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[12]);
      tree234.Tree234_2 Cast_HeadVar1_3 = HeadVar__1_1;
      tree234.Tree234_2 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  utils.m:12
  public static builtin.Comparison_result_0 __Compare____csym_0_0(
    pair.Pair_2 HeadVar__2_2,
    pair.Pair_2 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[3]);
      pair.Pair_2 Cast_HeadVar1_4 = HeadVar__2_2;
      pair.Pair_2 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____csym_0_0(
    pair.Pair_2 HeadVar__1_1,
    pair.Pair_2 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[3]);
      pair.Pair_2 Cast_HeadVar1_3 = HeadVar__1_1;
      pair.Pair_2 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  utils.m:6
  public static builtin.Comparison_result_0 __Compare____corefs_0_0(
    utils.Corefs_0 HeadVar__2_2,
    utils.Corefs_0 HeadVar__3_3)
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
          list.List_1 V_4_4 = ((utils.Corefs_0) HeadVar__2_2).F1;
          list.List_1 V_5_5 = ((utils.Corefs_0) HeadVar__2_2).F2;
          tree234.Tree234_2 V_6_6 = ((utils.Corefs_0) HeadVar__2_2).F3;
          list.List_1 V_7_7 = ((utils.Corefs_0) HeadVar__3_3).F1;
          list.List_1 V_8_8 = ((utils.Corefs_0) HeadVar__3_3).F2;
          tree234.Tree234_2 V_9_9 = ((utils.Corefs_0) HeadVar__3_3).F3;
          builtin.Comparison_result_0 V_10_10 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_14_14 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[14]);

          {
            V_10_10 = builtin.compare_3_p_0(TypeInfo_14_14, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_7_7)));
          }
          succeeded = (V_10_10.MR_value == builtin.Comparison_result_0.K0.MR_value);
          succeeded = !(succeeded);
          if (succeeded)
            HeadVar__1_1 = V_10_10;
          else
            {
              builtin.Comparison_result_0 V_11_11 = null;
              jmercury.runtime.TypeInfo_Struct TypeInfo_15_15 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[14]);

              {
                V_11_11 = builtin.compare_3_p_0(TypeInfo_15_15, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_8_8)));
              }
              succeeded = (V_11_11.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_11_11;
              else
                {
                  jmercury.runtime.TypeInfo_Struct TypeInfo_16_16 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[2]);

                  {
                    HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_16_16, ((java.lang.Object) (V_6_6)), ((java.lang.Object) (V_9_9)));
                  }
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____corefs_0_0(
    utils.Corefs_0 HeadVar__1_1,
    utils.Corefs_0 HeadVar__2_2)
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
          jmercury.runtime.TypeInfo_Struct TypeInfo_11_11 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[14]);
          jmercury.runtime.TypeInfo_Struct TypeInfo_12_12 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_13_13 = null;
          list.List_1 V_3_3 = ((utils.Corefs_0) HeadVar__1_1).F1;
          list.List_1 V_4_4 = ((utils.Corefs_0) HeadVar__1_1).F2;
          tree234.Tree234_2 V_5_5 = ((utils.Corefs_0) HeadVar__1_1).F3;
          list.List_1 V_6_6 = ((utils.Corefs_0) HeadVar__2_2).F1;
          list.List_1 V_7_7 = ((utils.Corefs_0) HeadVar__2_2).F2;
          tree234.Tree234_2 V_8_8 = ((utils.Corefs_0) HeadVar__2_2).F3;

          {
            succeeded = builtin.unify_2_p_0(TypeInfo_11_11, ((java.lang.Object) (V_3_3)), ((java.lang.Object) (V_6_6)));
          }
          if (succeeded)
            {
              TypeInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[14]);
              {
                succeeded = builtin.unify_2_p_0(TypeInfo_12_12, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_7_7)));
              }
              if (succeeded)
                {
                  TypeInfo_13_13 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[2]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_13_13, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_8_8)));
                  }
                }
            }
        }
      return succeeded;
    }
  }
//  utils.m:7
  public static builtin.Comparison_result_0 __Compare____corefmap_0_0(
    tree234.Tree234_2 HeadVar__2_2,
    tree234.Tree234_2 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[2]);
      tree234.Tree234_2 Cast_HeadVar1_4 = HeadVar__2_2;
      tree234.Tree234_2 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____corefmap_0_0(
    tree234.Tree234_2 HeadVar__1_1,
    tree234.Tree234_2 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[2]);
      tree234.Tree234_2 Cast_HeadVar1_3 = HeadVar__1_1;
      tree234.Tree234_2 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  utils.m:8
  public static builtin.Comparison_result_0 __Compare____corefdata_0_0(
    utils.Corefdata_0 HeadVar__2_2,
    utils.Corefdata_0 HeadVar__3_3)
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
          list.List_1 V_4_4 = ((utils.Corefdata_0) HeadVar__2_2).F1;
          list.List_1 V_5_5 = ((utils.Corefdata_0) HeadVar__2_2).F2;
          int V_6_6 = ((utils.Corefdata_0) HeadVar__2_2).F3;
          list.List_1 V_7_7 = ((utils.Corefdata_0) HeadVar__3_3).F1;
          list.List_1 V_8_8 = ((utils.Corefdata_0) HeadVar__3_3).F2;
          int V_9_9 = ((utils.Corefdata_0) HeadVar__3_3).F3;
          builtin.Comparison_result_0 V_10_10 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_14_14 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[0]);

          {
            V_10_10 = builtin.compare_3_p_0(TypeInfo_14_14, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_7_7)));
          }
          succeeded = (V_10_10.MR_value == builtin.Comparison_result_0.K0.MR_value);
          succeeded = !(succeeded);
          if (succeeded)
            HeadVar__1_1 = V_10_10;
          else
            {
              builtin.Comparison_result_0 V_11_11 = null;
              jmercury.runtime.TypeInfo_Struct TypeInfo_15_15 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[0]);

              {
                V_11_11 = builtin.compare_3_p_0(TypeInfo_15_15, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_8_8)));
              }
              succeeded = (V_11_11.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_11_11;
              else
                {
                  HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_6_6, V_9_9);
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____corefdata_0_0(
    utils.Corefdata_0 HeadVar__1_1,
    utils.Corefdata_0 HeadVar__2_2)
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
          jmercury.runtime.TypeInfo_Struct TypeInfo_11_11 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[0]);
          jmercury.runtime.TypeInfo_Struct TypeInfo_12_12 = null;
          list.List_1 V_3_3 = ((utils.Corefdata_0) HeadVar__1_1).F1;
          list.List_1 V_4_4 = ((utils.Corefdata_0) HeadVar__1_1).F2;
          int V_5_5 = ((utils.Corefdata_0) HeadVar__1_1).F3;
          list.List_1 V_6_6 = ((utils.Corefdata_0) HeadVar__2_2).F1;
          list.List_1 V_7_7 = ((utils.Corefdata_0) HeadVar__2_2).F2;
          int V_8_8 = ((utils.Corefdata_0) HeadVar__2_2).F3;

          {
            succeeded = builtin.unify_2_p_0(TypeInfo_11_11, ((java.lang.Object) (V_3_3)), ((java.lang.Object) (V_6_6)));
          }
          if (succeeded)
            {
              TypeInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[0]);
              {
                succeeded = builtin.unify_2_p_0(TypeInfo_12_12, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_7_7)));
              }
              if (succeeded)
                succeeded = (V_5_5 == V_8_8);
            }
        }
      return succeeded;
    }
  }
//  utils.m:10
  public static builtin.Comparison_result_0 __Compare____corefclass_0_0(
    int HeadVar__2_2,
    int HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      int Cast_HeadVar1_4 = HeadVar__2_2;
      int Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(Cast_HeadVar1_4, Cast_HeadVar2_5);
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____corefclass_0_0(
    int HeadVar__1_1,
    int HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      int Cast_HeadVar1_3 = HeadVar__1_1;
      int Cast_HeadVar2_4 = HeadVar__2_2;

      succeeded = (Cast_HeadVar1_3 == Cast_HeadVar2_4);
      return succeeded;
    }
  }
//  utils.m:79
  private static java.lang.Object gen_key_2_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      java.lang.String conv0_HeadVar__2_13 = null;

      {
        conv0_HeadVar__2_13 = utils.IntroducedFrom__pred__gen_key__82__1_2_p_0(((java.lang.String) wrapper_arg_1));
      }
      wrapper_arg_2 = ((java.lang.Object) (conv0_HeadVar__2_13));
      return wrapper_arg_2;
    }
  }
//  utils.m:76
  private static pair.Pair_2 gen_key_2_p_0(
    pair.Pair_2 HeadVar__1_1)
  {
//  utils.m:78
    {
      boolean succeeded = false;
      pair.Pair_2 HeadVar__2_2 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_18_18 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
      list.List_1 Strs_3 = ((list.List_1) ((pair.Pair_2) HeadVar__1_1).F1);
      list.List_1 Cls_4 = ((list.List_1) ((pair.Pair_2) HeadVar__1_1).F2);
      java.lang.String Key_5 = null;
      list.List_1 Xs_10 = null;
      /* closure */ java.lang.Object[] V_11_11 = (/* closure */ java.lang.Object[]) utils.MR_scalar_common_4[5];

//  utils.m:79
      {
        Xs_10 = list.map_3_p_0(TypeCtorInfo_18_18, TypeCtorInfo_18_18, V_11_11, Strs_3);
      }
//  utils.m:83
      succeeded = (Xs_10.data_tag == 0);
      if (succeeded)
        Key_5 = "Pr";
      else
        {
          java.lang.String V_15_15 = "";

          {
            Key_5 = string.join_list_2_f_0(V_15_15, Xs_10);
          }
        }
//  utils.m:78
      {
        HeadVar__2_2 = new pair.Pair_2(((java.lang.Object) (Key_5)), ((java.lang.Object) (Cls_4)));
      }
      return HeadVar__2_2;
    }
//  utils.m:76
  }
//  utils.m:68
  private static java.lang.Object finfo_9_p_0_2(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_4 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      tree234.Tree234_2 conv1_HeadVar__5_52 = null;

      {
        conv1_HeadVar__5_52 = utils.IntroducedFrom__pred__finfo__68__1_5_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((java.lang.Integer) wrapper_arg_1).intValue(), ((utils.Corefdata_0) wrapper_arg_2), ((tree234.Tree234_2) wrapper_arg_3));
      }
      wrapper_arg_4 = ((java.lang.Object) (conv1_HeadVar__5_52));
      return wrapper_arg_4;
    }
  }
//  utils.m:64
  private static java.lang.Object finfo_9_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      pair.Pair_2 conv0_HeadVar__3_40 = null;

      {
        conv0_HeadVar__3_40 = utils.IntroducedFrom__func__finfo__64__1_2_f_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((java.lang.Integer) wrapper_arg_1).intValue());
      }
      wrapper_arg_2 = ((java.lang.Object) (conv0_HeadVar__3_40));
      return wrapper_arg_2;
    }
  }
//  utils.m:61
  private static java.lang.Object [] finfo_9_p_0(
    pair.Pair_2 P_10,
    tree234.Tree234_2 SM0_11,
    set_ordlist.Set_ordlist_1 STATE_VARIABLE_All_0_32,
    set_ordlist.Set_ordlist_1 STATE_VARIABLE_Keys_0_34,
    set_ordlist.Set_ordlist_1 STATE_VARIABLE_Sings_0_36)
  {
//  utils.m:63
    {
      boolean succeeded = false;
      tree234.Tree234_2 SM_12 = null;
      set_ordlist.Set_ordlist_1 STATE_VARIABLE_All_33 = null;
      set_ordlist.Set_ordlist_1 STATE_VARIABLE_Keys_35 = null;
      set_ordlist.Set_ordlist_1 STATE_VARIABLE_Sings_37 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_64_64 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_65_65 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_66_66 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_74_74 = null;
      java.lang.String F_16 = ((java.lang.String) ((pair.Pair_2) P_10).F1);
      list.List_1 A_17 = null;
      list.List_1 S_18 = null;
      tree234.Tree234_2 CM_19 = null;
      /* closure */ java.lang.Object[] Fun_20 = null;
      utils.Corefs_0 V_38_38 = ((utils.Corefs_0) ((pair.Pair_2) P_10).F2);
      list.List_1 V_41_41 = null;
      list.List_1 V_43_43 = null;
      list.List_1 V_45_45 = null;
      list.List_1 V_47_47 = null;
      /* closure */ java.lang.Object[] V_48_48 = null;
//  utils.m:68
      java.lang.Object conv2_SM_12 = null;

//  utils.m:64
      A_17 = ((utils.Corefs_0) V_38_38).F1;
      S_18 = ((utils.Corefs_0) V_38_38).F2;
      CM_19 = ((utils.Corefs_0) V_38_38).F3;
      {
        Fun_20 = new /* closure */ java.lang.Object[] {((java.lang.Object) (utils.MR_scalar_common_7[2])), ((java.lang.Object) (new AddrOf2_0(13))), java.lang.Integer.valueOf(1), ((java.lang.Object) (F_16))};
      }
      TypeCtorInfo_64_64 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
      TypeInfo_65_65 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[3]);
//  utils.m:65
      {
        V_41_41 = list.map_2_f_0(TypeCtorInfo_64_64, TypeInfo_65_65, Fun_20, A_17);
      }
      {
        STATE_VARIABLE_All_33 = set.insert_list_3_p_0(TypeInfo_65_65, V_41_41, STATE_VARIABLE_All_0_32);
      }
//  utils.m:66
      {
        V_43_43 = list.map_2_f_0(TypeCtorInfo_64_64, TypeInfo_65_65, Fun_20, S_18);
      }
      {
        STATE_VARIABLE_Sings_37 = set.insert_list_3_p_0(TypeInfo_65_65, V_43_43, STATE_VARIABLE_Sings_0_36);
      }
      TypeCtorInfo_66_66 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.utils__type_ctor_info_corefdata_0);
//  utils.m:67
      {
        V_47_47 = map.keys_1_f_0(TypeCtorInfo_64_64, TypeCtorInfo_66_66, CM_19);
      }
      {
        V_45_45 = list.map_2_f_0(TypeCtorInfo_64_64, TypeInfo_65_65, Fun_20, V_47_47);
      }
      {
        STATE_VARIABLE_Keys_35 = set.insert_list_3_p_0(TypeInfo_65_65, V_45_45, STATE_VARIABLE_Keys_0_34);
      }
//  utils.m:68
      {
        V_48_48 = new /* closure */ java.lang.Object[] {((java.lang.Object) (utils.MR_scalar_common_8[0])), ((java.lang.Object) (new AddrOf4_0(0))), java.lang.Integer.valueOf(1), ((java.lang.Object) (F_16))};
      }
      TypeInfo_74_74 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[6]);
      {
        conv2_SM_12 = map.foldl_4_p_0(TypeCtorInfo_64_64, TypeCtorInfo_66_66, TypeInfo_74_74, V_48_48, CM_19, ((java.lang.Object) (SM0_11)));
      }
      SM_12 = ((tree234.Tree234_2) conv2_SM_12);
//  utils.m:63
return new java.lang.Object[] {
        ((java.lang.Object) (SM_12)),
        ((java.lang.Object) (STATE_VARIABLE_All_33)),
        ((java.lang.Object) (STATE_VARIABLE_Keys_35)),
        ((java.lang.Object) (STATE_VARIABLE_Sings_37))
      };
    }
//  utils.m:61
  }
//  utils.m:87
  private static java.lang.Object owlify_2_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      list.List_1 conv0_HeadVar__3_17 = null;

      {
        conv0_HeadVar__3_17 = utils.IntroducedFrom__pred__owlify__90__1_3_p_0(((java.lang.Integer) wrapper_arg_1).intValue(), ((list.List_1) wrapper_arg_2));
      }
      wrapper_arg_3 = ((java.lang.Object) (conv0_HeadVar__3_17));
      return wrapper_arg_3;
    }
  }
//  utils.m:20
  public static java.lang.String owlify_2_p_0(
    java.lang.String S0_3)
  {
//  utils.m:85
    {
      boolean succeeded = false;
      java.lang.String S_4 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_33_33 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_34_34 = null;
      list.List_1 Cs0_5 = null;
      list.List_1 Cs_9 = null;
      java.lang.String Str_10 = null;
      /* closure */ java.lang.Object[] V_13_13 = null;
      list.List_1 V_14_14 = null;
//  utils.m:87
      java.lang.Object conv1_Cs_9 = null;
//  utils.m:96
      int Y_11 = '\u0000';
      list.List_1 V_12_12 = null;

//  utils.m:86
      {
        Cs0_5 = string.to_char_list_2_p_0(S0_3);
      }
//  utils.m:87
      V_13_13 = (/* closure */ java.lang.Object[]) utils.MR_scalar_common_4[4];
      V_14_14 = (list.List_1) utils.MR_scalar_common_5[0];
      TypeCtorInfo_33_33 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_character_0);
      TypeInfo_34_34 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[13]);
      {
        conv1_Cs_9 = list.foldl_4_p_0(TypeCtorInfo_33_33, TypeInfo_34_34, V_13_13, Cs0_5, ((java.lang.Object) (V_14_14)));
      }
      Cs_9 = ((list.List_1) conv1_Cs_9);
//  utils.m:95
      {
        Str_10 = string.from_char_list_2_p_0(Cs_9);
      }
//  utils.m:96
      succeeded = (Cs_9.data_tag == 1);
      if (succeeded)
        {
          Y_11 = ((java.lang.Integer) (((list.List_1.F_cons_2) Cs_9).F1)).intValue();
          V_12_12 = ((list.List_1.F_cons_2) Cs_9).F2;
          {
            succeeded = mr_char.is_digit_1_p_0(Y_11);
          }
        }
//  utils.m:98
      if (succeeded)
//  utils.m:97
        {
          java.lang.String V_26_26 = "_";

          {
            S_4 = string.f_43_43_2_f_0(V_26_26, Str_10);
          }
        }
//  utils.m:98
      else
        S_4 = Str_10;
//  utils.m:85
      return S_4;
    }
//  utils.m:20
  }
//  utils.m:48
  private static java.lang.Object create_symbols_2_p_0_4(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_4 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      tree234.Tree234_2 conv11_HeadVar__4_56 = null;

      {
        conv11_HeadVar__4_56 = utils.IntroducedFrom__pred__create_symbols__51__1_4_p_0(((java.lang.String) wrapper_arg_1), ((list.List_1) wrapper_arg_2), ((tree234.Tree234_2) wrapper_arg_3));
      }
      wrapper_arg_4 = ((java.lang.Object) (conv11_HeadVar__4_56));
      return wrapper_arg_4;
    }
  }
//  utils.m:43
  private static java.lang.Object create_symbols_2_p_0_3(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      tree234.Tree234_2 conv9_HeadVar__3_49 = null;

      {
        conv9_HeadVar__3_49 = utils.IntroducedFrom__pred__create_symbols__43__1_3_p_0(((pair.Pair_2) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2));
      }
      wrapper_arg_3 = ((java.lang.Object) (conv9_HeadVar__3_49));
      return wrapper_arg_3;
    }
  }
//  utils.m:42
  private static java.lang.Object create_symbols_2_p_0_2(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      pair.Pair_2 conv8_HeadVar__2_2 = null;

      {
        conv8_HeadVar__2_2 = utils.gen_key_2_p_0(((pair.Pair_2) wrapper_arg_1));
      }
      wrapper_arg_2 = ((java.lang.Object) (conv8_HeadVar__2_2));
      return wrapper_arg_2;
    }
  }
//  utils.m:36
  private static java.lang.Object [] create_symbols_2_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_4,
    java.lang.Object wrapper_arg_6,
    java.lang.Object wrapper_arg_8)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      java.lang.Object wrapper_arg_5 = null;
      java.lang.Object wrapper_arg_7 = null;
      java.lang.Object wrapper_arg_9 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      tree234.Tree234_2 conv3_SM_12 = null;
      set_ordlist.Set_ordlist_1 conv2_STATE_VARIABLE_All_33 = null;
      set_ordlist.Set_ordlist_1 conv1_STATE_VARIABLE_Keys_35 = null;
      set_ordlist.Set_ordlist_1 conv0_STATE_VARIABLE_Sings_37 = null;

      {
        java.lang.Object [] result = utils.finfo_9_p_0(((pair.Pair_2) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2), ((set_ordlist.Set_ordlist_1) wrapper_arg_4), ((set_ordlist.Set_ordlist_1) wrapper_arg_6), ((set_ordlist.Set_ordlist_1) wrapper_arg_8));
        conv3_SM_12 = (tree234.Tree234_2) result[0];
        conv2_STATE_VARIABLE_All_33 = (set_ordlist.Set_ordlist_1) result[1];
        conv1_STATE_VARIABLE_Keys_35 = (set_ordlist.Set_ordlist_1) result[2];
        conv0_STATE_VARIABLE_Sings_37 = (set_ordlist.Set_ordlist_1) result[3];
      }
      wrapper_arg_3 = ((java.lang.Object) (conv3_SM_12));
      wrapper_arg_5 = ((java.lang.Object) (conv2_STATE_VARIABLE_All_33));
      wrapper_arg_7 = ((java.lang.Object) (conv1_STATE_VARIABLE_Keys_35));
      wrapper_arg_9 = ((java.lang.Object) (conv0_STATE_VARIABLE_Sings_37));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_3)),
        ((java.lang.Object) (wrapper_arg_5)),
        ((java.lang.Object) (wrapper_arg_7)),
        ((java.lang.Object) (wrapper_arg_9))
      };
    }
  }
//  utils.m:18
  public static tree234.Tree234_2 create_symbols_2_p_0(
    list.List_1 Ps_3)
  {
//  utils.m:35
    {
      boolean succeeded = false;
      tree234.Tree234_2 Map_4 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_88_88 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[0]);
      jmercury.runtime.TypeInfo_Struct TypeInfo_89_89 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[4]);
      jmercury.runtime.TypeInfo_Struct TypeInfo_90_90 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_91_91 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_92_92 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_93_93 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_96_96 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_97_97 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_105_105 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_106_106 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_113_113 = null;
      tree234.Tree234_2 Smap0_5 = null;
      set_ordlist.Set_ordlist_1 All_6 = null;
      set_ordlist.Set_ordlist_1 Keys_7 = null;
      set_ordlist.Set_ordlist_1 Sings_8 = null;
      set_ordlist.Set_ordlist_1 Prons_9 = null;
      tree234.Tree234_2 Smap_10 = null;
      list.List_1 Pairs0_11 = null;
      list.List_1 Pairs_12 = null;
      tree234.Tree234_2 Kmap_19 = null;
      /* closure */ java.lang.Object[] V_36_36 = (/* closure */ java.lang.Object[]) utils.MR_scalar_common_4[0];
      tree234.Tree234_2 V_37_37 = null;
      set_ordlist.Set_ordlist_1 V_38_38 = null;
      set_ordlist.Set_ordlist_1 V_39_39 = null;
      set_ordlist.Set_ordlist_1 V_40_40 = null;
      set_ordlist.Set_ordlist_1 V_41_41 = null;
      /* closure */ java.lang.Object[] V_44_44 = null;
      /* closure */ java.lang.Object[] V_45_45 = null;
      tree234.Tree234_2 V_46_46 = null;
      /* closure */ java.lang.Object[] V_51_51 = null;
      tree234.Tree234_2 V_52_52 = null;
//  utils.m:36
      java.lang.Object conv7_Smap0_5 = null;
      java.lang.Object conv6_All_6 = null;
      java.lang.Object conv5_Keys_7 = null;
      java.lang.Object conv4_Sings_8 = null;
//  utils.m:43
      java.lang.Object conv10_Kmap_19 = null;
//  utils.m:48
      java.lang.Object conv12_Map_4 = null;

//  utils.m:36
      {
        V_37_37 = map.init_0_f_0(TypeInfo_88_88, TypeInfo_89_89);
      }
      TypeInfo_90_90 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[3]);
      {
        V_38_38 = set.init_0_f_0(TypeInfo_90_90);
      }
      {
        V_39_39 = set.init_0_f_0(TypeInfo_90_90);
      }
      {
        V_40_40 = set.init_0_f_0(TypeInfo_90_90);
      }
      TypeInfo_91_91 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[5]);
      TypeInfo_92_92 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[6]);
      TypeInfo_93_93 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[7]);
      {
        java.lang.Object [] result = list.foldl4_10_p_0(TypeInfo_91_91, TypeInfo_92_92, TypeInfo_93_93, TypeInfo_93_93, TypeInfo_93_93, V_36_36, Ps_3, ((java.lang.Object) (V_37_37)), ((java.lang.Object) (V_38_38)), ((java.lang.Object) (V_39_39)), ((java.lang.Object) (V_40_40)));
        conv7_Smap0_5 = (java.lang.Object) result[0];
        conv6_All_6 = (java.lang.Object) result[1];
        conv5_Keys_7 = (java.lang.Object) result[2];
        conv4_Sings_8 = (java.lang.Object) result[3];
      }
      Smap0_5 = ((tree234.Tree234_2) conv7_Smap0_5);
      All_6 = ((set_ordlist.Set_ordlist_1) conv6_All_6);
      Keys_7 = ((set_ordlist.Set_ordlist_1) conv5_Keys_7);
      Sings_8 = ((set_ordlist.Set_ordlist_1) conv4_Sings_8);
//  utils.m:37
      {
        V_41_41 = set.union_2_f_0(TypeInfo_90_90, Keys_7, Sings_8);
      }
      {
        Prons_9 = set.difference_3_p_0(TypeInfo_90_90, All_6, V_41_41);
      }
//  utils.m:38
      {
        succeeded = set.empty_1_p_0(TypeInfo_90_90, Prons_9);
      }
//  utils.m:40
      if (succeeded)
//  utils.m:39
        Smap_10 = Smap0_5;
//  utils.m:40
      else
        {
          list.List_1 V_42_42 = (list.List_1) utils.MR_scalar_common_5[0];
          list.List_1 V_43_43 = null;

          {
            V_43_43 = set.to_sorted_list_1_f_0(TypeInfo_90_90, Prons_9);
          }
          {
            Smap_10 = map.det_insert_4_p_0(TypeInfo_88_88, TypeInfo_89_89, ((java.lang.Object) (V_42_42)), ((java.lang.Object) (V_43_43)), Smap0_5);
          }
        }
//  utils.m:41
      {
        Pairs0_11 = map.to_assoc_list_2_p_0(TypeInfo_88_88, TypeInfo_89_89, Smap_10);
      }
//  utils.m:42
      V_44_44 = (/* closure */ java.lang.Object[]) utils.MR_scalar_common_4[1];
      TypeInfo_96_96 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[8]);
      TypeInfo_97_97 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[9]);
      {
        Pairs_12 = list.map_3_p_0(TypeInfo_96_96, TypeInfo_97_97, V_44_44, Pairs0_11);
      }
//  utils.m:43
      V_45_45 = (/* closure */ java.lang.Object[]) utils.MR_scalar_common_4[2];
      TypeCtorInfo_105_105 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
      {
        V_46_46 = map.init_0_f_0(TypeCtorInfo_105_105, TypeInfo_89_89);
      }
      TypeInfo_106_106 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[10]);
      {
        conv10_Kmap_19 = list.foldl_4_p_0(TypeInfo_97_97, TypeInfo_106_106, V_45_45, Pairs_12, ((java.lang.Object) (V_46_46)));
      }
      Kmap_19 = ((tree234.Tree234_2) conv10_Kmap_19);
//  utils.m:48
      V_51_51 = (/* closure */ java.lang.Object[]) utils.MR_scalar_common_4[3];
      {
        V_52_52 = map.init_0_f_0(TypeInfo_90_90, TypeCtorInfo_105_105);
      }
      TypeInfo_113_113 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[12]);
      {
        conv12_Map_4 = map.foldl_4_p_0(TypeCtorInfo_105_105, TypeInfo_89_89, TypeInfo_113_113, V_51_51, Kmap_19, ((java.lang.Object) (V_52_52)));
      }
      Map_4 = ((tree234.Tree234_2) conv12_Map_4);
//  utils.m:35
      return Map_4;
    }
//  utils.m:18
  }
//  utils.m:29
  private static java.lang.Object collect_corefs_5_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      tree234.Tree234_2 conv0_HeadVar__4_25 = null;

      {
        conv0_HeadVar__4_25 = utils.IntroducedFrom__pred__collect_corefs__29__1_4_p_0(((maybe.Maybe_1) ((java.lang.Object[]) closure)[3]), ((pair.Pair_2) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2));
      }
      wrapper_arg_3 = ((java.lang.Object) (conv0_HeadVar__4_25));
      return wrapper_arg_3;
    }
  }
//  utils.m:16
  public static utils.Corefs_0 collect_corefs_5_p_0(
    list.List_1 Cs_6,
    tree234.Tree234_2 Mmap_7,
    list.List_1 Gs_8,
    maybe.Maybe_1 MWN_9)
  {
//  utils.m:27
    {
      boolean succeeded = false;
      utils.Corefs_0 Corefs_10 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_31_31 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_32_32 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_38_38 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_39_39 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_40_40 = null;
      list.List_1 Ps_11 = null;
      tree234.Tree234_2 Map_20 = null;
      /* closure */ java.lang.Object[] V_21_21 = null;
      tree234.Tree234_2 V_22_22 = null;
//  utils.m:29
      java.lang.Object conv1_Map_20 = null;

//  utils.m:28
      {
        Ps_11 = multi_map.to_assoc_list_2_p_0(TypeCtorInfo_31_31, TypeCtorInfo_32_32, Mmap_7);
      }
//  utils.m:29
      {
        V_21_21 = new /* closure */ java.lang.Object[] {((java.lang.Object) (utils.MR_scalar_common_2[0])), ((java.lang.Object) (new AddrOf3_0(1))), java.lang.Integer.valueOf(1), ((java.lang.Object) (MWN_9))};
      }
      TypeCtorInfo_38_38 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.utils__type_ctor_info_corefdata_0);
      {
        V_22_22 = map.init_0_f_0(TypeCtorInfo_31_31, TypeCtorInfo_38_38);
      }
      TypeInfo_39_39 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[1]);
      TypeInfo_40_40 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.MR_scalar_common_1[2]);
      {
        conv1_Map_20 = list.foldl_4_p_0(TypeInfo_39_39, TypeInfo_40_40, V_21_21, Ps_11, ((java.lang.Object) (V_22_22)));
      }
      Map_20 = ((tree234.Tree234_2) conv1_Map_20);
//  utils.m:33
      {
        Corefs_10 = new utils.Corefs_0(Cs_6, Gs_8, Map_20);
      }
//  utils.m:27
      return Corefs_10;
    }
//  utils.m:16
  }

// ExportDefns

// ExportedEnums

// InitPreds

// FinalPreds

// EnvVarNames
  static {
    if (System.getenv("MERCURY_DEBUG_CLASS_INIT") != null) {
      System.out.println("[utils end init]");
    }
  }
}
// :- end_module utils.
