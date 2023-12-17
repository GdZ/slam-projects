/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.rules.types;

public class LaneTrafficPriority implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            reason_ = new zserio.runtime.array.DeltaContext();
            numLanes_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getReason()
        {
            return reason_;
        }

        public zserio.runtime.array.DeltaContext getNumLanes()
        {
            return numLanes_;
        }

        private zserio.runtime.array.DeltaContext reason_;
        private zserio.runtime.array.DeltaContext numLanes_;
    };

    public LaneTrafficPriority()
    {
    }

    public LaneTrafficPriority(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public LaneTrafficPriority(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public LaneTrafficPriority(
            nds.rules.types.LaneTrafficPriorityReason reason_,
            int numLanes_,
            nds.core.types.Var4ByteId[] otherLanes_,
            nds.core.geometry.LineRangeUnchecked[] range_)
    {
        setReason(reason_);
        setNumLanes(numLanes_);
        setOtherLanes(otherLanes_);
        setRange(range_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        reason_.initPackingContext(zserioContext.getReason());
        zserioContext.getNumLanes().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numLanes_));
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

        endBitPosition += reason_.bitSizeOf(endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numLanes_);
        endBitPosition += otherLanes_.bitSizeOf(endBitPosition);
        endBitPosition += range_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += reason_.bitSizeOf(zserioContext.getReason(), endBitPosition);
        endBitPosition += zserioContext.getNumLanes().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numLanes_));
        endBitPosition += otherLanes_.bitSizeOfPacked(endBitPosition);
        endBitPosition += range_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.rules.types.LaneTrafficPriorityReason getReason()
    {
        return reason_;
    }

    public void setReason(nds.rules.types.LaneTrafficPriorityReason reason_)
    {
        this.reason_ = reason_;
    }

    public int getNumLanes()
    {
        return numLanes_;
    }

    public void setNumLanes(int numLanes_)
    {
        this.numLanes_ = numLanes_;
    }

    public nds.core.types.Var4ByteId[] getOtherLanes()
    {
        return (otherLanes_ == null) ? null : otherLanes_.getRawArray();
    }

    public void setOtherLanes(nds.core.types.Var4ByteId[] otherLanes_)
    {
        this.otherLanes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Var4ByteId.class, otherLanes_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Var4ByteId>(new ZserioElementFactory_otherLanes()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    public nds.core.geometry.LineRangeUnchecked[] getRange()
    {
        return (range_ == null) ? null : range_.getRawArray();
    }

    public void setRange(nds.core.geometry.LineRangeUnchecked[] range_)
    {
        this.range_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.geometry.LineRangeUnchecked.class, range_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.geometry.LineRangeUnchecked>(new ZserioElementFactory_range()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof LaneTrafficPriority)
        {
            final LaneTrafficPriority that = (LaneTrafficPriority)obj;

            return
                    ((reason_ == null) ? that.reason_ == null : reason_.getValue() == that.reason_.getValue()) &&
                    numLanes_ == that.numLanes_ &&
                    ((otherLanes_ == null) ? that.otherLanes_ == null : otherLanes_.equals(that.otherLanes_)) &&
                    ((range_ == null) ? that.range_ == null : range_.equals(that.range_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, reason_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, numLanes_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, otherLanes_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, range_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        reason_ = nds.rules.types.LaneTrafficPriorityReason.readEnum(in);

        numLanes_ = in.readVarSize();

        otherLanes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Var4ByteId.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Var4ByteId>(new ZserioElementFactory_otherLanes()),
                zserio.runtime.array.ArrayType.NORMAL);
        otherLanes_.read(in, (int)(getNumLanes()));

        range_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.geometry.LineRangeUnchecked.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.geometry.LineRangeUnchecked>(new ZserioElementFactory_range()),
                zserio.runtime.array.ArrayType.NORMAL);
        range_.read(in, (int)(getNumLanes()));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        reason_ = nds.rules.types.LaneTrafficPriorityReason.readEnum(zserioContext.getReason(), in);

        numLanes_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getNumLanes().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

        otherLanes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Var4ByteId.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Var4ByteId>(new ZserioElementFactory_otherLanes()),
                zserio.runtime.array.ArrayType.NORMAL);
        otherLanes_.readPacked(in, (int)(getNumLanes()));

        range_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.geometry.LineRangeUnchecked.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.geometry.LineRangeUnchecked>(new ZserioElementFactory_range()),
                zserio.runtime.array.ArrayType.NORMAL);
        range_.readPacked(in, (int)(getNumLanes()));
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

        endBitPosition += reason_.bitSizeOf(endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numLanes_);
        endBitPosition = otherLanes_.initializeOffsets(endBitPosition);
        endBitPosition = range_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = reason_.initializeOffsets(zserioContext.getReason(), endBitPosition);
        endBitPosition += zserioContext.getNumLanes().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numLanes_));
        endBitPosition = otherLanes_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = range_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        reason_.write(out);

        out.writeVarSize(numLanes_);

        if (otherLanes_.size() != (int)(getNumLanes()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field LaneTrafficPriority.otherLanes: " +
                    otherLanes_.size() + " != " + (int)(getNumLanes()) + "!");
        }
        otherLanes_.write(out);

        if (range_.size() != (int)(getNumLanes()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field LaneTrafficPriority.range: " +
                    range_.size() + " != " + (int)(getNumLanes()) + "!");
        }
        range_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        reason_.write(zserioContext.getReason(), out);

        zserioContext.getNumLanes().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(numLanes_));

        if (otherLanes_.size() != (int)(getNumLanes()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field LaneTrafficPriority.otherLanes: " +
                    otherLanes_.size() + " != " + (int)(getNumLanes()) + "!");
        }
        otherLanes_.writePacked(out);

        if (range_.size() != (int)(getNumLanes()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field LaneTrafficPriority.range: " +
                    range_.size() + " != " + (int)(getNumLanes()) + "!");
        }
        range_.writePacked(out);
    }

    private static final class ZserioElementFactory_otherLanes implements zserio.runtime.array.PackableElementFactory<nds.core.types.Var4ByteId>
    {
        @Override
        public nds.core.types.Var4ByteId create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.core.types.Var4ByteId(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.core.types.Var4ByteId.ZserioPackingContext();
        }

        @Override
        public nds.core.types.Var4ByteId create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.core.types.Var4ByteId(context, in);
        }
    }

    private static final class ZserioElementFactory_range implements zserio.runtime.array.PackableElementFactory<nds.core.geometry.LineRangeUnchecked>
    {
        @Override
        public nds.core.geometry.LineRangeUnchecked create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.core.geometry.LineRangeUnchecked(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.core.geometry.LineRangeUnchecked.ZserioPackingContext();
        }

        @Override
        public nds.core.geometry.LineRangeUnchecked create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.core.geometry.LineRangeUnchecked(context, in);
        }
    }

    private nds.rules.types.LaneTrafficPriorityReason reason_;
    private int numLanes_;
    private zserio.runtime.array.Array otherLanes_;
    private zserio.runtime.array.Array range_;
}
