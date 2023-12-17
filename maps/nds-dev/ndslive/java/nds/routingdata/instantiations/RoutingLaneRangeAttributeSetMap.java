/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.routingdata.instantiations;

public class RoutingLaneRangeAttributeSetMap implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            attributeSet_ = new nds.routingdata.instantiations.RoutingLaneRangeAttributeSet.ZserioPackingContext();
            feature_ = new zserio.runtime.array.DeltaContext();
        }

        public nds.routingdata.instantiations.RoutingLaneRangeAttributeSet.ZserioPackingContext getAttributeSet()
        {
            return attributeSet_;
        }

        public zserio.runtime.array.DeltaContext getFeature()
        {
            return feature_;
        }

        private nds.routingdata.instantiations.RoutingLaneRangeAttributeSet.ZserioPackingContext attributeSet_;
        private zserio.runtime.array.DeltaContext feature_;
    };

    public RoutingLaneRangeAttributeSetMap(
            byte coordShift_)
    {
        this.coordShift_ = coordShift_;
    }

    public RoutingLaneRangeAttributeSetMap(zserio.runtime.io.BitStreamReader in,
            byte coordShift_)
            throws java.io.IOException
    {
        this.coordShift_ = coordShift_;

        read(in);
    }

    public RoutingLaneRangeAttributeSetMap(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            byte coordShift_)
            throws java.io.IOException
    {
        this.coordShift_ = coordShift_;

        read(context, in);
    }

    public RoutingLaneRangeAttributeSetMap(
            byte coordShift_,
            nds.routingdata.instantiations.RoutingLaneRangeAttributeSet attributeSet_,
            int feature_,
            nds.core.types.Var4ByteId[] references_,
            nds.lane.reference.types.LaneGroupRangeValidity[] validities_)
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

    public nds.routingdata.instantiations.RoutingLaneRangeAttributeSet getAttributeSet()
    {
        return attributeSet_;
    }

    public void setAttributeSet(nds.routingdata.instantiations.RoutingLaneRangeAttributeSet attributeSet_)
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

    public nds.core.types.Var4ByteId[] getReferences()
    {
        return (references_ == null) ? null : references_.getRawArray();
    }

    public void setReferences(nds.core.types.Var4ByteId[] references_)
    {
        this.references_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Var4ByteId.class, references_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Var4ByteId>(new ZserioElementFactory_references()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    public nds.lane.reference.types.LaneGroupRangeValidity[] getValidities()
    {
        return (validities_ == null) ? null : validities_.getRawArray();
    }

    public void setValidities(nds.lane.reference.types.LaneGroupRangeValidity[] validities_)
    {
        this.validities_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.reference.types.LaneGroupRangeValidity.class, validities_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.reference.types.LaneGroupRangeValidity>(new ZserioElementFactory_validities()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RoutingLaneRangeAttributeSetMap)
        {
            final RoutingLaneRangeAttributeSetMap that = (RoutingLaneRangeAttributeSetMap)obj;

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
        attributeSet_ = new nds.routingdata.instantiations.RoutingLaneRangeAttributeSet(in);

        feature_ = in.readVarSize();

        references_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Var4ByteId.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Var4ByteId>(new ZserioElementFactory_references()),
                zserio.runtime.array.ArrayType.NORMAL);
        references_.readPacked(in, (int)(getFeature()));

        in.alignTo(8);
        validities_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.reference.types.LaneGroupRangeValidity.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.reference.types.LaneGroupRangeValidity>(new ZserioElementFactory_validities()),
                zserio.runtime.array.ArrayType.NORMAL);
        validities_.readPacked(in, (int)(getFeature()));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        attributeSet_ = new nds.routingdata.instantiations.RoutingLaneRangeAttributeSet(zserioContext.getAttributeSet(), in);

        feature_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getFeature().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

        references_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Var4ByteId.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Var4ByteId>(new ZserioElementFactory_references()),
                zserio.runtime.array.ArrayType.NORMAL);
        references_.readPacked(in, (int)(getFeature()));

        in.alignTo(8);
        validities_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.reference.types.LaneGroupRangeValidity.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.reference.types.LaneGroupRangeValidity>(new ZserioElementFactory_validities()),
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
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RoutingLaneRangeAttributeSetMap.references: " +
                    references_.size() + " != " + (int)(getFeature()) + "!");
        }
        references_.writePacked(out);

        out.alignTo(8);
        if (validities_.size() != (int)(getFeature()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RoutingLaneRangeAttributeSetMap.validities: " +
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
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RoutingLaneRangeAttributeSetMap.references: " +
                    references_.size() + " != " + (int)(getFeature()) + "!");
        }
        references_.writePacked(out);

        out.alignTo(8);
        if (validities_.size() != (int)(getFeature()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RoutingLaneRangeAttributeSetMap.validities: " +
                    validities_.size() + " != " + (int)(getFeature()) + "!");
        }
        validities_.writePacked(out);
    }

    private static final class ZserioElementFactory_references implements zserio.runtime.array.PackableElementFactory<nds.core.types.Var4ByteId>
    {
        @Override
        public nds.core.types.Var4ByteId create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.core.types.Var4ByteId(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.core.types.Var4ByteId.ZserioPackingContext();
        }

        @Override
        public nds.core.types.Var4ByteId create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.core.types.Var4ByteId(context, in);
        }
    }

    private final class ZserioElementFactory_validities implements zserio.runtime.array.PackableElementFactory<nds.lane.reference.types.LaneGroupRangeValidity>
    {
        @Override
        public nds.lane.reference.types.LaneGroupRangeValidity create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.lane.reference.types.LaneGroupRangeValidity(in, (byte)(getCoordShift()));
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.lane.reference.types.LaneGroupRangeValidity.ZserioPackingContext();
        }

        @Override
        public nds.lane.reference.types.LaneGroupRangeValidity create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.lane.reference.types.LaneGroupRangeValidity(context, in, (byte)(getCoordShift()));
        }
    }

    private final byte coordShift_;
    private nds.routingdata.instantiations.RoutingLaneRangeAttributeSet attributeSet_;
    private int feature_;
    private zserio.runtime.array.Array references_;
    private zserio.runtime.array.Array validities_;
}
