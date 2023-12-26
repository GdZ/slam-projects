/*
 * Copyright (c) 2017-2021 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
package sensoris.protobuf.messages.job.utils;

import com.google.protobuf.Int64Value;
import org.sensoris.types.base.AbsoluteOrExtensionPath;
import org.sensoris.types.base.Int64ValueAndAccuracy;
import org.sensoris.types.base.Path;
import org.sensoris.types.base.Timestamp;
import org.sensoris.types.base.Urn;
import org.sensoris.types.map.MapAttribute;
import org.sensoris.types.spatial.PositionAndAccuracy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.stream.Stream;

/**
 * Test tools used to generate SENSORIS job message
 */
public class SensorisJobTestUtils
{
	/**
	 * Geo lattitude, logitude multiplier used by examples
	 */
	static double GEO_LAT_LON_PRECISION_MULTIPLIER = 1e8;

	/**
	 * Builds a {@link PositionAndAccuracy}
	 * @param latitudeDeg Logitude of the point in degrees
	 * @param longitudeDeg Lattitude fo the point in degrees
	 * @return A 2D Geographical Point in WGS84
	 */
	static public PositionAndAccuracy toGeoPoint(double latitudeDeg, double longitudeDeg) {
		return PositionAndAccuracy.newBuilder()
				.setGeographicWgs84(
						PositionAndAccuracy.Geographic.newBuilder()
								.setLatitude(toInt64Value(latitudeDeg, GEO_LAT_LON_PRECISION_MULTIPLIER))
								.setLongitude(toInt64Value(longitudeDeg, GEO_LAT_LON_PRECISION_MULTIPLIER))
				).build();
	}

	/**
	 * Builds a {@link Int64ValueAndAccuracy}
	 * @param val Main value
	 * @param accuracy Accuracy of the value.
	 * @return A compound type {@link Int64ValueAndAccuracy} with provided value and accuracy
	 */
	static public Int64ValueAndAccuracy toInt64valueAndAccuracy(long val, long accuracy){
		return Int64ValueAndAccuracy.newBuilder()
				.setValueAndAccuracy(
						Int64ValueAndAccuracy.ValueAndAccuracy.newBuilder()
								.setValue(val)
								.setAccuracy(Int64Value.of(accuracy))
				).build();
	}

	/**
	 * Builds a {@link Int64ValueAndAccuracy} with accuracy = 1
	 * @param val Main value
	 * @return A compound type {@link Int64ValueAndAccuracy} with provided value and accuracy = 1
	 */
	static public Int64ValueAndAccuracy toInt64valueAndAccuracy(long val) {
		return toInt64valueAndAccuracy(val, 1L);
	}


	/**
	 * Converts a multiplied double value to a simple {@link org.sensoris.types.base.Int64Value}
	 * @param val value to be converted
	 * @param multiplier multiplier applied before the conversion
	 * @return returned 64 bit value = val * multiplier
	 */
	static public org.sensoris.types.base.Int64Value toInt64Value(double val, double multiplier) {
		return org.sensoris.types.base.Int64Value.newBuilder().setValue(Double.valueOf(val * multiplier).longValue()).build();
	}

	/**
	 * Converts a double value to a simple {@link org.sensoris.types.base.Int64Value} with presicion 1.0
	 * @param val value to be converted
	 * @return returned 64 bit value
	 **/
	static public org.sensoris.types.base.Int64Value toInt64Value(double val) {
		return  toInt64Value(val, 1.0);
	}

	/**
	 * Converts string to a {@link org.sensoris.types.base.Urn}
	 * Note: No validity check is performed.
	 * @param urnString urn in as a string
	 * @return {@link org.sensoris.types.base.Urn} message with urnString
	 */
	static public Urn toUrn(String urnString) {
		return Urn.newBuilder().setValue(urnString).build();
	}

	/**
	 * Converts string to a {@link org.sensoris.types.map.MapAttribute}
	 * Note: No validity check is performed.
	 * @param mapAttributeString mapAttribute in as a string
	 * @return {@link org.sensoris.types.map.MapAttribute} message with the provided attribute string
	 */
	static public MapAttribute toMapAttribute(String mapAttributeString) {
		return MapAttribute.newBuilder().setUrn(toUrn(mapAttributeString)).build();
	}

	/**
	 * Creates an AbsolutePath
	 * @param path Field path as a string like 1.2.3.4.2. It is in forward order. First is the root element position etc...
	 * @return an {@link AbsoluteOrExtensionPath} with an absolute path created out of the provided string
	 */
	static public AbsoluteOrExtensionPath toAbsolutePath(String path) {
		Path.Builder resultPath = Path.newBuilder();
		Stream.of(path.split("\\.")).forEach(fn -> resultPath.addFieldNumber(Long.parseLong(fn)));

		return AbsoluteOrExtensionPath.newBuilder()
				.setAbsolute(resultPath)
				.build();
	}

	/**
	 * Converts a date-time string to a {@link Timestamp}
	 * @param dateTime Date-time in string format. Template: yyy-MM-dd'T'HH:mm:ss
	 * @return {@link Timestamp} corresponding to the provided dateString
	 * @throws RuntimeException if provided string is not a valid data-time
	 */
	static public Timestamp toTimestamp(String dateTime) {
		Date date;

		try {
			date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss Z").parse(dateTime);
		} catch (ParseException ex) {
			throw new RuntimeException("Provided string is not a valid date-time. dateTime" + dateTime, ex);
		}

		return Timestamp.newBuilder().setPosixTime(Int64Value.of(date.getTime())).build();
	}
}
