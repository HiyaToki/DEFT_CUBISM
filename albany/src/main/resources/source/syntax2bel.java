//
//
// Automatically generated from syntax2bel.m by the Mercury Compiler,
// version 14.01.1, configured for x86_64-unknown-linux-gnu
//
//

/* :- module syntax2bel. */

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
public class syntax2bel {
  static {
    if (System.getenv("MERCURY_DEBUG_CLASS_INIT") != null) {
      System.out.println("[syntax2bel start init]");
    }
  }

// RttiDefns
  private static final jmercury.runtime.TypeInfo_Struct list__pti_list_1__plain_syntax2bel__type_ctor_info_sent_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct errors__ti_message_1sberrs__type_ctor_info_error_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__pti_list_1__plain_syntax2bel__type_ctor_info_node_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_1 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_2 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_3 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_4 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_5 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_6 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_7 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_8 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_9 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_10 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_11 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_12 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_13 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_14 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_15 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_16 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_17 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_18 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_19 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_20 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_21 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_22 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_23 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_24 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_25 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_26 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_27 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_28 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_29 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_30 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_cat_0_31 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] syntax2bel__enum_value_ordered_cat_0 = new jmercury.runtime.EnumFunctorDesc[32];
  private static final jmercury.runtime.EnumFunctorDesc[] syntax2bel__enum_name_ordered_cat_0 = new jmercury.runtime.EnumFunctorDesc[32];
  private static final int[] syntax2bel__functor_number_map_cat_0 = new int[32];
  public static final jmercury.runtime.TypeCtorInfo_Struct syntax2bel__type_ctor_info_cat_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_ch_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_ch_0_1 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] syntax2bel__enum_value_ordered_ch_0 = new jmercury.runtime.EnumFunctorDesc[2];
  private static final jmercury.runtime.EnumFunctorDesc[] syntax2bel__enum_name_ordered_ch_0 = new jmercury.runtime.EnumFunctorDesc[2];
  private static final int[] syntax2bel__functor_number_map_ch_0 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct syntax2bel__type_ctor_info_ch_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.DuFunctorDesc syntax2bel__du_functor_desc_coref_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] syntax2bel__field_types_coref_0_1 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc syntax2bel__du_functor_desc_coref_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc syntax2bel__du_functor_desc_coref_0_2 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] syntax2bel__du_stag_ordered_coref_0_0 = new jmercury.runtime.DuFunctorDesc[3];
  private static final jmercury.runtime.DuPtagLayout[] syntax2bel__du_ptag_ordered_coref_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] syntax2bel__du_name_ordered_coref_0 = new jmercury.runtime.DuFunctorDesc[3];
  private static final int[] syntax2bel__functor_number_map_coref_0 = new int[3];
  public static final jmercury.runtime.TypeCtorInfo_Struct syntax2bel__type_ctor_info_coref_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.DuFunctorDesc syntax2bel__du_functor_desc_label_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] syntax2bel__field_types_label_0_1 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc syntax2bel__du_functor_desc_label_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] syntax2bel__du_stag_ordered_label_0_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final jmercury.runtime.DuPtagLayout[] syntax2bel__du_ptag_ordered_label_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] syntax2bel__du_name_ordered_label_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final int[] syntax2bel__functor_number_map_label_0 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct syntax2bel__type_ctor_info_label_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] syntax2bel__field_types_node_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc syntax2bel__du_functor_desc_node_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1syntax2bel__type_ctor_info_node_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] syntax2bel__field_types_node_0_1 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc syntax2bel__du_functor_desc_node_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] syntax2bel__du_stag_ordered_node_0_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final jmercury.runtime.DuPtagLayout[] syntax2bel__du_ptag_ordered_node_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] syntax2bel__du_name_ordered_node_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final int[] syntax2bel__functor_number_map_node_0 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct syntax2bel__type_ctor_info_node_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_1 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_2 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_3 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_4 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_5 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_6 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_7 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_8 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_9 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_10 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_11 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_12 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_13 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_14 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_15 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_16 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_17 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_18 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_19 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_20 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_21 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_22 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_23 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_24 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_25 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_26 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_27 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_28 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_29 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_30 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_31 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_32 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_33 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_34 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_35 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_pos_0_36 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] syntax2bel__enum_value_ordered_pos_0 = new jmercury.runtime.EnumFunctorDesc[37];
  private static final jmercury.runtime.EnumFunctorDesc[] syntax2bel__enum_name_ordered_pos_0 = new jmercury.runtime.EnumFunctorDesc[37];
  private static final int[] syntax2bel__functor_number_map_pos_0 = new int[37];
  public static final jmercury.runtime.TypeCtorInfo_Struct syntax2bel__type_ctor_info_pos_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc syntax2bel__enum_functor_desc_semtype_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] syntax2bel__enum_value_ordered_semtype_0 = new jmercury.runtime.EnumFunctorDesc[1];
  private static final jmercury.runtime.EnumFunctorDesc[] syntax2bel__enum_name_ordered_semtype_0 = new jmercury.runtime.EnumFunctorDesc[1];
  private static final int[] syntax2bel__functor_number_map_semtype_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct syntax2bel__type_ctor_info_semtype_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] syntax2bel__field_types_sent_0_0 = new jmercury.runtime.PseudoTypeInfo[4];
  private static final jmercury.runtime.DuFunctorDesc syntax2bel__du_functor_desc_sent_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] syntax2bel__du_stag_ordered_sent_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] syntax2bel__du_ptag_ordered_sent_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] syntax2bel__du_name_ordered_sent_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] syntax2bel__functor_number_map_sent_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct syntax2bel__type_ctor_info_sent_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1syntax2bel__type_ctor_info_sent_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] syntax2bel__field_types_sfile_0_0 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc syntax2bel__du_functor_desc_sfile_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] syntax2bel__du_stag_ordered_sfile_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] syntax2bel__du_ptag_ordered_sfile_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] syntax2bel__du_name_ordered_sfile_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] syntax2bel__functor_number_map_sfile_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct syntax2bel__type_ctor_info_sfile_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.DuFunctorDesc syntax2bel__du_functor_desc_strcoref_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] syntax2bel__field_types_strcoref_0_1 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc syntax2bel__du_functor_desc_strcoref_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc syntax2bel__du_functor_desc_strcoref_0_2 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] syntax2bel__du_stag_ordered_strcoref_0_0 = new jmercury.runtime.DuFunctorDesc[3];
  private static final jmercury.runtime.DuPtagLayout[] syntax2bel__du_ptag_ordered_strcoref_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] syntax2bel__du_name_ordered_strcoref_0 = new jmercury.runtime.DuFunctorDesc[3];
  private static final int[] syntax2bel__functor_number_map_strcoref_0 = new int[3];
  public static final jmercury.runtime.TypeCtorInfo_Struct syntax2bel__type_ctor_info_strcoref_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1syntax2bel__type_ctor_info_strsent_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] syntax2bel__field_types_strfile_0_0 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc syntax2bel__du_functor_desc_strfile_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] syntax2bel__du_stag_ordered_strfile_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] syntax2bel__du_ptag_ordered_strfile_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] syntax2bel__du_name_ordered_strfile_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] syntax2bel__functor_number_map_strfile_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct syntax2bel__type_ctor_info_strfile_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1syntax2bel__type_ctor_info_strnode_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] syntax2bel__field_types_strnode_0_0 = new jmercury.runtime.PseudoTypeInfo[5];
  private static final jmercury.runtime.DuFunctorDesc syntax2bel__du_functor_desc_strnode_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] syntax2bel__du_stag_ordered_strnode_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] syntax2bel__du_ptag_ordered_strnode_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] syntax2bel__du_name_ordered_strnode_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] syntax2bel__functor_number_map_strnode_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct syntax2bel__type_ctor_info_strnode_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] syntax2bel__field_types_strsent_0_0 = new jmercury.runtime.PseudoTypeInfo[5];
  private static final jmercury.runtime.DuFunctorDesc syntax2bel__du_functor_desc_strsent_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] syntax2bel__du_stag_ordered_strsent_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] syntax2bel__du_ptag_ordered_strsent_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] syntax2bel__du_name_ordered_strsent_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] syntax2bel__functor_number_map_strsent_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct syntax2bel__type_ctor_info_strsent_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  static {
    //
    //
    //
    list__pti_list_1__plain_syntax2bel__type_ctor_info_sent_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) syntax2bel.syntax2bel__type_ctor_info_sent_0});
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
		jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.errors__ti_message_1sberrs__type_ctor_info_error_0)});
    //
    list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) syntax2bel.pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0});
    //
    //
    list__pti_list_1__plain_syntax2bel__type_ctor_info_node_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) syntax2bel.syntax2bel__type_ctor_info_node_0});
    //
    syntax2bel__enum_functor_desc_cat_0_0.init("top",
		0);
    //
    syntax2bel__enum_functor_desc_cat_0_1.init("adjp",
		1);
    //
    syntax2bel__enum_functor_desc_cat_0_2.init("advp",
		2);
    //
    syntax2bel__enum_functor_desc_cat_0_3.init("np",
		3);
    //
    syntax2bel__enum_functor_desc_cat_0_4.init("pp",
		4);
    //
    syntax2bel__enum_functor_desc_cat_0_5.init("s",
		5);
    //
    syntax2bel__enum_functor_desc_cat_0_6.init("vp",
		6);
    //
    syntax2bel__enum_functor_desc_cat_0_7.init("sbar",
		7);
    //
    syntax2bel__enum_functor_desc_cat_0_8.init("whnp",
		8);
    //
    syntax2bel__enum_functor_desc_cat_0_9.init("nml",
		9);
    //
    syntax2bel__enum_functor_desc_cat_0_10.init("intj",
		10);
    //
    syntax2bel__enum_functor_desc_cat_0_11.init("sq",
		11);
    //
    syntax2bel__enum_functor_desc_cat_0_12.init("frag",
		12);
    //
    syntax2bel__enum_functor_desc_cat_0_13.init("whadvp",
		13);
    //
    syntax2bel__enum_functor_desc_cat_0_14.init("prt",
		14);
    //
    syntax2bel__enum_functor_desc_cat_0_15.init("sbarq",
		15);
    //
    syntax2bel__enum_functor_desc_cat_0_16.init("qp",
		16);
    //
    syntax2bel__enum_functor_desc_cat_0_17.init("prn",
		17);
    //
    syntax2bel__enum_functor_desc_cat_0_18.init("sinv",
		18);
    //
    syntax2bel__enum_functor_desc_cat_0_19.init("conjp",
		19);
    //
    syntax2bel__enum_functor_desc_cat_0_20.init("ucp",
		20);
    //
    syntax2bel__enum_functor_desc_cat_0_21.init("inc",
		21);
    //
    syntax2bel__enum_functor_desc_cat_0_22.init("x",
		22);
    //
    syntax2bel__enum_functor_desc_cat_0_23.init("whadjp",
		23);
    //
    syntax2bel__enum_functor_desc_cat_0_24.init("whpp",
		24);
    //
    syntax2bel__enum_functor_desc_cat_0_25.init("lst",
		25);
    //
    syntax2bel__enum_functor_desc_cat_0_26.init("nx",
		26);
    //
    syntax2bel__enum_functor_desc_cat_0_27.init("nac",
		27);
    //
    syntax2bel__enum_functor_desc_cat_0_28.init("rrc",
		28);
    //
    syntax2bel__enum_functor_desc_cat_0_29.init("aux",
		29);
    //
    syntax2bel__enum_functor_desc_cat_0_30.init("neg",
		30);
    //
    syntax2bel__enum_functor_desc_cat_0_31.init("edited",
		31);
    //
    syntax2bel__enum_value_ordered_cat_0[0] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_0;
    syntax2bel__enum_value_ordered_cat_0[1] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_1;
    syntax2bel__enum_value_ordered_cat_0[2] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_2;
    syntax2bel__enum_value_ordered_cat_0[3] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_3;
    syntax2bel__enum_value_ordered_cat_0[4] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_4;
    syntax2bel__enum_value_ordered_cat_0[5] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_5;
    syntax2bel__enum_value_ordered_cat_0[6] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_6;
    syntax2bel__enum_value_ordered_cat_0[7] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_7;
    syntax2bel__enum_value_ordered_cat_0[8] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_8;
    syntax2bel__enum_value_ordered_cat_0[9] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_9;
    syntax2bel__enum_value_ordered_cat_0[10] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_10;
    syntax2bel__enum_value_ordered_cat_0[11] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_11;
    syntax2bel__enum_value_ordered_cat_0[12] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_12;
    syntax2bel__enum_value_ordered_cat_0[13] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_13;
    syntax2bel__enum_value_ordered_cat_0[14] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_14;
    syntax2bel__enum_value_ordered_cat_0[15] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_15;
    syntax2bel__enum_value_ordered_cat_0[16] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_16;
    syntax2bel__enum_value_ordered_cat_0[17] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_17;
    syntax2bel__enum_value_ordered_cat_0[18] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_18;
    syntax2bel__enum_value_ordered_cat_0[19] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_19;
    syntax2bel__enum_value_ordered_cat_0[20] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_20;
    syntax2bel__enum_value_ordered_cat_0[21] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_21;
    syntax2bel__enum_value_ordered_cat_0[22] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_22;
    syntax2bel__enum_value_ordered_cat_0[23] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_23;
    syntax2bel__enum_value_ordered_cat_0[24] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_24;
    syntax2bel__enum_value_ordered_cat_0[25] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_25;
    syntax2bel__enum_value_ordered_cat_0[26] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_26;
    syntax2bel__enum_value_ordered_cat_0[27] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_27;
    syntax2bel__enum_value_ordered_cat_0[28] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_28;
    syntax2bel__enum_value_ordered_cat_0[29] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_29;
    syntax2bel__enum_value_ordered_cat_0[30] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_30;
    syntax2bel__enum_value_ordered_cat_0[31] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_31;
    //
    syntax2bel__enum_name_ordered_cat_0[0] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_1;
    syntax2bel__enum_name_ordered_cat_0[1] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_2;
    syntax2bel__enum_name_ordered_cat_0[2] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_29;
    syntax2bel__enum_name_ordered_cat_0[3] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_19;
    syntax2bel__enum_name_ordered_cat_0[4] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_31;
    syntax2bel__enum_name_ordered_cat_0[5] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_12;
    syntax2bel__enum_name_ordered_cat_0[6] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_21;
    syntax2bel__enum_name_ordered_cat_0[7] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_10;
    syntax2bel__enum_name_ordered_cat_0[8] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_25;
    syntax2bel__enum_name_ordered_cat_0[9] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_27;
    syntax2bel__enum_name_ordered_cat_0[10] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_30;
    syntax2bel__enum_name_ordered_cat_0[11] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_9;
    syntax2bel__enum_name_ordered_cat_0[12] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_3;
    syntax2bel__enum_name_ordered_cat_0[13] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_26;
    syntax2bel__enum_name_ordered_cat_0[14] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_4;
    syntax2bel__enum_name_ordered_cat_0[15] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_17;
    syntax2bel__enum_name_ordered_cat_0[16] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_14;
    syntax2bel__enum_name_ordered_cat_0[17] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_16;
    syntax2bel__enum_name_ordered_cat_0[18] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_28;
    syntax2bel__enum_name_ordered_cat_0[19] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_5;
    syntax2bel__enum_name_ordered_cat_0[20] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_7;
    syntax2bel__enum_name_ordered_cat_0[21] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_15;
    syntax2bel__enum_name_ordered_cat_0[22] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_18;
    syntax2bel__enum_name_ordered_cat_0[23] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_11;
    syntax2bel__enum_name_ordered_cat_0[24] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_0;
    syntax2bel__enum_name_ordered_cat_0[25] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_20;
    syntax2bel__enum_name_ordered_cat_0[26] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_6;
    syntax2bel__enum_name_ordered_cat_0[27] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_23;
    syntax2bel__enum_name_ordered_cat_0[28] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_13;
    syntax2bel__enum_name_ordered_cat_0[29] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_8;
    syntax2bel__enum_name_ordered_cat_0[30] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_24;
    syntax2bel__enum_name_ordered_cat_0[31] = syntax2bel.syntax2bel__enum_functor_desc_cat_0_22;
    //
    syntax2bel__functor_number_map_cat_0[0] = 24;
    syntax2bel__functor_number_map_cat_0[1] = 0;
    syntax2bel__functor_number_map_cat_0[2] = 1;
    syntax2bel__functor_number_map_cat_0[3] = 12;
    syntax2bel__functor_number_map_cat_0[4] = 14;
    syntax2bel__functor_number_map_cat_0[5] = 19;
    syntax2bel__functor_number_map_cat_0[6] = 26;
    syntax2bel__functor_number_map_cat_0[7] = 20;
    syntax2bel__functor_number_map_cat_0[8] = 29;
    syntax2bel__functor_number_map_cat_0[9] = 11;
    syntax2bel__functor_number_map_cat_0[10] = 7;
    syntax2bel__functor_number_map_cat_0[11] = 23;
    syntax2bel__functor_number_map_cat_0[12] = 5;
    syntax2bel__functor_number_map_cat_0[13] = 28;
    syntax2bel__functor_number_map_cat_0[14] = 16;
    syntax2bel__functor_number_map_cat_0[15] = 21;
    syntax2bel__functor_number_map_cat_0[16] = 17;
    syntax2bel__functor_number_map_cat_0[17] = 15;
    syntax2bel__functor_number_map_cat_0[18] = 22;
    syntax2bel__functor_number_map_cat_0[19] = 3;
    syntax2bel__functor_number_map_cat_0[20] = 25;
    syntax2bel__functor_number_map_cat_0[21] = 6;
    syntax2bel__functor_number_map_cat_0[22] = 31;
    syntax2bel__functor_number_map_cat_0[23] = 27;
    syntax2bel__functor_number_map_cat_0[24] = 30;
    syntax2bel__functor_number_map_cat_0[25] = 8;
    syntax2bel__functor_number_map_cat_0[26] = 13;
    syntax2bel__functor_number_map_cat_0[27] = 9;
    syntax2bel__functor_number_map_cat_0[28] = 18;
    syntax2bel__functor_number_map_cat_0[29] = 2;
    syntax2bel__functor_number_map_cat_0[30] = 10;
    syntax2bel__functor_number_map_cat_0[31] = 4;
    //
    syntax2bel__type_ctor_info_cat_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_ENUM,
		((java.lang.Object) (new AddrOf2_0(0))),
		((java.lang.Object) (new AddrOf2_0(1))),
		"syntax2bel",
		"cat",
		new jmercury.runtime.TypeFunctors(syntax2bel.syntax2bel__enum_name_ordered_cat_0),
		new jmercury.runtime.TypeLayout(syntax2bel.syntax2bel__enum_value_ordered_cat_0),
		32,
		4,
		syntax2bel.syntax2bel__functor_number_map_cat_0);
    //
    syntax2bel__enum_functor_desc_ch_0_0.init("c",
		0);
    //
    syntax2bel__enum_functor_desc_ch_0_1.init("s",
		1);
    //
    syntax2bel__enum_value_ordered_ch_0[0] = syntax2bel.syntax2bel__enum_functor_desc_ch_0_0;
    syntax2bel__enum_value_ordered_ch_0[1] = syntax2bel.syntax2bel__enum_functor_desc_ch_0_1;
    //
    syntax2bel__enum_name_ordered_ch_0[0] = syntax2bel.syntax2bel__enum_functor_desc_ch_0_0;
    syntax2bel__enum_name_ordered_ch_0[1] = syntax2bel.syntax2bel__enum_functor_desc_ch_0_1;
    //
    syntax2bel__functor_number_map_ch_0[0] = 0;
    syntax2bel__functor_number_map_ch_0[1] = 1;
    //
    syntax2bel__type_ctor_info_ch_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_ENUM,
		((java.lang.Object) (new AddrOf2_0(2))),
		((java.lang.Object) (new AddrOf2_0(3))),
		"syntax2bel",
		"ch",
		new jmercury.runtime.TypeFunctors(syntax2bel.syntax2bel__enum_name_ordered_ch_0),
		new jmercury.runtime.TypeLayout(syntax2bel.syntax2bel__enum_value_ordered_ch_0),
		2,
		4,
		syntax2bel.syntax2bel__functor_number_map_ch_0);
    //
    syntax2bel__du_functor_desc_coref_0_0.init("none",
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
    //
    syntax2bel__field_types_coref_0_1[0] = (jmercury.runtime.PseudoTypeInfo) syntax2bel.syntax2bel__type_ctor_info_semtype_0;
    syntax2bel__field_types_coref_0_1[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    syntax2bel__du_functor_desc_coref_0_1.init("coref",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		2,
		1,
		syntax2bel.syntax2bel__field_types_coref_0_1,
		null,
		null,
		null);
    //
    syntax2bel__du_functor_desc_coref_0_2.init("unknown",
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
    syntax2bel__du_stag_ordered_coref_0_0[0] = syntax2bel.syntax2bel__du_functor_desc_coref_0_0;
    syntax2bel__du_stag_ordered_coref_0_0[1] = syntax2bel.syntax2bel__du_functor_desc_coref_0_2;
    syntax2bel__du_stag_ordered_coref_0_0[2] = syntax2bel.syntax2bel__du_functor_desc_coref_0_1;
    //
    syntax2bel__du_ptag_ordered_coref_0[0] = new jmercury.runtime.DuPtagLayout(3,
		private_builtin.MR_SECTAG_REMOTE,
		syntax2bel.syntax2bel__du_stag_ordered_coref_0_0);
    //
    syntax2bel__du_name_ordered_coref_0[0] = syntax2bel.syntax2bel__du_functor_desc_coref_0_1;
    syntax2bel__du_name_ordered_coref_0[1] = syntax2bel.syntax2bel__du_functor_desc_coref_0_0;
    syntax2bel__du_name_ordered_coref_0[2] = syntax2bel.syntax2bel__du_functor_desc_coref_0_2;
    //
    syntax2bel__functor_number_map_coref_0[0] = 1;
    syntax2bel__functor_number_map_coref_0[1] = 0;
    syntax2bel__functor_number_map_coref_0[2] = 2;
    //
    syntax2bel__type_ctor_info_coref_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(4))),
		((java.lang.Object) (new AddrOf2_0(5))),
		"syntax2bel",
		"coref",
		new jmercury.runtime.TypeFunctors(syntax2bel.syntax2bel__du_name_ordered_coref_0),
		new jmercury.runtime.TypeLayout(syntax2bel.syntax2bel__du_ptag_ordered_coref_0),
		3,
		4,
		syntax2bel.syntax2bel__functor_number_map_coref_0);
    //
    syntax2bel__du_functor_desc_label_0_0.init("empty",
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
    //
    syntax2bel__field_types_label_0_1[0] = (jmercury.runtime.PseudoTypeInfo) syntax2bel.syntax2bel__type_ctor_info_ch_0;
    syntax2bel__field_types_label_0_1[1] = (jmercury.runtime.PseudoTypeInfo) syntax2bel.syntax2bel__type_ctor_info_cat_0;
    //
    syntax2bel__du_functor_desc_label_0_1.init("p",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		syntax2bel.syntax2bel__field_types_label_0_1,
		null,
		null,
		null);
    //
    syntax2bel__du_stag_ordered_label_0_0[0] = syntax2bel.syntax2bel__du_functor_desc_label_0_0;
    syntax2bel__du_stag_ordered_label_0_0[1] = syntax2bel.syntax2bel__du_functor_desc_label_0_1;
    //
    syntax2bel__du_ptag_ordered_label_0[0] = new jmercury.runtime.DuPtagLayout(2,
		private_builtin.MR_SECTAG_REMOTE,
		syntax2bel.syntax2bel__du_stag_ordered_label_0_0);
    //
    syntax2bel__du_name_ordered_label_0[0] = syntax2bel.syntax2bel__du_functor_desc_label_0_0;
    syntax2bel__du_name_ordered_label_0[1] = syntax2bel.syntax2bel__du_functor_desc_label_0_1;
    //
    syntax2bel__functor_number_map_label_0[0] = 0;
    syntax2bel__functor_number_map_label_0[1] = 1;
    //
    syntax2bel__type_ctor_info_label_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(6))),
		((java.lang.Object) (new AddrOf2_0(7))),
		"syntax2bel",
		"label",
		new jmercury.runtime.TypeFunctors(syntax2bel.syntax2bel__du_name_ordered_label_0),
		new jmercury.runtime.TypeLayout(syntax2bel.syntax2bel__du_ptag_ordered_label_0),
		2,
		4,
		syntax2bel.syntax2bel__functor_number_map_label_0);
    //
    //
    //
    //
    syntax2bel__field_types_node_0_0[0] = (jmercury.runtime.PseudoTypeInfo) syntax2bel.syntax2bel__type_ctor_info_pos_0;
    syntax2bel__field_types_node_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    syntax2bel__field_types_node_0_0[2] = (jmercury.runtime.PseudoTypeInfo) syntax2bel.syntax2bel__type_ctor_info_coref_0;
    //
    syntax2bel__du_functor_desc_node_0_0.init("leaf",
		3,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		0,
		syntax2bel.syntax2bel__field_types_node_0_0,
		null,
		null,
		null);
    //
    list__ti_list_1syntax2bel__type_ctor_info_node_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.syntax2bel__type_ctor_info_node_0)});
    //
    //
    syntax2bel__field_types_node_0_1[0] = (jmercury.runtime.PseudoTypeInfo) syntax2bel.syntax2bel__type_ctor_info_cat_0;
    syntax2bel__field_types_node_0_1[1] = (jmercury.runtime.PseudoTypeInfo) syntax2bel.syntax2bel__type_ctor_info_label_0;
    syntax2bel__field_types_node_0_1[2] = (jmercury.runtime.PseudoTypeInfo) syntax2bel.list__ti_list_1syntax2bel__type_ctor_info_node_0;
    //
    syntax2bel__du_functor_desc_node_0_1.init("nt",
		3,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		syntax2bel.syntax2bel__field_types_node_0_1,
		null,
		null,
		null);
    //
    syntax2bel__du_stag_ordered_node_0_0[0] = syntax2bel.syntax2bel__du_functor_desc_node_0_0;
    syntax2bel__du_stag_ordered_node_0_0[1] = syntax2bel.syntax2bel__du_functor_desc_node_0_1;
    //
    syntax2bel__du_ptag_ordered_node_0[0] = new jmercury.runtime.DuPtagLayout(2,
		private_builtin.MR_SECTAG_REMOTE,
		syntax2bel.syntax2bel__du_stag_ordered_node_0_0);
    //
    syntax2bel__du_name_ordered_node_0[0] = syntax2bel.syntax2bel__du_functor_desc_node_0_0;
    syntax2bel__du_name_ordered_node_0[1] = syntax2bel.syntax2bel__du_functor_desc_node_0_1;
    //
    syntax2bel__functor_number_map_node_0[0] = 0;
    syntax2bel__functor_number_map_node_0[1] = 1;
    //
    syntax2bel__type_ctor_info_node_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(8))),
		((java.lang.Object) (new AddrOf2_0(9))),
		"syntax2bel",
		"node",
		new jmercury.runtime.TypeFunctors(syntax2bel.syntax2bel__du_name_ordered_node_0),
		new jmercury.runtime.TypeLayout(syntax2bel.syntax2bel__du_ptag_ordered_node_0),
		2,
		4,
		syntax2bel.syntax2bel__functor_number_map_node_0);
    //
    syntax2bel__enum_functor_desc_pos_0_0.init("cc",
		0);
    //
    syntax2bel__enum_functor_desc_pos_0_1.init("cd",
		1);
    //
    syntax2bel__enum_functor_desc_pos_0_2.init("dt",
		2);
    //
    syntax2bel__enum_functor_desc_pos_0_3.init("ex",
		3);
    //
    syntax2bel__enum_functor_desc_pos_0_4.init("fw",
		4);
    //
    syntax2bel__enum_functor_desc_pos_0_5.init("in",
		5);
    //
    syntax2bel__enum_functor_desc_pos_0_6.init("jj",
		6);
    //
    syntax2bel__enum_functor_desc_pos_0_7.init("jjr",
		7);
    //
    syntax2bel__enum_functor_desc_pos_0_8.init("jjs",
		8);
    //
    syntax2bel__enum_functor_desc_pos_0_9.init("ls",
		9);
    //
    syntax2bel__enum_functor_desc_pos_0_10.init("md",
		10);
    //
    syntax2bel__enum_functor_desc_pos_0_11.init("nn",
		11);
    //
    syntax2bel__enum_functor_desc_pos_0_12.init("nnp",
		12);
    //
    syntax2bel__enum_functor_desc_pos_0_13.init("nnps",
		13);
    //
    syntax2bel__enum_functor_desc_pos_0_14.init("nns",
		14);
    //
    syntax2bel__enum_functor_desc_pos_0_15.init("pdt",
		15);
    //
    syntax2bel__enum_functor_desc_pos_0_16.init("pos",
		16);
    //
    syntax2bel__enum_functor_desc_pos_0_17.init("prp",
		17);
    //
    syntax2bel__enum_functor_desc_pos_0_18.init("prps",
		18);
    //
    syntax2bel__enum_functor_desc_pos_0_19.init("rb",
		19);
    //
    syntax2bel__enum_functor_desc_pos_0_20.init("rbr",
		20);
    //
    syntax2bel__enum_functor_desc_pos_0_21.init("rbs",
		21);
    //
    syntax2bel__enum_functor_desc_pos_0_22.init("rp",
		22);
    //
    syntax2bel__enum_functor_desc_pos_0_23.init("sym",
		23);
    //
    syntax2bel__enum_functor_desc_pos_0_24.init("to",
		24);
    //
    syntax2bel__enum_functor_desc_pos_0_25.init("uh",
		25);
    //
    syntax2bel__enum_functor_desc_pos_0_26.init("vb",
		26);
    //
    syntax2bel__enum_functor_desc_pos_0_27.init("vbd",
		27);
    //
    syntax2bel__enum_functor_desc_pos_0_28.init("vbg",
		28);
    //
    syntax2bel__enum_functor_desc_pos_0_29.init("vbn",
		29);
    //
    syntax2bel__enum_functor_desc_pos_0_30.init("vbp",
		30);
    //
    syntax2bel__enum_functor_desc_pos_0_31.init("vbz",
		31);
    //
    syntax2bel__enum_functor_desc_pos_0_32.init("wdt",
		32);
    //
    syntax2bel__enum_functor_desc_pos_0_33.init("wp",
		33);
    //
    syntax2bel__enum_functor_desc_pos_0_34.init("wps",
		34);
    //
    syntax2bel__enum_functor_desc_pos_0_35.init("wrb",
		35);
    //
    syntax2bel__enum_functor_desc_pos_0_36.init("punc",
		36);
    //
    syntax2bel__enum_value_ordered_pos_0[0] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_0;
    syntax2bel__enum_value_ordered_pos_0[1] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_1;
    syntax2bel__enum_value_ordered_pos_0[2] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_2;
    syntax2bel__enum_value_ordered_pos_0[3] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_3;
    syntax2bel__enum_value_ordered_pos_0[4] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_4;
    syntax2bel__enum_value_ordered_pos_0[5] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_5;
    syntax2bel__enum_value_ordered_pos_0[6] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_6;
    syntax2bel__enum_value_ordered_pos_0[7] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_7;
    syntax2bel__enum_value_ordered_pos_0[8] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_8;
    syntax2bel__enum_value_ordered_pos_0[9] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_9;
    syntax2bel__enum_value_ordered_pos_0[10] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_10;
    syntax2bel__enum_value_ordered_pos_0[11] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_11;
    syntax2bel__enum_value_ordered_pos_0[12] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_12;
    syntax2bel__enum_value_ordered_pos_0[13] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_13;
    syntax2bel__enum_value_ordered_pos_0[14] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_14;
    syntax2bel__enum_value_ordered_pos_0[15] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_15;
    syntax2bel__enum_value_ordered_pos_0[16] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_16;
    syntax2bel__enum_value_ordered_pos_0[17] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_17;
    syntax2bel__enum_value_ordered_pos_0[18] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_18;
    syntax2bel__enum_value_ordered_pos_0[19] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_19;
    syntax2bel__enum_value_ordered_pos_0[20] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_20;
    syntax2bel__enum_value_ordered_pos_0[21] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_21;
    syntax2bel__enum_value_ordered_pos_0[22] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_22;
    syntax2bel__enum_value_ordered_pos_0[23] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_23;
    syntax2bel__enum_value_ordered_pos_0[24] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_24;
    syntax2bel__enum_value_ordered_pos_0[25] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_25;
    syntax2bel__enum_value_ordered_pos_0[26] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_26;
    syntax2bel__enum_value_ordered_pos_0[27] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_27;
    syntax2bel__enum_value_ordered_pos_0[28] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_28;
    syntax2bel__enum_value_ordered_pos_0[29] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_29;
    syntax2bel__enum_value_ordered_pos_0[30] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_30;
    syntax2bel__enum_value_ordered_pos_0[31] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_31;
    syntax2bel__enum_value_ordered_pos_0[32] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_32;
    syntax2bel__enum_value_ordered_pos_0[33] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_33;
    syntax2bel__enum_value_ordered_pos_0[34] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_34;
    syntax2bel__enum_value_ordered_pos_0[35] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_35;
    syntax2bel__enum_value_ordered_pos_0[36] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_36;
    //
    syntax2bel__enum_name_ordered_pos_0[0] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_0;
    syntax2bel__enum_name_ordered_pos_0[1] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_1;
    syntax2bel__enum_name_ordered_pos_0[2] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_2;
    syntax2bel__enum_name_ordered_pos_0[3] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_3;
    syntax2bel__enum_name_ordered_pos_0[4] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_4;
    syntax2bel__enum_name_ordered_pos_0[5] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_5;
    syntax2bel__enum_name_ordered_pos_0[6] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_6;
    syntax2bel__enum_name_ordered_pos_0[7] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_7;
    syntax2bel__enum_name_ordered_pos_0[8] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_8;
    syntax2bel__enum_name_ordered_pos_0[9] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_9;
    syntax2bel__enum_name_ordered_pos_0[10] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_10;
    syntax2bel__enum_name_ordered_pos_0[11] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_11;
    syntax2bel__enum_name_ordered_pos_0[12] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_12;
    syntax2bel__enum_name_ordered_pos_0[13] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_13;
    syntax2bel__enum_name_ordered_pos_0[14] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_14;
    syntax2bel__enum_name_ordered_pos_0[15] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_15;
    syntax2bel__enum_name_ordered_pos_0[16] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_16;
    syntax2bel__enum_name_ordered_pos_0[17] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_17;
    syntax2bel__enum_name_ordered_pos_0[18] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_18;
    syntax2bel__enum_name_ordered_pos_0[19] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_36;
    syntax2bel__enum_name_ordered_pos_0[20] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_19;
    syntax2bel__enum_name_ordered_pos_0[21] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_20;
    syntax2bel__enum_name_ordered_pos_0[22] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_21;
    syntax2bel__enum_name_ordered_pos_0[23] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_22;
    syntax2bel__enum_name_ordered_pos_0[24] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_23;
    syntax2bel__enum_name_ordered_pos_0[25] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_24;
    syntax2bel__enum_name_ordered_pos_0[26] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_25;
    syntax2bel__enum_name_ordered_pos_0[27] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_26;
    syntax2bel__enum_name_ordered_pos_0[28] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_27;
    syntax2bel__enum_name_ordered_pos_0[29] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_28;
    syntax2bel__enum_name_ordered_pos_0[30] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_29;
    syntax2bel__enum_name_ordered_pos_0[31] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_30;
    syntax2bel__enum_name_ordered_pos_0[32] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_31;
    syntax2bel__enum_name_ordered_pos_0[33] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_32;
    syntax2bel__enum_name_ordered_pos_0[34] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_33;
    syntax2bel__enum_name_ordered_pos_0[35] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_34;
    syntax2bel__enum_name_ordered_pos_0[36] = syntax2bel.syntax2bel__enum_functor_desc_pos_0_35;
    //
    syntax2bel__functor_number_map_pos_0[0] = 0;
    syntax2bel__functor_number_map_pos_0[1] = 1;
    syntax2bel__functor_number_map_pos_0[2] = 2;
    syntax2bel__functor_number_map_pos_0[3] = 3;
    syntax2bel__functor_number_map_pos_0[4] = 4;
    syntax2bel__functor_number_map_pos_0[5] = 5;
    syntax2bel__functor_number_map_pos_0[6] = 6;
    syntax2bel__functor_number_map_pos_0[7] = 7;
    syntax2bel__functor_number_map_pos_0[8] = 8;
    syntax2bel__functor_number_map_pos_0[9] = 9;
    syntax2bel__functor_number_map_pos_0[10] = 10;
    syntax2bel__functor_number_map_pos_0[11] = 11;
    syntax2bel__functor_number_map_pos_0[12] = 12;
    syntax2bel__functor_number_map_pos_0[13] = 13;
    syntax2bel__functor_number_map_pos_0[14] = 14;
    syntax2bel__functor_number_map_pos_0[15] = 15;
    syntax2bel__functor_number_map_pos_0[16] = 16;
    syntax2bel__functor_number_map_pos_0[17] = 17;
    syntax2bel__functor_number_map_pos_0[18] = 18;
    syntax2bel__functor_number_map_pos_0[19] = 20;
    syntax2bel__functor_number_map_pos_0[20] = 21;
    syntax2bel__functor_number_map_pos_0[21] = 22;
    syntax2bel__functor_number_map_pos_0[22] = 23;
    syntax2bel__functor_number_map_pos_0[23] = 24;
    syntax2bel__functor_number_map_pos_0[24] = 25;
    syntax2bel__functor_number_map_pos_0[25] = 26;
    syntax2bel__functor_number_map_pos_0[26] = 27;
    syntax2bel__functor_number_map_pos_0[27] = 28;
    syntax2bel__functor_number_map_pos_0[28] = 29;
    syntax2bel__functor_number_map_pos_0[29] = 30;
    syntax2bel__functor_number_map_pos_0[30] = 31;
    syntax2bel__functor_number_map_pos_0[31] = 32;
    syntax2bel__functor_number_map_pos_0[32] = 33;
    syntax2bel__functor_number_map_pos_0[33] = 34;
    syntax2bel__functor_number_map_pos_0[34] = 35;
    syntax2bel__functor_number_map_pos_0[35] = 36;
    syntax2bel__functor_number_map_pos_0[36] = 19;
    //
    syntax2bel__type_ctor_info_pos_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_ENUM,
		((java.lang.Object) (new AddrOf2_0(10))),
		((java.lang.Object) (new AddrOf2_0(11))),
		"syntax2bel",
		"pos",
		new jmercury.runtime.TypeFunctors(syntax2bel.syntax2bel__enum_name_ordered_pos_0),
		new jmercury.runtime.TypeLayout(syntax2bel.syntax2bel__enum_value_ordered_pos_0),
		37,
		4,
		syntax2bel.syntax2bel__functor_number_map_pos_0);
    //
    syntax2bel__enum_functor_desc_semtype_0_0.init("semtype",
		0);
    //
    syntax2bel__enum_value_ordered_semtype_0[0] = syntax2bel.syntax2bel__enum_functor_desc_semtype_0_0;
    //
    syntax2bel__enum_name_ordered_semtype_0[0] = syntax2bel.syntax2bel__enum_functor_desc_semtype_0_0;
    //
    syntax2bel__functor_number_map_semtype_0[0] = 0;
    //
    syntax2bel__type_ctor_info_semtype_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_DUMMY,
		((java.lang.Object) (new AddrOf2_0(12))),
		((java.lang.Object) (new AddrOf2_0(13))),
		"syntax2bel",
		"semtype",
		new jmercury.runtime.TypeFunctors(syntax2bel.syntax2bel__enum_name_ordered_semtype_0),
		new jmercury.runtime.TypeLayout(syntax2bel.syntax2bel__enum_value_ordered_semtype_0),
		1,
		4,
		syntax2bel.syntax2bel__functor_number_map_semtype_0);
    //
    syntax2bel__field_types_sent_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    syntax2bel__field_types_sent_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    syntax2bel__field_types_sent_0_0[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    syntax2bel__field_types_sent_0_0[3] = (jmercury.runtime.PseudoTypeInfo) syntax2bel.syntax2bel__type_ctor_info_node_0;
    //
    syntax2bel__du_functor_desc_sent_0_0.init("sentence",
		4,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		syntax2bel.syntax2bel__field_types_sent_0_0,
		null,
		null,
		null);
    //
    syntax2bel__du_stag_ordered_sent_0_0[0] = syntax2bel.syntax2bel__du_functor_desc_sent_0_0;
    //
    syntax2bel__du_ptag_ordered_sent_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		syntax2bel.syntax2bel__du_stag_ordered_sent_0_0);
    //
    syntax2bel__du_name_ordered_sent_0[0] = syntax2bel.syntax2bel__du_functor_desc_sent_0_0;
    //
    syntax2bel__functor_number_map_sent_0[0] = 0;
    //
    syntax2bel__type_ctor_info_sent_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(14))),
		((java.lang.Object) (new AddrOf2_0(15))),
		"syntax2bel",
		"sent",
		new jmercury.runtime.TypeFunctors(syntax2bel.syntax2bel__du_name_ordered_sent_0),
		new jmercury.runtime.TypeLayout(syntax2bel.syntax2bel__du_ptag_ordered_sent_0),
		1,
		4,
		syntax2bel.syntax2bel__functor_number_map_sent_0);
    //
    list__ti_list_1syntax2bel__type_ctor_info_sent_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.syntax2bel__type_ctor_info_sent_0)});
    //
    syntax2bel__field_types_sfile_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    syntax2bel__field_types_sfile_0_0[1] = (jmercury.runtime.PseudoTypeInfo) syntax2bel.list__ti_list_1syntax2bel__type_ctor_info_sent_0;
    //
    syntax2bel__du_functor_desc_sfile_0_0.init("file",
		2,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		syntax2bel.syntax2bel__field_types_sfile_0_0,
		null,
		null,
		null);
    //
    syntax2bel__du_stag_ordered_sfile_0_0[0] = syntax2bel.syntax2bel__du_functor_desc_sfile_0_0;
    //
    syntax2bel__du_ptag_ordered_sfile_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		syntax2bel.syntax2bel__du_stag_ordered_sfile_0_0);
    //
    syntax2bel__du_name_ordered_sfile_0[0] = syntax2bel.syntax2bel__du_functor_desc_sfile_0_0;
    //
    syntax2bel__functor_number_map_sfile_0[0] = 0;
    //
    syntax2bel__type_ctor_info_sfile_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(16))),
		((java.lang.Object) (new AddrOf2_0(17))),
		"syntax2bel",
		"sfile",
		new jmercury.runtime.TypeFunctors(syntax2bel.syntax2bel__du_name_ordered_sfile_0),
		new jmercury.runtime.TypeLayout(syntax2bel.syntax2bel__du_ptag_ordered_sfile_0),
		1,
		4,
		syntax2bel.syntax2bel__functor_number_map_sfile_0);
    //
    syntax2bel__du_functor_desc_strcoref_0_0.init("none",
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
    syntax2bel__field_types_strcoref_0_1[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    syntax2bel__field_types_strcoref_0_1[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    syntax2bel__du_functor_desc_strcoref_0_1.init("coref",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		2,
		1,
		syntax2bel.syntax2bel__field_types_strcoref_0_1,
		null,
		null,
		null);
    //
    syntax2bel__du_functor_desc_strcoref_0_2.init("unknown",
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
    syntax2bel__du_stag_ordered_strcoref_0_0[0] = syntax2bel.syntax2bel__du_functor_desc_strcoref_0_0;
    syntax2bel__du_stag_ordered_strcoref_0_0[1] = syntax2bel.syntax2bel__du_functor_desc_strcoref_0_2;
    syntax2bel__du_stag_ordered_strcoref_0_0[2] = syntax2bel.syntax2bel__du_functor_desc_strcoref_0_1;
    //
    syntax2bel__du_ptag_ordered_strcoref_0[0] = new jmercury.runtime.DuPtagLayout(3,
		private_builtin.MR_SECTAG_REMOTE,
		syntax2bel.syntax2bel__du_stag_ordered_strcoref_0_0);
    //
    syntax2bel__du_name_ordered_strcoref_0[0] = syntax2bel.syntax2bel__du_functor_desc_strcoref_0_1;
    syntax2bel__du_name_ordered_strcoref_0[1] = syntax2bel.syntax2bel__du_functor_desc_strcoref_0_0;
    syntax2bel__du_name_ordered_strcoref_0[2] = syntax2bel.syntax2bel__du_functor_desc_strcoref_0_2;
    //
    syntax2bel__functor_number_map_strcoref_0[0] = 1;
    syntax2bel__functor_number_map_strcoref_0[1] = 0;
    syntax2bel__functor_number_map_strcoref_0[2] = 2;
    //
    syntax2bel__type_ctor_info_strcoref_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(18))),
		((java.lang.Object) (new AddrOf2_0(19))),
		"syntax2bel",
		"strcoref",
		new jmercury.runtime.TypeFunctors(syntax2bel.syntax2bel__du_name_ordered_strcoref_0),
		new jmercury.runtime.TypeLayout(syntax2bel.syntax2bel__du_ptag_ordered_strcoref_0),
		3,
		4,
		syntax2bel.syntax2bel__functor_number_map_strcoref_0);
    //
    //
    list__ti_list_1syntax2bel__type_ctor_info_strsent_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.syntax2bel__type_ctor_info_strsent_0)});
    //
    syntax2bel__field_types_strfile_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    syntax2bel__field_types_strfile_0_0[1] = (jmercury.runtime.PseudoTypeInfo) syntax2bel.list__ti_list_1syntax2bel__type_ctor_info_strsent_0;
    //
    syntax2bel__du_functor_desc_strfile_0_0.init("file",
		2,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		syntax2bel.syntax2bel__field_types_strfile_0_0,
		null,
		null,
		null);
    //
    syntax2bel__du_stag_ordered_strfile_0_0[0] = syntax2bel.syntax2bel__du_functor_desc_strfile_0_0;
    //
    syntax2bel__du_ptag_ordered_strfile_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		syntax2bel.syntax2bel__du_stag_ordered_strfile_0_0);
    //
    syntax2bel__du_name_ordered_strfile_0[0] = syntax2bel.syntax2bel__du_functor_desc_strfile_0_0;
    //
    syntax2bel__functor_number_map_strfile_0[0] = 0;
    //
    syntax2bel__type_ctor_info_strfile_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(20))),
		((java.lang.Object) (new AddrOf2_0(21))),
		"syntax2bel",
		"strfile",
		new jmercury.runtime.TypeFunctors(syntax2bel.syntax2bel__du_name_ordered_strfile_0),
		new jmercury.runtime.TypeLayout(syntax2bel.syntax2bel__du_ptag_ordered_strfile_0),
		1,
		4,
		syntax2bel.syntax2bel__functor_number_map_strfile_0);
    //
    //
    list__ti_list_1syntax2bel__type_ctor_info_strnode_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.syntax2bel__type_ctor_info_strnode_0)});
    //
    //
    syntax2bel__field_types_strnode_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    syntax2bel__field_types_strnode_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    syntax2bel__field_types_strnode_0_0[2] = (jmercury.runtime.PseudoTypeInfo) syntax2bel.syntax2bel__type_ctor_info_strcoref_0;
    syntax2bel__field_types_strnode_0_0[3] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    syntax2bel__field_types_strnode_0_0[4] = (jmercury.runtime.PseudoTypeInfo) syntax2bel.list__ti_list_1syntax2bel__type_ctor_info_strnode_0;
    //
    syntax2bel__du_functor_desc_strnode_0_0.init("node",
		5,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		syntax2bel.syntax2bel__field_types_strnode_0_0,
		null,
		null,
		null);
    //
    syntax2bel__du_stag_ordered_strnode_0_0[0] = syntax2bel.syntax2bel__du_functor_desc_strnode_0_0;
    //
    syntax2bel__du_ptag_ordered_strnode_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		syntax2bel.syntax2bel__du_stag_ordered_strnode_0_0);
    //
    syntax2bel__du_name_ordered_strnode_0[0] = syntax2bel.syntax2bel__du_functor_desc_strnode_0_0;
    //
    syntax2bel__functor_number_map_strnode_0[0] = 0;
    //
    syntax2bel__type_ctor_info_strnode_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(22))),
		((java.lang.Object) (new AddrOf2_0(23))),
		"syntax2bel",
		"strnode",
		new jmercury.runtime.TypeFunctors(syntax2bel.syntax2bel__du_name_ordered_strnode_0),
		new jmercury.runtime.TypeLayout(syntax2bel.syntax2bel__du_ptag_ordered_strnode_0),
		1,
		4,
		syntax2bel.syntax2bel__functor_number_map_strnode_0);
    //
    syntax2bel__field_types_strsent_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    syntax2bel__field_types_strsent_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    syntax2bel__field_types_strsent_0_0[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    syntax2bel__field_types_strsent_0_0[3] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    syntax2bel__field_types_strsent_0_0[4] = (jmercury.runtime.PseudoTypeInfo) syntax2bel.syntax2bel__type_ctor_info_strnode_0;
    //
    syntax2bel__du_functor_desc_strsent_0_0.init("sentence",
		5,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		syntax2bel.syntax2bel__field_types_strsent_0_0,
		null,
		null,
		null);
    //
    syntax2bel__du_stag_ordered_strsent_0_0[0] = syntax2bel.syntax2bel__du_functor_desc_strsent_0_0;
    //
    syntax2bel__du_ptag_ordered_strsent_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		syntax2bel.syntax2bel__du_stag_ordered_strsent_0_0);
    //
    syntax2bel__du_name_ordered_strsent_0[0] = syntax2bel.syntax2bel__du_functor_desc_strsent_0_0;
    //
    syntax2bel__functor_number_map_strsent_0[0] = 0;
    //
    syntax2bel__type_ctor_info_strsent_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(24))),
		((java.lang.Object) (new AddrOf2_0(25))),
		"syntax2bel",
		"strsent",
		new jmercury.runtime.TypeFunctors(syntax2bel.syntax2bel__du_name_ordered_strsent_0),
		new jmercury.runtime.TypeLayout(syntax2bel.syntax2bel__du_ptag_ordered_strsent_0),
		1,
		4,
		syntax2bel.syntax2bel__functor_number_map_strsent_0);
  }

// DataDefns
  static {
  }

// Scalar common data
  private static final jmercury.runtime.TypeInfo_Struct[] MR_scalar_common_1 = new jmercury.runtime.TypeInfo_Struct[5];
  private static final io.Posn_0[] MR_scalar_common_2 = new io.Posn_0[1];
  private static final list.List_1.F_nil_0[] MR_scalar_common_3 = new list.List_1.F_nil_0[1];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_4 = new /* generic_type */ java.lang.Object[2][];
  private static final syntax2bel.Coref_0.None_0[] MR_scalar_common_6 = new syntax2bel.Coref_0.None_0[1];
  private static final syntax2bel.Label_0.P_2[] MR_scalar_common_7 = new syntax2bel.Label_0.P_2[44];
  private static final syntax2bel.Label_0.Empty_0[] MR_scalar_common_8 = new syntax2bel.Label_0.Empty_0[1];
  private static void MR_init_scalars_0() {
    MR_scalar_common_1[0] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.syntax2bel__type_ctor_info_sent_0))));
    MR_scalar_common_1[1] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(errors.errors__type_ctor_info_messages_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0))));
    MR_scalar_common_1[2] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.syntax2bel__type_ctor_info_node_0))));
    MR_scalar_common_1[3] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.syntax2bel__type_ctor_info_strsent_0))));
    MR_scalar_common_1[4] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.syntax2bel__type_ctor_info_strnode_0))));
    MR_scalar_common_2[0] = new io.Posn_0(0,
		0,
		0);
    MR_scalar_common_3[0] = new list.List_1.F_nil_0();
    MR_scalar_common_4[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(6),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (syntax2bel.syntax2bel__type_ctor_info_strsent_0)),
		((java.lang.Object) (syntax2bel.list__pti_list_1__plain_syntax2bel__type_ctor_info_sent_0)),
		((java.lang.Object) (syntax2bel.list__pti_list_1__plain_syntax2bel__type_ctor_info_sent_0)),
		((java.lang.Object) (syntax2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (syntax2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_4[1] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(6),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (syntax2bel.syntax2bel__type_ctor_info_strnode_0)),
		((java.lang.Object) (syntax2bel.list__pti_list_1__plain_syntax2bel__type_ctor_info_node_0)),
		((java.lang.Object) (syntax2bel.list__pti_list_1__plain_syntax2bel__type_ctor_info_node_0)),
		((java.lang.Object) (syntax2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (syntax2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_6[0] = new syntax2bel.Coref_0.None_0();
    MR_scalar_common_7[0] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K1,
		syntax2bel.Cat_0.K22);
    MR_scalar_common_7[1] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K1,
		syntax2bel.Cat_0.K24);
    MR_scalar_common_7[2] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K1,
		syntax2bel.Cat_0.K8);
    MR_scalar_common_7[3] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K1,
		syntax2bel.Cat_0.K13);
    MR_scalar_common_7[4] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K1,
		syntax2bel.Cat_0.K23);
    MR_scalar_common_7[5] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K1,
		syntax2bel.Cat_0.K6);
    MR_scalar_common_7[6] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K1,
		syntax2bel.Cat_0.K20);
    MR_scalar_common_7[7] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K1,
		syntax2bel.Cat_0.K11);
    MR_scalar_common_7[8] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K1,
		syntax2bel.Cat_0.K18);
    MR_scalar_common_7[9] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K1,
		syntax2bel.Cat_0.K15);
    MR_scalar_common_7[10] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K1,
		syntax2bel.Cat_0.K7);
    MR_scalar_common_7[11] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K1,
		syntax2bel.Cat_0.K5);
    MR_scalar_common_7[12] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K1,
		syntax2bel.Cat_0.K28);
    MR_scalar_common_7[13] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K1,
		syntax2bel.Cat_0.K17);
    MR_scalar_common_7[14] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K1,
		syntax2bel.Cat_0.K4);
    MR_scalar_common_7[15] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K1,
		syntax2bel.Cat_0.K26);
    MR_scalar_common_7[16] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K1,
		syntax2bel.Cat_0.K3);
    MR_scalar_common_7[17] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K1,
		syntax2bel.Cat_0.K27);
    MR_scalar_common_7[18] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K1,
		syntax2bel.Cat_0.K10);
    MR_scalar_common_7[19] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K1,
		syntax2bel.Cat_0.K12);
    MR_scalar_common_7[20] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K1,
		syntax2bel.Cat_0.K31);
    MR_scalar_common_7[21] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K1,
		syntax2bel.Cat_0.K2);
    MR_scalar_common_7[22] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K1,
		syntax2bel.Cat_0.K1);
    MR_scalar_common_7[23] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K0,
		syntax2bel.Cat_0.K22);
    MR_scalar_common_7[24] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K0,
		syntax2bel.Cat_0.K24);
    MR_scalar_common_7[25] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K0,
		syntax2bel.Cat_0.K8);
    MR_scalar_common_7[26] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K0,
		syntax2bel.Cat_0.K13);
    MR_scalar_common_7[27] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K0,
		syntax2bel.Cat_0.K6);
    MR_scalar_common_7[28] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K0,
		syntax2bel.Cat_0.K20);
    MR_scalar_common_7[29] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K0,
		syntax2bel.Cat_0.K11);
    MR_scalar_common_7[30] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K0,
		syntax2bel.Cat_0.K18);
    MR_scalar_common_7[31] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K0,
		syntax2bel.Cat_0.K15);
    MR_scalar_common_7[32] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K0,
		syntax2bel.Cat_0.K7);
    MR_scalar_common_7[33] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K0,
		syntax2bel.Cat_0.K5);
    MR_scalar_common_7[34] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K0,
		syntax2bel.Cat_0.K28);
    MR_scalar_common_7[35] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K0,
		syntax2bel.Cat_0.K17);
    MR_scalar_common_7[36] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K0,
		syntax2bel.Cat_0.K4);
    MR_scalar_common_7[37] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K0,
		syntax2bel.Cat_0.K26);
    MR_scalar_common_7[38] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K0,
		syntax2bel.Cat_0.K3);
    MR_scalar_common_7[39] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K0,
		syntax2bel.Cat_0.K27);
    MR_scalar_common_7[40] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K0,
		syntax2bel.Cat_0.K10);
    MR_scalar_common_7[41] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K0,
		syntax2bel.Cat_0.K12);
    MR_scalar_common_7[42] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K0,
		syntax2bel.Cat_0.K2);
    MR_scalar_common_7[43] = new syntax2bel.Label_0.P_2(syntax2bel.Ch_0.K0,
		syntax2bel.Cat_0.K1);
    MR_scalar_common_8[0] = new syntax2bel.Label_0.Empty_0();
  }
  static {
    MR_init_scalars_0();
  }

// Vector common data
//  syntax2bel.m:92
  private static final class Vector_common_type_5_0
  {
    public final java.lang.String vct_5_f_0;
    public final int vct_5_f_1;

    public Vector_common_type_5_0(
      java.lang.String vct_5_f_0,
      int vct_5_f_1)
    {
      {
        this.vct_5_f_0 = vct_5_f_0;
        this.vct_5_f_1 = vct_5_f_1;
      }
    }
  }

  private static final syntax2bel.Vector_common_type_5_0 MR_vector_common_5[] = {
    new syntax2bel.Vector_common_type_5_0("#",
		0),
		new syntax2bel.Vector_common_type_5_0("\044",
		1),
		new syntax2bel.Vector_common_type_5_0("\'\'",
		2),
		new syntax2bel.Vector_common_type_5_0(",",
		3),
		new syntax2bel.Vector_common_type_5_0("-LRB-",
		4),
		new syntax2bel.Vector_common_type_5_0("-RRB-",
		5),
		new syntax2bel.Vector_common_type_5_0(".",
		6),
		new syntax2bel.Vector_common_type_5_0(":",
		7),
		new syntax2bel.Vector_common_type_5_0("CC",
		8),
		new syntax2bel.Vector_common_type_5_0("CD",
		9),
		new syntax2bel.Vector_common_type_5_0("DT",
		10),
		new syntax2bel.Vector_common_type_5_0("EX",
		11),
		new syntax2bel.Vector_common_type_5_0("FW",
		12),
		new syntax2bel.Vector_common_type_5_0("IN",
		13),
		new syntax2bel.Vector_common_type_5_0("JJ",
		14),
		new syntax2bel.Vector_common_type_5_0("JJR",
		15),
		new syntax2bel.Vector_common_type_5_0("JJS",
		16),
		new syntax2bel.Vector_common_type_5_0("LS",
		17),
		new syntax2bel.Vector_common_type_5_0("MD",
		18),
		new syntax2bel.Vector_common_type_5_0("NN",
		19),
		new syntax2bel.Vector_common_type_5_0("NNP",
		20),
		new syntax2bel.Vector_common_type_5_0("NNPS",
		21),
		new syntax2bel.Vector_common_type_5_0("NNS",
		22),
		new syntax2bel.Vector_common_type_5_0("PDT",
		23),
		new syntax2bel.Vector_common_type_5_0("POS",
		24),
		new syntax2bel.Vector_common_type_5_0("PRP",
		25),
		new syntax2bel.Vector_common_type_5_0("PRP\044",
		26),
		new syntax2bel.Vector_common_type_5_0("RB",
		27),
		new syntax2bel.Vector_common_type_5_0("RBR",
		28),
		new syntax2bel.Vector_common_type_5_0("RBS",
		29),
		new syntax2bel.Vector_common_type_5_0("RP",
		30),
		new syntax2bel.Vector_common_type_5_0("SYM",
		31),
		new syntax2bel.Vector_common_type_5_0("TO",
		32),
		new syntax2bel.Vector_common_type_5_0("UH",
		33),
		new syntax2bel.Vector_common_type_5_0("VB",
		34),
		new syntax2bel.Vector_common_type_5_0("VBD",
		35),
		new syntax2bel.Vector_common_type_5_0("VBG",
		36),
		new syntax2bel.Vector_common_type_5_0("VBN",
		37),
		new syntax2bel.Vector_common_type_5_0("VBP",
		38),
		new syntax2bel.Vector_common_type_5_0("VBZ",
		39),
		new syntax2bel.Vector_common_type_5_0("WDT",
		40),
		new syntax2bel.Vector_common_type_5_0("WP",
		41),
		new syntax2bel.Vector_common_type_5_0("WP\044",
		42),
		new syntax2bel.Vector_common_type_5_0("WRB",
		43),
		new syntax2bel.Vector_common_type_5_0("\140\140",
		44),
		new syntax2bel.Vector_common_type_5_0("ADJP",
		0),
		new syntax2bel.Vector_common_type_5_0("ADVP",
		1),
		new syntax2bel.Vector_common_type_5_0("AUX",
		2),
		new syntax2bel.Vector_common_type_5_0("CONJP",
		3),
		new syntax2bel.Vector_common_type_5_0("EDITED",
		4),
		new syntax2bel.Vector_common_type_5_0("FRAG",
		5),
		new syntax2bel.Vector_common_type_5_0("INC",
		6),
		new syntax2bel.Vector_common_type_5_0("INTJ",
		7),
		new syntax2bel.Vector_common_type_5_0("LST",
		8),
		new syntax2bel.Vector_common_type_5_0("NAC",
		9),
		new syntax2bel.Vector_common_type_5_0("NEG",
		10),
		new syntax2bel.Vector_common_type_5_0("NML",
		11),
		new syntax2bel.Vector_common_type_5_0("NP",
		12),
		new syntax2bel.Vector_common_type_5_0("NX",
		13),
		new syntax2bel.Vector_common_type_5_0("PP",
		14),
		new syntax2bel.Vector_common_type_5_0("PRN",
		15),
		new syntax2bel.Vector_common_type_5_0("PRT",
		16),
		new syntax2bel.Vector_common_type_5_0("QP",
		17),
		new syntax2bel.Vector_common_type_5_0("RRC",
		18),
		new syntax2bel.Vector_common_type_5_0("S",
		19),
		new syntax2bel.Vector_common_type_5_0("SBAR",
		20),
		new syntax2bel.Vector_common_type_5_0("SBARQ",
		21),
		new syntax2bel.Vector_common_type_5_0("SINV",
		22),
		new syntax2bel.Vector_common_type_5_0("SQ",
		23),
		new syntax2bel.Vector_common_type_5_0("TOP",
		24),
		new syntax2bel.Vector_common_type_5_0("UCP",
		25),
		new syntax2bel.Vector_common_type_5_0("VP",
		26),
		new syntax2bel.Vector_common_type_5_0("WHADJP",
		27),
		new syntax2bel.Vector_common_type_5_0("WHADVP",
		28),
		new syntax2bel.Vector_common_type_5_0("WHNP",
		29),
		new syntax2bel.Vector_common_type_5_0("WHPP",
		30),
		new syntax2bel.Vector_common_type_5_0("X",
		31),
		new syntax2bel.Vector_common_type_5_0("",
		0),
		new syntax2bel.Vector_common_type_5_0("C-ADJP",
		1),
		new syntax2bel.Vector_common_type_5_0("C-ADVP",
		2),
		new syntax2bel.Vector_common_type_5_0("C-FRAG",
		3),
		new syntax2bel.Vector_common_type_5_0("C-INTJ",
		4),
		new syntax2bel.Vector_common_type_5_0("C-NAC",
		5),
		new syntax2bel.Vector_common_type_5_0("C-NP",
		6),
		new syntax2bel.Vector_common_type_5_0("C-NX",
		7),
		new syntax2bel.Vector_common_type_5_0("C-PP",
		8),
		new syntax2bel.Vector_common_type_5_0("C-PRN",
		9),
		new syntax2bel.Vector_common_type_5_0("C-RRC",
		10),
		new syntax2bel.Vector_common_type_5_0("C-S",
		11),
		new syntax2bel.Vector_common_type_5_0("C-SBAR",
		12),
		new syntax2bel.Vector_common_type_5_0("C-SBARQ",
		13),
		new syntax2bel.Vector_common_type_5_0("C-SINV",
		14),
		new syntax2bel.Vector_common_type_5_0("C-SQ",
		15),
		new syntax2bel.Vector_common_type_5_0("C-UCP",
		16),
		new syntax2bel.Vector_common_type_5_0("C-VP",
		17),
		new syntax2bel.Vector_common_type_5_0("C-WHADVP",
		18),
		new syntax2bel.Vector_common_type_5_0("C-WHNP",
		19),
		new syntax2bel.Vector_common_type_5_0("C-WHPP",
		20),
		new syntax2bel.Vector_common_type_5_0("C-X",
		21),
		new syntax2bel.Vector_common_type_5_0("S-ADJP",
		22),
		new syntax2bel.Vector_common_type_5_0("S-ADVP",
		23),
		new syntax2bel.Vector_common_type_5_0("S-EDITED",
		24),
		new syntax2bel.Vector_common_type_5_0("S-FRAG",
		25),
		new syntax2bel.Vector_common_type_5_0("S-INTJ",
		26),
		new syntax2bel.Vector_common_type_5_0("S-NAC",
		27),
		new syntax2bel.Vector_common_type_5_0("S-NP",
		28),
		new syntax2bel.Vector_common_type_5_0("S-NX",
		29),
		new syntax2bel.Vector_common_type_5_0("S-PP",
		30),
		new syntax2bel.Vector_common_type_5_0("S-PRN",
		31),
		new syntax2bel.Vector_common_type_5_0("S-RRC",
		32),
		new syntax2bel.Vector_common_type_5_0("S-S",
		33),
		new syntax2bel.Vector_common_type_5_0("S-SBAR",
		34),
		new syntax2bel.Vector_common_type_5_0("S-SBARQ",
		35),
		new syntax2bel.Vector_common_type_5_0("S-SINV",
		36),
		new syntax2bel.Vector_common_type_5_0("S-SQ",
		37),
		new syntax2bel.Vector_common_type_5_0("S-UCP",
		38),
		new syntax2bel.Vector_common_type_5_0("S-VP",
		39),
		new syntax2bel.Vector_common_type_5_0("S-WHADJP",
		40),
		new syntax2bel.Vector_common_type_5_0("S-WHADVP",
		41),
		new syntax2bel.Vector_common_type_5_0("S-WHNP",
		42),
		new syntax2bel.Vector_common_type_5_0("S-WHPP",
		43),
		new syntax2bel.Vector_common_type_5_0("S-X",
		44)
  };

// NonDataDefns
  private static boolean __Unify____cat_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = syntax2bel.__Unify____cat_0_0(((syntax2bel.Cat_0) wrapper_arg_1), ((syntax2bel.Cat_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____cat_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = syntax2bel.__Compare____cat_0_0(((syntax2bel.Cat_0) wrapper_arg_2), ((syntax2bel.Cat_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____ch_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = syntax2bel.__Unify____ch_0_0(((syntax2bel.Ch_0) wrapper_arg_1), ((syntax2bel.Ch_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____ch_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = syntax2bel.__Compare____ch_0_0(((syntax2bel.Ch_0) wrapper_arg_2), ((syntax2bel.Ch_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____coref_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = syntax2bel.__Unify____coref_0_0(((syntax2bel.Coref_0) wrapper_arg_1), ((syntax2bel.Coref_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____coref_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = syntax2bel.__Compare____coref_0_0(((syntax2bel.Coref_0) wrapper_arg_2), ((syntax2bel.Coref_0) wrapper_arg_3));
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
        succeeded = syntax2bel.__Unify____label_0_0(((syntax2bel.Label_0) wrapper_arg_1), ((syntax2bel.Label_0) wrapper_arg_2));
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
        conv0_HeadVar__1_1 = syntax2bel.__Compare____label_0_0(((syntax2bel.Label_0) wrapper_arg_2), ((syntax2bel.Label_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____node_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = syntax2bel.__Unify____node_0_0(((syntax2bel.Node_0) wrapper_arg_1), ((syntax2bel.Node_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____node_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = syntax2bel.__Compare____node_0_0(((syntax2bel.Node_0) wrapper_arg_2), ((syntax2bel.Node_0) wrapper_arg_3));
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
        succeeded = syntax2bel.__Unify____pos_0_0(((syntax2bel.Pos_0) wrapper_arg_1), ((syntax2bel.Pos_0) wrapper_arg_2));
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
        conv0_HeadVar__1_1 = syntax2bel.__Compare____pos_0_0(((syntax2bel.Pos_0) wrapper_arg_2), ((syntax2bel.Pos_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____semtype_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = syntax2bel.__Unify____semtype_0_0();
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____semtype_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = syntax2bel.__Compare____semtype_0_0();
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
        succeeded = syntax2bel.__Unify____sent_0_0(((syntax2bel.Sent_0) wrapper_arg_1), ((syntax2bel.Sent_0) wrapper_arg_2));
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
        conv0_HeadVar__1_1 = syntax2bel.__Compare____sent_0_0(((syntax2bel.Sent_0) wrapper_arg_2), ((syntax2bel.Sent_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____sfile_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = syntax2bel.__Unify____sfile_0_0(((syntax2bel.Sfile_0) wrapper_arg_1), ((syntax2bel.Sfile_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____sfile_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = syntax2bel.__Compare____sfile_0_0(((syntax2bel.Sfile_0) wrapper_arg_2), ((syntax2bel.Sfile_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____strcoref_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = syntax2bel.__Unify____strcoref_0_0(((syntax2bel.Strcoref_0) wrapper_arg_1), ((syntax2bel.Strcoref_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____strcoref_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = syntax2bel.__Compare____strcoref_0_0(((syntax2bel.Strcoref_0) wrapper_arg_2), ((syntax2bel.Strcoref_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____strfile_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = syntax2bel.__Unify____strfile_0_0(((syntax2bel.Strfile_0) wrapper_arg_1), ((syntax2bel.Strfile_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____strfile_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = syntax2bel.__Compare____strfile_0_0(((syntax2bel.Strfile_0) wrapper_arg_2), ((syntax2bel.Strfile_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____strnode_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = syntax2bel.__Unify____strnode_0_0(((syntax2bel.Strnode_0) wrapper_arg_1), ((syntax2bel.Strnode_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____strnode_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = syntax2bel.__Compare____strnode_0_0(((syntax2bel.Strnode_0) wrapper_arg_2), ((syntax2bel.Strnode_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____strsent_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = syntax2bel.__Unify____strsent_0_0(((syntax2bel.Strsent_0) wrapper_arg_1), ((syntax2bel.Strsent_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____strsent_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = syntax2bel.__Compare____strsent_0_0(((syntax2bel.Strsent_0) wrapper_arg_2), ((syntax2bel.Strsent_0) wrapper_arg_3));
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
              return_value = syntax2bel.__Unify____cat_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 1:
          {
            java.lang.Object return_value = null;

            {
              return_value = syntax2bel.__Compare____cat_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 2:
          {
            boolean return_value = false;

            {
              return_value = syntax2bel.__Unify____ch_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 3:
          {
            java.lang.Object return_value = null;

            {
              return_value = syntax2bel.__Compare____ch_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 4:
          {
            boolean return_value = false;

            {
              return_value = syntax2bel.__Unify____coref_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 5:
          {
            java.lang.Object return_value = null;

            {
              return_value = syntax2bel.__Compare____coref_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 6:
          {
            boolean return_value = false;

            {
              return_value = syntax2bel.__Unify____label_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 7:
          {
            java.lang.Object return_value = null;

            {
              return_value = syntax2bel.__Compare____label_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 8:
          {
            boolean return_value = false;

            {
              return_value = syntax2bel.__Unify____node_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 9:
          {
            java.lang.Object return_value = null;

            {
              return_value = syntax2bel.__Compare____node_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 10:
          {
            boolean return_value = false;

            {
              return_value = syntax2bel.__Unify____pos_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 11:
          {
            java.lang.Object return_value = null;

            {
              return_value = syntax2bel.__Compare____pos_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 12:
          {
            boolean return_value = false;

            {
              return_value = syntax2bel.__Unify____semtype_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 13:
          {
            java.lang.Object return_value = null;

            {
              return_value = syntax2bel.__Compare____semtype_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 14:
          {
            boolean return_value = false;

            {
              return_value = syntax2bel.__Unify____sent_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 15:
          {
            java.lang.Object return_value = null;

            {
              return_value = syntax2bel.__Compare____sent_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 16:
          {
            boolean return_value = false;

            {
              return_value = syntax2bel.__Unify____sfile_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 17:
          {
            java.lang.Object return_value = null;

            {
              return_value = syntax2bel.__Compare____sfile_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 18:
          {
            boolean return_value = false;

            {
              return_value = syntax2bel.__Unify____strcoref_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 19:
          {
            java.lang.Object return_value = null;

            {
              return_value = syntax2bel.__Compare____strcoref_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 20:
          {
            boolean return_value = false;

            {
              return_value = syntax2bel.__Unify____strfile_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 21:
          {
            java.lang.Object return_value = null;

            {
              return_value = syntax2bel.__Compare____strfile_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 22:
          {
            boolean return_value = false;

            {
              return_value = syntax2bel.__Unify____strnode_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 23:
          {
            java.lang.Object return_value = null;

            {
              return_value = syntax2bel.__Compare____strnode_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 24:
          {
            boolean return_value = false;

            {
              return_value = syntax2bel.__Unify____strsent_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 25:
          {
            java.lang.Object return_value = null;

            {
              return_value = syntax2bel.__Compare____strsent_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
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
              return_value = syntax2bel.conv_strnode_6_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4));
            }
            return ((java.lang.Object) (return_value));
          }
        case 1:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = syntax2bel.read_sents_9_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4));
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

//  syntax2bel.m:21
  public static class Cat_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Cat_0 K0 = new Cat_0(0);  /* top */
      public static final Cat_0 K1 = new Cat_0(1);  /* adjp */
      public static final Cat_0 K2 = new Cat_0(2);  /* advp */
      public static final Cat_0 K3 = new Cat_0(3);  /* np */
      public static final Cat_0 K4 = new Cat_0(4);  /* pp */
      public static final Cat_0 K5 = new Cat_0(5);  /* s */
      public static final Cat_0 K6 = new Cat_0(6);  /* vp */
      public static final Cat_0 K7 = new Cat_0(7);  /* sbar */
      public static final Cat_0 K8 = new Cat_0(8);  /* whnp */
      public static final Cat_0 K9 = new Cat_0(9);  /* nml */
      public static final Cat_0 K10 = new Cat_0(10);  /* intj */
      public static final Cat_0 K11 = new Cat_0(11);  /* sq */
      public static final Cat_0 K12 = new Cat_0(12);  /* frag */
      public static final Cat_0 K13 = new Cat_0(13);  /* whadvp */
      public static final Cat_0 K14 = new Cat_0(14);  /* prt */
      public static final Cat_0 K15 = new Cat_0(15);  /* sbarq */
      public static final Cat_0 K16 = new Cat_0(16);  /* qp */
      public static final Cat_0 K17 = new Cat_0(17);  /* prn */
      public static final Cat_0 K18 = new Cat_0(18);  /* sinv */
      public static final Cat_0 K19 = new Cat_0(19);  /* conjp */
      public static final Cat_0 K20 = new Cat_0(20);  /* ucp */
      public static final Cat_0 K21 = new Cat_0(21);  /* inc */
      public static final Cat_0 K22 = new Cat_0(22);  /* x */
      public static final Cat_0 K23 = new Cat_0(23);  /* whadjp */
      public static final Cat_0 K24 = new Cat_0(24);  /* whpp */
      public static final Cat_0 K25 = new Cat_0(25);  /* lst */
      public static final Cat_0 K26 = new Cat_0(26);  /* nx */
      public static final Cat_0 K27 = new Cat_0(27);  /* nac */
      public static final Cat_0 K28 = new Cat_0(28);  /* rrc */
      public static final Cat_0 K29 = new Cat_0(29);  /* aux */
      public static final Cat_0 K30 = new Cat_0(30);  /* neg */
      public static final Cat_0 K31 = new Cat_0(31);  /* edited */

      private Cat_0(int val) {
        super(val);
      }

  }

//  syntax2bel.m:26
  public static class Ch_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Ch_0 K0 = new Ch_0(0);  /* c */
      public static final Ch_0 K1 = new Ch_0(1);  /* s */

      private Ch_0(int val) {
        super(val);
      }

  }

//  syntax2bel.m:14
  public static class Coref_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Unknown_0
      extends syntax2bel.Coref_0
    {

      public Unknown_0()
      {
        {
          (this).data_tag = 1;
        }
      }
    }

    public static class Coref_2
      extends syntax2bel.Coref_0
    {
      public syntax2bel.Semtype_0 F1;
      public int F2;

      public Coref_2()
      {
        {
        }
      }
      public Coref_2(
        syntax2bel.Semtype_0 F1,
        int F2)
      {
        {
          (this).data_tag = 2;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class None_0
      extends syntax2bel.Coref_0
    {

      public None_0()
      {
        {
          (this).data_tag = 0;
        }
      }
    }


  }

//  syntax2bel.m:25
  public static class Label_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class P_2
      extends syntax2bel.Label_0
    {
      public syntax2bel.Ch_0 F1;
      public syntax2bel.Cat_0 F2;

      public P_2()
      {
        {
        }
      }
      public P_2(
        syntax2bel.Ch_0 F1,
        syntax2bel.Cat_0 F2)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Empty_0
      extends syntax2bel.Label_0
    {

      public Empty_0()
      {
        {
          (this).data_tag = 0;
        }
      }
    }


  }

//  syntax2bel.m:13
  public static class Node_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Nt_3
      extends syntax2bel.Node_0
    {
      public syntax2bel.Cat_0 F1;
      public syntax2bel.Label_0 F2;
      public list.List_1<syntax2bel.Node_0> F3;

      public Nt_3()
      {
        {
        }
      }
      public Nt_3(
        syntax2bel.Cat_0 F1,
        syntax2bel.Label_0 F2,
        list.List_1<syntax2bel.Node_0> F3)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
          this.F2 = F2;
          this.F3 = F3;
        }
      }
    }

    public static class Leaf_3
      extends syntax2bel.Node_0
    {
      public syntax2bel.Pos_0 F1;
      public java.lang.String F2;
      public syntax2bel.Coref_0 F3;

      public Leaf_3()
      {
        {
        }
      }
      public Leaf_3(
        syntax2bel.Pos_0 F1,
        java.lang.String F2,
        syntax2bel.Coref_0 F3)
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

//  syntax2bel.m:17
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

//  syntax2bel.m:15
  public static class Semtype_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Semtype_0 K0 = new Semtype_0(0);  /* semtype */

      private Semtype_0(int val) {
        super(val);
      }

  }

//  syntax2bel.m:12
  public static class Sent_0
    implements jmercury.runtime.MercuryType
  {
    public int F1;
    public java.lang.String F2;
    public java.lang.String F3;
    public syntax2bel.Node_0 F4;

    public Sent_0()
    {
      {
      }
    }
    public Sent_0(
      int F1,
      java.lang.String F2,
      java.lang.String F3,
      syntax2bel.Node_0 F4)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
        this.F4 = F4;
      }
    }
  }

//  syntax2bel.m:11
  public static class Sfile_0
    implements jmercury.runtime.MercuryType
  {
    public java.lang.String F1;
    public list.List_1<syntax2bel.Sent_0> F2;

    public Sfile_0()
    {
      {
      }
    }
    public Sfile_0(
      java.lang.String F1,
      list.List_1<syntax2bel.Sent_0> F2)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
      }
    }
  }

//  syntax2bel.m:9
  public static class Strcoref_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Unknown_0
      extends syntax2bel.Strcoref_0
    {

      public Unknown_0()
      {
        {
          (this).data_tag = 1;
        }
      }
    }

    public static class Coref_2
      extends syntax2bel.Strcoref_0
    {
      public java.lang.String F1;
      public int F2;

      public Coref_2()
      {
        {
        }
      }
      public Coref_2(
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

    public static class None_0
      extends syntax2bel.Strcoref_0
    {

      public None_0()
      {
        {
          (this).data_tag = 0;
        }
      }
    }


  }

//  syntax2bel.m:6
  public static class Strfile_0
    implements jmercury.runtime.MercuryType
  {
    public java.lang.String F1;
    public list.List_1<syntax2bel.Strsent_0> F2;

    public Strfile_0()
    {
      {
      }
    }
    public Strfile_0(
      java.lang.String F1,
      list.List_1<syntax2bel.Strsent_0> F2)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
      }
    }
  }

//  syntax2bel.m:8
  public static class Strnode_0
    implements jmercury.runtime.MercuryType
  {
    public java.lang.String F1;
    public java.lang.String F2;
    public syntax2bel.Strcoref_0 F3;
    public java.lang.String F4;
    public list.List_1<syntax2bel.Strnode_0> F5;

    public Strnode_0()
    {
      {
      }
    }
    public Strnode_0(
      java.lang.String F1,
      java.lang.String F2,
      syntax2bel.Strcoref_0 F3,
      java.lang.String F4,
      list.List_1<syntax2bel.Strnode_0> F5)
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

//  syntax2bel.m:7
  public static class Strsent_0
    implements jmercury.runtime.MercuryType
  {
    public int F1;
    public java.lang.String F2;
    public java.lang.String F3;
    public java.lang.String F4;
    public syntax2bel.Strnode_0 F5;

    public Strsent_0()
    {
      {
      }
    }
    public Strsent_0(
      int F1,
      java.lang.String F2,
      java.lang.String F3,
      java.lang.String F4,
      syntax2bel.Strnode_0 F5)
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

  public static builtin.Comparison_result_0 __Compare____strsent_0_0(
    syntax2bel.Strsent_0 HeadVar__2_2,
    syntax2bel.Strsent_0 HeadVar__3_3)
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
          int V_4_4 = ((syntax2bel.Strsent_0) HeadVar__2_2).F1;
          java.lang.String V_5_5 = ((syntax2bel.Strsent_0) HeadVar__2_2).F2;
          java.lang.String V_6_6 = ((syntax2bel.Strsent_0) HeadVar__2_2).F3;
          java.lang.String V_7_7 = ((syntax2bel.Strsent_0) HeadVar__2_2).F4;
          syntax2bel.Strnode_0 V_8_8 = ((syntax2bel.Strsent_0) HeadVar__2_2).F5;
          int V_9_9 = ((syntax2bel.Strsent_0) HeadVar__3_3).F1;
          java.lang.String V_10_10 = ((syntax2bel.Strsent_0) HeadVar__3_3).F2;
          java.lang.String V_11_11 = ((syntax2bel.Strsent_0) HeadVar__3_3).F3;
          java.lang.String V_12_12 = ((syntax2bel.Strsent_0) HeadVar__3_3).F4;
          syntax2bel.Strnode_0 V_13_13 = ((syntax2bel.Strsent_0) HeadVar__3_3).F5;
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
                          HeadVar__1_1 = syntax2bel.__Compare____strnode_0_0(V_8_8, V_13_13);
                        }
                    }
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____strsent_0_0(
    syntax2bel.Strsent_0 HeadVar__1_1,
    syntax2bel.Strsent_0 HeadVar__2_2)
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
          int V_3_3 = ((syntax2bel.Strsent_0) HeadVar__1_1).F1;
          java.lang.String V_4_4 = ((syntax2bel.Strsent_0) HeadVar__1_1).F2;
          java.lang.String V_5_5 = ((syntax2bel.Strsent_0) HeadVar__1_1).F3;
          java.lang.String V_6_6 = ((syntax2bel.Strsent_0) HeadVar__1_1).F4;
          syntax2bel.Strnode_0 V_7_7 = ((syntax2bel.Strsent_0) HeadVar__1_1).F5;
          int V_8_8 = ((syntax2bel.Strsent_0) HeadVar__2_2).F1;
          java.lang.String V_9_9 = ((syntax2bel.Strsent_0) HeadVar__2_2).F2;
          java.lang.String V_10_10 = ((syntax2bel.Strsent_0) HeadVar__2_2).F3;
          java.lang.String V_11_11 = ((syntax2bel.Strsent_0) HeadVar__2_2).F4;
          syntax2bel.Strnode_0 V_12_12 = ((syntax2bel.Strsent_0) HeadVar__2_2).F5;

          succeeded = (V_3_3 == V_8_8);
          if (succeeded)
            {
              succeeded = V_4_4.equals(V_9_9);
              if (succeeded)
                {
                  succeeded = V_5_5.equals(V_10_10);
                  if (succeeded)
                    {
                      succeeded = V_6_6.equals(V_11_11);
                      if (succeeded)
                        {
                          succeeded = syntax2bel.__Unify____strnode_0_0(V_7_7, V_12_12);
                        }
                    }
                }
            }
        }
      return succeeded;
    }
  }
//  syntax2bel.m:8
  public static builtin.Comparison_result_0 __Compare____strnode_0_0(
    syntax2bel.Strnode_0 HeadVar__2_2,
    syntax2bel.Strnode_0 HeadVar__3_3)
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
          java.lang.String V_4_4 = ((syntax2bel.Strnode_0) HeadVar__2_2).F1;
          java.lang.String V_5_5 = ((syntax2bel.Strnode_0) HeadVar__2_2).F2;
          syntax2bel.Strcoref_0 V_6_6 = ((syntax2bel.Strnode_0) HeadVar__2_2).F3;
          java.lang.String V_7_7 = ((syntax2bel.Strnode_0) HeadVar__2_2).F4;
          list.List_1 V_8_8 = ((syntax2bel.Strnode_0) HeadVar__2_2).F5;
          java.lang.String V_9_9 = ((syntax2bel.Strnode_0) HeadVar__3_3).F1;
          java.lang.String V_10_10 = ((syntax2bel.Strnode_0) HeadVar__3_3).F2;
          syntax2bel.Strcoref_0 V_11_11 = ((syntax2bel.Strnode_0) HeadVar__3_3).F3;
          java.lang.String V_12_12 = ((syntax2bel.Strnode_0) HeadVar__3_3).F4;
          list.List_1 V_13_13 = ((syntax2bel.Strnode_0) HeadVar__3_3).F5;
          builtin.Comparison_result_0 V_14_14 = null;

          {
            V_14_14 = private_builtin.builtin_compare_string_3_p_0(V_4_4, V_9_9);
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

                  {
                    V_16_16 = syntax2bel.__Compare____strcoref_0_0(V_6_6, V_11_11);
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
                          jmercury.runtime.TypeInfo_Struct TypeInfo_24_24 = jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.MR_scalar_common_1[4]);

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
  public static boolean __Unify____strnode_0_0(
    syntax2bel.Strnode_0 HeadVar__1_1,
    syntax2bel.Strnode_0 HeadVar__2_2)
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
          java.lang.String V_3_3 = ((syntax2bel.Strnode_0) HeadVar__1_1).F1;
          java.lang.String V_4_4 = ((syntax2bel.Strnode_0) HeadVar__1_1).F2;
          syntax2bel.Strcoref_0 V_5_5 = ((syntax2bel.Strnode_0) HeadVar__1_1).F3;
          java.lang.String V_6_6 = ((syntax2bel.Strnode_0) HeadVar__1_1).F4;
          list.List_1 V_7_7 = ((syntax2bel.Strnode_0) HeadVar__1_1).F5;
          java.lang.String V_8_8 = ((syntax2bel.Strnode_0) HeadVar__2_2).F1;
          java.lang.String V_9_9 = ((syntax2bel.Strnode_0) HeadVar__2_2).F2;
          syntax2bel.Strcoref_0 V_10_10 = ((syntax2bel.Strnode_0) HeadVar__2_2).F3;
          java.lang.String V_11_11 = ((syntax2bel.Strnode_0) HeadVar__2_2).F4;
          list.List_1 V_12_12 = ((syntax2bel.Strnode_0) HeadVar__2_2).F5;

          succeeded = V_3_3.equals(V_8_8);
          if (succeeded)
            {
              succeeded = V_4_4.equals(V_9_9);
              if (succeeded)
                {
                  {
                    succeeded = syntax2bel.__Unify____strcoref_0_0(V_5_5, V_10_10);
                  }
                  if (succeeded)
                    {
                      succeeded = V_6_6.equals(V_11_11);
                      if (succeeded)
                        {
                          TypeInfo_15_15 = jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.MR_scalar_common_1[4]);
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
//  syntax2bel.m:6
  public static builtin.Comparison_result_0 __Compare____strfile_0_0(
    syntax2bel.Strfile_0 HeadVar__2_2,
    syntax2bel.Strfile_0 HeadVar__3_3)
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
          java.lang.String V_4_4 = ((syntax2bel.Strfile_0) HeadVar__2_2).F1;
          list.List_1 V_5_5 = ((syntax2bel.Strfile_0) HeadVar__2_2).F2;
          java.lang.String V_6_6 = ((syntax2bel.Strfile_0) HeadVar__3_3).F1;
          list.List_1 V_7_7 = ((syntax2bel.Strfile_0) HeadVar__3_3).F2;
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
              jmercury.runtime.TypeInfo_Struct TypeInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.MR_scalar_common_1[3]);

              {
                HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_12_12, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_7_7)));
              }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____strfile_0_0(
    syntax2bel.Strfile_0 HeadVar__1_1,
    syntax2bel.Strfile_0 HeadVar__2_2)
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
          java.lang.String V_3_3 = ((syntax2bel.Strfile_0) HeadVar__1_1).F1;
          list.List_1 V_4_4 = ((syntax2bel.Strfile_0) HeadVar__1_1).F2;
          java.lang.String V_5_5 = ((syntax2bel.Strfile_0) HeadVar__2_2).F1;
          list.List_1 V_6_6 = ((syntax2bel.Strfile_0) HeadVar__2_2).F2;

          succeeded = V_3_3.equals(V_5_5);
          if (succeeded)
            {
              TypeInfo_9_9 = jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.MR_scalar_common_1[3]);
              {
                succeeded = builtin.unify_2_p_0(TypeInfo_9_9, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_6_6)));
              }
            }
        }
      return succeeded;
    }
  }
//  syntax2bel.m:9
  public static builtin.Comparison_result_0 __Compare____strcoref_0_0(
    syntax2bel.Strcoref_0 HeadVar__2_2,
    syntax2bel.Strcoref_0 HeadVar__3_3)
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
              default: /*NOTREACHED*/
                throw new jmercury.runtime.UnreachableDefault();
            }
            break;
          case 2:
            {
              int V_21_21 = ((syntax2bel.Strcoref_0.Coref_2) HeadVar__2_2).F2;
              java.lang.String V_22_22 = ((syntax2bel.Strcoref_0.Coref_2) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 1:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 2:
                  {
                    java.lang.String V_10_10 = ((syntax2bel.Strcoref_0.Coref_2) HeadVar__3_3).F1;
                    int V_11_11 = ((syntax2bel.Strcoref_0.Coref_2) HeadVar__3_3).F2;
                    builtin.Comparison_result_0 V_12_12 = null;

                    {
                      V_12_12 = private_builtin.builtin_compare_string_3_p_0(V_22_22, V_10_10);
                    }
                    succeeded = (V_12_12.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_12_12;
                    else
                      {
                        HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_21_21, V_11_11);
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
  public static boolean __Unify____strcoref_0_0(
    syntax2bel.Strcoref_0 HeadVar__1_1,
    syntax2bel.Strcoref_0 HeadVar__2_2)
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
            {
              java.lang.String V_3_3 = ((syntax2bel.Strcoref_0.Coref_2) HeadVar__1_1).F1;
              int V_4_4 = ((syntax2bel.Strcoref_0.Coref_2) HeadVar__1_1).F2;
              java.lang.String V_5_5 = null;
              int V_6_6 = 0;

              succeeded = (HeadVar__2_2.data_tag == 2);
              if (succeeded)
                {
                  V_5_5 = ((syntax2bel.Strcoref_0.Coref_2) HeadVar__2_2).F1;
                  V_6_6 = ((syntax2bel.Strcoref_0.Coref_2) HeadVar__2_2).F2;
                  succeeded = V_3_3.equals(V_5_5);
                  if (succeeded)
                    succeeded = (V_4_4 == V_6_6);
                }
            }
            break;
          default: /*NOTREACHED*/
            throw new jmercury.runtime.UnreachableDefault();
        }
      return succeeded;
    }
  }
//  syntax2bel.m:11
  public static builtin.Comparison_result_0 __Compare____sfile_0_0(
    syntax2bel.Sfile_0 HeadVar__2_2,
    syntax2bel.Sfile_0 HeadVar__3_3)
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
          java.lang.String V_4_4 = ((syntax2bel.Sfile_0) HeadVar__2_2).F1;
          list.List_1 V_5_5 = ((syntax2bel.Sfile_0) HeadVar__2_2).F2;
          java.lang.String V_6_6 = ((syntax2bel.Sfile_0) HeadVar__3_3).F1;
          list.List_1 V_7_7 = ((syntax2bel.Sfile_0) HeadVar__3_3).F2;
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
              jmercury.runtime.TypeInfo_Struct TypeInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.MR_scalar_common_1[0]);

              {
                HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_12_12, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_7_7)));
              }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____sfile_0_0(
    syntax2bel.Sfile_0 HeadVar__1_1,
    syntax2bel.Sfile_0 HeadVar__2_2)
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
          java.lang.String V_3_3 = ((syntax2bel.Sfile_0) HeadVar__1_1).F1;
          list.List_1 V_4_4 = ((syntax2bel.Sfile_0) HeadVar__1_1).F2;
          java.lang.String V_5_5 = ((syntax2bel.Sfile_0) HeadVar__2_2).F1;
          list.List_1 V_6_6 = ((syntax2bel.Sfile_0) HeadVar__2_2).F2;

          succeeded = V_3_3.equals(V_5_5);
          if (succeeded)
            {
              TypeInfo_9_9 = jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.MR_scalar_common_1[0]);
              {
                succeeded = builtin.unify_2_p_0(TypeInfo_9_9, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_6_6)));
              }
            }
        }
      return succeeded;
    }
  }
//  syntax2bel.m:12
  public static builtin.Comparison_result_0 __Compare____sent_0_0(
    syntax2bel.Sent_0 HeadVar__2_2,
    syntax2bel.Sent_0 HeadVar__3_3)
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
          int V_4_4 = ((syntax2bel.Sent_0) HeadVar__2_2).F1;
          java.lang.String V_5_5 = ((syntax2bel.Sent_0) HeadVar__2_2).F2;
          java.lang.String V_6_6 = ((syntax2bel.Sent_0) HeadVar__2_2).F3;
          syntax2bel.Node_0 V_7_7 = ((syntax2bel.Sent_0) HeadVar__2_2).F4;
          int V_8_8 = ((syntax2bel.Sent_0) HeadVar__3_3).F1;
          java.lang.String V_9_9 = ((syntax2bel.Sent_0) HeadVar__3_3).F2;
          java.lang.String V_10_10 = ((syntax2bel.Sent_0) HeadVar__3_3).F3;
          syntax2bel.Node_0 V_11_11 = ((syntax2bel.Sent_0) HeadVar__3_3).F4;
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
                      HeadVar__1_1 = syntax2bel.__Compare____node_0_0(V_7_7, V_11_11);
                    }
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____sent_0_0(
    syntax2bel.Sent_0 HeadVar__1_1,
    syntax2bel.Sent_0 HeadVar__2_2)
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
          int V_3_3 = ((syntax2bel.Sent_0) HeadVar__1_1).F1;
          java.lang.String V_4_4 = ((syntax2bel.Sent_0) HeadVar__1_1).F2;
          java.lang.String V_5_5 = ((syntax2bel.Sent_0) HeadVar__1_1).F3;
          syntax2bel.Node_0 V_6_6 = ((syntax2bel.Sent_0) HeadVar__1_1).F4;
          int V_7_7 = ((syntax2bel.Sent_0) HeadVar__2_2).F1;
          java.lang.String V_8_8 = ((syntax2bel.Sent_0) HeadVar__2_2).F2;
          java.lang.String V_9_9 = ((syntax2bel.Sent_0) HeadVar__2_2).F3;
          syntax2bel.Node_0 V_10_10 = ((syntax2bel.Sent_0) HeadVar__2_2).F4;

          succeeded = (V_3_3 == V_7_7);
          if (succeeded)
            {
              succeeded = V_4_4.equals(V_8_8);
              if (succeeded)
                {
                  succeeded = V_5_5.equals(V_9_9);
                  if (succeeded)
                    {
                      succeeded = syntax2bel.__Unify____node_0_0(V_6_6, V_10_10);
                    }
                }
            }
        }
      return succeeded;
    }
  }
//  syntax2bel.m:15
  public static builtin.Comparison_result_0 __Compare____semtype_0_0()
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = builtin.Comparison_result_0.K0;

      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____semtype_0_0()
  {
    {
      boolean succeeded = true;

      return succeeded;
    }
  }
//  syntax2bel.m:17
  public static builtin.Comparison_result_0 __Compare____pos_0_0(
    syntax2bel.Pos_0 HeadVar__2_2,
    syntax2bel.Pos_0 HeadVar__3_3)
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
    syntax2bel.Pos_0 HeadVar__2_1,
    syntax2bel.Pos_0 HeadVar__2_2)
  {
    {
      boolean succeeded = (HeadVar__2_1.MR_value == HeadVar__2_2.MR_value);

      return succeeded;
    }
  }
//  syntax2bel.m:13
  public static builtin.Comparison_result_0 __Compare____node_0_0(
    syntax2bel.Node_0 HeadVar__2_2,
    syntax2bel.Node_0 HeadVar__3_3)
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
            syntax2bel.Coref_0 V_40_40 = ((syntax2bel.Node_0.Leaf_3) HeadVar__2_2).F3;
            java.lang.String V_41_41 = ((syntax2bel.Node_0.Leaf_3) HeadVar__2_2).F2;
            syntax2bel.Pos_0 V_42_42 = ((syntax2bel.Node_0.Leaf_3) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 0))
              {
                syntax2bel.Pos_0 V_7_7 = ((syntax2bel.Node_0.Leaf_3) HeadVar__3_3).F1;
                java.lang.String V_8_8 = ((syntax2bel.Node_0.Leaf_3) HeadVar__3_3).F2;
                syntax2bel.Coref_0 V_9_9 = ((syntax2bel.Node_0.Leaf_3) HeadVar__3_3).F3;
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
                      V_11_11 = private_builtin.builtin_compare_string_3_p_0(V_41_41, V_8_8);
                    }
                    succeeded = (V_11_11.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_11_11;
                    else
                      {
                        HeadVar__1_1 = syntax2bel.__Compare____coref_0_0(V_40_40, V_9_9);
                      }
                  }
              }
            else
              HeadVar__1_1 = builtin.Comparison_result_0.K1;
          }
        else
          {
            list.List_1 V_43_43 = ((syntax2bel.Node_0.Nt_3) HeadVar__2_2).F3;
            syntax2bel.Label_0 V_44_44 = ((syntax2bel.Node_0.Nt_3) HeadVar__2_2).F2;
            syntax2bel.Cat_0 V_45_45 = ((syntax2bel.Node_0.Nt_3) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 0))
              HeadVar__1_1 = builtin.Comparison_result_0.K2;
            else
              {
                syntax2bel.Cat_0 V_27_27 = ((syntax2bel.Node_0.Nt_3) HeadVar__3_3).F1;
                syntax2bel.Label_0 V_28_28 = ((syntax2bel.Node_0.Nt_3) HeadVar__3_3).F2;
                list.List_1 V_29_29 = ((syntax2bel.Node_0.Nt_3) HeadVar__3_3).F3;
                builtin.Comparison_result_0 V_30_30 = null;
                int V_48_48 = (int) V_45_45.MR_value;
                int V_49_49 = (int) V_27_27.MR_value;

                {
                  V_30_30 = private_builtin.builtin_compare_int_3_p_0(V_48_48, V_49_49);
                }
                succeeded = (V_30_30.MR_value == builtin.Comparison_result_0.K0.MR_value);
                succeeded = !(succeeded);
                if (succeeded)
                  HeadVar__1_1 = V_30_30;
                else
                  {
                    builtin.Comparison_result_0 V_31_31 = null;

                    {
                      V_31_31 = syntax2bel.__Compare____label_0_0(V_44_44, V_28_28);
                    }
                    succeeded = (V_31_31.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_31_31;
                    else
                      {
                        jmercury.runtime.TypeInfo_Struct TypeInfo_36_36 = jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.MR_scalar_common_1[2]);

                        {
                          HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_36_36, ((java.lang.Object) (V_43_43)), ((java.lang.Object) (V_29_29)));
                        }
                      }
                  }
              }
          }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____node_0_0(
    syntax2bel.Node_0 HeadVar__1_1,
    syntax2bel.Node_0 HeadVar__2_2)
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
            syntax2bel.Pos_0 V_3_3 = ((syntax2bel.Node_0.Leaf_3) HeadVar__1_1).F1;
            java.lang.String V_4_4 = ((syntax2bel.Node_0.Leaf_3) HeadVar__1_1).F2;
            syntax2bel.Coref_0 V_5_5 = ((syntax2bel.Node_0.Leaf_3) HeadVar__1_1).F3;
            syntax2bel.Pos_0 V_6_6 = null;
            java.lang.String V_7_7 = null;
            syntax2bel.Coref_0 V_8_8 = null;

            succeeded = (HeadVar__2_2.data_tag == 0);
            if (succeeded)
              {
                V_6_6 = ((syntax2bel.Node_0.Leaf_3) HeadVar__2_2).F1;
                V_7_7 = ((syntax2bel.Node_0.Leaf_3) HeadVar__2_2).F2;
                V_8_8 = ((syntax2bel.Node_0.Leaf_3) HeadVar__2_2).F3;
                succeeded = (V_3_3.MR_value == V_6_6.MR_value);
                if (succeeded)
                  {
                    succeeded = V_4_4.equals(V_7_7);
                    if (succeeded)
                      {
                        succeeded = syntax2bel.__Unify____coref_0_0(V_5_5, V_8_8);
                      }
                  }
              }
          }
        else
          {
            jmercury.runtime.TypeInfo_Struct TypeInfo_17_17 = null;
            syntax2bel.Cat_0 V_9_9 = ((syntax2bel.Node_0.Nt_3) HeadVar__1_1).F1;
            syntax2bel.Label_0 V_10_10 = ((syntax2bel.Node_0.Nt_3) HeadVar__1_1).F2;
            list.List_1 V_11_11 = ((syntax2bel.Node_0.Nt_3) HeadVar__1_1).F3;
            syntax2bel.Cat_0 V_12_12 = null;
            syntax2bel.Label_0 V_13_13 = null;
            list.List_1 V_14_14 = null;

            succeeded = (HeadVar__2_2.data_tag == 1);
            if (succeeded)
              {
                V_12_12 = ((syntax2bel.Node_0.Nt_3) HeadVar__2_2).F1;
                V_13_13 = ((syntax2bel.Node_0.Nt_3) HeadVar__2_2).F2;
                V_14_14 = ((syntax2bel.Node_0.Nt_3) HeadVar__2_2).F3;
                succeeded = (V_9_9.MR_value == V_12_12.MR_value);
                if (succeeded)
                  {
                    {
                      succeeded = syntax2bel.__Unify____label_0_0(V_10_10, V_13_13);
                    }
                    if (succeeded)
                      {
                        TypeInfo_17_17 = jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.MR_scalar_common_1[2]);
                        {
                          succeeded = builtin.unify_2_p_0(TypeInfo_17_17, ((java.lang.Object) (V_11_11)), ((java.lang.Object) (V_14_14)));
                        }
                      }
                  }
              }
          }
      return succeeded;
    }
  }
//  syntax2bel.m:25
  public static builtin.Comparison_result_0 __Compare____label_0_0(
    syntax2bel.Label_0 HeadVar__2_2,
    syntax2bel.Label_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_13 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_14 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_13 == CastY_14);
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
            syntax2bel.Cat_0 V_17_17 = ((syntax2bel.Label_0.P_2) HeadVar__2_2).F2;
            syntax2bel.Ch_0 V_18_18 = ((syntax2bel.Label_0.P_2) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 0))
              HeadVar__1_1 = builtin.Comparison_result_0.K2;
            else
              {
                syntax2bel.Ch_0 V_10_10 = ((syntax2bel.Label_0.P_2) HeadVar__3_3).F1;
                syntax2bel.Cat_0 V_11_11 = ((syntax2bel.Label_0.P_2) HeadVar__3_3).F2;
                builtin.Comparison_result_0 V_12_12 = null;
                int V_19_19 = (int) V_18_18.MR_value;
                int V_20_20 = (int) V_10_10.MR_value;

                {
                  V_12_12 = private_builtin.builtin_compare_int_3_p_0(V_19_19, V_20_20);
                }
                succeeded = (V_12_12.MR_value == builtin.Comparison_result_0.K0.MR_value);
                succeeded = !(succeeded);
                if (succeeded)
                  HeadVar__1_1 = V_12_12;
                else
                  {
                    int V_21_21 = (int) V_17_17.MR_value;
                    int V_22_22 = (int) V_11_11.MR_value;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_21_21, V_22_22);
                    }
                  }
              }
          }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____label_0_0(
    syntax2bel.Label_0 HeadVar__1_1,
    syntax2bel.Label_0 HeadVar__2_2)
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
            syntax2bel.Ch_0 V_3_3 = ((syntax2bel.Label_0.P_2) HeadVar__1_1).F1;
            syntax2bel.Cat_0 V_4_4 = ((syntax2bel.Label_0.P_2) HeadVar__1_1).F2;
            syntax2bel.Ch_0 V_5_5 = null;
            syntax2bel.Cat_0 V_6_6 = null;

            succeeded = (HeadVar__2_2.data_tag == 1);
            if (succeeded)
              {
                V_5_5 = ((syntax2bel.Label_0.P_2) HeadVar__2_2).F1;
                V_6_6 = ((syntax2bel.Label_0.P_2) HeadVar__2_2).F2;
                succeeded = (V_3_3.MR_value == V_5_5.MR_value);
                if (succeeded)
                  succeeded = (V_4_4.MR_value == V_6_6.MR_value);
              }
          }
      return succeeded;
    }
  }
//  syntax2bel.m:14
  public static builtin.Comparison_result_0 __Compare____coref_0_0(
    syntax2bel.Coref_0 HeadVar__2_2,
    syntax2bel.Coref_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_16 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_17 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_16 == CastY_17);
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
              default: /*NOTREACHED*/
                throw new jmercury.runtime.UnreachableDefault();
            }
            break;
          case 2:
            {
              int V_19_19 = ((syntax2bel.Coref_0.Coref_2) HeadVar__2_2).F2;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 1:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 2:
                  {
                    int V_11_11 = ((syntax2bel.Coref_0.Coref_2) HeadVar__3_3).F2;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_19_19, V_11_11);
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
  public static boolean __Unify____coref_0_0(
    syntax2bel.Coref_0 HeadVar__1_1,
    syntax2bel.Coref_0 HeadVar__2_2)
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
            {
              int V_4_4 = ((syntax2bel.Coref_0.Coref_2) HeadVar__1_1).F2;
              int V_6_6 = 0;

              succeeded = (HeadVar__2_2.data_tag == 2);
              if (succeeded)
                {
                  V_6_6 = ((syntax2bel.Coref_0.Coref_2) HeadVar__2_2).F2;
                  succeeded = (V_4_4 == V_6_6);
                }
            }
            break;
          default: /*NOTREACHED*/
            throw new jmercury.runtime.UnreachableDefault();
        }
      return succeeded;
    }
  }
//  syntax2bel.m:26
  public static builtin.Comparison_result_0 __Compare____ch_0_0(
    syntax2bel.Ch_0 HeadVar__2_2,
    syntax2bel.Ch_0 HeadVar__3_3)
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
  public static boolean __Unify____ch_0_0(
    syntax2bel.Ch_0 HeadVar__2_1,
    syntax2bel.Ch_0 HeadVar__2_2)
  {
    {
      boolean succeeded = (HeadVar__2_1.MR_value == HeadVar__2_2.MR_value);

      return succeeded;
    }
  }
//  syntax2bel.m:21
  public static builtin.Comparison_result_0 __Compare____cat_0_0(
    syntax2bel.Cat_0 HeadVar__2_2,
    syntax2bel.Cat_0 HeadVar__3_3)
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
  public static boolean __Unify____cat_0_0(
    syntax2bel.Cat_0 HeadVar__2_1,
    syntax2bel.Cat_0 HeadVar__2_2)
  {
    {
      boolean succeeded = (HeadVar__2_1.MR_value == HeadVar__2_2.MR_value);

      return succeeded;
    }
  }
//  syntax2bel.m:169
  private static java.lang.Object [] label_2_p_0(
    java.lang.String HeadVar__1_1)
  {
//  syntax2bel.m:170
    {
      boolean succeeded = false;
      syntax2bel.Label_0 HeadVar__2_2 = null;
      int lo_0 = 0;
      int hi_1 = 0;
      int mid_2 = 0;
      int result_3 = 0;
      int stop_loop_4 = 0;

      /* binary string jump switch */
      succeeded = false;
      lo_0 = 0;
      hi_1 = 44;
      stop_loop_4 = 0;
      do
        {
          mid_2 = ((lo_0 + hi_1) / 2);
          result_3 = (HeadVar__1_1.compareTo(((syntax2bel.Vector_common_type_5_0) (MR_vector_common_5[77 + mid_2])).vct_5_f_0)) ;
          if ((result_3 == 0))
            {
              switch (((syntax2bel.Vector_common_type_5_0) (MR_vector_common_5[77 + mid_2])).vct_5_f_1) {
                case 0:
                  {
                    /* case "" */
                    HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_8[0];
                    succeeded = true;
                  }
                  break;
                case 1:
//  syntax2bel.m:171
                  {
                    /* case "C-ADJP" */
                    {
                      syntax2bel.Ch_0 V_5_5 = syntax2bel.Ch_0.K0;
                      syntax2bel.Cat_0 V_6_6 = syntax2bel.Cat_0.K1;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[43];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 2:
//  syntax2bel.m:172
                  {
                    /* case "C-ADVP" */
                    {
                      syntax2bel.Ch_0 V_9_9 = syntax2bel.Ch_0.K0;
                      syntax2bel.Cat_0 V_10_10 = syntax2bel.Cat_0.K2;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[42];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 3:
//  syntax2bel.m:173
                  {
                    /* case "C-FRAG" */
                    {
                      syntax2bel.Ch_0 V_13_13 = syntax2bel.Ch_0.K0;
                      syntax2bel.Cat_0 V_14_14 = syntax2bel.Cat_0.K12;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[41];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 4:
//  syntax2bel.m:174
                  {
                    /* case "C-INTJ" */
                    {
                      syntax2bel.Ch_0 V_17_17 = syntax2bel.Ch_0.K0;
                      syntax2bel.Cat_0 V_18_18 = syntax2bel.Cat_0.K10;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[40];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 5:
//  syntax2bel.m:175
                  {
                    /* case "C-NAC" */
                    {
                      syntax2bel.Ch_0 V_21_21 = syntax2bel.Ch_0.K0;
                      syntax2bel.Cat_0 V_22_22 = syntax2bel.Cat_0.K27;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[39];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 6:
//  syntax2bel.m:176
                  {
                    /* case "C-NP" */
                    {
                      syntax2bel.Ch_0 V_25_25 = syntax2bel.Ch_0.K0;
                      syntax2bel.Cat_0 V_26_26 = syntax2bel.Cat_0.K3;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[38];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 7:
//  syntax2bel.m:177
                  {
                    /* case "C-NX" */
                    {
                      syntax2bel.Ch_0 V_29_29 = syntax2bel.Ch_0.K0;
                      syntax2bel.Cat_0 V_30_30 = syntax2bel.Cat_0.K26;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[37];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 8:
//  syntax2bel.m:178
                  {
                    /* case "C-PP" */
                    {
                      syntax2bel.Ch_0 V_33_33 = syntax2bel.Ch_0.K0;
                      syntax2bel.Cat_0 V_34_34 = syntax2bel.Cat_0.K4;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[36];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 9:
//  syntax2bel.m:179
                  {
                    /* case "C-PRN" */
                    {
                      syntax2bel.Ch_0 V_37_37 = syntax2bel.Ch_0.K0;
                      syntax2bel.Cat_0 V_38_38 = syntax2bel.Cat_0.K17;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[35];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 10:
//  syntax2bel.m:180
                  {
                    /* case "C-RRC" */
                    {
                      syntax2bel.Ch_0 V_41_41 = syntax2bel.Ch_0.K0;
                      syntax2bel.Cat_0 V_42_42 = syntax2bel.Cat_0.K28;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[34];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 11:
//  syntax2bel.m:184
                  {
                    /* case "C-S" */
                    {
                      syntax2bel.Ch_0 V_57_57 = syntax2bel.Ch_0.K0;
                      syntax2bel.Cat_0 V_58_58 = syntax2bel.Cat_0.K5;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[33];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 12:
//  syntax2bel.m:181
                  {
                    /* case "C-SBAR" */
                    {
                      syntax2bel.Ch_0 V_45_45 = syntax2bel.Ch_0.K0;
                      syntax2bel.Cat_0 V_46_46 = syntax2bel.Cat_0.K7;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[32];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 13:
//  syntax2bel.m:182
                  {
                    /* case "C-SBARQ" */
                    {
                      syntax2bel.Ch_0 V_49_49 = syntax2bel.Ch_0.K0;
                      syntax2bel.Cat_0 V_50_50 = syntax2bel.Cat_0.K15;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[31];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 14:
//  syntax2bel.m:183
                  {
                    /* case "C-SINV" */
                    {
                      syntax2bel.Ch_0 V_53_53 = syntax2bel.Ch_0.K0;
                      syntax2bel.Cat_0 V_54_54 = syntax2bel.Cat_0.K18;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[30];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 15:
//  syntax2bel.m:185
                  {
                    /* case "C-SQ" */
                    {
                      syntax2bel.Ch_0 V_61_61 = syntax2bel.Ch_0.K0;
                      syntax2bel.Cat_0 V_62_62 = syntax2bel.Cat_0.K11;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[29];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 16:
//  syntax2bel.m:186
                  {
                    /* case "C-UCP" */
                    {
                      syntax2bel.Ch_0 V_65_65 = syntax2bel.Ch_0.K0;
                      syntax2bel.Cat_0 V_66_66 = syntax2bel.Cat_0.K20;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[28];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 17:
//  syntax2bel.m:187
                  {
                    /* case "C-VP" */
                    {
                      syntax2bel.Ch_0 V_69_69 = syntax2bel.Ch_0.K0;
                      syntax2bel.Cat_0 V_70_70 = syntax2bel.Cat_0.K6;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[27];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 18:
//  syntax2bel.m:189
                  {
                    /* case "C-WHADVP" */
                    {
                      syntax2bel.Ch_0 V_75_75 = syntax2bel.Ch_0.K0;
                      syntax2bel.Cat_0 V_76_76 = syntax2bel.Cat_0.K13;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[26];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 19:
//  syntax2bel.m:190
                  {
                    /* case "C-WHNP" */
                    {
                      syntax2bel.Ch_0 V_79_79 = syntax2bel.Ch_0.K0;
                      syntax2bel.Cat_0 V_80_80 = syntax2bel.Cat_0.K8;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[25];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 20:
//  syntax2bel.m:191
                  {
                    /* case "C-WHPP" */
                    {
                      syntax2bel.Ch_0 V_83_83 = syntax2bel.Ch_0.K0;
                      syntax2bel.Cat_0 V_84_84 = syntax2bel.Cat_0.K24;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[24];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 21:
//  syntax2bel.m:192
                  {
                    /* case "C-X" */
                    {
                      syntax2bel.Ch_0 V_87_87 = syntax2bel.Ch_0.K0;
                      syntax2bel.Cat_0 V_88_88 = syntax2bel.Cat_0.K22;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[23];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 22:
//  syntax2bel.m:171
                  {
                    /* case "S-ADJP" */
                    {
                      syntax2bel.Ch_0 V_3_3 = syntax2bel.Ch_0.K1;
                      syntax2bel.Cat_0 V_4_4 = syntax2bel.Cat_0.K1;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[22];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 23:
//  syntax2bel.m:172
                  {
                    /* case "S-ADVP" */
                    {
                      syntax2bel.Ch_0 V_7_7 = syntax2bel.Ch_0.K1;
                      syntax2bel.Cat_0 V_8_8 = syntax2bel.Cat_0.K2;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[21];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 24:
//  syntax2bel.m:193
                  {
                    /* case "S-EDITED" */
                    {
                      syntax2bel.Ch_0 V_89_89 = syntax2bel.Ch_0.K1;
                      syntax2bel.Cat_0 V_90_90 = syntax2bel.Cat_0.K31;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[20];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 25:
//  syntax2bel.m:173
                  {
                    /* case "S-FRAG" */
                    {
                      syntax2bel.Ch_0 V_11_11 = syntax2bel.Ch_0.K1;
                      syntax2bel.Cat_0 V_12_12 = syntax2bel.Cat_0.K12;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[19];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 26:
//  syntax2bel.m:174
                  {
                    /* case "S-INTJ" */
                    {
                      syntax2bel.Ch_0 V_15_15 = syntax2bel.Ch_0.K1;
                      syntax2bel.Cat_0 V_16_16 = syntax2bel.Cat_0.K10;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[18];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 27:
//  syntax2bel.m:175
                  {
                    /* case "S-NAC" */
                    {
                      syntax2bel.Ch_0 V_19_19 = syntax2bel.Ch_0.K1;
                      syntax2bel.Cat_0 V_20_20 = syntax2bel.Cat_0.K27;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[17];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 28:
//  syntax2bel.m:176
                  {
                    /* case "S-NP" */
                    {
                      syntax2bel.Ch_0 V_23_23 = syntax2bel.Ch_0.K1;
                      syntax2bel.Cat_0 V_24_24 = syntax2bel.Cat_0.K3;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[16];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 29:
//  syntax2bel.m:177
                  {
                    /* case "S-NX" */
                    {
                      syntax2bel.Ch_0 V_27_27 = syntax2bel.Ch_0.K1;
                      syntax2bel.Cat_0 V_28_28 = syntax2bel.Cat_0.K26;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[15];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 30:
//  syntax2bel.m:178
                  {
                    /* case "S-PP" */
                    {
                      syntax2bel.Ch_0 V_31_31 = syntax2bel.Ch_0.K1;
                      syntax2bel.Cat_0 V_32_32 = syntax2bel.Cat_0.K4;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[14];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 31:
//  syntax2bel.m:179
                  {
                    /* case "S-PRN" */
                    {
                      syntax2bel.Ch_0 V_35_35 = syntax2bel.Ch_0.K1;
                      syntax2bel.Cat_0 V_36_36 = syntax2bel.Cat_0.K17;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[13];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 32:
//  syntax2bel.m:180
                  {
                    /* case "S-RRC" */
                    {
                      syntax2bel.Ch_0 V_39_39 = syntax2bel.Ch_0.K1;
                      syntax2bel.Cat_0 V_40_40 = syntax2bel.Cat_0.K28;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[12];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 33:
//  syntax2bel.m:184
                  {
                    /* case "S-S" */
                    {
                      syntax2bel.Ch_0 V_55_55 = syntax2bel.Ch_0.K1;
                      syntax2bel.Cat_0 V_56_56 = syntax2bel.Cat_0.K5;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[11];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 34:
//  syntax2bel.m:181
                  {
                    /* case "S-SBAR" */
                    {
                      syntax2bel.Ch_0 V_43_43 = syntax2bel.Ch_0.K1;
                      syntax2bel.Cat_0 V_44_44 = syntax2bel.Cat_0.K7;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[10];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 35:
//  syntax2bel.m:182
                  {
                    /* case "S-SBARQ" */
                    {
                      syntax2bel.Ch_0 V_47_47 = syntax2bel.Ch_0.K1;
                      syntax2bel.Cat_0 V_48_48 = syntax2bel.Cat_0.K15;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[9];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 36:
//  syntax2bel.m:183
                  {
                    /* case "S-SINV" */
                    {
                      syntax2bel.Ch_0 V_51_51 = syntax2bel.Ch_0.K1;
                      syntax2bel.Cat_0 V_52_52 = syntax2bel.Cat_0.K18;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[8];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 37:
//  syntax2bel.m:185
                  {
                    /* case "S-SQ" */
                    {
                      syntax2bel.Ch_0 V_59_59 = syntax2bel.Ch_0.K1;
                      syntax2bel.Cat_0 V_60_60 = syntax2bel.Cat_0.K11;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[7];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 38:
//  syntax2bel.m:186
                  {
                    /* case "S-UCP" */
                    {
                      syntax2bel.Ch_0 V_63_63 = syntax2bel.Ch_0.K1;
                      syntax2bel.Cat_0 V_64_64 = syntax2bel.Cat_0.K20;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[6];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 39:
//  syntax2bel.m:187
                  {
                    /* case "S-VP" */
                    {
                      syntax2bel.Ch_0 V_67_67 = syntax2bel.Ch_0.K1;
                      syntax2bel.Cat_0 V_68_68 = syntax2bel.Cat_0.K6;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[5];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 40:
//  syntax2bel.m:188
                  {
                    /* case "S-WHADJP" */
                    {
                      syntax2bel.Ch_0 V_71_71 = syntax2bel.Ch_0.K1;
                      syntax2bel.Cat_0 V_72_72 = syntax2bel.Cat_0.K23;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[4];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 41:
//  syntax2bel.m:189
                  {
                    /* case "S-WHADVP" */
                    {
                      syntax2bel.Ch_0 V_73_73 = syntax2bel.Ch_0.K1;
                      syntax2bel.Cat_0 V_74_74 = syntax2bel.Cat_0.K13;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[3];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 42:
//  syntax2bel.m:190
                  {
                    /* case "S-WHNP" */
                    {
                      syntax2bel.Ch_0 V_77_77 = syntax2bel.Ch_0.K1;
                      syntax2bel.Cat_0 V_78_78 = syntax2bel.Cat_0.K8;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[2];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 43:
//  syntax2bel.m:191
                  {
                    /* case "S-WHPP" */
                    {
                      syntax2bel.Ch_0 V_81_81 = syntax2bel.Ch_0.K1;
                      syntax2bel.Cat_0 V_82_82 = syntax2bel.Cat_0.K24;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[1];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
                  break;
                case 44:
//  syntax2bel.m:192
                  {
                    /* case "S-X" */
                    {
                      syntax2bel.Ch_0 V_85_85 = syntax2bel.Ch_0.K1;
                      syntax2bel.Cat_0 V_86_86 = syntax2bel.Cat_0.K22;

                      HeadVar__2_2 = (syntax2bel.Label_0) syntax2bel.MR_scalar_common_7[0];
                      succeeded = true;
                    }
                  }
//  syntax2bel.m:170
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
//  syntax2bel.m:169
  }
//  syntax2bel.m:80
  private static java.lang.Object [] conv_strnode_6_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_4)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      java.lang.Object wrapper_arg_5 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      list.List_1 conv1_STATE_VARIABLE_Ns_23 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_25 = null;

      {
        java.lang.Object [] result = syntax2bel.conv_strnode_6_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((syntax2bel.Strnode_0) wrapper_arg_1), ((list.List_1) wrapper_arg_2), ((list.List_1) wrapper_arg_4));
        conv1_STATE_VARIABLE_Ns_23 = (list.List_1) result[0];
        conv0_STATE_VARIABLE_Es_25 = (list.List_1) result[1];
      }
      wrapper_arg_3 = ((java.lang.Object) (conv1_STATE_VARIABLE_Ns_23));
      wrapper_arg_5 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_25));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_3)),
        ((java.lang.Object) (wrapper_arg_5))
      };
    }
  }
//  syntax2bel.m:71
  private static java.lang.Object [] conv_strnode_6_p_0(
    java.lang.String File_7,
    syntax2bel.Strnode_0 StrNode_8,
    list.List_1 STATE_VARIABLE_Ns_0_22,
    list.List_1 STATE_VARIABLE_Es_0_24)
  {
//  syntax2bel.m:73
    {
      boolean succeeded = false;
      list.List_1 STATE_VARIABLE_Ns_23 = null;
      list.List_1 STATE_VARIABLE_Es_25 = null;
      java.lang.String CatStr_11 = ((syntax2bel.Strnode_0) StrNode_8).F1;
      java.lang.String Text_12 = ((syntax2bel.Strnode_0) StrNode_8).F2;
      java.lang.String LblStr_14 = ((syntax2bel.Strnode_0) StrNode_8).F4;
      list.List_1 Cs_15 = ((syntax2bel.Strnode_0) StrNode_8).F5;
//  syntax2bel.m:74
      syntax2bel.Strcoref_0 CrfStr_13 = ((syntax2bel.Strnode_0) StrNode_8).F3;
//  syntax2bel.m:78
      syntax2bel.Pos_0 Pos_16 = null;
//  syntax2bel.m:75
      syntax2bel.Strnode_0 V_26_26 = null;
      java.lang.String V_27_27 = null;
      java.lang.String V_28_28 = null;
      list.List_1 V_29_29 = null;
      list.List_1 V_30_30 = null;
      java.lang.String V_56_56 = null;
//  syntax2bel.m:92
      int lo_0 = 0;
      int hi_1 = 0;
      int mid_2 = 0;
      int result_3 = 0;
      int stop_loop_4 = 0;
//  syntax2bel.m:75
      syntax2bel.Strcoref_0 CrfStr2_17 = null;

//  syntax2bel.m:92
      /* binary string jump switch */
      succeeded = false;
      lo_0 = 0;
      hi_1 = 44;
      stop_loop_4 = 0;
      do
        {
          mid_2 = ((lo_0 + hi_1) / 2);
          result_3 = (CatStr_11.compareTo(((syntax2bel.Vector_common_type_5_0) (MR_vector_common_5[0 + mid_2])).vct_5_f_0)) ;
          if ((result_3 == 0))
            {
              switch (((syntax2bel.Vector_common_type_5_0) (MR_vector_common_5[0 + mid_2])).vct_5_f_1) {
                case 0:
//  syntax2bel.m:133
                  {
                    /* case "#" */
                    Pos_16 = syntax2bel.Pos_0.K36;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 1:
//  syntax2bel.m:132
                  {
                    /* case "$" */
                    Pos_16 = syntax2bel.Pos_0.K36;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 2:
//  syntax2bel.m:130
                  {
                    /* case "''" */
                    Pos_16 = syntax2bel.Pos_0.K36;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 3:
//  syntax2bel.m:129
                  {
                    /* case "," */
                    Pos_16 = syntax2bel.Pos_0.K36;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 4:
//  syntax2bel.m:131
                  {
                    /* case "-LRB-" */
                    Pos_16 = syntax2bel.Pos_0.K36;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 5:
//  syntax2bel.m:131
                  {
                    /* case "-RRB-" */
                    Pos_16 = syntax2bel.Pos_0.K36;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 6:
//  syntax2bel.m:129
                  {
                    /* case "." */
                    Pos_16 = syntax2bel.Pos_0.K36;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 7:
//  syntax2bel.m:129
                  {
                    /* case ":" */
                    Pos_16 = syntax2bel.Pos_0.K36;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 8:
                  {
                    /* case "CC" */
                    Pos_16 = syntax2bel.Pos_0.K0;
                    succeeded = true;
                  }
                  break;
                case 9:
//  syntax2bel.m:93
                  {
                    /* case "CD" */
                    Pos_16 = syntax2bel.Pos_0.K1;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 10:
//  syntax2bel.m:94
                  {
                    /* case "DT" */
                    Pos_16 = syntax2bel.Pos_0.K2;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 11:
//  syntax2bel.m:95
                  {
                    /* case "EX" */
                    Pos_16 = syntax2bel.Pos_0.K3;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 12:
//  syntax2bel.m:96
                  {
                    /* case "FW" */
                    Pos_16 = syntax2bel.Pos_0.K4;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 13:
//  syntax2bel.m:97
                  {
                    /* case "IN" */
                    Pos_16 = syntax2bel.Pos_0.K5;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 14:
//  syntax2bel.m:98
                  {
                    /* case "JJ" */
                    Pos_16 = syntax2bel.Pos_0.K6;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 15:
//  syntax2bel.m:99
                  {
                    /* case "JJR" */
                    Pos_16 = syntax2bel.Pos_0.K7;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 16:
//  syntax2bel.m:100
                  {
                    /* case "JJS" */
                    Pos_16 = syntax2bel.Pos_0.K8;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 17:
//  syntax2bel.m:101
                  {
                    /* case "LS" */
                    Pos_16 = syntax2bel.Pos_0.K9;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 18:
//  syntax2bel.m:102
                  {
                    /* case "MD" */
                    Pos_16 = syntax2bel.Pos_0.K10;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 19:
//  syntax2bel.m:103
                  {
                    /* case "NN" */
                    Pos_16 = syntax2bel.Pos_0.K11;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 20:
//  syntax2bel.m:105
                  {
                    /* case "NNP" */
                    Pos_16 = syntax2bel.Pos_0.K12;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 21:
//  syntax2bel.m:106
                  {
                    /* case "NNPS" */
                    Pos_16 = syntax2bel.Pos_0.K13;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 22:
//  syntax2bel.m:104
                  {
                    /* case "NNS" */
                    Pos_16 = syntax2bel.Pos_0.K14;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 23:
//  syntax2bel.m:107
                  {
                    /* case "PDT" */
                    Pos_16 = syntax2bel.Pos_0.K15;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 24:
//  syntax2bel.m:108
                  {
                    /* case "POS" */
                    Pos_16 = syntax2bel.Pos_0.K16;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 25:
//  syntax2bel.m:109
                  {
                    /* case "PRP" */
                    Pos_16 = syntax2bel.Pos_0.K17;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 26:
//  syntax2bel.m:110
                  {
                    /* case "PRP$" */
                    Pos_16 = syntax2bel.Pos_0.K18;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 27:
//  syntax2bel.m:111
                  {
                    /* case "RB" */
                    Pos_16 = syntax2bel.Pos_0.K19;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 28:
//  syntax2bel.m:112
                  {
                    /* case "RBR" */
                    Pos_16 = syntax2bel.Pos_0.K20;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 29:
//  syntax2bel.m:113
                  {
                    /* case "RBS" */
                    Pos_16 = syntax2bel.Pos_0.K21;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 30:
//  syntax2bel.m:114
                  {
                    /* case "RP" */
                    Pos_16 = syntax2bel.Pos_0.K22;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 31:
//  syntax2bel.m:115
                  {
                    /* case "SYM" */
                    Pos_16 = syntax2bel.Pos_0.K23;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 32:
//  syntax2bel.m:116
                  {
                    /* case "TO" */
                    Pos_16 = syntax2bel.Pos_0.K24;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 33:
//  syntax2bel.m:117
                  {
                    /* case "UH" */
                    Pos_16 = syntax2bel.Pos_0.K25;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 34:
//  syntax2bel.m:118
                  {
                    /* case "VB" */
                    Pos_16 = syntax2bel.Pos_0.K26;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 35:
//  syntax2bel.m:121
                  {
                    /* case "VBD" */
                    Pos_16 = syntax2bel.Pos_0.K27;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 36:
//  syntax2bel.m:122
                  {
                    /* case "VBG" */
                    Pos_16 = syntax2bel.Pos_0.K28;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 37:
//  syntax2bel.m:123
                  {
                    /* case "VBN" */
                    Pos_16 = syntax2bel.Pos_0.K29;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 38:
//  syntax2bel.m:119
                  {
                    /* case "VBP" */
                    Pos_16 = syntax2bel.Pos_0.K30;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 39:
//  syntax2bel.m:120
                  {
                    /* case "VBZ" */
                    Pos_16 = syntax2bel.Pos_0.K31;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 40:
//  syntax2bel.m:124
                  {
                    /* case "WDT" */
                    Pos_16 = syntax2bel.Pos_0.K32;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 41:
//  syntax2bel.m:125
                  {
                    /* case "WP" */
                    Pos_16 = syntax2bel.Pos_0.K33;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 42:
//  syntax2bel.m:126
                  {
                    /* case "WP$" */
                    Pos_16 = syntax2bel.Pos_0.K34;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 43:
//  syntax2bel.m:127
                  {
                    /* case "WRB" */
                    Pos_16 = syntax2bel.Pos_0.K35;
                    succeeded = true;
                  }
//  syntax2bel.m:92
                  break;
                case 44:
//  syntax2bel.m:130
                  {
                    /* case "``" */
                    Pos_16 = syntax2bel.Pos_0.K36;
                    succeeded = true;
                  }
//  syntax2bel.m:92
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
//  syntax2bel.m:75
      if (succeeded)
        {
          succeeded = (Cs_15.data_tag == 1);
          if (succeeded)
            {
              V_26_26 = ((syntax2bel.Strnode_0) ((list.List_1.F_cons_2) Cs_15).F1);
              V_30_30 = ((list.List_1.F_cons_2) Cs_15).F2;
              V_27_27 = ((syntax2bel.Strnode_0) V_26_26).F1;
              V_56_56 = ((syntax2bel.Strnode_0) V_26_26).F2;
              CrfStr2_17 = ((syntax2bel.Strnode_0) V_26_26).F3;
              V_28_28 = ((syntax2bel.Strnode_0) V_26_26).F4;
              V_29_29 = ((syntax2bel.Strnode_0) V_26_26).F5;
              succeeded = Text_12.equals(V_56_56);
              if (succeeded)
                {
                  succeeded = V_27_27.equals("TK");
                  if (succeeded)
                    {
                      succeeded = V_28_28.equals("");
                      if (succeeded)
                        {
                          succeeded = (V_29_29.data_tag == 0);
                          if (succeeded)
                            succeeded = (V_30_30.data_tag == 0);
                        }
                    }
                }
            }
        }
//  syntax2bel.m:78
      if (succeeded)
//  syntax2bel.m:76
        {
          syntax2bel.Coref_0 Coref_18 = (syntax2bel.Coref_0) syntax2bel.MR_scalar_common_6[0];
          syntax2bel.Node_0 V_33_33 = null;

//  syntax2bel.m:86
          STATE_VARIABLE_Es_25 = STATE_VARIABLE_Es_0_24;
//  syntax2bel.m:77
          {
            V_33_33 = new syntax2bel.Node_0.Leaf_3(Pos_16, Text_12, Coref_18);
          }
          {
            STATE_VARIABLE_Ns_23 = new list.List_1.F_cons_2(((java.lang.Object) (V_33_33)), STATE_VARIABLE_Ns_0_22);
          }
//  syntax2bel.m:76
        }
//  syntax2bel.m:78
      else
//  syntax2bel.m:82
        {
          syntax2bel.Cat_0 Cat_19 = null;
          syntax2bel.Label_0 Label_20 = null;
//  syntax2bel.m:136
          int lo_5 = 0;
          int hi_6 = 0;
          int mid_7 = 0;
          int result_8 = 0;
          int stop_loop_9 = 0;

          /* binary string jump switch */
          succeeded = false;
          lo_5 = 0;
          hi_6 = 31;
          stop_loop_9 = 0;
          do
            {
              mid_7 = ((lo_5 + hi_6) / 2);
              result_8 = (CatStr_11.compareTo(((syntax2bel.Vector_common_type_5_0) (MR_vector_common_5[45 + mid_7])).vct_5_f_0)) ;
              if ((result_8 == 0))
                {
                  switch (((syntax2bel.Vector_common_type_5_0) (MR_vector_common_5[45 + mid_7])).vct_5_f_1) {
                    case 0:
//  syntax2bel.m:139
                      {
                        /* case "ADJP" */
                        Cat_19 = syntax2bel.Cat_0.K1;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 1:
//  syntax2bel.m:140
                      {
                        /* case "ADVP" */
                        Cat_19 = syntax2bel.Cat_0.K2;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 2:
//  syntax2bel.m:141
                      {
                        /* case "AUX" */
                        Cat_19 = syntax2bel.Cat_0.K29;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 3:
//  syntax2bel.m:142
                      {
                        /* case "CONJP" */
                        Cat_19 = syntax2bel.Cat_0.K19;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 4:
//  syntax2bel.m:137
                      {
                        /* case "EDITED" */
                        Cat_19 = syntax2bel.Cat_0.K31;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 5:
//  syntax2bel.m:143
                      {
                        /* case "FRAG" */
                        Cat_19 = syntax2bel.Cat_0.K12;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 6:
//  syntax2bel.m:144
                      {
                        /* case "INC" */
                        Cat_19 = syntax2bel.Cat_0.K21;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 7:
//  syntax2bel.m:145
                      {
                        /* case "INTJ" */
                        Cat_19 = syntax2bel.Cat_0.K10;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 8:
//  syntax2bel.m:146
                      {
                        /* case "LST" */
                        Cat_19 = syntax2bel.Cat_0.K25;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 9:
//  syntax2bel.m:147
                      {
                        /* case "NAC" */
                        Cat_19 = syntax2bel.Cat_0.K27;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 10:
//  syntax2bel.m:148
                      {
                        /* case "NEG" */
                        Cat_19 = syntax2bel.Cat_0.K30;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 11:
//  syntax2bel.m:138
                      {
                        /* case "NML" */
                        Cat_19 = syntax2bel.Cat_0.K9;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 12:
//  syntax2bel.m:149
                      {
                        /* case "NP" */
                        Cat_19 = syntax2bel.Cat_0.K3;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 13:
//  syntax2bel.m:150
                      {
                        /* case "NX" */
                        Cat_19 = syntax2bel.Cat_0.K26;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 14:
//  syntax2bel.m:151
                      {
                        /* case "PP" */
                        Cat_19 = syntax2bel.Cat_0.K4;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 15:
//  syntax2bel.m:152
                      {
                        /* case "PRN" */
                        Cat_19 = syntax2bel.Cat_0.K17;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 16:
//  syntax2bel.m:153
                      {
                        /* case "PRT" */
                        Cat_19 = syntax2bel.Cat_0.K14;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 17:
//  syntax2bel.m:154
                      {
                        /* case "QP" */
                        Cat_19 = syntax2bel.Cat_0.K16;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 18:
//  syntax2bel.m:155
                      {
                        /* case "RRC" */
                        Cat_19 = syntax2bel.Cat_0.K28;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 19:
//  syntax2bel.m:160
                      {
                        /* case "S" */
                        Cat_19 = syntax2bel.Cat_0.K5;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 20:
//  syntax2bel.m:157
                      {
                        /* case "SBAR" */
                        Cat_19 = syntax2bel.Cat_0.K7;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 21:
//  syntax2bel.m:156
                      {
                        /* case "SBARQ" */
                        Cat_19 = syntax2bel.Cat_0.K15;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 22:
//  syntax2bel.m:158
                      {
                        /* case "SINV" */
                        Cat_19 = syntax2bel.Cat_0.K18;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 23:
//  syntax2bel.m:159
                      {
                        /* case "SQ" */
                        Cat_19 = syntax2bel.Cat_0.K11;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 24:
                      {
                        /* case "TOP" */
                        Cat_19 = syntax2bel.Cat_0.K0;
                        succeeded = true;
                      }
                      break;
                    case 25:
//  syntax2bel.m:161
                      {
                        /* case "UCP" */
                        Cat_19 = syntax2bel.Cat_0.K20;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 26:
//  syntax2bel.m:162
                      {
                        /* case "VP" */
                        Cat_19 = syntax2bel.Cat_0.K6;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 27:
//  syntax2bel.m:163
                      {
                        /* case "WHADJP" */
                        Cat_19 = syntax2bel.Cat_0.K23;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 28:
//  syntax2bel.m:164
                      {
                        /* case "WHADVP" */
                        Cat_19 = syntax2bel.Cat_0.K13;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 29:
//  syntax2bel.m:165
                      {
                        /* case "WHNP" */
                        Cat_19 = syntax2bel.Cat_0.K8;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 30:
//  syntax2bel.m:166
                      {
                        /* case "WHPP" */
                        Cat_19 = syntax2bel.Cat_0.K24;
                        succeeded = true;
                      }
//  syntax2bel.m:136
                      break;
                    case 31:
//  syntax2bel.m:167
                      {
                        /* case "X" */
                        Cat_19 = syntax2bel.Cat_0.K22;
                        succeeded = true;
                      }
//  syntax2bel.m:136
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
//  syntax2bel.m:78
          if (succeeded)
            {
              java.lang.Object [] result = syntax2bel.label_2_p_0(LblStr_14);
              succeeded = ((java.lang.Boolean) result[0]).booleanValue();
              Label_20 = (syntax2bel.Label_0) result[1];
            }
//  syntax2bel.m:82
          if (succeeded)
//  syntax2bel.m:79
            {
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_50_50 = null;
              jmercury.runtime.TypeInfo_Struct TypeInfo_51_51 = null;
              jmercury.runtime.TypeInfo_Struct TypeInfo_52_52 = null;
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_53_53 = null;
              list.List_1 RevNodes_21 = null;
              /* closure */ java.lang.Object[] V_35_35 = null;
              list.List_1 V_36_36 = null;
              syntax2bel.Node_0 V_39_39 = null;
              list.List_1 V_40_40 = null;
//  syntax2bel.m:80
              java.lang.Object conv3_RevNodes_21 = null;
              java.lang.Object conv2_STATE_VARIABLE_Es_25 = null;

              {
                V_35_35 = new /* closure */ java.lang.Object[] {((java.lang.Object) (syntax2bel.MR_scalar_common_4[1])), ((java.lang.Object) (new AddrOf4_0(0))), java.lang.Integer.valueOf(1), ((java.lang.Object) (File_7))};
              }
              V_36_36 = (list.List_1) syntax2bel.MR_scalar_common_3[0];
              TypeCtorInfo_50_50 = jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.syntax2bel__type_ctor_info_strnode_0);
              TypeInfo_51_51 = jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.MR_scalar_common_1[2]);
              TypeInfo_52_52 = jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.MR_scalar_common_1[1]);
              {
                java.lang.Object [] result = list.foldl2_6_p_0(TypeCtorInfo_50_50, TypeInfo_51_51, TypeInfo_52_52, V_35_35, Cs_15, ((java.lang.Object) (V_36_36)), ((java.lang.Object) (STATE_VARIABLE_Es_0_24)));
                conv3_RevNodes_21 = (java.lang.Object) result[0];
                conv2_STATE_VARIABLE_Es_25 = (java.lang.Object) result[1];
              }
              RevNodes_21 = ((list.List_1) conv3_RevNodes_21);
              STATE_VARIABLE_Es_25 = ((list.List_1) conv2_STATE_VARIABLE_Es_25);
              TypeCtorInfo_53_53 = jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.syntax2bel__type_ctor_info_node_0);
//  syntax2bel.m:81
              {
                V_40_40 = list.reverse_1_f_0(TypeCtorInfo_53_53, RevNodes_21);
              }
              {
                V_39_39 = new syntax2bel.Node_0.Nt_3(Cat_19, Label_20, V_40_40);
              }
              {
                STATE_VARIABLE_Ns_23 = new list.List_1.F_cons_2(((java.lang.Object) (V_39_39)), STATE_VARIABLE_Ns_0_22);
              }
//  syntax2bel.m:79
            }
//  syntax2bel.m:82
          else
            {
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_54_54 = null;
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_55_55 = null;
              errors.Err_loc_0 V_41_41 = null;
              sberrs.Error_0 V_42_42 = null;
              java.lang.String V_44_44 = null;

              {
                V_41_41 = new errors.Err_loc_0.File_1(File_7);
              }
              TypeCtorInfo_54_54 = jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.syntax2bel__type_ctor_info_strnode_0);
              {
                V_44_44 = string.string_1_f_0(TypeCtorInfo_54_54, ((java.lang.Object) (StrNode_8)));
              }
              {
                V_42_42 = new sberrs.Error_0.Funny_strnode_1(V_44_44);
              }
              TypeCtorInfo_55_55 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
              {
                STATE_VARIABLE_Es_25 = errors.add_error_4_p_0(TypeCtorInfo_55_55, V_41_41, ((java.lang.Object) (V_42_42)), STATE_VARIABLE_Es_0_24);
              }
              STATE_VARIABLE_Ns_23 = STATE_VARIABLE_Ns_0_22;
            }
        }
//  syntax2bel.m:73
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_Ns_23)),
        ((java.lang.Object) (STATE_VARIABLE_Es_25))
      };
    }
//  syntax2bel.m:71
  }
//  syntax2bel.m:62
  private static java.lang.Object [] conv_strsent_6_p_0(
    java.lang.String File_7,
    syntax2bel.Strsent_0 HeadVar__2_2,
    list.List_1 STATE_VARIABLE_Ss_0_17,
    list.List_1 STATE_VARIABLE_Es_0_19)
  {
//  syntax2bel.m:64
    {
      boolean succeeded = false;
      list.List_1 STATE_VARIABLE_Ss_18 = null;
      list.List_1 STATE_VARIABLE_Es_20 = null;
      int I_8 = ((syntax2bel.Strsent_0) HeadVar__2_2).F1;
      java.lang.String Turn_9 = ((syntax2bel.Strsent_0) HeadVar__2_2).F2;
      java.lang.String Spk_10 = ((syntax2bel.Strsent_0) HeadVar__2_2).F3;
      syntax2bel.Strnode_0 StrNd_12 = ((syntax2bel.Strsent_0) HeadVar__2_2).F5;
      list.List_1 Nds_15 = null;
      list.List_1 V_21_21 = (list.List_1) syntax2bel.MR_scalar_common_3[0];
      java.lang.String V_11_11 = ((syntax2bel.Strsent_0) HeadVar__2_2).F4;
//  syntax2bel.m:68
      syntax2bel.Node_0 Nd_16 = null;
//  syntax2bel.m:66
      list.List_1 V_23_23 = null;

//  syntax2bel.m:65
      {
        java.lang.Object [] result = syntax2bel.conv_strnode_6_p_0(File_7, StrNd_12, V_21_21, STATE_VARIABLE_Es_0_19);
        Nds_15 = (list.List_1) result[0];
        STATE_VARIABLE_Es_20 = (list.List_1) result[1];
      }
//  syntax2bel.m:66
      succeeded = (Nds_15.data_tag == 1);
      if (succeeded)
        {
          Nd_16 = ((syntax2bel.Node_0) ((list.List_1.F_cons_2) Nds_15).F1);
          V_23_23 = ((list.List_1.F_cons_2) Nds_15).F2;
          succeeded = (V_23_23.data_tag == 0);
        }
//  syntax2bel.m:68
      if (succeeded)
//  syntax2bel.m:67
        {
          syntax2bel.Sent_0 V_25_25 = null;

          {
            V_25_25 = new syntax2bel.Sent_0(I_8, Turn_9, Spk_10, Nd_16);
          }
          {
            STATE_VARIABLE_Ss_18 = new list.List_1.F_cons_2(((java.lang.Object) (V_25_25)), STATE_VARIABLE_Ss_0_17);
          }
        }
//  syntax2bel.m:68
      else
//  syntax2bel.m:67
        STATE_VARIABLE_Ss_18 = STATE_VARIABLE_Ss_0_17;
//  syntax2bel.m:64
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_Ss_18)),
        ((java.lang.Object) (STATE_VARIABLE_Es_20))
      };
    }
//  syntax2bel.m:62
  }
//  syntax2bel.m:59
  private static java.lang.Object [] read_sents_9_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_4)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      java.lang.Object wrapper_arg_5 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      list.List_1 conv1_STATE_VARIABLE_Ss_18 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_20 = null;

      {
        java.lang.Object [] result = syntax2bel.conv_strsent_6_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((syntax2bel.Strsent_0) wrapper_arg_1), ((list.List_1) wrapper_arg_2), ((list.List_1) wrapper_arg_4));
        conv1_STATE_VARIABLE_Ss_18 = (list.List_1) result[0];
        conv0_STATE_VARIABLE_Es_20 = (list.List_1) result[1];
      }
      wrapper_arg_3 = ((java.lang.Object) (conv1_STATE_VARIABLE_Ss_18));
      wrapper_arg_5 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_20));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_3)),
        ((java.lang.Object) (wrapper_arg_5))
      };
    }
  }
//  syntax2bel.m:44
  private static java.lang.Object [] read_sents_9_p_0(
    java.lang.String File_10,
    java.lang.String Str_11,
    int Max_12,
    io.Posn_0 STATE_VARIABLE_Pos_0_20,
    list.List_1 STATE_VARIABLE_Ss_0_22,
    list.List_1 STATE_VARIABLE_Es_0_24)
  {
//  syntax2bel.m:46
    while (true)
      {
        /* tailcall optimized into a loop */
        {
          boolean succeeded = false;
          io.Posn_0 STATE_VARIABLE_Pos_21 = null;
          list.List_1 STATE_VARIABLE_Ss_23 = null;
          list.List_1 STATE_VARIABLE_Es_25 = null;
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_35_35 = jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.syntax2bel__type_ctor_info_strfile_0);
          io.Read_result_1 Res_16 = null;
          io.Posn_0 STATE_VARIABLE_Pos_26_26 = null;

//  syntax2bel.m:47
          {
            java.lang.Object [] result = io.read_from_string_6_p_0(TypeCtorInfo_35_35, File_10, Str_11, Max_12, STATE_VARIABLE_Pos_0_20);
            Res_16 = (io.Read_result_1) result[0];
            STATE_VARIABLE_Pos_26_26 = (io.Posn_0) result[1];
          }
//  syntax2bel.m:49
          switch (Res_16.data_tag) {
            case 0:
//  syntax2bel.m:48
              {
                STATE_VARIABLE_Pos_21 = STATE_VARIABLE_Pos_26_26;
                STATE_VARIABLE_Ss_23 = STATE_VARIABLE_Ss_0_22;
                STATE_VARIABLE_Es_25 = STATE_VARIABLE_Es_0_24;
              }
//  syntax2bel.m:49
              break;
            case 1:
//  syntax2bel.m:51
              {
                jmercury.runtime.TypeInfo_Struct TypeCtorInfo_24_54 = null;
                jmercury.runtime.TypeInfo_Struct TypeInfo_25_55 = null;
                jmercury.runtime.TypeInfo_Struct TypeInfo_26_56 = null;
                syntax2bel.Strfile_0 Strfile_19 = ((syntax2bel.Strfile_0) ((io.Read_result_1.Ok_1) Res_16).F1);
                list.List_1 STATE_VARIABLE_Ss_27_27 = null;
                list.List_1 STATE_VARIABLE_Es_28_28 = null;
                list.List_1 Sents_43 = ((syntax2bel.Strfile_0) Strfile_19).F2;
                /* closure */ java.lang.Object[] V_46_46 = null;
//  syntax2bel.m:58
                java.lang.String _Name_42 = ((syntax2bel.Strfile_0) Strfile_19).F1;
//  syntax2bel.m:59
                java.lang.Object conv3_STATE_VARIABLE_Ss_27_27 = null;
                java.lang.Object conv2_STATE_VARIABLE_Es_28_28 = null;

                {
                  V_46_46 = new /* closure */ java.lang.Object[] {((java.lang.Object) (syntax2bel.MR_scalar_common_4[0])), ((java.lang.Object) (new AddrOf4_0(1))), java.lang.Integer.valueOf(1), ((java.lang.Object) (File_10))};
                }
                TypeCtorInfo_24_54 = jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.syntax2bel__type_ctor_info_strsent_0);
                TypeInfo_25_55 = jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.MR_scalar_common_1[0]);
                TypeInfo_26_56 = jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.MR_scalar_common_1[1]);
                {
                  java.lang.Object [] result = list.foldl2_6_p_0(TypeCtorInfo_24_54, TypeInfo_25_55, TypeInfo_26_56, V_46_46, Sents_43, ((java.lang.Object) (STATE_VARIABLE_Ss_0_22)), ((java.lang.Object) (STATE_VARIABLE_Es_0_24)));
                  conv3_STATE_VARIABLE_Ss_27_27 = (java.lang.Object) result[0];
                  conv2_STATE_VARIABLE_Es_28_28 = (java.lang.Object) result[1];
                }
                STATE_VARIABLE_Ss_27_27 = ((list.List_1) conv3_STATE_VARIABLE_Ss_27_27);
                STATE_VARIABLE_Es_28_28 = ((list.List_1) conv2_STATE_VARIABLE_Es_28_28);
//  syntax2bel.m:53
                /* direct tailcall eliminated */
                {
                  io.Posn_0 STATE_VARIABLE_Pos_0__tmp_copy_20 = STATE_VARIABLE_Pos_26_26;
                  list.List_1 STATE_VARIABLE_Ss_0__tmp_copy_22 = STATE_VARIABLE_Ss_27_27;
                  list.List_1 STATE_VARIABLE_Es_0__tmp_copy_24 = STATE_VARIABLE_Es_28_28;

                  STATE_VARIABLE_Es_0_24 = STATE_VARIABLE_Es_0__tmp_copy_24;
                  STATE_VARIABLE_Ss_0_22 = STATE_VARIABLE_Ss_0__tmp_copy_22;
                  STATE_VARIABLE_Pos_0_20 = STATE_VARIABLE_Pos_0__tmp_copy_20;
                }
                continue;
//  syntax2bel.m:51
              }
//  syntax2bel.m:49
            case 2:
              {
                jmercury.runtime.TypeInfo_Struct TypeCtorInfo_36_36 = null;
                java.lang.String Msg_17 = ((io.Read_result_1.Error_2) Res_16).F1;
                int Line_18 = ((io.Read_result_1.Error_2) Res_16).F2;
                errors.Err_loc_0 V_32_32 = null;
                sberrs.Error_0 V_33_33 = null;

//  syntax2bel.m:50
                {
                  V_32_32 = new errors.Err_loc_0.File_1(File_10);
                }
                {
                  V_33_33 = new sberrs.Error_0.Io_2(Msg_17, Line_18);
                }
                TypeCtorInfo_36_36 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
                {
                  STATE_VARIABLE_Es_25 = errors.add_error_4_p_0(TypeCtorInfo_36_36, V_32_32, ((java.lang.Object) (V_33_33)), STATE_VARIABLE_Es_0_24);
                }
                STATE_VARIABLE_Pos_21 = STATE_VARIABLE_Pos_26_26;
                STATE_VARIABLE_Ss_23 = STATE_VARIABLE_Ss_0_22;
//  syntax2bel.m:49
              }
              break;
            default: /*NOTREACHED*/
              throw new jmercury.runtime.UnreachableDefault();
          }
//  syntax2bel.m:46
return new java.lang.Object[] {
            ((java.lang.Object) (STATE_VARIABLE_Pos_21)),
            ((java.lang.Object) (STATE_VARIABLE_Ss_23)),
            ((java.lang.Object) (STATE_VARIABLE_Es_25))
          };
        }
      }
//  syntax2bel.m:44
  }
//  syntax2bel.m:31
  public static java.lang.Object [] extract_belief_2_p_0(
    syntax2bel.Sent_0 HeadVar__1_1)
  {
//  syntax2bel.m:195
    {
      boolean succeeded = false;
      beliefs.Belief_0 Bel_7 = null;
      java.lang.String Spkr_5 = ((syntax2bel.Sent_0) HeadVar__1_1).F3;
      syntax2bel.Node_0 Node_6 = ((syntax2bel.Sent_0) HeadVar__1_1).F4;
      syntax2bel.Node_0 NP_10 = null;
      syntax2bel.Node_0 VP_11 = null;
      java.lang.String Subj_12 = null;
      java.lang.String Pred_13 = null;
      java.lang.String Obj_14 = null;
      beliefs.Prop_0 Prop_15 = null;
      syntax2bel.Cat_0 V_16_16 = null;
      list.List_1 V_17_17 = null;
      syntax2bel.Node_0 V_18_18 = null;
      syntax2bel.Cat_0 V_19_19 = null;
      list.List_1 V_20_20 = null;
      list.List_1 V_21_21 = null;
      list.List_1 V_22_22 = null;
      list.List_1 V_23_23 = null;
      list.List_1 V_24_24 = null;
      list.List_1 V_25_25 = null;
      syntax2bel.Cat_0 V_30_30 = null;
      list.List_1 V_31_31 = null;
      syntax2bel.Node_0 V_32_32 = null;
      list.List_1 V_33_33 = null;
      syntax2bel.Node_0 Verb_37 = null;
      list.List_1 Object_38 = null;
      syntax2bel.Pos_0 Pos_39 = null;
      syntax2bel.Cat_0 V_41_41 = null;
      list.List_1 V_42_42 = null;
      syntax2bel.Node_0 V_46_46 = null;
      list.List_1 V_47_47 = null;
      int _I_3 = ((syntax2bel.Sent_0) HeadVar__1_1).F1;
      java.lang.String _N_4 = ((syntax2bel.Sent_0) HeadVar__1_1).F2;
//  syntax2bel.m:196
      syntax2bel.Label_0 V_8_8 = null;
      syntax2bel.Label_0 V_9_9 = null;
//  syntax2bel.m:204
      syntax2bel.Label_0 V_27_27 = null;
      syntax2bel.Pos_0 V_28_28 = null;
      syntax2bel.Coref_0 V_29_29 = null;
//  syntax2bel.m:208
      syntax2bel.Label_0 V_36_36 = null;
//  syntax2bel.m:209
      syntax2bel.Coref_0 V_40_40 = null;
//  syntax2bel.m:222
      syntax2bel.Pos_0 V_44_44 = null;
      syntax2bel.Coref_0 V_45_45 = null;

//  syntax2bel.m:196
      succeeded = (Node_6.data_tag == 1);
      if (succeeded)
        {
          V_16_16 = ((syntax2bel.Node_0.Nt_3) Node_6).F1;
          V_8_8 = ((syntax2bel.Node_0.Nt_3) Node_6).F2;
          V_17_17 = ((syntax2bel.Node_0.Nt_3) Node_6).F3;
          succeeded = (V_16_16.MR_value == syntax2bel.Cat_0.K0.MR_value);
//  syntax2bel.m:195
          if (succeeded)
            {
//  syntax2bel.m:196
              succeeded = (V_17_17.data_tag == 1);
              if (succeeded)
                {
                  V_18_18 = ((syntax2bel.Node_0) ((list.List_1.F_cons_2) V_17_17).F1);
                  V_23_23 = ((list.List_1.F_cons_2) V_17_17).F2;
                  succeeded = (V_18_18.data_tag == 1);
                  if (succeeded)
                    {
                      V_19_19 = ((syntax2bel.Node_0.Nt_3) V_18_18).F1;
                      V_9_9 = ((syntax2bel.Node_0.Nt_3) V_18_18).F2;
                      V_20_20 = ((syntax2bel.Node_0.Nt_3) V_18_18).F3;
                      succeeded = (V_19_19.MR_value == syntax2bel.Cat_0.K5.MR_value);
//  syntax2bel.m:195
                      if (succeeded)
                        {
//  syntax2bel.m:196
                          succeeded = (V_20_20.data_tag == 1);
                          if (succeeded)
                            {
                              NP_10 = ((syntax2bel.Node_0) ((list.List_1.F_cons_2) V_20_20).F1);
                              V_21_21 = ((list.List_1.F_cons_2) V_20_20).F2;
                              succeeded = (V_21_21.data_tag == 1);
                              if (succeeded)
                                {
                                  VP_11 = ((syntax2bel.Node_0) ((list.List_1.F_cons_2) V_21_21).F1);
                                  V_22_22 = ((list.List_1.F_cons_2) V_21_21).F2;
                                  succeeded = (V_22_22.data_tag == 0);
//  syntax2bel.m:195
                                  if (succeeded)
                                    {
//  syntax2bel.m:196
                                      succeeded = (V_23_23.data_tag == 0);
//  syntax2bel.m:195
                                      if (succeeded)
                                        {
//  syntax2bel.m:204
                                          succeeded = (NP_10.data_tag == 1);
                                          if (succeeded)
                                            {
                                              V_30_30 = ((syntax2bel.Node_0.Nt_3) NP_10).F1;
                                              V_27_27 = ((syntax2bel.Node_0.Nt_3) NP_10).F2;
                                              V_31_31 = ((syntax2bel.Node_0.Nt_3) NP_10).F3;
                                              succeeded = (V_30_30.MR_value == syntax2bel.Cat_0.K3.MR_value);
//  syntax2bel.m:195
                                              if (succeeded)
                                                {
//  syntax2bel.m:204
                                                  succeeded = (V_31_31.data_tag == 1);
                                                  if (succeeded)
                                                    {
                                                      V_32_32 = ((syntax2bel.Node_0) ((list.List_1.F_cons_2) V_31_31).F1);
                                                      V_33_33 = ((list.List_1.F_cons_2) V_31_31).F2;
                                                      succeeded = (V_32_32.data_tag == 0);
                                                      if (succeeded)
                                                        {
                                                          V_28_28 = ((syntax2bel.Node_0.Leaf_3) V_32_32).F1;
                                                          Subj_12 = ((syntax2bel.Node_0.Leaf_3) V_32_32).F2;
                                                          V_29_29 = ((syntax2bel.Node_0.Leaf_3) V_32_32).F3;
                                                          succeeded = (V_33_33.data_tag == 0);
//  syntax2bel.m:195
                                                          if (succeeded)
                                                            {
//  syntax2bel.m:208
                                                              succeeded = (VP_11.data_tag == 1);
                                                              if (succeeded)
                                                                {
                                                                  V_41_41 = ((syntax2bel.Node_0.Nt_3) VP_11).F1;
                                                                  V_36_36 = ((syntax2bel.Node_0.Nt_3) VP_11).F2;
                                                                  V_42_42 = ((syntax2bel.Node_0.Nt_3) VP_11).F3;
                                                                  succeeded = (V_41_41.MR_value == syntax2bel.Cat_0.K6.MR_value);
//  syntax2bel.m:195
                                                                  if (succeeded)
                                                                    {
//  syntax2bel.m:208
                                                                      succeeded = (V_42_42.data_tag == 1);
                                                                      if (succeeded)
                                                                        {
                                                                          Verb_37 = ((syntax2bel.Node_0) ((list.List_1.F_cons_2) V_42_42).F1);
                                                                          Object_38 = ((list.List_1.F_cons_2) V_42_42).F2;
//  syntax2bel.m:209
                                                                          succeeded = (Verb_37.data_tag == 0);
                                                                          if (succeeded)
                                                                            {
                                                                              Pos_39 = ((syntax2bel.Node_0.Leaf_3) Verb_37).F1;
                                                                              Pred_13 = ((syntax2bel.Node_0.Leaf_3) Verb_37).F2;
                                                                              V_40_40 = ((syntax2bel.Node_0.Leaf_3) Verb_37).F3;
//  syntax2bel.m:213
                                                                              switch (Pos_39.MR_value) {
                                                                                case 26:
                                                                                  succeeded = true;
                                                                                  break;
                                                                                case 27:
//  syntax2bel.m:216
                                                                                  succeeded = true;
//  syntax2bel.m:213
                                                                                  break;
                                                                                case 28:
//  syntax2bel.m:217
                                                                                  succeeded = true;
//  syntax2bel.m:213
                                                                                  break;
                                                                                case 29:
//  syntax2bel.m:218
                                                                                  succeeded = true;
//  syntax2bel.m:213
                                                                                  break;
                                                                                case 30:
//  syntax2bel.m:214
                                                                                  succeeded = true;
//  syntax2bel.m:213
                                                                                  break;
                                                                                case 31:
//  syntax2bel.m:215
                                                                                  succeeded = true;
//  syntax2bel.m:213
                                                                                  break;
                                                                                default:
                                                                                  succeeded = false;
                                                                              }
//  syntax2bel.m:195
                                                                              if (succeeded)
                                                                                {
//  syntax2bel.m:222
                                                                                  succeeded = (Object_38.data_tag == 1);
                                                                                  if (succeeded)
                                                                                    {
                                                                                      V_46_46 = ((syntax2bel.Node_0) ((list.List_1.F_cons_2) Object_38).F1);
                                                                                      V_47_47 = ((list.List_1.F_cons_2) Object_38).F2;
                                                                                      succeeded = (V_46_46.data_tag == 0);
                                                                                      if (succeeded)
                                                                                        {
                                                                                          V_44_44 = ((syntax2bel.Node_0.Leaf_3) V_46_46).F1;
                                                                                          Obj_14 = ((syntax2bel.Node_0.Leaf_3) V_46_46).F2;
                                                                                          V_45_45 = ((syntax2bel.Node_0.Leaf_3) V_46_46).F3;
                                                                                          succeeded = (V_47_47.data_tag == 0);
//  syntax2bel.m:195
                                                                                          if (succeeded)
                                                                                            {
//  syntax2bel.m:199
                                                                                              {
                                                                                                Prop_15 = new beliefs.Prop_0(Subj_12, Pred_13, Obj_14);
                                                                                              }
//  syntax2bel.m:200
                                                                                              V_25_25 = (list.List_1) syntax2bel.MR_scalar_common_3[0];
                                                                                              {
                                                                                                V_24_24 = new list.List_1.F_cons_2(((java.lang.Object) (Prop_15)), V_25_25);
                                                                                              }
                                                                                              {
                                                                                                Bel_7 = new beliefs.Belief_0(Spkr_5, V_24_24);
                                                                                              }
                                                                                              succeeded = true;
//  syntax2bel.m:195
                                                                                            }
//  syntax2bel.m:222
                                                                                        }
                                                                                    }
//  syntax2bel.m:195
                                                                                }
//  syntax2bel.m:209
                                                                            }
//  syntax2bel.m:208
                                                                        }
//  syntax2bel.m:195
                                                                    }
//  syntax2bel.m:208
                                                                }
//  syntax2bel.m:195
                                                            }
//  syntax2bel.m:204
                                                        }
                                                    }
//  syntax2bel.m:195
                                                }
//  syntax2bel.m:204
                                            }
//  syntax2bel.m:195
                                        }
                                    }
//  syntax2bel.m:196
                                }
                            }
//  syntax2bel.m:195
                        }
//  syntax2bel.m:196
                    }
                }
//  syntax2bel.m:195
            }
//  syntax2bel.m:196
        }
//  syntax2bel.m:195
return new java.lang.Object[] {
        java.lang.Boolean.valueOf(succeeded),
        ((java.lang.Object) (Bel_7))
      };
    }
//  syntax2bel.m:31
  }
//  syntax2bel.m:29
  public static java.lang.Object [] convert_5_p_0(
    java.lang.String Filename_6,
    java.lang.String DocStr_7,
    list.List_1 STATE_VARIABLE_Es_0_13)
  {
//  syntax2bel.m:37
    {
      boolean succeeded = false;
      list.List_1 Sents_8 = null;
      list.List_1 STATE_VARIABLE_Es_14 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_21_21 = null;
      int Max_10 = 0;
      list.List_1 RevSents_12 = null;
      io.Posn_0 V_15_15 = null;
      list.List_1 V_16_16 = null;
      int V_18_18 = 0;
      int V_19_19 = 0;
      int V_20_20 = 0;
//  syntax2bel.m:39
      io.Posn_0 V_11_11 = null;

//  syntax2bel.m:38
      {
        Max_10 = string.length_2_p_0(DocStr_7);
      }
//  syntax2bel.m:39
      V_18_18 = 0;
      V_19_19 = 0;
      V_20_20 = 0;
      V_15_15 = (io.Posn_0) syntax2bel.MR_scalar_common_2[0];
      V_16_16 = (list.List_1) syntax2bel.MR_scalar_common_3[0];
      {
        java.lang.Object [] result = syntax2bel.read_sents_9_p_0(Filename_6, DocStr_7, Max_10, V_15_15, V_16_16, STATE_VARIABLE_Es_0_13);
        V_11_11 = (io.Posn_0) result[0];
        RevSents_12 = (list.List_1) result[1];
        STATE_VARIABLE_Es_14 = (list.List_1) result[2];
      }
      TypeCtorInfo_21_21 = jmercury.runtime.TypeInfo_Struct.maybe_new(syntax2bel.syntax2bel__type_ctor_info_sent_0);
//  syntax2bel.m:40
      {
        Sents_8 = list.reverse_2_p_0(TypeCtorInfo_21_21, RevSents_12);
      }
//  syntax2bel.m:37
return new java.lang.Object[] {
        ((java.lang.Object) (Sents_8)),
        ((java.lang.Object) (STATE_VARIABLE_Es_14))
      };
    }
//  syntax2bel.m:29
  }

// ExportDefns

// ExportedEnums

// InitPreds

// FinalPreds

// EnvVarNames
  static {
    if (System.getenv("MERCURY_DEBUG_CLASS_INIT") != null) {
      System.out.println("[syntax2bel end init]");
    }
  }
}
// :- end_module syntax2bel.
