/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.details.metadata;

public class DisplayAttributeLayerMetadata implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            content_ = new zserio.runtime.array.DeltaContext();
            displayAreaAttributeMetadata_ = new nds.display.details.instantiations.DisplayAreaAttributeMetadata.ZserioPackingContext();
            displayLineAttributeMetadata_ = new nds.display.details.instantiations.DisplayLineAttributeMetadata.ZserioPackingContext();
            displayPointAttributeMetadata_ = new nds.display.details.instantiations.DisplayPointAttributeMetadata.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getContent()
        {
            return content_;
        }

        public nds.display.details.instantiations.DisplayAreaAttributeMetadata.ZserioPackingContext getDisplayAreaAttributeMetadata()
        {
            return displayAreaAttributeMetadata_;
        }

        public nds.display.details.instantiations.DisplayLineAttributeMetadata.ZserioPackingContext getDisplayLineAttributeMetadata()
        {
            return displayLineAttributeMetadata_;
        }

        public nds.display.details.instantiations.DisplayPointAttributeMetadata.ZserioPackingContext getDisplayPointAttributeMetadata()
        {
            return displayPointAttributeMetadata_;
        }

        private zserio.runtime.array.DeltaContext content_;
        private nds.display.details.instantiations.DisplayAreaAttributeMetadata.ZserioPackingContext displayAreaAttributeMetadata_;
        private nds.display.details.instantiations.DisplayLineAttributeMetadata.ZserioPackingContext displayLineAttributeMetadata_;
        private nds.display.details.instantiations.DisplayPointAttributeMetadata.ZserioPackingContext displayPointAttributeMetadata_;
    };

    public DisplayAttributeLayerMetadata()
    {
    }

    public DisplayAttributeLayerMetadata(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public DisplayAttributeLayerMetadata(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public DisplayAttributeLayerMetadata(
            nds.display.details.metadata.DisplayAttributeLayerContent content_,
            nds.display.details.instantiations.DisplayAreaAttributeMetadata displayAreaAttributeMetadata_,
            nds.display.details.instantiations.DisplayLineAttributeMetadata displayLineAttributeMetadata_,
            nds.display.details.instantiations.DisplayPointAttributeMetadata displayPointAttributeMetadata_)
    {
        setContent(content_);
        setDisplayAreaAttributeMetadata(displayAreaAttributeMetadata_);
        setDisplayLineAttributeMetadata(displayLineAttributeMetadata_);
        setDisplayPointAttributeMetadata(displayPointAttributeMetadata_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.initPackingContext(zserioContext.getContent());
        if (isDisplayAreaAttributeMetadataUsed())
        {
            displayAreaAttributeMetadata_.initPackingContext(zserioContext.getDisplayAreaAttributeMetadata());
        }
        if (isDisplayLineAttributeMetadataUsed())
        {
            displayLineAttributeMetadata_.initPackingContext(zserioContext.getDisplayLineAttributeMetadata());
        }
        if (isDisplayPointAttributeMetadataUsed())
        {
            displayPointAttributeMetadata_.initPackingContext(zserioContext.getDisplayPointAttributeMetadata());
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
        if (isDisplayAreaAttributeMetadataUsed())
        {
            endBitPosition += displayAreaAttributeMetadata_.bitSizeOf(endBitPosition);
        }
        if (isDisplayLineAttributeMetadataUsed())
        {
            endBitPosition += displayLineAttributeMetadata_.bitSizeOf(endBitPosition);
        }
        if (isDisplayPointAttributeMetadataUsed())
        {
            endBitPosition += displayPointAttributeMetadata_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += content_.bitSizeOf(zserioContext.getContent(), endBitPosition);
        if (isDisplayAreaAttributeMetadataUsed())
        {
            endBitPosition += displayAreaAttributeMetadata_.bitSizeOf(zserioContext.getDisplayAreaAttributeMetadata(), endBitPosition);
        }
        if (isDisplayLineAttributeMetadataUsed())
        {
            endBitPosition += displayLineAttributeMetadata_.bitSizeOf(zserioContext.getDisplayLineAttributeMetadata(), endBitPosition);
        }
        if (isDisplayPointAttributeMetadataUsed())
        {
            endBitPosition += displayPointAttributeMetadata_.bitSizeOf(zserioContext.getDisplayPointAttributeMetadata(), endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.display.details.metadata.DisplayAttributeLayerContent getContent()
    {
        return content_;
    }

    public void setContent(nds.display.details.metadata.DisplayAttributeLayerContent content_)
    {
        this.content_ = content_;
    }

    public nds.display.details.instantiations.DisplayAreaAttributeMetadata getDisplayAreaAttributeMetadata()
    {
        return displayAreaAttributeMetadata_;
    }

    public void setDisplayAreaAttributeMetadata(nds.display.details.instantiations.DisplayAreaAttributeMetadata displayAreaAttributeMetadata_)
    {
        this.displayAreaAttributeMetadata_ = displayAreaAttributeMetadata_;
    }

    public boolean isDisplayAreaAttributeMetadataUsed()
    {
        return ((getContent().and(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_AREA_MAPS)).equals(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_AREA_MAPS) || (getContent().and(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_AREA_SETS)).equals(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_AREA_SETS));
    }

    public boolean isDisplayAreaAttributeMetadataSet()
    {
        return (displayAreaAttributeMetadata_ != null);
    }

    public void resetDisplayAreaAttributeMetadata()
    {
        this.displayAreaAttributeMetadata_ = null;
    }

    public nds.display.details.instantiations.DisplayLineAttributeMetadata getDisplayLineAttributeMetadata()
    {
        return displayLineAttributeMetadata_;
    }

    public void setDisplayLineAttributeMetadata(nds.display.details.instantiations.DisplayLineAttributeMetadata displayLineAttributeMetadata_)
    {
        this.displayLineAttributeMetadata_ = displayLineAttributeMetadata_;
    }

    public boolean isDisplayLineAttributeMetadataUsed()
    {
        return ((getContent().and(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_LINE_MAPS)).equals(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_LINE_MAPS) || (getContent().and(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_LINE_SETS)).equals(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_LINE_SETS));
    }

    public boolean isDisplayLineAttributeMetadataSet()
    {
        return (displayLineAttributeMetadata_ != null);
    }

    public void resetDisplayLineAttributeMetadata()
    {
        this.displayLineAttributeMetadata_ = null;
    }

    public nds.display.details.instantiations.DisplayPointAttributeMetadata getDisplayPointAttributeMetadata()
    {
        return displayPointAttributeMetadata_;
    }

    public void setDisplayPointAttributeMetadata(nds.display.details.instantiations.DisplayPointAttributeMetadata displayPointAttributeMetadata_)
    {
        this.displayPointAttributeMetadata_ = displayPointAttributeMetadata_;
    }

    public boolean isDisplayPointAttributeMetadataUsed()
    {
        return ((getContent().and(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_POINT_MAPS)).equals(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_POINT_MAPS) || (getContent().and(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_POINT_SETS)).equals(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_POINT_SETS));
    }

    public boolean isDisplayPointAttributeMetadataSet()
    {
        return (displayPointAttributeMetadata_ != null);
    }

    public void resetDisplayPointAttributeMetadata()
    {
        this.displayPointAttributeMetadata_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof DisplayAttributeLayerMetadata)
        {
            final DisplayAttributeLayerMetadata that = (DisplayAttributeLayerMetadata)obj;

            return
                    ((content_ == null) ? that.content_ == null : content_.equals(that.content_)) &&
                    ((!isDisplayAreaAttributeMetadataUsed()) ? !that.isDisplayAreaAttributeMetadataUsed() :
                        ((displayAreaAttributeMetadata_ == null) ? that.displayAreaAttributeMetadata_ == null : displayAreaAttributeMetadata_.equals(that.displayAreaAttributeMetadata_))) &&
                    ((!isDisplayLineAttributeMetadataUsed()) ? !that.isDisplayLineAttributeMetadataUsed() :
                        ((displayLineAttributeMetadata_ == null) ? that.displayLineAttributeMetadata_ == null : displayLineAttributeMetadata_.equals(that.displayLineAttributeMetadata_))) &&
                    ((!isDisplayPointAttributeMetadataUsed()) ? !that.isDisplayPointAttributeMetadataUsed() :
                        ((displayPointAttributeMetadata_ == null) ? that.displayPointAttributeMetadata_ == null : displayPointAttributeMetadata_.equals(that.displayPointAttributeMetadata_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, content_);
        if (isDisplayAreaAttributeMetadataUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, displayAreaAttributeMetadata_);
        if (isDisplayLineAttributeMetadataUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, displayLineAttributeMetadata_);
        if (isDisplayPointAttributeMetadataUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, displayPointAttributeMetadata_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        content_ = new nds.display.details.metadata.DisplayAttributeLayerContent(in);

        if ((getContent().and(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_AREA_MAPS)).equals(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_AREA_MAPS) || (getContent().and(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_AREA_SETS)).equals(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_AREA_SETS))
        {
            displayAreaAttributeMetadata_ = new nds.display.details.instantiations.DisplayAreaAttributeMetadata(in);
        }

        if ((getContent().and(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_LINE_MAPS)).equals(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_LINE_MAPS) || (getContent().and(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_LINE_SETS)).equals(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_LINE_SETS))
        {
            displayLineAttributeMetadata_ = new nds.display.details.instantiations.DisplayLineAttributeMetadata(in);
        }

        if ((getContent().and(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_POINT_MAPS)).equals(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_POINT_MAPS) || (getContent().and(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_POINT_SETS)).equals(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_POINT_SETS))
        {
            displayPointAttributeMetadata_ = new nds.display.details.instantiations.DisplayPointAttributeMetadata(in);
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_ = new nds.display.details.metadata.DisplayAttributeLayerContent(zserioContext.getContent(), in);

        if ((getContent().and(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_AREA_MAPS)).equals(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_AREA_MAPS) || (getContent().and(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_AREA_SETS)).equals(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_AREA_SETS))
        {
            displayAreaAttributeMetadata_ = new nds.display.details.instantiations.DisplayAreaAttributeMetadata(zserioContext.getDisplayAreaAttributeMetadata(), in);
        }

        if ((getContent().and(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_LINE_MAPS)).equals(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_LINE_MAPS) || (getContent().and(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_LINE_SETS)).equals(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_LINE_SETS))
        {
            displayLineAttributeMetadata_ = new nds.display.details.instantiations.DisplayLineAttributeMetadata(zserioContext.getDisplayLineAttributeMetadata(), in);
        }

        if ((getContent().and(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_POINT_MAPS)).equals(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_POINT_MAPS) || (getContent().and(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_POINT_SETS)).equals(nds.display.details.metadata.DisplayAttributeLayerContent.Values.DISPLAY_POINT_SETS))
        {
            displayPointAttributeMetadata_ = new nds.display.details.instantiations.DisplayPointAttributeMetadata(zserioContext.getDisplayPointAttributeMetadata(), in);
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

        endBitPosition += content_.bitSizeOf(endBitPosition);
        if (isDisplayAreaAttributeMetadataUsed())
        {
            endBitPosition = displayAreaAttributeMetadata_.initializeOffsets(endBitPosition);
        }
        if (isDisplayLineAttributeMetadataUsed())
        {
            endBitPosition = displayLineAttributeMetadata_.initializeOffsets(endBitPosition);
        }
        if (isDisplayPointAttributeMetadataUsed())
        {
            endBitPosition = displayPointAttributeMetadata_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = content_.initializeOffsets(zserioContext.getContent(), endBitPosition);
        if (isDisplayAreaAttributeMetadataUsed())
        {
            endBitPosition = displayAreaAttributeMetadata_.initializeOffsets(zserioContext.getDisplayAreaAttributeMetadata(), endBitPosition);
        }
        if (isDisplayLineAttributeMetadataUsed())
        {
            endBitPosition = displayLineAttributeMetadata_.initializeOffsets(zserioContext.getDisplayLineAttributeMetadata(), endBitPosition);
        }
        if (isDisplayPointAttributeMetadataUsed())
        {
            endBitPosition = displayPointAttributeMetadata_.initializeOffsets(zserioContext.getDisplayPointAttributeMetadata(), endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        content_.write(out);

        if (isDisplayAreaAttributeMetadataUsed())
        {
            displayAreaAttributeMetadata_.write(out);
        }

        if (isDisplayLineAttributeMetadataUsed())
        {
            displayLineAttributeMetadata_.write(out);
        }

        if (isDisplayPointAttributeMetadataUsed())
        {
            displayPointAttributeMetadata_.write(out);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.write(zserioContext.getContent(), out);

        if (isDisplayAreaAttributeMetadataUsed())
        {
            displayAreaAttributeMetadata_.write(zserioContext.getDisplayAreaAttributeMetadata(), out);
        }

        if (isDisplayLineAttributeMetadataUsed())
        {
            displayLineAttributeMetadata_.write(zserioContext.getDisplayLineAttributeMetadata(), out);
        }

        if (isDisplayPointAttributeMetadataUsed())
        {
            displayPointAttributeMetadata_.write(zserioContext.getDisplayPointAttributeMetadata(), out);
        }
    }

    private nds.display.details.metadata.DisplayAttributeLayerContent content_;
    private nds.display.details.instantiations.DisplayAreaAttributeMetadata displayAreaAttributeMetadata_;
    private nds.display.details.instantiations.DisplayLineAttributeMetadata displayLineAttributeMetadata_;
    private nds.display.details.instantiations.DisplayPointAttributeMetadata displayPointAttributeMetadata_;
}
