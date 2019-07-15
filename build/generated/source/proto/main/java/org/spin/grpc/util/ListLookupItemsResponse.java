// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package org.spin.grpc.util;

/**
 * <pre>
 * List Lookup Item Response
 * </pre>
 *
 * Protobuf type {@code data.ListLookupItemsResponse}
 */
public  final class ListLookupItemsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:data.ListLookupItemsResponse)
    ListLookupItemsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListLookupItemsResponse.newBuilder() to construct.
  private ListLookupItemsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListLookupItemsResponse() {
    recordCount_ = 0L;
    records_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListLookupItemsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            recordCount_ = input.readInt64();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              records_ = new java.util.ArrayList<org.spin.grpc.util.LookupItem>();
              mutable_bitField0_ |= 0x00000002;
            }
            records_.add(
                input.readMessage(org.spin.grpc.util.LookupItem.parser(), extensionRegistry));
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        records_ = java.util.Collections.unmodifiableList(records_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.spin.grpc.util.ADempiereData.internal_static_data_ListLookupItemsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.spin.grpc.util.ADempiereData.internal_static_data_ListLookupItemsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.spin.grpc.util.ListLookupItemsResponse.class, org.spin.grpc.util.ListLookupItemsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int RECORDCOUNT_FIELD_NUMBER = 1;
  private long recordCount_;
  /**
   * <code>int64 recordCount = 1;</code>
   */
  public long getRecordCount() {
    return recordCount_;
  }

  public static final int RECORDS_FIELD_NUMBER = 2;
  private java.util.List<org.spin.grpc.util.LookupItem> records_;
  /**
   * <code>repeated .data.LookupItem records = 2;</code>
   */
  public java.util.List<org.spin.grpc.util.LookupItem> getRecordsList() {
    return records_;
  }
  /**
   * <code>repeated .data.LookupItem records = 2;</code>
   */
  public java.util.List<? extends org.spin.grpc.util.LookupItemOrBuilder> 
      getRecordsOrBuilderList() {
    return records_;
  }
  /**
   * <code>repeated .data.LookupItem records = 2;</code>
   */
  public int getRecordsCount() {
    return records_.size();
  }
  /**
   * <code>repeated .data.LookupItem records = 2;</code>
   */
  public org.spin.grpc.util.LookupItem getRecords(int index) {
    return records_.get(index);
  }
  /**
   * <code>repeated .data.LookupItem records = 2;</code>
   */
  public org.spin.grpc.util.LookupItemOrBuilder getRecordsOrBuilder(
      int index) {
    return records_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 3;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <code>string next_page_token = 3;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <code>string next_page_token = 3;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (recordCount_ != 0L) {
      output.writeInt64(1, recordCount_);
    }
    for (int i = 0; i < records_.size(); i++) {
      output.writeMessage(2, records_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (recordCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, recordCount_);
    }
    for (int i = 0; i < records_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, records_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nextPageToken_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.spin.grpc.util.ListLookupItemsResponse)) {
      return super.equals(obj);
    }
    org.spin.grpc.util.ListLookupItemsResponse other = (org.spin.grpc.util.ListLookupItemsResponse) obj;

    boolean result = true;
    result = result && (getRecordCount()
        == other.getRecordCount());
    result = result && getRecordsList()
        .equals(other.getRecordsList());
    result = result && getNextPageToken()
        .equals(other.getNextPageToken());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RECORDCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRecordCount());
    if (getRecordsCount() > 0) {
      hash = (37 * hash) + RECORDS_FIELD_NUMBER;
      hash = (53 * hash) + getRecordsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.spin.grpc.util.ListLookupItemsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListLookupItemsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListLookupItemsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListLookupItemsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListLookupItemsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListLookupItemsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListLookupItemsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListLookupItemsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ListLookupItemsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListLookupItemsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ListLookupItemsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListLookupItemsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.spin.grpc.util.ListLookupItemsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * List Lookup Item Response
   * </pre>
   *
   * Protobuf type {@code data.ListLookupItemsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:data.ListLookupItemsResponse)
      org.spin.grpc.util.ListLookupItemsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_ListLookupItemsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_ListLookupItemsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.spin.grpc.util.ListLookupItemsResponse.class, org.spin.grpc.util.ListLookupItemsResponse.Builder.class);
    }

    // Construct using org.spin.grpc.util.ListLookupItemsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getRecordsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      recordCount_ = 0L;

      if (recordsBuilder_ == null) {
        records_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        recordsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_ListLookupItemsResponse_descriptor;
    }

    public org.spin.grpc.util.ListLookupItemsResponse getDefaultInstanceForType() {
      return org.spin.grpc.util.ListLookupItemsResponse.getDefaultInstance();
    }

    public org.spin.grpc.util.ListLookupItemsResponse build() {
      org.spin.grpc.util.ListLookupItemsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.spin.grpc.util.ListLookupItemsResponse buildPartial() {
      org.spin.grpc.util.ListLookupItemsResponse result = new org.spin.grpc.util.ListLookupItemsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.recordCount_ = recordCount_;
      if (recordsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          records_ = java.util.Collections.unmodifiableList(records_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.records_ = records_;
      } else {
        result.records_ = recordsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.spin.grpc.util.ListLookupItemsResponse) {
        return mergeFrom((org.spin.grpc.util.ListLookupItemsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.spin.grpc.util.ListLookupItemsResponse other) {
      if (other == org.spin.grpc.util.ListLookupItemsResponse.getDefaultInstance()) return this;
      if (other.getRecordCount() != 0L) {
        setRecordCount(other.getRecordCount());
      }
      if (recordsBuilder_ == null) {
        if (!other.records_.isEmpty()) {
          if (records_.isEmpty()) {
            records_ = other.records_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRecordsIsMutable();
            records_.addAll(other.records_);
          }
          onChanged();
        }
      } else {
        if (!other.records_.isEmpty()) {
          if (recordsBuilder_.isEmpty()) {
            recordsBuilder_.dispose();
            recordsBuilder_ = null;
            records_ = other.records_;
            bitField0_ = (bitField0_ & ~0x00000002);
            recordsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRecordsFieldBuilder() : null;
          } else {
            recordsBuilder_.addAllMessages(other.records_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.spin.grpc.util.ListLookupItemsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.spin.grpc.util.ListLookupItemsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long recordCount_ ;
    /**
     * <code>int64 recordCount = 1;</code>
     */
    public long getRecordCount() {
      return recordCount_;
    }
    /**
     * <code>int64 recordCount = 1;</code>
     */
    public Builder setRecordCount(long value) {
      
      recordCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 recordCount = 1;</code>
     */
    public Builder clearRecordCount() {
      
      recordCount_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<org.spin.grpc.util.LookupItem> records_ =
      java.util.Collections.emptyList();
    private void ensureRecordsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        records_ = new java.util.ArrayList<org.spin.grpc.util.LookupItem>(records_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.spin.grpc.util.LookupItem, org.spin.grpc.util.LookupItem.Builder, org.spin.grpc.util.LookupItemOrBuilder> recordsBuilder_;

    /**
     * <code>repeated .data.LookupItem records = 2;</code>
     */
    public java.util.List<org.spin.grpc.util.LookupItem> getRecordsList() {
      if (recordsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(records_);
      } else {
        return recordsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .data.LookupItem records = 2;</code>
     */
    public int getRecordsCount() {
      if (recordsBuilder_ == null) {
        return records_.size();
      } else {
        return recordsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .data.LookupItem records = 2;</code>
     */
    public org.spin.grpc.util.LookupItem getRecords(int index) {
      if (recordsBuilder_ == null) {
        return records_.get(index);
      } else {
        return recordsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .data.LookupItem records = 2;</code>
     */
    public Builder setRecords(
        int index, org.spin.grpc.util.LookupItem value) {
      if (recordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecordsIsMutable();
        records_.set(index, value);
        onChanged();
      } else {
        recordsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .data.LookupItem records = 2;</code>
     */
    public Builder setRecords(
        int index, org.spin.grpc.util.LookupItem.Builder builderForValue) {
      if (recordsBuilder_ == null) {
        ensureRecordsIsMutable();
        records_.set(index, builderForValue.build());
        onChanged();
      } else {
        recordsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.LookupItem records = 2;</code>
     */
    public Builder addRecords(org.spin.grpc.util.LookupItem value) {
      if (recordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecordsIsMutable();
        records_.add(value);
        onChanged();
      } else {
        recordsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .data.LookupItem records = 2;</code>
     */
    public Builder addRecords(
        int index, org.spin.grpc.util.LookupItem value) {
      if (recordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecordsIsMutable();
        records_.add(index, value);
        onChanged();
      } else {
        recordsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .data.LookupItem records = 2;</code>
     */
    public Builder addRecords(
        org.spin.grpc.util.LookupItem.Builder builderForValue) {
      if (recordsBuilder_ == null) {
        ensureRecordsIsMutable();
        records_.add(builderForValue.build());
        onChanged();
      } else {
        recordsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.LookupItem records = 2;</code>
     */
    public Builder addRecords(
        int index, org.spin.grpc.util.LookupItem.Builder builderForValue) {
      if (recordsBuilder_ == null) {
        ensureRecordsIsMutable();
        records_.add(index, builderForValue.build());
        onChanged();
      } else {
        recordsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.LookupItem records = 2;</code>
     */
    public Builder addAllRecords(
        java.lang.Iterable<? extends org.spin.grpc.util.LookupItem> values) {
      if (recordsBuilder_ == null) {
        ensureRecordsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, records_);
        onChanged();
      } else {
        recordsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .data.LookupItem records = 2;</code>
     */
    public Builder clearRecords() {
      if (recordsBuilder_ == null) {
        records_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        recordsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .data.LookupItem records = 2;</code>
     */
    public Builder removeRecords(int index) {
      if (recordsBuilder_ == null) {
        ensureRecordsIsMutable();
        records_.remove(index);
        onChanged();
      } else {
        recordsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .data.LookupItem records = 2;</code>
     */
    public org.spin.grpc.util.LookupItem.Builder getRecordsBuilder(
        int index) {
      return getRecordsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .data.LookupItem records = 2;</code>
     */
    public org.spin.grpc.util.LookupItemOrBuilder getRecordsOrBuilder(
        int index) {
      if (recordsBuilder_ == null) {
        return records_.get(index);  } else {
        return recordsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .data.LookupItem records = 2;</code>
     */
    public java.util.List<? extends org.spin.grpc.util.LookupItemOrBuilder> 
         getRecordsOrBuilderList() {
      if (recordsBuilder_ != null) {
        return recordsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(records_);
      }
    }
    /**
     * <code>repeated .data.LookupItem records = 2;</code>
     */
    public org.spin.grpc.util.LookupItem.Builder addRecordsBuilder() {
      return getRecordsFieldBuilder().addBuilder(
          org.spin.grpc.util.LookupItem.getDefaultInstance());
    }
    /**
     * <code>repeated .data.LookupItem records = 2;</code>
     */
    public org.spin.grpc.util.LookupItem.Builder addRecordsBuilder(
        int index) {
      return getRecordsFieldBuilder().addBuilder(
          index, org.spin.grpc.util.LookupItem.getDefaultInstance());
    }
    /**
     * <code>repeated .data.LookupItem records = 2;</code>
     */
    public java.util.List<org.spin.grpc.util.LookupItem.Builder> 
         getRecordsBuilderList() {
      return getRecordsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.spin.grpc.util.LookupItem, org.spin.grpc.util.LookupItem.Builder, org.spin.grpc.util.LookupItemOrBuilder> 
        getRecordsFieldBuilder() {
      if (recordsBuilder_ == null) {
        recordsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.spin.grpc.util.LookupItem, org.spin.grpc.util.LookupItem.Builder, org.spin.grpc.util.LookupItemOrBuilder>(
                records_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        records_ = null;
      }
      return recordsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <code>string next_page_token = 3;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string next_page_token = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string next_page_token = 3;</code>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string next_page_token = 3;</code>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <code>string next_page_token = 3;</code>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:data.ListLookupItemsResponse)
  }

  // @@protoc_insertion_point(class_scope:data.ListLookupItemsResponse)
  private static final org.spin.grpc.util.ListLookupItemsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.spin.grpc.util.ListLookupItemsResponse();
  }

  public static org.spin.grpc.util.ListLookupItemsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListLookupItemsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListLookupItemsResponse>() {
    public ListLookupItemsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListLookupItemsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListLookupItemsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListLookupItemsResponse> getParserForType() {
    return PARSER;
  }

  public org.spin.grpc.util.ListLookupItemsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

