/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.venue.parking;

public class ParkingFacility implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            id_ = new nds.core.types.Var4ByteId.ZserioPackingContext();
        }

        public nds.core.types.Var4ByteId.ZserioPackingContext getId()
        {
            return id_;
        }

        private nds.core.types.Var4ByteId.ZserioPackingContext id_;
    };

    public ParkingFacility()
    {
    }

    public ParkingFacility(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public ParkingFacility(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public ParkingFacility(
            nds.core.types.Var4ByteId id_,
            nds.venue.parking.ParkingLevel[] levels_)
    {
        setId(id_);
        setLevels(levels_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        id_.initPackingContext(zserioContext.getId());
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

        endBitPosition += id_.bitSizeOf(endBitPosition);
        endBitPosition += levels_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += id_.bitSizeOf(zserioContext.getId(), endBitPosition);
        endBitPosition += levels_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.types.Var4ByteId getId()
    {
        return id_;
    }

    public void setId(nds.core.types.Var4ByteId id_)
    {
        this.id_ = id_;
    }

    public nds.venue.parking.ParkingLevel[] getLevels()
    {
        return (levels_ == null) ? null : levels_.getRawArray();
    }

    public void setLevels(nds.venue.parking.ParkingLevel[] levels_)
    {
        this.levels_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.venue.parking.ParkingLevel.class, levels_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.venue.parking.ParkingLevel>(new ZserioElementFactory_levels()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof ParkingFacility)
        {
            final ParkingFacility that = (ParkingFacility)obj;

            return
                    ((id_ == null) ? that.id_ == null : id_.equals(that.id_)) &&
                    ((levels_ == null) ? that.levels_ == null : levels_.equals(that.levels_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, id_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, levels_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        id_ = new nds.core.types.Var4ByteId(in);

        levels_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.venue.parking.ParkingLevel.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.venue.parking.ParkingLevel>(new ZserioElementFactory_levels()),
                zserio.runtime.array.ArrayType.AUTO);
        levels_.read(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        id_ = new nds.core.types.Var4ByteId(zserioContext.getId(), in);

        levels_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.venue.parking.ParkingLevel.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.venue.parking.ParkingLevel>(new ZserioElementFactory_levels()),
                zserio.runtime.array.ArrayType.AUTO);
        levels_.readPacked(in);
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

        endBitPosition = id_.initializeOffsets(endBitPosition);
        endBitPosition = levels_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = id_.initializeOffsets(zserioContext.getId(), endBitPosition);
        endBitPosition = levels_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        id_.write(out);

        levels_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        id_.write(zserioContext.getId(), out);

        levels_.writePacked(out);
    }

    private static final class ZserioElementFactory_levels implements zserio.runtime.array.PackableElementFactory<nds.venue.parking.ParkingLevel>
    {
        @Override
        public nds.venue.parking.ParkingLevel create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.venue.parking.ParkingLevel(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.venue.parking.ParkingLevel.ZserioPackingContext();
        }

        @Override
        public nds.venue.parking.ParkingLevel create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.venue.parking.ParkingLevel(context, in);
        }
    }

    private nds.core.types.Var4ByteId id_;
    private zserio.runtime.array.Array levels_;
}
