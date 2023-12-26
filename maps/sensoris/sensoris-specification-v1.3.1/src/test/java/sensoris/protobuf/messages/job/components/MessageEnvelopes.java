/*
 * Copyright (c) 2017-2021 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
package sensoris.protobuf.messages.job.components;

import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import org.sensoris.messages.job.JobMessageEnvelope;
import org.sensoris.types.base.Entity;
import org.sensoris.types.base.MessagesEnvelope;
import org.sensoris.types.base.Version;
import org.sensoris.types.job.Ids;

public class MessageEnvelopes
{
	/**
	 * Basic Messages envelope example
	 */
	public final static MessagesEnvelope.Builder MESSAGES_ENVELOPE;

	/**
	 * Minimal Messages envelope example
	 */
	public final static MessagesEnvelope.Builder MESSAGES_ENVELOPE_MINIMAL;
	/**
	 * Basic Job message envelope example 01
	 */
	public final static JobMessageEnvelope.Builder JOB_MESSAGE_ENVELOPE_01;

	/**
	 * Basic Job message envelope example 02
	 */
	public final static JobMessageEnvelope.Builder JOB_MESSAGE_ENVELOPE_02;

	/**
	 * Minimal Job message envelope example
	 */
	public final static JobMessageEnvelope.Builder JOB_MESSAGE_ENVELOPE_MINIMAL;

	static {

		Version.Builder SENSORIS_VERSION = Version.newBuilder()
				.setMajor(Int64Value.of(1))
				.setMinor(Int64Value.of(1))
				.setPatch(Int64Value.of(0));

		Version.Builder COLLECTOR_SOFTWARE_VERSION = Version.newBuilder()
				.setMajor(Int64Value.of(2))
				.setMinor(Int64Value.of(0))
				.setPatch(Int64Value.of(1))
				.setName(StringValue.of("PROD001"));

		Entity.Builder SUBMITTER_ENTITY_SOFTWARE = Entity.newBuilder()
				.setPrimaryId(StringValue.of("Campaign management"))
				.setType(StringValue.of("CampaignManagement"))
				.setSoftwareVersion(COLLECTOR_SOFTWARE_VERSION);

		// ** JobMessages envelope

		MESSAGES_ENVELOPE = MessagesEnvelope.newBuilder()
				.setVersion(SENSORIS_VERSION)
				.addSubmitter(SUBMITTER_ENTITY_SOFTWARE);

		MESSAGES_ENVELOPE_MINIMAL = MessagesEnvelope.newBuilder()
				.setVersion(SENSORIS_VERSION);

		// ** JobMessageEnvelope **

		Entity.Builder SUBMITTER_ENTITY = Entity.newBuilder()
				.setPrimaryId(StringValue.of("Data processor LTD"))
				.setType(StringValue.of("REQUESTER"));

		Ids.Builder JOB_IDS_01 = Ids.newBuilder()
				.addSubmitter(SUBMITTER_ENTITY)
				.addSubmitter(SUBMITTER_ENTITY_SOFTWARE)
				.addJobId(StringValue.of("C1-0001-0003-2019-10-12-TEST"));

		JOB_MESSAGE_ENVELOPE_01 = JobMessageEnvelope.newBuilder()
				.setJobIds(JOB_IDS_01);

		Ids.Builder JOB_IDS_02 = Ids.newBuilder()
				.addSubmitter(SUBMITTER_ENTITY)
				.addSubmitter(SUBMITTER_ENTITY_SOFTWARE)
				.addJobId(StringValue.of("C1-0002-0003-2019-10-12-TEST"));

		JOB_MESSAGE_ENVELOPE_02 = JobMessageEnvelope.newBuilder()
				.setJobIds(JOB_IDS_02);

		Ids.Builder JOB_IDS_MINIMAL = Ids.newBuilder()
				.addJobId(StringValue.of("C1-0003-3333-2019-10-12-TEST"));

		JOB_MESSAGE_ENVELOPE_MINIMAL = JobMessageEnvelope.newBuilder()
				.setJobIds(JOB_IDS_MINIMAL);

	}
}
