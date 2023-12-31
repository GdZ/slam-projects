/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.rules.layer;

public class RegionLaneGroupRelationList implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            numRelations_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getNumRelations()
        {
            return numRelations_;
        }

        private zserio.runtime.array.DeltaContext numRelations_;
    };

    public RegionLaneGroupRelationList()
    {
    }

    public RegionLaneGroupRelationList(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RegionLaneGroupRelationList(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RegionLaneGroupRelationList(
            int numRelations_,
            nds.core.types.Var4ByteId[] laneGroupIds_,
            nds.lane.reference.types.LaneGroupRangeValidity[] laneGroupRangeValidity_)
    {
        setNumRelations(numRelations_);
        setLaneGroupIds(laneGroupIds_);
        setLaneGroupRangeValidity(laneGroupRangeValidity_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumRelations().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numRelations_));
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numRelations_);
        endBitPosition += laneGroupIds_.bitSizeOf(endBitPosition);
        endBitPosition += laneGroupRangeValidity_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumRelations().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numRelations_));
        endBitPosition += laneGroupIds_.bitSizeOfPacked(endBitPosition);
        endBitPosition += laneGroupRangeValidity_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public int getNumRelations()
    {
        return numRelations_;
    }

    public void setNumRelations(int numRelations_)
    {
        this.numRelations_ = numRelations_;
    }

    public nds.core.types.Var4ByteId[] getLaneGroupIds()
    {
        return (laneGroupIds_ == null) ? null : laneGroupIds_.getRawArray();
    }

    public void setLaneGroupIds(nds.core.types.Var4ByteId[] laneGroupIds_)
    {
        this.laneGroupIds_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Var4ByteId.class, laneGroupIds_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Var4ByteId>(new ZserioElementFactory_laneGroupIds()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    public nds.lane.reference.types.LaneGroupRangeValidity[] getLaneGroupRangeValidity()
    {
        return (laneGroupRangeValidity_ == null) ? null : laneGroupRangeValidity_.getRawArray();
    }

    public void setLaneGroupRangeValidity(nds.lane.reference.types.LaneGroupRangeValidity[] laneGroupRangeValidity_)
    {
        this.laneGroupRangeValidity_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.reference.types.LaneGroupRangeValidity.class, laneGroupRangeValidity_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.reference.types.LaneGroupRangeValidity>(new ZserioElementFactory_laneGroupRangeValidity()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RegionLaneGroupRelationList)
        {
            final RegionLaneGroupRelationList that = (RegionLaneGroupRelationList)obj;

            return
                    numRelations_ == that.numRelations_ &&
                    ((laneGroupIds_ == null) ? that.laneGroupIds_ == null : laneGroupIds_.equals(that.laneGroupIds_)) &&
                    ((laneGroupRangeValidity_ == null) ? that.laneGroupRangeValidity_ == null : laneGroupRangeValidity_.equals(that.laneGroupRangeValidity_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, numRelations_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, laneGroupIds_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, laneGroupRangeValidity_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        numRelations_ = in.readVarSize();

        laneGroupIds_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Var4ByteId.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Var4ByteId>(new ZserioElementFactory_laneGroupIds()),
                zserio.runtime.array.ArrayType.NORMAL);
        laneGroupIds_.read(in, (int)(getNumRelations()));

        laneGroupRangeValidity_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.reference.types.LaneGroupRangeValidity.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.reference.types.LaneGroupRangeValidity>(new ZserioElementFactory_laneGroupRangeValidity()),
                zserio.runtime.array.ArrayType.NORMAL);
        laneGroupRangeValidity_.read(in, (int)(getNumRelations()));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        numRelations_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getNumRelations().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

        laneGroupIds_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Var4ByteId.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Var4ByteId>(new ZserioElementFactory_laneGroupIds()),
                zserio.runtime.array.ArrayType.NORMAL);
        laneGroupIds_.readPacked(in, (int)(getNumRelations()));

        laneGroupRangeValidity_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.reference.types.LaneGroupRangeValidity.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.reference.types.LaneGroupRangeValidity>(new ZserioElementFactory_laneGroupRangeValidity()),
                zserio.runtime.array.ArrayType.NORMAL);
        laneGroupRangeValidity_.readPacked(in, (int)(getNumRelations()));
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numRelations_);
        endBitPosition = laneGroupIds_.initializeOffsets(endBitPosition);
        endBitPosition = laneGroupRangeValidity_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumRelations().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numRelations_));
        endBitPosition = laneGroupIds_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = laneGroupRangeValidity_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarSize(numRelations_);

        if (laneGroupIds_.size() != (int)(getNumRelations()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RegionLaneGroupRelationList.laneGroupIds: " +
                    laneGroupIds_.size() + " != " + (int)(getNumRelations()) + "!");
        }
        laneGroupIds_.write(out);

        if (laneGroupRangeValidity_.size() != (int)(getNumRelations()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RegionLaneGroupRelationList.laneGroupRangeValidity: " +
                    laneGroupRangeValidity_.size() + " != " + (int)(getNumRelations()) + "!");
        }
        laneGroupRangeValidity_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumRelations().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(numRelations_));

        if (laneGroupIds_.size() != (int)(getNumRelations()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RegionLaneGroupRelationList.laneGroupIds: " +
                    laneGroupIds_.size() + " != " + (int)(getNumRelations()) + "!");
        }
        laneGroupIds_.writePacked(out);

        if (laneGroupRangeValidity_.size() != (int)(getNumRelations()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RegionLaneGroupRelationList.laneGroupRangeValidity: " +
                    laneGroupRangeValidity_.size() + " != " + (int)(getNumRelations()) + "!");
        }
        laneGroupRangeValidity_.writePacked(out);
    }

    private static final class ZserioElementFactory_laneGroupIds implements zserio.runtime.array.PackableElementFactory<nds.core.types.Var4ByteId>
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

    private static final class ZserioElementFactory_laneGroupRangeValidity implements zserio.runtime.array.PackableElementFactory<nds.lane.reference.types.LaneGroupRangeValidity>
    {
        @Override
        public nds.lane.reference.types.LaneGroupRangeValidity create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.lane.reference.types.LaneGroupRangeValidity(in, (byte)(0));
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.lane.reference.types.LaneGroupRangeValidity.ZserioPackingContext();
        }

        @Override
        public nds.lane.reference.types.LaneGroupRangeValidity create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.lane.reference.types.LaneGroupRangeValidity(context, in, (byte)(0));
        }
    }

    private int numRelations_;
    private zserio.runtime.array.Array laneGroupIds_;
    private zserio.runtime.array.Array laneGroupRangeValidity_;
}
