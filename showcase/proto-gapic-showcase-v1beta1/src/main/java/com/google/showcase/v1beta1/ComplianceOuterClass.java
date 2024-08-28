// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/compliance.proto

// Protobuf Java Version: 3.25.4
package com.google.showcase.v1beta1;

public final class ComplianceOuterClass {
  private ComplianceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_RepeatRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_RepeatRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_RepeatResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_RepeatResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_ComplianceSuite_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_ComplianceSuite_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_ComplianceGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_ComplianceGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_ComplianceData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_ComplianceData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_ComplianceDataChild_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_ComplianceDataChild_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_ComplianceDataGrandchild_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_ComplianceDataGrandchild_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_EnumRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_EnumRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_EnumResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_EnumResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/schema/google/showcase/v1beta1/complia" +
      "nce.proto\022\027google.showcase.v1beta1\032\034goog" +
      "le/api/annotations.proto\032\027google/api/cli" +
      "ent.proto\"\303\002\n\rRepeatRequest\022\014\n\004name\030\001 \001(" +
      "\t\0225\n\004info\030\002 \001(\0132\'.google.showcase.v1beta" +
      "1.ComplianceData\022\025\n\rserver_verify\030\003 \001(\010\022" +
      "!\n\024intended_binding_uri\030\n \001(\tH\000\210\001\001\022\017\n\007f_" +
      "int32\030\004 \001(\005\022\017\n\007f_int64\030\005 \001(\003\022\020\n\010f_double" +
      "\030\006 \001(\001\022\024\n\007p_int32\030\007 \001(\005H\001\210\001\001\022\024\n\007p_int64\030" +
      "\010 \001(\003H\002\210\001\001\022\025\n\010p_double\030\t \001(\001H\003\210\001\001B\027\n\025_in" +
      "tended_binding_uriB\n\n\010_p_int32B\n\n\010_p_int" +
      "64B\013\n\t_p_double\"^\n\016RepeatResponse\0227\n\007req" +
      "uest\030\001 \001(\0132&.google.showcase.v1beta1.Rep" +
      "eatRequest\022\023\n\013binding_uri\030\002 \001(\t\"J\n\017Compl" +
      "ianceSuite\0227\n\005group\030\001 \003(\0132(.google.showc" +
      "ase.v1beta1.ComplianceGroup\"g\n\017Complianc" +
      "eGroup\022\014\n\004name\030\001 \001(\t\022\014\n\004rpcs\030\002 \003(\t\0228\n\010re" +
      "quests\030\003 \003(\0132&.google.showcase.v1beta1.R" +
      "epeatRequest\"\340\006\n\016ComplianceData\022\020\n\010f_str" +
      "ing\030\001 \001(\t\022\017\n\007f_int32\030\002 \001(\005\022\020\n\010f_sint32\030\003" +
      " \001(\021\022\022\n\nf_sfixed32\030\004 \001(\017\022\020\n\010f_uint32\030\005 \001" +
      "(\r\022\021\n\tf_fixed32\030\006 \001(\007\022\017\n\007f_int64\030\007 \001(\003\022\020" +
      "\n\010f_sint64\030\010 \001(\022\022\022\n\nf_sfixed64\030\t \001(\020\022\020\n\010" +
      "f_uint64\030\n \001(\004\022\021\n\tf_fixed64\030\013 \001(\006\022\020\n\010f_d" +
      "ouble\030\014 \001(\001\022\017\n\007f_float\030\r \001(\002\022\016\n\006f_bool\030\016" +
      " \001(\010\022\017\n\007f_bytes\030\017 \001(\014\022F\n\tf_kingdom\030\026 \001(\016" +
      "23.google.showcase.v1beta1.ComplianceDat" +
      "a.LifeKingdom\022=\n\007f_child\030\020 \001(\0132,.google." +
      "showcase.v1beta1.ComplianceDataChild\022\025\n\010" +
      "p_string\030\021 \001(\tH\000\210\001\001\022\024\n\007p_int32\030\022 \001(\005H\001\210\001" +
      "\001\022\025\n\010p_double\030\023 \001(\001H\002\210\001\001\022\023\n\006p_bool\030\024 \001(\010" +
      "H\003\210\001\001\022K\n\tp_kingdom\030\027 \001(\01623.google.showca" +
      "se.v1beta1.ComplianceData.LifeKingdomH\004\210" +
      "\001\001\022B\n\007p_child\030\025 \001(\0132,.google.showcase.v1" +
      "beta1.ComplianceDataChildH\005\210\001\001\"\203\001\n\013LifeK" +
      "ingdom\022\034\n\030LIFE_KINGDOM_UNSPECIFIED\020\000\022\022\n\016" +
      "ARCHAEBACTERIA\020\001\022\016\n\nEUBACTERIA\020\002\022\014\n\010PROT" +
      "ISTA\020\003\022\t\n\005FUNGI\020\004\022\013\n\007PLANTAE\020\005\022\014\n\010ANIMAL" +
      "IA\020\006B\013\n\t_p_stringB\n\n\010_p_int32B\013\n\t_p_doub" +
      "leB\t\n\007_p_boolB\014\n\n_p_kingdomB\n\n\010_p_child\"" +
      "\357\003\n\023ComplianceDataChild\022\020\n\010f_string\030\001 \001(" +
      "\t\022\017\n\007f_float\030\002 \001(\002\022\020\n\010f_double\030\003 \001(\001\022\016\n\006" +
      "f_bool\030\004 \001(\010\0227\n\013f_continent\030\013 \001(\0162\".goog" +
      "le.showcase.v1beta1.Continent\022B\n\007f_child" +
      "\030\005 \001(\01321.google.showcase.v1beta1.Complia" +
      "nceDataGrandchild\022\025\n\010p_string\030\006 \001(\tH\000\210\001\001" +
      "\022\024\n\007p_float\030\007 \001(\002H\001\210\001\001\022\025\n\010p_double\030\010 \001(\001" +
      "H\002\210\001\001\022\023\n\006p_bool\030\t \001(\010H\003\210\001\001\0227\n\013p_continen" +
      "t\030\014 \001(\0162\".google.showcase.v1beta1.Contin" +
      "ent\022G\n\007p_child\030\n \001(\01321.google.showcase.v" +
      "1beta1.ComplianceDataGrandchildH\004\210\001\001B\013\n\t" +
      "_p_stringB\n\n\010_p_floatB\013\n\t_p_doubleB\t\n\007_p" +
      "_boolB\n\n\010_p_child\"N\n\030ComplianceDataGrand" +
      "child\022\020\n\010f_string\030\001 \001(\t\022\020\n\010f_double\030\002 \001(" +
      "\001\022\016\n\006f_bool\030\003 \001(\010\"#\n\013EnumRequest\022\024\n\014unkn" +
      "own_enum\030\001 \001(\010\"|\n\014EnumResponse\0225\n\007reques" +
      "t\030\001 \001(\0132$.google.showcase.v1beta1.EnumRe" +
      "quest\0225\n\tcontinent\030\002 \001(\0162\".google.showca" +
      "se.v1beta1.Continent*i\n\tContinent\022\031\n\025CON" +
      "TINENT_UNSPECIFIED\020\000\022\n\n\006AFRICA\020\001\022\013\n\007AMER" +
      "ICA\020\002\022\r\n\tANTARTICA\020\003\022\r\n\tAUSTRALIA\020\004\022\n\n\006E" +
      "UROPE\020\0052\330\r\n\nCompliance\022\202\001\n\016RepeatDataBod" +
      "y\022&.google.showcase.v1beta1.RepeatReques" +
      "t\032\'.google.showcase.v1beta1.RepeatRespon" +
      "se\"\037\202\323\344\223\002\031\"\024/v1beta1/repeat:body:\001*\022\215\001\n\022" +
      "RepeatDataBodyInfo\022&.google.showcase.v1b" +
      "eta1.RepeatRequest\032\'.google.showcase.v1b" +
      "eta1.RepeatResponse\"&\202\323\344\223\002 \"\030/v1beta1/re" +
      "peat:bodyinfo:\004info\022\201\001\n\017RepeatDataQuery\022" +
      "&.google.showcase.v1beta1.RepeatRequest\032" +
      "\'.google.showcase.v1beta1.RepeatResponse" +
      "\"\035\202\323\344\223\002\027\022\025/v1beta1/repeat:query\022\331\001\n\024Repe" +
      "atDataSimplePath\022&.google.showcase.v1bet" +
      "a1.RepeatRequest\032\'.google.showcase.v1bet" +
      "a1.RepeatResponse\"p\202\323\344\223\002j\022h/v1beta1/repe" +
      "at/{info.f_string}/{info.f_int32}/{info." +
      "f_double}/{info.f_bool}/{info.f_kingdom}" +
      ":simplepath\022\323\002\n\026RepeatDataPathResource\022&" +
      ".google.showcase.v1beta1.RepeatRequest\032\'" +
      ".google.showcase.v1beta1.RepeatResponse\"" +
      "\347\001\202\323\344\223\002\340\001\022h/v1beta1/repeat/{info.f_strin" +
      "g=first/*}/{info.f_child.f_string=second" +
      "/*}/bool/{info.f_bool}:pathresourceZt\022r/" +
      "v1beta1/repeat/{info.f_child.f_string=fi" +
      "rst/*}/{info.f_string=second/*}/bool/{in" +
      "fo.f_bool}:childfirstpathresource\022\331\001\n\036Re" +
      "peatDataPathTrailingResource\022&.google.sh" +
      "owcase.v1beta1.RepeatRequest\032\'.google.sh" +
      "owcase.v1beta1.RepeatResponse\"f\202\323\344\223\002`\022^/" +
      "v1beta1/repeat/{info.f_string=first/*}/{" +
      "info.f_child.f_string=second/**}:pathtra" +
      "ilingresource\022\210\001\n\021RepeatDataBodyPut\022&.go" +
      "ogle.showcase.v1beta1.RepeatRequest\032\'.go" +
      "ogle.showcase.v1beta1.RepeatResponse\"\"\202\323" +
      "\344\223\002\034\032\027/v1beta1/repeat:bodyput:\001*\022\214\001\n\023Rep" +
      "eatDataBodyPatch\022&.google.showcase.v1bet" +
      "a1.RepeatRequest\032\'.google.showcase.v1bet" +
      "a1.RepeatResponse\"$\202\323\344\223\002\0362\031/v1beta1/repe" +
      "at:bodypatch:\001*\022x\n\007GetEnum\022$.google.show" +
      "case.v1beta1.EnumRequest\032%.google.showca" +
      "se.v1beta1.EnumResponse\" \202\323\344\223\002\032\022\030/v1beta" +
      "1/compliance/enum\022|\n\nVerifyEnum\022%.google" +
      ".showcase.v1beta1.EnumResponse\032%.google." +
      "showcase.v1beta1.EnumResponse\" \202\323\344\223\002\032\"\030/" +
      "v1beta1/compliance/enum\032\021\312A\016localhost:74" +
      "69Bq\n\033com.google.showcase.v1beta1P\001Z4git" +
      "hub.com/googleapis/gapic-showcase/server" +
      "/genproto\352\002\031Google::Showcase::V1beta1b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        });
    internal_static_google_showcase_v1beta1_RepeatRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_showcase_v1beta1_RepeatRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_RepeatRequest_descriptor,
        new java.lang.String[] { "Name", "Info", "ServerVerify", "IntendedBindingUri", "FInt32", "FInt64", "FDouble", "PInt32", "PInt64", "PDouble", });
    internal_static_google_showcase_v1beta1_RepeatResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_showcase_v1beta1_RepeatResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_RepeatResponse_descriptor,
        new java.lang.String[] { "Request", "BindingUri", });
    internal_static_google_showcase_v1beta1_ComplianceSuite_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_showcase_v1beta1_ComplianceSuite_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_ComplianceSuite_descriptor,
        new java.lang.String[] { "Group", });
    internal_static_google_showcase_v1beta1_ComplianceGroup_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_showcase_v1beta1_ComplianceGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_ComplianceGroup_descriptor,
        new java.lang.String[] { "Name", "Rpcs", "Requests", });
    internal_static_google_showcase_v1beta1_ComplianceData_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_showcase_v1beta1_ComplianceData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_ComplianceData_descriptor,
        new java.lang.String[] { "FString", "FInt32", "FSint32", "FSfixed32", "FUint32", "FFixed32", "FInt64", "FSint64", "FSfixed64", "FUint64", "FFixed64", "FDouble", "FFloat", "FBool", "FBytes", "FKingdom", "FChild", "PString", "PInt32", "PDouble", "PBool", "PKingdom", "PChild", });
    internal_static_google_showcase_v1beta1_ComplianceDataChild_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_showcase_v1beta1_ComplianceDataChild_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_ComplianceDataChild_descriptor,
        new java.lang.String[] { "FString", "FFloat", "FDouble", "FBool", "FContinent", "FChild", "PString", "PFloat", "PDouble", "PBool", "PContinent", "PChild", });
    internal_static_google_showcase_v1beta1_ComplianceDataGrandchild_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_showcase_v1beta1_ComplianceDataGrandchild_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_ComplianceDataGrandchild_descriptor,
        new java.lang.String[] { "FString", "FDouble", "FBool", });
    internal_static_google_showcase_v1beta1_EnumRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_showcase_v1beta1_EnumRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_EnumRequest_descriptor,
        new java.lang.String[] { "UnknownEnum", });
    internal_static_google_showcase_v1beta1_EnumResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_showcase_v1beta1_EnumResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_EnumResponse_descriptor,
        new java.lang.String[] { "Request", "Continent", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
