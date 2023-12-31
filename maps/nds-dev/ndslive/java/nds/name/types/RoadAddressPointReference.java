/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.name.types;

public class RoadAddressPointReference implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            indirectReference_ = new nds.road.reference.types.RoadReferenceIndirect.ZserioPackingContext();
            position_ = new nds.road.reference.types.RoadPositionValidity.ZserioPackingContext();
        }

        public nds.road.reference.types.RoadReferenceIndirect.ZserioPackingContext getIndirectReference()
        {
            return indirectReference_;
        }

        public nds.road.reference.types.RoadPositionValidity.ZserioPackingContext getPosition()
        {
            return position_;
        }

        private nds.road.reference.types.RoadReferenceIndirect.ZserioPackingContext indirectReference_;
        private nds.road.reference.types.RoadPositionValidity.ZserioPackingContext position_;
    };

    public RoadAddressPointReference()
    {
    }

    public RoadAddressPointReference(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RoadAddressPointReference(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RoadAddressPointReference(
            nds.road.reference.types.RoadReferenceIndirect indirectReference_,
            nds.road.reference.types.RoadPositionValidity position_)
    {
        setIndirectReference(indirectReference_);
        setPosition(position_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        indirectReference_.initPackingContext(zserioContext.getIndirectReference());
        position_.initPackingContext(zserioContext.getPosition());
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

        endBitPosition += indirectReference_.bitSizeOf(endBitPosition);
        endBitPosition += position_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += indirectReference_.bitSizeOf(zserioContext.getIndirectReference(), endBitPosition);
        endBitPosition += position_.bitSizeOf(zserioContext.getPosition(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.road.reference.types.RoadReferenceIndirect getIndirectReference()
    {
        return indirectReference_;
    }

    public void setIndirectReference(nds.road.reference.types.RoadReferenceIndirect indirectReference_)
    {
        this.indirectReference_ = indirectReference_;
    }

    public nds.road.reference.types.RoadPositionValidity getPosition()
    {
        return position_;
    }

    public void setPosition(nds.road.reference.types.RoadPositionValidity position_)
    {
        this.position_ = position_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RoadAddressPointReference)
        {
            final RoadAddressPointReference that = (RoadAddressPointReference)obj;

            return
                    ((indirectReference_ == null) ? that.indirectReference_ == null : indirectReference_.equals(that.indirectReference_)) &&
                    ((position_ == null) ? that.position_ == null : position_.equals(that.position_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, indirectReference_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, position_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        indirectReference_ = new nds.road.reference.types.RoadReferenceIndirect(in);

        position_ = new nds.road.reference.types.RoadPositionValidity(in, (byte)(0));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        indirectReference_ = new nds.road.reference.types.RoadReferenceIndirect(zserioContext.getIndirectReference(), in);

        position_ = new nds.road.reference.types.RoadPositionValidity(zserioContext.getPosition(), in, (byte)(0));
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

        endBitPosition = indirectReference_.initializeOffsets(endBitPosition);
        endBitPosition = position_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = indirectReference_.initializeOffsets(zserioContext.getIndirectReference(), endBitPosition);
        endBitPosition = position_.initializeOffsets(zserioContext.getPosition(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        indirectReference_.write(out);

        // check parameters
        if (position_.getShift() != (byte)(0))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter shift for field RoadAddressPointReference.position: " +
                    position_.getShift() + " != " + (byte)(0) + "!");
        }
        position_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        indirectReference_.write(zserioContext.getIndirectReference(), out);

        position_.write(zserioContext.getPosition(), out);
    }

    private nds.road.reference.types.RoadReferenceIndirect indirectReference_;
    private nds.road.reference.types.RoadPositionValidity position_;
}
