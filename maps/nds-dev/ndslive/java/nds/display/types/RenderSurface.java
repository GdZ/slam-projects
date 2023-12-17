/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.types;

public class RenderSurface implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            areaType_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getAreaType()
        {
            return areaType_;
        }

        private zserio.runtime.array.DeltaContext areaType_;
    };

    public RenderSurface(
            byte numIndexBits_)
    {
        this.numIndexBits_ = numIndexBits_;
    }

    public RenderSurface(zserio.runtime.io.BitStreamReader in,
            byte numIndexBits_)
            throws java.io.IOException
    {
        this.numIndexBits_ = numIndexBits_;

        read(in);
    }

    public RenderSurface(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            byte numIndexBits_)
            throws java.io.IOException
    {
        this.numIndexBits_ = numIndexBits_;

        read(context, in);
    }

    public RenderSurface(
            byte numIndexBits_,
            nds.display.types.DisplayAreaType areaType_,
            nds.display.types.RenderSurfacePart[] renderSurfaceParts_)
    {
        this(numIndexBits_);

        setAreaType(areaType_);
        setRenderSurfaceParts(renderSurfaceParts_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        areaType_.initPackingContext(zserioContext.getAreaType());
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

        endBitPosition += areaType_.bitSizeOf(endBitPosition);
        endBitPosition += renderSurfaceParts_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += areaType_.bitSizeOf(zserioContext.getAreaType(), endBitPosition);
        endBitPosition += renderSurfaceParts_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public byte getNumIndexBits()
    {
        return this.numIndexBits_;
    }

    public nds.display.types.DisplayAreaType getAreaType()
    {
        return areaType_;
    }

    public void setAreaType(nds.display.types.DisplayAreaType areaType_)
    {
        this.areaType_ = areaType_;
    }

    public nds.display.types.RenderSurfacePart[] getRenderSurfaceParts()
    {
        return (renderSurfaceParts_ == null) ? null : renderSurfaceParts_.getRawArray();
    }

    public void setRenderSurfaceParts(nds.display.types.RenderSurfacePart[] renderSurfaceParts_)
    {
        this.renderSurfaceParts_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.display.types.RenderSurfacePart.class, renderSurfaceParts_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.display.types.RenderSurfacePart>(new ZserioElementFactory_renderSurfaceParts()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RenderSurface)
        {
            final RenderSurface that = (RenderSurface)obj;

            return
                    this.numIndexBits_ == that.numIndexBits_ &&
                    ((areaType_ == null) ? that.areaType_ == null : areaType_.getValue() == that.areaType_.getValue()) &&
                    ((renderSurfaceParts_ == null) ? that.renderSurfaceParts_ == null : renderSurfaceParts_.equals(that.renderSurfaceParts_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getNumIndexBits());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, areaType_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, renderSurfaceParts_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        areaType_ = nds.display.types.DisplayAreaType.readEnum(in);

        renderSurfaceParts_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.display.types.RenderSurfacePart.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.display.types.RenderSurfacePart>(new ZserioElementFactory_renderSurfaceParts()),
                zserio.runtime.array.ArrayType.AUTO);
        renderSurfaceParts_.read(in);

        checkConstraints();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        areaType_ = nds.display.types.DisplayAreaType.readEnum(zserioContext.getAreaType(), in);

        renderSurfaceParts_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.display.types.RenderSurfacePart.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.display.types.RenderSurfacePart>(new ZserioElementFactory_renderSurfaceParts()),
                zserio.runtime.array.ArrayType.AUTO);
        renderSurfaceParts_.readPacked(in);

        checkConstraints();
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

        endBitPosition += areaType_.bitSizeOf(endBitPosition);
        endBitPosition = renderSurfaceParts_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = areaType_.initializeOffsets(zserioContext.getAreaType(), endBitPosition);
        endBitPosition = renderSurfaceParts_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        checkConstraints();

        areaType_.write(out);

        renderSurfaceParts_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        checkConstraints();

        areaType_.write(zserioContext.getAreaType(), out);

        renderSurfaceParts_.writePacked(out);
    }

    private void checkConstraints()
    {
        if (!(getRenderSurfaceParts().length > 0))
            throw new zserio.runtime.ConstraintError("Constraint violated at RenderSurface.renderSurfaceParts!");
    }

    private final class ZserioElementFactory_renderSurfaceParts implements zserio.runtime.array.PackableElementFactory<nds.display.types.RenderSurfacePart>
    {
        @Override
        public nds.display.types.RenderSurfacePart create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.display.types.RenderSurfacePart(in, (byte)(getNumIndexBits()));
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.display.types.RenderSurfacePart.ZserioPackingContext();
        }

        @Override
        public nds.display.types.RenderSurfacePart create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.display.types.RenderSurfacePart(context, in, (byte)(getNumIndexBits()));
        }
    }

    private final byte numIndexBits_;
    private nds.display.types.DisplayAreaType areaType_;
    private zserio.runtime.array.Array renderSurfaceParts_;
}
