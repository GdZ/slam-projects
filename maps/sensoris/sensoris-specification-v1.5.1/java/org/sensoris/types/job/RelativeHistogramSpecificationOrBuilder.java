/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/job.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.types.job;

public interface RelativeHistogramSpecificationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.types.job.RelativeHistogramSpecification)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Minimum total elements.
   *
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value minimum_total_elements = 1;</code>
   * @return Whether the minimumTotalElements field is set.
   */
  boolean hasMinimumTotalElements();
  /**
   * <pre>
   * Minimum total elements.
   *
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value minimum_total_elements = 1;</code>
   * @return The minimumTotalElements.
   */
  com.google.protobuf.Int64Value getMinimumTotalElements();
  /**
   * <pre>
   * Minimum total elements.
   *
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value minimum_total_elements = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getMinimumTotalElementsOrBuilder();

  /**
   * <pre>
   * Lower endpoint of first bin.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndExponent lower_endpoint_inclusive = 2;</code>
   * @return Whether the lowerEndpointInclusive field is set.
   */
  boolean hasLowerEndpointInclusive();
  /**
   * <pre>
   * Lower endpoint of first bin.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndExponent lower_endpoint_inclusive = 2;</code>
   * @return The lowerEndpointInclusive.
   */
  org.sensoris.types.base.Int64ValueAndExponent getLowerEndpointInclusive();
  /**
   * <pre>
   * Lower endpoint of first bin.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndExponent lower_endpoint_inclusive = 2;</code>
   */
  org.sensoris.types.base.Int64ValueAndExponentOrBuilder getLowerEndpointInclusiveOrBuilder();

  /**
   * <pre>
   * Bins.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.job.HistogramSpecificationBins bins = 3;</code>
   * @return Whether the bins field is set.
   */
  boolean hasBins();
  /**
   * <pre>
   * Bins.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.job.HistogramSpecificationBins bins = 3;</code>
   * @return The bins.
   */
  org.sensoris.types.job.HistogramSpecificationBins getBins();
  /**
   * <pre>
   * Bins.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.job.HistogramSpecificationBins bins = 3;</code>
   */
  org.sensoris.types.job.HistogramSpecificationBinsOrBuilder getBinsOrBuilder();

  /**
   * <pre>
   * Number of equal sized bins.
   *
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value number_of_bins = 4;</code>
   * @return Whether the numberOfBins field is set.
   */
  boolean hasNumberOfBins();
  /**
   * <pre>
   * Number of equal sized bins.
   *
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value number_of_bins = 4;</code>
   * @return The numberOfBins.
   */
  com.google.protobuf.Int64Value getNumberOfBins();
  /**
   * <pre>
   * Number of equal sized bins.
   *
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value number_of_bins = 4;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getNumberOfBinsOrBuilder();

  /**
   * <pre>
   * Upper endpoint of last bin.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndExponent upper_endpoint_inclusive = 5;</code>
   * @return Whether the upperEndpointInclusive field is set.
   */
  boolean hasUpperEndpointInclusive();
  /**
   * <pre>
   * Upper endpoint of last bin.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndExponent upper_endpoint_inclusive = 5;</code>
   * @return The upperEndpointInclusive.
   */
  org.sensoris.types.base.Int64ValueAndExponent getUpperEndpointInclusive();
  /**
   * <pre>
   * Upper endpoint of last bin.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndExponent upper_endpoint_inclusive = 5;</code>
   */
  org.sensoris.types.base.Int64ValueAndExponentOrBuilder getUpperEndpointInclusiveOrBuilder();

  /**
   * <pre>
   * Exponent for relative frequency.
   *
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range ( , )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value relative_frequency_exponent = 6;</code>
   * @return Whether the relativeFrequencyExponent field is set.
   */
  boolean hasRelativeFrequencyExponent();
  /**
   * <pre>
   * Exponent for relative frequency.
   *
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range ( , )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value relative_frequency_exponent = 6;</code>
   * @return The relativeFrequencyExponent.
   */
  com.google.protobuf.Int64Value getRelativeFrequencyExponent();
  /**
   * <pre>
   * Exponent for relative frequency.
   *
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range ( , )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value relative_frequency_exponent = 6;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getRelativeFrequencyExponentOrBuilder();

  org.sensoris.types.job.RelativeHistogramSpecification.BinsNumberOfBinsCase getBinsNumberOfBinsCase();
}
