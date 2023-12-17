/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.smart.types;

public class RasterTileInfo implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            lifetimeInfo_ = new nds.smart.types.DataLayerLifetime.ZserioPackingContext();
        }

        public nds.smart.types.DataLayerLifetime.ZserioPackingContext getLifetimeInfo()
        {
            return lifetimeInfo_;
        }

        private nds.smart.types.DataLayerLifetime.ZserioPackingContext lifetimeInfo_;
    };

    public RasterTileInfo()
    {
    }

    public RasterTileInfo(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RasterTileInfo(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RasterTileInfo(
            nds.smart.types.DataLayerLifetime lifetimeInfo_,
            nds.system.types.ExternData[] configurations_)
    {
        setLifetimeInfo(lifetimeInfo_);
        setConfigurations(configurations_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        lifetimeInfo_.initPackingContext(zserioContext.getLifetimeInfo());
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

        endBitPosition += lifetimeInfo_.bitSizeOf(endBitPosition);
        endBitPosition += configurations_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += lifetimeInfo_.bitSizeOf(zserioContext.getLifetimeInfo(), endBitPosition);
        endBitPosition += configurations_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.smart.types.DataLayerLifetime getLifetimeInfo()
    {
        return lifetimeInfo_;
    }

    public void setLifetimeInfo(nds.smart.types.DataLayerLifetime lifetimeInfo_)
    {
        this.lifetimeInfo_ = lifetimeInfo_;
    }

    public nds.system.types.ExternData[] getConfigurations()
    {
        return (configurations_ == null) ? null : configurations_.getRawArray();
    }

    public void setConfigurations(nds.system.types.ExternData[] configurations_)
    {
        this.configurations_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.system.types.ExternData.class, configurations_),
                new zserio.runtime.array.ArrayTraits.WriteObjectArrayTraits<nds.system.types.ExternData>(new ZserioElementFactory_configurations()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RasterTileInfo)
        {
            final RasterTileInfo that = (RasterTileInfo)obj;

            return
                    ((lifetimeInfo_ == null) ? that.lifetimeInfo_ == null : lifetimeInfo_.equals(that.lifetimeInfo_)) &&
                    ((configurations_ == null) ? that.configurations_ == null : configurations_.equals(that.configurations_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, lifetimeInfo_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, configurations_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        lifetimeInfo_ = new nds.smart.types.DataLayerLifetime(in);

        configurations_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.system.types.ExternData.class),
                new zserio.runtime.array.ArrayTraits.WriteObjectArrayTraits<nds.system.types.ExternData>(new ZserioElementFactory_configurations()),
                zserio.runtime.array.ArrayType.AUTO);
        configurations_.read(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        lifetimeInfo_ = new nds.smart.types.DataLayerLifetime(zserioContext.getLifetimeInfo(), in);

        configurations_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.system.types.ExternData.class),
                new zserio.runtime.array.ArrayTraits.WriteObjectArrayTraits<nds.system.types.ExternData>(new ZserioElementFactory_configurations()),
                zserio.runtime.array.ArrayType.AUTO);
        configurations_.read(in);
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

        endBitPosition = lifetimeInfo_.initializeOffsets(endBitPosition);
        endBitPosition = configurations_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = lifetimeInfo_.initializeOffsets(zserioContext.getLifetimeInfo(), endBitPosition);
        endBitPosition = configurations_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        lifetimeInfo_.write(out);

        configurations_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        lifetimeInfo_.write(zserioContext.getLifetimeInfo(), out);

        configurations_.write(out);
    }

    private static final class ZserioElementFactory_configurations implements zserio.runtime.array.ElementFactory<nds.system.types.ExternData>
    {
        @Override
        public nds.system.types.ExternData create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.system.types.ExternData(in);
        }
    }

    private nds.smart.types.DataLayerLifetime lifetimeInfo_;
    private zserio.runtime.array.Array configurations_;
}
