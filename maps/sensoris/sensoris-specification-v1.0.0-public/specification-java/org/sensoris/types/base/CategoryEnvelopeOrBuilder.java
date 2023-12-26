// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/base.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.types.base;

public interface CategoryEnvelopeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.types.base.CategoryEnvelope)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Proprietary extension.
   *
   * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getExtensionList();
  /**
   * <pre>
   * Proprietary extension.
   *
   * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  com.google.protobuf.Any getExtension(int index);
  /**
   * <pre>
   * Proprietary extension.
   *
   * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Proprietary extension.
   *
   * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Proprietary extension.
   *
   * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  com.google.protobuf.AnyOrBuilder getExtensionOrBuilder(
      int index);
}