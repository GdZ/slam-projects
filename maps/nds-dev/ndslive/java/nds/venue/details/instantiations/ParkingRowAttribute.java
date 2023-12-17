/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.venue.details.instantiations;

public class ParkingRowAttribute implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            attributeValue_ = new nds.venue.details.attributes.ParkingRowAttributeValue.ZserioPackingContext();
        }

        public nds.venue.details.attributes.ParkingRowAttributeValue.ZserioPackingContext getAttributeValue()
        {
            return attributeValue_;
        }

        private nds.venue.details.attributes.ParkingRowAttributeValue.ZserioPackingContext attributeValue_;
    };

    public ParkingRowAttribute(
            nds.venue.details.attributes.ParkingRowAttributeType attributeTypeCode_)
    {
        this.attributeTypeCode_ = attributeTypeCode_;
    }

    public ParkingRowAttribute(zserio.runtime.io.BitStreamReader in,
            nds.venue.details.attributes.ParkingRowAttributeType attributeTypeCode_)
            throws java.io.IOException
    {
        this.attributeTypeCode_ = attributeTypeCode_;

        read(in);
    }

    public ParkingRowAttribute(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            nds.venue.details.attributes.ParkingRowAttributeType attributeTypeCode_)
            throws java.io.IOException
    {
        this.attributeTypeCode_ = attributeTypeCode_;

        read(context, in);
    }

    public ParkingRowAttribute(
            nds.venue.details.attributes.ParkingRowAttributeType attributeTypeCode_,
            nds.venue.details.attributes.ParkingRowAttributeValue attributeValue_)
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

    public nds.venue.details.attributes.ParkingRowAttributeType getAttributeTypeCode()
    {
        return this.attributeTypeCode_;
    }

    public nds.venue.details.attributes.ParkingRowAttributeValue getAttributeValue()
    {
        return attributeValue_;
    }

    public void setAttributeValue(nds.venue.details.attributes.ParkingRowAttributeValue attributeValue_)
    {
        this.attributeValue_ = attributeValue_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof ParkingRowAttribute)
        {
            final ParkingRowAttribute that = (ParkingRowAttribute)obj;

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
        attributeValue_ = new nds.venue.details.attributes.ParkingRowAttributeValue(in, getAttributeTypeCode());
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        attributeValue_ = new nds.venue.details.attributes.ParkingRowAttributeValue(zserioContext.getAttributeValue(), in, getAttributeTypeCode());
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
            throw new zserio.runtime.ZserioError("Write: Inconsistent parameter type for field ParkingRowAttribute.attributeValue!");
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

    private final nds.venue.details.attributes.ParkingRowAttributeType attributeTypeCode_;
    private nds.venue.details.attributes.ParkingRowAttributeValue attributeValue_;
}
