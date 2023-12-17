/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.adas.types;

public class ClothoidMetaData implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            adasAccuracy_ = new zserio.runtime.array.DeltaContext();
            relativeCurvatureDeviation_ = new zserio.runtime.array.DeltaContext();
            degreeOfFreedom_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getAdasAccuracy()
        {
            return adasAccuracy_;
        }

        public zserio.runtime.array.DeltaContext getRelativeCurvatureDeviation()
        {
            return relativeCurvatureDeviation_;
        }

        public zserio.runtime.array.DeltaContext getDegreeOfFreedom()
        {
            return degreeOfFreedom_;
        }

        private zserio.runtime.array.DeltaContext adasAccuracy_;
        private zserio.runtime.array.DeltaContext relativeCurvatureDeviation_;
        private zserio.runtime.array.DeltaContext degreeOfFreedom_;
    };

    public ClothoidMetaData()
    {
    }

    public ClothoidMetaData(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public ClothoidMetaData(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public ClothoidMetaData(
            nds.adas.types.AdasAccuracy adasAccuracy_,
            short relativeCurvatureDeviation_,
            int degreeOfFreedom_,
            boolean hasGradient_)
    {
        setAdasAccuracy(adasAccuracy_);
        setRelativeCurvatureDeviation(relativeCurvatureDeviation_);
        setDegreeOfFreedom(degreeOfFreedom_);
        setHasGradient(hasGradient_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        adasAccuracy_.initPackingContext(zserioContext.getAdasAccuracy());
        zserioContext.getRelativeCurvatureDeviation().init(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(relativeCurvatureDeviation_));
        zserioContext.getDegreeOfFreedom().init(new zserio.runtime.array.ArrayTraits.BitFieldIntArrayTraits((int)(16)),
                new zserio.runtime.array.ArrayElement.IntArrayElement(degreeOfFreedom_));
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

        endBitPosition += adasAccuracy_.bitSizeOf(endBitPosition);
        endBitPosition += 8;
        endBitPosition += 16;
        endBitPosition += 1;

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += adasAccuracy_.bitSizeOf(zserioContext.getAdasAccuracy(), endBitPosition);
        endBitPosition += zserioContext.getRelativeCurvatureDeviation().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(relativeCurvatureDeviation_));
        endBitPosition += zserioContext.getDegreeOfFreedom().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldIntArrayTraits((int)(16)),
                new zserio.runtime.array.ArrayElement.IntArrayElement(degreeOfFreedom_));
        endBitPosition += 1;

        return (int)(endBitPosition - bitPosition);
    }

    public nds.adas.types.AdasAccuracy getAdasAccuracy()
    {
        return adasAccuracy_;
    }

    public void setAdasAccuracy(nds.adas.types.AdasAccuracy adasAccuracy_)
    {
        this.adasAccuracy_ = adasAccuracy_;
    }

    public short getRelativeCurvatureDeviation()
    {
        return relativeCurvatureDeviation_;
    }

    public void setRelativeCurvatureDeviation(short relativeCurvatureDeviation_)
    {
        this.relativeCurvatureDeviation_ = relativeCurvatureDeviation_;
    }

    public int getDegreeOfFreedom()
    {
        return degreeOfFreedom_;
    }

    public void setDegreeOfFreedom(int degreeOfFreedom_)
    {
        this.degreeOfFreedom_ = degreeOfFreedom_;
    }

    public boolean getHasGradient()
    {
        return hasGradient_;
    }

    public void setHasGradient(boolean hasGradient_)
    {
        this.hasGradient_ = hasGradient_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof ClothoidMetaData)
        {
            final ClothoidMetaData that = (ClothoidMetaData)obj;

            return
                    ((adasAccuracy_ == null) ? that.adasAccuracy_ == null : adasAccuracy_.getValue() == that.adasAccuracy_.getValue()) &&
                    relativeCurvatureDeviation_ == that.relativeCurvatureDeviation_ &&
                    degreeOfFreedom_ == that.degreeOfFreedom_ &&
                    hasGradient_ == that.hasGradient_;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, adasAccuracy_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, relativeCurvatureDeviation_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, degreeOfFreedom_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, hasGradient_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        adasAccuracy_ = nds.adas.types.AdasAccuracy.readEnum(in);

        relativeCurvatureDeviation_ = in.readUnsignedByte();

        degreeOfFreedom_ = in.readUnsignedShort();

        hasGradient_ = in.readBool();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        adasAccuracy_ = nds.adas.types.AdasAccuracy.readEnum(zserioContext.getAdasAccuracy(), in);

        relativeCurvatureDeviation_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                zserioContext.getRelativeCurvatureDeviation().read(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), in)).get();

        degreeOfFreedom_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getDegreeOfFreedom().read(new zserio.runtime.array.ArrayTraits.BitFieldIntArrayTraits((int)(16)), in)).get();

        hasGradient_ = in.readBool();
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

        endBitPosition += adasAccuracy_.bitSizeOf(endBitPosition);
        endBitPosition += 8;
        endBitPosition += 16;
        endBitPosition += 1;

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = adasAccuracy_.initializeOffsets(zserioContext.getAdasAccuracy(), endBitPosition);
        endBitPosition += zserioContext.getRelativeCurvatureDeviation().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(relativeCurvatureDeviation_));
        endBitPosition += zserioContext.getDegreeOfFreedom().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldIntArrayTraits((int)(16)),
                new zserio.runtime.array.ArrayElement.IntArrayElement(degreeOfFreedom_));
        endBitPosition += 1;

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        adasAccuracy_.write(out);

        out.writeUnsignedByte(relativeCurvatureDeviation_);

        out.writeUnsignedShort(degreeOfFreedom_);

        out.writeBool(hasGradient_);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        adasAccuracy_.write(zserioContext.getAdasAccuracy(), out);

        zserioContext.getRelativeCurvatureDeviation().write(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(relativeCurvatureDeviation_));

        zserioContext.getDegreeOfFreedom().write(new zserio.runtime.array.ArrayTraits.BitFieldIntArrayTraits((int)(16)), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(degreeOfFreedom_));

        out.writeBool(hasGradient_);
    }

    private nds.adas.types.AdasAccuracy adasAccuracy_;
    private short relativeCurvatureDeviation_;
    private int degreeOfFreedom_;
    private boolean hasGradient_;
}
