/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/base.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.types.base;

public interface UrnOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.types.base.Urn)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Value with syntax as defined in IETF RFC2141 specification.
   *
   * See also https://tools.ietf.org/html/rfc2141.
   * </pre>
   *
   * <code>string value = 1;</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <pre>
   * Value with syntax as defined in IETF RFC2141 specification.
   *
   * See also https://tools.ietf.org/html/rfc2141.
   * </pre>
   *
   * <code>string value = 1;</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();
}
