/*
 * Copyright (c) 2017-2021 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
package sensoris.protobuf.messages.job;

import org.sensoris.messages.job.JobRequestMessage;
import sensoris.protobuf.messages.job.components.SupportedSensorisVersions;

/**
 * Example job metadata
 */
public class JobCapabilityRequirements
{

	/**
	 * Required SENSORIS data messages and job message versions
	 */
	public static final JobRequestMessage.CapabilityRequirements.Builder JOB_CAPABILITY_REQUIREMENTS;

	static {
		JOB_CAPABILITY_REQUIREMENTS = JobRequestMessage.CapabilityRequirements.newBuilder()
				.setSupportedDataMessagesVersions(SupportedSensorisVersions.SUPPORTED_DATA_MESSAGES_VERSION);
	}
}
