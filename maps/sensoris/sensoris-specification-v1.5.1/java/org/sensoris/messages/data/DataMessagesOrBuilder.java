/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/messages/data.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.messages.data;

public interface DataMessagesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.messages.data.DataMessages)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.messages.data.DataMessages.Envelope envelope = 1;</code>
   * @return Whether the envelope field is set.
   */
  boolean hasEnvelope();
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.messages.data.DataMessages.Envelope envelope = 1;</code>
   * @return The envelope.
   */
  org.sensoris.messages.data.DataMessages.Envelope getEnvelope();
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.messages.data.DataMessages.Envelope envelope = 1;</code>
   */
  org.sensoris.messages.data.DataMessages.EnvelopeOrBuilder getEnvelopeOrBuilder();

  /**
   * <pre>
   * Data message.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.messages.data.DataMessage data_message = 2;</code>
   */
  java.util.List<org.sensoris.messages.data.DataMessage> 
      getDataMessageList();
  /**
   * <pre>
   * Data message.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.messages.data.DataMessage data_message = 2;</code>
   */
  org.sensoris.messages.data.DataMessage getDataMessage(int index);
  /**
   * <pre>
   * Data message.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.messages.data.DataMessage data_message = 2;</code>
   */
  int getDataMessageCount();
  /**
   * <pre>
   * Data message.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.messages.data.DataMessage data_message = 2;</code>
   */
  java.util.List<? extends org.sensoris.messages.data.DataMessageOrBuilder> 
      getDataMessageOrBuilderList();
  /**
   * <pre>
   * Data message.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.messages.data.DataMessage data_message = 2;</code>
   */
  org.sensoris.messages.data.DataMessageOrBuilder getDataMessageOrBuilder(
      int index);
}
