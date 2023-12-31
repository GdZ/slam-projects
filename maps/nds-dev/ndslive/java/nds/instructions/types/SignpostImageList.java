/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.instructions.types;

public class SignpostImageList implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            numSignposts_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getNumSignposts()
        {
            return numSignposts_;
        }

        private zserio.runtime.array.DeltaContext numSignposts_;
    };

    public SignpostImageList()
    {
    }

    public SignpostImageList(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public SignpostImageList(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public SignpostImageList(
            int numSignposts_,
            java.math.BigInteger[] ids_,
            nds.core.icons.IconImage[] signpost_)
    {
        setNumSignposts(numSignposts_);
        setIds(ids_);
        setSignpost(signpost_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumSignposts().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numSignposts_));
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

        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numSignposts_);
        endBitPosition += ids_.bitSizeOfPacked(endBitPosition);
        endBitPosition += signpost_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += zserioContext.getNumSignposts().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numSignposts_));
        endBitPosition += ids_.bitSizeOfPacked(endBitPosition);
        endBitPosition += signpost_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public int getNumSignposts()
    {
        return numSignposts_;
    }

    public void setNumSignposts(int numSignposts_)
    {
        this.numSignposts_ = numSignposts_;
    }

    public java.math.BigInteger[] getIds()
    {
        return (ids_ == null) ? null : ids_.getRawArray();
    }

    public void setIds(java.math.BigInteger[] ids_)
    {
        this.ids_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.BigIntegerRawArray(ids_),
                new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    public nds.core.icons.IconImage[] getSignpost()
    {
        return (signpost_ == null) ? null : signpost_.getRawArray();
    }

    public void setSignpost(nds.core.icons.IconImage[] signpost_)
    {
        this.signpost_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.icons.IconImage.class, signpost_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.icons.IconImage>(new ZserioElementFactory_signpost()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof SignpostImageList)
        {
            final SignpostImageList that = (SignpostImageList)obj;

            return
                    numSignposts_ == that.numSignposts_ &&
                    ((ids_ == null) ? that.ids_ == null : ids_.equals(that.ids_)) &&
                    ((signpost_ == null) ? that.signpost_ == null : signpost_.equals(that.signpost_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, numSignposts_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, ids_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, signpost_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        in.alignTo(8);
        numSignposts_ = in.readVarSize();

        ids_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.BigIntegerRawArray(),
                new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                zserio.runtime.array.ArrayType.NORMAL);
        ids_.readPacked(in, (int)(getNumSignposts()));

        signpost_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.icons.IconImage.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.icons.IconImage>(new ZserioElementFactory_signpost()),
                zserio.runtime.array.ArrayType.NORMAL);
        signpost_.read(in, (int)(getNumSignposts()));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        in.alignTo(8);
        numSignposts_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getNumSignposts().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

        ids_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.BigIntegerRawArray(),
                new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                zserio.runtime.array.ArrayType.NORMAL);
        ids_.readPacked(in, (int)(getNumSignposts()));

        signpost_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.icons.IconImage.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.icons.IconImage>(new ZserioElementFactory_signpost()),
                zserio.runtime.array.ArrayType.NORMAL);
        signpost_.readPacked(in, (int)(getNumSignposts()));
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

        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numSignposts_);
        endBitPosition = ids_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = signpost_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += zserioContext.getNumSignposts().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numSignposts_));
        endBitPosition = ids_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = signpost_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.alignTo(8);
        out.writeVarSize(numSignposts_);

        if (ids_.size() != (int)(getNumSignposts()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field SignpostImageList.ids: " +
                    ids_.size() + " != " + (int)(getNumSignposts()) + "!");
        }
        ids_.writePacked(out);

        if (signpost_.size() != (int)(getNumSignposts()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field SignpostImageList.signpost: " +
                    signpost_.size() + " != " + (int)(getNumSignposts()) + "!");
        }
        signpost_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        out.alignTo(8);
        zserioContext.getNumSignposts().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(numSignposts_));

        if (ids_.size() != (int)(getNumSignposts()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field SignpostImageList.ids: " +
                    ids_.size() + " != " + (int)(getNumSignposts()) + "!");
        }
        ids_.writePacked(out);

        if (signpost_.size() != (int)(getNumSignposts()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field SignpostImageList.signpost: " +
                    signpost_.size() + " != " + (int)(getNumSignposts()) + "!");
        }
        signpost_.writePacked(out);
    }

    private static final class ZserioElementFactory_signpost implements zserio.runtime.array.PackableElementFactory<nds.core.icons.IconImage>
    {
        @Override
        public nds.core.icons.IconImage create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.core.icons.IconImage(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.core.icons.IconImage.ZserioPackingContext();
        }

        @Override
        public nds.core.icons.IconImage create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.core.icons.IconImage(context, in);
        }
    }

    private int numSignposts_;
    private zserio.runtime.array.Array ids_;
    private zserio.runtime.array.Array signpost_;
}
