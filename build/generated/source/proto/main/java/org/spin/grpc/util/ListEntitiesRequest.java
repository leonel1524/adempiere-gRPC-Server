// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package org.spin.grpc.util;

/**
 * <pre>
 * List Entities Request
 * </pre>
 *
 * Protobuf type {@code data.ListEntitiesRequest}
 */
public  final class ListEntitiesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:data.ListEntitiesRequest)
    ListEntitiesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListEntitiesRequest.newBuilder() to construct.
  private ListEntitiesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListEntitiesRequest() {
    pageSize_ = 0;
    pageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListEntitiesRequest(
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
          case 26: {
            org.spin.grpc.util.ClientRequest.Builder subBuilder = null;
            if (clientRequest_ != null) {
              subBuilder = clientRequest_.toBuilder();
            }
            clientRequest_ = input.readMessage(org.spin.grpc.util.ClientRequest.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(clientRequest_);
              clientRequest_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            org.spin.grpc.util.Criteria.Builder subBuilder = null;
            if (criteria_ != null) {
              subBuilder = criteria_.toBuilder();
            }
            criteria_ = input.readMessage(org.spin.grpc.util.Criteria.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(criteria_);
              criteria_ = subBuilder.buildPartial();
            }

            break;
          }
          case 40: {

            pageSize_ = input.readInt32();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            pageToken_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.spin.grpc.util.ADempiereData.internal_static_data_ListEntitiesRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.spin.grpc.util.ADempiereData.internal_static_data_ListEntitiesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.spin.grpc.util.ListEntitiesRequest.class, org.spin.grpc.util.ListEntitiesRequest.Builder.class);
  }

  public static final int CLIENTREQUEST_FIELD_NUMBER = 3;
  private org.spin.grpc.util.ClientRequest clientRequest_;
  /**
   * <code>.data.ClientRequest clientRequest = 3;</code>
   */
  public boolean hasClientRequest() {
    return clientRequest_ != null;
  }
  /**
   * <code>.data.ClientRequest clientRequest = 3;</code>
   */
  public org.spin.grpc.util.ClientRequest getClientRequest() {
    return clientRequest_ == null ? org.spin.grpc.util.ClientRequest.getDefaultInstance() : clientRequest_;
  }
  /**
   * <code>.data.ClientRequest clientRequest = 3;</code>
   */
  public org.spin.grpc.util.ClientRequestOrBuilder getClientRequestOrBuilder() {
    return getClientRequest();
  }

  public static final int CRITERIA_FIELD_NUMBER = 4;
  private org.spin.grpc.util.Criteria criteria_;
  /**
   * <pre>
   * Query
   * </pre>
   *
   * <code>.data.Criteria criteria = 4;</code>
   */
  public boolean hasCriteria() {
    return criteria_ != null;
  }
  /**
   * <pre>
   * Query
   * </pre>
   *
   * <code>.data.Criteria criteria = 4;</code>
   */
  public org.spin.grpc.util.Criteria getCriteria() {
    return criteria_ == null ? org.spin.grpc.util.Criteria.getDefaultInstance() : criteria_;
  }
  /**
   * <pre>
   * Query
   * </pre>
   *
   * <code>.data.Criteria criteria = 4;</code>
   */
  public org.spin.grpc.util.CriteriaOrBuilder getCriteriaOrBuilder() {
    return getCriteria();
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 5;
  private int pageSize_;
  /**
   * <code>int32 page_size = 5;</code>
   */
  public int getPageSize() {
    return pageSize_;
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 6;
  private volatile java.lang.Object pageToken_;
  /**
   * <code>string page_token = 6;</code>
   */
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   * <code>string page_token = 6;</code>
   */
  public com.google.protobuf.ByteString
      getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pageToken_ = b;
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
    if (clientRequest_ != null) {
      output.writeMessage(3, getClientRequest());
    }
    if (criteria_ != null) {
      output.writeMessage(4, getCriteria());
    }
    if (pageSize_ != 0) {
      output.writeInt32(5, pageSize_);
    }
    if (!getPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, pageToken_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (clientRequest_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getClientRequest());
    }
    if (criteria_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getCriteria());
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, pageSize_);
    }
    if (!getPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, pageToken_);
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
    if (!(obj instanceof org.spin.grpc.util.ListEntitiesRequest)) {
      return super.equals(obj);
    }
    org.spin.grpc.util.ListEntitiesRequest other = (org.spin.grpc.util.ListEntitiesRequest) obj;

    boolean result = true;
    result = result && (hasClientRequest() == other.hasClientRequest());
    if (hasClientRequest()) {
      result = result && getClientRequest()
          .equals(other.getClientRequest());
    }
    result = result && (hasCriteria() == other.hasCriteria());
    if (hasCriteria()) {
      result = result && getCriteria()
          .equals(other.getCriteria());
    }
    result = result && (getPageSize()
        == other.getPageSize());
    result = result && getPageToken()
        .equals(other.getPageToken());
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
    if (hasClientRequest()) {
      hash = (37 * hash) + CLIENTREQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getClientRequest().hashCode();
    }
    if (hasCriteria()) {
      hash = (37 * hash) + CRITERIA_FIELD_NUMBER;
      hash = (53 * hash) + getCriteria().hashCode();
    }
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.spin.grpc.util.ListEntitiesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListEntitiesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListEntitiesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListEntitiesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListEntitiesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListEntitiesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListEntitiesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListEntitiesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ListEntitiesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListEntitiesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ListEntitiesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListEntitiesRequest parseFrom(
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
  public static Builder newBuilder(org.spin.grpc.util.ListEntitiesRequest prototype) {
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
   * List Entities Request
   * </pre>
   *
   * Protobuf type {@code data.ListEntitiesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:data.ListEntitiesRequest)
      org.spin.grpc.util.ListEntitiesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_ListEntitiesRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_ListEntitiesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.spin.grpc.util.ListEntitiesRequest.class, org.spin.grpc.util.ListEntitiesRequest.Builder.class);
    }

    // Construct using org.spin.grpc.util.ListEntitiesRequest.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      if (clientRequestBuilder_ == null) {
        clientRequest_ = null;
      } else {
        clientRequest_ = null;
        clientRequestBuilder_ = null;
      }
      if (criteriaBuilder_ == null) {
        criteria_ = null;
      } else {
        criteria_ = null;
        criteriaBuilder_ = null;
      }
      pageSize_ = 0;

      pageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_ListEntitiesRequest_descriptor;
    }

    public org.spin.grpc.util.ListEntitiesRequest getDefaultInstanceForType() {
      return org.spin.grpc.util.ListEntitiesRequest.getDefaultInstance();
    }

    public org.spin.grpc.util.ListEntitiesRequest build() {
      org.spin.grpc.util.ListEntitiesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.spin.grpc.util.ListEntitiesRequest buildPartial() {
      org.spin.grpc.util.ListEntitiesRequest result = new org.spin.grpc.util.ListEntitiesRequest(this);
      if (clientRequestBuilder_ == null) {
        result.clientRequest_ = clientRequest_;
      } else {
        result.clientRequest_ = clientRequestBuilder_.build();
      }
      if (criteriaBuilder_ == null) {
        result.criteria_ = criteria_;
      } else {
        result.criteria_ = criteriaBuilder_.build();
      }
      result.pageSize_ = pageSize_;
      result.pageToken_ = pageToken_;
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
      if (other instanceof org.spin.grpc.util.ListEntitiesRequest) {
        return mergeFrom((org.spin.grpc.util.ListEntitiesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.spin.grpc.util.ListEntitiesRequest other) {
      if (other == org.spin.grpc.util.ListEntitiesRequest.getDefaultInstance()) return this;
      if (other.hasClientRequest()) {
        mergeClientRequest(other.getClientRequest());
      }
      if (other.hasCriteria()) {
        mergeCriteria(other.getCriteria());
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
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
      org.spin.grpc.util.ListEntitiesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.spin.grpc.util.ListEntitiesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.spin.grpc.util.ClientRequest clientRequest_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.spin.grpc.util.ClientRequest, org.spin.grpc.util.ClientRequest.Builder, org.spin.grpc.util.ClientRequestOrBuilder> clientRequestBuilder_;
    /**
     * <code>.data.ClientRequest clientRequest = 3;</code>
     */
    public boolean hasClientRequest() {
      return clientRequestBuilder_ != null || clientRequest_ != null;
    }
    /**
     * <code>.data.ClientRequest clientRequest = 3;</code>
     */
    public org.spin.grpc.util.ClientRequest getClientRequest() {
      if (clientRequestBuilder_ == null) {
        return clientRequest_ == null ? org.spin.grpc.util.ClientRequest.getDefaultInstance() : clientRequest_;
      } else {
        return clientRequestBuilder_.getMessage();
      }
    }
    /**
     * <code>.data.ClientRequest clientRequest = 3;</code>
     */
    public Builder setClientRequest(org.spin.grpc.util.ClientRequest value) {
      if (clientRequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        clientRequest_ = value;
        onChanged();
      } else {
        clientRequestBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.data.ClientRequest clientRequest = 3;</code>
     */
    public Builder setClientRequest(
        org.spin.grpc.util.ClientRequest.Builder builderForValue) {
      if (clientRequestBuilder_ == null) {
        clientRequest_ = builderForValue.build();
        onChanged();
      } else {
        clientRequestBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.data.ClientRequest clientRequest = 3;</code>
     */
    public Builder mergeClientRequest(org.spin.grpc.util.ClientRequest value) {
      if (clientRequestBuilder_ == null) {
        if (clientRequest_ != null) {
          clientRequest_ =
            org.spin.grpc.util.ClientRequest.newBuilder(clientRequest_).mergeFrom(value).buildPartial();
        } else {
          clientRequest_ = value;
        }
        onChanged();
      } else {
        clientRequestBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.data.ClientRequest clientRequest = 3;</code>
     */
    public Builder clearClientRequest() {
      if (clientRequestBuilder_ == null) {
        clientRequest_ = null;
        onChanged();
      } else {
        clientRequest_ = null;
        clientRequestBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.data.ClientRequest clientRequest = 3;</code>
     */
    public org.spin.grpc.util.ClientRequest.Builder getClientRequestBuilder() {
      
      onChanged();
      return getClientRequestFieldBuilder().getBuilder();
    }
    /**
     * <code>.data.ClientRequest clientRequest = 3;</code>
     */
    public org.spin.grpc.util.ClientRequestOrBuilder getClientRequestOrBuilder() {
      if (clientRequestBuilder_ != null) {
        return clientRequestBuilder_.getMessageOrBuilder();
      } else {
        return clientRequest_ == null ?
            org.spin.grpc.util.ClientRequest.getDefaultInstance() : clientRequest_;
      }
    }
    /**
     * <code>.data.ClientRequest clientRequest = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.spin.grpc.util.ClientRequest, org.spin.grpc.util.ClientRequest.Builder, org.spin.grpc.util.ClientRequestOrBuilder> 
        getClientRequestFieldBuilder() {
      if (clientRequestBuilder_ == null) {
        clientRequestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.spin.grpc.util.ClientRequest, org.spin.grpc.util.ClientRequest.Builder, org.spin.grpc.util.ClientRequestOrBuilder>(
                getClientRequest(),
                getParentForChildren(),
                isClean());
        clientRequest_ = null;
      }
      return clientRequestBuilder_;
    }

    private org.spin.grpc.util.Criteria criteria_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.spin.grpc.util.Criteria, org.spin.grpc.util.Criteria.Builder, org.spin.grpc.util.CriteriaOrBuilder> criteriaBuilder_;
    /**
     * <pre>
     * Query
     * </pre>
     *
     * <code>.data.Criteria criteria = 4;</code>
     */
    public boolean hasCriteria() {
      return criteriaBuilder_ != null || criteria_ != null;
    }
    /**
     * <pre>
     * Query
     * </pre>
     *
     * <code>.data.Criteria criteria = 4;</code>
     */
    public org.spin.grpc.util.Criteria getCriteria() {
      if (criteriaBuilder_ == null) {
        return criteria_ == null ? org.spin.grpc.util.Criteria.getDefaultInstance() : criteria_;
      } else {
        return criteriaBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Query
     * </pre>
     *
     * <code>.data.Criteria criteria = 4;</code>
     */
    public Builder setCriteria(org.spin.grpc.util.Criteria value) {
      if (criteriaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        criteria_ = value;
        onChanged();
      } else {
        criteriaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Query
     * </pre>
     *
     * <code>.data.Criteria criteria = 4;</code>
     */
    public Builder setCriteria(
        org.spin.grpc.util.Criteria.Builder builderForValue) {
      if (criteriaBuilder_ == null) {
        criteria_ = builderForValue.build();
        onChanged();
      } else {
        criteriaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Query
     * </pre>
     *
     * <code>.data.Criteria criteria = 4;</code>
     */
    public Builder mergeCriteria(org.spin.grpc.util.Criteria value) {
      if (criteriaBuilder_ == null) {
        if (criteria_ != null) {
          criteria_ =
            org.spin.grpc.util.Criteria.newBuilder(criteria_).mergeFrom(value).buildPartial();
        } else {
          criteria_ = value;
        }
        onChanged();
      } else {
        criteriaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Query
     * </pre>
     *
     * <code>.data.Criteria criteria = 4;</code>
     */
    public Builder clearCriteria() {
      if (criteriaBuilder_ == null) {
        criteria_ = null;
        onChanged();
      } else {
        criteria_ = null;
        criteriaBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Query
     * </pre>
     *
     * <code>.data.Criteria criteria = 4;</code>
     */
    public org.spin.grpc.util.Criteria.Builder getCriteriaBuilder() {
      
      onChanged();
      return getCriteriaFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Query
     * </pre>
     *
     * <code>.data.Criteria criteria = 4;</code>
     */
    public org.spin.grpc.util.CriteriaOrBuilder getCriteriaOrBuilder() {
      if (criteriaBuilder_ != null) {
        return criteriaBuilder_.getMessageOrBuilder();
      } else {
        return criteria_ == null ?
            org.spin.grpc.util.Criteria.getDefaultInstance() : criteria_;
      }
    }
    /**
     * <pre>
     * Query
     * </pre>
     *
     * <code>.data.Criteria criteria = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.spin.grpc.util.Criteria, org.spin.grpc.util.Criteria.Builder, org.spin.grpc.util.CriteriaOrBuilder> 
        getCriteriaFieldBuilder() {
      if (criteriaBuilder_ == null) {
        criteriaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.spin.grpc.util.Criteria, org.spin.grpc.util.Criteria.Builder, org.spin.grpc.util.CriteriaOrBuilder>(
                getCriteria(),
                getParentForChildren(),
                isClean());
        criteria_ = null;
      }
      return criteriaBuilder_;
    }

    private int pageSize_ ;
    /**
     * <code>int32 page_size = 5;</code>
     */
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <code>int32 page_size = 5;</code>
     */
    public Builder setPageSize(int value) {
      
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 page_size = 5;</code>
     */
    public Builder clearPageSize() {
      
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     * <code>string page_token = 6;</code>
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string page_token = 6;</code>
     */
    public com.google.protobuf.ByteString
        getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string page_token = 6;</code>
     */
    public Builder setPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string page_token = 6;</code>
     */
    public Builder clearPageToken() {
      
      pageToken_ = getDefaultInstance().getPageToken();
      onChanged();
      return this;
    }
    /**
     * <code>string page_token = 6;</code>
     */
    public Builder setPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:data.ListEntitiesRequest)
  }

  // @@protoc_insertion_point(class_scope:data.ListEntitiesRequest)
  private static final org.spin.grpc.util.ListEntitiesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.spin.grpc.util.ListEntitiesRequest();
  }

  public static org.spin.grpc.util.ListEntitiesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListEntitiesRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListEntitiesRequest>() {
    public ListEntitiesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListEntitiesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListEntitiesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListEntitiesRequest> getParserForType() {
    return PARSER;
  }

  public org.spin.grpc.util.ListEntitiesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

