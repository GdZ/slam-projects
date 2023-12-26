/*
 * Copyright (c) 2017, 2020 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 */
package sensoris.protobuf.messages.job.components;

import com.google.protobuf.BoolValue;
import org.junit.Test;
import org.sensoris.messages.job.JobRequestMessage;
import org.sensoris.types.collection.CollectionAction;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Test of {@link JobRequestMessage.Actions}
 */
public class CollectionActionsTest {

	@Test
	public void toActionsCreatesCorrectActionsBuilder() {
		CollectionAction.Builder collectionAction = CollectionAction.newBuilder()
				.addCollectionTask(CollectionAction.CollectionTask.newBuilder()
						.mergeOptional(BoolValue.of(false))
				);

		JobRequestMessage.Actions.Builder actions = CollectionActions.toActions(collectionAction);

		assertEquals(1, actions.getCollectionAction().getCollectionTaskCount());
		assertFalse(actions.getCollectionAction().getCollectionTask(0).getOptional().getValue());
	}

}
