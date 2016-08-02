//
//
// Automatically generated from sberrs.m by the Mercury Compiler,
// version 14.01.1, configured for x86_64-unknown-linux-gnu
//
//

/* :- module sberrs. */

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
// import ops;
// import pair;
// import pretty_printer;
// import private_builtin;
// import rtti_implementation;
// import set;
// import set_ordlist;
// import stream;
// import string;
// import term;
// import time;
// import tree234;
// import type_desc;
// import univ;
// import xml;
public class sberrs {
  static {
    if (System.getenv("MERCURY_DEBUG_CLASS_INIT") != null) {
      System.out.println("[sberrs start init]");
    }
  }

// RttiDefns
  private static final jmercury.runtime.TypeInfo_Struct pair__pti_pair_2__plain_builtin__type_ctor_info_int_0__plain_xml__type_ctor_info_tree_obj_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_0 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_1 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1builtin__type_ctor_info_string_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_2 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_2 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.TypeInfo_Struct pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_string_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_string_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_tree_obj_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_tree_obj_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_3 = new jmercury.runtime.PseudoTypeInfo[4];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_3 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_4 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_4 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_5 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_5 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_6 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_6 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_7 = new jmercury.runtime.PseudoTypeInfo[4];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_7 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_8 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_8 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_9 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_9 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_10 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_10 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_11 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_11 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_12 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_12 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_13 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_14 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_15 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_15 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_16 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_16 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_17 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_17 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_18 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_18 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_19 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_19 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_20 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_20 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_21 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_21 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_22 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_23 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_23 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_24 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_24 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_25 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_25 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_26 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_26 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_27 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_27 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_28 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_28 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_29 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_29 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_30 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_30 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_31 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_31 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_32 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_32 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_33 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_33 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_34 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_34 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_35 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_35 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_36 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_36 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_37 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_37 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_38 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_38 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_39 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_39 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.TypeInfo_Struct pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_40 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_40 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_41 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_41 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_42 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_43 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_44 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_44 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_45 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_46 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_47 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_47 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_48 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_48 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_49 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_49 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_50 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_50 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_51 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_51 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] sberrs__field_types_error_0_52 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc sberrs__du_functor_desc_error_0_52 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] sberrs__du_stag_ordered_error_0_0 = new jmercury.runtime.DuFunctorDesc[53];
  private static final jmercury.runtime.DuPtagLayout[] sberrs__du_ptag_ordered_error_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] sberrs__du_name_ordered_error_0 = new jmercury.runtime.DuFunctorDesc[53];
  private static final int[] sberrs__functor_number_map_error_0 = new int[53];
  public static final jmercury.runtime.TypeCtorInfo_Struct sberrs__type_ctor_info_error_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct errors__ti_message_1sberrs__type_ctor_info_error_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct sberrs__type_ctor_info_errors_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc sberrs__enum_functor_desc_prmode_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc sberrs__enum_functor_desc_prmode_0_1 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] sberrs__enum_value_ordered_prmode_0 = new jmercury.runtime.EnumFunctorDesc[2];
  private static final jmercury.runtime.EnumFunctorDesc[] sberrs__enum_name_ordered_prmode_0 = new jmercury.runtime.EnumFunctorDesc[2];
  private static final int[] sberrs__functor_number_map_prmode_0 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct sberrs__type_ctor_info_prmode_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  static {
    //
    //
    //
    //
    pair__pti_pair_2__plain_builtin__type_ctor_info_int_0__plain_xml__type_ctor_info_tree_obj_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0,
		(jmercury.runtime.PseudoTypeInfo) xml.xml__type_ctor_info_tree_obj_0});
    //
    //
    sberrs__field_types_error_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_0.init("getopt",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		7,
		0,
		sberrs.sberrs__field_types_error_0_0,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_1[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_1.init("io",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		8,
		1,
		sberrs.sberrs__field_types_error_0_1,
		null,
		null,
		null);
    //
    //
    list__ti_list_1builtin__type_ctor_info_string_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0)});
    //
    sberrs__field_types_error_0_2[0] = (jmercury.runtime.PseudoTypeInfo) sberrs.list__ti_list_1builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_2.init("xml",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		9,
		2,
		sberrs.sberrs__field_types_error_0_2,
		null,
		null,
		null);
    //
    pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_string_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0)});
    //
    list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_string_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_string_0)});
    //
    pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_tree_obj_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(xml.xml__type_ctor_info_tree_obj_0)});
    //
    list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_tree_obj_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_tree_obj_0)});
    //
    sberrs__field_types_error_0_3[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    sberrs__field_types_error_0_3[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    sberrs__field_types_error_0_3[2] = (jmercury.runtime.PseudoTypeInfo) sberrs.list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_string_0;
    sberrs__field_types_error_0_3[3] = (jmercury.runtime.PseudoTypeInfo) sberrs.list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_tree_obj_0;
    //
    sberrs__du_functor_desc_error_0_3.init("unexpected_elem",
		4,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		10,
		3,
		sberrs.sberrs__field_types_error_0_3,
		null,
		null,
		null);
    //
    //
    sberrs__field_types_error_0_4[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    sberrs__field_types_error_0_4[1] = (jmercury.runtime.PseudoTypeInfo) xml.xml__type_ctor_info_spec_0;
    //
    sberrs__du_functor_desc_error_0_4.init("unexpected_spec",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		11,
		4,
		sberrs.sberrs__field_types_error_0_4,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_5[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_5.init("expected_elem",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		12,
		5,
		sberrs.sberrs__field_types_error_0_5,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_6[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    sberrs__field_types_error_0_6[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    sberrs__du_functor_desc_error_0_6.init("io",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		13,
		6,
		sberrs.sberrs__field_types_error_0_6,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_7[0] = (jmercury.runtime.PseudoTypeInfo) sberrs.list__ti_list_1builtin__type_ctor_info_string_0;
    sberrs__field_types_error_0_7[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    sberrs__field_types_error_0_7[2] = (jmercury.runtime.PseudoTypeInfo) sberrs.list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_string_0;
    sberrs__field_types_error_0_7[3] = (jmercury.runtime.PseudoTypeInfo) sberrs.list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_tree_obj_0;
    //
    sberrs__du_functor_desc_error_0_7.init("expected_attrs",
		4,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		14,
		7,
		sberrs.sberrs__field_types_error_0_7,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_8[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    sberrs__field_types_error_0_8[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    sberrs__field_types_error_0_8[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_8.init("funny_triple",
		3,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		15,
		8,
		sberrs.sberrs__field_types_error_0_8,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_9[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    sberrs__field_types_error_0_9[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_9.init("funny_triple",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		16,
		9,
		sberrs.sberrs__field_types_error_0_9,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_10[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    sberrs__field_types_error_0_10[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    sberrs__du_functor_desc_error_0_10.init("unknown_id",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		17,
		10,
		sberrs.sberrs__field_types_error_0_10,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_11[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    sberrs__field_types_error_0_11[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    sberrs__field_types_error_0_11[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_11.init("funny_nested",
		3,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		18,
		11,
		sberrs.sberrs__field_types_error_0_11,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_12[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_12.init("funny_strnode",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		19,
		12,
		sberrs.sberrs__field_types_error_0_12,
		null,
		null,
		null);
    //
    sberrs__du_functor_desc_error_0_13.init("dupl_filetype",
		0,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		13,
		null,
		null,
		null,
		null);
    //
    sberrs__du_functor_desc_error_0_14.init("dupl_command",
		0,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		14,
		null,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_15[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_15.init("funny_concept",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		20,
		15,
		sberrs.sberrs__field_types_error_0_15,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_16[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    sberrs__du_functor_desc_error_0_16.init("missing_vardef",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		21,
		16,
		sberrs.sberrs__field_types_error_0_16,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_17[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    sberrs__field_types_error_0_17[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_17.init("funny_attr",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		22,
		17,
		sberrs.sberrs__field_types_error_0_17,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_18[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_18.init("funny_pred_param",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		23,
		18,
		sberrs.sberrs__field_types_error_0_18,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_19[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    sberrs__du_functor_desc_error_0_19.init("dupl_vardef",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		24,
		19,
		sberrs.sberrs__field_types_error_0_19,
		null,
		null,
		null);
    //
    list__ti_list_1builtin__type_ctor_info_int_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0)});
    //
    sberrs__field_types_error_0_20[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    sberrs__field_types_error_0_20[1] = (jmercury.runtime.PseudoTypeInfo) sberrs.list__ti_list_1builtin__type_ctor_info_int_0;
    //
    sberrs__du_functor_desc_error_0_20.init("dupl_ref_attrs",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		25,
		20,
		sberrs.sberrs__field_types_error_0_20,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_21[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_21.init("funny_tconst",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		26,
		21,
		sberrs.sberrs__field_types_error_0_21,
		null,
		null,
		null);
    //
    sberrs__du_functor_desc_error_0_22.init("funny_pred",
		0,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		2,
		22,
		null,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_23[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_23.init("pred_coref",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		27,
		23,
		sberrs.sberrs__field_types_error_0_23,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_24[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_24.init("coref_self_cycle",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		28,
		24,
		sberrs.sberrs__field_types_error_0_24,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_25[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    sberrs__field_types_error_0_25[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    sberrs__du_functor_desc_error_0_25.init("dupl_var",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		29,
		25,
		sberrs.sberrs__field_types_error_0_25,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_26[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_26.init("wordnet",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		30,
		26,
		sberrs.sberrs__field_types_error_0_26,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_27[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    sberrs__du_functor_desc_error_0_27.init("triple_cycle",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		31,
		27,
		sberrs.sberrs__field_types_error_0_27,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_28[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_28.init("funny_pred",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		32,
		28,
		sberrs.sberrs__field_types_error_0_28,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_29[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    sberrs__field_types_error_0_29[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    sberrs__field_types_error_0_29[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    sberrs__du_functor_desc_error_0_29.init("multiple_links",
		3,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		33,
		29,
		sberrs.sberrs__field_types_error_0_29,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_30[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    sberrs__field_types_error_0_30[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    sberrs__du_functor_desc_error_0_30.init("funny_mod_obj_sc",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		34,
		30,
		sberrs.sberrs__field_types_error_0_30,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_31[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_31.init("funny_mod_obj_s",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		35,
		31,
		sberrs.sberrs__field_types_error_0_31,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_32[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    sberrs__du_functor_desc_error_0_32.init("funny_mod_obj_c",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		36,
		32,
		sberrs.sberrs__field_types_error_0_32,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_33[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_33.init("unexp_predtp",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		37,
		33,
		sberrs.sberrs__field_types_error_0_33,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_34[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    sberrs__field_types_error_0_34[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    sberrs__field_types_error_0_34[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_34.init("funny_str",
		3,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		38,
		34,
		sberrs.sberrs__field_types_error_0_34,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_35[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    sberrs__du_functor_desc_error_0_35.init("dupl_ent_id",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		39,
		35,
		sberrs.sberrs__field_types_error_0_35,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_36[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_36.init("funny_ent_tp",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		40,
		36,
		sberrs.sberrs__field_types_error_0_36,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_37[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_37.init("funny_ne_tp",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		41,
		37,
		sberrs.sberrs__field_types_error_0_37,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_38[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_38.init("funny_pos",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		42,
		38,
		sberrs.sberrs__field_types_error_0_38,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_39[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_39.init("funny_semrel",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		43,
		39,
		sberrs.sberrs__field_types_error_0_39,
		null,
		null,
		null);
    //
    pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0)});
    //
    list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0)});
    //
    sberrs__field_types_error_0_40[0] = (jmercury.runtime.PseudoTypeInfo) sberrs.list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0;
    //
    sberrs__du_functor_desc_error_0_40.init("funny_coref",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		44,
		40,
		sberrs.sberrs__field_types_error_0_40,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_41[0] = (jmercury.runtime.PseudoTypeInfo) sberrs.pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0;
    //
    sberrs__du_functor_desc_error_0_41.init("dupl_coref",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		45,
		41,
		sberrs.sberrs__field_types_error_0_41,
		null,
		null,
		null);
    //
    sberrs__du_functor_desc_error_0_42.init("funny_anno_doc",
		0,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		3,
		42,
		null,
		null,
		null,
		null);
    //
    sberrs__du_functor_desc_error_0_43.init("funny_anno_elem",
		0,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		4,
		43,
		null,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_44[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_44.init("funny_anno_body",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		46,
		44,
		sberrs.sberrs__field_types_error_0_44,
		null,
		null,
		null);
    //
    sberrs__du_functor_desc_error_0_45.init("funny_anno_attrs",
		0,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		5,
		45,
		null,
		null,
		null,
		null);
    //
    sberrs__du_functor_desc_error_0_46.init("funny_bel_type",
		0,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		6,
		46,
		null,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_47[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_47.init("funny_post_elem",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		47,
		47,
		sberrs.sberrs__field_types_error_0_47,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_48[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_48.init("funny_post_attrs",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		48,
		48,
		sberrs.sberrs__field_types_error_0_48,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_49[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    sberrs__field_types_error_0_49[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    sberrs__field_types_error_0_49[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    sberrs__du_functor_desc_error_0_49.init("funny_anno_word",
		3,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		49,
		49,
		sberrs.sberrs__field_types_error_0_49,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_50[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_50.init("anno_out_of_order",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		50,
		50,
		sberrs.sberrs__field_types_error_0_50,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_51[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_51.init("funny_t2t_elem",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		51,
		51,
		sberrs.sberrs__field_types_error_0_51,
		null,
		null,
		null);
    //
    sberrs__field_types_error_0_52[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    sberrs__du_functor_desc_error_0_52.init("t2t_spec",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		52,
		52,
		sberrs.sberrs__field_types_error_0_52,
		null,
		null,
		null);
    //
    sberrs__du_stag_ordered_error_0_0[0] = sberrs.sberrs__du_functor_desc_error_0_13;
    sberrs__du_stag_ordered_error_0_0[1] = sberrs.sberrs__du_functor_desc_error_0_14;
    sberrs__du_stag_ordered_error_0_0[2] = sberrs.sberrs__du_functor_desc_error_0_22;
    sberrs__du_stag_ordered_error_0_0[3] = sberrs.sberrs__du_functor_desc_error_0_42;
    sberrs__du_stag_ordered_error_0_0[4] = sberrs.sberrs__du_functor_desc_error_0_43;
    sberrs__du_stag_ordered_error_0_0[5] = sberrs.sberrs__du_functor_desc_error_0_45;
    sberrs__du_stag_ordered_error_0_0[6] = sberrs.sberrs__du_functor_desc_error_0_46;
    sberrs__du_stag_ordered_error_0_0[7] = sberrs.sberrs__du_functor_desc_error_0_0;
    sberrs__du_stag_ordered_error_0_0[8] = sberrs.sberrs__du_functor_desc_error_0_1;
    sberrs__du_stag_ordered_error_0_0[9] = sberrs.sberrs__du_functor_desc_error_0_2;
    sberrs__du_stag_ordered_error_0_0[10] = sberrs.sberrs__du_functor_desc_error_0_3;
    sberrs__du_stag_ordered_error_0_0[11] = sberrs.sberrs__du_functor_desc_error_0_4;
    sberrs__du_stag_ordered_error_0_0[12] = sberrs.sberrs__du_functor_desc_error_0_5;
    sberrs__du_stag_ordered_error_0_0[13] = sberrs.sberrs__du_functor_desc_error_0_6;
    sberrs__du_stag_ordered_error_0_0[14] = sberrs.sberrs__du_functor_desc_error_0_7;
    sberrs__du_stag_ordered_error_0_0[15] = sberrs.sberrs__du_functor_desc_error_0_8;
    sberrs__du_stag_ordered_error_0_0[16] = sberrs.sberrs__du_functor_desc_error_0_9;
    sberrs__du_stag_ordered_error_0_0[17] = sberrs.sberrs__du_functor_desc_error_0_10;
    sberrs__du_stag_ordered_error_0_0[18] = sberrs.sberrs__du_functor_desc_error_0_11;
    sberrs__du_stag_ordered_error_0_0[19] = sberrs.sberrs__du_functor_desc_error_0_12;
    sberrs__du_stag_ordered_error_0_0[20] = sberrs.sberrs__du_functor_desc_error_0_15;
    sberrs__du_stag_ordered_error_0_0[21] = sberrs.sberrs__du_functor_desc_error_0_16;
    sberrs__du_stag_ordered_error_0_0[22] = sberrs.sberrs__du_functor_desc_error_0_17;
    sberrs__du_stag_ordered_error_0_0[23] = sberrs.sberrs__du_functor_desc_error_0_18;
    sberrs__du_stag_ordered_error_0_0[24] = sberrs.sberrs__du_functor_desc_error_0_19;
    sberrs__du_stag_ordered_error_0_0[25] = sberrs.sberrs__du_functor_desc_error_0_20;
    sberrs__du_stag_ordered_error_0_0[26] = sberrs.sberrs__du_functor_desc_error_0_21;
    sberrs__du_stag_ordered_error_0_0[27] = sberrs.sberrs__du_functor_desc_error_0_23;
    sberrs__du_stag_ordered_error_0_0[28] = sberrs.sberrs__du_functor_desc_error_0_24;
    sberrs__du_stag_ordered_error_0_0[29] = sberrs.sberrs__du_functor_desc_error_0_25;
    sberrs__du_stag_ordered_error_0_0[30] = sberrs.sberrs__du_functor_desc_error_0_26;
    sberrs__du_stag_ordered_error_0_0[31] = sberrs.sberrs__du_functor_desc_error_0_27;
    sberrs__du_stag_ordered_error_0_0[32] = sberrs.sberrs__du_functor_desc_error_0_28;
    sberrs__du_stag_ordered_error_0_0[33] = sberrs.sberrs__du_functor_desc_error_0_29;
    sberrs__du_stag_ordered_error_0_0[34] = sberrs.sberrs__du_functor_desc_error_0_30;
    sberrs__du_stag_ordered_error_0_0[35] = sberrs.sberrs__du_functor_desc_error_0_31;
    sberrs__du_stag_ordered_error_0_0[36] = sberrs.sberrs__du_functor_desc_error_0_32;
    sberrs__du_stag_ordered_error_0_0[37] = sberrs.sberrs__du_functor_desc_error_0_33;
    sberrs__du_stag_ordered_error_0_0[38] = sberrs.sberrs__du_functor_desc_error_0_34;
    sberrs__du_stag_ordered_error_0_0[39] = sberrs.sberrs__du_functor_desc_error_0_35;
    sberrs__du_stag_ordered_error_0_0[40] = sberrs.sberrs__du_functor_desc_error_0_36;
    sberrs__du_stag_ordered_error_0_0[41] = sberrs.sberrs__du_functor_desc_error_0_37;
    sberrs__du_stag_ordered_error_0_0[42] = sberrs.sberrs__du_functor_desc_error_0_38;
    sberrs__du_stag_ordered_error_0_0[43] = sberrs.sberrs__du_functor_desc_error_0_39;
    sberrs__du_stag_ordered_error_0_0[44] = sberrs.sberrs__du_functor_desc_error_0_40;
    sberrs__du_stag_ordered_error_0_0[45] = sberrs.sberrs__du_functor_desc_error_0_41;
    sberrs__du_stag_ordered_error_0_0[46] = sberrs.sberrs__du_functor_desc_error_0_44;
    sberrs__du_stag_ordered_error_0_0[47] = sberrs.sberrs__du_functor_desc_error_0_47;
    sberrs__du_stag_ordered_error_0_0[48] = sberrs.sberrs__du_functor_desc_error_0_48;
    sberrs__du_stag_ordered_error_0_0[49] = sberrs.sberrs__du_functor_desc_error_0_49;
    sberrs__du_stag_ordered_error_0_0[50] = sberrs.sberrs__du_functor_desc_error_0_50;
    sberrs__du_stag_ordered_error_0_0[51] = sberrs.sberrs__du_functor_desc_error_0_51;
    sberrs__du_stag_ordered_error_0_0[52] = sberrs.sberrs__du_functor_desc_error_0_52;
    //
    sberrs__du_ptag_ordered_error_0[0] = new jmercury.runtime.DuPtagLayout(53,
		private_builtin.MR_SECTAG_REMOTE,
		sberrs.sberrs__du_stag_ordered_error_0_0);
    //
    sberrs__du_name_ordered_error_0[0] = sberrs.sberrs__du_functor_desc_error_0_50;
    sberrs__du_name_ordered_error_0[1] = sberrs.sberrs__du_functor_desc_error_0_24;
    sberrs__du_name_ordered_error_0[2] = sberrs.sberrs__du_functor_desc_error_0_14;
    sberrs__du_name_ordered_error_0[3] = sberrs.sberrs__du_functor_desc_error_0_41;
    sberrs__du_name_ordered_error_0[4] = sberrs.sberrs__du_functor_desc_error_0_35;
    sberrs__du_name_ordered_error_0[5] = sberrs.sberrs__du_functor_desc_error_0_13;
    sberrs__du_name_ordered_error_0[6] = sberrs.sberrs__du_functor_desc_error_0_20;
    sberrs__du_name_ordered_error_0[7] = sberrs.sberrs__du_functor_desc_error_0_25;
    sberrs__du_name_ordered_error_0[8] = sberrs.sberrs__du_functor_desc_error_0_19;
    sberrs__du_name_ordered_error_0[9] = sberrs.sberrs__du_functor_desc_error_0_7;
    sberrs__du_name_ordered_error_0[10] = sberrs.sberrs__du_functor_desc_error_0_5;
    sberrs__du_name_ordered_error_0[11] = sberrs.sberrs__du_functor_desc_error_0_45;
    sberrs__du_name_ordered_error_0[12] = sberrs.sberrs__du_functor_desc_error_0_44;
    sberrs__du_name_ordered_error_0[13] = sberrs.sberrs__du_functor_desc_error_0_42;
    sberrs__du_name_ordered_error_0[14] = sberrs.sberrs__du_functor_desc_error_0_43;
    sberrs__du_name_ordered_error_0[15] = sberrs.sberrs__du_functor_desc_error_0_49;
    sberrs__du_name_ordered_error_0[16] = sberrs.sberrs__du_functor_desc_error_0_17;
    sberrs__du_name_ordered_error_0[17] = sberrs.sberrs__du_functor_desc_error_0_46;
    sberrs__du_name_ordered_error_0[18] = sberrs.sberrs__du_functor_desc_error_0_15;
    sberrs__du_name_ordered_error_0[19] = sberrs.sberrs__du_functor_desc_error_0_40;
    sberrs__du_name_ordered_error_0[20] = sberrs.sberrs__du_functor_desc_error_0_36;
    sberrs__du_name_ordered_error_0[21] = sberrs.sberrs__du_functor_desc_error_0_32;
    sberrs__du_name_ordered_error_0[22] = sberrs.sberrs__du_functor_desc_error_0_31;
    sberrs__du_name_ordered_error_0[23] = sberrs.sberrs__du_functor_desc_error_0_30;
    sberrs__du_name_ordered_error_0[24] = sberrs.sberrs__du_functor_desc_error_0_37;
    sberrs__du_name_ordered_error_0[25] = sberrs.sberrs__du_functor_desc_error_0_11;
    sberrs__du_name_ordered_error_0[26] = sberrs.sberrs__du_functor_desc_error_0_38;
    sberrs__du_name_ordered_error_0[27] = sberrs.sberrs__du_functor_desc_error_0_48;
    sberrs__du_name_ordered_error_0[28] = sberrs.sberrs__du_functor_desc_error_0_47;
    sberrs__du_name_ordered_error_0[29] = sberrs.sberrs__du_functor_desc_error_0_22;
    sberrs__du_name_ordered_error_0[30] = sberrs.sberrs__du_functor_desc_error_0_28;
    sberrs__du_name_ordered_error_0[31] = sberrs.sberrs__du_functor_desc_error_0_18;
    sberrs__du_name_ordered_error_0[32] = sberrs.sberrs__du_functor_desc_error_0_39;
    sberrs__du_name_ordered_error_0[33] = sberrs.sberrs__du_functor_desc_error_0_34;
    sberrs__du_name_ordered_error_0[34] = sberrs.sberrs__du_functor_desc_error_0_12;
    sberrs__du_name_ordered_error_0[35] = sberrs.sberrs__du_functor_desc_error_0_51;
    sberrs__du_name_ordered_error_0[36] = sberrs.sberrs__du_functor_desc_error_0_21;
    sberrs__du_name_ordered_error_0[37] = sberrs.sberrs__du_functor_desc_error_0_9;
    sberrs__du_name_ordered_error_0[38] = sberrs.sberrs__du_functor_desc_error_0_8;
    sberrs__du_name_ordered_error_0[39] = sberrs.sberrs__du_functor_desc_error_0_0;
    sberrs__du_name_ordered_error_0[40] = sberrs.sberrs__du_functor_desc_error_0_1;
    sberrs__du_name_ordered_error_0[41] = sberrs.sberrs__du_functor_desc_error_0_6;
    sberrs__du_name_ordered_error_0[42] = sberrs.sberrs__du_functor_desc_error_0_16;
    sberrs__du_name_ordered_error_0[43] = sberrs.sberrs__du_functor_desc_error_0_29;
    sberrs__du_name_ordered_error_0[44] = sberrs.sberrs__du_functor_desc_error_0_23;
    sberrs__du_name_ordered_error_0[45] = sberrs.sberrs__du_functor_desc_error_0_52;
    sberrs__du_name_ordered_error_0[46] = sberrs.sberrs__du_functor_desc_error_0_27;
    sberrs__du_name_ordered_error_0[47] = sberrs.sberrs__du_functor_desc_error_0_33;
    sberrs__du_name_ordered_error_0[48] = sberrs.sberrs__du_functor_desc_error_0_3;
    sberrs__du_name_ordered_error_0[49] = sberrs.sberrs__du_functor_desc_error_0_4;
    sberrs__du_name_ordered_error_0[50] = sberrs.sberrs__du_functor_desc_error_0_10;
    sberrs__du_name_ordered_error_0[51] = sberrs.sberrs__du_functor_desc_error_0_26;
    sberrs__du_name_ordered_error_0[52] = sberrs.sberrs__du_functor_desc_error_0_2;
    //
    sberrs__functor_number_map_error_0[0] = 39;
    sberrs__functor_number_map_error_0[1] = 40;
    sberrs__functor_number_map_error_0[2] = 52;
    sberrs__functor_number_map_error_0[3] = 48;
    sberrs__functor_number_map_error_0[4] = 49;
    sberrs__functor_number_map_error_0[5] = 10;
    sberrs__functor_number_map_error_0[6] = 41;
    sberrs__functor_number_map_error_0[7] = 9;
    sberrs__functor_number_map_error_0[8] = 38;
    sberrs__functor_number_map_error_0[9] = 37;
    sberrs__functor_number_map_error_0[10] = 50;
    sberrs__functor_number_map_error_0[11] = 25;
    sberrs__functor_number_map_error_0[12] = 34;
    sberrs__functor_number_map_error_0[13] = 5;
    sberrs__functor_number_map_error_0[14] = 2;
    sberrs__functor_number_map_error_0[15] = 18;
    sberrs__functor_number_map_error_0[16] = 42;
    sberrs__functor_number_map_error_0[17] = 16;
    sberrs__functor_number_map_error_0[18] = 31;
    sberrs__functor_number_map_error_0[19] = 8;
    sberrs__functor_number_map_error_0[20] = 6;
    sberrs__functor_number_map_error_0[21] = 36;
    sberrs__functor_number_map_error_0[22] = 29;
    sberrs__functor_number_map_error_0[23] = 44;
    sberrs__functor_number_map_error_0[24] = 1;
    sberrs__functor_number_map_error_0[25] = 7;
    sberrs__functor_number_map_error_0[26] = 51;
    sberrs__functor_number_map_error_0[27] = 46;
    sberrs__functor_number_map_error_0[28] = 30;
    sberrs__functor_number_map_error_0[29] = 43;
    sberrs__functor_number_map_error_0[30] = 23;
    sberrs__functor_number_map_error_0[31] = 22;
    sberrs__functor_number_map_error_0[32] = 21;
    sberrs__functor_number_map_error_0[33] = 47;
    sberrs__functor_number_map_error_0[34] = 33;
    sberrs__functor_number_map_error_0[35] = 4;
    sberrs__functor_number_map_error_0[36] = 20;
    sberrs__functor_number_map_error_0[37] = 24;
    sberrs__functor_number_map_error_0[38] = 26;
    sberrs__functor_number_map_error_0[39] = 32;
    sberrs__functor_number_map_error_0[40] = 19;
    sberrs__functor_number_map_error_0[41] = 3;
    sberrs__functor_number_map_error_0[42] = 13;
    sberrs__functor_number_map_error_0[43] = 14;
    sberrs__functor_number_map_error_0[44] = 12;
    sberrs__functor_number_map_error_0[45] = 11;
    sberrs__functor_number_map_error_0[46] = 17;
    sberrs__functor_number_map_error_0[47] = 28;
    sberrs__functor_number_map_error_0[48] = 27;
    sberrs__functor_number_map_error_0[49] = 15;
    sberrs__functor_number_map_error_0[50] = 0;
    sberrs__functor_number_map_error_0[51] = 35;
    sberrs__functor_number_map_error_0[52] = 45;
    //
    sberrs__type_ctor_info_error_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(0))),
		((java.lang.Object) (new AddrOf2_0(1))),
		"sberrs",
		"error",
		new jmercury.runtime.TypeFunctors(sberrs.sberrs__du_name_ordered_error_0),
		new jmercury.runtime.TypeLayout(sberrs.sberrs__du_ptag_ordered_error_0),
		53,
		4,
		sberrs.sberrs__functor_number_map_error_0);
    //
    //
    //
    errors__ti_message_1sberrs__type_ctor_info_error_0.init(errors.errors__type_ctor_info_message_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0)});
    //
    //
    pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(errors.errors__type_ctor_info_err_loc_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.errors__ti_message_1sberrs__type_ctor_info_error_0)});
    //
    list__ti_list_1pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)});
    //
    sberrs__type_ctor_info_errors_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(2))),
		((java.lang.Object) (new AddrOf2_0(3))),
		"sberrs",
		"errors",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) sberrs.list__ti_list_1pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0),
		-1,
		0,
		null);
    //
    sberrs__enum_functor_desc_prmode_0_0.init("props",
		0);
    //
    sberrs__enum_functor_desc_prmode_0_1.init("maximum",
		1);
    //
    sberrs__enum_value_ordered_prmode_0[0] = sberrs.sberrs__enum_functor_desc_prmode_0_0;
    sberrs__enum_value_ordered_prmode_0[1] = sberrs.sberrs__enum_functor_desc_prmode_0_1;
    //
    sberrs__enum_name_ordered_prmode_0[0] = sberrs.sberrs__enum_functor_desc_prmode_0_1;
    sberrs__enum_name_ordered_prmode_0[1] = sberrs.sberrs__enum_functor_desc_prmode_0_0;
    //
    sberrs__functor_number_map_prmode_0[0] = 1;
    sberrs__functor_number_map_prmode_0[1] = 0;
    //
    sberrs__type_ctor_info_prmode_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_ENUM,
		((java.lang.Object) (new AddrOf2_0(4))),
		((java.lang.Object) (new AddrOf2_0(5))),
		"sberrs",
		"prmode",
		new jmercury.runtime.TypeFunctors(sberrs.sberrs__enum_name_ordered_prmode_0),
		new jmercury.runtime.TypeLayout(sberrs.sberrs__enum_value_ordered_prmode_0),
		2,
		4,
		sberrs.sberrs__functor_number_map_prmode_0);
  }

// DataDefns
  static {
  }

// Scalar common data
  private static final jmercury.runtime.TypeInfo_Struct[] MR_scalar_common_1 = new jmercury.runtime.TypeInfo_Struct[9];
  private static final list.List_1.F_nil_0[] MR_scalar_common_2 = new list.List_1.F_nil_0[1];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_3 = new /* generic_type */ java.lang.Object[2][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_4 = new /* generic_type */ java.lang.Object[2][];
  private static void MR_init_scalars_0() {
    MR_scalar_common_1[0] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(xml.xml__type_ctor_info_tree_obj_0))));
    MR_scalar_common_1[1] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0))));
    MR_scalar_common_1[2] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))));
    MR_scalar_common_1[3] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[2]))));
    MR_scalar_common_1[4] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0))));
    MR_scalar_common_1[5] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[4]))));
    MR_scalar_common_1[6] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[0]))));
    MR_scalar_common_1[7] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))));
    MR_scalar_common_1[8] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(errors.errors__type_ctor_info_messages_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0))));
    MR_scalar_common_2[0] = new list.List_1.F_nil_0();
    MR_scalar_common_3[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(2),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0))};
    MR_scalar_common_3[1] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(2),
		((java.lang.Object) (sberrs.pair__pti_pair_2__plain_builtin__type_ctor_info_int_0__plain_xml__type_ctor_info_tree_obj_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0))};
    MR_scalar_common_4[0] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (sberrs.MR_scalar_common_3[0])),
		((java.lang.Object) (new AddrOf2_0(6))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_4[1] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (sberrs.MR_scalar_common_3[1])),
		((java.lang.Object) (new AddrOf2_0(7))),
		java.lang.Integer.valueOf(0)};
  }
  static {
    MR_init_scalars_0();
  }

// Vector common data

// NonDataDefns
  private static boolean __Unify____error_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = sberrs.__Unify____error_0_0(((sberrs.Error_0) wrapper_arg_1), ((sberrs.Error_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____error_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = sberrs.__Compare____error_0_0(((sberrs.Error_0) wrapper_arg_2), ((sberrs.Error_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____errors_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = sberrs.__Unify____errors_0_0(((list.List_1) wrapper_arg_1), ((list.List_1) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____errors_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = sberrs.__Compare____errors_0_0(((list.List_1) wrapper_arg_2), ((list.List_1) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____prmode_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = sberrs.__Unify____prmode_0_0(((sberrs.Prmode_0) wrapper_arg_1), ((sberrs.Prmode_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____prmode_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = sberrs.__Compare____prmode_0_0(((sberrs.Prmode_0) wrapper_arg_2), ((sberrs.Prmode_0) wrapper_arg_3));
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
              return_value = sberrs.__Unify____error_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 1:
          {
            java.lang.Object return_value = null;

            {
              return_value = sberrs.__Compare____error_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 2:
          {
            boolean return_value = false;

            {
              return_value = sberrs.__Unify____errors_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 3:
          {
            java.lang.Object return_value = null;

            {
              return_value = sberrs.__Compare____errors_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 4:
          {
            boolean return_value = false;

            {
              return_value = sberrs.__Unify____prmode_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 5:
          {
            java.lang.Object return_value = null;

            {
              return_value = sberrs.__Compare____prmode_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 6:
          {
            java.lang.Object return_value = null;

            {
              return_value = sberrs.error_string_2_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 7:
          {
            java.lang.Object return_value = null;

            {
              return_value = sberrs.error_string_2_p_0_2(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2));
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

//  sberrs.m:9
  public static class Error_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class T2t_spec_1
      extends sberrs.Error_0
    {
      public java.lang.String F1;

      public T2t_spec_1()
      {
        {
        }
      }
      public T2t_spec_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 52;
          this.F1 = F1;
        }
      }
    }

    public static class Funny_t2t_elem_1
      extends sberrs.Error_0
    {
      public java.lang.String F1;

      public Funny_t2t_elem_1()
      {
        {
        }
      }
      public Funny_t2t_elem_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 51;
          this.F1 = F1;
        }
      }
    }

    public static class Anno_out_of_order_1
      extends sberrs.Error_0
    {
      public java.lang.String F1;

      public Anno_out_of_order_1()
      {
        {
        }
      }
      public Anno_out_of_order_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 50;
          this.F1 = F1;
        }
      }
    }

    public static class Funny_anno_word_3
      extends sberrs.Error_0
    {
      public java.lang.String F1;
      public java.lang.String F2;
      public int F3;

      public Funny_anno_word_3()
      {
        {
        }
      }
      public Funny_anno_word_3(
        java.lang.String F1,
        java.lang.String F2,
        int F3)
      {
        {
          (this).data_tag = 49;
          this.F1 = F1;
          this.F2 = F2;
          this.F3 = F3;
        }
      }
    }

    public static class Funny_post_attrs_1
      extends sberrs.Error_0
    {
      public java.lang.String F1;

      public Funny_post_attrs_1()
      {
        {
        }
      }
      public Funny_post_attrs_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 48;
          this.F1 = F1;
        }
      }
    }

    public static class Funny_post_elem_1
      extends sberrs.Error_0
    {
      public java.lang.String F1;

      public Funny_post_elem_1()
      {
        {
        }
      }
      public Funny_post_elem_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 47;
          this.F1 = F1;
        }
      }
    }

    public static class Funny_bel_type_0
      extends sberrs.Error_0
    {

      public Funny_bel_type_0()
      {
        {
          (this).data_tag = 6;
        }
      }
    }

    public static class Funny_anno_attrs_0
      extends sberrs.Error_0
    {

      public Funny_anno_attrs_0()
      {
        {
          (this).data_tag = 5;
        }
      }
    }

    public static class Funny_anno_body_1
      extends sberrs.Error_0
    {
      public java.lang.String F1;

      public Funny_anno_body_1()
      {
        {
        }
      }
      public Funny_anno_body_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 46;
          this.F1 = F1;
        }
      }
    }

    public static class Funny_anno_elem_0
      extends sberrs.Error_0
    {

      public Funny_anno_elem_0()
      {
        {
          (this).data_tag = 4;
        }
      }
    }

    public static class Funny_anno_doc_0
      extends sberrs.Error_0
    {

      public Funny_anno_doc_0()
      {
        {
          (this).data_tag = 3;
        }
      }
    }

    public static class Dupl_coref_1
      extends sberrs.Error_0
    {
      public pair.Pair_2<java.lang.Integer, java.lang.Integer> F1;

      public Dupl_coref_1()
      {
        {
        }
      }
      public Dupl_coref_1(
        pair.Pair_2<java.lang.Integer, java.lang.Integer> F1)
      {
        {
          (this).data_tag = 45;
          this.F1 = F1;
        }
      }
    }

    public static class Funny_coref_1
      extends sberrs.Error_0
    {
      public list.List_1<pair.Pair_2<java.lang.Integer, java.lang.Integer>> F1;

      public Funny_coref_1()
      {
        {
        }
      }
      public Funny_coref_1(
        list.List_1<pair.Pair_2<java.lang.Integer, java.lang.Integer>> F1)
      {
        {
          (this).data_tag = 44;
          this.F1 = F1;
        }
      }
    }

    public static class Funny_semrel_1
      extends sberrs.Error_0
    {
      public java.lang.String F1;

      public Funny_semrel_1()
      {
        {
        }
      }
      public Funny_semrel_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 43;
          this.F1 = F1;
        }
      }
    }

    public static class Funny_pos_1
      extends sberrs.Error_0
    {
      public java.lang.String F1;

      public Funny_pos_1()
      {
        {
        }
      }
      public Funny_pos_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 42;
          this.F1 = F1;
        }
      }
    }

    public static class Funny_ne_tp_1
      extends sberrs.Error_0
    {
      public java.lang.String F1;

      public Funny_ne_tp_1()
      {
        {
        }
      }
      public Funny_ne_tp_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 41;
          this.F1 = F1;
        }
      }
    }

    public static class Funny_ent_tp_1
      extends sberrs.Error_0
    {
      public java.lang.String F1;

      public Funny_ent_tp_1()
      {
        {
        }
      }
      public Funny_ent_tp_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 40;
          this.F1 = F1;
        }
      }
    }

    public static class Dupl_ent_id_1
      extends sberrs.Error_0
    {
      public int F1;

      public Dupl_ent_id_1()
      {
        {
        }
      }
      public Dupl_ent_id_1(
        int F1)
      {
        {
          (this).data_tag = 39;
          this.F1 = F1;
        }
      }
    }

    public static class Funny_str_3
      extends sberrs.Error_0
    {
      public java.lang.String F1;
      public java.lang.String F2;
      public java.lang.String F3;

      public Funny_str_3()
      {
        {
        }
      }
      public Funny_str_3(
        java.lang.String F1,
        java.lang.String F2,
        java.lang.String F3)
      {
        {
          (this).data_tag = 38;
          this.F1 = F1;
          this.F2 = F2;
          this.F3 = F3;
        }
      }
    }

    public static class Unexp_predtp_1
      extends sberrs.Error_0
    {
      public java.lang.String F1;

      public Unexp_predtp_1()
      {
        {
        }
      }
      public Unexp_predtp_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 37;
          this.F1 = F1;
        }
      }
    }

    public static class Funny_mod_obj_c_1
      extends sberrs.Error_0
    {
      public int F1;

      public Funny_mod_obj_c_1()
      {
        {
        }
      }
      public Funny_mod_obj_c_1(
        int F1)
      {
        {
          (this).data_tag = 36;
          this.F1 = F1;
        }
      }
    }

    public static class Funny_mod_obj_s_1
      extends sberrs.Error_0
    {
      public java.lang.String F1;

      public Funny_mod_obj_s_1()
      {
        {
        }
      }
      public Funny_mod_obj_s_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 35;
          this.F1 = F1;
        }
      }
    }

    public static class Funny_mod_obj_sc_2
      extends sberrs.Error_0
    {
      public java.lang.String F1;
      public int F2;

      public Funny_mod_obj_sc_2()
      {
        {
        }
      }
      public Funny_mod_obj_sc_2(
        java.lang.String F1,
        int F2)
      {
        {
          (this).data_tag = 34;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Multiple_links_3
      extends sberrs.Error_0
    {
      public java.lang.String F1;
      public java.lang.String F2;
      public int F3;

      public Multiple_links_3()
      {
        {
        }
      }
      public Multiple_links_3(
        java.lang.String F1,
        java.lang.String F2,
        int F3)
      {
        {
          (this).data_tag = 33;
          this.F1 = F1;
          this.F2 = F2;
          this.F3 = F3;
        }
      }
    }

    public static class Funny_pred_1
      extends sberrs.Error_0
    {
      public java.lang.String F1;

      public Funny_pred_1()
      {
        {
        }
      }
      public Funny_pred_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 32;
          this.F1 = F1;
        }
      }
    }

    public static class Triple_cycle_1
      extends sberrs.Error_0
    {
      public int F1;

      public Triple_cycle_1()
      {
        {
        }
      }
      public Triple_cycle_1(
        int F1)
      {
        {
          (this).data_tag = 31;
          this.F1 = F1;
        }
      }
    }

    public static class Wordnet_1
      extends sberrs.Error_0
    {
      public java.lang.String F1;

      public Wordnet_1()
      {
        {
        }
      }
      public Wordnet_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 30;
          this.F1 = F1;
        }
      }
    }

    public static class Dupl_var_2
      extends sberrs.Error_0
    {
      public int F1;
      public int F2;

      public Dupl_var_2()
      {
        {
        }
      }
      public Dupl_var_2(
        int F1,
        int F2)
      {
        {
          (this).data_tag = 29;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Coref_self_cycle_1
      extends sberrs.Error_0
    {
      public java.lang.String F1;

      public Coref_self_cycle_1()
      {
        {
        }
      }
      public Coref_self_cycle_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 28;
          this.F1 = F1;
        }
      }
    }

    public static class Pred_coref_1
      extends sberrs.Error_0
    {
      public java.lang.String F1;

      public Pred_coref_1()
      {
        {
        }
      }
      public Pred_coref_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 27;
          this.F1 = F1;
        }
      }
    }

    public static class Funny_pred_0
      extends sberrs.Error_0
    {

      public Funny_pred_0()
      {
        {
          (this).data_tag = 2;
        }
      }
    }

    public static class Funny_tconst_1
      extends sberrs.Error_0
    {
      public java.lang.String F1;

      public Funny_tconst_1()
      {
        {
        }
      }
      public Funny_tconst_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 26;
          this.F1 = F1;
        }
      }
    }

    public static class Dupl_ref_attrs_2
      extends sberrs.Error_0
    {
      public java.lang.String F1;
      public list.List_1<java.lang.Integer> F2;

      public Dupl_ref_attrs_2()
      {
        {
        }
      }
      public Dupl_ref_attrs_2(
        java.lang.String F1,
        list.List_1<java.lang.Integer> F2)
      {
        {
          (this).data_tag = 25;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Dupl_vardef_1
      extends sberrs.Error_0
    {
      public int F1;

      public Dupl_vardef_1()
      {
        {
        }
      }
      public Dupl_vardef_1(
        int F1)
      {
        {
          (this).data_tag = 24;
          this.F1 = F1;
        }
      }
    }

    public static class Funny_pred_param_1
      extends sberrs.Error_0
    {
      public java.lang.String F1;

      public Funny_pred_param_1()
      {
        {
        }
      }
      public Funny_pred_param_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 23;
          this.F1 = F1;
        }
      }
    }

    public static class Funny_attr_2
      extends sberrs.Error_0
    {
      public java.lang.String F1;
      public java.lang.String F2;

      public Funny_attr_2()
      {
        {
        }
      }
      public Funny_attr_2(
        java.lang.String F1,
        java.lang.String F2)
      {
        {
          (this).data_tag = 22;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Missing_vardef_1
      extends sberrs.Error_0
    {
      public int F1;

      public Missing_vardef_1()
      {
        {
        }
      }
      public Missing_vardef_1(
        int F1)
      {
        {
          (this).data_tag = 21;
          this.F1 = F1;
        }
      }
    }

    public static class Funny_concept_1
      extends sberrs.Error_0
    {
      public java.lang.String F1;

      public Funny_concept_1()
      {
        {
        }
      }
      public Funny_concept_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 20;
          this.F1 = F1;
        }
      }
    }

    public static class Dupl_command_0
      extends sberrs.Error_0
    {

      public Dupl_command_0()
      {
        {
          (this).data_tag = 1;
        }
      }
    }

    public static class Dupl_filetype_0
      extends sberrs.Error_0
    {

      public Dupl_filetype_0()
      {
        {
          (this).data_tag = 0;
        }
      }
    }

    public static class Funny_strnode_1
      extends sberrs.Error_0
    {
      public java.lang.String F1;

      public Funny_strnode_1()
      {
        {
        }
      }
      public Funny_strnode_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 19;
          this.F1 = F1;
        }
      }
    }

    public static class Funny_nested_3
      extends sberrs.Error_0
    {
      public int F1;
      public int F2;
      public java.lang.String F3;

      public Funny_nested_3()
      {
        {
        }
      }
      public Funny_nested_3(
        int F1,
        int F2,
        java.lang.String F3)
      {
        {
          (this).data_tag = 18;
          this.F1 = F1;
          this.F2 = F2;
          this.F3 = F3;
        }
      }
    }

    public static class Unknown_id_2
      extends sberrs.Error_0
    {
      public int F1;
      public int F2;

      public Unknown_id_2()
      {
        {
        }
      }
      public Unknown_id_2(
        int F1,
        int F2)
      {
        {
          (this).data_tag = 17;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Funny_triple_2
      extends sberrs.Error_0
    {
      public int F1;
      public java.lang.String F2;

      public Funny_triple_2()
      {
        {
        }
      }
      public Funny_triple_2(
        int F1,
        java.lang.String F2)
      {
        {
          (this).data_tag = 16;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Funny_triple_3
      extends sberrs.Error_0
    {
      public java.lang.String F1;
      public int F2;
      public java.lang.String F3;

      public Funny_triple_3()
      {
        {
        }
      }
      public Funny_triple_3(
        java.lang.String F1,
        int F2,
        java.lang.String F3)
      {
        {
          (this).data_tag = 15;
          this.F1 = F1;
          this.F2 = F2;
          this.F3 = F3;
        }
      }
    }

    public static class Expected_attrs_4
      extends sberrs.Error_0
    {
      public list.List_1<java.lang.String> F1;
      public java.lang.String F2;
      public list.List_1<pair.Pair_2<java.lang.String, java.lang.String>> F3;
      public list.List_1<pair.Pair_2<java.lang.Integer, xml.Tree_obj_0>> F4;

      public Expected_attrs_4()
      {
        {
        }
      }
      public Expected_attrs_4(
        list.List_1<java.lang.String> F1,
        java.lang.String F2,
        list.List_1<pair.Pair_2<java.lang.String, java.lang.String>> F3,
        list.List_1<pair.Pair_2<java.lang.Integer, xml.Tree_obj_0>> F4)
      {
        {
          (this).data_tag = 14;
          this.F1 = F1;
          this.F2 = F2;
          this.F3 = F3;
          this.F4 = F4;
        }
      }
    }

    public static class Io_2
      extends sberrs.Error_0
    {
      public java.lang.String F1;
      public int F2;

      public Io_2()
      {
        {
        }
      }
      public Io_2(
        java.lang.String F1,
        int F2)
      {
        {
          (this).data_tag = 13;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Expected_elem_1
      extends sberrs.Error_0
    {
      public java.lang.String F1;

      public Expected_elem_1()
      {
        {
        }
      }
      public Expected_elem_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 12;
          this.F1 = F1;
        }
      }
    }

    public static class Unexpected_spec_2
      extends sberrs.Error_0
    {
      public java.lang.String F1;
      public xml.Spec_0 F2;

      public Unexpected_spec_2()
      {
        {
        }
      }
      public Unexpected_spec_2(
        java.lang.String F1,
        xml.Spec_0 F2)
      {
        {
          (this).data_tag = 11;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Unexpected_elem_4
      extends sberrs.Error_0
    {
      public java.lang.String F1;
      public java.lang.String F2;
      public list.List_1<pair.Pair_2<java.lang.String, java.lang.String>> F3;
      public list.List_1<pair.Pair_2<java.lang.Integer, xml.Tree_obj_0>> F4;

      public Unexpected_elem_4()
      {
        {
        }
      }
      public Unexpected_elem_4(
        java.lang.String F1,
        java.lang.String F2,
        list.List_1<pair.Pair_2<java.lang.String, java.lang.String>> F3,
        list.List_1<pair.Pair_2<java.lang.Integer, xml.Tree_obj_0>> F4)
      {
        {
          (this).data_tag = 10;
          this.F1 = F1;
          this.F2 = F2;
          this.F3 = F3;
          this.F4 = F4;
        }
      }
    }

    public static class Xml_1
      extends sberrs.Error_0
    {
      public list.List_1<java.lang.String> F1;

      public Xml_1()
      {
        {
        }
      }
      public Xml_1(
        list.List_1<java.lang.String> F1)
      {
        {
          (this).data_tag = 9;
          this.F1 = F1;
        }
      }
    }

    public static class Io_1
      extends sberrs.Error_0
    {
      public java.lang.String F1;

      public Io_1()
      {
        {
        }
      }
      public Io_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 8;
          this.F1 = F1;
        }
      }
    }

    public static class Getopt_1
      extends sberrs.Error_0
    {
      public java.lang.String F1;

      public Getopt_1()
      {
        {
        }
      }
      public Getopt_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 7;
          this.F1 = F1;
        }
      }
    }


  }

//  sberrs.m:6
  public static class Prmode_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Prmode_0 K0 = new Prmode_0(0);  /* props */
      public static final Prmode_0 K1 = new Prmode_0(1);  /* maximum */

      private Prmode_0(int val) {
        super(val);
      }

  }

//  sberrs.m:42
  private static java.lang.String IntroducedFrom__pred__error_string__42__1_2_p_0(
    pair.Pair_2 HeadVar__1_30)
  {
    {
      boolean succeeded = false;
      java.lang.String HeadVar__2_31 = null;
      xml.Tree_obj_0 I_22 = ((xml.Tree_obj_0) ((pair.Pair_2) HeadVar__1_30).F2);
      int V_21_21 = ((java.lang.Integer) (((pair.Pair_2) HeadVar__1_30).F1)).intValue();

//  sberrs.m:44
      switch (I_22.data_tag) {
        case 0:
//  sberrs.m:43
          {
            java.lang.String T_23 = ((xml.Tree_obj_0.Text_1) I_22).F1;
            java.lang.String V_39_39 = "text/%i";
            list.List_1 V_40_40 = null;
            string.Poly_type_0 V_41_41 = null;
            int V_42_42 = 0;
            list.List_1 V_43_43 = null;

            {
              V_42_42 = string.length_1_f_0(T_23);
            }
            {
              V_41_41 = new string.Poly_type_0.I_1(V_42_42);
            }
            V_43_43 = (list.List_1) sberrs.MR_scalar_common_2[0];
            {
              V_40_40 = new list.List_1.F_cons_2(((java.lang.Object) (V_41_41)), V_43_43);
            }
            {
              HeadVar__2_31 = string.format_3_p_0(V_39_39, V_40_40);
            }
          }
//  sberrs.m:44
          break;
        case 1:
//  sberrs.m:45
          HeadVar__2_31 = "spec";
//  sberrs.m:44
          break;
        case 2:
          {
            jmercury.runtime.TypeInfo_Struct TypeInfo_371_371 = null;
            list.List_1 Is_25 = ((xml.Tree_obj_0.Element_3) I_22).F3;
            java.lang.String V_32_32 = "%s/%i";
            list.List_1 V_33_33 = null;
            string.Poly_type_0 V_34_34 = null;
            list.List_1 V_35_35 = null;
            string.Poly_type_0 V_36_36 = null;
            int V_37_37 = 0;
            list.List_1 V_38_38 = null;
            java.lang.String T_53 = ((xml.Tree_obj_0.Element_3) I_22).F1;
            list.List_1 V_24_24 = ((xml.Tree_obj_0.Element_3) I_22).F2;

            {
              V_34_34 = new string.Poly_type_0.S_1(T_53);
            }
            TypeInfo_371_371 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[0]);
            {
              V_37_37 = list.length_1_f_0(TypeInfo_371_371, Is_25);
            }
            {
              V_36_36 = new string.Poly_type_0.I_1(V_37_37);
            }
            V_38_38 = (list.List_1) sberrs.MR_scalar_common_2[0];
            {
              V_35_35 = new list.List_1.F_cons_2(((java.lang.Object) (V_36_36)), V_38_38);
            }
            {
              V_33_33 = new list.List_1.F_cons_2(((java.lang.Object) (V_34_34)), V_35_35);
            }
            {
              HeadVar__2_31 = string.format_3_p_0(V_32_32, V_33_33);
            }
          }
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
//  sberrs.m:42
      return HeadVar__2_31;
    }
  }
//  sberrs.m:6
  public static builtin.Comparison_result_0 __Compare____prmode_0_0(
    sberrs.Prmode_0 HeadVar__2_2,
    sberrs.Prmode_0 HeadVar__3_3)
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
  public static boolean __Unify____prmode_0_0(
    sberrs.Prmode_0 HeadVar__2_1,
    sberrs.Prmode_0 HeadVar__2_2)
  {
    {
      boolean succeeded = (HeadVar__2_1.MR_value == HeadVar__2_2.MR_value);

      return succeeded;
    }
  }
//  sberrs.m:8
  public static builtin.Comparison_result_0 __Compare____errors_0_0(
    list.List_1 HeadVar__2_2,
    list.List_1 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[8]);
      list.List_1 Cast_HeadVar1_4 = HeadVar__2_2;
      list.List_1 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____errors_0_0(
    list.List_1 HeadVar__1_1,
    list.List_1 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[8]);
      list.List_1 Cast_HeadVar1_3 = HeadVar__1_1;
      list.List_1 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  sberrs.m:9
  public static builtin.Comparison_result_0 __Compare____error_0_0(
    sberrs.Error_0 HeadVar__2_2,
    sberrs.Error_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_171 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_172 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_171 == CastY_172);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        {
          int V_4_4 = 0;
          int V_5_5 = 0;

          {
            V_4_4 = sberrs.__Index____error_0_0(HeadVar__2_2);
          }
          {
            V_5_5 = sberrs.__Index____error_0_0(HeadVar__3_3);
          }
          succeeded = (V_4_4 < V_5_5);
          if (succeeded)
            HeadVar__1_1 = builtin.Comparison_result_0.K1;
          else
            {
              succeeded = (V_4_4 > V_5_5);
              if (succeeded)
                HeadVar__1_1 = builtin.Comparison_result_0.K2;
              else
                {
                  builtin.Comparison_result_0 V_6_6 = null;

                  switch (HeadVar__2_2.data_tag) {
                    case 0:
                      {
                        V_6_6 = builtin.Comparison_result_0.K0;
                        succeeded = true;
                      }
                      break;
                    case 1:
                      {
                        V_6_6 = builtin.Comparison_result_0.K0;
                        succeeded = true;
                      }
                      break;
                    case 2:
                      {
                        V_6_6 = builtin.Comparison_result_0.K0;
                        succeeded = true;
                      }
                      break;
                    case 3:
                      {
                        V_6_6 = builtin.Comparison_result_0.K0;
                        succeeded = true;
                      }
                      break;
                    case 4:
                      {
                        V_6_6 = builtin.Comparison_result_0.K0;
                        succeeded = true;
                      }
                      break;
                    case 5:
                      {
                        V_6_6 = builtin.Comparison_result_0.K0;
                        succeeded = true;
                      }
                      break;
                    case 6:
                      {
                        V_6_6 = builtin.Comparison_result_0.K0;
                        succeeded = true;
                      }
                      break;
                    case 7:
                      {
                        java.lang.String V_7_7 = ((sberrs.Error_0.Getopt_1) HeadVar__2_2).F1;
                        java.lang.String V_8_8 = null;

                        succeeded = (HeadVar__3_3.data_tag == 7);
                        if (succeeded)
                          {
                            V_8_8 = ((sberrs.Error_0.Getopt_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_7_7, V_8_8);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 8:
                      {
                        java.lang.String V_9_9 = ((sberrs.Error_0.Io_1) HeadVar__2_2).F1;
                        java.lang.String V_10_10 = null;

                        succeeded = (HeadVar__3_3.data_tag == 8);
                        if (succeeded)
                          {
                            V_10_10 = ((sberrs.Error_0.Io_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_9_9, V_10_10);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 9:
                      {
                        jmercury.runtime.TypeInfo_Struct TypeInfo_175_175 = null;
                        list.List_1 V_11_11 = ((sberrs.Error_0.Xml_1) HeadVar__2_2).F1;
                        list.List_1 V_12_12 = null;

                        succeeded = (HeadVar__3_3.data_tag == 9);
                        if (succeeded)
                          {
                            V_12_12 = ((sberrs.Error_0.Xml_1) HeadVar__3_3).F1;
                            TypeInfo_175_175 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[1]);
                            {
                              V_6_6 = builtin.compare_3_p_0(TypeInfo_175_175, ((java.lang.Object) (V_11_11)), ((java.lang.Object) (V_12_12)));
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 10:
                      {
                        java.lang.String V_13_13 = ((sberrs.Error_0.Unexpected_elem_4) HeadVar__2_2).F1;
                        java.lang.String V_14_14 = ((sberrs.Error_0.Unexpected_elem_4) HeadVar__2_2).F2;
                        list.List_1 V_15_15 = ((sberrs.Error_0.Unexpected_elem_4) HeadVar__2_2).F3;
                        list.List_1 V_16_16 = ((sberrs.Error_0.Unexpected_elem_4) HeadVar__2_2).F4;
                        java.lang.String V_17_17 = null;
                        java.lang.String V_18_18 = null;
                        list.List_1 V_19_19 = null;
                        list.List_1 V_20_20 = null;
                        builtin.Comparison_result_0 V_21_21 = null;

                        succeeded = (HeadVar__3_3.data_tag == 10);
                        if (succeeded)
                          {
                            V_17_17 = ((sberrs.Error_0.Unexpected_elem_4) HeadVar__3_3).F1;
                            V_18_18 = ((sberrs.Error_0.Unexpected_elem_4) HeadVar__3_3).F2;
                            V_19_19 = ((sberrs.Error_0.Unexpected_elem_4) HeadVar__3_3).F3;
                            V_20_20 = ((sberrs.Error_0.Unexpected_elem_4) HeadVar__3_3).F4;
                            {
                              V_21_21 = private_builtin.builtin_compare_string_3_p_0(V_13_13, V_17_17);
                            }
                            succeeded = (V_21_21.MR_value == builtin.Comparison_result_0.K0.MR_value);
                            succeeded = !(succeeded);
                            if (succeeded)
                              V_6_6 = V_21_21;
                            else
                              {
                                builtin.Comparison_result_0 V_22_22 = null;

                                {
                                  V_22_22 = private_builtin.builtin_compare_string_3_p_0(V_14_14, V_18_18);
                                }
                                succeeded = (V_22_22.MR_value == builtin.Comparison_result_0.K0.MR_value);
                                succeeded = !(succeeded);
                                if (succeeded)
                                  V_6_6 = V_22_22;
                                else
                                  {
                                    builtin.Comparison_result_0 V_23_23 = null;
                                    jmercury.runtime.TypeInfo_Struct TypeInfo_178_178 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[5]);

                                    {
                                      V_23_23 = builtin.compare_3_p_0(TypeInfo_178_178, ((java.lang.Object) (V_15_15)), ((java.lang.Object) (V_19_19)));
                                    }
                                    succeeded = (V_23_23.MR_value == builtin.Comparison_result_0.K0.MR_value);
                                    succeeded = !(succeeded);
                                    if (succeeded)
                                      V_6_6 = V_23_23;
                                    else
                                      {
                                        jmercury.runtime.TypeInfo_Struct TypeInfo_179_179 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[6]);

                                        {
                                          V_6_6 = builtin.compare_3_p_0(TypeInfo_179_179, ((java.lang.Object) (V_16_16)), ((java.lang.Object) (V_20_20)));
                                        }
                                      }
                                  }
                              }
                            succeeded = true;
                          }
                      }
                      break;
                    case 11:
                      {
                        java.lang.String V_24_24 = ((sberrs.Error_0.Unexpected_spec_2) HeadVar__2_2).F1;
                        xml.Spec_0 V_25_25 = ((sberrs.Error_0.Unexpected_spec_2) HeadVar__2_2).F2;
                        java.lang.String V_26_26 = null;
                        xml.Spec_0 V_27_27 = null;
                        builtin.Comparison_result_0 V_28_28 = null;

                        succeeded = (HeadVar__3_3.data_tag == 11);
                        if (succeeded)
                          {
                            V_26_26 = ((sberrs.Error_0.Unexpected_spec_2) HeadVar__3_3).F1;
                            V_27_27 = ((sberrs.Error_0.Unexpected_spec_2) HeadVar__3_3).F2;
                            {
                              V_28_28 = private_builtin.builtin_compare_string_3_p_0(V_24_24, V_26_26);
                            }
                            succeeded = (V_28_28.MR_value == builtin.Comparison_result_0.K0.MR_value);
                            succeeded = !(succeeded);
                            if (succeeded)
                              V_6_6 = V_28_28;
                            else
                              {
                                V_6_6 = xml.__Compare____spec_0_0(V_25_25, V_27_27);
                              }
                            succeeded = true;
                          }
                      }
                      break;
                    case 12:
                      {
                        java.lang.String V_29_29 = ((sberrs.Error_0.Expected_elem_1) HeadVar__2_2).F1;
                        java.lang.String V_30_30 = null;

                        succeeded = (HeadVar__3_3.data_tag == 12);
                        if (succeeded)
                          {
                            V_30_30 = ((sberrs.Error_0.Expected_elem_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_29_29, V_30_30);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 13:
                      {
                        java.lang.String V_31_31 = ((sberrs.Error_0.Io_2) HeadVar__2_2).F1;
                        int V_32_32 = ((sberrs.Error_0.Io_2) HeadVar__2_2).F2;
                        java.lang.String V_33_33 = null;
                        int V_34_34 = 0;
                        builtin.Comparison_result_0 V_35_35 = null;

                        succeeded = (HeadVar__3_3.data_tag == 13);
                        if (succeeded)
                          {
                            V_33_33 = ((sberrs.Error_0.Io_2) HeadVar__3_3).F1;
                            V_34_34 = ((sberrs.Error_0.Io_2) HeadVar__3_3).F2;
                            {
                              V_35_35 = private_builtin.builtin_compare_string_3_p_0(V_31_31, V_33_33);
                            }
                            succeeded = (V_35_35.MR_value == builtin.Comparison_result_0.K0.MR_value);
                            succeeded = !(succeeded);
                            if (succeeded)
                              V_6_6 = V_35_35;
                            else
                              {
                                V_6_6 = private_builtin.builtin_compare_int_3_p_0(V_32_32, V_34_34);
                              }
                            succeeded = true;
                          }
                      }
                      break;
                    case 14:
                      {
                        list.List_1 V_36_36 = ((sberrs.Error_0.Expected_attrs_4) HeadVar__2_2).F1;
                        java.lang.String V_37_37 = ((sberrs.Error_0.Expected_attrs_4) HeadVar__2_2).F2;
                        list.List_1 V_38_38 = ((sberrs.Error_0.Expected_attrs_4) HeadVar__2_2).F3;
                        list.List_1 V_39_39 = ((sberrs.Error_0.Expected_attrs_4) HeadVar__2_2).F4;
                        list.List_1 V_40_40 = null;
                        java.lang.String V_41_41 = null;
                        list.List_1 V_42_42 = null;
                        list.List_1 V_43_43 = null;
                        builtin.Comparison_result_0 V_44_44 = null;
                        jmercury.runtime.TypeInfo_Struct TypeInfo_185_185 = null;

                        succeeded = (HeadVar__3_3.data_tag == 14);
                        if (succeeded)
                          {
                            V_40_40 = ((sberrs.Error_0.Expected_attrs_4) HeadVar__3_3).F1;
                            V_41_41 = ((sberrs.Error_0.Expected_attrs_4) HeadVar__3_3).F2;
                            V_42_42 = ((sberrs.Error_0.Expected_attrs_4) HeadVar__3_3).F3;
                            V_43_43 = ((sberrs.Error_0.Expected_attrs_4) HeadVar__3_3).F4;
                            TypeInfo_185_185 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[1]);
                            {
                              V_44_44 = builtin.compare_3_p_0(TypeInfo_185_185, ((java.lang.Object) (V_36_36)), ((java.lang.Object) (V_40_40)));
                            }
                            succeeded = (V_44_44.MR_value == builtin.Comparison_result_0.K0.MR_value);
                            succeeded = !(succeeded);
                            if (succeeded)
                              V_6_6 = V_44_44;
                            else
                              {
                                builtin.Comparison_result_0 V_45_45 = null;

                                {
                                  V_45_45 = private_builtin.builtin_compare_string_3_p_0(V_37_37, V_41_41);
                                }
                                succeeded = (V_45_45.MR_value == builtin.Comparison_result_0.K0.MR_value);
                                succeeded = !(succeeded);
                                if (succeeded)
                                  V_6_6 = V_45_45;
                                else
                                  {
                                    builtin.Comparison_result_0 V_46_46 = null;
                                    jmercury.runtime.TypeInfo_Struct TypeInfo_187_187 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[5]);

                                    {
                                      V_46_46 = builtin.compare_3_p_0(TypeInfo_187_187, ((java.lang.Object) (V_38_38)), ((java.lang.Object) (V_42_42)));
                                    }
                                    succeeded = (V_46_46.MR_value == builtin.Comparison_result_0.K0.MR_value);
                                    succeeded = !(succeeded);
                                    if (succeeded)
                                      V_6_6 = V_46_46;
                                    else
                                      {
                                        jmercury.runtime.TypeInfo_Struct TypeInfo_188_188 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[6]);

                                        {
                                          V_6_6 = builtin.compare_3_p_0(TypeInfo_188_188, ((java.lang.Object) (V_39_39)), ((java.lang.Object) (V_43_43)));
                                        }
                                      }
                                  }
                              }
                            succeeded = true;
                          }
                      }
                      break;
                    case 15:
                      {
                        java.lang.String V_47_47 = ((sberrs.Error_0.Funny_triple_3) HeadVar__2_2).F1;
                        int V_48_48 = ((sberrs.Error_0.Funny_triple_3) HeadVar__2_2).F2;
                        java.lang.String V_49_49 = ((sberrs.Error_0.Funny_triple_3) HeadVar__2_2).F3;
                        java.lang.String V_50_50 = null;
                        int V_51_51 = 0;
                        java.lang.String V_52_52 = null;
                        builtin.Comparison_result_0 V_53_53 = null;

                        succeeded = (HeadVar__3_3.data_tag == 15);
                        if (succeeded)
                          {
                            V_50_50 = ((sberrs.Error_0.Funny_triple_3) HeadVar__3_3).F1;
                            V_51_51 = ((sberrs.Error_0.Funny_triple_3) HeadVar__3_3).F2;
                            V_52_52 = ((sberrs.Error_0.Funny_triple_3) HeadVar__3_3).F3;
                            {
                              V_53_53 = private_builtin.builtin_compare_string_3_p_0(V_47_47, V_50_50);
                            }
                            succeeded = (V_53_53.MR_value == builtin.Comparison_result_0.K0.MR_value);
                            succeeded = !(succeeded);
                            if (succeeded)
                              V_6_6 = V_53_53;
                            else
                              {
                                builtin.Comparison_result_0 V_54_54 = null;

                                {
                                  V_54_54 = private_builtin.builtin_compare_int_3_p_0(V_48_48, V_51_51);
                                }
                                succeeded = (V_54_54.MR_value == builtin.Comparison_result_0.K0.MR_value);
                                succeeded = !(succeeded);
                                if (succeeded)
                                  V_6_6 = V_54_54;
                                else
                                  {
                                    V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_49_49, V_52_52);
                                  }
                              }
                            succeeded = true;
                          }
                      }
                      break;
                    case 16:
                      {
                        int V_55_55 = ((sberrs.Error_0.Funny_triple_2) HeadVar__2_2).F1;
                        java.lang.String V_56_56 = ((sberrs.Error_0.Funny_triple_2) HeadVar__2_2).F2;
                        int V_57_57 = 0;
                        java.lang.String V_58_58 = null;
                        builtin.Comparison_result_0 V_59_59 = null;

                        succeeded = (HeadVar__3_3.data_tag == 16);
                        if (succeeded)
                          {
                            V_57_57 = ((sberrs.Error_0.Funny_triple_2) HeadVar__3_3).F1;
                            V_58_58 = ((sberrs.Error_0.Funny_triple_2) HeadVar__3_3).F2;
                            {
                              V_59_59 = private_builtin.builtin_compare_int_3_p_0(V_55_55, V_57_57);
                            }
                            succeeded = (V_59_59.MR_value == builtin.Comparison_result_0.K0.MR_value);
                            succeeded = !(succeeded);
                            if (succeeded)
                              V_6_6 = V_59_59;
                            else
                              {
                                V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_56_56, V_58_58);
                              }
                            succeeded = true;
                          }
                      }
                      break;
                    case 17:
                      {
                        int V_60_60 = ((sberrs.Error_0.Unknown_id_2) HeadVar__2_2).F1;
                        int V_61_61 = ((sberrs.Error_0.Unknown_id_2) HeadVar__2_2).F2;
                        int V_62_62 = 0;
                        int V_63_63 = 0;
                        builtin.Comparison_result_0 V_64_64 = null;

                        succeeded = (HeadVar__3_3.data_tag == 17);
                        if (succeeded)
                          {
                            V_62_62 = ((sberrs.Error_0.Unknown_id_2) HeadVar__3_3).F1;
                            V_63_63 = ((sberrs.Error_0.Unknown_id_2) HeadVar__3_3).F2;
                            {
                              V_64_64 = private_builtin.builtin_compare_int_3_p_0(V_60_60, V_62_62);
                            }
                            succeeded = (V_64_64.MR_value == builtin.Comparison_result_0.K0.MR_value);
                            succeeded = !(succeeded);
                            if (succeeded)
                              V_6_6 = V_64_64;
                            else
                              {
                                V_6_6 = private_builtin.builtin_compare_int_3_p_0(V_61_61, V_63_63);
                              }
                            succeeded = true;
                          }
                      }
                      break;
                    case 18:
                      {
                        int V_65_65 = ((sberrs.Error_0.Funny_nested_3) HeadVar__2_2).F1;
                        int V_66_66 = ((sberrs.Error_0.Funny_nested_3) HeadVar__2_2).F2;
                        java.lang.String V_67_67 = ((sberrs.Error_0.Funny_nested_3) HeadVar__2_2).F3;
                        int V_68_68 = 0;
                        int V_69_69 = 0;
                        java.lang.String V_70_70 = null;
                        builtin.Comparison_result_0 V_71_71 = null;

                        succeeded = (HeadVar__3_3.data_tag == 18);
                        if (succeeded)
                          {
                            V_68_68 = ((sberrs.Error_0.Funny_nested_3) HeadVar__3_3).F1;
                            V_69_69 = ((sberrs.Error_0.Funny_nested_3) HeadVar__3_3).F2;
                            V_70_70 = ((sberrs.Error_0.Funny_nested_3) HeadVar__3_3).F3;
                            {
                              V_71_71 = private_builtin.builtin_compare_int_3_p_0(V_65_65, V_68_68);
                            }
                            succeeded = (V_71_71.MR_value == builtin.Comparison_result_0.K0.MR_value);
                            succeeded = !(succeeded);
                            if (succeeded)
                              V_6_6 = V_71_71;
                            else
                              {
                                builtin.Comparison_result_0 V_72_72 = null;

                                {
                                  V_72_72 = private_builtin.builtin_compare_int_3_p_0(V_66_66, V_69_69);
                                }
                                succeeded = (V_72_72.MR_value == builtin.Comparison_result_0.K0.MR_value);
                                succeeded = !(succeeded);
                                if (succeeded)
                                  V_6_6 = V_72_72;
                                else
                                  {
                                    V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_67_67, V_70_70);
                                  }
                              }
                            succeeded = true;
                          }
                      }
                      break;
                    case 19:
                      {
                        java.lang.String V_73_73 = ((sberrs.Error_0.Funny_strnode_1) HeadVar__2_2).F1;
                        java.lang.String V_74_74 = null;

                        succeeded = (HeadVar__3_3.data_tag == 19);
                        if (succeeded)
                          {
                            V_74_74 = ((sberrs.Error_0.Funny_strnode_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_73_73, V_74_74);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 20:
                      {
                        java.lang.String V_75_75 = ((sberrs.Error_0.Funny_concept_1) HeadVar__2_2).F1;
                        java.lang.String V_76_76 = null;

                        succeeded = (HeadVar__3_3.data_tag == 20);
                        if (succeeded)
                          {
                            V_76_76 = ((sberrs.Error_0.Funny_concept_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_75_75, V_76_76);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 21:
                      {
                        int V_77_77 = ((sberrs.Error_0.Missing_vardef_1) HeadVar__2_2).F1;
                        int V_78_78 = 0;

                        succeeded = (HeadVar__3_3.data_tag == 21);
                        if (succeeded)
                          {
                            V_78_78 = ((sberrs.Error_0.Missing_vardef_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_int_3_p_0(V_77_77, V_78_78);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 22:
                      {
                        java.lang.String V_79_79 = ((sberrs.Error_0.Funny_attr_2) HeadVar__2_2).F1;
                        java.lang.String V_80_80 = ((sberrs.Error_0.Funny_attr_2) HeadVar__2_2).F2;
                        java.lang.String V_81_81 = null;
                        java.lang.String V_82_82 = null;
                        builtin.Comparison_result_0 V_83_83 = null;

                        succeeded = (HeadVar__3_3.data_tag == 22);
                        if (succeeded)
                          {
                            V_81_81 = ((sberrs.Error_0.Funny_attr_2) HeadVar__3_3).F1;
                            V_82_82 = ((sberrs.Error_0.Funny_attr_2) HeadVar__3_3).F2;
                            {
                              V_83_83 = private_builtin.builtin_compare_string_3_p_0(V_79_79, V_81_81);
                            }
                            succeeded = (V_83_83.MR_value == builtin.Comparison_result_0.K0.MR_value);
                            succeeded = !(succeeded);
                            if (succeeded)
                              V_6_6 = V_83_83;
                            else
                              {
                                V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_80_80, V_82_82);
                              }
                            succeeded = true;
                          }
                      }
                      break;
                    case 23:
                      {
                        java.lang.String V_84_84 = ((sberrs.Error_0.Funny_pred_param_1) HeadVar__2_2).F1;
                        java.lang.String V_85_85 = null;

                        succeeded = (HeadVar__3_3.data_tag == 23);
                        if (succeeded)
                          {
                            V_85_85 = ((sberrs.Error_0.Funny_pred_param_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_84_84, V_85_85);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 24:
                      {
                        int V_86_86 = ((sberrs.Error_0.Dupl_vardef_1) HeadVar__2_2).F1;
                        int V_87_87 = 0;

                        succeeded = (HeadVar__3_3.data_tag == 24);
                        if (succeeded)
                          {
                            V_87_87 = ((sberrs.Error_0.Dupl_vardef_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_int_3_p_0(V_86_86, V_87_87);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 25:
                      {
                        java.lang.String V_88_88 = ((sberrs.Error_0.Dupl_ref_attrs_2) HeadVar__2_2).F1;
                        list.List_1 V_89_89 = ((sberrs.Error_0.Dupl_ref_attrs_2) HeadVar__2_2).F2;
                        java.lang.String V_90_90 = null;
                        list.List_1 V_91_91 = null;
                        builtin.Comparison_result_0 V_92_92 = null;

                        succeeded = (HeadVar__3_3.data_tag == 25);
                        if (succeeded)
                          {
                            V_90_90 = ((sberrs.Error_0.Dupl_ref_attrs_2) HeadVar__3_3).F1;
                            V_91_91 = ((sberrs.Error_0.Dupl_ref_attrs_2) HeadVar__3_3).F2;
                            {
                              V_92_92 = private_builtin.builtin_compare_string_3_p_0(V_88_88, V_90_90);
                            }
                            succeeded = (V_92_92.MR_value == builtin.Comparison_result_0.K0.MR_value);
                            succeeded = !(succeeded);
                            if (succeeded)
                              V_6_6 = V_92_92;
                            else
                              {
                                jmercury.runtime.TypeInfo_Struct TypeInfo_207_207 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[7]);

                                {
                                  V_6_6 = builtin.compare_3_p_0(TypeInfo_207_207, ((java.lang.Object) (V_89_89)), ((java.lang.Object) (V_91_91)));
                                }
                              }
                            succeeded = true;
                          }
                      }
                      break;
                    case 26:
                      {
                        java.lang.String V_93_93 = ((sberrs.Error_0.Funny_tconst_1) HeadVar__2_2).F1;
                        java.lang.String V_94_94 = null;

                        succeeded = (HeadVar__3_3.data_tag == 26);
                        if (succeeded)
                          {
                            V_94_94 = ((sberrs.Error_0.Funny_tconst_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_93_93, V_94_94);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 27:
                      {
                        java.lang.String V_95_95 = ((sberrs.Error_0.Pred_coref_1) HeadVar__2_2).F1;
                        java.lang.String V_96_96 = null;

                        succeeded = (HeadVar__3_3.data_tag == 27);
                        if (succeeded)
                          {
                            V_96_96 = ((sberrs.Error_0.Pred_coref_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_95_95, V_96_96);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 28:
                      {
                        java.lang.String V_97_97 = ((sberrs.Error_0.Coref_self_cycle_1) HeadVar__2_2).F1;
                        java.lang.String V_98_98 = null;

                        succeeded = (HeadVar__3_3.data_tag == 28);
                        if (succeeded)
                          {
                            V_98_98 = ((sberrs.Error_0.Coref_self_cycle_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_97_97, V_98_98);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 29:
                      {
                        int V_99_99 = ((sberrs.Error_0.Dupl_var_2) HeadVar__2_2).F1;
                        int V_100_100 = ((sberrs.Error_0.Dupl_var_2) HeadVar__2_2).F2;
                        int V_101_101 = 0;
                        int V_102_102 = 0;
                        builtin.Comparison_result_0 V_103_103 = null;

                        succeeded = (HeadVar__3_3.data_tag == 29);
                        if (succeeded)
                          {
                            V_101_101 = ((sberrs.Error_0.Dupl_var_2) HeadVar__3_3).F1;
                            V_102_102 = ((sberrs.Error_0.Dupl_var_2) HeadVar__3_3).F2;
                            {
                              V_103_103 = private_builtin.builtin_compare_int_3_p_0(V_99_99, V_101_101);
                            }
                            succeeded = (V_103_103.MR_value == builtin.Comparison_result_0.K0.MR_value);
                            succeeded = !(succeeded);
                            if (succeeded)
                              V_6_6 = V_103_103;
                            else
                              {
                                V_6_6 = private_builtin.builtin_compare_int_3_p_0(V_100_100, V_102_102);
                              }
                            succeeded = true;
                          }
                      }
                      break;
                    case 30:
                      {
                        java.lang.String V_104_104 = ((sberrs.Error_0.Wordnet_1) HeadVar__2_2).F1;
                        java.lang.String V_105_105 = null;

                        succeeded = (HeadVar__3_3.data_tag == 30);
                        if (succeeded)
                          {
                            V_105_105 = ((sberrs.Error_0.Wordnet_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_104_104, V_105_105);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 31:
                      {
                        int V_106_106 = ((sberrs.Error_0.Triple_cycle_1) HeadVar__2_2).F1;
                        int V_107_107 = 0;

                        succeeded = (HeadVar__3_3.data_tag == 31);
                        if (succeeded)
                          {
                            V_107_107 = ((sberrs.Error_0.Triple_cycle_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_int_3_p_0(V_106_106, V_107_107);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 32:
                      {
                        java.lang.String V_108_108 = ((sberrs.Error_0.Funny_pred_1) HeadVar__2_2).F1;
                        java.lang.String V_109_109 = null;

                        succeeded = (HeadVar__3_3.data_tag == 32);
                        if (succeeded)
                          {
                            V_109_109 = ((sberrs.Error_0.Funny_pred_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_108_108, V_109_109);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 33:
                      {
                        java.lang.String V_110_110 = ((sberrs.Error_0.Multiple_links_3) HeadVar__2_2).F1;
                        java.lang.String V_111_111 = ((sberrs.Error_0.Multiple_links_3) HeadVar__2_2).F2;
                        int V_112_112 = ((sberrs.Error_0.Multiple_links_3) HeadVar__2_2).F3;
                        java.lang.String V_113_113 = null;
                        java.lang.String V_114_114 = null;
                        int V_115_115 = 0;
                        builtin.Comparison_result_0 V_116_116 = null;

                        succeeded = (HeadVar__3_3.data_tag == 33);
                        if (succeeded)
                          {
                            V_113_113 = ((sberrs.Error_0.Multiple_links_3) HeadVar__3_3).F1;
                            V_114_114 = ((sberrs.Error_0.Multiple_links_3) HeadVar__3_3).F2;
                            V_115_115 = ((sberrs.Error_0.Multiple_links_3) HeadVar__3_3).F3;
                            {
                              V_116_116 = private_builtin.builtin_compare_string_3_p_0(V_110_110, V_113_113);
                            }
                            succeeded = (V_116_116.MR_value == builtin.Comparison_result_0.K0.MR_value);
                            succeeded = !(succeeded);
                            if (succeeded)
                              V_6_6 = V_116_116;
                            else
                              {
                                builtin.Comparison_result_0 V_117_117 = null;

                                {
                                  V_117_117 = private_builtin.builtin_compare_string_3_p_0(V_111_111, V_114_114);
                                }
                                succeeded = (V_117_117.MR_value == builtin.Comparison_result_0.K0.MR_value);
                                succeeded = !(succeeded);
                                if (succeeded)
                                  V_6_6 = V_117_117;
                                else
                                  {
                                    V_6_6 = private_builtin.builtin_compare_int_3_p_0(V_112_112, V_115_115);
                                  }
                              }
                            succeeded = true;
                          }
                      }
                      break;
                    case 34:
                      {
                        java.lang.String V_118_118 = ((sberrs.Error_0.Funny_mod_obj_sc_2) HeadVar__2_2).F1;
                        int V_119_119 = ((sberrs.Error_0.Funny_mod_obj_sc_2) HeadVar__2_2).F2;
                        java.lang.String V_120_120 = null;
                        int V_121_121 = 0;
                        builtin.Comparison_result_0 V_122_122 = null;

                        succeeded = (HeadVar__3_3.data_tag == 34);
                        if (succeeded)
                          {
                            V_120_120 = ((sberrs.Error_0.Funny_mod_obj_sc_2) HeadVar__3_3).F1;
                            V_121_121 = ((sberrs.Error_0.Funny_mod_obj_sc_2) HeadVar__3_3).F2;
                            {
                              V_122_122 = private_builtin.builtin_compare_string_3_p_0(V_118_118, V_120_120);
                            }
                            succeeded = (V_122_122.MR_value == builtin.Comparison_result_0.K0.MR_value);
                            succeeded = !(succeeded);
                            if (succeeded)
                              V_6_6 = V_122_122;
                            else
                              {
                                V_6_6 = private_builtin.builtin_compare_int_3_p_0(V_119_119, V_121_121);
                              }
                            succeeded = true;
                          }
                      }
                      break;
                    case 35:
                      {
                        java.lang.String V_123_123 = ((sberrs.Error_0.Funny_mod_obj_s_1) HeadVar__2_2).F1;
                        java.lang.String V_124_124 = null;

                        succeeded = (HeadVar__3_3.data_tag == 35);
                        if (succeeded)
                          {
                            V_124_124 = ((sberrs.Error_0.Funny_mod_obj_s_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_123_123, V_124_124);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 36:
                      {
                        int V_125_125 = ((sberrs.Error_0.Funny_mod_obj_c_1) HeadVar__2_2).F1;
                        int V_126_126 = 0;

                        succeeded = (HeadVar__3_3.data_tag == 36);
                        if (succeeded)
                          {
                            V_126_126 = ((sberrs.Error_0.Funny_mod_obj_c_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_int_3_p_0(V_125_125, V_126_126);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 37:
                      {
                        java.lang.String V_127_127 = ((sberrs.Error_0.Unexp_predtp_1) HeadVar__2_2).F1;
                        java.lang.String V_128_128 = null;

                        succeeded = (HeadVar__3_3.data_tag == 37);
                        if (succeeded)
                          {
                            V_128_128 = ((sberrs.Error_0.Unexp_predtp_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_127_127, V_128_128);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 38:
                      {
                        java.lang.String V_129_129 = ((sberrs.Error_0.Funny_str_3) HeadVar__2_2).F1;
                        java.lang.String V_130_130 = ((sberrs.Error_0.Funny_str_3) HeadVar__2_2).F2;
                        java.lang.String V_131_131 = ((sberrs.Error_0.Funny_str_3) HeadVar__2_2).F3;
                        java.lang.String V_132_132 = null;
                        java.lang.String V_133_133 = null;
                        java.lang.String V_134_134 = null;
                        builtin.Comparison_result_0 V_135_135 = null;

                        succeeded = (HeadVar__3_3.data_tag == 38);
                        if (succeeded)
                          {
                            V_132_132 = ((sberrs.Error_0.Funny_str_3) HeadVar__3_3).F1;
                            V_133_133 = ((sberrs.Error_0.Funny_str_3) HeadVar__3_3).F2;
                            V_134_134 = ((sberrs.Error_0.Funny_str_3) HeadVar__3_3).F3;
                            {
                              V_135_135 = private_builtin.builtin_compare_string_3_p_0(V_129_129, V_132_132);
                            }
                            succeeded = (V_135_135.MR_value == builtin.Comparison_result_0.K0.MR_value);
                            succeeded = !(succeeded);
                            if (succeeded)
                              V_6_6 = V_135_135;
                            else
                              {
                                builtin.Comparison_result_0 V_136_136 = null;

                                {
                                  V_136_136 = private_builtin.builtin_compare_string_3_p_0(V_130_130, V_133_133);
                                }
                                succeeded = (V_136_136.MR_value == builtin.Comparison_result_0.K0.MR_value);
                                succeeded = !(succeeded);
                                if (succeeded)
                                  V_6_6 = V_136_136;
                                else
                                  {
                                    V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_131_131, V_134_134);
                                  }
                              }
                            succeeded = true;
                          }
                      }
                      break;
                    case 39:
                      {
                        int V_137_137 = ((sberrs.Error_0.Dupl_ent_id_1) HeadVar__2_2).F1;
                        int V_138_138 = 0;

                        succeeded = (HeadVar__3_3.data_tag == 39);
                        if (succeeded)
                          {
                            V_138_138 = ((sberrs.Error_0.Dupl_ent_id_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_int_3_p_0(V_137_137, V_138_138);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 40:
                      {
                        java.lang.String V_139_139 = ((sberrs.Error_0.Funny_ent_tp_1) HeadVar__2_2).F1;
                        java.lang.String V_140_140 = null;

                        succeeded = (HeadVar__3_3.data_tag == 40);
                        if (succeeded)
                          {
                            V_140_140 = ((sberrs.Error_0.Funny_ent_tp_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_139_139, V_140_140);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 41:
                      {
                        java.lang.String V_141_141 = ((sberrs.Error_0.Funny_ne_tp_1) HeadVar__2_2).F1;
                        java.lang.String V_142_142 = null;

                        succeeded = (HeadVar__3_3.data_tag == 41);
                        if (succeeded)
                          {
                            V_142_142 = ((sberrs.Error_0.Funny_ne_tp_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_141_141, V_142_142);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 42:
                      {
                        java.lang.String V_143_143 = ((sberrs.Error_0.Funny_pos_1) HeadVar__2_2).F1;
                        java.lang.String V_144_144 = null;

                        succeeded = (HeadVar__3_3.data_tag == 42);
                        if (succeeded)
                          {
                            V_144_144 = ((sberrs.Error_0.Funny_pos_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_143_143, V_144_144);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 43:
                      {
                        java.lang.String V_145_145 = ((sberrs.Error_0.Funny_semrel_1) HeadVar__2_2).F1;
                        java.lang.String V_146_146 = null;

                        succeeded = (HeadVar__3_3.data_tag == 43);
                        if (succeeded)
                          {
                            V_146_146 = ((sberrs.Error_0.Funny_semrel_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_145_145, V_146_146);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 44:
                      {
                        jmercury.runtime.TypeInfo_Struct TypeInfo_232_232 = null;
                        list.List_1 V_147_147 = ((sberrs.Error_0.Funny_coref_1) HeadVar__2_2).F1;
                        list.List_1 V_148_148 = null;

                        succeeded = (HeadVar__3_3.data_tag == 44);
                        if (succeeded)
                          {
                            V_148_148 = ((sberrs.Error_0.Funny_coref_1) HeadVar__3_3).F1;
                            TypeInfo_232_232 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[3]);
                            {
                              V_6_6 = builtin.compare_3_p_0(TypeInfo_232_232, ((java.lang.Object) (V_147_147)), ((java.lang.Object) (V_148_148)));
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 45:
                      {
                        jmercury.runtime.TypeInfo_Struct TypeInfo_233_233 = null;
                        pair.Pair_2 V_149_149 = ((sberrs.Error_0.Dupl_coref_1) HeadVar__2_2).F1;
                        pair.Pair_2 V_150_150 = null;

                        succeeded = (HeadVar__3_3.data_tag == 45);
                        if (succeeded)
                          {
                            V_150_150 = ((sberrs.Error_0.Dupl_coref_1) HeadVar__3_3).F1;
                            TypeInfo_233_233 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[2]);
                            {
                              V_6_6 = builtin.compare_3_p_0(TypeInfo_233_233, ((java.lang.Object) (V_149_149)), ((java.lang.Object) (V_150_150)));
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 46:
                      {
                        java.lang.String V_151_151 = ((sberrs.Error_0.Funny_anno_body_1) HeadVar__2_2).F1;
                        java.lang.String V_152_152 = null;

                        succeeded = (HeadVar__3_3.data_tag == 46);
                        if (succeeded)
                          {
                            V_152_152 = ((sberrs.Error_0.Funny_anno_body_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_151_151, V_152_152);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 47:
                      {
                        java.lang.String V_153_153 = ((sberrs.Error_0.Funny_post_elem_1) HeadVar__2_2).F1;
                        java.lang.String V_154_154 = null;

                        succeeded = (HeadVar__3_3.data_tag == 47);
                        if (succeeded)
                          {
                            V_154_154 = ((sberrs.Error_0.Funny_post_elem_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_153_153, V_154_154);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 48:
                      {
                        java.lang.String V_155_155 = ((sberrs.Error_0.Funny_post_attrs_1) HeadVar__2_2).F1;
                        java.lang.String V_156_156 = null;

                        succeeded = (HeadVar__3_3.data_tag == 48);
                        if (succeeded)
                          {
                            V_156_156 = ((sberrs.Error_0.Funny_post_attrs_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_155_155, V_156_156);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 49:
                      {
                        java.lang.String V_157_157 = ((sberrs.Error_0.Funny_anno_word_3) HeadVar__2_2).F1;
                        java.lang.String V_158_158 = ((sberrs.Error_0.Funny_anno_word_3) HeadVar__2_2).F2;
                        int V_159_159 = ((sberrs.Error_0.Funny_anno_word_3) HeadVar__2_2).F3;
                        java.lang.String V_160_160 = null;
                        java.lang.String V_161_161 = null;
                        int V_162_162 = 0;
                        builtin.Comparison_result_0 V_163_163 = null;

                        succeeded = (HeadVar__3_3.data_tag == 49);
                        if (succeeded)
                          {
                            V_160_160 = ((sberrs.Error_0.Funny_anno_word_3) HeadVar__3_3).F1;
                            V_161_161 = ((sberrs.Error_0.Funny_anno_word_3) HeadVar__3_3).F2;
                            V_162_162 = ((sberrs.Error_0.Funny_anno_word_3) HeadVar__3_3).F3;
                            {
                              V_163_163 = private_builtin.builtin_compare_string_3_p_0(V_157_157, V_160_160);
                            }
                            succeeded = (V_163_163.MR_value == builtin.Comparison_result_0.K0.MR_value);
                            succeeded = !(succeeded);
                            if (succeeded)
                              V_6_6 = V_163_163;
                            else
                              {
                                builtin.Comparison_result_0 V_164_164 = null;

                                {
                                  V_164_164 = private_builtin.builtin_compare_string_3_p_0(V_158_158, V_161_161);
                                }
                                succeeded = (V_164_164.MR_value == builtin.Comparison_result_0.K0.MR_value);
                                succeeded = !(succeeded);
                                if (succeeded)
                                  V_6_6 = V_164_164;
                                else
                                  {
                                    V_6_6 = private_builtin.builtin_compare_int_3_p_0(V_159_159, V_162_162);
                                  }
                              }
                            succeeded = true;
                          }
                      }
                      break;
                    case 50:
                      {
                        java.lang.String V_165_165 = ((sberrs.Error_0.Anno_out_of_order_1) HeadVar__2_2).F1;
                        java.lang.String V_166_166 = null;

                        succeeded = (HeadVar__3_3.data_tag == 50);
                        if (succeeded)
                          {
                            V_166_166 = ((sberrs.Error_0.Anno_out_of_order_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_165_165, V_166_166);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 51:
                      {
                        java.lang.String V_167_167 = ((sberrs.Error_0.Funny_t2t_elem_1) HeadVar__2_2).F1;
                        java.lang.String V_168_168 = null;

                        succeeded = (HeadVar__3_3.data_tag == 51);
                        if (succeeded)
                          {
                            V_168_168 = ((sberrs.Error_0.Funny_t2t_elem_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_167_167, V_168_168);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    case 52:
                      {
                        java.lang.String V_169_169 = ((sberrs.Error_0.T2t_spec_1) HeadVar__2_2).F1;
                        java.lang.String V_170_170 = null;

                        succeeded = (HeadVar__3_3.data_tag == 52);
                        if (succeeded)
                          {
                            V_170_170 = ((sberrs.Error_0.T2t_spec_1) HeadVar__3_3).F1;
                            {
                              V_6_6 = private_builtin.builtin_compare_string_3_p_0(V_169_169, V_170_170);
                            }
                            succeeded = true;
                          }
                      }
                      break;
                    default: /*NOTREACHED*/
                      throw new jmercury.runtime.UnreachableDefault();
                  }
                  if (succeeded)
                    HeadVar__1_1 = V_6_6;
                  else
                    {
                      private_builtin.compare_error_0_p_0();
                    }
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static int __Index____error_0_0(
    sberrs.Error_0 HeadVar__1_1)
  {
    {
      boolean succeeded = false;
      int HeadVar__2_2 = 0;

      switch (HeadVar__1_1.data_tag) {
        case 0:
          HeadVar__2_2 = 13;
          break;
        case 1:
          HeadVar__2_2 = 14;
          break;
        case 2:
          HeadVar__2_2 = 22;
          break;
        case 3:
          HeadVar__2_2 = 42;
          break;
        case 4:
          HeadVar__2_2 = 43;
          break;
        case 5:
          HeadVar__2_2 = 45;
          break;
        case 6:
          HeadVar__2_2 = 46;
          break;
        case 7:
          HeadVar__2_2 = 0;
          break;
        case 8:
          HeadVar__2_2 = 1;
          break;
        case 9:
          HeadVar__2_2 = 2;
          break;
        case 10:
          HeadVar__2_2 = 3;
          break;
        case 11:
          HeadVar__2_2 = 4;
          break;
        case 12:
          HeadVar__2_2 = 5;
          break;
        case 13:
          HeadVar__2_2 = 6;
          break;
        case 14:
          HeadVar__2_2 = 7;
          break;
        case 15:
          HeadVar__2_2 = 8;
          break;
        case 16:
          HeadVar__2_2 = 9;
          break;
        case 17:
          HeadVar__2_2 = 10;
          break;
        case 18:
          HeadVar__2_2 = 11;
          break;
        case 19:
          HeadVar__2_2 = 12;
          break;
        case 20:
          HeadVar__2_2 = 15;
          break;
        case 21:
          HeadVar__2_2 = 16;
          break;
        case 22:
          HeadVar__2_2 = 17;
          break;
        case 23:
          HeadVar__2_2 = 18;
          break;
        case 24:
          HeadVar__2_2 = 19;
          break;
        case 25:
          HeadVar__2_2 = 20;
          break;
        case 26:
          HeadVar__2_2 = 21;
          break;
        case 27:
          HeadVar__2_2 = 23;
          break;
        case 28:
          HeadVar__2_2 = 24;
          break;
        case 29:
          HeadVar__2_2 = 25;
          break;
        case 30:
          HeadVar__2_2 = 26;
          break;
        case 31:
          HeadVar__2_2 = 27;
          break;
        case 32:
          HeadVar__2_2 = 28;
          break;
        case 33:
          HeadVar__2_2 = 29;
          break;
        case 34:
          HeadVar__2_2 = 30;
          break;
        case 35:
          HeadVar__2_2 = 31;
          break;
        case 36:
          HeadVar__2_2 = 32;
          break;
        case 37:
          HeadVar__2_2 = 33;
          break;
        case 38:
          HeadVar__2_2 = 34;
          break;
        case 39:
          HeadVar__2_2 = 35;
          break;
        case 40:
          HeadVar__2_2 = 36;
          break;
        case 41:
          HeadVar__2_2 = 37;
          break;
        case 42:
          HeadVar__2_2 = 38;
          break;
        case 43:
          HeadVar__2_2 = 39;
          break;
        case 44:
          HeadVar__2_2 = 40;
          break;
        case 45:
          HeadVar__2_2 = 41;
          break;
        case 46:
          HeadVar__2_2 = 44;
          break;
        case 47:
          HeadVar__2_2 = 47;
          break;
        case 48:
          HeadVar__2_2 = 48;
          break;
        case 49:
          HeadVar__2_2 = 49;
          break;
        case 50:
          HeadVar__2_2 = 50;
          break;
        case 51:
          HeadVar__2_2 = 51;
          break;
        case 52:
          HeadVar__2_2 = 52;
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
      return HeadVar__2_2;
    }
  }
  public static boolean __Unify____error_0_0(
    sberrs.Error_0 HeadVar__1_1,
    sberrs.Error_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_143 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_144 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_143 == CastY_144);
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
            succeeded = (HeadVar__2_2.data_tag == 4);
            break;
          case 5:
            succeeded = (HeadVar__2_2.data_tag == 5);
            break;
          case 6:
            succeeded = (HeadVar__2_2.data_tag == 6);
            break;
          case 7:
            {
              java.lang.String V_3_3 = ((sberrs.Error_0.Getopt_1) HeadVar__1_1).F1;
              java.lang.String V_4_4 = null;

              succeeded = (HeadVar__2_2.data_tag == 7);
              if (succeeded)
                {
                  V_4_4 = ((sberrs.Error_0.Getopt_1) HeadVar__2_2).F1;
                  succeeded = V_3_3.equals(V_4_4);
                }
            }
            break;
          case 8:
            {
              java.lang.String V_5_5 = ((sberrs.Error_0.Io_1) HeadVar__1_1).F1;
              java.lang.String V_6_6 = null;

              succeeded = (HeadVar__2_2.data_tag == 8);
              if (succeeded)
                {
                  V_6_6 = ((sberrs.Error_0.Io_1) HeadVar__2_2).F1;
                  succeeded = V_5_5.equals(V_6_6);
                }
            }
            break;
          case 9:
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_154_154 = null;
              list.List_1 V_7_7 = ((sberrs.Error_0.Xml_1) HeadVar__1_1).F1;
              list.List_1 V_8_8 = null;

              succeeded = (HeadVar__2_2.data_tag == 9);
              if (succeeded)
                {
                  V_8_8 = ((sberrs.Error_0.Xml_1) HeadVar__2_2).F1;
                  TypeInfo_154_154 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[1]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_154_154, ((java.lang.Object) (V_7_7)), ((java.lang.Object) (V_8_8)));
                  }
                }
            }
            break;
          case 10:
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_151_151 = null;
              jmercury.runtime.TypeInfo_Struct TypeInfo_152_152 = null;
              java.lang.String V_9_9 = ((sberrs.Error_0.Unexpected_elem_4) HeadVar__1_1).F1;
              java.lang.String V_10_10 = ((sberrs.Error_0.Unexpected_elem_4) HeadVar__1_1).F2;
              list.List_1 V_11_11 = ((sberrs.Error_0.Unexpected_elem_4) HeadVar__1_1).F3;
              list.List_1 V_12_12 = ((sberrs.Error_0.Unexpected_elem_4) HeadVar__1_1).F4;
              java.lang.String V_13_13 = null;
              java.lang.String V_14_14 = null;
              list.List_1 V_15_15 = null;
              list.List_1 V_16_16 = null;

              succeeded = (HeadVar__2_2.data_tag == 10);
              if (succeeded)
                {
                  V_13_13 = ((sberrs.Error_0.Unexpected_elem_4) HeadVar__2_2).F1;
                  V_14_14 = ((sberrs.Error_0.Unexpected_elem_4) HeadVar__2_2).F2;
                  V_15_15 = ((sberrs.Error_0.Unexpected_elem_4) HeadVar__2_2).F3;
                  V_16_16 = ((sberrs.Error_0.Unexpected_elem_4) HeadVar__2_2).F4;
                  succeeded = V_9_9.equals(V_13_13);
                  if (succeeded)
                    {
                      succeeded = V_10_10.equals(V_14_14);
                      if (succeeded)
                        {
                          TypeInfo_151_151 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[5]);
                          {
                            succeeded = builtin.unify_2_p_0(TypeInfo_151_151, ((java.lang.Object) (V_11_11)), ((java.lang.Object) (V_15_15)));
                          }
                          if (succeeded)
                            {
                              TypeInfo_152_152 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[6]);
                              {
                                succeeded = builtin.unify_2_p_0(TypeInfo_152_152, ((java.lang.Object) (V_12_12)), ((java.lang.Object) (V_16_16)));
                              }
                            }
                        }
                    }
                }
            }
            break;
          case 11:
            {
              java.lang.String V_17_17 = ((sberrs.Error_0.Unexpected_spec_2) HeadVar__1_1).F1;
              xml.Spec_0 V_18_18 = ((sberrs.Error_0.Unexpected_spec_2) HeadVar__1_1).F2;
              java.lang.String V_19_19 = null;
              xml.Spec_0 V_20_20 = null;

              succeeded = (HeadVar__2_2.data_tag == 11);
              if (succeeded)
                {
                  V_19_19 = ((sberrs.Error_0.Unexpected_spec_2) HeadVar__2_2).F1;
                  V_20_20 = ((sberrs.Error_0.Unexpected_spec_2) HeadVar__2_2).F2;
                  succeeded = V_17_17.equals(V_19_19);
                  if (succeeded)
                    {
                      succeeded = xml.__Unify____spec_0_0(V_18_18, V_20_20);
                    }
                }
            }
            break;
          case 12:
            {
              java.lang.String V_21_21 = ((sberrs.Error_0.Expected_elem_1) HeadVar__1_1).F1;
              java.lang.String V_22_22 = null;

              succeeded = (HeadVar__2_2.data_tag == 12);
              if (succeeded)
                {
                  V_22_22 = ((sberrs.Error_0.Expected_elem_1) HeadVar__2_2).F1;
                  succeeded = V_21_21.equals(V_22_22);
                }
            }
            break;
          case 13:
            {
              java.lang.String V_23_23 = ((sberrs.Error_0.Io_2) HeadVar__1_1).F1;
              int V_24_24 = ((sberrs.Error_0.Io_2) HeadVar__1_1).F2;
              java.lang.String V_25_25 = null;
              int V_26_26 = 0;

              succeeded = (HeadVar__2_2.data_tag == 13);
              if (succeeded)
                {
                  V_25_25 = ((sberrs.Error_0.Io_2) HeadVar__2_2).F1;
                  V_26_26 = ((sberrs.Error_0.Io_2) HeadVar__2_2).F2;
                  succeeded = V_23_23.equals(V_25_25);
                  if (succeeded)
                    succeeded = (V_24_24 == V_26_26);
                }
            }
            break;
          case 14:
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_147_147 = null;
              jmercury.runtime.TypeInfo_Struct TypeInfo_148_148 = null;
              jmercury.runtime.TypeInfo_Struct TypeInfo_149_149 = null;
              list.List_1 V_27_27 = ((sberrs.Error_0.Expected_attrs_4) HeadVar__1_1).F1;
              java.lang.String V_28_28 = ((sberrs.Error_0.Expected_attrs_4) HeadVar__1_1).F2;
              list.List_1 V_29_29 = ((sberrs.Error_0.Expected_attrs_4) HeadVar__1_1).F3;
              list.List_1 V_30_30 = ((sberrs.Error_0.Expected_attrs_4) HeadVar__1_1).F4;
              list.List_1 V_31_31 = null;
              java.lang.String V_32_32 = null;
              list.List_1 V_33_33 = null;
              list.List_1 V_34_34 = null;

              succeeded = (HeadVar__2_2.data_tag == 14);
              if (succeeded)
                {
                  V_31_31 = ((sberrs.Error_0.Expected_attrs_4) HeadVar__2_2).F1;
                  V_32_32 = ((sberrs.Error_0.Expected_attrs_4) HeadVar__2_2).F2;
                  V_33_33 = ((sberrs.Error_0.Expected_attrs_4) HeadVar__2_2).F3;
                  V_34_34 = ((sberrs.Error_0.Expected_attrs_4) HeadVar__2_2).F4;
                  TypeInfo_147_147 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[1]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_147_147, ((java.lang.Object) (V_27_27)), ((java.lang.Object) (V_31_31)));
                  }
                  if (succeeded)
                    {
                      succeeded = V_28_28.equals(V_32_32);
                      if (succeeded)
                        {
                          TypeInfo_148_148 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[5]);
                          {
                            succeeded = builtin.unify_2_p_0(TypeInfo_148_148, ((java.lang.Object) (V_29_29)), ((java.lang.Object) (V_33_33)));
                          }
                          if (succeeded)
                            {
                              TypeInfo_149_149 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[6]);
                              {
                                succeeded = builtin.unify_2_p_0(TypeInfo_149_149, ((java.lang.Object) (V_30_30)), ((java.lang.Object) (V_34_34)));
                              }
                            }
                        }
                    }
                }
            }
            break;
          case 15:
            {
              java.lang.String V_35_35 = ((sberrs.Error_0.Funny_triple_3) HeadVar__1_1).F1;
              int V_36_36 = ((sberrs.Error_0.Funny_triple_3) HeadVar__1_1).F2;
              java.lang.String V_37_37 = ((sberrs.Error_0.Funny_triple_3) HeadVar__1_1).F3;
              java.lang.String V_38_38 = null;
              int V_39_39 = 0;
              java.lang.String V_40_40 = null;

              succeeded = (HeadVar__2_2.data_tag == 15);
              if (succeeded)
                {
                  V_38_38 = ((sberrs.Error_0.Funny_triple_3) HeadVar__2_2).F1;
                  V_39_39 = ((sberrs.Error_0.Funny_triple_3) HeadVar__2_2).F2;
                  V_40_40 = ((sberrs.Error_0.Funny_triple_3) HeadVar__2_2).F3;
                  succeeded = V_35_35.equals(V_38_38);
                  if (succeeded)
                    {
                      succeeded = (V_36_36 == V_39_39);
                      if (succeeded)
                        succeeded = V_37_37.equals(V_40_40);
                    }
                }
            }
            break;
          case 16:
            {
              int V_41_41 = ((sberrs.Error_0.Funny_triple_2) HeadVar__1_1).F1;
              java.lang.String V_42_42 = ((sberrs.Error_0.Funny_triple_2) HeadVar__1_1).F2;
              int V_43_43 = 0;
              java.lang.String V_44_44 = null;

              succeeded = (HeadVar__2_2.data_tag == 16);
              if (succeeded)
                {
                  V_43_43 = ((sberrs.Error_0.Funny_triple_2) HeadVar__2_2).F1;
                  V_44_44 = ((sberrs.Error_0.Funny_triple_2) HeadVar__2_2).F2;
                  succeeded = (V_41_41 == V_43_43);
                  if (succeeded)
                    succeeded = V_42_42.equals(V_44_44);
                }
            }
            break;
          case 17:
            {
              int V_45_45 = ((sberrs.Error_0.Unknown_id_2) HeadVar__1_1).F1;
              int V_46_46 = ((sberrs.Error_0.Unknown_id_2) HeadVar__1_1).F2;
              int V_47_47 = 0;
              int V_48_48 = 0;

              succeeded = (HeadVar__2_2.data_tag == 17);
              if (succeeded)
                {
                  V_47_47 = ((sberrs.Error_0.Unknown_id_2) HeadVar__2_2).F1;
                  V_48_48 = ((sberrs.Error_0.Unknown_id_2) HeadVar__2_2).F2;
                  succeeded = (V_45_45 == V_47_47);
                  if (succeeded)
                    succeeded = (V_46_46 == V_48_48);
                }
            }
            break;
          case 18:
            {
              int V_49_49 = ((sberrs.Error_0.Funny_nested_3) HeadVar__1_1).F1;
              int V_50_50 = ((sberrs.Error_0.Funny_nested_3) HeadVar__1_1).F2;
              java.lang.String V_51_51 = ((sberrs.Error_0.Funny_nested_3) HeadVar__1_1).F3;
              int V_52_52 = 0;
              int V_53_53 = 0;
              java.lang.String V_54_54 = null;

              succeeded = (HeadVar__2_2.data_tag == 18);
              if (succeeded)
                {
                  V_52_52 = ((sberrs.Error_0.Funny_nested_3) HeadVar__2_2).F1;
                  V_53_53 = ((sberrs.Error_0.Funny_nested_3) HeadVar__2_2).F2;
                  V_54_54 = ((sberrs.Error_0.Funny_nested_3) HeadVar__2_2).F3;
                  succeeded = (V_49_49 == V_52_52);
                  if (succeeded)
                    {
                      succeeded = (V_50_50 == V_53_53);
                      if (succeeded)
                        succeeded = V_51_51.equals(V_54_54);
                    }
                }
            }
            break;
          case 19:
            {
              java.lang.String V_55_55 = ((sberrs.Error_0.Funny_strnode_1) HeadVar__1_1).F1;
              java.lang.String V_56_56 = null;

              succeeded = (HeadVar__2_2.data_tag == 19);
              if (succeeded)
                {
                  V_56_56 = ((sberrs.Error_0.Funny_strnode_1) HeadVar__2_2).F1;
                  succeeded = V_55_55.equals(V_56_56);
                }
            }
            break;
          case 20:
            {
              java.lang.String V_57_57 = ((sberrs.Error_0.Funny_concept_1) HeadVar__1_1).F1;
              java.lang.String V_58_58 = null;

              succeeded = (HeadVar__2_2.data_tag == 20);
              if (succeeded)
                {
                  V_58_58 = ((sberrs.Error_0.Funny_concept_1) HeadVar__2_2).F1;
                  succeeded = V_57_57.equals(V_58_58);
                }
            }
            break;
          case 21:
            {
              int V_59_59 = ((sberrs.Error_0.Missing_vardef_1) HeadVar__1_1).F1;
              int V_60_60 = 0;

              succeeded = (HeadVar__2_2.data_tag == 21);
              if (succeeded)
                {
                  V_60_60 = ((sberrs.Error_0.Missing_vardef_1) HeadVar__2_2).F1;
                  succeeded = (V_59_59 == V_60_60);
                }
            }
            break;
          case 22:
            {
              java.lang.String V_61_61 = ((sberrs.Error_0.Funny_attr_2) HeadVar__1_1).F1;
              java.lang.String V_62_62 = ((sberrs.Error_0.Funny_attr_2) HeadVar__1_1).F2;
              java.lang.String V_63_63 = null;
              java.lang.String V_64_64 = null;

              succeeded = (HeadVar__2_2.data_tag == 22);
              if (succeeded)
                {
                  V_63_63 = ((sberrs.Error_0.Funny_attr_2) HeadVar__2_2).F1;
                  V_64_64 = ((sberrs.Error_0.Funny_attr_2) HeadVar__2_2).F2;
                  succeeded = V_61_61.equals(V_63_63);
                  if (succeeded)
                    succeeded = V_62_62.equals(V_64_64);
                }
            }
            break;
          case 23:
            {
              java.lang.String V_65_65 = ((sberrs.Error_0.Funny_pred_param_1) HeadVar__1_1).F1;
              java.lang.String V_66_66 = null;

              succeeded = (HeadVar__2_2.data_tag == 23);
              if (succeeded)
                {
                  V_66_66 = ((sberrs.Error_0.Funny_pred_param_1) HeadVar__2_2).F1;
                  succeeded = V_65_65.equals(V_66_66);
                }
            }
            break;
          case 24:
            {
              int V_67_67 = ((sberrs.Error_0.Dupl_vardef_1) HeadVar__1_1).F1;
              int V_68_68 = 0;

              succeeded = (HeadVar__2_2.data_tag == 24);
              if (succeeded)
                {
                  V_68_68 = ((sberrs.Error_0.Dupl_vardef_1) HeadVar__2_2).F1;
                  succeeded = (V_67_67 == V_68_68);
                }
            }
            break;
          case 25:
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_146_146 = null;
              java.lang.String V_69_69 = ((sberrs.Error_0.Dupl_ref_attrs_2) HeadVar__1_1).F1;
              list.List_1 V_70_70 = ((sberrs.Error_0.Dupl_ref_attrs_2) HeadVar__1_1).F2;
              java.lang.String V_71_71 = null;
              list.List_1 V_72_72 = null;

              succeeded = (HeadVar__2_2.data_tag == 25);
              if (succeeded)
                {
                  V_71_71 = ((sberrs.Error_0.Dupl_ref_attrs_2) HeadVar__2_2).F1;
                  V_72_72 = ((sberrs.Error_0.Dupl_ref_attrs_2) HeadVar__2_2).F2;
                  succeeded = V_69_69.equals(V_71_71);
                  if (succeeded)
                    {
                      TypeInfo_146_146 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[7]);
                      {
                        succeeded = builtin.unify_2_p_0(TypeInfo_146_146, ((java.lang.Object) (V_70_70)), ((java.lang.Object) (V_72_72)));
                      }
                    }
                }
            }
            break;
          case 26:
            {
              java.lang.String V_73_73 = ((sberrs.Error_0.Funny_tconst_1) HeadVar__1_1).F1;
              java.lang.String V_74_74 = null;

              succeeded = (HeadVar__2_2.data_tag == 26);
              if (succeeded)
                {
                  V_74_74 = ((sberrs.Error_0.Funny_tconst_1) HeadVar__2_2).F1;
                  succeeded = V_73_73.equals(V_74_74);
                }
            }
            break;
          case 27:
            {
              java.lang.String V_75_75 = ((sberrs.Error_0.Pred_coref_1) HeadVar__1_1).F1;
              java.lang.String V_76_76 = null;

              succeeded = (HeadVar__2_2.data_tag == 27);
              if (succeeded)
                {
                  V_76_76 = ((sberrs.Error_0.Pred_coref_1) HeadVar__2_2).F1;
                  succeeded = V_75_75.equals(V_76_76);
                }
            }
            break;
          case 28:
            {
              java.lang.String V_77_77 = ((sberrs.Error_0.Coref_self_cycle_1) HeadVar__1_1).F1;
              java.lang.String V_78_78 = null;

              succeeded = (HeadVar__2_2.data_tag == 28);
              if (succeeded)
                {
                  V_78_78 = ((sberrs.Error_0.Coref_self_cycle_1) HeadVar__2_2).F1;
                  succeeded = V_77_77.equals(V_78_78);
                }
            }
            break;
          case 29:
            {
              int V_79_79 = ((sberrs.Error_0.Dupl_var_2) HeadVar__1_1).F1;
              int V_80_80 = ((sberrs.Error_0.Dupl_var_2) HeadVar__1_1).F2;
              int V_81_81 = 0;
              int V_82_82 = 0;

              succeeded = (HeadVar__2_2.data_tag == 29);
              if (succeeded)
                {
                  V_81_81 = ((sberrs.Error_0.Dupl_var_2) HeadVar__2_2).F1;
                  V_82_82 = ((sberrs.Error_0.Dupl_var_2) HeadVar__2_2).F2;
                  succeeded = (V_79_79 == V_81_81);
                  if (succeeded)
                    succeeded = (V_80_80 == V_82_82);
                }
            }
            break;
          case 30:
            {
              java.lang.String V_83_83 = ((sberrs.Error_0.Wordnet_1) HeadVar__1_1).F1;
              java.lang.String V_84_84 = null;

              succeeded = (HeadVar__2_2.data_tag == 30);
              if (succeeded)
                {
                  V_84_84 = ((sberrs.Error_0.Wordnet_1) HeadVar__2_2).F1;
                  succeeded = V_83_83.equals(V_84_84);
                }
            }
            break;
          case 31:
            {
              int V_85_85 = ((sberrs.Error_0.Triple_cycle_1) HeadVar__1_1).F1;
              int V_86_86 = 0;

              succeeded = (HeadVar__2_2.data_tag == 31);
              if (succeeded)
                {
                  V_86_86 = ((sberrs.Error_0.Triple_cycle_1) HeadVar__2_2).F1;
                  succeeded = (V_85_85 == V_86_86);
                }
            }
            break;
          case 32:
            {
              java.lang.String V_87_87 = ((sberrs.Error_0.Funny_pred_1) HeadVar__1_1).F1;
              java.lang.String V_88_88 = null;

              succeeded = (HeadVar__2_2.data_tag == 32);
              if (succeeded)
                {
                  V_88_88 = ((sberrs.Error_0.Funny_pred_1) HeadVar__2_2).F1;
                  succeeded = V_87_87.equals(V_88_88);
                }
            }
            break;
          case 33:
            {
              java.lang.String V_89_89 = ((sberrs.Error_0.Multiple_links_3) HeadVar__1_1).F1;
              java.lang.String V_90_90 = ((sberrs.Error_0.Multiple_links_3) HeadVar__1_1).F2;
              int V_91_91 = ((sberrs.Error_0.Multiple_links_3) HeadVar__1_1).F3;
              java.lang.String V_92_92 = null;
              java.lang.String V_93_93 = null;
              int V_94_94 = 0;

              succeeded = (HeadVar__2_2.data_tag == 33);
              if (succeeded)
                {
                  V_92_92 = ((sberrs.Error_0.Multiple_links_3) HeadVar__2_2).F1;
                  V_93_93 = ((sberrs.Error_0.Multiple_links_3) HeadVar__2_2).F2;
                  V_94_94 = ((sberrs.Error_0.Multiple_links_3) HeadVar__2_2).F3;
                  succeeded = V_89_89.equals(V_92_92);
                  if (succeeded)
                    {
                      succeeded = V_90_90.equals(V_93_93);
                      if (succeeded)
                        succeeded = (V_91_91 == V_94_94);
                    }
                }
            }
            break;
          case 34:
            {
              java.lang.String V_95_95 = ((sberrs.Error_0.Funny_mod_obj_sc_2) HeadVar__1_1).F1;
              int V_96_96 = ((sberrs.Error_0.Funny_mod_obj_sc_2) HeadVar__1_1).F2;
              java.lang.String V_97_97 = null;
              int V_98_98 = 0;

              succeeded = (HeadVar__2_2.data_tag == 34);
              if (succeeded)
                {
                  V_97_97 = ((sberrs.Error_0.Funny_mod_obj_sc_2) HeadVar__2_2).F1;
                  V_98_98 = ((sberrs.Error_0.Funny_mod_obj_sc_2) HeadVar__2_2).F2;
                  succeeded = V_95_95.equals(V_97_97);
                  if (succeeded)
                    succeeded = (V_96_96 == V_98_98);
                }
            }
            break;
          case 35:
            {
              java.lang.String V_99_99 = ((sberrs.Error_0.Funny_mod_obj_s_1) HeadVar__1_1).F1;
              java.lang.String V_100_100 = null;

              succeeded = (HeadVar__2_2.data_tag == 35);
              if (succeeded)
                {
                  V_100_100 = ((sberrs.Error_0.Funny_mod_obj_s_1) HeadVar__2_2).F1;
                  succeeded = V_99_99.equals(V_100_100);
                }
            }
            break;
          case 36:
            {
              int V_101_101 = ((sberrs.Error_0.Funny_mod_obj_c_1) HeadVar__1_1).F1;
              int V_102_102 = 0;

              succeeded = (HeadVar__2_2.data_tag == 36);
              if (succeeded)
                {
                  V_102_102 = ((sberrs.Error_0.Funny_mod_obj_c_1) HeadVar__2_2).F1;
                  succeeded = (V_101_101 == V_102_102);
                }
            }
            break;
          case 37:
            {
              java.lang.String V_103_103 = ((sberrs.Error_0.Unexp_predtp_1) HeadVar__1_1).F1;
              java.lang.String V_104_104 = null;

              succeeded = (HeadVar__2_2.data_tag == 37);
              if (succeeded)
                {
                  V_104_104 = ((sberrs.Error_0.Unexp_predtp_1) HeadVar__2_2).F1;
                  succeeded = V_103_103.equals(V_104_104);
                }
            }
            break;
          case 38:
            {
              java.lang.String V_105_105 = ((sberrs.Error_0.Funny_str_3) HeadVar__1_1).F1;
              java.lang.String V_106_106 = ((sberrs.Error_0.Funny_str_3) HeadVar__1_1).F2;
              java.lang.String V_107_107 = ((sberrs.Error_0.Funny_str_3) HeadVar__1_1).F3;
              java.lang.String V_108_108 = null;
              java.lang.String V_109_109 = null;
              java.lang.String V_110_110 = null;

              succeeded = (HeadVar__2_2.data_tag == 38);
              if (succeeded)
                {
                  V_108_108 = ((sberrs.Error_0.Funny_str_3) HeadVar__2_2).F1;
                  V_109_109 = ((sberrs.Error_0.Funny_str_3) HeadVar__2_2).F2;
                  V_110_110 = ((sberrs.Error_0.Funny_str_3) HeadVar__2_2).F3;
                  succeeded = V_105_105.equals(V_108_108);
                  if (succeeded)
                    {
                      succeeded = V_106_106.equals(V_109_109);
                      if (succeeded)
                        succeeded = V_107_107.equals(V_110_110);
                    }
                }
            }
            break;
          case 39:
            {
              int V_111_111 = ((sberrs.Error_0.Dupl_ent_id_1) HeadVar__1_1).F1;
              int V_112_112 = 0;

              succeeded = (HeadVar__2_2.data_tag == 39);
              if (succeeded)
                {
                  V_112_112 = ((sberrs.Error_0.Dupl_ent_id_1) HeadVar__2_2).F1;
                  succeeded = (V_111_111 == V_112_112);
                }
            }
            break;
          case 40:
            {
              java.lang.String V_113_113 = ((sberrs.Error_0.Funny_ent_tp_1) HeadVar__1_1).F1;
              java.lang.String V_114_114 = null;

              succeeded = (HeadVar__2_2.data_tag == 40);
              if (succeeded)
                {
                  V_114_114 = ((sberrs.Error_0.Funny_ent_tp_1) HeadVar__2_2).F1;
                  succeeded = V_113_113.equals(V_114_114);
                }
            }
            break;
          case 41:
            {
              java.lang.String V_115_115 = ((sberrs.Error_0.Funny_ne_tp_1) HeadVar__1_1).F1;
              java.lang.String V_116_116 = null;

              succeeded = (HeadVar__2_2.data_tag == 41);
              if (succeeded)
                {
                  V_116_116 = ((sberrs.Error_0.Funny_ne_tp_1) HeadVar__2_2).F1;
                  succeeded = V_115_115.equals(V_116_116);
                }
            }
            break;
          case 42:
            {
              java.lang.String V_117_117 = ((sberrs.Error_0.Funny_pos_1) HeadVar__1_1).F1;
              java.lang.String V_118_118 = null;

              succeeded = (HeadVar__2_2.data_tag == 42);
              if (succeeded)
                {
                  V_118_118 = ((sberrs.Error_0.Funny_pos_1) HeadVar__2_2).F1;
                  succeeded = V_117_117.equals(V_118_118);
                }
            }
            break;
          case 43:
            {
              java.lang.String V_119_119 = ((sberrs.Error_0.Funny_semrel_1) HeadVar__1_1).F1;
              java.lang.String V_120_120 = null;

              succeeded = (HeadVar__2_2.data_tag == 43);
              if (succeeded)
                {
                  V_120_120 = ((sberrs.Error_0.Funny_semrel_1) HeadVar__2_2).F1;
                  succeeded = V_119_119.equals(V_120_120);
                }
            }
            break;
          case 44:
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_150_150 = null;
              list.List_1 V_121_121 = ((sberrs.Error_0.Funny_coref_1) HeadVar__1_1).F1;
              list.List_1 V_122_122 = null;

              succeeded = (HeadVar__2_2.data_tag == 44);
              if (succeeded)
                {
                  V_122_122 = ((sberrs.Error_0.Funny_coref_1) HeadVar__2_2).F1;
                  TypeInfo_150_150 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[3]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_150_150, ((java.lang.Object) (V_121_121)), ((java.lang.Object) (V_122_122)));
                  }
                }
            }
            break;
          case 45:
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_145_145 = null;
              pair.Pair_2 V_123_123 = ((sberrs.Error_0.Dupl_coref_1) HeadVar__1_1).F1;
              pair.Pair_2 V_124_124 = null;

              succeeded = (HeadVar__2_2.data_tag == 45);
              if (succeeded)
                {
                  V_124_124 = ((sberrs.Error_0.Dupl_coref_1) HeadVar__2_2).F1;
                  TypeInfo_145_145 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[2]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_145_145, ((java.lang.Object) (V_123_123)), ((java.lang.Object) (V_124_124)));
                  }
                }
            }
            break;
          case 46:
            {
              java.lang.String V_125_125 = ((sberrs.Error_0.Funny_anno_body_1) HeadVar__1_1).F1;
              java.lang.String V_126_126 = null;

              succeeded = (HeadVar__2_2.data_tag == 46);
              if (succeeded)
                {
                  V_126_126 = ((sberrs.Error_0.Funny_anno_body_1) HeadVar__2_2).F1;
                  succeeded = V_125_125.equals(V_126_126);
                }
            }
            break;
          case 47:
            {
              java.lang.String V_127_127 = ((sberrs.Error_0.Funny_post_elem_1) HeadVar__1_1).F1;
              java.lang.String V_128_128 = null;

              succeeded = (HeadVar__2_2.data_tag == 47);
              if (succeeded)
                {
                  V_128_128 = ((sberrs.Error_0.Funny_post_elem_1) HeadVar__2_2).F1;
                  succeeded = V_127_127.equals(V_128_128);
                }
            }
            break;
          case 48:
            {
              java.lang.String V_129_129 = ((sberrs.Error_0.Funny_post_attrs_1) HeadVar__1_1).F1;
              java.lang.String V_130_130 = null;

              succeeded = (HeadVar__2_2.data_tag == 48);
              if (succeeded)
                {
                  V_130_130 = ((sberrs.Error_0.Funny_post_attrs_1) HeadVar__2_2).F1;
                  succeeded = V_129_129.equals(V_130_130);
                }
            }
            break;
          case 49:
            {
              java.lang.String V_131_131 = ((sberrs.Error_0.Funny_anno_word_3) HeadVar__1_1).F1;
              java.lang.String V_132_132 = ((sberrs.Error_0.Funny_anno_word_3) HeadVar__1_1).F2;
              int V_133_133 = ((sberrs.Error_0.Funny_anno_word_3) HeadVar__1_1).F3;
              java.lang.String V_134_134 = null;
              java.lang.String V_135_135 = null;
              int V_136_136 = 0;

              succeeded = (HeadVar__2_2.data_tag == 49);
              if (succeeded)
                {
                  V_134_134 = ((sberrs.Error_0.Funny_anno_word_3) HeadVar__2_2).F1;
                  V_135_135 = ((sberrs.Error_0.Funny_anno_word_3) HeadVar__2_2).F2;
                  V_136_136 = ((sberrs.Error_0.Funny_anno_word_3) HeadVar__2_2).F3;
                  succeeded = V_131_131.equals(V_134_134);
                  if (succeeded)
                    {
                      succeeded = V_132_132.equals(V_135_135);
                      if (succeeded)
                        succeeded = (V_133_133 == V_136_136);
                    }
                }
            }
            break;
          case 50:
            {
              java.lang.String V_137_137 = ((sberrs.Error_0.Anno_out_of_order_1) HeadVar__1_1).F1;
              java.lang.String V_138_138 = null;

              succeeded = (HeadVar__2_2.data_tag == 50);
              if (succeeded)
                {
                  V_138_138 = ((sberrs.Error_0.Anno_out_of_order_1) HeadVar__2_2).F1;
                  succeeded = V_137_137.equals(V_138_138);
                }
            }
            break;
          case 51:
            {
              java.lang.String V_139_139 = ((sberrs.Error_0.Funny_t2t_elem_1) HeadVar__1_1).F1;
              java.lang.String V_140_140 = null;

              succeeded = (HeadVar__2_2.data_tag == 51);
              if (succeeded)
                {
                  V_140_140 = ((sberrs.Error_0.Funny_t2t_elem_1) HeadVar__2_2).F1;
                  succeeded = V_139_139.equals(V_140_140);
                }
            }
            break;
          case 52:
            {
              java.lang.String V_141_141 = ((sberrs.Error_0.T2t_spec_1) HeadVar__1_1).F1;
              java.lang.String V_142_142 = null;

              succeeded = (HeadVar__2_2.data_tag == 52);
              if (succeeded)
                {
                  V_142_142 = ((sberrs.Error_0.T2t_spec_1) HeadVar__2_2).F1;
                  succeeded = V_141_141.equals(V_142_142);
                }
            }
            break;
          default: /*NOTREACHED*/
            throw new jmercury.runtime.UnreachableDefault();
        }
      return succeeded;
    }
  }
//  sberrs.m:42
  private static java.lang.Object error_string_2_p_0_2(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      java.lang.String conv1_HeadVar__2_31 = null;

      {
        conv1_HeadVar__2_31 = sberrs.IntroducedFrom__pred__error_string__42__1_2_p_0(((pair.Pair_2) wrapper_arg_1));
      }
      wrapper_arg_2 = ((java.lang.Object) (conv1_HeadVar__2_31));
      return wrapper_arg_2;
    }
  }
//  sberrs.m:80
  private static java.lang.Object error_string_2_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      java.lang.String conv0_HeadVar__2_2 = null;

      {
        conv0_HeadVar__2_2 = string.int_to_string_2_p_0(((java.lang.Integer) wrapper_arg_1).intValue());
      }
      wrapper_arg_2 = ((java.lang.Object) (conv0_HeadVar__2_2));
      return wrapper_arg_2;
    }
  }
//  sberrs.m:30
  public static java.lang.String error_string_2_p_0(
    sberrs.Error_0 HeadVar__1_1)
  {
//  sberrs.m:35
    {
      boolean succeeded = false;
      java.lang.String HeadVar__2_2 = null;

      switch (HeadVar__1_1.data_tag) {
        case 0:
//  sberrs.m:64
          HeadVar__2_2 = "duplicate file type option";
//  sberrs.m:35
          break;
        case 1:
//  sberrs.m:65
          HeadVar__2_2 = "duplicate command option";
//  sberrs.m:35
          break;
        case 2:
//  sberrs.m:70
          HeadVar__2_2 = "funny predicate";
//  sberrs.m:35
          break;
        case 3:
//  sberrs.m:121
          HeadVar__2_2 = "Funny annotation doc";
//  sberrs.m:35
          break;
        case 4:
//  sberrs.m:123
          HeadVar__2_2 = "Funny annotation element";
//  sberrs.m:35
          break;
        case 5:
//  sberrs.m:127
          HeadVar__2_2 = "Funny annotation attributes";
//  sberrs.m:35
          break;
        case 6:
//  sberrs.m:129
          HeadVar__2_2 = "Funny belief type";
//  sberrs.m:35
          break;
        case 7:
          HeadVar__2_2 = ((sberrs.Error_0.Getopt_1) HeadVar__1_1).F1;
          break;
        case 8:
//  sberrs.m:36
          HeadVar__2_2 = ((sberrs.Error_0.Io_1) HeadVar__1_1).F1;
//  sberrs.m:35
          break;
        case 9:
//  sberrs.m:37
          {
            list.List_1 Es_5 = ((sberrs.Error_0.Xml_1) HeadVar__1_1).F1;
            java.lang.String V_7_7 = "\n";

//  sberrs.m:38
            {
              HeadVar__2_2 = string.join_list_2_f_0(V_7_7, Es_5);
            }
//  sberrs.m:37
          }
//  sberrs.m:35
          break;
        case 10:
//  sberrs.m:41
          {
            jmercury.runtime.TypeInfo_Struct TypeInfo_372_372 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[0]);
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_373_373 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
            java.lang.String Loc_14 = ((sberrs.Error_0.Unexpected_elem_4) HeadVar__1_1).F1;
            java.lang.String Tp_15 = ((sberrs.Error_0.Unexpected_elem_4) HeadVar__1_1).F2;
            list.List_1 Tree_17 = ((sberrs.Error_0.Unexpected_elem_4) HeadVar__1_1).F4;
            list.List_1 Zs_27 = null;
            java.lang.String TS_28 = null;
            /* closure */ java.lang.Object[] V_29_29 = (/* closure */ java.lang.Object[]) sberrs.MR_scalar_common_4[1];
            java.lang.String V_44_44 = null;
            java.lang.String V_425_425 = null;
            java.lang.String V_426_426 = null;
            java.lang.String V_427_427 = null;
            java.lang.String V_428_428 = null;
            java.lang.String V_429_429 = null;
            java.lang.String V_430_430 = null;
            java.lang.String V_431_431 = null;
            java.lang.String V_432_432 = null;
            java.lang.String V_433_433 = null;
            list.List_1 V_16_16 = ((sberrs.Error_0.Unexpected_elem_4) HeadVar__1_1).F3;

//  sberrs.m:42
            {
              Zs_27 = list.map_3_p_0(TypeInfo_372_372, TypeCtorInfo_373_373, V_29_29, Tree_17);
            }
//  sberrs.m:45
            V_44_44 = " ";
            {
              TS_28 = string.join_list_2_f_0(V_44_44, Zs_27);
            }
            V_425_425 = ")";
            {
              V_426_426 = string.f_43_43_2_f_0(TS_28, V_425_425);
            }
            V_427_427 = " (";
            {
              V_428_428 = string.f_43_43_2_f_0(V_427_427, V_426_426);
            }
            {
              V_429_429 = string.f_43_43_2_f_0(Tp_15, V_428_428);
            }
            V_430_430 = ": ";
            {
              V_431_431 = string.f_43_43_2_f_0(V_430_430, V_429_429);
            }
            {
              V_432_432 = string.f_43_43_2_f_0(Loc_14, V_431_431);
            }
            V_433_433 = "unexpected element in ";
            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_433_433, V_432_432);
            }
//  sberrs.m:41
          }
//  sberrs.m:35
          break;
        case 11:
//  sberrs.m:47
          {
            java.lang.String Loc_56 = ((sberrs.Error_0.Unexpected_spec_2) HeadVar__1_1).F1;
            xml.Spec_0 Spec_57 = ((sberrs.Error_0.Unexpected_spec_2) HeadVar__1_1).F2;
            java.lang.String SpStr_59 = null;
            java.lang.String V_434_434 = null;
            java.lang.String V_435_435 = null;
            java.lang.String V_436_436 = null;
            java.lang.String V_437_437 = null;

//  sberrs.m:48
            {
              SpStr_59 = xml.spec_to_string_2_p_0(Spec_57);
            }
            V_434_434 = ": ";
            {
              V_435_435 = string.f_43_43_2_f_0(V_434_434, SpStr_59);
            }
            {
              V_436_436 = string.f_43_43_2_f_0(Loc_56, V_435_435);
            }
            V_437_437 = "unexpected spec in ";
            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_437_437, V_436_436);
            }
//  sberrs.m:47
          }
//  sberrs.m:35
          break;
        case 12:
//  sberrs.m:39
          {
            java.lang.String Tp_8 = ((sberrs.Error_0.Expected_elem_1) HeadVar__1_1).F1;
            java.lang.String V_393_393 = "\' element";
            java.lang.String V_394_394 = null;
            java.lang.String V_395_395 = null;

            {
              V_394_394 = string.f_43_43_2_f_0(Tp_8, V_393_393);
            }
            V_395_395 = "expected a \'";
            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_395_395, V_394_394);
            }
          }
//  sberrs.m:35
          break;
        case 13:
//  sberrs.m:62
          {
            java.lang.String Msg_124 = ((sberrs.Error_0.Io_2) HeadVar__1_1).F1;
            int Line_125 = ((sberrs.Error_0.Io_2) HeadVar__1_1).F2;
            java.lang.String V_127_127 = "%i: %s";
            list.List_1 V_128_128 = null;
            string.Poly_type_0 V_129_129 = null;
            list.List_1 V_130_130 = null;
            string.Poly_type_0 V_131_131 = null;
            list.List_1 V_132_132 = null;

//  sberrs.m:63
            {
              V_129_129 = new string.Poly_type_0.I_1(Line_125);
            }
            {
              V_131_131 = new string.Poly_type_0.S_1(Msg_124);
            }
            V_132_132 = (list.List_1) sberrs.MR_scalar_common_2[0];
            {
              V_130_130 = new list.List_1.F_cons_2(((java.lang.Object) (V_131_131)), V_132_132);
            }
            {
              V_128_128 = new list.List_1.F_cons_2(((java.lang.Object) (V_129_129)), V_130_130);
            }
            {
              HeadVar__2_2 = string.format_3_p_0(V_127_127, V_128_128);
            }
//  sberrs.m:62
          }
//  sberrs.m:35
          break;
        case 14:
//  sberrs.m:50
          {
            jmercury.runtime.TypeInfo_Struct TypeInfo_374_374 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[1]);
            list.List_1 Tps_66 = ((sberrs.Error_0.Expected_attrs_4) HeadVar__1_1).F1;
            java.lang.String V_74_74 = null;
            java.lang.String V_390_390 = null;
            java.lang.String V_391_391 = null;
            java.lang.String V_392_392 = null;
            java.lang.String _Tp_67 = ((sberrs.Error_0.Expected_attrs_4) HeadVar__1_1).F2;
            list.List_1 _As_68 = ((sberrs.Error_0.Expected_attrs_4) HeadVar__1_1).F3;
            list.List_1 _Tree_69 = ((sberrs.Error_0.Expected_attrs_4) HeadVar__1_1).F4;

//  sberrs.m:51
            {
              V_74_74 = string.string_1_f_0(TypeInfo_374_374, ((java.lang.Object) (Tps_66)));
            }
            V_390_390 = " attributes";
            {
              V_391_391 = string.f_43_43_2_f_0(V_74_74, V_390_390);
            }
            V_392_392 = "expected ";
            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_392_392, V_391_391);
            }
//  sberrs.m:50
          }
//  sberrs.m:35
          break;
        case 15:
//  sberrs.m:52
          {
            java.lang.String TripleStr_76 = ((sberrs.Error_0.Funny_triple_3) HeadVar__1_1).F1;
            int I_77 = ((sberrs.Error_0.Funny_triple_3) HeadVar__1_1).F2;
            java.lang.String Msg_78 = ((sberrs.Error_0.Funny_triple_3) HeadVar__1_1).F3;
            java.lang.String V_80_80 = "funny %s at %i in triple: %s";
            list.List_1 V_81_81 = null;
            string.Poly_type_0 V_82_82 = null;
            list.List_1 V_83_83 = null;
            string.Poly_type_0 V_84_84 = null;
            list.List_1 V_85_85 = null;
            string.Poly_type_0 V_86_86 = null;
            list.List_1 V_87_87 = null;

//  sberrs.m:53
            {
              V_82_82 = new string.Poly_type_0.S_1(Msg_78);
            }
            {
              V_84_84 = new string.Poly_type_0.I_1(I_77);
            }
            {
              V_86_86 = new string.Poly_type_0.S_1(TripleStr_76);
            }
            V_87_87 = (list.List_1) sberrs.MR_scalar_common_2[0];
            {
              V_85_85 = new list.List_1.F_cons_2(((java.lang.Object) (V_86_86)), V_87_87);
            }
            {
              V_83_83 = new list.List_1.F_cons_2(((java.lang.Object) (V_84_84)), V_85_85);
            }
            {
              V_81_81 = new list.List_1.F_cons_2(((java.lang.Object) (V_82_82)), V_83_83);
            }
            {
              HeadVar__2_2 = string.format_3_p_0(V_80_80, V_81_81);
            }
//  sberrs.m:52
          }
//  sberrs.m:35
          break;
        case 16:
//  sberrs.m:54
          {
            int Id_88 = ((sberrs.Error_0.Funny_triple_2) HeadVar__1_1).F1;
            java.lang.String T_89 = ((sberrs.Error_0.Funny_triple_2) HeadVar__1_1).F2;
            java.lang.String V_91_91 = "funny triple \'%s\' (chunk %i)";
            list.List_1 V_92_92 = null;
            string.Poly_type_0 V_93_93 = null;
            list.List_1 V_94_94 = null;
            string.Poly_type_0 V_95_95 = null;
            list.List_1 V_96_96 = null;

//  sberrs.m:55
            {
              V_93_93 = new string.Poly_type_0.S_1(T_89);
            }
            {
              V_95_95 = new string.Poly_type_0.I_1(Id_88);
            }
            V_96_96 = (list.List_1) sberrs.MR_scalar_common_2[0];
            {
              V_94_94 = new list.List_1.F_cons_2(((java.lang.Object) (V_95_95)), V_96_96);
            }
            {
              V_92_92 = new list.List_1.F_cons_2(((java.lang.Object) (V_93_93)), V_94_94);
            }
            {
              HeadVar__2_2 = string.format_3_p_0(V_91_91, V_92_92);
            }
//  sberrs.m:54
          }
//  sberrs.m:35
          break;
        case 17:
//  sberrs.m:56
          {
            int Id_97 = ((sberrs.Error_0.Unknown_id_2) HeadVar__1_1).F1;
            int Oid_98 = ((sberrs.Error_0.Unknown_id_2) HeadVar__1_1).F2;
            java.lang.String V_100_100 = "unknown obj \140L%i\' (chunk %i)";
            list.List_1 V_101_101 = null;
            string.Poly_type_0 V_102_102 = null;
            list.List_1 V_103_103 = null;
            string.Poly_type_0 V_104_104 = null;
            list.List_1 V_105_105 = null;

//  sberrs.m:57
            {
              V_102_102 = new string.Poly_type_0.I_1(Oid_98);
            }
            {
              V_104_104 = new string.Poly_type_0.I_1(Id_97);
            }
            V_105_105 = (list.List_1) sberrs.MR_scalar_common_2[0];
            {
              V_103_103 = new list.List_1.F_cons_2(((java.lang.Object) (V_104_104)), V_105_105);
            }
            {
              V_101_101 = new list.List_1.F_cons_2(((java.lang.Object) (V_102_102)), V_103_103);
            }
            {
              HeadVar__2_2 = string.format_3_p_0(V_100_100, V_101_101);
            }
//  sberrs.m:56
          }
//  sberrs.m:35
          break;
        case 18:
//  sberrs.m:58
          {
            int Id_106 = ((sberrs.Error_0.Funny_nested_3) HeadVar__1_1).F1;
            int Oid_107 = ((sberrs.Error_0.Funny_nested_3) HeadVar__1_1).F2;
            java.lang.String Ts_108 = ((sberrs.Error_0.Funny_nested_3) HeadVar__1_1).F3;
            java.lang.String V_110_110 = "funny nested chunk \'%s\' (chunk %i/%i)";
            list.List_1 V_111_111 = null;
            string.Poly_type_0 V_112_112 = null;
            list.List_1 V_113_113 = null;
            string.Poly_type_0 V_114_114 = null;
            list.List_1 V_115_115 = null;
            string.Poly_type_0 V_116_116 = null;
            list.List_1 V_117_117 = null;

//  sberrs.m:59
            {
              V_112_112 = new string.Poly_type_0.S_1(Ts_108);
            }
            {
              V_114_114 = new string.Poly_type_0.I_1(Id_106);
            }
            {
              V_116_116 = new string.Poly_type_0.I_1(Oid_107);
            }
            V_117_117 = (list.List_1) sberrs.MR_scalar_common_2[0];
            {
              V_115_115 = new list.List_1.F_cons_2(((java.lang.Object) (V_116_116)), V_117_117);
            }
            {
              V_113_113 = new list.List_1.F_cons_2(((java.lang.Object) (V_114_114)), V_115_115);
            }
            {
              V_111_111 = new list.List_1.F_cons_2(((java.lang.Object) (V_112_112)), V_113_113);
            }
            {
              HeadVar__2_2 = string.format_3_p_0(V_110_110, V_111_111);
            }
//  sberrs.m:58
          }
//  sberrs.m:35
          break;
        case 19:
//  sberrs.m:60
          {
            java.lang.String Node_118 = ((sberrs.Error_0.Funny_strnode_1) HeadVar__1_1).F1;
            java.lang.String V_419_419 = "funny strnode: ";

            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_419_419, Node_118);
            }
          }
//  sberrs.m:35
          break;
        case 20:
//  sberrs.m:66
          {
            java.lang.String Name_133 = ((sberrs.Error_0.Funny_concept_1) HeadVar__1_1).F1;
            java.lang.String V_401_401 = "funny concept name: ";

            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_401_401, Name_133);
            }
          }
//  sberrs.m:35
          break;
        case 21:
//  sberrs.m:77
          {
            int V_166 = ((sberrs.Error_0.Missing_vardef_1) HeadVar__1_1).F1;
            java.lang.String V_168_168 = "missing vardef: %i";
            list.List_1 V_169_169 = null;
            string.Poly_type_0 V_170_170 = null;
            list.List_1 V_171_171 = null;

//  sberrs.m:78
            {
              V_170_170 = new string.Poly_type_0.I_1(V_166);
            }
            V_171_171 = (list.List_1) sberrs.MR_scalar_common_2[0];
            {
              V_169_169 = new list.List_1.F_cons_2(((java.lang.Object) (V_170_170)), V_171_171);
            }
            {
              HeadVar__2_2 = string.format_3_p_0(V_168_168, V_169_169);
            }
//  sberrs.m:77
          }
//  sberrs.m:35
          break;
        case 22:
//  sberrs.m:68
          {
            java.lang.String R_139 = ((sberrs.Error_0.Funny_attr_2) HeadVar__1_1).F1;
            java.lang.String Vs_140 = ((sberrs.Error_0.Funny_attr_2) HeadVar__1_1).F2;
            java.lang.String V_397_397 = " = ";
            java.lang.String V_398_398 = null;
            java.lang.String V_399_399 = null;
            java.lang.String V_400_400 = null;

            {
              V_398_398 = string.f_43_43_2_f_0(V_397_397, Vs_140);
            }
            {
              V_399_399 = string.f_43_43_2_f_0(R_139, V_398_398);
            }
            V_400_400 = "funny attribute: ";
            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_400_400, V_399_399);
            }
          }
//  sberrs.m:35
          break;
        case 23:
//  sberrs.m:73
          {
            java.lang.String C_154 = ((sberrs.Error_0.Funny_pred_param_1) HeadVar__1_1).F1;
            java.lang.String V_410_410 = "funny predicate parameter: ";

            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_410_410, C_154);
            }
          }
//  sberrs.m:35
          break;
        case 24:
//  sberrs.m:75
          {
            int V_160 = ((sberrs.Error_0.Dupl_vardef_1) HeadVar__1_1).F1;
            java.lang.String V_162_162 = "duplicate vardef: %i";
            list.List_1 V_163_163 = null;
            string.Poly_type_0 V_164_164 = null;
            list.List_1 V_165_165 = null;

//  sberrs.m:76
            {
              V_164_164 = new string.Poly_type_0.I_1(V_160);
            }
            V_165_165 = (list.List_1) sberrs.MR_scalar_common_2[0];
            {
              V_163_163 = new list.List_1.F_cons_2(((java.lang.Object) (V_164_164)), V_165_165);
            }
            {
              HeadVar__2_2 = string.format_3_p_0(V_162_162, V_163_163);
            }
//  sberrs.m:75
          }
//  sberrs.m:35
          break;
        case 25:
//  sberrs.m:79
          {
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_377_377 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_378_378 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
            java.lang.String Tp_172 = ((sberrs.Error_0.Dupl_ref_attrs_2) HeadVar__1_1).F1;
            list.List_1 Vs_173 = ((sberrs.Error_0.Dupl_ref_attrs_2) HeadVar__1_1).F2;
            list.List_1 Ss_175 = null;
            java.lang.String S_176 = null;
            /* closure */ java.lang.Object[] V_177_177 = (/* closure */ java.lang.Object[]) sberrs.MR_scalar_common_4[0];
            java.lang.String V_178_178 = null;
            java.lang.String V_386_386 = null;
            java.lang.String V_387_387 = null;
            java.lang.String V_388_388 = null;
            java.lang.String V_389_389 = null;

//  sberrs.m:80
            {
              Ss_175 = list.map_3_p_0(TypeCtorInfo_377_377, TypeCtorInfo_378_378, V_177_177, Vs_173);
            }
            V_178_178 = ", ";
            {
              S_176 = string.join_list_2_f_0(V_178_178, Ss_175);
            }
            V_386_386 = " attributes: ";
            {
              V_387_387 = string.f_43_43_2_f_0(V_386_386, S_176);
            }
            {
              V_388_388 = string.f_43_43_2_f_0(Tp_172, V_387_387);
            }
            V_389_389 = "duplicate ref/";
            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_389_389, V_388_388);
            }
//  sberrs.m:79
          }
//  sberrs.m:35
          break;
        case 26:
//  sberrs.m:82
          {
            java.lang.String S_185 = ((sberrs.Error_0.Funny_tconst_1) HeadVar__1_1).F1;
            java.lang.String V_421_421 = "funny tconst: ";

            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_421_421, S_185);
            }
          }
//  sberrs.m:35
          break;
        case 27:
//  sberrs.m:84
          {
            java.lang.String S_191 = ((sberrs.Error_0.Pred_coref_1) HeadVar__1_1).F1;
            java.lang.String V_422_422 = "predicate has coref data: ";

            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_422_422, S_191);
            }
          }
//  sberrs.m:35
          break;
        case 28:
//  sberrs.m:86
          {
            java.lang.String S_197 = ((sberrs.Error_0.Coref_self_cycle_1) HeadVar__1_1).F1;
            java.lang.String V_382_382 = ")";
            java.lang.String V_383_383 = null;
            java.lang.String V_384_384 = null;

            {
              V_383_383 = string.f_43_43_2_f_0(S_197, V_382_382);
            }
            V_384_384 = "coref attribute self cycle (";
            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_384_384, V_383_383);
            }
          }
//  sberrs.m:35
          break;
        case 29:
//  sberrs.m:88
          {
            int T_203 = ((sberrs.Error_0.Dupl_var_2) HeadVar__1_1).F1;
            int V_204 = ((sberrs.Error_0.Dupl_var_2) HeadVar__1_1).F2;
            java.lang.String V_206_206 = "duplicate variable: %i (turn %i)";
            list.List_1 V_207_207 = null;
            string.Poly_type_0 V_208_208 = null;
            list.List_1 V_209_209 = null;
            string.Poly_type_0 V_210_210 = null;
            list.List_1 V_211_211 = null;

//  sberrs.m:89
            {
              V_208_208 = new string.Poly_type_0.I_1(V_204);
            }
            {
              V_210_210 = new string.Poly_type_0.I_1(T_203);
            }
            V_211_211 = (list.List_1) sberrs.MR_scalar_common_2[0];
            {
              V_209_209 = new list.List_1.F_cons_2(((java.lang.Object) (V_210_210)), V_211_211);
            }
            {
              V_207_207 = new list.List_1.F_cons_2(((java.lang.Object) (V_208_208)), V_209_209);
            }
            {
              HeadVar__2_2 = string.format_3_p_0(V_206_206, V_207_207);
            }
//  sberrs.m:88
          }
//  sberrs.m:35
          break;
        case 30:
//  sberrs.m:90
          {
            java.lang.String W_212 = ((sberrs.Error_0.Wordnet_1) HeadVar__1_1).F1;
            java.lang.String V_438_438 = "Funny wordnet string: ";

            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_438_438, W_212);
            }
          }
//  sberrs.m:35
          break;
        case 31:
//  sberrs.m:92
          {
            int I_218 = ((sberrs.Error_0.Triple_cycle_1) HeadVar__1_1).F1;
            java.lang.String V_220_220 = "Triple link cycle (%i)";
            list.List_1 V_221_221 = null;
            string.Poly_type_0 V_222_222 = null;
            list.List_1 V_223_223 = null;

//  sberrs.m:93
            {
              V_222_222 = new string.Poly_type_0.I_1(I_218);
            }
            V_223_223 = (list.List_1) sberrs.MR_scalar_common_2[0];
            {
              V_221_221 = new list.List_1.F_cons_2(((java.lang.Object) (V_222_222)), V_223_223);
            }
            {
              HeadVar__2_2 = string.format_3_p_0(V_220_220, V_221_221);
            }
//  sberrs.m:92
          }
//  sberrs.m:35
          break;
        case 32:
//  sberrs.m:71
          {
            java.lang.String S_148 = ((sberrs.Error_0.Funny_pred_1) HeadVar__1_1).F1;
            java.lang.String V_409_409 = "funny predicate: ";

            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_409_409, S_148);
            }
          }
//  sberrs.m:35
          break;
        case 33:
//  sberrs.m:94
          {
            java.lang.String S_224 = ((sberrs.Error_0.Multiple_links_3) HeadVar__1_1).F1;
            java.lang.String O_225 = ((sberrs.Error_0.Multiple_links_3) HeadVar__1_1).F2;
            int I_226 = ((sberrs.Error_0.Multiple_links_3) HeadVar__1_1).F3;
            java.lang.String V_228_228 = "Multiple links: %s %s %i";
            list.List_1 V_229_229 = null;
            string.Poly_type_0 V_230_230 = null;
            list.List_1 V_231_231 = null;
            string.Poly_type_0 V_232_232 = null;
            list.List_1 V_233_233 = null;
            string.Poly_type_0 V_234_234 = null;
            list.List_1 V_235_235 = null;

//  sberrs.m:95
            {
              V_230_230 = new string.Poly_type_0.S_1(S_224);
            }
            {
              V_232_232 = new string.Poly_type_0.S_1(O_225);
            }
            {
              V_234_234 = new string.Poly_type_0.I_1(I_226);
            }
            V_235_235 = (list.List_1) sberrs.MR_scalar_common_2[0];
            {
              V_233_233 = new list.List_1.F_cons_2(((java.lang.Object) (V_234_234)), V_235_235);
            }
            {
              V_231_231 = new list.List_1.F_cons_2(((java.lang.Object) (V_232_232)), V_233_233);
            }
            {
              V_229_229 = new list.List_1.F_cons_2(((java.lang.Object) (V_230_230)), V_231_231);
            }
            {
              HeadVar__2_2 = string.format_3_p_0(V_228_228, V_229_229);
            }
//  sberrs.m:94
          }
//  sberrs.m:35
          break;
        case 34:
//  sberrs.m:96
          {
            java.lang.String S_236 = ((sberrs.Error_0.Funny_mod_obj_sc_2) HeadVar__1_1).F1;
            int C_237 = ((sberrs.Error_0.Funny_mod_obj_sc_2) HeadVar__1_1).F2;
            java.lang.String V_239_239 = "Funny modality object: %s/%i";
            list.List_1 V_240_240 = null;
            string.Poly_type_0 V_241_241 = null;
            list.List_1 V_242_242 = null;
            string.Poly_type_0 V_243_243 = null;
            list.List_1 V_244_244 = null;

//  sberrs.m:97
            {
              V_241_241 = new string.Poly_type_0.S_1(S_236);
            }
            {
              V_243_243 = new string.Poly_type_0.I_1(C_237);
            }
            V_244_244 = (list.List_1) sberrs.MR_scalar_common_2[0];
            {
              V_242_242 = new list.List_1.F_cons_2(((java.lang.Object) (V_243_243)), V_244_244);
            }
            {
              V_240_240 = new list.List_1.F_cons_2(((java.lang.Object) (V_241_241)), V_242_242);
            }
            {
              HeadVar__2_2 = string.format_3_p_0(V_239_239, V_240_240);
            }
//  sberrs.m:96
          }
//  sberrs.m:35
          break;
        case 35:
//  sberrs.m:98
          {
            java.lang.String S_245 = ((sberrs.Error_0.Funny_mod_obj_s_1) HeadVar__1_1).F1;
            java.lang.String V_404_404 = "Funny modality object: ";

            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_404_404, S_245);
            }
          }
//  sberrs.m:35
          break;
        case 36:
//  sberrs.m:100
          {
            int C_251 = ((sberrs.Error_0.Funny_mod_obj_c_1) HeadVar__1_1).F1;
            java.lang.String V_253_253 = "Funny modality object: %i";
            list.List_1 V_254_254 = null;
            string.Poly_type_0 V_255_255 = null;
            list.List_1 V_256_256 = null;

//  sberrs.m:101
            {
              V_255_255 = new string.Poly_type_0.I_1(C_251);
            }
            V_256_256 = (list.List_1) sberrs.MR_scalar_common_2[0];
            {
              V_254_254 = new list.List_1.F_cons_2(((java.lang.Object) (V_255_255)), V_256_256);
            }
            {
              HeadVar__2_2 = string.format_3_p_0(V_253_253, V_254_254);
            }
//  sberrs.m:100
          }
//  sberrs.m:35
          break;
        case 37:
//  sberrs.m:102
          {
            java.lang.String S_257 = ((sberrs.Error_0.Unexp_predtp_1) HeadVar__1_1).F1;
            java.lang.String V_424_424 = "Unexpected predicate type: ";

            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_424_424, S_257);
            }
          }
//  sberrs.m:35
          break;
        case 38:
//  sberrs.m:104
          {
            java.lang.String Nm_263 = ((sberrs.Error_0.Funny_str_3) HeadVar__1_1).F1;
            java.lang.String S_264 = ((sberrs.Error_0.Funny_str_3) HeadVar__1_1).F2;
            java.lang.String Tp_265 = ((sberrs.Error_0.Funny_str_3) HeadVar__1_1).F3;
            java.lang.String V_412_412 = "/";
            java.lang.String V_413_413 = null;
            java.lang.String V_414_414 = null;
            java.lang.String V_415_415 = null;
            java.lang.String V_416_416 = null;
            java.lang.String V_417_417 = null;
            java.lang.String V_418_418 = null;

            {
              V_413_413 = string.f_43_43_2_f_0(V_412_412, Tp_265);
            }
            {
              V_414_414 = string.f_43_43_2_f_0(S_264, V_413_413);
            }
            V_415_415 = ": ";
            {
              V_416_416 = string.f_43_43_2_f_0(V_415_415, V_414_414);
            }
            {
              V_417_417 = string.f_43_43_2_f_0(Nm_263, V_416_416);
            }
            V_418_418 = "Funny ";
            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_418_418, V_417_417);
            }
          }
//  sberrs.m:35
          break;
        case 39:
//  sberrs.m:106
          {
            int Id_275 = ((sberrs.Error_0.Dupl_ent_id_1) HeadVar__1_1).F1;
            java.lang.String V_277_277 = "Duplicate entity id: %i";
            list.List_1 V_278_278 = null;
            string.Poly_type_0 V_279_279 = null;
            list.List_1 V_280_280 = null;

//  sberrs.m:107
            {
              V_279_279 = new string.Poly_type_0.I_1(Id_275);
            }
            V_280_280 = (list.List_1) sberrs.MR_scalar_common_2[0];
            {
              V_278_278 = new list.List_1.F_cons_2(((java.lang.Object) (V_279_279)), V_280_280);
            }
            {
              HeadVar__2_2 = string.format_3_p_0(V_277_277, V_278_278);
            }
//  sberrs.m:106
          }
//  sberrs.m:35
          break;
        case 40:
//  sberrs.m:108
          {
            java.lang.String Tp_281 = ((sberrs.Error_0.Funny_ent_tp_1) HeadVar__1_1).F1;
            java.lang.String V_403_403 = "Funny entity type: ";

            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_403_403, Tp_281);
            }
          }
//  sberrs.m:35
          break;
        case 41:
//  sberrs.m:110
          {
            java.lang.String Tp_287 = ((sberrs.Error_0.Funny_ne_tp_1) HeadVar__1_1).F1;
            java.lang.String V_405_405 = "Funny named entity type: ";

            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_405_405, Tp_287);
            }
          }
//  sberrs.m:35
          break;
        case 42:
//  sberrs.m:112
          {
            java.lang.String Pos_293 = ((sberrs.Error_0.Funny_pos_1) HeadVar__1_1).F1;
            java.lang.String V_406_406 = "Funny pos code: ";

            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_406_406, Pos_293);
            }
          }
//  sberrs.m:35
          break;
        case 43:
//  sberrs.m:114
          {
            java.lang.String Label_299 = ((sberrs.Error_0.Funny_semrel_1) HeadVar__1_1).F1;
            java.lang.String V_411_411 = "Funny semrel label: ";

            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_411_411, Label_299);
            }
          }
//  sberrs.m:35
          break;
        case 44:
//  sberrs.m:116
          {
            jmercury.runtime.TypeInfo_Struct TypeInfo_379_379 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[3]);
            list.List_1 Ps_305 = ((sberrs.Error_0.Funny_coref_1) HeadVar__1_1).F1;
            java.lang.String V_310_310 = null;
            java.lang.String V_402_402 = null;

//  sberrs.m:117
            {
              V_310_310 = string.string_1_f_0(TypeInfo_379_379, ((java.lang.Object) (Ps_305)));
            }
            V_402_402 = "Funny coref: ";
            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_402_402, V_310_310);
            }
//  sberrs.m:116
          }
//  sberrs.m:35
          break;
        case 45:
//  sberrs.m:118
          {
            jmercury.runtime.TypeInfo_Struct TypeInfo_380_380 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.MR_scalar_common_1[2]);
            pair.Pair_2 P_312 = ((sberrs.Error_0.Dupl_coref_1) HeadVar__1_1).F1;
            java.lang.String V_317_317 = null;
            java.lang.String V_385_385 = null;

//  sberrs.m:119
            {
              V_317_317 = string.string_1_f_0(TypeInfo_380_380, ((java.lang.Object) (P_312)));
            }
            V_385_385 = "Duplicate coref: ";
            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_385_385, V_317_317);
            }
//  sberrs.m:118
          }
//  sberrs.m:35
          break;
        case 46:
//  sberrs.m:124
          {
            java.lang.String S_321 = ((sberrs.Error_0.Funny_anno_body_1) HeadVar__1_1).F1;
            java.lang.String V_396_396 = "Funny annotation body: ";

            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_396_396, S_321);
            }
          }
//  sberrs.m:35
          break;
        case 47:
//  sberrs.m:130
          {
            java.lang.String S_329 = ((sberrs.Error_0.Funny_post_elem_1) HeadVar__1_1).F1;
            java.lang.String V_408_408 = "Funny post element: ";

            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_408_408, S_329);
            }
          }
//  sberrs.m:35
          break;
        case 48:
//  sberrs.m:132
          {
            java.lang.String S_335 = ((sberrs.Error_0.Funny_post_attrs_1) HeadVar__1_1).F1;
            java.lang.String V_407_407 = "Funny post attributes: ";

            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_407_407, S_335);
            }
          }
//  sberrs.m:35
          break;
        case 49:
//  sberrs.m:134
          {
            java.lang.String Wd_341 = ((sberrs.Error_0.Funny_anno_word_3) HeadVar__1_1).F1;
            java.lang.String AWd_342 = ((sberrs.Error_0.Funny_anno_word_3) HeadVar__1_1).F2;
            int O_343 = ((sberrs.Error_0.Funny_anno_word_3) HeadVar__1_1).F3;
            java.lang.String V_345_345 = "Annotation word mismatch: \140%s\'/\140%s\' (%i)";
            list.List_1 V_346_346 = null;
            string.Poly_type_0 V_347_347 = null;
            list.List_1 V_348_348 = null;
            string.Poly_type_0 V_349_349 = null;
            list.List_1 V_350_350 = null;
            string.Poly_type_0 V_351_351 = null;
            list.List_1 V_352_352 = null;

//  sberrs.m:135
            {
              V_347_347 = new string.Poly_type_0.S_1(Wd_341);
            }
            {
              V_349_349 = new string.Poly_type_0.S_1(AWd_342);
            }
            {
              V_351_351 = new string.Poly_type_0.I_1(O_343);
            }
            V_352_352 = (list.List_1) sberrs.MR_scalar_common_2[0];
            {
              V_350_350 = new list.List_1.F_cons_2(((java.lang.Object) (V_351_351)), V_352_352);
            }
            {
              V_348_348 = new list.List_1.F_cons_2(((java.lang.Object) (V_349_349)), V_350_350);
            }
            {
              V_346_346 = new list.List_1.F_cons_2(((java.lang.Object) (V_347_347)), V_348_348);
            }
            {
              HeadVar__2_2 = string.format_3_p_0(V_345_345, V_346_346);
            }
//  sberrs.m:134
          }
//  sberrs.m:35
          break;
        case 50:
//  sberrs.m:136
          {
            java.lang.String Id_353 = ((sberrs.Error_0.Anno_out_of_order_1) HeadVar__1_1).F1;
            java.lang.String V_381_381 = "Annotation out of order: ";

            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_381_381, Id_353);
            }
          }
//  sberrs.m:35
          break;
        case 51:
//  sberrs.m:138
          {
            java.lang.String S_359 = ((sberrs.Error_0.Funny_t2t_elem_1) HeadVar__1_1).F1;
            java.lang.String V_420_420 = "Funny element in post: ";

            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_420_420, S_359);
            }
          }
//  sberrs.m:35
          break;
        case 52:
//  sberrs.m:140
          {
            java.lang.String S_365 = ((sberrs.Error_0.T2t_spec_1) HeadVar__1_1).F1;
            java.lang.String V_423_423 = "Spec in post: ";

            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_423_423, S_365);
            }
          }
//  sberrs.m:35
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
      return HeadVar__2_2;
    }
//  sberrs.m:30
  }

// ExportDefns

// ExportedEnums
  public static final sberrs.Prmode_0 props = sberrs.Prmode_0.K0;
  public static final sberrs.Prmode_0 maximum = sberrs.Prmode_0.K1;

// InitPreds

// FinalPreds

// EnvVarNames
  static {
    if (System.getenv("MERCURY_DEBUG_CLASS_INIT") != null) {
      System.out.println("[sberrs end init]");
    }
  }
}
// :- end_module sberrs.
