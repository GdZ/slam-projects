/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.types;

public class OrthoImageConfig implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            format_ = new zserio.runtime.array.DeltaContext();
            sourceType_ = new zserio.runtime.array.DeltaContext();
            usageType_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getFormat()
        {
            return format_;
        }

        public zserio.runtime.array.DeltaContext getSourceType()
        {
            return sourceType_;
        }

        public zserio.runtime.array.DeltaContext getUsageType()
        {
            return usageType_;
        }

        private zserio.runtime.array.DeltaContext format_;
        private zserio.runtime.array.DeltaContext sourceType_;
        private zserio.runtime.array.DeltaContext usageType_;
    };

    public OrthoImageConfig()
    {
    }

    public OrthoImageConfig(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public OrthoImageConfig(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public OrthoImageConfig(
            nds.display.types.TextureFormat format_,
            nds.display.types.OrthoImageContentType sourceType_,
            nds.display.types.TextureConditionUsageType usageType_)
    {
        setFormat(format_);
        setSourceType(sourceType_);
        setUsageType(usageType_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        format_.initPackingContext(zserioContext.getFormat());
        sourceType_.initPackingContext(zserioContext.getSourceType());
        usageType_.initPackingContext(zserioContext.getUsageType());
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

        endBitPosition += format_.bitSizeOf(endBitPosition);
        endBitPosition += sourceType_.bitSizeOf(endBitPosition);
        endBitPosition += usageType_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += format_.bitSizeOf(zserioContext.getFormat(), endBitPosition);
        endBitPosition += sourceType_.bitSizeOf(zserioContext.getSourceType(), endBitPosition);
        endBitPosition += usageType_.bitSizeOf(zserioContext.getUsageType(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.display.types.TextureFormat getFormat()
    {
        return format_;
    }

    public void setFormat(nds.display.types.TextureFormat format_)
    {
        this.format_ = format_;
    }

    public nds.display.types.OrthoImageContentType getSourceType()
    {
        return sourceType_;
    }

    public void setSourceType(nds.display.types.OrthoImageContentType sourceType_)
    {
        this.sourceType_ = sourceType_;
    }

    public nds.display.types.TextureConditionUsageType getUsageType()
    {
        return usageType_;
    }

    public void setUsageType(nds.display.types.TextureConditionUsageType usageType_)
    {
        this.usageType_ = usageType_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof OrthoImageConfig)
        {
            final OrthoImageConfig that = (OrthoImageConfig)obj;

            return
                    ((format_ == null) ? that.format_ == null : format_.getValue() == that.format_.getValue()) &&
                    ((sourceType_ == null) ? that.sourceType_ == null : sourceType_.getValue() == that.sourceType_.getValue()) &&
                    ((usageType_ == null) ? that.usageType_ == null : usageType_.equals(that.usageType_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, format_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, sourceType_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, usageType_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        format_ = nds.display.types.TextureFormat.readEnum(in);

        sourceType_ = nds.display.types.OrthoImageContentType.readEnum(in);

        usageType_ = new nds.display.types.TextureConditionUsageType(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        format_ = nds.display.types.TextureFormat.readEnum(zserioContext.getFormat(), in);

        sourceType_ = nds.display.types.OrthoImageContentType.readEnum(zserioContext.getSourceType(), in);

        usageType_ = new nds.display.types.TextureConditionUsageType(zserioContext.getUsageType(), in);
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

        endBitPosition += format_.bitSizeOf(endBitPosition);
        endBitPosition += sourceType_.bitSizeOf(endBitPosition);
        endBitPosition += usageType_.bitSizeOf(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = format_.initializeOffsets(zserioContext.getFormat(), endBitPosition);
        endBitPosition = sourceType_.initializeOffsets(zserioContext.getSourceType(), endBitPosition);
        endBitPosition = usageType_.initializeOffsets(zserioContext.getUsageType(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        format_.write(out);

        sourceType_.write(out);

        usageType_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        format_.write(zserioContext.getFormat(), out);

        sourceType_.write(zserioContext.getSourceType(), out);

        usageType_.write(zserioContext.getUsageType(), out);
    }

    private nds.display.types.TextureFormat format_;
    private nds.display.types.OrthoImageContentType sourceType_;
    private nds.display.types.TextureConditionUsageType usageType_;
}
