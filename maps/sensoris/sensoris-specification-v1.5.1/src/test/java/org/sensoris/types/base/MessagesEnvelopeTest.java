/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
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
