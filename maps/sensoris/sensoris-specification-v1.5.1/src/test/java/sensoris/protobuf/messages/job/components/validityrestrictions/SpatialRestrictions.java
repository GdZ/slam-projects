/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
package sensoris.protobuf.messages.job.components.validityrestrictions;

import com.google.protobuf.BoolValue;
import com.google.protobuf.Int64Value;
import org.sensoris.types.jobvalidity.JobValidityRestrictions.BasicJobValidityRestrictions.CompositeLocation;
import org.sensoris.types.spatial.CircleAndAccuracy;
import org.sensoris.types.spatial.DirectedPolylineCorridor;
import org.sensoris.types.spatial.PolylineAndAccuracy;
import org.sensoris.types.spatial.PolylineCorridorAndAccuracy;

import static sensoris.protobuf.messages.job.utils.SensorisJobTestUtils.toGeoPoint;
import static sensoris.protobuf.messages.job.utils.SensorisJobTestUtils.toInt64valueAndAccuracy;

/**
 * Spatial restriction examples
 */
public class SpatialRestrictions
{
	/**
	 * 1 km circle radius in Chicago at north west corner of the loop
	 */
	public static final CompositeLocation.Builder SPATIAL_RESTRICTION_CHICAGO_CIRCLE = CompositeLocation.newBuilder()
			.addCircle(
					CircleAndAccuracy.newBuilder()
							.setCenterPositionAndAccuracy(toGeoPoint(41.88443271,-87.6388410))
							.setRadiusAndAccuracy(toInt64valueAndAccuracy(1000))
			);

	/**
	 * Corridor defined along Kennedy express way in Chicago
	 * Corridor width is 40m, Heading deviation +-30deg, minimum overlap 30%
	 */
	public static final CompositeLocation.Builder SPATIAL_RESTRICTION_KENNEDY_EXPY = CompositeLocation.newBuilder()
			.addDirectedPolylineCorridor(DirectedPolylineCorridor.newBuilder()
					.setPolylineCorridor(PolylineCorridorAndAccuracy.newBuilder()
						.setCenterPolylineAndAccuracy(PolylineAndAccuracy.newBuilder()
							.addPositionAndAccuracy(toGeoPoint(41.906042735668926, -87.6611136752366))
							.addPositionAndAccuracy(toGeoPoint(41.90648988519033, -87.66131752312174))
							.addPositionAndAccuracy(toGeoPoint(41.90687315371602, -87.66151064217081))
							.addPositionAndAccuracy(toGeoPoint(41.90732828210177, -87.66186469376078))
							.addPositionAndAccuracy(toGeoPoint(41.90799100710692, -87.66249769508829))
							.addPositionAndAccuracy(toGeoPoint(41.908446127523376, -87.66300195038309))
							.addPositionAndAccuracy(toGeoPoint(41.90917271655098, -87.66378515541544))
							.addPositionAndAccuracy(toGeoPoint(41.90993921908862, -87.66447180092325))
							.addPositionAndAccuracy(toGeoPoint(41.91132848147934, -87.66539448082438))
							.addPositionAndAccuracy(toGeoPoint(41.915116862334315, -87.66772800266733))
							.addPositionAndAccuracy(toGeoPoint(41.91621860423277, -87.66862922489634))
							.addPositionAndAccuracy(toGeoPoint(41.917320327112115, -87.66968065083017))
							.addPositionAndAccuracy(toGeoPoint(41.918358164601194, -87.67120414555063))
							.addPositionAndAccuracy(toGeoPoint(41.9202581618076, -87.67446571171274))
							.addPositionAndAccuracy(toGeoPoint(41.92706869323566, -87.68645719755722))
						)
						.setTotalWidthAndAccuracy(toInt64valueAndAccuracy(4000))
					)
					.setIsBidirectional(BoolValue.of(true))
					.setHeadingDeviationFromCenterLine(Int64Value.of(30))
			);
}
