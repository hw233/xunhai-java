// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package com.message;

public final class CommonProto {
  private CommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface C_GetServerTimeOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  public static final class C_GetServerTime extends
      com.google.protobuf.GeneratedMessage
      implements C_GetServerTimeOrBuilder {
    // Use C_GetServerTime.newBuilder() to construct.
    private C_GetServerTime(Builder builder) {
      super(builder);
    }
    private C_GetServerTime(boolean noInit) {}
    
    private static final C_GetServerTime defaultInstance;
    public static C_GetServerTime getDefaultInstance() {
      return defaultInstance;
    }
    
    public C_GetServerTime getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.message.CommonProto.internal_static_C_GetServerTime_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.message.CommonProto.internal_static_C_GetServerTime_fieldAccessorTable;
    }
    
    private void initFields() {
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
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
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
    
    public static com.message.CommonProto.C_GetServerTime parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.message.CommonProto.C_GetServerTime parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.message.CommonProto.C_GetServerTime parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.message.CommonProto.C_GetServerTime parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.message.CommonProto.C_GetServerTime parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.message.CommonProto.C_GetServerTime parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.message.CommonProto.C_GetServerTime parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.message.CommonProto.C_GetServerTime parseDelimitedFrom(
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
    public static com.message.CommonProto.C_GetServerTime parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.message.CommonProto.C_GetServerTime parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.message.CommonProto.C_GetServerTime prototype) {
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
       implements com.message.CommonProto.C_GetServerTimeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.message.CommonProto.internal_static_C_GetServerTime_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.message.CommonProto.internal_static_C_GetServerTime_fieldAccessorTable;
      }
      
      // Construct using com.message.CommonProto.C_GetServerTime.newBuilder()
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
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.message.CommonProto.C_GetServerTime.getDescriptor();
      }
      
      public com.message.CommonProto.C_GetServerTime getDefaultInstanceForType() {
        return com.message.CommonProto.C_GetServerTime.getDefaultInstance();
      }
      
      public com.message.CommonProto.C_GetServerTime build() {
        com.message.CommonProto.C_GetServerTime result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.message.CommonProto.C_GetServerTime buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.message.CommonProto.C_GetServerTime result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.message.CommonProto.C_GetServerTime buildPartial() {
        com.message.CommonProto.C_GetServerTime result = new com.message.CommonProto.C_GetServerTime(this);
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.message.CommonProto.C_GetServerTime) {
          return mergeFrom((com.message.CommonProto.C_GetServerTime)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.message.CommonProto.C_GetServerTime other) {
        if (other == com.message.CommonProto.C_GetServerTime.getDefaultInstance()) return this;
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
          }
        }
      }
      
      
      // @@protoc_insertion_point(builder_scope:C_GetServerTime)
    }
    
    static {
      defaultInstance = new C_GetServerTime(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:C_GetServerTime)
  }
  
  public interface S_GetServerTimeOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional int64 serverTime = 1;
    boolean hasServerTime();
    long getServerTime();
  }
  public static final class S_GetServerTime extends
      com.google.protobuf.GeneratedMessage
      implements S_GetServerTimeOrBuilder {
    // Use S_GetServerTime.newBuilder() to construct.
    private S_GetServerTime(Builder builder) {
      super(builder);
    }
    private S_GetServerTime(boolean noInit) {}
    
    private static final S_GetServerTime defaultInstance;
    public static S_GetServerTime getDefaultInstance() {
      return defaultInstance;
    }
    
    public S_GetServerTime getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.message.CommonProto.internal_static_S_GetServerTime_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.message.CommonProto.internal_static_S_GetServerTime_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional int64 serverTime = 1;
    public static final int SERVERTIME_FIELD_NUMBER = 1;
    private long serverTime_;
    public boolean hasServerTime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getServerTime() {
      return serverTime_;
    }
    
    private void initFields() {
      serverTime_ = 0L;
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
        output.writeInt64(1, serverTime_);
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
          .computeInt64Size(1, serverTime_);
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
    
    public static com.message.CommonProto.S_GetServerTime parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.message.CommonProto.S_GetServerTime parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.message.CommonProto.S_GetServerTime parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.message.CommonProto.S_GetServerTime parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.message.CommonProto.S_GetServerTime parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.message.CommonProto.S_GetServerTime parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.message.CommonProto.S_GetServerTime parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.message.CommonProto.S_GetServerTime parseDelimitedFrom(
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
    public static com.message.CommonProto.S_GetServerTime parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.message.CommonProto.S_GetServerTime parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.message.CommonProto.S_GetServerTime prototype) {
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
       implements com.message.CommonProto.S_GetServerTimeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.message.CommonProto.internal_static_S_GetServerTime_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.message.CommonProto.internal_static_S_GetServerTime_fieldAccessorTable;
      }
      
      // Construct using com.message.CommonProto.S_GetServerTime.newBuilder()
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
        serverTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.message.CommonProto.S_GetServerTime.getDescriptor();
      }
      
      public com.message.CommonProto.S_GetServerTime getDefaultInstanceForType() {
        return com.message.CommonProto.S_GetServerTime.getDefaultInstance();
      }
      
      public com.message.CommonProto.S_GetServerTime build() {
        com.message.CommonProto.S_GetServerTime result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.message.CommonProto.S_GetServerTime buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.message.CommonProto.S_GetServerTime result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.message.CommonProto.S_GetServerTime buildPartial() {
        com.message.CommonProto.S_GetServerTime result = new com.message.CommonProto.S_GetServerTime(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.serverTime_ = serverTime_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.message.CommonProto.S_GetServerTime) {
          return mergeFrom((com.message.CommonProto.S_GetServerTime)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.message.CommonProto.S_GetServerTime other) {
        if (other == com.message.CommonProto.S_GetServerTime.getDefaultInstance()) return this;
        if (other.hasServerTime()) {
          setServerTime(other.getServerTime());
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
              serverTime_ = input.readInt64();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional int64 serverTime = 1;
      private long serverTime_ ;
      public boolean hasServerTime() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public long getServerTime() {
        return serverTime_;
      }
      public Builder setServerTime(long value) {
        bitField0_ |= 0x00000001;
        serverTime_ = value;
        onChanged();
        return this;
      }
      public Builder clearServerTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        serverTime_ = 0L;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:S_GetServerTime)
    }
    
    static {
      defaultInstance = new S_GetServerTime(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:S_GetServerTime)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_C_GetServerTime_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_C_GetServerTime_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_S_GetServerTime_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_S_GetServerTime_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014common.proto\"\021\n\017C_GetServerTime\"%\n\017S_G" +
      "etServerTime\022\022\n\nserverTime\030\001 \001(\003B\032\n\013com." +
      "messageB\013CommonProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_C_GetServerTime_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_C_GetServerTime_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_C_GetServerTime_descriptor,
              new java.lang.String[] { },
              com.message.CommonProto.C_GetServerTime.class,
              com.message.CommonProto.C_GetServerTime.Builder.class);
          internal_static_S_GetServerTime_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_S_GetServerTime_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_S_GetServerTime_descriptor,
              new java.lang.String[] { "ServerTime", },
              com.message.CommonProto.S_GetServerTime.class,
              com.message.CommonProto.S_GetServerTime.Builder.class);
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
