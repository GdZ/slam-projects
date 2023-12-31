/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.reference.types;

public class TextureReference implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            textureId_ = new zserio.runtime.array.DeltaContext();
            textureSectionIndex_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getTextureId()
        {
            return textureId_;
        }

        public zserio.runtime.array.DeltaContext getTextureSectionIndex()
        {
            return textureSectionIndex_;
        }

        private zserio.runtime.array.DeltaContext textureId_;
        private zserio.runtime.array.DeltaContext textureSectionIndex_;
    };

    public TextureReference()
    {
    }

    public TextureReference(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public TextureReference(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public TextureReference(
            int textureId_,
            boolean isSection_,
            java.lang.Short textureSectionIndex_)
    {
        setTextureId(textureId_);
        setIsSection(isSection_);
        setTextureSectionIndex(textureSectionIndex_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getTextureId().init(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(textureId_));
        if (isTextureSectionIndexUsed())
        {
            zserioContext.getTextureSectionIndex().init(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(textureSectionIndex_));
        }
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(textureId_);
        endBitPosition += 1;
        if (isTextureSectionIndexUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(textureSectionIndex_);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getTextureId().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(textureId_));
        endBitPosition += 1;
        if (isTextureSectionIndexUsed())
        {
            endBitPosition += zserioContext.getTextureSectionIndex().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(textureSectionIndex_));
        }

        return (int)(endBitPosition - bitPosition);
    }

    public int getTextureId()
    {
        return textureId_;
    }

    public void setTextureId(int textureId_)
    {
        this.textureId_ = textureId_;
    }

    public boolean getIsSection()
    {
        return isSection_;
    }

    public void setIsSection(boolean isSection_)
    {
        this.isSection_ = isSection_;
    }

    public java.lang.Short getTextureSectionIndex()
    {
        return textureSectionIndex_;
    }

    public void setTextureSectionIndex(java.lang.Short textureSectionIndex_)
    {
        this.textureSectionIndex_ = textureSectionIndex_;
    }

    public boolean isTextureSectionIndexUsed()
    {
        return (getIsSection() == true);
    }

    public boolean isTextureSectionIndexSet()
    {
        return (textureSectionIndex_ != null);
    }

    public void resetTextureSectionIndex()
    {
        this.textureSectionIndex_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof TextureReference)
        {
            final TextureReference that = (TextureReference)obj;

            return
                    textureId_ == that.textureId_ &&
                    isSection_ == that.isSection_ &&
                    ((!isTextureSectionIndexUsed()) ? !that.isTextureSectionIndexUsed() :
                        ((textureSectionIndex_ == null) ? that.textureSectionIndex_ == null : textureSectionIndex_.equals(that.textureSectionIndex_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, textureId_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, isSection_);
        if (isTextureSectionIndexUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, textureSectionIndex_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        textureId_ = in.readVarUInt32();

        isSection_ = in.readBool();

        if (getIsSection() == true)
        {
            textureSectionIndex_ = in.readVarUInt16();
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        textureId_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getTextureId().read(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), in)).get();

        isSection_ = in.readBool();

        if (getIsSection() == true)
        {
            textureSectionIndex_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                    zserioContext.getTextureSectionIndex().read(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), in)).get();
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(textureId_);
        endBitPosition += 1;
        if (isTextureSectionIndexUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(textureSectionIndex_);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getTextureId().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(textureId_));
        endBitPosition += 1;
        if (isTextureSectionIndexUsed())
        {
            endBitPosition += zserioContext.getTextureSectionIndex().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(textureSectionIndex_));
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarUInt32(textureId_);

        out.writeBool(isSection_);

        if (isTextureSectionIndexUsed())
        {
            out.writeVarUInt16(textureSectionIndex_);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getTextureId().write(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(textureId_));

        out.writeBool(isSection_);

        if (isTextureSectionIndexUsed())
        {
            zserioContext.getTextureSectionIndex().write(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(textureSectionIndex_));
        }
    }

    private int textureId_;
    private boolean isSection_;
    private java.lang.Short textureSectionIndex_;
}
