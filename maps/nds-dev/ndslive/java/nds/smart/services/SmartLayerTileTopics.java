/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.smart.services;

public class SmartLayerTileTopics
{
    public SmartLayerTileTopics(zserio.runtime.pubsub.PubsubInterface pubsub)
    {
        this.pubsub = pubsub;
    }

    public void publishTileID(nds.core.types.TileId message)
    {
        publishTileID(message, null);
    }

    public void publishTileID(nds.core.types.TileId message,
            java.lang.Object context)
    {
        publish("nds/smart/tile/update", message, context);
    }

    public int subscribeTileID(
            zserio.runtime.pubsub.PubsubCallback<nds.core.types.TileId> callback)
    {
        return subscribeTileID(callback, null);
    }

    public int subscribeTileID(
            zserio.runtime.pubsub.PubsubCallback<nds.core.types.TileId> callback,
            java.lang.Object context)
    {
        final zserio.runtime.pubsub.PubsubInterface.Callback onRaw =
            new zserio.runtime.pubsub.PubsubInterface.Callback()
            {
                @Override
                public void invoke(java.lang.String topic, byte[] data)
                {
                    onRawTileID(callback, topic, data);
                }
            };
        return pubsub.subscribe("nds/smart/tile/update", onRaw, context);
    }

    public void unsubscribe(int subscriptionId)
    {
        pubsub.unsubscribe(subscriptionId);
    }

    private void onRawTileID(
            zserio.runtime.pubsub.PubsubCallback<nds.core.types.TileId> callback,
            java.lang.String topic, byte[] data)
    {
        try
        {
            final zserio.runtime.io.ByteArrayBitStreamReader reader =
                    new zserio.runtime.io.ByteArrayBitStreamReader(data);
            final nds.core.types.TileId message = new nds.core.types.TileId(reader);
            callback.invoke(topic, message);
        }
        catch (java.io.IOException exception)
        {
            throw new zserio.runtime.ZserioError("SmartLayerTileTopics: " + exception, exception);
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
            throw new zserio.runtime.ZserioError("SmartLayerTileTopics: " + exception, exception);
        }
    }

    private final zserio.runtime.pubsub.PubsubInterface pubsub;
}
