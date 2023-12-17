/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.smart.path;

public class SmartLayerLocationIdPath implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            header_ = new nds.smart.types.SmartLayerHeader.ZserioPackingContext();
            locationId_ = new nds.core.location.RoadLocationId.ZserioPackingContext();
        }

        public nds.smart.types.SmartLayerHeader.ZserioPackingContext getHeader()
        {
            return header_;
        }

        public nds.core.location.RoadLocationId.ZserioPackingContext getLocationId()
        {
            return locationId_;
        }

        private nds.smart.types.SmartLayerHeader.ZserioPackingContext header_;
        private nds.core.location.RoadLocationId.ZserioPackingContext locationId_;
    };

    public SmartLayerLocationIdPath()
    {
    }

    public SmartLayerLocationIdPath(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public SmartLayerLocationIdPath(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public SmartLayerLocationIdPath(
            nds.smart.types.SmartLayerHeader header_,
            nds.core.location.RoadLocationId locationId_,
            nds.smart.path.SmartLayerLocationIdPathSegment[] segments_)
    {
        setHeader(header_);
        setLocationId(locationId_);
        setSegments(segments_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        header_.initPackingContext(zserioContext.getHeader());
        locationId_.initPackingContext(zserioContext.getLocationId());
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

        endBitPosition += header_.bitSizeOf(endBitPosition);
        endBitPosition += locationId_.bitSizeOf(endBitPosition);
        endBitPosition += segments_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += header_.bitSizeOf(zserioContext.getHeader(), endBitPosition);
        endBitPosition += locationId_.bitSizeOf(zserioContext.getLocationId(), endBitPosition);
        endBitPosition += segments_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.smart.types.SmartLayerHeader getHeader()
    {
        return header_;
    }

    public void setHeader(nds.smart.types.SmartLayerHeader header_)
    {
        this.header_ = header_;
    }

    public nds.core.location.RoadLocationId getLocationId()
    {
        return locationId_;
    }

    public void setLocationId(nds.core.location.RoadLocationId locationId_)
    {
        this.locationId_ = locationId_;
    }

    public nds.smart.path.SmartLayerLocationIdPathSegment[] getSegments()
    {
        return (segments_ == null) ? null : segments_.getRawArray();
    }

    public void setSegments(nds.smart.path.SmartLayerLocationIdPathSegment[] segments_)
    {
        this.segments_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.smart.path.SmartLayerLocationIdPathSegment.class, segments_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.smart.path.SmartLayerLocationIdPathSegment>(new ZserioElementFactory_segments()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof SmartLayerLocationIdPath)
        {
            final SmartLayerLocationIdPath that = (SmartLayerLocationIdPath)obj;

            return
                    ((header_ == null) ? that.header_ == null : header_.equals(that.header_)) &&
                    ((locationId_ == null) ? that.locationId_ == null : locationId_.equals(that.locationId_)) &&
                    ((segments_ == null) ? that.segments_ == null : segments_.equals(that.segments_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, header_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, locationId_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, segments_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        header_ = new nds.smart.types.SmartLayerHeader(in);

        locationId_ = new nds.core.location.RoadLocationId(in);

        segments_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.smart.path.SmartLayerLocationIdPathSegment.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.smart.path.SmartLayerLocationIdPathSegment>(new ZserioElementFactory_segments()),
                zserio.runtime.array.ArrayType.AUTO);
        segments_.read(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        header_ = new nds.smart.types.SmartLayerHeader(zserioContext.getHeader(), in);

        locationId_ = new nds.core.location.RoadLocationId(zserioContext.getLocationId(), in);

        segments_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.smart.path.SmartLayerLocationIdPathSegment.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.smart.path.SmartLayerLocationIdPathSegment>(new ZserioElementFactory_segments()),
                zserio.runtime.array.ArrayType.AUTO);
        segments_.readPacked(in);
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

        endBitPosition = header_.initializeOffsets(endBitPosition);
        endBitPosition = locationId_.initializeOffsets(endBitPosition);
        endBitPosition = segments_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = header_.initializeOffsets(zserioContext.getHeader(), endBitPosition);
        endBitPosition = locationId_.initializeOffsets(zserioContext.getLocationId(), endBitPosition);
        endBitPosition = segments_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        header_.write(out);

        locationId_.write(out);

        segments_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        header_.write(zserioContext.getHeader(), out);

        locationId_.write(zserioContext.getLocationId(), out);

        segments_.writePacked(out);
    }

    private final class ZserioElementFactory_segments implements zserio.runtime.array.PackableElementFactory<nds.smart.path.SmartLayerLocationIdPathSegment>
    {
        @Override
        public nds.smart.path.SmartLayerLocationIdPathSegment create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.smart.path.SmartLayerLocationIdPathSegment(in, getHeader());
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.smart.path.SmartLayerLocationIdPathSegment.ZserioPackingContext();
        }

        @Override
        public nds.smart.path.SmartLayerLocationIdPathSegment create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.smart.path.SmartLayerLocationIdPathSegment(context, in, getHeader());
        }
    }

    private nds.smart.types.SmartLayerHeader header_;
    private nds.core.location.RoadLocationId locationId_;
    private zserio.runtime.array.Array segments_;
}
