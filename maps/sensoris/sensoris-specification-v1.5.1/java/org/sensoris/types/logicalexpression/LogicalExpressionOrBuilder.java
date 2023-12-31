/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/logical_expression.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.types.logicalexpression;

public interface LogicalExpressionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.types.logicalexpression.LogicalExpression)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Negates the overall boolean result.
   *
   * If set to TRUE, the boolean result changes from TRUE to FALSE and respectively from FALSE to TRUE. If not set, the boolean result is not negated.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue not = 1;</code>
   * @return Whether the not field is set.
   */
  boolean hasNot();
  /**
   * <pre>
   * Negates the overall boolean result.
   *
   * If set to TRUE, the boolean result changes from TRUE to FALSE and respectively from FALSE to TRUE. If not set, the boolean result is not negated.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue not = 1;</code>
   * @return The not.
   */
  com.google.protobuf.BoolValue getNot();
  /**
   * <pre>
   * Negates the overall boolean result.
   *
   * If set to TRUE, the boolean result changes from TRUE to FALSE and respectively from FALSE to TRUE. If not set, the boolean result is not negated.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue not = 1;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getNotOrBuilder();

  /**
   * <pre>
   * Logical boolean operator for all elements of the field operand.
   *
   * The usage of the operator follows the rules:
   * - If the field operand has more than one element, UNKNOWN_LOGICAL_OPERATOR shall not be used. If the field operand has exactly one element, then the operand is not evaluated.
   * - Applying the operator AND to a list of elements [A, B, C] returns TRUE if every element is TRUE and FALSE otherwise. Evaluation of the operator can return early with FALSE for the first element being FALSE.
   * - Applying the operator OR to a list of elements [A, B, C] returns FALSE if every element is FALSE and TRUE otherwise. Evaluation of the operator can return early with TRUE for the first element being TRUE.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.logicalexpression.LogicalExpression.LogicalOperator operator = 2;</code>
   * @return The enum numeric value on the wire for operator.
   */
  int getOperatorValue();
  /**
   * <pre>
   * Logical boolean operator for all elements of the field operand.
   *
   * The usage of the operator follows the rules:
   * - If the field operand has more than one element, UNKNOWN_LOGICAL_OPERATOR shall not be used. If the field operand has exactly one element, then the operand is not evaluated.
   * - Applying the operator AND to a list of elements [A, B, C] returns TRUE if every element is TRUE and FALSE otherwise. Evaluation of the operator can return early with FALSE for the first element being FALSE.
   * - Applying the operator OR to a list of elements [A, B, C] returns FALSE if every element is FALSE and TRUE otherwise. Evaluation of the operator can return early with TRUE for the first element being TRUE.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.logicalexpression.LogicalExpression.LogicalOperator operator = 2;</code>
   * @return The operator.
   */
  org.sensoris.types.logicalexpression.LogicalExpression.LogicalOperator getOperator();

  /**
   * <pre>
   * Operand.
   *
   * If no operand is set, the logical expression is FALSE by definition.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.logicalexpression.LogicalExpression.LogicalOperand operand = 3;</code>
   */
  java.util.List<org.sensoris.types.logicalexpression.LogicalExpression.LogicalOperand> 
      getOperandList();
  /**
   * <pre>
   * Operand.
   *
   * If no operand is set, the logical expression is FALSE by definition.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.logicalexpression.LogicalExpression.LogicalOperand operand = 3;</code>
   */
  org.sensoris.types.logicalexpression.LogicalExpression.LogicalOperand getOperand(int index);
  /**
   * <pre>
   * Operand.
   *
   * If no operand is set, the logical expression is FALSE by definition.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.logicalexpression.LogicalExpression.LogicalOperand operand = 3;</code>
   */
  int getOperandCount();
  /**
   * <pre>
   * Operand.
   *
   * If no operand is set, the logical expression is FALSE by definition.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.logicalexpression.LogicalExpression.LogicalOperand operand = 3;</code>
   */
  java.util.List<? extends org.sensoris.types.logicalexpression.LogicalExpression.LogicalOperandOrBuilder> 
      getOperandOrBuilderList();
  /**
   * <pre>
   * Operand.
   *
   * If no operand is set, the logical expression is FALSE by definition.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.logicalexpression.LogicalExpression.LogicalOperand operand = 3;</code>
   */
  org.sensoris.types.logicalexpression.LogicalExpression.LogicalOperandOrBuilder getOperandOrBuilder(
      int index);

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
