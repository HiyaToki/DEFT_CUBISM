//
//
// Automatically generated from errors.m by the Mercury Compiler,
// version 14.01.1, configured for x86_64-unknown-linux-gnu
//
//

/* :- module errors. */

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
// import require;
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
public class errors {
  static {
    if (System.getenv("MERCURY_DEBUG_CLASS_INIT") != null) {
      System.out.println("[errors start init]");
    }
  }

// RttiDefns
  private static final jmercury.runtime.TypeInfo_Struct __vpti_pred_2__pseudo_1__plain_builtin__type_ctor_info_string_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct errors__pti_message_1__pseudo_1 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__pti_pair_2__plain_errors__type_ctor_info_err_loc_0__pseudo_errors__pti_message_1__pseudo_1 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.DuFunctorDesc errors__du_functor_desc_err_loc_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] errors__field_types_err_loc_0_1 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc errors__du_functor_desc_err_loc_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] errors__field_types_err_loc_0_2 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc errors__du_functor_desc_err_loc_0_2 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] errors__du_stag_ordered_err_loc_0_0 = new jmercury.runtime.DuFunctorDesc[3];
  private static final jmercury.runtime.DuPtagLayout[] errors__du_ptag_ordered_err_loc_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] errors__du_name_ordered_err_loc_0 = new jmercury.runtime.DuFunctorDesc[3];
  private static final int[] errors__functor_number_map_err_loc_0 = new int[3];
  public static final jmercury.runtime.TypeCtorInfo_Struct errors__type_ctor_info_err_loc_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] errors__field_types_message_1_0 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc errors__du_functor_desc_message_1_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] errors__du_stag_ordered_message_1_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] errors__du_ptag_ordered_message_1 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] errors__du_name_ordered_message_1 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] errors__functor_number_map_message_1 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct errors__type_ctor_info_message_1 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__pti_list_1__pseudo_pair__pti_pair_2__plain_errors__type_ctor_info_err_loc_0__pseudo_errors__pti_message_1__pseudo_1 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct errors__type_ctor_info_messages_1 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc errors__enum_functor_desc_msg_type_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc errors__enum_functor_desc_msg_type_0_1 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc errors__enum_functor_desc_msg_type_0_2 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] errors__enum_value_ordered_msg_type_0 = new jmercury.runtime.EnumFunctorDesc[3];
  private static final jmercury.runtime.EnumFunctorDesc[] errors__enum_name_ordered_msg_type_0 = new jmercury.runtime.EnumFunctorDesc[3];
  private static final int[] errors__functor_number_map_msg_type_0 = new int[3];
  public static final jmercury.runtime.TypeCtorInfo_Struct errors__type_ctor_info_msg_type_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] errors__field_types_res_4_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc errors__du_functor_desc_res_4_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] errors__field_types_res_4_1 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc errors__du_functor_desc_res_4_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] errors__du_stag_ordered_res_4_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final jmercury.runtime.DuPtagLayout[] errors__du_ptag_ordered_res_4 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] errors__du_name_ordered_res_4 = new jmercury.runtime.DuFunctorDesc[2];
  private static final int[] errors__functor_number_map_res_4 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct errors__type_ctor_info_res_4 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] errors__field_types_res_3_0 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc errors__du_functor_desc_res_3_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] errors__field_types_res_3_1 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc errors__du_functor_desc_res_3_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] errors__du_stag_ordered_res_3_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final jmercury.runtime.DuPtagLayout[] errors__du_ptag_ordered_res_3 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] errors__du_name_ordered_res_3 = new jmercury.runtime.DuFunctorDesc[2];
  private static final int[] errors__functor_number_map_res_3 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct errors__type_ctor_info_res_3 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] errors__field_types_res_2_0 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc errors__du_functor_desc_res_2_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] errors__field_types_res_2_1 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc errors__du_functor_desc_res_2_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] errors__du_stag_ordered_res_2_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final jmercury.runtime.DuPtagLayout[] errors__du_ptag_ordered_res_2 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] errors__du_name_ordered_res_2 = new jmercury.runtime.DuFunctorDesc[2];
  private static final int[] errors__functor_number_map_res_2 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct errors__type_ctor_info_res_2 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.DuFunctorDesc errors__du_functor_desc_res_1_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] errors__field_types_res_1_1 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc errors__du_functor_desc_res_1_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] errors__du_stag_ordered_res_1_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final jmercury.runtime.DuPtagLayout[] errors__du_ptag_ordered_res_1 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] errors__du_name_ordered_res_1 = new jmercury.runtime.DuFunctorDesc[2];
  private static final int[] errors__functor_number_map_res_1 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct errors__type_ctor_info_res_1 = new jmercury.runtime.TypeCtorInfo_Struct();
  static {
    //
    //
    //
    __vpti_pred_2__pseudo_1__plain_builtin__type_ctor_info_string_0.init(builtin.builtin__type_ctor_info_pred_0,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.PseudoTypeInfo.K1,
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0});
    //
    //
    errors__field_types_message_1_0[0] = (jmercury.runtime.PseudoTypeInfo) errors.errors__type_ctor_info_msg_type_0;
    errors__field_types_message_1_0[1] = jmercury.runtime.PseudoTypeInfo.K1;
    //
    errors__du_functor_desc_message_1_0.init("msg",
		2,
		2,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		errors.errors__field_types_message_1_0,
		null,
		null,
		null);
    //
    errors__du_stag_ordered_message_1_0[0] = errors.errors__du_functor_desc_message_1_0;
    //
    errors__du_ptag_ordered_message_1[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		errors.errors__du_stag_ordered_message_1_0);
    //
    errors__du_name_ordered_message_1[0] = errors.errors__du_functor_desc_message_1_0;
    //
    errors__functor_number_map_message_1[0] = 0;
    //
    errors__type_ctor_info_message_1.init(1,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf3_0(0))),
		((java.lang.Object) (new AddrOf3_0(1))),
		"errors",
		"message",
		new jmercury.runtime.TypeFunctors(errors.errors__du_name_ordered_message_1),
		new jmercury.runtime.TypeLayout(errors.errors__du_ptag_ordered_message_1),
		1,
		4,
		errors.errors__functor_number_map_message_1);
    //
    errors__pti_message_1__pseudo_1.init(errors.errors__type_ctor_info_message_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.PseudoTypeInfo.K1});
    //
    //
    //
    pair__pti_pair_2__plain_errors__type_ctor_info_err_loc_0__pseudo_errors__pti_message_1__pseudo_1.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) errors.errors__type_ctor_info_err_loc_0,
		(jmercury.runtime.PseudoTypeInfo) errors.errors__pti_message_1__pseudo_1});
    //
    errors__du_functor_desc_err_loc_0_0.init("none",
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
    errors__field_types_err_loc_0_1[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    errors__du_functor_desc_err_loc_0_1.init("file",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		errors.errors__field_types_err_loc_0_1,
		null,
		null,
		null);
    //
    //
    errors__field_types_err_loc_0_2[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    errors__field_types_err_loc_0_2[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    errors__du_functor_desc_err_loc_0_2.init("file",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		2,
		2,
		errors.errors__field_types_err_loc_0_2,
		null,
		null,
		null);
    //
    errors__du_stag_ordered_err_loc_0_0[0] = errors.errors__du_functor_desc_err_loc_0_0;
    errors__du_stag_ordered_err_loc_0_0[1] = errors.errors__du_functor_desc_err_loc_0_1;
    errors__du_stag_ordered_err_loc_0_0[2] = errors.errors__du_functor_desc_err_loc_0_2;
    //
    errors__du_ptag_ordered_err_loc_0[0] = new jmercury.runtime.DuPtagLayout(3,
		private_builtin.MR_SECTAG_REMOTE,
		errors.errors__du_stag_ordered_err_loc_0_0);
    //
    errors__du_name_ordered_err_loc_0[0] = errors.errors__du_functor_desc_err_loc_0_1;
    errors__du_name_ordered_err_loc_0[1] = errors.errors__du_functor_desc_err_loc_0_2;
    errors__du_name_ordered_err_loc_0[2] = errors.errors__du_functor_desc_err_loc_0_0;
    //
    errors__functor_number_map_err_loc_0[0] = 2;
    errors__functor_number_map_err_loc_0[1] = 0;
    errors__functor_number_map_err_loc_0[2] = 1;
    //
    errors__type_ctor_info_err_loc_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(0))),
		((java.lang.Object) (new AddrOf2_0(1))),
		"errors",
		"err_loc",
		new jmercury.runtime.TypeFunctors(errors.errors__du_name_ordered_err_loc_0),
		new jmercury.runtime.TypeLayout(errors.errors__du_ptag_ordered_err_loc_0),
		3,
		4,
		errors.errors__functor_number_map_err_loc_0);
    //
    //
    list__pti_list_1__pseudo_pair__pti_pair_2__plain_errors__type_ctor_info_err_loc_0__pseudo_errors__pti_message_1__pseudo_1.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) errors.pair__pti_pair_2__plain_errors__type_ctor_info_err_loc_0__pseudo_errors__pti_message_1__pseudo_1});
    //
    errors__type_ctor_info_messages_1.init(1,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV,
		((java.lang.Object) (new AddrOf3_0(2))),
		((java.lang.Object) (new AddrOf3_0(3))),
		"errors",
		"messages",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) errors.list__pti_list_1__pseudo_pair__pti_pair_2__plain_errors__type_ctor_info_err_loc_0__pseudo_errors__pti_message_1__pseudo_1),
		-1,
		0,
		null);
    //
    errors__enum_functor_desc_msg_type_0_0.init("error",
		0);
    //
    errors__enum_functor_desc_msg_type_0_1.init("warning",
		1);
    //
    errors__enum_functor_desc_msg_type_0_2.init("message",
		2);
    //
    errors__enum_value_ordered_msg_type_0[0] = errors.errors__enum_functor_desc_msg_type_0_0;
    errors__enum_value_ordered_msg_type_0[1] = errors.errors__enum_functor_desc_msg_type_0_1;
    errors__enum_value_ordered_msg_type_0[2] = errors.errors__enum_functor_desc_msg_type_0_2;
    //
    errors__enum_name_ordered_msg_type_0[0] = errors.errors__enum_functor_desc_msg_type_0_0;
    errors__enum_name_ordered_msg_type_0[1] = errors.errors__enum_functor_desc_msg_type_0_2;
    errors__enum_name_ordered_msg_type_0[2] = errors.errors__enum_functor_desc_msg_type_0_1;
    //
    errors__functor_number_map_msg_type_0[0] = 0;
    errors__functor_number_map_msg_type_0[1] = 2;
    errors__functor_number_map_msg_type_0[2] = 1;
    //
    errors__type_ctor_info_msg_type_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_ENUM,
		((java.lang.Object) (new AddrOf2_0(2))),
		((java.lang.Object) (new AddrOf2_0(3))),
		"errors",
		"msg_type",
		new jmercury.runtime.TypeFunctors(errors.errors__enum_name_ordered_msg_type_0),
		new jmercury.runtime.TypeLayout(errors.errors__enum_value_ordered_msg_type_0),
		3,
		4,
		errors.errors__functor_number_map_msg_type_0);
    //
    errors__field_types_res_4_0[0] = jmercury.runtime.PseudoTypeInfo.K1;
    errors__field_types_res_4_0[1] = jmercury.runtime.PseudoTypeInfo.K2;
    errors__field_types_res_4_0[2] = jmercury.runtime.PseudoTypeInfo.K3;
    //
    errors__du_functor_desc_res_4_0.init("ok",
		3,
		7,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		0,
		errors.errors__field_types_res_4_0,
		null,
		null,
		null);
    //
    errors__field_types_res_4_1[0] = jmercury.runtime.PseudoTypeInfo.K4;
    //
    errors__du_functor_desc_res_4_1.init("error",
		1,
		1,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		errors.errors__field_types_res_4_1,
		null,
		null,
		null);
    //
    errors__du_stag_ordered_res_4_0[0] = errors.errors__du_functor_desc_res_4_0;
    errors__du_stag_ordered_res_4_0[1] = errors.errors__du_functor_desc_res_4_1;
    //
    errors__du_ptag_ordered_res_4[0] = new jmercury.runtime.DuPtagLayout(2,
		private_builtin.MR_SECTAG_REMOTE,
		errors.errors__du_stag_ordered_res_4_0);
    //
    errors__du_name_ordered_res_4[0] = errors.errors__du_functor_desc_res_4_1;
    errors__du_name_ordered_res_4[1] = errors.errors__du_functor_desc_res_4_0;
    //
    errors__functor_number_map_res_4[0] = 1;
    errors__functor_number_map_res_4[1] = 0;
    //
    errors__type_ctor_info_res_4.init(4,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf6_0(0))),
		((java.lang.Object) (new AddrOf6_0(1))),
		"errors",
		"res",
		new jmercury.runtime.TypeFunctors(errors.errors__du_name_ordered_res_4),
		new jmercury.runtime.TypeLayout(errors.errors__du_ptag_ordered_res_4),
		2,
		4,
		errors.errors__functor_number_map_res_4);
    //
    errors__field_types_res_3_0[0] = jmercury.runtime.PseudoTypeInfo.K1;
    errors__field_types_res_3_0[1] = jmercury.runtime.PseudoTypeInfo.K2;
    //
    errors__du_functor_desc_res_3_0.init("ok",
		2,
		3,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		0,
		errors.errors__field_types_res_3_0,
		null,
		null,
		null);
    //
    errors__field_types_res_3_1[0] = jmercury.runtime.PseudoTypeInfo.K3;
    //
    errors__du_functor_desc_res_3_1.init("error",
		1,
		1,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		errors.errors__field_types_res_3_1,
		null,
		null,
		null);
    //
    errors__du_stag_ordered_res_3_0[0] = errors.errors__du_functor_desc_res_3_0;
    errors__du_stag_ordered_res_3_0[1] = errors.errors__du_functor_desc_res_3_1;
    //
    errors__du_ptag_ordered_res_3[0] = new jmercury.runtime.DuPtagLayout(2,
		private_builtin.MR_SECTAG_REMOTE,
		errors.errors__du_stag_ordered_res_3_0);
    //
    errors__du_name_ordered_res_3[0] = errors.errors__du_functor_desc_res_3_1;
    errors__du_name_ordered_res_3[1] = errors.errors__du_functor_desc_res_3_0;
    //
    errors__functor_number_map_res_3[0] = 1;
    errors__functor_number_map_res_3[1] = 0;
    //
    errors__type_ctor_info_res_3.init(3,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf5_0(0))),
		((java.lang.Object) (new AddrOf5_0(1))),
		"errors",
		"res",
		new jmercury.runtime.TypeFunctors(errors.errors__du_name_ordered_res_3),
		new jmercury.runtime.TypeLayout(errors.errors__du_ptag_ordered_res_3),
		2,
		4,
		errors.errors__functor_number_map_res_3);
    //
    errors__field_types_res_2_0[0] = jmercury.runtime.PseudoTypeInfo.K1;
    //
    errors__du_functor_desc_res_2_0.init("ok",
		1,
		1,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		0,
		errors.errors__field_types_res_2_0,
		null,
		null,
		null);
    //
    errors__field_types_res_2_1[0] = jmercury.runtime.PseudoTypeInfo.K2;
    //
    errors__du_functor_desc_res_2_1.init("error",
		1,
		1,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		errors.errors__field_types_res_2_1,
		null,
		null,
		null);
    //
    errors__du_stag_ordered_res_2_0[0] = errors.errors__du_functor_desc_res_2_0;
    errors__du_stag_ordered_res_2_0[1] = errors.errors__du_functor_desc_res_2_1;
    //
    errors__du_ptag_ordered_res_2[0] = new jmercury.runtime.DuPtagLayout(2,
		private_builtin.MR_SECTAG_REMOTE,
		errors.errors__du_stag_ordered_res_2_0);
    //
    errors__du_name_ordered_res_2[0] = errors.errors__du_functor_desc_res_2_1;
    errors__du_name_ordered_res_2[1] = errors.errors__du_functor_desc_res_2_0;
    //
    errors__functor_number_map_res_2[0] = 1;
    errors__functor_number_map_res_2[1] = 0;
    //
    errors__type_ctor_info_res_2.init(2,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf4_0(0))),
		((java.lang.Object) (new AddrOf4_0(1))),
		"errors",
		"res",
		new jmercury.runtime.TypeFunctors(errors.errors__du_name_ordered_res_2),
		new jmercury.runtime.TypeLayout(errors.errors__du_ptag_ordered_res_2),
		2,
		4,
		errors.errors__functor_number_map_res_2);
    //
    errors__du_functor_desc_res_1_0.init("ok",
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
    errors__field_types_res_1_1[0] = jmercury.runtime.PseudoTypeInfo.K1;
    //
    errors__du_functor_desc_res_1_1.init("error",
		1,
		1,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		errors.errors__field_types_res_1_1,
		null,
		null,
		null);
    //
    errors__du_stag_ordered_res_1_0[0] = errors.errors__du_functor_desc_res_1_0;
    errors__du_stag_ordered_res_1_0[1] = errors.errors__du_functor_desc_res_1_1;
    //
    errors__du_ptag_ordered_res_1[0] = new jmercury.runtime.DuPtagLayout(2,
		private_builtin.MR_SECTAG_REMOTE,
		errors.errors__du_stag_ordered_res_1_0);
    //
    errors__du_name_ordered_res_1[0] = errors.errors__du_functor_desc_res_1_1;
    errors__du_name_ordered_res_1[1] = errors.errors__du_functor_desc_res_1_0;
    //
    errors__functor_number_map_res_1[0] = 1;
    errors__functor_number_map_res_1[1] = 0;
    //
    errors__type_ctor_info_res_1.init(1,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf3_0(4))),
		((java.lang.Object) (new AddrOf3_0(5))),
		"errors",
		"res",
		new jmercury.runtime.TypeFunctors(errors.errors__du_name_ordered_res_1),
		new jmercury.runtime.TypeLayout(errors.errors__du_ptag_ordered_res_1),
		2,
		4,
		errors.errors__functor_number_map_res_1);
  }

// DataDefns
  static {
  }

// Scalar common data
  private static final list.List_1.F_nil_0[] MR_scalar_common_1 = new list.List_1.F_nil_0[1];
  private static final errors.Err_loc_0.None_0[] MR_scalar_common_2 = new errors.Err_loc_0.None_0[1];
  private static final int[][] MR_scalar_common_3 = new int[1][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_4 = new /* generic_type */ java.lang.Object[1][];
  private static void MR_init_scalars_0() {
    MR_scalar_common_1[0] = new list.List_1.F_nil_0();
    MR_scalar_common_2[0] = new errors.Err_loc_0.None_0();
    MR_scalar_common_3[0] = new int[] {
		1,
		33};
    MR_scalar_common_4[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (errors.MR_scalar_common_3[0])),
		java.lang.Integer.valueOf(4),
		((java.lang.Object) (private_builtin.private_builtin__type_ctor_info_type_info_0)),
		((java.lang.Object) (errors.__vpti_pred_2__pseudo_1__plain_builtin__type_ctor_info_string_0)),
		((java.lang.Object) (errors.pair__pti_pair_2__plain_errors__type_ctor_info_err_loc_0__pseudo_errors__pti_message_1__pseudo_1)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0))};
  }
  static {
    MR_init_scalars_0();
  }

// Vector common data

// NonDataDefns
  private static boolean __Unify____err_loc_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = errors.__Unify____err_loc_0_0(((errors.Err_loc_0) wrapper_arg_1), ((errors.Err_loc_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____err_loc_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = errors.__Compare____err_loc_0_0(((errors.Err_loc_0) wrapper_arg_2), ((errors.Err_loc_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____message_1_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      boolean succeeded = false;

      {
        succeeded = errors.__Unify____message_1_0(((jmercury.runtime.TypeInfo_Struct) wrapper_arg_1), ((errors.Message_1) wrapper_arg_2), ((errors.Message_1) wrapper_arg_3));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____message_1_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_3,
    java.lang.Object wrapper_arg_4)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = errors.__Compare____message_1_0(((jmercury.runtime.TypeInfo_Struct) wrapper_arg_1), ((errors.Message_1) wrapper_arg_3), ((errors.Message_1) wrapper_arg_4));
      }
      wrapper_arg_2 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_2;
    }
  }
  private static boolean __Unify____messages_1_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      boolean succeeded = false;

      {
        succeeded = errors.__Unify____messages_1_0(((jmercury.runtime.TypeInfo_Struct) wrapper_arg_1), ((list.List_1) wrapper_arg_2), ((list.List_1) wrapper_arg_3));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____messages_1_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_3,
    java.lang.Object wrapper_arg_4)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = errors.__Compare____messages_1_0(((jmercury.runtime.TypeInfo_Struct) wrapper_arg_1), ((list.List_1) wrapper_arg_3), ((list.List_1) wrapper_arg_4));
      }
      wrapper_arg_2 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_2;
    }
  }
  private static boolean __Unify____msg_type_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = errors.__Unify____msg_type_0_0(((errors.Msg_type_0) wrapper_arg_1), ((errors.Msg_type_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____msg_type_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = errors.__Compare____msg_type_0_0(((errors.Msg_type_0) wrapper_arg_2), ((errors.Msg_type_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____res_4_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3,
    java.lang.Object wrapper_arg_4,
    java.lang.Object wrapper_arg_5,
    java.lang.Object wrapper_arg_6)
  {
    {
      boolean succeeded = false;

      {
        succeeded = errors.__Unify____res_4_0(((jmercury.runtime.TypeInfo_Struct) wrapper_arg_1), ((jmercury.runtime.TypeInfo_Struct) wrapper_arg_2), ((jmercury.runtime.TypeInfo_Struct) wrapper_arg_3), ((jmercury.runtime.TypeInfo_Struct) wrapper_arg_4), ((errors.Res_4) wrapper_arg_5), ((errors.Res_4) wrapper_arg_6));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____res_4_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3,
    java.lang.Object wrapper_arg_4,
    java.lang.Object wrapper_arg_6,
    java.lang.Object wrapper_arg_7)
  {
    {
      java.lang.Object wrapper_arg_5 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = errors.__Compare____res_4_0(((jmercury.runtime.TypeInfo_Struct) wrapper_arg_1), ((jmercury.runtime.TypeInfo_Struct) wrapper_arg_2), ((jmercury.runtime.TypeInfo_Struct) wrapper_arg_3), ((jmercury.runtime.TypeInfo_Struct) wrapper_arg_4), ((errors.Res_4) wrapper_arg_6), ((errors.Res_4) wrapper_arg_7));
      }
      wrapper_arg_5 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_5;
    }
  }
  private static boolean __Unify____res_3_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3,
    java.lang.Object wrapper_arg_4,
    java.lang.Object wrapper_arg_5)
  {
    {
      boolean succeeded = false;

      {
        succeeded = errors.__Unify____res_3_0(((jmercury.runtime.TypeInfo_Struct) wrapper_arg_1), ((jmercury.runtime.TypeInfo_Struct) wrapper_arg_2), ((jmercury.runtime.TypeInfo_Struct) wrapper_arg_3), ((errors.Res_3) wrapper_arg_4), ((errors.Res_3) wrapper_arg_5));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____res_3_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3,
    java.lang.Object wrapper_arg_5,
    java.lang.Object wrapper_arg_6)
  {
    {
      java.lang.Object wrapper_arg_4 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = errors.__Compare____res_3_0(((jmercury.runtime.TypeInfo_Struct) wrapper_arg_1), ((jmercury.runtime.TypeInfo_Struct) wrapper_arg_2), ((jmercury.runtime.TypeInfo_Struct) wrapper_arg_3), ((errors.Res_3) wrapper_arg_5), ((errors.Res_3) wrapper_arg_6));
      }
      wrapper_arg_4 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_4;
    }
  }
  private static boolean __Unify____res_2_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3,
    java.lang.Object wrapper_arg_4)
  {
    {
      boolean succeeded = false;

      {
        succeeded = errors.__Unify____res_2_0(((jmercury.runtime.TypeInfo_Struct) wrapper_arg_1), ((jmercury.runtime.TypeInfo_Struct) wrapper_arg_2), ((errors.Res_2) wrapper_arg_3), ((errors.Res_2) wrapper_arg_4));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____res_2_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_4,
    java.lang.Object wrapper_arg_5)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = errors.__Compare____res_2_0(((jmercury.runtime.TypeInfo_Struct) wrapper_arg_1), ((jmercury.runtime.TypeInfo_Struct) wrapper_arg_2), ((errors.Res_2) wrapper_arg_4), ((errors.Res_2) wrapper_arg_5));
      }
      wrapper_arg_3 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_3;
    }
  }
  private static boolean __Unify____res_1_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      boolean succeeded = false;

      {
        succeeded = errors.__Unify____res_1_0(((jmercury.runtime.TypeInfo_Struct) wrapper_arg_1), ((errors.Res_1) wrapper_arg_2), ((errors.Res_1) wrapper_arg_3));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____res_1_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_3,
    java.lang.Object wrapper_arg_4)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = errors.__Compare____res_1_0(((jmercury.runtime.TypeInfo_Struct) wrapper_arg_1), ((errors.Res_1) wrapper_arg_3), ((errors.Res_1) wrapper_arg_4));
      }
      wrapper_arg_2 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_2;
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
              return_value = errors.__Unify____err_loc_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 1:
          {
            java.lang.Object return_value = null;

            {
              return_value = errors.__Compare____err_loc_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 2:
          {
            boolean return_value = false;

            {
              return_value = errors.__Unify____msg_type_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 3:
          {
            java.lang.Object return_value = null;

            {
              return_value = errors.__Compare____msg_type_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 4:
          {
            java.lang.Object return_value = null;

            {
              return_value = errors.message_strings_3_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2));
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
            boolean return_value = false;

            {
              return_value = errors.__Unify____message_1_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 1:
          {
            java.lang.Object return_value = null;

            {
              return_value = errors.__Compare____message_1_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 2:
          {
            boolean return_value = false;

            {
              return_value = errors.__Unify____messages_1_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 3:
          {
            java.lang.Object return_value = null;

            {
              return_value = errors.__Compare____messages_1_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 4:
          {
            boolean return_value = false;

            {
              return_value = errors.__Unify____res_1_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 5:
          {
            java.lang.Object return_value = null;

            {
              return_value = errors.__Compare____res_1_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
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
            boolean return_value = false;

            {
              return_value = errors.__Unify____res_2_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 1:
          {
            java.lang.Object return_value = null;

            {
              return_value = errors.__Compare____res_2_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4));
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

  private static final class AddrOf5_0
    implements jmercury.runtime.MethodPtr5
  {
    public final int ptr_num;
    public /* generic_type */ java.lang.Object call___0_0(
      /* generic_type */ java.lang.Object arg1,
      /* generic_type */ java.lang.Object arg2,
      /* generic_type */ java.lang.Object arg3,
      /* generic_type */ java.lang.Object arg4,
      /* generic_type */ java.lang.Object arg5)
    {
      switch (ptr_num) {
        case 0:
          {
            boolean return_value = false;

            {
              return_value = errors.__Unify____res_3_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4), ((java.lang.Object) arg5));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 1:
          {
            java.lang.Object return_value = null;

            {
              return_value = errors.__Compare____res_3_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4), ((java.lang.Object) arg5));
            }
            return ((java.lang.Object) (return_value));
          }
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
    }

    public AddrOf5_0(
      int ptr_num)
    {
      this.ptr_num = ptr_num;
    }
  }

  private static final class AddrOf6_0
    implements jmercury.runtime.MethodPtr6
  {
    public final int ptr_num;
    public /* generic_type */ java.lang.Object call___0_0(
      /* generic_type */ java.lang.Object arg1,
      /* generic_type */ java.lang.Object arg2,
      /* generic_type */ java.lang.Object arg3,
      /* generic_type */ java.lang.Object arg4,
      /* generic_type */ java.lang.Object arg5,
      /* generic_type */ java.lang.Object arg6)
    {
      switch (ptr_num) {
        case 0:
          {
            boolean return_value = false;

            {
              return_value = errors.__Unify____res_4_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4), ((java.lang.Object) arg5), ((java.lang.Object) arg6));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 1:
          {
            java.lang.Object return_value = null;

            {
              return_value = errors.__Compare____res_4_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4), ((java.lang.Object) arg5), ((java.lang.Object) arg6));
            }
            return ((java.lang.Object) (return_value));
          }
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
    }

    public AddrOf6_0(
      int ptr_num)
    {
      this.ptr_num = ptr_num;
    }
  }

//  errors.m:12
  public static class Err_loc_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class File_2
      extends errors.Err_loc_0
    {
      public java.lang.String F1;
      public int F2;

      public File_2()
      {
        {
        }
      }
      public File_2(
        java.lang.String F1,
        int F2)
      {
        {
          (this).data_tag = 2;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class File_1
      extends errors.Err_loc_0
    {
      public java.lang.String F1;

      public File_1()
      {
        {
        }
      }
      public File_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
        }
      }
    }

    public static class None_0
      extends errors.Err_loc_0
    {

      public None_0()
      {
        {
          (this).data_tag = 0;
        }
      }
    }


  }

//  errors.m:50
  public static class Message_1<MR_tvar_1>
    implements jmercury.runtime.MercuryType
  {
    public errors.Msg_type_0 F1;
    public MR_tvar_1 F2;

    public Message_1()
    {
      {
      }
    }
    public Message_1(
      errors.Msg_type_0 F1,
      MR_tvar_1 F2)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
      }
    }
  }

//  errors.m:52
  public static class Msg_type_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Msg_type_0 K0 = new Msg_type_0(0);  /* error */
      public static final Msg_type_0 K1 = new Msg_type_0(1);  /* warning */
      public static final Msg_type_0 K2 = new Msg_type_0(2);  /* message */

      private Msg_type_0(int val) {
        super(val);
      }

  }

//  errors.m:10
  public static class Res_4<MR_tvar_1, MR_tvar_2, MR_tvar_3, MR_tvar_4>
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Error_1<MR_tvar_1, MR_tvar_2, MR_tvar_3, MR_tvar_4>
      extends errors.Res_4
    {
      public MR_tvar_4 F1;

      public Error_1()
      {
        {
        }
      }
      public Error_1(
        MR_tvar_4 F1)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
        }
      }
    }

    public static class Ok_3<MR_tvar_1, MR_tvar_2, MR_tvar_3, MR_tvar_4>
      extends errors.Res_4
    {
      public MR_tvar_1 F1;
      public MR_tvar_2 F2;
      public MR_tvar_3 F3;

      public Ok_3()
      {
        {
        }
      }
      public Ok_3(
        MR_tvar_1 F1,
        MR_tvar_2 F2,
        MR_tvar_3 F3)
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

//  errors.m:9
  public static class Res_3<MR_tvar_1, MR_tvar_2, MR_tvar_3>
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Error_1<MR_tvar_1, MR_tvar_2, MR_tvar_3>
      extends errors.Res_3
    {
      public MR_tvar_3 F1;

      public Error_1()
      {
        {
        }
      }
      public Error_1(
        MR_tvar_3 F1)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
        }
      }
    }

    public static class Ok_2<MR_tvar_1, MR_tvar_2, MR_tvar_3>
      extends errors.Res_3
    {
      public MR_tvar_1 F1;
      public MR_tvar_2 F2;

      public Ok_2()
      {
        {
        }
      }
      public Ok_2(
        MR_tvar_1 F1,
        MR_tvar_2 F2)
      {
        {
          (this).data_tag = 0;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }


  }

//  errors.m:8
  public static class Res_2<MR_tvar_1, MR_tvar_2>
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Error_1<MR_tvar_1, MR_tvar_2>
      extends errors.Res_2
    {
      public MR_tvar_2 F1;

      public Error_1()
      {
        {
        }
      }
      public Error_1(
        MR_tvar_2 F1)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
        }
      }
    }

    public static class Ok_1<MR_tvar_1, MR_tvar_2>
      extends errors.Res_2
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

//  errors.m:7
  public static class Res_1<MR_tvar_1>
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Error_1<MR_tvar_1>
      extends errors.Res_1
    {
      public MR_tvar_1 F1;

      public Error_1()
      {
        {
        }
      }
      public Error_1(
        MR_tvar_1 F1)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
        }
      }
    }

    public static class Ok_0<MR_tvar_1>
      extends errors.Res_1
    {

      public Ok_0()
      {
        {
          (this).data_tag = 0;
        }
      }
    }


  }

//  errors.m:85
  private static java.lang.String IntroducedFrom__pred__message_strings__85__1_4_p_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T_23,
    /* closure */ java.lang.Object[] P_4,
    pair.Pair_2 HeadVar__3_17)
  {
    {
      boolean succeeded = false;
      java.lang.String HeadVar__4_18 = null;
      errors.Err_loc_0 Loc_9 = ((errors.Err_loc_0) ((pair.Pair_2) HeadVar__3_17).F1);
      errors.Msg_type_0 Tp_10 = null;
      java.lang.Object Msg_11 = null;
      java.lang.String LocStr_12 = null;
      java.lang.String TpStr_13 = null;
      java.lang.String Str_14 = null;
      errors.Message_1 V_19_19 = ((errors.Message_1) ((pair.Pair_2) HeadVar__3_17).F2);
      java.lang.String V_20_20 = null;
//  errors.m:87
      jmercury.runtime.MethodPtr func_0 = null;
      java.lang.Object conv1_Str_14 = null;

//  errors.m:86
      Tp_10 = ((errors.Message_1) V_19_19).F1;
      Msg_11 = ((errors.Message_1) V_19_19).F2;
//  errors.m:87
      {
        LocStr_12 = errors.location_string_2_p_0(Loc_9);
      }
//  errors.m:102
      switch (Tp_10.MR_value) {
        case 0:
          TpStr_13 = "Error: ";
          break;
        case 2:
//  errors.m:104
          TpStr_13 = "Message: ";
//  errors.m:102
          break;
        case 1:
//  errors.m:103
          TpStr_13 = "Warning: ";
//  errors.m:102
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
//  errors.m:87
      func_0 = ((jmercury.runtime.MethodPtr) ((java.lang.Object[]) P_4)[1]);
      {
        conv1_Str_14 = ((java.lang.Object) ((jmercury.runtime.MethodPtr2) func_0).call___0_0(((java.lang.Object) (((/* generic_type */ java.lang.Object) P_4))), ((java.lang.Object) (Msg_11))));
      }
      Str_14 = ((java.lang.String) conv1_Str_14);
//  errors.m:88
      {
        V_20_20 = string.f_43_43_2_f_0(TpStr_13, Str_14);
      }
      {
        HeadVar__4_18 = string.f_43_43_2_f_0(LocStr_12, V_20_20);
      }
//  errors.m:85
      return HeadVar__4_18;
    }
  }
//  errors.m:10
  public static builtin.Comparison_result_0 __Compare____res_4_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T1_24,
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T2_25,
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T3_26,
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_M_27,
    errors.Res_4 HeadVar__2_2,
    errors.Res_4 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_22 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_23 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_22 == CastY_23);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        if ((HeadVar__2_2.data_tag == 1))
          {
            java.lang.Object V_28_28 = ((errors.Res_4.Error_1) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 1))
              {
                java.lang.Object V_21_21 = ((errors.Res_4.Error_1) HeadVar__3_3).F1;

                {
                  HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_for_M_27, V_28_28, V_21_21);
                }
              }
            else
              HeadVar__1_1 = builtin.Comparison_result_0.K2;
          }
        else
          {
            java.lang.Object V_29_29 = ((errors.Res_4.Ok_3) HeadVar__2_2).F3;
            java.lang.Object V_30_30 = ((errors.Res_4.Ok_3) HeadVar__2_2).F2;
            java.lang.Object V_31_31 = ((errors.Res_4.Ok_3) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 1))
              HeadVar__1_1 = builtin.Comparison_result_0.K1;
            else
              {
                java.lang.Object V_7_7 = ((errors.Res_4.Ok_3) HeadVar__3_3).F1;
                java.lang.Object V_8_8 = ((errors.Res_4.Ok_3) HeadVar__3_3).F2;
                java.lang.Object V_9_9 = ((errors.Res_4.Ok_3) HeadVar__3_3).F3;
                builtin.Comparison_result_0 V_10_10 = null;

                {
                  V_10_10 = builtin.compare_3_p_0(TypeInfo_for_T1_24, V_31_31, V_7_7);
                }
                succeeded = (V_10_10.MR_value == builtin.Comparison_result_0.K0.MR_value);
                succeeded = !(succeeded);
                if (succeeded)
                  HeadVar__1_1 = V_10_10;
                else
                  {
                    builtin.Comparison_result_0 V_11_11 = null;

                    {
                      V_11_11 = builtin.compare_3_p_0(TypeInfo_for_T2_25, V_30_30, V_8_8);
                    }
                    succeeded = (V_11_11.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_11_11;
                    else
                      {
                        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_for_T3_26, V_29_29, V_9_9);
                      }
                  }
              }
          }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____res_4_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T1_13,
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T2_14,
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T3_15,
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_M_16,
    errors.Res_4 HeadVar__1_1,
    errors.Res_4 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_11 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_12 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_11 == CastY_12);
      if (succeeded)
        succeeded = true;
      else
        if ((HeadVar__1_1.data_tag == 1))
          {
            java.lang.Object V_9_9 = ((errors.Res_4.Error_1) HeadVar__1_1).F1;
            java.lang.Object V_10_10 = null;

            succeeded = (HeadVar__2_2.data_tag == 1);
            if (succeeded)
              {
                V_10_10 = ((errors.Res_4.Error_1) HeadVar__2_2).F1;
                {
                  succeeded = builtin.unify_2_p_0(TypeInfo_for_M_16, V_9_9, V_10_10);
                }
              }
          }
        else
          {
            java.lang.Object V_3_3 = ((errors.Res_4.Ok_3) HeadVar__1_1).F1;
            java.lang.Object V_4_4 = ((errors.Res_4.Ok_3) HeadVar__1_1).F2;
            java.lang.Object V_5_5 = ((errors.Res_4.Ok_3) HeadVar__1_1).F3;
            java.lang.Object V_6_6 = null;
            java.lang.Object V_7_7 = null;
            java.lang.Object V_8_8 = null;

            succeeded = (HeadVar__2_2.data_tag == 0);
            if (succeeded)
              {
                V_6_6 = ((errors.Res_4.Ok_3) HeadVar__2_2).F1;
                V_7_7 = ((errors.Res_4.Ok_3) HeadVar__2_2).F2;
                V_8_8 = ((errors.Res_4.Ok_3) HeadVar__2_2).F3;
                {
                  succeeded = builtin.unify_2_p_0(TypeInfo_for_T1_13, V_3_3, V_6_6);
                }
                if (succeeded)
                  {
                    {
                      succeeded = builtin.unify_2_p_0(TypeInfo_for_T2_14, V_4_4, V_7_7);
                    }
                    if (succeeded)
                      {
                        succeeded = builtin.unify_2_p_0(TypeInfo_for_T3_15, V_5_5, V_8_8);
                      }
                  }
              }
          }
      return succeeded;
    }
  }
//  errors.m:9
  public static builtin.Comparison_result_0 __Compare____res_3_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T1_19,
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T2_20,
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_M_21,
    errors.Res_3 HeadVar__2_2,
    errors.Res_3 HeadVar__3_3)
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
            java.lang.Object V_22_22 = ((errors.Res_3.Error_1) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 1))
              {
                java.lang.Object V_16_16 = ((errors.Res_3.Error_1) HeadVar__3_3).F1;

                {
                  HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_for_M_21, V_22_22, V_16_16);
                }
              }
            else
              HeadVar__1_1 = builtin.Comparison_result_0.K2;
          }
        else
          {
            java.lang.Object V_23_23 = ((errors.Res_3.Ok_2) HeadVar__2_2).F2;
            java.lang.Object V_24_24 = ((errors.Res_3.Ok_2) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 1))
              HeadVar__1_1 = builtin.Comparison_result_0.K1;
            else
              {
                java.lang.Object V_6_6 = ((errors.Res_3.Ok_2) HeadVar__3_3).F1;
                java.lang.Object V_7_7 = ((errors.Res_3.Ok_2) HeadVar__3_3).F2;
                builtin.Comparison_result_0 V_8_8 = null;

                {
                  V_8_8 = builtin.compare_3_p_0(TypeInfo_for_T1_19, V_24_24, V_6_6);
                }
                succeeded = (V_8_8.MR_value == builtin.Comparison_result_0.K0.MR_value);
                succeeded = !(succeeded);
                if (succeeded)
                  HeadVar__1_1 = V_8_8;
                else
                  {
                    HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_for_T2_20, V_23_23, V_7_7);
                  }
              }
          }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____res_3_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T1_11,
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T2_12,
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_M_13,
    errors.Res_3 HeadVar__1_1,
    errors.Res_3 HeadVar__2_2)
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
            java.lang.Object V_7_7 = ((errors.Res_3.Error_1) HeadVar__1_1).F1;
            java.lang.Object V_8_8 = null;

            succeeded = (HeadVar__2_2.data_tag == 1);
            if (succeeded)
              {
                V_8_8 = ((errors.Res_3.Error_1) HeadVar__2_2).F1;
                {
                  succeeded = builtin.unify_2_p_0(TypeInfo_for_M_13, V_7_7, V_8_8);
                }
              }
          }
        else
          {
            java.lang.Object V_3_3 = ((errors.Res_3.Ok_2) HeadVar__1_1).F1;
            java.lang.Object V_4_4 = ((errors.Res_3.Ok_2) HeadVar__1_1).F2;
            java.lang.Object V_5_5 = null;
            java.lang.Object V_6_6 = null;

            succeeded = (HeadVar__2_2.data_tag == 0);
            if (succeeded)
              {
                V_5_5 = ((errors.Res_3.Ok_2) HeadVar__2_2).F1;
                V_6_6 = ((errors.Res_3.Ok_2) HeadVar__2_2).F2;
                {
                  succeeded = builtin.unify_2_p_0(TypeInfo_for_T1_11, V_3_3, V_5_5);
                }
                if (succeeded)
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_for_T2_12, V_4_4, V_6_6);
                  }
              }
          }
      return succeeded;
    }
  }
//  errors.m:8
  public static builtin.Comparison_result_0 __Compare____res_2_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T_14,
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_M_15,
    errors.Res_2 HeadVar__2_2,
    errors.Res_2 HeadVar__3_3)
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
            java.lang.Object V_16_16 = ((errors.Res_2.Error_1) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 1))
              {
                java.lang.Object V_11_11 = ((errors.Res_2.Error_1) HeadVar__3_3).F1;

                {
                  HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_for_M_15, V_16_16, V_11_11);
                }
              }
            else
              HeadVar__1_1 = builtin.Comparison_result_0.K2;
          }
        else
          {
            java.lang.Object V_17_17 = ((errors.Res_2.Ok_1) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 1))
              HeadVar__1_1 = builtin.Comparison_result_0.K1;
            else
              {
                java.lang.Object V_5_5 = ((errors.Res_2.Ok_1) HeadVar__3_3).F1;

                {
                  HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_for_T_14, V_17_17, V_5_5);
                }
              }
          }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____res_2_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T_9,
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_M_10,
    errors.Res_2 HeadVar__1_1,
    errors.Res_2 HeadVar__2_2)
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
            java.lang.Object V_5_5 = ((errors.Res_2.Error_1) HeadVar__1_1).F1;
            java.lang.Object V_6_6 = null;

            succeeded = (HeadVar__2_2.data_tag == 1);
            if (succeeded)
              {
                V_6_6 = ((errors.Res_2.Error_1) HeadVar__2_2).F1;
                {
                  succeeded = builtin.unify_2_p_0(TypeInfo_for_M_10, V_5_5, V_6_6);
                }
              }
          }
        else
          {
            java.lang.Object V_3_3 = ((errors.Res_2.Ok_1) HeadVar__1_1).F1;
            java.lang.Object V_4_4 = null;

            succeeded = (HeadVar__2_2.data_tag == 0);
            if (succeeded)
              {
                V_4_4 = ((errors.Res_2.Ok_1) HeadVar__2_2).F1;
                {
                  succeeded = builtin.unify_2_p_0(TypeInfo_for_T_9, V_3_3, V_4_4);
                }
              }
          }
      return succeeded;
    }
  }
//  errors.m:7
  public static builtin.Comparison_result_0 __Compare____res_1_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_M_10,
    errors.Res_1 HeadVar__2_2,
    errors.Res_1 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_8 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_9 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_8 == CastY_9);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        if ((HeadVar__2_2.data_tag == 1))
          {
            java.lang.Object V_11_11 = ((errors.Res_1.Error_1) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 1))
              {
                java.lang.Object V_7_7 = ((errors.Res_1.Error_1) HeadVar__3_3).F1;

                {
                  HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_for_M_10, V_11_11, V_7_7);
                }
              }
            else
              HeadVar__1_1 = builtin.Comparison_result_0.K2;
          }
        else
          if ((HeadVar__3_3.data_tag == 1))
            HeadVar__1_1 = builtin.Comparison_result_0.K1;
          else
            HeadVar__1_1 = builtin.Comparison_result_0.K0;
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____res_1_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_M_7,
    errors.Res_1 HeadVar__1_1,
    errors.Res_1 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_5 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_6 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_5 == CastY_6);
      if (succeeded)
        succeeded = true;
      else
        if ((HeadVar__1_1.data_tag == 1))
          {
            java.lang.Object V_3_3 = ((errors.Res_1.Error_1) HeadVar__1_1).F1;
            java.lang.Object V_4_4 = null;

            succeeded = (HeadVar__2_2.data_tag == 1);
            if (succeeded)
              {
                V_4_4 = ((errors.Res_1.Error_1) HeadVar__2_2).F1;
                {
                  succeeded = builtin.unify_2_p_0(TypeInfo_for_M_7, V_3_3, V_4_4);
                }
              }
          }
        else
          succeeded = (HeadVar__2_2.data_tag == 0);
      return succeeded;
    }
  }
//  errors.m:52
  private static builtin.Comparison_result_0 __Compare____msg_type_0_0(
    errors.Msg_type_0 HeadVar__2_2,
    errors.Msg_type_0 HeadVar__3_3)
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
  private static boolean __Unify____msg_type_0_0(
    errors.Msg_type_0 HeadVar__2_1,
    errors.Msg_type_0 HeadVar__2_2)
  {
    {
      boolean succeeded = (HeadVar__2_1.MR_value == HeadVar__2_2.MR_value);

      return succeeded;
    }
  }
//  errors.m:49
  public static builtin.Comparison_result_0 __Compare____messages_1_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T_6,
    list.List_1 HeadVar__2_2,
    list.List_1 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_7_7 = jmercury.runtime.TypeInfo_Struct.maybe_new(errors.errors__type_ctor_info_err_loc_0);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_8_8 = jmercury.runtime.TypeInfo_Struct.maybe_new(errors.errors__type_ctor_info_message_1);
      jmercury.runtime.TypeInfo_Struct TypeInfo_9_9 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_10_10 = jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2);
      jmercury.runtime.TypeInfo_Struct TypeInfo_11_11 = null;
      list.List_1 Cast_HeadVar1_4 = HeadVar__2_2;
      list.List_1 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        TypeInfo_9_9 = new jmercury.runtime.TypeInfo_Struct(TypeCtorInfo_8_8, TypeInfo_for_T_6);
      }
      {
        TypeInfo_11_11 = new jmercury.runtime.TypeInfo_Struct(TypeCtorInfo_10_10, TypeCtorInfo_7_7, TypeInfo_9_9);
      }
      {
        HeadVar__1_1 = list.__Compare____list_1_0(TypeInfo_11_11, (list.List_1) Cast_HeadVar1_4, (list.List_1) Cast_HeadVar2_5);
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____messages_1_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T_5,
    list.List_1 HeadVar__1_1,
    list.List_1 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(errors.errors__type_ctor_info_err_loc_0);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_7_7 = jmercury.runtime.TypeInfo_Struct.maybe_new(errors.errors__type_ctor_info_message_1);
      jmercury.runtime.TypeInfo_Struct TypeInfo_8_8 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_9_9 = jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2);
      jmercury.runtime.TypeInfo_Struct TypeInfo_10_10 = null;
      list.List_1 Cast_HeadVar1_3 = HeadVar__1_1;
      list.List_1 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        TypeInfo_8_8 = new jmercury.runtime.TypeInfo_Struct(TypeCtorInfo_7_7, TypeInfo_for_T_5);
      }
      {
        TypeInfo_10_10 = new jmercury.runtime.TypeInfo_Struct(TypeCtorInfo_9_9, TypeCtorInfo_6_6, TypeInfo_8_8);
      }
      {
        succeeded = list.__Unify____list_1_0(TypeInfo_10_10, (list.List_1) Cast_HeadVar1_3, (list.List_1) Cast_HeadVar2_4);
      }
      return succeeded;
    }
  }
//  errors.m:50
  public static builtin.Comparison_result_0 __Compare____message_1_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T_11,
    errors.Message_1 HeadVar__2_2,
    errors.Message_1 HeadVar__3_3)
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
          errors.Msg_type_0 V_4_4 = ((errors.Message_1) HeadVar__2_2).F1;
          java.lang.Object V_5_5 = ((errors.Message_1) HeadVar__2_2).F2;
          errors.Msg_type_0 V_6_6 = ((errors.Message_1) HeadVar__3_3).F1;
          java.lang.Object V_7_7 = ((errors.Message_1) HeadVar__3_3).F2;
          builtin.Comparison_result_0 V_8_8 = null;
          int V_13_13 = (int) V_4_4.MR_value;
          int V_14_14 = (int) V_6_6.MR_value;

          {
            V_8_8 = private_builtin.builtin_compare_int_3_p_0(V_13_13, V_14_14);
          }
          succeeded = (V_8_8.MR_value == builtin.Comparison_result_0.K0.MR_value);
          succeeded = !(succeeded);
          if (succeeded)
            HeadVar__1_1 = V_8_8;
          else
            {
              HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_for_T_11, V_5_5, V_7_7);
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____message_1_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T_9,
    errors.Message_1 HeadVar__1_1,
    errors.Message_1 HeadVar__2_2)
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
          errors.Msg_type_0 V_3_3 = ((errors.Message_1) HeadVar__1_1).F1;
          java.lang.Object V_4_4 = ((errors.Message_1) HeadVar__1_1).F2;
          errors.Msg_type_0 V_5_5 = ((errors.Message_1) HeadVar__2_2).F1;
          java.lang.Object V_6_6 = ((errors.Message_1) HeadVar__2_2).F2;

          succeeded = (V_3_3.MR_value == V_5_5.MR_value);
          if (succeeded)
            {
              succeeded = builtin.unify_2_p_0(TypeInfo_for_T_9, V_4_4, V_6_6);
            }
        }
      return succeeded;
    }
  }
//  errors.m:12
  public static builtin.Comparison_result_0 __Compare____err_loc_0_0(
    errors.Err_loc_0 HeadVar__2_2,
    errors.Err_loc_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_23 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_24 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_23 == CastY_24);
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
              default: /*NOTREACHED*/
                throw new jmercury.runtime.UnreachableDefault();
            }
            break;
          case 1:
            {
              java.lang.String V_28_28 = ((errors.Err_loc_0.File_1) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 1:
                  {
                    java.lang.String V_9_9 = ((errors.Err_loc_0.File_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_28_28, V_9_9);
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
              int V_29_29 = ((errors.Err_loc_0.File_2) HeadVar__2_2).F2;
              java.lang.String V_30_30 = ((errors.Err_loc_0.File_2) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 1:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 2:
                  {
                    java.lang.String V_20_20 = ((errors.Err_loc_0.File_2) HeadVar__3_3).F1;
                    int V_21_21 = ((errors.Err_loc_0.File_2) HeadVar__3_3).F2;
                    builtin.Comparison_result_0 V_22_22 = null;

                    {
                      V_22_22 = private_builtin.builtin_compare_string_3_p_0(V_30_30, V_20_20);
                    }
                    succeeded = (V_22_22.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_22_22;
                    else
                      {
                        HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_29_29, V_21_21);
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
  public static boolean __Unify____err_loc_0_0(
    errors.Err_loc_0 HeadVar__1_1,
    errors.Err_loc_0 HeadVar__2_2)
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
            {
              java.lang.String V_3_3 = ((errors.Err_loc_0.File_1) HeadVar__1_1).F1;
              java.lang.String V_4_4 = null;

              succeeded = (HeadVar__2_2.data_tag == 1);
              if (succeeded)
                {
                  V_4_4 = ((errors.Err_loc_0.File_1) HeadVar__2_2).F1;
                  succeeded = V_3_3.equals(V_4_4);
                }
            }
            break;
          case 2:
            {
              java.lang.String V_5_5 = ((errors.Err_loc_0.File_2) HeadVar__1_1).F1;
              int V_6_6 = ((errors.Err_loc_0.File_2) HeadVar__1_1).F2;
              java.lang.String V_7_7 = null;
              int V_8_8 = 0;

              succeeded = (HeadVar__2_2.data_tag == 2);
              if (succeeded)
                {
                  V_7_7 = ((errors.Err_loc_0.File_2) HeadVar__2_2).F1;
                  V_8_8 = ((errors.Err_loc_0.File_2) HeadVar__2_2).F2;
                  succeeded = V_5_5.equals(V_7_7);
                  if (succeeded)
                    succeeded = (V_6_6 == V_8_8);
                }
            }
            break;
          default: /*NOTREACHED*/
            throw new jmercury.runtime.UnreachableDefault();
        }
      return succeeded;
    }
  }
//  errors.m:91
  private static java.lang.String location_string_2_p_0(
    errors.Err_loc_0 HeadVar__1_1)
  {
//  errors.m:93
    {
      boolean succeeded = false;
      java.lang.String HeadVar__2_2 = null;

      switch (HeadVar__1_1.data_tag) {
        case 0:
          HeadVar__2_2 = "";
          break;
        case 1:
//  errors.m:94
          {
            java.lang.String F_3 = ((errors.Err_loc_0.File_1) HeadVar__1_1).F1;
            java.lang.String V_18_18 = ": ";

            {
              HeadVar__2_2 = string.f_43_43_2_f_0(F_3, V_18_18);
            }
          }
//  errors.m:93
          break;
        case 2:
//  errors.m:96
          {
            java.lang.String F_9 = ((errors.Err_loc_0.File_2) HeadVar__1_1).F1;
            int N_10 = ((errors.Err_loc_0.File_2) HeadVar__1_1).F2;
            java.lang.String V_12_12 = "%s:%i: ";
            list.List_1 V_13_13 = null;
            string.Poly_type_0 V_14_14 = null;
            list.List_1 V_15_15 = null;
            string.Poly_type_0 V_16_16 = null;
            list.List_1 V_17_17 = null;

//  errors.m:97
            {
              V_14_14 = new string.Poly_type_0.S_1(F_9);
            }
            {
              V_16_16 = new string.Poly_type_0.I_1(N_10);
            }
            V_17_17 = (list.List_1) errors.MR_scalar_common_1[0];
            {
              V_15_15 = new list.List_1.F_cons_2(((java.lang.Object) (V_16_16)), V_17_17);
            }
            {
              V_13_13 = new list.List_1.F_cons_2(((java.lang.Object) (V_14_14)), V_15_15);
            }
            {
              HeadVar__2_2 = string.format_3_p_0(V_12_12, V_13_13);
            }
//  errors.m:96
          }
//  errors.m:93
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
      return HeadVar__2_2;
    }
//  errors.m:91
  }
//  errors.m:73
  private static void write_msgs_4_p_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T_29,
    list.List_1 HeadVar__1_1,
    /* closure */ java.lang.Object[] P_2)
  {
//  errors.m:75
    while (true)
      {
        /* tailcall optimized into a loop */
        {
          boolean succeeded = false;

          if ((HeadVar__1_1.data_tag == 0))
//  errors.m:82
            {
            }
//  errors.m:75
          else
            {
              pair.Pair_2 M_5 = ((pair.Pair_2) ((list.List_1.F_cons_2) HeadVar__1_1).F1);
              list.List_1 Ms0_6 = (list.List_1) ((list.List_1.F_cons_2) HeadVar__1_1).F2;
              io.Output_stream_0 S_9 = null;
              errors.Err_loc_0 Loc_10 = null;
              errors.Msg_type_0 Type_11 = null;
              java.lang.Object Msg_12 = null;
              java.lang.String LocStr_13 = null;
              java.lang.String TypeStr_14 = null;
              java.lang.String Str_15 = null;
              errors.Message_1 V_19_19 = null;
//  errors.m:80
              jmercury.runtime.MethodPtr func_0 = null;
              java.lang.Object conv1_Str_15 = null;

//  errors.m:76
              {
                S_9 = io.stderr_stream_3_p_0();
              }
//  errors.m:77
              Loc_10 = ((errors.Err_loc_0) ((pair.Pair_2) M_5).F1);
              V_19_19 = ((errors.Message_1) ((pair.Pair_2) M_5).F2);
              Type_11 = ((errors.Message_1) V_19_19).F1;
              Msg_12 = ((errors.Message_1) V_19_19).F2;
              {
                LocStr_13 = errors.location_string_2_p_0(Loc_10);
              }
//  errors.m:102
              switch (Type_11.MR_value) {
                case 0:
                  TypeStr_14 = "Error: ";
                  break;
                case 2:
//  errors.m:104
                  TypeStr_14 = "Message: ";
//  errors.m:102
                  break;
                case 1:
//  errors.m:103
                  TypeStr_14 = "Warning: ";
//  errors.m:102
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
//  errors.m:79
              {
                io.write_string_4_p_0(S_9, LocStr_13);
              }
              {
                io.write_string_4_p_0(S_9, TypeStr_14);
              }
//  errors.m:80
              func_0 = ((jmercury.runtime.MethodPtr) ((java.lang.Object[]) P_2)[1]);
              {
                conv1_Str_15 = ((java.lang.Object) ((jmercury.runtime.MethodPtr2) func_0).call___0_0(((java.lang.Object) (((/* generic_type */ java.lang.Object) P_2))), ((java.lang.Object) (Msg_12))));
              }
              Str_15 = ((java.lang.String) conv1_Str_15);
              {
                io.write_string_4_p_0(S_9, Str_15);
              }
              {
                io.nl_3_p_0(S_9);
              }
//  errors.m:81
              /* direct tailcall eliminated */
              {
                list.List_1 HeadVar__1__tmp_copy_1 = Ms0_6;

                HeadVar__1_1 = HeadVar__1__tmp_copy_1;
              }
              continue;
//  errors.m:75
            }
        }
        break;
      }
//  errors.m:73
  }
//  errors.m:43
  public static java.lang.Object [] rfoldl3_8_p_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_X_28,
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_Y_29,
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_M_30,
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_Z_31,
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_W_32,
    /* closure */ java.lang.Object[] P_1,
    list.List_1 HeadVar__2_2,
    java.lang.Object HeadVar__3_3,
    java.lang.Object HeadVar__5_5,
    java.lang.Object HeadVar__7_7)
  {
//  errors.m:116
    while (true)
      {
        /* tailcall optimized into a loop */
        {
          boolean succeeded = false;
          errors.Res_2 HeadVar__4_4 = null;
          java.lang.Object Y_6 = null;
          java.lang.Object Z_8 = null;

          if ((HeadVar__2_2.data_tag == 0))
//  errors.m:124
            {
              {
                HeadVar__4_4 = new errors.Res_2.Ok_1(HeadVar__3_3);
              }
              Y_6 = HeadVar__5_5;
              Z_8 = HeadVar__7_7;
            }
//  errors.m:116
          else
            {
              java.lang.Object E_10 = ((list.List_1.F_cons_2) HeadVar__2_2).F1;
              list.List_1 Es_11 = ((list.List_1.F_cons_2) HeadVar__2_2).F2;
              errors.Res_2 Res_18 = null;
              java.lang.Object Y1_19 = null;
              java.lang.Object Z1_20 = null;
//  errors.m:117
              jmercury.runtime.MethodPtr func_0 = ((jmercury.runtime.MethodPtr) ((java.lang.Object[]) P_1)[1]);
              java.lang.Object conv1_Res_18 = null;
//  errors.m:120
              java.lang.Object X1_21 = null;

//  errors.m:117
              {
                java.lang.Object [] result = ((java.lang.Object[]) ((jmercury.runtime.MethodPtr5) func_0).call___0_0(((java.lang.Object) (((/* generic_type */ java.lang.Object) P_1))), ((java.lang.Object) (E_10)), ((java.lang.Object) (HeadVar__3_3)), ((java.lang.Object) (HeadVar__5_5)), ((java.lang.Object) (HeadVar__7_7))));
                conv1_Res_18 = (java.lang.Object) result[0];
                Y1_19 = (java.lang.Object) result[1];
                Z1_20 = (java.lang.Object) result[2];
              }
              Res_18 = ((errors.Res_2) conv1_Res_18);
//  errors.m:118
              succeeded = (Res_18.data_tag == 0);
              if (succeeded)
                {
                  X1_21 = ((errors.Res_2.Ok_1) Res_18).F1;
//  errors.m:119
                  /* direct tailcall eliminated */
                  {
                    list.List_1 HeadVar__2__tmp_copy_2 = Es_11;
                    java.lang.Object HeadVar__3__tmp_copy_3 = X1_21;
                    java.lang.Object HeadVar__5__tmp_copy_5 = Y1_19;
                    java.lang.Object HeadVar__7__tmp_copy_7 = Z1_20;

                    HeadVar__7_7 = HeadVar__7__tmp_copy_7;
                    HeadVar__5_5 = HeadVar__5__tmp_copy_5;
                    HeadVar__3_3 = HeadVar__3__tmp_copy_3;
                    HeadVar__2_2 = HeadVar__2__tmp_copy_2;
                  }
                  continue;
//  errors.m:118
                }
              else
//  errors.m:123
                {
//  errors.m:120
                  java.lang.Object Err_22 = null;

                  succeeded = (Res_18.data_tag == 1);
                  if (succeeded)
                    {
                      Err_22 = ((errors.Res_2.Error_1) Res_18).F1;
//  errors.m:121
                      HeadVar__4_4 = Res_18;
//  errors.m:122
                      Y_6 = Y1_19;
                      Z_8 = Z1_20;
//  errors.m:120
                    }
                  else
//  errors.m:123
                    {
                      java.lang.String V_23_23 = "This cannot happen";

                      {
                        require.error_1_p_0(V_23_23);
                      }
                    }
                }
//  errors.m:116
            }
return new java.lang.Object[] {
            ((java.lang.Object) (HeadVar__4_4)),
            ((java.lang.Object) (Y_6)),
            ((java.lang.Object) (Z_8))
          };
        }
      }
//  errors.m:43
  }
//  errors.m:40
  public static java.lang.Object [] rfoldl2_6_p_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_X_22,
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_Y_23,
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_M_24,
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_Z_25,
    /* closure */ java.lang.Object[] P_1,
    list.List_1 HeadVar__2_2,
    java.lang.Object HeadVar__3_3,
    java.lang.Object HeadVar__5_5)
  {
//  errors.m:106
    while (true)
      {
        /* tailcall optimized into a loop */
        {
          boolean succeeded = false;
          errors.Res_2 HeadVar__4_4 = null;
          java.lang.Object Y_6 = null;

          if ((HeadVar__2_2.data_tag == 0))
//  errors.m:114
            {
              {
                HeadVar__4_4 = new errors.Res_2.Ok_1(HeadVar__3_3);
              }
              Y_6 = HeadVar__5_5;
            }
//  errors.m:106
          else
            {
              java.lang.Object E_8 = ((list.List_1.F_cons_2) HeadVar__2_2).F1;
              list.List_1 Es_9 = ((list.List_1.F_cons_2) HeadVar__2_2).F2;
              errors.Res_2 Res_14 = null;
              java.lang.Object Y1_15 = null;
//  errors.m:107
              jmercury.runtime.MethodPtr func_0 = ((jmercury.runtime.MethodPtr) ((java.lang.Object[]) P_1)[1]);
              java.lang.Object conv1_Res_14 = null;
//  errors.m:110
              java.lang.Object X1_16 = null;

//  errors.m:107
              {
                java.lang.Object [] result = ((java.lang.Object[]) ((jmercury.runtime.MethodPtr4) func_0).call___0_0(((java.lang.Object) (((/* generic_type */ java.lang.Object) P_1))), ((java.lang.Object) (E_8)), ((java.lang.Object) (HeadVar__3_3)), ((java.lang.Object) (HeadVar__5_5))));
                conv1_Res_14 = (java.lang.Object) result[0];
                Y1_15 = (java.lang.Object) result[1];
              }
              Res_14 = ((errors.Res_2) conv1_Res_14);
//  errors.m:108
              succeeded = (Res_14.data_tag == 0);
              if (succeeded)
                {
                  X1_16 = ((errors.Res_2.Ok_1) Res_14).F1;
//  errors.m:109
                  /* direct tailcall eliminated */
                  {
                    list.List_1 HeadVar__2__tmp_copy_2 = Es_9;
                    java.lang.Object HeadVar__3__tmp_copy_3 = X1_16;
                    java.lang.Object HeadVar__5__tmp_copy_5 = Y1_15;

                    HeadVar__5_5 = HeadVar__5__tmp_copy_5;
                    HeadVar__3_3 = HeadVar__3__tmp_copy_3;
                    HeadVar__2_2 = HeadVar__2__tmp_copy_2;
                  }
                  continue;
//  errors.m:108
                }
              else
//  errors.m:113
                {
//  errors.m:110
                  java.lang.Object Err_17 = null;

                  succeeded = (Res_14.data_tag == 1);
                  if (succeeded)
                    {
                      Err_17 = ((errors.Res_2.Error_1) Res_14).F1;
//  errors.m:111
                      HeadVar__4_4 = Res_14;
//  errors.m:112
                      Y_6 = Y1_15;
//  errors.m:110
                    }
                  else
//  errors.m:113
                    {
                      java.lang.String V_18_18 = "This cannot happen";

                      {
                        require.error_1_p_0(V_18_18);
                      }
                    }
                }
//  errors.m:106
            }
return new java.lang.Object[] {
            ((java.lang.Object) (HeadVar__4_4)),
            ((java.lang.Object) (Y_6))
          };
        }
      }
//  errors.m:40
  }
//  errors.m:85
  private static java.lang.Object message_strings_3_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      java.lang.String conv0_HeadVar__4_18 = null;

      {
        conv0_HeadVar__4_18 = errors.IntroducedFrom__pred__message_strings__85__1_4_p_0(((jmercury.runtime.TypeInfo_Struct) ((java.lang.Object[]) closure)[3]), ((/* closure */ java.lang.Object[]) ((java.lang.Object[]) closure)[4]), ((pair.Pair_2) wrapper_arg_1));
      }
      wrapper_arg_2 = ((java.lang.Object) (conv0_HeadVar__4_18));
      return wrapper_arg_2;
    }
  }
//  errors.m:37
  public static list.List_1 message_strings_3_p_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T_23,
    /* closure */ java.lang.Object[] P_4,
    list.List_1 Ms_5)
  {
//  errors.m:84
    {
      boolean succeeded = false;
      list.List_1 Strs_6 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_24_24 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_25_25 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_26_26 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_27_27 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_28_28 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_29_29 = null;
      /* closure */ java.lang.Object[] V_15_15 = null;
      list.List_1 V_16_16 = null;
//  errors.m:85
      list.List_1 conv1_V_16_16 = null;

      {
        V_15_15 = new /* closure */ java.lang.Object[] {((java.lang.Object) (errors.MR_scalar_common_4[0])), ((java.lang.Object) (new AddrOf2_0(4))), java.lang.Integer.valueOf(2), ((java.lang.Object) (TypeInfo_for_T_23)), ((java.lang.Object) (P_4))};
      }
      TypeCtorInfo_27_27 = jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2);
      TypeCtorInfo_24_24 = jmercury.runtime.TypeInfo_Struct.maybe_new(errors.errors__type_ctor_info_err_loc_0);
      TypeCtorInfo_25_25 = jmercury.runtime.TypeInfo_Struct.maybe_new(errors.errors__type_ctor_info_message_1);
      {
        TypeInfo_26_26 = new jmercury.runtime.TypeInfo_Struct(TypeCtorInfo_25_25, TypeInfo_for_T_23);
      }
      {
        TypeInfo_28_28 = new jmercury.runtime.TypeInfo_Struct(TypeCtorInfo_27_27, TypeCtorInfo_24_24, TypeInfo_26_26);
      }
      {
        conv1_V_16_16 = list.reverse_1_f_0(TypeInfo_28_28, (list.List_1) Ms_5);
      }
      V_16_16 = (list.List_1) conv1_V_16_16;
      TypeCtorInfo_29_29 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
      {
        Strs_6 = list.map_3_p_0(TypeInfo_28_28, TypeCtorInfo_29_29, (/* closure */ java.lang.Object[]) V_15_15, (list.List_1) V_16_16);
      }
//  errors.m:84
      return Strs_6;
    }
//  errors.m:37
  }
//  errors.m:34
  public static list.List_1 write_messages_5_p_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T_13,
    list.List_1 RevMs_6,
    /* closure */ java.lang.Object[] P_7)
  {
//  errors.m:68
    {
      boolean succeeded = false;
      list.List_1 HeadVar__2_2 = (list.List_1) errors.MR_scalar_common_1[0];
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_14_14 = jmercury.runtime.TypeInfo_Struct.maybe_new(errors.errors__type_ctor_info_err_loc_0);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_15_15 = jmercury.runtime.TypeInfo_Struct.maybe_new(errors.errors__type_ctor_info_message_1);
      jmercury.runtime.TypeInfo_Struct TypeInfo_16_16 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_17_17 = jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2);
      jmercury.runtime.TypeInfo_Struct TypeInfo_18_18 = null;
      list.List_1 Ms_9 = null;
//  errors.m:69
      list.List_1 conv0_Ms_9 = null;

      {
        TypeInfo_16_16 = new jmercury.runtime.TypeInfo_Struct(TypeCtorInfo_15_15, TypeInfo_for_T_13);
      }
      {
        TypeInfo_18_18 = new jmercury.runtime.TypeInfo_Struct(TypeCtorInfo_17_17, TypeCtorInfo_14_14, TypeInfo_16_16);
      }
      {
        conv0_Ms_9 = list.reverse_2_p_0(TypeInfo_18_18, (list.List_1) RevMs_6);
      }
      Ms_9 = (list.List_1) conv0_Ms_9;
//  errors.m:70
      {
        errors.write_msgs_4_p_0(TypeInfo_for_T_13, Ms_9, P_7);
      }
//  errors.m:68
      return HeadVar__2_2;
    }
//  errors.m:34
  }
//  errors.m:30
  public static list.List_1 add_3_p_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T_7,
    list.List_1 M1s_4,
    list.List_1 M2s_5)
  {
//  errors.m:66
    {
      boolean succeeded = false;
      list.List_1 Ms_6 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_8_8 = jmercury.runtime.TypeInfo_Struct.maybe_new(errors.errors__type_ctor_info_err_loc_0);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_9_9 = jmercury.runtime.TypeInfo_Struct.maybe_new(errors.errors__type_ctor_info_message_1);
      jmercury.runtime.TypeInfo_Struct TypeInfo_10_10 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_11_11 = jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2);
      jmercury.runtime.TypeInfo_Struct TypeInfo_12_12 = null;
      list.List_1 conv0_Ms_6 = null;

      {
        TypeInfo_10_10 = new jmercury.runtime.TypeInfo_Struct(TypeCtorInfo_9_9, TypeInfo_for_T_7);
      }
      {
        TypeInfo_12_12 = new jmercury.runtime.TypeInfo_Struct(TypeCtorInfo_11_11, TypeCtorInfo_8_8, TypeInfo_10_10);
      }
      {
        conv0_Ms_6 = list.append_3_p_1(TypeInfo_12_12, (list.List_1) M1s_4, (list.List_1) M2s_5);
      }
      Ms_6 = (list.List_1) conv0_Ms_6;
      return Ms_6;
    }
//  errors.m:30
  }
//  errors.m:28
  public static boolean no_messages_1_p_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_2_2,
    list.List_1 HeadVar__1_1)
  {
//  errors.m:64
    {
      boolean succeeded = (HeadVar__1_1.data_tag == 0);

      return succeeded;
    }
//  errors.m:28
  }
//  errors.m:26
  public static list.List_1 add_warning_4_p_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T_11,
    errors.Err_loc_0 L_5,
    java.lang.Object W_6,
    list.List_1 Errors_7)
  {
//  errors.m:62
    {
      boolean succeeded = false;
      list.List_1 HeadVar__4_4 = null;
      pair.Pair_2 V_8_8 = null;
      errors.Message_1 V_9_9 = null;
      errors.Msg_type_0 V_10_10 = errors.Msg_type_0.K1;

      {
        V_9_9 = new errors.Message_1(V_10_10, W_6);
      }
      {
        V_8_8 = new pair.Pair_2(((java.lang.Object) (L_5)), ((java.lang.Object) (V_9_9)));
      }
      {
        HeadVar__4_4 = new list.List_1.F_cons_2(((java.lang.Object) (V_8_8)), (list.List_1) Errors_7);
      }
      return HeadVar__4_4;
    }
//  errors.m:26
  }
//  errors.m:23
  public static list.List_1 add_warning_3_p_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T_10,
    java.lang.Object W_4,
    list.List_1 Errors_5)
  {
//  errors.m:60
    {
      boolean succeeded = false;
      list.List_1 HeadVar__3_3 = null;
      pair.Pair_2 V_6_6 = null;
      errors.Err_loc_0 V_7_7 = (errors.Err_loc_0) errors.MR_scalar_common_2[0];
      errors.Message_1 V_8_8 = null;
      errors.Msg_type_0 V_9_9 = errors.Msg_type_0.K1;

      {
        V_8_8 = new errors.Message_1(V_9_9, W_4);
      }
      {
        V_6_6 = new pair.Pair_2(((java.lang.Object) (V_7_7)), ((java.lang.Object) (V_8_8)));
      }
      {
        HeadVar__3_3 = new list.List_1.F_cons_2(((java.lang.Object) (V_6_6)), (list.List_1) Errors_5);
      }
      return HeadVar__3_3;
    }
//  errors.m:23
  }
//  errors.m:20
  public static list.List_1 add_error_4_p_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T_11,
    errors.Err_loc_0 L_5,
    java.lang.Object E_6,
    list.List_1 Errors_7)
  {
//  errors.m:58
    {
      boolean succeeded = false;
      list.List_1 HeadVar__4_4 = null;
      pair.Pair_2 V_8_8 = null;
      errors.Message_1 V_9_9 = null;
      errors.Msg_type_0 V_10_10 = errors.Msg_type_0.K0;

      {
        V_9_9 = new errors.Message_1(V_10_10, E_6);
      }
      {
        V_8_8 = new pair.Pair_2(((java.lang.Object) (L_5)), ((java.lang.Object) (V_9_9)));
      }
      {
        HeadVar__4_4 = new list.List_1.F_cons_2(((java.lang.Object) (V_8_8)), (list.List_1) Errors_7);
      }
      return HeadVar__4_4;
    }
//  errors.m:20
  }
//  errors.m:17
  public static list.List_1 add_error_3_p_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_for_T_10,
    java.lang.Object E_4,
    list.List_1 Errors_5)
  {
//  errors.m:56
    {
      boolean succeeded = false;
      list.List_1 HeadVar__3_3 = null;
      pair.Pair_2 V_6_6 = null;
      errors.Err_loc_0 V_7_7 = (errors.Err_loc_0) errors.MR_scalar_common_2[0];
      errors.Message_1 V_8_8 = null;
      errors.Msg_type_0 V_9_9 = errors.Msg_type_0.K0;

      {
        V_8_8 = new errors.Message_1(V_9_9, E_4);
      }
      {
        V_6_6 = new pair.Pair_2(((java.lang.Object) (V_7_7)), ((java.lang.Object) (V_8_8)));
      }
      {
        HeadVar__3_3 = new list.List_1.F_cons_2(((java.lang.Object) (V_6_6)), (list.List_1) Errors_5);
      }
      return HeadVar__3_3;
    }
//  errors.m:17
  }
//  errors.m:14
  public static list.List_1 new_messages_1_p_0(
    jmercury.runtime.TypeInfo_Struct TypeInfo_2_2)
  {
//  errors.m:54
    {
      boolean succeeded = false;
      list.List_1 HeadVar__1_1 = (list.List_1) errors.MR_scalar_common_1[0];

      return HeadVar__1_1;
    }
//  errors.m:14
  }

// ExportDefns

// ExportedEnums

// InitPreds

// FinalPreds

// EnvVarNames
  static {
    if (System.getenv("MERCURY_DEBUG_CLASS_INIT") != null) {
      System.out.println("[errors end init]");
    }
  }
}
// :- end_module errors.
