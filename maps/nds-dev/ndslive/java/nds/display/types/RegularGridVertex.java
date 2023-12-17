/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.types;

public class RegularGridVertex implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            elevation_ = new zserio.runtime.array.DeltaContext();
            normal_ = new nds.display.types.NormalSphere.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getElevation()
        {
            return elevation_;
        }

        public nds.display.types.NormalSphere.ZserioPackingContext getNormal()
        {
            return normal_;
        }

        private zserio.runtime.array.DeltaContext elevation_;
        private nds.display.types.NormalSphere.ZserioPackingContext normal_;
    };

    public RegularGridVertex(
            byte shiftZ_,
            boolean hasTexture_)
    {
        this.shiftZ_ = shiftZ_;
        this.hasTexture_ = hasTexture_;
    }

    public RegularGridVertex(zserio.runtime.io.BitStreamReader in,
            byte shiftZ_,
            boolean hasTexture_)
            throws java.io.IOException
    {
        this.shiftZ_ = shiftZ_;
        this.hasTexture_ = hasTexture_;

        read(in);
    }

    public RegularGridVertex(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            byte shiftZ_,
            boolean hasTexture_)
            throws java.io.IOException
    {
        this.shiftZ_ = shiftZ_;
        this.hasTexture_ = hasTexture_;

        read(context, in);
    }

    public RegularGridVertex(
            byte shiftZ_,
            boolean hasTexture_,
            int elevation_,
            nds.display.types.NormalSphere normal_,
            nds.display.types.TextureCoords textureCoord_)
    {
        this(shiftZ_, hasTexture_);

        setElevation(elevation_);
        setNormal(normal_);
        setTextureCoord(textureCoord_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getElevation().init(new zserio.runtime.array.ArrayTraits.SignedBitFieldIntArrayTraits((int)(31 - getShiftZ() + 1)),
                new zserio.runtime.array.ArrayElement.IntArrayElement(elevation_));
        normal_.initPackingContext(zserioContext.getNormal());
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

        endBitPosition += 31 - getShiftZ() + 1;
        endBitPosition += normal_.bitSizeOf(endBitPosition);
        if (isTextureCoordUsed())
        {
            endBitPosition += textureCoord_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getElevation().bitSizeOf(new zserio.runtime.array.ArrayTraits.SignedBitFieldIntArrayTraits((int)(31 - getShiftZ() + 1)),
                new zserio.runtime.array.ArrayElement.IntArrayElement(elevation_));
        endBitPosition += normal_.bitSizeOf(zserioContext.getNormal(), endBitPosition);
        if (isTextureCoordUsed())
        {
            endBitPosition += textureCoord_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public byte getShiftZ()
    {
        return this.shiftZ_;
    }

    public boolean getHasTexture()
    {
        return this.hasTexture_;
    }

    public int getElevation()
    {
        return elevation_;
    }

    public void setElevation(int elevation_)
    {
        this.elevation_ = elevation_;
    }

    public nds.display.types.NormalSphere getNormal()
    {
        return normal_;
    }

    public void setNormal(nds.display.types.NormalSphere normal_)
    {
        this.normal_ = normal_;
    }

    public nds.display.types.TextureCoords getTextureCoord()
    {
        return textureCoord_;
    }

    public void setTextureCoord(nds.display.types.TextureCoords textureCoord_)
    {
        this.textureCoord_ = textureCoord_;
    }

    public boolean isTextureCoordUsed()
    {
        return (getHasTexture() == true);
    }

    public boolean isTextureCoordSet()
    {
        return (textureCoord_ != null);
    }

    public void resetTextureCoord()
    {
        this.textureCoord_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RegularGridVertex)
        {
            final RegularGridVertex that = (RegularGridVertex)obj;

            return
                    this.shiftZ_ == that.shiftZ_ &&
                    this.hasTexture_ == that.hasTexture_ &&
                    elevation_ == that.elevation_ &&
                    ((normal_ == null) ? that.normal_ == null : normal_.equals(that.normal_)) &&
                    ((!isTextureCoordUsed()) ? !that.isTextureCoordUsed() :
                        ((textureCoord_ == null) ? that.textureCoord_ == null : textureCoord_.equals(that.textureCoord_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getShiftZ());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getHasTexture());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, elevation_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, normal_);
        if (isTextureCoordUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, textureCoord_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        elevation_ = (int)in.readSignedBits((int)(31 - getShiftZ() + 1));

        normal_ = new nds.display.types.NormalSphere(in);

        if (getHasTexture() == true)
        {
            textureCoord_ = new nds.display.types.TextureCoords(in);
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        elevation_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getElevation().read(new zserio.runtime.array.ArrayTraits.SignedBitFieldIntArrayTraits((int)(31 - getShiftZ() + 1)), in)).get();

        normal_ = new nds.display.types.NormalSphere(zserioContext.getNormal(), in);

        if (getHasTexture() == true)
        {
            textureCoord_ = new nds.display.types.TextureCoords(in);
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

        endBitPosition += 31 - getShiftZ() + 1;
        endBitPosition = normal_.initializeOffsets(endBitPosition);
        if (isTextureCoordUsed())
        {
            endBitPosition = textureCoord_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getElevation().bitSizeOf(new zserio.runtime.array.ArrayTraits.SignedBitFieldIntArrayTraits((int)(31 - getShiftZ() + 1)),
                new zserio.runtime.array.ArrayElement.IntArrayElement(elevation_));
        endBitPosition = normal_.initializeOffsets(zserioContext.getNormal(), endBitPosition);
        if (isTextureCoordUsed())
        {
            endBitPosition = textureCoord_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeSignedBits(elevation_, (int)(31 - getShiftZ() + 1));

        normal_.write(out);

        if (isTextureCoordUsed())
        {
            textureCoord_.write(out);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getElevation().write(new zserio.runtime.array.ArrayTraits.SignedBitFieldIntArrayTraits((int)(31 - getShiftZ() + 1)), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(elevation_));

        normal_.write(zserioContext.getNormal(), out);

        if (isTextureCoordUsed())
        {
            textureCoord_.write(out);
        }
    }

    private final byte shiftZ_;
    private final boolean hasTexture_;
    private int elevation_;
    private nds.display.types.NormalSphere normal_;
    private nds.display.types.TextureCoords textureCoord_;
}