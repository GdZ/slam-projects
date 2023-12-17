/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.lane.layer;

public class LaneLayer implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            boundaryDefinitions_ = new nds.lane.boundaries.BoundaryElementDefinitions.ZserioPackingContext();
        }

        public nds.lane.boundaries.BoundaryElementDefinitions.ZserioPackingContext getBoundaryDefinitions()
        {
            return boundaryDefinitions_;
        }

        private nds.lane.boundaries.BoundaryElementDefinitions.ZserioPackingContext boundaryDefinitions_;
    };

    public LaneLayer()
    {
    }

    public LaneLayer(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public LaneLayer(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public LaneLayer(
            nds.lane.boundaries.BoundaryElementDefinitions boundaryDefinitions_,
            nds.lane.boundaries.Boundary[] boundaryList_,
            nds.lane.lanegroups.LaneGroup[] laneGroupList_)
    {
        setBoundaryDefinitions(boundaryDefinitions_);
        setBoundaryList(boundaryList_);
        setLaneGroupList(laneGroupList_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
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

        endBitPosition += boundaryDefinitions_.bitSizeOf(endBitPosition);
        endBitPosition += boundaryList_.bitSizeOfPacked(endBitPosition);
        endBitPosition += laneGroupList_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += boundaryDefinitions_.bitSizeOf(zserioContext.getBoundaryDefinitions(), endBitPosition);
        endBitPosition += boundaryList_.bitSizeOfPacked(endBitPosition);
        endBitPosition += laneGroupList_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.lane.boundaries.BoundaryElementDefinitions getBoundaryDefinitions()
    {
        return boundaryDefinitions_;
    }

    public void setBoundaryDefinitions(nds.lane.boundaries.BoundaryElementDefinitions boundaryDefinitions_)
    {
        this.boundaryDefinitions_ = boundaryDefinitions_;
    }

    public nds.lane.boundaries.Boundary[] getBoundaryList()
    {
        return (boundaryList_ == null) ? null : boundaryList_.getRawArray();
    }

    public void setBoundaryList(nds.lane.boundaries.Boundary[] boundaryList_)
    {
        this.boundaryList_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.boundaries.Boundary.class, boundaryList_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.boundaries.Boundary>(new ZserioElementFactory_boundaryList()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public nds.lane.lanegroups.LaneGroup[] getLaneGroupList()
    {
        return (laneGroupList_ == null) ? null : laneGroupList_.getRawArray();
    }

    public void setLaneGroupList(nds.lane.lanegroups.LaneGroup[] laneGroupList_)
    {
        this.laneGroupList_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.lanegroups.LaneGroup.class, laneGroupList_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.lanegroups.LaneGroup>(new ZserioElementFactory_laneGroupList()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public nds.system.types.LayerType funcGetLayerType()
    {
        return (nds.system.types.LayerType)(nds.system.types.LayerType.FEATURE);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof LaneLayer)
        {
            final LaneLayer that = (LaneLayer)obj;

            return
                    ((boundaryDefinitions_ == null) ? that.boundaryDefinitions_ == null : boundaryDefinitions_.equals(that.boundaryDefinitions_)) &&
                    ((boundaryList_ == null) ? that.boundaryList_ == null : boundaryList_.equals(that.boundaryList_)) &&
                    ((laneGroupList_ == null) ? that.laneGroupList_ == null : laneGroupList_.equals(that.laneGroupList_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, boundaryDefinitions_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, boundaryList_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, laneGroupList_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        boundaryDefinitions_ = new nds.lane.boundaries.BoundaryElementDefinitions(in);

        boundaryList_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.boundaries.Boundary.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.boundaries.Boundary>(new ZserioElementFactory_boundaryList()),
                zserio.runtime.array.ArrayType.AUTO);
        boundaryList_.readPacked(in);

        laneGroupList_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.lanegroups.LaneGroup.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.lanegroups.LaneGroup>(new ZserioElementFactory_laneGroupList()),
                zserio.runtime.array.ArrayType.AUTO);
        laneGroupList_.readPacked(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        boundaryDefinitions_ = new nds.lane.boundaries.BoundaryElementDefinitions(zserioContext.getBoundaryDefinitions(), in);

        boundaryList_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.boundaries.Boundary.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.boundaries.Boundary>(new ZserioElementFactory_boundaryList()),
                zserio.runtime.array.ArrayType.AUTO);
        boundaryList_.readPacked(in);

        laneGroupList_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.lanegroups.LaneGroup.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.lanegroups.LaneGroup>(new ZserioElementFactory_laneGroupList()),
                zserio.runtime.array.ArrayType.AUTO);
        laneGroupList_.readPacked(in);
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

        endBitPosition = boundaryDefinitions_.initializeOffsets(endBitPosition);
        endBitPosition = boundaryList_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = laneGroupList_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = boundaryDefinitions_.initializeOffsets(zserioContext.getBoundaryDefinitions(), endBitPosition);
        endBitPosition = boundaryList_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = laneGroupList_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        boundaryDefinitions_.write(out);

        boundaryList_.writePacked(out);

        laneGroupList_.writePacked(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        boundaryDefinitions_.write(zserioContext.getBoundaryDefinitions(), out);

        boundaryList_.writePacked(out);

        laneGroupList_.writePacked(out);
    }

    private static final class ZserioElementFactory_boundaryList implements zserio.runtime.array.PackableElementFactory<nds.lane.boundaries.Boundary>
    {
        @Override
        public nds.lane.boundaries.Boundary create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.lane.boundaries.Boundary(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.lane.boundaries.Boundary.ZserioPackingContext();
        }

        @Override
        public nds.lane.boundaries.Boundary create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.lane.boundaries.Boundary(context, in);
        }
    }

    private static final class ZserioElementFactory_laneGroupList implements zserio.runtime.array.PackableElementFactory<nds.lane.lanegroups.LaneGroup>
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

    private nds.lane.boundaries.BoundaryElementDefinitions boundaryDefinitions_;
    private zserio.runtime.array.Array boundaryList_;
    private zserio.runtime.array.Array laneGroupList_;
}
