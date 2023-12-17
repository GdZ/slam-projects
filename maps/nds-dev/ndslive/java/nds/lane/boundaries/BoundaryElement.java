/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.lane.boundaries;

public class BoundaryElement implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            id_ = new zserio.runtime.array.DeltaContext();
            type_ = new zserio.runtime.array.DeltaContext();
            details_ = new nds.lane.boundaries.BoundaryElementDetails.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getId()
        {
            return id_;
        }

        public zserio.runtime.array.DeltaContext getType()
        {
            return type_;
        }

        public nds.lane.boundaries.BoundaryElementDetails.ZserioPackingContext getDetails()
        {
            return details_;
        }

        private zserio.runtime.array.DeltaContext id_;
        private zserio.runtime.array.DeltaContext type_;
        private nds.lane.boundaries.BoundaryElementDetails.ZserioPackingContext details_;
    };

    public BoundaryElement()
    {
    }

    public BoundaryElement(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public BoundaryElement(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public BoundaryElement(
            short id_,
            nds.lane.types.BoundaryElementType type_,
            nds.lane.boundaries.BoundaryElementDetails details_)
    {
        setId(id_);
        setType(type_);
        setDetails(details_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getId().init(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(id_));
        type_.initPackingContext(zserioContext.getType());
        details_.initPackingContext(zserioContext.getDetails());
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(id_);
        endBitPosition += type_.bitSizeOf(endBitPosition);
        endBitPosition += details_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getId().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(id_));
        endBitPosition += type_.bitSizeOf(zserioContext.getType(), endBitPosition);
        endBitPosition += details_.bitSizeOf(zserioContext.getDetails(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public short getId()
    {
        return id_;
    }

    public void setId(short id_)
    {
        this.id_ = id_;
    }

    public nds.lane.types.BoundaryElementType getType()
    {
        return type_;
    }

    public void setType(nds.lane.types.BoundaryElementType type_)
    {
        this.type_ = type_;
    }

    public nds.lane.boundaries.BoundaryElementDetails getDetails()
    {
        return details_;
    }

    public void setDetails(nds.lane.boundaries.BoundaryElementDetails details_)
    {
        this.details_ = details_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof BoundaryElement)
        {
            final BoundaryElement that = (BoundaryElement)obj;

            return
                    id_ == that.id_ &&
                    ((type_ == null) ? that.type_ == null : type_.getValue() == that.type_.getValue()) &&
                    ((details_ == null) ? that.details_ == null : details_.equals(that.details_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, id_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, type_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, details_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        id_ = in.readVarUInt16();

        type_ = nds.lane.types.BoundaryElementType.readEnum(in);

        details_ = new nds.lane.boundaries.BoundaryElementDetails(in, getType());
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        id_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                zserioContext.getId().read(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), in)).get();

        type_ = nds.lane.types.BoundaryElementType.readEnum(zserioContext.getType(), in);

        details_ = new nds.lane.boundaries.BoundaryElementDetails(zserioContext.getDetails(), in, getType());
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(id_);
        endBitPosition += type_.bitSizeOf(endBitPosition);
        endBitPosition = details_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getId().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(id_));
        endBitPosition = type_.initializeOffsets(zserioContext.getType(), endBitPosition);
        endBitPosition = details_.initializeOffsets(zserioContext.getDetails(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarUInt16(id_);

        type_.write(out);

        // check parameters
        if (details_.getType() != (getType()))
        {
            throw new zserio.runtime.ZserioError("Write: Inconsistent parameter type for field BoundaryElement.details!");
        }
        details_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getId().write(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(id_));

        type_.write(zserioContext.getType(), out);

        details_.write(zserioContext.getDetails(), out);
    }

    private short id_;
    private nds.lane.types.BoundaryElementType type_;
    private nds.lane.boundaries.BoundaryElementDetails details_;
}
