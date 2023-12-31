/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.venue.layer;

public class ParkingFacilityLayer implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
    };

    public ParkingFacilityLayer()
    {
    }

    public ParkingFacilityLayer(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public ParkingFacilityLayer(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public ParkingFacilityLayer(
            nds.venue.parking.ParkingFacility[] parkingFacilities_)
    {
        setParkingFacilities(parkingFacilities_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
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

        endBitPosition += parkingFacilities_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition += parkingFacilities_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.venue.parking.ParkingFacility[] getParkingFacilities()
    {
        return (parkingFacilities_ == null) ? null : parkingFacilities_.getRawArray();
    }

    public void setParkingFacilities(nds.venue.parking.ParkingFacility[] parkingFacilities_)
    {
        this.parkingFacilities_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.venue.parking.ParkingFacility.class, parkingFacilities_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.venue.parking.ParkingFacility>(new ZserioElementFactory_parkingFacilities()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public nds.system.types.LayerType funcGetLayerType()
    {
        return (nds.system.types.LayerType)(nds.system.types.LayerType.FEATURE);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof ParkingFacilityLayer)
        {
            final ParkingFacilityLayer that = (ParkingFacilityLayer)obj;

            return
                    ((parkingFacilities_ == null) ? that.parkingFacilities_ == null : parkingFacilities_.equals(that.parkingFacilities_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, parkingFacilities_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        parkingFacilities_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.venue.parking.ParkingFacility.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.venue.parking.ParkingFacility>(new ZserioElementFactory_parkingFacilities()),
                zserio.runtime.array.ArrayType.AUTO);
        parkingFacilities_.readPacked(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        parkingFacilities_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.venue.parking.ParkingFacility.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.venue.parking.ParkingFacility>(new ZserioElementFactory_parkingFacilities()),
                zserio.runtime.array.ArrayType.AUTO);
        parkingFacilities_.readPacked(in);
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

        endBitPosition = parkingFacilities_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition = parkingFacilities_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        parkingFacilities_.writePacked(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        parkingFacilities_.writePacked(out);
    }

    private static final class ZserioElementFactory_parkingFacilities implements zserio.runtime.array.PackableElementFactory<nds.venue.parking.ParkingFacility>
    {
        @Override
        public nds.venue.parking.ParkingFacility create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.venue.parking.ParkingFacility(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.venue.parking.ParkingFacility.ZserioPackingContext();
        }

        @Override
        public nds.venue.parking.ParkingFacility create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.venue.parking.ParkingFacility(context, in);
        }
    }

    private zserio.runtime.array.Array parkingFacilities_;
}
