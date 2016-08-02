//
//
// Automatically generated from xml.m by the Mercury Compiler,
// version 14.01.1, configured for x86_64-unknown-linux-gnu
//
//

/* :- module xml. */

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
// import ops;
// import pair;
// import pretty_printer;
// import private_builtin;
// import random;
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
public class xml {
  static {
    if (System.getenv("MERCURY_DEBUG_CLASS_INIT") != null) {
      System.out.println("[xml start init]");
    }
  }

// RttiDefns
  private static final jmercury.runtime.TypeInfo_Struct pair__pti_pair_2__plain_builtin__type_ctor_info_int_0__plain_xml__type_ctor_info_stream_obj_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_string_0 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct xml__type_ctor_info_attribute_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_error_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_error_0_1 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_error_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_error_0_2 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_error_0_2 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_error_0_3 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_error_0_3 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_error_0_4 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_error_0_4 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_error_0_5 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_error_0_5 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_error_0_6 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_error_0_6 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_error_0_7 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_error_0_7 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_error_0_8 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_error_0_8 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_error_0_9 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_error_0_9 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] xml__du_stag_ordered_error_0_0 = new jmercury.runtime.DuFunctorDesc[10];
  private static final jmercury.runtime.DuPtagLayout[] xml__du_ptag_ordered_error_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] xml__du_name_ordered_error_0 = new jmercury.runtime.DuFunctorDesc[10];
  private static final int[] xml__functor_number_map_error_0 = new int[10];
  public static final jmercury.runtime.TypeCtorInfo_Struct xml__type_ctor_info_error_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct errors__ti_message_1xml__type_ctor_info_error_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1xml__type_ctor_info_error_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1xml__type_ctor_info_error_0 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct xml__type_ctor_info_errors_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_parse_1_0 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_parse_1_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_parse_1_1 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_parse_1_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] xml__du_stag_ordered_parse_1_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final jmercury.runtime.DuPtagLayout[] xml__du_ptag_ordered_parse_1 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] xml__du_name_ordered_parse_1 = new jmercury.runtime.DuFunctorDesc[2];
  private static final int[] xml__functor_number_map_parse_1 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct xml__type_ctor_info_parse_1 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_ref_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_ref_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_ref_0_2 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_ref_0_3 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_ref_0_4 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_ref_0_5 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_ref_0_5 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_ref_0_6 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_ref_0_6 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_ref_0_7 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_ref_0_7 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] xml__du_stag_ordered_ref_0_0 = new jmercury.runtime.DuFunctorDesc[8];
  private static final jmercury.runtime.DuPtagLayout[] xml__du_ptag_ordered_ref_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] xml__du_name_ordered_ref_0 = new jmercury.runtime.DuFunctorDesc[8];
  private static final int[] xml__functor_number_map_ref_0 = new int[8];
  public static final jmercury.runtime.TypeCtorInfo_Struct xml__type_ctor_info_ref_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_string_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_spec_0_0 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_spec_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_spec_0_1 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_spec_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_spec_0_2 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_spec_0_2 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_spec_0_3 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_spec_0_3 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_spec_0_4 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_spec_0_4 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_spec_0_5 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_spec_0_5 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] xml__du_stag_ordered_spec_0_0 = new jmercury.runtime.DuFunctorDesc[6];
  private static final jmercury.runtime.DuPtagLayout[] xml__du_ptag_ordered_spec_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] xml__du_name_ordered_spec_0 = new jmercury.runtime.DuFunctorDesc[6];
  private static final int[] xml__functor_number_map_spec_0 = new int[6];
  public static final jmercury.runtime.TypeCtorInfo_Struct xml__type_ctor_info_spec_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_stack_item_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_stack_item_0 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct xml__type_ctor_info_stack_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_tree_obj_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_tree_obj_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_stack_item_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_stack_item_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] xml__du_stag_ordered_stack_item_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] xml__du_ptag_ordered_stack_item_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] xml__du_name_ordered_stack_item_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] xml__functor_number_map_stack_item_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct xml__type_ctor_info_stack_item_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_stream_obj_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_stream_obj_0 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct xml__type_ctor_info_stream_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct xml__type_ctor_info_stream_item_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_stream_obj_0_0 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_stream_obj_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_stream_obj_0_1 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_stream_obj_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_stream_obj_0_2 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_stream_obj_0_2 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_stream_obj_0_3 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_stream_obj_0_3 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_stream_obj_0_4 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_stream_obj_0_4 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] xml__du_stag_ordered_stream_obj_0_0 = new jmercury.runtime.DuFunctorDesc[5];
  private static final jmercury.runtime.DuPtagLayout[] xml__du_ptag_ordered_stream_obj_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] xml__du_name_ordered_stream_obj_0 = new jmercury.runtime.DuFunctorDesc[5];
  private static final int[] xml__functor_number_map_stream_obj_0 = new int[5];
  public static final jmercury.runtime.TypeCtorInfo_Struct xml__type_ctor_info_stream_obj_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc xml__enum_functor_desc_tagtype_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc xml__enum_functor_desc_tagtype_0_1 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] xml__enum_value_ordered_tagtype_0 = new jmercury.runtime.EnumFunctorDesc[2];
  private static final jmercury.runtime.EnumFunctorDesc[] xml__enum_name_ordered_tagtype_0 = new jmercury.runtime.EnumFunctorDesc[2];
  private static final int[] xml__functor_number_map_tagtype_0 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct xml__type_ctor_info_tagtype_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_character_0 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct xml__type_ctor_info_token_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct xml__type_ctor_info_tree_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct xml__type_ctor_info_tree_item_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_tree_obj_0_0 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_tree_obj_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_tree_obj_0_1 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_tree_obj_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] xml__field_types_tree_obj_0_2 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc xml__du_functor_desc_tree_obj_0_2 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] xml__du_stag_ordered_tree_obj_0_0 = new jmercury.runtime.DuFunctorDesc[3];
  private static final jmercury.runtime.DuPtagLayout[] xml__du_ptag_ordered_tree_obj_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] xml__du_name_ordered_tree_obj_0 = new jmercury.runtime.DuFunctorDesc[3];
  private static final int[] xml__functor_number_map_tree_obj_0 = new int[3];
  public static final jmercury.runtime.TypeCtorInfo_Struct xml__type_ctor_info_tree_obj_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  static {
    //
    //
    //
    //
    pair__pti_pair_2__plain_builtin__type_ctor_info_int_0__plain_xml__type_ctor_info_stream_obj_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0,
		(jmercury.runtime.PseudoTypeInfo) xml.xml__type_ctor_info_stream_obj_0});
    //
    //
    pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_string_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0)});
    //
    xml__type_ctor_info_attribute_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(0))),
		((java.lang.Object) (new AddrOf2_0(1))),
		"xml",
		"attribute",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) xml.pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_string_0),
		-1,
		0,
		null);
    //
    xml__du_functor_desc_error_0_0.init("eof",
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
    xml__field_types_error_0_1[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    xml__du_functor_desc_error_0_1.init("expected",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		xml.xml__field_types_error_0_1,
		null,
		null,
		null);
    //
    //
    xml__field_types_error_0_2[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    xml__field_types_error_0_2[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_character_0;
    xml__field_types_error_0_2[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    xml__du_functor_desc_error_0_2.init("ebf_at",
		3,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		2,
		2,
		xml.xml__field_types_error_0_2,
		null,
		null,
		null);
    //
    xml__field_types_error_0_3[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_character_0;
    xml__field_types_error_0_3[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    xml__du_functor_desc_error_0_3.init("unexpected_char_at",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		3,
		3,
		xml.xml__field_types_error_0_3,
		null,
		null,
		null);
    //
    xml__field_types_error_0_4[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    xml__field_types_error_0_4[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    xml__du_functor_desc_error_0_4.init("unexpected_name",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		4,
		4,
		xml.xml__field_types_error_0_4,
		null,
		null,
		null);
    //
    xml__field_types_error_0_5[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    xml__field_types_error_0_5[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    xml__field_types_error_0_5[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    xml__du_functor_desc_error_0_5.init("unexpected_in_name",
		3,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		5,
		5,
		xml.xml__field_types_error_0_5,
		null,
		null,
		null);
    //
    xml__field_types_error_0_6[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    xml__du_functor_desc_error_0_6.init("dangling",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		6,
		6,
		xml.xml__field_types_error_0_6,
		null,
		null,
		null);
    //
    xml__field_types_error_0_7[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    xml__field_types_error_0_7[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    xml__du_functor_desc_error_0_7.init("dangling_name",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		7,
		7,
		xml.xml__field_types_error_0_7,
		null,
		null,
		null);
    //
    xml__field_types_error_0_8[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    xml__field_types_error_0_8[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    xml__du_functor_desc_error_0_8.init("unbalanced_tags",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		8,
		8,
		xml.xml__field_types_error_0_8,
		null,
		null,
		null);
    //
    xml__field_types_error_0_9[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    xml__field_types_error_0_9[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    xml__field_types_error_0_9[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    xml__du_functor_desc_error_0_9.init("spec",
		3,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		9,
		9,
		xml.xml__field_types_error_0_9,
		null,
		null,
		null);
    //
    xml__du_stag_ordered_error_0_0[0] = xml.xml__du_functor_desc_error_0_0;
    xml__du_stag_ordered_error_0_0[1] = xml.xml__du_functor_desc_error_0_1;
    xml__du_stag_ordered_error_0_0[2] = xml.xml__du_functor_desc_error_0_2;
    xml__du_stag_ordered_error_0_0[3] = xml.xml__du_functor_desc_error_0_3;
    xml__du_stag_ordered_error_0_0[4] = xml.xml__du_functor_desc_error_0_4;
    xml__du_stag_ordered_error_0_0[5] = xml.xml__du_functor_desc_error_0_5;
    xml__du_stag_ordered_error_0_0[6] = xml.xml__du_functor_desc_error_0_6;
    xml__du_stag_ordered_error_0_0[7] = xml.xml__du_functor_desc_error_0_7;
    xml__du_stag_ordered_error_0_0[8] = xml.xml__du_functor_desc_error_0_8;
    xml__du_stag_ordered_error_0_0[9] = xml.xml__du_functor_desc_error_0_9;
    //
    xml__du_ptag_ordered_error_0[0] = new jmercury.runtime.DuPtagLayout(10,
		private_builtin.MR_SECTAG_REMOTE,
		xml.xml__du_stag_ordered_error_0_0);
    //
    xml__du_name_ordered_error_0[0] = xml.xml__du_functor_desc_error_0_6;
    xml__du_name_ordered_error_0[1] = xml.xml__du_functor_desc_error_0_7;
    xml__du_name_ordered_error_0[2] = xml.xml__du_functor_desc_error_0_2;
    xml__du_name_ordered_error_0[3] = xml.xml__du_functor_desc_error_0_0;
    xml__du_name_ordered_error_0[4] = xml.xml__du_functor_desc_error_0_1;
    xml__du_name_ordered_error_0[5] = xml.xml__du_functor_desc_error_0_9;
    xml__du_name_ordered_error_0[6] = xml.xml__du_functor_desc_error_0_8;
    xml__du_name_ordered_error_0[7] = xml.xml__du_functor_desc_error_0_3;
    xml__du_name_ordered_error_0[8] = xml.xml__du_functor_desc_error_0_5;
    xml__du_name_ordered_error_0[9] = xml.xml__du_functor_desc_error_0_4;
    //
    xml__functor_number_map_error_0[0] = 3;
    xml__functor_number_map_error_0[1] = 4;
    xml__functor_number_map_error_0[2] = 2;
    xml__functor_number_map_error_0[3] = 7;
    xml__functor_number_map_error_0[4] = 9;
    xml__functor_number_map_error_0[5] = 8;
    xml__functor_number_map_error_0[6] = 0;
    xml__functor_number_map_error_0[7] = 1;
    xml__functor_number_map_error_0[8] = 6;
    xml__functor_number_map_error_0[9] = 5;
    //
    xml__type_ctor_info_error_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(2))),
		((java.lang.Object) (new AddrOf2_0(3))),
		"xml",
		"error",
		new jmercury.runtime.TypeFunctors(xml.xml__du_name_ordered_error_0),
		new jmercury.runtime.TypeLayout(xml.xml__du_ptag_ordered_error_0),
		10,
		4,
		xml.xml__functor_number_map_error_0);
    //
    //
    //
    errors__ti_message_1xml__type_ctor_info_error_0.init(errors.errors__type_ctor_info_message_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(xml.xml__type_ctor_info_error_0)});
    //
    //
    pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1xml__type_ctor_info_error_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(errors.errors__type_ctor_info_err_loc_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(xml.errors__ti_message_1xml__type_ctor_info_error_0)});
    //
    //
    list__ti_list_1pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1xml__type_ctor_info_error_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(xml.pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1xml__type_ctor_info_error_0)});
    //
    xml__type_ctor_info_errors_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(4))),
		((java.lang.Object) (new AddrOf2_0(5))),
		"xml",
		"errors",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) xml.list__ti_list_1pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1xml__type_ctor_info_error_0),
		-1,
		0,
		null);
    //
    xml__field_types_parse_1_0[0] = jmercury.runtime.PseudoTypeInfo.K1;
    //
    xml__du_functor_desc_parse_1_0.init("ok",
		1,
		1,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		0,
		xml.xml__field_types_parse_1_0,
		null,
		null,
		null);
    //
    xml__field_types_parse_1_1[0] = (jmercury.runtime.PseudoTypeInfo) xml.xml__type_ctor_info_error_0;
    //
    xml__du_functor_desc_parse_1_1.init("error",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		xml.xml__field_types_parse_1_1,
		null,
		null,
		null);
    //
    xml__du_stag_ordered_parse_1_0[0] = xml.xml__du_functor_desc_parse_1_0;
    xml__du_stag_ordered_parse_1_0[1] = xml.xml__du_functor_desc_parse_1_1;
    //
    xml__du_ptag_ordered_parse_1[0] = new jmercury.runtime.DuPtagLayout(2,
		private_builtin.MR_SECTAG_REMOTE,
		xml.xml__du_stag_ordered_parse_1_0);
    //
    xml__du_name_ordered_parse_1[0] = xml.xml__du_functor_desc_parse_1_1;
    xml__du_name_ordered_parse_1[1] = xml.xml__du_functor_desc_parse_1_0;
    //
    xml__functor_number_map_parse_1[0] = 1;
    xml__functor_number_map_parse_1[1] = 0;
    //
    xml__type_ctor_info_parse_1.init(1,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf3_0(0))),
		((java.lang.Object) (new AddrOf3_0(1))),
		"xml",
		"parse",
		new jmercury.runtime.TypeFunctors(xml.xml__du_name_ordered_parse_1),
		new jmercury.runtime.TypeLayout(xml.xml__du_ptag_ordered_parse_1),
		2,
		4,
		xml.xml__functor_number_map_parse_1);
    //
    xml__du_functor_desc_ref_0_0.init("amp",
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
    xml__du_functor_desc_ref_0_1.init("lt",
		0,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		null,
		null,
		null,
		null);
    //
    xml__du_functor_desc_ref_0_2.init("gt",
		0,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		2,
		2,
		null,
		null,
		null,
		null);
    //
    xml__du_functor_desc_ref_0_3.init("apos",
		0,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		3,
		3,
		null,
		null,
		null,
		null);
    //
    xml__du_functor_desc_ref_0_4.init("quot",
		0,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		4,
		4,
		null,
		null,
		null,
		null);
    //
    xml__field_types_ref_0_5[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    xml__du_functor_desc_ref_0_5.init("dec",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		5,
		5,
		xml.xml__field_types_ref_0_5,
		null,
		null,
		null);
    //
    xml__field_types_ref_0_6[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    xml__du_functor_desc_ref_0_6.init("hex",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		6,
		6,
		xml.xml__field_types_ref_0_6,
		null,
		null,
		null);
    //
    xml__field_types_ref_0_7[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    xml__du_functor_desc_ref_0_7.init("def",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		7,
		7,
		xml.xml__field_types_ref_0_7,
		null,
		null,
		null);
    //
    xml__du_stag_ordered_ref_0_0[0] = xml.xml__du_functor_desc_ref_0_0;
    xml__du_stag_ordered_ref_0_0[1] = xml.xml__du_functor_desc_ref_0_1;
    xml__du_stag_ordered_ref_0_0[2] = xml.xml__du_functor_desc_ref_0_2;
    xml__du_stag_ordered_ref_0_0[3] = xml.xml__du_functor_desc_ref_0_3;
    xml__du_stag_ordered_ref_0_0[4] = xml.xml__du_functor_desc_ref_0_4;
    xml__du_stag_ordered_ref_0_0[5] = xml.xml__du_functor_desc_ref_0_5;
    xml__du_stag_ordered_ref_0_0[6] = xml.xml__du_functor_desc_ref_0_6;
    xml__du_stag_ordered_ref_0_0[7] = xml.xml__du_functor_desc_ref_0_7;
    //
    xml__du_ptag_ordered_ref_0[0] = new jmercury.runtime.DuPtagLayout(8,
		private_builtin.MR_SECTAG_REMOTE,
		xml.xml__du_stag_ordered_ref_0_0);
    //
    xml__du_name_ordered_ref_0[0] = xml.xml__du_functor_desc_ref_0_0;
    xml__du_name_ordered_ref_0[1] = xml.xml__du_functor_desc_ref_0_3;
    xml__du_name_ordered_ref_0[2] = xml.xml__du_functor_desc_ref_0_5;
    xml__du_name_ordered_ref_0[3] = xml.xml__du_functor_desc_ref_0_7;
    xml__du_name_ordered_ref_0[4] = xml.xml__du_functor_desc_ref_0_2;
    xml__du_name_ordered_ref_0[5] = xml.xml__du_functor_desc_ref_0_6;
    xml__du_name_ordered_ref_0[6] = xml.xml__du_functor_desc_ref_0_1;
    xml__du_name_ordered_ref_0[7] = xml.xml__du_functor_desc_ref_0_4;
    //
    xml__functor_number_map_ref_0[0] = 0;
    xml__functor_number_map_ref_0[1] = 6;
    xml__functor_number_map_ref_0[2] = 4;
    xml__functor_number_map_ref_0[3] = 1;
    xml__functor_number_map_ref_0[4] = 7;
    xml__functor_number_map_ref_0[5] = 2;
    xml__functor_number_map_ref_0[6] = 5;
    xml__functor_number_map_ref_0[7] = 3;
    //
    xml__type_ctor_info_ref_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(6))),
		((java.lang.Object) (new AddrOf2_0(7))),
		"xml",
		"ref",
		new jmercury.runtime.TypeFunctors(xml.xml__du_name_ordered_ref_0),
		new jmercury.runtime.TypeLayout(xml.xml__du_ptag_ordered_ref_0),
		8,
		4,
		xml.xml__functor_number_map_ref_0);
    //
    list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_string_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(xml.pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_string_0)});
    //
    xml__field_types_spec_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    xml__field_types_spec_0_0[1] = (jmercury.runtime.PseudoTypeInfo) xml.list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_string_0;
    //
    xml__du_functor_desc_spec_0_0.init("empty_tag",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		0,
		xml.xml__field_types_spec_0_0,
		null,
		null,
		null);
    //
    xml__field_types_spec_0_1[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    xml__du_functor_desc_spec_0_1.init("cdata",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		xml.xml__field_types_spec_0_1,
		null,
		null,
		null);
    //
    xml__field_types_spec_0_2[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    xml__du_functor_desc_spec_0_2.init("comment",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		2,
		2,
		xml.xml__field_types_spec_0_2,
		null,
		null,
		null);
    //
    xml__field_types_spec_0_3[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    xml__field_types_spec_0_3[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    xml__du_functor_desc_spec_0_3.init("procinstr",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		3,
		3,
		xml.xml__field_types_spec_0_3,
		null,
		null,
		null);
    //
    //
    xml__field_types_spec_0_4[0] = (jmercury.runtime.PseudoTypeInfo) xml.xml__type_ctor_info_ref_0;
    //
    xml__du_functor_desc_spec_0_4.init("ref",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		4,
		4,
		xml.xml__field_types_spec_0_4,
		null,
		null,
		null);
    //
    xml__field_types_spec_0_5[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    xml__du_functor_desc_spec_0_5.init("doctype",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		5,
		5,
		xml.xml__field_types_spec_0_5,
		null,
		null,
		null);
    //
    xml__du_stag_ordered_spec_0_0[0] = xml.xml__du_functor_desc_spec_0_0;
    xml__du_stag_ordered_spec_0_0[1] = xml.xml__du_functor_desc_spec_0_1;
    xml__du_stag_ordered_spec_0_0[2] = xml.xml__du_functor_desc_spec_0_2;
    xml__du_stag_ordered_spec_0_0[3] = xml.xml__du_functor_desc_spec_0_3;
    xml__du_stag_ordered_spec_0_0[4] = xml.xml__du_functor_desc_spec_0_4;
    xml__du_stag_ordered_spec_0_0[5] = xml.xml__du_functor_desc_spec_0_5;
    //
    xml__du_ptag_ordered_spec_0[0] = new jmercury.runtime.DuPtagLayout(6,
		private_builtin.MR_SECTAG_REMOTE,
		xml.xml__du_stag_ordered_spec_0_0);
    //
    xml__du_name_ordered_spec_0[0] = xml.xml__du_functor_desc_spec_0_1;
    xml__du_name_ordered_spec_0[1] = xml.xml__du_functor_desc_spec_0_2;
    xml__du_name_ordered_spec_0[2] = xml.xml__du_functor_desc_spec_0_5;
    xml__du_name_ordered_spec_0[3] = xml.xml__du_functor_desc_spec_0_0;
    xml__du_name_ordered_spec_0[4] = xml.xml__du_functor_desc_spec_0_3;
    xml__du_name_ordered_spec_0[5] = xml.xml__du_functor_desc_spec_0_4;
    //
    xml__functor_number_map_spec_0[0] = 3;
    xml__functor_number_map_spec_0[1] = 0;
    xml__functor_number_map_spec_0[2] = 1;
    xml__functor_number_map_spec_0[3] = 4;
    xml__functor_number_map_spec_0[4] = 5;
    xml__functor_number_map_spec_0[5] = 2;
    //
    xml__type_ctor_info_spec_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(8))),
		((java.lang.Object) (new AddrOf2_0(9))),
		"xml",
		"spec",
		new jmercury.runtime.TypeFunctors(xml.xml__du_name_ordered_spec_0),
		new jmercury.runtime.TypeLayout(xml.xml__du_ptag_ordered_spec_0),
		6,
		4,
		xml.xml__functor_number_map_spec_0);
    //
    //
    pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_stack_item_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(xml.xml__type_ctor_info_stack_item_0)});
    //
    list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_stack_item_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(xml.pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_stack_item_0)});
    //
    xml__type_ctor_info_stack_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(10))),
		((java.lang.Object) (new AddrOf2_0(11))),
		"xml",
		"stack",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) xml.list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_stack_item_0),
		-1,
		0,
		null);
    //
    //
    pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_tree_obj_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(xml.xml__type_ctor_info_tree_obj_0)});
    //
    list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_tree_obj_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(xml.pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_tree_obj_0)});
    //
    xml__field_types_stack_item_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    xml__field_types_stack_item_0_0[1] = (jmercury.runtime.PseudoTypeInfo) xml.list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_string_0;
    xml__field_types_stack_item_0_0[2] = (jmercury.runtime.PseudoTypeInfo) xml.list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_tree_obj_0;
    //
    xml__du_functor_desc_stack_item_0_0.init("s",
		3,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		xml.xml__field_types_stack_item_0_0,
		null,
		null,
		null);
    //
    xml__du_stag_ordered_stack_item_0_0[0] = xml.xml__du_functor_desc_stack_item_0_0;
    //
    xml__du_ptag_ordered_stack_item_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		xml.xml__du_stag_ordered_stack_item_0_0);
    //
    xml__du_name_ordered_stack_item_0[0] = xml.xml__du_functor_desc_stack_item_0_0;
    //
    xml__functor_number_map_stack_item_0[0] = 0;
    //
    xml__type_ctor_info_stack_item_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(12))),
		((java.lang.Object) (new AddrOf2_0(13))),
		"xml",
		"stack_item",
		new jmercury.runtime.TypeFunctors(xml.xml__du_name_ordered_stack_item_0),
		new jmercury.runtime.TypeLayout(xml.xml__du_ptag_ordered_stack_item_0),
		1,
		4,
		xml.xml__functor_number_map_stack_item_0);
    //
    pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_stream_obj_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(xml.xml__type_ctor_info_stream_obj_0)});
    //
    list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_stream_obj_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(xml.pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_stream_obj_0)});
    //
    xml__type_ctor_info_stream_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(14))),
		((java.lang.Object) (new AddrOf2_0(15))),
		"xml",
		"stream",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) xml.list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_stream_obj_0),
		-1,
		0,
		null);
    //
    xml__type_ctor_info_stream_item_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(16))),
		((java.lang.Object) (new AddrOf2_0(17))),
		"xml",
		"stream_item",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) xml.pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_stream_obj_0),
		-1,
		0,
		null);
    //
    xml__field_types_stream_obj_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    xml__du_functor_desc_stream_obj_0_0.init("text",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		0,
		xml.xml__field_types_stream_obj_0_0,
		null,
		null,
		null);
    //
    //
    xml__field_types_stream_obj_0_1[0] = (jmercury.runtime.PseudoTypeInfo) xml.xml__type_ctor_info_spec_0;
    //
    xml__du_functor_desc_stream_obj_0_1.init("spec",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		xml.xml__field_types_stream_obj_0_1,
		null,
		null,
		null);
    //
    xml__field_types_stream_obj_0_2[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    xml__du_functor_desc_stream_obj_0_2.init("empty_tag",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		2,
		2,
		xml.xml__field_types_stream_obj_0_2,
		null,
		null,
		null);
    //
    xml__field_types_stream_obj_0_3[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    xml__field_types_stream_obj_0_3[1] = (jmercury.runtime.PseudoTypeInfo) xml.list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_string_0;
    //
    xml__du_functor_desc_stream_obj_0_3.init("start_tag",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		3,
		3,
		xml.xml__field_types_stream_obj_0_3,
		null,
		null,
		null);
    //
    xml__field_types_stream_obj_0_4[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    xml__du_functor_desc_stream_obj_0_4.init("end_tag",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		4,
		4,
		xml.xml__field_types_stream_obj_0_4,
		null,
		null,
		null);
    //
    xml__du_stag_ordered_stream_obj_0_0[0] = xml.xml__du_functor_desc_stream_obj_0_0;
    xml__du_stag_ordered_stream_obj_0_0[1] = xml.xml__du_functor_desc_stream_obj_0_1;
    xml__du_stag_ordered_stream_obj_0_0[2] = xml.xml__du_functor_desc_stream_obj_0_2;
    xml__du_stag_ordered_stream_obj_0_0[3] = xml.xml__du_functor_desc_stream_obj_0_3;
    xml__du_stag_ordered_stream_obj_0_0[4] = xml.xml__du_functor_desc_stream_obj_0_4;
    //
    xml__du_ptag_ordered_stream_obj_0[0] = new jmercury.runtime.DuPtagLayout(5,
		private_builtin.MR_SECTAG_REMOTE,
		xml.xml__du_stag_ordered_stream_obj_0_0);
    //
    xml__du_name_ordered_stream_obj_0[0] = xml.xml__du_functor_desc_stream_obj_0_2;
    xml__du_name_ordered_stream_obj_0[1] = xml.xml__du_functor_desc_stream_obj_0_4;
    xml__du_name_ordered_stream_obj_0[2] = xml.xml__du_functor_desc_stream_obj_0_1;
    xml__du_name_ordered_stream_obj_0[3] = xml.xml__du_functor_desc_stream_obj_0_3;
    xml__du_name_ordered_stream_obj_0[4] = xml.xml__du_functor_desc_stream_obj_0_0;
    //
    xml__functor_number_map_stream_obj_0[0] = 4;
    xml__functor_number_map_stream_obj_0[1] = 2;
    xml__functor_number_map_stream_obj_0[2] = 0;
    xml__functor_number_map_stream_obj_0[3] = 3;
    xml__functor_number_map_stream_obj_0[4] = 1;
    //
    xml__type_ctor_info_stream_obj_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(18))),
		((java.lang.Object) (new AddrOf2_0(19))),
		"xml",
		"stream_obj",
		new jmercury.runtime.TypeFunctors(xml.xml__du_name_ordered_stream_obj_0),
		new jmercury.runtime.TypeLayout(xml.xml__du_ptag_ordered_stream_obj_0),
		5,
		4,
		xml.xml__functor_number_map_stream_obj_0);
    //
    xml__enum_functor_desc_tagtype_0_0.init("end",
		0);
    //
    xml__enum_functor_desc_tagtype_0_1.init("other",
		1);
    //
    xml__enum_value_ordered_tagtype_0[0] = xml.xml__enum_functor_desc_tagtype_0_0;
    xml__enum_value_ordered_tagtype_0[1] = xml.xml__enum_functor_desc_tagtype_0_1;
    //
    xml__enum_name_ordered_tagtype_0[0] = xml.xml__enum_functor_desc_tagtype_0_0;
    xml__enum_name_ordered_tagtype_0[1] = xml.xml__enum_functor_desc_tagtype_0_1;
    //
    xml__functor_number_map_tagtype_0[0] = 0;
    xml__functor_number_map_tagtype_0[1] = 1;
    //
    xml__type_ctor_info_tagtype_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_ENUM,
		((java.lang.Object) (new AddrOf2_0(20))),
		((java.lang.Object) (new AddrOf2_0(21))),
		"xml",
		"tagtype",
		new jmercury.runtime.TypeFunctors(xml.xml__enum_name_ordered_tagtype_0),
		new jmercury.runtime.TypeLayout(xml.xml__enum_value_ordered_tagtype_0),
		2,
		4,
		xml.xml__functor_number_map_tagtype_0);
    //
    pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_character_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_character_0)});
    //
    xml__type_ctor_info_token_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(22))),
		((java.lang.Object) (new AddrOf2_0(23))),
		"xml",
		"token",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) xml.pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_character_0),
		-1,
		0,
		null);
    //
    xml__type_ctor_info_tree_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(24))),
		((java.lang.Object) (new AddrOf2_0(25))),
		"xml",
		"tree",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) xml.list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_tree_obj_0),
		-1,
		0,
		null);
    //
    xml__type_ctor_info_tree_item_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(26))),
		((java.lang.Object) (new AddrOf2_0(27))),
		"xml",
		"tree_item",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) xml.pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_tree_obj_0),
		-1,
		0,
		null);
    //
    xml__field_types_tree_obj_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    xml__du_functor_desc_tree_obj_0_0.init("text",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		0,
		xml.xml__field_types_tree_obj_0_0,
		null,
		null,
		null);
    //
    xml__field_types_tree_obj_0_1[0] = (jmercury.runtime.PseudoTypeInfo) xml.xml__type_ctor_info_spec_0;
    //
    xml__du_functor_desc_tree_obj_0_1.init("spec",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		xml.xml__field_types_tree_obj_0_1,
		null,
		null,
		null);
    //
    xml__field_types_tree_obj_0_2[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    xml__field_types_tree_obj_0_2[1] = (jmercury.runtime.PseudoTypeInfo) xml.list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_string_0;
    xml__field_types_tree_obj_0_2[2] = (jmercury.runtime.PseudoTypeInfo) xml.list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_int_0xml__type_ctor_info_tree_obj_0;
    //
    xml__du_functor_desc_tree_obj_0_2.init("element",
		3,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		2,
		2,
		xml.xml__field_types_tree_obj_0_2,
		null,
		null,
		null);
    //
    xml__du_stag_ordered_tree_obj_0_0[0] = xml.xml__du_functor_desc_tree_obj_0_0;
    xml__du_stag_ordered_tree_obj_0_0[1] = xml.xml__du_functor_desc_tree_obj_0_1;
    xml__du_stag_ordered_tree_obj_0_0[2] = xml.xml__du_functor_desc_tree_obj_0_2;
    //
    xml__du_ptag_ordered_tree_obj_0[0] = new jmercury.runtime.DuPtagLayout(3,
		private_builtin.MR_SECTAG_REMOTE,
		xml.xml__du_stag_ordered_tree_obj_0_0);
    //
    xml__du_name_ordered_tree_obj_0[0] = xml.xml__du_functor_desc_tree_obj_0_2;
    xml__du_name_ordered_tree_obj_0[1] = xml.xml__du_functor_desc_tree_obj_0_1;
    xml__du_name_ordered_tree_obj_0[2] = xml.xml__du_functor_desc_tree_obj_0_0;
    //
    xml__functor_number_map_tree_obj_0[0] = 2;
    xml__functor_number_map_tree_obj_0[1] = 1;
    xml__functor_number_map_tree_obj_0[2] = 0;
    //
    xml__type_ctor_info_tree_obj_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(28))),
		((java.lang.Object) (new AddrOf2_0(29))),
		"xml",
		"tree_obj",
		new jmercury.runtime.TypeFunctors(xml.xml__du_name_ordered_tree_obj_0),
		new jmercury.runtime.TypeLayout(xml.xml__du_ptag_ordered_tree_obj_0),
		3,
		4,
		xml.xml__functor_number_map_tree_obj_0);
  }

// DataDefns
  static {
  }

// Scalar common data
  private static final jmercury.runtime.TypeInfo_Struct[] MR_scalar_common_1 = new jmercury.runtime.TypeInfo_Struct[10];
  private static final list.List_1.F_nil_0[] MR_scalar_common_2 = new list.List_1.F_nil_0[1];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_3 = new /* generic_type */ java.lang.Object[1][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_4 = new /* generic_type */ java.lang.Object[1][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_5 = new /* generic_type */ java.lang.Object[5][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_6 = new /* generic_type */ java.lang.Object[2][];
  private static final xml.Error_0.Expected_1[] MR_scalar_common_7 = new xml.Error_0.Expected_1[6];
  private static final xml.Parse_1.Error_1[] MR_scalar_common_8 = new xml.Parse_1.Error_1[10];
  private static final xml.Error_0.Eof_0[] MR_scalar_common_9 = new xml.Error_0.Eof_0[1];
  private static final xml.Error_0.Dangling_1[] MR_scalar_common_10 = new xml.Error_0.Dangling_1[3];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_11 = new /* generic_type */ java.lang.Object[1][];
  private static final xml.Ref_0.Amp_0[] MR_scalar_common_12 = new xml.Ref_0.Amp_0[1];
  private static final xml.Spec_0.Ref_1[] MR_scalar_common_13 = new xml.Spec_0.Ref_1[1];
  private static final xml.Stream_obj_0.Spec_1[] MR_scalar_common_14 = new xml.Stream_obj_0.Spec_1[1];
  private static final xml.Ref_0.Lt_0[] MR_scalar_common_15 = new xml.Ref_0.Lt_0[1];
  private static final xml.Ref_0.Gt_0[] MR_scalar_common_16 = new xml.Ref_0.Gt_0[1];
  private static final xml.Ref_0.Apos_0[] MR_scalar_common_17 = new xml.Ref_0.Apos_0[1];
  private static final xml.Ref_0.Quot_0[] MR_scalar_common_18 = new xml.Ref_0.Quot_0[1];
  private static void MR_init_scalars_0() {
    MR_scalar_common_1[0] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(xml.xml__type_ctor_info_stream_obj_0))));
    MR_scalar_common_1[1] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_character_0))));
    MR_scalar_common_1[2] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0))));
    MR_scalar_common_1[3] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(xml.xml__type_ctor_info_tree_obj_0))));
    MR_scalar_common_1[4] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(xml.xml__type_ctor_info_stack_item_0))));
    MR_scalar_common_1[5] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(errors.errors__type_ctor_info_messages_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(xml.xml__type_ctor_info_error_0))));
    MR_scalar_common_1[6] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[2]))));
    MR_scalar_common_1[7] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[4]))));
    MR_scalar_common_1[8] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[3]))));
    MR_scalar_common_1[9] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[0]))));
    MR_scalar_common_2[0] = new list.List_1.F_nil_0();
    MR_scalar_common_3[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(4),
		((java.lang.Object) (io.io__type_ctor_info_output_stream_0)),
		((java.lang.Object) (xml.pair__pti_pair_2__plain_builtin__type_ctor_info_int_0__plain_xml__type_ctor_info_stream_obj_0)),
		((java.lang.Object) (io.io__type_ctor_info_state_0)),
		((java.lang.Object) (io.io__type_ctor_info_state_0))};
    MR_scalar_common_4[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(2),
		((java.lang.Object) (xml.pair__pti_pair_2__plain_builtin__type_ctor_info_int_0__plain_xml__type_ctor_info_stream_obj_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0))};
    MR_scalar_common_5[0] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (xml.MR_scalar_common_4[0])),
		((java.lang.Object) (new AddrOf2_0(30))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_6[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(3),
		((java.lang.Object) (xml.pair__pti_pair_2__plain_builtin__type_ctor_info_int_0__plain_xml__type_ctor_info_stream_obj_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0))};
    MR_scalar_common_5[1] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (xml.MR_scalar_common_6[0])),
		((java.lang.Object) (new AddrOf3_0(3))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_6[1] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(3),
		((java.lang.Object) (xml.pair__pti_pair_2__plain_builtin__type_ctor_info_int_0__plain_xml__type_ctor_info_stream_obj_0)),
		((java.lang.Object) (io.io__type_ctor_info_state_0)),
		((java.lang.Object) (io.io__type_ctor_info_state_0))};
    MR_scalar_common_5[2] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (xml.MR_scalar_common_6[1])),
		((java.lang.Object) (new AddrOf3_0(4))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_11[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(1),
		((java.lang.Object) (builtin.builtin__type_ctor_info_character_0))};
    MR_scalar_common_5[3] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (xml.MR_scalar_common_11[0])),
		((java.lang.Object) (new AddrOf2_0(31))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_5[4] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (xml.MR_scalar_common_11[0])),
		((java.lang.Object) (new AddrOf2_0(32))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_7[0] = new xml.Error_0.Expected_1("\'?>\'");
    MR_scalar_common_7[1] = new xml.Error_0.Expected_1("white space");
    MR_scalar_common_7[2] = new xml.Error_0.Expected_1("name");
    MR_scalar_common_7[3] = new xml.Error_0.Expected_1(">");
    MR_scalar_common_7[4] = new xml.Error_0.Expected_1("\'CDATA[\'");
    MR_scalar_common_7[5] = new xml.Error_0.Expected_1("\'OCTYPE\'");
    MR_scalar_common_8[0] = new xml.Parse_1.Error_1((xml.Error_0) xml.MR_scalar_common_7[0]);
    MR_scalar_common_8[1] = new xml.Parse_1.Error_1((xml.Error_0) xml.MR_scalar_common_7[1]);
    MR_scalar_common_8[2] = new xml.Parse_1.Error_1((xml.Error_0) xml.MR_scalar_common_7[2]);
    MR_scalar_common_9[0] = new xml.Error_0.Eof_0();
    MR_scalar_common_8[3] = new xml.Parse_1.Error_1((xml.Error_0) xml.MR_scalar_common_9[0]);
    MR_scalar_common_8[4] = new xml.Parse_1.Error_1((xml.Error_0) xml.MR_scalar_common_7[3]);
    MR_scalar_common_10[0] = new xml.Error_0.Dangling_1("comment block");
    MR_scalar_common_8[5] = new xml.Parse_1.Error_1((xml.Error_0) xml.MR_scalar_common_10[0]);
    MR_scalar_common_10[1] = new xml.Error_0.Dangling_1("cdata block");
    MR_scalar_common_8[6] = new xml.Parse_1.Error_1((xml.Error_0) xml.MR_scalar_common_10[1]);
    MR_scalar_common_8[7] = new xml.Parse_1.Error_1((xml.Error_0) xml.MR_scalar_common_7[4]);
    MR_scalar_common_10[2] = new xml.Error_0.Dangling_1("doctype block");
    MR_scalar_common_8[8] = new xml.Parse_1.Error_1((xml.Error_0) xml.MR_scalar_common_10[2]);
    MR_scalar_common_8[9] = new xml.Parse_1.Error_1((xml.Error_0) xml.MR_scalar_common_7[5]);
    MR_scalar_common_12[0] = new xml.Ref_0.Amp_0();
    MR_scalar_common_13[0] = new xml.Spec_0.Ref_1((xml.Ref_0) xml.MR_scalar_common_12[0]);
    MR_scalar_common_14[0] = new xml.Stream_obj_0.Spec_1((xml.Spec_0) xml.MR_scalar_common_13[0]);
    MR_scalar_common_15[0] = new xml.Ref_0.Lt_0();
    MR_scalar_common_16[0] = new xml.Ref_0.Gt_0();
    MR_scalar_common_17[0] = new xml.Ref_0.Apos_0();
    MR_scalar_common_18[0] = new xml.Ref_0.Quot_0();
  }
  static {
    MR_init_scalars_0();
  }

// Vector common data
//  xml.m:662
  private static final class Vector_common_type_19_0
  {
    public final java.lang.String vct_19_f_0;
    public final int vct_19_f_1;

    public Vector_common_type_19_0(
      java.lang.String vct_19_f_0,
      int vct_19_f_1)
    {
      {
        this.vct_19_f_0 = vct_19_f_0;
        this.vct_19_f_1 = vct_19_f_1;
      }
    }
  }

  private static final xml.Vector_common_type_19_0 MR_vector_common_19[] = {
    new xml.Vector_common_type_19_0("body",
		0),
		new xml.Vector_common_type_19_0("colgroup",
		1),
		new xml.Vector_common_type_19_0("dd",
		2),
		new xml.Vector_common_type_19_0("dt",
		3),
		new xml.Vector_common_type_19_0("head",
		4),
		new xml.Vector_common_type_19_0("html",
		5),
		new xml.Vector_common_type_19_0("li",
		6),
		new xml.Vector_common_type_19_0("option",
		7),
		new xml.Vector_common_type_19_0("p",
		8),
		new xml.Vector_common_type_19_0("tbody",
		9),
		new xml.Vector_common_type_19_0("td",
		10),
		new xml.Vector_common_type_19_0("tfoot",
		11),
		new xml.Vector_common_type_19_0("th",
		12),
		new xml.Vector_common_type_19_0("thead",
		13),
		new xml.Vector_common_type_19_0("tr",
		14),
		new xml.Vector_common_type_19_0("area",
		0),
		new xml.Vector_common_type_19_0("base",
		1),
		new xml.Vector_common_type_19_0("basefont",
		2),
		new xml.Vector_common_type_19_0("br",
		3),
		new xml.Vector_common_type_19_0("col",
		4),
		new xml.Vector_common_type_19_0("frame",
		5),
		new xml.Vector_common_type_19_0("hr",
		6),
		new xml.Vector_common_type_19_0("img",
		7),
		new xml.Vector_common_type_19_0("input",
		8),
		new xml.Vector_common_type_19_0("isindex",
		9),
		new xml.Vector_common_type_19_0("link",
		10),
		new xml.Vector_common_type_19_0("meta",
		11),
		new xml.Vector_common_type_19_0("param",
		12),
		new xml.Vector_common_type_19_0("body",
		0),
		new xml.Vector_common_type_19_0("colgroup",
		1),
		new xml.Vector_common_type_19_0("dd",
		2),
		new xml.Vector_common_type_19_0("dt",
		3),
		new xml.Vector_common_type_19_0("head",
		4),
		new xml.Vector_common_type_19_0("html",
		5),
		new xml.Vector_common_type_19_0("li",
		6),
		new xml.Vector_common_type_19_0("option",
		7),
		new xml.Vector_common_type_19_0("p",
		8),
		new xml.Vector_common_type_19_0("tbody",
		9),
		new xml.Vector_common_type_19_0("td",
		10),
		new xml.Vector_common_type_19_0("tfoot",
		11),
		new xml.Vector_common_type_19_0("th",
		12),
		new xml.Vector_common_type_19_0("thead",
		13),
		new xml.Vector_common_type_19_0("tr",
		14)
  };

// NonDataDefns
  private static boolean __Unify____attribute_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = xml.__Unify____attribute_0_0(((pair.Pair_2) wrapper_arg_1), ((pair.Pair_2) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____attribute_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = xml.__Compare____attribute_0_0(((pair.Pair_2) wrapper_arg_2), ((pair.Pair_2) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____error_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = xml.__Unify____error_0_0(((xml.Error_0) wrapper_arg_1), ((xml.Error_0) wrapper_arg_2));
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
        conv0_HeadVar__1_1 = xml.__Compare____error_0_0(((xml.Error_0) wrapper_arg_2), ((xml.Error_0) wrapper_arg_3));
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
        succeeded = xml.__Unify____errors_0_0(((list.List_1) wrapper_arg_1), ((list.List_1) wrapper_arg_2));
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
        conv0_HeadVar__1_1 = xml.__Compare____errors_0_0(((list.List_1) wrapper_arg_2), ((list.List_1) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____parse_1_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      boolean succeeded = false;

      {
        succeeded = xml.__Unify____parse_1_0(((jmercury.runtime.TypeInfo_Struct) wrapper_arg_1), ((xml.Parse_1) wrapper_arg_2), ((xml.Parse_1) wrapper_arg_3));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____parse_1_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_3,
    java.lang.Object wrapper_arg_4)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = xml.__Compare____parse_1_0(((jmercury.runtime.TypeInfo_Struct) wrapper_arg_1), ((xml.Parse_1) wrapper_arg_3), ((xml.Parse_1) wrapper_arg_4));
      }
      wrapper_arg_2 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_2;
    }
  }
  private static boolean __Unify____ref_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = xml.__Unify____ref_0_0(((xml.Ref_0) wrapper_arg_1), ((xml.Ref_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____ref_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = xml.__Compare____ref_0_0(((xml.Ref_0) wrapper_arg_2), ((xml.Ref_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____spec_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = xml.__Unify____spec_0_0(((xml.Spec_0) wrapper_arg_1), ((xml.Spec_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____spec_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = xml.__Compare____spec_0_0(((xml.Spec_0) wrapper_arg_2), ((xml.Spec_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____stack_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = xml.__Unify____stack_0_0(((list.List_1) wrapper_arg_1), ((list.List_1) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____stack_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = xml.__Compare____stack_0_0(((list.List_1) wrapper_arg_2), ((list.List_1) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____stack_item_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = xml.__Unify____stack_item_0_0(((xml.Stack_item_0) wrapper_arg_1), ((xml.Stack_item_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____stack_item_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = xml.__Compare____stack_item_0_0(((xml.Stack_item_0) wrapper_arg_2), ((xml.Stack_item_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____stream_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = xml.__Unify____stream_0_0(((list.List_1) wrapper_arg_1), ((list.List_1) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____stream_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = xml.__Compare____stream_0_0(((list.List_1) wrapper_arg_2), ((list.List_1) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____stream_item_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = xml.__Unify____stream_item_0_0(((pair.Pair_2) wrapper_arg_1), ((pair.Pair_2) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____stream_item_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = xml.__Compare____stream_item_0_0(((pair.Pair_2) wrapper_arg_2), ((pair.Pair_2) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____stream_obj_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = xml.__Unify____stream_obj_0_0(((xml.Stream_obj_0) wrapper_arg_1), ((xml.Stream_obj_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____stream_obj_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = xml.__Compare____stream_obj_0_0(((xml.Stream_obj_0) wrapper_arg_2), ((xml.Stream_obj_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____tagtype_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = xml.__Unify____tagtype_0_0(((xml.Tagtype_0) wrapper_arg_1), ((xml.Tagtype_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____tagtype_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = xml.__Compare____tagtype_0_0(((xml.Tagtype_0) wrapper_arg_2), ((xml.Tagtype_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____token_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = xml.__Unify____token_0_0(((pair.Pair_2) wrapper_arg_1), ((pair.Pair_2) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____token_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = xml.__Compare____token_0_0(((pair.Pair_2) wrapper_arg_2), ((pair.Pair_2) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____tree_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = xml.__Unify____tree_0_0(((list.List_1) wrapper_arg_1), ((list.List_1) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____tree_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = xml.__Compare____tree_0_0(((list.List_1) wrapper_arg_2), ((list.List_1) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____tree_item_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = xml.__Unify____tree_item_0_0(((pair.Pair_2) wrapper_arg_1), ((pair.Pair_2) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____tree_item_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = xml.__Compare____tree_item_0_0(((pair.Pair_2) wrapper_arg_2), ((pair.Pair_2) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____tree_obj_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = xml.__Unify____tree_obj_0_0(((xml.Tree_obj_0) wrapper_arg_1), ((xml.Tree_obj_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____tree_obj_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = xml.__Compare____tree_obj_0_0(((xml.Tree_obj_0) wrapper_arg_2), ((xml.Tree_obj_0) wrapper_arg_3));
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
              return_value = xml.__Unify____attribute_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 1:
          {
            java.lang.Object return_value = null;

            {
              return_value = xml.__Compare____attribute_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 2:
          {
            boolean return_value = false;

            {
              return_value = xml.__Unify____error_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 3:
          {
            java.lang.Object return_value = null;

            {
              return_value = xml.__Compare____error_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 4:
          {
            boolean return_value = false;

            {
              return_value = xml.__Unify____errors_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 5:
          {
            java.lang.Object return_value = null;

            {
              return_value = xml.__Compare____errors_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 6:
          {
            boolean return_value = false;

            {
              return_value = xml.__Unify____ref_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 7:
          {
            java.lang.Object return_value = null;

            {
              return_value = xml.__Compare____ref_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 8:
          {
            boolean return_value = false;

            {
              return_value = xml.__Unify____spec_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 9:
          {
            java.lang.Object return_value = null;

            {
              return_value = xml.__Compare____spec_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 10:
          {
            boolean return_value = false;

            {
              return_value = xml.__Unify____stack_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 11:
          {
            java.lang.Object return_value = null;

            {
              return_value = xml.__Compare____stack_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 12:
          {
            boolean return_value = false;

            {
              return_value = xml.__Unify____stack_item_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 13:
          {
            java.lang.Object return_value = null;

            {
              return_value = xml.__Compare____stack_item_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 14:
          {
            boolean return_value = false;

            {
              return_value = xml.__Unify____stream_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 15:
          {
            java.lang.Object return_value = null;

            {
              return_value = xml.__Compare____stream_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 16:
          {
            boolean return_value = false;

            {
              return_value = xml.__Unify____stream_item_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 17:
          {
            java.lang.Object return_value = null;

            {
              return_value = xml.__Compare____stream_item_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 18:
          {
            boolean return_value = false;

            {
              return_value = xml.__Unify____stream_obj_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 19:
          {
            java.lang.Object return_value = null;

            {
              return_value = xml.__Compare____stream_obj_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 20:
          {
            boolean return_value = false;

            {
              return_value = xml.__Unify____tagtype_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 21:
          {
            java.lang.Object return_value = null;

            {
              return_value = xml.__Compare____tagtype_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 22:
          {
            boolean return_value = false;

            {
              return_value = xml.__Unify____token_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 23:
          {
            java.lang.Object return_value = null;

            {
              return_value = xml.__Compare____token_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 24:
          {
            boolean return_value = false;

            {
              return_value = xml.__Unify____tree_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 25:
          {
            java.lang.Object return_value = null;

            {
              return_value = xml.__Compare____tree_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 26:
          {
            boolean return_value = false;

            {
              return_value = xml.__Unify____tree_item_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 27:
          {
            java.lang.Object return_value = null;

            {
              return_value = xml.__Compare____tree_item_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 28:
          {
            boolean return_value = false;

            {
              return_value = xml.__Unify____tree_obj_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 29:
          {
            java.lang.Object return_value = null;

            {
              return_value = xml.__Compare____tree_obj_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 30:
          {
            java.lang.Object return_value = null;

            {
              return_value = xml.to_string_2_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 31:
          {
            boolean return_value = false;

            {
              return_value = xml.parse_reference_4_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 32:
          {
            boolean return_value = false;

            {
              return_value = xml.parse_reference_4_p_0_2(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
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
            boolean return_value = false;

            {
              return_value = xml.__Unify____parse_1_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 1:
          {
            java.lang.Object return_value = null;

            {
              return_value = xml.__Compare____parse_1_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 2:
          {
            java.lang.Object return_value = null;

            {
              return_value = xml.write_4_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 3:
          {
            java.lang.Object return_value = null;

            {
              return_value = xml.stream2str_2_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 4:
          {
            java.lang.Object return_value = null;

            {
              return_value = xml.dump_stream_3_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
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

//  xml.m:87
  public static class Error_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Spec_3
      extends xml.Error_0
    {
      public java.lang.String F1;
      public java.lang.String F2;
      public java.lang.String F3;

      public Spec_3()
      {
        {
        }
      }
      public Spec_3(
        java.lang.String F1,
        java.lang.String F2,
        java.lang.String F3)
      {
        {
          (this).data_tag = 9;
          this.F1 = F1;
          this.F2 = F2;
          this.F3 = F3;
        }
      }
    }

    public static class Unbalanced_tags_2
      extends xml.Error_0
    {
      public java.lang.String F1;
      public java.lang.String F2;

      public Unbalanced_tags_2()
      {
        {
        }
      }
      public Unbalanced_tags_2(
        java.lang.String F1,
        java.lang.String F2)
      {
        {
          (this).data_tag = 8;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Dangling_name_2
      extends xml.Error_0
    {
      public java.lang.String F1;
      public java.lang.String F2;

      public Dangling_name_2()
      {
        {
        }
      }
      public Dangling_name_2(
        java.lang.String F1,
        java.lang.String F2)
      {
        {
          (this).data_tag = 7;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Dangling_1
      extends xml.Error_0
    {
      public java.lang.String F1;

      public Dangling_1()
      {
        {
        }
      }
      public Dangling_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 6;
          this.F1 = F1;
        }
      }
    }

    public static class Unexpected_in_name_3
      extends xml.Error_0
    {
      public java.lang.String F1;
      public java.lang.String F2;
      public java.lang.String F3;

      public Unexpected_in_name_3()
      {
        {
        }
      }
      public Unexpected_in_name_3(
        java.lang.String F1,
        java.lang.String F2,
        java.lang.String F3)
      {
        {
          (this).data_tag = 5;
          this.F1 = F1;
          this.F2 = F2;
          this.F3 = F3;
        }
      }
    }

    public static class Unexpected_name_2
      extends xml.Error_0
    {
      public java.lang.String F1;
      public java.lang.String F2;

      public Unexpected_name_2()
      {
        {
        }
      }
      public Unexpected_name_2(
        java.lang.String F1,
        java.lang.String F2)
      {
        {
          (this).data_tag = 4;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Unexpected_char_at_2
      extends xml.Error_0
    {
      public int F1;
      public int F2;

      public Unexpected_char_at_2()
      {
        {
        }
      }
      public Unexpected_char_at_2(
        int F1,
        int F2)
      {
        {
          (this).data_tag = 3;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Ebf_at_3
      extends xml.Error_0
    {
      public java.lang.String F1;
      public int F2;
      public int F3;

      public Ebf_at_3()
      {
        {
        }
      }
      public Ebf_at_3(
        java.lang.String F1,
        int F2,
        int F3)
      {
        {
          (this).data_tag = 2;
          this.F1 = F1;
          this.F2 = F2;
          this.F3 = F3;
        }
      }
    }

    public static class Expected_1
      extends xml.Error_0
    {
      public java.lang.String F1;

      public Expected_1()
      {
        {
        }
      }
      public Expected_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
        }
      }
    }

    public static class Eof_0
      extends xml.Error_0
    {

      public Eof_0()
      {
        {
          (this).data_tag = 0;
        }
      }
    }


  }

//  xml.m:80
  public static class Parse_1<MR_tvar_1>
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Error_1<MR_tvar_1>
      extends xml.Parse_1
    {
      public xml.Error_0 F1;

      public Error_1()
      {
        {
        }
      }
      public Error_1(
        xml.Error_0 F1)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
        }
      }
    }

    public static class Ok_1<MR_tvar_1>
      extends xml.Parse_1
    {
      public MR_tvar_1 F1;

      public Ok_1()
      {
        {
        }
      }
      public Ok_1(
        MR_tvar_1 F1)
      {
        {
          (this).data_tag = 0;
          this.F1 = F1;
        }
      }
    }


  }

//  xml.m:21
  public static class Ref_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Def_1
      extends xml.Ref_0
    {
      public java.lang.String F1;

      public Def_1()
      {
        {
        }
      }
      public Def_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 7;
          this.F1 = F1;
        }
      }
    }

    public static class Hex_1
      extends xml.Ref_0
    {
      public int F1;

      public Hex_1()
      {
        {
        }
      }
      public Hex_1(
        int F1)
      {
        {
          (this).data_tag = 6;
          this.F1 = F1;
        }
      }
    }

    public static class Dec_1
      extends xml.Ref_0
    {
      public int F1;

      public Dec_1()
      {
        {
        }
      }
      public Dec_1(
        int F1)
      {
        {
          (this).data_tag = 5;
          this.F1 = F1;
        }
      }
    }

    public static class Quot_0
      extends xml.Ref_0
    {

      public Quot_0()
      {
        {
          (this).data_tag = 4;
        }
      }
    }

    public static class Apos_0
      extends xml.Ref_0
    {

      public Apos_0()
      {
        {
          (this).data_tag = 3;
        }
      }
    }

    public static class Gt_0
      extends xml.Ref_0
    {

      public Gt_0()
      {
        {
          (this).data_tag = 2;
        }
      }
    }

    public static class Lt_0
      extends xml.Ref_0
    {

      public Lt_0()
      {
        {
          (this).data_tag = 1;
        }
      }
    }

    public static class Amp_0
      extends xml.Ref_0
    {

      public Amp_0()
      {
        {
          (this).data_tag = 0;
        }
      }
    }


  }

//  xml.m:18
  public static class Spec_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Doctype_1
      extends xml.Spec_0
    {
      public java.lang.String F1;

      public Doctype_1()
      {
        {
        }
      }
      public Doctype_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 5;
          this.F1 = F1;
        }
      }
    }

    public static class Ref_1
      extends xml.Spec_0
    {
      public xml.Ref_0 F1;

      public Ref_1()
      {
        {
        }
      }
      public Ref_1(
        xml.Ref_0 F1)
      {
        {
          (this).data_tag = 4;
          this.F1 = F1;
        }
      }
    }

    public static class Procinstr_2
      extends xml.Spec_0
    {
      public java.lang.String F1;
      public java.lang.String F2;

      public Procinstr_2()
      {
        {
        }
      }
      public Procinstr_2(
        java.lang.String F1,
        java.lang.String F2)
      {
        {
          (this).data_tag = 3;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Comment_1
      extends xml.Spec_0
    {
      public java.lang.String F1;

      public Comment_1()
      {
        {
        }
      }
      public Comment_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 2;
          this.F1 = F1;
        }
      }
    }

    public static class Cdata_1
      extends xml.Spec_0
    {
      public java.lang.String F1;

      public Cdata_1()
      {
        {
        }
      }
      public Cdata_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
        }
      }
    }

    public static class Empty_tag_2
      extends xml.Spec_0
    {
      public java.lang.String F1;
      public list.List_1<pair.Pair_2<java.lang.String, java.lang.String>> F2;

      public Empty_tag_2()
      {
        {
        }
      }
      public Empty_tag_2(
        java.lang.String F1,
        list.List_1<pair.Pair_2<java.lang.String, java.lang.String>> F2)
      {
        {
          (this).data_tag = 0;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }


  }

//  xml.m:85
  public static class Stack_item_0
    implements jmercury.runtime.MercuryType
  {
    public java.lang.String F1;
    public list.List_1<pair.Pair_2<java.lang.String, java.lang.String>> F2;
    public list.List_1<pair.Pair_2<java.lang.Integer, xml.Tree_obj_0>> F3;

    public Stack_item_0()
    {
      {
      }
    }
    public Stack_item_0(
      java.lang.String F1,
      list.List_1<pair.Pair_2<java.lang.String, java.lang.String>> F2,
      list.List_1<pair.Pair_2<java.lang.Integer, xml.Tree_obj_0>> F3)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
      }
    }
  }

//  xml.m:10
  public static class Stream_obj_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class End_tag_1
      extends xml.Stream_obj_0
    {
      public java.lang.String F1;

      public End_tag_1()
      {
        {
        }
      }
      public End_tag_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 4;
          this.F1 = F1;
        }
      }
    }

    public static class Start_tag_2
      extends xml.Stream_obj_0
    {
      public java.lang.String F1;
      public list.List_1<pair.Pair_2<java.lang.String, java.lang.String>> F2;

      public Start_tag_2()
      {
        {
        }
      }
      public Start_tag_2(
        java.lang.String F1,
        list.List_1<pair.Pair_2<java.lang.String, java.lang.String>> F2)
      {
        {
          (this).data_tag = 3;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Empty_tag_1
      extends xml.Stream_obj_0
    {
      public java.lang.String F1;

      public Empty_tag_1()
      {
        {
        }
      }
      public Empty_tag_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 2;
          this.F1 = F1;
        }
      }
    }

    public static class Spec_1
      extends xml.Stream_obj_0
    {
      public xml.Spec_0 F1;

      public Spec_1()
      {
        {
        }
      }
      public Spec_1(
        xml.Spec_0 F1)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
        }
      }
    }

    public static class Text_1
      extends xml.Stream_obj_0
    {
      public java.lang.String F1;

      public Text_1()
      {
        {
        }
      }
      public Text_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 0;
          this.F1 = F1;
        }
      }
    }


  }

//  xml.m:82
  public static class Tagtype_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Tagtype_0 K0 = new Tagtype_0(0);  /* end */
      public static final Tagtype_0 K1 = new Tagtype_0(1);  /* other */

      private Tagtype_0(int val) {
        super(val);
      }

  }

//  xml.m:15
  public static class Tree_obj_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Element_3
      extends xml.Tree_obj_0
    {
      public java.lang.String F1;
      public list.List_1<pair.Pair_2<java.lang.String, java.lang.String>> F2;
      public list.List_1<pair.Pair_2<java.lang.Integer, xml.Tree_obj_0>> F3;

      public Element_3()
      {
        {
        }
      }
      public Element_3(
        java.lang.String F1,
        list.List_1<pair.Pair_2<java.lang.String, java.lang.String>> F2,
        list.List_1<pair.Pair_2<java.lang.Integer, xml.Tree_obj_0>> F3)
      {
        {
          (this).data_tag = 2;
          this.F1 = F1;
          this.F2 = F2;
          this.F3 = F3;
        }
      }
    }

    public static class Spec_1
      extends xml.Tree_obj_0
    {
      public xml.Spec_0 F1;

      public Spec_1()
      {
        {
        }
      }
      public Spec_1(
        xml.Spec_0 F1)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
        }
      }
    }

    public static class Text_1
      extends xml.Tree_obj_0
    {
      public java.lang.String F1;

      public Text_1()
      {
        {
        }
      }
      public Text_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 0;
          this.F1 = F1;
        }
      }
    }


  }

//  xml.m:808
  private static java.lang.String IntroducedFrom__pred__stream2str__808__1_3_p_0(
    pair.Pair_2 HeadVar__1_12,
    java.lang.String HeadVar__2_13)
  {
    {
      boolean succeeded = false;
      java.lang.String HeadVar__3_14 = null;
      java.lang.String Z_8 = null;
//  xml.m:809
      int V_9_9 = 0;

      {
        java.lang.Object [] result = xml.item2str_3_p_0(HeadVar__1_12);
        Z_8 = (java.lang.String) result[0];
        V_9_9 = ((java.lang.Integer) result[1]).intValue();
      }
      {
        HeadVar__3_14 = string.f_43_43_2_f_0(HeadVar__2_13, Z_8);
      }
//  xml.m:808
      return HeadVar__3_14;
    }
  }
//  xml.m:15
  public static builtin.Comparison_result_0 __Compare____tree_obj_0_0(
    xml.Tree_obj_0 HeadVar__2_2,
    xml.Tree_obj_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_36 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_37 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_36 == CastY_37);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        switch (HeadVar__2_2.data_tag) {
          case 0:
            {
              java.lang.String V_47_47 = ((xml.Tree_obj_0.Text_1) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  {
                    java.lang.String V_5_5 = ((xml.Tree_obj_0.Text_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_47_47, V_5_5);
                    }
                  }
                  break;
                case 1:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 2:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 1:
            {
              xml.Spec_0 V_46_46 = ((xml.Tree_obj_0.Spec_1) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 1:
                  {
                    xml.Spec_0 V_15_15 = ((xml.Tree_obj_0.Spec_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = xml.__Compare____spec_0_0(V_46_46, V_15_15);
                    }
                  }
                  break;
                case 2:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 2:
            {
              list.List_1 V_43_43 = ((xml.Tree_obj_0.Element_3) HeadVar__2_2).F3;
              list.List_1 V_44_44 = ((xml.Tree_obj_0.Element_3) HeadVar__2_2).F2;
              java.lang.String V_45_45 = ((xml.Tree_obj_0.Element_3) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 1:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 2:
                  {
                    java.lang.String V_31_31 = ((xml.Tree_obj_0.Element_3) HeadVar__3_3).F1;
                    list.List_1 V_32_32 = ((xml.Tree_obj_0.Element_3) HeadVar__3_3).F2;
                    list.List_1 V_33_33 = ((xml.Tree_obj_0.Element_3) HeadVar__3_3).F3;
                    builtin.Comparison_result_0 V_34_34 = null;

                    {
                      V_34_34 = private_builtin.builtin_compare_string_3_p_0(V_45_45, V_31_31);
                    }
                    succeeded = (V_34_34.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_34_34;
                    else
                      {
                        builtin.Comparison_result_0 V_35_35 = null;
                        jmercury.runtime.TypeInfo_Struct TypeInfo_39_39 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[6]);

                        {
                          V_35_35 = builtin.compare_3_p_0(TypeInfo_39_39, ((java.lang.Object) (V_44_44)), ((java.lang.Object) (V_32_32)));
                        }
                        succeeded = (V_35_35.MR_value == builtin.Comparison_result_0.K0.MR_value);
                        succeeded = !(succeeded);
                        if (succeeded)
                          HeadVar__1_1 = V_35_35;
                        else
                          {
                            jmercury.runtime.TypeInfo_Struct TypeInfo_40_40 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[8]);

                            {
                              HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_40_40, ((java.lang.Object) (V_43_43)), ((java.lang.Object) (V_33_33)));
                            }
                          }
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
  public static boolean __Unify____tree_obj_0_0(
    xml.Tree_obj_0 HeadVar__1_1,
    xml.Tree_obj_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_13 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_14 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_13 == CastY_14);
      if (succeeded)
        succeeded = true;
      else
        switch (HeadVar__1_1.data_tag) {
          case 0:
            {
              java.lang.String V_3_3 = ((xml.Tree_obj_0.Text_1) HeadVar__1_1).F1;
              java.lang.String V_4_4 = null;

              succeeded = (HeadVar__2_2.data_tag == 0);
              if (succeeded)
                {
                  V_4_4 = ((xml.Tree_obj_0.Text_1) HeadVar__2_2).F1;
                  succeeded = V_3_3.equals(V_4_4);
                }
            }
            break;
          case 1:
            {
              xml.Spec_0 V_5_5 = ((xml.Tree_obj_0.Spec_1) HeadVar__1_1).F1;
              xml.Spec_0 V_6_6 = null;

              succeeded = (HeadVar__2_2.data_tag == 1);
              if (succeeded)
                {
                  V_6_6 = ((xml.Tree_obj_0.Spec_1) HeadVar__2_2).F1;
                  {
                    succeeded = xml.__Unify____spec_0_0(V_5_5, V_6_6);
                  }
                }
            }
            break;
          case 2:
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_15_15 = null;
              jmercury.runtime.TypeInfo_Struct TypeInfo_16_16 = null;
              java.lang.String V_7_7 = ((xml.Tree_obj_0.Element_3) HeadVar__1_1).F1;
              list.List_1 V_8_8 = ((xml.Tree_obj_0.Element_3) HeadVar__1_1).F2;
              list.List_1 V_9_9 = ((xml.Tree_obj_0.Element_3) HeadVar__1_1).F3;
              java.lang.String V_10_10 = null;
              list.List_1 V_11_11 = null;
              list.List_1 V_12_12 = null;

              succeeded = (HeadVar__2_2.data_tag == 2);
              if (succeeded)
                {
                  V_10_10 = ((xml.Tree_obj_0.Element_3) HeadVar__2_2).F1;
                  V_11_11 = ((xml.Tree_obj_0.Element_3) HeadVar__2_2).F2;
                  V_12_12 = ((xml.Tree_obj_0.Element_3) HeadVar__2_2).F3;
                  succeeded = V_7_7.equals(V_10_10);
                  if (succeeded)
                    {
                      TypeInfo_15_15 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[6]);
                      {
                        succeeded = builtin.unify_2_p_0(TypeInfo_15_15, ((java.lang.Object) (V_8_8)), ((java.lang.Object) (V_11_11)));
                      }
                      if (succeeded)
                        {
                          TypeInfo_16_16 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[8]);
                          {
                            succeeded = builtin.unify_2_p_0(TypeInfo_16_16, ((java.lang.Object) (V_9_9)), ((java.lang.Object) (V_12_12)));
                          }
                        }
                    }
                }
            }
            break;
          default: /*NOTREACHED*/
            throw new jmercury.runtime.UnreachableDefault();
        }
      return succeeded;
    }
  }
//  xml.m:14
  public static builtin.Comparison_result_0 __Compare____tree_item_0_0(
    pair.Pair_2 HeadVar__2_2,
    pair.Pair_2 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[3]);
      pair.Pair_2 Cast_HeadVar1_4 = HeadVar__2_2;
      pair.Pair_2 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____tree_item_0_0(
    pair.Pair_2 HeadVar__1_1,
    pair.Pair_2 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[3]);
      pair.Pair_2 Cast_HeadVar1_3 = HeadVar__1_1;
      pair.Pair_2 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  xml.m:13
  public static builtin.Comparison_result_0 __Compare____tree_0_0(
    list.List_1 HeadVar__2_2,
    list.List_1 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[8]);
      list.List_1 Cast_HeadVar1_4 = HeadVar__2_2;
      list.List_1 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____tree_0_0(
    list.List_1 HeadVar__1_1,
    list.List_1 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[8]);
      list.List_1 Cast_HeadVar1_3 = HeadVar__1_1;
      list.List_1 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  xml.m:78
  private static builtin.Comparison_result_0 __Compare____token_0_0(
    pair.Pair_2 HeadVar__2_2,
    pair.Pair_2 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[1]);
      pair.Pair_2 Cast_HeadVar1_4 = HeadVar__2_2;
      pair.Pair_2 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  private static boolean __Unify____token_0_0(
    pair.Pair_2 HeadVar__1_1,
    pair.Pair_2 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[1]);
      pair.Pair_2 Cast_HeadVar1_3 = HeadVar__1_1;
      pair.Pair_2 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  xml.m:82
  private static builtin.Comparison_result_0 __Compare____tagtype_0_0(
    xml.Tagtype_0 HeadVar__2_2,
    xml.Tagtype_0 HeadVar__3_3)
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
  private static boolean __Unify____tagtype_0_0(
    xml.Tagtype_0 HeadVar__2_1,
    xml.Tagtype_0 HeadVar__2_2)
  {
    {
      boolean succeeded = (HeadVar__2_1.MR_value == HeadVar__2_2.MR_value);

      return succeeded;
    }
  }
//  xml.m:10
  public static builtin.Comparison_result_0 __Compare____stream_obj_0_0(
    xml.Stream_obj_0 HeadVar__2_2,
    xml.Stream_obj_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_65 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_66 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_65 == CastY_66);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        switch (HeadVar__2_2.data_tag) {
          case 0:
            {
              java.lang.String V_78_78 = ((xml.Stream_obj_0.Text_1) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  {
                    java.lang.String V_5_5 = ((xml.Stream_obj_0.Text_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_78_78, V_5_5);
                    }
                  }
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
            }
            break;
          case 1:
            {
              xml.Spec_0 V_75_75 = ((xml.Stream_obj_0.Spec_1) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 1:
                  {
                    xml.Spec_0 V_18_18 = ((xml.Stream_obj_0.Spec_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = xml.__Compare____spec_0_0(V_75_75, V_18_18);
                    }
                  }
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
            }
            break;
          case 2:
            {
              java.lang.String V_73_73 = ((xml.Stream_obj_0.Empty_tag_1) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 1:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 2:
                  {
                    java.lang.String V_31_31 = ((xml.Stream_obj_0.Empty_tag_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_73_73, V_31_31);
                    }
                  }
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
            }
            break;
          case 3:
            {
              list.List_1 V_76_76 = ((xml.Stream_obj_0.Start_tag_2) HeadVar__2_2).F2;
              java.lang.String V_77_77 = ((xml.Stream_obj_0.Start_tag_2) HeadVar__2_2).F1;

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
                  {
                    java.lang.String V_48_48 = ((xml.Stream_obj_0.Start_tag_2) HeadVar__3_3).F1;
                    list.List_1 V_49_49 = ((xml.Stream_obj_0.Start_tag_2) HeadVar__3_3).F2;
                    builtin.Comparison_result_0 V_50_50 = null;

                    {
                      V_50_50 = private_builtin.builtin_compare_string_3_p_0(V_77_77, V_48_48);
                    }
                    succeeded = (V_50_50.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_50_50;
                    else
                      {
                        jmercury.runtime.TypeInfo_Struct TypeInfo_69_69 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[6]);

                        {
                          HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_69_69, ((java.lang.Object) (V_76_76)), ((java.lang.Object) (V_49_49)));
                        }
                      }
                  }
                  break;
                case 4:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 4:
            {
              java.lang.String V_74_74 = ((xml.Stream_obj_0.End_tag_1) HeadVar__2_2).F1;

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
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 4:
                  {
                    java.lang.String V_64_64 = ((xml.Stream_obj_0.End_tag_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_74_74, V_64_64);
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
  public static boolean __Unify____stream_obj_0_0(
    xml.Stream_obj_0 HeadVar__1_1,
    xml.Stream_obj_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_15 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_16 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_15 == CastY_16);
      if (succeeded)
        succeeded = true;
      else
        switch (HeadVar__1_1.data_tag) {
          case 0:
            {
              java.lang.String V_3_3 = ((xml.Stream_obj_0.Text_1) HeadVar__1_1).F1;
              java.lang.String V_4_4 = null;

              succeeded = (HeadVar__2_2.data_tag == 0);
              if (succeeded)
                {
                  V_4_4 = ((xml.Stream_obj_0.Text_1) HeadVar__2_2).F1;
                  succeeded = V_3_3.equals(V_4_4);
                }
            }
            break;
          case 1:
            {
              xml.Spec_0 V_5_5 = ((xml.Stream_obj_0.Spec_1) HeadVar__1_1).F1;
              xml.Spec_0 V_6_6 = null;

              succeeded = (HeadVar__2_2.data_tag == 1);
              if (succeeded)
                {
                  V_6_6 = ((xml.Stream_obj_0.Spec_1) HeadVar__2_2).F1;
                  {
                    succeeded = xml.__Unify____spec_0_0(V_5_5, V_6_6);
                  }
                }
            }
            break;
          case 2:
            {
              java.lang.String V_7_7 = ((xml.Stream_obj_0.Empty_tag_1) HeadVar__1_1).F1;
              java.lang.String V_8_8 = null;

              succeeded = (HeadVar__2_2.data_tag == 2);
              if (succeeded)
                {
                  V_8_8 = ((xml.Stream_obj_0.Empty_tag_1) HeadVar__2_2).F1;
                  succeeded = V_7_7.equals(V_8_8);
                }
            }
            break;
          case 3:
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_17_17 = null;
              java.lang.String V_9_9 = ((xml.Stream_obj_0.Start_tag_2) HeadVar__1_1).F1;
              list.List_1 V_10_10 = ((xml.Stream_obj_0.Start_tag_2) HeadVar__1_1).F2;
              java.lang.String V_11_11 = null;
              list.List_1 V_12_12 = null;

              succeeded = (HeadVar__2_2.data_tag == 3);
              if (succeeded)
                {
                  V_11_11 = ((xml.Stream_obj_0.Start_tag_2) HeadVar__2_2).F1;
                  V_12_12 = ((xml.Stream_obj_0.Start_tag_2) HeadVar__2_2).F2;
                  succeeded = V_9_9.equals(V_11_11);
                  if (succeeded)
                    {
                      TypeInfo_17_17 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[6]);
                      {
                        succeeded = builtin.unify_2_p_0(TypeInfo_17_17, ((java.lang.Object) (V_10_10)), ((java.lang.Object) (V_12_12)));
                      }
                    }
                }
            }
            break;
          case 4:
            {
              java.lang.String V_13_13 = ((xml.Stream_obj_0.End_tag_1) HeadVar__1_1).F1;
              java.lang.String V_14_14 = null;

              succeeded = (HeadVar__2_2.data_tag == 4);
              if (succeeded)
                {
                  V_14_14 = ((xml.Stream_obj_0.End_tag_1) HeadVar__2_2).F1;
                  succeeded = V_13_13.equals(V_14_14);
                }
            }
            break;
          default: /*NOTREACHED*/
            throw new jmercury.runtime.UnreachableDefault();
        }
      return succeeded;
    }
  }
//  xml.m:9
  public static builtin.Comparison_result_0 __Compare____stream_item_0_0(
    pair.Pair_2 HeadVar__2_2,
    pair.Pair_2 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[0]);
      pair.Pair_2 Cast_HeadVar1_4 = HeadVar__2_2;
      pair.Pair_2 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____stream_item_0_0(
    pair.Pair_2 HeadVar__1_1,
    pair.Pair_2 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[0]);
      pair.Pair_2 Cast_HeadVar1_3 = HeadVar__1_1;
      pair.Pair_2 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  xml.m:8
  public static builtin.Comparison_result_0 __Compare____stream_0_0(
    list.List_1 HeadVar__2_2,
    list.List_1 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[9]);
      list.List_1 Cast_HeadVar1_4 = HeadVar__2_2;
      list.List_1 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____stream_0_0(
    list.List_1 HeadVar__1_1,
    list.List_1 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[9]);
      list.List_1 Cast_HeadVar1_3 = HeadVar__1_1;
      list.List_1 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  xml.m:85
  private static builtin.Comparison_result_0 __Compare____stack_item_0_0(
    xml.Stack_item_0 HeadVar__2_2,
    xml.Stack_item_0 HeadVar__3_3)
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
          java.lang.String V_4_4 = ((xml.Stack_item_0) HeadVar__2_2).F1;
          list.List_1 V_5_5 = ((xml.Stack_item_0) HeadVar__2_2).F2;
          list.List_1 V_6_6 = ((xml.Stack_item_0) HeadVar__2_2).F3;
          java.lang.String V_7_7 = ((xml.Stack_item_0) HeadVar__3_3).F1;
          list.List_1 V_8_8 = ((xml.Stack_item_0) HeadVar__3_3).F2;
          list.List_1 V_9_9 = ((xml.Stack_item_0) HeadVar__3_3).F3;
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
              jmercury.runtime.TypeInfo_Struct TypeInfo_15_15 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[6]);

              {
                V_11_11 = builtin.compare_3_p_0(TypeInfo_15_15, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_8_8)));
              }
              succeeded = (V_11_11.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_11_11;
              else
                {
                  jmercury.runtime.TypeInfo_Struct TypeInfo_16_16 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[8]);

                  {
                    HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_16_16, ((java.lang.Object) (V_6_6)), ((java.lang.Object) (V_9_9)));
                  }
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  private static boolean __Unify____stack_item_0_0(
    xml.Stack_item_0 HeadVar__1_1,
    xml.Stack_item_0 HeadVar__2_2)
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
          java.lang.String V_3_3 = ((xml.Stack_item_0) HeadVar__1_1).F1;
          list.List_1 V_4_4 = ((xml.Stack_item_0) HeadVar__1_1).F2;
          list.List_1 V_5_5 = ((xml.Stack_item_0) HeadVar__1_1).F3;
          java.lang.String V_6_6 = ((xml.Stack_item_0) HeadVar__2_2).F1;
          list.List_1 V_7_7 = ((xml.Stack_item_0) HeadVar__2_2).F2;
          list.List_1 V_8_8 = ((xml.Stack_item_0) HeadVar__2_2).F3;

          succeeded = V_3_3.equals(V_6_6);
          if (succeeded)
            {
              TypeInfo_11_11 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[6]);
              {
                succeeded = builtin.unify_2_p_0(TypeInfo_11_11, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_7_7)));
              }
              if (succeeded)
                {
                  TypeInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[8]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_12_12, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_8_8)));
                  }
                }
            }
        }
      return succeeded;
    }
  }
//  xml.m:84
  private static builtin.Comparison_result_0 __Compare____stack_0_0(
    list.List_1 HeadVar__2_2,
    list.List_1 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[7]);
      list.List_1 Cast_HeadVar1_4 = HeadVar__2_2;
      list.List_1 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  private static boolean __Unify____stack_0_0(
    list.List_1 HeadVar__1_1,
    list.List_1 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[7]);
      list.List_1 Cast_HeadVar1_3 = HeadVar__1_1;
      list.List_1 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  xml.m:18
  public static builtin.Comparison_result_0 __Compare____spec_0_0(
    xml.Spec_0 HeadVar__2_2,
    xml.Spec_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_102 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_103 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_102 == CastY_103);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        switch (HeadVar__2_2.data_tag) {
          case 0:
            {
              list.List_1 V_115_115 = ((xml.Spec_0.Empty_tag_2) HeadVar__2_2).F2;
              java.lang.String V_116_116 = ((xml.Spec_0.Empty_tag_2) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  {
                    java.lang.String V_6_6 = ((xml.Spec_0.Empty_tag_2) HeadVar__3_3).F1;
                    list.List_1 V_7_7 = ((xml.Spec_0.Empty_tag_2) HeadVar__3_3).F2;
                    builtin.Comparison_result_0 V_8_8 = null;

                    {
                      V_8_8 = private_builtin.builtin_compare_string_3_p_0(V_116_116, V_6_6);
                    }
                    succeeded = (V_8_8.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_8_8;
                    else
                      {
                        jmercury.runtime.TypeInfo_Struct TypeInfo_111_111 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[6]);

                        {
                          HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_111_111, ((java.lang.Object) (V_115_115)), ((java.lang.Object) (V_7_7)));
                        }
                      }
                  }
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
                case 5:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 1:
            {
              java.lang.String V_112_112 = ((xml.Spec_0.Cdata_1) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 1:
                  {
                    java.lang.String V_29_29 = ((xml.Spec_0.Cdata_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_112_112, V_29_29);
                    }
                  }
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
                case 5:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 2:
            {
              java.lang.String V_113_113 = ((xml.Spec_0.Comment_1) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 1:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 2:
                  {
                    java.lang.String V_45_45 = ((xml.Spec_0.Comment_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_113_113, V_45_45);
                    }
                  }
                  break;
                case 3:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 4:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 5:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 3:
            {
              java.lang.String V_117_117 = ((xml.Spec_0.Procinstr_2) HeadVar__2_2).F2;
              java.lang.String V_118_118 = ((xml.Spec_0.Procinstr_2) HeadVar__2_2).F1;

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
                  {
                    java.lang.String V_65_65 = ((xml.Spec_0.Procinstr_2) HeadVar__3_3).F1;
                    java.lang.String V_66_66 = ((xml.Spec_0.Procinstr_2) HeadVar__3_3).F2;
                    builtin.Comparison_result_0 V_67_67 = null;

                    {
                      V_67_67 = private_builtin.builtin_compare_string_3_p_0(V_118_118, V_65_65);
                    }
                    succeeded = (V_67_67.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_67_67;
                    else
                      {
                        HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_117_117, V_66_66);
                      }
                  }
                  break;
                case 4:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 5:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 4:
            {
              xml.Ref_0 V_119_119 = ((xml.Spec_0.Ref_1) HeadVar__2_2).F1;

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
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 4:
                  {
                    xml.Ref_0 V_85_85 = ((xml.Spec_0.Ref_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = xml.__Compare____ref_0_0(V_119_119, V_85_85);
                    }
                  }
                  break;
                case 5:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 5:
            {
              java.lang.String V_114_114 = ((xml.Spec_0.Doctype_1) HeadVar__2_2).F1;

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
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 4:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 5:
                  {
                    java.lang.String V_101_101 = ((xml.Spec_0.Doctype_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_114_114, V_101_101);
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
  public static boolean __Unify____spec_0_0(
    xml.Spec_0 HeadVar__1_1,
    xml.Spec_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_19 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_20 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_19 == CastY_20);
      if (succeeded)
        succeeded = true;
      else
        switch (HeadVar__1_1.data_tag) {
          case 0:
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_21_21 = null;
              java.lang.String V_3_3 = ((xml.Spec_0.Empty_tag_2) HeadVar__1_1).F1;
              list.List_1 V_4_4 = ((xml.Spec_0.Empty_tag_2) HeadVar__1_1).F2;
              java.lang.String V_5_5 = null;
              list.List_1 V_6_6 = null;

              succeeded = (HeadVar__2_2.data_tag == 0);
              if (succeeded)
                {
                  V_5_5 = ((xml.Spec_0.Empty_tag_2) HeadVar__2_2).F1;
                  V_6_6 = ((xml.Spec_0.Empty_tag_2) HeadVar__2_2).F2;
                  succeeded = V_3_3.equals(V_5_5);
                  if (succeeded)
                    {
                      TypeInfo_21_21 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[6]);
                      {
                        succeeded = builtin.unify_2_p_0(TypeInfo_21_21, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_6_6)));
                      }
                    }
                }
            }
            break;
          case 1:
            {
              java.lang.String V_7_7 = ((xml.Spec_0.Cdata_1) HeadVar__1_1).F1;
              java.lang.String V_8_8 = null;

              succeeded = (HeadVar__2_2.data_tag == 1);
              if (succeeded)
                {
                  V_8_8 = ((xml.Spec_0.Cdata_1) HeadVar__2_2).F1;
                  succeeded = V_7_7.equals(V_8_8);
                }
            }
            break;
          case 2:
            {
              java.lang.String V_9_9 = ((xml.Spec_0.Comment_1) HeadVar__1_1).F1;
              java.lang.String V_10_10 = null;

              succeeded = (HeadVar__2_2.data_tag == 2);
              if (succeeded)
                {
                  V_10_10 = ((xml.Spec_0.Comment_1) HeadVar__2_2).F1;
                  succeeded = V_9_9.equals(V_10_10);
                }
            }
            break;
          case 3:
            {
              java.lang.String V_11_11 = ((xml.Spec_0.Procinstr_2) HeadVar__1_1).F1;
              java.lang.String V_12_12 = ((xml.Spec_0.Procinstr_2) HeadVar__1_1).F2;
              java.lang.String V_13_13 = null;
              java.lang.String V_14_14 = null;

              succeeded = (HeadVar__2_2.data_tag == 3);
              if (succeeded)
                {
                  V_13_13 = ((xml.Spec_0.Procinstr_2) HeadVar__2_2).F1;
                  V_14_14 = ((xml.Spec_0.Procinstr_2) HeadVar__2_2).F2;
                  succeeded = V_11_11.equals(V_13_13);
                  if (succeeded)
                    succeeded = V_12_12.equals(V_14_14);
                }
            }
            break;
          case 4:
            {
              xml.Ref_0 V_15_15 = ((xml.Spec_0.Ref_1) HeadVar__1_1).F1;
              xml.Ref_0 V_16_16 = null;

              succeeded = (HeadVar__2_2.data_tag == 4);
              if (succeeded)
                {
                  V_16_16 = ((xml.Spec_0.Ref_1) HeadVar__2_2).F1;
                  {
                    succeeded = xml.__Unify____ref_0_0(V_15_15, V_16_16);
                  }
                }
            }
            break;
          case 5:
            {
              java.lang.String V_17_17 = ((xml.Spec_0.Doctype_1) HeadVar__1_1).F1;
              java.lang.String V_18_18 = null;

              succeeded = (HeadVar__2_2.data_tag == 5);
              if (succeeded)
                {
                  V_18_18 = ((xml.Spec_0.Doctype_1) HeadVar__2_2).F1;
                  succeeded = V_17_17.equals(V_18_18);
                }
            }
            break;
          default: /*NOTREACHED*/
            throw new jmercury.runtime.UnreachableDefault();
        }
      return succeeded;
    }
  }
//  xml.m:21
  public static builtin.Comparison_result_0 __Compare____ref_0_0(
    xml.Ref_0 HeadVar__2_2,
    xml.Ref_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_52 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_53 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_52 == CastY_53);
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
              case 5:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 6:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 7:
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
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 5:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 6:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 7:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
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
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 5:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 6:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 7:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
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
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 5:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 6:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 7:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              default: /*NOTREACHED*/
                throw new jmercury.runtime.UnreachableDefault();
            }
            break;
          case 4:
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
                HeadVar__1_1 = builtin.Comparison_result_0.K2;
                break;
              case 4:
                HeadVar__1_1 = builtin.Comparison_result_0.K0;
                break;
              case 5:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 6:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 7:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              default: /*NOTREACHED*/
                throw new jmercury.runtime.UnreachableDefault();
            }
            break;
          case 5:
            {
              int V_57_57 = ((xml.Ref_0.Dec_1) HeadVar__2_2).F1;

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
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 4:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 5:
                  {
                    int V_25_25 = ((xml.Ref_0.Dec_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_57_57, V_25_25);
                    }
                  }
                  break;
                case 6:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 7:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 6:
            {
              int V_59_59 = ((xml.Ref_0.Hex_1) HeadVar__2_2).F1;

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
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 4:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 5:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 6:
                  {
                    int V_38_38 = ((xml.Ref_0.Hex_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_59_59, V_38_38);
                    }
                  }
                  break;
                case 7:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 7:
            {
              java.lang.String V_58_58 = ((xml.Ref_0.Def_1) HeadVar__2_2).F1;

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
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 4:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 5:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 6:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 7:
                  {
                    java.lang.String V_51_51 = ((xml.Ref_0.Def_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_58_58, V_51_51);
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
  public static boolean __Unify____ref_0_0(
    xml.Ref_0 HeadVar__1_1,
    xml.Ref_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_9 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_10 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_9 == CastY_10);
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
            {
              int V_3_3 = ((xml.Ref_0.Dec_1) HeadVar__1_1).F1;
              int V_4_4 = 0;

              succeeded = (HeadVar__2_2.data_tag == 5);
              if (succeeded)
                {
                  V_4_4 = ((xml.Ref_0.Dec_1) HeadVar__2_2).F1;
                  succeeded = (V_3_3 == V_4_4);
                }
            }
            break;
          case 6:
            {
              int V_5_5 = ((xml.Ref_0.Hex_1) HeadVar__1_1).F1;
              int V_6_6 = 0;

              succeeded = (HeadVar__2_2.data_tag == 6);
              if (succeeded)
                {
                  V_6_6 = ((xml.Ref_0.Hex_1) HeadVar__2_2).F1;
                  succeeded = (V_5_5 == V_6_6);
                }
            }
            break;
          case 7:
            {
              java.lang.String V_7_7 = ((xml.Ref_0.Def_1) HeadVar__1_1).F1;
              java.lang.String V_8_8 = null;

              succeeded = (HeadVar__2_2.data_tag == 7);
              if (succeeded)
                {
                  V_8_8 = ((xml.Ref_0.Def_1) HeadVar__2_2).F1;
                  succeeded = V_7_7.equals(V_8_8);
                }
            }
            break;
          default: /*NOTREACHED*/
            throw new jmercury.runtime.UnreachableDefault();
        }
      return succeeded;
    }
  }
//  xml.m:80
  private static builtin.Comparison_result_0 __Compare____parse_1_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T_14,
    xml.Parse_1 HeadVar__2_2,
    xml.Parse_1 HeadVar__3_3)
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
        if ((HeadVar__2_2.data_tag == 1))
          {
            xml.Error_0 V_16_16 = ((xml.Parse_1.Error_1) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 1))
              {
                xml.Error_0 V_11_11 = ((xml.Parse_1.Error_1) HeadVar__3_3).F1;

                {
                  HeadVar__1_1 = xml.__Compare____error_0_0(V_16_16, V_11_11);
                }
              }
            else
              HeadVar__1_1 = builtin.Comparison_result_0.K2;
          }
        else
          {
            java.lang.Object V_17_17 = ((xml.Parse_1.Ok_1) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 1))
              HeadVar__1_1 = builtin.Comparison_result_0.K1;
            else
              {
                java.lang.Object V_5_5 = ((xml.Parse_1.Ok_1) HeadVar__3_3).F1;

                {
                  HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_for_T_14, V_17_17, V_5_5);
                }
              }
          }
      return HeadVar__1_1;
    }
  }
  private static boolean __Unify____parse_1_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T_9,
    xml.Parse_1 HeadVar__1_1,
    xml.Parse_1 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_7 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_8 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_7 == CastY_8);
      if (succeeded)
        succeeded = true;
      else
        if ((HeadVar__1_1.data_tag == 1))
          {
            xml.Error_0 V_5_5 = ((xml.Parse_1.Error_1) HeadVar__1_1).F1;
            xml.Error_0 V_6_6 = null;

            succeeded = (HeadVar__2_2.data_tag == 1);
            if (succeeded)
              {
                V_6_6 = ((xml.Parse_1.Error_1) HeadVar__2_2).F1;
                {
                  succeeded = xml.__Unify____error_0_0(V_5_5, V_6_6);
                }
              }
          }
        else
          {
            java.lang.Object V_3_3 = ((xml.Parse_1.Ok_1) HeadVar__1_1).F1;
            java.lang.Object V_4_4 = null;

            succeeded = (HeadVar__2_2.data_tag == 0);
            if (succeeded)
              {
                V_4_4 = ((xml.Parse_1.Ok_1) HeadVar__2_2).F1;
                {
                  succeeded = builtin.unify_2_p_0(TypeInfo_for_T_9, V_3_3, V_4_4);
                }
              }
          }
      return succeeded;
    }
  }
//  xml.m:28
  public static builtin.Comparison_result_0 __Compare____errors_0_0(
    list.List_1 HeadVar__2_2,
    list.List_1 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[5]);
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
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[5]);
      list.List_1 Cast_HeadVar1_3 = HeadVar__1_1;
      list.List_1 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  xml.m:87
  public static builtin.Comparison_result_0 __Compare____error_0_0(
    xml.Error_0 HeadVar__2_2,
    xml.Error_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_394 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_395 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_394 == CastY_395);
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
              case 5:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 6:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 7:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 8:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 9:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              default: /*NOTREACHED*/
                throw new jmercury.runtime.UnreachableDefault();
            }
            break;
          case 1:
            {
              java.lang.String V_421_421 = ((xml.Error_0.Expected_1) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 1:
                  {
                    java.lang.String V_25_25 = ((xml.Error_0.Expected_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_421_421, V_25_25);
                    }
                  }
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
                case 5:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 6:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 7:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 8:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 9:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 2:
            {
              int V_418_418 = ((xml.Error_0.Ebf_at_3) HeadVar__2_2).F3;
              int V_419_419 = ((xml.Error_0.Ebf_at_3) HeadVar__2_2).F2;
              java.lang.String V_420_420 = ((xml.Error_0.Ebf_at_3) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 1:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 2:
                  {
                    java.lang.String V_62_62 = ((xml.Error_0.Ebf_at_3) HeadVar__3_3).F1;
                    int V_63_63 = ((xml.Error_0.Ebf_at_3) HeadVar__3_3).F2;
                    int V_64_64 = ((xml.Error_0.Ebf_at_3) HeadVar__3_3).F3;
                    builtin.Comparison_result_0 V_65_65 = null;

                    {
                      V_65_65 = private_builtin.builtin_compare_string_3_p_0(V_420_420, V_62_62);
                    }
                    succeeded = (V_65_65.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_65_65;
                    else
                      {
                        builtin.Comparison_result_0 V_66_66 = null;

                        {
                          V_66_66 = private_builtin.builtin_compare_character_3_p_0(V_419_419, V_63_63);
                        }
                        succeeded = (V_66_66.MR_value == builtin.Comparison_result_0.K0.MR_value);
                        succeeded = !(succeeded);
                        if (succeeded)
                          HeadVar__1_1 = V_66_66;
                        else
                          {
                            HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_418_418, V_64_64);
                          }
                      }
                  }
                  break;
                case 3:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 4:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 5:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 6:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 7:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 8:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 9:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 3:
            {
              int V_427_427 = ((xml.Error_0.Unexpected_char_at_2) HeadVar__2_2).F2;
              int V_428_428 = ((xml.Error_0.Unexpected_char_at_2) HeadVar__2_2).F1;

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
                  {
                    int V_115_115 = ((xml.Error_0.Unexpected_char_at_2) HeadVar__3_3).F1;
                    int V_116_116 = ((xml.Error_0.Unexpected_char_at_2) HeadVar__3_3).F2;
                    builtin.Comparison_result_0 V_117_117 = null;

                    {
                      V_117_117 = private_builtin.builtin_compare_character_3_p_0(V_428_428, V_115_115);
                    }
                    succeeded = (V_117_117.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_117_117;
                    else
                      {
                        HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_427_427, V_116_116);
                      }
                  }
                  break;
                case 4:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 5:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 6:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 7:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 8:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 9:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 4:
            {
              java.lang.String V_432_432 = ((xml.Error_0.Unexpected_name_2) HeadVar__2_2).F2;
              java.lang.String V_433_433 = ((xml.Error_0.Unexpected_name_2) HeadVar__2_2).F1;

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
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 4:
                  {
                    java.lang.String V_159_159 = ((xml.Error_0.Unexpected_name_2) HeadVar__3_3).F1;
                    java.lang.String V_160_160 = ((xml.Error_0.Unexpected_name_2) HeadVar__3_3).F2;
                    builtin.Comparison_result_0 V_161_161 = null;

                    {
                      V_161_161 = private_builtin.builtin_compare_string_3_p_0(V_433_433, V_159_159);
                    }
                    succeeded = (V_161_161.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_161_161;
                    else
                      {
                        HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_432_432, V_160_160);
                      }
                  }
                  break;
                case 5:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 6:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 7:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 8:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 9:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 5:
            {
              java.lang.String V_429_429 = ((xml.Error_0.Unexpected_in_name_3) HeadVar__2_2).F3;
              java.lang.String V_430_430 = ((xml.Error_0.Unexpected_in_name_3) HeadVar__2_2).F2;
              java.lang.String V_431_431 = ((xml.Error_0.Unexpected_in_name_3) HeadVar__2_2).F1;

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
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 4:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 5:
                  {
                    java.lang.String V_209_209 = ((xml.Error_0.Unexpected_in_name_3) HeadVar__3_3).F1;
                    java.lang.String V_210_210 = ((xml.Error_0.Unexpected_in_name_3) HeadVar__3_3).F2;
                    java.lang.String V_211_211 = ((xml.Error_0.Unexpected_in_name_3) HeadVar__3_3).F3;
                    builtin.Comparison_result_0 V_212_212 = null;

                    {
                      V_212_212 = private_builtin.builtin_compare_string_3_p_0(V_431_431, V_209_209);
                    }
                    succeeded = (V_212_212.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_212_212;
                    else
                      {
                        builtin.Comparison_result_0 V_213_213 = null;

                        {
                          V_213_213 = private_builtin.builtin_compare_string_3_p_0(V_430_430, V_210_210);
                        }
                        succeeded = (V_213_213.MR_value == builtin.Comparison_result_0.K0.MR_value);
                        succeeded = !(succeeded);
                        if (succeeded)
                          HeadVar__1_1 = V_213_213;
                        else
                          {
                            HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_429_429, V_211_211);
                          }
                      }
                  }
                  break;
                case 6:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 7:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 8:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 9:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 6:
            {
              java.lang.String V_415_415 = ((xml.Error_0.Dangling_1) HeadVar__2_2).F1;

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
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 4:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 5:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 6:
                  {
                    java.lang.String V_252_252 = ((xml.Error_0.Dangling_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_415_415, V_252_252);
                    }
                  }
                  break;
                case 7:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 8:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 9:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 7:
            {
              java.lang.String V_416_416 = ((xml.Error_0.Dangling_name_2) HeadVar__2_2).F2;
              java.lang.String V_417_417 = ((xml.Error_0.Dangling_name_2) HeadVar__2_2).F1;

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
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 4:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 5:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 6:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 7:
                  {
                    java.lang.String V_291_291 = ((xml.Error_0.Dangling_name_2) HeadVar__3_3).F1;
                    java.lang.String V_292_292 = ((xml.Error_0.Dangling_name_2) HeadVar__3_3).F2;
                    builtin.Comparison_result_0 V_293_293 = null;

                    {
                      V_293_293 = private_builtin.builtin_compare_string_3_p_0(V_417_417, V_291_291);
                    }
                    succeeded = (V_293_293.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_293_293;
                    else
                      {
                        HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_416_416, V_292_292);
                      }
                  }
                  break;
                case 8:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 9:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 8:
            {
              java.lang.String V_425_425 = ((xml.Error_0.Unbalanced_tags_2) HeadVar__2_2).F2;
              java.lang.String V_426_426 = ((xml.Error_0.Unbalanced_tags_2) HeadVar__2_2).F1;

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
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 4:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 5:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 6:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 7:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 8:
                  {
                    java.lang.String V_335_335 = ((xml.Error_0.Unbalanced_tags_2) HeadVar__3_3).F1;
                    java.lang.String V_336_336 = ((xml.Error_0.Unbalanced_tags_2) HeadVar__3_3).F2;
                    builtin.Comparison_result_0 V_337_337 = null;

                    {
                      V_337_337 = private_builtin.builtin_compare_string_3_p_0(V_426_426, V_335_335);
                    }
                    succeeded = (V_337_337.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_337_337;
                    else
                      {
                        HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_425_425, V_336_336);
                      }
                  }
                  break;
                case 9:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 9:
            {
              java.lang.String V_422_422 = ((xml.Error_0.Spec_3) HeadVar__2_2).F3;
              java.lang.String V_423_423 = ((xml.Error_0.Spec_3) HeadVar__2_2).F2;
              java.lang.String V_424_424 = ((xml.Error_0.Spec_3) HeadVar__2_2).F1;

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
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 4:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 5:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 6:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 7:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 8:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 9:
                  {
                    java.lang.String V_389_389 = ((xml.Error_0.Spec_3) HeadVar__3_3).F1;
                    java.lang.String V_390_390 = ((xml.Error_0.Spec_3) HeadVar__3_3).F2;
                    java.lang.String V_391_391 = ((xml.Error_0.Spec_3) HeadVar__3_3).F3;
                    builtin.Comparison_result_0 V_392_392 = null;

                    {
                      V_392_392 = private_builtin.builtin_compare_string_3_p_0(V_424_424, V_389_389);
                    }
                    succeeded = (V_392_392.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_392_392;
                    else
                      {
                        builtin.Comparison_result_0 V_393_393 = null;

                        {
                          V_393_393 = private_builtin.builtin_compare_string_3_p_0(V_423_423, V_390_390);
                        }
                        succeeded = (V_393_393.MR_value == builtin.Comparison_result_0.K0.MR_value);
                        succeeded = !(succeeded);
                        if (succeeded)
                          HeadVar__1_1 = V_393_393;
                        else
                          {
                            HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_422_422, V_391_391);
                          }
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
  public static boolean __Unify____error_0_0(
    xml.Error_0 HeadVar__1_1,
    xml.Error_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_41 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_42 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_41 == CastY_42);
      if (succeeded)
        succeeded = true;
      else
        switch (HeadVar__1_1.data_tag) {
          case 0:
            succeeded = (HeadVar__2_2.data_tag == 0);
            break;
          case 1:
            {
              java.lang.String V_3_3 = ((xml.Error_0.Expected_1) HeadVar__1_1).F1;
              java.lang.String V_4_4 = null;

              succeeded = (HeadVar__2_2.data_tag == 1);
              if (succeeded)
                {
                  V_4_4 = ((xml.Error_0.Expected_1) HeadVar__2_2).F1;
                  succeeded = V_3_3.equals(V_4_4);
                }
            }
            break;
          case 2:
            {
              java.lang.String V_5_5 = ((xml.Error_0.Ebf_at_3) HeadVar__1_1).F1;
              int V_6_6 = ((xml.Error_0.Ebf_at_3) HeadVar__1_1).F2;
              int V_7_7 = ((xml.Error_0.Ebf_at_3) HeadVar__1_1).F3;
              java.lang.String V_8_8 = null;
              int V_9_9 = '\u0000';
              int V_10_10 = 0;

              succeeded = (HeadVar__2_2.data_tag == 2);
              if (succeeded)
                {
                  V_8_8 = ((xml.Error_0.Ebf_at_3) HeadVar__2_2).F1;
                  V_9_9 = ((xml.Error_0.Ebf_at_3) HeadVar__2_2).F2;
                  V_10_10 = ((xml.Error_0.Ebf_at_3) HeadVar__2_2).F3;
                  succeeded = V_5_5.equals(V_8_8);
                  if (succeeded)
                    {
                      succeeded = (V_6_6 == V_9_9);
                      if (succeeded)
                        succeeded = (V_7_7 == V_10_10);
                    }
                }
            }
            break;
          case 3:
            {
              int V_11_11 = ((xml.Error_0.Unexpected_char_at_2) HeadVar__1_1).F1;
              int V_12_12 = ((xml.Error_0.Unexpected_char_at_2) HeadVar__1_1).F2;
              int V_13_13 = '\u0000';
              int V_14_14 = 0;

              succeeded = (HeadVar__2_2.data_tag == 3);
              if (succeeded)
                {
                  V_13_13 = ((xml.Error_0.Unexpected_char_at_2) HeadVar__2_2).F1;
                  V_14_14 = ((xml.Error_0.Unexpected_char_at_2) HeadVar__2_2).F2;
                  succeeded = (V_11_11 == V_13_13);
                  if (succeeded)
                    succeeded = (V_12_12 == V_14_14);
                }
            }
            break;
          case 4:
            {
              java.lang.String V_15_15 = ((xml.Error_0.Unexpected_name_2) HeadVar__1_1).F1;
              java.lang.String V_16_16 = ((xml.Error_0.Unexpected_name_2) HeadVar__1_1).F2;
              java.lang.String V_17_17 = null;
              java.lang.String V_18_18 = null;

              succeeded = (HeadVar__2_2.data_tag == 4);
              if (succeeded)
                {
                  V_17_17 = ((xml.Error_0.Unexpected_name_2) HeadVar__2_2).F1;
                  V_18_18 = ((xml.Error_0.Unexpected_name_2) HeadVar__2_2).F2;
                  succeeded = V_15_15.equals(V_17_17);
                  if (succeeded)
                    succeeded = V_16_16.equals(V_18_18);
                }
            }
            break;
          case 5:
            {
              java.lang.String V_19_19 = ((xml.Error_0.Unexpected_in_name_3) HeadVar__1_1).F1;
              java.lang.String V_20_20 = ((xml.Error_0.Unexpected_in_name_3) HeadVar__1_1).F2;
              java.lang.String V_21_21 = ((xml.Error_0.Unexpected_in_name_3) HeadVar__1_1).F3;
              java.lang.String V_22_22 = null;
              java.lang.String V_23_23 = null;
              java.lang.String V_24_24 = null;

              succeeded = (HeadVar__2_2.data_tag == 5);
              if (succeeded)
                {
                  V_22_22 = ((xml.Error_0.Unexpected_in_name_3) HeadVar__2_2).F1;
                  V_23_23 = ((xml.Error_0.Unexpected_in_name_3) HeadVar__2_2).F2;
                  V_24_24 = ((xml.Error_0.Unexpected_in_name_3) HeadVar__2_2).F3;
                  succeeded = V_19_19.equals(V_22_22);
                  if (succeeded)
                    {
                      succeeded = V_20_20.equals(V_23_23);
                      if (succeeded)
                        succeeded = V_21_21.equals(V_24_24);
                    }
                }
            }
            break;
          case 6:
            {
              java.lang.String V_25_25 = ((xml.Error_0.Dangling_1) HeadVar__1_1).F1;
              java.lang.String V_26_26 = null;

              succeeded = (HeadVar__2_2.data_tag == 6);
              if (succeeded)
                {
                  V_26_26 = ((xml.Error_0.Dangling_1) HeadVar__2_2).F1;
                  succeeded = V_25_25.equals(V_26_26);
                }
            }
            break;
          case 7:
            {
              java.lang.String V_27_27 = ((xml.Error_0.Dangling_name_2) HeadVar__1_1).F1;
              java.lang.String V_28_28 = ((xml.Error_0.Dangling_name_2) HeadVar__1_1).F2;
              java.lang.String V_29_29 = null;
              java.lang.String V_30_30 = null;

              succeeded = (HeadVar__2_2.data_tag == 7);
              if (succeeded)
                {
                  V_29_29 = ((xml.Error_0.Dangling_name_2) HeadVar__2_2).F1;
                  V_30_30 = ((xml.Error_0.Dangling_name_2) HeadVar__2_2).F2;
                  succeeded = V_27_27.equals(V_29_29);
                  if (succeeded)
                    succeeded = V_28_28.equals(V_30_30);
                }
            }
            break;
          case 8:
            {
              java.lang.String V_31_31 = ((xml.Error_0.Unbalanced_tags_2) HeadVar__1_1).F1;
              java.lang.String V_32_32 = ((xml.Error_0.Unbalanced_tags_2) HeadVar__1_1).F2;
              java.lang.String V_33_33 = null;
              java.lang.String V_34_34 = null;

              succeeded = (HeadVar__2_2.data_tag == 8);
              if (succeeded)
                {
                  V_33_33 = ((xml.Error_0.Unbalanced_tags_2) HeadVar__2_2).F1;
                  V_34_34 = ((xml.Error_0.Unbalanced_tags_2) HeadVar__2_2).F2;
                  succeeded = V_31_31.equals(V_33_33);
                  if (succeeded)
                    succeeded = V_32_32.equals(V_34_34);
                }
            }
            break;
          case 9:
            {
              java.lang.String V_35_35 = ((xml.Error_0.Spec_3) HeadVar__1_1).F1;
              java.lang.String V_36_36 = ((xml.Error_0.Spec_3) HeadVar__1_1).F2;
              java.lang.String V_37_37 = ((xml.Error_0.Spec_3) HeadVar__1_1).F3;
              java.lang.String V_38_38 = null;
              java.lang.String V_39_39 = null;
              java.lang.String V_40_40 = null;

              succeeded = (HeadVar__2_2.data_tag == 9);
              if (succeeded)
                {
                  V_38_38 = ((xml.Error_0.Spec_3) HeadVar__2_2).F1;
                  V_39_39 = ((xml.Error_0.Spec_3) HeadVar__2_2).F2;
                  V_40_40 = ((xml.Error_0.Spec_3) HeadVar__2_2).F3;
                  succeeded = V_35_35.equals(V_38_38);
                  if (succeeded)
                    {
                      succeeded = V_36_36.equals(V_39_39);
                      if (succeeded)
                        succeeded = V_37_37.equals(V_40_40);
                    }
                }
            }
            break;
          default: /*NOTREACHED*/
            throw new jmercury.runtime.UnreachableDefault();
        }
      return succeeded;
    }
  }
//  xml.m:24
  public static builtin.Comparison_result_0 __Compare____attribute_0_0(
    pair.Pair_2 HeadVar__2_2,
    pair.Pair_2 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[2]);
      pair.Pair_2 Cast_HeadVar1_4 = HeadVar__2_2;
      pair.Pair_2 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____attribute_0_0(
    pair.Pair_2 HeadVar__1_1,
    pair.Pair_2 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[2]);
      pair.Pair_2 Cast_HeadVar1_3 = HeadVar__1_1;
      pair.Pair_2 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  xml.m:868
  private static java.lang.String ref_to_string_2_p_0(
    xml.Ref_0 HeadVar__1_1)
  {
//  xml.m:870
    {
      boolean succeeded = false;
      java.lang.String HeadVar__2_2 = null;

      switch (HeadVar__1_1.data_tag) {
        case 0:
          HeadVar__2_2 = "amp";
          break;
        case 1:
//  xml.m:871
          HeadVar__2_2 = "lt";
//  xml.m:870
          break;
        case 2:
//  xml.m:872
          HeadVar__2_2 = "gt";
//  xml.m:870
          break;
        case 3:
//  xml.m:873
          HeadVar__2_2 = "apos";
//  xml.m:870
          break;
        case 4:
//  xml.m:874
          HeadVar__2_2 = "quot";
//  xml.m:870
          break;
        case 5:
//  xml.m:875
          {
            int N_3 = ((xml.Ref_0.Dec_1) HeadVar__1_1).F1;
            int V_5_5 = 10;

//  xml.m:876
            {
              HeadVar__2_2 = string.int_to_base_string_3_p_0(N_3, V_5_5);
            }
//  xml.m:875
          }
//  xml.m:870
          break;
        case 6:
//  xml.m:877
          {
            int N_6 = ((xml.Ref_0.Hex_1) HeadVar__1_1).F1;
            int V_8_8 = 16;

//  xml.m:878
            {
              HeadVar__2_2 = string.int_to_base_string_3_p_0(N_6, V_8_8);
            }
//  xml.m:877
          }
//  xml.m:870
          break;
        case 7:
//  xml.m:879
          HeadVar__2_2 = ((xml.Ref_0.Def_1) HeadVar__1_1).F1;
//  xml.m:870
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
      return HeadVar__2_2;
    }
//  xml.m:868
  }
//  xml.m:850
  private static java.lang.String spec_to_dump_string_2_p_0(
    xml.Spec_0 HeadVar__1_1)
  {
//  xml.m:852
    {
      boolean succeeded = false;
      java.lang.String S_2 = null;

      switch (HeadVar__1_1.data_tag) {
        case 0:
//  xml.m:863
          {
            java.lang.String S1_29 = ((xml.Spec_0.Empty_tag_2) HeadVar__1_1).F1;
            list.List_1 As_30 = ((xml.Spec_0.Empty_tag_2) HeadVar__1_1).F2;
            java.lang.String S2_32 = null;
            java.lang.String V_39_39 = null;
            java.lang.String V_40_40 = null;

//  xml.m:864
            {
              S2_32 = xml.attributes_to_string_2_p_0(As_30);
            }
            {
              V_39_39 = string.f_43_43_2_f_0(S1_29, S2_32);
            }
            V_40_40 = "EMPTY ";
            {
              S_2 = string.f_43_43_2_f_0(V_40_40, V_39_39);
            }
//  xml.m:863
          }
//  xml.m:852
          break;
        case 1:
          S_2 = "CDATA\n";
          break;
        case 2:
          S_2 = "COMMENT\n";
          break;
        case 3:
//  xml.m:857
          {
            java.lang.String S0_14 = ((xml.Spec_0.Procinstr_2) HeadVar__1_1).F1;
            java.lang.String V_41_41 = "\n";
            java.lang.String V_42_42 = null;
            java.lang.String V_43_43 = null;
            java.lang.String V_15_15 = ((xml.Spec_0.Procinstr_2) HeadVar__1_1).F2;

            {
              V_42_42 = string.f_43_43_2_f_0(S0_14, V_41_41);
            }
            V_43_43 = "PROCESSING INSTRUCTION ";
            {
              S_2 = string.f_43_43_2_f_0(V_43_43, V_42_42);
            }
          }
//  xml.m:852
          break;
        case 4:
//  xml.m:854
          {
            xml.Ref_0 E_7 = ((xml.Spec_0.Ref_1) HeadVar__1_1).F1;
            java.lang.String S0_9 = null;
            java.lang.String V_44_44 = null;
            java.lang.String V_45_45 = null;
            java.lang.String V_46_46 = null;

//  xml.m:855
            {
              S0_9 = xml.ref_to_string_2_p_0(E_7);
            }
            V_44_44 = "\n";
            {
              V_45_45 = string.f_43_43_2_f_0(S0_9, V_44_44);
            }
            V_46_46 = "REFERENCE ";
            {
              S_2 = string.f_43_43_2_f_0(V_46_46, V_45_45);
            }
//  xml.m:854
          }
//  xml.m:852
          break;
        case 5:
          S_2 = "DOCTYPE\n";
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
      return S_2;
    }
//  xml.m:850
  }
//  xml.m:799
  private static java.lang.String attributes_to_string_2_p_0(
    list.List_1 HeadVar__1_1)
  {
//  xml.m:801
    {
      boolean succeeded = false;
      java.lang.String HeadVar__2_2 = null;

      if ((HeadVar__1_1.data_tag == 0))
//  xml.m:805
        HeadVar__2_2 = "";
//  xml.m:801
      else
        {
          java.lang.String S1_3 = null;
          java.lang.String S2_4 = null;
          list.List_1 As_5 = ((list.List_1.F_cons_2) HeadVar__1_1).F2;
          java.lang.String S3_7 = null;
          java.lang.String S4_8 = null;
          pair.Pair_2 V_9_9 = ((pair.Pair_2) ((list.List_1.F_cons_2) HeadVar__1_1).F1);
          java.lang.String V_16_16 = null;
          java.lang.String V_17_17 = null;
          java.lang.String V_18_18 = null;
          java.lang.String V_19_19 = null;
          java.lang.String V_20_20 = null;
          java.lang.String V_21_21 = null;

          S1_3 = ((java.lang.String) ((pair.Pair_2) V_9_9).F1);
          S2_4 = ((java.lang.String) ((pair.Pair_2) V_9_9).F2);
          V_16_16 = "\"";
          {
            V_17_17 = string.f_43_43_2_f_0(S2_4, V_16_16);
          }
          V_18_18 = "=\"";
          {
            V_19_19 = string.f_43_43_2_f_0(V_18_18, V_17_17);
          }
          {
            V_20_20 = string.f_43_43_2_f_0(S1_3, V_19_19);
          }
          V_21_21 = " ";
          {
            S3_7 = string.f_43_43_2_f_0(V_21_21, V_20_20);
          }
//  xml.m:803
          {
            S4_8 = xml.attributes_to_string_2_p_0(As_5);
          }
//  xml.m:804
          {
            HeadVar__2_2 = string.append_3_p_2(S3_7, S4_8);
          }
//  xml.m:801
        }
      return HeadVar__2_2;
    }
//  xml.m:799
  }
//  xml.m:785
  private static java.lang.String item_to_string_2_p_0(
    pair.Pair_2 HeadVar__1_1)
  {
//  xml.m:787
    {
      boolean succeeded = false;
      java.lang.String S_2 = null;
      xml.Stream_obj_0 V_38_38 = ((xml.Stream_obj_0) ((pair.Pair_2) HeadVar__1_1).F2);
      int V_39_39 = ((java.lang.Integer) (((pair.Pair_2) HeadVar__1_1).F1)).intValue();

      switch (V_38_38.data_tag) {
        case 0:
//  xml.m:796
          S_2 = ((xml.Stream_obj_0.Text_1) V_38_38).F1;
//  xml.m:787
          break;
        case 1:
//  xml.m:794
          {
            xml.Spec_0 X_32 = ((xml.Stream_obj_0.Spec_1) V_38_38).F1;

//  xml.m:795
            {
              S_2 = xml.spec_to_string_2_p_0(X_32);
            }
//  xml.m:794
          }
//  xml.m:787
          break;
        case 2:
//  xml.m:792
          {
            java.lang.String S0_24 = ((xml.Stream_obj_0.Empty_tag_1) V_38_38).F1;
            java.lang.String V_40_40 = "/>";
            java.lang.String V_41_41 = null;
            java.lang.String V_42_42 = null;

            {
              V_41_41 = string.f_43_43_2_f_0(S0_24, V_40_40);
            }
            V_42_42 = "<";
            {
              S_2 = string.f_43_43_2_f_0(V_42_42, V_41_41);
            }
          }
//  xml.m:787
          break;
        case 3:
          {
            java.lang.String S1_4 = ((xml.Stream_obj_0.Start_tag_2) V_38_38).F1;
            list.List_1 As_5 = ((xml.Stream_obj_0.Start_tag_2) V_38_38).F2;
            java.lang.String S2_7 = null;
            java.lang.String V_46_46 = null;
            java.lang.String V_47_47 = null;
            java.lang.String V_48_48 = null;
            java.lang.String V_49_49 = null;

//  xml.m:788
            {
              S2_7 = xml.attributes_to_string_2_p_0(As_5);
            }
            V_46_46 = ">";
            {
              V_47_47 = string.f_43_43_2_f_0(S2_7, V_46_46);
            }
            {
              V_48_48 = string.f_43_43_2_f_0(S1_4, V_47_47);
            }
            V_49_49 = "<";
            {
              S_2 = string.f_43_43_2_f_0(V_49_49, V_48_48);
            }
//  xml.m:787
          }
          break;
        case 4:
//  xml.m:790
          {
            java.lang.String S0_16 = ((xml.Stream_obj_0.End_tag_1) V_38_38).F1;
            java.lang.String V_43_43 = ">";
            java.lang.String V_44_44 = null;
            java.lang.String V_45_45 = null;

            {
              V_44_44 = string.f_43_43_2_f_0(S0_16, V_43_43);
            }
            V_45_45 = "</";
            {
              S_2 = string.f_43_43_2_f_0(V_45_45, V_44_44);
            }
          }
//  xml.m:787
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
      return S_2;
    }
//  xml.m:785
  }
//  xml.m:776
  private static void spaces_3_p_0(
    int N_4)
  {
//  xml.m:782
    while (true)
      {
        /* tailcall optimized into a loop */
        {
          boolean succeeded = false;
//  xml.m:779
          int V_8_8 = 0;

          succeeded = (N_4 > V_8_8);
//  xml.m:782
          if (succeeded)
//  xml.m:780
            {
              int V_12_12 = 0;
              int V_14_14 = 0;
              java.lang.String V_15_15 = " ";

              {
                io.write_string_3_p_0(V_15_15);
              }
//  xml.m:781
              V_14_14 = 1;
              V_12_12 = (N_4 - V_14_14);
              /* direct tailcall eliminated */
              {
                int N__tmp_copy_4 = V_12_12;

                N_4 = N__tmp_copy_4;
              }
              continue;
//  xml.m:780
            }
//  xml.m:782
          else
//  xml.m:781
            {
            }
//  xml.m:782
        }
        break;
      }
//  xml.m:776
  }
//  xml.m:760
  private static void dump_tree_item_4_p_0(
    pair.Pair_2 HeadVar__1_1,
    int N_2)
  {
//  xml.m:762
    {
      boolean succeeded = false;
      xml.Tree_obj_0 V_51_51 = ((xml.Tree_obj_0) ((pair.Pair_2) HeadVar__1_1).F2);
      int V_52_52 = ((java.lang.Integer) (((pair.Pair_2) HeadVar__1_1).F1)).intValue();

      switch (V_51_51.data_tag) {
        case 0:
//  xml.m:770
          {
            java.lang.String S_37 = ((xml.Tree_obj_0.Text_1) V_51_51).F1;
            int L_40 = 0;
            java.lang.String V_45_45 = null;
            list.List_1 V_46_46 = null;
            string.Poly_type_0 V_48_48 = null;
            list.List_1 V_49_49 = null;

//  xml.m:771
            {
              xml.spaces_3_p_0(N_2);
            }
//  xml.m:772
            {
              L_40 = string.length_2_p_0(S_37);
            }
//  xml.m:773
            V_45_45 = "TEXT %i char(s)\n";
            {
              V_48_48 = new string.Poly_type_0.I_1(L_40);
            }
            V_49_49 = (list.List_1) xml.MR_scalar_common_2[0];
            {
              V_46_46 = new list.List_1.F_cons_2(((java.lang.Object) (V_48_48)), V_49_49);
            }
            {
              io.format_4_p_0(V_45_45, V_46_46);
            }
//  xml.m:770
          }
//  xml.m:762
          break;
        case 1:
//  xml.m:766
          {
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_50_50 = null;
            xml.Spec_0 X_27 = ((xml.Tree_obj_0.Spec_1) V_51_51).F1;
            java.lang.String S_30 = null;

//  xml.m:767
            {
              xml.spaces_3_p_0(N_2);
            }
//  xml.m:768
            {
              S_30 = xml.spec_to_dump_string_2_p_0(X_27);
            }
            TypeCtorInfo_50_50 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
//  xml.m:769
            {
              io.print_3_p_0(TypeCtorInfo_50_50, ((java.lang.Object) (S_30)));
            }
//  xml.m:766
          }
//  xml.m:762
          break;
        case 2:
          {
            java.lang.String S1_6 = ((xml.Tree_obj_0.Element_3) V_51_51).F1;
            list.List_1 As_7 = ((xml.Tree_obj_0.Element_3) V_51_51).F2;
            list.List_1 Es_8 = ((xml.Tree_obj_0.Element_3) V_51_51).F3;
            java.lang.String S2_11 = null;
            int V_23_23 = 0;
            int V_25_25 = 0;
            java.lang.String V_53_53 = null;
            java.lang.String V_54_54 = null;
            java.lang.String V_55_55 = null;
            java.lang.String V_56_56 = null;
            java.lang.String V_57_57 = null;

//  xml.m:763
            {
              xml.spaces_3_p_0(N_2);
            }
            {
              S2_11 = xml.attributes_to_string_2_p_0(As_7);
            }
            V_53_53 = "\n";
            {
              V_54_54 = string.f_43_43_2_f_0(S2_11, V_53_53);
            }
            {
              V_55_55 = string.f_43_43_2_f_0(S1_6, V_54_54);
            }
            V_56_56 = "ELEMENT ";
            {
              V_57_57 = string.f_43_43_2_f_0(V_56_56, V_55_55);
            }
            {
              io.write_string_3_p_0(V_57_57);
            }
//  xml.m:765
            V_25_25 = 2;
            V_23_23 = (N_2 + V_25_25);
            {
              xml.dump_tree_4_p_0(Es_8, V_23_23);
            }
//  xml.m:762
          }
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
    }
//  xml.m:760
  }
//  xml.m:743
  private static void dump_stream_item_3_p_0(
    pair.Pair_2 HeadVar__1_1)
  {
//  xml.m:745
    {
      boolean succeeded = false;
      xml.Stream_obj_0 V_63_63 = ((xml.Stream_obj_0) ((pair.Pair_2) HeadVar__1_1).F2);
      int V_64_64 = ((java.lang.Integer) (((pair.Pair_2) HeadVar__1_1).F1)).intValue();

      switch (V_63_63.data_tag) {
        case 0:
//  xml.m:755
          {
            java.lang.String S_51 = ((xml.Stream_obj_0.Text_1) V_63_63).F1;
            int N_53 = 0;
            java.lang.String V_57_57 = null;
            list.List_1 V_58_58 = null;
            string.Poly_type_0 V_60_60 = null;
            list.List_1 V_61_61 = null;

//  xml.m:756
            {
              N_53 = string.length_2_p_0(S_51);
            }
//  xml.m:757
            V_57_57 = "TEXT %i char(s)\n";
            {
              V_60_60 = new string.Poly_type_0.I_1(N_53);
            }
            V_61_61 = (list.List_1) xml.MR_scalar_common_2[0];
            {
              V_58_58 = new list.List_1.F_cons_2(((java.lang.Object) (V_60_60)), V_61_61);
            }
            {
              io.format_4_p_0(V_57_57, V_58_58);
            }
//  xml.m:755
          }
//  xml.m:745
          break;
        case 1:
//  xml.m:752
          {
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_62_62 = null;
            xml.Spec_0 X_42 = ((xml.Stream_obj_0.Spec_1) V_63_63).F1;
            java.lang.String S_44 = null;

//  xml.m:753
            {
              S_44 = xml.spec_to_dump_string_2_p_0(X_42);
            }
            TypeCtorInfo_62_62 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
//  xml.m:754
            {
              io.print_3_p_0(TypeCtorInfo_62_62, ((java.lang.Object) (S_44)));
            }
            {
              io.nl_2_p_0();
            }
//  xml.m:752
          }
//  xml.m:745
          break;
        case 2:
//  xml.m:750
          {
            java.lang.String S_31 = ((xml.Stream_obj_0.Empty_tag_1) V_63_63).F1;
            java.lang.String V_65_65 = "\n";
            java.lang.String V_66_66 = null;
            java.lang.String V_67_67 = null;
            java.lang.String V_68_68 = null;

            {
              V_66_66 = string.f_43_43_2_f_0(S_31, V_65_65);
            }
            V_67_67 = "EMPTY TAG ";
            {
              V_68_68 = string.f_43_43_2_f_0(V_67_67, V_66_66);
            }
            {
              io.write_string_3_p_0(V_68_68);
            }
          }
//  xml.m:745
          break;
        case 3:
          {
            java.lang.String S1_5 = ((xml.Stream_obj_0.Start_tag_2) V_63_63).F1;
            list.List_1 As_6 = ((xml.Stream_obj_0.Start_tag_2) V_63_63).F2;
            java.lang.String S2_8 = null;
            java.lang.String V_73_73 = null;
            java.lang.String V_74_74 = null;
            java.lang.String V_75_75 = null;
            java.lang.String V_76_76 = null;
            java.lang.String V_77_77 = null;

//  xml.m:746
            {
              S2_8 = xml.attributes_to_string_2_p_0(As_6);
            }
            V_73_73 = "\n";
            {
              V_74_74 = string.f_43_43_2_f_0(S2_8, V_73_73);
            }
            {
              V_75_75 = string.f_43_43_2_f_0(S1_5, V_74_74);
            }
            V_76_76 = "START TAG ";
            {
              V_77_77 = string.f_43_43_2_f_0(V_76_76, V_75_75);
            }
            {
              io.write_string_3_p_0(V_77_77);
            }
//  xml.m:745
          }
          break;
        case 4:
//  xml.m:748
          {
            java.lang.String S_20 = ((xml.Stream_obj_0.End_tag_1) V_63_63).F1;
            java.lang.String V_69_69 = "\n";
            java.lang.String V_70_70 = null;
            java.lang.String V_71_71 = null;
            java.lang.String V_72_72 = null;

            {
              V_70_70 = string.f_43_43_2_f_0(S_20, V_69_69);
            }
            V_71_71 = "END TAG ";
            {
              V_72_72 = string.f_43_43_2_f_0(V_71_71, V_70_70);
            }
            {
              io.write_string_3_p_0(V_72_72);
            }
          }
//  xml.m:745
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
    }
//  xml.m:743
  }
//  xml.m:735
  private static void dump_tree_4_p_0(
    list.List_1 HeadVar__1_1,
    int N_2)
  {
//  xml.m:737
    while (true)
      {
        /* tailcall optimized into a loop */
        {
          boolean succeeded = false;

          if ((HeadVar__1_1.data_tag == 0))
//  xml.m:740
            {
            }
//  xml.m:737
          else
            {
              pair.Pair_2 E_5 = ((pair.Pair_2) ((list.List_1.F_cons_2) HeadVar__1_1).F1);
              list.List_1 Es_6 = ((list.List_1.F_cons_2) HeadVar__1_1).F2;

//  xml.m:738
              {
                xml.dump_tree_item_4_p_0(E_5, N_2);
              }
//  xml.m:739
              /* direct tailcall eliminated */
              {
                list.List_1 HeadVar__1__tmp_copy_1 = Es_6;

                HeadVar__1_1 = HeadVar__1__tmp_copy_1;
              }
              continue;
//  xml.m:737
            }
        }
        break;
      }
//  xml.m:735
  }
//  xml.m:718
  private static void write_item_4_p_0(
    io.Output_stream_0 S_5,
    pair.Pair_2 Item_6)
  {
//  xml.m:720
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_12_12 = null;
      java.lang.String String_8 = null;

//  xml.m:721
      {
        String_8 = xml.item_to_string_2_p_0(Item_6);
      }
      TypeCtorInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
//  xml.m:722
      {
        io.print_4_p_0(TypeCtorInfo_12_12, S_5, ((java.lang.Object) (String_8)));
      }
//  xml.m:720
    }
//  xml.m:718
  }
//  xml.m:700
  private static list.List_1 tree_to_stream_3_p_0(
    pair.Pair_2 HeadVar__1_1,
    list.List_1 Ns_2)
  {
//  xml.m:702
    {
      boolean succeeded = false;
      list.List_1 HeadVar__3_3 = null;
      xml.Tree_obj_0 V_37_37 = ((xml.Tree_obj_0) ((pair.Pair_2) HeadVar__1_1).F2);
      int V_38_38 = ((java.lang.Integer) (((pair.Pair_2) HeadVar__1_1).F1)).intValue();

      switch (V_37_37.data_tag) {
        case 0:
//  xml.m:707
          {
            java.lang.String T_23 = ((xml.Tree_obj_0.Text_1) V_37_37).F1;
            list.List_1 Es_25 = null;
            pair.Pair_2 V_27_27 = null;
            xml.Stream_obj_0 V_28_28 = null;

            {
              V_28_28 = new xml.Stream_obj_0.Text_1(T_23);
            }
            {
              V_27_27 = new pair.Pair_2(java.lang.Integer.valueOf(V_38_38), ((java.lang.Object) (V_28_28)));
            }
//  xml.m:695
            if ((Ns_2.data_tag == 0))
//  xml.m:697
              Es_25 = (list.List_1) xml.MR_scalar_common_2[0];
//  xml.m:695
            else
              {
                pair.Pair_2 N_48 = ((pair.Pair_2) ((list.List_1.F_cons_2) Ns_2).F1);
                list.List_1 Ns_49 = ((list.List_1.F_cons_2) Ns_2).F2;

//  xml.m:696
                {
                  Es_25 = xml.tree_to_stream_3_p_0(N_48, Ns_49);
                }
//  xml.m:695
              }
//  xml.m:707
            {
              HeadVar__3_3 = new list.List_1.F_cons_2(((java.lang.Object) (V_27_27)), Es_25);
            }
          }
//  xml.m:702
          break;
        case 1:
//  xml.m:709
          {
            xml.Spec_0 S_30 = ((xml.Tree_obj_0.Spec_1) V_37_37).F1;
            list.List_1 Es_32 = null;
            pair.Pair_2 V_34_34 = null;
            xml.Stream_obj_0 V_35_35 = null;

            {
              V_35_35 = new xml.Stream_obj_0.Spec_1(S_30);
            }
            {
              V_34_34 = new pair.Pair_2(java.lang.Integer.valueOf(V_38_38), ((java.lang.Object) (V_35_35)));
            }
//  xml.m:695
            if ((Ns_2.data_tag == 0))
//  xml.m:697
              Es_32 = (list.List_1) xml.MR_scalar_common_2[0];
//  xml.m:695
            else
              {
                pair.Pair_2 N_45 = ((pair.Pair_2) ((list.List_1.F_cons_2) Ns_2).F1);
                list.List_1 Ns_46 = ((list.List_1.F_cons_2) Ns_2).F2;

//  xml.m:696
                {
                  Es_32 = xml.tree_to_stream_3_p_0(N_45, Ns_46);
                }
//  xml.m:695
              }
//  xml.m:709
            {
              HeadVar__3_3 = new list.List_1.F_cons_2(((java.lang.Object) (V_34_34)), Es_32);
            }
          }
//  xml.m:702
          break;
        case 2:
          {
            jmercury.runtime.TypeInfo_Struct TypeInfo_36_36 = null;
            java.lang.String S_5 = ((xml.Tree_obj_0.Element_3) V_37_37).F1;
            list.List_1 As_6 = ((xml.Tree_obj_0.Element_3) V_37_37).F2;
            list.List_1 Ns0_7 = ((xml.Tree_obj_0.Element_3) V_37_37).F3;
            list.List_1 Es0_10 = null;
            list.List_1 Es1_11 = null;
            list.List_1 Es2_12 = null;
            list.List_1 V_14_14 = null;
            list.List_1 V_15_15 = null;
            pair.Pair_2 V_16_16 = null;
            xml.Stream_obj_0 V_17_17 = null;
            pair.Pair_2 V_18_18 = null;
            int V_19_19 = 0;
            xml.Stream_obj_0 V_20_20 = null;
            list.List_1 V_21_21 = null;

//  xml.m:695
            if ((Ns0_7.data_tag == 0))
//  xml.m:697
              Es0_10 = (list.List_1) xml.MR_scalar_common_2[0];
//  xml.m:695
            else
              {
                pair.Pair_2 N_39 = ((pair.Pair_2) ((list.List_1.F_cons_2) Ns0_7).F1);
                list.List_1 Ns_40 = ((list.List_1.F_cons_2) Ns0_7).F2;

//  xml.m:696
                {
                  Es0_10 = xml.tree_to_stream_3_p_0(N_39, Ns_40);
                }
//  xml.m:695
              }
//  xml.m:704
            {
              V_17_17 = new xml.Stream_obj_0.Start_tag_2(S_5, As_6);
            }
            {
              V_16_16 = new pair.Pair_2(java.lang.Integer.valueOf(V_38_38), ((java.lang.Object) (V_17_17)));
            }
            {
              V_14_14 = new list.List_1.F_cons_2(((java.lang.Object) (V_16_16)), Es0_10);
            }
            V_19_19 = -1;
            {
              V_20_20 = new xml.Stream_obj_0.End_tag_1(S_5);
            }
            {
              V_18_18 = new pair.Pair_2(java.lang.Integer.valueOf(V_19_19), ((java.lang.Object) (V_20_20)));
            }
            V_21_21 = (list.List_1) xml.MR_scalar_common_2[0];
            {
              V_15_15 = new list.List_1.F_cons_2(((java.lang.Object) (V_18_18)), V_21_21);
            }
            TypeInfo_36_36 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[0]);
            {
              Es1_11 = list.append_3_p_1(TypeInfo_36_36, V_14_14, V_15_15);
            }
//  xml.m:695
            if ((Ns_2.data_tag == 0))
//  xml.m:697
              Es2_12 = (list.List_1) xml.MR_scalar_common_2[0];
//  xml.m:695
            else
              {
                pair.Pair_2 N_42 = ((pair.Pair_2) ((list.List_1.F_cons_2) Ns_2).F1);
                list.List_1 Ns_43 = ((list.List_1.F_cons_2) Ns_2).F2;

//  xml.m:696
                {
                  Es2_12 = xml.tree_to_stream_3_p_0(N_42, Ns_43);
                }
//  xml.m:695
              }
//  xml.m:706
            {
              HeadVar__3_3 = list.append_3_p_1(TypeInfo_36_36, Es1_11, Es2_12);
            }
//  xml.m:702
          }
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
      return HeadVar__3_3;
    }
//  xml.m:700
  }
//  xml.m:679
  private static xml.Tree_obj_0 empty_element_3_p_0(
    java.lang.String Nm_4,
    list.List_1 As_5)
  {
//  xml.m:681
    {
      boolean succeeded = false;
      xml.Tree_obj_0 E_6 = null;
      xml.Spec_0 V_7_7 = null;

//  xml.m:682
      {
        V_7_7 = new xml.Spec_0.Empty_tag_2(Nm_4, As_5);
      }
      {
        E_6 = new xml.Tree_obj_0.Spec_1(V_7_7);
      }
//  xml.m:681
      return E_6;
    }
//  xml.m:679
  }
//  xml.m:640
  private static list.List_1 open_new_elems_2_p_0(
    list.List_1 HeadVar__1_1)
  {
//  xml.m:642
    {
      boolean succeeded = false;
      list.List_1 HeadVar__2_2 = null;

      if ((HeadVar__1_1.data_tag == 0))
//  xml.m:644
        HeadVar__2_2 = (list.List_1) xml.MR_scalar_common_2[0];
//  xml.m:642
      else
        {
          int L_3 = 0;
          java.lang.String Nm_4 = null;
          list.List_1 As_5 = null;
          list.List_1 Skipped_7 = ((list.List_1.F_cons_2) HeadVar__1_1).F2;
          list.List_1 Stack_8 = null;
          pair.Pair_2 V_9_9 = ((pair.Pair_2) ((list.List_1.F_cons_2) HeadVar__1_1).F1);
          xml.Stack_item_0 V_10_10 = null;
          pair.Pair_2 V_11_11 = null;
          xml.Stack_item_0 V_12_12 = null;
          list.List_1 V_13_13 = null;
          list.List_1 V_6_6 = null;

          L_3 = ((java.lang.Integer) (((pair.Pair_2) V_9_9).F1)).intValue();
          V_10_10 = ((xml.Stack_item_0) ((pair.Pair_2) V_9_9).F2);
          Nm_4 = ((xml.Stack_item_0) V_10_10).F1;
          As_5 = ((xml.Stack_item_0) V_10_10).F2;
          V_6_6 = ((xml.Stack_item_0) V_10_10).F3;
          V_13_13 = (list.List_1) xml.MR_scalar_common_2[0];
          {
            V_12_12 = new xml.Stack_item_0(Nm_4, As_5, V_13_13);
          }
          {
            V_11_11 = new pair.Pair_2(java.lang.Integer.valueOf(L_3), ((java.lang.Object) (V_12_12)));
          }
//  xml.m:643
          {
            Stack_8 = xml.open_new_elems_2_p_0(Skipped_7);
          }
//  xml.m:642
          {
            HeadVar__2_2 = new list.List_1.F_cons_2(((java.lang.Object) (V_11_11)), Stack_8);
          }
        }
      return HeadVar__2_2;
    }
//  xml.m:640
  }
//  xml.m:630
  private static pair.Pair_2 close_elems_6_p_0(
    list.List_1 HeadVar__1_1,
    list.List_1 HeadVar__2_2,
    int HeadVar__3_3,
    java.lang.String HeadVar__4_4,
    list.List_1 HeadVar__5_5)
  {
//  xml.m:632
    while (true)
      {
        /* tailcall optimized into a loop */
        {
          boolean succeeded = false;
          pair.Pair_2 Element_6 = null;

          if ((HeadVar__1_1.data_tag == 0))
//  xml.m:636
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_31_31 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[3]);
              list.List_1 RevT_28 = null;
              xml.Tree_obj_0 V_29_29 = null;

//  xml.m:637
              {
                RevT_28 = list.reverse_2_p_0(TypeInfo_31_31, HeadVar__2_2);
              }
//  xml.m:638
              {
                V_29_29 = new xml.Tree_obj_0.Element_3(HeadVar__4_4, HeadVar__5_5, RevT_28);
              }
              {
                Element_6 = new pair.Pair_2(java.lang.Integer.valueOf(HeadVar__3_3), ((java.lang.Object) (V_29_29)));
              }
//  xml.m:636
            }
//  xml.m:632
          else
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_30_30 = null;
              int L_7 = 0;
              java.lang.String Nm_8 = null;
              list.List_1 As_9 = null;
              list.List_1 T_10 = null;
              list.List_1 Rest_11 = ((list.List_1.F_cons_2) HeadVar__1_1).F2;
              list.List_1 RevT0_17 = null;
              list.List_1 Tree_18 = null;
              pair.Pair_2 V_19_19 = ((pair.Pair_2) ((list.List_1.F_cons_2) HeadVar__1_1).F1);
              xml.Stack_item_0 V_20_20 = null;
              pair.Pair_2 V_21_21 = null;
              xml.Tree_obj_0 V_22_22 = null;

              L_7 = ((java.lang.Integer) (((pair.Pair_2) V_19_19).F1)).intValue();
              V_20_20 = ((xml.Stack_item_0) ((pair.Pair_2) V_19_19).F2);
              Nm_8 = ((xml.Stack_item_0) V_20_20).F1;
              As_9 = ((xml.Stack_item_0) V_20_20).F2;
              T_10 = ((xml.Stack_item_0) V_20_20).F3;
              TypeInfo_30_30 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[3]);
//  xml.m:633
              {
                RevT0_17 = list.reverse_2_p_0(TypeInfo_30_30, HeadVar__2_2);
              }
//  xml.m:634
              {
                V_22_22 = new xml.Tree_obj_0.Element_3(Nm_8, As_9, RevT0_17);
              }
              {
                V_21_21 = new pair.Pair_2(java.lang.Integer.valueOf(L_7), ((java.lang.Object) (V_22_22)));
              }
              {
                Tree_18 = new list.List_1.F_cons_2(((java.lang.Object) (V_21_21)), T_10);
              }
//  xml.m:635
              /* direct tailcall eliminated */
              {
                list.List_1 HeadVar__1__tmp_copy_1 = Rest_11;
                list.List_1 HeadVar__2__tmp_copy_2 = Tree_18;

                HeadVar__2_2 = HeadVar__2__tmp_copy_2;
                HeadVar__1_1 = HeadVar__1__tmp_copy_1;
              }
              continue;
//  xml.m:632
            }
          return Element_6;
        }
      }
//  xml.m:630
  }
//  xml.m:608
  private static java.lang.Object [] find_start_tag_10_p_0(
    java.lang.String F_1,
    int L2_2,
    list.List_1 HeadVar__3_3,
    list.List_1 Skipped_4,
    java.lang.String Nm2_5,
    list.List_1 HeadVar__7_7,
    list.List_1 STATE_VARIABLE_Es_0_9)
  {
//  xml.m:610
    while (true)
      {
        /* tailcall optimized into a loop */
        {
          boolean succeeded = false;
          list.List_1 HeadVar__6_6 = null;
          list.List_1 T_8 = null;
          list.List_1 STATE_VARIABLE_Es_10 = null;

          if ((HeadVar__3_3.data_tag == 0))
//  xml.m:626
            {
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_60_60 = null;
              errors.Err_loc_0 V_53_53 = null;
              xml.Error_0 V_54_54 = null;
              java.lang.String V_56_56 = null;

              HeadVar__6_6 = (list.List_1) xml.MR_scalar_common_2[0];
              T_8 = HeadVar__7_7;
//  xml.m:627
              {
                V_53_53 = new errors.Err_loc_0.File_2(F_1, L2_2);
              }
              V_56_56 = "end tag";
              {
                V_54_54 = new xml.Error_0.Unexpected_name_2(V_56_56, Nm2_5);
              }
              TypeCtorInfo_60_60 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.xml__type_ctor_info_error_0);
              {
                STATE_VARIABLE_Es_10 = errors.add_error_4_p_0(TypeCtorInfo_60_60, V_53_53, ((java.lang.Object) (V_54_54)), STATE_VARIABLE_Es_0_9);
              }
//  xml.m:626
            }
//  xml.m:610
          else
            {
              int L1_13 = 0;
              java.lang.String Nm1_14 = null;
              list.List_1 As_15 = null;
              list.List_1 T1_16 = null;
              list.List_1 Rest_17 = ((list.List_1.F_cons_2) HeadVar__3_3).F2;
              pair.Pair_2 V_32_32 = ((pair.Pair_2) ((list.List_1.F_cons_2) HeadVar__3_3).F1);
              xml.Stack_item_0 V_33_33 = null;
//  xml.m:690
              java.lang.String X1_63 = null;
              java.lang.String X2_64 = null;

//  xml.m:610
              L1_13 = ((java.lang.Integer) (((pair.Pair_2) V_32_32).F1)).intValue();
              V_33_33 = ((xml.Stack_item_0) ((pair.Pair_2) V_32_32).F2);
              Nm1_14 = ((xml.Stack_item_0) V_33_33).F1;
              As_15 = ((xml.Stack_item_0) V_33_33).F2;
              T1_16 = ((xml.Stack_item_0) V_33_33).F3;
//  xml.m:691
              {
                X1_63 = string.to_lower_2_p_0(Nm1_14);
              }
//  xml.m:692
              {
                X2_64 = string.to_lower_2_p_0(Nm2_5);
              }
//  xml.m:693
              succeeded = X1_63.equals(X2_64);
//  xml.m:620
              if (succeeded)
//  xml.m:612
                {
                  jmercury.runtime.TypeInfo_Struct TypeInfo_57_57 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[3]);
                  list.List_1 RevT0_24 = null;

                  {
                    RevT0_24 = list.reverse_2_p_0(TypeInfo_57_57, HeadVar__7_7);
                  }
//  xml.m:613
                  succeeded = (Skipped_4.data_tag == 0);
//  xml.m:615
                  if (succeeded)
//  xml.m:614
                    {
                      pair.Pair_2 V_34_34 = null;
                      xml.Tree_obj_0 V_35_35 = null;

                      HeadVar__6_6 = Rest_17;
                      {
                        V_35_35 = new xml.Tree_obj_0.Element_3(Nm1_14, As_15, RevT0_24);
                      }
                      {
                        V_34_34 = new pair.Pair_2(java.lang.Integer.valueOf(L1_13), ((java.lang.Object) (V_35_35)));
                      }
                      {
                        T_8 = new list.List_1.F_cons_2(((java.lang.Object) (V_34_34)), T1_16);
                      }
                    }
//  xml.m:615
                  else
//  xml.m:616
                    {
                      jmercury.runtime.TypeInfo_Struct TypeInfo_58_58 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[4]);
                      list.List_1 RevSkipped_25 = null;
                      pair.Pair_2 Element_26 = null;
                      list.List_1 NewTopStack_27 = null;

                      {
                        RevSkipped_25 = list.reverse_2_p_0(TypeInfo_58_58, Skipped_4);
                      }
//  xml.m:617
                      {
                        Element_26 = xml.close_elems_6_p_0(RevSkipped_25, RevT0_24, L1_13, Nm1_14, As_15);
                      }
//  xml.m:618
                      {
                        NewTopStack_27 = xml.open_new_elems_2_p_0(Skipped_4);
                      }
//  xml.m:619
                      {
                        HeadVar__6_6 = list.append_3_p_1(TypeInfo_58_58, NewTopStack_27, Rest_17);
                      }
                      {
                        T_8 = new list.List_1.F_cons_2(((java.lang.Object) (Element_26)), T1_16);
                      }
//  xml.m:616
                    }
//  xml.m:619
                  STATE_VARIABLE_Es_10 = STATE_VARIABLE_Es_0_9;
//  xml.m:612
                }
//  xml.m:620
              else
//  xml.m:624
                {
//  xml.m:620
                  java.lang.String LowNm1_28 = null;
//  xml.m:662
                  int lo_0 = 0;
                  int hi_1 = 0;
                  int mid_2 = 0;
                  int result_3 = 0;
                  int stop_loop_4 = 0;

//  xml.m:620
                  {
                    LowNm1_28 = string.to_lower_2_p_0(Nm1_14);
                  }
//  xml.m:662
                  /* binary string jump switch */
                  succeeded = false;
                  lo_0 = 0;
                  hi_1 = 14;
                  stop_loop_4 = 0;
                  do
                    {
                      mid_2 = ((lo_0 + hi_1) / 2);
                      result_3 = (LowNm1_28.compareTo(((xml.Vector_common_type_19_0) (MR_vector_common_19[28 + mid_2])).vct_19_f_0)) ;
                      if ((result_3 == 0))
                        {
                          switch (((xml.Vector_common_type_19_0) (MR_vector_common_19[28 + mid_2])).vct_19_f_1) {
                            case 0:
                              {
                                /* case "body" */
                                succeeded = true;
                              }
                              break;
                            case 1:
//  xml.m:663
                              {
                                /* case "colgroup" */
                                succeeded = true;
                              }
//  xml.m:662
                              break;
                            case 2:
//  xml.m:664
                              {
                                /* case "dd" */
                                succeeded = true;
                              }
//  xml.m:662
                              break;
                            case 3:
//  xml.m:665
                              {
                                /* case "dt" */
                                succeeded = true;
                              }
//  xml.m:662
                              break;
                            case 4:
//  xml.m:666
                              {
                                /* case "head" */
                                succeeded = true;
                              }
//  xml.m:662
                              break;
                            case 5:
//  xml.m:667
                              {
                                /* case "html" */
                                succeeded = true;
                              }
//  xml.m:662
                              break;
                            case 6:
//  xml.m:668
                              {
                                /* case "li" */
                                succeeded = true;
                              }
//  xml.m:662
                              break;
                            case 7:
//  xml.m:669
                              {
                                /* case "option" */
                                succeeded = true;
                              }
//  xml.m:662
                              break;
                            case 8:
//  xml.m:670
                              {
                                /* case "p" */
                                succeeded = true;
                              }
//  xml.m:662
                              break;
                            case 9:
//  xml.m:671
                              {
                                /* case "tbody" */
                                succeeded = true;
                              }
//  xml.m:662
                              break;
                            case 10:
//  xml.m:672
                              {
                                /* case "td" */
                                succeeded = true;
                              }
//  xml.m:662
                              break;
                            case 11:
//  xml.m:673
                              {
                                /* case "tfoot" */
                                succeeded = true;
                              }
//  xml.m:662
                              break;
                            case 12:
//  xml.m:674
                              {
                                /* case "th" */
                                succeeded = true;
                              }
//  xml.m:662
                              break;
                            case 13:
//  xml.m:675
                              {
                                /* case "thead" */
                                succeeded = true;
                              }
//  xml.m:662
                              break;
                            case 14:
//  xml.m:676
                              {
                                /* case "tr" */
                                succeeded = true;
                              }
//  xml.m:662
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
//  xml.m:624
                  if (succeeded)
//  xml.m:621
                    {
                      jmercury.runtime.TypeInfo_Struct TypeInfo_59_59 = null;
                      list.List_1 T2_29 = null;
                      list.List_1 V_36_36 = null;
                      pair.Pair_2 V_37_37 = null;
                      xml.Tree_obj_0 Element_43 = null;
                      xml.Spec_0 V_68_68 = null;

//  xml.m:682
                      {
                        V_68_68 = new xml.Spec_0.Empty_tag_2(Nm1_14, As_15);
                      }
                      {
                        Element_43 = new xml.Tree_obj_0.Spec_1(V_68_68);
                      }
//  xml.m:622
                      {
                        V_37_37 = new pair.Pair_2(java.lang.Integer.valueOf(L1_13), ((java.lang.Object) (Element_43)));
                      }
                      {
                        V_36_36 = new list.List_1.F_cons_2(((java.lang.Object) (V_37_37)), HeadVar__7_7);
                      }
                      TypeInfo_59_59 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[3]);
                      {
                        T2_29 = list.append_3_p_1(TypeInfo_59_59, T1_16, V_36_36);
                      }
//  xml.m:623
                      /* direct tailcall eliminated */
                      {
                        list.List_1 HeadVar__3__tmp_copy_3 = Rest_17;
                        list.List_1 HeadVar__7__tmp_copy_7 = T2_29;

                        HeadVar__7_7 = HeadVar__7__tmp_copy_7;
                        HeadVar__3_3 = HeadVar__3__tmp_copy_3;
                      }
                      continue;
//  xml.m:621
                    }
//  xml.m:624
                  else
//  xml.m:625
                    {
                      list.List_1 V_39_39 = null;

                      {
                        V_39_39 = new list.List_1.F_cons_2(((java.lang.Object) (V_32_32)), Skipped_4);
                      }
                      /* direct tailcall eliminated */
                      {
                        list.List_1 HeadVar__3__tmp_copy_3 = Rest_17;
                        list.List_1 Skipped__tmp_copy_4 = V_39_39;

                        Skipped_4 = Skipped__tmp_copy_4;
                        HeadVar__3_3 = HeadVar__3__tmp_copy_3;
                      }
                      continue;
                    }
//  xml.m:624
                }
//  xml.m:610
            }
return new java.lang.Object[] {
            ((java.lang.Object) (HeadVar__6_6)),
            ((java.lang.Object) (T_8)),
            ((java.lang.Object) (STATE_VARIABLE_Es_10))
          };
        }
      }
//  xml.m:608
  }
//  xml.m:585
  private static java.lang.Object [] html_stream_to_tree_8_p_0(
    java.lang.String File_1,
    pair.Pair_2 HeadVar__2_2,
    list.List_1 S_3,
    list.List_1 T0_4,
    list.List_1 HeadVar__5_5,
    list.List_1 STATE_VARIABLE_Es_0_6)
  {
//  xml.m:587
    {
      boolean succeeded = false;
      list.List_1 STATE_VARIABLE_Es_7 = null;
      list.List_1 T_8 = null;
      xml.Stream_obj_0 V_94_94 = ((xml.Stream_obj_0) ((pair.Pair_2) HeadVar__2_2).F2);
      int V_95_95 = ((java.lang.Integer) (((pair.Pair_2) HeadVar__2_2).F1)).intValue();

      switch (V_94_94.data_tag) {
        case 0:
//  xml.m:601
          {
            java.lang.String X_66 = ((xml.Stream_obj_0.Text_1) V_94_94).F1;
            list.List_1 V_75_75 = null;
            pair.Pair_2 V_77_77 = null;
            xml.Tree_obj_0 V_78_78 = null;

//  xml.m:602
            {
              V_78_78 = new xml.Tree_obj_0.Text_1(X_66);
            }
            {
              V_77_77 = new pair.Pair_2(java.lang.Integer.valueOf(V_95_95), ((java.lang.Object) (V_78_78)));
            }
            {
              V_75_75 = new list.List_1.F_cons_2(((java.lang.Object) (V_77_77)), T0_4);
            }
            {
              java.lang.Object [] result = xml.html_stream_to_tree_7_p_0(File_1, S_3, V_75_75, HeadVar__5_5, STATE_VARIABLE_Es_0_6);
              STATE_VARIABLE_Es_7 = (list.List_1) result[0];
              T_8 = (list.List_1) result[1];
            }
//  xml.m:601
          }
//  xml.m:587
          break;
        case 1:
//  xml.m:603
          {
            xml.Spec_0 Spec_81 = ((xml.Stream_obj_0.Spec_1) V_94_94).F1;
            list.List_1 V_90_90 = null;
            pair.Pair_2 V_92_92 = null;
            xml.Tree_obj_0 V_93_93 = null;

//  xml.m:604
            {
              V_93_93 = new xml.Tree_obj_0.Spec_1(Spec_81);
            }
            {
              V_92_92 = new pair.Pair_2(java.lang.Integer.valueOf(V_95_95), ((java.lang.Object) (V_93_93)));
            }
            {
              V_90_90 = new list.List_1.F_cons_2(((java.lang.Object) (V_92_92)), T0_4);
            }
            {
              java.lang.Object [] result = xml.html_stream_to_tree_7_p_0(File_1, S_3, V_90_90, HeadVar__5_5, STATE_VARIABLE_Es_0_6);
              STATE_VARIABLE_Es_7 = (list.List_1) result[0];
              T_8 = (list.List_1) result[1];
            }
//  xml.m:603
          }
//  xml.m:587
          break;
        case 2:
//  xml.m:599
          {
            java.lang.String Nm_49 = ((xml.Stream_obj_0.Empty_tag_1) V_94_94).F1;
            list.List_1 V_58_58 = null;
            pair.Pair_2 V_60_60 = null;
            xml.Tree_obj_0 V_61_61 = null;
            list.List_1 V_62_62 = (list.List_1) xml.MR_scalar_common_2[0];
            list.List_1 V_63_63 = (list.List_1) xml.MR_scalar_common_2[0];

//  xml.m:600
            {
              V_61_61 = new xml.Tree_obj_0.Element_3(Nm_49, V_62_62, V_63_63);
            }
            {
              V_60_60 = new pair.Pair_2(java.lang.Integer.valueOf(V_95_95), ((java.lang.Object) (V_61_61)));
            }
            {
              V_58_58 = new list.List_1.F_cons_2(((java.lang.Object) (V_60_60)), T0_4);
            }
            {
              java.lang.Object [] result = xml.html_stream_to_tree_7_p_0(File_1, S_3, V_58_58, HeadVar__5_5, STATE_VARIABLE_Es_0_6);
              STATE_VARIABLE_Es_7 = (list.List_1) result[0];
              T_8 = (list.List_1) result[1];
            }
//  xml.m:599
          }
//  xml.m:587
          break;
        case 3:
          {
            java.lang.String Nm_11 = ((xml.Stream_obj_0.Start_tag_2) V_94_94).F1;
            list.List_1 As_12 = ((xml.Stream_obj_0.Start_tag_2) V_94_94).F2;
            java.lang.String LowNm_18 = null;
//  xml.m:647
            int lo_0 = 0;
            int hi_1 = 0;
            int mid_2 = 0;
            int result_3 = 0;
            int stop_loop_4 = 0;

//  xml.m:588
            {
              LowNm_18 = string.to_lower_2_p_0(Nm_11);
            }
//  xml.m:647
            /* binary string jump switch */
            succeeded = false;
            lo_0 = 0;
            hi_1 = 12;
            stop_loop_4 = 0;
            do
              {
                mid_2 = ((lo_0 + hi_1) / 2);
                result_3 = (LowNm_18.compareTo(((xml.Vector_common_type_19_0) (MR_vector_common_19[15 + mid_2])).vct_19_f_0)) ;
                if ((result_3 == 0))
                  {
                    switch (((xml.Vector_common_type_19_0) (MR_vector_common_19[15 + mid_2])).vct_19_f_1) {
                      case 0:
                        {
                          /* case "area" */
                          succeeded = true;
                        }
                        break;
                      case 1:
//  xml.m:648
                        {
                          /* case "base" */
                          succeeded = true;
                        }
//  xml.m:647
                        break;
                      case 2:
//  xml.m:649
                        {
                          /* case "basefont" */
                          succeeded = true;
                        }
//  xml.m:647
                        break;
                      case 3:
//  xml.m:650
                        {
                          /* case "br" */
                          succeeded = true;
                        }
//  xml.m:647
                        break;
                      case 4:
//  xml.m:651
                        {
                          /* case "col" */
                          succeeded = true;
                        }
//  xml.m:647
                        break;
                      case 5:
//  xml.m:652
                        {
                          /* case "frame" */
                          succeeded = true;
                        }
//  xml.m:647
                        break;
                      case 6:
//  xml.m:653
                        {
                          /* case "hr" */
                          succeeded = true;
                        }
//  xml.m:647
                        break;
                      case 7:
//  xml.m:654
                        {
                          /* case "img" */
                          succeeded = true;
                        }
//  xml.m:647
                        break;
                      case 8:
//  xml.m:655
                        {
                          /* case "input" */
                          succeeded = true;
                        }
//  xml.m:647
                        break;
                      case 9:
//  xml.m:656
                        {
                          /* case "isindex" */
                          succeeded = true;
                        }
//  xml.m:647
                        break;
                      case 10:
//  xml.m:657
                        {
                          /* case "link" */
                          succeeded = true;
                        }
//  xml.m:647
                        break;
                      case 11:
//  xml.m:658
                        {
                          /* case "meta" */
                          succeeded = true;
                        }
//  xml.m:647
                        break;
                      case 12:
//  xml.m:659
                        {
                          /* case "param" */
                          succeeded = true;
                        }
//  xml.m:647
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
//  xml.m:592
            if (succeeded)
//  xml.m:590
              {
                xml.Tree_obj_0 Element_19 = null;
                list.List_1 V_23_23 = null;
                pair.Pair_2 V_25_25 = null;

                {
                  Element_19 = xml.empty_element_3_p_0(Nm_11, As_12);
                }
//  xml.m:591
                {
                  V_25_25 = new pair.Pair_2(java.lang.Integer.valueOf(V_95_95), ((java.lang.Object) (Element_19)));
                }
                {
                  V_23_23 = new list.List_1.F_cons_2(((java.lang.Object) (V_25_25)), T0_4);
                }
                {
                  java.lang.Object [] result = xml.html_stream_to_tree_7_p_0(File_1, S_3, V_23_23, HeadVar__5_5, STATE_VARIABLE_Es_0_6);
                  STATE_VARIABLE_Es_7 = (list.List_1) result[0];
                  T_8 = (list.List_1) result[1];
                }
//  xml.m:590
              }
//  xml.m:592
            else
              {
                list.List_1 V_26_26 = (list.List_1) xml.MR_scalar_common_2[0];
                list.List_1 V_27_27 = null;
                pair.Pair_2 V_29_29 = null;
                xml.Stack_item_0 V_30_30 = null;

                {
                  V_30_30 = new xml.Stack_item_0(Nm_11, As_12, T0_4);
                }
                {
                  V_29_29 = new pair.Pair_2(java.lang.Integer.valueOf(V_95_95), ((java.lang.Object) (V_30_30)));
                }
                {
                  V_27_27 = new list.List_1.F_cons_2(((java.lang.Object) (V_29_29)), HeadVar__5_5);
                }
                {
                  java.lang.Object [] result = xml.html_stream_to_tree_7_p_0(File_1, S_3, V_26_26, V_27_27, STATE_VARIABLE_Es_0_6);
                  STATE_VARIABLE_Es_7 = (list.List_1) result[0];
                  T_8 = (list.List_1) result[1];
                }
              }
//  xml.m:587
          }
          break;
        case 4:
//  xml.m:593
          {
            java.lang.String Nm2_33 = ((xml.Stream_obj_0.End_tag_1) V_94_94).F1;
            list.List_1 Stack_39 = null;
            list.List_1 T2_40 = null;
            list.List_1 V_44_44 = (list.List_1) xml.MR_scalar_common_2[0];
            list.List_1 STATE_VARIABLE_Es_45_45 = null;

//  xml.m:597
            {
              java.lang.Object [] result = xml.find_start_tag_10_p_0(File_1, V_95_95, HeadVar__5_5, V_44_44, Nm2_33, T0_4, STATE_VARIABLE_Es_0_6);
              Stack_39 = (list.List_1) result[0];
              T2_40 = (list.List_1) result[1];
              STATE_VARIABLE_Es_45_45 = (list.List_1) result[2];
            }
//  xml.m:598
            {
              java.lang.Object [] result = xml.html_stream_to_tree_7_p_0(File_1, S_3, T2_40, Stack_39, STATE_VARIABLE_Es_45_45);
              STATE_VARIABLE_Es_7 = (list.List_1) result[0];
              T_8 = (list.List_1) result[1];
            }
//  xml.m:593
          }
//  xml.m:587
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_Es_7)),
        ((java.lang.Object) (T_8))
      };
    }
//  xml.m:585
  }
//  xml.m:573
  private static list.List_1 check_stack_4_p_0(
    java.lang.String File_1,
    list.List_1 HeadVar__2_2,
    list.List_1 STATE_VARIABLE_Es_0_3)
  {
//  xml.m:575
    while (true)
      {
        /* tailcall optimized into a loop */
        {
          boolean succeeded = false;
          list.List_1 STATE_VARIABLE_Es_4 = null;

          if ((HeadVar__2_2.data_tag == 0))
//  xml.m:581
            STATE_VARIABLE_Es_4 = STATE_VARIABLE_Es_0_3;
//  xml.m:575
          else
            {
              int L_6 = 0;
              java.lang.String N_7 = null;
              list.List_1 Stack_10 = ((list.List_1.F_cons_2) HeadVar__2_2).F2;
              java.lang.String LowN_12 = null;
              pair.Pair_2 V_15_15 = ((pair.Pair_2) ((list.List_1.F_cons_2) HeadVar__2_2).F1);
              xml.Stack_item_0 V_16_16 = null;
              list.List_1 STATE_VARIABLE_Es_19_19 = null;
              list.List_1 V_8_8 = null;
              list.List_1 V_9_9 = null;
//  xml.m:662
              int lo_0 = 0;
              int hi_1 = 0;
              int mid_2 = 0;
              int result_3 = 0;
              int stop_loop_4 = 0;

//  xml.m:575
              L_6 = ((java.lang.Integer) (((pair.Pair_2) V_15_15).F1)).intValue();
              V_16_16 = ((xml.Stack_item_0) ((pair.Pair_2) V_15_15).F2);
              N_7 = ((xml.Stack_item_0) V_16_16).F1;
              V_8_8 = ((xml.Stack_item_0) V_16_16).F2;
              V_9_9 = ((xml.Stack_item_0) V_16_16).F3;
//  xml.m:576
              {
                LowN_12 = string.to_lower_2_p_0(N_7);
              }
//  xml.m:662
              /* binary string jump switch */
              succeeded = false;
              lo_0 = 0;
              hi_1 = 14;
              stop_loop_4 = 0;
              do
                {
                  mid_2 = ((lo_0 + hi_1) / 2);
                  result_3 = (LowN_12.compareTo(((xml.Vector_common_type_19_0) (MR_vector_common_19[0 + mid_2])).vct_19_f_0)) ;
                  if ((result_3 == 0))
                    {
                      switch (((xml.Vector_common_type_19_0) (MR_vector_common_19[0 + mid_2])).vct_19_f_1) {
                        case 0:
                          {
                            /* case "body" */
                            succeeded = true;
                          }
                          break;
                        case 1:
//  xml.m:663
                          {
                            /* case "colgroup" */
                            succeeded = true;
                          }
//  xml.m:662
                          break;
                        case 2:
//  xml.m:664
                          {
                            /* case "dd" */
                            succeeded = true;
                          }
//  xml.m:662
                          break;
                        case 3:
//  xml.m:665
                          {
                            /* case "dt" */
                            succeeded = true;
                          }
//  xml.m:662
                          break;
                        case 4:
//  xml.m:666
                          {
                            /* case "head" */
                            succeeded = true;
                          }
//  xml.m:662
                          break;
                        case 5:
//  xml.m:667
                          {
                            /* case "html" */
                            succeeded = true;
                          }
//  xml.m:662
                          break;
                        case 6:
//  xml.m:668
                          {
                            /* case "li" */
                            succeeded = true;
                          }
//  xml.m:662
                          break;
                        case 7:
//  xml.m:669
                          {
                            /* case "option" */
                            succeeded = true;
                          }
//  xml.m:662
                          break;
                        case 8:
//  xml.m:670
                          {
                            /* case "p" */
                            succeeded = true;
                          }
//  xml.m:662
                          break;
                        case 9:
//  xml.m:671
                          {
                            /* case "tbody" */
                            succeeded = true;
                          }
//  xml.m:662
                          break;
                        case 10:
//  xml.m:672
                          {
                            /* case "td" */
                            succeeded = true;
                          }
//  xml.m:662
                          break;
                        case 11:
//  xml.m:673
                          {
                            /* case "tfoot" */
                            succeeded = true;
                          }
//  xml.m:662
                          break;
                        case 12:
//  xml.m:674
                          {
                            /* case "th" */
                            succeeded = true;
                          }
//  xml.m:662
                          break;
                        case 13:
//  xml.m:675
                          {
                            /* case "thead" */
                            succeeded = true;
                          }
//  xml.m:662
                          break;
                        case 14:
//  xml.m:676
                          {
                            /* case "tr" */
                            succeeded = true;
                          }
//  xml.m:662
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
//  xml.m:579
              if (succeeded)
//  xml.m:577
                STATE_VARIABLE_Es_19_19 = STATE_VARIABLE_Es_0_3;
//  xml.m:579
              else
                {
                  jmercury.runtime.TypeInfo_Struct TypeCtorInfo_26_26 = null;
                  errors.Err_loc_0 V_17_17 = null;
                  xml.Error_0 V_18_18 = null;
                  java.lang.String V_20_20 = null;

                  {
                    V_17_17 = new errors.Err_loc_0.File_2(File_1, L_6);
                  }
                  V_20_20 = "start tag";
                  {
                    V_18_18 = new xml.Error_0.Dangling_name_2(V_20_20, N_7);
                  }
                  TypeCtorInfo_26_26 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.xml__type_ctor_info_error_0);
                  {
                    STATE_VARIABLE_Es_19_19 = errors.add_error_4_p_0(TypeCtorInfo_26_26, V_17_17, ((java.lang.Object) (V_18_18)), STATE_VARIABLE_Es_0_3);
                  }
                }
//  xml.m:580
              /* direct tailcall eliminated */
              {
                list.List_1 HeadVar__2__tmp_copy_2 = Stack_10;
                list.List_1 STATE_VARIABLE_Es_0__tmp_copy_3 = STATE_VARIABLE_Es_19_19;

                STATE_VARIABLE_Es_0_3 = STATE_VARIABLE_Es_0__tmp_copy_3;
                HeadVar__2_2 = HeadVar__2__tmp_copy_2;
              }
              continue;
//  xml.m:575
            }
          return STATE_VARIABLE_Es_4;
        }
      }
//  xml.m:573
  }
//  xml.m:564
  private static java.lang.Object [] html_stream_to_tree_7_p_0(
    java.lang.String File_1,
    list.List_1 HeadVar__2_2,
    list.List_1 T0_3,
    list.List_1 Stack_4,
    list.List_1 STATE_VARIABLE_Es_0_5)
  {
//  xml.m:566
    {
      boolean succeeded = false;
      list.List_1 STATE_VARIABLE_Es_6 = null;
      list.List_1 T_7 = null;

      if ((HeadVar__2_2.data_tag == 0))
//  xml.m:568
        {
          jmercury.runtime.TypeInfo_Struct TypeInfo_26_26 = null;

//  xml.m:569
          {
            STATE_VARIABLE_Es_6 = xml.check_stack_4_p_0(File_1, Stack_4, STATE_VARIABLE_Es_0_5);
          }
          TypeInfo_26_26 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[3]);
//  xml.m:570
          {
            T_7 = list.reverse_2_p_0(TypeInfo_26_26, T0_3);
          }
//  xml.m:568
        }
//  xml.m:566
      else
        {
          pair.Pair_2 Item_9 = ((pair.Pair_2) ((list.List_1.F_cons_2) HeadVar__2_2).F1);
          list.List_1 S_10 = ((list.List_1.F_cons_2) HeadVar__2_2).F2;

//  xml.m:567
          {
            java.lang.Object [] result = xml.html_stream_to_tree_8_p_0(File_1, Item_9, S_10, T0_3, Stack_4, STATE_VARIABLE_Es_0_5);
            STATE_VARIABLE_Es_6 = (list.List_1) result[0];
            T_7 = (list.List_1) result[1];
          }
//  xml.m:566
        }
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_Es_6)),
        ((java.lang.Object) (T_7))
      };
    }
//  xml.m:564
  }
//  xml.m:538
  private static java.lang.Object [] stream_to_tree_8_p_0(
    java.lang.String File_1,
    pair.Pair_2 HeadVar__2_2,
    list.List_1 S_3,
    list.List_1 T0_4,
    list.List_1 HeadVar__5_5,
    list.List_1 STATE_VARIABLE_Es_0_6)
  {
//  xml.m:540
    {
      boolean succeeded = false;
      list.List_1 STATE_VARIABLE_Es_7 = null;
      list.List_1 T_8 = null;
      xml.Stream_obj_0 V_107_107 = ((xml.Stream_obj_0) ((pair.Pair_2) HeadVar__2_2).F2);
      int V_108_108 = ((java.lang.Integer) (((pair.Pair_2) HeadVar__2_2).F1)).intValue();

      switch (V_107_107.data_tag) {
        case 0:
//  xml.m:554
          {
            java.lang.String X_76 = ((xml.Stream_obj_0.Text_1) V_107_107).F1;
            list.List_1 V_85_85 = null;
            pair.Pair_2 V_87_87 = null;
            xml.Tree_obj_0 V_88_88 = null;

//  xml.m:555
            {
              V_88_88 = new xml.Tree_obj_0.Text_1(X_76);
            }
            {
              V_87_87 = new pair.Pair_2(java.lang.Integer.valueOf(V_108_108), ((java.lang.Object) (V_88_88)));
            }
            {
              V_85_85 = new list.List_1.F_cons_2(((java.lang.Object) (V_87_87)), T0_4);
            }
            {
              java.lang.Object [] result = xml.stream_to_tree_7_p_0(File_1, S_3, V_85_85, HeadVar__5_5, STATE_VARIABLE_Es_0_6);
              STATE_VARIABLE_Es_7 = (list.List_1) result[0];
              T_8 = (list.List_1) result[1];
            }
//  xml.m:554
          }
//  xml.m:540
          break;
        case 1:
//  xml.m:556
          {
            xml.Spec_0 Spec_91 = ((xml.Stream_obj_0.Spec_1) V_107_107).F1;
            list.List_1 V_100_100 = null;
            pair.Pair_2 V_102_102 = null;
            xml.Tree_obj_0 V_103_103 = null;

//  xml.m:557
            {
              V_103_103 = new xml.Tree_obj_0.Spec_1(Spec_91);
            }
            {
              V_102_102 = new pair.Pair_2(java.lang.Integer.valueOf(V_108_108), ((java.lang.Object) (V_103_103)));
            }
            {
              V_100_100 = new list.List_1.F_cons_2(((java.lang.Object) (V_102_102)), T0_4);
            }
            {
              java.lang.Object [] result = xml.stream_to_tree_7_p_0(File_1, S_3, V_100_100, HeadVar__5_5, STATE_VARIABLE_Es_0_6);
              STATE_VARIABLE_Es_7 = (list.List_1) result[0];
              T_8 = (list.List_1) result[1];
            }
//  xml.m:556
          }
//  xml.m:540
          break;
        case 2:
//  xml.m:552
          {
            java.lang.String Nm_59 = ((xml.Stream_obj_0.Empty_tag_1) V_107_107).F1;
            list.List_1 V_68_68 = null;
            pair.Pair_2 V_70_70 = null;
            xml.Tree_obj_0 V_71_71 = null;
            list.List_1 V_72_72 = (list.List_1) xml.MR_scalar_common_2[0];
            list.List_1 V_73_73 = (list.List_1) xml.MR_scalar_common_2[0];

//  xml.m:553
            {
              V_71_71 = new xml.Tree_obj_0.Element_3(Nm_59, V_72_72, V_73_73);
            }
            {
              V_70_70 = new pair.Pair_2(java.lang.Integer.valueOf(V_108_108), ((java.lang.Object) (V_71_71)));
            }
            {
              V_68_68 = new list.List_1.F_cons_2(((java.lang.Object) (V_70_70)), T0_4);
            }
            {
              java.lang.Object [] result = xml.stream_to_tree_7_p_0(File_1, S_3, V_68_68, HeadVar__5_5, STATE_VARIABLE_Es_0_6);
              STATE_VARIABLE_Es_7 = (list.List_1) result[0];
              T_8 = (list.List_1) result[1];
            }
//  xml.m:552
          }
//  xml.m:540
          break;
        case 3:
          {
            java.lang.String Nm_11 = ((xml.Stream_obj_0.Start_tag_2) V_107_107).F1;
            list.List_1 As_12 = ((xml.Stream_obj_0.Start_tag_2) V_107_107).F2;
            list.List_1 V_21_21 = (list.List_1) xml.MR_scalar_common_2[0];
            list.List_1 V_22_22 = null;
            pair.Pair_2 V_24_24 = null;
            xml.Stack_item_0 V_25_25 = null;

//  xml.m:541
            {
              V_25_25 = new xml.Stack_item_0(Nm_11, As_12, T0_4);
            }
            {
              V_24_24 = new pair.Pair_2(java.lang.Integer.valueOf(V_108_108), ((java.lang.Object) (V_25_25)));
            }
            {
              V_22_22 = new list.List_1.F_cons_2(((java.lang.Object) (V_24_24)), HeadVar__5_5);
            }
            {
              java.lang.Object [] result = xml.stream_to_tree_7_p_0(File_1, S_3, V_21_21, V_22_22, STATE_VARIABLE_Es_0_6);
              STATE_VARIABLE_Es_7 = (list.List_1) result[0];
              T_8 = (list.List_1) result[1];
            }
//  xml.m:540
          }
          break;
        case 4:
//  xml.m:542
          {
            java.lang.String Nm2_28 = ((xml.Stream_obj_0.End_tag_1) V_107_107).F1;
            list.List_1 Stack_40 = null;
            list.List_1 T2_42 = null;
            list.List_1 STATE_VARIABLE_Es_49_49 = null;
//  xml.m:549
            xml.Stack_item_0 First_35 = null;
            list.List_1 Rest_36 = null;
//  xml.m:543
            pair.Pair_2 V_46_46 = null;
            int V_34_34 = 0;

            succeeded = (HeadVar__5_5.data_tag == 1);
            if (succeeded)
              {
                V_46_46 = ((pair.Pair_2) ((list.List_1.F_cons_2) HeadVar__5_5).F1);
                Rest_36 = ((list.List_1.F_cons_2) HeadVar__5_5).F2;
                V_34_34 = ((java.lang.Integer) (((pair.Pair_2) V_46_46).F1)).intValue();
                First_35 = ((xml.Stack_item_0) ((pair.Pair_2) V_46_46).F2);
                succeeded = true;
              }
//  xml.m:549
            if (succeeded)
//  xml.m:544
              {
                jmercury.runtime.TypeInfo_Struct TypeInfo_105_105 = null;
                java.lang.String Nm1_37 = ((xml.Stack_item_0) First_35).F1;
                list.List_1 As_38 = ((xml.Stack_item_0) First_35).F2;
                list.List_1 T1_39 = ((xml.Stack_item_0) First_35).F3;
                list.List_1 RevT0_41 = null;
                pair.Pair_2 V_50_50 = null;
                xml.Tree_obj_0 V_51_51 = null;

                Stack_40 = Rest_36;
//  xml.m:545
                succeeded = Nm1_37.equals(Nm2_28);
                succeeded = !(succeeded);
//  xml.m:547
                if (succeeded)
//  xml.m:546
                  {
                    jmercury.runtime.TypeInfo_Struct TypeCtorInfo_104_104 = null;
                    errors.Err_loc_0 V_47_47 = null;
                    xml.Error_0 V_48_48 = null;

                    {
                      V_47_47 = new errors.Err_loc_0.File_2(File_1, V_108_108);
                    }
                    {
                      V_48_48 = new xml.Error_0.Unbalanced_tags_2(Nm1_37, Nm2_28);
                    }
                    TypeCtorInfo_104_104 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.xml__type_ctor_info_error_0);
                    {
                      STATE_VARIABLE_Es_49_49 = errors.add_error_4_p_0(TypeCtorInfo_104_104, V_47_47, ((java.lang.Object) (V_48_48)), STATE_VARIABLE_Es_0_6);
                    }
                  }
//  xml.m:547
                else
//  xml.m:546
                  STATE_VARIABLE_Es_49_49 = STATE_VARIABLE_Es_0_6;
                TypeInfo_105_105 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[3]);
//  xml.m:548
                {
                  RevT0_41 = list.reverse_2_p_0(TypeInfo_105_105, T0_4);
                }
                {
                  V_51_51 = new xml.Tree_obj_0.Element_3(Nm2_28, As_38, RevT0_41);
                }
                {
                  V_50_50 = new pair.Pair_2(java.lang.Integer.valueOf(V_108_108), ((java.lang.Object) (V_51_51)));
                }
                {
                  T2_42 = new list.List_1.F_cons_2(((java.lang.Object) (V_50_50)), T1_39);
                }
//  xml.m:544
              }
//  xml.m:549
            else
              {
                jmercury.runtime.TypeInfo_Struct TypeCtorInfo_106_106 = null;
                errors.Err_loc_0 V_52_52 = null;
                xml.Error_0 V_53_53 = null;
                java.lang.String V_55_55 = null;

                T2_42 = T0_4;
                Stack_40 = (list.List_1) xml.MR_scalar_common_2[0];
//  xml.m:550
                {
                  V_52_52 = new errors.Err_loc_0.File_2(File_1, V_108_108);
                }
                V_55_55 = "end tag";
                {
                  V_53_53 = new xml.Error_0.Unexpected_name_2(V_55_55, Nm2_28);
                }
                TypeCtorInfo_106_106 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.xml__type_ctor_info_error_0);
                {
                  STATE_VARIABLE_Es_49_49 = errors.add_error_4_p_0(TypeCtorInfo_106_106, V_52_52, ((java.lang.Object) (V_53_53)), STATE_VARIABLE_Es_0_6);
                }
//  xml.m:549
              }
//  xml.m:551
            {
              java.lang.Object [] result = xml.stream_to_tree_7_p_0(File_1, S_3, T2_42, Stack_40, STATE_VARIABLE_Es_49_49);
              STATE_VARIABLE_Es_7 = (list.List_1) result[0];
              T_8 = (list.List_1) result[1];
            }
//  xml.m:542
          }
//  xml.m:540
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_Es_7)),
        ((java.lang.Object) (T_8))
      };
    }
//  xml.m:538
  }
//  xml.m:526
  private static java.lang.Object [] stream_to_tree_7_p_0(
    java.lang.String File_1,
    list.List_1 HeadVar__2_2,
    list.List_1 T0_3,
    list.List_1 Stack_4,
    list.List_1 STATE_VARIABLE_Es_0_5)
  {
//  xml.m:528
    {
      boolean succeeded = false;
      list.List_1 STATE_VARIABLE_Es_6 = null;
      list.List_1 T_7 = null;

      if ((HeadVar__2_2.data_tag == 0))
//  xml.m:530
        {
          jmercury.runtime.TypeInfo_Struct TypeInfo_37_37 = null;
//  xml.m:533
          int L_23 = 0;
          java.lang.String S_24 = null;
//  xml.m:531
          pair.Pair_2 V_30_30 = null;
          xml.Stack_item_0 V_31_31 = null;
          list.List_1 V_27_27 = null;
          list.List_1 V_25_25 = null;
          list.List_1 V_26_26 = null;

          succeeded = (Stack_4.data_tag == 1);
          if (succeeded)
            {
              V_30_30 = ((pair.Pair_2) ((list.List_1.F_cons_2) Stack_4).F1);
              V_27_27 = ((list.List_1.F_cons_2) Stack_4).F2;
              L_23 = ((java.lang.Integer) (((pair.Pair_2) V_30_30).F1)).intValue();
              V_31_31 = ((xml.Stack_item_0) ((pair.Pair_2) V_30_30).F2);
              S_24 = ((xml.Stack_item_0) V_31_31).F1;
              V_25_25 = ((xml.Stack_item_0) V_31_31).F2;
              V_26_26 = ((xml.Stack_item_0) V_31_31).F3;
              succeeded = true;
            }
//  xml.m:533
          if (succeeded)
//  xml.m:532
            {
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_36_36 = null;
              errors.Err_loc_0 V_32_32 = null;
              xml.Error_0 V_33_33 = null;
              java.lang.String V_35_35 = null;

              {
                V_32_32 = new errors.Err_loc_0.File_2(File_1, L_23);
              }
              V_35_35 = "start tag";
              {
                V_33_33 = new xml.Error_0.Dangling_name_2(V_35_35, S_24);
              }
              TypeCtorInfo_36_36 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.xml__type_ctor_info_error_0);
              {
                STATE_VARIABLE_Es_6 = errors.add_error_4_p_0(TypeCtorInfo_36_36, V_32_32, ((java.lang.Object) (V_33_33)), STATE_VARIABLE_Es_0_5);
              }
            }
//  xml.m:533
          else
//  xml.m:532
            STATE_VARIABLE_Es_6 = STATE_VARIABLE_Es_0_5;
          TypeInfo_37_37 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[3]);
//  xml.m:534
          {
            T_7 = list.reverse_2_p_0(TypeInfo_37_37, T0_3);
          }
//  xml.m:530
        }
//  xml.m:528
      else
        {
          pair.Pair_2 Item_9 = ((pair.Pair_2) ((list.List_1.F_cons_2) HeadVar__2_2).F1);
          list.List_1 S_10 = ((list.List_1.F_cons_2) HeadVar__2_2).F2;

//  xml.m:529
          {
            java.lang.Object [] result = xml.stream_to_tree_8_p_0(File_1, Item_9, S_10, T0_3, Stack_4, STATE_VARIABLE_Es_0_5);
            STATE_VARIABLE_Es_6 = (list.List_1) result[0];
            T_7 = (list.List_1) result[1];
          }
//  xml.m:528
        }
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_Es_6)),
        ((java.lang.Object) (T_7))
      };
    }
//  xml.m:526
  }
//  xml.m:514
  private static list.List_1 opws_2_p_0(
    list.List_1 STATE_VARIABLE_Tokens_0_5)
  {
//  xml.m:519
    while (true)
      {
        /* tailcall optimized into a loop */
        {
          boolean succeeded = (STATE_VARIABLE_Tokens_0_5.data_tag == 1);
          list.List_1 STATE_VARIABLE_Tokens_6 = null;
          list.List_1 STATE_VARIABLE_Tokens_7_7 = null;
//  xml.m:517
          int C_4 = '\u0000';
          pair.Pair_2 V_12_12 = null;
//  xml.m:160
          int V_11_11 = 0;

          if (succeeded)
            {
              V_12_12 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_0_5).F1);
              STATE_VARIABLE_Tokens_7_7 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_0_5).F2;
              V_11_11 = ((java.lang.Integer) (((pair.Pair_2) V_12_12).F1)).intValue();
              C_4 = ((java.lang.Integer) (((pair.Pair_2) V_12_12).F2)).intValue();
//  xml.m:517
              {
                succeeded = mr_char.is_whitespace_1_p_0(C_4);
              }
//  xml.m:160
            }
//  xml.m:519
          if (succeeded)
//  xml.m:518
            {
              /* direct tailcall eliminated */
              {
                list.List_1 STATE_VARIABLE_Tokens_0__tmp_copy_5 = STATE_VARIABLE_Tokens_7_7;

                STATE_VARIABLE_Tokens_0_5 = STATE_VARIABLE_Tokens_0__tmp_copy_5;
              }
              continue;
            }
//  xml.m:519
          else
//  xml.m:518
            STATE_VARIABLE_Tokens_6 = STATE_VARIABLE_Tokens_0_5;
//  xml.m:519
          return STATE_VARIABLE_Tokens_6;
        }
      }
//  xml.m:514
  }
//  xml.m:498
  private static java.lang.Object [] skip_to_5_p_0(
    list.List_1 Chars_6,
    list.List_1 Cs0_7,
    list.List_1 STATE_VARIABLE_Tokens_0_11)
  {
//  xml.m:503
    while (true)
      {
        /* tailcall optimized into a loop */
        {
          boolean succeeded = false;
          list.List_1 Cs_8 = null;
          list.List_1 STATE_VARIABLE_Tokens_12 = null;
          list.List_1 STATE_VARIABLE_Tokens_13_13 = null;

//  xml.m:501
          {
            java.lang.Object [] result = xml.tokens_3_p_0(Chars_6, STATE_VARIABLE_Tokens_0_11);
            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
            STATE_VARIABLE_Tokens_13_13 = (list.List_1) result[1];
          }
//  xml.m:503
          if (succeeded)
//  xml.m:502
            {
              STATE_VARIABLE_Tokens_12 = STATE_VARIABLE_Tokens_13_13;
              Cs_8 = Cs0_7;
              succeeded = true;
            }
//  xml.m:503
          else
            {
              int C_10 = '\u0000';
              list.List_1 STATE_VARIABLE_Tokens_14_14 = null;
              list.List_1 V_15_15 = null;
              pair.Pair_2 V_20_20 = null;
//  xml.m:160
              int V_19_19 = 0;

              succeeded = (STATE_VARIABLE_Tokens_0_11.data_tag == 1);
              if (succeeded)
                {
                  V_20_20 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_0_11).F1);
                  STATE_VARIABLE_Tokens_14_14 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_0_11).F2;
                  V_19_19 = ((java.lang.Integer) (((pair.Pair_2) V_20_20).F1)).intValue();
                  C_10 = ((java.lang.Integer) (((pair.Pair_2) V_20_20).F2)).intValue();
//  xml.m:504
                  {
                    V_15_15 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(C_10), Cs0_7);
                  }
                  {
                    /* direct tailcall eliminated */
                    {
                      list.List_1 Cs0__tmp_copy_7 = V_15_15;
                      list.List_1 STATE_VARIABLE_Tokens_0__tmp_copy_11 = STATE_VARIABLE_Tokens_14_14;

                      STATE_VARIABLE_Tokens_0_11 = STATE_VARIABLE_Tokens_0__tmp_copy_11;
                      Cs0_7 = Cs0__tmp_copy_7;
                    }
                    continue;
                  }
//  xml.m:160
                }
//  xml.m:503
            }
return new java.lang.Object[] {
            java.lang.Boolean.valueOf(succeeded),
            ((java.lang.Object) (Cs_8)),
            ((java.lang.Object) (STATE_VARIABLE_Tokens_12))
          };
        }
      }
//  xml.m:498
  }
//  xml.m:480
  private static java.lang.Object [] restofcharlist_4_p_0(
    /* closure */ java.lang.Object[] P_5,
    list.List_1 STATE_VARIABLE_Tokens_0_10)
  {
//  xml.m:486
    {
      boolean succeeded = (STATE_VARIABLE_Tokens_0_10.data_tag == 1);
      list.List_1 Cs_6 = null;
      list.List_1 STATE_VARIABLE_Tokens_11 = null;
      int C_8 = '\u0000';
      list.List_1 STATE_VARIABLE_Tokens_12_12 = null;
//  xml.m:483
      pair.Pair_2 V_17_17 = null;
//  xml.m:160
      int V_16_16 = 0;
//  xml.m:483
      jmercury.runtime.MethodPtr func_0 = null;

//  xml.m:160
      if (succeeded)
        {
          V_17_17 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_0_10).F1);
          STATE_VARIABLE_Tokens_12_12 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_0_10).F2;
          V_16_16 = ((java.lang.Integer) (((pair.Pair_2) V_17_17).F1)).intValue();
          C_8 = ((java.lang.Integer) (((pair.Pair_2) V_17_17).F2)).intValue();
//  xml.m:483
          func_0 = ((jmercury.runtime.MethodPtr) ((java.lang.Object[]) P_5)[1]);
          {
            succeeded = ((java.lang.Boolean) ((jmercury.runtime.MethodPtr2) func_0).call___0_0(((java.lang.Object) (((/* generic_type */ java.lang.Object) P_5))), ((java.lang.Object) (java.lang.Integer.valueOf(C_8))))).booleanValue();
          }
//  xml.m:160
        }
//  xml.m:486
      if (succeeded)
//  xml.m:484
        {
          list.List_1 Cs0_9 = null;

          {
            java.lang.Object [] result = xml.restofcharlist_4_p_0(P_5, STATE_VARIABLE_Tokens_12_12);
            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
            Cs0_9 = (list.List_1) result[1];
            STATE_VARIABLE_Tokens_11 = (list.List_1) result[2];
          }
          if (succeeded)
            {
//  xml.m:485
              {
                Cs_6 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(C_8), Cs0_9);
              }
              succeeded = true;
//  xml.m:484
            }
        }
//  xml.m:486
      else
        {
          Cs_6 = (list.List_1) xml.MR_scalar_common_2[0];
          STATE_VARIABLE_Tokens_11 = STATE_VARIABLE_Tokens_0_10;
          succeeded = true;
        }
return new java.lang.Object[] {
        java.lang.Boolean.valueOf(succeeded),
        ((java.lang.Object) (Cs_6)),
        ((java.lang.Object) (STATE_VARIABLE_Tokens_11))
      };
    }
//  xml.m:480
  }
//  xml.m:465
  private static java.lang.Object [] noquotes_4_p_0(
    int X_5,
    list.List_1 STATE_VARIABLE_Tokens_0_10)
  {
//  xml.m:471
    {
      boolean succeeded = (STATE_VARIABLE_Tokens_0_10.data_tag == 1);
      list.List_1 Cs_6 = null;
      list.List_1 STATE_VARIABLE_Tokens_11 = null;
      int C_8 = '\u0000';
      list.List_1 STATE_VARIABLE_Tokens_12_12 = null;
//  xml.m:468
      pair.Pair_2 V_17_17 = null;
//  xml.m:160
      int V_16_16 = 0;

      if (succeeded)
        {
          V_17_17 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_0_10).F1);
          STATE_VARIABLE_Tokens_12_12 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_0_10).F2;
          V_16_16 = ((java.lang.Integer) (((pair.Pair_2) V_17_17).F1)).intValue();
          C_8 = ((java.lang.Integer) (((pair.Pair_2) V_17_17).F2)).intValue();
//  xml.m:468
          succeeded = (C_8 == X_5);
          succeeded = !(succeeded);
//  xml.m:160
        }
//  xml.m:471
      if (succeeded)
//  xml.m:469
        {
          list.List_1 Cs0_9 = null;

          {
            java.lang.Object [] result = xml.noquotes_4_p_0(X_5, STATE_VARIABLE_Tokens_12_12);
            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
            Cs0_9 = (list.List_1) result[1];
            STATE_VARIABLE_Tokens_11 = (list.List_1) result[2];
          }
          if (succeeded)
            {
//  xml.m:470
              {
                Cs_6 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(C_8), Cs0_9);
              }
              succeeded = true;
//  xml.m:469
            }
        }
//  xml.m:471
      else
        {
          Cs_6 = (list.List_1) xml.MR_scalar_common_2[0];
          STATE_VARIABLE_Tokens_11 = STATE_VARIABLE_Tokens_0_10;
          succeeded = true;
        }
return new java.lang.Object[] {
        java.lang.Boolean.valueOf(succeeded),
        ((java.lang.Object) (Cs_6)),
        ((java.lang.Object) (STATE_VARIABLE_Tokens_11))
      };
    }
//  xml.m:465
  }
//  xml.m:432
  private static java.lang.Object [] restofname_3_p_0(
    list.List_1 STATE_VARIABLE_Tokens_0_8)
  {
//  xml.m:438
    {
      boolean succeeded = (STATE_VARIABLE_Tokens_0_8.data_tag == 1);
      list.List_1 Cs_4 = null;
      list.List_1 STATE_VARIABLE_Tokens_9 = null;
      int C_6 = '\u0000';
      list.List_1 STATE_VARIABLE_Tokens_10_10 = null;
//  xml.m:435
      pair.Pair_2 V_15_15 = null;
//  xml.m:160
      int V_14_14 = 0;

      if (succeeded)
        {
          V_15_15 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_0_8).F1);
          STATE_VARIABLE_Tokens_10_10 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_0_8).F2;
          V_14_14 = ((java.lang.Integer) (((pair.Pair_2) V_15_15).F1)).intValue();
          C_6 = ((java.lang.Integer) (((pair.Pair_2) V_15_15).F2)).intValue();
//  xml.m:441
          switch (C_6) {
            case (37):
              succeeded = true;
              break;
            case (45):
//  xml.m:443
              succeeded = true;
//  xml.m:441
              break;
            case (46):
//  xml.m:442
              succeeded = true;
//  xml.m:441
              break;
            case (58):
//  xml.m:445
              succeeded = true;
//  xml.m:441
              break;
            case (95):
//  xml.m:444
              succeeded = true;
//  xml.m:441
              break;
            default:
              succeeded = false;
          }
          if (!(succeeded))
//  xml.m:448
            {
              succeeded = mr_char.is_alnum_1_p_0(C_6);
            }
//  xml.m:160
        }
//  xml.m:438
      if (succeeded)
//  xml.m:436
        {
          list.List_1 Cs0_7 = null;

          {
            java.lang.Object [] result = xml.restofname_3_p_0(STATE_VARIABLE_Tokens_10_10);
            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
            Cs0_7 = (list.List_1) result[1];
            STATE_VARIABLE_Tokens_9 = (list.List_1) result[2];
          }
          if (succeeded)
            {
//  xml.m:437
              {
                Cs_4 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(C_6), Cs0_7);
              }
              succeeded = true;
//  xml.m:436
            }
        }
//  xml.m:438
      else
        {
          Cs_4 = (list.List_1) xml.MR_scalar_common_2[0];
          STATE_VARIABLE_Tokens_9 = STATE_VARIABLE_Tokens_0_8;
          succeeded = true;
        }
return new java.lang.Object[] {
        java.lang.Boolean.valueOf(succeeded),
        ((java.lang.Object) (Cs_4)),
        ((java.lang.Object) (STATE_VARIABLE_Tokens_9))
      };
    }
//  xml.m:432
  }
//  xml.m:424
  private static java.lang.Object [] name_3_p_0(
    list.List_1 STATE_VARIABLE_Tokens_0_8)
  {
//  xml.m:426
    {
      boolean succeeded = (STATE_VARIABLE_Tokens_0_8.data_tag == 1);
      java.lang.String S_4 = null;
      list.List_1 STATE_VARIABLE_Tokens_9 = null;
      int C_6 = '\u0000';
      list.List_1 Cs_7 = null;
      list.List_1 STATE_VARIABLE_Tokens_10_10 = null;
      list.List_1 V_12_12 = null;
      pair.Pair_2 V_16_16 = null;
//  xml.m:160
      int V_15_15 = 0;

      if (succeeded)
        {
          V_16_16 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_0_8).F1);
          STATE_VARIABLE_Tokens_10_10 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_0_8).F2;
          V_15_15 = ((java.lang.Integer) (((pair.Pair_2) V_16_16).F1)).intValue();
          C_6 = ((java.lang.Integer) (((pair.Pair_2) V_16_16).F2)).intValue();
//  xml.m:427
          {
            succeeded = mr_char.is_alpha_or_underscore_1_p_0(C_6);
          }
//  xml.m:426
          if (succeeded)
            {
//  xml.m:428
              {
                java.lang.Object [] result = xml.restofname_3_p_0(STATE_VARIABLE_Tokens_10_10);
                succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                Cs_7 = (list.List_1) result[1];
                STATE_VARIABLE_Tokens_9 = (list.List_1) result[2];
              }
//  xml.m:426
              if (succeeded)
                {
//  xml.m:429
                  {
                    V_12_12 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(C_6), Cs_7);
                  }
                  {
                    S_4 = string.from_char_list_2_p_0(V_12_12);
                  }
                  succeeded = true;
//  xml.m:426
                }
            }
//  xml.m:160
        }
//  xml.m:426
return new java.lang.Object[] {
        java.lang.Boolean.valueOf(succeeded),
        ((java.lang.Object) (S_4)),
        ((java.lang.Object) (STATE_VARIABLE_Tokens_9))
      };
    }
//  xml.m:424
  }
//  xml.m:418
  private static java.lang.Object [] entref_3_p_0(
    list.List_1 STATE_VARIABLE_Tokens_0_7)
  {
//  xml.m:420
    {
      boolean succeeded = false;
      xml.Ref_0 Ref_4 = null;
      list.List_1 STATE_VARIABLE_Tokens_8 = null;
      java.lang.String Str_6 = null;
      list.List_1 STATE_VARIABLE_Tokens_9_9 = null;
      int V_10_10 = '\u0000';
      pair.Pair_2 V_15_15 = null;
      int V_16_16 = '\u0000';
//  xml.m:160
      int V_14_14 = 0;

//  xml.m:421
      {
        java.lang.Object [] result = xml.name_3_p_0(STATE_VARIABLE_Tokens_0_7);
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        Str_6 = (java.lang.String) result[1];
        STATE_VARIABLE_Tokens_9_9 = (list.List_1) result[2];
      }
//  xml.m:420
      if (succeeded)
        {
//  xml.m:421
          V_10_10 = (59);
//  xml.m:160
          succeeded = (STATE_VARIABLE_Tokens_9_9.data_tag == 1);
          if (succeeded)
            {
              V_15_15 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_9_9).F1);
              STATE_VARIABLE_Tokens_8 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_9_9).F2;
              V_14_14 = ((java.lang.Integer) (((pair.Pair_2) V_15_15).F1)).intValue();
              V_16_16 = ((java.lang.Integer) (((pair.Pair_2) V_15_15).F2)).intValue();
              succeeded = (V_10_10 == V_16_16);
//  xml.m:420
              if (succeeded)
                {
//  xml.m:885
                  succeeded = Str_6.equals("amp");
//  xml.m:886
                  if (succeeded)
//  xml.m:885
                    Ref_4 = (xml.Ref_0) xml.MR_scalar_common_12[0];
//  xml.m:886
                  else
//  xml.m:887
                    {
//  xml.m:886
                      succeeded = Str_6.equals("lt");
//  xml.m:887
                      if (succeeded)
//  xml.m:886
                        Ref_4 = (xml.Ref_0) xml.MR_scalar_common_15[0];
//  xml.m:887
                      else
//  xml.m:888
                        {
//  xml.m:887
                          succeeded = Str_6.equals("gt");
//  xml.m:888
                          if (succeeded)
//  xml.m:887
                            Ref_4 = (xml.Ref_0) xml.MR_scalar_common_16[0];
//  xml.m:888
                          else
//  xml.m:889
                            {
//  xml.m:888
                              succeeded = Str_6.equals("apos");
//  xml.m:889
                              if (succeeded)
//  xml.m:888
                                Ref_4 = (xml.Ref_0) xml.MR_scalar_common_17[0];
//  xml.m:889
                              else
//  xml.m:890
                                {
//  xml.m:889
                                  succeeded = Str_6.equals("quot");
//  xml.m:890
                                  if (succeeded)
//  xml.m:889
                                    Ref_4 = (xml.Ref_0) xml.MR_scalar_common_18[0];
//  xml.m:890
                                  else
                                    {
                                      Ref_4 = new xml.Ref_0.Def_1(Str_6);
                                    }
                                }
//  xml.m:889
                            }
//  xml.m:888
                        }
//  xml.m:887
                    }
//  xml.m:886
                  succeeded = true;
//  xml.m:420
                }
//  xml.m:160
            }
//  xml.m:420
        }
return new java.lang.Object[] {
        java.lang.Boolean.valueOf(succeeded),
        ((java.lang.Object) (Ref_4)),
        ((java.lang.Object) (STATE_VARIABLE_Tokens_8))
      };
    }
//  xml.m:418
  }
//  xml.m:411
  private static boolean parse_reference_4_p_0_2(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1)
  {
    {
      boolean succeeded = false;
      /* generic_type */ java.lang.Object closure = closure_arg;

      {
        succeeded = mr_char.is_digit_1_p_0(((java.lang.Integer) wrapper_arg_1).intValue());
      }
      return succeeded;
    }
  }
//  xml.m:406
  private static boolean parse_reference_4_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1)
  {
    {
      boolean succeeded = false;
      /* generic_type */ java.lang.Object closure = closure_arg;

      {
        succeeded = mr_char.is_hex_digit_1_p_0(((java.lang.Integer) wrapper_arg_1).intValue());
      }
      return succeeded;
    }
  }
//  xml.m:390
  private static java.lang.Object [] parse_reference_4_p_0(
    int N_5,
    list.List_1 STATE_VARIABLE_Tokens_0_9)
  {
//  xml.m:395
    {
      boolean succeeded = (STATE_VARIABLE_Tokens_0_9.data_tag == 1);
      xml.Parse_1 Result_6 = null;
      list.List_1 STATE_VARIABLE_Tokens_10 = null;
      xml.Ref_0 Ref_8 = null;
      list.List_1 STATE_VARIABLE_Tokens_11_11 = null;
//  xml.m:403
      int V_32_32 = (35);
      list.List_1 STATE_VARIABLE_Tokens_12_33 = null;
      pair.Pair_2 V_54_54 = null;
      int V_55_55 = '\u0000';
//  xml.m:160
      int V_53_53 = 0;
//  xml.m:411
      list.List_1 STATE_VARIABLE_Tokens_14_35 = null;
//  xml.m:405
      int V_34_34 = '\u0000';
      pair.Pair_2 V_59_59 = null;
      int V_60_60 = '\u0000';
//  xml.m:160
      int V_58_58 = 0;

      if (succeeded)
        {
          V_54_54 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_0_9).F1);
          STATE_VARIABLE_Tokens_12_33 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_0_9).F2;
          V_53_53 = ((java.lang.Integer) (((pair.Pair_2) V_54_54).F1)).intValue();
          V_55_55 = ((java.lang.Integer) (((pair.Pair_2) V_54_54).F2)).intValue();
          succeeded = (V_32_32 == V_55_55);
//  xml.m:403
          if (succeeded)
            {
//  xml.m:405
              V_34_34 = (120);
//  xml.m:160
              succeeded = (STATE_VARIABLE_Tokens_12_33.data_tag == 1);
              if (succeeded)
                {
                  V_59_59 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_12_33).F1);
                  STATE_VARIABLE_Tokens_14_35 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_12_33).F2;
                  V_58_58 = ((java.lang.Integer) (((pair.Pair_2) V_59_59).F1)).intValue();
                  V_60_60 = ((java.lang.Integer) (((pair.Pair_2) V_59_59).F2)).intValue();
                  succeeded = (V_34_34 == V_60_60);
                }
//  xml.m:411
              if (succeeded)
//  xml.m:406
                {
                  list.List_1 Cs_29 = null;
                  java.lang.String S_30 = null;
                  int Number_31 = 0;
                  /* closure */ java.lang.Object[] V_36_36 = (/* closure */ java.lang.Object[]) xml.MR_scalar_common_5[3];
                  list.List_1 STATE_VARIABLE_Tokens_16_37 = null;
                  int V_38_38 = 0;
                  int V_39_39 = '\u0000';
                  int C_64 = '\u0000';
                  list.List_1 Cs_65 = null;
                  list.List_1 STATE_VARIABLE_Tokens_11_67 = null;
                  pair.Pair_2 V_72_72 = null;
                  pair.Pair_2 V_76_76 = null;
                  int V_77_77 = '\u0000';
//  xml.m:160
                  int V_71_71 = 0;
//  xml.m:477
                  jmercury.runtime.MethodPtr func_0 = null;
//  xml.m:160
                  int V_75_75 = 0;

                  succeeded = (STATE_VARIABLE_Tokens_14_35.data_tag == 1);
                  if (succeeded)
                    {
                      V_72_72 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_14_35).F1);
                      STATE_VARIABLE_Tokens_11_67 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_14_35).F2;
                      V_71_71 = ((java.lang.Integer) (((pair.Pair_2) V_72_72).F1)).intValue();
                      C_64 = ((java.lang.Integer) (((pair.Pair_2) V_72_72).F2)).intValue();
//  xml.m:477
                      func_0 = ((jmercury.runtime.MethodPtr) ((java.lang.Object[]) V_36_36)[1]);
                      {
                        succeeded = ((java.lang.Boolean) ((jmercury.runtime.MethodPtr2) func_0).call___0_0(((java.lang.Object) (((/* generic_type */ java.lang.Object) V_36_36))), ((java.lang.Object) (java.lang.Integer.valueOf(C_64))))).booleanValue();
                      }
//  xml.m:406
                      if (succeeded)
                        {
//  xml.m:477
                          {
                            java.lang.Object [] result = xml.restofcharlist_4_p_0(V_36_36, STATE_VARIABLE_Tokens_11_67);
                            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                            Cs_65 = (list.List_1) result[1];
                            STATE_VARIABLE_Tokens_16_37 = (list.List_1) result[2];
                          }
//  xml.m:406
                          if (succeeded)
                            {
//  xml.m:476
                              {
                                Cs_29 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(C_64), Cs_65);
                              }
//  xml.m:407
                              {
                                S_30 = string.from_char_list_2_p_0(Cs_29);
                              }
//  xml.m:408
                              V_38_38 = 16;
                              {
                                java.lang.Object [] result = string.base_string_to_int_3_p_0(V_38_38, S_30);
                                succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                                Number_31 = ((java.lang.Integer) result[1]).intValue();
                              }
//  xml.m:406
                              if (succeeded)
                                {
//  xml.m:409
                                  V_39_39 = (59);
//  xml.m:160
                                  succeeded = (STATE_VARIABLE_Tokens_16_37.data_tag == 1);
                                  if (succeeded)
                                    {
                                      V_76_76 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_16_37).F1);
                                      STATE_VARIABLE_Tokens_11_11 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_16_37).F2;
                                      V_75_75 = ((java.lang.Integer) (((pair.Pair_2) V_76_76).F1)).intValue();
                                      V_77_77 = ((java.lang.Integer) (((pair.Pair_2) V_76_76).F2)).intValue();
                                      succeeded = (V_39_39 == V_77_77);
//  xml.m:406
                                      if (succeeded)
                                        {
//  xml.m:410
                                          {
                                            Ref_8 = new xml.Ref_0.Hex_1(Number_31);
                                          }
                                          succeeded = true;
//  xml.m:406
                                        }
//  xml.m:160
                                    }
//  xml.m:406
                                }
                            }
                        }
//  xml.m:160
                    }
//  xml.m:406
                }
//  xml.m:411
              else
                {
                  /* closure */ java.lang.Object[] V_41_41 = (/* closure */ java.lang.Object[]) xml.MR_scalar_common_5[4];
                  list.List_1 STATE_VARIABLE_Tokens_21_42 = null;
                  int V_43_43 = 0;
                  int V_44_44 = '\u0000';
                  list.List_1 Cs_46 = null;
                  java.lang.String S_47 = null;
                  int Number_48 = 0;
                  int C_81 = '\u0000';
                  list.List_1 Cs_82 = null;
                  list.List_1 STATE_VARIABLE_Tokens_11_84 = null;
                  pair.Pair_2 V_89_89 = null;
                  pair.Pair_2 V_93_93 = null;
                  int V_94_94 = '\u0000';
//  xml.m:160
                  int V_88_88 = 0;
//  xml.m:477
                  jmercury.runtime.MethodPtr func_1 = null;
//  xml.m:160
                  int V_92_92 = 0;

                  succeeded = (STATE_VARIABLE_Tokens_12_33.data_tag == 1);
                  if (succeeded)
                    {
                      V_89_89 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_12_33).F1);
                      STATE_VARIABLE_Tokens_11_84 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_12_33).F2;
                      V_88_88 = ((java.lang.Integer) (((pair.Pair_2) V_89_89).F1)).intValue();
                      C_81 = ((java.lang.Integer) (((pair.Pair_2) V_89_89).F2)).intValue();
//  xml.m:477
                      func_1 = ((jmercury.runtime.MethodPtr) ((java.lang.Object[]) V_41_41)[1]);
                      {
                        succeeded = ((java.lang.Boolean) ((jmercury.runtime.MethodPtr2) func_1).call___0_0(((java.lang.Object) (((/* generic_type */ java.lang.Object) V_41_41))), ((java.lang.Object) (java.lang.Integer.valueOf(C_81))))).booleanValue();
                      }
//  xml.m:411
                      if (succeeded)
                        {
//  xml.m:477
                          {
                            java.lang.Object [] result = xml.restofcharlist_4_p_0(V_41_41, STATE_VARIABLE_Tokens_11_84);
                            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                            Cs_82 = (list.List_1) result[1];
                            STATE_VARIABLE_Tokens_21_42 = (list.List_1) result[2];
                          }
//  xml.m:411
                          if (succeeded)
                            {
//  xml.m:476
                              {
                                Cs_46 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(C_81), Cs_82);
                              }
//  xml.m:412
                              {
                                S_47 = string.from_char_list_2_p_0(Cs_46);
                              }
//  xml.m:413
                              V_43_43 = 10;
                              {
                                java.lang.Object [] result = string.base_string_to_int_3_p_0(V_43_43, S_47);
                                succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                                Number_48 = ((java.lang.Integer) result[1]).intValue();
                              }
//  xml.m:411
                              if (succeeded)
                                {
//  xml.m:414
                                  V_44_44 = (59);
//  xml.m:160
                                  succeeded = (STATE_VARIABLE_Tokens_21_42.data_tag == 1);
                                  if (succeeded)
                                    {
                                      V_93_93 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_21_42).F1);
                                      STATE_VARIABLE_Tokens_11_11 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_21_42).F2;
                                      V_92_92 = ((java.lang.Integer) (((pair.Pair_2) V_93_93).F1)).intValue();
                                      V_94_94 = ((java.lang.Integer) (((pair.Pair_2) V_93_93).F2)).intValue();
                                      succeeded = (V_44_44 == V_94_94);
//  xml.m:411
                                      if (succeeded)
                                        {
//  xml.m:415
                                          {
                                            Ref_8 = new xml.Ref_0.Dec_1(Number_48);
                                          }
                                          succeeded = true;
//  xml.m:411
                                        }
//  xml.m:160
                                    }
//  xml.m:411
                                }
                            }
                        }
//  xml.m:160
                    }
//  xml.m:411
                }
//  xml.m:403
            }
//  xml.m:160
        }
//  xml.m:395
      if (succeeded)
//  xml.m:394
        {
          pair.Pair_2 V_12_12 = null;
          xml.Stream_obj_0 V_13_13 = null;
          xml.Spec_0 V_14_14 = null;

          STATE_VARIABLE_Tokens_10 = STATE_VARIABLE_Tokens_11_11;
          {
            V_14_14 = new xml.Spec_0.Ref_1(Ref_8);
          }
          {
            V_13_13 = new xml.Stream_obj_0.Spec_1(V_14_14);
          }
          {
            V_12_12 = new pair.Pair_2(java.lang.Integer.valueOf(N_5), ((java.lang.Object) (V_13_13)));
          }
          {
            Result_6 = new xml.Parse_1.Ok_1(((java.lang.Object) (V_12_12)));
          }
        }
//  xml.m:395
      else
//  xml.m:397
        {
          list.List_1 STATE_VARIABLE_Tokens_15_15 = null;
          xml.Ref_0 Ref_24 = null;

//  xml.m:395
          {
            java.lang.Object [] result = xml.entref_3_p_0(STATE_VARIABLE_Tokens_0_9);
            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
            Ref_24 = (xml.Ref_0) result[1];
            STATE_VARIABLE_Tokens_15_15 = (list.List_1) result[2];
          }
//  xml.m:397
          if (succeeded)
//  xml.m:396
            {
              pair.Pair_2 V_16_16 = null;
              xml.Stream_obj_0 V_17_17 = null;
              xml.Spec_0 V_18_18 = null;

              STATE_VARIABLE_Tokens_10 = STATE_VARIABLE_Tokens_15_15;
              {
                V_18_18 = new xml.Spec_0.Ref_1(Ref_24);
              }
              {
                V_17_17 = new xml.Stream_obj_0.Spec_1(V_18_18);
              }
              {
                V_16_16 = new pair.Pair_2(java.lang.Integer.valueOf(N_5), ((java.lang.Object) (V_17_17)));
              }
              {
                Result_6 = new xml.Parse_1.Ok_1(((java.lang.Object) (V_16_16)));
              }
            }
//  xml.m:397
          else
//  xml.m:398
            {
              pair.Pair_2 V_19_19 = null;
              xml.Stream_obj_0 V_20_20 = (xml.Stream_obj_0) xml.MR_scalar_common_14[0];
              xml.Spec_0 V_21_21 = (xml.Spec_0) xml.MR_scalar_common_13[0];
              xml.Ref_0 V_22_22 = (xml.Ref_0) xml.MR_scalar_common_12[0];

              {
                V_19_19 = new pair.Pair_2(java.lang.Integer.valueOf(N_5), ((java.lang.Object) (V_20_20)));
              }
              {
                Result_6 = new xml.Parse_1.Ok_1(((java.lang.Object) (V_19_19)));
              }
              STATE_VARIABLE_Tokens_10 = STATE_VARIABLE_Tokens_0_9;
            }
//  xml.m:397
        }
//  xml.m:395
return new java.lang.Object[] {
        ((java.lang.Object) (Result_6)),
        ((java.lang.Object) (STATE_VARIABLE_Tokens_10))
      };
    }
//  xml.m:390
  }
//  xml.m:380
  private static java.lang.Object [] parse_doctype_4_p_0(
    int N_5,
    list.List_1 STATE_VARIABLE_Tokens_0_9)
  {
//  xml.m:387
    {
      boolean succeeded = false;
      xml.Parse_1 Result_6 = null;
      list.List_1 STATE_VARIABLE_Tokens_10 = null;
      list.List_1 STATE_VARIABLE_Tokens_12_12 = null;
//  xml.m:383
      java.lang.String V_11_11 = "OCTYPE";
      list.List_1 Cs_27 = null;

//  xml.m:184
      {
        Cs_27 = string.to_char_list_2_p_0(V_11_11);
      }
//  xml.m:185
      {
        java.lang.Object [] result = xml.tokens_3_p_0(Cs_27, STATE_VARIABLE_Tokens_0_9);
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        STATE_VARIABLE_Tokens_12_12 = (list.List_1) result[1];
      }
//  xml.m:387
      if (succeeded)
//  xml.m:386
        {
          java.lang.String S_8 = null;
          list.List_1 STATE_VARIABLE_Tokens_14_14 = null;
//  xml.m:384
          java.lang.String V_13_13 = ">";
          list.List_1 Chars_34 = null;
          list.List_1 RevCs_35 = null;
          list.List_1 V_36_36 = null;

//  xml.m:492
          {
            Chars_34 = string.to_char_list_2_p_0(V_13_13);
          }
//  xml.m:493
          V_36_36 = (list.List_1) xml.MR_scalar_common_2[0];
          {
            java.lang.Object [] result = xml.skip_to_5_p_0(Chars_34, V_36_36, STATE_VARIABLE_Tokens_12_12);
            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
            RevCs_35 = (list.List_1) result[1];
            STATE_VARIABLE_Tokens_14_14 = (list.List_1) result[2];
          }
//  xml.m:384
          if (succeeded)
            {
//  xml.m:494
              {
                S_8 = string.from_rev_char_list_2_p_0(RevCs_35);
              }
              succeeded = true;
//  xml.m:384
            }
//  xml.m:386
          if (succeeded)
//  xml.m:385
            {
              pair.Pair_2 V_15_15 = null;
              xml.Stream_obj_0 V_16_16 = null;
              xml.Spec_0 V_17_17 = null;

              STATE_VARIABLE_Tokens_10 = STATE_VARIABLE_Tokens_14_14;
              {
                V_17_17 = new xml.Spec_0.Doctype_1(S_8);
              }
              {
                V_16_16 = new xml.Stream_obj_0.Spec_1(V_17_17);
              }
              {
                V_15_15 = new pair.Pair_2(java.lang.Integer.valueOf(N_5), ((java.lang.Object) (V_16_16)));
              }
              {
                Result_6 = new xml.Parse_1.Ok_1(((java.lang.Object) (V_15_15)));
              }
            }
//  xml.m:386
          else
            {
              xml.Error_0 V_18_18 = (xml.Error_0) xml.MR_scalar_common_10[2];
              java.lang.String V_19_19 = "doctype block";

              Result_6 = (xml.Parse_1) xml.MR_scalar_common_8[8];
              STATE_VARIABLE_Tokens_10 = STATE_VARIABLE_Tokens_12_12;
            }
        }
//  xml.m:387
      else
        {
          xml.Error_0 V_21_21 = (xml.Error_0) xml.MR_scalar_common_7[5];
          java.lang.String V_22_22 = "\'OCTYPE\'";

          Result_6 = (xml.Parse_1) xml.MR_scalar_common_8[9];
          STATE_VARIABLE_Tokens_10 = STATE_VARIABLE_Tokens_0_9;
        }
return new java.lang.Object[] {
        ((java.lang.Object) (Result_6)),
        ((java.lang.Object) (STATE_VARIABLE_Tokens_10))
      };
    }
//  xml.m:380
  }
//  xml.m:347
  private static java.lang.Object [] parse_spec_3_p_0(
    list.List_1 STATE_VARIABLE_Tokens_0_8)
  {
//  xml.m:355
    {
      boolean succeeded = (STATE_VARIABLE_Tokens_0_8.data_tag == 1);
      xml.Parse_1 Result_4 = null;
      list.List_1 STATE_VARIABLE_Tokens_9 = null;
      int C_6 = '\u0000';
      int N_7 = 0;
      list.List_1 STATE_VARIABLE_Tokens_10_10 = null;
//  xml.m:165
      pair.Pair_2 V_19_19 = null;

      if (succeeded)
        {
          V_19_19 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_0_8).F1);
          STATE_VARIABLE_Tokens_10_10 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_0_8).F2;
          N_7 = ((java.lang.Integer) (((pair.Pair_2) V_19_19).F1)).intValue();
          C_6 = ((java.lang.Integer) (((pair.Pair_2) V_19_19).F2)).intValue();
          succeeded = true;
        }
//  xml.m:355
      if (succeeded)
//  xml.m:352
        {
//  xml.m:351
          succeeded = (C_6 == (45));
//  xml.m:352
          if (succeeded)
//  xml.m:367
            {
              int C_25 = '\u0000';
              int N2_26 = 0;
              list.List_1 STATE_VARIABLE_Tokens_13_28 = null;
//  xml.m:165
              pair.Pair_2 V_43_43 = null;

              succeeded = (STATE_VARIABLE_Tokens_10_10.data_tag == 1);
              if (succeeded)
                {
                  V_43_43 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_10_10).F1);
                  STATE_VARIABLE_Tokens_13_28 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_10_10).F2;
                  N2_26 = ((java.lang.Integer) (((pair.Pair_2) V_43_43).F1)).intValue();
                  C_25 = ((java.lang.Integer) (((pair.Pair_2) V_43_43).F2)).intValue();
                  succeeded = true;
                }
//  xml.m:367
              if (succeeded)
//  xml.m:366
                {
//  xml.m:362
                  succeeded = (C_25 == (45));
//  xml.m:366
                  if (succeeded)
//  xml.m:365
                    {
                      java.lang.String S_27 = null;
                      list.List_1 STATE_VARIABLE_Tokens_15_30 = null;
//  xml.m:363
                      java.lang.String V_29_29 = "-->";
                      list.List_1 Chars_49 = null;
                      list.List_1 RevCs_50 = null;
                      list.List_1 V_51_51 = null;

//  xml.m:492
                      {
                        Chars_49 = string.to_char_list_2_p_0(V_29_29);
                      }
//  xml.m:493
                      V_51_51 = (list.List_1) xml.MR_scalar_common_2[0];
                      {
                        java.lang.Object [] result = xml.skip_to_5_p_0(Chars_49, V_51_51, STATE_VARIABLE_Tokens_13_28);
                        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                        RevCs_50 = (list.List_1) result[1];
                        STATE_VARIABLE_Tokens_15_30 = (list.List_1) result[2];
                      }
//  xml.m:363
                      if (succeeded)
                        {
//  xml.m:494
                          {
                            S_27 = string.from_rev_char_list_2_p_0(RevCs_50);
                          }
                          succeeded = true;
//  xml.m:363
                        }
//  xml.m:365
                      if (succeeded)
//  xml.m:364
                        {
                          pair.Pair_2 V_31_31 = null;
                          xml.Stream_obj_0 V_32_32 = null;
                          xml.Spec_0 V_33_33 = null;

                          STATE_VARIABLE_Tokens_9 = STATE_VARIABLE_Tokens_15_30;
                          {
                            V_33_33 = new xml.Spec_0.Comment_1(S_27);
                          }
                          {
                            V_32_32 = new xml.Stream_obj_0.Spec_1(V_33_33);
                          }
                          {
                            V_31_31 = new pair.Pair_2(java.lang.Integer.valueOf(N_7), ((java.lang.Object) (V_32_32)));
                          }
                          {
                            Result_4 = new xml.Parse_1.Ok_1(((java.lang.Object) (V_31_31)));
                          }
                        }
//  xml.m:365
                      else
                        {
                          xml.Error_0 V_34_34 = (xml.Error_0) xml.MR_scalar_common_10[0];
                          java.lang.String V_35_35 = "comment block";

                          Result_4 = (xml.Parse_1) xml.MR_scalar_common_8[5];
                          STATE_VARIABLE_Tokens_9 = STATE_VARIABLE_Tokens_13_28;
                        }
                    }
//  xml.m:366
                  else
                    {
                      xml.Error_0 V_37_37 = null;
                      java.lang.String V_38_38 = "\140-\'";

                      {
                        V_37_37 = new xml.Error_0.Ebf_at_3(V_38_38, C_25, N2_26);
                      }
                      {
                        Result_4 = new xml.Parse_1.Error_1(V_37_37);
                      }
                      STATE_VARIABLE_Tokens_9 = STATE_VARIABLE_Tokens_13_28;
                    }
                }
//  xml.m:367
              else
                {
                  xml.Error_0 V_39_39 = (xml.Error_0) xml.MR_scalar_common_9[0];

                  Result_4 = (xml.Parse_1) xml.MR_scalar_common_8[3];
                  STATE_VARIABLE_Tokens_9 = STATE_VARIABLE_Tokens_10_10;
                }
            }
//  xml.m:352
          else
//  xml.m:353
            {
//  xml.m:352
              succeeded = (C_6 == (91));
//  xml.m:353
              if (succeeded)
//  xml.m:377
                {
                  list.List_1 STATE_VARIABLE_Tokens_12_60 = null;
//  xml.m:373
                  java.lang.String V_59_59 = "CDATA[";
                  list.List_1 Cs_75 = null;

//  xml.m:184
                  {
                    Cs_75 = string.to_char_list_2_p_0(V_59_59);
                  }
//  xml.m:185
                  {
                    java.lang.Object [] result = xml.tokens_3_p_0(Cs_75, STATE_VARIABLE_Tokens_10_10);
                    succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                    STATE_VARIABLE_Tokens_12_60 = (list.List_1) result[1];
                  }
//  xml.m:377
                  if (succeeded)
//  xml.m:376
                    {
                      java.lang.String S_58 = null;
                      list.List_1 STATE_VARIABLE_Tokens_14_62 = null;
//  xml.m:374
                      java.lang.String V_61_61 = "]]>";
                      list.List_1 Chars_82 = null;
                      list.List_1 RevCs_83 = null;
                      list.List_1 V_84_84 = null;

//  xml.m:492
                      {
                        Chars_82 = string.to_char_list_2_p_0(V_61_61);
                      }
//  xml.m:493
                      V_84_84 = (list.List_1) xml.MR_scalar_common_2[0];
                      {
                        java.lang.Object [] result = xml.skip_to_5_p_0(Chars_82, V_84_84, STATE_VARIABLE_Tokens_12_60);
                        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                        RevCs_83 = (list.List_1) result[1];
                        STATE_VARIABLE_Tokens_14_62 = (list.List_1) result[2];
                      }
//  xml.m:374
                      if (succeeded)
                        {
//  xml.m:494
                          {
                            S_58 = string.from_rev_char_list_2_p_0(RevCs_83);
                          }
                          succeeded = true;
//  xml.m:374
                        }
//  xml.m:376
                      if (succeeded)
//  xml.m:375
                        {
                          pair.Pair_2 V_63_63 = null;
                          xml.Stream_obj_0 V_64_64 = null;
                          xml.Spec_0 V_65_65 = null;

                          STATE_VARIABLE_Tokens_9 = STATE_VARIABLE_Tokens_14_62;
                          {
                            V_65_65 = new xml.Spec_0.Cdata_1(S_58);
                          }
                          {
                            V_64_64 = new xml.Stream_obj_0.Spec_1(V_65_65);
                          }
                          {
                            V_63_63 = new pair.Pair_2(java.lang.Integer.valueOf(N_7), ((java.lang.Object) (V_64_64)));
                          }
                          {
                            Result_4 = new xml.Parse_1.Ok_1(((java.lang.Object) (V_63_63)));
                          }
                        }
//  xml.m:376
                      else
                        {
                          xml.Error_0 V_66_66 = (xml.Error_0) xml.MR_scalar_common_10[1];
                          java.lang.String V_67_67 = "cdata block";

                          Result_4 = (xml.Parse_1) xml.MR_scalar_common_8[6];
                          STATE_VARIABLE_Tokens_9 = STATE_VARIABLE_Tokens_12_60;
                        }
                    }
//  xml.m:377
                  else
                    {
                      xml.Error_0 V_69_69 = (xml.Error_0) xml.MR_scalar_common_7[4];
                      java.lang.String V_70_70 = "\'CDATA[\'";

                      Result_4 = (xml.Parse_1) xml.MR_scalar_common_8[7];
                      STATE_VARIABLE_Tokens_9 = STATE_VARIABLE_Tokens_10_10;
                    }
                }
//  xml.m:353
              else
//  xml.m:354
                {
//  xml.m:353
                  succeeded = (C_6 == (68));
//  xml.m:354
                  if (succeeded)
//  xml.m:353
                    {
                      java.lang.Object [] result = xml.parse_doctype_4_p_0(N_7, STATE_VARIABLE_Tokens_10_10);
                      Result_4 = (xml.Parse_1) result[0];
                      STATE_VARIABLE_Tokens_9 = (list.List_1) result[1];
                    }
//  xml.m:354
                  else
                    {
                      xml.Error_0 V_14_14 = null;

                      {
                        V_14_14 = new xml.Error_0.Unexpected_char_at_2(C_6, N_7);
                      }
                      {
                        Result_4 = new xml.Parse_1.Error_1(V_14_14);
                      }
                      STATE_VARIABLE_Tokens_9 = STATE_VARIABLE_Tokens_10_10;
                    }
                }
//  xml.m:353
            }
//  xml.m:352
        }
//  xml.m:355
      else
        {
          xml.Error_0 V_15_15 = (xml.Error_0) xml.MR_scalar_common_9[0];

          Result_4 = (xml.Parse_1) xml.MR_scalar_common_8[3];
          STATE_VARIABLE_Tokens_9 = STATE_VARIABLE_Tokens_0_8;
        }
return new java.lang.Object[] {
        ((java.lang.Object) (Result_4)),
        ((java.lang.Object) (STATE_VARIABLE_Tokens_9))
      };
    }
//  xml.m:347
  }
//  xml.m:299
  private static java.lang.Object [] parse_tag_opws_6_p_0(
    xml.Tagtype_0 Type_7,
    java.lang.String S_8,
    list.List_1 RevAs_9,
    list.List_1 STATE_VARIABLE_Tokens_0_15)
  {
//  xml.m:301
    {
      boolean succeeded = false;
      xml.Parse_1 Result_10 = null;
      list.List_1 STATE_VARIABLE_Tokens_16 = null;
      list.List_1 STATE_VARIABLE_Tokens_17_17 = null;
//  xml.m:310
      int C_12 = '\u0000';
      int N_13 = 0;
      list.List_1 STATE_VARIABLE_Tokens_18_18 = null;
//  xml.m:165
      pair.Pair_2 V_27_27 = null;

//  xml.m:302
      {
        STATE_VARIABLE_Tokens_17_17 = xml.opws_2_p_0(STATE_VARIABLE_Tokens_0_15);
      }
//  xml.m:165
      succeeded = (STATE_VARIABLE_Tokens_17_17.data_tag == 1);
      if (succeeded)
        {
          V_27_27 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_17_17).F1);
          STATE_VARIABLE_Tokens_18_18 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_17_17).F2;
          N_13 = ((java.lang.Integer) (((pair.Pair_2) V_27_27).F1)).intValue();
          C_12 = ((java.lang.Integer) (((pair.Pair_2) V_27_27).F2)).intValue();
          succeeded = true;
        }
//  xml.m:310
      if (succeeded)
//  xml.m:304
        {
          jmercury.runtime.TypeInfo_Struct TypeInfo_23_23 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[2]);
          list.List_1 As_14 = null;

          {
            As_14 = list.reverse_2_p_0(TypeInfo_23_23, RevAs_9);
          }
//  xml.m:305
          succeeded = (C_12 == (62));
//  xml.m:307
          if (succeeded)
//  xml.m:306
            {
//  xml.m:315
              switch (Type_7.MR_value) {
                case 0:
//  xml.m:318
                  {
//  xml.m:316
                    succeeded = (As_14.data_tag == 0);
//  xml.m:318
                    if (succeeded)
//  xml.m:317
                      {
                        pair.Pair_2 V_32_32 = null;
                        xml.Stream_obj_0 V_33_33 = null;

                        {
                          V_33_33 = new xml.Stream_obj_0.End_tag_1(S_8);
                        }
                        {
                          V_32_32 = new pair.Pair_2(java.lang.Integer.valueOf(N_13), ((java.lang.Object) (V_33_33)));
                        }
                        {
                          Result_10 = new xml.Parse_1.Ok_1(((java.lang.Object) (V_32_32)));
                        }
                      }
//  xml.m:318
                    else
                      {
                        xml.Error_0 V_34_34 = null;
                        java.lang.String V_35_35 = "end tag";
                        java.lang.String V_36_36 = "has attributes";

                        {
                          V_34_34 = new xml.Error_0.Spec_3(V_35_35, S_8, V_36_36);
                        }
                        {
                          Result_10 = new xml.Parse_1.Error_1(V_34_34);
                        }
                      }
                  }
//  xml.m:315
                  break;
                case 1:
//  xml.m:319
                  {
                    pair.Pair_2 V_40_40 = null;
                    xml.Stream_obj_0 V_41_41 = null;

                    {
                      V_41_41 = new xml.Stream_obj_0.Start_tag_2(S_8, As_14);
                    }
                    {
                      V_40_40 = new pair.Pair_2(java.lang.Integer.valueOf(N_13), ((java.lang.Object) (V_41_41)));
                    }
                    {
                      Result_10 = new xml.Parse_1.Ok_1(((java.lang.Object) (V_40_40)));
                    }
                  }
//  xml.m:315
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
//  xml.m:306
              STATE_VARIABLE_Tokens_16 = STATE_VARIABLE_Tokens_18_18;
            }
//  xml.m:307
          else
//  xml.m:309
            {
//  xml.m:307
              succeeded = (C_12 == (47));
//  xml.m:309
              if (succeeded)
//  xml.m:325
                switch (Type_7.MR_value) {
                  case 0:
//  xml.m:331
                    {
                      xml.Error_0 V_66_66 = null;
                      java.lang.String V_67_67 = "slash";
                      java.lang.String V_68_68 = "end tag";

//  xml.m:332
                      {
                        V_66_66 = new xml.Error_0.Unexpected_in_name_3(V_67_67, V_68_68, S_8);
                      }
                      {
                        Result_10 = new xml.Parse_1.Error_1(V_66_66);
                      }
//  xml.m:331
                      STATE_VARIABLE_Tokens_16 = STATE_VARIABLE_Tokens_18_18;
                    }
//  xml.m:325
                    break;
                  case 1:
//  xml.m:330
                    {
                      int C_47 = '\u0000';
                      int N2_48 = 0;
                      list.List_1 STATE_VARIABLE_Tokens_17_51 = null;
//  xml.m:165
                      pair.Pair_2 V_72_72 = null;

                      succeeded = (STATE_VARIABLE_Tokens_18_18.data_tag == 1);
                      if (succeeded)
                        {
                          V_72_72 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_18_18).F1);
                          STATE_VARIABLE_Tokens_17_51 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_18_18).F2;
                          N2_48 = ((java.lang.Integer) (((pair.Pair_2) V_72_72).F1)).intValue();
                          C_47 = ((java.lang.Integer) (((pair.Pair_2) V_72_72).F2)).intValue();
                          succeeded = true;
                        }
//  xml.m:330
                      if (succeeded)
//  xml.m:329
                        {
                          STATE_VARIABLE_Tokens_16 = STATE_VARIABLE_Tokens_17_51;
//  xml.m:327
                          succeeded = (C_47 == (62));
//  xml.m:329
                          if (succeeded)
//  xml.m:328
                            {
                              pair.Pair_2 V_52_52 = null;
                              xml.Stream_obj_0 V_53_53 = null;
                              xml.Spec_0 V_54_54 = null;

                              {
                                V_54_54 = new xml.Spec_0.Empty_tag_2(S_8, As_14);
                              }
                              {
                                V_53_53 = new xml.Stream_obj_0.Spec_1(V_54_54);
                              }
                              {
                                V_52_52 = new pair.Pair_2(java.lang.Integer.valueOf(N_13), ((java.lang.Object) (V_53_53)));
                              }
                              {
                                Result_10 = new xml.Parse_1.Ok_1(((java.lang.Object) (V_52_52)));
                              }
                            }
//  xml.m:329
                          else
                            {
                              xml.Error_0 V_55_55 = null;
                              java.lang.String V_56_56 = "\140>\'";

                              {
                                V_55_55 = new xml.Error_0.Ebf_at_3(V_56_56, C_47, N2_48);
                              }
                              {
                                Result_10 = new xml.Parse_1.Error_1(V_55_55);
                              }
                            }
                        }
//  xml.m:330
                      else
                        {
                          xml.Error_0 V_57_57 = (xml.Error_0) xml.MR_scalar_common_9[0];

                          Result_10 = (xml.Parse_1) xml.MR_scalar_common_8[3];
                          STATE_VARIABLE_Tokens_16 = STATE_VARIABLE_Tokens_18_18;
                        }
                    }
//  xml.m:325
                    break;
                  default: /*NOTREACHED*/
                    throw new jmercury.runtime.UnreachableDefault();
                }
//  xml.m:309
              else
                {
                  xml.Error_0 V_20_20 = null;
                  java.lang.String V_21_21 = "\'>\', or \'/\'";

                  {
                    V_20_20 = new xml.Error_0.Ebf_at_3(V_21_21, C_12, N_13);
                  }
                  {
                    Result_10 = new xml.Parse_1.Error_1(V_20_20);
                  }
                  STATE_VARIABLE_Tokens_16 = STATE_VARIABLE_Tokens_18_18;
                }
            }
//  xml.m:304
        }
//  xml.m:310
      else
        {
          xml.Error_0 V_22_22 = (xml.Error_0) xml.MR_scalar_common_9[0];

          Result_10 = (xml.Parse_1) xml.MR_scalar_common_8[3];
          STATE_VARIABLE_Tokens_16 = STATE_VARIABLE_Tokens_17_17;
        }
//  xml.m:301
return new java.lang.Object[] {
        ((java.lang.Object) (Result_10)),
        ((java.lang.Object) (STATE_VARIABLE_Tokens_16))
      };
    }
//  xml.m:299
  }
//  xml.m:287
  private static java.lang.Object [] parse_attrib_simplelit_6_p_0(
    java.lang.String S_7,
    list.List_1 As_8,
    java.lang.String Name_9,
    list.List_1 STATE_VARIABLE_Tokens_0_15)
  {
//  xml.m:289
    {
      boolean succeeded = false;
      xml.Parse_1 Result_10 = null;
      list.List_1 STATE_VARIABLE_Tokens_16 = null;
      list.List_1 STATE_VARIABLE_Tokens_17_17 = null;
//  xml.m:293
      java.lang.String V_12 = null;
      list.List_1 STATE_VARIABLE_Tokens_18_18 = null;
//  xml.m:458
      list.List_1 STATE_VARIABLE_Tokens_10_33 = null;
//  xml.m:454
      int V_32_32 = '\u0000';
      pair.Pair_2 V_50_50 = null;
      int V_51_51 = '\u0000';
//  xml.m:160
      int V_49_49 = 0;

//  xml.m:290
      {
        STATE_VARIABLE_Tokens_17_17 = xml.opws_2_p_0(STATE_VARIABLE_Tokens_0_15);
      }
//  xml.m:454
      V_32_32 = (34);
//  xml.m:160
      succeeded = (STATE_VARIABLE_Tokens_17_17.data_tag == 1);
      if (succeeded)
        {
          V_50_50 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_17_17).F1);
          STATE_VARIABLE_Tokens_10_33 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_17_17).F2;
          V_49_49 = ((java.lang.Integer) (((pair.Pair_2) V_50_50).F1)).intValue();
          V_51_51 = ((java.lang.Integer) (((pair.Pair_2) V_50_50).F2)).intValue();
          succeeded = (V_32_32 == V_51_51);
        }
//  xml.m:458
      if (succeeded)
//  xml.m:455
        {
          list.List_1 Cs_31 = null;
          int V_34_34 = (34);
          list.List_1 STATE_VARIABLE_Tokens_12_35 = null;
          int V_36_36 = '\u0000';
          pair.Pair_2 V_55_55 = null;
          int V_56_56 = '\u0000';
//  xml.m:160
          int V_54_54 = 0;

//  xml.m:455
          {
            java.lang.Object [] result = xml.noquotes_4_p_0(V_34_34, STATE_VARIABLE_Tokens_10_33);
            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
            Cs_31 = (list.List_1) result[1];
            STATE_VARIABLE_Tokens_12_35 = (list.List_1) result[2];
          }
          if (succeeded)
            {
//  xml.m:456
              V_36_36 = (34);
//  xml.m:160
              succeeded = (STATE_VARIABLE_Tokens_12_35.data_tag == 1);
              if (succeeded)
                {
                  V_55_55 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_12_35).F1);
                  STATE_VARIABLE_Tokens_18_18 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_12_35).F2;
                  V_54_54 = ((java.lang.Integer) (((pair.Pair_2) V_55_55).F1)).intValue();
                  V_56_56 = ((java.lang.Integer) (((pair.Pair_2) V_55_55).F2)).intValue();
                  succeeded = (V_36_36 == V_56_56);
//  xml.m:455
                  if (succeeded)
                    {
//  xml.m:457
                      {
                        V_12 = string.from_char_list_2_p_0(Cs_31);
                      }
                      succeeded = true;
//  xml.m:455
                    }
//  xml.m:160
                }
//  xml.m:455
            }
        }
//  xml.m:458
      else
//  xml.m:462
        {
          list.List_1 STATE_VARIABLE_Tokens_16_39 = null;
//  xml.m:458
          int V_38_38 = (39);
          pair.Pair_2 V_60_60 = null;
          int V_61_61 = '\u0000';
//  xml.m:160
          int V_59_59 = 0;

          succeeded = (STATE_VARIABLE_Tokens_17_17.data_tag == 1);
          if (succeeded)
            {
              V_60_60 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_17_17).F1);
              STATE_VARIABLE_Tokens_16_39 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_17_17).F2;
              V_59_59 = ((java.lang.Integer) (((pair.Pair_2) V_60_60).F1)).intValue();
              V_61_61 = ((java.lang.Integer) (((pair.Pair_2) V_60_60).F2)).intValue();
              succeeded = (V_38_38 == V_61_61);
            }
//  xml.m:462
          if (succeeded)
//  xml.m:459
            {
              int V_40_40 = (39);
              list.List_1 STATE_VARIABLE_Tokens_18_41 = null;
              int V_42_42 = '\u0000';
              list.List_1 Cs_45 = null;
              pair.Pair_2 V_65_65 = null;
              int V_66_66 = '\u0000';
//  xml.m:160
              int V_64_64 = 0;

//  xml.m:459
              {
                java.lang.Object [] result = xml.noquotes_4_p_0(V_40_40, STATE_VARIABLE_Tokens_16_39);
                succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                Cs_45 = (list.List_1) result[1];
                STATE_VARIABLE_Tokens_18_41 = (list.List_1) result[2];
              }
              if (succeeded)
                {
//  xml.m:460
                  V_42_42 = (39);
//  xml.m:160
                  succeeded = (STATE_VARIABLE_Tokens_18_41.data_tag == 1);
                  if (succeeded)
                    {
                      V_65_65 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_18_41).F1);
                      STATE_VARIABLE_Tokens_18_18 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_18_41).F2;
                      V_64_64 = ((java.lang.Integer) (((pair.Pair_2) V_65_65).F1)).intValue();
                      V_66_66 = ((java.lang.Integer) (((pair.Pair_2) V_65_65).F2)).intValue();
                      succeeded = (V_42_42 == V_66_66);
//  xml.m:459
                      if (succeeded)
                        {
//  xml.m:461
                          {
                            V_12 = string.from_char_list_2_p_0(Cs_45);
                          }
                          succeeded = true;
//  xml.m:459
                        }
//  xml.m:160
                    }
//  xml.m:459
                }
            }
//  xml.m:462
          else
            {
              java.lang.Object [] result = xml.name_3_p_0(STATE_VARIABLE_Tokens_17_17);
              succeeded = ((java.lang.Boolean) result[0]).booleanValue();
              V_12 = (java.lang.String) result[1];
              STATE_VARIABLE_Tokens_18_18 = (list.List_1) result[2];
            }
        }
//  xml.m:293
      if (succeeded)
//  xml.m:292
        {
          list.List_1 V_19_19 = null;
          pair.Pair_2 V_21_21 = null;

          {
            V_21_21 = new pair.Pair_2(((java.lang.Object) (S_7)), ((java.lang.Object) (V_12)));
          }
          {
            V_19_19 = new list.List_1.F_cons_2(((java.lang.Object) (V_21_21)), As_8);
          }
          {
            java.lang.Object [] result = xml.parse_attributes_other_5_p_0(V_19_19, Name_9, STATE_VARIABLE_Tokens_18_18);
            Result_10 = (xml.Parse_1) result[0];
            STATE_VARIABLE_Tokens_16 = (list.List_1) result[1];
          }
        }
//  xml.m:293
      else
//  xml.m:295
        {
          int C2_13 = '\u0000';
          int N2_14 = 0;
          list.List_1 STATE_VARIABLE_Tokens_22_22 = null;
//  xml.m:169
          pair.Pair_2 V_70_70 = null;
          list.List_1 Ts_69 = null;

          succeeded = (STATE_VARIABLE_Tokens_17_17.data_tag == 1);
          if (succeeded)
            {
              V_70_70 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_17_17).F1);
              Ts_69 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_17_17).F2;
              N2_14 = ((java.lang.Integer) (((pair.Pair_2) V_70_70).F1)).intValue();
              C2_13 = ((java.lang.Integer) (((pair.Pair_2) V_70_70).F2)).intValue();
              STATE_VARIABLE_Tokens_22_22 = STATE_VARIABLE_Tokens_17_17;
              succeeded = true;
            }
//  xml.m:295
          if (succeeded)
//  xml.m:294
            {
              xml.Error_0 V_23_23 = null;
              java.lang.String V_24_24 = null;

              STATE_VARIABLE_Tokens_16 = STATE_VARIABLE_Tokens_22_22;
              V_24_24 = "simplelit";
              {
                V_23_23 = new xml.Error_0.Ebf_at_3(V_24_24, C2_13, N2_14);
              }
              {
                Result_10 = new xml.Parse_1.Error_1(V_23_23);
              }
            }
//  xml.m:295
          else
            {
              xml.Error_0 V_25_25 = (xml.Error_0) xml.MR_scalar_common_9[0];

              Result_10 = (xml.Parse_1) xml.MR_scalar_common_8[3];
              STATE_VARIABLE_Tokens_16 = STATE_VARIABLE_Tokens_17_17;
            }
        }
//  xml.m:289
return new java.lang.Object[] {
        ((java.lang.Object) (Result_10)),
        ((java.lang.Object) (STATE_VARIABLE_Tokens_16))
      };
    }
//  xml.m:287
  }
//  xml.m:271
  private static java.lang.Object [] parse_attributes_other_5_p_0(
    list.List_1 As_6,
    java.lang.String Name_7,
    list.List_1 STATE_VARIABLE_Tokens_0_13)
  {
//  xml.m:282
    while (true)
      {
        /* tailcall optimized into a loop */
        {
          boolean succeeded = (STATE_VARIABLE_Tokens_0_13.data_tag == 1);
          xml.Parse_1 Result_8 = null;
          list.List_1 STATE_VARIABLE_Tokens_14 = null;
          java.lang.String S_10 = null;
          list.List_1 STATE_VARIABLE_Tokens_16_16 = null;
//  xml.m:274
          list.List_1 STATE_VARIABLE_Tokens_15_15 = null;
          int C_31 = '\u0000';
          list.List_1 STATE_VARIABLE_Tokens_7_32 = null;
          pair.Pair_2 V_37_37 = null;
//  xml.m:160
          int V_36_36 = 0;

          if (succeeded)
            {
              V_37_37 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_0_13).F1);
              STATE_VARIABLE_Tokens_7_32 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_0_13).F2;
              V_36_36 = ((java.lang.Integer) (((pair.Pair_2) V_37_37).F1)).intValue();
              C_31 = ((java.lang.Integer) (((pair.Pair_2) V_37_37).F2)).intValue();
//  xml.m:510
              {
                succeeded = mr_char.is_whitespace_1_p_0(C_31);
              }
//  xml.m:274
              if (succeeded)
                {
//  xml.m:511
                  {
                    STATE_VARIABLE_Tokens_15_15 = xml.opws_2_p_0(STATE_VARIABLE_Tokens_7_32);
                  }
//  xml.m:274
                  {
                    java.lang.Object [] result = xml.name_3_p_0(STATE_VARIABLE_Tokens_15_15);
                    succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                    S_10 = (java.lang.String) result[1];
                    STATE_VARIABLE_Tokens_16_16 = (list.List_1) result[2];
                  }
                }
//  xml.m:160
            }
//  xml.m:282
          if (succeeded)
//  xml.m:275
            {
              list.List_1 STATE_VARIABLE_Tokens_17_17 = null;
//  xml.m:281
              int C1_11 = '\u0000';
              list.List_1 STATE_VARIABLE_Tokens_18_18 = null;
//  xml.m:165
              pair.Pair_2 V_41_41 = null;
              int N_12 = 0;

//  xml.m:275
              {
                STATE_VARIABLE_Tokens_17_17 = xml.opws_2_p_0(STATE_VARIABLE_Tokens_16_16);
              }
//  xml.m:165
              succeeded = (STATE_VARIABLE_Tokens_17_17.data_tag == 1);
              if (succeeded)
                {
                  V_41_41 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_17_17).F1);
                  STATE_VARIABLE_Tokens_18_18 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_17_17).F2;
                  N_12 = ((java.lang.Integer) (((pair.Pair_2) V_41_41).F1)).intValue();
                  C1_11 = ((java.lang.Integer) (((pair.Pair_2) V_41_41).F2)).intValue();
                  succeeded = true;
                }
//  xml.m:281
              if (succeeded)
//  xml.m:279
                {
//  xml.m:277
                  succeeded = (C1_11 == (61));
//  xml.m:279
                  if (succeeded)
//  xml.m:278
                    {
                      java.lang.Object [] result = xml.parse_attrib_simplelit_6_p_0(S_10, As_6, Name_7, STATE_VARIABLE_Tokens_18_18);
                      Result_8 = (xml.Parse_1) result[0];
                      STATE_VARIABLE_Tokens_14 = (list.List_1) result[1];
                    }
//  xml.m:279
                  else
                    {
                      list.List_1 V_21_21 = null;
                      pair.Pair_2 V_23_23 = null;
                      java.lang.String V_24_24 = "";

//  xml.m:280
                      {
                        V_23_23 = new pair.Pair_2(((java.lang.Object) (S_10)), ((java.lang.Object) (V_24_24)));
                      }
                      {
                        V_21_21 = new list.List_1.F_cons_2(((java.lang.Object) (V_23_23)), As_6);
                      }
                      /* direct tailcall eliminated */
                      {
                        list.List_1 As__tmp_copy_6 = V_21_21;
                        list.List_1 STATE_VARIABLE_Tokens_0__tmp_copy_13 = STATE_VARIABLE_Tokens_17_17;

                        STATE_VARIABLE_Tokens_0_13 = STATE_VARIABLE_Tokens_0__tmp_copy_13;
                        As_6 = As__tmp_copy_6;
                      }
                      continue;
//  xml.m:279
                    }
                }
//  xml.m:281
              else
                {
                  xml.Error_0 V_25_25 = (xml.Error_0) xml.MR_scalar_common_9[0];

                  Result_8 = (xml.Parse_1) xml.MR_scalar_common_8[3];
                  STATE_VARIABLE_Tokens_14 = STATE_VARIABLE_Tokens_17_17;
                }
//  xml.m:275
            }
//  xml.m:282
          else
            {
              xml.Tagtype_0 V_26_26 = xml.Tagtype_0.K1;

              {
                java.lang.Object [] result = xml.parse_tag_opws_6_p_0(V_26_26, Name_7, As_6, STATE_VARIABLE_Tokens_0_13);
                Result_8 = (xml.Parse_1) result[0];
                STATE_VARIABLE_Tokens_14 = (list.List_1) result[1];
              }
            }
return new java.lang.Object[] {
            ((java.lang.Object) (Result_8)),
            ((java.lang.Object) (STATE_VARIABLE_Tokens_14))
          };
        }
      }
//  xml.m:271
  }
//  xml.m:241
  private static java.lang.Object [] parse_tag_4_p_0(
    xml.Tagtype_0 Type_5,
    list.List_1 STATE_VARIABLE_Tokens_0_15)
  {
//  xml.m:256
    {
      boolean succeeded = false;
      xml.Parse_1 Result_6 = null;
      list.List_1 STATE_VARIABLE_Tokens_16 = null;
      java.lang.String S_8 = null;
      list.List_1 STATE_VARIABLE_Tokens_17_17 = null;

//  xml.m:244
      {
        java.lang.Object [] result = xml.name_3_p_0(STATE_VARIABLE_Tokens_0_15);
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        S_8 = (java.lang.String) result[1];
        STATE_VARIABLE_Tokens_17_17 = (list.List_1) result[2];
      }
//  xml.m:256
      if (succeeded)
//  xml.m:255
        {
          int C1_9 = '\u0000';
          list.List_1 STATE_VARIABLE_Tokens_18_18 = null;
//  xml.m:165
          pair.Pair_2 V_37_37 = null;
          int N1_10 = 0;

          succeeded = (STATE_VARIABLE_Tokens_17_17.data_tag == 1);
          if (succeeded)
            {
              V_37_37 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_17_17).F1);
              STATE_VARIABLE_Tokens_18_18 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_17_17).F2;
              N1_10 = ((java.lang.Integer) (((pair.Pair_2) V_37_37).F1)).intValue();
              C1_9 = ((java.lang.Integer) (((pair.Pair_2) V_37_37).F2)).intValue();
              succeeded = true;
            }
//  xml.m:255
          if (succeeded)
//  xml.m:253
            {
//  xml.m:246
              succeeded = (C1_9 == (47));
//  xml.m:253
              if (succeeded)
//  xml.m:252
                {
                  int C2_11 = '\u0000';
                  int N2_12 = 0;
                  list.List_1 STATE_VARIABLE_Tokens_19_19 = null;
//  xml.m:165
                  pair.Pair_2 V_41_41 = null;

                  succeeded = (STATE_VARIABLE_Tokens_18_18.data_tag == 1);
                  if (succeeded)
                    {
                      V_41_41 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_18_18).F1);
                      STATE_VARIABLE_Tokens_19_19 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_18_18).F2;
                      N2_12 = ((java.lang.Integer) (((pair.Pair_2) V_41_41).F1)).intValue();
                      C2_11 = ((java.lang.Integer) (((pair.Pair_2) V_41_41).F2)).intValue();
                      succeeded = true;
                    }
//  xml.m:252
                  if (succeeded)
//  xml.m:250
                    {
//  xml.m:248
                      succeeded = (C2_11 == (62));
//  xml.m:250
                      if (succeeded)
//  xml.m:249
                        {
                          pair.Pair_2 V_20_20 = null;
                          xml.Stream_obj_0 V_21_21 = null;

                          {
                            V_21_21 = new xml.Stream_obj_0.Empty_tag_1(S_8);
                          }
                          {
                            V_20_20 = new pair.Pair_2(java.lang.Integer.valueOf(N2_12), ((java.lang.Object) (V_21_21)));
                          }
                          {
                            Result_6 = new xml.Parse_1.Ok_1(((java.lang.Object) (V_20_20)));
                          }
                          STATE_VARIABLE_Tokens_16 = STATE_VARIABLE_Tokens_19_19;
                        }
//  xml.m:250
                      else
                        {
                          xml.Error_0 V_23_23 = null;
                          java.lang.String V_24_24 = null;

//  xml.m:173
                          STATE_VARIABLE_Tokens_16 = STATE_VARIABLE_Tokens_18_18;
//  xml.m:251
                          V_24_24 = ">";
                          V_23_23 = (xml.Error_0) xml.MR_scalar_common_7[3];
                          Result_6 = (xml.Parse_1) xml.MR_scalar_common_8[4];
//  xml.m:250
                        }
                    }
//  xml.m:252
                  else
                    {
                      xml.Error_0 V_25_25 = (xml.Error_0) xml.MR_scalar_common_9[0];

                      Result_6 = (xml.Parse_1) xml.MR_scalar_common_8[3];
                      STATE_VARIABLE_Tokens_16 = STATE_VARIABLE_Tokens_18_18;
                    }
                }
//  xml.m:253
              else
//  xml.m:264
                switch (Type_5.MR_value) {
                  case 0:
                    {
                      xml.Tagtype_0 V_55_55 = xml.Tagtype_0.K0;
                      list.List_1 V_56_56 = (list.List_1) xml.MR_scalar_common_2[0];

//  xml.m:265
                      {
                        java.lang.Object [] result = xml.parse_tag_opws_6_p_0(V_55_55, S_8, V_56_56, STATE_VARIABLE_Tokens_17_17);
                        Result_6 = (xml.Parse_1) result[0];
                        STATE_VARIABLE_Tokens_16 = (list.List_1) result[1];
                      }
//  xml.m:264
                    }
                    break;
                  case 1:
//  xml.m:266
                    {
                      list.List_1 V_63_63 = (list.List_1) xml.MR_scalar_common_2[0];

//  xml.m:267
                      {
                        java.lang.Object [] result = xml.parse_attributes_other_5_p_0(V_63_63, S_8, STATE_VARIABLE_Tokens_17_17);
                        Result_6 = (xml.Parse_1) result[0];
                        STATE_VARIABLE_Tokens_16 = (list.List_1) result[1];
                      }
//  xml.m:266
                    }
//  xml.m:264
                    break;
                  default: /*NOTREACHED*/
                    throw new jmercury.runtime.UnreachableDefault();
                }
//  xml.m:253
            }
//  xml.m:255
          else
            {
              xml.Error_0 V_28_28 = (xml.Error_0) xml.MR_scalar_common_9[0];

              Result_6 = (xml.Parse_1) xml.MR_scalar_common_8[3];
              STATE_VARIABLE_Tokens_16 = STATE_VARIABLE_Tokens_17_17;
            }
        }
//  xml.m:256
      else
//  xml.m:258
        {
          int C0_13 = '\u0000';
          int N0_14 = 0;
          list.List_1 STATE_VARIABLE_Tokens_29_29 = null;
//  xml.m:169
          pair.Pair_2 V_68_68 = null;
          list.List_1 Ts_67 = null;

          succeeded = (STATE_VARIABLE_Tokens_0_15.data_tag == 1);
          if (succeeded)
            {
              V_68_68 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_0_15).F1);
              Ts_67 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_0_15).F2;
              N0_14 = ((java.lang.Integer) (((pair.Pair_2) V_68_68).F1)).intValue();
              C0_13 = ((java.lang.Integer) (((pair.Pair_2) V_68_68).F2)).intValue();
              STATE_VARIABLE_Tokens_29_29 = STATE_VARIABLE_Tokens_0_15;
              succeeded = true;
            }
//  xml.m:258
          if (succeeded)
//  xml.m:257
            {
              xml.Error_0 V_30_30 = null;
              java.lang.String V_31_31 = null;

              STATE_VARIABLE_Tokens_16 = STATE_VARIABLE_Tokens_29_29;
              V_31_31 = "name";
              {
                V_30_30 = new xml.Error_0.Ebf_at_3(V_31_31, C0_13, N0_14);
              }
              {
                Result_6 = new xml.Parse_1.Error_1(V_30_30);
              }
            }
//  xml.m:258
          else
            {
              xml.Error_0 V_32_32 = (xml.Error_0) xml.MR_scalar_common_9[0];

              Result_6 = (xml.Parse_1) xml.MR_scalar_common_8[3];
              STATE_VARIABLE_Tokens_16 = STATE_VARIABLE_Tokens_0_15;
            }
        }
//  xml.m:256
return new java.lang.Object[] {
        ((java.lang.Object) (Result_6)),
        ((java.lang.Object) (STATE_VARIABLE_Tokens_16))
      };
    }
//  xml.m:241
  }
//  xml.m:229
  private static java.lang.Object [] parse_markup_3_p_0(
    list.List_1 STATE_VARIABLE_Tokens_0_8)
  {
//  xml.m:238
    {
      boolean succeeded = (STATE_VARIABLE_Tokens_0_8.data_tag == 1);
      xml.Parse_1 Result_4 = null;
      list.List_1 STATE_VARIABLE_Tokens_9 = null;
      int C_6 = '\u0000';
      int N_7 = 0;
      list.List_1 STATE_VARIABLE_Tokens_10_10 = null;
//  xml.m:165
      pair.Pair_2 V_22_22 = null;

      if (succeeded)
        {
          V_22_22 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_0_8).F1);
          STATE_VARIABLE_Tokens_10_10 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_0_8).F2;
          N_7 = ((java.lang.Integer) (((pair.Pair_2) V_22_22).F1)).intValue();
          C_6 = ((java.lang.Integer) (((pair.Pair_2) V_22_22).F2)).intValue();
          succeeded = true;
        }
//  xml.m:238
      if (succeeded)
//  xml.m:234
        {
//  xml.m:233
          succeeded = (C_6 == (47));
//  xml.m:234
          if (succeeded)
//  xml.m:233
            {
              xml.Tagtype_0 V_11_11 = xml.Tagtype_0.K0;

              {
                java.lang.Object [] result = xml.parse_tag_4_p_0(V_11_11, STATE_VARIABLE_Tokens_10_10);
                Result_4 = (xml.Parse_1) result[0];
                STATE_VARIABLE_Tokens_9 = (list.List_1) result[1];
              }
            }
//  xml.m:234
          else
//  xml.m:235
            {
//  xml.m:234
              succeeded = (C_6 == (63));
//  xml.m:235
              if (succeeded)
//  xml.m:344
                {
                  java.lang.String N2_28 = null;
                  list.List_1 STATE_VARIABLE_Tokens_12_30 = null;

//  xml.m:338
                  {
                    java.lang.Object [] result = xml.name_3_p_0(STATE_VARIABLE_Tokens_10_10);
                    succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                    N2_28 = (java.lang.String) result[1];
                    STATE_VARIABLE_Tokens_12_30 = (list.List_1) result[2];
                  }
//  xml.m:344
                  if (succeeded)
//  xml.m:343
                    {
                      list.List_1 STATE_VARIABLE_Tokens_13_31 = null;
//  xml.m:509
                      int C_47 = '\u0000';
                      list.List_1 STATE_VARIABLE_Tokens_7_48 = null;
                      pair.Pair_2 V_53_53 = null;
//  xml.m:160
                      int V_52_52 = 0;

                      succeeded = (STATE_VARIABLE_Tokens_12_30.data_tag == 1);
                      if (succeeded)
                        {
                          V_53_53 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_12_30).F1);
                          STATE_VARIABLE_Tokens_7_48 = ((list.List_1.F_cons_2) STATE_VARIABLE_Tokens_12_30).F2;
                          V_52_52 = ((java.lang.Integer) (((pair.Pair_2) V_53_53).F1)).intValue();
                          C_47 = ((java.lang.Integer) (((pair.Pair_2) V_53_53).F2)).intValue();
//  xml.m:510
                          {
                            succeeded = mr_char.is_whitespace_1_p_0(C_47);
                          }
//  xml.m:509
                          if (succeeded)
                            {
//  xml.m:511
                              {
                                STATE_VARIABLE_Tokens_13_31 = xml.opws_2_p_0(STATE_VARIABLE_Tokens_7_48);
                              }
                              succeeded = true;
//  xml.m:509
                            }
//  xml.m:160
                        }
//  xml.m:343
                      if (succeeded)
//  xml.m:342
                        {
                          java.lang.String S_29 = null;
                          list.List_1 STATE_VARIABLE_Tokens_15_33 = null;
//  xml.m:340
                          java.lang.String V_32_32 = "?>";
                          list.List_1 Chars_59 = null;
                          list.List_1 RevCs_60 = null;
                          list.List_1 V_61_61 = null;

//  xml.m:492
                          {
                            Chars_59 = string.to_char_list_2_p_0(V_32_32);
                          }
//  xml.m:493
                          V_61_61 = (list.List_1) xml.MR_scalar_common_2[0];
                          {
                            java.lang.Object [] result = xml.skip_to_5_p_0(Chars_59, V_61_61, STATE_VARIABLE_Tokens_13_31);
                            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                            RevCs_60 = (list.List_1) result[1];
                            STATE_VARIABLE_Tokens_15_33 = (list.List_1) result[2];
                          }
//  xml.m:340
                          if (succeeded)
                            {
//  xml.m:494
                              {
                                S_29 = string.from_rev_char_list_2_p_0(RevCs_60);
                              }
                              succeeded = true;
//  xml.m:340
                            }
//  xml.m:342
                          if (succeeded)
//  xml.m:341
                            {
                              pair.Pair_2 V_34_34 = null;
                              xml.Stream_obj_0 V_35_35 = null;
                              xml.Spec_0 V_36_36 = null;

                              STATE_VARIABLE_Tokens_9 = STATE_VARIABLE_Tokens_15_33;
                              {
                                V_36_36 = new xml.Spec_0.Procinstr_2(N2_28, S_29);
                              }
                              {
                                V_35_35 = new xml.Stream_obj_0.Spec_1(V_36_36);
                              }
                              {
                                V_34_34 = new pair.Pair_2(java.lang.Integer.valueOf(N_7), ((java.lang.Object) (V_35_35)));
                              }
                              {
                                Result_4 = new xml.Parse_1.Ok_1(((java.lang.Object) (V_34_34)));
                              }
                            }
//  xml.m:342
                          else
                            {
                              xml.Error_0 V_37_37 = (xml.Error_0) xml.MR_scalar_common_7[0];
                              java.lang.String V_38_38 = "\'?>\'";

                              Result_4 = (xml.Parse_1) xml.MR_scalar_common_8[0];
                              STATE_VARIABLE_Tokens_9 = STATE_VARIABLE_Tokens_13_31;
                            }
                        }
//  xml.m:343
                      else
                        {
                          xml.Error_0 V_40_40 = (xml.Error_0) xml.MR_scalar_common_7[1];
                          java.lang.String V_41_41 = "white space";

                          Result_4 = (xml.Parse_1) xml.MR_scalar_common_8[1];
                          STATE_VARIABLE_Tokens_9 = STATE_VARIABLE_Tokens_12_30;
                        }
                    }
//  xml.m:344
                  else
                    {
                      xml.Error_0 V_42_42 = (xml.Error_0) xml.MR_scalar_common_7[2];
                      java.lang.String V_43_43 = "name";

                      Result_4 = (xml.Parse_1) xml.MR_scalar_common_8[2];
                      STATE_VARIABLE_Tokens_9 = STATE_VARIABLE_Tokens_10_10;
                    }
                }
//  xml.m:235
              else
//  xml.m:236
                {
//  xml.m:235
                  succeeded = (C_6 == (33));
//  xml.m:236
                  if (succeeded)
//  xml.m:235
                    {
                      java.lang.Object [] result = xml.parse_spec_3_p_0(STATE_VARIABLE_Tokens_10_10);
                      Result_4 = (xml.Parse_1) result[0];
                      STATE_VARIABLE_Tokens_9 = (list.List_1) result[1];
                    }
//  xml.m:236
                  else
                    {
                      xml.Tagtype_0 V_16_16 = xml.Tagtype_0.K1;

//  xml.m:237
                      {
                        java.lang.Object [] result = xml.parse_tag_4_p_0(V_16_16, STATE_VARIABLE_Tokens_0_8);
                        Result_4 = (xml.Parse_1) result[0];
                        STATE_VARIABLE_Tokens_9 = (list.List_1) result[1];
                      }
//  xml.m:236
                    }
                }
//  xml.m:235
            }
//  xml.m:234
        }
//  xml.m:238
      else
        {
          xml.Error_0 V_18_18 = (xml.Error_0) xml.MR_scalar_common_9[0];

          Result_4 = (xml.Parse_1) xml.MR_scalar_common_8[3];
          STATE_VARIABLE_Tokens_9 = STATE_VARIABLE_Tokens_0_8;
        }
return new java.lang.Object[] {
        ((java.lang.Object) (Result_4)),
        ((java.lang.Object) (STATE_VARIABLE_Tokens_9))
      };
    }
//  xml.m:229
  }
//  xml.m:220
  private static list.List_1 add_chars_to_stream_3_p_0(
    list.List_1 RevTs_4,
    list.List_1 STATE_VARIABLE_Stream_0_12)
  {
//  xml.m:222
    {
      boolean succeeded = false;
      list.List_1 STATE_VARIABLE_Stream_13 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_18_18 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[1]);
      list.List_1 Ts_6 = null;

//  xml.m:223
      {
        Ts_6 = list.reverse_2_p_0(TypeInfo_18_18, RevTs_4);
      }
//  xml.m:225
      if ((Ts_6.data_tag == 0))
//  xml.m:224
        STATE_VARIABLE_Stream_13 = STATE_VARIABLE_Stream_0_12;
//  xml.m:225
      else
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_19_19 = null;
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_20_20 = null;
          int N_7 = 0;
          list.List_1 Cs_10 = null;
          java.lang.String Str_11 = null;
          pair.Pair_2 V_14_14 = ((pair.Pair_2) ((list.List_1.F_cons_2) Ts_6).F1);
          pair.Pair_2 V_16_16 = null;
          xml.Stream_obj_0 V_17_17 = null;
          list.List_1 V_9_9 = ((list.List_1.F_cons_2) Ts_6).F2;
          int V_8_8 = '\u0000';

          N_7 = ((java.lang.Integer) (((pair.Pair_2) V_14_14).F1)).intValue();
          V_8_8 = ((java.lang.Integer) (((pair.Pair_2) V_14_14).F2)).intValue();
          TypeCtorInfo_19_19 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
          TypeCtorInfo_20_20 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_character_0);
          {
            Cs_10 = assoc_list.values_2_p_0(TypeCtorInfo_19_19, TypeCtorInfo_20_20, Ts_6);
          }
          {
            Str_11 = string.from_char_list_2_p_0(Cs_10);
          }
//  xml.m:226
          {
            V_17_17 = new xml.Stream_obj_0.Text_1(Str_11);
          }
          {
            V_16_16 = new pair.Pair_2(java.lang.Integer.valueOf(N_7), ((java.lang.Object) (V_17_17)));
          }
          {
            STATE_VARIABLE_Stream_13 = new list.List_1.F_cons_2(((java.lang.Object) (V_16_16)), STATE_VARIABLE_Stream_0_12);
          }
//  xml.m:225
        }
//  xml.m:222
      return STATE_VARIABLE_Stream_13;
    }
//  xml.m:220
  }
//  xml.m:211
  private static java.lang.Object [] tokens_to_stream_9_p_0(
    java.lang.String File_1,
    int L_2,
    xml.Parse_1 HeadVar__3_3,
    list.List_1 Tokens_4,
    list.List_1 Chars_5,
    list.List_1 STATE_VARIABLE_Es_0_6,
    list.List_1 STATE_VARIABLE_Stream_0_8)
  {
//  xml.m:213
    {
      boolean succeeded = false;
      list.List_1 STATE_VARIABLE_Es_7 = null;
      list.List_1 STATE_VARIABLE_Stream_9 = null;

      if ((HeadVar__3_3.data_tag == 1))
//  xml.m:216
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_43_43 = null;
          xml.Error_0 Err_28 = ((xml.Parse_1.Error_1) HeadVar__3_3).F1;
          list.List_1 STATE_VARIABLE_Stream_37_37 = null;
          errors.Err_loc_0 V_38_38 = null;
          list.List_1 STATE_VARIABLE_Es_39_39 = null;
          list.List_1 V_40_40 = null;

//  xml.m:217
          {
            STATE_VARIABLE_Stream_37_37 = xml.add_chars_to_stream_3_p_0(Chars_5, STATE_VARIABLE_Stream_0_8);
          }
          {
            V_38_38 = new errors.Err_loc_0.File_2(File_1, L_2);
          }
          TypeCtorInfo_43_43 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.xml__type_ctor_info_error_0);
          {
            STATE_VARIABLE_Es_39_39 = errors.add_error_4_p_0(TypeCtorInfo_43_43, V_38_38, ((java.lang.Object) (Err_28)), STATE_VARIABLE_Es_0_6);
          }
//  xml.m:218
          V_40_40 = (list.List_1) xml.MR_scalar_common_2[0];
          {
            java.lang.Object [] result = xml.tokens_to_stream_7_p_0(File_1, Tokens_4, V_40_40, STATE_VARIABLE_Es_39_39, STATE_VARIABLE_Stream_37_37);
            STATE_VARIABLE_Es_7 = (list.List_1) result[0];
            STATE_VARIABLE_Stream_9 = (list.List_1) result[1];
          }
//  xml.m:216
        }
//  xml.m:213
      else
        {
          pair.Pair_2 Item_12 = ((pair.Pair_2) ((xml.Parse_1.Ok_1) HeadVar__3_3).F1);
          list.List_1 STATE_VARIABLE_Stream_21_21 = null;
          list.List_1 V_22_22 = null;
          list.List_1 V_24_24 = null;

//  xml.m:214
          {
            STATE_VARIABLE_Stream_21_21 = xml.add_chars_to_stream_3_p_0(Chars_5, STATE_VARIABLE_Stream_0_8);
          }
//  xml.m:215
          V_22_22 = (list.List_1) xml.MR_scalar_common_2[0];
          {
            V_24_24 = new list.List_1.F_cons_2(((java.lang.Object) (Item_12)), STATE_VARIABLE_Stream_21_21);
          }
          {
            java.lang.Object [] result = xml.tokens_to_stream_7_p_0(File_1, Tokens_4, V_22_22, STATE_VARIABLE_Es_0_6, V_24_24);
            STATE_VARIABLE_Es_7 = (list.List_1) result[0];
            STATE_VARIABLE_Stream_9 = (list.List_1) result[1];
          }
//  xml.m:213
        }
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_Es_7)),
        ((java.lang.Object) (STATE_VARIABLE_Stream_9))
      };
    }
//  xml.m:211
  }
//  xml.m:196
  private static java.lang.Object [] tokens_to_stream_7_p_0(
    java.lang.String File_1,
    list.List_1 HeadVar__2_2,
    list.List_1 Chars_3,
    list.List_1 STATE_VARIABLE_Es_0_4,
    list.List_1 STATE_VARIABLE_Stream_0_6)
  {
//  xml.m:198
    while (true)
      {
        /* tailcall optimized into a loop */
        {
          boolean succeeded = false;
          list.List_1 STATE_VARIABLE_Es_5 = null;
          list.List_1 STATE_VARIABLE_Stream_7 = null;

          if ((HeadVar__2_2.data_tag == 0))
//  xml.m:206
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_44_44 = null;
              list.List_1 STATE_VARIABLE_Stream_42_42 = null;

//  xml.m:207
              {
                STATE_VARIABLE_Stream_42_42 = xml.add_chars_to_stream_3_p_0(Chars_3, STATE_VARIABLE_Stream_0_6);
              }
              TypeInfo_44_44 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[0]);
              {
                STATE_VARIABLE_Stream_7 = list.reverse_2_p_0(TypeInfo_44_44, STATE_VARIABLE_Stream_42_42);
              }
//  xml.m:206
              STATE_VARIABLE_Es_5 = STATE_VARIABLE_Es_0_4;
            }
//  xml.m:198
          else
            {
              int L_9 = 0;
              int C_10 = '\u0000';
              list.List_1 Ts0_11 = ((list.List_1.F_cons_2) HeadVar__2_2).F2;
              pair.Pair_2 V_21_21 = ((pair.Pair_2) ((list.List_1.F_cons_2) HeadVar__2_2).F1);

              L_9 = ((java.lang.Integer) (((pair.Pair_2) V_21_21).F1)).intValue();
              C_10 = ((java.lang.Integer) (((pair.Pair_2) V_21_21).F2)).intValue();
//  xml.m:199
              succeeded = (C_10 == (60));
//  xml.m:202
              if (succeeded)
//  xml.m:200
                {
                  xml.Parse_1 Result_15 = null;
                  list.List_1 Ts_16 = null;

                  {
                    java.lang.Object [] result = xml.parse_markup_3_p_0(Ts0_11);
                    Result_15 = (xml.Parse_1) result[0];
                    Ts_16 = (list.List_1) result[1];
                  }
//  xml.m:201
                  {
                    java.lang.Object [] result = xml.tokens_to_stream_9_p_0(File_1, L_9, Result_15, Ts_16, Chars_3, STATE_VARIABLE_Es_0_4, STATE_VARIABLE_Stream_0_6);
                    STATE_VARIABLE_Es_5 = (list.List_1) result[0];
                    STATE_VARIABLE_Stream_7 = (list.List_1) result[1];
                  }
//  xml.m:200
                }
//  xml.m:202
              else
//  xml.m:205
                {
//  xml.m:202
                  succeeded = (C_10 == (38));
//  xml.m:205
                  if (succeeded)
//  xml.m:203
                    {
                      xml.Parse_1 Result_30 = null;
                      list.List_1 Ts_31 = null;

                      {
                        java.lang.Object [] result = xml.parse_reference_4_p_0(L_9, Ts0_11);
                        Result_30 = (xml.Parse_1) result[0];
                        Ts_31 = (list.List_1) result[1];
                      }
//  xml.m:204
                      {
                        java.lang.Object [] result = xml.tokens_to_stream_9_p_0(File_1, L_9, Result_30, Ts_31, Chars_3, STATE_VARIABLE_Es_0_4, STATE_VARIABLE_Stream_0_6);
                        STATE_VARIABLE_Es_5 = (list.List_1) result[0];
                        STATE_VARIABLE_Stream_7 = (list.List_1) result[1];
                      }
//  xml.m:203
                    }
//  xml.m:205
                  else
                    {
                      list.List_1 V_26_26 = null;

                      {
                        V_26_26 = new list.List_1.F_cons_2(((java.lang.Object) (V_21_21)), Chars_3);
                      }
                      /* direct tailcall eliminated */
                      {
                        list.List_1 HeadVar__2__tmp_copy_2 = Ts0_11;
                        list.List_1 Chars__tmp_copy_3 = V_26_26;

                        Chars_3 = Chars__tmp_copy_3;
                        HeadVar__2_2 = HeadVar__2__tmp_copy_2;
                      }
                      continue;
                    }
                }
//  xml.m:198
            }
return new java.lang.Object[] {
            ((java.lang.Object) (STATE_VARIABLE_Es_5)),
            ((java.lang.Object) (STATE_VARIABLE_Stream_7))
          };
        }
      }
//  xml.m:196
  }
//  xml.m:188
  private static java.lang.Object [] tokens_to_stream_4_p_0(
    java.lang.String File_5,
    list.List_1 Tokens_6)
  {
//  xml.m:190
    {
      boolean succeeded = false;
      list.List_1 Errors_7 = null;
      list.List_1 Stream_8 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.xml__type_ctor_info_error_0);
      list.List_1 Errors0_9 = null;
      list.List_1 V_10_10 = null;
      list.List_1 V_11_11 = null;

//  xml.m:191
      {
        Errors0_9 = errors.new_messages_1_p_0(TypeCtorInfo_12_12);
      }
//  xml.m:192
      V_10_10 = (list.List_1) xml.MR_scalar_common_2[0];
      V_11_11 = (list.List_1) xml.MR_scalar_common_2[0];
      {
        java.lang.Object [] result = xml.tokens_to_stream_7_p_0(File_5, Tokens_6, V_10_10, Errors0_9, V_11_11);
        Errors_7 = (list.List_1) result[0];
        Stream_8 = (list.List_1) result[1];
      }
//  xml.m:190
return new java.lang.Object[] {
        ((java.lang.Object) (Errors_7)),
        ((java.lang.Object) (Stream_8))
      };
    }
//  xml.m:188
  }
//  xml.m:176
  private static java.lang.Object [] tokens_3_p_0(
    list.List_1 HeadVar__1_1,
    list.List_1 STATE_VARIABLE_Ts_0_2)
  {
//  xml.m:177
    while (true)
      {
        /* tailcall optimized into a loop */
        {
          boolean succeeded = false;
          list.List_1 STATE_VARIABLE_Ts_3 = null;

          if ((HeadVar__1_1.data_tag == 0))
//  xml.m:179
            {
              STATE_VARIABLE_Ts_3 = STATE_VARIABLE_Ts_0_2;
              succeeded = true;
            }
//  xml.m:177
          else
            {
              int C_4 = ((java.lang.Integer) (((list.List_1.F_cons_2) HeadVar__1_1).F1)).intValue();
              list.List_1 Cs_5 = ((list.List_1.F_cons_2) HeadVar__1_1).F2;
              list.List_1 STATE_VARIABLE_Ts_9_9 = null;
              pair.Pair_2 V_17_17 = null;
              int V_18_18 = '\u0000';
//  xml.m:160
              int V_16_16 = 0;

              succeeded = (STATE_VARIABLE_Ts_0_2.data_tag == 1);
              if (succeeded)
                {
                  V_17_17 = ((pair.Pair_2) ((list.List_1.F_cons_2) STATE_VARIABLE_Ts_0_2).F1);
                  STATE_VARIABLE_Ts_9_9 = ((list.List_1.F_cons_2) STATE_VARIABLE_Ts_0_2).F2;
                  V_16_16 = ((java.lang.Integer) (((pair.Pair_2) V_17_17).F1)).intValue();
                  V_18_18 = ((java.lang.Integer) (((pair.Pair_2) V_17_17).F2)).intValue();
                  succeeded = (C_4 == V_18_18);
//  xml.m:177
                  if (succeeded)
//  xml.m:178
                    {
                      /* direct tailcall eliminated */
                      {
                        list.List_1 HeadVar__1__tmp_copy_1 = Cs_5;
                        list.List_1 STATE_VARIABLE_Ts_0__tmp_copy_2 = STATE_VARIABLE_Ts_9_9;

                        STATE_VARIABLE_Ts_0_2 = STATE_VARIABLE_Ts_0__tmp_copy_2;
                        HeadVar__1_1 = HeadVar__1__tmp_copy_1;
                      }
                      continue;
                    }
//  xml.m:160
                }
//  xml.m:177
            }
return new java.lang.Object[] {
            java.lang.Boolean.valueOf(succeeded),
            ((java.lang.Object) (STATE_VARIABLE_Ts_3))
          };
        }
      }
//  xml.m:176
  }
//  xml.m:146
  private static java.lang.Object [] get_tokens_7_p_0(
    io.Input_stream_0 S_1,
    io.Result_1 HeadVar__2_2,
    int HeadVar__3_3)
  {
//  xml.m:148
    {
      boolean succeeded = false;
      int N_4 = 0;
      list.List_1 HeadVar__5_5 = null;

      switch (HeadVar__2_2.data_tag) {
        case 0:
//  xml.m:154
          {
            N_4 = HeadVar__3_3;
            HeadVar__5_5 = (list.List_1) xml.MR_scalar_common_2[0];
          }
//  xml.m:148
          break;
        case 1:
          {
            int C_9 = ((java.lang.Integer) (((io.Result_1.Ok_1) HeadVar__2_2).F1)).intValue();
            int N1_14 = 0;
            list.List_1 Tokens0_15 = null;
            pair.Pair_2 V_20_20 = null;
            io.Result_1 Res_39 = null;

//  xml.m:149
            succeeded = (C_9 == (10));
//  xml.m:151
            if (succeeded)
//  xml.m:150
              {
                int V_18_18 = 1;

                N1_14 = (HeadVar__3_3 + V_18_18);
              }
//  xml.m:151
            else
              N1_14 = HeadVar__3_3;
//  xml.m:141
            {
              Res_39 = io.read_char_4_p_0(S_1);
            }
//  xml.m:142
            {
              java.lang.Object [] result = xml.get_tokens_7_p_0(S_1, Res_39, N1_14);
              N_4 = ((java.lang.Integer) result[0]).intValue();
              Tokens0_15 = (list.List_1) result[1];
            }
//  xml.m:153
            {
              V_20_20 = new pair.Pair_2(java.lang.Integer.valueOf(HeadVar__3_3), java.lang.Integer.valueOf(C_9));
            }
            {
              HeadVar__5_5 = new list.List_1.F_cons_2(((java.lang.Object) (V_20_20)), Tokens0_15);
            }
//  xml.m:148
          }
          break;
        case 2:
//  xml.m:155
          {
            N_4 = HeadVar__3_3;
            HeadVar__5_5 = (list.List_1) xml.MR_scalar_common_2[0];
          }
//  xml.m:148
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
return new java.lang.Object[] {
        java.lang.Integer.valueOf(N_4),
        ((java.lang.Object) (HeadVar__5_5))
      };
    }
//  xml.m:146
  }
//  xml.m:121
  private static list.List_1 char_list_tokens_4_p_0(
    list.List_1 HeadVar__1_1,
    int N0_2,
    list.List_1 HeadVar__3_3)
  {
//  xml.m:123
    while (true)
      {
        /* tailcall optimized into a loop */
        {
          boolean succeeded = false;
          list.List_1 Ts_4 = null;

          if ((HeadVar__1_1.data_tag == 0))
//  xml.m:128
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_17_17 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[1]);

//  xml.m:129
              {
                Ts_4 = list.reverse_2_p_0(TypeInfo_17_17, HeadVar__3_3);
              }
//  xml.m:128
            }
//  xml.m:123
          else
            {
              int C_5 = ((java.lang.Integer) (((list.List_1.F_cons_2) HeadVar__1_1).F1)).intValue();
              list.List_1 Cs_6 = ((list.List_1.F_cons_2) HeadVar__1_1).F2;
              int N1_10 = 0;
              list.List_1 V_12_12 = null;
              pair.Pair_2 V_13_13 = null;

//  xml.m:124
              succeeded = (C_5 == (10));
//  xml.m:126
              if (succeeded)
//  xml.m:125
                {
                  int V_11_11 = 1;

                  N1_10 = (N0_2 + V_11_11);
                }
//  xml.m:126
              else
                N1_10 = N0_2;
//  xml.m:127
              {
                V_13_13 = new pair.Pair_2(java.lang.Integer.valueOf(N0_2), java.lang.Integer.valueOf(C_5));
              }
              {
                V_12_12 = new list.List_1.F_cons_2(((java.lang.Object) (V_13_13)), HeadVar__3_3);
              }
              /* direct tailcall eliminated */
              {
                list.List_1 HeadVar__1__tmp_copy_1 = Cs_6;
                int N0__tmp_copy_2 = N1_10;
                list.List_1 HeadVar__3__tmp_copy_3 = V_12_12;

                HeadVar__3_3 = HeadVar__3__tmp_copy_3;
                N0_2 = N0__tmp_copy_2;
                HeadVar__1_1 = HeadVar__1__tmp_copy_1;
              }
              continue;
//  xml.m:123
            }
          return Ts_4;
        }
      }
//  xml.m:121
  }
//  xml.m:74
  public static java.lang.String error_string_2_p_0(
    xml.Error_0 HeadVar__1_1)
  {
//  xml.m:892
    {
      boolean succeeded = false;
      java.lang.String HeadVar__2_2 = null;

      switch (HeadVar__1_1.data_tag) {
        case 0:
          HeadVar__2_2 = "unexpected end of file";
          break;
        case 1:
//  xml.m:893
          {
            java.lang.String S_3 = ((xml.Error_0.Expected_1) HeadVar__1_1).F1;
            java.lang.String V_94_94 = "expected ";

            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_94_94, S_3);
            }
          }
//  xml.m:892
          break;
        case 2:
//  xml.m:895
          {
            java.lang.String S_9 = ((xml.Error_0.Ebf_at_3) HeadVar__1_1).F1;
            int C_10 = ((xml.Error_0.Ebf_at_3) HeadVar__1_1).F2;
            int N_11 = ((xml.Error_0.Ebf_at_3) HeadVar__1_1).F3;
            java.lang.String V_13_13 = "expected %s but found \140%c\' at line %i";
            list.List_1 V_14_14 = null;
            string.Poly_type_0 V_15_15 = null;
            list.List_1 V_16_16 = null;
            string.Poly_type_0 V_17_17 = null;
            list.List_1 V_18_18 = null;
            string.Poly_type_0 V_19_19 = null;
            list.List_1 V_20_20 = null;

//  xml.m:896
            {
              V_15_15 = new string.Poly_type_0.S_1(S_9);
            }
            {
              V_17_17 = new string.Poly_type_0.C_1(C_10);
            }
            {
              V_19_19 = new string.Poly_type_0.I_1(N_11);
            }
            V_20_20 = (list.List_1) xml.MR_scalar_common_2[0];
            {
              V_18_18 = new list.List_1.F_cons_2(((java.lang.Object) (V_19_19)), V_20_20);
            }
            {
              V_16_16 = new list.List_1.F_cons_2(((java.lang.Object) (V_17_17)), V_18_18);
            }
            {
              V_14_14 = new list.List_1.F_cons_2(((java.lang.Object) (V_15_15)), V_16_16);
            }
            {
              HeadVar__2_2 = string.format_3_p_0(V_13_13, V_14_14);
            }
//  xml.m:895
          }
//  xml.m:892
          break;
        case 3:
//  xml.m:897
          {
            int C_21 = ((xml.Error_0.Unexpected_char_at_2) HeadVar__1_1).F1;
            int N_22 = ((xml.Error_0.Unexpected_char_at_2) HeadVar__1_1).F2;
            java.lang.String V_24_24 = "unexpected char \140%c\' at line %i";
            list.List_1 V_25_25 = null;
            string.Poly_type_0 V_26_26 = null;
            list.List_1 V_27_27 = null;
            string.Poly_type_0 V_28_28 = null;
            list.List_1 V_29_29 = null;

//  xml.m:898
            {
              V_26_26 = new string.Poly_type_0.C_1(C_21);
            }
            {
              V_28_28 = new string.Poly_type_0.I_1(N_22);
            }
            V_29_29 = (list.List_1) xml.MR_scalar_common_2[0];
            {
              V_27_27 = new list.List_1.F_cons_2(((java.lang.Object) (V_28_28)), V_29_29);
            }
            {
              V_25_25 = new list.List_1.F_cons_2(((java.lang.Object) (V_26_26)), V_27_27);
            }
            {
              HeadVar__2_2 = string.format_3_p_0(V_24_24, V_25_25);
            }
//  xml.m:897
          }
//  xml.m:892
          break;
        case 4:
//  xml.m:899
          {
            java.lang.String Type_30 = ((xml.Error_0.Unexpected_name_2) HeadVar__1_1).F1;
            java.lang.String S_31 = ((xml.Error_0.Unexpected_name_2) HeadVar__1_1).F2;
            java.lang.String V_115_115 = "\'";
            java.lang.String V_116_116 = null;
            java.lang.String V_117_117 = null;
            java.lang.String V_118_118 = null;
            java.lang.String V_119_119 = null;
            java.lang.String V_120_120 = null;

            {
              V_116_116 = string.f_43_43_2_f_0(S_31, V_115_115);
            }
            V_117_117 = " \140";
            {
              V_118_118 = string.f_43_43_2_f_0(V_117_117, V_116_116);
            }
            {
              V_119_119 = string.f_43_43_2_f_0(Type_30, V_118_118);
            }
            V_120_120 = "unexpected ";
            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_120_120, V_119_119);
            }
          }
//  xml.m:892
          break;
        case 5:
//  xml.m:901
          {
            java.lang.String Obj_39 = ((xml.Error_0.Unexpected_in_name_3) HeadVar__1_1).F1;
            java.lang.String Type_40 = ((xml.Error_0.Unexpected_in_name_3) HeadVar__1_1).F2;
            java.lang.String S_41 = ((xml.Error_0.Unexpected_in_name_3) HeadVar__1_1).F3;
            java.lang.String V_106_106 = "\'";
            java.lang.String V_107_107 = null;
            java.lang.String V_108_108 = null;
            java.lang.String V_109_109 = null;
            java.lang.String V_110_110 = null;
            java.lang.String V_111_111 = null;
            java.lang.String V_112_112 = null;
            java.lang.String V_113_113 = null;
            java.lang.String V_114_114 = null;

            {
              V_107_107 = string.f_43_43_2_f_0(S_41, V_106_106);
            }
            V_108_108 = " \140";
            {
              V_109_109 = string.f_43_43_2_f_0(V_108_108, V_107_107);
            }
            {
              V_110_110 = string.f_43_43_2_f_0(Type_40, V_109_109);
            }
            V_111_111 = " in ";
            {
              V_112_112 = string.f_43_43_2_f_0(V_111_111, V_110_110);
            }
            {
              V_113_113 = string.f_43_43_2_f_0(Obj_39, V_112_112);
            }
            V_114_114 = "unexpected ";
            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_114_114, V_113_113);
            }
          }
//  xml.m:892
          break;
        case 6:
//  xml.m:903
          {
            java.lang.String S_51 = ((xml.Error_0.Dangling_1) HeadVar__1_1).F1;
            java.lang.String V_87_87 = "dangling ";

            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_87_87, S_51);
            }
          }
//  xml.m:892
          break;
        case 7:
//  xml.m:905
          {
            java.lang.String Type_57 = ((xml.Error_0.Dangling_name_2) HeadVar__1_1).F1;
            java.lang.String S_58 = ((xml.Error_0.Dangling_name_2) HeadVar__1_1).F2;
            java.lang.String V_88_88 = "\'";
            java.lang.String V_89_89 = null;
            java.lang.String V_90_90 = null;
            java.lang.String V_91_91 = null;
            java.lang.String V_92_92 = null;
            java.lang.String V_93_93 = null;

            {
              V_89_89 = string.f_43_43_2_f_0(S_58, V_88_88);
            }
            V_90_90 = " \140";
            {
              V_91_91 = string.f_43_43_2_f_0(V_90_90, V_89_89);
            }
            {
              V_92_92 = string.f_43_43_2_f_0(Type_57, V_91_91);
            }
            V_93_93 = "dangling ";
            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_93_93, V_92_92);
            }
          }
//  xml.m:892
          break;
        case 8:
//  xml.m:907
          {
            java.lang.String S1_66 = ((xml.Error_0.Unbalanced_tags_2) HeadVar__1_1).F1;
            java.lang.String S2_67 = ((xml.Error_0.Unbalanced_tags_2) HeadVar__1_1).F2;
            java.lang.String V_100_100 = "\'";
            java.lang.String V_101_101 = null;
            java.lang.String V_102_102 = null;
            java.lang.String V_103_103 = null;
            java.lang.String V_104_104 = null;
            java.lang.String V_105_105 = null;

            {
              V_101_101 = string.f_43_43_2_f_0(S2_67, V_100_100);
            }
            V_102_102 = "\' \140";
            {
              V_103_103 = string.f_43_43_2_f_0(V_102_102, V_101_101);
            }
            {
              V_104_104 = string.f_43_43_2_f_0(S1_66, V_103_103);
            }
            V_105_105 = "unbalanced tags \140";
            {
              HeadVar__2_2 = string.f_43_43_2_f_0(V_105_105, V_104_104);
            }
          }
//  xml.m:892
          break;
        case 9:
//  xml.m:909
          {
            java.lang.String Obj_75 = ((xml.Error_0.Spec_3) HeadVar__1_1).F1;
            java.lang.String Name_76 = ((xml.Error_0.Spec_3) HeadVar__1_1).F2;
            java.lang.String Problem_77 = ((xml.Error_0.Spec_3) HeadVar__1_1).F3;
            java.lang.String V_95_95 = " ";
            java.lang.String V_96_96 = null;
            java.lang.String V_97_97 = null;
            java.lang.String V_98_98 = null;
            java.lang.String V_99_99 = null;

            {
              V_96_96 = string.f_43_43_2_f_0(V_95_95, Problem_77);
            }
            {
              V_97_97 = string.f_43_43_2_f_0(Name_76, V_96_96);
            }
            V_98_98 = " ";
            {
              V_99_99 = string.f_43_43_2_f_0(V_98_98, V_97_97);
            }
            {
              HeadVar__2_2 = string.f_43_43_2_f_0(Obj_75, V_99_99);
            }
          }
//  xml.m:892
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
      return HeadVar__2_2;
    }
//  xml.m:74
  }
//  xml.m:71
  public static void dump_tree_3_p_0(
    list.List_1 Es_4)
  {
//  xml.m:731
    {
      boolean succeeded = false;
      int V_8_8 = 0;

//  xml.m:732
      {
        xml.dump_tree_4_p_0(Es_4, V_8_8);
      }
//  xml.m:731
    }
//  xml.m:71
  }
//  xml.m:729
  private static java.lang.Object dump_stream_3_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;

      {
        xml.dump_stream_item_3_p_0(((pair.Pair_2) wrapper_arg_1));
      }
      return wrapper_arg_3;
    }
  }
//  xml.m:68
  public static void dump_stream_3_p_0(
    list.List_1 Stream_4)
  {
//  xml.m:728
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_13_13 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[0]);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_14_14 = jmercury.runtime.TypeInfo_Struct.maybe_new(io.io__type_ctor_info_state_0);
      /* closure */ java.lang.Object[] V_8_8 = (/* closure */ java.lang.Object[]) xml.MR_scalar_common_5[2];
//  xml.m:729
      java.lang.Object conv0_STATE_VARIABLE_IO_7 = null;

      {
        conv0_STATE_VARIABLE_IO_7 = list.foldl_4_p_2(TypeInfo_13_13, TypeCtorInfo_14_14, V_8_8, Stream_4, ((java.lang.Object) (0)));
      }
//  xml.m:728
    }
//  xml.m:68
  }
//  xml.m:65
  public static java.lang.Object [] spec2str_3_p_0(
    xml.Spec_0 HeadVar__1_1)
  {
//  xml.m:818
    {
      boolean succeeded = false;
      java.lang.String HeadVar__2_2 = null;
      int HeadVar__3_3 = 0;

      switch (HeadVar__1_1.data_tag) {
        case 0:
//  xml.m:828
          {
            HeadVar__2_2 = "";
            HeadVar__3_3 = 0;
          }
//  xml.m:818
          break;
        case 1:
//  xml.m:831
          {
            HeadVar__2_2 = ((xml.Spec_0.Cdata_1) HeadVar__1_1).F1;
            {
              HeadVar__3_3 = string.length_1_f_0(HeadVar__2_2);
            }
          }
//  xml.m:818
          break;
        case 2:
//  xml.m:829
          {
            HeadVar__2_2 = "";
            HeadVar__3_3 = 0;
          }
//  xml.m:818
          break;
        case 3:
//  xml.m:830
          {
            HeadVar__2_2 = "";
            HeadVar__3_3 = 0;
          }
//  xml.m:818
          break;
        case 4:
          {
            xml.Ref_0 V_40_40 = ((xml.Spec_0.Ref_1) HeadVar__1_1).F1;

            switch (V_40_40.data_tag) {
              case 0:
                {
                  HeadVar__2_2 = "&";
                  HeadVar__3_3 = 1;
                }
                break;
              case 1:
//  xml.m:819
                {
                  HeadVar__2_2 = "<";
                  HeadVar__3_3 = 1;
                }
//  xml.m:818
                break;
              case 2:
//  xml.m:820
                {
                  HeadVar__2_2 = ">";
                  HeadVar__3_3 = 1;
                }
//  xml.m:818
                break;
              case 3:
//  xml.m:821
                {
                  HeadVar__2_2 = "\'";
                  HeadVar__3_3 = 1;
                }
//  xml.m:818
                break;
              case 4:
//  xml.m:822
                {
                  HeadVar__2_2 = "\"";
                  HeadVar__3_3 = 1;
                }
//  xml.m:818
                break;
              case 5:
//  xml.m:823
                {
                  int Num_9 = ((xml.Ref_0.Dec_1) V_40_40).F1;
                  java.lang.String Str_10 = null;
                  java.lang.String V_12_12 = "[";
                  java.lang.String V_13_13 = null;
                  java.lang.String V_14_14 = "]";
                  int V_15_15 = 0;
                  int V_16_16 = 2;

//  xml.m:824
                  {
                    Str_10 = string.int_to_string_2_p_0(Num_9);
                  }
//  xml.m:823
                  {
                    V_13_13 = string.f_43_43_2_f_0(Str_10, V_14_14);
                  }
                  {
                    HeadVar__2_2 = string.f_43_43_2_f_0(V_12_12, V_13_13);
                  }
                  {
                    V_15_15 = string.length_1_f_0(Str_10);
                  }
                  HeadVar__3_3 = (V_15_15 + V_16_16);
                }
//  xml.m:818
                break;
              case 6:
//  xml.m:825
                {
                  int Num_17 = ((xml.Ref_0.Hex_1) V_40_40).F1;
                  java.lang.String Str_18 = null;
                  java.lang.String V_20_20 = "[";
                  java.lang.String V_21_21 = null;
                  java.lang.String V_22_22 = "]";
                  int V_23_23 = 0;
                  int V_24_24 = 2;
                  int V_25_25 = 16;

//  xml.m:826
                  {
                    Str_18 = string.int_to_base_string_3_p_0(Num_17, V_25_25);
                  }
//  xml.m:825
                  {
                    V_21_21 = string.f_43_43_2_f_0(Str_18, V_22_22);
                  }
                  {
                    HeadVar__2_2 = string.f_43_43_2_f_0(V_20_20, V_21_21);
                  }
                  {
                    V_23_23 = string.length_1_f_0(Str_18);
                  }
                  HeadVar__3_3 = (V_23_23 + V_24_24);
                }
//  xml.m:818
                break;
              case 7:
//  xml.m:827
                {
                  java.lang.String Str_26 = ((xml.Ref_0.Def_1) V_40_40).F1;
                  java.lang.String V_28_28 = "[";
                  java.lang.String V_29_29 = null;
                  java.lang.String V_30_30 = "]";
                  int V_31_31 = 0;
                  int V_32_32 = 0;

                  {
                    V_29_29 = string.f_43_43_2_f_0(Str_26, V_30_30);
                  }
                  {
                    HeadVar__2_2 = string.f_43_43_2_f_0(V_28_28, V_29_29);
                  }
                  {
                    V_31_31 = string.length_1_f_0(Str_26);
                  }
                  V_32_32 = 2;
                  HeadVar__3_3 = (V_31_31 + V_32_32);
                }
//  xml.m:818
                break;
              default: /*NOTREACHED*/
                throw new jmercury.runtime.UnreachableDefault();
            }
          }
          break;
        case 5:
//  xml.m:832
          {
            HeadVar__2_2 = "";
            HeadVar__3_3 = 0;
          }
//  xml.m:818
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
return new java.lang.Object[] {
        ((java.lang.Object) (HeadVar__2_2)),
        java.lang.Integer.valueOf(HeadVar__3_3)
      };
    }
//  xml.m:65
  }
//  xml.m:63
  public static java.lang.Object [] item2str_3_p_0(
    pair.Pair_2 HeadVar__1_1)
  {
//  xml.m:811
    {
      boolean succeeded = false;
      java.lang.String HeadVar__2_2 = null;
      int HeadVar__3_3 = 0;
      xml.Stream_obj_0 V_22_22 = ((xml.Stream_obj_0) ((pair.Pair_2) HeadVar__1_1).F2);
      int V_23_23 = ((java.lang.Integer) (((pair.Pair_2) HeadVar__1_1).F1)).intValue();

      switch (V_22_22.data_tag) {
        case 0:
//  xml.m:816
          {
            HeadVar__2_2 = ((xml.Stream_obj_0.Text_1) V_22_22).F1;
            {
              HeadVar__3_3 = string.length_1_f_0(HeadVar__2_2);
            }
          }
//  xml.m:811
          break;
        case 1:
//  xml.m:814
          {
            xml.Spec_0 X_15 = ((xml.Stream_obj_0.Spec_1) V_22_22).F1;

//  xml.m:815
            {
              java.lang.Object [] result = xml.spec2str_3_p_0(X_15);
              HeadVar__2_2 = (java.lang.String) result[0];
              HeadVar__3_3 = ((java.lang.Integer) result[1]).intValue();
            }
//  xml.m:814
          }
//  xml.m:811
          break;
        case 2:
//  xml.m:813
          {
            HeadVar__2_2 = "";
            HeadVar__3_3 = 0;
          }
//  xml.m:811
          break;
        case 3:
          {
            HeadVar__2_2 = "";
            HeadVar__3_3 = 0;
          }
          break;
        case 4:
//  xml.m:812
          {
            HeadVar__2_2 = "";
            HeadVar__3_3 = 0;
          }
//  xml.m:811
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
return new java.lang.Object[] {
        ((java.lang.Object) (HeadVar__2_2)),
        java.lang.Integer.valueOf(HeadVar__3_3)
      };
    }
//  xml.m:63
  }
//  xml.m:808
  private static java.lang.Object stream2str_2_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      java.lang.String conv0_HeadVar__3_14 = null;

      {
        conv0_HeadVar__3_14 = xml.IntroducedFrom__pred__stream2str__808__1_3_p_0(((pair.Pair_2) wrapper_arg_1), ((java.lang.String) wrapper_arg_2));
      }
      wrapper_arg_3 = ((java.lang.Object) (conv0_HeadVar__3_14));
      return wrapper_arg_3;
    }
  }
//  xml.m:61
  public static java.lang.String stream2str_2_p_0(
    list.List_1 Is_3)
  {
//  xml.m:807
    {
      boolean succeeded = false;
      java.lang.String Str_4 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_18_18 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[0]);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_19_19 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
      /* closure */ java.lang.Object[] V_10_10 = (/* closure */ java.lang.Object[]) xml.MR_scalar_common_5[1];
      java.lang.String V_11_11 = "";
//  xml.m:808
      java.lang.Object conv1_Str_4 = null;

      {
        conv1_Str_4 = list.foldl_4_p_0(TypeInfo_18_18, TypeCtorInfo_19_19, V_10_10, Is_3, ((java.lang.Object) (V_11_11)));
      }
      Str_4 = ((java.lang.String) conv1_Str_4);
//  xml.m:807
      return Str_4;
    }
//  xml.m:61
  }
//  xml.m:59
  public static java.lang.String spec_to_string_2_p_0(
    xml.Spec_0 HeadVar__1_1)
  {
//  xml.m:834
    {
      boolean succeeded = false;
      java.lang.String S_2 = null;

      switch (HeadVar__1_1.data_tag) {
        case 0:
//  xml.m:845
          {
            java.lang.String S1_37 = ((xml.Spec_0.Empty_tag_2) HeadVar__1_1).F1;
            list.List_1 As_38 = ((xml.Spec_0.Empty_tag_2) HeadVar__1_1).F2;
            java.lang.String S2_40 = null;
            java.lang.String V_56_56 = null;
            java.lang.String V_57_57 = null;
            java.lang.String V_58_58 = null;
            java.lang.String V_59_59 = null;

//  xml.m:846
            {
              S2_40 = xml.attributes_to_string_2_p_0(As_38);
            }
            V_56_56 = "/>";
            {
              V_57_57 = string.f_43_43_2_f_0(S2_40, V_56_56);
            }
            {
              V_58_58 = string.f_43_43_2_f_0(S1_37, V_57_57);
            }
            V_59_59 = "<";
            {
              S_2 = string.f_43_43_2_f_0(V_59_59, V_58_58);
            }
//  xml.m:845
          }
//  xml.m:834
          break;
        case 1:
//  xml.m:841
          {
            java.lang.String S0_25 = ((xml.Spec_0.Cdata_1) HeadVar__1_1).F1;
            java.lang.String V_47_47 = "]]>";
            java.lang.String V_48_48 = null;
            java.lang.String V_49_49 = null;

            {
              V_48_48 = string.f_43_43_2_f_0(S0_25, V_47_47);
            }
            V_49_49 = "<![CDATA[";
            {
              S_2 = string.f_43_43_2_f_0(V_49_49, V_48_48);
            }
          }
//  xml.m:834
          break;
        case 2:
          {
            java.lang.String S0_3 = ((xml.Spec_0.Comment_1) HeadVar__1_1).F1;
            java.lang.String V_50_50 = "-->";
            java.lang.String V_51_51 = null;
            java.lang.String V_52_52 = null;

            {
              V_51_51 = string.f_43_43_2_f_0(S0_3, V_50_50);
            }
            V_52_52 = "<!--";
            {
              S_2 = string.f_43_43_2_f_0(V_52_52, V_51_51);
            }
          }
          break;
        case 3:
//  xml.m:839
          {
            java.lang.String S1_16 = ((xml.Spec_0.Procinstr_2) HeadVar__1_1).F1;
            java.lang.String S2_17 = ((xml.Spec_0.Procinstr_2) HeadVar__1_1).F2;
            java.lang.String V_60_60 = "?>";
            java.lang.String V_61_61 = null;
            java.lang.String V_62_62 = null;
            java.lang.String V_63_63 = null;
            java.lang.String V_64_64 = null;
            java.lang.String V_65_65 = null;

            {
              V_61_61 = string.f_43_43_2_f_0(S2_17, V_60_60);
            }
            V_62_62 = " ";
            {
              V_63_63 = string.f_43_43_2_f_0(V_62_62, V_61_61);
            }
            {
              V_64_64 = string.f_43_43_2_f_0(S1_16, V_63_63);
            }
            V_65_65 = "<?";
            {
              S_2 = string.f_43_43_2_f_0(V_65_65, V_64_64);
            }
          }
//  xml.m:834
          break;
        case 4:
//  xml.m:836
          {
            xml.Ref_0 E_9 = ((xml.Spec_0.Ref_1) HeadVar__1_1).F1;
            java.lang.String S0_11 = null;
            java.lang.String V_66_66 = null;
            java.lang.String V_67_67 = null;
            java.lang.String V_68_68 = null;

//  xml.m:837
            {
              S0_11 = xml.ref_to_string_2_p_0(E_9);
            }
            V_66_66 = ";";
            {
              V_67_67 = string.f_43_43_2_f_0(S0_11, V_66_66);
            }
            V_68_68 = "&";
            {
              S_2 = string.f_43_43_2_f_0(V_68_68, V_67_67);
            }
//  xml.m:836
          }
//  xml.m:834
          break;
        case 5:
//  xml.m:843
          {
            java.lang.String S0_31 = ((xml.Spec_0.Doctype_1) HeadVar__1_1).F1;
            java.lang.String V_53_53 = "]>";
            java.lang.String V_54_54 = null;
            java.lang.String V_55_55 = null;

            {
              V_54_54 = string.f_43_43_2_f_0(S0_31, V_53_53);
            }
            V_55_55 = "<![DOCTYPE";
            {
              S_2 = string.f_43_43_2_f_0(V_55_55, V_54_54);
            }
          }
//  xml.m:834
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
      return S_2;
    }
//  xml.m:59
  }
//  xml.m:725
  private static java.lang.Object to_string_2_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      java.lang.String conv0_S_2 = null;

      {
        conv0_S_2 = xml.item_to_string_2_p_0(((pair.Pair_2) wrapper_arg_1));
      }
      wrapper_arg_2 = ((java.lang.Object) (conv0_S_2));
      return wrapper_arg_2;
    }
  }
//  xml.m:56
  public static java.lang.String to_string_2_p_0(
    list.List_1 Stream_3)
  {
//  xml.m:724
    {
      boolean succeeded = false;
      java.lang.String String_4 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_9_9 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[0]);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_10_10 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
      list.List_1 StringList_5 = null;
      /* closure */ java.lang.Object[] V_6_6 = (/* closure */ java.lang.Object[]) xml.MR_scalar_common_5[0];

//  xml.m:725
      {
        StringList_5 = list.map_3_p_0(TypeInfo_9_9, TypeCtorInfo_10_10, V_6_6, Stream_3);
      }
//  xml.m:726
      {
        String_4 = string.append_list_2_p_0(StringList_5);
      }
//  xml.m:724
      return String_4;
    }
//  xml.m:56
  }
//  xml.m:715
  private static java.lang.Object write_4_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;

      {
        xml.write_item_4_p_0(((io.Output_stream_0) ((java.lang.Object[]) closure)[3]), ((pair.Pair_2) wrapper_arg_1));
      }
      return wrapper_arg_3;
    }
  }
//  xml.m:53
  public static void write_4_p_0(
    io.Output_stream_0 S_5,
    list.List_1 Stream_6)
  {
//  xml.m:714
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_15_15 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_16_16 = null;
      /* closure */ java.lang.Object[] V_10_10 = null;
//  xml.m:715
      java.lang.Object conv0_STATE_VARIABLE_IO_9 = null;

      {
        V_10_10 = new /* closure */ java.lang.Object[] {((java.lang.Object) (xml.MR_scalar_common_3[0])), ((java.lang.Object) (new AddrOf3_0(2))), java.lang.Integer.valueOf(1), ((java.lang.Object) (S_5))};
      }
      TypeInfo_15_15 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.MR_scalar_common_1[0]);
      TypeCtorInfo_16_16 = jmercury.runtime.TypeInfo_Struct.maybe_new(io.io__type_ctor_info_state_0);
      {
        conv0_STATE_VARIABLE_IO_9 = list.foldl_4_p_2(TypeInfo_15_15, TypeCtorInfo_16_16, V_10_10, Stream_6, ((java.lang.Object) (0)));
      }
//  xml.m:714
    }
//  xml.m:53
  }
//  xml.m:50
  public static boolean valid_1_p_0(
    list.List_1 HeadVar__1_2)
  {
//  xml.m:712
    {
      boolean succeeded = true;

      return succeeded;
    }
//  xml.m:50
  }
//  xml.m:47
  public static list.List_1 tree_to_stream_2_p_0(
    list.List_1 HeadVar__1_1)
  {
//  xml.m:695
    {
      boolean succeeded = false;
      list.List_1 HeadVar__2_2 = null;

      if ((HeadVar__1_1.data_tag == 0))
//  xml.m:697
        HeadVar__2_2 = (list.List_1) xml.MR_scalar_common_2[0];
//  xml.m:695
      else
        {
          pair.Pair_2 N_3 = ((pair.Pair_2) ((list.List_1.F_cons_2) HeadVar__1_1).F1);
          list.List_1 Ns_4 = ((list.List_1.F_cons_2) HeadVar__1_1).F2;

//  xml.m:696
          {
            HeadVar__2_2 = xml.tree_to_stream_3_p_0(N_3, Ns_4);
          }
//  xml.m:695
        }
      return HeadVar__2_2;
    }
//  xml.m:47
  }
//  xml.m:45
  public static java.lang.Object [] html_stream_to_tree_4_p_0(
    java.lang.String File_5,
    list.List_1 Stream_6)
  {
//  xml.m:559
    {
      boolean succeeded = false;
      list.List_1 Errors_7 = null;
      list.List_1 Tree_8 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.xml__type_ctor_info_error_0);
      list.List_1 Errors0_9 = null;
      list.List_1 V_10_10 = null;
      list.List_1 V_11_11 = null;

//  xml.m:560
      {
        Errors0_9 = errors.new_messages_1_p_0(TypeCtorInfo_12_12);
      }
//  xml.m:561
      V_10_10 = (list.List_1) xml.MR_scalar_common_2[0];
      V_11_11 = (list.List_1) xml.MR_scalar_common_2[0];
      {
        java.lang.Object [] result = xml.html_stream_to_tree_7_p_0(File_5, Stream_6, V_10_10, V_11_11, Errors0_9);
        Errors_7 = (list.List_1) result[0];
        Tree_8 = (list.List_1) result[1];
      }
//  xml.m:559
return new java.lang.Object[] {
        ((java.lang.Object) (Errors_7)),
        ((java.lang.Object) (Tree_8))
      };
    }
//  xml.m:45
  }
//  xml.m:42
  public static java.lang.Object [] stream_to_tree_4_p_0(
    java.lang.String File_5,
    list.List_1 Stream_6)
  {
//  xml.m:521
    {
      boolean succeeded = false;
      list.List_1 Errors_7 = null;
      list.List_1 Tree_8 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(xml.xml__type_ctor_info_error_0);
      list.List_1 Errors0_9 = null;
      list.List_1 V_10_10 = null;
      list.List_1 V_11_11 = null;

//  xml.m:522
      {
        Errors0_9 = errors.new_messages_1_p_0(TypeCtorInfo_12_12);
      }
//  xml.m:523
      V_10_10 = (list.List_1) xml.MR_scalar_common_2[0];
      V_11_11 = (list.List_1) xml.MR_scalar_common_2[0];
      {
        java.lang.Object [] result = xml.stream_to_tree_7_p_0(File_5, Stream_6, V_10_10, V_11_11, Errors0_9);
        Errors_7 = (list.List_1) result[0];
        Tree_8 = (list.List_1) result[1];
      }
//  xml.m:521
return new java.lang.Object[] {
        ((java.lang.Object) (Errors_7)),
        ((java.lang.Object) (Tree_8))
      };
    }
//  xml.m:42
  }
//  xml.m:39
  public static java.lang.Object [] from_string_4_p_0(
    java.lang.String File_5,
    java.lang.String String_6)
  {
//  xml.m:103
    {
      boolean succeeded = false;
      list.List_1 Errors_7 = null;
      list.List_1 Stream_8 = null;
      list.List_1 Tokens_9 = null;
      list.List_1 CharList_12 = null;
      int V_15_15 = 0;
      list.List_1 V_16_16 = null;

//  xml.m:111
      {
        CharList_12 = string.to_char_list_2_p_0(String_6);
      }
//  xml.m:118
      V_15_15 = 1;
      V_16_16 = (list.List_1) xml.MR_scalar_common_2[0];
      {
        Tokens_9 = xml.char_list_tokens_4_p_0(CharList_12, V_15_15, V_16_16);
      }
//  xml.m:105
      {
        java.lang.Object [] result = xml.tokens_to_stream_4_p_0(File_5, Tokens_9);
        Errors_7 = (list.List_1) result[0];
        Stream_8 = (list.List_1) result[1];
      }
//  xml.m:103
return new java.lang.Object[] {
        ((java.lang.Object) (Errors_7)),
        ((java.lang.Object) (Stream_8))
      };
    }
//  xml.m:39
  }
//  xml.m:36
  public static java.lang.Object [] read_6_p_0(
    java.lang.String File_7,
    io.Input_stream_0 S_8)
  {
//  xml.m:99
    {
      boolean succeeded = false;
      list.List_1 Stream_9 = null;
      list.List_1 Errors_10 = null;
      list.List_1 Tokens_12 = null;
      int V_22_22 = 1;
      io.Result_1 Res_31 = null;
//  xml.m:142
      int V_21_21 = 0;

//  xml.m:141
      {
        Res_31 = io.read_char_4_p_0(S_8);
      }
//  xml.m:142
      {
        java.lang.Object [] result = xml.get_tokens_7_p_0(S_8, Res_31, V_22_22);
        V_21_21 = ((java.lang.Integer) result[0]).intValue();
        Tokens_12 = (list.List_1) result[1];
      }
//  xml.m:101
      {
        java.lang.Object [] result = xml.tokens_to_stream_4_p_0(File_7, Tokens_12);
        Errors_10 = (list.List_1) result[0];
        Stream_9 = (list.List_1) result[1];
      }
//  xml.m:99
return new java.lang.Object[] {
        ((java.lang.Object) (Stream_9)),
        ((java.lang.Object) (Errors_10))
      };
    }
//  xml.m:36
  }
//  xml.m:33
  public static java.lang.Object [] read_4_p_0()
  {
//  xml.m:95
    {
      boolean succeeded = false;
      list.List_1 Stream_5 = null;
      list.List_1 Errors_6 = null;
      list.List_1 Tokens_8 = null;
      io.Input_stream_0 V_11_11 = null;
      java.lang.String V_13_13 = null;
      int V_20_20 = 0;
      io.Result_1 Res_29 = null;
//  xml.m:142
      int V_19_19 = 0;

//  xml.m:96
      {
        V_11_11 = io.stdin_stream_0_f_0();
      }
//  xml.m:135
      V_20_20 = 1;
//  xml.m:141
      {
        Res_29 = io.read_char_4_p_0(V_11_11);
      }
//  xml.m:142
      {
        java.lang.Object [] result = xml.get_tokens_7_p_0(V_11_11, Res_29, V_20_20);
        V_19_19 = ((java.lang.Integer) result[0]).intValue();
        Tokens_8 = (list.List_1) result[1];
      }
//  xml.m:97
      V_13_13 = "(stdin)";
      {
        java.lang.Object [] result = xml.tokens_to_stream_4_p_0(V_13_13, Tokens_8);
        Errors_6 = (list.List_1) result[0];
        Stream_5 = (list.List_1) result[1];
      }
//  xml.m:95
return new java.lang.Object[] {
        ((java.lang.Object) (Stream_5)),
        ((java.lang.Object) (Errors_6))
      };
    }
//  xml.m:33
  }
//  xml.m:30
  public static java.lang.String version_1_p_0()
  {
//  xml.m:93
    {
      boolean succeeded = false;
      java.lang.String HeadVar__1_1 = "1.4";

      return HeadVar__1_1;
    }
//  xml.m:30
  }

// ExportDefns

// ExportedEnums

// InitPreds

// FinalPreds

// EnvVarNames
  static {
    if (System.getenv("MERCURY_DEBUG_CLASS_INIT") != null) {
      System.out.println("[xml end init]");
    }
  }
}
// :- end_module xml.
