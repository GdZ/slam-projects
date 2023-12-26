// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/brake.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.categories.brake;

public interface BrakeSystemsStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.brake.BrakeSystemsStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Event envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
   * @return Whether the envelope field is set.
   */
  boolean hasEnvelope();
  /**
   * <pre>
   * Event envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
   * @return The envelope.
   */
  org.sensoris.types.base.EventEnvelope getEnvelope();
  /**
   * <pre>
   * Event envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
   */
  org.sensoris.types.base.EventEnvelopeOrBuilder getEnvelopeOrBuilder();

  /**
   * <pre>
   * Status of Anti-lock Breaking System (ABS).
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.SystemStatus abs_status = 2;</code>
   * @return The enum numeric value on the wire for absStatus.
   */
  int getAbsStatusValue();
  /**
   * <pre>
   * Status of Anti-lock Breaking System (ABS).
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.SystemStatus abs_status = 2;</code>
   * @return The absStatus.
   */
  org.sensoris.types.base.SystemStatus getAbsStatus();

  /**
   * <pre>
   * Status of Electronic Stability Control (ESC).
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.SystemStatus esc_status = 3;</code>
   * @return The enum numeric value on the wire for escStatus.
   */
  int getEscStatusValue();
  /**
   * <pre>
   * Status of Electronic Stability Control (ESC).
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.SystemStatus esc_status = 3;</code>
   * @return The escStatus.
   */
  org.sensoris.types.base.SystemStatus getEscStatus();

  /**
   * <pre>
   * Status of Traction Control System (TCS).
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.SystemStatus tcs_status = 4;</code>
   * @return The enum numeric value on the wire for tcsStatus.
   */
  int getTcsStatusValue();
  /**
   * <pre>
   * Status of Traction Control System (TCS).
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.SystemStatus tcs_status = 4;</code>
   * @return The tcsStatus.
   */
  org.sensoris.types.base.SystemStatus getTcsStatus();

  /**
   * <pre>
   * Status of Electronic Brakeforce Distribution (EBD).
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.SystemStatus ebd_status = 5;</code>
   * @return The enum numeric value on the wire for ebdStatus.
   */
  int getEbdStatusValue();
  /**
   * <pre>
   * Status of Electronic Brakeforce Distribution (EBD).
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.SystemStatus ebd_status = 5;</code>
   * @return The ebdStatus.
   */
  org.sensoris.types.base.SystemStatus getEbdStatus();

  /**
   * <pre>
   * Status of Emergency Brake Assist (EBA).
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.SystemStatus eba_status = 6;</code>
   * @return The enum numeric value on the wire for ebaStatus.
   */
  int getEbaStatusValue();
  /**
   * <pre>
   * Status of Emergency Brake Assist (EBA).
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.SystemStatus eba_status = 6;</code>
   * @return The ebaStatus.
   */
  org.sensoris.types.base.SystemStatus getEbaStatus();
}