/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.road.reference.types;

public class RoadLengthPosition implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            length_ = new zserio.runtime.array.DeltaContext();
            position_ = new nds.core.types.RangePosition.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getLength()
        {
            return length_;
        }

        public nds.core.types.RangePosition.ZserioPackingContext getPosition()
        {
            return position_;
        }

        private zserio.runtime.array.DeltaContext length_;
        private nds.core.types.RangePosition.ZserioPackingContext position_;
    };

    public RoadLengthPosition()
    {
    }

    public RoadLengthPosition(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RoadLengthPosition(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RoadLengthPosition(
            int length_,
            nds.core.types.RangePosition position_)
    {
        setLength(length_);
        setPosition(position_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getLength().init(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(length_));
        position_.initPackingContext(zserioContext.getPosition());
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(length_);
        endBitPosition += position_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getLength().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(length_));
        endBitPosition += position_.bitSizeOf(zserioContext.getPosition(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public int getLength()
    {
        return length_;
    }

    public void setLength(int length_)
    {
        this.length_ = length_;
    }

    public nds.core.types.RangePosition getPosition()
    {
        return position_;
    }

    public void setPosition(nds.core.types.RangePosition position_)
    {
        this.position_ = position_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RoadLengthPosition)
        {
            final RoadLengthPosition that = (RoadLengthPosition)obj;

            return
                    length_ == that.length_ &&
                    ((position_ == null) ? that.position_ == null : position_.equals(that.position_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, length_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, position_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        length_ = in.readVarUInt32();

        position_ = new nds.core.types.RangePosition(in, (int)(getLength()));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        length_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getLength().read(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), in)).get();

        position_ = new nds.core.types.RangePosition(zserioContext.getPosition(), in, (int)(getLength()));
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(length_);
        endBitPosition = position_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getLength().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(length_));
        endBitPosition = position_.initializeOffsets(zserioContext.getPosition(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarUInt32(length_);

        // check parameters
        if (position_.getLength() != (int)(getLength()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter length for field RoadLengthPosition.position: " +
                    position_.getLength() + " != " + (int)(getLength()) + "!");
        }
        position_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getLength().write(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(length_));

        position_.write(zserioContext.getPosition(), out);
    }

    private int length_;
    private nds.core.types.RangePosition position_;
}
