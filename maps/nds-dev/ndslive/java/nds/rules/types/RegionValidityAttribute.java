/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.rules.types;

public class RegionValidityAttribute implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            type_ = new zserio.runtime.array.DeltaContext();
            value_ = new nds.rules.types.RegionValidityValue.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getType()
        {
            return type_;
        }

        public nds.rules.types.RegionValidityValue.ZserioPackingContext getValue()
        {
            return value_;
        }

        private zserio.runtime.array.DeltaContext type_;
        private nds.rules.types.RegionValidityValue.ZserioPackingContext value_;
    };

    public RegionValidityAttribute()
    {
    }

    public RegionValidityAttribute(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RegionValidityAttribute(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RegionValidityAttribute(
            nds.rules.types.RegionValidityType type_,
            nds.rules.types.RegionValidityValue value_)
    {
        setType(type_);
        setValue(value_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        type_.initPackingContext(zserioContext.getType());
        value_.initPackingContext(zserioContext.getValue());
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

        endBitPosition += type_.bitSizeOf(endBitPosition);
        endBitPosition += value_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += type_.bitSizeOf(zserioContext.getType(), endBitPosition);
        endBitPosition += value_.bitSizeOf(zserioContext.getValue(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.rules.types.RegionValidityType getType()
    {
        return type_;
    }

    public void setType(nds.rules.types.RegionValidityType type_)
    {
        this.type_ = type_;
    }

    public nds.rules.types.RegionValidityValue getValue()
    {
        return value_;
    }

    public void setValue(nds.rules.types.RegionValidityValue value_)
    {
        this.value_ = value_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RegionValidityAttribute)
        {
            final RegionValidityAttribute that = (RegionValidityAttribute)obj;

            return
                    ((type_ == null) ? that.type_ == null : type_.getValue() == that.type_.getValue()) &&
                    ((value_ == null) ? that.value_ == null : value_.equals(that.value_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, type_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, value_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        type_ = nds.rules.types.RegionValidityType.readEnum(in);

        value_ = new nds.rules.types.RegionValidityValue(in, getType());
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        type_ = nds.rules.types.RegionValidityType.readEnum(zserioContext.getType(), in);

        value_ = new nds.rules.types.RegionValidityValue(zserioContext.getValue(), in, getType());
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

        endBitPosition += type_.bitSizeOf(endBitPosition);
        endBitPosition = value_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = type_.initializeOffsets(zserioContext.getType(), endBitPosition);
        endBitPosition = value_.initializeOffsets(zserioContext.getValue(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        type_.write(out);

        // check parameters
        if (value_.getType() != (getType()))
        {
            throw new zserio.runtime.ZserioError("Write: Inconsistent parameter type for field RegionValidityAttribute.value!");
        }
        value_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        type_.write(zserioContext.getType(), out);

        value_.write(zserioContext.getValue(), out);
    }

    private nds.rules.types.RegionValidityType type_;
    private nds.rules.types.RegionValidityValue value_;
}
