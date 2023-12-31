/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.packaging;

public class PackagingDetails implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            signatureId_ = new zserio.runtime.array.DeltaContext();
            compressionType_ = new zserio.runtime.array.DeltaContext();
            encryptionType_ = new zserio.runtime.array.DeltaContext();
            encryptionKeyId_ = new zserio.runtime.array.DeltaContext();
            deltaEncodingDetails_ = new nds.core.packaging.DeltaEncodingDetails.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getSignatureId()
        {
            return signatureId_;
        }

        public zserio.runtime.array.DeltaContext getCompressionType()
        {
            return compressionType_;
        }

        public zserio.runtime.array.DeltaContext getEncryptionType()
        {
            return encryptionType_;
        }

        public zserio.runtime.array.DeltaContext getEncryptionKeyId()
        {
            return encryptionKeyId_;
        }

        public nds.core.packaging.DeltaEncodingDetails.ZserioPackingContext getDeltaEncodingDetails()
        {
            return deltaEncodingDetails_;
        }

        private zserio.runtime.array.DeltaContext signatureId_;
        private zserio.runtime.array.DeltaContext compressionType_;
        private zserio.runtime.array.DeltaContext encryptionType_;
        private zserio.runtime.array.DeltaContext encryptionKeyId_;
        private nds.core.packaging.DeltaEncodingDetails.ZserioPackingContext deltaEncodingDetails_;
    };

    public PackagingDetails()
    {
    }

    public PackagingDetails(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public PackagingDetails(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public PackagingDetails(
            short signatureId_,
            short compressionType_,
            short encryptionType_,
            java.lang.Integer encryptionKeyId_,
            nds.core.packaging.DeltaEncodingDetails deltaEncodingDetails_)
    {
        setSignatureId(signatureId_);
        setCompressionType(compressionType_);
        setEncryptionType(encryptionType_);
        setEncryptionKeyId(encryptionKeyId_);
        setDeltaEncodingDetails(deltaEncodingDetails_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getSignatureId().init(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(signatureId_));
        zserioContext.getCompressionType().init(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(compressionType_));
        zserioContext.getEncryptionType().init(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(encryptionType_));
        if (isEncryptionKeyIdUsed())
        {
            zserioContext.getEncryptionKeyId().init(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(encryptionKeyId_));
        }
        deltaEncodingDetails_.initPackingContext(zserioContext.getDeltaEncodingDetails());
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(signatureId_);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(compressionType_);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(encryptionType_);
        if (isEncryptionKeyIdUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(encryptionKeyId_);
        }
        endBitPosition += deltaEncodingDetails_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getSignatureId().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(signatureId_));
        endBitPosition += zserioContext.getCompressionType().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(compressionType_));
        endBitPosition += zserioContext.getEncryptionType().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(encryptionType_));
        if (isEncryptionKeyIdUsed())
        {
            endBitPosition += zserioContext.getEncryptionKeyId().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(encryptionKeyId_));
        }
        endBitPosition += deltaEncodingDetails_.bitSizeOf(zserioContext.getDeltaEncodingDetails(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public short getSignatureId()
    {
        return signatureId_;
    }

    public void setSignatureId(short signatureId_)
    {
        this.signatureId_ = signatureId_;
    }

    public short getCompressionType()
    {
        return compressionType_;
    }

    public void setCompressionType(short compressionType_)
    {
        this.compressionType_ = compressionType_;
    }

    public short getEncryptionType()
    {
        return encryptionType_;
    }

    public void setEncryptionType(short encryptionType_)
    {
        this.encryptionType_ = encryptionType_;
    }

    public java.lang.Integer getEncryptionKeyId()
    {
        return encryptionKeyId_;
    }

    public void setEncryptionKeyId(java.lang.Integer encryptionKeyId_)
    {
        this.encryptionKeyId_ = encryptionKeyId_;
    }

    public boolean isEncryptionKeyIdUsed()
    {
        return (getEncryptionType() != nds.core.packaging.NO_ENCRYPTION.NO_ENCRYPTION);
    }

    public boolean isEncryptionKeyIdSet()
    {
        return (encryptionKeyId_ != null);
    }

    public void resetEncryptionKeyId()
    {
        this.encryptionKeyId_ = null;
    }

    public nds.core.packaging.DeltaEncodingDetails getDeltaEncodingDetails()
    {
        return deltaEncodingDetails_;
    }

    public void setDeltaEncodingDetails(nds.core.packaging.DeltaEncodingDetails deltaEncodingDetails_)
    {
        this.deltaEncodingDetails_ = deltaEncodingDetails_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof PackagingDetails)
        {
            final PackagingDetails that = (PackagingDetails)obj;

            return
                    signatureId_ == that.signatureId_ &&
                    compressionType_ == that.compressionType_ &&
                    encryptionType_ == that.encryptionType_ &&
                    ((!isEncryptionKeyIdUsed()) ? !that.isEncryptionKeyIdUsed() :
                        ((encryptionKeyId_ == null) ? that.encryptionKeyId_ == null : encryptionKeyId_.equals(that.encryptionKeyId_))) &&
                    ((deltaEncodingDetails_ == null) ? that.deltaEncodingDetails_ == null : deltaEncodingDetails_.equals(that.deltaEncodingDetails_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, signatureId_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, compressionType_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, encryptionType_);
        if (isEncryptionKeyIdUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, encryptionKeyId_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, deltaEncodingDetails_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        signatureId_ = in.readVarUInt16();

        compressionType_ = in.readVarUInt16();

        encryptionType_ = in.readVarUInt16();

        if (getEncryptionType() != nds.core.packaging.NO_ENCRYPTION.NO_ENCRYPTION)
        {
            encryptionKeyId_ = in.readVarUInt32();
        }

        deltaEncodingDetails_ = new nds.core.packaging.DeltaEncodingDetails(in);

        checkConstraints();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        signatureId_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                zserioContext.getSignatureId().read(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), in)).get();

        compressionType_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                zserioContext.getCompressionType().read(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), in)).get();

        encryptionType_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                zserioContext.getEncryptionType().read(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), in)).get();

        if (getEncryptionType() != nds.core.packaging.NO_ENCRYPTION.NO_ENCRYPTION)
        {
            encryptionKeyId_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                    zserioContext.getEncryptionKeyId().read(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), in)).get();
        }

        deltaEncodingDetails_ = new nds.core.packaging.DeltaEncodingDetails(zserioContext.getDeltaEncodingDetails(), in);

        checkConstraints();
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(signatureId_);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(compressionType_);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(encryptionType_);
        if (isEncryptionKeyIdUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(encryptionKeyId_);
        }
        endBitPosition = deltaEncodingDetails_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getSignatureId().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(signatureId_));
        endBitPosition += zserioContext.getCompressionType().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(compressionType_));
        endBitPosition += zserioContext.getEncryptionType().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(encryptionType_));
        if (isEncryptionKeyIdUsed())
        {
            endBitPosition += zserioContext.getEncryptionKeyId().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(encryptionKeyId_));
        }
        endBitPosition = deltaEncodingDetails_.initializeOffsets(zserioContext.getDeltaEncodingDetails(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        checkConstraints();

        out.writeVarUInt16(signatureId_);

        out.writeVarUInt16(compressionType_);

        out.writeVarUInt16(encryptionType_);

        if (isEncryptionKeyIdUsed())
        {
            out.writeVarUInt32(encryptionKeyId_);
        }

        deltaEncodingDetails_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        checkConstraints();

        zserioContext.getSignatureId().write(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(signatureId_));

        zserioContext.getCompressionType().write(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(compressionType_));

        zserioContext.getEncryptionType().write(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(encryptionType_));

        if (isEncryptionKeyIdUsed())
        {
            zserioContext.getEncryptionKeyId().write(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.IntArrayElement(encryptionKeyId_));
        }

        deltaEncodingDetails_.write(zserioContext.getDeltaEncodingDetails(), out);
    }

    private void checkConstraints()
    {
        if (!((getEncryptionType() != nds.core.packaging.NO_ENCRYPTION.NO_ENCRYPTION && getCompressionType() != nds.core.packaging.NO_COMPRESSION.NO_COMPRESSION) || (getEncryptionType() == nds.core.packaging.NO_ENCRYPTION.NO_ENCRYPTION)))
            throw new zserio.runtime.ConstraintError("Constraint violated at PackagingDetails.encryptionType!");
    }

    private short signatureId_;
    private short compressionType_;
    private short encryptionType_;
    private java.lang.Integer encryptionKeyId_;
    private nds.core.packaging.DeltaEncodingDetails deltaEncodingDetails_;
}
