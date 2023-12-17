/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.rules.layer;

public class RoadRulesLayer implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            content_ = new zserio.runtime.array.DeltaContext();
            shift_ = new zserio.runtime.array.DeltaContext();
            roadRangeAttributeMaps_ = new nds.rules.instantiations.RulesRoadRangeAttributeMapList.ZserioPackingContext();
            roadPositionAttributeMaps_ = new nds.rules.instantiations.RulesRoadPositionAttributeMapList.ZserioPackingContext();
            transitionAttributeMaps_ = new nds.rules.instantiations.RulesTransitionAttributeMapList.ZserioPackingContext();
            roadRangeAttributeSets_ = new nds.rules.instantiations.RulesRoadRangeAttributeSetList.ZserioPackingContext();
            roadPositionAttributeSets_ = new nds.rules.instantiations.RulesRoadPositionAttributeSetList.ZserioPackingContext();
            transitionAttributeSets_ = new nds.rules.instantiations.RulesTransitionAttributeSetList.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getContent()
        {
            return content_;
        }

        public zserio.runtime.array.DeltaContext getShift()
        {
            return shift_;
        }

        public nds.rules.instantiations.RulesRoadRangeAttributeMapList.ZserioPackingContext getRoadRangeAttributeMaps()
        {
            return roadRangeAttributeMaps_;
        }

        public nds.rules.instantiations.RulesRoadPositionAttributeMapList.ZserioPackingContext getRoadPositionAttributeMaps()
        {
            return roadPositionAttributeMaps_;
        }

        public nds.rules.instantiations.RulesTransitionAttributeMapList.ZserioPackingContext getTransitionAttributeMaps()
        {
            return transitionAttributeMaps_;
        }

        public nds.rules.instantiations.RulesRoadRangeAttributeSetList.ZserioPackingContext getRoadRangeAttributeSets()
        {
            return roadRangeAttributeSets_;
        }

        public nds.rules.instantiations.RulesRoadPositionAttributeSetList.ZserioPackingContext getRoadPositionAttributeSets()
        {
            return roadPositionAttributeSets_;
        }

        public nds.rules.instantiations.RulesTransitionAttributeSetList.ZserioPackingContext getTransitionAttributeSets()
        {
            return transitionAttributeSets_;
        }

        private zserio.runtime.array.DeltaContext content_;
        private zserio.runtime.array.DeltaContext shift_;
        private nds.rules.instantiations.RulesRoadRangeAttributeMapList.ZserioPackingContext roadRangeAttributeMaps_;
        private nds.rules.instantiations.RulesRoadPositionAttributeMapList.ZserioPackingContext roadPositionAttributeMaps_;
        private nds.rules.instantiations.RulesTransitionAttributeMapList.ZserioPackingContext transitionAttributeMaps_;
        private nds.rules.instantiations.RulesRoadRangeAttributeSetList.ZserioPackingContext roadRangeAttributeSets_;
        private nds.rules.instantiations.RulesRoadPositionAttributeSetList.ZserioPackingContext roadPositionAttributeSets_;
        private nds.rules.instantiations.RulesTransitionAttributeSetList.ZserioPackingContext transitionAttributeSets_;
    };

    public RoadRulesLayer()
    {
    }

    public RoadRulesLayer(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RoadRulesLayer(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RoadRulesLayer(
            nds.rules.metadata.RoadRulesLayerContent content_,
            byte shift_,
            nds.rules.instantiations.RulesRoadRangeAttributeMapList roadRangeAttributeMaps_,
            nds.rules.instantiations.RulesRoadPositionAttributeMapList roadPositionAttributeMaps_,
            nds.rules.instantiations.RulesTransitionAttributeMapList transitionAttributeMaps_,
            nds.rules.instantiations.RulesRoadRangeAttributeSetList roadRangeAttributeSets_,
            nds.rules.instantiations.RulesRoadPositionAttributeSetList roadPositionAttributeSets_,
            nds.rules.instantiations.RulesTransitionAttributeSetList transitionAttributeSets_)
    {
        setContent(content_);
        setShift(shift_);
        setRoadRangeAttributeMaps(roadRangeAttributeMaps_);
        setRoadPositionAttributeMaps(roadPositionAttributeMaps_);
        setTransitionAttributeMaps(transitionAttributeMaps_);
        setRoadRangeAttributeSets(roadRangeAttributeSets_);
        setRoadPositionAttributeSets(roadPositionAttributeSets_);
        setTransitionAttributeSets(transitionAttributeSets_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.initPackingContext(zserioContext.getContent());
        zserioContext.getShift().init(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(shift_));
        if (isRoadRangeAttributeMapsUsed())
        {
            roadRangeAttributeMaps_.initPackingContext(zserioContext.getRoadRangeAttributeMaps());
        }
        if (isRoadPositionAttributeMapsUsed())
        {
            roadPositionAttributeMaps_.initPackingContext(zserioContext.getRoadPositionAttributeMaps());
        }
        if (isTransitionAttributeMapsUsed())
        {
            transitionAttributeMaps_.initPackingContext(zserioContext.getTransitionAttributeMaps());
        }
        if (isRoadRangeAttributeSetsUsed())
        {
            roadRangeAttributeSets_.initPackingContext(zserioContext.getRoadRangeAttributeSets());
        }
        if (isRoadPositionAttributeSetsUsed())
        {
            roadPositionAttributeSets_.initPackingContext(zserioContext.getRoadPositionAttributeSets());
        }
        if (isTransitionAttributeSetsUsed())
        {
            transitionAttributeSets_.initPackingContext(zserioContext.getTransitionAttributeSets());
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
        if (isRoadRangeAttributeMapsUsed())
        {
            endBitPosition += roadRangeAttributeMaps_.bitSizeOf(endBitPosition);
        }
        if (isRoadPositionAttributeMapsUsed())
        {
            endBitPosition += roadPositionAttributeMaps_.bitSizeOf(endBitPosition);
        }
        if (isTransitionAttributeMapsUsed())
        {
            endBitPosition += transitionAttributeMaps_.bitSizeOf(endBitPosition);
        }
        if (isRoadRangeAttributeSetsUsed())
        {
            endBitPosition += roadRangeAttributeSets_.bitSizeOf(endBitPosition);
        }
        if (isRoadPositionAttributeSetsUsed())
        {
            endBitPosition += roadPositionAttributeSets_.bitSizeOf(endBitPosition);
        }
        if (isTransitionAttributeSetsUsed())
        {
            endBitPosition += transitionAttributeSets_.bitSizeOf(endBitPosition);
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
        if (isRoadRangeAttributeMapsUsed())
        {
            endBitPosition += roadRangeAttributeMaps_.bitSizeOf(zserioContext.getRoadRangeAttributeMaps(), endBitPosition);
        }
        if (isRoadPositionAttributeMapsUsed())
        {
            endBitPosition += roadPositionAttributeMaps_.bitSizeOf(zserioContext.getRoadPositionAttributeMaps(), endBitPosition);
        }
        if (isTransitionAttributeMapsUsed())
        {
            endBitPosition += transitionAttributeMaps_.bitSizeOf(zserioContext.getTransitionAttributeMaps(), endBitPosition);
        }
        if (isRoadRangeAttributeSetsUsed())
        {
            endBitPosition += roadRangeAttributeSets_.bitSizeOf(zserioContext.getRoadRangeAttributeSets(), endBitPosition);
        }
        if (isRoadPositionAttributeSetsUsed())
        {
            endBitPosition += roadPositionAttributeSets_.bitSizeOf(zserioContext.getRoadPositionAttributeSets(), endBitPosition);
        }
        if (isTransitionAttributeSetsUsed())
        {
            endBitPosition += transitionAttributeSets_.bitSizeOf(zserioContext.getTransitionAttributeSets(), endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.rules.metadata.RoadRulesLayerContent getContent()
    {
        return content_;
    }

    public void setContent(nds.rules.metadata.RoadRulesLayerContent content_)
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

    public nds.rules.instantiations.RulesRoadRangeAttributeMapList getRoadRangeAttributeMaps()
    {
        return roadRangeAttributeMaps_;
    }

    public void setRoadRangeAttributeMaps(nds.rules.instantiations.RulesRoadRangeAttributeMapList roadRangeAttributeMaps_)
    {
        this.roadRangeAttributeMaps_ = roadRangeAttributeMaps_;
    }

    public boolean isRoadRangeAttributeMapsUsed()
    {
        return ((getContent().and(nds.rules.metadata.RoadRulesLayerContent.Values.ROAD_RANGE_MAPS)).equals(nds.rules.metadata.RoadRulesLayerContent.Values.ROAD_RANGE_MAPS));
    }

    public boolean isRoadRangeAttributeMapsSet()
    {
        return (roadRangeAttributeMaps_ != null);
    }

    public void resetRoadRangeAttributeMaps()
    {
        this.roadRangeAttributeMaps_ = null;
    }

    public nds.rules.instantiations.RulesRoadPositionAttributeMapList getRoadPositionAttributeMaps()
    {
        return roadPositionAttributeMaps_;
    }

    public void setRoadPositionAttributeMaps(nds.rules.instantiations.RulesRoadPositionAttributeMapList roadPositionAttributeMaps_)
    {
        this.roadPositionAttributeMaps_ = roadPositionAttributeMaps_;
    }

    public boolean isRoadPositionAttributeMapsUsed()
    {
        return ((getContent().and(nds.rules.metadata.RoadRulesLayerContent.Values.ROAD_POSITION_MAPS)).equals(nds.rules.metadata.RoadRulesLayerContent.Values.ROAD_POSITION_MAPS));
    }

    public boolean isRoadPositionAttributeMapsSet()
    {
        return (roadPositionAttributeMaps_ != null);
    }

    public void resetRoadPositionAttributeMaps()
    {
        this.roadPositionAttributeMaps_ = null;
    }

    public nds.rules.instantiations.RulesTransitionAttributeMapList getTransitionAttributeMaps()
    {
        return transitionAttributeMaps_;
    }

    public void setTransitionAttributeMaps(nds.rules.instantiations.RulesTransitionAttributeMapList transitionAttributeMaps_)
    {
        this.transitionAttributeMaps_ = transitionAttributeMaps_;
    }

    public boolean isTransitionAttributeMapsUsed()
    {
        return ((getContent().and(nds.rules.metadata.RoadRulesLayerContent.Values.TRANSITION_MAPS)).equals(nds.rules.metadata.RoadRulesLayerContent.Values.TRANSITION_MAPS));
    }

    public boolean isTransitionAttributeMapsSet()
    {
        return (transitionAttributeMaps_ != null);
    }

    public void resetTransitionAttributeMaps()
    {
        this.transitionAttributeMaps_ = null;
    }

    public nds.rules.instantiations.RulesRoadRangeAttributeSetList getRoadRangeAttributeSets()
    {
        return roadRangeAttributeSets_;
    }

    public void setRoadRangeAttributeSets(nds.rules.instantiations.RulesRoadRangeAttributeSetList roadRangeAttributeSets_)
    {
        this.roadRangeAttributeSets_ = roadRangeAttributeSets_;
    }

    public boolean isRoadRangeAttributeSetsUsed()
    {
        return ((getContent().and(nds.rules.metadata.RoadRulesLayerContent.Values.ROAD_RANGE_SETS)).equals(nds.rules.metadata.RoadRulesLayerContent.Values.ROAD_RANGE_SETS));
    }

    public boolean isRoadRangeAttributeSetsSet()
    {
        return (roadRangeAttributeSets_ != null);
    }

    public void resetRoadRangeAttributeSets()
    {
        this.roadRangeAttributeSets_ = null;
    }

    public nds.rules.instantiations.RulesRoadPositionAttributeSetList getRoadPositionAttributeSets()
    {
        return roadPositionAttributeSets_;
    }

    public void setRoadPositionAttributeSets(nds.rules.instantiations.RulesRoadPositionAttributeSetList roadPositionAttributeSets_)
    {
        this.roadPositionAttributeSets_ = roadPositionAttributeSets_;
    }

    public boolean isRoadPositionAttributeSetsUsed()
    {
        return ((getContent().and(nds.rules.metadata.RoadRulesLayerContent.Values.ROAD_POSITION_SETS)).equals(nds.rules.metadata.RoadRulesLayerContent.Values.ROAD_POSITION_SETS));
    }

    public boolean isRoadPositionAttributeSetsSet()
    {
        return (roadPositionAttributeSets_ != null);
    }

    public void resetRoadPositionAttributeSets()
    {
        this.roadPositionAttributeSets_ = null;
    }

    public nds.rules.instantiations.RulesTransitionAttributeSetList getTransitionAttributeSets()
    {
        return transitionAttributeSets_;
    }

    public void setTransitionAttributeSets(nds.rules.instantiations.RulesTransitionAttributeSetList transitionAttributeSets_)
    {
        this.transitionAttributeSets_ = transitionAttributeSets_;
    }

    public boolean isTransitionAttributeSetsUsed()
    {
        return ((getContent().and(nds.rules.metadata.RoadRulesLayerContent.Values.TRANSITION_SETS)).equals(nds.rules.metadata.RoadRulesLayerContent.Values.TRANSITION_SETS));
    }

    public boolean isTransitionAttributeSetsSet()
    {
        return (transitionAttributeSets_ != null);
    }

    public void resetTransitionAttributeSets()
    {
        this.transitionAttributeSets_ = null;
    }

    public nds.system.types.LayerType funcGetLayerType()
    {
        return (nds.system.types.LayerType)(nds.system.types.LayerType.ATTRIBUTE);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RoadRulesLayer)
        {
            final RoadRulesLayer that = (RoadRulesLayer)obj;

            return
                    ((content_ == null) ? that.content_ == null : content_.equals(that.content_)) &&
                    shift_ == that.shift_ &&
                    ((!isRoadRangeAttributeMapsUsed()) ? !that.isRoadRangeAttributeMapsUsed() :
                        ((roadRangeAttributeMaps_ == null) ? that.roadRangeAttributeMaps_ == null : roadRangeAttributeMaps_.equals(that.roadRangeAttributeMaps_))) &&
                    ((!isRoadPositionAttributeMapsUsed()) ? !that.isRoadPositionAttributeMapsUsed() :
                        ((roadPositionAttributeMaps_ == null) ? that.roadPositionAttributeMaps_ == null : roadPositionAttributeMaps_.equals(that.roadPositionAttributeMaps_))) &&
                    ((!isTransitionAttributeMapsUsed()) ? !that.isTransitionAttributeMapsUsed() :
                        ((transitionAttributeMaps_ == null) ? that.transitionAttributeMaps_ == null : transitionAttributeMaps_.equals(that.transitionAttributeMaps_))) &&
                    ((!isRoadRangeAttributeSetsUsed()) ? !that.isRoadRangeAttributeSetsUsed() :
                        ((roadRangeAttributeSets_ == null) ? that.roadRangeAttributeSets_ == null : roadRangeAttributeSets_.equals(that.roadRangeAttributeSets_))) &&
                    ((!isRoadPositionAttributeSetsUsed()) ? !that.isRoadPositionAttributeSetsUsed() :
                        ((roadPositionAttributeSets_ == null) ? that.roadPositionAttributeSets_ == null : roadPositionAttributeSets_.equals(that.roadPositionAttributeSets_))) &&
                    ((!isTransitionAttributeSetsUsed()) ? !that.isTransitionAttributeSetsUsed() :
                        ((transitionAttributeSets_ == null) ? that.transitionAttributeSets_ == null : transitionAttributeSets_.equals(that.transitionAttributeSets_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, content_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, shift_);
        if (isRoadRangeAttributeMapsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, roadRangeAttributeMaps_);
        if (isRoadPositionAttributeMapsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, roadPositionAttributeMaps_);
        if (isTransitionAttributeMapsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, transitionAttributeMaps_);
        if (isRoadRangeAttributeSetsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, roadRangeAttributeSets_);
        if (isRoadPositionAttributeSetsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, roadPositionAttributeSets_);
        if (isTransitionAttributeSetsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, transitionAttributeSets_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        content_ = new nds.rules.metadata.RoadRulesLayerContent(in);

        shift_ = (byte)in.readBits(5);

        if ((getContent().and(nds.rules.metadata.RoadRulesLayerContent.Values.ROAD_RANGE_MAPS)).equals(nds.rules.metadata.RoadRulesLayerContent.Values.ROAD_RANGE_MAPS))
        {
            roadRangeAttributeMaps_ = new nds.rules.instantiations.RulesRoadRangeAttributeMapList(in, (byte)(getShift()));
        }

        if ((getContent().and(nds.rules.metadata.RoadRulesLayerContent.Values.ROAD_POSITION_MAPS)).equals(nds.rules.metadata.RoadRulesLayerContent.Values.ROAD_POSITION_MAPS))
        {
            roadPositionAttributeMaps_ = new nds.rules.instantiations.RulesRoadPositionAttributeMapList(in, (byte)(getShift()));
        }

        if ((getContent().and(nds.rules.metadata.RoadRulesLayerContent.Values.TRANSITION_MAPS)).equals(nds.rules.metadata.RoadRulesLayerContent.Values.TRANSITION_MAPS))
        {
            transitionAttributeMaps_ = new nds.rules.instantiations.RulesTransitionAttributeMapList(in, (byte)(getShift()));
        }

        if ((getContent().and(nds.rules.metadata.RoadRulesLayerContent.Values.ROAD_RANGE_SETS)).equals(nds.rules.metadata.RoadRulesLayerContent.Values.ROAD_RANGE_SETS))
        {
            roadRangeAttributeSets_ = new nds.rules.instantiations.RulesRoadRangeAttributeSetList(in, (byte)(getShift()));
        }

        if ((getContent().and(nds.rules.metadata.RoadRulesLayerContent.Values.ROAD_POSITION_SETS)).equals(nds.rules.metadata.RoadRulesLayerContent.Values.ROAD_POSITION_SETS))
        {
            roadPositionAttributeSets_ = new nds.rules.instantiations.RulesRoadPositionAttributeSetList(in, (byte)(getShift()));
        }

        if ((getContent().and(nds.rules.metadata.RoadRulesLayerContent.Values.TRANSITION_SETS)).equals(nds.rules.metadata.RoadRulesLayerContent.Values.TRANSITION_SETS))
        {
            transitionAttributeSets_ = new nds.rules.instantiations.RulesTransitionAttributeSetList(in, (byte)(getShift()));
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_ = new nds.rules.metadata.RoadRulesLayerContent(zserioContext.getContent(), in);

        shift_ = ((zserio.runtime.array.ArrayElement.ByteArrayElement)
                zserioContext.getShift().read(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)), in)).get();

        if ((getContent().and(nds.rules.metadata.RoadRulesLayerContent.Values.ROAD_RANGE_MAPS)).equals(nds.rules.metadata.RoadRulesLayerContent.Values.ROAD_RANGE_MAPS))
        {
            roadRangeAttributeMaps_ = new nds.rules.instantiations.RulesRoadRangeAttributeMapList(zserioContext.getRoadRangeAttributeMaps(), in, (byte)(getShift()));
        }

        if ((getContent().and(nds.rules.metadata.RoadRulesLayerContent.Values.ROAD_POSITION_MAPS)).equals(nds.rules.metadata.RoadRulesLayerContent.Values.ROAD_POSITION_MAPS))
        {
            roadPositionAttributeMaps_ = new nds.rules.instantiations.RulesRoadPositionAttributeMapList(zserioContext.getRoadPositionAttributeMaps(), in, (byte)(getShift()));
        }

        if ((getContent().and(nds.rules.metadata.RoadRulesLayerContent.Values.TRANSITION_MAPS)).equals(nds.rules.metadata.RoadRulesLayerContent.Values.TRANSITION_MAPS))
        {
            transitionAttributeMaps_ = new nds.rules.instantiations.RulesTransitionAttributeMapList(zserioContext.getTransitionAttributeMaps(), in, (byte)(getShift()));
        }

        if ((getContent().and(nds.rules.metadata.RoadRulesLayerContent.Values.ROAD_RANGE_SETS)).equals(nds.rules.metadata.RoadRulesLayerContent.Values.ROAD_RANGE_SETS))
        {
            roadRangeAttributeSets_ = new nds.rules.instantiations.RulesRoadRangeAttributeSetList(zserioContext.getRoadRangeAttributeSets(), in, (byte)(getShift()));
        }

        if ((getContent().and(nds.rules.metadata.RoadRulesLayerContent.Values.ROAD_POSITION_SETS)).equals(nds.rules.metadata.RoadRulesLayerContent.Values.ROAD_POSITION_SETS))
        {
            roadPositionAttributeSets_ = new nds.rules.instantiations.RulesRoadPositionAttributeSetList(zserioContext.getRoadPositionAttributeSets(), in, (byte)(getShift()));
        }

        if ((getContent().and(nds.rules.metadata.RoadRulesLayerContent.Values.TRANSITION_SETS)).equals(nds.rules.metadata.RoadRulesLayerContent.Values.TRANSITION_SETS))
        {
            transitionAttributeSets_ = new nds.rules.instantiations.RulesTransitionAttributeSetList(zserioContext.getTransitionAttributeSets(), in, (byte)(getShift()));
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
        if (isRoadRangeAttributeMapsUsed())
        {
            endBitPosition = roadRangeAttributeMaps_.initializeOffsets(endBitPosition);
        }
        if (isRoadPositionAttributeMapsUsed())
        {
            endBitPosition = roadPositionAttributeMaps_.initializeOffsets(endBitPosition);
        }
        if (isTransitionAttributeMapsUsed())
        {
            endBitPosition = transitionAttributeMaps_.initializeOffsets(endBitPosition);
        }
        if (isRoadRangeAttributeSetsUsed())
        {
            endBitPosition = roadRangeAttributeSets_.initializeOffsets(endBitPosition);
        }
        if (isRoadPositionAttributeSetsUsed())
        {
            endBitPosition = roadPositionAttributeSets_.initializeOffsets(endBitPosition);
        }
        if (isTransitionAttributeSetsUsed())
        {
            endBitPosition = transitionAttributeSets_.initializeOffsets(endBitPosition);
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
        if (isRoadRangeAttributeMapsUsed())
        {
            endBitPosition = roadRangeAttributeMaps_.initializeOffsets(zserioContext.getRoadRangeAttributeMaps(), endBitPosition);
        }
        if (isRoadPositionAttributeMapsUsed())
        {
            endBitPosition = roadPositionAttributeMaps_.initializeOffsets(zserioContext.getRoadPositionAttributeMaps(), endBitPosition);
        }
        if (isTransitionAttributeMapsUsed())
        {
            endBitPosition = transitionAttributeMaps_.initializeOffsets(zserioContext.getTransitionAttributeMaps(), endBitPosition);
        }
        if (isRoadRangeAttributeSetsUsed())
        {
            endBitPosition = roadRangeAttributeSets_.initializeOffsets(zserioContext.getRoadRangeAttributeSets(), endBitPosition);
        }
        if (isRoadPositionAttributeSetsUsed())
        {
            endBitPosition = roadPositionAttributeSets_.initializeOffsets(zserioContext.getRoadPositionAttributeSets(), endBitPosition);
        }
        if (isTransitionAttributeSetsUsed())
        {
            endBitPosition = transitionAttributeSets_.initializeOffsets(zserioContext.getTransitionAttributeSets(), endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        content_.write(out);

        out.writeBits(shift_, 5);

        if (isRoadRangeAttributeMapsUsed())
        {
            // check parameters
            if (roadRangeAttributeMaps_.getCoordShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field RoadRulesLayer.roadRangeAttributeMaps: " +
                        roadRangeAttributeMaps_.getCoordShift() + " != " + (byte)(getShift()) + "!");
            }
            roadRangeAttributeMaps_.write(out);
        }

        if (isRoadPositionAttributeMapsUsed())
        {
            // check parameters
            if (roadPositionAttributeMaps_.getCoordShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field RoadRulesLayer.roadPositionAttributeMaps: " +
                        roadPositionAttributeMaps_.getCoordShift() + " != " + (byte)(getShift()) + "!");
            }
            roadPositionAttributeMaps_.write(out);
        }

        if (isTransitionAttributeMapsUsed())
        {
            // check parameters
            if (transitionAttributeMaps_.getCoordShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field RoadRulesLayer.transitionAttributeMaps: " +
                        transitionAttributeMaps_.getCoordShift() + " != " + (byte)(getShift()) + "!");
            }
            transitionAttributeMaps_.write(out);
        }

        if (isRoadRangeAttributeSetsUsed())
        {
            // check parameters
            if (roadRangeAttributeSets_.getCoordShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field RoadRulesLayer.roadRangeAttributeSets: " +
                        roadRangeAttributeSets_.getCoordShift() + " != " + (byte)(getShift()) + "!");
            }
            roadRangeAttributeSets_.write(out);
        }

        if (isRoadPositionAttributeSetsUsed())
        {
            // check parameters
            if (roadPositionAttributeSets_.getCoordShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field RoadRulesLayer.roadPositionAttributeSets: " +
                        roadPositionAttributeSets_.getCoordShift() + " != " + (byte)(getShift()) + "!");
            }
            roadPositionAttributeSets_.write(out);
        }

        if (isTransitionAttributeSetsUsed())
        {
            // check parameters
            if (transitionAttributeSets_.getCoordShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field RoadRulesLayer.transitionAttributeSets: " +
                        transitionAttributeSets_.getCoordShift() + " != " + (byte)(getShift()) + "!");
            }
            transitionAttributeSets_.write(out);
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

        if (isRoadRangeAttributeMapsUsed())
        {
            roadRangeAttributeMaps_.write(zserioContext.getRoadRangeAttributeMaps(), out);
        }

        if (isRoadPositionAttributeMapsUsed())
        {
            roadPositionAttributeMaps_.write(zserioContext.getRoadPositionAttributeMaps(), out);
        }

        if (isTransitionAttributeMapsUsed())
        {
            transitionAttributeMaps_.write(zserioContext.getTransitionAttributeMaps(), out);
        }

        if (isRoadRangeAttributeSetsUsed())
        {
            roadRangeAttributeSets_.write(zserioContext.getRoadRangeAttributeSets(), out);
        }

        if (isRoadPositionAttributeSetsUsed())
        {
            roadPositionAttributeSets_.write(zserioContext.getRoadPositionAttributeSets(), out);
        }

        if (isTransitionAttributeSetsUsed())
        {
            transitionAttributeSets_.write(zserioContext.getTransitionAttributeSets(), out);
        }
    }

    private nds.rules.metadata.RoadRulesLayerContent content_;
    private byte shift_;
    private nds.rules.instantiations.RulesRoadRangeAttributeMapList roadRangeAttributeMaps_;
    private nds.rules.instantiations.RulesRoadPositionAttributeMapList roadPositionAttributeMaps_;
    private nds.rules.instantiations.RulesTransitionAttributeMapList transitionAttributeMaps_;
    private nds.rules.instantiations.RulesRoadRangeAttributeSetList roadRangeAttributeSets_;
    private nds.rules.instantiations.RulesRoadPositionAttributeSetList roadPositionAttributeSets_;
    private nds.rules.instantiations.RulesTransitionAttributeSetList transitionAttributeSets_;
}