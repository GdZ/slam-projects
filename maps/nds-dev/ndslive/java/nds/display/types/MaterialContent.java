/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.types;

public class MaterialContent implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            textureCoordUsageType_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getTextureCoordUsageType()
        {
            return textureCoordUsageType_;
        }

        private zserio.runtime.array.DeltaContext textureCoordUsageType_;
    };

    public MaterialContent()
    {
    }

    public MaterialContent(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public MaterialContent(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public MaterialContent(
            boolean hasAmbientAndDiffuseColor_,
            boolean hasSpecularAndShininessColor_,
            boolean isTransparent_,
            boolean isLightEmitting_,
            boolean usesTextures_,
            nds.display.types.TextureCoordsUsageType textureCoordUsageType_)
    {
        setHasAmbientAndDiffuseColor(hasAmbientAndDiffuseColor_);
        setHasSpecularAndShininessColor(hasSpecularAndShininessColor_);
        setIsTransparent(isTransparent_);
        setIsLightEmitting(isLightEmitting_);
        setUsesTextures(usesTextures_);
        setTextureCoordUsageType(textureCoordUsageType_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        if (isTextureCoordUsageTypeUsed())
        {
            textureCoordUsageType_.initPackingContext(zserioContext.getTextureCoordUsageType());
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

        endBitPosition += 1;
        endBitPosition += 1;
        endBitPosition += 1;
        endBitPosition += 1;
        endBitPosition += 1;
        if (isTextureCoordUsageTypeUsed())
        {
            endBitPosition += textureCoordUsageType_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += 1;
        endBitPosition += 1;
        endBitPosition += 1;
        endBitPosition += 1;
        endBitPosition += 1;
        if (isTextureCoordUsageTypeUsed())
        {
            endBitPosition += textureCoordUsageType_.bitSizeOf(zserioContext.getTextureCoordUsageType(), endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public boolean getHasAmbientAndDiffuseColor()
    {
        return hasAmbientAndDiffuseColor_;
    }

    public void setHasAmbientAndDiffuseColor(boolean hasAmbientAndDiffuseColor_)
    {
        this.hasAmbientAndDiffuseColor_ = hasAmbientAndDiffuseColor_;
    }

    public boolean getHasSpecularAndShininessColor()
    {
        return hasSpecularAndShininessColor_;
    }

    public void setHasSpecularAndShininessColor(boolean hasSpecularAndShininessColor_)
    {
        this.hasSpecularAndShininessColor_ = hasSpecularAndShininessColor_;
    }

    public boolean getIsTransparent()
    {
        return isTransparent_;
    }

    public void setIsTransparent(boolean isTransparent_)
    {
        this.isTransparent_ = isTransparent_;
    }

    public boolean getIsLightEmitting()
    {
        return isLightEmitting_;
    }

    public void setIsLightEmitting(boolean isLightEmitting_)
    {
        this.isLightEmitting_ = isLightEmitting_;
    }

    public boolean getUsesTextures()
    {
        return usesTextures_;
    }

    public void setUsesTextures(boolean usesTextures_)
    {
        this.usesTextures_ = usesTextures_;
    }

    public nds.display.types.TextureCoordsUsageType getTextureCoordUsageType()
    {
        return textureCoordUsageType_;
    }

    public void setTextureCoordUsageType(nds.display.types.TextureCoordsUsageType textureCoordUsageType_)
    {
        this.textureCoordUsageType_ = textureCoordUsageType_;
    }

    public boolean isTextureCoordUsageTypeUsed()
    {
        return (getUsesTextures());
    }

    public boolean isTextureCoordUsageTypeSet()
    {
        return (textureCoordUsageType_ != null);
    }

    public void resetTextureCoordUsageType()
    {
        this.textureCoordUsageType_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof MaterialContent)
        {
            final MaterialContent that = (MaterialContent)obj;

            return
                    hasAmbientAndDiffuseColor_ == that.hasAmbientAndDiffuseColor_ &&
                    hasSpecularAndShininessColor_ == that.hasSpecularAndShininessColor_ &&
                    isTransparent_ == that.isTransparent_ &&
                    isLightEmitting_ == that.isLightEmitting_ &&
                    usesTextures_ == that.usesTextures_ &&
                    ((!isTextureCoordUsageTypeUsed()) ? !that.isTextureCoordUsageTypeUsed() :
                        ((textureCoordUsageType_ == null) ? that.textureCoordUsageType_ == null : textureCoordUsageType_.getValue() == that.textureCoordUsageType_.getValue()));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, hasAmbientAndDiffuseColor_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, hasSpecularAndShininessColor_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, isTransparent_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, isLightEmitting_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, usesTextures_);
        if (isTextureCoordUsageTypeUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, textureCoordUsageType_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        hasAmbientAndDiffuseColor_ = in.readBool();

        hasSpecularAndShininessColor_ = in.readBool();

        isTransparent_ = in.readBool();

        isLightEmitting_ = in.readBool();

        usesTextures_ = in.readBool();

        if (getUsesTextures())
        {
            textureCoordUsageType_ = nds.display.types.TextureCoordsUsageType.readEnum(in);
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        hasAmbientAndDiffuseColor_ = in.readBool();

        hasSpecularAndShininessColor_ = in.readBool();

        isTransparent_ = in.readBool();

        isLightEmitting_ = in.readBool();

        usesTextures_ = in.readBool();

        if (getUsesTextures())
        {
            textureCoordUsageType_ = nds.display.types.TextureCoordsUsageType.readEnum(zserioContext.getTextureCoordUsageType(), in);
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
        endBitPosition += 1;
        endBitPosition += 1;
        endBitPosition += 1;
        endBitPosition += 1;
        if (isTextureCoordUsageTypeUsed())
        {
            endBitPosition += textureCoordUsageType_.bitSizeOf(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += 1;
        endBitPosition += 1;
        endBitPosition += 1;
        endBitPosition += 1;
        endBitPosition += 1;
        if (isTextureCoordUsageTypeUsed())
        {
            endBitPosition = textureCoordUsageType_.initializeOffsets(zserioContext.getTextureCoordUsageType(), endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeBool(hasAmbientAndDiffuseColor_);

        out.writeBool(hasSpecularAndShininessColor_);

        out.writeBool(isTransparent_);

        out.writeBool(isLightEmitting_);

        out.writeBool(usesTextures_);

        if (isTextureCoordUsageTypeUsed())
        {
            textureCoordUsageType_.write(out);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        out.writeBool(hasAmbientAndDiffuseColor_);

        out.writeBool(hasSpecularAndShininessColor_);

        out.writeBool(isTransparent_);

        out.writeBool(isLightEmitting_);

        out.writeBool(usesTextures_);

        if (isTextureCoordUsageTypeUsed())
        {
            textureCoordUsageType_.write(zserioContext.getTextureCoordUsageType(), out);
        }
    }

    private boolean hasAmbientAndDiffuseColor_;
    private boolean hasSpecularAndShininessColor_;
    private boolean isTransparent_;
    private boolean isLightEmitting_;
    private boolean usesTextures_;
    private nds.display.types.TextureCoordsUsageType textureCoordUsageType_;
}
