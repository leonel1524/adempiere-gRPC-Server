// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package org.spin.grpc.util;

public interface ListBrowserItemsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.ListBrowserItemsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 recordCount = 1;</code>
   */
  long getRecordCount();

  /**
   * <code>repeated .data.Entity records = 2;</code>
   */
  java.util.List<org.spin.grpc.util.Entity> 
      getRecordsList();
  /**
   * <code>repeated .data.Entity records = 2;</code>
   */
  org.spin.grpc.util.Entity getRecords(int index);
  /**
   * <code>repeated .data.Entity records = 2;</code>
   */
  int getRecordsCount();
  /**
   * <code>repeated .data.Entity records = 2;</code>
   */
  java.util.List<? extends org.spin.grpc.util.EntityOrBuilder> 
      getRecordsOrBuilderList();
  /**
   * <code>repeated .data.Entity records = 2;</code>
   */
  org.spin.grpc.util.EntityOrBuilder getRecordsOrBuilder(
      int index);

  /**
   * <code>string next_page_token = 3;</code>
   */
  java.lang.String getNextPageToken();
  /**
   * <code>string next_page_token = 3;</code>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
