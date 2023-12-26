/*
 * Copyright (c) 2017-2021 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
package sensoris.protobuf.messages.job.components;

import com.google.protobuf.BoolValue;
import com.google.protobuf.Int64Value;
import org.sensoris.categories.weather.Precipitation;
import org.sensoris.messages.job.JobRequestMessage;
import org.sensoris.types.base.Int64ValueAndExponent;
import org.sensoris.types.collection.CollectionExtents;
import org.sensoris.types.logicalexpression.LogicalExpression;
import org.sensoris.types.logicalexpression.LogicalExpression.LogicalOperand;
import org.sensoris.types.logicalexpression.LogicalExpression.LogicalOperand.ComparisonExpression;
import org.sensoris.types.logicalexpression.LogicalExpression.LogicalOperand.ComparisonExpression.Operation;
import org.sensoris.types.logicalexpression.LogicalExpression.LogicalOperand.ComparisonExpression.Operation.Operand;

import static sensoris.protobuf.messages.job.utils.SensorisJobTestUtils.toAbsolutePath;

/**
 * Example collection triggers
 */
public class CollectionTriggers
{
	/**
	 *  CollectionTrigger which triggers collection if there si no precipitation
	 */
	public static final JobRequestMessage.CollectionTrigger.Builder COLLECTION_TRIGGER_NO_PRECIPITATION;

	/**
	 *  CollectionTrigger which "always" triggers collection
	 */
	public static final JobRequestMessage.CollectionTrigger.Builder COLLECTION_TRIGGER_ALWAYS;

	static {

		// Operand of no precipitation
		LogicalOperand.Builder LOGICAL_OPERAND_NO_PRECIPITATION = LogicalOperand.newBuilder()
				.setComparisonExpression(ComparisonExpression.newBuilder()
						.setNot(BoolValue.of(true))
						// data_message (2) -> event_group (2) -> weather_category (4) -> precipitation (2) -> type_and_confidence (3) -> type (1)
						.setFirstOperation(Operation.newBuilder()
								.setFirstOperand(Operand.newBuilder()
										.setEventFieldValue(toAbsolutePath("2.2.4.2.3.1"))
								)
								.setOperator(Operation.OperationType.NO_OPERATION)
						)
						.setOperator(ComparisonExpression.ComparisonOperatorType.EQUAL)
						// No precipitation Precipitation.TypeAndConfidence.Type.NONE
						.setSecondOperation(Operation.newBuilder()
								.setFirstOperand(Operand.newBuilder()
										.setInt64ValueAndExponent(Int64ValueAndExponent.newBuilder()
												.setValue(Precipitation.TypeAndConfidence.Type.NONE.getNumber())
										)
								)
								.setOperator(Operation.OperationType.NO_OPERATION)
						)
				);

		LogicalExpression.Builder LOGICAL_EXPRESSION_NO_PRECIPITATION = LogicalExpression.newBuilder()
				.addOperand(LOGICAL_OPERAND_NO_PRECIPITATION);

		COLLECTION_TRIGGER_NO_PRECIPITATION = JobRequestMessage.CollectionTrigger.newBuilder()
				.setCollectionCondition(LOGICAL_EXPRESSION_NO_PRECIPITATION)
				.setMaxExtentsPerCollectionEvent(CollectionExtents.newBuilder()
						.setCount(Int64Value.of(100))
						.setDataMessageSize(Int64Value.of(1024)) // Limited to 1kb
				);

		// Allways True Operand
		LogicalOperand.Builder LOGICAL_OPERAND_ALWAYS_TRUE = LogicalOperand.newBuilder()
				.setComparisonExpression(ComparisonExpression.newBuilder()
						.setFirstOperation(Operation.newBuilder()
												.setFirstOperand(Operand.newBuilder()
												.setBoolValue(BoolValue.of(true)))
												.setOperator(Operation.OperationType.NO_OPERATION)
								)
						.setOperator(ComparisonExpression.ComparisonOperatorType.EQUAL)
						.setSecondOperation(Operation.newBuilder()
								.setFirstOperand(Operand.newBuilder()
										.setBoolValue(BoolValue.of(true)))
								.setOperator(Operation.OperationType.NO_OPERATION)
						)
				);
		LogicalExpression.Builder LOGICAL_EXPRESSION_ALWAYS_TRUE = LogicalExpression.newBuilder()
				.addOperand(LOGICAL_OPERAND_ALWAYS_TRUE);

		COLLECTION_TRIGGER_ALWAYS = JobRequestMessage.CollectionTrigger.newBuilder()
				.setCollectionCondition(LOGICAL_EXPRESSION_ALWAYS_TRUE);
	}
}
