/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
package org.sensoris.types.base;

import static org.junit.Assert.assertEquals;
import com.google.protobuf.StringValue;
import org.junit.Test;

/**
 * Tests for {@link Entity}.
 */
public class EntityTest {

  // Valid entity with all fields set.
  public static final Entity VALID;

  // Valid entity with all fields set with fields set to different values than for VALID.
  public static final Entity VALID_DISJOINT;

  static {
    VALID = Entity.newBuilder() //
        .setPrimaryId(StringValue.of("P")) //
        .setSecondaryId(StringValue.of("S")) //
        .setType(StringValue.of("T")) //
        .setSoftwareVersion(VersionTest.VALID) //
        .setHardwareVersion(VersionTest.VALID_DISJOINT) //
        .build();

    VALID_DISJOINT = Entity.newBuilder() //
        .setPrimaryId(StringValue.of("U")) //
        .setSecondaryId(StringValue.of("V")) //
        .setType(StringValue.of("W")) //
        .setSoftwareVersion(VersionTest.VALID_DISJOINT) //
        .setHardwareVersion(VersionTest.VALID) //
        .build();
  }

  @Test
  public void staticBuild() {
    assertEquals("P", VALID.getPrimaryId().getValue());
    assertEquals("S", VALID.getSecondaryId().getValue());
    assertEquals("T", VALID.getType().getValue());
    assertEquals(VersionTest.VALID, VALID.getSoftwareVersion());
    assertEquals(VersionTest.VALID_DISJOINT, VALID.getHardwareVersion());

    assertEquals("U", VALID_DISJOINT.getPrimaryId().getValue());
    assertEquals("V", VALID_DISJOINT.getSecondaryId().getValue());
    assertEquals("W", VALID_DISJOINT.getType().getValue());
    assertEquals(VersionTest.VALID_DISJOINT, VALID_DISJOINT.getSoftwareVersion());
    assertEquals(VersionTest.VALID, VALID_DISJOINT.getHardwareVersion());
  }

}
