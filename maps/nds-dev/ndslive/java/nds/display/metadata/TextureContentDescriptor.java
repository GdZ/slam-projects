/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.metadata;

public class TextureContentDescriptor implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            textureConditionUsageTypes_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getTextureConditionUsageTypes()
        {
            return textureConditionUsageTypes_;
        }

        private zserio.runtime.array.DeltaContext textureConditionUsageTypes_;
    };

    public TextureContentDescriptor()
    {
    }

    public TextureContentDescriptor(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public TextureContentDescriptor(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public TextureContentDescriptor(
            nds.display.types.TextureFormat[] textureFormats_,
            nds.display.types.TextureRenderingUsageType[] textureRenderingUsageTypes_,
            nds.display.types.TextureConditionUsageType textureConditionUsageTypes_)
    {
        setTextureFormats(textureFormats_);
        setTextureRenderingUsageTypes(textureRenderingUsageTypes_);
        setTextureConditionUsageTypes(textureConditionUsageTypes_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        textureConditionUsageTypes_.initPackingContext(zserioContext.getTextureConditionUsageTypes());
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

        endBitPosition += textureFormats_.bitSizeOf(endBitPosition);
        endBitPosition += textureRenderingUsageTypes_.bitSizeOf(endBitPosition);
        endBitPosition += textureConditionUsageTypes_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += textureFormats_.bitSizeOfPacked(endBitPosition);
        endBitPosition += textureRenderingUsageTypes_.bitSizeOfPacked(endBitPosition);
        endBitPosition += textureConditionUsageTypes_.bitSizeOf(zserioContext.getTextureConditionUsageTypes(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.display.types.TextureFormat[] getTextureFormats()
    {
        return (textureFormats_ == null) ? null : textureFormats_.getRawArray();
    }

    public void setTextureFormats(nds.display.types.TextureFormat[] textureFormats_)
    {
        this.textureFormats_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.display.types.TextureFormat.class, textureFormats_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.display.types.TextureFormat>(new ZserioElementFactory_textureFormats()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public nds.display.types.TextureRenderingUsageType[] getTextureRenderingUsageTypes()
    {
        return (textureRenderingUsageTypes_ == null) ? null : textureRenderingUsageTypes_.getRawArray();
    }

    public void setTextureRenderingUsageTypes(nds.display.types.TextureRenderingUsageType[] textureRenderingUsageTypes_)
    {
        this.textureRenderingUsageTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.display.types.TextureRenderingUsageType.class, textureRenderingUsageTypes_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.display.types.TextureRenderingUsageType>(new ZserioElementFactory_textureRenderingUsageTypes()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public nds.display.types.TextureConditionUsageType getTextureConditionUsageTypes()
    {
        return textureConditionUsageTypes_;
    }

    public void setTextureConditionUsageTypes(nds.display.types.TextureConditionUsageType textureConditionUsageTypes_)
    {
        this.textureConditionUsageTypes_ = textureConditionUsageTypes_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof TextureContentDescriptor)
        {
            final TextureContentDescriptor that = (TextureContentDescriptor)obj;

            return
                    ((textureFormats_ == null) ? that.textureFormats_ == null : textureFormats_.equals(that.textureFormats_)) &&
                    ((textureRenderingUsageTypes_ == null) ? that.textureRenderingUsageTypes_ == null : textureRenderingUsageTypes_.equals(that.textureRenderingUsageTypes_)) &&
                    ((textureConditionUsageTypes_ == null) ? that.textureConditionUsageTypes_ == null : textureConditionUsageTypes_.equals(that.textureConditionUsageTypes_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, textureFormats_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, textureRenderingUsageTypes_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, textureConditionUsageTypes_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        textureFormats_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.display.types.TextureFormat.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.display.types.TextureFormat>(new ZserioElementFactory_textureFormats()),
                zserio.runtime.array.ArrayType.AUTO);
        textureFormats_.read(in);

        textureRenderingUsageTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.display.types.TextureRenderingUsageType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.display.types.TextureRenderingUsageType>(new ZserioElementFactory_textureRenderingUsageTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        textureRenderingUsageTypes_.read(in);

        textureConditionUsageTypes_ = new nds.display.types.TextureConditionUsageType(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        textureFormats_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.display.types.TextureFormat.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.display.types.TextureFormat>(new ZserioElementFactory_textureFormats()),
                zserio.runtime.array.ArrayType.AUTO);
        textureFormats_.readPacked(in);

        textureRenderingUsageTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.display.types.TextureRenderingUsageType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.display.types.TextureRenderingUsageType>(new ZserioElementFactory_textureRenderingUsageTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        textureRenderingUsageTypes_.readPacked(in);

        textureConditionUsageTypes_ = new nds.display.types.TextureConditionUsageType(zserioContext.getTextureConditionUsageTypes(), in);
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

        endBitPosition = textureFormats_.initializeOffsets(endBitPosition);
        endBitPosition = textureRenderingUsageTypes_.initializeOffsets(endBitPosition);
        endBitPosition += textureConditionUsageTypes_.bitSizeOf(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = textureFormats_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = textureRenderingUsageTypes_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = textureConditionUsageTypes_.initializeOffsets(zserioContext.getTextureConditionUsageTypes(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        textureFormats_.write(out);

        textureRenderingUsageTypes_.write(out);

        textureConditionUsageTypes_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        textureFormats_.writePacked(out);

        textureRenderingUsageTypes_.writePacked(out);

        textureConditionUsageTypes_.write(zserioContext.getTextureConditionUsageTypes(), out);
    }

    private static final class ZserioElementFactory_textureFormats implements zserio.runtime.array.PackableElementFactory<nds.display.types.TextureFormat>
    {
        @Override
        public nds.display.types.TextureFormat create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return nds.display.types.TextureFormat.readEnum(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new zserio.runtime.array.DeltaContext();
        }

        @Override
        public nds.display.types.TextureFormat create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return nds.display.types.TextureFormat.readEnum(context, in);
        }
    }

    private static final class ZserioElementFactory_textureRenderingUsageTypes implements zserio.runtime.array.PackableElementFactory<nds.display.types.TextureRenderingUsageType>
    {
        @Override
        public nds.display.types.TextureRenderingUsageType create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return nds.display.types.TextureRenderingUsageType.readEnum(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new zserio.runtime.array.DeltaContext();
        }

        @Override
        public nds.display.types.TextureRenderingUsageType create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return nds.display.types.TextureRenderingUsageType.readEnum(context, in);
        }
    }

    private zserio.runtime.array.Array textureFormats_;
    private zserio.runtime.array.Array textureRenderingUsageTypes_;
    private nds.display.types.TextureConditionUsageType textureConditionUsageTypes_;
}
