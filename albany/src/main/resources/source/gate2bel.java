//
//
// Automatically generated from gate2bel.m by the Mercury Compiler,
// version 14.01.1, configured for x86_64-unknown-linux-gnu
//
//

/* :- module gate2bel. */

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
// import require;
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
public class gate2bel {
  static {
    if (System.getenv("MERCURY_DEBUG_CLASS_INIT") != null) {
      System.out.println("[gate2bel start init]");
    }
  }

// RttiDefns
  private static final jmercury.runtime.TypeInfo_Struct maybe__pti_maybe_1__plain_wordnet__type_ctor_info_wndata_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct errors__ti_message_1sberrs__type_ctor_info_error_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__ti_pair_2gate2bel__type_ctor_info_cword_0gate2bel__type_ctor_info_reftype_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_cword_0gate2bel__type_ctor_info_reftype_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__pti_pair_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_cword_0gate2bel__type_ctor_info_reftype_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1builtin__type_ctor_info_string_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1builtin__type_ctor_info_string_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__pti_list_1__plain_builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1gate2bel__type_ctor_info_owltriple_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1gate2bel__type_ctor_info_owltriple_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__ti_pair_2gate2bel__type_ctor_info_lndata_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_lndata_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_lndata_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__pti_list_1__plain_gate2bel__type_ctor_info_owlstmnt_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__pti_tree234_2__plain_pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_string_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct set_ordlist__pti_set_ordlist_1__plain_builtin__type_ctor_info_string_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1beliefs__type_ctor_info_envmod_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1beliefs__type_ctor_info_envtriple_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__pti_tree234_2__plain_list__ti_list_1beliefs__type_ctor_info_envmod_0__plain_list__ti_list_1beliefs__type_ctor_info_envtriple_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__pti_list_1__plain_gate2bel__type_ctor_info_triple3_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__pti_list_1__plain_gate2bel__type_ctor_info_cvalue_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__pti_pair_2__plain_gate2bel__type_ctor_info_cvalue_0__plain_gate2bel__type_ctor_info_cvalue_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__pti_list_1__plain_gate2bel__type_ctor_info_tmpmod_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct maybe__pti_maybe_1__plain_gate2bel__type_ctor_info_tmpagt_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__pti_pair_2__plain_list__ti_list_1beliefs__type_ctor_info_envmod_0__plain_beliefs__type_ctor_info_envtriple_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__pti_list_1__plain_beliefs__type_ctor_info_envmod_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__pti_list_1__plain_gate2bel__type_ctor_info_lndata_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct set_ordlist__pti_set_ordlist_1__plain_builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__pti_pair_2__plain_gate2bel__type_ctor_info_lndata_0__plain_builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_cword_0gate2bel__type_ctor_info_reftype_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__pti_pair_2__plain_gate2bel__type_ctor_info_cword_0__plain_gate2bel__type_ctor_info_reftype_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__ti_tree234_2builtin__type_ctor_info_int_0list__ti_list_1gate2bel__type_ctor_info_owltriple_0 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_chmap_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1gate2bel__type_ctor_info_dact_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1gate2bel__type_ctor_info_triple_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_chunk_0_0 = new jmercury.runtime.PseudoTypeInfo[6];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_chunk_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_chunk_0_1 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_chunk_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_chunk_0_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_chunk_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_chunk_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final int[] gate2bel__functor_number_map_chunk_0 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_chunk_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1gate2bel__type_ctor_info_triple2_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_chunk2_0_0 = new jmercury.runtime.PseudoTypeInfo[6];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_chunk2_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_chunk2_0_1 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_chunk2_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_chunk2_0_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_chunk2_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_chunk2_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final int[] gate2bel__functor_number_map_chunk2_0 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_chunk2_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1gate2bel__type_ctor_info_triple3_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_chunk3_0_0 = new jmercury.runtime.PseudoTypeInfo[6];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_chunk3_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_chunk3_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_chunk3_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_chunk3_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] gate2bel__functor_number_map_chunk3_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_chunk3_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_cid_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__ti_tree234_2builtin__type_ctor_info_int_0builtin__type_ctor_info_string_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__ti_tree234_2builtin__type_ctor_info_int_0list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_cword_0gate2bel__type_ctor_info_reftype_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_cmaps_0_0 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_cmaps_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_cmaps_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_cmaps_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_cmaps_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] gate2bel__functor_number_map_cmaps_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_cmaps_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__ti_pair_2gate2bel__type_ctor_info_reftype_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_corefpair_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_cstring_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_cstring_0_1 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_cstring_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_cstring_0_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_cstring_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_cstring_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final int[] gate2bel__functor_number_map_cstring_0 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_cstring_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_cvalue_0_0 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_cvalue_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_cvalue_0_1 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_cvalue_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_cvalue_0_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_cvalue_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_cvalue_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final int[] gate2bel__functor_number_map_cvalue_0 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_cvalue_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_cword_0_0 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_cword_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_cword_0_1 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_cword_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_cword_0_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_cword_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_cword_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final int[] gate2bel__functor_number_map_cword_0 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_cword_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_1 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_2 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_3 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_4 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_5 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_6 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_7 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_8 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_9 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_10 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_11 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_12 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_13 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_14 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_15 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_16 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_17 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_18 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_19 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_20 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_21 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_22 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_23 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_24 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_25 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_26 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_27 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_28 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_29 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_30 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_31 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_32 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_33 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_34 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_35 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_36 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_37 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_38 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_39 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_40 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_41 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_dact_0_42 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] gate2bel__enum_value_ordered_dact_0 = new jmercury.runtime.EnumFunctorDesc[43];
  private static final jmercury.runtime.EnumFunctorDesc[] gate2bel__enum_name_ordered_dact_0 = new jmercury.runtime.EnumFunctorDesc[43];
  private static final int[] gate2bel__functor_number_map_dact_0 = new int[43];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_dact_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_lndata_0_0 = new jmercury.runtime.PseudoTypeInfo[4];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_lndata_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_lndata_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_lndata_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_lndata_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] gate2bel__functor_number_map_lndata_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_lndata_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__ti_tree234_2builtin__type_ctor_info_int_0list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_lndata_0builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_lnmap_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1gate2bel__type_ctor_info_owlstmnt_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_owlfile_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_owlfile_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_owlfile_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_owlfile_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_owlfile_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] gate2bel__functor_number_map_owlfile_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_owlfile_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_owlpr_0_0 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_owlpr_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_owlpr_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_owlpr_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_owlpr_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] gate2bel__functor_number_map_owlpr_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_owlpr_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_owlprtp_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_owlprtp_0_1 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] gate2bel__enum_value_ordered_owlprtp_0 = new jmercury.runtime.EnumFunctorDesc[2];
  private static final jmercury.runtime.EnumFunctorDesc[] gate2bel__enum_name_ordered_owlprtp_0 = new jmercury.runtime.EnumFunctorDesc[2];
  private static final int[] gate2bel__functor_number_map_owlprtp_0 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_owlprtp_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_owlstmnt_0_0 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_owlstmnt_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1gate2bel__type_ctor_info_lndata_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_owlstmnt_0_1 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_owlstmnt_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_owlstmnt_0_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_owlstmnt_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_owlstmnt_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final int[] gate2bel__functor_number_map_owlstmnt_0 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_owlstmnt_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_owlstr_0_0 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_owlstr_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_owlstr_0_1 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_owlstr_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_owlstr_0_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_owlstr_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_owlstr_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final int[] gate2bel__functor_number_map_owlstr_0 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_owlstr_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_owlstrtp_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_owlstrtp_0_1 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_owlstrtp_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_owlstrtp_0_2 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_owlstrtp_0_3 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_owlstrtp_0_0 = new jmercury.runtime.DuFunctorDesc[4];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_owlstrtp_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_owlstrtp_0 = new jmercury.runtime.DuFunctorDesc[4];
  private static final int[] gate2bel__functor_number_map_owlstrtp_0 = new int[4];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_owlstrtp_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct maybe__ti_maybe_1gate2bel__type_ctor_info_owlstr_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_owltriple_0_0 = new jmercury.runtime.PseudoTypeInfo[6];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_owltriple_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_owltriple_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_owltriple_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_owltriple_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] gate2bel__functor_number_map_owltriple_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_owltriple_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_reftype_0_0 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_reftype_0_1 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_reftype_0_2 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc gate2bel__enum_functor_desc_reftype_0_3 = new jmercury.runtime.EnumFunctorDesc();
  private static final jmercury.runtime.EnumFunctorDesc[] gate2bel__enum_value_ordered_reftype_0 = new jmercury.runtime.EnumFunctorDesc[4];
  private static final jmercury.runtime.EnumFunctorDesc[] gate2bel__enum_name_ordered_reftype_0 = new jmercury.runtime.EnumFunctorDesc[4];
  private static final int[] gate2bel__functor_number_map_reftype_0 = new int[4];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_reftype_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_str2_0_0 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_str2_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_str2_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_str2_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_str2_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] gate2bel__functor_number_map_str2_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_str2_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_strtype_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_strtype_0_1 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_strtype_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_strtype_0_2 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_strtype_0_3 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_strtype_0_0 = new jmercury.runtime.DuFunctorDesc[4];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_strtype_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_strtype_0 = new jmercury.runtime.DuFunctorDesc[4];
  private static final int[] gate2bel__functor_number_map_strtype_0 = new int[4];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_strtype_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_tid_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_tmpagt_0_0 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_tmpagt_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_tmpagt_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_tmpagt_0_2 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_tmpagt_0_0 = new jmercury.runtime.DuFunctorDesc[3];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_tmpagt_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_tmpagt_0 = new jmercury.runtime.DuFunctorDesc[3];
  private static final int[] gate2bel__functor_number_map_tmpagt_0 = new int[3];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_tmpagt_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_tmpmod_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_tmpmod_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_tmpmod_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_tmpmod_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_tmpmod_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] gate2bel__functor_number_map_tmpmod_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_tmpmod_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1gate2bel__type_ctor_info_chunk_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_tnfile_0_0 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_tnfile_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_tnfile_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_tnfile_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_tnfile_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] gate2bel__functor_number_map_tnfile_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_tnfile_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1gate2bel__type_ctor_info_chunk2_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_tnfile2_0_0 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_tnfile2_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_tnfile2_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_tnfile2_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_tnfile2_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] gate2bel__functor_number_map_tnfile2_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_tnfile2_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1gate2bel__type_ctor_info_chunk3_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_tnfile3_0_0 = new jmercury.runtime.PseudoTypeInfo[3];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_tnfile3_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_tnfile3_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_tnfile3_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_tnfile3_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] gate2bel__functor_number_map_tnfile3_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_tnfile3_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_trid_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_triple_0_0 = new jmercury.runtime.PseudoTypeInfo[4];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_triple_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_triple_0_1 = new jmercury.runtime.PseudoTypeInfo[5];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_triple_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_triple_0_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_triple_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_triple_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final int[] gate2bel__functor_number_map_triple_0 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_triple_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_triple2_0_0 = new jmercury.runtime.PseudoTypeInfo[5];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_triple2_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_triple2_0_1 = new jmercury.runtime.PseudoTypeInfo[6];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_triple2_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_triple2_0_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_triple2_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_triple2_0 = new jmercury.runtime.DuFunctorDesc[2];
  private static final int[] gate2bel__functor_number_map_triple2_0 = new int[2];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_triple2_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct maybe__ti_maybe_1builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_triple3_0_0 = new jmercury.runtime.PseudoTypeInfo[6];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_triple3_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_triple3_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_triple3_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_triple3_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] gate2bel__functor_number_map_triple3_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_triple3_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_value_0_0 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_value_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_value_0_1 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_value_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_value_0_2 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_value_0_2 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_value_0_3 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_value_0_3 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_value_0_4 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_value_0_4 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_value_0_5 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_value_0_0 = new jmercury.runtime.DuFunctorDesc[6];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_value_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_value_0 = new jmercury.runtime.DuFunctorDesc[6];
  private static final int[] gate2bel__functor_number_map_value_0 = new int[6];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_value_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_value2_0_0 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_value2_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1gate2bel__type_ctor_info_str2_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_value2_0_1 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_value2_0_1 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_value2_0_2 = new jmercury.runtime.PseudoTypeInfo[1];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_value2_0_2 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_value2_0_3 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_value2_0_3 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_value2_0_4 = new jmercury.runtime.PseudoTypeInfo[2];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_value2_0_4 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_value2_0_5 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_value2_0_0 = new jmercury.runtime.DuFunctorDesc[6];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_value2_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_value2_0 = new jmercury.runtime.DuFunctorDesc[6];
  private static final int[] gate2bel__functor_number_map_value2_0 = new int[6];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_value2_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct set_ordlist__ti_set_ordlist_1builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1list__ti_list_1builtin__type_ctor_info_int_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.PseudoTypeInfo[] gate2bel__field_types_vertices_0_0 = new jmercury.runtime.PseudoTypeInfo[4];
  private static final jmercury.runtime.DuFunctorDesc gate2bel__du_functor_desc_vertices_0_0 = new jmercury.runtime.DuFunctorDesc();
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_stag_ordered_vertices_0_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final jmercury.runtime.DuPtagLayout[] gate2bel__du_ptag_ordered_vertices_0 = new jmercury.runtime.DuPtagLayout[1];
  private static final jmercury.runtime.DuFunctorDesc[] gate2bel__du_name_ordered_vertices_0 = new jmercury.runtime.DuFunctorDesc[1];
  private static final int[] gate2bel__functor_number_map_vertices_0 = new int[1];
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_vertices_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct gate2bel__type_ctor_info_wmap_0 = new jmercury.runtime.TypeCtorInfo_Struct();
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
		jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.errors__ti_message_1sberrs__type_ctor_info_error_0)});
    //
    //
    list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) gate2bel.pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0});
    //
    //
    //
    pair__ti_pair_2gate2bel__type_ctor_info_cword_0gate2bel__type_ctor_info_reftype_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_cword_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_reftype_0)});
    //
    list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_cword_0gate2bel__type_ctor_info_reftype_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.pair__ti_pair_2gate2bel__type_ctor_info_cword_0gate2bel__type_ctor_info_reftype_0)});
    //
    //
    pair__pti_pair_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_cword_0gate2bel__type_ctor_info_reftype_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0,
		(jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_cword_0gate2bel__type_ctor_info_reftype_0});
    //
    //
    list__ti_list_1builtin__type_ctor_info_string_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0)});
    //
    //
    tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1builtin__type_ctor_info_string_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0,
		(jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1builtin__type_ctor_info_string_0});
    //
    list__pti_list_1__plain_builtin__type_ctor_info_int_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0});
    //
    //
    list__ti_list_1gate2bel__type_ctor_info_owltriple_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_owltriple_0)});
    //
    tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1gate2bel__type_ctor_info_owltriple_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0,
		(jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1gate2bel__type_ctor_info_owltriple_0});
    //
    //
    pair__ti_pair_2gate2bel__type_ctor_info_lndata_0builtin__type_ctor_info_int_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_lndata_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0)});
    //
    list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_lndata_0builtin__type_ctor_info_int_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.pair__ti_pair_2gate2bel__type_ctor_info_lndata_0builtin__type_ctor_info_int_0)});
    //
    tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_lndata_0builtin__type_ctor_info_int_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0,
		(jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_lndata_0builtin__type_ctor_info_int_0});
    //
    //
    list__pti_list_1__plain_gate2bel__type_ctor_info_owlstmnt_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_owlstmnt_0});
    //
    pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0)});
    //
    tree234__pti_tree234_2__plain_pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_string_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) gate2bel.pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0,
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0});
    //
    //
    set_ordlist__pti_set_ordlist_1__plain_builtin__type_ctor_info_string_0.init(set_ordlist.set_ordlist__type_ctor_info_set_ordlist_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0});
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
    tree234__pti_tree234_2__plain_list__ti_list_1beliefs__type_ctor_info_envmod_0__plain_list__ti_list_1beliefs__type_ctor_info_envtriple_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1beliefs__type_ctor_info_envmod_0,
		(jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1beliefs__type_ctor_info_envtriple_0});
    //
    //
    list__pti_list_1__plain_gate2bel__type_ctor_info_triple3_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_triple3_0});
    //
    //
    list__pti_list_1__plain_gate2bel__type_ctor_info_cvalue_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_cvalue_0});
    //
    pair__pti_pair_2__plain_gate2bel__type_ctor_info_cvalue_0__plain_gate2bel__type_ctor_info_cvalue_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_cvalue_0,
		(jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_cvalue_0});
    //
    //
    list__pti_list_1__plain_gate2bel__type_ctor_info_tmpmod_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_tmpmod_0});
    //
    //
    maybe__pti_maybe_1__plain_gate2bel__type_ctor_info_tmpagt_0.init(maybe.maybe__type_ctor_info_maybe_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_tmpagt_0});
    //
    pair__pti_pair_2__plain_list__ti_list_1beliefs__type_ctor_info_envmod_0__plain_beliefs__type_ctor_info_envtriple_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1beliefs__type_ctor_info_envmod_0,
		(jmercury.runtime.PseudoTypeInfo) beliefs.beliefs__type_ctor_info_envtriple_0});
    //
    list__pti_list_1__plain_beliefs__type_ctor_info_envmod_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) beliefs.beliefs__type_ctor_info_envmod_0});
    //
    list__pti_list_1__plain_gate2bel__type_ctor_info_lndata_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_lndata_0});
    //
    set_ordlist__pti_set_ordlist_1__plain_builtin__type_ctor_info_int_0.init(set_ordlist.set_ordlist__type_ctor_info_set_ordlist_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0});
    //
    pair__pti_pair_2__plain_gate2bel__type_ctor_info_lndata_0__plain_builtin__type_ctor_info_int_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_lndata_0,
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0});
    //
    tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_cword_0gate2bel__type_ctor_info_reftype_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0,
		(jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_cword_0gate2bel__type_ctor_info_reftype_0});
    //
    pair__pti_pair_2__plain_gate2bel__type_ctor_info_cword_0__plain_gate2bel__type_ctor_info_reftype_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_cword_0,
		(jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_reftype_0});
    //
    tree234__ti_tree234_2builtin__type_ctor_info_int_0list__ti_list_1gate2bel__type_ctor_info_owltriple_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.list__ti_list_1gate2bel__type_ctor_info_owltriple_0)});
    //
    gate2bel__type_ctor_info_chmap_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(0))),
		((java.lang.Object) (new AddrOf2_0(1))),
		"gate2bel",
		"chmap",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) gate2bel.tree234__ti_tree234_2builtin__type_ctor_info_int_0list__ti_list_1gate2bel__type_ctor_info_owltriple_0),
		-1,
		0,
		null);
    //
    //
    list__ti_list_1gate2bel__type_ctor_info_dact_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_dact_0)});
    //
    //
    list__ti_list_1gate2bel__type_ctor_info_triple_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_triple_0)});
    //
    gate2bel__field_types_chunk_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    gate2bel__field_types_chunk_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    gate2bel__field_types_chunk_0_0[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    gate2bel__field_types_chunk_0_0[3] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    gate2bel__field_types_chunk_0_0[4] = (jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1gate2bel__type_ctor_info_dact_0;
    gate2bel__field_types_chunk_0_0[5] = (jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1gate2bel__type_ctor_info_triple_0;
    //
    gate2bel__du_functor_desc_chunk_0_0.init("chunk",
		6,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		0,
		gate2bel.gate2bel__field_types_chunk_0_0,
		null,
		null,
		null);
    //
    gate2bel__field_types_chunk_0_1[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    gate2bel__field_types_chunk_0_1[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    gate2bel__du_functor_desc_chunk_0_1.init("corefclass",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		gate2bel.gate2bel__field_types_chunk_0_1,
		null,
		null,
		null);
    //
    gate2bel__du_stag_ordered_chunk_0_0[0] = gate2bel.gate2bel__du_functor_desc_chunk_0_0;
    gate2bel__du_stag_ordered_chunk_0_0[1] = gate2bel.gate2bel__du_functor_desc_chunk_0_1;
    //
    gate2bel__du_ptag_ordered_chunk_0[0] = new jmercury.runtime.DuPtagLayout(2,
		private_builtin.MR_SECTAG_REMOTE,
		gate2bel.gate2bel__du_stag_ordered_chunk_0_0);
    //
    gate2bel__du_name_ordered_chunk_0[0] = gate2bel.gate2bel__du_functor_desc_chunk_0_0;
    gate2bel__du_name_ordered_chunk_0[1] = gate2bel.gate2bel__du_functor_desc_chunk_0_1;
    //
    gate2bel__functor_number_map_chunk_0[0] = 0;
    gate2bel__functor_number_map_chunk_0[1] = 1;
    //
    gate2bel__type_ctor_info_chunk_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(2))),
		((java.lang.Object) (new AddrOf2_0(3))),
		"gate2bel",
		"chunk",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_chunk_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_chunk_0),
		2,
		4,
		gate2bel.gate2bel__functor_number_map_chunk_0);
    //
    //
    list__ti_list_1gate2bel__type_ctor_info_triple2_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_triple2_0)});
    //
    gate2bel__field_types_chunk2_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    gate2bel__field_types_chunk2_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    gate2bel__field_types_chunk2_0_0[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    gate2bel__field_types_chunk2_0_0[3] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    gate2bel__field_types_chunk2_0_0[4] = (jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1gate2bel__type_ctor_info_dact_0;
    gate2bel__field_types_chunk2_0_0[5] = (jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1gate2bel__type_ctor_info_triple2_0;
    //
    gate2bel__du_functor_desc_chunk2_0_0.init("chunk",
		6,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		0,
		gate2bel.gate2bel__field_types_chunk2_0_0,
		null,
		null,
		null);
    //
    gate2bel__field_types_chunk2_0_1[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    gate2bel__field_types_chunk2_0_1[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    gate2bel__du_functor_desc_chunk2_0_1.init("corefclass",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		gate2bel.gate2bel__field_types_chunk2_0_1,
		null,
		null,
		null);
    //
    gate2bel__du_stag_ordered_chunk2_0_0[0] = gate2bel.gate2bel__du_functor_desc_chunk2_0_0;
    gate2bel__du_stag_ordered_chunk2_0_0[1] = gate2bel.gate2bel__du_functor_desc_chunk2_0_1;
    //
    gate2bel__du_ptag_ordered_chunk2_0[0] = new jmercury.runtime.DuPtagLayout(2,
		private_builtin.MR_SECTAG_REMOTE,
		gate2bel.gate2bel__du_stag_ordered_chunk2_0_0);
    //
    gate2bel__du_name_ordered_chunk2_0[0] = gate2bel.gate2bel__du_functor_desc_chunk2_0_0;
    gate2bel__du_name_ordered_chunk2_0[1] = gate2bel.gate2bel__du_functor_desc_chunk2_0_1;
    //
    gate2bel__functor_number_map_chunk2_0[0] = 0;
    gate2bel__functor_number_map_chunk2_0[1] = 1;
    //
    gate2bel__type_ctor_info_chunk2_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(4))),
		((java.lang.Object) (new AddrOf2_0(5))),
		"gate2bel",
		"chunk2",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_chunk2_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_chunk2_0),
		2,
		4,
		gate2bel.gate2bel__functor_number_map_chunk2_0);
    //
    list__ti_list_1gate2bel__type_ctor_info_triple3_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_triple3_0)});
    //
    gate2bel__field_types_chunk3_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    gate2bel__field_types_chunk3_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    gate2bel__field_types_chunk3_0_0[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    gate2bel__field_types_chunk3_0_0[3] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    gate2bel__field_types_chunk3_0_0[4] = (jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1gate2bel__type_ctor_info_dact_0;
    gate2bel__field_types_chunk3_0_0[5] = (jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1gate2bel__type_ctor_info_triple3_0;
    //
    gate2bel__du_functor_desc_chunk3_0_0.init("chunk",
		6,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		gate2bel.gate2bel__field_types_chunk3_0_0,
		null,
		null,
		null);
    //
    gate2bel__du_stag_ordered_chunk3_0_0[0] = gate2bel.gate2bel__du_functor_desc_chunk3_0_0;
    //
    gate2bel__du_ptag_ordered_chunk3_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		gate2bel.gate2bel__du_stag_ordered_chunk3_0_0);
    //
    gate2bel__du_name_ordered_chunk3_0[0] = gate2bel.gate2bel__du_functor_desc_chunk3_0_0;
    //
    gate2bel__functor_number_map_chunk3_0[0] = 0;
    //
    gate2bel__type_ctor_info_chunk3_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(6))),
		((java.lang.Object) (new AddrOf2_0(7))),
		"gate2bel",
		"chunk3",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_chunk3_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_chunk3_0),
		1,
		4,
		gate2bel.gate2bel__functor_number_map_chunk3_0);
    //
    gate2bel__type_ctor_info_cid_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(8))),
		((java.lang.Object) (new AddrOf2_0(9))),
		"gate2bel",
		"cid",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0),
		-1,
		0,
		null);
    //
    tree234__ti_tree234_2builtin__type_ctor_info_int_0builtin__type_ctor_info_string_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0)});
    //
    tree234__ti_tree234_2builtin__type_ctor_info_int_0list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_cword_0gate2bel__type_ctor_info_reftype_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_cword_0gate2bel__type_ctor_info_reftype_0)});
    //
    gate2bel__field_types_cmaps_0_0[0] = (jmercury.runtime.PseudoTypeInfo) gate2bel.tree234__ti_tree234_2builtin__type_ctor_info_int_0builtin__type_ctor_info_string_0;
    gate2bel__field_types_cmaps_0_0[1] = (jmercury.runtime.PseudoTypeInfo) gate2bel.tree234__ti_tree234_2builtin__type_ctor_info_int_0list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_cword_0gate2bel__type_ctor_info_reftype_0;
    //
    gate2bel__du_functor_desc_cmaps_0_0.init("cmaps",
		2,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		gate2bel.gate2bel__field_types_cmaps_0_0,
		null,
		null,
		null);
    //
    gate2bel__du_stag_ordered_cmaps_0_0[0] = gate2bel.gate2bel__du_functor_desc_cmaps_0_0;
    //
    gate2bel__du_ptag_ordered_cmaps_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		gate2bel.gate2bel__du_stag_ordered_cmaps_0_0);
    //
    gate2bel__du_name_ordered_cmaps_0[0] = gate2bel.gate2bel__du_functor_desc_cmaps_0_0;
    //
    gate2bel__functor_number_map_cmaps_0[0] = 0;
    //
    gate2bel__type_ctor_info_cmaps_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(10))),
		((java.lang.Object) (new AddrOf2_0(11))),
		"gate2bel",
		"cmaps",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_cmaps_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_cmaps_0),
		1,
		4,
		gate2bel.gate2bel__functor_number_map_cmaps_0);
    //
    pair__ti_pair_2gate2bel__type_ctor_info_reftype_0builtin__type_ctor_info_int_0.init(pair.pair__type_ctor_info_pair_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_reftype_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0)});
    //
    gate2bel__type_ctor_info_corefpair_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(12))),
		((java.lang.Object) (new AddrOf2_0(13))),
		"gate2bel",
		"corefpair",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) gate2bel.pair__ti_pair_2gate2bel__type_ctor_info_reftype_0builtin__type_ctor_info_int_0),
		-1,
		0,
		null);
    //
    gate2bel__du_functor_desc_cstring_0_0.init("empty",
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
    gate2bel__field_types_cstring_0_1[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    gate2bel__field_types_cstring_0_1[1] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_strtype_0;
    //
    gate2bel__du_functor_desc_cstring_0_1.init("str",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		gate2bel.gate2bel__field_types_cstring_0_1,
		null,
		null,
		null);
    //
    gate2bel__du_stag_ordered_cstring_0_0[0] = gate2bel.gate2bel__du_functor_desc_cstring_0_0;
    gate2bel__du_stag_ordered_cstring_0_0[1] = gate2bel.gate2bel__du_functor_desc_cstring_0_1;
    //
    gate2bel__du_ptag_ordered_cstring_0[0] = new jmercury.runtime.DuPtagLayout(2,
		private_builtin.MR_SECTAG_REMOTE,
		gate2bel.gate2bel__du_stag_ordered_cstring_0_0);
    //
    gate2bel__du_name_ordered_cstring_0[0] = gate2bel.gate2bel__du_functor_desc_cstring_0_0;
    gate2bel__du_name_ordered_cstring_0[1] = gate2bel.gate2bel__du_functor_desc_cstring_0_1;
    //
    gate2bel__functor_number_map_cstring_0[0] = 0;
    gate2bel__functor_number_map_cstring_0[1] = 1;
    //
    gate2bel__type_ctor_info_cstring_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(14))),
		((java.lang.Object) (new AddrOf2_0(15))),
		"gate2bel",
		"cstring",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_cstring_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_cstring_0),
		2,
		4,
		gate2bel.gate2bel__functor_number_map_cstring_0);
    //
    //
    gate2bel__field_types_cvalue_0_0[0] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_cstring_0;
    //
    gate2bel__du_functor_desc_cvalue_0_0.init("lit",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		0,
		gate2bel.gate2bel__field_types_cvalue_0_0,
		null,
		null,
		null);
    //
    gate2bel__field_types_cvalue_0_1[0] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_cstring_0;
    gate2bel__field_types_cvalue_0_1[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    gate2bel__du_functor_desc_cvalue_0_1.init("cref",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		gate2bel.gate2bel__field_types_cvalue_0_1,
		null,
		null,
		null);
    //
    gate2bel__du_stag_ordered_cvalue_0_0[0] = gate2bel.gate2bel__du_functor_desc_cvalue_0_0;
    gate2bel__du_stag_ordered_cvalue_0_0[1] = gate2bel.gate2bel__du_functor_desc_cvalue_0_1;
    //
    gate2bel__du_ptag_ordered_cvalue_0[0] = new jmercury.runtime.DuPtagLayout(2,
		private_builtin.MR_SECTAG_REMOTE,
		gate2bel.gate2bel__du_stag_ordered_cvalue_0_0);
    //
    gate2bel__du_name_ordered_cvalue_0[0] = gate2bel.gate2bel__du_functor_desc_cvalue_0_1;
    gate2bel__du_name_ordered_cvalue_0[1] = gate2bel.gate2bel__du_functor_desc_cvalue_0_0;
    //
    gate2bel__functor_number_map_cvalue_0[0] = 1;
    gate2bel__functor_number_map_cvalue_0[1] = 0;
    //
    gate2bel__type_ctor_info_cvalue_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(16))),
		((java.lang.Object) (new AddrOf2_0(17))),
		"gate2bel",
		"cvalue",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_cvalue_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_cvalue_0),
		2,
		4,
		gate2bel.gate2bel__functor_number_map_cvalue_0);
    //
    gate2bel__field_types_cword_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    gate2bel__du_functor_desc_cword_0_0.init("one",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		0,
		gate2bel.gate2bel__field_types_cword_0_0,
		null,
		null,
		null);
    //
    gate2bel__field_types_cword_0_1[0] = (jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1builtin__type_ctor_info_string_0;
    //
    gate2bel__du_functor_desc_cword_0_1.init("many",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		gate2bel.gate2bel__field_types_cword_0_1,
		null,
		null,
		null);
    //
    gate2bel__du_stag_ordered_cword_0_0[0] = gate2bel.gate2bel__du_functor_desc_cword_0_0;
    gate2bel__du_stag_ordered_cword_0_0[1] = gate2bel.gate2bel__du_functor_desc_cword_0_1;
    //
    gate2bel__du_ptag_ordered_cword_0[0] = new jmercury.runtime.DuPtagLayout(2,
		private_builtin.MR_SECTAG_REMOTE,
		gate2bel.gate2bel__du_stag_ordered_cword_0_0);
    //
    gate2bel__du_name_ordered_cword_0[0] = gate2bel.gate2bel__du_functor_desc_cword_0_1;
    gate2bel__du_name_ordered_cword_0[1] = gate2bel.gate2bel__du_functor_desc_cword_0_0;
    //
    gate2bel__functor_number_map_cword_0[0] = 1;
    gate2bel__functor_number_map_cword_0[1] = 0;
    //
    gate2bel__type_ctor_info_cword_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(18))),
		((java.lang.Object) (new AddrOf2_0(19))),
		"gate2bel",
		"cword",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_cword_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_cword_0),
		2,
		4,
		gate2bel.gate2bel__functor_number_map_cword_0);
    //
    gate2bel__enum_functor_desc_dact_0_0.init("acc",
		0);
    //
    gate2bel__enum_functor_desc_dact_0_1.init("adr",
		1);
    //
    gate2bel__enum_functor_desc_dact_0_2.init("aex",
		2);
    //
    gate2bel__enum_functor_desc_dact_0_3.init("ana",
		3);
    //
    gate2bel__enum_functor_desc_dact_0_4.init("apl",
		4);
    //
    gate2bel__enum_functor_desc_dact_0_5.init("apr",
		5);
    //
    gate2bel__enum_functor_desc_dact_0_6.init("bch",
		6);
    //
    gate2bel__enum_functor_desc_dact_0_7.init("bcq",
		7);
    //
    gate2bel__enum_functor_desc_dact_0_8.init("ccp",
		8);
    //
    gate2bel__enum_functor_desc_dact_0_9.init("cls",
		9);
    //
    gate2bel__enum_functor_desc_dact_0_10.init("cop",
		10);
    //
    gate2bel__enum_functor_desc_dact_0_11.init("dan",
		11);
    //
    gate2bel__enum_functor_desc_dact_0_12.init("dnp",
		12);
    //
    gate2bel__enum_functor_desc_dact_0_13.init("dwq",
		13);
    //
    gate2bel__enum_functor_desc_dact_0_14.init("dyn",
		14);
    //
    gate2bel__enum_functor_desc_dact_0_15.init("hba",
		15);
    //
    gate2bel__enum_functor_desc_dact_0_16.init("hdg",
		16);
    //
    gate2bel__enum_functor_desc_dact_0_17.init("mac",
		17);
    //
    gate2bel__enum_functor_desc_dact_0_18.init("nna",
		18);
    //
    gate2bel__enum_functor_desc_dact_0_19.init("noa",
		19);
    //
    gate2bel__enum_functor_desc_dact_0_20.init("nun",
		20);
    //
    gate2bel__enum_functor_desc_dact_0_21.init("nvb",
		21);
    //
    gate2bel__enum_functor_desc_dact_0_22.init("oan",
		22);
    //
    gate2bel__enum_functor_desc_dact_0_23.init("ooc",
		23);
    //
    gate2bel__enum_functor_desc_dact_0_24.init("opq",
		24);
    //
    gate2bel__enum_functor_desc_dact_0_25.init("orc",
		25);
    //
    gate2bel__enum_functor_desc_dact_0_26.init("oth",
		26);
    //
    gate2bel__enum_functor_desc_dact_0_27.init("quo",
		27);
    //
    gate2bel__enum_functor_desc_dact_0_28.init("rac",
		28);
    //
    gate2bel__enum_functor_desc_dact_0_29.init("rej",
		29);
    //
    gate2bel__enum_functor_desc_dact_0_30.init("rhq",
		30);
    //
    gate2bel__enum_functor_desc_dact_0_31.init("rpp",
		31);
    //
    gate2bel__enum_functor_desc_dact_0_32.init("sft",
		32);
    //
    gate2bel__enum_functor_desc_dact_0_33.init("sno",
		33);
    //
    gate2bel__enum_functor_desc_dact_0_34.init("sop",
		34);
    //
    gate2bel__enum_functor_desc_dact_0_35.init("sum",
		35);
    //
    gate2bel__enum_functor_desc_dact_0_36.init("tgq",
		36);
    //
    gate2bel__enum_functor_desc_dact_0_37.init("thx",
		37);
    //
    gate2bel__enum_functor_desc_dact_0_38.init("tpt",
		38);
    //
    gate2bel__enum_functor_desc_dact_0_39.init("uin",
		39);
    //
    gate2bel__enum_functor_desc_dact_0_40.init("whq",
		40);
    //
    gate2bel__enum_functor_desc_dact_0_41.init("yan",
		41);
    //
    gate2bel__enum_functor_desc_dact_0_42.init("ynq",
		42);
    //
    gate2bel__enum_value_ordered_dact_0[0] = gate2bel.gate2bel__enum_functor_desc_dact_0_0;
    gate2bel__enum_value_ordered_dact_0[1] = gate2bel.gate2bel__enum_functor_desc_dact_0_1;
    gate2bel__enum_value_ordered_dact_0[2] = gate2bel.gate2bel__enum_functor_desc_dact_0_2;
    gate2bel__enum_value_ordered_dact_0[3] = gate2bel.gate2bel__enum_functor_desc_dact_0_3;
    gate2bel__enum_value_ordered_dact_0[4] = gate2bel.gate2bel__enum_functor_desc_dact_0_4;
    gate2bel__enum_value_ordered_dact_0[5] = gate2bel.gate2bel__enum_functor_desc_dact_0_5;
    gate2bel__enum_value_ordered_dact_0[6] = gate2bel.gate2bel__enum_functor_desc_dact_0_6;
    gate2bel__enum_value_ordered_dact_0[7] = gate2bel.gate2bel__enum_functor_desc_dact_0_7;
    gate2bel__enum_value_ordered_dact_0[8] = gate2bel.gate2bel__enum_functor_desc_dact_0_8;
    gate2bel__enum_value_ordered_dact_0[9] = gate2bel.gate2bel__enum_functor_desc_dact_0_9;
    gate2bel__enum_value_ordered_dact_0[10] = gate2bel.gate2bel__enum_functor_desc_dact_0_10;
    gate2bel__enum_value_ordered_dact_0[11] = gate2bel.gate2bel__enum_functor_desc_dact_0_11;
    gate2bel__enum_value_ordered_dact_0[12] = gate2bel.gate2bel__enum_functor_desc_dact_0_12;
    gate2bel__enum_value_ordered_dact_0[13] = gate2bel.gate2bel__enum_functor_desc_dact_0_13;
    gate2bel__enum_value_ordered_dact_0[14] = gate2bel.gate2bel__enum_functor_desc_dact_0_14;
    gate2bel__enum_value_ordered_dact_0[15] = gate2bel.gate2bel__enum_functor_desc_dact_0_15;
    gate2bel__enum_value_ordered_dact_0[16] = gate2bel.gate2bel__enum_functor_desc_dact_0_16;
    gate2bel__enum_value_ordered_dact_0[17] = gate2bel.gate2bel__enum_functor_desc_dact_0_17;
    gate2bel__enum_value_ordered_dact_0[18] = gate2bel.gate2bel__enum_functor_desc_dact_0_18;
    gate2bel__enum_value_ordered_dact_0[19] = gate2bel.gate2bel__enum_functor_desc_dact_0_19;
    gate2bel__enum_value_ordered_dact_0[20] = gate2bel.gate2bel__enum_functor_desc_dact_0_20;
    gate2bel__enum_value_ordered_dact_0[21] = gate2bel.gate2bel__enum_functor_desc_dact_0_21;
    gate2bel__enum_value_ordered_dact_0[22] = gate2bel.gate2bel__enum_functor_desc_dact_0_22;
    gate2bel__enum_value_ordered_dact_0[23] = gate2bel.gate2bel__enum_functor_desc_dact_0_23;
    gate2bel__enum_value_ordered_dact_0[24] = gate2bel.gate2bel__enum_functor_desc_dact_0_24;
    gate2bel__enum_value_ordered_dact_0[25] = gate2bel.gate2bel__enum_functor_desc_dact_0_25;
    gate2bel__enum_value_ordered_dact_0[26] = gate2bel.gate2bel__enum_functor_desc_dact_0_26;
    gate2bel__enum_value_ordered_dact_0[27] = gate2bel.gate2bel__enum_functor_desc_dact_0_27;
    gate2bel__enum_value_ordered_dact_0[28] = gate2bel.gate2bel__enum_functor_desc_dact_0_28;
    gate2bel__enum_value_ordered_dact_0[29] = gate2bel.gate2bel__enum_functor_desc_dact_0_29;
    gate2bel__enum_value_ordered_dact_0[30] = gate2bel.gate2bel__enum_functor_desc_dact_0_30;
    gate2bel__enum_value_ordered_dact_0[31] = gate2bel.gate2bel__enum_functor_desc_dact_0_31;
    gate2bel__enum_value_ordered_dact_0[32] = gate2bel.gate2bel__enum_functor_desc_dact_0_32;
    gate2bel__enum_value_ordered_dact_0[33] = gate2bel.gate2bel__enum_functor_desc_dact_0_33;
    gate2bel__enum_value_ordered_dact_0[34] = gate2bel.gate2bel__enum_functor_desc_dact_0_34;
    gate2bel__enum_value_ordered_dact_0[35] = gate2bel.gate2bel__enum_functor_desc_dact_0_35;
    gate2bel__enum_value_ordered_dact_0[36] = gate2bel.gate2bel__enum_functor_desc_dact_0_36;
    gate2bel__enum_value_ordered_dact_0[37] = gate2bel.gate2bel__enum_functor_desc_dact_0_37;
    gate2bel__enum_value_ordered_dact_0[38] = gate2bel.gate2bel__enum_functor_desc_dact_0_38;
    gate2bel__enum_value_ordered_dact_0[39] = gate2bel.gate2bel__enum_functor_desc_dact_0_39;
    gate2bel__enum_value_ordered_dact_0[40] = gate2bel.gate2bel__enum_functor_desc_dact_0_40;
    gate2bel__enum_value_ordered_dact_0[41] = gate2bel.gate2bel__enum_functor_desc_dact_0_41;
    gate2bel__enum_value_ordered_dact_0[42] = gate2bel.gate2bel__enum_functor_desc_dact_0_42;
    //
    gate2bel__enum_name_ordered_dact_0[0] = gate2bel.gate2bel__enum_functor_desc_dact_0_0;
    gate2bel__enum_name_ordered_dact_0[1] = gate2bel.gate2bel__enum_functor_desc_dact_0_1;
    gate2bel__enum_name_ordered_dact_0[2] = gate2bel.gate2bel__enum_functor_desc_dact_0_2;
    gate2bel__enum_name_ordered_dact_0[3] = gate2bel.gate2bel__enum_functor_desc_dact_0_3;
    gate2bel__enum_name_ordered_dact_0[4] = gate2bel.gate2bel__enum_functor_desc_dact_0_4;
    gate2bel__enum_name_ordered_dact_0[5] = gate2bel.gate2bel__enum_functor_desc_dact_0_5;
    gate2bel__enum_name_ordered_dact_0[6] = gate2bel.gate2bel__enum_functor_desc_dact_0_6;
    gate2bel__enum_name_ordered_dact_0[7] = gate2bel.gate2bel__enum_functor_desc_dact_0_7;
    gate2bel__enum_name_ordered_dact_0[8] = gate2bel.gate2bel__enum_functor_desc_dact_0_8;
    gate2bel__enum_name_ordered_dact_0[9] = gate2bel.gate2bel__enum_functor_desc_dact_0_9;
    gate2bel__enum_name_ordered_dact_0[10] = gate2bel.gate2bel__enum_functor_desc_dact_0_10;
    gate2bel__enum_name_ordered_dact_0[11] = gate2bel.gate2bel__enum_functor_desc_dact_0_11;
    gate2bel__enum_name_ordered_dact_0[12] = gate2bel.gate2bel__enum_functor_desc_dact_0_12;
    gate2bel__enum_name_ordered_dact_0[13] = gate2bel.gate2bel__enum_functor_desc_dact_0_13;
    gate2bel__enum_name_ordered_dact_0[14] = gate2bel.gate2bel__enum_functor_desc_dact_0_14;
    gate2bel__enum_name_ordered_dact_0[15] = gate2bel.gate2bel__enum_functor_desc_dact_0_15;
    gate2bel__enum_name_ordered_dact_0[16] = gate2bel.gate2bel__enum_functor_desc_dact_0_16;
    gate2bel__enum_name_ordered_dact_0[17] = gate2bel.gate2bel__enum_functor_desc_dact_0_17;
    gate2bel__enum_name_ordered_dact_0[18] = gate2bel.gate2bel__enum_functor_desc_dact_0_18;
    gate2bel__enum_name_ordered_dact_0[19] = gate2bel.gate2bel__enum_functor_desc_dact_0_19;
    gate2bel__enum_name_ordered_dact_0[20] = gate2bel.gate2bel__enum_functor_desc_dact_0_20;
    gate2bel__enum_name_ordered_dact_0[21] = gate2bel.gate2bel__enum_functor_desc_dact_0_21;
    gate2bel__enum_name_ordered_dact_0[22] = gate2bel.gate2bel__enum_functor_desc_dact_0_22;
    gate2bel__enum_name_ordered_dact_0[23] = gate2bel.gate2bel__enum_functor_desc_dact_0_23;
    gate2bel__enum_name_ordered_dact_0[24] = gate2bel.gate2bel__enum_functor_desc_dact_0_24;
    gate2bel__enum_name_ordered_dact_0[25] = gate2bel.gate2bel__enum_functor_desc_dact_0_25;
    gate2bel__enum_name_ordered_dact_0[26] = gate2bel.gate2bel__enum_functor_desc_dact_0_26;
    gate2bel__enum_name_ordered_dact_0[27] = gate2bel.gate2bel__enum_functor_desc_dact_0_27;
    gate2bel__enum_name_ordered_dact_0[28] = gate2bel.gate2bel__enum_functor_desc_dact_0_28;
    gate2bel__enum_name_ordered_dact_0[29] = gate2bel.gate2bel__enum_functor_desc_dact_0_29;
    gate2bel__enum_name_ordered_dact_0[30] = gate2bel.gate2bel__enum_functor_desc_dact_0_30;
    gate2bel__enum_name_ordered_dact_0[31] = gate2bel.gate2bel__enum_functor_desc_dact_0_31;
    gate2bel__enum_name_ordered_dact_0[32] = gate2bel.gate2bel__enum_functor_desc_dact_0_32;
    gate2bel__enum_name_ordered_dact_0[33] = gate2bel.gate2bel__enum_functor_desc_dact_0_33;
    gate2bel__enum_name_ordered_dact_0[34] = gate2bel.gate2bel__enum_functor_desc_dact_0_34;
    gate2bel__enum_name_ordered_dact_0[35] = gate2bel.gate2bel__enum_functor_desc_dact_0_35;
    gate2bel__enum_name_ordered_dact_0[36] = gate2bel.gate2bel__enum_functor_desc_dact_0_36;
    gate2bel__enum_name_ordered_dact_0[37] = gate2bel.gate2bel__enum_functor_desc_dact_0_37;
    gate2bel__enum_name_ordered_dact_0[38] = gate2bel.gate2bel__enum_functor_desc_dact_0_38;
    gate2bel__enum_name_ordered_dact_0[39] = gate2bel.gate2bel__enum_functor_desc_dact_0_39;
    gate2bel__enum_name_ordered_dact_0[40] = gate2bel.gate2bel__enum_functor_desc_dact_0_40;
    gate2bel__enum_name_ordered_dact_0[41] = gate2bel.gate2bel__enum_functor_desc_dact_0_41;
    gate2bel__enum_name_ordered_dact_0[42] = gate2bel.gate2bel__enum_functor_desc_dact_0_42;
    //
    gate2bel__functor_number_map_dact_0[0] = 0;
    gate2bel__functor_number_map_dact_0[1] = 1;
    gate2bel__functor_number_map_dact_0[2] = 2;
    gate2bel__functor_number_map_dact_0[3] = 3;
    gate2bel__functor_number_map_dact_0[4] = 4;
    gate2bel__functor_number_map_dact_0[5] = 5;
    gate2bel__functor_number_map_dact_0[6] = 6;
    gate2bel__functor_number_map_dact_0[7] = 7;
    gate2bel__functor_number_map_dact_0[8] = 8;
    gate2bel__functor_number_map_dact_0[9] = 9;
    gate2bel__functor_number_map_dact_0[10] = 10;
    gate2bel__functor_number_map_dact_0[11] = 11;
    gate2bel__functor_number_map_dact_0[12] = 12;
    gate2bel__functor_number_map_dact_0[13] = 13;
    gate2bel__functor_number_map_dact_0[14] = 14;
    gate2bel__functor_number_map_dact_0[15] = 15;
    gate2bel__functor_number_map_dact_0[16] = 16;
    gate2bel__functor_number_map_dact_0[17] = 17;
    gate2bel__functor_number_map_dact_0[18] = 18;
    gate2bel__functor_number_map_dact_0[19] = 19;
    gate2bel__functor_number_map_dact_0[20] = 20;
    gate2bel__functor_number_map_dact_0[21] = 21;
    gate2bel__functor_number_map_dact_0[22] = 22;
    gate2bel__functor_number_map_dact_0[23] = 23;
    gate2bel__functor_number_map_dact_0[24] = 24;
    gate2bel__functor_number_map_dact_0[25] = 25;
    gate2bel__functor_number_map_dact_0[26] = 26;
    gate2bel__functor_number_map_dact_0[27] = 27;
    gate2bel__functor_number_map_dact_0[28] = 28;
    gate2bel__functor_number_map_dact_0[29] = 29;
    gate2bel__functor_number_map_dact_0[30] = 30;
    gate2bel__functor_number_map_dact_0[31] = 31;
    gate2bel__functor_number_map_dact_0[32] = 32;
    gate2bel__functor_number_map_dact_0[33] = 33;
    gate2bel__functor_number_map_dact_0[34] = 34;
    gate2bel__functor_number_map_dact_0[35] = 35;
    gate2bel__functor_number_map_dact_0[36] = 36;
    gate2bel__functor_number_map_dact_0[37] = 37;
    gate2bel__functor_number_map_dact_0[38] = 38;
    gate2bel__functor_number_map_dact_0[39] = 39;
    gate2bel__functor_number_map_dact_0[40] = 40;
    gate2bel__functor_number_map_dact_0[41] = 41;
    gate2bel__functor_number_map_dact_0[42] = 42;
    //
    gate2bel__type_ctor_info_dact_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_ENUM,
		((java.lang.Object) (new AddrOf2_0(20))),
		((java.lang.Object) (new AddrOf2_0(21))),
		"gate2bel",
		"dact",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__enum_name_ordered_dact_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__enum_value_ordered_dact_0),
		43,
		4,
		gate2bel.gate2bel__functor_number_map_dact_0);
    //
    //
    //
    //
    gate2bel__field_types_lndata_0_0[0] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_owlstr_0;
    gate2bel__field_types_lndata_0_0[1] = (jmercury.runtime.PseudoTypeInfo) bool.bool__type_ctor_info_bool_0;
    gate2bel__field_types_lndata_0_0[2] = (jmercury.runtime.PseudoTypeInfo) beliefs.beliefs__type_ctor_info_modality_0;
    gate2bel__field_types_lndata_0_0[3] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_cvalue_0;
    //
    gate2bel__du_functor_desc_lndata_0_0.init("lndata",
		4,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		gate2bel.gate2bel__field_types_lndata_0_0,
		null,
		null,
		null);
    //
    gate2bel__du_stag_ordered_lndata_0_0[0] = gate2bel.gate2bel__du_functor_desc_lndata_0_0;
    //
    gate2bel__du_ptag_ordered_lndata_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		gate2bel.gate2bel__du_stag_ordered_lndata_0_0);
    //
    gate2bel__du_name_ordered_lndata_0[0] = gate2bel.gate2bel__du_functor_desc_lndata_0_0;
    //
    gate2bel__functor_number_map_lndata_0[0] = 0;
    //
    gate2bel__type_ctor_info_lndata_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(22))),
		((java.lang.Object) (new AddrOf2_0(23))),
		"gate2bel",
		"lndata",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_lndata_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_lndata_0),
		1,
		4,
		gate2bel.gate2bel__functor_number_map_lndata_0);
    //
    tree234__ti_tree234_2builtin__type_ctor_info_int_0list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_lndata_0builtin__type_ctor_info_int_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0),
		jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_lndata_0builtin__type_ctor_info_int_0)});
    //
    gate2bel__type_ctor_info_lnmap_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(24))),
		((java.lang.Object) (new AddrOf2_0(25))),
		"gate2bel",
		"lnmap",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) gate2bel.tree234__ti_tree234_2builtin__type_ctor_info_int_0list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_lndata_0builtin__type_ctor_info_int_0),
		-1,
		0,
		null);
    //
    list__ti_list_1gate2bel__type_ctor_info_owlstmnt_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_owlstmnt_0)});
    //
    //
    gate2bel__field_types_owlfile_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    gate2bel__field_types_owlfile_0_0[1] = (jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1gate2bel__type_ctor_info_owlstmnt_0;
    gate2bel__field_types_owlfile_0_0[2] = (jmercury.runtime.PseudoTypeInfo) utils.utils__type_ctor_info_corefs_0;
    //
    gate2bel__du_functor_desc_owlfile_0_0.init("owlfile",
		3,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		gate2bel.gate2bel__field_types_owlfile_0_0,
		null,
		null,
		null);
    //
    gate2bel__du_stag_ordered_owlfile_0_0[0] = gate2bel.gate2bel__du_functor_desc_owlfile_0_0;
    //
    gate2bel__du_ptag_ordered_owlfile_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		gate2bel.gate2bel__du_stag_ordered_owlfile_0_0);
    //
    gate2bel__du_name_ordered_owlfile_0[0] = gate2bel.gate2bel__du_functor_desc_owlfile_0_0;
    //
    gate2bel__functor_number_map_owlfile_0[0] = 0;
    //
    gate2bel__type_ctor_info_owlfile_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(26))),
		((java.lang.Object) (new AddrOf2_0(27))),
		"gate2bel",
		"owlfile",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_owlfile_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_owlfile_0),
		1,
		4,
		gate2bel.gate2bel__functor_number_map_owlfile_0);
    //
    //
    gate2bel__field_types_owlpr_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    gate2bel__field_types_owlpr_0_0[1] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_owlprtp_0;
    //
    gate2bel__du_functor_desc_owlpr_0_0.init("str",
		2,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		gate2bel.gate2bel__field_types_owlpr_0_0,
		null,
		null,
		null);
    //
    gate2bel__du_stag_ordered_owlpr_0_0[0] = gate2bel.gate2bel__du_functor_desc_owlpr_0_0;
    //
    gate2bel__du_ptag_ordered_owlpr_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		gate2bel.gate2bel__du_stag_ordered_owlpr_0_0);
    //
    gate2bel__du_name_ordered_owlpr_0[0] = gate2bel.gate2bel__du_functor_desc_owlpr_0_0;
    //
    gate2bel__functor_number_map_owlpr_0[0] = 0;
    //
    gate2bel__type_ctor_info_owlpr_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(28))),
		((java.lang.Object) (new AddrOf2_0(29))),
		"gate2bel",
		"owlpr",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_owlpr_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_owlpr_0),
		1,
		4,
		gate2bel.gate2bel__functor_number_map_owlpr_0);
    //
    gate2bel__enum_functor_desc_owlprtp_0_0.init("wordnet",
		0);
    //
    gate2bel__enum_functor_desc_owlprtp_0_1.init("unrecognised",
		1);
    //
    gate2bel__enum_value_ordered_owlprtp_0[0] = gate2bel.gate2bel__enum_functor_desc_owlprtp_0_0;
    gate2bel__enum_value_ordered_owlprtp_0[1] = gate2bel.gate2bel__enum_functor_desc_owlprtp_0_1;
    //
    gate2bel__enum_name_ordered_owlprtp_0[0] = gate2bel.gate2bel__enum_functor_desc_owlprtp_0_1;
    gate2bel__enum_name_ordered_owlprtp_0[1] = gate2bel.gate2bel__enum_functor_desc_owlprtp_0_0;
    //
    gate2bel__functor_number_map_owlprtp_0[0] = 1;
    gate2bel__functor_number_map_owlprtp_0[1] = 0;
    //
    gate2bel__type_ctor_info_owlprtp_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_ENUM,
		((java.lang.Object) (new AddrOf2_0(30))),
		((java.lang.Object) (new AddrOf2_0(31))),
		"gate2bel",
		"owlprtp",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__enum_name_ordered_owlprtp_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__enum_value_ordered_owlprtp_0),
		2,
		4,
		gate2bel.gate2bel__functor_number_map_owlprtp_0);
    //
    gate2bel__field_types_owlstmnt_0_0[0] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_owltriple_0;
    //
    gate2bel__du_functor_desc_owlstmnt_0_0.init("one",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		0,
		gate2bel.gate2bel__field_types_owlstmnt_0_0,
		null,
		null,
		null);
    //
    list__ti_list_1gate2bel__type_ctor_info_lndata_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_lndata_0)});
    //
    gate2bel__field_types_owlstmnt_0_1[0] = (jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1gate2bel__type_ctor_info_lndata_0;
    gate2bel__field_types_owlstmnt_0_1[1] = (jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1gate2bel__type_ctor_info_owltriple_0;
    //
    gate2bel__du_functor_desc_owlstmnt_0_1.init("embedded",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		gate2bel.gate2bel__field_types_owlstmnt_0_1,
		null,
		null,
		null);
    //
    gate2bel__du_stag_ordered_owlstmnt_0_0[0] = gate2bel.gate2bel__du_functor_desc_owlstmnt_0_0;
    gate2bel__du_stag_ordered_owlstmnt_0_0[1] = gate2bel.gate2bel__du_functor_desc_owlstmnt_0_1;
    //
    gate2bel__du_ptag_ordered_owlstmnt_0[0] = new jmercury.runtime.DuPtagLayout(2,
		private_builtin.MR_SECTAG_REMOTE,
		gate2bel.gate2bel__du_stag_ordered_owlstmnt_0_0);
    //
    gate2bel__du_name_ordered_owlstmnt_0[0] = gate2bel.gate2bel__du_functor_desc_owlstmnt_0_1;
    gate2bel__du_name_ordered_owlstmnt_0[1] = gate2bel.gate2bel__du_functor_desc_owlstmnt_0_0;
    //
    gate2bel__functor_number_map_owlstmnt_0[0] = 1;
    gate2bel__functor_number_map_owlstmnt_0[1] = 0;
    //
    gate2bel__type_ctor_info_owlstmnt_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(32))),
		((java.lang.Object) (new AddrOf2_0(33))),
		"gate2bel",
		"owlstmnt",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_owlstmnt_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_owlstmnt_0),
		2,
		4,
		gate2bel.gate2bel__functor_number_map_owlstmnt_0);
    //
    //
    gate2bel__field_types_owlstr_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    gate2bel__field_types_owlstr_0_0[1] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_owlstrtp_0;
    //
    gate2bel__du_functor_desc_owlstr_0_0.init("str",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		0,
		gate2bel.gate2bel__field_types_owlstr_0_0,
		null,
		null,
		null);
    //
    gate2bel__field_types_owlstr_0_1[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    gate2bel__field_types_owlstr_0_1[1] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_owlstrtp_0;
    gate2bel__field_types_owlstr_0_1[2] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    gate2bel__du_functor_desc_owlstr_0_1.init("cref",
		3,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		gate2bel.gate2bel__field_types_owlstr_0_1,
		null,
		null,
		null);
    //
    gate2bel__du_stag_ordered_owlstr_0_0[0] = gate2bel.gate2bel__du_functor_desc_owlstr_0_0;
    gate2bel__du_stag_ordered_owlstr_0_0[1] = gate2bel.gate2bel__du_functor_desc_owlstr_0_1;
    //
    gate2bel__du_ptag_ordered_owlstr_0[0] = new jmercury.runtime.DuPtagLayout(2,
		private_builtin.MR_SECTAG_REMOTE,
		gate2bel.gate2bel__du_stag_ordered_owlstr_0_0);
    //
    gate2bel__du_name_ordered_owlstr_0[0] = gate2bel.gate2bel__du_functor_desc_owlstr_0_1;
    gate2bel__du_name_ordered_owlstr_0[1] = gate2bel.gate2bel__du_functor_desc_owlstr_0_0;
    //
    gate2bel__functor_number_map_owlstr_0[0] = 1;
    gate2bel__functor_number_map_owlstr_0[1] = 0;
    //
    gate2bel__type_ctor_info_owlstr_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(34))),
		((java.lang.Object) (new AddrOf2_0(35))),
		"gate2bel",
		"owlstr",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_owlstr_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_owlstr_0),
		2,
		4,
		gate2bel.gate2bel__functor_number_map_owlstr_0);
    //
    gate2bel__du_functor_desc_owlstrtp_0_0.init("wordnet",
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
    gate2bel__field_types_owlstrtp_0_1[0] = (jmercury.runtime.PseudoTypeInfo) wordnet.wordnet__type_ctor_info_prontp_0;
    //
    gate2bel__du_functor_desc_owlstrtp_0_1.init("pronoun",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		3,
		1,
		gate2bel.gate2bel__field_types_owlstrtp_0_1,
		null,
		null,
		null);
    //
    gate2bel__du_functor_desc_owlstrtp_0_2.init("pp",
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
    gate2bel__du_functor_desc_owlstrtp_0_3.init("unrecognised",
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
    gate2bel__du_stag_ordered_owlstrtp_0_0[0] = gate2bel.gate2bel__du_functor_desc_owlstrtp_0_0;
    gate2bel__du_stag_ordered_owlstrtp_0_0[1] = gate2bel.gate2bel__du_functor_desc_owlstrtp_0_2;
    gate2bel__du_stag_ordered_owlstrtp_0_0[2] = gate2bel.gate2bel__du_functor_desc_owlstrtp_0_3;
    gate2bel__du_stag_ordered_owlstrtp_0_0[3] = gate2bel.gate2bel__du_functor_desc_owlstrtp_0_1;
    //
    gate2bel__du_ptag_ordered_owlstrtp_0[0] = new jmercury.runtime.DuPtagLayout(4,
		private_builtin.MR_SECTAG_REMOTE,
		gate2bel.gate2bel__du_stag_ordered_owlstrtp_0_0);
    //
    gate2bel__du_name_ordered_owlstrtp_0[0] = gate2bel.gate2bel__du_functor_desc_owlstrtp_0_2;
    gate2bel__du_name_ordered_owlstrtp_0[1] = gate2bel.gate2bel__du_functor_desc_owlstrtp_0_1;
    gate2bel__du_name_ordered_owlstrtp_0[2] = gate2bel.gate2bel__du_functor_desc_owlstrtp_0_3;
    gate2bel__du_name_ordered_owlstrtp_0[3] = gate2bel.gate2bel__du_functor_desc_owlstrtp_0_0;
    //
    gate2bel__functor_number_map_owlstrtp_0[0] = 3;
    gate2bel__functor_number_map_owlstrtp_0[1] = 1;
    gate2bel__functor_number_map_owlstrtp_0[2] = 0;
    gate2bel__functor_number_map_owlstrtp_0[3] = 2;
    //
    gate2bel__type_ctor_info_owlstrtp_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(36))),
		((java.lang.Object) (new AddrOf2_0(37))),
		"gate2bel",
		"owlstrtp",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_owlstrtp_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_owlstrtp_0),
		4,
		4,
		gate2bel.gate2bel__functor_number_map_owlstrtp_0);
    //
    maybe__ti_maybe_1gate2bel__type_ctor_info_owlstr_0.init(maybe.maybe__type_ctor_info_maybe_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_owlstr_0)});
    //
    //
    gate2bel__field_types_owltriple_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    gate2bel__field_types_owltriple_0_0[1] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    gate2bel__field_types_owltriple_0_0[2] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_owlstr_0;
    gate2bel__field_types_owltriple_0_0[3] = (jmercury.runtime.PseudoTypeInfo) bool.bool__type_ctor_info_bool_0;
    gate2bel__field_types_owltriple_0_0[4] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_owlpr_0;
    gate2bel__field_types_owltriple_0_0[5] = (jmercury.runtime.PseudoTypeInfo) gate2bel.maybe__ti_maybe_1gate2bel__type_ctor_info_owlstr_0;
    //
    gate2bel__du_functor_desc_owltriple_0_0.init("owltriple",
		6,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		gate2bel.gate2bel__field_types_owltriple_0_0,
		null,
		null,
		null);
    //
    gate2bel__du_stag_ordered_owltriple_0_0[0] = gate2bel.gate2bel__du_functor_desc_owltriple_0_0;
    //
    gate2bel__du_ptag_ordered_owltriple_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		gate2bel.gate2bel__du_stag_ordered_owltriple_0_0);
    //
    gate2bel__du_name_ordered_owltriple_0[0] = gate2bel.gate2bel__du_functor_desc_owltriple_0_0;
    //
    gate2bel__functor_number_map_owltriple_0[0] = 0;
    //
    gate2bel__type_ctor_info_owltriple_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(38))),
		((java.lang.Object) (new AddrOf2_0(39))),
		"gate2bel",
		"owltriple",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_owltriple_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_owltriple_0),
		1,
		4,
		gate2bel.gate2bel__functor_number_map_owltriple_0);
    //
    gate2bel__enum_functor_desc_reftype_0_0.init("ref",
		0);
    //
    gate2bel__enum_functor_desc_reftype_0_1.init("person",
		1);
    //
    gate2bel__enum_functor_desc_reftype_0_2.init("possess",
		2);
    //
    gate2bel__enum_functor_desc_reftype_0_3.init("reflex",
		3);
    //
    gate2bel__enum_value_ordered_reftype_0[0] = gate2bel.gate2bel__enum_functor_desc_reftype_0_0;
    gate2bel__enum_value_ordered_reftype_0[1] = gate2bel.gate2bel__enum_functor_desc_reftype_0_1;
    gate2bel__enum_value_ordered_reftype_0[2] = gate2bel.gate2bel__enum_functor_desc_reftype_0_2;
    gate2bel__enum_value_ordered_reftype_0[3] = gate2bel.gate2bel__enum_functor_desc_reftype_0_3;
    //
    gate2bel__enum_name_ordered_reftype_0[0] = gate2bel.gate2bel__enum_functor_desc_reftype_0_1;
    gate2bel__enum_name_ordered_reftype_0[1] = gate2bel.gate2bel__enum_functor_desc_reftype_0_2;
    gate2bel__enum_name_ordered_reftype_0[2] = gate2bel.gate2bel__enum_functor_desc_reftype_0_0;
    gate2bel__enum_name_ordered_reftype_0[3] = gate2bel.gate2bel__enum_functor_desc_reftype_0_3;
    //
    gate2bel__functor_number_map_reftype_0[0] = 2;
    gate2bel__functor_number_map_reftype_0[1] = 0;
    gate2bel__functor_number_map_reftype_0[2] = 1;
    gate2bel__functor_number_map_reftype_0[3] = 3;
    //
    gate2bel__type_ctor_info_reftype_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_ENUM,
		((java.lang.Object) (new AddrOf2_0(40))),
		((java.lang.Object) (new AddrOf2_0(41))),
		"gate2bel",
		"reftype",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__enum_name_ordered_reftype_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__enum_value_ordered_reftype_0),
		4,
		4,
		gate2bel.gate2bel__functor_number_map_reftype_0);
    //
    gate2bel__field_types_str2_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    gate2bel__field_types_str2_0_0[1] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_strtype_0;
    //
    gate2bel__du_functor_desc_str2_0_0.init("s",
		2,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		gate2bel.gate2bel__field_types_str2_0_0,
		null,
		null,
		null);
    //
    gate2bel__du_stag_ordered_str2_0_0[0] = gate2bel.gate2bel__du_functor_desc_str2_0_0;
    //
    gate2bel__du_ptag_ordered_str2_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		gate2bel.gate2bel__du_stag_ordered_str2_0_0);
    //
    gate2bel__du_name_ordered_str2_0[0] = gate2bel.gate2bel__du_functor_desc_str2_0_0;
    //
    gate2bel__functor_number_map_str2_0[0] = 0;
    //
    gate2bel__type_ctor_info_str2_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(42))),
		((java.lang.Object) (new AddrOf2_0(43))),
		"gate2bel",
		"str2",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_str2_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_str2_0),
		1,
		4,
		gate2bel.gate2bel__functor_number_map_str2_0);
    //
    gate2bel__du_functor_desc_strtype_0_0.init("wordnet",
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
    gate2bel__field_types_strtype_0_1[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    gate2bel__field_types_strtype_0_1[1] = (jmercury.runtime.PseudoTypeInfo) wordnet.wordnet__type_ctor_info_prontp_0;
    //
    gate2bel__du_functor_desc_strtype_0_1.init("pronoun",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		3,
		1,
		gate2bel.gate2bel__field_types_strtype_0_1,
		null,
		null,
		null);
    //
    gate2bel__du_functor_desc_strtype_0_2.init("pp",
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
    gate2bel__du_functor_desc_strtype_0_3.init("unrecognised",
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
    gate2bel__du_stag_ordered_strtype_0_0[0] = gate2bel.gate2bel__du_functor_desc_strtype_0_0;
    gate2bel__du_stag_ordered_strtype_0_0[1] = gate2bel.gate2bel__du_functor_desc_strtype_0_2;
    gate2bel__du_stag_ordered_strtype_0_0[2] = gate2bel.gate2bel__du_functor_desc_strtype_0_3;
    gate2bel__du_stag_ordered_strtype_0_0[3] = gate2bel.gate2bel__du_functor_desc_strtype_0_1;
    //
    gate2bel__du_ptag_ordered_strtype_0[0] = new jmercury.runtime.DuPtagLayout(4,
		private_builtin.MR_SECTAG_REMOTE,
		gate2bel.gate2bel__du_stag_ordered_strtype_0_0);
    //
    gate2bel__du_name_ordered_strtype_0[0] = gate2bel.gate2bel__du_functor_desc_strtype_0_2;
    gate2bel__du_name_ordered_strtype_0[1] = gate2bel.gate2bel__du_functor_desc_strtype_0_1;
    gate2bel__du_name_ordered_strtype_0[2] = gate2bel.gate2bel__du_functor_desc_strtype_0_3;
    gate2bel__du_name_ordered_strtype_0[3] = gate2bel.gate2bel__du_functor_desc_strtype_0_0;
    //
    gate2bel__functor_number_map_strtype_0[0] = 3;
    gate2bel__functor_number_map_strtype_0[1] = 1;
    gate2bel__functor_number_map_strtype_0[2] = 0;
    gate2bel__functor_number_map_strtype_0[3] = 2;
    //
    gate2bel__type_ctor_info_strtype_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(44))),
		((java.lang.Object) (new AddrOf2_0(45))),
		"gate2bel",
		"strtype",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_strtype_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_strtype_0),
		4,
		4,
		gate2bel.gate2bel__functor_number_map_strtype_0);
    //
    gate2bel__type_ctor_info_tid_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(46))),
		((java.lang.Object) (new AddrOf2_0(47))),
		"gate2bel",
		"tid",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0),
		-1,
		0,
		null);
    //
    gate2bel__field_types_tmpagt_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    gate2bel__du_functor_desc_tmpagt_0_0.init("str",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		2,
		0,
		gate2bel.gate2bel__field_types_tmpagt_0_0,
		null,
		null,
		null);
    //
    gate2bel__du_functor_desc_tmpagt_0_1.init("p1",
		0,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		1,
		null,
		null,
		null,
		null);
    //
    gate2bel__du_functor_desc_tmpagt_0_2.init("p2",
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
    gate2bel__du_stag_ordered_tmpagt_0_0[0] = gate2bel.gate2bel__du_functor_desc_tmpagt_0_1;
    gate2bel__du_stag_ordered_tmpagt_0_0[1] = gate2bel.gate2bel__du_functor_desc_tmpagt_0_2;
    gate2bel__du_stag_ordered_tmpagt_0_0[2] = gate2bel.gate2bel__du_functor_desc_tmpagt_0_0;
    //
    gate2bel__du_ptag_ordered_tmpagt_0[0] = new jmercury.runtime.DuPtagLayout(3,
		private_builtin.MR_SECTAG_REMOTE,
		gate2bel.gate2bel__du_stag_ordered_tmpagt_0_0);
    //
    gate2bel__du_name_ordered_tmpagt_0[0] = gate2bel.gate2bel__du_functor_desc_tmpagt_0_1;
    gate2bel__du_name_ordered_tmpagt_0[1] = gate2bel.gate2bel__du_functor_desc_tmpagt_0_2;
    gate2bel__du_name_ordered_tmpagt_0[2] = gate2bel.gate2bel__du_functor_desc_tmpagt_0_0;
    //
    gate2bel__functor_number_map_tmpagt_0[0] = 2;
    gate2bel__functor_number_map_tmpagt_0[1] = 0;
    gate2bel__functor_number_map_tmpagt_0[2] = 1;
    //
    gate2bel__type_ctor_info_tmpagt_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(48))),
		((java.lang.Object) (new AddrOf2_0(49))),
		"gate2bel",
		"tmpagt",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_tmpagt_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_tmpagt_0),
		3,
		4,
		gate2bel.gate2bel__functor_number_map_tmpagt_0);
    //
    gate2bel__field_types_tmpmod_0_0[0] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_tmpagt_0;
    gate2bel__field_types_tmpmod_0_0[1] = (jmercury.runtime.PseudoTypeInfo) bool.bool__type_ctor_info_bool_0;
    gate2bel__field_types_tmpmod_0_0[2] = (jmercury.runtime.PseudoTypeInfo) beliefs.beliefs__type_ctor_info_modality_0;
    //
    gate2bel__du_functor_desc_tmpmod_0_0.init("tmpmod",
		3,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		gate2bel.gate2bel__field_types_tmpmod_0_0,
		null,
		null,
		null);
    //
    gate2bel__du_stag_ordered_tmpmod_0_0[0] = gate2bel.gate2bel__du_functor_desc_tmpmod_0_0;
    //
    gate2bel__du_ptag_ordered_tmpmod_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		gate2bel.gate2bel__du_stag_ordered_tmpmod_0_0);
    //
    gate2bel__du_name_ordered_tmpmod_0[0] = gate2bel.gate2bel__du_functor_desc_tmpmod_0_0;
    //
    gate2bel__functor_number_map_tmpmod_0[0] = 0;
    //
    gate2bel__type_ctor_info_tmpmod_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(50))),
		((java.lang.Object) (new AddrOf2_0(51))),
		"gate2bel",
		"tmpmod",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_tmpmod_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_tmpmod_0),
		1,
		4,
		gate2bel.gate2bel__functor_number_map_tmpmod_0);
    //
    //
    list__ti_list_1gate2bel__type_ctor_info_chunk_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_chunk_0)});
    //
    gate2bel__field_types_tnfile_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    gate2bel__field_types_tnfile_0_0[1] = (jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1gate2bel__type_ctor_info_chunk_0;
    //
    gate2bel__du_functor_desc_tnfile_0_0.init("file",
		2,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		gate2bel.gate2bel__field_types_tnfile_0_0,
		null,
		null,
		null);
    //
    gate2bel__du_stag_ordered_tnfile_0_0[0] = gate2bel.gate2bel__du_functor_desc_tnfile_0_0;
    //
    gate2bel__du_ptag_ordered_tnfile_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		gate2bel.gate2bel__du_stag_ordered_tnfile_0_0);
    //
    gate2bel__du_name_ordered_tnfile_0[0] = gate2bel.gate2bel__du_functor_desc_tnfile_0_0;
    //
    gate2bel__functor_number_map_tnfile_0[0] = 0;
    //
    gate2bel__type_ctor_info_tnfile_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(52))),
		((java.lang.Object) (new AddrOf2_0(53))),
		"gate2bel",
		"tnfile",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_tnfile_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_tnfile_0),
		1,
		4,
		gate2bel.gate2bel__functor_number_map_tnfile_0);
    //
    //
    list__ti_list_1gate2bel__type_ctor_info_chunk2_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_chunk2_0)});
    //
    gate2bel__field_types_tnfile2_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    gate2bel__field_types_tnfile2_0_0[1] = (jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1gate2bel__type_ctor_info_chunk2_0;
    //
    gate2bel__du_functor_desc_tnfile2_0_0.init("file",
		2,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		gate2bel.gate2bel__field_types_tnfile2_0_0,
		null,
		null,
		null);
    //
    gate2bel__du_stag_ordered_tnfile2_0_0[0] = gate2bel.gate2bel__du_functor_desc_tnfile2_0_0;
    //
    gate2bel__du_ptag_ordered_tnfile2_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		gate2bel.gate2bel__du_stag_ordered_tnfile2_0_0);
    //
    gate2bel__du_name_ordered_tnfile2_0[0] = gate2bel.gate2bel__du_functor_desc_tnfile2_0_0;
    //
    gate2bel__functor_number_map_tnfile2_0[0] = 0;
    //
    gate2bel__type_ctor_info_tnfile2_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(54))),
		((java.lang.Object) (new AddrOf2_0(55))),
		"gate2bel",
		"tnfile2",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_tnfile2_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_tnfile2_0),
		1,
		4,
		gate2bel.gate2bel__functor_number_map_tnfile2_0);
    //
    //
    list__ti_list_1gate2bel__type_ctor_info_chunk3_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_chunk3_0)});
    //
    gate2bel__field_types_tnfile3_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    gate2bel__field_types_tnfile3_0_0[1] = (jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1gate2bel__type_ctor_info_chunk3_0;
    gate2bel__field_types_tnfile3_0_0[2] = (jmercury.runtime.PseudoTypeInfo) utils.utils__type_ctor_info_corefs_0;
    //
    gate2bel__du_functor_desc_tnfile3_0_0.init("file",
		3,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		gate2bel.gate2bel__field_types_tnfile3_0_0,
		null,
		null,
		null);
    //
    gate2bel__du_stag_ordered_tnfile3_0_0[0] = gate2bel.gate2bel__du_functor_desc_tnfile3_0_0;
    //
    gate2bel__du_ptag_ordered_tnfile3_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		gate2bel.gate2bel__du_stag_ordered_tnfile3_0_0);
    //
    gate2bel__du_name_ordered_tnfile3_0[0] = gate2bel.gate2bel__du_functor_desc_tnfile3_0_0;
    //
    gate2bel__functor_number_map_tnfile3_0[0] = 0;
    //
    gate2bel__type_ctor_info_tnfile3_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(56))),
		((java.lang.Object) (new AddrOf2_0(57))),
		"gate2bel",
		"tnfile3",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_tnfile3_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_tnfile3_0),
		1,
		4,
		gate2bel.gate2bel__functor_number_map_tnfile3_0);
    //
    gate2bel__type_ctor_info_trid_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(58))),
		((java.lang.Object) (new AddrOf2_0(59))),
		"gate2bel",
		"trid",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0),
		-1,
		0,
		null);
    //
    //
    gate2bel__field_types_triple_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    gate2bel__field_types_triple_0_0[1] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_value_0;
    gate2bel__field_types_triple_0_0[2] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_value_0;
    gate2bel__field_types_triple_0_0[3] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_value_0;
    //
    gate2bel__du_functor_desc_triple_0_0.init("triple",
		4,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		0,
		gate2bel.gate2bel__field_types_triple_0_0,
		null,
		null,
		null);
    //
    gate2bel__field_types_triple_0_1[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    gate2bel__field_types_triple_0_1[1] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_value_0;
    gate2bel__field_types_triple_0_1[2] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_value_0;
    gate2bel__field_types_triple_0_1[3] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_value_0;
    gate2bel__field_types_triple_0_1[4] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    gate2bel__du_functor_desc_triple_0_1.init("triple",
		5,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		gate2bel.gate2bel__field_types_triple_0_1,
		null,
		null,
		null);
    //
    gate2bel__du_stag_ordered_triple_0_0[0] = gate2bel.gate2bel__du_functor_desc_triple_0_0;
    gate2bel__du_stag_ordered_triple_0_0[1] = gate2bel.gate2bel__du_functor_desc_triple_0_1;
    //
    gate2bel__du_ptag_ordered_triple_0[0] = new jmercury.runtime.DuPtagLayout(2,
		private_builtin.MR_SECTAG_REMOTE,
		gate2bel.gate2bel__du_stag_ordered_triple_0_0);
    //
    gate2bel__du_name_ordered_triple_0[0] = gate2bel.gate2bel__du_functor_desc_triple_0_0;
    gate2bel__du_name_ordered_triple_0[1] = gate2bel.gate2bel__du_functor_desc_triple_0_1;
    //
    gate2bel__functor_number_map_triple_0[0] = 0;
    gate2bel__functor_number_map_triple_0[1] = 1;
    //
    gate2bel__type_ctor_info_triple_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(60))),
		((java.lang.Object) (new AddrOf2_0(61))),
		"gate2bel",
		"triple",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_triple_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_triple_0),
		2,
		4,
		gate2bel.gate2bel__functor_number_map_triple_0);
    //
    //
    gate2bel__field_types_triple2_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    gate2bel__field_types_triple2_0_0[1] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_value2_0;
    gate2bel__field_types_triple2_0_0[2] = (jmercury.runtime.PseudoTypeInfo) bool.bool__type_ctor_info_bool_0;
    gate2bel__field_types_triple2_0_0[3] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_value2_0;
    gate2bel__field_types_triple2_0_0[4] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_value2_0;
    //
    gate2bel__du_functor_desc_triple2_0_0.init("triple",
		5,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		0,
		gate2bel.gate2bel__field_types_triple2_0_0,
		null,
		null,
		null);
    //
    gate2bel__field_types_triple2_0_1[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    gate2bel__field_types_triple2_0_1[1] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_value2_0;
    gate2bel__field_types_triple2_0_1[2] = (jmercury.runtime.PseudoTypeInfo) bool.bool__type_ctor_info_bool_0;
    gate2bel__field_types_triple2_0_1[3] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_value2_0;
    gate2bel__field_types_triple2_0_1[4] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_value2_0;
    gate2bel__field_types_triple2_0_1[5] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    //
    gate2bel__du_functor_desc_triple2_0_1.init("triple",
		6,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		1,
		gate2bel.gate2bel__field_types_triple2_0_1,
		null,
		null,
		null);
    //
    gate2bel__du_stag_ordered_triple2_0_0[0] = gate2bel.gate2bel__du_functor_desc_triple2_0_0;
    gate2bel__du_stag_ordered_triple2_0_0[1] = gate2bel.gate2bel__du_functor_desc_triple2_0_1;
    //
    gate2bel__du_ptag_ordered_triple2_0[0] = new jmercury.runtime.DuPtagLayout(2,
		private_builtin.MR_SECTAG_REMOTE,
		gate2bel.gate2bel__du_stag_ordered_triple2_0_0);
    //
    gate2bel__du_name_ordered_triple2_0[0] = gate2bel.gate2bel__du_functor_desc_triple2_0_0;
    gate2bel__du_name_ordered_triple2_0[1] = gate2bel.gate2bel__du_functor_desc_triple2_0_1;
    //
    gate2bel__functor_number_map_triple2_0[0] = 0;
    gate2bel__functor_number_map_triple2_0[1] = 1;
    //
    gate2bel__type_ctor_info_triple2_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(62))),
		((java.lang.Object) (new AddrOf2_0(63))),
		"gate2bel",
		"triple2",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_triple2_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_triple2_0),
		2,
		4,
		gate2bel.gate2bel__functor_number_map_triple2_0);
    //
    maybe__ti_maybe_1builtin__type_ctor_info_int_0.init(maybe.maybe__type_ctor_info_maybe_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0)});
    //
    gate2bel__field_types_triple3_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0;
    gate2bel__field_types_triple3_0_0[1] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_cvalue_0;
    gate2bel__field_types_triple3_0_0[2] = (jmercury.runtime.PseudoTypeInfo) bool.bool__type_ctor_info_bool_0;
    gate2bel__field_types_triple3_0_0[3] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_cstring_0;
    gate2bel__field_types_triple3_0_0[4] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_cvalue_0;
    gate2bel__field_types_triple3_0_0[5] = (jmercury.runtime.PseudoTypeInfo) gate2bel.maybe__ti_maybe_1builtin__type_ctor_info_int_0;
    //
    gate2bel__du_functor_desc_triple3_0_0.init("triple",
		6,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		gate2bel.gate2bel__field_types_triple3_0_0,
		null,
		null,
		null);
    //
    gate2bel__du_stag_ordered_triple3_0_0[0] = gate2bel.gate2bel__du_functor_desc_triple3_0_0;
    //
    gate2bel__du_ptag_ordered_triple3_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		gate2bel.gate2bel__du_stag_ordered_triple3_0_0);
    //
    gate2bel__du_name_ordered_triple3_0[0] = gate2bel.gate2bel__du_functor_desc_triple3_0_0;
    //
    gate2bel__functor_number_map_triple3_0[0] = 0;
    //
    gate2bel__type_ctor_info_triple3_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(64))),
		((java.lang.Object) (new AddrOf2_0(65))),
		"gate2bel",
		"triple3",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_triple3_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_triple3_0),
		1,
		4,
		gate2bel.gate2bel__functor_number_map_triple3_0);
    //
    gate2bel__field_types_value_0_0[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    //
    gate2bel__du_functor_desc_value_0_0.init("str",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		0,
		gate2bel.gate2bel__field_types_value_0_0,
		null,
		null,
		null);
    //
    gate2bel__field_types_value_0_1[0] = (jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1builtin__type_ctor_info_string_0;
    //
    gate2bel__du_functor_desc_value_0_1.init("strs",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		2,
		1,
		gate2bel.gate2bel__field_types_value_0_1,
		null,
		null,
		null);
    //
    gate2bel__field_types_value_0_2[0] = (jmercury.runtime.PseudoTypeInfo) gate2bel.pair__ti_pair_2gate2bel__type_ctor_info_reftype_0builtin__type_ctor_info_int_0;
    //
    gate2bel__du_functor_desc_value_0_2.init("coref",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		3,
		2,
		gate2bel.gate2bel__field_types_value_0_2,
		null,
		null,
		null);
    //
    gate2bel__field_types_value_0_3[0] = (jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0;
    gate2bel__field_types_value_0_3[1] = (jmercury.runtime.PseudoTypeInfo) gate2bel.pair__ti_pair_2gate2bel__type_ctor_info_reftype_0builtin__type_ctor_info_int_0;
    //
    gate2bel__du_functor_desc_value_0_3.init("coref",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		4,
		3,
		gate2bel.gate2bel__field_types_value_0_3,
		null,
		null,
		null);
    //
    gate2bel__field_types_value_0_4[0] = (jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1builtin__type_ctor_info_string_0;
    gate2bel__field_types_value_0_4[1] = (jmercury.runtime.PseudoTypeInfo) gate2bel.pair__ti_pair_2gate2bel__type_ctor_info_reftype_0builtin__type_ctor_info_int_0;
    //
    gate2bel__du_functor_desc_value_0_4.init("corefs",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		5,
		4,
		gate2bel.gate2bel__field_types_value_0_4,
		null,
		null,
		null);
    //
    gate2bel__du_functor_desc_value_0_5.init("empty",
		0,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		5,
		null,
		null,
		null,
		null);
    //
    gate2bel__du_stag_ordered_value_0_0[0] = gate2bel.gate2bel__du_functor_desc_value_0_5;
    gate2bel__du_stag_ordered_value_0_0[1] = gate2bel.gate2bel__du_functor_desc_value_0_0;
    gate2bel__du_stag_ordered_value_0_0[2] = gate2bel.gate2bel__du_functor_desc_value_0_1;
    gate2bel__du_stag_ordered_value_0_0[3] = gate2bel.gate2bel__du_functor_desc_value_0_2;
    gate2bel__du_stag_ordered_value_0_0[4] = gate2bel.gate2bel__du_functor_desc_value_0_3;
    gate2bel__du_stag_ordered_value_0_0[5] = gate2bel.gate2bel__du_functor_desc_value_0_4;
    //
    gate2bel__du_ptag_ordered_value_0[0] = new jmercury.runtime.DuPtagLayout(6,
		private_builtin.MR_SECTAG_REMOTE,
		gate2bel.gate2bel__du_stag_ordered_value_0_0);
    //
    gate2bel__du_name_ordered_value_0[0] = gate2bel.gate2bel__du_functor_desc_value_0_2;
    gate2bel__du_name_ordered_value_0[1] = gate2bel.gate2bel__du_functor_desc_value_0_3;
    gate2bel__du_name_ordered_value_0[2] = gate2bel.gate2bel__du_functor_desc_value_0_4;
    gate2bel__du_name_ordered_value_0[3] = gate2bel.gate2bel__du_functor_desc_value_0_5;
    gate2bel__du_name_ordered_value_0[4] = gate2bel.gate2bel__du_functor_desc_value_0_0;
    gate2bel__du_name_ordered_value_0[5] = gate2bel.gate2bel__du_functor_desc_value_0_1;
    //
    gate2bel__functor_number_map_value_0[0] = 4;
    gate2bel__functor_number_map_value_0[1] = 5;
    gate2bel__functor_number_map_value_0[2] = 0;
    gate2bel__functor_number_map_value_0[3] = 1;
    gate2bel__functor_number_map_value_0[4] = 2;
    gate2bel__functor_number_map_value_0[5] = 3;
    //
    gate2bel__type_ctor_info_value_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(66))),
		((java.lang.Object) (new AddrOf2_0(67))),
		"gate2bel",
		"value",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_value_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_value_0),
		6,
		4,
		gate2bel.gate2bel__functor_number_map_value_0);
    //
    //
    gate2bel__field_types_value2_0_0[0] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_str2_0;
    //
    gate2bel__du_functor_desc_value2_0_0.init("str",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		1,
		0,
		gate2bel.gate2bel__field_types_value2_0_0,
		null,
		null,
		null);
    //
    list__ti_list_1gate2bel__type_ctor_info_str2_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_str2_0)});
    //
    gate2bel__field_types_value2_0_1[0] = (jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1gate2bel__type_ctor_info_str2_0;
    //
    gate2bel__du_functor_desc_value2_0_1.init("strs",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		2,
		1,
		gate2bel.gate2bel__field_types_value2_0_1,
		null,
		null,
		null);
    //
    gate2bel__field_types_value2_0_2[0] = (jmercury.runtime.PseudoTypeInfo) gate2bel.pair__ti_pair_2gate2bel__type_ctor_info_reftype_0builtin__type_ctor_info_int_0;
    //
    gate2bel__du_functor_desc_value2_0_2.init("coref",
		1,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		3,
		2,
		gate2bel.gate2bel__field_types_value2_0_2,
		null,
		null,
		null);
    //
    gate2bel__field_types_value2_0_3[0] = (jmercury.runtime.PseudoTypeInfo) gate2bel.gate2bel__type_ctor_info_str2_0;
    gate2bel__field_types_value2_0_3[1] = (jmercury.runtime.PseudoTypeInfo) gate2bel.pair__ti_pair_2gate2bel__type_ctor_info_reftype_0builtin__type_ctor_info_int_0;
    //
    gate2bel__du_functor_desc_value2_0_3.init("coref",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		4,
		3,
		gate2bel.gate2bel__field_types_value2_0_3,
		null,
		null,
		null);
    //
    gate2bel__field_types_value2_0_4[0] = (jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1gate2bel__type_ctor_info_str2_0;
    gate2bel__field_types_value2_0_4[1] = (jmercury.runtime.PseudoTypeInfo) gate2bel.pair__ti_pair_2gate2bel__type_ctor_info_reftype_0builtin__type_ctor_info_int_0;
    //
    gate2bel__du_functor_desc_value2_0_4.init("corefs",
		2,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		5,
		4,
		gate2bel.gate2bel__field_types_value2_0_4,
		null,
		null,
		null);
    //
    gate2bel__du_functor_desc_value2_0_5.init("empty",
		0,
		0,
		private_builtin.MR_SECTAG_REMOTE,
		0,
		0,
		5,
		null,
		null,
		null,
		null);
    //
    gate2bel__du_stag_ordered_value2_0_0[0] = gate2bel.gate2bel__du_functor_desc_value2_0_5;
    gate2bel__du_stag_ordered_value2_0_0[1] = gate2bel.gate2bel__du_functor_desc_value2_0_0;
    gate2bel__du_stag_ordered_value2_0_0[2] = gate2bel.gate2bel__du_functor_desc_value2_0_1;
    gate2bel__du_stag_ordered_value2_0_0[3] = gate2bel.gate2bel__du_functor_desc_value2_0_2;
    gate2bel__du_stag_ordered_value2_0_0[4] = gate2bel.gate2bel__du_functor_desc_value2_0_3;
    gate2bel__du_stag_ordered_value2_0_0[5] = gate2bel.gate2bel__du_functor_desc_value2_0_4;
    //
    gate2bel__du_ptag_ordered_value2_0[0] = new jmercury.runtime.DuPtagLayout(6,
		private_builtin.MR_SECTAG_REMOTE,
		gate2bel.gate2bel__du_stag_ordered_value2_0_0);
    //
    gate2bel__du_name_ordered_value2_0[0] = gate2bel.gate2bel__du_functor_desc_value2_0_2;
    gate2bel__du_name_ordered_value2_0[1] = gate2bel.gate2bel__du_functor_desc_value2_0_3;
    gate2bel__du_name_ordered_value2_0[2] = gate2bel.gate2bel__du_functor_desc_value2_0_4;
    gate2bel__du_name_ordered_value2_0[3] = gate2bel.gate2bel__du_functor_desc_value2_0_5;
    gate2bel__du_name_ordered_value2_0[4] = gate2bel.gate2bel__du_functor_desc_value2_0_0;
    gate2bel__du_name_ordered_value2_0[5] = gate2bel.gate2bel__du_functor_desc_value2_0_1;
    //
    gate2bel__functor_number_map_value2_0[0] = 4;
    gate2bel__functor_number_map_value2_0[1] = 5;
    gate2bel__functor_number_map_value2_0[2] = 0;
    gate2bel__functor_number_map_value2_0[3] = 1;
    gate2bel__functor_number_map_value2_0[4] = 2;
    gate2bel__functor_number_map_value2_0[5] = 3;
    //
    gate2bel__type_ctor_info_value2_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(68))),
		((java.lang.Object) (new AddrOf2_0(69))),
		"gate2bel",
		"value2",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_value2_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_value2_0),
		6,
		4,
		gate2bel.gate2bel__functor_number_map_value2_0);
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
		jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.list__ti_list_1builtin__type_ctor_info_int_0)});
    //
    gate2bel__field_types_vertices_0_0[0] = (jmercury.runtime.PseudoTypeInfo) gate2bel.set_ordlist__ti_set_ordlist_1builtin__type_ctor_info_int_0;
    gate2bel__field_types_vertices_0_0[1] = (jmercury.runtime.PseudoTypeInfo) gate2bel.set_ordlist__ti_set_ordlist_1builtin__type_ctor_info_int_0;
    gate2bel__field_types_vertices_0_0[2] = (jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1builtin__type_ctor_info_int_0;
    gate2bel__field_types_vertices_0_0[3] = (jmercury.runtime.PseudoTypeInfo) gate2bel.list__ti_list_1list__ti_list_1builtin__type_ctor_info_int_0;
    //
    gate2bel__du_functor_desc_vertices_0_0.init("vs",
		4,
		0,
		private_builtin.MR_SECTAG_NONE,
		0,
		-1,
		0,
		gate2bel.gate2bel__field_types_vertices_0_0,
		null,
		null,
		null);
    //
    gate2bel__du_stag_ordered_vertices_0_0[0] = gate2bel.gate2bel__du_functor_desc_vertices_0_0;
    //
    gate2bel__du_ptag_ordered_vertices_0[0] = new jmercury.runtime.DuPtagLayout(1,
		private_builtin.MR_SECTAG_NONE,
		gate2bel.gate2bel__du_stag_ordered_vertices_0_0);
    //
    gate2bel__du_name_ordered_vertices_0[0] = gate2bel.gate2bel__du_functor_desc_vertices_0_0;
    //
    gate2bel__functor_number_map_vertices_0[0] = 0;
    //
    gate2bel__type_ctor_info_vertices_0.init(0,
		15,
		1,
		private_builtin.MR_TYPECTOR_REP_DU,
		((java.lang.Object) (new AddrOf2_0(70))),
		((java.lang.Object) (new AddrOf2_0(71))),
		"gate2bel",
		"vertices",
		new jmercury.runtime.TypeFunctors(gate2bel.gate2bel__du_name_ordered_vertices_0),
		new jmercury.runtime.TypeLayout(gate2bel.gate2bel__du_ptag_ordered_vertices_0),
		1,
		4,
		gate2bel.gate2bel__functor_number_map_vertices_0);
    //
    gate2bel__type_ctor_info_wmap_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_EQUIV_GROUND,
		((java.lang.Object) (new AddrOf2_0(72))),
		((java.lang.Object) (new AddrOf2_0(73))),
		"gate2bel",
		"wmap",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout((jmercury.runtime.PseudoTypeInfo) gate2bel.tree234__ti_tree234_2builtin__type_ctor_info_int_0list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_cword_0gate2bel__type_ctor_info_reftype_0),
		-1,
		0,
		null);
  }

// DataDefns
  static {
  }

// Scalar common data
  private static final jmercury.runtime.TypeInfo_Struct[] MR_scalar_common_1 = new jmercury.runtime.TypeInfo_Struct[37];
  private static final io.Posn_0[] MR_scalar_common_2 = new io.Posn_0[1];
  private static final list.List_1.F_nil_0[] MR_scalar_common_3 = new list.List_1.F_nil_0[1];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_4 = new /* generic_type */ java.lang.Object[4][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_5 = new /* generic_type */ java.lang.Object[6][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_6 = new /* generic_type */ java.lang.Object[13][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_7 = new /* generic_type */ java.lang.Object[3][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_8 = new /* generic_type */ java.lang.Object[6][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_9 = new /* generic_type */ java.lang.Object[5][];
  private static final maybe.Maybe_1.No_0[] MR_scalar_common_10 = new maybe.Maybe_1.No_0[1];
  private static final gate2bel.Cstring_0.Empty_0[] MR_scalar_common_11 = new gate2bel.Cstring_0.Empty_0[1];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_12 = new /* generic_type */ java.lang.Object[2][];
  private static final beliefs.Bstrtp_0.Unrecognised_0[] MR_scalar_common_13 = new beliefs.Bstrtp_0.Unrecognised_0[1];
  private static final beliefs.Bstrtp_0.Wordnet_0[] MR_scalar_common_14 = new beliefs.Bstrtp_0.Wordnet_0[1];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_15 = new /* generic_type */ java.lang.Object[1][];
  private static final gate2bel.Tmpagt_0.P1_0[] MR_scalar_common_16 = new gate2bel.Tmpagt_0.P1_0[1];
  private static final gate2bel.Tmpagt_0.P2_0[] MR_scalar_common_17 = new gate2bel.Tmpagt_0.P2_0[1];
  private static final maybe.Maybe_1.Yes_1[] MR_scalar_common_18 = new maybe.Maybe_1.Yes_1[1];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_19 = new /* generic_type */ java.lang.Object[1][];
  private static final beliefs.Bstrtp_0.Coref_0[] MR_scalar_common_20 = new beliefs.Bstrtp_0.Coref_0[1];
  private static final beliefs.Bstrtp_0.Pp_0[] MR_scalar_common_21 = new beliefs.Bstrtp_0.Pp_0[1];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_22 = new /* generic_type */ java.lang.Object[4][];
  private static final gate2bel.Value2_0.Empty_0[] MR_scalar_common_23 = new gate2bel.Value2_0.Empty_0[1];
  private static final gate2bel.Cvalue_0.Lit_1[] MR_scalar_common_24 = new gate2bel.Cvalue_0.Lit_1[1];
  private static final list.List_1.F_cons_2[] MR_scalar_common_25 = new list.List_1.F_cons_2[2];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_26 = new /* generic_type */ java.lang.Object[1][];
  private static final gate2bel.Strtype_0.Wordnet_0[] MR_scalar_common_27 = new gate2bel.Strtype_0.Wordnet_0[1];
  private static final gate2bel.Strtype_0.Unrecognised_0[] MR_scalar_common_28 = new gate2bel.Strtype_0.Unrecognised_0[1];
  private static final sberrs.Error_0.Funny_pred_0[] MR_scalar_common_29 = new sberrs.Error_0.Funny_pred_0[1];
  private static final gate2bel.Strtype_0.Pp_0[] MR_scalar_common_30 = new gate2bel.Strtype_0.Pp_0[1];
  private static final gate2bel.Owlstrtp_0.Pp_0[] MR_scalar_common_31 = new gate2bel.Owlstrtp_0.Pp_0[1];
  private static final gate2bel.Owlstrtp_0.Unrecognised_0[] MR_scalar_common_32 = new gate2bel.Owlstrtp_0.Unrecognised_0[1];
  private static final gate2bel.Owlstrtp_0.Wordnet_0[] MR_scalar_common_33 = new gate2bel.Owlstrtp_0.Wordnet_0[1];
  private static void MR_init_scalars_0() {
    MR_scalar_common_1[0] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(errors.errors__type_ctor_info_messages_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0))));
    MR_scalar_common_1[1] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_owltriple_0))));
    MR_scalar_common_1[2] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_lndata_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))));
    MR_scalar_common_1[3] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(tree234.tree234__type_ctor_info_tree234_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[1]))));
    MR_scalar_common_1[4] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[2]))));
    MR_scalar_common_1[5] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(tree234.tree234__type_ctor_info_tree234_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[4]))));
    MR_scalar_common_1[6] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_owlstmnt_0))));
    MR_scalar_common_1[7] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(set_ordlist.set_ordlist__type_ctor_info_set_ordlist_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0))));
    MR_scalar_common_1[8] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_envmod_0))));
    MR_scalar_common_1[9] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_envtriple_0))));
    MR_scalar_common_1[10] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(tree234.tree234__type_ctor_info_tree234_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[8]))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[9]))));
    MR_scalar_common_1[11] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_triple3_0))));
    MR_scalar_common_1[12] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_cvalue_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_cvalue_0))));
    MR_scalar_common_1[13] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_tmpmod_0))));
    MR_scalar_common_1[14] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[8]))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_envtriple_0))));
    MR_scalar_common_1[15] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))));
    MR_scalar_common_1[16] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))));
    MR_scalar_common_1[17] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_cword_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_reftype_0))));
    MR_scalar_common_1[18] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[17]))));
    MR_scalar_common_1[19] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[18]))));
    MR_scalar_common_1[20] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0))));
    MR_scalar_common_1[21] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(tree234.tree234__type_ctor_info_tree234_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[20]))));
    MR_scalar_common_1[22] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(tree234.tree234__type_ctor_info_tree234_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[18]))));
    MR_scalar_common_1[23] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_dact_0))));
    MR_scalar_common_1[24] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_triple_0))));
    MR_scalar_common_1[25] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_triple2_0))));
    MR_scalar_common_1[26] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(tree234.tree234__type_ctor_info_tree234_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0))));
    MR_scalar_common_1[27] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(pair.pair__type_ctor_info_pair_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_reftype_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))));
    MR_scalar_common_1[28] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_lndata_0))));
    MR_scalar_common_1[29] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(maybe.maybe__type_ctor_info_maybe_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_owlstr_0))));
    MR_scalar_common_1[30] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_chunk_0))));
    MR_scalar_common_1[31] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_chunk2_0))));
    MR_scalar_common_1[32] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_chunk3_0))));
    MR_scalar_common_1[33] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(maybe.maybe__type_ctor_info_maybe_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))));
    MR_scalar_common_1[34] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_str2_0))));
    MR_scalar_common_1[35] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(set_ordlist.set_ordlist__type_ctor_info_set_ordlist_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))));
    MR_scalar_common_1[36] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(list.list__type_ctor_info_list_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[15]))));
    MR_scalar_common_2[0] = new io.Posn_0(0,
		0,
		0);
    MR_scalar_common_3[0] = new list.List_1.F_nil_0();
    MR_scalar_common_4[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(6),
		((java.lang.Object) (gate2bel.maybe__pti_maybe_1__plain_wordnet__type_ctor_info_wndata_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_chunk_0)),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_chunk2_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_4[1] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(6),
		((java.lang.Object) (gate2bel.maybe__pti_maybe_1__plain_wordnet__type_ctor_info_wndata_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_triple_0)),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_triple2_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_4[2] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(6),
		((java.lang.Object) (gate2bel.maybe__pti_maybe_1__plain_wordnet__type_ctor_info_wndata_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_str2_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_4[3] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(6),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_triple2_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_gate2bel__type_ctor_info_triple3_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_gate2bel__type_ctor_info_triple3_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_5[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(3),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_chunk2_0)),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_cmaps_0)),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_cmaps_0))};
    MR_scalar_common_5[1] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(3),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_gate2bel__type_ctor_info_cvalue_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_gate2bel__type_ctor_info_cvalue_0)),
		((java.lang.Object) (gate2bel.pair__pti_pair_2__plain_gate2bel__type_ctor_info_cvalue_0__plain_gate2bel__type_ctor_info_cvalue_0))};
    MR_scalar_common_5[2] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(3),
		((java.lang.Object) (gate2bel.pair__pti_pair_2__plain_list__ti_list_1beliefs__type_ctor_info_envmod_0__plain_beliefs__type_ctor_info_envtriple_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_list__ti_list_1beliefs__type_ctor_info_envmod_0__plain_list__ti_list_1beliefs__type_ctor_info_envtriple_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_list__ti_list_1beliefs__type_ctor_info_envmod_0__plain_list__ti_list_1beliefs__type_ctor_info_envtriple_0))};
    MR_scalar_common_5[3] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(3),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_cstring_0)),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_cvalue_0))};
    MR_scalar_common_5[4] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(3),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_triple2_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_cword_0gate2bel__type_ctor_info_reftype_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_cword_0gate2bel__type_ctor_info_reftype_0))};
    MR_scalar_common_5[5] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(3),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_owltriple_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_gate2bel__type_ctor_info_owlstmnt_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_gate2bel__type_ctor_info_owlstmnt_0))};
    MR_scalar_common_6[0] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (gate2bel.MR_scalar_common_5[0])),
		((java.lang.Object) (new AddrOf3_0(14))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_7[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(5),
		((java.lang.Object) (gate2bel.pair__pti_pair_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_cword_0gate2bel__type_ctor_info_reftype_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_builtin__type_ctor_info_int_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_builtin__type_ctor_info_int_0))};
    MR_scalar_common_6[1] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (gate2bel.MR_scalar_common_7[0])),
		((java.lang.Object) (new AddrOf4_0(6))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_7[1] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(5),
		((java.lang.Object) (beliefs.beliefs__type_ctor_info_belfile_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_list__ti_list_1beliefs__type_ctor_info_envmod_0__plain_list__ti_list_1beliefs__type_ctor_info_envtriple_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_list__ti_list_1beliefs__type_ctor_info_envmod_0__plain_list__ti_list_1beliefs__type_ctor_info_envtriple_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_6[2] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (gate2bel.MR_scalar_common_7[1])),
		((java.lang.Object) (new AddrOf4_0(7))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_6[3] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (gate2bel.MR_scalar_common_5[2])),
		((java.lang.Object) (new AddrOf3_0(15))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_22[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(2),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0))};
    MR_scalar_common_6[4] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (gate2bel.MR_scalar_common_22[0])),
		((java.lang.Object) (new AddrOf2_0(87))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_6[5] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (gate2bel.MR_scalar_common_22[0])),
		((java.lang.Object) (new AddrOf2_0(88))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_22[1] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(2),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_cstring_0)),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_cvalue_0))};
    MR_scalar_common_6[6] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (gate2bel.MR_scalar_common_22[1])),
		((java.lang.Object) (new AddrOf2_0(89))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_26[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(1),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0))};
    MR_scalar_common_6[7] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (gate2bel.MR_scalar_common_26[0])),
		((java.lang.Object) (new AddrOf2_0(90))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_6[8] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (gate2bel.MR_scalar_common_26[0])),
		((java.lang.Object) (new AddrOf2_0(91))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_22[2] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(2),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_str2_0)),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_cstring_0))};
    MR_scalar_common_6[9] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (gate2bel.MR_scalar_common_22[2])),
		((java.lang.Object) (new AddrOf2_0(92))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_6[10] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (gate2bel.MR_scalar_common_5[4])),
		((java.lang.Object) (new AddrOf3_0(16))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_22[3] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(2),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_str2_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0))};
    MR_scalar_common_6[11] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (gate2bel.MR_scalar_common_22[3])),
		((java.lang.Object) (new AddrOf2_0(93))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_6[12] = new /* generic_type */ java.lang.Object[] {
		((java.lang.Object) (gate2bel.MR_scalar_common_5[5])),
		((java.lang.Object) (new AddrOf3_0(17))),
		java.lang.Integer.valueOf(0)};
    MR_scalar_common_7[2] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(5),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (bool.bool__type_ctor_info_bool_0)),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_cstring_0)),
		((java.lang.Object) (gate2bel.pair__pti_pair_2__plain_gate2bel__type_ctor_info_cvalue_0__plain_gate2bel__type_ctor_info_cvalue_0)),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_triple3_0))};
    MR_scalar_common_8[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(8),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_chunk3_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1gate2bel__type_ctor_info_owltriple_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1gate2bel__type_ctor_info_owltriple_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_lndata_0builtin__type_ctor_info_int_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_lndata_0builtin__type_ctor_info_int_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_8[1] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(8),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_string_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_owlstmnt_0)),
		((java.lang.Object) (beliefs.beliefs__type_ctor_info_belstmnt_0)),
		((java.lang.Object) (gate2bel.set_ordlist__pti_set_ordlist_1__plain_builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.set_ordlist__pti_set_ordlist_1__plain_builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_8[2] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(8),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_string_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_lndata_0)),
		((java.lang.Object) (beliefs.beliefs__type_ctor_info_belmod_0)),
		((java.lang.Object) (gate2bel.set_ordlist__pti_set_ordlist_1__plain_builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.set_ordlist__pti_set_ordlist_1__plain_builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_8[3] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(8),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_pair__ti_pair_2builtin__type_ctor_info_string_0builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_string_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_owltriple_0)),
		((java.lang.Object) (beliefs.beliefs__type_ctor_info_beltriple_0)),
		((java.lang.Object) (gate2bel.set_ordlist__pti_set_ordlist_1__plain_builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.set_ordlist__pti_set_ordlist_1__plain_builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_8[4] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(8),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.set_ordlist__pti_set_ordlist_1__plain_builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_gate2bel__type_ctor_info_tmpmod_0)),
		((java.lang.Object) (beliefs.beliefs__type_ctor_info_beltriple_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_list__ti_list_1beliefs__type_ctor_info_envmod_0__plain_list__ti_list_1beliefs__type_ctor_info_envtriple_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_list__ti_list_1beliefs__type_ctor_info_envmod_0__plain_list__ti_list_1beliefs__type_ctor_info_envtriple_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_8[5] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(8),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (beliefs.beliefs__type_ctor_info_belmod_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_gate2bel__type_ctor_info_tmpmod_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_gate2bel__type_ctor_info_tmpmod_0)),
		((java.lang.Object) (bool.bool__type_ctor_info_bool_0)),
		((java.lang.Object) (bool.bool__type_ctor_info_bool_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_9[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(4),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1gate2bel__type_ctor_info_owltriple_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_gate2bel__type_ctor_info_owlstmnt_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_gate2bel__type_ctor_info_owlstmnt_0))};
    MR_scalar_common_9[1] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(4),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_lndata_0builtin__type_ctor_info_int_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_vertices_0)),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_vertices_0))};
    MR_scalar_common_9[2] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(4),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.set_ordlist__pti_set_ordlist_1__plain_builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_gate2bel__type_ctor_info_tmpmod_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_beliefs__type_ctor_info_envmod_0))};
    MR_scalar_common_9[3] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(4),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (gate2bel.pair__pti_pair_2__plain_gate2bel__type_ctor_info_cword_0__plain_gate2bel__type_ctor_info_reftype_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1builtin__type_ctor_info_string_0))};
    MR_scalar_common_9[4] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(4),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1builtin__type_ctor_info_string_0))};
    MR_scalar_common_10[0] = new maybe.Maybe_1.No_0();
    MR_scalar_common_11[0] = new gate2bel.Cstring_0.Empty_0();
    MR_scalar_common_12[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(10),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_triple3_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1gate2bel__type_ctor_info_owltriple_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1gate2bel__type_ctor_info_owltriple_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_lndata_0builtin__type_ctor_info_int_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_lndata_0builtin__type_ctor_info_int_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_12[1] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(10),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.set_ordlist__pti_set_ordlist_1__plain_builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_gate2bel__type_ctor_info_tmpmod_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_tmpagt_0)),
		((java.lang.Object) (bool.bool__type_ctor_info_bool_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.maybe__pti_maybe_1__plain_gate2bel__type_ctor_info_tmpagt_0)),
		((java.lang.Object) (gate2bel.pair__pti_pair_2__plain_list__ti_list_1beliefs__type_ctor_info_envmod_0__plain_beliefs__type_ctor_info_envtriple_0))};
    MR_scalar_common_13[0] = new beliefs.Bstrtp_0.Unrecognised_0();
    MR_scalar_common_14[0] = new beliefs.Bstrtp_0.Wordnet_0();
    MR_scalar_common_15[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(7),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.set_ordlist__pti_set_ordlist_1__plain_builtin__type_ctor_info_string_0)),
		((java.lang.Object) (beliefs.beliefs__type_ctor_info_belstmnt_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_list__ti_list_1beliefs__type_ctor_info_envmod_0__plain_list__ti_list_1beliefs__type_ctor_info_envtriple_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_list__ti_list_1beliefs__type_ctor_info_envmod_0__plain_list__ti_list_1beliefs__type_ctor_info_envtriple_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_16[0] = new gate2bel.Tmpagt_0.P1_0();
    MR_scalar_common_17[0] = new gate2bel.Tmpagt_0.P2_0();
    MR_scalar_common_18[0] = new maybe.Maybe_1.Yes_1(((java.lang.Object) ((maybe.Maybe_1) gate2bel.MR_scalar_common_10[0])));
    MR_scalar_common_19[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(12),
		((java.lang.Object) (builtin.builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1gate2bel__type_ctor_info_owltriple_0)),
		((java.lang.Object) (gate2bel.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_list__ti_list_1pair__ti_pair_2gate2bel__type_ctor_info_lndata_0builtin__type_ctor_info_int_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_gate2bel__type_ctor_info_lndata_0)),
		((java.lang.Object) (gate2bel.set_ordlist__pti_set_ordlist_1__plain_builtin__type_ctor_info_int_0)),
		((java.lang.Object) (gate2bel.pair__pti_pair_2__plain_gate2bel__type_ctor_info_lndata_0__plain_builtin__type_ctor_info_int_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_builtin__type_ctor_info_int_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_builtin__type_ctor_info_int_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_gate2bel__type_ctor_info_owlstmnt_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_gate2bel__type_ctor_info_owlstmnt_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (gate2bel.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_20[0] = new beliefs.Bstrtp_0.Coref_0();
    MR_scalar_common_21[0] = new beliefs.Bstrtp_0.Pp_0();
    MR_scalar_common_23[0] = new gate2bel.Value2_0.Empty_0();
    MR_scalar_common_24[0] = new gate2bel.Cvalue_0.Lit_1((gate2bel.Cstring_0) gate2bel.MR_scalar_common_11[0]);
    MR_scalar_common_25[0] = new list.List_1.F_cons_2(((java.lang.Object) ((gate2bel.Cvalue_0) gate2bel.MR_scalar_common_24[0])),
		(list.List_1) gate2bel.MR_scalar_common_3[0]);
    MR_scalar_common_25[1] = new list.List_1.F_cons_2(((java.lang.Object) ((gate2bel.Cstring_0) gate2bel.MR_scalar_common_11[0])),
		(list.List_1) gate2bel.MR_scalar_common_3[0]);
    MR_scalar_common_27[0] = new gate2bel.Strtype_0.Wordnet_0();
    MR_scalar_common_28[0] = new gate2bel.Strtype_0.Unrecognised_0();
    MR_scalar_common_29[0] = new sberrs.Error_0.Funny_pred_0();
    MR_scalar_common_30[0] = new gate2bel.Strtype_0.Pp_0();
    MR_scalar_common_31[0] = new gate2bel.Owlstrtp_0.Pp_0();
    MR_scalar_common_32[0] = new gate2bel.Owlstrtp_0.Unrecognised_0();
    MR_scalar_common_33[0] = new gate2bel.Owlstrtp_0.Wordnet_0();
  }
  static {
    MR_init_scalars_0();
  }

// Vector common data

// NonDataDefns
  private static boolean __Unify____chmap_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____chmap_0_0(((tree234.Tree234_2) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____chmap_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____chmap_0_0(((tree234.Tree234_2) wrapper_arg_2), ((tree234.Tree234_2) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____chunk_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____chunk_0_0(((gate2bel.Chunk_0) wrapper_arg_1), ((gate2bel.Chunk_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____chunk_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____chunk_0_0(((gate2bel.Chunk_0) wrapper_arg_2), ((gate2bel.Chunk_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____chunk2_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____chunk2_0_0(((gate2bel.Chunk2_0) wrapper_arg_1), ((gate2bel.Chunk2_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____chunk2_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____chunk2_0_0(((gate2bel.Chunk2_0) wrapper_arg_2), ((gate2bel.Chunk2_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____chunk3_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____chunk3_0_0(((gate2bel.Chunk3_0) wrapper_arg_1), ((gate2bel.Chunk3_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____chunk3_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____chunk3_0_0(((gate2bel.Chunk3_0) wrapper_arg_2), ((gate2bel.Chunk3_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____cid_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____cid_0_0(((java.lang.Integer) wrapper_arg_1).intValue(), ((java.lang.Integer) wrapper_arg_2).intValue());
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____cid_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____cid_0_0(((java.lang.Integer) wrapper_arg_2).intValue(), ((java.lang.Integer) wrapper_arg_3).intValue());
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____cmaps_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____cmaps_0_0(((gate2bel.Cmaps_0) wrapper_arg_1), ((gate2bel.Cmaps_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____cmaps_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____cmaps_0_0(((gate2bel.Cmaps_0) wrapper_arg_2), ((gate2bel.Cmaps_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____corefpair_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____corefpair_0_0(((pair.Pair_2) wrapper_arg_1), ((pair.Pair_2) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____corefpair_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____corefpair_0_0(((pair.Pair_2) wrapper_arg_2), ((pair.Pair_2) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____cstring_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____cstring_0_0(((gate2bel.Cstring_0) wrapper_arg_1), ((gate2bel.Cstring_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____cstring_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____cstring_0_0(((gate2bel.Cstring_0) wrapper_arg_2), ((gate2bel.Cstring_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____cvalue_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____cvalue_0_0(((gate2bel.Cvalue_0) wrapper_arg_1), ((gate2bel.Cvalue_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____cvalue_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____cvalue_0_0(((gate2bel.Cvalue_0) wrapper_arg_2), ((gate2bel.Cvalue_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____cword_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____cword_0_0(((gate2bel.Cword_0) wrapper_arg_1), ((gate2bel.Cword_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____cword_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____cword_0_0(((gate2bel.Cword_0) wrapper_arg_2), ((gate2bel.Cword_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____dact_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____dact_0_0(((gate2bel.Dact_0) wrapper_arg_1), ((gate2bel.Dact_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____dact_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____dact_0_0(((gate2bel.Dact_0) wrapper_arg_2), ((gate2bel.Dact_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____lndata_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____lndata_0_0(((gate2bel.Lndata_0) wrapper_arg_1), ((gate2bel.Lndata_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____lndata_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____lndata_0_0(((gate2bel.Lndata_0) wrapper_arg_2), ((gate2bel.Lndata_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____lnmap_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____lnmap_0_0(((tree234.Tree234_2) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____lnmap_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____lnmap_0_0(((tree234.Tree234_2) wrapper_arg_2), ((tree234.Tree234_2) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____owlfile_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____owlfile_0_0(((gate2bel.Owlfile_0) wrapper_arg_1), ((gate2bel.Owlfile_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____owlfile_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____owlfile_0_0(((gate2bel.Owlfile_0) wrapper_arg_2), ((gate2bel.Owlfile_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____owlpr_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____owlpr_0_0(((gate2bel.Owlpr_0) wrapper_arg_1), ((gate2bel.Owlpr_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____owlpr_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____owlpr_0_0(((gate2bel.Owlpr_0) wrapper_arg_2), ((gate2bel.Owlpr_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____owlprtp_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____owlprtp_0_0(((gate2bel.Owlprtp_0) wrapper_arg_1), ((gate2bel.Owlprtp_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____owlprtp_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____owlprtp_0_0(((gate2bel.Owlprtp_0) wrapper_arg_2), ((gate2bel.Owlprtp_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____owlstmnt_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____owlstmnt_0_0(((gate2bel.Owlstmnt_0) wrapper_arg_1), ((gate2bel.Owlstmnt_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____owlstmnt_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____owlstmnt_0_0(((gate2bel.Owlstmnt_0) wrapper_arg_2), ((gate2bel.Owlstmnt_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____owlstr_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____owlstr_0_0(((gate2bel.Owlstr_0) wrapper_arg_1), ((gate2bel.Owlstr_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____owlstr_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____owlstr_0_0(((gate2bel.Owlstr_0) wrapper_arg_2), ((gate2bel.Owlstr_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____owlstrtp_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____owlstrtp_0_0(((gate2bel.Owlstrtp_0) wrapper_arg_1), ((gate2bel.Owlstrtp_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____owlstrtp_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____owlstrtp_0_0(((gate2bel.Owlstrtp_0) wrapper_arg_2), ((gate2bel.Owlstrtp_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____owltriple_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____owltriple_0_0(((gate2bel.Owltriple_0) wrapper_arg_1), ((gate2bel.Owltriple_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____owltriple_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____owltriple_0_0(((gate2bel.Owltriple_0) wrapper_arg_2), ((gate2bel.Owltriple_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____reftype_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____reftype_0_0(((gate2bel.Reftype_0) wrapper_arg_1), ((gate2bel.Reftype_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____reftype_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____reftype_0_0(((gate2bel.Reftype_0) wrapper_arg_2), ((gate2bel.Reftype_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____str2_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____str2_0_0(((gate2bel.Str2_0) wrapper_arg_1), ((gate2bel.Str2_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____str2_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____str2_0_0(((gate2bel.Str2_0) wrapper_arg_2), ((gate2bel.Str2_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____strtype_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____strtype_0_0(((gate2bel.Strtype_0) wrapper_arg_1), ((gate2bel.Strtype_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____strtype_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____strtype_0_0(((gate2bel.Strtype_0) wrapper_arg_2), ((gate2bel.Strtype_0) wrapper_arg_3));
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
        succeeded = gate2bel.__Unify____tid_0_0(((java.lang.Integer) wrapper_arg_1).intValue(), ((java.lang.Integer) wrapper_arg_2).intValue());
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
        conv0_HeadVar__1_1 = gate2bel.__Compare____tid_0_0(((java.lang.Integer) wrapper_arg_2).intValue(), ((java.lang.Integer) wrapper_arg_3).intValue());
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____tmpagt_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____tmpagt_0_0(((gate2bel.Tmpagt_0) wrapper_arg_1), ((gate2bel.Tmpagt_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____tmpagt_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____tmpagt_0_0(((gate2bel.Tmpagt_0) wrapper_arg_2), ((gate2bel.Tmpagt_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____tmpmod_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____tmpmod_0_0(((gate2bel.Tmpmod_0) wrapper_arg_1), ((gate2bel.Tmpmod_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____tmpmod_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____tmpmod_0_0(((gate2bel.Tmpmod_0) wrapper_arg_2), ((gate2bel.Tmpmod_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____tnfile_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____tnfile_0_0(((gate2bel.Tnfile_0) wrapper_arg_1), ((gate2bel.Tnfile_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____tnfile_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____tnfile_0_0(((gate2bel.Tnfile_0) wrapper_arg_2), ((gate2bel.Tnfile_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____tnfile2_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____tnfile2_0_0(((gate2bel.Tnfile2_0) wrapper_arg_1), ((gate2bel.Tnfile2_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____tnfile2_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____tnfile2_0_0(((gate2bel.Tnfile2_0) wrapper_arg_2), ((gate2bel.Tnfile2_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____tnfile3_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____tnfile3_0_0(((gate2bel.Tnfile3_0) wrapper_arg_1), ((gate2bel.Tnfile3_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____tnfile3_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____tnfile3_0_0(((gate2bel.Tnfile3_0) wrapper_arg_2), ((gate2bel.Tnfile3_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____trid_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____trid_0_0(((java.lang.Integer) wrapper_arg_1).intValue(), ((java.lang.Integer) wrapper_arg_2).intValue());
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____trid_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____trid_0_0(((java.lang.Integer) wrapper_arg_2).intValue(), ((java.lang.Integer) wrapper_arg_3).intValue());
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____triple_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____triple_0_0(((gate2bel.Triple_0) wrapper_arg_1), ((gate2bel.Triple_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____triple_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____triple_0_0(((gate2bel.Triple_0) wrapper_arg_2), ((gate2bel.Triple_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____triple2_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____triple2_0_0(((gate2bel.Triple2_0) wrapper_arg_1), ((gate2bel.Triple2_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____triple2_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____triple2_0_0(((gate2bel.Triple2_0) wrapper_arg_2), ((gate2bel.Triple2_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____triple3_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____triple3_0_0(((gate2bel.Triple3_0) wrapper_arg_1), ((gate2bel.Triple3_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____triple3_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____triple3_0_0(((gate2bel.Triple3_0) wrapper_arg_2), ((gate2bel.Triple3_0) wrapper_arg_3));
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
        succeeded = gate2bel.__Unify____value_0_0(((gate2bel.Value_0) wrapper_arg_1), ((gate2bel.Value_0) wrapper_arg_2));
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
        conv0_HeadVar__1_1 = gate2bel.__Compare____value_0_0(((gate2bel.Value_0) wrapper_arg_2), ((gate2bel.Value_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____value2_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____value2_0_0(((gate2bel.Value2_0) wrapper_arg_1), ((gate2bel.Value2_0) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____value2_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____value2_0_0(((gate2bel.Value2_0) wrapper_arg_2), ((gate2bel.Value2_0) wrapper_arg_3));
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
        succeeded = gate2bel.__Unify____vertices_0_0(((gate2bel.Vertices_0) wrapper_arg_1), ((gate2bel.Vertices_0) wrapper_arg_2));
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
        conv0_HeadVar__1_1 = gate2bel.__Compare____vertices_0_0(((gate2bel.Vertices_0) wrapper_arg_2), ((gate2bel.Vertices_0) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____wmap_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = gate2bel.__Unify____wmap_0_0(((tree234.Tree234_2) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____wmap_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = gate2bel.__Compare____wmap_0_0(((tree234.Tree234_2) wrapper_arg_2), ((tree234.Tree234_2) wrapper_arg_3));
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
              return_value = gate2bel.__Unify____chmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 1:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____chmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 2:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____chunk_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 3:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____chunk_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 4:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____chunk2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 5:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____chunk2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 6:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____chunk3_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 7:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____chunk3_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 8:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____cid_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 9:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____cid_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 10:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____cmaps_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 11:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____cmaps_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 12:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____corefpair_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 13:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____corefpair_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 14:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____cstring_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 15:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____cstring_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 16:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____cvalue_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 17:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____cvalue_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 18:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____cword_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 19:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____cword_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 20:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____dact_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 21:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____dact_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 22:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____lndata_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 23:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____lndata_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 24:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____lnmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 25:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____lnmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 26:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____owlfile_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 27:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____owlfile_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 28:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____owlpr_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 29:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____owlpr_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 30:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____owlprtp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 31:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____owlprtp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 32:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____owlstmnt_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 33:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____owlstmnt_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 34:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____owlstr_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 35:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____owlstr_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 36:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____owlstrtp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 37:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____owlstrtp_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 38:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____owltriple_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 39:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____owltriple_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 40:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____reftype_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 41:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____reftype_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 42:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____str2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 43:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____str2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 44:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____strtype_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 45:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____strtype_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 46:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____tid_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 47:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____tid_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 48:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____tmpagt_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 49:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____tmpagt_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 50:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____tmpmod_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 51:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____tmpmod_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 52:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____tnfile_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 53:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____tnfile_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 54:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____tnfile2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 55:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____tnfile2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 56:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____tnfile3_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 57:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____tnfile3_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 58:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____trid_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 59:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____trid_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 60:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____triple_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 61:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____triple_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 62:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____triple2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 63:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____triple2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 64:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____triple3_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 65:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____triple3_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 66:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____value_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 67:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____value_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 68:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____value2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 69:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____value2_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 70:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____vertices_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 71:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____vertices_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 72:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.__Unify____wmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 73:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.__Compare____wmap_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 74:
          {
            /* generic_type */ java.lang.Object return_value = null;

            {
              gate2bel.IntroducedFrom__pred__conv_triple2__162__1_3_p_0_6(((java.lang.Object) arg1), ((/* env_ptr */ java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 75:
          {
            /* generic_type */ java.lang.Object return_value = null;

            {
              gate2bel.IntroducedFrom__pred__conv_triple2__162__1_3_p_0_3(((java.lang.Object) arg1), ((/* env_ptr */ java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 76:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.conv_val_5_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 77:
          {
            /* generic_type */ java.lang.Object return_value = null;

            {
              gate2bel.envpath_4_p_0_4(((list.List_1) arg1), ((/* env_ptr */ java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 78:
          {
            /* generic_type */ java.lang.Object return_value = null;

            {
              gate2bel.envpath_4_p_0_2(((java.lang.String) arg1), ((/* env_ptr */ java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 79:
          {
            /* generic_type */ java.lang.Object return_value = null;

            {
              gate2bel.agent_4_p_0_2(((java.lang.Object) arg1), ((/* env_ptr */ java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 80:
          {
            /* generic_type */ java.lang.Object return_value = null;

            {
              gate2bel.envtriple_10_p_0_7(((list.List_1) arg1), ((/* env_ptr */ java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 81:
          {
            /* generic_type */ java.lang.Object return_value = null;

            {
              gate2bel.envtriple_10_p_0_11(((java.lang.Object) arg1), ((/* env_ptr */ java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 82:
          {
            /* generic_type */ java.lang.Object return_value = null;

            {
              gate2bel.envtriple_10_p_0_5(((java.lang.String) arg1), ((/* env_ptr */ java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 83:
          {
            /* generic_type */ java.lang.Object return_value = null;

            {
              gate2bel.envtriple_10_p_0_2(((java.lang.String) arg1), ((/* env_ptr */ java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 84:
          {
            /* generic_type */ java.lang.Object return_value = null;

            {
              gate2bel.store_triple_8_p_0_2(((pair.Pair_2) arg1), ((/* env_ptr */ java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 85:
          {
            /* generic_type */ java.lang.Object return_value = null;

            {
              gate2bel.conv_triple2_6_p_0_2(((pair.Pair_2) arg1), ((/* env_ptr */ java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 86:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.conv_triple2_6_p_0_4(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 87:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = gate2bel.conv_value_5_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 88:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = gate2bel.conv_value_5_p_0_2(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 89:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.conv_val_5_p_0_2(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 90:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.conv_str_2_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 91:
          {
            boolean return_value = false;

            {
              return_value = gate2bel.conv_pred_7_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 92:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.conv_strings_5_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 93:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.value_coref_3_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2));
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
              return_value = gate2bel.IntroducedFrom__pred__word_corefs__555__1_4_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 1:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.word_corefs_5_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 2:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.tps_4_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 3:
          {
            /* generic_type */ java.lang.Object return_value = null;

            {
              gate2bel.envtriple_10_p_0_8(((/* generic_type */ java.lang.Object) arg1), ((jmercury.runtime.MethodPtr) arg2), ((/* env_ptr */ java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 4:
          {
            /* generic_type */ java.lang.Object return_value = null;

            {
              gate2bel.store_triple_8_p_0_3(((/* generic_type */ java.lang.Object) arg1), ((jmercury.runtime.MethodPtr) arg2), ((/* env_ptr */ java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 5:
          {
            /* generic_type */ java.lang.Object return_value = null;

            {
              gate2bel.conv_triple2_6_p_0_3(((/* generic_type */ java.lang.Object) arg1), ((jmercury.runtime.MethodPtr) arg2), ((/* env_ptr */ java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 6:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = gate2bel.conv_triple_6_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 7:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = gate2bel.conv_triple_6_p_0_2(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 8:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = gate2bel.conv_triple_6_p_0_3(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 9:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = gate2bel.conv_triple_6_p_0_4(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 10:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = gate2bel.conv_chunk_6_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 11:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.convert4_4_p_0_2(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 12:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.convert4_4_p_0_3(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 13:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = gate2bel.convert2_5_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 14:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.convert3_5_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 15:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.store_triple_8_p_0_4(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 16:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.chunk_coref_3_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 17:
          {
            java.lang.Object return_value = null;

            {
              return_value = gate2bel.IntroducedFrom__pred__convert4__174__1_4_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
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
              return_value = gate2bel.stmnt_envs_7_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4));
            }
            return ((java.lang.Object) (return_value));
          }
        case 1:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = gate2bel.file_envs_5_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4));
            }
            return ((java.lang.Object) (return_value));
          }
        case 2:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = gate2bel.conv_stmnt_8_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4));
            }
            return ((java.lang.Object) (return_value));
          }
        case 3:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = gate2bel.conv_stmnt_8_p_0_2(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4));
            }
            return ((java.lang.Object) (return_value));
          }
        case 4:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = gate2bel.conv_chunks_7_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4));
            }
            return ((java.lang.Object) (return_value));
          }
        case 5:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = gate2bel.convert5_5_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4));
            }
            return ((java.lang.Object) (return_value));
          }
        case 6:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = gate2bel.convert3_5_p_0_2(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4));
            }
            return ((java.lang.Object) (return_value));
          }
        case 7:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = gate2bel.environments_4_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4));
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
              return_value = gate2bel.conv_embedded_12_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4), ((java.lang.Object) arg5));
            }
            return ((java.lang.Object) (return_value));
          }
        case 1:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = gate2bel.env_mods_6_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4), ((java.lang.Object) arg5));
            }
            return ((java.lang.Object) (return_value));
          }
        case 2:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = gate2bel.conv_chunks4_8_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4), ((java.lang.Object) arg5));
            }
            return ((java.lang.Object) (return_value));
          }
        case 3:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = gate2bel.convert4_4_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4), ((java.lang.Object) arg5));
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

//  gate2bel.m:7
  public static class Chunk_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Corefclass_2
      extends gate2bel.Chunk_0
    {
      public int F1;
      public java.lang.String F2;

      public Corefclass_2()
      {
        {
        }
      }
      public Corefclass_2(
        int F1,
        java.lang.String F2)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Chunk_6
      extends gate2bel.Chunk_0
    {
      public int F1;
      public java.lang.String F2;
      public java.lang.String F3;
      public java.lang.String F4;
      public list.List_1<gate2bel.Dact_0> F5;
      public list.List_1<gate2bel.Triple_0> F6;

      public Chunk_6()
      {
        {
        }
      }
      public Chunk_6(
        int F1,
        java.lang.String F2,
        java.lang.String F3,
        java.lang.String F4,
        list.List_1<gate2bel.Dact_0> F5,
        list.List_1<gate2bel.Triple_0> F6)
      {
        {
          (this).data_tag = 0;
          this.F1 = F1;
          this.F2 = F2;
          this.F3 = F3;
          this.F4 = F4;
          this.F5 = F5;
          this.F6 = F6;
        }
      }
    }


  }

//  gate2bel.m:19
  public static class Chunk2_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Corefclass_2
      extends gate2bel.Chunk2_0
    {
      public int F1;
      public java.lang.String F2;

      public Corefclass_2()
      {
        {
        }
      }
      public Corefclass_2(
        int F1,
        java.lang.String F2)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Chunk_6
      extends gate2bel.Chunk2_0
    {
      public int F1;
      public java.lang.String F2;
      public java.lang.String F3;
      public java.lang.String F4;
      public list.List_1<gate2bel.Dact_0> F5;
      public list.List_1<gate2bel.Triple2_0> F6;

      public Chunk_6()
      {
        {
        }
      }
      public Chunk_6(
        int F1,
        java.lang.String F2,
        java.lang.String F3,
        java.lang.String F4,
        list.List_1<gate2bel.Dact_0> F5,
        list.List_1<gate2bel.Triple2_0> F6)
      {
        {
          (this).data_tag = 0;
          this.F1 = F1;
          this.F2 = F2;
          this.F3 = F3;
          this.F4 = F4;
          this.F5 = F5;
          this.F6 = F6;
        }
      }
    }


  }

//  gate2bel.m:29
  public static class Chunk3_0
    implements jmercury.runtime.MercuryType
  {
    public int F1;
    public java.lang.String F2;
    public java.lang.String F3;
    public java.lang.String F4;
    public list.List_1<gate2bel.Dact_0> F5;
    public list.List_1<gate2bel.Triple3_0> F6;

    public Chunk3_0()
    {
      {
      }
    }
    public Chunk3_0(
      int F1,
      java.lang.String F2,
      java.lang.String F3,
      java.lang.String F4,
      list.List_1<gate2bel.Dact_0> F5,
      list.List_1<gate2bel.Triple3_0> F6)
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

//  gate2bel.m:79
  public static class Cmaps_0
    implements jmercury.runtime.MercuryType
  {
    public tree234.Tree234_2<java.lang.Integer, java.lang.String> F1;
    public tree234.Tree234_2<java.lang.Integer, list.List_1<pair.Pair_2<gate2bel.Cword_0, gate2bel.Reftype_0>>> F2;

    public Cmaps_0()
    {
      {
      }
    }
    public Cmaps_0(
      tree234.Tree234_2<java.lang.Integer, java.lang.String> F1,
      tree234.Tree234_2<java.lang.Integer, list.List_1<pair.Pair_2<gate2bel.Cword_0, gate2bel.Reftype_0>>> F2)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
      }
    }
  }

//  gate2bel.m:32
  public static class Cstring_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Str_2
      extends gate2bel.Cstring_0
    {
      public java.lang.String F1;
      public gate2bel.Strtype_0 F2;

      public Str_2()
      {
        {
        }
      }
      public Str_2(
        java.lang.String F1,
        gate2bel.Strtype_0 F2)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Empty_0
      extends gate2bel.Cstring_0
    {

      public Empty_0()
      {
        {
          (this).data_tag = 0;
        }
      }
    }


  }

//  gate2bel.m:31
  public static class Cvalue_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Cref_2
      extends gate2bel.Cvalue_0
    {
      public gate2bel.Cstring_0 F1;
      public int F2;

      public Cref_2()
      {
        {
        }
      }
      public Cref_2(
        gate2bel.Cstring_0 F1,
        int F2)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Lit_1
      extends gate2bel.Cvalue_0
    {
      public gate2bel.Cstring_0 F1;

      public Lit_1()
      {
        {
        }
      }
      public Lit_1(
        gate2bel.Cstring_0 F1)
      {
        {
          (this).data_tag = 0;
          this.F1 = F1;
        }
      }
    }


  }

//  gate2bel.m:81
  public static class Cword_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Many_1
      extends gate2bel.Cword_0
    {
      public list.List_1<java.lang.String> F1;

      public Many_1()
      {
        {
        }
      }
      public Many_1(
        list.List_1<java.lang.String> F1)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
        }
      }
    }

    public static class One_1
      extends gate2bel.Cword_0
    {
      public java.lang.String F1;

      public One_1()
      {
        {
        }
      }
      public One_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 0;
          this.F1 = F1;
        }
      }
    }


  }

//  gate2bel.m:43
  public static class Dact_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Dact_0 K0 = new Dact_0(0);  /* acc */
      public static final Dact_0 K1 = new Dact_0(1);  /* adr */
      public static final Dact_0 K2 = new Dact_0(2);  /* aex */
      public static final Dact_0 K3 = new Dact_0(3);  /* ana */
      public static final Dact_0 K4 = new Dact_0(4);  /* apl */
      public static final Dact_0 K5 = new Dact_0(5);  /* apr */
      public static final Dact_0 K6 = new Dact_0(6);  /* bch */
      public static final Dact_0 K7 = new Dact_0(7);  /* bcq */
      public static final Dact_0 K8 = new Dact_0(8);  /* ccp */
      public static final Dact_0 K9 = new Dact_0(9);  /* cls */
      public static final Dact_0 K10 = new Dact_0(10);  /* cop */
      public static final Dact_0 K11 = new Dact_0(11);  /* dan */
      public static final Dact_0 K12 = new Dact_0(12);  /* dnp */
      public static final Dact_0 K13 = new Dact_0(13);  /* dwq */
      public static final Dact_0 K14 = new Dact_0(14);  /* dyn */
      public static final Dact_0 K15 = new Dact_0(15);  /* hba */
      public static final Dact_0 K16 = new Dact_0(16);  /* hdg */
      public static final Dact_0 K17 = new Dact_0(17);  /* mac */
      public static final Dact_0 K18 = new Dact_0(18);  /* nna */
      public static final Dact_0 K19 = new Dact_0(19);  /* noa */
      public static final Dact_0 K20 = new Dact_0(20);  /* nun */
      public static final Dact_0 K21 = new Dact_0(21);  /* nvb */
      public static final Dact_0 K22 = new Dact_0(22);  /* oan */
      public static final Dact_0 K23 = new Dact_0(23);  /* ooc */
      public static final Dact_0 K24 = new Dact_0(24);  /* opq */
      public static final Dact_0 K25 = new Dact_0(25);  /* orc */
      public static final Dact_0 K26 = new Dact_0(26);  /* oth */
      public static final Dact_0 K27 = new Dact_0(27);  /* quo */
      public static final Dact_0 K28 = new Dact_0(28);  /* rac */
      public static final Dact_0 K29 = new Dact_0(29);  /* rej */
      public static final Dact_0 K30 = new Dact_0(30);  /* rhq */
      public static final Dact_0 K31 = new Dact_0(31);  /* rpp */
      public static final Dact_0 K32 = new Dact_0(32);  /* sft */
      public static final Dact_0 K33 = new Dact_0(33);  /* sno */
      public static final Dact_0 K34 = new Dact_0(34);  /* sop */
      public static final Dact_0 K35 = new Dact_0(35);  /* sum */
      public static final Dact_0 K36 = new Dact_0(36);  /* tgq */
      public static final Dact_0 K37 = new Dact_0(37);  /* thx */
      public static final Dact_0 K38 = new Dact_0(38);  /* tpt */
      public static final Dact_0 K39 = new Dact_0(39);  /* uin */
      public static final Dact_0 K40 = new Dact_0(40);  /* whq */
      public static final Dact_0 K41 = new Dact_0(41);  /* yan */
      public static final Dact_0 K42 = new Dact_0(42);  /* ynq */

      private Dact_0(int val) {
        super(val);
      }

  }

//  gate2bel.m:36
  public static class Lndata_0
    implements jmercury.runtime.MercuryType
  {
    public gate2bel.Owlstr_0 F1;
    public bool.Bool_0 F2;
    public beliefs.Modality_0 F3;
    public gate2bel.Cvalue_0 F4;

    public Lndata_0()
    {
      {
      }
    }
    public Lndata_0(
      gate2bel.Owlstr_0 F1,
      bool.Bool_0 F2,
      beliefs.Modality_0 F3,
      gate2bel.Cvalue_0 F4)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
        this.F4 = F4;
      }
    }
  }

//  gate2bel.m:34
  public static class Owlfile_0
    implements jmercury.runtime.MercuryType
  {
    public java.lang.String F1;
    public list.List_1<gate2bel.Owlstmnt_0> F2;
    public utils.Corefs_0 F3;

    public Owlfile_0()
    {
      {
      }
    }
    public Owlfile_0(
      java.lang.String F1,
      list.List_1<gate2bel.Owlstmnt_0> F2,
      utils.Corefs_0 F3)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
      }
    }
  }

//  gate2bel.m:40
  public static class Owlpr_0
    implements jmercury.runtime.MercuryType
  {
    public java.lang.String F1;
    public gate2bel.Owlprtp_0 F2;

    public Owlpr_0()
    {
      {
      }
    }
    public Owlpr_0(
      java.lang.String F1,
      gate2bel.Owlprtp_0 F2)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
      }
    }
  }

//  gate2bel.m:41
  public static class Owlprtp_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Owlprtp_0 K0 = new Owlprtp_0(0);  /* wordnet */
      public static final Owlprtp_0 K1 = new Owlprtp_0(1);  /* unrecognised */

      private Owlprtp_0(int val) {
        super(val);
      }

  }

//  gate2bel.m:35
  public static class Owlstmnt_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Embedded_2
      extends gate2bel.Owlstmnt_0
    {
      public list.List_1<gate2bel.Lndata_0> F1;
      public list.List_1<gate2bel.Owltriple_0> F2;

      public Embedded_2()
      {
        {
        }
      }
      public Embedded_2(
        list.List_1<gate2bel.Lndata_0> F1,
        list.List_1<gate2bel.Owltriple_0> F2)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class One_1
      extends gate2bel.Owlstmnt_0
    {
      public gate2bel.Owltriple_0 F1;

      public One_1()
      {
        {
        }
      }
      public One_1(
        gate2bel.Owltriple_0 F1)
      {
        {
          (this).data_tag = 0;
          this.F1 = F1;
        }
      }
    }


  }

//  gate2bel.m:38
  public static class Owlstr_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Cref_3
      extends gate2bel.Owlstr_0
    {
      public java.lang.String F1;
      public gate2bel.Owlstrtp_0 F2;
      public int F3;

      public Cref_3()
      {
        {
        }
      }
      public Cref_3(
        java.lang.String F1,
        gate2bel.Owlstrtp_0 F2,
        int F3)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
          this.F2 = F2;
          this.F3 = F3;
        }
      }
    }

    public static class Str_2
      extends gate2bel.Owlstr_0
    {
      public java.lang.String F1;
      public gate2bel.Owlstrtp_0 F2;

      public Str_2()
      {
        {
        }
      }
      public Str_2(
        java.lang.String F1,
        gate2bel.Owlstrtp_0 F2)
      {
        {
          (this).data_tag = 0;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }


  }

//  gate2bel.m:39
  public static class Owlstrtp_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Unrecognised_0
      extends gate2bel.Owlstrtp_0
    {

      public Unrecognised_0()
      {
        {
          (this).data_tag = 2;
        }
      }
    }

    public static class Pp_0
      extends gate2bel.Owlstrtp_0
    {

      public Pp_0()
      {
        {
          (this).data_tag = 1;
        }
      }
    }

    public static class Pronoun_1
      extends gate2bel.Owlstrtp_0
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
          (this).data_tag = 3;
          this.F1 = F1;
        }
      }
    }

    public static class Wordnet_0
      extends gate2bel.Owlstrtp_0
    {

      public Wordnet_0()
      {
        {
          (this).data_tag = 0;
        }
      }
    }


  }

//  gate2bel.m:37
  public static class Owltriple_0
    implements jmercury.runtime.MercuryType
  {
    public int F1;
    public java.lang.String F2;
    public gate2bel.Owlstr_0 F3;
    public bool.Bool_0 F4;
    public gate2bel.Owlpr_0 F5;
    public maybe.Maybe_1<gate2bel.Owlstr_0> F6;

    public Owltriple_0()
    {
      {
      }
    }
    public Owltriple_0(
      int F1,
      java.lang.String F2,
      gate2bel.Owlstr_0 F3,
      bool.Bool_0 F4,
      gate2bel.Owlpr_0 F5,
      maybe.Maybe_1<gate2bel.Owlstr_0> F6)
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

//  gate2bel.m:14
  public static class Reftype_0
    extends jmercury.runtime.MercuryEnum
    implements jmercury.runtime.MercuryType
  {
      public static final Reftype_0 K0 = new Reftype_0(0);  /* ref */
      public static final Reftype_0 K1 = new Reftype_0(1);  /* person */
      public static final Reftype_0 K2 = new Reftype_0(2);  /* possess */
      public static final Reftype_0 K3 = new Reftype_0(3);  /* reflex */

      private Reftype_0(int val) {
        super(val);
      }

  }

//  gate2bel.m:25
  public static class Str2_0
    implements jmercury.runtime.MercuryType
  {
    public java.lang.String F1;
    public gate2bel.Strtype_0 F2;

    public Str2_0()
    {
      {
      }
    }
    public Str2_0(
      java.lang.String F1,
      gate2bel.Strtype_0 F2)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
      }
    }
  }

//  gate2bel.m:26
  public static class Strtype_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Unrecognised_0
      extends gate2bel.Strtype_0
    {

      public Unrecognised_0()
      {
        {
          (this).data_tag = 2;
        }
      }
    }

    public static class Pp_0
      extends gate2bel.Strtype_0
    {

      public Pp_0()
      {
        {
          (this).data_tag = 1;
        }
      }
    }

    public static class Pronoun_2
      extends gate2bel.Strtype_0
    {
      public java.lang.String F1;
      public wordnet.Prontp_0 F2;

      public Pronoun_2()
      {
        {
        }
      }
      public Pronoun_2(
        java.lang.String F1,
        wordnet.Prontp_0 F2)
      {
        {
          (this).data_tag = 3;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Wordnet_0
      extends gate2bel.Strtype_0
    {

      public Wordnet_0()
      {
        {
          (this).data_tag = 0;
        }
      }
    }


  }

//  gate2bel.m:90
  public static class Tmpagt_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class P2_0
      extends gate2bel.Tmpagt_0
    {

      public P2_0()
      {
        {
          (this).data_tag = 1;
        }
      }
    }

    public static class P1_0
      extends gate2bel.Tmpagt_0
    {

      public P1_0()
      {
        {
          (this).data_tag = 0;
        }
      }
    }

    public static class Str_1
      extends gate2bel.Tmpagt_0
    {
      public java.lang.String F1;

      public Str_1()
      {
        {
        }
      }
      public Str_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 2;
          this.F1 = F1;
        }
      }
    }


  }

//  gate2bel.m:89
  public static class Tmpmod_0
    implements jmercury.runtime.MercuryType
  {
    public gate2bel.Tmpagt_0 F1;
    public bool.Bool_0 F2;
    public beliefs.Modality_0 F3;

    public Tmpmod_0()
    {
      {
      }
    }
    public Tmpmod_0(
      gate2bel.Tmpagt_0 F1,
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

//  gate2bel.m:6
  public static class Tnfile_0
    implements jmercury.runtime.MercuryType
  {
    public java.lang.String F1;
    public list.List_1<gate2bel.Chunk_0> F2;

    public Tnfile_0()
    {
      {
      }
    }
    public Tnfile_0(
      java.lang.String F1,
      list.List_1<gate2bel.Chunk_0> F2)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
      }
    }
  }

//  gate2bel.m:18
  public static class Tnfile2_0
    implements jmercury.runtime.MercuryType
  {
    public java.lang.String F1;
    public list.List_1<gate2bel.Chunk2_0> F2;

    public Tnfile2_0()
    {
      {
      }
    }
    public Tnfile2_0(
      java.lang.String F1,
      list.List_1<gate2bel.Chunk2_0> F2)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
      }
    }
  }

//  gate2bel.m:28
  public static class Tnfile3_0
    implements jmercury.runtime.MercuryType
  {
    public java.lang.String F1;
    public list.List_1<gate2bel.Chunk3_0> F2;
    public utils.Corefs_0 F3;

    public Tnfile3_0()
    {
      {
      }
    }
    public Tnfile3_0(
      java.lang.String F1,
      list.List_1<gate2bel.Chunk3_0> F2,
      utils.Corefs_0 F3)
    {
      {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
      }
    }
  }

//  gate2bel.m:9
  public static class Triple_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Triple_5
      extends gate2bel.Triple_0
    {
      public int F1;
      public gate2bel.Value_0 F2;
      public gate2bel.Value_0 F3;
      public gate2bel.Value_0 F4;
      public int F5;

      public Triple_5()
      {
        {
        }
      }
      public Triple_5(
        int F1,
        gate2bel.Value_0 F2,
        gate2bel.Value_0 F3,
        gate2bel.Value_0 F4,
        int F5)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
          this.F2 = F2;
          this.F3 = F3;
          this.F4 = F4;
          this.F5 = F5;
        }
      }
    }

    public static class Triple_4
      extends gate2bel.Triple_0
    {
      public int F1;
      public gate2bel.Value_0 F2;
      public gate2bel.Value_0 F3;
      public gate2bel.Value_0 F4;

      public Triple_4()
      {
        {
        }
      }
      public Triple_4(
        int F1,
        gate2bel.Value_0 F2,
        gate2bel.Value_0 F3,
        gate2bel.Value_0 F4)
      {
        {
          (this).data_tag = 0;
          this.F1 = F1;
          this.F2 = F2;
          this.F3 = F3;
          this.F4 = F4;
        }
      }
    }


  }

//  gate2bel.m:21
  public static class Triple2_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Triple_6
      extends gate2bel.Triple2_0
    {
      public int F1;
      public gate2bel.Value2_0 F2;
      public bool.Bool_0 F3;
      public gate2bel.Value2_0 F4;
      public gate2bel.Value2_0 F5;
      public int F6;

      public Triple_6()
      {
        {
        }
      }
      public Triple_6(
        int F1,
        gate2bel.Value2_0 F2,
        bool.Bool_0 F3,
        gate2bel.Value2_0 F4,
        gate2bel.Value2_0 F5,
        int F6)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
          this.F2 = F2;
          this.F3 = F3;
          this.F4 = F4;
          this.F5 = F5;
          this.F6 = F6;
        }
      }
    }

    public static class Triple_5
      extends gate2bel.Triple2_0
    {
      public int F1;
      public gate2bel.Value2_0 F2;
      public bool.Bool_0 F3;
      public gate2bel.Value2_0 F4;
      public gate2bel.Value2_0 F5;

      public Triple_5()
      {
        {
        }
      }
      public Triple_5(
        int F1,
        gate2bel.Value2_0 F2,
        bool.Bool_0 F3,
        gate2bel.Value2_0 F4,
        gate2bel.Value2_0 F5)
      {
        {
          (this).data_tag = 0;
          this.F1 = F1;
          this.F2 = F2;
          this.F3 = F3;
          this.F4 = F4;
          this.F5 = F5;
        }
      }
    }


  }

//  gate2bel.m:30
  public static class Triple3_0
    implements jmercury.runtime.MercuryType
  {
    public int F1;
    public gate2bel.Cvalue_0 F2;
    public bool.Bool_0 F3;
    public gate2bel.Cstring_0 F4;
    public gate2bel.Cvalue_0 F5;
    public maybe.Maybe_1<java.lang.Integer> F6;

    public Triple3_0()
    {
      {
      }
    }
    public Triple3_0(
      int F1,
      gate2bel.Cvalue_0 F2,
      bool.Bool_0 F3,
      gate2bel.Cstring_0 F4,
      gate2bel.Cvalue_0 F5,
      maybe.Maybe_1<java.lang.Integer> F6)
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

//  gate2bel.m:11
  public static class Value_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Empty_0
      extends gate2bel.Value_0
    {

      public Empty_0()
      {
        {
          (this).data_tag = 0;
        }
      }
    }

    public static class Corefs_2
      extends gate2bel.Value_0
    {
      public list.List_1<java.lang.String> F1;
      public pair.Pair_2<gate2bel.Reftype_0, java.lang.Integer> F2;

      public Corefs_2()
      {
        {
        }
      }
      public Corefs_2(
        list.List_1<java.lang.String> F1,
        pair.Pair_2<gate2bel.Reftype_0, java.lang.Integer> F2)
      {
        {
          (this).data_tag = 5;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Coref_2
      extends gate2bel.Value_0
    {
      public java.lang.String F1;
      public pair.Pair_2<gate2bel.Reftype_0, java.lang.Integer> F2;

      public Coref_2()
      {
        {
        }
      }
      public Coref_2(
        java.lang.String F1,
        pair.Pair_2<gate2bel.Reftype_0, java.lang.Integer> F2)
      {
        {
          (this).data_tag = 4;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Coref_1
      extends gate2bel.Value_0
    {
      public pair.Pair_2<gate2bel.Reftype_0, java.lang.Integer> F1;

      public Coref_1()
      {
        {
        }
      }
      public Coref_1(
        pair.Pair_2<gate2bel.Reftype_0, java.lang.Integer> F1)
      {
        {
          (this).data_tag = 3;
          this.F1 = F1;
        }
      }
    }

    public static class Strs_1
      extends gate2bel.Value_0
    {
      public list.List_1<java.lang.String> F1;

      public Strs_1()
      {
        {
        }
      }
      public Strs_1(
        list.List_1<java.lang.String> F1)
      {
        {
          (this).data_tag = 2;
          this.F1 = F1;
        }
      }
    }

    public static class Str_1
      extends gate2bel.Value_0
    {
      public java.lang.String F1;

      public Str_1()
      {
        {
        }
      }
      public Str_1(
        java.lang.String F1)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
        }
      }
    }


  }

//  gate2bel.m:23
  public static class Value2_0
    implements jmercury.runtime.MercuryType
  {
    public int data_tag;
    public static class Empty_0
      extends gate2bel.Value2_0
    {

      public Empty_0()
      {
        {
          (this).data_tag = 0;
        }
      }
    }

    public static class Corefs_2
      extends gate2bel.Value2_0
    {
      public list.List_1<gate2bel.Str2_0> F1;
      public pair.Pair_2<gate2bel.Reftype_0, java.lang.Integer> F2;

      public Corefs_2()
      {
        {
        }
      }
      public Corefs_2(
        list.List_1<gate2bel.Str2_0> F1,
        pair.Pair_2<gate2bel.Reftype_0, java.lang.Integer> F2)
      {
        {
          (this).data_tag = 5;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Coref_2
      extends gate2bel.Value2_0
    {
      public gate2bel.Str2_0 F1;
      public pair.Pair_2<gate2bel.Reftype_0, java.lang.Integer> F2;

      public Coref_2()
      {
        {
        }
      }
      public Coref_2(
        gate2bel.Str2_0 F1,
        pair.Pair_2<gate2bel.Reftype_0, java.lang.Integer> F2)
      {
        {
          (this).data_tag = 4;
          this.F1 = F1;
          this.F2 = F2;
        }
      }
    }

    public static class Coref_1
      extends gate2bel.Value2_0
    {
      public pair.Pair_2<gate2bel.Reftype_0, java.lang.Integer> F1;

      public Coref_1()
      {
        {
        }
      }
      public Coref_1(
        pair.Pair_2<gate2bel.Reftype_0, java.lang.Integer> F1)
      {
        {
          (this).data_tag = 3;
          this.F1 = F1;
        }
      }
    }

    public static class Strs_1
      extends gate2bel.Value2_0
    {
      public list.List_1<gate2bel.Str2_0> F1;

      public Strs_1()
      {
        {
        }
      }
      public Strs_1(
        list.List_1<gate2bel.Str2_0> F1)
      {
        {
          (this).data_tag = 2;
          this.F1 = F1;
        }
      }
    }

    public static class Str_1
      extends gate2bel.Value2_0
    {
      public gate2bel.Str2_0 F1;

      public Str_1()
      {
        {
        }
      }
      public Str_1(
        gate2bel.Str2_0 F1)
      {
        {
          (this).data_tag = 1;
          this.F1 = F1;
        }
      }
    }


  }

//  gate2bel.m:87
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

//  gate2bel.m:559
  private static java.lang.Object IntroducedFrom__pred__word_corefs__555__1_4_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      tree234.Tree234_2 conv0_HeadVar__4_41 = null;

      {
        conv0_HeadVar__4_41 = gate2bel.IntroducedFrom__pred__word_corefs__559__1_4_p_0(((java.lang.Integer) (((java.lang.Object[]) closure)[3])).intValue(), ((java.lang.String) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2));
      }
      wrapper_arg_3 = ((java.lang.Object) (conv0_HeadVar__4_41));
      return wrapper_arg_3;
    }
  }
//  gate2bel.m:555
  private static tree234.Tree234_2 IntroducedFrom__pred__word_corefs__555__1_4_p_0(
    int Class_6,
    pair.Pair_2 HeadVar__2_30,
    tree234.Tree234_2 HeadVar__3_31)
  {
    {
      boolean succeeded = false;
      tree234.Tree234_2 HeadVar__4_32 = null;
      gate2bel.Cword_0 CW_16 = ((gate2bel.Cword_0) ((pair.Pair_2) HeadVar__2_30).F1);
      gate2bel.Reftype_0 Tp_17 = ((gate2bel.Reftype_0) ((pair.Pair_2) HeadVar__2_30).F2);

//  gate2bel.m:560
      switch (Tp_17.MR_value) {
        case 1:
          HeadVar__4_32 = HeadVar__3_31;
          break;
        case 2:
//  gate2bel.m:562
          HeadVar__4_32 = HeadVar__3_31;
//  gate2bel.m:560
          break;
        case 0:
//  gate2bel.m:557
          if ((CW_16.data_tag == 1))
//  gate2bel.m:559
            {
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_44_44 = null;
              jmercury.runtime.TypeInfo_Struct TypeInfo_45_45 = null;
              list.List_1 Ss_19 = ((gate2bel.Cword_0.Many_1) CW_16).F1;
              /* closure */ java.lang.Object[] V_33_33 = null;
              java.lang.Object conv1_HeadVar__4_32 = null;

              {
                V_33_33 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_9[4])), ((java.lang.Object) (new AddrOf3_0(0))), java.lang.Integer.valueOf(1), java.lang.Integer.valueOf(Class_6)};
              }
              TypeCtorInfo_44_44 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
              TypeInfo_45_45 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[21]);
              {
                conv1_HeadVar__4_32 = list.foldl_4_p_0(TypeCtorInfo_44_44, TypeInfo_45_45, V_33_33, Ss_19, ((java.lang.Object) (HeadVar__3_31)));
              }
              HeadVar__4_32 = ((tree234.Tree234_2) conv1_HeadVar__4_32);
            }
//  gate2bel.m:557
          else
//  gate2bel.m:558
            {
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_37_37 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_38_38 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
              java.lang.String S_18 = ((gate2bel.Cword_0.One_1) CW_16).F1;

              {
                HeadVar__4_32 = multi_map.set_4_p_0(TypeCtorInfo_37_37, TypeCtorInfo_38_38, java.lang.Integer.valueOf(Class_6), ((java.lang.Object) (S_18)), HeadVar__3_31);
              }
            }
//  gate2bel.m:560
          break;
        case 3:
//  gate2bel.m:561
          HeadVar__4_32 = HeadVar__3_31;
//  gate2bel.m:560
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
//  gate2bel.m:555
      return HeadVar__4_32;
    }
  }
//  gate2bel.m:559
  private static tree234.Tree234_2 IntroducedFrom__pred__word_corefs__559__1_4_p_0(
    int Class_6,
    java.lang.String HeadVar__2_39,
    tree234.Tree234_2 HeadVar__3_40)
  {
    {
      boolean succeeded = false;
      tree234.Tree234_2 HeadVar__4_41 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_42_42 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_43_43 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);

      {
        HeadVar__4_41 = multi_map.set_4_p_0(TypeCtorInfo_42_42, TypeCtorInfo_43_43, java.lang.Integer.valueOf(Class_6), ((java.lang.Object) (HeadVar__2_39)), HeadVar__3_40);
      }
      return HeadVar__4_41;
    }
  }
//  gate2bel.m:544
  private static java.lang.String IntroducedFrom__pred__value_coref__544__1_2_p_0(
    gate2bel.Str2_0 HeadVar__1_43)
  {
    {
      boolean succeeded = false;
      java.lang.String HeadVar__2_44 = ((gate2bel.Str2_0) HeadVar__1_43).F1;
      gate2bel.Strtype_0 V_37_37 = ((gate2bel.Str2_0) HeadVar__1_43).F2;

      return HeadVar__2_44;
    }
  }
//  gate2bel.m:509
  private static gate2bel.Cstring_0 IntroducedFrom__pred__conv_strings__509__1_2_p_0(
    gate2bel.Str2_0 HeadVar__1_44)
  {
    {
      boolean succeeded = false;
      gate2bel.Cstring_0 HeadVar__2_45 = null;
      java.lang.String X_33 = ((gate2bel.Str2_0) HeadVar__1_44).F1;
      gate2bel.Strtype_0 Y_34 = ((gate2bel.Str2_0) HeadVar__1_44).F2;

      {
        HeadVar__2_45 = new gate2bel.Cstring_0.Str_2(X_33, Y_34);
      }
      return HeadVar__2_45;
    }
  }
//  gate2bel.m:475
  private static boolean IntroducedFrom__pred__conv_pred__475__1_1_p_0(
    java.lang.String HeadVar__1_30)
  {
    {
      boolean succeeded = HeadVar__1_30.equals("");

      succeeded = !(succeeded);
      return succeeded;
    }
  }
//  gate2bel.m:457
  private static boolean IntroducedFrom__pred__conv_str__457__1_1_p_0(
    java.lang.String HeadVar__1_11)
  {
    {
      boolean succeeded = HeadVar__1_11.equals("");

      succeeded = !(succeeded);
      return succeeded;
    }
  }
//  gate2bel.m:449
  private static gate2bel.Cvalue_0 IntroducedFrom__pred__conv_val__449__1_2_p_0(
    gate2bel.Cstring_0 HeadVar__1_57)
  {
    {
      boolean succeeded = false;
      gate2bel.Cvalue_0 HeadVar__2_58 = null;

      {
        HeadVar__2_58 = new gate2bel.Cvalue_0.Lit_1(HeadVar__1_57);
      }
      return HeadVar__2_58;
    }
  }
//  gate2bel.m:452
  private static gate2bel.Cvalue_0 IntroducedFrom__pred__conv_val__452__1_3_p_0(
    int I_64,
    gate2bel.Cstring_0 HeadVar__2_75)
  {
    {
      boolean succeeded = false;
      gate2bel.Cvalue_0 HeadVar__3_76 = null;

      {
        HeadVar__3_76 = new gate2bel.Cvalue_0.Cref_2(HeadVar__2_75, I_64);
      }
      return HeadVar__3_76;
    }
  }
//  gate2bel.m:310
  private static tree234.Tree234_2 IntroducedFrom__pred__store_triple__310__1_3_p_0(
    pair.Pair_2 HeadVar__1_66,
    tree234.Tree234_2 HeadVar__2_67)
  {
    {
      boolean succeeded = false;
      tree234.Tree234_2 HeadVar__3_68 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_80_80 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[8]);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_81_81 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_envtriple_0);
      list.List_1 Path_42 = ((list.List_1) ((pair.Pair_2) HeadVar__1_66).F1);
      beliefs.Envtriple_0 Triple_43 = ((beliefs.Envtriple_0) ((pair.Pair_2) HeadVar__1_66).F2);

//  gate2bel.m:312
      {
        HeadVar__3_68 = multi_map.set_4_p_0(TypeInfo_80_80, TypeCtorInfo_81_81, ((java.lang.Object) (Path_42)), ((java.lang.Object) (Triple_43)), HeadVar__2_67);
      }
//  gate2bel.m:310
      return HeadVar__3_68;
    }
  }
//  gate2bel.m:272
  private static java.lang.Object [] IntroducedFrom__pred__env_mods__272__1_8_p_0(
    java.lang.String Nm_7,
    beliefs.Belmod_0 HeadVar__2_33,
    list.List_1 HeadVar__3_34,
    bool.Bool_0 HeadVar__5_36,
    list.List_1 HeadVar__7_38)
  {
    {
      boolean succeeded = false;
      list.List_1 HeadVar__4_35 = null;
      bool.Bool_0 HeadVar__6_37 = null;
      list.List_1 HeadVar__8_39 = null;
      java.lang.String S_19 = null;
      beliefs.Bstrtp_0 Tp_20 = null;
      bool.Bool_0 Ng_21 = ((beliefs.Belmod_0) HeadVar__2_33).F2;
      beliefs.Belstr_0 V_40_40 = ((beliefs.Belmod_0) HeadVar__2_33).F1;
//  gate2bel.m:277
      gate2bel.Tmpagt_0 Ag_23 = null;

//  gate2bel.m:273
      S_19 = ((beliefs.Belstr_0) V_40_40).F1;
      Tp_20 = ((beliefs.Belstr_0) V_40_40).F2;
//  gate2bel.m:275
      if ((Tp_20.data_tag == 3))
//  gate2bel.m:274
        {
          {
            Ag_23 = new gate2bel.Tmpagt_0.Str_1(S_19);
          }
          succeeded = true;
        }
//  gate2bel.m:275
      else
        if ((Tp_20.data_tag == 4))
          {
            wordnet.Prontp_0 P_24 = ((beliefs.Bstrtp_0.Pronoun_1) Tp_20).F1;

            switch (P_24.MR_value) {
              case 0:
                {
                  Ag_23 = (gate2bel.Tmpagt_0) gate2bel.MR_scalar_common_16[0];
                  succeeded = true;
                }
                break;
              case 1:
                {
                  Ag_23 = (gate2bel.Tmpagt_0) gate2bel.MR_scalar_common_17[0];
                  succeeded = true;
                }
                break;
              default:
                succeeded = false;
            }
          }
        else
          succeeded = false;
//  gate2bel.m:277
      if (succeeded)
//  gate2bel.m:276
        {
          gate2bel.Tmpmod_0 V_41_41 = null;

          {
            V_41_41 = new gate2bel.Tmpmod_0(Ag_23, Ng_21, null);
          }
          {
            HeadVar__4_35 = new list.List_1.F_cons_2(((java.lang.Object) (V_41_41)), HeadVar__3_34);
          }
          HeadVar__6_37 = HeadVar__5_36;
          HeadVar__8_39 = HeadVar__7_38;
        }
//  gate2bel.m:277
      else
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_54_54 = null;
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_55_55 = null;
          errors.Err_loc_0 V_42_42 = null;
          sberrs.Error_0 V_43_43 = null;
          java.lang.String V_44_44 = null;
          java.lang.String V_45_45 = null;

          HeadVar__4_35 = HeadVar__3_34;
//  gate2bel.m:278
          {
            V_42_42 = new errors.Err_loc_0.File_1(Nm_7);
          }
          V_44_44 = "agent";
          TypeCtorInfo_54_54 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_bstrtp_0);
          {
            V_45_45 = string.string_1_f_0(TypeCtorInfo_54_54, ((java.lang.Object) (Tp_20)));
          }
          {
            V_43_43 = new sberrs.Error_0.Funny_str_3(V_44_44, S_19, V_45_45);
          }
          TypeCtorInfo_55_55 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
          {
            HeadVar__8_39 = errors.add_error_4_p_0(TypeCtorInfo_55_55, V_42_42, ((java.lang.Object) (V_43_43)), HeadVar__7_38);
          }
//  gate2bel.m:279
          HeadVar__6_37 = bool.Bool_0.K0;
//  gate2bel.m:277
        }
//  gate2bel.m:272
return new java.lang.Object[] {
        ((java.lang.Object) (HeadVar__4_35)),
        ((java.lang.Object) (HeadVar__6_37)),
        ((java.lang.Object) (HeadVar__8_39))
      };
    }
  }
//  gate2bel.m:165
  private static gate2bel.Triple3_0 IntroducedFrom__pred__conv_triple2__165__1_5_p_0(
    int Tid_11,
    bool.Bool_0 Neg_13,
    gate2bel.Cstring_0 P_21,
    pair.Pair_2 HeadVar__4_82)
  {
    {
      boolean succeeded = false;
      gate2bel.Triple3_0 HeadVar__5_83 = null;
      gate2bel.Cvalue_0 Zb_37 = ((gate2bel.Cvalue_0) ((pair.Pair_2) HeadVar__4_82).F1);
      gate2bel.Cvalue_0 Wb_38 = ((gate2bel.Cvalue_0) ((pair.Pair_2) HeadVar__4_82).F2);
      maybe.Maybe_1 V_84_84 = (maybe.Maybe_1) gate2bel.MR_scalar_common_10[0];

//  gate2bel.m:166
      {
        HeadVar__5_83 = new gate2bel.Triple3_0(Tid_11, Zb_37, Neg_13, P_21, Wb_38, V_84_84);
      }
//  gate2bel.m:165
      return HeadVar__5_83;
    }
  }
//  gate2bel.m:162
  private static class introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0
    extends /* env_ptr */ java.lang.Object
  {
    public list.List_1 Os_20;
    public jmercury.runtime.MethodPtr cont;
    public /* env_ptr */ java.lang.Object cont_env_ptr;
    public pair.Pair_2 HeadVar__3_75;
    public jmercury.runtime.TypeInfo_Struct TypeCtorInfo_97_97;
    public gate2bel.Cvalue_0 S_29;
    public gate2bel.Cvalue_0 O_30;
//  gate2bel.m:163
    public java.lang.Object conv0_S_29;
    public java.lang.Object conv1_O_30;

  }

  private static void IntroducedFrom__pred__conv_triple2__162__1_3_p_0_3(
    java.lang.Object arg1,
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0 env_ptr = (gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0) env_ptr_arg;

      ((gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0) env_ptr).conv0_S_29 = arg1;
      {
        gate2bel.IntroducedFrom__pred__conv_triple2__162__1_3_p_0_2(env_ptr);
      }
    }
  }
  private static void IntroducedFrom__pred__conv_triple2__162__1_3_p_0_2(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0 env_ptr = (gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0) env_ptr_arg;

      ((gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0) env_ptr).S_29 = ((gate2bel.Cvalue_0) ((gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0) env_ptr).conv0_S_29);
      {
        gate2bel.IntroducedFrom__pred__conv_triple2__162__1_3_p_0_1(env_ptr);
      }
    }
  }
  private static void IntroducedFrom__pred__conv_triple2__162__1_3_p_0_6(
    java.lang.Object arg1,
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0 env_ptr = (gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0) env_ptr_arg;

      ((gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0) env_ptr).conv1_O_30 = arg1;
      {
        gate2bel.IntroducedFrom__pred__conv_triple2__162__1_3_p_0_5(env_ptr);
      }
    }
  }
  private static void IntroducedFrom__pred__conv_triple2__162__1_3_p_0_5(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0 env_ptr = (gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0) env_ptr_arg;

      ((gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0) env_ptr).O_30 = ((gate2bel.Cvalue_0) ((gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0) env_ptr).conv1_O_30);
      {
        gate2bel.IntroducedFrom__pred__conv_triple2__162__1_3_p_0_4(env_ptr);
      }
    }
  }
//  gate2bel.m:162
  private static void IntroducedFrom__pred__conv_triple2__162__1_3_p_0_4(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0 env_ptr = (gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0) env_ptr_arg;

//  gate2bel.m:163
      {
        ((gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0) env_ptr).HeadVar__3_75 = new pair.Pair_2(((java.lang.Object) (((gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0) env_ptr).S_29)), ((java.lang.Object) (((gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0) env_ptr).O_30)));
      }
      {
        ((jmercury.runtime.MethodPtr2) (((gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0) env_ptr).cont)).call___0_0(((java.lang.Object) (((gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0) env_ptr).HeadVar__3_75)), ((java.lang.Object) (((gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0) env_ptr).cont_env_ptr)));
      }
//  gate2bel.m:162
    }
  }
  private static void IntroducedFrom__pred__conv_triple2__162__1_3_p_0_1(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0 env_ptr = (gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0) env_ptr_arg;

//  gate2bel.m:163
      {
        list.member_2_p_1(((gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0) env_ptr).TypeCtorInfo_97_97, ((gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0) env_ptr).Os_20, new AddrOf2_0(74), env_ptr);
      }
//  gate2bel.m:162
    }
  }
  private static void IntroducedFrom__pred__conv_triple2__162__1_3_p_0(
    list.List_1 Ss_18,
    list.List_1 Os_20,
    jmercury.runtime.MethodPtr cont,
    /* env_ptr */ java.lang.Object cont_env_ptr)
  {
    {
      gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0 env = null;
      gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0 env_ptr = null;

      {
        env = new gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0();
      }
      env_ptr = env;
      ((gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0) env_ptr).Os_20 = Os_20;
      ((gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0) env_ptr).cont = cont;
      ((gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0) env_ptr).cont_env_ptr = cont_env_ptr;
      {
        boolean succeeded = false;

        ((gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0) env_ptr).TypeCtorInfo_97_97 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_cvalue_0);
//  gate2bel.m:163
        {
          list.member_2_p_1(((gate2bel.introducedFrom__pred__conv_triple2__162__1_3_p_0_env_0) env_ptr).TypeCtorInfo_97_97, Ss_18, new AddrOf2_0(75), env_ptr);
        }
//  gate2bel.m:162
      }
    }
  }
//  gate2bel.m:176
  private static java.lang.Object IntroducedFrom__pred__convert4__174__1_4_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      list.List_1 conv0_HeadVar__3_45 = null;

      {
        conv0_HeadVar__3_45 = gate2bel.IntroducedFrom__pred__convert4__176__1_3_p_0(((gate2bel.Owltriple_0) wrapper_arg_1), ((list.List_1) wrapper_arg_2));
      }
      wrapper_arg_3 = ((java.lang.Object) (conv0_HeadVar__3_45));
      return wrapper_arg_3;
    }
  }
//  gate2bel.m:174
  private static list.List_1 IntroducedFrom__pred__convert4__174__1_4_p_0(
    tree234.Tree234_2 CM_10,
    int HeadVar__2_39,
    list.List_1 HeadVar__3_40)
  {
    {
      boolean succeeded = false;
      list.List_1 HeadVar__4_41 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_71_71 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_72_72 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_owltriple_0);
      jmercury.runtime.TypeInfo_Struct TypeInfo_73_73 = null;
      list.List_1 Trs_19 = null;
      /* closure */ java.lang.Object[] V_42_42 = null;
//  gate2bel.m:176
      java.lang.Object conv1_HeadVar__4_41 = null;

//  gate2bel.m:175
      {
        Trs_19 = multi_map.lookup_3_p_0(TypeCtorInfo_71_71, TypeCtorInfo_72_72, CM_10, java.lang.Integer.valueOf(HeadVar__2_39));
      }
//  gate2bel.m:176
      V_42_42 = (/* closure */ java.lang.Object[]) gate2bel.MR_scalar_common_6[12];
      TypeInfo_73_73 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[6]);
      {
        conv1_HeadVar__4_41 = list.foldl_4_p_0(TypeCtorInfo_72_72, TypeInfo_73_73, V_42_42, Trs_19, ((java.lang.Object) (HeadVar__3_40)));
      }
      HeadVar__4_41 = ((list.List_1) conv1_HeadVar__4_41);
//  gate2bel.m:174
      return HeadVar__4_41;
    }
  }
//  gate2bel.m:176
  private static list.List_1 IntroducedFrom__pred__convert4__176__1_3_p_0(
    gate2bel.Owltriple_0 HeadVar__1_43,
    list.List_1 HeadVar__2_44)
  {
    {
      boolean succeeded = false;
      list.List_1 HeadVar__3_45 = null;
      gate2bel.Owlstmnt_0 V_46_46 = null;

//  gate2bel.m:177
      {
        V_46_46 = new gate2bel.Owlstmnt_0.One_1(HeadVar__1_43);
      }
      {
        HeadVar__3_45 = new list.List_1.F_cons_2(((java.lang.Object) (V_46_46)), HeadVar__2_44);
      }
//  gate2bel.m:176
      return HeadVar__3_45;
    }
  }
//  gate2bel.m:80
  private static builtin.Comparison_result_0 __Compare____wmap_0_0(
    tree234.Tree234_2 HeadVar__2_2,
    tree234.Tree234_2 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[22]);
      tree234.Tree234_2 Cast_HeadVar1_4 = HeadVar__2_2;
      tree234.Tree234_2 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  private static boolean __Unify____wmap_0_0(
    tree234.Tree234_2 HeadVar__1_1,
    tree234.Tree234_2 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[22]);
      tree234.Tree234_2 Cast_HeadVar1_3 = HeadVar__1_1;
      tree234.Tree234_2 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  gate2bel.m:87
  private static builtin.Comparison_result_0 __Compare____vertices_0_0(
    gate2bel.Vertices_0 HeadVar__2_2,
    gate2bel.Vertices_0 HeadVar__3_3)
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
          set_ordlist.Set_ordlist_1 V_4_4 = ((gate2bel.Vertices_0) HeadVar__2_2).F1;
          set_ordlist.Set_ordlist_1 V_5_5 = ((gate2bel.Vertices_0) HeadVar__2_2).F2;
          list.List_1 V_6_6 = ((gate2bel.Vertices_0) HeadVar__2_2).F3;
          list.List_1 V_7_7 = ((gate2bel.Vertices_0) HeadVar__2_2).F4;
          set_ordlist.Set_ordlist_1 V_8_8 = ((gate2bel.Vertices_0) HeadVar__3_3).F1;
          set_ordlist.Set_ordlist_1 V_9_9 = ((gate2bel.Vertices_0) HeadVar__3_3).F2;
          list.List_1 V_10_10 = ((gate2bel.Vertices_0) HeadVar__3_3).F3;
          list.List_1 V_11_11 = ((gate2bel.Vertices_0) HeadVar__3_3).F4;
          builtin.Comparison_result_0 V_12_12 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_17_17 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[35]);

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
              jmercury.runtime.TypeInfo_Struct TypeInfo_18_18 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[35]);

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
                  jmercury.runtime.TypeInfo_Struct TypeInfo_19_19 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[15]);

                  {
                    V_14_14 = builtin.compare_3_p_0(TypeInfo_19_19, ((java.lang.Object) (V_6_6)), ((java.lang.Object) (V_10_10)));
                  }
                  succeeded = (V_14_14.MR_value == builtin.Comparison_result_0.K0.MR_value);
                  succeeded = !(succeeded);
                  if (succeeded)
                    HeadVar__1_1 = V_14_14;
                  else
                    {
                      jmercury.runtime.TypeInfo_Struct TypeInfo_20_20 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[36]);

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
    gate2bel.Vertices_0 HeadVar__1_1,
    gate2bel.Vertices_0 HeadVar__2_2)
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
          jmercury.runtime.TypeInfo_Struct TypeInfo_13_13 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[35]);
          jmercury.runtime.TypeInfo_Struct TypeInfo_14_14 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_15_15 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_16_16 = null;
          set_ordlist.Set_ordlist_1 V_3_3 = ((gate2bel.Vertices_0) HeadVar__1_1).F1;
          set_ordlist.Set_ordlist_1 V_4_4 = ((gate2bel.Vertices_0) HeadVar__1_1).F2;
          list.List_1 V_5_5 = ((gate2bel.Vertices_0) HeadVar__1_1).F3;
          list.List_1 V_6_6 = ((gate2bel.Vertices_0) HeadVar__1_1).F4;
          set_ordlist.Set_ordlist_1 V_7_7 = ((gate2bel.Vertices_0) HeadVar__2_2).F1;
          set_ordlist.Set_ordlist_1 V_8_8 = ((gate2bel.Vertices_0) HeadVar__2_2).F2;
          list.List_1 V_9_9 = ((gate2bel.Vertices_0) HeadVar__2_2).F3;
          list.List_1 V_10_10 = ((gate2bel.Vertices_0) HeadVar__2_2).F4;

          {
            succeeded = builtin.unify_2_p_0(TypeInfo_13_13, ((java.lang.Object) (V_3_3)), ((java.lang.Object) (V_7_7)));
          }
          if (succeeded)
            {
              TypeInfo_14_14 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[35]);
              {
                succeeded = builtin.unify_2_p_0(TypeInfo_14_14, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_8_8)));
              }
              if (succeeded)
                {
                  TypeInfo_15_15 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[15]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_15_15, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_9_9)));
                  }
                  if (succeeded)
                    {
                      TypeInfo_16_16 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[36]);
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
//  gate2bel.m:23
  public static builtin.Comparison_result_0 __Compare____value2_0_0(
    gate2bel.Value2_0 HeadVar__2_2,
    gate2bel.Value2_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_90 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_91 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_90 == CastY_91);
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
              case 3:
                HeadVar__1_1 = builtin.Comparison_result_0.K2;
                break;
              case 4:
                HeadVar__1_1 = builtin.Comparison_result_0.K2;
                break;
              case 5:
                HeadVar__1_1 = builtin.Comparison_result_0.K2;
                break;
              default: /*NOTREACHED*/
                throw new jmercury.runtime.UnreachableDefault();
            }
            break;
          case 1:
            {
              gate2bel.Str2_0 V_104_104 = ((gate2bel.Value2_0.Str_1) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 1:
                  {
                    gate2bel.Str2_0 V_5_5 = ((gate2bel.Value2_0.Str_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = gate2bel.__Compare____str2_0_0(V_104_104, V_5_5);
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
              list.List_1 V_105_105 = ((gate2bel.Value2_0.Strs_1) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 1:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 2:
                  {
                    jmercury.runtime.TypeInfo_Struct TypeInfo_97_97 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[34]);
                    list.List_1 V_20_20 = ((gate2bel.Value2_0.Strs_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_97_97, ((java.lang.Object) (V_105_105)), ((java.lang.Object) (V_20_20)));
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
              pair.Pair_2 V_99_99 = ((gate2bel.Value2_0.Coref_1) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 1:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 2:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 3:
                  {
                    jmercury.runtime.TypeInfo_Struct TypeInfo_96_96 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[27]);
                    pair.Pair_2 V_35_35 = ((gate2bel.Value2_0.Coref_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_96_96, ((java.lang.Object) (V_99_99)), ((java.lang.Object) (V_35_35)));
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
              pair.Pair_2 V_100_100 = ((gate2bel.Value2_0.Coref_2) HeadVar__2_2).F2;
              gate2bel.Str2_0 V_101_101 = ((gate2bel.Value2_0.Coref_2) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
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
                    gate2bel.Str2_0 V_54_54 = ((gate2bel.Value2_0.Coref_2) HeadVar__3_3).F1;
                    pair.Pair_2 V_55_55 = ((gate2bel.Value2_0.Coref_2) HeadVar__3_3).F2;
                    builtin.Comparison_result_0 V_56_56 = null;

                    {
                      V_56_56 = gate2bel.__Compare____str2_0_0(V_101_101, V_54_54);
                    }
                    succeeded = (V_56_56.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_56_56;
                    else
                      {
                        jmercury.runtime.TypeInfo_Struct TypeInfo_95_95 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[27]);

                        {
                          HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_95_95, ((java.lang.Object) (V_100_100)), ((java.lang.Object) (V_55_55)));
                        }
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
              pair.Pair_2 V_102_102 = ((gate2bel.Value2_0.Corefs_2) HeadVar__2_2).F2;
              list.List_1 V_103_103 = ((gate2bel.Value2_0.Corefs_2) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
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
                    list.List_1 V_78_78 = ((gate2bel.Value2_0.Corefs_2) HeadVar__3_3).F1;
                    pair.Pair_2 V_79_79 = ((gate2bel.Value2_0.Corefs_2) HeadVar__3_3).F2;
                    builtin.Comparison_result_0 V_80_80 = null;
                    jmercury.runtime.TypeInfo_Struct TypeInfo_92_92 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[34]);

                    {
                      V_80_80 = builtin.compare_3_p_0(TypeInfo_92_92, ((java.lang.Object) (V_103_103)), ((java.lang.Object) (V_78_78)));
                    }
                    succeeded = (V_80_80.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_80_80;
                    else
                      {
                        jmercury.runtime.TypeInfo_Struct TypeInfo_93_93 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[27]);

                        {
                          HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_93_93, ((java.lang.Object) (V_102_102)), ((java.lang.Object) (V_79_79)));
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
  public static boolean __Unify____value2_0_0(
    gate2bel.Value2_0 HeadVar__1_1,
    gate2bel.Value2_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_17 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_18 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_17 == CastY_18);
      if (succeeded)
        succeeded = true;
      else
        switch (HeadVar__1_1.data_tag) {
          case 0:
            succeeded = (HeadVar__2_2.data_tag == 0);
            break;
          case 1:
            {
              gate2bel.Str2_0 V_3_3 = ((gate2bel.Value2_0.Str_1) HeadVar__1_1).F1;
              gate2bel.Str2_0 V_4_4 = null;

              succeeded = (HeadVar__2_2.data_tag == 1);
              if (succeeded)
                {
                  V_4_4 = ((gate2bel.Value2_0.Str_1) HeadVar__2_2).F1;
                  {
                    succeeded = gate2bel.__Unify____str2_0_0(V_3_3, V_4_4);
                  }
                }
            }
            break;
          case 2:
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_23_23 = null;
              list.List_1 V_5_5 = ((gate2bel.Value2_0.Strs_1) HeadVar__1_1).F1;
              list.List_1 V_6_6 = null;

              succeeded = (HeadVar__2_2.data_tag == 2);
              if (succeeded)
                {
                  V_6_6 = ((gate2bel.Value2_0.Strs_1) HeadVar__2_2).F1;
                  TypeInfo_23_23 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[34]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_23_23, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_6_6)));
                  }
                }
            }
            break;
          case 3:
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_19_19 = null;
              pair.Pair_2 V_7_7 = ((gate2bel.Value2_0.Coref_1) HeadVar__1_1).F1;
              pair.Pair_2 V_8_8 = null;

              succeeded = (HeadVar__2_2.data_tag == 3);
              if (succeeded)
                {
                  V_8_8 = ((gate2bel.Value2_0.Coref_1) HeadVar__2_2).F1;
                  TypeInfo_19_19 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[27]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_19_19, ((java.lang.Object) (V_7_7)), ((java.lang.Object) (V_8_8)));
                  }
                }
            }
            break;
          case 4:
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_20_20 = null;
              gate2bel.Str2_0 V_9_9 = ((gate2bel.Value2_0.Coref_2) HeadVar__1_1).F1;
              pair.Pair_2 V_10_10 = ((gate2bel.Value2_0.Coref_2) HeadVar__1_1).F2;
              gate2bel.Str2_0 V_11_11 = null;
              pair.Pair_2 V_12_12 = null;

              succeeded = (HeadVar__2_2.data_tag == 4);
              if (succeeded)
                {
                  V_11_11 = ((gate2bel.Value2_0.Coref_2) HeadVar__2_2).F1;
                  V_12_12 = ((gate2bel.Value2_0.Coref_2) HeadVar__2_2).F2;
                  {
                    succeeded = gate2bel.__Unify____str2_0_0(V_9_9, V_11_11);
                  }
                  if (succeeded)
                    {
                      TypeInfo_20_20 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[27]);
                      {
                        succeeded = builtin.unify_2_p_0(TypeInfo_20_20, ((java.lang.Object) (V_10_10)), ((java.lang.Object) (V_12_12)));
                      }
                    }
                }
            }
            break;
          case 5:
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_21_21 = null;
              jmercury.runtime.TypeInfo_Struct TypeInfo_22_22 = null;
              list.List_1 V_13_13 = ((gate2bel.Value2_0.Corefs_2) HeadVar__1_1).F1;
              pair.Pair_2 V_14_14 = ((gate2bel.Value2_0.Corefs_2) HeadVar__1_1).F2;
              list.List_1 V_15_15 = null;
              pair.Pair_2 V_16_16 = null;

              succeeded = (HeadVar__2_2.data_tag == 5);
              if (succeeded)
                {
                  V_15_15 = ((gate2bel.Value2_0.Corefs_2) HeadVar__2_2).F1;
                  V_16_16 = ((gate2bel.Value2_0.Corefs_2) HeadVar__2_2).F2;
                  TypeInfo_21_21 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[34]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_21_21, ((java.lang.Object) (V_13_13)), ((java.lang.Object) (V_15_15)));
                  }
                  if (succeeded)
                    {
                      TypeInfo_22_22 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[27]);
                      {
                        succeeded = builtin.unify_2_p_0(TypeInfo_22_22, ((java.lang.Object) (V_14_14)), ((java.lang.Object) (V_16_16)));
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
//  gate2bel.m:11
  public static builtin.Comparison_result_0 __Compare____value_0_0(
    gate2bel.Value_0 HeadVar__2_2,
    gate2bel.Value_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_90 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_91 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_90 == CastY_91);
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
              case 3:
                HeadVar__1_1 = builtin.Comparison_result_0.K2;
                break;
              case 4:
                HeadVar__1_1 = builtin.Comparison_result_0.K2;
                break;
              case 5:
                HeadVar__1_1 = builtin.Comparison_result_0.K2;
                break;
              default: /*NOTREACHED*/
                throw new jmercury.runtime.UnreachableDefault();
            }
            break;
          case 1:
            {
              java.lang.String V_104_104 = ((gate2bel.Value_0.Str_1) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 1:
                  {
                    java.lang.String V_5_5 = ((gate2bel.Value_0.Str_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_104_104, V_5_5);
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
              list.List_1 V_105_105 = ((gate2bel.Value_0.Strs_1) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 1:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 2:
                  {
                    jmercury.runtime.TypeInfo_Struct TypeInfo_97_97 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[20]);
                    list.List_1 V_20_20 = ((gate2bel.Value_0.Strs_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_97_97, ((java.lang.Object) (V_105_105)), ((java.lang.Object) (V_20_20)));
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
              pair.Pair_2 V_99_99 = ((gate2bel.Value_0.Coref_1) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 1:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 2:
                  HeadVar__1_1 = builtin.Comparison_result_0.K2;
                  break;
                case 3:
                  {
                    jmercury.runtime.TypeInfo_Struct TypeInfo_96_96 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[27]);
                    pair.Pair_2 V_35_35 = ((gate2bel.Value_0.Coref_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_96_96, ((java.lang.Object) (V_99_99)), ((java.lang.Object) (V_35_35)));
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
              pair.Pair_2 V_100_100 = ((gate2bel.Value_0.Coref_2) HeadVar__2_2).F2;
              java.lang.String V_101_101 = ((gate2bel.Value_0.Coref_2) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
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
                    java.lang.String V_54_54 = ((gate2bel.Value_0.Coref_2) HeadVar__3_3).F1;
                    pair.Pair_2 V_55_55 = ((gate2bel.Value_0.Coref_2) HeadVar__3_3).F2;
                    builtin.Comparison_result_0 V_56_56 = null;

                    {
                      V_56_56 = private_builtin.builtin_compare_string_3_p_0(V_101_101, V_54_54);
                    }
                    succeeded = (V_56_56.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_56_56;
                    else
                      {
                        jmercury.runtime.TypeInfo_Struct TypeInfo_95_95 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[27]);

                        {
                          HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_95_95, ((java.lang.Object) (V_100_100)), ((java.lang.Object) (V_55_55)));
                        }
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
              pair.Pair_2 V_102_102 = ((gate2bel.Value_0.Corefs_2) HeadVar__2_2).F2;
              list.List_1 V_103_103 = ((gate2bel.Value_0.Corefs_2) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
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
                    list.List_1 V_78_78 = ((gate2bel.Value_0.Corefs_2) HeadVar__3_3).F1;
                    pair.Pair_2 V_79_79 = ((gate2bel.Value_0.Corefs_2) HeadVar__3_3).F2;
                    builtin.Comparison_result_0 V_80_80 = null;
                    jmercury.runtime.TypeInfo_Struct TypeInfo_92_92 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[20]);

                    {
                      V_80_80 = builtin.compare_3_p_0(TypeInfo_92_92, ((java.lang.Object) (V_103_103)), ((java.lang.Object) (V_78_78)));
                    }
                    succeeded = (V_80_80.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_80_80;
                    else
                      {
                        jmercury.runtime.TypeInfo_Struct TypeInfo_93_93 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[27]);

                        {
                          HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_93_93, ((java.lang.Object) (V_102_102)), ((java.lang.Object) (V_79_79)));
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
  public static boolean __Unify____value_0_0(
    gate2bel.Value_0 HeadVar__1_1,
    gate2bel.Value_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_17 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_18 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_17 == CastY_18);
      if (succeeded)
        succeeded = true;
      else
        switch (HeadVar__1_1.data_tag) {
          case 0:
            succeeded = (HeadVar__2_2.data_tag == 0);
            break;
          case 1:
            {
              java.lang.String V_3_3 = ((gate2bel.Value_0.Str_1) HeadVar__1_1).F1;
              java.lang.String V_4_4 = null;

              succeeded = (HeadVar__2_2.data_tag == 1);
              if (succeeded)
                {
                  V_4_4 = ((gate2bel.Value_0.Str_1) HeadVar__2_2).F1;
                  succeeded = V_3_3.equals(V_4_4);
                }
            }
            break;
          case 2:
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_23_23 = null;
              list.List_1 V_5_5 = ((gate2bel.Value_0.Strs_1) HeadVar__1_1).F1;
              list.List_1 V_6_6 = null;

              succeeded = (HeadVar__2_2.data_tag == 2);
              if (succeeded)
                {
                  V_6_6 = ((gate2bel.Value_0.Strs_1) HeadVar__2_2).F1;
                  TypeInfo_23_23 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[20]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_23_23, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_6_6)));
                  }
                }
            }
            break;
          case 3:
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_19_19 = null;
              pair.Pair_2 V_7_7 = ((gate2bel.Value_0.Coref_1) HeadVar__1_1).F1;
              pair.Pair_2 V_8_8 = null;

              succeeded = (HeadVar__2_2.data_tag == 3);
              if (succeeded)
                {
                  V_8_8 = ((gate2bel.Value_0.Coref_1) HeadVar__2_2).F1;
                  TypeInfo_19_19 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[27]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_19_19, ((java.lang.Object) (V_7_7)), ((java.lang.Object) (V_8_8)));
                  }
                }
            }
            break;
          case 4:
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_20_20 = null;
              java.lang.String V_9_9 = ((gate2bel.Value_0.Coref_2) HeadVar__1_1).F1;
              pair.Pair_2 V_10_10 = ((gate2bel.Value_0.Coref_2) HeadVar__1_1).F2;
              java.lang.String V_11_11 = null;
              pair.Pair_2 V_12_12 = null;

              succeeded = (HeadVar__2_2.data_tag == 4);
              if (succeeded)
                {
                  V_11_11 = ((gate2bel.Value_0.Coref_2) HeadVar__2_2).F1;
                  V_12_12 = ((gate2bel.Value_0.Coref_2) HeadVar__2_2).F2;
                  succeeded = V_9_9.equals(V_11_11);
                  if (succeeded)
                    {
                      TypeInfo_20_20 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[27]);
                      {
                        succeeded = builtin.unify_2_p_0(TypeInfo_20_20, ((java.lang.Object) (V_10_10)), ((java.lang.Object) (V_12_12)));
                      }
                    }
                }
            }
            break;
          case 5:
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_21_21 = null;
              jmercury.runtime.TypeInfo_Struct TypeInfo_22_22 = null;
              list.List_1 V_13_13 = ((gate2bel.Value_0.Corefs_2) HeadVar__1_1).F1;
              pair.Pair_2 V_14_14 = ((gate2bel.Value_0.Corefs_2) HeadVar__1_1).F2;
              list.List_1 V_15_15 = null;
              pair.Pair_2 V_16_16 = null;

              succeeded = (HeadVar__2_2.data_tag == 5);
              if (succeeded)
                {
                  V_15_15 = ((gate2bel.Value_0.Corefs_2) HeadVar__2_2).F1;
                  V_16_16 = ((gate2bel.Value_0.Corefs_2) HeadVar__2_2).F2;
                  TypeInfo_21_21 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[20]);
                  {
                    succeeded = builtin.unify_2_p_0(TypeInfo_21_21, ((java.lang.Object) (V_13_13)), ((java.lang.Object) (V_15_15)));
                  }
                  if (succeeded)
                    {
                      TypeInfo_22_22 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[27]);
                      {
                        succeeded = builtin.unify_2_p_0(TypeInfo_22_22, ((java.lang.Object) (V_14_14)), ((java.lang.Object) (V_16_16)));
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
//  gate2bel.m:30
  public static builtin.Comparison_result_0 __Compare____triple3_0_0(
    gate2bel.Triple3_0 HeadVar__2_2,
    gate2bel.Triple3_0 HeadVar__3_3)
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
          int V_4_4 = ((gate2bel.Triple3_0) HeadVar__2_2).F1;
          gate2bel.Cvalue_0 V_5_5 = ((gate2bel.Triple3_0) HeadVar__2_2).F2;
          bool.Bool_0 V_6_6 = ((gate2bel.Triple3_0) HeadVar__2_2).F3;
          gate2bel.Cstring_0 V_7_7 = ((gate2bel.Triple3_0) HeadVar__2_2).F4;
          gate2bel.Cvalue_0 V_8_8 = ((gate2bel.Triple3_0) HeadVar__2_2).F5;
          maybe.Maybe_1 V_9_9 = ((gate2bel.Triple3_0) HeadVar__2_2).F6;
          int V_10_10 = ((gate2bel.Triple3_0) HeadVar__3_3).F1;
          gate2bel.Cvalue_0 V_11_11 = ((gate2bel.Triple3_0) HeadVar__3_3).F2;
          bool.Bool_0 V_12_12 = ((gate2bel.Triple3_0) HeadVar__3_3).F3;
          gate2bel.Cstring_0 V_13_13 = ((gate2bel.Triple3_0) HeadVar__3_3).F4;
          gate2bel.Cvalue_0 V_14_14 = ((gate2bel.Triple3_0) HeadVar__3_3).F5;
          maybe.Maybe_1 V_15_15 = ((gate2bel.Triple3_0) HeadVar__3_3).F6;
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
                V_17_17 = gate2bel.__Compare____cvalue_0_0(V_5_5, V_11_11);
              }
              succeeded = (V_17_17.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_17_17;
              else
                {
                  builtin.Comparison_result_0 V_18_18 = null;
                  int V_29_29 = (int) V_6_6.MR_value;
                  int V_30_30 = (int) V_12_12.MR_value;

                  {
                    V_18_18 = private_builtin.builtin_compare_int_3_p_0(V_29_29, V_30_30);
                  }
                  succeeded = (V_18_18.MR_value == builtin.Comparison_result_0.K0.MR_value);
                  succeeded = !(succeeded);
                  if (succeeded)
                    HeadVar__1_1 = V_18_18;
                  else
                    {
                      builtin.Comparison_result_0 V_19_19 = null;

                      {
                        V_19_19 = gate2bel.__Compare____cstring_0_0(V_7_7, V_13_13);
                      }
                      succeeded = (V_19_19.MR_value == builtin.Comparison_result_0.K0.MR_value);
                      succeeded = !(succeeded);
                      if (succeeded)
                        HeadVar__1_1 = V_19_19;
                      else
                        {
                          builtin.Comparison_result_0 V_20_20 = null;

                          {
                            V_20_20 = gate2bel.__Compare____cvalue_0_0(V_8_8, V_14_14);
                          }
                          succeeded = (V_20_20.MR_value == builtin.Comparison_result_0.K0.MR_value);
                          succeeded = !(succeeded);
                          if (succeeded)
                            HeadVar__1_1 = V_20_20;
                          else
                            {
                              jmercury.runtime.TypeInfo_Struct TypeInfo_28_28 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[33]);

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
  public static boolean __Unify____triple3_0_0(
    gate2bel.Triple3_0 HeadVar__1_1,
    gate2bel.Triple3_0 HeadVar__2_2)
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
          int V_3_3 = ((gate2bel.Triple3_0) HeadVar__1_1).F1;
          gate2bel.Cvalue_0 V_4_4 = ((gate2bel.Triple3_0) HeadVar__1_1).F2;
          bool.Bool_0 V_5_5 = ((gate2bel.Triple3_0) HeadVar__1_1).F3;
          gate2bel.Cstring_0 V_6_6 = ((gate2bel.Triple3_0) HeadVar__1_1).F4;
          gate2bel.Cvalue_0 V_7_7 = ((gate2bel.Triple3_0) HeadVar__1_1).F5;
          maybe.Maybe_1 V_8_8 = ((gate2bel.Triple3_0) HeadVar__1_1).F6;
          int V_9_9 = ((gate2bel.Triple3_0) HeadVar__2_2).F1;
          gate2bel.Cvalue_0 V_10_10 = ((gate2bel.Triple3_0) HeadVar__2_2).F2;
          bool.Bool_0 V_11_11 = ((gate2bel.Triple3_0) HeadVar__2_2).F3;
          gate2bel.Cstring_0 V_12_12 = ((gate2bel.Triple3_0) HeadVar__2_2).F4;
          gate2bel.Cvalue_0 V_13_13 = ((gate2bel.Triple3_0) HeadVar__2_2).F5;
          maybe.Maybe_1 V_14_14 = ((gate2bel.Triple3_0) HeadVar__2_2).F6;

          succeeded = (V_3_3 == V_9_9);
          if (succeeded)
            {
              {
                succeeded = gate2bel.__Unify____cvalue_0_0(V_4_4, V_10_10);
              }
              if (succeeded)
                {
                  succeeded = (V_5_5.MR_value == V_11_11.MR_value);
                  if (succeeded)
                    {
                      {
                        succeeded = gate2bel.__Unify____cstring_0_0(V_6_6, V_12_12);
                      }
                      if (succeeded)
                        {
                          {
                            succeeded = gate2bel.__Unify____cvalue_0_0(V_7_7, V_13_13);
                          }
                          if (succeeded)
                            {
                              TypeInfo_17_17 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[33]);
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
//  gate2bel.m:21
  public static builtin.Comparison_result_0 __Compare____triple2_0_0(
    gate2bel.Triple2_0 HeadVar__2_2,
    gate2bel.Triple2_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_57 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_58 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_57 == CastY_58);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        if ((HeadVar__2_2.data_tag == 0))
          {
            gate2bel.Value2_0 V_70_70 = ((gate2bel.Triple2_0.Triple_5) HeadVar__2_2).F5;
            gate2bel.Value2_0 V_71_71 = ((gate2bel.Triple2_0.Triple_5) HeadVar__2_2).F4;
            bool.Bool_0 V_72_72 = ((gate2bel.Triple2_0.Triple_5) HeadVar__2_2).F3;
            gate2bel.Value2_0 V_73_73 = ((gate2bel.Triple2_0.Triple_5) HeadVar__2_2).F2;
            int V_74_74 = ((gate2bel.Triple2_0.Triple_5) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 0))
              {
                int V_9_9 = ((gate2bel.Triple2_0.Triple_5) HeadVar__3_3).F1;
                gate2bel.Value2_0 V_10_10 = ((gate2bel.Triple2_0.Triple_5) HeadVar__3_3).F2;
                bool.Bool_0 V_11_11 = ((gate2bel.Triple2_0.Triple_5) HeadVar__3_3).F3;
                gate2bel.Value2_0 V_12_12 = ((gate2bel.Triple2_0.Triple_5) HeadVar__3_3).F4;
                gate2bel.Value2_0 V_13_13 = ((gate2bel.Triple2_0.Triple_5) HeadVar__3_3).F5;
                builtin.Comparison_result_0 V_14_14 = null;

                {
                  V_14_14 = private_builtin.builtin_compare_int_3_p_0(V_74_74, V_9_9);
                }
                succeeded = (V_14_14.MR_value == builtin.Comparison_result_0.K0.MR_value);
                succeeded = !(succeeded);
                if (succeeded)
                  HeadVar__1_1 = V_14_14;
                else
                  {
                    builtin.Comparison_result_0 V_15_15 = null;

                    {
                      V_15_15 = gate2bel.__Compare____value2_0_0(V_73_73, V_10_10);
                    }
                    succeeded = (V_15_15.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_15_15;
                    else
                      {
                        builtin.Comparison_result_0 V_16_16 = null;
                        int V_81_81 = (int) V_72_72.MR_value;
                        int V_82_82 = (int) V_11_11.MR_value;

                        {
                          V_16_16 = private_builtin.builtin_compare_int_3_p_0(V_81_81, V_82_82);
                        }
                        succeeded = (V_16_16.MR_value == builtin.Comparison_result_0.K0.MR_value);
                        succeeded = !(succeeded);
                        if (succeeded)
                          HeadVar__1_1 = V_16_16;
                        else
                          {
                            builtin.Comparison_result_0 V_17_17 = null;

                            {
                              V_17_17 = gate2bel.__Compare____value2_0_0(V_71_71, V_12_12);
                            }
                            succeeded = (V_17_17.MR_value == builtin.Comparison_result_0.K0.MR_value);
                            succeeded = !(succeeded);
                            if (succeeded)
                              HeadVar__1_1 = V_17_17;
                            else
                              {
                                HeadVar__1_1 = gate2bel.__Compare____value2_0_0(V_70_70, V_13_13);
                              }
                          }
                      }
                  }
              }
            else
              HeadVar__1_1 = builtin.Comparison_result_0.K1;
          }
        else
          {
            int V_75_75 = ((gate2bel.Triple2_0.Triple_6) HeadVar__2_2).F6;
            gate2bel.Value2_0 V_76_76 = ((gate2bel.Triple2_0.Triple_6) HeadVar__2_2).F5;
            gate2bel.Value2_0 V_77_77 = ((gate2bel.Triple2_0.Triple_6) HeadVar__2_2).F4;
            bool.Bool_0 V_78_78 = ((gate2bel.Triple2_0.Triple_6) HeadVar__2_2).F3;
            gate2bel.Value2_0 V_79_79 = ((gate2bel.Triple2_0.Triple_6) HeadVar__2_2).F2;
            int V_80_80 = ((gate2bel.Triple2_0.Triple_6) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 0))
              HeadVar__1_1 = builtin.Comparison_result_0.K2;
            else
              {
                int V_46_46 = ((gate2bel.Triple2_0.Triple_6) HeadVar__3_3).F1;
                gate2bel.Value2_0 V_47_47 = ((gate2bel.Triple2_0.Triple_6) HeadVar__3_3).F2;
                bool.Bool_0 V_48_48 = ((gate2bel.Triple2_0.Triple_6) HeadVar__3_3).F3;
                gate2bel.Value2_0 V_49_49 = ((gate2bel.Triple2_0.Triple_6) HeadVar__3_3).F4;
                gate2bel.Value2_0 V_50_50 = ((gate2bel.Triple2_0.Triple_6) HeadVar__3_3).F5;
                int V_51_51 = ((gate2bel.Triple2_0.Triple_6) HeadVar__3_3).F6;
                builtin.Comparison_result_0 V_52_52 = null;

                {
                  V_52_52 = private_builtin.builtin_compare_int_3_p_0(V_80_80, V_46_46);
                }
                succeeded = (V_52_52.MR_value == builtin.Comparison_result_0.K0.MR_value);
                succeeded = !(succeeded);
                if (succeeded)
                  HeadVar__1_1 = V_52_52;
                else
                  {
                    builtin.Comparison_result_0 V_53_53 = null;

                    {
                      V_53_53 = gate2bel.__Compare____value2_0_0(V_79_79, V_47_47);
                    }
                    succeeded = (V_53_53.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_53_53;
                    else
                      {
                        builtin.Comparison_result_0 V_54_54 = null;
                        int V_83_83 = (int) V_78_78.MR_value;
                        int V_84_84 = (int) V_48_48.MR_value;

                        {
                          V_54_54 = private_builtin.builtin_compare_int_3_p_0(V_83_83, V_84_84);
                        }
                        succeeded = (V_54_54.MR_value == builtin.Comparison_result_0.K0.MR_value);
                        succeeded = !(succeeded);
                        if (succeeded)
                          HeadVar__1_1 = V_54_54;
                        else
                          {
                            builtin.Comparison_result_0 V_55_55 = null;

                            {
                              V_55_55 = gate2bel.__Compare____value2_0_0(V_77_77, V_49_49);
                            }
                            succeeded = (V_55_55.MR_value == builtin.Comparison_result_0.K0.MR_value);
                            succeeded = !(succeeded);
                            if (succeeded)
                              HeadVar__1_1 = V_55_55;
                            else
                              {
                                builtin.Comparison_result_0 V_56_56 = null;

                                {
                                  V_56_56 = gate2bel.__Compare____value2_0_0(V_76_76, V_50_50);
                                }
                                succeeded = (V_56_56.MR_value == builtin.Comparison_result_0.K0.MR_value);
                                succeeded = !(succeeded);
                                if (succeeded)
                                  HeadVar__1_1 = V_56_56;
                                else
                                  {
                                    HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_75_75, V_51_51);
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
  public static boolean __Unify____triple2_0_0(
    gate2bel.Triple2_0 HeadVar__1_1,
    gate2bel.Triple2_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_25 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_26 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_25 == CastY_26);
      if (succeeded)
        succeeded = true;
      else
        if ((HeadVar__1_1.data_tag == 0))
          {
            int V_3_3 = ((gate2bel.Triple2_0.Triple_5) HeadVar__1_1).F1;
            gate2bel.Value2_0 V_4_4 = ((gate2bel.Triple2_0.Triple_5) HeadVar__1_1).F2;
            bool.Bool_0 V_5_5 = ((gate2bel.Triple2_0.Triple_5) HeadVar__1_1).F3;
            gate2bel.Value2_0 V_6_6 = ((gate2bel.Triple2_0.Triple_5) HeadVar__1_1).F4;
            gate2bel.Value2_0 V_7_7 = ((gate2bel.Triple2_0.Triple_5) HeadVar__1_1).F5;
            int V_8_8 = 0;
            gate2bel.Value2_0 V_9_9 = null;
            bool.Bool_0 V_10_10 = null;
            gate2bel.Value2_0 V_11_11 = null;
            gate2bel.Value2_0 V_12_12 = null;

            succeeded = (HeadVar__2_2.data_tag == 0);
            if (succeeded)
              {
                V_8_8 = ((gate2bel.Triple2_0.Triple_5) HeadVar__2_2).F1;
                V_9_9 = ((gate2bel.Triple2_0.Triple_5) HeadVar__2_2).F2;
                V_10_10 = ((gate2bel.Triple2_0.Triple_5) HeadVar__2_2).F3;
                V_11_11 = ((gate2bel.Triple2_0.Triple_5) HeadVar__2_2).F4;
                V_12_12 = ((gate2bel.Triple2_0.Triple_5) HeadVar__2_2).F5;
                succeeded = (V_3_3 == V_8_8);
                if (succeeded)
                  {
                    {
                      succeeded = gate2bel.__Unify____value2_0_0(V_4_4, V_9_9);
                    }
                    if (succeeded)
                      {
                        succeeded = (V_5_5.MR_value == V_10_10.MR_value);
                        if (succeeded)
                          {
                            {
                              succeeded = gate2bel.__Unify____value2_0_0(V_6_6, V_11_11);
                            }
                            if (succeeded)
                              {
                                succeeded = gate2bel.__Unify____value2_0_0(V_7_7, V_12_12);
                              }
                          }
                      }
                  }
              }
          }
        else
          {
            int V_13_13 = ((gate2bel.Triple2_0.Triple_6) HeadVar__1_1).F1;
            gate2bel.Value2_0 V_14_14 = ((gate2bel.Triple2_0.Triple_6) HeadVar__1_1).F2;
            bool.Bool_0 V_15_15 = ((gate2bel.Triple2_0.Triple_6) HeadVar__1_1).F3;
            gate2bel.Value2_0 V_16_16 = ((gate2bel.Triple2_0.Triple_6) HeadVar__1_1).F4;
            gate2bel.Value2_0 V_17_17 = ((gate2bel.Triple2_0.Triple_6) HeadVar__1_1).F5;
            int V_18_18 = ((gate2bel.Triple2_0.Triple_6) HeadVar__1_1).F6;
            int V_19_19 = 0;
            gate2bel.Value2_0 V_20_20 = null;
            bool.Bool_0 V_21_21 = null;
            gate2bel.Value2_0 V_22_22 = null;
            gate2bel.Value2_0 V_23_23 = null;
            int V_24_24 = 0;

            succeeded = (HeadVar__2_2.data_tag == 1);
            if (succeeded)
              {
                V_19_19 = ((gate2bel.Triple2_0.Triple_6) HeadVar__2_2).F1;
                V_20_20 = ((gate2bel.Triple2_0.Triple_6) HeadVar__2_2).F2;
                V_21_21 = ((gate2bel.Triple2_0.Triple_6) HeadVar__2_2).F3;
                V_22_22 = ((gate2bel.Triple2_0.Triple_6) HeadVar__2_2).F4;
                V_23_23 = ((gate2bel.Triple2_0.Triple_6) HeadVar__2_2).F5;
                V_24_24 = ((gate2bel.Triple2_0.Triple_6) HeadVar__2_2).F6;
                succeeded = (V_13_13 == V_19_19);
                if (succeeded)
                  {
                    {
                      succeeded = gate2bel.__Unify____value2_0_0(V_14_14, V_20_20);
                    }
                    if (succeeded)
                      {
                        succeeded = (V_15_15.MR_value == V_21_21.MR_value);
                        if (succeeded)
                          {
                            {
                              succeeded = gate2bel.__Unify____value2_0_0(V_16_16, V_22_22);
                            }
                            if (succeeded)
                              {
                                {
                                  succeeded = gate2bel.__Unify____value2_0_0(V_17_17, V_23_23);
                                }
                                if (succeeded)
                                  succeeded = (V_18_18 == V_24_24);
                              }
                          }
                      }
                  }
              }
          }
      return succeeded;
    }
  }
//  gate2bel.m:9
  public static builtin.Comparison_result_0 __Compare____triple_0_0(
    gate2bel.Triple_0 HeadVar__2_2,
    gate2bel.Triple_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_47 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_48 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_47 == CastY_48);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        if ((HeadVar__2_2.data_tag == 0))
          {
            gate2bel.Value_0 V_58_58 = ((gate2bel.Triple_0.Triple_4) HeadVar__2_2).F4;
            gate2bel.Value_0 V_59_59 = ((gate2bel.Triple_0.Triple_4) HeadVar__2_2).F3;
            gate2bel.Value_0 V_60_60 = ((gate2bel.Triple_0.Triple_4) HeadVar__2_2).F2;
            int V_61_61 = ((gate2bel.Triple_0.Triple_4) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 0))
              {
                int V_8_8 = ((gate2bel.Triple_0.Triple_4) HeadVar__3_3).F1;
                gate2bel.Value_0 V_9_9 = ((gate2bel.Triple_0.Triple_4) HeadVar__3_3).F2;
                gate2bel.Value_0 V_10_10 = ((gate2bel.Triple_0.Triple_4) HeadVar__3_3).F3;
                gate2bel.Value_0 V_11_11 = ((gate2bel.Triple_0.Triple_4) HeadVar__3_3).F4;
                builtin.Comparison_result_0 V_12_12 = null;

                {
                  V_12_12 = private_builtin.builtin_compare_int_3_p_0(V_61_61, V_8_8);
                }
                succeeded = (V_12_12.MR_value == builtin.Comparison_result_0.K0.MR_value);
                succeeded = !(succeeded);
                if (succeeded)
                  HeadVar__1_1 = V_12_12;
                else
                  {
                    builtin.Comparison_result_0 V_13_13 = null;

                    {
                      V_13_13 = gate2bel.__Compare____value_0_0(V_60_60, V_9_9);
                    }
                    succeeded = (V_13_13.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_13_13;
                    else
                      {
                        builtin.Comparison_result_0 V_14_14 = null;

                        {
                          V_14_14 = gate2bel.__Compare____value_0_0(V_59_59, V_10_10);
                        }
                        succeeded = (V_14_14.MR_value == builtin.Comparison_result_0.K0.MR_value);
                        succeeded = !(succeeded);
                        if (succeeded)
                          HeadVar__1_1 = V_14_14;
                        else
                          {
                            HeadVar__1_1 = gate2bel.__Compare____value_0_0(V_58_58, V_11_11);
                          }
                      }
                  }
              }
            else
              HeadVar__1_1 = builtin.Comparison_result_0.K1;
          }
        else
          {
            int V_62_62 = ((gate2bel.Triple_0.Triple_5) HeadVar__2_2).F5;
            gate2bel.Value_0 V_63_63 = ((gate2bel.Triple_0.Triple_5) HeadVar__2_2).F4;
            gate2bel.Value_0 V_64_64 = ((gate2bel.Triple_0.Triple_5) HeadVar__2_2).F3;
            gate2bel.Value_0 V_65_65 = ((gate2bel.Triple_0.Triple_5) HeadVar__2_2).F2;
            int V_66_66 = ((gate2bel.Triple_0.Triple_5) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 0))
              HeadVar__1_1 = builtin.Comparison_result_0.K2;
            else
              {
                int V_38_38 = ((gate2bel.Triple_0.Triple_5) HeadVar__3_3).F1;
                gate2bel.Value_0 V_39_39 = ((gate2bel.Triple_0.Triple_5) HeadVar__3_3).F2;
                gate2bel.Value_0 V_40_40 = ((gate2bel.Triple_0.Triple_5) HeadVar__3_3).F3;
                gate2bel.Value_0 V_41_41 = ((gate2bel.Triple_0.Triple_5) HeadVar__3_3).F4;
                int V_42_42 = ((gate2bel.Triple_0.Triple_5) HeadVar__3_3).F5;
                builtin.Comparison_result_0 V_43_43 = null;

                {
                  V_43_43 = private_builtin.builtin_compare_int_3_p_0(V_66_66, V_38_38);
                }
                succeeded = (V_43_43.MR_value == builtin.Comparison_result_0.K0.MR_value);
                succeeded = !(succeeded);
                if (succeeded)
                  HeadVar__1_1 = V_43_43;
                else
                  {
                    builtin.Comparison_result_0 V_44_44 = null;

                    {
                      V_44_44 = gate2bel.__Compare____value_0_0(V_65_65, V_39_39);
                    }
                    succeeded = (V_44_44.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_44_44;
                    else
                      {
                        builtin.Comparison_result_0 V_45_45 = null;

                        {
                          V_45_45 = gate2bel.__Compare____value_0_0(V_64_64, V_40_40);
                        }
                        succeeded = (V_45_45.MR_value == builtin.Comparison_result_0.K0.MR_value);
                        succeeded = !(succeeded);
                        if (succeeded)
                          HeadVar__1_1 = V_45_45;
                        else
                          {
                            builtin.Comparison_result_0 V_46_46 = null;

                            {
                              V_46_46 = gate2bel.__Compare____value_0_0(V_63_63, V_41_41);
                            }
                            succeeded = (V_46_46.MR_value == builtin.Comparison_result_0.K0.MR_value);
                            succeeded = !(succeeded);
                            if (succeeded)
                              HeadVar__1_1 = V_46_46;
                            else
                              {
                                HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_62_62, V_42_42);
                              }
                          }
                      }
                  }
              }
          }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____triple_0_0(
    gate2bel.Triple_0 HeadVar__1_1,
    gate2bel.Triple_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_21 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_22 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_21 == CastY_22);
      if (succeeded)
        succeeded = true;
      else
        if ((HeadVar__1_1.data_tag == 0))
          {
            int V_3_3 = ((gate2bel.Triple_0.Triple_4) HeadVar__1_1).F1;
            gate2bel.Value_0 V_4_4 = ((gate2bel.Triple_0.Triple_4) HeadVar__1_1).F2;
            gate2bel.Value_0 V_5_5 = ((gate2bel.Triple_0.Triple_4) HeadVar__1_1).F3;
            gate2bel.Value_0 V_6_6 = ((gate2bel.Triple_0.Triple_4) HeadVar__1_1).F4;
            int V_7_7 = 0;
            gate2bel.Value_0 V_8_8 = null;
            gate2bel.Value_0 V_9_9 = null;
            gate2bel.Value_0 V_10_10 = null;

            succeeded = (HeadVar__2_2.data_tag == 0);
            if (succeeded)
              {
                V_7_7 = ((gate2bel.Triple_0.Triple_4) HeadVar__2_2).F1;
                V_8_8 = ((gate2bel.Triple_0.Triple_4) HeadVar__2_2).F2;
                V_9_9 = ((gate2bel.Triple_0.Triple_4) HeadVar__2_2).F3;
                V_10_10 = ((gate2bel.Triple_0.Triple_4) HeadVar__2_2).F4;
                succeeded = (V_3_3 == V_7_7);
                if (succeeded)
                  {
                    {
                      succeeded = gate2bel.__Unify____value_0_0(V_4_4, V_8_8);
                    }
                    if (succeeded)
                      {
                        {
                          succeeded = gate2bel.__Unify____value_0_0(V_5_5, V_9_9);
                        }
                        if (succeeded)
                          {
                            succeeded = gate2bel.__Unify____value_0_0(V_6_6, V_10_10);
                          }
                      }
                  }
              }
          }
        else
          {
            int V_11_11 = ((gate2bel.Triple_0.Triple_5) HeadVar__1_1).F1;
            gate2bel.Value_0 V_12_12 = ((gate2bel.Triple_0.Triple_5) HeadVar__1_1).F2;
            gate2bel.Value_0 V_13_13 = ((gate2bel.Triple_0.Triple_5) HeadVar__1_1).F3;
            gate2bel.Value_0 V_14_14 = ((gate2bel.Triple_0.Triple_5) HeadVar__1_1).F4;
            int V_15_15 = ((gate2bel.Triple_0.Triple_5) HeadVar__1_1).F5;
            int V_16_16 = 0;
            gate2bel.Value_0 V_17_17 = null;
            gate2bel.Value_0 V_18_18 = null;
            gate2bel.Value_0 V_19_19 = null;
            int V_20_20 = 0;

            succeeded = (HeadVar__2_2.data_tag == 1);
            if (succeeded)
              {
                V_16_16 = ((gate2bel.Triple_0.Triple_5) HeadVar__2_2).F1;
                V_17_17 = ((gate2bel.Triple_0.Triple_5) HeadVar__2_2).F2;
                V_18_18 = ((gate2bel.Triple_0.Triple_5) HeadVar__2_2).F3;
                V_19_19 = ((gate2bel.Triple_0.Triple_5) HeadVar__2_2).F4;
                V_20_20 = ((gate2bel.Triple_0.Triple_5) HeadVar__2_2).F5;
                succeeded = (V_11_11 == V_16_16);
                if (succeeded)
                  {
                    {
                      succeeded = gate2bel.__Unify____value_0_0(V_12_12, V_17_17);
                    }
                    if (succeeded)
                      {
                        {
                          succeeded = gate2bel.__Unify____value_0_0(V_13_13, V_18_18);
                        }
                        if (succeeded)
                          {
                            {
                              succeeded = gate2bel.__Unify____value_0_0(V_14_14, V_19_19);
                            }
                            if (succeeded)
                              succeeded = (V_15_15 == V_20_20);
                          }
                      }
                  }
              }
          }
      return succeeded;
    }
  }
//  gate2bel.m:85
  private static builtin.Comparison_result_0 __Compare____trid_0_0(
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
  private static boolean __Unify____trid_0_0(
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
//  gate2bel.m:28
  public static builtin.Comparison_result_0 __Compare____tnfile3_0_0(
    gate2bel.Tnfile3_0 HeadVar__2_2,
    gate2bel.Tnfile3_0 HeadVar__3_3)
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
          java.lang.String V_4_4 = ((gate2bel.Tnfile3_0) HeadVar__2_2).F1;
          list.List_1 V_5_5 = ((gate2bel.Tnfile3_0) HeadVar__2_2).F2;
          utils.Corefs_0 V_6_6 = ((gate2bel.Tnfile3_0) HeadVar__2_2).F3;
          java.lang.String V_7_7 = ((gate2bel.Tnfile3_0) HeadVar__3_3).F1;
          list.List_1 V_8_8 = ((gate2bel.Tnfile3_0) HeadVar__3_3).F2;
          utils.Corefs_0 V_9_9 = ((gate2bel.Tnfile3_0) HeadVar__3_3).F3;
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
              jmercury.runtime.TypeInfo_Struct TypeInfo_15_15 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[32]);

              {
                V_11_11 = builtin.compare_3_p_0(TypeInfo_15_15, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_8_8)));
              }
              succeeded = (V_11_11.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_11_11;
              else
                {
                  HeadVar__1_1 = utils.__Compare____corefs_0_0(V_6_6, V_9_9);
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____tnfile3_0_0(
    gate2bel.Tnfile3_0 HeadVar__1_1,
    gate2bel.Tnfile3_0 HeadVar__2_2)
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
          java.lang.String V_3_3 = ((gate2bel.Tnfile3_0) HeadVar__1_1).F1;
          list.List_1 V_4_4 = ((gate2bel.Tnfile3_0) HeadVar__1_1).F2;
          utils.Corefs_0 V_5_5 = ((gate2bel.Tnfile3_0) HeadVar__1_1).F3;
          java.lang.String V_6_6 = ((gate2bel.Tnfile3_0) HeadVar__2_2).F1;
          list.List_1 V_7_7 = ((gate2bel.Tnfile3_0) HeadVar__2_2).F2;
          utils.Corefs_0 V_8_8 = ((gate2bel.Tnfile3_0) HeadVar__2_2).F3;

          succeeded = V_3_3.equals(V_6_6);
          if (succeeded)
            {
              TypeInfo_11_11 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[32]);
              {
                succeeded = builtin.unify_2_p_0(TypeInfo_11_11, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_7_7)));
              }
              if (succeeded)
                {
                  succeeded = utils.__Unify____corefs_0_0(V_5_5, V_8_8);
                }
            }
        }
      return succeeded;
    }
  }
//  gate2bel.m:18
  public static builtin.Comparison_result_0 __Compare____tnfile2_0_0(
    gate2bel.Tnfile2_0 HeadVar__2_2,
    gate2bel.Tnfile2_0 HeadVar__3_3)
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
          java.lang.String V_4_4 = ((gate2bel.Tnfile2_0) HeadVar__2_2).F1;
          list.List_1 V_5_5 = ((gate2bel.Tnfile2_0) HeadVar__2_2).F2;
          java.lang.String V_6_6 = ((gate2bel.Tnfile2_0) HeadVar__3_3).F1;
          list.List_1 V_7_7 = ((gate2bel.Tnfile2_0) HeadVar__3_3).F2;
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
              jmercury.runtime.TypeInfo_Struct TypeInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[31]);

              {
                HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_12_12, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_7_7)));
              }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____tnfile2_0_0(
    gate2bel.Tnfile2_0 HeadVar__1_1,
    gate2bel.Tnfile2_0 HeadVar__2_2)
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
          java.lang.String V_3_3 = ((gate2bel.Tnfile2_0) HeadVar__1_1).F1;
          list.List_1 V_4_4 = ((gate2bel.Tnfile2_0) HeadVar__1_1).F2;
          java.lang.String V_5_5 = ((gate2bel.Tnfile2_0) HeadVar__2_2).F1;
          list.List_1 V_6_6 = ((gate2bel.Tnfile2_0) HeadVar__2_2).F2;

          succeeded = V_3_3.equals(V_5_5);
          if (succeeded)
            {
              TypeInfo_9_9 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[31]);
              {
                succeeded = builtin.unify_2_p_0(TypeInfo_9_9, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_6_6)));
              }
            }
        }
      return succeeded;
    }
  }
//  gate2bel.m:6
  public static builtin.Comparison_result_0 __Compare____tnfile_0_0(
    gate2bel.Tnfile_0 HeadVar__2_2,
    gate2bel.Tnfile_0 HeadVar__3_3)
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
          java.lang.String V_4_4 = ((gate2bel.Tnfile_0) HeadVar__2_2).F1;
          list.List_1 V_5_5 = ((gate2bel.Tnfile_0) HeadVar__2_2).F2;
          java.lang.String V_6_6 = ((gate2bel.Tnfile_0) HeadVar__3_3).F1;
          list.List_1 V_7_7 = ((gate2bel.Tnfile_0) HeadVar__3_3).F2;
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
              jmercury.runtime.TypeInfo_Struct TypeInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[30]);

              {
                HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_12_12, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_7_7)));
              }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____tnfile_0_0(
    gate2bel.Tnfile_0 HeadVar__1_1,
    gate2bel.Tnfile_0 HeadVar__2_2)
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
          java.lang.String V_3_3 = ((gate2bel.Tnfile_0) HeadVar__1_1).F1;
          list.List_1 V_4_4 = ((gate2bel.Tnfile_0) HeadVar__1_1).F2;
          java.lang.String V_5_5 = ((gate2bel.Tnfile_0) HeadVar__2_2).F1;
          list.List_1 V_6_6 = ((gate2bel.Tnfile_0) HeadVar__2_2).F2;

          succeeded = V_3_3.equals(V_5_5);
          if (succeeded)
            {
              TypeInfo_9_9 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[30]);
              {
                succeeded = builtin.unify_2_p_0(TypeInfo_9_9, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_6_6)));
              }
            }
        }
      return succeeded;
    }
  }
//  gate2bel.m:89
  private static builtin.Comparison_result_0 __Compare____tmpmod_0_0(
    gate2bel.Tmpmod_0 HeadVar__2_2,
    gate2bel.Tmpmod_0 HeadVar__3_3)
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
          gate2bel.Tmpagt_0 V_4_4 = ((gate2bel.Tmpmod_0) HeadVar__2_2).F1;
          bool.Bool_0 V_5_5 = ((gate2bel.Tmpmod_0) HeadVar__2_2).F2;
          gate2bel.Tmpagt_0 V_7_7 = ((gate2bel.Tmpmod_0) HeadVar__3_3).F1;
          bool.Bool_0 V_8_8 = ((gate2bel.Tmpmod_0) HeadVar__3_3).F2;
          builtin.Comparison_result_0 V_10_10 = null;

          {
            V_10_10 = gate2bel.__Compare____tmpagt_0_0(V_4_4, V_7_7);
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
  private static boolean __Unify____tmpmod_0_0(
    gate2bel.Tmpmod_0 HeadVar__1_1,
    gate2bel.Tmpmod_0 HeadVar__2_2)
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
          gate2bel.Tmpagt_0 V_3_3 = ((gate2bel.Tmpmod_0) HeadVar__1_1).F1;
          bool.Bool_0 V_4_4 = ((gate2bel.Tmpmod_0) HeadVar__1_1).F2;
          gate2bel.Tmpagt_0 V_6_6 = ((gate2bel.Tmpmod_0) HeadVar__2_2).F1;
          bool.Bool_0 V_7_7 = ((gate2bel.Tmpmod_0) HeadVar__2_2).F2;

          {
            succeeded = gate2bel.__Unify____tmpagt_0_0(V_3_3, V_6_6);
          }
          if (succeeded)
            succeeded = (V_4_4.MR_value == V_7_7.MR_value);
        }
      return succeeded;
    }
  }
//  gate2bel.m:90
  private static builtin.Comparison_result_0 __Compare____tmpagt_0_0(
    gate2bel.Tmpagt_0 HeadVar__2_2,
    gate2bel.Tmpagt_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_10 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_11 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_10 == CastY_11);
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
                HeadVar__1_1 = builtin.Comparison_result_0.K2;
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
              java.lang.String V_13_13 = ((gate2bel.Tmpagt_0.Str_1) HeadVar__2_2).F1;

              switch (HeadVar__3_3.data_tag) {
                case 0:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 1:
                  HeadVar__1_1 = builtin.Comparison_result_0.K1;
                  break;
                case 2:
                  {
                    java.lang.String V_5_5 = ((gate2bel.Tmpagt_0.Str_1) HeadVar__3_3).F1;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_13_13, V_5_5);
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
  private static boolean __Unify____tmpagt_0_0(
    gate2bel.Tmpagt_0 HeadVar__1_1,
    gate2bel.Tmpagt_0 HeadVar__2_2)
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
            {
              java.lang.String V_3_3 = ((gate2bel.Tmpagt_0.Str_1) HeadVar__1_1).F1;
              java.lang.String V_4_4 = null;

              succeeded = (HeadVar__2_2.data_tag == 2);
              if (succeeded)
                {
                  V_4_4 = ((gate2bel.Tmpagt_0.Str_1) HeadVar__2_2).F1;
                  succeeded = V_3_3.equals(V_4_4);
                }
            }
            break;
          default: /*NOTREACHED*/
            throw new jmercury.runtime.UnreachableDefault();
        }
      return succeeded;
    }
  }
//  gate2bel.m:16
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
//  gate2bel.m:26
  public static builtin.Comparison_result_0 __Compare____strtype_0_0(
    gate2bel.Strtype_0 HeadVar__2_2,
    gate2bel.Strtype_0 HeadVar__3_3)
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
                HeadVar__1_1 = builtin.Comparison_result_0.K2;
                break;
              default: /*NOTREACHED*/
                throw new jmercury.runtime.UnreachableDefault();
            }
            break;
          case 3:
            {
              wordnet.Prontp_0 V_25_25 = ((gate2bel.Strtype_0.Pronoun_2) HeadVar__2_2).F2;
              java.lang.String V_26_26 = ((gate2bel.Strtype_0.Pronoun_2) HeadVar__2_2).F1;

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
                  {
                    java.lang.String V_10_10 = ((gate2bel.Strtype_0.Pronoun_2) HeadVar__3_3).F1;
                    wordnet.Prontp_0 V_11_11 = ((gate2bel.Strtype_0.Pronoun_2) HeadVar__3_3).F2;
                    builtin.Comparison_result_0 V_12_12 = null;

                    {
                      V_12_12 = private_builtin.builtin_compare_string_3_p_0(V_26_26, V_10_10);
                    }
                    succeeded = (V_12_12.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_12_12;
                    else
                      {
                        int V_27_27 = (int) V_25_25.MR_value;
                        int V_28_28 = (int) V_11_11.MR_value;

                        {
                          HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_27_27, V_28_28);
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
  public static boolean __Unify____strtype_0_0(
    gate2bel.Strtype_0 HeadVar__1_1,
    gate2bel.Strtype_0 HeadVar__2_2)
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
            {
              java.lang.String V_3_3 = ((gate2bel.Strtype_0.Pronoun_2) HeadVar__1_1).F1;
              wordnet.Prontp_0 V_4_4 = ((gate2bel.Strtype_0.Pronoun_2) HeadVar__1_1).F2;
              java.lang.String V_5_5 = null;
              wordnet.Prontp_0 V_6_6 = null;

              succeeded = (HeadVar__2_2.data_tag == 3);
              if (succeeded)
                {
                  V_5_5 = ((gate2bel.Strtype_0.Pronoun_2) HeadVar__2_2).F1;
                  V_6_6 = ((gate2bel.Strtype_0.Pronoun_2) HeadVar__2_2).F2;
                  succeeded = V_3_3.equals(V_5_5);
                  if (succeeded)
                    succeeded = (V_4_4.MR_value == V_6_6.MR_value);
                }
            }
            break;
          default: /*NOTREACHED*/
            throw new jmercury.runtime.UnreachableDefault();
        }
      return succeeded;
    }
  }
//  gate2bel.m:25
  public static builtin.Comparison_result_0 __Compare____str2_0_0(
    gate2bel.Str2_0 HeadVar__2_2,
    gate2bel.Str2_0 HeadVar__3_3)
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
          java.lang.String V_4_4 = ((gate2bel.Str2_0) HeadVar__2_2).F1;
          gate2bel.Strtype_0 V_5_5 = ((gate2bel.Str2_0) HeadVar__2_2).F2;
          java.lang.String V_6_6 = ((gate2bel.Str2_0) HeadVar__3_3).F1;
          gate2bel.Strtype_0 V_7_7 = ((gate2bel.Str2_0) HeadVar__3_3).F2;
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
              HeadVar__1_1 = gate2bel.__Compare____strtype_0_0(V_5_5, V_7_7);
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____str2_0_0(
    gate2bel.Str2_0 HeadVar__1_1,
    gate2bel.Str2_0 HeadVar__2_2)
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
          java.lang.String V_3_3 = ((gate2bel.Str2_0) HeadVar__1_1).F1;
          gate2bel.Strtype_0 V_4_4 = ((gate2bel.Str2_0) HeadVar__1_1).F2;
          java.lang.String V_5_5 = ((gate2bel.Str2_0) HeadVar__2_2).F1;
          gate2bel.Strtype_0 V_6_6 = ((gate2bel.Str2_0) HeadVar__2_2).F2;

          succeeded = V_3_3.equals(V_5_5);
          if (succeeded)
            {
              succeeded = gate2bel.__Unify____strtype_0_0(V_4_4, V_6_6);
            }
        }
      return succeeded;
    }
  }
//  gate2bel.m:14
  public static builtin.Comparison_result_0 __Compare____reftype_0_0(
    gate2bel.Reftype_0 HeadVar__2_2,
    gate2bel.Reftype_0 HeadVar__3_3)
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
  public static boolean __Unify____reftype_0_0(
    gate2bel.Reftype_0 HeadVar__2_1,
    gate2bel.Reftype_0 HeadVar__2_2)
  {
    {
      boolean succeeded = (HeadVar__2_1.MR_value == HeadVar__2_2.MR_value);

      return succeeded;
    }
  }
//  gate2bel.m:37
  public static builtin.Comparison_result_0 __Compare____owltriple_0_0(
    gate2bel.Owltriple_0 HeadVar__2_2,
    gate2bel.Owltriple_0 HeadVar__3_3)
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
          int V_4_4 = ((gate2bel.Owltriple_0) HeadVar__2_2).F1;
          java.lang.String V_5_5 = ((gate2bel.Owltriple_0) HeadVar__2_2).F2;
          gate2bel.Owlstr_0 V_6_6 = ((gate2bel.Owltriple_0) HeadVar__2_2).F3;
          bool.Bool_0 V_7_7 = ((gate2bel.Owltriple_0) HeadVar__2_2).F4;
          gate2bel.Owlpr_0 V_8_8 = ((gate2bel.Owltriple_0) HeadVar__2_2).F5;
          maybe.Maybe_1 V_9_9 = ((gate2bel.Owltriple_0) HeadVar__2_2).F6;
          int V_10_10 = ((gate2bel.Owltriple_0) HeadVar__3_3).F1;
          java.lang.String V_11_11 = ((gate2bel.Owltriple_0) HeadVar__3_3).F2;
          gate2bel.Owlstr_0 V_12_12 = ((gate2bel.Owltriple_0) HeadVar__3_3).F3;
          bool.Bool_0 V_13_13 = ((gate2bel.Owltriple_0) HeadVar__3_3).F4;
          gate2bel.Owlpr_0 V_14_14 = ((gate2bel.Owltriple_0) HeadVar__3_3).F5;
          maybe.Maybe_1 V_15_15 = ((gate2bel.Owltriple_0) HeadVar__3_3).F6;
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
                    V_18_18 = gate2bel.__Compare____owlstr_0_0(V_6_6, V_12_12);
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
                            V_20_20 = gate2bel.__Compare____owlpr_0_0(V_8_8, V_14_14);
                          }
                          succeeded = (V_20_20.MR_value == builtin.Comparison_result_0.K0.MR_value);
                          succeeded = !(succeeded);
                          if (succeeded)
                            HeadVar__1_1 = V_20_20;
                          else
                            {
                              jmercury.runtime.TypeInfo_Struct TypeInfo_28_28 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[29]);

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
  public static boolean __Unify____owltriple_0_0(
    gate2bel.Owltriple_0 HeadVar__1_1,
    gate2bel.Owltriple_0 HeadVar__2_2)
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
          int V_3_3 = ((gate2bel.Owltriple_0) HeadVar__1_1).F1;
          java.lang.String V_4_4 = ((gate2bel.Owltriple_0) HeadVar__1_1).F2;
          gate2bel.Owlstr_0 V_5_5 = ((gate2bel.Owltriple_0) HeadVar__1_1).F3;
          bool.Bool_0 V_6_6 = ((gate2bel.Owltriple_0) HeadVar__1_1).F4;
          gate2bel.Owlpr_0 V_7_7 = ((gate2bel.Owltriple_0) HeadVar__1_1).F5;
          maybe.Maybe_1 V_8_8 = ((gate2bel.Owltriple_0) HeadVar__1_1).F6;
          int V_9_9 = ((gate2bel.Owltriple_0) HeadVar__2_2).F1;
          java.lang.String V_10_10 = ((gate2bel.Owltriple_0) HeadVar__2_2).F2;
          gate2bel.Owlstr_0 V_11_11 = ((gate2bel.Owltriple_0) HeadVar__2_2).F3;
          bool.Bool_0 V_12_12 = ((gate2bel.Owltriple_0) HeadVar__2_2).F4;
          gate2bel.Owlpr_0 V_13_13 = ((gate2bel.Owltriple_0) HeadVar__2_2).F5;
          maybe.Maybe_1 V_14_14 = ((gate2bel.Owltriple_0) HeadVar__2_2).F6;

          succeeded = (V_3_3 == V_9_9);
          if (succeeded)
            {
              succeeded = V_4_4.equals(V_10_10);
              if (succeeded)
                {
                  {
                    succeeded = gate2bel.__Unify____owlstr_0_0(V_5_5, V_11_11);
                  }
                  if (succeeded)
                    {
                      succeeded = (V_6_6.MR_value == V_12_12.MR_value);
                      if (succeeded)
                        {
                          {
                            succeeded = gate2bel.__Unify____owlpr_0_0(V_7_7, V_13_13);
                          }
                          if (succeeded)
                            {
                              TypeInfo_17_17 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[29]);
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
//  gate2bel.m:39
  public static builtin.Comparison_result_0 __Compare____owlstrtp_0_0(
    gate2bel.Owlstrtp_0 HeadVar__2_2,
    gate2bel.Owlstrtp_0 HeadVar__3_3)
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
                HeadVar__1_1 = builtin.Comparison_result_0.K2;
                break;
              default: /*NOTREACHED*/
                throw new jmercury.runtime.UnreachableDefault();
            }
            break;
          case 3:
            {
              wordnet.Prontp_0 V_15_15 = ((gate2bel.Owlstrtp_0.Pronoun_1) HeadVar__2_2).F1;

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
                  {
                    wordnet.Prontp_0 V_7_7 = ((gate2bel.Owlstrtp_0.Pronoun_1) HeadVar__3_3).F1;
                    int V_16_16 = (int) V_15_15.MR_value;
                    int V_17_17 = (int) V_7_7.MR_value;

                    {
                      HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_16_16, V_17_17);
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
  public static boolean __Unify____owlstrtp_0_0(
    gate2bel.Owlstrtp_0 HeadVar__1_1,
    gate2bel.Owlstrtp_0 HeadVar__2_2)
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
            {
              wordnet.Prontp_0 V_3_3 = ((gate2bel.Owlstrtp_0.Pronoun_1) HeadVar__1_1).F1;
              wordnet.Prontp_0 V_4_4 = null;

              succeeded = (HeadVar__2_2.data_tag == 3);
              if (succeeded)
                {
                  V_4_4 = ((gate2bel.Owlstrtp_0.Pronoun_1) HeadVar__2_2).F1;
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
//  gate2bel.m:38
  public static builtin.Comparison_result_0 __Compare____owlstr_0_0(
    gate2bel.Owlstr_0 HeadVar__2_2,
    gate2bel.Owlstr_0 HeadVar__3_3)
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
            int V_34_34 = ((gate2bel.Owlstr_0.Cref_3) HeadVar__2_2).F3;
            gate2bel.Owlstrtp_0 V_35_35 = ((gate2bel.Owlstr_0.Cref_3) HeadVar__2_2).F2;
            java.lang.String V_36_36 = ((gate2bel.Owlstr_0.Cref_3) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 1))
              {
                java.lang.String V_22_22 = ((gate2bel.Owlstr_0.Cref_3) HeadVar__3_3).F1;
                gate2bel.Owlstrtp_0 V_23_23 = ((gate2bel.Owlstr_0.Cref_3) HeadVar__3_3).F2;
                int V_24_24 = ((gate2bel.Owlstr_0.Cref_3) HeadVar__3_3).F3;
                builtin.Comparison_result_0 V_25_25 = null;

                {
                  V_25_25 = private_builtin.builtin_compare_string_3_p_0(V_36_36, V_22_22);
                }
                succeeded = (V_25_25.MR_value == builtin.Comparison_result_0.K0.MR_value);
                succeeded = !(succeeded);
                if (succeeded)
                  HeadVar__1_1 = V_25_25;
                else
                  {
                    builtin.Comparison_result_0 V_26_26 = null;

                    {
                      V_26_26 = gate2bel.__Compare____owlstrtp_0_0(V_35_35, V_23_23);
                    }
                    succeeded = (V_26_26.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_26_26;
                    else
                      {
                        HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_34_34, V_24_24);
                      }
                  }
              }
            else
              HeadVar__1_1 = builtin.Comparison_result_0.K2;
          }
        else
          {
            gate2bel.Owlstrtp_0 V_37_37 = ((gate2bel.Owlstr_0.Str_2) HeadVar__2_2).F2;
            java.lang.String V_38_38 = ((gate2bel.Owlstr_0.Str_2) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 1))
              HeadVar__1_1 = builtin.Comparison_result_0.K1;
            else
              {
                java.lang.String V_6_6 = ((gate2bel.Owlstr_0.Str_2) HeadVar__3_3).F1;
                gate2bel.Owlstrtp_0 V_7_7 = ((gate2bel.Owlstr_0.Str_2) HeadVar__3_3).F2;
                builtin.Comparison_result_0 V_8_8 = null;

                {
                  V_8_8 = private_builtin.builtin_compare_string_3_p_0(V_38_38, V_6_6);
                }
                succeeded = (V_8_8.MR_value == builtin.Comparison_result_0.K0.MR_value);
                succeeded = !(succeeded);
                if (succeeded)
                  HeadVar__1_1 = V_8_8;
                else
                  {
                    HeadVar__1_1 = gate2bel.__Compare____owlstrtp_0_0(V_37_37, V_7_7);
                  }
              }
          }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____owlstr_0_0(
    gate2bel.Owlstr_0 HeadVar__1_1,
    gate2bel.Owlstr_0 HeadVar__2_2)
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
            java.lang.String V_7_7 = ((gate2bel.Owlstr_0.Cref_3) HeadVar__1_1).F1;
            gate2bel.Owlstrtp_0 V_8_8 = ((gate2bel.Owlstr_0.Cref_3) HeadVar__1_1).F2;
            int V_9_9 = ((gate2bel.Owlstr_0.Cref_3) HeadVar__1_1).F3;
            java.lang.String V_10_10 = null;
            gate2bel.Owlstrtp_0 V_11_11 = null;
            int V_12_12 = 0;

            succeeded = (HeadVar__2_2.data_tag == 1);
            if (succeeded)
              {
                V_10_10 = ((gate2bel.Owlstr_0.Cref_3) HeadVar__2_2).F1;
                V_11_11 = ((gate2bel.Owlstr_0.Cref_3) HeadVar__2_2).F2;
                V_12_12 = ((gate2bel.Owlstr_0.Cref_3) HeadVar__2_2).F3;
                succeeded = V_7_7.equals(V_10_10);
                if (succeeded)
                  {
                    {
                      succeeded = gate2bel.__Unify____owlstrtp_0_0(V_8_8, V_11_11);
                    }
                    if (succeeded)
                      succeeded = (V_9_9 == V_12_12);
                  }
              }
          }
        else
          {
            java.lang.String V_3_3 = ((gate2bel.Owlstr_0.Str_2) HeadVar__1_1).F1;
            gate2bel.Owlstrtp_0 V_4_4 = ((gate2bel.Owlstr_0.Str_2) HeadVar__1_1).F2;
            java.lang.String V_5_5 = null;
            gate2bel.Owlstrtp_0 V_6_6 = null;

            succeeded = (HeadVar__2_2.data_tag == 0);
            if (succeeded)
              {
                V_5_5 = ((gate2bel.Owlstr_0.Str_2) HeadVar__2_2).F1;
                V_6_6 = ((gate2bel.Owlstr_0.Str_2) HeadVar__2_2).F2;
                succeeded = V_3_3.equals(V_5_5);
                if (succeeded)
                  {
                    succeeded = gate2bel.__Unify____owlstrtp_0_0(V_4_4, V_6_6);
                  }
              }
          }
      return succeeded;
    }
  }
//  gate2bel.m:35
  public static builtin.Comparison_result_0 __Compare____owlstmnt_0_0(
    gate2bel.Owlstmnt_0 HeadVar__2_2,
    gate2bel.Owlstmnt_0 HeadVar__3_3)
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
            list.List_1 V_22_22 = ((gate2bel.Owlstmnt_0.Embedded_2) HeadVar__2_2).F2;
            list.List_1 V_23_23 = ((gate2bel.Owlstmnt_0.Embedded_2) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 1))
              {
                list.List_1 V_14_14 = ((gate2bel.Owlstmnt_0.Embedded_2) HeadVar__3_3).F1;
                list.List_1 V_15_15 = ((gate2bel.Owlstmnt_0.Embedded_2) HeadVar__3_3).F2;
                builtin.Comparison_result_0 V_16_16 = null;
                jmercury.runtime.TypeInfo_Struct TypeInfo_19_19 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[28]);

                {
                  V_16_16 = builtin.compare_3_p_0(TypeInfo_19_19, ((java.lang.Object) (V_23_23)), ((java.lang.Object) (V_14_14)));
                }
                succeeded = (V_16_16.MR_value == builtin.Comparison_result_0.K0.MR_value);
                succeeded = !(succeeded);
                if (succeeded)
                  HeadVar__1_1 = V_16_16;
                else
                  {
                    jmercury.runtime.TypeInfo_Struct TypeInfo_20_20 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[1]);

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
            gate2bel.Owltriple_0 V_24_24 = ((gate2bel.Owlstmnt_0.One_1) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 1))
              HeadVar__1_1 = builtin.Comparison_result_0.K1;
            else
              {
                gate2bel.Owltriple_0 V_5_5 = ((gate2bel.Owlstmnt_0.One_1) HeadVar__3_3).F1;

                {
                  HeadVar__1_1 = gate2bel.__Compare____owltriple_0_0(V_24_24, V_5_5);
                }
              }
          }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____owlstmnt_0_0(
    gate2bel.Owlstmnt_0 HeadVar__1_1,
    gate2bel.Owlstmnt_0 HeadVar__2_2)
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
            list.List_1 V_5_5 = ((gate2bel.Owlstmnt_0.Embedded_2) HeadVar__1_1).F1;
            list.List_1 V_6_6 = ((gate2bel.Owlstmnt_0.Embedded_2) HeadVar__1_1).F2;
            list.List_1 V_7_7 = null;
            list.List_1 V_8_8 = null;

            succeeded = (HeadVar__2_2.data_tag == 1);
            if (succeeded)
              {
                V_7_7 = ((gate2bel.Owlstmnt_0.Embedded_2) HeadVar__2_2).F1;
                V_8_8 = ((gate2bel.Owlstmnt_0.Embedded_2) HeadVar__2_2).F2;
                TypeInfo_11_11 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[28]);
                {
                  succeeded = builtin.unify_2_p_0(TypeInfo_11_11, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_7_7)));
                }
                if (succeeded)
                  {
                    TypeInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[1]);
                    {
                      succeeded = builtin.unify_2_p_0(TypeInfo_12_12, ((java.lang.Object) (V_6_6)), ((java.lang.Object) (V_8_8)));
                    }
                  }
              }
          }
        else
          {
            gate2bel.Owltriple_0 V_3_3 = ((gate2bel.Owlstmnt_0.One_1) HeadVar__1_1).F1;
            gate2bel.Owltriple_0 V_4_4 = null;

            succeeded = (HeadVar__2_2.data_tag == 0);
            if (succeeded)
              {
                V_4_4 = ((gate2bel.Owlstmnt_0.One_1) HeadVar__2_2).F1;
                {
                  succeeded = gate2bel.__Unify____owltriple_0_0(V_3_3, V_4_4);
                }
              }
          }
      return succeeded;
    }
  }
//  gate2bel.m:41
  public static builtin.Comparison_result_0 __Compare____owlprtp_0_0(
    gate2bel.Owlprtp_0 HeadVar__2_2,
    gate2bel.Owlprtp_0 HeadVar__3_3)
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
  public static boolean __Unify____owlprtp_0_0(
    gate2bel.Owlprtp_0 HeadVar__2_1,
    gate2bel.Owlprtp_0 HeadVar__2_2)
  {
    {
      boolean succeeded = (HeadVar__2_1.MR_value == HeadVar__2_2.MR_value);

      return succeeded;
    }
  }
//  gate2bel.m:40
  public static builtin.Comparison_result_0 __Compare____owlpr_0_0(
    gate2bel.Owlpr_0 HeadVar__2_2,
    gate2bel.Owlpr_0 HeadVar__3_3)
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
          java.lang.String V_4_4 = ((gate2bel.Owlpr_0) HeadVar__2_2).F1;
          gate2bel.Owlprtp_0 V_5_5 = ((gate2bel.Owlpr_0) HeadVar__2_2).F2;
          java.lang.String V_6_6 = ((gate2bel.Owlpr_0) HeadVar__3_3).F1;
          gate2bel.Owlprtp_0 V_7_7 = ((gate2bel.Owlpr_0) HeadVar__3_3).F2;
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
  public static boolean __Unify____owlpr_0_0(
    gate2bel.Owlpr_0 HeadVar__1_1,
    gate2bel.Owlpr_0 HeadVar__2_2)
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
          java.lang.String V_3_3 = ((gate2bel.Owlpr_0) HeadVar__1_1).F1;
          gate2bel.Owlprtp_0 V_4_4 = ((gate2bel.Owlpr_0) HeadVar__1_1).F2;
          java.lang.String V_5_5 = ((gate2bel.Owlpr_0) HeadVar__2_2).F1;
          gate2bel.Owlprtp_0 V_6_6 = ((gate2bel.Owlpr_0) HeadVar__2_2).F2;

          succeeded = V_3_3.equals(V_5_5);
          if (succeeded)
            succeeded = (V_4_4.MR_value == V_6_6.MR_value);
        }
      return succeeded;
    }
  }
//  gate2bel.m:34
  public static builtin.Comparison_result_0 __Compare____owlfile_0_0(
    gate2bel.Owlfile_0 HeadVar__2_2,
    gate2bel.Owlfile_0 HeadVar__3_3)
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
          java.lang.String V_4_4 = ((gate2bel.Owlfile_0) HeadVar__2_2).F1;
          list.List_1 V_5_5 = ((gate2bel.Owlfile_0) HeadVar__2_2).F2;
          utils.Corefs_0 V_6_6 = ((gate2bel.Owlfile_0) HeadVar__2_2).F3;
          java.lang.String V_7_7 = ((gate2bel.Owlfile_0) HeadVar__3_3).F1;
          list.List_1 V_8_8 = ((gate2bel.Owlfile_0) HeadVar__3_3).F2;
          utils.Corefs_0 V_9_9 = ((gate2bel.Owlfile_0) HeadVar__3_3).F3;
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
              jmercury.runtime.TypeInfo_Struct TypeInfo_15_15 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[6]);

              {
                V_11_11 = builtin.compare_3_p_0(TypeInfo_15_15, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_8_8)));
              }
              succeeded = (V_11_11.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_11_11;
              else
                {
                  HeadVar__1_1 = utils.__Compare____corefs_0_0(V_6_6, V_9_9);
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____owlfile_0_0(
    gate2bel.Owlfile_0 HeadVar__1_1,
    gate2bel.Owlfile_0 HeadVar__2_2)
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
          java.lang.String V_3_3 = ((gate2bel.Owlfile_0) HeadVar__1_1).F1;
          list.List_1 V_4_4 = ((gate2bel.Owlfile_0) HeadVar__1_1).F2;
          utils.Corefs_0 V_5_5 = ((gate2bel.Owlfile_0) HeadVar__1_1).F3;
          java.lang.String V_6_6 = ((gate2bel.Owlfile_0) HeadVar__2_2).F1;
          list.List_1 V_7_7 = ((gate2bel.Owlfile_0) HeadVar__2_2).F2;
          utils.Corefs_0 V_8_8 = ((gate2bel.Owlfile_0) HeadVar__2_2).F3;

          succeeded = V_3_3.equals(V_6_6);
          if (succeeded)
            {
              TypeInfo_11_11 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[6]);
              {
                succeeded = builtin.unify_2_p_0(TypeInfo_11_11, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_7_7)));
              }
              if (succeeded)
                {
                  succeeded = utils.__Unify____corefs_0_0(V_5_5, V_8_8);
                }
            }
        }
      return succeeded;
    }
  }
//  gate2bel.m:84
  private static builtin.Comparison_result_0 __Compare____lnmap_0_0(
    tree234.Tree234_2 HeadVar__2_2,
    tree234.Tree234_2 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[5]);
      tree234.Tree234_2 Cast_HeadVar1_4 = HeadVar__2_2;
      tree234.Tree234_2 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  private static boolean __Unify____lnmap_0_0(
    tree234.Tree234_2 HeadVar__1_1,
    tree234.Tree234_2 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[5]);
      tree234.Tree234_2 Cast_HeadVar1_3 = HeadVar__1_1;
      tree234.Tree234_2 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  gate2bel.m:36
  public static builtin.Comparison_result_0 __Compare____lndata_0_0(
    gate2bel.Lndata_0 HeadVar__2_2,
    gate2bel.Lndata_0 HeadVar__3_3)
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
        {
          gate2bel.Owlstr_0 V_4_4 = ((gate2bel.Lndata_0) HeadVar__2_2).F1;
          bool.Bool_0 V_5_5 = ((gate2bel.Lndata_0) HeadVar__2_2).F2;
          gate2bel.Cvalue_0 V_7_7 = ((gate2bel.Lndata_0) HeadVar__2_2).F4;
          gate2bel.Owlstr_0 V_8_8 = ((gate2bel.Lndata_0) HeadVar__3_3).F1;
          bool.Bool_0 V_9_9 = ((gate2bel.Lndata_0) HeadVar__3_3).F2;
          gate2bel.Cvalue_0 V_11_11 = ((gate2bel.Lndata_0) HeadVar__3_3).F4;
          builtin.Comparison_result_0 V_12_12 = null;

          {
            V_12_12 = gate2bel.__Compare____owlstr_0_0(V_4_4, V_8_8);
          }
          succeeded = (V_12_12.MR_value == builtin.Comparison_result_0.K0.MR_value);
          succeeded = !(succeeded);
          if (succeeded)
            HeadVar__1_1 = V_12_12;
          else
            {
              builtin.Comparison_result_0 V_13_13 = null;
              int V_19_19 = (int) V_5_5.MR_value;
              int V_20_20 = (int) V_9_9.MR_value;

              {
                V_13_13 = private_builtin.builtin_compare_int_3_p_0(V_19_19, V_20_20);
              }
              succeeded = (V_13_13.MR_value == builtin.Comparison_result_0.K0.MR_value);
              succeeded = !(succeeded);
              if (succeeded)
                HeadVar__1_1 = V_13_13;
              else
                {
                  HeadVar__1_1 = gate2bel.__Compare____cvalue_0_0(V_7_7, V_11_11);
                }
            }
        }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____lndata_0_0(
    gate2bel.Lndata_0 HeadVar__1_1,
    gate2bel.Lndata_0 HeadVar__2_2)
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
          gate2bel.Owlstr_0 V_3_3 = ((gate2bel.Lndata_0) HeadVar__1_1).F1;
          bool.Bool_0 V_4_4 = ((gate2bel.Lndata_0) HeadVar__1_1).F2;
          gate2bel.Cvalue_0 V_6_6 = ((gate2bel.Lndata_0) HeadVar__1_1).F4;
          gate2bel.Owlstr_0 V_7_7 = ((gate2bel.Lndata_0) HeadVar__2_2).F1;
          bool.Bool_0 V_8_8 = ((gate2bel.Lndata_0) HeadVar__2_2).F2;
          gate2bel.Cvalue_0 V_10_10 = ((gate2bel.Lndata_0) HeadVar__2_2).F4;

          {
            succeeded = gate2bel.__Unify____owlstr_0_0(V_3_3, V_7_7);
          }
          if (succeeded)
            {
              succeeded = (V_4_4.MR_value == V_8_8.MR_value);
              if (succeeded)
                {
                  succeeded = gate2bel.__Unify____cvalue_0_0(V_6_6, V_10_10);
                }
            }
        }
      return succeeded;
    }
  }
//  gate2bel.m:43
  public static builtin.Comparison_result_0 __Compare____dact_0_0(
    gate2bel.Dact_0 HeadVar__2_2,
    gate2bel.Dact_0 HeadVar__3_3)
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
  public static boolean __Unify____dact_0_0(
    gate2bel.Dact_0 HeadVar__2_1,
    gate2bel.Dact_0 HeadVar__2_2)
  {
    {
      boolean succeeded = (HeadVar__2_1.MR_value == HeadVar__2_2.MR_value);

      return succeeded;
    }
  }
//  gate2bel.m:81
  private static builtin.Comparison_result_0 __Compare____cword_0_0(
    gate2bel.Cword_0 HeadVar__2_2,
    gate2bel.Cword_0 HeadVar__3_3)
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
            list.List_1 V_16_16 = ((gate2bel.Cword_0.Many_1) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 1))
              {
                jmercury.runtime.TypeInfo_Struct TypeInfo_14_14 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[20]);
                list.List_1 V_11_11 = ((gate2bel.Cword_0.Many_1) HeadVar__3_3).F1;

                {
                  HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_14_14, ((java.lang.Object) (V_16_16)), ((java.lang.Object) (V_11_11)));
                }
              }
            else
              HeadVar__1_1 = builtin.Comparison_result_0.K2;
          }
        else
          {
            java.lang.String V_17_17 = ((gate2bel.Cword_0.One_1) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 1))
              HeadVar__1_1 = builtin.Comparison_result_0.K1;
            else
              {
                java.lang.String V_5_5 = ((gate2bel.Cword_0.One_1) HeadVar__3_3).F1;

                {
                  HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_17_17, V_5_5);
                }
              }
          }
      return HeadVar__1_1;
    }
  }
  private static boolean __Unify____cword_0_0(
    gate2bel.Cword_0 HeadVar__1_1,
    gate2bel.Cword_0 HeadVar__2_2)
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
            jmercury.runtime.TypeInfo_Struct TypeInfo_9_9 = null;
            list.List_1 V_5_5 = ((gate2bel.Cword_0.Many_1) HeadVar__1_1).F1;
            list.List_1 V_6_6 = null;

            succeeded = (HeadVar__2_2.data_tag == 1);
            if (succeeded)
              {
                V_6_6 = ((gate2bel.Cword_0.Many_1) HeadVar__2_2).F1;
                TypeInfo_9_9 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[20]);
                {
                  succeeded = builtin.unify_2_p_0(TypeInfo_9_9, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_6_6)));
                }
              }
          }
        else
          {
            java.lang.String V_3_3 = ((gate2bel.Cword_0.One_1) HeadVar__1_1).F1;
            java.lang.String V_4_4 = null;

            succeeded = (HeadVar__2_2.data_tag == 0);
            if (succeeded)
              {
                V_4_4 = ((gate2bel.Cword_0.One_1) HeadVar__2_2).F1;
                succeeded = V_3_3.equals(V_4_4);
              }
          }
      return succeeded;
    }
  }
//  gate2bel.m:31
  public static builtin.Comparison_result_0 __Compare____cvalue_0_0(
    gate2bel.Cvalue_0 HeadVar__2_2,
    gate2bel.Cvalue_0 HeadVar__3_3)
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
            int V_22_22 = ((gate2bel.Cvalue_0.Cref_2) HeadVar__2_2).F2;
            gate2bel.Cstring_0 V_23_23 = ((gate2bel.Cvalue_0.Cref_2) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 1))
              {
                gate2bel.Cstring_0 V_14_14 = ((gate2bel.Cvalue_0.Cref_2) HeadVar__3_3).F1;
                int V_15_15 = ((gate2bel.Cvalue_0.Cref_2) HeadVar__3_3).F2;
                builtin.Comparison_result_0 V_16_16 = null;

                {
                  V_16_16 = gate2bel.__Compare____cstring_0_0(V_23_23, V_14_14);
                }
                succeeded = (V_16_16.MR_value == builtin.Comparison_result_0.K0.MR_value);
                succeeded = !(succeeded);
                if (succeeded)
                  HeadVar__1_1 = V_16_16;
                else
                  {
                    HeadVar__1_1 = private_builtin.builtin_compare_int_3_p_0(V_22_22, V_15_15);
                  }
              }
            else
              HeadVar__1_1 = builtin.Comparison_result_0.K2;
          }
        else
          {
            gate2bel.Cstring_0 V_24_24 = ((gate2bel.Cvalue_0.Lit_1) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 1))
              HeadVar__1_1 = builtin.Comparison_result_0.K1;
            else
              {
                gate2bel.Cstring_0 V_5_5 = ((gate2bel.Cvalue_0.Lit_1) HeadVar__3_3).F1;

                {
                  HeadVar__1_1 = gate2bel.__Compare____cstring_0_0(V_24_24, V_5_5);
                }
              }
          }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____cvalue_0_0(
    gate2bel.Cvalue_0 HeadVar__1_1,
    gate2bel.Cvalue_0 HeadVar__2_2)
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
            gate2bel.Cstring_0 V_5_5 = ((gate2bel.Cvalue_0.Cref_2) HeadVar__1_1).F1;
            int V_6_6 = ((gate2bel.Cvalue_0.Cref_2) HeadVar__1_1).F2;
            gate2bel.Cstring_0 V_7_7 = null;
            int V_8_8 = 0;

            succeeded = (HeadVar__2_2.data_tag == 1);
            if (succeeded)
              {
                V_7_7 = ((gate2bel.Cvalue_0.Cref_2) HeadVar__2_2).F1;
                V_8_8 = ((gate2bel.Cvalue_0.Cref_2) HeadVar__2_2).F2;
                {
                  succeeded = gate2bel.__Unify____cstring_0_0(V_5_5, V_7_7);
                }
                if (succeeded)
                  succeeded = (V_6_6 == V_8_8);
              }
          }
        else
          {
            gate2bel.Cstring_0 V_3_3 = ((gate2bel.Cvalue_0.Lit_1) HeadVar__1_1).F1;
            gate2bel.Cstring_0 V_4_4 = null;

            succeeded = (HeadVar__2_2.data_tag == 0);
            if (succeeded)
              {
                V_4_4 = ((gate2bel.Cvalue_0.Lit_1) HeadVar__2_2).F1;
                {
                  succeeded = gate2bel.__Unify____cstring_0_0(V_3_3, V_4_4);
                }
              }
          }
      return succeeded;
    }
  }
//  gate2bel.m:32
  public static builtin.Comparison_result_0 __Compare____cstring_0_0(
    gate2bel.Cstring_0 HeadVar__2_2,
    gate2bel.Cstring_0 HeadVar__3_3)
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
            gate2bel.Strtype_0 V_17_17 = ((gate2bel.Cstring_0.Str_2) HeadVar__2_2).F2;
            java.lang.String V_18_18 = ((gate2bel.Cstring_0.Str_2) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 0))
              HeadVar__1_1 = builtin.Comparison_result_0.K2;
            else
              {
                java.lang.String V_10_10 = ((gate2bel.Cstring_0.Str_2) HeadVar__3_3).F1;
                gate2bel.Strtype_0 V_11_11 = ((gate2bel.Cstring_0.Str_2) HeadVar__3_3).F2;
                builtin.Comparison_result_0 V_12_12 = null;

                {
                  V_12_12 = private_builtin.builtin_compare_string_3_p_0(V_18_18, V_10_10);
                }
                succeeded = (V_12_12.MR_value == builtin.Comparison_result_0.K0.MR_value);
                succeeded = !(succeeded);
                if (succeeded)
                  HeadVar__1_1 = V_12_12;
                else
                  {
                    HeadVar__1_1 = gate2bel.__Compare____strtype_0_0(V_17_17, V_11_11);
                  }
              }
          }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____cstring_0_0(
    gate2bel.Cstring_0 HeadVar__1_1,
    gate2bel.Cstring_0 HeadVar__2_2)
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
            java.lang.String V_3_3 = ((gate2bel.Cstring_0.Str_2) HeadVar__1_1).F1;
            gate2bel.Strtype_0 V_4_4 = ((gate2bel.Cstring_0.Str_2) HeadVar__1_1).F2;
            java.lang.String V_5_5 = null;
            gate2bel.Strtype_0 V_6_6 = null;

            succeeded = (HeadVar__2_2.data_tag == 1);
            if (succeeded)
              {
                V_5_5 = ((gate2bel.Cstring_0.Str_2) HeadVar__2_2).F1;
                V_6_6 = ((gate2bel.Cstring_0.Str_2) HeadVar__2_2).F2;
                succeeded = V_3_3.equals(V_5_5);
                if (succeeded)
                  {
                    succeeded = gate2bel.__Unify____strtype_0_0(V_4_4, V_6_6);
                  }
              }
          }
      return succeeded;
    }
  }
//  gate2bel.m:13
  public static builtin.Comparison_result_0 __Compare____corefpair_0_0(
    pair.Pair_2 HeadVar__2_2,
    pair.Pair_2 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[27]);
      pair.Pair_2 Cast_HeadVar1_4 = HeadVar__2_2;
      pair.Pair_2 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____corefpair_0_0(
    pair.Pair_2 HeadVar__1_1,
    pair.Pair_2 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[27]);
      pair.Pair_2 Cast_HeadVar1_3 = HeadVar__1_1;
      pair.Pair_2 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  gate2bel.m:79
  private static builtin.Comparison_result_0 __Compare____cmaps_0_0(
    gate2bel.Cmaps_0 HeadVar__2_2,
    gate2bel.Cmaps_0 HeadVar__3_3)
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
          tree234.Tree234_2 V_4_4 = ((gate2bel.Cmaps_0) HeadVar__2_2).F1;
          tree234.Tree234_2 V_5_5 = ((gate2bel.Cmaps_0) HeadVar__2_2).F2;
          tree234.Tree234_2 V_6_6 = ((gate2bel.Cmaps_0) HeadVar__3_3).F1;
          tree234.Tree234_2 V_7_7 = ((gate2bel.Cmaps_0) HeadVar__3_3).F2;
          builtin.Comparison_result_0 V_8_8 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_11_11 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[26]);

          {
            V_8_8 = builtin.compare_3_p_0(TypeInfo_11_11, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_6_6)));
          }
          succeeded = (V_8_8.MR_value == builtin.Comparison_result_0.K0.MR_value);
          succeeded = !(succeeded);
          if (succeeded)
            HeadVar__1_1 = V_8_8;
          else
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_12_12 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[22]);

              {
                HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_12_12, ((java.lang.Object) (V_5_5)), ((java.lang.Object) (V_7_7)));
              }
            }
        }
      return HeadVar__1_1;
    }
  }
  private static boolean __Unify____cmaps_0_0(
    gate2bel.Cmaps_0 HeadVar__1_1,
    gate2bel.Cmaps_0 HeadVar__2_2)
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
          jmercury.runtime.TypeInfo_Struct TypeInfo_9_9 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[26]);
          jmercury.runtime.TypeInfo_Struct TypeInfo_10_10 = null;
          tree234.Tree234_2 V_3_3 = ((gate2bel.Cmaps_0) HeadVar__1_1).F1;
          tree234.Tree234_2 V_4_4 = ((gate2bel.Cmaps_0) HeadVar__1_1).F2;
          tree234.Tree234_2 V_5_5 = ((gate2bel.Cmaps_0) HeadVar__2_2).F1;
          tree234.Tree234_2 V_6_6 = ((gate2bel.Cmaps_0) HeadVar__2_2).F2;

          {
            succeeded = builtin.unify_2_p_0(TypeInfo_9_9, ((java.lang.Object) (V_3_3)), ((java.lang.Object) (V_5_5)));
          }
          if (succeeded)
            {
              TypeInfo_10_10 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[22]);
              {
                succeeded = builtin.unify_2_p_0(TypeInfo_10_10, ((java.lang.Object) (V_4_4)), ((java.lang.Object) (V_6_6)));
              }
            }
        }
      return succeeded;
    }
  }
//  gate2bel.m:15
  public static builtin.Comparison_result_0 __Compare____cid_0_0(
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
  public static boolean __Unify____cid_0_0(
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
//  gate2bel.m:29
  public static builtin.Comparison_result_0 __Compare____chunk3_0_0(
    gate2bel.Chunk3_0 HeadVar__2_2,
    gate2bel.Chunk3_0 HeadVar__3_3)
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
          int V_4_4 = ((gate2bel.Chunk3_0) HeadVar__2_2).F1;
          java.lang.String V_5_5 = ((gate2bel.Chunk3_0) HeadVar__2_2).F2;
          java.lang.String V_6_6 = ((gate2bel.Chunk3_0) HeadVar__2_2).F3;
          java.lang.String V_7_7 = ((gate2bel.Chunk3_0) HeadVar__2_2).F4;
          list.List_1 V_8_8 = ((gate2bel.Chunk3_0) HeadVar__2_2).F5;
          list.List_1 V_9_9 = ((gate2bel.Chunk3_0) HeadVar__2_2).F6;
          int V_10_10 = ((gate2bel.Chunk3_0) HeadVar__3_3).F1;
          java.lang.String V_11_11 = ((gate2bel.Chunk3_0) HeadVar__3_3).F2;
          java.lang.String V_12_12 = ((gate2bel.Chunk3_0) HeadVar__3_3).F3;
          java.lang.String V_13_13 = ((gate2bel.Chunk3_0) HeadVar__3_3).F4;
          list.List_1 V_14_14 = ((gate2bel.Chunk3_0) HeadVar__3_3).F5;
          list.List_1 V_15_15 = ((gate2bel.Chunk3_0) HeadVar__3_3).F6;
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
                          jmercury.runtime.TypeInfo_Struct TypeInfo_27_27 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[23]);

                          {
                            V_20_20 = builtin.compare_3_p_0(TypeInfo_27_27, ((java.lang.Object) (V_8_8)), ((java.lang.Object) (V_14_14)));
                          }
                          succeeded = (V_20_20.MR_value == builtin.Comparison_result_0.K0.MR_value);
                          succeeded = !(succeeded);
                          if (succeeded)
                            HeadVar__1_1 = V_20_20;
                          else
                            {
                              jmercury.runtime.TypeInfo_Struct TypeInfo_28_28 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[11]);

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
  public static boolean __Unify____chunk3_0_0(
    gate2bel.Chunk3_0 HeadVar__1_1,
    gate2bel.Chunk3_0 HeadVar__2_2)
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
          int V_3_3 = ((gate2bel.Chunk3_0) HeadVar__1_1).F1;
          java.lang.String V_4_4 = ((gate2bel.Chunk3_0) HeadVar__1_1).F2;
          java.lang.String V_5_5 = ((gate2bel.Chunk3_0) HeadVar__1_1).F3;
          java.lang.String V_6_6 = ((gate2bel.Chunk3_0) HeadVar__1_1).F4;
          list.List_1 V_7_7 = ((gate2bel.Chunk3_0) HeadVar__1_1).F5;
          list.List_1 V_8_8 = ((gate2bel.Chunk3_0) HeadVar__1_1).F6;
          int V_9_9 = ((gate2bel.Chunk3_0) HeadVar__2_2).F1;
          java.lang.String V_10_10 = ((gate2bel.Chunk3_0) HeadVar__2_2).F2;
          java.lang.String V_11_11 = ((gate2bel.Chunk3_0) HeadVar__2_2).F3;
          java.lang.String V_12_12 = ((gate2bel.Chunk3_0) HeadVar__2_2).F4;
          list.List_1 V_13_13 = ((gate2bel.Chunk3_0) HeadVar__2_2).F5;
          list.List_1 V_14_14 = ((gate2bel.Chunk3_0) HeadVar__2_2).F6;

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
                          TypeInfo_17_17 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[23]);
                          {
                            succeeded = builtin.unify_2_p_0(TypeInfo_17_17, ((java.lang.Object) (V_7_7)), ((java.lang.Object) (V_13_13)));
                          }
                          if (succeeded)
                            {
                              TypeInfo_18_18 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[11]);
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
//  gate2bel.m:19
  public static builtin.Comparison_result_0 __Compare____chunk2_0_0(
    gate2bel.Chunk2_0 HeadVar__2_2,
    gate2bel.Chunk2_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_42 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_43 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_42 == CastY_43);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        if ((HeadVar__2_2.data_tag == 0))
          {
            list.List_1 V_52_52 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__2_2).F6;
            list.List_1 V_53_53 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__2_2).F5;
            java.lang.String V_54_54 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__2_2).F4;
            java.lang.String V_55_55 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__2_2).F3;
            java.lang.String V_56_56 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__2_2).F2;
            int V_57_57 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 0))
              {
                int V_10_10 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__3_3).F1;
                java.lang.String V_11_11 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__3_3).F2;
                java.lang.String V_12_12 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__3_3).F3;
                java.lang.String V_13_13 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__3_3).F4;
                list.List_1 V_14_14 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__3_3).F5;
                list.List_1 V_15_15 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__3_3).F6;
                builtin.Comparison_result_0 V_16_16 = null;

                {
                  V_16_16 = private_builtin.builtin_compare_int_3_p_0(V_57_57, V_10_10);
                }
                succeeded = (V_16_16.MR_value == builtin.Comparison_result_0.K0.MR_value);
                succeeded = !(succeeded);
                if (succeeded)
                  HeadVar__1_1 = V_16_16;
                else
                  {
                    builtin.Comparison_result_0 V_17_17 = null;

                    {
                      V_17_17 = private_builtin.builtin_compare_string_3_p_0(V_56_56, V_11_11);
                    }
                    succeeded = (V_17_17.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_17_17;
                    else
                      {
                        builtin.Comparison_result_0 V_18_18 = null;

                        {
                          V_18_18 = private_builtin.builtin_compare_string_3_p_0(V_55_55, V_12_12);
                        }
                        succeeded = (V_18_18.MR_value == builtin.Comparison_result_0.K0.MR_value);
                        succeeded = !(succeeded);
                        if (succeeded)
                          HeadVar__1_1 = V_18_18;
                        else
                          {
                            builtin.Comparison_result_0 V_19_19 = null;

                            {
                              V_19_19 = private_builtin.builtin_compare_string_3_p_0(V_54_54, V_13_13);
                            }
                            succeeded = (V_19_19.MR_value == builtin.Comparison_result_0.K0.MR_value);
                            succeeded = !(succeeded);
                            if (succeeded)
                              HeadVar__1_1 = V_19_19;
                            else
                              {
                                builtin.Comparison_result_0 V_20_20 = null;
                                jmercury.runtime.TypeInfo_Struct TypeInfo_50_50 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[23]);

                                {
                                  V_20_20 = builtin.compare_3_p_0(TypeInfo_50_50, ((java.lang.Object) (V_53_53)), ((java.lang.Object) (V_14_14)));
                                }
                                succeeded = (V_20_20.MR_value == builtin.Comparison_result_0.K0.MR_value);
                                succeeded = !(succeeded);
                                if (succeeded)
                                  HeadVar__1_1 = V_20_20;
                                else
                                  {
                                    jmercury.runtime.TypeInfo_Struct TypeInfo_51_51 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[25]);

                                    {
                                      HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_51_51, ((java.lang.Object) (V_52_52)), ((java.lang.Object) (V_15_15)));
                                    }
                                  }
                              }
                          }
                      }
                  }
              }
            else
              HeadVar__1_1 = builtin.Comparison_result_0.K1;
          }
        else
          {
            java.lang.String V_58_58 = ((gate2bel.Chunk2_0.Corefclass_2) HeadVar__2_2).F2;
            int V_59_59 = ((gate2bel.Chunk2_0.Corefclass_2) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 0))
              HeadVar__1_1 = builtin.Comparison_result_0.K2;
            else
              {
                int V_39_39 = ((gate2bel.Chunk2_0.Corefclass_2) HeadVar__3_3).F1;
                java.lang.String V_40_40 = ((gate2bel.Chunk2_0.Corefclass_2) HeadVar__3_3).F2;
                builtin.Comparison_result_0 V_41_41 = null;

                {
                  V_41_41 = private_builtin.builtin_compare_int_3_p_0(V_59_59, V_39_39);
                }
                succeeded = (V_41_41.MR_value == builtin.Comparison_result_0.K0.MR_value);
                succeeded = !(succeeded);
                if (succeeded)
                  HeadVar__1_1 = V_41_41;
                else
                  {
                    HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_58_58, V_40_40);
                  }
              }
          }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____chunk2_0_0(
    gate2bel.Chunk2_0 HeadVar__1_1,
    gate2bel.Chunk2_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_19 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_20 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_19 == CastY_20);
      if (succeeded)
        succeeded = true;
      else
        if ((HeadVar__1_1.data_tag == 0))
          {
            jmercury.runtime.TypeInfo_Struct TypeInfo_21_21 = null;
            jmercury.runtime.TypeInfo_Struct TypeInfo_22_22 = null;
            int V_3_3 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__1_1).F1;
            java.lang.String V_4_4 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__1_1).F2;
            java.lang.String V_5_5 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__1_1).F3;
            java.lang.String V_6_6 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__1_1).F4;
            list.List_1 V_7_7 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__1_1).F5;
            list.List_1 V_8_8 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__1_1).F6;
            int V_9_9 = 0;
            java.lang.String V_10_10 = null;
            java.lang.String V_11_11 = null;
            java.lang.String V_12_12 = null;
            list.List_1 V_13_13 = null;
            list.List_1 V_14_14 = null;

            succeeded = (HeadVar__2_2.data_tag == 0);
            if (succeeded)
              {
                V_9_9 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__2_2).F1;
                V_10_10 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__2_2).F2;
                V_11_11 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__2_2).F3;
                V_12_12 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__2_2).F4;
                V_13_13 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__2_2).F5;
                V_14_14 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__2_2).F6;
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
                                TypeInfo_21_21 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[23]);
                                {
                                  succeeded = builtin.unify_2_p_0(TypeInfo_21_21, ((java.lang.Object) (V_7_7)), ((java.lang.Object) (V_13_13)));
                                }
                                if (succeeded)
                                  {
                                    TypeInfo_22_22 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[25]);
                                    {
                                      succeeded = builtin.unify_2_p_0(TypeInfo_22_22, ((java.lang.Object) (V_8_8)), ((java.lang.Object) (V_14_14)));
                                    }
                                  }
                              }
                          }
                      }
                  }
              }
          }
        else
          {
            int V_15_15 = ((gate2bel.Chunk2_0.Corefclass_2) HeadVar__1_1).F1;
            java.lang.String V_16_16 = ((gate2bel.Chunk2_0.Corefclass_2) HeadVar__1_1).F2;
            int V_17_17 = 0;
            java.lang.String V_18_18 = null;

            succeeded = (HeadVar__2_2.data_tag == 1);
            if (succeeded)
              {
                V_17_17 = ((gate2bel.Chunk2_0.Corefclass_2) HeadVar__2_2).F1;
                V_18_18 = ((gate2bel.Chunk2_0.Corefclass_2) HeadVar__2_2).F2;
                succeeded = (V_15_15 == V_17_17);
                if (succeeded)
                  succeeded = V_16_16.equals(V_18_18);
              }
          }
      return succeeded;
    }
  }
//  gate2bel.m:7
  public static builtin.Comparison_result_0 __Compare____chunk_0_0(
    gate2bel.Chunk_0 HeadVar__2_2,
    gate2bel.Chunk_0 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object CastX_42 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object CastY_43 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      succeeded = (CastX_42 == CastY_43);
      if (succeeded)
        HeadVar__1_1 = builtin.Comparison_result_0.K0;
      else
        if ((HeadVar__2_2.data_tag == 0))
          {
            list.List_1 V_52_52 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__2_2).F6;
            list.List_1 V_53_53 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__2_2).F5;
            java.lang.String V_54_54 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__2_2).F4;
            java.lang.String V_55_55 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__2_2).F3;
            java.lang.String V_56_56 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__2_2).F2;
            int V_57_57 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 0))
              {
                int V_10_10 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__3_3).F1;
                java.lang.String V_11_11 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__3_3).F2;
                java.lang.String V_12_12 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__3_3).F3;
                java.lang.String V_13_13 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__3_3).F4;
                list.List_1 V_14_14 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__3_3).F5;
                list.List_1 V_15_15 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__3_3).F6;
                builtin.Comparison_result_0 V_16_16 = null;

                {
                  V_16_16 = private_builtin.builtin_compare_int_3_p_0(V_57_57, V_10_10);
                }
                succeeded = (V_16_16.MR_value == builtin.Comparison_result_0.K0.MR_value);
                succeeded = !(succeeded);
                if (succeeded)
                  HeadVar__1_1 = V_16_16;
                else
                  {
                    builtin.Comparison_result_0 V_17_17 = null;

                    {
                      V_17_17 = private_builtin.builtin_compare_string_3_p_0(V_56_56, V_11_11);
                    }
                    succeeded = (V_17_17.MR_value == builtin.Comparison_result_0.K0.MR_value);
                    succeeded = !(succeeded);
                    if (succeeded)
                      HeadVar__1_1 = V_17_17;
                    else
                      {
                        builtin.Comparison_result_0 V_18_18 = null;

                        {
                          V_18_18 = private_builtin.builtin_compare_string_3_p_0(V_55_55, V_12_12);
                        }
                        succeeded = (V_18_18.MR_value == builtin.Comparison_result_0.K0.MR_value);
                        succeeded = !(succeeded);
                        if (succeeded)
                          HeadVar__1_1 = V_18_18;
                        else
                          {
                            builtin.Comparison_result_0 V_19_19 = null;

                            {
                              V_19_19 = private_builtin.builtin_compare_string_3_p_0(V_54_54, V_13_13);
                            }
                            succeeded = (V_19_19.MR_value == builtin.Comparison_result_0.K0.MR_value);
                            succeeded = !(succeeded);
                            if (succeeded)
                              HeadVar__1_1 = V_19_19;
                            else
                              {
                                builtin.Comparison_result_0 V_20_20 = null;
                                jmercury.runtime.TypeInfo_Struct TypeInfo_50_50 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[23]);

                                {
                                  V_20_20 = builtin.compare_3_p_0(TypeInfo_50_50, ((java.lang.Object) (V_53_53)), ((java.lang.Object) (V_14_14)));
                                }
                                succeeded = (V_20_20.MR_value == builtin.Comparison_result_0.K0.MR_value);
                                succeeded = !(succeeded);
                                if (succeeded)
                                  HeadVar__1_1 = V_20_20;
                                else
                                  {
                                    jmercury.runtime.TypeInfo_Struct TypeInfo_51_51 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[24]);

                                    {
                                      HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_51_51, ((java.lang.Object) (V_52_52)), ((java.lang.Object) (V_15_15)));
                                    }
                                  }
                              }
                          }
                      }
                  }
              }
            else
              HeadVar__1_1 = builtin.Comparison_result_0.K1;
          }
        else
          {
            java.lang.String V_58_58 = ((gate2bel.Chunk_0.Corefclass_2) HeadVar__2_2).F2;
            int V_59_59 = ((gate2bel.Chunk_0.Corefclass_2) HeadVar__2_2).F1;

            if ((HeadVar__3_3.data_tag == 0))
              HeadVar__1_1 = builtin.Comparison_result_0.K2;
            else
              {
                int V_39_39 = ((gate2bel.Chunk_0.Corefclass_2) HeadVar__3_3).F1;
                java.lang.String V_40_40 = ((gate2bel.Chunk_0.Corefclass_2) HeadVar__3_3).F2;
                builtin.Comparison_result_0 V_41_41 = null;

                {
                  V_41_41 = private_builtin.builtin_compare_int_3_p_0(V_59_59, V_39_39);
                }
                succeeded = (V_41_41.MR_value == builtin.Comparison_result_0.K0.MR_value);
                succeeded = !(succeeded);
                if (succeeded)
                  HeadVar__1_1 = V_41_41;
                else
                  {
                    HeadVar__1_1 = private_builtin.builtin_compare_string_3_p_0(V_58_58, V_40_40);
                  }
              }
          }
      return HeadVar__1_1;
    }
  }
  public static boolean __Unify____chunk_0_0(
    gate2bel.Chunk_0 HeadVar__1_1,
    gate2bel.Chunk_0 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object CastX_19 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object CastY_20 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      succeeded = (CastX_19 == CastY_20);
      if (succeeded)
        succeeded = true;
      else
        if ((HeadVar__1_1.data_tag == 0))
          {
            jmercury.runtime.TypeInfo_Struct TypeInfo_21_21 = null;
            jmercury.runtime.TypeInfo_Struct TypeInfo_22_22 = null;
            int V_3_3 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__1_1).F1;
            java.lang.String V_4_4 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__1_1).F2;
            java.lang.String V_5_5 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__1_1).F3;
            java.lang.String V_6_6 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__1_1).F4;
            list.List_1 V_7_7 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__1_1).F5;
            list.List_1 V_8_8 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__1_1).F6;
            int V_9_9 = 0;
            java.lang.String V_10_10 = null;
            java.lang.String V_11_11 = null;
            java.lang.String V_12_12 = null;
            list.List_1 V_13_13 = null;
            list.List_1 V_14_14 = null;

            succeeded = (HeadVar__2_2.data_tag == 0);
            if (succeeded)
              {
                V_9_9 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__2_2).F1;
                V_10_10 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__2_2).F2;
                V_11_11 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__2_2).F3;
                V_12_12 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__2_2).F4;
                V_13_13 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__2_2).F5;
                V_14_14 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__2_2).F6;
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
                                TypeInfo_21_21 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[23]);
                                {
                                  succeeded = builtin.unify_2_p_0(TypeInfo_21_21, ((java.lang.Object) (V_7_7)), ((java.lang.Object) (V_13_13)));
                                }
                                if (succeeded)
                                  {
                                    TypeInfo_22_22 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[24]);
                                    {
                                      succeeded = builtin.unify_2_p_0(TypeInfo_22_22, ((java.lang.Object) (V_8_8)), ((java.lang.Object) (V_14_14)));
                                    }
                                  }
                              }
                          }
                      }
                  }
              }
          }
        else
          {
            int V_15_15 = ((gate2bel.Chunk_0.Corefclass_2) HeadVar__1_1).F1;
            java.lang.String V_16_16 = ((gate2bel.Chunk_0.Corefclass_2) HeadVar__1_1).F2;
            int V_17_17 = 0;
            java.lang.String V_18_18 = null;

            succeeded = (HeadVar__2_2.data_tag == 1);
            if (succeeded)
              {
                V_17_17 = ((gate2bel.Chunk_0.Corefclass_2) HeadVar__2_2).F1;
                V_18_18 = ((gate2bel.Chunk_0.Corefclass_2) HeadVar__2_2).F2;
                succeeded = (V_15_15 == V_17_17);
                if (succeeded)
                  succeeded = V_16_16.equals(V_18_18);
              }
          }
      return succeeded;
    }
  }
//  gate2bel.m:83
  private static builtin.Comparison_result_0 __Compare____chmap_0_0(
    tree234.Tree234_2 HeadVar__2_2,
    tree234.Tree234_2 HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_6_6 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[3]);
      tree234.Tree234_2 Cast_HeadVar1_4 = HeadVar__2_2;
      tree234.Tree234_2 Cast_HeadVar2_5 = HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.compare_3_p_0(TypeInfo_6_6, ((java.lang.Object) (Cast_HeadVar1_4)), ((java.lang.Object) (Cast_HeadVar2_5)));
      }
      return HeadVar__1_1;
    }
  }
  private static boolean __Unify____chmap_0_0(
    tree234.Tree234_2 HeadVar__1_1,
    tree234.Tree234_2 HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeInfo_5_5 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[3]);
      tree234.Tree234_2 Cast_HeadVar1_3 = HeadVar__1_1;
      tree234.Tree234_2 Cast_HeadVar2_4 = HeadVar__2_2;

      {
        succeeded = builtin.unify_2_p_0(TypeInfo_5_5, ((java.lang.Object) (Cast_HeadVar1_3)), ((java.lang.Object) (Cast_HeadVar2_4)));
      }
      return succeeded;
    }
  }
//  gate2bel.m:579
  private static gate2bel.Owlstrtp_0 strtype2owlstrtp_2_p_0(
    gate2bel.Strtype_0 HeadVar__1_1)
  {
//  gate2bel.m:580
    {
      boolean succeeded = false;
      gate2bel.Owlstrtp_0 HeadVar__2_2 = null;

      switch (HeadVar__1_1.data_tag) {
        case 0:
          HeadVar__2_2 = (gate2bel.Owlstrtp_0) gate2bel.MR_scalar_common_33[0];
          break;
        case 1:
//  gate2bel.m:582
          HeadVar__2_2 = (gate2bel.Owlstrtp_0) gate2bel.MR_scalar_common_31[0];
//  gate2bel.m:580
          break;
        case 2:
//  gate2bel.m:583
          HeadVar__2_2 = (gate2bel.Owlstrtp_0) gate2bel.MR_scalar_common_32[0];
//  gate2bel.m:580
          break;
        case 3:
//  gate2bel.m:581
          {
            wordnet.Prontp_0 T_4 = ((gate2bel.Strtype_0.Pronoun_2) HeadVar__1_1).F2;
            java.lang.String V_3_3 = ((gate2bel.Strtype_0.Pronoun_2) HeadVar__1_1).F1;

            {
              HeadVar__2_2 = new gate2bel.Owlstrtp_0.Pronoun_1(T_4);
            }
          }
//  gate2bel.m:580
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
      return HeadVar__2_2;
    }
//  gate2bel.m:579
  }
//  gate2bel.m:565
  private static java.lang.Object [] owlstr_2_p_0(
    gate2bel.Cvalue_0 HeadVar__1_1)
  {
//  gate2bel.m:566
    {
      boolean succeeded = false;
      gate2bel.Owlstr_0 HeadVar__2_2 = null;

      if ((HeadVar__1_1.data_tag == 1))
//  gate2bel.m:570
        {
          java.lang.String Str_21 = null;
          gate2bel.Strtype_0 Tp0_22 = null;
          int Cls_23 = ((gate2bel.Cvalue_0.Cref_2) HeadVar__1_1).F2;
          gate2bel.Owlstrtp_0 Tp_24 = null;
          gate2bel.Cstring_0 V_25_25 = ((gate2bel.Cvalue_0.Cref_2) HeadVar__1_1).F1;

          succeeded = (V_25_25.data_tag == 1);
          if (succeeded)
            {
              Str_21 = ((gate2bel.Cstring_0.Str_2) V_25_25).F1;
              Tp0_22 = ((gate2bel.Cstring_0.Str_2) V_25_25).F2;
//  gate2bel.m:571
              {
                Tp_24 = gate2bel.strtype2owlstrtp_2_p_0(Tp0_22);
              }
//  gate2bel.m:570
              {
                HeadVar__2_2 = new gate2bel.Owlstr_0.Cref_3(Str_21, Tp_24, Cls_23);
              }
              succeeded = true;
            }
        }
//  gate2bel.m:566
      else
        {
          gate2bel.Cstring_0 V_26_26 = ((gate2bel.Cvalue_0.Lit_1) HeadVar__1_1).F1;
          gate2bel.Strtype_0 V_27_27 = null;
          java.lang.String V_28_28 = null;

          succeeded = (V_26_26.data_tag == 1);
          if (succeeded)
            {
              V_28_28 = ((gate2bel.Cstring_0.Str_2) V_26_26).F1;
              V_27_27 = ((gate2bel.Cstring_0.Str_2) V_26_26).F2;
              switch (V_27_27.data_tag) {
                case 0:
                  {
                    gate2bel.Owlstrtp_0 V_6_6 = (gate2bel.Owlstrtp_0) gate2bel.MR_scalar_common_33[0];

                    {
                      HeadVar__2_2 = new gate2bel.Owlstr_0.Str_2(V_28_28, V_6_6);
                    }
                  }
                  break;
                case 1:
//  gate2bel.m:568
                  {
                    gate2bel.Owlstrtp_0 V_16_16 = (gate2bel.Owlstrtp_0) gate2bel.MR_scalar_common_31[0];

                    {
                      HeadVar__2_2 = new gate2bel.Owlstr_0.Str_2(V_28_28, V_16_16);
                    }
                  }
//  gate2bel.m:566
                  break;
                case 2:
//  gate2bel.m:569
                  {
                    gate2bel.Owlstrtp_0 V_20_20 = (gate2bel.Owlstrtp_0) gate2bel.MR_scalar_common_32[0];

                    {
                      HeadVar__2_2 = new gate2bel.Owlstr_0.Str_2(V_28_28, V_20_20);
                    }
                  }
//  gate2bel.m:566
                  break;
                case 3:
//  gate2bel.m:567
                  {
                    java.lang.String Str_8 = ((gate2bel.Strtype_0.Pronoun_2) V_27_27).F1;
                    wordnet.Prontp_0 P_9 = ((gate2bel.Strtype_0.Pronoun_2) V_27_27).F2;
                    gate2bel.Owlstrtp_0 V_12_12 = null;

                    {
                      V_12_12 = new gate2bel.Owlstrtp_0.Pronoun_1(P_9);
                    }
                    {
                      HeadVar__2_2 = new gate2bel.Owlstr_0.Str_2(Str_8, V_12_12);
                    }
                  }
//  gate2bel.m:566
                  break;
                default: /*NOTREACHED*/
                  throw new jmercury.runtime.UnreachableDefault();
              }
              succeeded = true;
            }
        }
return new java.lang.Object[] {
        java.lang.Boolean.valueOf(succeeded),
        ((java.lang.Object) (HeadVar__2_2))
      };
    }
//  gate2bel.m:565
  }
//  gate2bel.m:555
  private static java.lang.Object word_corefs_5_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      tree234.Tree234_2 conv0_HeadVar__4_32 = null;

      {
        conv0_HeadVar__4_32 = gate2bel.IntroducedFrom__pred__word_corefs__555__1_4_p_0(((java.lang.Integer) (((java.lang.Object[]) closure)[3])).intValue(), ((pair.Pair_2) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2));
      }
      wrapper_arg_3 = ((java.lang.Object) (conv0_HeadVar__4_32));
      return wrapper_arg_3;
    }
  }
//  gate2bel.m:550
  private static java.lang.Object [] word_corefs_5_p_0(
    pair.Pair_2 HeadVar__1_1,
    tree234.Tree234_2 STATE_VARIABLE_Mmap_0_21,
    list.List_1 STATE_VARIABLE_Set_0_23)
  {
//  gate2bel.m:552
    {
      boolean succeeded = false;
      tree234.Tree234_2 STATE_VARIABLE_Mmap_22 = null;
      list.List_1 STATE_VARIABLE_Set_24 = null;
      int Class_6 = ((java.lang.Integer) (((pair.Pair_2) HeadVar__1_1).F1)).intValue();
      list.List_1 Ps_7 = ((list.List_1) ((pair.Pair_2) HeadVar__1_1).F2);

//  gate2bel.m:554
      if ((Ps_7.data_tag == 0))
//  gate2bel.m:553
        {
          STATE_VARIABLE_Mmap_22 = STATE_VARIABLE_Mmap_0_21;
          STATE_VARIABLE_Set_24 = STATE_VARIABLE_Set_0_23;
        }
//  gate2bel.m:554
      else
        {
          list.List_1 V_48_48 = ((list.List_1.F_cons_2) Ps_7).F2;
          pair.Pair_2 V_49_49 = ((pair.Pair_2) ((list.List_1.F_cons_2) Ps_7).F1);

          if ((V_48_48.data_tag == 0))
//  gate2bel.m:563
            {
              {
                STATE_VARIABLE_Set_24 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(Class_6), STATE_VARIABLE_Set_0_23);
              }
              STATE_VARIABLE_Mmap_22 = STATE_VARIABLE_Mmap_0_21;
            }
//  gate2bel.m:554
          else
            {
              jmercury.runtime.TypeInfo_Struct TypeInfo_46_46 = null;
              jmercury.runtime.TypeInfo_Struct TypeInfo_47_47 = null;
              /* closure */ java.lang.Object[] V_28_28 = null;
//  gate2bel.m:555
              java.lang.Object conv1_STATE_VARIABLE_Mmap_22 = null;

              {
                V_28_28 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_9[3])), ((java.lang.Object) (new AddrOf3_0(1))), java.lang.Integer.valueOf(1), java.lang.Integer.valueOf(Class_6)};
              }
              TypeInfo_46_46 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[17]);
              TypeInfo_47_47 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[21]);
              {
                conv1_STATE_VARIABLE_Mmap_22 = list.foldl_4_p_0(TypeInfo_46_46, TypeInfo_47_47, V_28_28, Ps_7, ((java.lang.Object) (STATE_VARIABLE_Mmap_0_21)));
              }
              STATE_VARIABLE_Mmap_22 = ((tree234.Tree234_2) conv1_STATE_VARIABLE_Mmap_22);
              STATE_VARIABLE_Set_24 = STATE_VARIABLE_Set_0_23;
//  gate2bel.m:554
            }
        }
//  gate2bel.m:552
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_Mmap_22)),
        ((java.lang.Object) (STATE_VARIABLE_Set_24))
      };
    }
//  gate2bel.m:550
  }
//  gate2bel.m:544
  private static java.lang.Object value_coref_3_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      java.lang.String conv0_HeadVar__2_44 = null;

      {
        conv0_HeadVar__2_44 = gate2bel.IntroducedFrom__pred__value_coref__544__1_2_p_0(((gate2bel.Str2_0) wrapper_arg_1));
      }
      wrapper_arg_2 = ((java.lang.Object) (conv0_HeadVar__2_44));
      return wrapper_arg_2;
    }
  }
//  gate2bel.m:536
  private static tree234.Tree234_2 value_coref_3_p_0(
    gate2bel.Value2_0 HeadVar__1_1,
    tree234.Tree234_2 STATE_VARIABLE_Wmap_0_2)
  {
//  gate2bel.m:537
    {
      boolean succeeded = false;
      tree234.Tree234_2 STATE_VARIABLE_Wmap_3 = null;

      switch (HeadVar__1_1.data_tag) {
        case 0:
          STATE_VARIABLE_Wmap_3 = STATE_VARIABLE_Wmap_0_2;
          break;
        case 1:
//  gate2bel.m:538
          STATE_VARIABLE_Wmap_3 = STATE_VARIABLE_Wmap_0_2;
//  gate2bel.m:537
          break;
        case 2:
//  gate2bel.m:539
          STATE_VARIABLE_Wmap_3 = STATE_VARIABLE_Wmap_0_2;
//  gate2bel.m:537
          break;
        case 3:
//  gate2bel.m:540
          STATE_VARIABLE_Wmap_3 = STATE_VARIABLE_Wmap_0_2;
//  gate2bel.m:537
          break;
        case 4:
//  gate2bel.m:541
          {
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_50_50 = null;
            jmercury.runtime.TypeInfo_Struct TypeInfo_51_51 = null;
            java.lang.String S_19 = null;
            gate2bel.Reftype_0 Tp_21 = null;
            int C_22 = 0;
            gate2bel.Str2_0 V_26_26 = ((gate2bel.Value2_0.Coref_2) HeadVar__1_1).F1;
            pair.Pair_2 V_27_27 = ((gate2bel.Value2_0.Coref_2) HeadVar__1_1).F2;
            pair.Pair_2 V_28_28 = null;
            gate2bel.Cword_0 V_30_30 = null;
            gate2bel.Strtype_0 V_20_20 = null;

            S_19 = ((gate2bel.Str2_0) V_26_26).F1;
            V_20_20 = ((gate2bel.Str2_0) V_26_26).F2;
            Tp_21 = ((gate2bel.Reftype_0) ((pair.Pair_2) V_27_27).F1);
            C_22 = ((java.lang.Integer) (((pair.Pair_2) V_27_27).F2)).intValue();
//  gate2bel.m:542
            {
              V_30_30 = new gate2bel.Cword_0.One_1(S_19);
            }
            {
              V_28_28 = new pair.Pair_2(((java.lang.Object) (V_30_30)), ((java.lang.Object) (Tp_21)));
            }
            TypeCtorInfo_50_50 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
            TypeInfo_51_51 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[17]);
            {
              STATE_VARIABLE_Wmap_3 = multi_map.set_4_p_0(TypeCtorInfo_50_50, TypeInfo_51_51, java.lang.Integer.valueOf(C_22), ((java.lang.Object) (V_28_28)), STATE_VARIABLE_Wmap_0_2);
            }
//  gate2bel.m:541
          }
//  gate2bel.m:537
          break;
        case 5:
//  gate2bel.m:543
          {
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_52_52 = null;
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_53_53 = null;
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_54_54 = null;
            jmercury.runtime.TypeInfo_Struct TypeInfo_55_55 = null;
            list.List_1 S2s_31 = ((gate2bel.Value2_0.Corefs_2) HeadVar__1_1).F1;
            gate2bel.Reftype_0 Tp_32 = null;
            int C_33 = 0;
            list.List_1 Ss_38 = null;
            pair.Pair_2 V_41_41 = ((gate2bel.Value2_0.Corefs_2) HeadVar__1_1).F2;
            /* closure */ java.lang.Object[] V_42_42 = null;
            pair.Pair_2 V_45_45 = null;
            gate2bel.Cword_0 V_47_47 = null;

            Tp_32 = ((gate2bel.Reftype_0) ((pair.Pair_2) V_41_41).F1);
            C_33 = ((java.lang.Integer) (((pair.Pair_2) V_41_41).F2)).intValue();
//  gate2bel.m:544
            V_42_42 = (/* closure */ java.lang.Object[]) gate2bel.MR_scalar_common_6[11];
            TypeCtorInfo_52_52 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_str2_0);
            TypeCtorInfo_53_53 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
            {
              Ss_38 = list.map_3_p_0(TypeCtorInfo_52_52, TypeCtorInfo_53_53, V_42_42, S2s_31);
            }
//  gate2bel.m:545
            {
              V_47_47 = new gate2bel.Cword_0.Many_1(Ss_38);
            }
            {
              V_45_45 = new pair.Pair_2(((java.lang.Object) (V_47_47)), ((java.lang.Object) (Tp_32)));
            }
            TypeCtorInfo_54_54 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
            TypeInfo_55_55 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[17]);
            {
              STATE_VARIABLE_Wmap_3 = multi_map.set_4_p_0(TypeCtorInfo_54_54, TypeInfo_55_55, java.lang.Integer.valueOf(C_33), ((java.lang.Object) (V_45_45)), STATE_VARIABLE_Wmap_0_2);
            }
//  gate2bel.m:543
          }
//  gate2bel.m:537
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
      return STATE_VARIABLE_Wmap_3;
    }
//  gate2bel.m:536
  }
//  gate2bel.m:530
  private static tree234.Tree234_2 triple_coref_3_p_0(
    gate2bel.Triple2_0 HeadVar__1_1,
    tree234.Tree234_2 STATE_VARIABLE_Wmap_0_2)
  {
//  gate2bel.m:531
    {
      boolean succeeded = false;
      tree234.Tree234_2 STATE_VARIABLE_Wmap_3 = null;

      if ((HeadVar__1_1.data_tag == 0))
        {
          gate2bel.Value2_0 S_5 = ((gate2bel.Triple2_0.Triple_5) HeadVar__1_1).F2;
          gate2bel.Value2_0 P_7 = ((gate2bel.Triple2_0.Triple_5) HeadVar__1_1).F4;
          gate2bel.Value2_0 O_8 = ((gate2bel.Triple2_0.Triple_5) HeadVar__1_1).F5;
          tree234.Tree234_2 STATE_VARIABLE_Wmap_12_12 = null;
          tree234.Tree234_2 STATE_VARIABLE_Wmap_13_13 = null;
          int V_4_4 = ((gate2bel.Triple2_0.Triple_5) HeadVar__1_1).F1;
          bool.Bool_0 V_6_6 = ((gate2bel.Triple2_0.Triple_5) HeadVar__1_1).F3;

//  gate2bel.m:532
          {
            STATE_VARIABLE_Wmap_12_12 = gate2bel.value_coref_3_p_0(S_5, STATE_VARIABLE_Wmap_0_2);
          }
          {
            STATE_VARIABLE_Wmap_13_13 = gate2bel.value_coref_3_p_0(P_7, STATE_VARIABLE_Wmap_12_12);
          }
          {
            STATE_VARIABLE_Wmap_3 = gate2bel.value_coref_3_p_0(O_8, STATE_VARIABLE_Wmap_13_13);
          }
//  gate2bel.m:531
        }
      else
//  gate2bel.m:533
        {
          gate2bel.Value2_0 S_16 = ((gate2bel.Triple2_0.Triple_6) HeadVar__1_1).F2;
          gate2bel.Value2_0 P_18 = ((gate2bel.Triple2_0.Triple_6) HeadVar__1_1).F4;
          gate2bel.Value2_0 O_19 = ((gate2bel.Triple2_0.Triple_6) HeadVar__1_1).F5;
          tree234.Tree234_2 STATE_VARIABLE_Wmap_24_24 = null;
          tree234.Tree234_2 STATE_VARIABLE_Wmap_25_25 = null;
          int V_15_15 = ((gate2bel.Triple2_0.Triple_6) HeadVar__1_1).F1;
          bool.Bool_0 V_17_17 = ((gate2bel.Triple2_0.Triple_6) HeadVar__1_1).F3;
          int V_20_20 = ((gate2bel.Triple2_0.Triple_6) HeadVar__1_1).F6;

//  gate2bel.m:534
          {
            STATE_VARIABLE_Wmap_24_24 = gate2bel.value_coref_3_p_0(S_16, STATE_VARIABLE_Wmap_0_2);
          }
          {
            STATE_VARIABLE_Wmap_25_25 = gate2bel.value_coref_3_p_0(P_18, STATE_VARIABLE_Wmap_24_24);
          }
          {
            STATE_VARIABLE_Wmap_3 = gate2bel.value_coref_3_p_0(O_19, STATE_VARIABLE_Wmap_25_25);
          }
//  gate2bel.m:533
        }
//  gate2bel.m:531
      return STATE_VARIABLE_Wmap_3;
    }
//  gate2bel.m:530
  }
//  gate2bel.m:523
  private static java.lang.Object chunk_coref_3_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      tree234.Tree234_2 conv0_STATE_VARIABLE_Wmap_3 = null;

      {
        conv0_STATE_VARIABLE_Wmap_3 = gate2bel.triple_coref_3_p_0(((gate2bel.Triple2_0) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2));
      }
      wrapper_arg_3 = ((java.lang.Object) (conv0_STATE_VARIABLE_Wmap_3));
      return wrapper_arg_3;
    }
  }
//  gate2bel.m:520
  private static gate2bel.Cmaps_0 chunk_coref_3_p_0(
    gate2bel.Chunk2_0 HeadVar__1_1,
    gate2bel.Cmaps_0 CM0_2)
  {
//  gate2bel.m:521
    {
      boolean succeeded = false;
      gate2bel.Cmaps_0 CM_3 = null;
      tree234.Tree234_2 V_30_30 = ((gate2bel.Cmaps_0) CM0_2).F2;
      tree234.Tree234_2 V_31_31 = ((gate2bel.Cmaps_0) CM0_2).F1;

      if ((HeadVar__1_1.data_tag == 0))
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_26_26 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_triple2_0);
          jmercury.runtime.TypeInfo_Struct TypeInfo_27_27 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[22]);
          list.List_1 Ts_9 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__1_1).F6;
          tree234.Tree234_2 Wmap_14 = null;
          /* closure */ java.lang.Object[] V_15_15 = (/* closure */ java.lang.Object[]) gate2bel.MR_scalar_common_6[10];
          int V_4_4 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__1_1).F1;
          java.lang.String V_5_5 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__1_1).F2;
          java.lang.String V_6_6 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__1_1).F3;
          java.lang.String V_7_7 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__1_1).F4;
          list.List_1 V_8_8 = ((gate2bel.Chunk2_0.Chunk_6) HeadVar__1_1).F5;
//  gate2bel.m:523
          java.lang.Object conv1_Wmap_14 = null;

          {
            conv1_Wmap_14 = list.foldl_4_p_0(TypeCtorInfo_26_26, TypeInfo_27_27, V_15_15, Ts_9, ((java.lang.Object) (V_30_30)));
          }
          Wmap_14 = ((tree234.Tree234_2) conv1_Wmap_14);
//  gate2bel.m:524
          {
            CM_3 = new gate2bel.Cmaps_0(V_31_31, Wmap_14);
          }
//  gate2bel.m:521
        }
      else
//  gate2bel.m:525
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_29_29 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
          int Class_16 = ((gate2bel.Chunk2_0.Corefclass_2) HeadVar__1_1).F1;
          java.lang.String Type_17 = ((gate2bel.Chunk2_0.Corefclass_2) HeadVar__1_1).F2;
          tree234.Tree234_2 Tmap_22 = null;

//  gate2bel.m:527
          {
            Tmap_22 = map.f_84_121_112_101_83_112_101_99_79_102_95_95_112_114_101_100_95_95_115_101_116_95_95_91_75_32_61_32_105_110_116_93_95_48_95_49_4_p_0(TypeCtorInfo_29_29, Class_16, ((java.lang.Object) (Type_17)), V_31_31);
          }
//  gate2bel.m:528
          {
            CM_3 = new gate2bel.Cmaps_0(Tmap_22, V_30_30);
          }
//  gate2bel.m:525
        }
//  gate2bel.m:521
      return CM_3;
    }
//  gate2bel.m:520
  }
//  gate2bel.m:509
  private static java.lang.Object conv_strings_5_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      gate2bel.Cstring_0 conv0_HeadVar__2_45 = null;

      {
        conv0_HeadVar__2_45 = gate2bel.IntroducedFrom__pred__conv_strings__509__1_2_p_0(((gate2bel.Str2_0) wrapper_arg_1));
      }
      wrapper_arg_2 = ((java.lang.Object) (conv0_HeadVar__2_45));
      return wrapper_arg_2;
    }
  }
//  gate2bel.m:502
  private static java.lang.Object [] conv_strings_5_p_0(
    java.lang.String _Nm_1,
    list.List_1 HeadVar__2_2,
    list.List_1 STATE_VARIABLE_Es_0_4)
  {
//  gate2bel.m:504
    {
      boolean succeeded = false;
      list.List_1 HeadVar__3_3 = null;
      list.List_1 STATE_VARIABLE_Es_5 = null;

      if ((HeadVar__2_2.data_tag == 0))
//  gate2bel.m:505
        {
          gate2bel.Cstring_0 V_20_20 = (gate2bel.Cstring_0) gate2bel.MR_scalar_common_11[0];
          list.List_1 V_21_21 = (list.List_1) gate2bel.MR_scalar_common_3[0];

          HeadVar__3_3 = (list.List_1) gate2bel.MR_scalar_common_25[1];
          STATE_VARIABLE_Es_5 = STATE_VARIABLE_Es_0_4;
        }
//  gate2bel.m:504
      else
        {
          list.List_1 V_51_51 = ((list.List_1.F_cons_2) HeadVar__2_2).F2;
          gate2bel.Str2_0 V_52_52 = ((gate2bel.Str2_0) ((list.List_1.F_cons_2) HeadVar__2_2).F1);

          if ((V_51_51.data_tag == 0))
            {
              java.lang.String S_7 = ((gate2bel.Str2_0) V_52_52).F1;
              gate2bel.Strtype_0 Tp_8 = ((gate2bel.Str2_0) V_52_52).F2;
              gate2bel.Cstring_0 V_14_14 = null;
              list.List_1 V_15_15 = null;

              {
                V_14_14 = new gate2bel.Cstring_0.Str_2(S_7, Tp_8);
              }
              V_15_15 = (list.List_1) gate2bel.MR_scalar_common_3[0];
              {
                HeadVar__3_3 = new list.List_1.F_cons_2(((java.lang.Object) (V_14_14)), V_15_15);
              }
              STATE_VARIABLE_Es_5 = STATE_VARIABLE_Es_0_4;
            }
          else
//  gate2bel.m:506
            {
//  gate2bel.m:509
              java.lang.String S_29 = null;
              gate2bel.Strtype_0 Tp_30 = null;
//  gate2bel.m:507
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_48_48 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_str2_0);
              list.List_1 V_38_38 = null;
              gate2bel.Str2_0 V_39_39 = null;
              list.List_1 V_40_40 = null;

              {
                V_38_38 = list.sort_and_remove_dups_1_f_0(TypeCtorInfo_48_48, HeadVar__2_2);
              }
              succeeded = (V_38_38.data_tag == 1);
              if (succeeded)
                {
                  V_39_39 = ((gate2bel.Str2_0) ((list.List_1.F_cons_2) V_38_38).F1);
                  V_40_40 = ((list.List_1.F_cons_2) V_38_38).F2;
                  S_29 = ((gate2bel.Str2_0) V_39_39).F1;
                  Tp_30 = ((gate2bel.Str2_0) V_39_39).F2;
                  succeeded = (V_40_40.data_tag == 0);
                }
//  gate2bel.m:509
              if (succeeded)
//  gate2bel.m:508
                {
                  gate2bel.Cstring_0 V_41_41 = null;
                  list.List_1 V_42_42 = null;

                  {
                    V_41_41 = new gate2bel.Cstring_0.Str_2(S_29, Tp_30);
                  }
                  V_42_42 = (list.List_1) gate2bel.MR_scalar_common_3[0];
                  {
                    HeadVar__3_3 = new list.List_1.F_cons_2(((java.lang.Object) (V_41_41)), V_42_42);
                  }
                }
//  gate2bel.m:509
              else
                {
                  jmercury.runtime.TypeInfo_Struct TypeCtorInfo_49_49 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_str2_0);
                  jmercury.runtime.TypeInfo_Struct TypeCtorInfo_50_50 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_cstring_0);
                  /* closure */ java.lang.Object[] V_43_43 = (/* closure */ java.lang.Object[]) gate2bel.MR_scalar_common_6[9];

                  {
                    HeadVar__3_3 = list.map_3_p_0(TypeCtorInfo_49_49, TypeCtorInfo_50_50, V_43_43, HeadVar__2_2);
                  }
                }
//  gate2bel.m:506
              STATE_VARIABLE_Es_5 = STATE_VARIABLE_Es_0_4;
            }
//  gate2bel.m:504
        }
return new java.lang.Object[] {
        ((java.lang.Object) (HeadVar__3_3)),
        ((java.lang.Object) (STATE_VARIABLE_Es_5))
      };
    }
//  gate2bel.m:502
  }
//  gate2bel.m:491
  private static java.lang.Object [] conv_obj_6_p_0(
    maybe.Maybe_1 WN_7,
    java.lang.String HeadVar__2_8,
    java.lang.String S0_9,
    list.List_1 STATE_VARIABLE_Es_0_18)
  {
//  gate2bel.m:492
    {
      boolean succeeded = false;
      gate2bel.Str2_0 S2_10 = null;
      list.List_1 STATE_VARIABLE_Es_19 = null;
//  gate2bel.m:494
      wordnet.Prontp_0 T_12 = null;
      java.lang.String P_13 = null;

//  gate2bel.m:493
      {
        java.lang.Object [] result = wordnet.pronoun_string_3_p_0(S0_9);
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        T_12 = (wordnet.Prontp_0) result[1];
        P_13 = (java.lang.String) result[2];
      }
//  gate2bel.m:494
      if (succeeded)
//  gate2bel.m:493
        {
          gate2bel.Strtype_0 V_20_20 = null;

          {
            V_20_20 = new gate2bel.Strtype_0.Pronoun_2(P_13, T_12);
          }
          {
            S2_10 = new gate2bel.Str2_0(S0_9, V_20_20);
          }
        }
//  gate2bel.m:494
      else
//  gate2bel.m:495
        {
          wordnet.Prontp_0 T_29 = null;
          java.lang.String P_30 = null;
//  gate2bel.m:494
          java.lang.String V_21_21 = null;

          {
            V_21_21 = string.to_lower_1_f_0(S0_9);
          }
          {
            java.lang.Object [] result = wordnet.pronoun_string_3_p_0(V_21_21);
            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
            T_29 = (wordnet.Prontp_0) result[1];
            P_30 = (java.lang.String) result[2];
          }
//  gate2bel.m:495
          if (succeeded)
//  gate2bel.m:494
            {
              gate2bel.Strtype_0 V_22_22 = null;

              {
                V_22_22 = new gate2bel.Strtype_0.Pronoun_2(P_30, T_29);
              }
              {
                S2_10 = new gate2bel.Str2_0(S0_9, V_22_22);
              }
            }
//  gate2bel.m:495
          else
//  gate2bel.m:498
            {
              java.lang.String S_15 = null;

//  gate2bel.m:495
              {
                java.lang.Object [] result = wordnet.noun_string_4_p_0(WN_7, S0_9);
                succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                S_15 = (java.lang.String) result[1];
              }
//  gate2bel.m:498
              if (succeeded)
//  gate2bel.m:497
                {
                  gate2bel.Strtype_0 V_23_23 = (gate2bel.Strtype_0) gate2bel.MR_scalar_common_27[0];

//  gate2bel.m:496
                  {
                    S2_10 = new gate2bel.Str2_0(S_15, V_23_23);
                  }
//  gate2bel.m:497
                }
//  gate2bel.m:498
              else
//  gate2bel.m:499
                {
                  java.lang.String S_28 = null;
//  gate2bel.m:498
                  wordnet.Pptp_0 V_25_25 = null;
                  wordnet.Ctp_0 V_17_17 = null;

                  {
                    java.lang.Object [] result = wordnet.pp_string_3_p_0(WN_7, S0_9);
                    succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                    V_25_25 = (wordnet.Pptp_0) result[1];
                  }
                  if (succeeded)
                    {
                      V_17_17 = ((wordnet.Pptp_0) V_25_25).F2;
                      S_28 = ((wordnet.Pptp_0) V_25_25).F3;
                      succeeded = true;
                    }
//  gate2bel.m:499
                  if (succeeded)
//  gate2bel.m:498
                    {
                      gate2bel.Strtype_0 V_26_26 = (gate2bel.Strtype_0) gate2bel.MR_scalar_common_30[0];

                      {
                        S2_10 = new gate2bel.Str2_0(S_28, V_26_26);
                      }
                    }
//  gate2bel.m:499
                  else
                    {
                      gate2bel.Strtype_0 V_27_27 = (gate2bel.Strtype_0) gate2bel.MR_scalar_common_28[0];

                      {
                        S2_10 = new gate2bel.Str2_0(S0_9, V_27_27);
                      }
                    }
                }
//  gate2bel.m:498
            }
//  gate2bel.m:495
        }
//  gate2bel.m:499
      STATE_VARIABLE_Es_19 = STATE_VARIABLE_Es_0_18;
//  gate2bel.m:492
return new java.lang.Object[] {
        ((java.lang.Object) (S2_10)),
        ((java.lang.Object) (STATE_VARIABLE_Es_19))
      };
    }
//  gate2bel.m:491
  }
//  gate2bel.m:475
  private static boolean conv_pred_7_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1)
  {
    {
      boolean succeeded = false;
      /* generic_type */ java.lang.Object closure = closure_arg;

      {
        succeeded = gate2bel.IntroducedFrom__pred__conv_pred__475__1_1_p_0(((java.lang.String) wrapper_arg_1));
      }
      return succeeded;
    }
  }
//  gate2bel.m:470
  private static java.lang.Object [] conv_pred_7_p_0(
    maybe.Maybe_1 WN_1,
    java.lang.String F_2,
    gate2bel.Value_0 HeadVar__3_3,
    list.List_1 STATE_VARIABLE_Es_0_6)
  {
//  gate2bel.m:472
    {
      boolean succeeded = false;
      bool.Bool_0 HeadVar__4_4 = null;
      gate2bel.Value2_0 HeadVar__5_5 = null;
      list.List_1 STATE_VARIABLE_Es_7 = null;

      switch (HeadVar__3_3.data_tag) {
        case 0:
          {
            HeadVar__4_4 = bool.Bool_0.K0;
            HeadVar__5_5 = (gate2bel.Value2_0) gate2bel.MR_scalar_common_23[0];
            STATE_VARIABLE_Es_7 = STATE_VARIABLE_Es_0_6;
          }
          break;
        case 1:
//  gate2bel.m:473
          {
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_74_74 = null;
            java.lang.String S0_15 = ((gate2bel.Value_0.Str_1) HeadVar__3_3).F1;
            list.List_1 Ss0_19 = null;
            list.List_1 Ss_21 = null;
            java.lang.String V_28_28 = "--";
            /* closure */ java.lang.Object[] V_29_29 = null;
//  gate2bel.m:480
            java.lang.String S_22 = null;
//  gate2bel.m:476
            list.List_1 V_23_23 = null;

//  gate2bel.m:474
            {
              Ss0_19 = string.split_at_string_2_f_0(V_28_28, S0_15);
            }
//  gate2bel.m:475
            V_29_29 = (/* closure */ java.lang.Object[]) gate2bel.MR_scalar_common_6[8];
            TypeCtorInfo_74_74 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
            {
              Ss_21 = list.filter_3_p_0(TypeCtorInfo_74_74, V_29_29, Ss0_19);
            }
//  gate2bel.m:476
            succeeded = (Ss_21.data_tag == 1);
            if (succeeded)
              {
                S_22 = ((java.lang.String) ((list.List_1.F_cons_2) Ss_21).F1);
                V_23_23 = ((list.List_1.F_cons_2) Ss_21).F2;
//  gate2bel.m:479
                {
                  bool.Bool_0 B_24 = null;
                  java.lang.String Verb_25 = null;

//  gate2bel.m:477
                  {
                    java.lang.Object [] result = wordnet.verb_string_4_p_0(WN_1, S_22);
                    succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                    B_24 = (bool.Bool_0) result[1];
                    Verb_25 = (java.lang.String) result[2];
                  }
//  gate2bel.m:479
                  if (succeeded)
//  gate2bel.m:478
                    {
                      gate2bel.Str2_0 V_31_31 = null;
                      gate2bel.Strtype_0 V_32_32 = null;

                      HeadVar__4_4 = B_24;
                      V_32_32 = (gate2bel.Strtype_0) gate2bel.MR_scalar_common_27[0];
                      {
                        V_31_31 = new gate2bel.Str2_0(Verb_25, V_32_32);
                      }
                      {
                        HeadVar__5_5 = new gate2bel.Value2_0.Str_1(V_31_31);
                      }
                    }
//  gate2bel.m:479
                  else
                    {
                      gate2bel.Str2_0 V_33_33 = null;
                      gate2bel.Strtype_0 V_34_34 = null;

                      HeadVar__4_4 = bool.Bool_0.K0;
                      V_34_34 = (gate2bel.Strtype_0) gate2bel.MR_scalar_common_28[0];
                      {
                        V_33_33 = new gate2bel.Str2_0(S_22, V_34_34);
                      }
                      {
                        HeadVar__5_5 = new gate2bel.Value2_0.Str_1(V_33_33);
                      }
                    }
                }
//  gate2bel.m:476
              }
            else
//  gate2bel.m:480
              {
                HeadVar__4_4 = bool.Bool_0.K0;
                HeadVar__5_5 = (gate2bel.Value2_0) gate2bel.MR_scalar_common_23[0];
              }
//  gate2bel.m:473
            STATE_VARIABLE_Es_7 = STATE_VARIABLE_Es_0_6;
          }
//  gate2bel.m:472
          break;
        case 2:
//  gate2bel.m:481
          {
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_75_75 = null;
            errors.Err_loc_0 V_42_42 = null;
            sberrs.Error_0 V_43_43 = null;

            HeadVar__4_4 = bool.Bool_0.K0;
            HeadVar__5_5 = (gate2bel.Value2_0) gate2bel.MR_scalar_common_23[0];
//  gate2bel.m:482
            {
              V_42_42 = new errors.Err_loc_0.File_1(F_2);
            }
            V_43_43 = (sberrs.Error_0) gate2bel.MR_scalar_common_29[0];
            TypeCtorInfo_75_75 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
            {
              STATE_VARIABLE_Es_7 = errors.add_error_4_p_0(TypeCtorInfo_75_75, V_42_42, ((java.lang.Object) (V_43_43)), STATE_VARIABLE_Es_0_6);
            }
//  gate2bel.m:481
          }
//  gate2bel.m:472
          break;
        case 3:
//  gate2bel.m:483
          {
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_76_76 = null;
            errors.Err_loc_0 V_51_51 = null;
            sberrs.Error_0 V_52_52 = null;

            HeadVar__4_4 = bool.Bool_0.K0;
            HeadVar__5_5 = (gate2bel.Value2_0) gate2bel.MR_scalar_common_23[0];
//  gate2bel.m:484
            {
              V_51_51 = new errors.Err_loc_0.File_1(F_2);
            }
            V_52_52 = (sberrs.Error_0) gate2bel.MR_scalar_common_29[0];
            TypeCtorInfo_76_76 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
            {
              STATE_VARIABLE_Es_7 = errors.add_error_4_p_0(TypeCtorInfo_76_76, V_51_51, ((java.lang.Object) (V_52_52)), STATE_VARIABLE_Es_0_6);
            }
//  gate2bel.m:483
          }
//  gate2bel.m:472
          break;
        case 4:
//  gate2bel.m:485
          {
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_77_77 = null;
            errors.Err_loc_0 V_61_61 = null;
            sberrs.Error_0 V_62_62 = null;

            HeadVar__4_4 = bool.Bool_0.K0;
            HeadVar__5_5 = (gate2bel.Value2_0) gate2bel.MR_scalar_common_23[0];
//  gate2bel.m:486
            {
              V_61_61 = new errors.Err_loc_0.File_1(F_2);
            }
            V_62_62 = (sberrs.Error_0) gate2bel.MR_scalar_common_29[0];
            TypeCtorInfo_77_77 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
            {
              STATE_VARIABLE_Es_7 = errors.add_error_4_p_0(TypeCtorInfo_77_77, V_61_61, ((java.lang.Object) (V_62_62)), STATE_VARIABLE_Es_0_6);
            }
//  gate2bel.m:485
          }
//  gate2bel.m:472
          break;
        case 5:
//  gate2bel.m:487
          {
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_78_78 = null;
            errors.Err_loc_0 V_71_71 = null;
            sberrs.Error_0 V_72_72 = null;

            HeadVar__4_4 = bool.Bool_0.K0;
            HeadVar__5_5 = (gate2bel.Value2_0) gate2bel.MR_scalar_common_23[0];
//  gate2bel.m:488
            {
              V_71_71 = new errors.Err_loc_0.File_1(F_2);
            }
            V_72_72 = (sberrs.Error_0) gate2bel.MR_scalar_common_29[0];
            TypeCtorInfo_78_78 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
            {
              STATE_VARIABLE_Es_7 = errors.add_error_4_p_0(TypeCtorInfo_78_78, V_71_71, ((java.lang.Object) (V_72_72)), STATE_VARIABLE_Es_0_6);
            }
//  gate2bel.m:487
          }
//  gate2bel.m:472
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
return new java.lang.Object[] {
        ((java.lang.Object) (HeadVar__4_4)),
        ((java.lang.Object) (HeadVar__5_5)),
        ((java.lang.Object) (STATE_VARIABLE_Es_7))
      };
    }
//  gate2bel.m:470
  }
//  gate2bel.m:460
  private static java.lang.Object [] conv_subj_6_p_0(
    maybe.Maybe_1 WN_7,
    java.lang.String HeadVar__2_8,
    java.lang.String S0_9,
    list.List_1 STATE_VARIABLE_Es_0_16)
  {
//  gate2bel.m:461
    {
      boolean succeeded = false;
      gate2bel.Str2_0 S2_10 = null;
      list.List_1 STATE_VARIABLE_Es_17 = null;
//  gate2bel.m:463
      wordnet.Prontp_0 T_12 = null;
      java.lang.String P_13 = null;

//  gate2bel.m:462
      {
        java.lang.Object [] result = wordnet.pronoun_string_3_p_0(S0_9);
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        T_12 = (wordnet.Prontp_0) result[1];
        P_13 = (java.lang.String) result[2];
      }
//  gate2bel.m:463
      if (succeeded)
//  gate2bel.m:462
        {
          gate2bel.Strtype_0 V_18_18 = null;

          {
            V_18_18 = new gate2bel.Strtype_0.Pronoun_2(P_13, T_12);
          }
          {
            S2_10 = new gate2bel.Str2_0(S0_9, V_18_18);
          }
        }
//  gate2bel.m:463
      else
//  gate2bel.m:464
        {
          wordnet.Prontp_0 T_24 = null;
          java.lang.String P_25 = null;
//  gate2bel.m:463
          java.lang.String V_19_19 = null;

          {
            V_19_19 = string.to_lower_1_f_0(S0_9);
          }
          {
            java.lang.Object [] result = wordnet.pronoun_string_3_p_0(V_19_19);
            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
            T_24 = (wordnet.Prontp_0) result[1];
            P_25 = (java.lang.String) result[2];
          }
//  gate2bel.m:464
          if (succeeded)
//  gate2bel.m:463
            {
              gate2bel.Strtype_0 V_20_20 = null;

              {
                V_20_20 = new gate2bel.Strtype_0.Pronoun_2(P_25, T_24);
              }
              {
                S2_10 = new gate2bel.Str2_0(S0_9, V_20_20);
              }
            }
//  gate2bel.m:464
          else
//  gate2bel.m:467
            {
              java.lang.String S_15 = null;

//  gate2bel.m:464
              {
                java.lang.Object [] result = wordnet.noun_string_4_p_0(WN_7, S0_9);
                succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                S_15 = (java.lang.String) result[1];
              }
//  gate2bel.m:467
              if (succeeded)
//  gate2bel.m:466
                {
                  gate2bel.Strtype_0 V_21_21 = (gate2bel.Strtype_0) gate2bel.MR_scalar_common_27[0];

//  gate2bel.m:465
                  {
                    S2_10 = new gate2bel.Str2_0(S_15, V_21_21);
                  }
//  gate2bel.m:466
                }
//  gate2bel.m:467
              else
                {
                  gate2bel.Strtype_0 V_23_23 = (gate2bel.Strtype_0) gate2bel.MR_scalar_common_28[0];

                  {
                    S2_10 = new gate2bel.Str2_0(S0_9, V_23_23);
                  }
                }
            }
//  gate2bel.m:464
        }
//  gate2bel.m:467
      STATE_VARIABLE_Es_17 = STATE_VARIABLE_Es_0_16;
//  gate2bel.m:461
return new java.lang.Object[] {
        ((java.lang.Object) (S2_10)),
        ((java.lang.Object) (STATE_VARIABLE_Es_17))
      };
    }
//  gate2bel.m:460
  }
//  gate2bel.m:457
  private static boolean conv_str_2_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1)
  {
    {
      boolean succeeded = false;
      /* generic_type */ java.lang.Object closure = closure_arg;

      {
        succeeded = gate2bel.IntroducedFrom__pred__conv_str__457__1_1_p_0(((java.lang.String) wrapper_arg_1));
      }
      return succeeded;
    }
  }
//  gate2bel.m:454
  private static java.lang.Object [] conv_str_2_p_0(
    java.lang.String S0_3)
  {
//  gate2bel.m:455
    {
      boolean succeeded = false;
      java.lang.String S_4 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_13_13 = null;
      list.List_1 Ss0_5 = null;
      list.List_1 Ss_7 = null;
      java.lang.String V_9_9 = "--";
      /* closure */ java.lang.Object[] V_10_10 = null;
//  gate2bel.m:457
      list.List_1 V_8_8 = null;

//  gate2bel.m:456
      {
        Ss0_5 = string.split_at_string_2_f_0(V_9_9, S0_3);
      }
//  gate2bel.m:457
      V_10_10 = (/* closure */ java.lang.Object[]) gate2bel.MR_scalar_common_6[7];
      TypeCtorInfo_13_13 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
      {
        Ss_7 = list.filter_3_p_0(TypeCtorInfo_13_13, V_10_10, Ss0_5);
      }
      succeeded = (Ss_7.data_tag == 1);
      if (succeeded)
        {
          S_4 = ((java.lang.String) ((list.List_1.F_cons_2) Ss_7).F1);
          V_8_8 = ((list.List_1.F_cons_2) Ss_7).F2;
        }
//  gate2bel.m:455
return new java.lang.Object[] {
        java.lang.Boolean.valueOf(succeeded),
        ((java.lang.Object) (S_4))
      };
    }
//  gate2bel.m:454
  }
//  gate2bel.m:449
  private static java.lang.Object conv_val_5_p_0_2(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      gate2bel.Cvalue_0 conv1_HeadVar__2_58 = null;

      {
        conv1_HeadVar__2_58 = gate2bel.IntroducedFrom__pred__conv_val__449__1_2_p_0(((gate2bel.Cstring_0) wrapper_arg_1));
      }
      wrapper_arg_2 = ((java.lang.Object) (conv1_HeadVar__2_58));
      return wrapper_arg_2;
    }
  }
//  gate2bel.m:452
  private static java.lang.Object conv_val_5_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      gate2bel.Cvalue_0 conv0_HeadVar__3_76 = null;

      {
        conv0_HeadVar__3_76 = gate2bel.IntroducedFrom__pred__conv_val__452__1_3_p_0(((java.lang.Integer) (((java.lang.Object[]) closure)[3])).intValue(), ((gate2bel.Cstring_0) wrapper_arg_1));
      }
      wrapper_arg_2 = ((java.lang.Object) (conv0_HeadVar__3_76));
      return wrapper_arg_2;
    }
  }
//  gate2bel.m:442
  private static java.lang.Object [] conv_val_5_p_0(
    java.lang.String Nm_1,
    gate2bel.Value2_0 HeadVar__2_2,
    list.List_1 STATE_VARIABLE_Es_0_4)
  {
//  gate2bel.m:443
    {
      boolean succeeded = false;
      list.List_1 HeadVar__3_3 = null;
      list.List_1 STATE_VARIABLE_Es_5 = null;

      switch (HeadVar__2_2.data_tag) {
        case 0:
          {
            gate2bel.Cvalue_0 V_10_10 = (gate2bel.Cvalue_0) gate2bel.MR_scalar_common_24[0];
            gate2bel.Cstring_0 V_11_11 = (gate2bel.Cstring_0) gate2bel.MR_scalar_common_11[0];
            list.List_1 V_12_12 = (list.List_1) gate2bel.MR_scalar_common_3[0];

            HeadVar__3_3 = (list.List_1) gate2bel.MR_scalar_common_25[0];
            STATE_VARIABLE_Es_5 = STATE_VARIABLE_Es_0_4;
          }
          break;
        case 1:
//  gate2bel.m:444
          {
            java.lang.String S_14 = null;
            gate2bel.Strtype_0 Tp_15 = null;
            gate2bel.Str2_0 V_19_19 = ((gate2bel.Value2_0.Str_1) HeadVar__2_2).F1;
            gate2bel.Cvalue_0 V_20_20 = null;
            gate2bel.Cstring_0 V_21_21 = null;
            list.List_1 V_22_22 = null;

            S_14 = ((gate2bel.Str2_0) V_19_19).F1;
            Tp_15 = ((gate2bel.Str2_0) V_19_19).F2;
            {
              V_21_21 = new gate2bel.Cstring_0.Str_2(S_14, Tp_15);
            }
            {
              V_20_20 = new gate2bel.Cvalue_0.Lit_1(V_21_21);
            }
            V_22_22 = (list.List_1) gate2bel.MR_scalar_common_3[0];
            {
              HeadVar__3_3 = new list.List_1.F_cons_2(((java.lang.Object) (V_20_20)), V_22_22);
            }
            STATE_VARIABLE_Es_5 = STATE_VARIABLE_Es_0_4;
          }
//  gate2bel.m:443
          break;
        case 2:
//  gate2bel.m:447
          {
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_79_79 = null;
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_80_80 = null;
            list.List_1 Ss_47 = ((gate2bel.Value2_0.Strs_1) HeadVar__2_2).F1;
            list.List_1 Cs_50 = null;
            /* closure */ java.lang.Object[] V_56_56 = null;

//  gate2bel.m:448
            {
              java.lang.Object [] result = gate2bel.conv_strings_5_p_0(Nm_1, Ss_47, STATE_VARIABLE_Es_0_4);
              Cs_50 = (list.List_1) result[0];
              STATE_VARIABLE_Es_5 = (list.List_1) result[1];
            }
//  gate2bel.m:449
            V_56_56 = (/* closure */ java.lang.Object[]) gate2bel.MR_scalar_common_6[6];
            TypeCtorInfo_79_79 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_cstring_0);
            TypeCtorInfo_80_80 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_cvalue_0);
            {
              HeadVar__3_3 = list.map_3_p_0(TypeCtorInfo_79_79, TypeCtorInfo_80_80, V_56_56, Cs_50);
            }
//  gate2bel.m:447
          }
//  gate2bel.m:443
          break;
        case 3:
//  gate2bel.m:445
          {
            int C_25 = 0;
            pair.Pair_2 V_29_29 = ((gate2bel.Value2_0.Coref_1) HeadVar__2_2).F1;
            gate2bel.Cvalue_0 V_30_30 = null;
            gate2bel.Cstring_0 V_31_31 = null;
            list.List_1 V_32_32 = null;
            gate2bel.Reftype_0 V_24_24 = ((gate2bel.Reftype_0) ((pair.Pair_2) V_29_29).F1);

            C_25 = ((java.lang.Integer) (((pair.Pair_2) V_29_29).F2)).intValue();
            V_31_31 = (gate2bel.Cstring_0) gate2bel.MR_scalar_common_11[0];
            {
              V_30_30 = new gate2bel.Cvalue_0.Cref_2(V_31_31, C_25);
            }
            V_32_32 = (list.List_1) gate2bel.MR_scalar_common_3[0];
            {
              HeadVar__3_3 = new list.List_1.F_cons_2(((java.lang.Object) (V_30_30)), V_32_32);
            }
            STATE_VARIABLE_Es_5 = STATE_VARIABLE_Es_0_4;
          }
//  gate2bel.m:443
          break;
        case 4:
//  gate2bel.m:446
          {
            java.lang.String S_34 = null;
            gate2bel.Strtype_0 Tp_35 = null;
            int C_37 = 0;
            gate2bel.Str2_0 V_41_41 = ((gate2bel.Value2_0.Coref_2) HeadVar__2_2).F1;
            pair.Pair_2 V_42_42 = ((gate2bel.Value2_0.Coref_2) HeadVar__2_2).F2;
            gate2bel.Cvalue_0 V_43_43 = null;
            gate2bel.Cstring_0 V_44_44 = null;
            list.List_1 V_45_45 = null;
            gate2bel.Reftype_0 V_36_36 = null;

            S_34 = ((gate2bel.Str2_0) V_41_41).F1;
            Tp_35 = ((gate2bel.Str2_0) V_41_41).F2;
            V_36_36 = ((gate2bel.Reftype_0) ((pair.Pair_2) V_42_42).F1);
            C_37 = ((java.lang.Integer) (((pair.Pair_2) V_42_42).F2)).intValue();
            {
              V_44_44 = new gate2bel.Cstring_0.Str_2(S_34, Tp_35);
            }
            {
              V_43_43 = new gate2bel.Cvalue_0.Cref_2(V_44_44, C_37);
            }
            V_45_45 = (list.List_1) gate2bel.MR_scalar_common_3[0];
            {
              HeadVar__3_3 = new list.List_1.F_cons_2(((java.lang.Object) (V_43_43)), V_45_45);
            }
            STATE_VARIABLE_Es_5 = STATE_VARIABLE_Es_0_4;
          }
//  gate2bel.m:443
          break;
        case 5:
//  gate2bel.m:450
          {
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_81_81 = null;
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_82_82 = null;
            list.List_1 Ss_62 = ((gate2bel.Value2_0.Corefs_2) HeadVar__2_2).F1;
            int I_64 = 0;
            list.List_1 Cs_67 = null;
            pair.Pair_2 V_72_72 = ((gate2bel.Value2_0.Corefs_2) HeadVar__2_2).F2;
            /* closure */ java.lang.Object[] V_74_74 = null;
            gate2bel.Reftype_0 V_63_63 = ((gate2bel.Reftype_0) ((pair.Pair_2) V_72_72).F1);

            I_64 = ((java.lang.Integer) (((pair.Pair_2) V_72_72).F2)).intValue();
//  gate2bel.m:451
            {
              java.lang.Object [] result = gate2bel.conv_strings_5_p_0(Nm_1, Ss_62, STATE_VARIABLE_Es_0_4);
              Cs_67 = (list.List_1) result[0];
              STATE_VARIABLE_Es_5 = (list.List_1) result[1];
            }
//  gate2bel.m:452
            {
              V_74_74 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_5[3])), ((java.lang.Object) (new AddrOf2_0(76))), java.lang.Integer.valueOf(1), java.lang.Integer.valueOf(I_64)};
            }
            TypeCtorInfo_81_81 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_cstring_0);
            TypeCtorInfo_82_82 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_cvalue_0);
            {
              HeadVar__3_3 = list.map_3_p_0(TypeCtorInfo_81_81, TypeCtorInfo_82_82, V_74_74, Cs_67);
            }
//  gate2bel.m:450
          }
//  gate2bel.m:443
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
return new java.lang.Object[] {
        ((java.lang.Object) (HeadVar__3_3)),
        ((java.lang.Object) (STATE_VARIABLE_Es_5))
      };
    }
//  gate2bel.m:442
  }
//  gate2bel.m:426
  private static java.lang.Object [] conv_value_5_p_0_2(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      boolean succeeded = false;
      /* generic_type */ java.lang.Object closure = closure_arg;
      java.lang.String conv11_S_4 = null;

      {
        java.lang.Object [] result = gate2bel.conv_str_2_p_0(((java.lang.String) wrapper_arg_1));
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        conv11_S_4 = (java.lang.String) result[1];
      }
      if (succeeded)
        {
          wrapper_arg_2 = ((java.lang.Object) (conv11_S_4));
          succeeded = true;
        }
return new java.lang.Object[] {
        java.lang.Boolean.valueOf(succeeded),
        ((java.lang.Object) (wrapper_arg_2))
      };
    }
  }
//  gate2bel.m:435
  private static java.lang.Object [] conv_value_5_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      boolean succeeded = false;
      /* generic_type */ java.lang.Object closure = closure_arg;
      java.lang.String conv3_S_4 = null;

      {
        java.lang.Object [] result = gate2bel.conv_str_2_p_0(((java.lang.String) wrapper_arg_1));
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        conv3_S_4 = (java.lang.String) result[1];
      }
      if (succeeded)
        {
          wrapper_arg_2 = ((java.lang.Object) (conv3_S_4));
          succeeded = true;
        }
return new java.lang.Object[] {
        java.lang.Boolean.valueOf(succeeded),
        ((java.lang.Object) (wrapper_arg_2))
      };
    }
  }
//  gate2bel.m:421
  private static java.lang.Object [] conv_value_5_p_0(
    /* closure */ java.lang.Object[] Pred_1,
    gate2bel.Value_0 HeadVar__2_2,
    list.List_1 STATE_VARIABLE_Es_0_4)
  {
//  gate2bel.m:422
    {
      boolean succeeded = false;
      gate2bel.Value2_0 HeadVar__3_3 = null;
      list.List_1 STATE_VARIABLE_Es_5 = null;

      switch (HeadVar__2_2.data_tag) {
        case 0:
//  gate2bel.m:439
          {
            HeadVar__3_3 = (gate2bel.Value2_0) gate2bel.MR_scalar_common_23[0];
            STATE_VARIABLE_Es_5 = STATE_VARIABLE_Es_0_4;
          }
//  gate2bel.m:422
          break;
        case 1:
          {
            java.lang.String S0_7 = ((gate2bel.Value_0.Str_1) HeadVar__2_2).F1;
//  gate2bel.m:424
            java.lang.String S_10 = null;

//  gate2bel.m:423
            {
              java.lang.Object [] result = gate2bel.conv_str_2_p_0(S0_7);
              succeeded = ((java.lang.Boolean) result[0]).booleanValue();
              S_10 = (java.lang.String) result[1];
            }
//  gate2bel.m:424
            if (succeeded)
//  gate2bel.m:423
              {
                gate2bel.Str2_0 Str_11 = null;
                jmercury.runtime.MethodPtr func_8 = ((jmercury.runtime.MethodPtr) ((java.lang.Object[]) Pred_1)[1]);
                java.lang.Object conv10_Str_11 = null;
                java.lang.Object conv9_STATE_VARIABLE_Es_5 = null;

                {
                  java.lang.Object [] result = ((java.lang.Object[]) ((jmercury.runtime.MethodPtr3) func_8).call___0_0(((java.lang.Object) (((/* generic_type */ java.lang.Object) Pred_1))), ((java.lang.Object) (((java.lang.Object) (S_10)))), ((java.lang.Object) (((java.lang.Object) (STATE_VARIABLE_Es_0_4))))));
                  conv10_Str_11 = (java.lang.Object) result[0];
                  conv9_STATE_VARIABLE_Es_5 = (java.lang.Object) result[1];
                }
                Str_11 = ((gate2bel.Str2_0) conv10_Str_11);
                STATE_VARIABLE_Es_5 = ((list.List_1) conv9_STATE_VARIABLE_Es_5);
                {
                  HeadVar__3_3 = new gate2bel.Value2_0.Str_1(Str_11);
                }
              }
//  gate2bel.m:424
            else
              {
                HeadVar__3_3 = (gate2bel.Value2_0) gate2bel.MR_scalar_common_23[0];
                STATE_VARIABLE_Es_5 = STATE_VARIABLE_Es_0_4;
              }
//  gate2bel.m:422
          }
          break;
        case 2:
//  gate2bel.m:425
          {
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_73_73 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
            list.List_1 Ss0_16 = ((gate2bel.Value_0.Strs_1) HeadVar__2_2).F1;
            list.List_1 Ss_19 = null;
            /* closure */ java.lang.Object[] V_28_28 = (/* closure */ java.lang.Object[]) gate2bel.MR_scalar_common_6[5];

//  gate2bel.m:426
            {
              Ss_19 = list.filter_map_3_p_0(TypeCtorInfo_73_73, TypeCtorInfo_73_73, V_28_28, Ss0_16);
            }
//  gate2bel.m:428
            if ((Ss_19.data_tag == 0))
//  gate2bel.m:427
              {
                HeadVar__3_3 = (gate2bel.Value2_0) gate2bel.MR_scalar_common_23[0];
                STATE_VARIABLE_Es_5 = STATE_VARIABLE_Es_0_4;
              }
//  gate2bel.m:428
            else
              {
                list.List_1 V_83_83 = ((list.List_1.F_cons_2) Ss_19).F2;
                java.lang.String V_84_84 = ((java.lang.String) ((list.List_1.F_cons_2) Ss_19).F1);

                if ((V_83_83.data_tag == 0))
                  {
                    gate2bel.Str2_0 Str_21 = null;
                    jmercury.runtime.MethodPtr func_12 = ((jmercury.runtime.MethodPtr) ((java.lang.Object[]) Pred_1)[1]);
                    java.lang.Object conv14_Str_21 = null;
                    java.lang.Object conv13_STATE_VARIABLE_Es_5 = null;

                    {
                      java.lang.Object [] result = ((java.lang.Object[]) ((jmercury.runtime.MethodPtr3) func_12).call___0_0(((java.lang.Object) (((/* generic_type */ java.lang.Object) Pred_1))), ((java.lang.Object) (((java.lang.Object) (V_84_84)))), ((java.lang.Object) (((java.lang.Object) (STATE_VARIABLE_Es_0_4))))));
                      conv14_Str_21 = (java.lang.Object) result[0];
                      conv13_STATE_VARIABLE_Es_5 = (java.lang.Object) result[1];
                    }
                    Str_21 = ((gate2bel.Str2_0) conv14_Str_21);
                    STATE_VARIABLE_Es_5 = ((list.List_1) conv13_STATE_VARIABLE_Es_5);
                    {
                      HeadVar__3_3 = new gate2bel.Value2_0.Str_1(Str_21);
                    }
                  }
                else
//  gate2bel.m:429
                  {
                    jmercury.runtime.TypeInfo_Struct TypeCtorInfo_74_74 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_str2_0);
                    jmercury.runtime.TypeInfo_Struct TypeInfo_75_75 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[0]);
                    list.List_1 Strs_25 = null;
                    java.lang.Object conv15_STATE_VARIABLE_Es_5 = null;

                    {
                      java.lang.Object [] result = list.map_foldl_5_p_0(TypeCtorInfo_73_73, TypeCtorInfo_74_74, TypeInfo_75_75, Pred_1, Ss_19, ((java.lang.Object) (STATE_VARIABLE_Es_0_4)));
                      Strs_25 = (list.List_1) result[0];
                      conv15_STATE_VARIABLE_Es_5 = (java.lang.Object) result[1];
                    }
                    STATE_VARIABLE_Es_5 = ((list.List_1) conv15_STATE_VARIABLE_Es_5);
                    {
                      HeadVar__3_3 = new gate2bel.Value2_0.Strs_1(Strs_25);
                    }
                  }
//  gate2bel.m:428
              }
//  gate2bel.m:425
          }
//  gate2bel.m:422
          break;
        case 3:
//  gate2bel.m:430
          {
            pair.Pair_2 Ps_34 = ((gate2bel.Value_0.Coref_1) HeadVar__2_2).F1;

            {
              HeadVar__3_3 = new gate2bel.Value2_0.Coref_1(Ps_34);
            }
            STATE_VARIABLE_Es_5 = STATE_VARIABLE_Es_0_4;
          }
//  gate2bel.m:422
          break;
        case 4:
//  gate2bel.m:431
          {
            java.lang.String S0_39 = ((gate2bel.Value_0.Coref_2) HeadVar__2_2).F1;
            pair.Pair_2 Ps_40 = ((gate2bel.Value_0.Coref_2) HeadVar__2_2).F2;
//  gate2bel.m:433
            java.lang.String S_43 = null;

//  gate2bel.m:432
            {
              java.lang.Object [] result = gate2bel.conv_str_2_p_0(S0_39);
              succeeded = ((java.lang.Boolean) result[0]).booleanValue();
              S_43 = (java.lang.String) result[1];
            }
//  gate2bel.m:433
            if (succeeded)
//  gate2bel.m:432
              {
                gate2bel.Str2_0 Str_44 = null;
                jmercury.runtime.MethodPtr func_0 = ((jmercury.runtime.MethodPtr) ((java.lang.Object[]) Pred_1)[1]);
                java.lang.Object conv2_Str_44 = null;
                java.lang.Object conv1_STATE_VARIABLE_Es_5 = null;

                {
                  java.lang.Object [] result = ((java.lang.Object[]) ((jmercury.runtime.MethodPtr3) func_0).call___0_0(((java.lang.Object) (((/* generic_type */ java.lang.Object) Pred_1))), ((java.lang.Object) (((java.lang.Object) (S_43)))), ((java.lang.Object) (((java.lang.Object) (STATE_VARIABLE_Es_0_4))))));
                  conv2_Str_44 = (java.lang.Object) result[0];
                  conv1_STATE_VARIABLE_Es_5 = (java.lang.Object) result[1];
                }
                Str_44 = ((gate2bel.Str2_0) conv2_Str_44);
                STATE_VARIABLE_Es_5 = ((list.List_1) conv1_STATE_VARIABLE_Es_5);
                {
                  HeadVar__3_3 = new gate2bel.Value2_0.Coref_2(Str_44, Ps_40);
                }
              }
//  gate2bel.m:433
            else
              {
                {
                  HeadVar__3_3 = new gate2bel.Value2_0.Coref_1(Ps_40);
                }
                STATE_VARIABLE_Es_5 = STATE_VARIABLE_Es_0_4;
              }
//  gate2bel.m:431
          }
//  gate2bel.m:422
          break;
        case 5:
//  gate2bel.m:434
          {
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_78_78 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
            list.List_1 Ss0_49 = ((gate2bel.Value_0.Corefs_2) HeadVar__2_2).F1;
            pair.Pair_2 Ps_50 = ((gate2bel.Value_0.Corefs_2) HeadVar__2_2).F2;
            list.List_1 Ss_53 = null;
            /* closure */ java.lang.Object[] V_62_62 = (/* closure */ java.lang.Object[]) gate2bel.MR_scalar_common_6[4];

//  gate2bel.m:435
            {
              Ss_53 = list.filter_map_3_p_0(TypeCtorInfo_78_78, TypeCtorInfo_78_78, V_62_62, Ss0_49);
            }
//  gate2bel.m:437
            if ((Ss_53.data_tag == 0))
//  gate2bel.m:436
              {
                {
                  HeadVar__3_3 = new gate2bel.Value2_0.Coref_1(Ps_50);
                }
                STATE_VARIABLE_Es_5 = STATE_VARIABLE_Es_0_4;
              }
//  gate2bel.m:437
            else
              {
                list.List_1 V_81_81 = ((list.List_1.F_cons_2) Ss_53).F2;
                java.lang.String V_82_82 = ((java.lang.String) ((list.List_1.F_cons_2) Ss_53).F1);

                if ((V_81_81.data_tag == 0))
                  {
                    gate2bel.Str2_0 Str_55 = null;
                    jmercury.runtime.MethodPtr func_4 = ((jmercury.runtime.MethodPtr) ((java.lang.Object[]) Pred_1)[1]);
                    java.lang.Object conv6_Str_55 = null;
                    java.lang.Object conv5_STATE_VARIABLE_Es_5 = null;

                    {
                      java.lang.Object [] result = ((java.lang.Object[]) ((jmercury.runtime.MethodPtr3) func_4).call___0_0(((java.lang.Object) (((/* generic_type */ java.lang.Object) Pred_1))), ((java.lang.Object) (((java.lang.Object) (V_82_82)))), ((java.lang.Object) (((java.lang.Object) (STATE_VARIABLE_Es_0_4))))));
                      conv6_Str_55 = (java.lang.Object) result[0];
                      conv5_STATE_VARIABLE_Es_5 = (java.lang.Object) result[1];
                    }
                    Str_55 = ((gate2bel.Str2_0) conv6_Str_55);
                    STATE_VARIABLE_Es_5 = ((list.List_1) conv5_STATE_VARIABLE_Es_5);
                    {
                      HeadVar__3_3 = new gate2bel.Value2_0.Coref_2(Str_55, Ps_50);
                    }
                  }
                else
//  gate2bel.m:438
                  {
                    jmercury.runtime.TypeInfo_Struct TypeCtorInfo_79_79 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_str2_0);
                    jmercury.runtime.TypeInfo_Struct TypeInfo_80_80 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[0]);
                    list.List_1 Strs_59 = null;
                    java.lang.Object conv7_STATE_VARIABLE_Es_5 = null;

                    {
                      java.lang.Object [] result = list.map_foldl_5_p_0(TypeCtorInfo_78_78, TypeCtorInfo_79_79, TypeInfo_80_80, Pred_1, Ss_53, ((java.lang.Object) (STATE_VARIABLE_Es_0_4)));
                      Strs_59 = (list.List_1) result[0];
                      conv7_STATE_VARIABLE_Es_5 = (java.lang.Object) result[1];
                    }
                    STATE_VARIABLE_Es_5 = ((list.List_1) conv7_STATE_VARIABLE_Es_5);
                    {
                      HeadVar__3_3 = new gate2bel.Value2_0.Corefs_2(Strs_59, Ps_50);
                    }
                  }
//  gate2bel.m:437
              }
//  gate2bel.m:434
          }
//  gate2bel.m:422
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
return new java.lang.Object[] {
        ((java.lang.Object) (HeadVar__3_3)),
        ((java.lang.Object) (STATE_VARIABLE_Es_5))
      };
    }
//  gate2bel.m:421
  }
//  gate2bel.m:413
  private static beliefs.Bstrtp_0 conv_strtp_2_p_0(
    gate2bel.Owlstrtp_0 HeadVar__1_1)
  {
//  gate2bel.m:414
    {
      boolean succeeded = false;
      beliefs.Bstrtp_0 HeadVar__2_2 = null;

      switch (HeadVar__1_1.data_tag) {
        case 0:
          HeadVar__2_2 = (beliefs.Bstrtp_0) gate2bel.MR_scalar_common_14[0];
          break;
        case 1:
//  gate2bel.m:416
          HeadVar__2_2 = (beliefs.Bstrtp_0) gate2bel.MR_scalar_common_21[0];
//  gate2bel.m:414
          break;
        case 2:
//  gate2bel.m:417
          HeadVar__2_2 = (beliefs.Bstrtp_0) gate2bel.MR_scalar_common_13[0];
//  gate2bel.m:414
          break;
        case 3:
//  gate2bel.m:415
          {
            wordnet.Prontp_0 P_3 = ((gate2bel.Owlstrtp_0.Pronoun_1) HeadVar__1_1).F1;

            {
              HeadVar__2_2 = new beliefs.Bstrtp_0.Pronoun_1(P_3);
            }
          }
//  gate2bel.m:414
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
      return HeadVar__2_2;
    }
//  gate2bel.m:413
  }
//  gate2bel.m:405
  private static beliefs.Belstr_0 conv_str5_4_p_0(
    tree234.Tree234_2 Map_1,
    java.lang.String Nm_2,
    gate2bel.Owlstr_0 HeadVar__3_3)
  {
//  gate2bel.m:406
    {
      boolean succeeded = false;
      beliefs.Belstr_0 HeadVar__4_4 = null;

      if ((HeadVar__3_3.data_tag == 1))
//  gate2bel.m:408
        {
          java.lang.String Str0_12 = ((gate2bel.Owlstr_0.Cref_3) HeadVar__3_3).F1;
          gate2bel.Owlstrtp_0 Tp0_13 = ((gate2bel.Owlstr_0.Cref_3) HeadVar__3_3).F2;
          int C_14 = ((gate2bel.Owlstr_0.Cref_3) HeadVar__3_3).F3;
//  gate2bel.m:411
          java.lang.String X_16 = null;
//  gate2bel.m:409
          jmercury.runtime.TypeInfo_Struct TypeInfo_20_20 = null;
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_21_21 = null;
          pair.Pair_2 V_18_18 = null;
          java.lang.Object conv0_X_16 = null;

          {
            V_18_18 = new pair.Pair_2(((java.lang.Object) (Nm_2)), java.lang.Integer.valueOf(C_14));
          }
          TypeInfo_20_20 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[16]);
          TypeCtorInfo_21_21 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
          {
            java.lang.Object [] result = map.search_3_p_0(TypeInfo_20_20, TypeCtorInfo_21_21, Map_1, ((java.lang.Object) (V_18_18)));
            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
            conv0_X_16 = (java.lang.Object) result[1];
          }
          if (succeeded)
            {
              X_16 = ((java.lang.String) conv0_X_16);
              succeeded = true;
            }
//  gate2bel.m:411
          if (succeeded)
//  gate2bel.m:410
            {
              beliefs.Bstrtp_0 V_19_19 = (beliefs.Bstrtp_0) gate2bel.MR_scalar_common_20[0];

              {
                HeadVar__4_4 = new beliefs.Belstr_0(X_16, V_19_19);
              }
            }
//  gate2bel.m:411
          else
            {
              beliefs.Bstrtp_0 Tp_17 = null;

              {
                Tp_17 = gate2bel.conv_strtp_2_p_0(Tp0_13);
              }
              {
                HeadVar__4_4 = new beliefs.Belstr_0(Str0_12, Tp_17);
              }
            }
//  gate2bel.m:408
        }
//  gate2bel.m:406
      else
        {
          java.lang.String Str_7 = ((gate2bel.Owlstr_0.Str_2) HeadVar__3_3).F1;
          gate2bel.Owlstrtp_0 Tp0_8 = ((gate2bel.Owlstr_0.Str_2) HeadVar__3_3).F2;
          beliefs.Bstrtp_0 Tp_9 = null;

//  gate2bel.m:407
          {
            Tp_9 = gate2bel.conv_strtp_2_p_0(Tp0_8);
          }
//  gate2bel.m:406
          {
            HeadVar__4_4 = new beliefs.Belstr_0(Str_7, Tp_9);
          }
        }
      return HeadVar__4_4;
    }
//  gate2bel.m:405
  }
//  gate2bel.m:392
  private static java.lang.Object tps_4_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      gate2bel.Vertices_0 conv0_STATE_VARIABLE_Vs_25 = null;

      {
        conv0_STATE_VARIABLE_Vs_25 = gate2bel.tps_4_p_0(((tree234.Tree234_2) ((java.lang.Object[]) closure)[3]), ((java.lang.Integer) wrapper_arg_1).intValue(), ((gate2bel.Vertices_0) wrapper_arg_2));
      }
      wrapper_arg_3 = ((java.lang.Object) (conv0_STATE_VARIABLE_Vs_25));
      return wrapper_arg_3;
    }
  }
//  gate2bel.m:380
  private static gate2bel.Vertices_0 tps_4_p_0(
    tree234.Tree234_2 LM_5,
    int N0_6,
    gate2bel.Vertices_0 STATE_VARIABLE_Vs_0_24)
  {
//  gate2bel.m:382
    {
      boolean succeeded = false;
      gate2bel.Vertices_0 STATE_VARIABLE_Vs_25 = null;
      set_ordlist.Set_ordlist_1 Ws0_8 = ((gate2bel.Vertices_0) STATE_VARIABLE_Vs_0_24).F1;
      set_ordlist.Set_ordlist_1 Gs0_9 = ((gate2bel.Vertices_0) STATE_VARIABLE_Vs_0_24).F2;
      list.List_1 Bs0_10 = ((gate2bel.Vertices_0) STATE_VARIABLE_Vs_0_24).F3;
      list.List_1 Fs0_11 = ((gate2bel.Vertices_0) STATE_VARIABLE_Vs_0_24).F4;
      gate2bel.Vertices_0 STATE_VARIABLE_Vs_26_26 = null;
//  gate2bel.m:387
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_39_39 = null;

//  gate2bel.m:384
      succeeded = (Bs0_10.data_tag == 0);
//  gate2bel.m:386
      if (succeeded)
//  gate2bel.m:385
        STATE_VARIABLE_Vs_26_26 = STATE_VARIABLE_Vs_0_24;
//  gate2bel.m:386
      else
        {
          list.List_1 V_28_28 = (list.List_1) gate2bel.MR_scalar_common_3[0];
          list.List_1 V_29_29 = null;

          {
            V_29_29 = new list.List_1.F_cons_2(((java.lang.Object) (Bs0_10)), Fs0_11);
          }
          {
            STATE_VARIABLE_Vs_26_26 = new gate2bel.Vertices_0(Ws0_8, Gs0_9, V_28_28, V_29_29);
          }
        }
      TypeCtorInfo_39_39 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
//  gate2bel.m:387
      {
        succeeded = set.member_2_p_0(TypeCtorInfo_39_39, java.lang.Integer.valueOf(N0_6), Ws0_8);
      }
//  gate2bel.m:395
      if (succeeded)
//  gate2bel.m:388
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_40_40 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
          set_ordlist.Set_ordlist_1 Ws1_12 = ((gate2bel.Vertices_0) STATE_VARIABLE_Vs_26_26).F1;
          set_ordlist.Set_ordlist_1 Gs1_13 = ((gate2bel.Vertices_0) STATE_VARIABLE_Vs_26_26).F2;
          list.List_1 Bs1_14 = ((gate2bel.Vertices_0) STATE_VARIABLE_Vs_26_26).F3;
          list.List_1 Fs1_15 = ((gate2bel.Vertices_0) STATE_VARIABLE_Vs_26_26).F4;
          set_ordlist.Set_ordlist_1 Ws2_16 = null;
          set_ordlist.Set_ordlist_1 Gs2_17 = null;
          set_ordlist.Set_ordlist_1 Ws3_20 = null;
          set_ordlist.Set_ordlist_1 Gs3_21 = null;
          list.List_1 Bs3_22 = null;
          list.List_1 Fs3_23 = null;
          gate2bel.Vertices_0 STATE_VARIABLE_Vs_30_30 = null;
          gate2bel.Vertices_0 STATE_VARIABLE_Vs_35_35 = null;
          set_ordlist.Set_ordlist_1 V_37_37 = null;
          list.List_1 V_38_38 = null;
//  gate2bel.m:393
          list.List_1 Xs_18 = null;
//  gate2bel.m:390
          jmercury.runtime.TypeInfo_Struct TypeInfo_41_41 = null;

//  gate2bel.m:388
          {
            Ws2_16 = set.delete_3_p_0(TypeCtorInfo_40_40, java.lang.Integer.valueOf(N0_6), Ws1_12);
          }
//  gate2bel.m:389
          {
            Gs2_17 = set.insert_3_p_0(TypeCtorInfo_40_40, java.lang.Integer.valueOf(N0_6), Gs1_13);
          }
          {
            STATE_VARIABLE_Vs_30_30 = new gate2bel.Vertices_0(Ws2_16, Gs2_17, Bs1_14, Fs1_15);
          }
          TypeInfo_41_41 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[2]);
//  gate2bel.m:390
          {
            java.lang.Object [] result = multi_map.search_3_p_0(TypeCtorInfo_40_40, TypeInfo_41_41, LM_5, java.lang.Integer.valueOf(N0_6));
            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
            Xs_18 = (list.List_1) result[1];
          }
//  gate2bel.m:393
          if (succeeded)
//  gate2bel.m:391
            {
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_42_42 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_lndata_0);
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_46_46 = null;
              set_ordlist.Set_ordlist_1 Ns_19 = null;
              set_ordlist.Set_ordlist_1 V_31_31 = null;
              list.List_1 V_32_32 = null;
              /* closure */ java.lang.Object[] V_33_33 = null;
              list.List_1 V_34_34 = null;
//  gate2bel.m:392
              java.lang.Object conv1_STATE_VARIABLE_Vs_35_35 = null;

//  gate2bel.m:391
              {
                V_32_32 = assoc_list.values_1_f_0(TypeCtorInfo_42_42, TypeCtorInfo_40_40, Xs_18);
              }
              {
                V_31_31 = set.set_1_f_0(TypeCtorInfo_40_40, V_32_32);
              }
              {
                Ns_19 = set.intersect_3_p_0(TypeCtorInfo_40_40, Ws1_12, V_31_31);
              }
//  gate2bel.m:392
              {
                V_33_33 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_9[1])), ((java.lang.Object) (new AddrOf3_0(2))), java.lang.Integer.valueOf(1), ((java.lang.Object) (LM_5))};
              }
              {
                V_34_34 = set.to_sorted_list_1_f_0(TypeCtorInfo_40_40, Ns_19);
              }
              TypeCtorInfo_46_46 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_vertices_0);
              {
                conv1_STATE_VARIABLE_Vs_35_35 = list.foldl_4_p_0(TypeCtorInfo_40_40, TypeCtorInfo_46_46, V_33_33, V_34_34, ((java.lang.Object) (STATE_VARIABLE_Vs_30_30)));
              }
              STATE_VARIABLE_Vs_35_35 = ((gate2bel.Vertices_0) conv1_STATE_VARIABLE_Vs_35_35);
//  gate2bel.m:391
            }
//  gate2bel.m:393
          else
//  gate2bel.m:392
            STATE_VARIABLE_Vs_35_35 = STATE_VARIABLE_Vs_30_30;
//  gate2bel.m:394
          Ws3_20 = ((gate2bel.Vertices_0) STATE_VARIABLE_Vs_35_35).F1;
          Gs3_21 = ((gate2bel.Vertices_0) STATE_VARIABLE_Vs_35_35).F2;
          Bs3_22 = ((gate2bel.Vertices_0) STATE_VARIABLE_Vs_35_35).F3;
          Fs3_23 = ((gate2bel.Vertices_0) STATE_VARIABLE_Vs_35_35).F4;
          {
            V_37_37 = set.delete_2_f_0(TypeCtorInfo_40_40, Gs3_21, java.lang.Integer.valueOf(N0_6));
          }
          {
            V_38_38 = new list.List_1.F_cons_2(java.lang.Integer.valueOf(N0_6), Bs3_22);
          }
          {
            STATE_VARIABLE_Vs_25 = new gate2bel.Vertices_0(Ws3_20, V_37_37, V_38_38, Fs3_23);
          }
//  gate2bel.m:388
        }
//  gate2bel.m:395
      else
//  gate2bel.m:394
        STATE_VARIABLE_Vs_25 = STATE_VARIABLE_Vs_26_26;
//  gate2bel.m:382
      return STATE_VARIABLE_Vs_25;
    }
//  gate2bel.m:380
  }
//  gate2bel.m:366
  private static java.lang.Object [] conv_emb_12_p_0(
    java.lang.String Nm_13,
    tree234.Tree234_2 CM_14,
    tree234.Tree234_2 LM_15,
    list.List_1 Ds_16,
    set_ordlist.Set_ordlist_1 Xs0_17,
    pair.Pair_2 HeadVar__6_6,
    list.List_1 STATE_VARIABLE_Is_0_24,
    list.List_1 STATE_VARIABLE_Stmnts_0_26,
    list.List_1 STATE_VARIABLE_Es_0_28)
  {
//  gate2bel.m:368
    {
      boolean succeeded = false;
      list.List_1 STATE_VARIABLE_Is_25 = null;
      list.List_1 STATE_VARIABLE_Stmnts_27 = null;
      list.List_1 STATE_VARIABLE_Es_29 = null;
      gate2bel.Lndata_0 Data_18 = ((gate2bel.Lndata_0) ((pair.Pair_2) HeadVar__6_6).F1);
      int I_19 = ((java.lang.Integer) (((pair.Pair_2) HeadVar__6_6).F2)).intValue();
//  gate2bel.m:369
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_37_37 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);

      {
        succeeded = set.contains_2_p_0(TypeCtorInfo_37_37, Xs0_17, java.lang.Integer.valueOf(I_19));
      }
//  gate2bel.m:371
      if (succeeded)
//  gate2bel.m:370
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_38_38 = null;
          errors.Err_loc_0 V_30_30 = null;
          sberrs.Error_0 V_31_31 = null;

          {
            V_30_30 = new errors.Err_loc_0.File_1(Nm_13);
          }
          {
            V_31_31 = new sberrs.Error_0.Triple_cycle_1(I_19);
          }
          TypeCtorInfo_38_38 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
          {
            STATE_VARIABLE_Es_29 = errors.add_error_4_p_0(TypeCtorInfo_38_38, V_30_30, ((java.lang.Object) (V_31_31)), STATE_VARIABLE_Es_0_28);
          }
          STATE_VARIABLE_Stmnts_27 = STATE_VARIABLE_Stmnts_0_26;
          STATE_VARIABLE_Is_25 = STATE_VARIABLE_Is_0_24;
        }
//  gate2bel.m:371
      else
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_39_39 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
          set_ordlist.Set_ordlist_1 Xs1_23 = null;
          list.List_1 V_33_33 = null;

          {
            Xs1_23 = set.insert_3_p_0(TypeCtorInfo_39_39, java.lang.Integer.valueOf(I_19), Xs0_17);
          }
//  gate2bel.m:372
          {
            V_33_33 = new list.List_1.F_cons_2(((java.lang.Object) (Data_18)), Ds_16);
          }
          {
            java.lang.Object [] result = gate2bel.conv_embedded_12_p_0(Nm_13, I_19, V_33_33, Xs1_23, STATE_VARIABLE_Is_0_24, CM_14, LM_15, STATE_VARIABLE_Stmnts_0_26, STATE_VARIABLE_Es_0_28);
            STATE_VARIABLE_Is_25 = (list.List_1) result[0];
            STATE_VARIABLE_Stmnts_27 = (list.List_1) result[1];
            STATE_VARIABLE_Es_29 = (list.List_1) result[2];
          }
//  gate2bel.m:371
        }
//  gate2bel.m:368
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_Is_25)),
        ((java.lang.Object) (STATE_VARIABLE_Stmnts_27)),
        ((java.lang.Object) (STATE_VARIABLE_Es_29))
      };
    }
//  gate2bel.m:366
  }
//  gate2bel.m:358
  private static java.lang.Object [] conv_embedded_12_p_0_1(
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
      list.List_1 conv2_STATE_VARIABLE_Is_25 = null;
      list.List_1 conv1_STATE_VARIABLE_Stmnts_27 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_29 = null;

      {
        java.lang.Object [] result = gate2bel.conv_emb_12_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((tree234.Tree234_2) ((java.lang.Object[]) closure)[4]), ((tree234.Tree234_2) ((java.lang.Object[]) closure)[5]), ((list.List_1) ((java.lang.Object[]) closure)[6]), ((set_ordlist.Set_ordlist_1) ((java.lang.Object[]) closure)[7]), ((pair.Pair_2) wrapper_arg_1), ((list.List_1) wrapper_arg_2), ((list.List_1) wrapper_arg_4), ((list.List_1) wrapper_arg_6));
        conv2_STATE_VARIABLE_Is_25 = (list.List_1) result[0];
        conv1_STATE_VARIABLE_Stmnts_27 = (list.List_1) result[1];
        conv0_STATE_VARIABLE_Es_29 = (list.List_1) result[2];
      }
      wrapper_arg_3 = ((java.lang.Object) (conv2_STATE_VARIABLE_Is_25));
      wrapper_arg_5 = ((java.lang.Object) (conv1_STATE_VARIABLE_Stmnts_27));
      wrapper_arg_7 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_29));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_3)),
        ((java.lang.Object) (wrapper_arg_5)),
        ((java.lang.Object) (wrapper_arg_7))
      };
    }
  }
//  gate2bel.m:353
  private static java.lang.Object [] conv_embedded_12_p_0(
    java.lang.String Nm_13,
    int I_14,
    list.List_1 Ds_15,
    set_ordlist.Set_ordlist_1 Xs_16,
    list.List_1 STATE_VARIABLE_Is_0_25,
    tree234.Tree234_2 CM_18,
    tree234.Tree234_2 LM_19,
    list.List_1 STATE_VARIABLE_Stmnts_0_27,
    list.List_1 STATE_VARIABLE_Es_0_29)
  {
//  gate2bel.m:359
    {
      boolean succeeded = false;
      list.List_1 STATE_VARIABLE_Is_26 = null;
      list.List_1 STATE_VARIABLE_Stmnts_28 = null;
      list.List_1 STATE_VARIABLE_Es_30 = null;
      list.List_1 Ps_22 = null;
//  gate2bel.m:356
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_39_39 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
      jmercury.runtime.TypeInfo_Struct TypeInfo_40_40 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[2]);

      {
        java.lang.Object [] result = multi_map.search_3_p_0(TypeCtorInfo_39_39, TypeInfo_40_40, LM_19, java.lang.Integer.valueOf(I_14));
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        Ps_22 = (list.List_1) result[1];
      }
//  gate2bel.m:359
      if (succeeded)
//  gate2bel.m:357
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_41_41 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
          jmercury.runtime.TypeInfo_Struct TypeInfo_49_49 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_50_50 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_51_51 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_52_52 = null;
          list.List_1 STATE_VARIABLE_Is_31_31 = null;
          /* closure */ java.lang.Object[] V_32_32 = null;
//  gate2bel.m:358
          java.lang.Object conv5_STATE_VARIABLE_Is_26 = null;
          java.lang.Object conv4_STATE_VARIABLE_Stmnts_28 = null;
          java.lang.Object conv3_STATE_VARIABLE_Es_30 = null;

//  gate2bel.m:357
          {
            STATE_VARIABLE_Is_31_31 = list.delete_all_3_p_1(TypeCtorInfo_41_41, STATE_VARIABLE_Is_0_25, java.lang.Integer.valueOf(I_14));
          }
//  gate2bel.m:358
          {
            V_32_32 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_19[0])), ((java.lang.Object) (new AddrOf5_0(0))), java.lang.Integer.valueOf(5), ((java.lang.Object) (Nm_13)), ((java.lang.Object) (CM_18)), ((java.lang.Object) (LM_19)), ((java.lang.Object) (Ds_15)), ((java.lang.Object) (Xs_16))};
          }
          TypeInfo_49_49 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[2]);
          TypeInfo_50_50 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[15]);
          TypeInfo_51_51 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[6]);
          TypeInfo_52_52 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[0]);
          {
            java.lang.Object [] result = list.foldl3_8_p_0(TypeInfo_49_49, TypeInfo_50_50, TypeInfo_51_51, TypeInfo_52_52, V_32_32, Ps_22, ((java.lang.Object) (STATE_VARIABLE_Is_31_31)), ((java.lang.Object) (STATE_VARIABLE_Stmnts_0_27)), ((java.lang.Object) (STATE_VARIABLE_Es_0_29)));
            conv5_STATE_VARIABLE_Is_26 = (java.lang.Object) result[0];
            conv4_STATE_VARIABLE_Stmnts_28 = (java.lang.Object) result[1];
            conv3_STATE_VARIABLE_Es_30 = (java.lang.Object) result[2];
          }
          STATE_VARIABLE_Is_26 = ((list.List_1) conv5_STATE_VARIABLE_Is_26);
          STATE_VARIABLE_Stmnts_28 = ((list.List_1) conv4_STATE_VARIABLE_Stmnts_28);
          STATE_VARIABLE_Es_30 = ((list.List_1) conv3_STATE_VARIABLE_Es_30);
//  gate2bel.m:357
        }
//  gate2bel.m:359
      else
//  gate2bel.m:362
        {
          list.List_1 Ts_23 = null;
//  gate2bel.m:359
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_53_53 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_54_54 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_owltriple_0);

          {
            java.lang.Object [] result = multi_map.search_3_p_0(TypeCtorInfo_53_53, TypeCtorInfo_54_54, CM_18, java.lang.Integer.valueOf(I_14));
            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
            Ts_23 = (list.List_1) result[1];
          }
          if (succeeded)
            {
              succeeded = (Ds_15.data_tag == 0);
              succeeded = !(succeeded);
            }
//  gate2bel.m:362
          if (succeeded)
//  gate2bel.m:360
            {
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_55_55 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
              gate2bel.Owlstmnt_0 St_24 = null;

              {
                STATE_VARIABLE_Is_26 = list.delete_all_3_p_1(TypeCtorInfo_55_55, STATE_VARIABLE_Is_0_25, java.lang.Integer.valueOf(I_14));
              }
//  gate2bel.m:596
              succeeded = (Ds_15.data_tag == 0);
//  gate2bel.m:598
              if (succeeded)
//  gate2bel.m:597
                {
                  java.lang.String V_63_63 = "owlstmnt/6";

                  {
                    require.error_1_p_0(V_63_63);
                  }
                }
//  gate2bel.m:598
              else
                {
                  St_24 = new gate2bel.Owlstmnt_0.Embedded_2(Ds_15, Ts_23);
                }
              STATE_VARIABLE_Es_30 = STATE_VARIABLE_Es_0_29;
//  gate2bel.m:361
              {
                STATE_VARIABLE_Stmnts_28 = new list.List_1.F_cons_2(((java.lang.Object) (St_24)), STATE_VARIABLE_Stmnts_0_27);
              }
//  gate2bel.m:360
            }
//  gate2bel.m:362
          else
            {
              STATE_VARIABLE_Es_30 = STATE_VARIABLE_Es_0_29;
              STATE_VARIABLE_Stmnts_28 = STATE_VARIABLE_Stmnts_0_27;
              STATE_VARIABLE_Is_26 = STATE_VARIABLE_Is_0_25;
            }
        }
//  gate2bel.m:359
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_Is_26)),
        ((java.lang.Object) (STATE_VARIABLE_Stmnts_28)),
        ((java.lang.Object) (STATE_VARIABLE_Es_30))
      };
    }
//  gate2bel.m:353
  }
//  gate2bel.m:345
  private static java.lang.Object [] conv_embedded_8_p_0(
    java.lang.String Nm_1,
    list.List_1 HeadVar__2_2,
    tree234.Tree234_2 CM_3,
    tree234.Tree234_2 LM_4,
    list.List_1 STATE_VARIABLE_Stmnts_0_5,
    list.List_1 STATE_VARIABLE_Es_0_7)
  {
//  gate2bel.m:346
    while (true)
      {
        /* tailcall optimized into a loop */
        {
          boolean succeeded = false;
          list.List_1 STATE_VARIABLE_Stmnts_6 = null;
          list.List_1 STATE_VARIABLE_Es_8 = null;

          if ((HeadVar__2_2.data_tag == 0))
//  gate2bel.m:349
            {
              STATE_VARIABLE_Es_8 = STATE_VARIABLE_Es_0_7;
              STATE_VARIABLE_Stmnts_6 = STATE_VARIABLE_Stmnts_0_5;
            }
//  gate2bel.m:346
          else
            {
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_36_36 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
              int I_10 = ((java.lang.Integer) (((list.List_1.F_cons_2) HeadVar__2_2).F1)).intValue();
              list.List_1 Is0_11 = ((list.List_1.F_cons_2) HeadVar__2_2).F2;
              list.List_1 Is_16 = null;
              list.List_1 V_21_21 = (list.List_1) gate2bel.MR_scalar_common_3[0];
              set_ordlist.Set_ordlist_1 V_22_22 = null;
              list.List_1 STATE_VARIABLE_Stmnts_23_23 = null;
              list.List_1 STATE_VARIABLE_Es_24_24 = null;

//  gate2bel.m:347
              {
                V_22_22 = set.init_0_f_0(TypeCtorInfo_36_36);
              }
              {
                java.lang.Object [] result = gate2bel.conv_embedded_12_p_0(Nm_1, I_10, V_21_21, V_22_22, Is0_11, CM_3, LM_4, STATE_VARIABLE_Stmnts_0_5, STATE_VARIABLE_Es_0_7);
                Is_16 = (list.List_1) result[0];
                STATE_VARIABLE_Stmnts_23_23 = (list.List_1) result[1];
                STATE_VARIABLE_Es_24_24 = (list.List_1) result[2];
              }
//  gate2bel.m:348
              /* direct tailcall eliminated */
              {
                list.List_1 HeadVar__2__tmp_copy_2 = Is_16;
                list.List_1 STATE_VARIABLE_Stmnts_0__tmp_copy_5 = STATE_VARIABLE_Stmnts_23_23;
                list.List_1 STATE_VARIABLE_Es_0__tmp_copy_7 = STATE_VARIABLE_Es_24_24;

                STATE_VARIABLE_Es_0_7 = STATE_VARIABLE_Es_0__tmp_copy_7;
                STATE_VARIABLE_Stmnts_0_5 = STATE_VARIABLE_Stmnts_0__tmp_copy_5;
                HeadVar__2_2 = HeadVar__2__tmp_copy_2;
              }
              continue;
//  gate2bel.m:346
            }
return new java.lang.Object[] {
            ((java.lang.Object) (STATE_VARIABLE_Stmnts_6)),
            ((java.lang.Object) (STATE_VARIABLE_Es_8))
          };
        }
      }
//  gate2bel.m:345
  }
//  gate2bel.m:336
  private static class Envpath_4_p_0_env_0
    extends /* env_ptr */ java.lang.Object
  {
    public java.lang.String Spk_1;
    public set_ordlist.Set_ordlist_1 Ags_2;
    public jmercury.runtime.MethodPtr cont;
    public /* env_ptr */ java.lang.Object cont_env_ptr;
//  gate2bel.m:338
    public list.List_1 HeadVar__4_4;
    public bool.Bool_0 Ng_8;
    public list.List_1 Ts_10;
    public java.lang.String Ag_11;
    public list.List_1 Es_12;
    public beliefs.Envmod_0 V_14_14;

  }

//  gate2bel.m:339
  private static void envpath_4_p_0_2(
    java.lang.String arg1,
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.Envpath_4_p_0_env_0 env_ptr = (gate2bel.Envpath_4_p_0_env_0) env_ptr_arg;

      ((gate2bel.Envpath_4_p_0_env_0) env_ptr).Ag_11 = arg1;
      {
        gate2bel.envpath_4_p_0_1(env_ptr);
      }
    }
  }
//  gate2bel.m:340
  private static void envpath_4_p_0_4(
    list.List_1 arg1,
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.Envpath_4_p_0_env_0 env_ptr = (gate2bel.Envpath_4_p_0_env_0) env_ptr_arg;

      ((gate2bel.Envpath_4_p_0_env_0) env_ptr).Es_12 = arg1;
      {
        gate2bel.envpath_4_p_0_3(env_ptr);
      }
    }
  }
//  gate2bel.m:338
  private static void envpath_4_p_0_3(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.Envpath_4_p_0_env_0 env_ptr = (gate2bel.Envpath_4_p_0_env_0) env_ptr_arg;

      {
        ((gate2bel.Envpath_4_p_0_env_0) env_ptr).HeadVar__4_4 = new list.List_1.F_cons_2(((java.lang.Object) (((gate2bel.Envpath_4_p_0_env_0) env_ptr).V_14_14)), ((gate2bel.Envpath_4_p_0_env_0) env_ptr).Es_12);
      }
      {
        ((jmercury.runtime.MethodPtr2) (((gate2bel.Envpath_4_p_0_env_0) env_ptr).cont)).call___0_0(((java.lang.Object) (((gate2bel.Envpath_4_p_0_env_0) env_ptr).HeadVar__4_4)), ((java.lang.Object) (((gate2bel.Envpath_4_p_0_env_0) env_ptr).cont_env_ptr)));
      }
    }
  }
  private static void envpath_4_p_0_1(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.Envpath_4_p_0_env_0 env_ptr = (gate2bel.Envpath_4_p_0_env_0) env_ptr_arg;

      {
        ((gate2bel.Envpath_4_p_0_env_0) env_ptr).V_14_14 = new beliefs.Envmod_0(((gate2bel.Envpath_4_p_0_env_0) env_ptr).Ag_11, ((gate2bel.Envpath_4_p_0_env_0) env_ptr).Ng_8, null);
      }
//  gate2bel.m:340
      {
        gate2bel.envpath_4_p_0(((gate2bel.Envpath_4_p_0_env_0) env_ptr).Spk_1, ((gate2bel.Envpath_4_p_0_env_0) env_ptr).Ags_2, ((gate2bel.Envpath_4_p_0_env_0) env_ptr).Ts_10, new AddrOf2_0(77), env_ptr);
      }
//  gate2bel.m:338
    }
  }
//  gate2bel.m:336
  private static void envpath_4_p_0(
    java.lang.String Spk_1,
    set_ordlist.Set_ordlist_1 Ags_2,
    list.List_1 HeadVar__3_3,
    jmercury.runtime.MethodPtr cont,
    /* env_ptr */ java.lang.Object cont_env_ptr)
  {
    {
      gate2bel.Envpath_4_p_0_env_0 env = null;
      gate2bel.Envpath_4_p_0_env_0 env_ptr = null;

      {
        env = new gate2bel.Envpath_4_p_0_env_0();
      }
      env_ptr = env;
      ((gate2bel.Envpath_4_p_0_env_0) env_ptr).Spk_1 = Spk_1;
      ((gate2bel.Envpath_4_p_0_env_0) env_ptr).Ags_2 = Ags_2;
      ((gate2bel.Envpath_4_p_0_env_0) env_ptr).cont = cont;
      ((gate2bel.Envpath_4_p_0_env_0) env_ptr).cont_env_ptr = cont_env_ptr;
//  gate2bel.m:338
      {
        boolean succeeded = false;

        if ((HeadVar__3_3.data_tag == 0))
//  gate2bel.m:341
          {
            ((gate2bel.Envpath_4_p_0_env_0) env_ptr).HeadVar__4_4 = (list.List_1) gate2bel.MR_scalar_common_3[0];
            {
              ((jmercury.runtime.MethodPtr2) (((gate2bel.Envpath_4_p_0_env_0) env_ptr).cont)).call___0_0(((java.lang.Object) (((gate2bel.Envpath_4_p_0_env_0) env_ptr).HeadVar__4_4)), ((java.lang.Object) (((gate2bel.Envpath_4_p_0_env_0) env_ptr).cont_env_ptr)));
            }
          }
//  gate2bel.m:338
        else
          {
            gate2bel.Tmpagt_0 Ag0_7 = null;
            gate2bel.Tmpmod_0 V_13_13 = ((gate2bel.Tmpmod_0) ((list.List_1.F_cons_2) HeadVar__3_3).F1);

            ((gate2bel.Envpath_4_p_0_env_0) env_ptr).Ts_10 = ((list.List_1.F_cons_2) HeadVar__3_3).F2;
            Ag0_7 = ((gate2bel.Tmpmod_0) V_13_13).F1;
            ((gate2bel.Envpath_4_p_0_env_0) env_ptr).Ng_8 = ((gate2bel.Tmpmod_0) V_13_13).F2;
//  gate2bel.m:339
            {
              gate2bel.agent_4_p_0(((gate2bel.Envpath_4_p_0_env_0) env_ptr).Spk_1, ((gate2bel.Envpath_4_p_0_env_0) env_ptr).Ags_2, Ag0_7, new AddrOf2_0(78), env_ptr);
            }
//  gate2bel.m:338
          }
      }
//  gate2bel.m:336
    }
  }
//  gate2bel.m:329
  private static class Agent_4_p_0_env_0
    extends /* env_ptr */ java.lang.Object
  {
    public jmercury.runtime.MethodPtr cont;
    public /* env_ptr */ java.lang.Object cont_env_ptr;
//  gate2bel.m:331
    public java.lang.String HeadVar__4_4;
//  gate2bel.m:333
    public java.lang.Object conv0_HeadVar__4_4;

  }

  private static void agent_4_p_0_2(
    java.lang.Object arg1,
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.Agent_4_p_0_env_0 env_ptr = (gate2bel.Agent_4_p_0_env_0) env_ptr_arg;

      ((gate2bel.Agent_4_p_0_env_0) env_ptr).conv0_HeadVar__4_4 = arg1;
      {
        gate2bel.agent_4_p_0_1(env_ptr);
      }
    }
  }
  private static void agent_4_p_0_1(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.Agent_4_p_0_env_0 env_ptr = (gate2bel.Agent_4_p_0_env_0) env_ptr_arg;

      ((gate2bel.Agent_4_p_0_env_0) env_ptr).HeadVar__4_4 = ((java.lang.String) ((gate2bel.Agent_4_p_0_env_0) env_ptr).conv0_HeadVar__4_4);
      {
        ((jmercury.runtime.MethodPtr2) (((gate2bel.Agent_4_p_0_env_0) env_ptr).cont)).call___0_0(((java.lang.Object) (((gate2bel.Agent_4_p_0_env_0) env_ptr).HeadVar__4_4)), ((java.lang.Object) (((gate2bel.Agent_4_p_0_env_0) env_ptr).cont_env_ptr)));
      }
    }
  }
//  gate2bel.m:329
  private static void agent_4_p_0(
    java.lang.String Spk_1,
    set_ordlist.Set_ordlist_1 Ags_2,
    gate2bel.Tmpagt_0 HeadVar__3_3,
    jmercury.runtime.MethodPtr cont,
    /* env_ptr */ java.lang.Object cont_env_ptr)
  {
    {
      gate2bel.Agent_4_p_0_env_0 env = null;
      gate2bel.Agent_4_p_0_env_0 env_ptr = null;

      {
        env = new gate2bel.Agent_4_p_0_env_0();
      }
      env_ptr = env;
      ((gate2bel.Agent_4_p_0_env_0) env_ptr).cont = cont;
      ((gate2bel.Agent_4_p_0_env_0) env_ptr).cont_env_ptr = cont_env_ptr;
//  gate2bel.m:331
      {
        boolean succeeded = false;

        switch (HeadVar__3_3.data_tag) {
          case 0:
//  gate2bel.m:332
            {
              ((gate2bel.Agent_4_p_0_env_0) env_ptr).HeadVar__4_4 = Spk_1;
              {
                ((jmercury.runtime.MethodPtr2) (((gate2bel.Agent_4_p_0_env_0) env_ptr).cont)).call___0_0(((java.lang.Object) (((gate2bel.Agent_4_p_0_env_0) env_ptr).HeadVar__4_4)), ((java.lang.Object) (((gate2bel.Agent_4_p_0_env_0) env_ptr).cont_env_ptr)));
              }
            }
//  gate2bel.m:331
            break;
          case 1:
//  gate2bel.m:333
            {
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_13_13 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);

              {
                set.member_2_p_1(TypeCtorInfo_13_13, Ags_2, new AddrOf2_0(79), env_ptr);
              }
            }
//  gate2bel.m:331
            break;
          case 2:
            {
              ((gate2bel.Agent_4_p_0_env_0) env_ptr).HeadVar__4_4 = ((gate2bel.Tmpagt_0.Str_1) HeadVar__3_3).F1;
              {
                ((jmercury.runtime.MethodPtr2) (((gate2bel.Agent_4_p_0_env_0) env_ptr).cont)).call___0_0(((java.lang.Object) (((gate2bel.Agent_4_p_0_env_0) env_ptr).HeadVar__4_4)), ((java.lang.Object) (((gate2bel.Agent_4_p_0_env_0) env_ptr).cont_env_ptr)));
              }
            }
            break;
          default: /*NOTREACHED*/
            throw new jmercury.runtime.UnreachableDefault();
        }
      }
//  gate2bel.m:329
    }
  }
//  gate2bel.m:326
  private static class Envtriple_10_p_0_8_env_0
    extends /* env_ptr */ java.lang.Object
  {
    public jmercury.runtime.MethodPtr cont;
    public /* env_ptr */ java.lang.Object cont_env_ptr;
    public java.lang.Object wrapper_arg_1;
    public list.List_1 conv0_HeadVar__4_4;

  }

  private static void envtriple_10_p_0_7(
    list.List_1 arg1,
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.Envtriple_10_p_0_8_env_0 env_ptr = (gate2bel.Envtriple_10_p_0_8_env_0) env_ptr_arg;

      ((gate2bel.Envtriple_10_p_0_8_env_0) env_ptr).conv0_HeadVar__4_4 = arg1;
      {
        gate2bel.envtriple_10_p_0_6(env_ptr);
      }
    }
  }
  private static void envtriple_10_p_0_6(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.Envtriple_10_p_0_8_env_0 env_ptr = (gate2bel.Envtriple_10_p_0_8_env_0) env_ptr_arg;

      ((gate2bel.Envtriple_10_p_0_8_env_0) env_ptr).wrapper_arg_1 = ((java.lang.Object) (((gate2bel.Envtriple_10_p_0_8_env_0) env_ptr).conv0_HeadVar__4_4));
      {
        ((jmercury.runtime.MethodPtr2) (((gate2bel.Envtriple_10_p_0_8_env_0) env_ptr).cont)).call___0_0(((java.lang.Object) (((gate2bel.Envtriple_10_p_0_8_env_0) env_ptr).wrapper_arg_1)), ((java.lang.Object) (((gate2bel.Envtriple_10_p_0_8_env_0) env_ptr).cont_env_ptr)));
      }
    }
  }
  private static void envtriple_10_p_0_8(
    /* generic_type */ java.lang.Object closure_arg,
    jmercury.runtime.MethodPtr cont,
    /* env_ptr */ java.lang.Object cont_env_ptr)
  {
    {
      gate2bel.Envtriple_10_p_0_8_env_0 env = null;
      gate2bel.Envtriple_10_p_0_8_env_0 env_ptr = null;

      {
        env = new gate2bel.Envtriple_10_p_0_8_env_0();
      }
      env_ptr = env;
      ((gate2bel.Envtriple_10_p_0_8_env_0) env_ptr).cont = cont;
      ((gate2bel.Envtriple_10_p_0_8_env_0) env_ptr).cont_env_ptr = cont_env_ptr;
      {
        /* generic_type */ java.lang.Object closure = closure_arg;

        {
          gate2bel.envpath_4_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((set_ordlist.Set_ordlist_1) ((java.lang.Object[]) closure)[4]), ((list.List_1) ((java.lang.Object[]) closure)[5]), new AddrOf2_0(80), env_ptr);
        }
      }
    }
  }
//  gate2bel.m:317
  private static class Envtriple_10_p_0_env_0
    extends /* env_ptr */ java.lang.Object
  {
    public java.lang.String Nm_11;
    public set_ordlist.Set_ordlist_1 Ppl_12;
    public list.List_1 Mods_13;
    public java.lang.String Spk_14;
    public int I_15;
    public bool.Bool_0 Neg_17;
    public java.lang.String Pr_18;
    public maybe.Maybe_1 Ob0_19;
    public jmercury.runtime.MethodPtr cont;
    public /* env_ptr */ java.lang.Object cont_env_ptr;
//  gate2bel.m:319
    public boolean succeeded;
    public pair.Pair_2 Pair_20;
    public set_ordlist.Set_ordlist_1 Ags_21;
    public java.lang.String Sb_22;
    public maybe.Maybe_1 MbOb_25;
    public beliefs.Envtriple_0 Triple_26;
//  gate2bel.m:326
    public list.List_1 Path_28;
//  gate2bel.m:327
    public java.lang.Object conv1_Path_28;
//  gate2bel.m:321
    public java.lang.String Ob_24;

  }

//  gate2bel.m:320
  private static void envtriple_10_p_0_2(
    java.lang.String arg1,
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.Envtriple_10_p_0_env_0 env_ptr = (gate2bel.Envtriple_10_p_0_env_0) env_ptr_arg;

      ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Sb_22 = arg1;
      {
        gate2bel.envtriple_10_p_0_1(env_ptr);
      }
    }
  }
//  gate2bel.m:327
  private static void envtriple_10_p_0_11(
    java.lang.Object arg1,
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.Envtriple_10_p_0_env_0 env_ptr = (gate2bel.Envtriple_10_p_0_env_0) env_ptr_arg;

      ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).conv1_Path_28 = arg1;
      {
        gate2bel.envtriple_10_p_0_10(env_ptr);
      }
    }
  }
  private static void envtriple_10_p_0_10(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.Envtriple_10_p_0_env_0 env_ptr = (gate2bel.Envtriple_10_p_0_env_0) env_ptr_arg;

      ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Path_28 = ((list.List_1) ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).conv1_Path_28);
      {
        gate2bel.envtriple_10_p_0_9(env_ptr);
      }
    }
  }
//  gate2bel.m:326
  private static void envtriple_10_p_0_9(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.Envtriple_10_p_0_env_0 env_ptr = (gate2bel.Envtriple_10_p_0_env_0) env_ptr_arg;

//  gate2bel.m:327
      {
        ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Pair_20 = new pair.Pair_2(((java.lang.Object) (((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Path_28)), ((java.lang.Object) (((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Triple_26)));
      }
      {
        ((jmercury.runtime.MethodPtr2) (((gate2bel.Envtriple_10_p_0_env_0) env_ptr).cont)).call___0_0(((java.lang.Object) (((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Pair_20)), ((java.lang.Object) (((gate2bel.Envtriple_10_p_0_env_0) env_ptr).cont_env_ptr)));
      }
//  gate2bel.m:326
    }
  }
//  gate2bel.m:319
  private static void envtriple_10_p_0_3(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.Envtriple_10_p_0_env_0 env_ptr = (gate2bel.Envtriple_10_p_0_env_0) env_ptr_arg;

//  gate2bel.m:323
      {
        ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Triple_26 = new beliefs.Envtriple_0(((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Nm_11, ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).I_15, ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Sb_22, ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Neg_17, ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Pr_18, ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).MbOb_25);
      }
//  gate2bel.m:324
      ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).succeeded = ((((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Mods_13).data_tag == 0);
//  gate2bel.m:326
      if (((gate2bel.Envtriple_10_p_0_env_0) env_ptr).succeeded)
//  gate2bel.m:325
        {
          list.List_1 V_30_30 = null;
          beliefs.Envmod_0 V_31_31 = null;
          bool.Bool_0 V_32_32 = bool.Bool_0.K0;
          list.List_1 V_34_34 = null;

          private_builtin.dummy_var = beliefs.Modality_0.K0;
          {
            V_31_31 = new beliefs.Envmod_0(((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Spk_14, V_32_32, null);
          }
          V_34_34 = (list.List_1) gate2bel.MR_scalar_common_3[0];
          {
            V_30_30 = new list.List_1.F_cons_2(((java.lang.Object) (V_31_31)), V_34_34);
          }
          {
            ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Pair_20 = new pair.Pair_2(((java.lang.Object) (V_30_30)), ((java.lang.Object) (((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Triple_26)));
          }
          {
            ((jmercury.runtime.MethodPtr2) (((gate2bel.Envtriple_10_p_0_env_0) env_ptr).cont)).call___0_0(((java.lang.Object) (((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Pair_20)), ((java.lang.Object) (((gate2bel.Envtriple_10_p_0_env_0) env_ptr).cont_env_ptr)));
          }
        }
//  gate2bel.m:326
      else
        {
          jmercury.runtime.TypeInfo_Struct TypeInfo_38_38 = null;
          list.List_1 Paths_27 = null;
          /* closure */ java.lang.Object[] V_35_35 = null;

          {
            V_35_35 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_9[2])), ((java.lang.Object) (new AddrOf3_0(3))), java.lang.Integer.valueOf(3), ((java.lang.Object) (((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Spk_14)), ((java.lang.Object) (((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Ppl_12)), ((java.lang.Object) (((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Mods_13))};
          }
          TypeInfo_38_38 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[8]);
          {
            Paths_27 = solutions.solutions_2_p_1(TypeInfo_38_38, V_35_35);
          }
//  gate2bel.m:327
          {
            list.member_2_p_1(TypeInfo_38_38, Paths_27, new AddrOf2_0(81), env_ptr);
          }
//  gate2bel.m:326
        }
//  gate2bel.m:319
    }
  }
//  gate2bel.m:321
  private static void envtriple_10_p_0_5(
    java.lang.String arg1,
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.Envtriple_10_p_0_env_0 env_ptr = (gate2bel.Envtriple_10_p_0_env_0) env_ptr_arg;

      ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Ob_24 = arg1;
      {
        gate2bel.envtriple_10_p_0_4(env_ptr);
      }
    }
  }
  private static void envtriple_10_p_0_4(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.Envtriple_10_p_0_env_0 env_ptr = (gate2bel.Envtriple_10_p_0_env_0) env_ptr_arg;

      {
        ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).MbOb_25 = new maybe.Maybe_1.Yes_1(((java.lang.Object) (((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Ob_24)));
      }
      {
        gate2bel.envtriple_10_p_0_3(env_ptr);
      }
    }
  }
//  gate2bel.m:319
  private static void envtriple_10_p_0_1(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.Envtriple_10_p_0_env_0 env_ptr = (gate2bel.Envtriple_10_p_0_env_0) env_ptr_arg;

//  gate2bel.m:322
      if (((((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Ob0_19).data_tag == 0))
        {
          ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).MbOb_25 = (maybe.Maybe_1) gate2bel.MR_scalar_common_10[0];
          {
            gate2bel.envtriple_10_p_0_3(env_ptr);
          }
        }
      else
//  gate2bel.m:321
        {
          gate2bel.Tmpagt_0 Obj_23 = ((gate2bel.Tmpagt_0) ((maybe.Maybe_1.Yes_1) (((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Ob0_19)).F1);

          {
            gate2bel.agent_4_p_0(((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Spk_14, ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Ags_21, Obj_23, new AddrOf2_0(82), env_ptr);
          }
        }
//  gate2bel.m:319
    }
  }
//  gate2bel.m:317
  private static void envtriple_10_p_0(
    java.lang.String Nm_11,
    set_ordlist.Set_ordlist_1 Ppl_12,
    list.List_1 Mods_13,
    java.lang.String Spk_14,
    int I_15,
    gate2bel.Tmpagt_0 Sb0_16,
    bool.Bool_0 Neg_17,
    java.lang.String Pr_18,
    maybe.Maybe_1 Ob0_19,
    jmercury.runtime.MethodPtr cont,
    /* env_ptr */ java.lang.Object cont_env_ptr)
  {
    {
      gate2bel.Envtriple_10_p_0_env_0 env = null;
      gate2bel.Envtriple_10_p_0_env_0 env_ptr = null;

      {
        env = new gate2bel.Envtriple_10_p_0_env_0();
      }
      env_ptr = env;
      ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Nm_11 = Nm_11;
      ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Ppl_12 = Ppl_12;
      ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Mods_13 = Mods_13;
      ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Spk_14 = Spk_14;
      ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).I_15 = I_15;
      ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Neg_17 = Neg_17;
      ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Pr_18 = Pr_18;
      ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Ob0_19 = Ob0_19;
      ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).cont = cont;
      ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).cont_env_ptr = cont_env_ptr;
//  gate2bel.m:319
      {
        jmercury.runtime.TypeInfo_Struct TypeCtorInfo_36_36 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
        set_ordlist.Set_ordlist_1 V_29_29 = null;

//  gate2bel.m:320
        {
          V_29_29 = set.make_singleton_set_1_f_0(TypeCtorInfo_36_36, ((java.lang.Object) (((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Spk_14)));
        }
        {
          ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Ags_21 = set.difference_3_p_0(TypeCtorInfo_36_36, ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Ppl_12, V_29_29);
        }
        {
          gate2bel.agent_4_p_0(((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Spk_14, ((gate2bel.Envtriple_10_p_0_env_0) env_ptr).Ags_21, Sb0_16, new AddrOf2_0(83), env_ptr);
        }
//  gate2bel.m:319
      }
//  gate2bel.m:317
    }
  }
//  gate2bel.m:310
  private static java.lang.Object store_triple_8_p_0_4(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      tree234.Tree234_2 conv1_HeadVar__3_68 = null;

      {
        conv1_HeadVar__3_68 = gate2bel.IntroducedFrom__pred__store_triple__310__1_3_p_0(((pair.Pair_2) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2));
      }
      wrapper_arg_3 = ((java.lang.Object) (conv1_HeadVar__3_68));
      return wrapper_arg_3;
    }
  }
//  gate2bel.m:309
  private static class Store_triple_8_p_0_3_env_0
    extends /* env_ptr */ java.lang.Object
  {
    public jmercury.runtime.MethodPtr cont;
    public /* env_ptr */ java.lang.Object cont_env_ptr;
    public java.lang.Object wrapper_arg_1;
    public pair.Pair_2 conv0_Pair_20;

  }

  private static void store_triple_8_p_0_2(
    pair.Pair_2 arg1,
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.Store_triple_8_p_0_3_env_0 env_ptr = (gate2bel.Store_triple_8_p_0_3_env_0) env_ptr_arg;

      ((gate2bel.Store_triple_8_p_0_3_env_0) env_ptr).conv0_Pair_20 = arg1;
      {
        gate2bel.store_triple_8_p_0_1(env_ptr);
      }
    }
  }
  private static void store_triple_8_p_0_1(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.Store_triple_8_p_0_3_env_0 env_ptr = (gate2bel.Store_triple_8_p_0_3_env_0) env_ptr_arg;

      ((gate2bel.Store_triple_8_p_0_3_env_0) env_ptr).wrapper_arg_1 = ((java.lang.Object) (((gate2bel.Store_triple_8_p_0_3_env_0) env_ptr).conv0_Pair_20));
      {
        ((jmercury.runtime.MethodPtr2) (((gate2bel.Store_triple_8_p_0_3_env_0) env_ptr).cont)).call___0_0(((java.lang.Object) (((gate2bel.Store_triple_8_p_0_3_env_0) env_ptr).wrapper_arg_1)), ((java.lang.Object) (((gate2bel.Store_triple_8_p_0_3_env_0) env_ptr).cont_env_ptr)));
      }
    }
  }
  private static void store_triple_8_p_0_3(
    /* generic_type */ java.lang.Object closure_arg,
    jmercury.runtime.MethodPtr cont,
    /* env_ptr */ java.lang.Object cont_env_ptr)
  {
    {
      gate2bel.Store_triple_8_p_0_3_env_0 env = null;
      gate2bel.Store_triple_8_p_0_3_env_0 env_ptr = null;

      {
        env = new gate2bel.Store_triple_8_p_0_3_env_0();
      }
      env_ptr = env;
      ((gate2bel.Store_triple_8_p_0_3_env_0) env_ptr).cont = cont;
      ((gate2bel.Store_triple_8_p_0_3_env_0) env_ptr).cont_env_ptr = cont_env_ptr;
      {
        /* generic_type */ java.lang.Object closure = closure_arg;

        {
          gate2bel.envtriple_10_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((set_ordlist.Set_ordlist_1) ((java.lang.Object[]) closure)[4]), ((list.List_1) ((java.lang.Object[]) closure)[5]), ((java.lang.String) ((java.lang.Object[]) closure)[6]), ((java.lang.Integer) (((java.lang.Object[]) closure)[7])).intValue(), ((gate2bel.Tmpagt_0) ((java.lang.Object[]) closure)[8]), ((bool.Bool_0) ((java.lang.Object[]) closure)[9]), ((java.lang.String) ((java.lang.Object[]) closure)[10]), ((maybe.Maybe_1) ((java.lang.Object[]) closure)[11]), new AddrOf2_0(84), env_ptr);
        }
      }
    }
  }
//  gate2bel.m:285
  private static java.lang.Object [] store_triple_8_p_0(
    java.lang.String Nm_9,
    set_ordlist.Set_ordlist_1 Ppl_10,
    list.List_1 Ms_11,
    beliefs.Beltriple_0 HeadVar__4_4,
    tree234.Tree234_2 STATE_VARIABLE_Mmap_0_44,
    list.List_1 STATE_VARIABLE_Es_0_46)
  {
//  gate2bel.m:287
    {
      boolean succeeded = false;
      tree234.Tree234_2 STATE_VARIABLE_Mmap_45 = null;
      list.List_1 STATE_VARIABLE_Es_47 = null;
      int I_12 = ((beliefs.Beltriple_0) HeadVar__4_4).F1;
      java.lang.String Spk_13 = ((beliefs.Beltriple_0) HeadVar__4_4).F2;
      beliefs.Belstr_0 Sb_14 = ((beliefs.Beltriple_0) HeadVar__4_4).F3;
      bool.Bool_0 Neg_15 = ((beliefs.Beltriple_0) HeadVar__4_4).F4;
      beliefs.Belstr_0 Pr_16 = ((beliefs.Beltriple_0) HeadVar__4_4).F5;
      maybe.Maybe_1 Ob_17 = ((beliefs.Beltriple_0) HeadVar__4_4).F6;
      java.lang.String SbStr_20 = ((beliefs.Belstr_0) Sb_14).F1;
      beliefs.Bstrtp_0 SbTp_21 = ((beliefs.Belstr_0) Sb_14).F2;
      maybe.Maybe_1 M1_24 = null;
      java.lang.String PrStr_26 = null;
      beliefs.Bstrtp_0 PrTp_27 = null;
      bool.Bool_0 B2_28 = null;
      maybe.Maybe_1 M3_34 = null;
      list.List_1 STATE_VARIABLE_Es_51_51 = null;
      list.List_1 STATE_VARIABLE_Es_55_55 = null;
//  gate2bel.m:292
      gate2bel.Tmpagt_0 SbAg_22 = null;
//  gate2bel.m:313
      gate2bel.Tmpagt_0 Subj_36 = null;
      maybe.Maybe_1 Obj_37 = null;

//  gate2bel.m:289
      switch (/* tag */  0) {
        case 0:
          switch (SbTp_21.data_tag) {
            case 0:
              {
                {
                  SbAg_22 = new gate2bel.Tmpagt_0.Str_1(SbStr_20);
                }
                succeeded = true;
              }
              break;
            case 3:
              {
                {
                  SbAg_22 = new gate2bel.Tmpagt_0.Str_1(SbStr_20);
                }
                succeeded = true;
              }
              break;
            case 4:
//  gate2bel.m:290
              {
                wordnet.Prontp_0 SP_23 = ((beliefs.Bstrtp_0.Pronoun_1) SbTp_21).F1;

                switch (SP_23.MR_value) {
                  case 0:
                    {
                      SbAg_22 = (gate2bel.Tmpagt_0) gate2bel.MR_scalar_common_16[0];
                      succeeded = true;
                    }
                    break;
                  case 1:
                    {
                      SbAg_22 = (gate2bel.Tmpagt_0) gate2bel.MR_scalar_common_17[0];
                      succeeded = true;
                    }
                    break;
                  default:
                    succeeded = false;
                }
              }
//  gate2bel.m:289
              break;
            default:
              succeeded = false;
          }
          break;
        default:
          succeeded = false;
      }
//  gate2bel.m:292
      if (succeeded)
//  gate2bel.m:291
        {
          {
            M1_24 = new maybe.Maybe_1.Yes_1(((java.lang.Object) (SbAg_22)));
          }
          STATE_VARIABLE_Es_51_51 = STATE_VARIABLE_Es_0_46;
        }
//  gate2bel.m:292
      else
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_72_72 = null;
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_73_73 = null;
          sberrs.Error_0 SbMsg_25 = null;
          java.lang.String V_48_48 = null;
          java.lang.String V_49_49 = null;
          errors.Err_loc_0 V_50_50 = null;

          M1_24 = (maybe.Maybe_1) gate2bel.MR_scalar_common_10[0];
          V_48_48 = "subject";
          TypeCtorInfo_72_72 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_bstrtp_0);
          {
            V_49_49 = string.string_1_f_0(TypeCtorInfo_72_72, ((java.lang.Object) (SbTp_21)));
          }
          {
            SbMsg_25 = new sberrs.Error_0.Funny_str_3(V_48_48, SbStr_20, V_49_49);
          }
//  gate2bel.m:293
          {
            V_50_50 = new errors.Err_loc_0.File_1(Nm_9);
          }
          TypeCtorInfo_73_73 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
          {
            STATE_VARIABLE_Es_51_51 = errors.add_error_4_p_0(TypeCtorInfo_73_73, V_50_50, ((java.lang.Object) (SbMsg_25)), STATE_VARIABLE_Es_0_46);
          }
//  gate2bel.m:292
        }
//  gate2bel.m:294
      PrStr_26 = ((beliefs.Belstr_0) Pr_16).F1;
      PrTp_27 = ((beliefs.Belstr_0) Pr_16).F2;
//  gate2bel.m:295
      succeeded = (PrTp_27.data_tag == 0);
//  gate2bel.m:297
      if (succeeded)
//  gate2bel.m:296
        {
          B2_28 = bool.Bool_0.K1;
          STATE_VARIABLE_Es_55_55 = STATE_VARIABLE_Es_51_51;
        }
//  gate2bel.m:297
      else
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_74_74 = null;
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_75_75 = null;
          sberrs.Error_0 PrMsg_29 = null;
          java.lang.String V_52_52 = null;
          java.lang.String V_53_53 = null;
          errors.Err_loc_0 V_54_54 = null;

          B2_28 = bool.Bool_0.K0;
          V_52_52 = "predicate";
          TypeCtorInfo_74_74 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_bstrtp_0);
          {
            V_53_53 = string.string_1_f_0(TypeCtorInfo_74_74, ((java.lang.Object) (PrTp_27)));
          }
          {
            PrMsg_29 = new sberrs.Error_0.Funny_str_3(V_52_52, PrStr_26, V_53_53);
          }
//  gate2bel.m:298
          {
            V_54_54 = new errors.Err_loc_0.File_1(Nm_9);
          }
          TypeCtorInfo_75_75 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
          {
            STATE_VARIABLE_Es_55_55 = errors.add_error_4_p_0(TypeCtorInfo_75_75, V_54_54, ((java.lang.Object) (PrMsg_29)), STATE_VARIABLE_Es_51_51);
          }
//  gate2bel.m:297
        }
//  gate2bel.m:307
      if ((Ob_17.data_tag == 0))
        {
          maybe.Maybe_1 V_56_56 = (maybe.Maybe_1) gate2bel.MR_scalar_common_10[0];

          M3_34 = (maybe.Maybe_1) gate2bel.MR_scalar_common_18[0];
          STATE_VARIABLE_Es_47 = STATE_VARIABLE_Es_55_55;
        }
      else
//  gate2bel.m:299
        {
          java.lang.String ObStr_30 = null;
          beliefs.Bstrtp_0 ObTp_31 = null;
          beliefs.Belstr_0 V_57_57 = ((beliefs.Belstr_0) ((maybe.Maybe_1.Yes_1) Ob_17).F1);
//  gate2bel.m:305
          gate2bel.Tmpagt_0 ObAg_32 = null;

//  gate2bel.m:299
          ObStr_30 = ((beliefs.Belstr_0) V_57_57).F1;
          ObTp_31 = ((beliefs.Belstr_0) V_57_57).F2;
//  gate2bel.m:301
          switch (/* tag */  0) {
            case 0:
              switch (ObTp_31.data_tag) {
                case 0:
//  gate2bel.m:300
                  {
                    {
                      ObAg_32 = new gate2bel.Tmpagt_0.Str_1(ObStr_30);
                    }
                    succeeded = true;
                  }
//  gate2bel.m:301
                  break;
                case 3:
                  {
                    {
                      ObAg_32 = new gate2bel.Tmpagt_0.Str_1(ObStr_30);
                    }
                    succeeded = true;
                  }
                  break;
                case 4:
//  gate2bel.m:303
                  {
                    wordnet.Prontp_0 OP_33 = ((beliefs.Bstrtp_0.Pronoun_1) ObTp_31).F1;

                    switch (OP_33.MR_value) {
                      case 0:
                        {
                          ObAg_32 = (gate2bel.Tmpagt_0) gate2bel.MR_scalar_common_16[0];
                          succeeded = true;
                        }
                        break;
                      case 1:
                        {
                          ObAg_32 = (gate2bel.Tmpagt_0) gate2bel.MR_scalar_common_17[0];
                          succeeded = true;
                        }
                        break;
                      default:
                        succeeded = false;
                    }
                  }
//  gate2bel.m:301
                  break;
                default:
                  succeeded = false;
              }
              break;
            default:
              succeeded = false;
          }
//  gate2bel.m:305
          if (succeeded)
//  gate2bel.m:304
            {
              maybe.Maybe_1 V_58_58 = null;

              {
                V_58_58 = new maybe.Maybe_1.Yes_1(((java.lang.Object) (ObAg_32)));
              }
              {
                M3_34 = new maybe.Maybe_1.Yes_1(((java.lang.Object) (V_58_58)));
              }
              STATE_VARIABLE_Es_47 = STATE_VARIABLE_Es_55_55;
            }
//  gate2bel.m:305
          else
            {
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_76_76 = null;
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_77_77 = null;
              sberrs.Error_0 ObMsg_35 = null;
              java.lang.String V_59_59 = null;
              java.lang.String V_60_60 = null;
              errors.Err_loc_0 V_61_61 = null;

              M3_34 = (maybe.Maybe_1) gate2bel.MR_scalar_common_10[0];
              V_59_59 = "object";
              TypeCtorInfo_76_76 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_bstrtp_0);
              {
                V_60_60 = string.string_1_f_0(TypeCtorInfo_76_76, ((java.lang.Object) (ObTp_31)));
              }
              {
                ObMsg_35 = new sberrs.Error_0.Funny_str_3(V_59_59, ObStr_30, V_60_60);
              }
//  gate2bel.m:306
              {
                V_61_61 = new errors.Err_loc_0.File_1(Nm_9);
              }
              TypeCtorInfo_77_77 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
              {
                STATE_VARIABLE_Es_47 = errors.add_error_4_p_0(TypeCtorInfo_77_77, V_61_61, ((java.lang.Object) (ObMsg_35)), STATE_VARIABLE_Es_55_55);
              }
//  gate2bel.m:305
            }
//  gate2bel.m:299
        }
//  gate2bel.m:308
      succeeded = (M1_24.data_tag == 1);
      if (succeeded)
        {
          Subj_36 = ((gate2bel.Tmpagt_0) ((maybe.Maybe_1.Yes_1) M1_24).F1);
          succeeded = (B2_28.MR_value == bool.Bool_0.K1.MR_value);
          if (succeeded)
            {
              succeeded = (M3_34.data_tag == 1);
              if (succeeded)
                Obj_37 = ((maybe.Maybe_1) ((maybe.Maybe_1.Yes_1) M3_34).F1);
            }
        }
//  gate2bel.m:313
      if (succeeded)
//  gate2bel.m:309
        {
          jmercury.runtime.TypeInfo_Struct TypeInfo_79_79 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_82_82 = null;
          list.List_1 Ps_38 = null;
          /* closure */ java.lang.Object[] V_63_63 = null;
          /* closure */ java.lang.Object[] V_64_64 = null;
//  gate2bel.m:310
          java.lang.Object conv2_STATE_VARIABLE_Mmap_45 = null;

//  gate2bel.m:309
          {
            V_63_63 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_12[1])), ((java.lang.Object) (new AddrOf3_0(4))), java.lang.Integer.valueOf(9), ((java.lang.Object) (Nm_9)), ((java.lang.Object) (Ppl_10)), ((java.lang.Object) (Ms_11)), ((java.lang.Object) (Spk_13)), java.lang.Integer.valueOf(I_12), ((java.lang.Object) (Subj_36)), ((java.lang.Object) (Neg_15)), ((java.lang.Object) (PrStr_26)), ((java.lang.Object) (Obj_37))};
          }
          TypeInfo_79_79 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[14]);
          {
            Ps_38 = solutions.solutions_2_p_1(TypeInfo_79_79, V_63_63);
          }
//  gate2bel.m:310
          V_64_64 = (/* closure */ java.lang.Object[]) gate2bel.MR_scalar_common_6[3];
          TypeInfo_82_82 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[10]);
          {
            conv2_STATE_VARIABLE_Mmap_45 = list.foldl_4_p_0(TypeInfo_79_79, TypeInfo_82_82, V_64_64, Ps_38, ((java.lang.Object) (STATE_VARIABLE_Mmap_0_44)));
          }
          STATE_VARIABLE_Mmap_45 = ((tree234.Tree234_2) conv2_STATE_VARIABLE_Mmap_45);
//  gate2bel.m:309
        }
//  gate2bel.m:313
      else
//  gate2bel.m:310
        STATE_VARIABLE_Mmap_45 = STATE_VARIABLE_Mmap_0_44;
//  gate2bel.m:287
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_Mmap_45)),
        ((java.lang.Object) (STATE_VARIABLE_Es_47))
      };
    }
//  gate2bel.m:285
  }
//  gate2bel.m:272
  private static java.lang.Object [] env_mods_6_p_0_1(
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
      list.List_1 conv2_HeadVar__4_35 = null;
      bool.Bool_0 conv1_HeadVar__6_37 = null;
      list.List_1 conv0_HeadVar__8_39 = null;

      {
        java.lang.Object [] result = gate2bel.IntroducedFrom__pred__env_mods__272__1_8_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((beliefs.Belmod_0) wrapper_arg_1), ((list.List_1) wrapper_arg_2), ((bool.Bool_0) wrapper_arg_4), ((list.List_1) wrapper_arg_6));
        conv2_HeadVar__4_35 = (list.List_1) result[0];
        conv1_HeadVar__6_37 = (bool.Bool_0) result[1];
        conv0_HeadVar__8_39 = (list.List_1) result[2];
      }
      wrapper_arg_3 = ((java.lang.Object) (conv2_HeadVar__4_35));
      wrapper_arg_5 = ((java.lang.Object) (conv1_HeadVar__6_37));
      wrapper_arg_7 = ((java.lang.Object) (conv0_HeadVar__8_39));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_3)),
        ((java.lang.Object) (wrapper_arg_5)),
        ((java.lang.Object) (wrapper_arg_7))
      };
    }
  }
//  gate2bel.m:269
  private static java.lang.Object [] env_mods_6_p_0(
    java.lang.String Nm_7,
    set_ordlist.Set_ordlist_1 _Ppl_8,
    list.List_1 Ms_9,
    list.List_1 STATE_VARIABLE_Es_0_27)
  {
//  gate2bel.m:271
    {
      boolean succeeded = false;
      maybe.Maybe_1 Maybe_10 = null;
      list.List_1 STATE_VARIABLE_Es_28 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_56_56 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_57_57 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_58_58 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_59_59 = null;
      list.List_1 RevMs_25 = null;
      bool.Bool_0 UseQ_26 = null;
      /* closure */ java.lang.Object[] V_29_29 = null;
      list.List_1 V_30_30 = null;
      bool.Bool_0 V_31_31 = null;
//  gate2bel.m:272
      java.lang.Object conv5_RevMs_25 = null;
      java.lang.Object conv4_UseQ_26 = null;
      java.lang.Object conv3_STATE_VARIABLE_Es_28 = null;

      {
        V_29_29 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_8[5])), ((java.lang.Object) (new AddrOf5_0(1))), java.lang.Integer.valueOf(1), ((java.lang.Object) (Nm_7))};
      }
      V_30_30 = (list.List_1) gate2bel.MR_scalar_common_3[0];
      V_31_31 = bool.Bool_0.K1;
      TypeCtorInfo_56_56 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_belmod_0);
      TypeInfo_57_57 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[13]);
      TypeCtorInfo_58_58 = jmercury.runtime.TypeInfo_Struct.maybe_new(bool.bool__type_ctor_info_bool_0);
      TypeInfo_59_59 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[0]);
      {
        java.lang.Object [] result = list.foldl3_8_p_0(TypeCtorInfo_56_56, TypeInfo_57_57, TypeCtorInfo_58_58, TypeInfo_59_59, V_29_29, Ms_9, ((java.lang.Object) (V_30_30)), ((java.lang.Object) (V_31_31)), ((java.lang.Object) (STATE_VARIABLE_Es_0_27)));
        conv5_RevMs_25 = (java.lang.Object) result[0];
        conv4_UseQ_26 = (java.lang.Object) result[1];
        conv3_STATE_VARIABLE_Es_28 = (java.lang.Object) result[2];
      }
      RevMs_25 = ((list.List_1) conv5_RevMs_25);
      UseQ_26 = ((bool.Bool_0) conv4_UseQ_26);
      STATE_VARIABLE_Es_28 = ((list.List_1) conv3_STATE_VARIABLE_Es_28);
//  gate2bel.m:281
      switch (UseQ_26.MR_value) {
        case 0:
          Maybe_10 = (maybe.Maybe_1) gate2bel.MR_scalar_common_10[0];
          break;
        case 1:
//  gate2bel.m:280
          {
            jmercury.runtime.TypeInfo_Struct TypeCtorInfo_60_60 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_tmpmod_0);
            list.List_1 V_46_46 = null;

            {
              V_46_46 = list.reverse_1_f_0(TypeCtorInfo_60_60, RevMs_25);
            }
            {
              Maybe_10 = new maybe.Maybe_1.Yes_1(((java.lang.Object) (V_46_46)));
            }
          }
//  gate2bel.m:281
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
//  gate2bel.m:271
return new java.lang.Object[] {
        ((java.lang.Object) (Maybe_10)),
        ((java.lang.Object) (STATE_VARIABLE_Es_28))
      };
    }
//  gate2bel.m:269
  }
//  gate2bel.m:264
  private static java.lang.Object [] stmnt_envs_7_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_4)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      java.lang.Object wrapper_arg_5 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      tree234.Tree234_2 conv1_STATE_VARIABLE_Mmap_45 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_47 = null;

      {
        java.lang.Object [] result = gate2bel.store_triple_8_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((set_ordlist.Set_ordlist_1) ((java.lang.Object[]) closure)[4]), ((list.List_1) ((java.lang.Object[]) closure)[5]), ((beliefs.Beltriple_0) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2), ((list.List_1) wrapper_arg_4));
        conv1_STATE_VARIABLE_Mmap_45 = (tree234.Tree234_2) result[0];
        conv0_STATE_VARIABLE_Es_47 = (list.List_1) result[1];
      }
      wrapper_arg_3 = ((java.lang.Object) (conv1_STATE_VARIABLE_Mmap_45));
      wrapper_arg_5 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_47));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_3)),
        ((java.lang.Object) (wrapper_arg_5))
      };
    }
  }
//  gate2bel.m:257
  private static java.lang.Object [] stmnt_envs_7_p_0(
    java.lang.String Nm_1,
    set_ordlist.Set_ordlist_1 Ppl_2,
    beliefs.Belstmnt_0 HeadVar__3_3,
    tree234.Tree234_2 STATE_VARIABLE_Mmap_0_4,
    list.List_1 STATE_VARIABLE_Es_0_6)
  {
//  gate2bel.m:259
    {
      boolean succeeded = false;
      tree234.Tree234_2 STATE_VARIABLE_Mmap_5 = null;
      list.List_1 STATE_VARIABLE_Es_7 = null;

      if ((HeadVar__3_3.data_tag == 1))
//  gate2bel.m:262
        {
          list.List_1 Ms0_22 = ((beliefs.Belstmnt_0.Embedded_2) HeadVar__3_3).F1;
          list.List_1 Ts_23 = ((beliefs.Belstmnt_0.Embedded_2) HeadVar__3_3).F2;
          maybe.Maybe_1 Mb_26 = null;
          list.List_1 STATE_VARIABLE_Es_32_32 = null;

//  gate2bel.m:263
          {
            java.lang.Object [] result = gate2bel.env_mods_6_p_0(Nm_1, Ppl_2, Ms0_22, STATE_VARIABLE_Es_0_6);
            Mb_26 = (maybe.Maybe_1) result[0];
            STATE_VARIABLE_Es_32_32 = (list.List_1) result[1];
          }
//  gate2bel.m:265
          if ((Mb_26.data_tag == 0))
            {
              STATE_VARIABLE_Mmap_5 = STATE_VARIABLE_Mmap_0_4;
              STATE_VARIABLE_Es_7 = STATE_VARIABLE_Es_32_32;
            }
          else
//  gate2bel.m:264
            {
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_41_41 = null;
              jmercury.runtime.TypeInfo_Struct TypeInfo_42_42 = null;
              jmercury.runtime.TypeInfo_Struct TypeInfo_43_43 = null;
              list.List_1 Ms_27 = ((list.List_1) ((maybe.Maybe_1.Yes_1) Mb_26).F1);
              /* closure */ java.lang.Object[] V_33_33 = null;
              java.lang.Object conv3_STATE_VARIABLE_Mmap_5 = null;
              java.lang.Object conv2_STATE_VARIABLE_Es_7 = null;

              {
                V_33_33 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_8[4])), ((java.lang.Object) (new AddrOf4_0(0))), java.lang.Integer.valueOf(3), ((java.lang.Object) (Nm_1)), ((java.lang.Object) (Ppl_2)), ((java.lang.Object) (Ms_27))};
              }
              TypeCtorInfo_41_41 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_beltriple_0);
              TypeInfo_42_42 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[10]);
              TypeInfo_43_43 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[0]);
              {
                java.lang.Object [] result = list.foldl2_6_p_0(TypeCtorInfo_41_41, TypeInfo_42_42, TypeInfo_43_43, V_33_33, Ts_23, ((java.lang.Object) (STATE_VARIABLE_Mmap_0_4)), ((java.lang.Object) (STATE_VARIABLE_Es_32_32)));
                conv3_STATE_VARIABLE_Mmap_5 = (java.lang.Object) result[0];
                conv2_STATE_VARIABLE_Es_7 = (java.lang.Object) result[1];
              }
              STATE_VARIABLE_Mmap_5 = ((tree234.Tree234_2) conv3_STATE_VARIABLE_Mmap_5);
              STATE_VARIABLE_Es_7 = ((list.List_1) conv2_STATE_VARIABLE_Es_7);
            }
//  gate2bel.m:262
        }
//  gate2bel.m:259
      else
        {
          beliefs.Beltriple_0 T_10 = ((beliefs.Belstmnt_0.One_1) HeadVar__3_3).F1;
          list.List_1 V_17_17 = (list.List_1) gate2bel.MR_scalar_common_3[0];

//  gate2bel.m:260
          {
            java.lang.Object [] result = gate2bel.store_triple_8_p_0(Nm_1, Ppl_2, V_17_17, T_10, STATE_VARIABLE_Mmap_0_4, STATE_VARIABLE_Es_0_6);
            STATE_VARIABLE_Mmap_5 = (tree234.Tree234_2) result[0];
            STATE_VARIABLE_Es_7 = (list.List_1) result[1];
          }
//  gate2bel.m:259
        }
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_Mmap_5)),
        ((java.lang.Object) (STATE_VARIABLE_Es_7))
      };
    }
//  gate2bel.m:257
  }
//  gate2bel.m:254
  private static java.lang.Object [] file_envs_5_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_4)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      java.lang.Object wrapper_arg_5 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      tree234.Tree234_2 conv1_STATE_VARIABLE_Mmap_5 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_7 = null;

      {
        java.lang.Object [] result = gate2bel.stmnt_envs_7_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((set_ordlist.Set_ordlist_1) ((java.lang.Object[]) closure)[4]), ((beliefs.Belstmnt_0) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2), ((list.List_1) wrapper_arg_4));
        conv1_STATE_VARIABLE_Mmap_5 = (tree234.Tree234_2) result[0];
        conv0_STATE_VARIABLE_Es_7 = (list.List_1) result[1];
      }
      wrapper_arg_3 = ((java.lang.Object) (conv1_STATE_VARIABLE_Mmap_5));
      wrapper_arg_5 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_7));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_3)),
        ((java.lang.Object) (wrapper_arg_5))
      };
    }
  }
//  gate2bel.m:251
  private static java.lang.Object [] file_envs_5_p_0(
    beliefs.Belfile_0 HeadVar__1_1,
    tree234.Tree234_2 STATE_VARIABLE_Mmap_0_11,
    list.List_1 STATE_VARIABLE_Es_0_13)
  {
//  gate2bel.m:253
    {
      boolean succeeded = false;
      tree234.Tree234_2 STATE_VARIABLE_Mmap_12 = null;
      list.List_1 STATE_VARIABLE_Es_14 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_23_23 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_24_24 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_25_25 = null;
      java.lang.String Nm_6 = ((beliefs.Belfile_0) HeadVar__1_1).F1;
      set_ordlist.Set_ordlist_1 Ppl_7 = ((beliefs.Belfile_0) HeadVar__1_1).F2;
      list.List_1 Ss_8 = ((beliefs.Belfile_0) HeadVar__1_1).F3;
      /* closure */ java.lang.Object[] V_15_15 = null;
//  gate2bel.m:254
      java.lang.Object conv3_STATE_VARIABLE_Mmap_12 = null;
      java.lang.Object conv2_STATE_VARIABLE_Es_14 = null;

      {
        V_15_15 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_15[0])), ((java.lang.Object) (new AddrOf4_0(1))), java.lang.Integer.valueOf(2), ((java.lang.Object) (Nm_6)), ((java.lang.Object) (Ppl_7))};
      }
      TypeCtorInfo_23_23 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_belstmnt_0);
      TypeInfo_24_24 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[10]);
      TypeInfo_25_25 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[0]);
      {
        java.lang.Object [] result = list.foldl2_6_p_0(TypeCtorInfo_23_23, TypeInfo_24_24, TypeInfo_25_25, V_15_15, Ss_8, ((java.lang.Object) (STATE_VARIABLE_Mmap_0_11)), ((java.lang.Object) (STATE_VARIABLE_Es_0_13)));
        conv3_STATE_VARIABLE_Mmap_12 = (java.lang.Object) result[0];
        conv2_STATE_VARIABLE_Es_14 = (java.lang.Object) result[1];
      }
      STATE_VARIABLE_Mmap_12 = ((tree234.Tree234_2) conv3_STATE_VARIABLE_Mmap_12);
      STATE_VARIABLE_Es_14 = ((list.List_1) conv2_STATE_VARIABLE_Es_14);
//  gate2bel.m:253
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_Mmap_12)),
        ((java.lang.Object) (STATE_VARIABLE_Es_14))
      };
    }
//  gate2bel.m:251
  }
//  gate2bel.m:238
  private static java.lang.Object [] conv_triple5_8_p_0(
    tree234.Tree234_2 Map_9,
    java.lang.String Nm_10,
    gate2bel.Owltriple_0 T0_11,
    set_ordlist.Set_ordlist_1 STATE_VARIABLE_Ppl_0_26,
    list.List_1 STATE_VARIABLE_Es_0_28)
  {
//  gate2bel.m:239
    {
      boolean succeeded = false;
      beliefs.Beltriple_0 T_12 = null;
      set_ordlist.Set_ordlist_1 STATE_VARIABLE_Ppl_27 = null;
      list.List_1 STATE_VARIABLE_Es_29 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_32_32 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
      int Id_15 = ((gate2bel.Owltriple_0) T0_11).F1;
      java.lang.String Spk_16 = ((gate2bel.Owltriple_0) T0_11).F2;
      gate2bel.Owlstr_0 Sb0_17 = ((gate2bel.Owltriple_0) T0_11).F3;
      bool.Bool_0 Ng_18 = ((gate2bel.Owltriple_0) T0_11).F4;
      gate2bel.Owlpr_0 Pr0_19 = ((gate2bel.Owltriple_0) T0_11).F5;
      maybe.Maybe_1 Ob0_20 = ((gate2bel.Owltriple_0) T0_11).F6;
      beliefs.Belstr_0 Sb_21 = null;
      beliefs.Belstr_0 Pr_22 = null;
      maybe.Maybe_1 Ob_23 = null;
      java.lang.String Str_35 = null;
      gate2bel.Owlprtp_0 Tp0_36 = null;
      beliefs.Bstrtp_0 Tp_37 = null;

//  gate2bel.m:240
      {
        STATE_VARIABLE_Ppl_27 = set.insert_3_p_0(TypeCtorInfo_32_32, ((java.lang.Object) (Spk_16)), STATE_VARIABLE_Ppl_0_26);
      }
//  gate2bel.m:241
      {
        Sb_21 = gate2bel.conv_str5_4_p_0(Map_9, Nm_10, Sb0_17);
      }
//  gate2bel.m:398
      Str_35 = ((gate2bel.Owlpr_0) Pr0_19).F1;
      Tp0_36 = ((gate2bel.Owlpr_0) Pr0_19).F2;
//  gate2bel.m:402
      switch (Tp0_36.MR_value) {
        case 1:
//  gate2bel.m:403
          Tp_37 = (beliefs.Bstrtp_0) gate2bel.MR_scalar_common_13[0];
//  gate2bel.m:402
          break;
        case 0:
          Tp_37 = (beliefs.Bstrtp_0) gate2bel.MR_scalar_common_14[0];
          break;
        default: /*NOTREACHED*/
          throw new jmercury.runtime.UnreachableDefault();
      }
//  gate2bel.m:398
      {
        Pr_22 = new beliefs.Belstr_0(Str_35, Tp_37);
      }
//  gate2bel.m:399
      STATE_VARIABLE_Es_29 = STATE_VARIABLE_Es_0_28;
//  gate2bel.m:243
      if ((Ob0_20.data_tag == 0))
//  gate2bel.m:242
        Ob_23 = (maybe.Maybe_1) gate2bel.MR_scalar_common_10[0];
//  gate2bel.m:243
      else
        {
          gate2bel.Owlstr_0 Str0_24 = ((gate2bel.Owlstr_0) ((maybe.Maybe_1.Yes_1) Ob0_20).F1);
          beliefs.Belstr_0 Str_25 = null;

          {
            Str_25 = gate2bel.conv_str5_4_p_0(Map_9, Nm_10, Str0_24);
          }
          {
            Ob_23 = new maybe.Maybe_1.Yes_1(((java.lang.Object) (Str_25)));
          }
        }
//  gate2bel.m:244
      {
        T_12 = new beliefs.Beltriple_0(Id_15, Spk_16, Sb_21, Ng_18, Pr_22, Ob_23);
      }
//  gate2bel.m:239
return new java.lang.Object[] {
        ((java.lang.Object) (T_12)),
        ((java.lang.Object) (STATE_VARIABLE_Ppl_27)),
        ((java.lang.Object) (STATE_VARIABLE_Es_29))
      };
    }
//  gate2bel.m:238
  }
//  gate2bel.m:219
  private static java.lang.Object [] conv_mod_8_p_0(
    tree234.Tree234_2 Map_9,
    java.lang.String Nm_10,
    gate2bel.Lndata_0 HeadVar__3_3,
    set_ordlist.Set_ordlist_1 STATE_VARIABLE_Ppl_0_26,
    list.List_1 STATE_VARIABLE_Es_0_28)
  {
//  gate2bel.m:220
    {
      boolean succeeded = false;
      beliefs.Belmod_0 HeadVar__4_4 = null;
      set_ordlist.Set_ordlist_1 STATE_VARIABLE_Ppl_27 = null;
      list.List_1 STATE_VARIABLE_Es_29 = null;
      gate2bel.Owlstr_0 Ag0_11 = ((gate2bel.Lndata_0) HeadVar__3_3).F1;
      bool.Bool_0 Ng_12 = ((gate2bel.Lndata_0) HeadVar__3_3).F2;
      gate2bel.Cvalue_0 Ob_14 = ((gate2bel.Lndata_0) HeadVar__3_3).F4;
      beliefs.Belstr_0 Ag_15 = null;
      java.lang.String AgStr_18 = null;
      beliefs.Bstrtp_0 AgTp_19 = null;
      list.List_1 STATE_VARIABLE_Es_34_34 = null;

//  gate2bel.m:221
      {
        Ag_15 = gate2bel.conv_str5_4_p_0(Map_9, Nm_10, Ag0_11);
      }
//  gate2bel.m:220
      {
        HeadVar__4_4 = new beliefs.Belmod_0(Ag_15, Ng_12, null);
      }
//  gate2bel.m:221
      AgStr_18 = ((beliefs.Belstr_0) Ag_15).F1;
      AgTp_19 = ((beliefs.Belstr_0) Ag_15).F2;
//  gate2bel.m:222
      if ((AgTp_19.data_tag == 3))
        succeeded = true;
      else
        if ((AgTp_19.data_tag == 2))
          succeeded = true;
        else
          succeeded = false;
//  gate2bel.m:224
      if (succeeded)
//  gate2bel.m:223
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_50_50 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);

          {
            STATE_VARIABLE_Ppl_27 = set.insert_3_p_0(TypeCtorInfo_50_50, ((java.lang.Object) (AgStr_18)), STATE_VARIABLE_Ppl_0_26);
          }
          STATE_VARIABLE_Es_34_34 = STATE_VARIABLE_Es_0_28;
        }
//  gate2bel.m:224
      else
//  gate2bel.m:226
        {
//  gate2bel.m:224
          wordnet.Prontp_0 P_20 = null;

          succeeded = (AgTp_19.data_tag == 4);
          if (succeeded)
            {
              P_20 = ((beliefs.Bstrtp_0.Pronoun_1) AgTp_19).F1;
              switch (P_20.MR_value) {
                case 0:
                  succeeded = true;
                  break;
                case 1:
                  succeeded = true;
                  break;
                default:
                  succeeded = false;
              }
            }
//  gate2bel.m:226
          if (succeeded)
//  gate2bel.m:224
            STATE_VARIABLE_Es_34_34 = STATE_VARIABLE_Es_0_28;
//  gate2bel.m:226
          else
            {
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_51_51 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_bstrtp_0);
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_52_52 = null;
              sberrs.Error_0 Msg_21 = null;
              java.lang.String V_31_31 = "modality agent";
              java.lang.String V_32_32 = null;
              errors.Err_loc_0 V_33_33 = null;

              {
                V_32_32 = string.string_1_f_0(TypeCtorInfo_51_51, ((java.lang.Object) (AgTp_19)));
              }
              {
                Msg_21 = new sberrs.Error_0.Funny_str_3(V_31_31, AgStr_18, V_32_32);
              }
//  gate2bel.m:227
              {
                V_33_33 = new errors.Err_loc_0.File_1(Nm_10);
              }
              TypeCtorInfo_52_52 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
              {
                STATE_VARIABLE_Es_34_34 = errors.add_error_4_p_0(TypeCtorInfo_52_52, V_33_33, ((java.lang.Object) (Msg_21)), STATE_VARIABLE_Es_0_28);
              }
//  gate2bel.m:226
            }
//  gate2bel.m:227
          STATE_VARIABLE_Ppl_27 = STATE_VARIABLE_Ppl_0_26;
//  gate2bel.m:226
        }
//  gate2bel.m:229
      if ((Ob_14.data_tag == 1))
        {
          int V_56_56 = ((gate2bel.Cvalue_0.Cref_2) Ob_14).F2;
          gate2bel.Cstring_0 V_57_57 = ((gate2bel.Cvalue_0.Cref_2) Ob_14).F1;

          if ((V_57_57.data_tag == 0))
//  gate2bel.m:231
            {
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_54_54 = null;
              errors.Err_loc_0 V_40_40 = null;
              sberrs.Error_0 V_41_41 = null;

//  gate2bel.m:232
              {
                V_40_40 = new errors.Err_loc_0.File_1(Nm_10);
              }
              {
                V_41_41 = new sberrs.Error_0.Funny_mod_obj_c_1(V_56_56);
              }
              TypeCtorInfo_54_54 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
              {
                STATE_VARIABLE_Es_29 = errors.add_error_4_p_0(TypeCtorInfo_54_54, V_40_40, ((java.lang.Object) (V_41_41)), STATE_VARIABLE_Es_34_34);
              }
//  gate2bel.m:231
            }
//  gate2bel.m:229
          else
//  gate2bel.m:233
            {
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_55_55 = null;
              errors.Err_loc_0 V_36_36 = null;
              sberrs.Error_0 V_37_37 = null;
              java.lang.String Str_48 = ((gate2bel.Cstring_0.Str_2) V_57_57).F1;
              gate2bel.Strtype_0 V_25_25 = ((gate2bel.Cstring_0.Str_2) V_57_57).F2;

//  gate2bel.m:234
              {
                V_36_36 = new errors.Err_loc_0.File_1(Nm_10);
              }
              {
                V_37_37 = new sberrs.Error_0.Funny_mod_obj_sc_2(Str_48, V_56_56);
              }
              TypeCtorInfo_55_55 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
              {
                STATE_VARIABLE_Es_29 = errors.add_error_4_p_0(TypeCtorInfo_55_55, V_36_36, ((java.lang.Object) (V_37_37)), STATE_VARIABLE_Es_34_34);
              }
//  gate2bel.m:233
            }
//  gate2bel.m:229
        }
      else
        {
          gate2bel.Cstring_0 V_58_58 = ((gate2bel.Cvalue_0.Lit_1) Ob_14).F1;

          if ((V_58_58.data_tag == 0))
//  gate2bel.m:228
            STATE_VARIABLE_Es_29 = STATE_VARIABLE_Es_34_34;
//  gate2bel.m:229
          else
            {
              jmercury.runtime.TypeInfo_Struct TypeCtorInfo_53_53 = null;
              java.lang.String Str_22 = ((gate2bel.Cstring_0.Str_2) V_58_58).F1;
              errors.Err_loc_0 V_44_44 = null;
              sberrs.Error_0 V_45_45 = null;
              gate2bel.Strtype_0 V_23_23 = ((gate2bel.Cstring_0.Str_2) V_58_58).F2;

//  gate2bel.m:230
              {
                V_44_44 = new errors.Err_loc_0.File_1(Nm_10);
              }
              {
                V_45_45 = new sberrs.Error_0.Funny_mod_obj_s_1(Str_22);
              }
              TypeCtorInfo_53_53 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
              {
                STATE_VARIABLE_Es_29 = errors.add_error_4_p_0(TypeCtorInfo_53_53, V_44_44, ((java.lang.Object) (V_45_45)), STATE_VARIABLE_Es_34_34);
              }
//  gate2bel.m:229
            }
        }
//  gate2bel.m:220
return new java.lang.Object[] {
        ((java.lang.Object) (HeadVar__4_4)),
        ((java.lang.Object) (STATE_VARIABLE_Ppl_27)),
        ((java.lang.Object) (STATE_VARIABLE_Es_29))
      };
    }
//  gate2bel.m:219
  }
//  gate2bel.m:215
  private static java.lang.Object [] conv_stmnt_8_p_0_2(
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
      beliefs.Beltriple_0 conv7_T_12 = null;
      set_ordlist.Set_ordlist_1 conv6_STATE_VARIABLE_Ppl_27 = null;
      list.List_1 conv5_STATE_VARIABLE_Es_29 = null;

      {
        java.lang.Object [] result = gate2bel.conv_triple5_8_p_0(((tree234.Tree234_2) ((java.lang.Object[]) closure)[3]), ((java.lang.String) ((java.lang.Object[]) closure)[4]), ((gate2bel.Owltriple_0) wrapper_arg_1), ((set_ordlist.Set_ordlist_1) wrapper_arg_3), ((list.List_1) wrapper_arg_5));
        conv7_T_12 = (beliefs.Beltriple_0) result[0];
        conv6_STATE_VARIABLE_Ppl_27 = (set_ordlist.Set_ordlist_1) result[1];
        conv5_STATE_VARIABLE_Es_29 = (list.List_1) result[2];
      }
      wrapper_arg_2 = ((java.lang.Object) (conv7_T_12));
      wrapper_arg_4 = ((java.lang.Object) (conv6_STATE_VARIABLE_Ppl_27));
      wrapper_arg_6 = ((java.lang.Object) (conv5_STATE_VARIABLE_Es_29));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_2)),
        ((java.lang.Object) (wrapper_arg_4)),
        ((java.lang.Object) (wrapper_arg_6))
      };
    }
  }
//  gate2bel.m:214
  private static java.lang.Object [] conv_stmnt_8_p_0_1(
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
      beliefs.Belmod_0 conv2_HeadVar__4_4 = null;
      set_ordlist.Set_ordlist_1 conv1_STATE_VARIABLE_Ppl_27 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_29 = null;

      {
        java.lang.Object [] result = gate2bel.conv_mod_8_p_0(((tree234.Tree234_2) ((java.lang.Object[]) closure)[3]), ((java.lang.String) ((java.lang.Object[]) closure)[4]), ((gate2bel.Lndata_0) wrapper_arg_1), ((set_ordlist.Set_ordlist_1) wrapper_arg_3), ((list.List_1) wrapper_arg_5));
        conv2_HeadVar__4_4 = (beliefs.Belmod_0) result[0];
        conv1_STATE_VARIABLE_Ppl_27 = (set_ordlist.Set_ordlist_1) result[1];
        conv0_STATE_VARIABLE_Es_29 = (list.List_1) result[2];
      }
      wrapper_arg_2 = ((java.lang.Object) (conv2_HeadVar__4_4));
      wrapper_arg_4 = ((java.lang.Object) (conv1_STATE_VARIABLE_Ppl_27));
      wrapper_arg_6 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_29));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_2)),
        ((java.lang.Object) (wrapper_arg_4)),
        ((java.lang.Object) (wrapper_arg_6))
      };
    }
  }
//  gate2bel.m:210
  private static java.lang.Object [] conv_stmnt_8_p_0(
    tree234.Tree234_2 Map_1,
    java.lang.String Nm_2,
    gate2bel.Owlstmnt_0 HeadVar__3_3,
    set_ordlist.Set_ordlist_1 STATE_VARIABLE_Ppl_0_5,
    list.List_1 STATE_VARIABLE_Es_0_7)
  {
//  gate2bel.m:211
    {
      boolean succeeded = false;
      beliefs.Belstmnt_0 HeadVar__4_4 = null;
      set_ordlist.Set_ordlist_1 STATE_VARIABLE_Ppl_6 = null;
      list.List_1 STATE_VARIABLE_Es_8 = null;

      if ((HeadVar__3_3.data_tag == 1))
//  gate2bel.m:213
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_45_45 = null;
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_46_46 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_47_47 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_48_48 = null;
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_55_55 = null;
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_56_56 = null;
          list.List_1 Ms0_23 = ((gate2bel.Owlstmnt_0.Embedded_2) HeadVar__3_3).F1;
          list.List_1 Ts0_24 = ((gate2bel.Owlstmnt_0.Embedded_2) HeadVar__3_3).F2;
          list.List_1 Ms_25 = null;
          list.List_1 Ts_26 = null;
          /* closure */ java.lang.Object[] V_33_33 = null;
          set_ordlist.Set_ordlist_1 STATE_VARIABLE_Ppl_34_34 = null;
          list.List_1 STATE_VARIABLE_Es_35_35 = null;
          /* closure */ java.lang.Object[] V_36_36 = null;
//  gate2bel.m:214
          java.lang.Object conv4_STATE_VARIABLE_Ppl_34_34 = null;
          java.lang.Object conv3_STATE_VARIABLE_Es_35_35 = null;
//  gate2bel.m:215
          java.lang.Object conv9_STATE_VARIABLE_Ppl_6 = null;
          java.lang.Object conv8_STATE_VARIABLE_Es_8 = null;

//  gate2bel.m:214
          {
            V_33_33 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_8[2])), ((java.lang.Object) (new AddrOf4_0(2))), java.lang.Integer.valueOf(2), ((java.lang.Object) (Map_1)), ((java.lang.Object) (Nm_2))};
          }
          TypeCtorInfo_45_45 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_lndata_0);
          TypeCtorInfo_46_46 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_belmod_0);
          TypeInfo_47_47 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[7]);
          TypeInfo_48_48 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[0]);
          {
            java.lang.Object [] result = list.map_foldl2_7_p_0(TypeCtorInfo_45_45, TypeCtorInfo_46_46, TypeInfo_47_47, TypeInfo_48_48, V_33_33, Ms0_23, ((java.lang.Object) (STATE_VARIABLE_Ppl_0_5)), ((java.lang.Object) (STATE_VARIABLE_Es_0_7)));
            Ms_25 = (list.List_1) result[0];
            conv4_STATE_VARIABLE_Ppl_34_34 = (java.lang.Object) result[1];
            conv3_STATE_VARIABLE_Es_35_35 = (java.lang.Object) result[2];
          }
          STATE_VARIABLE_Ppl_34_34 = ((set_ordlist.Set_ordlist_1) conv4_STATE_VARIABLE_Ppl_34_34);
          STATE_VARIABLE_Es_35_35 = ((list.List_1) conv3_STATE_VARIABLE_Es_35_35);
//  gate2bel.m:215
          {
            V_36_36 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_8[3])), ((java.lang.Object) (new AddrOf4_0(3))), java.lang.Integer.valueOf(2), ((java.lang.Object) (Map_1)), ((java.lang.Object) (Nm_2))};
          }
          TypeCtorInfo_55_55 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_owltriple_0);
          TypeCtorInfo_56_56 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_beltriple_0);
          {
            java.lang.Object [] result = list.map_foldl2_7_p_0(TypeCtorInfo_55_55, TypeCtorInfo_56_56, TypeInfo_47_47, TypeInfo_48_48, V_36_36, Ts0_24, ((java.lang.Object) (STATE_VARIABLE_Ppl_34_34)), ((java.lang.Object) (STATE_VARIABLE_Es_35_35)));
            Ts_26 = (list.List_1) result[0];
            conv9_STATE_VARIABLE_Ppl_6 = (java.lang.Object) result[1];
            conv8_STATE_VARIABLE_Es_8 = (java.lang.Object) result[2];
          }
          STATE_VARIABLE_Ppl_6 = ((set_ordlist.Set_ordlist_1) conv9_STATE_VARIABLE_Ppl_6);
          STATE_VARIABLE_Es_8 = ((list.List_1) conv8_STATE_VARIABLE_Es_8);
//  gate2bel.m:213
          {
            HeadVar__4_4 = new beliefs.Belstmnt_0.Embedded_2(Ms_25, Ts_26);
          }
        }
//  gate2bel.m:211
      else
        {
          gate2bel.Owltriple_0 T0_11 = ((gate2bel.Owlstmnt_0.One_1) HeadVar__3_3).F1;
          beliefs.Beltriple_0 T_12 = null;

//  gate2bel.m:212
          {
            java.lang.Object [] result = gate2bel.conv_triple5_8_p_0(Map_1, Nm_2, T0_11, STATE_VARIABLE_Ppl_0_5, STATE_VARIABLE_Es_0_7);
            T_12 = (beliefs.Beltriple_0) result[0];
            STATE_VARIABLE_Ppl_6 = (set_ordlist.Set_ordlist_1) result[1];
            STATE_VARIABLE_Es_8 = (list.List_1) result[2];
          }
//  gate2bel.m:211
          {
            HeadVar__4_4 = new beliefs.Belstmnt_0.One_1(T_12);
          }
        }
return new java.lang.Object[] {
        ((java.lang.Object) (HeadVar__4_4)),
        ((java.lang.Object) (STATE_VARIABLE_Ppl_6)),
        ((java.lang.Object) (STATE_VARIABLE_Es_8))
      };
    }
//  gate2bel.m:210
  }
//  gate2bel.m:190
  private static java.lang.Object [] conv_triple4_10_p_0(
    java.lang.String Nm_11,
    int N_12,
    java.lang.String Spk_13,
    gate2bel.Triple3_0 HeadVar__4_4,
    tree234.Tree234_2 STATE_VARIABLE_CM_0_34,
    tree234.Tree234_2 STATE_VARIABLE_LM_0_36,
    list.List_1 STATE_VARIABLE_Es_0_38)
  {
//  gate2bel.m:191
    {
      boolean succeeded = false;
      tree234.Tree234_2 STATE_VARIABLE_CM_35 = null;
      tree234.Tree234_2 STATE_VARIABLE_LM_37 = null;
      list.List_1 STATE_VARIABLE_Es_39 = null;
      int I_14 = ((gate2bel.Triple3_0) HeadVar__4_4).F1;
      gate2bel.Cvalue_0 Subj_15 = ((gate2bel.Triple3_0) HeadVar__4_4).F2;
      bool.Bool_0 Neg_16 = ((gate2bel.Triple3_0) HeadVar__4_4).F3;
      gate2bel.Cstring_0 Pred_17 = ((gate2bel.Triple3_0) HeadVar__4_4).F4;
      gate2bel.Cvalue_0 Obj_18 = ((gate2bel.Triple3_0) HeadVar__4_4).F5;
      maybe.Maybe_1 Mb_19 = ((gate2bel.Triple3_0) HeadVar__4_4).F6;
//  gate2bel.m:203
      gate2bel.Owlstr_0 Sb_23 = null;

//  gate2bel.m:192
      {
        java.lang.Object [] result = gate2bel.owlstr_2_p_0(Subj_15);
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        Sb_23 = (gate2bel.Owlstr_0) result[1];
      }
//  gate2bel.m:203
      if (succeeded)
//  gate2bel.m:202
        {
          java.lang.String PrStr_24 = null;
          gate2bel.Strtype_0 PrTp0_25 = null;

//  gate2bel.m:193
          succeeded = (Pred_17.data_tag == 1);
          if (succeeded)
            {
              PrStr_24 = ((gate2bel.Cstring_0.Str_2) Pred_17).F1;
              PrTp0_25 = ((gate2bel.Cstring_0.Str_2) Pred_17).F2;
              {
                jmercury.runtime.TypeInfo_Struct TypeCtorInfo_51_51 = null;
                jmercury.runtime.TypeInfo_Struct TypeCtorInfo_52_52 = null;
                gate2bel.Owlpr_0 Pr_26 = null;
                gate2bel.Owlprtp_0 PrTp_27 = null;
                maybe.Maybe_1 Ob_28 = null;
                gate2bel.Owltriple_0 V_44_44 = null;
//  gate2bel.m:201
                int J_29 = 0;
                gate2bel.Owlstr_0 Z_30 = null;
//  gate2bel.m:199
                java.lang.String P_31 = null;
                gate2bel.Strtype_0 V_32_32 = null;

//  gate2bel.m:194
                succeeded = (PrTp0_25.data_tag == 0);
//  gate2bel.m:195
                if (succeeded)
//  gate2bel.m:194
                  {
                    PrTp_27 = gate2bel.Owlprtp_0.K0;
                    STATE_VARIABLE_Es_39 = STATE_VARIABLE_Es_0_38;
                  }
//  gate2bel.m:195
                else
//  gate2bel.m:196
                  {
//  gate2bel.m:195
                    succeeded = (PrTp0_25.data_tag == 2);
//  gate2bel.m:196
                    if (succeeded)
//  gate2bel.m:195
                      {
                        PrTp_27 = gate2bel.Owlprtp_0.K1;
                        STATE_VARIABLE_Es_39 = STATE_VARIABLE_Es_0_38;
                      }
//  gate2bel.m:196
                    else
                      {
                        jmercury.runtime.TypeInfo_Struct TypeCtorInfo_49_49 = null;
                        jmercury.runtime.TypeInfo_Struct TypeCtorInfo_50_50 = null;
                        errors.Err_loc_0 V_40_40 = null;
                        sberrs.Error_0 V_41_41 = null;
                        java.lang.String V_43_43 = null;

                        PrTp_27 = gate2bel.Owlprtp_0.K1;
//  gate2bel.m:197
                        {
                          V_40_40 = new errors.Err_loc_0.File_1(Nm_11);
                        }
                        TypeCtorInfo_49_49 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_strtype_0);
                        {
                          V_43_43 = string.string_1_f_0(TypeCtorInfo_49_49, ((java.lang.Object) (PrTp0_25)));
                        }
                        {
                          V_41_41 = new sberrs.Error_0.Unexp_predtp_1(V_43_43);
                        }
                        TypeCtorInfo_50_50 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
                        {
                          STATE_VARIABLE_Es_39 = errors.add_error_4_p_0(TypeCtorInfo_50_50, V_40_40, ((java.lang.Object) (V_41_41)), STATE_VARIABLE_Es_0_38);
                        }
//  gate2bel.m:196
                      }
                  }
//  gate2bel.m:193
                {
                  Pr_26 = new gate2bel.Owlpr_0(PrStr_24, PrTp_27);
                }
//  gate2bel.m:574
                if ((Obj_18.data_tag == 1))
                  {
                    int V_68_68 = ((gate2bel.Cvalue_0.Cref_2) Obj_18).F2;
                    gate2bel.Cstring_0 V_69_69 = ((gate2bel.Cvalue_0.Cref_2) Obj_18).F1;

                    if ((V_69_69.data_tag == 0))
//  gate2bel.m:576
                      Ob_28 = (maybe.Maybe_1) gate2bel.MR_scalar_common_10[0];
//  gate2bel.m:574
                    else
//  gate2bel.m:577
                      {
                        java.lang.String S_62 = ((gate2bel.Cstring_0.Str_2) V_69_69).F1;
                        gate2bel.Strtype_0 Tp0_63 = ((gate2bel.Cstring_0.Str_2) V_69_69).F2;
                        gate2bel.Owlstrtp_0 Tp_65 = null;
                        gate2bel.Owlstr_0 V_67_67 = null;

                        {
                          Tp_65 = gate2bel.strtype2owlstrtp_2_p_0(Tp0_63);
                        }
                        {
                          V_67_67 = new gate2bel.Owlstr_0.Cref_3(S_62, Tp_65, V_68_68);
                        }
                        {
                          Ob_28 = new maybe.Maybe_1.Yes_1(((java.lang.Object) (V_67_67)));
                        }
                      }
//  gate2bel.m:574
                  }
                else
                  {
                    gate2bel.Cstring_0 V_70_70 = ((gate2bel.Cvalue_0.Lit_1) Obj_18).F1;

                    if ((V_70_70.data_tag == 0))
                      Ob_28 = (maybe.Maybe_1) gate2bel.MR_scalar_common_10[0];
                    else
//  gate2bel.m:575
                      {
                        java.lang.String S_55 = ((gate2bel.Cstring_0.Str_2) V_70_70).F1;
                        gate2bel.Strtype_0 Tp0_56 = ((gate2bel.Cstring_0.Str_2) V_70_70).F2;
                        gate2bel.Owlstrtp_0 Tp_57 = null;
                        gate2bel.Owlstr_0 V_59_59 = null;

                        {
                          Tp_57 = gate2bel.strtype2owlstrtp_2_p_0(Tp0_56);
                        }
                        {
                          V_59_59 = new gate2bel.Owlstr_0.Str_2(S_55, Tp_57);
                        }
                        {
                          Ob_28 = new maybe.Maybe_1.Yes_1(((java.lang.Object) (V_59_59)));
                        }
                      }
//  gate2bel.m:574
                  }
//  gate2bel.m:198
                {
                  V_44_44 = new gate2bel.Owltriple_0(N_12, Spk_13, Sb_23, Neg_16, Pr_26, Ob_28);
                }
                TypeCtorInfo_51_51 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
                TypeCtorInfo_52_52 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_owltriple_0);
                {
                  STATE_VARIABLE_CM_35 = multi_map.set_4_p_0(TypeCtorInfo_51_51, TypeCtorInfo_52_52, java.lang.Integer.valueOf(I_14), ((java.lang.Object) (V_44_44)), STATE_VARIABLE_CM_0_34);
                }
//  gate2bel.m:199
                succeeded = (Mb_19.data_tag == 1);
                if (succeeded)
                  {
                    J_29 = ((java.lang.Integer) (((maybe.Maybe_1.Yes_1) Mb_19).F1)).intValue();
                    {
                      java.lang.Object [] result = gate2bel.owlstr_2_p_0(Subj_15);
                      succeeded = ((java.lang.Boolean) result[0]).booleanValue();
                      Z_30 = (gate2bel.Owlstr_0) result[1];
                    }
                    if (succeeded)
                      {
                        P_31 = ((gate2bel.Cstring_0.Str_2) Pred_17).F1;
                        V_32_32 = ((gate2bel.Cstring_0.Str_2) Pred_17).F2;
                        {
                          succeeded = beliefs.modality_word_2_p_0(P_31);
                        }
                      }
                  }
//  gate2bel.m:201
                if (succeeded)
//  gate2bel.m:200
                  {
                    jmercury.runtime.TypeInfo_Struct TypeInfo_53_53 = null;
                    pair.Pair_2 V_46_46 = null;
                    gate2bel.Lndata_0 V_48_48 = null;

                    {
                      V_48_48 = new gate2bel.Lndata_0(Z_30, Neg_16, null, Obj_18);
                    }
                    {
                      V_46_46 = new pair.Pair_2(((java.lang.Object) (V_48_48)), java.lang.Integer.valueOf(J_29));
                    }
                    TypeInfo_53_53 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[2]);
                    {
                      STATE_VARIABLE_LM_37 = multi_map.set_4_p_0(TypeCtorInfo_51_51, TypeInfo_53_53, java.lang.Integer.valueOf(I_14), ((java.lang.Object) (V_46_46)), STATE_VARIABLE_LM_0_36);
                    }
                  }
//  gate2bel.m:201
                else
//  gate2bel.m:200
                  STATE_VARIABLE_LM_37 = STATE_VARIABLE_LM_0_36;
//  gate2bel.m:193
              }
            }
          else
//  gate2bel.m:202
            {
              STATE_VARIABLE_Es_39 = STATE_VARIABLE_Es_0_38;
              STATE_VARIABLE_LM_37 = STATE_VARIABLE_LM_0_36;
              STATE_VARIABLE_CM_35 = STATE_VARIABLE_CM_0_34;
            }
        }
//  gate2bel.m:203
      else
        {
          STATE_VARIABLE_Es_39 = STATE_VARIABLE_Es_0_38;
          STATE_VARIABLE_LM_37 = STATE_VARIABLE_LM_0_36;
          STATE_VARIABLE_CM_35 = STATE_VARIABLE_CM_0_34;
        }
//  gate2bel.m:191
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_CM_35)),
        ((java.lang.Object) (STATE_VARIABLE_LM_37)),
        ((java.lang.Object) (STATE_VARIABLE_Es_39))
      };
    }
//  gate2bel.m:190
  }
//  gate2bel.m:186
  private static java.lang.Object [] conv_chunks4_8_p_0_1(
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
      tree234.Tree234_2 conv2_STATE_VARIABLE_CM_35 = null;
      tree234.Tree234_2 conv1_STATE_VARIABLE_LM_37 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_39 = null;

      {
        java.lang.Object [] result = gate2bel.conv_triple4_10_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((java.lang.Integer) (((java.lang.Object[]) closure)[4])).intValue(), ((java.lang.String) ((java.lang.Object[]) closure)[5]), ((gate2bel.Triple3_0) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2), ((tree234.Tree234_2) wrapper_arg_4), ((list.List_1) wrapper_arg_6));
        conv2_STATE_VARIABLE_CM_35 = (tree234.Tree234_2) result[0];
        conv1_STATE_VARIABLE_LM_37 = (tree234.Tree234_2) result[1];
        conv0_STATE_VARIABLE_Es_39 = (list.List_1) result[2];
      }
      wrapper_arg_3 = ((java.lang.Object) (conv2_STATE_VARIABLE_CM_35));
      wrapper_arg_5 = ((java.lang.Object) (conv1_STATE_VARIABLE_LM_37));
      wrapper_arg_7 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_39));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_3)),
        ((java.lang.Object) (wrapper_arg_5)),
        ((java.lang.Object) (wrapper_arg_7))
      };
    }
  }
//  gate2bel.m:183
  private static java.lang.Object [] conv_chunks4_8_p_0(
    java.lang.String Nm_9,
    gate2bel.Chunk3_0 HeadVar__2_2,
    tree234.Tree234_2 STATE_VARIABLE_CM_0_21,
    tree234.Tree234_2 STATE_VARIABLE_LM_0_23,
    list.List_1 STATE_VARIABLE_Es_0_25)
  {
//  gate2bel.m:184
    {
      boolean succeeded = false;
      tree234.Tree234_2 STATE_VARIABLE_CM_22 = null;
      tree234.Tree234_2 STATE_VARIABLE_LM_24 = null;
      list.List_1 STATE_VARIABLE_Es_26 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_38_38 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_39_39 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_40_40 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_41_41 = null;
      java.lang.String Trn_12 = ((gate2bel.Chunk3_0) HeadVar__2_2).F3;
      java.lang.String Spk_13 = ((gate2bel.Chunk3_0) HeadVar__2_2).F4;
      list.List_1 Ts_15 = ((gate2bel.Chunk3_0) HeadVar__2_2).F6;
      int N_20 = 0;
      /* closure */ java.lang.Object[] V_27_27 = null;
      int V_10_10 = ((gate2bel.Chunk3_0) HeadVar__2_2).F1;
      java.lang.String _Txt_11 = ((gate2bel.Chunk3_0) HeadVar__2_2).F2;
      list.List_1 _DAs_14 = ((gate2bel.Chunk3_0) HeadVar__2_2).F5;
//  gate2bel.m:185
      int N0_19 = 0;
//  gate2bel.m:186
      java.lang.Object conv5_STATE_VARIABLE_CM_22 = null;
      java.lang.Object conv4_STATE_VARIABLE_LM_24 = null;
      java.lang.Object conv3_STATE_VARIABLE_Es_26 = null;

//  gate2bel.m:185
      {
        java.lang.Object [] result = string.to_int_2_p_0(Trn_12);
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        N0_19 = ((java.lang.Integer) result[1]).intValue();
      }
      if (succeeded)
        N_20 = N0_19;
      else
        N_20 = -1;
//  gate2bel.m:186
      {
        V_27_27 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_12[0])), ((java.lang.Object) (new AddrOf5_0(2))), java.lang.Integer.valueOf(3), ((java.lang.Object) (Nm_9)), java.lang.Integer.valueOf(N_20), ((java.lang.Object) (Spk_13))};
      }
      TypeCtorInfo_38_38 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_triple3_0);
      TypeInfo_39_39 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[3]);
      TypeInfo_40_40 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[5]);
      TypeInfo_41_41 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[0]);
      {
        java.lang.Object [] result = list.foldl3_8_p_0(TypeCtorInfo_38_38, TypeInfo_39_39, TypeInfo_40_40, TypeInfo_41_41, V_27_27, Ts_15, ((java.lang.Object) (STATE_VARIABLE_CM_0_21)), ((java.lang.Object) (STATE_VARIABLE_LM_0_23)), ((java.lang.Object) (STATE_VARIABLE_Es_0_25)));
        conv5_STATE_VARIABLE_CM_22 = (java.lang.Object) result[0];
        conv4_STATE_VARIABLE_LM_24 = (java.lang.Object) result[1];
        conv3_STATE_VARIABLE_Es_26 = (java.lang.Object) result[2];
      }
      STATE_VARIABLE_CM_22 = ((tree234.Tree234_2) conv5_STATE_VARIABLE_CM_22);
      STATE_VARIABLE_LM_24 = ((tree234.Tree234_2) conv4_STATE_VARIABLE_LM_24);
      STATE_VARIABLE_Es_26 = ((list.List_1) conv3_STATE_VARIABLE_Es_26);
//  gate2bel.m:184
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_CM_22)),
        ((java.lang.Object) (STATE_VARIABLE_LM_24)),
        ((java.lang.Object) (STATE_VARIABLE_Es_26))
      };
    }
//  gate2bel.m:183
  }
//  gate2bel.m:165
  private static java.lang.Object conv_triple2_6_p_0_4(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      gate2bel.Triple3_0 conv1_HeadVar__5_83 = null;

      {
        conv1_HeadVar__5_83 = gate2bel.IntroducedFrom__pred__conv_triple2__165__1_5_p_0(((java.lang.Integer) (((java.lang.Object[]) closure)[3])).intValue(), ((bool.Bool_0) ((java.lang.Object[]) closure)[4]), ((gate2bel.Cstring_0) ((java.lang.Object[]) closure)[5]), ((pair.Pair_2) wrapper_arg_1));
      }
      wrapper_arg_2 = ((java.lang.Object) (conv1_HeadVar__5_83));
      return wrapper_arg_2;
    }
  }
//  gate2bel.m:162
  private static class Conv_triple2_6_p_0_3_env_0
    extends /* env_ptr */ java.lang.Object
  {
    public jmercury.runtime.MethodPtr cont;
    public /* env_ptr */ java.lang.Object cont_env_ptr;
    public java.lang.Object wrapper_arg_1;
    public pair.Pair_2 conv0_HeadVar__3_75;

  }

  private static void conv_triple2_6_p_0_2(
    pair.Pair_2 arg1,
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.Conv_triple2_6_p_0_3_env_0 env_ptr = (gate2bel.Conv_triple2_6_p_0_3_env_0) env_ptr_arg;

      ((gate2bel.Conv_triple2_6_p_0_3_env_0) env_ptr).conv0_HeadVar__3_75 = arg1;
      {
        gate2bel.conv_triple2_6_p_0_1(env_ptr);
      }
    }
  }
  private static void conv_triple2_6_p_0_1(
    /* env_ptr */ java.lang.Object env_ptr_arg)
  {
    {
      gate2bel.Conv_triple2_6_p_0_3_env_0 env_ptr = (gate2bel.Conv_triple2_6_p_0_3_env_0) env_ptr_arg;

      ((gate2bel.Conv_triple2_6_p_0_3_env_0) env_ptr).wrapper_arg_1 = ((java.lang.Object) (((gate2bel.Conv_triple2_6_p_0_3_env_0) env_ptr).conv0_HeadVar__3_75));
      {
        ((jmercury.runtime.MethodPtr2) (((gate2bel.Conv_triple2_6_p_0_3_env_0) env_ptr).cont)).call___0_0(((java.lang.Object) (((gate2bel.Conv_triple2_6_p_0_3_env_0) env_ptr).wrapper_arg_1)), ((java.lang.Object) (((gate2bel.Conv_triple2_6_p_0_3_env_0) env_ptr).cont_env_ptr)));
      }
    }
  }
  private static void conv_triple2_6_p_0_3(
    /* generic_type */ java.lang.Object closure_arg,
    jmercury.runtime.MethodPtr cont,
    /* env_ptr */ java.lang.Object cont_env_ptr)
  {
    {
      gate2bel.Conv_triple2_6_p_0_3_env_0 env = null;
      gate2bel.Conv_triple2_6_p_0_3_env_0 env_ptr = null;

      {
        env = new gate2bel.Conv_triple2_6_p_0_3_env_0();
      }
      env_ptr = env;
      ((gate2bel.Conv_triple2_6_p_0_3_env_0) env_ptr).cont = cont;
      ((gate2bel.Conv_triple2_6_p_0_3_env_0) env_ptr).cont_env_ptr = cont_env_ptr;
      {
        /* generic_type */ java.lang.Object closure = closure_arg;

        {
          gate2bel.IntroducedFrom__pred__conv_triple2__162__1_3_p_0(((list.List_1) ((java.lang.Object[]) closure)[3]), ((list.List_1) ((java.lang.Object[]) closure)[4]), new AddrOf2_0(85), env_ptr);
        }
      }
    }
  }
//  gate2bel.m:147
  private static java.lang.Object [] conv_triple2_6_p_0(
    java.lang.String Nm_7,
    gate2bel.Triple2_0 T2_8,
    list.List_1 STATE_VARIABLE_T3s_0_39,
    list.List_1 STATE_VARIABLE_Es_0_41)
  {
//  gate2bel.m:148
    {
      boolean succeeded = false;
      list.List_1 STATE_VARIABLE_T3s_40 = null;
      list.List_1 STATE_VARIABLE_Es_42 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_98_98 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_100_100 = null;
      int Tid_11 = 0;
      gate2bel.Value2_0 Subj_12 = null;
      bool.Bool_0 Neg_13 = null;
      gate2bel.Value2_0 Pred_14 = null;
      gate2bel.Value2_0 Obj_15 = null;
      maybe.Maybe_1 M_16 = null;
      list.List_1 Ss_18 = null;
      list.List_1 Ps_19 = null;
      list.List_1 Os_20 = null;
      gate2bel.Cstring_0 P_21 = null;
      list.List_1 Pairs_31 = null;
      list.List_1 Ts_34 = null;
      list.List_1 STATE_VARIABLE_Es_43_43 = null;
      list.List_1 STATE_VARIABLE_Es_44_44 = null;
      list.List_1 STATE_VARIABLE_Es_45_45 = null;
      /* closure */ java.lang.Object[] V_74_74 = null;
//  gate2bel.m:165
      gate2bel.Cvalue_0 Sb_32 = null;
      gate2bel.Cvalue_0 Ob_33 = null;
//  gate2bel.m:164
      pair.Pair_2 V_76_76 = null;
      list.List_1 V_77_77 = null;

//  gate2bel.m:150
      if ((T2_8.data_tag == 0))
//  gate2bel.m:149
        {
          Tid_11 = ((gate2bel.Triple2_0.Triple_5) T2_8).F1;
          Subj_12 = ((gate2bel.Triple2_0.Triple_5) T2_8).F2;
          Neg_13 = ((gate2bel.Triple2_0.Triple_5) T2_8).F3;
          Pred_14 = ((gate2bel.Triple2_0.Triple_5) T2_8).F4;
          Obj_15 = ((gate2bel.Triple2_0.Triple_5) T2_8).F5;
          M_16 = (maybe.Maybe_1) gate2bel.MR_scalar_common_10[0];
        }
//  gate2bel.m:150
      else
        {
          int Lid_17 = 0;

          Tid_11 = ((gate2bel.Triple2_0.Triple_6) T2_8).F1;
          Subj_12 = ((gate2bel.Triple2_0.Triple_6) T2_8).F2;
          Neg_13 = ((gate2bel.Triple2_0.Triple_6) T2_8).F3;
          Pred_14 = ((gate2bel.Triple2_0.Triple_6) T2_8).F4;
          Obj_15 = ((gate2bel.Triple2_0.Triple_6) T2_8).F5;
          Lid_17 = ((gate2bel.Triple2_0.Triple_6) T2_8).F6;
          {
            M_16 = new maybe.Maybe_1.Yes_1(java.lang.Integer.valueOf(Lid_17));
          }
        }
//  gate2bel.m:151
      {
        java.lang.Object [] result = gate2bel.conv_val_5_p_0(Nm_7, Subj_12, STATE_VARIABLE_Es_0_41);
        Ss_18 = (list.List_1) result[0];
        STATE_VARIABLE_Es_43_43 = (list.List_1) result[1];
      }
      {
        java.lang.Object [] result = gate2bel.conv_val_5_p_0(Nm_7, Pred_14, STATE_VARIABLE_Es_43_43);
        Ps_19 = (list.List_1) result[0];
        STATE_VARIABLE_Es_44_44 = (list.List_1) result[1];
      }
      {
        java.lang.Object [] result = gate2bel.conv_val_5_p_0(Nm_7, Obj_15, STATE_VARIABLE_Es_44_44);
        Os_20 = (list.List_1) result[0];
        STATE_VARIABLE_Es_45_45 = (list.List_1) result[1];
      }
//  gate2bel.m:153
      if ((Ps_19.data_tag == 0))
//  gate2bel.m:160
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_95_95 = null;
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_96_96 = null;
          errors.Err_loc_0 V_46_46 = null;
          sberrs.Error_0 V_47_47 = null;
          java.lang.String V_49_49 = null;

          P_21 = (gate2bel.Cstring_0) gate2bel.MR_scalar_common_11[0];
//  gate2bel.m:161
          {
            V_46_46 = new errors.Err_loc_0.File_1(Nm_7);
          }
          TypeCtorInfo_95_95 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_value2_0);
          {
            V_49_49 = string.string_1_f_0(TypeCtorInfo_95_95, ((java.lang.Object) (Pred_14)));
          }
          {
            V_47_47 = new sberrs.Error_0.Funny_pred_1(V_49_49);
          }
          TypeCtorInfo_96_96 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
          {
            STATE_VARIABLE_Es_42 = errors.add_error_4_p_0(TypeCtorInfo_96_96, V_46_46, ((java.lang.Object) (V_47_47)), STATE_VARIABLE_Es_45_45);
          }
//  gate2bel.m:160
        }
//  gate2bel.m:153
      else
        {
          list.List_1 V_101_101 = ((list.List_1.F_cons_2) Ps_19).F2;
          gate2bel.Cvalue_0 V_102_102 = ((gate2bel.Cvalue_0) ((list.List_1.F_cons_2) Ps_19).F1);

          if ((V_101_101.data_tag == 0))
            if ((V_102_102.data_tag == 1))
//  gate2bel.m:155
              {
                jmercury.runtime.TypeInfo_Struct TypeCtorInfo_91_91 = null;
                jmercury.runtime.TypeInfo_Struct TypeCtorInfo_92_92 = null;
                errors.Err_loc_0 V_62_62 = null;
                sberrs.Error_0 V_63_63 = null;
                java.lang.String V_65_65 = null;
                int V_24_24 = 0;

                P_21 = ((gate2bel.Cvalue_0.Cref_2) V_102_102).F1;
                V_24_24 = ((gate2bel.Cvalue_0.Cref_2) V_102_102).F2;
//  gate2bel.m:156
                {
                  V_62_62 = new errors.Err_loc_0.File_1(Nm_7);
                }
                TypeCtorInfo_91_91 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_value2_0);
                {
                  V_65_65 = string.string_1_f_0(TypeCtorInfo_91_91, ((java.lang.Object) (Pred_14)));
                }
                {
                  V_63_63 = new sberrs.Error_0.Pred_coref_1(V_65_65);
                }
                TypeCtorInfo_92_92 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
                {
                  STATE_VARIABLE_Es_42 = errors.add_error_4_p_0(TypeCtorInfo_92_92, V_62_62, ((java.lang.Object) (V_63_63)), STATE_VARIABLE_Es_45_45);
                }
//  gate2bel.m:155
              }
//  gate2bel.m:153
            else
//  gate2bel.m:152
              {
                P_21 = ((gate2bel.Cvalue_0.Lit_1) V_102_102).F1;
                STATE_VARIABLE_Es_42 = STATE_VARIABLE_Es_45_45;
              }
//  gate2bel.m:153
          else
            if ((V_102_102.data_tag == 1))
//  gate2bel.m:157
              {
                jmercury.runtime.TypeInfo_Struct TypeCtorInfo_93_93 = null;
                jmercury.runtime.TypeInfo_Struct TypeCtorInfo_94_94 = null;
                errors.Err_loc_0 V_52_52 = null;
                sberrs.Error_0 V_53_53 = null;
                list.List_1 STATE_VARIABLE_Es_54_54 = null;
                java.lang.String V_55_55 = null;
                sberrs.Error_0 V_57_57 = null;
                java.lang.String V_59_59 = null;
                int V_25_25 = 0;

                P_21 = ((gate2bel.Cvalue_0.Cref_2) V_102_102).F1;
                V_25_25 = ((gate2bel.Cvalue_0.Cref_2) V_102_102).F2;
//  gate2bel.m:158
                {
                  V_52_52 = new errors.Err_loc_0.File_1(Nm_7);
                }
                TypeCtorInfo_93_93 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_value2_0);
                {
                  V_55_55 = string.string_1_f_0(TypeCtorInfo_93_93, ((java.lang.Object) (Pred_14)));
                }
                {
                  V_53_53 = new sberrs.Error_0.Funny_pred_1(V_55_55);
                }
                TypeCtorInfo_94_94 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
                {
                  STATE_VARIABLE_Es_54_54 = errors.add_error_4_p_0(TypeCtorInfo_94_94, V_52_52, ((java.lang.Object) (V_53_53)), STATE_VARIABLE_Es_45_45);
                }
//  gate2bel.m:159
                {
                  V_59_59 = string.string_1_f_0(TypeCtorInfo_93_93, ((java.lang.Object) (Pred_14)));
                }
                {
                  V_57_57 = new sberrs.Error_0.Pred_coref_1(V_59_59);
                }
                {
                  STATE_VARIABLE_Es_42 = errors.add_error_4_p_0(TypeCtorInfo_94_94, V_52_52, ((java.lang.Object) (V_57_57)), STATE_VARIABLE_Es_54_54);
                }
//  gate2bel.m:157
              }
//  gate2bel.m:153
            else
              {
                jmercury.runtime.TypeInfo_Struct TypeCtorInfo_89_89 = null;
                jmercury.runtime.TypeInfo_Struct TypeCtorInfo_90_90 = null;
                errors.Err_loc_0 V_68_68 = null;
                sberrs.Error_0 V_69_69 = null;
                java.lang.String V_71_71 = null;

                P_21 = ((gate2bel.Cvalue_0.Lit_1) V_102_102).F1;
//  gate2bel.m:154
                {
                  V_68_68 = new errors.Err_loc_0.File_1(Nm_7);
                }
                TypeCtorInfo_89_89 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_value2_0);
                {
                  V_71_71 = string.string_1_f_0(TypeCtorInfo_89_89, ((java.lang.Object) (Pred_14)));
                }
                {
                  V_69_69 = new sberrs.Error_0.Funny_pred_1(V_71_71);
                }
                TypeCtorInfo_90_90 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
                {
                  STATE_VARIABLE_Es_42 = errors.add_error_4_p_0(TypeCtorInfo_90_90, V_68_68, ((java.lang.Object) (V_69_69)), STATE_VARIABLE_Es_45_45);
                }
//  gate2bel.m:153
              }
        }
//  gate2bel.m:162
      {
        V_74_74 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_5[1])), ((java.lang.Object) (new AddrOf3_0(5))), java.lang.Integer.valueOf(2), ((java.lang.Object) (Ss_18)), ((java.lang.Object) (Os_20))};
      }
      TypeInfo_98_98 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[12]);
      {
        Pairs_31 = solutions.solutions_2_p_1(TypeInfo_98_98, V_74_74);
      }
//  gate2bel.m:164
      succeeded = (Pairs_31.data_tag == 1);
      if (succeeded)
        {
          V_76_76 = ((pair.Pair_2) ((list.List_1.F_cons_2) Pairs_31).F1);
          V_77_77 = ((list.List_1.F_cons_2) Pairs_31).F2;
          Sb_32 = ((gate2bel.Cvalue_0) ((pair.Pair_2) V_76_76).F1);
          Ob_33 = ((gate2bel.Cvalue_0) ((pair.Pair_2) V_76_76).F2);
          succeeded = (V_77_77.data_tag == 0);
        }
//  gate2bel.m:165
      if (succeeded)
//  gate2bel.m:164
        {
          gate2bel.Triple3_0 V_78_78 = null;
          list.List_1 V_79_79 = null;

          {
            V_78_78 = new gate2bel.Triple3_0(Tid_11, Sb_32, Neg_13, P_21, Ob_33, M_16);
          }
          V_79_79 = (list.List_1) gate2bel.MR_scalar_common_3[0];
          {
            Ts_34 = new list.List_1.F_cons_2(((java.lang.Object) (V_78_78)), V_79_79);
          }
        }
//  gate2bel.m:165
      else
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_99_99 = null;
          /* closure */ java.lang.Object[] V_80_80 = null;
          list.List_1 V_81_81 = null;

          {
            V_80_80 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_7[2])), ((java.lang.Object) (new AddrOf2_0(86))), java.lang.Integer.valueOf(3), java.lang.Integer.valueOf(Tid_11), ((java.lang.Object) (Neg_13)), ((java.lang.Object) (P_21))};
          }
          {
            V_81_81 = list.reverse_1_f_0(TypeInfo_98_98, Pairs_31);
          }
          TypeCtorInfo_99_99 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_triple3_0);
          {
            Ts_34 = list.map_3_p_0(TypeInfo_98_98, TypeCtorInfo_99_99, V_80_80, V_81_81);
          }
        }
      TypeCtorInfo_100_100 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_triple3_0);
//  gate2bel.m:167
      {
        STATE_VARIABLE_T3s_40 = list.append_3_p_1(TypeCtorInfo_100_100, STATE_VARIABLE_T3s_0_39, Ts_34);
      }
//  gate2bel.m:148
return new java.lang.Object[] {
        ((java.lang.Object) (STATE_VARIABLE_T3s_40)),
        ((java.lang.Object) (STATE_VARIABLE_Es_42))
      };
    }
//  gate2bel.m:147
  }
//  gate2bel.m:139
  private static java.lang.Object [] conv_chunks_7_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_4)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      java.lang.Object wrapper_arg_5 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      list.List_1 conv1_STATE_VARIABLE_T3s_40 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_42 = null;

      {
        java.lang.Object [] result = gate2bel.conv_triple2_6_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((gate2bel.Triple2_0) wrapper_arg_1), ((list.List_1) wrapper_arg_2), ((list.List_1) wrapper_arg_4));
        conv1_STATE_VARIABLE_T3s_40 = (list.List_1) result[0];
        conv0_STATE_VARIABLE_Es_42 = (list.List_1) result[1];
      }
      wrapper_arg_3 = ((java.lang.Object) (conv1_STATE_VARIABLE_T3s_40));
      wrapper_arg_5 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_42));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_3)),
        ((java.lang.Object) (wrapper_arg_5))
      };
    }
  }
//  gate2bel.m:136
  private static java.lang.Object [] conv_chunks_7_p_0(
    list.List_1 HeadVar__1_1,
    java.lang.String Nm_2,
    utils.Corefs_0 Corefs_3,
    list.List_1 STATE_VARIABLE_C3s_0_4,
    list.List_1 STATE_VARIABLE_Es_0_6)
  {
//  gate2bel.m:137
    while (true)
      {
        /* tailcall optimized into a loop */
        {
          boolean succeeded = false;
          list.List_1 STATE_VARIABLE_C3s_5 = null;
          list.List_1 STATE_VARIABLE_Es_7 = null;

          if ((HeadVar__1_1.data_tag == 0))
//  gate2bel.m:143
            {
              STATE_VARIABLE_Es_7 = STATE_VARIABLE_Es_0_6;
              STATE_VARIABLE_C3s_5 = STATE_VARIABLE_C3s_0_4;
            }
//  gate2bel.m:137
          else
            {
              gate2bel.Chunk2_0 C2_8 = ((gate2bel.Chunk2_0) ((list.List_1.F_cons_2) HeadVar__1_1).F1);
              list.List_1 C2s_9 = ((list.List_1.F_cons_2) HeadVar__1_1).F2;
              list.List_1 STATE_VARIABLE_Es_29_29 = null;
              list.List_1 STATE_VARIABLE_C3s_30_30 = null;

//  gate2bel.m:141
              if ((C2_8.data_tag == 0))
//  gate2bel.m:138
                {
                  jmercury.runtime.TypeInfo_Struct TypeCtorInfo_48_48 = null;
                  jmercury.runtime.TypeInfo_Struct TypeInfo_49_49 = null;
                  jmercury.runtime.TypeInfo_Struct TypeInfo_50_50 = null;
                  jmercury.runtime.TypeInfo_Struct TypeCtorInfo_51_51 = null;
                  int Id_14 = ((gate2bel.Chunk2_0.Chunk_6) C2_8).F1;
                  java.lang.String Txt_15 = ((gate2bel.Chunk2_0.Chunk_6) C2_8).F2;
                  java.lang.String Trn_16 = ((gate2bel.Chunk2_0.Chunk_6) C2_8).F3;
                  java.lang.String Spk_17 = ((gate2bel.Chunk2_0.Chunk_6) C2_8).F4;
                  list.List_1 DAs_18 = ((gate2bel.Chunk2_0.Chunk_6) C2_8).F5;
                  list.List_1 T2s_19 = ((gate2bel.Chunk2_0.Chunk_6) C2_8).F6;
                  list.List_1 RevT3s_20 = null;
                  /* closure */ java.lang.Object[] V_27_27 = null;
                  list.List_1 V_28_28 = null;
                  gate2bel.Chunk3_0 V_31_31 = null;
                  list.List_1 V_32_32 = null;
//  gate2bel.m:139
                  java.lang.Object conv3_RevT3s_20 = null;
                  java.lang.Object conv2_STATE_VARIABLE_Es_29_29 = null;

                  {
                    V_27_27 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_4[3])), ((java.lang.Object) (new AddrOf4_0(4))), java.lang.Integer.valueOf(1), ((java.lang.Object) (Nm_2))};
                  }
                  V_28_28 = (list.List_1) gate2bel.MR_scalar_common_3[0];
                  TypeCtorInfo_48_48 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_triple2_0);
                  TypeInfo_49_49 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[11]);
                  TypeInfo_50_50 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[0]);
                  {
                    java.lang.Object [] result = list.foldl2_6_p_0(TypeCtorInfo_48_48, TypeInfo_49_49, TypeInfo_50_50, V_27_27, T2s_19, ((java.lang.Object) (V_28_28)), ((java.lang.Object) (STATE_VARIABLE_Es_0_6)));
                    conv3_RevT3s_20 = (java.lang.Object) result[0];
                    conv2_STATE_VARIABLE_Es_29_29 = (java.lang.Object) result[1];
                  }
                  RevT3s_20 = ((list.List_1) conv3_RevT3s_20);
                  STATE_VARIABLE_Es_29_29 = ((list.List_1) conv2_STATE_VARIABLE_Es_29_29);
                  TypeCtorInfo_51_51 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_triple3_0);
//  gate2bel.m:140
                  {
                    V_32_32 = list.reverse_1_f_0(TypeCtorInfo_51_51, RevT3s_20);
                  }
                  {
                    V_31_31 = new gate2bel.Chunk3_0(Id_14, Txt_15, Trn_16, Spk_17, DAs_18, V_32_32);
                  }
                  {
                    STATE_VARIABLE_C3s_30_30 = new list.List_1.F_cons_2(((java.lang.Object) (V_31_31)), STATE_VARIABLE_C3s_0_4);
                  }
//  gate2bel.m:138
                }
//  gate2bel.m:141
              else
                {
                  STATE_VARIABLE_C3s_30_30 = STATE_VARIABLE_C3s_0_4;
                  STATE_VARIABLE_Es_29_29 = STATE_VARIABLE_Es_0_6;
                }
//  gate2bel.m:142
              /* direct tailcall eliminated */
              {
                list.List_1 HeadVar__1__tmp_copy_1 = C2s_9;
                list.List_1 STATE_VARIABLE_C3s_0__tmp_copy_4 = STATE_VARIABLE_C3s_30_30;
                list.List_1 STATE_VARIABLE_Es_0__tmp_copy_6 = STATE_VARIABLE_Es_29_29;

                STATE_VARIABLE_Es_0_6 = STATE_VARIABLE_Es_0__tmp_copy_6;
                STATE_VARIABLE_C3s_0_4 = STATE_VARIABLE_C3s_0__tmp_copy_4;
                HeadVar__1_1 = HeadVar__1__tmp_copy_1;
              }
              continue;
//  gate2bel.m:137
            }
return new java.lang.Object[] {
            ((java.lang.Object) (STATE_VARIABLE_C3s_5)),
            ((java.lang.Object) (STATE_VARIABLE_Es_7))
          };
        }
      }
//  gate2bel.m:136
  }
//  gate2bel.m:129
  private static java.lang.Object [] conv_triple_6_p_0_4(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      java.lang.Object wrapper_arg_4 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      gate2bel.Str2_0 conv7_S2_10 = null;
      list.List_1 conv6_STATE_VARIABLE_Es_19 = null;

      {
        java.lang.Object [] result = gate2bel.conv_obj_6_p_0(((maybe.Maybe_1) ((java.lang.Object[]) closure)[3]), ((java.lang.String) ((java.lang.Object[]) closure)[4]), ((java.lang.String) wrapper_arg_1), ((list.List_1) wrapper_arg_3));
        conv7_S2_10 = (gate2bel.Str2_0) result[0];
        conv6_STATE_VARIABLE_Es_19 = (list.List_1) result[1];
      }
      wrapper_arg_2 = ((java.lang.Object) (conv7_S2_10));
      wrapper_arg_4 = ((java.lang.Object) (conv6_STATE_VARIABLE_Es_19));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_2)),
        ((java.lang.Object) (wrapper_arg_4))
      };
    }
  }
//  gate2bel.m:128
  private static java.lang.Object [] conv_triple_6_p_0_3(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      java.lang.Object wrapper_arg_4 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      gate2bel.Str2_0 conv5_S2_10 = null;
      list.List_1 conv4_STATE_VARIABLE_Es_17 = null;

      {
        java.lang.Object [] result = gate2bel.conv_subj_6_p_0(((maybe.Maybe_1) ((java.lang.Object[]) closure)[3]), ((java.lang.String) ((java.lang.Object[]) closure)[4]), ((java.lang.String) wrapper_arg_1), ((list.List_1) wrapper_arg_3));
        conv5_S2_10 = (gate2bel.Str2_0) result[0];
        conv4_STATE_VARIABLE_Es_17 = (list.List_1) result[1];
      }
      wrapper_arg_2 = ((java.lang.Object) (conv5_S2_10));
      wrapper_arg_4 = ((java.lang.Object) (conv4_STATE_VARIABLE_Es_17));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_2)),
        ((java.lang.Object) (wrapper_arg_4))
      };
    }
  }
//  gate2bel.m:126
  private static java.lang.Object [] conv_triple_6_p_0_2(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      java.lang.Object wrapper_arg_4 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      gate2bel.Str2_0 conv3_S2_10 = null;
      list.List_1 conv2_STATE_VARIABLE_Es_19 = null;

      {
        java.lang.Object [] result = gate2bel.conv_obj_6_p_0(((maybe.Maybe_1) ((java.lang.Object[]) closure)[3]), ((java.lang.String) ((java.lang.Object[]) closure)[4]), ((java.lang.String) wrapper_arg_1), ((list.List_1) wrapper_arg_3));
        conv3_S2_10 = (gate2bel.Str2_0) result[0];
        conv2_STATE_VARIABLE_Es_19 = (list.List_1) result[1];
      }
      wrapper_arg_2 = ((java.lang.Object) (conv3_S2_10));
      wrapper_arg_4 = ((java.lang.Object) (conv2_STATE_VARIABLE_Es_19));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_2)),
        ((java.lang.Object) (wrapper_arg_4))
      };
    }
  }
//  gate2bel.m:125
  private static java.lang.Object [] conv_triple_6_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      java.lang.Object wrapper_arg_4 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      gate2bel.Str2_0 conv1_S2_10 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_17 = null;

      {
        java.lang.Object [] result = gate2bel.conv_subj_6_p_0(((maybe.Maybe_1) ((java.lang.Object[]) closure)[3]), ((java.lang.String) ((java.lang.Object[]) closure)[4]), ((java.lang.String) wrapper_arg_1), ((list.List_1) wrapper_arg_3));
        conv1_S2_10 = (gate2bel.Str2_0) result[0];
        conv0_STATE_VARIABLE_Es_17 = (list.List_1) result[1];
      }
      wrapper_arg_2 = ((java.lang.Object) (conv1_S2_10));
      wrapper_arg_4 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_17));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_2)),
        ((java.lang.Object) (wrapper_arg_4))
      };
    }
  }
//  gate2bel.m:123
  private static java.lang.Object [] conv_triple_6_p_0(
    maybe.Maybe_1 WN_1,
    java.lang.String F_2,
    gate2bel.Triple_0 HeadVar__3_3,
    list.List_1 STATE_VARIABLE_Es_0_5)
  {
//  gate2bel.m:124
    {
      boolean succeeded = false;
      gate2bel.Triple2_0 T2_4 = null;
      list.List_1 STATE_VARIABLE_Es_6 = null;

      if ((HeadVar__3_3.data_tag == 0))
        {
          int Id_9 = ((gate2bel.Triple_0.Triple_4) HeadVar__3_3).F1;
          gate2bel.Value_0 Sb0_10 = ((gate2bel.Triple_0.Triple_4) HeadVar__3_3).F2;
          gate2bel.Value_0 Pr0_11 = ((gate2bel.Triple_0.Triple_4) HeadVar__3_3).F3;
          gate2bel.Value_0 Ob0_12 = ((gate2bel.Triple_0.Triple_4) HeadVar__3_3).F4;
          gate2bel.Value2_0 Sb_15 = null;
          bool.Bool_0 Ng_16 = null;
          gate2bel.Value2_0 Pr_17 = null;
          gate2bel.Value2_0 Ob_18 = null;
          /* closure */ java.lang.Object[] V_21_21 = null;
          list.List_1 STATE_VARIABLE_Es_22_22 = null;
          list.List_1 STATE_VARIABLE_Es_23_23 = null;
          /* closure */ java.lang.Object[] V_24_24 = null;

//  gate2bel.m:125
          {
            V_21_21 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_4[2])), ((java.lang.Object) (new AddrOf3_0(6))), java.lang.Integer.valueOf(2), ((java.lang.Object) (WN_1)), ((java.lang.Object) (F_2))};
          }
          {
            java.lang.Object [] result = gate2bel.conv_value_5_p_0(V_21_21, Sb0_10, STATE_VARIABLE_Es_0_5);
            Sb_15 = (gate2bel.Value2_0) result[0];
            STATE_VARIABLE_Es_22_22 = (list.List_1) result[1];
          }
          {
            java.lang.Object [] result = gate2bel.conv_pred_7_p_0(WN_1, F_2, Pr0_11, STATE_VARIABLE_Es_22_22);
            Ng_16 = (bool.Bool_0) result[0];
            Pr_17 = (gate2bel.Value2_0) result[1];
            STATE_VARIABLE_Es_23_23 = (list.List_1) result[2];
          }
//  gate2bel.m:126
          {
            V_24_24 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_4[2])), ((java.lang.Object) (new AddrOf3_0(7))), java.lang.Integer.valueOf(2), ((java.lang.Object) (WN_1)), ((java.lang.Object) (F_2))};
          }
          {
            java.lang.Object [] result = gate2bel.conv_value_5_p_0(V_24_24, Ob0_12, STATE_VARIABLE_Es_23_23);
            Ob_18 = (gate2bel.Value2_0) result[0];
            STATE_VARIABLE_Es_6 = (list.List_1) result[1];
          }
          {
            T2_4 = new gate2bel.Triple2_0.Triple_5(Id_9, Sb_15, Ng_16, Pr_17, Ob_18);
          }
//  gate2bel.m:124
        }
      else
//  gate2bel.m:127
        {
          int Id_28 = ((gate2bel.Triple_0.Triple_5) HeadVar__3_3).F1;
          gate2bel.Value_0 Sb0_29 = ((gate2bel.Triple_0.Triple_5) HeadVar__3_3).F2;
          gate2bel.Value_0 Pr0_30 = ((gate2bel.Triple_0.Triple_5) HeadVar__3_3).F3;
          gate2bel.Value_0 Ob0_31 = ((gate2bel.Triple_0.Triple_5) HeadVar__3_3).F4;
          int Ln_32 = ((gate2bel.Triple_0.Triple_5) HeadVar__3_3).F5;
          gate2bel.Value2_0 Sb_35 = null;
          bool.Bool_0 Ng_36 = null;
          gate2bel.Value2_0 Pr_37 = null;
          gate2bel.Value2_0 Ob_38 = null;
          /* closure */ java.lang.Object[] V_41_41 = null;
          list.List_1 STATE_VARIABLE_Es_42_42 = null;
          list.List_1 STATE_VARIABLE_Es_43_43 = null;
          /* closure */ java.lang.Object[] V_44_44 = null;

//  gate2bel.m:128
          {
            V_41_41 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_4[2])), ((java.lang.Object) (new AddrOf3_0(8))), java.lang.Integer.valueOf(2), ((java.lang.Object) (WN_1)), ((java.lang.Object) (F_2))};
          }
          {
            java.lang.Object [] result = gate2bel.conv_value_5_p_0(V_41_41, Sb0_29, STATE_VARIABLE_Es_0_5);
            Sb_35 = (gate2bel.Value2_0) result[0];
            STATE_VARIABLE_Es_42_42 = (list.List_1) result[1];
          }
          {
            java.lang.Object [] result = gate2bel.conv_pred_7_p_0(WN_1, F_2, Pr0_30, STATE_VARIABLE_Es_42_42);
            Ng_36 = (bool.Bool_0) result[0];
            Pr_37 = (gate2bel.Value2_0) result[1];
            STATE_VARIABLE_Es_43_43 = (list.List_1) result[2];
          }
//  gate2bel.m:129
          {
            V_44_44 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_4[2])), ((java.lang.Object) (new AddrOf3_0(9))), java.lang.Integer.valueOf(2), ((java.lang.Object) (WN_1)), ((java.lang.Object) (F_2))};
          }
          {
            java.lang.Object [] result = gate2bel.conv_value_5_p_0(V_44_44, Ob0_31, STATE_VARIABLE_Es_43_43);
            Ob_38 = (gate2bel.Value2_0) result[0];
            STATE_VARIABLE_Es_6 = (list.List_1) result[1];
          }
          {
            T2_4 = new gate2bel.Triple2_0.Triple_6(Id_28, Sb_35, Ng_36, Pr_37, Ob_38, Ln_32);
          }
//  gate2bel.m:127
        }
//  gate2bel.m:124
return new java.lang.Object[] {
        ((java.lang.Object) (T2_4)),
        ((java.lang.Object) (STATE_VARIABLE_Es_6))
      };
    }
//  gate2bel.m:123
  }
//  gate2bel.m:118
  private static java.lang.Object [] conv_chunk_6_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      java.lang.Object wrapper_arg_4 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      gate2bel.Triple2_0 conv1_T2_4 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_6 = null;

      {
        java.lang.Object [] result = gate2bel.conv_triple_6_p_0(((maybe.Maybe_1) ((java.lang.Object[]) closure)[3]), ((java.lang.String) ((java.lang.Object[]) closure)[4]), ((gate2bel.Triple_0) wrapper_arg_1), ((list.List_1) wrapper_arg_3));
        conv1_T2_4 = (gate2bel.Triple2_0) result[0];
        conv0_STATE_VARIABLE_Es_6 = (list.List_1) result[1];
      }
      wrapper_arg_2 = ((java.lang.Object) (conv1_T2_4));
      wrapper_arg_4 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_6));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_2)),
        ((java.lang.Object) (wrapper_arg_4))
      };
    }
  }
//  gate2bel.m:115
  private static java.lang.Object [] conv_chunk_6_p_0(
    maybe.Maybe_1 WN_1,
    java.lang.String F_2,
    gate2bel.Chunk_0 HeadVar__3_3,
    list.List_1 STATE_VARIABLE_Es_0_5)
  {
//  gate2bel.m:116
    {
      boolean succeeded = false;
      gate2bel.Chunk2_0 HeadVar__4_4 = null;
      list.List_1 STATE_VARIABLE_Es_6 = null;

      if ((HeadVar__3_3.data_tag == 0))
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_34_34 = null;
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_35_35 = null;
          jmercury.runtime.TypeInfo_Struct TypeInfo_36_36 = null;
          int N_12 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__3_3).F1;
          java.lang.String Txt_13 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__3_3).F2;
          java.lang.String Trn_14 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__3_3).F3;
          java.lang.String Spk_15 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__3_3).F4;
          list.List_1 DA_16 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__3_3).F5;
          list.List_1 Ts0_17 = ((gate2bel.Chunk_0.Chunk_6) HeadVar__3_3).F6;
          list.List_1 Ts_18 = null;
          /* closure */ java.lang.Object[] V_21_21 = null;
//  gate2bel.m:118
          java.lang.Object conv2_STATE_VARIABLE_Es_6 = null;

          {
            V_21_21 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_4[1])), ((java.lang.Object) (new AddrOf3_0(10))), java.lang.Integer.valueOf(2), ((java.lang.Object) (WN_1)), ((java.lang.Object) (F_2))};
          }
          TypeCtorInfo_34_34 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_triple_0);
          TypeCtorInfo_35_35 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_triple2_0);
          TypeInfo_36_36 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[0]);
          {
            java.lang.Object [] result = list.map_foldl_5_p_0(TypeCtorInfo_34_34, TypeCtorInfo_35_35, TypeInfo_36_36, V_21_21, Ts0_17, ((java.lang.Object) (STATE_VARIABLE_Es_0_5)));
            Ts_18 = (list.List_1) result[0];
            conv2_STATE_VARIABLE_Es_6 = (java.lang.Object) result[1];
          }
          STATE_VARIABLE_Es_6 = ((list.List_1) conv2_STATE_VARIABLE_Es_6);
//  gate2bel.m:119
          {
            HeadVar__4_4 = new gate2bel.Chunk2_0.Chunk_6(N_12, Txt_13, Trn_14, Spk_15, DA_16, Ts_18);
          }
//  gate2bel.m:116
        }
      else
//  gate2bel.m:120
        {
          int C_25 = ((gate2bel.Chunk_0.Corefclass_2) HeadVar__3_3).F1;
          java.lang.String S_26 = ((gate2bel.Chunk_0.Corefclass_2) HeadVar__3_3).F2;

          {
            HeadVar__4_4 = new gate2bel.Chunk2_0.Corefclass_2(C_25, S_26);
          }
          STATE_VARIABLE_Es_6 = STATE_VARIABLE_Es_0_5;
        }
//  gate2bel.m:116
return new java.lang.Object[] {
        ((java.lang.Object) (HeadVar__4_4)),
        ((java.lang.Object) (STATE_VARIABLE_Es_6))
      };
    }
//  gate2bel.m:115
  }
//  gate2bel.m:99
  private static java.lang.Object [] read_sents_9_p_0(
    java.lang.String File_10,
    java.lang.String Str_11,
    int Max_12,
    io.Posn_0 STATE_VARIABLE_Pos_0_20,
    list.List_1 STATE_VARIABLE_Ts_0_22,
    list.List_1 STATE_VARIABLE_Es_0_24)
  {
//  gate2bel.m:101
    while (true)
      {
        /* tailcall optimized into a loop */
        {
          boolean succeeded = false;
          io.Posn_0 STATE_VARIABLE_Pos_21 = null;
          list.List_1 STATE_VARIABLE_Ts_23 = null;
          list.List_1 STATE_VARIABLE_Es_25 = null;
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_34_34 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_chunk_0);
          io.Read_result_1 Res_16 = null;
          io.Posn_0 STATE_VARIABLE_Pos_26_26 = null;

//  gate2bel.m:102
          {
            java.lang.Object [] result = io.read_from_string_6_p_0(TypeCtorInfo_34_34, File_10, Str_11, Max_12, STATE_VARIABLE_Pos_0_20);
            Res_16 = (io.Read_result_1) result[0];
            STATE_VARIABLE_Pos_26_26 = (io.Posn_0) result[1];
          }
//  gate2bel.m:104
          switch (Res_16.data_tag) {
            case 0:
//  gate2bel.m:103
              {
                STATE_VARIABLE_Pos_21 = STATE_VARIABLE_Pos_26_26;
                STATE_VARIABLE_Ts_23 = STATE_VARIABLE_Ts_0_22;
                STATE_VARIABLE_Es_25 = STATE_VARIABLE_Es_0_24;
              }
//  gate2bel.m:104
              break;
            case 1:
//  gate2bel.m:106
              {
                gate2bel.Chunk_0 Turn_19 = ((gate2bel.Chunk_0) ((io.Read_result_1.Ok_1) Res_16).F1);
                list.List_1 STATE_VARIABLE_Ts_27_27 = null;

                {
                  STATE_VARIABLE_Ts_27_27 = new list.List_1.F_cons_2(((java.lang.Object) (Turn_19)), STATE_VARIABLE_Ts_0_22);
                }
//  gate2bel.m:107
                /* direct tailcall eliminated */
                {
                  io.Posn_0 STATE_VARIABLE_Pos_0__tmp_copy_20 = STATE_VARIABLE_Pos_26_26;
                  list.List_1 STATE_VARIABLE_Ts_0__tmp_copy_22 = STATE_VARIABLE_Ts_27_27;

                  STATE_VARIABLE_Ts_0_22 = STATE_VARIABLE_Ts_0__tmp_copy_22;
                  STATE_VARIABLE_Pos_0_20 = STATE_VARIABLE_Pos_0__tmp_copy_20;
                }
                continue;
//  gate2bel.m:106
              }
//  gate2bel.m:104
            case 2:
              {
                jmercury.runtime.TypeInfo_Struct TypeCtorInfo_35_35 = null;
                java.lang.String Msg_17 = ((io.Read_result_1.Error_2) Res_16).F1;
                int Line_18 = ((io.Read_result_1.Error_2) Res_16).F2;
                errors.Err_loc_0 V_31_31 = null;
                sberrs.Error_0 V_32_32 = null;

//  gate2bel.m:105
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
//  gate2bel.m:104
              }
              break;
            default: /*NOTREACHED*/
              throw new jmercury.runtime.UnreachableDefault();
          }
//  gate2bel.m:101
return new java.lang.Object[] {
            ((java.lang.Object) (STATE_VARIABLE_Pos_21)),
            ((java.lang.Object) (STATE_VARIABLE_Ts_23)),
            ((java.lang.Object) (STATE_VARIABLE_Es_25))
          };
        }
      }
//  gate2bel.m:99
  }
//  gate2bel.m:72
  public static java.lang.String owl2str_3_p_0(
    tree234.Tree234_2 CM_1,
    gate2bel.Owlstr_0 HeadVar__2_2)
  {
//  gate2bel.m:588
    {
      boolean succeeded = false;
      java.lang.String Str_3 = null;

      if ((HeadVar__2_2.data_tag == 1))
//  gate2bel.m:589
        {
          java.lang.String S_8 = ((gate2bel.Owlstr_0.Cref_3) HeadVar__2_2).F1;
          int C_10 = ((gate2bel.Owlstr_0.Cref_3) HeadVar__2_2).F3;
          gate2bel.Owlstrtp_0 V_9_9 = ((gate2bel.Owlstr_0.Cref_3) HeadVar__2_2).F2;
//  gate2bel.m:590
          java.lang.String CS_12 = null;
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_14_14 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
          java.lang.Object conv0_CS_12 = null;

          {
            java.lang.Object [] result = map.f_84_121_112_101_83_112_101_99_79_102_95_95_112_114_101_100_95_111_114_95_102_117_110_99_95_95_115_101_97_114_99_104_95_95_91_75_32_61_32_105_110_116_93_95_48_95_49_3_p_0(TypeCtorInfo_14_14, CM_1, C_10);
            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
            conv0_CS_12 = (java.lang.Object) result[1];
          }
          if (succeeded)
            {
              CS_12 = ((java.lang.String) conv0_CS_12);
              succeeded = true;
            }
          if (succeeded)
            Str_3 = CS_12;
          else
            Str_3 = S_8;
//  gate2bel.m:589
        }
//  gate2bel.m:588
      else
        {
          gate2bel.Owlstrtp_0 V_6_6 = null;

          Str_3 = ((gate2bel.Owlstr_0.Str_2) HeadVar__2_2).F1;
          V_6_6 = ((gate2bel.Owlstr_0.Str_2) HeadVar__2_2).F2;
        }
      return Str_3;
    }
//  gate2bel.m:72
  }
//  gate2bel.m:70
  public static java.lang.String owl2str_2_p_0(
    gate2bel.Owlstr_0 HeadVar__1_1)
  {
//  gate2bel.m:585
    {
      boolean succeeded = false;
      java.lang.String Str_2 = null;

      if ((HeadVar__1_1.data_tag == 1))
//  gate2bel.m:586
        {
          gate2bel.Owlstrtp_0 V_6_6 = null;
          int V_7_7 = 0;

          Str_2 = ((gate2bel.Owlstr_0.Cref_3) HeadVar__1_1).F1;
          V_6_6 = ((gate2bel.Owlstr_0.Cref_3) HeadVar__1_1).F2;
          V_7_7 = ((gate2bel.Owlstr_0.Cref_3) HeadVar__1_1).F3;
        }
//  gate2bel.m:585
      else
        {
          gate2bel.Owlstrtp_0 V_4_4 = null;

          Str_2 = ((gate2bel.Owlstr_0.Str_2) HeadVar__1_1).F1;
          V_4_4 = ((gate2bel.Owlstr_0.Str_2) HeadVar__1_1).F2;
        }
      return Str_2;
    }
//  gate2bel.m:70
  }
//  gate2bel.m:68
  public static java.lang.Object [] owlprop_6_p_0(
    tree234.Tree234_2 CM_7,
    gate2bel.Owlstr_0 Subj_8,
    bool.Bool_0 Neg_9,
    gate2bel.Owlpr_0 HeadVar__4_4,
    maybe.Maybe_1 HeadVar__5_5)
  {
//  gate2bel.m:600
    {
      boolean succeeded = (HeadVar__5_5.data_tag == 1);
      java.lang.String S_13 = null;
      java.lang.String Pr_10 = ((gate2bel.Owlpr_0) HeadVar__4_4).F1;
      gate2bel.Owlstr_0 Obj_12 = null;
      java.lang.String Sb_14 = null;
      java.lang.String Ob_15 = null;
      java.lang.String Nm_16 = null;
      java.lang.String V_27_27 = null;
      java.lang.String V_28_28 = null;
      java.lang.String V_29_29 = null;
      java.lang.String V_30_30 = null;
      java.lang.String V_31_31 = null;
      java.lang.String V_32_32 = null;
      java.lang.String V_33_33 = null;
      java.lang.String V_34_34 = null;
      java.lang.String V_35_35 = null;
      java.lang.String V_36_36 = null;
      gate2bel.Owlprtp_0 V_11_11 = ((gate2bel.Owlpr_0) HeadVar__4_4).F2;

      if (succeeded)
        {
          Obj_12 = ((gate2bel.Owlstr_0) ((maybe.Maybe_1.Yes_1) HeadVar__5_5).F1);
//  gate2bel.m:601
          {
            Sb_14 = gate2bel.owl2str_3_p_0(CM_7, Subj_8);
          }
          {
            Ob_15 = gate2bel.owl2str_3_p_0(CM_7, Obj_12);
          }
//  gate2bel.m:603
          switch (Neg_9.MR_value) {
            case 0:
//  gate2bel.m:602
              Nm_16 = "ObjectPropertyAssertion";
//  gate2bel.m:603
              break;
            case 1:
              Nm_16 = "NegativeObjectPropertyAssertion";
              break;
            default: /*NOTREACHED*/
              throw new jmercury.runtime.UnreachableDefault();
          }
          V_27_27 = ")";
          {
            V_28_28 = string.f_43_43_2_f_0(Ob_15, V_27_27);
          }
          V_29_29 = " cubism:";
          {
            V_30_30 = string.f_43_43_2_f_0(V_29_29, V_28_28);
          }
          {
            V_31_31 = string.f_43_43_2_f_0(Sb_14, V_30_30);
          }
          V_32_32 = " cubism:";
          {
            V_33_33 = string.f_43_43_2_f_0(V_32_32, V_31_31);
          }
          {
            V_34_34 = string.f_43_43_2_f_0(Pr_10, V_33_33);
          }
          V_35_35 = "(cubism:";
          {
            V_36_36 = string.f_43_43_2_f_0(V_35_35, V_34_34);
          }
          {
            S_13 = string.f_43_43_2_f_0(Nm_16, V_36_36);
          }
          succeeded = true;
//  gate2bel.m:600
        }
return new java.lang.Object[] {
        java.lang.Boolean.valueOf(succeeded),
        ((java.lang.Object) (S_13))
      };
    }
//  gate2bel.m:68
  }
//  gate2bel.m:247
  private static java.lang.Object [] environments_4_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_4)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      java.lang.Object wrapper_arg_5 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      tree234.Tree234_2 conv1_STATE_VARIABLE_Mmap_12 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_14 = null;

      {
        java.lang.Object [] result = gate2bel.file_envs_5_p_0(((beliefs.Belfile_0) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2), ((list.List_1) wrapper_arg_4));
        conv1_STATE_VARIABLE_Mmap_12 = (tree234.Tree234_2) result[0];
        conv0_STATE_VARIABLE_Es_14 = (list.List_1) result[1];
      }
      wrapper_arg_3 = ((java.lang.Object) (conv1_STATE_VARIABLE_Mmap_12));
      wrapper_arg_5 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_14));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_3)),
        ((java.lang.Object) (wrapper_arg_5))
      };
    }
  }
//  gate2bel.m:64
  public static java.lang.Object [] environments_4_p_0(
    list.List_1 Fs_5,
    list.List_1 STATE_VARIABLE_Es_0_9)
  {
//  gate2bel.m:246
    {
      boolean succeeded = false;
      beliefs.Envdata_0 Env_6 = null;
      list.List_1 STATE_VARIABLE_Es_10 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_19_19 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[8]);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_20_20 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_envtriple_0);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_21_21 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_22_22 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_23_23 = null;
      tree234.Tree234_2 Mmap_8 = null;
      /* closure */ java.lang.Object[] V_11_11 = (/* closure */ java.lang.Object[]) gate2bel.MR_scalar_common_6[2];
      tree234.Tree234_2 V_12_12 = null;
//  gate2bel.m:247
      java.lang.Object conv3_Mmap_8 = null;
      java.lang.Object conv2_STATE_VARIABLE_Es_10 = null;

      {
        V_12_12 = multi_map.init_0_f_0(TypeInfo_19_19, TypeCtorInfo_20_20);
      }
      TypeCtorInfo_21_21 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_belfile_0);
      TypeInfo_22_22 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[10]);
      TypeInfo_23_23 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[0]);
      {
        java.lang.Object [] result = list.foldl2_6_p_0(TypeCtorInfo_21_21, TypeInfo_22_22, TypeInfo_23_23, V_11_11, Fs_5, ((java.lang.Object) (V_12_12)), ((java.lang.Object) (STATE_VARIABLE_Es_0_9)));
        conv3_Mmap_8 = (java.lang.Object) result[0];
        conv2_STATE_VARIABLE_Es_10 = (java.lang.Object) result[1];
      }
      Mmap_8 = ((tree234.Tree234_2) conv3_Mmap_8);
      STATE_VARIABLE_Es_10 = ((list.List_1) conv2_STATE_VARIABLE_Es_10);
//  gate2bel.m:248
      {
        Env_6 = new beliefs.Envdata_0(Mmap_8);
      }
//  gate2bel.m:246
return new java.lang.Object[] {
        ((java.lang.Object) (Env_6)),
        ((java.lang.Object) (STATE_VARIABLE_Es_10))
      };
    }
//  gate2bel.m:64
  }
//  gate2bel.m:206
  private static java.lang.Object [] convert5_5_p_0_1(
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
      beliefs.Belstmnt_0 conv2_HeadVar__4_4 = null;
      set_ordlist.Set_ordlist_1 conv1_STATE_VARIABLE_Ppl_6 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_8 = null;

      {
        java.lang.Object [] result = gate2bel.conv_stmnt_8_p_0(((tree234.Tree234_2) ((java.lang.Object[]) closure)[3]), ((java.lang.String) ((java.lang.Object[]) closure)[4]), ((gate2bel.Owlstmnt_0) wrapper_arg_1), ((set_ordlist.Set_ordlist_1) wrapper_arg_3), ((list.List_1) wrapper_arg_5));
        conv2_HeadVar__4_4 = (beliefs.Belstmnt_0) result[0];
        conv1_STATE_VARIABLE_Ppl_6 = (set_ordlist.Set_ordlist_1) result[1];
        conv0_STATE_VARIABLE_Es_8 = (list.List_1) result[2];
      }
      wrapper_arg_2 = ((java.lang.Object) (conv2_HeadVar__4_4));
      wrapper_arg_4 = ((java.lang.Object) (conv1_STATE_VARIABLE_Ppl_6));
      wrapper_arg_6 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_8));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_2)),
        ((java.lang.Object) (wrapper_arg_4)),
        ((java.lang.Object) (wrapper_arg_6))
      };
    }
  }
//  gate2bel.m:61
  public static java.lang.Object [] convert5_5_p_0(
    tree234.Tree234_2 Map_6,
    gate2bel.Owlfile_0 HeadVar__2_2,
    list.List_1 STATE_VARIABLE_Es_0_13)
  {
//  gate2bel.m:205
    {
      boolean succeeded = false;
      beliefs.Belfile_0 HeadVar__3_3 = null;
      list.List_1 STATE_VARIABLE_Es_14 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_24_24 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_25_25 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_26_26 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_27_27 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_28_28 = null;
      java.lang.String Nm_7 = ((gate2bel.Owlfile_0) HeadVar__2_2).F1;
      list.List_1 Ss_8 = ((gate2bel.Owlfile_0) HeadVar__2_2).F2;
      set_ordlist.Set_ordlist_1 Ppl_10 = null;
      list.List_1 Bs_11 = null;
      /* closure */ java.lang.Object[] V_15_15 = null;
      set_ordlist.Set_ordlist_1 V_16_16 = null;
      utils.Corefs_0 V_9_9 = ((gate2bel.Owlfile_0) HeadVar__2_2).F3;
//  gate2bel.m:206
      java.lang.Object conv4_Ppl_10 = null;
      java.lang.Object conv3_STATE_VARIABLE_Es_14 = null;

      {
        V_15_15 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_8[1])), ((java.lang.Object) (new AddrOf4_0(5))), java.lang.Integer.valueOf(2), ((java.lang.Object) (Map_6)), ((java.lang.Object) (Nm_7))};
      }
      TypeCtorInfo_24_24 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
      {
        V_16_16 = set.init_0_f_0(TypeCtorInfo_24_24);
      }
      TypeCtorInfo_25_25 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_owlstmnt_0);
      TypeCtorInfo_26_26 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_belstmnt_0);
      TypeInfo_27_27 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[7]);
      TypeInfo_28_28 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[0]);
      {
        java.lang.Object [] result = list.map_foldl2_7_p_0(TypeCtorInfo_25_25, TypeCtorInfo_26_26, TypeInfo_27_27, TypeInfo_28_28, V_15_15, Ss_8, ((java.lang.Object) (V_16_16)), ((java.lang.Object) (STATE_VARIABLE_Es_0_13)));
        Bs_11 = (list.List_1) result[0];
        conv4_Ppl_10 = (java.lang.Object) result[1];
        conv3_STATE_VARIABLE_Es_14 = (java.lang.Object) result[2];
      }
      Ppl_10 = ((set_ordlist.Set_ordlist_1) conv4_Ppl_10);
      STATE_VARIABLE_Es_14 = ((list.List_1) conv3_STATE_VARIABLE_Es_14);
//  gate2bel.m:205
      {
        HeadVar__3_3 = new beliefs.Belfile_0(Nm_7, Ppl_10, Bs_11);
      }
return new java.lang.Object[] {
        ((java.lang.Object) (HeadVar__3_3)),
        ((java.lang.Object) (STATE_VARIABLE_Es_14))
      };
    }
//  gate2bel.m:61
  }
//  gate2bel.m:377
  private static java.lang.Object convert4_4_p_0_3(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      gate2bel.Vertices_0 conv8_STATE_VARIABLE_Vs_25 = null;

      {
        conv8_STATE_VARIABLE_Vs_25 = gate2bel.tps_4_p_0(((tree234.Tree234_2) ((java.lang.Object[]) closure)[3]), ((java.lang.Integer) wrapper_arg_1).intValue(), ((gate2bel.Vertices_0) wrapper_arg_2));
      }
      wrapper_arg_3 = ((java.lang.Object) (conv8_STATE_VARIABLE_Vs_25));
      return wrapper_arg_3;
    }
  }
//  gate2bel.m:174
  private static java.lang.Object convert4_4_p_0_2(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      list.List_1 conv6_HeadVar__4_41 = null;

      {
        conv6_HeadVar__4_41 = gate2bel.IntroducedFrom__pred__convert4__174__1_4_p_0(((tree234.Tree234_2) ((java.lang.Object[]) closure)[3]), ((java.lang.Integer) wrapper_arg_1).intValue(), ((list.List_1) wrapper_arg_2));
      }
      wrapper_arg_3 = ((java.lang.Object) (conv6_HeadVar__4_41));
      return wrapper_arg_3;
    }
  }
//  gate2bel.m:170
  private static java.lang.Object [] convert4_4_p_0_1(
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
      tree234.Tree234_2 conv2_STATE_VARIABLE_CM_22 = null;
      tree234.Tree234_2 conv1_STATE_VARIABLE_LM_24 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_26 = null;

      {
        java.lang.Object [] result = gate2bel.conv_chunks4_8_p_0(((java.lang.String) ((java.lang.Object[]) closure)[3]), ((gate2bel.Chunk3_0) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2), ((tree234.Tree234_2) wrapper_arg_4), ((list.List_1) wrapper_arg_6));
        conv2_STATE_VARIABLE_CM_22 = (tree234.Tree234_2) result[0];
        conv1_STATE_VARIABLE_LM_24 = (tree234.Tree234_2) result[1];
        conv0_STATE_VARIABLE_Es_26 = (list.List_1) result[2];
      }
      wrapper_arg_3 = ((java.lang.Object) (conv2_STATE_VARIABLE_CM_22));
      wrapper_arg_5 = ((java.lang.Object) (conv1_STATE_VARIABLE_LM_24));
      wrapper_arg_7 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_26));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_3)),
        ((java.lang.Object) (wrapper_arg_5)),
        ((java.lang.Object) (wrapper_arg_7))
      };
    }
  }
//  gate2bel.m:58
  public static java.lang.Object [] convert4_4_p_0(
    gate2bel.Tnfile3_0 HeadVar__1_1,
    list.List_1 STATE_VARIABLE_Es_0_26)
  {
//  gate2bel.m:169
    {
      boolean succeeded = false;
      gate2bel.Owlfile_0 HeadVar__2_2 = null;
      list.List_1 STATE_VARIABLE_Es_27 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_63_63 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_64_64 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_65_65 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_66_66 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_67_67 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_68_68 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_69_69 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_70_70 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_74_74 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_75_75 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_19_91 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_23_95 = null;
      java.lang.String Nm_5 = ((gate2bel.Tnfile3_0) HeadVar__1_1).F1;
      list.List_1 C3s_6 = ((gate2bel.Tnfile3_0) HeadVar__1_1).F2;
      utils.Corefs_0 Cmap_7 = ((gate2bel.Tnfile3_0) HeadVar__1_1).F3;
      list.List_1 AllStmnts_8 = null;
      tree234.Tree234_2 CM_10 = null;
      tree234.Tree234_2 LM_11 = null;
      list.List_1 Ks_12 = null;
      list.List_1 Vs_13 = null;
      list.List_1 Xs_14 = null;
      list.List_1 Cs_15 = null;
      list.List_1 SingleStmnts_23 = null;
      list.List_1 Sorted_24 = null;
      list.List_1 RevCmpndStmnts_25 = null;
      /* closure */ java.lang.Object[] V_28_28 = null;
      tree234.Tree234_2 V_29_29 = null;
      tree234.Tree234_2 V_30_30 = null;
      list.List_1 STATE_VARIABLE_Es_31_31 = null;
      list.List_1 V_32_32 = null;
      set_ordlist.Set_ordlist_1 V_33_33 = null;
      set_ordlist.Set_ordlist_1 V_34_34 = null;
      list.List_1 V_35_35 = null;
      set_ordlist.Set_ordlist_1 V_36_36 = null;
      /* closure */ java.lang.Object[] V_37_37 = null;
      list.List_1 V_38_38 = null;
      list.List_1 V_47_47 = null;
      list.List_1 V_49_49 = null;
      gate2bel.Vertices_0 Vertices0_79 = null;
      gate2bel.Vertices_0 Vertices_80 = null;
      list.List_1 X_83 = null;
      list.List_1 Xs_84 = null;
      set_ordlist.Set_ordlist_1 V_85_85 = null;
      set_ordlist.Set_ordlist_1 V_86_86 = null;
      list.List_1 V_87_87 = null;
      list.List_1 V_88_88 = null;
      /* closure */ java.lang.Object[] V_89_89 = null;
      list.List_1 V_90_90 = null;
//  gate2bel.m:170
      java.lang.Object conv5_CM_10 = null;
      java.lang.Object conv4_LM_11 = null;
      java.lang.Object conv3_STATE_VARIABLE_Es_31_31 = null;
//  gate2bel.m:174
      java.lang.Object conv7_SingleStmnts_23 = null;
//  gate2bel.m:377
      java.lang.Object conv9_Vertices_80 = null;
//  gate2bel.m:378
      set_ordlist.Set_ordlist_1 V_81_81 = null;
      set_ordlist.Set_ordlist_1 V_82_82 = null;

//  gate2bel.m:170
      {
        V_28_28 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_8[0])), ((java.lang.Object) (new AddrOf5_0(3))), java.lang.Integer.valueOf(1), ((java.lang.Object) (Nm_5))};
      }
      TypeCtorInfo_63_63 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
      TypeInfo_64_64 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[1]);
      {
        V_29_29 = map.init_0_f_0(TypeCtorInfo_63_63, TypeInfo_64_64);
      }
      TypeInfo_65_65 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[2]);
      {
        V_30_30 = multi_map.init_0_f_0(TypeCtorInfo_63_63, TypeInfo_65_65);
      }
      TypeCtorInfo_66_66 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_chunk3_0);
      TypeInfo_67_67 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[3]);
      TypeInfo_68_68 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[5]);
      TypeInfo_69_69 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[0]);
      {
        java.lang.Object [] result = list.foldl3_8_p_0(TypeCtorInfo_66_66, TypeInfo_67_67, TypeInfo_68_68, TypeInfo_69_69, V_28_28, C3s_6, ((java.lang.Object) (V_29_29)), ((java.lang.Object) (V_30_30)), ((java.lang.Object) (STATE_VARIABLE_Es_0_26)));
        conv5_CM_10 = (java.lang.Object) result[0];
        conv4_LM_11 = (java.lang.Object) result[1];
        conv3_STATE_VARIABLE_Es_31_31 = (java.lang.Object) result[2];
      }
      CM_10 = ((tree234.Tree234_2) conv5_CM_10);
      LM_11 = ((tree234.Tree234_2) conv4_LM_11);
      STATE_VARIABLE_Es_31_31 = ((list.List_1) conv3_STATE_VARIABLE_Es_31_31);
//  gate2bel.m:171
      {
        Ks_12 = multi_map.keys_2_p_0(TypeCtorInfo_63_63, TypeInfo_65_65, LM_11);
      }
      {
        V_32_32 = multi_map.values_1_f_0(TypeCtorInfo_63_63, TypeInfo_65_65, LM_11);
      }
      TypeCtorInfo_70_70 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_lndata_0);
      {
        Vs_13 = assoc_list.values_2_p_0(TypeCtorInfo_70_70, TypeCtorInfo_63_63, V_32_32);
      }
//  gate2bel.m:172
      {
        Xs_14 = list.append_3_p_1(TypeCtorInfo_63_63, Ks_12, Vs_13);
      }
//  gate2bel.m:173
      {
        V_35_35 = map.keys_1_f_0(TypeCtorInfo_63_63, TypeInfo_64_64, CM_10);
      }
      {
        V_34_34 = set.set_1_f_0(TypeCtorInfo_63_63, V_35_35);
      }
      {
        V_36_36 = set.set_1_f_0(TypeCtorInfo_63_63, Xs_14);
      }
      {
        V_33_33 = set.difference_2_f_0(TypeCtorInfo_63_63, V_34_34, V_36_36);
      }
      {
        Cs_15 = set.to_sorted_list_2_p_0(TypeCtorInfo_63_63, V_33_33);
      }
//  gate2bel.m:174
      {
        V_37_37 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_9[0])), ((java.lang.Object) (new AddrOf3_0(11))), java.lang.Integer.valueOf(1), ((java.lang.Object) (CM_10))};
      }
      V_38_38 = (list.List_1) gate2bel.MR_scalar_common_3[0];
      TypeInfo_74_74 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[6]);
      {
        conv7_SingleStmnts_23 = list.foldl_4_p_0(TypeCtorInfo_63_63, TypeInfo_74_74, V_37_37, Cs_15, ((java.lang.Object) (V_38_38)));
      }
      SingleStmnts_23 = ((list.List_1) conv7_SingleStmnts_23);
      TypeCtorInfo_19_91 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
//  gate2bel.m:376
      {
        V_85_85 = set.set_1_f_0(TypeCtorInfo_19_91, Xs_14);
      }
      {
        V_86_86 = set.init_0_f_0(TypeCtorInfo_19_91);
      }
      V_87_87 = (list.List_1) gate2bel.MR_scalar_common_3[0];
      V_88_88 = (list.List_1) gate2bel.MR_scalar_common_3[0];
      {
        Vertices0_79 = new gate2bel.Vertices_0(V_85_85, V_86_86, V_87_87, V_88_88);
      }
//  gate2bel.m:377
      {
        V_89_89 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_9[1])), ((java.lang.Object) (new AddrOf3_0(12))), java.lang.Integer.valueOf(1), ((java.lang.Object) (LM_11))};
      }
      TypeCtorInfo_23_95 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_vertices_0);
      {
        conv9_Vertices_80 = list.foldl_4_p_0(TypeCtorInfo_19_91, TypeCtorInfo_23_95, V_89_89, Xs_14, ((java.lang.Object) (Vertices0_79)));
      }
      Vertices_80 = ((gate2bel.Vertices_0) conv9_Vertices_80);
//  gate2bel.m:378
      V_81_81 = ((gate2bel.Vertices_0) Vertices_80).F1;
      V_82_82 = ((gate2bel.Vertices_0) Vertices_80).F2;
      X_83 = ((gate2bel.Vertices_0) Vertices_80).F3;
      Xs_84 = ((gate2bel.Vertices_0) Vertices_80).F4;
      {
        V_90_90 = new list.List_1.F_cons_2(((java.lang.Object) (X_83)), Xs_84);
      }
      {
        Sorted_24 = list.condense_2_p_0(TypeCtorInfo_19_91, V_90_90);
      }
//  gate2bel.m:179
      V_47_47 = (list.List_1) gate2bel.MR_scalar_common_3[0];
      {
        java.lang.Object [] result = gate2bel.conv_embedded_8_p_0(Nm_5, Sorted_24, CM_10, LM_11, V_47_47, STATE_VARIABLE_Es_31_31);
        RevCmpndStmnts_25 = (list.List_1) result[0];
        STATE_VARIABLE_Es_27 = (list.List_1) result[1];
      }
      TypeCtorInfo_75_75 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_owlstmnt_0);
//  gate2bel.m:180
      {
        V_49_49 = list.reverse_1_f_0(TypeCtorInfo_75_75, RevCmpndStmnts_25);
      }
      {
        AllStmnts_8 = list.append_3_p_1(TypeCtorInfo_75_75, SingleStmnts_23, V_49_49);
      }
//  gate2bel.m:169
      {
        HeadVar__2_2 = new gate2bel.Owlfile_0(Nm_5, AllStmnts_8, Cmap_7);
      }
return new java.lang.Object[] {
        ((java.lang.Object) (HeadVar__2_2)),
        ((java.lang.Object) (STATE_VARIABLE_Es_27))
      };
    }
//  gate2bel.m:58
  }
//  gate2bel.m:517
  private static java.lang.Object [] convert3_5_p_0_2(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_4)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      java.lang.Object wrapper_arg_5 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      tree234.Tree234_2 conv3_STATE_VARIABLE_Mmap_22 = null;
      list.List_1 conv2_STATE_VARIABLE_Set_24 = null;

      {
        java.lang.Object [] result = gate2bel.word_corefs_5_p_0(((pair.Pair_2) wrapper_arg_1), ((tree234.Tree234_2) wrapper_arg_2), ((list.List_1) wrapper_arg_4));
        conv3_STATE_VARIABLE_Mmap_22 = (tree234.Tree234_2) result[0];
        conv2_STATE_VARIABLE_Set_24 = (list.List_1) result[1];
      }
      wrapper_arg_3 = ((java.lang.Object) (conv3_STATE_VARIABLE_Mmap_22));
      wrapper_arg_5 = ((java.lang.Object) (conv2_STATE_VARIABLE_Set_24));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_3)),
        ((java.lang.Object) (wrapper_arg_5))
      };
    }
  }
//  gate2bel.m:514
  private static java.lang.Object convert3_5_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      gate2bel.Cmaps_0 conv0_CM_3 = null;

      {
        conv0_CM_3 = gate2bel.chunk_coref_3_p_0(((gate2bel.Chunk2_0) wrapper_arg_1), ((gate2bel.Cmaps_0) wrapper_arg_2));
      }
      wrapper_arg_3 = ((java.lang.Object) (conv0_CM_3));
      return wrapper_arg_3;
    }
  }
//  gate2bel.m:55
  public static java.lang.Object [] convert3_5_p_0(
    maybe.Maybe_1 MWN_6,
    gate2bel.Tnfile2_0 HeadVar__2_2,
    list.List_1 STATE_VARIABLE_Es_0_13)
  {
//  gate2bel.m:131
    {
      boolean succeeded = false;
      gate2bel.Tnfile3_0 HeadVar__3_3 = null;
      list.List_1 STATE_VARIABLE_Es_14 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_17_17 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_21_35 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_22_36 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
      jmercury.runtime.TypeInfo_Struct TypeInfo_23_37 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_27_41 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_28_42 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_34_48 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_35_49 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_36_50 = null;
      java.lang.String Nm_7 = ((gate2bel.Tnfile2_0) HeadVar__2_2).F1;
      list.List_1 C2s_8 = ((gate2bel.Tnfile2_0) HeadVar__2_2).F2;
      list.List_1 C3s_9 = null;
      utils.Corefs_0 Cf_10 = null;
      list.List_1 RvCs_12 = null;
      list.List_1 V_15_15 = null;
      gate2bel.Cmaps_0 CM0_21 = null;
      gate2bel.Cmaps_0 CM_22 = null;
      tree234.Tree234_2 Cmap_23 = null;
      tree234.Tree234_2 Wmap_24 = null;
      list.List_1 Ps_25 = null;
      tree234.Tree234_2 Mmap_26 = null;
      list.List_1 Gs_27 = null;
      tree234.Tree234_2 V_28_28 = null;
      tree234.Tree234_2 V_29_29 = null;
      /* closure */ java.lang.Object[] V_30_30 = null;
      /* closure */ java.lang.Object[] V_31_31 = null;
      tree234.Tree234_2 V_32_32 = null;
      list.List_1 V_33_33 = null;
      list.List_1 V_34_34 = null;
//  gate2bel.m:514
      java.lang.Object conv1_CM_22 = null;
//  gate2bel.m:517
      java.lang.Object conv5_Mmap_26 = null;
      java.lang.Object conv4_Gs_27 = null;

//  gate2bel.m:513
      {
        V_28_28 = map.init_0_f_0(TypeCtorInfo_21_35, TypeCtorInfo_22_36);
      }
      TypeInfo_23_37 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[17]);
      {
        V_29_29 = multi_map.init_0_f_0(TypeCtorInfo_21_35, TypeInfo_23_37);
      }
      {
        CM0_21 = new gate2bel.Cmaps_0(V_28_28, V_29_29);
      }
//  gate2bel.m:514
      V_30_30 = (/* closure */ java.lang.Object[]) gate2bel.MR_scalar_common_6[0];
      TypeCtorInfo_27_41 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_chunk2_0);
      TypeCtorInfo_28_42 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_cmaps_0);
      {
        conv1_CM_22 = list.foldl_4_p_0(TypeCtorInfo_27_41, TypeCtorInfo_28_42, V_30_30, C2s_8, ((java.lang.Object) (CM0_21)));
      }
      CM_22 = ((gate2bel.Cmaps_0) conv1_CM_22);
//  gate2bel.m:515
      Cmap_23 = ((gate2bel.Cmaps_0) CM_22).F1;
      Wmap_24 = ((gate2bel.Cmaps_0) CM_22).F2;
//  gate2bel.m:516
      {
        Ps_25 = multi_map.to_assoc_list_2_p_0(TypeCtorInfo_21_35, TypeInfo_23_37, Wmap_24);
      }
//  gate2bel.m:517
      V_31_31 = (/* closure */ java.lang.Object[]) gate2bel.MR_scalar_common_6[1];
      {
        V_32_32 = multi_map.init_0_f_0(TypeCtorInfo_21_35, TypeCtorInfo_22_36);
      }
      V_33_33 = (list.List_1) gate2bel.MR_scalar_common_3[0];
      TypeInfo_34_48 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[19]);
      TypeInfo_35_49 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[21]);
      TypeInfo_36_50 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[15]);
      {
        java.lang.Object [] result = list.foldl2_6_p_0(TypeInfo_34_48, TypeInfo_35_49, TypeInfo_36_50, V_31_31, Ps_25, ((java.lang.Object) (V_32_32)), ((java.lang.Object) (V_33_33)));
        conv5_Mmap_26 = (java.lang.Object) result[0];
        conv4_Gs_27 = (java.lang.Object) result[1];
      }
      Mmap_26 = ((tree234.Tree234_2) conv5_Mmap_26);
      Gs_27 = ((list.List_1) conv4_Gs_27);
//  gate2bel.m:518
      {
        V_34_34 = map.keys_1_f_0(TypeCtorInfo_21_35, TypeCtorInfo_22_36, Cmap_23);
      }
      {
        Cf_10 = utils.collect_corefs_5_p_0(V_34_34, Mmap_26, Gs_27, MWN_6);
      }
//  gate2bel.m:132
      V_15_15 = (list.List_1) gate2bel.MR_scalar_common_3[0];
      {
        java.lang.Object [] result = gate2bel.conv_chunks_7_p_0(C2s_8, Nm_7, Cf_10, V_15_15, STATE_VARIABLE_Es_0_13);
        RvCs_12 = (list.List_1) result[0];
        STATE_VARIABLE_Es_14 = (list.List_1) result[1];
      }
      TypeCtorInfo_17_17 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_chunk3_0);
      {
        C3s_9 = list.reverse_2_p_0(TypeCtorInfo_17_17, RvCs_12);
      }
//  gate2bel.m:131
      {
        HeadVar__3_3 = new gate2bel.Tnfile3_0(Nm_7, C3s_9, Cf_10);
      }
return new java.lang.Object[] {
        ((java.lang.Object) (HeadVar__3_3)),
        ((java.lang.Object) (STATE_VARIABLE_Es_14))
      };
    }
//  gate2bel.m:55
  }
//  gate2bel.m:111
  private static java.lang.Object [] convert2_5_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      java.lang.Object wrapper_arg_4 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      gate2bel.Chunk2_0 conv1_HeadVar__4_4 = null;
      list.List_1 conv0_STATE_VARIABLE_Es_6 = null;

      {
        java.lang.Object [] result = gate2bel.conv_chunk_6_p_0(((maybe.Maybe_1) ((java.lang.Object[]) closure)[3]), ((java.lang.String) ((java.lang.Object[]) closure)[4]), ((gate2bel.Chunk_0) wrapper_arg_1), ((list.List_1) wrapper_arg_3));
        conv1_HeadVar__4_4 = (gate2bel.Chunk2_0) result[0];
        conv0_STATE_VARIABLE_Es_6 = (list.List_1) result[1];
      }
      wrapper_arg_2 = ((java.lang.Object) (conv1_HeadVar__4_4));
      wrapper_arg_4 = ((java.lang.Object) (conv0_STATE_VARIABLE_Es_6));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_2)),
        ((java.lang.Object) (wrapper_arg_4))
      };
    }
  }
//  gate2bel.m:52
  public static java.lang.Object [] convert2_5_p_0(
    maybe.Maybe_1 WN_6,
    gate2bel.Tnfile_0 Tfile_7,
    list.List_1 STATE_VARIABLE_Es_0_13)
  {
//  gate2bel.m:109
    {
      boolean succeeded = false;
      gate2bel.Tnfile2_0 Tfile2_8 = null;
      list.List_1 STATE_VARIABLE_Es_14 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_21_21 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_22_22 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_23_23 = null;
      java.lang.String Filename_10 = ((gate2bel.Tnfile_0) Tfile_7).F1;
      list.List_1 Cs0_11 = ((gate2bel.Tnfile_0) Tfile_7).F2;
      list.List_1 Cs_12 = null;
      /* closure */ java.lang.Object[] V_15_15 = null;
//  gate2bel.m:111
      java.lang.Object conv2_STATE_VARIABLE_Es_14 = null;

      {
        V_15_15 = new /* closure */ java.lang.Object[] {((java.lang.Object) (gate2bel.MR_scalar_common_4[0])), ((java.lang.Object) (new AddrOf3_0(13))), java.lang.Integer.valueOf(2), ((java.lang.Object) (WN_6)), ((java.lang.Object) (Filename_10))};
      }
      TypeCtorInfo_21_21 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_chunk_0);
      TypeCtorInfo_22_22 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_chunk2_0);
      TypeInfo_23_23 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.MR_scalar_common_1[0]);
      {
        java.lang.Object [] result = list.map_foldl_5_p_0(TypeCtorInfo_21_21, TypeCtorInfo_22_22, TypeInfo_23_23, V_15_15, Cs0_11, ((java.lang.Object) (STATE_VARIABLE_Es_0_13)));
        Cs_12 = (list.List_1) result[0];
        conv2_STATE_VARIABLE_Es_14 = (java.lang.Object) result[1];
      }
      STATE_VARIABLE_Es_14 = ((list.List_1) conv2_STATE_VARIABLE_Es_14);
//  gate2bel.m:112
      {
        Tfile2_8 = new gate2bel.Tnfile2_0(Filename_10, Cs_12);
      }
//  gate2bel.m:109
return new java.lang.Object[] {
        ((java.lang.Object) (Tfile2_8)),
        ((java.lang.Object) (STATE_VARIABLE_Es_14))
      };
    }
//  gate2bel.m:52
  }
//  gate2bel.m:49
  public static java.lang.Object [] convert_5_p_0(
    java.lang.String Filename_6,
    java.lang.String DocStr_7,
    list.List_1 STATE_VARIABLE_Es_0_13)
  {
//  gate2bel.m:92
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
//  gate2bel.m:94
      io.Posn_0 V_11_11 = null;

//  gate2bel.m:93
      {
        Max_10 = string.length_2_p_0(DocStr_7);
      }
//  gate2bel.m:94
      V_18_18 = 0;
      V_19_19 = 0;
      V_20_20 = 0;
      V_15_15 = (io.Posn_0) gate2bel.MR_scalar_common_2[0];
      V_16_16 = (list.List_1) gate2bel.MR_scalar_common_3[0];
      {
        java.lang.Object [] result = gate2bel.read_sents_9_p_0(Filename_6, DocStr_7, Max_10, V_15_15, V_16_16, STATE_VARIABLE_Es_0_13);
        V_11_11 = (io.Posn_0) result[0];
        RevSents_12 = (list.List_1) result[1];
        STATE_VARIABLE_Es_14 = (list.List_1) result[2];
      }
      TypeCtorInfo_21_21 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_chunk_0);
//  gate2bel.m:95
      {
        Sents_8 = list.reverse_2_p_0(TypeCtorInfo_21_21, RevSents_12);
      }
//  gate2bel.m:92
return new java.lang.Object[] {
        ((java.lang.Object) (Sents_8)),
        ((java.lang.Object) (STATE_VARIABLE_Es_14))
      };
    }
//  gate2bel.m:49
  }

// ExportDefns

// ExportedEnums

// InitPreds

// FinalPreds

// EnvVarNames
  static {
    if (System.getenv("MERCURY_DEBUG_CLASS_INIT") != null) {
      System.out.println("[gate2bel end init]");
    }
  }
}
// :- end_module gate2bel.
