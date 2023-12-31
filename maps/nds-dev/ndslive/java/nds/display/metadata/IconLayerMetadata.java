/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.metadata;

public class IconLayerMetadata implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            content_ = new zserio.runtime.array.DeltaContext();
            displayScaleTileLevelMapping_ = new nds.display.metadata.DisplayScaleTileLevelMapping.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getContent()
        {
            return content_;
        }

        public nds.display.metadata.DisplayScaleTileLevelMapping.ZserioPackingContext getDisplayScaleTileLevelMapping()
        {
            return displayScaleTileLevelMapping_;
        }

        private zserio.runtime.array.DeltaContext content_;
        private nds.display.metadata.DisplayScaleTileLevelMapping.ZserioPackingContext displayScaleTileLevelMapping_;
    };

    public IconLayerMetadata()
    {
    }

    public IconLayerMetadata(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public IconLayerMetadata(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public IconLayerMetadata(
            nds.display.metadata.IconLayerContent content_,
            nds.core.icons.IconFormat[] containedIconFormats_,
            nds.core.types.Iso3166Codes isoCountryCode_,
            nds.display.metadata.DisplayScaleTileLevelMapping displayScaleTileLevelMapping_)
    {
        setContent(content_);
        setContainedIconFormats(containedIconFormats_);
        setIsoCountryCode(isoCountryCode_);
        setDisplayScaleTileLevelMapping(displayScaleTileLevelMapping_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.initPackingContext(zserioContext.getContent());
        displayScaleTileLevelMapping_.initPackingContext(zserioContext.getDisplayScaleTileLevelMapping());
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
        endBitPosition += containedIconFormats_.bitSizeOf(endBitPosition);
        endBitPosition += 1;
        if (isIsoCountryCodeUsed())
        {
            endBitPosition += isoCountryCode_.bitSizeOf(endBitPosition);
        }
        endBitPosition += displayScaleTileLevelMapping_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += content_.bitSizeOf(zserioContext.getContent(), endBitPosition);
        endBitPosition += containedIconFormats_.bitSizeOfPacked(endBitPosition);
        endBitPosition += 1;
        if (isIsoCountryCodeUsed())
        {
            endBitPosition += isoCountryCode_.bitSizeOf(endBitPosition);
        }
        endBitPosition += displayScaleTileLevelMapping_.bitSizeOf(zserioContext.getDisplayScaleTileLevelMapping(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.display.metadata.IconLayerContent getContent()
    {
        return content_;
    }

    public void setContent(nds.display.metadata.IconLayerContent content_)
    {
        this.content_ = content_;
    }

    public nds.core.icons.IconFormat[] getContainedIconFormats()
    {
        return (containedIconFormats_ == null) ? null : containedIconFormats_.getRawArray();
    }

    public void setContainedIconFormats(nds.core.icons.IconFormat[] containedIconFormats_)
    {
        this.containedIconFormats_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.core.icons.IconFormat.class, containedIconFormats_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.icons.IconFormat>(new ZserioElementFactory_containedIconFormats()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public nds.core.types.Iso3166Codes getIsoCountryCode()
    {
        return isoCountryCode_;
    }

    public void setIsoCountryCode(nds.core.types.Iso3166Codes isoCountryCode_)
    {
        this.isoCountryCode_ = isoCountryCode_;
    }

    public boolean isIsoCountryCodeUsed()
    {
        return isIsoCountryCodeSet();
    }

    public boolean isIsoCountryCodeSet()
    {
        return (isoCountryCode_ != null);
    }

    public void resetIsoCountryCode()
    {
        this.isoCountryCode_ = null;
    }

    public nds.display.metadata.DisplayScaleTileLevelMapping getDisplayScaleTileLevelMapping()
    {
        return displayScaleTileLevelMapping_;
    }

    public void setDisplayScaleTileLevelMapping(nds.display.metadata.DisplayScaleTileLevelMapping displayScaleTileLevelMapping_)
    {
        this.displayScaleTileLevelMapping_ = displayScaleTileLevelMapping_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof IconLayerMetadata)
        {
            final IconLayerMetadata that = (IconLayerMetadata)obj;

            return
                    ((content_ == null) ? that.content_ == null : content_.equals(that.content_)) &&
                    ((containedIconFormats_ == null) ? that.containedIconFormats_ == null : containedIconFormats_.equals(that.containedIconFormats_)) &&
                    ((!isIsoCountryCodeUsed()) ? !that.isIsoCountryCodeUsed() :
                        ((isoCountryCode_ == null) ? that.isoCountryCode_ == null : isoCountryCode_.equals(that.isoCountryCode_))) &&
                    ((displayScaleTileLevelMapping_ == null) ? that.displayScaleTileLevelMapping_ == null : displayScaleTileLevelMapping_.equals(that.displayScaleTileLevelMapping_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, content_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, containedIconFormats_);
        if (isIsoCountryCodeUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, isoCountryCode_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, displayScaleTileLevelMapping_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        content_ = new nds.display.metadata.IconLayerContent(in);

        containedIconFormats_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.core.icons.IconFormat.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.icons.IconFormat>(new ZserioElementFactory_containedIconFormats()),
                zserio.runtime.array.ArrayType.AUTO);
        containedIconFormats_.read(in);

        if (in.readBool())
        {
            isoCountryCode_ = new nds.core.types.Iso3166Codes(in);
        }

        displayScaleTileLevelMapping_ = new nds.display.metadata.DisplayScaleTileLevelMapping(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_ = new nds.display.metadata.IconLayerContent(zserioContext.getContent(), in);

        containedIconFormats_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.core.icons.IconFormat.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.icons.IconFormat>(new ZserioElementFactory_containedIconFormats()),
                zserio.runtime.array.ArrayType.AUTO);
        containedIconFormats_.readPacked(in);

        if (in.readBool())
        {
            isoCountryCode_ = new nds.core.types.Iso3166Codes(in);
        }

        displayScaleTileLevelMapping_ = new nds.display.metadata.DisplayScaleTileLevelMapping(zserioContext.getDisplayScaleTileLevelMapping(), in);
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

        endBitPosition += content_.bitSizeOf(endBitPosition);
        endBitPosition = containedIconFormats_.initializeOffsets(endBitPosition);
        endBitPosition += 1;
        if (isIsoCountryCodeUsed())
        {
            endBitPosition = isoCountryCode_.initializeOffsets(endBitPosition);
        }
        endBitPosition = displayScaleTileLevelMapping_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = content_.initializeOffsets(zserioContext.getContent(), endBitPosition);
        endBitPosition = containedIconFormats_.initializeOffsetsPacked(endBitPosition);
        endBitPosition += 1;
        if (isIsoCountryCodeUsed())
        {
            endBitPosition = isoCountryCode_.initializeOffsets(endBitPosition);
        }
        endBitPosition = displayScaleTileLevelMapping_.initializeOffsets(zserioContext.getDisplayScaleTileLevelMapping(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        content_.write(out);

        containedIconFormats_.write(out);

        if (isIsoCountryCodeUsed())
        {
            out.writeBool(true);
            isoCountryCode_.write(out);
        }
        else
        {
            out.writeBool(false);
        }

        displayScaleTileLevelMapping_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.write(zserioContext.getContent(), out);

        containedIconFormats_.writePacked(out);

        if (isIsoCountryCodeUsed())
        {
            out.writeBool(true);
            isoCountryCode_.write(out);
        }
        else
        {
            out.writeBool(false);
        }

        displayScaleTileLevelMapping_.write(zserioContext.getDisplayScaleTileLevelMapping(), out);
    }

    private static final class ZserioElementFactory_containedIconFormats implements zserio.runtime.array.PackableElementFactory<nds.core.icons.IconFormat>
    {
        @Override
        public nds.core.icons.IconFormat create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return nds.core.icons.IconFormat.readEnum(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new zserio.runtime.array.DeltaContext();
        }

        @Override
        public nds.core.icons.IconFormat create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return nds.core.icons.IconFormat.readEnum(context, in);
        }
    }

    private nds.display.metadata.IconLayerContent content_;
    private zserio.runtime.array.Array containedIconFormats_;
    private nds.core.types.Iso3166Codes isoCountryCode_;
    private nds.display.metadata.DisplayScaleTileLevelMapping displayScaleTileLevelMapping_;
}
