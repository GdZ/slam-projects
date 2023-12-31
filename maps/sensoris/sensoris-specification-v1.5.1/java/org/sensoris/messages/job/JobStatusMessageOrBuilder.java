/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/messages/job.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.messages.job;

public interface JobStatusMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.messages.job.JobStatusMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.messages.job.JobMessageEnvelope envelope = 1;</code>
   * @return Whether the envelope field is set.
   */
  boolean hasEnvelope();
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.messages.job.JobMessageEnvelope envelope = 1;</code>
   * @return The envelope.
   */
  org.sensoris.messages.job.JobMessageEnvelope getEnvelope();
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.messages.job.JobMessageEnvelope envelope = 1;</code>
   */
  org.sensoris.messages.job.JobMessageEnvelopeOrBuilder getEnvelopeOrBuilder();

  /**
   * <pre>
   * Timestamp.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Timestamp timestamp = 2;</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <pre>
   * Timestamp.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Timestamp timestamp = 2;</code>
   * @return The timestamp.
   */
  org.sensoris.types.base.Timestamp getTimestamp();
  /**
   * <pre>
   * Timestamp.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Timestamp timestamp = 2;</code>
   */
  org.sensoris.types.base.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <pre>
   * Status.
   * </pre>
   *
   * <code>.sensoris.protobuf.messages.job.JobStatusMessage.Status status = 3;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Status.
   * </pre>
   *
   * <code>.sensoris.protobuf.messages.job.JobStatusMessage.Status status = 3;</code>
   * @return The status.
   */
  org.sensoris.messages.job.JobStatusMessage.Status getStatus();

  /**
   * <pre>
   * Provides additional details regarding the status of the job.
   * </pre>
   *
   * <code>.google.protobuf.StringValue details = 4;</code>
   * @return Whether the details field is set.
   */
  boolean hasDetails();
  /**
   * <pre>
   * Provides additional details regarding the status of the job.
   * </pre>
   *
   * <code>.google.protobuf.StringValue details = 4;</code>
   * @return The details.
   */
  com.google.protobuf.StringValue getDetails();
  /**
   * <pre>
   * Provides additional details regarding the status of the job.
   * </pre>
   *
   * <code>.google.protobuf.StringValue details = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getDetailsOrBuilder();

  /**
   * <pre>
   * Proprietary extension.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getExtensionList();
  /**
   * <pre>
   * Proprietary extension.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  com.google.protobuf.Any getExtension(int index);
  /**
   * <pre>
   * Proprietary extension.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Proprietary extension.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Proprietary extension.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  com.google.protobuf.AnyOrBuilder getExtensionOrBuilder(
      int index);
}
