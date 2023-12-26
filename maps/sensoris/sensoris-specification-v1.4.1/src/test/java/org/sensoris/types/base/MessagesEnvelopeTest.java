/*
 * Copyright (c) 2017, 2020 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 */
package org.sensoris.types.base;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Tests for {@link MessagesEnvelope}.
 */
public class MessagesEnvelopeTest {

  // Valid messages envelope with all fields set.
  public static final MessagesEnvelope VALID;

  static {
    VALID = MessagesEnvelope.newBuilder() //
        .setVersion(VersionTest.VALID) //
        .addSubmitter(EntityTest.VALID) //
        .build();
  }

  @Test
  public void staticBuild() {
    assertEquals(VersionTest.VALID, VALID.getVersion());
    assertEquals(1, VALID.getSubmitterCount());
    assertEquals(EntityTest.VALID, VALID.getSubmitter(0));
  }

}
