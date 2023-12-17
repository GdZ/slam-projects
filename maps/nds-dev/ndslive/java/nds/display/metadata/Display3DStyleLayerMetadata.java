/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.metadata;

public class Display3DStyleLayerMetadata implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            textureMetadata_ = new nds.display.metadata.TextureContentDescriptor.ZserioPackingContext();
        }

        public nds.display.metadata.TextureContentDescriptor.ZserioPackingContext getTextureMetadata()
        {
            return textureMetadata_;
        }

        private nds.display.metadata.TextureContentDescriptor.ZserioPackingContext textureMetadata_;
    };

    public Display3DStyleLayerMetadata()
    {
    }

    public Display3DStyleLayerMetadata(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public Display3DStyleLayerMetadata(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public Display3DStyleLayerMetadata(
            nds.display.metadata.Display3DStyleLayerContent content_,
            nds.display.metadata.TextureContentDescriptor textureMetadata_)
    {
        setContent(content_);
        setTextureMetadata(textureMetadata_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        if (isTextureMetadataUsed())
        {
            textureMetadata_.initPackingContext(zserioContext.getTextureMetadata());
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

        endBitPosition += content_.bitSizeOf(endBitPosition);
        if (isTextureMetadataUsed())
        {
            endBitPosition += textureMetadata_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += content_.bitSizeOf(endBitPosition);
        if (isTextureMetadataUsed())
        {
            endBitPosition += textureMetadata_.bitSizeOf(zserioContext.getTextureMetadata(), endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.display.metadata.Display3DStyleLayerContent getContent()
    {
        return content_;
    }

    public void setContent(nds.display.metadata.Display3DStyleLayerContent content_)
    {
        this.content_ = content_;
    }

    public nds.display.metadata.TextureContentDescriptor getTextureMetadata()
    {
        return textureMetadata_;
    }

    public void setTextureMetadata(nds.display.metadata.TextureContentDescriptor textureMetadata_)
    {
        this.textureMetadata_ = textureMetadata_;
    }

    public boolean isTextureMetadataUsed()
    {
        return ((getContent().getHasTextures()));
    }

    public boolean isTextureMetadataSet()
    {
        return (textureMetadata_ != null);
    }

    public void resetTextureMetadata()
    {
        this.textureMetadata_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof Display3DStyleLayerMetadata)
        {
            final Display3DStyleLayerMetadata that = (Display3DStyleLayerMetadata)obj;

            return
                    ((content_ == null) ? that.content_ == null : content_.equals(that.content_)) &&
                    ((!isTextureMetadataUsed()) ? !that.isTextureMetadataUsed() :
                        ((textureMetadata_ == null) ? that.textureMetadata_ == null : textureMetadata_.equals(that.textureMetadata_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, content_);
        if (isTextureMetadataUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, textureMetadata_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        content_ = new nds.display.metadata.Display3DStyleLayerContent(in);

        if ((getContent().getHasTextures()))
        {
            textureMetadata_ = new nds.display.metadata.TextureContentDescriptor(in);
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_ = new nds.display.metadata.Display3DStyleLayerContent(in);

        if ((getContent().getHasTextures()))
        {
            textureMetadata_ = new nds.display.metadata.TextureContentDescriptor(zserioContext.getTextureMetadata(), in);
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

        endBitPosition = content_.initializeOffsets(endBitPosition);
        if (isTextureMetadataUsed())
        {
            endBitPosition = textureMetadata_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = content_.initializeOffsets(endBitPosition);
        if (isTextureMetadataUsed())
        {
            endBitPosition = textureMetadata_.initializeOffsets(zserioContext.getTextureMetadata(), endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        content_.write(out);

        if (isTextureMetadataUsed())
        {
            textureMetadata_.write(out);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.write(out);

        if (isTextureMetadataUsed())
        {
            textureMetadata_.write(zserioContext.getTextureMetadata(), out);
        }
    }

    private nds.display.metadata.Display3DStyleLayerContent content_;
    private nds.display.metadata.TextureContentDescriptor textureMetadata_;
}