/*
 * Copyright (c) 2017, 2020 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
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
