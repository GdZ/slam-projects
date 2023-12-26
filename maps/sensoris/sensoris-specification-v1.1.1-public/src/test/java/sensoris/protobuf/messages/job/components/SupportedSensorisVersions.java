/*
 * Copyright (c) 2017, 2020 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
package sensoris.protobuf.messages.job.components;

import com.google.protobuf.Int64Value;
import org.sensoris.messages.job.JobRequestMessage;
import org.sensoris.types.base.Version;
import org.sensoris.types.base.VersionRange;

/**
 * Supported SENSORIS version related messages
 */
public class SupportedSensorisVersions {

	/**
	 * Data message version range required as a response to the request
	 * 1.0.0 -> 1.0.1
	 */
	public final static JobRequestMessage.CapabilityRequirements.DataMessagesVersion.Builder SUPPORTED_DATA_MESSAGES_VERSION;

	static {
		// Supported SENSORIS version
		Version.Builder SUPPORTED_SENSORIS_VERSION_FROM = Version.newBuilder()
				.setMajor(Int64Value.of(1))
				.setMinor(Int64Value.of(0))
				.setPatch(Int64Value.of(0));

		Version.Builder SUPPORTED_SENSORIS_VERSION_TO = Version.newBuilder()
				.setMajor(Int64Value.of(1))
				.setMinor(Int64Value.of(0))
				.setPatch(Int64Value.of(1));

		VersionRange.Builder SUPPORTED_SENSORIS_VERSION_RANGE = VersionRange.newBuilder()
				.setMinInclusive(SUPPORTED_SENSORIS_VERSION_FROM)
				.setMaxExclusive(SUPPORTED_SENSORIS_VERSION_TO);

		SUPPORTED_DATA_MESSAGES_VERSION = JobRequestMessage.CapabilityRequirements.DataMessagesVersion.newBuilder()
				.addVersionRange(SUPPORTED_SENSORIS_VERSION_RANGE);
	}
}
