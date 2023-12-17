/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.details.layer;

public class Display3dAttributeLayer implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            content_ = new zserio.runtime.array.DeltaContext();
            display3dMeshAttributeMaps_ = new nds.display.details.instantiations.Display3dMeshAttributeMapList.ZserioPackingContext();
            display3dMeshAttributeSets_ = new nds.display.details.instantiations.Display3dMeshAttributeSetList.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getContent()
        {
            return content_;
        }

        public nds.display.details.instantiations.Display3dMeshAttributeMapList.ZserioPackingContext getDisplay3dMeshAttributeMaps()
        {
            return display3dMeshAttributeMaps_;
        }

        public nds.display.details.instantiations.Display3dMeshAttributeSetList.ZserioPackingContext getDisplay3dMeshAttributeSets()
        {
            return display3dMeshAttributeSets_;
        }

        private zserio.runtime.array.DeltaContext content_;
        private nds.display.details.instantiations.Display3dMeshAttributeMapList.ZserioPackingContext display3dMeshAttributeMaps_;
        private nds.display.details.instantiations.Display3dMeshAttributeSetList.ZserioPackingContext display3dMeshAttributeSets_;
    };

    public Display3dAttributeLayer()
    {
    }

    public Display3dAttributeLayer(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public Display3dAttributeLayer(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public Display3dAttributeLayer(
            nds.display.details.metadata.Display3dAttributeLayerContent content_,
            nds.display.details.instantiations.Display3dMeshAttributeMapList display3dMeshAttributeMaps_,
            nds.display.details.instantiations.Display3dMeshAttributeSetList display3dMeshAttributeSets_)
    {
        setContent(content_);
        setDisplay3dMeshAttributeMaps(display3dMeshAttributeMaps_);
        setDisplay3dMeshAttributeSets(display3dMeshAttributeSets_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.initPackingContext(zserioContext.getContent());
        if (isDisplay3dMeshAttributeMapsUsed())
        {
            display3dMeshAttributeMaps_.initPackingContext(zserioContext.getDisplay3dMeshAttributeMaps());
        }
        if (isDisplay3dMeshAttributeSetsUsed())
        {
            display3dMeshAttributeSets_.initPackingContext(zserioContext.getDisplay3dMeshAttributeSets());
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
        if (isDisplay3dMeshAttributeMapsUsed())
        {
            endBitPosition += display3dMeshAttributeMaps_.bitSizeOf(endBitPosition);
        }
        if (isDisplay3dMeshAttributeSetsUsed())
        {
            endBitPosition += display3dMeshAttributeSets_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += content_.bitSizeOf(zserioContext.getContent(), endBitPosition);
        if (isDisplay3dMeshAttributeMapsUsed())
        {
            endBitPosition += display3dMeshAttributeMaps_.bitSizeOf(zserioContext.getDisplay3dMeshAttributeMaps(), endBitPosition);
        }
        if (isDisplay3dMeshAttributeSetsUsed())
        {
            endBitPosition += display3dMeshAttributeSets_.bitSizeOf(zserioContext.getDisplay3dMeshAttributeSets(), endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.display.details.metadata.Display3dAttributeLayerContent getContent()
    {
        return content_;
    }

    public void setContent(nds.display.details.metadata.Display3dAttributeLayerContent content_)
    {
        this.content_ = content_;
    }

    public nds.display.details.instantiations.Display3dMeshAttributeMapList getDisplay3dMeshAttributeMaps()
    {
        return display3dMeshAttributeMaps_;
    }

    public void setDisplay3dMeshAttributeMaps(nds.display.details.instantiations.Display3dMeshAttributeMapList display3dMeshAttributeMaps_)
    {
        this.display3dMeshAttributeMaps_ = display3dMeshAttributeMaps_;
    }

    public boolean isDisplay3dMeshAttributeMapsUsed()
    {
        return ((getContent().and(nds.display.details.metadata.Display3dAttributeLayerContent.Values.DISPLAY_MESH_MAPS)).equals(nds.display.details.metadata.Display3dAttributeLayerContent.Values.DISPLAY_MESH_MAPS));
    }

    public boolean isDisplay3dMeshAttributeMapsSet()
    {
        return (display3dMeshAttributeMaps_ != null);
    }

    public void resetDisplay3dMeshAttributeMaps()
    {
        this.display3dMeshAttributeMaps_ = null;
    }

    public nds.display.details.instantiations.Display3dMeshAttributeSetList getDisplay3dMeshAttributeSets()
    {
        return display3dMeshAttributeSets_;
    }

    public void setDisplay3dMeshAttributeSets(nds.display.details.instantiations.Display3dMeshAttributeSetList display3dMeshAttributeSets_)
    {
        this.display3dMeshAttributeSets_ = display3dMeshAttributeSets_;
    }

    public boolean isDisplay3dMeshAttributeSetsUsed()
    {
        return ((getContent().and(nds.display.details.metadata.Display3dAttributeLayerContent.Values.DISPLAY_MESH_SETS)).equals(nds.display.details.metadata.Display3dAttributeLayerContent.Values.DISPLAY_MESH_SETS));
    }

    public boolean isDisplay3dMeshAttributeSetsSet()
    {
        return (display3dMeshAttributeSets_ != null);
    }

    public void resetDisplay3dMeshAttributeSets()
    {
        this.display3dMeshAttributeSets_ = null;
    }

    public nds.system.types.LayerType funcGetLayerType()
    {
        return (nds.system.types.LayerType)(nds.system.types.LayerType.ATTRIBUTE);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof Display3dAttributeLayer)
        {
            final Display3dAttributeLayer that = (Display3dAttributeLayer)obj;

            return
                    ((content_ == null) ? that.content_ == null : content_.equals(that.content_)) &&
                    ((!isDisplay3dMeshAttributeMapsUsed()) ? !that.isDisplay3dMeshAttributeMapsUsed() :
                        ((display3dMeshAttributeMaps_ == null) ? that.display3dMeshAttributeMaps_ == null : display3dMeshAttributeMaps_.equals(that.display3dMeshAttributeMaps_))) &&
                    ((!isDisplay3dMeshAttributeSetsUsed()) ? !that.isDisplay3dMeshAttributeSetsUsed() :
                        ((display3dMeshAttributeSets_ == null) ? that.display3dMeshAttributeSets_ == null : display3dMeshAttributeSets_.equals(that.display3dMeshAttributeSets_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, content_);
        if (isDisplay3dMeshAttributeMapsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, display3dMeshAttributeMaps_);
        if (isDisplay3dMeshAttributeSetsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, display3dMeshAttributeSets_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        content_ = new nds.display.details.metadata.Display3dAttributeLayerContent(in);

        if ((getContent().and(nds.display.details.metadata.Display3dAttributeLayerContent.Values.DISPLAY_MESH_MAPS)).equals(nds.display.details.metadata.Display3dAttributeLayerContent.Values.DISPLAY_MESH_MAPS))
        {
            display3dMeshAttributeMaps_ = new nds.display.details.instantiations.Display3dMeshAttributeMapList(in, (byte)(0));
        }

        if ((getContent().and(nds.display.details.metadata.Display3dAttributeLayerContent.Values.DISPLAY_MESH_SETS)).equals(nds.display.details.metadata.Display3dAttributeLayerContent.Values.DISPLAY_MESH_SETS))
        {
            display3dMeshAttributeSets_ = new nds.display.details.instantiations.Display3dMeshAttributeSetList(in, (byte)(0));
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_ = new nds.display.details.metadata.Display3dAttributeLayerContent(zserioContext.getContent(), in);

        if ((getContent().and(nds.display.details.metadata.Display3dAttributeLayerContent.Values.DISPLAY_MESH_MAPS)).equals(nds.display.details.metadata.Display3dAttributeLayerContent.Values.DISPLAY_MESH_MAPS))
        {
            display3dMeshAttributeMaps_ = new nds.display.details.instantiations.Display3dMeshAttributeMapList(zserioContext.getDisplay3dMeshAttributeMaps(), in, (byte)(0));
        }

        if ((getContent().and(nds.display.details.metadata.Display3dAttributeLayerContent.Values.DISPLAY_MESH_SETS)).equals(nds.display.details.metadata.Display3dAttributeLayerContent.Values.DISPLAY_MESH_SETS))
        {
            display3dMeshAttributeSets_ = new nds.display.details.instantiations.Display3dMeshAttributeSetList(zserioContext.getDisplay3dMeshAttributeSets(), in, (byte)(0));
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
        if (isDisplay3dMeshAttributeMapsUsed())
        {
            endBitPosition = display3dMeshAttributeMaps_.initializeOffsets(endBitPosition);
        }
        if (isDisplay3dMeshAttributeSetsUsed())
        {
            endBitPosition = display3dMeshAttributeSets_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = content_.initializeOffsets(zserioContext.getContent(), endBitPosition);
        if (isDisplay3dMeshAttributeMapsUsed())
        {
            endBitPosition = display3dMeshAttributeMaps_.initializeOffsets(zserioContext.getDisplay3dMeshAttributeMaps(), endBitPosition);
        }
        if (isDisplay3dMeshAttributeSetsUsed())
        {
            endBitPosition = display3dMeshAttributeSets_.initializeOffsets(zserioContext.getDisplay3dMeshAttributeSets(), endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        content_.write(out);

        if (isDisplay3dMeshAttributeMapsUsed())
        {
            // check parameters
            if (display3dMeshAttributeMaps_.getCoordShift() != (byte)(0))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field Display3dAttributeLayer.display3dMeshAttributeMaps: " +
                        display3dMeshAttributeMaps_.getCoordShift() + " != " + (byte)(0) + "!");
            }
            display3dMeshAttributeMaps_.write(out);
        }

        if (isDisplay3dMeshAttributeSetsUsed())
        {
            // check parameters
            if (display3dMeshAttributeSets_.getCoordShift() != (byte)(0))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field Display3dAttributeLayer.display3dMeshAttributeSets: " +
                        display3dMeshAttributeSets_.getCoordShift() + " != " + (byte)(0) + "!");
            }
            display3dMeshAttributeSets_.write(out);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.write(zserioContext.getContent(), out);

        if (isDisplay3dMeshAttributeMapsUsed())
        {
            display3dMeshAttributeMaps_.write(zserioContext.getDisplay3dMeshAttributeMaps(), out);
        }

        if (isDisplay3dMeshAttributeSetsUsed())
        {
            display3dMeshAttributeSets_.write(zserioContext.getDisplay3dMeshAttributeSets(), out);
        }
    }

    private nds.display.details.metadata.Display3dAttributeLayerContent content_;
    private nds.display.details.instantiations.Display3dMeshAttributeMapList display3dMeshAttributeMaps_;
    private nds.display.details.instantiations.Display3dMeshAttributeSetList display3dMeshAttributeSets_;
}
