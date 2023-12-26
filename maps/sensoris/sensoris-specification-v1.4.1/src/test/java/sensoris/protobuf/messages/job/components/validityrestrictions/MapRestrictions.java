/*
 * Copyright (c) 2017, 2020 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 */
package sensoris.protobuf.messages.job.components.validityrestrictions;

import com.google.protobuf.BoolValue;
import com.google.protobuf.StringValue;
import org.sensoris.types.jobvalidity.JobValidityRestrictions.BasicJobValidityRestrictions.MapRestriction;
import org.sensoris.types.map.MapAttributeAndValue;

import static sensoris.protobuf.messages.job.utils.SensorisJobTestUtils.toMapAttribute;

/**
 * Map restrictions examples
 */
public class MapRestrictions {

	public static final MapRestriction.Builder MAP_RESTRICTIONS_FC;

	static {
		// Here's HD live map FC 3 to 4
		MapAttributeAndValue.Builder MAP_ATTRIBUTE_VALUE_FC = MapAttributeAndValue.newBuilder()
				.setAttribute(toMapAttribute("urn:map-attribute:HERE:HDLM:1.1:123:FC"))
				.setValues(StringValue.of("3-4"));

		MAP_RESTRICTIONS_FC = MapRestriction.newBuilder()
				.setIgnoreIfNotSupported(BoolValue.of(true))
				.setMapAttributeAndValue(MAP_ATTRIBUTE_VALUE_FC);
	}
}
