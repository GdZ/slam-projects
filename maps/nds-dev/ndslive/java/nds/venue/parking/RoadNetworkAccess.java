/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.venue.parking;

public class RoadNetworkAccess implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            facilityId_ = new nds.core.types.Var4ByteId.ZserioPackingContext();
            type_ = new zserio.runtime.array.DeltaContext();
        }

        public nds.core.types.Var4ByteId.ZserioPackingContext getFacilityId()
        {
            return facilityId_;
        }

        public zserio.runtime.array.DeltaContext getType()
        {
            return type_;
        }

        private nds.core.types.Var4ByteId.ZserioPackingContext facilityId_;
        private zserio.runtime.array.DeltaContext type_;
    };

    public RoadNetworkAccess()
    {
    }

    public RoadNetworkAccess(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RoadNetworkAccess(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RoadNetworkAccess(
            nds.core.types.Var4ByteId facilityId_,
            nds.venue.parking.RoadNetworkAccessType type_)
    {
        setFacilityId(facilityId_);
        setType(type_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        facilityId_.initPackingContext(zserioContext.getFacilityId());
        type_.initPackingContext(zserioContext.getType());
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

        endBitPosition += facilityId_.bitSizeOf(endBitPosition);
        endBitPosition += type_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += facilityId_.bitSizeOf(zserioContext.getFacilityId(), endBitPosition);
        endBitPosition += type_.bitSizeOf(zserioContext.getType(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.types.Var4ByteId getFacilityId()
    {
        return facilityId_;
    }

    public void setFacilityId(nds.core.types.Var4ByteId facilityId_)
    {
        this.facilityId_ = facilityId_;
    }

    public nds.venue.parking.RoadNetworkAccessType getType()
    {
        return type_;
    }

    public void setType(nds.venue.parking.RoadNetworkAccessType type_)
    {
        this.type_ = type_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RoadNetworkAccess)
        {
            final RoadNetworkAccess that = (RoadNetworkAccess)obj;

            return
                    ((facilityId_ == null) ? that.facilityId_ == null : facilityId_.equals(that.facilityId_)) &&
                    ((type_ == null) ? that.type_ == null : type_.getValue() == that.type_.getValue());
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, facilityId_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, type_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        facilityId_ = new nds.core.types.Var4ByteId(in);

        type_ = nds.venue.parking.RoadNetworkAccessType.readEnum(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        facilityId_ = new nds.core.types.Var4ByteId(zserioContext.getFacilityId(), in);

        type_ = nds.venue.parking.RoadNetworkAccessType.readEnum(zserioContext.getType(), in);
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

        endBitPosition = facilityId_.initializeOffsets(endBitPosition);
        endBitPosition += type_.bitSizeOf(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = facilityId_.initializeOffsets(zserioContext.getFacilityId(), endBitPosition);
        endBitPosition = type_.initializeOffsets(zserioContext.getType(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        facilityId_.write(out);

        type_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        facilityId_.write(zserioContext.getFacilityId(), out);

        type_.write(zserioContext.getType(), out);
    }

    private nds.core.types.Var4ByteId facilityId_;
    private nds.venue.parking.RoadNetworkAccessType type_;
}
