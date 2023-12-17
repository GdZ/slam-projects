/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.lane.metadata;

public class LaneLayerMetadata implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            boundaryGeometryUsage_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getBoundaryGeometryUsage()
        {
            return boundaryGeometryUsage_;
        }

        private zserio.runtime.array.DeltaContext boundaryGeometryUsage_;
    };

    public LaneLayerMetadata()
    {
    }

    public LaneLayerMetadata(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public LaneLayerMetadata(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public LaneLayerMetadata(
            nds.core.types.RoadType[] includedRoadTypes_,
            nds.lane.lanegroups.LaneGroupType[] includedLaneGroupTypes_,
            nds.lane.types.LogicalBoundaryType[] includedLogicalBoundaryTypes_,
            nds.lane.types.MarkingBoundaryType[] includedMarkingBoundaryTypes_,
            nds.lane.types.PhysicalDividerBoundaryType[] includedPhysicalDividerBoundaryTypes_,
            nds.lane.types.PhysicalMarkingBoundaryType[] includedPhysicalMarkingBoundaryTypes_,
            nds.lane.metadata.BoundaryGeometryUsage boundaryGeometryUsage_)
    {
        setIncludedRoadTypes(includedRoadTypes_);
        setIncludedLaneGroupTypes(includedLaneGroupTypes_);
        setIncludedLogicalBoundaryTypes(includedLogicalBoundaryTypes_);
        setIncludedMarkingBoundaryTypes(includedMarkingBoundaryTypes_);
        setIncludedPhysicalDividerBoundaryTypes(includedPhysicalDividerBoundaryTypes_);
        setIncludedPhysicalMarkingBoundaryTypes(includedPhysicalMarkingBoundaryTypes_);
        setBoundaryGeometryUsage(boundaryGeometryUsage_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        boundaryGeometryUsage_.initPackingContext(zserioContext.getBoundaryGeometryUsage());
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

        endBitPosition += includedRoadTypes_.bitSizeOf(endBitPosition);
        endBitPosition += includedLaneGroupTypes_.bitSizeOf(endBitPosition);
        endBitPosition += includedLogicalBoundaryTypes_.bitSizeOf(endBitPosition);
        endBitPosition += includedMarkingBoundaryTypes_.bitSizeOf(endBitPosition);
        endBitPosition += includedPhysicalDividerBoundaryTypes_.bitSizeOf(endBitPosition);
        endBitPosition += includedPhysicalMarkingBoundaryTypes_.bitSizeOf(endBitPosition);
        endBitPosition += boundaryGeometryUsage_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += includedRoadTypes_.bitSizeOfPacked(endBitPosition);
        endBitPosition += includedLaneGroupTypes_.bitSizeOfPacked(endBitPosition);
        endBitPosition += includedLogicalBoundaryTypes_.bitSizeOfPacked(endBitPosition);
        endBitPosition += includedMarkingBoundaryTypes_.bitSizeOfPacked(endBitPosition);
        endBitPosition += includedPhysicalDividerBoundaryTypes_.bitSizeOfPacked(endBitPosition);
        endBitPosition += includedPhysicalMarkingBoundaryTypes_.bitSizeOfPacked(endBitPosition);
        endBitPosition += boundaryGeometryUsage_.bitSizeOf(zserioContext.getBoundaryGeometryUsage(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.types.RoadType[] getIncludedRoadTypes()
    {
        return (includedRoadTypes_ == null) ? null : includedRoadTypes_.getRawArray();
    }

    public void setIncludedRoadTypes(nds.core.types.RoadType[] includedRoadTypes_)
    {
        this.includedRoadTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.RoadType.class, includedRoadTypes_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.RoadType>(new ZserioElementFactory_includedRoadTypes()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public nds.lane.lanegroups.LaneGroupType[] getIncludedLaneGroupTypes()
    {
        return (includedLaneGroupTypes_ == null) ? null : includedLaneGroupTypes_.getRawArray();
    }

    public void setIncludedLaneGroupTypes(nds.lane.lanegroups.LaneGroupType[] includedLaneGroupTypes_)
    {
        this.includedLaneGroupTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.lane.lanegroups.LaneGroupType.class, includedLaneGroupTypes_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.lanegroups.LaneGroupType>(new ZserioElementFactory_includedLaneGroupTypes()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public nds.lane.types.LogicalBoundaryType[] getIncludedLogicalBoundaryTypes()
    {
        return (includedLogicalBoundaryTypes_ == null) ? null : includedLogicalBoundaryTypes_.getRawArray();
    }

    public void setIncludedLogicalBoundaryTypes(nds.lane.types.LogicalBoundaryType[] includedLogicalBoundaryTypes_)
    {
        this.includedLogicalBoundaryTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.lane.types.LogicalBoundaryType.class, includedLogicalBoundaryTypes_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.types.LogicalBoundaryType>(new ZserioElementFactory_includedLogicalBoundaryTypes()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public nds.lane.types.MarkingBoundaryType[] getIncludedMarkingBoundaryTypes()
    {
        return (includedMarkingBoundaryTypes_ == null) ? null : includedMarkingBoundaryTypes_.getRawArray();
    }

    public void setIncludedMarkingBoundaryTypes(nds.lane.types.MarkingBoundaryType[] includedMarkingBoundaryTypes_)
    {
        this.includedMarkingBoundaryTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.lane.types.MarkingBoundaryType.class, includedMarkingBoundaryTypes_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.types.MarkingBoundaryType>(new ZserioElementFactory_includedMarkingBoundaryTypes()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public nds.lane.types.PhysicalDividerBoundaryType[] getIncludedPhysicalDividerBoundaryTypes()
    {
        return (includedPhysicalDividerBoundaryTypes_ == null) ? null : includedPhysicalDividerBoundaryTypes_.getRawArray();
    }

    public void setIncludedPhysicalDividerBoundaryTypes(nds.lane.types.PhysicalDividerBoundaryType[] includedPhysicalDividerBoundaryTypes_)
    {
        this.includedPhysicalDividerBoundaryTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.lane.types.PhysicalDividerBoundaryType.class, includedPhysicalDividerBoundaryTypes_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.types.PhysicalDividerBoundaryType>(new ZserioElementFactory_includedPhysicalDividerBoundaryTypes()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public nds.lane.types.PhysicalMarkingBoundaryType[] getIncludedPhysicalMarkingBoundaryTypes()
    {
        return (includedPhysicalMarkingBoundaryTypes_ == null) ? null : includedPhysicalMarkingBoundaryTypes_.getRawArray();
    }

    public void setIncludedPhysicalMarkingBoundaryTypes(nds.lane.types.PhysicalMarkingBoundaryType[] includedPhysicalMarkingBoundaryTypes_)
    {
        this.includedPhysicalMarkingBoundaryTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.lane.types.PhysicalMarkingBoundaryType.class, includedPhysicalMarkingBoundaryTypes_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.types.PhysicalMarkingBoundaryType>(new ZserioElementFactory_includedPhysicalMarkingBoundaryTypes()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public nds.lane.metadata.BoundaryGeometryUsage getBoundaryGeometryUsage()
    {
        return boundaryGeometryUsage_;
    }

    public void setBoundaryGeometryUsage(nds.lane.metadata.BoundaryGeometryUsage boundaryGeometryUsage_)
    {
        this.boundaryGeometryUsage_ = boundaryGeometryUsage_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof LaneLayerMetadata)
        {
            final LaneLayerMetadata that = (LaneLayerMetadata)obj;

            return
                    ((includedRoadTypes_ == null) ? that.includedRoadTypes_ == null : includedRoadTypes_.equals(that.includedRoadTypes_)) &&
                    ((includedLaneGroupTypes_ == null) ? that.includedLaneGroupTypes_ == null : includedLaneGroupTypes_.equals(that.includedLaneGroupTypes_)) &&
                    ((includedLogicalBoundaryTypes_ == null) ? that.includedLogicalBoundaryTypes_ == null : includedLogicalBoundaryTypes_.equals(that.includedLogicalBoundaryTypes_)) &&
                    ((includedMarkingBoundaryTypes_ == null) ? that.includedMarkingBoundaryTypes_ == null : includedMarkingBoundaryTypes_.equals(that.includedMarkingBoundaryTypes_)) &&
                    ((includedPhysicalDividerBoundaryTypes_ == null) ? that.includedPhysicalDividerBoundaryTypes_ == null : includedPhysicalDividerBoundaryTypes_.equals(that.includedPhysicalDividerBoundaryTypes_)) &&
                    ((includedPhysicalMarkingBoundaryTypes_ == null) ? that.includedPhysicalMarkingBoundaryTypes_ == null : includedPhysicalMarkingBoundaryTypes_.equals(that.includedPhysicalMarkingBoundaryTypes_)) &&
                    ((boundaryGeometryUsage_ == null) ? that.boundaryGeometryUsage_ == null : boundaryGeometryUsage_.equals(that.boundaryGeometryUsage_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, includedRoadTypes_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, includedLaneGroupTypes_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, includedLogicalBoundaryTypes_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, includedMarkingBoundaryTypes_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, includedPhysicalDividerBoundaryTypes_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, includedPhysicalMarkingBoundaryTypes_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, boundaryGeometryUsage_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        includedRoadTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.RoadType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.RoadType>(new ZserioElementFactory_includedRoadTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        includedRoadTypes_.read(in);

        includedLaneGroupTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.lane.lanegroups.LaneGroupType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.lanegroups.LaneGroupType>(new ZserioElementFactory_includedLaneGroupTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        includedLaneGroupTypes_.read(in);

        includedLogicalBoundaryTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.lane.types.LogicalBoundaryType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.types.LogicalBoundaryType>(new ZserioElementFactory_includedLogicalBoundaryTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        includedLogicalBoundaryTypes_.read(in);

        includedMarkingBoundaryTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.lane.types.MarkingBoundaryType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.types.MarkingBoundaryType>(new ZserioElementFactory_includedMarkingBoundaryTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        includedMarkingBoundaryTypes_.read(in);

        includedPhysicalDividerBoundaryTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.lane.types.PhysicalDividerBoundaryType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.types.PhysicalDividerBoundaryType>(new ZserioElementFactory_includedPhysicalDividerBoundaryTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        includedPhysicalDividerBoundaryTypes_.read(in);

        includedPhysicalMarkingBoundaryTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.lane.types.PhysicalMarkingBoundaryType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.types.PhysicalMarkingBoundaryType>(new ZserioElementFactory_includedPhysicalMarkingBoundaryTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        includedPhysicalMarkingBoundaryTypes_.read(in);

        boundaryGeometryUsage_ = new nds.lane.metadata.BoundaryGeometryUsage(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        includedRoadTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.RoadType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.RoadType>(new ZserioElementFactory_includedRoadTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        includedRoadTypes_.readPacked(in);

        includedLaneGroupTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.lane.lanegroups.LaneGroupType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.lanegroups.LaneGroupType>(new ZserioElementFactory_includedLaneGroupTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        includedLaneGroupTypes_.readPacked(in);

        includedLogicalBoundaryTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.lane.types.LogicalBoundaryType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.types.LogicalBoundaryType>(new ZserioElementFactory_includedLogicalBoundaryTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        includedLogicalBoundaryTypes_.readPacked(in);

        includedMarkingBoundaryTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.lane.types.MarkingBoundaryType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.types.MarkingBoundaryType>(new ZserioElementFactory_includedMarkingBoundaryTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        includedMarkingBoundaryTypes_.readPacked(in);

        includedPhysicalDividerBoundaryTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.lane.types.PhysicalDividerBoundaryType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.types.PhysicalDividerBoundaryType>(new ZserioElementFactory_includedPhysicalDividerBoundaryTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        includedPhysicalDividerBoundaryTypes_.readPacked(in);

        includedPhysicalMarkingBoundaryTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.lane.types.PhysicalMarkingBoundaryType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.types.PhysicalMarkingBoundaryType>(new ZserioElementFactory_includedPhysicalMarkingBoundaryTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        includedPhysicalMarkingBoundaryTypes_.readPacked(in);

        boundaryGeometryUsage_ = new nds.lane.metadata.BoundaryGeometryUsage(zserioContext.getBoundaryGeometryUsage(), in);
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

        endBitPosition = includedRoadTypes_.initializeOffsets(endBitPosition);
        endBitPosition = includedLaneGroupTypes_.initializeOffsets(endBitPosition);
        endBitPosition = includedLogicalBoundaryTypes_.initializeOffsets(endBitPosition);
        endBitPosition = includedMarkingBoundaryTypes_.initializeOffsets(endBitPosition);
        endBitPosition = includedPhysicalDividerBoundaryTypes_.initializeOffsets(endBitPosition);
        endBitPosition = includedPhysicalMarkingBoundaryTypes_.initializeOffsets(endBitPosition);
        endBitPosition += boundaryGeometryUsage_.bitSizeOf(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = includedRoadTypes_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = includedLaneGroupTypes_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = includedLogicalBoundaryTypes_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = includedMarkingBoundaryTypes_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = includedPhysicalDividerBoundaryTypes_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = includedPhysicalMarkingBoundaryTypes_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = boundaryGeometryUsage_.initializeOffsets(zserioContext.getBoundaryGeometryUsage(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        includedRoadTypes_.write(out);

        includedLaneGroupTypes_.write(out);

        includedLogicalBoundaryTypes_.write(out);

        includedMarkingBoundaryTypes_.write(out);

        includedPhysicalDividerBoundaryTypes_.write(out);

        includedPhysicalMarkingBoundaryTypes_.write(out);

        boundaryGeometryUsage_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        includedRoadTypes_.writePacked(out);

        includedLaneGroupTypes_.writePacked(out);

        includedLogicalBoundaryTypes_.writePacked(out);

        includedMarkingBoundaryTypes_.writePacked(out);

        includedPhysicalDividerBoundaryTypes_.writePacked(out);

        includedPhysicalMarkingBoundaryTypes_.writePacked(out);

        boundaryGeometryUsage_.write(zserioContext.getBoundaryGeometryUsage(), out);
    }

    private static final class ZserioElementFactory_includedRoadTypes implements zserio.runtime.array.PackableElementFactory<nds.core.types.RoadType>
    {
        @Override
        public nds.core.types.RoadType create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.core.types.RoadType(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.core.types.RoadType.ZserioPackingContext();
        }

        @Override
        public nds.core.types.RoadType create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.core.types.RoadType(context, in);
        }
    }

    private static final class ZserioElementFactory_includedLaneGroupTypes implements zserio.runtime.array.PackableElementFactory<nds.lane.lanegroups.LaneGroupType>
    {
        @Override
        public nds.lane.lanegroups.LaneGroupType create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return nds.lane.lanegroups.LaneGroupType.readEnum(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new zserio.runtime.array.DeltaContext();
        }

        @Override
        public nds.lane.lanegroups.LaneGroupType create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return nds.lane.lanegroups.LaneGroupType.readEnum(context, in);
        }
    }

    private static final class ZserioElementFactory_includedLogicalBoundaryTypes implements zserio.runtime.array.PackableElementFactory<nds.lane.types.LogicalBoundaryType>
    {
        @Override
        public nds.lane.types.LogicalBoundaryType create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return nds.lane.types.LogicalBoundaryType.readEnum(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new zserio.runtime.array.DeltaContext();
        }

        @Override
        public nds.lane.types.LogicalBoundaryType create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return nds.lane.types.LogicalBoundaryType.readEnum(context, in);
        }
    }

    private static final class ZserioElementFactory_includedMarkingBoundaryTypes implements zserio.runtime.array.PackableElementFactory<nds.lane.types.MarkingBoundaryType>
    {
        @Override
        public nds.lane.types.MarkingBoundaryType create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return nds.lane.types.MarkingBoundaryType.readEnum(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new zserio.runtime.array.DeltaContext();
        }

        @Override
        public nds.lane.types.MarkingBoundaryType create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return nds.lane.types.MarkingBoundaryType.readEnum(context, in);
        }
    }

    private static final class ZserioElementFactory_includedPhysicalDividerBoundaryTypes implements zserio.runtime.array.PackableElementFactory<nds.lane.types.PhysicalDividerBoundaryType>
    {
        @Override
        public nds.lane.types.PhysicalDividerBoundaryType create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return nds.lane.types.PhysicalDividerBoundaryType.readEnum(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new zserio.runtime.array.DeltaContext();
        }

        @Override
        public nds.lane.types.PhysicalDividerBoundaryType create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return nds.lane.types.PhysicalDividerBoundaryType.readEnum(context, in);
        }
    }

    private static final class ZserioElementFactory_includedPhysicalMarkingBoundaryTypes implements zserio.runtime.array.PackableElementFactory<nds.lane.types.PhysicalMarkingBoundaryType>
    {
        @Override
        public nds.lane.types.PhysicalMarkingBoundaryType create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return nds.lane.types.PhysicalMarkingBoundaryType.readEnum(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new zserio.runtime.array.DeltaContext();
        }

        @Override
        public nds.lane.types.PhysicalMarkingBoundaryType create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return nds.lane.types.PhysicalMarkingBoundaryType.readEnum(context, in);
        }
    }

    private zserio.runtime.array.Array includedRoadTypes_;
    private zserio.runtime.array.Array includedLaneGroupTypes_;
    private zserio.runtime.array.Array includedLogicalBoundaryTypes_;
    private zserio.runtime.array.Array includedMarkingBoundaryTypes_;
    private zserio.runtime.array.Array includedPhysicalDividerBoundaryTypes_;
    private zserio.runtime.array.Array includedPhysicalMarkingBoundaryTypes_;
    private nds.lane.metadata.BoundaryGeometryUsage boundaryGeometryUsage_;
}
