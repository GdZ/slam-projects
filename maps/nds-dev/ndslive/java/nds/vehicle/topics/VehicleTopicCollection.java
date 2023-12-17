/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.vehicle.topics;

public class VehicleTopicCollection
{
    public VehicleTopicCollection(zserio.runtime.pubsub.PubsubInterface pubsub)
    {
        this.pubsub = pubsub;
    }

    public void publishPoseRaw(nds.vehicle.topics.PoseRawTopic message)
    {
        publishPoseRaw(message, null);
    }

    public void publishPoseRaw(nds.vehicle.topics.PoseRawTopic message,
            java.lang.Object context)
    {
        publish("nds/vehicle/+/pose/raw", message, context);
    }

    public int subscribePoseRaw(
            zserio.runtime.pubsub.PubsubCallback<nds.vehicle.topics.PoseRawTopic> callback)
    {
        return subscribePoseRaw(callback, null);
    }

    public int subscribePoseRaw(
            zserio.runtime.pubsub.PubsubCallback<nds.vehicle.topics.PoseRawTopic> callback,
            java.lang.Object context)
    {
        final zserio.runtime.pubsub.PubsubInterface.Callback onRaw =
            new zserio.runtime.pubsub.PubsubInterface.Callback()
            {
                @Override
                public void invoke(java.lang.String topic, byte[] data)
                {
                    onRawPoseRaw(callback, topic, data);
                }
            };
        return pubsub.subscribe("nds/vehicle/+/pose/raw", onRaw, context);
    }

    public void publishPoseGeoMatched(nds.vehicle.topics.PoseGeoMatchedTopic message)
    {
        publishPoseGeoMatched(message, null);
    }

    public void publishPoseGeoMatched(nds.vehicle.topics.PoseGeoMatchedTopic message,
            java.lang.Object context)
    {
        publish("nds/vehicle/+/pose/geomatched", message, context);
    }

    public int subscribePoseGeoMatched(
            zserio.runtime.pubsub.PubsubCallback<nds.vehicle.topics.PoseGeoMatchedTopic> callback)
    {
        return subscribePoseGeoMatched(callback, null);
    }

    public int subscribePoseGeoMatched(
            zserio.runtime.pubsub.PubsubCallback<nds.vehicle.topics.PoseGeoMatchedTopic> callback,
            java.lang.Object context)
    {
        final zserio.runtime.pubsub.PubsubInterface.Callback onRaw =
            new zserio.runtime.pubsub.PubsubInterface.Callback()
            {
                @Override
                public void invoke(java.lang.String topic, byte[] data)
                {
                    onRawPoseGeoMatched(callback, topic, data);
                }
            };
        return pubsub.subscribe("nds/vehicle/+/pose/geomatched", onRaw, context);
    }

    public void publishGeoRoadNetwork(nds.vehicle.topics.GeoRoadNetworkTopic message)
    {
        publishGeoRoadNetwork(message, null);
    }

    public void publishGeoRoadNetwork(nds.vehicle.topics.GeoRoadNetworkTopic message,
            java.lang.Object context)
    {
        publish("nds/vehicle/+/path/network", message, context);
    }

    public int subscribeGeoRoadNetwork(
            zserio.runtime.pubsub.PubsubCallback<nds.vehicle.topics.GeoRoadNetworkTopic> callback)
    {
        return subscribeGeoRoadNetwork(callback, null);
    }

    public int subscribeGeoRoadNetwork(
            zserio.runtime.pubsub.PubsubCallback<nds.vehicle.topics.GeoRoadNetworkTopic> callback,
            java.lang.Object context)
    {
        final zserio.runtime.pubsub.PubsubInterface.Callback onRaw =
            new zserio.runtime.pubsub.PubsubInterface.Callback()
            {
                @Override
                public void invoke(java.lang.String topic, byte[] data)
                {
                    onRawGeoRoadNetwork(callback, topic, data);
                }
            };
        return pubsub.subscribe("nds/vehicle/+/path/network", onRaw, context);
    }

    public void publishMpp(nds.vehicle.topics.MppTopic message)
    {
        publishMpp(message, null);
    }

    public void publishMpp(nds.vehicle.topics.MppTopic message,
            java.lang.Object context)
    {
        publish("nds/vehicle/+/path/mpp", message, context);
    }

    public int subscribeMpp(
            zserio.runtime.pubsub.PubsubCallback<nds.vehicle.topics.MppTopic> callback)
    {
        return subscribeMpp(callback, null);
    }

    public int subscribeMpp(
            zserio.runtime.pubsub.PubsubCallback<nds.vehicle.topics.MppTopic> callback,
            java.lang.Object context)
    {
        final zserio.runtime.pubsub.PubsubInterface.Callback onRaw =
            new zserio.runtime.pubsub.PubsubInterface.Callback()
            {
                @Override
                public void invoke(java.lang.String topic, byte[] data)
                {
                    onRawMpp(callback, topic, data);
                }
            };
        return pubsub.subscribe("nds/vehicle/+/path/mpp", onRaw, context);
    }

    public void publishMatchedGeoRoadNetwork(nds.vehicle.topics.MatchedGeoRoadNetworkTopic message)
    {
        publishMatchedGeoRoadNetwork(message, null);
    }

    public void publishMatchedGeoRoadNetwork(nds.vehicle.topics.MatchedGeoRoadNetworkTopic message,
            java.lang.Object context)
    {
        publish("nds/vehicle/+/path/network/matched", message, context);
    }

    public int subscribeMatchedGeoRoadNetwork(
            zserio.runtime.pubsub.PubsubCallback<nds.vehicle.topics.MatchedGeoRoadNetworkTopic> callback)
    {
        return subscribeMatchedGeoRoadNetwork(callback, null);
    }

    public int subscribeMatchedGeoRoadNetwork(
            zserio.runtime.pubsub.PubsubCallback<nds.vehicle.topics.MatchedGeoRoadNetworkTopic> callback,
            java.lang.Object context)
    {
        final zserio.runtime.pubsub.PubsubInterface.Callback onRaw =
            new zserio.runtime.pubsub.PubsubInterface.Callback()
            {
                @Override
                public void invoke(java.lang.String topic, byte[] data)
                {
                    onRawMatchedGeoRoadNetwork(callback, topic, data);
                }
            };
        return pubsub.subscribe("nds/vehicle/+/path/network/matched", onRaw, context);
    }

    public void unsubscribe(int subscriptionId)
    {
        pubsub.unsubscribe(subscriptionId);
    }

    private void onRawPoseRaw(
            zserio.runtime.pubsub.PubsubCallback<nds.vehicle.topics.PoseRawTopic> callback,
            java.lang.String topic, byte[] data)
    {
        try
        {
            final zserio.runtime.io.ByteArrayBitStreamReader reader =
                    new zserio.runtime.io.ByteArrayBitStreamReader(data);
            final nds.vehicle.topics.PoseRawTopic message = new nds.vehicle.topics.PoseRawTopic(reader);
            callback.invoke(topic, message);
        }
        catch (java.io.IOException exception)
        {
            throw new zserio.runtime.ZserioError("VehicleTopicCollection: " + exception, exception);
        }
    }

    private void onRawPoseGeoMatched(
            zserio.runtime.pubsub.PubsubCallback<nds.vehicle.topics.PoseGeoMatchedTopic> callback,
            java.lang.String topic, byte[] data)
    {
        try
        {
            final zserio.runtime.io.ByteArrayBitStreamReader reader =
                    new zserio.runtime.io.ByteArrayBitStreamReader(data);
            final nds.vehicle.topics.PoseGeoMatchedTopic message = new nds.vehicle.topics.PoseGeoMatchedTopic(reader);
            callback.invoke(topic, message);
        }
        catch (java.io.IOException exception)
        {
            throw new zserio.runtime.ZserioError("VehicleTopicCollection: " + exception, exception);
        }
    }

    private void onRawGeoRoadNetwork(
            zserio.runtime.pubsub.PubsubCallback<nds.vehicle.topics.GeoRoadNetworkTopic> callback,
            java.lang.String topic, byte[] data)
    {
        try
        {
            final zserio.runtime.io.ByteArrayBitStreamReader reader =
                    new zserio.runtime.io.ByteArrayBitStreamReader(data);
            final nds.vehicle.topics.GeoRoadNetworkTopic message = new nds.vehicle.topics.GeoRoadNetworkTopic(reader);
            callback.invoke(topic, message);
        }
        catch (java.io.IOException exception)
        {
            throw new zserio.runtime.ZserioError("VehicleTopicCollection: " + exception, exception);
        }
    }

    private void onRawMpp(
            zserio.runtime.pubsub.PubsubCallback<nds.vehicle.topics.MppTopic> callback,
            java.lang.String topic, byte[] data)
    {
        try
        {
            final zserio.runtime.io.ByteArrayBitStreamReader reader =
                    new zserio.runtime.io.ByteArrayBitStreamReader(data);
            final nds.vehicle.topics.MppTopic message = new nds.vehicle.topics.MppTopic(reader);
            callback.invoke(topic, message);
        }
        catch (java.io.IOException exception)
        {
            throw new zserio.runtime.ZserioError("VehicleTopicCollection: " + exception, exception);
        }
    }

    private void onRawMatchedGeoRoadNetwork(
            zserio.runtime.pubsub.PubsubCallback<nds.vehicle.topics.MatchedGeoRoadNetworkTopic> callback,
            java.lang.String topic, byte[] data)
    {
        try
        {
            final zserio.runtime.io.ByteArrayBitStreamReader reader =
                    new zserio.runtime.io.ByteArrayBitStreamReader(data);
            final nds.vehicle.topics.MatchedGeoRoadNetworkTopic message = new nds.vehicle.topics.MatchedGeoRoadNetworkTopic(reader);
            callback.invoke(topic, message);
        }
        catch (java.io.IOException exception)
        {
            throw new zserio.runtime.ZserioError("VehicleTopicCollection: " + exception, exception);
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
            throw new zserio.runtime.ZserioError("VehicleTopicCollection: " + exception, exception);
        }
    }

    private final zserio.runtime.pubsub.PubsubInterface pubsub;
}