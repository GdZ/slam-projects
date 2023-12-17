/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.lane.topics;

public class LaneGroupsOnPathTopic implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            stamp_ = new nds.core.types.TimeStamp.ZserioPackingContext();
            pathId_ = new zserio.runtime.array.DeltaContext();
            boundaryDefinitions_ = new nds.lane.boundaries.BoundaryElementDefinitions.ZserioPackingContext();
        }

        public nds.core.types.TimeStamp.ZserioPackingContext getStamp()
        {
            return stamp_;
        }

        public zserio.runtime.array.DeltaContext getPathId()
        {
            return pathId_;
        }

        public nds.lane.boundaries.BoundaryElementDefinitions.ZserioPackingContext getBoundaryDefinitions()
        {
            return boundaryDefinitions_;
        }

        private nds.core.types.TimeStamp.ZserioPackingContext stamp_;
        private zserio.runtime.array.DeltaContext pathId_;
        private nds.lane.boundaries.BoundaryElementDefinitions.ZserioPackingContext boundaryDefinitions_;
    };

    public LaneGroupsOnPathTopic()
    {
    }

    public LaneGroupsOnPathTopic(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public LaneGroupsOnPathTopic(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public LaneGroupsOnPathTopic(
            nds.core.types.TimeStamp stamp_,
            int pathId_,
            nds.lane.boundaries.BoundaryElementDefinitions boundaryDefinitions_,
            nds.lane.lanegroups.LaneGroup[] laneGroupPath_)
    {
        setStamp(stamp_);
        setPathId(pathId_);
        setBoundaryDefinitions(boundaryDefinitions_);
        setLaneGroupPath(laneGroupPath_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        stamp_.initPackingContext(zserioContext.getStamp());
        zserioContext.getPathId().init(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(pathId_));
        boundaryDefinitions_.initPackingContext(zserioContext.getBoundaryDefinitions());
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

        endBitPosition += stamp_.bitSizeOf(endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(pathId_);
        endBitPosition += boundaryDefinitions_.bitSizeOf(endBitPosition);
        endBitPosition += laneGroupPath_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += stamp_.bitSizeOf(zserioContext.getStamp(), endBitPosition);
        endBitPosition += zserioContext.getPathId().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(pathId_));
        endBitPosition += boundaryDefinitions_.bitSizeOf(zserioContext.getBoundaryDefinitions(), endBitPosition);
        endBitPosition += laneGroupPath_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.types.TimeStamp getStamp()
    {
        return stamp_;
    }

    public void setStamp(nds.core.types.TimeStamp stamp_)
    {
        this.stamp_ = stamp_;
    }

    public int getPathId()
    {
        return pathId_;
    }

    public void setPathId(int pathId_)
    {
        this.pathId_ = pathId_;
    }

    public nds.lane.boundaries.BoundaryElementDefinitions getBoundaryDefinitions()
    {
        return boundaryDefinitions_;
    }

    public void setBoundaryDefinitions(nds.lane.boundaries.BoundaryElementDefinitions boundaryDefinitions_)
    {
        this.boundaryDefinitions_ = boundaryDefinitions_;
    }

    public nds.lane.lanegroups.LaneGroup[] getLaneGroupPath()
    {
        return (laneGroupPath_ == null) ? null : laneGroupPath_.getRawArray();
    }

    public void setLaneGroupPath(nds.lane.lanegroups.LaneGroup[] laneGroupPath_)
    {
        this.laneGroupPath_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.lanegroups.LaneGroup.class, laneGroupPath_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.lanegroups.LaneGroup>(new ZserioElementFactory_laneGroupPath()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof LaneGroupsOnPathTopic)
        {
            final LaneGroupsOnPathTopic that = (LaneGroupsOnPathTopic)obj;

            return
                    ((stamp_ == null) ? that.stamp_ == null : stamp_.equals(that.stamp_)) &&
                    pathId_ == that.pathId_ &&
                    ((boundaryDefinitions_ == null) ? that.boundaryDefinitions_ == null : boundaryDefinitions_.equals(that.boundaryDefinitions_)) &&
                    ((laneGroupPath_ == null) ? that.laneGroupPath_ == null : laneGroupPath_.equals(that.laneGroupPath_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, stamp_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, pathId_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, boundaryDefinitions_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, laneGroupPath_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        stamp_ = new nds.core.types.TimeStamp(in);

        pathId_ = in.readVarUInt32();

        boundaryDefinitions_ = new nds.lane.boundaries.BoundaryElementDefinitions(in);

        laneGroupPath_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.lanegroups.LaneGroup.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.lanegroups.LaneGroup>(new ZserioElementFactory_laneGroupPath()),
                zserio.runtime.array.ArrayType.AUTO);
        laneGroupPath_.read(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        stamp_ = new nds.core.types.TimeStamp(zserioContext.getStamp(), in);

        pathId_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getPathId().read(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), in)).get();

        boundaryDefinitions_ = new nds.lane.boundaries.BoundaryElementDefinitions(zserioContext.getBoundaryDefinitions(), in);

        laneGroupPath_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.lanegroups.LaneGroup.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.lanegroups.LaneGroup>(new ZserioElementFactory_laneGroupPath()),
                zserio.runtime.array.ArrayType.AUTO);
        laneGroupPath_.readPacked(in);
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

        endBitPosition = stamp_.initializeOffsets(endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(pathId_);
        endBitPosition = boundaryDefinitions_.initializeOffsets(endBitPosition);
        endBitPosition = laneGroupPath_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = stamp_.initializeOffsets(zserioContext.getStamp(), endBitPosition);
        endBitPosition += zserioContext.getPathId().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(pathId_));
        endBitPosition = boundaryDefinitions_.initializeOffsets(zserioContext.getBoundaryDefinitions(), endBitPosition);
        endBitPosition = laneGroupPath_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        stamp_.write(out);

        out.writeVarUInt32(pathId_);

        boundaryDefinitions_.write(out);

        laneGroupPath_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        stamp_.write(zserioContext.getStamp(), out);

        zserioContext.getPathId().write(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(pathId_));

        boundaryDefinitions_.write(zserioContext.getBoundaryDefinitions(), out);

        laneGroupPath_.writePacked(out);
    }

    private static final class ZserioElementFactory_laneGroupPath implements zserio.runtime.array.PackableElementFactory<nds.lane.lanegroups.LaneGroup>
    {
        @Override
        public nds.lane.lanegroups.LaneGroup create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.lane.lanegroups.LaneGroup(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.lane.lanegroups.LaneGroup.ZserioPackingContext();
        }

        @Override
        public nds.lane.lanegroups.LaneGroup create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.lane.lanegroups.LaneGroup(context, in);
        }
    }

    private nds.core.types.TimeStamp stamp_;
    private int pathId_;
    private nds.lane.boundaries.BoundaryElementDefinitions boundaryDefinitions_;
    private zserio.runtime.array.Array laneGroupPath_;
}