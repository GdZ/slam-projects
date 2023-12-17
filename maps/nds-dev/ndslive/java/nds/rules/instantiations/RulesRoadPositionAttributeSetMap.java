/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.rules.instantiations;

public class RulesRoadPositionAttributeSetMap implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            attributeSet_ = new nds.rules.instantiations.RulesRoadPositionAttributeSet.ZserioPackingContext();
            feature_ = new zserio.runtime.array.DeltaContext();
        }

        public nds.rules.instantiations.RulesRoadPositionAttributeSet.ZserioPackingContext getAttributeSet()
        {
            return attributeSet_;
        }

        public zserio.runtime.array.DeltaContext getFeature()
        {
            return feature_;
        }

        private nds.rules.instantiations.RulesRoadPositionAttributeSet.ZserioPackingContext attributeSet_;
        private zserio.runtime.array.DeltaContext feature_;
    };

    public RulesRoadPositionAttributeSetMap(
            byte coordShift_)
    {
        this.coordShift_ = coordShift_;
    }

    public RulesRoadPositionAttributeSetMap(zserio.runtime.io.BitStreamReader in,
            byte coordShift_)
            throws java.io.IOException
    {
        this.coordShift_ = coordShift_;

        read(in);
    }

    public RulesRoadPositionAttributeSetMap(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            byte coordShift_)
            throws java.io.IOException
    {
        this.coordShift_ = coordShift_;

        read(context, in);
    }

    public RulesRoadPositionAttributeSetMap(
            byte coordShift_,
            nds.rules.instantiations.RulesRoadPositionAttributeSet attributeSet_,
            int feature_,
            nds.road.reference.types.RoadReference[] references_,
            nds.road.reference.types.RoadPositionValidity[] validities_)
    {
        this(coordShift_);

        setAttributeSet(attributeSet_);
        setFeature(feature_);
        setReferences(references_);
        setValidities(validities_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        attributeSet_.initPackingContext(zserioContext.getAttributeSet());
        zserioContext.getFeature().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(feature_));
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

        endBitPosition += attributeSet_.bitSizeOf(endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(feature_);
        endBitPosition += references_.bitSizeOfPacked(endBitPosition);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += validities_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += attributeSet_.bitSizeOf(zserioContext.getAttributeSet(), endBitPosition);
        endBitPosition += zserioContext.getFeature().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(feature_));
        endBitPosition += references_.bitSizeOfPacked(endBitPosition);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += validities_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public byte getCoordShift()
    {
        return this.coordShift_;
    }

    public nds.rules.instantiations.RulesRoadPositionAttributeSet getAttributeSet()
    {
        return attributeSet_;
    }

    public void setAttributeSet(nds.rules.instantiations.RulesRoadPositionAttributeSet attributeSet_)
    {
        this.attributeSet_ = attributeSet_;
    }

    public int getFeature()
    {
        return feature_;
    }

    public void setFeature(int feature_)
    {
        this.feature_ = feature_;
    }

    public nds.road.reference.types.RoadReference[] getReferences()
    {
        return (references_ == null) ? null : references_.getRawArray();
    }

    public void setReferences(nds.road.reference.types.RoadReference[] references_)
    {
        this.references_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.road.reference.types.RoadReference.class, references_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.road.reference.types.RoadReference>(new ZserioElementFactory_references()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    public nds.road.reference.types.RoadPositionValidity[] getValidities()
    {
        return (validities_ == null) ? null : validities_.getRawArray();
    }

    public void setValidities(nds.road.reference.types.RoadPositionValidity[] validities_)
    {
        this.validities_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.road.reference.types.RoadPositionValidity.class, validities_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.road.reference.types.RoadPositionValidity>(new ZserioElementFactory_validities()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RulesRoadPositionAttributeSetMap)
        {
            final RulesRoadPositionAttributeSetMap that = (RulesRoadPositionAttributeSetMap)obj;

            return
                    this.coordShift_ == that.coordShift_ &&
                    ((attributeSet_ == null) ? that.attributeSet_ == null : attributeSet_.equals(that.attributeSet_)) &&
                    feature_ == that.feature_ &&
                    ((references_ == null) ? that.references_ == null : references_.equals(that.references_)) &&
                    ((validities_ == null) ? that.validities_ == null : validities_.equals(that.validities_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getCoordShift());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, attributeSet_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, feature_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, references_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, validities_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        attributeSet_ = new nds.rules.instantiations.RulesRoadPositionAttributeSet(in);

        feature_ = in.readVarSize();

        references_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.road.reference.types.RoadReference.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.road.reference.types.RoadReference>(new ZserioElementFactory_references()),
                zserio.runtime.array.ArrayType.NORMAL);
        references_.readPacked(in, (int)(getFeature()));

        in.alignTo(8);
        validities_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.road.reference.types.RoadPositionValidity.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.road.reference.types.RoadPositionValidity>(new ZserioElementFactory_validities()),
                zserio.runtime.array.ArrayType.NORMAL);
        validities_.readPacked(in, (int)(getFeature()));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        attributeSet_ = new nds.rules.instantiations.RulesRoadPositionAttributeSet(zserioContext.getAttributeSet(), in);

        feature_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getFeature().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

        references_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.road.reference.types.RoadReference.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.road.reference.types.RoadReference>(new ZserioElementFactory_references()),
                zserio.runtime.array.ArrayType.NORMAL);
        references_.readPacked(in, (int)(getFeature()));

        in.alignTo(8);
        validities_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.road.reference.types.RoadPositionValidity.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.road.reference.types.RoadPositionValidity>(new ZserioElementFactory_validities()),
                zserio.runtime.array.ArrayType.NORMAL);
        validities_.readPacked(in, (int)(getFeature()));
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

        endBitPosition = attributeSet_.initializeOffsets(endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(feature_);
        endBitPosition = references_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition = validities_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = attributeSet_.initializeOffsets(zserioContext.getAttributeSet(), endBitPosition);
        endBitPosition += zserioContext.getFeature().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(feature_));
        endBitPosition = references_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition = validities_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        attributeSet_.write(out);

        out.writeVarSize(feature_);

        if (references_.size() != (int)(getFeature()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RulesRoadPositionAttributeSetMap.references: " +
                    references_.size() + " != " + (int)(getFeature()) + "!");
        }
        references_.writePacked(out);

        out.alignTo(8);
        if (validities_.size() != (int)(getFeature()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RulesRoadPositionAttributeSetMap.validities: " +
                    validities_.size() + " != " + (int)(getFeature()) + "!");
        }
        validities_.writePacked(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        attributeSet_.write(zserioContext.getAttributeSet(), out);

        zserioContext.getFeature().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(feature_));

        if (references_.size() != (int)(getFeature()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RulesRoadPositionAttributeSetMap.references: " +
                    references_.size() + " != " + (int)(getFeature()) + "!");
        }
        references_.writePacked(out);

        out.alignTo(8);
        if (validities_.size() != (int)(getFeature()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RulesRoadPositionAttributeSetMap.validities: " +
                    validities_.size() + " != " + (int)(getFeature()) + "!");
        }
        validities_.writePacked(out);
    }

    private static final class ZserioElementFactory_references implements zserio.runtime.array.PackableElementFactory<nds.road.reference.types.RoadReference>
    {
        @Override
        public nds.road.reference.types.RoadReference create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.road.reference.types.RoadReference(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.road.reference.types.RoadReference.ZserioPackingContext();
        }

        @Override
        public nds.road.reference.types.RoadReference create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.road.reference.types.RoadReference(context, in);
        }
    }

    private final class ZserioElementFactory_validities implements zserio.runtime.array.PackableElementFactory<nds.road.reference.types.RoadPositionValidity>
    {
        @Override
        public nds.road.reference.types.RoadPositionValidity create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.road.reference.types.RoadPositionValidity(in, (byte)(getCoordShift()));
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.road.reference.types.RoadPositionValidity.ZserioPackingContext();
        }

        @Override
        public nds.road.reference.types.RoadPositionValidity create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.road.reference.types.RoadPositionValidity(context, in, (byte)(getCoordShift()));
        }
    }

    private final byte coordShift_;
    private nds.rules.instantiations.RulesRoadPositionAttributeSet attributeSet_;
    private int feature_;
    private zserio.runtime.array.Array references_;
    private zserio.runtime.array.Array validities_;
}
