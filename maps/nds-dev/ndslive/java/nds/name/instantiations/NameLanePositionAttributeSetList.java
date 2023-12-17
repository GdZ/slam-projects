/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.name.instantiations;

public class NameLanePositionAttributeSetList implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            numAttributeSets_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getNumAttributeSets()
        {
            return numAttributeSets_;
        }

        private zserio.runtime.array.DeltaContext numAttributeSets_;
    };

    public NameLanePositionAttributeSetList(
            byte coordShift_)
    {
        this.coordShift_ = coordShift_;
    }

    public NameLanePositionAttributeSetList(zserio.runtime.io.BitStreamReader in,
            byte coordShift_)
            throws java.io.IOException
    {
        this.coordShift_ = coordShift_;

        read(in);
    }

    public NameLanePositionAttributeSetList(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            byte coordShift_)
            throws java.io.IOException
    {
        this.coordShift_ = coordShift_;

        read(context, in);
    }

    public NameLanePositionAttributeSetList(
            byte coordShift_,
            int numAttributeSets_,
            nds.name.instantiations.NameLanePositionAttributeSetMap[] sets_)
    {
        this(coordShift_);

        setNumAttributeSets(numAttributeSets_);
        setSets(sets_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumAttributeSets().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numAttributeSets_));
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numAttributeSets_);
        endBitPosition += sets_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumAttributeSets().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numAttributeSets_));
        endBitPosition += sets_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public byte getCoordShift()
    {
        return this.coordShift_;
    }

    public int getNumAttributeSets()
    {
        return numAttributeSets_;
    }

    public void setNumAttributeSets(int numAttributeSets_)
    {
        this.numAttributeSets_ = numAttributeSets_;
    }

    public nds.name.instantiations.NameLanePositionAttributeSetMap[] getSets()
    {
        return (sets_ == null) ? null : sets_.getRawArray();
    }

    public void setSets(nds.name.instantiations.NameLanePositionAttributeSetMap[] sets_)
    {
        this.sets_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.name.instantiations.NameLanePositionAttributeSetMap.class, sets_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.name.instantiations.NameLanePositionAttributeSetMap>(new ZserioElementFactory_sets()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof NameLanePositionAttributeSetList)
        {
            final NameLanePositionAttributeSetList that = (NameLanePositionAttributeSetList)obj;

            return
                    this.coordShift_ == that.coordShift_ &&
                    numAttributeSets_ == that.numAttributeSets_ &&
                    ((sets_ == null) ? that.sets_ == null : sets_.equals(that.sets_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getCoordShift());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, numAttributeSets_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, sets_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        numAttributeSets_ = in.readVarSize();

        sets_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.name.instantiations.NameLanePositionAttributeSetMap.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.name.instantiations.NameLanePositionAttributeSetMap>(new ZserioElementFactory_sets()),
                zserio.runtime.array.ArrayType.NORMAL);
        sets_.readPacked(in, (int)(getNumAttributeSets()));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        numAttributeSets_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getNumAttributeSets().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

        sets_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.name.instantiations.NameLanePositionAttributeSetMap.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.name.instantiations.NameLanePositionAttributeSetMap>(new ZserioElementFactory_sets()),
                zserio.runtime.array.ArrayType.NORMAL);
        sets_.readPacked(in, (int)(getNumAttributeSets()));
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numAttributeSets_);
        endBitPosition = sets_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumAttributeSets().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numAttributeSets_));
        endBitPosition = sets_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarSize(numAttributeSets_);

        if (sets_.size() != (int)(getNumAttributeSets()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field NameLanePositionAttributeSetList.sets: " +
                    sets_.size() + " != " + (int)(getNumAttributeSets()) + "!");
        }
        sets_.writePacked(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumAttributeSets().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(numAttributeSets_));

        if (sets_.size() != (int)(getNumAttributeSets()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field NameLanePositionAttributeSetList.sets: " +
                    sets_.size() + " != " + (int)(getNumAttributeSets()) + "!");
        }
        sets_.writePacked(out);
    }

    private final class ZserioElementFactory_sets implements zserio.runtime.array.PackableElementFactory<nds.name.instantiations.NameLanePositionAttributeSetMap>
    {
        @Override
        public nds.name.instantiations.NameLanePositionAttributeSetMap create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.name.instantiations.NameLanePositionAttributeSetMap(in, (byte)(getCoordShift()));
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.name.instantiations.NameLanePositionAttributeSetMap.ZserioPackingContext();
        }

        @Override
        public nds.name.instantiations.NameLanePositionAttributeSetMap create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.name.instantiations.NameLanePositionAttributeSetMap(context, in, (byte)(getCoordShift()));
        }
    }

    private final byte coordShift_;
    private int numAttributeSets_;
    private zserio.runtime.array.Array sets_;
}
