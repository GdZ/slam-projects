/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.localization.instantiations;

public class LandmarkLineGeometryLayer implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            coordShiftXY_ = new zserio.runtime.array.DeltaContext();
            coordShiftZ_ = new zserio.runtime.array.DeltaContext();
            numElements_ = new zserio.runtime.array.DeltaContext();
            buffers_ = new nds.core.geometry.Buffers.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getCoordShiftXY()
        {
            return coordShiftXY_;
        }

        public zserio.runtime.array.DeltaContext getCoordShiftZ()
        {
            return coordShiftZ_;
        }

        public zserio.runtime.array.DeltaContext getNumElements()
        {
            return numElements_;
        }

        public nds.core.geometry.Buffers.ZserioPackingContext getBuffers()
        {
            return buffers_;
        }

        private zserio.runtime.array.DeltaContext coordShiftXY_;
        private zserio.runtime.array.DeltaContext coordShiftZ_;
        private zserio.runtime.array.DeltaContext numElements_;
        private nds.core.geometry.Buffers.ZserioPackingContext buffers_;
    };

    public LandmarkLineGeometryLayer(
            nds.core.geometry.GeometryLayerType type_,
            boolean hasIds_,
            boolean hasTypes_)
    {
        this.type_ = type_;
        this.hasIds_ = hasIds_;
        this.hasTypes_ = hasTypes_;
    }

    public LandmarkLineGeometryLayer(zserio.runtime.io.BitStreamReader in,
            nds.core.geometry.GeometryLayerType type_,
            boolean hasIds_,
            boolean hasTypes_)
            throws java.io.IOException
    {
        this.type_ = type_;
        this.hasIds_ = hasIds_;
        this.hasTypes_ = hasTypes_;

        read(in);
    }

    public LandmarkLineGeometryLayer(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            nds.core.geometry.GeometryLayerType type_,
            boolean hasIds_,
            boolean hasTypes_)
            throws java.io.IOException
    {
        this.type_ = type_;
        this.hasIds_ = hasIds_;
        this.hasTypes_ = hasTypes_;

        read(context, in);
    }

    public LandmarkLineGeometryLayer(
            nds.core.geometry.GeometryLayerType type_,
            boolean hasIds_,
            boolean hasTypes_,
            byte coordShiftXY_,
            byte coordShiftZ_,
            int numElements_,
            int[] identifier_,
            nds.localization.types.LandmarkLine[] types_,
            nds.core.geometry.Buffers buffers_)
    {
        this(type_, hasIds_, hasTypes_);

        setCoordShiftXY(coordShiftXY_);
        setCoordShiftZ(coordShiftZ_);
        setNumElements(numElements_);
        setIdentifier(identifier_);
        setTypes(types_);
        setBuffers(buffers_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getCoordShiftXY().init(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(coordShiftXY_));
        zserioContext.getCoordShiftZ().init(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(coordShiftZ_));
        zserioContext.getNumElements().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numElements_));
        buffers_.initPackingContext(zserioContext.getBuffers());
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
        endBitPosition += 5;
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numElements_);
        if (isIdentifierUsed())
        {
            endBitPosition += identifier_.bitSizeOfPacked(endBitPosition);
        }
        if (isTypesUsed())
        {
            endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
            endBitPosition += types_.bitSizeOfPacked(endBitPosition);
        }
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += buffers_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getCoordShiftXY().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(coordShiftXY_));
        endBitPosition += zserioContext.getCoordShiftZ().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(coordShiftZ_));
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
            endBitPosition += types_.bitSizeOfPacked(endBitPosition);
        }
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += buffers_.bitSizeOf(zserioContext.getBuffers(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.geometry.GeometryLayerType getType()
    {
        return this.type_;
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

    public byte getCoordShiftZ()
    {
        return coordShiftZ_;
    }

    public void setCoordShiftZ(byte coordShiftZ_)
    {
        this.coordShiftZ_ = coordShiftZ_;
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

    public nds.localization.types.LandmarkLine[] getTypes()
    {
        return (types_ == null) ? null : types_.getRawArray();
    }

    public void setTypes(nds.localization.types.LandmarkLine[] types_)
    {
        if (types_ == null)
        {
            this.types_ = null;
        }
        else
        {
            this.types_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.localization.types.LandmarkLine.class, types_),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.localization.types.LandmarkLine>(new ZserioElementFactory_types()),
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

    public nds.core.geometry.Buffers getBuffers()
    {
        return buffers_;
    }

    public void setBuffers(nds.core.geometry.Buffers buffers_)
    {
        this.buffers_ = buffers_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof LandmarkLineGeometryLayer)
        {
            final LandmarkLineGeometryLayer that = (LandmarkLineGeometryLayer)obj;

            return
                    ((this.type_ == null) ? that.type_ == null : this.type_.getValue() == that.type_.getValue()) &&
                    this.hasIds_ == that.hasIds_ &&
                    this.hasTypes_ == that.hasTypes_ &&
                    coordShiftXY_ == that.coordShiftXY_ &&
                    coordShiftZ_ == that.coordShiftZ_ &&
                    numElements_ == that.numElements_ &&
                    ((!isIdentifierUsed()) ? !that.isIdentifierUsed() :
                        ((identifier_ == null) ? that.identifier_ == null : identifier_.equals(that.identifier_))) &&
                    ((!isTypesUsed()) ? !that.isTypesUsed() :
                        ((types_ == null) ? that.types_ == null : types_.equals(that.types_))) &&
                    ((buffers_ == null) ? that.buffers_ == null : buffers_.equals(that.buffers_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getType());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getHasIds());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getHasTypes());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, coordShiftXY_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, coordShiftZ_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, numElements_);
        if (isIdentifierUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, identifier_);
        if (isTypesUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, types_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, buffers_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        coordShiftXY_ = (byte)in.readBits(5);

        coordShiftZ_ = (byte)in.readBits(5);

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
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.localization.types.LandmarkLine.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.localization.types.LandmarkLine>(new ZserioElementFactory_types()),
                    zserio.runtime.array.ArrayType.NORMAL);
            types_.readPacked(in, (int)(getNumElements()));
        }

        in.alignTo(8);
        buffers_ = new nds.core.geometry.Buffers(in, getType(), (byte)(getCoordShiftXY()), (byte)(getCoordShiftZ()), (int)(getNumElements()));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        coordShiftXY_ = ((zserio.runtime.array.ArrayElement.ByteArrayElement)
                zserioContext.getCoordShiftXY().read(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)), in)).get();

        coordShiftZ_ = ((zserio.runtime.array.ArrayElement.ByteArrayElement)
                zserioContext.getCoordShiftZ().read(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)), in)).get();

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
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.localization.types.LandmarkLine.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.localization.types.LandmarkLine>(new ZserioElementFactory_types()),
                    zserio.runtime.array.ArrayType.NORMAL);
            types_.readPacked(in, (int)(getNumElements()));
        }

        in.alignTo(8);
        buffers_ = new nds.core.geometry.Buffers(zserioContext.getBuffers(), in, getType(), (byte)(getCoordShiftXY()), (byte)(getCoordShiftZ()), (int)(getNumElements()));
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
        endBitPosition += 5;
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numElements_);
        if (isIdentifierUsed())
        {
            endBitPosition = identifier_.initializeOffsetsPacked(endBitPosition);
        }
        if (isTypesUsed())
        {
            endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
            endBitPosition = types_.initializeOffsetsPacked(endBitPosition);
        }
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition = buffers_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getCoordShiftXY().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(coordShiftXY_));
        endBitPosition += zserioContext.getCoordShiftZ().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(coordShiftZ_));
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
            endBitPosition = types_.initializeOffsetsPacked(endBitPosition);
        }
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition = buffers_.initializeOffsets(zserioContext.getBuffers(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeBits(coordShiftXY_, 5);

        out.writeBits(coordShiftZ_, 5);

        out.alignTo(8);
        out.writeVarSize(numElements_);

        if (isIdentifierUsed())
        {
            if (identifier_.size() != (int)(getNumElements()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong array length for field LandmarkLineGeometryLayer.identifier: " +
                        identifier_.size() + " != " + (int)(getNumElements()) + "!");
            }
            identifier_.writePacked(out);
        }

        if (isTypesUsed())
        {
            out.alignTo(8);
            if (types_.size() != (int)(getNumElements()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong array length for field LandmarkLineGeometryLayer.types: " +
                        types_.size() + " != " + (int)(getNumElements()) + "!");
            }
            types_.writePacked(out);
        }

        out.alignTo(8);
        // check parameters
        if (buffers_.getType() != (getType()))
        {
            throw new zserio.runtime.ZserioError("Write: Inconsistent parameter type for field LandmarkLineGeometryLayer.buffers!");
        }
        if (buffers_.getShiftXY() != (byte)(getCoordShiftXY()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter shiftXY for field LandmarkLineGeometryLayer.buffers: " +
                    buffers_.getShiftXY() + " != " + (byte)(getCoordShiftXY()) + "!");
        }
        if (buffers_.getShiftZ() != (byte)(getCoordShiftZ()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter shiftZ for field LandmarkLineGeometryLayer.buffers: " +
                    buffers_.getShiftZ() + " != " + (byte)(getCoordShiftZ()) + "!");
        }
        if (buffers_.getNumElements() != (int)(getNumElements()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter numElements for field LandmarkLineGeometryLayer.buffers: " +
                    buffers_.getNumElements() + " != " + (int)(getNumElements()) + "!");
        }
        buffers_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getCoordShiftXY().write(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)), out,
                new zserio.runtime.array.ArrayElement.ByteArrayElement(coordShiftXY_));

        zserioContext.getCoordShiftZ().write(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)), out,
                new zserio.runtime.array.ArrayElement.ByteArrayElement(coordShiftZ_));

        out.alignTo(8);
        zserioContext.getNumElements().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(numElements_));

        if (isIdentifierUsed())
        {
            if (identifier_.size() != (int)(getNumElements()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong array length for field LandmarkLineGeometryLayer.identifier: " +
                        identifier_.size() + " != " + (int)(getNumElements()) + "!");
            }
            identifier_.writePacked(out);
        }

        if (isTypesUsed())
        {
            out.alignTo(8);
            if (types_.size() != (int)(getNumElements()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong array length for field LandmarkLineGeometryLayer.types: " +
                        types_.size() + " != " + (int)(getNumElements()) + "!");
            }
            types_.writePacked(out);
        }

        out.alignTo(8);
        buffers_.write(zserioContext.getBuffers(), out);
    }

    private static final class ZserioElementFactory_types implements zserio.runtime.array.PackableElementFactory<nds.localization.types.LandmarkLine>
    {
        @Override
        public nds.localization.types.LandmarkLine create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.localization.types.LandmarkLine(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.localization.types.LandmarkLine.ZserioPackingContext();
        }

        @Override
        public nds.localization.types.LandmarkLine create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.localization.types.LandmarkLine(context, in);
        }
    }

    private final nds.core.geometry.GeometryLayerType type_;
    private final boolean hasIds_;
    private final boolean hasTypes_;
    private byte coordShiftXY_;
    private byte coordShiftZ_;
    private int numElements_;
    private zserio.runtime.array.Array identifier_;
    private zserio.runtime.array.Array types_;
    private nds.core.geometry.Buffers buffers_;
}
