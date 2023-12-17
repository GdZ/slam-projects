/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.traffic.instantiations;

public class TrafficRoadRangeAttribute implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            attributeValue_ = new nds.traffic.attributes.TrafficRoadRangeAttributeValue.ZserioPackingContext();
        }

        public nds.traffic.attributes.TrafficRoadRangeAttributeValue.ZserioPackingContext getAttributeValue()
        {
            return attributeValue_;
        }

        private nds.traffic.attributes.TrafficRoadRangeAttributeValue.ZserioPackingContext attributeValue_;
    };

    public TrafficRoadRangeAttribute(
            nds.traffic.attributes.TrafficRoadRangeAttributeType attributeTypeCode_)
    {
        this.attributeTypeCode_ = attributeTypeCode_;
    }

    public TrafficRoadRangeAttribute(zserio.runtime.io.BitStreamReader in,
            nds.traffic.attributes.TrafficRoadRangeAttributeType attributeTypeCode_)
            throws java.io.IOException
    {
        this.attributeTypeCode_ = attributeTypeCode_;

        read(in);
    }

    public TrafficRoadRangeAttribute(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            nds.traffic.attributes.TrafficRoadRangeAttributeType attributeTypeCode_)
            throws java.io.IOException
    {
        this.attributeTypeCode_ = attributeTypeCode_;

        read(context, in);
    }

    public TrafficRoadRangeAttribute(
            nds.traffic.attributes.TrafficRoadRangeAttributeType attributeTypeCode_,
            nds.traffic.attributes.TrafficRoadRangeAttributeValue attributeValue_)
    {
        this(attributeTypeCode_);

        setAttributeValue(attributeValue_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        attributeValue_.initPackingContext(zserioContext.getAttributeValue());
    }

    @Override
    public int bitSizeOf()
    {
        return bitSizeOf(0);
    }

    @Override
    public int bitSizeOf(long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition += attributeValue_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += attributeValue_.bitSizeOf(zserioContext.getAttributeValue(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.traffic.attributes.TrafficRoadRangeAttributeType getAttributeTypeCode()
    {
        return this.attributeTypeCode_;
    }

    public nds.traffic.attributes.TrafficRoadRangeAttributeValue getAttributeValue()
    {
        return attributeValue_;
    }

    public void setAttributeValue(nds.traffic.attributes.TrafficRoadRangeAttributeValue attributeValue_)
    {
        this.attributeValue_ = attributeValue_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof TrafficRoadRangeAttribute)
        {
            final TrafficRoadRangeAttribute that = (TrafficRoadRangeAttribute)obj;

            return
                    ((this.attributeTypeCode_ == null) ? that.attributeTypeCode_ == null : this.attributeTypeCode_.getValue() == that.attributeTypeCode_.getValue()) &&
                    ((attributeValue_ == null) ? that.attributeValue_ == null : attributeValue_.equals(that.attributeValue_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getAttributeTypeCode());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, attributeValue_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        attributeValue_ = new nds.traffic.attributes.TrafficRoadRangeAttributeValue(in, getAttributeTypeCode());
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        attributeValue_ = new nds.traffic.attributes.TrafficRoadRangeAttributeValue(zserioContext.getAttributeValue(), in, getAttributeTypeCode());
    }

    @Override
    public long initializeOffsets()
    {
        return initializeOffsets(0);
    }

    @Override
    public long initializeOffsets(long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition = attributeValue_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = attributeValue_.initializeOffsets(zserioContext.getAttributeValue(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        // check parameters
        if (attributeValue_.getType() != (getAttributeTypeCode()))
        {
            throw new zserio.runtime.ZserioError("Write: Inconsistent parameter type for field TrafficRoadRangeAttribute.attributeValue!");
        }
        attributeValue_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        attributeValue_.write(zserioContext.getAttributeValue(), out);
    }

    private final nds.traffic.attributes.TrafficRoadRangeAttributeType attributeTypeCode_;
    private nds.traffic.attributes.TrafficRoadRangeAttributeValue attributeValue_;
}
