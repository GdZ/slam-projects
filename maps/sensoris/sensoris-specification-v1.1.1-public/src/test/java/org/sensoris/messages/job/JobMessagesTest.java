/*
 * Copyright (c) 2017, 2020 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
package org.sensoris.messages.job;

import static org.junit.Assert.assertEquals;
import com.google.protobuf.StringValue;
import org.junit.Test;
import org.sensoris.types.base.Entity;
import org.sensoris.types.base.MessagesEnvelopeTest;
import org.sensoris.types.base.VersionTest;
import org.sensoris.types.job.Ids;

/**
 * Tests for {@link JobMessages}.
 */
public class JobMessagesTest {

  // Valid job messages with all fields set.
  public static final JobMessages VALID;

  static {
    VALID = JobMessages.newBuilder() //
        .setEnvelope(MessagesEnvelopeTest.VALID) //
        .addJobRequestMessage(JobRequestMessage.newBuilder() //
            .setEnvelope(JobMessageEnvelope.newBuilder() //
                .setJobIds(Ids.newBuilder() //
                    .addSubmitter(Entity.newBuilder() //
                        .setPrimaryId(StringValue.of("Vehicle Cloud")) //
                        .setSecondaryId(StringValue.of("Weather Job Manager")) //
                        .setSoftwareVersion(VersionTest.VALID_DISJOINT) //
                        .build()) //
                    .addJobId(StringValue.of("Weather Country A")) //
                    .addJobId(StringValue.of("Region 1")) //
                    .addVehicleFleetId(StringValue.of("Model A")) //
                    .addVehicleFleetId(StringValue.of("Model B")) //
                    .build()) //
                .build()) //
            .build()) //
        .build();
  }

  @Test
  public void staticBuild() {
    assertEquals(MessagesEnvelopeTest.VALID, VALID.getEnvelope());
  }

}
