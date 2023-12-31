/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.adas.layer;

public class AdasLaneLayer implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            content_ = new zserio.runtime.array.DeltaContext();
            adasLaneAttributeMaps_ = new nds.adas.instantiations.AdasLaneAttributeMapList.ZserioPackingContext();
            adasLaneAttributeSets_ = new nds.adas.instantiations.AdasLaneAttributeSetList.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getContent()
        {
            return content_;
        }

        public nds.adas.instantiations.AdasLaneAttributeMapList.ZserioPackingContext getAdasLaneAttributeMaps()
        {
            return adasLaneAttributeMaps_;
        }

        public nds.adas.instantiations.AdasLaneAttributeSetList.ZserioPackingContext getAdasLaneAttributeSets()
        {
            return adasLaneAttributeSets_;
        }

        private zserio.runtime.array.DeltaContext content_;
        private nds.adas.instantiations.AdasLaneAttributeMapList.ZserioPackingContext adasLaneAttributeMaps_;
        private nds.adas.instantiations.AdasLaneAttributeSetList.ZserioPackingContext adasLaneAttributeSets_;
    };

    public AdasLaneLayer()
    {
    }

    public AdasLaneLayer(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public AdasLaneLayer(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public AdasLaneLayer(
            nds.adas.metadata.AdasLaneLayerContent content_,
            nds.adas.instantiations.AdasLaneAttributeMapList adasLaneAttributeMaps_,
            nds.adas.instantiations.AdasLaneAttributeSetList adasLaneAttributeSets_)
    {
        setContent(content_);
        setAdasLaneAttributeMaps(adasLaneAttributeMaps_);
        setAdasLaneAttributeSets(adasLaneAttributeSets_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.initPackingContext(zserioContext.getContent());
        if (isAdasLaneAttributeMapsUsed())
        {
            adasLaneAttributeMaps_.initPackingContext(zserioContext.getAdasLaneAttributeMaps());
        }
        if (isAdasLaneAttributeSetsUsed())
        {
            adasLaneAttributeSets_.initPackingContext(zserioContext.getAdasLaneAttributeSets());
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
        if (isAdasLaneAttributeMapsUsed())
        {
            endBitPosition += adasLaneAttributeMaps_.bitSizeOf(endBitPosition);
        }
        if (isAdasLaneAttributeSetsUsed())
        {
            endBitPosition += adasLaneAttributeSets_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += content_.bitSizeOf(zserioContext.getContent(), endBitPosition);
        if (isAdasLaneAttributeMapsUsed())
        {
            endBitPosition += adasLaneAttributeMaps_.bitSizeOf(zserioContext.getAdasLaneAttributeMaps(), endBitPosition);
        }
        if (isAdasLaneAttributeSetsUsed())
        {
            endBitPosition += adasLaneAttributeSets_.bitSizeOf(zserioContext.getAdasLaneAttributeSets(), endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.adas.metadata.AdasLaneLayerContent getContent()
    {
        return content_;
    }

    public void setContent(nds.adas.metadata.AdasLaneLayerContent content_)
    {
        this.content_ = content_;
    }

    public nds.adas.instantiations.AdasLaneAttributeMapList getAdasLaneAttributeMaps()
    {
        return adasLaneAttributeMaps_;
    }

    public void setAdasLaneAttributeMaps(nds.adas.instantiations.AdasLaneAttributeMapList adasLaneAttributeMaps_)
    {
        this.adasLaneAttributeMaps_ = adasLaneAttributeMaps_;
    }

    public boolean isAdasLaneAttributeMapsUsed()
    {
        return ((getContent().and(nds.adas.metadata.AdasLaneLayerContent.Values.LANE_MAPS)).equals(nds.adas.metadata.AdasLaneLayerContent.Values.LANE_MAPS));
    }

    public boolean isAdasLaneAttributeMapsSet()
    {
        return (adasLaneAttributeMaps_ != null);
    }

    public void resetAdasLaneAttributeMaps()
    {
        this.adasLaneAttributeMaps_ = null;
    }

    public nds.adas.instantiations.AdasLaneAttributeSetList getAdasLaneAttributeSets()
    {
        return adasLaneAttributeSets_;
    }

    public void setAdasLaneAttributeSets(nds.adas.instantiations.AdasLaneAttributeSetList adasLaneAttributeSets_)
    {
        this.adasLaneAttributeSets_ = adasLaneAttributeSets_;
    }

    public boolean isAdasLaneAttributeSetsUsed()
    {
        return ((getContent().and(nds.adas.metadata.AdasLaneLayerContent.Values.LANE_SETS)).equals(nds.adas.metadata.AdasLaneLayerContent.Values.LANE_SETS));
    }

    public boolean isAdasLaneAttributeSetsSet()
    {
        return (adasLaneAttributeSets_ != null);
    }

    public void resetAdasLaneAttributeSets()
    {
        this.adasLaneAttributeSets_ = null;
    }

    public nds.system.types.LayerType funcGetLayerType()
    {
        return (nds.system.types.LayerType)(nds.system.types.LayerType.ATTRIBUTE);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof AdasLaneLayer)
        {
            final AdasLaneLayer that = (AdasLaneLayer)obj;

            return
                    ((content_ == null) ? that.content_ == null : content_.equals(that.content_)) &&
                    ((!isAdasLaneAttributeMapsUsed()) ? !that.isAdasLaneAttributeMapsUsed() :
                        ((adasLaneAttributeMaps_ == null) ? that.adasLaneAttributeMaps_ == null : adasLaneAttributeMaps_.equals(that.adasLaneAttributeMaps_))) &&
                    ((!isAdasLaneAttributeSetsUsed()) ? !that.isAdasLaneAttributeSetsUsed() :
                        ((adasLaneAttributeSets_ == null) ? that.adasLaneAttributeSets_ == null : adasLaneAttributeSets_.equals(that.adasLaneAttributeSets_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, content_);
        if (isAdasLaneAttributeMapsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, adasLaneAttributeMaps_);
        if (isAdasLaneAttributeSetsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, adasLaneAttributeSets_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        content_ = new nds.adas.metadata.AdasLaneLayerContent(in);

        if ((getContent().and(nds.adas.metadata.AdasLaneLayerContent.Values.LANE_MAPS)).equals(nds.adas.metadata.AdasLaneLayerContent.Values.LANE_MAPS))
        {
            adasLaneAttributeMaps_ = new nds.adas.instantiations.AdasLaneAttributeMapList(in, (byte)(0));
        }

        if ((getContent().and(nds.adas.metadata.AdasLaneLayerContent.Values.LANE_SETS)).equals(nds.adas.metadata.AdasLaneLayerContent.Values.LANE_SETS))
        {
            adasLaneAttributeSets_ = new nds.adas.instantiations.AdasLaneAttributeSetList(in, (byte)(0));
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_ = new nds.adas.metadata.AdasLaneLayerContent(zserioContext.getContent(), in);

        if ((getContent().and(nds.adas.metadata.AdasLaneLayerContent.Values.LANE_MAPS)).equals(nds.adas.metadata.AdasLaneLayerContent.Values.LANE_MAPS))
        {
            adasLaneAttributeMaps_ = new nds.adas.instantiations.AdasLaneAttributeMapList(zserioContext.getAdasLaneAttributeMaps(), in, (byte)(0));
        }

        if ((getContent().and(nds.adas.metadata.AdasLaneLayerContent.Values.LANE_SETS)).equals(nds.adas.metadata.AdasLaneLayerContent.Values.LANE_SETS))
        {
            adasLaneAttributeSets_ = new nds.adas.instantiations.AdasLaneAttributeSetList(zserioContext.getAdasLaneAttributeSets(), in, (byte)(0));
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
        if (isAdasLaneAttributeMapsUsed())
        {
            endBitPosition = adasLaneAttributeMaps_.initializeOffsets(endBitPosition);
        }
        if (isAdasLaneAttributeSetsUsed())
        {
            endBitPosition = adasLaneAttributeSets_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = content_.initializeOffsets(zserioContext.getContent(), endBitPosition);
        if (isAdasLaneAttributeMapsUsed())
        {
            endBitPosition = adasLaneAttributeMaps_.initializeOffsets(zserioContext.getAdasLaneAttributeMaps(), endBitPosition);
        }
        if (isAdasLaneAttributeSetsUsed())
        {
            endBitPosition = adasLaneAttributeSets_.initializeOffsets(zserioContext.getAdasLaneAttributeSets(), endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        content_.write(out);

        if (isAdasLaneAttributeMapsUsed())
        {
            // check parameters
            if (adasLaneAttributeMaps_.getCoordShift() != (byte)(0))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field AdasLaneLayer.adasLaneAttributeMaps: " +
                        adasLaneAttributeMaps_.getCoordShift() + " != " + (byte)(0) + "!");
            }
            adasLaneAttributeMaps_.write(out);
        }

        if (isAdasLaneAttributeSetsUsed())
        {
            // check parameters
            if (adasLaneAttributeSets_.getCoordShift() != (byte)(0))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field AdasLaneLayer.adasLaneAttributeSets: " +
                        adasLaneAttributeSets_.getCoordShift() + " != " + (byte)(0) + "!");
            }
            adasLaneAttributeSets_.write(out);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.write(zserioContext.getContent(), out);

        if (isAdasLaneAttributeMapsUsed())
        {
            adasLaneAttributeMaps_.write(zserioContext.getAdasLaneAttributeMaps(), out);
        }

        if (isAdasLaneAttributeSetsUsed())
        {
            adasLaneAttributeSets_.write(zserioContext.getAdasLaneAttributeSets(), out);
        }
    }

    private nds.adas.metadata.AdasLaneLayerContent content_;
    private nds.adas.instantiations.AdasLaneAttributeMapList adasLaneAttributeMaps_;
    private nds.adas.instantiations.AdasLaneAttributeSetList adasLaneAttributeSets_;
}
