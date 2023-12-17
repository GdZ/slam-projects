/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.rules.layer;

public class RoadLocationRulesLayer implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            content_ = new zserio.runtime.array.DeltaContext();
            shift_ = new zserio.runtime.array.DeltaContext();
            roadLocationRangeAttributeMaps_ = new nds.rules.instantiations.RulesRoadLocationRangeAttributeMapList.ZserioPackingContext();
            roadLocationTransitionAttributeMaps_ = new nds.rules.instantiations.RulesRoadLocationTransitionAttributeMapList.ZserioPackingContext();
            roadLocationRangeAttributeSets_ = new nds.rules.instantiations.RulesRoadLocationRangeAttributeSetList.ZserioPackingContext();
            roadLocationTransitionAttributeSets_ = new nds.rules.instantiations.RulesRoadLocationTransitionAttributeSetList.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getContent()
        {
            return content_;
        }

        public zserio.runtime.array.DeltaContext getShift()
        {
            return shift_;
        }

        public nds.rules.instantiations.RulesRoadLocationRangeAttributeMapList.ZserioPackingContext getRoadLocationRangeAttributeMaps()
        {
            return roadLocationRangeAttributeMaps_;
        }

        public nds.rules.instantiations.RulesRoadLocationTransitionAttributeMapList.ZserioPackingContext getRoadLocationTransitionAttributeMaps()
        {
            return roadLocationTransitionAttributeMaps_;
        }

        public nds.rules.instantiations.RulesRoadLocationRangeAttributeSetList.ZserioPackingContext getRoadLocationRangeAttributeSets()
        {
            return roadLocationRangeAttributeSets_;
        }

        public nds.rules.instantiations.RulesRoadLocationTransitionAttributeSetList.ZserioPackingContext getRoadLocationTransitionAttributeSets()
        {
            return roadLocationTransitionAttributeSets_;
        }

        private zserio.runtime.array.DeltaContext content_;
        private zserio.runtime.array.DeltaContext shift_;
        private nds.rules.instantiations.RulesRoadLocationRangeAttributeMapList.ZserioPackingContext roadLocationRangeAttributeMaps_;
        private nds.rules.instantiations.RulesRoadLocationTransitionAttributeMapList.ZserioPackingContext roadLocationTransitionAttributeMaps_;
        private nds.rules.instantiations.RulesRoadLocationRangeAttributeSetList.ZserioPackingContext roadLocationRangeAttributeSets_;
        private nds.rules.instantiations.RulesRoadLocationTransitionAttributeSetList.ZserioPackingContext roadLocationTransitionAttributeSets_;
    };

    public RoadLocationRulesLayer()
    {
    }

    public RoadLocationRulesLayer(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RoadLocationRulesLayer(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RoadLocationRulesLayer(
            nds.rules.metadata.RoadLocationRulesLayerContent content_,
            byte shift_,
            nds.rules.instantiations.RulesRoadLocationRangeAttributeMapList roadLocationRangeAttributeMaps_,
            nds.rules.instantiations.RulesRoadLocationTransitionAttributeMapList roadLocationTransitionAttributeMaps_,
            nds.rules.instantiations.RulesRoadLocationRangeAttributeSetList roadLocationRangeAttributeSets_,
            nds.rules.instantiations.RulesRoadLocationTransitionAttributeSetList roadLocationTransitionAttributeSets_)
    {
        setContent(content_);
        setShift(shift_);
        setRoadLocationRangeAttributeMaps(roadLocationRangeAttributeMaps_);
        setRoadLocationTransitionAttributeMaps(roadLocationTransitionAttributeMaps_);
        setRoadLocationRangeAttributeSets(roadLocationRangeAttributeSets_);
        setRoadLocationTransitionAttributeSets(roadLocationTransitionAttributeSets_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.initPackingContext(zserioContext.getContent());
        zserioContext.getShift().init(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(shift_));
        if (isRoadLocationRangeAttributeMapsUsed())
        {
            roadLocationRangeAttributeMaps_.initPackingContext(zserioContext.getRoadLocationRangeAttributeMaps());
        }
        if (isRoadLocationTransitionAttributeMapsUsed())
        {
            roadLocationTransitionAttributeMaps_.initPackingContext(zserioContext.getRoadLocationTransitionAttributeMaps());
        }
        if (isRoadLocationRangeAttributeSetsUsed())
        {
            roadLocationRangeAttributeSets_.initPackingContext(zserioContext.getRoadLocationRangeAttributeSets());
        }
        if (isRoadLocationTransitionAttributeSetsUsed())
        {
            roadLocationTransitionAttributeSets_.initPackingContext(zserioContext.getRoadLocationTransitionAttributeSets());
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
        if (isRoadLocationRangeAttributeMapsUsed())
        {
            endBitPosition += roadLocationRangeAttributeMaps_.bitSizeOf(endBitPosition);
        }
        if (isRoadLocationTransitionAttributeMapsUsed())
        {
            endBitPosition += roadLocationTransitionAttributeMaps_.bitSizeOf(endBitPosition);
        }
        if (isRoadLocationRangeAttributeSetsUsed())
        {
            endBitPosition += roadLocationRangeAttributeSets_.bitSizeOf(endBitPosition);
        }
        if (isRoadLocationTransitionAttributeSetsUsed())
        {
            endBitPosition += roadLocationTransitionAttributeSets_.bitSizeOf(endBitPosition);
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
        if (isRoadLocationRangeAttributeMapsUsed())
        {
            endBitPosition += roadLocationRangeAttributeMaps_.bitSizeOf(zserioContext.getRoadLocationRangeAttributeMaps(), endBitPosition);
        }
        if (isRoadLocationTransitionAttributeMapsUsed())
        {
            endBitPosition += roadLocationTransitionAttributeMaps_.bitSizeOf(zserioContext.getRoadLocationTransitionAttributeMaps(), endBitPosition);
        }
        if (isRoadLocationRangeAttributeSetsUsed())
        {
            endBitPosition += roadLocationRangeAttributeSets_.bitSizeOf(zserioContext.getRoadLocationRangeAttributeSets(), endBitPosition);
        }
        if (isRoadLocationTransitionAttributeSetsUsed())
        {
            endBitPosition += roadLocationTransitionAttributeSets_.bitSizeOf(zserioContext.getRoadLocationTransitionAttributeSets(), endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.rules.metadata.RoadLocationRulesLayerContent getContent()
    {
        return content_;
    }

    public void setContent(nds.rules.metadata.RoadLocationRulesLayerContent content_)
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

    public nds.rules.instantiations.RulesRoadLocationRangeAttributeMapList getRoadLocationRangeAttributeMaps()
    {
        return roadLocationRangeAttributeMaps_;
    }

    public void setRoadLocationRangeAttributeMaps(nds.rules.instantiations.RulesRoadLocationRangeAttributeMapList roadLocationRangeAttributeMaps_)
    {
        this.roadLocationRangeAttributeMaps_ = roadLocationRangeAttributeMaps_;
    }

    public boolean isRoadLocationRangeAttributeMapsUsed()
    {
        return ((getContent().and(nds.rules.metadata.RoadLocationRulesLayerContent.Values.ROAD_LOCATION_MAPS)).equals(nds.rules.metadata.RoadLocationRulesLayerContent.Values.ROAD_LOCATION_MAPS));
    }

    public boolean isRoadLocationRangeAttributeMapsSet()
    {
        return (roadLocationRangeAttributeMaps_ != null);
    }

    public void resetRoadLocationRangeAttributeMaps()
    {
        this.roadLocationRangeAttributeMaps_ = null;
    }

    public nds.rules.instantiations.RulesRoadLocationTransitionAttributeMapList getRoadLocationTransitionAttributeMaps()
    {
        return roadLocationTransitionAttributeMaps_;
    }

    public void setRoadLocationTransitionAttributeMaps(nds.rules.instantiations.RulesRoadLocationTransitionAttributeMapList roadLocationTransitionAttributeMaps_)
    {
        this.roadLocationTransitionAttributeMaps_ = roadLocationTransitionAttributeMaps_;
    }

    public boolean isRoadLocationTransitionAttributeMapsUsed()
    {
        return ((getContent().and(nds.rules.metadata.RoadLocationRulesLayerContent.Values.ROAD_LOCATION_TRANSITION_MAPS)).equals(nds.rules.metadata.RoadLocationRulesLayerContent.Values.ROAD_LOCATION_TRANSITION_MAPS));
    }

    public boolean isRoadLocationTransitionAttributeMapsSet()
    {
        return (roadLocationTransitionAttributeMaps_ != null);
    }

    public void resetRoadLocationTransitionAttributeMaps()
    {
        this.roadLocationTransitionAttributeMaps_ = null;
    }

    public nds.rules.instantiations.RulesRoadLocationRangeAttributeSetList getRoadLocationRangeAttributeSets()
    {
        return roadLocationRangeAttributeSets_;
    }

    public void setRoadLocationRangeAttributeSets(nds.rules.instantiations.RulesRoadLocationRangeAttributeSetList roadLocationRangeAttributeSets_)
    {
        this.roadLocationRangeAttributeSets_ = roadLocationRangeAttributeSets_;
    }

    public boolean isRoadLocationRangeAttributeSetsUsed()
    {
        return ((getContent().and(nds.rules.metadata.RoadLocationRulesLayerContent.Values.ROAD_LOCATION_SETS)).equals(nds.rules.metadata.RoadLocationRulesLayerContent.Values.ROAD_LOCATION_SETS));
    }

    public boolean isRoadLocationRangeAttributeSetsSet()
    {
        return (roadLocationRangeAttributeSets_ != null);
    }

    public void resetRoadLocationRangeAttributeSets()
    {
        this.roadLocationRangeAttributeSets_ = null;
    }

    public nds.rules.instantiations.RulesRoadLocationTransitionAttributeSetList getRoadLocationTransitionAttributeSets()
    {
        return roadLocationTransitionAttributeSets_;
    }

    public void setRoadLocationTransitionAttributeSets(nds.rules.instantiations.RulesRoadLocationTransitionAttributeSetList roadLocationTransitionAttributeSets_)
    {
        this.roadLocationTransitionAttributeSets_ = roadLocationTransitionAttributeSets_;
    }

    public boolean isRoadLocationTransitionAttributeSetsUsed()
    {
        return ((getContent().and(nds.rules.metadata.RoadLocationRulesLayerContent.Values.ROAD_LOCATION_TRANSITION_SETS)).equals(nds.rules.metadata.RoadLocationRulesLayerContent.Values.ROAD_LOCATION_TRANSITION_SETS));
    }

    public boolean isRoadLocationTransitionAttributeSetsSet()
    {
        return (roadLocationTransitionAttributeSets_ != null);
    }

    public void resetRoadLocationTransitionAttributeSets()
    {
        this.roadLocationTransitionAttributeSets_ = null;
    }

    public nds.system.types.LayerType funcGetLayerType()
    {
        return (nds.system.types.LayerType)(nds.system.types.LayerType.ATTRIBUTE);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RoadLocationRulesLayer)
        {
            final RoadLocationRulesLayer that = (RoadLocationRulesLayer)obj;

            return
                    ((content_ == null) ? that.content_ == null : content_.equals(that.content_)) &&
                    shift_ == that.shift_ &&
                    ((!isRoadLocationRangeAttributeMapsUsed()) ? !that.isRoadLocationRangeAttributeMapsUsed() :
                        ((roadLocationRangeAttributeMaps_ == null) ? that.roadLocationRangeAttributeMaps_ == null : roadLocationRangeAttributeMaps_.equals(that.roadLocationRangeAttributeMaps_))) &&
                    ((!isRoadLocationTransitionAttributeMapsUsed()) ? !that.isRoadLocationTransitionAttributeMapsUsed() :
                        ((roadLocationTransitionAttributeMaps_ == null) ? that.roadLocationTransitionAttributeMaps_ == null : roadLocationTransitionAttributeMaps_.equals(that.roadLocationTransitionAttributeMaps_))) &&
                    ((!isRoadLocationRangeAttributeSetsUsed()) ? !that.isRoadLocationRangeAttributeSetsUsed() :
                        ((roadLocationRangeAttributeSets_ == null) ? that.roadLocationRangeAttributeSets_ == null : roadLocationRangeAttributeSets_.equals(that.roadLocationRangeAttributeSets_))) &&
                    ((!isRoadLocationTransitionAttributeSetsUsed()) ? !that.isRoadLocationTransitionAttributeSetsUsed() :
                        ((roadLocationTransitionAttributeSets_ == null) ? that.roadLocationTransitionAttributeSets_ == null : roadLocationTransitionAttributeSets_.equals(that.roadLocationTransitionAttributeSets_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, content_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, shift_);
        if (isRoadLocationRangeAttributeMapsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, roadLocationRangeAttributeMaps_);
        if (isRoadLocationTransitionAttributeMapsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, roadLocationTransitionAttributeMaps_);
        if (isRoadLocationRangeAttributeSetsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, roadLocationRangeAttributeSets_);
        if (isRoadLocationTransitionAttributeSetsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, roadLocationTransitionAttributeSets_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        content_ = new nds.rules.metadata.RoadLocationRulesLayerContent(in);

        shift_ = (byte)in.readBits(5);

        if ((getContent().and(nds.rules.metadata.RoadLocationRulesLayerContent.Values.ROAD_LOCATION_MAPS)).equals(nds.rules.metadata.RoadLocationRulesLayerContent.Values.ROAD_LOCATION_MAPS))
        {
            roadLocationRangeAttributeMaps_ = new nds.rules.instantiations.RulesRoadLocationRangeAttributeMapList(in, (byte)(getShift()));
        }

        if ((getContent().and(nds.rules.metadata.RoadLocationRulesLayerContent.Values.ROAD_LOCATION_TRANSITION_MAPS)).equals(nds.rules.metadata.RoadLocationRulesLayerContent.Values.ROAD_LOCATION_TRANSITION_MAPS))
        {
            roadLocationTransitionAttributeMaps_ = new nds.rules.instantiations.RulesRoadLocationTransitionAttributeMapList(in, (byte)(getShift()));
        }

        if ((getContent().and(nds.rules.metadata.RoadLocationRulesLayerContent.Values.ROAD_LOCATION_SETS)).equals(nds.rules.metadata.RoadLocationRulesLayerContent.Values.ROAD_LOCATION_SETS))
        {
            roadLocationRangeAttributeSets_ = new nds.rules.instantiations.RulesRoadLocationRangeAttributeSetList(in, (byte)(getShift()));
        }

        if ((getContent().and(nds.rules.metadata.RoadLocationRulesLayerContent.Values.ROAD_LOCATION_TRANSITION_SETS)).equals(nds.rules.metadata.RoadLocationRulesLayerContent.Values.ROAD_LOCATION_TRANSITION_SETS))
        {
            roadLocationTransitionAttributeSets_ = new nds.rules.instantiations.RulesRoadLocationTransitionAttributeSetList(in, (byte)(getShift()));
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_ = new nds.rules.metadata.RoadLocationRulesLayerContent(zserioContext.getContent(), in);

        shift_ = ((zserio.runtime.array.ArrayElement.ByteArrayElement)
                zserioContext.getShift().read(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)), in)).get();

        if ((getContent().and(nds.rules.metadata.RoadLocationRulesLayerContent.Values.ROAD_LOCATION_MAPS)).equals(nds.rules.metadata.RoadLocationRulesLayerContent.Values.ROAD_LOCATION_MAPS))
        {
            roadLocationRangeAttributeMaps_ = new nds.rules.instantiations.RulesRoadLocationRangeAttributeMapList(zserioContext.getRoadLocationRangeAttributeMaps(), in, (byte)(getShift()));
        }

        if ((getContent().and(nds.rules.metadata.RoadLocationRulesLayerContent.Values.ROAD_LOCATION_TRANSITION_MAPS)).equals(nds.rules.metadata.RoadLocationRulesLayerContent.Values.ROAD_LOCATION_TRANSITION_MAPS))
        {
            roadLocationTransitionAttributeMaps_ = new nds.rules.instantiations.RulesRoadLocationTransitionAttributeMapList(zserioContext.getRoadLocationTransitionAttributeMaps(), in, (byte)(getShift()));
        }

        if ((getContent().and(nds.rules.metadata.RoadLocationRulesLayerContent.Values.ROAD_LOCATION_SETS)).equals(nds.rules.metadata.RoadLocationRulesLayerContent.Values.ROAD_LOCATION_SETS))
        {
            roadLocationRangeAttributeSets_ = new nds.rules.instantiations.RulesRoadLocationRangeAttributeSetList(zserioContext.getRoadLocationRangeAttributeSets(), in, (byte)(getShift()));
        }

        if ((getContent().and(nds.rules.metadata.RoadLocationRulesLayerContent.Values.ROAD_LOCATION_TRANSITION_SETS)).equals(nds.rules.metadata.RoadLocationRulesLayerContent.Values.ROAD_LOCATION_TRANSITION_SETS))
        {
            roadLocationTransitionAttributeSets_ = new nds.rules.instantiations.RulesRoadLocationTransitionAttributeSetList(zserioContext.getRoadLocationTransitionAttributeSets(), in, (byte)(getShift()));
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
        if (isRoadLocationRangeAttributeMapsUsed())
        {
            endBitPosition = roadLocationRangeAttributeMaps_.initializeOffsets(endBitPosition);
        }
        if (isRoadLocationTransitionAttributeMapsUsed())
        {
            endBitPosition = roadLocationTransitionAttributeMaps_.initializeOffsets(endBitPosition);
        }
        if (isRoadLocationRangeAttributeSetsUsed())
        {
            endBitPosition = roadLocationRangeAttributeSets_.initializeOffsets(endBitPosition);
        }
        if (isRoadLocationTransitionAttributeSetsUsed())
        {
            endBitPosition = roadLocationTransitionAttributeSets_.initializeOffsets(endBitPosition);
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
        if (isRoadLocationRangeAttributeMapsUsed())
        {
            endBitPosition = roadLocationRangeAttributeMaps_.initializeOffsets(zserioContext.getRoadLocationRangeAttributeMaps(), endBitPosition);
        }
        if (isRoadLocationTransitionAttributeMapsUsed())
        {
            endBitPosition = roadLocationTransitionAttributeMaps_.initializeOffsets(zserioContext.getRoadLocationTransitionAttributeMaps(), endBitPosition);
        }
        if (isRoadLocationRangeAttributeSetsUsed())
        {
            endBitPosition = roadLocationRangeAttributeSets_.initializeOffsets(zserioContext.getRoadLocationRangeAttributeSets(), endBitPosition);
        }
        if (isRoadLocationTransitionAttributeSetsUsed())
        {
            endBitPosition = roadLocationTransitionAttributeSets_.initializeOffsets(zserioContext.getRoadLocationTransitionAttributeSets(), endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        content_.write(out);

        out.writeBits(shift_, 5);

        if (isRoadLocationRangeAttributeMapsUsed())
        {
            // check parameters
            if (roadLocationRangeAttributeMaps_.getCoordShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field RoadLocationRulesLayer.roadLocationRangeAttributeMaps: " +
                        roadLocationRangeAttributeMaps_.getCoordShift() + " != " + (byte)(getShift()) + "!");
            }
            roadLocationRangeAttributeMaps_.write(out);
        }

        if (isRoadLocationTransitionAttributeMapsUsed())
        {
            // check parameters
            if (roadLocationTransitionAttributeMaps_.getCoordShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field RoadLocationRulesLayer.roadLocationTransitionAttributeMaps: " +
                        roadLocationTransitionAttributeMaps_.getCoordShift() + " != " + (byte)(getShift()) + "!");
            }
            roadLocationTransitionAttributeMaps_.write(out);
        }

        if (isRoadLocationRangeAttributeSetsUsed())
        {
            // check parameters
            if (roadLocationRangeAttributeSets_.getCoordShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field RoadLocationRulesLayer.roadLocationRangeAttributeSets: " +
                        roadLocationRangeAttributeSets_.getCoordShift() + " != " + (byte)(getShift()) + "!");
            }
            roadLocationRangeAttributeSets_.write(out);
        }

        if (isRoadLocationTransitionAttributeSetsUsed())
        {
            // check parameters
            if (roadLocationTransitionAttributeSets_.getCoordShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field RoadLocationRulesLayer.roadLocationTransitionAttributeSets: " +
                        roadLocationTransitionAttributeSets_.getCoordShift() + " != " + (byte)(getShift()) + "!");
            }
            roadLocationTransitionAttributeSets_.write(out);
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

        if (isRoadLocationRangeAttributeMapsUsed())
        {
            roadLocationRangeAttributeMaps_.write(zserioContext.getRoadLocationRangeAttributeMaps(), out);
        }

        if (isRoadLocationTransitionAttributeMapsUsed())
        {
            roadLocationTransitionAttributeMaps_.write(zserioContext.getRoadLocationTransitionAttributeMaps(), out);
        }

        if (isRoadLocationRangeAttributeSetsUsed())
        {
            roadLocationRangeAttributeSets_.write(zserioContext.getRoadLocationRangeAttributeSets(), out);
        }

        if (isRoadLocationTransitionAttributeSetsUsed())
        {
            roadLocationTransitionAttributeSets_.write(zserioContext.getRoadLocationTransitionAttributeSets(), out);
        }
    }

    private nds.rules.metadata.RoadLocationRulesLayerContent content_;
    private byte shift_;
    private nds.rules.instantiations.RulesRoadLocationRangeAttributeMapList roadLocationRangeAttributeMaps_;
    private nds.rules.instantiations.RulesRoadLocationTransitionAttributeMapList roadLocationTransitionAttributeMaps_;
    private nds.rules.instantiations.RulesRoadLocationRangeAttributeSetList roadLocationRangeAttributeSets_;
    private nds.rules.instantiations.RulesRoadLocationTransitionAttributeSetList roadLocationTransitionAttributeSets_;
}