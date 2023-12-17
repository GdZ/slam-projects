/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.rules.instantiations;

public class RulesLaneRangeAttributeSet implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            numEntries_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getNumEntries()
        {
            return numEntries_;
        }

        private zserio.runtime.array.DeltaContext numEntries_;
    };

    public RulesLaneRangeAttributeSet()
    {
    }

    public RulesLaneRangeAttributeSet(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RulesLaneRangeAttributeSet(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RulesLaneRangeAttributeSet(
            int numEntries_,
            nds.rules.instantiations.RulesLaneRangeFullAttribute[] attributes_)
    {
        setNumEntries(numEntries_);
        setAttributes(attributes_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumEntries().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numEntries_));
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numEntries_);
        endBitPosition += attributes_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumEntries().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numEntries_));
        endBitPosition += attributes_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public int getNumEntries()
    {
        return numEntries_;
    }

    public void setNumEntries(int numEntries_)
    {
        this.numEntries_ = numEntries_;
    }

    public nds.rules.instantiations.RulesLaneRangeFullAttribute[] getAttributes()
    {
        return (attributes_ == null) ? null : attributes_.getRawArray();
    }

    public void setAttributes(nds.rules.instantiations.RulesLaneRangeFullAttribute[] attributes_)
    {
        this.attributes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.rules.instantiations.RulesLaneRangeFullAttribute.class, attributes_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.rules.instantiations.RulesLaneRangeFullAttribute>(new ZserioElementFactory_attributes()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RulesLaneRangeAttributeSet)
        {
            final RulesLaneRangeAttributeSet that = (RulesLaneRangeAttributeSet)obj;

            return
                    numEntries_ == that.numEntries_ &&
                    ((attributes_ == null) ? that.attributes_ == null : attributes_.equals(that.attributes_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, numEntries_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, attributes_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        numEntries_ = in.readVarSize();

        attributes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.rules.instantiations.RulesLaneRangeFullAttribute.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.rules.instantiations.RulesLaneRangeFullAttribute>(new ZserioElementFactory_attributes()),
                zserio.runtime.array.ArrayType.NORMAL);
        attributes_.readPacked(in, (int)(getNumEntries()));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        numEntries_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getNumEntries().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

        attributes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.rules.instantiations.RulesLaneRangeFullAttribute.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.rules.instantiations.RulesLaneRangeFullAttribute>(new ZserioElementFactory_attributes()),
                zserio.runtime.array.ArrayType.NORMAL);
        attributes_.readPacked(in, (int)(getNumEntries()));
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numEntries_);
        endBitPosition = attributes_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumEntries().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numEntries_));
        endBitPosition = attributes_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarSize(numEntries_);

        if (attributes_.size() != (int)(getNumEntries()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RulesLaneRangeAttributeSet.attributes: " +
                    attributes_.size() + " != " + (int)(getNumEntries()) + "!");
        }
        attributes_.writePacked(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumEntries().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(numEntries_));

        if (attributes_.size() != (int)(getNumEntries()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RulesLaneRangeAttributeSet.attributes: " +
                    attributes_.size() + " != " + (int)(getNumEntries()) + "!");
        }
        attributes_.writePacked(out);
    }

    private static final class ZserioElementFactory_attributes implements zserio.runtime.array.PackableElementFactory<nds.rules.instantiations.RulesLaneRangeFullAttribute>
    {
        @Override
        public nds.rules.instantiations.RulesLaneRangeFullAttribute create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.rules.instantiations.RulesLaneRangeFullAttribute(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.rules.instantiations.RulesLaneRangeFullAttribute.ZserioPackingContext();
        }

        @Override
        public nds.rules.instantiations.RulesLaneRangeFullAttribute create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.rules.instantiations.RulesLaneRangeFullAttribute(context, in);
        }
    }

    private int numEntries_;
    private zserio.runtime.array.Array attributes_;
}
