/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/base.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.types.base;

public interface ExtensionPathOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.types.base.ExtensionPath)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Absolute path to the extension of message type Any. The path begins at message type DataMessages.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Path to_extension = 1;</code>
   * @return Whether the toExtension field is set.
   */
  boolean hasToExtension();
  /**
   * <pre>
   * Absolute path to the extension of message type Any. The path begins at message type DataMessages.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Path to_extension = 1;</code>
   * @return The toExtension.
   */
  org.sensoris.types.base.Path getToExtension();
  /**
   * <pre>
   * Absolute path to the extension of message type Any. The path begins at message type DataMessages.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Path to_extension = 1;</code>
   */
  org.sensoris.types.base.PathOrBuilder getToExtensionOrBuilder();

  /**
   * <pre>
   * Type URL of proprietary extension.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.ExtensionTypeUrl type_url = 2;</code>
   * @return Whether the typeUrl field is set.
   */
  boolean hasTypeUrl();
  /**
   * <pre>
   * Type URL of proprietary extension.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.ExtensionTypeUrl type_url = 2;</code>
   * @return The typeUrl.
   */
  org.sensoris.types.base.ExtensionTypeUrl getTypeUrl();
  /**
   * <pre>
   * Type URL of proprietary extension.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.ExtensionTypeUrl type_url = 2;</code>
   */
  org.sensoris.types.base.ExtensionTypeUrlOrBuilder getTypeUrlOrBuilder();

  /**
   * <pre>
   * Absolute path in the extension. The path begins at the message type of the extension.
   *
   * If the absolute path in the extension is not set, then the complete extension is referenced by the extension path.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Path in_extension = 3;</code>
   * @return Whether the inExtension field is set.
   */
  boolean hasInExtension();
  /**
   * <pre>
   * Absolute path in the extension. The path begins at the message type of the extension.
   *
   * If the absolute path in the extension is not set, then the complete extension is referenced by the extension path.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Path in_extension = 3;</code>
   * @return The inExtension.
   */
  org.sensoris.types.base.Path getInExtension();
  /**
   * <pre>
   * Absolute path in the extension. The path begins at the message type of the extension.
   *
   * If the absolute path in the extension is not set, then the complete extension is referenced by the extension path.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Path in_extension = 3;</code>
   */
  org.sensoris.types.base.PathOrBuilder getInExtensionOrBuilder();
}
