/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.routing.services;

public class RoutingTopics
{
    public RoutingTopics(zserio.runtime.pubsub.PubsubInterface pubsub)
    {
        this.pubsub = pubsub;
    }

    public void publishCurrentRoute(nds.routing.route.Route message)
    {
        publishCurrentRoute(message, null);
    }

    public void publishCurrentRoute(nds.routing.route.Route message,
            java.lang.Object context)
    {
        publish("nds/routing/current_route", message, context);
    }

    public int subscribeCurrentRoute(
            zserio.runtime.pubsub.PubsubCallback<nds.routing.route.Route> callback)
    {
        return subscribeCurrentRoute(callback, null);
    }

    public int subscribeCurrentRoute(
            zserio.runtime.pubsub.PubsubCallback<nds.routing.route.Route> callback,
            java.lang.Object context)
    {
        final zserio.runtime.pubsub.PubsubInterface.Callback onRaw =
            new zserio.runtime.pubsub.PubsubInterface.Callback()
            {
                @Override
                public void invoke(java.lang.String topic, byte[] data)
                {
                    onRawCurrentRoute(callback, topic, data);
                }
            };
        return pubsub.subscribe("nds/routing/current_route", onRaw, context);
    }

    public void unsubscribe(int subscriptionId)
    {
        pubsub.unsubscribe(subscriptionId);
    }

    private void onRawCurrentRoute(
            zserio.runtime.pubsub.PubsubCallback<nds.routing.route.Route> callback,
            java.lang.String topic, byte[] data)
    {
        try
        {
            final zserio.runtime.io.ByteArrayBitStreamReader reader =
                    new zserio.runtime.io.ByteArrayBitStreamReader(data);
            final nds.routing.route.Route message = new nds.routing.route.Route(reader);
            callback.invoke(topic, message);
        }
        catch (java.io.IOException exception)
        {
            throw new zserio.runtime.ZserioError("RoutingTopics: " + exception, exception);
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
            throw new zserio.runtime.ZserioError("RoutingTopics: " + exception, exception);
        }
    }

    private final zserio.runtime.pubsub.PubsubInterface pubsub;
}
