/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
package sensoris.protobuf.messages.job.utils;

import org.junit.Test;
import org.sensoris.types.base.AbsoluteOrExtensionPath;
import org.sensoris.types.base.Int64Value;
import org.sensoris.types.base.Int64ValueAndAccuracy;
import org.sensoris.types.base.Timestamp;
import org.sensoris.types.base.Urn;
import org.sensoris.types.map.MapAttribute;
import org.sensoris.types.spatial.PositionAndAccuracy;

import static org.junit.Assert.assertEquals;

import static sensoris.protobuf.messages.job.utils.SensorisJobTestUtils.GEO_LAT_LON_PRECISION_MULTIPLIER;
import static sensoris.protobuf.messages.job.utils.SensorisJobTestUtils.toAbsolutePath;
import static sensoris.protobuf.messages.job.utils.SensorisJobTestUtils.toGeoPoint;
import static sensoris.protobuf.messages.job.utils.SensorisJobTestUtils.toInt64valueAndAccuracy;
import static sensoris.protobuf.messages.job.utils.SensorisJobTestUtils.toInt64Value;
import static sensoris.protobuf.messages.job.utils.SensorisJobTestUtils.toTimestamp;
import static sensoris.protobuf.messages.job.utils.SensorisJobTestUtils.toUrn;
import static sensoris.protobuf.messages.job.utils.SensorisJobTestUtils.toMapAttribute;

/**
 * Test of {@link SensorisJobTestUtils}
 */
public class SensorisJobTestUtilsTest
{
	@Test
	public void toGeoPointCreatesACorrectPosition() {
		double lat = 10.5234567;
		double lon = 11.5234567;

		PositionAndAccuracy positionMessage = toGeoPoint(lat, lon);

		assertEquals(lat, ((double) positionMessage.getGeographicWgs84().getLatitude().getValue()) / GEO_LAT_LON_PRECISION_MULTIPLIER,
				0.00000001);
		assertEquals(lon, ((double) positionMessage.getGeographicWgs84().getLongitude().getValue()) / GEO_LAT_LON_PRECISION_MULTIPLIER,
				0.00000001);
	}

	@Test
	public void toTwoParameterInt64valueAndAccuracyCreatesACorrectValue() {
		long val = 1234L;
		long accuracy = 1000L;

		Int64ValueAndAccuracy int64ValueMessage = SensorisJobTestUtils.toInt64valueAndAccuracy(val, accuracy);

		assertEquals(val, int64ValueMessage.getValueAndAccuracy().getValue());
		assertEquals(accuracy, int64ValueMessage.getValueAndAccuracy().getAccuracy().getValue());
	}

@Test
	public void toOneParameterInt64valueAndAccuracyCreatesACorrectValue() {
	long val = 1234L;

	Int64ValueAndAccuracy int64ValueMessage = toInt64valueAndAccuracy(val);

	assertEquals(val, int64ValueMessage.getValueAndAccuracy().getValue());
	assertEquals(1L, int64ValueMessage.getValueAndAccuracy().getAccuracy().getValue());
	}

	@Test
	public void toTwoParametersInt64valueCreatesACorrectValue() {
		double val = 1234.12345678;
		double multiplier = 1e8;

		Int64Value value64Message = toInt64Value(val, multiplier);

		assertEquals(val, ((double) value64Message.getValue()) / multiplier, 0.00000001);
	}

	@Test
	public void toOneParameterInt64valueCreatesACorrectValue() {
		double val = 1234.0;

		Int64Value value64Message = toInt64Value(val, 1.0);

		assertEquals(val, (double) value64Message.getValue(), 0.00000001);
	}

	@Test
	public void toUrnCreatesACorrectUrn() {
		String urn = "test-test1";

		Urn urnMessage = toUrn(urn);

		assertEquals(urn, urnMessage.getValue());
	}

	@Test
	public void toMapAttributeCreatesACorrectMapAttribute() {
		String mapAttribute = "urn:map-attribute:HERE:HDLM:1.1:123:FC";

		MapAttribute mapAttributeMessage = toMapAttribute(mapAttribute);

		assertEquals(mapAttribute, mapAttributeMessage.getUrn().getValue());
	}

	@Test
	public void toAbsolutePathCreatesCorrectAbsolulePath() {
		String path = "1.2.3.4";

		AbsoluteOrExtensionPath absolutePathMessage = toAbsolutePath(path);

		assertEquals(4, absolutePathMessage.getAbsolute().getFieldNumberCount());
		assertEquals(1L, absolutePathMessage.getAbsolute().getFieldNumber(0));
		assertEquals(2L, absolutePathMessage.getAbsolute().getFieldNumber(1));
		assertEquals(3L, absolutePathMessage.getAbsolute().getFieldNumber(2));
		assertEquals(4L, absolutePathMessage.getAbsolute().getFieldNumber(3));
	}

	@Test
	public void toTimestampCreatesCorrectTimestamp() {
		String utcTime = "2019-02-01T00:00:00 GMT";

		Timestamp timeStampMessage = toTimestamp(utcTime);

		assertEquals(1548979200000L, timeStampMessage.getPosixTime().getValue());
	}

	@Test (expected = RuntimeException.class)
	public void toTimestampThrowsRuntimeExceptionForInvalidTime() {
		String utcTime = "INVALID-TIME";

		Timestamp timeStampMessage = toTimestamp(utcTime);
	}
}
