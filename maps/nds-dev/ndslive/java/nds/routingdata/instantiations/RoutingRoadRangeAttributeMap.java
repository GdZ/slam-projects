/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.routingdata.instantiations;

public class RoutingRoadRangeAttributeMap implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            attributeTypeCode_ = new zserio.runtime.array.DeltaContext();
            feature_ = new zserio.runtime.array.DeltaContext();
            attribute_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getAttributeTypeCode()
        {
            return attributeTypeCode_;
        }

        public zserio.runtime.array.DeltaContext getFeature()
        {
            return feature_;
        }

        public zserio.runtime.array.DeltaContext getAttribute()
        {
            return attribute_;
        }

        private zserio.runtime.array.DeltaContext attributeTypeCode_;
        private zserio.runtime.array.DeltaContext feature_;
        private zserio.runtime.array.DeltaContext attribute_;
    };

    public RoutingRoadRangeAttributeMap(
            byte coordShift_)
    {
        this.coordShift_ = coordShift_;
    }

    public RoutingRoadRangeAttributeMap(zserio.runtime.io.BitStreamReader in,
            byte coordShift_)
            throws java.io.IOException
    {
        this.coordShift_ = coordShift_;

        read(in);
    }

    public RoutingRoadRangeAttributeMap(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            byte coordShift_)
            throws java.io.IOException
    {
        this.coordShift_ = coordShift_;

        read(context, in);
    }

    public RoutingRoadRangeAttributeMap(
            byte coordShift_,
            nds.routingdata.attributes.RoutingRoadRangeAttributeType attributeTypeCode_,
            int feature_,
            nds.road.reference.types.RoadReference[] featureReferences_,
            nds.road.reference.types.RoadRangeValidity[] featureValidities_,
            int[] featureValuePtr_,
            int attribute_,
            nds.routingdata.instantiations.RoutingRoadRangeAttribute[] attributeValues_,
            nds.routingdata.instantiations.RoutingPropertyList[] attributeProperties_,
            nds.core.attributemap.ConditionList[] attributeConditions_)
    {
        this(coordShift_);

        setAttributeTypeCode(attributeTypeCode_);
        setFeature(feature_);
        setFeatureReferences(featureReferences_);
        setFeatureValidities(featureValidities_);
        setFeatureValuePtr(featureValuePtr_);
        setAttribute(attribute_);
        setAttributeValues(attributeValues_);
        setAttributeProperties(attributeProperties_);
        setAttributeConditions(attributeConditions_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        attributeTypeCode_.initPackingContext(zserioContext.getAttributeTypeCode());
        zserioContext.getFeature().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(feature_));
        zserioContext.getAttribute().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(attribute_));
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

        endBitPosition += attributeTypeCode_.bitSizeOf(endBitPosition);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(feature_);
        endBitPosition += featureReferences_.bitSizeOfPacked(endBitPosition);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += featureValidities_.bitSizeOfPacked(endBitPosition);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += featureValuePtr_.bitSizeOfPacked(endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(attribute_);
        endBitPosition += attributeValues_.bitSizeOfPacked(endBitPosition);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += attributeProperties_.bitSizeOfPacked(endBitPosition);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += attributeConditions_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += attributeTypeCode_.bitSizeOf(zserioContext.getAttributeTypeCode(), endBitPosition);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += zserioContext.getFeature().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(feature_));
        endBitPosition += featureReferences_.bitSizeOfPacked(endBitPosition);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += featureValidities_.bitSizeOfPacked(endBitPosition);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += featureValuePtr_.bitSizeOfPacked(endBitPosition);
        endBitPosition += zserioContext.getAttribute().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(attribute_));
        endBitPosition += attributeValues_.bitSizeOfPacked(endBitPosition);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += attributeProperties_.bitSizeOfPacked(endBitPosition);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += attributeConditions_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public byte getCoordShift()
    {
        return this.coordShift_;
    }

    public nds.routingdata.attributes.RoutingRoadRangeAttributeType getAttributeTypeCode()
    {
        return attributeTypeCode_;
    }

    public void setAttributeTypeCode(nds.routingdata.attributes.RoutingRoadRangeAttributeType attributeTypeCode_)
    {
        this.attributeTypeCode_ = attributeTypeCode_;
    }

    public int getFeature()
    {
        return feature_;
    }

    public void setFeature(int feature_)
    {
        this.feature_ = feature_;
    }

    public nds.road.reference.types.RoadReference[] getFeatureReferences()
    {
        return (featureReferences_ == null) ? null : featureReferences_.getRawArray();
    }

    public void setFeatureReferences(nds.road.reference.types.RoadReference[] featureReferences_)
    {
        this.featureReferences_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.road.reference.types.RoadReference.class, featureReferences_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.road.reference.types.RoadReference>(new ZserioElementFactory_featureReferences()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    public nds.road.reference.types.RoadRangeValidity[] getFeatureValidities()
    {
        return (featureValidities_ == null) ? null : featureValidities_.getRawArray();
    }

    public void setFeatureValidities(nds.road.reference.types.RoadRangeValidity[] featureValidities_)
    {
        this.featureValidities_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.road.reference.types.RoadRangeValidity.class, featureValidities_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.road.reference.types.RoadRangeValidity>(new ZserioElementFactory_featureValidities()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    public int[] getFeatureValuePtr()
    {
        return (featureValuePtr_ == null) ? null : featureValuePtr_.getRawArray();
    }

    public void setFeatureValuePtr(int[] featureValuePtr_)
    {
        this.featureValuePtr_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.IntRawArray(featureValuePtr_),
                new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    public int getAttribute()
    {
        return attribute_;
    }

    public void setAttribute(int attribute_)
    {
        this.attribute_ = attribute_;
    }

    public nds.routingdata.instantiations.RoutingRoadRangeAttribute[] getAttributeValues()
    {
        return (attributeValues_ == null) ? null : attributeValues_.getRawArray();
    }

    public void setAttributeValues(nds.routingdata.instantiations.RoutingRoadRangeAttribute[] attributeValues_)
    {
        this.attributeValues_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.routingdata.instantiations.RoutingRoadRangeAttribute.class, attributeValues_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.routingdata.instantiations.RoutingRoadRangeAttribute>(new ZserioElementFactory_attributeValues()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    public nds.routingdata.instantiations.RoutingPropertyList[] getAttributeProperties()
    {
        return (attributeProperties_ == null) ? null : attributeProperties_.getRawArray();
    }

    public void setAttributeProperties(nds.routingdata.instantiations.RoutingPropertyList[] attributeProperties_)
    {
        this.attributeProperties_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.routingdata.instantiations.RoutingPropertyList.class, attributeProperties_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.routingdata.instantiations.RoutingPropertyList>(new ZserioElementFactory_attributeProperties()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    public nds.core.attributemap.ConditionList[] getAttributeConditions()
    {
        return (attributeConditions_ == null) ? null : attributeConditions_.getRawArray();
    }

    public void setAttributeConditions(nds.core.attributemap.ConditionList[] attributeConditions_)
    {
        this.attributeConditions_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.attributemap.ConditionList.class, attributeConditions_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.attributemap.ConditionList>(new ZserioElementFactory_attributeConditions()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RoutingRoadRangeAttributeMap)
        {
            final RoutingRoadRangeAttributeMap that = (RoutingRoadRangeAttributeMap)obj;

            return
                    this.coordShift_ == that.coordShift_ &&
                    ((attributeTypeCode_ == null) ? that.attributeTypeCode_ == null : attributeTypeCode_.getValue() == that.attributeTypeCode_.getValue()) &&
                    feature_ == that.feature_ &&
                    ((featureReferences_ == null) ? that.featureReferences_ == null : featureReferences_.equals(that.featureReferences_)) &&
                    ((featureValidities_ == null) ? that.featureValidities_ == null : featureValidities_.equals(that.featureValidities_)) &&
                    ((featureValuePtr_ == null) ? that.featureValuePtr_ == null : featureValuePtr_.equals(that.featureValuePtr_)) &&
                    attribute_ == that.attribute_ &&
                    ((attributeValues_ == null) ? that.attributeValues_ == null : attributeValues_.equals(that.attributeValues_)) &&
                    ((attributeProperties_ == null) ? that.attributeProperties_ == null : attributeProperties_.equals(that.attributeProperties_)) &&
                    ((attributeConditions_ == null) ? that.attributeConditions_ == null : attributeConditions_.equals(that.attributeConditions_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getCoordShift());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, attributeTypeCode_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, feature_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, featureReferences_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, featureValidities_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, featureValuePtr_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, attribute_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, attributeValues_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, attributeProperties_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, attributeConditions_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        attributeTypeCode_ = nds.routingdata.attributes.RoutingRoadRangeAttributeType.readEnum(in);

        in.alignTo(8);
        feature_ = in.readVarSize();

        featureReferences_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.road.reference.types.RoadReference.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.road.reference.types.RoadReference>(new ZserioElementFactory_featureReferences()),
                zserio.runtime.array.ArrayType.NORMAL);
        featureReferences_.readPacked(in, (int)(getFeature()));

        in.alignTo(8);
        featureValidities_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.road.reference.types.RoadRangeValidity.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.road.reference.types.RoadRangeValidity>(new ZserioElementFactory_featureValidities()),
                zserio.runtime.array.ArrayType.NORMAL);
        featureValidities_.readPacked(in, (int)(getFeature()));

        in.alignTo(8);
        featureValuePtr_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.IntRawArray(),
                new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                zserio.runtime.array.ArrayType.NORMAL);
        featureValuePtr_.readPacked(in, (int)(getFeature()));

        attribute_ = in.readVarSize();

        attributeValues_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.routingdata.instantiations.RoutingRoadRangeAttribute.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.routingdata.instantiations.RoutingRoadRangeAttribute>(new ZserioElementFactory_attributeValues()),
                zserio.runtime.array.ArrayType.NORMAL);
        attributeValues_.readPacked(in, (int)(getAttribute()));

        in.alignTo(8);
        attributeProperties_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.routingdata.instantiations.RoutingPropertyList.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.routingdata.instantiations.RoutingPropertyList>(new ZserioElementFactory_attributeProperties()),
                zserio.runtime.array.ArrayType.NORMAL);
        attributeProperties_.readPacked(in, (int)(getAttribute()));

        in.alignTo(8);
        attributeConditions_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.attributemap.ConditionList.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.attributemap.ConditionList>(new ZserioElementFactory_attributeConditions()),
                zserio.runtime.array.ArrayType.NORMAL);
        attributeConditions_.readPacked(in, (int)(getAttribute()));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        attributeTypeCode_ = nds.routingdata.attributes.RoutingRoadRangeAttributeType.readEnum(zserioContext.getAttributeTypeCode(), in);

        in.alignTo(8);
        feature_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getFeature().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

        featureReferences_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.road.reference.types.RoadReference.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.road.reference.types.RoadReference>(new ZserioElementFactory_featureReferences()),
                zserio.runtime.array.ArrayType.NORMAL);
        featureReferences_.readPacked(in, (int)(getFeature()));

        in.alignTo(8);
        featureValidities_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.road.reference.types.RoadRangeValidity.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.road.reference.types.RoadRangeValidity>(new ZserioElementFactory_featureValidities()),
                zserio.runtime.array.ArrayType.NORMAL);
        featureValidities_.readPacked(in, (int)(getFeature()));

        in.alignTo(8);
        featureValuePtr_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.IntRawArray(),
                new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                zserio.runtime.array.ArrayType.NORMAL);
        featureValuePtr_.readPacked(in, (int)(getFeature()));

        attribute_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getAttribute().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

        attributeValues_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.routingdata.instantiations.RoutingRoadRangeAttribute.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.routingdata.instantiations.RoutingRoadRangeAttribute>(new ZserioElementFactory_attributeValues()),
                zserio.runtime.array.ArrayType.NORMAL);
        attributeValues_.readPacked(in, (int)(getAttribute()));

        in.alignTo(8);
        attributeProperties_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.routingdata.instantiations.RoutingPropertyList.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.routingdata.instantiations.RoutingPropertyList>(new ZserioElementFactory_attributeProperties()),
                zserio.runtime.array.ArrayType.NORMAL);
        attributeProperties_.readPacked(in, (int)(getAttribute()));

        in.alignTo(8);
        attributeConditions_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.attributemap.ConditionList.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.attributemap.ConditionList>(new ZserioElementFactory_attributeConditions()),
                zserio.runtime.array.ArrayType.NORMAL);
        attributeConditions_.readPacked(in, (int)(getAttribute()));
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

        endBitPosition += attributeTypeCode_.bitSizeOf(endBitPosition);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(feature_);
        endBitPosition = featureReferences_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition = featureValidities_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition = featureValuePtr_.initializeOffsetsPacked(endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(attribute_);
        endBitPosition = attributeValues_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition = attributeProperties_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition = attributeConditions_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = attributeTypeCode_.initializeOffsets(zserioContext.getAttributeTypeCode(), endBitPosition);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += zserioContext.getFeature().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(feature_));
        endBitPosition = featureReferences_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition = featureValidities_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition = featureValuePtr_.initializeOffsetsPacked(endBitPosition);
        endBitPosition += zserioContext.getAttribute().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(attribute_));
        endBitPosition = attributeValues_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition = attributeProperties_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition = attributeConditions_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        attributeTypeCode_.write(out);

        out.alignTo(8);
        out.writeVarSize(feature_);

        if (featureReferences_.size() != (int)(getFeature()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RoutingRoadRangeAttributeMap.featureReferences: " +
                    featureReferences_.size() + " != " + (int)(getFeature()) + "!");
        }
        featureReferences_.writePacked(out);

        out.alignTo(8);
        if (featureValidities_.size() != (int)(getFeature()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RoutingRoadRangeAttributeMap.featureValidities: " +
                    featureValidities_.size() + " != " + (int)(getFeature()) + "!");
        }
        featureValidities_.writePacked(out);

        out.alignTo(8);
        if (featureValuePtr_.size() != (int)(getFeature()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RoutingRoadRangeAttributeMap.featureValuePtr: " +
                    featureValuePtr_.size() + " != " + (int)(getFeature()) + "!");
        }
        featureValuePtr_.writePacked(out);

        out.writeVarSize(attribute_);

        if (attributeValues_.size() != (int)(getAttribute()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RoutingRoadRangeAttributeMap.attributeValues: " +
                    attributeValues_.size() + " != " + (int)(getAttribute()) + "!");
        }
        attributeValues_.writePacked(out);

        out.alignTo(8);
        if (attributeProperties_.size() != (int)(getAttribute()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RoutingRoadRangeAttributeMap.attributeProperties: " +
                    attributeProperties_.size() + " != " + (int)(getAttribute()) + "!");
        }
        attributeProperties_.writePacked(out);

        out.alignTo(8);
        if (attributeConditions_.size() != (int)(getAttribute()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RoutingRoadRangeAttributeMap.attributeConditions: " +
                    attributeConditions_.size() + " != " + (int)(getAttribute()) + "!");
        }
        attributeConditions_.writePacked(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        attributeTypeCode_.write(zserioContext.getAttributeTypeCode(), out);

        out.alignTo(8);
        zserioContext.getFeature().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(feature_));

        if (featureReferences_.size() != (int)(getFeature()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RoutingRoadRangeAttributeMap.featureReferences: " +
                    featureReferences_.size() + " != " + (int)(getFeature()) + "!");
        }
        featureReferences_.writePacked(out);

        out.alignTo(8);
        if (featureValidities_.size() != (int)(getFeature()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RoutingRoadRangeAttributeMap.featureValidities: " +
                    featureValidities_.size() + " != " + (int)(getFeature()) + "!");
        }
        featureValidities_.writePacked(out);

        out.alignTo(8);
        if (featureValuePtr_.size() != (int)(getFeature()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RoutingRoadRangeAttributeMap.featureValuePtr: " +
                    featureValuePtr_.size() + " != " + (int)(getFeature()) + "!");
        }
        featureValuePtr_.writePacked(out);

        zserioContext.getAttribute().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(attribute_));

        if (attributeValues_.size() != (int)(getAttribute()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RoutingRoadRangeAttributeMap.attributeValues: " +
                    attributeValues_.size() + " != " + (int)(getAttribute()) + "!");
        }
        attributeValues_.writePacked(out);

        out.alignTo(8);
        if (attributeProperties_.size() != (int)(getAttribute()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RoutingRoadRangeAttributeMap.attributeProperties: " +
                    attributeProperties_.size() + " != " + (int)(getAttribute()) + "!");
        }
        attributeProperties_.writePacked(out);

        out.alignTo(8);
        if (attributeConditions_.size() != (int)(getAttribute()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RoutingRoadRangeAttributeMap.attributeConditions: " +
                    attributeConditions_.size() + " != " + (int)(getAttribute()) + "!");
        }
        attributeConditions_.writePacked(out);
    }

    private static final class ZserioElementFactory_featureReferences implements zserio.runtime.array.PackableElementFactory<nds.road.reference.types.RoadReference>
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

    private final class ZserioElementFactory_featureValidities implements zserio.runtime.array.PackableElementFactory<nds.road.reference.types.RoadRangeValidity>
    {
        @Override
        public nds.road.reference.types.RoadRangeValidity create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.road.reference.types.RoadRangeValidity(in, (byte)(getCoordShift()));
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.road.reference.types.RoadRangeValidity.ZserioPackingContext();
        }

        @Override
        public nds.road.reference.types.RoadRangeValidity create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.road.reference.types.RoadRangeValidity(context, in, (byte)(getCoordShift()));
        }
    }

    private final class ZserioElementFactory_attributeValues implements zserio.runtime.array.PackableElementFactory<nds.routingdata.instantiations.RoutingRoadRangeAttribute>
    {
        @Override
        public nds.routingdata.instantiations.RoutingRoadRangeAttribute create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.routingdata.instantiations.RoutingRoadRangeAttribute(in, getAttributeTypeCode());
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.routingdata.instantiations.RoutingRoadRangeAttribute.ZserioPackingContext();
        }

        @Override
        public nds.routingdata.instantiations.RoutingRoadRangeAttribute create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.routingdata.instantiations.RoutingRoadRangeAttribute(context, in, getAttributeTypeCode());
        }
    }

    private static final class ZserioElementFactory_attributeProperties implements zserio.runtime.array.PackableElementFactory<nds.routingdata.instantiations.RoutingPropertyList>
    {
        @Override
        public nds.routingdata.instantiations.RoutingPropertyList create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.routingdata.instantiations.RoutingPropertyList(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.routingdata.instantiations.RoutingPropertyList.ZserioPackingContext();
        }

        @Override
        public nds.routingdata.instantiations.RoutingPropertyList create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.routingdata.instantiations.RoutingPropertyList(context, in);
        }
    }

    private static final class ZserioElementFactory_attributeConditions implements zserio.runtime.array.PackableElementFactory<nds.core.attributemap.ConditionList>
    {
        @Override
        public nds.core.attributemap.ConditionList create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.core.attributemap.ConditionList(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.core.attributemap.ConditionList.ZserioPackingContext();
        }

        @Override
        public nds.core.attributemap.ConditionList create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.core.attributemap.ConditionList(context, in);
        }
    }

    private final byte coordShift_;
    private nds.routingdata.attributes.RoutingRoadRangeAttributeType attributeTypeCode_;
    private int feature_;
    private zserio.runtime.array.Array featureReferences_;
    private zserio.runtime.array.Array featureValidities_;
    private zserio.runtime.array.Array featureValuePtr_;
    private int attribute_;
    private zserio.runtime.array.Array attributeValues_;
    private zserio.runtime.array.Array attributeProperties_;
    private zserio.runtime.array.Array attributeConditions_;
}
