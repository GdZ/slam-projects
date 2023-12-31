/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.venue.details.types;

public class ParkingRowLayout implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            orientation_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getOrientation()
        {
            return orientation_;
        }

        private zserio.runtime.array.DeltaContext orientation_;
    };

    public ParkingRowLayout()
    {
    }

    public ParkingRowLayout(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public ParkingRowLayout(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public ParkingRowLayout(
            boolean structuredParking_,
            boolean interlockedSpots_,
            nds.venue.details.types.ParkingOrientation orientation_)
    {
        setStructuredParking(structuredParking_);
        setInterlockedSpots(interlockedSpots_);
        setOrientation(orientation_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        orientation_.initPackingContext(zserioContext.getOrientation());
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

        endBitPosition += 1;
        endBitPosition += 1;
        endBitPosition += orientation_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += 1;
        endBitPosition += 1;
        endBitPosition += orientation_.bitSizeOf(zserioContext.getOrientation(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public boolean getStructuredParking()
    {
        return structuredParking_;
    }

    public void setStructuredParking(boolean structuredParking_)
    {
        this.structuredParking_ = structuredParking_;
    }

    public boolean getInterlockedSpots()
    {
        return interlockedSpots_;
    }

    public void setInterlockedSpots(boolean interlockedSpots_)
    {
        this.interlockedSpots_ = interlockedSpots_;
    }

    public nds.venue.details.types.ParkingOrientation getOrientation()
    {
        return orientation_;
    }

    public void setOrientation(nds.venue.details.types.ParkingOrientation orientation_)
    {
        this.orientation_ = orientation_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof ParkingRowLayout)
        {
            final ParkingRowLayout that = (ParkingRowLayout)obj;

            return
                    structuredParking_ == that.structuredParking_ &&
                    interlockedSpots_ == that.interlockedSpots_ &&
                    ((orientation_ == null) ? that.orientation_ == null : orientation_.getValue() == that.orientation_.getValue());
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, structuredParking_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, interlockedSpots_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, orientation_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        structuredParking_ = in.readBool();

        interlockedSpots_ = in.readBool();

        orientation_ = nds.venue.details.types.ParkingOrientation.readEnum(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        structuredParking_ = in.readBool();

        interlockedSpots_ = in.readBool();

        orientation_ = nds.venue.details.types.ParkingOrientation.readEnum(zserioContext.getOrientation(), in);
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

        endBitPosition += 1;
        endBitPosition += 1;
        endBitPosition += orientation_.bitSizeOf(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += 1;
        endBitPosition += 1;
        endBitPosition = orientation_.initializeOffsets(zserioContext.getOrientation(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeBool(structuredParking_);

        out.writeBool(interlockedSpots_);

        orientation_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        out.writeBool(structuredParking_);

        out.writeBool(interlockedSpots_);

        orientation_.write(zserioContext.getOrientation(), out);
    }

    private boolean structuredParking_;
    private boolean interlockedSpots_;
    private nds.venue.details.types.ParkingOrientation orientation_;
}
