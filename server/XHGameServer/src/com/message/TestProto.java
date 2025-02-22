// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test.proto

package com.message;

public final class TestProto {
  private TestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface C_TestOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional int32 type = 1;
    boolean hasType();
    int getType();
    
    // optional int32 param1 = 2;
    boolean hasParam1();
    int getParam1();
    
    // optional int32 param2 = 3;
    boolean hasParam2();
    int getParam2();
  }
  public static final class C_Test extends
      com.google.protobuf.GeneratedMessage
      implements C_TestOrBuilder {
    // Use C_Test.newBuilder() to construct.
    private C_Test(Builder builder) {
      super(builder);
    }
    private C_Test(boolean noInit) {}
    
    private static final C_Test defaultInstance;
    public static C_Test getDefaultInstance() {
      return defaultInstance;
    }
    
    public C_Test getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.message.TestProto.internal_static_C_Test_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.message.TestProto.internal_static_C_Test_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional int32 type = 1;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getType() {
      return type_;
    }
    
    // optional int32 param1 = 2;
    public static final int PARAM1_FIELD_NUMBER = 2;
    private int param1_;
    public boolean hasParam1() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getParam1() {
      return param1_;
    }
    
    // optional int32 param2 = 3;
    public static final int PARAM2_FIELD_NUMBER = 3;
    private int param2_;
    public boolean hasParam2() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getParam2() {
      return param2_;
    }
    
    private void initFields() {
      type_ = 0;
      param1_ = 0;
      param2_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, param1_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, param2_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, param1_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, param2_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.message.TestProto.C_Test parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.message.TestProto.C_Test parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.message.TestProto.C_Test parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.message.TestProto.C_Test parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.message.TestProto.C_Test parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.message.TestProto.C_Test parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.message.TestProto.C_Test parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.message.TestProto.C_Test parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.message.TestProto.C_Test parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.message.TestProto.C_Test parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.message.TestProto.C_Test prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.message.TestProto.C_TestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.message.TestProto.internal_static_C_Test_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.message.TestProto.internal_static_C_Test_fieldAccessorTable;
      }
      
      // Construct using com.message.TestProto.C_Test.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        param1_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        param2_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.message.TestProto.C_Test.getDescriptor();
      }
      
      public com.message.TestProto.C_Test getDefaultInstanceForType() {
        return com.message.TestProto.C_Test.getDefaultInstance();
      }
      
      public com.message.TestProto.C_Test build() {
        com.message.TestProto.C_Test result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.message.TestProto.C_Test buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.message.TestProto.C_Test result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.message.TestProto.C_Test buildPartial() {
        com.message.TestProto.C_Test result = new com.message.TestProto.C_Test(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.param1_ = param1_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.param2_ = param2_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.message.TestProto.C_Test) {
          return mergeFrom((com.message.TestProto.C_Test)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.message.TestProto.C_Test other) {
        if (other == com.message.TestProto.C_Test.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasParam1()) {
          setParam1(other.getParam1());
        }
        if (other.hasParam2()) {
          setParam2(other.getParam2());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              type_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              param1_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              param2_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional int32 type = 1;
      private int type_ ;
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getType() {
        return type_;
      }
      public Builder setType(int value) {
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 param1 = 2;
      private int param1_ ;
      public boolean hasParam1() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getParam1() {
        return param1_;
      }
      public Builder setParam1(int value) {
        bitField0_ |= 0x00000002;
        param1_ = value;
        onChanged();
        return this;
      }
      public Builder clearParam1() {
        bitField0_ = (bitField0_ & ~0x00000002);
        param1_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 param2 = 3;
      private int param2_ ;
      public boolean hasParam2() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getParam2() {
        return param2_;
      }
      public Builder setParam2(int value) {
        bitField0_ |= 0x00000004;
        param2_ = value;
        onChanged();
        return this;
      }
      public Builder clearParam2() {
        bitField0_ = (bitField0_ & ~0x00000004);
        param2_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:C_Test)
    }
    
    static {
      defaultInstance = new C_Test(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:C_Test)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_C_Test_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_C_Test_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ntest.proto\"6\n\006C_Test\022\014\n\004type\030\001 \001(\005\022\016\n\006" +
      "param1\030\002 \001(\005\022\016\n\006param2\030\003 \001(\005B\030\n\013com.mess" +
      "ageB\tTestProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_C_Test_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_C_Test_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_C_Test_descriptor,
              new java.lang.String[] { "Type", "Param1", "Param2", },
              com.message.TestProto.C_Test.class,
              com.message.TestProto.C_Test.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
