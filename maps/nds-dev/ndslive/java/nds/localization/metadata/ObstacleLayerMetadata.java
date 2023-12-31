/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.localization.metadata;

public class ObstacleLayerMetadata implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
    };

    public ObstacleLayerMetadata()
    {
    }

    public ObstacleLayerMetadata(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public ObstacleLayerMetadata(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public ObstacleLayerMetadata(
            nds.localization.types.ObstacleType[] availableObstacleTypes_)
    {
        setAvailableObstacleTypes(availableObstacleTypes_);
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

        endBitPosition += availableObstacleTypes_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition += availableObstacleTypes_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.localization.types.ObstacleType[] getAvailableObstacleTypes()
    {
        return (availableObstacleTypes_ == null) ? null : availableObstacleTypes_.getRawArray();
    }

    public void setAvailableObstacleTypes(nds.localization.types.ObstacleType[] availableObstacleTypes_)
    {
        this.availableObstacleTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.localization.types.ObstacleType.class, availableObstacleTypes_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.localization.types.ObstacleType>(new ZserioElementFactory_availableObstacleTypes()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof ObstacleLayerMetadata)
        {
            final ObstacleLayerMetadata that = (ObstacleLayerMetadata)obj;

            return
                    ((availableObstacleTypes_ == null) ? that.availableObstacleTypes_ == null : availableObstacleTypes_.equals(that.availableObstacleTypes_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, availableObstacleTypes_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        availableObstacleTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.localization.types.ObstacleType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.localization.types.ObstacleType>(new ZserioElementFactory_availableObstacleTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        availableObstacleTypes_.read(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        availableObstacleTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.localization.types.ObstacleType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.localization.types.ObstacleType>(new ZserioElementFactory_availableObstacleTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        availableObstacleTypes_.readPacked(in);
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

        endBitPosition = availableObstacleTypes_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition = availableObstacleTypes_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        availableObstacleTypes_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        availableObstacleTypes_.writePacked(out);
    }

    private static final class ZserioElementFactory_availableObstacleTypes implements zserio.runtime.array.PackableElementFactory<nds.localization.types.ObstacleType>
    {
        @Override
        public nds.localization.types.ObstacleType create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return nds.localization.types.ObstacleType.readEnum(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new zserio.runtime.array.DeltaContext();
        }

        @Override
        public nds.localization.types.ObstacleType create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return nds.localization.types.ObstacleType.readEnum(context, in);
        }
    }

    private zserio.runtime.array.Array availableObstacleTypes_;
}
