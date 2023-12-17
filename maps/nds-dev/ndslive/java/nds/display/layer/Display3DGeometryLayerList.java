/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.layer;

public class Display3DGeometryLayerList implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            mesh3DRenderLayer_ = new nds.display.layer.Mesh3DRenderLayerData.ZserioPackingContext();
        }

        public nds.display.layer.Mesh3DRenderLayerData.ZserioPackingContext getMesh3DRenderLayer()
        {
            return mesh3DRenderLayer_;
        }

        private nds.display.layer.Mesh3DRenderLayerData.ZserioPackingContext mesh3DRenderLayer_;
    };

    public Display3DGeometryLayerList(
            nds.display.metadata.Display3DContent content_)
    {
        this.content_ = content_;
    }

    public Display3DGeometryLayerList(zserio.runtime.io.BitStreamReader in,
            nds.display.metadata.Display3DContent content_)
            throws java.io.IOException
    {
        this.content_ = content_;

        read(in);
    }

    public Display3DGeometryLayerList(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            nds.display.metadata.Display3DContent content_)
            throws java.io.IOException
    {
        this.content_ = content_;

        read(context, in);
    }

    public Display3DGeometryLayerList(
            nds.display.metadata.Display3DContent content_,
            nds.display.layer.Mesh3DRenderLayerData mesh3DRenderLayer_)
    {
        this(content_);

        setMesh3DRenderLayer(mesh3DRenderLayer_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        if (isMesh3DRenderLayerUsed())
        {
            mesh3DRenderLayer_.initPackingContext(zserioContext.getMesh3DRenderLayer());
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

        if (isMesh3DRenderLayerUsed())
        {
            endBitPosition += mesh3DRenderLayer_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        if (isMesh3DRenderLayerUsed())
        {
            endBitPosition += mesh3DRenderLayer_.bitSizeOf(zserioContext.getMesh3DRenderLayer(), endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.display.metadata.Display3DContent getContent()
    {
        return this.content_;
    }

    public nds.display.layer.Mesh3DRenderLayerData getMesh3DRenderLayer()
    {
        return mesh3DRenderLayer_;
    }

    public void setMesh3DRenderLayer(nds.display.layer.Mesh3DRenderLayerData mesh3DRenderLayer_)
    {
        this.mesh3DRenderLayer_ = mesh3DRenderLayer_;
    }

    public boolean isMesh3DRenderLayerUsed()
    {
        return ((getContent().and(nds.display.metadata.Display3DContent.Values.MESH_3D)).equals(nds.display.metadata.Display3DContent.Values.MESH_3D));
    }

    public boolean isMesh3DRenderLayerSet()
    {
        return (mesh3DRenderLayer_ != null);
    }

    public void resetMesh3DRenderLayer()
    {
        this.mesh3DRenderLayer_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof Display3DGeometryLayerList)
        {
            final Display3DGeometryLayerList that = (Display3DGeometryLayerList)obj;

            return
                    ((this.content_ == null) ? that.content_ == null : this.content_.equals(that.content_)) &&
                    ((!isMesh3DRenderLayerUsed()) ? !that.isMesh3DRenderLayerUsed() :
                        ((mesh3DRenderLayer_ == null) ? that.mesh3DRenderLayer_ == null : mesh3DRenderLayer_.equals(that.mesh3DRenderLayer_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getContent());
        if (isMesh3DRenderLayerUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, mesh3DRenderLayer_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        if ((getContent().and(nds.display.metadata.Display3DContent.Values.MESH_3D)).equals(nds.display.metadata.Display3DContent.Values.MESH_3D))
        {
            mesh3DRenderLayer_ = new nds.display.layer.Mesh3DRenderLayerData(in);
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        if ((getContent().and(nds.display.metadata.Display3DContent.Values.MESH_3D)).equals(nds.display.metadata.Display3DContent.Values.MESH_3D))
        {
            mesh3DRenderLayer_ = new nds.display.layer.Mesh3DRenderLayerData(zserioContext.getMesh3DRenderLayer(), in);
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

        if (isMesh3DRenderLayerUsed())
        {
            endBitPosition = mesh3DRenderLayer_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        if (isMesh3DRenderLayerUsed())
        {
            endBitPosition = mesh3DRenderLayer_.initializeOffsets(zserioContext.getMesh3DRenderLayer(), endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        if (isMesh3DRenderLayerUsed())
        {
            mesh3DRenderLayer_.write(out);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        if (isMesh3DRenderLayerUsed())
        {
            mesh3DRenderLayer_.write(zserioContext.getMesh3DRenderLayer(), out);
        }
    }

    private final nds.display.metadata.Display3DContent content_;
    private nds.display.layer.Mesh3DRenderLayerData mesh3DRenderLayer_;
}
