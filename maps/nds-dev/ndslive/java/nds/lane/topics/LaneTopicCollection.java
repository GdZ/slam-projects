/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.lane.topics;

public class LaneTopicCollection
{
    public LaneTopicCollection(zserio.runtime.pubsub.PubsubInterface pubsub)
    {
        this.pubsub = pubsub;
    }

    public void publishLaneGroups(nds.lane.topics.LaneGroupsOnPathTopic message)
    {
        publishLaneGroups(message, null);
    }

    public void publishLaneGroups(nds.lane.topics.LaneGroupsOnPathTopic message,
            java.lang.Object context)
    {
        publish("nds/vehicle/+/path/+/lane/connectivity", message, context);
    }

    public int subscribeLaneGroups(
            zserio.runtime.pubsub.PubsubCallback<nds.lane.topics.LaneGroupsOnPathTopic> callback)
    {
        return subscribeLaneGroups(callback, null);
    }

    public int subscribeLaneGroups(
            zserio.runtime.pubsub.PubsubCallback<nds.lane.topics.LaneGroupsOnPathTopic> callback,
            java.lang.Object context)
    {
        final zserio.runtime.pubsub.PubsubInterface.Callback onRaw =
            new zserio.runtime.pubsub.PubsubInterface.Callback()
            {
                @Override
                public void invoke(java.lang.String topic, byte[] data)
                {
                    onRawLaneGroups(callback, topic, data);
                }
            };
        return pubsub.subscribe("nds/vehicle/+/path/+/lane/connectivity", onRaw, context);
    }

    public void publishLaneCenterlineGeometry(nds.lane.topics.LaneGeometryOnPathTopic message)
    {
        publishLaneCenterlineGeometry(message, null);
    }

    public void publishLaneCenterlineGeometry(nds.lane.topics.LaneGeometryOnPathTopic message,
            java.lang.Object context)
    {
        publish("nds/vehicle/+/path/+/lane/geometry", message, context);
    }

    public int subscribeLaneCenterlineGeometry(
            zserio.runtime.pubsub.PubsubCallback<nds.lane.topics.LaneGeometryOnPathTopic> callback)
    {
        return subscribeLaneCenterlineGeometry(callback, null);
    }

    public int subscribeLaneCenterlineGeometry(
            zserio.runtime.pubsub.PubsubCallback<nds.lane.topics.LaneGeometryOnPathTopic> callback,
            java.lang.Object context)
    {
        final zserio.runtime.pubsub.PubsubInterface.Callback onRaw =
            new zserio.runtime.pubsub.PubsubInterface.Callback()
            {
                @Override
                public void invoke(java.lang.String topic, byte[] data)
                {
                    onRawLaneCenterlineGeometry(callback, topic, data);
                }
            };
        return pubsub.subscribe("nds/vehicle/+/path/+/lane/geometry", onRaw, context);
    }

    public void publishLaneBoundaryGeometry(nds.lane.topics.LaneBoundaryGeometryOnPathTopic message)
    {
        publishLaneBoundaryGeometry(message, null);
    }

    public void publishLaneBoundaryGeometry(nds.lane.topics.LaneBoundaryGeometryOnPathTopic message,
            java.lang.Object context)
    {
        publish("nds/vehicle/+/path/+/lane/geometry/boundary", message, context);
    }

    public int subscribeLaneBoundaryGeometry(
            zserio.runtime.pubsub.PubsubCallback<nds.lane.topics.LaneBoundaryGeometryOnPathTopic> callback)
    {
        return subscribeLaneBoundaryGeometry(callback, null);
    }

    public int subscribeLaneBoundaryGeometry(
            zserio.runtime.pubsub.PubsubCallback<nds.lane.topics.LaneBoundaryGeometryOnPathTopic> callback,
            java.lang.Object context)
    {
        final zserio.runtime.pubsub.PubsubInterface.Callback onRaw =
            new zserio.runtime.pubsub.PubsubInterface.Callback()
            {
                @Override
                public void invoke(java.lang.String topic, byte[] data)
                {
                    onRawLaneBoundaryGeometry(callback, topic, data);
                }
            };
        return pubsub.subscribe("nds/vehicle/+/path/+/lane/geometry/boundary", onRaw, context);
    }

    public void unsubscribe(int subscriptionId)
    {
        pubsub.unsubscribe(subscriptionId);
    }

    private void onRawLaneGroups(
            zserio.runtime.pubsub.PubsubCallback<nds.lane.topics.LaneGroupsOnPathTopic> callback,
            java.lang.String topic, byte[] data)
    {
        try
        {
            final zserio.runtime.io.ByteArrayBitStreamReader reader =
                    new zserio.runtime.io.ByteArrayBitStreamReader(data);
            final nds.lane.topics.LaneGroupsOnPathTopic message = new nds.lane.topics.LaneGroupsOnPathTopic(reader);
            callback.invoke(topic, message);
        }
        catch (java.io.IOException exception)
        {
            throw new zserio.runtime.ZserioError("LaneTopicCollection: " + exception, exception);
        }
    }

    private void onRawLaneCenterlineGeometry(
            zserio.runtime.pubsub.PubsubCallback<nds.lane.topics.LaneGeometryOnPathTopic> callback,
            java.lang.String topic, byte[] data)
    {
        try
        {
            final zserio.runtime.io.ByteArrayBitStreamReader reader =
                    new zserio.runtime.io.ByteArrayBitStreamReader(data);
            final nds.lane.topics.LaneGeometryOnPathTopic message = new nds.lane.topics.LaneGeometryOnPathTopic(reader);
            callback.invoke(topic, message);
        }
        catch (java.io.IOException exception)
        {
            throw new zserio.runtime.ZserioError("LaneTopicCollection: " + exception, exception);
        }
    }

    private void onRawLaneBoundaryGeometry(
            zserio.runtime.pubsub.PubsubCallback<nds.lane.topics.LaneBoundaryGeometryOnPathTopic> callback,
            java.lang.String topic, byte[] data)
    {
        try
        {
            final zserio.runtime.io.ByteArrayBitStreamReader reader =
                    new zserio.runtime.io.ByteArrayBitStreamReader(data);
            final nds.lane.topics.LaneBoundaryGeometryOnPathTopic message = new nds.lane.topics.LaneBoundaryGeometryOnPathTopic(reader);
            callback.invoke(topic, message);
        }
        catch (java.io.IOException exception)
        {
            throw new zserio.runtime.ZserioError("LaneTopicCollection: " + exception, exception);
        }
    }

    private <ZSERIO_MESSAGE extends zserio.runtime.io.Writer> void publish(
            java.lang.String topic, ZSERIO_MESSAGE message, java.lang.Object context)
    {
        try
        {
            final zserio.runtime.io.ByteArrayBitStreamWriter writer =
                    new zserio.runtime.io.ByteArrayBitStreamWriter();
            message.write(writer);
            final byte[] data = writer.toByteArray();
            pubsub.publish(topic, data, context);
        }
        catch (java.io.IOException exception)
        {
            throw new zserio.runtime.ZserioError("LaneTopicCollection: " + exception, exception);
        }
    }

    private final zserio.runtime.pubsub.PubsubInterface pubsub;
}
