/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.routing.route;

public class DelayInformation implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            delay_ = new zserio.runtime.array.DeltaContext();
            reasonType_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getDelay()
        {
            return delay_;
        }

        public zserio.runtime.array.DeltaContext getReasonType()
        {
            return reasonType_;
        }

        private zserio.runtime.array.DeltaContext delay_;
        private zserio.runtime.array.DeltaContext reasonType_;
    };

    public DelayInformation()
    {
    }

    public DelayInformation(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public DelayInformation(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public DelayInformation(
            java.math.BigInteger delay_,
            nds.routing.route.DelayReasonType reasonType_,
            java.lang.String reason_)
    {
        setDelay(delay_);
        setReasonType(reasonType_);
        setReason(reason_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getDelay().init(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(delay_));
        reasonType_.initPackingContext(zserioContext.getReasonType());
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt(delay_);
        endBitPosition += reasonType_.bitSizeOf(endBitPosition);
        endBitPosition += 1;
        if (isReasonUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(reason_);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getDelay().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(delay_));
        endBitPosition += reasonType_.bitSizeOf(zserioContext.getReasonType(), endBitPosition);
        endBitPosition += 1;
        if (isReasonUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(reason_);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public java.math.BigInteger getDelay()
    {
        return delay_;
    }

    public void setDelay(java.math.BigInteger delay_)
    {
        this.delay_ = delay_;
    }

    public nds.routing.route.DelayReasonType getReasonType()
    {
        return reasonType_;
    }

    public void setReasonType(nds.routing.route.DelayReasonType reasonType_)
    {
        this.reasonType_ = reasonType_;
    }

    public java.lang.String getReason()
    {
        return reason_;
    }

    public void setReason(java.lang.String reason_)
    {
        this.reason_ = reason_;
    }

    public boolean isReasonUsed()
    {
        return isReasonSet();
    }

    public boolean isReasonSet()
    {
        return (reason_ != null);
    }

    public void resetReason()
    {
        this.reason_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof DelayInformation)
        {
            final DelayInformation that = (DelayInformation)obj;

            return
                    ((delay_ == null) ? that.delay_ == null : delay_.equals(that.delay_)) &&
                    ((reasonType_ == null) ? that.reasonType_ == null : reasonType_.getValue() == that.reasonType_.getValue()) &&
                    ((!isReasonUsed()) ? !that.isReasonUsed() :
                        ((reason_ == null) ? that.reason_ == null : reason_.equals(that.reason_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, delay_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, reasonType_);
        if (isReasonUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, reason_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        delay_ = in.readVarUInt();

        reasonType_ = nds.routing.route.DelayReasonType.readEnum(in);

        if (in.readBool())
        {
            reason_ = in.readString();
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        delay_ = ((zserio.runtime.array.ArrayElement.BigIntegerArrayElement)
                zserioContext.getDelay().read(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(), in)).get();

        reasonType_ = nds.routing.route.DelayReasonType.readEnum(zserioContext.getReasonType(), in);

        if (in.readBool())
        {
            reason_ = in.readString();
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt(delay_);
        endBitPosition += reasonType_.bitSizeOf(endBitPosition);
        endBitPosition += 1;
        if (isReasonUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(reason_);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getDelay().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(delay_));
        endBitPosition = reasonType_.initializeOffsets(zserioContext.getReasonType(), endBitPosition);
        endBitPosition += 1;
        if (isReasonUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(reason_);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarUInt(delay_);

        reasonType_.write(out);

        if (isReasonUsed())
        {
            out.writeBool(true);
            out.writeString(reason_);
        }
        else
        {
            out.writeBool(false);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getDelay().write(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(delay_));

        reasonType_.write(zserioContext.getReasonType(), out);

        if (isReasonUsed())
        {
            out.writeBool(true);
            out.writeString(reason_);
        }
        else
        {
            out.writeBool(false);
        }
    }

    private java.math.BigInteger delay_;
    private nds.routing.route.DelayReasonType reasonType_;
    private java.lang.String reason_;
}
