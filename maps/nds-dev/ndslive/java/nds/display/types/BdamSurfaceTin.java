/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.types;

public class BdamSurfaceTin implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
    };

    public BdamSurfaceTin(
            byte numIndexBits_)
    {
        this.numIndexBits_ = numIndexBits_;
    }

    public BdamSurfaceTin(zserio.runtime.io.BitStreamReader in,
            byte numIndexBits_)
            throws java.io.IOException
    {
        this.numIndexBits_ = numIndexBits_;

        read(in);
    }

    public BdamSurfaceTin(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            byte numIndexBits_)
            throws java.io.IOException
    {
        this.numIndexBits_ = numIndexBits_;

        read(context, in);
    }

    public BdamSurfaceTin(
            byte numIndexBits_,
            nds.display.types.RenderSurface[] renderSurfaces_,
            long[] indices_)
    {
        this(numIndexBits_);

        setRenderSurfaces(renderSurfaces_);
        setIndices(indices_);
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

        endBitPosition += renderSurfaces_.bitSizeOf(endBitPosition);
        endBitPosition += indices_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition += renderSurfaces_.bitSizeOfPacked(endBitPosition);
        endBitPosition += indices_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public byte getNumIndexBits()
    {
        return this.numIndexBits_;
    }

    public nds.display.types.RenderSurface[] getRenderSurfaces()
    {
        return (renderSurfaces_ == null) ? null : renderSurfaces_.getRawArray();
    }

    public void setRenderSurfaces(nds.display.types.RenderSurface[] renderSurfaces_)
    {
        this.renderSurfaces_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.display.types.RenderSurface.class, renderSurfaces_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.display.types.RenderSurface>(new ZserioElementFactory_renderSurfaces()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public long[] getIndices()
    {
        return (indices_ == null) ? null : indices_.getRawArray();
    }

    public void setIndices(long[] indices_)
    {
        this.indices_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.LongRawArray(indices_),
                new zserio.runtime.array.ArrayTraits.BitFieldLongArrayTraits((int)(getNumIndexBits() + 1)),
                zserio.runtime.array.ArrayType.AUTO);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof BdamSurfaceTin)
        {
            final BdamSurfaceTin that = (BdamSurfaceTin)obj;

            return
                    this.numIndexBits_ == that.numIndexBits_ &&
                    ((renderSurfaces_ == null) ? that.renderSurfaces_ == null : renderSurfaces_.equals(that.renderSurfaces_)) &&
                    ((indices_ == null) ? that.indices_ == null : indices_.equals(that.indices_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getNumIndexBits());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, renderSurfaces_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, indices_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        renderSurfaces_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.display.types.RenderSurface.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.display.types.RenderSurface>(new ZserioElementFactory_renderSurfaces()),
                zserio.runtime.array.ArrayType.AUTO);
        renderSurfaces_.read(in);

        indices_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.LongRawArray(),
                new zserio.runtime.array.ArrayTraits.BitFieldLongArrayTraits((int)(getNumIndexBits() + 1)),
                zserio.runtime.array.ArrayType.AUTO);
        indices_.readPacked(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        renderSurfaces_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.display.types.RenderSurface.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.display.types.RenderSurface>(new ZserioElementFactory_renderSurfaces()),
                zserio.runtime.array.ArrayType.AUTO);
        renderSurfaces_.readPacked(in);

        indices_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.LongRawArray(),
                new zserio.runtime.array.ArrayTraits.BitFieldLongArrayTraits((int)(getNumIndexBits() + 1)),
                zserio.runtime.array.ArrayType.AUTO);
        indices_.readPacked(in);
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

        endBitPosition = renderSurfaces_.initializeOffsets(endBitPosition);
        endBitPosition = indices_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition = renderSurfaces_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = indices_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        renderSurfaces_.write(out);

        indices_.writePacked(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        renderSurfaces_.writePacked(out);

        indices_.writePacked(out);
    }

    private final class ZserioElementFactory_renderSurfaces implements zserio.runtime.array.PackableElementFactory<nds.display.types.RenderSurface>
    {
        @Override
        public nds.display.types.RenderSurface create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.display.types.RenderSurface(in, (byte)(getNumIndexBits()));
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.display.types.RenderSurface.ZserioPackingContext();
        }

        @Override
        public nds.display.types.RenderSurface create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.display.types.RenderSurface(context, in, (byte)(getNumIndexBits()));
        }
    }

    private final byte numIndexBits_;
    private zserio.runtime.array.Array renderSurfaces_;
    private zserio.runtime.array.Array indices_;
}