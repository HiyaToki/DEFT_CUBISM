//
//
// Automatically generated from sbconv.m by the Mercury Compiler,
// version 14.01.1, configured for x86_64-unknown-linux-gnu
//
//

/* :- module sbconv. */

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
// import gate2bel;
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
// import stanford2bel;
// import stream;
// import string;
// import syntax2bel;
// import term;
// import time;
// import tree234;
// import trips2bel;
// import type_desc;
// import univ;
// import utils;
// import wordnet;
// import xml;
// MER_FOREIGN_BEGIN sbconv.m:24
import us.ihmc.cubism.nlp.Ingestor;
   import us.ihmc.cubism.nlp.Resolver;
   import us.ihmc.cubism.nlp.ViewPoint;
   import java.util.Properties;
   import javax.naming.Context;
   import javax.naming.InitialContext;
   import javax.naming.NamingException;
// MER_FOREIGN_END sbconv.m:31

// MER_FOREIGN_BEGIN sbconv.m:33
import java.util.List;
   import java.util.ArrayList;
// MER_FOREIGN_END sbconv.m:35
public class sbconv {
  static {
    if (System.getenv("MERCURY_DEBUG_CLASS_INIT") != null) {
      System.out.println("[sbconv start init]");
    }
  }
// MER_FOREIGN_BEGIN sbconv.m:44
static java.lang.Object sbconv__mutable_variable_wndstore;

// MER_FOREIGN_END sbconv.m:46

// RttiDefns
  private static final jmercury.runtime.TypeInfo_Struct maybe__pti_maybe_1__plain_wordnet__type_ctor_info_wndata_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct errors__ti_message_1sberrs__type_ctor_info_error_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_string_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_builtin__type_ctor_info_string_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct list__ti_list_1sbconv__type_ctor_info_viewpoint_0 = new jmercury.runtime.TypeInfo_Struct();
  private static final jmercury.runtime.TypeInfo_Struct maybe__pti_maybe_1__plain_list__ti_list_1sbconv__type_ctor_info_viewpoint_0 = new jmercury.runtime.TypeInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct sbconv__type_ctor_info_ingestor_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct sbconv__type_ctor_info_resolver_0 = new jmercury.runtime.TypeCtorInfo_Struct();
  public static final jmercury.runtime.TypeCtorInfo_Struct sbconv__type_ctor_info_viewpoint_0 = new jmercury.runtime.TypeCtorInfo_Struct();
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
		jmercury.runtime.TypeInfo_Struct.maybe_new(sbconv.errors__ti_message_1sberrs__type_ctor_info_error_0)});
    //
    //
    list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) sbconv.pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0});
    //
    //
    //
    //
    tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_string_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_int_0,
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0});
    //
    //
    tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_builtin__type_ctor_info_string_0.init(tree234.tree234__type_ctor_info_tree234_2,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) trips2bel.trips2bel__type_ctor_info_cvar_0,
		(jmercury.runtime.PseudoTypeInfo) builtin.builtin__type_ctor_info_string_0});
    //
    //
    list__ti_list_1sbconv__type_ctor_info_viewpoint_0.init(list.list__type_ctor_info_list_1,
		new /* XXX init_array */ Object[] {
		jmercury.runtime.TypeInfo_Struct.maybe_new(sbconv.sbconv__type_ctor_info_viewpoint_0)});
    //
    maybe__pti_maybe_1__plain_list__ti_list_1sbconv__type_ctor_info_viewpoint_0.init(maybe.maybe__type_ctor_info_maybe_1,
		new /* XXX init_array */ Object[] {
		(jmercury.runtime.PseudoTypeInfo) sbconv.list__ti_list_1sbconv__type_ctor_info_viewpoint_0});
    //
    sbconv__type_ctor_info_ingestor_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_FOREIGN,
		((java.lang.Object) (new AddrOf2_0(0))),
		((java.lang.Object) (new AddrOf2_0(1))),
		"sbconv",
		"ingestor",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout(null),
		-1,
		0,
		null);
    //
    sbconv__type_ctor_info_resolver_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_FOREIGN,
		((java.lang.Object) (new AddrOf2_0(2))),
		((java.lang.Object) (new AddrOf2_0(3))),
		"sbconv",
		"resolver",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout(null),
		-1,
		0,
		null);
    //
    sbconv__type_ctor_info_viewpoint_0.init(0,
		15,
		-1,
		private_builtin.MR_TYPECTOR_REP_FOREIGN,
		((java.lang.Object) (new AddrOf2_0(4))),
		((java.lang.Object) (new AddrOf2_0(5))),
		"sbconv",
		"viewpoint",
		new jmercury.runtime.TypeFunctors(null),
		new jmercury.runtime.TypeLayout(null),
		-1,
		0,
		null);
  }

// DataDefns
  static {
  }

// Scalar common data
  private static final jmercury.runtime.TypeInfo_Struct[] MR_scalar_common_1 = new jmercury.runtime.TypeInfo_Struct[2];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_2 = new /* generic_type */ java.lang.Object[5][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_3 = new /* generic_type */ java.lang.Object[4][];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_4 = new /* generic_type */ java.lang.Object[1][];
  private static final maybe.Maybe_1.No_0[] MR_scalar_common_5 = new maybe.Maybe_1.No_0[1];
  private static final /* generic_type */ java.lang.Object[][] MR_scalar_common_6 = new /* generic_type */ java.lang.Object[1][];
  private static void MR_init_scalars_0() {
    MR_scalar_common_1[0] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(errors.errors__type_ctor_info_messages_1))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0))));
    MR_scalar_common_1[1] = new jmercury.runtime.TypeInfo_Struct(((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(tree234.tree234__type_ctor_info_tree234_2))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0))),
		((java.lang.Object) (jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0))));
    MR_scalar_common_2[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(5),
		((java.lang.Object) (sbconv.maybe__pti_maybe_1__plain_wordnet__type_ctor_info_wndata_0)),
		((java.lang.Object) (stanford2bel.stanford2bel__type_ctor_info_stfile_0)),
		((java.lang.Object) (stanford2bel.stanford2bel__type_ctor_info_stfile2_0)),
		((java.lang.Object) (sbconv.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (sbconv.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_2[1] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(5),
		((java.lang.Object) (sbconv.sbconv__type_ctor_info_ingestor_0)),
		((java.lang.Object) (sbconv.sbconv__type_ctor_info_resolver_0)),
		((java.lang.Object) (stanford2bel.stanford2bel__type_ctor_info_stprops_0)),
		((java.lang.Object) (io.io__type_ctor_info_state_0)),
		((java.lang.Object) (io.io__type_ctor_info_state_0))};
    MR_scalar_common_2[2] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(5),
		((java.lang.Object) (sbconv.sbconv__type_ctor_info_ingestor_0)),
		((java.lang.Object) (sbconv.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_owlstmnt_0)),
		((java.lang.Object) (io.io__type_ctor_info_state_0)),
		((java.lang.Object) (io.io__type_ctor_info_state_0))};
    MR_scalar_common_2[3] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(5),
		((java.lang.Object) (sbconv.sbconv__type_ctor_info_ingestor_0)),
		((java.lang.Object) (sbconv.tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_builtin__type_ctor_info_string_0)),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_turn3_0)),
		((java.lang.Object) (io.io__type_ctor_info_state_0)),
		((java.lang.Object) (io.io__type_ctor_info_state_0))};
    MR_scalar_common_2[4] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(5),
		((java.lang.Object) (sbconv.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_string_0)),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_lndata_0)),
		((java.lang.Object) (sbconv.sbconv__type_ctor_info_viewpoint_0)),
		((java.lang.Object) (io.io__type_ctor_info_state_0)),
		((java.lang.Object) (io.io__type_ctor_info_state_0))};
    MR_scalar_common_3[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(6),
		((java.lang.Object) (sbconv.maybe__pti_maybe_1__plain_wordnet__type_ctor_info_wndata_0)),
		((java.lang.Object) (sberrs.sberrs__type_ctor_info_prmode_0)),
		((java.lang.Object) (stanford2bel.stanford2bel__type_ctor_info_stfile2_0)),
		((java.lang.Object) (stanford2bel.stanford2bel__type_ctor_info_stprops_0)),
		((java.lang.Object) (sbconv.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0)),
		((java.lang.Object) (sbconv.list__pti_list_1__plain_pair__ti_pair_2errors__type_ctor_info_err_loc_0errors__ti_message_1sberrs__type_ctor_info_error_0))};
    MR_scalar_common_3[1] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(6),
		((java.lang.Object) (sbconv.sbconv__type_ctor_info_ingestor_0)),
		((java.lang.Object) (sbconv.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_string_0)),
		((java.lang.Object) (sbconv.maybe__pti_maybe_1__plain_list__ti_list_1sbconv__type_ctor_info_viewpoint_0)),
		((java.lang.Object) (gate2bel.gate2bel__type_ctor_info_owltriple_0)),
		((java.lang.Object) (io.io__type_ctor_info_state_0)),
		((java.lang.Object) (io.io__type_ctor_info_state_0))};
    MR_scalar_common_3[2] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(6),
		((java.lang.Object) (sbconv.sbconv__type_ctor_info_ingestor_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (sbconv.tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_builtin__type_ctor_info_string_0)),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_sent3_0)),
		((java.lang.Object) (io.io__type_ctor_info_state_0)),
		((java.lang.Object) (io.io__type_ctor_info_state_0))};
    MR_scalar_common_3[3] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(6),
		((java.lang.Object) (sbconv.sbconv__type_ctor_info_ingestor_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (sbconv.tree234__pti_tree234_2__plain_trips2bel__type_ctor_info_cvar_0__plain_builtin__type_ctor_info_string_0)),
		((java.lang.Object) (trips2bel.trips2bel__type_ctor_info_expr_0)),
		((java.lang.Object) (io.io__type_ctor_info_state_0)),
		((java.lang.Object) (io.io__type_ctor_info_state_0))};
    MR_scalar_common_4[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(7),
		((java.lang.Object) (sbconv.sbconv__type_ctor_info_resolver_0)),
		((java.lang.Object) (builtin.builtin__type_ctor_info_int_0)),
		((java.lang.Object) (utils.utils__type_ctor_info_corefdata_0)),
		((java.lang.Object) (sbconv.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_string_0)),
		((java.lang.Object) (sbconv.tree234__pti_tree234_2__plain_builtin__type_ctor_info_int_0__plain_builtin__type_ctor_info_string_0)),
		((java.lang.Object) (io.io__type_ctor_info_state_0)),
		((java.lang.Object) (io.io__type_ctor_info_state_0))};
    MR_scalar_common_5[0] = new maybe.Maybe_1.No_0();
    MR_scalar_common_6[0] = new /* generic_type */ java.lang.Object[] {
		null,
		((java.lang.Object) (null)),
		java.lang.Integer.valueOf(4),
		((java.lang.Object) (sbconv.sbconv__type_ctor_info_ingestor_0)),
		((java.lang.Object) (stanford2bel.stanford2bel__type_ctor_info_stprop_0)),
		((java.lang.Object) (io.io__type_ctor_info_state_0)),
		((java.lang.Object) (io.io__type_ctor_info_state_0))};
  }
  static {
    MR_init_scalars_0();
  }

// Vector common data

// NonDataDefns
  private static boolean __Unify____ingestor_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = sbconv.__Unify____ingestor_0_0(((us.ihmc.cubism.nlp.Ingestor) wrapper_arg_1), ((us.ihmc.cubism.nlp.Ingestor) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____ingestor_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = sbconv.__Compare____ingestor_0_0(((us.ihmc.cubism.nlp.Ingestor) wrapper_arg_2), ((us.ihmc.cubism.nlp.Ingestor) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____resolver_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = sbconv.__Unify____resolver_0_0(((us.ihmc.cubism.nlp.Resolver) wrapper_arg_1), ((us.ihmc.cubism.nlp.Resolver) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____resolver_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = sbconv.__Compare____resolver_0_0(((us.ihmc.cubism.nlp.Resolver) wrapper_arg_2), ((us.ihmc.cubism.nlp.Resolver) wrapper_arg_3));
      }
      wrapper_arg_1 = ((java.lang.Object) (conv0_HeadVar__1_1));
      return wrapper_arg_1;
    }
  }
  private static boolean __Unify____viewpoint_0_0_10001(
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      boolean succeeded = false;

      {
        succeeded = sbconv.__Unify____viewpoint_0_0(((us.ihmc.cubism.nlp.ViewPoint) wrapper_arg_1), ((us.ihmc.cubism.nlp.ViewPoint) wrapper_arg_2));
      }
      return succeeded;
    }
  }
  private static java.lang.Object __Compare____viewpoint_0_0_10001(
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_1 = null;
      builtin.Comparison_result_0 conv0_HeadVar__1_1 = null;

      {
        conv0_HeadVar__1_1 = sbconv.__Compare____viewpoint_0_0(((us.ihmc.cubism.nlp.ViewPoint) wrapper_arg_2), ((us.ihmc.cubism.nlp.ViewPoint) wrapper_arg_3));
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
              return_value = sbconv.__Unify____ingestor_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 1:
          {
            java.lang.Object return_value = null;

            {
              return_value = sbconv.__Compare____ingestor_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 2:
          {
            boolean return_value = false;

            {
              return_value = sbconv.__Unify____resolver_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 3:
          {
            java.lang.Object return_value = null;

            {
              return_value = sbconv.__Compare____resolver_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return ((java.lang.Object) (return_value));
          }
        case 4:
          {
            boolean return_value = false;

            {
              return_value = sbconv.__Unify____viewpoint_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
            }
            return java.lang.Boolean.valueOf(return_value);
          }
        case 5:
          {
            java.lang.Object return_value = null;

            {
              return_value = sbconv.__Compare____viewpoint_0_0_10001(((java.lang.Object) arg1), ((java.lang.Object) arg2));
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
              return_value = sbconv.t2p_sent_6_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 1:
          {
            java.lang.Object return_value = null;

            {
              return_value = sbconv.t2p_turn_5_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 2:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = sbconv.g2p_stmnt_5_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 3:
          {
            java.lang.Object return_value = null;

            {
              return_value = sbconv.g2p_stmnt_5_p_0_2(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 4:
          {
            java.lang.Object return_value = null;

            {
              return_value = sbconv.stanford2props_5_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 5:
          {
            java.lang.Object return_value = null;

            {
              return_value = sbconv.conv_trips_4_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 6:
          {
            java.lang.Object return_value = null;

            {
              return_value = sbconv.conv_gate_5_p_0_2(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 7:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = sbconv.conv_stanford_6_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 8:
          {
            /* generic_type */ java.lang.Object[] return_value = null;

            {
              return_value = sbconv.conv_stanford_6_p_0_2(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
            }
            return ((java.lang.Object) (return_value));
          }
        case 9:
          {
            java.lang.Object return_value = null;

            {
              return_value = sbconv.conv_stanford_6_p_0_3(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3));
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
          return_value = sbconv.conv_gate_5_p_0_1(((/* generic_type */ java.lang.Object) arg1), ((java.lang.Object) arg2), ((java.lang.Object) arg3), ((java.lang.Object) arg4), ((java.lang.Object) arg5));
        }
        return ((java.lang.Object) (return_value));
      }
    }

  }

//  sbconv.m:110
  private static tree234.Tree234_2 IntroducedFrom__pred__gate2props__110__1_7_p_0(
    us.ihmc.cubism.nlp.Resolver R_7,
    int HeadVar__2_31,
    utils.Corefdata_0 HeadVar__3_32,
    tree234.Tree234_2 HeadVar__4_33)
  {
    {
      boolean succeeded = false;
      tree234.Tree234_2 HeadVar__5_34 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_46_46 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
      list.List_1 Nms_22 = ((utils.Corefdata_0) HeadVar__3_32).F2;
      java.lang.String Id_24 = null;
      list.List_1 V_37_37 = null;
//  sbconv.m:111
      list.List_1 V_21_21 = ((utils.Corefdata_0) HeadVar__3_32).F1;
      int V_23_23 = ((utils.Corefdata_0) HeadVar__3_32).F3;

      {
        V_37_37 = list.sort_and_remove_dups_1_f_0(TypeCtorInfo_46_46, Nms_22);
      }
//  sbconv.m:214
      {
us.ihmc.cubism.nlp.Resolver R;
list.List_1<java.lang.String> Ss;
java.lang.String Id;
java.lang.Object IO0;
java.lang.Object IO;
	R =  R_7;
	Ss =  V_37_37;
	IO0 =  null;
// MER_FOREIGN_BEGIN sbconv.m:214
List<String> names = new ArrayList<String>();
  while (!list.is_empty(Ss)) {
    names.add(list.det_head(Ss));
    Ss = list.det_tail(Ss);
  }
  Id = R.resolveIdentity(names);
  IO = IO0;
// MER_FOREIGN_END sbconv.m:221
//  sbconv.m:214
      Id_24 = Id;
      	}
//  sbconv.m:112
      {
        HeadVar__5_34 = map.f_84_121_112_101_83_112_101_99_79_102_95_95_112_114_101_100_95_95_100_101_116_95_105_110_115_101_114_116_95_95_91_75_32_61_32_105_110_116_93_95_48_95_49_4_p_0(TypeCtorInfo_46_46, HeadVar__2_31, ((java.lang.Object) (Id_24)), HeadVar__4_33);
      }
//  sbconv.m:110
      return HeadVar__5_34;
    }
  }
//  sbconv.m:42
  private static builtin.Comparison_result_0 __Compare____viewpoint_0_0(
    us.ihmc.cubism.nlp.ViewPoint HeadVar__2_2,
    us.ihmc.cubism.nlp.ViewPoint HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object Cast_HeadVar1_4 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object Cast_HeadVar2_5 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.__Compare____c_pointer_0_0(Cast_HeadVar1_4, Cast_HeadVar2_5);
      }
      return HeadVar__1_1;
    }
  }
  private static boolean __Unify____viewpoint_0_0(
    us.ihmc.cubism.nlp.ViewPoint HeadVar__1_1,
    us.ihmc.cubism.nlp.ViewPoint HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object Cast_HeadVar1_3 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object Cast_HeadVar2_4 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      {
        succeeded = builtin.__Unify____c_pointer_0_0(Cast_HeadVar1_3, Cast_HeadVar2_4);
      }
      return succeeded;
    }
  }
//  sbconv.m:41
  private static builtin.Comparison_result_0 __Compare____resolver_0_0(
    us.ihmc.cubism.nlp.Resolver HeadVar__2_2,
    us.ihmc.cubism.nlp.Resolver HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object Cast_HeadVar1_4 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object Cast_HeadVar2_5 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.__Compare____c_pointer_0_0(Cast_HeadVar1_4, Cast_HeadVar2_5);
      }
      return HeadVar__1_1;
    }
  }
  private static boolean __Unify____resolver_0_0(
    us.ihmc.cubism.nlp.Resolver HeadVar__1_1,
    us.ihmc.cubism.nlp.Resolver HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object Cast_HeadVar1_3 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object Cast_HeadVar2_4 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      {
        succeeded = builtin.__Unify____c_pointer_0_0(Cast_HeadVar1_3, Cast_HeadVar2_4);
      }
      return succeeded;
    }
  }
//  sbconv.m:40
  private static builtin.Comparison_result_0 __Compare____ingestor_0_0(
    us.ihmc.cubism.nlp.Ingestor HeadVar__2_2,
    us.ihmc.cubism.nlp.Ingestor HeadVar__3_3)
  {
    {
      boolean succeeded = false;
      builtin.Comparison_result_0 HeadVar__1_1 = null;
      /* c_pointer */ java.lang.Object Cast_HeadVar1_4 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;
      /* c_pointer */ java.lang.Object Cast_HeadVar2_5 = (/* c_pointer */ java.lang.Object) HeadVar__3_3;

      {
        HeadVar__1_1 = builtin.__Compare____c_pointer_0_0(Cast_HeadVar1_4, Cast_HeadVar2_5);
      }
      return HeadVar__1_1;
    }
  }
  private static boolean __Unify____ingestor_0_0(
    us.ihmc.cubism.nlp.Ingestor HeadVar__1_1,
    us.ihmc.cubism.nlp.Ingestor HeadVar__2_2)
  {
    {
      boolean succeeded = false;
      /* c_pointer */ java.lang.Object Cast_HeadVar1_3 = (/* c_pointer */ java.lang.Object) HeadVar__1_1;
      /* c_pointer */ java.lang.Object Cast_HeadVar2_4 = (/* c_pointer */ java.lang.Object) HeadVar__2_2;

      {
        succeeded = builtin.__Unify____c_pointer_0_0(Cast_HeadVar1_3, Cast_HeadVar2_4);
      }
      return succeeded;
    }
  }
//  sbconv.m:210
  private static java.lang.String resolve_5_p_0(
    us.ihmc.cubism.nlp.Resolver R_1,
    list.List_1 Ss_2)
  {
//  sbconv.m:212
    {
      boolean succeeded = false;
      java.lang.String Id_3 = null;

//  sbconv.m:214
      {
us.ihmc.cubism.nlp.Resolver R;
list.List_1<java.lang.String> Ss;
java.lang.String Id;
java.lang.Object IO0;
java.lang.Object IO;
	R =  R_1;
	Ss =  Ss_2;
	IO0 =  null;
// MER_FOREIGN_BEGIN sbconv.m:214
List<String> names = new ArrayList<String>();
  while (!list.is_empty(Ss)) {
    names.add(list.det_head(Ss));
    Ss = list.det_tail(Ss);
  }
  Id = R.resolveIdentity(names);
  IO = IO0;
// MER_FOREIGN_END sbconv.m:221
//  sbconv.m:214
      Id_3 = Id;
      	}
//  sbconv.m:212
      return Id_3;
    }
//  sbconv.m:210
  }
//  sbconv.m:195
  private static void ingest_7_p_0(
    us.ihmc.cubism.nlp.Ingestor I_1,
    int Tn_2,
    int Tk_3,
    list.List_1 Vs_4,
    java.lang.String P_5)
  {
//  sbconv.m:197
    {
      boolean succeeded = false;

//  sbconv.m:199
      {
us.ihmc.cubism.nlp.Ingestor I;
int Tn;
int Tk;
list.List_1<us.ihmc.cubism.nlp.ViewPoint> Vs;
java.lang.String P;
java.lang.Object IO0;
java.lang.Object IO;
	I =  I_1;
	Tn =  Tn_2;
	Tk =  Tk_3;
	Vs =  Vs_4;
	P =  P_5;
	IO0 =  null;
// MER_FOREIGN_BEGIN sbconv.m:199
Integer Turn = Tn;
  Integer Token = Tk;
  List<ViewPoint> Viewpoints = new ArrayList<ViewPoint>();
  while (!list.is_empty(Vs)) {
    Viewpoints.add(list.det_head(Vs));
    Vs = list.det_tail(Vs);
  }
  I.ingestProposition(Turn,Token,P,Viewpoints);
  IO = IO0;
// MER_FOREIGN_END sbconv.m:208
//  sbconv.m:199
      	}
//  sbconv.m:197
    }
//  sbconv.m:195
  }
//  sbconv.m:185
  private static void ingest_6_p_0(
    us.ihmc.cubism.nlp.Ingestor I_1,
    int Tn_2,
    int Tk_3,
    java.lang.String Prop_4)
  {
//  sbconv.m:187
    {
      boolean succeeded = false;

//  sbconv.m:189
      {
us.ihmc.cubism.nlp.Ingestor I;
int Tn;
int Tk;
java.lang.String Prop;
java.lang.Object IO0;
java.lang.Object IO;
	I =  I_1;
	Tn =  Tn_2;
	Tk =  Tk_3;
	Prop =  Prop_4;
	IO0 =  null;
// MER_FOREIGN_BEGIN sbconv.m:189
Integer Turn = Tn;
  Integer Token = Tk;
  I.ingestProposition(Turn,Token,Prop);
  IO = IO0;
// MER_FOREIGN_END sbconv.m:193
//  sbconv.m:189
      	}
//  sbconv.m:187
    }
//  sbconv.m:185
  }
//  sbconv.m:177
  private static us.ihmc.cubism.nlp.ViewPoint make_vp_5_p_0(
    java.lang.String S_1,
    java.lang.String M_2)
  {
//  sbconv.m:179
    {
      boolean succeeded = false;
      us.ihmc.cubism.nlp.ViewPoint VP_3 = null;

//  sbconv.m:181
      {
java.lang.String S;
java.lang.String M;
us.ihmc.cubism.nlp.ViewPoint VP;
java.lang.Object IO0;
java.lang.Object IO;
	S =  S_1;
	M =  M_2;
	IO0 =  null;
// MER_FOREIGN_BEGIN sbconv.m:181
VP = new ViewPoint(S,M);
  IO = IO0;
// MER_FOREIGN_END sbconv.m:183
//  sbconv.m:181
      VP_3 = VP;
      	}
//  sbconv.m:179
      return VP_3;
    }
//  sbconv.m:177
  }
//  sbconv.m:170
  private static us.ihmc.cubism.nlp.ViewPoint viewpoint_5_p_0(
    tree234.Tree234_2 CM_6,
    gate2bel.Lndata_0 HeadVar__2_2)
  {
//  sbconv.m:172
    {
      boolean succeeded = false;
      us.ihmc.cubism.nlp.ViewPoint Viewpoint_11 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_18_18 = null;
      gate2bel.Owlstr_0 Subj_7 = ((gate2bel.Lndata_0) HeadVar__2_2).F1;
      java.lang.String Str_13 = null;
      java.lang.String V_16_16 = null;
      bool.Bool_0 _Neg_8 = ((gate2bel.Lndata_0) HeadVar__2_2).F2;
      gate2bel.Cvalue_0 _Obj_10 = ((gate2bel.Lndata_0) HeadVar__2_2).F4;

//  sbconv.m:173
      {
        Str_13 = gate2bel.owl2str_3_p_0(CM_6, Subj_7);
      }
      TypeCtorInfo_18_18 = jmercury.runtime.TypeInfo_Struct.maybe_new(beliefs.beliefs__type_ctor_info_modality_0);
//  sbconv.m:174
      {
        V_16_16 = string.string_1_f_0(TypeCtorInfo_18_18, ((java.lang.Object) (0)));
      }
//  sbconv.m:181
      {
java.lang.String S;
java.lang.String M;
us.ihmc.cubism.nlp.ViewPoint VP;
java.lang.Object IO0;
java.lang.Object IO;
	S =  Str_13;
	M =  V_16_16;
	IO0 =  null;
// MER_FOREIGN_BEGIN sbconv.m:181
VP = new ViewPoint(S,M);
  IO = IO0;
// MER_FOREIGN_END sbconv.m:183
//  sbconv.m:181
      Viewpoint_11 = VP;
      	}
//  sbconv.m:172
      return Viewpoint_11;
    }
//  sbconv.m:170
  }
//  sbconv.m:157
  private static void t2p_expr_6_p_0(
    us.ihmc.cubism.nlp.Ingestor I_7,
    int N_8,
    tree234.Tree234_2 Vmap_9,
    trips2bel.Expr_0 Expr_10)
  {
//  sbconv.m:161
    {
      boolean succeeded = false;
      java.lang.String Str_12 = null;

//  sbconv.m:159
      {
        java.lang.Object [] result = trips2bel.owlprop_3_p_0(Expr_10, Vmap_9);
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        Str_12 = (java.lang.String) result[1];
      }
//  sbconv.m:161
      if (succeeded)
//  sbconv.m:160
        {
          int V_15_15 = -1;

//  sbconv.m:189
          {
us.ihmc.cubism.nlp.Ingestor I;
int Tn;
int Tk;
java.lang.String Prop;
java.lang.Object IO0;
java.lang.Object IO;
	I =  I_7;
	Tn =  N_8;
	Tk =  V_15_15;
	Prop =  Str_12;
	IO0 =  null;
// MER_FOREIGN_BEGIN sbconv.m:189
Integer Turn = Tn;
  Integer Token = Tk;
  I.ingestProposition(Turn,Token,Prop);
  IO = IO0;
// MER_FOREIGN_END sbconv.m:193
//  sbconv.m:189
          	}
//  sbconv.m:160
        }
//  sbconv.m:161
      else
//  sbconv.m:160
        {
        }
//  sbconv.m:161
    }
//  sbconv.m:157
  }
//  sbconv.m:153
  private static java.lang.Object t2p_sent_6_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;

      {
        sbconv.t2p_expr_6_p_0(((us.ihmc.cubism.nlp.Ingestor) ((java.lang.Object[]) closure)[3]), ((java.lang.Integer) (((java.lang.Object[]) closure)[4])).intValue(), ((tree234.Tree234_2) ((java.lang.Object[]) closure)[5]), ((trips2bel.Expr_0) wrapper_arg_1));
      }
      return wrapper_arg_3;
    }
  }
//  sbconv.m:151
  private static void t2p_sent_6_p_0(
    us.ihmc.cubism.nlp.Ingestor I_7,
    int N_8,
    tree234.Tree234_2 Vmap_9,
    trips2bel.Sent3_0 HeadVar__4_4)
  {
//  sbconv.m:152
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_21_21 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_22_22 = null;
      list.List_1 Exprs_12 = ((trips2bel.Sent3_0) HeadVar__4_4).F3;
      /* closure */ java.lang.Object[] V_16_16 = null;
      list.List_1 V_10_10 = ((trips2bel.Sent3_0) HeadVar__4_4).F1;
      trips2bel.Exptp_0 V_11_11 = ((trips2bel.Sent3_0) HeadVar__4_4).F2;
//  sbconv.m:153
      java.lang.Object conv0_STATE_VARIABLE_IO_15 = null;

      {
        V_16_16 = new /* closure */ java.lang.Object[] {((java.lang.Object) (sbconv.MR_scalar_common_3[3])), ((java.lang.Object) (new AddrOf3_0(0))), java.lang.Integer.valueOf(3), ((java.lang.Object) (I_7)), java.lang.Integer.valueOf(N_8), ((java.lang.Object) (Vmap_9))};
      }
      TypeCtorInfo_21_21 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_expr_0);
      TypeCtorInfo_22_22 = jmercury.runtime.TypeInfo_Struct.maybe_new(io.io__type_ctor_info_state_0);
      {
        conv0_STATE_VARIABLE_IO_15 = list.foldl_4_p_2(TypeCtorInfo_21_21, TypeCtorInfo_22_22, V_16_16, Exprs_12, ((java.lang.Object) (0)));
      }
//  sbconv.m:152
    }
//  sbconv.m:151
  }
//  sbconv.m:147
  private static java.lang.Object t2p_turn_5_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;

      {
        sbconv.t2p_sent_6_p_0(((us.ihmc.cubism.nlp.Ingestor) ((java.lang.Object[]) closure)[3]), ((java.lang.Integer) (((java.lang.Object[]) closure)[4])).intValue(), ((tree234.Tree234_2) ((java.lang.Object[]) closure)[5]), ((trips2bel.Sent3_0) wrapper_arg_1));
      }
      return wrapper_arg_3;
    }
  }
//  sbconv.m:145
  private static void t2p_turn_5_p_0(
    us.ihmc.cubism.nlp.Ingestor I_6,
    tree234.Tree234_2 Vmap_7,
    trips2bel.Turn3_0 HeadVar__3_3)
  {
//  sbconv.m:146
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_19_19 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_20_20 = null;
      int N_8 = ((trips2bel.Turn3_0) HeadVar__3_3).F1;
      list.List_1 Ss_10 = ((trips2bel.Turn3_0) HeadVar__3_3).F3;
      /* closure */ java.lang.Object[] V_14_14 = null;
      java.lang.String V_9_9 = ((trips2bel.Turn3_0) HeadVar__3_3).F2;
//  sbconv.m:147
      java.lang.Object conv0_STATE_VARIABLE_IO_13 = null;

      {
        V_14_14 = new /* closure */ java.lang.Object[] {((java.lang.Object) (sbconv.MR_scalar_common_3[2])), ((java.lang.Object) (new AddrOf3_0(1))), java.lang.Integer.valueOf(3), ((java.lang.Object) (I_6)), java.lang.Integer.valueOf(N_8), ((java.lang.Object) (Vmap_7))};
      }
      TypeCtorInfo_19_19 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_sent3_0);
      TypeCtorInfo_20_20 = jmercury.runtime.TypeInfo_Struct.maybe_new(io.io__type_ctor_info_state_0);
      {
        conv0_STATE_VARIABLE_IO_13 = list.foldl_4_p_2(TypeCtorInfo_19_19, TypeCtorInfo_20_20, V_14_14, Ss_10, ((java.lang.Object) (0)));
      }
//  sbconv.m:146
    }
//  sbconv.m:145
  }
//  sbconv.m:127
  private static void g2p_triple_6_p_0(
    us.ihmc.cubism.nlp.Ingestor I_1,
    tree234.Tree234_2 CM_2,
    maybe.Maybe_1 HeadVar__3_3,
    gate2bel.Owltriple_0 HeadVar__4_4)
  {
//  sbconv.m:129
    {
      boolean succeeded = false;
      maybe.Maybe_1 V_36_36 = ((gate2bel.Owltriple_0) HeadVar__4_4).F6;
      gate2bel.Owlpr_0 V_37_37 = ((gate2bel.Owltriple_0) HeadVar__4_4).F5;
      bool.Bool_0 V_38_38 = ((gate2bel.Owltriple_0) HeadVar__4_4).F4;
      gate2bel.Owlstr_0 V_39_39 = ((gate2bel.Owltriple_0) HeadVar__4_4).F3;
      int V_41_41 = ((gate2bel.Owltriple_0) HeadVar__4_4).F1;
      java.lang.String V_40_40 = ((gate2bel.Owltriple_0) HeadVar__4_4).F2;

      if ((HeadVar__3_3.data_tag == 0))
//  sbconv.m:132
        {
          java.lang.String Str_16 = null;

//  sbconv.m:130
          {
            java.lang.Object [] result = gate2bel.owlprop_6_p_0(CM_2, V_39_39, V_38_38, V_37_37, V_36_36);
            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
            Str_16 = (java.lang.String) result[1];
          }
//  sbconv.m:132
          if (succeeded)
//  sbconv.m:131
            {
              int V_19_19 = -1;

//  sbconv.m:189
              {
us.ihmc.cubism.nlp.Ingestor I;
int Tn;
int Tk;
java.lang.String Prop;
java.lang.Object IO0;
java.lang.Object IO;
	I =  I_1;
	Tn =  V_41_41;
	Tk =  V_19_19;
	Prop =  Str_16;
	IO0 =  null;
// MER_FOREIGN_BEGIN sbconv.m:189
Integer Turn = Tn;
  Integer Token = Tk;
  I.ingestProposition(Turn,Token,Prop);
  IO = IO0;
// MER_FOREIGN_END sbconv.m:193
//  sbconv.m:189
              	}
//  sbconv.m:131
            }
//  sbconv.m:132
          else
//  sbconv.m:131
            {
            }
//  sbconv.m:132
        }
//  sbconv.m:129
      else
//  sbconv.m:133
        {
          list.List_1 Vs_23 = ((list.List_1) ((maybe.Maybe_1.Yes_1) HeadVar__3_3).F1);
//  sbconv.m:136
          java.lang.String Str_31 = null;

//  sbconv.m:134
          {
            java.lang.Object [] result = gate2bel.owlprop_6_p_0(CM_2, V_39_39, V_38_38, V_37_37, V_36_36);
            succeeded = ((java.lang.Boolean) result[0]).booleanValue();
            Str_31 = (java.lang.String) result[1];
          }
//  sbconv.m:136
          if (succeeded)
//  sbconv.m:135
            {
              int V_34_34 = -1;

//  sbconv.m:199
              {
us.ihmc.cubism.nlp.Ingestor I;
int Tn;
int Tk;
list.List_1<us.ihmc.cubism.nlp.ViewPoint> Vs;
java.lang.String P;
java.lang.Object IO0;
java.lang.Object IO;
	I =  I_1;
	Tn =  V_41_41;
	Tk =  V_34_34;
	Vs =  Vs_23;
	P =  Str_31;
	IO0 =  null;
// MER_FOREIGN_BEGIN sbconv.m:199
Integer Turn = Tn;
  Integer Token = Tk;
  List<ViewPoint> Viewpoints = new ArrayList<ViewPoint>();
  while (!list.is_empty(Vs)) {
    Viewpoints.add(list.det_head(Vs));
    Vs = list.det_tail(Vs);
  }
  I.ingestProposition(Turn,Token,P,Viewpoints);
  IO = IO0;
// MER_FOREIGN_END sbconv.m:208
//  sbconv.m:199
              	}
//  sbconv.m:135
            }
//  sbconv.m:136
          else
//  sbconv.m:135
            {
            }
//  sbconv.m:133
        }
//  sbconv.m:129
    }
//  sbconv.m:127
  }
//  sbconv.m:123
  private static java.lang.Object g2p_stmnt_5_p_0_2(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;

      {
        sbconv.g2p_triple_6_p_0(((us.ihmc.cubism.nlp.Ingestor) ((java.lang.Object[]) closure)[3]), ((tree234.Tree234_2) ((java.lang.Object[]) closure)[4]), ((maybe.Maybe_1) ((java.lang.Object[]) closure)[5]), ((gate2bel.Owltriple_0) wrapper_arg_1));
      }
      return wrapper_arg_3;
    }
  }
//  sbconv.m:122
  private static java.lang.Object [] g2p_stmnt_5_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      java.lang.Object wrapper_arg_4 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      us.ihmc.cubism.nlp.ViewPoint conv0_Viewpoint_11 = null;

      {
        conv0_Viewpoint_11 = sbconv.viewpoint_5_p_0(((tree234.Tree234_2) ((java.lang.Object[]) closure)[3]), ((gate2bel.Lndata_0) wrapper_arg_1));
      }
      wrapper_arg_2 = ((java.lang.Object) (conv0_Viewpoint_11));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_2)),
        ((java.lang.Object) (wrapper_arg_4))
      };
    }
  }
//  sbconv.m:117
  private static void g2p_stmnt_5_p_0(
    us.ihmc.cubism.nlp.Ingestor I_1,
    tree234.Tree234_2 CM_2,
    gate2bel.Owlstmnt_0 HeadVar__3_3)
  {
//  sbconv.m:119
    {
      boolean succeeded = false;

      if ((HeadVar__3_3.data_tag == 1))
//  sbconv.m:121
        {
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_31_31 = null;
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_32_32 = null;
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_33_33 = null;
          jmercury.runtime.TypeInfo_Struct TypeCtorInfo_37_37 = null;
          list.List_1 Ds_16 = ((gate2bel.Owlstmnt_0.Embedded_2) HeadVar__3_3).F1;
          list.List_1 Ts_17 = ((gate2bel.Owlstmnt_0.Embedded_2) HeadVar__3_3).F2;
          list.List_1 Vs_19 = null;
          /* closure */ java.lang.Object[] V_22_22 = null;
          /* closure */ java.lang.Object[] V_24_24 = null;
          maybe.Maybe_1 V_26_26 = null;
//  sbconv.m:122
          java.lang.Object conv1_STATE_VARIABLE_IO_23_23 = null;
//  sbconv.m:123
          java.lang.Object conv2_STATE_VARIABLE_IO_5 = null;

//  sbconv.m:122
          {
            V_22_22 = new /* closure */ java.lang.Object[] {((java.lang.Object) (sbconv.MR_scalar_common_2[4])), ((java.lang.Object) (new AddrOf3_0(2))), java.lang.Integer.valueOf(1), ((java.lang.Object) (CM_2))};
          }
          TypeCtorInfo_31_31 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_lndata_0);
          TypeCtorInfo_32_32 = jmercury.runtime.TypeInfo_Struct.maybe_new(sbconv.sbconv__type_ctor_info_viewpoint_0);
          TypeCtorInfo_33_33 = jmercury.runtime.TypeInfo_Struct.maybe_new(io.io__type_ctor_info_state_0);
          {
            java.lang.Object [] result = list.map_foldl_5_p_2(TypeCtorInfo_31_31, TypeCtorInfo_32_32, TypeCtorInfo_33_33, V_22_22, Ds_16, ((java.lang.Object) (0)));
            Vs_19 = (list.List_1) result[0];
            conv1_STATE_VARIABLE_IO_23_23 = (java.lang.Object) result[1];
          }
//  sbconv.m:123
          {
            V_26_26 = new maybe.Maybe_1.Yes_1(((java.lang.Object) (Vs_19)));
          }
          {
            V_24_24 = new /* closure */ java.lang.Object[] {((java.lang.Object) (sbconv.MR_scalar_common_3[1])), ((java.lang.Object) (new AddrOf3_0(3))), java.lang.Integer.valueOf(3), ((java.lang.Object) (I_1)), ((java.lang.Object) (CM_2)), ((java.lang.Object) (V_26_26))};
          }
          TypeCtorInfo_37_37 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_owltriple_0);
          {
            conv2_STATE_VARIABLE_IO_5 = list.foldl_4_p_2(TypeCtorInfo_37_37, TypeCtorInfo_33_33, V_24_24, Ts_17, ((java.lang.Object) (0)));
          }
//  sbconv.m:121
        }
//  sbconv.m:119
      else
        {
          gate2bel.Owltriple_0 Triple_8 = ((gate2bel.Owlstmnt_0.One_1) HeadVar__3_3).F1;
          maybe.Maybe_1 V_12_12 = (maybe.Maybe_1) sbconv.MR_scalar_common_5[0];

//  sbconv.m:120
          {
            sbconv.g2p_triple_6_p_0(I_1, CM_2, V_12_12, Triple_8);
          }
//  sbconv.m:119
        }
    }
//  sbconv.m:117
  }
//  sbconv.m:97
  private static void s2p_4_p_0(
    us.ihmc.cubism.nlp.Ingestor I_5,
    stanford2bel.Stprop_0 HeadVar__2_2)
  {
//  sbconv.m:99
    {
      boolean succeeded = false;
      int Tn_6 = ((stanford2bel.Stprop_0) HeadVar__2_2).F1;
      int Tk_7 = ((stanford2bel.Stprop_0) HeadVar__2_2).F2;
      beliefs.Proposition_0 Prop_9 = ((stanford2bel.Stprop_0) HeadVar__2_2).F4;
      java.lang.String V_8_8 = ((stanford2bel.Stprop_0) HeadVar__2_2).F3;
//  sbconv.m:103
      java.lang.String Str_11 = null;

//  sbconv.m:101
      {
        java.lang.Object [] result = stanford2bel.owlprop_2_p_0(Prop_9);
        succeeded = ((java.lang.Boolean) result[0]).booleanValue();
        Str_11 = (java.lang.String) result[1];
      }
//  sbconv.m:103
      if (succeeded)
//  sbconv.m:187
        {
//  sbconv.m:189
          {
us.ihmc.cubism.nlp.Ingestor I;
int Tn;
int Tk;
java.lang.String Prop;
java.lang.Object IO0;
java.lang.Object IO;
	I =  I_5;
	Tn =  Tn_6;
	Tk =  Tk_7;
	Prop =  Str_11;
	IO0 =  null;
// MER_FOREIGN_BEGIN sbconv.m:189
Integer Turn = Tn;
  Integer Token = Tk;
  I.ingestProposition(Turn,Token,Prop);
  IO = IO0;
// MER_FOREIGN_END sbconv.m:193
//  sbconv.m:189
          	}
//  sbconv.m:187
        }
//  sbconv.m:103
      else
//  sbconv.m:102
        {
        }
//  sbconv.m:99
    }
//  sbconv.m:97
  }
//  sbconv.m:94
  private static java.lang.Object stanford2props_5_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;

      {
        sbconv.s2p_4_p_0(((us.ihmc.cubism.nlp.Ingestor) ((java.lang.Object[]) closure)[3]), ((stanford2bel.Stprop_0) wrapper_arg_1));
      }
      return wrapper_arg_3;
    }
  }
//  sbconv.m:91
  private static void stanford2props_5_p_0(
    us.ihmc.cubism.nlp.Ingestor I_6,
    us.ihmc.cubism.nlp.Resolver _R_7,
    stanford2bel.Stprops_0 HeadVar__3_3)
  {
//  sbconv.m:93
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_19_19 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_20_20 = null;
      list.List_1 Props_9 = ((stanford2bel.Stprops_0) HeadVar__3_3).F2;
      /* closure */ java.lang.Object[] V_14_14 = null;
      java.lang.String _Name_8 = ((stanford2bel.Stprops_0) HeadVar__3_3).F1;
      tree234.Tree234_2 _Emap_10 = ((stanford2bel.Stprops_0) HeadVar__3_3).F3;
//  sbconv.m:94
      java.lang.Object conv0_STATE_VARIABLE_IO_13 = null;

      {
        V_14_14 = new /* closure */ java.lang.Object[] {((java.lang.Object) (sbconv.MR_scalar_common_6[0])), ((java.lang.Object) (new AddrOf3_0(4))), java.lang.Integer.valueOf(1), ((java.lang.Object) (I_6))};
      }
      TypeCtorInfo_19_19 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_stprop_0);
      TypeCtorInfo_20_20 = jmercury.runtime.TypeInfo_Struct.maybe_new(io.io__type_ctor_info_state_0);
      {
        conv0_STATE_VARIABLE_IO_13 = list.foldl_4_p_2(TypeCtorInfo_19_19, TypeCtorInfo_20_20, V_14_14, Props_9, ((java.lang.Object) (0)));
      }
//  sbconv.m:93
    }
//  sbconv.m:91
  }
//  sbconv.m:44
  private static void unsafe_set_wndstore_1_p_0(
    maybe.Maybe_1 X_1)
  {
    {
      boolean succeeded = false;

      {
/* generic_type */ java.lang.Object X;
	X =  X_1;
// MER_FOREIGN_BEGIN sbconv.m:44
	sbconv__mutable_variable_wndstore = X;

// MER_FOREIGN_END sbconv.m:46
//  sbconv.m:44
      	}
    }
  }
  private static maybe.Maybe_1 unsafe_get_wndstore_1_p_0()
  {
    {
      boolean succeeded = false;
      maybe.Maybe_1 X_1 = null;

      {
/* generic_type */ java.lang.Object X;
// MER_FOREIGN_BEGIN sbconv.m:44
	X = sbconv__mutable_variable_wndstore;

// MER_FOREIGN_END sbconv.m:46
//  sbconv.m:44
      X_1 = ((maybe.Maybe_1) X);
      	}
      return X_1;
    }
  }
  private static void initialise_mutable_wndstore_0_p_0()
  {
    {
      boolean succeeded = false;
      maybe.Maybe_1 X_1 = (maybe.Maybe_1) sbconv.MR_scalar_common_5[0];

      {
        sbconv.unsafe_set_wndstore_1_p_0(X_1);
      }
    }
  }
//  sbconv.m:17
  public static void conv_syntax_4_p_0(
    java.lang.String Filename_5,
    java.lang.String DocStr_6)
  {
//  sbconv.m:84
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_13_13 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
      list.List_1 Es0_8 = null;
//  sbconv.m:86
      list.List_1 _Sents_9 = null;
      list.List_1 V_10_10 = null;

//  sbconv.m:85
      {
        Es0_8 = errors.new_messages_1_p_0(TypeCtorInfo_13_13);
      }
//  sbconv.m:86
      {
        java.lang.Object [] result = syntax2bel.convert_5_p_0(Filename_5, DocStr_6, Es0_8);
        _Sents_9 = (list.List_1) result[0];
        V_10_10 = (list.List_1) result[1];
      }
//  sbconv.m:84
    }
//  sbconv.m:17
  }
//  sbconv.m:142
  private static java.lang.Object conv_trips_4_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;

      {
        sbconv.t2p_turn_5_p_0(((us.ihmc.cubism.nlp.Ingestor) ((java.lang.Object[]) closure)[3]), ((tree234.Tree234_2) ((java.lang.Object[]) closure)[4]), ((trips2bel.Turn3_0) wrapper_arg_1));
      }
      return wrapper_arg_3;
    }
  }
//  sbconv.m:15
  public static void conv_trips_4_p_0(
    us.ihmc.cubism.nlp.Ingestor Ingestor_5,
    java.lang.String DocStr_6)
  {
//  sbconv.m:75
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_21_21 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_17_35 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_18_36 = null;
      list.List_1 Es0_8 = null;
      java.lang.String Filename_9 = null;
      maybe.Maybe_1 MWN_10 = null;
      list.List_1 Turns_11 = null;
      list.List_1 Es1_12 = null;
      trips2bel.Trfile2_0 TF2_13 = null;
      list.List_1 Es2_14 = null;
      trips2bel.Trfile3_0 TF3_15 = null;
      trips2bel.Trfile_0 V_19_19 = null;
      list.List_1 Turns_27 = null;
      tree234.Tree234_2 Vmap_28 = null;
      /* closure */ java.lang.Object[] V_30_30 = null;
//  sbconv.m:79
      list.List_1 V_16_16 = null;
//  sbconv.m:141
      java.lang.String _Name_26 = null;
//  sbconv.m:142
      java.lang.Object conv0_STATE_VARIABLE_IO_18 = null;

//  sbconv.m:76
      {
        Es0_8 = errors.new_messages_1_p_0(TypeCtorInfo_21_21);
      }
      Filename_9 = "Trips";
//  sbconv.m:44
      {
        MWN_10 = sbconv.unsafe_get_wndstore_1_p_0();
      }
//  sbconv.m:77
      {
        java.lang.Object [] result = trips2bel.convert_5_p_0(Filename_9, DocStr_6, Es0_8);
        Turns_11 = (list.List_1) result[0];
        Es1_12 = (list.List_1) result[1];
      }
//  sbconv.m:78
      {
        V_19_19 = new trips2bel.Trfile_0(Filename_9, Turns_11);
      }
      {
        java.lang.Object [] result = trips2bel.convert2_5_p_0(MWN_10, V_19_19, Es1_12);
        TF2_13 = (trips2bel.Trfile2_0) result[0];
        Es2_14 = (list.List_1) result[1];
      }
//  sbconv.m:79
      {
        java.lang.Object [] result = trips2bel.convert3_5_p_0(MWN_10, TF2_13, Es2_14);
        TF3_15 = (trips2bel.Trfile3_0) result[0];
        V_16_16 = (list.List_1) result[1];
      }
//  sbconv.m:141
      _Name_26 = ((trips2bel.Trfile3_0) TF3_15).F1;
      Turns_27 = ((trips2bel.Trfile3_0) TF3_15).F2;
      Vmap_28 = ((trips2bel.Trfile3_0) TF3_15).F3;
//  sbconv.m:142
      {
        V_30_30 = new /* closure */ java.lang.Object[] {((java.lang.Object) (sbconv.MR_scalar_common_2[3])), ((java.lang.Object) (new AddrOf3_0(5))), java.lang.Integer.valueOf(2), ((java.lang.Object) (Ingestor_5)), ((java.lang.Object) (Vmap_28))};
      }
      TypeCtorInfo_17_35 = jmercury.runtime.TypeInfo_Struct.maybe_new(trips2bel.trips2bel__type_ctor_info_turn3_0);
      TypeCtorInfo_18_36 = jmercury.runtime.TypeInfo_Struct.maybe_new(io.io__type_ctor_info_state_0);
      {
        conv0_STATE_VARIABLE_IO_18 = list.foldl_4_p_2(TypeCtorInfo_17_35, TypeCtorInfo_18_36, V_30_30, Turns_27, ((java.lang.Object) (0)));
      }
//  sbconv.m:75
    }
//  sbconv.m:15
  }
//  sbconv.m:113
  private static java.lang.Object conv_gate_5_p_0_2(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;

      {
        sbconv.g2p_stmnt_5_p_0(((us.ihmc.cubism.nlp.Ingestor) ((java.lang.Object[]) closure)[3]), ((tree234.Tree234_2) ((java.lang.Object[]) closure)[4]), ((gate2bel.Owlstmnt_0) wrapper_arg_1));
      }
      return wrapper_arg_3;
    }
  }
//  sbconv.m:110
  private static java.lang.Object [] conv_gate_5_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2,
    java.lang.Object wrapper_arg_3,
    java.lang.Object wrapper_arg_5)
  {
    {
      java.lang.Object wrapper_arg_4 = null;
      java.lang.Object wrapper_arg_6 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      tree234.Tree234_2 conv0_HeadVar__5_34 = null;

      {
        conv0_HeadVar__5_34 = sbconv.IntroducedFrom__pred__gate2props__110__1_7_p_0(((us.ihmc.cubism.nlp.Resolver) ((java.lang.Object[]) closure)[3]), ((java.lang.Integer) wrapper_arg_1).intValue(), ((utils.Corefdata_0) wrapper_arg_2), ((tree234.Tree234_2) wrapper_arg_3));
      }
      wrapper_arg_4 = ((java.lang.Object) (conv0_HeadVar__5_34));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_4)),
        ((java.lang.Object) (wrapper_arg_6))
      };
    }
  }
//  sbconv.m:12
  public static void conv_gate_5_p_0(
    us.ihmc.cubism.nlp.Ingestor Ingestor_6,
    us.ihmc.cubism.nlp.Resolver Resolver_7,
    java.lang.String DocStr_8)
  {
//  sbconv.m:64
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_25_25 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_48_69 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_49_70 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_50_71 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_51_72 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_52_73 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_56_77 = null;
      list.List_1 Es0_10 = null;
      java.lang.String Filename_11 = null;
      maybe.Maybe_1 MWN_12 = null;
      list.List_1 Turns_13 = null;
      list.List_1 Es1_14 = null;
      gate2bel.Tnfile2_0 File2_15 = null;
      list.List_1 Es2_16 = null;
      gate2bel.Tnfile3_0 File3_17 = null;
      list.List_1 Es3_18 = null;
      gate2bel.Owlfile_0 File4_19 = null;
      gate2bel.Tnfile_0 V_23_23 = null;
      list.List_1 Stmnts_32 = null;
      utils.Corefs_0 Corefs_33 = null;
      tree234.Tree234_2 Corefmap_37 = null;
      tree234.Tree234_2 Cmap_48 = null;
      /* closure */ java.lang.Object[] V_49_49 = null;
      tree234.Tree234_2 V_50_50 = null;
      /* closure */ java.lang.Object[] V_59_59 = null;
//  sbconv.m:69
      list.List_1 _Es_20 = null;
//  sbconv.m:108
      java.lang.String _Name_31 = null;
//  sbconv.m:109
      list.List_1 V_35_35 = null;
      list.List_1 V_36_36 = null;
//  sbconv.m:110
      java.lang.Object conv2_Cmap_48 = null;
      java.lang.Object conv1_STATE_VARIABLE_IO_30_51 = null;
//  sbconv.m:113
      java.lang.Object conv3_STATE_VARIABLE_IO_22 = null;

//  sbconv.m:65
      {
        Es0_10 = errors.new_messages_1_p_0(TypeCtorInfo_25_25);
      }
      Filename_11 = "GATE";
//  sbconv.m:44
      {
        MWN_12 = sbconv.unsafe_get_wndstore_1_p_0();
      }
//  sbconv.m:66
      {
        java.lang.Object [] result = gate2bel.convert_5_p_0(Filename_11, DocStr_8, Es0_10);
        Turns_13 = (list.List_1) result[0];
        Es1_14 = (list.List_1) result[1];
      }
//  sbconv.m:67
      {
        V_23_23 = new gate2bel.Tnfile_0(Filename_11, Turns_13);
      }
      {
        java.lang.Object [] result = gate2bel.convert2_5_p_0(MWN_12, V_23_23, Es1_14);
        File2_15 = (gate2bel.Tnfile2_0) result[0];
        Es2_16 = (list.List_1) result[1];
      }
//  sbconv.m:68
      {
        java.lang.Object [] result = gate2bel.convert3_5_p_0(MWN_12, File2_15, Es2_16);
        File3_17 = (gate2bel.Tnfile3_0) result[0];
        Es3_18 = (list.List_1) result[1];
      }
//  sbconv.m:69
      {
        java.lang.Object [] result = gate2bel.convert4_4_p_0(File3_17, Es3_18);
        File4_19 = (gate2bel.Owlfile_0) result[0];
        _Es_20 = (list.List_1) result[1];
      }
//  sbconv.m:108
      _Name_31 = ((gate2bel.Owlfile_0) File4_19).F1;
      Stmnts_32 = ((gate2bel.Owlfile_0) File4_19).F2;
      Corefs_33 = ((gate2bel.Owlfile_0) File4_19).F3;
//  sbconv.m:109
      V_35_35 = ((utils.Corefs_0) Corefs_33).F1;
      V_36_36 = ((utils.Corefs_0) Corefs_33).F2;
      Corefmap_37 = ((utils.Corefs_0) Corefs_33).F3;
//  sbconv.m:110
      {
        V_49_49 = new /* closure */ java.lang.Object[] {((java.lang.Object) (sbconv.MR_scalar_common_4[0])), ((java.lang.Object) (new AddrOf5_0())), java.lang.Integer.valueOf(1), ((java.lang.Object) (Resolver_7))};
      }
      TypeCtorInfo_48_69 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_int_0);
      TypeCtorInfo_49_70 = jmercury.runtime.TypeInfo_Struct.maybe_new(builtin.builtin__type_ctor_info_string_0);
      {
        V_50_50 = map.init_0_f_0(TypeCtorInfo_48_69, TypeCtorInfo_49_70);
      }
      TypeCtorInfo_50_71 = jmercury.runtime.TypeInfo_Struct.maybe_new(utils.utils__type_ctor_info_corefdata_0);
      TypeInfo_51_72 = jmercury.runtime.TypeInfo_Struct.maybe_new(sbconv.MR_scalar_common_1[1]);
      TypeCtorInfo_52_73 = jmercury.runtime.TypeInfo_Struct.maybe_new(io.io__type_ctor_info_state_0);
      {
        java.lang.Object [] result = map.foldl2_6_p_2(TypeCtorInfo_48_69, TypeCtorInfo_50_71, TypeInfo_51_72, TypeCtorInfo_52_73, V_49_49, Corefmap_37, ((java.lang.Object) (V_50_50)), ((java.lang.Object) (0)));
        conv2_Cmap_48 = (java.lang.Object) result[0];
        conv1_STATE_VARIABLE_IO_30_51 = (java.lang.Object) result[1];
      }
      Cmap_48 = ((tree234.Tree234_2) conv2_Cmap_48);
//  sbconv.m:113
      {
        V_59_59 = new /* closure */ java.lang.Object[] {((java.lang.Object) (sbconv.MR_scalar_common_2[2])), ((java.lang.Object) (new AddrOf3_0(6))), java.lang.Integer.valueOf(2), ((java.lang.Object) (Ingestor_6)), ((java.lang.Object) (Cmap_48))};
      }
      TypeCtorInfo_56_77 = jmercury.runtime.TypeInfo_Struct.maybe_new(gate2bel.gate2bel__type_ctor_info_owlstmnt_0);
      {
        conv3_STATE_VARIABLE_IO_22 = list.foldl_4_p_2(TypeCtorInfo_56_77, TypeCtorInfo_52_73, V_59_59, Stmnts_32, ((java.lang.Object) (0)));
      }
//  sbconv.m:64
    }
//  sbconv.m:12
  }
//  sbconv.m:59
  private static java.lang.Object conv_stanford_6_p_0_3(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_2)
  {
    {
      java.lang.Object wrapper_arg_3 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;

      {
        sbconv.stanford2props_5_p_0(((us.ihmc.cubism.nlp.Ingestor) ((java.lang.Object[]) closure)[3]), ((us.ihmc.cubism.nlp.Resolver) ((java.lang.Object[]) closure)[4]), ((stanford2bel.Stprops_0) wrapper_arg_1));
      }
      return wrapper_arg_3;
    }
  }
//  sbconv.m:57
  private static java.lang.Object [] conv_stanford_6_p_0_2(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      java.lang.Object wrapper_arg_4 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      stanford2bel.Stprops_0 conv4_HeadVar__4_4 = null;
      list.List_1 conv3_HeadVar__6_6 = null;

      {
        java.lang.Object [] result = stanford2bel.convert3_6_p_0(((maybe.Maybe_1) ((java.lang.Object[]) closure)[3]), ((sberrs.Prmode_0) ((java.lang.Object[]) closure)[4]), ((stanford2bel.Stfile2_0) wrapper_arg_1), ((list.List_1) wrapper_arg_3));
        conv4_HeadVar__4_4 = (stanford2bel.Stprops_0) result[0];
        conv3_HeadVar__6_6 = (list.List_1) result[1];
      }
      wrapper_arg_2 = ((java.lang.Object) (conv4_HeadVar__4_4));
      wrapper_arg_4 = ((java.lang.Object) (conv3_HeadVar__6_6));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_2)),
        ((java.lang.Object) (wrapper_arg_4))
      };
    }
  }
//  sbconv.m:56
  private static java.lang.Object [] conv_stanford_6_p_0_1(
    /* generic_type */ java.lang.Object closure_arg,
    java.lang.Object wrapper_arg_1,
    java.lang.Object wrapper_arg_3)
  {
    {
      java.lang.Object wrapper_arg_2 = null;
      java.lang.Object wrapper_arg_4 = null;
      /* generic_type */ java.lang.Object closure = closure_arg;
      stanford2bel.Stfile2_0 conv1_HeadVar__3_3 = null;
      list.List_1 conv0_HeadVar__5_5 = null;

      {
        java.lang.Object [] result = stanford2bel.convert2_5_p_0(((maybe.Maybe_1) ((java.lang.Object[]) closure)[3]), ((stanford2bel.Stfile_0) wrapper_arg_1), ((list.List_1) wrapper_arg_3));
        conv1_HeadVar__3_3 = (stanford2bel.Stfile2_0) result[0];
        conv0_HeadVar__5_5 = (list.List_1) result[1];
      }
      wrapper_arg_2 = ((java.lang.Object) (conv1_HeadVar__3_3));
      wrapper_arg_4 = ((java.lang.Object) (conv0_HeadVar__5_5));
return new java.lang.Object[] {
        ((java.lang.Object) (wrapper_arg_2)),
        ((java.lang.Object) (wrapper_arg_4))
      };
    }
  }
//  sbconv.m:9
  public static void conv_stanford_6_p_0(
    us.ihmc.cubism.nlp.Ingestor Ingestor_7,
    us.ihmc.cubism.nlp.Resolver Resolver_8,
    java.lang.String DocStr_9,
    sberrs.Prmode_0 Md_10)
  {
//  sbconv.m:53
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_27_27 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_32_32 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_33_33 = null;
      jmercury.runtime.TypeInfo_Struct TypeInfo_34_34 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_39_39 = null;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_43_43 = null;
      list.List_1 Es0_12 = null;
      java.lang.String Filename_13 = null;
      maybe.Maybe_1 MWN_14 = null;
      list.List_1 Files_15 = null;
      list.List_1 Es1_16 = null;
      list.List_1 Files2_17 = null;
      list.List_1 Es2_18 = null;
      list.List_1 Files3_19 = null;
      /* closure */ java.lang.Object[] V_23_23 = null;
      /* closure */ java.lang.Object[] V_24_24 = null;
      /* closure */ java.lang.Object[] V_25_25 = null;
//  sbconv.m:56
      java.lang.Object conv2_Es2_18 = null;
//  sbconv.m:57
      list.List_1 _Es_20 = null;
      java.lang.Object conv5__Es_20 = null;
//  sbconv.m:59
      java.lang.Object conv6_STATE_VARIABLE_IO_22 = null;

//  sbconv.m:54
      {
        Es0_12 = errors.new_messages_1_p_0(TypeCtorInfo_27_27);
      }
      Filename_13 = "Stanford";
//  sbconv.m:44
      {
        MWN_14 = sbconv.unsafe_get_wndstore_1_p_0();
      }
//  sbconv.m:55
      {
        java.lang.Object [] result = stanford2bel.convert_5_p_0(Filename_13, DocStr_9, Es0_12);
        Files_15 = (list.List_1) result[0];
        Es1_16 = (list.List_1) result[1];
      }
//  sbconv.m:56
      {
        V_23_23 = new /* closure */ java.lang.Object[] {((java.lang.Object) (sbconv.MR_scalar_common_2[0])), ((java.lang.Object) (new AddrOf3_0(7))), java.lang.Integer.valueOf(1), ((java.lang.Object) (MWN_14))};
      }
      TypeCtorInfo_32_32 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_stfile_0);
      TypeCtorInfo_33_33 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_stfile2_0);
      TypeInfo_34_34 = jmercury.runtime.TypeInfo_Struct.maybe_new(sbconv.MR_scalar_common_1[0]);
      {
        java.lang.Object [] result = list.map_foldl_5_p_0(TypeCtorInfo_32_32, TypeCtorInfo_33_33, TypeInfo_34_34, V_23_23, Files_15, ((java.lang.Object) (Es1_16)));
        Files2_17 = (list.List_1) result[0];
        conv2_Es2_18 = (java.lang.Object) result[1];
      }
      Es2_18 = ((list.List_1) conv2_Es2_18);
//  sbconv.m:57
      {
        V_24_24 = new /* closure */ java.lang.Object[] {((java.lang.Object) (sbconv.MR_scalar_common_3[0])), ((java.lang.Object) (new AddrOf3_0(8))), java.lang.Integer.valueOf(2), ((java.lang.Object) (MWN_14)), ((java.lang.Object) (Md_10))};
      }
      TypeCtorInfo_39_39 = jmercury.runtime.TypeInfo_Struct.maybe_new(stanford2bel.stanford2bel__type_ctor_info_stprops_0);
      {
        java.lang.Object [] result = list.map_foldl_5_p_0(TypeCtorInfo_33_33, TypeCtorInfo_39_39, TypeInfo_34_34, V_24_24, Files2_17, ((java.lang.Object) (Es2_18)));
        Files3_19 = (list.List_1) result[0];
        conv5__Es_20 = (java.lang.Object) result[1];
      }
      _Es_20 = ((list.List_1) conv5__Es_20);
//  sbconv.m:59
      {
        V_25_25 = new /* closure */ java.lang.Object[] {((java.lang.Object) (sbconv.MR_scalar_common_2[1])), ((java.lang.Object) (new AddrOf3_0(9))), java.lang.Integer.valueOf(2), ((java.lang.Object) (Ingestor_7)), ((java.lang.Object) (Resolver_8))};
      }
      TypeCtorInfo_43_43 = jmercury.runtime.TypeInfo_Struct.maybe_new(io.io__type_ctor_info_state_0);
      {
        conv6_STATE_VARIABLE_IO_22 = list.foldl_4_p_2(TypeCtorInfo_39_39, TypeCtorInfo_43_43, V_25_25, Files3_19, ((java.lang.Object) (0)));
      }
//  sbconv.m:53
    }
//  sbconv.m:9
  }
//  sbconv.m:5
  public static void initialise_3_p_0(
    java.lang.String Filename_4)
  {
//  sbconv.m:46
    {
      boolean succeeded = false;
      jmercury.runtime.TypeInfo_Struct TypeCtorInfo_14_14 = jmercury.runtime.TypeInfo_Struct.maybe_new(sberrs.sberrs__type_ctor_info_error_0);
      list.List_1 Es0_6 = null;
      wordnet.Wndata_0 Data_7 = null;
      maybe.Maybe_1 V_11_11 = null;
      maybe.Maybe_1 V_13_13 = null;
//  sbconv.m:48
      list.List_1 V_8_8 = null;

//  sbconv.m:47
      {
        Es0_6 = errors.new_messages_1_p_0(TypeCtorInfo_14_14);
      }
//  sbconv.m:48
      {
        V_11_11 = new maybe.Maybe_1.Yes_1(((java.lang.Object) (Filename_4)));
      }
      {
        java.lang.Object [] result = wordnet.new_wordnet_6_p_0(V_11_11, Es0_6);
        Data_7 = (wordnet.Wndata_0) result[0];
        V_8_8 = (list.List_1) result[1];
      }
//  sbconv.m:49
      {
        V_13_13 = new maybe.Maybe_1.Yes_1(((java.lang.Object) (Data_7)));
      }
//  sbconv.m:44
      {
        sbconv.unsafe_set_wndstore_1_p_0(V_13_13);
      }
//  sbconv.m:46
    }
//  sbconv.m:5
  }

// ExportDefns
  public static 
  void conv_syntax(
      java.lang.String Filename_5,
      java.lang.String DocStr_6)
  {
    sbconv.conv_syntax_4_p_0(Filename_5, DocStr_6);
  }
  public static 
  void conv_trips(
      us.ihmc.cubism.nlp.Ingestor Ingestor_5,
      java.lang.String DocStr_6)
  {
    sbconv.conv_trips_4_p_0(Ingestor_5, DocStr_6);
  }
  public static 
  void conv_gate(
      us.ihmc.cubism.nlp.Ingestor Ingestor_6,
      us.ihmc.cubism.nlp.Resolver Resolver_7,
      java.lang.String DocStr_8)
  {
    sbconv.conv_gate_5_p_0(Ingestor_6, Resolver_7, DocStr_8);
  }
  public static 
  void conv_stanford(
      us.ihmc.cubism.nlp.Ingestor Ingestor_7,
      us.ihmc.cubism.nlp.Resolver Resolver_8,
      java.lang.String DocStr_9,
      sberrs.Prmode_0 Md_10)
  {
    sbconv.conv_stanford_6_p_0(Ingestor_7, Resolver_8, DocStr_9, Md_10);
  }
  public static 
  void initialise(
      java.lang.String Filename_4)
  {
    sbconv.initialise_3_p_0(Filename_4);
  }
  public static 
  void sbconv__user_init_pred_0()
  {
    sbconv.initialise_mutable_wndstore_0_p_0();
  }

// ExportedEnums

// InitPreds
  static {
    sbconv__user_init_pred_0();
  }

// FinalPreds

// EnvVarNames
  static {
    if (System.getenv("MERCURY_DEBUG_CLASS_INIT") != null) {
      System.out.println("[sbconv end init]");
    }
  }
}
// :- end_module sbconv.
