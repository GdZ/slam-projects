/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.venue.details.instantiations;

public class ParkingLevelAttributeSetList implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
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

    public ParkingLevelAttributeSetList(
            byte coordShift_)
    {
        this.coordShift_ = coordShift_;
    }

    public ParkingLevelAttributeSetList(zserio.runtime.io.BitStreamReader in,
            byte coordShift_)
            throws java.io.IOException
    {
        this.coordShift_ = coordShift_;

        read(in);
    }

    public ParkingLevelAttributeSetList(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            byte coordShift_)
            throws java.io.IOException
    {
        this.coordShift_ = coordShift_;

        read(context, in);
    }

    public ParkingLevelAttributeSetList(
            byte coordShift_,
            int numAttributeSets_,
            nds.venue.details.instantiations.ParkingLevelAttributeSetMap[] sets_)
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

    public nds.venue.details.instantiations.ParkingLevelAttributeSetMap[] getSets()
    {
        return (sets_ == null) ? null : sets_.getRawArray();
    }

    public void setSets(nds.venue.details.instantiations.ParkingLevelAttributeSetMap[] sets_)
    {
        this.sets_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.venue.details.instantiations.ParkingLevelAttributeSetMap.class, sets_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.venue.details.instantiations.ParkingLevelAttributeSetMap>(new ZserioElementFactory_sets()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof ParkingLevelAttributeSetList)
        {
            final ParkingLevelAttributeSetList that = (ParkingLevelAttributeSetList)obj;

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
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.venue.details.instantiations.ParkingLevelAttributeSetMap.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.venue.details.instantiations.ParkingLevelAttributeSetMap>(new ZserioElementFactory_sets()),
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
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.venue.details.instantiations.ParkingLevelAttributeSetMap.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.venue.details.instantiations.ParkingLevelAttributeSetMap>(new ZserioElementFactory_sets()),
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
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field ParkingLevelAttributeSetList.sets: " +
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
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field ParkingLevelAttributeSetList.sets: " +
                    sets_.size() + " != " + (int)(getNumAttributeSets()) + "!");
        }
        sets_.writePacked(out);
    }

    private final class ZserioElementFactory_sets implements zserio.runtime.array.PackableElementFactory<nds.venue.details.instantiations.ParkingLevelAttributeSetMap>
    {
        @Override
        public nds.venue.details.instantiations.ParkingLevelAttributeSetMap create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.venue.details.instantiations.ParkingLevelAttributeSetMap(in, (byte)(getCoordShift()));
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.venue.details.instantiations.ParkingLevelAttributeSetMap.ZserioPackingContext();
        }

        @Override
        public nds.venue.details.instantiations.ParkingLevelAttributeSetMap create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.venue.details.instantiations.ParkingLevelAttributeSetMap(context, in, (byte)(getCoordShift()));
        }
    }

    private final byte coordShift_;
    private int numAttributeSets_;
    private zserio.runtime.array.Array sets_;
}
