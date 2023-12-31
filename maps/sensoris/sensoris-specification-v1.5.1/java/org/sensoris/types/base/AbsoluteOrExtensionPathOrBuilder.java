/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/base.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.types.base;

public interface AbsoluteOrExtensionPathOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.types.base.AbsoluteOrExtensionPath)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Absolute path through the message structure by defined field numbers in the protobuf schema. The path begins at message type DataMessages.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Path absolute = 1;</code>
   * @return Whether the absolute field is set.
   */
  boolean hasAbsolute();
  /**
   * <pre>
   * Absolute path through the message structure by defined field numbers in the protobuf schema. The path begins at message type DataMessages.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Path absolute = 1;</code>
   * @return The absolute.
   */
  org.sensoris.types.base.Path getAbsolute();
  /**
   * <pre>
   * Absolute path through the message structure by defined field numbers in the protobuf schema. The path begins at message type DataMessages.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Path absolute = 1;</code>
   */
  org.sensoris.types.base.PathOrBuilder getAbsoluteOrBuilder();

  /**
   * <pre>
   * Path through the message structure for proprietary extension.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.ExtensionPath extension = 2;</code>
   * @return Whether the extension field is set.
   */
  boolean hasExtension();
  /**
   * <pre>
   * Path through the message structure for proprietary extension.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.ExtensionPath extension = 2;</code>
   * @return The extension.
   */
  org.sensoris.types.base.ExtensionPath getExtension();
  /**
   * <pre>
   * Path through the message structure for proprietary extension.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.ExtensionPath extension = 2;</code>
   */
  org.sensoris.types.base.ExtensionPathOrBuilder getExtensionOrBuilder();

  org.sensoris.types.base.AbsoluteOrExtensionPath.PathCase getPathCase();
}
