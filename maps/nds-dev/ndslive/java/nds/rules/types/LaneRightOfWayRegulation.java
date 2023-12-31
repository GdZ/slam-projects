/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.rules.types;

public class LaneRightOfWayRegulation implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            otherLane_ = new nds.core.types.Var4ByteId.ZserioPackingContext();
            otherLaneRange_ = new nds.core.geometry.LineRangeUnchecked.ZserioPackingContext();
            type_ = new zserio.runtime.array.DeltaContext();
        }

        public nds.core.types.Var4ByteId.ZserioPackingContext getOtherLane()
        {
            return otherLane_;
        }

        public nds.core.geometry.LineRangeUnchecked.ZserioPackingContext getOtherLaneRange()
        {
            return otherLaneRange_;
        }

        public zserio.runtime.array.DeltaContext getType()
        {
            return type_;
        }

        private nds.core.types.Var4ByteId.ZserioPackingContext otherLane_;
        private nds.core.geometry.LineRangeUnchecked.ZserioPackingContext otherLaneRange_;
        private zserio.runtime.array.DeltaContext type_;
    };

    public LaneRightOfWayRegulation()
    {
    }

    public LaneRightOfWayRegulation(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public LaneRightOfWayRegulation(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public LaneRightOfWayRegulation(
            nds.core.types.Var4ByteId otherLane_,
            nds.core.geometry.LineRangeUnchecked otherLaneRange_,
            nds.rules.types.RightOfWayType type_)
    {
        setOtherLane(otherLane_);
        setOtherLaneRange(otherLaneRange_);
        setType(type_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        otherLane_.initPackingContext(zserioContext.getOtherLane());
        otherLaneRange_.initPackingContext(zserioContext.getOtherLaneRange());
        type_.initPackingContext(zserioContext.getType());
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

        endBitPosition += otherLane_.bitSizeOf(endBitPosition);
        endBitPosition += otherLaneRange_.bitSizeOf(endBitPosition);
        endBitPosition += type_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += otherLane_.bitSizeOf(zserioContext.getOtherLane(), endBitPosition);
        endBitPosition += otherLaneRange_.bitSizeOf(zserioContext.getOtherLaneRange(), endBitPosition);
        endBitPosition += type_.bitSizeOf(zserioContext.getType(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.types.Var4ByteId getOtherLane()
    {
        return otherLane_;
    }

    public void setOtherLane(nds.core.types.Var4ByteId otherLane_)
    {
        this.otherLane_ = otherLane_;
    }

    public nds.core.geometry.LineRangeUnchecked getOtherLaneRange()
    {
        return otherLaneRange_;
    }

    public void setOtherLaneRange(nds.core.geometry.LineRangeUnchecked otherLaneRange_)
    {
        this.otherLaneRange_ = otherLaneRange_;
    }

    public nds.rules.types.RightOfWayType getType()
    {
        return type_;
    }

    public void setType(nds.rules.types.RightOfWayType type_)
    {
        this.type_ = type_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof LaneRightOfWayRegulation)
        {
            final LaneRightOfWayRegulation that = (LaneRightOfWayRegulation)obj;

            return
                    ((otherLane_ == null) ? that.otherLane_ == null : otherLane_.equals(that.otherLane_)) &&
                    ((otherLaneRange_ == null) ? that.otherLaneRange_ == null : otherLaneRange_.equals(that.otherLaneRange_)) &&
                    ((type_ == null) ? that.type_ == null : type_.getValue() == that.type_.getValue());
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, otherLane_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, otherLaneRange_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, type_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        otherLane_ = new nds.core.types.Var4ByteId(in);

        otherLaneRange_ = new nds.core.geometry.LineRangeUnchecked(in);

        type_ = nds.rules.types.RightOfWayType.readEnum(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        otherLane_ = new nds.core.types.Var4ByteId(zserioContext.getOtherLane(), in);

        otherLaneRange_ = new nds.core.geometry.LineRangeUnchecked(zserioContext.getOtherLaneRange(), in);

        type_ = nds.rules.types.RightOfWayType.readEnum(zserioContext.getType(), in);
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

        endBitPosition = otherLane_.initializeOffsets(endBitPosition);
        endBitPosition = otherLaneRange_.initializeOffsets(endBitPosition);
        endBitPosition += type_.bitSizeOf(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = otherLane_.initializeOffsets(zserioContext.getOtherLane(), endBitPosition);
        endBitPosition = otherLaneRange_.initializeOffsets(zserioContext.getOtherLaneRange(), endBitPosition);
        endBitPosition = type_.initializeOffsets(zserioContext.getType(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        otherLane_.write(out);

        otherLaneRange_.write(out);

        type_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        otherLane_.write(zserioContext.getOtherLane(), out);

        otherLaneRange_.write(zserioContext.getOtherLaneRange(), out);

        type_.write(zserioContext.getType(), out);
    }

    private nds.core.types.Var4ByteId otherLane_;
    private nds.core.geometry.LineRangeUnchecked otherLaneRange_;
    private nds.rules.types.RightOfWayType type_;
}
