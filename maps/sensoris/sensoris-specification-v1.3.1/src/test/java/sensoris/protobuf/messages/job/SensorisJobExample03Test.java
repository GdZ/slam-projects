/*
 * Copyright (c) 2017-2021 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
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
import sensoris.protobuf.messages.job.components.CollectionActions;
import sensoris.protobuf.messages.job.components.CollectionTriggers;
import sensoris.protobuf.messages.job.components.MessageEnvelopes;

import static sensoris.protobuf.messages.job.components.CollectionActions.toActions;

/**
 *  SENSORIS job minimal request example
 *  It requests all available  categories everywhere
 *  between 1-May-2019 and 31-May-2019
 */
public class SensorisJobExample03Test
{

	public static final JobMessages.Builder COLLECTION_JOB_REQUEST_MESSAGES;

	static {

		JobRequestMessage.Builder COLLECTION_JOB_REQUEST_MESSAGE = JobRequestMessage.newBuilder()
				.setEnvelope(MessageEnvelopes.JOB_MESSAGE_ENVELOPE_MINIMAL)
				.setCapabilityRequirements(JobCapabilityRequirements.JOB_CAPABILITY_REQUIREMENTS)
				.setCollectionTrigger(CollectionTriggers.COLLECTION_TRIGGER_ALWAYS)
				.setActions(toActions(CollectionActions.COLLECTION_ACTION_ALL_EVENT_GROUPS));

		// ****************
		// JobMessages Root
		// ****************
		COLLECTION_JOB_REQUEST_MESSAGES = JobMessages.newBuilder()
				.setEnvelope(MessageEnvelopes.MESSAGES_ENVELOPE_MINIMAL)
				.addJobRequestMessage(COLLECTION_JOB_REQUEST_MESSAGE);
	}

	@Test
	public void writeExampleToJson() throws IOException {
		final JobMessages jobMessages = COLLECTION_JOB_REQUEST_MESSAGES.build();

		try (FileWriter jsonFw = new FileWriter("src/test/resources/examples/job/job-example03.json")) {
			jsonFw.write(JsonFormat.printer().print(jobMessages));
		}
	}

}
