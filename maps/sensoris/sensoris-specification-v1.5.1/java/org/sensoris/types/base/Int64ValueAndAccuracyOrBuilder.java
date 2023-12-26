/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/base.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.types.base;

public interface Int64ValueAndAccuracyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.types.base.Int64ValueAndAccuracy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Value and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy.ValueAndAccuracy value_and_accuracy = 1;</code>
   * @return Whether the valueAndAccuracy field is set.
   */
  boolean hasValueAndAccuracy();
  /**
   * <pre>
   * Value and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy.ValueAndAccuracy value_and_accuracy = 1;</code>
   * @return The valueAndAccuracy.
   */
  org.sensoris.types.base.Int64ValueAndAccuracy.ValueAndAccuracy getValueAndAccuracy();
  /**
   * <pre>
   * Value and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy.ValueAndAccuracy value_and_accuracy = 1;</code>
   */
  org.sensoris.types.base.Int64ValueAndAccuracy.ValueAndAccuracyOrBuilder getValueAndAccuracyOrBuilder();

  /**
   * <pre>
   * Statistic measure and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64StatisticMeasureAndAccuracy statistic_measure_and_accuracy = 2;</code>
   * @return Whether the statisticMeasureAndAccuracy field is set.
   */
  boolean hasStatisticMeasureAndAccuracy();
  /**
   * <pre>
   * Statistic measure and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64StatisticMeasureAndAccuracy statistic_measure_and_accuracy = 2;</code>
   * @return The statisticMeasureAndAccuracy.
   */
  org.sensoris.types.base.Int64StatisticMeasureAndAccuracy getStatisticMeasureAndAccuracy();
  /**
   * <pre>
   * Statistic measure and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64StatisticMeasureAndAccuracy statistic_measure_and_accuracy = 2;</code>
   */
  org.sensoris.types.base.Int64StatisticMeasureAndAccuracyOrBuilder getStatisticMeasureAndAccuracyOrBuilder();

  /**
   * <pre>
   * Absolute histogram.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.AbsoluteInt64Histogram absolute_histogram = 3;</code>
   * @return Whether the absoluteHistogram field is set.
   */
  boolean hasAbsoluteHistogram();
  /**
   * <pre>
   * Absolute histogram.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.AbsoluteInt64Histogram absolute_histogram = 3;</code>
   * @return The absoluteHistogram.
   */
  org.sensoris.types.base.AbsoluteInt64Histogram getAbsoluteHistogram();
  /**
   * <pre>
   * Absolute histogram.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.AbsoluteInt64Histogram absolute_histogram = 3;</code>
   */
  org.sensoris.types.base.AbsoluteInt64HistogramOrBuilder getAbsoluteHistogramOrBuilder();

  /**
   * <pre>
   * Relative histogram.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.RelativeInt64Histogram relative_histogram = 4;</code>
   * @return Whether the relativeHistogram field is set.
   */
  boolean hasRelativeHistogram();
  /**
   * <pre>
   * Relative histogram.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.RelativeInt64Histogram relative_histogram = 4;</code>
   * @return The relativeHistogram.
   */
  org.sensoris.types.base.RelativeInt64Histogram getRelativeHistogram();
  /**
   * <pre>
   * Relative histogram.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.RelativeInt64Histogram relative_histogram = 4;</code>
   */
  org.sensoris.types.base.RelativeInt64HistogramOrBuilder getRelativeHistogramOrBuilder();

  /**
   * <pre>
   * Gaussian distribution.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64GaussianDistribution gaussian_distribution = 5;</code>
   * @return Whether the gaussianDistribution field is set.
   */
  boolean hasGaussianDistribution();
  /**
   * <pre>
   * Gaussian distribution.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64GaussianDistribution gaussian_distribution = 5;</code>
   * @return The gaussianDistribution.
   */
  org.sensoris.types.base.Int64GaussianDistribution getGaussianDistribution();
  /**
   * <pre>
   * Gaussian distribution.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64GaussianDistribution gaussian_distribution = 5;</code>
   */
  org.sensoris.types.base.Int64GaussianDistributionOrBuilder getGaussianDistributionOrBuilder();

  org.sensoris.types.base.Int64ValueAndAccuracy.ValueOneofCase getValueOneofCase();
}
