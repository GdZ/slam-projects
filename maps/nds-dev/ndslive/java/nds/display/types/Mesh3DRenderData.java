/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.types;

public class Mesh3DRenderData implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            mesh3DRenderConfiguration_ = new nds.display.types.Mesh3DRenderConfiguration.ZserioPackingContext();
            startIndexNormals_ = new zserio.runtime.array.DeltaContext();
            startIndexColors_ = new zserio.runtime.array.DeltaContext();
            startIndexTextureCoords_ = new zserio.runtime.array.DeltaContext();
            startIndexTextureCoordsAdditional_ = new zserio.runtime.array.DeltaContext();
        }

        public nds.display.types.Mesh3DRenderConfiguration.ZserioPackingContext getMesh3DRenderConfiguration()
        {
            return mesh3DRenderConfiguration_;
        }

        public zserio.runtime.array.DeltaContext getStartIndexNormals()
        {
            return startIndexNormals_;
        }

        public zserio.runtime.array.DeltaContext getStartIndexColors()
        {
            return startIndexColors_;
        }

        public zserio.runtime.array.DeltaContext getStartIndexTextureCoords()
        {
            return startIndexTextureCoords_;
        }

        public zserio.runtime.array.DeltaContext getStartIndexTextureCoordsAdditional()
        {
            return startIndexTextureCoordsAdditional_;
        }

        private nds.display.types.Mesh3DRenderConfiguration.ZserioPackingContext mesh3DRenderConfiguration_;
        private zserio.runtime.array.DeltaContext startIndexNormals_;
        private zserio.runtime.array.DeltaContext startIndexColors_;
        private zserio.runtime.array.DeltaContext startIndexTextureCoords_;
        private zserio.runtime.array.DeltaContext startIndexTextureCoordsAdditional_;
    };

    public Mesh3DRenderData(
            nds.core.geometry.PolyMesh3D mesh_,
            nds.display.types.Mesh3DRenderLayerHeader header_)
    {
        this.mesh_ = mesh_;
        this.header_ = header_;
    }

    public Mesh3DRenderData(zserio.runtime.io.BitStreamReader in,
            nds.core.geometry.PolyMesh3D mesh_,
            nds.display.types.Mesh3DRenderLayerHeader header_)
            throws java.io.IOException
    {
        this.mesh_ = mesh_;
        this.header_ = header_;

        read(in);
    }

    public Mesh3DRenderData(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            nds.core.geometry.PolyMesh3D mesh_,
            nds.display.types.Mesh3DRenderLayerHeader header_)
            throws java.io.IOException
    {
        this.mesh_ = mesh_;
        this.header_ = header_;

        read(context, in);
    }

    public Mesh3DRenderData(
            nds.core.geometry.PolyMesh3D mesh_,
            nds.display.types.Mesh3DRenderLayerHeader header_,
            nds.display.types.Mesh3DRenderConfiguration mesh3DRenderConfiguration_,
            java.lang.Integer startIndexNormals_,
            java.lang.Integer startIndexColors_,
            java.lang.Integer startIndexTextureCoords_,
            java.lang.Integer startIndexTextureCoordsAdditional_,
            nds.display.types.RenderGroup[] renderGroups_)
    {
        this(mesh_, header_);

        setMesh3DRenderConfiguration(mesh3DRenderConfiguration_);
        setStartIndexNormals(startIndexNormals_);
        setStartIndexColors(startIndexColors_);
        setStartIndexTextureCoords(startIndexTextureCoords_);
        setStartIndexTextureCoordsAdditional(startIndexTextureCoordsAdditional_);
        setRenderGroups(renderGroups_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        mesh3DRenderConfiguration_.initPackingContext(zserioContext.getMesh3DRenderConfiguration());
        if (isStartIndexNormalsUsed())
        {
            zserioContext.getStartIndexNormals().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(startIndexNormals_));
        }
        if (isStartIndexColorsUsed())
        {
            zserioContext.getStartIndexColors().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(startIndexColors_));
        }
        if (isStartIndexTextureCoordsUsed())
        {
            zserioContext.getStartIndexTextureCoords().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(startIndexTextureCoords_));
        }
        if (isStartIndexTextureCoordsAdditionalUsed())
        {
            zserioContext.getStartIndexTextureCoordsAdditional().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(startIndexTextureCoordsAdditional_));
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

        endBitPosition += mesh3DRenderConfiguration_.bitSizeOf(endBitPosition);
        if (isStartIndexNormalsUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(startIndexNormals_);
        }
        if (isStartIndexColorsUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(startIndexColors_);
        }
        if (isStartIndexTextureCoordsUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(startIndexTextureCoords_);
        }
        if (isStartIndexTextureCoordsAdditionalUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(startIndexTextureCoordsAdditional_);
        }
        endBitPosition += renderGroups_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += mesh3DRenderConfiguration_.bitSizeOf(zserioContext.getMesh3DRenderConfiguration(), endBitPosition);
        if (isStartIndexNormalsUsed())
        {
            endBitPosition += zserioContext.getStartIndexNormals().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(startIndexNormals_));
        }
        if (isStartIndexColorsUsed())
        {
            endBitPosition += zserioContext.getStartIndexColors().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(startIndexColors_));
        }
        if (isStartIndexTextureCoordsUsed())
        {
            endBitPosition += zserioContext.getStartIndexTextureCoords().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(startIndexTextureCoords_));
        }
        if (isStartIndexTextureCoordsAdditionalUsed())
        {
            endBitPosition += zserioContext.getStartIndexTextureCoordsAdditional().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(startIndexTextureCoordsAdditional_));
        }
        endBitPosition += renderGroups_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.geometry.PolyMesh3D getMesh()
    {
        return this.mesh_;
    }

    public nds.display.types.Mesh3DRenderLayerHeader getHeader()
    {
        return this.header_;
    }

    public nds.display.types.Mesh3DRenderConfiguration getMesh3DRenderConfiguration()
    {
        return mesh3DRenderConfiguration_;
    }

    public void setMesh3DRenderConfiguration(nds.display.types.Mesh3DRenderConfiguration mesh3DRenderConfiguration_)
    {
        this.mesh3DRenderConfiguration_ = mesh3DRenderConfiguration_;
    }

    public java.lang.Integer getStartIndexNormals()
    {
        return startIndexNormals_;
    }

    public void setStartIndexNormals(java.lang.Integer startIndexNormals_)
    {
        this.startIndexNormals_ = startIndexNormals_;
    }

    public boolean isStartIndexNormalsUsed()
    {
        return (getMesh3DRenderConfiguration().getHasNormals());
    }

    public boolean isStartIndexNormalsSet()
    {
        return (startIndexNormals_ != null);
    }

    public void resetStartIndexNormals()
    {
        this.startIndexNormals_ = null;
    }

    public java.lang.Integer getStartIndexColors()
    {
        return startIndexColors_;
    }

    public void setStartIndexColors(java.lang.Integer startIndexColors_)
    {
        this.startIndexColors_ = startIndexColors_;
    }

    public boolean isStartIndexColorsUsed()
    {
        return (getMesh3DRenderConfiguration().funcUsesColorPerVertex());
    }

    public boolean isStartIndexColorsSet()
    {
        return (startIndexColors_ != null);
    }

    public void resetStartIndexColors()
    {
        this.startIndexColors_ = null;
    }

    public java.lang.Integer getStartIndexTextureCoords()
    {
        return startIndexTextureCoords_;
    }

    public void setStartIndexTextureCoords(java.lang.Integer startIndexTextureCoords_)
    {
        this.startIndexTextureCoords_ = startIndexTextureCoords_;
    }

    public boolean isStartIndexTextureCoordsUsed()
    {
        return (getMesh3DRenderConfiguration().getHasTextureCoords());
    }

    public boolean isStartIndexTextureCoordsSet()
    {
        return (startIndexTextureCoords_ != null);
    }

    public void resetStartIndexTextureCoords()
    {
        this.startIndexTextureCoords_ = null;
    }

    public java.lang.Integer getStartIndexTextureCoordsAdditional()
    {
        return startIndexTextureCoordsAdditional_;
    }

    public void setStartIndexTextureCoordsAdditional(java.lang.Integer startIndexTextureCoordsAdditional_)
    {
        this.startIndexTextureCoordsAdditional_ = startIndexTextureCoordsAdditional_;
    }

    public boolean isStartIndexTextureCoordsAdditionalUsed()
    {
        return (getMesh3DRenderConfiguration().getHasTextureCoordsAdditional());
    }

    public boolean isStartIndexTextureCoordsAdditionalSet()
    {
        return (startIndexTextureCoordsAdditional_ != null);
    }

    public void resetStartIndexTextureCoordsAdditional()
    {
        this.startIndexTextureCoordsAdditional_ = null;
    }

    public nds.display.types.RenderGroup[] getRenderGroups()
    {
        return (renderGroups_ == null) ? null : renderGroups_.getRawArray();
    }

    public void setRenderGroups(nds.display.types.RenderGroup[] renderGroups_)
    {
        this.renderGroups_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.display.types.RenderGroup.class, renderGroups_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.display.types.RenderGroup>(new ZserioElementFactory_renderGroups()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof Mesh3DRenderData)
        {
            final Mesh3DRenderData that = (Mesh3DRenderData)obj;

            return
                    ((this.mesh_ == null) ? that.mesh_ == null : this.mesh_.equals(that.mesh_)) &&
                    ((this.header_ == null) ? that.header_ == null : this.header_.equals(that.header_)) &&
                    ((mesh3DRenderConfiguration_ == null) ? that.mesh3DRenderConfiguration_ == null : mesh3DRenderConfiguration_.equals(that.mesh3DRenderConfiguration_)) &&
                    ((!isStartIndexNormalsUsed()) ? !that.isStartIndexNormalsUsed() :
                        ((startIndexNormals_ == null) ? that.startIndexNormals_ == null : startIndexNormals_.equals(that.startIndexNormals_))) &&
                    ((!isStartIndexColorsUsed()) ? !that.isStartIndexColorsUsed() :
                        ((startIndexColors_ == null) ? that.startIndexColors_ == null : startIndexColors_.equals(that.startIndexColors_))) &&
                    ((!isStartIndexTextureCoordsUsed()) ? !that.isStartIndexTextureCoordsUsed() :
                        ((startIndexTextureCoords_ == null) ? that.startIndexTextureCoords_ == null : startIndexTextureCoords_.equals(that.startIndexTextureCoords_))) &&
                    ((!isStartIndexTextureCoordsAdditionalUsed()) ? !that.isStartIndexTextureCoordsAdditionalUsed() :
                        ((startIndexTextureCoordsAdditional_ == null) ? that.startIndexTextureCoordsAdditional_ == null : startIndexTextureCoordsAdditional_.equals(that.startIndexTextureCoordsAdditional_))) &&
                    ((renderGroups_ == null) ? that.renderGroups_ == null : renderGroups_.equals(that.renderGroups_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getMesh());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getHeader());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, mesh3DRenderConfiguration_);
        if (isStartIndexNormalsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, startIndexNormals_);
        if (isStartIndexColorsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, startIndexColors_);
        if (isStartIndexTextureCoordsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, startIndexTextureCoords_);
        if (isStartIndexTextureCoordsAdditionalUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, startIndexTextureCoordsAdditional_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, renderGroups_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        mesh3DRenderConfiguration_ = new nds.display.types.Mesh3DRenderConfiguration(in, getHeader());

        if (getMesh3DRenderConfiguration().getHasNormals())
        {
            startIndexNormals_ = in.readVarSize();
        }

        if (getMesh3DRenderConfiguration().funcUsesColorPerVertex())
        {
            startIndexColors_ = in.readVarSize();
        }

        if (getMesh3DRenderConfiguration().getHasTextureCoords())
        {
            startIndexTextureCoords_ = in.readVarSize();
        }

        if (getMesh3DRenderConfiguration().getHasTextureCoordsAdditional())
        {
            startIndexTextureCoordsAdditional_ = in.readVarSize();
        }

        renderGroups_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.display.types.RenderGroup.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.display.types.RenderGroup>(new ZserioElementFactory_renderGroups()),
                zserio.runtime.array.ArrayType.AUTO);
        renderGroups_.read(in);

        checkConstraints();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        mesh3DRenderConfiguration_ = new nds.display.types.Mesh3DRenderConfiguration(zserioContext.getMesh3DRenderConfiguration(), in, getHeader());

        if (getMesh3DRenderConfiguration().getHasNormals())
        {
            startIndexNormals_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                    zserioContext.getStartIndexNormals().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();
        }

        if (getMesh3DRenderConfiguration().funcUsesColorPerVertex())
        {
            startIndexColors_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                    zserioContext.getStartIndexColors().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();
        }

        if (getMesh3DRenderConfiguration().getHasTextureCoords())
        {
            startIndexTextureCoords_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                    zserioContext.getStartIndexTextureCoords().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();
        }

        if (getMesh3DRenderConfiguration().getHasTextureCoordsAdditional())
        {
            startIndexTextureCoordsAdditional_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                    zserioContext.getStartIndexTextureCoordsAdditional().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();
        }

        renderGroups_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.display.types.RenderGroup.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.display.types.RenderGroup>(new ZserioElementFactory_renderGroups()),
                zserio.runtime.array.ArrayType.AUTO);
        renderGroups_.readPacked(in);

        checkConstraints();
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

        endBitPosition = mesh3DRenderConfiguration_.initializeOffsets(endBitPosition);
        if (isStartIndexNormalsUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(startIndexNormals_);
        }
        if (isStartIndexColorsUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(startIndexColors_);
        }
        if (isStartIndexTextureCoordsUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(startIndexTextureCoords_);
        }
        if (isStartIndexTextureCoordsAdditionalUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(startIndexTextureCoordsAdditional_);
        }
        endBitPosition = renderGroups_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = mesh3DRenderConfiguration_.initializeOffsets(zserioContext.getMesh3DRenderConfiguration(), endBitPosition);
        if (isStartIndexNormalsUsed())
        {
            endBitPosition += zserioContext.getStartIndexNormals().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(startIndexNormals_));
        }
        if (isStartIndexColorsUsed())
        {
            endBitPosition += zserioContext.getStartIndexColors().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(startIndexColors_));
        }
        if (isStartIndexTextureCoordsUsed())
        {
            endBitPosition += zserioContext.getStartIndexTextureCoords().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(startIndexTextureCoords_));
        }
        if (isStartIndexTextureCoordsAdditionalUsed())
        {
            endBitPosition += zserioContext.getStartIndexTextureCoordsAdditional().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(startIndexTextureCoordsAdditional_));
        }
        endBitPosition = renderGroups_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        checkConstraints();

        // check parameters
        if (mesh3DRenderConfiguration_.getHeader() != (getHeader()))
        {
            throw new zserio.runtime.ZserioError("Write: Inconsistent parameter header for field Mesh3DRenderData.mesh3DRenderConfiguration!");
        }
        mesh3DRenderConfiguration_.write(out);

        if (isStartIndexNormalsUsed())
        {
            out.writeVarSize(startIndexNormals_);
        }

        if (isStartIndexColorsUsed())
        {
            out.writeVarSize(startIndexColors_);
        }

        if (isStartIndexTextureCoordsUsed())
        {
            out.writeVarSize(startIndexTextureCoords_);
        }

        if (isStartIndexTextureCoordsAdditionalUsed())
        {
            out.writeVarSize(startIndexTextureCoordsAdditional_);
        }

        renderGroups_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        checkConstraints();

        mesh3DRenderConfiguration_.write(zserioContext.getMesh3DRenderConfiguration(), out);

        if (isStartIndexNormalsUsed())
        {
            zserioContext.getStartIndexNormals().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.IntArrayElement(startIndexNormals_));
        }

        if (isStartIndexColorsUsed())
        {
            zserioContext.getStartIndexColors().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.IntArrayElement(startIndexColors_));
        }

        if (isStartIndexTextureCoordsUsed())
        {
            zserioContext.getStartIndexTextureCoords().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.IntArrayElement(startIndexTextureCoords_));
        }

        if (isStartIndexTextureCoordsAdditionalUsed())
        {
            zserioContext.getStartIndexTextureCoordsAdditional().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.IntArrayElement(startIndexTextureCoordsAdditional_));
        }

        renderGroups_.writePacked(out);
    }

    private void checkConstraints()
    {
        if (!(getRenderGroups().length > 0))
            throw new zserio.runtime.ConstraintError("Constraint violated at Mesh3DRenderData.renderGroups!");
    }

    private final class ZserioElementFactory_renderGroups implements zserio.runtime.array.PackableElementFactory<nds.display.types.RenderGroup>
    {
        @Override
        public nds.display.types.RenderGroup create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.display.types.RenderGroup(in, getMesh(), getMesh3DRenderConfiguration());
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.display.types.RenderGroup.ZserioPackingContext();
        }

        @Override
        public nds.display.types.RenderGroup create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.display.types.RenderGroup(context, in, getMesh(), getMesh3DRenderConfiguration());
        }
    }

    private final nds.core.geometry.PolyMesh3D mesh_;
    private final nds.display.types.Mesh3DRenderLayerHeader header_;
    private nds.display.types.Mesh3DRenderConfiguration mesh3DRenderConfiguration_;
    private java.lang.Integer startIndexNormals_;
    private java.lang.Integer startIndexColors_;
    private java.lang.Integer startIndexTextureCoords_;
    private java.lang.Integer startIndexTextureCoordsAdditional_;
    private zserio.runtime.array.Array renderGroups_;
}
