/*
 * Copyright (c) 2017, 2020 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
package sensoris.protobuf.messages.job.components;

import static java.lang.Boolean.FALSE;
import static sensoris.protobuf.messages.job.utils.SensorisJobTestUtils.toAbsolutePath;
import com.google.protobuf.BoolValue;
import com.google.protobuf.Int64Value;
import org.sensoris.messages.job.JobRequestMessage;
import org.sensoris.types.collection.CollectionAction;
import org.sensoris.types.collection.CollectionAction.CollectionTask;
import org.sensoris.types.collection.CollectionAction.CollectionTask.CollectionConfiguration;
import org.sensoris.types.collection.CollectionAction.CollectionTask.CollectionConfiguration.TriggerFrequency;
import org.sensoris.types.collection.CollectionAction.CollectionTask.CollectionConfiguration.TriggerFrequency.Type;
import org.sensoris.types.collection.CollectionAction.CollectionTask.CollectionEventOrEventField;

/**
 * CollectionAction examples
 */
public class CollectionActions  {

	/**
	 * Collection Action collects all Traffic signs and and vehicle position and orientation
	 */
	public static final CollectionAction.Builder COLLECTION_ACTION_TRAFFIC_SIGNS_WITH_PATH_WITHNERBY_PATH;

	/**
	 * Collection Action collects all Road attributions and and vehicle position and orientation
	 */
	public static final CollectionAction.Builder COLLECTION_ACTION_ROAD_ATTRIBUTION_WITH_PATH;

	/**
	 * Collection Action collects all EventGroups
	 */
	public static final CollectionAction.Builder COLLECTION_ACTION_ALL_EVENT_GROUPS;

	static {

		// Collect traffic signs
		CollectionAction.CollectionTask.Builder COLLECTION_TASK_VEHICLE_TRAFFIC_SIGN_WITH_NEARBY_PATH = CollectionTask.newBuilder()
				.setPreventOverlappingByTime(BoolValue.of(FALSE))
				// data_message (2) -> event_group (2) -> traffic_regulation_category (8) -> traffic_sign (2)
				.addCollectionEventOrEventField(CollectionEventOrEventField.newBuilder()
						.setEventOrEventFieldToCollect(toAbsolutePath("2.2.8.2"))
						.setCurrentValue(BoolValue.of(true))
						.setOptional(BoolValue.of(false))
				)
				// data_message (2) -> event_group (2) -> localization_category (2) ->  vehicle_position_and_orientation (2) -> position_and_accuracy (2)
				.addCollectionEventOrEventField(CollectionEventOrEventField.newBuilder()
						.setEventOrEventFieldToCollect(toAbsolutePath("2.2.2.2.2"))
						.setCurrentValue(BoolValue.of(true))
						.setOptional(BoolValue.of(false))
				)
				.setCollectionConfiguration(CollectionConfiguration.newBuilder()
						.setTriggerFrequency(TriggerFrequency.newBuilder().setType(Type.ON_CHANGE).setValue(Int64Value.of(1)))
						.setPreTriggerOffset(toTriggerOffset(50, CollectionConfiguration.TriggerOffset.Type.DISTANCE))
						.setPostTriggerOffset(toTriggerOffset(50, CollectionConfiguration.TriggerOffset.Type.DISTANCE))
				)
				.setOptional(BoolValue.of(false));

		// Collect Road attribution
		CollectionAction.CollectionTask.Builder COLLECTION_TASK_VEHICLE_ROAD_ATTRIBUTION = CollectionAction.CollectionTask.newBuilder()
				.setPreventOverlappingByTime(BoolValue.of(FALSE))
				// data_message (2) -> event_group (2) -> road_attribution_category (7)
				.addCollectionEventOrEventField(CollectionEventOrEventField.newBuilder()
						.setEventOrEventFieldToCollect(toAbsolutePath("2.2.7"))
						.setCurrentValue(BoolValue.of(true))
						.setOptional(BoolValue.of(false))
				)
				.setCollectionConfiguration(CollectionConfiguration.newBuilder()
						.setTriggerFrequency(TriggerFrequency.newBuilder().setType(Type.NATIVE_FREQUENCY))
				)
				.setOptional(BoolValue.of(false));

		// Collect vehicle position and orientation
		CollectionAction.CollectionTask.Builder COLLECTION_TASK_VEHICLE_POSITION = CollectionAction.CollectionTask.newBuilder()
				.setPreventOverlappingByTime(BoolValue.of(FALSE))
				// data_message (2) -> event_group (2) -> localization_category (2) ->  vehicle_position_and_orientation (2) -> position_and_accuracy (2)
				.addCollectionEventOrEventField(CollectionEventOrEventField.newBuilder()
						.setEventOrEventFieldToCollect(toAbsolutePath("2.2.2.2.2"))
						.setCurrentValue(BoolValue.of(true))
						.setOptional(BoolValue.of(false))
				)
				// data_message (2) -> event_group (2) -> localization_category (2) ->  vehicle_position_and_orientation (2) -> orientation_and_accuracy (3)
				.addCollectionEventOrEventField(CollectionEventOrEventField.newBuilder()
						.setEventOrEventFieldToCollect(toAbsolutePath("2.2.2.2.3"))
						.setCurrentValue(BoolValue.of(true))
						.setOptional(BoolValue.of(false))
				)
				.setCollectionConfiguration(CollectionConfiguration.newBuilder()
						.setTriggerFrequency(TriggerFrequency.newBuilder().setType(Type.NATIVE_FREQUENCY))
				)
				.setOptional(BoolValue.of(false));

		COLLECTION_ACTION_TRAFFIC_SIGNS_WITH_PATH_WITHNERBY_PATH = CollectionAction.newBuilder()
				.addCollectionTask(COLLECTION_TASK_VEHICLE_TRAFFIC_SIGN_WITH_NEARBY_PATH);

		COLLECTION_ACTION_ROAD_ATTRIBUTION_WITH_PATH = CollectionAction.newBuilder()
				.addCollectionTask(COLLECTION_TASK_VEHICLE_ROAD_ATTRIBUTION)
				.addCollectionTask(COLLECTION_TASK_VEHICLE_POSITION);


		// Collect everything
		CollectionAction.CollectionTask.Builder COLLECTION_TASK_ALL_EVENT_GROUPS = CollectionAction.CollectionTask.newBuilder()
				.setPreventOverlappingByTime(BoolValue.of(FALSE))
				.addCollectionEventOrEventField(toOptionalCollectionEventOrEventField("2.2.2")	)
				.addCollectionEventOrEventField(toOptionalCollectionEventOrEventField("2.2.3")	)
				.addCollectionEventOrEventField(toOptionalCollectionEventOrEventField("2.2.4")	)
				.addCollectionEventOrEventField(toOptionalCollectionEventOrEventField("2.2.5")	)
				.addCollectionEventOrEventField(toOptionalCollectionEventOrEventField("2.2.6")	)
				.addCollectionEventOrEventField(toOptionalCollectionEventOrEventField("2.2.7")	)
				.addCollectionEventOrEventField(toOptionalCollectionEventOrEventField("2.2.8")	)
				.addCollectionEventOrEventField(toOptionalCollectionEventOrEventField("2.2.9")	)
				.addCollectionEventOrEventField(toOptionalCollectionEventOrEventField("2.2.10"))
				.addCollectionEventOrEventField(toOptionalCollectionEventOrEventField("2.2.11"))
				.addCollectionEventOrEventField(toOptionalCollectionEventOrEventField("2.2.12"))
				.addCollectionEventOrEventField(toOptionalCollectionEventOrEventField("2.2.13"))
				.setCollectionConfiguration(CollectionConfiguration.newBuilder()
						.setTriggerFrequency(TriggerFrequency.newBuilder().setType(Type.NATIVE_FREQUENCY))
				)
				.setOptional(BoolValue.of(false));

		COLLECTION_ACTION_ALL_EVENT_GROUPS = CollectionAction.newBuilder()
				.addCollectionTask(COLLECTION_TASK_ALL_EVENT_GROUPS);
	}

	/**
	 * Bundles a {@link CollectionAction.Builder} to a {@link JobRequestMessage.Actions.Builder} message
	 * @param collectionActionBuilder {@link CollectionAction.Builder} to be bundled
	 * @return result {@link JobRequestMessage.Actions.Builder}
	 */
	public static JobRequestMessage.Actions.Builder toActions(CollectionAction.Builder collectionActionBuilder) {
		return JobRequestMessage.Actions.newBuilder()
				.setCollectionAction(collectionActionBuilder);
	}

	public static CollectionEventOrEventField.Builder toOptionalCollectionEventOrEventField(String path) {
		return CollectionEventOrEventField.newBuilder()
				.setEventOrEventFieldToCollect(toAbsolutePath(path))
				.setCurrentValue(BoolValue.of(true))
				.setOptional(BoolValue.of(true));
	}

	public static CollectionConfiguration.TriggerOffset.Builder toTriggerOffset(int offset, CollectionConfiguration.TriggerOffset.Type triggerType) {
		return CollectionConfiguration.TriggerOffset.newBuilder()
				.setType(triggerType)
				.setTypeValue(offset);
	}
}
