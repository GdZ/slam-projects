/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.geometry;

public class PolyMesh3D implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            indexType_ = new zserio.runtime.array.DeltaContext();
            startIndex_ = new zserio.runtime.array.DeltaContext();
            numPositions_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getIndexType()
        {
            return indexType_;
        }

        public zserio.runtime.array.DeltaContext getStartIndex()
        {
            return startIndex_;
        }

        public zserio.runtime.array.DeltaContext getNumPositions()
        {
            return numPositions_;
        }

        private zserio.runtime.array.DeltaContext indexType_;
        private zserio.runtime.array.DeltaContext startIndex_;
        private zserio.runtime.array.DeltaContext numPositions_;
    };

    public PolyMesh3D(
            nds.core.geometry.IndexBuffer ib_,
            nds.core.geometry.PolyMesh3DType type_)
    {
        this.ib_ = ib_;
        this.type_ = type_;
    }

    public PolyMesh3D(zserio.runtime.io.BitStreamReader in,
            nds.core.geometry.IndexBuffer ib_,
            nds.core.geometry.PolyMesh3DType type_)
            throws java.io.IOException
    {
        this.ib_ = ib_;
        this.type_ = type_;

        read(in);
    }

    public PolyMesh3D(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            nds.core.geometry.IndexBuffer ib_,
            nds.core.geometry.PolyMesh3DType type_)
            throws java.io.IOException
    {
        this.ib_ = ib_;
        this.type_ = type_;

        read(context, in);
    }

    public PolyMesh3D(
            nds.core.geometry.IndexBuffer ib_,
            nds.core.geometry.PolyMesh3DType type_,
            nds.core.geometry.IndexType indexType_,
            int startIndex_,
            int numPositions_)
    {
        this(ib_, type_);

        setIndexType(indexType_);
        setStartIndex(startIndex_);
        setNumPositions(numPositions_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        indexType_.initPackingContext(zserioContext.getIndexType());
        zserioContext.getStartIndex().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(startIndex_));
        zserioContext.getNumPositions().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numPositions_));
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

        endBitPosition += indexType_.bitSizeOf(endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(startIndex_);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numPositions_);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += indexType_.bitSizeOf(zserioContext.getIndexType(), endBitPosition);
        endBitPosition += zserioContext.getStartIndex().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(startIndex_));
        endBitPosition += zserioContext.getNumPositions().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numPositions_));

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.geometry.IndexBuffer getIb()
    {
        return this.ib_;
    }

    public nds.core.geometry.PolyMesh3DType getType()
    {
        return this.type_;
    }

    public nds.core.geometry.IndexType getIndexType()
    {
        return indexType_;
    }

    public void setIndexType(nds.core.geometry.IndexType indexType_)
    {
        this.indexType_ = indexType_;
    }

    public int getStartIndex()
    {
        return startIndex_;
    }

    public void setStartIndex(int startIndex_)
    {
        this.startIndex_ = startIndex_;
    }

    public int getNumPositions()
    {
        return numPositions_;
    }

    public void setNumPositions(int numPositions_)
    {
        this.numPositions_ = numPositions_;
    }

    public boolean funcIsPlanar()
    {
        return (boolean)(((getType() == nds.core.geometry.PolyMesh3DType.POLYGON)) ? true : false);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof PolyMesh3D)
        {
            final PolyMesh3D that = (PolyMesh3D)obj;

            return
                    ((this.ib_ == null) ? that.ib_ == null : this.ib_.equals(that.ib_)) &&
                    ((this.type_ == null) ? that.type_ == null : this.type_.getValue() == that.type_.getValue()) &&
                    ((indexType_ == null) ? that.indexType_ == null : indexType_.getValue() == that.indexType_.getValue()) &&
                    startIndex_ == that.startIndex_ &&
                    numPositions_ == that.numPositions_;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getIb());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getType());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, indexType_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, startIndex_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, numPositions_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        indexType_ = nds.core.geometry.IndexType.readEnum(in);

        startIndex_ = in.readVarSize();

        numPositions_ = in.readVarSize();

        checkConstraints();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        indexType_ = nds.core.geometry.IndexType.readEnum(zserioContext.getIndexType(), in);

        startIndex_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getStartIndex().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

        numPositions_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getNumPositions().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

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

        endBitPosition += indexType_.bitSizeOf(endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(startIndex_);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numPositions_);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = indexType_.initializeOffsets(zserioContext.getIndexType(), endBitPosition);
        endBitPosition += zserioContext.getStartIndex().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(startIndex_));
        endBitPosition += zserioContext.getNumPositions().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numPositions_));

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        checkConstraints();

        indexType_.write(out);

        out.writeVarSize(startIndex_);

        out.writeVarSize(numPositions_);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        checkConstraints();

        indexType_.write(zserioContext.getIndexType(), out);

        zserioContext.getStartIndex().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(startIndex_));

        zserioContext.getNumPositions().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(numPositions_));
    }

    private void checkConstraints()
    {
        if (!((getStartIndex() + getNumPositions()) <= getIb().getNumEntries()))
            throw new zserio.runtime.ConstraintError("Constraint violated at PolyMesh3D.numPositions!");
    }

    private final nds.core.geometry.IndexBuffer ib_;
    private final nds.core.geometry.PolyMesh3DType type_;
    private nds.core.geometry.IndexType indexType_;
    private int startIndex_;
    private int numPositions_;
}
