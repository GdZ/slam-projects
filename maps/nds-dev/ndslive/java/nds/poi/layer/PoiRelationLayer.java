/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.poi.layer;

public class PoiRelationLayer implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            content_ = new zserio.runtime.array.DeltaContext();
            poiLanePositionRelationMapList_ = new nds.poi.instantiations.PoiLanePositionRelationMapList.ZserioPackingContext();
            poiLaneIndirectPositionRelationMapList_ = new nds.poi.instantiations.PoiLaneIndirectPositionRelationMapList.ZserioPackingContext();
            poiRoadPositionRelationMapList_ = new nds.poi.instantiations.PoiRoadPositionRelationMapList.ZserioPackingContext();
            poiRoadIndirectPositionRelationMapList_ = new nds.poi.instantiations.PoiRoadIndirectPositionRelationMapList.ZserioPackingContext();
            poiDisplayAreaRelationMapList_ = new nds.poi.instantiations.PoiDisplayAreaRelationMapList.ZserioPackingContext();
            poiRoadLocationPositionRelationMapList_ = new nds.poi.instantiations.PoiRoadLocationPositionRelationMapList.ZserioPackingContext();
            poiDisplayMesh3DRelationMapList_ = new nds.poi.instantiations.PoiDisplayMesh3DRelationMapList.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getContent()
        {
            return content_;
        }

        public nds.poi.instantiations.PoiLanePositionRelationMapList.ZserioPackingContext getPoiLanePositionRelationMapList()
        {
            return poiLanePositionRelationMapList_;
        }

        public nds.poi.instantiations.PoiLaneIndirectPositionRelationMapList.ZserioPackingContext getPoiLaneIndirectPositionRelationMapList()
        {
            return poiLaneIndirectPositionRelationMapList_;
        }

        public nds.poi.instantiations.PoiRoadPositionRelationMapList.ZserioPackingContext getPoiRoadPositionRelationMapList()
        {
            return poiRoadPositionRelationMapList_;
        }

        public nds.poi.instantiations.PoiRoadIndirectPositionRelationMapList.ZserioPackingContext getPoiRoadIndirectPositionRelationMapList()
        {
            return poiRoadIndirectPositionRelationMapList_;
        }

        public nds.poi.instantiations.PoiDisplayAreaRelationMapList.ZserioPackingContext getPoiDisplayAreaRelationMapList()
        {
            return poiDisplayAreaRelationMapList_;
        }

        public nds.poi.instantiations.PoiRoadLocationPositionRelationMapList.ZserioPackingContext getPoiRoadLocationPositionRelationMapList()
        {
            return poiRoadLocationPositionRelationMapList_;
        }

        public nds.poi.instantiations.PoiDisplayMesh3DRelationMapList.ZserioPackingContext getPoiDisplayMesh3DRelationMapList()
        {
            return poiDisplayMesh3DRelationMapList_;
        }

        private zserio.runtime.array.DeltaContext content_;
        private nds.poi.instantiations.PoiLanePositionRelationMapList.ZserioPackingContext poiLanePositionRelationMapList_;
        private nds.poi.instantiations.PoiLaneIndirectPositionRelationMapList.ZserioPackingContext poiLaneIndirectPositionRelationMapList_;
        private nds.poi.instantiations.PoiRoadPositionRelationMapList.ZserioPackingContext poiRoadPositionRelationMapList_;
        private nds.poi.instantiations.PoiRoadIndirectPositionRelationMapList.ZserioPackingContext poiRoadIndirectPositionRelationMapList_;
        private nds.poi.instantiations.PoiDisplayAreaRelationMapList.ZserioPackingContext poiDisplayAreaRelationMapList_;
        private nds.poi.instantiations.PoiRoadLocationPositionRelationMapList.ZserioPackingContext poiRoadLocationPositionRelationMapList_;
        private nds.poi.instantiations.PoiDisplayMesh3DRelationMapList.ZserioPackingContext poiDisplayMesh3DRelationMapList_;
    };

    public PoiRelationLayer()
    {
    }

    public PoiRelationLayer(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public PoiRelationLayer(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public PoiRelationLayer(
            nds.poi.metadata.PoiRelationLayerContent content_,
            nds.poi.instantiations.PoiLanePositionRelationMapList poiLanePositionRelationMapList_,
            nds.poi.instantiations.PoiLaneIndirectPositionRelationMapList poiLaneIndirectPositionRelationMapList_,
            nds.poi.instantiations.PoiRoadPositionRelationMapList poiRoadPositionRelationMapList_,
            nds.poi.instantiations.PoiRoadIndirectPositionRelationMapList poiRoadIndirectPositionRelationMapList_,
            nds.poi.instantiations.PoiDisplayAreaRelationMapList poiDisplayAreaRelationMapList_,
            nds.poi.instantiations.PoiRoadLocationPositionRelationMapList poiRoadLocationPositionRelationMapList_,
            nds.poi.instantiations.PoiDisplayMesh3DRelationMapList poiDisplayMesh3DRelationMapList_)
    {
        setContent(content_);
        setPoiLanePositionRelationMapList(poiLanePositionRelationMapList_);
        setPoiLaneIndirectPositionRelationMapList(poiLaneIndirectPositionRelationMapList_);
        setPoiRoadPositionRelationMapList(poiRoadPositionRelationMapList_);
        setPoiRoadIndirectPositionRelationMapList(poiRoadIndirectPositionRelationMapList_);
        setPoiDisplayAreaRelationMapList(poiDisplayAreaRelationMapList_);
        setPoiRoadLocationPositionRelationMapList(poiRoadLocationPositionRelationMapList_);
        setPoiDisplayMesh3DRelationMapList(poiDisplayMesh3DRelationMapList_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.initPackingContext(zserioContext.getContent());
        if (isPoiLanePositionRelationMapListUsed())
        {
            poiLanePositionRelationMapList_.initPackingContext(zserioContext.getPoiLanePositionRelationMapList());
        }
        if (isPoiLaneIndirectPositionRelationMapListUsed())
        {
            poiLaneIndirectPositionRelationMapList_.initPackingContext(zserioContext.getPoiLaneIndirectPositionRelationMapList());
        }
        if (isPoiRoadPositionRelationMapListUsed())
        {
            poiRoadPositionRelationMapList_.initPackingContext(zserioContext.getPoiRoadPositionRelationMapList());
        }
        if (isPoiRoadIndirectPositionRelationMapListUsed())
        {
            poiRoadIndirectPositionRelationMapList_.initPackingContext(zserioContext.getPoiRoadIndirectPositionRelationMapList());
        }
        if (isPoiDisplayAreaRelationMapListUsed())
        {
            poiDisplayAreaRelationMapList_.initPackingContext(zserioContext.getPoiDisplayAreaRelationMapList());
        }
        if (isPoiRoadLocationPositionRelationMapListUsed())
        {
            poiRoadLocationPositionRelationMapList_.initPackingContext(zserioContext.getPoiRoadLocationPositionRelationMapList());
        }
        if (isPoiDisplayMesh3DRelationMapListUsed())
        {
            poiDisplayMesh3DRelationMapList_.initPackingContext(zserioContext.getPoiDisplayMesh3DRelationMapList());
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
        if (isPoiLanePositionRelationMapListUsed())
        {
            endBitPosition += poiLanePositionRelationMapList_.bitSizeOf(endBitPosition);
        }
        if (isPoiLaneIndirectPositionRelationMapListUsed())
        {
            endBitPosition += poiLaneIndirectPositionRelationMapList_.bitSizeOf(endBitPosition);
        }
        if (isPoiRoadPositionRelationMapListUsed())
        {
            endBitPosition += poiRoadPositionRelationMapList_.bitSizeOf(endBitPosition);
        }
        if (isPoiRoadIndirectPositionRelationMapListUsed())
        {
            endBitPosition += poiRoadIndirectPositionRelationMapList_.bitSizeOf(endBitPosition);
        }
        if (isPoiDisplayAreaRelationMapListUsed())
        {
            endBitPosition += poiDisplayAreaRelationMapList_.bitSizeOf(endBitPosition);
        }
        if (isPoiRoadLocationPositionRelationMapListUsed())
        {
            endBitPosition += poiRoadLocationPositionRelationMapList_.bitSizeOf(endBitPosition);
        }
        if (isPoiDisplayMesh3DRelationMapListUsed())
        {
            endBitPosition += poiDisplayMesh3DRelationMapList_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += content_.bitSizeOf(zserioContext.getContent(), endBitPosition);
        if (isPoiLanePositionRelationMapListUsed())
        {
            endBitPosition += poiLanePositionRelationMapList_.bitSizeOf(zserioContext.getPoiLanePositionRelationMapList(), endBitPosition);
        }
        if (isPoiLaneIndirectPositionRelationMapListUsed())
        {
            endBitPosition += poiLaneIndirectPositionRelationMapList_.bitSizeOf(zserioContext.getPoiLaneIndirectPositionRelationMapList(), endBitPosition);
        }
        if (isPoiRoadPositionRelationMapListUsed())
        {
            endBitPosition += poiRoadPositionRelationMapList_.bitSizeOf(zserioContext.getPoiRoadPositionRelationMapList(), endBitPosition);
        }
        if (isPoiRoadIndirectPositionRelationMapListUsed())
        {
            endBitPosition += poiRoadIndirectPositionRelationMapList_.bitSizeOf(zserioContext.getPoiRoadIndirectPositionRelationMapList(), endBitPosition);
        }
        if (isPoiDisplayAreaRelationMapListUsed())
        {
            endBitPosition += poiDisplayAreaRelationMapList_.bitSizeOf(zserioContext.getPoiDisplayAreaRelationMapList(), endBitPosition);
        }
        if (isPoiRoadLocationPositionRelationMapListUsed())
        {
            endBitPosition += poiRoadLocationPositionRelationMapList_.bitSizeOf(zserioContext.getPoiRoadLocationPositionRelationMapList(), endBitPosition);
        }
        if (isPoiDisplayMesh3DRelationMapListUsed())
        {
            endBitPosition += poiDisplayMesh3DRelationMapList_.bitSizeOf(zserioContext.getPoiDisplayMesh3DRelationMapList(), endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.poi.metadata.PoiRelationLayerContent getContent()
    {
        return content_;
    }

    public void setContent(nds.poi.metadata.PoiRelationLayerContent content_)
    {
        this.content_ = content_;
    }

    public nds.poi.instantiations.PoiLanePositionRelationMapList getPoiLanePositionRelationMapList()
    {
        return poiLanePositionRelationMapList_;
    }

    public void setPoiLanePositionRelationMapList(nds.poi.instantiations.PoiLanePositionRelationMapList poiLanePositionRelationMapList_)
    {
        this.poiLanePositionRelationMapList_ = poiLanePositionRelationMapList_;
    }

    public boolean isPoiLanePositionRelationMapListUsed()
    {
        return ((getContent().and(nds.poi.metadata.PoiRelationLayerContent.Values.LANE_POSITION_MAPS)).equals(nds.poi.metadata.PoiRelationLayerContent.Values.LANE_POSITION_MAPS));
    }

    public boolean isPoiLanePositionRelationMapListSet()
    {
        return (poiLanePositionRelationMapList_ != null);
    }

    public void resetPoiLanePositionRelationMapList()
    {
        this.poiLanePositionRelationMapList_ = null;
    }

    public nds.poi.instantiations.PoiLaneIndirectPositionRelationMapList getPoiLaneIndirectPositionRelationMapList()
    {
        return poiLaneIndirectPositionRelationMapList_;
    }

    public void setPoiLaneIndirectPositionRelationMapList(nds.poi.instantiations.PoiLaneIndirectPositionRelationMapList poiLaneIndirectPositionRelationMapList_)
    {
        this.poiLaneIndirectPositionRelationMapList_ = poiLaneIndirectPositionRelationMapList_;
    }

    public boolean isPoiLaneIndirectPositionRelationMapListUsed()
    {
        return ((getContent().and(nds.poi.metadata.PoiRelationLayerContent.Values.LANE_INDIRECT_POSITION_MAPS)).equals(nds.poi.metadata.PoiRelationLayerContent.Values.LANE_INDIRECT_POSITION_MAPS));
    }

    public boolean isPoiLaneIndirectPositionRelationMapListSet()
    {
        return (poiLaneIndirectPositionRelationMapList_ != null);
    }

    public void resetPoiLaneIndirectPositionRelationMapList()
    {
        this.poiLaneIndirectPositionRelationMapList_ = null;
    }

    public nds.poi.instantiations.PoiRoadPositionRelationMapList getPoiRoadPositionRelationMapList()
    {
        return poiRoadPositionRelationMapList_;
    }

    public void setPoiRoadPositionRelationMapList(nds.poi.instantiations.PoiRoadPositionRelationMapList poiRoadPositionRelationMapList_)
    {
        this.poiRoadPositionRelationMapList_ = poiRoadPositionRelationMapList_;
    }

    public boolean isPoiRoadPositionRelationMapListUsed()
    {
        return ((getContent().and(nds.poi.metadata.PoiRelationLayerContent.Values.ROAD_POSITION_MAPS)).equals(nds.poi.metadata.PoiRelationLayerContent.Values.ROAD_POSITION_MAPS));
    }

    public boolean isPoiRoadPositionRelationMapListSet()
    {
        return (poiRoadPositionRelationMapList_ != null);
    }

    public void resetPoiRoadPositionRelationMapList()
    {
        this.poiRoadPositionRelationMapList_ = null;
    }

    public nds.poi.instantiations.PoiRoadIndirectPositionRelationMapList getPoiRoadIndirectPositionRelationMapList()
    {
        return poiRoadIndirectPositionRelationMapList_;
    }

    public void setPoiRoadIndirectPositionRelationMapList(nds.poi.instantiations.PoiRoadIndirectPositionRelationMapList poiRoadIndirectPositionRelationMapList_)
    {
        this.poiRoadIndirectPositionRelationMapList_ = poiRoadIndirectPositionRelationMapList_;
    }

    public boolean isPoiRoadIndirectPositionRelationMapListUsed()
    {
        return ((getContent().and(nds.poi.metadata.PoiRelationLayerContent.Values.ROAD_INDIRECT_POSITION_MAPS)).equals(nds.poi.metadata.PoiRelationLayerContent.Values.ROAD_INDIRECT_POSITION_MAPS));
    }

    public boolean isPoiRoadIndirectPositionRelationMapListSet()
    {
        return (poiRoadIndirectPositionRelationMapList_ != null);
    }

    public void resetPoiRoadIndirectPositionRelationMapList()
    {
        this.poiRoadIndirectPositionRelationMapList_ = null;
    }

    public nds.poi.instantiations.PoiDisplayAreaRelationMapList getPoiDisplayAreaRelationMapList()
    {
        return poiDisplayAreaRelationMapList_;
    }

    public void setPoiDisplayAreaRelationMapList(nds.poi.instantiations.PoiDisplayAreaRelationMapList poiDisplayAreaRelationMapList_)
    {
        this.poiDisplayAreaRelationMapList_ = poiDisplayAreaRelationMapList_;
    }

    public boolean isPoiDisplayAreaRelationMapListUsed()
    {
        return ((getContent().and(nds.poi.metadata.PoiRelationLayerContent.Values.DISPLAY_AREA_MAPS)).equals(nds.poi.metadata.PoiRelationLayerContent.Values.DISPLAY_AREA_MAPS));
    }

    public boolean isPoiDisplayAreaRelationMapListSet()
    {
        return (poiDisplayAreaRelationMapList_ != null);
    }

    public void resetPoiDisplayAreaRelationMapList()
    {
        this.poiDisplayAreaRelationMapList_ = null;
    }

    public nds.poi.instantiations.PoiRoadLocationPositionRelationMapList getPoiRoadLocationPositionRelationMapList()
    {
        return poiRoadLocationPositionRelationMapList_;
    }

    public void setPoiRoadLocationPositionRelationMapList(nds.poi.instantiations.PoiRoadLocationPositionRelationMapList poiRoadLocationPositionRelationMapList_)
    {
        this.poiRoadLocationPositionRelationMapList_ = poiRoadLocationPositionRelationMapList_;
    }

    public boolean isPoiRoadLocationPositionRelationMapListUsed()
    {
        return ((getContent().and(nds.poi.metadata.PoiRelationLayerContent.Values.ROAD_LOCATION_POSITION_MAPS)).equals(nds.poi.metadata.PoiRelationLayerContent.Values.ROAD_LOCATION_POSITION_MAPS));
    }

    public boolean isPoiRoadLocationPositionRelationMapListSet()
    {
        return (poiRoadLocationPositionRelationMapList_ != null);
    }

    public void resetPoiRoadLocationPositionRelationMapList()
    {
        this.poiRoadLocationPositionRelationMapList_ = null;
    }

    public nds.poi.instantiations.PoiDisplayMesh3DRelationMapList getPoiDisplayMesh3DRelationMapList()
    {
        return poiDisplayMesh3DRelationMapList_;
    }

    public void setPoiDisplayMesh3DRelationMapList(nds.poi.instantiations.PoiDisplayMesh3DRelationMapList poiDisplayMesh3DRelationMapList_)
    {
        this.poiDisplayMesh3DRelationMapList_ = poiDisplayMesh3DRelationMapList_;
    }

    public boolean isPoiDisplayMesh3DRelationMapListUsed()
    {
        return ((getContent().and(nds.poi.metadata.PoiRelationLayerContent.Values.DISPLAY_MESH_MAPS)).equals(nds.poi.metadata.PoiRelationLayerContent.Values.DISPLAY_MESH_MAPS));
    }

    public boolean isPoiDisplayMesh3DRelationMapListSet()
    {
        return (poiDisplayMesh3DRelationMapList_ != null);
    }

    public void resetPoiDisplayMesh3DRelationMapList()
    {
        this.poiDisplayMesh3DRelationMapList_ = null;
    }

    public nds.system.types.LayerType funcGetLayerType()
    {
        return (nds.system.types.LayerType)(nds.system.types.LayerType.RELATION);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof PoiRelationLayer)
        {
            final PoiRelationLayer that = (PoiRelationLayer)obj;

            return
                    ((content_ == null) ? that.content_ == null : content_.equals(that.content_)) &&
                    ((!isPoiLanePositionRelationMapListUsed()) ? !that.isPoiLanePositionRelationMapListUsed() :
                        ((poiLanePositionRelationMapList_ == null) ? that.poiLanePositionRelationMapList_ == null : poiLanePositionRelationMapList_.equals(that.poiLanePositionRelationMapList_))) &&
                    ((!isPoiLaneIndirectPositionRelationMapListUsed()) ? !that.isPoiLaneIndirectPositionRelationMapListUsed() :
                        ((poiLaneIndirectPositionRelationMapList_ == null) ? that.poiLaneIndirectPositionRelationMapList_ == null : poiLaneIndirectPositionRelationMapList_.equals(that.poiLaneIndirectPositionRelationMapList_))) &&
                    ((!isPoiRoadPositionRelationMapListUsed()) ? !that.isPoiRoadPositionRelationMapListUsed() :
                        ((poiRoadPositionRelationMapList_ == null) ? that.poiRoadPositionRelationMapList_ == null : poiRoadPositionRelationMapList_.equals(that.poiRoadPositionRelationMapList_))) &&
                    ((!isPoiRoadIndirectPositionRelationMapListUsed()) ? !that.isPoiRoadIndirectPositionRelationMapListUsed() :
                        ((poiRoadIndirectPositionRelationMapList_ == null) ? that.poiRoadIndirectPositionRelationMapList_ == null : poiRoadIndirectPositionRelationMapList_.equals(that.poiRoadIndirectPositionRelationMapList_))) &&
                    ((!isPoiDisplayAreaRelationMapListUsed()) ? !that.isPoiDisplayAreaRelationMapListUsed() :
                        ((poiDisplayAreaRelationMapList_ == null) ? that.poiDisplayAreaRelationMapList_ == null : poiDisplayAreaRelationMapList_.equals(that.poiDisplayAreaRelationMapList_))) &&
                    ((!isPoiRoadLocationPositionRelationMapListUsed()) ? !that.isPoiRoadLocationPositionRelationMapListUsed() :
                        ((poiRoadLocationPositionRelationMapList_ == null) ? that.poiRoadLocationPositionRelationMapList_ == null : poiRoadLocationPositionRelationMapList_.equals(that.poiRoadLocationPositionRelationMapList_))) &&
                    ((!isPoiDisplayMesh3DRelationMapListUsed()) ? !that.isPoiDisplayMesh3DRelationMapListUsed() :
                        ((poiDisplayMesh3DRelationMapList_ == null) ? that.poiDisplayMesh3DRelationMapList_ == null : poiDisplayMesh3DRelationMapList_.equals(that.poiDisplayMesh3DRelationMapList_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, content_);
        if (isPoiLanePositionRelationMapListUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, poiLanePositionRelationMapList_);
        if (isPoiLaneIndirectPositionRelationMapListUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, poiLaneIndirectPositionRelationMapList_);
        if (isPoiRoadPositionRelationMapListUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, poiRoadPositionRelationMapList_);
        if (isPoiRoadIndirectPositionRelationMapListUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, poiRoadIndirectPositionRelationMapList_);
        if (isPoiDisplayAreaRelationMapListUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, poiDisplayAreaRelationMapList_);
        if (isPoiRoadLocationPositionRelationMapListUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, poiRoadLocationPositionRelationMapList_);
        if (isPoiDisplayMesh3DRelationMapListUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, poiDisplayMesh3DRelationMapList_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        content_ = new nds.poi.metadata.PoiRelationLayerContent(in);

        if ((getContent().and(nds.poi.metadata.PoiRelationLayerContent.Values.LANE_POSITION_MAPS)).equals(nds.poi.metadata.PoiRelationLayerContent.Values.LANE_POSITION_MAPS))
        {
            poiLanePositionRelationMapList_ = new nds.poi.instantiations.PoiLanePositionRelationMapList(in, (byte)(0));
        }

        if ((getContent().and(nds.poi.metadata.PoiRelationLayerContent.Values.LANE_INDIRECT_POSITION_MAPS)).equals(nds.poi.metadata.PoiRelationLayerContent.Values.LANE_INDIRECT_POSITION_MAPS))
        {
            poiLaneIndirectPositionRelationMapList_ = new nds.poi.instantiations.PoiLaneIndirectPositionRelationMapList(in, (byte)(0));
        }

        if ((getContent().and(nds.poi.metadata.PoiRelationLayerContent.Values.ROAD_POSITION_MAPS)).equals(nds.poi.metadata.PoiRelationLayerContent.Values.ROAD_POSITION_MAPS))
        {
            poiRoadPositionRelationMapList_ = new nds.poi.instantiations.PoiRoadPositionRelationMapList(in, (byte)(0));
        }

        if ((getContent().and(nds.poi.metadata.PoiRelationLayerContent.Values.ROAD_INDIRECT_POSITION_MAPS)).equals(nds.poi.metadata.PoiRelationLayerContent.Values.ROAD_INDIRECT_POSITION_MAPS))
        {
            poiRoadIndirectPositionRelationMapList_ = new nds.poi.instantiations.PoiRoadIndirectPositionRelationMapList(in, (byte)(0));
        }

        if ((getContent().and(nds.poi.metadata.PoiRelationLayerContent.Values.DISPLAY_AREA_MAPS)).equals(nds.poi.metadata.PoiRelationLayerContent.Values.DISPLAY_AREA_MAPS))
        {
            poiDisplayAreaRelationMapList_ = new nds.poi.instantiations.PoiDisplayAreaRelationMapList(in, (byte)(0));
        }

        if ((getContent().and(nds.poi.metadata.PoiRelationLayerContent.Values.ROAD_LOCATION_POSITION_MAPS)).equals(nds.poi.metadata.PoiRelationLayerContent.Values.ROAD_LOCATION_POSITION_MAPS))
        {
            poiRoadLocationPositionRelationMapList_ = new nds.poi.instantiations.PoiRoadLocationPositionRelationMapList(in, (byte)(0));
        }

        if ((getContent().and(nds.poi.metadata.PoiRelationLayerContent.Values.DISPLAY_MESH_MAPS)).equals(nds.poi.metadata.PoiRelationLayerContent.Values.DISPLAY_MESH_MAPS))
        {
            poiDisplayMesh3DRelationMapList_ = new nds.poi.instantiations.PoiDisplayMesh3DRelationMapList(in, (byte)(0));
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_ = new nds.poi.metadata.PoiRelationLayerContent(zserioContext.getContent(), in);

        if ((getContent().and(nds.poi.metadata.PoiRelationLayerContent.Values.LANE_POSITION_MAPS)).equals(nds.poi.metadata.PoiRelationLayerContent.Values.LANE_POSITION_MAPS))
        {
            poiLanePositionRelationMapList_ = new nds.poi.instantiations.PoiLanePositionRelationMapList(zserioContext.getPoiLanePositionRelationMapList(), in, (byte)(0));
        }

        if ((getContent().and(nds.poi.metadata.PoiRelationLayerContent.Values.LANE_INDIRECT_POSITION_MAPS)).equals(nds.poi.metadata.PoiRelationLayerContent.Values.LANE_INDIRECT_POSITION_MAPS))
        {
            poiLaneIndirectPositionRelationMapList_ = new nds.poi.instantiations.PoiLaneIndirectPositionRelationMapList(zserioContext.getPoiLaneIndirectPositionRelationMapList(), in, (byte)(0));
        }

        if ((getContent().and(nds.poi.metadata.PoiRelationLayerContent.Values.ROAD_POSITION_MAPS)).equals(nds.poi.metadata.PoiRelationLayerContent.Values.ROAD_POSITION_MAPS))
        {
            poiRoadPositionRelationMapList_ = new nds.poi.instantiations.PoiRoadPositionRelationMapList(zserioContext.getPoiRoadPositionRelationMapList(), in, (byte)(0));
        }

        if ((getContent().and(nds.poi.metadata.PoiRelationLayerContent.Values.ROAD_INDIRECT_POSITION_MAPS)).equals(nds.poi.metadata.PoiRelationLayerContent.Values.ROAD_INDIRECT_POSITION_MAPS))
        {
            poiRoadIndirectPositionRelationMapList_ = new nds.poi.instantiations.PoiRoadIndirectPositionRelationMapList(zserioContext.getPoiRoadIndirectPositionRelationMapList(), in, (byte)(0));
        }

        if ((getContent().and(nds.poi.metadata.PoiRelationLayerContent.Values.DISPLAY_AREA_MAPS)).equals(nds.poi.metadata.PoiRelationLayerContent.Values.DISPLAY_AREA_MAPS))
        {
            poiDisplayAreaRelationMapList_ = new nds.poi.instantiations.PoiDisplayAreaRelationMapList(zserioContext.getPoiDisplayAreaRelationMapList(), in, (byte)(0));
        }

        if ((getContent().and(nds.poi.metadata.PoiRelationLayerContent.Values.ROAD_LOCATION_POSITION_MAPS)).equals(nds.poi.metadata.PoiRelationLayerContent.Values.ROAD_LOCATION_POSITION_MAPS))
        {
            poiRoadLocationPositionRelationMapList_ = new nds.poi.instantiations.PoiRoadLocationPositionRelationMapList(zserioContext.getPoiRoadLocationPositionRelationMapList(), in, (byte)(0));
        }

        if ((getContent().and(nds.poi.metadata.PoiRelationLayerContent.Values.DISPLAY_MESH_MAPS)).equals(nds.poi.metadata.PoiRelationLayerContent.Values.DISPLAY_MESH_MAPS))
        {
            poiDisplayMesh3DRelationMapList_ = new nds.poi.instantiations.PoiDisplayMesh3DRelationMapList(zserioContext.getPoiDisplayMesh3DRelationMapList(), in, (byte)(0));
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
        if (isPoiLanePositionRelationMapListUsed())
        {
            endBitPosition = poiLanePositionRelationMapList_.initializeOffsets(endBitPosition);
        }
        if (isPoiLaneIndirectPositionRelationMapListUsed())
        {
            endBitPosition = poiLaneIndirectPositionRelationMapList_.initializeOffsets(endBitPosition);
        }
        if (isPoiRoadPositionRelationMapListUsed())
        {
            endBitPosition = poiRoadPositionRelationMapList_.initializeOffsets(endBitPosition);
        }
        if (isPoiRoadIndirectPositionRelationMapListUsed())
        {
            endBitPosition = poiRoadIndirectPositionRelationMapList_.initializeOffsets(endBitPosition);
        }
        if (isPoiDisplayAreaRelationMapListUsed())
        {
            endBitPosition = poiDisplayAreaRelationMapList_.initializeOffsets(endBitPosition);
        }
        if (isPoiRoadLocationPositionRelationMapListUsed())
        {
            endBitPosition = poiRoadLocationPositionRelationMapList_.initializeOffsets(endBitPosition);
        }
        if (isPoiDisplayMesh3DRelationMapListUsed())
        {
            endBitPosition = poiDisplayMesh3DRelationMapList_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = content_.initializeOffsets(zserioContext.getContent(), endBitPosition);
        if (isPoiLanePositionRelationMapListUsed())
        {
            endBitPosition = poiLanePositionRelationMapList_.initializeOffsets(zserioContext.getPoiLanePositionRelationMapList(), endBitPosition);
        }
        if (isPoiLaneIndirectPositionRelationMapListUsed())
        {
            endBitPosition = poiLaneIndirectPositionRelationMapList_.initializeOffsets(zserioContext.getPoiLaneIndirectPositionRelationMapList(), endBitPosition);
        }
        if (isPoiRoadPositionRelationMapListUsed())
        {
            endBitPosition = poiRoadPositionRelationMapList_.initializeOffsets(zserioContext.getPoiRoadPositionRelationMapList(), endBitPosition);
        }
        if (isPoiRoadIndirectPositionRelationMapListUsed())
        {
            endBitPosition = poiRoadIndirectPositionRelationMapList_.initializeOffsets(zserioContext.getPoiRoadIndirectPositionRelationMapList(), endBitPosition);
        }
        if (isPoiDisplayAreaRelationMapListUsed())
        {
            endBitPosition = poiDisplayAreaRelationMapList_.initializeOffsets(zserioContext.getPoiDisplayAreaRelationMapList(), endBitPosition);
        }
        if (isPoiRoadLocationPositionRelationMapListUsed())
        {
            endBitPosition = poiRoadLocationPositionRelationMapList_.initializeOffsets(zserioContext.getPoiRoadLocationPositionRelationMapList(), endBitPosition);
        }
        if (isPoiDisplayMesh3DRelationMapListUsed())
        {
            endBitPosition = poiDisplayMesh3DRelationMapList_.initializeOffsets(zserioContext.getPoiDisplayMesh3DRelationMapList(), endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        content_.write(out);

        if (isPoiLanePositionRelationMapListUsed())
        {
            // check parameters
            if (poiLanePositionRelationMapList_.getCoordShift() != (byte)(0))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field PoiRelationLayer.poiLanePositionRelationMapList: " +
                        poiLanePositionRelationMapList_.getCoordShift() + " != " + (byte)(0) + "!");
            }
            poiLanePositionRelationMapList_.write(out);
        }

        if (isPoiLaneIndirectPositionRelationMapListUsed())
        {
            // check parameters
            if (poiLaneIndirectPositionRelationMapList_.getCoordShift() != (byte)(0))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field PoiRelationLayer.poiLaneIndirectPositionRelationMapList: " +
                        poiLaneIndirectPositionRelationMapList_.getCoordShift() + " != " + (byte)(0) + "!");
            }
            poiLaneIndirectPositionRelationMapList_.write(out);
        }

        if (isPoiRoadPositionRelationMapListUsed())
        {
            // check parameters
            if (poiRoadPositionRelationMapList_.getCoordShift() != (byte)(0))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field PoiRelationLayer.poiRoadPositionRelationMapList: " +
                        poiRoadPositionRelationMapList_.getCoordShift() + " != " + (byte)(0) + "!");
            }
            poiRoadPositionRelationMapList_.write(out);
        }

        if (isPoiRoadIndirectPositionRelationMapListUsed())
        {
            // check parameters
            if (poiRoadIndirectPositionRelationMapList_.getCoordShift() != (byte)(0))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field PoiRelationLayer.poiRoadIndirectPositionRelationMapList: " +
                        poiRoadIndirectPositionRelationMapList_.getCoordShift() + " != " + (byte)(0) + "!");
            }
            poiRoadIndirectPositionRelationMapList_.write(out);
        }

        if (isPoiDisplayAreaRelationMapListUsed())
        {
            // check parameters
            if (poiDisplayAreaRelationMapList_.getCoordShift() != (byte)(0))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field PoiRelationLayer.poiDisplayAreaRelationMapList: " +
                        poiDisplayAreaRelationMapList_.getCoordShift() + " != " + (byte)(0) + "!");
            }
            poiDisplayAreaRelationMapList_.write(out);
        }

        if (isPoiRoadLocationPositionRelationMapListUsed())
        {
            // check parameters
            if (poiRoadLocationPositionRelationMapList_.getCoordShift() != (byte)(0))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field PoiRelationLayer.poiRoadLocationPositionRelationMapList: " +
                        poiRoadLocationPositionRelationMapList_.getCoordShift() + " != " + (byte)(0) + "!");
            }
            poiRoadLocationPositionRelationMapList_.write(out);
        }

        if (isPoiDisplayMesh3DRelationMapListUsed())
        {
            // check parameters
            if (poiDisplayMesh3DRelationMapList_.getCoordShift() != (byte)(0))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field PoiRelationLayer.poiDisplayMesh3DRelationMapList: " +
                        poiDisplayMesh3DRelationMapList_.getCoordShift() + " != " + (byte)(0) + "!");
            }
            poiDisplayMesh3DRelationMapList_.write(out);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.write(zserioContext.getContent(), out);

        if (isPoiLanePositionRelationMapListUsed())
        {
            poiLanePositionRelationMapList_.write(zserioContext.getPoiLanePositionRelationMapList(), out);
        }

        if (isPoiLaneIndirectPositionRelationMapListUsed())
        {
            poiLaneIndirectPositionRelationMapList_.write(zserioContext.getPoiLaneIndirectPositionRelationMapList(), out);
        }

        if (isPoiRoadPositionRelationMapListUsed())
        {
            poiRoadPositionRelationMapList_.write(zserioContext.getPoiRoadPositionRelationMapList(), out);
        }

        if (isPoiRoadIndirectPositionRelationMapListUsed())
        {
            poiRoadIndirectPositionRelationMapList_.write(zserioContext.getPoiRoadIndirectPositionRelationMapList(), out);
        }

        if (isPoiDisplayAreaRelationMapListUsed())
        {
            poiDisplayAreaRelationMapList_.write(zserioContext.getPoiDisplayAreaRelationMapList(), out);
        }

        if (isPoiRoadLocationPositionRelationMapListUsed())
        {
            poiRoadLocationPositionRelationMapList_.write(zserioContext.getPoiRoadLocationPositionRelationMapList(), out);
        }

        if (isPoiDisplayMesh3DRelationMapListUsed())
        {
            poiDisplayMesh3DRelationMapList_.write(zserioContext.getPoiDisplayMesh3DRelationMapList(), out);
        }
    }

    private nds.poi.metadata.PoiRelationLayerContent content_;
    private nds.poi.instantiations.PoiLanePositionRelationMapList poiLanePositionRelationMapList_;
    private nds.poi.instantiations.PoiLaneIndirectPositionRelationMapList poiLaneIndirectPositionRelationMapList_;
    private nds.poi.instantiations.PoiRoadPositionRelationMapList poiRoadPositionRelationMapList_;
    private nds.poi.instantiations.PoiRoadIndirectPositionRelationMapList poiRoadIndirectPositionRelationMapList_;
    private nds.poi.instantiations.PoiDisplayAreaRelationMapList poiDisplayAreaRelationMapList_;
    private nds.poi.instantiations.PoiRoadLocationPositionRelationMapList poiRoadLocationPositionRelationMapList_;
    private nds.poi.instantiations.PoiDisplayMesh3DRelationMapList poiDisplayMesh3DRelationMapList_;
}
