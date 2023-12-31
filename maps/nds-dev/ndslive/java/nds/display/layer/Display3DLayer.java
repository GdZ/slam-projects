/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.layer;

public class Display3DLayer implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            header_ = new nds.display.layer.Display3DLayerHeader.ZserioPackingContext();
            geometryLayers_ = new nds.display.layer.Display3DGeometryLayerList.ZserioPackingContext();
        }

        public nds.display.layer.Display3DLayerHeader.ZserioPackingContext getHeader()
        {
            return header_;
        }

        public nds.display.layer.Display3DGeometryLayerList.ZserioPackingContext getGeometryLayers()
        {
            return geometryLayers_;
        }

        private nds.display.layer.Display3DLayerHeader.ZserioPackingContext header_;
        private nds.display.layer.Display3DGeometryLayerList.ZserioPackingContext geometryLayers_;
    };

    public Display3DLayer()
    {
    }

    public Display3DLayer(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public Display3DLayer(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public Display3DLayer(
            nds.display.layer.Display3DLayerHeader header_,
            nds.display.layer.Display3DGeometryLayerList geometryLayers_)
    {
        setHeader(header_);
        setGeometryLayers(geometryLayers_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        header_.initPackingContext(zserioContext.getHeader());
        geometryLayers_.initPackingContext(zserioContext.getGeometryLayers());
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

        endBitPosition += header_.bitSizeOf(endBitPosition);
        endBitPosition += geometryLayers_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += header_.bitSizeOf(zserioContext.getHeader(), endBitPosition);
        endBitPosition += geometryLayers_.bitSizeOf(zserioContext.getGeometryLayers(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.display.layer.Display3DLayerHeader getHeader()
    {
        return header_;
    }

    public void setHeader(nds.display.layer.Display3DLayerHeader header_)
    {
        this.header_ = header_;
    }

    public nds.display.layer.Display3DGeometryLayerList getGeometryLayers()
    {
        return geometryLayers_;
    }

    public void setGeometryLayers(nds.display.layer.Display3DGeometryLayerList geometryLayers_)
    {
        this.geometryLayers_ = geometryLayers_;
    }

    public nds.system.types.LayerType funcGetLayerType()
    {
        return (nds.system.types.LayerType)(nds.system.types.LayerType.FEATURE);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof Display3DLayer)
        {
            final Display3DLayer that = (Display3DLayer)obj;

            return
                    ((header_ == null) ? that.header_ == null : header_.equals(that.header_)) &&
                    ((geometryLayers_ == null) ? that.geometryLayers_ == null : geometryLayers_.equals(that.geometryLayers_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, header_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, geometryLayers_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        header_ = new nds.display.layer.Display3DLayerHeader(in);

        geometryLayers_ = new nds.display.layer.Display3DGeometryLayerList(in, getHeader().getContent());
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        header_ = new nds.display.layer.Display3DLayerHeader(zserioContext.getHeader(), in);

        geometryLayers_ = new nds.display.layer.Display3DGeometryLayerList(zserioContext.getGeometryLayers(), in, getHeader().getContent());
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

        endBitPosition = header_.initializeOffsets(endBitPosition);
        endBitPosition = geometryLayers_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = header_.initializeOffsets(zserioContext.getHeader(), endBitPosition);
        endBitPosition = geometryLayers_.initializeOffsets(zserioContext.getGeometryLayers(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        header_.write(out);

        // check parameters
        if (geometryLayers_.getContent() != (getHeader().getContent()))
        {
            throw new zserio.runtime.ZserioError("Write: Inconsistent parameter content for field Display3DLayer.geometryLayers!");
        }
        geometryLayers_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        header_.write(zserioContext.getHeader(), out);

        geometryLayers_.write(zserioContext.getGeometryLayers(), out);
    }

    private nds.display.layer.Display3DLayerHeader header_;
    private nds.display.layer.Display3DGeometryLayerList geometryLayers_;
}
