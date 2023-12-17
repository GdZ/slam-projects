/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.types;

public class RenderGroupTriangles implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            numberOfTriangles_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getNumberOfTriangles()
        {
            return numberOfTriangles_;
        }

        private zserio.runtime.array.DeltaContext numberOfTriangles_;
    };

    public RenderGroupTriangles(
            nds.core.geometry.PolyMesh3D mesh_,
            nds.display.types.Mesh3DRenderConfiguration config_)
    {
        this.mesh_ = mesh_;
        this.config_ = config_;
    }

    public RenderGroupTriangles(zserio.runtime.io.BitStreamReader in,
            nds.core.geometry.PolyMesh3D mesh_,
            nds.display.types.Mesh3DRenderConfiguration config_)
            throws java.io.IOException
    {
        this.mesh_ = mesh_;
        this.config_ = config_;

        read(in);
    }

    public RenderGroupTriangles(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            nds.core.geometry.PolyMesh3D mesh_,
            nds.display.types.Mesh3DRenderConfiguration config_)
            throws java.io.IOException
    {
        this.mesh_ = mesh_;
        this.config_ = config_;

        read(context, in);
    }

    public RenderGroupTriangles(
            nds.core.geometry.PolyMesh3D mesh_,
            nds.display.types.Mesh3DRenderConfiguration config_,
            short numberOfTriangles_,
            nds.core.geometry.IndexBufferEntry[] vertIndices_)
    {
        this(mesh_, config_);

        setNumberOfTriangles(numberOfTriangles_);
        setVertIndices(vertIndices_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumberOfTriangles().init(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(numberOfTriangles_));
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(numberOfTriangles_);
        endBitPosition += vertIndices_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumberOfTriangles().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(numberOfTriangles_));
        endBitPosition += vertIndices_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.geometry.PolyMesh3D getMesh()
    {
        return this.mesh_;
    }

    public nds.display.types.Mesh3DRenderConfiguration getConfig()
    {
        return this.config_;
    }

    public short getNumberOfTriangles()
    {
        return numberOfTriangles_;
    }

    public void setNumberOfTriangles(short numberOfTriangles_)
    {
        this.numberOfTriangles_ = numberOfTriangles_;
    }

    public nds.core.geometry.IndexBufferEntry[] getVertIndices()
    {
        return (vertIndices_ == null) ? null : vertIndices_.getRawArray();
    }

    public void setVertIndices(nds.core.geometry.IndexBufferEntry[] vertIndices_)
    {
        this.vertIndices_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.geometry.IndexBufferEntry.class, vertIndices_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.geometry.IndexBufferEntry>(new ZserioElementFactory_vertIndices()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    public int funcNumIndicesTriangle()
    {
        return (int)((3 * getNumberOfTriangles()));
    }

    public short funcMaxMeshIndex()
    {
        return (short)(getMesh().getNumPositions());
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RenderGroupTriangles)
        {
            final RenderGroupTriangles that = (RenderGroupTriangles)obj;

            return
                    ((this.mesh_ == null) ? that.mesh_ == null : this.mesh_.equals(that.mesh_)) &&
                    ((this.config_ == null) ? that.config_ == null : this.config_.equals(that.config_)) &&
                    numberOfTriangles_ == that.numberOfTriangles_ &&
                    ((vertIndices_ == null) ? that.vertIndices_ == null : vertIndices_.equals(that.vertIndices_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getMesh());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getConfig());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, numberOfTriangles_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, vertIndices_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        numberOfTriangles_ = in.readVarUInt16();

        vertIndices_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.geometry.IndexBufferEntry.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.geometry.IndexBufferEntry>(new ZserioElementFactory_vertIndices()),
                zserio.runtime.array.ArrayType.NORMAL);
        vertIndices_.read(in, (int)(funcNumIndicesTriangle()));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        numberOfTriangles_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                zserioContext.getNumberOfTriangles().read(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), in)).get();

        vertIndices_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.geometry.IndexBufferEntry.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.geometry.IndexBufferEntry>(new ZserioElementFactory_vertIndices()),
                zserio.runtime.array.ArrayType.NORMAL);
        vertIndices_.readPacked(in, (int)(funcNumIndicesTriangle()));
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(numberOfTriangles_);
        endBitPosition = vertIndices_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumberOfTriangles().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(numberOfTriangles_));
        endBitPosition = vertIndices_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarUInt16(numberOfTriangles_);

        if (vertIndices_.size() != (int)(funcNumIndicesTriangle()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RenderGroupTriangles.vertIndices: " +
                    vertIndices_.size() + " != " + (int)(funcNumIndicesTriangle()) + "!");
        }
        vertIndices_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumberOfTriangles().write(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(numberOfTriangles_));

        if (vertIndices_.size() != (int)(funcNumIndicesTriangle()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RenderGroupTriangles.vertIndices: " +
                    vertIndices_.size() + " != " + (int)(funcNumIndicesTriangle()) + "!");
        }
        vertIndices_.writePacked(out);
    }

    private final class ZserioElementFactory_vertIndices implements zserio.runtime.array.PackableElementFactory<nds.core.geometry.IndexBufferEntry>
    {
        @Override
        public nds.core.geometry.IndexBufferEntry create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.core.geometry.IndexBufferEntry(in, (int)(funcMaxMeshIndex()));
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.core.geometry.IndexBufferEntry.ZserioPackingContext();
        }

        @Override
        public nds.core.geometry.IndexBufferEntry create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.core.geometry.IndexBufferEntry(context, in, (int)(funcMaxMeshIndex()));
        }
    }

    private final nds.core.geometry.PolyMesh3D mesh_;
    private final nds.display.types.Mesh3DRenderConfiguration config_;
    private short numberOfTriangles_;
    private zserio.runtime.array.Array vertIndices_;
}
