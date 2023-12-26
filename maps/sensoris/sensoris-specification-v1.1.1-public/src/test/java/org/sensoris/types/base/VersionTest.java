/*
 * Copyright (c) 2017, 2020 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
package org.sensoris.types.base;

import static org.junit.Assert.assertEquals;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import org.junit.Test;

/**
 * Tests for {@link Version}.
 */
public class VersionTest {

  // Valid version with all fields set.
  public static final Version VALID;

  // Valid version with all fields set with fields set to different values than for VALID.
  public static final Version VALID_DISJOINT;

  static {
    VALID = Version.newBuilder() //
        .setMajor(Int64Value.of(1L)) //
        .setMinor(Int64Value.of(2L)) //
        .setPatch(Int64Value.of(3L)) //
        .setName(StringValue.of("SNAPSHOT")) //
        .build();

    VALID_DISJOINT = Version.newBuilder() //
        .setMajor(Int64Value.of(4L)) //
        .setMinor(Int64Value.of(5L)) //
        .setPatch(Int64Value.of(6L)) //
        .setName(StringValue.of("RC1")) //
        .build();
  }

  @Test
  public void staticBuild() {
    assertEquals(1, VALID.getMajor().getValue());
    assertEquals(2, VALID.getMinor().getValue());
    assertEquals(3, VALID.getPatch().getValue());
    assertEquals("SNAPSHOT", VALID.getName().getValue());

    assertEquals(4, VALID_DISJOINT.getMajor().getValue());
    assertEquals(5, VALID_DISJOINT.getMinor().getValue());
    assertEquals(6, VALID_DISJOINT.getPatch().getValue());
    assertEquals("RC1", VALID_DISJOINT.getName().getValue());
  }

}
