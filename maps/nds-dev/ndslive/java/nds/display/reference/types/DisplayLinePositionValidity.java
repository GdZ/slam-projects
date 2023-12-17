/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.reference.types;

public class DisplayLinePositionValidity implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            type_ = new zserio.runtime.array.DeltaContext();
            numPositions_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getType()
        {
            return type_;
        }

        public zserio.runtime.array.DeltaContext getNumPositions()
        {
            return numPositions_;
        }

        private zserio.runtime.array.DeltaContext type_;
        private zserio.runtime.array.DeltaContext numPositions_;
    };

    public DisplayLinePositionValidity(
            byte shift_)
    {
        this.shift_ = shift_;
    }

    public DisplayLinePositionValidity(zserio.runtime.io.BitStreamReader in,
            byte shift_)
            throws java.io.IOException
    {
        this.shift_ = shift_;

        read(in);
    }

    public DisplayLinePositionValidity(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            byte shift_)
            throws java.io.IOException
    {
        this.shift_ = shift_;

        read(context, in);
    }

    public DisplayLinePositionValidity(
            byte shift_,
            nds.display.reference.types.DisplayLineValidityType type_,
            java.lang.Integer numPositions_,
            nds.display.reference.types.DisplayLinePositionChoice[] positions_)
    {
        this(shift_);

        setType(type_);
        setNumPositions(numPositions_);
        setPositions(positions_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        type_.initPackingContext(zserioContext.getType());
        if (isNumPositionsUsed())
        {
            zserioContext.getNumPositions().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(numPositions_));
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

        endBitPosition += type_.bitSizeOf(endBitPosition);
        if (isNumPositionsUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numPositions_);
        }
        if (isPositionsUsed())
        {
            endBitPosition += positions_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += type_.bitSizeOf(zserioContext.getType(), endBitPosition);
        if (isNumPositionsUsed())
        {
            endBitPosition += zserioContext.getNumPositions().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(numPositions_));
        }
        if (isPositionsUsed())
        {
            endBitPosition += positions_.bitSizeOfPacked(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public byte getShift()
    {
        return this.shift_;
    }

    public nds.display.reference.types.DisplayLineValidityType getType()
    {
        return type_;
    }

    public void setType(nds.display.reference.types.DisplayLineValidityType type_)
    {
        this.type_ = type_;
    }

    public java.lang.Integer getNumPositions()
    {
        return numPositions_;
    }

    public void setNumPositions(java.lang.Integer numPositions_)
    {
        this.numPositions_ = numPositions_;
    }

    public boolean isNumPositionsUsed()
    {
        return (getType() != nds.display.reference.types.DisplayLineValidityType.COMPLETE);
    }

    public boolean isNumPositionsSet()
    {
        return (numPositions_ != null);
    }

    public void resetNumPositions()
    {
        this.numPositions_ = null;
    }

    public nds.display.reference.types.DisplayLinePositionChoice[] getPositions()
    {
        return (positions_ == null) ? null : positions_.getRawArray();
    }

    public void setPositions(nds.display.reference.types.DisplayLinePositionChoice[] positions_)
    {
        if (positions_ == null)
        {
            this.positions_ = null;
        }
        else
        {
            this.positions_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.display.reference.types.DisplayLinePositionChoice.class, positions_),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.display.reference.types.DisplayLinePositionChoice>(new ZserioElementFactory_positions()),
                    zserio.runtime.array.ArrayType.NORMAL);
        }
    }

    public boolean isPositionsUsed()
    {
        return (getType() != nds.display.reference.types.DisplayLineValidityType.COMPLETE);
    }

    public boolean isPositionsSet()
    {
        return (positions_ != null);
    }

    public void resetPositions()
    {
        this.positions_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof DisplayLinePositionValidity)
        {
            final DisplayLinePositionValidity that = (DisplayLinePositionValidity)obj;

            return
                    this.shift_ == that.shift_ &&
                    ((type_ == null) ? that.type_ == null : type_.getValue() == that.type_.getValue()) &&
                    ((!isNumPositionsUsed()) ? !that.isNumPositionsUsed() :
                        ((numPositions_ == null) ? that.numPositions_ == null : numPositions_.equals(that.numPositions_))) &&
                    ((!isPositionsUsed()) ? !that.isPositionsUsed() :
                        ((positions_ == null) ? that.positions_ == null : positions_.equals(that.positions_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getShift());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, type_);
        if (isNumPositionsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, numPositions_);
        if (isPositionsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, positions_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        type_ = nds.display.reference.types.DisplayLineValidityType.readEnum(in);

        if (getType() != nds.display.reference.types.DisplayLineValidityType.COMPLETE)
        {
            numPositions_ = in.readVarSize();
        }

        if (getType() != nds.display.reference.types.DisplayLineValidityType.COMPLETE)
        {
            positions_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.display.reference.types.DisplayLinePositionChoice.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.display.reference.types.DisplayLinePositionChoice>(new ZserioElementFactory_positions()),
                    zserio.runtime.array.ArrayType.NORMAL);
            positions_.read(in, (int)(getNumPositions()));
        }

        checkConstraints();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        type_ = nds.display.reference.types.DisplayLineValidityType.readEnum(zserioContext.getType(), in);

        if (getType() != nds.display.reference.types.DisplayLineValidityType.COMPLETE)
        {
            numPositions_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                    zserioContext.getNumPositions().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();
        }

        if (getType() != nds.display.reference.types.DisplayLineValidityType.COMPLETE)
        {
            positions_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.display.reference.types.DisplayLinePositionChoice.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.display.reference.types.DisplayLinePositionChoice>(new ZserioElementFactory_positions()),
                    zserio.runtime.array.ArrayType.NORMAL);
            positions_.readPacked(in, (int)(getNumPositions()));
        }

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

        endBitPosition += type_.bitSizeOf(endBitPosition);
        if (isNumPositionsUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numPositions_);
        }
        if (isPositionsUsed())
        {
            endBitPosition = positions_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = type_.initializeOffsets(zserioContext.getType(), endBitPosition);
        if (isNumPositionsUsed())
        {
            endBitPosition += zserioContext.getNumPositions().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(numPositions_));
        }
        if (isPositionsUsed())
        {
            endBitPosition = positions_.initializeOffsetsPacked(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        checkConstraints();

        type_.write(out);

        if (isNumPositionsUsed())
        {
            out.writeVarSize(numPositions_);
        }

        if (isPositionsUsed())
        {
            if (positions_.size() != (int)(getNumPositions()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong array length for field DisplayLinePositionValidity.positions: " +
                        positions_.size() + " != " + (int)(getNumPositions()) + "!");
            }
            positions_.write(out);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        checkConstraints();

        type_.write(zserioContext.getType(), out);

        if (isNumPositionsUsed())
        {
            zserioContext.getNumPositions().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.IntArrayElement(numPositions_));
        }

        if (isPositionsUsed())
        {
            if (positions_.size() != (int)(getNumPositions()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong array length for field DisplayLinePositionValidity.positions: " +
                        positions_.size() + " != " + (int)(getNumPositions()) + "!");
            }
            positions_.writePacked(out);
        }
    }

    private void checkConstraints()
    {
        if (!(getType() != nds.display.reference.types.DisplayLineValidityType.COMPLETE))
            throw new zserio.runtime.ConstraintError("Constraint violated at DisplayLinePositionValidity.type!");
        if (isNumPositionsUsed() && !(getNumPositions() > 0))
            throw new zserio.runtime.ConstraintError("Constraint violated at DisplayLinePositionValidity.numPositions!");
    }

    private final class ZserioElementFactory_positions implements zserio.runtime.array.PackableElementFactory<nds.display.reference.types.DisplayLinePositionChoice>
    {
        @Override
        public nds.display.reference.types.DisplayLinePositionChoice create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.display.reference.types.DisplayLinePositionChoice(in, getType(), (byte)(getShift()));
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.display.reference.types.DisplayLinePositionChoice.ZserioPackingContext();
        }

        @Override
        public nds.display.reference.types.DisplayLinePositionChoice create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.display.reference.types.DisplayLinePositionChoice(context, in, getType(), (byte)(getShift()));
        }
    }

    private final byte shift_;
    private nds.display.reference.types.DisplayLineValidityType type_;
    private java.lang.Integer numPositions_;
    private zserio.runtime.array.Array positions_;
}