// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package org.spin.grpc.util;

public interface LookupItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.LookupItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>string uuid = 2;</code>
   */
  java.lang.String getUuid();
  /**
   * <code>string uuid = 2;</code>
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <code>string tableName = 3;</code>
   */
  java.lang.String getTableName();
  /**
   * <code>string tableName = 3;</code>
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <code>map&lt;string, .data.Value&gt; values = 4;</code>
   */
  int getValuesCount();
  /**
   * <code>map&lt;string, .data.Value&gt; values = 4;</code>
   */
  boolean containsValues(
      java.lang.String key);
  /**
   * Use {@link #getValuesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.spin.grpc.util.Value>
  getValues();
  /**
   * <code>map&lt;string, .data.Value&gt; values = 4;</code>
   */
  java.util.Map<java.lang.String, org.spin.grpc.util.Value>
  getValuesMap();
  /**
   * <code>map&lt;string, .data.Value&gt; values = 4;</code>
   */

  org.spin.grpc.util.Value getValuesOrDefault(
      java.lang.String key,
      org.spin.grpc.util.Value defaultValue);
  /**
   * <code>map&lt;string, .data.Value&gt; values = 4;</code>
   */

  org.spin.grpc.util.Value getValuesOrThrow(
      java.lang.String key);
}
