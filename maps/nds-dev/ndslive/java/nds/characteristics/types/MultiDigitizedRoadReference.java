/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.characteristics.types;

public class MultiDigitizedRoadReference implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            counterpartReference_ = new nds.road.reference.types.RoadReference.ZserioPackingContext();
            counterpartReferenceIndirect_ = new nds.road.reference.types.RoadReferenceIndirect.ZserioPackingContext();
        }

        public nds.road.reference.types.RoadReference.ZserioPackingContext getCounterpartReference()
        {
            return counterpartReference_;
        }

        public nds.road.reference.types.RoadReferenceIndirect.ZserioPackingContext getCounterpartReferenceIndirect()
        {
            return counterpartReferenceIndirect_;
        }

        private nds.road.reference.types.RoadReference.ZserioPackingContext counterpartReference_;
        private nds.road.reference.types.RoadReferenceIndirect.ZserioPackingContext counterpartReferenceIndirect_;
    };

    public MultiDigitizedRoadReference()
    {
    }

    public MultiDigitizedRoadReference(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public MultiDigitizedRoadReference(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public MultiDigitizedRoadReference(
            boolean isDirectReference_,
            nds.road.reference.types.RoadReference counterpartReference_,
            nds.road.reference.types.RoadReferenceIndirect counterpartReferenceIndirect_)
    {
        setIsDirectReference(isDirectReference_);
        setCounterpartReference(counterpartReference_);
        setCounterpartReferenceIndirect(counterpartReferenceIndirect_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        if (isCounterpartReferenceUsed())
        {
            counterpartReference_.initPackingContext(zserioContext.getCounterpartReference());
        }
        if (isCounterpartReferenceIndirectUsed())
        {
            counterpartReferenceIndirect_.initPackingContext(zserioContext.getCounterpartReferenceIndirect());
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

        endBitPosition += 1;
        if (isCounterpartReferenceUsed())
        {
            endBitPosition += counterpartReference_.bitSizeOf(endBitPosition);
        }
        if (isCounterpartReferenceIndirectUsed())
        {
            endBitPosition += counterpartReferenceIndirect_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += 1;
        if (isCounterpartReferenceUsed())
        {
            endBitPosition += counterpartReference_.bitSizeOf(zserioContext.getCounterpartReference(), endBitPosition);
        }
        if (isCounterpartReferenceIndirectUsed())
        {
            endBitPosition += counterpartReferenceIndirect_.bitSizeOf(zserioContext.getCounterpartReferenceIndirect(), endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public boolean getIsDirectReference()
    {
        return isDirectReference_;
    }

    public void setIsDirectReference(boolean isDirectReference_)
    {
        this.isDirectReference_ = isDirectReference_;
    }

    public nds.road.reference.types.RoadReference getCounterpartReference()
    {
        return counterpartReference_;
    }

    public void setCounterpartReference(nds.road.reference.types.RoadReference counterpartReference_)
    {
        this.counterpartReference_ = counterpartReference_;
    }

    public boolean isCounterpartReferenceUsed()
    {
        return (getIsDirectReference());
    }

    public boolean isCounterpartReferenceSet()
    {
        return (counterpartReference_ != null);
    }

    public void resetCounterpartReference()
    {
        this.counterpartReference_ = null;
    }

    public nds.road.reference.types.RoadReferenceIndirect getCounterpartReferenceIndirect()
    {
        return counterpartReferenceIndirect_;
    }

    public void setCounterpartReferenceIndirect(nds.road.reference.types.RoadReferenceIndirect counterpartReferenceIndirect_)
    {
        this.counterpartReferenceIndirect_ = counterpartReferenceIndirect_;
    }

    public boolean isCounterpartReferenceIndirectUsed()
    {
        return (!getIsDirectReference());
    }

    public boolean isCounterpartReferenceIndirectSet()
    {
        return (counterpartReferenceIndirect_ != null);
    }

    public void resetCounterpartReferenceIndirect()
    {
        this.counterpartReferenceIndirect_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof MultiDigitizedRoadReference)
        {
            final MultiDigitizedRoadReference that = (MultiDigitizedRoadReference)obj;

            return
                    isDirectReference_ == that.isDirectReference_ &&
                    ((!isCounterpartReferenceUsed()) ? !that.isCounterpartReferenceUsed() :
                        ((counterpartReference_ == null) ? that.counterpartReference_ == null : counterpartReference_.equals(that.counterpartReference_))) &&
                    ((!isCounterpartReferenceIndirectUsed()) ? !that.isCounterpartReferenceIndirectUsed() :
                        ((counterpartReferenceIndirect_ == null) ? that.counterpartReferenceIndirect_ == null : counterpartReferenceIndirect_.equals(that.counterpartReferenceIndirect_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, isDirectReference_);
        if (isCounterpartReferenceUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, counterpartReference_);
        if (isCounterpartReferenceIndirectUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, counterpartReferenceIndirect_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        isDirectReference_ = in.readBool();

        if (getIsDirectReference())
        {
            counterpartReference_ = new nds.road.reference.types.RoadReference(in);
        }

        if (!getIsDirectReference())
        {
            counterpartReferenceIndirect_ = new nds.road.reference.types.RoadReferenceIndirect(in);
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        isDirectReference_ = in.readBool();

        if (getIsDirectReference())
        {
            counterpartReference_ = new nds.road.reference.types.RoadReference(zserioContext.getCounterpartReference(), in);
        }

        if (!getIsDirectReference())
        {
            counterpartReferenceIndirect_ = new nds.road.reference.types.RoadReferenceIndirect(zserioContext.getCounterpartReferenceIndirect(), in);
        }
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
        if (isCounterpartReferenceUsed())
        {
            endBitPosition = counterpartReference_.initializeOffsets(endBitPosition);
        }
        if (isCounterpartReferenceIndirectUsed())
        {
            endBitPosition = counterpartReferenceIndirect_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += 1;
        if (isCounterpartReferenceUsed())
        {
            endBitPosition = counterpartReference_.initializeOffsets(zserioContext.getCounterpartReference(), endBitPosition);
        }
        if (isCounterpartReferenceIndirectUsed())
        {
            endBitPosition = counterpartReferenceIndirect_.initializeOffsets(zserioContext.getCounterpartReferenceIndirect(), endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeBool(isDirectReference_);

        if (isCounterpartReferenceUsed())
        {
            counterpartReference_.write(out);
        }

        if (isCounterpartReferenceIndirectUsed())
        {
            counterpartReferenceIndirect_.write(out);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        out.writeBool(isDirectReference_);

        if (isCounterpartReferenceUsed())
        {
            counterpartReference_.write(zserioContext.getCounterpartReference(), out);
        }

        if (isCounterpartReferenceIndirectUsed())
        {
            counterpartReferenceIndirect_.write(zserioContext.getCounterpartReferenceIndirect(), out);
        }
    }

    private boolean isDirectReference_;
    private nds.road.reference.types.RoadReference counterpartReference_;
    private nds.road.reference.types.RoadReferenceIndirect counterpartReferenceIndirect_;
}