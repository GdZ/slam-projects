/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.localization.metadata;

public class LandmarkLayerMetadata implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
    };

    public LandmarkLayerMetadata()
    {
    }

    public LandmarkLayerMetadata(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public LandmarkLayerMetadata(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public LandmarkLayerMetadata(
            nds.localization.types.LandmarkLineType[] availableLineTypes_,
            nds.localization.types.LandmarkPolygonType[] availablePolygonTypes_,
            nds.localization.types.LandmarkMeshType[] availableMeshTypes_,
            boolean hasRelations_,
            boolean hasDetails_)
    {
        setAvailableLineTypes(availableLineTypes_);
        setAvailablePolygonTypes(availablePolygonTypes_);
        setAvailableMeshTypes(availableMeshTypes_);
        setHasRelations(hasRelations_);
        setHasDetails(hasDetails_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
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

        endBitPosition += availableLineTypes_.bitSizeOf(endBitPosition);
        endBitPosition += availablePolygonTypes_.bitSizeOf(endBitPosition);
        endBitPosition += availableMeshTypes_.bitSizeOf(endBitPosition);
        endBitPosition += 1;
        endBitPosition += 1;

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition += availableLineTypes_.bitSizeOfPacked(endBitPosition);
        endBitPosition += availablePolygonTypes_.bitSizeOfPacked(endBitPosition);
        endBitPosition += availableMeshTypes_.bitSizeOfPacked(endBitPosition);
        endBitPosition += 1;
        endBitPosition += 1;

        return (int)(endBitPosition - bitPosition);
    }

    public nds.localization.types.LandmarkLineType[] getAvailableLineTypes()
    {
        return (availableLineTypes_ == null) ? null : availableLineTypes_.getRawArray();
    }

    public void setAvailableLineTypes(nds.localization.types.LandmarkLineType[] availableLineTypes_)
    {
        this.availableLineTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.localization.types.LandmarkLineType.class, availableLineTypes_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.localization.types.LandmarkLineType>(new ZserioElementFactory_availableLineTypes()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public nds.localization.types.LandmarkPolygonType[] getAvailablePolygonTypes()
    {
        return (availablePolygonTypes_ == null) ? null : availablePolygonTypes_.getRawArray();
    }

    public void setAvailablePolygonTypes(nds.localization.types.LandmarkPolygonType[] availablePolygonTypes_)
    {
        this.availablePolygonTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.localization.types.LandmarkPolygonType.class, availablePolygonTypes_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.localization.types.LandmarkPolygonType>(new ZserioElementFactory_availablePolygonTypes()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public nds.localization.types.LandmarkMeshType[] getAvailableMeshTypes()
    {
        return (availableMeshTypes_ == null) ? null : availableMeshTypes_.getRawArray();
    }

    public void setAvailableMeshTypes(nds.localization.types.LandmarkMeshType[] availableMeshTypes_)
    {
        this.availableMeshTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.localization.types.LandmarkMeshType.class, availableMeshTypes_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.localization.types.LandmarkMeshType>(new ZserioElementFactory_availableMeshTypes()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public boolean getHasRelations()
    {
        return hasRelations_;
    }

    public void setHasRelations(boolean hasRelations_)
    {
        this.hasRelations_ = hasRelations_;
    }

    public boolean getHasDetails()
    {
        return hasDetails_;
    }

    public void setHasDetails(boolean hasDetails_)
    {
        this.hasDetails_ = hasDetails_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof LandmarkLayerMetadata)
        {
            final LandmarkLayerMetadata that = (LandmarkLayerMetadata)obj;

            return
                    ((availableLineTypes_ == null) ? that.availableLineTypes_ == null : availableLineTypes_.equals(that.availableLineTypes_)) &&
                    ((availablePolygonTypes_ == null) ? that.availablePolygonTypes_ == null : availablePolygonTypes_.equals(that.availablePolygonTypes_)) &&
                    ((availableMeshTypes_ == null) ? that.availableMeshTypes_ == null : availableMeshTypes_.equals(that.availableMeshTypes_)) &&
                    hasRelations_ == that.hasRelations_ &&
                    hasDetails_ == that.hasDetails_;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, availableLineTypes_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, availablePolygonTypes_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, availableMeshTypes_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, hasRelations_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, hasDetails_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        availableLineTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.localization.types.LandmarkLineType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.localization.types.LandmarkLineType>(new ZserioElementFactory_availableLineTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        availableLineTypes_.read(in);

        availablePolygonTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.localization.types.LandmarkPolygonType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.localization.types.LandmarkPolygonType>(new ZserioElementFactory_availablePolygonTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        availablePolygonTypes_.read(in);

        availableMeshTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.localization.types.LandmarkMeshType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.localization.types.LandmarkMeshType>(new ZserioElementFactory_availableMeshTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        availableMeshTypes_.read(in);

        hasRelations_ = in.readBool();

        hasDetails_ = in.readBool();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        availableLineTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.localization.types.LandmarkLineType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.localization.types.LandmarkLineType>(new ZserioElementFactory_availableLineTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        availableLineTypes_.readPacked(in);

        availablePolygonTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.localization.types.LandmarkPolygonType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.localization.types.LandmarkPolygonType>(new ZserioElementFactory_availablePolygonTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        availablePolygonTypes_.readPacked(in);

        availableMeshTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.localization.types.LandmarkMeshType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.localization.types.LandmarkMeshType>(new ZserioElementFactory_availableMeshTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        availableMeshTypes_.readPacked(in);

        hasRelations_ = in.readBool();

        hasDetails_ = in.readBool();
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

        endBitPosition = availableLineTypes_.initializeOffsets(endBitPosition);
        endBitPosition = availablePolygonTypes_.initializeOffsets(endBitPosition);
        endBitPosition = availableMeshTypes_.initializeOffsets(endBitPosition);
        endBitPosition += 1;
        endBitPosition += 1;

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition = availableLineTypes_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = availablePolygonTypes_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = availableMeshTypes_.initializeOffsetsPacked(endBitPosition);
        endBitPosition += 1;
        endBitPosition += 1;

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        availableLineTypes_.write(out);

        availablePolygonTypes_.write(out);

        availableMeshTypes_.write(out);

        out.writeBool(hasRelations_);

        out.writeBool(hasDetails_);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        availableLineTypes_.writePacked(out);

        availablePolygonTypes_.writePacked(out);

        availableMeshTypes_.writePacked(out);

        out.writeBool(hasRelations_);

        out.writeBool(hasDetails_);
    }

    private static final class ZserioElementFactory_availableLineTypes implements zserio.runtime.array.PackableElementFactory<nds.localization.types.LandmarkLineType>
    {
        @Override
        public nds.localization.types.LandmarkLineType create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return nds.localization.types.LandmarkLineType.readEnum(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new zserio.runtime.array.DeltaContext();
        }

        @Override
        public nds.localization.types.LandmarkLineType create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return nds.localization.types.LandmarkLineType.readEnum(context, in);
        }
    }

    private static final class ZserioElementFactory_availablePolygonTypes implements zserio.runtime.array.PackableElementFactory<nds.localization.types.LandmarkPolygonType>
    {
        @Override
        public nds.localization.types.LandmarkPolygonType create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return nds.localization.types.LandmarkPolygonType.readEnum(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new zserio.runtime.array.DeltaContext();
        }

        @Override
        public nds.localization.types.LandmarkPolygonType create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return nds.localization.types.LandmarkPolygonType.readEnum(context, in);
        }
    }

    private static final class ZserioElementFactory_availableMeshTypes implements zserio.runtime.array.PackableElementFactory<nds.localization.types.LandmarkMeshType>
    {
        @Override
        public nds.localization.types.LandmarkMeshType create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return nds.localization.types.LandmarkMeshType.readEnum(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new zserio.runtime.array.DeltaContext();
        }

        @Override
        public nds.localization.types.LandmarkMeshType create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return nds.localization.types.LandmarkMeshType.readEnum(context, in);
        }
    }

    private zserio.runtime.array.Array availableLineTypes_;
    private zserio.runtime.array.Array availablePolygonTypes_;
    private zserio.runtime.array.Array availableMeshTypes_;
    private boolean hasRelations_;
    private boolean hasDetails_;
}
