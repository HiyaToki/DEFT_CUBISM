//
//
// Automatically generated from stanford2bel.m by the Mercury Compiler,
// version 14.01.1, configured for x86_64-unknown-linux-gnu
//
//

/* :- module stanford2bel. */

package jmercury;
// import assoc_list;
// import beliefs;
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
public class stanford2bel {
  static {
    if (System.getenv("MERCURY_DEBUG_CLASS_INIT") != null) {
      System.out.println("[stanford2bel start init]");
    }
  }

// RttiDefns
  private static final jmercury.runtime.TypeInfo_Struct pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__pti_tree234_2__plain_pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_stanford2bel__type_ctor_info_entity2_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct errors__ti_message_1sberrs__type_ctor_info_error_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct maybe__pti_maybe_1__plain_wordnet__type_ctor_info_wndata_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__pti_list_1__plain_stanford2bel__type_ctor_info_stprop_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__pti_list_1__plain_pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__ti_pair_2stanford2bel__type_ctor_info_label_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1pair__ti_pair_2stanford2bel__type_ctor_info_label_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1pair__ti_pair_2stanford2bel__type_ctor_info_label_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_stanford2bel__type_ctor_info_token2_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__pti_pair_2__plain_stanford2bel__type_ctor_info_label_0__plain_builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__pti_pair_2__plain_stanford2bel__type_ctor_info_label_0__plain_stanford2bel__type_ctor_info_tempexpr_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__pti_list_1__plain_builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_eid_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] stanford2bel__field_types_entity_0_0 = new jmercury.runtime.PseudoTypeInfo[4];
  private static final jmercury.runtime.DuFunctorDesc stanford2bel__du_functor_desc_entity_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_stag_ordered_entity_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] stanford2bel__du_ptag_ordered_entity_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_name_ordered_entity_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] stanford2bel__functor_number_map_entity_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_entity_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] stanford2bel__field_types_entity2_0_0 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc stanford2bel__du_functor_desc_entity2_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_stag_ordered_entity2_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] stanford2bel__du_ptag_ordered_entity2_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_name_ordered_entity2_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] stanford2bel__functor_number_map_entity2_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_entity2_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__ti_tree234_2builtin__type_ctor_info_int_0stanford2bel__type_ctor_info_entity2_0 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_entmap_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_etp_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_etp_0_1 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_etp_0_2 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_etp_0_3 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] stanford2bel__enum_value_ordered_etp_0 = new jmercury.runtime.EnumFunctorDesc[4];
  private static final jmercury.runtime.EnumFunctorDesc[] stanford2bel__enum_name_ordered_etp_0 = new jmercury.runtime.EnumFunctorDesc[4];
  private static final int[] stanford2bel__functor_number_map_etp_0 = new int[4];
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_etp_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_1 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_2 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_3 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_4 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_5 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_6 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_7 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_8 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_9 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_10 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_11 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_12 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_13 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_14 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_15 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_16 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_17 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_18 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_19 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_20 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_21 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_22 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_23 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_24 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_25 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_26 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_27 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_28 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_29 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_30 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_31 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_32 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_33 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_34 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_35 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_36 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_37 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_38 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_39 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_40 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_41 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_42 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_43 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_44 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_45 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_46 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_47 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_48 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_49 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_50 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_51 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_52 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_53 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_54 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_55 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_56 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_label_0_57 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] stanford2bel__enum_value_ordered_label_0 = new jmercury.runtime.EnumFunctorDesc[58];
  private static final jmercury.runtime.EnumFunctorDesc[] stanford2bel__enum_name_ordered_label_0 = new jmercury.runtime.EnumFunctorDesc[58];
  private static final int[] stanford2bel__functor_number_map_label_0 = new int[58];
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_label_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_netp_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_netp_0_1 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_netp_0_2 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_netp_0_3 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_netp_0_4 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_netp_0_5 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_netp_0_6 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_netp_0_7 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_netp_0_8 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_netp_0_9 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_netp_0_10 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_netp_0_11 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_netp_0_12 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] stanford2bel__enum_value_ordered_netp_0 = new jmercury.runtime.EnumFunctorDesc[13];
  private static final jmercury.runtime.EnumFunctorDesc[] stanford2bel__enum_name_ordered_netp_0 = new jmercury.runtime.EnumFunctorDesc[13];
  private static final int[] stanford2bel__functor_number_map_netp_0 = new int[13];
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_netp_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_1 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_2 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_3 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_4 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_5 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_6 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_7 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_8 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_9 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_10 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_11 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_12 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_13 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_14 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_15 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_16 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_17 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_18 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_19 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_20 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_21 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_22 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_23 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_24 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_25 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_26 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_27 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_28 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_29 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_30 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_31 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_32 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_33 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_34 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_35 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_pos_0_36 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] stanford2bel__enum_value_ordered_pos_0 = new jmercury.runtime.EnumFunctorDesc[37];
  private static final jmercury.runtime.EnumFunctorDesc[] stanford2bel__enum_name_ordered_pos_0 = new jmercury.runtime.EnumFunctorDesc[37];
  private static final int[] stanford2bel__functor_number_map_pos_0 = new int[37];
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_pos_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__ti_tree234_2builtin__type_ctor_info_int_0list__ti_list_1pair__ti_pair_2stanford2bel__type_ctor_info_label_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_relmap_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] stanford2bel__field_types_semrel_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc stanford2bel__du_functor_desc_semrel_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_stag_ordered_semrel_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] stanford2bel__du_ptag_ordered_semrel_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_name_ordered_semrel_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] stanford2bel__functor_number_map_semrel_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_semrel_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1stanford2bel__type_ctor_info_token_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1stanford2bel__type_ctor_info_semrel_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] stanford2bel__field_types_sent_0_0 = new jmercury.runtime.PseudoTypeInfo[6];
  private static final jmercury.runtime.DuFunctorDesc stanford2bel__du_functor_desc_sent_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_stag_ordered_sent_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] stanford2bel__du_ptag_ordered_sent_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_name_ordered_sent_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] stanford2bel__functor_number_map_sent_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_sent_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__ti_tree234_2builtin__type_ctor_info_int_0stanford2bel__type_ctor_info_token2_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] stanford2bel__field_types_sent2_0_0 = new jmercury.runtime.PseudoTypeInfo[6];
  private static final jmercury.runtime.DuFunctorDesc stanford2bel__du_functor_desc_sent2_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_stag_ordered_sent2_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] stanford2bel__du_ptag_ordered_sent2_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_name_ordered_sent2_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] stanford2bel__functor_number_map_sent2_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_sent2_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_sid_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1stanford2bel__type_ctor_info_sent_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1stanford2bel__type_ctor_info_entity_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] stanford2bel__field_types_stfile_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc stanford2bel__du_functor_desc_stfile_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_stag_ordered_stfile_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] stanford2bel__du_ptag_ordered_stfile_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_name_ordered_stfile_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] stanford2bel__functor_number_map_stfile_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_stfile_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1stanford2bel__type_ctor_info_sent2_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] stanford2bel__field_types_stfile2_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc stanford2bel__du_functor_desc_stfile2_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_stag_ordered_stfile2_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] stanford2bel__du_ptag_ordered_stfile2_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_name_ordered_stfile2_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] stanford2bel__functor_number_map_stfile2_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_stfile2_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] stanford2bel__field_types_stprop_0_0 = new jmercury.runtime.PseudoTypeInfo[4];
  private static final jmercury.runtime.DuFunctorDesc stanford2bel__du_functor_desc_stprop_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_stag_ordered_stprop_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] stanford2bel__du_ptag_ordered_stprop_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_name_ordered_stprop_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] stanford2bel__functor_number_map_stprop_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_stprop_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1stanford2bel__type_ctor_info_stprop_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] stanford2bel__field_types_stprops_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc stanford2bel__du_functor_desc_stprops_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_stag_ordered_stprops_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] stanford2bel__du_ptag_ordered_stprops_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_name_ordered_stprops_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] stanford2bel__functor_number_map_stprops_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_stprops_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct maybe__ti_maybe_1builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] stanford2bel__field_types_tempexpr_0_0 = new jmercury.runtime.PseudoTypeInfo[4];
  private static final jmercury.runtime.DuFunctorDesc stanford2bel__du_functor_desc_tempexpr_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] stanford2bel__field_types_tempexpr_0_1 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc stanford2bel__du_functor_desc_tempexpr_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc stanford2bel__du_functor_desc_tempexpr_0_2 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_stag_ordered_tempexpr_0_0 = new jmercury.runtime.DuFunctorDesc[3];
  private static final jmercury.runtime.DuPtagLayout[] stanford2bel__du_ptag_ordered_tempexpr_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_name_ordered_tempexpr_0 = new jmercury.runtime.DuFunctorDesc[3];
  private static final int[] stanford2bel__functor_number_map_tempexpr_0 = new int[3];
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_tempexpr_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_tid_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__ti_tree234_2pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_tkmap_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.DuFunctorDesc stanford2bel__du_functor_desc_tmtp_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc stanford2bel__du_functor_desc_tmtp_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc stanford2bel__du_functor_desc_tmtp_0_2 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc stanford2bel__du_functor_desc_tmtp_0_3 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] stanford2bel__field_types_tmtp_0_4 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc stanford2bel__du_functor_desc_tmtp_0_4 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] stanford2bel__field_types_tmtp_0_5 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc stanford2bel__du_functor_desc_tmtp_0_5 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_stag_ordered_tmtp_0_0 = new jmercury.runtime.DuFunctorDesc[6];
  private static final jmercury.runtime.DuPtagLayout[] stanford2bel__du_ptag_ordered_tmtp_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_name_ordered_tmtp_0 = new jmercury.runtime.DuFunctorDesc[6];
  private static final int[] stanford2bel__functor_number_map_tmtp_0 = new int[6];
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_tmtp_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_tnum_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] stanford2bel__field_types_token_0_0 = new jmercury.runtime.PseudoTypeInfo[5];
  private static final jmercury.runtime.DuFunctorDesc stanford2bel__du_functor_desc_token_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_stag_ordered_token_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] stanford2bel__du_ptag_ordered_token_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_name_ordered_token_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] stanford2bel__functor_number_map_token_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_token_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] stanford2bel__field_types_token2_0_0 = new jmercury.runtime.PseudoTypeInfo[5];
  private static final jmercury.runtime.DuFunctorDesc stanford2bel__du_functor_desc_token2_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_stag_ordered_token2_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] stanford2bel__du_ptag_ordered_token2_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_name_ordered_token2_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] stanford2bel__functor_number_map_token2_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_token2_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_tokmap_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct set_ordlist__ti_set_ordlist_1builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1list__ti_list_1builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] stanford2bel__field_types_vertices_0_0 = new jmercury.runtime.PseudoTypeInfo[4];
  private static final jmercury.runtime.DuFunctorDesc stanford2bel__du_functor_desc_vertices_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_stag_ordered_vertices_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] stanford2bel__du_ptag_ordered_vertices_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] stanford2bel__du_name_ordered_vertices_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] stanford2bel__functor_number_map_vertices_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_vertices_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_wdtp_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_wdtp_0_1 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_wdtp_0_2 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] stanford2bel__enum_value_ordered_wdtp_0 = new jmercury.runtime.EnumFunctorDesc[3];
  private static final jmercury.runtime.EnumFunctorDesc[] stanford2bel__enum_name_ordered_wdtp_0 = new jmercury.runtime.EnumFunctorDesc[3];
  private static final int[] stanford2bel__functor_number_map_wdtp_0 = new int[3];
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_wdtp_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_wtype_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_wtype_0_1 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_wtype_0_2 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_wtype_0_3 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_wtype_0_4 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc stanford2bel__enum_functor_desc_wtype_0_5 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] stanford2bel__enum_value_ordered_wtype_0 = new jmercury.runtime.EnumFunctorDesc[6];
  private static final jmercury.runtime.EnumFunctorDesc[] stanford2bel__enum_name_ordered_wtype_0 = new jmercury.runtime.EnumFunctorDesc[6];
  private static final int[] stanford2bel__functor_number_map_wtype_0 = new int[6];
  public static final jmercury.runtime.TypeCtorInfo_Struct stanford2bel__type_ctor_info_wtype_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  static {
    //
    //
    //
    pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0)});
    //
    //
    tree234__pti_tree234_2__plain_pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_int_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) stanford2bel.pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0,
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0});
    //
    //
    tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_stanford2bel__type_ctor_info_entity2_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0,
		(jmercury.runtime.PseudoTypeInfo) stanford2bel.stanford2bel__type_ctor_info_entity2_0});
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
		jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.errors__ti_message_1sberrs__type_ctor_info_error_0)});
    //
    //
    list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) stanford2bel.pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0});
    //
    //
    //
    maybe__pti_maybe_1__plain_wordnet__type_ctor_info_wndata_0.init(maybe.maybe__type_ctor_info_maybe_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) wordnet.wordnet__type_ctor_info_wndata_0});
    //
    //
    list__pti_list_1__plain_stanford2bel__type_ctor_info_stprop_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) stanford2bel.stanford2bel__type_ctor_info_stprop_0});
    //
    list__pti_list_1__plain_pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) stanford2bel.pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0});
    //
    //
    pair__ti_pair_2stanford2bel__type_ctor_info_label_0builtin__type_ctor_info_int_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_label_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0)});
    //
    list__ti_list_1pair__ti_pair_2stanford2bel__type_ctor_info_label_0builtin__type_ctor_info_int_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.pair__ti_pair_2stanford2bel__type_ctor_info_label_0builtin__type_ctor_info_int_0)});
    //
    tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1pair__ti_pair_2stanford2bel__type_ctor_info_label_0builtin__type_ctor_info_int_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0,
		(jmercury.runtime.PseudoTypeInfo) stanford2bel.list__ti_list_1pair__ti_pair_2stanford2bel__type_ctor_info_label_0builtin__type_ctor_info_int_0});
    //
    //
    tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_stanford2bel__type_ctor_info_token2_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0,
		(jmercury.runtime.PseudoTypeInfo) stanford2bel.stanford2bel__type_ctor_info_token2_0});
    //
    pair__pti_pair_2__plain_stanford2bel__type_ctor_info_label_0__plain_builtin__type_ctor_info_int_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) stanford2bel.stanford2bel__type_ctor_info_label_0,
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0});
    //
    //
    pair__pti_pair_2__plain_stanford2bel__type_ctor_info_label_0__plain_stanford2bel__type_ctor_info_tempexpr_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) stanford2bel.stanford2bel__type_ctor_info_label_0,
		(jmercury.runtime.PseudoTypeInfo) stanford2bel.stanford2bel__type_ctor_info_tempexpr_0});
    //
    list__pti_list_1__plain_builtin__type_ctor_info_int_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0});
    //
    stanford2bel__type_ctor_info_eid_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(0))),
		((java.lang.Object) (new AddrOf2_0(1))),
		"stanford2bel",
		"eid",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0),
		-1,
		0,
		null);
    //
    list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0)});
    //
    list__ti_list_1list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0)});
    //
    //
    stanford2bel__field_types_entity_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    stanford2bel__field_types_entity_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    stanford2bel__field_types_entity_0_0[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    stanford2bel__field_types_entity_0_0[3] = (jmercury.runtime.PseudoTypeInfo) stanford2bel.list__ti_list_1list__ti_list_1pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0;
    //
    stanford2bel__du_functor_desc_entity_0_0.init("entity",
		4,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		stanford2bel.stanford2bel__field_types_entity_0_0,
		null,
		null,
		null);
    //
    stanford2bel__du_stag_ordered_entity_0_0[0] = stanford2bel.stanford2bel__du_functor_desc_entity_0_0;
    //
    stanford2bel__du_ptag_ordered_entity_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		stanford2bel.stanford2bel__du_stag_ordered_entity_0_0);
    //
    stanford2bel__du_name_ordered_entity_0[0] = stanford2bel.stanford2bel__du_functor_desc_entity_0_0;
    //
    stanford2bel__functor_number_map_entity_0[0] = 0;
    //
    stanford2bel__type_ctor_info_entity_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(2))),
		((java.lang.Object) (new AddrOf2_0(3))),
		"stanford2bel",
		"entity",
		new jmercury.runtime.TypeFunctors(stanford2bel.stanford2bel__du_name_ordered_entity_0),
		new jmercury.runtime.TypeLayout(stanford2bel.stanford2bel__du_ptag_ordered_entity_0),
		1,
		4,
		stanford2bel.stanford2bel__functor_number_map_entity_0);
    //
    //
    stanford2bel__field_types_entity2_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    stanford2bel__field_types_entity2_0_0[1] = (jmercury.runtime.PseudoTypeInfo) stanford2bel.stanford2bel__type_ctor_info_etp_0;
    //
    stanford2bel__du_functor_desc_entity2_0_0.init("entity",
		2,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		stanford2bel.stanford2bel__field_types_entity2_0_0,
		null,
		null,
		null);
    //
    stanford2bel__du_stag_ordered_entity2_0_0[0] = stanford2bel.stanford2bel__du_functor_desc_entity2_0_0;
    //
    stanford2bel__du_ptag_ordered_entity2_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		stanford2bel.stanford2bel__du_stag_ordered_entity2_0_0);
    //
    stanford2bel__du_name_ordered_entity2_0[0] = stanford2bel.stanford2bel__du_functor_desc_entity2_0_0;
    //
    stanford2bel__functor_number_map_entity2_0[0] = 0;
    //
    stanford2bel__type_ctor_info_entity2_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(4))),
		((java.lang.Object) (new AddrOf2_0(5))),
		"stanford2bel",
		"entity2",
		new jmercury.runtime.TypeFunctors(stanford2bel.stanford2bel__du_name_ordered_entity2_0),
		new jmercury.runtime.TypeLayout(stanford2bel.stanford2bel__du_ptag_ordered_entity2_0),
		1,
		4,
		stanford2bel.stanford2bel__functor_number_map_entity2_0);
    //
    tree234__ti_tree234_2builtin__type_ctor_info_int_0stanford2bel__type_ctor_info_entity2_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_entity2_0)});
    //
    stanford2bel__type_ctor_info_entmap_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(6))),
		((java.lang.Object) (new AddrOf2_0(7))),
		"stanford2bel",
		"entmap",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) stanford2bel.tree234__ti_tree234_2builtin__type_ctor_info_int_0stanford2bel__type_ctor_info_entity2_0),
		-1,
		0,
		null);
    //
    stanford2bel__enum_functor_desc_etp_0_0.init("pronoun",
		0);
    //
    stanford2bel__enum_functor_desc_etp_0_1.init("nominal",
		1);
    //
    stanford2bel__enum_functor_desc_etp_0_2.init("proper",
		2);
    //
    stanford2bel__enum_functor_desc_etp_0_3.init("lizt",
		3);
    //
    stanford2bel__enum_value_ordered_etp_0[0] = stanford2bel.stanford2bel__enum_functor_desc_etp_0_0;
    stanford2bel__enum_value_ordered_etp_0[1] = stanford2bel.stanford2bel__enum_functor_desc_etp_0_1;
    stanford2bel__enum_value_ordered_etp_0[2] = stanford2bel.stanford2bel__enum_functor_desc_etp_0_2;
    stanford2bel__enum_value_ordered_etp_0[3] = stanford2bel.stanford2bel__enum_functor_desc_etp_0_3;
    //
    stanford2bel__enum_name_ordered_etp_0[0] = stanford2bel.stanford2bel__enum_functor_desc_etp_0_3;
    stanford2bel__enum_name_ordered_etp_0[1] = stanford2bel.stanford2bel__enum_functor_desc_etp_0_1;
    stanford2bel__enum_name_ordered_etp_0[2] = stanford2bel.stanford2bel__enum_functor_desc_etp_0_0;
    stanford2bel__enum_name_ordered_etp_0[3] = stanford2bel.stanford2bel__enum_functor_desc_etp_0_2;
    //
    stanford2bel__functor_number_map_etp_0[0] = 2;
    stanford2bel__functor_number_map_etp_0[1] = 1;
    stanford2bel__functor_number_map_etp_0[2] = 3;
    stanford2bel__functor_number_map_etp_0[3] = 0;
    //
    stanford2bel__type_ctor_info_etp_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_ENUM,
		((java.lang.Object) (new AddrOf2_0(8))),
		((java.lang.Object) (new AddrOf2_0(9))),
		"stanford2bel",
		"etp",
		new jmercury.runtime.TypeFunctors(stanford2bel.stanford2bel__enum_name_ordered_etp_0),
		new jmercury.runtime.TypeLayout(stanford2bel.stanford2bel__enum_value_ordered_etp_0),
		4,
		4,
		stanford2bel.stanford2bel__functor_number_map_etp_0);
    //
    stanford2bel__enum_functor_desc_label_0_0.init("pr3d",
		0);
    //
    stanford2bel__enum_functor_desc_label_0_1.init("aux",
		1);
    //
    stanford2bel__enum_functor_desc_label_0_2.init("auxpass",
		2);
    //
    stanford2bel__enum_functor_desc_label_0_3.init("cop",
		3);
    //
    stanford2bel__enum_functor_desc_label_0_4.init("conj",
		4);
    //
    stanford2bel__enum_functor_desc_label_0_5.init("cc",
		5);
    //
    stanford2bel__enum_functor_desc_label_0_6.init("punct",
		6);
    //
    stanford2bel__enum_functor_desc_label_0_7.init("arg",
		7);
    //
    stanford2bel__enum_functor_desc_label_0_8.init("subj",
		8);
    //
    stanford2bel__enum_functor_desc_label_0_9.init("nsubj",
		9);
    //
    stanford2bel__enum_functor_desc_label_0_10.init("nsubjpass",
		10);
    //
    stanford2bel__enum_functor_desc_label_0_11.init("csubj",
		11);
    //
    stanford2bel__enum_functor_desc_label_0_12.init("csubjpass",
		12);
    //
    stanford2bel__enum_functor_desc_label_0_13.init("comp",
		13);
    //
    stanford2bel__enum_functor_desc_label_0_14.init("obj",
		14);
    //
    stanford2bel__enum_functor_desc_label_0_15.init("dobj",
		15);
    //
    stanford2bel__enum_functor_desc_label_0_16.init("iobj",
		16);
    //
    stanford2bel__enum_functor_desc_label_0_17.init("pobj",
		17);
    //
    stanford2bel__enum_functor_desc_label_0_18.init("pcomp",
		18);
    //
    stanford2bel__enum_functor_desc_label_0_19.init("attr",
		19);
    //
    stanford2bel__enum_functor_desc_label_0_20.init("ccomp",
		20);
    //
    stanford2bel__enum_functor_desc_label_0_21.init("xcomp",
		21);
    //
    stanford2bel__enum_functor_desc_label_0_22.init("rel",
		22);
    //
    stanford2bel__enum_functor_desc_label_0_23.init("ref",
		23);
    //
    stanford2bel__enum_functor_desc_label_0_24.init("expl",
		24);
    //
    stanford2bel__enum_functor_desc_label_0_25.init("acomp",
		25);
    //
    stanford2bel__enum_functor_desc_label_0_26.init("m0d",
		26);
    //
    stanford2bel__enum_functor_desc_label_0_27.init("advcl",
		27);
    //
    stanford2bel__enum_functor_desc_label_0_28.init("rcmod",
		28);
    //
    stanford2bel__enum_functor_desc_label_0_29.init("mark",
		29);
    //
    stanford2bel__enum_functor_desc_label_0_30.init("amod",
		30);
    //
    stanford2bel__enum_functor_desc_label_0_31.init("num",
		31);
    //
    stanford2bel__enum_functor_desc_label_0_32.init("number",
		32);
    //
    stanford2bel__enum_functor_desc_label_0_33.init("quantmod",
		33);
    //
    stanford2bel__enum_functor_desc_label_0_34.init("nn",
		34);
    //
    stanford2bel__enum_functor_desc_label_0_35.init("appos",
		35);
    //
    stanford2bel__enum_functor_desc_label_0_36.init("discourse",
		36);
    //
    stanford2bel__enum_functor_desc_label_0_37.init("vmod",
		37);
    //
    stanford2bel__enum_functor_desc_label_0_38.init("advmod",
		38);
    //
    stanford2bel__enum_functor_desc_label_0_39.init("neg",
		39);
    //
    stanford2bel__enum_functor_desc_label_0_40.init("npadvmod",
		40);
    //
    stanford2bel__enum_functor_desc_label_0_41.init("tmod",
		41);
    //
    stanford2bel__enum_functor_desc_label_0_42.init("mwe",
		42);
    //
    stanford2bel__enum_functor_desc_label_0_43.init("measure",
		43);
    //
    stanford2bel__enum_functor_desc_label_0_44.init("det",
		44);
    //
    stanford2bel__enum_functor_desc_label_0_45.init("predet",
		45);
    //
    stanford2bel__enum_functor_desc_label_0_46.init("preconj",
		46);
    //
    stanford2bel__enum_functor_desc_label_0_47.init("poss",
		47);
    //
    stanford2bel__enum_functor_desc_label_0_48.init("possessive",
		48);
    //
    stanford2bel__enum_functor_desc_label_0_49.init("prep",
		49);
    //
    stanford2bel__enum_functor_desc_label_0_50.init("prt",
		50);
    //
    stanford2bel__enum_functor_desc_label_0_51.init("parataxis",
		51);
    //
    stanford2bel__enum_functor_desc_label_0_52.init("goeswith",
		52);
    //
    stanford2bel__enum_functor_desc_label_0_53.init("sdep",
		53);
    //
    stanford2bel__enum_functor_desc_label_0_54.init("xsubj",
		54);
    //
    stanford2bel__enum_functor_desc_label_0_55.init("agent",
		55);
    //
    stanford2bel__enum_functor_desc_label_0_56.init("dep",
		56);
    //
    stanford2bel__enum_functor_desc_label_0_57.init("prepc",
		57);
    //
    stanford2bel__enum_value_ordered_label_0[0] = stanford2bel.stanford2bel__enum_functor_desc_label_0_0;
    stanford2bel__enum_value_ordered_label_0[1] = stanford2bel.stanford2bel__enum_functor_desc_label_0_1;
    stanford2bel__enum_value_ordered_label_0[2] = stanford2bel.stanford2bel__enum_functor_desc_label_0_2;
    stanford2bel__enum_value_ordered_label_0[3] = stanford2bel.stanford2bel__enum_functor_desc_label_0_3;
    stanford2bel__enum_value_ordered_label_0[4] = stanford2bel.stanford2bel__enum_functor_desc_label_0_4;
    stanford2bel__enum_value_ordered_label_0[5] = stanford2bel.stanford2bel__enum_functor_desc_label_0_5;
    stanford2bel__enum_value_ordered_label_0[6] = stanford2bel.stanford2bel__enum_functor_desc_label_0_6;
    stanford2bel__enum_value_ordered_label_0[7] = stanford2bel.stanford2bel__enum_functor_desc_label_0_7;
    stanford2bel__enum_value_ordered_label_0[8] = stanford2bel.stanford2bel__enum_functor_desc_label_0_8;
    stanford2bel__enum_value_ordered_label_0[9] = stanford2bel.stanford2bel__enum_functor_desc_label_0_9;
    stanford2bel__enum_value_ordered_label_0[10] = stanford2bel.stanford2bel__enum_functor_desc_label_0_10;
    stanford2bel__enum_value_ordered_label_0[11] = stanford2bel.stanford2bel__enum_functor_desc_label_0_11;
    stanford2bel__enum_value_ordered_label_0[12] = stanford2bel.stanford2bel__enum_functor_desc_label_0_12;
    stanford2bel__enum_value_ordered_label_0[13] = stanford2bel.stanford2bel__enum_functor_desc_label_0_13;
    stanford2bel__enum_value_ordered_label_0[14] = stanford2bel.stanford2bel__enum_functor_desc_label_0_14;
    stanford2bel__enum_value_ordered_label_0[15] = stanford2bel.stanford2bel__enum_functor_desc_label_0_15;
    stanford2bel__enum_value_ordered_label_0[16] = stanford2bel.stanford2bel__enum_functor_desc_label_0_16;
    stanford2bel__enum_value_ordered_label_0[17] = stanford2bel.stanford2bel__enum_functor_desc_label_0_17;
    stanford2bel__enum_value_ordered_label_0[18] = stanford2bel.stanford2bel__enum_functor_desc_label_0_18;
    stanford2bel__enum_value_ordered_label_0[19] = stanford2bel.stanford2bel__enum_functor_desc_label_0_19;
    stanford2bel__enum_value_ordered_label_0[20] = stanford2bel.stanford2bel__enum_functor_desc_label_0_20;
    stanford2bel__enum_value_ordered_label_0[21] = stanford2bel.stanford2bel__enum_functor_desc_label_0_21;
    stanford2bel__enum_value_ordered_label_0[22] = stanford2bel.stanford2bel__enum_functor_desc_label_0_22;
    stanford2bel__enum_value_ordered_label_0[23] = stanford2bel.stanford2bel__enum_functor_desc_label_0_23;
    stanford2bel__enum_value_ordered_label_0[24] = stanford2bel.stanford2bel__enum_functor_desc_label_0_24;
    stanford2bel__enum_value_ordered_label_0[25] = stanford2bel.stanford2bel__enum_functor_desc_label_0_25;
    stanford2bel__enum_value_ordered_label_0[26] = stanford2bel.stanford2bel__enum_functor_desc_label_0_26;
    stanford2bel__enum_value_ordered_label_0[27] = stanford2bel.stanford2bel__enum_functor_desc_label_0_27;
    stanford2bel__enum_value_ordered_label_0[28] = stanford2bel.stanford2bel__enum_functor_desc_label_0_28;
    stanford2bel__enum_value_ordered_label_0[29] = stanford2bel.stanford2bel__enum_functor_desc_label_0_29;
    stanford2bel__enum_value_ordered_label_0[30] = stanford2bel.stanford2bel__enum_functor_desc_label_0_30;
    stanford2bel__enum_value_ordered_label_0[31] = stanford2bel.stanford2bel__enum_functor_desc_label_0_31;
    stanford2bel__enum_value_ordered_label_0[32] = stanford2bel.stanford2bel__enum_functor_desc_label_0_32;
    stanford2bel__enum_value_ordered_label_0[33] = stanford2bel.stanford2bel__enum_functor_desc_label_0_33;
    stanford2bel__enum_value_ordered_label_0[34] = stanford2bel.stanford2bel__enum_functor_desc_label_0_34;
    stanford2bel__enum_value_ordered_label_0[35] = stanford2bel.stanford2bel__enum_functor_desc_label_0_35;
    stanford2bel__enum_value_ordered_label_0[36] = stanford2bel.stanford2bel__enum_functor_desc_label_0_36;
    stanford2bel__enum_value_ordered_label_0[37] = stanford2bel.stanford2bel__enum_functor_desc_label_0_37;
    stanford2bel__enum_value_ordered_label_0[38] = stanford2bel.stanford2bel__enum_functor_desc_label_0_38;
    stanford2bel__enum_value_ordered_label_0[39] = stanford2bel.stanford2bel__enum_functor_desc_label_0_39;
    stanford2bel__enum_value_ordered_label_0[40] = stanford2bel.stanford2bel__enum_functor_desc_label_0_40;
    stanford2bel__enum_value_ordered_label_0[41] = stanford2bel.stanford2bel__enum_functor_desc_label_0_41;
    stanford2bel__enum_value_ordered_label_0[42] = stanford2bel.stanford2bel__enum_functor_desc_label_0_42;
    stanford2bel__enum_value_ordered_label_0[43] = stanford2bel.stanford2bel__enum_functor_desc_label_0_43;
    stanford2bel__enum_value_ordered_label_0[44] = stanford2bel.stanford2bel__enum_functor_desc_label_0_44;
    stanford2bel__enum_value_ordered_label_0[45] = stanford2bel.stanford2bel__enum_functor_desc_label_0_45;
    stanford2bel__enum_value_ordered_label_0[46] = stanford2bel.stanford2bel__enum_functor_desc_label_0_46;
    stanford2bel__enum_value_ordered_label_0[47] = stanford2bel.stanford2bel__enum_functor_desc_label_0_47;
    stanford2bel__enum_value_ordered_label_0[48] = stanford2bel.stanford2bel__enum_functor_desc_label_0_48;
    stanford2bel__enum_value_ordered_label_0[49] = stanford2bel.stanford2bel__enum_functor_desc_label_0_49;
    stanford2bel__enum_value_ordered_label_0[50] = stanford2bel.stanford2bel__enum_functor_desc_label_0_50;
    stanford2bel__enum_value_ordered_label_0[51] = stanford2bel.stanford2bel__enum_functor_desc_label_0_51;
    stanford2bel__enum_value_ordered_label_0[52] = stanford2bel.stanford2bel__enum_functor_desc_label_0_52;
    stanford2bel__enum_value_ordered_label_0[53] = stanford2bel.stanford2bel__enum_functor_desc_label_0_53;
    stanford2bel__enum_value_ordered_label_0[54] = stanford2bel.stanford2bel__enum_functor_desc_label_0_54;
    stanford2bel__enum_value_ordered_label_0[55] = stanford2bel.stanford2bel__enum_functor_desc_label_0_55;
    stanford2bel__enum_value_ordered_label_0[56] = stanford2bel.stanford2bel__enum_functor_desc_label_0_56;
    stanford2bel__enum_value_ordered_label_0[57] = stanford2bel.stanford2bel__enum_functor_desc_label_0_57;
    //
    stanford2bel__enum_name_ordered_label_0[0] = stanford2bel.stanford2bel__enum_functor_desc_label_0_25;
    stanford2bel__enum_name_ordered_label_0[1] = stanford2bel.stanford2bel__enum_functor_desc_label_0_27;
    stanford2bel__enum_name_ordered_label_0[2] = stanford2bel.stanford2bel__enum_functor_desc_label_0_38;
    stanford2bel__enum_name_ordered_label_0[3] = stanford2bel.stanford2bel__enum_functor_desc_label_0_55;
    stanford2bel__enum_name_ordered_label_0[4] = stanford2bel.stanford2bel__enum_functor_desc_label_0_30;
    stanford2bel__enum_name_ordered_label_0[5] = stanford2bel.stanford2bel__enum_functor_desc_label_0_35;
    stanford2bel__enum_name_ordered_label_0[6] = stanford2bel.stanford2bel__enum_functor_desc_label_0_7;
    stanford2bel__enum_name_ordered_label_0[7] = stanford2bel.stanford2bel__enum_functor_desc_label_0_19;
    stanford2bel__enum_name_ordered_label_0[8] = stanford2bel.stanford2bel__enum_functor_desc_label_0_1;
    stanford2bel__enum_name_ordered_label_0[9] = stanford2bel.stanford2bel__enum_functor_desc_label_0_2;
    stanford2bel__enum_name_ordered_label_0[10] = stanford2bel.stanford2bel__enum_functor_desc_label_0_5;
    stanford2bel__enum_name_ordered_label_0[11] = stanford2bel.stanford2bel__enum_functor_desc_label_0_20;
    stanford2bel__enum_name_ordered_label_0[12] = stanford2bel.stanford2bel__enum_functor_desc_label_0_13;
    stanford2bel__enum_name_ordered_label_0[13] = stanford2bel.stanford2bel__enum_functor_desc_label_0_4;
    stanford2bel__enum_name_ordered_label_0[14] = stanford2bel.stanford2bel__enum_functor_desc_label_0_3;
    stanford2bel__enum_name_ordered_label_0[15] = stanford2bel.stanford2bel__enum_functor_desc_label_0_11;
    stanford2bel__enum_name_ordered_label_0[16] = stanford2bel.stanford2bel__enum_functor_desc_label_0_12;
    stanford2bel__enum_name_ordered_label_0[17] = stanford2bel.stanford2bel__enum_functor_desc_label_0_56;
    stanford2bel__enum_name_ordered_label_0[18] = stanford2bel.stanford2bel__enum_functor_desc_label_0_44;
    stanford2bel__enum_name_ordered_label_0[19] = stanford2bel.stanford2bel__enum_functor_desc_label_0_36;
    stanford2bel__enum_name_ordered_label_0[20] = stanford2bel.stanford2bel__enum_functor_desc_label_0_15;
    stanford2bel__enum_name_ordered_label_0[21] = stanford2bel.stanford2bel__enum_functor_desc_label_0_24;
    stanford2bel__enum_name_ordered_label_0[22] = stanford2bel.stanford2bel__enum_functor_desc_label_0_52;
    stanford2bel__enum_name_ordered_label_0[23] = stanford2bel.stanford2bel__enum_functor_desc_label_0_16;
    stanford2bel__enum_name_ordered_label_0[24] = stanford2bel.stanford2bel__enum_functor_desc_label_0_26;
    stanford2bel__enum_name_ordered_label_0[25] = stanford2bel.stanford2bel__enum_functor_desc_label_0_29;
    stanford2bel__enum_name_ordered_label_0[26] = stanford2bel.stanford2bel__enum_functor_desc_label_0_43;
    stanford2bel__enum_name_ordered_label_0[27] = stanford2bel.stanford2bel__enum_functor_desc_label_0_42;
    stanford2bel__enum_name_ordered_label_0[28] = stanford2bel.stanford2bel__enum_functor_desc_label_0_39;
    stanford2bel__enum_name_ordered_label_0[29] = stanford2bel.stanford2bel__enum_functor_desc_label_0_34;
    stanford2bel__enum_name_ordered_label_0[30] = stanford2bel.stanford2bel__enum_functor_desc_label_0_40;
    stanford2bel__enum_name_ordered_label_0[31] = stanford2bel.stanford2bel__enum_functor_desc_label_0_9;
    stanford2bel__enum_name_ordered_label_0[32] = stanford2bel.stanford2bel__enum_functor_desc_label_0_10;
    stanford2bel__enum_name_ordered_label_0[33] = stanford2bel.stanford2bel__enum_functor_desc_label_0_31;
    stanford2bel__enum_name_ordered_label_0[34] = stanford2bel.stanford2bel__enum_functor_desc_label_0_32;
    stanford2bel__enum_name_ordered_label_0[35] = stanford2bel.stanford2bel__enum_functor_desc_label_0_14;
    stanford2bel__enum_name_ordered_label_0[36] = stanford2bel.stanford2bel__enum_functor_desc_label_0_51;
    stanford2bel__enum_name_ordered_label_0[37] = stanford2bel.stanford2bel__enum_functor_desc_label_0_18;
    stanford2bel__enum_name_ordered_label_0[38] = stanford2bel.stanford2bel__enum_functor_desc_label_0_17;
    stanford2bel__enum_name_ordered_label_0[39] = stanford2bel.stanford2bel__enum_functor_desc_label_0_47;
    stanford2bel__enum_name_ordered_label_0[40] = stanford2bel.stanford2bel__enum_functor_desc_label_0_48;
    stanford2bel__enum_name_ordered_label_0[41] = stanford2bel.stanford2bel__enum_functor_desc_label_0_0;
    stanford2bel__enum_name_ordered_label_0[42] = stanford2bel.stanford2bel__enum_functor_desc_label_0_46;
    stanford2bel__enum_name_ordered_label_0[43] = stanford2bel.stanford2bel__enum_functor_desc_label_0_45;
    stanford2bel__enum_name_ordered_label_0[44] = stanford2bel.stanford2bel__enum_functor_desc_label_0_49;
    stanford2bel__enum_name_ordered_label_0[45] = stanford2bel.stanford2bel__enum_functor_desc_label_0_57;
    stanford2bel__enum_name_ordered_label_0[46] = stanford2bel.stanford2bel__enum_functor_desc_label_0_50;
    stanford2bel__enum_name_ordered_label_0[47] = stanford2bel.stanford2bel__enum_functor_desc_label_0_6;
    stanford2bel__enum_name_ordered_label_0[48] = stanford2bel.stanford2bel__enum_functor_desc_label_0_33;
    stanford2bel__enum_name_ordered_label_0[49] = stanford2bel.stanford2bel__enum_functor_desc_label_0_28;
    stanford2bel__enum_name_ordered_label_0[50] = stanford2bel.stanford2bel__enum_functor_desc_label_0_23;
    stanford2bel__enum_name_ordered_label_0[51] = stanford2bel.stanford2bel__enum_functor_desc_label_0_22;
    stanford2bel__enum_name_ordered_label_0[52] = stanford2bel.stanford2bel__enum_functor_desc_label_0_53;
    stanford2bel__enum_name_ordered_label_0[53] = stanford2bel.stanford2bel__enum_functor_desc_label_0_8;
    stanford2bel__enum_name_ordered_label_0[54] = stanford2bel.stanford2bel__enum_functor_desc_label_0_41;
    stanford2bel__enum_name_ordered_label_0[55] = stanford2bel.stanford2bel__enum_functor_desc_label_0_37;
    stanford2bel__enum_name_ordered_label_0[56] = stanford2bel.stanford2bel__enum_functor_desc_label_0_21;
    stanford2bel__enum_name_ordered_label_0[57] = stanford2bel.stanford2bel__enum_functor_desc_label_0_54;
    //
    stanford2bel__functor_number_map_label_0[0] = 41;
    stanford2bel__functor_number_map_label_0[1] = 8;
    stanford2bel__functor_number_map_label_0[2] = 9;
    stanford2bel__functor_number_map_label_0[3] = 14;
    stanford2bel__functor_number_map_label_0[4] = 13;
    stanford2bel__functor_number_map_label_0[5] = 10;
    stanford2bel__functor_number_map_label_0[6] = 47;
    stanford2bel__functor_number_map_label_0[7] = 6;
    stanford2bel__functor_number_map_label_0[8] = 53;
    stanford2bel__functor_number_map_label_0[9] = 31;
    stanford2bel__functor_number_map_label_0[10] = 32;
    stanford2bel__functor_number_map_label_0[11] = 15;
    stanford2bel__functor_number_map_label_0[12] = 16;
    stanford2bel__functor_number_map_label_0[13] = 12;
    stanford2bel__functor_number_map_label_0[14] = 35;
    stanford2bel__functor_number_map_label_0[15] = 20;
    stanford2bel__functor_number_map_label_0[16] = 23;
    stanford2bel__functor_number_map_label_0[17] = 38;
    stanford2bel__functor_number_map_label_0[18] = 37;
    stanford2bel__functor_number_map_label_0[19] = 7;
    stanford2bel__functor_number_map_label_0[20] = 11;
    stanford2bel__functor_number_map_label_0[21] = 56;
    stanford2bel__functor_number_map_label_0[22] = 51;
    stanford2bel__functor_number_map_label_0[23] = 50;
    stanford2bel__functor_number_map_label_0[24] = 21;
    stanford2bel__functor_number_map_label_0[25] = 0;
    stanford2bel__functor_number_map_label_0[26] = 24;
    stanford2bel__functor_number_map_label_0[27] = 1;
    stanford2bel__functor_number_map_label_0[28] = 49;
    stanford2bel__functor_number_map_label_0[29] = 25;
    stanford2bel__functor_number_map_label_0[30] = 4;
    stanford2bel__functor_number_map_label_0[31] = 33;
    stanford2bel__functor_number_map_label_0[32] = 34;
    stanford2bel__functor_number_map_label_0[33] = 48;
    stanford2bel__functor_number_map_label_0[34] = 29;
    stanford2bel__functor_number_map_label_0[35] = 5;
    stanford2bel__functor_number_map_label_0[36] = 19;
    stanford2bel__functor_number_map_label_0[37] = 55;
    stanford2bel__functor_number_map_label_0[38] = 2;
    stanford2bel__functor_number_map_label_0[39] = 28;
    stanford2bel__functor_number_map_label_0[40] = 30;
    stanford2bel__functor_number_map_label_0[41] = 54;
    stanford2bel__functor_number_map_label_0[42] = 27;
    stanford2bel__functor_number_map_label_0[43] = 26;
    stanford2bel__functor_number_map_label_0[44] = 18;
    stanford2bel__functor_number_map_label_0[45] = 43;
    stanford2bel__functor_number_map_label_0[46] = 42;
    stanford2bel__functor_number_map_label_0[47] = 39;
    stanford2bel__functor_number_map_label_0[48] = 40;
    stanford2bel__functor_number_map_label_0[49] = 44;
    stanford2bel__functor_number_map_label_0[50] = 46;
    stanford2bel__functor_number_map_label_0[51] = 36;
    stanford2bel__functor_number_map_label_0[52] = 22;
    stanford2bel__functor_number_map_label_0[53] = 52;
    stanford2bel__functor_number_map_label_0[54] = 57;
    stanford2bel__functor_number_map_label_0[55] = 3;
    stanford2bel__functor_number_map_label_0[56] = 17;
    stanford2bel__functor_number_map_label_0[57] = 45;
    //
    stanford2bel__type_ctor_info_label_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_ENUM,
		((java.lang.Object) (new AddrOf2_0(10))),
		((java.lang.Object) (new AddrOf2_0(11))),
		"stanford2bel",
		"label",
		new jmercury.runtime.TypeFunctors(stanford2bel.stanford2bel__enum_name_ordered_label_0),
		new jmercury.runtime.TypeLayout(stanford2bel.stanford2bel__enum_value_ordered_label_0),
		58,
		4,
		stanford2bel.stanford2bel__functor_number_map_label_0);
    //
    stanford2bel__enum_functor_desc_netp_0_0.init("other",
		0);
    //
    stanford2bel__enum_functor_desc_netp_0_1.init("time",
		1);
    //
    stanford2bel__enum_functor_desc_netp_0_2.init("date",
		2);
    //
    stanford2bel__enum_functor_desc_netp_0_3.init("person",
		3);
    //
    stanford2bel__enum_functor_desc_netp_0_4.init("number",
		4);
    //
    stanford2bel__enum_functor_desc_netp_0_5.init("location",
		5);
    //
    stanford2bel__enum_functor_desc_netp_0_6.init("misc",
		6);
    //
    stanford2bel__enum_functor_desc_netp_0_7.init("duration",
		7);
    //
    stanford2bel__enum_functor_desc_netp_0_8.init("money",
		8);
    //
    stanford2bel__enum_functor_desc_netp_0_9.init("organization",
		9);
    //
    stanford2bel__enum_functor_desc_netp_0_10.init("ordinal",
		10);
    //
    stanford2bel__enum_functor_desc_netp_0_11.init("percent",
		11);
    //
    stanford2bel__enum_functor_desc_netp_0_12.init("set",
		12);
    //
    stanford2bel__enum_value_ordered_netp_0[0] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_0;
    stanford2bel__enum_value_ordered_netp_0[1] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_1;
    stanford2bel__enum_value_ordered_netp_0[2] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_2;
    stanford2bel__enum_value_ordered_netp_0[3] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_3;
    stanford2bel__enum_value_ordered_netp_0[4] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_4;
    stanford2bel__enum_value_ordered_netp_0[5] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_5;
    stanford2bel__enum_value_ordered_netp_0[6] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_6;
    stanford2bel__enum_value_ordered_netp_0[7] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_7;
    stanford2bel__enum_value_ordered_netp_0[8] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_8;
    stanford2bel__enum_value_ordered_netp_0[9] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_9;
    stanford2bel__enum_value_ordered_netp_0[10] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_10;
    stanford2bel__enum_value_ordered_netp_0[11] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_11;
    stanford2bel__enum_value_ordered_netp_0[12] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_12;
    //
    stanford2bel__enum_name_ordered_netp_0[0] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_2;
    stanford2bel__enum_name_ordered_netp_0[1] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_7;
    stanford2bel__enum_name_ordered_netp_0[2] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_5;
    stanford2bel__enum_name_ordered_netp_0[3] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_6;
    stanford2bel__enum_name_ordered_netp_0[4] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_8;
    stanford2bel__enum_name_ordered_netp_0[5] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_4;
    stanford2bel__enum_name_ordered_netp_0[6] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_10;
    stanford2bel__enum_name_ordered_netp_0[7] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_9;
    stanford2bel__enum_name_ordered_netp_0[8] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_0;
    stanford2bel__enum_name_ordered_netp_0[9] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_11;
    stanford2bel__enum_name_ordered_netp_0[10] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_3;
    stanford2bel__enum_name_ordered_netp_0[11] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_12;
    stanford2bel__enum_name_ordered_netp_0[12] = stanford2bel.stanford2bel__enum_functor_desc_netp_0_1;
    //
    stanford2bel__functor_number_map_netp_0[0] = 8;
    stanford2bel__functor_number_map_netp_0[1] = 12;
    stanford2bel__functor_number_map_netp_0[2] = 0;
    stanford2bel__functor_number_map_netp_0[3] = 10;
    stanford2bel__functor_number_map_netp_0[4] = 5;
    stanford2bel__functor_number_map_netp_0[5] = 2;
    stanford2bel__functor_number_map_netp_0[6] = 3;
    stanford2bel__functor_number_map_netp_0[7] = 1;
    stanford2bel__functor_number_map_netp_0[8] = 4;
    stanford2bel__functor_number_map_netp_0[9] = 7;
    stanford2bel__functor_number_map_netp_0[10] = 6;
    stanford2bel__functor_number_map_netp_0[11] = 9;
    stanford2bel__functor_number_map_netp_0[12] = 11;
    //
    stanford2bel__type_ctor_info_netp_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_ENUM,
		((java.lang.Object) (new AddrOf2_0(12))),
		((java.lang.Object) (new AddrOf2_0(13))),
		"stanford2bel",
		"netp",
		new jmercury.runtime.TypeFunctors(stanford2bel.stanford2bel__enum_name_ordered_netp_0),
		new jmercury.runtime.TypeLayout(stanford2bel.stanford2bel__enum_value_ordered_netp_0),
		13,
		4,
		stanford2bel.stanford2bel__functor_number_map_netp_0);
    //
    stanford2bel__enum_functor_desc_pos_0_0.init("cc",
		0);
    //
    stanford2bel__enum_functor_desc_pos_0_1.init("cd",
		1);
    //
    stanford2bel__enum_functor_desc_pos_0_2.init("dt",
		2);
    //
    stanford2bel__enum_functor_desc_pos_0_3.init("ex",
		3);
    //
    stanford2bel__enum_functor_desc_pos_0_4.init("fw",
		4);
    //
    stanford2bel__enum_functor_desc_pos_0_5.init("in",
		5);
    //
    stanford2bel__enum_functor_desc_pos_0_6.init("jj",
		6);
    //
    stanford2bel__enum_functor_desc_pos_0_7.init("jjr",
		7);
    //
    stanford2bel__enum_functor_desc_pos_0_8.init("jjs",
		8);
    //
    stanford2bel__enum_functor_desc_pos_0_9.init("ls",
		9);
    //
    stanford2bel__enum_functor_desc_pos_0_10.init("md",
		10);
    //
    stanford2bel__enum_functor_desc_pos_0_11.init("nn",
		11);
    //
    stanford2bel__enum_functor_desc_pos_0_12.init("nnp",
		12);
    //
    stanford2bel__enum_functor_desc_pos_0_13.init("nnps",
		13);
    //
    stanford2bel__enum_functor_desc_pos_0_14.init("nns",
		14);
    //
    stanford2bel__enum_functor_desc_pos_0_15.init("pdt",
		15);
    //
    stanford2bel__enum_functor_desc_pos_0_16.init("pos",
		16);
    //
    stanford2bel__enum_functor_desc_pos_0_17.init("prp",
		17);
    //
    stanford2bel__enum_functor_desc_pos_0_18.init("prps",
		18);
    //
    stanford2bel__enum_functor_desc_pos_0_19.init("rb",
		19);
    //
    stanford2bel__enum_functor_desc_pos_0_20.init("rbr",
		20);
    //
    stanford2bel__enum_functor_desc_pos_0_21.init("rbs",
		21);
    //
    stanford2bel__enum_functor_desc_pos_0_22.init("rp",
		22);
    //
    stanford2bel__enum_functor_desc_pos_0_23.init("sym",
		23);
    //
    stanford2bel__enum_functor_desc_pos_0_24.init("to",
		24);
    //
    stanford2bel__enum_functor_desc_pos_0_25.init("uh",
		25);
    //
    stanford2bel__enum_functor_desc_pos_0_26.init("vb",
		26);
    //
    stanford2bel__enum_functor_desc_pos_0_27.init("vbd",
		27);
    //
    stanford2bel__enum_functor_desc_pos_0_28.init("vbg",
		28);
    //
    stanford2bel__enum_functor_desc_pos_0_29.init("vbn",
		29);
    //
    stanford2bel__enum_functor_desc_pos_0_30.init("vbp",
		30);
    //
    stanford2bel__enum_functor_desc_pos_0_31.init("vbz",
		31);
    //
    stanford2bel__enum_functor_desc_pos_0_32.init("wdt",
		32);
    //
    stanford2bel__enum_functor_desc_pos_0_33.init("wp",
		33);
    //
    stanford2bel__enum_functor_desc_pos_0_34.init("wps",
		34);
    //
    stanford2bel__enum_functor_desc_pos_0_35.init("wrb",
		35);
    //
    stanford2bel__enum_functor_desc_pos_0_36.init("punc",
		36);
    //
    stanford2bel__enum_value_ordered_pos_0[0] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_0;
    stanford2bel__enum_value_ordered_pos_0[1] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_1;
    stanford2bel__enum_value_ordered_pos_0[2] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_2;
    stanford2bel__enum_value_ordered_pos_0[3] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_3;
    stanford2bel__enum_value_ordered_pos_0[4] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_4;
    stanford2bel__enum_value_ordered_pos_0[5] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_5;
    stanford2bel__enum_value_ordered_pos_0[6] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_6;
    stanford2bel__enum_value_ordered_pos_0[7] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_7;
    stanford2bel__enum_value_ordered_pos_0[8] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_8;
    stanford2bel__enum_value_ordered_pos_0[9] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_9;
    stanford2bel__enum_value_ordered_pos_0[10] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_10;
    stanford2bel__enum_value_ordered_pos_0[11] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_11;
    stanford2bel__enum_value_ordered_pos_0[12] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_12;
    stanford2bel__enum_value_ordered_pos_0[13] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_13;
    stanford2bel__enum_value_ordered_pos_0[14] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_14;
    stanford2bel__enum_value_ordered_pos_0[15] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_15;
    stanford2bel__enum_value_ordered_pos_0[16] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_16;
    stanford2bel__enum_value_ordered_pos_0[17] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_17;
    stanford2bel__enum_value_ordered_pos_0[18] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_18;
    stanford2bel__enum_value_ordered_pos_0[19] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_19;
    stanford2bel__enum_value_ordered_pos_0[20] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_20;
    stanford2bel__enum_value_ordered_pos_0[21] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_21;
    stanford2bel__enum_value_ordered_pos_0[22] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_22;
    stanford2bel__enum_value_ordered_pos_0[23] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_23;
    stanford2bel__enum_value_ordered_pos_0[24] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_24;
    stanford2bel__enum_value_ordered_pos_0[25] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_25;
    stanford2bel__enum_value_ordered_pos_0[26] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_26;
    stanford2bel__enum_value_ordered_pos_0[27] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_27;
    stanford2bel__enum_value_ordered_pos_0[28] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_28;
    stanford2bel__enum_value_ordered_pos_0[29] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_29;
    stanford2bel__enum_value_ordered_pos_0[30] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_30;
    stanford2bel__enum_value_ordered_pos_0[31] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_31;
    stanford2bel__enum_value_ordered_pos_0[32] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_32;
    stanford2bel__enum_value_ordered_pos_0[33] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_33;
    stanford2bel__enum_value_ordered_pos_0[34] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_34;
    stanford2bel__enum_value_ordered_pos_0[35] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_35;
    stanford2bel__enum_value_ordered_pos_0[36] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_36;
    //
    stanford2bel__enum_name_ordered_pos_0[0] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_0;
    stanford2bel__enum_name_ordered_pos_0[1] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_1;
    stanford2bel__enum_name_ordered_pos_0[2] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_2;
    stanford2bel__enum_name_ordered_pos_0[3] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_3;
    stanford2bel__enum_name_ordered_pos_0[4] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_4;
    stanford2bel__enum_name_ordered_pos_0[5] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_5;
    stanford2bel__enum_name_ordered_pos_0[6] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_6;
    stanford2bel__enum_name_ordered_pos_0[7] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_7;
    stanford2bel__enum_name_ordered_pos_0[8] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_8;
    stanford2bel__enum_name_ordered_pos_0[9] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_9;
    stanford2bel__enum_name_ordered_pos_0[10] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_10;
    stanford2bel__enum_name_ordered_pos_0[11] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_11;
    stanford2bel__enum_name_ordered_pos_0[12] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_12;
    stanford2bel__enum_name_ordered_pos_0[13] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_13;
    stanford2bel__enum_name_ordered_pos_0[14] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_14;
    stanford2bel__enum_name_ordered_pos_0[15] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_15;
    stanford2bel__enum_name_ordered_pos_0[16] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_16;
    stanford2bel__enum_name_ordered_pos_0[17] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_17;
    stanford2bel__enum_name_ordered_pos_0[18] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_18;
    stanford2bel__enum_name_ordered_pos_0[19] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_36;
    stanford2bel__enum_name_ordered_pos_0[20] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_19;
    stanford2bel__enum_name_ordered_pos_0[21] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_20;
    stanford2bel__enum_name_ordered_pos_0[22] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_21;
    stanford2bel__enum_name_ordered_pos_0[23] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_22;
    stanford2bel__enum_name_ordered_pos_0[24] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_23;
    stanford2bel__enum_name_ordered_pos_0[25] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_24;
    stanford2bel__enum_name_ordered_pos_0[26] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_25;
    stanford2bel__enum_name_ordered_pos_0[27] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_26;
    stanford2bel__enum_name_ordered_pos_0[28] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_27;
    stanford2bel__enum_name_ordered_pos_0[29] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_28;
    stanford2bel__enum_name_ordered_pos_0[30] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_29;
    stanford2bel__enum_name_ordered_pos_0[31] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_30;
    stanford2bel__enum_name_ordered_pos_0[32] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_31;
    stanford2bel__enum_name_ordered_pos_0[33] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_32;
    stanford2bel__enum_name_ordered_pos_0[34] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_33;
    stanford2bel__enum_name_ordered_pos_0[35] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_34;
    stanford2bel__enum_name_ordered_pos_0[36] = stanford2bel.stanford2bel__enum_functor_desc_pos_0_35;
    //
    stanford2bel__functor_number_map_pos_0[0] = 0;
    stanford2bel__functor_number_map_pos_0[1] = 1;
    stanford2bel__functor_number_map_pos_0[2] = 2;
    stanford2bel__functor_number_map_pos_0[3] = 3;
    stanford2bel__functor_number_map_pos_0[4] = 4;
    stanford2bel__functor_number_map_pos_0[5] = 5;
    stanford2bel__functor_number_map_pos_0[6] = 6;
    stanford2bel__functor_number_map_pos_0[7] = 7;
    stanford2bel__functor_number_map_pos_0[8] = 8;
    stanford2bel__functor_number_map_pos_0[9] = 9;
    stanford2bel__functor_number_map_pos_0[10] = 10;
    stanford2bel__functor_number_map_pos_0[11] = 11;
    stanford2bel__functor_number_map_pos_0[12] = 12;
    stanford2bel__functor_number_map_pos_0[13] = 13;
    stanford2bel__functor_number_map_pos_0[14] = 14;
    stanford2bel__functor_number_map_pos_0[15] = 15;
    stanford2bel__functor_number_map_pos_0[16] = 16;
    stanford2bel__functor_number_map_pos_0[17] = 17;
    stanford2bel__functor_number_map_pos_0[18] = 18;
    stanford2bel__functor_number_map_pos_0[19] = 20;
    stanford2bel__functor_number_map_pos_0[20] = 21;
    stanford2bel__functor_number_map_pos_0[21] = 22;
    stanford2bel__functor_number_map_pos_0[22] = 23;
    stanford2bel__functor_number_map_pos_0[23] = 24;
    stanford2bel__functor_number_map_pos_0[24] = 25;
    stanford2bel__functor_number_map_pos_0[25] = 26;
    stanford2bel__functor_number_map_pos_0[26] = 27;
    stanford2bel__functor_number_map_pos_0[27] = 28;
    stanford2bel__functor_number_map_pos_0[28] = 29;
    stanford2bel__functor_number_map_pos_0[29] = 30;
    stanford2bel__functor_number_map_pos_0[30] = 31;
    stanford2bel__functor_number_map_pos_0[31] = 32;
    stanford2bel__functor_number_map_pos_0[32] = 33;
    stanford2bel__functor_number_map_pos_0[33] = 34;
    stanford2bel__functor_number_map_pos_0[34] = 35;
    stanford2bel__functor_number_map_pos_0[35] = 36;
    stanford2bel__functor_number_map_pos_0[36] = 19;
    //
    stanford2bel__type_ctor_info_pos_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_ENUM,
		((java.lang.Object) (new AddrOf2_0(14))),
		((java.lang.Object) (new AddrOf2_0(15))),
		"stanford2bel",
		"pos",
		new jmercury.runtime.TypeFunctors(stanford2bel.stanford2bel__enum_name_ordered_pos_0),
		new jmercury.runtime.TypeLayout(stanford2bel.stanford2bel__enum_value_ordered_pos_0),
		37,
		4,
		stanford2bel.stanford2bel__functor_number_map_pos_0);
    //
    tree234__ti_tree234_2builtin__type_ctor_info_int_0list__ti_list_1pair__ti_pair_2stanford2bel__type_ctor_info_label_0builtin__type_ctor_info_int_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.list__ti_list_1pair__ti_pair_2stanford2bel__type_ctor_info_label_0builtin__type_ctor_info_int_0)});
    //
    stanford2bel__type_ctor_info_relmap_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(16))),
		((java.lang.Object) (new AddrOf2_0(17))),
		"stanford2bel",
		"relmap",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) stanford2bel.tree234__ti_tree234_2builtin__type_ctor_info_int_0list__ti_list_1pair__ti_pair_2stanford2bel__type_ctor_info_label_0builtin__type_ctor_info_int_0),
		-1,
		0,
		null);
    //
    stanford2bel__field_types_semrel_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    stanford2bel__field_types_semrel_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    stanford2bel__field_types_semrel_0_0[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    stanford2bel__du_functor_desc_semrel_0_0.init("semrel",
		3,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		stanford2bel.stanford2bel__field_types_semrel_0_0,
		null,
		null,
		null);
    //
    stanford2bel__du_stag_ordered_semrel_0_0[0] = stanford2bel.stanford2bel__du_functor_desc_semrel_0_0;
    //
    stanford2bel__du_ptag_ordered_semrel_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		stanford2bel.stanford2bel__du_stag_ordered_semrel_0_0);
    //
    stanford2bel__du_name_ordered_semrel_0[0] = stanford2bel.stanford2bel__du_functor_desc_semrel_0_0;
    //
    stanford2bel__functor_number_map_semrel_0[0] = 0;
    //
    stanford2bel__type_ctor_info_semrel_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(18))),
		((java.lang.Object) (new AddrOf2_0(19))),
		"stanford2bel",
		"semrel",
		new jmercury.runtime.TypeFunctors(stanford2bel.stanford2bel__du_name_ordered_semrel_0),
		new jmercury.runtime.TypeLayout(stanford2bel.stanford2bel__du_ptag_ordered_semrel_0),
		1,
		4,
		stanford2bel.stanford2bel__functor_number_map_semrel_0);
    //
    //
    list__ti_list_1stanford2bel__type_ctor_info_token_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_token_0)});
    //
    //
    list__ti_list_1stanford2bel__type_ctor_info_semrel_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_semrel_0)});
    //
    stanford2bel__field_types_sent_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    stanford2bel__field_types_sent_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    stanford2bel__field_types_sent_0_0[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    stanford2bel__field_types_sent_0_0[3] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    stanford2bel__field_types_sent_0_0[4] = (jmercury.runtime.PseudoTypeInfo) stanford2bel.list__ti_list_1stanford2bel__type_ctor_info_token_0;
    stanford2bel__field_types_sent_0_0[5] = (jmercury.runtime.PseudoTypeInfo) stanford2bel.list__ti_list_1stanford2bel__type_ctor_info_semrel_0;
    //
    stanford2bel__du_functor_desc_sent_0_0.init("sentence",
		6,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		stanford2bel.stanford2bel__field_types_sent_0_0,
		null,
		null,
		null);
    //
    stanford2bel__du_stag_ordered_sent_0_0[0] = stanford2bel.stanford2bel__du_functor_desc_sent_0_0;
    //
    stanford2bel__du_ptag_ordered_sent_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		stanford2bel.stanford2bel__du_stag_ordered_sent_0_0);
    //
    stanford2bel__du_name_ordered_sent_0[0] = stanford2bel.stanford2bel__du_functor_desc_sent_0_0;
    //
    stanford2bel__functor_number_map_sent_0[0] = 0;
    //
    stanford2bel__type_ctor_info_sent_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(20))),
		((java.lang.Object) (new AddrOf2_0(21))),
		"stanford2bel",
		"sent",
		new jmercury.runtime.TypeFunctors(stanford2bel.stanford2bel__du_name_ordered_sent_0),
		new jmercury.runtime.TypeLayout(stanford2bel.stanford2bel__du_ptag_ordered_sent_0),
		1,
		4,
		stanford2bel.stanford2bel__functor_number_map_sent_0);
    //
    tree234__ti_tree234_2builtin__type_ctor_info_int_0stanford2bel__type_ctor_info_token2_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_token2_0)});
    //
    stanford2bel__field_types_sent2_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    stanford2bel__field_types_sent2_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    stanford2bel__field_types_sent2_0_0[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    stanford2bel__field_types_sent2_0_0[3] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    stanford2bel__field_types_sent2_0_0[4] = (jmercury.runtime.PseudoTypeInfo) stanford2bel.tree234__ti_tree234_2builtin__type_ctor_info_int_0stanford2bel__type_ctor_info_token2_0;
    stanford2bel__field_types_sent2_0_0[5] = (jmercury.runtime.PseudoTypeInfo) stanford2bel.tree234__ti_tree234_2builtin__type_ctor_info_int_0list__ti_list_1pair__ti_pair_2stanford2bel__type_ctor_info_label_0builtin__type_ctor_info_int_0;
    //
    stanford2bel__du_functor_desc_sent2_0_0.init("sentence",
		6,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		stanford2bel.stanford2bel__field_types_sent2_0_0,
		null,
		null,
		null);
    //
    stanford2bel__du_stag_ordered_sent2_0_0[0] = stanford2bel.stanford2bel__du_functor_desc_sent2_0_0;
    //
    stanford2bel__du_ptag_ordered_sent2_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		stanford2bel.stanford2bel__du_stag_ordered_sent2_0_0);
    //
    stanford2bel__du_name_ordered_sent2_0[0] = stanford2bel.stanford2bel__du_functor_desc_sent2_0_0;
    //
    stanford2bel__functor_number_map_sent2_0[0] = 0;
    //
    stanford2bel__type_ctor_info_sent2_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(22))),
		((java.lang.Object) (new AddrOf2_0(23))),
		"stanford2bel",
		"sent2",
		new jmercury.runtime.TypeFunctors(stanford2bel.stanford2bel__du_name_ordered_sent2_0),
		new jmercury.runtime.TypeLayout(stanford2bel.stanford2bel__du_ptag_ordered_sent2_0),
		1,
		4,
		stanford2bel.stanford2bel__functor_number_map_sent2_0);
    //
    stanford2bel__type_ctor_info_sid_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(24))),
		((java.lang.Object) (new AddrOf2_0(25))),
		"stanford2bel",
		"sid",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0),
		-1,
		0,
		null);
    //
    //
    list__ti_list_1stanford2bel__type_ctor_info_sent_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_sent_0)});
    //
    //
    list__ti_list_1stanford2bel__type_ctor_info_entity_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_entity_0)});
    //
    stanford2bel__field_types_stfile_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    stanford2bel__field_types_stfile_0_0[1] = (jmercury.runtime.PseudoTypeInfo) stanford2bel.list__ti_list_1stanford2bel__type_ctor_info_sent_0;
    stanford2bel__field_types_stfile_0_0[2] = (jmercury.runtime.PseudoTypeInfo) stanford2bel.list__ti_list_1stanford2bel__type_ctor_info_entity_0;
    //
    stanford2bel__du_functor_desc_stfile_0_0.init("file",
		3,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		stanford2bel.stanford2bel__field_types_stfile_0_0,
		null,
		null,
		null);
    //
    stanford2bel__du_stag_ordered_stfile_0_0[0] = stanford2bel.stanford2bel__du_functor_desc_stfile_0_0;
    //
    stanford2bel__du_ptag_ordered_stfile_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		stanford2bel.stanford2bel__du_stag_ordered_stfile_0_0);
    //
    stanford2bel__du_name_ordered_stfile_0[0] = stanford2bel.stanford2bel__du_functor_desc_stfile_0_0;
    //
    stanford2bel__functor_number_map_stfile_0[0] = 0;
    //
    stanford2bel__type_ctor_info_stfile_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(26))),
		((java.lang.Object) (new AddrOf2_0(27))),
		"stanford2bel",
		"stfile",
		new jmercury.runtime.TypeFunctors(stanford2bel.stanford2bel__du_name_ordered_stfile_0),
		new jmercury.runtime.TypeLayout(stanford2bel.stanford2bel__du_ptag_ordered_stfile_0),
		1,
		4,
		stanford2bel.stanford2bel__functor_number_map_stfile_0);
    //
    //
    list__ti_list_1stanford2bel__type_ctor_info_sent2_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_sent2_0)});
    //
    stanford2bel__field_types_stfile2_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    stanford2bel__field_types_stfile2_0_0[1] = (jmercury.runtime.PseudoTypeInfo) stanford2bel.list__ti_list_1stanford2bel__type_ctor_info_sent2_0;
    stanford2bel__field_types_stfile2_0_0[2] = (jmercury.runtime.PseudoTypeInfo) stanford2bel.tree234__ti_tree234_2builtin__type_ctor_info_int_0stanford2bel__type_ctor_info_entity2_0;
    //
    stanford2bel__du_functor_desc_stfile2_0_0.init("stfile",
		3,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		stanford2bel.stanford2bel__field_types_stfile2_0_0,
		null,
		null,
		null);
    //
    stanford2bel__du_stag_ordered_stfile2_0_0[0] = stanford2bel.stanford2bel__du_functor_desc_stfile2_0_0;
    //
    stanford2bel__du_ptag_ordered_stfile2_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		stanford2bel.stanford2bel__du_stag_ordered_stfile2_0_0);
    //
    stanford2bel__du_name_ordered_stfile2_0[0] = stanford2bel.stanford2bel__du_functor_desc_stfile2_0_0;
    //
    stanford2bel__functor_number_map_stfile2_0[0] = 0;
    //
    stanford2bel__type_ctor_info_stfile2_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(28))),
		((java.lang.Object) (new AddrOf2_0(29))),
		"stanford2bel",
		"stfile2",
		new jmercury.runtime.TypeFunctors(stanford2bel.stanford2bel__du_name_ordered_stfile2_0),
		new jmercury.runtime.TypeLayout(stanford2bel.stanford2bel__du_ptag_ordered_stfile2_0),
		1,
		4,
		stanford2bel.stanford2bel__functor_number_map_stfile2_0);
    //
    //
    stanford2bel__field_types_stprop_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    stanford2bel__field_types_stprop_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    stanford2bel__field_types_stprop_0_0[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    stanford2bel__field_types_stprop_0_0[3] = (jmercury.runtime.PseudoTypeInfo) beliefs.beliefs__type_ctor_info_proposition_0;
    //
    stanford2bel__du_functor_desc_stprop_0_0.init("stprop",
		4,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		stanford2bel.stanford2bel__field_types_stprop_0_0,
		null,
		null,
		null);
    //
    stanford2bel__du_stag_ordered_stprop_0_0[0] = stanford2bel.stanford2bel__du_functor_desc_stprop_0_0;
    //
    stanford2bel__du_ptag_ordered_stprop_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		stanford2bel.stanford2bel__du_stag_ordered_stprop_0_0);
    //
    stanford2bel__du_name_ordered_stprop_0[0] = stanford2bel.stanford2bel__du_functor_desc_stprop_0_0;
    //
    stanford2bel__functor_number_map_stprop_0[0] = 0;
    //
    stanford2bel__type_ctor_info_stprop_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(30))),
		((java.lang.Object) (new AddrOf2_0(31))),
		"stanford2bel",
		"stprop",
		new jmercury.runtime.TypeFunctors(stanford2bel.stanford2bel__du_name_ordered_stprop_0),
		new jmercury.runtime.TypeLayout(stanford2bel.stanford2bel__du_ptag_ordered_stprop_0),
		1,
		4,
		stanford2bel.stanford2bel__functor_number_map_stprop_0);
    //
    list__ti_list_1stanford2bel__type_ctor_info_stprop_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_stprop_0)});
    //
    stanford2bel__field_types_stprops_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    stanford2bel__field_types_stprops_0_0[1] = (jmercury.runtime.PseudoTypeInfo) stanford2bel.list__ti_list_1stanford2bel__type_ctor_info_stprop_0;
    stanford2bel__field_types_stprops_0_0[2] = (jmercury.runtime.PseudoTypeInfo) stanford2bel.tree234__ti_tree234_2builtin__type_ctor_info_int_0stanford2bel__type_ctor_info_entity2_0;
    //
    stanford2bel__du_functor_desc_stprops_0_0.init("stprops",
		3,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		stanford2bel.stanford2bel__field_types_stprops_0_0,
		null,
		null,
		null);
    //
    stanford2bel__du_stag_ordered_stprops_0_0[0] = stanford2bel.stanford2bel__du_functor_desc_stprops_0_0;
    //
    stanford2bel__du_ptag_ordered_stprops_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		stanford2bel.stanford2bel__du_stag_ordered_stprops_0_0);
    //
    stanford2bel__du_name_ordered_stprops_0[0] = stanford2bel.stanford2bel__du_functor_desc_stprops_0_0;
    //
    stanford2bel__functor_number_map_stprops_0[0] = 0;
    //
    stanford2bel__type_ctor_info_stprops_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(32))),
		((java.lang.Object) (new AddrOf2_0(33))),
		"stanford2bel",
		"stprops",
		new jmercury.runtime.TypeFunctors(stanford2bel.stanford2bel__du_name_ordered_stprops_0),
		new jmercury.runtime.TypeLayout(stanford2bel.stanford2bel__du_ptag_ordered_stprops_0),
		1,
		4,
		stanford2bel.stanford2bel__functor_number_map_stprops_0);
    //
    maybe__ti_maybe_1builtin__type_ctor_info_int_0.init(maybe.maybe__type_ctor_info_maybe_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0)});
    //
    //
    //
    stanford2bel__field_types_tempexpr_0_0[0] = (jmercury.runtime.PseudoTypeInfo) stanford2bel.stanford2bel__type_ctor_info_wdtp_0;
    stanford2bel__field_types_tempexpr_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    stanford2bel__field_types_tempexpr_0_0[2] = (jmercury.runtime.PseudoTypeInfo) stanford2bel.stanford2bel__type_ctor_info_netp_0;
    stanford2bel__field_types_tempexpr_0_0[3] = (jmercury.runtime.PseudoTypeInfo) stanford2bel.maybe__ti_maybe_1builtin__type_ctor_info_int_0;
    //
    stanford2bel__du_functor_desc_tempexpr_0_0.init("nd",
		4,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		0,
		stanford2bel.stanford2bel__field_types_tempexpr_0_0,
		null,
		null,
		null);
    //
    //
    stanford2bel__field_types_tempexpr_0_1[0] = (jmercury.runtime.PseudoTypeInfo) stanford2bel.stanford2bel__type_ctor_info_tmtp_0;
    //
    stanford2bel__du_functor_desc_tempexpr_0_1.init("term",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		2,
		1,
		stanford2bel.stanford2bel__field_types_tempexpr_0_1,
		null,
		null,
		null);
    //
    stanford2bel__du_functor_desc_tempexpr_0_2.init("none",
		0,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		2,
		null,
		null,
		null,
		null);
    //
    stanford2bel__du_stag_ordered_tempexpr_0_0[0] = stanford2bel.stanford2bel__du_functor_desc_tempexpr_0_2;
    stanford2bel__du_stag_ordered_tempexpr_0_0[1] = stanford2bel.stanford2bel__du_functor_desc_tempexpr_0_0;
    stanford2bel__du_stag_ordered_tempexpr_0_0[2] = stanford2bel.stanford2bel__du_functor_desc_tempexpr_0_1;
    //
    stanford2bel__du_ptag_ordered_tempexpr_0[0] = new jmercury.runtime.DuPtagLayout(3,
		private_builtin.MR_SECTAG_REMOTE,
		stanford2bel.stanford2bel__du_stag_ordered_tempexpr_0_0);
    //
    stanford2bel__du_name_ordered_tempexpr_0[0] = stanford2bel.stanford2bel__du_functor_desc_tempexpr_0_0;
    stanford2bel__du_name_ordered_tempexpr_0[1] = stanford2bel.stanford2bel__du_functor_desc_tempexpr_0_2;
    stanford2bel__du_name_ordered_tempexpr_0[2] = stanford2bel.stanford2bel__du_functor_desc_tempexpr_0_1;
    //
    stanford2bel__functor_number_map_tempexpr_0[0] = 0;
    stanford2bel__functor_number_map_tempexpr_0[1] = 2;
    stanford2bel__functor_number_map_tempexpr_0[2] = 1;
    //
    stanford2bel__type_ctor_info_tempexpr_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(34))),
		((java.lang.Object) (new AddrOf2_0(35))),
		"stanford2bel",
		"tempexpr",
		new jmercury.runtime.TypeFunctors(stanford2bel.stanford2bel__du_name_ordered_tempexpr_0),
		new jmercury.runtime.TypeLayout(stanford2bel.stanford2bel__du_ptag_ordered_tempexpr_0),
		3,
		4,
		stanford2bel.stanford2bel__functor_number_map_tempexpr_0);
    //
    stanford2bel__type_ctor_info_tid_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(36))),
		((java.lang.Object) (new AddrOf2_0(37))),
		"stanford2bel",
		"tid",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0),
		-1,
		0,
		null);
    //
    tree234__ti_tree234_2pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0)});
    //
    stanford2bel__type_ctor_info_tkmap_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(38))),
		((java.lang.Object) (new AddrOf2_0(39))),
		"stanford2bel",
		"tkmap",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) stanford2bel.tree234__ti_tree234_2pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0),
		-1,
		0,
		null);
    //
    stanford2bel__du_functor_desc_tmtp_0_0.init("do",
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
    stanford2bel__du_functor_desc_tmtp_0_1.init("n0t",
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
    stanford2bel__du_functor_desc_tmtp_0_2.init("to",
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
    stanford2bel__du_functor_desc_tmtp_0_3.init("be",
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
    stanford2bel__field_types_tmtp_0_4[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    stanford2bel__du_functor_desc_tmtp_0_4.init("modal",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		4,
		4,
		stanford2bel.stanford2bel__field_types_tmtp_0_4,
		null,
		null,
		null);
    //
    stanford2bel__field_types_tmtp_0_5[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    stanford2bel__du_functor_desc_tmtp_0_5.init("prt",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		5,
		5,
		stanford2bel.stanford2bel__field_types_tmtp_0_5,
		null,
		null,
		null);
    //
    stanford2bel__du_stag_ordered_tmtp_0_0[0] = stanford2bel.stanford2bel__du_functor_desc_tmtp_0_0;
    stanford2bel__du_stag_ordered_tmtp_0_0[1] = stanford2bel.stanford2bel__du_functor_desc_tmtp_0_1;
    stanford2bel__du_stag_ordered_tmtp_0_0[2] = stanford2bel.stanford2bel__du_functor_desc_tmtp_0_2;
    stanford2bel__du_stag_ordered_tmtp_0_0[3] = stanford2bel.stanford2bel__du_functor_desc_tmtp_0_3;
    stanford2bel__du_stag_ordered_tmtp_0_0[4] = stanford2bel.stanford2bel__du_functor_desc_tmtp_0_4;
    stanford2bel__du_stag_ordered_tmtp_0_0[5] = stanford2bel.stanford2bel__du_functor_desc_tmtp_0_5;
    //
    stanford2bel__du_ptag_ordered_tmtp_0[0] = new jmercury.runtime.DuPtagLayout(6,
		private_builtin.MR_SECTAG_REMOTE,
		stanford2bel.stanford2bel__du_stag_ordered_tmtp_0_0);
    //
    stanford2bel__du_name_ordered_tmtp_0[0] = stanford2bel.stanford2bel__du_functor_desc_tmtp_0_3;
    stanford2bel__du_name_ordered_tmtp_0[1] = stanford2bel.stanford2bel__du_functor_desc_tmtp_0_0;
    stanford2bel__du_name_ordered_tmtp_0[2] = stanford2bel.stanford2bel__du_functor_desc_tmtp_0_4;
    stanford2bel__du_name_ordered_tmtp_0[3] = stanford2bel.stanford2bel__du_functor_desc_tmtp_0_1;
    stanford2bel__du_name_ordered_tmtp_0[4] = stanford2bel.stanford2bel__du_functor_desc_tmtp_0_5;
    stanford2bel__du_name_ordered_tmtp_0[5] = stanford2bel.stanford2bel__du_functor_desc_tmtp_0_2;
    //
    stanford2bel__functor_number_map_tmtp_0[0] = 1;
    stanford2bel__functor_number_map_tmtp_0[1] = 3;
    stanford2bel__functor_number_map_tmtp_0[2] = 5;
    stanford2bel__functor_number_map_tmtp_0[3] = 0;
    stanford2bel__functor_number_map_tmtp_0[4] = 2;
    stanford2bel__functor_number_map_tmtp_0[5] = 4;
    //
    stanford2bel__type_ctor_info_tmtp_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(40))),
		((java.lang.Object) (new AddrOf2_0(41))),
		"stanford2bel",
		"tmtp",
		new jmercury.runtime.TypeFunctors(stanford2bel.stanford2bel__du_name_ordered_tmtp_0),
		new jmercury.runtime.TypeLayout(stanford2bel.stanford2bel__du_ptag_ordered_tmtp_0),
		6,
		4,
		stanford2bel.stanford2bel__functor_number_map_tmtp_0);
    //
    stanford2bel__type_ctor_info_tnum_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(42))),
		((java.lang.Object) (new AddrOf2_0(43))),
		"stanford2bel",
		"tnum",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0),
		-1,
		0,
		null);
    //
    stanford2bel__field_types_token_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    stanford2bel__field_types_token_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    stanford2bel__field_types_token_0_0[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    stanford2bel__field_types_token_0_0[3] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    stanford2bel__field_types_token_0_0[4] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    stanford2bel__du_functor_desc_token_0_0.init("token",
		5,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		stanford2bel.stanford2bel__field_types_token_0_0,
		null,
		null,
		null);
    //
    stanford2bel__du_stag_ordered_token_0_0[0] = stanford2bel.stanford2bel__du_functor_desc_token_0_0;
    //
    stanford2bel__du_ptag_ordered_token_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		stanford2bel.stanford2bel__du_stag_ordered_token_0_0);
    //
    stanford2bel__du_name_ordered_token_0[0] = stanford2bel.stanford2bel__du_functor_desc_token_0_0;
    //
    stanford2bel__functor_number_map_token_0[0] = 0;
    //
    stanford2bel__type_ctor_info_token_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(44))),
		((java.lang.Object) (new AddrOf2_0(45))),
		"stanford2bel",
		"token",
		new jmercury.runtime.TypeFunctors(stanford2bel.stanford2bel__du_name_ordered_token_0),
		new jmercury.runtime.TypeLayout(stanford2bel.stanford2bel__du_ptag_ordered_token_0),
		1,
		4,
		stanford2bel.stanford2bel__functor_number_map_token_0);
    //
    //
    stanford2bel__field_types_token2_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    stanford2bel__field_types_token2_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    stanford2bel__field_types_token2_0_0[2] = (jmercury.runtime.PseudoTypeInfo) stanford2bel.stanford2bel__type_ctor_info_pos_0;
    stanford2bel__field_types_token2_0_0[3] = (jmercury.runtime.PseudoTypeInfo) stanford2bel.stanford2bel__type_ctor_info_netp_0;
    stanford2bel__field_types_token2_0_0[4] = (jmercury.runtime.PseudoTypeInfo) stanford2bel.maybe__ti_maybe_1builtin__type_ctor_info_int_0;
    //
    stanford2bel__du_functor_desc_token2_0_0.init("token",
		5,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		stanford2bel.stanford2bel__field_types_token2_0_0,
		null,
		null,
		null);
    //
    stanford2bel__du_stag_ordered_token2_0_0[0] = stanford2bel.stanford2bel__du_functor_desc_token2_0_0;
    //
    stanford2bel__du_ptag_ordered_token2_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		stanford2bel.stanford2bel__du_stag_ordered_token2_0_0);
    //
    stanford2bel__du_name_ordered_token2_0[0] = stanford2bel.stanford2bel__du_functor_desc_token2_0_0;
    //
    stanford2bel__functor_number_map_token2_0[0] = 0;
    //
    stanford2bel__type_ctor_info_token2_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(46))),
		((java.lang.Object) (new AddrOf2_0(47))),
		"stanford2bel",
		"token2",
		new jmercury.runtime.TypeFunctors(stanford2bel.stanford2bel__du_name_ordered_token2_0),
		new jmercury.runtime.TypeLayout(stanford2bel.stanford2bel__du_ptag_ordered_token2_0),
		1,
		4,
		stanford2bel.stanford2bel__functor_number_map_token2_0);
    //
    stanford2bel__type_ctor_info_tokmap_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(48))),
		((java.lang.Object) (new AddrOf2_0(49))),
		"stanford2bel",
		"tokmap",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) stanford2bel.tree234__ti_tree234_2builtin__type_ctor_info_int_0stanford2bel__type_ctor_info_token2_0),
		-1,
		0,
		null);
    //
    //
    set_ordlist__ti_set_ordlist_1builtin__type_ctor_info_int_0.init(set_ordlist.set_ordlist__type_ctor_info_set_ordlist_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0)});
    //
    list__ti_list_1builtin__type_ctor_info_int_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0)});
    //
    list__ti_list_1list__ti_list_1builtin__type_ctor_info_int_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.list__ti_list_1builtin__type_ctor_info_int_0)});
    //
    stanford2bel__field_types_vertices_0_0[0] = (jmercury.runtime.PseudoTypeInfo) stanford2bel.set_ordlist__ti_set_ordlist_1builtin__type_ctor_info_int_0;
    stanford2bel__field_types_vertices_0_0[1] = (jmercury.runtime.PseudoTypeInfo) stanford2bel.set_ordlist__ti_set_ordlist_1builtin__type_ctor_info_int_0;
    stanford2bel__field_types_vertices_0_0[2] = (jmercury.runtime.PseudoTypeInfo) stanford2bel.list__ti_list_1builtin__type_ctor_info_int_0;
    stanford2bel__field_types_vertices_0_0[3] = (jmercury.runtime.PseudoTypeInfo) stanford2bel.list__ti_list_1list__ti_list_1builtin__type_ctor_info_int_0;
    //
    stanford2bel__du_functor_desc_vertices_0_0.init("vs",
		4,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		stanford2bel.stanford2bel__field_types_vertices_0_0,
		null,
		null,
		null);
    //
    stanford2bel__du_stag_ordered_vertices_0_0[0] = stanford2bel.stanford2bel__du_functor_desc_vertices_0_0;
    //
    stanford2bel__du_ptag_ordered_vertices_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		stanford2bel.stanford2bel__du_stag_ordered_vertices_0_0);
    //
    stanford2bel__du_name_ordered_vertices_0[0] = stanford2bel.stanford2bel__du_functor_desc_vertices_0_0;
    //
    stanford2bel__functor_number_map_vertices_0[0] = 0;
    //
    stanford2bel__type_ctor_info_vertices_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(50))),
		((java.lang.Object) (new AddrOf2_0(51))),
		"stanford2bel",
		"vertices",
		new jmercury.runtime.TypeFunctors(stanford2bel.stanford2bel__du_name_ordered_vertices_0),
		new jmercury.runtime.TypeLayout(stanford2bel.stanford2bel__du_ptag_ordered_vertices_0),
		1,
		4,
		stanford2bel.stanford2bel__functor_number_map_vertices_0);
    //
    stanford2bel__enum_functor_desc_wdtp_0_0.init("noun",
		0);
    //
    stanford2bel__enum_functor_desc_wdtp_0_1.init("aword",
		1);
    //
    stanford2bel__enum_functor_desc_wdtp_0_2.init("pp",
		2);
    //
    stanford2bel__enum_value_ordered_wdtp_0[0] = stanford2bel.stanford2bel__enum_functor_desc_wdtp_0_0;
    stanford2bel__enum_value_ordered_wdtp_0[1] = stanford2bel.stanford2bel__enum_functor_desc_wdtp_0_1;
    stanford2bel__enum_value_ordered_wdtp_0[2] = stanford2bel.stanford2bel__enum_functor_desc_wdtp_0_2;
    //
    stanford2bel__enum_name_ordered_wdtp_0[0] = stanford2bel.stanford2bel__enum_functor_desc_wdtp_0_1;
    stanford2bel__enum_name_ordered_wdtp_0[1] = stanford2bel.stanford2bel__enum_functor_desc_wdtp_0_0;
    stanford2bel__enum_name_ordered_wdtp_0[2] = stanford2bel.stanford2bel__enum_functor_desc_wdtp_0_2;
    //
    stanford2bel__functor_number_map_wdtp_0[0] = 1;
    stanford2bel__functor_number_map_wdtp_0[1] = 0;
    stanford2bel__functor_number_map_wdtp_0[2] = 2;
    //
    stanford2bel__type_ctor_info_wdtp_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_ENUM,
		((java.lang.Object) (new AddrOf2_0(52))),
		((java.lang.Object) (new AddrOf2_0(53))),
		"stanford2bel",
		"wdtp",
		new jmercury.runtime.TypeFunctors(stanford2bel.stanford2bel__enum_name_ordered_wdtp_0),
		new jmercury.runtime.TypeLayout(stanford2bel.stanford2bel__enum_value_ordered_wdtp_0),
		3,
		4,
		stanford2bel.stanford2bel__functor_number_map_wdtp_0);
    //
    stanford2bel__enum_functor_desc_wtype_0_0.init("verb",
		0);
    //
    stanford2bel__enum_functor_desc_wtype_0_1.init("noun",
		1);
    //
    stanford2bel__enum_functor_desc_wtype_0_2.init("prep",
		2);
    //
    stanford2bel__enum_functor_desc_wtype_0_3.init("conj",
		3);
    //
    stanford2bel__enum_functor_desc_wtype_0_4.init("aword",
		4);
    //
    stanford2bel__enum_functor_desc_wtype_0_5.init("ignore",
		5);
    //
    stanford2bel__enum_value_ordered_wtype_0[0] = stanford2bel.stanford2bel__enum_functor_desc_wtype_0_0;
    stanford2bel__enum_value_ordered_wtype_0[1] = stanford2bel.stanford2bel__enum_functor_desc_wtype_0_1;
    stanford2bel__enum_value_ordered_wtype_0[2] = stanford2bel.stanford2bel__enum_functor_desc_wtype_0_2;
    stanford2bel__enum_value_ordered_wtype_0[3] = stanford2bel.stanford2bel__enum_functor_desc_wtype_0_3;
    stanford2bel__enum_value_ordered_wtype_0[4] = stanford2bel.stanford2bel__enum_functor_desc_wtype_0_4;
    stanford2bel__enum_value_ordered_wtype_0[5] = stanford2bel.stanford2bel__enum_functor_desc_wtype_0_5;
    //
    stanford2bel__enum_name_ordered_wtype_0[0] = stanford2bel.stanford2bel__enum_functor_desc_wtype_0_4;
    stanford2bel__enum_name_ordered_wtype_0[1] = stanford2bel.stanford2bel__enum_functor_desc_wtype_0_3;
    stanford2bel__enum_name_ordered_wtype_0[2] = stanford2bel.stanford2bel__enum_functor_desc_wtype_0_5;
    stanford2bel__enum_name_ordered_wtype_0[3] = stanford2bel.stanford2bel__enum_functor_desc_wtype_0_1;
    stanford2bel__enum_name_ordered_wtype_0[4] = stanford2bel.stanford2bel__enum_functor_desc_wtype_0_2;
    stanford2bel__enum_name_ordered_wtype_0[5] = stanford2bel.stanford2bel__enum_functor_desc_wtype_0_0;
    //
    stanford2bel__functor_number_map_wtype_0[0] = 5;
    stanford2bel__functor_number_map_wtype_0[1] = 3;
    stanford2bel__functor_number_map_wtype_0[2] = 4;
    stanford2bel__functor_number_map_wtype_0[3] = 1;
    stanford2bel__functor_number_map_wtype_0[4] = 0;
    stanford2bel__functor_number_map_wtype_0[5] = 2;
    //
    stanford2bel__type_ctor_info_wtype_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_ENUM,
		((java.lang.Object) (new AddrOf2_0(54))),
		((java.lang.Object) (new AddrOf2_0(55))),
		"stanford2bel",
		"wtype",
		new jmercury.runtime.TypeFunctors(stanford2bel.stanford2bel__enum_name_ordered_wtype_0),
		new jmercury.runtime.TypeLayout(stanford2bel.stanford2bel__enum_value_ordered_wtype_0),
		6,
		4,
		stanford2bel.stanford2bel__functor_number_map_wtype_0);
  }

// DataDefns
  static {
  }

// Scalar common data
  private static final jmercury.runtime.TypeInfo_Struct[] MR_scalar_common_1 = new jmercury.runtime.TypeInfo_Struct[21];
  private static final io.Posn_0[] MR_scalar_common_2 = new io.Posn_0[1];
  private static final list.List_1.F_nil_0[] MR_scalar_common_3 = new list.List_1.F_nil_0[1];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_4 = new /* generic_type */ java.lang.Object[1][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_5 = new /* generic_type */ java.lang.Object[3][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_7 = new /* generic_type */ java.lang.Object[1][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_8 = new /* generic_type */ java.lang.Object[1][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_9 = new /* generic_type */ java.lang.Object[1][];
  private static final maybe.Maybe_1.No_0[] MR_scalar_common_10 = new maybe.Maybe_1.No_0[1];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_11 = new /* generic_type */ java.lang.Object[1][];
  private static final stanford2bel.Tmtp_0.To_0[] MR_scalar_common_12 = new stanford2bel.Tmtp_0.To_0[1];
  private static final stanford2bel.Tempexpr_0.Term_1[] MR_scalar_common_13 = new stanford2bel.Tempexpr_0.Term_1[4];
  private static final stanford2bel.Tmtp_0.Be_0[] MR_scalar_common_14 = new stanford2bel.Tmtp_0.Be_0[1];
  private static final stanford2bel.Tmtp_0.Do_0[] MR_scalar_common_15 = new stanford2bel.Tmtp_0.Do_0[1];
  private static final stanford2bel.Tmtp_0.N0t_0[] MR_scalar_common_16 = new stanford2bel.Tmtp_0.N0t_0[1];
  private static final stanford2bel.Tempexpr_0.None_0[] MR_scalar_common_17 = new stanford2bel.Tempexpr_0.None_0[1];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_18 = new /* generic_type */ java.lang.Object[1][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_19 = new /* generic_type */ java.lang.Object[1][];
  private static void MR_init_scalars_0() {
    MR_scalar_common_1[0] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))));
    MR_scalar_common_1[1] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(tree234.tree234__type_ctor_info_tree234_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[0]))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))));
    MR_scalar_common_1[2] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(tree234.tree234__type_ctor_info_tree234_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_entity2_0))));
    MR_scalar_common_1[3] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(errors.errors__type_ctor_info_messages_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0))));
    MR_scalar_common_1[4] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_stprop_0))));
    MR_scalar_common_1[5] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[0]))));
    MR_scalar_common_1[6] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(tree234.tree234__type_ctor_info_tree234_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_token2_0))));
    MR_scalar_common_1[7] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_label_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))));
    MR_scalar_common_1[8] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[7]))));
    MR_scalar_common_1[9] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(tree234.tree234__type_ctor_info_tree234_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[8]))));
    MR_scalar_common_1[10] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_label_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_tempexpr_0))));
    MR_scalar_common_1[11] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))));
    MR_scalar_common_1[12] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[5]))));
    MR_scalar_common_1[13] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_token_0))));
    MR_scalar_common_1[14] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_semrel_0))));
    MR_scalar_common_1[15] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_sent_0))));
    MR_scalar_common_1[16] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_entity_0))));
    MR_scalar_common_1[17] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_sent2_0))));
    MR_scalar_common_1[18] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(maybe.maybe__type_ctor_info_maybe_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))));
    MR_scalar_common_1[19] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(set_ordlist.set_ordlist__type_ctor_info_set_ordlist_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))));
    MR_scalar_common_1[20] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[11]))));
    MR_scalar_common_2[0] = new io.Posn_0(0,
		0,
		0);
    MR_scalar_common_3[0] = new list.List_1.F_nil_0();
    MR_scalar_common_4[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(8),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (stanford2bel.stanford2bel__type_ctor_info_entity_0)),
		((java.lang.Object) (stanford2bel.tree234__pti_tree234_2__plain_pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_int_0)),
		((java.lang.Object) (stanford2bel.tree234__pti_tree234_2__plain_pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_int_0)),
		((java.lang.Object) (stanford2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_stanford2bel__type_ctor_info_entity2_0)),
		((java.lang.Object) (stanford2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_stanford2bel__type_ctor_info_entity2_0)),
		((java.lang.Object) (stanford2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (stanford2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_5[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(7),
		((java.lang.Object) (stanford2bel.maybe__pti_maybe_1__plain_wordnet__type_ctor_info_wndata_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (stanford2bel.tree234__pti_tree234_2__plain_pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_int_0)),
		((java.lang.Object) (stanford2bel.stanford2bel__type_ctor_info_sent_0)),
		((java.lang.Object) (stanford2bel.stanford2bel__type_ctor_info_sent2_0)),
		((java.lang.Object) (stanford2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (stanford2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_5[1] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(7),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (sberrs.sberrs__type_ctor_info_prmode_0)),
		((java.lang.Object) (stanford2bel.stanford2bel__type_ctor_info_sent2_0)),
		((java.lang.Object) (stanford2bel.list__pti_list_1__plain_stanford2bel__type_ctor_info_stprop_0)),
		((java.lang.Object) (stanford2bel.list__pti_list_1__plain_stanford2bel__type_ctor_info_stprop_0)),
		((java.lang.Object) (stanford2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (stanford2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_5[2] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(7),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (stanford2bel.list__pti_list_1__plain_pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0)),
		((java.lang.Object) (stanford2bel.tree234__pti_tree234_2__plain_pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_int_0)),
		((java.lang.Object) (stanford2bel.tree234__pti_tree234_2__plain_pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_int_0)),
		((java.lang.Object) (stanford2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (stanford2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_7[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(4),
		((java.lang.Object) (stanford2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1pair__ti_pair_2stanford2bel__type_ctor_info_label_0builtin__type_ctor_info_int_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (stanford2bel.stanford2bel__type_ctor_info_vertices_0)),
		((java.lang.Object) (stanford2bel.stanford2bel__type_ctor_info_vertices_0))};
    MR_scalar_common_8[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(9),
		((java.lang.Object) (stanford2bel.maybe__pti_maybe_1__plain_wordnet__type_ctor_info_wndata_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (stanford2bel.tree234__pti_tree234_2__plain_pair__ti_pair_2builtin__type_ctor_info_int_0builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_int_0)),
		((java.lang.Object) (stanford2bel.stanford2bel__type_ctor_info_token_0)),
		((java.lang.Object) (stanford2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_stanford2bel__type_ctor_info_token2_0)),
		((java.lang.Object) (stanford2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_stanford2bel__type_ctor_info_token2_0)),
		((java.lang.Object) (stanford2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (stanford2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_9[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(6),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (stanford2bel.stanford2bel__type_ctor_info_semrel_0)),
		((java.lang.Object) (stanford2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1pair__ti_pair_2stanford2bel__type_ctor_info_label_0builtin__type_ctor_info_int_0)),
		((java.lang.Object) (stanford2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1pair__ti_pair_2stanford2bel__type_ctor_info_label_0builtin__type_ctor_info_int_0)),
		((java.lang.Object) (stanford2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (stanford2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_10[0] = new maybe.Maybe_1.No_0();
    MR_scalar_common_11[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(11),
		((java.lang.Object) (sberrs.sberrs__type_ctor_info_prmode_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (stanford2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_stanford2bel__type_ctor_info_token2_0)),
		((java.lang.Object) (stanford2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1pair__ti_pair_2stanford2bel__type_ctor_info_label_0builtin__type_ctor_info_int_0)),
		((java.lang.Object) (stanford2bel.pair__pti_pair_2__plain_stanford2bel__type_ctor_info_label_0__plain_builtin__type_ctor_info_int_0)),
		((java.lang.Object) (stanford2bel.pair__pti_pair_2__plain_stanford2bel__type_ctor_info_label_0__plain_stanford2bel__type_ctor_info_tempexpr_0)),
		((java.lang.Object) (stanford2bel.list__pti_list_1__plain_builtin__type_ctor_info_int_0)),
		((java.lang.Object) (stanford2bel.list__pti_list_1__plain_builtin__type_ctor_info_int_0)),
		((java.lang.Object) (stanford2bel.list__pti_list_1__plain_stanford2bel__type_ctor_info_stprop_0)),
		((java.lang.Object) (stanford2bel.list__pti_list_1__plain_stanford2bel__type_ctor_info_stprop_0))};
    MR_scalar_common_12[0] = new stanford2bel.Tmtp_0.To_0();
    MR_scalar_common_13[0] = new stanford2bel.Tempexpr_0.Term_1((stanford2bel.Tmtp_0) stanford2bel.MR_scalar_common_12[0]);
    MR_scalar_common_14[0] = new stanford2bel.Tmtp_0.Be_0();
    MR_scalar_common_13[1] = new stanford2bel.Tempexpr_0.Term_1((stanford2bel.Tmtp_0) stanford2bel.MR_scalar_common_14[0]);
    MR_scalar_common_15[0] = new stanford2bel.Tmtp_0.Do_0();
    MR_scalar_common_13[2] = new stanford2bel.Tempexpr_0.Term_1((stanford2bel.Tmtp_0) stanford2bel.MR_scalar_common_15[0]);
    MR_scalar_common_16[0] = new stanford2bel.Tmtp_0.N0t_0();
    MR_scalar_common_13[3] = new stanford2bel.Tempexpr_0.Term_1((stanford2bel.Tmtp_0) stanford2bel.MR_scalar_common_16[0]);
    MR_scalar_common_17[0] = new stanford2bel.Tempexpr_0.None_0();
    MR_scalar_common_18[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(1),
		((java.lang.Object) (stanford2bel.pair__pti_pair_2__plain_stanford2bel__type_ctor_info_label_0__plain_stanford2bel__type_ctor_info_tempexpr_0))};
    MR_scalar_common_19[0] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (stanford2bel.MR_scalar_common_18[0])),
		((java.lang.Object) (new AddrOf2_0(56))),
		java.lang.Integer.valueOf(0)};
  }
  static {
    MR_init_scalars_0();
  }

// Vector common data
//  stanford2bel.m:396
  private static final class Vector_common_type_6_0
  {
    public final java.lang.String vct_6_f_0;
    public final int vct_6_f_1;

    public Vector_common_type_6_0(
      java.lang.String vct_6_f_0,
      int vct_6_f_1)
    {
      {
        this.vct_6_f_0 = vct_6_f_0;
        this.vct_6_f_1 = vct_6_f_1;
      }
    }
  }

  private static final stanford2bel.Vector_common_type_6_0 MR_vector_common_6[] = {
    new stanford2bel.Vector_common_type_6_0("acomp",
		0),
		new stanford2bel.Vector_common_type_6_0("advcl",
		1),
		new stanford2bel.Vector_common_type_6_0("advmod",
		2),
		new stanford2bel.Vector_common_type_6_0("agent",
		3),
		new stanford2bel.Vector_common_type_6_0("amod",
		4),
		new stanford2bel.Vector_common_type_6_0("appos",
		5),
		new stanford2bel.Vector_common_type_6_0("arg",
		6),
		new stanford2bel.Vector_common_type_6_0("attr",
		7),
		new stanford2bel.Vector_common_type_6_0("aux",
		8),
		new stanford2bel.Vector_common_type_6_0("auxpass",
		9),
		new stanford2bel.Vector_common_type_6_0("cc",
		10),
		new stanford2bel.Vector_common_type_6_0("ccomp",
		11),
		new stanford2bel.Vector_common_type_6_0("comp",
		12),
		new stanford2bel.Vector_common_type_6_0("conj",
		13),
		new stanford2bel.Vector_common_type_6_0("cop",
		14),
		new stanford2bel.Vector_common_type_6_0("csubj",
		15),
		new stanford2bel.Vector_common_type_6_0("csubjpass",
		16),
		new stanford2bel.Vector_common_type_6_0("dep",
		17),
		new stanford2bel.Vector_common_type_6_0("det",
		18),
		new stanford2bel.Vector_common_type_6_0("discourse",
		19),
		new stanford2bel.Vector_common_type_6_0("dobj",
		20),
		new stanford2bel.Vector_common_type_6_0("expl",
		21),
		new stanford2bel.Vector_common_type_6_0("goeswith",
		22),
		new stanford2bel.Vector_common_type_6_0("iobj",
		23),
		new stanford2bel.Vector_common_type_6_0("mark",
		24),
		new stanford2bel.Vector_common_type_6_0("measure",
		25),
		new stanford2bel.Vector_common_type_6_0("mod",
		26),
		new stanford2bel.Vector_common_type_6_0("mwe",
		27),
		new stanford2bel.Vector_common_type_6_0("neg",
		28),
		new stanford2bel.Vector_common_type_6_0("nn",
		29),
		new stanford2bel.Vector_common_type_6_0("npadvmod",
		30),
		new stanford2bel.Vector_common_type_6_0("nsubj",
		31),
		new stanford2bel.Vector_common_type_6_0("nsubjpass",
		32),
		new stanford2bel.Vector_common_type_6_0("num",
		33),
		new stanford2bel.Vector_common_type_6_0("number",
		34),
		new stanford2bel.Vector_common_type_6_0("obj",
		35),
		new stanford2bel.Vector_common_type_6_0("parataxis",
		36),
		new stanford2bel.Vector_common_type_6_0("pcomp",
		37),
		new stanford2bel.Vector_common_type_6_0("pobj",
		38),
		new stanford2bel.Vector_common_type_6_0("poss",
		39),
		new stanford2bel.Vector_common_type_6_0("possessive",
		40),
		new stanford2bel.Vector_common_type_6_0("preconj",
		41),
		new stanford2bel.Vector_common_type_6_0("pred",
		42),
		new stanford2bel.Vector_common_type_6_0("predet",
		43),
		new stanford2bel.Vector_common_type_6_0("prep",
		44),
		new stanford2bel.Vector_common_type_6_0("prepc",
		45),
		new stanford2bel.Vector_common_type_6_0("prt",
		46),
		new stanford2bel.Vector_common_type_6_0("punct",
		47),
		new stanford2bel.Vector_common_type_6_0("quantmod",
		48),
		new stanford2bel.Vector_common_type_6_0("rcmod",
		49),
		new stanford2bel.Vector_common_type_6_0("ref",
		50),
		new stanford2bel.Vector_common_type_6_0("rel",
		51),
		new stanford2bel.Vector_common_type_6_0("sdep",
		52),
		new stanford2bel.Vector_common_type_6_0("subj",
		53),
		new stanford2bel.Vector_common_type_6_0("tmod",
		54),
		new stanford2bel.Vector_common_type_6_0("vmod",
		55),
		new stanford2bel.Vector_common_type_6_0("xcomp",
		56),
		new stanford2bel.Vector_common_type_6_0("xsubj",
		57),
		new stanford2bel.Vector_common_type_6_0("LIST",
		0),
		new stanford2bel.Vector_common_type_6_0("NOMINAL",
		1),
		new stanford2bel.Vector_common_type_6_0("PRONOMINAL",
		2),
		new stanford2bel.Vector_common_type_6_0("PROPER",
		3),
		new stanford2bel.Vector_common_type_6_0("#",
		0),
		new stanford2bel.Vector_common_type_6_0("\044",
		1),
		new stanford2bel.Vector_common_type_6_0("\'\'",
		2),
		new stanford2bel.Vector_common_type_6_0(",",
		3),
		new stanford2bel.Vector_common_type_6_0("-LRB-",
		4),
		new stanford2bel.Vector_common_type_6_0("-RRB-",
		5),
		new stanford2bel.Vector_common_type_6_0(".",
		6),
		new stanford2bel.Vector_common_type_6_0(":",
		7),
		new stanford2bel.Vector_common_type_6_0("CC",
		8),
		new stanford2bel.Vector_common_type_6_0("CD",
		9),
		new stanford2bel.Vector_common_type_6_0("DT",
		10),
		new stanford2bel.Vector_common_type_6_0("EX",
		11),
		new stanford2bel.Vector_common_type_6_0("FW",
		12),
		new stanford2bel.Vector_common_type_6_0("IN",
		13),
		new stanford2bel.Vector_common_type_6_0("JJ",
		14),
		new stanford2bel.Vector_common_type_6_0("JJR",
		15),
		new stanford2bel.Vector_common_type_6_0("JJS",
		16),
		new stanford2bel.Vector_common_type_6_0("LS",
		17),
		new stanford2bel.Vector_common_type_6_0("MD",
		18),
		new stanford2bel.Vector_common_type_6_0("NN",
		19),
		new stanford2bel.Vector_common_type_6_0("NNP",
		20),
		new stanford2bel.Vector_common_type_6_0("NNPS",
		21),
		new stanford2bel.Vector_common_type_6_0("NNS",
		22),
		new stanford2bel.Vector_common_type_6_0("PDT",
		23),
		new stanford2bel.Vector_common_type_6_0("POS",
		24),
		new stanford2bel.Vector_common_type_6_0("PRP",
		25),
		new stanford2bel.Vector_common_type_6_0("PRP\044",
		26),
		new stanford2bel.Vector_common_type_6_0("RB",
		27),
		new stanford2bel.Vector_common_type_6_0("RBR",
		28),
		new stanford2bel.Vector_common_type_6_0("RBS",
		29),
		new stanford2bel.Vector_common_type_6_0("RP",
		30),
		new stanford2bel.Vector_common_type_6_0("SYM",
		31),
		new stanford2bel.Vector_common_type_6_0("TO",
		32),
		new stanford2bel.Vector_common_type_6_0("UH",
		33),
		new stanford2bel.Vector_common_type_6_0("VB",
		34),
		new stanford2bel.Vector_common_type_6_0("VBD",
		35),
		new stanford2bel.Vector_common_type_6_0("VBG",
		36),
		new stanford2bel.Vector_common_type_6_0("VBN",
		37),
		new stanford2bel.Vector_common_type_6_0("VBP",
		38),
		new stanford2bel.Vector_common_type_6_0("VBZ",
		39),
		new stanford2bel.Vector_common_type_6_0("WDT",
		40),
		new stanford2bel.Vector_common_type_6_0("WP",
		41),
		new stanford2bel.Vector_common_type_6_0("WP\044",
		42),
		new stanford2bel.Vector_common_type_6_0("WRB",
		43),
		new stanford2bel.Vector_common_type_6_0("\140\140",
		44),
		new stanford2bel.Vector_common_type_6_0("DATE",
		0),
		new stanford2bel.Vector_common_type_6_0("DURATION",
		1),
		new stanford2bel.Vector_common_type_6_0("LOCATION",
		2),
		new stanford2bel.Vector_common_type_6_0("MISC",
		3),
		new stanford2bel.Vector_common_type_6_0("MONEY",
		4),
		new stanford2bel.Vector_common_type_6_0("NUMBER",
		5),
		new stanford2bel.Vector_common_type_6_0("O",
		6),
		new stanford2bel.Vector_common_type_6_0("ORDINAL",
		7),
		new stanford2bel.Vector_common_type_6_0("ORGANIZATION",
		8),
		new stanford2bel.Vector_common_type_6_0("PERCENT",
		9),
		new stanford2bel.Vector_common_type_6_0("PERSON",
		10),
		new stanford2bel.Vector_common_type_6_0("SET",
		11),
		new stanford2bel.Vector_common_type_6_0("TIME",
		12),
		new stanford2bel.Vector_common_type_6_0("be",
		0),
		new stanford2bel.Vector_common_type_6_0("do",
		1),
		new stanford2bel.Vector_common_type_6_0("is",
		2),
		new stanford2bel.Vector_common_type_6_0("n\'t",
		3),
		new stanford2bel.Vector_common_type_6_0("not",
		4)
  };

// NonDataDefns
  private static boolean __Unify____eid_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = stanford2bel.__Unify____eid_0_0(((java.lang.Integer) wrapper_arg_1).intValue(), ((java.lang.Integer) wrapper_arg_2).intValue());
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____eid_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = stanford2bel.__Compare____eid_0_0(((java.lang.Integer) wrapper_arg_2).intValue(), ((java.lang.Integer) wrapper_arg_3).intValue());
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____entity_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = stanford2bel.__Unify____entity_0_0(((stanford2bel.Entity_0) wrapper_arg_1), ((stanford2bel.Entity_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____entity_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = stanford2bel.__Compare____entity_0_0(((stanford2bel.Entity_0) wrapper_arg_2), ((stanford2bel.Entity_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____entity2_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = stanford2bel.__Unify____entity2_0_0(((stanford2bel.Entity2_0) wrapper_arg_1), ((stanford2bel.Entity2_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____entity2_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = stanford2bel.__Compare____entity2_0_0(((stanford2bel.Entity2_0) wrapper_arg_2), ((stanford2bel.Entity2_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____entmap_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = stanford2bel.__Unify____entmap_0_0(((tree234.Tree234_2) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____entmap_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = stanford2bel.__Compare____entmap_0_0(((tree234.Tree234_2) wrapper_arg_2), ((tree234.Tree234_2) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____etp_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = stanford2bel.__Unify____etp_0_0(((stanford2bel.Etp_0) wrapper_arg_1), ((stanford2bel.Etp_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____etp_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = stanford2bel.__Compare____etp_0_0(((stanford2bel.Etp_0) wrapper_arg_2), ((stanford2bel.Etp_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____label_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = stanford2bel.__Unify____label_0_0(((stanford2bel.Label_0) wrapper_arg_1), ((stanford2bel.Label_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____label_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = stanford2bel.__Compare____label_0_0(((stanford2bel.Label_0) wrapper_arg_2), ((stanford2bel.Label_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____netp_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = stanford2bel.__Unify____netp_0_0(((stanford2bel.Netp_0) wrapper_arg_1), ((stanford2bel.Netp_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____netp_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = stanford2bel.__Compare____netp_0_0(((stanford2bel.Netp_0) wrapper_arg_2), ((stanford2bel.Netp_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____pos_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = stanford2bel.__Unify____pos_0_0(((stanford2bel.Pos_0) wrapper_arg_1), ((stanford2bel.Pos_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____pos_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = stanford2bel.__Compare____pos_0_0(((stanford2bel.Pos_0) wrapper_arg_2), ((stanford2bel.Pos_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____relmap_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = stanford2bel.__Unify____relmap_0_0(((tree234.Tree234_2) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____relmap_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = stanford2bel.__Compare____relmap_0_0(((tree234.Tree234_2) wrapper_arg_2), ((tree234.Tree234_2) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____semrel_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = stanford2bel.__Unify____semrel_0_0(((stanford2bel.Semrel_0) wrapper_arg_1), ((stanford2bel.Semrel_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____semrel_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = stanford2bel.__Compare____semrel_0_0(((stanford2bel.Semrel_0) wrapper_arg_2), ((stanford2bel.Semrel_0) wrapper_arg_3));
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
        succeeded = stanford2bel.__Unify____sent_0_0(((stanford2bel.Sent_0) wrapper_arg_1), ((stanford2bel.Sent_0) wrapper_arg_2));
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
        conv0_HeadVar__1_1 = stanford2bel.__Compare____sent_0_0(((stanford2bel.Sent_0) wrapper_arg_2), ((stanford2bel.Sent_0) wrapper_arg_3));
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
        succeeded = stanford2bel.__Unify____sent2_0_0(((stanford2bel.Sent2_0) wrapper_arg_1), ((stanford2bel.Sent2_0) wrapper_arg_2));
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
        conv0_HeadVar__1_1 = stanford2bel.__Compare____sent2_0_0(((stanford2bel.Sent2_0) wrapper_arg_2), ((stanford2bel.Sent2_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____sid_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = stanford2bel.__Unify____sid_0_0(((java.lang.Integer) wrapper_arg_1).intValue(), ((java.lang.Integer) wrapper_arg_2).intValue());
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____sid_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = stanford2bel.__Compare____sid_0_0(((java.lang.Integer) wrapper_arg_2).intValue(), ((java.lang.Integer) wrapper_arg_3).intValue());
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____stfile_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = stanford2bel.__Unify____stfile_0_0(((stanford2bel.Stfile_0) wrapper_arg_1), ((stanford2bel.Stfile_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____stfile_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = stanford2bel.__Compare____stfile_0_0(((stanford2bel.Stfile_0) wrapper_arg_2), ((stanford2bel.Stfile_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____stfile2_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = stanford2bel.__Unify____stfile2_0_0(((stanford2bel.Stfile2_0) wrapper_arg_1), ((stanford2bel.Stfile2_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____stfile2_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = stanford2bel.__Compare____stfile2_0_0(((stanford2bel.Stfile2_0) wrapper_arg_2), ((stanford2bel.Stfile2_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____stprop_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = stanford2bel.__Unify____stprop_0_0(((stanford2bel.Stprop_0) wrapper_arg_1), ((stanford2bel.Stprop_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____stprop_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = stanford2bel.__Compare____stprop_0_0(((stanford2bel.Stprop_0) wrapper_arg_2), ((stanford2bel.Stprop_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____stprops_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = stanford2bel.__Unify____stprops_0_0(((stanford2bel.Stprops_0) wrapper_arg_1), ((stanford2bel.Stprops_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____stprops_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = stanford2bel.__Compare____stprops_0_0(((stanford2bel.Stprops_0) wrapper_arg_2), ((stanford2bel.Stprops_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____tempexpr_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = stanford2bel.__Unify____tempexpr_0_0(((stanford2bel.Tempexpr_0) wrapper_arg_1), ((stanford2bel.Tempexpr_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____tempexpr_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = stanford2bel.__Compare____tempexpr_0_0(((stanford2bel.Tempexpr_0) wrapper_arg_2), ((stanford2bel.Tempexpr_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____tid_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = stanford2bel.__Unify____tid_0_0(((java.lang.Integer) wrapper_arg_1).intValue(), ((java.lang.Integer) wrapper_arg_2).intValue());
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____tid_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = stanford2bel.__Compare____tid_0_0(((java.lang.Integer) wrapper_arg_2).intValue(), ((java.lang.Integer) wrapper_arg_3).intValue());
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____tkmap_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = stanford2bel.__Unify____tkmap_0_0(((tree234.Tree234_2) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____tkmap_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = stanford2bel.__Compare____tkmap_0_0(((tree234.Tree234_2) wrapper_arg_2), ((tree234.Tree234_2) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____tmtp_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = stanford2bel.__Unify____tmtp_0_0(((stanford2bel.Tmtp_0) wrapper_arg_1), ((stanford2bel.Tmtp_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____tmtp_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = stanford2bel.__Compare____tmtp_0_0(((stanford2bel.Tmtp_0) wrapper_arg_2), ((stanford2bel.Tmtp_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____tnum_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = stanford2bel.__Unify____tnum_0_0(((java.lang.Integer) wrapper_arg_1).intValue(), ((java.lang.Integer) wrapper_arg_2).intValue());
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____tnum_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = stanford2bel.__Compare____tnum_0_0(((java.lang.Integer) wrapper_arg_2).intValue(), ((java.lang.Integer) wrapper_arg_3).intValue());
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
        succeeded = stanford2bel.__Unify____token_0_0(((stanford2bel.Token_0) wrapper_arg_1), ((stanford2bel.Token_0) wrapper_arg_2));
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
        conv0_HeadVar__1_1 = stanford2bel.__Compare____token_0_0(((stanford2bel.Token_0) wrapper_arg_2), ((stanford2bel.Token_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____token2_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = stanford2bel.__Unify____token2_0_0(((stanford2bel.Token2_0) wrapper_arg_1), ((stanford2bel.Token2_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____token2_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = stanford2bel.__Compare____token2_0_0(((stanford2bel.Token2_0) wrapper_arg_2), ((stanford2bel.Token2_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____tokmap_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = stanford2bel.__Unify____tokmap_0_0(((tree234.Tree234_2) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____tokmap_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = stanford2bel.__Compare____tokmap_0_0(((tree234.Tree234_2) wrapper_arg_2), ((tree234.Tree234_2) wrapper_arg_3));
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
        succeeded = stanford2bel.__Unify____vertices_0_0(((stanford2bel.Vertices_0) wrapper_arg_1), ((stanford2bel.Vertices_0) wrapper_arg_2));
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
        conv0_HeadVar__1_1 = stanford2bel.__Compare____vertices_0_0(((stanford2bel.Vertices_0) wrapper_arg_2), ((stanford2bel.Vertices_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____wdtp_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = stanford2bel.__Unify____wdtp_0_0(((stanford2bel.Wdtp_0) wrapper_arg_1), ((stanford2bel.Wdtp_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____wdtp_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = stanford2bel.__Compare____wdtp_0_0(((stanford2bel.Wdtp_0) wrapper_arg_2), ((stanford2bel.Wdtp_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____wtype_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = stanford2bel.__Unify____wtype_0_0(((stanford2bel.Wtype_0) wrapper_arg_1), ((stanford2bel.Wtype_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____wtype_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = stanford2bel.__Compare____wtype_0_0(((stanford2bel.Wtype_0) wrapper_arg_2), ((stanford2bel.Wtype_0) wrapper_arg_3));
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
              return_value = stanford2bel.__Unify____eid_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 1:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____eid_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 2:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____entity_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 3:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____entity_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 4:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____entity2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 5:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____entity2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 6:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____entmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 7:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____entmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 8:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____etp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 9:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____etp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 10:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____label_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 11:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____label_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 12:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____netp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 13:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____netp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 14:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____pos_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 15:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____pos_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 16:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____relmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 17:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____relmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 18:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____semrel_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 19:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____semrel_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 20:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____sent_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 21:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____sent_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 22:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____sent2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 23:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____sent2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 24:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____sid_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 25:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____sid_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 26:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____stfile_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 27:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____stfile_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 28:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____stfile2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 29:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____stfile2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 30:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____stprop_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 31:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____stprop_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 32:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____stprops_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 33:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____stprops_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 34:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____tempexpr_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 35:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____tempexpr_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 36:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____tid_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 37:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____tid_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 38:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____tkmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 39:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____tkmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 40:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____tmtp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 41:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____tmtp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 42:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____tnum_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 43:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____tnum_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 44:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____token_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 45:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____token_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 46:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____token2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 47:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____token2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 48:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____tokmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 49:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____tokmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 50:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____vertices_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 51:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____vertices_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 52:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____wdtp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 53:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____wdtp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 54:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.__Unify____wtype_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 55:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.__Compare____wtype_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 56:
          {
            boolean return_value = false;

            {
              return_value = stanford2bel.nonterminal_12_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2));
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
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.tps_4_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 1:
          {
            java.lang.Object return_value = null;

            {
              return_value = stanford2bel.conv_sent2_7_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 2:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = stanford2bel.convert2_5_p_0_2(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
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
              return_value = stanford2bel.stprops_11_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4));
            }
            return ((java.lang.Object) (return_value));
          }
        case 1:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = stanford2bel.conv_sent_7_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4));
            }
            return ((java.lang.Object) (return_value));
          }
        case 2:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = stanford2bel.conv_sent_7_p_0_2(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4));
            }
            return ((java.lang.Object) (return_value));
          }
        case 3:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = stanford2bel.conv_ent_8_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4));
            }
            return ((java.lang.Object) (return_value));
          }
        case 4:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = stanford2bel.convert3_6_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4));
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
    public /* generic_type */ java.lang.Object call___0_0(
      /* generic_type */ java.lang.Object arg1,
      /* generic_type */ java.lang.Object arg2,
      /* generic_type */ java.lang.Object arg3,
      /* generic_type */ java.lang.Object arg4,
      /* generic_type */ java.lang.Object arg5)
    {
      {
        /* generic_type */ java.lang.Object[] return_value = null;

        {
          return_value = stanford2bel.convert2_5_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4), ((java.lang.Object) arg5));
        }
        return ((java.lang.Object) (return_value));
      }
    }

  }

//  stanford2bel.m:10
  public static class Entity_0
    implements jmercury.runtime.MercuryType
  {
    public int F1;
    public java.lang.String F2;
    public java.lang.String F3;
    public list.List_1<list.List_1<pair.Pair_2<java.lang.Integer, java.lang.Integer>>> F4;

    public Entity_0()
    {
      {
      }
    }
    public Entity_0(
      int F1,
      java.lang.String F2,
      java.lang.String F3,
      list.List_1<list.List_1<pair.Pair_2<java.lang.Integer, java.lang.Integer>>> F4)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
        this.F4 = F4;
      }
    }
  }

//  stanford2bel.m:21
  public static class Entity2_0
    implements jmercury.runtime.MercuryType
  {
    public java.lang.String F1;
    public stanford2bel.Etp_0 F2;

    public Entity2_0()
    {
      {
      }
    }
    public Entity2_0(
      java.lang.String F1,
      stanford2bel.Etp_0 F2)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
      }
    }
  }

//  stanford2bel.m:34
  public static class Etp_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Etp_0 K0 = new Etp_0(0);  /* pronoun */
      public static final Etp_0 K1 = new Etp_0(1);  /* nominal */
      public static final Etp_0 K2 = new Etp_0(2);  /* proper */
      public static final Etp_0 K3 = new Etp_0(3);  /* lizt */

      private Etp_0(int val) {
        super(val);
      }

  }

//  stanford2bel.m:27
  public static class Label_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Label_0 K0 = new Label_0(0);  /* pr3d */
      public static final Label_0 K1 = new Label_0(1);  /* aux */
      public static final Label_0 K2 = new Label_0(2);  /* auxpass */
      public static final Label_0 K3 = new Label_0(3);  /* cop */
      public static final Label_0 K4 = new Label_0(4);  /* conj */
      public static final Label_0 K5 = new Label_0(5);  /* cc */
      public static final Label_0 K6 = new Label_0(6);  /* punct */
      public static final Label_0 K7 = new Label_0(7);  /* arg */
      public static final Label_0 K8 = new Label_0(8);  /* subj */
      public static final Label_0 K9 = new Label_0(9);  /* nsubj */
      public static final Label_0 K10 = new Label_0(10);  /* nsubjpass */
      public static final Label_0 K11 = new Label_0(11);  /* csubj */
      public static final Label_0 K12 = new Label_0(12);  /* csubjpass */
      public static final Label_0 K13 = new Label_0(13);  /* comp */
      public static final Label_0 K14 = new Label_0(14);  /* obj */
      public static final Label_0 K15 = new Label_0(15);  /* dobj */
      public static final Label_0 K16 = new Label_0(16);  /* iobj */
      public static final Label_0 K17 = new Label_0(17);  /* pobj */
      public static final Label_0 K18 = new Label_0(18);  /* pcomp */
      public static final Label_0 K19 = new Label_0(19);  /* attr */
      public static final Label_0 K20 = new Label_0(20);  /* ccomp */
      public static final Label_0 K21 = new Label_0(21);  /* xcomp */
      public static final Label_0 K22 = new Label_0(22);  /* rel */
      public static final Label_0 K23 = new Label_0(23);  /* ref */
      public static final Label_0 K24 = new Label_0(24);  /* expl */
      public static final Label_0 K25 = new Label_0(25);  /* acomp */
      public static final Label_0 K26 = new Label_0(26);  /* m0d */
      public static final Label_0 K27 = new Label_0(27);  /* advcl */
      public static final Label_0 K28 = new Label_0(28);  /* rcmod */
      public static final Label_0 K29 = new Label_0(29);  /* mark */
      public static final Label_0 K30 = new Label_0(30);  /* amod */
      public static final Label_0 K31 = new Label_0(31);  /* num */
      public static final Label_0 K32 = new Label_0(32);  /* number */
      public static final Label_0 K33 = new Label_0(33);  /* quantmod */
      public static final Label_0 K34 = new Label_0(34);  /* nn */
      public static final Label_0 K35 = new Label_0(35);  /* appos */
      public static final Label_0 K36 = new Label_0(36);  /* discourse */
      public static final Label_0 K37 = new Label_0(37);  /* vmod */
      public static final Label_0 K38 = new Label_0(38);  /* advmod */
      public static final Label_0 K39 = new Label_0(39);  /* neg */
      public static final Label_0 K40 = new Label_0(40);  /* npadvmod */
      public static final Label_0 K41 = new Label_0(41);  /* tmod */
      public static final Label_0 K42 = new Label_0(42);  /* mwe */
      public static final Label_0 K43 = new Label_0(43);  /* measure */
      public static final Label_0 K44 = new Label_0(44);  /* det */
      public static final Label_0 K45 = new Label_0(45);  /* predet */
      public static final Label_0 K46 = new Label_0(46);  /* preconj */
      public static final Label_0 K47 = new Label_0(47);  /* poss */
      public static final Label_0 K48 = new Label_0(48);  /* possessive */
      public static final Label_0 K49 = new Label_0(49);  /* prep */
      public static final Label_0 K50 = new Label_0(50);  /* prt */
      public static final Label_0 K51 = new Label_0(51);  /* parataxis */
      public static final Label_0 K52 = new Label_0(52);  /* goeswith */
      public static final Label_0 K53 = new Label_0(53);  /* sdep */
      public static final Label_0 K54 = new Label_0(54);  /* xsubj */
      public static final Label_0 K55 = new Label_0(55);  /* agent */
      public static final Label_0 K56 = new Label_0(56);  /* dep */
      public static final Label_0 K57 = new Label_0(57);  /* prepc */

      private Label_0(int val) {
        super(val);
      }

  }

//  stanford2bel.m:25
  public static class Netp_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Netp_0 K0 = new Netp_0(0);  /* other */
      public static final Netp_0 K1 = new Netp_0(1);  /* time */
      public static final Netp_0 K2 = new Netp_0(2);  /* date */
      public static final Netp_0 K3 = new Netp_0(3);  /* person */
      public static final Netp_0 K4 = new Netp_0(4);  /* number */
      public static final Netp_0 K5 = new Netp_0(5);  /* location */
      public static final Netp_0 K6 = new Netp_0(6);  /* misc */
      public static final Netp_0 K7 = new Netp_0(7);  /* duration */
      public static final Netp_0 K8 = new Netp_0(8);  /* money */
      public static final Netp_0 K9 = new Netp_0(9);  /* organization */
      public static final Netp_0 K10 = new Netp_0(10);  /* ordinal */
      public static final Netp_0 K11 = new Netp_0(11);  /* percent */
      public static final Netp_0 K12 = new Netp_0(12);  /* set */

      private Netp_0(int val) {
        super(val);
      }

  }

//  stanford2bel.m:22
  public static class Pos_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Pos_0 K0 = new Pos_0(0);  /* cc */
      public static final Pos_0 K1 = new Pos_0(1);  /* cd */
      public static final Pos_0 K2 = new Pos_0(2);  /* dt */
      public static final Pos_0 K3 = new Pos_0(3);  /* ex */
      public static final Pos_0 K4 = new Pos_0(4);  /* fw */
      public static final Pos_0 K5 = new Pos_0(5);  /* in */
      public static final Pos_0 K6 = new Pos_0(6);  /* jj */
      public static final Pos_0 K7 = new Pos_0(7);  /* jjr */
      public static final Pos_0 K8 = new Pos_0(8);  /* jjs */
      public static final Pos_0 K9 = new Pos_0(9);  /* ls */
      public static final Pos_0 K10 = new Pos_0(10);  /* md */
      public static final Pos_0 K11 = new Pos_0(11);  /* nn */
      public static final Pos_0 K12 = new Pos_0(12);  /* nnp */
      public static final Pos_0 K13 = new Pos_0(13);  /* nnps */
      public static final Pos_0 K14 = new Pos_0(14);  /* nns */
      public static final Pos_0 K15 = new Pos_0(15);  /* pdt */
      public static final Pos_0 K16 = new Pos_0(16);  /* pos */
      public static final Pos_0 K17 = new Pos_0(17);  /* prp */
      public static final Pos_0 K18 = new Pos_0(18);  /* prps */
      public static final Pos_0 K19 = new Pos_0(19);  /* rb */
      public static final Pos_0 K20 = new Pos_0(20);  /* rbr */
      public static final Pos_0 K21 = new Pos_0(21);  /* rbs */
      public static final Pos_0 K22 = new Pos_0(22);  /* rp */
      public static final Pos_0 K23 = new Pos_0(23);  /* sym */
      public static final Pos_0 K24 = new Pos_0(24);  /* to */
      public static final Pos_0 K25 = new Pos_0(25);  /* uh */
      public static final Pos_0 K26 = new Pos_0(26);  /* vb */
      public static final Pos_0 K27 = new Pos_0(27);  /* vbd */
      public static final Pos_0 K28 = new Pos_0(28);  /* vbg */
      public static final Pos_0 K29 = new Pos_0(29);  /* vbn */
      public static final Pos_0 K30 = new Pos_0(30);  /* vbp */
      public static final Pos_0 K31 = new Pos_0(31);  /* vbz */
      public static final Pos_0 K32 = new Pos_0(32);  /* wdt */
      public static final Pos_0 K33 = new Pos_0(33);  /* wp */
      public static final Pos_0 K34 = new Pos_0(34);  /* wps */
      public static final Pos_0 K35 = new Pos_0(35);  /* wrb */
      public static final Pos_0 K36 = new Pos_0(36);  /* punc */

      private Pos_0(int val) {
        super(val);
      }

  }

//  stanford2bel.m:9
  public static class Semrel_0
    implements jmercury.runtime.MercuryType
  {
    public int F1;
    public java.lang.String F2;
    public int F3;

    public Semrel_0()
    {
      {
      }
    }
    public Semrel_0(
      int F1,
      java.lang.String F2,
      int F3)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
      }
    }
  }

//  stanford2bel.m:7
  public static class Sent_0
    implements jmercury.runtime.MercuryType
  {
    public int F1;
    public java.lang.String F2;
    public java.lang.String F3;
    public java.lang.String F4;
    public list.List_1<stanford2bel.Token_0> F5;
    public list.List_1<stanford2bel.Semrel_0> F6;

    public Sent_0()
    {
      {
      }
    }
    public Sent_0(
      int F1,
      java.lang.String F2,
      java.lang.String F3,
      java.lang.String F4,
      list.List_1<stanford2bel.Token_0> F5,
      list.List_1<stanford2bel.Semrel_0> F6)
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

//  stanford2bel.m:16
  public static class Sent2_0
    implements jmercury.runtime.MercuryType
  {
    public int F1;
    public int F2;
    public java.lang.String F3;
    public java.lang.String F4;
    public tree234.Tree234_2<java.lang.Integer, stanford2bel.Token2_0> F5;
    public tree234.Tree234_2<java.lang.Integer, list.List_1<pair.Pair_2<stanford2bel.Label_0, java.lang.Integer>>> F6;

    public Sent2_0()
    {
      {
      }
    }
    public Sent2_0(
      int F1,
      int F2,
      java.lang.String F3,
      java.lang.String F4,
      tree234.Tree234_2<java.lang.Integer, stanford2bel.Token2_0> F5,
      tree234.Tree234_2<java.lang.Integer, list.List_1<pair.Pair_2<stanford2bel.Label_0, java.lang.Integer>>> F6)
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

//  stanford2bel.m:6
  public static class Stfile_0
    implements jmercury.runtime.MercuryType
  {
    public java.lang.String F1;
    public list.List_1<stanford2bel.Sent_0> F2;
    public list.List_1<stanford2bel.Entity_0> F3;

    public Stfile_0()
    {
      {
      }
    }
    public Stfile_0(
      java.lang.String F1,
      list.List_1<stanford2bel.Sent_0> F2,
      list.List_1<stanford2bel.Entity_0> F3)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
      }
    }
  }

//  stanford2bel.m:15
  public static class Stfile2_0
    implements jmercury.runtime.MercuryType
  {
    public java.lang.String F1;
    public list.List_1<stanford2bel.Sent2_0> F2;
    public tree234.Tree234_2<java.lang.Integer, stanford2bel.Entity2_0> F3;

    public Stfile2_0()
    {
      {
      }
    }
    public Stfile2_0(
      java.lang.String F1,
      list.List_1<stanford2bel.Sent2_0> F2,
      tree234.Tree234_2<java.lang.Integer, stanford2bel.Entity2_0> F3)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
      }
    }
  }

//  stanford2bel.m:38
  public static class Stprop_0
    implements jmercury.runtime.MercuryType
  {
    public int F1;
    public int F2;
    public java.lang.String F3;
    public beliefs.Proposition_0 F4;

    public Stprop_0()
    {
      {
      }
    }
    public Stprop_0(
      int F1,
      int F2,
      java.lang.String F3,
      beliefs.Proposition_0 F4)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
        this.F4 = F4;
      }
    }
  }

//  stanford2bel.m:37
  public static class Stprops_0
    implements jmercury.runtime.MercuryType
  {
    public java.lang.String F1;
    public list.List_1<stanford2bel.Stprop_0> F2;
    public tree234.Tree234_2<java.lang.Integer, stanford2bel.Entity2_0> F3;

    public Stprops_0()
    {
      {
      }
    }
    public Stprops_0(
      java.lang.String F1,
      list.List_1<stanford2bel.Stprop_0> F2,
      tree234.Tree234_2<java.lang.Integer, stanford2bel.Entity2_0> F3)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
      }
    }
  }

//  stanford2bel.m:64
  public static class Tempexpr_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class None_0
      extends stanford2bel.Tempexpr_0
    {

      public None_0()
      {
        {
          (this).data_tag = 0;
        }
      }
    }

    public static class Term_1
      extends stanford2bel.Tempexpr_0
    {
      public stanford2bel.Tmtp_0 F1;

      public Term_1()
      {
        {
        }
      }
      public Term_1(
        stanford2bel.Tmtp_0 F1)
      {
        {
          (this).data_tag = 2;
          this.F1 = F1;
        }
      }
    }

    public static class Nd_4
      extends stanford2bel.Tempexpr_0
    {
      public stanford2bel.Wdtp_0 F1;
      public java.lang.String F2;
      public stanford2bel.Netp_0 F3;
      public maybe.Maybe_1<java.lang.Integer> F4;

      public Nd_4()
      {
        {
        }
      }
      public Nd_4(
        stanford2bel.Wdtp_0 F1,
        java.lang.String F2,
        stanford2bel.Netp_0 F3,
        maybe.Maybe_1<java.lang.Integer> F4)
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


  }

//  stanford2bel.m:66
  public static class Tmtp_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Prt_1
      extends stanford2bel.Tmtp_0
    {
      public java.lang.String F1;

      public Prt_1()
      {
        {
        }
      }
      public Prt_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 5;
          this.F1 = F1;
        }
      }
    }

    public static class Modal_1
      extends stanford2bel.Tmtp_0
    {
      public java.lang.String F1;

      public Modal_1()
      {
        {
        }
      }
      public Modal_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 4;
          this.F1 = F1;
        }
      }
    }

    public static class Be_0
      extends stanford2bel.Tmtp_0
    {

      public Be_0()
      {
        {
          (this).data_tag = 3;
        }
      }
    }

    public static class To_0
      extends stanford2bel.Tmtp_0
    {

      public To_0()
      {
        {
          (this).data_tag = 2;
        }
      }
    }

    public static class N0t_0
      extends stanford2bel.Tmtp_0
    {

      public N0t_0()
      {
        {
          (this).data_tag = 1;
        }
      }
    }

    public static class Do_0
      extends stanford2bel.Tmtp_0
    {

      public Do_0()
      {
        {
          (this).data_tag = 0;
        }
      }
    }


  }

//  stanford2bel.m:8
  public static class Token_0
    implements jmercury.runtime.MercuryType
  {
    public int F1;
    public int F2;
    public java.lang.String F3;
    public java.lang.String F4;
    public java.lang.String F5;

    public Token_0()
    {
      {
      }
    }
    public Token_0(
      int F1,
      int F2,
      java.lang.String F3,
      java.lang.String F4,
      java.lang.String F5)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
        this.F4 = F4;
        this.F5 = F5;
      }
    }
  }

//  stanford2bel.m:19
  public static class Token2_0
    implements jmercury.runtime.MercuryType
  {
    public int F1;
    public java.lang.String F2;
    public stanford2bel.Pos_0 F3;
    public stanford2bel.Netp_0 F4;
    public maybe.Maybe_1<java.lang.Integer> F5;

    public Token2_0()
    {
      {
      }
    }
    public Token2_0(
      int F1,
      java.lang.String F2,
      stanford2bel.Pos_0 F3,
      stanford2bel.Netp_0 F4,
      maybe.Maybe_1<java.lang.Integer> F5)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
        this.F4 = F4;
        this.F5 = F5;
      }
    }
  }

//  stanford2bel.m:60
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

//  stanford2bel.m:65
  public static class Wdtp_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Wdtp_0 K0 = new Wdtp_0(0);  /* noun */
      public static final Wdtp_0 K1 = new Wdtp_0(1);  /* aword */
      public static final Wdtp_0 K2 = new Wdtp_0(2);  /* pp */

      private Wdtp_0(int val) {
        super(val);
      }

  }

//  stanford2bel.m:62
  public static class Wtype_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Wtype_0 K0 = new Wtype_0(0);  /* verb */
      public static final Wtype_0 K1 = new Wtype_0(1);  /* noun */
      public static final Wtype_0 K2 = new Wtype_0(2);  /* prep */
      public static final Wtype_0 K3 = new Wtype_0(3);  /* conj */
      public static final Wtype_0 K4 = new Wtype_0(4);  /* aword */
      public static final Wtype_0 K5 = new Wtype_0(5);  /* ignore */

      private Wtype_0(int val) {
        super(val);
      }

  }

//  stanford2bel.m:210
  private static boolean IntroducedFrom__pred__nonterminal__210__1_1_p_0(
    pair.Pair_2 HeadVar__1_31)
  {
    {
      boolean succeeded = false;
      stanford2bel.Label_0 L_23 = ((stanford2bel.Label_0) ((pair.Pair_2) HeadVar__1_31).F1);
//  stanford2bel.m:211
      stanford2bel.Tempexpr_0 V_24_24 = ((stanford2bel.Tempexpr_0) ((pair.Pair_2) HeadVar__1_31).F2);

      switch (L_23.MR_value) {
        case 1:
          succeeded = true;
          break;
        case 39:
          succeeded = true;
          break;
        default:
          succeeded = false;
      }
//  stanford2bel.m:210
      return succeeded;
    }
  }
//  stanford2bel.m:176
  private static java.lang.Object [] IntroducedFrom__pred__stprops__176__1_11_p_0(
    sberrs.Prmode_0 Md_12,
    int Tn_13,
    java.lang.String Spk_14,
    tree234.Tree234_2 Tmap_18,
    tree234.Tree234_2 Rmap_19,
    pair.Pair_2 HeadVar__6_46,
    list.List_1 HeadVar__8_48,
    list.List_1 HeadVar__10_50)
  {
    {
      boolean succeeded = false;
      pair.Pair_2 HeadVar__7_47 = null;
      list.List_1 HeadVar__9_49 = null;
      list.List_1 HeadVar__11_51 = null;
      stanford2bel.Label_0 Lb_34 = ((stanford2bel.Label_0) ((pair.Pair_2) HeadVar__6_46).F1);
      int Y_35 = ((java.lang.Integer) (((pair.Pair_2) HeadVar__6_46).F2)).intValue();
      stanford2bel.Tempexpr_0 Z_36 = null;

//  stanford2bel.m:177
      {
        java.lang.Object [] result = stanford2bel.stprops_11_p_0(Md_12, Tn_13, Spk_14, Y_35, HeadVar__8_48, Tmap_18, Rmap_19, HeadVar__10_50);
        HeadVar__9_49 = (list.List_1) result[0];
        Z_36 = (stanford2bel.Tempexpr_0) result[1];
        HeadVar__11_51 = (list.List_1) result[2];
      }
//  stanford2bel.m:178
      {
        HeadVar__7_47 = new pair.Pair_2(((java.lang.Object) (Lb_34)), ((java.lang.Object) (Z_36)));
      }
//  stanford2bel.m:176
return new java.lang.Object[] {
        ((java.lang.Object) (HeadVar__7_47)),
        ((java.lang.Object) (HeadVar__9_49)),
        ((java.lang.Object) (HeadVar__11_51))
      };
    }
  }
//  stanford2bel.m:62
  private static builtin.Comparison_result_0 __Compare____wtype_0_0(
    stanford2bel.Wtype_0 HeadVar__2_2,
    stanford2bel.Wtype_0 HeadVar__3_3)
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
  private static boolean __Unify____wtype_0_0(
    stanford2bel.Wtype_0 HeadVar__2_1,
    stanford2bel.Wtype_0 HeadVar__2_2)
  {
    {
      boolean succeeded = (HeadVar__2_1.MR_value == HeadVar__2_2.MR_value);

      return succeeded;
    }
  }
//  stanford2bel.m:65
  private static builtin.Comparison_result_0 __Compare____wdtp_0_0(
    stanford2bel.Wdtp_0 HeadVar__2_2,
    stanford2bel.Wdtp_0 HeadVar__3_3)
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
  private static boolean __Unify____wdtp_0_0(
    stanford2bel.Wdtp_0 HeadVar__2_1,
    stanford2bel.Wdtp_0 HeadVar__2_2)
  {
    {
      boolean succeeded = (HeadVar__2_1.MR_value == HeadVar__2_2.MR_value);

      return succeeded;
    }
  }
//  stanford2bel.m:60
  private static builtin.Comparison_result_0 __Compare____vertices_0_0(
    stanford2bel.Vertices_0 HeadVar__2_2,
    stanford2bel.Vertices_0 HeadVar__3_3)
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
          set_ordlist.Set_ordlist_1 V_4_4 = ((stanford2bel.Vertices_0) HeadVar__2_2).F1;
          set_ordlist.Set_ordlist_1 V_5_5 = ((stanford2bel.Vertices_0) HeadVar__2_2).F2;
          list.List_1 V_6_6 = ((stanford2bel.Vertices_0) HeadVar__2_2).F3;
          list.List_1 V_7_7 = ((stanford2bel.Vertices_0) HeadVar__2_2).F4;
          set_ordlist.Set_ordlist_1 V_8_8 = ((stanford2bel.Vertices_0) HeadVar__3_3).F1;
          set_ordlist.Set_ordlist_1 V_9_9 = ((stanford2bel.Vertices_0) HeadVar__3_3).F2;
          list.List_1 V_10_10 = ((stanford2bel.Vertices_0) HeadVar__3_3).F3;
          list.List_1 V_11_11 = ((stanford2bel.Vertices_0) HeadVar__3_3).F4;
          builtin.Comparison_result_0 V_12_12 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_17_17 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[19]);

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
              jmercury.runtime.TypeInfo_Struct TypeInfo_18_18 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[19]);

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
                  jmercury.runtime.TypeInfo_Struct TypeInfo_19_19 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[11]);

                  {
                    V_14_14 = builtin.compare_3_p_0(TypeInfo_19_19, ((java.lang.Object) (V_6_6)), ((java.lang.Object) (V_10_10)));
                  }
                  succeeded = (V_14_14.MR_value == builtin.Comparison_result_0.K0.MR_value);
                  succeeded = !(succeeded);
                  if (succeeded)
                    HeadVar__1_1 = V_14_14;
                  else
                    {
                      jmercury.runtime.TypeInfo_Struct TypeInfo_20_20 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[20]);

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
    stanford2bel.Vertices_0 HeadVar__1_1,
    stanford2bel.Vertices_0 HeadVar__2_2)
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
          jmercury.runtime.TypeInfo_Struct TypeInfo_13_13 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[19]);
          jmercury.runtime.TypeInfo_Struct TypeInfo_14_14 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_15_15 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_16_16 = null;
          set_ordlist.Set_ordlist_1 V_3_3 = ((stanford2bel.Vertices_0) HeadVar__1_1).F1;
          set_ordlist.Set_ordlist_1 V_4_4 = ((stanford2bel.Vertices_0) HeadVar__1_1).F2;
          list.List_1 V_5_5 = ((stanford2bel.Vertices_0) HeadVar__1_1).F3;
          list.List_1 V_6_6 = ((stanford2bel.Vertices_0) HeadVar__1_1).F4;
          set_ordlist.Set_ordlist_1 V_7_7 = ((stanford2bel.Vertices_0) HeadVar__2_2).F1;
          set_ordlist.Set_ordlist_1 V_8_8 = ((stanford2bel.Vertices_0) HeadVar__2_2).F2;
          list.List_1 V_9_9 = ((stanford2bel.Vertices_0) HeadVar__2_2).F3;
          list.List_1 V_10_10 = ((stanford2bel.Vertices_0) HeadVar__2_2).F4;

          {
            succeeded = builtin.unify_2_p_0(TypeInfo_13_13, ((java.lang.Object) (V_3_3)), ((java.lang.Object) (V_7_7)));
          }
          if (succeeded)
            {
              TypeInfo_14_14 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[19]);
              {
                succeeded = builtin.unify_2_p_0(TypeInfo_14_14, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_8_8)));
              }
              if (succeeded)
                {
                  TypeInfo_15_15 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[11]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_15_15, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_9_9)));
                  }
                  if (succeeded)
                    {
                      TypeInfo_16_16 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[20]);
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
//  stanford2bel.m:17
  public static builtin.Comparison_result_0 __Compare____tokmap_0_0(
    tree234.Tree234_2 HeadVar__2_2,
    tree234.Tree234_2 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[6]);
      tree234.Tree234_2 Cast_HeadVar1_4 = HeadVar__2_2;
      tree234.Tree234_2 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____tokmap_0_0(
    tree234.Tree234_2 HeadVar__1_1,
    tree234.Tree234_2 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[6]);
      tree234.Tree234_2 Cast_HeadVar1_3 = HeadVar__1_1;
      tree234.Tree234_2 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  stanford2bel.m:19
  public static builtin.Comparison_result_0 __Compare____token2_0_0(
    stanford2bel.Token2_0 HeadVar__2_2,
    stanford2bel.Token2_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_18 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_19 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_18 == CastY_19);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        {
          int V_4_4 = ((stanford2bel.Token2_0) HeadVar__2_2).F1;
          java.lang.String V_5_5 = ((stanford2bel.Token2_0) HeadVar__2_2).F2;
          stanford2bel.Pos_0 V_6_6 = ((stanford2bel.Token2_0) HeadVar__2_2).F3;
          stanford2bel.Netp_0 V_7_7 = ((stanford2bel.Token2_0) HeadVar__2_2).F4;
          maybe.Maybe_1 V_8_8 = ((stanford2bel.Token2_0) HeadVar__2_2).F5;
          int V_9_9 = ((stanford2bel.Token2_0) HeadVar__3_3).F1;
          java.lang.String V_10_10 = ((stanford2bel.Token2_0) HeadVar__3_3).F2;
          stanford2bel.Pos_0 V_11_11 = ((stanford2bel.Token2_0) HeadVar__3_3).F3;
          stanford2bel.Netp_0 V_12_12 = ((stanford2bel.Token2_0) HeadVar__3_3).F4;
          maybe.Maybe_1 V_13_13 = ((stanford2bel.Token2_0) HeadVar__3_3).F5;
          builtin.Comparison_result_0 V_14_14 = null;

          {
            V_14_14 = private_builtin.builtin_compare_int_3_p_0(V_4_4, V_9_9);
          }
          succeeded = (V_14_14.MR_value == builtin.Comparison_result_0.K0.MR_value);
          succeeded = !(succeeded);
          if (succeeded)
            HeadVar__1_1 = V_14_14;
          else
            {
              builtin.Comparison_result_0 V_15_15 = null;

              {
                V_15_15 = private_builtin.builtin_compare_string_3_p_0(V_5_5, V_10_10);
              }
              succeeded = (V_15_15.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_15_15;
              else
                {
                  builtin.Comparison_result_0 V_16_16 = null;
                  int V_25_25 = (int) V_6_6.MR_value;
                  int V_26_26 = (int) V_11_11.MR_value;

                  {
                    V_16_16 = private_builtin.builtin_compare_int_3_p_0(V_25_25, V_26_26);
                  }
                  succeeded = (V_16_16.MR_value == builtin.Comparison_result_0.K0.MR_value);
                  succeeded = !(succeeded);
                  if (succeeded)
                    HeadVar__1_1 = V_16_16;
                  else
                    {
                      builtin.Comparison_result_0 V_17_17 = null;
                      int V_27_27 = (int) V_7_7.MR_value;
                      int V_28_28 = (int) V_12_12.MR_value;

                      {
                        V_17_17 = private_builtin.builtin_compare_int_3_p_0(V_27_27, V_28_28);
                      }
                      succeeded = (V_17_17.MR_value == builtin.Comparison_result_0.K0.MR_value);
                      succeeded = !(succeeded);
                      if (succeeded)
                        HeadVar__1_1 = V_17_17;
                      else
                        {
                          jmercury.runtime.TypeInfo_Struct TypeInfo_24_24 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[18]);

                          {
                            HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_24_24, ((java.lang.Object) (V_8_8)), ((java.lang.Object) (V_13_13)));
                          }
                        }
                    }
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____token2_0_0(
    stanford2bel.Token2_0 HeadVar__1_1,
    stanford2bel.Token2_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_13 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_14 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_13 == CastY_14);
      if (succeeded)
        succeeded = true;
      else
        {
          jmercury.runtime.TypeInfo_Struct TypeInfo_15_15 = null;
          int V_3_3 = ((stanford2bel.Token2_0) HeadVar__1_1).F1;
          java.lang.String V_4_4 = ((stanford2bel.Token2_0) HeadVar__1_1).F2;
          stanford2bel.Pos_0 V_5_5 = ((stanford2bel.Token2_0) HeadVar__1_1).F3;
          stanford2bel.Netp_0 V_6_6 = ((stanford2bel.Token2_0) HeadVar__1_1).F4;
          maybe.Maybe_1 V_7_7 = ((stanford2bel.Token2_0) HeadVar__1_1).F5;
          int V_8_8 = ((stanford2bel.Token2_0) HeadVar__2_2).F1;
          java.lang.String V_9_9 = ((stanford2bel.Token2_0) HeadVar__2_2).F2;
          stanford2bel.Pos_0 V_10_10 = ((stanford2bel.Token2_0) HeadVar__2_2).F3;
          stanford2bel.Netp_0 V_11_11 = ((stanford2bel.Token2_0) HeadVar__2_2).F4;
          maybe.Maybe_1 V_12_12 = ((stanford2bel.Token2_0) HeadVar__2_2).F5;

          succeeded = (V_3_3 == V_8_8);
          if (succeeded)
            {
              succeeded = V_4_4.equals(V_9_9);
              if (succeeded)
                {
                  succeeded = (V_5_5.MR_value == V_10_10.MR_value);
                  if (succeeded)
                    {
                      succeeded = (V_6_6.MR_value == V_11_11.MR_value);
                      if (succeeded)
                        {
                          TypeInfo_15_15 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[18]);
                          {
                            succeeded = builtin.unify_2_p_0(TypeInfo_15_15, ((java.lang.Object) (V_7_7)), ((java.lang.Object) (V_12_12)));
                          }
                        }
                    }
                }
            }
        }
      return succeeded;
    }
  }
//  stanford2bel.m:8
  public static builtin.Comparison_result_0 __Compare____token_0_0(
    stanford2bel.Token_0 HeadVar__2_2,
    stanford2bel.Token_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_18 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_19 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_18 == CastY_19);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        {
          int V_4_4 = ((stanford2bel.Token_0) HeadVar__2_2).F1;
          int V_5_5 = ((stanford2bel.Token_0) HeadVar__2_2).F2;
          java.lang.String V_6_6 = ((stanford2bel.Token_0) HeadVar__2_2).F3;
          java.lang.String V_7_7 = ((stanford2bel.Token_0) HeadVar__2_2).F4;
          java.lang.String V_8_8 = ((stanford2bel.Token_0) HeadVar__2_2).F5;
          int V_9_9 = ((stanford2bel.Token_0) HeadVar__3_3).F1;
          int V_10_10 = ((stanford2bel.Token_0) HeadVar__3_3).F2;
          java.lang.String V_11_11 = ((stanford2bel.Token_0) HeadVar__3_3).F3;
          java.lang.String V_12_12 = ((stanford2bel.Token_0) HeadVar__3_3).F4;
          java.lang.String V_13_13 = ((stanford2bel.Token_0) HeadVar__3_3).F5;
          builtin.Comparison_result_0 V_14_14 = null;

          {
            V_14_14 = private_builtin.builtin_compare_int_3_p_0(V_4_4, V_9_9);
          }
          succeeded = (V_14_14.MR_value == builtin.Comparison_result_0.K0.MR_value);
          succeeded = !(succeeded);
          if (succeeded)
            HeadVar__1_1 = V_14_14;
          else
            {
              builtin.Comparison_result_0 V_15_15 = null;

              {
                V_15_15 = private_builtin.builtin_compare_int_3_p_0(V_5_5, V_10_10);
              }
              succeeded = (V_15_15.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_15_15;
              else
                {
                  builtin.Comparison_result_0 V_16_16 = null;

                  {
                    V_16_16 = private_builtin.builtin_compare_string_3_p_0(V_6_6, V_11_11);
                  }
                  succeeded = (V_16_16.MR_value == builtin.Comparison_result_0.K0.MR_value);
                  succeeded = !(succeeded);
                  if (succeeded)
                    HeadVar__1_1 = V_16_16;
                  else
                    {
                      builtin.Comparison_result_0 V_17_17 = null;

                      {
                        V_17_17 = private_builtin.builtin_compare_string_3_p_0(V_7_7, V_12_12);
                      }
                      succeeded = (V_17_17.MR_value == builtin.Comparison_result_0.K0.MR_value);
                      succeeded = !(succeeded);
                      if (succeeded)
                        HeadVar__1_1 = V_17_17;
                      else
                        {
                          HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_8_8, V_13_13);
                        }
                    }
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____token_0_0(
    stanford2bel.Token_0 HeadVar__1_1,
    stanford2bel.Token_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_13 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_14 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_13 == CastY_14);
      if (succeeded)
        succeeded = true;
      else
        {
          int V_3_3 = ((stanford2bel.Token_0) HeadVar__1_1).F1;
          int V_4_4 = ((stanford2bel.Token_0) HeadVar__1_1).F2;
          java.lang.String V_5_5 = ((stanford2bel.Token_0) HeadVar__1_1).F3;
          java.lang.String V_6_6 = ((stanford2bel.Token_0) HeadVar__1_1).F4;
          java.lang.String V_7_7 = ((stanford2bel.Token_0) HeadVar__1_1).F5;
          int V_8_8 = ((stanford2bel.Token_0) HeadVar__2_2).F1;
          int V_9_9 = ((stanford2bel.Token_0) HeadVar__2_2).F2;
          java.lang.String V_10_10 = ((stanford2bel.Token_0) HeadVar__2_2).F3;
          java.lang.String V_11_11 = ((stanford2bel.Token_0) HeadVar__2_2).F4;
          java.lang.String V_12_12 = ((stanford2bel.Token_0) HeadVar__2_2).F5;

          succeeded = (V_3_3 == V_8_8);
          if (succeeded)
            {
              succeeded = (V_4_4 == V_9_9);
              if (succeeded)
                {
                  succeeded = V_5_5.equals(V_10_10);
                  if (succeeded)
                    {
                      succeeded = V_6_6.equals(V_11_11);
                      if (succeeded)
                        succeeded = V_7_7.equals(V_12_12);
                    }
                }
            }
        }
      return succeeded;
    }
  }
//  stanford2bel.m:35
  public static builtin.Comparison_result_0 __Compare____tnum_0_0(
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
  public static boolean __Unify____tnum_0_0(
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
//  stanford2bel.m:66
  private static builtin.Comparison_result_0 __Compare____tmtp_0_0(
    stanford2bel.Tmtp_0 HeadVar__2_2,
    stanford2bel.Tmtp_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_28 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_29 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_28 == CastY_29);
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
              default: /*NOTREACHED*/
                throw new jmercury.runtime.UnreachableDefault();
            }
            break;
          case 4:
            {
              java.lang.String V_32_32 = ((stanford2bel.Tmtp_0.Modal_1) HeadVar__2_2).F1;

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
                    java.lang.String V_17_17 = ((stanford2bel.Tmtp_0.Modal_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_32_32, V_17_17);
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
              java.lang.String V_33_33 = ((stanford2bel.Tmtp_0.Prt_1) HeadVar__2_2).F1;

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
                    java.lang.String V_27_27 = ((stanford2bel.Tmtp_0.Prt_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_33_33, V_27_27);
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
  private static boolean __Unify____tmtp_0_0(
    stanford2bel.Tmtp_0 HeadVar__1_1,
    stanford2bel.Tmtp_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_7 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_8 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_7 == CastY_8);
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
              java.lang.String V_3_3 = ((stanford2bel.Tmtp_0.Modal_1) HeadVar__1_1).F1;
              java.lang.String V_4_4 = null;

              succeeded = (HeadVar__2_2.data_tag == 4);
              if (succeeded)
                {
                  V_4_4 = ((stanford2bel.Tmtp_0.Modal_1) HeadVar__2_2).F1;
                  succeeded = V_3_3.equals(V_4_4);
                }
            }
            break;
          case 5:
            {
              java.lang.String V_5_5 = ((stanford2bel.Tmtp_0.Prt_1) HeadVar__1_1).F1;
              java.lang.String V_6_6 = null;

              succeeded = (HeadVar__2_2.data_tag == 5);
              if (succeeded)
                {
                  V_6_6 = ((stanford2bel.Tmtp_0.Prt_1) HeadVar__2_2).F1;
                  succeeded = V_5_5.equals(V_6_6);
                }
            }
            break;
          default: /*NOTREACHED*/
            throw new jmercury.runtime.UnreachableDefault();
        }
      return succeeded;
    }
  }
//  stanford2bel.m:91
  private static builtin.Comparison_result_0 __Compare____tkmap_0_0(
    tree234.Tree234_2 HeadVar__2_2,
    tree234.Tree234_2 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[1]);
      tree234.Tree234_2 Cast_HeadVar1_4 = HeadVar__2_2;
      tree234.Tree234_2 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  private static boolean __Unify____tkmap_0_0(
    tree234.Tree234_2 HeadVar__1_1,
    tree234.Tree234_2 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[1]);
      tree234.Tree234_2 Cast_HeadVar1_3 = HeadVar__1_1;
      tree234.Tree234_2 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  stanford2bel.m:12
  public static builtin.Comparison_result_0 __Compare____tid_0_0(
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
  public static boolean __Unify____tid_0_0(
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
//  stanford2bel.m:64
  private static builtin.Comparison_result_0 __Compare____tempexpr_0_0(
    stanford2bel.Tempexpr_0 HeadVar__2_2,
    stanford2bel.Tempexpr_0 HeadVar__3_3)
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
        switch (HeadVar__2_2.data_tag) {
          case 0:
            switch (HeadVar__3_3.data_tag) {
              case 0:
                HeadVar__1_1 = builtin.Comparison_result_0.K0;
                break;
              case 1:
                HeadVar__1_1 = builtin.Comparison_result_0.K2;
                break;
              case 2:
                HeadVar__1_1 = builtin.Comparison_result_0.K2;
                break;
              default: /*NOTREACHED*/
                throw new jmercury.runtime.UnreachableDefault();
            }
            break;
          case 1:
            {
              maybe.Maybe_1 V_44_44 = ((stanford2bel.Tempexpr_0.Nd_4) HeadVar__2_2).F4;
              stanford2bel.Netp_0 V_45_45 = ((stanford2bel.Tempexpr_0.Nd_4) HeadVar__2_2).F3;
              java.lang.String V_46_46 = ((stanford2bel.Tempexpr_0.Nd_4) HeadVar__2_2).F2;
              stanford2bel.Wdtp_0 V_47_47 = ((stanford2bel.Tempexpr_0.Nd_4) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 1:
                  {
                    stanford2bel.Wdtp_0 V_8_8 = ((stanford2bel.Tempexpr_0.Nd_4) HeadVar__3_3).F1;
                    java.lang.String V_9_9 = ((stanford2bel.Tempexpr_0.Nd_4) HeadVar__3_3).F2;
                    stanford2bel.Netp_0 V_10_10 = ((stanford2bel.Tempexpr_0.Nd_4) HeadVar__3_3).F3;
                    maybe.Maybe_1 V_11_11 = ((stanford2bel.Tempexpr_0.Nd_4) HeadVar__3_3).F4;
                    builtin.Comparison_result_0 V_12_12 = null;
                    int V_49_49 = (int) V_47_47.MR_value;
                    int V_50_50 = (int) V_8_8.MR_value;

                    {
                      V_12_12 = private_builtin.builtin_compare_int_3_p_0(V_49_49, V_50_50);
                    }
                    succeeded = (V_12_12.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_12_12;
                    else
                      {
                        builtin.Comparison_result_0 V_13_13 = null;

                        {
                          V_13_13 = private_builtin.builtin_compare_string_3_p_0(V_46_46, V_9_9);
                        }
                        succeeded = (V_13_13.MR_value == builtin.Comparison_result_0.K0.MR_value);
                        succeeded = !(succeeded);
                        if (succeeded)
                          HeadVar__1_1 = V_13_13;
                        else
                          {
                            builtin.Comparison_result_0 V_14_14 = null;
                            int V_51_51 = (int) V_45_45.MR_value;
                            int V_52_52 = (int) V_10_10.MR_value;

                            {
                              V_14_14 = private_builtin.builtin_compare_int_3_p_0(V_51_51, V_52_52);
                            }
                            succeeded = (V_14_14.MR_value == builtin.Comparison_result_0.K0.MR_value);
                            succeeded = !(succeeded);
                            if (succeeded)
                              HeadVar__1_1 = V_14_14;
                            else
                              {
                                jmercury.runtime.TypeInfo_Struct TypeInfo_43_43 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[18]);

                                {
                                  HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_43_43, ((java.lang.Object) (V_44_44)), ((java.lang.Object) (V_11_11)));
                                }
                              }
                          }
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
              stanford2bel.Tmtp_0 V_48_48 = ((stanford2bel.Tempexpr_0.Term_1) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 1:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 2:
                  {
                    stanford2bel.Tmtp_0 V_30_30 = ((stanford2bel.Tempexpr_0.Term_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = stanford2bel.__Compare____tmtp_0_0(V_48_48, V_30_30);
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
  private static boolean __Unify____tempexpr_0_0(
    stanford2bel.Tempexpr_0 HeadVar__1_1,
    stanford2bel.Tempexpr_0 HeadVar__2_2)
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
            succeeded = (HeadVar__2_2.data_tag == 0);
            break;
          case 1:
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_15_15 = null;
              stanford2bel.Wdtp_0 V_3_3 = ((stanford2bel.Tempexpr_0.Nd_4) HeadVar__1_1).F1;
              java.lang.String V_4_4 = ((stanford2bel.Tempexpr_0.Nd_4) HeadVar__1_1).F2;
              stanford2bel.Netp_0 V_5_5 = ((stanford2bel.Tempexpr_0.Nd_4) HeadVar__1_1).F3;
              maybe.Maybe_1 V_6_6 = ((stanford2bel.Tempexpr_0.Nd_4) HeadVar__1_1).F4;
              stanford2bel.Wdtp_0 V_7_7 = null;
              java.lang.String V_8_8 = null;
              stanford2bel.Netp_0 V_9_9 = null;
              maybe.Maybe_1 V_10_10 = null;

              succeeded = (HeadVar__2_2.data_tag == 1);
              if (succeeded)
                {
                  V_7_7 = ((stanford2bel.Tempexpr_0.Nd_4) HeadVar__2_2).F1;
                  V_8_8 = ((stanford2bel.Tempexpr_0.Nd_4) HeadVar__2_2).F2;
                  V_9_9 = ((stanford2bel.Tempexpr_0.Nd_4) HeadVar__2_2).F3;
                  V_10_10 = ((stanford2bel.Tempexpr_0.Nd_4) HeadVar__2_2).F4;
                  succeeded = (V_3_3.MR_value == V_7_7.MR_value);
                  if (succeeded)
                    {
                      succeeded = V_4_4.equals(V_8_8);
                      if (succeeded)
                        {
                          succeeded = (V_5_5.MR_value == V_9_9.MR_value);
                          if (succeeded)
                            {
                              TypeInfo_15_15 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[18]);
                              {
                                succeeded = builtin.unify_2_p_0(TypeInfo_15_15, ((java.lang.Object) (V_6_6)), ((java.lang.Object) (V_10_10)));
                              }
                            }
                        }
                    }
                }
            }
            break;
          case 2:
            {
              stanford2bel.Tmtp_0 V_11_11 = ((stanford2bel.Tempexpr_0.Term_1) HeadVar__1_1).F1;
              stanford2bel.Tmtp_0 V_12_12 = null;
//  stanford2bel.m:66
              /* c_pointer */ java.lang.Object CastX_20 = null;
              /* c_pointer */ java.lang.Object CastY_21 = null;

//  stanford2bel.m:64
              succeeded = (HeadVar__2_2.data_tag == 2);
              if (succeeded)
                {
                  V_12_12 = ((stanford2bel.Tempexpr_0.Term_1) HeadVar__2_2).F1;
//  stanford2bel.m:66
                  CastX_20 = (/* c_pointer */ java.lang.Object) V_11_11;
                  CastY_21 = (/* c_pointer */ java.lang.Object) V_12_12;
                  succeeded = (CastX_20 == CastY_21);
                  if (succeeded)
                    succeeded = true;
                  else
                    switch (V_11_11.data_tag) {
                      case 0:
                        succeeded = (V_12_12.data_tag == 0);
                        break;
                      case 1:
                        succeeded = (V_12_12.data_tag == 1);
                        break;
                      case 2:
                        succeeded = (V_12_12.data_tag == 2);
                        break;
                      case 3:
                        succeeded = (V_12_12.data_tag == 3);
                        break;
                      case 4:
                        {
                          java.lang.String V_16_16 = ((stanford2bel.Tmtp_0.Modal_1) V_11_11).F1;
                          java.lang.String V_17_17 = null;

                          succeeded = (V_12_12.data_tag == 4);
                          if (succeeded)
                            {
                              V_17_17 = ((stanford2bel.Tmtp_0.Modal_1) V_12_12).F1;
                              succeeded = V_16_16.equals(V_17_17);
                            }
                        }
                        break;
                      case 5:
                        {
                          java.lang.String V_18_18 = ((stanford2bel.Tmtp_0.Prt_1) V_11_11).F1;
                          java.lang.String V_19_19 = null;

                          succeeded = (V_12_12.data_tag == 5);
                          if (succeeded)
                            {
                              V_19_19 = ((stanford2bel.Tmtp_0.Prt_1) V_12_12).F1;
                              succeeded = V_18_18.equals(V_19_19);
                            }
                        }
                        break;
                      default: /*NOTREACHED*/
                        throw new jmercury.runtime.UnreachableDefault();
                    }
//  stanford2bel.m:64
                }
            }
            break;
          default: /*NOTREACHED*/
            throw new jmercury.runtime.UnreachableDefault();
        }
      return succeeded;
    }
  }
//  stanford2bel.m:37
  public static builtin.Comparison_result_0 __Compare____stprops_0_0(
    stanford2bel.Stprops_0 HeadVar__2_2,
    stanford2bel.Stprops_0 HeadVar__3_3)
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
          java.lang.String V_4_4 = ((stanford2bel.Stprops_0) HeadVar__2_2).F1;
          list.List_1 V_5_5 = ((stanford2bel.Stprops_0) HeadVar__2_2).F2;
          tree234.Tree234_2 V_6_6 = ((stanford2bel.Stprops_0) HeadVar__2_2).F3;
          java.lang.String V_7_7 = ((stanford2bel.Stprops_0) HeadVar__3_3).F1;
          list.List_1 V_8_8 = ((stanford2bel.Stprops_0) HeadVar__3_3).F2;
          tree234.Tree234_2 V_9_9 = ((stanford2bel.Stprops_0) HeadVar__3_3).F3;
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
              jmercury.runtime.TypeInfo_Struct TypeInfo_15_15 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[4]);

              {
                V_11_11 = builtin.compare_3_p_0(TypeInfo_15_15, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_8_8)));
              }
              succeeded = (V_11_11.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_11_11;
              else
                {
                  jmercury.runtime.TypeInfo_Struct TypeInfo_16_16 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[2]);

                  {
                    HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_16_16, ((java.lang.Object) (V_6_6)), ((java.lang.Object) (V_9_9)));
                  }
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____stprops_0_0(
    stanford2bel.Stprops_0 HeadVar__1_1,
    stanford2bel.Stprops_0 HeadVar__2_2)
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
          java.lang.String V_3_3 = ((stanford2bel.Stprops_0) HeadVar__1_1).F1;
          list.List_1 V_4_4 = ((stanford2bel.Stprops_0) HeadVar__1_1).F2;
          tree234.Tree234_2 V_5_5 = ((stanford2bel.Stprops_0) HeadVar__1_1).F3;
          java.lang.String V_6_6 = ((stanford2bel.Stprops_0) HeadVar__2_2).F1;
          list.List_1 V_7_7 = ((stanford2bel.Stprops_0) HeadVar__2_2).F2;
          tree234.Tree234_2 V_8_8 = ((stanford2bel.Stprops_0) HeadVar__2_2).F3;

          succeeded = V_3_3.equals(V_6_6);
          if (succeeded)
            {
              TypeInfo_11_11 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[4]);
              {
                succeeded = builtin.unify_2_p_0(TypeInfo_11_11, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_7_7)));
              }
              if (succeeded)
                {
                  TypeInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[2]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_12_12, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_8_8)));
                  }
                }
            }
        }
      return succeeded;
    }
  }
//  stanford2bel.m:38
  public static builtin.Comparison_result_0 __Compare____stprop_0_0(
    stanford2bel.Stprop_0 HeadVar__2_2,
    stanford2bel.Stprop_0 HeadVar__3_3)
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
          int V_4_4 = ((stanford2bel.Stprop_0) HeadVar__2_2).F1;
          int V_5_5 = ((stanford2bel.Stprop_0) HeadVar__2_2).F2;
          java.lang.String V_6_6 = ((stanford2bel.Stprop_0) HeadVar__2_2).F3;
          beliefs.Proposition_0 V_7_7 = ((stanford2bel.Stprop_0) HeadVar__2_2).F4;
          int V_8_8 = ((stanford2bel.Stprop_0) HeadVar__3_3).F1;
          int V_9_9 = ((stanford2bel.Stprop_0) HeadVar__3_3).F2;
          java.lang.String V_10_10 = ((stanford2bel.Stprop_0) HeadVar__3_3).F3;
          beliefs.Proposition_0 V_11_11 = ((stanford2bel.Stprop_0) HeadVar__3_3).F4;
          builtin.Comparison_result_0 V_12_12 = null;

          {
            V_12_12 = private_builtin.builtin_compare_int_3_p_0(V_4_4, V_8_8);
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
                      HeadVar__1_1 = beliefs.__Compare____proposition_0_0(V_7_7, V_11_11);
                    }
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____stprop_0_0(
    stanford2bel.Stprop_0 HeadVar__1_1,
    stanford2bel.Stprop_0 HeadVar__2_2)
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
          int V_3_3 = ((stanford2bel.Stprop_0) HeadVar__1_1).F1;
          int V_4_4 = ((stanford2bel.Stprop_0) HeadVar__1_1).F2;
          java.lang.String V_5_5 = ((stanford2bel.Stprop_0) HeadVar__1_1).F3;
          beliefs.Proposition_0 V_6_6 = ((stanford2bel.Stprop_0) HeadVar__1_1).F4;
          int V_7_7 = ((stanford2bel.Stprop_0) HeadVar__2_2).F1;
          int V_8_8 = ((stanford2bel.Stprop_0) HeadVar__2_2).F2;
          java.lang.String V_9_9 = ((stanford2bel.Stprop_0) HeadVar__2_2).F3;
          beliefs.Proposition_0 V_10_10 = ((stanford2bel.Stprop_0) HeadVar__2_2).F4;

          succeeded = (V_3_3 == V_7_7);
          if (succeeded)
            {
              succeeded = (V_4_4 == V_8_8);
              if (succeeded)
                {
                  succeeded = V_5_5.equals(V_9_9);
                  if (succeeded)
                    {
                      succeeded = beliefs.__Unify____proposition_0_0(V_6_6, V_10_10);
                    }
                }
            }
        }
      return succeeded;
    }
  }
//  stanford2bel.m:15
  public static builtin.Comparison_result_0 __Compare____stfile2_0_0(
    stanford2bel.Stfile2_0 HeadVar__2_2,
    stanford2bel.Stfile2_0 HeadVar__3_3)
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
          java.lang.String V_4_4 = ((stanford2bel.Stfile2_0) HeadVar__2_2).F1;
          list.List_1 V_5_5 = ((stanford2bel.Stfile2_0) HeadVar__2_2).F2;
          tree234.Tree234_2 V_6_6 = ((stanford2bel.Stfile2_0) HeadVar__2_2).F3;
          java.lang.String V_7_7 = ((stanford2bel.Stfile2_0) HeadVar__3_3).F1;
          list.List_1 V_8_8 = ((stanford2bel.Stfile2_0) HeadVar__3_3).F2;
          tree234.Tree234_2 V_9_9 = ((stanford2bel.Stfile2_0) HeadVar__3_3).F3;
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
              jmercury.runtime.TypeInfo_Struct TypeInfo_15_15 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[17]);

              {
                V_11_11 = builtin.compare_3_p_0(TypeInfo_15_15, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_8_8)));
              }
              succeeded = (V_11_11.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_11_11;
              else
                {
                  jmercury.runtime.TypeInfo_Struct TypeInfo_16_16 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[2]);

                  {
                    HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_16_16, ((java.lang.Object) (V_6_6)), ((java.lang.Object) (V_9_9)));
                  }
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____stfile2_0_0(
    stanford2bel.Stfile2_0 HeadVar__1_1,
    stanford2bel.Stfile2_0 HeadVar__2_2)
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
          java.lang.String V_3_3 = ((stanford2bel.Stfile2_0) HeadVar__1_1).F1;
          list.List_1 V_4_4 = ((stanford2bel.Stfile2_0) HeadVar__1_1).F2;
          tree234.Tree234_2 V_5_5 = ((stanford2bel.Stfile2_0) HeadVar__1_1).F3;
          java.lang.String V_6_6 = ((stanford2bel.Stfile2_0) HeadVar__2_2).F1;
          list.List_1 V_7_7 = ((stanford2bel.Stfile2_0) HeadVar__2_2).F2;
          tree234.Tree234_2 V_8_8 = ((stanford2bel.Stfile2_0) HeadVar__2_2).F3;

          succeeded = V_3_3.equals(V_6_6);
          if (succeeded)
            {
              TypeInfo_11_11 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[17]);
              {
                succeeded = builtin.unify_2_p_0(TypeInfo_11_11, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_7_7)));
              }
              if (succeeded)
                {
                  TypeInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[2]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_12_12, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_8_8)));
                  }
                }
            }
        }
      return succeeded;
    }
  }
//  stanford2bel.m:6
  public static builtin.Comparison_result_0 __Compare____stfile_0_0(
    stanford2bel.Stfile_0 HeadVar__2_2,
    stanford2bel.Stfile_0 HeadVar__3_3)
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
          java.lang.String V_4_4 = ((stanford2bel.Stfile_0) HeadVar__2_2).F1;
          list.List_1 V_5_5 = ((stanford2bel.Stfile_0) HeadVar__2_2).F2;
          list.List_1 V_6_6 = ((stanford2bel.Stfile_0) HeadVar__2_2).F3;
          java.lang.String V_7_7 = ((stanford2bel.Stfile_0) HeadVar__3_3).F1;
          list.List_1 V_8_8 = ((stanford2bel.Stfile_0) HeadVar__3_3).F2;
          list.List_1 V_9_9 = ((stanford2bel.Stfile_0) HeadVar__3_3).F3;
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
              jmercury.runtime.TypeInfo_Struct TypeInfo_15_15 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[15]);

              {
                V_11_11 = builtin.compare_3_p_0(TypeInfo_15_15, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_8_8)));
              }
              succeeded = (V_11_11.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_11_11;
              else
                {
                  jmercury.runtime.TypeInfo_Struct TypeInfo_16_16 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[16]);

                  {
                    HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_16_16, ((java.lang.Object) (V_6_6)), ((java.lang.Object) (V_9_9)));
                  }
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____stfile_0_0(
    stanford2bel.Stfile_0 HeadVar__1_1,
    stanford2bel.Stfile_0 HeadVar__2_2)
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
          java.lang.String V_3_3 = ((stanford2bel.Stfile_0) HeadVar__1_1).F1;
          list.List_1 V_4_4 = ((stanford2bel.Stfile_0) HeadVar__1_1).F2;
          list.List_1 V_5_5 = ((stanford2bel.Stfile_0) HeadVar__1_1).F3;
          java.lang.String V_6_6 = ((stanford2bel.Stfile_0) HeadVar__2_2).F1;
          list.List_1 V_7_7 = ((stanford2bel.Stfile_0) HeadVar__2_2).F2;
          list.List_1 V_8_8 = ((stanford2bel.Stfile_0) HeadVar__2_2).F3;

          succeeded = V_3_3.equals(V_6_6);
          if (succeeded)
            {
              TypeInfo_11_11 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[15]);
              {
                succeeded = builtin.unify_2_p_0(TypeInfo_11_11, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_7_7)));
              }
              if (succeeded)
                {
                  TypeInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[16]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_12_12, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_8_8)));
                  }
                }
            }
        }
      return succeeded;
    }
  }
//  stanford2bel.m:11
  public static builtin.Comparison_result_0 __Compare____sid_0_0(
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
  public static boolean __Unify____sid_0_0(
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
//  stanford2bel.m:16
  public static builtin.Comparison_result_0 __Compare____sent2_0_0(
    stanford2bel.Sent2_0 HeadVar__2_2,
    stanford2bel.Sent2_0 HeadVar__3_3)
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
          int V_4_4 = ((stanford2bel.Sent2_0) HeadVar__2_2).F1;
          int V_5_5 = ((stanford2bel.Sent2_0) HeadVar__2_2).F2;
          java.lang.String V_6_6 = ((stanford2bel.Sent2_0) HeadVar__2_2).F3;
          java.lang.String V_7_7 = ((stanford2bel.Sent2_0) HeadVar__2_2).F4;
          tree234.Tree234_2 V_8_8 = ((stanford2bel.Sent2_0) HeadVar__2_2).F5;
          tree234.Tree234_2 V_9_9 = ((stanford2bel.Sent2_0) HeadVar__2_2).F6;
          int V_10_10 = ((stanford2bel.Sent2_0) HeadVar__3_3).F1;
          int V_11_11 = ((stanford2bel.Sent2_0) HeadVar__3_3).F2;
          java.lang.String V_12_12 = ((stanford2bel.Sent2_0) HeadVar__3_3).F3;
          java.lang.String V_13_13 = ((stanford2bel.Sent2_0) HeadVar__3_3).F4;
          tree234.Tree234_2 V_14_14 = ((stanford2bel.Sent2_0) HeadVar__3_3).F5;
          tree234.Tree234_2 V_15_15 = ((stanford2bel.Sent2_0) HeadVar__3_3).F6;
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

                      {
                        V_19_19 = private_builtin.builtin_compare_string_3_p_0(V_7_7, V_13_13);
                      }
                      succeeded = (V_19_19.MR_value == builtin.Comparison_result_0.K0.MR_value);
                      succeeded = !(succeeded);
                      if (succeeded)
                        HeadVar__1_1 = V_19_19;
                      else
                        {
                          builtin.Comparison_result_0 V_20_20 = null;
                          jmercury.runtime.TypeInfo_Struct TypeInfo_27_27 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[6]);

                          {
                            V_20_20 = builtin.compare_3_p_0(TypeInfo_27_27, ((java.lang.Object) (V_8_8)), ((java.lang.Object) (V_14_14)));
                          }
                          succeeded = (V_20_20.MR_value == builtin.Comparison_result_0.K0.MR_value);
                          succeeded = !(succeeded);
                          if (succeeded)
                            HeadVar__1_1 = V_20_20;
                          else
                            {
                              jmercury.runtime.TypeInfo_Struct TypeInfo_28_28 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[9]);

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
  public static boolean __Unify____sent2_0_0(
    stanford2bel.Sent2_0 HeadVar__1_1,
    stanford2bel.Sent2_0 HeadVar__2_2)
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
          jmercury.runtime.TypeInfo_Struct TypeInfo_18_18 = null;
          int V_3_3 = ((stanford2bel.Sent2_0) HeadVar__1_1).F1;
          int V_4_4 = ((stanford2bel.Sent2_0) HeadVar__1_1).F2;
          java.lang.String V_5_5 = ((stanford2bel.Sent2_0) HeadVar__1_1).F3;
          java.lang.String V_6_6 = ((stanford2bel.Sent2_0) HeadVar__1_1).F4;
          tree234.Tree234_2 V_7_7 = ((stanford2bel.Sent2_0) HeadVar__1_1).F5;
          tree234.Tree234_2 V_8_8 = ((stanford2bel.Sent2_0) HeadVar__1_1).F6;
          int V_9_9 = ((stanford2bel.Sent2_0) HeadVar__2_2).F1;
          int V_10_10 = ((stanford2bel.Sent2_0) HeadVar__2_2).F2;
          java.lang.String V_11_11 = ((stanford2bel.Sent2_0) HeadVar__2_2).F3;
          java.lang.String V_12_12 = ((stanford2bel.Sent2_0) HeadVar__2_2).F4;
          tree234.Tree234_2 V_13_13 = ((stanford2bel.Sent2_0) HeadVar__2_2).F5;
          tree234.Tree234_2 V_14_14 = ((stanford2bel.Sent2_0) HeadVar__2_2).F6;

          succeeded = (V_3_3 == V_9_9);
          if (succeeded)
            {
              succeeded = (V_4_4 == V_10_10);
              if (succeeded)
                {
                  succeeded = V_5_5.equals(V_11_11);
                  if (succeeded)
                    {
                      succeeded = V_6_6.equals(V_12_12);
                      if (succeeded)
                        {
                          TypeInfo_17_17 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[6]);
                          {
                            succeeded = builtin.unify_2_p_0(TypeInfo_17_17, ((java.lang.Object) (V_7_7)), ((java.lang.Object) (V_13_13)));
                          }
                          if (succeeded)
                            {
                              TypeInfo_18_18 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[9]);
                              {
                                succeeded = builtin.unify_2_p_0(TypeInfo_18_18, ((java.lang.Object) (V_8_8)), ((java.lang.Object) (V_14_14)));
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
//  stanford2bel.m:7
  public static builtin.Comparison_result_0 __Compare____sent_0_0(
    stanford2bel.Sent_0 HeadVar__2_2,
    stanford2bel.Sent_0 HeadVar__3_3)
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
          int V_4_4 = ((stanford2bel.Sent_0) HeadVar__2_2).F1;
          java.lang.String V_5_5 = ((stanford2bel.Sent_0) HeadVar__2_2).F2;
          java.lang.String V_6_6 = ((stanford2bel.Sent_0) HeadVar__2_2).F3;
          java.lang.String V_7_7 = ((stanford2bel.Sent_0) HeadVar__2_2).F4;
          list.List_1 V_8_8 = ((stanford2bel.Sent_0) HeadVar__2_2).F5;
          list.List_1 V_9_9 = ((stanford2bel.Sent_0) HeadVar__2_2).F6;
          int V_10_10 = ((stanford2bel.Sent_0) HeadVar__3_3).F1;
          java.lang.String V_11_11 = ((stanford2bel.Sent_0) HeadVar__3_3).F2;
          java.lang.String V_12_12 = ((stanford2bel.Sent_0) HeadVar__3_3).F3;
          java.lang.String V_13_13 = ((stanford2bel.Sent_0) HeadVar__3_3).F4;
          list.List_1 V_14_14 = ((stanford2bel.Sent_0) HeadVar__3_3).F5;
          list.List_1 V_15_15 = ((stanford2bel.Sent_0) HeadVar__3_3).F6;
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
                    V_18_18 = private_builtin.builtin_compare_string_3_p_0(V_6_6, V_12_12);
                  }
                  succeeded = (V_18_18.MR_value == builtin.Comparison_result_0.K0.MR_value);
                  succeeded = !(succeeded);
                  if (succeeded)
                    HeadVar__1_1 = V_18_18;
                  else
                    {
                      builtin.Comparison_result_0 V_19_19 = null;

                      {
                        V_19_19 = private_builtin.builtin_compare_string_3_p_0(V_7_7, V_13_13);
                      }
                      succeeded = (V_19_19.MR_value == builtin.Comparison_result_0.K0.MR_value);
                      succeeded = !(succeeded);
                      if (succeeded)
                        HeadVar__1_1 = V_19_19;
                      else
                        {
                          builtin.Comparison_result_0 V_20_20 = null;
                          jmercury.runtime.TypeInfo_Struct TypeInfo_27_27 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[13]);

                          {
                            V_20_20 = builtin.compare_3_p_0(TypeInfo_27_27, ((java.lang.Object) (V_8_8)), ((java.lang.Object) (V_14_14)));
                          }
                          succeeded = (V_20_20.MR_value == builtin.Comparison_result_0.K0.MR_value);
                          succeeded = !(succeeded);
                          if (succeeded)
                            HeadVar__1_1 = V_20_20;
                          else
                            {
                              jmercury.runtime.TypeInfo_Struct TypeInfo_28_28 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[14]);

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
  public static boolean __Unify____sent_0_0(
    stanford2bel.Sent_0 HeadVar__1_1,
    stanford2bel.Sent_0 HeadVar__2_2)
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
          jmercury.runtime.TypeInfo_Struct TypeInfo_18_18 = null;
          int V_3_3 = ((stanford2bel.Sent_0) HeadVar__1_1).F1;
          java.lang.String V_4_4 = ((stanford2bel.Sent_0) HeadVar__1_1).F2;
          java.lang.String V_5_5 = ((stanford2bel.Sent_0) HeadVar__1_1).F3;
          java.lang.String V_6_6 = ((stanford2bel.Sent_0) HeadVar__1_1).F4;
          list.List_1 V_7_7 = ((stanford2bel.Sent_0) HeadVar__1_1).F5;
          list.List_1 V_8_8 = ((stanford2bel.Sent_0) HeadVar__1_1).F6;
          int V_9_9 = ((stanford2bel.Sent_0) HeadVar__2_2).F1;
          java.lang.String V_10_10 = ((stanford2bel.Sent_0) HeadVar__2_2).F2;
          java.lang.String V_11_11 = ((stanford2bel.Sent_0) HeadVar__2_2).F3;
          java.lang.String V_12_12 = ((stanford2bel.Sent_0) HeadVar__2_2).F4;
          list.List_1 V_13_13 = ((stanford2bel.Sent_0) HeadVar__2_2).F5;
          list.List_1 V_14_14 = ((stanford2bel.Sent_0) HeadVar__2_2).F6;

          succeeded = (V_3_3 == V_9_9);
          if (succeeded)
            {
              succeeded = V_4_4.equals(V_10_10);
              if (succeeded)
                {
                  succeeded = V_5_5.equals(V_11_11);
                  if (succeeded)
                    {
                      succeeded = V_6_6.equals(V_12_12);
                      if (succeeded)
                        {
                          TypeInfo_17_17 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[13]);
                          {
                            succeeded = builtin.unify_2_p_0(TypeInfo_17_17, ((java.lang.Object) (V_7_7)), ((java.lang.Object) (V_13_13)));
                          }
                          if (succeeded)
                            {
                              TypeInfo_18_18 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[14]);
                              {
                                succeeded = builtin.unify_2_p_0(TypeInfo_18_18, ((java.lang.Object) (V_8_8)), ((java.lang.Object) (V_14_14)));
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
//  stanford2bel.m:9
  public static builtin.Comparison_result_0 __Compare____semrel_0_0(
    stanford2bel.Semrel_0 HeadVar__2_2,
    stanford2bel.Semrel_0 HeadVar__3_3)
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
          int V_4_4 = ((stanford2bel.Semrel_0) HeadVar__2_2).F1;
          java.lang.String V_5_5 = ((stanford2bel.Semrel_0) HeadVar__2_2).F2;
          int V_6_6 = ((stanford2bel.Semrel_0) HeadVar__2_2).F3;
          int V_7_7 = ((stanford2bel.Semrel_0) HeadVar__3_3).F1;
          java.lang.String V_8_8 = ((stanford2bel.Semrel_0) HeadVar__3_3).F2;
          int V_9_9 = ((stanford2bel.Semrel_0) HeadVar__3_3).F3;
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
                  HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_6_6, V_9_9);
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____semrel_0_0(
    stanford2bel.Semrel_0 HeadVar__1_1,
    stanford2bel.Semrel_0 HeadVar__2_2)
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
          int V_3_3 = ((stanford2bel.Semrel_0) HeadVar__1_1).F1;
          java.lang.String V_4_4 = ((stanford2bel.Semrel_0) HeadVar__1_1).F2;
          int V_5_5 = ((stanford2bel.Semrel_0) HeadVar__1_1).F3;
          int V_6_6 = ((stanford2bel.Semrel_0) HeadVar__2_2).F1;
          java.lang.String V_7_7 = ((stanford2bel.Semrel_0) HeadVar__2_2).F2;
          int V_8_8 = ((stanford2bel.Semrel_0) HeadVar__2_2).F3;

          succeeded = (V_3_3 == V_6_6);
          if (succeeded)
            {
              succeeded = V_4_4.equals(V_7_7);
              if (succeeded)
                succeeded = (V_5_5 == V_8_8);
            }
        }
      return succeeded;
    }
  }
//  stanford2bel.m:18
  public static builtin.Comparison_result_0 __Compare____relmap_0_0(
    tree234.Tree234_2 HeadVar__2_2,
    tree234.Tree234_2 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[9]);
      tree234.Tree234_2 Cast_HeadVar1_4 = HeadVar__2_2;
      tree234.Tree234_2 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____relmap_0_0(
    tree234.Tree234_2 HeadVar__1_1,
    tree234.Tree234_2 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[9]);
      tree234.Tree234_2 Cast_HeadVar1_3 = HeadVar__1_1;
      tree234.Tree234_2 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  stanford2bel.m:22
  public static builtin.Comparison_result_0 __Compare____pos_0_0(
    stanford2bel.Pos_0 HeadVar__2_2,
    stanford2bel.Pos_0 HeadVar__3_3)
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
  public static boolean __Unify____pos_0_0(
    stanford2bel.Pos_0 HeadVar__2_1,
    stanford2bel.Pos_0 HeadVar__2_2)
  {
    {
      boolean succeeded = (HeadVar__2_1.MR_value == HeadVar__2_2.MR_value);

      return succeeded;
    }
  }
//  stanford2bel.m:25
  public static builtin.Comparison_result_0 __Compare____netp_0_0(
    stanford2bel.Netp_0 HeadVar__2_2,
    stanford2bel.Netp_0 HeadVar__3_3)
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
  public static boolean __Unify____netp_0_0(
    stanford2bel.Netp_0 HeadVar__2_1,
    stanford2bel.Netp_0 HeadVar__2_2)
  {
    {
      boolean succeeded = (HeadVar__2_1.MR_value == HeadVar__2_2.MR_value);

      return succeeded;
    }
  }
//  stanford2bel.m:27
  public static builtin.Comparison_result_0 __Compare____label_0_0(
    stanford2bel.Label_0 HeadVar__2_2,
    stanford2bel.Label_0 HeadVar__3_3)
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
  public static boolean __Unify____label_0_0(
    stanford2bel.Label_0 HeadVar__2_1,
    stanford2bel.Label_0 HeadVar__2_2)
  {
    {
      boolean succeeded = (HeadVar__2_1.MR_value == HeadVar__2_2.MR_value);

      return succeeded;
    }
  }
//  stanford2bel.m:34
  public static builtin.Comparison_result_0 __Compare____etp_0_0(
    stanford2bel.Etp_0 HeadVar__2_2,
    stanford2bel.Etp_0 HeadVar__3_3)
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
  public static boolean __Unify____etp_0_0(
    stanford2bel.Etp_0 HeadVar__2_1,
    stanford2bel.Etp_0 HeadVar__2_2)
  {
    {
      boolean succeeded = (HeadVar__2_1.MR_value == HeadVar__2_2.MR_value);

      return succeeded;
    }
  }
//  stanford2bel.m:20
  public static builtin.Comparison_result_0 __Compare____entmap_0_0(
    tree234.Tree234_2 HeadVar__2_2,
    tree234.Tree234_2 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[2]);
      tree234.Tree234_2 Cast_HeadVar1_4 = HeadVar__2_2;
      tree234.Tree234_2 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____entmap_0_0(
    tree234.Tree234_2 HeadVar__1_1,
    tree234.Tree234_2 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[2]);
      tree234.Tree234_2 Cast_HeadVar1_3 = HeadVar__1_1;
      tree234.Tree234_2 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  stanford2bel.m:21
  public static builtin.Comparison_result_0 __Compare____entity2_0_0(
    stanford2bel.Entity2_0 HeadVar__2_2,
    stanford2bel.Entity2_0 HeadVar__3_3)
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
          java.lang.String V_4_4 = ((stanford2bel.Entity2_0) HeadVar__2_2).F1;
          stanford2bel.Etp_0 V_5_5 = ((stanford2bel.Entity2_0) HeadVar__2_2).F2;
          java.lang.String V_6_6 = ((stanford2bel.Entity2_0) HeadVar__3_3).F1;
          stanford2bel.Etp_0 V_7_7 = ((stanford2bel.Entity2_0) HeadVar__3_3).F2;
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
              int V_13_13 = (int) V_5_5.MR_value;
              int V_14_14 = (int) V_7_7.MR_value;

              {
                HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_13_13, V_14_14);
              }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____entity2_0_0(
    stanford2bel.Entity2_0 HeadVar__1_1,
    stanford2bel.Entity2_0 HeadVar__2_2)
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
          java.lang.String V_3_3 = ((stanford2bel.Entity2_0) HeadVar__1_1).F1;
          stanford2bel.Etp_0 V_4_4 = ((stanford2bel.Entity2_0) HeadVar__1_1).F2;
          java.lang.String V_5_5 = ((stanford2bel.Entity2_0) HeadVar__2_2).F1;
          stanford2bel.Etp_0 V_6_6 = ((stanford2bel.Entity2_0) HeadVar__2_2).F2;

          succeeded = V_3_3.equals(V_5_5);
          if (succeeded)
            succeeded = (V_4_4.MR_value == V_6_6.MR_value);
        }
      return succeeded;
    }
  }
//  stanford2bel.m:10
  public static builtin.Comparison_result_0 __Compare____entity_0_0(
    stanford2bel.Entity_0 HeadVar__2_2,
    stanford2bel.Entity_0 HeadVar__3_3)
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
          int V_4_4 = ((stanford2bel.Entity_0) HeadVar__2_2).F1;
          java.lang.String V_5_5 = ((stanford2bel.Entity_0) HeadVar__2_2).F2;
          java.lang.String V_6_6 = ((stanford2bel.Entity_0) HeadVar__2_2).F3;
          list.List_1 V_7_7 = ((stanford2bel.Entity_0) HeadVar__2_2).F4;
          int V_8_8 = ((stanford2bel.Entity_0) HeadVar__3_3).F1;
          java.lang.String V_9_9 = ((stanford2bel.Entity_0) HeadVar__3_3).F2;
          java.lang.String V_10_10 = ((stanford2bel.Entity_0) HeadVar__3_3).F3;
          list.List_1 V_11_11 = ((stanford2bel.Entity_0) HeadVar__3_3).F4;
          builtin.Comparison_result_0 V_12_12 = null;

          {
            V_12_12 = private_builtin.builtin_compare_int_3_p_0(V_4_4, V_8_8);
          }
          succeeded = (V_12_12.MR_value == builtin.Comparison_result_0.K0.MR_value);
          succeeded = !(succeeded);
          if (succeeded)
            HeadVar__1_1 = V_12_12;
          else
            {
              builtin.Comparison_result_0 V_13_13 = null;

              {
                V_13_13 = private_builtin.builtin_compare_string_3_p_0(V_5_5, V_9_9);
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
                      jmercury.runtime.TypeInfo_Struct TypeInfo_20_20 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[12]);

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
  public static boolean __Unify____entity_0_0(
    stanford2bel.Entity_0 HeadVar__1_1,
    stanford2bel.Entity_0 HeadVar__2_2)
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
          int V_3_3 = ((stanford2bel.Entity_0) HeadVar__1_1).F1;
          java.lang.String V_4_4 = ((stanford2bel.Entity_0) HeadVar__1_1).F2;
          java.lang.String V_5_5 = ((stanford2bel.Entity_0) HeadVar__1_1).F3;
          list.List_1 V_6_6 = ((stanford2bel.Entity_0) HeadVar__1_1).F4;
          int V_7_7 = ((stanford2bel.Entity_0) HeadVar__2_2).F1;
          java.lang.String V_8_8 = ((stanford2bel.Entity_0) HeadVar__2_2).F2;
          java.lang.String V_9_9 = ((stanford2bel.Entity_0) HeadVar__2_2).F3;
          list.List_1 V_10_10 = ((stanford2bel.Entity_0) HeadVar__2_2).F4;

          succeeded = (V_3_3 == V_7_7);
          if (succeeded)
            {
              succeeded = V_4_4.equals(V_8_8);
              if (succeeded)
                {
                  succeeded = V_5_5.equals(V_9_9);
                  if (succeeded)
                    {
                      TypeInfo_13_13 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[12]);
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
//  stanford2bel.m:13
  public static builtin.Comparison_result_0 __Compare____eid_0_0(
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
  public static boolean __Unify____eid_0_0(
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
//  stanford2bel.m:284
  private static java.lang.Object tps_4_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      stanford2bel.Vertices_0 conv0_STATE_VARIABLE_Vs_26 = null;

      {
        conv0_STATE_VARIABLE_Vs_26 = stanford2bel.tps_4_p_0(((tree234.Tree234_2) ((java.lang.Object[]) closure)[3]), ((java.lang.Integer) wrapper_arg_1).intValue(), ((stanford2bel.Vertices_0) wrapper_arg_2));
      }
      wrapper_arg_3 = ((java.lang.Object) (conv0_STATE_VARIABLE_Vs_26));
      return wrapper_arg_3;
    }
  }
//  stanford2bel.m:272
  private static stanford2bel.Vertices_0 tps_4_p_0(
    tree234.Tree234_2 Rmap_5,
    int N0_6,
    stanford2bel.Vertices_0 STATE_VARIABLE_Vs_0_25)
  {
//  stanford2bel.m:274
    {
      boolean succeeded = false;
      stanford2bel.Vertices_0 STATE_VARIABLE_Vs_26 = null;
      set_ordlist.Set_ordlist_1 Ws0_8 = ((stanford2bel.Vertices_0) STATE_VARIABLE_Vs_0_25).F1;
      set_ordlist.Set_ordlist_1 Gs0_9 = ((stanford2bel.Vertices_0) STATE_VARIABLE_Vs_0_25).F2;
      list.List_1 Bs0_10 = ((stanford2bel.Vertices_0) STATE_VARIABLE_Vs_0_25).F3;
      list.List_1 Fs0_11 = ((stanford2bel.Vertices_0) STATE_VARIABLE_Vs_0_25).F4;
      stanford2bel.Vertices_0 STATE_VARIABLE_Vs_27_27 = null;
//  stanford2bel.m:279
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_39_39 = null;

//  stanford2bel.m:276
      succeeded = (Bs0_10.data_tag == 0);
//  stanford2bel.m:278
      if (succeeded)
//  stanford2bel.m:277
        STATE_VARIABLE_Vs_27_27 = STATE_VARIABLE_Vs_0_25;
//  stanford2bel.m:278
      else
        {
          list.List_1 V_29_29 = (list.List_1) stanford2bel.MR_scalar_common_3[0];
          list.List_1 V_30_30 = null;

          {
            V_30_30 = new list.List_1.F_cons_2(((java.lang.Object) (Bs0_10)), Fs0_11);
          }
          {
            STATE_VARIABLE_Vs_27_27 = new stanford2bel.Vertices_0(Ws0_8, Gs0_9, V_29_29, V_30_30);
          }
        }
      TypeCtorInfo_39_39 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
//  stanford2bel.m:279
      {
        succeeded = set.member_2_p_0(TypeCtorInfo_39_39, java.lang.Integer.valueOf(N0_6), Ws0_8);
      }
//  stanford2bel.m:287
      if (succeeded)
//  stanford2bel.m:280
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_40_40 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
          set_ordlist.Set_ordlist_1 Ws1_12 = ((stanford2bel.Vertices_0) STATE_VARIABLE_Vs_27_27).F1;
          set_ordlist.Set_ordlist_1 Gs1_13 = ((stanford2bel.Vertices_0) STATE_VARIABLE_Vs_27_27).F2;
          list.List_1 Bs1_14 = ((stanford2bel.Vertices_0) STATE_VARIABLE_Vs_27_27).F3;
          list.List_1 Fs1_15 = ((stanford2bel.Vertices_0) STATE_VARIABLE_Vs_27_27).F4;
          set_ordlist.Set_ordlist_1 Ws2_16 = null;
          set_ordlist.Set_ordlist_1 Gs2_17 = null;
          set_ordlist.Set_ordlist_1 Ws3_21 = null;
          set_ordlist.Set_ordlist_1 Gs3_22 = null;
          list.List_1 Bs3_23 = null;
          list.List_1 Fs3_24 = null;
          stanford2bel.Vertices_0 STATE_VARIABLE_Vs_31_31 = null;
          stanford2bel.Vertices_0 STATE_VARIABLE_Vs_35_35 = null;
          set_ordlist.Set_ordlist_1 V_37_37 = null;
          list.List_1 V_38_38 = null;
//  stanford2bel.m:285
          list.List_1 Ps_18 = null;
//  stanford2bel.m:282
          jmercury.runtime.TypeInfo_Struct TypeInfo_41_41 = null;

//  stanford2bel.m:280
          {
            Ws2_16 = set.delete_3_p_0(TypeCtorInfo_40_40, java.lang.Integer.valueOf(N0_6), Ws1_12);
          }
//  stanford2bel.m:281
          {
            Gs2_17 = set.insert_3_p_0(TypeCtorInfo_40_40, java.lang.Integer.valueOf(N0_6), Gs1_13);
          }
          {
            STATE_VARIABLE_Vs_31_31 = new stanford2bel.Vertices_0(Ws2_16, Gs2_17, Bs1_14, Fs1_15);
          }
          TypeInfo_41_41 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[7]);
//  stanford2bel.m:282
          {
            java.lang.Object [] result = multi_map.search_3_p_0(TypeCtorInfo_40_40, TypeInfo_41_41, Rmap_5, java.lang.Integer.valueOf(N0_6));
            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
            Ps_18 = (list.List_1) result[1];
          }
//  stanford2bel.m:285
          if (succeeded)
//  stanford2bel.m:283
            {
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_42_42 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_label_0);
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_46_46 = null;
              list.List_1 Xs_19 = null;
              set_ordlist.Set_ordlist_1 Ns_20 = null;
              set_ordlist.Set_ordlist_1 V_32_32 = null;
              /* closure */ java.lang.Object[] V_33_33 = null;
              list.List_1 V_34_34 = null;
//  stanford2bel.m:284
              java.lang.Object conv1_STATE_VARIABLE_Vs_35_35 = null;

//  stanford2bel.m:283
              {
                Xs_19 = assoc_list.values_2_p_0(TypeCtorInfo_42_42, TypeCtorInfo_40_40, Ps_18);
              }
              {
                V_32_32 = set.set_1_f_0(TypeCtorInfo_40_40, Xs_19);
              }
              {
                Ns_20 = set.intersect_3_p_0(TypeCtorInfo_40_40, Ws1_12, V_32_32);
              }
//  stanford2bel.m:284
              {
                V_33_33 = new /* closure */ java.lang.Object[] {((java.lang.Object) (stanford2bel.MR_scalar_common_7[0])), ((java.lang.Object) (new AddrOf3_0(0))), java.lang.Integer.valueOf(1), ((java.lang.Object) (Rmap_5))};
              }
              {
                V_34_34 = set.to_sorted_list_1_f_0(TypeCtorInfo_40_40, Ns_20);
              }
              TypeCtorInfo_46_46 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_vertices_0);
              {
                conv1_STATE_VARIABLE_Vs_35_35 = list.foldl_4_p_0(TypeCtorInfo_40_40, TypeCtorInfo_46_46, V_33_33, V_34_34, ((java.lang.Object) (STATE_VARIABLE_Vs_31_31)));
              }
              STATE_VARIABLE_Vs_35_35 = ((stanford2bel.Vertices_0) conv1_STATE_VARIABLE_Vs_35_35);
//  stanford2bel.m:283
            }
//  stanford2bel.m:285
          else
//  stanford2bel.m:284
            STATE_VARIABLE_Vs_35_35 = STATE_VARIABLE_Vs_31_31;
//  stanford2bel.m:286
          Ws3_21 = ((stanford2bel.Vertices_0) STATE_VARIABLE_Vs_35_35).F1;
          Gs3_22 = ((stanford2bel.Vertices_0) STATE_VARIABLE_Vs_35_35).F2;
          Bs3_23 = ((stanford2bel.Vertices_0) STATE_VARIABLE_Vs_35_35).F3;
          Fs3_24 = ((stanford2bel.Vertices_0) STATE_VARIABLE_Vs_35_35).F4;
          {
            V_37_37 = set.delete_2_f_0(TypeCtorInfo_40_40, Gs3_22, java.lang.Integer.valueOf(N0_6));
          }
          {
            V_38_38 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(N0_6), Bs3_23);
          }
          {
            STATE_VARIABLE_Vs_26 = new stanford2bel.Vertices_0(Ws3_21, V_37_37, V_38_38, Fs3_24);
          }
//  stanford2bel.m:280
        }
//  stanford2bel.m:287
      else
//  stanford2bel.m:286
        STATE_VARIABLE_Vs_26 = STATE_VARIABLE_Vs_27_27;
//  stanford2bel.m:274
      return STATE_VARIABLE_Vs_26;
    }
//  stanford2bel.m:272
  }
//  stanford2bel.m:260
  private static list.List_1 dummy_prop_7_p_0(
    sberrs.Prmode_0 HeadVar__1_1,
    int Tn_2,
    int Tk_3,
    java.lang.String Spk_4,
    java.lang.String Wd_5,
    list.List_1 STATE_VARIABLE_Props_0_6)
  {
//  stanford2bel.m:262
    {
      boolean succeeded = false;
      list.List_1 STATE_VARIABLE_Props_7 = null;

      switch (HeadVar__1_1.MR_value) {
        case 1:
          {
            stanford2bel.Stprop_0 V_16_16 = null;
            beliefs.Proposition_0 V_17_17 = null;
            java.lang.String V_18_18 = "??";

//  stanford2bel.m:263
            {
              V_17_17 = new beliefs.Proposition_0.Copula_2(Wd_5, V_18_18);
            }
            {
              V_16_16 = new stanford2bel.Stprop_0(Tn_2, Tk_3, Spk_4, V_17_17);
            }
            {
              STATE_VARIABLE_Props_7 = new list.List_1.F_cons_2(((java.lang.Object) (V_16_16)), STATE_VARIABLE_Props_0_6);
            }
//  stanford2bel.m:262
          }
          break;
        case 0:
//  stanford2bel.m:264
          STATE_VARIABLE_Props_7 = STATE_VARIABLE_Props_0_6;
//  stanford2bel.m:262
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
      return STATE_VARIABLE_Props_7;
    }
//  stanford2bel.m:260
  }
//  stanford2bel.m:247
  private static java.lang.Object [] verb_prop_3_p_0(
    java.lang.String Pred_4,
    list.List_1 Ps_5)
  {
//  stanford2bel.m:256
    {
      boolean succeeded = false;
      beliefs.Proposition_0 Prop_6 = null;
      java.lang.String Subj_8 = null;
//  stanford2bel.m:250
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_43_43 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_label_0);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_44_44 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_tempexpr_0);
      stanford2bel.Label_0 V_27_27 = stanford2bel.Label_0.K9;
      stanford2bel.Tempexpr_0 V_28_28 = null;
      java.lang.Object conv0_V_28_28 = null;
      stanford2bel.Wdtp_0 V_7_7 = null;
      stanford2bel.Netp_0 V_9_9 = null;
      maybe.Maybe_1 V_10_10 = null;

      {
        java.lang.Object [] result = assoc_list.search_3_p_0(TypeCtorInfo_43_43, TypeCtorInfo_44_44, Ps_5, ((java.lang.Object) (V_27_27)));
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        conv0_V_28_28 = (java.lang.Object) result[1];
      }
      if (succeeded)
        {
          V_28_28 = ((stanford2bel.Tempexpr_0) conv0_V_28_28);
          succeeded = true;
        }
      if (succeeded)
        {
          succeeded = (V_28_28.data_tag == 1);
          if (succeeded)
            {
              V_7_7 = ((stanford2bel.Tempexpr_0.Nd_4) V_28_28).F1;
              Subj_8 = ((stanford2bel.Tempexpr_0.Nd_4) V_28_28).F2;
              V_9_9 = ((stanford2bel.Tempexpr_0.Nd_4) V_28_28).F3;
              V_10_10 = ((stanford2bel.Tempexpr_0.Nd_4) V_28_28).F4;
            }
        }
//  stanford2bel.m:256
      if (succeeded)
//  stanford2bel.m:252
        {
          java.lang.String Obj_12 = null;
//  stanford2bel.m:251
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_45_45 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_label_0);
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_46_46 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_tempexpr_0);
          stanford2bel.Label_0 V_29_29 = stanford2bel.Label_0.K15;
          stanford2bel.Tempexpr_0 V_30_30 = null;
          java.lang.Object conv1_V_30_30 = null;
          stanford2bel.Wdtp_0 V_11_11 = null;
          stanford2bel.Netp_0 V_13_13 = null;
          maybe.Maybe_1 V_14_14 = null;

          {
            java.lang.Object [] result = assoc_list.search_3_p_0(TypeCtorInfo_45_45, TypeCtorInfo_46_46, Ps_5, ((java.lang.Object) (V_29_29)));
            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
            conv1_V_30_30 = (java.lang.Object) result[1];
          }
          if (succeeded)
            {
              V_30_30 = ((stanford2bel.Tempexpr_0) conv1_V_30_30);
              succeeded = true;
            }
          if (succeeded)
            {
              succeeded = (V_30_30.data_tag == 1);
              if (succeeded)
                {
                  V_11_11 = ((stanford2bel.Tempexpr_0.Nd_4) V_30_30).F1;
                  Obj_12 = ((stanford2bel.Tempexpr_0.Nd_4) V_30_30).F2;
                  V_13_13 = ((stanford2bel.Tempexpr_0.Nd_4) V_30_30).F3;
                  V_14_14 = ((stanford2bel.Tempexpr_0.Nd_4) V_30_30).F4;
                }
            }
//  stanford2bel.m:252
          if (succeeded)
//  stanford2bel.m:251
            {
              Prop_6 = new beliefs.Proposition_0.Pred_3(Subj_8, Pred_4, Obj_12);
            }
//  stanford2bel.m:252
          else
//  stanford2bel.m:253
            {
              java.lang.String Obj_41 = null;
//  stanford2bel.m:252
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_47_47 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_label_0);
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_48_48 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_tempexpr_0);
              stanford2bel.Label_0 V_31_31 = stanford2bel.Label_0.K20;
              stanford2bel.Tempexpr_0 V_32_32 = null;
              java.lang.Object conv2_V_32_32 = null;
              stanford2bel.Wdtp_0 V_15_15 = null;
              stanford2bel.Netp_0 V_16_16 = null;
              maybe.Maybe_1 V_17_17 = null;

              {
                java.lang.Object [] result = assoc_list.search_3_p_0(TypeCtorInfo_47_47, TypeCtorInfo_48_48, Ps_5, ((java.lang.Object) (V_31_31)));
                succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                conv2_V_32_32 = (java.lang.Object) result[1];
              }
              if (succeeded)
                {
                  V_32_32 = ((stanford2bel.Tempexpr_0) conv2_V_32_32);
                  succeeded = true;
                }
              if (succeeded)
                {
                  succeeded = (V_32_32.data_tag == 1);
                  if (succeeded)
                    {
                      V_15_15 = ((stanford2bel.Tempexpr_0.Nd_4) V_32_32).F1;
                      Obj_41 = ((stanford2bel.Tempexpr_0.Nd_4) V_32_32).F2;
                      V_16_16 = ((stanford2bel.Tempexpr_0.Nd_4) V_32_32).F3;
                      V_17_17 = ((stanford2bel.Tempexpr_0.Nd_4) V_32_32).F4;
                    }
                }
//  stanford2bel.m:253
              if (succeeded)
//  stanford2bel.m:252
                {
                  Prop_6 = new beliefs.Proposition_0.Pred_3(Subj_8, Pred_4, Obj_41);
                }
//  stanford2bel.m:253
              else
//  stanford2bel.m:254
                {
                  java.lang.String Obj_40 = null;
//  stanford2bel.m:253
                  jmercury.runtime.TypeInfo_Struct TypeCtorInfo_49_49 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_label_0);
                  jmercury.runtime.TypeInfo_Struct TypeCtorInfo_50_50 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_tempexpr_0);
                  stanford2bel.Label_0 V_33_33 = stanford2bel.Label_0.K25;
                  stanford2bel.Tempexpr_0 V_34_34 = null;
                  java.lang.Object conv3_V_34_34 = null;
                  stanford2bel.Wdtp_0 V_18_18 = null;
                  stanford2bel.Netp_0 V_19_19 = null;
                  maybe.Maybe_1 V_20_20 = null;

                  {
                    java.lang.Object [] result = assoc_list.search_3_p_0(TypeCtorInfo_49_49, TypeCtorInfo_50_50, Ps_5, ((java.lang.Object) (V_33_33)));
                    succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                    conv3_V_34_34 = (java.lang.Object) result[1];
                  }
                  if (succeeded)
                    {
                      V_34_34 = ((stanford2bel.Tempexpr_0) conv3_V_34_34);
                      succeeded = true;
                    }
                  if (succeeded)
                    {
                      succeeded = (V_34_34.data_tag == 1);
                      if (succeeded)
                        {
                          V_18_18 = ((stanford2bel.Tempexpr_0.Nd_4) V_34_34).F1;
                          Obj_40 = ((stanford2bel.Tempexpr_0.Nd_4) V_34_34).F2;
                          V_19_19 = ((stanford2bel.Tempexpr_0.Nd_4) V_34_34).F3;
                          V_20_20 = ((stanford2bel.Tempexpr_0.Nd_4) V_34_34).F4;
                        }
                    }
//  stanford2bel.m:254
                  if (succeeded)
//  stanford2bel.m:253
                    {
                      Prop_6 = new beliefs.Proposition_0.Pred_3(Subj_8, Pred_4, Obj_40);
                    }
//  stanford2bel.m:254
                  else
//  stanford2bel.m:255
                    {
                      java.lang.String Obj_39 = null;
//  stanford2bel.m:254
                      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_51_51 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_label_0);
                      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_52_52 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_tempexpr_0);
                      stanford2bel.Label_0 V_35_35 = stanford2bel.Label_0.K49;
                      stanford2bel.Tempexpr_0 V_36_36 = null;
                      java.lang.Object conv4_V_36_36 = null;
                      stanford2bel.Wdtp_0 V_21_21 = null;
                      stanford2bel.Netp_0 V_22_22 = null;
                      maybe.Maybe_1 V_23_23 = null;

                      {
                        java.lang.Object [] result = assoc_list.search_3_p_0(TypeCtorInfo_51_51, TypeCtorInfo_52_52, Ps_5, ((java.lang.Object) (V_35_35)));
                        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                        conv4_V_36_36 = (java.lang.Object) result[1];
                      }
                      if (succeeded)
                        {
                          V_36_36 = ((stanford2bel.Tempexpr_0) conv4_V_36_36);
                          succeeded = true;
                        }
                      if (succeeded)
                        {
                          succeeded = (V_36_36.data_tag == 1);
                          if (succeeded)
                            {
                              V_21_21 = ((stanford2bel.Tempexpr_0.Nd_4) V_36_36).F1;
                              Obj_39 = ((stanford2bel.Tempexpr_0.Nd_4) V_36_36).F2;
                              V_22_22 = ((stanford2bel.Tempexpr_0.Nd_4) V_36_36).F3;
                              V_23_23 = ((stanford2bel.Tempexpr_0.Nd_4) V_36_36).F4;
                            }
                        }
//  stanford2bel.m:255
                      if (succeeded)
//  stanford2bel.m:254
                        {
                          Prop_6 = new beliefs.Proposition_0.Pred_3(Subj_8, Pred_4, Obj_39);
                        }
//  stanford2bel.m:255
                      else
                        {
                          Prop_6 = new beliefs.Proposition_0.Copula_2(Subj_8, Pred_4);
                        }
                    }
//  stanford2bel.m:254
                }
//  stanford2bel.m:253
            }
//  stanford2bel.m:252
          succeeded = true;
        }
//  stanford2bel.m:256
      else
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_53_53 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_label_0);
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_54_54 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_tempexpr_0);
          stanford2bel.Label_0 V_37_37 = stanford2bel.Label_0.K15;
          stanford2bel.Tempexpr_0 V_38_38 = null;
          java.lang.String Obj_42 = null;
          java.lang.Object conv5_V_38_38 = null;
          stanford2bel.Wdtp_0 V_24_24 = null;
          stanford2bel.Netp_0 V_25_25 = null;
          maybe.Maybe_1 V_26_26 = null;

          {
            java.lang.Object [] result = assoc_list.search_3_p_0(TypeCtorInfo_53_53, TypeCtorInfo_54_54, Ps_5, ((java.lang.Object) (V_37_37)));
            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
            conv5_V_38_38 = (java.lang.Object) result[1];
          }
          if (succeeded)
            {
              V_38_38 = ((stanford2bel.Tempexpr_0) conv5_V_38_38);
              succeeded = true;
            }
          if (succeeded)
            {
              succeeded = (V_38_38.data_tag == 1);
              if (succeeded)
                {
                  V_24_24 = ((stanford2bel.Tempexpr_0.Nd_4) V_38_38).F1;
                  Obj_42 = ((stanford2bel.Tempexpr_0.Nd_4) V_38_38).F2;
                  V_25_25 = ((stanford2bel.Tempexpr_0.Nd_4) V_38_38).F3;
                  V_26_26 = ((stanford2bel.Tempexpr_0.Nd_4) V_38_38).F4;
                  {
                    Prop_6 = new beliefs.Proposition_0.Copula_2(Pred_4, Obj_42);
                  }
                  succeeded = true;
                }
            }
        }
return new java.lang.Object[] {
        java.lang.Boolean.valueOf(succeeded),
        ((java.lang.Object) (Prop_6))
      };
    }
//  stanford2bel.m:247
  }
//  stanford2bel.m:210
  private static boolean nonterminal_12_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1)
  {
    {
      boolean succeeded = false;
      /* generic_type */ java.lang.Object closure = closure_arg;

      {
        succeeded = stanford2bel.IntroducedFrom__pred__nonterminal__210__1_1_p_0(((pair.Pair_2) wrapper_arg_1));
      }
      return succeeded;
    }
  }
//  stanford2bel.m:207
  private static java.lang.Object [] nonterminal_12_p_0(
    sberrs.Prmode_0 Md_1,
    int Tn_2,
    int Tk_3,
    java.lang.String Spk_4,
    java.lang.String HeadVar__5_5,
    stanford2bel.Wtype_0 HeadVar__6_6,
    stanford2bel.Netp_0 NE_7,
    maybe.Maybe_1 Mb_8,
    list.List_1 HeadVar__9_9,
    list.List_1 STATE_VARIABLE_Props_0_11)
  {
//  stanford2bel.m:209
    {
      boolean succeeded = false;
      stanford2bel.Tempexpr_0 HeadVar__10_10 = null;
      list.List_1 STATE_VARIABLE_Props_12 = null;

      switch (HeadVar__6_6.MR_value) {
        case 4:
//  stanford2bel.m:223
          {
            list.List_1 STATE_VARIABLE_Props_71_71 = null;
            stanford2bel.Wdtp_0 V_75_75 = null;

//  stanford2bel.m:224
            succeeded = (Md_1.MR_value == sberrs.Prmode_0.K0.MR_value);
//  stanford2bel.m:229
            if (succeeded)
//  stanford2bel.m:228
              {
                java.lang.String Subj_61 = null;
//  stanford2bel.m:225
                jmercury.runtime.TypeInfo_Struct TypeCtorInfo_129_129 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_label_0);
                jmercury.runtime.TypeInfo_Struct TypeCtorInfo_130_130 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_tempexpr_0);
                stanford2bel.Label_0 V_66_66 = stanford2bel.Label_0.K3;
                stanford2bel.Tempexpr_0 V_67_67 = (stanford2bel.Tempexpr_0) stanford2bel.MR_scalar_common_13[1];
                stanford2bel.Tmtp_0 V_68_68 = (stanford2bel.Tmtp_0) stanford2bel.MR_scalar_common_14[0];
                stanford2bel.Label_0 V_69_69 = null;
                stanford2bel.Tempexpr_0 V_70_70 = null;
                stanford2bel.Tempexpr_0 V_131_131 = null;
                java.lang.Object conv0_V_131_131 = null;
//  stanford2bel.m:226
                java.lang.Object conv1_V_70_70 = null;
                stanford2bel.Wdtp_0 V_60_60 = null;
                stanford2bel.Netp_0 V_62_62 = null;
                maybe.Maybe_1 V_63_63 = null;

//  stanford2bel.m:225
                {
                  java.lang.Object [] result = assoc_list.search_3_p_0(TypeCtorInfo_129_129, TypeCtorInfo_130_130, HeadVar__9_9, ((java.lang.Object) (V_66_66)));
                  succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                  conv0_V_131_131 = (java.lang.Object) result[1];
                }
                if (succeeded)
                  {
                    V_131_131 = ((stanford2bel.Tempexpr_0) conv0_V_131_131);
                    succeeded = true;
                  }
                if (succeeded)
                  {
                    {
                      succeeded = stanford2bel.__Unify____tempexpr_0_0(V_67_67, V_131_131);
                    }
                    if (succeeded)
                      {
//  stanford2bel.m:226
                        V_69_69 = stanford2bel.Label_0.K9;
                        {
                          java.lang.Object [] result = assoc_list.search_3_p_0(TypeCtorInfo_129_129, TypeCtorInfo_130_130, HeadVar__9_9, ((java.lang.Object) (V_69_69)));
                          succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                          conv1_V_70_70 = (java.lang.Object) result[1];
                        }
                        if (succeeded)
                          {
                            V_70_70 = ((stanford2bel.Tempexpr_0) conv1_V_70_70);
                            succeeded = true;
                          }
//  stanford2bel.m:225
                        if (succeeded)
                          {
//  stanford2bel.m:226
                            succeeded = (V_70_70.data_tag == 1);
                            if (succeeded)
                              {
                                V_60_60 = ((stanford2bel.Tempexpr_0.Nd_4) V_70_70).F1;
                                Subj_61 = ((stanford2bel.Tempexpr_0.Nd_4) V_70_70).F2;
                                V_62_62 = ((stanford2bel.Tempexpr_0.Nd_4) V_70_70).F3;
                                V_63_63 = ((stanford2bel.Tempexpr_0.Nd_4) V_70_70).F4;
                              }
//  stanford2bel.m:225
                          }
                      }
                  }
//  stanford2bel.m:228
                if (succeeded)
//  stanford2bel.m:227
                  {
                    stanford2bel.Stprop_0 V_72_72 = null;
                    beliefs.Proposition_0 V_73_73 = null;

                    {
                      V_73_73 = new beliefs.Proposition_0.Copula_2(HeadVar__5_5, Subj_61);
                    }
                    {
                      V_72_72 = new stanford2bel.Stprop_0(Tn_2, Tk_3, Spk_4, V_73_73);
                    }
                    {
                      STATE_VARIABLE_Props_71_71 = new list.List_1.F_cons_2(((java.lang.Object) (V_72_72)), STATE_VARIABLE_Props_0_11);
                    }
                  }
//  stanford2bel.m:228
                else
//  stanford2bel.m:227
                  STATE_VARIABLE_Props_71_71 = STATE_VARIABLE_Props_0_11;
//  stanford2bel.m:228
              }
//  stanford2bel.m:229
            else
//  stanford2bel.m:227
              STATE_VARIABLE_Props_71_71 = STATE_VARIABLE_Props_0_11;
//  stanford2bel.m:230
            {
              STATE_VARIABLE_Props_12 = stanford2bel.dummy_prop_7_p_0(Md_1, Tn_2, Tk_3, Spk_4, HeadVar__5_5, STATE_VARIABLE_Props_71_71);
            }
//  stanford2bel.m:231
            V_75_75 = stanford2bel.Wdtp_0.K1;
            {
              HeadVar__10_10 = new stanford2bel.Tempexpr_0.Nd_4(V_75_75, HeadVar__5_5, NE_7, Mb_8);
            }
//  stanford2bel.m:223
          }
//  stanford2bel.m:209
          break;
        case 3:
//  stanford2bel.m:244
          {
            HeadVar__10_10 = (stanford2bel.Tempexpr_0) stanford2bel.MR_scalar_common_17[0];
            STATE_VARIABLE_Props_12 = STATE_VARIABLE_Props_0_11;
          }
//  stanford2bel.m:209
          break;
        case 5:
//  stanford2bel.m:241
          {
//  stanford2bel.m:242
            stanford2bel.Tempexpr_0 X_112 = null;
            pair.Pair_2 V_115_115 = null;
            list.List_1 V_116_116 = null;
            stanford2bel.Label_0 V_111_111 = null;

            succeeded = (HeadVar__9_9.data_tag == 1);
            if (succeeded)
              {
                V_115_115 = ((pair.Pair_2) ((list.List_1.F_cons_2) HeadVar__9_9).F1);
                V_116_116 = ((list.List_1.F_cons_2) HeadVar__9_9).F2;
                V_111_111 = ((stanford2bel.Label_0) ((pair.Pair_2) V_115_115).F1);
                X_112 = ((stanford2bel.Tempexpr_0) ((pair.Pair_2) V_115_115).F2);
                succeeded = (V_116_116.data_tag == 0);
              }
            if (succeeded)
              HeadVar__10_10 = X_112;
            else
              HeadVar__10_10 = (stanford2bel.Tempexpr_0) stanford2bel.MR_scalar_common_17[0];
//  stanford2bel.m:241
            STATE_VARIABLE_Props_12 = STATE_VARIABLE_Props_0_11;
          }
//  stanford2bel.m:209
          break;
        case 1:
//  stanford2bel.m:219
          {
            stanford2bel.Wdtp_0 V_49_49 = null;

//  stanford2bel.m:220
            {
              STATE_VARIABLE_Props_12 = stanford2bel.dummy_prop_7_p_0(Md_1, Tn_2, Tk_3, Spk_4, HeadVar__5_5, STATE_VARIABLE_Props_0_11);
            }
//  stanford2bel.m:221
            V_49_49 = stanford2bel.Wdtp_0.K0;
            {
              HeadVar__10_10 = new stanford2bel.Tempexpr_0.Nd_4(V_49_49, HeadVar__5_5, NE_7, Mb_8);
            }
//  stanford2bel.m:219
          }
//  stanford2bel.m:209
          break;
        case 2:
//  stanford2bel.m:233
          {
//  stanford2bel.m:234
            succeeded = (Md_1.MR_value == sberrs.Prmode_0.K0.MR_value);
//  stanford2bel.m:238
            if (succeeded)
//  stanford2bel.m:237
              {
                java.lang.String Noun_86 = null;
                stanford2bel.Netp_0 NE_87 = null;
                maybe.Maybe_1 Mb_88 = null;
//  stanford2bel.m:235
                pair.Pair_2 V_91_91 = null;
                stanford2bel.Label_0 V_92_92 = null;
                stanford2bel.Tempexpr_0 V_93_93 = null;
                stanford2bel.Wdtp_0 V_94_94 = null;
                list.List_1 V_95_95 = null;

                succeeded = (HeadVar__9_9.data_tag == 1);
                if (succeeded)
                  {
                    V_91_91 = ((pair.Pair_2) ((list.List_1.F_cons_2) HeadVar__9_9).F1);
                    V_95_95 = ((list.List_1.F_cons_2) HeadVar__9_9).F2;
                    V_92_92 = ((stanford2bel.Label_0) ((pair.Pair_2) V_91_91).F1);
                    V_93_93 = ((stanford2bel.Tempexpr_0) ((pair.Pair_2) V_91_91).F2);
                    succeeded = (V_92_92.MR_value == stanford2bel.Label_0.K17.MR_value);
                    if (succeeded)
                      {
                        succeeded = (V_93_93.data_tag == 1);
                        if (succeeded)
                          {
                            V_94_94 = ((stanford2bel.Tempexpr_0.Nd_4) V_93_93).F1;
                            Noun_86 = ((stanford2bel.Tempexpr_0.Nd_4) V_93_93).F2;
                            NE_87 = ((stanford2bel.Tempexpr_0.Nd_4) V_93_93).F3;
                            Mb_88 = ((stanford2bel.Tempexpr_0.Nd_4) V_93_93).F4;
                            succeeded = (V_94_94.MR_value == stanford2bel.Wdtp_0.K0.MR_value);
                            if (succeeded)
                              succeeded = (V_95_95.data_tag == 0);
                          }
                      }
                  }
//  stanford2bel.m:237
                if (succeeded)
//  stanford2bel.m:236
                  {
                    stanford2bel.Wdtp_0 V_96_96 = stanford2bel.Wdtp_0.K2;
                    java.lang.String V_97_97 = null;
                    java.lang.String V_98_98 = null;
                    java.lang.String V_99_99 = " ";

                    {
                      V_98_98 = string.f_43_43_2_f_0(V_99_99, Noun_86);
                    }
                    {
                      V_97_97 = string.f_43_43_2_f_0(HeadVar__5_5, V_98_98);
                    }
                    {
                      HeadVar__10_10 = new stanford2bel.Tempexpr_0.Nd_4(V_96_96, V_97_97, NE_87, Mb_88);
                    }
                  }
//  stanford2bel.m:237
                else
                  HeadVar__10_10 = (stanford2bel.Tempexpr_0) stanford2bel.MR_scalar_common_17[0];
              }
//  stanford2bel.m:238
            else
              HeadVar__10_10 = (stanford2bel.Tempexpr_0) stanford2bel.MR_scalar_common_17[0];
//  stanford2bel.m:239
            {
              STATE_VARIABLE_Props_12 = stanford2bel.dummy_prop_7_p_0(Md_1, Tn_2, Tk_3, Spk_4, HeadVar__5_5, STATE_VARIABLE_Props_0_11);
            }
//  stanford2bel.m:233
          }
//  stanford2bel.m:209
          break;
        case 0:
          {
            jmercury.runtime.TypeInfo_Struct TypeInfo_128_128 = null;
            list.List_1 Pairs_26 = null;
            /* closure */ java.lang.Object[] V_30_30 = null;
            list.List_1 STATE_VARIABLE_Props_32_32 = null;
//  stanford2bel.m:210
            list.List_1 _AuxPs_25 = null;

//  stanford2bel.m:209
            HeadVar__10_10 = (stanford2bel.Tempexpr_0) stanford2bel.MR_scalar_common_17[0];
//  stanford2bel.m:210
            V_30_30 = (/* closure */ java.lang.Object[]) stanford2bel.MR_scalar_common_19[0];
            TypeInfo_128_128 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[10]);
            {
              java.lang.Object [] result = list.filter_4_p_0(TypeInfo_128_128, V_30_30, HeadVar__9_9);
              _AuxPs_25 = (list.List_1) result[0];
              Pairs_26 = (list.List_1) result[1];
            }
//  stanford2bel.m:212
            succeeded = (Md_1.MR_value == sberrs.Prmode_0.K0.MR_value);
//  stanford2bel.m:216
            if (succeeded)
//  stanford2bel.m:215
              {
                beliefs.Proposition_0 Prop_27 = null;

//  stanford2bel.m:213
                {
                  java.lang.Object [] result = stanford2bel.verb_prop_3_p_0(HeadVar__5_5, Pairs_26);
                  succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                  Prop_27 = (beliefs.Proposition_0) result[1];
                }
//  stanford2bel.m:215
                if (succeeded)
//  stanford2bel.m:214
                  {
                    stanford2bel.Stprop_0 V_33_33 = null;

                    {
                      V_33_33 = new stanford2bel.Stprop_0(Tn_2, Tk_3, Spk_4, Prop_27);
                    }
                    {
                      STATE_VARIABLE_Props_32_32 = new list.List_1.F_cons_2(((java.lang.Object) (V_33_33)), STATE_VARIABLE_Props_0_11);
                    }
                  }
//  stanford2bel.m:215
                else
//  stanford2bel.m:214
                  STATE_VARIABLE_Props_32_32 = STATE_VARIABLE_Props_0_11;
//  stanford2bel.m:215
              }
//  stanford2bel.m:216
            else
//  stanford2bel.m:214
              STATE_VARIABLE_Props_32_32 = STATE_VARIABLE_Props_0_11;
//  stanford2bel.m:217
            {
              STATE_VARIABLE_Props_12 = stanford2bel.dummy_prop_7_p_0(Md_1, Tn_2, Tk_3, Spk_4, HeadVar__5_5, STATE_VARIABLE_Props_32_32);
            }
//  stanford2bel.m:209
          }
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
return new java.lang.Object[] {
        ((java.lang.Object) (HeadVar__10_10)),
        ((java.lang.Object) (STATE_VARIABLE_Props_12))
      };
    }
//  stanford2bel.m:207
  }
//  stanford2bel.m:198
  private static boolean terminal_4_p_0(
    java.lang.String HeadVar__1_1,
    stanford2bel.Pos_0 HeadVar__2_2,
    stanford2bel.Wtype_0 HeadVar__3_3,
    stanford2bel.Tmtp_0 HeadVar__4_4)
  {
//  stanford2bel.m:199
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
          result_3 = (HeadVar__1_1.compareTo(((stanford2bel.Vector_common_type_6_0) (MR_vector_common_6[120 + mid_2])).vct_6_f_0)) ;
          if ((result_3 == 0))
            {
              switch (((stanford2bel.Vector_common_type_6_0) (MR_vector_common_6[120 + mid_2])).vct_6_f_1) {
                case 0:
                  {
                    /* case "be" */
                    succeeded = (HeadVar__2_2.MR_value == stanford2bel.Pos_0.K26.MR_value);
                    if (succeeded)
                      succeeded = (HeadVar__4_4.data_tag == 3);
                  }
                  break;
                case 1:
//  stanford2bel.m:201
                  {
                    /* case "do" */
                    succeeded = (HeadVar__3_3.MR_value == stanford2bel.Wtype_0.K0.MR_value);
                    if (succeeded)
                      succeeded = (HeadVar__4_4.data_tag == 0);
                  }
//  stanford2bel.m:199
                  break;
                case 2:
//  stanford2bel.m:200
                  {
                    /* case "is" */
                    succeeded = (HeadVar__2_2.MR_value == stanford2bel.Pos_0.K31.MR_value);
                    if (succeeded)
                      succeeded = (HeadVar__4_4.data_tag == 3);
                  }
//  stanford2bel.m:199
                  break;
                case 3:
//  stanford2bel.m:203
                  {
                    /* case "n't" */
                    succeeded = (HeadVar__2_2.MR_value == stanford2bel.Pos_0.K19.MR_value);
                    if (succeeded)
                      succeeded = (HeadVar__4_4.data_tag == 1);
                  }
//  stanford2bel.m:199
                  break;
                case 4:
//  stanford2bel.m:202
                  {
                    /* case "not" */
                    succeeded = (HeadVar__2_2.MR_value == stanford2bel.Pos_0.K19.MR_value);
                    if (succeeded)
                      succeeded = (HeadVar__4_4.data_tag == 1);
                  }
//  stanford2bel.m:199
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
//  stanford2bel.m:198
  }
//  stanford2bel.m:176
  private static java.lang.Object [] stprops_11_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_3,
    java.lang.Object wrapper_arg_5)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      java.lang.Object wrapper_arg_4 = null;
      java.lang.Object wrapper_arg_6 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      pair.Pair_2 conv3_HeadVar__7_47 = null;
      list.List_1 conv2_HeadVar__9_49 = null;
      list.List_1 conv1_HeadVar__11_51 = null;

      {
        java.lang.Object [] result = stanford2bel.IntroducedFrom__pred__stprops__176__1_11_p_0(((sberrs.Prmode_0) ((java.lang.Object[]) closure)[3]), ((java.lang.Integer) (((java.lang.Object[]) closure)[4])).intValue(), ((java.lang.String) ((java.lang.Object[]) closure)[5]), ((tree234.Tree234_2) ((java.lang.Object[]) closure)[6]), ((tree234.Tree234_2) ((java.lang.Object[]) closure)[7]), ((pair.Pair_2) wrapper_arg_1), ((list.List_1) wrapper_arg_3), ((list.List_1) wrapper_arg_5));
        conv3_HeadVar__7_47 = (pair.Pair_2) result[0];
        conv2_HeadVar__9_49 = (list.List_1) result[1];
        conv1_HeadVar__11_51 = (list.List_1) result[2];
      }
      wrapper_arg_2 = ((java.lang.Object) (conv3_HeadVar__7_47));
      wrapper_arg_4 = ((java.lang.Object) (conv2_HeadVar__9_49));
      wrapper_arg_6 = ((java.lang.Object) (conv1_HeadVar__11_51));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_2)),
        ((java.lang.Object) (wrapper_arg_4)),
        ((java.lang.Object) (wrapper_arg_6))
      };
    }
  }
//  stanford2bel.m:171
  private static java.lang.Object [] stprops_11_p_0(
    sberrs.Prmode_0 Md_12,
    int Tn_13,
    java.lang.String Spk_14,
    int I_15,
    list.List_1 STATE_VARIABLE_Is_0_38,
    tree234.Tree234_2 Tmap_18,
    tree234.Tree234_2 Rmap_19,
    list.List_1 STATE_VARIABLE_Props_0_40)
  {
//  stanford2bel.m:173
    {
      boolean succeeded = false;
      list.List_1 STATE_VARIABLE_Is_39 = null;
      stanford2bel.Tempexpr_0 Expr_17 = null;
      list.List_1 STATE_VARIABLE_Props_41 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_77_77 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_78_78 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_token2_0);
      int Tk_21 = 0;
      java.lang.String Wd_22 = null;
      stanford2bel.Pos_0 Pos_23 = null;
      stanford2bel.Netp_0 NE_24 = null;
      maybe.Maybe_1 Mb_25 = null;
      stanford2bel.Wtype_0 Tp_26 = null;
      stanford2bel.Token2_0 V_42_42 = null;
//  stanford2bel.m:174
      java.lang.Object conv0_V_42_42 = null;
//  stanford2bel.m:180
      list.List_1 Ps_27 = null;
//  stanford2bel.m:175
      jmercury.runtime.TypeInfo_Struct TypeInfo_79_79 = null;

//  stanford2bel.m:174
      {
        conv0_V_42_42 = map.f_84_121_112_101_83_112_101_99_79_102_95_95_112_114_101_100_95_111_114_95_102_117_110_99_95_95_108_111_111_107_117_112_95_95_91_75_32_61_32_105_110_116_93_95_48_95_49_3_p_0(TypeCtorInfo_78_78, Tmap_18, I_15);
      }
      V_42_42 = ((stanford2bel.Token2_0) conv0_V_42_42);
      Tk_21 = ((stanford2bel.Token2_0) V_42_42).F1;
      Wd_22 = ((stanford2bel.Token2_0) V_42_42).F2;
      Pos_23 = ((stanford2bel.Token2_0) V_42_42).F3;
      NE_24 = ((stanford2bel.Token2_0) V_42_42).F4;
      Mb_25 = ((stanford2bel.Token2_0) V_42_42).F5;
//  stanford2bel.m:290
      switch (Pos_23.MR_value) {
        case 0:
          Tp_26 = stanford2bel.Wtype_0.K3;
          break;
        case 1:
//  stanford2bel.m:291
          Tp_26 = stanford2bel.Wtype_0.K1;
//  stanford2bel.m:290
          break;
        case 2:
//  stanford2bel.m:292
          Tp_26 = stanford2bel.Wtype_0.K5;
//  stanford2bel.m:290
          break;
        case 3:
//  stanford2bel.m:293
          Tp_26 = stanford2bel.Wtype_0.K5;
//  stanford2bel.m:290
          break;
        case 4:
//  stanford2bel.m:294
          Tp_26 = stanford2bel.Wtype_0.K5;
//  stanford2bel.m:290
          break;
        case 5:
//  stanford2bel.m:295
          Tp_26 = stanford2bel.Wtype_0.K2;
//  stanford2bel.m:290
          break;
        case 6:
//  stanford2bel.m:296
          Tp_26 = stanford2bel.Wtype_0.K4;
//  stanford2bel.m:290
          break;
        case 7:
//  stanford2bel.m:297
          Tp_26 = stanford2bel.Wtype_0.K4;
//  stanford2bel.m:290
          break;
        case 8:
//  stanford2bel.m:298
          Tp_26 = stanford2bel.Wtype_0.K4;
//  stanford2bel.m:290
          break;
        case 9:
//  stanford2bel.m:299
          Tp_26 = stanford2bel.Wtype_0.K5;
//  stanford2bel.m:290
          break;
        case 10:
//  stanford2bel.m:300
          Tp_26 = stanford2bel.Wtype_0.K0;
//  stanford2bel.m:290
          break;
        case 11:
//  stanford2bel.m:301
          Tp_26 = stanford2bel.Wtype_0.K1;
//  stanford2bel.m:290
          break;
        case 12:
//  stanford2bel.m:303
          Tp_26 = stanford2bel.Wtype_0.K1;
//  stanford2bel.m:290
          break;
        case 13:
//  stanford2bel.m:304
          Tp_26 = stanford2bel.Wtype_0.K1;
//  stanford2bel.m:290
          break;
        case 14:
//  stanford2bel.m:302
          Tp_26 = stanford2bel.Wtype_0.K1;
//  stanford2bel.m:290
          break;
        case 15:
//  stanford2bel.m:305
          Tp_26 = stanford2bel.Wtype_0.K5;
//  stanford2bel.m:290
          break;
        case 16:
//  stanford2bel.m:306
          Tp_26 = stanford2bel.Wtype_0.K5;
//  stanford2bel.m:290
          break;
        case 17:
//  stanford2bel.m:307
          Tp_26 = stanford2bel.Wtype_0.K1;
//  stanford2bel.m:290
          break;
        case 18:
//  stanford2bel.m:308
          Tp_26 = stanford2bel.Wtype_0.K1;
//  stanford2bel.m:290
          break;
        case 36:
//  stanford2bel.m:326
          Tp_26 = stanford2bel.Wtype_0.K5;
//  stanford2bel.m:290
          break;
        case 19:
//  stanford2bel.m:309
          Tp_26 = stanford2bel.Wtype_0.K4;
//  stanford2bel.m:290
          break;
        case 20:
//  stanford2bel.m:310
          Tp_26 = stanford2bel.Wtype_0.K4;
//  stanford2bel.m:290
          break;
        case 21:
//  stanford2bel.m:311
          Tp_26 = stanford2bel.Wtype_0.K4;
//  stanford2bel.m:290
          break;
        case 22:
//  stanford2bel.m:312
          Tp_26 = stanford2bel.Wtype_0.K5;
//  stanford2bel.m:290
          break;
        case 23:
//  stanford2bel.m:313
          Tp_26 = stanford2bel.Wtype_0.K1;
//  stanford2bel.m:290
          break;
        case 24:
//  stanford2bel.m:314
          Tp_26 = stanford2bel.Wtype_0.K5;
//  stanford2bel.m:290
          break;
        case 25:
//  stanford2bel.m:315
          Tp_26 = stanford2bel.Wtype_0.K5;
//  stanford2bel.m:290
          break;
        case 26:
//  stanford2bel.m:316
          Tp_26 = stanford2bel.Wtype_0.K0;
//  stanford2bel.m:290
          break;
        case 27:
//  stanford2bel.m:319
          Tp_26 = stanford2bel.Wtype_0.K0;
//  stanford2bel.m:290
          break;
        case 28:
//  stanford2bel.m:320
          Tp_26 = stanford2bel.Wtype_0.K0;
//  stanford2bel.m:290
          break;
        case 29:
//  stanford2bel.m:321
          Tp_26 = stanford2bel.Wtype_0.K0;
//  stanford2bel.m:290
          break;
        case 30:
//  stanford2bel.m:317
          Tp_26 = stanford2bel.Wtype_0.K0;
//  stanford2bel.m:290
          break;
        case 31:
//  stanford2bel.m:318
          Tp_26 = stanford2bel.Wtype_0.K0;
//  stanford2bel.m:290
          break;
        case 32:
//  stanford2bel.m:322
          Tp_26 = stanford2bel.Wtype_0.K5;
//  stanford2bel.m:290
          break;
        case 33:
//  stanford2bel.m:323
          Tp_26 = stanford2bel.Wtype_0.K1;
//  stanford2bel.m:290
          break;
        case 34:
//  stanford2bel.m:324
          Tp_26 = stanford2bel.Wtype_0.K1;
//  stanford2bel.m:290
          break;
        case 35:
//  stanford2bel.m:325
          Tp_26 = stanford2bel.Wtype_0.K4;
//  stanford2bel.m:290
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
      TypeInfo_79_79 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[7]);
//  stanford2bel.m:175
      {
        java.lang.Object [] result = multi_map.search_3_p_0(TypeCtorInfo_77_77, TypeInfo_79_79, Rmap_19, java.lang.Integer.valueOf(I_15));
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        Ps_27 = (list.List_1) result[1];
      }
//  stanford2bel.m:180
      if (succeeded)
//  stanford2bel.m:178
        {
          jmercury.runtime.TypeInfo_Struct TypeInfo_80_80 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_81_81 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_82_82 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_83_83 = null;
          list.List_1 Pairs_37 = null;
          /* closure */ java.lang.Object[] V_43_43 = null;
          list.List_1 STATE_VARIABLE_Props_45_45 = null;
          list.List_1 V_52_52 = null;
//  stanford2bel.m:176
          java.lang.Object conv5_STATE_VARIABLE_Is_39 = null;
          java.lang.Object conv4_STATE_VARIABLE_Props_45_45 = null;

          {
            V_43_43 = new /* closure */ java.lang.Object[] {((java.lang.Object) (stanford2bel.MR_scalar_common_11[0])), ((java.lang.Object) (new AddrOf4_0(0))), java.lang.Integer.valueOf(5), ((java.lang.Object) (Md_12)), java.lang.Integer.valueOf(Tn_13), ((java.lang.Object) (Spk_14)), ((java.lang.Object) (Tmap_18)), ((java.lang.Object) (Rmap_19))};
          }
          TypeInfo_80_80 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[7]);
          TypeInfo_81_81 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[10]);
          TypeInfo_82_82 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[11]);
          TypeInfo_83_83 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[4]);
          {
            java.lang.Object [] result = list.map_foldl2_7_p_0(TypeInfo_80_80, TypeInfo_81_81, TypeInfo_82_82, TypeInfo_83_83, V_43_43, Ps_27, ((java.lang.Object) (STATE_VARIABLE_Is_0_38)), ((java.lang.Object) (STATE_VARIABLE_Props_0_40)));
            Pairs_37 = (list.List_1) result[0];
            conv5_STATE_VARIABLE_Is_39 = (java.lang.Object) result[1];
            conv4_STATE_VARIABLE_Props_45_45 = (java.lang.Object) result[2];
          }
          STATE_VARIABLE_Is_39 = ((list.List_1) conv5_STATE_VARIABLE_Is_39);
          STATE_VARIABLE_Props_45_45 = ((list.List_1) conv4_STATE_VARIABLE_Props_45_45);
//  stanford2bel.m:179
          {
            V_52_52 = list.sort_1_f_0(TypeInfo_81_81, Pairs_37);
          }
          {
            java.lang.Object [] result = stanford2bel.nonterminal_12_p_0(Md_12, Tn_13, Tk_21, Spk_14, Wd_22, Tp_26, NE_24, Mb_25, V_52_52, STATE_VARIABLE_Props_45_45);
            Expr_17 = (stanford2bel.Tempexpr_0) result[0];
            STATE_VARIABLE_Props_41 = (list.List_1) result[1];
          }
//  stanford2bel.m:178
        }
//  stanford2bel.m:180
      else
//  stanford2bel.m:181
        {
//  stanford2bel.m:180
          succeeded = (Pos_23.MR_value == stanford2bel.Pos_0.K24.MR_value);
//  stanford2bel.m:181
          if (succeeded)
//  stanford2bel.m:180
            {
              stanford2bel.Tmtp_0 V_54_54 = (stanford2bel.Tmtp_0) stanford2bel.MR_scalar_common_12[0];

              Expr_17 = (stanford2bel.Tempexpr_0) stanford2bel.MR_scalar_common_13[0];
              STATE_VARIABLE_Props_41 = STATE_VARIABLE_Props_0_40;
            }
//  stanford2bel.m:181
          else
//  stanford2bel.m:183
            {
//  stanford2bel.m:181
              succeeded = (Pos_23.MR_value == stanford2bel.Pos_0.K10.MR_value);
//  stanford2bel.m:183
              if (succeeded)
//  stanford2bel.m:181
                {
                  stanford2bel.Tmtp_0 V_56_56 = null;

                  {
                    STATE_VARIABLE_Props_41 = stanford2bel.dummy_prop_7_p_0(Md_12, Tn_13, Tk_21, Spk_14, Wd_22, STATE_VARIABLE_Props_0_40);
                  }
//  stanford2bel.m:182
                  {
                    V_56_56 = new stanford2bel.Tmtp_0.Modal_1(Wd_22);
                  }
                  {
                    Expr_17 = new stanford2bel.Tempexpr_0.Term_1(V_56_56);
                  }
//  stanford2bel.m:181
                }
//  stanford2bel.m:183
              else
//  stanford2bel.m:184
                {
//  stanford2bel.m:183
                  stanford2bel.Tmtp_0 V_57_57 = (stanford2bel.Tmtp_0) stanford2bel.MR_scalar_common_14[0];

                  {
                    succeeded = stanford2bel.terminal_4_p_0(Wd_22, Pos_23, Tp_26, V_57_57);
                  }
//  stanford2bel.m:184
                  if (succeeded)
//  stanford2bel.m:183
                    {
                      stanford2bel.Tmtp_0 V_58_58 = (stanford2bel.Tmtp_0) stanford2bel.MR_scalar_common_14[0];

                      Expr_17 = (stanford2bel.Tempexpr_0) stanford2bel.MR_scalar_common_13[1];
                      STATE_VARIABLE_Props_41 = STATE_VARIABLE_Props_0_40;
                    }
//  stanford2bel.m:184
                  else
//  stanford2bel.m:185
                    {
//  stanford2bel.m:184
                      stanford2bel.Tmtp_0 V_59_59 = (stanford2bel.Tmtp_0) stanford2bel.MR_scalar_common_15[0];

                      {
                        succeeded = stanford2bel.terminal_4_p_0(Wd_22, Pos_23, Tp_26, V_59_59);
                      }
//  stanford2bel.m:185
                      if (succeeded)
//  stanford2bel.m:184
                        {
                          stanford2bel.Tmtp_0 V_60_60 = (stanford2bel.Tmtp_0) stanford2bel.MR_scalar_common_15[0];

                          Expr_17 = (stanford2bel.Tempexpr_0) stanford2bel.MR_scalar_common_13[2];
                          STATE_VARIABLE_Props_41 = STATE_VARIABLE_Props_0_40;
                        }
//  stanford2bel.m:185
                      else
//  stanford2bel.m:186
                        {
//  stanford2bel.m:185
                          stanford2bel.Tmtp_0 V_61_61 = (stanford2bel.Tmtp_0) stanford2bel.MR_scalar_common_16[0];

                          {
                            succeeded = stanford2bel.terminal_4_p_0(Wd_22, Pos_23, Tp_26, V_61_61);
                          }
//  stanford2bel.m:186
                          if (succeeded)
//  stanford2bel.m:185
                            {
                              stanford2bel.Tmtp_0 V_62_62 = (stanford2bel.Tmtp_0) stanford2bel.MR_scalar_common_16[0];

                              Expr_17 = (stanford2bel.Tempexpr_0) stanford2bel.MR_scalar_common_13[3];
                              STATE_VARIABLE_Props_41 = STATE_VARIABLE_Props_0_40;
                            }
//  stanford2bel.m:186
                          else
//  stanford2bel.m:188
                            {
//  stanford2bel.m:186
                              succeeded = (Pos_23.MR_value == stanford2bel.Pos_0.K22.MR_value);
//  stanford2bel.m:188
                              if (succeeded)
//  stanford2bel.m:186
                                {
                                  stanford2bel.Tmtp_0 V_64_64 = null;

                                  {
                                    STATE_VARIABLE_Props_41 = stanford2bel.dummy_prop_7_p_0(Md_12, Tn_13, Tk_21, Spk_14, Wd_22, STATE_VARIABLE_Props_0_40);
                                  }
//  stanford2bel.m:187
                                  {
                                    V_64_64 = new stanford2bel.Tmtp_0.Prt_1(Wd_22);
                                  }
                                  {
                                    Expr_17 = new stanford2bel.Tempexpr_0.Term_1(V_64_64);
                                  }
//  stanford2bel.m:186
                                }
//  stanford2bel.m:188
                              else
//  stanford2bel.m:190
                                {
//  stanford2bel.m:188
                                  succeeded = (Tp_26.MR_value == stanford2bel.Wtype_0.K0.MR_value);
//  stanford2bel.m:190
                                  if (succeeded)
//  stanford2bel.m:188
                                    {
                                      {
                                        STATE_VARIABLE_Props_41 = stanford2bel.dummy_prop_7_p_0(Md_12, Tn_13, Tk_21, Spk_14, Wd_22, STATE_VARIABLE_Props_0_40);
                                      }
//  stanford2bel.m:189
                                      Expr_17 = (stanford2bel.Tempexpr_0) stanford2bel.MR_scalar_common_17[0];
//  stanford2bel.m:188
                                    }
//  stanford2bel.m:190
                                  else
//  stanford2bel.m:192
                                    {
//  stanford2bel.m:190
                                      succeeded = (Tp_26.MR_value == stanford2bel.Wtype_0.K1.MR_value);
//  stanford2bel.m:192
                                      if (succeeded)
//  stanford2bel.m:190
                                        {
                                          stanford2bel.Wdtp_0 V_67_67 = null;

                                          {
                                            STATE_VARIABLE_Props_41 = stanford2bel.dummy_prop_7_p_0(Md_12, Tn_13, Tk_21, Spk_14, Wd_22, STATE_VARIABLE_Props_0_40);
                                          }
//  stanford2bel.m:191
                                          V_67_67 = stanford2bel.Wdtp_0.K0;
                                          {
                                            Expr_17 = new stanford2bel.Tempexpr_0.Nd_4(V_67_67, Wd_22, NE_24, Mb_25);
                                          }
//  stanford2bel.m:190
                                        }
//  stanford2bel.m:192
                                      else
//  stanford2bel.m:194
                                        {
//  stanford2bel.m:192
                                          succeeded = (Tp_26.MR_value == stanford2bel.Wtype_0.K4.MR_value);
//  stanford2bel.m:194
                                          if (succeeded)
//  stanford2bel.m:192
                                            {
                                              stanford2bel.Wdtp_0 V_69_69 = null;

                                              {
                                                STATE_VARIABLE_Props_41 = stanford2bel.dummy_prop_7_p_0(Md_12, Tn_13, Tk_21, Spk_14, Wd_22, STATE_VARIABLE_Props_0_40);
                                              }
//  stanford2bel.m:193
                                              V_69_69 = stanford2bel.Wdtp_0.K1;
                                              {
                                                Expr_17 = new stanford2bel.Tempexpr_0.Nd_4(V_69_69, Wd_22, NE_24, Mb_25);
                                              }
//  stanford2bel.m:192
                                            }
//  stanford2bel.m:194
                                          else
//  stanford2bel.m:196
                                            {
//  stanford2bel.m:194
                                              succeeded = (Pos_23.MR_value == stanford2bel.Pos_0.K3.MR_value);
//  stanford2bel.m:196
                                              if (succeeded)
//  stanford2bel.m:194
                                                {
                                                  {
                                                    STATE_VARIABLE_Props_41 = stanford2bel.dummy_prop_7_p_0(Md_12, Tn_13, Tk_21, Spk_14, Wd_22, STATE_VARIABLE_Props_0_40);
                                                  }
//  stanford2bel.m:195
                                                  Expr_17 = (stanford2bel.Tempexpr_0) stanford2bel.MR_scalar_common_17[0];
//  stanford2bel.m:194
                                                }
//  stanford2bel.m:196
                                              else
                                                {
                                                  Expr_17 = (stanford2bel.Tempexpr_0) stanford2bel.MR_scalar_common_17[0];
                                                  STATE_VARIABLE_Props_41 = STATE_VARIABLE_Props_0_40;
                                                }
                                            }
//  stanford2bel.m:194
                                        }
//  stanford2bel.m:192
                                    }
//  stanford2bel.m:190
                                }
//  stanford2bel.m:188
                            }
//  stanford2bel.m:186
                        }
//  stanford2bel.m:185
                    }
//  stanford2bel.m:184
                }
//  stanford2bel.m:183
            }
//  stanford2bel.m:196
          STATE_VARIABLE_Is_39 = STATE_VARIABLE_Is_0_38;
//  stanford2bel.m:181
        }
//  stanford2bel.m:173
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_Is_39)),
        ((java.lang.Object) (Expr_17)),
        ((java.lang.Object) (STATE_VARIABLE_Props_41))
      };
    }
//  stanford2bel.m:171
  }
//  stanford2bel.m:155
  private static java.lang.Object [] conv_coref_7_p_0(
    java.lang.String File_8,
    int Id_9,
    list.List_1 Ps_10,
    tree234.Tree234_2 STATE_VARIABLE_Tmap_0_14,
    list.List_1 STATE_VARIABLE_Es_0_16)
  {
//  stanford2bel.m:161
    {
      boolean succeeded = (Ps_10.data_tag == 1);
      tree234.Tree234_2 STATE_VARIABLE_Tmap_15 = null;
      list.List_1 STATE_VARIABLE_Es_17 = null;
      pair.Pair_2 P_13 = null;
//  stanford2bel.m:157
      list.List_1 V_18_18 = null;

      if (succeeded)
        {
          P_13 = ((pair.Pair_2) ((list.List_1.F_cons_2) Ps_10).F1);
          V_18_18 = ((list.List_1.F_cons_2) Ps_10).F2;
          succeeded = (V_18_18.data_tag == 0);
        }
//  stanford2bel.m:161
      if (succeeded)
//  stanford2bel.m:160
        {
//  stanford2bel.m:158
          jmercury.runtime.TypeInfo_Struct TypeInfo_23_23 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[0]);
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_24_24 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);

          {
            succeeded = map.contains_2_p_0(TypeInfo_23_23, TypeCtorInfo_24_24, STATE_VARIABLE_Tmap_0_14, ((java.lang.Object) (P_13)));
          }
//  stanford2bel.m:160
          if (succeeded)
//  stanford2bel.m:159
            {
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_25_25 = null;
              errors.Err_loc_0 V_19_19 = null;
              sberrs.Error_0 V_20_20 = null;

              {
                V_19_19 = new errors.Err_loc_0.File_1(File_8);
              }
              {
                V_20_20 = new sberrs.Error_0.Dupl_coref_1(P_13);
              }
              TypeCtorInfo_25_25 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
              {
                STATE_VARIABLE_Es_17 = errors.add_error_4_p_0(TypeCtorInfo_25_25, V_19_19, ((java.lang.Object) (V_20_20)), STATE_VARIABLE_Es_0_16);
              }
              STATE_VARIABLE_Tmap_15 = STATE_VARIABLE_Tmap_0_14;
            }
//  stanford2bel.m:160
          else
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_26_26 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[0]);
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_27_27 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);

              {
                STATE_VARIABLE_Tmap_15 = map.det_insert_4_p_0(TypeInfo_26_26, TypeCtorInfo_27_27, ((java.lang.Object) (P_13)), java.lang.Integer.valueOf(Id_9), STATE_VARIABLE_Tmap_0_14);
              }
              STATE_VARIABLE_Es_17 = STATE_VARIABLE_Es_0_16;
            }
        }
//  stanford2bel.m:161
      else
        {
          STATE_VARIABLE_Es_17 = STATE_VARIABLE_Es_0_16;
          STATE_VARIABLE_Tmap_15 = STATE_VARIABLE_Tmap_0_14;
        }
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_Tmap_15)),
        ((java.lang.Object) (STATE_VARIABLE_Es_17))
      };
    }
//  stanford2bel.m:155
  }
//  stanford2bel.m:147
  private static java.lang.Object [] conv_semrel_6_p_0(
    java.lang.String File_7,
    stanford2bel.Semrel_0 HeadVar__2_2,
    tree234.Tree234_2 STATE_VARIABLE_Rmap_0_15,
    list.List_1 STATE_VARIABLE_Es_0_17)
  {
//  stanford2bel.m:148
    {
      boolean succeeded = false;
      tree234.Tree234_2 STATE_VARIABLE_Rmap_16 = null;
      list.List_1 STATE_VARIABLE_Es_18 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_25_25 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_26_26 = null;
      int Modifier_8 = ((stanford2bel.Semrel_0) HeadVar__2_2).F1;
      java.lang.String LbStr_9 = ((stanford2bel.Semrel_0) HeadVar__2_2).F2;
      int Head_10 = ((stanford2bel.Semrel_0) HeadVar__2_2).F3;
      stanford2bel.Label_0 Lb_14 = null;
      pair.Pair_2 V_22_22 = null;
//  stanford2bel.m:151
      stanford2bel.Label_0 Lb0_13 = null;

//  stanford2bel.m:149
      {
        java.lang.Object [] result = stanford2bel.semrel_label_2_p_0(LbStr_9);
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        Lb0_13 = (stanford2bel.Label_0) result[1];
      }
//  stanford2bel.m:151
      if (succeeded)
//  stanford2bel.m:150
        {
          Lb_14 = Lb0_13;
          STATE_VARIABLE_Es_18 = STATE_VARIABLE_Es_0_17;
        }
//  stanford2bel.m:151
      else
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_24_24 = null;
          errors.Err_loc_0 V_19_19 = null;
          sberrs.Error_0 V_20_20 = null;

          {
            V_19_19 = new errors.Err_loc_0.File_1(File_7);
          }
          {
            V_20_20 = new sberrs.Error_0.Funny_semrel_1(LbStr_9);
          }
          TypeCtorInfo_24_24 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
          {
            STATE_VARIABLE_Es_18 = errors.add_error_4_p_0(TypeCtorInfo_24_24, V_19_19, ((java.lang.Object) (V_20_20)), STATE_VARIABLE_Es_0_17);
          }
          Lb_14 = stanford2bel.Label_0.K19;
        }
//  stanford2bel.m:152
      {
        V_22_22 = new pair.Pair_2(((java.lang.Object) (Lb_14)), java.lang.Integer.valueOf(Modifier_8));
      }
      TypeCtorInfo_25_25 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
      TypeInfo_26_26 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[7]);
      {
        STATE_VARIABLE_Rmap_16 = multi_map.set_4_p_0(TypeCtorInfo_25_25, TypeInfo_26_26, java.lang.Integer.valueOf(Head_10), ((java.lang.Object) (V_22_22)), STATE_VARIABLE_Rmap_0_15);
      }
//  stanford2bel.m:148
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_Rmap_16)),
        ((java.lang.Object) (STATE_VARIABLE_Es_18))
      };
    }
//  stanford2bel.m:147
  }
//  stanford2bel.m:133
  private static java.lang.Object [] conv_tok_9_p_0(
    maybe.Maybe_1 HeadVar__1_10,
    java.lang.String File_11,
    int N_12,
    tree234.Tree234_2 Kmap_13,
    stanford2bel.Token_0 HeadVar__5_5,
    tree234.Tree234_2 STATE_VARIABLE_Tmap_0_27,
    list.List_1 STATE_VARIABLE_Es_0_29)
  {
//  stanford2bel.m:134
    {
      boolean succeeded = false;
      tree234.Tree234_2 STATE_VARIABLE_Tmap_28 = null;
      list.List_1 STATE_VARIABLE_Es_30 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_45_45 = null;
      int X_14 = ((stanford2bel.Token_0) HeadVar__5_5).F1;
      int I_15 = ((stanford2bel.Token_0) HeadVar__5_5).F2;
      java.lang.String Str_16 = ((stanford2bel.Token_0) HeadVar__5_5).F3;
      java.lang.String PosStr_17 = ((stanford2bel.Token_0) HeadVar__5_5).F4;
      java.lang.String TpStr_18 = ((stanford2bel.Token_0) HeadVar__5_5).F5;
      stanford2bel.Pos_0 Pos_22 = null;
      stanford2bel.Netp_0 Tp_24 = null;
      maybe.Maybe_1 Mb_26 = null;
      list.List_1 STATE_VARIABLE_Es_33_33 = null;
      stanford2bel.Token2_0 V_38_38 = null;
//  stanford2bel.m:137
      stanford2bel.Pos_0 Pos0_21 = null;
//  stanford2bel.m:329
      int lo_0 = 0;
      int hi_1 = 0;
      int mid_2 = 0;
      int result_3 = 0;
      int stop_loop_4 = 0;
//  stanford2bel.m:140
      stanford2bel.Netp_0 Tp0_23 = null;
//  stanford2bel.m:382
      int lo_5 = 0;
      int hi_6 = 0;
      int mid_7 = 0;
      int result_8 = 0;
      int stop_loop_9 = 0;
//  stanford2bel.m:143
      int Ent_25 = 0;
//  stanford2bel.m:141
      jmercury.runtime.TypeInfo_Struct TypeInfo_42_42 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_43_43 = null;
      pair.Pair_2 V_37_37 = null;
      java.lang.Object conv0_Ent_25 = null;

//  stanford2bel.m:329
      /* binary string jump switch */
      succeeded = false;
      lo_0 = 0;
      hi_1 = 44;
      stop_loop_4 = 0;
      do
        {
          mid_2 = ((lo_0 + hi_1) / 2);
          result_3 = (PosStr_17.compareTo(((stanford2bel.Vector_common_type_6_0) (MR_vector_common_6[62 + mid_2])).vct_6_f_0)) ;
          if ((result_3 == 0))
            {
              switch (((stanford2bel.Vector_common_type_6_0) (MR_vector_common_6[62 + mid_2])).vct_6_f_1) {
                case 0:
//  stanford2bel.m:371
                  {
                    /* case "#" */
                    Pos0_21 = stanford2bel.Pos_0.K36;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 1:
//  stanford2bel.m:370
                  {
                    /* case "$" */
                    Pos0_21 = stanford2bel.Pos_0.K36;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 2:
//  stanford2bel.m:369
                  {
                    /* case "''" */
                    Pos0_21 = stanford2bel.Pos_0.K36;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 3:
//  stanford2bel.m:366
                  {
                    /* case "," */
                    Pos0_21 = stanford2bel.Pos_0.K36;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 4:
//  stanford2bel.m:373
                  {
                    /* case "-LRB-" */
                    Pos0_21 = stanford2bel.Pos_0.K36;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 5:
//  stanford2bel.m:372
                  {
                    /* case "-RRB-" */
                    Pos0_21 = stanford2bel.Pos_0.K36;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 6:
//  stanford2bel.m:365
                  {
                    /* case "." */
                    Pos0_21 = stanford2bel.Pos_0.K36;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 7:
//  stanford2bel.m:367
                  {
                    /* case ":" */
                    Pos0_21 = stanford2bel.Pos_0.K36;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 8:
                  {
                    /* case "CC" */
                    Pos0_21 = stanford2bel.Pos_0.K0;
                    succeeded = true;
                  }
                  break;
                case 9:
//  stanford2bel.m:330
                  {
                    /* case "CD" */
                    Pos0_21 = stanford2bel.Pos_0.K1;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 10:
//  stanford2bel.m:331
                  {
                    /* case "DT" */
                    Pos0_21 = stanford2bel.Pos_0.K2;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 11:
//  stanford2bel.m:332
                  {
                    /* case "EX" */
                    Pos0_21 = stanford2bel.Pos_0.K3;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 12:
//  stanford2bel.m:333
                  {
                    /* case "FW" */
                    Pos0_21 = stanford2bel.Pos_0.K4;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 13:
//  stanford2bel.m:334
                  {
                    /* case "IN" */
                    Pos0_21 = stanford2bel.Pos_0.K5;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 14:
//  stanford2bel.m:335
                  {
                    /* case "JJ" */
                    Pos0_21 = stanford2bel.Pos_0.K6;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 15:
//  stanford2bel.m:336
                  {
                    /* case "JJR" */
                    Pos0_21 = stanford2bel.Pos_0.K7;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 16:
//  stanford2bel.m:337
                  {
                    /* case "JJS" */
                    Pos0_21 = stanford2bel.Pos_0.K8;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 17:
//  stanford2bel.m:338
                  {
                    /* case "LS" */
                    Pos0_21 = stanford2bel.Pos_0.K9;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 18:
//  stanford2bel.m:339
                  {
                    /* case "MD" */
                    Pos0_21 = stanford2bel.Pos_0.K10;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 19:
//  stanford2bel.m:340
                  {
                    /* case "NN" */
                    Pos0_21 = stanford2bel.Pos_0.K11;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 20:
//  stanford2bel.m:342
                  {
                    /* case "NNP" */
                    Pos0_21 = stanford2bel.Pos_0.K12;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 21:
//  stanford2bel.m:343
                  {
                    /* case "NNPS" */
                    Pos0_21 = stanford2bel.Pos_0.K13;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 22:
//  stanford2bel.m:341
                  {
                    /* case "NNS" */
                    Pos0_21 = stanford2bel.Pos_0.K14;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 23:
//  stanford2bel.m:344
                  {
                    /* case "PDT" */
                    Pos0_21 = stanford2bel.Pos_0.K15;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 24:
//  stanford2bel.m:345
                  {
                    /* case "POS" */
                    Pos0_21 = stanford2bel.Pos_0.K16;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 25:
//  stanford2bel.m:346
                  {
                    /* case "PRP" */
                    Pos0_21 = stanford2bel.Pos_0.K17;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 26:
//  stanford2bel.m:347
                  {
                    /* case "PRP$" */
                    Pos0_21 = stanford2bel.Pos_0.K18;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 27:
//  stanford2bel.m:348
                  {
                    /* case "RB" */
                    Pos0_21 = stanford2bel.Pos_0.K19;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 28:
//  stanford2bel.m:349
                  {
                    /* case "RBR" */
                    Pos0_21 = stanford2bel.Pos_0.K20;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 29:
//  stanford2bel.m:350
                  {
                    /* case "RBS" */
                    Pos0_21 = stanford2bel.Pos_0.K21;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 30:
//  stanford2bel.m:351
                  {
                    /* case "RP" */
                    Pos0_21 = stanford2bel.Pos_0.K22;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 31:
//  stanford2bel.m:352
                  {
                    /* case "SYM" */
                    Pos0_21 = stanford2bel.Pos_0.K23;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 32:
//  stanford2bel.m:353
                  {
                    /* case "TO" */
                    Pos0_21 = stanford2bel.Pos_0.K24;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 33:
//  stanford2bel.m:354
                  {
                    /* case "UH" */
                    Pos0_21 = stanford2bel.Pos_0.K25;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 34:
//  stanford2bel.m:355
                  {
                    /* case "VB" */
                    Pos0_21 = stanford2bel.Pos_0.K26;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 35:
//  stanford2bel.m:358
                  {
                    /* case "VBD" */
                    Pos0_21 = stanford2bel.Pos_0.K27;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 36:
//  stanford2bel.m:359
                  {
                    /* case "VBG" */
                    Pos0_21 = stanford2bel.Pos_0.K28;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 37:
//  stanford2bel.m:360
                  {
                    /* case "VBN" */
                    Pos0_21 = stanford2bel.Pos_0.K29;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 38:
//  stanford2bel.m:356
                  {
                    /* case "VBP" */
                    Pos0_21 = stanford2bel.Pos_0.K30;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 39:
//  stanford2bel.m:357
                  {
                    /* case "VBZ" */
                    Pos0_21 = stanford2bel.Pos_0.K31;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 40:
//  stanford2bel.m:361
                  {
                    /* case "WDT" */
                    Pos0_21 = stanford2bel.Pos_0.K32;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 41:
//  stanford2bel.m:362
                  {
                    /* case "WP" */
                    Pos0_21 = stanford2bel.Pos_0.K33;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 42:
//  stanford2bel.m:363
                  {
                    /* case "WP$" */
                    Pos0_21 = stanford2bel.Pos_0.K34;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 43:
//  stanford2bel.m:364
                  {
                    /* case "WRB" */
                    Pos0_21 = stanford2bel.Pos_0.K35;
                    succeeded = true;
                  }
//  stanford2bel.m:329
                  break;
                case 44:
//  stanford2bel.m:368
                  {
                    /* case "``" */
                    Pos0_21 = stanford2bel.Pos_0.K36;
                    succeeded = true;
                  }
//  stanford2bel.m:329
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
//  stanford2bel.m:137
      if (succeeded)
//  stanford2bel.m:136
        {
          Pos_22 = Pos0_21;
          STATE_VARIABLE_Es_33_33 = STATE_VARIABLE_Es_0_29;
        }
//  stanford2bel.m:137
      else
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_40_40 = null;
          errors.Err_loc_0 V_31_31 = null;
          sberrs.Error_0 V_32_32 = null;

          {
            V_31_31 = new errors.Err_loc_0.File_1(File_11);
          }
          {
            V_32_32 = new sberrs.Error_0.Funny_pos_1(PosStr_17);
          }
          TypeCtorInfo_40_40 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
          {
            STATE_VARIABLE_Es_33_33 = errors.add_error_4_p_0(TypeCtorInfo_40_40, V_31_31, ((java.lang.Object) (V_32_32)), STATE_VARIABLE_Es_0_29);
          }
          Pos_22 = stanford2bel.Pos_0.K3;
        }
//  stanford2bel.m:382
      /* binary string jump switch */
      succeeded = false;
      lo_5 = 0;
      hi_6 = 12;
      stop_loop_9 = 0;
      do
        {
          mid_7 = ((lo_5 + hi_6) / 2);
          result_8 = (TpStr_18.compareTo(((stanford2bel.Vector_common_type_6_0) (MR_vector_common_6[107 + mid_7])).vct_6_f_0)) ;
          if ((result_8 == 0))
            {
              switch (((stanford2bel.Vector_common_type_6_0) (MR_vector_common_6[107 + mid_7])).vct_6_f_1) {
                case 0:
//  stanford2bel.m:388
                  {
                    /* case "DATE" */
                    Tp0_23 = stanford2bel.Netp_0.K2;
                    succeeded = true;
                  }
//  stanford2bel.m:382
                  break;
                case 1:
//  stanford2bel.m:390
                  {
                    /* case "DURATION" */
                    Tp0_23 = stanford2bel.Netp_0.K7;
                    succeeded = true;
                  }
//  stanford2bel.m:382
                  break;
                case 2:
//  stanford2bel.m:386
                  {
                    /* case "LOCATION" */
                    Tp0_23 = stanford2bel.Netp_0.K5;
                    succeeded = true;
                  }
//  stanford2bel.m:382
                  break;
                case 3:
//  stanford2bel.m:387
                  {
                    /* case "MISC" */
                    Tp0_23 = stanford2bel.Netp_0.K6;
                    succeeded = true;
                  }
//  stanford2bel.m:382
                  break;
                case 4:
//  stanford2bel.m:391
                  {
                    /* case "MONEY" */
                    Tp0_23 = stanford2bel.Netp_0.K8;
                    succeeded = true;
                  }
//  stanford2bel.m:382
                  break;
                case 5:
//  stanford2bel.m:385
                  {
                    /* case "NUMBER" */
                    Tp0_23 = stanford2bel.Netp_0.K4;
                    succeeded = true;
                  }
//  stanford2bel.m:382
                  break;
                case 6:
                  {
                    /* case "O" */
                    Tp0_23 = stanford2bel.Netp_0.K0;
                    succeeded = true;
                  }
                  break;
                case 7:
//  stanford2bel.m:392
                  {
                    /* case "ORDINAL" */
                    Tp0_23 = stanford2bel.Netp_0.K10;
                    succeeded = true;
                  }
//  stanford2bel.m:382
                  break;
                case 8:
//  stanford2bel.m:389
                  {
                    /* case "ORGANIZATION" */
                    Tp0_23 = stanford2bel.Netp_0.K9;
                    succeeded = true;
                  }
//  stanford2bel.m:382
                  break;
                case 9:
//  stanford2bel.m:393
                  {
                    /* case "PERCENT" */
                    Tp0_23 = stanford2bel.Netp_0.K11;
                    succeeded = true;
                  }
//  stanford2bel.m:382
                  break;
                case 10:
//  stanford2bel.m:384
                  {
                    /* case "PERSON" */
                    Tp0_23 = stanford2bel.Netp_0.K3;
                    succeeded = true;
                  }
//  stanford2bel.m:382
                  break;
                case 11:
//  stanford2bel.m:394
                  {
                    /* case "SET" */
                    Tp0_23 = stanford2bel.Netp_0.K12;
                    succeeded = true;
                  }
//  stanford2bel.m:382
                  break;
                case 12:
//  stanford2bel.m:383
                  {
                    /* case "TIME" */
                    Tp0_23 = stanford2bel.Netp_0.K1;
                    succeeded = true;
                  }
//  stanford2bel.m:382
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
//  stanford2bel.m:140
      if (succeeded)
//  stanford2bel.m:139
        {
          Tp_24 = Tp0_23;
          STATE_VARIABLE_Es_30 = STATE_VARIABLE_Es_33_33;
        }
//  stanford2bel.m:140
      else
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_41_41 = null;
          errors.Err_loc_0 V_34_34 = null;
          sberrs.Error_0 V_35_35 = null;

          {
            V_34_34 = new errors.Err_loc_0.File_1(File_11);
          }
          {
            V_35_35 = new sberrs.Error_0.Funny_ne_tp_1(TpStr_18);
          }
          TypeCtorInfo_41_41 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
          {
            STATE_VARIABLE_Es_30 = errors.add_error_4_p_0(TypeCtorInfo_41_41, V_34_34, ((java.lang.Object) (V_35_35)), STATE_VARIABLE_Es_33_33);
          }
          Tp_24 = stanford2bel.Netp_0.K0;
        }
//  stanford2bel.m:141
      {
        V_37_37 = new pair.Pair_2(java.lang.Integer.valueOf(N_12), java.lang.Integer.valueOf(I_15));
      }
      TypeInfo_42_42 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[0]);
      TypeCtorInfo_43_43 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
      {
        java.lang.Object [] result = map.search_3_p_0(TypeInfo_42_42, TypeCtorInfo_43_43, Kmap_13, ((java.lang.Object) (V_37_37)));
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        conv0_Ent_25 = (java.lang.Object) result[1];
      }
      if (succeeded)
        {
          Ent_25 = ((java.lang.Integer) conv0_Ent_25).intValue();
          succeeded = true;
        }
//  stanford2bel.m:143
      if (succeeded)
//  stanford2bel.m:142
        {
          Mb_26 = new maybe.Maybe_1.Yes_1(java.lang.Integer.valueOf(Ent_25));
        }
//  stanford2bel.m:143
      else
        Mb_26 = (maybe.Maybe_1) stanford2bel.MR_scalar_common_10[0];
//  stanford2bel.m:144
      {
        V_38_38 = new stanford2bel.Token2_0(X_14, Str_16, Pos_22, Tp_24, Mb_26);
      }
      TypeCtorInfo_45_45 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_token2_0);
      {
        STATE_VARIABLE_Tmap_28 = map.f_84_121_112_101_83_112_101_99_79_102_95_95_112_114_101_100_95_95_100_101_116_95_105_110_115_101_114_116_95_95_91_75_32_61_32_105_110_116_93_95_48_95_49_4_p_0(TypeCtorInfo_45_45, I_15, ((java.lang.Object) (V_38_38)), STATE_VARIABLE_Tmap_0_27);
      }
//  stanford2bel.m:134
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_Tmap_28)),
        ((java.lang.Object) (STATE_VARIABLE_Es_30))
      };
    }
//  stanford2bel.m:133
  }
//  stanford2bel.m:129
  private static java.lang.Object [] conv_sent_7_p_0_2(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_4)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      java.lang.Object wrapper_arg_5 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      tree234.Tree234_2 conv5_STATE_VARIABLE_Rmap_16 = null;
      list.List_1 conv4_STATE_VARIABLE_Es_18 = null;

      {
        java.lang.Object [] result = stanford2bel.conv_semrel_6_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((stanford2bel.Semrel_0) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2), ((list.List_1) wrapper_arg_4));
        conv5_STATE_VARIABLE_Rmap_16 = (tree234.Tree234_2) result[0];
        conv4_STATE_VARIABLE_Es_18 = (list.List_1) result[1];
      }
      wrapper_arg_3 = ((java.lang.Object) (conv5_STATE_VARIABLE_Rmap_16));
      wrapper_arg_5 = ((java.lang.Object) (conv4_STATE_VARIABLE_Es_18));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_3)),
        ((java.lang.Object) (wrapper_arg_5))
      };
    }
  }
//  stanford2bel.m:128
  private static java.lang.Object [] conv_sent_7_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_4)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      java.lang.Object wrapper_arg_5 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      tree234.Tree234_2 conv1_STATE_VARIABLE_Tmap_28 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_30 = null;

      {
        java.lang.Object [] result = stanford2bel.conv_tok_9_p_0(((maybe.Maybe_1) ((java.lang.Object[]) closure)[3]), ((java.lang.String) ((java.lang.Object[]) closure)[4]), ((java.lang.Integer) (((java.lang.Object[]) closure)[5])).intValue(), ((tree234.Tree234_2) ((java.lang.Object[]) closure)[6]), ((stanford2bel.Token_0) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2), ((list.List_1) wrapper_arg_4));
        conv1_STATE_VARIABLE_Tmap_28 = (tree234.Tree234_2) result[0];
        conv0_STATE_VARIABLE_Es_30 = (list.List_1) result[1];
      }
      wrapper_arg_3 = ((java.lang.Object) (conv1_STATE_VARIABLE_Tmap_28));
      wrapper_arg_5 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_30));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_3)),
        ((java.lang.Object) (wrapper_arg_5))
      };
    }
  }
//  stanford2bel.m:124
  private static java.lang.Object [] conv_sent_7_p_0(
    maybe.Maybe_1 WN_8,
    java.lang.String File_9,
    tree234.Tree234_2 Kmap_10,
    stanford2bel.Sent_0 Sent_11,
    list.List_1 STATE_VARIABLE_Es_0_24)
  {
//  stanford2bel.m:125
    {
      boolean succeeded = false;
      stanford2bel.Sent2_0 Sent2_12 = null;
      list.List_1 STATE_VARIABLE_Es_25 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_37_37 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_38_38 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_39_39 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_40_40 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_41_41 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_47_47 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_48_48 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_49_49 = null;
      int N_14 = ((stanford2bel.Sent_0) Sent_11).F1;
      java.lang.String TnStr_15 = ((stanford2bel.Sent_0) Sent_11).F2;
      java.lang.String Spk_16 = ((stanford2bel.Sent_0) Sent_11).F3;
      java.lang.String Text_17 = ((stanford2bel.Sent_0) Sent_11).F4;
      list.List_1 Ts_18 = ((stanford2bel.Sent_0) Sent_11).F5;
      list.List_1 Rs_19 = ((stanford2bel.Sent_0) Sent_11).F6;
      int Tn_21 = 0;
      tree234.Tree234_2 Tmap_22 = null;
      tree234.Tree234_2 Rmap_23 = null;
      /* closure */ java.lang.Object[] V_26_26 = null;
      tree234.Tree234_2 V_27_27 = null;
      list.List_1 STATE_VARIABLE_Es_28_28 = null;
      /* closure */ java.lang.Object[] V_29_29 = null;
      tree234.Tree234_2 V_30_30 = null;
//  stanford2bel.m:127
      int X_20 = 0;
//  stanford2bel.m:128
      java.lang.Object conv3_Tmap_22 = null;
      java.lang.Object conv2_STATE_VARIABLE_Es_28_28 = null;
//  stanford2bel.m:129
      java.lang.Object conv7_Rmap_23 = null;
      java.lang.Object conv6_STATE_VARIABLE_Es_25 = null;

//  stanford2bel.m:127
      {
        java.lang.Object [] result = string.to_int_2_p_0(TnStr_15);
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        X_20 = ((java.lang.Integer) result[1]).intValue();
      }
      if (succeeded)
        Tn_21 = X_20;
      else
        Tn_21 = -1;
//  stanford2bel.m:128
      {
        V_26_26 = new /* closure */ java.lang.Object[] {((java.lang.Object) (stanford2bel.MR_scalar_common_8[0])), ((java.lang.Object) (new AddrOf4_0(1))), java.lang.Integer.valueOf(4), ((java.lang.Object) (WN_8)), ((java.lang.Object) (File_9)), java.lang.Integer.valueOf(N_14), ((java.lang.Object) (Kmap_10))};
      }
      TypeCtorInfo_37_37 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
      TypeCtorInfo_38_38 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_token2_0);
      {
        V_27_27 = map.init_0_f_0(TypeCtorInfo_37_37, TypeCtorInfo_38_38);
      }
      TypeCtorInfo_39_39 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_token_0);
      TypeInfo_40_40 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[6]);
      TypeInfo_41_41 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[3]);
      {
        java.lang.Object [] result = list.foldl2_6_p_0(TypeCtorInfo_39_39, TypeInfo_40_40, TypeInfo_41_41, V_26_26, Ts_18, ((java.lang.Object) (V_27_27)), ((java.lang.Object) (STATE_VARIABLE_Es_0_24)));
        conv3_Tmap_22 = (java.lang.Object) result[0];
        conv2_STATE_VARIABLE_Es_28_28 = (java.lang.Object) result[1];
      }
      Tmap_22 = ((tree234.Tree234_2) conv3_Tmap_22);
      STATE_VARIABLE_Es_28_28 = ((list.List_1) conv2_STATE_VARIABLE_Es_28_28);
//  stanford2bel.m:129
      {
        V_29_29 = new /* closure */ java.lang.Object[] {((java.lang.Object) (stanford2bel.MR_scalar_common_9[0])), ((java.lang.Object) (new AddrOf4_0(2))), java.lang.Integer.valueOf(1), ((java.lang.Object) (File_9))};
      }
      TypeInfo_47_47 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[7]);
      {
        V_30_30 = multi_map.init_0_f_0(TypeCtorInfo_37_37, TypeInfo_47_47);
      }
      TypeCtorInfo_48_48 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_semrel_0);
      TypeInfo_49_49 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[9]);
      {
        java.lang.Object [] result = list.foldl2_6_p_0(TypeCtorInfo_48_48, TypeInfo_49_49, TypeInfo_41_41, V_29_29, Rs_19, ((java.lang.Object) (V_30_30)), ((java.lang.Object) (STATE_VARIABLE_Es_28_28)));
        conv7_Rmap_23 = (java.lang.Object) result[0];
        conv6_STATE_VARIABLE_Es_25 = (java.lang.Object) result[1];
      }
      Rmap_23 = ((tree234.Tree234_2) conv7_Rmap_23);
      STATE_VARIABLE_Es_25 = ((list.List_1) conv6_STATE_VARIABLE_Es_25);
//  stanford2bel.m:130
      {
        Sent2_12 = new stanford2bel.Sent2_0(N_14, Tn_21, Spk_16, Text_17, Tmap_22, Rmap_23);
      }
//  stanford2bel.m:125
return new java.lang.Object[] {
        ((java.lang.Object) (Sent2_12)),
        ((java.lang.Object) (STATE_VARIABLE_Es_25))
      };
    }
//  stanford2bel.m:124
  }
//  stanford2bel.m:116
  private static list.List_1 stp_8_p_0(
    sberrs.Prmode_0 Md_1,
    int Tn_2,
    java.lang.String Spk_3,
    list.List_1 HeadVar__4_4,
    tree234.Tree234_2 Tmap_5,
    tree234.Tree234_2 Rmap_6,
    list.List_1 STATE_VARIABLE_Props_0_7)
  {
//  stanford2bel.m:118
    while (true)
      {
        /* tailcall optimized into a loop */
        {
          boolean succeeded = false;
          list.List_1 STATE_VARIABLE_Props_8 = null;

          if ((HeadVar__4_4.data_tag == 0))
//  stanford2bel.m:121
            STATE_VARIABLE_Props_8 = STATE_VARIABLE_Props_0_7;
//  stanford2bel.m:118
          else
            {
              int I_12 = ((java.lang.Integer) (((list.List_1.F_cons_2) HeadVar__4_4).F1)).intValue();
              list.List_1 Is0_13 = ((list.List_1.F_cons_2) HeadVar__4_4).F2;
              list.List_1 Is_17 = null;
              list.List_1 STATE_VARIABLE_Props_21_21 = null;
//  stanford2bel.m:119
              stanford2bel.Tempexpr_0 V_18_18 = null;

              {
                java.lang.Object [] result = stanford2bel.stprops_11_p_0(Md_1, Tn_2, Spk_3, I_12, Is0_13, Tmap_5, Rmap_6, STATE_VARIABLE_Props_0_7);
                Is_17 = (list.List_1) result[0];
                V_18_18 = (stanford2bel.Tempexpr_0) result[1];
                STATE_VARIABLE_Props_21_21 = (list.List_1) result[2];
              }
//  stanford2bel.m:120
              /* direct tailcall eliminated */
              {
                list.List_1 HeadVar__4__tmp_copy_4 = Is_17;
                list.List_1 STATE_VARIABLE_Props_0__tmp_copy_7 = STATE_VARIABLE_Props_21_21;

                STATE_VARIABLE_Props_0_7 = STATE_VARIABLE_Props_0__tmp_copy_7;
                HeadVar__4_4 = HeadVar__4__tmp_copy_4;
              }
              continue;
//  stanford2bel.m:118
            }
          return STATE_VARIABLE_Props_8;
        }
      }
//  stanford2bel.m:116
  }
//  stanford2bel.m:269
  private static java.lang.Object conv_sent2_7_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      stanford2bel.Vertices_0 conv0_STATE_VARIABLE_Vs_26 = null;

      {
        conv0_STATE_VARIABLE_Vs_26 = stanford2bel.tps_4_p_0(((tree234.Tree234_2) ((java.lang.Object[]) closure)[3]), ((java.lang.Integer) wrapper_arg_1).intValue(), ((stanford2bel.Vertices_0) wrapper_arg_2));
      }
      wrapper_arg_3 = ((java.lang.Object) (conv0_STATE_VARIABLE_Vs_26));
      return wrapper_arg_3;
    }
  }
//  stanford2bel.m:108
  private static java.lang.Object [] conv_sent2_7_p_0(
    java.lang.String HeadVar__1_8,
    sberrs.Prmode_0 Md_9,
    stanford2bel.Sent2_0 HeadVar__3_3,
    list.List_1 STATE_VARIABLE_Props_0_19,
    list.List_1 STATE_VARIABLE_Es_0_21)
  {
//  stanford2bel.m:110
    {
      boolean succeeded = false;
      list.List_1 STATE_VARIABLE_Props_20 = null;
      list.List_1 STATE_VARIABLE_Es_22 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_18_39 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
      jmercury.runtime.TypeInfo_Struct TypeInfo_19_40 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[8]);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_23_44 = null;
      int Tn_11 = ((stanford2bel.Sent2_0) HeadVar__3_3).F2;
      java.lang.String Spk_12 = ((stanford2bel.Sent2_0) HeadVar__3_3).F3;
      tree234.Tree234_2 Tmap_14 = ((stanford2bel.Sent2_0) HeadVar__3_3).F5;
      tree234.Tree234_2 Rmap_15 = ((stanford2bel.Sent2_0) HeadVar__3_3).F6;
      list.List_1 Is_18 = null;
      list.List_1 Vs_26 = null;
      stanford2bel.Vertices_0 Vertices0_27 = null;
      stanford2bel.Vertices_0 Vertices_28 = null;
      list.List_1 X_31 = null;
      list.List_1 Xs_32 = null;
      set_ordlist.Set_ordlist_1 V_33_33 = null;
      set_ordlist.Set_ordlist_1 V_34_34 = null;
      list.List_1 V_35_35 = null;
      list.List_1 V_36_36 = null;
      /* closure */ java.lang.Object[] V_37_37 = null;
      list.List_1 V_38_38 = null;
      int V_10_10 = ((stanford2bel.Sent2_0) HeadVar__3_3).F1;
      java.lang.String V_13_13 = ((stanford2bel.Sent2_0) HeadVar__3_3).F4;
//  stanford2bel.m:269
      java.lang.Object conv1_Vertices_28 = null;
//  stanford2bel.m:270
      set_ordlist.Set_ordlist_1 V_29_29 = null;
      set_ordlist.Set_ordlist_1 V_30_30 = null;

//  stanford2bel.m:268
      {
        Vs_26 = map.keys_2_p_0(TypeCtorInfo_18_39, TypeInfo_19_40, Rmap_15);
      }
      {
        V_33_33 = set.set_1_f_0(TypeCtorInfo_18_39, Vs_26);
      }
      {
        V_34_34 = set.init_0_f_0(TypeCtorInfo_18_39);
      }
      V_35_35 = (list.List_1) stanford2bel.MR_scalar_common_3[0];
      V_36_36 = (list.List_1) stanford2bel.MR_scalar_common_3[0];
      {
        Vertices0_27 = new stanford2bel.Vertices_0(V_33_33, V_34_34, V_35_35, V_36_36);
      }
//  stanford2bel.m:269
      {
        V_37_37 = new /* closure */ java.lang.Object[] {((java.lang.Object) (stanford2bel.MR_scalar_common_7[0])), ((java.lang.Object) (new AddrOf3_0(1))), java.lang.Integer.valueOf(1), ((java.lang.Object) (Rmap_15))};
      }
      TypeCtorInfo_23_44 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_vertices_0);
      {
        conv1_Vertices_28 = list.foldl_4_p_0(TypeCtorInfo_18_39, TypeCtorInfo_23_44, V_37_37, Vs_26, ((java.lang.Object) (Vertices0_27)));
      }
      Vertices_28 = ((stanford2bel.Vertices_0) conv1_Vertices_28);
//  stanford2bel.m:270
      V_29_29 = ((stanford2bel.Vertices_0) Vertices_28).F1;
      V_30_30 = ((stanford2bel.Vertices_0) Vertices_28).F2;
      X_31 = ((stanford2bel.Vertices_0) Vertices_28).F3;
      Xs_32 = ((stanford2bel.Vertices_0) Vertices_28).F4;
      {
        V_38_38 = new list.List_1.F_cons_2(((java.lang.Object) (X_31)), Xs_32);
      }
      {
        Is_18 = list.condense_2_p_0(TypeCtorInfo_18_39, V_38_38);
      }
//  stanford2bel.m:112
      {
        STATE_VARIABLE_Props_20 = stanford2bel.stp_8_p_0(Md_9, Tn_11, Spk_12, Is_18, Tmap_14, Rmap_15, STATE_VARIABLE_Props_0_19);
      }
      STATE_VARIABLE_Es_22 = STATE_VARIABLE_Es_0_21;
//  stanford2bel.m:110
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_Props_20)),
        ((java.lang.Object) (STATE_VARIABLE_Es_22))
      };
    }
//  stanford2bel.m:108
  }
//  stanford2bel.m:99
  private static java.lang.Object [] conv_ent_8_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_4)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      java.lang.Object wrapper_arg_5 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      tree234.Tree234_2 conv1_STATE_VARIABLE_Tmap_15 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_17 = null;

      {
        java.lang.Object [] result = stanford2bel.conv_coref_7_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((java.lang.Integer) (((java.lang.Object[]) closure)[4])).intValue(), ((list.List_1) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2), ((list.List_1) wrapper_arg_4));
        conv1_STATE_VARIABLE_Tmap_15 = (tree234.Tree234_2) result[0];
        conv0_STATE_VARIABLE_Es_17 = (list.List_1) result[1];
      }
      wrapper_arg_3 = ((java.lang.Object) (conv1_STATE_VARIABLE_Tmap_15));
      wrapper_arg_5 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_17));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_3)),
        ((java.lang.Object) (wrapper_arg_5))
      };
    }
  }
//  stanford2bel.m:94
  private static java.lang.Object [] conv_ent_8_p_0(
    java.lang.String File_9,
    stanford2bel.Entity_0 HeadVar__2_2,
    tree234.Tree234_2 STATE_VARIABLE_Tmap_0_18,
    tree234.Tree234_2 STATE_VARIABLE_Emap_0_20,
    list.List_1 STATE_VARIABLE_Es_0_22)
  {
//  stanford2bel.m:95
    {
      boolean succeeded = false;
      tree234.Tree234_2 STATE_VARIABLE_Tmap_19 = null;
      tree234.Tree234_2 STATE_VARIABLE_Emap_21 = null;
      list.List_1 STATE_VARIABLE_Es_23 = null;
      int Id_10 = ((stanford2bel.Entity_0) HeadVar__2_2).F1;
      java.lang.String Str_11 = ((stanford2bel.Entity_0) HeadVar__2_2).F2;
      java.lang.String TpStr_12 = ((stanford2bel.Entity_0) HeadVar__2_2).F3;
      list.List_1 Pss_13 = ((stanford2bel.Entity_0) HeadVar__2_2).F4;
//  stanford2bel.m:96
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_35_35 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_36_36 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_entity2_0);

      {
        succeeded = map.contains_2_p_0(TypeCtorInfo_35_35, TypeCtorInfo_36_36, STATE_VARIABLE_Emap_0_20, java.lang.Integer.valueOf(Id_10));
      }
//  stanford2bel.m:98
      if (succeeded)
//  stanford2bel.m:97
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_37_37 = null;
          errors.Err_loc_0 V_24_24 = null;
          sberrs.Error_0 V_25_25 = null;

          {
            V_24_24 = new errors.Err_loc_0.File_1(File_9);
          }
          {
            V_25_25 = new sberrs.Error_0.Dupl_ent_id_1(Id_10);
          }
          TypeCtorInfo_37_37 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
          {
            STATE_VARIABLE_Es_23 = errors.add_error_4_p_0(TypeCtorInfo_37_37, V_24_24, ((java.lang.Object) (V_25_25)), STATE_VARIABLE_Es_0_22);
          }
          STATE_VARIABLE_Emap_21 = STATE_VARIABLE_Emap_0_20;
          STATE_VARIABLE_Tmap_19 = STATE_VARIABLE_Tmap_0_18;
        }
//  stanford2bel.m:98
      else
//  stanford2bel.m:101
        {
          stanford2bel.Etp_0 Tp_17 = null;
//  stanford2bel.m:376
          int lo_0 = 0;
          int hi_1 = 0;
          int mid_2 = 0;
          int result_3 = 0;
          int stop_loop_4 = 0;

          /* binary string jump switch */
          succeeded = false;
          lo_0 = 0;
          hi_1 = 3;
          stop_loop_4 = 0;
          do
            {
              mid_2 = ((lo_0 + hi_1) / 2);
              result_3 = (TpStr_12.compareTo(((stanford2bel.Vector_common_type_6_0) (MR_vector_common_6[58 + mid_2])).vct_6_f_0)) ;
              if ((result_3 == 0))
                {
                  switch (((stanford2bel.Vector_common_type_6_0) (MR_vector_common_6[58 + mid_2])).vct_6_f_1) {
                    case 0:
//  stanford2bel.m:379
                      {
                        /* case "LIST" */
                        Tp_17 = stanford2bel.Etp_0.K3;
                        succeeded = true;
                      }
//  stanford2bel.m:376
                      break;
                    case 1:
                      {
                        /* case "NOMINAL" */
                        Tp_17 = stanford2bel.Etp_0.K1;
                        succeeded = true;
                      }
                      break;
                    case 2:
//  stanford2bel.m:377
                      {
                        /* case "PRONOMINAL" */
                        Tp_17 = stanford2bel.Etp_0.K0;
                        succeeded = true;
                      }
//  stanford2bel.m:376
                      break;
                    case 3:
//  stanford2bel.m:378
                      {
                        /* case "PROPER" */
                        Tp_17 = stanford2bel.Etp_0.K2;
                        succeeded = true;
                      }
//  stanford2bel.m:376
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
//  stanford2bel.m:101
          if (succeeded)
//  stanford2bel.m:99
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_43_43 = null;
              jmercury.runtime.TypeInfo_Struct TypeInfo_44_44 = null;
              jmercury.runtime.TypeInfo_Struct TypeInfo_45_45 = null;
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_47_47 = null;
              /* closure */ java.lang.Object[] V_27_27 = null;
              stanford2bel.Entity2_0 V_30_30 = null;
              java.lang.Object conv3_STATE_VARIABLE_Tmap_19 = null;
              java.lang.Object conv2_STATE_VARIABLE_Es_23 = null;

              {
                V_27_27 = new /* closure */ java.lang.Object[] {((java.lang.Object) (stanford2bel.MR_scalar_common_5[2])), ((java.lang.Object) (new AddrOf4_0(3))), java.lang.Integer.valueOf(2), ((java.lang.Object) (File_9)), java.lang.Integer.valueOf(Id_10)};
              }
              TypeInfo_43_43 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[5]);
              TypeInfo_44_44 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[1]);
              TypeInfo_45_45 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[3]);
              {
                java.lang.Object [] result = list.foldl2_6_p_0(TypeInfo_43_43, TypeInfo_44_44, TypeInfo_45_45, V_27_27, Pss_13, ((java.lang.Object) (STATE_VARIABLE_Tmap_0_18)), ((java.lang.Object) (STATE_VARIABLE_Es_0_22)));
                conv3_STATE_VARIABLE_Tmap_19 = (java.lang.Object) result[0];
                conv2_STATE_VARIABLE_Es_23 = (java.lang.Object) result[1];
              }
              STATE_VARIABLE_Tmap_19 = ((tree234.Tree234_2) conv3_STATE_VARIABLE_Tmap_19);
              STATE_VARIABLE_Es_23 = ((list.List_1) conv2_STATE_VARIABLE_Es_23);
//  stanford2bel.m:100
              {
                V_30_30 = new stanford2bel.Entity2_0(Str_11, Tp_17);
              }
              TypeCtorInfo_47_47 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_entity2_0);
              {
                STATE_VARIABLE_Emap_21 = map.f_84_121_112_101_83_112_101_99_79_102_95_95_112_114_101_100_95_95_100_101_116_95_105_110_115_101_114_116_95_95_91_75_32_61_32_105_110_116_93_95_48_95_49_4_p_0(TypeCtorInfo_47_47, Id_10, ((java.lang.Object) (V_30_30)), STATE_VARIABLE_Emap_0_20);
              }
//  stanford2bel.m:99
            }
//  stanford2bel.m:101
          else
            {
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_48_48 = null;
              errors.Err_loc_0 V_32_32 = null;
              sberrs.Error_0 V_33_33 = null;

              {
                V_32_32 = new errors.Err_loc_0.File_1(File_9);
              }
              {
                V_33_33 = new sberrs.Error_0.Funny_ent_tp_1(TpStr_12);
              }
              TypeCtorInfo_48_48 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
              {
                STATE_VARIABLE_Es_23 = errors.add_error_4_p_0(TypeCtorInfo_48_48, V_32_32, ((java.lang.Object) (V_33_33)), STATE_VARIABLE_Es_0_22);
              }
              STATE_VARIABLE_Emap_21 = STATE_VARIABLE_Emap_0_20;
              STATE_VARIABLE_Tmap_19 = STATE_VARIABLE_Tmap_0_18;
            }
        }
//  stanford2bel.m:95
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_Tmap_19)),
        ((java.lang.Object) (STATE_VARIABLE_Emap_21)),
        ((java.lang.Object) (STATE_VARIABLE_Es_23))
      };
    }
//  stanford2bel.m:94
  }
//  stanford2bel.m:75
  private static java.lang.Object [] read_files_9_p_0(
    java.lang.String File_10,
    java.lang.String Str_11,
    int Max_12,
    io.Posn_0 STATE_VARIABLE_Pos_0_20,
    list.List_1 STATE_VARIABLE_Fs_0_22,
    list.List_1 STATE_VARIABLE_Es_0_24)
  {
//  stanford2bel.m:77
    while (true)
      {
        /* tailcall optimized into a loop */
        {
          boolean succeeded = false;
          io.Posn_0 STATE_VARIABLE_Pos_21 = null;
          list.List_1 STATE_VARIABLE_Fs_23 = null;
          list.List_1 STATE_VARIABLE_Es_25 = null;
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_34_34 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_stfile_0);
          io.Read_result_1 Res_16 = null;
          io.Posn_0 STATE_VARIABLE_Pos_26_26 = null;

//  stanford2bel.m:78
          {
            java.lang.Object [] result = io.read_from_string_6_p_0(TypeCtorInfo_34_34, File_10, Str_11, Max_12, STATE_VARIABLE_Pos_0_20);
            Res_16 = (io.Read_result_1) result[0];
            STATE_VARIABLE_Pos_26_26 = (io.Posn_0) result[1];
          }
//  stanford2bel.m:80
          switch (Res_16.data_tag) {
            case 0:
//  stanford2bel.m:79
              {
                STATE_VARIABLE_Pos_21 = STATE_VARIABLE_Pos_26_26;
                STATE_VARIABLE_Fs_23 = STATE_VARIABLE_Fs_0_22;
                STATE_VARIABLE_Es_25 = STATE_VARIABLE_Es_0_24;
              }
//  stanford2bel.m:80
              break;
            case 1:
//  stanford2bel.m:82
              {
                stanford2bel.Stfile_0 F_19 = ((stanford2bel.Stfile_0) ((io.Read_result_1.Ok_1) Res_16).F1);
                list.List_1 STATE_VARIABLE_Fs_27_27 = null;

                {
                  STATE_VARIABLE_Fs_27_27 = new list.List_1.F_cons_2(((java.lang.Object) (F_19)), STATE_VARIABLE_Fs_0_22);
                }
//  stanford2bel.m:83
                /* direct tailcall eliminated */
                {
                  io.Posn_0 STATE_VARIABLE_Pos_0__tmp_copy_20 = STATE_VARIABLE_Pos_26_26;
                  list.List_1 STATE_VARIABLE_Fs_0__tmp_copy_22 = STATE_VARIABLE_Fs_27_27;

                  STATE_VARIABLE_Fs_0_22 = STATE_VARIABLE_Fs_0__tmp_copy_22;
                  STATE_VARIABLE_Pos_0_20 = STATE_VARIABLE_Pos_0__tmp_copy_20;
                }
                continue;
//  stanford2bel.m:82
              }
//  stanford2bel.m:80
            case 2:
              {
                jmercury.runtime.TypeInfo_Struct TypeCtorInfo_35_35 = null;
                java.lang.String Msg_17 = ((io.Read_result_1.Error_2) Res_16).F1;
                int Line_18 = ((io.Read_result_1.Error_2) Res_16).F2;
                errors.Err_loc_0 V_31_31 = null;
                sberrs.Error_0 V_32_32 = null;

//  stanford2bel.m:81
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
                STATE_VARIABLE_Fs_23 = STATE_VARIABLE_Fs_0_22;
//  stanford2bel.m:80
              }
              break;
            default: /*NOTREACHED*/
              throw new jmercury.runtime.UnreachableDefault();
          }
//  stanford2bel.m:77
return new java.lang.Object[] {
            ((java.lang.Object) (STATE_VARIABLE_Pos_21)),
            ((java.lang.Object) (STATE_VARIABLE_Fs_23)),
            ((java.lang.Object) (STATE_VARIABLE_Es_25))
          };
        }
      }
//  stanford2bel.m:75
  }
//  stanford2bel.m:54
  public static java.lang.String semrel_label_2_p_1(
    stanford2bel.Label_0 HeadVar__2_2)
  {
//  stanford2bel.m:396
    {
      boolean succeeded = false;
      java.lang.String HeadVar__1_1 = null;

      switch (HeadVar__2_2.MR_value) {
        case 25:
//  stanford2bel.m:421
          HeadVar__1_1 = "acomp";
//  stanford2bel.m:396
          break;
        case 27:
//  stanford2bel.m:423
          HeadVar__1_1 = "advcl";
//  stanford2bel.m:396
          break;
        case 38:
//  stanford2bel.m:434
          HeadVar__1_1 = "advmod";
//  stanford2bel.m:396
          break;
        case 55:
//  stanford2bel.m:452
          HeadVar__1_1 = "agent";
//  stanford2bel.m:396
          break;
        case 30:
//  stanford2bel.m:426
          HeadVar__1_1 = "amod";
//  stanford2bel.m:396
          break;
        case 35:
//  stanford2bel.m:431
          HeadVar__1_1 = "appos";
//  stanford2bel.m:396
          break;
        case 7:
//  stanford2bel.m:403
          HeadVar__1_1 = "arg";
//  stanford2bel.m:396
          break;
        case 19:
//  stanford2bel.m:415
          HeadVar__1_1 = "attr";
//  stanford2bel.m:396
          break;
        case 1:
//  stanford2bel.m:397
          HeadVar__1_1 = "aux";
//  stanford2bel.m:396
          break;
        case 2:
//  stanford2bel.m:398
          HeadVar__1_1 = "auxpass";
//  stanford2bel.m:396
          break;
        case 5:
//  stanford2bel.m:401
          HeadVar__1_1 = "cc";
//  stanford2bel.m:396
          break;
        case 20:
//  stanford2bel.m:416
          HeadVar__1_1 = "ccomp";
//  stanford2bel.m:396
          break;
        case 13:
//  stanford2bel.m:409
          HeadVar__1_1 = "comp";
//  stanford2bel.m:396
          break;
        case 4:
//  stanford2bel.m:400
          HeadVar__1_1 = "conj";
//  stanford2bel.m:396
          break;
        case 3:
//  stanford2bel.m:399
          HeadVar__1_1 = "cop";
//  stanford2bel.m:396
          break;
        case 11:
//  stanford2bel.m:407
          HeadVar__1_1 = "csubj";
//  stanford2bel.m:396
          break;
        case 12:
//  stanford2bel.m:408
          HeadVar__1_1 = "csubjpass";
//  stanford2bel.m:396
          break;
        case 56:
//  stanford2bel.m:453
          HeadVar__1_1 = "dep";
//  stanford2bel.m:396
          break;
        case 44:
//  stanford2bel.m:440
          HeadVar__1_1 = "det";
//  stanford2bel.m:396
          break;
        case 36:
//  stanford2bel.m:432
          HeadVar__1_1 = "discourse";
//  stanford2bel.m:396
          break;
        case 15:
//  stanford2bel.m:411
          HeadVar__1_1 = "dobj";
//  stanford2bel.m:396
          break;
        case 24:
//  stanford2bel.m:420
          HeadVar__1_1 = "expl";
//  stanford2bel.m:396
          break;
        case 52:
//  stanford2bel.m:449
          HeadVar__1_1 = "goeswith";
//  stanford2bel.m:396
          break;
        case 16:
//  stanford2bel.m:412
          HeadVar__1_1 = "iobj";
//  stanford2bel.m:396
          break;
        case 26:
//  stanford2bel.m:422
          HeadVar__1_1 = "mod";
//  stanford2bel.m:396
          break;
        case 29:
//  stanford2bel.m:425
          HeadVar__1_1 = "mark";
//  stanford2bel.m:396
          break;
        case 43:
//  stanford2bel.m:439
          HeadVar__1_1 = "measure";
//  stanford2bel.m:396
          break;
        case 42:
//  stanford2bel.m:438
          HeadVar__1_1 = "mwe";
//  stanford2bel.m:396
          break;
        case 39:
//  stanford2bel.m:435
          HeadVar__1_1 = "neg";
//  stanford2bel.m:396
          break;
        case 34:
//  stanford2bel.m:430
          HeadVar__1_1 = "nn";
//  stanford2bel.m:396
          break;
        case 40:
//  stanford2bel.m:436
          HeadVar__1_1 = "npadvmod";
//  stanford2bel.m:396
          break;
        case 9:
//  stanford2bel.m:405
          HeadVar__1_1 = "nsubj";
//  stanford2bel.m:396
          break;
        case 10:
//  stanford2bel.m:406
          HeadVar__1_1 = "nsubjpass";
//  stanford2bel.m:396
          break;
        case 31:
//  stanford2bel.m:427
          HeadVar__1_1 = "num";
//  stanford2bel.m:396
          break;
        case 32:
//  stanford2bel.m:428
          HeadVar__1_1 = "number";
//  stanford2bel.m:396
          break;
        case 14:
//  stanford2bel.m:410
          HeadVar__1_1 = "obj";
//  stanford2bel.m:396
          break;
        case 51:
//  stanford2bel.m:448
          HeadVar__1_1 = "parataxis";
//  stanford2bel.m:396
          break;
        case 18:
//  stanford2bel.m:414
          HeadVar__1_1 = "pcomp";
//  stanford2bel.m:396
          break;
        case 17:
//  stanford2bel.m:413
          HeadVar__1_1 = "pobj";
//  stanford2bel.m:396
          break;
        case 47:
//  stanford2bel.m:443
          HeadVar__1_1 = "poss";
//  stanford2bel.m:396
          break;
        case 48:
//  stanford2bel.m:444
          HeadVar__1_1 = "possessive";
//  stanford2bel.m:396
          break;
        case 0:
          HeadVar__1_1 = "pred";
          break;
        case 46:
//  stanford2bel.m:442
          HeadVar__1_1 = "preconj";
//  stanford2bel.m:396
          break;
        case 45:
//  stanford2bel.m:441
          HeadVar__1_1 = "predet";
//  stanford2bel.m:396
          break;
        case 49:
//  stanford2bel.m:445
          HeadVar__1_1 = "prep";
//  stanford2bel.m:396
          break;
        case 57:
//  stanford2bel.m:446
          HeadVar__1_1 = "prepc";
//  stanford2bel.m:396
          break;
        case 50:
//  stanford2bel.m:447
          HeadVar__1_1 = "prt";
//  stanford2bel.m:396
          break;
        case 6:
//  stanford2bel.m:402
          HeadVar__1_1 = "punct";
//  stanford2bel.m:396
          break;
        case 33:
//  stanford2bel.m:429
          HeadVar__1_1 = "quantmod";
//  stanford2bel.m:396
          break;
        case 28:
//  stanford2bel.m:424
          HeadVar__1_1 = "rcmod";
//  stanford2bel.m:396
          break;
        case 23:
//  stanford2bel.m:419
          HeadVar__1_1 = "ref";
//  stanford2bel.m:396
          break;
        case 22:
//  stanford2bel.m:418
          HeadVar__1_1 = "rel";
//  stanford2bel.m:396
          break;
        case 53:
//  stanford2bel.m:450
          HeadVar__1_1 = "sdep";
//  stanford2bel.m:396
          break;
        case 8:
//  stanford2bel.m:404
          HeadVar__1_1 = "subj";
//  stanford2bel.m:396
          break;
        case 41:
//  stanford2bel.m:437
          HeadVar__1_1 = "tmod";
//  stanford2bel.m:396
          break;
        case 37:
//  stanford2bel.m:433
          HeadVar__1_1 = "vmod";
//  stanford2bel.m:396
          break;
        case 21:
//  stanford2bel.m:417
          HeadVar__1_1 = "xcomp";
//  stanford2bel.m:396
          break;
        case 54:
//  stanford2bel.m:451
          HeadVar__1_1 = "xsubj";
//  stanford2bel.m:396
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
      return HeadVar__1_1;
    }
//  stanford2bel.m:54
  }
//  stanford2bel.m:53
  public static java.lang.Object [] semrel_label_2_p_0(
    java.lang.String HeadVar__1_1)
  {
//  stanford2bel.m:396
    {
      boolean succeeded = false;
      stanford2bel.Label_0 HeadVar__2_2 = null;
      int lo_0 = 0;
      int hi_1 = 0;
      int mid_2 = 0;
      int result_3 = 0;
      int stop_loop_4 = 0;

      /* binary string jump switch */
      succeeded = false;
      lo_0 = 0;
      hi_1 = 57;
      stop_loop_4 = 0;
      do
        {
          mid_2 = ((lo_0 + hi_1) / 2);
          result_3 = (HeadVar__1_1.compareTo(((stanford2bel.Vector_common_type_6_0) (MR_vector_common_6[0 + mid_2])).vct_6_f_0)) ;
          if ((result_3 == 0))
            {
              switch (((stanford2bel.Vector_common_type_6_0) (MR_vector_common_6[0 + mid_2])).vct_6_f_1) {
                case 0:
//  stanford2bel.m:421
                  {
                    /* case "acomp" */
                    HeadVar__2_2 = stanford2bel.Label_0.K25;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 1:
//  stanford2bel.m:423
                  {
                    /* case "advcl" */
                    HeadVar__2_2 = stanford2bel.Label_0.K27;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 2:
//  stanford2bel.m:434
                  {
                    /* case "advmod" */
                    HeadVar__2_2 = stanford2bel.Label_0.K38;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 3:
//  stanford2bel.m:452
                  {
                    /* case "agent" */
                    HeadVar__2_2 = stanford2bel.Label_0.K55;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 4:
//  stanford2bel.m:426
                  {
                    /* case "amod" */
                    HeadVar__2_2 = stanford2bel.Label_0.K30;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 5:
//  stanford2bel.m:431
                  {
                    /* case "appos" */
                    HeadVar__2_2 = stanford2bel.Label_0.K35;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 6:
//  stanford2bel.m:403
                  {
                    /* case "arg" */
                    HeadVar__2_2 = stanford2bel.Label_0.K7;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 7:
//  stanford2bel.m:415
                  {
                    /* case "attr" */
                    HeadVar__2_2 = stanford2bel.Label_0.K19;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 8:
//  stanford2bel.m:397
                  {
                    /* case "aux" */
                    HeadVar__2_2 = stanford2bel.Label_0.K1;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 9:
//  stanford2bel.m:398
                  {
                    /* case "auxpass" */
                    HeadVar__2_2 = stanford2bel.Label_0.K2;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 10:
//  stanford2bel.m:401
                  {
                    /* case "cc" */
                    HeadVar__2_2 = stanford2bel.Label_0.K5;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 11:
//  stanford2bel.m:416
                  {
                    /* case "ccomp" */
                    HeadVar__2_2 = stanford2bel.Label_0.K20;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 12:
//  stanford2bel.m:409
                  {
                    /* case "comp" */
                    HeadVar__2_2 = stanford2bel.Label_0.K13;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 13:
//  stanford2bel.m:400
                  {
                    /* case "conj" */
                    HeadVar__2_2 = stanford2bel.Label_0.K4;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 14:
//  stanford2bel.m:399
                  {
                    /* case "cop" */
                    HeadVar__2_2 = stanford2bel.Label_0.K3;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 15:
//  stanford2bel.m:407
                  {
                    /* case "csubj" */
                    HeadVar__2_2 = stanford2bel.Label_0.K11;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 16:
//  stanford2bel.m:408
                  {
                    /* case "csubjpass" */
                    HeadVar__2_2 = stanford2bel.Label_0.K12;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 17:
//  stanford2bel.m:453
                  {
                    /* case "dep" */
                    HeadVar__2_2 = stanford2bel.Label_0.K56;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 18:
//  stanford2bel.m:440
                  {
                    /* case "det" */
                    HeadVar__2_2 = stanford2bel.Label_0.K44;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 19:
//  stanford2bel.m:432
                  {
                    /* case "discourse" */
                    HeadVar__2_2 = stanford2bel.Label_0.K36;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 20:
//  stanford2bel.m:411
                  {
                    /* case "dobj" */
                    HeadVar__2_2 = stanford2bel.Label_0.K15;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 21:
//  stanford2bel.m:420
                  {
                    /* case "expl" */
                    HeadVar__2_2 = stanford2bel.Label_0.K24;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 22:
//  stanford2bel.m:449
                  {
                    /* case "goeswith" */
                    HeadVar__2_2 = stanford2bel.Label_0.K52;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 23:
//  stanford2bel.m:412
                  {
                    /* case "iobj" */
                    HeadVar__2_2 = stanford2bel.Label_0.K16;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 24:
//  stanford2bel.m:425
                  {
                    /* case "mark" */
                    HeadVar__2_2 = stanford2bel.Label_0.K29;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 25:
//  stanford2bel.m:439
                  {
                    /* case "measure" */
                    HeadVar__2_2 = stanford2bel.Label_0.K43;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 26:
//  stanford2bel.m:422
                  {
                    /* case "mod" */
                    HeadVar__2_2 = stanford2bel.Label_0.K26;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 27:
//  stanford2bel.m:438
                  {
                    /* case "mwe" */
                    HeadVar__2_2 = stanford2bel.Label_0.K42;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 28:
//  stanford2bel.m:435
                  {
                    /* case "neg" */
                    HeadVar__2_2 = stanford2bel.Label_0.K39;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 29:
//  stanford2bel.m:430
                  {
                    /* case "nn" */
                    HeadVar__2_2 = stanford2bel.Label_0.K34;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 30:
//  stanford2bel.m:436
                  {
                    /* case "npadvmod" */
                    HeadVar__2_2 = stanford2bel.Label_0.K40;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 31:
//  stanford2bel.m:405
                  {
                    /* case "nsubj" */
                    HeadVar__2_2 = stanford2bel.Label_0.K9;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 32:
//  stanford2bel.m:406
                  {
                    /* case "nsubjpass" */
                    HeadVar__2_2 = stanford2bel.Label_0.K10;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 33:
//  stanford2bel.m:427
                  {
                    /* case "num" */
                    HeadVar__2_2 = stanford2bel.Label_0.K31;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 34:
//  stanford2bel.m:428
                  {
                    /* case "number" */
                    HeadVar__2_2 = stanford2bel.Label_0.K32;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 35:
//  stanford2bel.m:410
                  {
                    /* case "obj" */
                    HeadVar__2_2 = stanford2bel.Label_0.K14;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 36:
//  stanford2bel.m:448
                  {
                    /* case "parataxis" */
                    HeadVar__2_2 = stanford2bel.Label_0.K51;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 37:
//  stanford2bel.m:414
                  {
                    /* case "pcomp" */
                    HeadVar__2_2 = stanford2bel.Label_0.K18;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 38:
//  stanford2bel.m:413
                  {
                    /* case "pobj" */
                    HeadVar__2_2 = stanford2bel.Label_0.K17;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 39:
//  stanford2bel.m:443
                  {
                    /* case "poss" */
                    HeadVar__2_2 = stanford2bel.Label_0.K47;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 40:
//  stanford2bel.m:444
                  {
                    /* case "possessive" */
                    HeadVar__2_2 = stanford2bel.Label_0.K48;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 41:
//  stanford2bel.m:442
                  {
                    /* case "preconj" */
                    HeadVar__2_2 = stanford2bel.Label_0.K46;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 42:
                  {
                    /* case "pred" */
                    HeadVar__2_2 = stanford2bel.Label_0.K0;
                    succeeded = true;
                  }
                  break;
                case 43:
//  stanford2bel.m:441
                  {
                    /* case "predet" */
                    HeadVar__2_2 = stanford2bel.Label_0.K45;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 44:
//  stanford2bel.m:445
                  {
                    /* case "prep" */
                    HeadVar__2_2 = stanford2bel.Label_0.K49;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 45:
//  stanford2bel.m:446
                  {
                    /* case "prepc" */
                    HeadVar__2_2 = stanford2bel.Label_0.K57;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 46:
//  stanford2bel.m:447
                  {
                    /* case "prt" */
                    HeadVar__2_2 = stanford2bel.Label_0.K50;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 47:
//  stanford2bel.m:402
                  {
                    /* case "punct" */
                    HeadVar__2_2 = stanford2bel.Label_0.K6;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 48:
//  stanford2bel.m:429
                  {
                    /* case "quantmod" */
                    HeadVar__2_2 = stanford2bel.Label_0.K33;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 49:
//  stanford2bel.m:424
                  {
                    /* case "rcmod" */
                    HeadVar__2_2 = stanford2bel.Label_0.K28;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 50:
//  stanford2bel.m:419
                  {
                    /* case "ref" */
                    HeadVar__2_2 = stanford2bel.Label_0.K23;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 51:
//  stanford2bel.m:418
                  {
                    /* case "rel" */
                    HeadVar__2_2 = stanford2bel.Label_0.K22;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 52:
//  stanford2bel.m:450
                  {
                    /* case "sdep" */
                    HeadVar__2_2 = stanford2bel.Label_0.K53;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 53:
//  stanford2bel.m:404
                  {
                    /* case "subj" */
                    HeadVar__2_2 = stanford2bel.Label_0.K8;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 54:
//  stanford2bel.m:437
                  {
                    /* case "tmod" */
                    HeadVar__2_2 = stanford2bel.Label_0.K41;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 55:
//  stanford2bel.m:433
                  {
                    /* case "vmod" */
                    HeadVar__2_2 = stanford2bel.Label_0.K37;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 56:
//  stanford2bel.m:417
                  {
                    /* case "xcomp" */
                    HeadVar__2_2 = stanford2bel.Label_0.K21;
                    succeeded = true;
                  }
//  stanford2bel.m:396
                  break;
                case 57:
//  stanford2bel.m:451
                  {
                    /* case "xsubj" */
                    HeadVar__2_2 = stanford2bel.Label_0.K54;
                    succeeded = true;
                  }
//  stanford2bel.m:396
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
        ((java.lang.Object) (HeadVar__2_2))
      };
    }
//  stanford2bel.m:53
  }
//  stanford2bel.m:50
  public static java.lang.Object [] owlprop_2_p_0(
    beliefs.Proposition_0 HeadVar__1_1)
  {
//  stanford2bel.m:163
    {
      boolean succeeded = false;
      java.lang.String Str_2 = null;

      if ((HeadVar__1_1.data_tag == 1))
//  stanford2bel.m:166
        {
          java.lang.String Sb_18 = ((beliefs.Proposition_0.Copula_2) HeadVar__1_1).F1;
          java.lang.String Pr_19 = ((beliefs.Proposition_0.Copula_2) HeadVar__1_1).F2;
          java.lang.String V_27_27 = ")";
          java.lang.String V_28_28 = null;
          java.lang.String V_29_29 = null;
          java.lang.String V_30_30 = null;
          java.lang.String V_31_31 = null;
          java.lang.String V_32_32 = null;

          {
            V_28_28 = string.f_43_43_2_f_0(Pr_19, V_27_27);
          }
          V_29_29 = " cubism:";
          {
            V_30_30 = string.f_43_43_2_f_0(V_29_29, V_28_28);
          }
          {
            V_31_31 = string.f_43_43_2_f_0(Sb_18, V_30_30);
          }
          V_32_32 = "ClassAssertion(";
          {
            Str_2 = string.f_43_43_2_f_0(V_32_32, V_31_31);
          }
        }
//  stanford2bel.m:163
      else
        {
          java.lang.String Sb_3 = ((beliefs.Proposition_0.Pred_3) HeadVar__1_1).F1;
          java.lang.String Pr_4 = ((beliefs.Proposition_0.Pred_3) HeadVar__1_1).F2;
          java.lang.String Ob_5 = ((beliefs.Proposition_0.Pred_3) HeadVar__1_1).F3;
          java.lang.String Nm_7 = "ObjectPropertyAssertion";
          java.lang.String V_33_33 = ")";
          java.lang.String V_34_34 = null;
          java.lang.String V_35_35 = null;
          java.lang.String V_36_36 = null;
          java.lang.String V_37_37 = null;
          java.lang.String V_38_38 = null;
          java.lang.String V_39_39 = null;
          java.lang.String V_40_40 = null;
          java.lang.String V_41_41 = null;
          java.lang.String V_42_42 = null;

          {
            V_34_34 = string.f_43_43_2_f_0(Ob_5, V_33_33);
          }
          V_35_35 = " cubism:";
          {
            V_36_36 = string.f_43_43_2_f_0(V_35_35, V_34_34);
          }
          {
            V_37_37 = string.f_43_43_2_f_0(Pr_4, V_36_36);
          }
          V_38_38 = " cubism:";
          {
            V_39_39 = string.f_43_43_2_f_0(V_38_38, V_37_37);
          }
          {
            V_40_40 = string.f_43_43_2_f_0(Sb_3, V_39_39);
          }
          V_41_41 = "(cubism:";
          {
            V_42_42 = string.f_43_43_2_f_0(V_41_41, V_40_40);
          }
          {
            Str_2 = string.f_43_43_2_f_0(Nm_7, V_42_42);
          }
        }
      succeeded = true;
return new java.lang.Object[] {
        java.lang.Boolean.valueOf(succeeded),
        ((java.lang.Object) (Str_2))
      };
    }
//  stanford2bel.m:50
  }
//  stanford2bel.m:104
  private static java.lang.Object [] convert3_6_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_4)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      java.lang.Object wrapper_arg_5 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      list.List_1 conv1_STATE_VARIABLE_Props_20 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_22 = null;

      {
        java.lang.Object [] result = stanford2bel.conv_sent2_7_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((sberrs.Prmode_0) ((java.lang.Object[]) closure)[4]), ((stanford2bel.Sent2_0) wrapper_arg_1), ((list.List_1) wrapper_arg_2), ((list.List_1) wrapper_arg_4));
        conv1_STATE_VARIABLE_Props_20 = (list.List_1) result[0];
        conv0_STATE_VARIABLE_Es_22 = (list.List_1) result[1];
      }
      wrapper_arg_3 = ((java.lang.Object) (conv1_STATE_VARIABLE_Props_20));
      wrapper_arg_5 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_22));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_3)),
        ((java.lang.Object) (wrapper_arg_5))
      };
    }
  }
//  stanford2bel.m:47
  public static java.lang.Object [] convert3_6_p_0(
    maybe.Maybe_1 _MWN_7,
    sberrs.Prmode_0 Md_8,
    stanford2bel.Stfile2_0 HeadVar__3_3,
    list.List_1 STATE_VARIABLE_Es_0_15)
  {
//  stanford2bel.m:103
    {
      boolean succeeded = false;
      stanford2bel.Stprops_0 HeadVar__4_4 = null;
      list.List_1 STATE_VARIABLE_Es_16 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_25_25 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_26_26 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_27_27 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_28_28 = null;
      java.lang.String File_9 = ((stanford2bel.Stfile2_0) HeadVar__3_3).F1;
      list.List_1 Sents_10 = ((stanford2bel.Stfile2_0) HeadVar__3_3).F2;
      tree234.Tree234_2 Emap_11 = ((stanford2bel.Stfile2_0) HeadVar__3_3).F3;
      list.List_1 Props_12 = null;
      list.List_1 RevProps_14 = null;
      /* closure */ java.lang.Object[] V_17_17 = null;
      list.List_1 V_18_18 = null;
//  stanford2bel.m:104
      java.lang.Object conv3_RevProps_14 = null;
      java.lang.Object conv2_STATE_VARIABLE_Es_16 = null;

      {
        V_17_17 = new /* closure */ java.lang.Object[] {((java.lang.Object) (stanford2bel.MR_scalar_common_5[1])), ((java.lang.Object) (new AddrOf4_0(4))), java.lang.Integer.valueOf(2), ((java.lang.Object) (File_9)), ((java.lang.Object) (Md_8))};
      }
      V_18_18 = (list.List_1) stanford2bel.MR_scalar_common_3[0];
      TypeCtorInfo_25_25 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_sent2_0);
      TypeInfo_26_26 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[4]);
      TypeInfo_27_27 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[3]);
      {
        java.lang.Object [] result = list.foldl2_6_p_0(TypeCtorInfo_25_25, TypeInfo_26_26, TypeInfo_27_27, V_17_17, Sents_10, ((java.lang.Object) (V_18_18)), ((java.lang.Object) (STATE_VARIABLE_Es_0_15)));
        conv3_RevProps_14 = (java.lang.Object) result[0];
        conv2_STATE_VARIABLE_Es_16 = (java.lang.Object) result[1];
      }
      RevProps_14 = ((list.List_1) conv3_RevProps_14);
      STATE_VARIABLE_Es_16 = ((list.List_1) conv2_STATE_VARIABLE_Es_16);
      TypeCtorInfo_28_28 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_stprop_0);
      {
        Props_12 = list.reverse_2_p_0(TypeCtorInfo_28_28, RevProps_14);
      }
//  stanford2bel.m:103
      {
        HeadVar__4_4 = new stanford2bel.Stprops_0(File_9, Props_12, Emap_11);
      }
return new java.lang.Object[] {
        ((java.lang.Object) (HeadVar__4_4)),
        ((java.lang.Object) (STATE_VARIABLE_Es_16))
      };
    }
//  stanford2bel.m:47
  }
//  stanford2bel.m:88
  private static java.lang.Object [] convert2_5_p_0_2(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      java.lang.Object wrapper_arg_4 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      stanford2bel.Sent2_0 conv7_Sent2_12 = null;
      list.List_1 conv6_STATE_VARIABLE_Es_25 = null;

      {
        java.lang.Object [] result = stanford2bel.conv_sent_7_p_0(((maybe.Maybe_1) ((java.lang.Object[]) closure)[3]), ((java.lang.String) ((java.lang.Object[]) closure)[4]), ((tree234.Tree234_2) ((java.lang.Object[]) closure)[5]), ((stanford2bel.Sent_0) wrapper_arg_1), ((list.List_1) wrapper_arg_3));
        conv7_Sent2_12 = (stanford2bel.Sent2_0) result[0];
        conv6_STATE_VARIABLE_Es_25 = (list.List_1) result[1];
      }
      wrapper_arg_2 = ((java.lang.Object) (conv7_Sent2_12));
      wrapper_arg_4 = ((java.lang.Object) (conv6_STATE_VARIABLE_Es_25));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_2)),
        ((java.lang.Object) (wrapper_arg_4))
      };
    }
  }
//  stanford2bel.m:87
  private static java.lang.Object [] convert2_5_p_0_1(
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
      tree234.Tree234_2 conv2_STATE_VARIABLE_Tmap_19 = null;
      tree234.Tree234_2 conv1_STATE_VARIABLE_Emap_21 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_23 = null;

      {
        java.lang.Object [] result = stanford2bel.conv_ent_8_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((stanford2bel.Entity_0) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2), ((tree234.Tree234_2) wrapper_arg_4), ((list.List_1) wrapper_arg_6));
        conv2_STATE_VARIABLE_Tmap_19 = (tree234.Tree234_2) result[0];
        conv1_STATE_VARIABLE_Emap_21 = (tree234.Tree234_2) result[1];
        conv0_STATE_VARIABLE_Es_23 = (list.List_1) result[2];
      }
      wrapper_arg_3 = ((java.lang.Object) (conv2_STATE_VARIABLE_Tmap_19));
      wrapper_arg_5 = ((java.lang.Object) (conv1_STATE_VARIABLE_Emap_21));
      wrapper_arg_7 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_23));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_3)),
        ((java.lang.Object) (wrapper_arg_5)),
        ((java.lang.Object) (wrapper_arg_7))
      };
    }
  }
//  stanford2bel.m:44
  public static java.lang.Object [] convert2_5_p_0(
    maybe.Maybe_1 WN_6,
    stanford2bel.Stfile_0 F_7,
    list.List_1 STATE_VARIABLE_Es_0_16)
  {
//  stanford2bel.m:85
    {
      boolean succeeded = false;
      stanford2bel.Stfile2_0 F2_8 = null;
      list.List_1 STATE_VARIABLE_Es_17 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_31_31 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_32_32 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_33_33 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_34_34 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_35_35 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_36_36 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_37_37 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_42_42 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_43_43 = null;
      java.lang.String Filename_10 = ((stanford2bel.Stfile_0) F_7).F1;
      list.List_1 Ss0_11 = ((stanford2bel.Stfile_0) F_7).F2;
      list.List_1 Ents_12 = ((stanford2bel.Stfile_0) F_7).F3;
      tree234.Tree234_2 Tmap_13 = null;
      tree234.Tree234_2 Emap_14 = null;
      list.List_1 Ss_15 = null;
      /* closure */ java.lang.Object[] V_18_18 = null;
      tree234.Tree234_2 V_19_19 = null;
      tree234.Tree234_2 V_20_20 = null;
      list.List_1 STATE_VARIABLE_Es_21_21 = null;
      /* closure */ java.lang.Object[] V_22_22 = null;
//  stanford2bel.m:87
      java.lang.Object conv5_Tmap_13 = null;
      java.lang.Object conv4_Emap_14 = null;
      java.lang.Object conv3_STATE_VARIABLE_Es_21_21 = null;
//  stanford2bel.m:88
      java.lang.Object conv8_STATE_VARIABLE_Es_17 = null;

//  stanford2bel.m:87
      {
        V_18_18 = new /* closure */ java.lang.Object[] {((java.lang.Object) (stanford2bel.MR_scalar_common_4[0])), ((java.lang.Object) (new AddrOf5_0())), java.lang.Integer.valueOf(1), ((java.lang.Object) (Filename_10))};
      }
      TypeInfo_31_31 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[0]);
      TypeCtorInfo_32_32 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
      {
        V_19_19 = map.init_0_f_0(TypeInfo_31_31, TypeCtorInfo_32_32);
      }
      TypeCtorInfo_33_33 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_entity2_0);
      {
        V_20_20 = map.init_0_f_0(TypeCtorInfo_32_32, TypeCtorInfo_33_33);
      }
      TypeCtorInfo_34_34 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_entity_0);
      TypeInfo_35_35 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[1]);
      TypeInfo_36_36 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[2]);
      TypeInfo_37_37 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.MR_scalar_common_1[3]);
      {
        java.lang.Object [] result = list.foldl3_8_p_0(TypeCtorInfo_34_34, TypeInfo_35_35, TypeInfo_36_36, TypeInfo_37_37, V_18_18, Ents_12, ((java.lang.Object) (V_19_19)), ((java.lang.Object) (V_20_20)), ((java.lang.Object) (STATE_VARIABLE_Es_0_16)));
        conv5_Tmap_13 = (java.lang.Object) result[0];
        conv4_Emap_14 = (java.lang.Object) result[1];
        conv3_STATE_VARIABLE_Es_21_21 = (java.lang.Object) result[2];
      }
      Tmap_13 = ((tree234.Tree234_2) conv5_Tmap_13);
      Emap_14 = ((tree234.Tree234_2) conv4_Emap_14);
      STATE_VARIABLE_Es_21_21 = ((list.List_1) conv3_STATE_VARIABLE_Es_21_21);
//  stanford2bel.m:88
      {
        V_22_22 = new /* closure */ java.lang.Object[] {((java.lang.Object) (stanford2bel.MR_scalar_common_5[0])), ((java.lang.Object) (new AddrOf3_0(2))), java.lang.Integer.valueOf(3), ((java.lang.Object) (WN_6)), ((java.lang.Object) (Filename_10)), ((java.lang.Object) (Tmap_13))};
      }
      TypeCtorInfo_42_42 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_sent_0);
      TypeCtorInfo_43_43 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_sent2_0);
      {
        java.lang.Object [] result = list.map_foldl_5_p_0(TypeCtorInfo_42_42, TypeCtorInfo_43_43, TypeInfo_37_37, V_22_22, Ss0_11, ((java.lang.Object) (STATE_VARIABLE_Es_21_21)));
        Ss_15 = (list.List_1) result[0];
        conv8_STATE_VARIABLE_Es_17 = (java.lang.Object) result[1];
      }
      STATE_VARIABLE_Es_17 = ((list.List_1) conv8_STATE_VARIABLE_Es_17);
//  stanford2bel.m:89
      {
        F2_8 = new stanford2bel.Stfile2_0(Filename_10, Ss_15, Emap_14);
      }
//  stanford2bel.m:85
return new java.lang.Object[] {
        ((java.lang.Object) (F2_8)),
        ((java.lang.Object) (STATE_VARIABLE_Es_17))
      };
    }
//  stanford2bel.m:44
  }
//  stanford2bel.m:41
  public static java.lang.Object [] convert_5_p_0(
    java.lang.String Filename_6,
    java.lang.String DocStr_7,
    list.List_1 STATE_VARIABLE_Es_0_13)
  {
//  stanford2bel.m:68
    {
      boolean succeeded = false;
      list.List_1 Files_8 = null;
      list.List_1 STATE_VARIABLE_Es_14 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_21_21 = null;
      int Max_10 = 0;
      list.List_1 RevFiles_12 = null;
      io.Posn_0 V_15_15 = null;
      list.List_1 V_16_16 = null;
      int V_18_18 = 0;
      int V_19_19 = 0;
      int V_20_20 = 0;
//  stanford2bel.m:70
      io.Posn_0 V_11_11 = null;

//  stanford2bel.m:69
      {
        Max_10 = string.length_2_p_0(DocStr_7);
      }
//  stanford2bel.m:70
      V_18_18 = 0;
      V_19_19 = 0;
      V_20_20 = 0;
      V_15_15 = (io.Posn_0) stanford2bel.MR_scalar_common_2[0];
      V_16_16 = (list.List_1) stanford2bel.MR_scalar_common_3[0];
      {
        java.lang.Object [] result = stanford2bel.read_files_9_p_0(Filename_6, DocStr_7, Max_10, V_15_15, V_16_16, STATE_VARIABLE_Es_0_13);
        V_11_11 = (io.Posn_0) result[0];
        RevFiles_12 = (list.List_1) result[1];
        STATE_VARIABLE_Es_14 = (list.List_1) result[2];
      }
      TypeCtorInfo_21_21 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_stfile_0);
//  stanford2bel.m:71
      {
        Files_8 = list.reverse_2_p_0(TypeCtorInfo_21_21, RevFiles_12);
      }
//  stanford2bel.m:68
return new java.lang.Object[] {
        ((java.lang.Object) (Files_8)),
        ((java.lang.Object) (STATE_VARIABLE_Es_14))
      };
    }
//  stanford2bel.m:41
  }

// ExportDefns

// ExportedEnums

// InitPreds

// FinalPreds

// EnvVarNames
  static {
    if (System.getenv("MERCURY_DEBUG_CLASS_INIT") != null) {
      System.out.println("[stanford2bel end init]");
    }
  }
}
// :- end_module stanford2bel.
