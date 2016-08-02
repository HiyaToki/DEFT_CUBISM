//
//
// Automatically generated from trips2bel.m by the Mercury Compiler,
// version 14.01.1, configured for x86_64-unknown-linux-gnu
//
//

/* :- module trips2bel. */

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
// import utils;
// import wordnet;
// import xml;
public class trips2bel {
  static {
    if (System.getenv("MERCURY_DEBUG_CLASS_INIT") != null) {
      System.out.println("[trips2bel start init]");
    }
  }

// RttiDefns
  private static final jmercury.runtime.TypeInfo_Struct maybe__pti_maybe_1__plain_wordnet__type_ctor_info_wndata_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct errors__ti_message_1sberrs__type_ctor_info_error_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1trips2bel__type_ctor_info_cvar_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__ti_pair_2trips2bel__type_ctor_info_concept2_0list__ti_list_1trips2bel__type_ctor_info_cvar_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_pair__ti_pair_2trips2bel__type_ctor_info_concept2_0list__ti_list_1trips2bel__type_ctor_info_cvar_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_list__ti_list_1trips2bel__type_ctor_info_cvar_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct set_ordlist__pti_set_ordlist_1__plain_trips2bel__type_ctor_info_cvar_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct set_ordlist__pti_set_ordlist_1__plain_builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1builtin__type_ctor_info_string_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1builtin__type_ctor_info_string_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__pti_list_1__plain_builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_trips2bel__type_ctor_info_vardef2_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1trips2bel__type_ctor_info_value_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__pti_pair_2__plain_builtin__type_ctor_info_string_0__plain_list__ti_list_1trips2bel__type_ctor_info_value_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__pti_list_1__plain_trips2bel__type_ctor_info_attr2_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__pti_list_1__plain_trips2bel__type_ctor_info_expr_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_attr2_0_0 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_attr2_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_attr2_0_1 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_attr2_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_attr2_0_2 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_attr2_0_2 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_attr2_0_3 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_attr2_0_3 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_attr2_0_4 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_attr2_0_4 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_attr2_0_5 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_attr2_0_5 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_attr2_0_6 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_attr2_0_6 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_attr2_0_7 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_attr2_0_7 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_attr2_0_8 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_attr2_0_8 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_attr2_0_9 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_attr2_0_9 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_attr2_0_10 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_attr2_0_10 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_attr2_0_11 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_attr2_0_11 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_attr2_0_12 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_attr2_0_12 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_stag_ordered_attr2_0_0 = new jmercury.runtime.DuFunctorDesc[13];
  private static final jmercury.runtime.DuPtagLayout[] trips2bel__du_ptag_ordered_attr2_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_name_ordered_attr2_0 = new jmercury.runtime.DuFunctorDesc[13];
  private static final int[] trips2bel__functor_number_map_attr2_0 = new int[13];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_attr2_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__ti_pair_2builtin__type_ctor_info_string_0list__ti_list_1trips2bel__type_ctor_info_value_0 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_attribute_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct set_ordlist__ti_set_ordlist_1trips2bel__type_ctor_info_cvar_0 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_class_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_concept2_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_concept2_0_1 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_concept2_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_concept2_0_2 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_concept2_0_2 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_concept2_0_3 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_concept2_0_4 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_concept2_0_4 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_concept2_0_5 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_concept2_0_5 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_stag_ordered_concept2_0_0 = new jmercury.runtime.DuFunctorDesc[6];
  private static final jmercury.runtime.DuPtagLayout[] trips2bel__du_ptag_ordered_concept2_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_name_ordered_concept2_0 = new jmercury.runtime.DuFunctorDesc[6];
  private static final int[] trips2bel__functor_number_map_concept2_0 = new int[6];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_concept2_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_conceptname_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_condval_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_condval_0_1 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] trips2bel__enum_value_ordered_condval_0 = new jmercury.runtime.EnumFunctorDesc[2];
  private static final jmercury.runtime.EnumFunctorDesc[] trips2bel__enum_name_ordered_condval_0 = new jmercury.runtime.EnumFunctorDesc[2];
  private static final int[] trips2bel__functor_number_map_condval_0 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_condval_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_cvar_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_cvar_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_stag_ordered_cvar_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] trips2bel__du_ptag_ordered_cvar_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_name_ordered_cvar_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] trips2bel__functor_number_map_cvar_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_cvar_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__ti_tree234_2trips2bel__type_ctor_info_cvar_0pair__ti_pair_2trips2bel__type_ctor_info_concept2_0list__ti_list_1trips2bel__type_ctor_info_cvar_0 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_cvarmap_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__ti_tree234_2trips2bel__type_ctor_info_cvar_0list__ti_list_1trips2bel__type_ctor_info_cvar_0 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_cvrmap_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_cxrelval_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_cxrelval_0_1 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_cxrelval_0_2 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] trips2bel__enum_value_ordered_cxrelval_0 = new jmercury.runtime.EnumFunctorDesc[3];
  private static final jmercury.runtime.EnumFunctorDesc[] trips2bel__enum_name_ordered_cxrelval_0 = new jmercury.runtime.EnumFunctorDesc[3];
  private static final int[] trips2bel__functor_number_map_cxrelval_0 = new int[3];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_cxrelval_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_expr_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_expr_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_expr_0_1 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_expr_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_stag_ordered_expr_0_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final jmercury.runtime.DuPtagLayout[] trips2bel__du_ptag_ordered_expr_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_name_ordered_expr_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final int[] trips2bel__functor_number_map_expr_0 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_expr_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_exptp_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_exptp_0_1 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_exptp_0_2 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_exptp_0_3 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_exptp_0_4 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_exptp_0_5 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_exptp_0_6 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_exptp_0_7 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_exptp_0_8 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_exptp_0_9 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_exptp_0_10 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_exptp_0_11 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] trips2bel__enum_value_ordered_exptp_0 = new jmercury.runtime.EnumFunctorDesc[12];
  private static final jmercury.runtime.EnumFunctorDesc[] trips2bel__enum_name_ordered_exptp_0 = new jmercury.runtime.EnumFunctorDesc[12];
  private static final int[] trips2bel__functor_number_map_exptp_0 = new int[12];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_exptp_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_fargval_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] trips2bel__enum_value_ordered_fargval_0 = new jmercury.runtime.EnumFunctorDesc[1];
  private static final jmercury.runtime.EnumFunctorDesc[] trips2bel__enum_name_ordered_fargval_0 = new jmercury.runtime.EnumFunctorDesc[1];
  private static final int[] trips2bel__functor_number_map_fargval_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_fargval_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_forceval_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_forceval_0_1 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_forceval_0_2 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_forceval_0_3 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_forceval_0_4 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_forceval_0_5 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_forceval_0_6 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_forceval_0_7 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] trips2bel__enum_value_ordered_forceval_0 = new jmercury.runtime.EnumFunctorDesc[8];
  private static final jmercury.runtime.EnumFunctorDesc[] trips2bel__enum_name_ordered_forceval_0 = new jmercury.runtime.EnumFunctorDesc[8];
  private static final int[] trips2bel__functor_number_map_forceval_0 = new int[8];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_forceval_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_negval_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] trips2bel__enum_value_ordered_negval_0 = new jmercury.runtime.EnumFunctorDesc[1];
  private static final jmercury.runtime.EnumFunctorDesc[] trips2bel__enum_name_ordered_negval_0 = new jmercury.runtime.EnumFunctorDesc[1];
  private static final int[] trips2bel__functor_number_map_negval_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_negval_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_opval_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_opval_0_1 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_opval_0_2 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_opval_0_3 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_opval_0_4 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_opval_0_5 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_opval_0_6 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_opval_0_7 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] trips2bel__enum_value_ordered_opval_0 = new jmercury.runtime.EnumFunctorDesc[8];
  private static final jmercury.runtime.EnumFunctorDesc[] trips2bel__enum_name_ordered_opval_0 = new jmercury.runtime.EnumFunctorDesc[8];
  private static final int[] trips2bel__functor_number_map_opval_0 = new int[8];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_opval_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_orientval_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_orientval_0_1 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_orientval_0_2 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_orientval_0_3 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_orientval_0_4 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] trips2bel__enum_value_ordered_orientval_0 = new jmercury.runtime.EnumFunctorDesc[5];
  private static final jmercury.runtime.EnumFunctorDesc[] trips2bel__enum_name_ordered_orientval_0 = new jmercury.runtime.EnumFunctorDesc[5];
  private static final int[] trips2bel__functor_number_map_orientval_0 = new int[5];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_orientval_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_1 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_2 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_3 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_4 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_5 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_6 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_7 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_8 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_9 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_10 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_11 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_12 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_13 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_14 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_15 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_16 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_17 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_18 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_19 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_20 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_21 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_22 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_23 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_24 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_25 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_26 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_27 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_28 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_29 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_30 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_31 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_32 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_33 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_34 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_35 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_36 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_37 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_38 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_39 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_40 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_41 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_42 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_43 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_44 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_45 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_46 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_47 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_48 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_49 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_50 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_51 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_52 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_53 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_54 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_55 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_56 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_57 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_reftp_0_58 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] trips2bel__enum_value_ordered_reftp_0 = new jmercury.runtime.EnumFunctorDesc[59];
  private static final jmercury.runtime.EnumFunctorDesc[] trips2bel__enum_name_ordered_reftp_0 = new jmercury.runtime.EnumFunctorDesc[59];
  private static final int[] trips2bel__functor_number_map_reftp_0 = new int[59];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_reftp_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_role_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1trips2bel__type_ctor_info_vardef_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_sent_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_sent_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_stag_ordered_sent_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] trips2bel__du_ptag_ordered_sent_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_name_ordered_sent_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] trips2bel__functor_number_map_sent_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_sent_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__ti_tree234_2builtin__type_ctor_info_int_0trips2bel__type_ctor_info_vardef2_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_sent2_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_sent2_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_stag_ordered_sent2_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] trips2bel__du_ptag_ordered_sent2_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_name_ordered_sent2_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] trips2bel__functor_number_map_sent2_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_sent2_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1trips2bel__type_ctor_info_expr_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_sent3_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_sent3_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_stag_ordered_sent3_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] trips2bel__du_ptag_ordered_sent3_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_name_ordered_sent3_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] trips2bel__functor_number_map_sent3_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_sent3_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_speaker_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_superclass_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__ti_tree234_2trips2bel__type_ctor_info_cvar_0builtin__type_ctor_info_string_0 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_symmap_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_tconst_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_tconst_0_1 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_tconst_0_2 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_tconst_0_3 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_tconst_0_4 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_tconst_0_5 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_tconst_0_6 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_tconst_0_7 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_tconst_0_8 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_tconst_0_9 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_tconst_0_10 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_tconst_0_11 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_tconst_0_12 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_tconst_0_13 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_tconst_0_14 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_tconst_0_15 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc trips2bel__enum_functor_desc_tconst_0_16 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] trips2bel__enum_value_ordered_tconst_0 = new jmercury.runtime.EnumFunctorDesc[17];
  private static final jmercury.runtime.EnumFunctorDesc[] trips2bel__enum_name_ordered_tconst_0 = new jmercury.runtime.EnumFunctorDesc[17];
  private static final int[] trips2bel__functor_number_map_tconst_0 = new int[17];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_tconst_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_text_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1trips2bel__type_ctor_info_turn_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_trfile_0_0 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_trfile_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_stag_ordered_trfile_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] trips2bel__du_ptag_ordered_trfile_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_name_ordered_trfile_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] trips2bel__functor_number_map_trfile_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_trfile_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1trips2bel__type_ctor_info_turn2_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_trfile2_0_0 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_trfile2_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_stag_ordered_trfile2_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] trips2bel__du_ptag_ordered_trfile2_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_name_ordered_trfile2_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] trips2bel__functor_number_map_trfile2_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_trfile2_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1trips2bel__type_ctor_info_turn3_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_trfile3_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_trfile3_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_stag_ordered_trfile3_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] trips2bel__du_ptag_ordered_trfile3_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_name_ordered_trfile3_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] trips2bel__functor_number_map_trfile3_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_trfile3_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1trips2bel__type_ctor_info_sent_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_turn_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_turn_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_stag_ordered_turn_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] trips2bel__du_ptag_ordered_turn_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_name_ordered_turn_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] trips2bel__functor_number_map_turn_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_turn_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1trips2bel__type_ctor_info_sent2_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_turn2_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_turn2_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_stag_ordered_turn2_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] trips2bel__du_ptag_ordered_turn2_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_name_ordered_turn2_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] trips2bel__functor_number_map_turn2_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_turn2_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1trips2bel__type_ctor_info_sent3_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_turn3_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_turn3_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_stag_ordered_turn3_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] trips2bel__du_ptag_ordered_turn3_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_name_ordered_turn3_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] trips2bel__functor_number_map_turn3_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_turn3_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_turnno_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_value_0_0 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_value_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_value_0_1 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_value_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_value_0_2 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_value_0_2 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_value_0_3 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_value_0_3 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_stag_ordered_value_0_0 = new jmercury.runtime.DuFunctorDesc[4];
  private static final jmercury.runtime.DuPtagLayout[] trips2bel__du_ptag_ordered_value_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_name_ordered_value_0 = new jmercury.runtime.DuFunctorDesc[4];
  private static final int[] trips2bel__functor_number_map_value_0 = new int[4];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_value_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_var_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0list__ti_list_1trips2bel__type_ctor_info_value_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_vardef_0_0 = new jmercury.runtime.PseudoTypeInfo[4];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_vardef_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_stag_ordered_vardef_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] trips2bel__du_ptag_ordered_vardef_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_name_ordered_vardef_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] trips2bel__functor_number_map_vardef_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_vardef_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1trips2bel__type_ctor_info_attr2_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_vardef2_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_vardef2_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_stag_ordered_vardef2_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] trips2bel__du_ptag_ordered_vardef2_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_name_ordered_vardef2_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] trips2bel__functor_number_map_vardef2_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_vardef2_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__ti_tree234_2trips2bel__type_ctor_info_cvar_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_varmap_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_vdmap_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct set_ordlist__ti_set_ordlist_1builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1list__ti_list_1builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] trips2bel__field_types_vertices_0_0 = new jmercury.runtime.PseudoTypeInfo[4];
  private static final jmercury.runtime.DuFunctorDesc trips2bel__du_functor_desc_vertices_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_stag_ordered_vertices_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] trips2bel__du_ptag_ordered_vertices_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] trips2bel__du_name_ordered_vertices_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] trips2bel__functor_number_map_vertices_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct trips2bel__type_ctor_info_vertices_0 = new jmercury.runtime.TypeCtorInfo_Struct();
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
    errors__ti_message_1sberrs__type_ctor_info_error_0.init(errors.errors__type_ctor_info_message_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0)});
    //
    //
    //
    pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(errors.errors__type_ctor_info_err_loc_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.errors__ti_message_1sberrs__type_ctor_info_error_0)});
    //
    //
    list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) trips2bel.pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0});
    //
    //
    list__ti_list_1trips2bel__type_ctor_info_cvar_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_cvar_0)});
    //
    //
    pair__ti_pair_2trips2bel__type_ctor_info_concept2_0list__ti_list_1trips2bel__type_ctor_info_cvar_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_concept2_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.list__ti_list_1trips2bel__type_ctor_info_cvar_0)});
    //
    //
    tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_pair__ti_pair_2trips2bel__type_ctor_info_concept2_0list__ti_list_1trips2bel__type_ctor_info_cvar_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_cvar_0,
		(jmercury.runtime.PseudoTypeInfo) trips2bel.pair__ti_pair_2trips2bel__type_ctor_info_concept2_0list__ti_list_1trips2bel__type_ctor_info_cvar_0});
    //
    tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_list__ti_list_1trips2bel__type_ctor_info_cvar_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_cvar_0,
		(jmercury.runtime.PseudoTypeInfo) trips2bel.list__ti_list_1trips2bel__type_ctor_info_cvar_0});
    //
    //
    set_ordlist__pti_set_ordlist_1__plain_trips2bel__type_ctor_info_cvar_0.init(set_ordlist.set_ordlist__type_ctor_info_set_ordlist_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_cvar_0});
    //
    //
    set_ordlist__pti_set_ordlist_1__plain_builtin__type_ctor_info_int_0.init(set_ordlist.set_ordlist__type_ctor_info_set_ordlist_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0});
    //
    tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_builtin__type_ctor_info_int_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_cvar_0,
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0});
    //
    //
    list__ti_list_1builtin__type_ctor_info_string_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0)});
    //
    tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1builtin__type_ctor_info_string_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0,
		(jmercury.runtime.PseudoTypeInfo) trips2bel.list__ti_list_1builtin__type_ctor_info_string_0});
    //
    list__pti_list_1__plain_builtin__type_ctor_info_int_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0});
    //
    //
    tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_trips2bel__type_ctor_info_vardef2_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0,
		(jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_vardef2_0});
    //
    //
    list__ti_list_1trips2bel__type_ctor_info_value_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_value_0)});
    //
    pair__pti_pair_2__plain_builtin__type_ctor_info_string_0__plain_list__ti_list_1trips2bel__type_ctor_info_value_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0,
		(jmercury.runtime.PseudoTypeInfo) trips2bel.list__ti_list_1trips2bel__type_ctor_info_value_0});
    //
    //
    list__pti_list_1__plain_trips2bel__type_ctor_info_attr2_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_attr2_0});
    //
    //
    list__pti_list_1__plain_trips2bel__type_ctor_info_expr_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_expr_0});
    //
    //
    trips2bel__field_types_attr2_0_0[0] = (jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_reftp_0;
    trips2bel__field_types_attr2_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    trips2bel__du_functor_desc_attr2_0_0.init("ref",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		0,
		trips2bel.trips2bel__field_types_attr2_0_0,
		null,
		null,
		null);
    //
    trips2bel__field_types_attr2_0_1[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    trips2bel__du_functor_desc_attr2_0_1.init("coref",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		trips2bel.trips2bel__field_types_attr2_0_1,
		null,
		null,
		null);
    //
    list__ti_list_1builtin__type_ctor_info_int_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0)});
    //
    trips2bel__field_types_attr2_0_2[0] = (jmercury.runtime.PseudoTypeInfo) trips2bel.list__ti_list_1builtin__type_ctor_info_int_0;
    //
    trips2bel__du_functor_desc_attr2_0_2.init("mods",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		2,
		2,
		trips2bel.trips2bel__field_types_attr2_0_2,
		null,
		null,
		null);
    //
    //
    trips2bel__field_types_attr2_0_3[0] = (jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_forceval_0;
    //
    trips2bel__du_functor_desc_attr2_0_3.init("force",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		3,
		3,
		trips2bel.trips2bel__field_types_attr2_0_3,
		null,
		null,
		null);
    //
    //
    trips2bel__field_types_attr2_0_4[0] = (jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_opval_0;
    //
    trips2bel__du_functor_desc_attr2_0_4.init("operator",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		4,
		4,
		trips2bel.trips2bel__field_types_attr2_0_4,
		null,
		null,
		null);
    //
    //
    trips2bel__field_types_attr2_0_5[0] = (jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_orientval_0;
    //
    trips2bel__du_functor_desc_attr2_0_5.init("orientation",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		5,
		5,
		trips2bel.trips2bel__field_types_attr2_0_5,
		null,
		null,
		null);
    //
    trips2bel__field_types_attr2_0_6[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    trips2bel__du_functor_desc_attr2_0_6.init("proform",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		6,
		6,
		trips2bel.trips2bel__field_types_attr2_0_6,
		null,
		null,
		null);
    //
    //
    trips2bel__field_types_attr2_0_7[0] = (jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_condval_0;
    trips2bel__field_types_attr2_0_7[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    trips2bel__du_functor_desc_attr2_0_7.init("condition",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		7,
		7,
		trips2bel.trips2bel__field_types_attr2_0_7,
		null,
		null,
		null);
    //
    trips2bel__field_types_attr2_0_8[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    trips2bel__field_types_attr2_0_8[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    trips2bel__du_functor_desc_attr2_0_8.init("acts",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		8,
		8,
		trips2bel.trips2bel__field_types_attr2_0_8,
		null,
		null,
		null);
    //
    //
    trips2bel__field_types_attr2_0_9[0] = (jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_negval_0;
    //
    trips2bel__du_functor_desc_attr2_0_9.init("negation",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		9,
		9,
		trips2bel.trips2bel__field_types_attr2_0_9,
		null,
		null,
		null);
    //
    //
    trips2bel__field_types_attr2_0_10[0] = (jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_fargval_0;
    //
    trips2bel__du_functor_desc_attr2_0_10.init("functn_arg",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		10,
		10,
		trips2bel.trips2bel__field_types_attr2_0_10,
		null,
		null,
		null);
    //
    //
    trips2bel__field_types_attr2_0_11[0] = (jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_cxrelval_0;
    //
    trips2bel__du_functor_desc_attr2_0_11.init("context_rel",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		11,
		11,
		trips2bel.trips2bel__field_types_attr2_0_11,
		null,
		null,
		null);
    //
    trips2bel__field_types_attr2_0_12[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    trips2bel__field_types_attr2_0_12[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    trips2bel__du_functor_desc_attr2_0_12.init("name_modifiers",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		12,
		12,
		trips2bel.trips2bel__field_types_attr2_0_12,
		null,
		null,
		null);
    //
    trips2bel__du_stag_ordered_attr2_0_0[0] = trips2bel.trips2bel__du_functor_desc_attr2_0_0;
    trips2bel__du_stag_ordered_attr2_0_0[1] = trips2bel.trips2bel__du_functor_desc_attr2_0_1;
    trips2bel__du_stag_ordered_attr2_0_0[2] = trips2bel.trips2bel__du_functor_desc_attr2_0_2;
    trips2bel__du_stag_ordered_attr2_0_0[3] = trips2bel.trips2bel__du_functor_desc_attr2_0_3;
    trips2bel__du_stag_ordered_attr2_0_0[4] = trips2bel.trips2bel__du_functor_desc_attr2_0_4;
    trips2bel__du_stag_ordered_attr2_0_0[5] = trips2bel.trips2bel__du_functor_desc_attr2_0_5;
    trips2bel__du_stag_ordered_attr2_0_0[6] = trips2bel.trips2bel__du_functor_desc_attr2_0_6;
    trips2bel__du_stag_ordered_attr2_0_0[7] = trips2bel.trips2bel__du_functor_desc_attr2_0_7;
    trips2bel__du_stag_ordered_attr2_0_0[8] = trips2bel.trips2bel__du_functor_desc_attr2_0_8;
    trips2bel__du_stag_ordered_attr2_0_0[9] = trips2bel.trips2bel__du_functor_desc_attr2_0_9;
    trips2bel__du_stag_ordered_attr2_0_0[10] = trips2bel.trips2bel__du_functor_desc_attr2_0_10;
    trips2bel__du_stag_ordered_attr2_0_0[11] = trips2bel.trips2bel__du_functor_desc_attr2_0_11;
    trips2bel__du_stag_ordered_attr2_0_0[12] = trips2bel.trips2bel__du_functor_desc_attr2_0_12;
    //
    trips2bel__du_ptag_ordered_attr2_0[0] = new jmercury.runtime.DuPtagLayout(13,
		private_builtin.MR_SECTAG_REMOTE,
		trips2bel.trips2bel__du_stag_ordered_attr2_0_0);
    //
    trips2bel__du_name_ordered_attr2_0[0] = trips2bel.trips2bel__du_functor_desc_attr2_0_8;
    trips2bel__du_name_ordered_attr2_0[1] = trips2bel.trips2bel__du_functor_desc_attr2_0_7;
    trips2bel__du_name_ordered_attr2_0[2] = trips2bel.trips2bel__du_functor_desc_attr2_0_11;
    trips2bel__du_name_ordered_attr2_0[3] = trips2bel.trips2bel__du_functor_desc_attr2_0_1;
    trips2bel__du_name_ordered_attr2_0[4] = trips2bel.trips2bel__du_functor_desc_attr2_0_3;
    trips2bel__du_name_ordered_attr2_0[5] = trips2bel.trips2bel__du_functor_desc_attr2_0_10;
    trips2bel__du_name_ordered_attr2_0[6] = trips2bel.trips2bel__du_functor_desc_attr2_0_2;
    trips2bel__du_name_ordered_attr2_0[7] = trips2bel.trips2bel__du_functor_desc_attr2_0_12;
    trips2bel__du_name_ordered_attr2_0[8] = trips2bel.trips2bel__du_functor_desc_attr2_0_9;
    trips2bel__du_name_ordered_attr2_0[9] = trips2bel.trips2bel__du_functor_desc_attr2_0_4;
    trips2bel__du_name_ordered_attr2_0[10] = trips2bel.trips2bel__du_functor_desc_attr2_0_5;
    trips2bel__du_name_ordered_attr2_0[11] = trips2bel.trips2bel__du_functor_desc_attr2_0_6;
    trips2bel__du_name_ordered_attr2_0[12] = trips2bel.trips2bel__du_functor_desc_attr2_0_0;
    //
    trips2bel__functor_number_map_attr2_0[0] = 12;
    trips2bel__functor_number_map_attr2_0[1] = 3;
    trips2bel__functor_number_map_attr2_0[2] = 6;
    trips2bel__functor_number_map_attr2_0[3] = 4;
    trips2bel__functor_number_map_attr2_0[4] = 9;
    trips2bel__functor_number_map_attr2_0[5] = 10;
    trips2bel__functor_number_map_attr2_0[6] = 11;
    trips2bel__functor_number_map_attr2_0[7] = 1;
    trips2bel__functor_number_map_attr2_0[8] = 0;
    trips2bel__functor_number_map_attr2_0[9] = 8;
    trips2bel__functor_number_map_attr2_0[10] = 5;
    trips2bel__functor_number_map_attr2_0[11] = 2;
    trips2bel__functor_number_map_attr2_0[12] = 7;
    //
    trips2bel__type_ctor_info_attr2_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(0))),
		((java.lang.Object) (new AddrOf2_0(1))),
		"trips2bel",
		"attr2",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__du_name_ordered_attr2_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__du_ptag_ordered_attr2_0),
		13,
		4,
		trips2bel.trips2bel__functor_number_map_attr2_0);
    //
    pair__ti_pair_2builtin__type_ctor_info_string_0list__ti_list_1trips2bel__type_ctor_info_value_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.list__ti_list_1trips2bel__type_ctor_info_value_0)});
    //
    trips2bel__type_ctor_info_attribute_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(2))),
		((java.lang.Object) (new AddrOf2_0(3))),
		"trips2bel",
		"attribute",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) trips2bel.pair__ti_pair_2builtin__type_ctor_info_string_0list__ti_list_1trips2bel__type_ctor_info_value_0),
		-1,
		0,
		null);
    //
    set_ordlist__ti_set_ordlist_1trips2bel__type_ctor_info_cvar_0.init(set_ordlist.set_ordlist__type_ctor_info_set_ordlist_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_cvar_0)});
    //
    trips2bel__type_ctor_info_class_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(4))),
		((java.lang.Object) (new AddrOf2_0(5))),
		"trips2bel",
		"class",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) trips2bel.set_ordlist__ti_set_ordlist_1trips2bel__type_ctor_info_cvar_0),
		-1,
		0,
		null);
    //
    trips2bel__du_functor_desc_concept2_0_0.init("empty",
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
    trips2bel__field_types_concept2_0_1[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    trips2bel__du_functor_desc_concept2_0_1.init("super",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		2,
		1,
		trips2bel.trips2bel__field_types_concept2_0_1,
		null,
		null,
		null);
    //
    trips2bel__field_types_concept2_0_2[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    trips2bel__du_functor_desc_concept2_0_2.init("wordnet",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		3,
		2,
		trips2bel.trips2bel__field_types_concept2_0_2,
		null,
		null,
		null);
    //
    trips2bel__du_functor_desc_concept2_0_3.init("abstract",
		0,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		3,
		null,
		null,
		null,
		null);
    //
    trips2bel__field_types_concept2_0_4[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    trips2bel__du_functor_desc_concept2_0_4.init("closedclass",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		4,
		4,
		trips2bel.trips2bel__field_types_concept2_0_4,
		null,
		null,
		null);
    //
    trips2bel__field_types_concept2_0_5[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    trips2bel__du_functor_desc_concept2_0_5.init("unrecognised",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		5,
		5,
		trips2bel.trips2bel__field_types_concept2_0_5,
		null,
		null,
		null);
    //
    trips2bel__du_stag_ordered_concept2_0_0[0] = trips2bel.trips2bel__du_functor_desc_concept2_0_0;
    trips2bel__du_stag_ordered_concept2_0_0[1] = trips2bel.trips2bel__du_functor_desc_concept2_0_3;
    trips2bel__du_stag_ordered_concept2_0_0[2] = trips2bel.trips2bel__du_functor_desc_concept2_0_1;
    trips2bel__du_stag_ordered_concept2_0_0[3] = trips2bel.trips2bel__du_functor_desc_concept2_0_2;
    trips2bel__du_stag_ordered_concept2_0_0[4] = trips2bel.trips2bel__du_functor_desc_concept2_0_4;
    trips2bel__du_stag_ordered_concept2_0_0[5] = trips2bel.trips2bel__du_functor_desc_concept2_0_5;
    //
    trips2bel__du_ptag_ordered_concept2_0[0] = new jmercury.runtime.DuPtagLayout(6,
		private_builtin.MR_SECTAG_REMOTE,
		trips2bel.trips2bel__du_stag_ordered_concept2_0_0);
    //
    trips2bel__du_name_ordered_concept2_0[0] = trips2bel.trips2bel__du_functor_desc_concept2_0_3;
    trips2bel__du_name_ordered_concept2_0[1] = trips2bel.trips2bel__du_functor_desc_concept2_0_4;
    trips2bel__du_name_ordered_concept2_0[2] = trips2bel.trips2bel__du_functor_desc_concept2_0_0;
    trips2bel__du_name_ordered_concept2_0[3] = trips2bel.trips2bel__du_functor_desc_concept2_0_1;
    trips2bel__du_name_ordered_concept2_0[4] = trips2bel.trips2bel__du_functor_desc_concept2_0_5;
    trips2bel__du_name_ordered_concept2_0[5] = trips2bel.trips2bel__du_functor_desc_concept2_0_2;
    //
    trips2bel__functor_number_map_concept2_0[0] = 2;
    trips2bel__functor_number_map_concept2_0[1] = 3;
    trips2bel__functor_number_map_concept2_0[2] = 5;
    trips2bel__functor_number_map_concept2_0[3] = 0;
    trips2bel__functor_number_map_concept2_0[4] = 1;
    trips2bel__functor_number_map_concept2_0[5] = 4;
    //
    trips2bel__type_ctor_info_concept2_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(6))),
		((java.lang.Object) (new AddrOf2_0(7))),
		"trips2bel",
		"concept2",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__du_name_ordered_concept2_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__du_ptag_ordered_concept2_0),
		6,
		4,
		trips2bel.trips2bel__functor_number_map_concept2_0);
    //
    trips2bel__type_ctor_info_conceptname_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(8))),
		((java.lang.Object) (new AddrOf2_0(9))),
		"trips2bel",
		"conceptname",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0),
		-1,
		0,
		null);
    //
    trips2bel__enum_functor_desc_condval_0_0.init("iff",
		0);
    //
    trips2bel__enum_functor_desc_condval_0_1.init("unless",
		1);
    //
    trips2bel__enum_value_ordered_condval_0[0] = trips2bel.trips2bel__enum_functor_desc_condval_0_0;
    trips2bel__enum_value_ordered_condval_0[1] = trips2bel.trips2bel__enum_functor_desc_condval_0_1;
    //
    trips2bel__enum_name_ordered_condval_0[0] = trips2bel.trips2bel__enum_functor_desc_condval_0_0;
    trips2bel__enum_name_ordered_condval_0[1] = trips2bel.trips2bel__enum_functor_desc_condval_0_1;
    //
    trips2bel__functor_number_map_condval_0[0] = 0;
    trips2bel__functor_number_map_condval_0[1] = 1;
    //
    trips2bel__type_ctor_info_condval_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_ENUM,
		((java.lang.Object) (new AddrOf2_0(10))),
		((java.lang.Object) (new AddrOf2_0(11))),
		"trips2bel",
		"condval",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__enum_name_ordered_condval_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__enum_value_ordered_condval_0),
		2,
		4,
		trips2bel.trips2bel__functor_number_map_condval_0);
    //
    trips2bel__field_types_cvar_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    trips2bel__field_types_cvar_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    trips2bel__field_types_cvar_0_0[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    trips2bel__du_functor_desc_cvar_0_0.init("cvar",
		3,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		trips2bel.trips2bel__field_types_cvar_0_0,
		null,
		null,
		null);
    //
    trips2bel__du_stag_ordered_cvar_0_0[0] = trips2bel.trips2bel__du_functor_desc_cvar_0_0;
    //
    trips2bel__du_ptag_ordered_cvar_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		trips2bel.trips2bel__du_stag_ordered_cvar_0_0);
    //
    trips2bel__du_name_ordered_cvar_0[0] = trips2bel.trips2bel__du_functor_desc_cvar_0_0;
    //
    trips2bel__functor_number_map_cvar_0[0] = 0;
    //
    trips2bel__type_ctor_info_cvar_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(12))),
		((java.lang.Object) (new AddrOf2_0(13))),
		"trips2bel",
		"cvar",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__du_name_ordered_cvar_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__du_ptag_ordered_cvar_0),
		1,
		4,
		trips2bel.trips2bel__functor_number_map_cvar_0);
    //
    tree234__ti_tree234_2trips2bel__type_ctor_info_cvar_0pair__ti_pair_2trips2bel__type_ctor_info_concept2_0list__ti_list_1trips2bel__type_ctor_info_cvar_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_cvar_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.pair__ti_pair_2trips2bel__type_ctor_info_concept2_0list__ti_list_1trips2bel__type_ctor_info_cvar_0)});
    //
    trips2bel__type_ctor_info_cvarmap_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(14))),
		((java.lang.Object) (new AddrOf2_0(15))),
		"trips2bel",
		"cvarmap",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) trips2bel.tree234__ti_tree234_2trips2bel__type_ctor_info_cvar_0pair__ti_pair_2trips2bel__type_ctor_info_concept2_0list__ti_list_1trips2bel__type_ctor_info_cvar_0),
		-1,
		0,
		null);
    //
    tree234__ti_tree234_2trips2bel__type_ctor_info_cvar_0list__ti_list_1trips2bel__type_ctor_info_cvar_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_cvar_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.list__ti_list_1trips2bel__type_ctor_info_cvar_0)});
    //
    trips2bel__type_ctor_info_cvrmap_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(16))),
		((java.lang.Object) (new AddrOf2_0(17))),
		"trips2bel",
		"cvrmap",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) trips2bel.tree234__ti_tree234_2trips2bel__type_ctor_info_cvar_0list__ti_list_1trips2bel__type_ctor_info_cvar_0),
		-1,
		0,
		null);
    //
    trips2bel__enum_functor_desc_cxrelval_0_0.init("utt_frag",
		0);
    //
    trips2bel__enum_functor_desc_cxrelval_0_1.init("dobj",
		1);
    //
    trips2bel__enum_functor_desc_cxrelval_0_2.init("lsubj",
		2);
    //
    trips2bel__enum_value_ordered_cxrelval_0[0] = trips2bel.trips2bel__enum_functor_desc_cxrelval_0_0;
    trips2bel__enum_value_ordered_cxrelval_0[1] = trips2bel.trips2bel__enum_functor_desc_cxrelval_0_1;
    trips2bel__enum_value_ordered_cxrelval_0[2] = trips2bel.trips2bel__enum_functor_desc_cxrelval_0_2;
    //
    trips2bel__enum_name_ordered_cxrelval_0[0] = trips2bel.trips2bel__enum_functor_desc_cxrelval_0_1;
    trips2bel__enum_name_ordered_cxrelval_0[1] = trips2bel.trips2bel__enum_functor_desc_cxrelval_0_2;
    trips2bel__enum_name_ordered_cxrelval_0[2] = trips2bel.trips2bel__enum_functor_desc_cxrelval_0_0;
    //
    trips2bel__functor_number_map_cxrelval_0[0] = 2;
    trips2bel__functor_number_map_cxrelval_0[1] = 0;
    trips2bel__functor_number_map_cxrelval_0[2] = 1;
    //
    trips2bel__type_ctor_info_cxrelval_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_ENUM,
		((java.lang.Object) (new AddrOf2_0(18))),
		((java.lang.Object) (new AddrOf2_0(19))),
		"trips2bel",
		"cxrelval",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__enum_name_ordered_cxrelval_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__enum_value_ordered_cxrelval_0),
		3,
		4,
		trips2bel.trips2bel__functor_number_map_cxrelval_0);
    //
    //
    trips2bel__field_types_expr_0_0[0] = (jmercury.runtime.PseudoTypeInfo) bool.bool__type_ctor_info_bool_0;
    trips2bel__field_types_expr_0_0[1] = (jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_concept2_0;
    trips2bel__field_types_expr_0_0[2] = (jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_cvar_0;
    //
    trips2bel__du_functor_desc_expr_0_0.init("class",
		3,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		0,
		trips2bel.trips2bel__field_types_expr_0_0,
		null,
		null,
		null);
    //
    trips2bel__field_types_expr_0_1[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    trips2bel__field_types_expr_0_1[1] = (jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_cvar_0;
    trips2bel__field_types_expr_0_1[2] = (jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_cvar_0;
    //
    trips2bel__du_functor_desc_expr_0_1.init("objprop",
		3,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		trips2bel.trips2bel__field_types_expr_0_1,
		null,
		null,
		null);
    //
    trips2bel__du_stag_ordered_expr_0_0[0] = trips2bel.trips2bel__du_functor_desc_expr_0_0;
    trips2bel__du_stag_ordered_expr_0_0[1] = trips2bel.trips2bel__du_functor_desc_expr_0_1;
    //
    trips2bel__du_ptag_ordered_expr_0[0] = new jmercury.runtime.DuPtagLayout(2,
		private_builtin.MR_SECTAG_REMOTE,
		trips2bel.trips2bel__du_stag_ordered_expr_0_0);
    //
    trips2bel__du_name_ordered_expr_0[0] = trips2bel.trips2bel__du_functor_desc_expr_0_0;
    trips2bel__du_name_ordered_expr_0[1] = trips2bel.trips2bel__du_functor_desc_expr_0_1;
    //
    trips2bel__functor_number_map_expr_0[0] = 0;
    trips2bel__functor_number_map_expr_0[1] = 1;
    //
    trips2bel__type_ctor_info_expr_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(20))),
		((java.lang.Object) (new AddrOf2_0(21))),
		"trips2bel",
		"expr",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__du_name_ordered_expr_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__du_ptag_ordered_expr_0),
		2,
		4,
		trips2bel.trips2bel__functor_number_map_expr_0);
    //
    trips2bel__enum_functor_desc_exptp_0_0.init("ONT::MANAGE-CONVERSATION",
		0);
    //
    trips2bel__enum_functor_desc_exptp_0_1.init("ONT::REQUEST",
		1);
    //
    trips2bel__enum_functor_desc_exptp_0_2.init("ONT::FRAGMENT",
		2);
    //
    trips2bel__enum_functor_desc_exptp_0_3.init("ONT::ASK-WHAT-IS",
		3);
    //
    trips2bel__enum_functor_desc_exptp_0_4.init("ONT::ASK-IF",
		4);
    //
    trips2bel__enum_functor_desc_exptp_0_5.init("ONT::ANSWER",
		5);
    //
    trips2bel__enum_functor_desc_exptp_0_6.init("ONT::IDENTIFY",
		6);
    //
    trips2bel__enum_functor_desc_exptp_0_7.init("ONT::EVALUATE",
		7);
    //
    trips2bel__enum_functor_desc_exptp_0_8.init("ONT::REJECT",
		8);
    //
    trips2bel__enum_functor_desc_exptp_0_9.init("ONT::PROPOSE",
		9);
    //
    trips2bel__enum_functor_desc_exptp_0_10.init("ONT::ELLIPSIS",
		10);
    //
    trips2bel__enum_functor_desc_exptp_0_11.init("ONT::TELL",
		11);
    //
    trips2bel__enum_value_ordered_exptp_0[0] = trips2bel.trips2bel__enum_functor_desc_exptp_0_0;
    trips2bel__enum_value_ordered_exptp_0[1] = trips2bel.trips2bel__enum_functor_desc_exptp_0_1;
    trips2bel__enum_value_ordered_exptp_0[2] = trips2bel.trips2bel__enum_functor_desc_exptp_0_2;
    trips2bel__enum_value_ordered_exptp_0[3] = trips2bel.trips2bel__enum_functor_desc_exptp_0_3;
    trips2bel__enum_value_ordered_exptp_0[4] = trips2bel.trips2bel__enum_functor_desc_exptp_0_4;
    trips2bel__enum_value_ordered_exptp_0[5] = trips2bel.trips2bel__enum_functor_desc_exptp_0_5;
    trips2bel__enum_value_ordered_exptp_0[6] = trips2bel.trips2bel__enum_functor_desc_exptp_0_6;
    trips2bel__enum_value_ordered_exptp_0[7] = trips2bel.trips2bel__enum_functor_desc_exptp_0_7;
    trips2bel__enum_value_ordered_exptp_0[8] = trips2bel.trips2bel__enum_functor_desc_exptp_0_8;
    trips2bel__enum_value_ordered_exptp_0[9] = trips2bel.trips2bel__enum_functor_desc_exptp_0_9;
    trips2bel__enum_value_ordered_exptp_0[10] = trips2bel.trips2bel__enum_functor_desc_exptp_0_10;
    trips2bel__enum_value_ordered_exptp_0[11] = trips2bel.trips2bel__enum_functor_desc_exptp_0_11;
    //
    trips2bel__enum_name_ordered_exptp_0[0] = trips2bel.trips2bel__enum_functor_desc_exptp_0_5;
    trips2bel__enum_name_ordered_exptp_0[1] = trips2bel.trips2bel__enum_functor_desc_exptp_0_4;
    trips2bel__enum_name_ordered_exptp_0[2] = trips2bel.trips2bel__enum_functor_desc_exptp_0_3;
    trips2bel__enum_name_ordered_exptp_0[3] = trips2bel.trips2bel__enum_functor_desc_exptp_0_10;
    trips2bel__enum_name_ordered_exptp_0[4] = trips2bel.trips2bel__enum_functor_desc_exptp_0_7;
    trips2bel__enum_name_ordered_exptp_0[5] = trips2bel.trips2bel__enum_functor_desc_exptp_0_2;
    trips2bel__enum_name_ordered_exptp_0[6] = trips2bel.trips2bel__enum_functor_desc_exptp_0_6;
    trips2bel__enum_name_ordered_exptp_0[7] = trips2bel.trips2bel__enum_functor_desc_exptp_0_0;
    trips2bel__enum_name_ordered_exptp_0[8] = trips2bel.trips2bel__enum_functor_desc_exptp_0_9;
    trips2bel__enum_name_ordered_exptp_0[9] = trips2bel.trips2bel__enum_functor_desc_exptp_0_8;
    trips2bel__enum_name_ordered_exptp_0[10] = trips2bel.trips2bel__enum_functor_desc_exptp_0_1;
    trips2bel__enum_name_ordered_exptp_0[11] = trips2bel.trips2bel__enum_functor_desc_exptp_0_11;
    //
    trips2bel__functor_number_map_exptp_0[0] = 7;
    trips2bel__functor_number_map_exptp_0[1] = 10;
    trips2bel__functor_number_map_exptp_0[2] = 5;
    trips2bel__functor_number_map_exptp_0[3] = 2;
    trips2bel__functor_number_map_exptp_0[4] = 1;
    trips2bel__functor_number_map_exptp_0[5] = 0;
    trips2bel__functor_number_map_exptp_0[6] = 6;
    trips2bel__functor_number_map_exptp_0[7] = 4;
    trips2bel__functor_number_map_exptp_0[8] = 9;
    trips2bel__functor_number_map_exptp_0[9] = 8;
    trips2bel__functor_number_map_exptp_0[10] = 3;
    trips2bel__functor_number_map_exptp_0[11] = 11;
    //
    trips2bel__type_ctor_info_exptp_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_ENUM,
		((java.lang.Object) (new AddrOf2_0(22))),
		((java.lang.Object) (new AddrOf2_0(23))),
		"trips2bel",
		"exptp",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__enum_name_ordered_exptp_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__enum_value_ordered_exptp_0),
		12,
		4,
		trips2bel.trips2bel__functor_number_map_exptp_0);
    //
    trips2bel__enum_functor_desc_fargval_0_0.init("of",
		0);
    //
    trips2bel__enum_value_ordered_fargval_0[0] = trips2bel.trips2bel__enum_functor_desc_fargval_0_0;
    //
    trips2bel__enum_name_ordered_fargval_0[0] = trips2bel.trips2bel__enum_functor_desc_fargval_0_0;
    //
    trips2bel__functor_number_map_fargval_0[0] = 0;
    //
    trips2bel__type_ctor_info_fargval_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_DUMMY,
		((java.lang.Object) (new AddrOf2_0(24))),
		((java.lang.Object) (new AddrOf2_0(25))),
		"trips2bel",
		"fargval",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__enum_name_ordered_fargval_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__enum_value_ordered_fargval_0),
		1,
		4,
		trips2bel.trips2bel__functor_number_map_fargval_0);
    //
    trips2bel__enum_functor_desc_forceval_0_0.init("true",
		0);
    //
    trips2bel__enum_functor_desc_forceval_0_1.init("false",
		1);
    //
    trips2bel__enum_functor_desc_forceval_0_2.init("possible",
		2);
    //
    trips2bel__enum_functor_desc_forceval_0_3.init("impossible",
		3);
    //
    trips2bel__enum_functor_desc_forceval_0_4.init("future",
		4);
    //
    trips2bel__enum_functor_desc_forceval_0_5.init("futurenot",
		5);
    //
    trips2bel__enum_functor_desc_forceval_0_6.init("required",
		6);
    //
    trips2bel__enum_functor_desc_forceval_0_7.init("prohibited",
		7);
    //
    trips2bel__enum_value_ordered_forceval_0[0] = trips2bel.trips2bel__enum_functor_desc_forceval_0_0;
    trips2bel__enum_value_ordered_forceval_0[1] = trips2bel.trips2bel__enum_functor_desc_forceval_0_1;
    trips2bel__enum_value_ordered_forceval_0[2] = trips2bel.trips2bel__enum_functor_desc_forceval_0_2;
    trips2bel__enum_value_ordered_forceval_0[3] = trips2bel.trips2bel__enum_functor_desc_forceval_0_3;
    trips2bel__enum_value_ordered_forceval_0[4] = trips2bel.trips2bel__enum_functor_desc_forceval_0_4;
    trips2bel__enum_value_ordered_forceval_0[5] = trips2bel.trips2bel__enum_functor_desc_forceval_0_5;
    trips2bel__enum_value_ordered_forceval_0[6] = trips2bel.trips2bel__enum_functor_desc_forceval_0_6;
    trips2bel__enum_value_ordered_forceval_0[7] = trips2bel.trips2bel__enum_functor_desc_forceval_0_7;
    //
    trips2bel__enum_name_ordered_forceval_0[0] = trips2bel.trips2bel__enum_functor_desc_forceval_0_1;
    trips2bel__enum_name_ordered_forceval_0[1] = trips2bel.trips2bel__enum_functor_desc_forceval_0_4;
    trips2bel__enum_name_ordered_forceval_0[2] = trips2bel.trips2bel__enum_functor_desc_forceval_0_5;
    trips2bel__enum_name_ordered_forceval_0[3] = trips2bel.trips2bel__enum_functor_desc_forceval_0_3;
    trips2bel__enum_name_ordered_forceval_0[4] = trips2bel.trips2bel__enum_functor_desc_forceval_0_2;
    trips2bel__enum_name_ordered_forceval_0[5] = trips2bel.trips2bel__enum_functor_desc_forceval_0_7;
    trips2bel__enum_name_ordered_forceval_0[6] = trips2bel.trips2bel__enum_functor_desc_forceval_0_6;
    trips2bel__enum_name_ordered_forceval_0[7] = trips2bel.trips2bel__enum_functor_desc_forceval_0_0;
    //
    trips2bel__functor_number_map_forceval_0[0] = 7;
    trips2bel__functor_number_map_forceval_0[1] = 0;
    trips2bel__functor_number_map_forceval_0[2] = 4;
    trips2bel__functor_number_map_forceval_0[3] = 3;
    trips2bel__functor_number_map_forceval_0[4] = 1;
    trips2bel__functor_number_map_forceval_0[5] = 2;
    trips2bel__functor_number_map_forceval_0[6] = 6;
    trips2bel__functor_number_map_forceval_0[7] = 5;
    //
    trips2bel__type_ctor_info_forceval_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_ENUM,
		((java.lang.Object) (new AddrOf2_0(26))),
		((java.lang.Object) (new AddrOf2_0(27))),
		"trips2bel",
		"forceval",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__enum_name_ordered_forceval_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__enum_value_ordered_forceval_0),
		8,
		4,
		trips2bel.trips2bel__functor_number_map_forceval_0);
    //
    trips2bel__enum_functor_desc_negval_0_0.init("plus",
		0);
    //
    trips2bel__enum_value_ordered_negval_0[0] = trips2bel.trips2bel__enum_functor_desc_negval_0_0;
    //
    trips2bel__enum_name_ordered_negval_0[0] = trips2bel.trips2bel__enum_functor_desc_negval_0_0;
    //
    trips2bel__functor_number_map_negval_0[0] = 0;
    //
    trips2bel__type_ctor_info_negval_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_DUMMY,
		((java.lang.Object) (new AddrOf2_0(28))),
		((java.lang.Object) (new AddrOf2_0(29))),
		"trips2bel",
		"negval",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__enum_name_ordered_negval_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__enum_value_ordered_negval_0),
		1,
		4,
		trips2bel.trips2bel__functor_number_map_negval_0);
    //
    trips2bel__enum_functor_desc_opval_0_0.init("aand",
		0);
    //
    trips2bel__enum_functor_desc_opval_0_1.init("but",
		1);
    //
    trips2bel__enum_functor_desc_opval_0_2.init("oor",
		2);
    //
    trips2bel__enum_functor_desc_opval_0_3.init("one_of",
		3);
    //
    trips2bel__enum_functor_desc_opval_0_4.init("members",
		4);
    //
    trips2bel__enum_functor_desc_opval_0_5.init("either",
		5);
    //
    trips2bel__enum_functor_desc_opval_0_6.init("both",
		6);
    //
    trips2bel__enum_functor_desc_opval_0_7.init("plus",
		7);
    //
    trips2bel__enum_value_ordered_opval_0[0] = trips2bel.trips2bel__enum_functor_desc_opval_0_0;
    trips2bel__enum_value_ordered_opval_0[1] = trips2bel.trips2bel__enum_functor_desc_opval_0_1;
    trips2bel__enum_value_ordered_opval_0[2] = trips2bel.trips2bel__enum_functor_desc_opval_0_2;
    trips2bel__enum_value_ordered_opval_0[3] = trips2bel.trips2bel__enum_functor_desc_opval_0_3;
    trips2bel__enum_value_ordered_opval_0[4] = trips2bel.trips2bel__enum_functor_desc_opval_0_4;
    trips2bel__enum_value_ordered_opval_0[5] = trips2bel.trips2bel__enum_functor_desc_opval_0_5;
    trips2bel__enum_value_ordered_opval_0[6] = trips2bel.trips2bel__enum_functor_desc_opval_0_6;
    trips2bel__enum_value_ordered_opval_0[7] = trips2bel.trips2bel__enum_functor_desc_opval_0_7;
    //
    trips2bel__enum_name_ordered_opval_0[0] = trips2bel.trips2bel__enum_functor_desc_opval_0_0;
    trips2bel__enum_name_ordered_opval_0[1] = trips2bel.trips2bel__enum_functor_desc_opval_0_6;
    trips2bel__enum_name_ordered_opval_0[2] = trips2bel.trips2bel__enum_functor_desc_opval_0_1;
    trips2bel__enum_name_ordered_opval_0[3] = trips2bel.trips2bel__enum_functor_desc_opval_0_5;
    trips2bel__enum_name_ordered_opval_0[4] = trips2bel.trips2bel__enum_functor_desc_opval_0_4;
    trips2bel__enum_name_ordered_opval_0[5] = trips2bel.trips2bel__enum_functor_desc_opval_0_3;
    trips2bel__enum_name_ordered_opval_0[6] = trips2bel.trips2bel__enum_functor_desc_opval_0_2;
    trips2bel__enum_name_ordered_opval_0[7] = trips2bel.trips2bel__enum_functor_desc_opval_0_7;
    //
    trips2bel__functor_number_map_opval_0[0] = 0;
    trips2bel__functor_number_map_opval_0[1] = 2;
    trips2bel__functor_number_map_opval_0[2] = 6;
    trips2bel__functor_number_map_opval_0[3] = 5;
    trips2bel__functor_number_map_opval_0[4] = 4;
    trips2bel__functor_number_map_opval_0[5] = 3;
    trips2bel__functor_number_map_opval_0[6] = 1;
    trips2bel__functor_number_map_opval_0[7] = 7;
    //
    trips2bel__type_ctor_info_opval_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_ENUM,
		((java.lang.Object) (new AddrOf2_0(30))),
		((java.lang.Object) (new AddrOf2_0(31))),
		"trips2bel",
		"opval",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__enum_name_ordered_opval_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__enum_value_ordered_opval_0),
		8,
		4,
		trips2bel.trips2bel__functor_number_map_opval_0);
    //
    trips2bel__enum_functor_desc_orientval_0_0.init("pos",
		0);
    //
    trips2bel__enum_functor_desc_orientval_0_1.init("neg",
		1);
    //
    trips2bel__enum_functor_desc_orientval_0_2.init("more",
		2);
    //
    trips2bel__enum_functor_desc_orientval_0_3.init("less",
		3);
    //
    trips2bel__enum_functor_desc_orientval_0_4.init("neutral",
		4);
    //
    trips2bel__enum_value_ordered_orientval_0[0] = trips2bel.trips2bel__enum_functor_desc_orientval_0_0;
    trips2bel__enum_value_ordered_orientval_0[1] = trips2bel.trips2bel__enum_functor_desc_orientval_0_1;
    trips2bel__enum_value_ordered_orientval_0[2] = trips2bel.trips2bel__enum_functor_desc_orientval_0_2;
    trips2bel__enum_value_ordered_orientval_0[3] = trips2bel.trips2bel__enum_functor_desc_orientval_0_3;
    trips2bel__enum_value_ordered_orientval_0[4] = trips2bel.trips2bel__enum_functor_desc_orientval_0_4;
    //
    trips2bel__enum_name_ordered_orientval_0[0] = trips2bel.trips2bel__enum_functor_desc_orientval_0_3;
    trips2bel__enum_name_ordered_orientval_0[1] = trips2bel.trips2bel__enum_functor_desc_orientval_0_2;
    trips2bel__enum_name_ordered_orientval_0[2] = trips2bel.trips2bel__enum_functor_desc_orientval_0_1;
    trips2bel__enum_name_ordered_orientval_0[3] = trips2bel.trips2bel__enum_functor_desc_orientval_0_4;
    trips2bel__enum_name_ordered_orientval_0[4] = trips2bel.trips2bel__enum_functor_desc_orientval_0_0;
    //
    trips2bel__functor_number_map_orientval_0[0] = 4;
    trips2bel__functor_number_map_orientval_0[1] = 2;
    trips2bel__functor_number_map_orientval_0[2] = 1;
    trips2bel__functor_number_map_orientval_0[3] = 0;
    trips2bel__functor_number_map_orientval_0[4] = 3;
    //
    trips2bel__type_ctor_info_orientval_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_ENUM,
		((java.lang.Object) (new AddrOf2_0(32))),
		((java.lang.Object) (new AddrOf2_0(33))),
		"trips2bel",
		"orientval",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__enum_name_ordered_orientval_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__enum_value_ordered_orientval_0),
		5,
		4,
		trips2bel.trips2bel__functor_number_map_orientval_0);
    //
    trips2bel__enum_functor_desc_reftp_0_0.init("addressee",
		0);
    //
    trips2bel__enum_functor_desc_reftp_0_1.init("affected",
		1);
    //
    trips2bel__enum_functor_desc_reftp_0_2.init("agent",
		2);
    //
    trips2bel__enum_functor_desc_reftp_0_3.init("assoc_poss",
		3);
    //
    trips2bel__enum_functor_desc_reftp_0_4.init("assoc_with",
		4);
    //
    trips2bel__enum_functor_desc_reftp_0_5.init("cause",
		5);
    //
    trips2bel__enum_functor_desc_reftp_0_6.init("cognizer",
		6);
    //
    trips2bel__enum_functor_desc_reftp_0_7.init("content",
		7);
    //
    trips2bel__enum_functor_desc_reftp_0_8.init("co_theme",
		8);
    //
    trips2bel__enum_functor_desc_reftp_0_9.init("dobj",
		9);
    //
    trips2bel__enum_functor_desc_reftp_0_10.init("effect",
		10);
    //
    trips2bel__enum_functor_desc_reftp_0_11.init("experiencer",
		11);
    //
    trips2bel__enum_functor_desc_reftp_0_12.init("val",
		12);
    //
    trips2bel__enum_functor_desc_reftp_0_13.init("figure",
		13);
    //
    trips2bel__enum_functor_desc_reftp_0_14.init("focus",
		14);
    //
    trips2bel__enum_functor_desc_reftp_0_15.init("ground",
		15);
    //
    trips2bel__enum_functor_desc_reftp_0_16.init("instrument",
		16);
    //
    trips2bel__enum_functor_desc_reftp_0_17.init("like",
		17);
    //
    trips2bel__enum_functor_desc_reftp_0_18.init("lobj",
		18);
    //
    trips2bel__enum_functor_desc_reftp_0_19.init("lsubj",
		19);
    //
    trips2bel__enum_functor_desc_reftp_0_20.init("of",
		20);
    //
    trips2bel__enum_functor_desc_reftp_0_21.init("predicate",
		21);
    //
    trips2bel__enum_functor_desc_reftp_0_22.init("property",
		22);
    //
    trips2bel__enum_functor_desc_reftp_0_23.init("refobject",
		23);
    //
    trips2bel__enum_functor_desc_reftp_0_24.init("refset",
		24);
    //
    trips2bel__enum_functor_desc_reftp_0_25.init("related_to",
		25);
    //
    trips2bel__enum_functor_desc_reftp_0_26.init("result",
		26);
    //
    trips2bel__enum_functor_desc_reftp_0_27.init("suchthat",
		27);
    //
    trips2bel__enum_functor_desc_reftp_0_28.init("theme",
		28);
    //
    trips2bel__enum_functor_desc_reftp_0_29.init("to",
		29);
    //
    trips2bel__enum_functor_desc_reftp_0_30.init("action",
		30);
    //
    trips2bel__enum_functor_desc_reftp_0_31.init("recipient",
		31);
    //
    trips2bel__enum_functor_desc_reftp_0_32.init("obj_val",
		32);
    //
    trips2bel__enum_functor_desc_reftp_0_33.init("purpose",
		33);
    //
    trips2bel__enum_functor_desc_reftp_0_34.init("via",
		34);
    //
    trips2bel__enum_functor_desc_reftp_0_35.init("arg0",
		35);
    //
    trips2bel__enum_functor_desc_reftp_0_36.init("attribute",
		36);
    //
    trips2bel__enum_functor_desc_reftp_0_37.init("arg1",
		37);
    //
    trips2bel__enum_functor_desc_reftp_0_38.init("eq",
		38);
    //
    trips2bel__enum_functor_desc_reftp_0_39.init("source",
		39);
    //
    trips2bel__enum_functor_desc_reftp_0_40.init("goal",
		40);
    //
    trips2bel__enum_functor_desc_reftp_0_41.init("path",
		41);
    //
    trips2bel__enum_functor_desc_reftp_0_42.init("along",
		42);
    //
    trips2bel__enum_functor_desc_reftp_0_43.init("to_loc",
		43);
    //
    trips2bel__enum_functor_desc_reftp_0_44.init("purpose_implicit",
		44);
    //
    trips2bel__enum_functor_desc_reftp_0_45.init("subcat",
		45);
    //
    trips2bel__enum_functor_desc_reftp_0_46.init("location",
		46);
    //
    trips2bel__enum_functor_desc_reftp_0_47.init("co_agent",
		47);
    //
    trips2bel__enum_functor_desc_reftp_0_48.init("associated_information",
		48);
    //
    trips2bel__enum_functor_desc_reftp_0_49.init("displacement",
		49);
    //
    trips2bel__enum_functor_desc_reftp_0_50.init("from",
		50);
    //
    trips2bel__enum_functor_desc_reftp_0_51.init("comp3",
		51);
    //
    trips2bel__enum_functor_desc_reftp_0_52.init("parenthetical",
		52);
    //
    trips2bel__enum_functor_desc_reftp_0_53.init("part",
		53);
    //
    trips2bel__enum_functor_desc_reftp_0_54.init("stimulus",
		54);
    //
    trips2bel__enum_functor_desc_reftp_0_55.init("iss",
		55);
    //
    trips2bel__enum_functor_desc_reftp_0_56.init("contents",
		56);
    //
    trips2bel__enum_functor_desc_reftp_0_57.init("of_state",
		57);
    //
    trips2bel__enum_functor_desc_reftp_0_58.init("result_val",
		58);
    //
    trips2bel__enum_value_ordered_reftp_0[0] = trips2bel.trips2bel__enum_functor_desc_reftp_0_0;
    trips2bel__enum_value_ordered_reftp_0[1] = trips2bel.trips2bel__enum_functor_desc_reftp_0_1;
    trips2bel__enum_value_ordered_reftp_0[2] = trips2bel.trips2bel__enum_functor_desc_reftp_0_2;
    trips2bel__enum_value_ordered_reftp_0[3] = trips2bel.trips2bel__enum_functor_desc_reftp_0_3;
    trips2bel__enum_value_ordered_reftp_0[4] = trips2bel.trips2bel__enum_functor_desc_reftp_0_4;
    trips2bel__enum_value_ordered_reftp_0[5] = trips2bel.trips2bel__enum_functor_desc_reftp_0_5;
    trips2bel__enum_value_ordered_reftp_0[6] = trips2bel.trips2bel__enum_functor_desc_reftp_0_6;
    trips2bel__enum_value_ordered_reftp_0[7] = trips2bel.trips2bel__enum_functor_desc_reftp_0_7;
    trips2bel__enum_value_ordered_reftp_0[8] = trips2bel.trips2bel__enum_functor_desc_reftp_0_8;
    trips2bel__enum_value_ordered_reftp_0[9] = trips2bel.trips2bel__enum_functor_desc_reftp_0_9;
    trips2bel__enum_value_ordered_reftp_0[10] = trips2bel.trips2bel__enum_functor_desc_reftp_0_10;
    trips2bel__enum_value_ordered_reftp_0[11] = trips2bel.trips2bel__enum_functor_desc_reftp_0_11;
    trips2bel__enum_value_ordered_reftp_0[12] = trips2bel.trips2bel__enum_functor_desc_reftp_0_12;
    trips2bel__enum_value_ordered_reftp_0[13] = trips2bel.trips2bel__enum_functor_desc_reftp_0_13;
    trips2bel__enum_value_ordered_reftp_0[14] = trips2bel.trips2bel__enum_functor_desc_reftp_0_14;
    trips2bel__enum_value_ordered_reftp_0[15] = trips2bel.trips2bel__enum_functor_desc_reftp_0_15;
    trips2bel__enum_value_ordered_reftp_0[16] = trips2bel.trips2bel__enum_functor_desc_reftp_0_16;
    trips2bel__enum_value_ordered_reftp_0[17] = trips2bel.trips2bel__enum_functor_desc_reftp_0_17;
    trips2bel__enum_value_ordered_reftp_0[18] = trips2bel.trips2bel__enum_functor_desc_reftp_0_18;
    trips2bel__enum_value_ordered_reftp_0[19] = trips2bel.trips2bel__enum_functor_desc_reftp_0_19;
    trips2bel__enum_value_ordered_reftp_0[20] = trips2bel.trips2bel__enum_functor_desc_reftp_0_20;
    trips2bel__enum_value_ordered_reftp_0[21] = trips2bel.trips2bel__enum_functor_desc_reftp_0_21;
    trips2bel__enum_value_ordered_reftp_0[22] = trips2bel.trips2bel__enum_functor_desc_reftp_0_22;
    trips2bel__enum_value_ordered_reftp_0[23] = trips2bel.trips2bel__enum_functor_desc_reftp_0_23;
    trips2bel__enum_value_ordered_reftp_0[24] = trips2bel.trips2bel__enum_functor_desc_reftp_0_24;
    trips2bel__enum_value_ordered_reftp_0[25] = trips2bel.trips2bel__enum_functor_desc_reftp_0_25;
    trips2bel__enum_value_ordered_reftp_0[26] = trips2bel.trips2bel__enum_functor_desc_reftp_0_26;
    trips2bel__enum_value_ordered_reftp_0[27] = trips2bel.trips2bel__enum_functor_desc_reftp_0_27;
    trips2bel__enum_value_ordered_reftp_0[28] = trips2bel.trips2bel__enum_functor_desc_reftp_0_28;
    trips2bel__enum_value_ordered_reftp_0[29] = trips2bel.trips2bel__enum_functor_desc_reftp_0_29;
    trips2bel__enum_value_ordered_reftp_0[30] = trips2bel.trips2bel__enum_functor_desc_reftp_0_30;
    trips2bel__enum_value_ordered_reftp_0[31] = trips2bel.trips2bel__enum_functor_desc_reftp_0_31;
    trips2bel__enum_value_ordered_reftp_0[32] = trips2bel.trips2bel__enum_functor_desc_reftp_0_32;
    trips2bel__enum_value_ordered_reftp_0[33] = trips2bel.trips2bel__enum_functor_desc_reftp_0_33;
    trips2bel__enum_value_ordered_reftp_0[34] = trips2bel.trips2bel__enum_functor_desc_reftp_0_34;
    trips2bel__enum_value_ordered_reftp_0[35] = trips2bel.trips2bel__enum_functor_desc_reftp_0_35;
    trips2bel__enum_value_ordered_reftp_0[36] = trips2bel.trips2bel__enum_functor_desc_reftp_0_36;
    trips2bel__enum_value_ordered_reftp_0[37] = trips2bel.trips2bel__enum_functor_desc_reftp_0_37;
    trips2bel__enum_value_ordered_reftp_0[38] = trips2bel.trips2bel__enum_functor_desc_reftp_0_38;
    trips2bel__enum_value_ordered_reftp_0[39] = trips2bel.trips2bel__enum_functor_desc_reftp_0_39;
    trips2bel__enum_value_ordered_reftp_0[40] = trips2bel.trips2bel__enum_functor_desc_reftp_0_40;
    trips2bel__enum_value_ordered_reftp_0[41] = trips2bel.trips2bel__enum_functor_desc_reftp_0_41;
    trips2bel__enum_value_ordered_reftp_0[42] = trips2bel.trips2bel__enum_functor_desc_reftp_0_42;
    trips2bel__enum_value_ordered_reftp_0[43] = trips2bel.trips2bel__enum_functor_desc_reftp_0_43;
    trips2bel__enum_value_ordered_reftp_0[44] = trips2bel.trips2bel__enum_functor_desc_reftp_0_44;
    trips2bel__enum_value_ordered_reftp_0[45] = trips2bel.trips2bel__enum_functor_desc_reftp_0_45;
    trips2bel__enum_value_ordered_reftp_0[46] = trips2bel.trips2bel__enum_functor_desc_reftp_0_46;
    trips2bel__enum_value_ordered_reftp_0[47] = trips2bel.trips2bel__enum_functor_desc_reftp_0_47;
    trips2bel__enum_value_ordered_reftp_0[48] = trips2bel.trips2bel__enum_functor_desc_reftp_0_48;
    trips2bel__enum_value_ordered_reftp_0[49] = trips2bel.trips2bel__enum_functor_desc_reftp_0_49;
    trips2bel__enum_value_ordered_reftp_0[50] = trips2bel.trips2bel__enum_functor_desc_reftp_0_50;
    trips2bel__enum_value_ordered_reftp_0[51] = trips2bel.trips2bel__enum_functor_desc_reftp_0_51;
    trips2bel__enum_value_ordered_reftp_0[52] = trips2bel.trips2bel__enum_functor_desc_reftp_0_52;
    trips2bel__enum_value_ordered_reftp_0[53] = trips2bel.trips2bel__enum_functor_desc_reftp_0_53;
    trips2bel__enum_value_ordered_reftp_0[54] = trips2bel.trips2bel__enum_functor_desc_reftp_0_54;
    trips2bel__enum_value_ordered_reftp_0[55] = trips2bel.trips2bel__enum_functor_desc_reftp_0_55;
    trips2bel__enum_value_ordered_reftp_0[56] = trips2bel.trips2bel__enum_functor_desc_reftp_0_56;
    trips2bel__enum_value_ordered_reftp_0[57] = trips2bel.trips2bel__enum_functor_desc_reftp_0_57;
    trips2bel__enum_value_ordered_reftp_0[58] = trips2bel.trips2bel__enum_functor_desc_reftp_0_58;
    //
    trips2bel__enum_name_ordered_reftp_0[0] = trips2bel.trips2bel__enum_functor_desc_reftp_0_30;
    trips2bel__enum_name_ordered_reftp_0[1] = trips2bel.trips2bel__enum_functor_desc_reftp_0_0;
    trips2bel__enum_name_ordered_reftp_0[2] = trips2bel.trips2bel__enum_functor_desc_reftp_0_1;
    trips2bel__enum_name_ordered_reftp_0[3] = trips2bel.trips2bel__enum_functor_desc_reftp_0_2;
    trips2bel__enum_name_ordered_reftp_0[4] = trips2bel.trips2bel__enum_functor_desc_reftp_0_42;
    trips2bel__enum_name_ordered_reftp_0[5] = trips2bel.trips2bel__enum_functor_desc_reftp_0_35;
    trips2bel__enum_name_ordered_reftp_0[6] = trips2bel.trips2bel__enum_functor_desc_reftp_0_37;
    trips2bel__enum_name_ordered_reftp_0[7] = trips2bel.trips2bel__enum_functor_desc_reftp_0_3;
    trips2bel__enum_name_ordered_reftp_0[8] = trips2bel.trips2bel__enum_functor_desc_reftp_0_4;
    trips2bel__enum_name_ordered_reftp_0[9] = trips2bel.trips2bel__enum_functor_desc_reftp_0_48;
    trips2bel__enum_name_ordered_reftp_0[10] = trips2bel.trips2bel__enum_functor_desc_reftp_0_36;
    trips2bel__enum_name_ordered_reftp_0[11] = trips2bel.trips2bel__enum_functor_desc_reftp_0_5;
    trips2bel__enum_name_ordered_reftp_0[12] = trips2bel.trips2bel__enum_functor_desc_reftp_0_47;
    trips2bel__enum_name_ordered_reftp_0[13] = trips2bel.trips2bel__enum_functor_desc_reftp_0_8;
    trips2bel__enum_name_ordered_reftp_0[14] = trips2bel.trips2bel__enum_functor_desc_reftp_0_6;
    trips2bel__enum_name_ordered_reftp_0[15] = trips2bel.trips2bel__enum_functor_desc_reftp_0_51;
    trips2bel__enum_name_ordered_reftp_0[16] = trips2bel.trips2bel__enum_functor_desc_reftp_0_7;
    trips2bel__enum_name_ordered_reftp_0[17] = trips2bel.trips2bel__enum_functor_desc_reftp_0_56;
    trips2bel__enum_name_ordered_reftp_0[18] = trips2bel.trips2bel__enum_functor_desc_reftp_0_49;
    trips2bel__enum_name_ordered_reftp_0[19] = trips2bel.trips2bel__enum_functor_desc_reftp_0_9;
    trips2bel__enum_name_ordered_reftp_0[20] = trips2bel.trips2bel__enum_functor_desc_reftp_0_10;
    trips2bel__enum_name_ordered_reftp_0[21] = trips2bel.trips2bel__enum_functor_desc_reftp_0_38;
    trips2bel__enum_name_ordered_reftp_0[22] = trips2bel.trips2bel__enum_functor_desc_reftp_0_11;
    trips2bel__enum_name_ordered_reftp_0[23] = trips2bel.trips2bel__enum_functor_desc_reftp_0_13;
    trips2bel__enum_name_ordered_reftp_0[24] = trips2bel.trips2bel__enum_functor_desc_reftp_0_14;
    trips2bel__enum_name_ordered_reftp_0[25] = trips2bel.trips2bel__enum_functor_desc_reftp_0_50;
    trips2bel__enum_name_ordered_reftp_0[26] = trips2bel.trips2bel__enum_functor_desc_reftp_0_40;
    trips2bel__enum_name_ordered_reftp_0[27] = trips2bel.trips2bel__enum_functor_desc_reftp_0_15;
    trips2bel__enum_name_ordered_reftp_0[28] = trips2bel.trips2bel__enum_functor_desc_reftp_0_16;
    trips2bel__enum_name_ordered_reftp_0[29] = trips2bel.trips2bel__enum_functor_desc_reftp_0_55;
    trips2bel__enum_name_ordered_reftp_0[30] = trips2bel.trips2bel__enum_functor_desc_reftp_0_17;
    trips2bel__enum_name_ordered_reftp_0[31] = trips2bel.trips2bel__enum_functor_desc_reftp_0_18;
    trips2bel__enum_name_ordered_reftp_0[32] = trips2bel.trips2bel__enum_functor_desc_reftp_0_46;
    trips2bel__enum_name_ordered_reftp_0[33] = trips2bel.trips2bel__enum_functor_desc_reftp_0_19;
    trips2bel__enum_name_ordered_reftp_0[34] = trips2bel.trips2bel__enum_functor_desc_reftp_0_32;
    trips2bel__enum_name_ordered_reftp_0[35] = trips2bel.trips2bel__enum_functor_desc_reftp_0_20;
    trips2bel__enum_name_ordered_reftp_0[36] = trips2bel.trips2bel__enum_functor_desc_reftp_0_57;
    trips2bel__enum_name_ordered_reftp_0[37] = trips2bel.trips2bel__enum_functor_desc_reftp_0_52;
    trips2bel__enum_name_ordered_reftp_0[38] = trips2bel.trips2bel__enum_functor_desc_reftp_0_53;
    trips2bel__enum_name_ordered_reftp_0[39] = trips2bel.trips2bel__enum_functor_desc_reftp_0_41;
    trips2bel__enum_name_ordered_reftp_0[40] = trips2bel.trips2bel__enum_functor_desc_reftp_0_21;
    trips2bel__enum_name_ordered_reftp_0[41] = trips2bel.trips2bel__enum_functor_desc_reftp_0_22;
    trips2bel__enum_name_ordered_reftp_0[42] = trips2bel.trips2bel__enum_functor_desc_reftp_0_33;
    trips2bel__enum_name_ordered_reftp_0[43] = trips2bel.trips2bel__enum_functor_desc_reftp_0_44;
    trips2bel__enum_name_ordered_reftp_0[44] = trips2bel.trips2bel__enum_functor_desc_reftp_0_31;
    trips2bel__enum_name_ordered_reftp_0[45] = trips2bel.trips2bel__enum_functor_desc_reftp_0_23;
    trips2bel__enum_name_ordered_reftp_0[46] = trips2bel.trips2bel__enum_functor_desc_reftp_0_24;
    trips2bel__enum_name_ordered_reftp_0[47] = trips2bel.trips2bel__enum_functor_desc_reftp_0_25;
    trips2bel__enum_name_ordered_reftp_0[48] = trips2bel.trips2bel__enum_functor_desc_reftp_0_26;
    trips2bel__enum_name_ordered_reftp_0[49] = trips2bel.trips2bel__enum_functor_desc_reftp_0_58;
    trips2bel__enum_name_ordered_reftp_0[50] = trips2bel.trips2bel__enum_functor_desc_reftp_0_39;
    trips2bel__enum_name_ordered_reftp_0[51] = trips2bel.trips2bel__enum_functor_desc_reftp_0_54;
    trips2bel__enum_name_ordered_reftp_0[52] = trips2bel.trips2bel__enum_functor_desc_reftp_0_45;
    trips2bel__enum_name_ordered_reftp_0[53] = trips2bel.trips2bel__enum_functor_desc_reftp_0_27;
    trips2bel__enum_name_ordered_reftp_0[54] = trips2bel.trips2bel__enum_functor_desc_reftp_0_28;
    trips2bel__enum_name_ordered_reftp_0[55] = trips2bel.trips2bel__enum_functor_desc_reftp_0_29;
    trips2bel__enum_name_ordered_reftp_0[56] = trips2bel.trips2bel__enum_functor_desc_reftp_0_43;
    trips2bel__enum_name_ordered_reftp_0[57] = trips2bel.trips2bel__enum_functor_desc_reftp_0_12;
    trips2bel__enum_name_ordered_reftp_0[58] = trips2bel.trips2bel__enum_functor_desc_reftp_0_34;
    //
    trips2bel__functor_number_map_reftp_0[0] = 1;
    trips2bel__functor_number_map_reftp_0[1] = 2;
    trips2bel__functor_number_map_reftp_0[2] = 3;
    trips2bel__functor_number_map_reftp_0[3] = 7;
    trips2bel__functor_number_map_reftp_0[4] = 8;
    trips2bel__functor_number_map_reftp_0[5] = 11;
    trips2bel__functor_number_map_reftp_0[6] = 14;
    trips2bel__functor_number_map_reftp_0[7] = 16;
    trips2bel__functor_number_map_reftp_0[8] = 13;
    trips2bel__functor_number_map_reftp_0[9] = 19;
    trips2bel__functor_number_map_reftp_0[10] = 20;
    trips2bel__functor_number_map_reftp_0[11] = 22;
    trips2bel__functor_number_map_reftp_0[12] = 57;
    trips2bel__functor_number_map_reftp_0[13] = 23;
    trips2bel__functor_number_map_reftp_0[14] = 24;
    trips2bel__functor_number_map_reftp_0[15] = 27;
    trips2bel__functor_number_map_reftp_0[16] = 28;
    trips2bel__functor_number_map_reftp_0[17] = 30;
    trips2bel__functor_number_map_reftp_0[18] = 31;
    trips2bel__functor_number_map_reftp_0[19] = 33;
    trips2bel__functor_number_map_reftp_0[20] = 35;
    trips2bel__functor_number_map_reftp_0[21] = 40;
    trips2bel__functor_number_map_reftp_0[22] = 41;
    trips2bel__functor_number_map_reftp_0[23] = 45;
    trips2bel__functor_number_map_reftp_0[24] = 46;
    trips2bel__functor_number_map_reftp_0[25] = 47;
    trips2bel__functor_number_map_reftp_0[26] = 48;
    trips2bel__functor_number_map_reftp_0[27] = 53;
    trips2bel__functor_number_map_reftp_0[28] = 54;
    trips2bel__functor_number_map_reftp_0[29] = 55;
    trips2bel__functor_number_map_reftp_0[30] = 0;
    trips2bel__functor_number_map_reftp_0[31] = 44;
    trips2bel__functor_number_map_reftp_0[32] = 34;
    trips2bel__functor_number_map_reftp_0[33] = 42;
    trips2bel__functor_number_map_reftp_0[34] = 58;
    trips2bel__functor_number_map_reftp_0[35] = 5;
    trips2bel__functor_number_map_reftp_0[36] = 10;
    trips2bel__functor_number_map_reftp_0[37] = 6;
    trips2bel__functor_number_map_reftp_0[38] = 21;
    trips2bel__functor_number_map_reftp_0[39] = 50;
    trips2bel__functor_number_map_reftp_0[40] = 26;
    trips2bel__functor_number_map_reftp_0[41] = 39;
    trips2bel__functor_number_map_reftp_0[42] = 4;
    trips2bel__functor_number_map_reftp_0[43] = 56;
    trips2bel__functor_number_map_reftp_0[44] = 43;
    trips2bel__functor_number_map_reftp_0[45] = 52;
    trips2bel__functor_number_map_reftp_0[46] = 32;
    trips2bel__functor_number_map_reftp_0[47] = 12;
    trips2bel__functor_number_map_reftp_0[48] = 9;
    trips2bel__functor_number_map_reftp_0[49] = 18;
    trips2bel__functor_number_map_reftp_0[50] = 25;
    trips2bel__functor_number_map_reftp_0[51] = 15;
    trips2bel__functor_number_map_reftp_0[52] = 37;
    trips2bel__functor_number_map_reftp_0[53] = 38;
    trips2bel__functor_number_map_reftp_0[54] = 51;
    trips2bel__functor_number_map_reftp_0[55] = 29;
    trips2bel__functor_number_map_reftp_0[56] = 17;
    trips2bel__functor_number_map_reftp_0[57] = 36;
    trips2bel__functor_number_map_reftp_0[58] = 49;
    //
    trips2bel__type_ctor_info_reftp_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_ENUM,
		((java.lang.Object) (new AddrOf2_0(34))),
		((java.lang.Object) (new AddrOf2_0(35))),
		"trips2bel",
		"reftp",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__enum_name_ordered_reftp_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__enum_value_ordered_reftp_0),
		59,
		4,
		trips2bel.trips2bel__functor_number_map_reftp_0);
    //
    trips2bel__type_ctor_info_role_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(36))),
		((java.lang.Object) (new AddrOf2_0(37))),
		"trips2bel",
		"role",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0),
		-1,
		0,
		null);
    //
    //
    list__ti_list_1trips2bel__type_ctor_info_vardef_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_vardef_0)});
    //
    //
    trips2bel__field_types_sent_0_0[0] = (jmercury.runtime.PseudoTypeInfo) trips2bel.list__ti_list_1builtin__type_ctor_info_string_0;
    trips2bel__field_types_sent_0_0[1] = (jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_exptp_0;
    trips2bel__field_types_sent_0_0[2] = (jmercury.runtime.PseudoTypeInfo) trips2bel.list__ti_list_1trips2bel__type_ctor_info_vardef_0;
    //
    trips2bel__du_functor_desc_sent_0_0.init("sent",
		3,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		trips2bel.trips2bel__field_types_sent_0_0,
		null,
		null,
		null);
    //
    trips2bel__du_stag_ordered_sent_0_0[0] = trips2bel.trips2bel__du_functor_desc_sent_0_0;
    //
    trips2bel__du_ptag_ordered_sent_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		trips2bel.trips2bel__du_stag_ordered_sent_0_0);
    //
    trips2bel__du_name_ordered_sent_0[0] = trips2bel.trips2bel__du_functor_desc_sent_0_0;
    //
    trips2bel__functor_number_map_sent_0[0] = 0;
    //
    trips2bel__type_ctor_info_sent_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(38))),
		((java.lang.Object) (new AddrOf2_0(39))),
		"trips2bel",
		"sent",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__du_name_ordered_sent_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__du_ptag_ordered_sent_0),
		1,
		4,
		trips2bel.trips2bel__functor_number_map_sent_0);
    //
    tree234__ti_tree234_2builtin__type_ctor_info_int_0trips2bel__type_ctor_info_vardef2_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_vardef2_0)});
    //
    trips2bel__field_types_sent2_0_0[0] = (jmercury.runtime.PseudoTypeInfo) trips2bel.list__ti_list_1builtin__type_ctor_info_string_0;
    trips2bel__field_types_sent2_0_0[1] = (jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_exptp_0;
    trips2bel__field_types_sent2_0_0[2] = (jmercury.runtime.PseudoTypeInfo) trips2bel.tree234__ti_tree234_2builtin__type_ctor_info_int_0trips2bel__type_ctor_info_vardef2_0;
    //
    trips2bel__du_functor_desc_sent2_0_0.init("sent",
		3,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		trips2bel.trips2bel__field_types_sent2_0_0,
		null,
		null,
		null);
    //
    trips2bel__du_stag_ordered_sent2_0_0[0] = trips2bel.trips2bel__du_functor_desc_sent2_0_0;
    //
    trips2bel__du_ptag_ordered_sent2_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		trips2bel.trips2bel__du_stag_ordered_sent2_0_0);
    //
    trips2bel__du_name_ordered_sent2_0[0] = trips2bel.trips2bel__du_functor_desc_sent2_0_0;
    //
    trips2bel__functor_number_map_sent2_0[0] = 0;
    //
    trips2bel__type_ctor_info_sent2_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(40))),
		((java.lang.Object) (new AddrOf2_0(41))),
		"trips2bel",
		"sent2",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__du_name_ordered_sent2_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__du_ptag_ordered_sent2_0),
		1,
		4,
		trips2bel.trips2bel__functor_number_map_sent2_0);
    //
    list__ti_list_1trips2bel__type_ctor_info_expr_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_expr_0)});
    //
    trips2bel__field_types_sent3_0_0[0] = (jmercury.runtime.PseudoTypeInfo) trips2bel.list__ti_list_1builtin__type_ctor_info_string_0;
    trips2bel__field_types_sent3_0_0[1] = (jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_exptp_0;
    trips2bel__field_types_sent3_0_0[2] = (jmercury.runtime.PseudoTypeInfo) trips2bel.list__ti_list_1trips2bel__type_ctor_info_expr_0;
    //
    trips2bel__du_functor_desc_sent3_0_0.init("sent",
		3,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		trips2bel.trips2bel__field_types_sent3_0_0,
		null,
		null,
		null);
    //
    trips2bel__du_stag_ordered_sent3_0_0[0] = trips2bel.trips2bel__du_functor_desc_sent3_0_0;
    //
    trips2bel__du_ptag_ordered_sent3_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		trips2bel.trips2bel__du_stag_ordered_sent3_0_0);
    //
    trips2bel__du_name_ordered_sent3_0[0] = trips2bel.trips2bel__du_functor_desc_sent3_0_0;
    //
    trips2bel__functor_number_map_sent3_0[0] = 0;
    //
    trips2bel__type_ctor_info_sent3_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(42))),
		((java.lang.Object) (new AddrOf2_0(43))),
		"trips2bel",
		"sent3",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__du_name_ordered_sent3_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__du_ptag_ordered_sent3_0),
		1,
		4,
		trips2bel.trips2bel__functor_number_map_sent3_0);
    //
    trips2bel__type_ctor_info_speaker_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(44))),
		((java.lang.Object) (new AddrOf2_0(45))),
		"trips2bel",
		"speaker",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0),
		-1,
		0,
		null);
    //
    trips2bel__type_ctor_info_superclass_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(46))),
		((java.lang.Object) (new AddrOf2_0(47))),
		"trips2bel",
		"superclass",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0),
		-1,
		0,
		null);
    //
    tree234__ti_tree234_2trips2bel__type_ctor_info_cvar_0builtin__type_ctor_info_string_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_cvar_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0)});
    //
    trips2bel__type_ctor_info_symmap_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(48))),
		((java.lang.Object) (new AddrOf2_0(49))),
		"trips2bel",
		"symmap",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) trips2bel.tree234__ti_tree234_2trips2bel__type_ctor_info_cvar_0builtin__type_ctor_info_string_0),
		-1,
		0,
		null);
    //
    trips2bel__enum_functor_desc_tconst_0_0.init("ONT::PRO",
		0);
    //
    trips2bel__enum_functor_desc_tconst_0_1.init("ONT::BARE",
		1);
    //
    trips2bel__enum_functor_desc_tconst_0_2.init("ONT::WH-TERM",
		2);
    //
    trips2bel__enum_functor_desc_tconst_0_3.init("ONT::THE",
		3);
    //
    trips2bel__enum_functor_desc_tconst_0_4.init("ONT::SA-SEQ",
		4);
    //
    trips2bel__enum_functor_desc_tconst_0_5.init("ONT::INDEF-SET",
		5);
    //
    trips2bel__enum_functor_desc_tconst_0_6.init("ONT::VALUE",
		6);
    //
    trips2bel__enum_functor_desc_tconst_0_7.init("ONT::IMPRO",
		7);
    //
    trips2bel__enum_functor_desc_tconst_0_8.init("ONT::SPEECHACT",
		8);
    //
    trips2bel__enum_functor_desc_tconst_0_9.init("ONT::F",
		9);
    //
    trips2bel__enum_functor_desc_tconst_0_10.init("ONT::PRO-SET",
		10);
    //
    trips2bel__enum_functor_desc_tconst_0_11.init("ONT::WH-QUANTITY",
		11);
    //
    trips2bel__enum_functor_desc_tconst_0_12.init("ONT::QUANTIFIER",
		12);
    //
    trips2bel__enum_functor_desc_tconst_0_13.init("ONT::A",
		13);
    //
    trips2bel__enum_functor_desc_tconst_0_14.init("ONT::KIND",
		14);
    //
    trips2bel__enum_functor_desc_tconst_0_15.init("ONT::THE-SET",
		15);
    //
    trips2bel__enum_functor_desc_tconst_0_16.init("ONT::SM",
		16);
    //
    trips2bel__enum_value_ordered_tconst_0[0] = trips2bel.trips2bel__enum_functor_desc_tconst_0_0;
    trips2bel__enum_value_ordered_tconst_0[1] = trips2bel.trips2bel__enum_functor_desc_tconst_0_1;
    trips2bel__enum_value_ordered_tconst_0[2] = trips2bel.trips2bel__enum_functor_desc_tconst_0_2;
    trips2bel__enum_value_ordered_tconst_0[3] = trips2bel.trips2bel__enum_functor_desc_tconst_0_3;
    trips2bel__enum_value_ordered_tconst_0[4] = trips2bel.trips2bel__enum_functor_desc_tconst_0_4;
    trips2bel__enum_value_ordered_tconst_0[5] = trips2bel.trips2bel__enum_functor_desc_tconst_0_5;
    trips2bel__enum_value_ordered_tconst_0[6] = trips2bel.trips2bel__enum_functor_desc_tconst_0_6;
    trips2bel__enum_value_ordered_tconst_0[7] = trips2bel.trips2bel__enum_functor_desc_tconst_0_7;
    trips2bel__enum_value_ordered_tconst_0[8] = trips2bel.trips2bel__enum_functor_desc_tconst_0_8;
    trips2bel__enum_value_ordered_tconst_0[9] = trips2bel.trips2bel__enum_functor_desc_tconst_0_9;
    trips2bel__enum_value_ordered_tconst_0[10] = trips2bel.trips2bel__enum_functor_desc_tconst_0_10;
    trips2bel__enum_value_ordered_tconst_0[11] = trips2bel.trips2bel__enum_functor_desc_tconst_0_11;
    trips2bel__enum_value_ordered_tconst_0[12] = trips2bel.trips2bel__enum_functor_desc_tconst_0_12;
    trips2bel__enum_value_ordered_tconst_0[13] = trips2bel.trips2bel__enum_functor_desc_tconst_0_13;
    trips2bel__enum_value_ordered_tconst_0[14] = trips2bel.trips2bel__enum_functor_desc_tconst_0_14;
    trips2bel__enum_value_ordered_tconst_0[15] = trips2bel.trips2bel__enum_functor_desc_tconst_0_15;
    trips2bel__enum_value_ordered_tconst_0[16] = trips2bel.trips2bel__enum_functor_desc_tconst_0_16;
    //
    trips2bel__enum_name_ordered_tconst_0[0] = trips2bel.trips2bel__enum_functor_desc_tconst_0_13;
    trips2bel__enum_name_ordered_tconst_0[1] = trips2bel.trips2bel__enum_functor_desc_tconst_0_1;
    trips2bel__enum_name_ordered_tconst_0[2] = trips2bel.trips2bel__enum_functor_desc_tconst_0_9;
    trips2bel__enum_name_ordered_tconst_0[3] = trips2bel.trips2bel__enum_functor_desc_tconst_0_7;
    trips2bel__enum_name_ordered_tconst_0[4] = trips2bel.trips2bel__enum_functor_desc_tconst_0_5;
    trips2bel__enum_name_ordered_tconst_0[5] = trips2bel.trips2bel__enum_functor_desc_tconst_0_14;
    trips2bel__enum_name_ordered_tconst_0[6] = trips2bel.trips2bel__enum_functor_desc_tconst_0_0;
    trips2bel__enum_name_ordered_tconst_0[7] = trips2bel.trips2bel__enum_functor_desc_tconst_0_10;
    trips2bel__enum_name_ordered_tconst_0[8] = trips2bel.trips2bel__enum_functor_desc_tconst_0_12;
    trips2bel__enum_name_ordered_tconst_0[9] = trips2bel.trips2bel__enum_functor_desc_tconst_0_4;
    trips2bel__enum_name_ordered_tconst_0[10] = trips2bel.trips2bel__enum_functor_desc_tconst_0_16;
    trips2bel__enum_name_ordered_tconst_0[11] = trips2bel.trips2bel__enum_functor_desc_tconst_0_8;
    trips2bel__enum_name_ordered_tconst_0[12] = trips2bel.trips2bel__enum_functor_desc_tconst_0_3;
    trips2bel__enum_name_ordered_tconst_0[13] = trips2bel.trips2bel__enum_functor_desc_tconst_0_15;
    trips2bel__enum_name_ordered_tconst_0[14] = trips2bel.trips2bel__enum_functor_desc_tconst_0_6;
    trips2bel__enum_name_ordered_tconst_0[15] = trips2bel.trips2bel__enum_functor_desc_tconst_0_11;
    trips2bel__enum_name_ordered_tconst_0[16] = trips2bel.trips2bel__enum_functor_desc_tconst_0_2;
    //
    trips2bel__functor_number_map_tconst_0[0] = 6;
    trips2bel__functor_number_map_tconst_0[1] = 1;
    trips2bel__functor_number_map_tconst_0[2] = 16;
    trips2bel__functor_number_map_tconst_0[3] = 12;
    trips2bel__functor_number_map_tconst_0[4] = 9;
    trips2bel__functor_number_map_tconst_0[5] = 4;
    trips2bel__functor_number_map_tconst_0[6] = 14;
    trips2bel__functor_number_map_tconst_0[7] = 3;
    trips2bel__functor_number_map_tconst_0[8] = 11;
    trips2bel__functor_number_map_tconst_0[9] = 2;
    trips2bel__functor_number_map_tconst_0[10] = 7;
    trips2bel__functor_number_map_tconst_0[11] = 15;
    trips2bel__functor_number_map_tconst_0[12] = 8;
    trips2bel__functor_number_map_tconst_0[13] = 0;
    trips2bel__functor_number_map_tconst_0[14] = 5;
    trips2bel__functor_number_map_tconst_0[15] = 13;
    trips2bel__functor_number_map_tconst_0[16] = 10;
    //
    trips2bel__type_ctor_info_tconst_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_ENUM,
		((java.lang.Object) (new AddrOf2_0(50))),
		((java.lang.Object) (new AddrOf2_0(51))),
		"trips2bel",
		"tconst",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__enum_name_ordered_tconst_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__enum_value_ordered_tconst_0),
		17,
		4,
		trips2bel.trips2bel__functor_number_map_tconst_0);
    //
    trips2bel__type_ctor_info_text_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(52))),
		((java.lang.Object) (new AddrOf2_0(53))),
		"trips2bel",
		"text",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) trips2bel.list__ti_list_1builtin__type_ctor_info_string_0),
		-1,
		0,
		null);
    //
    //
    list__ti_list_1trips2bel__type_ctor_info_turn_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_turn_0)});
    //
    trips2bel__field_types_trfile_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    trips2bel__field_types_trfile_0_0[1] = (jmercury.runtime.PseudoTypeInfo) trips2bel.list__ti_list_1trips2bel__type_ctor_info_turn_0;
    //
    trips2bel__du_functor_desc_trfile_0_0.init("trfile",
		2,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		trips2bel.trips2bel__field_types_trfile_0_0,
		null,
		null,
		null);
    //
    trips2bel__du_stag_ordered_trfile_0_0[0] = trips2bel.trips2bel__du_functor_desc_trfile_0_0;
    //
    trips2bel__du_ptag_ordered_trfile_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		trips2bel.trips2bel__du_stag_ordered_trfile_0_0);
    //
    trips2bel__du_name_ordered_trfile_0[0] = trips2bel.trips2bel__du_functor_desc_trfile_0_0;
    //
    trips2bel__functor_number_map_trfile_0[0] = 0;
    //
    trips2bel__type_ctor_info_trfile_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(54))),
		((java.lang.Object) (new AddrOf2_0(55))),
		"trips2bel",
		"trfile",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__du_name_ordered_trfile_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__du_ptag_ordered_trfile_0),
		1,
		4,
		trips2bel.trips2bel__functor_number_map_trfile_0);
    //
    //
    list__ti_list_1trips2bel__type_ctor_info_turn2_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_turn2_0)});
    //
    trips2bel__field_types_trfile2_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    trips2bel__field_types_trfile2_0_0[1] = (jmercury.runtime.PseudoTypeInfo) trips2bel.list__ti_list_1trips2bel__type_ctor_info_turn2_0;
    //
    trips2bel__du_functor_desc_trfile2_0_0.init("trfile",
		2,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		trips2bel.trips2bel__field_types_trfile2_0_0,
		null,
		null,
		null);
    //
    trips2bel__du_stag_ordered_trfile2_0_0[0] = trips2bel.trips2bel__du_functor_desc_trfile2_0_0;
    //
    trips2bel__du_ptag_ordered_trfile2_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		trips2bel.trips2bel__du_stag_ordered_trfile2_0_0);
    //
    trips2bel__du_name_ordered_trfile2_0[0] = trips2bel.trips2bel__du_functor_desc_trfile2_0_0;
    //
    trips2bel__functor_number_map_trfile2_0[0] = 0;
    //
    trips2bel__type_ctor_info_trfile2_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(56))),
		((java.lang.Object) (new AddrOf2_0(57))),
		"trips2bel",
		"trfile2",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__du_name_ordered_trfile2_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__du_ptag_ordered_trfile2_0),
		1,
		4,
		trips2bel.trips2bel__functor_number_map_trfile2_0);
    //
    //
    list__ti_list_1trips2bel__type_ctor_info_turn3_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_turn3_0)});
    //
    trips2bel__field_types_trfile3_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    trips2bel__field_types_trfile3_0_0[1] = (jmercury.runtime.PseudoTypeInfo) trips2bel.list__ti_list_1trips2bel__type_ctor_info_turn3_0;
    trips2bel__field_types_trfile3_0_0[2] = (jmercury.runtime.PseudoTypeInfo) trips2bel.tree234__ti_tree234_2trips2bel__type_ctor_info_cvar_0builtin__type_ctor_info_string_0;
    //
    trips2bel__du_functor_desc_trfile3_0_0.init("trfile",
		3,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		trips2bel.trips2bel__field_types_trfile3_0_0,
		null,
		null,
		null);
    //
    trips2bel__du_stag_ordered_trfile3_0_0[0] = trips2bel.trips2bel__du_functor_desc_trfile3_0_0;
    //
    trips2bel__du_ptag_ordered_trfile3_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		trips2bel.trips2bel__du_stag_ordered_trfile3_0_0);
    //
    trips2bel__du_name_ordered_trfile3_0[0] = trips2bel.trips2bel__du_functor_desc_trfile3_0_0;
    //
    trips2bel__functor_number_map_trfile3_0[0] = 0;
    //
    trips2bel__type_ctor_info_trfile3_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(58))),
		((java.lang.Object) (new AddrOf2_0(59))),
		"trips2bel",
		"trfile3",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__du_name_ordered_trfile3_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__du_ptag_ordered_trfile3_0),
		1,
		4,
		trips2bel.trips2bel__functor_number_map_trfile3_0);
    //
    //
    list__ti_list_1trips2bel__type_ctor_info_sent_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_sent_0)});
    //
    trips2bel__field_types_turn_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    trips2bel__field_types_turn_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    trips2bel__field_types_turn_0_0[2] = (jmercury.runtime.PseudoTypeInfo) trips2bel.list__ti_list_1trips2bel__type_ctor_info_sent_0;
    //
    trips2bel__du_functor_desc_turn_0_0.init("turn",
		3,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		trips2bel.trips2bel__field_types_turn_0_0,
		null,
		null,
		null);
    //
    trips2bel__du_stag_ordered_turn_0_0[0] = trips2bel.trips2bel__du_functor_desc_turn_0_0;
    //
    trips2bel__du_ptag_ordered_turn_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		trips2bel.trips2bel__du_stag_ordered_turn_0_0);
    //
    trips2bel__du_name_ordered_turn_0[0] = trips2bel.trips2bel__du_functor_desc_turn_0_0;
    //
    trips2bel__functor_number_map_turn_0[0] = 0;
    //
    trips2bel__type_ctor_info_turn_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(60))),
		((java.lang.Object) (new AddrOf2_0(61))),
		"trips2bel",
		"turn",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__du_name_ordered_turn_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__du_ptag_ordered_turn_0),
		1,
		4,
		trips2bel.trips2bel__functor_number_map_turn_0);
    //
    //
    list__ti_list_1trips2bel__type_ctor_info_sent2_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_sent2_0)});
    //
    trips2bel__field_types_turn2_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    trips2bel__field_types_turn2_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    trips2bel__field_types_turn2_0_0[2] = (jmercury.runtime.PseudoTypeInfo) trips2bel.list__ti_list_1trips2bel__type_ctor_info_sent2_0;
    //
    trips2bel__du_functor_desc_turn2_0_0.init("turn",
		3,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		trips2bel.trips2bel__field_types_turn2_0_0,
		null,
		null,
		null);
    //
    trips2bel__du_stag_ordered_turn2_0_0[0] = trips2bel.trips2bel__du_functor_desc_turn2_0_0;
    //
    trips2bel__du_ptag_ordered_turn2_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		trips2bel.trips2bel__du_stag_ordered_turn2_0_0);
    //
    trips2bel__du_name_ordered_turn2_0[0] = trips2bel.trips2bel__du_functor_desc_turn2_0_0;
    //
    trips2bel__functor_number_map_turn2_0[0] = 0;
    //
    trips2bel__type_ctor_info_turn2_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(62))),
		((java.lang.Object) (new AddrOf2_0(63))),
		"trips2bel",
		"turn2",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__du_name_ordered_turn2_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__du_ptag_ordered_turn2_0),
		1,
		4,
		trips2bel.trips2bel__functor_number_map_turn2_0);
    //
    //
    list__ti_list_1trips2bel__type_ctor_info_sent3_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_sent3_0)});
    //
    trips2bel__field_types_turn3_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    trips2bel__field_types_turn3_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    trips2bel__field_types_turn3_0_0[2] = (jmercury.runtime.PseudoTypeInfo) trips2bel.list__ti_list_1trips2bel__type_ctor_info_sent3_0;
    //
    trips2bel__du_functor_desc_turn3_0_0.init("turn",
		3,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		trips2bel.trips2bel__field_types_turn3_0_0,
		null,
		null,
		null);
    //
    trips2bel__du_stag_ordered_turn3_0_0[0] = trips2bel.trips2bel__du_functor_desc_turn3_0_0;
    //
    trips2bel__du_ptag_ordered_turn3_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		trips2bel.trips2bel__du_stag_ordered_turn3_0_0);
    //
    trips2bel__du_name_ordered_turn3_0[0] = trips2bel.trips2bel__du_functor_desc_turn3_0_0;
    //
    trips2bel__functor_number_map_turn3_0[0] = 0;
    //
    trips2bel__type_ctor_info_turn3_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(64))),
		((java.lang.Object) (new AddrOf2_0(65))),
		"trips2bel",
		"turn3",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__du_name_ordered_turn3_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__du_ptag_ordered_turn3_0),
		1,
		4,
		trips2bel.trips2bel__functor_number_map_turn3_0);
    //
    trips2bel__type_ctor_info_turnno_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(66))),
		((java.lang.Object) (new AddrOf2_0(67))),
		"trips2bel",
		"turnno",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0),
		-1,
		0,
		null);
    //
    trips2bel__field_types_value_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    trips2bel__du_functor_desc_value_0_0.init("var",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		0,
		trips2bel.trips2bel__field_types_value_0_0,
		null,
		null,
		null);
    //
    trips2bel__field_types_value_0_1[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    trips2bel__du_functor_desc_value_0_1.init("con",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		trips2bel.trips2bel__field_types_value_0_1,
		null,
		null,
		null);
    //
    trips2bel__field_types_value_0_2[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    trips2bel__du_functor_desc_value_0_2.init("int",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		2,
		2,
		trips2bel.trips2bel__field_types_value_0_2,
		null,
		null,
		null);
    //
    //
    trips2bel__field_types_value_0_3[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_float_0;
    //
    trips2bel__du_functor_desc_value_0_3.init("float",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		3,
		3,
		trips2bel.trips2bel__field_types_value_0_3,
		null,
		null,
		null);
    //
    trips2bel__du_stag_ordered_value_0_0[0] = trips2bel.trips2bel__du_functor_desc_value_0_0;
    trips2bel__du_stag_ordered_value_0_0[1] = trips2bel.trips2bel__du_functor_desc_value_0_1;
    trips2bel__du_stag_ordered_value_0_0[2] = trips2bel.trips2bel__du_functor_desc_value_0_2;
    trips2bel__du_stag_ordered_value_0_0[3] = trips2bel.trips2bel__du_functor_desc_value_0_3;
    //
    trips2bel__du_ptag_ordered_value_0[0] = new jmercury.runtime.DuPtagLayout(4,
		private_builtin.MR_SECTAG_REMOTE,
		trips2bel.trips2bel__du_stag_ordered_value_0_0);
    //
    trips2bel__du_name_ordered_value_0[0] = trips2bel.trips2bel__du_functor_desc_value_0_1;
    trips2bel__du_name_ordered_value_0[1] = trips2bel.trips2bel__du_functor_desc_value_0_3;
    trips2bel__du_name_ordered_value_0[2] = trips2bel.trips2bel__du_functor_desc_value_0_2;
    trips2bel__du_name_ordered_value_0[3] = trips2bel.trips2bel__du_functor_desc_value_0_0;
    //
    trips2bel__functor_number_map_value_0[0] = 3;
    trips2bel__functor_number_map_value_0[1] = 0;
    trips2bel__functor_number_map_value_0[2] = 2;
    trips2bel__functor_number_map_value_0[3] = 1;
    //
    trips2bel__type_ctor_info_value_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(68))),
		((java.lang.Object) (new AddrOf2_0(69))),
		"trips2bel",
		"value",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__du_name_ordered_value_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__du_ptag_ordered_value_0),
		4,
		4,
		trips2bel.trips2bel__functor_number_map_value_0);
    //
    trips2bel__type_ctor_info_var_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(70))),
		((java.lang.Object) (new AddrOf2_0(71))),
		"trips2bel",
		"var",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0),
		-1,
		0,
		null);
    //
    list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0list__ti_list_1trips2bel__type_ctor_info_value_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.pair__ti_pair_2builtin__type_ctor_info_string_0list__ti_list_1trips2bel__type_ctor_info_value_0)});
    //
    //
    trips2bel__field_types_vardef_0_0[0] = (jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_tconst_0;
    trips2bel__field_types_vardef_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    trips2bel__field_types_vardef_0_0[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    trips2bel__field_types_vardef_0_0[3] = (jmercury.runtime.PseudoTypeInfo) trips2bel.list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_string_0list__ti_list_1trips2bel__type_ctor_info_value_0;
    //
    trips2bel__du_functor_desc_vardef_0_0.init("vardef",
		4,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		trips2bel.trips2bel__field_types_vardef_0_0,
		null,
		null,
		null);
    //
    trips2bel__du_stag_ordered_vardef_0_0[0] = trips2bel.trips2bel__du_functor_desc_vardef_0_0;
    //
    trips2bel__du_ptag_ordered_vardef_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		trips2bel.trips2bel__du_stag_ordered_vardef_0_0);
    //
    trips2bel__du_name_ordered_vardef_0[0] = trips2bel.trips2bel__du_functor_desc_vardef_0_0;
    //
    trips2bel__functor_number_map_vardef_0[0] = 0;
    //
    trips2bel__type_ctor_info_vardef_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(72))),
		((java.lang.Object) (new AddrOf2_0(73))),
		"trips2bel",
		"vardef",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__du_name_ordered_vardef_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__du_ptag_ordered_vardef_0),
		1,
		4,
		trips2bel.trips2bel__functor_number_map_vardef_0);
    //
    list__ti_list_1trips2bel__type_ctor_info_attr2_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_attr2_0)});
    //
    trips2bel__field_types_vardef2_0_0[0] = (jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_tconst_0;
    trips2bel__field_types_vardef2_0_0[1] = (jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_concept2_0;
    trips2bel__field_types_vardef2_0_0[2] = (jmercury.runtime.PseudoTypeInfo) trips2bel.list__ti_list_1trips2bel__type_ctor_info_attr2_0;
    //
    trips2bel__du_functor_desc_vardef2_0_0.init("vardef",
		3,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		trips2bel.trips2bel__field_types_vardef2_0_0,
		null,
		null,
		null);
    //
    trips2bel__du_stag_ordered_vardef2_0_0[0] = trips2bel.trips2bel__du_functor_desc_vardef2_0_0;
    //
    trips2bel__du_ptag_ordered_vardef2_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		trips2bel.trips2bel__du_stag_ordered_vardef2_0_0);
    //
    trips2bel__du_name_ordered_vardef2_0[0] = trips2bel.trips2bel__du_functor_desc_vardef2_0_0;
    //
    trips2bel__functor_number_map_vardef2_0[0] = 0;
    //
    trips2bel__type_ctor_info_vardef2_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(74))),
		((java.lang.Object) (new AddrOf2_0(75))),
		"trips2bel",
		"vardef2",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__du_name_ordered_vardef2_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__du_ptag_ordered_vardef2_0),
		1,
		4,
		trips2bel.trips2bel__functor_number_map_vardef2_0);
    //
    tree234__ti_tree234_2trips2bel__type_ctor_info_cvar_0builtin__type_ctor_info_int_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_cvar_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0)});
    //
    trips2bel__type_ctor_info_varmap_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(76))),
		((java.lang.Object) (new AddrOf2_0(77))),
		"trips2bel",
		"varmap",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) trips2bel.tree234__ti_tree234_2trips2bel__type_ctor_info_cvar_0builtin__type_ctor_info_int_0),
		-1,
		0,
		null);
    //
    trips2bel__type_ctor_info_vdmap_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(78))),
		((java.lang.Object) (new AddrOf2_0(79))),
		"trips2bel",
		"vdmap",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) trips2bel.tree234__ti_tree234_2builtin__type_ctor_info_int_0trips2bel__type_ctor_info_vardef2_0),
		-1,
		0,
		null);
    //
    set_ordlist__ti_set_ordlist_1builtin__type_ctor_info_int_0.init(set_ordlist.set_ordlist__type_ctor_info_set_ordlist_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0)});
    //
    list__ti_list_1list__ti_list_1builtin__type_ctor_info_int_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.list__ti_list_1builtin__type_ctor_info_int_0)});
    //
    trips2bel__field_types_vertices_0_0[0] = (jmercury.runtime.PseudoTypeInfo) trips2bel.set_ordlist__ti_set_ordlist_1builtin__type_ctor_info_int_0;
    trips2bel__field_types_vertices_0_0[1] = (jmercury.runtime.PseudoTypeInfo) trips2bel.set_ordlist__ti_set_ordlist_1builtin__type_ctor_info_int_0;
    trips2bel__field_types_vertices_0_0[2] = (jmercury.runtime.PseudoTypeInfo) trips2bel.list__ti_list_1builtin__type_ctor_info_int_0;
    trips2bel__field_types_vertices_0_0[3] = (jmercury.runtime.PseudoTypeInfo) trips2bel.list__ti_list_1list__ti_list_1builtin__type_ctor_info_int_0;
    //
    trips2bel__du_functor_desc_vertices_0_0.init("vs",
		4,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		trips2bel.trips2bel__field_types_vertices_0_0,
		null,
		null,
		null);
    //
    trips2bel__du_stag_ordered_vertices_0_0[0] = trips2bel.trips2bel__du_functor_desc_vertices_0_0;
    //
    trips2bel__du_ptag_ordered_vertices_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		trips2bel.trips2bel__du_stag_ordered_vertices_0_0);
    //
    trips2bel__du_name_ordered_vertices_0[0] = trips2bel.trips2bel__du_functor_desc_vertices_0_0;
    //
    trips2bel__functor_number_map_vertices_0[0] = 0;
    //
    trips2bel__type_ctor_info_vertices_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(80))),
		((java.lang.Object) (new AddrOf2_0(81))),
		"trips2bel",
		"vertices",
		new jmercury.runtime.TypeFunctors(trips2bel.trips2bel__du_name_ordered_vertices_0),
		new jmercury.runtime.TypeLayout(trips2bel.trips2bel__du_ptag_ordered_vertices_0),
		1,
		4,
		trips2bel.trips2bel__functor_number_map_vertices_0);
  }

// DataDefns
  static {
  }

// Scalar common data
  private static final jmercury.runtime.TypeInfo_Struct[] MR_scalar_common_1 = new jmercury.runtime.TypeInfo_Struct[26];
  private static final io.Posn_0[] MR_scalar_common_2 = new io.Posn_0[1];
  private static final list.List_1.F_nil_0[] MR_scalar_common_3 = new list.List_1.F_nil_0[1];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_4 = new /* generic_type */ java.lang.Object[5][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_5 = new /* generic_type */ java.lang.Object[1][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_6 = new /* generic_type */ java.lang.Object[2][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_7 = new /* generic_type */ java.lang.Object[1][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_8 = new /* generic_type */ java.lang.Object[2][];
  private static final trips2bel.Concept2_0.Abstract_0[] MR_scalar_common_9 = new trips2bel.Concept2_0.Abstract_0[1];
  private static final trips2bel.Concept2_0.Empty_0[] MR_scalar_common_10 = new trips2bel.Concept2_0.Empty_0[1];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_11 = new /* generic_type */ java.lang.Object[3][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_12 = new /* generic_type */ java.lang.Object[1][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_13 = new /* generic_type */ java.lang.Object[2][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_14 = new /* generic_type */ java.lang.Object[2][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_15 = new /* generic_type */ java.lang.Object[1][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_16 = new /* generic_type */ java.lang.Object[2][];
  private static final trips2bel.Attr2_0.Orientation_1[] MR_scalar_common_18 = new trips2bel.Attr2_0.Orientation_1[5];
  private static final trips2bel.Attr2_0.Operator_1[] MR_scalar_common_19 = new trips2bel.Attr2_0.Operator_1[8];
  private static final trips2bel.Attr2_0.Negation_1[] MR_scalar_common_20 = new trips2bel.Attr2_0.Negation_1[1];
  private static final trips2bel.Attr2_0.Functn_arg_1[] MR_scalar_common_21 = new trips2bel.Attr2_0.Functn_arg_1[1];
  private static final trips2bel.Attr2_0.Force_1[] MR_scalar_common_22 = new trips2bel.Attr2_0.Force_1[8];
  private static final trips2bel.Attr2_0.Context_rel_1[] MR_scalar_common_23 = new trips2bel.Attr2_0.Context_rel_1[3];
  private static void MR_init_scalars_0() {
    MR_scalar_common_1[0] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(errors.errors__type_ctor_info_messages_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0))));
    MR_scalar_common_1[1] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_cvar_0))));
    MR_scalar_common_1[2] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_concept2_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[1]))));
    MR_scalar_common_1[3] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(tree234.tree234__type_ctor_info_tree234_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_cvar_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[2]))));
    MR_scalar_common_1[4] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(tree234.tree234__type_ctor_info_tree234_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_cvar_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[1]))));
    MR_scalar_common_1[5] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0))));
    MR_scalar_common_1[6] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(set_ordlist.set_ordlist__type_ctor_info_set_ordlist_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_cvar_0))));
    MR_scalar_common_1[7] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(set_ordlist.set_ordlist__type_ctor_info_set_ordlist_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))));
    MR_scalar_common_1[8] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(tree234.tree234__type_ctor_info_tree234_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_cvar_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))));
    MR_scalar_common_1[9] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(tree234.tree234__type_ctor_info_tree234_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[5]))));
    MR_scalar_common_1[10] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))));
    MR_scalar_common_1[11] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(tree234.tree234__type_ctor_info_tree234_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_vardef2_0))));
    MR_scalar_common_1[12] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_value_0))));
    MR_scalar_common_1[13] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[12]))));
    MR_scalar_common_1[14] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_attr2_0))));
    MR_scalar_common_1[15] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_expr_0))));
    MR_scalar_common_1[16] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_vardef_0))));
    MR_scalar_common_1[17] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(tree234.tree234__type_ctor_info_tree234_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_cvar_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0))));
    MR_scalar_common_1[18] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_turn_0))));
    MR_scalar_common_1[19] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_turn2_0))));
    MR_scalar_common_1[20] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_turn3_0))));
    MR_scalar_common_1[21] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_sent_0))));
    MR_scalar_common_1[22] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_sent2_0))));
    MR_scalar_common_1[23] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_sent3_0))));
    MR_scalar_common_1[24] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[13]))));
    MR_scalar_common_1[25] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[10]))));
    MR_scalar_common_2[0] = new io.Posn_0(0,
		0,
		0);
    MR_scalar_common_3[0] = new list.List_1.F_nil_0();
    MR_scalar_common_4[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(6),
		((java.lang.Object) (trips2bel.maybe__pti_maybe_1__plain_wordnet__type_ctor_info_wndata_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_turn_0)),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_turn2_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_4[1] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(6),
		((java.lang.Object) (trips2bel.maybe__pti_maybe_1__plain_wordnet__type_ctor_info_wndata_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_sent_0)),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_sent2_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_4[2] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(6),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_sent2_0)),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_sent3_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_4[3] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(6),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_cvar_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_trips2bel__type_ctor_info_expr_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_trips2bel__type_ctor_info_expr_0))};
    MR_scalar_common_4[4] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(6),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_cvar_0)),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_list__ti_list_1trips2bel__type_ctor_info_cvar_0)),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_list__ti_list_1trips2bel__type_ctor_info_cvar_0))};
    MR_scalar_common_5[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(5),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_turn2_0)),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_turn3_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_6[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(8),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_turn2_0)),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_pair__ti_pair_2trips2bel__type_ctor_info_concept2_0list__ti_list_1trips2bel__type_ctor_info_cvar_0)),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_pair__ti_pair_2trips2bel__type_ctor_info_concept2_0list__ti_list_1trips2bel__type_ctor_info_cvar_0)),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_list__ti_list_1trips2bel__type_ctor_info_cvar_0)),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_list__ti_list_1trips2bel__type_ctor_info_cvar_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_6[1] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(8),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_trips2bel__type_ctor_info_vardef2_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_trips2bel__type_ctor_info_expr_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_trips2bel__type_ctor_info_expr_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_7[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(12),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_pair__ti_pair_2trips2bel__type_ctor_info_concept2_0list__ti_list_1trips2bel__type_ctor_info_cvar_0)),
		((java.lang.Object) (trips2bel.set_ordlist__pti_set_ordlist_1__plain_trips2bel__type_ctor_info_cvar_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (trips2bel.set_ordlist__pti_set_ordlist_1__plain_builtin__type_ctor_info_int_0)),
		((java.lang.Object) (trips2bel.set_ordlist__pti_set_ordlist_1__plain_builtin__type_ctor_info_int_0)),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_builtin__type_ctor_info_int_0)),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_builtin__type_ctor_info_int_0)),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1builtin__type_ctor_info_string_0)),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1builtin__type_ctor_info_string_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_builtin__type_ctor_info_int_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_builtin__type_ctor_info_int_0))};
    MR_scalar_common_8[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(7),
		((java.lang.Object) (trips2bel.maybe__pti_maybe_1__plain_wordnet__type_ctor_info_wndata_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_vardef_0)),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_trips2bel__type_ctor_info_vardef2_0)),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_trips2bel__type_ctor_info_vardef2_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_8[1] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(7),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (trips2bel.pair__pti_pair_2__plain_builtin__type_ctor_info_string_0__plain_list__ti_list_1trips2bel__type_ctor_info_value_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_trips2bel__type_ctor_info_attr2_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_trips2bel__type_ctor_info_attr2_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_9[0] = new trips2bel.Concept2_0.Abstract_0();
    MR_scalar_common_10[0] = new trips2bel.Concept2_0.Empty_0();
    MR_scalar_common_11[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(4),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_trips2bel__type_ctor_info_vardef2_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_vertices_0)),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_vertices_0))};
    MR_scalar_common_11[1] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(4),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_trips2bel__type_ctor_info_attr2_0)),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_cvar_0))};
    MR_scalar_common_11[2] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(4),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_cvar_0)),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_builtin__type_ctor_info_int_0)),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_builtin__type_ctor_info_int_0))};
    MR_scalar_common_12[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(9),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_sent2_0)),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_pair__ti_pair_2trips2bel__type_ctor_info_concept2_0list__ti_list_1trips2bel__type_ctor_info_cvar_0)),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_pair__ti_pair_2trips2bel__type_ctor_info_concept2_0list__ti_list_1trips2bel__type_ctor_info_cvar_0)),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_list__ti_list_1trips2bel__type_ctor_info_cvar_0)),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_list__ti_list_1trips2bel__type_ctor_info_cvar_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_13[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(10),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_vardef2_0)),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_pair__ti_pair_2trips2bel__type_ctor_info_concept2_0list__ti_list_1trips2bel__type_ctor_info_cvar_0)),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_pair__ti_pair_2trips2bel__type_ctor_info_concept2_0list__ti_list_1trips2bel__type_ctor_info_cvar_0)),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_list__ti_list_1trips2bel__type_ctor_info_cvar_0)),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_list__ti_list_1trips2bel__type_ctor_info_cvar_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_13[1] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(10),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_cvar_0)),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_attr2_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_trips2bel__type_ctor_info_expr_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_trips2bel__type_ctor_info_expr_0)),
		((java.lang.Object) (bool.bool__type_ctor_info_bool_0)),
		((java.lang.Object) (bool.bool__type_ctor_info_bool_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (trips2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_14[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(3),
		((java.lang.Object) (trips2bel.tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_pair__ti_pair_2trips2bel__type_ctor_info_concept2_0list__ti_list_1trips2bel__type_ctor_info_cvar_0)),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_cvar_0)),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_concept2_0))};
    MR_scalar_common_14[1] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(3),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_attr2_0)),
		((java.lang.Object) (trips2bel.set_ordlist__pti_set_ordlist_1__plain_builtin__type_ctor_info_int_0)),
		((java.lang.Object) (trips2bel.set_ordlist__pti_set_ordlist_1__plain_builtin__type_ctor_info_int_0))};
    MR_scalar_common_15[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(2),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_concept2_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0))};
    MR_scalar_common_16[0] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (trips2bel.MR_scalar_common_15[0])),
		((java.lang.Object) (new AddrOf2_0(85))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_16[1] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (trips2bel.MR_scalar_common_14[1])),
		((java.lang.Object) (new AddrOf3_0(10))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_18[0] = new trips2bel.Attr2_0.Orientation_1(trips2bel.Orientval_0.K0);
    MR_scalar_common_18[1] = new trips2bel.Attr2_0.Orientation_1(trips2bel.Orientval_0.K4);
    MR_scalar_common_18[2] = new trips2bel.Attr2_0.Orientation_1(trips2bel.Orientval_0.K1);
    MR_scalar_common_18[3] = new trips2bel.Attr2_0.Orientation_1(trips2bel.Orientval_0.K2);
    MR_scalar_common_18[4] = new trips2bel.Attr2_0.Orientation_1(trips2bel.Orientval_0.K3);
    MR_scalar_common_19[0] = new trips2bel.Attr2_0.Operator_1(trips2bel.Opval_0.K7);
    MR_scalar_common_19[1] = new trips2bel.Attr2_0.Operator_1(trips2bel.Opval_0.K2);
    MR_scalar_common_19[2] = new trips2bel.Attr2_0.Operator_1(trips2bel.Opval_0.K3);
    MR_scalar_common_19[3] = new trips2bel.Attr2_0.Operator_1(trips2bel.Opval_0.K4);
    MR_scalar_common_19[4] = new trips2bel.Attr2_0.Operator_1(trips2bel.Opval_0.K5);
    MR_scalar_common_19[5] = new trips2bel.Attr2_0.Operator_1(trips2bel.Opval_0.K1);
    MR_scalar_common_19[6] = new trips2bel.Attr2_0.Operator_1(trips2bel.Opval_0.K6);
    MR_scalar_common_19[7] = new trips2bel.Attr2_0.Operator_1(trips2bel.Opval_0.K0);
    MR_scalar_common_20[0] = new trips2bel.Attr2_0.Negation_1(trips2bel.Negval_0.K0);
    MR_scalar_common_21[0] = new trips2bel.Attr2_0.Functn_arg_1(trips2bel.Fargval_0.K0);
    MR_scalar_common_22[0] = new trips2bel.Attr2_0.Force_1(trips2bel.Forceval_0.K0);
    MR_scalar_common_22[1] = new trips2bel.Attr2_0.Force_1(trips2bel.Forceval_0.K6);
    MR_scalar_common_22[2] = new trips2bel.Attr2_0.Force_1(trips2bel.Forceval_0.K7);
    MR_scalar_common_22[3] = new trips2bel.Attr2_0.Force_1(trips2bel.Forceval_0.K2);
    MR_scalar_common_22[4] = new trips2bel.Attr2_0.Force_1(trips2bel.Forceval_0.K3);
    MR_scalar_common_22[5] = new trips2bel.Attr2_0.Force_1(trips2bel.Forceval_0.K5);
    MR_scalar_common_22[6] = new trips2bel.Attr2_0.Force_1(trips2bel.Forceval_0.K4);
    MR_scalar_common_22[7] = new trips2bel.Attr2_0.Force_1(trips2bel.Forceval_0.K1);
    MR_scalar_common_23[0] = new trips2bel.Attr2_0.Context_rel_1(trips2bel.Cxrelval_0.K1);
    MR_scalar_common_23[1] = new trips2bel.Attr2_0.Context_rel_1(trips2bel.Cxrelval_0.K2);
    MR_scalar_common_23[2] = new trips2bel.Attr2_0.Context_rel_1(trips2bel.Cxrelval_0.K0);
  }
  static {
    MR_init_scalars_0();
  }

// Vector common data
//  trips2bel.m:313
  private static final class Vector_common_type_17_0
  {
    public final java.lang.String vct_17_f_0;
    public final int vct_17_f_1;

    public Vector_common_type_17_0(
      java.lang.String vct_17_f_0,
      int vct_17_f_1)
    {
      {
        this.vct_17_f_0 = vct_17_f_0;
        this.vct_17_f_1 = vct_17_f_1;
      }
    }
  }

  private static final trips2bel.Vector_common_type_17_0 MR_vector_common_17[] = {
    new trips2bel.Vector_common_type_17_0(":AGE",
		0),
		new trips2bel.Vector_common_type_17_0(":AM-PM",
		1),
		new trips2bel.Vector_common_type_17_0(":AMOUNT",
		2),
		new trips2bel.Vector_common_type_17_0(":CENTURY",
		3),
		new trips2bel.Vector_common_type_17_0(":CONTENT",
		4),
		new trips2bel.Vector_common_type_17_0(":COST",
		5),
		new trips2bel.Vector_common_type_17_0(":DAY",
		6),
		new trips2bel.Vector_common_type_17_0(":DAY-OF-WEEK",
		7),
		new trips2bel.Vector_common_type_17_0(":DECADE",
		8),
		new trips2bel.Vector_common_type_17_0(":DEGREE",
		9),
		new trips2bel.Vector_common_type_17_0(":DOW",
		10),
		new trips2bel.Vector_common_type_17_0(":DURATION",
		11),
		new trips2bel.Vector_common_type_17_0(":END",
		12),
		new trips2bel.Vector_common_type_17_0(":EXTENT",
		13),
		new trips2bel.Vector_common_type_17_0(":FREQUENCY",
		14),
		new trips2bel.Vector_common_type_17_0(":HOUR",
		15),
		new trips2bel.Vector_common_type_17_0(":INTENSITY",
		16),
		new trips2bel.Vector_common_type_17_0(":MAX",
		17),
		new trips2bel.Vector_common_type_17_0(":MIN",
		18),
		new trips2bel.Vector_common_type_17_0(":MINUTE",
		19),
		new trips2bel.Vector_common_type_17_0(":MONTH",
		20),
		new trips2bel.Vector_common_type_17_0(":NAME-OF",
		21),
		new trips2bel.Vector_common_type_17_0(":NUMBER",
		22),
		new trips2bel.Vector_common_type_17_0(":OVER-PERIOD",
		23),
		new trips2bel.Vector_common_type_17_0(":PHASE",
		24),
		new trips2bel.Vector_common_type_17_0(":PUNCTYPE",
		25),
		new trips2bel.Vector_common_type_17_0(":QUAN",
		26),
		new trips2bel.Vector_common_type_17_0(":QUANTITY",
		27),
		new trips2bel.Vector_common_type_17_0(":RANGE",
		28),
		new trips2bel.Vector_common_type_17_0(":REFERS-TO",
		29),
		new trips2bel.Vector_common_type_17_0(":REPEATS",
		30),
		new trips2bel.Vector_common_type_17_0(":SCALE",
		31),
		new trips2bel.Vector_common_type_17_0(":SEQUENCE",
		32),
		new trips2bel.Vector_common_type_17_0(":SIZE",
		33),
		new trips2bel.Vector_common_type_17_0(":START",
		34),
		new trips2bel.Vector_common_type_17_0(":TIME-DURATION-REL",
		35),
		new trips2bel.Vector_common_type_17_0(":TIME-VAL",
		36),
		new trips2bel.Vector_common_type_17_0(":TMA",
		37),
		new trips2bel.Vector_common_type_17_0(":UNIT",
		38),
		new trips2bel.Vector_common_type_17_0(":VALUE",
		39),
		new trips2bel.Vector_common_type_17_0(":YEAR",
		40),
		new trips2bel.Vector_common_type_17_0(":ACTION",
		0),
		new trips2bel.Vector_common_type_17_0(":ADDRESSEE",
		1),
		new trips2bel.Vector_common_type_17_0(":AFFECTED",
		2),
		new trips2bel.Vector_common_type_17_0(":AGENT",
		3),
		new trips2bel.Vector_common_type_17_0(":ALONG",
		4),
		new trips2bel.Vector_common_type_17_0(":ARG0",
		5),
		new trips2bel.Vector_common_type_17_0(":ARG1",
		6),
		new trips2bel.Vector_common_type_17_0(":ASSOC-POSS",
		7),
		new trips2bel.Vector_common_type_17_0(":ASSOC-WITH",
		8),
		new trips2bel.Vector_common_type_17_0(":ASSOCIATED-INFORMATION",
		9),
		new trips2bel.Vector_common_type_17_0(":ATTRIBUTE",
		10),
		new trips2bel.Vector_common_type_17_0(":CAUSE",
		11),
		new trips2bel.Vector_common_type_17_0(":CO-AGENT",
		12),
		new trips2bel.Vector_common_type_17_0(":CO-THEME",
		13),
		new trips2bel.Vector_common_type_17_0(":COGNIZER",
		14),
		new trips2bel.Vector_common_type_17_0(":COMP3",
		15),
		new trips2bel.Vector_common_type_17_0(":CONTENT",
		16),
		new trips2bel.Vector_common_type_17_0(":CONTENTS",
		17),
		new trips2bel.Vector_common_type_17_0(":DISPLACEMENT",
		18),
		new trips2bel.Vector_common_type_17_0(":DOBJ",
		19),
		new trips2bel.Vector_common_type_17_0(":EFFECT",
		20),
		new trips2bel.Vector_common_type_17_0(":EQ",
		21),
		new trips2bel.Vector_common_type_17_0(":EXPERIENCER",
		22),
		new trips2bel.Vector_common_type_17_0(":FIGURE",
		23),
		new trips2bel.Vector_common_type_17_0(":FOCUS",
		24),
		new trips2bel.Vector_common_type_17_0(":FROM",
		25),
		new trips2bel.Vector_common_type_17_0(":GOAL",
		26),
		new trips2bel.Vector_common_type_17_0(":GROUND",
		27),
		new trips2bel.Vector_common_type_17_0(":INSTRUMENT",
		28),
		new trips2bel.Vector_common_type_17_0(":IS",
		29),
		new trips2bel.Vector_common_type_17_0(":LIKE",
		30),
		new trips2bel.Vector_common_type_17_0(":LOBJ",
		31),
		new trips2bel.Vector_common_type_17_0(":LOCATION",
		32),
		new trips2bel.Vector_common_type_17_0(":LSUBJ",
		33),
		new trips2bel.Vector_common_type_17_0(":OBJ-VAL",
		34),
		new trips2bel.Vector_common_type_17_0(":OF",
		35),
		new trips2bel.Vector_common_type_17_0(":OF-STATE",
		36),
		new trips2bel.Vector_common_type_17_0(":PARENTHETICAL",
		37),
		new trips2bel.Vector_common_type_17_0(":PART",
		38),
		new trips2bel.Vector_common_type_17_0(":PATH",
		39),
		new trips2bel.Vector_common_type_17_0(":PREDICATE",
		40),
		new trips2bel.Vector_common_type_17_0(":PROPERTY",
		41),
		new trips2bel.Vector_common_type_17_0(":PURPOSE",
		42),
		new trips2bel.Vector_common_type_17_0(":PURPOSE-IMPLICIT",
		43),
		new trips2bel.Vector_common_type_17_0(":RECIPIENT",
		44),
		new trips2bel.Vector_common_type_17_0(":REFOBJECT",
		45),
		new trips2bel.Vector_common_type_17_0(":REFSET",
		46),
		new trips2bel.Vector_common_type_17_0(":RELATED-TO",
		47),
		new trips2bel.Vector_common_type_17_0(":RESULT",
		48),
		new trips2bel.Vector_common_type_17_0(":RESULT-VAL",
		49),
		new trips2bel.Vector_common_type_17_0(":SOURCE",
		50),
		new trips2bel.Vector_common_type_17_0(":STIMULUS",
		51),
		new trips2bel.Vector_common_type_17_0(":SUBCAT",
		52),
		new trips2bel.Vector_common_type_17_0(":SUCHTHAT",
		53),
		new trips2bel.Vector_common_type_17_0(":THEME",
		54),
		new trips2bel.Vector_common_type_17_0(":TO",
		55),
		new trips2bel.Vector_common_type_17_0(":TO-LOC",
		56),
		new trips2bel.Vector_common_type_17_0(":VAL",
		57),
		new trips2bel.Vector_common_type_17_0(":VIA",
		58),
		new trips2bel.Vector_common_type_17_0("ONT::LESS",
		0),
		new trips2bel.Vector_common_type_17_0("ONT::MORE",
		1),
		new trips2bel.Vector_common_type_17_0("ONT::NEG",
		2),
		new trips2bel.Vector_common_type_17_0("ONT::NEUTRAL",
		3),
		new trips2bel.Vector_common_type_17_0("ONT::POS",
		4),
		new trips2bel.Vector_common_type_17_0("ONT::AND",
		0),
		new trips2bel.Vector_common_type_17_0("ONT::BOTH",
		1),
		new trips2bel.Vector_common_type_17_0("ONT::BUT",
		2),
		new trips2bel.Vector_common_type_17_0("ONT::EITHER",
		3),
		new trips2bel.Vector_common_type_17_0("ONT::MEMBERS",
		4),
		new trips2bel.Vector_common_type_17_0("ONT::ONE-OF",
		5),
		new trips2bel.Vector_common_type_17_0("ONT::OR",
		6),
		new trips2bel.Vector_common_type_17_0("ONT::PLUS",
		7),
		new trips2bel.Vector_common_type_17_0("ONT::FALSE",
		0),
		new trips2bel.Vector_common_type_17_0("ONT::FUTURE",
		1),
		new trips2bel.Vector_common_type_17_0("ONT::FUTURENOT",
		2),
		new trips2bel.Vector_common_type_17_0("ONT::IMPOSSIBLE",
		3),
		new trips2bel.Vector_common_type_17_0("ONT::POSSIBLE",
		4),
		new trips2bel.Vector_common_type_17_0("ONT::PROHIBITED",
		5),
		new trips2bel.Vector_common_type_17_0("ONT::REQUIRED",
		6),
		new trips2bel.Vector_common_type_17_0("ONT::TRUE",
		7),
		new trips2bel.Vector_common_type_17_0(":ACTS",
		0),
		new trips2bel.Vector_common_type_17_0(":CONDITION",
		1),
		new trips2bel.Vector_common_type_17_0(":CONTEXT-REL",
		2),
		new trips2bel.Vector_common_type_17_0(":FORCE",
		3),
		new trips2bel.Vector_common_type_17_0(":FUNCTN-ARG",
		4),
		new trips2bel.Vector_common_type_17_0(":MODS",
		5),
		new trips2bel.Vector_common_type_17_0(":NAME-MODIFIERS",
		6),
		new trips2bel.Vector_common_type_17_0(":NEGATION",
		7),
		new trips2bel.Vector_common_type_17_0(":OPERATOR",
		8),
		new trips2bel.Vector_common_type_17_0(":ORIENTATION",
		9),
		new trips2bel.Vector_common_type_17_0(":PROFORM",
		10)
  };

// NonDataDefns
  private static boolean __Unify____attr2_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____attr2_0_0(((trips2bel.Attr2_0) wrapper_arg_1), ((trips2bel.Attr2_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____attr2_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____attr2_0_0(((trips2bel.Attr2_0) wrapper_arg_2), ((trips2bel.Attr2_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____attribute_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____attribute_0_0(((pair.Pair_2) wrapper_arg_1), ((pair.Pair_2) wrapper_arg_2));
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
        conv0_HeadVar__1_1 = trips2bel.__Compare____attribute_0_0(((pair.Pair_2) wrapper_arg_2), ((pair.Pair_2) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____class_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____class_0_0(((set_ordlist.Set_ordlist_1) wrapper_arg_1), ((set_ordlist.Set_ordlist_1) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____class_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____class_0_0(((set_ordlist.Set_ordlist_1) wrapper_arg_2), ((set_ordlist.Set_ordlist_1) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____concept2_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____concept2_0_0(((trips2bel.Concept2_0) wrapper_arg_1), ((trips2bel.Concept2_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____concept2_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____concept2_0_0(((trips2bel.Concept2_0) wrapper_arg_2), ((trips2bel.Concept2_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____conceptname_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____conceptname_0_0(((java.lang.String) wrapper_arg_1), ((java.lang.String) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____conceptname_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____conceptname_0_0(((java.lang.String) wrapper_arg_2), ((java.lang.String) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____condval_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____condval_0_0(((trips2bel.Condval_0) wrapper_arg_1), ((trips2bel.Condval_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____condval_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____condval_0_0(((trips2bel.Condval_0) wrapper_arg_2), ((trips2bel.Condval_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____cvar_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____cvar_0_0(((trips2bel.Cvar_0) wrapper_arg_1), ((trips2bel.Cvar_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____cvar_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____cvar_0_0(((trips2bel.Cvar_0) wrapper_arg_2), ((trips2bel.Cvar_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____cvarmap_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____cvarmap_0_0(((tree234.Tree234_2) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____cvarmap_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____cvarmap_0_0(((tree234.Tree234_2) wrapper_arg_2), ((tree234.Tree234_2) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____cvrmap_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____cvrmap_0_0(((tree234.Tree234_2) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____cvrmap_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____cvrmap_0_0(((tree234.Tree234_2) wrapper_arg_2), ((tree234.Tree234_2) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____cxrelval_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____cxrelval_0_0(((trips2bel.Cxrelval_0) wrapper_arg_1), ((trips2bel.Cxrelval_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____cxrelval_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____cxrelval_0_0(((trips2bel.Cxrelval_0) wrapper_arg_2), ((trips2bel.Cxrelval_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____expr_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____expr_0_0(((trips2bel.Expr_0) wrapper_arg_1), ((trips2bel.Expr_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____expr_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____expr_0_0(((trips2bel.Expr_0) wrapper_arg_2), ((trips2bel.Expr_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____exptp_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____exptp_0_0(((trips2bel.Exptp_0) wrapper_arg_1), ((trips2bel.Exptp_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____exptp_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____exptp_0_0(((trips2bel.Exptp_0) wrapper_arg_2), ((trips2bel.Exptp_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____fargval_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____fargval_0_0();
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____fargval_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____fargval_0_0();
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____forceval_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____forceval_0_0(((trips2bel.Forceval_0) wrapper_arg_1), ((trips2bel.Forceval_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____forceval_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____forceval_0_0(((trips2bel.Forceval_0) wrapper_arg_2), ((trips2bel.Forceval_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____negval_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____negval_0_0();
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____negval_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____negval_0_0();
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____opval_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____opval_0_0(((trips2bel.Opval_0) wrapper_arg_1), ((trips2bel.Opval_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____opval_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____opval_0_0(((trips2bel.Opval_0) wrapper_arg_2), ((trips2bel.Opval_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____orientval_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____orientval_0_0(((trips2bel.Orientval_0) wrapper_arg_1), ((trips2bel.Orientval_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____orientval_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____orientval_0_0(((trips2bel.Orientval_0) wrapper_arg_2), ((trips2bel.Orientval_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____reftp_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____reftp_0_0(((trips2bel.Reftp_0) wrapper_arg_1), ((trips2bel.Reftp_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____reftp_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____reftp_0_0(((trips2bel.Reftp_0) wrapper_arg_2), ((trips2bel.Reftp_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____role_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____role_0_0(((java.lang.String) wrapper_arg_1), ((java.lang.String) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____role_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____role_0_0(((java.lang.String) wrapper_arg_2), ((java.lang.String) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____sent_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____sent_0_0(((trips2bel.Sent_0) wrapper_arg_1), ((trips2bel.Sent_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____sent_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____sent_0_0(((trips2bel.Sent_0) wrapper_arg_2), ((trips2bel.Sent_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____sent2_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____sent2_0_0(((trips2bel.Sent2_0) wrapper_arg_1), ((trips2bel.Sent2_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____sent2_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____sent2_0_0(((trips2bel.Sent2_0) wrapper_arg_2), ((trips2bel.Sent2_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____sent3_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____sent3_0_0(((trips2bel.Sent3_0) wrapper_arg_1), ((trips2bel.Sent3_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____sent3_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____sent3_0_0(((trips2bel.Sent3_0) wrapper_arg_2), ((trips2bel.Sent3_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____speaker_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____speaker_0_0(((java.lang.String) wrapper_arg_1), ((java.lang.String) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____speaker_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____speaker_0_0(((java.lang.String) wrapper_arg_2), ((java.lang.String) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____superclass_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____superclass_0_0(((java.lang.String) wrapper_arg_1), ((java.lang.String) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____superclass_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____superclass_0_0(((java.lang.String) wrapper_arg_2), ((java.lang.String) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____symmap_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____symmap_0_0(((tree234.Tree234_2) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____symmap_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____symmap_0_0(((tree234.Tree234_2) wrapper_arg_2), ((tree234.Tree234_2) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____tconst_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____tconst_0_0(((trips2bel.Tconst_0) wrapper_arg_1), ((trips2bel.Tconst_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____tconst_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____tconst_0_0(((trips2bel.Tconst_0) wrapper_arg_2), ((trips2bel.Tconst_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____text_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____text_0_0(((list.List_1) wrapper_arg_1), ((list.List_1) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____text_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____text_0_0(((list.List_1) wrapper_arg_2), ((list.List_1) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____trfile_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____trfile_0_0(((trips2bel.Trfile_0) wrapper_arg_1), ((trips2bel.Trfile_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____trfile_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____trfile_0_0(((trips2bel.Trfile_0) wrapper_arg_2), ((trips2bel.Trfile_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____trfile2_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____trfile2_0_0(((trips2bel.Trfile2_0) wrapper_arg_1), ((trips2bel.Trfile2_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____trfile2_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____trfile2_0_0(((trips2bel.Trfile2_0) wrapper_arg_2), ((trips2bel.Trfile2_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____trfile3_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____trfile3_0_0(((trips2bel.Trfile3_0) wrapper_arg_1), ((trips2bel.Trfile3_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____trfile3_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____trfile3_0_0(((trips2bel.Trfile3_0) wrapper_arg_2), ((trips2bel.Trfile3_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____turn_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____turn_0_0(((trips2bel.Turn_0) wrapper_arg_1), ((trips2bel.Turn_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____turn_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____turn_0_0(((trips2bel.Turn_0) wrapper_arg_2), ((trips2bel.Turn_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____turn2_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____turn2_0_0(((trips2bel.Turn2_0) wrapper_arg_1), ((trips2bel.Turn2_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____turn2_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____turn2_0_0(((trips2bel.Turn2_0) wrapper_arg_2), ((trips2bel.Turn2_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____turn3_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____turn3_0_0(((trips2bel.Turn3_0) wrapper_arg_1), ((trips2bel.Turn3_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____turn3_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____turn3_0_0(((trips2bel.Turn3_0) wrapper_arg_2), ((trips2bel.Turn3_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____turnno_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____turnno_0_0(((java.lang.Integer) wrapper_arg_1).intValue(), ((java.lang.Integer) wrapper_arg_2).intValue());
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____turnno_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____turnno_0_0(((java.lang.Integer) wrapper_arg_2).intValue(), ((java.lang.Integer) wrapper_arg_3).intValue());
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____value_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____value_0_0(((trips2bel.Value_0) wrapper_arg_1), ((trips2bel.Value_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____value_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____value_0_0(((trips2bel.Value_0) wrapper_arg_2), ((trips2bel.Value_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____var_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____var_0_0(((java.lang.Integer) wrapper_arg_1).intValue(), ((java.lang.Integer) wrapper_arg_2).intValue());
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____var_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____var_0_0(((java.lang.Integer) wrapper_arg_2).intValue(), ((java.lang.Integer) wrapper_arg_3).intValue());
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____vardef_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____vardef_0_0(((trips2bel.Vardef_0) wrapper_arg_1), ((trips2bel.Vardef_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____vardef_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____vardef_0_0(((trips2bel.Vardef_0) wrapper_arg_2), ((trips2bel.Vardef_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____vardef2_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____vardef2_0_0(((trips2bel.Vardef2_0) wrapper_arg_1), ((trips2bel.Vardef2_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____vardef2_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____vardef2_0_0(((trips2bel.Vardef2_0) wrapper_arg_2), ((trips2bel.Vardef2_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____varmap_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____varmap_0_0(((tree234.Tree234_2) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____varmap_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____varmap_0_0(((tree234.Tree234_2) wrapper_arg_2), ((tree234.Tree234_2) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____vdmap_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____vdmap_0_0(((tree234.Tree234_2) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____vdmap_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____vdmap_0_0(((tree234.Tree234_2) wrapper_arg_2), ((tree234.Tree234_2) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____vertices_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = trips2bel.__Unify____vertices_0_0(((trips2bel.Vertices_0) wrapper_arg_1), ((trips2bel.Vertices_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____vertices_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = trips2bel.__Compare____vertices_0_0(((trips2bel.Vertices_0) wrapper_arg_2), ((trips2bel.Vertices_0) wrapper_arg_3));
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
              return_value = trips2bel.__Unify____attr2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 1:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____attr2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 2:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____attribute_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 3:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____attribute_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 4:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____class_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 5:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____class_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 6:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____concept2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 7:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____concept2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 8:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____conceptname_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 9:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____conceptname_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 10:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____condval_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 11:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____condval_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 12:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____cvar_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 13:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____cvar_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 14:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____cvarmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 15:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____cvarmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 16:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____cvrmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 17:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____cvrmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 18:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____cxrelval_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 19:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____cxrelval_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 20:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____expr_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 21:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____expr_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 22:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____exptp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 23:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____exptp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 24:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____fargval_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 25:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____fargval_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 26:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____forceval_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 27:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____forceval_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 28:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____negval_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 29:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____negval_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 30:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____opval_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 31:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____opval_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 32:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____orientval_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 33:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____orientval_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 34:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____reftp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 35:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____reftp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 36:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____role_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 37:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____role_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 38:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____sent_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 39:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____sent_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 40:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____sent2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 41:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____sent2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 42:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____sent3_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 43:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____sent3_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 44:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____speaker_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 45:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____speaker_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 46:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____superclass_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 47:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____superclass_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 48:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____symmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 49:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____symmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 50:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____tconst_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 51:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____tconst_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 52:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____text_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 53:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____text_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 54:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____trfile_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 55:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____trfile_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 56:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____trfile2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 57:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____trfile2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 58:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____trfile3_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 59:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____trfile3_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 60:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____turn_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 61:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____turn_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 62:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____turn2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 63:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____turn2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 64:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____turn3_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 65:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____turn3_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 66:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____turnno_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 67:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____turnno_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 68:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____value_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 69:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____value_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 70:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____var_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 71:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____var_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 72:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____vardef_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 73:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____vardef_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 74:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____vardef2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 75:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____vardef2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 76:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____varmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 77:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____varmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 78:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____vdmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 79:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____vdmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 80:
          {
            boolean return_value = false;

            {
              return_value = trips2bel.__Unify____vertices_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 81:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.__Compare____vertices_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 82:
          {
            /* generic_type */ java.lang.Object return_value = null;

            {
              trips2bel.IntroducedFrom__pred__vdm_cs__217__1_4_p_0_3(((java.lang.Object) arg1), ((/* env_ptr */ java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 83:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.create_class_12_p_0_2(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 84:
          {
            /* generic_type */ java.lang.Object return_value = null;

            {
              trips2bel.vdm_cs_10_p_0_2(((trips2bel.Cvar_0) arg1), ((/* env_ptr */ java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 85:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = trips2bel.create_class_12_p_0_3(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2));
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
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.tps_4_p_0_2(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 1:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.create_class_12_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 2:
          {
            /* generic_type */ java.lang.Object return_value = null;

            {
              trips2bel.vdm_cs_10_p_0_3(((/* generic_type */ java.lang.Object) arg1), ((jmercury.runtime.MethodPtr) arg2), ((/* env_ptr */ java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 3:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.vdm_cs_10_p_0_4(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 4:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.conv_attr3_10_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 5:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.conv_sent3_6_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 6:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = trips2bel.conv_turn3_5_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 7:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = trips2bel.conv_turn_6_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 8:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = trips2bel.convert3_5_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 9:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = trips2bel.convert2_5_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 10:
          {
            java.lang.Object return_value = null;

            {
              return_value = trips2bel.tps_4_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
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
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = trips2bel.conv_sent3_6_p_0_2(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4));
            }
            return ((java.lang.Object) (return_value));
          }
        case 1:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = trips2bel.conv_vardef_7_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4));
            }
            return ((java.lang.Object) (return_value));
          }
        case 2:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = trips2bel.conv_sent_6_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4));
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
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = trips2bel.IntroducedFrom__pred__conv_sent3__156__1_8_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4), ((java.lang.Object) arg5));
            }
            return ((java.lang.Object) (return_value));
          }
        case 1:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = trips2bel.turn_cs_8_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4), ((java.lang.Object) arg5));
            }
            return ((java.lang.Object) (return_value));
          }
        case 2:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = trips2bel.corefs_7_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4), ((java.lang.Object) arg5));
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
          return_value = trips2bel.sent_cs_9_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4), ((java.lang.Object) arg5), ((java.lang.Object) arg6));
        }
        return ((java.lang.Object) (return_value));
      }
    }

  }

  private static final class AddrOf7_0
    implements jmercury.runtime.MethodPtr7
  {
    public /* generic_type */ java.lang.Object call___0_0(
      /* generic_type */ java.lang.Object arg1,
      /* generic_type */ java.lang.Object arg2,
      /* generic_type */ java.lang.Object arg3,
      /* generic_type */ java.lang.Object arg4,
      /* generic_type */ java.lang.Object arg5,
      /* generic_type */ java.lang.Object arg6,
      /* generic_type */ java.lang.Object arg7)
    {
      {
        /* generic_type */ java.lang.Object[] return_value = null;

        {
          return_value = trips2bel.corefs_7_p_0_2(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4), ((java.lang.Object) arg5), ((java.lang.Object) arg6), ((java.lang.Object) arg7));
        }
        return ((java.lang.Object) (return_value));
      }
    }

  }

//  trips2bel.m:36
  public static class Attr2_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Name_modifiers_2
      extends trips2bel.Attr2_0
    {
      public int F1;
      public int F2;

      public Name_modifiers_2()
      {
        {
        }
      }
      public Name_modifiers_2(
        int F1,
        int F2)
      {
        {
          (this).data_tag = 12;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Context_rel_1
      extends trips2bel.Attr2_0
    {
      public trips2bel.Cxrelval_0 F1;

      public Context_rel_1()
      {
        {
        }
      }
      public Context_rel_1(
        trips2bel.Cxrelval_0 F1)
      {
        {
          (this).data_tag = 11;
          this.F1 = F1;
        }
      }
    }

    public static class Functn_arg_1
      extends trips2bel.Attr2_0
    {
      public trips2bel.Fargval_0 F1;

      public Functn_arg_1()
      {
        {
        }
      }
      public Functn_arg_1(
        trips2bel.Fargval_0 F1)
      {
        {
          (this).data_tag = 10;
          this.F1 = F1;
        }
      }
    }

    public static class Negation_1
      extends trips2bel.Attr2_0
    {
      public trips2bel.Negval_0 F1;

      public Negation_1()
      {
        {
        }
      }
      public Negation_1(
        trips2bel.Negval_0 F1)
      {
        {
          (this).data_tag = 9;
          this.F1 = F1;
        }
      }
    }

    public static class Acts_2
      extends trips2bel.Attr2_0
    {
      public int F1;
      public int F2;

      public Acts_2()
      {
        {
        }
      }
      public Acts_2(
        int F1,
        int F2)
      {
        {
          (this).data_tag = 8;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Condition_2
      extends trips2bel.Attr2_0
    {
      public trips2bel.Condval_0 F1;
      public int F2;

      public Condition_2()
      {
        {
        }
      }
      public Condition_2(
        trips2bel.Condval_0 F1,
        int F2)
      {
        {
          (this).data_tag = 7;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Proform_1
      extends trips2bel.Attr2_0
    {
      public java.lang.String F1;

      public Proform_1()
      {
        {
        }
      }
      public Proform_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 6;
          this.F1 = F1;
        }
      }
    }

    public static class Orientation_1
      extends trips2bel.Attr2_0
    {
      public trips2bel.Orientval_0 F1;

      public Orientation_1()
      {
        {
        }
      }
      public Orientation_1(
        trips2bel.Orientval_0 F1)
      {
        {
          (this).data_tag = 5;
          this.F1 = F1;
        }
      }
    }

    public static class Operator_1
      extends trips2bel.Attr2_0
    {
      public trips2bel.Opval_0 F1;

      public Operator_1()
      {
        {
        }
      }
      public Operator_1(
        trips2bel.Opval_0 F1)
      {
        {
          (this).data_tag = 4;
          this.F1 = F1;
        }
      }
    }

    public static class Force_1
      extends trips2bel.Attr2_0
    {
      public trips2bel.Forceval_0 F1;

      public Force_1()
      {
        {
        }
      }
      public Force_1(
        trips2bel.Forceval_0 F1)
      {
        {
          (this).data_tag = 3;
          this.F1 = F1;
        }
      }
    }

    public static class Mods_1
      extends trips2bel.Attr2_0
    {
      public list.List_1<java.lang.Integer> F1;

      public Mods_1()
      {
        {
        }
      }
      public Mods_1(
        list.List_1<java.lang.Integer> F1)
      {
        {
          (this).data_tag = 2;
          this.F1 = F1;
        }
      }
    }

    public static class Coref_1
      extends trips2bel.Attr2_0
    {
      public int F1;

      public Coref_1()
      {
        {
        }
      }
      public Coref_1(
        int F1)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
        }
      }
    }

    public static class Ref_2
      extends trips2bel.Attr2_0
    {
      public trips2bel.Reftp_0 F1;
      public int F2;

      public Ref_2()
      {
        {
        }
      }
      public Ref_2(
        trips2bel.Reftp_0 F1,
        int F2)
      {
        {
          (this).data_tag = 0;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }


  }

//  trips2bel.m:34
  public static class Concept2_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Unrecognised_1
      extends trips2bel.Concept2_0
    {
      public java.lang.String F1;

      public Unrecognised_1()
      {
        {
        }
      }
      public Unrecognised_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 5;
          this.F1 = F1;
        }
      }
    }

    public static class Closedclass_1
      extends trips2bel.Concept2_0
    {
      public java.lang.String F1;

      public Closedclass_1()
      {
        {
        }
      }
      public Closedclass_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 4;
          this.F1 = F1;
        }
      }
    }

    public static class Abstract_0
      extends trips2bel.Concept2_0
    {

      public Abstract_0()
      {
        {
          (this).data_tag = 1;
        }
      }
    }

    public static class Wordnet_1
      extends trips2bel.Concept2_0
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
          (this).data_tag = 3;
          this.F1 = F1;
        }
      }
    }

    public static class Super_1
      extends trips2bel.Concept2_0
    {
      public java.lang.String F1;

      public Super_1()
      {
        {
        }
      }
      public Super_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 2;
          this.F1 = F1;
        }
      }
    }

    public static class Empty_0
      extends trips2bel.Concept2_0
    {

      public Empty_0()
      {
        {
          (this).data_tag = 0;
        }
      }
    }


  }

//  trips2bel.m:44
  public static class Condval_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Condval_0 K0 = new Condval_0(0);  /* iff */
      public static final Condval_0 K1 = new Condval_0(1);  /* unless */

      private Condval_0(int val) {
        super(val);
      }

  }

//  trips2bel.m:63
  public static class Cvar_0
    implements jmercury.runtime.MercuryType
  {
    public java.lang.String F1;
    public int F2;
    public int F3;

    public Cvar_0()
    {
      {
      }
    }
    public Cvar_0(
      java.lang.String F1,
      int F2,
      int F3)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
      }
    }
  }

//  trips2bel.m:47
  public static class Cxrelval_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Cxrelval_0 K0 = new Cxrelval_0(0);  /* utt_frag */
      public static final Cxrelval_0 K1 = new Cxrelval_0(1);  /* dobj */
      public static final Cxrelval_0 K2 = new Cxrelval_0(2);  /* lsubj */

      private Cxrelval_0(int val) {
        super(val);
      }

  }

//  trips2bel.m:60
  public static class Expr_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Objprop_3
      extends trips2bel.Expr_0
    {
      public java.lang.String F1;
      public trips2bel.Cvar_0 F2;
      public trips2bel.Cvar_0 F3;

      public Objprop_3()
      {
        {
        }
      }
      public Objprop_3(
        java.lang.String F1,
        trips2bel.Cvar_0 F2,
        trips2bel.Cvar_0 F3)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
          this.F2 = F2;
          this.F3 = F3;
        }
      }
    }

    public static class Class_3
      extends trips2bel.Expr_0
    {
      public bool.Bool_0 F1;
      public trips2bel.Concept2_0 F2;
      public trips2bel.Cvar_0 F3;

      public Class_3()
      {
        {
        }
      }
      public Class_3(
        bool.Bool_0 F1,
        trips2bel.Concept2_0 F2,
        trips2bel.Cvar_0 F3)
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

//  trips2bel.m:13
  public static class Exptp_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Exptp_0 K0 = new Exptp_0(0);  /* f_79_78_84_58_58_77_65_78_65_71_69_45_67_79_78_86_69_82_83_65_84_73_79_78 */
      public static final Exptp_0 K1 = new Exptp_0(1);  /* f_79_78_84_58_58_82_69_81_85_69_83_84 */
      public static final Exptp_0 K2 = new Exptp_0(2);  /* f_79_78_84_58_58_70_82_65_71_77_69_78_84 */
      public static final Exptp_0 K3 = new Exptp_0(3);  /* f_79_78_84_58_58_65_83_75_45_87_72_65_84_45_73_83 */
      public static final Exptp_0 K4 = new Exptp_0(4);  /* f_79_78_84_58_58_65_83_75_45_73_70 */
      public static final Exptp_0 K5 = new Exptp_0(5);  /* f_79_78_84_58_58_65_78_83_87_69_82 */
      public static final Exptp_0 K6 = new Exptp_0(6);  /* f_79_78_84_58_58_73_68_69_78_84_73_70_89 */
      public static final Exptp_0 K7 = new Exptp_0(7);  /* f_79_78_84_58_58_69_86_65_76_85_65_84_69 */
      public static final Exptp_0 K8 = new Exptp_0(8);  /* f_79_78_84_58_58_82_69_74_69_67_84 */
      public static final Exptp_0 K9 = new Exptp_0(9);  /* f_79_78_84_58_58_80_82_79_80_79_83_69 */
      public static final Exptp_0 K10 = new Exptp_0(10);  /* f_79_78_84_58_58_69_76_76_73_80_83_73_83 */
      public static final Exptp_0 K11 = new Exptp_0(11);  /* f_79_78_84_58_58_84_69_76_76 */

      private Exptp_0(int val) {
        super(val);
      }

  }

//  trips2bel.m:46
  public static class Fargval_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Fargval_0 K0 = new Fargval_0(0);  /* of */

      private Fargval_0(int val) {
        super(val);
      }

  }

//  trips2bel.m:40
  public static class Forceval_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Forceval_0 K0 = new Forceval_0(0);  /* mr_true */
      public static final Forceval_0 K1 = new Forceval_0(1);  /* mr_false */
      public static final Forceval_0 K2 = new Forceval_0(2);  /* possible */
      public static final Forceval_0 K3 = new Forceval_0(3);  /* impossible */
      public static final Forceval_0 K4 = new Forceval_0(4);  /* future */
      public static final Forceval_0 K5 = new Forceval_0(5);  /* futurenot */
      public static final Forceval_0 K6 = new Forceval_0(6);  /* required */
      public static final Forceval_0 K7 = new Forceval_0(7);  /* prohibited */

      private Forceval_0(int val) {
        super(val);
      }

  }

//  trips2bel.m:45
  public static class Negval_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Negval_0 K0 = new Negval_0(0);  /* plus */

      private Negval_0(int val) {
        super(val);
      }

  }

//  trips2bel.m:42
  public static class Opval_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Opval_0 K0 = new Opval_0(0);  /* aand */
      public static final Opval_0 K1 = new Opval_0(1);  /* but */
      public static final Opval_0 K2 = new Opval_0(2);  /* oor */
      public static final Opval_0 K3 = new Opval_0(3);  /* one_of */
      public static final Opval_0 K4 = new Opval_0(4);  /* members */
      public static final Opval_0 K5 = new Opval_0(5);  /* either */
      public static final Opval_0 K6 = new Opval_0(6);  /* both */
      public static final Opval_0 K7 = new Opval_0(7);  /* plus */

      private Opval_0(int val) {
        super(val);
      }

  }

//  trips2bel.m:43
  public static class Orientval_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Orientval_0 K0 = new Orientval_0(0);  /* pos */
      public static final Orientval_0 K1 = new Orientval_0(1);  /* neg */
      public static final Orientval_0 K2 = new Orientval_0(2);  /* more */
      public static final Orientval_0 K3 = new Orientval_0(3);  /* less */
      public static final Orientval_0 K4 = new Orientval_0(4);  /* neutral */

      private Orientval_0(int val) {
        super(val);
      }

  }

//  trips2bel.m:48
  public static class Reftp_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Reftp_0 K0 = new Reftp_0(0);  /* addressee */
      public static final Reftp_0 K1 = new Reftp_0(1);  /* affected */
      public static final Reftp_0 K2 = new Reftp_0(2);  /* agent */
      public static final Reftp_0 K3 = new Reftp_0(3);  /* assoc_poss */
      public static final Reftp_0 K4 = new Reftp_0(4);  /* assoc_with */
      public static final Reftp_0 K5 = new Reftp_0(5);  /* cause */
      public static final Reftp_0 K6 = new Reftp_0(6);  /* cognizer */
      public static final Reftp_0 K7 = new Reftp_0(7);  /* content */
      public static final Reftp_0 K8 = new Reftp_0(8);  /* co_theme */
      public static final Reftp_0 K9 = new Reftp_0(9);  /* dobj */
      public static final Reftp_0 K10 = new Reftp_0(10);  /* effect */
      public static final Reftp_0 K11 = new Reftp_0(11);  /* experiencer */
      public static final Reftp_0 K12 = new Reftp_0(12);  /* val */
      public static final Reftp_0 K13 = new Reftp_0(13);  /* figure */
      public static final Reftp_0 K14 = new Reftp_0(14);  /* focus */
      public static final Reftp_0 K15 = new Reftp_0(15);  /* ground */
      public static final Reftp_0 K16 = new Reftp_0(16);  /* instrument */
      public static final Reftp_0 K17 = new Reftp_0(17);  /* like */
      public static final Reftp_0 K18 = new Reftp_0(18);  /* lobj */
      public static final Reftp_0 K19 = new Reftp_0(19);  /* lsubj */
      public static final Reftp_0 K20 = new Reftp_0(20);  /* of */
      public static final Reftp_0 K21 = new Reftp_0(21);  /* predicate */
      public static final Reftp_0 K22 = new Reftp_0(22);  /* property */
      public static final Reftp_0 K23 = new Reftp_0(23);  /* refobject */
      public static final Reftp_0 K24 = new Reftp_0(24);  /* refset */
      public static final Reftp_0 K25 = new Reftp_0(25);  /* related_to */
      public static final Reftp_0 K26 = new Reftp_0(26);  /* result */
      public static final Reftp_0 K27 = new Reftp_0(27);  /* suchthat */
      public static final Reftp_0 K28 = new Reftp_0(28);  /* theme */
      public static final Reftp_0 K29 = new Reftp_0(29);  /* to */
      public static final Reftp_0 K30 = new Reftp_0(30);  /* action */
      public static final Reftp_0 K31 = new Reftp_0(31);  /* recipient */
      public static final Reftp_0 K32 = new Reftp_0(32);  /* obj_val */
      public static final Reftp_0 K33 = new Reftp_0(33);  /* purpose */
      public static final Reftp_0 K34 = new Reftp_0(34);  /* via */
      public static final Reftp_0 K35 = new Reftp_0(35);  /* arg0 */
      public static final Reftp_0 K36 = new Reftp_0(36);  /* attribute */
      public static final Reftp_0 K37 = new Reftp_0(37);  /* arg1 */
      public static final Reftp_0 K38 = new Reftp_0(38);  /* eq */
      public static final Reftp_0 K39 = new Reftp_0(39);  /* source */
      public static final Reftp_0 K40 = new Reftp_0(40);  /* goal */
      public static final Reftp_0 K41 = new Reftp_0(41);  /* path */
      public static final Reftp_0 K42 = new Reftp_0(42);  /* along */
      public static final Reftp_0 K43 = new Reftp_0(43);  /* to_loc */
      public static final Reftp_0 K44 = new Reftp_0(44);  /* purpose_implicit */
      public static final Reftp_0 K45 = new Reftp_0(45);  /* subcat */
      public static final Reftp_0 K46 = new Reftp_0(46);  /* location */
      public static final Reftp_0 K47 = new Reftp_0(47);  /* co_agent */
      public static final Reftp_0 K48 = new Reftp_0(48);  /* associated_information */
      public static final Reftp_0 K49 = new Reftp_0(49);  /* displacement */
      public static final Reftp_0 K50 = new Reftp_0(50);  /* from */
      public static final Reftp_0 K51 = new Reftp_0(51);  /* comp3 */
      public static final Reftp_0 K52 = new Reftp_0(52);  /* parenthetical */
      public static final Reftp_0 K53 = new Reftp_0(53);  /* part */
      public static final Reftp_0 K54 = new Reftp_0(54);  /* stimulus */
      public static final Reftp_0 K55 = new Reftp_0(55);  /* iss */
      public static final Reftp_0 K56 = new Reftp_0(56);  /* contents */
      public static final Reftp_0 K57 = new Reftp_0(57);  /* of_state */
      public static final Reftp_0 K58 = new Reftp_0(58);  /* result_val */

      private Reftp_0(int val) {
        super(val);
      }

  }

//  trips2bel.m:11
  public static class Sent_0
    implements jmercury.runtime.MercuryType
  {
    public list.List_1<java.lang.String> F1;
    public trips2bel.Exptp_0 F2;
    public list.List_1<trips2bel.Vardef_0> F3;

    public Sent_0()
    {
      {
      }
    }
    public Sent_0(
      list.List_1<java.lang.String> F1,
      trips2bel.Exptp_0 F2,
      list.List_1<trips2bel.Vardef_0> F3)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
      }
    }
  }

//  trips2bel.m:31
  public static class Sent2_0
    implements jmercury.runtime.MercuryType
  {
    public list.List_1<java.lang.String> F1;
    public trips2bel.Exptp_0 F2;
    public tree234.Tree234_2<java.lang.Integer, trips2bel.Vardef2_0> F3;

    public Sent2_0()
    {
      {
      }
    }
    public Sent2_0(
      list.List_1<java.lang.String> F1,
      trips2bel.Exptp_0 F2,
      tree234.Tree234_2<java.lang.Integer, trips2bel.Vardef2_0> F3)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
      }
    }
  }

//  trips2bel.m:59
  public static class Sent3_0
    implements jmercury.runtime.MercuryType
  {
    public list.List_1<java.lang.String> F1;
    public trips2bel.Exptp_0 F2;
    public list.List_1<trips2bel.Expr_0> F3;

    public Sent3_0()
    {
      {
      }
    }
    public Sent3_0(
      list.List_1<java.lang.String> F1,
      trips2bel.Exptp_0 F2,
      list.List_1<trips2bel.Expr_0> F3)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
      }
    }
  }

//  trips2bel.m:18
  public static class Tconst_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Tconst_0 K0 = new Tconst_0(0);  /* f_79_78_84_58_58_80_82_79 */
      public static final Tconst_0 K1 = new Tconst_0(1);  /* f_79_78_84_58_58_66_65_82_69 */
      public static final Tconst_0 K2 = new Tconst_0(2);  /* f_79_78_84_58_58_87_72_45_84_69_82_77 */
      public static final Tconst_0 K3 = new Tconst_0(3);  /* f_79_78_84_58_58_84_72_69 */
      public static final Tconst_0 K4 = new Tconst_0(4);  /* f_79_78_84_58_58_83_65_45_83_69_81 */
      public static final Tconst_0 K5 = new Tconst_0(5);  /* f_79_78_84_58_58_73_78_68_69_70_45_83_69_84 */
      public static final Tconst_0 K6 = new Tconst_0(6);  /* f_79_78_84_58_58_86_65_76_85_69 */
      public static final Tconst_0 K7 = new Tconst_0(7);  /* f_79_78_84_58_58_73_77_80_82_79 */
      public static final Tconst_0 K8 = new Tconst_0(8);  /* f_79_78_84_58_58_83_80_69_69_67_72_65_67_84 */
      public static final Tconst_0 K9 = new Tconst_0(9);  /* f_79_78_84_58_58_70 */
      public static final Tconst_0 K10 = new Tconst_0(10);  /* f_79_78_84_58_58_80_82_79_45_83_69_84 */
      public static final Tconst_0 K11 = new Tconst_0(11);  /* f_79_78_84_58_58_87_72_45_81_85_65_78_84_73_84_89 */
      public static final Tconst_0 K12 = new Tconst_0(12);  /* f_79_78_84_58_58_81_85_65_78_84_73_70_73_69_82 */
      public static final Tconst_0 K13 = new Tconst_0(13);  /* f_79_78_84_58_58_65 */
      public static final Tconst_0 K14 = new Tconst_0(14);  /* f_79_78_84_58_58_75_73_78_68 */
      public static final Tconst_0 K15 = new Tconst_0(15);  /* f_79_78_84_58_58_84_72_69_45_83_69_84 */
      public static final Tconst_0 K16 = new Tconst_0(16);  /* f_79_78_84_58_58_83_77 */

      private Tconst_0(int val) {
        super(val);
      }

  }

//  trips2bel.m:6
  public static class Trfile_0
    implements jmercury.runtime.MercuryType
  {
    public java.lang.String F1;
    public list.List_1<trips2bel.Turn_0> F2;

    public Trfile_0()
    {
      {
      }
    }
    public Trfile_0(
      java.lang.String F1,
      list.List_1<trips2bel.Turn_0> F2)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
      }
    }
  }

//  trips2bel.m:29
  public static class Trfile2_0
    implements jmercury.runtime.MercuryType
  {
    public java.lang.String F1;
    public list.List_1<trips2bel.Turn2_0> F2;

    public Trfile2_0()
    {
      {
      }
    }
    public Trfile2_0(
      java.lang.String F1,
      list.List_1<trips2bel.Turn2_0> F2)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
      }
    }
  }

//  trips2bel.m:57
  public static class Trfile3_0
    implements jmercury.runtime.MercuryType
  {
    public java.lang.String F1;
    public list.List_1<trips2bel.Turn3_0> F2;
    public tree234.Tree234_2<trips2bel.Cvar_0, java.lang.String> F3;

    public Trfile3_0()
    {
      {
      }
    }
    public Trfile3_0(
      java.lang.String F1,
      list.List_1<trips2bel.Turn3_0> F2,
      tree234.Tree234_2<trips2bel.Cvar_0, java.lang.String> F3)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
      }
    }
  }

//  trips2bel.m:8
  public static class Turn_0
    implements jmercury.runtime.MercuryType
  {
    public int F1;
    public java.lang.String F2;
    public list.List_1<trips2bel.Sent_0> F3;

    public Turn_0()
    {
      {
      }
    }
    public Turn_0(
      int F1,
      java.lang.String F2,
      list.List_1<trips2bel.Sent_0> F3)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
      }
    }
  }

//  trips2bel.m:30
  public static class Turn2_0
    implements jmercury.runtime.MercuryType
  {
    public int F1;
    public java.lang.String F2;
    public list.List_1<trips2bel.Sent2_0> F3;

    public Turn2_0()
    {
      {
      }
    }
    public Turn2_0(
      int F1,
      java.lang.String F2,
      list.List_1<trips2bel.Sent2_0> F3)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
      }
    }
  }

//  trips2bel.m:58
  public static class Turn3_0
    implements jmercury.runtime.MercuryType
  {
    public int F1;
    public java.lang.String F2;
    public list.List_1<trips2bel.Sent3_0> F3;

    public Turn3_0()
    {
      {
      }
    }
    public Turn3_0(
      int F1,
      java.lang.String F2,
      list.List_1<trips2bel.Sent3_0> F3)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
      }
    }
  }

//  trips2bel.m:27
  public static class Value_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Float_1
      extends trips2bel.Value_0
    {
      public double F1;

      public Float_1()
      {
        {
        }
      }
      public Float_1(
        double F1)
      {
        {
          (this).data_tag = 3;
          this.F1 = F1;
        }
      }
    }

    public static class Int_1
      extends trips2bel.Value_0
    {
      public int F1;

      public Int_1()
      {
        {
        }
      }
      public Int_1(
        int F1)
      {
        {
          (this).data_tag = 2;
          this.F1 = F1;
        }
      }
    }

    public static class Con_1
      extends trips2bel.Value_0
    {
      public java.lang.String F1;

      public Con_1()
      {
        {
        }
      }
      public Con_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
        }
      }
    }

    public static class Var_1
      extends trips2bel.Value_0
    {
      public int F1;

      public Var_1()
      {
        {
        }
      }
      public Var_1(
        int F1)
      {
        {
          (this).data_tag = 0;
          this.F1 = F1;
        }
      }
    }


  }

//  trips2bel.m:17
  public static class Vardef_0
    implements jmercury.runtime.MercuryType
  {
    public trips2bel.Tconst_0 F1;
    public int F2;
    public java.lang.String F3;
    public list.List_1<pair.Pair_2<java.lang.String, list.List_1<trips2bel.Value_0>>> F4;

    public Vardef_0()
    {
      {
      }
    }
    public Vardef_0(
      trips2bel.Tconst_0 F1,
      int F2,
      java.lang.String F3,
      list.List_1<pair.Pair_2<java.lang.String, list.List_1<trips2bel.Value_0>>> F4)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
        this.F4 = F4;
      }
    }
  }

//  trips2bel.m:33
  public static class Vardef2_0
    implements jmercury.runtime.MercuryType
  {
    public trips2bel.Tconst_0 F1;
    public trips2bel.Concept2_0 F2;
    public list.List_1<trips2bel.Attr2_0> F3;

    public Vardef2_0()
    {
      {
      }
    }
    public Vardef2_0(
      trips2bel.Tconst_0 F1,
      trips2bel.Concept2_0 F2,
      list.List_1<trips2bel.Attr2_0> F3)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
      }
    }
  }

//  trips2bel.m:84
  public static class Vertices_0
    implements jmercury.runtime.MercuryType
  {
    public set_ordlist.Set_ordlist_1<java.lang.Integer> F1;
    public set_ordlist.Set_ordlist_1<java.lang.Integer> F2;
    public list.List_1<java.lang.Integer> F3;
    public list.List_1<list.List_1<java.lang.Integer>> F4;

    public Vertices_0()
    {
      {
      }
    }
    public Vertices_0(
      set_ordlist.Set_ordlist_1<java.lang.Integer> F1,
      set_ordlist.Set_ordlist_1<java.lang.Integer> F2,
      list.List_1<java.lang.Integer> F3,
      list.List_1<list.List_1<java.lang.Integer>> F4)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
        this.F4 = F4;
      }
    }
  }

//  trips2bel.m:491
  private static set_ordlist.Set_ordlist_1 IntroducedFrom__pred__child_vars__491__1_3_p_0(
    trips2bel.Attr2_0 HeadVar__1_29,
    set_ordlist.Set_ordlist_1 HeadVar__2_30)
  {
    {
      boolean succeeded = false;
      set_ordlist.Set_ordlist_1 HeadVar__3_31 = null;

      switch (HeadVar__1_29.data_tag) {
        case 0:
//  trips2bel.m:490
          {
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_47_47 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
            int X_14 = ((trips2bel.Attr2_0.Ref_2) HeadVar__1_29).F2;
            trips2bel.Reftp_0 V_13_13 = ((trips2bel.Attr2_0.Ref_2) HeadVar__1_29).F1;

            {
              HeadVar__3_31 = set.insert_3_p_0(TypeCtorInfo_47_47, java.lang.Integer.valueOf(X_14), HeadVar__2_30);
            }
          }
//  trips2bel.m:491
          break;
        case 1:
          {
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_48_48 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
            int X_38 = ((trips2bel.Attr2_0.Coref_1) HeadVar__1_29).F1;

            {
              HeadVar__3_31 = set.insert_3_p_0(TypeCtorInfo_48_48, java.lang.Integer.valueOf(X_38), HeadVar__2_30);
            }
          }
          break;
        case 2:
//  trips2bel.m:494
          {
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_51_51 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
            list.List_1 Xs_18 = ((trips2bel.Attr2_0.Mods_1) HeadVar__1_29).F1;

            {
              HeadVar__3_31 = set.insert_list_3_p_0(TypeCtorInfo_51_51, Xs_18, HeadVar__2_30);
            }
          }
//  trips2bel.m:491
          break;
        case 3:
//  trips2bel.m:496
          HeadVar__3_31 = HeadVar__2_30;
//  trips2bel.m:491
          break;
        case 4:
//  trips2bel.m:498
          HeadVar__3_31 = HeadVar__2_30;
//  trips2bel.m:491
          break;
        case 5:
//  trips2bel.m:501
          HeadVar__3_31 = HeadVar__2_30;
//  trips2bel.m:491
          break;
        case 6:
//  trips2bel.m:497
          HeadVar__3_31 = HeadVar__2_30;
//  trips2bel.m:491
          break;
        case 7:
//  trips2bel.m:492
          {
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_49_49 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
            int X_39 = ((trips2bel.Attr2_0.Condition_2) HeadVar__1_29).F2;
            trips2bel.Condval_0 V_15_15 = ((trips2bel.Attr2_0.Condition_2) HeadVar__1_29).F1;

            {
              HeadVar__3_31 = set.insert_3_p_0(TypeCtorInfo_49_49, java.lang.Integer.valueOf(X_39), HeadVar__2_30);
            }
          }
//  trips2bel.m:491
          break;
        case 8:
//  trips2bel.m:493
          {
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_50_50 = null;
            int X1_16 = ((trips2bel.Attr2_0.Acts_2) HeadVar__1_29).F1;
            int X2_17 = ((trips2bel.Attr2_0.Acts_2) HeadVar__1_29).F2;
            list.List_1 V_35_35 = null;
            list.List_1 V_36_36 = null;
            list.List_1 V_37_37 = (list.List_1) trips2bel.MR_scalar_common_3[0];

            {
              V_36_36 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(X2_17), V_37_37);
            }
            {
              V_35_35 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(X1_16), V_36_36);
            }
            TypeCtorInfo_50_50 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
            {
              HeadVar__3_31 = set.insert_list_3_p_0(TypeCtorInfo_50_50, V_35_35, HeadVar__2_30);
            }
          }
//  trips2bel.m:491
          break;
        case 9:
//  trips2bel.m:499
          HeadVar__3_31 = HeadVar__2_30;
//  trips2bel.m:491
          break;
        case 10:
//  trips2bel.m:500
          HeadVar__3_31 = HeadVar__2_30;
//  trips2bel.m:491
          break;
        case 11:
//  trips2bel.m:502
          HeadVar__3_31 = HeadVar__2_30;
//  trips2bel.m:491
          break;
        case 12:
//  trips2bel.m:495
          {
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_52_52 = null;
            list.List_1 V_32_32 = null;
            list.List_1 V_33_33 = null;
            list.List_1 V_34_34 = (list.List_1) trips2bel.MR_scalar_common_3[0];
            int X1_40 = ((trips2bel.Attr2_0.Name_modifiers_2) HeadVar__1_29).F1;
            int X2_41 = ((trips2bel.Attr2_0.Name_modifiers_2) HeadVar__1_29).F2;

            {
              V_33_33 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(X2_41), V_34_34);
            }
            {
              V_32_32 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(X1_40), V_33_33);
            }
            TypeCtorInfo_52_52 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
            {
              HeadVar__3_31 = set.insert_list_3_p_0(TypeCtorInfo_52_52, V_32_32, HeadVar__2_30);
            }
          }
//  trips2bel.m:491
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
      return HeadVar__3_31;
    }
  }
//  trips2bel.m:261
  private static java.lang.Object [] IntroducedFrom__pred__create_class__261__1_2_p_0(
    trips2bel.Concept2_0 HeadVar__1_52)
  {
    {
      boolean succeeded = false;
      java.lang.String HeadVar__2_53 = null;

      switch (/* tag */  0) {
        case 0:
          switch (HeadVar__1_52.data_tag) {
            case 2:
              {
                HeadVar__2_53 = ((trips2bel.Concept2_0.Super_1) HeadVar__1_52).F1;
                succeeded = true;
              }
              break;
            case 3:
//  trips2bel.m:260
              {
                HeadVar__2_53 = ((trips2bel.Concept2_0.Wordnet_1) HeadVar__1_52).F1;
                succeeded = true;
              }
//  trips2bel.m:261
              break;
            case 5:
//  trips2bel.m:262
              {
                HeadVar__2_53 = ((trips2bel.Concept2_0.Unrecognised_1) HeadVar__1_52).F1;
                succeeded = true;
              }
//  trips2bel.m:261
              break;
            default:
              succeeded = false;
          }
          break;
        default:
          succeeded = false;
      }
return new java.lang.Object[] {
        java.lang.Boolean.valueOf(succeeded),
        ((java.lang.Object) (HeadVar__2_53))
      };
    }
  }
//  trips2bel.m:257
  private static trips2bel.Concept2_0 IntroducedFrom__pred__create_class__257__1_3_p_0(
    tree234.Tree234_2 Map_13,
    trips2bel.Cvar_0 HeadVar__2_48)
  {
    {
      boolean succeeded = false;
      trips2bel.Concept2_0 HeadVar__3_49 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_69_69 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_cvar_0);
      jmercury.runtime.TypeInfo_Struct TypeInfo_70_70 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[2]);
      pair.Pair_2 V_50_50 = null;
//  trips2bel.m:258
      java.lang.Object conv0_V_50_50 = null;
      list.List_1 V_25_25 = null;

      {
        conv0_V_50_50 = map.lookup_3_p_0(TypeCtorInfo_69_69, TypeInfo_70_70, Map_13, ((java.lang.Object) (HeadVar__2_48)));
      }
      V_50_50 = ((pair.Pair_2) conv0_V_50_50);
      HeadVar__3_49 = ((trips2bel.Concept2_0) ((pair.Pair_2) V_50_50).F1);
      V_25_25 = ((list.List_1) ((pair.Pair_2) V_50_50).F2);
//  trips2bel.m:257
      return HeadVar__3_49;
    }
  }
//  trips2bel.m:253
  private static tree234.Tree234_2 IntroducedFrom__pred__create_class__253__1_4_p_0(
    int STATE_VARIABLE_I_0_29,
    trips2bel.Cvar_0 HeadVar__2_42,
    tree234.Tree234_2 HeadVar__3_43)
  {
    {
      boolean succeeded = false;
      tree234.Tree234_2 HeadVar__4_44 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_65_65 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_cvar_0);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_66_66 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);

//  trips2bel.m:254
      {
        HeadVar__4_44 = map.det_insert_4_p_0(TypeCtorInfo_65_65, TypeCtorInfo_66_66, ((java.lang.Object) (HeadVar__2_42)), java.lang.Integer.valueOf(STATE_VARIABLE_I_0_29), HeadVar__3_43);
      }
//  trips2bel.m:253
      return HeadVar__4_44;
    }
  }
//  trips2bel.m:222
  private static tree234.Tree234_2 IntroducedFrom__pred__vdm_cs__222__1_6_p_0(
    java.lang.String File_11,
    int N_12,
    int V_13,
    trips2bel.Cvar_0 HeadVar__4_44,
    tree234.Tree234_2 HeadVar__5_45)
  {
    {
      boolean succeeded = false;
      tree234.Tree234_2 HeadVar__6_46 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_57_57 = null;
      trips2bel.Cvar_0 V_47_47 = null;

//  trips2bel.m:223
      {
        V_47_47 = new trips2bel.Cvar_0(File_11, N_12, V_13);
      }
      TypeCtorInfo_57_57 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_cvar_0);
      {
        HeadVar__6_46 = multi_map.set_4_p_0(TypeCtorInfo_57_57, TypeCtorInfo_57_57, ((java.lang.Object) (HeadVar__4_44)), ((java.lang.Object) (V_47_47)), HeadVar__5_45);
      }
//  trips2bel.m:222
      return HeadVar__6_46;
    }
  }
//  trips2bel.m:217
  private static class introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0
    extends /* env_ptr */ java.lang.Object
  {
    public java.lang.String File_11;
    public int N_12;
    public jmercury.runtime.MethodPtr cont;
    public /* env_ptr */ java.lang.Object cont_env_ptr;
    public boolean succeeded;
    public trips2bel.Cvar_0 HeadVar__4_33;
    public int Z_21;
    public trips2bel.Attr2_0 V_34_34;
//  trips2bel.m:218
    public java.lang.Object conv0_V_34_34;

  }

  private static void IntroducedFrom__pred__vdm_cs__217__1_4_p_0_3(
    java.lang.Object arg1,
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0 env_ptr = (trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0) env_ptr_arg;

      ((trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0) env_ptr).conv0_V_34_34 = arg1;
      {
        trips2bel.IntroducedFrom__pred__vdm_cs__217__1_4_p_0_2(env_ptr);
      }
    }
  }
  private static void IntroducedFrom__pred__vdm_cs__217__1_4_p_0_2(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0 env_ptr = (trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0) env_ptr_arg;

      ((trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0) env_ptr).V_34_34 = ((trips2bel.Attr2_0) ((trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0) env_ptr).conv0_V_34_34);
      {
        trips2bel.IntroducedFrom__pred__vdm_cs__217__1_4_p_0_1(env_ptr);
      }
    }
  }
//  trips2bel.m:217
  private static void IntroducedFrom__pred__vdm_cs__217__1_4_p_0_1(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0 env_ptr = (trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0) env_ptr_arg;

//  trips2bel.m:218
      ((trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0) env_ptr).succeeded = ((((trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0) env_ptr).V_34_34).data_tag == 1);
      if (((trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0) env_ptr).succeeded)
        {
          ((trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0) env_ptr).Z_21 = ((trips2bel.Attr2_0.Coref_1) (((trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0) env_ptr).V_34_34)).F1;
//  trips2bel.m:217
          {
//  trips2bel.m:218
            {
              ((trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0) env_ptr).HeadVar__4_33 = new trips2bel.Cvar_0(((trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0) env_ptr).File_11, ((trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0) env_ptr).N_12, ((trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0) env_ptr).Z_21);
            }
            {
              ((jmercury.runtime.MethodPtr2) (((trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0) env_ptr).cont)).call___0_0(((java.lang.Object) (((trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0) env_ptr).HeadVar__4_33)), ((java.lang.Object) (((trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0) env_ptr).cont_env_ptr)));
            }
//  trips2bel.m:217
          }
//  trips2bel.m:218
        }
//  trips2bel.m:217
    }
  }
  private static void IntroducedFrom__pred__vdm_cs__217__1_4_p_0(
    java.lang.String File_11,
    int N_12,
    list.List_1 As_16,
    jmercury.runtime.MethodPtr cont,
    /* env_ptr */ java.lang.Object cont_env_ptr)
  {
    {
      trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0 env = null;
      trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0 env_ptr = null;

      {
        env = new trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0();
      }
      env_ptr = env;
      ((trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0) env_ptr).File_11 = File_11;
      ((trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0) env_ptr).N_12 = N_12;
      ((trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0) env_ptr).cont = cont;
      ((trips2bel.introducedFrom__pred__vdm_cs__217__1_4_p_0_env_0) env_ptr).cont_env_ptr = cont_env_ptr;
      {
        jmercury.runtime.TypeInfo_Struct TypeCtorInfo_52_52 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_attr2_0);

//  trips2bel.m:218
        {
          list.member_2_p_1(TypeCtorInfo_52_52, As_16, new AddrOf2_0(82), env_ptr);
        }
//  trips2bel.m:217
      }
    }
  }
//  trips2bel.m:192
  private static list.List_1 IntroducedFrom__pred__conv_attr3__192__1_6_p_0(
    java.lang.String F_1,
    int N_2,
    trips2bel.Cvar_0 V_3,
    int HeadVar__4_295,
    list.List_1 HeadVar__5_296)
  {
    {
      boolean succeeded = false;
      list.List_1 HeadVar__6_297 = null;
      trips2bel.Expr_0 V_298_298 = null;
      java.lang.String V_299_299 = "mod";
      trips2bel.Cvar_0 V_300_300 = null;

//  trips2bel.m:193
      {
        V_300_300 = new trips2bel.Cvar_0(F_1, N_2, HeadVar__4_295);
      }
      {
        V_298_298 = new trips2bel.Expr_0.Objprop_3(V_299_299, V_3, V_300_300);
      }
      {
        HeadVar__6_297 = new list.List_1.F_cons_2(((java.lang.Object) (V_298_298)), HeadVar__5_296);
      }
//  trips2bel.m:192
      return HeadVar__6_297;
    }
  }
//  trips2bel.m:158
  private static java.lang.Object [] IntroducedFrom__pred__conv_sent3__156__1_8_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_4,
    java.lang.Object wrapper_arg_6)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      java.lang.Object wrapper_arg_5 = null;
      java.lang.Object wrapper_arg_7 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      list.List_1 conv3_STATE_VARIABLE_X_6 = null;
      bool.Bool_0 conv2_HeadVar__8_8 = null;
      list.List_1 conv1_STATE_VARIABLE_E_10 = null;

      {
        java.lang.Object [] result = trips2bel.conv_attr3_10_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((java.lang.Integer) (((java.lang.Object[]) closure)[4])).intValue(), ((trips2bel.Cvar_0) ((java.lang.Object[]) closure)[5]), ((trips2bel.Attr2_0) wrapper_arg_1), ((list.List_1) wrapper_arg_2), ((bool.Bool_0) wrapper_arg_4), ((list.List_1) wrapper_arg_6));
        conv3_STATE_VARIABLE_X_6 = (list.List_1) result[0];
        conv2_HeadVar__8_8 = (bool.Bool_0) result[1];
        conv1_STATE_VARIABLE_E_10 = (list.List_1) result[2];
      }
      wrapper_arg_3 = ((java.lang.Object) (conv3_STATE_VARIABLE_X_6));
      wrapper_arg_5 = ((java.lang.Object) (conv2_HeadVar__8_8));
      wrapper_arg_7 = ((java.lang.Object) (conv1_STATE_VARIABLE_E_10));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_3)),
        ((java.lang.Object) (wrapper_arg_5)),
        ((java.lang.Object) (wrapper_arg_7))
      };
    }
  }
//  trips2bel.m:156
  private static java.lang.Object [] IntroducedFrom__pred__conv_sent3__156__1_8_p_0(
    java.lang.String F_7,
    int Trn_8,
    tree234.Tree234_2 Map_11,
    int HeadVar__4_31,
    list.List_1 HeadVar__5_32,
    list.List_1 HeadVar__7_34)
  {
    {
      boolean succeeded = false;
      list.List_1 HeadVar__6_33 = null;
      list.List_1 HeadVar__8_35 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_48_48 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_vardef2_0);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_56_56 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_57_57 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_58_58 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_59_59 = null;
      trips2bel.Concept2_0 C_21 = null;
      list.List_1 As_22 = null;
      list.List_1 Xs1_23 = null;
      bool.Bool_0 B_24 = null;
      trips2bel.Vardef2_0 V_36_36 = null;
      /* closure */ java.lang.Object[] V_37_37 = null;
      bool.Bool_0 V_38_38 = null;
      trips2bel.Cvar_0 V_39_39 = null;
      trips2bel.Expr_0 V_40_40 = null;
//  trips2bel.m:157
      java.lang.Object conv0_V_36_36 = null;
      trips2bel.Tconst_0 _Tp_20 = null;
//  trips2bel.m:158
      java.lang.Object conv6_Xs1_23 = null;
      java.lang.Object conv5_B_24 = null;
      java.lang.Object conv4_HeadVar__8_35 = null;

//  trips2bel.m:157
      {
        conv0_V_36_36 = map.f_84_121_112_101_83_112_101_99_79_102_95_95_112_114_101_100_95_111_114_95_102_117_110_99_95_95_108_111_111_107_117_112_95_95_91_75_32_61_32_105_110_116_93_95_48_95_49_3_p_0(TypeCtorInfo_48_48, Map_11, HeadVar__4_31);
      }
      V_36_36 = ((trips2bel.Vardef2_0) conv0_V_36_36);
      _Tp_20 = ((trips2bel.Vardef2_0) V_36_36).F1;
      C_21 = ((trips2bel.Vardef2_0) V_36_36).F2;
      As_22 = ((trips2bel.Vardef2_0) V_36_36).F3;
//  trips2bel.m:158
      {
        V_39_39 = new trips2bel.Cvar_0(F_7, Trn_8, HeadVar__4_31);
      }
      {
        V_37_37 = new /* closure */ java.lang.Object[] {((java.lang.Object) (trips2bel.MR_scalar_common_13[1])), ((java.lang.Object) (new AddrOf5_0(0))), java.lang.Integer.valueOf(3), ((java.lang.Object) (F_7)), java.lang.Integer.valueOf(Trn_8), ((java.lang.Object) (V_39_39))};
      }
      V_38_38 = bool.Bool_0.K1;
      TypeCtorInfo_56_56 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_attr2_0);
      TypeInfo_57_57 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[15]);
      TypeCtorInfo_58_58 = jmercury.runtime.TypeInfo_Struct.maybe_new(bool.bool__type_ctor_info_bool_0);
      TypeInfo_59_59 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[0]);
      {
        java.lang.Object [] result = list.foldl3_8_p_0(TypeCtorInfo_56_56, TypeInfo_57_57, TypeCtorInfo_58_58, TypeInfo_59_59, V_37_37, As_22, ((java.lang.Object) (HeadVar__5_32)), ((java.lang.Object) (V_38_38)), ((java.lang.Object) (HeadVar__7_34)));
        conv6_Xs1_23 = (java.lang.Object) result[0];
        conv5_B_24 = (java.lang.Object) result[1];
        conv4_HeadVar__8_35 = (java.lang.Object) result[2];
      }
      Xs1_23 = ((list.List_1) conv6_Xs1_23);
      B_24 = ((bool.Bool_0) conv5_B_24);
      HeadVar__8_35 = ((list.List_1) conv4_HeadVar__8_35);
//  trips2bel.m:159
      {
        V_40_40 = new trips2bel.Expr_0.Class_3(B_24, C_21, V_39_39);
      }
      {
        HeadVar__6_33 = new list.List_1.F_cons_2(((java.lang.Object) (V_40_40)), Xs1_23);
      }
//  trips2bel.m:156
return new java.lang.Object[] {
        ((java.lang.Object) (HeadVar__6_33)),
        ((java.lang.Object) (HeadVar__8_35))
      };
    }
  }
//  trips2bel.m:84
  private static builtin.Comparison_result_0 __Compare____vertices_0_0(
    trips2bel.Vertices_0 HeadVar__2_2,
    trips2bel.Vertices_0 HeadVar__3_3)
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
          set_ordlist.Set_ordlist_1 V_4_4 = ((trips2bel.Vertices_0) HeadVar__2_2).F1;
          set_ordlist.Set_ordlist_1 V_5_5 = ((trips2bel.Vertices_0) HeadVar__2_2).F2;
          list.List_1 V_6_6 = ((trips2bel.Vertices_0) HeadVar__2_2).F3;
          list.List_1 V_7_7 = ((trips2bel.Vertices_0) HeadVar__2_2).F4;
          set_ordlist.Set_ordlist_1 V_8_8 = ((trips2bel.Vertices_0) HeadVar__3_3).F1;
          set_ordlist.Set_ordlist_1 V_9_9 = ((trips2bel.Vertices_0) HeadVar__3_3).F2;
          list.List_1 V_10_10 = ((trips2bel.Vertices_0) HeadVar__3_3).F3;
          list.List_1 V_11_11 = ((trips2bel.Vertices_0) HeadVar__3_3).F4;
          builtin.Comparison_result_0 V_12_12 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_17_17 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[7]);

          {
            V_12_12 = builtin.compare_3_p_0(TypeInfo_17_17, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_8_8)));
          }
          succeeded = (V_12_12.MR_value == builtin.Comparison_result_0.K0.MR_value);
          succeeded = !(succeeded);
          if (succeeded)
            HeadVar__1_1 = V_12_12;
          else
            {
              builtin.Comparison_result_0 V_13_13 = null;
              jmercury.runtime.TypeInfo_Struct TypeInfo_18_18 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[7]);

              {
                V_13_13 = builtin.compare_3_p_0(TypeInfo_18_18, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_9_9)));
              }
              succeeded = (V_13_13.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_13_13;
              else
                {
                  builtin.Comparison_result_0 V_14_14 = null;
                  jmercury.runtime.TypeInfo_Struct TypeInfo_19_19 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[10]);

                  {
                    V_14_14 = builtin.compare_3_p_0(TypeInfo_19_19, ((java.lang.Object) (V_6_6)), ((java.lang.Object) (V_10_10)));
                  }
                  succeeded = (V_14_14.MR_value == builtin.Comparison_result_0.K0.MR_value);
                  succeeded = !(succeeded);
                  if (succeeded)
                    HeadVar__1_1 = V_14_14;
                  else
                    {
                      jmercury.runtime.TypeInfo_Struct TypeInfo_20_20 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[25]);

                      {
                        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_20_20, ((java.lang.Object) (V_7_7)), ((java.lang.Object) (V_11_11)));
                      }
                    }
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  private static boolean __Unify____vertices_0_0(
    trips2bel.Vertices_0 HeadVar__1_1,
    trips2bel.Vertices_0 HeadVar__2_2)
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
          jmercury.runtime.TypeInfo_Struct TypeInfo_13_13 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[7]);
          jmercury.runtime.TypeInfo_Struct TypeInfo_14_14 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_15_15 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_16_16 = null;
          set_ordlist.Set_ordlist_1 V_3_3 = ((trips2bel.Vertices_0) HeadVar__1_1).F1;
          set_ordlist.Set_ordlist_1 V_4_4 = ((trips2bel.Vertices_0) HeadVar__1_1).F2;
          list.List_1 V_5_5 = ((trips2bel.Vertices_0) HeadVar__1_1).F3;
          list.List_1 V_6_6 = ((trips2bel.Vertices_0) HeadVar__1_1).F4;
          set_ordlist.Set_ordlist_1 V_7_7 = ((trips2bel.Vertices_0) HeadVar__2_2).F1;
          set_ordlist.Set_ordlist_1 V_8_8 = ((trips2bel.Vertices_0) HeadVar__2_2).F2;
          list.List_1 V_9_9 = ((trips2bel.Vertices_0) HeadVar__2_2).F3;
          list.List_1 V_10_10 = ((trips2bel.Vertices_0) HeadVar__2_2).F4;

          {
            succeeded = builtin.unify_2_p_0(TypeInfo_13_13, ((java.lang.Object) (V_3_3)), ((java.lang.Object) (V_7_7)));
          }
          if (succeeded)
            {
              TypeInfo_14_14 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[7]);
              {
                succeeded = builtin.unify_2_p_0(TypeInfo_14_14, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_8_8)));
              }
              if (succeeded)
                {
                  TypeInfo_15_15 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[10]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_15_15, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_9_9)));
                  }
                  if (succeeded)
                    {
                      TypeInfo_16_16 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[25]);
                      {
                        succeeded = builtin.unify_2_p_0(TypeInfo_16_16, ((java.lang.Object) (V_6_6)), ((java.lang.Object) (V_10_10)));
                      }
                    }
                }
            }
        }
      return succeeded;
    }
  }
//  trips2bel.m:32
  public static builtin.Comparison_result_0 __Compare____vdmap_0_0(
    tree234.Tree234_2 HeadVar__2_2,
    tree234.Tree234_2 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[11]);
      tree234.Tree234_2 Cast_HeadVar1_4 = HeadVar__2_2;
      tree234.Tree234_2 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____vdmap_0_0(
    tree234.Tree234_2 HeadVar__1_1,
    tree234.Tree234_2 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[11]);
      tree234.Tree234_2 Cast_HeadVar1_3 = HeadVar__1_1;
      tree234.Tree234_2 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  trips2bel.m:90
  private static builtin.Comparison_result_0 __Compare____varmap_0_0(
    tree234.Tree234_2 HeadVar__2_2,
    tree234.Tree234_2 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[8]);
      tree234.Tree234_2 Cast_HeadVar1_4 = HeadVar__2_2;
      tree234.Tree234_2 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  private static boolean __Unify____varmap_0_0(
    tree234.Tree234_2 HeadVar__1_1,
    tree234.Tree234_2 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[8]);
      tree234.Tree234_2 Cast_HeadVar1_3 = HeadVar__1_1;
      tree234.Tree234_2 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  trips2bel.m:33
  public static builtin.Comparison_result_0 __Compare____vardef2_0_0(
    trips2bel.Vardef2_0 HeadVar__2_2,
    trips2bel.Vardef2_0 HeadVar__3_3)
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
          trips2bel.Tconst_0 V_4_4 = ((trips2bel.Vardef2_0) HeadVar__2_2).F1;
          trips2bel.Concept2_0 V_5_5 = ((trips2bel.Vardef2_0) HeadVar__2_2).F2;
          list.List_1 V_6_6 = ((trips2bel.Vardef2_0) HeadVar__2_2).F3;
          trips2bel.Tconst_0 V_7_7 = ((trips2bel.Vardef2_0) HeadVar__3_3).F1;
          trips2bel.Concept2_0 V_8_8 = ((trips2bel.Vardef2_0) HeadVar__3_3).F2;
          list.List_1 V_9_9 = ((trips2bel.Vardef2_0) HeadVar__3_3).F3;
          builtin.Comparison_result_0 V_10_10 = null;
          int V_17_17 = (int) V_4_4.MR_value;
          int V_18_18 = (int) V_7_7.MR_value;

          {
            V_10_10 = private_builtin.builtin_compare_int_3_p_0(V_17_17, V_18_18);
          }
          succeeded = (V_10_10.MR_value == builtin.Comparison_result_0.K0.MR_value);
          succeeded = !(succeeded);
          if (succeeded)
            HeadVar__1_1 = V_10_10;
          else
            {
              builtin.Comparison_result_0 V_11_11 = null;

              {
                V_11_11 = trips2bel.__Compare____concept2_0_0(V_5_5, V_8_8);
              }
              succeeded = (V_11_11.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_11_11;
              else
                {
                  jmercury.runtime.TypeInfo_Struct TypeInfo_16_16 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[14]);

                  {
                    HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_16_16, ((java.lang.Object) (V_6_6)), ((java.lang.Object) (V_9_9)));
                  }
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____vardef2_0_0(
    trips2bel.Vardef2_0 HeadVar__1_1,
    trips2bel.Vardef2_0 HeadVar__2_2)
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
          trips2bel.Tconst_0 V_3_3 = ((trips2bel.Vardef2_0) HeadVar__1_1).F1;
          trips2bel.Concept2_0 V_4_4 = ((trips2bel.Vardef2_0) HeadVar__1_1).F2;
          list.List_1 V_5_5 = ((trips2bel.Vardef2_0) HeadVar__1_1).F3;
          trips2bel.Tconst_0 V_6_6 = ((trips2bel.Vardef2_0) HeadVar__2_2).F1;
          trips2bel.Concept2_0 V_7_7 = ((trips2bel.Vardef2_0) HeadVar__2_2).F2;
          list.List_1 V_8_8 = ((trips2bel.Vardef2_0) HeadVar__2_2).F3;

          succeeded = (V_3_3.MR_value == V_6_6.MR_value);
          if (succeeded)
            {
              {
                succeeded = trips2bel.__Unify____concept2_0_0(V_4_4, V_7_7);
              }
              if (succeeded)
                {
                  TypeInfo_11_11 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[14]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_11_11, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_8_8)));
                  }
                }
            }
        }
      return succeeded;
    }
  }
//  trips2bel.m:17
  public static builtin.Comparison_result_0 __Compare____vardef_0_0(
    trips2bel.Vardef_0 HeadVar__2_2,
    trips2bel.Vardef_0 HeadVar__3_3)
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
          trips2bel.Tconst_0 V_4_4 = ((trips2bel.Vardef_0) HeadVar__2_2).F1;
          int V_5_5 = ((trips2bel.Vardef_0) HeadVar__2_2).F2;
          java.lang.String V_6_6 = ((trips2bel.Vardef_0) HeadVar__2_2).F3;
          list.List_1 V_7_7 = ((trips2bel.Vardef_0) HeadVar__2_2).F4;
          trips2bel.Tconst_0 V_8_8 = ((trips2bel.Vardef_0) HeadVar__3_3).F1;
          int V_9_9 = ((trips2bel.Vardef_0) HeadVar__3_3).F2;
          java.lang.String V_10_10 = ((trips2bel.Vardef_0) HeadVar__3_3).F3;
          list.List_1 V_11_11 = ((trips2bel.Vardef_0) HeadVar__3_3).F4;
          builtin.Comparison_result_0 V_12_12 = null;
          int V_21_21 = (int) V_4_4.MR_value;
          int V_22_22 = (int) V_8_8.MR_value;

          {
            V_12_12 = private_builtin.builtin_compare_int_3_p_0(V_21_21, V_22_22);
          }
          succeeded = (V_12_12.MR_value == builtin.Comparison_result_0.K0.MR_value);
          succeeded = !(succeeded);
          if (succeeded)
            HeadVar__1_1 = V_12_12;
          else
            {
              builtin.Comparison_result_0 V_13_13 = null;

              {
                V_13_13 = private_builtin.builtin_compare_int_3_p_0(V_5_5, V_9_9);
              }
              succeeded = (V_13_13.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_13_13;
              else
                {
                  builtin.Comparison_result_0 V_14_14 = null;

                  {
                    V_14_14 = private_builtin.builtin_compare_string_3_p_0(V_6_6, V_10_10);
                  }
                  succeeded = (V_14_14.MR_value == builtin.Comparison_result_0.K0.MR_value);
                  succeeded = !(succeeded);
                  if (succeeded)
                    HeadVar__1_1 = V_14_14;
                  else
                    {
                      jmercury.runtime.TypeInfo_Struct TypeInfo_20_20 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[24]);

                      {
                        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_20_20, ((java.lang.Object) (V_7_7)), ((java.lang.Object) (V_11_11)));
                      }
                    }
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____vardef_0_0(
    trips2bel.Vardef_0 HeadVar__1_1,
    trips2bel.Vardef_0 HeadVar__2_2)
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
          jmercury.runtime.TypeInfo_Struct TypeInfo_13_13 = null;
          trips2bel.Tconst_0 V_3_3 = ((trips2bel.Vardef_0) HeadVar__1_1).F1;
          int V_4_4 = ((trips2bel.Vardef_0) HeadVar__1_1).F2;
          java.lang.String V_5_5 = ((trips2bel.Vardef_0) HeadVar__1_1).F3;
          list.List_1 V_6_6 = ((trips2bel.Vardef_0) HeadVar__1_1).F4;
          trips2bel.Tconst_0 V_7_7 = ((trips2bel.Vardef_0) HeadVar__2_2).F1;
          int V_8_8 = ((trips2bel.Vardef_0) HeadVar__2_2).F2;
          java.lang.String V_9_9 = ((trips2bel.Vardef_0) HeadVar__2_2).F3;
          list.List_1 V_10_10 = ((trips2bel.Vardef_0) HeadVar__2_2).F4;

          succeeded = (V_3_3.MR_value == V_7_7.MR_value);
          if (succeeded)
            {
              succeeded = (V_4_4 == V_8_8);
              if (succeeded)
                {
                  succeeded = V_5_5.equals(V_9_9);
                  if (succeeded)
                    {
                      TypeInfo_13_13 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[24]);
                      {
                        succeeded = builtin.unify_2_p_0(TypeInfo_13_13, ((java.lang.Object) (V_6_6)), ((java.lang.Object) (V_10_10)));
                      }
                    }
                }
            }
        }
      return succeeded;
    }
  }
//  trips2bel.m:22
  public static builtin.Comparison_result_0 __Compare____var_0_0(
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
  public static boolean __Unify____var_0_0(
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
//  trips2bel.m:27
  public static builtin.Comparison_result_0 __Compare____value_0_0(
    trips2bel.Value_0 HeadVar__2_2,
    trips2bel.Value_0 HeadVar__3_3)
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
              int V_45_45 = ((trips2bel.Value_0.Var_1) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  {
                    int V_5_5 = ((trips2bel.Value_0.Var_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_45_45, V_5_5);
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
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 1:
            {
              java.lang.String V_42_42 = ((trips2bel.Value_0.Con_1) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 1:
                  {
                    java.lang.String V_15_15 = ((trips2bel.Value_0.Con_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_42_42, V_15_15);
                    }
                  }
                  break;
                case 2:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 3:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 2:
            {
              int V_44_44 = ((trips2bel.Value_0.Int_1) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 1:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 2:
                  {
                    int V_25_25 = ((trips2bel.Value_0.Int_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_44_44, V_25_25);
                    }
                  }
                  break;
                case 3:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 3:
            {
              double V_43_43 = ((trips2bel.Value_0.Float_1) HeadVar__2_2).F1;

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
                    double V_35_35 = ((trips2bel.Value_0.Float_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_float_3_p_0(V_43_43, V_35_35);
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
  public static boolean __Unify____value_0_0(
    trips2bel.Value_0 HeadVar__1_1,
    trips2bel.Value_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_11 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_12 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_11 == CastY_12);
      if (succeeded)
        succeeded = true;
      else
        switch (HeadVar__1_1.data_tag) {
          case 0:
            {
              int V_3_3 = ((trips2bel.Value_0.Var_1) HeadVar__1_1).F1;
              int V_4_4 = 0;

              succeeded = (HeadVar__2_2.data_tag == 0);
              if (succeeded)
                {
                  V_4_4 = ((trips2bel.Value_0.Var_1) HeadVar__2_2).F1;
                  succeeded = (V_3_3 == V_4_4);
                }
            }
            break;
          case 1:
            {
              java.lang.String V_5_5 = ((trips2bel.Value_0.Con_1) HeadVar__1_1).F1;
              java.lang.String V_6_6 = null;

              succeeded = (HeadVar__2_2.data_tag == 1);
              if (succeeded)
                {
                  V_6_6 = ((trips2bel.Value_0.Con_1) HeadVar__2_2).F1;
                  succeeded = V_5_5.equals(V_6_6);
                }
            }
            break;
          case 2:
            {
              int V_7_7 = ((trips2bel.Value_0.Int_1) HeadVar__1_1).F1;
              int V_8_8 = 0;

              succeeded = (HeadVar__2_2.data_tag == 2);
              if (succeeded)
                {
                  V_8_8 = ((trips2bel.Value_0.Int_1) HeadVar__2_2).F1;
                  succeeded = (V_7_7 == V_8_8);
                }
            }
            break;
          case 3:
            {
              double V_9_9 = ((trips2bel.Value_0.Float_1) HeadVar__1_1).F1;
              double V_10_10 = 0;

              succeeded = (HeadVar__2_2.data_tag == 3);
              if (succeeded)
                {
                  V_10_10 = ((trips2bel.Value_0.Float_1) HeadVar__2_2).F1;
                  succeeded = (V_9_9 == V_10_10);
                }
            }
            break;
          default: /*NOTREACHED*/
            throw new jmercury.runtime.UnreachableDefault();
        }
      return succeeded;
    }
  }
//  trips2bel.m:9
  public static builtin.Comparison_result_0 __Compare____turnno_0_0(
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
  public static boolean __Unify____turnno_0_0(
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
//  trips2bel.m:58
  public static builtin.Comparison_result_0 __Compare____turn3_0_0(
    trips2bel.Turn3_0 HeadVar__2_2,
    trips2bel.Turn3_0 HeadVar__3_3)
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
          int V_4_4 = ((trips2bel.Turn3_0) HeadVar__2_2).F1;
          java.lang.String V_5_5 = ((trips2bel.Turn3_0) HeadVar__2_2).F2;
          list.List_1 V_6_6 = ((trips2bel.Turn3_0) HeadVar__2_2).F3;
          int V_7_7 = ((trips2bel.Turn3_0) HeadVar__3_3).F1;
          java.lang.String V_8_8 = ((trips2bel.Turn3_0) HeadVar__3_3).F2;
          list.List_1 V_9_9 = ((trips2bel.Turn3_0) HeadVar__3_3).F3;
          builtin.Comparison_result_0 V_10_10 = null;

          {
            V_10_10 = private_builtin.builtin_compare_int_3_p_0(V_4_4, V_7_7);
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
                  jmercury.runtime.TypeInfo_Struct TypeInfo_16_16 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[23]);

                  {
                    HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_16_16, ((java.lang.Object) (V_6_6)), ((java.lang.Object) (V_9_9)));
                  }
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____turn3_0_0(
    trips2bel.Turn3_0 HeadVar__1_1,
    trips2bel.Turn3_0 HeadVar__2_2)
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
          int V_3_3 = ((trips2bel.Turn3_0) HeadVar__1_1).F1;
          java.lang.String V_4_4 = ((trips2bel.Turn3_0) HeadVar__1_1).F2;
          list.List_1 V_5_5 = ((trips2bel.Turn3_0) HeadVar__1_1).F3;
          int V_6_6 = ((trips2bel.Turn3_0) HeadVar__2_2).F1;
          java.lang.String V_7_7 = ((trips2bel.Turn3_0) HeadVar__2_2).F2;
          list.List_1 V_8_8 = ((trips2bel.Turn3_0) HeadVar__2_2).F3;

          succeeded = (V_3_3 == V_6_6);
          if (succeeded)
            {
              succeeded = V_4_4.equals(V_7_7);
              if (succeeded)
                {
                  TypeInfo_11_11 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[23]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_11_11, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_8_8)));
                  }
                }
            }
        }
      return succeeded;
    }
  }
//  trips2bel.m:30
  public static builtin.Comparison_result_0 __Compare____turn2_0_0(
    trips2bel.Turn2_0 HeadVar__2_2,
    trips2bel.Turn2_0 HeadVar__3_3)
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
          int V_4_4 = ((trips2bel.Turn2_0) HeadVar__2_2).F1;
          java.lang.String V_5_5 = ((trips2bel.Turn2_0) HeadVar__2_2).F2;
          list.List_1 V_6_6 = ((trips2bel.Turn2_0) HeadVar__2_2).F3;
          int V_7_7 = ((trips2bel.Turn2_0) HeadVar__3_3).F1;
          java.lang.String V_8_8 = ((trips2bel.Turn2_0) HeadVar__3_3).F2;
          list.List_1 V_9_9 = ((trips2bel.Turn2_0) HeadVar__3_3).F3;
          builtin.Comparison_result_0 V_10_10 = null;

          {
            V_10_10 = private_builtin.builtin_compare_int_3_p_0(V_4_4, V_7_7);
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
                  jmercury.runtime.TypeInfo_Struct TypeInfo_16_16 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[22]);

                  {
                    HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_16_16, ((java.lang.Object) (V_6_6)), ((java.lang.Object) (V_9_9)));
                  }
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____turn2_0_0(
    trips2bel.Turn2_0 HeadVar__1_1,
    trips2bel.Turn2_0 HeadVar__2_2)
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
          int V_3_3 = ((trips2bel.Turn2_0) HeadVar__1_1).F1;
          java.lang.String V_4_4 = ((trips2bel.Turn2_0) HeadVar__1_1).F2;
          list.List_1 V_5_5 = ((trips2bel.Turn2_0) HeadVar__1_1).F3;
          int V_6_6 = ((trips2bel.Turn2_0) HeadVar__2_2).F1;
          java.lang.String V_7_7 = ((trips2bel.Turn2_0) HeadVar__2_2).F2;
          list.List_1 V_8_8 = ((trips2bel.Turn2_0) HeadVar__2_2).F3;

          succeeded = (V_3_3 == V_6_6);
          if (succeeded)
            {
              succeeded = V_4_4.equals(V_7_7);
              if (succeeded)
                {
                  TypeInfo_11_11 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[22]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_11_11, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_8_8)));
                  }
                }
            }
        }
      return succeeded;
    }
  }
//  trips2bel.m:8
  public static builtin.Comparison_result_0 __Compare____turn_0_0(
    trips2bel.Turn_0 HeadVar__2_2,
    trips2bel.Turn_0 HeadVar__3_3)
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
          int V_4_4 = ((trips2bel.Turn_0) HeadVar__2_2).F1;
          java.lang.String V_5_5 = ((trips2bel.Turn_0) HeadVar__2_2).F2;
          list.List_1 V_6_6 = ((trips2bel.Turn_0) HeadVar__2_2).F3;
          int V_7_7 = ((trips2bel.Turn_0) HeadVar__3_3).F1;
          java.lang.String V_8_8 = ((trips2bel.Turn_0) HeadVar__3_3).F2;
          list.List_1 V_9_9 = ((trips2bel.Turn_0) HeadVar__3_3).F3;
          builtin.Comparison_result_0 V_10_10 = null;

          {
            V_10_10 = private_builtin.builtin_compare_int_3_p_0(V_4_4, V_7_7);
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
                  jmercury.runtime.TypeInfo_Struct TypeInfo_16_16 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[21]);

                  {
                    HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_16_16, ((java.lang.Object) (V_6_6)), ((java.lang.Object) (V_9_9)));
                  }
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____turn_0_0(
    trips2bel.Turn_0 HeadVar__1_1,
    trips2bel.Turn_0 HeadVar__2_2)
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
          int V_3_3 = ((trips2bel.Turn_0) HeadVar__1_1).F1;
          java.lang.String V_4_4 = ((trips2bel.Turn_0) HeadVar__1_1).F2;
          list.List_1 V_5_5 = ((trips2bel.Turn_0) HeadVar__1_1).F3;
          int V_6_6 = ((trips2bel.Turn_0) HeadVar__2_2).F1;
          java.lang.String V_7_7 = ((trips2bel.Turn_0) HeadVar__2_2).F2;
          list.List_1 V_8_8 = ((trips2bel.Turn_0) HeadVar__2_2).F3;

          succeeded = (V_3_3 == V_6_6);
          if (succeeded)
            {
              succeeded = V_4_4.equals(V_7_7);
              if (succeeded)
                {
                  TypeInfo_11_11 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[21]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_11_11, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_8_8)));
                  }
                }
            }
        }
      return succeeded;
    }
  }
//  trips2bel.m:57
  public static builtin.Comparison_result_0 __Compare____trfile3_0_0(
    trips2bel.Trfile3_0 HeadVar__2_2,
    trips2bel.Trfile3_0 HeadVar__3_3)
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
          java.lang.String V_4_4 = ((trips2bel.Trfile3_0) HeadVar__2_2).F1;
          list.List_1 V_5_5 = ((trips2bel.Trfile3_0) HeadVar__2_2).F2;
          tree234.Tree234_2 V_6_6 = ((trips2bel.Trfile3_0) HeadVar__2_2).F3;
          java.lang.String V_7_7 = ((trips2bel.Trfile3_0) HeadVar__3_3).F1;
          list.List_1 V_8_8 = ((trips2bel.Trfile3_0) HeadVar__3_3).F2;
          tree234.Tree234_2 V_9_9 = ((trips2bel.Trfile3_0) HeadVar__3_3).F3;
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
              jmercury.runtime.TypeInfo_Struct TypeInfo_15_15 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[20]);

              {
                V_11_11 = builtin.compare_3_p_0(TypeInfo_15_15, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_8_8)));
              }
              succeeded = (V_11_11.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_11_11;
              else
                {
                  jmercury.runtime.TypeInfo_Struct TypeInfo_16_16 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[17]);

                  {
                    HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_16_16, ((java.lang.Object) (V_6_6)), ((java.lang.Object) (V_9_9)));
                  }
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____trfile3_0_0(
    trips2bel.Trfile3_0 HeadVar__1_1,
    trips2bel.Trfile3_0 HeadVar__2_2)
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
          java.lang.String V_3_3 = ((trips2bel.Trfile3_0) HeadVar__1_1).F1;
          list.List_1 V_4_4 = ((trips2bel.Trfile3_0) HeadVar__1_1).F2;
          tree234.Tree234_2 V_5_5 = ((trips2bel.Trfile3_0) HeadVar__1_1).F3;
          java.lang.String V_6_6 = ((trips2bel.Trfile3_0) HeadVar__2_2).F1;
          list.List_1 V_7_7 = ((trips2bel.Trfile3_0) HeadVar__2_2).F2;
          tree234.Tree234_2 V_8_8 = ((trips2bel.Trfile3_0) HeadVar__2_2).F3;

          succeeded = V_3_3.equals(V_6_6);
          if (succeeded)
            {
              TypeInfo_11_11 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[20]);
              {
                succeeded = builtin.unify_2_p_0(TypeInfo_11_11, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_7_7)));
              }
              if (succeeded)
                {
                  TypeInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[17]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_12_12, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_8_8)));
                  }
                }
            }
        }
      return succeeded;
    }
  }
//  trips2bel.m:29
  public static builtin.Comparison_result_0 __Compare____trfile2_0_0(
    trips2bel.Trfile2_0 HeadVar__2_2,
    trips2bel.Trfile2_0 HeadVar__3_3)
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
          java.lang.String V_4_4 = ((trips2bel.Trfile2_0) HeadVar__2_2).F1;
          list.List_1 V_5_5 = ((trips2bel.Trfile2_0) HeadVar__2_2).F2;
          java.lang.String V_6_6 = ((trips2bel.Trfile2_0) HeadVar__3_3).F1;
          list.List_1 V_7_7 = ((trips2bel.Trfile2_0) HeadVar__3_3).F2;
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
              jmercury.runtime.TypeInfo_Struct TypeInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[19]);

              {
                HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_12_12, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_7_7)));
              }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____trfile2_0_0(
    trips2bel.Trfile2_0 HeadVar__1_1,
    trips2bel.Trfile2_0 HeadVar__2_2)
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
          java.lang.String V_3_3 = ((trips2bel.Trfile2_0) HeadVar__1_1).F1;
          list.List_1 V_4_4 = ((trips2bel.Trfile2_0) HeadVar__1_1).F2;
          java.lang.String V_5_5 = ((trips2bel.Trfile2_0) HeadVar__2_2).F1;
          list.List_1 V_6_6 = ((trips2bel.Trfile2_0) HeadVar__2_2).F2;

          succeeded = V_3_3.equals(V_5_5);
          if (succeeded)
            {
              TypeInfo_9_9 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[19]);
              {
                succeeded = builtin.unify_2_p_0(TypeInfo_9_9, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_6_6)));
              }
            }
        }
      return succeeded;
    }
  }
//  trips2bel.m:6
  public static builtin.Comparison_result_0 __Compare____trfile_0_0(
    trips2bel.Trfile_0 HeadVar__2_2,
    trips2bel.Trfile_0 HeadVar__3_3)
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
          java.lang.String V_4_4 = ((trips2bel.Trfile_0) HeadVar__2_2).F1;
          list.List_1 V_5_5 = ((trips2bel.Trfile_0) HeadVar__2_2).F2;
          java.lang.String V_6_6 = ((trips2bel.Trfile_0) HeadVar__3_3).F1;
          list.List_1 V_7_7 = ((trips2bel.Trfile_0) HeadVar__3_3).F2;
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
              jmercury.runtime.TypeInfo_Struct TypeInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[18]);

              {
                HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_12_12, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_7_7)));
              }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____trfile_0_0(
    trips2bel.Trfile_0 HeadVar__1_1,
    trips2bel.Trfile_0 HeadVar__2_2)
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
          java.lang.String V_3_3 = ((trips2bel.Trfile_0) HeadVar__1_1).F1;
          list.List_1 V_4_4 = ((trips2bel.Trfile_0) HeadVar__1_1).F2;
          java.lang.String V_5_5 = ((trips2bel.Trfile_0) HeadVar__2_2).F1;
          list.List_1 V_6_6 = ((trips2bel.Trfile_0) HeadVar__2_2).F2;

          succeeded = V_3_3.equals(V_5_5);
          if (succeeded)
            {
              TypeInfo_9_9 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[18]);
              {
                succeeded = builtin.unify_2_p_0(TypeInfo_9_9, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_6_6)));
              }
            }
        }
      return succeeded;
    }
  }
//  trips2bel.m:12
  public static builtin.Comparison_result_0 __Compare____text_0_0(
    list.List_1 HeadVar__2_2,
    list.List_1 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[5]);
      list.List_1 Cast_HeadVar1_4 = HeadVar__2_2;
      list.List_1 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____text_0_0(
    list.List_1 HeadVar__1_1,
    list.List_1 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[5]);
      list.List_1 Cast_HeadVar1_3 = HeadVar__1_1;
      list.List_1 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  trips2bel.m:18
  public static builtin.Comparison_result_0 __Compare____tconst_0_0(
    trips2bel.Tconst_0 HeadVar__2_2,
    trips2bel.Tconst_0 HeadVar__3_3)
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
  public static boolean __Unify____tconst_0_0(
    trips2bel.Tconst_0 HeadVar__2_1,
    trips2bel.Tconst_0 HeadVar__2_2)
  {
    {
      boolean succeeded = (HeadVar__2_1.MR_value == HeadVar__2_2.MR_value);

      return succeeded;
    }
  }
//  trips2bel.m:62
  public static builtin.Comparison_result_0 __Compare____symmap_0_0(
    tree234.Tree234_2 HeadVar__2_2,
    tree234.Tree234_2 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[17]);
      tree234.Tree234_2 Cast_HeadVar1_4 = HeadVar__2_2;
      tree234.Tree234_2 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____symmap_0_0(
    tree234.Tree234_2 HeadVar__1_1,
    tree234.Tree234_2 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[17]);
      tree234.Tree234_2 Cast_HeadVar1_3 = HeadVar__1_1;
      tree234.Tree234_2 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  trips2bel.m:24
  public static builtin.Comparison_result_0 __Compare____superclass_0_0(
    java.lang.String HeadVar__2_2,
    java.lang.String HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      java.lang.String Cast_HeadVar1_4 = HeadVar__2_2;
      java.lang.String Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(Cast_HeadVar1_4, Cast_HeadVar2_5);
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____superclass_0_0(
    java.lang.String HeadVar__1_1,
    java.lang.String HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      java.lang.String Cast_HeadVar1_3 = HeadVar__1_1;
      java.lang.String Cast_HeadVar2_4 = HeadVar__2_2;

      succeeded = Cast_HeadVar1_3.equals(Cast_HeadVar2_4);
      return succeeded;
    }
  }
//  trips2bel.m:10
  public static builtin.Comparison_result_0 __Compare____speaker_0_0(
    java.lang.String HeadVar__2_2,
    java.lang.String HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      java.lang.String Cast_HeadVar1_4 = HeadVar__2_2;
      java.lang.String Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(Cast_HeadVar1_4, Cast_HeadVar2_5);
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____speaker_0_0(
    java.lang.String HeadVar__1_1,
    java.lang.String HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      java.lang.String Cast_HeadVar1_3 = HeadVar__1_1;
      java.lang.String Cast_HeadVar2_4 = HeadVar__2_2;

      succeeded = Cast_HeadVar1_3.equals(Cast_HeadVar2_4);
      return succeeded;
    }
  }
//  trips2bel.m:59
  public static builtin.Comparison_result_0 __Compare____sent3_0_0(
    trips2bel.Sent3_0 HeadVar__2_2,
    trips2bel.Sent3_0 HeadVar__3_3)
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
          list.List_1 V_4_4 = ((trips2bel.Sent3_0) HeadVar__2_2).F1;
          trips2bel.Exptp_0 V_5_5 = ((trips2bel.Sent3_0) HeadVar__2_2).F2;
          list.List_1 V_6_6 = ((trips2bel.Sent3_0) HeadVar__2_2).F3;
          list.List_1 V_7_7 = ((trips2bel.Sent3_0) HeadVar__3_3).F1;
          trips2bel.Exptp_0 V_8_8 = ((trips2bel.Sent3_0) HeadVar__3_3).F2;
          list.List_1 V_9_9 = ((trips2bel.Sent3_0) HeadVar__3_3).F3;
          builtin.Comparison_result_0 V_10_10 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_14_14 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[5]);

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
              int V_17_17 = (int) V_5_5.MR_value;
              int V_18_18 = (int) V_8_8.MR_value;

              {
                V_11_11 = private_builtin.builtin_compare_int_3_p_0(V_17_17, V_18_18);
              }
              succeeded = (V_11_11.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_11_11;
              else
                {
                  jmercury.runtime.TypeInfo_Struct TypeInfo_16_16 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[15]);

                  {
                    HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_16_16, ((java.lang.Object) (V_6_6)), ((java.lang.Object) (V_9_9)));
                  }
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____sent3_0_0(
    trips2bel.Sent3_0 HeadVar__1_1,
    trips2bel.Sent3_0 HeadVar__2_2)
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
          jmercury.runtime.TypeInfo_Struct TypeInfo_11_11 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[5]);
          jmercury.runtime.TypeInfo_Struct TypeInfo_12_12 = null;
          list.List_1 V_3_3 = ((trips2bel.Sent3_0) HeadVar__1_1).F1;
          trips2bel.Exptp_0 V_4_4 = ((trips2bel.Sent3_0) HeadVar__1_1).F2;
          list.List_1 V_5_5 = ((trips2bel.Sent3_0) HeadVar__1_1).F3;
          list.List_1 V_6_6 = ((trips2bel.Sent3_0) HeadVar__2_2).F1;
          trips2bel.Exptp_0 V_7_7 = ((trips2bel.Sent3_0) HeadVar__2_2).F2;
          list.List_1 V_8_8 = ((trips2bel.Sent3_0) HeadVar__2_2).F3;

          {
            succeeded = builtin.unify_2_p_0(TypeInfo_11_11, ((java.lang.Object) (V_3_3)), ((java.lang.Object) (V_6_6)));
          }
          if (succeeded)
            {
              succeeded = (V_4_4.MR_value == V_7_7.MR_value);
              if (succeeded)
                {
                  TypeInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[15]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_12_12, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_8_8)));
                  }
                }
            }
        }
      return succeeded;
    }
  }
//  trips2bel.m:31
  public static builtin.Comparison_result_0 __Compare____sent2_0_0(
    trips2bel.Sent2_0 HeadVar__2_2,
    trips2bel.Sent2_0 HeadVar__3_3)
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
          list.List_1 V_4_4 = ((trips2bel.Sent2_0) HeadVar__2_2).F1;
          trips2bel.Exptp_0 V_5_5 = ((trips2bel.Sent2_0) HeadVar__2_2).F2;
          tree234.Tree234_2 V_6_6 = ((trips2bel.Sent2_0) HeadVar__2_2).F3;
          list.List_1 V_7_7 = ((trips2bel.Sent2_0) HeadVar__3_3).F1;
          trips2bel.Exptp_0 V_8_8 = ((trips2bel.Sent2_0) HeadVar__3_3).F2;
          tree234.Tree234_2 V_9_9 = ((trips2bel.Sent2_0) HeadVar__3_3).F3;
          builtin.Comparison_result_0 V_10_10 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_14_14 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[5]);

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
              int V_17_17 = (int) V_5_5.MR_value;
              int V_18_18 = (int) V_8_8.MR_value;

              {
                V_11_11 = private_builtin.builtin_compare_int_3_p_0(V_17_17, V_18_18);
              }
              succeeded = (V_11_11.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_11_11;
              else
                {
                  jmercury.runtime.TypeInfo_Struct TypeInfo_16_16 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[11]);

                  {
                    HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_16_16, ((java.lang.Object) (V_6_6)), ((java.lang.Object) (V_9_9)));
                  }
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____sent2_0_0(
    trips2bel.Sent2_0 HeadVar__1_1,
    trips2bel.Sent2_0 HeadVar__2_2)
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
          jmercury.runtime.TypeInfo_Struct TypeInfo_11_11 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[5]);
          jmercury.runtime.TypeInfo_Struct TypeInfo_12_12 = null;
          list.List_1 V_3_3 = ((trips2bel.Sent2_0) HeadVar__1_1).F1;
          trips2bel.Exptp_0 V_4_4 = ((trips2bel.Sent2_0) HeadVar__1_1).F2;
          tree234.Tree234_2 V_5_5 = ((trips2bel.Sent2_0) HeadVar__1_1).F3;
          list.List_1 V_6_6 = ((trips2bel.Sent2_0) HeadVar__2_2).F1;
          trips2bel.Exptp_0 V_7_7 = ((trips2bel.Sent2_0) HeadVar__2_2).F2;
          tree234.Tree234_2 V_8_8 = ((trips2bel.Sent2_0) HeadVar__2_2).F3;

          {
            succeeded = builtin.unify_2_p_0(TypeInfo_11_11, ((java.lang.Object) (V_3_3)), ((java.lang.Object) (V_6_6)));
          }
          if (succeeded)
            {
              succeeded = (V_4_4.MR_value == V_7_7.MR_value);
              if (succeeded)
                {
                  TypeInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[11]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_12_12, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_8_8)));
                  }
                }
            }
        }
      return succeeded;
    }
  }
//  trips2bel.m:11
  public static builtin.Comparison_result_0 __Compare____sent_0_0(
    trips2bel.Sent_0 HeadVar__2_2,
    trips2bel.Sent_0 HeadVar__3_3)
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
          list.List_1 V_4_4 = ((trips2bel.Sent_0) HeadVar__2_2).F1;
          trips2bel.Exptp_0 V_5_5 = ((trips2bel.Sent_0) HeadVar__2_2).F2;
          list.List_1 V_6_6 = ((trips2bel.Sent_0) HeadVar__2_2).F3;
          list.List_1 V_7_7 = ((trips2bel.Sent_0) HeadVar__3_3).F1;
          trips2bel.Exptp_0 V_8_8 = ((trips2bel.Sent_0) HeadVar__3_3).F2;
          list.List_1 V_9_9 = ((trips2bel.Sent_0) HeadVar__3_3).F3;
          builtin.Comparison_result_0 V_10_10 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_14_14 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[5]);

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
              int V_17_17 = (int) V_5_5.MR_value;
              int V_18_18 = (int) V_8_8.MR_value;

              {
                V_11_11 = private_builtin.builtin_compare_int_3_p_0(V_17_17, V_18_18);
              }
              succeeded = (V_11_11.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_11_11;
              else
                {
                  jmercury.runtime.TypeInfo_Struct TypeInfo_16_16 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[16]);

                  {
                    HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_16_16, ((java.lang.Object) (V_6_6)), ((java.lang.Object) (V_9_9)));
                  }
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____sent_0_0(
    trips2bel.Sent_0 HeadVar__1_1,
    trips2bel.Sent_0 HeadVar__2_2)
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
          jmercury.runtime.TypeInfo_Struct TypeInfo_11_11 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[5]);
          jmercury.runtime.TypeInfo_Struct TypeInfo_12_12 = null;
          list.List_1 V_3_3 = ((trips2bel.Sent_0) HeadVar__1_1).F1;
          trips2bel.Exptp_0 V_4_4 = ((trips2bel.Sent_0) HeadVar__1_1).F2;
          list.List_1 V_5_5 = ((trips2bel.Sent_0) HeadVar__1_1).F3;
          list.List_1 V_6_6 = ((trips2bel.Sent_0) HeadVar__2_2).F1;
          trips2bel.Exptp_0 V_7_7 = ((trips2bel.Sent_0) HeadVar__2_2).F2;
          list.List_1 V_8_8 = ((trips2bel.Sent_0) HeadVar__2_2).F3;

          {
            succeeded = builtin.unify_2_p_0(TypeInfo_11_11, ((java.lang.Object) (V_3_3)), ((java.lang.Object) (V_6_6)));
          }
          if (succeeded)
            {
              succeeded = (V_4_4.MR_value == V_7_7.MR_value);
              if (succeeded)
                {
                  TypeInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[16]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_12_12, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_8_8)));
                  }
                }
            }
        }
      return succeeded;
    }
  }
//  trips2bel.m:26
  public static builtin.Comparison_result_0 __Compare____role_0_0(
    java.lang.String HeadVar__2_2,
    java.lang.String HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      java.lang.String Cast_HeadVar1_4 = HeadVar__2_2;
      java.lang.String Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(Cast_HeadVar1_4, Cast_HeadVar2_5);
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____role_0_0(
    java.lang.String HeadVar__1_1,
    java.lang.String HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      java.lang.String Cast_HeadVar1_3 = HeadVar__1_1;
      java.lang.String Cast_HeadVar2_4 = HeadVar__2_2;

      succeeded = Cast_HeadVar1_3.equals(Cast_HeadVar2_4);
      return succeeded;
    }
  }
//  trips2bel.m:48
  public static builtin.Comparison_result_0 __Compare____reftp_0_0(
    trips2bel.Reftp_0 HeadVar__2_2,
    trips2bel.Reftp_0 HeadVar__3_3)
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
  public static boolean __Unify____reftp_0_0(
    trips2bel.Reftp_0 HeadVar__2_1,
    trips2bel.Reftp_0 HeadVar__2_2)
  {
    {
      boolean succeeded = (HeadVar__2_1.MR_value == HeadVar__2_2.MR_value);

      return succeeded;
    }
  }
//  trips2bel.m:43
  public static builtin.Comparison_result_0 __Compare____orientval_0_0(
    trips2bel.Orientval_0 HeadVar__2_2,
    trips2bel.Orientval_0 HeadVar__3_3)
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
  public static boolean __Unify____orientval_0_0(
    trips2bel.Orientval_0 HeadVar__2_1,
    trips2bel.Orientval_0 HeadVar__2_2)
  {
    {
      boolean succeeded = (HeadVar__2_1.MR_value == HeadVar__2_2.MR_value);

      return succeeded;
    }
  }
//  trips2bel.m:42
  public static builtin.Comparison_result_0 __Compare____opval_0_0(
    trips2bel.Opval_0 HeadVar__2_2,
    trips2bel.Opval_0 HeadVar__3_3)
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
  public static boolean __Unify____opval_0_0(
    trips2bel.Opval_0 HeadVar__2_1,
    trips2bel.Opval_0 HeadVar__2_2)
  {
    {
      boolean succeeded = (HeadVar__2_1.MR_value == HeadVar__2_2.MR_value);

      return succeeded;
    }
  }
//  trips2bel.m:45
  public static builtin.Comparison_result_0 __Compare____negval_0_0()
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = builtin.Comparison_result_0.K0;

      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____negval_0_0()
  {
    {
      boolean succeeded = true;

      return succeeded;
    }
  }
//  trips2bel.m:40
  public static builtin.Comparison_result_0 __Compare____forceval_0_0(
    trips2bel.Forceval_0 HeadVar__2_2,
    trips2bel.Forceval_0 HeadVar__3_3)
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
  public static boolean __Unify____forceval_0_0(
    trips2bel.Forceval_0 HeadVar__2_1,
    trips2bel.Forceval_0 HeadVar__2_2)
  {
    {
      boolean succeeded = (HeadVar__2_1.MR_value == HeadVar__2_2.MR_value);

      return succeeded;
    }
  }
//  trips2bel.m:46
  public static builtin.Comparison_result_0 __Compare____fargval_0_0()
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = builtin.Comparison_result_0.K0;

      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____fargval_0_0()
  {
    {
      boolean succeeded = true;

      return succeeded;
    }
  }
//  trips2bel.m:13
  public static builtin.Comparison_result_0 __Compare____exptp_0_0(
    trips2bel.Exptp_0 HeadVar__2_2,
    trips2bel.Exptp_0 HeadVar__3_3)
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
  public static boolean __Unify____exptp_0_0(
    trips2bel.Exptp_0 HeadVar__2_1,
    trips2bel.Exptp_0 HeadVar__2_2)
  {
    {
      boolean succeeded = (HeadVar__2_1.MR_value == HeadVar__2_2.MR_value);

      return succeeded;
    }
  }
//  trips2bel.m:60
  public static builtin.Comparison_result_0 __Compare____expr_0_0(
    trips2bel.Expr_0 HeadVar__2_2,
    trips2bel.Expr_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_32 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_33 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_32 == CastY_33);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        if ((HeadVar__2_2.data_tag == 0))
          {
            trips2bel.Cvar_0 V_40_40 = ((trips2bel.Expr_0.Class_3) HeadVar__2_2).F3;
            trips2bel.Concept2_0 V_41_41 = ((trips2bel.Expr_0.Class_3) HeadVar__2_2).F2;
            bool.Bool_0 V_42_42 = ((trips2bel.Expr_0.Class_3) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 0))
              {
                bool.Bool_0 V_7_7 = ((trips2bel.Expr_0.Class_3) HeadVar__3_3).F1;
                trips2bel.Concept2_0 V_8_8 = ((trips2bel.Expr_0.Class_3) HeadVar__3_3).F2;
                trips2bel.Cvar_0 V_9_9 = ((trips2bel.Expr_0.Class_3) HeadVar__3_3).F3;
                builtin.Comparison_result_0 V_10_10 = null;
                int V_46_46 = (int) V_42_42.MR_value;
                int V_47_47 = (int) V_7_7.MR_value;

                {
                  V_10_10 = private_builtin.builtin_compare_int_3_p_0(V_46_46, V_47_47);
                }
                succeeded = (V_10_10.MR_value == builtin.Comparison_result_0.K0.MR_value);
                succeeded = !(succeeded);
                if (succeeded)
                  HeadVar__1_1 = V_10_10;
                else
                  {
                    builtin.Comparison_result_0 V_11_11 = null;

                    {
                      V_11_11 = trips2bel.__Compare____concept2_0_0(V_41_41, V_8_8);
                    }
                    succeeded = (V_11_11.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_11_11;
                    else
                      {
                        HeadVar__1_1 = trips2bel.__Compare____cvar_0_0(V_40_40, V_9_9);
                      }
                  }
              }
            else
              HeadVar__1_1 = builtin.Comparison_result_0.K1;
          }
        else
          {
            trips2bel.Cvar_0 V_43_43 = ((trips2bel.Expr_0.Objprop_3) HeadVar__2_2).F3;
            trips2bel.Cvar_0 V_44_44 = ((trips2bel.Expr_0.Objprop_3) HeadVar__2_2).F2;
            java.lang.String V_45_45 = ((trips2bel.Expr_0.Objprop_3) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 0))
              HeadVar__1_1 = builtin.Comparison_result_0.K2;
            else
              {
                java.lang.String V_27_27 = ((trips2bel.Expr_0.Objprop_3) HeadVar__3_3).F1;
                trips2bel.Cvar_0 V_28_28 = ((trips2bel.Expr_0.Objprop_3) HeadVar__3_3).F2;
                trips2bel.Cvar_0 V_29_29 = ((trips2bel.Expr_0.Objprop_3) HeadVar__3_3).F3;
                builtin.Comparison_result_0 V_30_30 = null;

                {
                  V_30_30 = private_builtin.builtin_compare_string_3_p_0(V_45_45, V_27_27);
                }
                succeeded = (V_30_30.MR_value == builtin.Comparison_result_0.K0.MR_value);
                succeeded = !(succeeded);
                if (succeeded)
                  HeadVar__1_1 = V_30_30;
                else
                  {
                    builtin.Comparison_result_0 V_31_31 = null;

                    {
                      V_31_31 = trips2bel.__Compare____cvar_0_0(V_44_44, V_28_28);
                    }
                    succeeded = (V_31_31.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_31_31;
                    else
                      {
                        HeadVar__1_1 = trips2bel.__Compare____cvar_0_0(V_43_43, V_29_29);
                      }
                  }
              }
          }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____expr_0_0(
    trips2bel.Expr_0 HeadVar__1_1,
    trips2bel.Expr_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_15 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_16 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_15 == CastY_16);
      if (succeeded)
        succeeded = true;
      else
        if ((HeadVar__1_1.data_tag == 0))
          {
            bool.Bool_0 V_3_3 = ((trips2bel.Expr_0.Class_3) HeadVar__1_1).F1;
            trips2bel.Concept2_0 V_4_4 = ((trips2bel.Expr_0.Class_3) HeadVar__1_1).F2;
            trips2bel.Cvar_0 V_5_5 = ((trips2bel.Expr_0.Class_3) HeadVar__1_1).F3;
            bool.Bool_0 V_6_6 = null;
            trips2bel.Concept2_0 V_7_7 = null;
            trips2bel.Cvar_0 V_8_8 = null;

            succeeded = (HeadVar__2_2.data_tag == 0);
            if (succeeded)
              {
                V_6_6 = ((trips2bel.Expr_0.Class_3) HeadVar__2_2).F1;
                V_7_7 = ((trips2bel.Expr_0.Class_3) HeadVar__2_2).F2;
                V_8_8 = ((trips2bel.Expr_0.Class_3) HeadVar__2_2).F3;
                succeeded = (V_3_3.MR_value == V_6_6.MR_value);
                if (succeeded)
                  {
                    {
                      succeeded = trips2bel.__Unify____concept2_0_0(V_4_4, V_7_7);
                    }
                    if (succeeded)
                      {
                        succeeded = trips2bel.__Unify____cvar_0_0(V_5_5, V_8_8);
                      }
                  }
              }
          }
        else
          {
            java.lang.String V_9_9 = ((trips2bel.Expr_0.Objprop_3) HeadVar__1_1).F1;
            trips2bel.Cvar_0 V_10_10 = ((trips2bel.Expr_0.Objprop_3) HeadVar__1_1).F2;
            trips2bel.Cvar_0 V_11_11 = ((trips2bel.Expr_0.Objprop_3) HeadVar__1_1).F3;
            java.lang.String V_12_12 = null;
            trips2bel.Cvar_0 V_13_13 = null;
            trips2bel.Cvar_0 V_14_14 = null;

            succeeded = (HeadVar__2_2.data_tag == 1);
            if (succeeded)
              {
                V_12_12 = ((trips2bel.Expr_0.Objprop_3) HeadVar__2_2).F1;
                V_13_13 = ((trips2bel.Expr_0.Objprop_3) HeadVar__2_2).F2;
                V_14_14 = ((trips2bel.Expr_0.Objprop_3) HeadVar__2_2).F3;
                succeeded = V_9_9.equals(V_12_12);
                if (succeeded)
                  {
                    {
                      succeeded = trips2bel.__Unify____cvar_0_0(V_10_10, V_13_13);
                    }
                    if (succeeded)
                      {
                        succeeded = trips2bel.__Unify____cvar_0_0(V_11_11, V_14_14);
                      }
                  }
              }
          }
      return succeeded;
    }
  }
//  trips2bel.m:47
  public static builtin.Comparison_result_0 __Compare____cxrelval_0_0(
    trips2bel.Cxrelval_0 HeadVar__2_2,
    trips2bel.Cxrelval_0 HeadVar__3_3)
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
  public static boolean __Unify____cxrelval_0_0(
    trips2bel.Cxrelval_0 HeadVar__2_1,
    trips2bel.Cxrelval_0 HeadVar__2_2)
  {
    {
      boolean succeeded = (HeadVar__2_1.MR_value == HeadVar__2_2.MR_value);

      return succeeded;
    }
  }
//  trips2bel.m:87
  private static builtin.Comparison_result_0 __Compare____cvrmap_0_0(
    tree234.Tree234_2 HeadVar__2_2,
    tree234.Tree234_2 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[4]);
      tree234.Tree234_2 Cast_HeadVar1_4 = HeadVar__2_2;
      tree234.Tree234_2 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  private static boolean __Unify____cvrmap_0_0(
    tree234.Tree234_2 HeadVar__1_1,
    tree234.Tree234_2 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[4]);
      tree234.Tree234_2 Cast_HeadVar1_3 = HeadVar__1_1;
      tree234.Tree234_2 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  trips2bel.m:86
  private static builtin.Comparison_result_0 __Compare____cvarmap_0_0(
    tree234.Tree234_2 HeadVar__2_2,
    tree234.Tree234_2 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[3]);
      tree234.Tree234_2 Cast_HeadVar1_4 = HeadVar__2_2;
      tree234.Tree234_2 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  private static boolean __Unify____cvarmap_0_0(
    tree234.Tree234_2 HeadVar__1_1,
    tree234.Tree234_2 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[3]);
      tree234.Tree234_2 Cast_HeadVar1_3 = HeadVar__1_1;
      tree234.Tree234_2 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  trips2bel.m:63
  public static builtin.Comparison_result_0 __Compare____cvar_0_0(
    trips2bel.Cvar_0 HeadVar__2_2,
    trips2bel.Cvar_0 HeadVar__3_3)
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
          java.lang.String V_4_4 = ((trips2bel.Cvar_0) HeadVar__2_2).F1;
          int V_5_5 = ((trips2bel.Cvar_0) HeadVar__2_2).F2;
          int V_6_6 = ((trips2bel.Cvar_0) HeadVar__2_2).F3;
          java.lang.String V_7_7 = ((trips2bel.Cvar_0) HeadVar__3_3).F1;
          int V_8_8 = ((trips2bel.Cvar_0) HeadVar__3_3).F2;
          int V_9_9 = ((trips2bel.Cvar_0) HeadVar__3_3).F3;
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
                V_11_11 = private_builtin.builtin_compare_int_3_p_0(V_5_5, V_8_8);
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
  public static boolean __Unify____cvar_0_0(
    trips2bel.Cvar_0 HeadVar__1_1,
    trips2bel.Cvar_0 HeadVar__2_2)
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
          java.lang.String V_3_3 = ((trips2bel.Cvar_0) HeadVar__1_1).F1;
          int V_4_4 = ((trips2bel.Cvar_0) HeadVar__1_1).F2;
          int V_5_5 = ((trips2bel.Cvar_0) HeadVar__1_1).F3;
          java.lang.String V_6_6 = ((trips2bel.Cvar_0) HeadVar__2_2).F1;
          int V_7_7 = ((trips2bel.Cvar_0) HeadVar__2_2).F2;
          int V_8_8 = ((trips2bel.Cvar_0) HeadVar__2_2).F3;

          succeeded = V_3_3.equals(V_6_6);
          if (succeeded)
            {
              succeeded = (V_4_4 == V_7_7);
              if (succeeded)
                succeeded = (V_5_5 == V_8_8);
            }
        }
      return succeeded;
    }
  }
//  trips2bel.m:44
  public static builtin.Comparison_result_0 __Compare____condval_0_0(
    trips2bel.Condval_0 HeadVar__2_2,
    trips2bel.Condval_0 HeadVar__3_3)
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
  public static boolean __Unify____condval_0_0(
    trips2bel.Condval_0 HeadVar__2_1,
    trips2bel.Condval_0 HeadVar__2_2)
  {
    {
      boolean succeeded = (HeadVar__2_1.MR_value == HeadVar__2_2.MR_value);

      return succeeded;
    }
  }
//  trips2bel.m:23
  public static builtin.Comparison_result_0 __Compare____conceptname_0_0(
    java.lang.String HeadVar__2_2,
    java.lang.String HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      java.lang.String Cast_HeadVar1_4 = HeadVar__2_2;
      java.lang.String Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(Cast_HeadVar1_4, Cast_HeadVar2_5);
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____conceptname_0_0(
    java.lang.String HeadVar__1_1,
    java.lang.String HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      java.lang.String Cast_HeadVar1_3 = HeadVar__1_1;
      java.lang.String Cast_HeadVar2_4 = HeadVar__2_2;

      succeeded = Cast_HeadVar1_3.equals(Cast_HeadVar2_4);
      return succeeded;
    }
  }
//  trips2bel.m:34
  public static builtin.Comparison_result_0 __Compare____concept2_0_0(
    trips2bel.Concept2_0 HeadVar__2_2,
    trips2bel.Concept2_0 HeadVar__3_3)
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
                HeadVar__1_1 = builtin.Comparison_result_0.K2;
                break;
              case 3:
                HeadVar__1_1 = builtin.Comparison_result_0.K2;
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
            break;
          case 2:
            {
              java.lang.String V_59_59 = ((trips2bel.Concept2_0.Super_1) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 1:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 2:
                  {
                    java.lang.String V_10_10 = ((trips2bel.Concept2_0.Super_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_59_59, V_10_10);
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
              java.lang.String V_61_61 = ((trips2bel.Concept2_0.Wordnet_1) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 1:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 2:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 3:
                  {
                    java.lang.String V_22_22 = ((trips2bel.Concept2_0.Wordnet_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_61_61, V_22_22);
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
              java.lang.String V_58_58 = ((trips2bel.Concept2_0.Closedclass_1) HeadVar__2_2).F1;

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
                    java.lang.String V_39_39 = ((trips2bel.Concept2_0.Closedclass_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_58_58, V_39_39);
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
              java.lang.String V_60_60 = ((trips2bel.Concept2_0.Unrecognised_1) HeadVar__2_2).F1;

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
                    java.lang.String V_51_51 = ((trips2bel.Concept2_0.Unrecognised_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_60_60, V_51_51);
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
  public static boolean __Unify____concept2_0_0(
    trips2bel.Concept2_0 HeadVar__1_1,
    trips2bel.Concept2_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_11 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_12 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_11 == CastY_12);
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
            {
              java.lang.String V_3_3 = ((trips2bel.Concept2_0.Super_1) HeadVar__1_1).F1;
              java.lang.String V_4_4 = null;

              succeeded = (HeadVar__2_2.data_tag == 2);
              if (succeeded)
                {
                  V_4_4 = ((trips2bel.Concept2_0.Super_1) HeadVar__2_2).F1;
                  succeeded = V_3_3.equals(V_4_4);
                }
            }
            break;
          case 3:
            {
              java.lang.String V_5_5 = ((trips2bel.Concept2_0.Wordnet_1) HeadVar__1_1).F1;
              java.lang.String V_6_6 = null;

              succeeded = (HeadVar__2_2.data_tag == 3);
              if (succeeded)
                {
                  V_6_6 = ((trips2bel.Concept2_0.Wordnet_1) HeadVar__2_2).F1;
                  succeeded = V_5_5.equals(V_6_6);
                }
            }
            break;
          case 4:
            {
              java.lang.String V_7_7 = ((trips2bel.Concept2_0.Closedclass_1) HeadVar__1_1).F1;
              java.lang.String V_8_8 = null;

              succeeded = (HeadVar__2_2.data_tag == 4);
              if (succeeded)
                {
                  V_8_8 = ((trips2bel.Concept2_0.Closedclass_1) HeadVar__2_2).F1;
                  succeeded = V_7_7.equals(V_8_8);
                }
            }
            break;
          case 5:
            {
              java.lang.String V_9_9 = ((trips2bel.Concept2_0.Unrecognised_1) HeadVar__1_1).F1;
              java.lang.String V_10_10 = null;

              succeeded = (HeadVar__2_2.data_tag == 5);
              if (succeeded)
                {
                  V_10_10 = ((trips2bel.Concept2_0.Unrecognised_1) HeadVar__2_2).F1;
                  succeeded = V_9_9.equals(V_10_10);
                }
            }
            break;
          default: /*NOTREACHED*/
            throw new jmercury.runtime.UnreachableDefault();
        }
      return succeeded;
    }
  }
//  trips2bel.m:88
  private static builtin.Comparison_result_0 __Compare____class_0_0(
    set_ordlist.Set_ordlist_1 HeadVar__2_2,
    set_ordlist.Set_ordlist_1 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[6]);
      set_ordlist.Set_ordlist_1 Cast_HeadVar1_4 = HeadVar__2_2;
      set_ordlist.Set_ordlist_1 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  private static boolean __Unify____class_0_0(
    set_ordlist.Set_ordlist_1 HeadVar__1_1,
    set_ordlist.Set_ordlist_1 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[6]);
      set_ordlist.Set_ordlist_1 Cast_HeadVar1_3 = HeadVar__1_1;
      set_ordlist.Set_ordlist_1 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  trips2bel.m:25
  public static builtin.Comparison_result_0 __Compare____attribute_0_0(
    pair.Pair_2 HeadVar__2_2,
    pair.Pair_2 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[13]);
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
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[13]);
      pair.Pair_2 Cast_HeadVar1_3 = HeadVar__1_1;
      pair.Pair_2 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  trips2bel.m:36
  public static builtin.Comparison_result_0 __Compare____attr2_0_0(
    trips2bel.Attr2_0 HeadVar__2_2,
    trips2bel.Attr2_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_450 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_451 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_450 == CastY_451);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        switch (HeadVar__2_2.data_tag) {
          case 0:
            {
              int V_482_482 = ((trips2bel.Attr2_0.Ref_2) HeadVar__2_2).F2;
              trips2bel.Reftp_0 V_483_483 = ((trips2bel.Attr2_0.Ref_2) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  {
                    trips2bel.Reftp_0 V_6_6 = ((trips2bel.Attr2_0.Ref_2) HeadVar__3_3).F1;
                    int V_7_7 = ((trips2bel.Attr2_0.Ref_2) HeadVar__3_3).F2;
                    builtin.Comparison_result_0 V_8_8 = null;
                    int V_494_494 = (int) V_483_483.MR_value;
                    int V_495_495 = (int) V_6_6.MR_value;

                    {
                      V_8_8 = private_builtin.builtin_compare_int_3_p_0(V_494_494, V_495_495);
                    }
                    succeeded = (V_8_8.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_8_8;
                    else
                      {
                        HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_482_482, V_7_7);
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
                case 10:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 11:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 12:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 1:
            {
              int V_472_472 = ((trips2bel.Attr2_0.Coref_1) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 1:
                  {
                    int V_52_52 = ((trips2bel.Attr2_0.Coref_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_472_472, V_52_52);
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
                case 10:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 11:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 12:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 2:
            {
              list.List_1 V_475_475 = ((trips2bel.Attr2_0.Mods_1) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 1:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 2:
                  {
                    jmercury.runtime.TypeInfo_Struct TypeInfo_463_463 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[10]);
                    list.List_1 V_84_84 = ((trips2bel.Attr2_0.Mods_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_463_463, ((java.lang.Object) (V_475_475)), ((java.lang.Object) (V_84_84)));
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
                case 10:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 11:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 12:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 3:
            {
              trips2bel.Forceval_0 V_473_473 = ((trips2bel.Attr2_0.Force_1) HeadVar__2_2).F1;

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
                    trips2bel.Forceval_0 V_116_116 = ((trips2bel.Attr2_0.Force_1) HeadVar__3_3).F1;
                    int V_488_488 = (int) V_473_473.MR_value;
                    int V_489_489 = (int) V_116_116.MR_value;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_488_488, V_489_489);
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
                case 10:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 11:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 12:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 4:
            {
              trips2bel.Opval_0 V_479_479 = ((trips2bel.Attr2_0.Operator_1) HeadVar__2_2).F1;

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
                    trips2bel.Opval_0 V_148_148 = ((trips2bel.Attr2_0.Operator_1) HeadVar__3_3).F1;
                    int V_490_490 = (int) V_479_479.MR_value;
                    int V_491_491 = (int) V_148_148.MR_value;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_490_490, V_491_491);
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
                case 10:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 11:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 12:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 5:
            {
              trips2bel.Orientval_0 V_480_480 = ((trips2bel.Attr2_0.Orientation_1) HeadVar__2_2).F1;

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
                    trips2bel.Orientval_0 V_180_180 = ((trips2bel.Attr2_0.Orientation_1) HeadVar__3_3).F1;
                    int V_492_492 = (int) V_480_480.MR_value;
                    int V_493_493 = (int) V_180_180.MR_value;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_492_492, V_493_493);
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
                case 10:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 11:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 12:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 6:
            {
              java.lang.String V_481_481 = ((trips2bel.Attr2_0.Proform_1) HeadVar__2_2).F1;

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
                    java.lang.String V_212_212 = ((trips2bel.Attr2_0.Proform_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_481_481, V_212_212);
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
                case 10:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 11:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 12:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 7:
            {
              int V_469_469 = ((trips2bel.Attr2_0.Condition_2) HeadVar__2_2).F2;
              trips2bel.Condval_0 V_470_470 = ((trips2bel.Attr2_0.Condition_2) HeadVar__2_2).F1;

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
                    trips2bel.Condval_0 V_252_252 = ((trips2bel.Attr2_0.Condition_2) HeadVar__3_3).F1;
                    int V_253_253 = ((trips2bel.Attr2_0.Condition_2) HeadVar__3_3).F2;
                    builtin.Comparison_result_0 V_254_254 = null;
                    int V_484_484 = (int) V_470_470.MR_value;
                    int V_485_485 = (int) V_252_252.MR_value;

                    {
                      V_254_254 = private_builtin.builtin_compare_int_3_p_0(V_484_484, V_485_485);
                    }
                    succeeded = (V_254_254.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_254_254;
                    else
                      {
                        HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_469_469, V_253_253);
                      }
                  }
                  break;
                case 8:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 9:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 10:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 11:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 12:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 8:
            {
              int V_467_467 = ((trips2bel.Attr2_0.Acts_2) HeadVar__2_2).F2;
              int V_468_468 = ((trips2bel.Attr2_0.Acts_2) HeadVar__2_2).F1;

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
                    int V_300_300 = ((trips2bel.Attr2_0.Acts_2) HeadVar__3_3).F1;
                    int V_301_301 = ((trips2bel.Attr2_0.Acts_2) HeadVar__3_3).F2;
                    builtin.Comparison_result_0 V_302_302 = null;

                    {
                      V_302_302 = private_builtin.builtin_compare_int_3_p_0(V_468_468, V_300_300);
                    }
                    succeeded = (V_302_302.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_302_302;
                    else
                      {
                        HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_467_467, V_301_301);
                      }
                  }
                  break;
                case 9:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 10:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 11:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 12:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 9:
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
                HeadVar__1_1 = builtin.Comparison_result_0.K0;
                break;
              case 10:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 11:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 12:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              default: /*NOTREACHED*/
                throw new jmercury.runtime.UnreachableDefault();
            }
            break;
          case 10:
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
                HeadVar__1_1 = builtin.Comparison_result_0.K2;
                break;
              case 10:
                HeadVar__1_1 = builtin.Comparison_result_0.K0;
                break;
              case 11:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              case 12:
                HeadVar__1_1 = builtin.Comparison_result_0.K1;
                break;
              default: /*NOTREACHED*/
                throw new jmercury.runtime.UnreachableDefault();
            }
            break;
          case 11:
            {
              trips2bel.Cxrelval_0 V_471_471 = ((trips2bel.Attr2_0.Context_rel_1) HeadVar__2_2).F1;

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
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 10:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 11:
                  {
                    trips2bel.Cxrelval_0 V_402_402 = ((trips2bel.Attr2_0.Context_rel_1) HeadVar__3_3).F1;
                    int V_486_486 = (int) V_471_471.MR_value;
                    int V_487_487 = (int) V_402_402.MR_value;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_486_486, V_487_487);
                    }
                  }
                  break;
                case 12:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
            }
            break;
          case 12:
            {
              int V_476_476 = ((trips2bel.Attr2_0.Name_modifiers_2) HeadVar__2_2).F2;
              int V_477_477 = ((trips2bel.Attr2_0.Name_modifiers_2) HeadVar__2_2).F1;

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
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 10:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 11:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 12:
                  {
                    int V_447_447 = ((trips2bel.Attr2_0.Name_modifiers_2) HeadVar__3_3).F1;
                    int V_448_448 = ((trips2bel.Attr2_0.Name_modifiers_2) HeadVar__3_3).F2;
                    builtin.Comparison_result_0 V_449_449 = null;

                    {
                      V_449_449 = private_builtin.builtin_compare_int_3_p_0(V_477_477, V_447_447);
                    }
                    succeeded = (V_449_449.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_449_449;
                    else
                      {
                        HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_476_476, V_448_448);
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
  public static boolean __Unify____attr2_0_0(
    trips2bel.Attr2_0 HeadVar__1_1,
    trips2bel.Attr2_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_37 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_38 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_37 == CastY_38);
      if (succeeded)
        succeeded = true;
      else
        switch (HeadVar__1_1.data_tag) {
          case 0:
            {
              trips2bel.Reftp_0 V_3_3 = ((trips2bel.Attr2_0.Ref_2) HeadVar__1_1).F1;
              int V_4_4 = ((trips2bel.Attr2_0.Ref_2) HeadVar__1_1).F2;
              trips2bel.Reftp_0 V_5_5 = null;
              int V_6_6 = 0;

              succeeded = (HeadVar__2_2.data_tag == 0);
              if (succeeded)
                {
                  V_5_5 = ((trips2bel.Attr2_0.Ref_2) HeadVar__2_2).F1;
                  V_6_6 = ((trips2bel.Attr2_0.Ref_2) HeadVar__2_2).F2;
                  succeeded = (V_3_3.MR_value == V_5_5.MR_value);
                  if (succeeded)
                    succeeded = (V_4_4 == V_6_6);
                }
            }
            break;
          case 1:
            {
              int V_7_7 = ((trips2bel.Attr2_0.Coref_1) HeadVar__1_1).F1;
              int V_8_8 = 0;

              succeeded = (HeadVar__2_2.data_tag == 1);
              if (succeeded)
                {
                  V_8_8 = ((trips2bel.Attr2_0.Coref_1) HeadVar__2_2).F1;
                  succeeded = (V_7_7 == V_8_8);
                }
            }
            break;
          case 2:
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_39_39 = null;
              list.List_1 V_9_9 = ((trips2bel.Attr2_0.Mods_1) HeadVar__1_1).F1;
              list.List_1 V_10_10 = null;

              succeeded = (HeadVar__2_2.data_tag == 2);
              if (succeeded)
                {
                  V_10_10 = ((trips2bel.Attr2_0.Mods_1) HeadVar__2_2).F1;
                  TypeInfo_39_39 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[10]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_39_39, ((java.lang.Object) (V_9_9)), ((java.lang.Object) (V_10_10)));
                  }
                }
            }
            break;
          case 3:
            {
              trips2bel.Forceval_0 V_11_11 = ((trips2bel.Attr2_0.Force_1) HeadVar__1_1).F1;
              trips2bel.Forceval_0 V_12_12 = null;

              succeeded = (HeadVar__2_2.data_tag == 3);
              if (succeeded)
                {
                  V_12_12 = ((trips2bel.Attr2_0.Force_1) HeadVar__2_2).F1;
                  succeeded = (V_11_11.MR_value == V_12_12.MR_value);
                }
            }
            break;
          case 4:
            {
              trips2bel.Opval_0 V_13_13 = ((trips2bel.Attr2_0.Operator_1) HeadVar__1_1).F1;
              trips2bel.Opval_0 V_14_14 = null;

              succeeded = (HeadVar__2_2.data_tag == 4);
              if (succeeded)
                {
                  V_14_14 = ((trips2bel.Attr2_0.Operator_1) HeadVar__2_2).F1;
                  succeeded = (V_13_13.MR_value == V_14_14.MR_value);
                }
            }
            break;
          case 5:
            {
              trips2bel.Orientval_0 V_15_15 = ((trips2bel.Attr2_0.Orientation_1) HeadVar__1_1).F1;
              trips2bel.Orientval_0 V_16_16 = null;

              succeeded = (HeadVar__2_2.data_tag == 5);
              if (succeeded)
                {
                  V_16_16 = ((trips2bel.Attr2_0.Orientation_1) HeadVar__2_2).F1;
                  succeeded = (V_15_15.MR_value == V_16_16.MR_value);
                }
            }
            break;
          case 6:
            {
              java.lang.String V_17_17 = ((trips2bel.Attr2_0.Proform_1) HeadVar__1_1).F1;
              java.lang.String V_18_18 = null;

              succeeded = (HeadVar__2_2.data_tag == 6);
              if (succeeded)
                {
                  V_18_18 = ((trips2bel.Attr2_0.Proform_1) HeadVar__2_2).F1;
                  succeeded = V_17_17.equals(V_18_18);
                }
            }
            break;
          case 7:
            {
              trips2bel.Condval_0 V_19_19 = ((trips2bel.Attr2_0.Condition_2) HeadVar__1_1).F1;
              int V_20_20 = ((trips2bel.Attr2_0.Condition_2) HeadVar__1_1).F2;
              trips2bel.Condval_0 V_21_21 = null;
              int V_22_22 = 0;

              succeeded = (HeadVar__2_2.data_tag == 7);
              if (succeeded)
                {
                  V_21_21 = ((trips2bel.Attr2_0.Condition_2) HeadVar__2_2).F1;
                  V_22_22 = ((trips2bel.Attr2_0.Condition_2) HeadVar__2_2).F2;
                  succeeded = (V_19_19.MR_value == V_21_21.MR_value);
                  if (succeeded)
                    succeeded = (V_20_20 == V_22_22);
                }
            }
            break;
          case 8:
            {
              int V_23_23 = ((trips2bel.Attr2_0.Acts_2) HeadVar__1_1).F1;
              int V_24_24 = ((trips2bel.Attr2_0.Acts_2) HeadVar__1_1).F2;
              int V_25_25 = 0;
              int V_26_26 = 0;

              succeeded = (HeadVar__2_2.data_tag == 8);
              if (succeeded)
                {
                  V_25_25 = ((trips2bel.Attr2_0.Acts_2) HeadVar__2_2).F1;
                  V_26_26 = ((trips2bel.Attr2_0.Acts_2) HeadVar__2_2).F2;
                  succeeded = (V_23_23 == V_25_25);
                  if (succeeded)
                    succeeded = (V_24_24 == V_26_26);
                }
            }
            break;
          case 9:
            succeeded = (HeadVar__2_2.data_tag == 9);
            break;
          case 10:
            succeeded = (HeadVar__2_2.data_tag == 10);
            break;
          case 11:
            {
              trips2bel.Cxrelval_0 V_31_31 = ((trips2bel.Attr2_0.Context_rel_1) HeadVar__1_1).F1;
              trips2bel.Cxrelval_0 V_32_32 = null;

              succeeded = (HeadVar__2_2.data_tag == 11);
              if (succeeded)
                {
                  V_32_32 = ((trips2bel.Attr2_0.Context_rel_1) HeadVar__2_2).F1;
                  succeeded = (V_31_31.MR_value == V_32_32.MR_value);
                }
            }
            break;
          case 12:
            {
              int V_33_33 = ((trips2bel.Attr2_0.Name_modifiers_2) HeadVar__1_1).F1;
              int V_34_34 = ((trips2bel.Attr2_0.Name_modifiers_2) HeadVar__1_1).F2;
              int V_35_35 = 0;
              int V_36_36 = 0;

              succeeded = (HeadVar__2_2.data_tag == 12);
              if (succeeded)
                {
                  V_35_35 = ((trips2bel.Attr2_0.Name_modifiers_2) HeadVar__2_2).F1;
                  V_36_36 = ((trips2bel.Attr2_0.Name_modifiers_2) HeadVar__2_2).F2;
                  succeeded = (V_33_33 == V_35_35);
                  if (succeeded)
                    succeeded = (V_34_34 == V_36_36);
                }
            }
            break;
          default: /*NOTREACHED*/
            throw new jmercury.runtime.UnreachableDefault();
        }
      return succeeded;
    }
  }
//  trips2bel.m:514
  private static java.lang.String sym_2_f_0(
    trips2bel.Cvar_0 CV_4,
    tree234.Tree234_2 Smap_5)
  {
//  trips2bel.m:518
    {
      boolean succeeded = false;
      java.lang.String Sym_6 = null;
      java.lang.String Str_7 = null;
//  trips2bel.m:516
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_13_13 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_cvar_0);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_14_14 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
      java.lang.Object conv0_Str_7 = null;

      {
        java.lang.Object [] result = map.search_3_p_0(TypeCtorInfo_13_13, TypeCtorInfo_14_14, Smap_5, ((java.lang.Object) (CV_4)));
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        conv0_Str_7 = (java.lang.Object) result[1];
      }
      if (succeeded)
        {
          Str_7 = ((java.lang.String) conv0_Str_7);
          succeeded = true;
        }
//  trips2bel.m:518
      if (succeeded)
//  trips2bel.m:517
        Sym_6 = Str_7;
//  trips2bel.m:518
      else
        {
          int V_10 = ((trips2bel.Cvar_0) CV_4).F3;
          java.lang.String V_11_11 = "V";
          java.lang.String V_12_12 = null;
          java.lang.String V_8_8 = ((trips2bel.Cvar_0) CV_4).F1;
          int V_9_9 = ((trips2bel.Cvar_0) CV_4).F2;

          {
            V_12_12 = string.int_to_string_1_f_0(V_10);
          }
          {
            Sym_6 = string.f_43_43_2_f_0(V_11_11, V_12_12);
          }
        }
      return Sym_6;
    }
//  trips2bel.m:514
  }
//  trips2bel.m:481
  private static java.lang.Object tps_4_p_0_2(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      trips2bel.Vertices_0 conv3_STATE_VARIABLE_Vs_25 = null;

      {
        conv3_STATE_VARIABLE_Vs_25 = trips2bel.tps_4_p_0(((tree234.Tree234_2) ((java.lang.Object[]) closure)[3]), ((java.lang.Integer) wrapper_arg_1).intValue(), ((trips2bel.Vertices_0) wrapper_arg_2));
      }
      wrapper_arg_3 = ((java.lang.Object) (conv3_STATE_VARIABLE_Vs_25));
      return wrapper_arg_3;
    }
  }
//  trips2bel.m:489
  private static java.lang.Object tps_4_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      set_ordlist.Set_ordlist_1 conv1_HeadVar__3_31 = null;

      {
        conv1_HeadVar__3_31 = trips2bel.IntroducedFrom__pred__child_vars__491__1_3_p_0(((trips2bel.Attr2_0) wrapper_arg_1), ((set_ordlist.Set_ordlist_1) wrapper_arg_2));
      }
      wrapper_arg_3 = ((java.lang.Object) (conv1_HeadVar__3_31));
      return wrapper_arg_3;
    }
  }
//  trips2bel.m:467
  private static trips2bel.Vertices_0 tps_4_p_0(
    tree234.Tree234_2 VDM_5,
    int N0_6,
    trips2bel.Vertices_0 STATE_VARIABLE_Vs_0_24)
  {
//  trips2bel.m:469
    {
      boolean succeeded = false;
      trips2bel.Vertices_0 STATE_VARIABLE_Vs_25 = null;
      set_ordlist.Set_ordlist_1 Ws0_8 = ((trips2bel.Vertices_0) STATE_VARIABLE_Vs_0_24).F1;
      set_ordlist.Set_ordlist_1 Gs0_9 = ((trips2bel.Vertices_0) STATE_VARIABLE_Vs_0_24).F2;
      list.List_1 Bs0_10 = ((trips2bel.Vertices_0) STATE_VARIABLE_Vs_0_24).F3;
      list.List_1 Fs0_11 = ((trips2bel.Vertices_0) STATE_VARIABLE_Vs_0_24).F4;
      trips2bel.Vertices_0 STATE_VARIABLE_Vs_26_26 = null;
//  trips2bel.m:474
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_37_37 = null;

//  trips2bel.m:471
      succeeded = (Bs0_10.data_tag == 0);
//  trips2bel.m:473
      if (succeeded)
//  trips2bel.m:472
        STATE_VARIABLE_Vs_26_26 = STATE_VARIABLE_Vs_0_24;
//  trips2bel.m:473
      else
        {
          list.List_1 V_28_28 = (list.List_1) trips2bel.MR_scalar_common_3[0];
          list.List_1 V_29_29 = null;

          {
            V_29_29 = new list.List_1.F_cons_2(((java.lang.Object) (Bs0_10)), Fs0_11);
          }
          {
            STATE_VARIABLE_Vs_26_26 = new trips2bel.Vertices_0(Ws0_8, Gs0_9, V_28_28, V_29_29);
          }
        }
      TypeCtorInfo_37_37 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
//  trips2bel.m:474
      {
        succeeded = set.member_2_p_0(TypeCtorInfo_37_37, java.lang.Integer.valueOf(N0_6), Ws0_8);
      }
//  trips2bel.m:483
      if (succeeded)
//  trips2bel.m:475
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_38_38 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_45_84 = null;
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_46_85 = null;
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_53_92 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_54_93 = null;
          set_ordlist.Set_ordlist_1 Ws1_12 = ((trips2bel.Vertices_0) STATE_VARIABLE_Vs_26_26).F1;
          set_ordlist.Set_ordlist_1 Gs1_13 = ((trips2bel.Vertices_0) STATE_VARIABLE_Vs_26_26).F2;
          list.List_1 Bs1_14 = ((trips2bel.Vertices_0) STATE_VARIABLE_Vs_26_26).F3;
          list.List_1 Fs1_15 = ((trips2bel.Vertices_0) STATE_VARIABLE_Vs_26_26).F4;
          set_ordlist.Set_ordlist_1 Ws2_16 = null;
          set_ordlist.Set_ordlist_1 Gs2_17 = null;
          set_ordlist.Set_ordlist_1 Xs_18 = null;
          set_ordlist.Set_ordlist_1 Ws3_20 = null;
          set_ordlist.Set_ordlist_1 Gs3_21 = null;
          list.List_1 Bs3_22 = null;
          list.List_1 Fs3_23 = null;
          trips2bel.Vertices_0 STATE_VARIABLE_Vs_30_30 = null;
          trips2bel.Vertices_0 STATE_VARIABLE_Vs_33_33 = null;
          set_ordlist.Set_ordlist_1 V_35_35 = null;
          list.List_1 V_36_36 = null;
          list.List_1 As_48 = null;
          trips2bel.Vardef2_0 V_65_65 = null;
          /* closure */ java.lang.Object[] V_66_66 = null;
          set_ordlist.Set_ordlist_1 V_67_67 = null;
//  trips2bel.m:488
          java.lang.Object conv0_V_65_65 = null;
          trips2bel.Tconst_0 V_46_46 = null;
          trips2bel.Concept2_0 V_47_47 = null;
//  trips2bel.m:489
          java.lang.Object conv2_Xs_18 = null;

//  trips2bel.m:475
          {
            Ws2_16 = set.delete_3_p_0(TypeCtorInfo_38_38, java.lang.Integer.valueOf(N0_6), Ws1_12);
          }
//  trips2bel.m:476
          {
            Gs2_17 = set.insert_3_p_0(TypeCtorInfo_38_38, java.lang.Integer.valueOf(N0_6), Gs1_13);
          }
          {
            STATE_VARIABLE_Vs_30_30 = new trips2bel.Vertices_0(Ws2_16, Gs2_17, Bs1_14, Fs1_15);
          }
          TypeCtorInfo_45_84 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
          TypeCtorInfo_46_85 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_vardef2_0);
//  trips2bel.m:488
          {
            conv0_V_65_65 = map.f_84_121_112_101_83_112_101_99_79_102_95_95_112_114_101_100_95_111_114_95_102_117_110_99_95_95_108_111_111_107_117_112_95_95_91_75_32_61_32_105_110_116_93_95_48_95_49_3_p_0(TypeCtorInfo_46_85, VDM_5, N0_6);
          }
          V_65_65 = ((trips2bel.Vardef2_0) conv0_V_65_65);
          V_46_46 = ((trips2bel.Vardef2_0) V_65_65).F1;
          V_47_47 = ((trips2bel.Vardef2_0) V_65_65).F2;
          As_48 = ((trips2bel.Vardef2_0) V_65_65).F3;
//  trips2bel.m:489
          V_66_66 = (/* closure */ java.lang.Object[]) trips2bel.MR_scalar_common_16[1];
          {
            V_67_67 = set.init_0_f_0(TypeCtorInfo_45_84);
          }
          TypeCtorInfo_53_92 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_attr2_0);
          TypeInfo_54_93 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[7]);
          {
            conv2_Xs_18 = list.foldl_4_p_0(TypeCtorInfo_53_92, TypeInfo_54_93, V_66_66, As_48, ((java.lang.Object) (V_67_67)));
          }
          Xs_18 = ((set_ordlist.Set_ordlist_1) conv2_Xs_18);
//  trips2bel.m:478
          {
            succeeded = set.empty_1_p_0(TypeCtorInfo_38_38, Xs_18);
          }
//  trips2bel.m:480
          if (succeeded)
//  trips2bel.m:478
            STATE_VARIABLE_Vs_33_33 = STATE_VARIABLE_Vs_30_30;
//  trips2bel.m:480
          else
            {
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_42_42 = null;
              set_ordlist.Set_ordlist_1 Ns_19 = null;
              /* closure */ java.lang.Object[] V_31_31 = null;
              list.List_1 V_32_32 = null;
//  trips2bel.m:481
              java.lang.Object conv4_STATE_VARIABLE_Vs_33_33 = null;

//  trips2bel.m:480
              {
                Ns_19 = set.intersect_3_p_0(TypeCtorInfo_38_38, Ws1_12, Xs_18);
              }
//  trips2bel.m:481
              {
                V_31_31 = new /* closure */ java.lang.Object[] {((java.lang.Object) (trips2bel.MR_scalar_common_11[0])), ((java.lang.Object) (new AddrOf3_0(0))), java.lang.Integer.valueOf(1), ((java.lang.Object) (VDM_5))};
              }
              {
                V_32_32 = set.to_sorted_list_1_f_0(TypeCtorInfo_38_38, Ns_19);
              }
              TypeCtorInfo_42_42 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_vertices_0);
              {
                conv4_STATE_VARIABLE_Vs_33_33 = list.foldl_4_p_0(TypeCtorInfo_38_38, TypeCtorInfo_42_42, V_31_31, V_32_32, ((java.lang.Object) (STATE_VARIABLE_Vs_30_30)));
              }
              STATE_VARIABLE_Vs_33_33 = ((trips2bel.Vertices_0) conv4_STATE_VARIABLE_Vs_33_33);
//  trips2bel.m:480
            }
//  trips2bel.m:482
          Ws3_20 = ((trips2bel.Vertices_0) STATE_VARIABLE_Vs_33_33).F1;
          Gs3_21 = ((trips2bel.Vertices_0) STATE_VARIABLE_Vs_33_33).F2;
          Bs3_22 = ((trips2bel.Vertices_0) STATE_VARIABLE_Vs_33_33).F3;
          Fs3_23 = ((trips2bel.Vertices_0) STATE_VARIABLE_Vs_33_33).F4;
          {
            V_35_35 = set.delete_2_f_0(TypeCtorInfo_38_38, Gs3_21, java.lang.Integer.valueOf(N0_6));
          }
          {
            V_36_36 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(N0_6), Bs3_22);
          }
          {
            STATE_VARIABLE_Vs_25 = new trips2bel.Vertices_0(Ws3_20, V_35_35, V_36_36, Fs3_23);
          }
//  trips2bel.m:475
        }
//  trips2bel.m:483
      else
//  trips2bel.m:482
        STATE_VARIABLE_Vs_25 = STATE_VARIABLE_Vs_26_26;
//  trips2bel.m:469
      return STATE_VARIABLE_Vs_25;
    }
//  trips2bel.m:467
  }
//  trips2bel.m:416
  private static java.lang.Object [] conv_attr_3_p_0(
    java.lang.String HeadVar__1_1,
    list.List_1 HeadVar__2_2)
  {
//  trips2bel.m:417
    {
      boolean succeeded = (HeadVar__2_2.data_tag == 1);
      trips2bel.Attr2_0 HeadVar__3_3 = null;
      list.List_1 V_257_257 = null;
      trips2bel.Value_0 V_258_258 = null;
      int lo_0 = 0;
      int hi_1 = 0;
      int mid_2 = 0;
      int result_3 = 0;
      int stop_loop_4 = 0;

//  trips2bel.m:453
      if (succeeded)
        {
          V_258_258 = ((trips2bel.Value_0) ((list.List_1.F_cons_2) HeadVar__2_2).F1);
          V_257_257 = ((list.List_1.F_cons_2) HeadVar__2_2).F2;
//  trips2bel.m:417
          /* binary string jump switch */
          succeeded = false;
          lo_0 = 0;
          hi_1 = 10;
          stop_loop_4 = 0;
          do
            {
              mid_2 = ((lo_0 + hi_1) / 2);
              result_3 = (HeadVar__1_1.compareTo(((trips2bel.Vector_common_type_17_0) (MR_vector_common_17[121 + mid_2])).vct_17_f_0)) ;
              if ((result_3 == 0))
                {
                  switch (((trips2bel.Vector_common_type_17_0) (MR_vector_common_17[121 + mid_2])).vct_17_f_1) {
                    case 0:
//  trips2bel.m:453
                      {
                        /* case ":ACTS" */
                        {
                          int V1_211 = 0;
                          int V2_212 = 0;
                          trips2bel.Value_0 V_215_215 = null;
                          list.List_1 V_216_216 = null;

                          succeeded = (V_258_258.data_tag == 0);
                          if (succeeded)
                            {
                              V1_211 = ((trips2bel.Value_0.Var_1) V_258_258).F1;
                              succeeded = (V_257_257.data_tag == 1);
                              if (succeeded)
                                {
                                  V_215_215 = ((trips2bel.Value_0) ((list.List_1.F_cons_2) V_257_257).F1);
                                  V_216_216 = ((list.List_1.F_cons_2) V_257_257).F2;
                                  succeeded = (V_215_215.data_tag == 0);
                                  if (succeeded)
                                    {
                                      V2_212 = ((trips2bel.Value_0.Var_1) V_215_215).F1;
                                      succeeded = (V_216_216.data_tag == 0);
                                      if (succeeded)
                                        {
                                          {
                                            HeadVar__3_3 = new trips2bel.Attr2_0.Acts_2(V1_211, V2_212);
                                          }
                                          succeeded = true;
                                        }
                                    }
                                }
                            }
                        }
                      }
//  trips2bel.m:417
                      break;
                    case 1:
                      {
                        /* case ":CONDITION" */
                        {
                          list.List_1 V_259_259 = null;
                          trips2bel.Value_0 V_260_260 = null;
                          java.lang.String V_264_264 = null;
                          int V_271_271 = 0;

//  trips2bel.m:451
                          succeeded = (V_257_257.data_tag == 1);
                          if (succeeded)
                            {
                              V_260_260 = ((trips2bel.Value_0) ((list.List_1.F_cons_2) V_257_257).F1);
                              V_259_259 = ((list.List_1.F_cons_2) V_257_257).F2;
                              succeeded = (V_258_258.data_tag == 1);
                              if (succeeded)
                                {
                                  V_264_264 = ((trips2bel.Value_0.Con_1) V_258_258).F1;
                                  succeeded = (V_259_259.data_tag == 0);
//  trips2bel.m:417
                                  if (succeeded)
                                    {
//  trips2bel.m:451
                                      succeeded = (V_260_260.data_tag == 0);
                                      if (succeeded)
                                        {
                                          V_271_271 = ((trips2bel.Value_0.Var_1) V_260_260).F1;
//  trips2bel.m:417
                                          if (V_264_264.equals("ONT::IF"))
//  trips2bel.m:451
                                            {
                                              trips2bel.Condval_0 V_203_203 = trips2bel.Condval_0.K0;

                                              {
                                                HeadVar__3_3 = new trips2bel.Attr2_0.Condition_2(V_203_203, V_271_271);
                                              }
                                              succeeded = true;
                                            }
//  trips2bel.m:417
                                          else
                                            if (V_264_264.equals("ONT::UNLESS"))
//  trips2bel.m:452
                                              {
                                                trips2bel.Condval_0 V_210_210 = trips2bel.Condval_0.K1;

                                                {
                                                  HeadVar__3_3 = new trips2bel.Attr2_0.Condition_2(V_210_210, V_271_271);
                                                }
                                                succeeded = true;
                                              }
//  trips2bel.m:417
                                            else
                                              succeeded = false;
//  trips2bel.m:451
                                        }
//  trips2bel.m:417
                                    }
//  trips2bel.m:451
                                }
                            }
//  trips2bel.m:417
                        }
                      }
                      break;
                    case 2:
                      {
                        /* case ":CONTEXT-REL" */
                        {
                          java.lang.String V_265_265 = null;

//  trips2bel.m:456
                          succeeded = (V_257_257.data_tag == 0);
//  trips2bel.m:417
                          if (succeeded)
                            {
//  trips2bel.m:456
                              succeeded = (V_258_258.data_tag == 1);
                              if (succeeded)
                                {
                                  V_265_265 = ((trips2bel.Value_0.Con_1) V_258_258).F1;
//  trips2bel.m:417
                                  if (V_265_265.equals(":DOBJ"))
//  trips2bel.m:457
                                    {
                                      trips2bel.Cxrelval_0 V_232_232 = trips2bel.Cxrelval_0.K1;

                                      HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_23[0];
                                      succeeded = true;
                                    }
//  trips2bel.m:417
                                  else
                                    if (V_265_265.equals(":LSUBJ"))
//  trips2bel.m:458
                                      {
                                        trips2bel.Cxrelval_0 V_236_236 = trips2bel.Cxrelval_0.K2;

                                        HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_23[1];
                                        succeeded = true;
                                      }
//  trips2bel.m:417
                                    else
                                      if (V_265_265.equals("ONT::UTT-FRAG"))
//  trips2bel.m:456
                                        {
                                          trips2bel.Cxrelval_0 V_228_228 = trips2bel.Cxrelval_0.K0;

                                          HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_23[2];
                                          succeeded = true;
                                        }
//  trips2bel.m:417
                                      else
                                        succeeded = false;
//  trips2bel.m:456
                                }
//  trips2bel.m:417
                            }
                        }
                      }
                      break;
                    case 3:
                      {
                        /* case ":FORCE" */
                        {
                          java.lang.String V_266_266 = null;
                          int lo_15 = 0;
                          int hi_16 = 0;
                          int mid_17 = 0;
                          int result_18 = 0;
                          int stop_loop_19 = 0;

//  trips2bel.m:425
                          succeeded = (V_257_257.data_tag == 0);
//  trips2bel.m:417
                          if (succeeded)
                            {
//  trips2bel.m:425
                              succeeded = (V_258_258.data_tag == 1);
                              if (succeeded)
                                {
                                  V_266_266 = ((trips2bel.Value_0.Con_1) V_258_258).F1;
//  trips2bel.m:417
                                  /* binary string jump switch */
                                  succeeded = false;
                                  lo_15 = 0;
                                  hi_16 = 7;
                                  stop_loop_19 = 0;
                                  do
                                    {
                                      mid_17 = ((lo_15 + hi_16) / 2);
                                      result_18 = (V_266_266.compareTo(((trips2bel.Vector_common_type_17_0) (MR_vector_common_17[113 + mid_17])).vct_17_f_0)) ;
                                      if ((result_18 == 0))
                                        {
                                          switch (((trips2bel.Vector_common_type_17_0) (MR_vector_common_17[113 + mid_17])).vct_17_f_1) {
                                            case 0:
//  trips2bel.m:425
                                              {
                                                /* case "ONT::FALSE" */
                                                {
                                                  trips2bel.Forceval_0 V_97_97 = trips2bel.Forceval_0.K1;

                                                  HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_22[7];
                                                  succeeded = true;
                                                }
                                              }
//  trips2bel.m:417
                                              break;
                                            case 1:
//  trips2bel.m:426
                                              {
                                                /* case "ONT::FUTURE" */
                                                {
                                                  trips2bel.Forceval_0 V_101_101 = trips2bel.Forceval_0.K4;

                                                  HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_22[6];
                                                  succeeded = true;
                                                }
                                              }
//  trips2bel.m:417
                                              break;
                                            case 2:
//  trips2bel.m:427
                                              {
                                                /* case "ONT::FUTURENOT" */
                                                {
                                                  trips2bel.Forceval_0 V_105_105 = trips2bel.Forceval_0.K5;

                                                  HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_22[5];
                                                  succeeded = true;
                                                }
                                              }
//  trips2bel.m:417
                                              break;
                                            case 3:
//  trips2bel.m:428
                                              {
                                                /* case "ONT::IMPOSSIBLE" */
                                                {
                                                  trips2bel.Forceval_0 V_109_109 = trips2bel.Forceval_0.K3;

                                                  HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_22[4];
                                                  succeeded = true;
                                                }
                                              }
//  trips2bel.m:417
                                              break;
                                            case 4:
//  trips2bel.m:429
                                              {
                                                /* case "ONT::POSSIBLE" */
                                                {
                                                  trips2bel.Forceval_0 V_113_113 = trips2bel.Forceval_0.K2;

                                                  HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_22[3];
                                                  succeeded = true;
                                                }
                                              }
//  trips2bel.m:417
                                              break;
                                            case 5:
//  trips2bel.m:432
                                              {
                                                /* case "ONT::PROHIBITED" */
                                                {
                                                  trips2bel.Forceval_0 V_125_125 = trips2bel.Forceval_0.K7;

                                                  HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_22[2];
                                                  succeeded = true;
                                                }
                                              }
//  trips2bel.m:417
                                              break;
                                            case 6:
//  trips2bel.m:431
                                              {
                                                /* case "ONT::REQUIRED" */
                                                {
                                                  trips2bel.Forceval_0 V_121_121 = trips2bel.Forceval_0.K6;

                                                  HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_22[1];
                                                  succeeded = true;
                                                }
                                              }
//  trips2bel.m:417
                                              break;
                                            case 7:
//  trips2bel.m:430
                                              {
                                                /* case "ONT::TRUE" */
                                                {
                                                  trips2bel.Forceval_0 V_117_117 = trips2bel.Forceval_0.K0;

                                                  HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_22[0];
                                                  succeeded = true;
                                                }
                                              }
//  trips2bel.m:417
                                              break;
                                            default: /*NOTREACHED*/
                                              throw new jmercury.runtime.UnreachableDefault();
                                          }
                                          stop_loop_19 = 1;
                                        }
                                      else
                                        if ((result_18 < 0))
                                          hi_16 = (mid_17 - 1);
                                        else
                                          lo_15 = (mid_17 + 1);
                                    }
                                  while (((stop_loop_19 == 0) && (lo_15 <= hi_16)));
//  trips2bel.m:425
                                }
//  trips2bel.m:417
                            }
                        }
                      }
                      break;
                    case 4:
//  trips2bel.m:455
                      {
                        /* case ":FUNCTN-ARG" */
                        {
                          java.lang.String V_222_222 = null;

                          succeeded = (V_258_258.data_tag == 1);
                          if (succeeded)
                            {
                              V_222_222 = ((trips2bel.Value_0.Con_1) V_258_258).F1;
                              succeeded = V_222_222.equals("ONT::OF");
                              if (succeeded)
                                {
                                  succeeded = (V_257_257.data_tag == 0);
                                  if (succeeded)
                                    {
                                      private_builtin.dummy_var = trips2bel.Fargval_0.K0;
                                      HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_21[0];
                                      succeeded = true;
                                    }
                                }
                            }
                        }
                      }
//  trips2bel.m:417
                      break;
                    case 5:
                      {
                        /* case ":MODS" */
                        {
                          int V_270_270 = 0;

                          succeeded = (V_258_258.data_tag == 0);
                          if (succeeded)
                            {
                              V_270_270 = ((trips2bel.Value_0.Var_1) V_258_258).F1;
                              if ((V_257_257.data_tag == 0))
                                {
                                  list.List_1 V_7_7 = null;
                                  list.List_1 V_8_8 = (list.List_1) trips2bel.MR_scalar_common_3[0];

                                  {
                                    V_7_7 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(V_270_270), V_8_8);
                                  }
                                  {
                                    HeadVar__3_3 = new trips2bel.Attr2_0.Mods_1(V_7_7);
                                  }
                                  succeeded = true;
                                }
                              else
                                {
                                  list.List_1 V_261_261 = ((list.List_1.F_cons_2) V_257_257).F2;
                                  trips2bel.Value_0 V_262_262 = ((trips2bel.Value_0) ((list.List_1.F_cons_2) V_257_257).F1);
                                  int V_275_275 = 0;

//  trips2bel.m:418
                                  succeeded = (V_262_262.data_tag == 0);
                                  if (succeeded)
                                    {
                                      V_275_275 = ((trips2bel.Value_0.Var_1) V_262_262).F1;
//  trips2bel.m:417
                                      if ((V_261_261.data_tag == 0))
//  trips2bel.m:418
                                        {
                                          list.List_1 V_15_15 = null;
                                          list.List_1 V_16_16 = null;
                                          list.List_1 V_17_17 = (list.List_1) trips2bel.MR_scalar_common_3[0];

                                          {
                                            V_16_16 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(V_275_275), V_17_17);
                                          }
                                          {
                                            V_15_15 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(V_270_270), V_16_16);
                                          }
                                          {
                                            HeadVar__3_3 = new trips2bel.Attr2_0.Mods_1(V_15_15);
                                          }
                                          succeeded = true;
                                        }
//  trips2bel.m:417
                                      else
                                        {
                                          list.List_1 V_272_272 = ((list.List_1.F_cons_2) V_261_261).F2;
                                          trips2bel.Value_0 V_273_273 = ((trips2bel.Value_0) ((list.List_1.F_cons_2) V_261_261).F1);
                                          int V_279_279 = 0;

//  trips2bel.m:419
                                          succeeded = (V_273_273.data_tag == 0);
                                          if (succeeded)
                                            {
                                              V_279_279 = ((trips2bel.Value_0.Var_1) V_273_273).F1;
//  trips2bel.m:417
                                              if ((V_272_272.data_tag == 0))
//  trips2bel.m:419
                                                {
                                                  list.List_1 V_27_27 = null;
                                                  list.List_1 V_28_28 = null;
                                                  list.List_1 V_29_29 = null;
                                                  list.List_1 V_30_30 = (list.List_1) trips2bel.MR_scalar_common_3[0];

                                                  {
                                                    V_29_29 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(V_279_279), V_30_30);
                                                  }
                                                  {
                                                    V_28_28 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(V_275_275), V_29_29);
                                                  }
                                                  {
                                                    V_27_27 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(V_270_270), V_28_28);
                                                  }
                                                  {
                                                    HeadVar__3_3 = new trips2bel.Attr2_0.Mods_1(V_27_27);
                                                  }
                                                  succeeded = true;
                                                }
//  trips2bel.m:417
                                              else
                                                {
                                                  list.List_1 V_276_276 = ((list.List_1.F_cons_2) V_272_272).F2;
                                                  trips2bel.Value_0 V_277_277 = ((trips2bel.Value_0) ((list.List_1.F_cons_2) V_272_272).F1);
                                                  int V_283_283 = 0;

//  trips2bel.m:420
                                                  succeeded = (V_277_277.data_tag == 0);
                                                  if (succeeded)
                                                    {
                                                      V_283_283 = ((trips2bel.Value_0.Var_1) V_277_277).F1;
//  trips2bel.m:417
                                                      if ((V_276_276.data_tag == 0))
//  trips2bel.m:420
                                                        {
                                                          list.List_1 V_43_43 = null;
                                                          list.List_1 V_44_44 = null;
                                                          list.List_1 V_45_45 = null;
                                                          list.List_1 V_46_46 = null;
                                                          list.List_1 V_47_47 = (list.List_1) trips2bel.MR_scalar_common_3[0];

                                                          {
                                                            V_46_46 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(V_283_283), V_47_47);
                                                          }
                                                          {
                                                            V_45_45 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(V_279_279), V_46_46);
                                                          }
                                                          {
                                                            V_44_44 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(V_275_275), V_45_45);
                                                          }
                                                          {
                                                            V_43_43 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(V_270_270), V_44_44);
                                                          }
                                                          {
                                                            HeadVar__3_3 = new trips2bel.Attr2_0.Mods_1(V_43_43);
                                                          }
                                                          succeeded = true;
                                                        }
//  trips2bel.m:417
                                                      else
                                                        {
                                                          list.List_1 V_280_280 = ((list.List_1.F_cons_2) V_276_276).F2;
                                                          trips2bel.Value_0 V_281_281 = ((trips2bel.Value_0) ((list.List_1.F_cons_2) V_276_276).F1);
                                                          int V_284_284 = 0;

//  trips2bel.m:421
                                                          succeeded = (V_281_281.data_tag == 0);
                                                          if (succeeded)
                                                            {
                                                              V_284_284 = ((trips2bel.Value_0.Var_1) V_281_281).F1;
//  trips2bel.m:417
                                                              if ((V_280_280.data_tag == 0))
//  trips2bel.m:421
                                                                {
                                                                  list.List_1 V_63_63 = null;
                                                                  list.List_1 V_64_64 = null;
                                                                  list.List_1 V_65_65 = null;
                                                                  list.List_1 V_66_66 = null;
                                                                  list.List_1 V_67_67 = null;
                                                                  list.List_1 V_68_68 = (list.List_1) trips2bel.MR_scalar_common_3[0];

//  trips2bel.m:422
                                                                  {
                                                                    V_67_67 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(V_284_284), V_68_68);
                                                                  }
                                                                  {
                                                                    V_66_66 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(V_283_283), V_67_67);
                                                                  }
                                                                  {
                                                                    V_65_65 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(V_279_279), V_66_66);
                                                                  }
                                                                  {
                                                                    V_64_64 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(V_275_275), V_65_65);
                                                                  }
                                                                  {
                                                                    V_63_63 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(V_270_270), V_64_64);
                                                                  }
//  trips2bel.m:421
                                                                  {
                                                                    HeadVar__3_3 = new trips2bel.Attr2_0.Mods_1(V_63_63);
                                                                  }
                                                                  succeeded = true;
                                                                }
//  trips2bel.m:417
                                                              else
//  trips2bel.m:423
                                                                {
                                                                  int V6_74 = 0;
                                                                  trips2bel.Value_0 V_85_85 = ((trips2bel.Value_0) ((list.List_1.F_cons_2) V_280_280).F1);
                                                                  list.List_1 V_86_86 = ((list.List_1.F_cons_2) V_280_280).F2;
                                                                  list.List_1 V_87_87 = null;
                                                                  list.List_1 V_88_88 = null;
                                                                  list.List_1 V_89_89 = null;
                                                                  list.List_1 V_90_90 = null;
                                                                  list.List_1 V_91_91 = null;
                                                                  list.List_1 V_92_92 = null;
                                                                  list.List_1 V_93_93 = null;

                                                                  succeeded = (V_85_85.data_tag == 0);
                                                                  if (succeeded)
                                                                    {
                                                                      V6_74 = ((trips2bel.Value_0.Var_1) V_85_85).F1;
                                                                      succeeded = (V_86_86.data_tag == 0);
                                                                      if (succeeded)
                                                                        {
//  trips2bel.m:424
                                                                          V_93_93 = (list.List_1) trips2bel.MR_scalar_common_3[0];
                                                                          {
                                                                            V_92_92 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(V6_74), V_93_93);
                                                                          }
                                                                          {
                                                                            V_91_91 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(V_284_284), V_92_92);
                                                                          }
                                                                          {
                                                                            V_90_90 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(V_283_283), V_91_91);
                                                                          }
                                                                          {
                                                                            V_89_89 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(V_279_279), V_90_90);
                                                                          }
                                                                          {
                                                                            V_88_88 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(V_275_275), V_89_89);
                                                                          }
                                                                          {
                                                                            V_87_87 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(V_270_270), V_88_88);
                                                                          }
//  trips2bel.m:423
                                                                          {
                                                                            HeadVar__3_3 = new trips2bel.Attr2_0.Mods_1(V_87_87);
                                                                          }
                                                                          succeeded = true;
                                                                        }
                                                                    }
                                                                }
//  trips2bel.m:421
                                                            }
//  trips2bel.m:417
                                                        }
//  trips2bel.m:420
                                                    }
//  trips2bel.m:417
                                                }
//  trips2bel.m:419
                                            }
//  trips2bel.m:417
                                        }
//  trips2bel.m:418
                                    }
//  trips2bel.m:417
                                }
                            }
                        }
                      }
                      break;
                    case 6:
//  trips2bel.m:459
                      {
                        /* case ":NAME-MODIFIERS" */
                        {
                          int V1_237 = 0;
                          int V2_238 = 0;
                          trips2bel.Value_0 V_241_241 = null;
                          list.List_1 V_242_242 = null;

                          succeeded = (V_258_258.data_tag == 0);
                          if (succeeded)
                            {
                              V1_237 = ((trips2bel.Value_0.Var_1) V_258_258).F1;
                              succeeded = (V_257_257.data_tag == 1);
                              if (succeeded)
                                {
                                  V_241_241 = ((trips2bel.Value_0) ((list.List_1.F_cons_2) V_257_257).F1);
                                  V_242_242 = ((list.List_1.F_cons_2) V_257_257).F2;
                                  succeeded = (V_241_241.data_tag == 0);
                                  if (succeeded)
                                    {
                                      V2_238 = ((trips2bel.Value_0.Var_1) V_241_241).F1;
                                      succeeded = (V_242_242.data_tag == 0);
                                      if (succeeded)
                                        {
                                          {
                                            HeadVar__3_3 = new trips2bel.Attr2_0.Name_modifiers_2(V1_237, V2_238);
                                          }
                                          succeeded = true;
                                        }
                                    }
                                }
                            }
                        }
                      }
//  trips2bel.m:417
                      break;
                    case 7:
//  trips2bel.m:454
                      {
                        /* case ":NEGATION" */
                        {
                          java.lang.String V_218_218 = null;

                          succeeded = (V_258_258.data_tag == 1);
                          if (succeeded)
                            {
                              V_218_218 = ((trips2bel.Value_0.Con_1) V_258_258).F1;
                              succeeded = V_218_218.equals("+");
                              if (succeeded)
                                {
                                  succeeded = (V_257_257.data_tag == 0);
                                  if (succeeded)
                                    {
                                      private_builtin.dummy_var = trips2bel.Negval_0.K0;
                                      HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_20[0];
                                      succeeded = true;
                                    }
                                }
                            }
                        }
                      }
//  trips2bel.m:417
                      break;
                    case 8:
                      {
                        /* case ":OPERATOR" */
                        {
                          java.lang.String V_268_268 = null;
                          int lo_10 = 0;
                          int hi_11 = 0;
                          int mid_12 = 0;
                          int result_13 = 0;
                          int stop_loop_14 = 0;

//  trips2bel.m:433
                          succeeded = (V_257_257.data_tag == 0);
//  trips2bel.m:417
                          if (succeeded)
                            {
//  trips2bel.m:433
                              succeeded = (V_258_258.data_tag == 1);
                              if (succeeded)
                                {
                                  V_268_268 = ((trips2bel.Value_0.Con_1) V_258_258).F1;
//  trips2bel.m:417
                                  /* binary string jump switch */
                                  succeeded = false;
                                  lo_10 = 0;
                                  hi_11 = 7;
                                  stop_loop_14 = 0;
                                  do
                                    {
                                      mid_12 = ((lo_10 + hi_11) / 2);
                                      result_13 = (V_268_268.compareTo(((trips2bel.Vector_common_type_17_0) (MR_vector_common_17[105 + mid_12])).vct_17_f_0)) ;
                                      if ((result_13 == 0))
                                        {
                                          switch (((trips2bel.Vector_common_type_17_0) (MR_vector_common_17[105 + mid_12])).vct_17_f_1) {
                                            case 0:
//  trips2bel.m:433
                                              {
                                                /* case "ONT::AND" */
                                                {
                                                  trips2bel.Opval_0 V_129_129 = trips2bel.Opval_0.K0;

                                                  HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_19[7];
                                                  succeeded = true;
                                                }
                                              }
//  trips2bel.m:417
                                              break;
                                            case 1:
//  trips2bel.m:439
                                              {
                                                /* case "ONT::BOTH" */
                                                {
                                                  trips2bel.Opval_0 V_153_153 = trips2bel.Opval_0.K6;

                                                  HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_19[6];
                                                  succeeded = true;
                                                }
                                              }
//  trips2bel.m:417
                                              break;
                                            case 2:
//  trips2bel.m:434
                                              {
                                                /* case "ONT::BUT" */
                                                {
                                                  trips2bel.Opval_0 V_133_133 = trips2bel.Opval_0.K1;

                                                  HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_19[5];
                                                  succeeded = true;
                                                }
                                              }
//  trips2bel.m:417
                                              break;
                                            case 3:
//  trips2bel.m:438
                                              {
                                                /* case "ONT::EITHER" */
                                                {
                                                  trips2bel.Opval_0 V_149_149 = trips2bel.Opval_0.K5;

                                                  HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_19[4];
                                                  succeeded = true;
                                                }
                                              }
//  trips2bel.m:417
                                              break;
                                            case 4:
//  trips2bel.m:437
                                              {
                                                /* case "ONT::MEMBERS" */
                                                {
                                                  trips2bel.Opval_0 V_145_145 = trips2bel.Opval_0.K4;

                                                  HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_19[3];
                                                  succeeded = true;
                                                }
                                              }
//  trips2bel.m:417
                                              break;
                                            case 5:
//  trips2bel.m:436
                                              {
                                                /* case "ONT::ONE-OF" */
                                                {
                                                  trips2bel.Opval_0 V_141_141 = trips2bel.Opval_0.K3;

                                                  HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_19[2];
                                                  succeeded = true;
                                                }
                                              }
//  trips2bel.m:417
                                              break;
                                            case 6:
//  trips2bel.m:435
                                              {
                                                /* case "ONT::OR" */
                                                {
                                                  trips2bel.Opval_0 V_137_137 = trips2bel.Opval_0.K2;

                                                  HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_19[1];
                                                  succeeded = true;
                                                }
                                              }
//  trips2bel.m:417
                                              break;
                                            case 7:
//  trips2bel.m:440
                                              {
                                                /* case "ONT::PLUS" */
                                                {
                                                  trips2bel.Opval_0 V_157_157 = trips2bel.Opval_0.K7;

                                                  HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_19[0];
                                                  succeeded = true;
                                                }
                                              }
//  trips2bel.m:417
                                              break;
                                            default: /*NOTREACHED*/
                                              throw new jmercury.runtime.UnreachableDefault();
                                          }
                                          stop_loop_14 = 1;
                                        }
                                      else
                                        if ((result_13 < 0))
                                          hi_11 = (mid_12 - 1);
                                        else
                                          lo_10 = (mid_12 + 1);
                                    }
                                  while (((stop_loop_14 == 0) && (lo_10 <= hi_11)));
//  trips2bel.m:433
                                }
//  trips2bel.m:417
                            }
                        }
                      }
                      break;
                    case 9:
                      {
                        /* case ":ORIENTATION" */
                        {
                          java.lang.String V_269_269 = null;
                          int lo_5 = 0;
                          int hi_6 = 0;
                          int mid_7 = 0;
                          int result_8 = 0;
                          int stop_loop_9 = 0;

//  trips2bel.m:441
                          succeeded = (V_257_257.data_tag == 0);
//  trips2bel.m:417
                          if (succeeded)
                            {
//  trips2bel.m:441
                              succeeded = (V_258_258.data_tag == 1);
                              if (succeeded)
                                {
                                  V_269_269 = ((trips2bel.Value_0.Con_1) V_258_258).F1;
//  trips2bel.m:417
                                  /* binary string jump switch */
                                  succeeded = false;
                                  lo_5 = 0;
                                  hi_6 = 4;
                                  stop_loop_9 = 0;
                                  do
                                    {
                                      mid_7 = ((lo_5 + hi_6) / 2);
                                      result_8 = (V_269_269.compareTo(((trips2bel.Vector_common_type_17_0) (MR_vector_common_17[100 + mid_7])).vct_17_f_0)) ;
                                      if ((result_8 == 0))
                                        {
                                          switch (((trips2bel.Vector_common_type_17_0) (MR_vector_common_17[100 + mid_7])).vct_17_f_1) {
                                            case 0:
//  trips2bel.m:444
                                              {
                                                /* case "ONT::LESS" */
                                                {
                                                  trips2bel.Orientval_0 V_173_173 = trips2bel.Orientval_0.K3;

                                                  HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_18[4];
                                                  succeeded = true;
                                                }
                                              }
//  trips2bel.m:417
                                              break;
                                            case 1:
//  trips2bel.m:443
                                              {
                                                /* case "ONT::MORE" */
                                                {
                                                  trips2bel.Orientval_0 V_169_169 = trips2bel.Orientval_0.K2;

                                                  HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_18[3];
                                                  succeeded = true;
                                                }
                                              }
//  trips2bel.m:417
                                              break;
                                            case 2:
//  trips2bel.m:442
                                              {
                                                /* case "ONT::NEG" */
                                                {
                                                  trips2bel.Orientval_0 V_165_165 = trips2bel.Orientval_0.K1;

                                                  HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_18[2];
                                                  succeeded = true;
                                                }
                                              }
//  trips2bel.m:417
                                              break;
                                            case 3:
//  trips2bel.m:445
                                              {
                                                /* case "ONT::NEUTRAL" */
                                                {
                                                  trips2bel.Orientval_0 V_177_177 = trips2bel.Orientval_0.K4;

                                                  HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_18[1];
                                                  succeeded = true;
                                                }
                                              }
//  trips2bel.m:417
                                              break;
                                            case 4:
//  trips2bel.m:441
                                              {
                                                /* case "ONT::POS" */
                                                {
                                                  trips2bel.Orientval_0 V_161_161 = trips2bel.Orientval_0.K0;

                                                  HeadVar__3_3 = (trips2bel.Attr2_0) trips2bel.MR_scalar_common_18[0];
                                                  succeeded = true;
                                                }
                                              }
//  trips2bel.m:417
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
//  trips2bel.m:441
                                }
//  trips2bel.m:417
                            }
                        }
                      }
                      break;
                    case 10:
                      {
                        /* case ":PROFORM" */
                        {
                          java.lang.String V_263_263 = null;

//  trips2bel.m:446
                          succeeded = (V_258_258.data_tag == 1);
                          if (succeeded)
                            {
                              V_263_263 = ((trips2bel.Value_0.Con_1) V_258_258).F1;
//  trips2bel.m:417
                              if ((V_257_257.data_tag == 0))
//  trips2bel.m:446
                                {
                                  java.lang.String Str_179 = null;
//  trips2bel.m:447
                                  java.lang.String S_180 = null;
                                  java.lang.String V_183_183 = "ONT::";

                                  {
                                    java.lang.Object [] result = string.remove_prefix_3_p_0(V_183_183, V_263_263);
                                    succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                                    S_180 = (java.lang.String) result[1];
                                  }
                                  if (succeeded)
                                    Str_179 = S_180;
                                  else
                                    Str_179 = V_263_263;
//  trips2bel.m:446
                                  {
                                    HeadVar__3_3 = new trips2bel.Attr2_0.Proform_1(Str_179);
                                  }
                                  succeeded = true;
                                }
//  trips2bel.m:417
                              else
//  trips2bel.m:448
                                {
                                  java.lang.String C2_185 = null;
                                  java.lang.String Str1_186 = null;
                                  java.lang.String Str2_187 = null;
                                  trips2bel.Value_0 V_192_192 = ((trips2bel.Value_0) ((list.List_1.F_cons_2) V_257_257).F1);
                                  list.List_1 V_193_193 = ((list.List_1.F_cons_2) V_257_257).F2;
                                  java.lang.String V_194_194 = null;
//  trips2bel.m:449
                                  java.lang.String S1_188 = null;
                                  java.lang.String V_195_195 = null;
//  trips2bel.m:450
                                  java.lang.String S2_189 = null;
                                  java.lang.String V_196_196 = null;

//  trips2bel.m:448
                                  succeeded = (V_192_192.data_tag == 1);
                                  if (succeeded)
                                    {
                                      C2_185 = ((trips2bel.Value_0.Con_1) V_192_192).F1;
                                      succeeded = (V_193_193.data_tag == 0);
                                      if (succeeded)
                                        {
//  trips2bel.m:449
                                          V_195_195 = "ONT::";
                                          {
                                            java.lang.Object [] result = string.remove_prefix_3_p_0(V_195_195, V_263_263);
                                            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                                            S1_188 = (java.lang.String) result[1];
                                          }
                                          if (succeeded)
                                            Str1_186 = S1_188;
                                          else
                                            Str1_186 = V_263_263;
//  trips2bel.m:450
                                          V_196_196 = "ONT::";
                                          {
                                            java.lang.Object [] result = string.remove_prefix_3_p_0(V_196_196, C2_185);
                                            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                                            S2_189 = (java.lang.String) result[1];
                                          }
                                          if (succeeded)
                                            Str2_187 = S2_189;
                                          else
                                            Str2_187 = C2_185;
//  trips2bel.m:448
                                          {
                                            V_194_194 = string.f_43_43_2_f_0(Str1_186, Str2_187);
                                          }
                                          {
                                            HeadVar__3_3 = new trips2bel.Attr2_0.Proform_1(V_194_194);
                                          }
                                          succeeded = true;
                                        }
                                    }
                                }
//  trips2bel.m:446
                            }
//  trips2bel.m:417
                        }
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
//  trips2bel.m:453
        }
//  trips2bel.m:417
return new java.lang.Object[] {
        java.lang.Boolean.valueOf(succeeded),
        ((java.lang.Object) (HeadVar__3_3))
      };
    }
//  trips2bel.m:416
  }
//  trips2bel.m:297
  private static java.lang.Object [] conv_attr_7_p_0(
    java.lang.String F_8,
    int Var_9,
    pair.Pair_2 HeadVar__3_3,
    list.List_1 STATE_VARIABLE_As_0_17,
    list.List_1 STATE_VARIABLE_Es_0_19)
  {
//  trips2bel.m:299
    {
      boolean succeeded = false;
      list.List_1 STATE_VARIABLE_As_18 = null;
      list.List_1 STATE_VARIABLE_Es_20 = null;
      java.lang.String R_10 = ((java.lang.String) ((pair.Pair_2) HeadVar__3_3).F1);
      list.List_1 Vs_11 = ((list.List_1) ((pair.Pair_2) HeadVar__3_3).F2);
//  trips2bel.m:313
      int lo_0 = 0;
      int hi_1 = 0;
      int mid_2 = 0;
      int result_3 = 0;
      int stop_loop_4 = 0;

      /* binary string jump switch */
      succeeded = false;
      lo_0 = 0;
      hi_1 = 40;
      stop_loop_4 = 0;
      do
        {
          mid_2 = ((lo_0 + hi_1) / 2);
          result_3 = (R_10.compareTo(((trips2bel.Vector_common_type_17_0) (MR_vector_common_17[0 + mid_2])).vct_17_f_0)) ;
          if ((result_3 == 0))
            {
              switch (((trips2bel.Vector_common_type_17_0) (MR_vector_common_17[0 + mid_2])).vct_17_f_1) {
                case 0:
//  trips2bel.m:351
                  {
                    /* case ":AGE" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 1:
//  trips2bel.m:340
                  {
                    /* case ":AM-PM" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 2:
//  trips2bel.m:318
                  {
                    /* case ":AMOUNT" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 3:
//  trips2bel.m:328
                  {
                    /* case ":CENTURY" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 4:
//  trips2bel.m:350
                  {
                    /* case ":CONTENT" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 5:
//  trips2bel.m:317
                  {
                    /* case ":COST" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 6:
//  trips2bel.m:322
                  {
                    /* case ":DAY" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 7:
//  trips2bel.m:323
                  {
                    /* case ":DAY-OF-WEEK" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 8:
//  trips2bel.m:327
                  {
                    /* case ":DECADE" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 9:
//  trips2bel.m:348
                  {
                    /* case ":DEGREE" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 10:
//  trips2bel.m:324
                  {
                    /* case ":DOW" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 11:
//  trips2bel.m:345
                  {
                    /* case ":DURATION" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 12:
//  trips2bel.m:314
                  {
                    /* case ":END" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 13:
//  trips2bel.m:334
                  {
                    /* case ":EXTENT" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 14:
//  trips2bel.m:332
                  {
                    /* case ":FREQUENCY" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 15:
//  trips2bel.m:321
                  {
                    /* case ":HOUR" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 16:
//  trips2bel.m:344
                  {
                    /* case ":INTENSITY" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 17:
//  trips2bel.m:316
                  {
                    /* case ":MAX" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 18:
//  trips2bel.m:315
                  {
                    /* case ":MIN" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 19:
//  trips2bel.m:320
                  {
                    /* case ":MINUTE" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 20:
//  trips2bel.m:325
                  {
                    /* case ":MONTH" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 21:
//  trips2bel.m:319
                  {
                    /* case ":NAME-OF" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 22:
//  trips2bel.m:335
                  {
                    /* case ":NUMBER" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 23:
//  trips2bel.m:347
                  {
                    /* case ":OVER-PERIOD" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 24:
//  trips2bel.m:353
                  {
                    /* case ":PHASE" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 25:
//  trips2bel.m:349
                  {
                    /* case ":PUNCTYPE" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 26:
//  trips2bel.m:330
                  {
                    /* case ":QUAN" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 27:
//  trips2bel.m:331
                  {
                    /* case ":QUANTITY" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 28:
//  trips2bel.m:343
                  {
                    /* case ":RANGE" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 29:
//  trips2bel.m:346
                  {
                    /* case ":REFERS-TO" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 30:
//  trips2bel.m:333
                  {
                    /* case ":REPEATS" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 31:
//  trips2bel.m:336
                  {
                    /* case ":SCALE" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 32:
//  trips2bel.m:352
                  {
                    /* case ":SEQUENCE" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 33:
//  trips2bel.m:337
                  {
                    /* case ":SIZE" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 34:
                  {
                    /* case ":START" */
                    succeeded = true;
                  }
                  break;
                case 35:
//  trips2bel.m:339
                  {
                    /* case ":TIME-DURATION-REL" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 36:
//  trips2bel.m:338
                  {
                    /* case ":TIME-VAL" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 37:
//  trips2bel.m:341
                  {
                    /* case ":TMA" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 38:
//  trips2bel.m:329
                  {
                    /* case ":UNIT" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 39:
//  trips2bel.m:342
                  {
                    /* case ":VALUE" */
                    succeeded = true;
                  }
//  trips2bel.m:313
                  break;
                case 40:
//  trips2bel.m:326
                  {
                    /* case ":YEAR" */
                    succeeded = true;
                  }
//  trips2bel.m:313
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
//  trips2bel.m:302
      if (succeeded)
//  trips2bel.m:301
        {
          STATE_VARIABLE_Es_20 = STATE_VARIABLE_Es_0_19;
          STATE_VARIABLE_As_18 = STATE_VARIABLE_As_0_17;
        }
//  trips2bel.m:302
      else
//  trips2bel.m:306
        {
          int V_14 = 0;
//  trips2bel.m:302
          trips2bel.Value_0 V_21_21 = null;
          list.List_1 V_22_22 = null;

          succeeded = R_10.equals(":COREF");
          if (succeeded)
            {
              succeeded = (Vs_11.data_tag == 1);
              if (succeeded)
                {
                  V_21_21 = ((trips2bel.Value_0) ((list.List_1.F_cons_2) Vs_11).F1);
                  V_22_22 = ((list.List_1.F_cons_2) Vs_11).F2;
                  succeeded = (V_21_21.data_tag == 0);
                  if (succeeded)
                    {
                      V_14 = ((trips2bel.Value_0.Var_1) V_21_21).F1;
                      succeeded = (V_22_22.data_tag == 0);
                    }
                }
            }
//  trips2bel.m:306
          if (succeeded)
//  trips2bel.m:305
            {
//  trips2bel.m:303
              succeeded = (V_14 == Var_9);
//  trips2bel.m:305
              if (succeeded)
//  trips2bel.m:304
                {
                  jmercury.runtime.TypeInfo_Struct TypeCtorInfo_39_39 = null;
                  errors.Err_loc_0 V_23_23 = null;
                  sberrs.Error_0 V_24_24 = null;
                  java.lang.String V_26_26 = null;

                  {
                    V_23_23 = new errors.Err_loc_0.File_1(F_8);
                  }
                  {
                    V_26_26 = string.int_to_string_1_f_0(V_14);
                  }
                  {
                    V_24_24 = new sberrs.Error_0.Coref_self_cycle_1(V_26_26);
                  }
                  TypeCtorInfo_39_39 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
                  {
                    STATE_VARIABLE_Es_20 = errors.add_error_4_p_0(TypeCtorInfo_39_39, V_23_23, ((java.lang.Object) (V_24_24)), STATE_VARIABLE_Es_0_19);
                  }
                  STATE_VARIABLE_As_18 = STATE_VARIABLE_As_0_17;
                }
//  trips2bel.m:305
              else
                {
                  trips2bel.Attr2_0 V_28_28 = null;

                  {
                    V_28_28 = new trips2bel.Attr2_0.Coref_1(V_14);
                  }
                  {
                    STATE_VARIABLE_As_18 = new list.List_1.F_cons_2(((java.lang.Object) (V_28_28)), STATE_VARIABLE_As_0_17);
                  }
                  STATE_VARIABLE_Es_20 = STATE_VARIABLE_Es_0_19;
                }
            }
//  trips2bel.m:306
          else
//  trips2bel.m:308
            {
              trips2bel.Reftp_0 Tp_15 = null;
              int V_38 = 0;
//  trips2bel.m:306
              trips2bel.Value_0 V_29_29 = null;
              list.List_1 V_30_30 = null;
//  trips2bel.m:356
              int lo_5 = 0;
              int hi_6 = 0;
              int mid_7 = 0;
              int result_8 = 0;
              int stop_loop_9 = 0;

              /* binary string jump switch */
              succeeded = false;
              lo_5 = 0;
              hi_6 = 58;
              stop_loop_9 = 0;
              do
                {
                  mid_7 = ((lo_5 + hi_6) / 2);
                  result_8 = (R_10.compareTo(((trips2bel.Vector_common_type_17_0) (MR_vector_common_17[41 + mid_7])).vct_17_f_0)) ;
                  if ((result_8 == 0))
                    {
                      switch (((trips2bel.Vector_common_type_17_0) (MR_vector_common_17[41 + mid_7])).vct_17_f_1) {
                        case 0:
                          {
                            /* case ":ACTION" */
                            Tp_15 = trips2bel.Reftp_0.K30;
                            succeeded = true;
                          }
                          break;
                        case 1:
//  trips2bel.m:357
                          {
                            /* case ":ADDRESSEE" */
                            Tp_15 = trips2bel.Reftp_0.K0;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 2:
//  trips2bel.m:358
                          {
                            /* case ":AFFECTED" */
                            Tp_15 = trips2bel.Reftp_0.K1;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 3:
//  trips2bel.m:359
                          {
                            /* case ":AGENT" */
                            Tp_15 = trips2bel.Reftp_0.K2;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 4:
//  trips2bel.m:403
                          {
                            /* case ":ALONG" */
                            Tp_15 = trips2bel.Reftp_0.K42;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 5:
//  trips2bel.m:395
                          {
                            /* case ":ARG0" */
                            Tp_15 = trips2bel.Reftp_0.K35;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 6:
//  trips2bel.m:396
                          {
                            /* case ":ARG1" */
                            Tp_15 = trips2bel.Reftp_0.K37;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 7:
//  trips2bel.m:361
                          {
                            /* case ":ASSOC-POSS" */
                            Tp_15 = trips2bel.Reftp_0.K3;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 8:
//  trips2bel.m:362
                          {
                            /* case ":ASSOC-WITH" */
                            Tp_15 = trips2bel.Reftp_0.K4;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 9:
//  trips2bel.m:406
                          {
                            /* case ":ASSOCIATED-INFORMATION" */
                            Tp_15 = trips2bel.Reftp_0.K48;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 10:
//  trips2bel.m:398
                          {
                            /* case ":ATTRIBUTE" */
                            Tp_15 = trips2bel.Reftp_0.K36;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 11:
//  trips2bel.m:363
                          {
                            /* case ":CAUSE" */
                            Tp_15 = trips2bel.Reftp_0.K5;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 12:
//  trips2bel.m:360
                          {
                            /* case ":CO-AGENT" */
                            Tp_15 = trips2bel.Reftp_0.K47;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 13:
//  trips2bel.m:366
                          {
                            /* case ":CO-THEME" */
                            Tp_15 = trips2bel.Reftp_0.K8;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 14:
//  trips2bel.m:364
                          {
                            /* case ":COGNIZER" */
                            Tp_15 = trips2bel.Reftp_0.K6;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 15:
//  trips2bel.m:414
                          {
                            /* case ":COMP3" */
                            Tp_15 = trips2bel.Reftp_0.K51;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 16:
//  trips2bel.m:365
                          {
                            /* case ":CONTENT" */
                            Tp_15 = trips2bel.Reftp_0.K7;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 17:
//  trips2bel.m:411
                          {
                            /* case ":CONTENTS" */
                            Tp_15 = trips2bel.Reftp_0.K56;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 18:
//  trips2bel.m:407
                          {
                            /* case ":DISPLACEMENT" */
                            Tp_15 = trips2bel.Reftp_0.K49;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 19:
//  trips2bel.m:367
                          {
                            /* case ":DOBJ" */
                            Tp_15 = trips2bel.Reftp_0.K9;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 20:
//  trips2bel.m:368
                          {
                            /* case ":EFFECT" */
                            Tp_15 = trips2bel.Reftp_0.K10;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 21:
//  trips2bel.m:399
                          {
                            /* case ":EQ" */
                            Tp_15 = trips2bel.Reftp_0.K38;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 22:
//  trips2bel.m:369
                          {
                            /* case ":EXPERIENCER" */
                            Tp_15 = trips2bel.Reftp_0.K11;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 23:
//  trips2bel.m:370
                          {
                            /* case ":FIGURE" */
                            Tp_15 = trips2bel.Reftp_0.K13;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 24:
//  trips2bel.m:371
                          {
                            /* case ":FOCUS" */
                            Tp_15 = trips2bel.Reftp_0.K14;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 25:
//  trips2bel.m:412
                          {
                            /* case ":FROM" */
                            Tp_15 = trips2bel.Reftp_0.K50;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 26:
//  trips2bel.m:401
                          {
                            /* case ":GOAL" */
                            Tp_15 = trips2bel.Reftp_0.K40;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 27:
//  trips2bel.m:372
                          {
                            /* case ":GROUND" */
                            Tp_15 = trips2bel.Reftp_0.K15;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 28:
//  trips2bel.m:373
                          {
                            /* case ":INSTRUMENT" */
                            Tp_15 = trips2bel.Reftp_0.K16;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 29:
//  trips2bel.m:380
                          {
                            /* case ":IS" */
                            Tp_15 = trips2bel.Reftp_0.K55;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 30:
//  trips2bel.m:374
                          {
                            /* case ":LIKE" */
                            Tp_15 = trips2bel.Reftp_0.K17;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 31:
//  trips2bel.m:375
                          {
                            /* case ":LOBJ" */
                            Tp_15 = trips2bel.Reftp_0.K18;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 32:
//  trips2bel.m:405
                          {
                            /* case ":LOCATION" */
                            Tp_15 = trips2bel.Reftp_0.K46;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 33:
//  trips2bel.m:376
                          {
                            /* case ":LSUBJ" */
                            Tp_15 = trips2bel.Reftp_0.K19;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 34:
//  trips2bel.m:377
                          {
                            /* case ":OBJ-VAL" */
                            Tp_15 = trips2bel.Reftp_0.K32;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 35:
//  trips2bel.m:378
                          {
                            /* case ":OF" */
                            Tp_15 = trips2bel.Reftp_0.K20;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 36:
//  trips2bel.m:379
                          {
                            /* case ":OF-STATE" */
                            Tp_15 = trips2bel.Reftp_0.K57;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 37:
//  trips2bel.m:408
                          {
                            /* case ":PARENTHETICAL" */
                            Tp_15 = trips2bel.Reftp_0.K52;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 38:
//  trips2bel.m:409
                          {
                            /* case ":PART" */
                            Tp_15 = trips2bel.Reftp_0.K53;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 39:
//  trips2bel.m:402
                          {
                            /* case ":PATH" */
                            Tp_15 = trips2bel.Reftp_0.K41;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 40:
//  trips2bel.m:381
                          {
                            /* case ":PREDICATE" */
                            Tp_15 = trips2bel.Reftp_0.K21;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 41:
//  trips2bel.m:382
                          {
                            /* case ":PROPERTY" */
                            Tp_15 = trips2bel.Reftp_0.K22;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 42:
//  trips2bel.m:391
                          {
                            /* case ":PURPOSE" */
                            Tp_15 = trips2bel.Reftp_0.K33;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 43:
//  trips2bel.m:392
                          {
                            /* case ":PURPOSE-IMPLICIT" */
                            Tp_15 = trips2bel.Reftp_0.K44;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 44:
//  trips2bel.m:383
                          {
                            /* case ":RECIPIENT" */
                            Tp_15 = trips2bel.Reftp_0.K31;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 45:
//  trips2bel.m:384
                          {
                            /* case ":REFOBJECT" */
                            Tp_15 = trips2bel.Reftp_0.K23;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 46:
//  trips2bel.m:385
                          {
                            /* case ":REFSET" */
                            Tp_15 = trips2bel.Reftp_0.K24;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 47:
//  trips2bel.m:386
                          {
                            /* case ":RELATED-TO" */
                            Tp_15 = trips2bel.Reftp_0.K25;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 48:
//  trips2bel.m:387
                          {
                            /* case ":RESULT" */
                            Tp_15 = trips2bel.Reftp_0.K26;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 49:
//  trips2bel.m:388
                          {
                            /* case ":RESULT-VAL" */
                            Tp_15 = trips2bel.Reftp_0.K58;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 50:
//  trips2bel.m:400
                          {
                            /* case ":SOURCE" */
                            Tp_15 = trips2bel.Reftp_0.K39;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 51:
//  trips2bel.m:410
                          {
                            /* case ":STIMULUS" */
                            Tp_15 = trips2bel.Reftp_0.K54;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 52:
//  trips2bel.m:397
                          {
                            /* case ":SUBCAT" */
                            Tp_15 = trips2bel.Reftp_0.K45;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 53:
//  trips2bel.m:389
                          {
                            /* case ":SUCHTHAT" */
                            Tp_15 = trips2bel.Reftp_0.K27;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 54:
//  trips2bel.m:390
                          {
                            /* case ":THEME" */
                            Tp_15 = trips2bel.Reftp_0.K28;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 55:
//  trips2bel.m:413
                          {
                            /* case ":TO" */
                            Tp_15 = trips2bel.Reftp_0.K29;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 56:
//  trips2bel.m:404
                          {
                            /* case ":TO-LOC" */
                            Tp_15 = trips2bel.Reftp_0.K43;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 57:
//  trips2bel.m:393
                          {
                            /* case ":VAL" */
                            Tp_15 = trips2bel.Reftp_0.K12;
                            succeeded = true;
                          }
//  trips2bel.m:356
                          break;
                        case 58:
//  trips2bel.m:394
                          {
                            /* case ":VIA" */
                            Tp_15 = trips2bel.Reftp_0.K34;
                            succeeded = true;
                          }
//  trips2bel.m:356
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
//  trips2bel.m:306
              if (succeeded)
                {
                  succeeded = (Vs_11.data_tag == 1);
                  if (succeeded)
                    {
                      V_29_29 = ((trips2bel.Value_0) ((list.List_1.F_cons_2) Vs_11).F1);
                      V_30_30 = ((list.List_1.F_cons_2) Vs_11).F2;
                      succeeded = (V_29_29.data_tag == 0);
                      if (succeeded)
                        {
                          V_38 = ((trips2bel.Value_0.Var_1) V_29_29).F1;
                          succeeded = (V_30_30.data_tag == 0);
                        }
                    }
                }
//  trips2bel.m:308
              if (succeeded)
//  trips2bel.m:307
                {
                  trips2bel.Attr2_0 V_32_32 = null;

                  {
                    V_32_32 = new trips2bel.Attr2_0.Ref_2(Tp_15, V_38);
                  }
                  {
                    STATE_VARIABLE_As_18 = new list.List_1.F_cons_2(((java.lang.Object) (V_32_32)), STATE_VARIABLE_As_0_17);
                  }
                  STATE_VARIABLE_Es_20 = STATE_VARIABLE_Es_0_19;
                }
//  trips2bel.m:308
              else
//  trips2bel.m:310
                {
                  trips2bel.Attr2_0 A_16 = null;

//  trips2bel.m:308
                  {
                    java.lang.Object [] result = trips2bel.conv_attr_3_p_0(R_10, Vs_11);
                    succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                    A_16 = (trips2bel.Attr2_0) result[1];
                  }
//  trips2bel.m:310
                  if (succeeded)
//  trips2bel.m:309
                    {
                      {
                        STATE_VARIABLE_As_18 = new list.List_1.F_cons_2(((java.lang.Object) (A_16)), STATE_VARIABLE_As_0_17);
                      }
                      STATE_VARIABLE_Es_20 = STATE_VARIABLE_Es_0_19;
                    }
//  trips2bel.m:310
                  else
                    {
                      jmercury.runtime.TypeInfo_Struct TypeInfo_40_40 = null;
                      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_41_41 = null;
                      errors.Err_loc_0 V_34_34 = null;
                      sberrs.Error_0 V_35_35 = null;
                      java.lang.String V_37_37 = null;

                      {
                        V_34_34 = new errors.Err_loc_0.File_1(F_8);
                      }
                      TypeInfo_40_40 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[12]);
                      {
                        V_37_37 = string.string_1_f_0(TypeInfo_40_40, ((java.lang.Object) (Vs_11)));
                      }
                      {
                        V_35_35 = new sberrs.Error_0.Funny_attr_2(R_10, V_37_37);
                      }
                      TypeCtorInfo_41_41 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
                      {
                        STATE_VARIABLE_Es_20 = errors.add_error_4_p_0(TypeCtorInfo_41_41, V_34_34, ((java.lang.Object) (V_35_35)), STATE_VARIABLE_Es_0_19);
                      }
                      STATE_VARIABLE_As_18 = STATE_VARIABLE_As_0_17;
                    }
                }
//  trips2bel.m:308
            }
//  trips2bel.m:306
        }
//  trips2bel.m:299
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_As_18)),
        ((java.lang.Object) (STATE_VARIABLE_Es_20))
      };
    }
//  trips2bel.m:297
  }
//  trips2bel.m:288
  private static trips2bel.Concept2_0 word_concept_2_f_0(
    maybe.Maybe_1 Data_4,
    java.lang.String W_5)
  {
//  trips2bel.m:289
    {
      boolean succeeded = false;
      trips2bel.Concept2_0 C_6 = null;
      java.lang.String LS_7 = null;

//  trips2bel.m:290
      {
        LS_7 = string.to_lower_1_f_0(W_5);
      }
//  trips2bel.m:291
      {
        succeeded = wordnet.check_word_2_p_0(Data_4, LS_7);
      }
//  trips2bel.m:292
      if (succeeded)
//  trips2bel.m:291
        {
          C_6 = new trips2bel.Concept2_0.Wordnet_1(W_5);
        }
//  trips2bel.m:292
      else
//  trips2bel.m:293
        {
//  trips2bel.m:292
          wordnet.Prontp_0 V_8_8 = null;
          java.lang.String V_9_9 = null;

          {
            java.lang.Object [] result = wordnet.pronoun_string_3_p_0(W_5);
            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
            V_8_8 = (wordnet.Prontp_0) result[1];
            V_9_9 = (java.lang.String) result[2];
          }
//  trips2bel.m:293
          if (succeeded)
//  trips2bel.m:292
            {
              C_6 = new trips2bel.Concept2_0.Closedclass_1(W_5);
            }
//  trips2bel.m:293
          else
//  trips2bel.m:294
            {
//  trips2bel.m:293
              java.lang.String V_12_12 = null;
              wordnet.Prontp_0 V_10_10 = null;
              java.lang.String V_11_11 = null;

              {
                V_12_12 = string.to_lower_1_f_0(W_5);
              }
              {
                java.lang.Object [] result = wordnet.pronoun_string_3_p_0(V_12_12);
                succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                V_10_10 = (wordnet.Prontp_0) result[1];
                V_11_11 = (java.lang.String) result[2];
              }
//  trips2bel.m:294
              if (succeeded)
//  trips2bel.m:293
                {
                  C_6 = new trips2bel.Concept2_0.Closedclass_1(W_5);
                }
//  trips2bel.m:294
              else
                {
                  C_6 = new trips2bel.Concept2_0.Unrecognised_1(W_5);
                }
            }
//  trips2bel.m:293
        }
//  trips2bel.m:289
      return C_6;
    }
//  trips2bel.m:288
  }
//  trips2bel.m:259
  private static java.lang.Object [] create_class_12_p_0_3(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      boolean succeeded = false;
      /* generic_type */ java.lang.Object closure = closure_arg;
      java.lang.String conv4_HeadVar__2_53 = null;

      {
        java.lang.Object [] result = trips2bel.IntroducedFrom__pred__create_class__261__1_2_p_0(((trips2bel.Concept2_0) wrapper_arg_1));
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        conv4_HeadVar__2_53 = (java.lang.String) result[1];
      }
      if (succeeded)
        {
          wrapper_arg_2 = ((java.lang.Object) (conv4_HeadVar__2_53));
          succeeded = true;
        }
return new java.lang.Object[] {
        java.lang.Boolean.valueOf(succeeded),
        ((java.lang.Object) (wrapper_arg_2))
      };
    }
  }
//  trips2bel.m:257
  private static java.lang.Object create_class_12_p_0_2(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      trips2bel.Concept2_0 conv3_HeadVar__3_49 = null;

      {
        conv3_HeadVar__3_49 = trips2bel.IntroducedFrom__pred__create_class__257__1_3_p_0(((tree234.Tree234_2) ((java.lang.Object[]) closure)[3]), ((trips2bel.Cvar_0) wrapper_arg_1));
      }
      wrapper_arg_2 = ((java.lang.Object) (conv3_HeadVar__3_49));
      return wrapper_arg_2;
    }
  }
//  trips2bel.m:253
  private static java.lang.Object create_class_12_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      tree234.Tree234_2 conv0_HeadVar__4_44 = null;

      {
        conv0_HeadVar__4_44 = trips2bel.IntroducedFrom__pred__create_class__253__1_4_p_0(((java.lang.Integer) (((java.lang.Object[]) closure)[3])).intValue(), ((trips2bel.Cvar_0) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2));
      }
      wrapper_arg_3 = ((java.lang.Object) (conv0_HeadVar__4_44));
      return wrapper_arg_3;
    }
  }
//  trips2bel.m:249
  private static java.lang.Object [] create_class_12_p_0(
    tree234.Tree234_2 Map_13,
    set_ordlist.Set_ordlist_1 Vars_14,
    int STATE_VARIABLE_I_0_29,
    set_ordlist.Set_ordlist_1 STATE_VARIABLE_CS_0_31,
    tree234.Tree234_2 STATE_VARIABLE_Vmap_0_33,
    tree234.Tree234_2 STATE_VARIABLE_Mmap_0_35,
    list.List_1 STATE_VARIABLE_Gs_0_37)
  {
//  trips2bel.m:251
    {
      boolean succeeded = false;
      int STATE_VARIABLE_I_30 = 0;
      set_ordlist.Set_ordlist_1 STATE_VARIABLE_CS_32 = null;
      tree234.Tree234_2 STATE_VARIABLE_Vmap_34 = null;
      tree234.Tree234_2 STATE_VARIABLE_Mmap_36 = null;
      list.List_1 STATE_VARIABLE_Gs_38 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_64_64 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_67_67 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_68_68 = null;
      /* closure */ java.lang.Object[] V_40_40 = null;
      int V_56_56 = 0;
//  trips2bel.m:253
      java.lang.Object conv1_STATE_VARIABLE_Vmap_34 = null;
//  trips2bel.m:255
      trips2bel.Cvar_0 V_23_23 = null;
      java.lang.Object conv2_V_23_23 = null;

//  trips2bel.m:252
      {
        STATE_VARIABLE_CS_32 = set.insert_3_p_0(TypeCtorInfo_64_64, java.lang.Integer.valueOf(STATE_VARIABLE_I_0_29), STATE_VARIABLE_CS_0_31);
      }
//  trips2bel.m:253
      {
        V_40_40 = new /* closure */ java.lang.Object[] {((java.lang.Object) (trips2bel.MR_scalar_common_11[2])), ((java.lang.Object) (new AddrOf3_0(1))), java.lang.Integer.valueOf(1), java.lang.Integer.valueOf(STATE_VARIABLE_I_0_29)};
      }
      TypeCtorInfo_67_67 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_cvar_0);
      TypeInfo_68_68 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[8]);
      {
        conv1_STATE_VARIABLE_Vmap_34 = set.foldl_4_p_0(TypeCtorInfo_67_67, TypeInfo_68_68, V_40_40, Vars_14, ((java.lang.Object) (STATE_VARIABLE_Vmap_0_33)));
      }
      STATE_VARIABLE_Vmap_34 = ((tree234.Tree234_2) conv1_STATE_VARIABLE_Vmap_34);
//  trips2bel.m:255
      {
        java.lang.Object [] result = set.singleton_set_2_p_1(TypeCtorInfo_67_67, Vars_14);
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        conv2_V_23_23 = (java.lang.Object) result[1];
      }
      if (succeeded)
        {
          V_23_23 = ((trips2bel.Cvar_0) conv2_V_23_23);
          succeeded = true;
        }
//  trips2bel.m:257
      if (succeeded)
//  trips2bel.m:256
        {
          {
            STATE_VARIABLE_Gs_38 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(STATE_VARIABLE_I_0_29), STATE_VARIABLE_Gs_0_37);
          }
          STATE_VARIABLE_Mmap_36 = STATE_VARIABLE_Mmap_0_35;
        }
//  trips2bel.m:257
      else
//  trips2bel.m:258
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_71_71 = null;
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_72_72 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_73_73 = null;
          list.List_1 Cs_26 = null;
          list.List_1 Ss_28 = null;
          /* closure */ java.lang.Object[] V_46_46 = null;
          list.List_1 V_47_47 = null;
          /* closure */ java.lang.Object[] V_51_51 = null;

//  trips2bel.m:257
          {
            V_46_46 = new /* closure */ java.lang.Object[] {((java.lang.Object) (trips2bel.MR_scalar_common_14[0])), ((java.lang.Object) (new AddrOf2_0(83))), java.lang.Integer.valueOf(1), ((java.lang.Object) (Map_13))};
          }
          {
            V_47_47 = set.to_sorted_list_1_f_0(TypeCtorInfo_67_67, Vars_14);
          }
          TypeCtorInfo_71_71 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_concept2_0);
          {
            Cs_26 = list.map_3_p_0(TypeCtorInfo_67_67, TypeCtorInfo_71_71, V_46_46, V_47_47);
          }
//  trips2bel.m:259
          V_51_51 = (/* closure */ java.lang.Object[]) trips2bel.MR_scalar_common_16[0];
          TypeCtorInfo_72_72 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
          {
            Ss_28 = list.filter_map_3_p_0(TypeCtorInfo_71_71, TypeCtorInfo_72_72, V_51_51, Cs_26);
          }
          TypeInfo_73_73 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[5]);
//  trips2bel.m:263
          {
            STATE_VARIABLE_Mmap_36 = map.f_84_121_112_101_83_112_101_99_79_102_95_95_112_114_101_100_95_95_100_101_116_95_105_110_115_101_114_116_95_95_91_75_32_61_32_105_110_116_93_95_48_95_49_4_p_0(TypeInfo_73_73, STATE_VARIABLE_I_0_29, ((java.lang.Object) (Ss_28)), STATE_VARIABLE_Mmap_0_35);
          }
          STATE_VARIABLE_Gs_38 = STATE_VARIABLE_Gs_0_37;
//  trips2bel.m:258
        }
//  trips2bel.m:264
      V_56_56 = 1;
      STATE_VARIABLE_I_30 = (STATE_VARIABLE_I_0_29 + V_56_56);
//  trips2bel.m:251
return new java.lang.Object[] {
        java.lang.Integer.valueOf(STATE_VARIABLE_I_30),
        ((java.lang.Object) (STATE_VARIABLE_CS_32)),
        ((java.lang.Object) (STATE_VARIABLE_Vmap_34)),
        ((java.lang.Object) (STATE_VARIABLE_Mmap_36)),
        ((java.lang.Object) (STATE_VARIABLE_Gs_38))
      };
    }
//  trips2bel.m:249
  }
//  trips2bel.m:233
  private static set_ordlist.Set_ordlist_1 find_classes_7_p_0(
    list.List_1 HeadVar__1_1,
    list.List_1 HeadVar__2_2,
    set_ordlist.Set_ordlist_1 HeadVar__3_3,
    tree234.Tree234_2 Map_4,
    tree234.Tree234_2 Rmap_5,
    set_ordlist.Set_ordlist_1 STATE_VARIABLE_Cls_0_6)
  {
//  trips2bel.m:234
    while (true)
      {
        /* tailcall optimized into a loop */
        {
          boolean succeeded = false;
          set_ordlist.Set_ordlist_1 STATE_VARIABLE_Cls_7 = null;

          if ((HeadVar__1_1.data_tag == 0))
//  trips2bel.m:242
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_46_46 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[6]);
              set_ordlist.Set_ordlist_1 STATE_VARIABLE_Cls_39_39 = null;

//  trips2bel.m:243
              {
                STATE_VARIABLE_Cls_39_39 = set.insert_3_p_0(TypeInfo_46_46, ((java.lang.Object) (HeadVar__3_3)), STATE_VARIABLE_Cls_0_6);
              }
//  trips2bel.m:244
              {
                STATE_VARIABLE_Cls_7 = trips2bel.find_classes_5_p_0(HeadVar__2_2, Map_4, Rmap_5, STATE_VARIABLE_Cls_39_39);
              }
//  trips2bel.m:242
            }
//  trips2bel.m:234
          else
            {
              trips2bel.Cvar_0 H_8 = ((trips2bel.Cvar_0) ((list.List_1.F_cons_2) HeadVar__1_1).F1);
              list.List_1 Rest0_9 = ((list.List_1.F_cons_2) HeadVar__1_1).F2;
              set_ordlist.Set_ordlist_1 Vs_22 = null;
              list.List_1 Open_23 = null;
              list.List_1 Rest_24 = null;
//  trips2bel.m:235
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_41_41 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_cvar_0);

              {
                succeeded = list.member_2_p_0(TypeCtorInfo_41_41, ((java.lang.Object) (H_8)), HeadVar__2_2);
              }
//  trips2bel.m:240
              if (succeeded)
//  trips2bel.m:236
                {
                  jmercury.runtime.TypeInfo_Struct TypeCtorInfo_45_45 = null;
                  list.List_1 Ns1_17 = null;
                  list.List_1 Ns2_19 = null;
                  set_ordlist.Set_ordlist_1 New_20 = null;
                  list.List_1 Ns_21 = null;
                  set_ordlist.Set_ordlist_1 V_28_28 = null;
                  set_ordlist.Set_ordlist_1 V_29_29 = null;
                  set_ordlist.Set_ordlist_1 V_30_30 = null;
                  list.List_1 Qs_16 = null;
                  jmercury.runtime.TypeInfo_Struct TypeCtorInfo_42_42 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_cvar_0);
                  jmercury.runtime.TypeInfo_Struct TypeInfo_43_43 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[2]);
                  pair.Pair_2 V_27_27 = null;
                  java.lang.Object conv0_V_27_27 = null;
                  trips2bel.Concept2_0 V_15_15 = null;
//  trips2bel.m:237
                  list.List_1 Rs_18 = null;
                  jmercury.runtime.TypeInfo_Struct TypeCtorInfo_44_44 = null;

//  trips2bel.m:236
                  {
                    java.lang.Object [] result = map.search_3_p_0(TypeCtorInfo_42_42, TypeInfo_43_43, Map_4, ((java.lang.Object) (H_8)));
                    succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                    conv0_V_27_27 = (java.lang.Object) result[1];
                  }
                  if (succeeded)
                    {
                      V_27_27 = ((pair.Pair_2) conv0_V_27_27);
                      succeeded = true;
                    }
                  if (succeeded)
                    {
                      V_15_15 = ((trips2bel.Concept2_0) ((pair.Pair_2) V_27_27).F1);
                      Qs_16 = ((list.List_1) ((pair.Pair_2) V_27_27).F2);
                      succeeded = true;
                    }
                  if (succeeded)
                    Ns1_17 = Qs_16;
                  else
                    Ns1_17 = (list.List_1) trips2bel.MR_scalar_common_3[0];
                  TypeCtorInfo_44_44 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_cvar_0);
//  trips2bel.m:237
                  {
                    java.lang.Object [] result = multi_map.search_3_p_0(TypeCtorInfo_44_44, TypeCtorInfo_44_44, Rmap_5, ((java.lang.Object) (H_8)));
                    succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                    Rs_18 = (list.List_1) result[1];
                  }
                  if (succeeded)
                    Ns2_19 = Rs_18;
                  else
                    Ns2_19 = (list.List_1) trips2bel.MR_scalar_common_3[0];
                  TypeCtorInfo_45_45 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_cvar_0);
//  trips2bel.m:238
                  {
                    V_28_28 = set.set_1_f_0(TypeCtorInfo_45_45, Ns1_17);
                  }
                  {
                    V_29_29 = set.set_1_f_0(TypeCtorInfo_45_45, Ns2_19);
                  }
                  {
                    New_20 = set.union_3_p_0(TypeCtorInfo_45_45, V_28_28, V_29_29);
                  }
                  {
                    V_30_30 = set.delete_2_f_0(TypeCtorInfo_45_45, New_20, ((java.lang.Object) (H_8)));
                  }
                  {
                    Ns_21 = set.to_sorted_list_2_p_0(TypeCtorInfo_45_45, V_30_30);
                  }
//  trips2bel.m:239
                  {
                    Vs_22 = set.insert_3_p_0(TypeCtorInfo_45_45, ((java.lang.Object) (H_8)), HeadVar__3_3);
                  }
                  {
                    Open_23 = list.delete_elems_3_p_0(TypeCtorInfo_45_45, HeadVar__2_2, Ns_21);
                  }
                  {
                    Rest_24 = list.append_3_p_1(TypeCtorInfo_45_45, Rest0_9, Ns_21);
                  }
//  trips2bel.m:236
                }
//  trips2bel.m:240
              else
                {
                  Rest_24 = Rest0_9;
                  Open_23 = HeadVar__2_2;
                  Vs_22 = HeadVar__3_3;
                }
//  trips2bel.m:241
              /* direct tailcall eliminated */
              {
                list.List_1 HeadVar__1__tmp_copy_1 = Rest_24;
                list.List_1 HeadVar__2__tmp_copy_2 = Open_23;
                set_ordlist.Set_ordlist_1 HeadVar__3__tmp_copy_3 = Vs_22;

                HeadVar__3_3 = HeadVar__3__tmp_copy_3;
                HeadVar__2_2 = HeadVar__2__tmp_copy_2;
                HeadVar__1_1 = HeadVar__1__tmp_copy_1;
              }
              continue;
//  trips2bel.m:234
            }
          return STATE_VARIABLE_Cls_7;
        }
      }
//  trips2bel.m:233
  }
//  trips2bel.m:226
  private static set_ordlist.Set_ordlist_1 find_classes_5_p_0(
    list.List_1 HeadVar__1_1,
    tree234.Tree234_2 Map_2,
    tree234.Tree234_2 Rmap_3,
    set_ordlist.Set_ordlist_1 STATE_VARIABLE_Cls_0_4)
  {
//  trips2bel.m:227
    {
      boolean succeeded = false;
      set_ordlist.Set_ordlist_1 STATE_VARIABLE_Cls_5 = null;

      if ((HeadVar__1_1.data_tag == 0))
//  trips2bel.m:229
        STATE_VARIABLE_Cls_5 = STATE_VARIABLE_Cls_0_4;
//  trips2bel.m:227
      else
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_22_22 = null;
          trips2bel.Cvar_0 H_6 = ((trips2bel.Cvar_0) ((list.List_1.F_cons_2) HeadVar__1_1).F1);
          list.List_1 Open_7 = ((list.List_1.F_cons_2) HeadVar__1_1).F2;
          list.List_1 V_13_13 = null;
          set_ordlist.Set_ordlist_1 V_14_14 = null;
          list.List_1 V_16_16 = (list.List_1) trips2bel.MR_scalar_common_3[0];

//  trips2bel.m:228
          {
            V_13_13 = new list.List_1.F_cons_2(((java.lang.Object) (H_6)), V_16_16);
          }
          TypeCtorInfo_22_22 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_cvar_0);
          {
            V_14_14 = set.init_0_f_0(TypeCtorInfo_22_22);
          }
          {
            STATE_VARIABLE_Cls_5 = trips2bel.find_classes_7_p_0(V_13_13, Open_7, V_14_14, Map_2, Rmap_3, STATE_VARIABLE_Cls_0_4);
          }
//  trips2bel.m:227
        }
      return STATE_VARIABLE_Cls_5;
    }
//  trips2bel.m:226
  }
//  trips2bel.m:222
  private static java.lang.Object vdm_cs_10_p_0_4(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      tree234.Tree234_2 conv1_HeadVar__6_46 = null;

      {
        conv1_HeadVar__6_46 = trips2bel.IntroducedFrom__pred__vdm_cs__222__1_6_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((java.lang.Integer) (((java.lang.Object[]) closure)[4])).intValue(), ((java.lang.Integer) (((java.lang.Object[]) closure)[5])).intValue(), ((trips2bel.Cvar_0) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2));
      }
      wrapper_arg_3 = ((java.lang.Object) (conv1_HeadVar__6_46));
      return wrapper_arg_3;
    }
  }
//  trips2bel.m:217
  private static class Vdm_cs_10_p_0_3_env_0
    extends /* env_ptr */ java.lang.Object
  {
    public jmercury.runtime.MethodPtr cont;
    public /* env_ptr */ java.lang.Object cont_env_ptr;
    public java.lang.Object wrapper_arg_1;
    public trips2bel.Cvar_0 conv0_HeadVar__4_33;

  }

  private static void vdm_cs_10_p_0_2(
    trips2bel.Cvar_0 arg1,
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      trips2bel.Vdm_cs_10_p_0_3_env_0 env_ptr = (trips2bel.Vdm_cs_10_p_0_3_env_0) env_ptr_arg;

      ((trips2bel.Vdm_cs_10_p_0_3_env_0) env_ptr).conv0_HeadVar__4_33 = arg1;
      {
        trips2bel.vdm_cs_10_p_0_1(env_ptr);
      }
    }
  }
  private static void vdm_cs_10_p_0_1(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      trips2bel.Vdm_cs_10_p_0_3_env_0 env_ptr = (trips2bel.Vdm_cs_10_p_0_3_env_0) env_ptr_arg;

      ((trips2bel.Vdm_cs_10_p_0_3_env_0) env_ptr).wrapper_arg_1 = ((java.lang.Object) (((trips2bel.Vdm_cs_10_p_0_3_env_0) env_ptr).conv0_HeadVar__4_33));
      {
        ((jmercury.runtime.MethodPtr2) (((trips2bel.Vdm_cs_10_p_0_3_env_0) env_ptr).cont)).call___0_0(((java.lang.Object) (((trips2bel.Vdm_cs_10_p_0_3_env_0) env_ptr).wrapper_arg_1)), ((java.lang.Object) (((trips2bel.Vdm_cs_10_p_0_3_env_0) env_ptr).cont_env_ptr)));
      }
    }
  }
  private static void vdm_cs_10_p_0_3(
    /* generic_type */ java.lang.Object closure_arg,
    jmercury.runtime.MethodPtr cont,
    /* env_ptr */ java.lang.Object cont_env_ptr)
  {
    {
      trips2bel.Vdm_cs_10_p_0_3_env_0 env = null;
      trips2bel.Vdm_cs_10_p_0_3_env_0 env_ptr = null;

      {
        env = new trips2bel.Vdm_cs_10_p_0_3_env_0();
      }
      env_ptr = env;
      ((trips2bel.Vdm_cs_10_p_0_3_env_0) env_ptr).cont = cont;
      ((trips2bel.Vdm_cs_10_p_0_3_env_0) env_ptr).cont_env_ptr = cont_env_ptr;
      {
        /* generic_type */ java.lang.Object closure = closure_arg;

        {
          trips2bel.IntroducedFrom__pred__vdm_cs__217__1_4_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((java.lang.Integer) (((java.lang.Object[]) closure)[4])).intValue(), ((list.List_1) ((java.lang.Object[]) closure)[5]), new AddrOf2_0(84), env_ptr);
        }
      }
    }
  }
//  trips2bel.m:215
  private static java.lang.Object [] vdm_cs_10_p_0(
    java.lang.String File_11,
    int N_12,
    int V_13,
    trips2bel.Vardef2_0 HeadVar__4_4,
    tree234.Tree234_2 STATE_VARIABLE_Map_0_26,
    tree234.Tree234_2 STATE_VARIABLE_Rmap_0_28,
    list.List_1 STATE_VARIABLE_Es_0_30)
  {
//  trips2bel.m:216
    {
      boolean succeeded = false;
      tree234.Tree234_2 STATE_VARIABLE_Map_27 = null;
      tree234.Tree234_2 STATE_VARIABLE_Rmap_29 = null;
      list.List_1 STATE_VARIABLE_Es_31 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_53_53 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_58_58 = null;
      trips2bel.Concept2_0 C_15 = ((trips2bel.Vardef2_0) HeadVar__4_4).F2;
      list.List_1 As_16 = ((trips2bel.Vardef2_0) HeadVar__4_4).F3;
      list.List_1 Qs_22 = null;
      /* closure */ java.lang.Object[] V_32_32 = null;
      /* closure */ java.lang.Object[] V_42_42 = null;
      trips2bel.Tconst_0 V_14_14 = ((trips2bel.Vardef2_0) HeadVar__4_4).F1;
//  trips2bel.m:219
      jmercury.runtime.TypeInfo_Struct TypeInfo_54_54 = null;
      trips2bel.Cvar_0 V_35_35 = null;
//  trips2bel.m:222
      java.lang.Object conv2_STATE_VARIABLE_Rmap_29 = null;

//  trips2bel.m:217
      {
        V_32_32 = new /* closure */ java.lang.Object[] {((java.lang.Object) (trips2bel.MR_scalar_common_11[1])), ((java.lang.Object) (new AddrOf3_0(2))), java.lang.Integer.valueOf(3), ((java.lang.Object) (File_11)), java.lang.Integer.valueOf(N_12), ((java.lang.Object) (As_16))};
      }
      TypeCtorInfo_53_53 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_cvar_0);
      {
        Qs_22 = solutions.solutions_2_p_1(TypeCtorInfo_53_53, V_32_32);
      }
//  trips2bel.m:219
      {
        V_35_35 = new trips2bel.Cvar_0(File_11, N_12, V_13);
      }
      TypeInfo_54_54 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[2]);
      {
        succeeded = map.contains_2_p_0(TypeCtorInfo_53_53, TypeInfo_54_54, STATE_VARIABLE_Map_0_26, ((java.lang.Object) (V_35_35)));
      }
//  trips2bel.m:221
      if (succeeded)
//  trips2bel.m:220
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_55_55 = null;
          errors.Err_loc_0 V_36_36 = null;
          sberrs.Error_0 V_37_37 = null;

          {
            V_36_36 = new errors.Err_loc_0.File_1(File_11);
          }
          {
            V_37_37 = new sberrs.Error_0.Dupl_var_2(N_12, V_13);
          }
          TypeCtorInfo_55_55 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
          {
            STATE_VARIABLE_Es_31 = errors.add_error_4_p_0(TypeCtorInfo_55_55, V_36_36, ((java.lang.Object) (V_37_37)), STATE_VARIABLE_Es_0_30);
          }
          STATE_VARIABLE_Map_27 = STATE_VARIABLE_Map_0_26;
        }
//  trips2bel.m:221
      else
        {
          jmercury.runtime.TypeInfo_Struct TypeInfo_56_56 = null;
          trips2bel.Cvar_0 V_39_39 = null;
          pair.Pair_2 V_40_40 = null;

          {
            V_39_39 = new trips2bel.Cvar_0(File_11, N_12, V_13);
          }
          {
            V_40_40 = new pair.Pair_2(((java.lang.Object) (C_15)), ((java.lang.Object) (Qs_22)));
          }
          TypeInfo_56_56 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[2]);
          {
            STATE_VARIABLE_Map_27 = map.det_insert_4_p_0(TypeCtorInfo_53_53, TypeInfo_56_56, ((java.lang.Object) (V_39_39)), ((java.lang.Object) (V_40_40)), STATE_VARIABLE_Map_0_26);
          }
          STATE_VARIABLE_Es_31 = STATE_VARIABLE_Es_0_30;
        }
//  trips2bel.m:222
      {
        V_42_42 = new /* closure */ java.lang.Object[] {((java.lang.Object) (trips2bel.MR_scalar_common_4[4])), ((java.lang.Object) (new AddrOf3_0(3))), java.lang.Integer.valueOf(3), ((java.lang.Object) (File_11)), java.lang.Integer.valueOf(N_12), java.lang.Integer.valueOf(V_13)};
      }
      TypeInfo_58_58 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[4]);
      {
        conv2_STATE_VARIABLE_Rmap_29 = list.foldl_4_p_0(TypeCtorInfo_53_53, TypeInfo_58_58, V_42_42, Qs_22, ((java.lang.Object) (STATE_VARIABLE_Rmap_0_28)));
      }
      STATE_VARIABLE_Rmap_29 = ((tree234.Tree234_2) conv2_STATE_VARIABLE_Rmap_29);
//  trips2bel.m:216
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_Map_27)),
        ((java.lang.Object) (STATE_VARIABLE_Rmap_29)),
        ((java.lang.Object) (STATE_VARIABLE_Es_31))
      };
    }
//  trips2bel.m:215
  }
//  trips2bel.m:211
  private static java.lang.Object [] sent_cs_9_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3,
    java.lang.Object wrapper_arg_5,
    java.lang.Object wrapper_arg_7)
  {
    {
      java.lang.Object wrapper_arg_4 = null;
      java.lang.Object wrapper_arg_6 = null;
      java.lang.Object wrapper_arg_8 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      tree234.Tree234_2 conv2_STATE_VARIABLE_Map_27 = null;
      tree234.Tree234_2 conv1_STATE_VARIABLE_Rmap_29 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_31 = null;

      {
        java.lang.Object [] result = trips2bel.vdm_cs_10_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((java.lang.Integer) (((java.lang.Object[]) closure)[4])).intValue(), ((java.lang.Integer) wrapper_arg_1).intValue(), ((trips2bel.Vardef2_0) wrapper_arg_2), ((tree234.Tree234_2) wrapper_arg_3), ((tree234.Tree234_2) wrapper_arg_5), ((list.List_1) wrapper_arg_7));
        conv2_STATE_VARIABLE_Map_27 = (tree234.Tree234_2) result[0];
        conv1_STATE_VARIABLE_Rmap_29 = (tree234.Tree234_2) result[1];
        conv0_STATE_VARIABLE_Es_31 = (list.List_1) result[2];
      }
      wrapper_arg_4 = ((java.lang.Object) (conv2_STATE_VARIABLE_Map_27));
      wrapper_arg_6 = ((java.lang.Object) (conv1_STATE_VARIABLE_Rmap_29));
      wrapper_arg_8 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_31));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_4)),
        ((java.lang.Object) (wrapper_arg_6)),
        ((java.lang.Object) (wrapper_arg_8))
      };
    }
  }
//  trips2bel.m:209
  private static java.lang.Object [] sent_cs_9_p_0(
    java.lang.String File_10,
    int N_11,
    trips2bel.Sent2_0 HeadVar__3_3,
    tree234.Tree234_2 STATE_VARIABLE_Map_0_18,
    tree234.Tree234_2 STATE_VARIABLE_Rmap_0_20,
    list.List_1 STATE_VARIABLE_Es_0_22)
  {
//  trips2bel.m:210
    {
      boolean succeeded = false;
      tree234.Tree234_2 STATE_VARIABLE_Map_19 = null;
      tree234.Tree234_2 STATE_VARIABLE_Rmap_21 = null;
      list.List_1 STATE_VARIABLE_Es_23 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_36_36 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_37_37 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_38_38 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_39_39 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_40_40 = null;
      tree234.Tree234_2 VDM_14 = ((trips2bel.Sent2_0) HeadVar__3_3).F3;
      /* closure */ java.lang.Object[] V_24_24 = null;
      list.List_1 V_12_12 = ((trips2bel.Sent2_0) HeadVar__3_3).F1;
      trips2bel.Exptp_0 V_13_13 = ((trips2bel.Sent2_0) HeadVar__3_3).F2;
//  trips2bel.m:211
      java.lang.Object conv5_STATE_VARIABLE_Map_19 = null;
      java.lang.Object conv4_STATE_VARIABLE_Rmap_21 = null;
      java.lang.Object conv3_STATE_VARIABLE_Es_23 = null;

      {
        V_24_24 = new /* closure */ java.lang.Object[] {((java.lang.Object) (trips2bel.MR_scalar_common_13[0])), ((java.lang.Object) (new AddrOf6_0())), java.lang.Integer.valueOf(2), ((java.lang.Object) (File_10)), java.lang.Integer.valueOf(N_11)};
      }
      TypeCtorInfo_36_36 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
      TypeCtorInfo_37_37 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_vardef2_0);
      TypeInfo_38_38 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[3]);
      TypeInfo_39_39 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[4]);
      TypeInfo_40_40 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[0]);
      {
        java.lang.Object [] result = map.foldl3_8_p_0(TypeCtorInfo_36_36, TypeCtorInfo_37_37, TypeInfo_38_38, TypeInfo_39_39, TypeInfo_40_40, V_24_24, VDM_14, ((java.lang.Object) (STATE_VARIABLE_Map_0_18)), ((java.lang.Object) (STATE_VARIABLE_Rmap_0_20)), ((java.lang.Object) (STATE_VARIABLE_Es_0_22)));
        conv5_STATE_VARIABLE_Map_19 = (java.lang.Object) result[0];
        conv4_STATE_VARIABLE_Rmap_21 = (java.lang.Object) result[1];
        conv3_STATE_VARIABLE_Es_23 = (java.lang.Object) result[2];
      }
      STATE_VARIABLE_Map_19 = ((tree234.Tree234_2) conv5_STATE_VARIABLE_Map_19);
      STATE_VARIABLE_Rmap_21 = ((tree234.Tree234_2) conv4_STATE_VARIABLE_Rmap_21);
      STATE_VARIABLE_Es_23 = ((list.List_1) conv3_STATE_VARIABLE_Es_23);
//  trips2bel.m:210
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_Map_19)),
        ((java.lang.Object) (STATE_VARIABLE_Rmap_21)),
        ((java.lang.Object) (STATE_VARIABLE_Es_23))
      };
    }
//  trips2bel.m:209
  }
//  trips2bel.m:205
  private static java.lang.Object [] turn_cs_8_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_4,
    java.lang.Object wrapper_arg_6)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      java.lang.Object wrapper_arg_5 = null;
      java.lang.Object wrapper_arg_7 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      tree234.Tree234_2 conv2_STATE_VARIABLE_Map_19 = null;
      tree234.Tree234_2 conv1_STATE_VARIABLE_Rmap_21 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_23 = null;

      {
        java.lang.Object [] result = trips2bel.sent_cs_9_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((java.lang.Integer) (((java.lang.Object[]) closure)[4])).intValue(), ((trips2bel.Sent2_0) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2), ((tree234.Tree234_2) wrapper_arg_4), ((list.List_1) wrapper_arg_6));
        conv2_STATE_VARIABLE_Map_19 = (tree234.Tree234_2) result[0];
        conv1_STATE_VARIABLE_Rmap_21 = (tree234.Tree234_2) result[1];
        conv0_STATE_VARIABLE_Es_23 = (list.List_1) result[2];
      }
      wrapper_arg_3 = ((java.lang.Object) (conv2_STATE_VARIABLE_Map_19));
      wrapper_arg_5 = ((java.lang.Object) (conv1_STATE_VARIABLE_Rmap_21));
      wrapper_arg_7 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_23));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_3)),
        ((java.lang.Object) (wrapper_arg_5)),
        ((java.lang.Object) (wrapper_arg_7))
      };
    }
  }
//  trips2bel.m:203
  private static java.lang.Object [] turn_cs_8_p_0(
    java.lang.String File_9,
    trips2bel.Turn2_0 HeadVar__2_2,
    tree234.Tree234_2 STATE_VARIABLE_Map_0_16,
    tree234.Tree234_2 STATE_VARIABLE_Rmap_0_18,
    list.List_1 STATE_VARIABLE_Es_0_20)
  {
//  trips2bel.m:204
    {
      boolean succeeded = false;
      tree234.Tree234_2 STATE_VARIABLE_Map_17 = null;
      tree234.Tree234_2 STATE_VARIABLE_Rmap_19 = null;
      list.List_1 STATE_VARIABLE_Es_21 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_33_33 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_34_34 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_35_35 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_36_36 = null;
      int N_10 = ((trips2bel.Turn2_0) HeadVar__2_2).F1;
      list.List_1 Ss_12 = ((trips2bel.Turn2_0) HeadVar__2_2).F3;
      /* closure */ java.lang.Object[] V_22_22 = null;
      java.lang.String V_11_11 = ((trips2bel.Turn2_0) HeadVar__2_2).F2;
//  trips2bel.m:205
      java.lang.Object conv5_STATE_VARIABLE_Map_17 = null;
      java.lang.Object conv4_STATE_VARIABLE_Rmap_19 = null;
      java.lang.Object conv3_STATE_VARIABLE_Es_21 = null;

      {
        V_22_22 = new /* closure */ java.lang.Object[] {((java.lang.Object) (trips2bel.MR_scalar_common_12[0])), ((java.lang.Object) (new AddrOf5_0(1))), java.lang.Integer.valueOf(2), ((java.lang.Object) (File_9)), java.lang.Integer.valueOf(N_10)};
      }
      TypeCtorInfo_33_33 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_sent2_0);
      TypeInfo_34_34 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[3]);
      TypeInfo_35_35 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[4]);
      TypeInfo_36_36 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[0]);
      {
        java.lang.Object [] result = list.foldl3_8_p_0(TypeCtorInfo_33_33, TypeInfo_34_34, TypeInfo_35_35, TypeInfo_36_36, V_22_22, Ss_12, ((java.lang.Object) (STATE_VARIABLE_Map_0_16)), ((java.lang.Object) (STATE_VARIABLE_Rmap_0_18)), ((java.lang.Object) (STATE_VARIABLE_Es_0_20)));
        conv5_STATE_VARIABLE_Map_17 = (java.lang.Object) result[0];
        conv4_STATE_VARIABLE_Rmap_19 = (java.lang.Object) result[1];
        conv3_STATE_VARIABLE_Es_21 = (java.lang.Object) result[2];
      }
      STATE_VARIABLE_Map_17 = ((tree234.Tree234_2) conv5_STATE_VARIABLE_Map_17);
      STATE_VARIABLE_Rmap_19 = ((tree234.Tree234_2) conv4_STATE_VARIABLE_Rmap_19);
      STATE_VARIABLE_Es_21 = ((list.List_1) conv3_STATE_VARIABLE_Es_21);
//  trips2bel.m:204
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_Map_17)),
        ((java.lang.Object) (STATE_VARIABLE_Rmap_19)),
        ((java.lang.Object) (STATE_VARIABLE_Es_21))
      };
    }
//  trips2bel.m:203
  }
//  trips2bel.m:192
  private static java.lang.Object conv_attr3_10_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      list.List_1 conv0_HeadVar__6_297 = null;

      {
        conv0_HeadVar__6_297 = trips2bel.IntroducedFrom__pred__conv_attr3__192__1_6_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((java.lang.Integer) (((java.lang.Object[]) closure)[4])).intValue(), ((trips2bel.Cvar_0) ((java.lang.Object[]) closure)[5]), ((java.lang.Integer) wrapper_arg_1).intValue(), ((list.List_1) wrapper_arg_2));
      }
      wrapper_arg_3 = ((java.lang.Object) (conv0_HeadVar__6_297));
      return wrapper_arg_3;
    }
  }
//  trips2bel.m:164
  private static java.lang.Object [] conv_attr3_10_p_0(
    java.lang.String F_1,
    int N_2,
    trips2bel.Cvar_0 V_3,
    trips2bel.Attr2_0 HeadVar__4_4,
    list.List_1 STATE_VARIABLE_X_0_5,
    bool.Bool_0 STATE_VARIABLE_B_0_7,
    list.List_1 STATE_VARIABLE_E_0_9)
  {
//  trips2bel.m:166
    {
      boolean succeeded = false;
      list.List_1 STATE_VARIABLE_X_6 = null;
      bool.Bool_0 HeadVar__8_8 = null;
      list.List_1 STATE_VARIABLE_E_10 = null;

      switch (HeadVar__4_4.data_tag) {
        case 0:
//  trips2bel.m:181
          {
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_304_304 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_reftp_0);
            trips2bel.Reftp_0 Tp_201 = ((trips2bel.Attr2_0.Ref_2) HeadVar__4_4).F1;
            int W_202 = ((trips2bel.Attr2_0.Ref_2) HeadVar__4_4).F2;
            trips2bel.Expr_0 V_213_213 = null;
            java.lang.String V_214_214 = null;
            trips2bel.Cvar_0 V_215_215 = null;

//  trips2bel.m:182
            {
              V_214_214 = string.string_1_f_0(TypeCtorInfo_304_304, ((java.lang.Object) (Tp_201)));
            }
            {
              V_215_215 = new trips2bel.Cvar_0(F_1, N_2, W_202);
            }
            {
              V_213_213 = new trips2bel.Expr_0.Objprop_3(V_214_214, V_3, V_215_215);
            }
            {
              STATE_VARIABLE_X_6 = new list.List_1.F_cons_2(((java.lang.Object) (V_213_213)), STATE_VARIABLE_X_0_5);
            }
//  trips2bel.m:181
            STATE_VARIABLE_E_10 = STATE_VARIABLE_E_0_9;
            HeadVar__8_8 = STATE_VARIABLE_B_0_7;
          }
//  trips2bel.m:166
          break;
        case 1:
          {
            STATE_VARIABLE_E_10 = STATE_VARIABLE_E_0_9;
            HeadVar__8_8 = STATE_VARIABLE_B_0_7;
            STATE_VARIABLE_X_6 = STATE_VARIABLE_X_0_5;
          }
          break;
        case 2:
//  trips2bel.m:191
          {
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_306_306 = null;
            jmercury.runtime.TypeInfo_Struct TypeInfo_307_307 = null;
            list.List_1 Ws_281 = ((trips2bel.Attr2_0.Mods_1) HeadVar__4_4).F1;
            /* closure */ java.lang.Object[] V_293_293 = null;
//  trips2bel.m:192
            java.lang.Object conv1_STATE_VARIABLE_X_6 = null;

            {
              V_293_293 = new /* closure */ java.lang.Object[] {((java.lang.Object) (trips2bel.MR_scalar_common_4[3])), ((java.lang.Object) (new AddrOf3_0(4))), java.lang.Integer.valueOf(3), ((java.lang.Object) (F_1)), java.lang.Integer.valueOf(N_2), ((java.lang.Object) (V_3))};
            }
            TypeCtorInfo_306_306 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
            TypeInfo_307_307 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[15]);
            {
              conv1_STATE_VARIABLE_X_6 = list.foldl_4_p_0(TypeCtorInfo_306_306, TypeInfo_307_307, V_293_293, Ws_281, ((java.lang.Object) (STATE_VARIABLE_X_0_5)));
            }
            STATE_VARIABLE_X_6 = ((list.List_1) conv1_STATE_VARIABLE_X_6);
//  trips2bel.m:191
            STATE_VARIABLE_E_10 = STATE_VARIABLE_E_0_9;
            HeadVar__8_8 = STATE_VARIABLE_B_0_7;
          }
//  trips2bel.m:166
          break;
        case 3:
          {
            trips2bel.Forceval_0 V_308_308 = ((trips2bel.Attr2_0.Force_1) HeadVar__4_4).F1;

            switch (V_308_308.MR_value) {
              case 1:
//  trips2bel.m:168
                {
                  HeadVar__8_8 = bool.Bool_0.K0;
                  STATE_VARIABLE_E_10 = STATE_VARIABLE_E_0_9;
                  STATE_VARIABLE_X_6 = STATE_VARIABLE_X_0_5;
                }
//  trips2bel.m:166
                break;
              case 4:
//  trips2bel.m:171
                {
                  STATE_VARIABLE_E_10 = STATE_VARIABLE_E_0_9;
                  HeadVar__8_8 = STATE_VARIABLE_B_0_7;
                  STATE_VARIABLE_X_6 = STATE_VARIABLE_X_0_5;
                }
//  trips2bel.m:166
                break;
              case 5:
//  trips2bel.m:172
                {
                  HeadVar__8_8 = bool.Bool_0.K0;
                  STATE_VARIABLE_E_10 = STATE_VARIABLE_E_0_9;
                  STATE_VARIABLE_X_6 = STATE_VARIABLE_X_0_5;
                }
//  trips2bel.m:166
                break;
              case 3:
//  trips2bel.m:170
                {
                  HeadVar__8_8 = bool.Bool_0.K0;
                  STATE_VARIABLE_E_10 = STATE_VARIABLE_E_0_9;
                  STATE_VARIABLE_X_6 = STATE_VARIABLE_X_0_5;
                }
//  trips2bel.m:166
                break;
              case 2:
//  trips2bel.m:169
                {
                  STATE_VARIABLE_E_10 = STATE_VARIABLE_E_0_9;
                  HeadVar__8_8 = STATE_VARIABLE_B_0_7;
                  STATE_VARIABLE_X_6 = STATE_VARIABLE_X_0_5;
                }
//  trips2bel.m:166
                break;
              case 7:
//  trips2bel.m:174
                {
                  HeadVar__8_8 = bool.Bool_0.K0;
                  STATE_VARIABLE_E_10 = STATE_VARIABLE_E_0_9;
                  STATE_VARIABLE_X_6 = STATE_VARIABLE_X_0_5;
                }
//  trips2bel.m:166
                break;
              case 6:
//  trips2bel.m:173
                {
                  STATE_VARIABLE_E_10 = STATE_VARIABLE_E_0_9;
                  HeadVar__8_8 = STATE_VARIABLE_B_0_7;
                  STATE_VARIABLE_X_6 = STATE_VARIABLE_X_0_5;
                }
//  trips2bel.m:166
                break;
              case 0:
//  trips2bel.m:167
                {
                  STATE_VARIABLE_E_10 = STATE_VARIABLE_E_0_9;
                  HeadVar__8_8 = STATE_VARIABLE_B_0_7;
                  STATE_VARIABLE_X_6 = STATE_VARIABLE_X_0_5;
                }
//  trips2bel.m:166
                break;
              default: /*NOTREACHED*/
                throw new jmercury.runtime.UnreachableDefault();
            }
          }
          break;
        case 4:
//  trips2bel.m:175
          {
            STATE_VARIABLE_E_10 = STATE_VARIABLE_E_0_9;
            HeadVar__8_8 = STATE_VARIABLE_B_0_7;
            STATE_VARIABLE_X_6 = STATE_VARIABLE_X_0_5;
          }
//  trips2bel.m:166
          break;
        case 5:
//  trips2bel.m:179
          {
            STATE_VARIABLE_E_10 = STATE_VARIABLE_E_0_9;
            HeadVar__8_8 = STATE_VARIABLE_B_0_7;
            STATE_VARIABLE_X_6 = STATE_VARIABLE_X_0_5;
          }
//  trips2bel.m:166
          break;
        case 6:
//  trips2bel.m:180
          {
            STATE_VARIABLE_E_10 = STATE_VARIABLE_E_0_9;
            HeadVar__8_8 = STATE_VARIABLE_B_0_7;
            STATE_VARIABLE_X_6 = STATE_VARIABLE_X_0_5;
          }
//  trips2bel.m:166
          break;
        case 7:
//  trips2bel.m:183
          {
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_305_305 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_condval_0);
            trips2bel.Condval_0 Cond_219 = ((trips2bel.Attr2_0.Condition_2) HeadVar__4_4).F1;
            int W_220 = ((trips2bel.Attr2_0.Condition_2) HeadVar__4_4).F2;
            trips2bel.Expr_0 V_231_231 = null;
            java.lang.String V_232_232 = null;
            trips2bel.Cvar_0 V_233_233 = null;

//  trips2bel.m:184
            {
              V_232_232 = string.string_1_f_0(TypeCtorInfo_305_305, ((java.lang.Object) (Cond_219)));
            }
            {
              V_233_233 = new trips2bel.Cvar_0(F_1, N_2, W_220);
            }
            {
              V_231_231 = new trips2bel.Expr_0.Objprop_3(V_232_232, V_3, V_233_233);
            }
            {
              STATE_VARIABLE_X_6 = new list.List_1.F_cons_2(((java.lang.Object) (V_231_231)), STATE_VARIABLE_X_0_5);
            }
//  trips2bel.m:183
            STATE_VARIABLE_E_10 = STATE_VARIABLE_E_0_9;
            HeadVar__8_8 = STATE_VARIABLE_B_0_7;
          }
//  trips2bel.m:166
          break;
        case 8:
//  trips2bel.m:185
          {
            int W1_237 = ((trips2bel.Attr2_0.Acts_2) HeadVar__4_4).F1;
            int W2_238 = ((trips2bel.Attr2_0.Acts_2) HeadVar__4_4).F2;
            list.List_1 STATE_VARIABLE_X_248_248 = null;
            trips2bel.Expr_0 V_249_249 = null;
            java.lang.String V_250_250 = "acts";
            trips2bel.Cvar_0 V_251_251 = null;
            trips2bel.Expr_0 V_253_253 = null;
            java.lang.String V_254_254 = null;
            trips2bel.Cvar_0 V_255_255 = null;

//  trips2bel.m:186
            {
              V_251_251 = new trips2bel.Cvar_0(F_1, N_2, W1_237);
            }
            {
              V_249_249 = new trips2bel.Expr_0.Objprop_3(V_250_250, V_3, V_251_251);
            }
            {
              STATE_VARIABLE_X_248_248 = new list.List_1.F_cons_2(((java.lang.Object) (V_249_249)), STATE_VARIABLE_X_0_5);
            }
//  trips2bel.m:187
            V_254_254 = "acts";
            {
              V_255_255 = new trips2bel.Cvar_0(F_1, N_2, W2_238);
            }
            {
              V_253_253 = new trips2bel.Expr_0.Objprop_3(V_254_254, V_3, V_255_255);
            }
            {
              STATE_VARIABLE_X_6 = new list.List_1.F_cons_2(((java.lang.Object) (V_253_253)), STATE_VARIABLE_X_248_248);
            }
//  trips2bel.m:185
            STATE_VARIABLE_E_10 = STATE_VARIABLE_E_0_9;
            HeadVar__8_8 = STATE_VARIABLE_B_0_7;
          }
//  trips2bel.m:166
          break;
        case 9:
//  trips2bel.m:176
          {
            STATE_VARIABLE_E_10 = STATE_VARIABLE_E_0_9;
            HeadVar__8_8 = STATE_VARIABLE_B_0_7;
            STATE_VARIABLE_X_6 = STATE_VARIABLE_X_0_5;
          }
//  trips2bel.m:166
          break;
        case 10:
//  trips2bel.m:177
          {
            STATE_VARIABLE_E_10 = STATE_VARIABLE_E_0_9;
            HeadVar__8_8 = STATE_VARIABLE_B_0_7;
            STATE_VARIABLE_X_6 = STATE_VARIABLE_X_0_5;
          }
//  trips2bel.m:166
          break;
        case 11:
//  trips2bel.m:178
          {
            STATE_VARIABLE_E_10 = STATE_VARIABLE_E_0_9;
            HeadVar__8_8 = STATE_VARIABLE_B_0_7;
            STATE_VARIABLE_X_6 = STATE_VARIABLE_X_0_5;
          }
//  trips2bel.m:166
          break;
        case 12:
//  trips2bel.m:188
          {
            int W1_259 = ((trips2bel.Attr2_0.Name_modifiers_2) HeadVar__4_4).F1;
            int W2_260 = ((trips2bel.Attr2_0.Name_modifiers_2) HeadVar__4_4).F2;
            list.List_1 STATE_VARIABLE_X_270_270 = null;
            trips2bel.Expr_0 V_271_271 = null;
            java.lang.String V_272_272 = "name_modifier";
            trips2bel.Cvar_0 V_273_273 = null;
            trips2bel.Expr_0 V_275_275 = null;
            java.lang.String V_276_276 = null;
            trips2bel.Cvar_0 V_277_277 = null;

//  trips2bel.m:189
            {
              V_273_273 = new trips2bel.Cvar_0(F_1, N_2, W1_259);
            }
            {
              V_271_271 = new trips2bel.Expr_0.Objprop_3(V_272_272, V_3, V_273_273);
            }
            {
              STATE_VARIABLE_X_270_270 = new list.List_1.F_cons_2(((java.lang.Object) (V_271_271)), STATE_VARIABLE_X_0_5);
            }
//  trips2bel.m:190
            V_276_276 = "name_modifier";
            {
              V_277_277 = new trips2bel.Cvar_0(F_1, N_2, W2_260);
            }
            {
              V_275_275 = new trips2bel.Expr_0.Objprop_3(V_276_276, V_3, V_277_277);
            }
            {
              STATE_VARIABLE_X_6 = new list.List_1.F_cons_2(((java.lang.Object) (V_275_275)), STATE_VARIABLE_X_270_270);
            }
//  trips2bel.m:188
            STATE_VARIABLE_E_10 = STATE_VARIABLE_E_0_9;
            HeadVar__8_8 = STATE_VARIABLE_B_0_7;
          }
//  trips2bel.m:166
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_X_6)),
        ((java.lang.Object) (HeadVar__8_8)),
        ((java.lang.Object) (STATE_VARIABLE_E_10))
      };
    }
//  trips2bel.m:164
  }
//  trips2bel.m:156
  private static java.lang.Object [] conv_sent3_6_p_0_2(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_4)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      java.lang.Object wrapper_arg_5 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      list.List_1 conv3_HeadVar__6_33 = null;
      list.List_1 conv2_HeadVar__8_35 = null;

      {
        java.lang.Object [] result = trips2bel.IntroducedFrom__pred__conv_sent3__156__1_8_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((java.lang.Integer) (((java.lang.Object[]) closure)[4])).intValue(), ((tree234.Tree234_2) ((java.lang.Object[]) closure)[5]), ((java.lang.Integer) wrapper_arg_1).intValue(), ((list.List_1) wrapper_arg_2), ((list.List_1) wrapper_arg_4));
        conv3_HeadVar__6_33 = (list.List_1) result[0];
        conv2_HeadVar__8_35 = (list.List_1) result[1];
      }
      wrapper_arg_3 = ((java.lang.Object) (conv3_HeadVar__6_33));
      wrapper_arg_5 = ((java.lang.Object) (conv2_HeadVar__8_35));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_3)),
        ((java.lang.Object) (wrapper_arg_5))
      };
    }
  }
//  trips2bel.m:464
  private static java.lang.Object conv_sent3_6_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      trips2bel.Vertices_0 conv0_STATE_VARIABLE_Vs_25 = null;

      {
        conv0_STATE_VARIABLE_Vs_25 = trips2bel.tps_4_p_0(((tree234.Tree234_2) ((java.lang.Object[]) closure)[3]), ((java.lang.Integer) wrapper_arg_1).intValue(), ((trips2bel.Vertices_0) wrapper_arg_2));
      }
      wrapper_arg_3 = ((java.lang.Object) (conv0_STATE_VARIABLE_Vs_25));
      return wrapper_arg_3;
    }
  }
//  trips2bel.m:152
  private static java.lang.Object [] conv_sent3_6_p_0(
    java.lang.String F_7,
    int Trn_8,
    trips2bel.Sent2_0 HeadVar__3_3,
    list.List_1 STATE_VARIABLE_Es_0_26)
  {
//  trips2bel.m:154
    {
      boolean succeeded = false;
      trips2bel.Sent3_0 HeadVar__4_4 = null;
      list.List_1 STATE_VARIABLE_Es_27 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_60_60 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_61_61 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_62_62 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_63_63 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_18_79 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_19_80 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_vardef2_0);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_23_84 = null;
      list.List_1 Txt_9 = ((trips2bel.Sent2_0) HeadVar__3_3).F1;
      trips2bel.Exptp_0 Exp_10 = ((trips2bel.Sent2_0) HeadVar__3_3).F2;
      tree234.Tree234_2 Map_11 = ((trips2bel.Sent2_0) HeadVar__3_3).F3;
      list.List_1 Exprs_12 = null;
      list.List_1 Vs_14 = null;
      list.List_1 RevExprs_25 = null;
      /* closure */ java.lang.Object[] V_28_28 = null;
      list.List_1 V_29_29 = null;
      list.List_1 Vs_66 = null;
      trips2bel.Vertices_0 Vertices0_67 = null;
      trips2bel.Vertices_0 Vertices_68 = null;
      list.List_1 X_71 = null;
      list.List_1 Xs_72 = null;
      set_ordlist.Set_ordlist_1 V_73_73 = null;
      set_ordlist.Set_ordlist_1 V_74_74 = null;
      list.List_1 V_75_75 = null;
      list.List_1 V_76_76 = null;
      /* closure */ java.lang.Object[] V_77_77 = null;
      list.List_1 V_78_78 = null;
//  trips2bel.m:464
      java.lang.Object conv1_Vertices_68 = null;
//  trips2bel.m:465
      set_ordlist.Set_ordlist_1 V_69_69 = null;
      set_ordlist.Set_ordlist_1 V_70_70 = null;
//  trips2bel.m:156
      java.lang.Object conv5_RevExprs_25 = null;
      java.lang.Object conv4_STATE_VARIABLE_Es_27 = null;

//  trips2bel.m:463
      {
        Vs_66 = map.keys_2_p_0(TypeCtorInfo_18_79, TypeCtorInfo_19_80, Map_11);
      }
      {
        V_73_73 = set.set_1_f_0(TypeCtorInfo_18_79, Vs_66);
      }
      {
        V_74_74 = set.init_0_f_0(TypeCtorInfo_18_79);
      }
      V_75_75 = (list.List_1) trips2bel.MR_scalar_common_3[0];
      V_76_76 = (list.List_1) trips2bel.MR_scalar_common_3[0];
      {
        Vertices0_67 = new trips2bel.Vertices_0(V_73_73, V_74_74, V_75_75, V_76_76);
      }
//  trips2bel.m:464
      {
        V_77_77 = new /* closure */ java.lang.Object[] {((java.lang.Object) (trips2bel.MR_scalar_common_11[0])), ((java.lang.Object) (new AddrOf3_0(5))), java.lang.Integer.valueOf(1), ((java.lang.Object) (Map_11))};
      }
      TypeCtorInfo_23_84 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_vertices_0);
      {
        conv1_Vertices_68 = list.foldl_4_p_0(TypeCtorInfo_18_79, TypeCtorInfo_23_84, V_77_77, Vs_66, ((java.lang.Object) (Vertices0_67)));
      }
      Vertices_68 = ((trips2bel.Vertices_0) conv1_Vertices_68);
//  trips2bel.m:465
      V_69_69 = ((trips2bel.Vertices_0) Vertices_68).F1;
      V_70_70 = ((trips2bel.Vertices_0) Vertices_68).F2;
      X_71 = ((trips2bel.Vertices_0) Vertices_68).F3;
      Xs_72 = ((trips2bel.Vertices_0) Vertices_68).F4;
      {
        V_78_78 = new list.List_1.F_cons_2(((java.lang.Object) (X_71)), Xs_72);
      }
      {
        Vs_14 = list.condense_2_p_0(TypeCtorInfo_18_79, V_78_78);
      }
//  trips2bel.m:156
      {
        V_28_28 = new /* closure */ java.lang.Object[] {((java.lang.Object) (trips2bel.MR_scalar_common_6[1])), ((java.lang.Object) (new AddrOf4_0(0))), java.lang.Integer.valueOf(3), ((java.lang.Object) (F_7)), java.lang.Integer.valueOf(Trn_8), ((java.lang.Object) (Map_11))};
      }
      V_29_29 = (list.List_1) trips2bel.MR_scalar_common_3[0];
      TypeCtorInfo_60_60 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
      TypeInfo_61_61 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[15]);
      TypeInfo_62_62 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[0]);
      {
        java.lang.Object [] result = list.foldl2_6_p_0(TypeCtorInfo_60_60, TypeInfo_61_61, TypeInfo_62_62, V_28_28, Vs_14, ((java.lang.Object) (V_29_29)), ((java.lang.Object) (STATE_VARIABLE_Es_0_26)));
        conv5_RevExprs_25 = (java.lang.Object) result[0];
        conv4_STATE_VARIABLE_Es_27 = (java.lang.Object) result[1];
      }
      RevExprs_25 = ((list.List_1) conv5_RevExprs_25);
      STATE_VARIABLE_Es_27 = ((list.List_1) conv4_STATE_VARIABLE_Es_27);
      TypeCtorInfo_63_63 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_expr_0);
//  trips2bel.m:160
      {
        Exprs_12 = list.reverse_2_p_0(TypeCtorInfo_63_63, RevExprs_25);
      }
//  trips2bel.m:154
      {
        HeadVar__4_4 = new trips2bel.Sent3_0(Txt_9, Exp_10, Exprs_12);
      }
return new java.lang.Object[] {
        ((java.lang.Object) (HeadVar__4_4)),
        ((java.lang.Object) (STATE_VARIABLE_Es_27))
      };
    }
//  trips2bel.m:152
  }
//  trips2bel.m:148
  private static java.lang.Object [] conv_turn3_5_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      java.lang.Object wrapper_arg_4 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      trips2bel.Sent3_0 conv1_HeadVar__4_4 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_27 = null;

      {
        java.lang.Object [] result = trips2bel.conv_sent3_6_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((java.lang.Integer) (((java.lang.Object[]) closure)[4])).intValue(), ((trips2bel.Sent2_0) wrapper_arg_1), ((list.List_1) wrapper_arg_3));
        conv1_HeadVar__4_4 = (trips2bel.Sent3_0) result[0];
        conv0_STATE_VARIABLE_Es_27 = (list.List_1) result[1];
      }
      wrapper_arg_2 = ((java.lang.Object) (conv1_HeadVar__4_4));
      wrapper_arg_4 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_27));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_2)),
        ((java.lang.Object) (wrapper_arg_4))
      };
    }
  }
//  trips2bel.m:145
  private static java.lang.Object [] conv_turn3_5_p_0(
    java.lang.String F_6,
    trips2bel.Turn2_0 HeadVar__2_2,
    list.List_1 STATE_VARIABLE_Es_0_13)
  {
//  trips2bel.m:147
    {
      boolean succeeded = false;
      trips2bel.Turn3_0 Turn2_10 = null;
      list.List_1 STATE_VARIABLE_Es_14 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_21_21 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_22_22 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_23_23 = null;
      int Trn_7 = ((trips2bel.Turn2_0) HeadVar__2_2).F1;
      java.lang.String Spk_8 = ((trips2bel.Turn2_0) HeadVar__2_2).F2;
      list.List_1 Sents_9 = ((trips2bel.Turn2_0) HeadVar__2_2).F3;
      list.List_1 Sents2_12 = null;
      /* closure */ java.lang.Object[] V_15_15 = null;
//  trips2bel.m:148
      java.lang.Object conv2_STATE_VARIABLE_Es_14 = null;

      {
        V_15_15 = new /* closure */ java.lang.Object[] {((java.lang.Object) (trips2bel.MR_scalar_common_4[2])), ((java.lang.Object) (new AddrOf3_0(6))), java.lang.Integer.valueOf(2), ((java.lang.Object) (F_6)), java.lang.Integer.valueOf(Trn_7)};
      }
      TypeCtorInfo_21_21 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_sent2_0);
      TypeCtorInfo_22_22 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_sent3_0);
      TypeInfo_23_23 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[0]);
      {
        java.lang.Object [] result = list.map_foldl_5_p_0(TypeCtorInfo_21_21, TypeCtorInfo_22_22, TypeInfo_23_23, V_15_15, Sents_9, ((java.lang.Object) (STATE_VARIABLE_Es_0_13)));
        Sents2_12 = (list.List_1) result[0];
        conv2_STATE_VARIABLE_Es_14 = (java.lang.Object) result[1];
      }
      STATE_VARIABLE_Es_14 = ((list.List_1) conv2_STATE_VARIABLE_Es_14);
//  trips2bel.m:149
      {
        Turn2_10 = new trips2bel.Turn3_0(Trn_7, Spk_8, Sents2_12);
      }
//  trips2bel.m:147
return new java.lang.Object[] {
        ((java.lang.Object) (Turn2_10)),
        ((java.lang.Object) (STATE_VARIABLE_Es_14))
      };
    }
//  trips2bel.m:145
  }
//  trips2bel.m:130
  private static java.lang.Object [] conv_vardef_7_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_4)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      java.lang.Object wrapper_arg_5 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      list.List_1 conv1_STATE_VARIABLE_As_18 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_20 = null;

      {
        java.lang.Object [] result = trips2bel.conv_attr_7_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((java.lang.Integer) (((java.lang.Object[]) closure)[4])).intValue(), ((pair.Pair_2) wrapper_arg_1), ((list.List_1) wrapper_arg_2), ((list.List_1) wrapper_arg_4));
        conv1_STATE_VARIABLE_As_18 = (list.List_1) result[0];
        conv0_STATE_VARIABLE_Es_20 = (list.List_1) result[1];
      }
      wrapper_arg_3 = ((java.lang.Object) (conv1_STATE_VARIABLE_As_18));
      wrapper_arg_5 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_20));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_3)),
        ((java.lang.Object) (wrapper_arg_5))
      };
    }
  }
//  trips2bel.m:126
  private static java.lang.Object [] conv_vardef_7_p_0(
    maybe.Maybe_1 Data_8,
    java.lang.String F_9,
    trips2bel.Vardef_0 HeadVar__3_3,
    tree234.Tree234_2 STATE_VARIABLE_Map_0_19,
    list.List_1 STATE_VARIABLE_Es_0_21)
  {
//  trips2bel.m:128
    {
      boolean succeeded = false;
      tree234.Tree234_2 STATE_VARIABLE_Map_20 = null;
      list.List_1 STATE_VARIABLE_Es_22 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_38_38 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_39_39 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_40_40 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_41_41 = null;
      trips2bel.Tconst_0 TC_10 = ((trips2bel.Vardef_0) HeadVar__3_3).F1;
      int V_11 = ((trips2bel.Vardef_0) HeadVar__3_3).F2;
      java.lang.String CN_12 = ((trips2bel.Vardef_0) HeadVar__3_3).F3;
      list.List_1 As_13 = ((trips2bel.Vardef_0) HeadVar__3_3).F4;
      trips2bel.Concept2_0 CN2_16 = null;
      list.List_1 RevAs2_17 = null;
      list.List_1 As2_18 = null;
      list.List_1 STATE_VARIABLE_Es_23_23 = null;
      /* closure */ java.lang.Object[] V_24_24 = null;
      list.List_1 V_25_25 = null;
      list.List_1 STATE_VARIABLE_Es_26_26 = null;
//  trips2bel.m:275
      java.lang.String X_53 = null;
//  trips2bel.m:270
      java.lang.String Temp_52 = null;
      java.lang.String V_56_56 = "(:* ONT::";
      java.lang.String V_57_57 = null;
//  trips2bel.m:130
      java.lang.Object conv3_RevAs2_17 = null;
      java.lang.Object conv2_STATE_VARIABLE_Es_26_26 = null;
//  trips2bel.m:133
      tree234.Tree234_2 STATE_VARIABLE_Map_28_28 = null;
//  trips2bel.m:131
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_43_43 = null;
      trips2bel.Vardef2_0 V_27_27 = null;

//  trips2bel.m:270
      {
        java.lang.Object [] result = string.remove_prefix_3_p_0(V_56_56, CN_12);
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        Temp_52 = (java.lang.String) result[1];
      }
      if (succeeded)
        {
          V_57_57 = ")";
          {
            java.lang.Object [] result = string.remove_suffix_3_p_0(Temp_52, V_57_57);
            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
            X_53 = (java.lang.String) result[1];
          }
        }
//  trips2bel.m:275
      if (succeeded)
//  trips2bel.m:274
        {
          java.lang.String Word_55 = null;
//  trips2bel.m:271
          int I_54 = 0;
          java.lang.String V_58_58 = " W::";
          int V_59_59 = 0;
          int V_60_60 = 0;
          int V_61_61 = 0;

          {
            java.lang.Object [] result = string.sub_string_search_3_p_0(X_53, V_58_58);
            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
            I_54 = ((java.lang.Integer) result[1]).intValue();
          }
          if (succeeded)
            {
//  trips2bel.m:272
              V_61_61 = 4;
              V_59_59 = (I_54 + V_61_61);
              {
                V_60_60 = string.length_1_f_0(X_53);
              }
              {
                Word_55 = string.between_4_p_0(X_53, V_59_59, V_60_60);
              }
              succeeded = true;
//  trips2bel.m:271
            }
//  trips2bel.m:274
          if (succeeded)
//  trips2bel.m:273
            {
              CN2_16 = trips2bel.word_concept_2_f_0(Data_8, Word_55);
            }
//  trips2bel.m:274
          else
            CN2_16 = (trips2bel.Concept2_0) trips2bel.MR_scalar_common_9[0];
          STATE_VARIABLE_Es_23_23 = STATE_VARIABLE_Es_0_21;
        }
//  trips2bel.m:275
      else
//  trips2bel.m:277
        {
//  trips2bel.m:275
          succeeded = CN_12.equals("(ONT::SET-OF ONT::PERSON)");
//  trips2bel.m:277
          if (succeeded)
//  trips2bel.m:276
            {
              CN2_16 = (trips2bel.Concept2_0) trips2bel.MR_scalar_common_9[0];
              STATE_VARIABLE_Es_23_23 = STATE_VARIABLE_Es_0_21;
            }
//  trips2bel.m:277
          else
//  trips2bel.m:279
            {
//  trips2bel.m:277
              succeeded = CN_12.equals("NIL");
//  trips2bel.m:279
              if (succeeded)
//  trips2bel.m:278
                {
                  CN2_16 = (trips2bel.Concept2_0) trips2bel.MR_scalar_common_10[0];
                  STATE_VARIABLE_Es_23_23 = STATE_VARIABLE_Es_0_21;
                }
//  trips2bel.m:279
              else
//  trips2bel.m:281
                {
//  trips2bel.m:279
                  succeeded = CN_12.equals("-");
//  trips2bel.m:281
                  if (succeeded)
//  trips2bel.m:280
                    {
                      CN2_16 = (trips2bel.Concept2_0) trips2bel.MR_scalar_common_10[0];
                      STATE_VARIABLE_Es_23_23 = STATE_VARIABLE_Es_0_21;
                    }
//  trips2bel.m:281
                  else
//  trips2bel.m:283
                    {
                      java.lang.String X_68 = null;
//  trips2bel.m:281
                      java.lang.String V_62_62 = "ONT::";

                      {
                        java.lang.Object [] result = string.remove_prefix_3_p_0(V_62_62, CN_12);
                        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                        X_68 = (java.lang.String) result[1];
                      }
//  trips2bel.m:283
                      if (succeeded)
//  trips2bel.m:282
                        {
                          {
                            CN2_16 = new trips2bel.Concept2_0.Super_1(X_68);
                          }
                          STATE_VARIABLE_Es_23_23 = STATE_VARIABLE_Es_0_21;
                        }
//  trips2bel.m:283
                      else
//  trips2bel.m:285
                        {
                          java.lang.String X_67 = null;
//  trips2bel.m:283
                          java.lang.String V_63_63 = "W::";

                          {
                            java.lang.Object [] result = string.remove_prefix_3_p_0(V_63_63, CN_12);
                            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                            X_67 = (java.lang.String) result[1];
                          }
//  trips2bel.m:285
                          if (succeeded)
//  trips2bel.m:284
                            {
                              {
                                CN2_16 = trips2bel.word_concept_2_f_0(Data_8, X_67);
                              }
                              STATE_VARIABLE_Es_23_23 = STATE_VARIABLE_Es_0_21;
                            }
//  trips2bel.m:285
                          else
                            {
                              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_34_72 = null;
                              errors.Err_loc_0 V_64_64 = null;
                              sberrs.Error_0 V_65_65 = null;

                              {
                                V_64_64 = new errors.Err_loc_0.File_1(F_9);
                              }
                              {
                                V_65_65 = new sberrs.Error_0.Funny_concept_1(CN_12);
                              }
                              TypeCtorInfo_34_72 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
                              {
                                STATE_VARIABLE_Es_23_23 = errors.add_error_4_p_0(TypeCtorInfo_34_72, V_64_64, ((java.lang.Object) (V_65_65)), STATE_VARIABLE_Es_0_21);
                              }
//  trips2bel.m:286
                              CN2_16 = (trips2bel.Concept2_0) trips2bel.MR_scalar_common_10[0];
//  trips2bel.m:285
                            }
                        }
//  trips2bel.m:283
                    }
//  trips2bel.m:281
                }
//  trips2bel.m:279
            }
//  trips2bel.m:277
        }
//  trips2bel.m:130
      {
        V_24_24 = new /* closure */ java.lang.Object[] {((java.lang.Object) (trips2bel.MR_scalar_common_8[1])), ((java.lang.Object) (new AddrOf4_0(1))), java.lang.Integer.valueOf(2), ((java.lang.Object) (F_9)), java.lang.Integer.valueOf(V_11)};
      }
      V_25_25 = (list.List_1) trips2bel.MR_scalar_common_3[0];
      TypeInfo_38_38 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[13]);
      TypeInfo_39_39 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[14]);
      TypeInfo_40_40 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[0]);
      {
        java.lang.Object [] result = list.foldl2_6_p_0(TypeInfo_38_38, TypeInfo_39_39, TypeInfo_40_40, V_24_24, As_13, ((java.lang.Object) (V_25_25)), ((java.lang.Object) (STATE_VARIABLE_Es_23_23)));
        conv3_RevAs2_17 = (java.lang.Object) result[0];
        conv2_STATE_VARIABLE_Es_26_26 = (java.lang.Object) result[1];
      }
      RevAs2_17 = ((list.List_1) conv3_RevAs2_17);
      STATE_VARIABLE_Es_26_26 = ((list.List_1) conv2_STATE_VARIABLE_Es_26_26);
      TypeCtorInfo_41_41 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_attr2_0);
      {
        As2_18 = list.reverse_2_p_0(TypeCtorInfo_41_41, RevAs2_17);
      }
//  trips2bel.m:131
      {
        V_27_27 = new trips2bel.Vardef2_0(TC_10, CN2_16, As2_18);
      }
      TypeCtorInfo_43_43 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_vardef2_0);
      {
        java.lang.Object [] result = map.f_84_121_112_101_83_112_101_99_79_102_95_95_112_114_101_100_95_95_105_110_115_101_114_116_95_95_91_75_32_61_32_105_110_116_93_95_48_95_49_4_p_0(TypeCtorInfo_43_43, V_11, ((java.lang.Object) (V_27_27)), STATE_VARIABLE_Map_0_19);
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        STATE_VARIABLE_Map_28_28 = (tree234.Tree234_2) result[1];
      }
//  trips2bel.m:133
      if (succeeded)
//  trips2bel.m:132
        {
          STATE_VARIABLE_Map_20 = STATE_VARIABLE_Map_28_28;
          STATE_VARIABLE_Es_22 = STATE_VARIABLE_Es_26_26;
        }
//  trips2bel.m:133
      else
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_44_44 = null;
          errors.Err_loc_0 V_29_29 = null;
          sberrs.Error_0 V_30_30 = null;

          {
            V_29_29 = new errors.Err_loc_0.File_1(F_9);
          }
          {
            V_30_30 = new sberrs.Error_0.Dupl_vardef_1(V_11);
          }
          TypeCtorInfo_44_44 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
          {
            STATE_VARIABLE_Es_22 = errors.add_error_4_p_0(TypeCtorInfo_44_44, V_29_29, ((java.lang.Object) (V_30_30)), STATE_VARIABLE_Es_26_26);
          }
          STATE_VARIABLE_Map_20 = STATE_VARIABLE_Map_0_19;
        }
//  trips2bel.m:128
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_Map_20)),
        ((java.lang.Object) (STATE_VARIABLE_Es_22))
      };
    }
//  trips2bel.m:126
  }
//  trips2bel.m:123
  private static java.lang.Object [] conv_sent_6_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_4)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      java.lang.Object wrapper_arg_5 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      tree234.Tree234_2 conv1_STATE_VARIABLE_Map_20 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_22 = null;

      {
        java.lang.Object [] result = trips2bel.conv_vardef_7_p_0(((maybe.Maybe_1) ((java.lang.Object[]) closure)[3]), ((java.lang.String) ((java.lang.Object[]) closure)[4]), ((trips2bel.Vardef_0) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2), ((list.List_1) wrapper_arg_4));
        conv1_STATE_VARIABLE_Map_20 = (tree234.Tree234_2) result[0];
        conv0_STATE_VARIABLE_Es_22 = (list.List_1) result[1];
      }
      wrapper_arg_3 = ((java.lang.Object) (conv1_STATE_VARIABLE_Map_20));
      wrapper_arg_5 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_22));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_3)),
        ((java.lang.Object) (wrapper_arg_5))
      };
    }
  }
//  trips2bel.m:120
  private static java.lang.Object [] conv_sent_6_p_0(
    maybe.Maybe_1 Data_7,
    java.lang.String F_8,
    trips2bel.Sent_0 HeadVar__3_3,
    list.List_1 STATE_VARIABLE_Es_0_14)
  {
//  trips2bel.m:122
    {
      boolean succeeded = false;
      trips2bel.Sent2_0 HeadVar__4_4 = null;
      list.List_1 STATE_VARIABLE_Es_15 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_24_24 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_25_25 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_26_26 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_27_27 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_28_28 = null;
      list.List_1 Txt_9 = ((trips2bel.Sent_0) HeadVar__3_3).F1;
      trips2bel.Exptp_0 Exp_10 = ((trips2bel.Sent_0) HeadVar__3_3).F2;
      list.List_1 Vs_11 = ((trips2bel.Sent_0) HeadVar__3_3).F3;
      tree234.Tree234_2 Map_12 = null;
      /* closure */ java.lang.Object[] V_16_16 = null;
      tree234.Tree234_2 V_17_17 = null;
//  trips2bel.m:123
      java.lang.Object conv3_Map_12 = null;
      java.lang.Object conv2_STATE_VARIABLE_Es_15 = null;

      {
        V_16_16 = new /* closure */ java.lang.Object[] {((java.lang.Object) (trips2bel.MR_scalar_common_8[0])), ((java.lang.Object) (new AddrOf4_0(2))), java.lang.Integer.valueOf(2), ((java.lang.Object) (Data_7)), ((java.lang.Object) (F_8))};
      }
      TypeCtorInfo_24_24 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
      TypeCtorInfo_25_25 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_vardef2_0);
      {
        V_17_17 = map.init_0_f_0(TypeCtorInfo_24_24, TypeCtorInfo_25_25);
      }
      TypeCtorInfo_26_26 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_vardef_0);
      TypeInfo_27_27 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[11]);
      TypeInfo_28_28 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[0]);
      {
        java.lang.Object [] result = list.foldl2_6_p_0(TypeCtorInfo_26_26, TypeInfo_27_27, TypeInfo_28_28, V_16_16, Vs_11, ((java.lang.Object) (V_17_17)), ((java.lang.Object) (STATE_VARIABLE_Es_0_14)));
        conv3_Map_12 = (java.lang.Object) result[0];
        conv2_STATE_VARIABLE_Es_15 = (java.lang.Object) result[1];
      }
      Map_12 = ((tree234.Tree234_2) conv3_Map_12);
      STATE_VARIABLE_Es_15 = ((list.List_1) conv2_STATE_VARIABLE_Es_15);
//  trips2bel.m:122
      {
        HeadVar__4_4 = new trips2bel.Sent2_0(Txt_9, Exp_10, Map_12);
      }
return new java.lang.Object[] {
        ((java.lang.Object) (HeadVar__4_4)),
        ((java.lang.Object) (STATE_VARIABLE_Es_15))
      };
    }
//  trips2bel.m:120
  }
//  trips2bel.m:116
  private static java.lang.Object [] conv_turn_6_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      java.lang.Object wrapper_arg_4 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      trips2bel.Sent2_0 conv1_HeadVar__4_4 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_15 = null;

      {
        java.lang.Object [] result = trips2bel.conv_sent_6_p_0(((maybe.Maybe_1) ((java.lang.Object[]) closure)[3]), ((java.lang.String) ((java.lang.Object[]) closure)[4]), ((trips2bel.Sent_0) wrapper_arg_1), ((list.List_1) wrapper_arg_3));
        conv1_HeadVar__4_4 = (trips2bel.Sent2_0) result[0];
        conv0_STATE_VARIABLE_Es_15 = (list.List_1) result[1];
      }
      wrapper_arg_2 = ((java.lang.Object) (conv1_HeadVar__4_4));
      wrapper_arg_4 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_15));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_2)),
        ((java.lang.Object) (wrapper_arg_4))
      };
    }
  }
//  trips2bel.m:113
  private static java.lang.Object [] conv_turn_6_p_0(
    maybe.Maybe_1 Data_7,
    java.lang.String F_8,
    trips2bel.Turn_0 HeadVar__3_3,
    list.List_1 STATE_VARIABLE_Es_0_15)
  {
//  trips2bel.m:115
    {
      boolean succeeded = false;
      trips2bel.Turn2_0 Turn2_12 = null;
      list.List_1 STATE_VARIABLE_Es_16 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_23_23 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_24_24 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_25_25 = null;
      int Trn_9 = ((trips2bel.Turn_0) HeadVar__3_3).F1;
      java.lang.String Spk_10 = ((trips2bel.Turn_0) HeadVar__3_3).F2;
      list.List_1 Sents_11 = ((trips2bel.Turn_0) HeadVar__3_3).F3;
      list.List_1 Sents2_14 = null;
      /* closure */ java.lang.Object[] V_17_17 = null;
//  trips2bel.m:116
      java.lang.Object conv2_STATE_VARIABLE_Es_16 = null;

      {
        V_17_17 = new /* closure */ java.lang.Object[] {((java.lang.Object) (trips2bel.MR_scalar_common_4[1])), ((java.lang.Object) (new AddrOf3_0(7))), java.lang.Integer.valueOf(2), ((java.lang.Object) (Data_7)), ((java.lang.Object) (F_8))};
      }
      TypeCtorInfo_23_23 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_sent_0);
      TypeCtorInfo_24_24 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_sent2_0);
      TypeInfo_25_25 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[0]);
      {
        java.lang.Object [] result = list.map_foldl_5_p_0(TypeCtorInfo_23_23, TypeCtorInfo_24_24, TypeInfo_25_25, V_17_17, Sents_11, ((java.lang.Object) (STATE_VARIABLE_Es_0_15)));
        Sents2_14 = (list.List_1) result[0];
        conv2_STATE_VARIABLE_Es_16 = (java.lang.Object) result[1];
      }
      STATE_VARIABLE_Es_16 = ((list.List_1) conv2_STATE_VARIABLE_Es_16);
//  trips2bel.m:117
      {
        Turn2_12 = new trips2bel.Turn2_0(Trn_9, Spk_10, Sents2_14);
      }
//  trips2bel.m:115
return new java.lang.Object[] {
        ((java.lang.Object) (Turn2_12)),
        ((java.lang.Object) (STATE_VARIABLE_Es_16))
      };
    }
//  trips2bel.m:113
  }
//  trips2bel.m:99
  private static java.lang.Object [] read_exprs_9_p_0(
    java.lang.String File_10,
    java.lang.String Str_11,
    int Max_12,
    io.Posn_0 STATE_VARIABLE_Pos_0_20,
    list.List_1 STATE_VARIABLE_Ts_0_22,
    list.List_1 STATE_VARIABLE_Es_0_24)
  {
//  trips2bel.m:101
    while (true)
      {
        /* tailcall optimized into a loop */
        {
          boolean succeeded = false;
          io.Posn_0 STATE_VARIABLE_Pos_21 = null;
          list.List_1 STATE_VARIABLE_Ts_23 = null;
          list.List_1 STATE_VARIABLE_Es_25 = null;
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_34_34 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_turn_0);
          io.Read_result_1 Res_16 = null;
          io.Posn_0 STATE_VARIABLE_Pos_26_26 = null;

//  trips2bel.m:102
          {
            java.lang.Object [] result = io.read_from_string_6_p_0(TypeCtorInfo_34_34, File_10, Str_11, Max_12, STATE_VARIABLE_Pos_0_20);
            Res_16 = (io.Read_result_1) result[0];
            STATE_VARIABLE_Pos_26_26 = (io.Posn_0) result[1];
          }
//  trips2bel.m:104
          switch (Res_16.data_tag) {
            case 0:
//  trips2bel.m:103
              {
                STATE_VARIABLE_Pos_21 = STATE_VARIABLE_Pos_26_26;
                STATE_VARIABLE_Ts_23 = STATE_VARIABLE_Ts_0_22;
                STATE_VARIABLE_Es_25 = STATE_VARIABLE_Es_0_24;
              }
//  trips2bel.m:104
              break;
            case 1:
//  trips2bel.m:106
              {
                trips2bel.Turn_0 Turn_19 = ((trips2bel.Turn_0) ((io.Read_result_1.Ok_1) Res_16).F1);
                list.List_1 STATE_VARIABLE_Ts_27_27 = null;

                {
                  STATE_VARIABLE_Ts_27_27 = new list.List_1.F_cons_2(((java.lang.Object) (Turn_19)), STATE_VARIABLE_Ts_0_22);
                }
//  trips2bel.m:107
                /* direct tailcall eliminated */
                {
                  io.Posn_0 STATE_VARIABLE_Pos_0__tmp_copy_20 = STATE_VARIABLE_Pos_26_26;
                  list.List_1 STATE_VARIABLE_Ts_0__tmp_copy_22 = STATE_VARIABLE_Ts_27_27;

                  STATE_VARIABLE_Ts_0_22 = STATE_VARIABLE_Ts_0__tmp_copy_22;
                  STATE_VARIABLE_Pos_0_20 = STATE_VARIABLE_Pos_0__tmp_copy_20;
                }
                continue;
//  trips2bel.m:106
              }
//  trips2bel.m:104
            case 2:
              {
                jmercury.runtime.TypeInfo_Struct TypeCtorInfo_35_35 = null;
                java.lang.String Msg_17 = ((io.Read_result_1.Error_2) Res_16).F1;
                int Line_18 = ((io.Read_result_1.Error_2) Res_16).F2;
                errors.Err_loc_0 V_31_31 = null;
                sberrs.Error_0 V_32_32 = null;

//  trips2bel.m:105
                {
                  V_31_31 = new errors.Err_loc_0.File_1(File_10);
                }
                {
                  V_32_32 = new sberrs.Error_0.Io_2(Msg_17, Line_18);
                }
                TypeCtorInfo_35_35 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
                {
                  STATE_VARIABLE_Es_25 = errors.add_error_4_p_0(TypeCtorInfo_35_35, V_31_31, ((java.lang.Object) (V_32_32)), STATE_VARIABLE_Es_0_24);
                }
                STATE_VARIABLE_Pos_21 = STATE_VARIABLE_Pos_26_26;
                STATE_VARIABLE_Ts_23 = STATE_VARIABLE_Ts_0_22;
//  trips2bel.m:104
              }
              break;
            default: /*NOTREACHED*/
              throw new jmercury.runtime.UnreachableDefault();
          }
//  trips2bel.m:101
return new java.lang.Object[] {
            ((java.lang.Object) (STATE_VARIABLE_Pos_21)),
            ((java.lang.Object) (STATE_VARIABLE_Ts_23)),
            ((java.lang.Object) (STATE_VARIABLE_Es_25))
          };
        }
      }
//  trips2bel.m:99
  }
//  trips2bel.m:77
  public static java.lang.Object [] owlprop_3_p_0(
    trips2bel.Expr_0 HeadVar__1_1,
    tree234.Tree234_2 Smap_2)
  {
//  trips2bel.m:504
    {
      boolean succeeded = false;
      java.lang.String Str_3 = null;

      if ((HeadVar__1_1.data_tag == 0))
        {
          bool.Bool_0 B_4 = ((trips2bel.Expr_0.Class_3) HeadVar__1_1).F1;
          trips2bel.Concept2_0 C_5 = ((trips2bel.Expr_0.Class_3) HeadVar__1_1).F2;
          trips2bel.Cvar_0 V_6 = ((trips2bel.Expr_0.Class_3) HeadVar__1_1).F3;
          java.lang.String S_9 = null;
          java.lang.String OS_10 = null;
          java.lang.String CS_11 = null;
          java.lang.String V_25_25 = null;
          java.lang.String V_45_45 = null;
          java.lang.String V_46_46 = null;
          java.lang.String V_47_47 = null;
          java.lang.String V_48_48 = null;
          java.lang.String V_49_49 = null;
          java.lang.String V_50_50 = null;

//  trips2bel.m:505
          switch (/* tag */  0) {
            case 0:
              switch (C_5.data_tag) {
                case 2:
                  {
                    S_9 = ((trips2bel.Concept2_0.Super_1) C_5).F1;
                    succeeded = true;
                  }
                  break;
                case 3:
                  {
                    S_9 = ((trips2bel.Concept2_0.Wordnet_1) C_5).F1;
                    succeeded = true;
                  }
                  break;
                case 4:
                  {
                    S_9 = ((trips2bel.Concept2_0.Closedclass_1) C_5).F1;
                    succeeded = true;
                  }
                  break;
                case 5:
                  {
                    S_9 = ((trips2bel.Concept2_0.Unrecognised_1) C_5).F1;
                    succeeded = true;
                  }
                  break;
                default:
                  succeeded = false;
              }
              break;
            default:
              succeeded = false;
          }
//  trips2bel.m:504
          if (succeeded)
            {
//  trips2bel.m:506
              {
                OS_10 = utils.owlify_2_p_0(S_9);
              }
//  trips2bel.m:508
              switch (B_4.MR_value) {
                case 0:
                  {
                    java.lang.String V_51_51 = " )";
                    java.lang.String V_52_52 = null;
                    java.lang.String V_53_53 = null;

                    {
                      V_52_52 = string.f_43_43_2_f_0(OS_10, V_51_51);
                    }
                    V_53_53 = "ObjectComplementOf( cubism:";
                    {
                      CS_11 = string.f_43_43_2_f_0(V_53_53, V_52_52);
                    }
                  }
                  break;
                case 1:
//  trips2bel.m:507
                  {
                    java.lang.String V_54_54 = "cubism:";

                    {
                      CS_11 = string.f_43_43_2_f_0(V_54_54, OS_10);
                    }
                  }
//  trips2bel.m:508
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
//  trips2bel.m:509
              {
                V_25_25 = trips2bel.sym_2_f_0(V_6, Smap_2);
              }
              V_45_45 = ")";
              {
                V_46_46 = string.f_43_43_2_f_0(V_25_25, V_45_45);
              }
              V_47_47 = " cubism:";
              {
                V_48_48 = string.f_43_43_2_f_0(V_47_47, V_46_46);
              }
              {
                V_49_49 = string.f_43_43_2_f_0(CS_11, V_48_48);
              }
              V_50_50 = "ClassAssertion(";
              {
                Str_3 = string.f_43_43_2_f_0(V_50_50, V_49_49);
              }
              succeeded = true;
//  trips2bel.m:504
            }
        }
      else
//  trips2bel.m:510
        {
          java.lang.String Nm_27 = ((trips2bel.Expr_0.Objprop_3) HeadVar__1_1).F1;
          trips2bel.Cvar_0 V1_28 = ((trips2bel.Expr_0.Objprop_3) HeadVar__1_1).F2;
          trips2bel.Cvar_0 V2_29 = ((trips2bel.Expr_0.Objprop_3) HeadVar__1_1).F3;
          java.lang.String Pr_32 = "ObjectPropertyAssertion";
          java.lang.String S1_33 = null;
          java.lang.String S2_34 = null;
          java.lang.String V_55_55 = null;
          java.lang.String V_56_56 = null;
          java.lang.String V_57_57 = null;
          java.lang.String V_58_58 = null;
          java.lang.String V_59_59 = null;
          java.lang.String V_60_60 = null;
          java.lang.String V_61_61 = null;
          java.lang.String V_62_62 = null;
          java.lang.String V_63_63 = null;
          java.lang.String V_64_64 = null;

//  trips2bel.m:511
          {
            S1_33 = trips2bel.sym_2_f_0(V1_28, Smap_2);
          }
          {
            S2_34 = trips2bel.sym_2_f_0(V2_29, Smap_2);
          }
          V_55_55 = ")";
          {
            V_56_56 = string.f_43_43_2_f_0(S2_34, V_55_55);
          }
          V_57_57 = " cubism:";
          {
            V_58_58 = string.f_43_43_2_f_0(V_57_57, V_56_56);
          }
          {
            V_59_59 = string.f_43_43_2_f_0(S1_33, V_58_58);
          }
          V_60_60 = " cubism:";
          {
            V_61_61 = string.f_43_43_2_f_0(V_60_60, V_59_59);
          }
          {
            V_62_62 = string.f_43_43_2_f_0(Nm_27, V_61_61);
          }
          V_63_63 = "(cubism:";
          {
            V_64_64 = string.f_43_43_2_f_0(V_63_63, V_62_62);
          }
          {
            Str_3 = string.f_43_43_2_f_0(Pr_32, V_64_64);
          }
//  trips2bel.m:510
          succeeded = true;
        }
//  trips2bel.m:504
return new java.lang.Object[] {
        java.lang.Boolean.valueOf(succeeded),
        ((java.lang.Object) (Str_3))
      };
    }
//  trips2bel.m:77
  }
//  trips2bel.m:199
  private static java.lang.Object [] corefs_7_p_0_2(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_4,
    java.lang.Object wrapper_arg_6,
    java.lang.Object wrapper_arg_8,
    java.lang.Object wrapper_arg_10)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      java.lang.Object wrapper_arg_5 = null;
      java.lang.Object wrapper_arg_7 = null;
      java.lang.Object wrapper_arg_9 = null;
      java.lang.Object wrapper_arg_11 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      int conv10_STATE_VARIABLE_I_30 = 0;
      set_ordlist.Set_ordlist_1 conv9_STATE_VARIABLE_CS_32 = null;
      tree234.Tree234_2 conv8_STATE_VARIABLE_Vmap_34 = null;
      tree234.Tree234_2 conv7_STATE_VARIABLE_Mmap_36 = null;
      list.List_1 conv6_STATE_VARIABLE_Gs_38 = null;

      {
        java.lang.Object [] result = trips2bel.create_class_12_p_0(((tree234.Tree234_2) ((java.lang.Object[]) closure)[3]), ((set_ordlist.Set_ordlist_1) wrapper_arg_1), ((java.lang.Integer) wrapper_arg_2).intValue(), ((set_ordlist.Set_ordlist_1) wrapper_arg_4), ((tree234.Tree234_2) wrapper_arg_6), ((tree234.Tree234_2) wrapper_arg_8), ((list.List_1) wrapper_arg_10));
        conv10_STATE_VARIABLE_I_30 = ((java.lang.Integer) result[0]).intValue();
        conv9_STATE_VARIABLE_CS_32 = (set_ordlist.Set_ordlist_1) result[1];
        conv8_STATE_VARIABLE_Vmap_34 = (tree234.Tree234_2) result[2];
        conv7_STATE_VARIABLE_Mmap_36 = (tree234.Tree234_2) result[3];
        conv6_STATE_VARIABLE_Gs_38 = (list.List_1) result[4];
      }
      wrapper_arg_3 = java.lang.Integer.valueOf(conv10_STATE_VARIABLE_I_30);
      wrapper_arg_5 = ((java.lang.Object) (conv9_STATE_VARIABLE_CS_32));
      wrapper_arg_7 = ((java.lang.Object) (conv8_STATE_VARIABLE_Vmap_34));
      wrapper_arg_9 = ((java.lang.Object) (conv7_STATE_VARIABLE_Mmap_36));
      wrapper_arg_11 = ((java.lang.Object) (conv6_STATE_VARIABLE_Gs_38));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_3)),
        ((java.lang.Object) (wrapper_arg_5)),
        ((java.lang.Object) (wrapper_arg_7)),
        ((java.lang.Object) (wrapper_arg_9)),
        ((java.lang.Object) (wrapper_arg_11))
      };
    }
  }
//  trips2bel.m:196
  private static java.lang.Object [] corefs_7_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_4,
    java.lang.Object wrapper_arg_6)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      java.lang.Object wrapper_arg_5 = null;
      java.lang.Object wrapper_arg_7 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      tree234.Tree234_2 conv2_STATE_VARIABLE_Map_17 = null;
      tree234.Tree234_2 conv1_STATE_VARIABLE_Rmap_19 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_21 = null;

      {
        java.lang.Object [] result = trips2bel.turn_cs_8_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((trips2bel.Turn2_0) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2), ((tree234.Tree234_2) wrapper_arg_4), ((list.List_1) wrapper_arg_6));
        conv2_STATE_VARIABLE_Map_17 = (tree234.Tree234_2) result[0];
        conv1_STATE_VARIABLE_Rmap_19 = (tree234.Tree234_2) result[1];
        conv0_STATE_VARIABLE_Es_21 = (list.List_1) result[2];
      }
      wrapper_arg_3 = ((java.lang.Object) (conv2_STATE_VARIABLE_Map_17));
      wrapper_arg_5 = ((java.lang.Object) (conv1_STATE_VARIABLE_Rmap_19));
      wrapper_arg_7 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_21));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_3)),
        ((java.lang.Object) (wrapper_arg_5)),
        ((java.lang.Object) (wrapper_arg_7))
      };
    }
  }
//  trips2bel.m:75
  public static java.lang.Object [] corefs_7_p_0(
    java.lang.String File_8,
    list.List_1 Ts_9,
    maybe.Maybe_1 MWN_10,
    list.List_1 STATE_VARIABLE_Es_0_26)
  {
//  trips2bel.m:195
    {
      boolean succeeded = false;
      tree234.Tree234_2 VM_11 = null;
      utils.Corefs_0 CM_12 = null;
      list.List_1 STATE_VARIABLE_Es_27 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_44_44 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_45_45 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_46_46 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_47_47 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_48_48 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_49_49 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_50_50 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_51_51 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_52_52 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_64_64 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_65_65 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_66_66 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_67_67 = null;
      tree234.Tree234_2 Map_14 = null;
      tree234.Tree234_2 Rmap_15 = null;
      list.List_1 Ks_16 = null;
      set_ordlist.Set_ordlist_1 CS0_17 = null;
      tree234.Tree234_2 Mmap0_18 = null;
      tree234.Tree234_2 VM0_19 = null;
      set_ordlist.Set_ordlist_1 Cls_20 = null;
      list.List_1 Cs_21 = null;
      set_ordlist.Set_ordlist_1 CS_23 = null;
      tree234.Tree234_2 Mmap_24 = null;
      list.List_1 Gs_25 = null;
      /* closure */ java.lang.Object[] V_28_28 = null;
      tree234.Tree234_2 V_29_29 = null;
      tree234.Tree234_2 V_30_30 = null;
      set_ordlist.Set_ordlist_1 V_32_32 = null;
      /* closure */ java.lang.Object[] V_33_33 = null;
      int V_34_34 = 0;
      list.List_1 V_35_35 = null;
      list.List_1 V_36_36 = null;
//  trips2bel.m:196
      java.lang.Object conv5_Map_14 = null;
      java.lang.Object conv4_Rmap_15 = null;
      java.lang.Object conv3_STATE_VARIABLE_Es_27 = null;
//  trips2bel.m:199
      int V_22_22 = 0;
      java.lang.Object conv15_V_22_22 = null;
      java.lang.Object conv14_CS_23 = null;
      java.lang.Object conv13_VM_11 = null;
      java.lang.Object conv12_Mmap_24 = null;
      java.lang.Object conv11_Gs_25 = null;

//  trips2bel.m:196
      {
        V_28_28 = new /* closure */ java.lang.Object[] {((java.lang.Object) (trips2bel.MR_scalar_common_6[0])), ((java.lang.Object) (new AddrOf5_0(2))), java.lang.Integer.valueOf(1), ((java.lang.Object) (File_8))};
      }
      TypeCtorInfo_44_44 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_cvar_0);
      TypeInfo_45_45 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[2]);
      {
        V_29_29 = map.init_0_f_0(TypeCtorInfo_44_44, TypeInfo_45_45);
      }
      {
        V_30_30 = multi_map.init_0_f_0(TypeCtorInfo_44_44, TypeCtorInfo_44_44);
      }
      TypeCtorInfo_46_46 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_turn2_0);
      TypeInfo_47_47 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[3]);
      TypeInfo_48_48 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[4]);
      TypeInfo_49_49 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[0]);
      {
        java.lang.Object [] result = list.foldl3_8_p_0(TypeCtorInfo_46_46, TypeInfo_47_47, TypeInfo_48_48, TypeInfo_49_49, V_28_28, Ts_9, ((java.lang.Object) (V_29_29)), ((java.lang.Object) (V_30_30)), ((java.lang.Object) (STATE_VARIABLE_Es_0_26)));
        conv5_Map_14 = (java.lang.Object) result[0];
        conv4_Rmap_15 = (java.lang.Object) result[1];
        conv3_STATE_VARIABLE_Es_27 = (java.lang.Object) result[2];
      }
      Map_14 = ((tree234.Tree234_2) conv5_Map_14);
      Rmap_15 = ((tree234.Tree234_2) conv4_Rmap_15);
      STATE_VARIABLE_Es_27 = ((list.List_1) conv3_STATE_VARIABLE_Es_27);
//  trips2bel.m:197
      {
        Ks_16 = map.keys_2_p_0(TypeCtorInfo_44_44, TypeInfo_45_45, Map_14);
      }
      TypeCtorInfo_50_50 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
      {
        CS0_17 = set.init_1_p_0(TypeCtorInfo_50_50);
      }
      TypeInfo_51_51 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[5]);
      {
        Mmap0_18 = map.init_1_p_0(TypeCtorInfo_50_50, TypeInfo_51_51);
      }
      {
        VM0_19 = map.init_1_p_0(TypeCtorInfo_44_44, TypeCtorInfo_50_50);
      }
      TypeInfo_52_52 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[6]);
//  trips2bel.m:198
      {
        V_32_32 = set.init_0_f_0(TypeInfo_52_52);
      }
      {
        Cls_20 = trips2bel.find_classes_5_p_0(Ks_16, Map_14, Rmap_15, V_32_32);
      }
      {
        Cs_21 = set.to_sorted_list_2_p_0(TypeInfo_52_52, Cls_20);
      }
//  trips2bel.m:199
      {
        V_33_33 = new /* closure */ java.lang.Object[] {((java.lang.Object) (trips2bel.MR_scalar_common_7[0])), ((java.lang.Object) (new AddrOf7_0())), java.lang.Integer.valueOf(1), ((java.lang.Object) (Map_14))};
      }
      V_34_34 = 0;
      V_35_35 = (list.List_1) trips2bel.MR_scalar_common_3[0];
      TypeInfo_64_64 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[7]);
      TypeInfo_65_65 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[8]);
      TypeInfo_66_66 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[9]);
      TypeInfo_67_67 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[10]);
      {
        java.lang.Object [] result = list.foldl5_12_p_0(TypeInfo_52_52, TypeCtorInfo_50_50, TypeInfo_64_64, TypeInfo_65_65, TypeInfo_66_66, TypeInfo_67_67, V_33_33, Cs_21, java.lang.Integer.valueOf(V_34_34), ((java.lang.Object) (CS0_17)), ((java.lang.Object) (VM0_19)), ((java.lang.Object) (Mmap0_18)), ((java.lang.Object) (V_35_35)));
        conv15_V_22_22 = (java.lang.Object) result[0];
        conv14_CS_23 = (java.lang.Object) result[1];
        conv13_VM_11 = (java.lang.Object) result[2];
        conv12_Mmap_24 = (java.lang.Object) result[3];
        conv11_Gs_25 = (java.lang.Object) result[4];
      }
      V_22_22 = ((java.lang.Integer) conv15_V_22_22).intValue();
      CS_23 = ((set_ordlist.Set_ordlist_1) conv14_CS_23);
      VM_11 = ((tree234.Tree234_2) conv13_VM_11);
      Mmap_24 = ((tree234.Tree234_2) conv12_Mmap_24);
      Gs_25 = ((list.List_1) conv11_Gs_25);
//  trips2bel.m:200
      {
        V_36_36 = set.to_sorted_list_1_f_0(TypeCtorInfo_50_50, CS_23);
      }
      {
        CM_12 = utils.collect_corefs_5_p_0(V_36_36, Mmap_24, Gs_25, MWN_10);
      }
//  trips2bel.m:195
return new java.lang.Object[] {
        ((java.lang.Object) (VM_11)),
        ((java.lang.Object) (CM_12)),
        ((java.lang.Object) (STATE_VARIABLE_Es_27))
      };
    }
//  trips2bel.m:75
  }
//  trips2bel.m:142
  private static java.lang.Object [] convert3_5_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      java.lang.Object wrapper_arg_4 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      trips2bel.Turn3_0 conv1_Turn2_10 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_14 = null;

      {
        java.lang.Object [] result = trips2bel.conv_turn3_5_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((trips2bel.Turn2_0) wrapper_arg_1), ((list.List_1) wrapper_arg_3));
        conv1_Turn2_10 = (trips2bel.Turn3_0) result[0];
        conv0_STATE_VARIABLE_Es_14 = (list.List_1) result[1];
      }
      wrapper_arg_2 = ((java.lang.Object) (conv1_Turn2_10));
      wrapper_arg_4 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_14));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_2)),
        ((java.lang.Object) (wrapper_arg_4))
      };
    }
  }
//  trips2bel.m:72
  public static java.lang.Object [] convert3_5_p_0(
    maybe.Maybe_1 MWN_6,
    trips2bel.Trfile2_0 HeadVar__2_2,
    list.List_1 STATE_VARIABLE_Es_0_14)
  {
//  trips2bel.m:135
    {
      boolean succeeded = false;
      trips2bel.Trfile3_0 HeadVar__3_3 = null;
      list.List_1 STATE_VARIABLE_Es_15 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_19_19 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_20_20 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_25_25 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_26_26 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_27_27 = null;
      java.lang.String File_7 = ((trips2bel.Trfile2_0) HeadVar__2_2).F1;
      list.List_1 Turns0_8 = ((trips2bel.Trfile2_0) HeadVar__2_2).F2;
      list.List_1 Turns_9 = null;
      tree234.Tree234_2 Smap_10 = null;
      list.List_1 STATE_VARIABLE_Es_16_16 = null;
      /* closure */ java.lang.Object[] V_17_17 = null;
//  trips2bel.m:136
      tree234.Tree234_2 _Vmap_12 = null;
      utils.Corefs_0 _Cmap_13 = null;
//  trips2bel.m:142
      java.lang.Object conv2_STATE_VARIABLE_Es_15 = null;

//  trips2bel.m:136
      {
        java.lang.Object [] result = trips2bel.corefs_7_p_0(File_7, Turns0_8, MWN_6, STATE_VARIABLE_Es_0_14);
        _Vmap_12 = (tree234.Tree234_2) result[0];
        _Cmap_13 = (utils.Corefs_0) result[1];
        STATE_VARIABLE_Es_16_16 = (list.List_1) result[2];
      }
      TypeCtorInfo_19_19 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_cvar_0);
      TypeCtorInfo_20_20 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
//  trips2bel.m:141
      {
        Smap_10 = map.init_1_p_0(TypeCtorInfo_19_19, TypeCtorInfo_20_20);
      }
//  trips2bel.m:142
      {
        V_17_17 = new /* closure */ java.lang.Object[] {((java.lang.Object) (trips2bel.MR_scalar_common_5[0])), ((java.lang.Object) (new AddrOf3_0(8))), java.lang.Integer.valueOf(1), ((java.lang.Object) (File_7))};
      }
      TypeCtorInfo_25_25 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_turn2_0);
      TypeCtorInfo_26_26 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_turn3_0);
      TypeInfo_27_27 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[0]);
      {
        java.lang.Object [] result = list.map_foldl_5_p_0(TypeCtorInfo_25_25, TypeCtorInfo_26_26, TypeInfo_27_27, V_17_17, Turns0_8, ((java.lang.Object) (STATE_VARIABLE_Es_16_16)));
        Turns_9 = (list.List_1) result[0];
        conv2_STATE_VARIABLE_Es_15 = (java.lang.Object) result[1];
      }
      STATE_VARIABLE_Es_15 = ((list.List_1) conv2_STATE_VARIABLE_Es_15);
//  trips2bel.m:135
      {
        HeadVar__3_3 = new trips2bel.Trfile3_0(File_7, Turns_9, Smap_10);
      }
return new java.lang.Object[] {
        ((java.lang.Object) (HeadVar__3_3)),
        ((java.lang.Object) (STATE_VARIABLE_Es_15))
      };
    }
//  trips2bel.m:72
  }
//  trips2bel.m:110
  private static java.lang.Object [] convert2_5_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      java.lang.Object wrapper_arg_4 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      trips2bel.Turn2_0 conv1_Turn2_12 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_16 = null;

      {
        java.lang.Object [] result = trips2bel.conv_turn_6_p_0(((maybe.Maybe_1) ((java.lang.Object[]) closure)[3]), ((java.lang.String) ((java.lang.Object[]) closure)[4]), ((trips2bel.Turn_0) wrapper_arg_1), ((list.List_1) wrapper_arg_3));
        conv1_Turn2_12 = (trips2bel.Turn2_0) result[0];
        conv0_STATE_VARIABLE_Es_16 = (list.List_1) result[1];
      }
      wrapper_arg_2 = ((java.lang.Object) (conv1_Turn2_12));
      wrapper_arg_4 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_16));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_2)),
        ((java.lang.Object) (wrapper_arg_4))
      };
    }
  }
//  trips2bel.m:69
  public static java.lang.Object [] convert2_5_p_0(
    maybe.Maybe_1 Data_6,
    trips2bel.Trfile_0 HeadVar__2_2,
    list.List_1 STATE_VARIABLE_Es_0_11)
  {
//  trips2bel.m:109
    {
      boolean succeeded = false;
      trips2bel.Trfile2_0 HeadVar__3_3 = null;
      list.List_1 STATE_VARIABLE_Es_12 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_19_19 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_20_20 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_21_21 = null;
      java.lang.String File_7 = ((trips2bel.Trfile_0) HeadVar__2_2).F1;
      list.List_1 Turns0_8 = ((trips2bel.Trfile_0) HeadVar__2_2).F2;
      list.List_1 Turns_9 = null;
      /* closure */ java.lang.Object[] V_13_13 = null;
//  trips2bel.m:110
      java.lang.Object conv2_STATE_VARIABLE_Es_12 = null;

      {
        V_13_13 = new /* closure */ java.lang.Object[] {((java.lang.Object) (trips2bel.MR_scalar_common_4[0])), ((java.lang.Object) (new AddrOf3_0(9))), java.lang.Integer.valueOf(2), ((java.lang.Object) (Data_6)), ((java.lang.Object) (File_7))};
      }
      TypeCtorInfo_19_19 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_turn_0);
      TypeCtorInfo_20_20 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_turn2_0);
      TypeInfo_21_21 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.MR_scalar_common_1[0]);
      {
        java.lang.Object [] result = list.map_foldl_5_p_0(TypeCtorInfo_19_19, TypeCtorInfo_20_20, TypeInfo_21_21, V_13_13, Turns0_8, ((java.lang.Object) (STATE_VARIABLE_Es_0_11)));
        Turns_9 = (list.List_1) result[0];
        conv2_STATE_VARIABLE_Es_12 = (java.lang.Object) result[1];
      }
      STATE_VARIABLE_Es_12 = ((list.List_1) conv2_STATE_VARIABLE_Es_12);
//  trips2bel.m:109
      {
        HeadVar__3_3 = new trips2bel.Trfile2_0(File_7, Turns_9);
      }
return new java.lang.Object[] {
        ((java.lang.Object) (HeadVar__3_3)),
        ((java.lang.Object) (STATE_VARIABLE_Es_12))
      };
    }
//  trips2bel.m:69
  }
//  trips2bel.m:66
  public static java.lang.Object [] convert_5_p_0(
    java.lang.String Filename_6,
    java.lang.String DocStr_7,
    list.List_1 STATE_VARIABLE_Es_0_13)
  {
//  trips2bel.m:92
    {
      boolean succeeded = false;
      list.List_1 Exprs_8 = null;
      list.List_1 STATE_VARIABLE_Es_14 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_21_21 = null;
      int Max_10 = 0;
      list.List_1 RevExprs_12 = null;
      io.Posn_0 V_15_15 = null;
      list.List_1 V_16_16 = null;
      int V_18_18 = 0;
      int V_19_19 = 0;
      int V_20_20 = 0;
//  trips2bel.m:94
      io.Posn_0 V_11_11 = null;

//  trips2bel.m:93
      {
        Max_10 = string.length_2_p_0(DocStr_7);
      }
//  trips2bel.m:94
      V_18_18 = 0;
      V_19_19 = 0;
      V_20_20 = 0;
      V_15_15 = (io.Posn_0) trips2bel.MR_scalar_common_2[0];
      V_16_16 = (list.List_1) trips2bel.MR_scalar_common_3[0];
      {
        java.lang.Object [] result = trips2bel.read_exprs_9_p_0(Filename_6, DocStr_7, Max_10, V_15_15, V_16_16, STATE_VARIABLE_Es_0_13);
        V_11_11 = (io.Posn_0) result[0];
        RevExprs_12 = (list.List_1) result[1];
        STATE_VARIABLE_Es_14 = (list.List_1) result[2];
      }
      TypeCtorInfo_21_21 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_turn_0);
//  trips2bel.m:95
      {
        Exprs_8 = list.reverse_2_p_0(TypeCtorInfo_21_21, RevExprs_12);
      }
//  trips2bel.m:92
return new java.lang.Object[] {
        ((java.lang.Object) (Exprs_8)),
        ((java.lang.Object) (STATE_VARIABLE_Es_14))
      };
    }
//  trips2bel.m:66
  }

// ExportDefns

// ExportedEnums

// InitPreds

// FinalPreds

// EnvVarNames
  static {
    if (System.getenv("MERCURY_DEBUG_CLASS_INIT") != null) {
      System.out.println("[trips2bel end init]");
    }
  }
}
// :- end_module trips2bel.
