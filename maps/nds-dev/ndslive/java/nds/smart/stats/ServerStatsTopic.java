/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.smart.stats;

public class ServerStatsTopic implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            requestNumReceived_ = new zserio.runtime.array.DeltaContext();
            requestPayloadBytes_ = new zserio.runtime.array.DeltaContext();
            responseNumSent_ = new zserio.runtime.array.DeltaContext();
            responsePayloadBytes_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getRequestNumReceived()
        {
            return requestNumReceived_;
        }

        public zserio.runtime.array.DeltaContext getRequestPayloadBytes()
        {
            return requestPayloadBytes_;
        }

        public zserio.runtime.array.DeltaContext getResponseNumSent()
        {
            return responseNumSent_;
        }

        public zserio.runtime.array.DeltaContext getResponsePayloadBytes()
        {
            return responsePayloadBytes_;
        }

        private zserio.runtime.array.DeltaContext requestNumReceived_;
        private zserio.runtime.array.DeltaContext requestPayloadBytes_;
        private zserio.runtime.array.DeltaContext responseNumSent_;
        private zserio.runtime.array.DeltaContext responsePayloadBytes_;
    };

    public ServerStatsTopic()
    {
    }

    public ServerStatsTopic(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public ServerStatsTopic(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public ServerStatsTopic(
            java.math.BigInteger requestNumReceived_,
            java.math.BigInteger requestPayloadBytes_,
            java.lang.Float requestAvgPayloadBytes_,
            java.lang.Float avgTimeRequestToResponse_,
            java.math.BigInteger responseNumSent_,
            java.math.BigInteger responsePayloadBytes_,
            java.lang.Float responseAvgPayloadBytes_)
    {
        setRequestNumReceived(requestNumReceived_);
        setRequestPayloadBytes(requestPayloadBytes_);
        setRequestAvgPayloadBytes(requestAvgPayloadBytes_);
        setAvgTimeRequestToResponse(avgTimeRequestToResponse_);
        setResponseNumSent(responseNumSent_);
        setResponsePayloadBytes(responsePayloadBytes_);
        setResponseAvgPayloadBytes(responseAvgPayloadBytes_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        if (isRequestNumReceivedUsed())
        {
            zserioContext.getRequestNumReceived().init(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(requestNumReceived_));
        }
        if (isRequestPayloadBytesUsed())
        {
            zserioContext.getRequestPayloadBytes().init(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(requestPayloadBytes_));
        }
        if (isResponseNumSentUsed())
        {
            zserioContext.getResponseNumSent().init(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(responseNumSent_));
        }
        if (isResponsePayloadBytesUsed())
        {
            zserioContext.getResponsePayloadBytes().init(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(responsePayloadBytes_));
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
        if (isRequestNumReceivedUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt(requestNumReceived_);
        }
        endBitPosition += 1;
        if (isRequestPayloadBytesUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt(requestPayloadBytes_);
        }
        endBitPosition += 1;
        if (isRequestAvgPayloadBytesUsed())
        {
            endBitPosition += 32;
        }
        endBitPosition += 1;
        if (isAvgTimeRequestToResponseUsed())
        {
            endBitPosition += 32;
        }
        endBitPosition += 1;
        if (isResponseNumSentUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt(responseNumSent_);
        }
        endBitPosition += 1;
        if (isResponsePayloadBytesUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt(responsePayloadBytes_);
        }
        endBitPosition += 1;
        if (isResponseAvgPayloadBytesUsed())
        {
            endBitPosition += 32;
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += 1;
        if (isRequestNumReceivedUsed())
        {
            endBitPosition += zserioContext.getRequestNumReceived().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(requestNumReceived_));
        }
        endBitPosition += 1;
        if (isRequestPayloadBytesUsed())
        {
            endBitPosition += zserioContext.getRequestPayloadBytes().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(requestPayloadBytes_));
        }
        endBitPosition += 1;
        if (isRequestAvgPayloadBytesUsed())
        {
            endBitPosition += 32;
        }
        endBitPosition += 1;
        if (isAvgTimeRequestToResponseUsed())
        {
            endBitPosition += 32;
        }
        endBitPosition += 1;
        if (isResponseNumSentUsed())
        {
            endBitPosition += zserioContext.getResponseNumSent().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(responseNumSent_));
        }
        endBitPosition += 1;
        if (isResponsePayloadBytesUsed())
        {
            endBitPosition += zserioContext.getResponsePayloadBytes().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(responsePayloadBytes_));
        }
        endBitPosition += 1;
        if (isResponseAvgPayloadBytesUsed())
        {
            endBitPosition += 32;
        }

        return (int)(endBitPosition - bitPosition);
    }

    public java.math.BigInteger getRequestNumReceived()
    {
        return requestNumReceived_;
    }

    public void setRequestNumReceived(java.math.BigInteger requestNumReceived_)
    {
        this.requestNumReceived_ = requestNumReceived_;
    }

    public boolean isRequestNumReceivedUsed()
    {
        return isRequestNumReceivedSet();
    }

    public boolean isRequestNumReceivedSet()
    {
        return (requestNumReceived_ != null);
    }

    public void resetRequestNumReceived()
    {
        this.requestNumReceived_ = null;
    }

    public java.math.BigInteger getRequestPayloadBytes()
    {
        return requestPayloadBytes_;
    }

    public void setRequestPayloadBytes(java.math.BigInteger requestPayloadBytes_)
    {
        this.requestPayloadBytes_ = requestPayloadBytes_;
    }

    public boolean isRequestPayloadBytesUsed()
    {
        return isRequestPayloadBytesSet();
    }

    public boolean isRequestPayloadBytesSet()
    {
        return (requestPayloadBytes_ != null);
    }

    public void resetRequestPayloadBytes()
    {
        this.requestPayloadBytes_ = null;
    }

    public java.lang.Float getRequestAvgPayloadBytes()
    {
        return requestAvgPayloadBytes_;
    }

    public void setRequestAvgPayloadBytes(java.lang.Float requestAvgPayloadBytes_)
    {
        this.requestAvgPayloadBytes_ = requestAvgPayloadBytes_;
    }

    public boolean isRequestAvgPayloadBytesUsed()
    {
        return isRequestAvgPayloadBytesSet();
    }

    public boolean isRequestAvgPayloadBytesSet()
    {
        return (requestAvgPayloadBytes_ != null);
    }

    public void resetRequestAvgPayloadBytes()
    {
        this.requestAvgPayloadBytes_ = null;
    }

    public java.lang.Float getAvgTimeRequestToResponse()
    {
        return avgTimeRequestToResponse_;
    }

    public void setAvgTimeRequestToResponse(java.lang.Float avgTimeRequestToResponse_)
    {
        this.avgTimeRequestToResponse_ = avgTimeRequestToResponse_;
    }

    public boolean isAvgTimeRequestToResponseUsed()
    {
        return isAvgTimeRequestToResponseSet();
    }

    public boolean isAvgTimeRequestToResponseSet()
    {
        return (avgTimeRequestToResponse_ != null);
    }

    public void resetAvgTimeRequestToResponse()
    {
        this.avgTimeRequestToResponse_ = null;
    }

    public java.math.BigInteger getResponseNumSent()
    {
        return responseNumSent_;
    }

    public void setResponseNumSent(java.math.BigInteger responseNumSent_)
    {
        this.responseNumSent_ = responseNumSent_;
    }

    public boolean isResponseNumSentUsed()
    {
        return isResponseNumSentSet();
    }

    public boolean isResponseNumSentSet()
    {
        return (responseNumSent_ != null);
    }

    public void resetResponseNumSent()
    {
        this.responseNumSent_ = null;
    }

    public java.math.BigInteger getResponsePayloadBytes()
    {
        return responsePayloadBytes_;
    }

    public void setResponsePayloadBytes(java.math.BigInteger responsePayloadBytes_)
    {
        this.responsePayloadBytes_ = responsePayloadBytes_;
    }

    public boolean isResponsePayloadBytesUsed()
    {
        return isResponsePayloadBytesSet();
    }

    public boolean isResponsePayloadBytesSet()
    {
        return (responsePayloadBytes_ != null);
    }

    public void resetResponsePayloadBytes()
    {
        this.responsePayloadBytes_ = null;
    }

    public java.lang.Float getResponseAvgPayloadBytes()
    {
        return responseAvgPayloadBytes_;
    }

    public void setResponseAvgPayloadBytes(java.lang.Float responseAvgPayloadBytes_)
    {
        this.responseAvgPayloadBytes_ = responseAvgPayloadBytes_;
    }

    public boolean isResponseAvgPayloadBytesUsed()
    {
        return isResponseAvgPayloadBytesSet();
    }

    public boolean isResponseAvgPayloadBytesSet()
    {
        return (responseAvgPayloadBytes_ != null);
    }

    public void resetResponseAvgPayloadBytes()
    {
        this.responseAvgPayloadBytes_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof ServerStatsTopic)
        {
            final ServerStatsTopic that = (ServerStatsTopic)obj;

            return
                    ((!isRequestNumReceivedUsed()) ? !that.isRequestNumReceivedUsed() :
                        ((requestNumReceived_ == null) ? that.requestNumReceived_ == null : requestNumReceived_.equals(that.requestNumReceived_))) &&
                    ((!isRequestPayloadBytesUsed()) ? !that.isRequestPayloadBytesUsed() :
                        ((requestPayloadBytes_ == null) ? that.requestPayloadBytes_ == null : requestPayloadBytes_.equals(that.requestPayloadBytes_))) &&
                    ((!isRequestAvgPayloadBytesUsed()) ? !that.isRequestAvgPayloadBytesUsed() :
                        ((requestAvgPayloadBytes_ == null) ? that.requestAvgPayloadBytes_ == null : requestAvgPayloadBytes_.equals(that.requestAvgPayloadBytes_))) &&
                    ((!isAvgTimeRequestToResponseUsed()) ? !that.isAvgTimeRequestToResponseUsed() :
                        ((avgTimeRequestToResponse_ == null) ? that.avgTimeRequestToResponse_ == null : avgTimeRequestToResponse_.equals(that.avgTimeRequestToResponse_))) &&
                    ((!isResponseNumSentUsed()) ? !that.isResponseNumSentUsed() :
                        ((responseNumSent_ == null) ? that.responseNumSent_ == null : responseNumSent_.equals(that.responseNumSent_))) &&
                    ((!isResponsePayloadBytesUsed()) ? !that.isResponsePayloadBytesUsed() :
                        ((responsePayloadBytes_ == null) ? that.responsePayloadBytes_ == null : responsePayloadBytes_.equals(that.responsePayloadBytes_))) &&
                    ((!isResponseAvgPayloadBytesUsed()) ? !that.isResponseAvgPayloadBytesUsed() :
                        ((responseAvgPayloadBytes_ == null) ? that.responseAvgPayloadBytes_ == null : responseAvgPayloadBytes_.equals(that.responseAvgPayloadBytes_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        if (isRequestNumReceivedUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, requestNumReceived_);
        if (isRequestPayloadBytesUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, requestPayloadBytes_);
        if (isRequestAvgPayloadBytesUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, requestAvgPayloadBytes_);
        if (isAvgTimeRequestToResponseUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, avgTimeRequestToResponse_);
        if (isResponseNumSentUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, responseNumSent_);
        if (isResponsePayloadBytesUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, responsePayloadBytes_);
        if (isResponseAvgPayloadBytesUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, responseAvgPayloadBytes_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        if (in.readBool())
        {
            requestNumReceived_ = in.readVarUInt();
        }

        if (in.readBool())
        {
            requestPayloadBytes_ = in.readVarUInt();
        }

        if (in.readBool())
        {
            requestAvgPayloadBytes_ = in.readFloat32();
        }

        if (in.readBool())
        {
            avgTimeRequestToResponse_ = in.readFloat32();
        }

        if (in.readBool())
        {
            responseNumSent_ = in.readVarUInt();
        }

        if (in.readBool())
        {
            responsePayloadBytes_ = in.readVarUInt();
        }

        if (in.readBool())
        {
            responseAvgPayloadBytes_ = in.readFloat32();
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        if (in.readBool())
        {
            requestNumReceived_ = ((zserio.runtime.array.ArrayElement.BigIntegerArrayElement)
                    zserioContext.getRequestNumReceived().read(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(), in)).get();
        }

        if (in.readBool())
        {
            requestPayloadBytes_ = ((zserio.runtime.array.ArrayElement.BigIntegerArrayElement)
                    zserioContext.getRequestPayloadBytes().read(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(), in)).get();
        }

        if (in.readBool())
        {
            requestAvgPayloadBytes_ = in.readFloat32();
        }

        if (in.readBool())
        {
            avgTimeRequestToResponse_ = in.readFloat32();
        }

        if (in.readBool())
        {
            responseNumSent_ = ((zserio.runtime.array.ArrayElement.BigIntegerArrayElement)
                    zserioContext.getResponseNumSent().read(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(), in)).get();
        }

        if (in.readBool())
        {
            responsePayloadBytes_ = ((zserio.runtime.array.ArrayElement.BigIntegerArrayElement)
                    zserioContext.getResponsePayloadBytes().read(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(), in)).get();
        }

        if (in.readBool())
        {
            responseAvgPayloadBytes_ = in.readFloat32();
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
        if (isRequestNumReceivedUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt(requestNumReceived_);
        }
        endBitPosition += 1;
        if (isRequestPayloadBytesUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt(requestPayloadBytes_);
        }
        endBitPosition += 1;
        if (isRequestAvgPayloadBytesUsed())
        {
            endBitPosition += 32;
        }
        endBitPosition += 1;
        if (isAvgTimeRequestToResponseUsed())
        {
            endBitPosition += 32;
        }
        endBitPosition += 1;
        if (isResponseNumSentUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt(responseNumSent_);
        }
        endBitPosition += 1;
        if (isResponsePayloadBytesUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt(responsePayloadBytes_);
        }
        endBitPosition += 1;
        if (isResponseAvgPayloadBytesUsed())
        {
            endBitPosition += 32;
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += 1;
        if (isRequestNumReceivedUsed())
        {
            endBitPosition += zserioContext.getRequestNumReceived().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(requestNumReceived_));
        }
        endBitPosition += 1;
        if (isRequestPayloadBytesUsed())
        {
            endBitPosition += zserioContext.getRequestPayloadBytes().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(requestPayloadBytes_));
        }
        endBitPosition += 1;
        if (isRequestAvgPayloadBytesUsed())
        {
            endBitPosition += 32;
        }
        endBitPosition += 1;
        if (isAvgTimeRequestToResponseUsed())
        {
            endBitPosition += 32;
        }
        endBitPosition += 1;
        if (isResponseNumSentUsed())
        {
            endBitPosition += zserioContext.getResponseNumSent().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(responseNumSent_));
        }
        endBitPosition += 1;
        if (isResponsePayloadBytesUsed())
        {
            endBitPosition += zserioContext.getResponsePayloadBytes().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(responsePayloadBytes_));
        }
        endBitPosition += 1;
        if (isResponseAvgPayloadBytesUsed())
        {
            endBitPosition += 32;
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        if (isRequestNumReceivedUsed())
        {
            out.writeBool(true);
            out.writeVarUInt(requestNumReceived_);
        }
        else
        {
            out.writeBool(false);
        }

        if (isRequestPayloadBytesUsed())
        {
            out.writeBool(true);
            out.writeVarUInt(requestPayloadBytes_);
        }
        else
        {
            out.writeBool(false);
        }

        if (isRequestAvgPayloadBytesUsed())
        {
            out.writeBool(true);
            out.writeFloat32(requestAvgPayloadBytes_);
        }
        else
        {
            out.writeBool(false);
        }

        if (isAvgTimeRequestToResponseUsed())
        {
            out.writeBool(true);
            out.writeFloat32(avgTimeRequestToResponse_);
        }
        else
        {
            out.writeBool(false);
        }

        if (isResponseNumSentUsed())
        {
            out.writeBool(true);
            out.writeVarUInt(responseNumSent_);
        }
        else
        {
            out.writeBool(false);
        }

        if (isResponsePayloadBytesUsed())
        {
            out.writeBool(true);
            out.writeVarUInt(responsePayloadBytes_);
        }
        else
        {
            out.writeBool(false);
        }

        if (isResponseAvgPayloadBytesUsed())
        {
            out.writeBool(true);
            out.writeFloat32(responseAvgPayloadBytes_);
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
        if (isRequestNumReceivedUsed())
        {
            out.writeBool(true);
            zserioContext.getRequestNumReceived().write(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(requestNumReceived_));
        }
        else
        {
            out.writeBool(false);
        }

        if (isRequestPayloadBytesUsed())
        {
            out.writeBool(true);
            zserioContext.getRequestPayloadBytes().write(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(requestPayloadBytes_));
        }
        else
        {
            out.writeBool(false);
        }

        if (isRequestAvgPayloadBytesUsed())
        {
            out.writeBool(true);
            out.writeFloat32(requestAvgPayloadBytes_);
        }
        else
        {
            out.writeBool(false);
        }

        if (isAvgTimeRequestToResponseUsed())
        {
            out.writeBool(true);
            out.writeFloat32(avgTimeRequestToResponse_);
        }
        else
        {
            out.writeBool(false);
        }

        if (isResponseNumSentUsed())
        {
            out.writeBool(true);
            zserioContext.getResponseNumSent().write(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(responseNumSent_));
        }
        else
        {
            out.writeBool(false);
        }

        if (isResponsePayloadBytesUsed())
        {
            out.writeBool(true);
            zserioContext.getResponsePayloadBytes().write(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(responsePayloadBytes_));
        }
        else
        {
            out.writeBool(false);
        }

        if (isResponseAvgPayloadBytesUsed())
        {
            out.writeBool(true);
            out.writeFloat32(responseAvgPayloadBytes_);
        }
        else
        {
            out.writeBool(false);
        }
    }

    private java.math.BigInteger requestNumReceived_;
    private java.math.BigInteger requestPayloadBytes_;
    private java.lang.Float requestAvgPayloadBytes_;
    private java.lang.Float avgTimeRequestToResponse_;
    private java.math.BigInteger responseNumSent_;
    private java.math.BigInteger responsePayloadBytes_;
    private java.lang.Float responseAvgPayloadBytes_;
}
