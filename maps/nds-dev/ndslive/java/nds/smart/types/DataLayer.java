/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.smart.types;

public class DataLayer implements zserio.runtime.io.Writer, zserio.runtime.SizeOf
{
    public DataLayer()
    {
    }

    public DataLayer(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public DataLayer(
            boolean hasSignature_,
            zserio.runtime.io.BitBuffer signature_,
            nds.system.types.ExternData layer_)
    {
        setHasSignature(hasSignature_);
        setSignature(signature_);
        setLayer(layer_);
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
        if (isSignatureUsed())
        {
            endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfBitBuffer(signature_);
        }
        endBitPosition += layer_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public boolean getHasSignature()
    {
        return hasSignature_;
    }

    public void setHasSignature(boolean hasSignature_)
    {
        this.hasSignature_ = hasSignature_;
    }

    public zserio.runtime.io.BitBuffer getSignature()
    {
        return signature_;
    }

    public void setSignature(zserio.runtime.io.BitBuffer signature_)
    {
        this.signature_ = signature_;
    }

    public boolean isSignatureUsed()
    {
        return (getHasSignature());
    }

    public boolean isSignatureSet()
    {
        return (signature_ != null);
    }

    public void resetSignature()
    {
        this.signature_ = null;
    }

    public nds.system.types.ExternData getLayer()
    {
        return layer_;
    }

    public void setLayer(nds.system.types.ExternData layer_)
    {
        this.layer_ = layer_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof DataLayer)
        {
            final DataLayer that = (DataLayer)obj;

            return
                    hasSignature_ == that.hasSignature_ &&
                    ((!isSignatureUsed()) ? !that.isSignatureUsed() :
                        ((signature_ == null) ? that.signature_ == null : signature_.equals(that.signature_))) &&
                    ((layer_ == null) ? that.layer_ == null : layer_.equals(that.layer_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, hasSignature_);
        if (isSignatureUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, signature_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, layer_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        hasSignature_ = in.readBool();

        if (getHasSignature())
        {
            in.alignTo(8);
            signature_ = in.readBitBuffer();
        }

        layer_ = new nds.system.types.ExternData(in);
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
        if (isSignatureUsed())
        {
            endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfBitBuffer(signature_);
        }
        endBitPosition = layer_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeBool(hasSignature_);

        if (isSignatureUsed())
        {
            out.alignTo(8);
            out.writeBitBuffer(signature_);
        }

        layer_.write(out);
    }

    private boolean hasSignature_;
    private zserio.runtime.io.BitBuffer signature_;
    private nds.system.types.ExternData layer_;
}
