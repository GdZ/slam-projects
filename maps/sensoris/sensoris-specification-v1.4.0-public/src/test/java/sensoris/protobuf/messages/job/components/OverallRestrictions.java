/*
 * Copyright (c) 2017, 2020 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 */
package sensoris.protobuf.messages.job.components;

import com.google.protobuf.Int64Value;
import org.sensoris.messages.job.JobRequestMessage;
import org.sensoris.messages.job.JobRequestMessage.OverallRestrictions.TimeRestrictions;
import org.sensoris.messages.job.JobRequestMessage.OverallRestrictions.TimeRestrictions.TimeUnitAndValue;
import org.sensoris.types.base.TimeUnit;
import org.sensoris.types.collection.CollectionExtents;

public class OverallRestrictions
{
	public static JobRequestMessage.OverallRestrictions.Builder REQUEST_RESTRICTIONS;

	static {

		// 10 submissions a day
		JobRequestMessage.OverallRestrictions.TimeRestrictions.Builder REQUEST_RESTRICTION_TIME_10_A_DAY =
				TimeRestrictions.newBuilder()
				.setTimeUnitAndValue(
						TimeUnitAndValue.newBuilder()
								.setUnit(TimeUnit.DAY)
								.setValue(Int64Value.of(1))
				)
				.setSubmissionsPerTimeUnit(Int64Value.of(10));

		CollectionExtents.Builder COLLECTION_EXTENTS = CollectionExtents.newBuilder()
				.setCount(Int64Value.of(100000))
				.setDataMessageSize(Int64Value.of(1204 * 1024 * 100)) // Limited to 100MB
				.setPathLength(Int64Value.of(100000)) // Limited to 100 km
				.setDuration(Int64Value.of(60 * 60 * 24)); // 24 h

		REQUEST_RESTRICTIONS = JobRequestMessage.OverallRestrictions.newBuilder()
				.setMaxSubmissionsPerTime(REQUEST_RESTRICTION_TIME_10_A_DAY)
				.setMaxSubmissionsPerSpatialRestriction(Int64Value.of(10000))
				.setTotalCollectionExtent(COLLECTION_EXTENTS);
	}
}
