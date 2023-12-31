/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.traffic.layer;

public class DisplayLineTrafficLayer implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            content_ = new zserio.runtime.array.DeltaContext();
            shift_ = new zserio.runtime.array.DeltaContext();
            displayLineRangeAttributeMaps_ = new nds.traffic.instantiations.TrafficDisplayLineRangeAttributeMapList.ZserioPackingContext();
            displayLineRangeAttributeSets_ = new nds.traffic.instantiations.TrafficDisplayLineRangeAttributeSetList.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getContent()
        {
            return content_;
        }

        public zserio.runtime.array.DeltaContext getShift()
        {
            return shift_;
        }

        public nds.traffic.instantiations.TrafficDisplayLineRangeAttributeMapList.ZserioPackingContext getDisplayLineRangeAttributeMaps()
        {
            return displayLineRangeAttributeMaps_;
        }

        public nds.traffic.instantiations.TrafficDisplayLineRangeAttributeSetList.ZserioPackingContext getDisplayLineRangeAttributeSets()
        {
            return displayLineRangeAttributeSets_;
        }

        private zserio.runtime.array.DeltaContext content_;
        private zserio.runtime.array.DeltaContext shift_;
        private nds.traffic.instantiations.TrafficDisplayLineRangeAttributeMapList.ZserioPackingContext displayLineRangeAttributeMaps_;
        private nds.traffic.instantiations.TrafficDisplayLineRangeAttributeSetList.ZserioPackingContext displayLineRangeAttributeSets_;
    };

    public DisplayLineTrafficLayer()
    {
    }

    public DisplayLineTrafficLayer(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public DisplayLineTrafficLayer(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public DisplayLineTrafficLayer(
            nds.traffic.metadata.DisplayLineTrafficLayerContent content_,
            byte shift_,
            nds.traffic.instantiations.TrafficDisplayLineRangeAttributeMapList displayLineRangeAttributeMaps_,
            nds.traffic.instantiations.TrafficDisplayLineRangeAttributeSetList displayLineRangeAttributeSets_)
    {
        setContent(content_);
        setShift(shift_);
        setDisplayLineRangeAttributeMaps(displayLineRangeAttributeMaps_);
        setDisplayLineRangeAttributeSets(displayLineRangeAttributeSets_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.initPackingContext(zserioContext.getContent());
        zserioContext.getShift().init(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(shift_));
        if (isDisplayLineRangeAttributeMapsUsed())
        {
            displayLineRangeAttributeMaps_.initPackingContext(zserioContext.getDisplayLineRangeAttributeMaps());
        }
        if (isDisplayLineRangeAttributeSetsUsed())
        {
            displayLineRangeAttributeSets_.initPackingContext(zserioContext.getDisplayLineRangeAttributeSets());
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
        endBitPosition += 5;
        if (isDisplayLineRangeAttributeMapsUsed())
        {
            endBitPosition += displayLineRangeAttributeMaps_.bitSizeOf(endBitPosition);
        }
        if (isDisplayLineRangeAttributeSetsUsed())
        {
            endBitPosition += displayLineRangeAttributeSets_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += content_.bitSizeOf(zserioContext.getContent(), endBitPosition);
        endBitPosition += zserioContext.getShift().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(shift_));
        if (isDisplayLineRangeAttributeMapsUsed())
        {
            endBitPosition += displayLineRangeAttributeMaps_.bitSizeOf(zserioContext.getDisplayLineRangeAttributeMaps(), endBitPosition);
        }
        if (isDisplayLineRangeAttributeSetsUsed())
        {
            endBitPosition += displayLineRangeAttributeSets_.bitSizeOf(zserioContext.getDisplayLineRangeAttributeSets(), endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.traffic.metadata.DisplayLineTrafficLayerContent getContent()
    {
        return content_;
    }

    public void setContent(nds.traffic.metadata.DisplayLineTrafficLayerContent content_)
    {
        this.content_ = content_;
    }

    public byte getShift()
    {
        return shift_;
    }

    public void setShift(byte shift_)
    {
        this.shift_ = shift_;
    }

    public nds.traffic.instantiations.TrafficDisplayLineRangeAttributeMapList getDisplayLineRangeAttributeMaps()
    {
        return displayLineRangeAttributeMaps_;
    }

    public void setDisplayLineRangeAttributeMaps(nds.traffic.instantiations.TrafficDisplayLineRangeAttributeMapList displayLineRangeAttributeMaps_)
    {
        this.displayLineRangeAttributeMaps_ = displayLineRangeAttributeMaps_;
    }

    public boolean isDisplayLineRangeAttributeMapsUsed()
    {
        return ((getContent().and(nds.traffic.metadata.DisplayLineTrafficLayerContent.Values.DISPLAY_LINE_RANGE_MAPS)).equals(nds.traffic.metadata.DisplayLineTrafficLayerContent.Values.DISPLAY_LINE_RANGE_MAPS));
    }

    public boolean isDisplayLineRangeAttributeMapsSet()
    {
        return (displayLineRangeAttributeMaps_ != null);
    }

    public void resetDisplayLineRangeAttributeMaps()
    {
        this.displayLineRangeAttributeMaps_ = null;
    }

    public nds.traffic.instantiations.TrafficDisplayLineRangeAttributeSetList getDisplayLineRangeAttributeSets()
    {
        return displayLineRangeAttributeSets_;
    }

    public void setDisplayLineRangeAttributeSets(nds.traffic.instantiations.TrafficDisplayLineRangeAttributeSetList displayLineRangeAttributeSets_)
    {
        this.displayLineRangeAttributeSets_ = displayLineRangeAttributeSets_;
    }

    public boolean isDisplayLineRangeAttributeSetsUsed()
    {
        return ((getContent().and(nds.traffic.metadata.DisplayLineTrafficLayerContent.Values.DISPLAY_LINE_RANGE_SETS)).equals(nds.traffic.metadata.DisplayLineTrafficLayerContent.Values.DISPLAY_LINE_RANGE_SETS));
    }

    public boolean isDisplayLineRangeAttributeSetsSet()
    {
        return (displayLineRangeAttributeSets_ != null);
    }

    public void resetDisplayLineRangeAttributeSets()
    {
        this.displayLineRangeAttributeSets_ = null;
    }

    public nds.system.types.LayerType funcGetLayerType()
    {
        return (nds.system.types.LayerType)(nds.system.types.LayerType.ATTRIBUTE);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof DisplayLineTrafficLayer)
        {
            final DisplayLineTrafficLayer that = (DisplayLineTrafficLayer)obj;

            return
                    ((content_ == null) ? that.content_ == null : content_.equals(that.content_)) &&
                    shift_ == that.shift_ &&
                    ((!isDisplayLineRangeAttributeMapsUsed()) ? !that.isDisplayLineRangeAttributeMapsUsed() :
                        ((displayLineRangeAttributeMaps_ == null) ? that.displayLineRangeAttributeMaps_ == null : displayLineRangeAttributeMaps_.equals(that.displayLineRangeAttributeMaps_))) &&
                    ((!isDisplayLineRangeAttributeSetsUsed()) ? !that.isDisplayLineRangeAttributeSetsUsed() :
                        ((displayLineRangeAttributeSets_ == null) ? that.displayLineRangeAttributeSets_ == null : displayLineRangeAttributeSets_.equals(that.displayLineRangeAttributeSets_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, content_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, shift_);
        if (isDisplayLineRangeAttributeMapsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, displayLineRangeAttributeMaps_);
        if (isDisplayLineRangeAttributeSetsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, displayLineRangeAttributeSets_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        content_ = new nds.traffic.metadata.DisplayLineTrafficLayerContent(in);

        shift_ = (byte)in.readBits(5);

        if ((getContent().and(nds.traffic.metadata.DisplayLineTrafficLayerContent.Values.DISPLAY_LINE_RANGE_MAPS)).equals(nds.traffic.metadata.DisplayLineTrafficLayerContent.Values.DISPLAY_LINE_RANGE_MAPS))
        {
            displayLineRangeAttributeMaps_ = new nds.traffic.instantiations.TrafficDisplayLineRangeAttributeMapList(in, (byte)(getShift()));
        }

        if ((getContent().and(nds.traffic.metadata.DisplayLineTrafficLayerContent.Values.DISPLAY_LINE_RANGE_SETS)).equals(nds.traffic.metadata.DisplayLineTrafficLayerContent.Values.DISPLAY_LINE_RANGE_SETS))
        {
            displayLineRangeAttributeSets_ = new nds.traffic.instantiations.TrafficDisplayLineRangeAttributeSetList(in, (byte)(getShift()));
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_ = new nds.traffic.metadata.DisplayLineTrafficLayerContent(zserioContext.getContent(), in);

        shift_ = ((zserio.runtime.array.ArrayElement.ByteArrayElement)
                zserioContext.getShift().read(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)), in)).get();

        if ((getContent().and(nds.traffic.metadata.DisplayLineTrafficLayerContent.Values.DISPLAY_LINE_RANGE_MAPS)).equals(nds.traffic.metadata.DisplayLineTrafficLayerContent.Values.DISPLAY_LINE_RANGE_MAPS))
        {
            displayLineRangeAttributeMaps_ = new nds.traffic.instantiations.TrafficDisplayLineRangeAttributeMapList(zserioContext.getDisplayLineRangeAttributeMaps(), in, (byte)(getShift()));
        }

        if ((getContent().and(nds.traffic.metadata.DisplayLineTrafficLayerContent.Values.DISPLAY_LINE_RANGE_SETS)).equals(nds.traffic.metadata.DisplayLineTrafficLayerContent.Values.DISPLAY_LINE_RANGE_SETS))
        {
            displayLineRangeAttributeSets_ = new nds.traffic.instantiations.TrafficDisplayLineRangeAttributeSetList(zserioContext.getDisplayLineRangeAttributeSets(), in, (byte)(getShift()));
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
        endBitPosition += 5;
        if (isDisplayLineRangeAttributeMapsUsed())
        {
            endBitPosition = displayLineRangeAttributeMaps_.initializeOffsets(endBitPosition);
        }
        if (isDisplayLineRangeAttributeSetsUsed())
        {
            endBitPosition = displayLineRangeAttributeSets_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = content_.initializeOffsets(zserioContext.getContent(), endBitPosition);
        endBitPosition += zserioContext.getShift().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(shift_));
        if (isDisplayLineRangeAttributeMapsUsed())
        {
            endBitPosition = displayLineRangeAttributeMaps_.initializeOffsets(zserioContext.getDisplayLineRangeAttributeMaps(), endBitPosition);
        }
        if (isDisplayLineRangeAttributeSetsUsed())
        {
            endBitPosition = displayLineRangeAttributeSets_.initializeOffsets(zserioContext.getDisplayLineRangeAttributeSets(), endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        content_.write(out);

        out.writeBits(shift_, 5);

        if (isDisplayLineRangeAttributeMapsUsed())
        {
            // check parameters
            if (displayLineRangeAttributeMaps_.getCoordShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field DisplayLineTrafficLayer.displayLineRangeAttributeMaps: " +
                        displayLineRangeAttributeMaps_.getCoordShift() + " != " + (byte)(getShift()) + "!");
            }
            displayLineRangeAttributeMaps_.write(out);
        }

        if (isDisplayLineRangeAttributeSetsUsed())
        {
            // check parameters
            if (displayLineRangeAttributeSets_.getCoordShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field DisplayLineTrafficLayer.displayLineRangeAttributeSets: " +
                        displayLineRangeAttributeSets_.getCoordShift() + " != " + (byte)(getShift()) + "!");
            }
            displayLineRangeAttributeSets_.write(out);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.write(zserioContext.getContent(), out);

        zserioContext.getShift().write(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)), out,
                new zserio.runtime.array.ArrayElement.ByteArrayElement(shift_));

        if (isDisplayLineRangeAttributeMapsUsed())
        {
            displayLineRangeAttributeMaps_.write(zserioContext.getDisplayLineRangeAttributeMaps(), out);
        }

        if (isDisplayLineRangeAttributeSetsUsed())
        {
            displayLineRangeAttributeSets_.write(zserioContext.getDisplayLineRangeAttributeSets(), out);
        }
    }

    private nds.traffic.metadata.DisplayLineTrafficLayerContent content_;
    private byte shift_;
    private nds.traffic.instantiations.TrafficDisplayLineRangeAttributeMapList displayLineRangeAttributeMaps_;
    private nds.traffic.instantiations.TrafficDisplayLineRangeAttributeSetList displayLineRangeAttributeSets_;
}
