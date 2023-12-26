/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
package sensoris.protobuf.messages.job.components.validityrestrictions;

import com.google.protobuf.Int64Value;
import org.sensoris.types.base.Int64Interval;
import org.sensoris.types.base.TimestampInterval;
import org.sensoris.types.base.Weekday;
import org.sensoris.types.jobvalidity.JobValidityRestrictions.BasicJobValidityRestrictions.CompositeTimeRange;

import static sensoris.protobuf.messages.job.utils.SensorisJobTestUtils.toTimestamp;

/**
 * Time restriction examples
 */
public class TimeRestrictions
{

	/**
	 *
	 */
	public static final CompositeTimeRange.Builder TIME_RESTRICTION_FEB_MAR;

	/**
	 * Validity restriction restrict collection to collect only
	 *  - between 2019-02-01T00:00:00 <-> 2019-03-31T23:59:59
	 *  - Saturday and sundays
	 *  - Between 8 - 20 h of local time
	 */
	public static final CompositeTimeRange.Builder TIME_RESTRICTION_8_TO_20;

	static {

		TIME_RESTRICTION_FEB_MAR = CompositeTimeRange.newBuilder()
				.addDateRange(TimestampInterval.newBuilder()
						.setStartInclusive(toTimestamp("2019-02-01T00:00:00 GMT"))
						.setEndExclusive(toTimestamp("2019-03-31T23:59:59 GMT"))
				);

		TIME_RESTRICTION_8_TO_20 = TIME_RESTRICTION_FEB_MAR
				.addWeekday(Weekday.SATURDAY)
				.addWeekday(Weekday.SUNDAY)
				.addTimeOfTheDayRange(
						Int64Interval.newBuilder()
								.setMinInclusive(Int64Value.of(8))
								.setMaxExclusive(Int64Value.of(20))
				);
	}
}
