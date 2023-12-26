/*
 * Copyright (c) 2017, 2020 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 */
package sensoris.protobuf.messages.job.components;

import com.google.protobuf.BoolValue;
import com.google.protobuf.Int64Value;
import org.sensoris.messages.job.JobRequestMessage;

/**
 * Example job metadata
 */
public class JobMetadata {

	public static final JobRequestMessage.Metadata.Builder REQUEST_JOB_METADATA;

	static {
		REQUEST_JOB_METADATA = JobRequestMessage.Metadata.newBuilder()
				.setPriority(Int64Value.of(10))
				.setRequestedSubmitBefore(Int64Value.of(60 * 60 * 6)) 		// Max 6 hour latency
				.setInvalidateMessageAfter(Int64Value.of(60 * 60 * 24))		// Invalidate after a day
				.setCollectWhenAccessoryIsTurnedOff(BoolValue.of(false));
	}
}
