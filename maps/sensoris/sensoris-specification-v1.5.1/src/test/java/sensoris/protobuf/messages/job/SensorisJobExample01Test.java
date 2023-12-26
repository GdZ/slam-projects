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
import sensoris.protobuf.messages.job.components.CollectionActions;
import sensoris.protobuf.messages.job.components.CollectionTriggers;
import sensoris.protobuf.messages.job.components.JobMetadata;
import sensoris.protobuf.messages.job.components.MessageEnvelopes;
import sensoris.protobuf.messages.job.components.OverallRestrictions;
import sensoris.protobuf.messages.job.components.validityrestrictions.SpatialRestrictions;
import sensoris.protobuf.messages.job.components.validityrestrictions.MapRestrictions;
import sensoris.protobuf.messages.job.components.validityrestrictions.TimeRestrictions;

import static sensoris.protobuf.messages.job.components.CollectionActions.toActions;

/*
 * SENSORIS job example 01 - Chicago downtown
 * Example by Requester
 *
 * It requests collections of Traffic signs with vehicle path 50m before and 50m after the sign observation
 * in a circle area in Chicago downtown,
 * from 2019-02-01 to 2019-03-31 on Weekends from 8 to 20 h local time on FC3-4 roads based on Here's HDLM.
 * Collection should be performed only on a day without precipitation.
 *
 * 1 vehicle should submit only once a day
 * Max collection extent is up to 100000 events, 100 MB, 100 km and 24 h
 */
public class SensorisJobExample01Test
{

	private static final JobMessages.Builder COLLECTION_JOB_REQUEST_MESSAGES;

	static {
		JobValidityRestrictions.Builder JOB_VALIDITY_RESTRICTION = JobValidityRestrictions.newBuilder()
								.setBasicJobValidityRestrictions(JobValidityRestrictions.BasicJobValidityRestrictions.newBuilder()
								.setTimeRestrictions(TimeRestrictions.TIME_RESTRICTION_8_TO_20)
								.setSpatialRestrictions(SpatialRestrictions.SPATIAL_RESTRICTION_CHICAGO_CIRCLE)
								.addMapRestriction(MapRestrictions.MAP_RESTRICTIONS_FC)
				);

		JobRequestMessage.Builder COLLECTION_JOB_REQUEST_MESSAGE = JobRequestMessage.newBuilder()
				.setEnvelope(MessageEnvelopes.JOB_MESSAGE_ENVELOPE_01)
				.setMetadata(JobMetadata.REQUEST_JOB_METADATA)
				.setCapabilityRequirements(JobCapabilityRequirements.JOB_CAPABILITY_REQUIREMENTS)
				.setOverallRestrictions(OverallRestrictions.REQUEST_RESTRICTIONS)
				.setValidityRestrictions(JOB_VALIDITY_RESTRICTION)
				.setCollectionTrigger(CollectionTriggers.COLLECTION_TRIGGER_NO_PRECIPITATION)
				.setActions(toActions(CollectionActions.COLLECTION_ACTION_TRAFFIC_SIGNS_WITH_PATH_WITHNERBY_PATH));

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

		try (FileWriter jsonFw = new FileWriter("src/test/resources/examples/job/job-example01.json")) {
			jsonFw.write(JsonFormat.printer().print(jobMessages));
		}
	}

}
