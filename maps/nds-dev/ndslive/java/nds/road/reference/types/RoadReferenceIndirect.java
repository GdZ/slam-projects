/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.road.reference.types;

public class RoadReferenceIndirect implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            referenceGeometry_ = new nds.core.location.LocationGeometry.ZserioPackingContext();
        }

        public nds.core.location.LocationGeometry.ZserioPackingContext getReferenceGeometry()
        {
            return referenceGeometry_;
        }

        private nds.core.location.LocationGeometry.ZserioPackingContext referenceGeometry_;
    };

    public RoadReferenceIndirect()
    {
    }

    public RoadReferenceIndirect(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RoadReferenceIndirect(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RoadReferenceIndirect(
            boolean isDirected_,
            nds.core.location.LocationGeometry referenceGeometry_,
            nds.core.location.LocationSegment[] referenceSegments_,
            nds.road.reference.types.ReferenceGeometryIntersectionZLevel[] intersectionZLevel_)
    {
        setIsDirected(isDirected_);
        setReferenceGeometry(referenceGeometry_);
        setReferenceSegments(referenceSegments_);
        setIntersectionZLevel(intersectionZLevel_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        referenceGeometry_.initPackingContext(zserioContext.getReferenceGeometry());
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

        endBitPosition += 1;
        endBitPosition += referenceGeometry_.bitSizeOf(endBitPosition);
        endBitPosition += referenceSegments_.bitSizeOf(endBitPosition);
        endBitPosition += 1;
        if (isIntersectionZLevelUsed())
        {
            endBitPosition += intersectionZLevel_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += 1;
        endBitPosition += referenceGeometry_.bitSizeOf(zserioContext.getReferenceGeometry(), endBitPosition);
        endBitPosition += referenceSegments_.bitSizeOfPacked(endBitPosition);
        endBitPosition += 1;
        if (isIntersectionZLevelUsed())
        {
            endBitPosition += intersectionZLevel_.bitSizeOfPacked(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public boolean getIsDirected()
    {
        return isDirected_;
    }

    public void setIsDirected(boolean isDirected_)
    {
        this.isDirected_ = isDirected_;
    }

    public nds.core.location.LocationGeometry getReferenceGeometry()
    {
        return referenceGeometry_;
    }

    public void setReferenceGeometry(nds.core.location.LocationGeometry referenceGeometry_)
    {
        this.referenceGeometry_ = referenceGeometry_;
    }

    public nds.core.location.LocationSegment[] getReferenceSegments()
    {
        return (referenceSegments_ == null) ? null : referenceSegments_.getRawArray();
    }

    public void setReferenceSegments(nds.core.location.LocationSegment[] referenceSegments_)
    {
        this.referenceSegments_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.location.LocationSegment.class, referenceSegments_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.location.LocationSegment>(new ZserioElementFactory_referenceSegments()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public nds.road.reference.types.ReferenceGeometryIntersectionZLevel[] getIntersectionZLevel()
    {
        return (intersectionZLevel_ == null) ? null : intersectionZLevel_.getRawArray();
    }

    public void setIntersectionZLevel(nds.road.reference.types.ReferenceGeometryIntersectionZLevel[] intersectionZLevel_)
    {
        if (intersectionZLevel_ == null)
        {
            this.intersectionZLevel_ = null;
        }
        else
        {
            this.intersectionZLevel_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.road.reference.types.ReferenceGeometryIntersectionZLevel.class, intersectionZLevel_),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.road.reference.types.ReferenceGeometryIntersectionZLevel>(new ZserioElementFactory_intersectionZLevel()),
                    zserio.runtime.array.ArrayType.NORMAL);
        }
    }

    public boolean isIntersectionZLevelUsed()
    {
        return isIntersectionZLevelSet();
    }

    public boolean isIntersectionZLevelSet()
    {
        return (intersectionZLevel_ != null);
    }

    public void resetIntersectionZLevel()
    {
        this.intersectionZLevel_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RoadReferenceIndirect)
        {
            final RoadReferenceIndirect that = (RoadReferenceIndirect)obj;

            return
                    isDirected_ == that.isDirected_ &&
                    ((referenceGeometry_ == null) ? that.referenceGeometry_ == null : referenceGeometry_.equals(that.referenceGeometry_)) &&
                    ((referenceSegments_ == null) ? that.referenceSegments_ == null : referenceSegments_.equals(that.referenceSegments_)) &&
                    ((!isIntersectionZLevelUsed()) ? !that.isIntersectionZLevelUsed() :
                        ((intersectionZLevel_ == null) ? that.intersectionZLevel_ == null : intersectionZLevel_.equals(that.intersectionZLevel_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, isDirected_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, referenceGeometry_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, referenceSegments_);
        if (isIntersectionZLevelUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, intersectionZLevel_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        isDirected_ = in.readBool();

        referenceGeometry_ = new nds.core.location.LocationGeometry(in);

        referenceSegments_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.location.LocationSegment.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.location.LocationSegment>(new ZserioElementFactory_referenceSegments()),
                zserio.runtime.array.ArrayType.AUTO);
        referenceSegments_.read(in);

        if (in.readBool())
        {
            intersectionZLevel_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.road.reference.types.ReferenceGeometryIntersectionZLevel.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.road.reference.types.ReferenceGeometryIntersectionZLevel>(new ZserioElementFactory_intersectionZLevel()),
                    zserio.runtime.array.ArrayType.NORMAL);
            intersectionZLevel_.read(in, (int)(getReferenceGeometry().getLine().getNumPositions()));
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        isDirected_ = in.readBool();

        referenceGeometry_ = new nds.core.location.LocationGeometry(zserioContext.getReferenceGeometry(), in);

        referenceSegments_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.location.LocationSegment.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.location.LocationSegment>(new ZserioElementFactory_referenceSegments()),
                zserio.runtime.array.ArrayType.AUTO);
        referenceSegments_.readPacked(in);

        if (in.readBool())
        {
            intersectionZLevel_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.road.reference.types.ReferenceGeometryIntersectionZLevel.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.road.reference.types.ReferenceGeometryIntersectionZLevel>(new ZserioElementFactory_intersectionZLevel()),
                    zserio.runtime.array.ArrayType.NORMAL);
            intersectionZLevel_.readPacked(in, (int)(getReferenceGeometry().getLine().getNumPositions()));
        }
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

        endBitPosition += 1;
        endBitPosition = referenceGeometry_.initializeOffsets(endBitPosition);
        endBitPosition = referenceSegments_.initializeOffsets(endBitPosition);
        endBitPosition += 1;
        if (isIntersectionZLevelUsed())
        {
            endBitPosition = intersectionZLevel_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += 1;
        endBitPosition = referenceGeometry_.initializeOffsets(zserioContext.getReferenceGeometry(), endBitPosition);
        endBitPosition = referenceSegments_.initializeOffsetsPacked(endBitPosition);
        endBitPosition += 1;
        if (isIntersectionZLevelUsed())
        {
            endBitPosition = intersectionZLevel_.initializeOffsetsPacked(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeBool(isDirected_);

        referenceGeometry_.write(out);

        referenceSegments_.write(out);

        if (isIntersectionZLevelUsed())
        {
            out.writeBool(true);
            if (intersectionZLevel_.size() != (int)(getReferenceGeometry().getLine().getNumPositions()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong array length for field RoadReferenceIndirect.intersectionZLevel: " +
                        intersectionZLevel_.size() + " != " + (int)(getReferenceGeometry().getLine().getNumPositions()) + "!");
            }
            intersectionZLevel_.write(out);
        }
        else
        {
            out.writeBool(false);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        out.writeBool(isDirected_);

        referenceGeometry_.write(zserioContext.getReferenceGeometry(), out);

        referenceSegments_.writePacked(out);

        if (isIntersectionZLevelUsed())
        {
            out.writeBool(true);
            if (intersectionZLevel_.size() != (int)(getReferenceGeometry().getLine().getNumPositions()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong array length for field RoadReferenceIndirect.intersectionZLevel: " +
                        intersectionZLevel_.size() + " != " + (int)(getReferenceGeometry().getLine().getNumPositions()) + "!");
            }
            intersectionZLevel_.writePacked(out);
        }
        else
        {
            out.writeBool(false);
        }
    }

    private final class ZserioElementFactory_referenceSegments implements zserio.runtime.array.PackableElementFactory<nds.core.location.LocationSegment>
    {
        @Override
        public nds.core.location.LocationSegment create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.core.location.LocationSegment(in, getReferenceGeometry());
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.core.location.LocationSegment.ZserioPackingContext();
        }

        @Override
        public nds.core.location.LocationSegment create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.core.location.LocationSegment(context, in, getReferenceGeometry());
        }
    }

    private static final class ZserioElementFactory_intersectionZLevel implements zserio.runtime.array.PackableElementFactory<nds.road.reference.types.ReferenceGeometryIntersectionZLevel>
    {
        @Override
        public nds.road.reference.types.ReferenceGeometryIntersectionZLevel create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.road.reference.types.ReferenceGeometryIntersectionZLevel(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.road.reference.types.ReferenceGeometryIntersectionZLevel.ZserioPackingContext();
        }

        @Override
        public nds.road.reference.types.ReferenceGeometryIntersectionZLevel create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.road.reference.types.ReferenceGeometryIntersectionZLevel(context, in);
        }
    }

    private boolean isDirected_;
    private nds.core.location.LocationGeometry referenceGeometry_;
    private zserio.runtime.array.Array referenceSegments_;
    private zserio.runtime.array.Array intersectionZLevel_;
}
