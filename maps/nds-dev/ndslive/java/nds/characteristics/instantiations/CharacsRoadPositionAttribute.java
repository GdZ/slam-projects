/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.characteristics.instantiations;

public class CharacsRoadPositionAttribute implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            attributeValue_ = new nds.characteristics.attributes.CharacsRoadPositionAttributeValue.ZserioPackingContext();
        }

        public nds.characteristics.attributes.CharacsRoadPositionAttributeValue.ZserioPackingContext getAttributeValue()
        {
            return attributeValue_;
        }

        private nds.characteristics.attributes.CharacsRoadPositionAttributeValue.ZserioPackingContext attributeValue_;
    };

    public CharacsRoadPositionAttribute(
            nds.characteristics.attributes.CharacsRoadPositionAttributeType attributeTypeCode_)
    {
        this.attributeTypeCode_ = attributeTypeCode_;
    }

    public CharacsRoadPositionAttribute(zserio.runtime.io.BitStreamReader in,
            nds.characteristics.attributes.CharacsRoadPositionAttributeType attributeTypeCode_)
            throws java.io.IOException
    {
        this.attributeTypeCode_ = attributeTypeCode_;

        read(in);
    }

    public CharacsRoadPositionAttribute(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            nds.characteristics.attributes.CharacsRoadPositionAttributeType attributeTypeCode_)
            throws java.io.IOException
    {
        this.attributeTypeCode_ = attributeTypeCode_;

        read(context, in);
    }

    public CharacsRoadPositionAttribute(
            nds.characteristics.attributes.CharacsRoadPositionAttributeType attributeTypeCode_,
            nds.characteristics.attributes.CharacsRoadPositionAttributeValue attributeValue_)
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

    public nds.characteristics.attributes.CharacsRoadPositionAttributeType getAttributeTypeCode()
    {
        return this.attributeTypeCode_;
    }

    public nds.characteristics.attributes.CharacsRoadPositionAttributeValue getAttributeValue()
    {
        return attributeValue_;
    }

    public void setAttributeValue(nds.characteristics.attributes.CharacsRoadPositionAttributeValue attributeValue_)
    {
        this.attributeValue_ = attributeValue_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof CharacsRoadPositionAttribute)
        {
            final CharacsRoadPositionAttribute that = (CharacsRoadPositionAttribute)obj;

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
        attributeValue_ = new nds.characteristics.attributes.CharacsRoadPositionAttributeValue(in, getAttributeTypeCode());
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        attributeValue_ = new nds.characteristics.attributes.CharacsRoadPositionAttributeValue(zserioContext.getAttributeValue(), in, getAttributeTypeCode());
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
            throw new zserio.runtime.ZserioError("Write: Inconsistent parameter type for field CharacsRoadPositionAttribute.attributeValue!");
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

    private final nds.characteristics.attributes.CharacsRoadPositionAttributeType attributeTypeCode_;
    private nds.characteristics.attributes.CharacsRoadPositionAttributeValue attributeValue_;
}
