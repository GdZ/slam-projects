/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.instantiations;

public class HeightMapGridLayer implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            coordShiftXY_ = new zserio.runtime.array.DeltaContext();
            cellSize_ = new zserio.runtime.array.DeltaContext();
            numElements_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getCoordShiftXY()
        {
            return coordShiftXY_;
        }

        public zserio.runtime.array.DeltaContext getCellSize()
        {
            return cellSize_;
        }

        public zserio.runtime.array.DeltaContext getNumElements()
        {
            return numElements_;
        }

        private zserio.runtime.array.DeltaContext coordShiftXY_;
        private zserio.runtime.array.DeltaContext cellSize_;
        private zserio.runtime.array.DeltaContext numElements_;
    };

    public HeightMapGridLayer(
            boolean hasIds_,
            boolean hasTypes_)
    {
        this.hasIds_ = hasIds_;
        this.hasTypes_ = hasTypes_;
    }

    public HeightMapGridLayer(zserio.runtime.io.BitStreamReader in,
            boolean hasIds_,
            boolean hasTypes_)
            throws java.io.IOException
    {
        this.hasIds_ = hasIds_;
        this.hasTypes_ = hasTypes_;

        read(in);
    }

    public HeightMapGridLayer(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            boolean hasIds_,
            boolean hasTypes_)
            throws java.io.IOException
    {
        this.hasIds_ = hasIds_;
        this.hasTypes_ = hasTypes_;

        read(context, in);
    }

    public HeightMapGridLayer(
            boolean hasIds_,
            boolean hasTypes_,
            byte coordShiftXY_,
            int cellSize_,
            int numElements_,
            int[] identifier_,
            nds.core.types.Empty[] types_,
            nds.core.grid.Grid_varint32[] grids_)
    {
        this(hasIds_, hasTypes_);

        setCoordShiftXY(coordShiftXY_);
        setCellSize(cellSize_);
        setNumElements(numElements_);
        setIdentifier(identifier_);
        setTypes(types_);
        setGrids(grids_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getCoordShiftXY().init(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(coordShiftXY_));
        zserioContext.getCellSize().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(cellSize_));
        zserioContext.getNumElements().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numElements_));
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

        endBitPosition += 5;
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(cellSize_);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numElements_);
        if (isIdentifierUsed())
        {
            endBitPosition += identifier_.bitSizeOfPacked(endBitPosition);
        }
        if (isTypesUsed())
        {
            endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
            endBitPosition += types_.bitSizeOf(endBitPosition);
        }
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += grids_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getCoordShiftXY().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(coordShiftXY_));
        endBitPosition += zserioContext.getCellSize().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(cellSize_));
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += zserioContext.getNumElements().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numElements_));
        if (isIdentifierUsed())
        {
            endBitPosition += identifier_.bitSizeOfPacked(endBitPosition);
        }
        if (isTypesUsed())
        {
            endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
            endBitPosition += types_.bitSizeOf(endBitPosition);
        }
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += grids_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public boolean getHasIds()
    {
        return this.hasIds_;
    }

    public boolean getHasTypes()
    {
        return this.hasTypes_;
    }

    public byte getCoordShiftXY()
    {
        return coordShiftXY_;
    }

    public void setCoordShiftXY(byte coordShiftXY_)
    {
        this.coordShiftXY_ = coordShiftXY_;
    }

    public int getCellSize()
    {
        return cellSize_;
    }

    public void setCellSize(int cellSize_)
    {
        this.cellSize_ = cellSize_;
    }

    public int getNumElements()
    {
        return numElements_;
    }

    public void setNumElements(int numElements_)
    {
        this.numElements_ = numElements_;
    }

    public int[] getIdentifier()
    {
        return (identifier_ == null) ? null : identifier_.getRawArray();
    }

    public void setIdentifier(int[] identifier_)
    {
        if (identifier_ == null)
        {
            this.identifier_ = null;
        }
        else
        {
            this.identifier_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.IntRawArray(identifier_),
                    new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                    zserio.runtime.array.ArrayType.NORMAL);
        }
    }

    public boolean isIdentifierUsed()
    {
        return (getHasIds());
    }

    public boolean isIdentifierSet()
    {
        return (identifier_ != null);
    }

    public void resetIdentifier()
    {
        this.identifier_ = null;
    }

    public nds.core.types.Empty[] getTypes()
    {
        return (types_ == null) ? null : types_.getRawArray();
    }

    public void setTypes(nds.core.types.Empty[] types_)
    {
        if (types_ == null)
        {
            this.types_ = null;
        }
        else
        {
            this.types_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Empty.class, types_),
                    new zserio.runtime.array.ArrayTraits.WriteObjectArrayTraits<nds.core.types.Empty>(new ZserioElementFactory_types()),
                    zserio.runtime.array.ArrayType.NORMAL);
        }
    }

    public boolean isTypesUsed()
    {
        return (getHasTypes());
    }

    public boolean isTypesSet()
    {
        return (types_ != null);
    }

    public void resetTypes()
    {
        this.types_ = null;
    }

    public nds.core.grid.Grid_varint32[] getGrids()
    {
        return (grids_ == null) ? null : grids_.getRawArray();
    }

    public void setGrids(nds.core.grid.Grid_varint32[] grids_)
    {
        this.grids_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.grid.Grid_varint32.class, grids_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.grid.Grid_varint32>(new ZserioElementFactory_grids()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof HeightMapGridLayer)
        {
            final HeightMapGridLayer that = (HeightMapGridLayer)obj;

            return
                    this.hasIds_ == that.hasIds_ &&
                    this.hasTypes_ == that.hasTypes_ &&
                    coordShiftXY_ == that.coordShiftXY_ &&
                    cellSize_ == that.cellSize_ &&
                    numElements_ == that.numElements_ &&
                    ((!isIdentifierUsed()) ? !that.isIdentifierUsed() :
                        ((identifier_ == null) ? that.identifier_ == null : identifier_.equals(that.identifier_))) &&
                    ((!isTypesUsed()) ? !that.isTypesUsed() :
                        ((types_ == null) ? that.types_ == null : types_.equals(that.types_))) &&
                    ((grids_ == null) ? that.grids_ == null : grids_.equals(that.grids_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getHasIds());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getHasTypes());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, coordShiftXY_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, cellSize_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, numElements_);
        if (isIdentifierUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, identifier_);
        if (isTypesUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, types_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, grids_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        coordShiftXY_ = (byte)in.readBits(5);

        cellSize_ = in.readVarSize();

        in.alignTo(8);
        numElements_ = in.readVarSize();

        if (getHasIds())
        {
            identifier_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.IntRawArray(),
                    new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                    zserio.runtime.array.ArrayType.NORMAL);
            identifier_.readPacked(in, (int)(getNumElements()));
        }

        if (getHasTypes())
        {
            in.alignTo(8);
            types_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Empty.class),
                    new zserio.runtime.array.ArrayTraits.WriteObjectArrayTraits<nds.core.types.Empty>(new ZserioElementFactory_types()),
                    zserio.runtime.array.ArrayType.NORMAL);
            types_.read(in, (int)(getNumElements()));
        }

        in.alignTo(8);
        grids_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.grid.Grid_varint32.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.grid.Grid_varint32>(new ZserioElementFactory_grids()),
                zserio.runtime.array.ArrayType.NORMAL);
        grids_.readPacked(in, (int)(getNumElements()));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        coordShiftXY_ = ((zserio.runtime.array.ArrayElement.ByteArrayElement)
                zserioContext.getCoordShiftXY().read(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)), in)).get();

        cellSize_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getCellSize().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

        in.alignTo(8);
        numElements_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getNumElements().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

        if (getHasIds())
        {
            identifier_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.IntRawArray(),
                    new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                    zserio.runtime.array.ArrayType.NORMAL);
            identifier_.readPacked(in, (int)(getNumElements()));
        }

        if (getHasTypes())
        {
            in.alignTo(8);
            types_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Empty.class),
                    new zserio.runtime.array.ArrayTraits.WriteObjectArrayTraits<nds.core.types.Empty>(new ZserioElementFactory_types()),
                    zserio.runtime.array.ArrayType.NORMAL);
            types_.read(in, (int)(getNumElements()));
        }

        in.alignTo(8);
        grids_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.grid.Grid_varint32.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.grid.Grid_varint32>(new ZserioElementFactory_grids()),
                zserio.runtime.array.ArrayType.NORMAL);
        grids_.readPacked(in, (int)(getNumElements()));
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

        endBitPosition += 5;
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(cellSize_);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numElements_);
        if (isIdentifierUsed())
        {
            endBitPosition = identifier_.initializeOffsetsPacked(endBitPosition);
        }
        if (isTypesUsed())
        {
            endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
            endBitPosition = types_.initializeOffsets(endBitPosition);
        }
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition = grids_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getCoordShiftXY().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(coordShiftXY_));
        endBitPosition += zserioContext.getCellSize().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(cellSize_));
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += zserioContext.getNumElements().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numElements_));
        if (isIdentifierUsed())
        {
            endBitPosition = identifier_.initializeOffsetsPacked(endBitPosition);
        }
        if (isTypesUsed())
        {
            endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
            endBitPosition = types_.initializeOffsets(endBitPosition);
        }
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition = grids_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeBits(coordShiftXY_, 5);

        out.writeVarSize(cellSize_);

        out.alignTo(8);
        out.writeVarSize(numElements_);

        if (isIdentifierUsed())
        {
            if (identifier_.size() != (int)(getNumElements()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong array length for field HeightMapGridLayer.identifier: " +
                        identifier_.size() + " != " + (int)(getNumElements()) + "!");
            }
            identifier_.writePacked(out);
        }

        if (isTypesUsed())
        {
            out.alignTo(8);
            if (types_.size() != (int)(getNumElements()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong array length for field HeightMapGridLayer.types: " +
                        types_.size() + " != " + (int)(getNumElements()) + "!");
            }
            types_.write(out);
        }

        out.alignTo(8);
        if (grids_.size() != (int)(getNumElements()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field HeightMapGridLayer.grids: " +
                    grids_.size() + " != " + (int)(getNumElements()) + "!");
        }
        grids_.writePacked(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getCoordShiftXY().write(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)), out,
                new zserio.runtime.array.ArrayElement.ByteArrayElement(coordShiftXY_));

        zserioContext.getCellSize().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(cellSize_));

        out.alignTo(8);
        zserioContext.getNumElements().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(numElements_));

        if (isIdentifierUsed())
        {
            if (identifier_.size() != (int)(getNumElements()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong array length for field HeightMapGridLayer.identifier: " +
                        identifier_.size() + " != " + (int)(getNumElements()) + "!");
            }
            identifier_.writePacked(out);
        }

        if (isTypesUsed())
        {
            out.alignTo(8);
            if (types_.size() != (int)(getNumElements()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong array length for field HeightMapGridLayer.types: " +
                        types_.size() + " != " + (int)(getNumElements()) + "!");
            }
            types_.write(out);
        }

        out.alignTo(8);
        if (grids_.size() != (int)(getNumElements()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field HeightMapGridLayer.grids: " +
                    grids_.size() + " != " + (int)(getNumElements()) + "!");
        }
        grids_.writePacked(out);
    }

    private static final class ZserioElementFactory_types implements zserio.runtime.array.ElementFactory<nds.core.types.Empty>
    {
        @Override
        public nds.core.types.Empty create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.core.types.Empty(in);
        }
    }

    private final class ZserioElementFactory_grids implements zserio.runtime.array.PackableElementFactory<nds.core.grid.Grid_varint32>
    {
        @Override
        public nds.core.grid.Grid_varint32 create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.core.grid.Grid_varint32(in, (int)(getCellSize()), (byte)(getCoordShiftXY()));
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.core.grid.Grid_varint32.ZserioPackingContext();
        }

        @Override
        public nds.core.grid.Grid_varint32 create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.core.grid.Grid_varint32(context, in, (int)(getCellSize()), (byte)(getCoordShiftXY()));
        }
    }

    private final boolean hasIds_;
    private final boolean hasTypes_;
    private byte coordShiftXY_;
    private int cellSize_;
    private int numElements_;
    private zserio.runtime.array.Array identifier_;
    private zserio.runtime.array.Array types_;
    private zserio.runtime.array.Array grids_;
}
