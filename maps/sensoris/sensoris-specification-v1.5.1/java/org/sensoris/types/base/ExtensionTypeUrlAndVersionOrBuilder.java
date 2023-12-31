/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/base.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.types.base;

public interface ExtensionTypeUrlAndVersionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.types.base.ExtensionTypeUrlAndVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type URL of proprietary extension.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.ExtensionTypeUrl type_url = 1;</code>
   * @return Whether the typeUrl field is set.
   */
  boolean hasTypeUrl();
  /**
   * <pre>
   * Type URL of proprietary extension.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.ExtensionTypeUrl type_url = 1;</code>
   * @return The typeUrl.
   */
  org.sensoris.types.base.ExtensionTypeUrl getTypeUrl();
  /**
   * <pre>
   * Type URL of proprietary extension.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.ExtensionTypeUrl type_url = 1;</code>
   */
  org.sensoris.types.base.ExtensionTypeUrlOrBuilder getTypeUrlOrBuilder();

  /**
   * <pre>
   * Version.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Version version = 2;</code>
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   * <pre>
   * Version.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Version version = 2;</code>
   * @return The version.
   */
  org.sensoris.types.base.Version getVersion();
  /**
   * <pre>
   * Version.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Version version = 2;</code>
   */
  org.sensoris.types.base.VersionOrBuilder getVersionOrBuilder();
}
