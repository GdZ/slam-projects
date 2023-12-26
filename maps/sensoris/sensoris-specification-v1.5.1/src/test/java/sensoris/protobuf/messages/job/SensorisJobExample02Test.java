/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
package sensoris.protobuf.messages.job;

import com.google.protobuf.util.JsonFormat;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.Test;
import org.sensoris.messages.job.JobMessages;
import org.sensoris.messages.job.JobRequestMessage;
import org.sensoris.types.jobvalidity.JobValidityRestrictions;
import org.sensoris.types.jobvalidity.JobValidityRestrictions.BasicJobValidityRestrictions;
import sensoris.protobuf.messages.job.components.CollectionActions;
import sensoris.protobuf.messages.job.components.CollectionTriggers;
import sensoris.protobuf.messages.job.components.JobMetadata;
import sensoris.protobuf.messages.job.components.MessageEnvelopes;
import sensoris.protobuf.messages.job.components.OverallRestrictions;
import sensoris.protobuf.messages.job.components.validityrestrictions.SpatialRestrictions;
import sensoris.protobuf.messages.job.components.validityrestrictions.TimeRestrictions;

import static sensoris.protobuf.messages.job.components.CollectionActions.toActions;

/*
 * SENSORIS job example 02 - Chicago along a short portion of Kennedy express way
 * Example by Requester
 *
 * It requests collections of Road attribution and vehicle path along a stretch of Kennedy express way,
 * from 2019-02-01 to 2019-03-31
 * Collection should be performed only on a day without precipitation.
 */
public class SensorisJobExample02Test
{

	private static final JobMessages.Builder COLLECTION_JOB_REQUEST_MESSAGES;

	static {
		JobValidityRestrictions.Builder JOB_VALIDITY_RESTRICTION = JobValidityRestrictions.newBuilder()
				.setBasicJobValidityRestrictions(JobValidityRestrictions.BasicJobValidityRestrictions.newBuilder()
						.setTimeRestrictions(TimeRestrictions.TIME_RESTRICTION_FEB_MAR)
						.setSpatialRestrictions(SpatialRestrictions.SPATIAL_RESTRICTION_KENNEDY_EXPY)
				);

		JobRequestMessage.Builder COLLECTION_JOB_REQUEST_MESSAGE = JobRequestMessage.newBuilder()
				.setEnvelope(MessageEnvelopes.JOB_MESSAGE_ENVELOPE_02)
				.setMetadata(JobMetadata.REQUEST_JOB_METADATA)
				.setOverallRestrictions(OverallRestrictions.REQUEST_RESTRICTIONS)
				.setValidityRestrictions(JOB_VALIDITY_RESTRICTION)
				.setCollectionTrigger(CollectionTriggers.COLLECTION_TRIGGER_NO_PRECIPITATION)
				.setActions(toActions(CollectionActions.COLLECTION_ACTION_ROAD_ATTRIBUTION_WITH_PATH));

		// ****************
		// JobMessages Root
		// ****************

		COLLECTION_JOB_REQUEST_MESSAGES = JobMessages.newBuilder()
				.setEnvelope(MessageEnvelopes.MESSAGES_ENVELOPE)
				.addJobRequestMessage(COLLECTION_JOB_REQUEST_MESSAGE);
	}

	@Test
	public void writeExampleToJson() throws IOException {
		final JobMessages jobMessages = COLLECTION_JOB_REQUEST_MESSAGES.build();

		try (FileWriter jsonFw = new FileWriter("src/test/resources/examples/job/job-example02.json")) {
			jsonFw.write(JsonFormat.printer().print(jobMessages));
		}
	}

}
