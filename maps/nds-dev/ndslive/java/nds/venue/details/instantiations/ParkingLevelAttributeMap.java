/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.venue.details.instantiations;

public class ParkingLevelAttributeMap implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
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

    public ParkingLevelAttributeMap(
            byte coordShift_)
    {
        this.coordShift_ = coordShift_;
    }

    public ParkingLevelAttributeMap(zserio.runtime.io.BitStreamReader in,
            byte coordShift_)
            throws java.io.IOException
    {
        this.coordShift_ = coordShift_;

        read(in);
    }

    public ParkingLevelAttributeMap(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            byte coordShift_)
            throws java.io.IOException
    {
        this.coordShift_ = coordShift_;

        read(context, in);
    }

    public ParkingLevelAttributeMap(
            byte coordShift_,
            nds.venue.details.attributes.ParkingLevelAttributeType attributeTypeCode_,
            int feature_,
            nds.core.types.Var4ByteId[] featureReferences_,
            nds.core.attributemap.Validity[] featureValidities_,
            int[] featureValuePtr_,
            int attribute_,
            nds.venue.details.instantiations.ParkingLevelAttribute[] attributeValues_,
            nds.venue.details.instantiations.VenuePropertyList[] attributeProperties_,
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
        endBitPosition += featureValidities_.bitSizeOf(endBitPosition);
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
        endBitPosition += featureValidities_.bitSizeOf(endBitPosition);
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

    public nds.venue.details.attributes.ParkingLevelAttributeType getAttributeTypeCode()
    {
        return attributeTypeCode_;
    }

    public void setAttributeTypeCode(nds.venue.details.attributes.ParkingLevelAttributeType attributeTypeCode_)
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

    public nds.core.types.Var4ByteId[] getFeatureReferences()
    {
        return (featureReferences_ == null) ? null : featureReferences_.getRawArray();
    }

    public void setFeatureReferences(nds.core.types.Var4ByteId[] featureReferences_)
    {
        this.featureReferences_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Var4ByteId.class, featureReferences_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Var4ByteId>(new ZserioElementFactory_featureReferences()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    public nds.core.attributemap.Validity[] getFeatureValidities()
    {
        return (featureValidities_ == null) ? null : featureValidities_.getRawArray();
    }

    public void setFeatureValidities(nds.core.attributemap.Validity[] featureValidities_)
    {
        this.featureValidities_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.attributemap.Validity.class, featureValidities_),
                new zserio.runtime.array.ArrayTraits.WriteObjectArrayTraits<nds.core.attributemap.Validity>(new ZserioElementFactory_featureValidities()),
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

    public nds.venue.details.instantiations.ParkingLevelAttribute[] getAttributeValues()
    {
        return (attributeValues_ == null) ? null : attributeValues_.getRawArray();
    }

    public void setAttributeValues(nds.venue.details.instantiations.ParkingLevelAttribute[] attributeValues_)
    {
        this.attributeValues_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.venue.details.instantiations.ParkingLevelAttribute.class, attributeValues_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.venue.details.instantiations.ParkingLevelAttribute>(new ZserioElementFactory_attributeValues()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    public nds.venue.details.instantiations.VenuePropertyList[] getAttributeProperties()
    {
        return (attributeProperties_ == null) ? null : attributeProperties_.getRawArray();
    }

    public void setAttributeProperties(nds.venue.details.instantiations.VenuePropertyList[] attributeProperties_)
    {
        this.attributeProperties_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.venue.details.instantiations.VenuePropertyList.class, attributeProperties_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.venue.details.instantiations.VenuePropertyList>(new ZserioElementFactory_attributeProperties()),
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
        if (obj instanceof ParkingLevelAttributeMap)
        {
            final ParkingLevelAttributeMap that = (ParkingLevelAttributeMap)obj;

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
        attributeTypeCode_ = nds.venue.details.attributes.ParkingLevelAttributeType.readEnum(in);

        in.alignTo(8);
        feature_ = in.readVarSize();

        featureReferences_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Var4ByteId.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Var4ByteId>(new ZserioElementFactory_featureReferences()),
                zserio.runtime.array.ArrayType.NORMAL);
        featureReferences_.readPacked(in, (int)(getFeature()));

        in.alignTo(8);
        featureValidities_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.attributemap.Validity.class),
                new zserio.runtime.array.ArrayTraits.WriteObjectArrayTraits<nds.core.attributemap.Validity>(new ZserioElementFactory_featureValidities()),
                zserio.runtime.array.ArrayType.NORMAL);
        featureValidities_.read(in, (int)(getFeature()));

        in.alignTo(8);
        featureValuePtr_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.IntRawArray(),
                new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                zserio.runtime.array.ArrayType.NORMAL);
        featureValuePtr_.readPacked(in, (int)(getFeature()));

        attribute_ = in.readVarSize();

        attributeValues_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.venue.details.instantiations.ParkingLevelAttribute.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.venue.details.instantiations.ParkingLevelAttribute>(new ZserioElementFactory_attributeValues()),
                zserio.runtime.array.ArrayType.NORMAL);
        attributeValues_.readPacked(in, (int)(getAttribute()));

        in.alignTo(8);
        attributeProperties_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.venue.details.instantiations.VenuePropertyList.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.venue.details.instantiations.VenuePropertyList>(new ZserioElementFactory_attributeProperties()),
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
        attributeTypeCode_ = nds.venue.details.attributes.ParkingLevelAttributeType.readEnum(zserioContext.getAttributeTypeCode(), in);

        in.alignTo(8);
        feature_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getFeature().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

        featureReferences_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Var4ByteId.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Var4ByteId>(new ZserioElementFactory_featureReferences()),
                zserio.runtime.array.ArrayType.NORMAL);
        featureReferences_.readPacked(in, (int)(getFeature()));

        in.alignTo(8);
        featureValidities_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.attributemap.Validity.class),
                new zserio.runtime.array.ArrayTraits.WriteObjectArrayTraits<nds.core.attributemap.Validity>(new ZserioElementFactory_featureValidities()),
                zserio.runtime.array.ArrayType.NORMAL);
        featureValidities_.read(in, (int)(getFeature()));

        in.alignTo(8);
        featureValuePtr_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.IntRawArray(),
                new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                zserio.runtime.array.ArrayType.NORMAL);
        featureValuePtr_.readPacked(in, (int)(getFeature()));

        attribute_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getAttribute().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

        attributeValues_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.venue.details.instantiations.ParkingLevelAttribute.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.venue.details.instantiations.ParkingLevelAttribute>(new ZserioElementFactory_attributeValues()),
                zserio.runtime.array.ArrayType.NORMAL);
        attributeValues_.readPacked(in, (int)(getAttribute()));

        in.alignTo(8);
        attributeProperties_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.venue.details.instantiations.VenuePropertyList.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.venue.details.instantiations.VenuePropertyList>(new ZserioElementFactory_attributeProperties()),
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
        endBitPosition = featureValidities_.initializeOffsets(endBitPosition);
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
        endBitPosition = featureValidities_.initializeOffsets(endBitPosition);
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
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field ParkingLevelAttributeMap.featureReferences: " +
                    featureReferences_.size() + " != " + (int)(getFeature()) + "!");
        }
        featureReferences_.writePacked(out);

        out.alignTo(8);
        if (featureValidities_.size() != (int)(getFeature()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field ParkingLevelAttributeMap.featureValidities: " +
                    featureValidities_.size() + " != " + (int)(getFeature()) + "!");
        }
        featureValidities_.write(out);

        out.alignTo(8);
        if (featureValuePtr_.size() != (int)(getFeature()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field ParkingLevelAttributeMap.featureValuePtr: " +
                    featureValuePtr_.size() + " != " + (int)(getFeature()) + "!");
        }
        featureValuePtr_.writePacked(out);

        out.writeVarSize(attribute_);

        if (attributeValues_.size() != (int)(getAttribute()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field ParkingLevelAttributeMap.attributeValues: " +
                    attributeValues_.size() + " != " + (int)(getAttribute()) + "!");
        }
        attributeValues_.writePacked(out);

        out.alignTo(8);
        if (attributeProperties_.size() != (int)(getAttribute()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field ParkingLevelAttributeMap.attributeProperties: " +
                    attributeProperties_.size() + " != " + (int)(getAttribute()) + "!");
        }
        attributeProperties_.writePacked(out);

        out.alignTo(8);
        if (attributeConditions_.size() != (int)(getAttribute()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field ParkingLevelAttributeMap.attributeConditions: " +
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
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field ParkingLevelAttributeMap.featureReferences: " +
                    featureReferences_.size() + " != " + (int)(getFeature()) + "!");
        }
        featureReferences_.writePacked(out);

        out.alignTo(8);
        if (featureValidities_.size() != (int)(getFeature()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field ParkingLevelAttributeMap.featureValidities: " +
                    featureValidities_.size() + " != " + (int)(getFeature()) + "!");
        }
        featureValidities_.write(out);

        out.alignTo(8);
        if (featureValuePtr_.size() != (int)(getFeature()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field ParkingLevelAttributeMap.featureValuePtr: " +
                    featureValuePtr_.size() + " != " + (int)(getFeature()) + "!");
        }
        featureValuePtr_.writePacked(out);

        zserioContext.getAttribute().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(attribute_));

        if (attributeValues_.size() != (int)(getAttribute()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field ParkingLevelAttributeMap.attributeValues: " +
                    attributeValues_.size() + " != " + (int)(getAttribute()) + "!");
        }
        attributeValues_.writePacked(out);

        out.alignTo(8);
        if (attributeProperties_.size() != (int)(getAttribute()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field ParkingLevelAttributeMap.attributeProperties: " +
                    attributeProperties_.size() + " != " + (int)(getAttribute()) + "!");
        }
        attributeProperties_.writePacked(out);

        out.alignTo(8);
        if (attributeConditions_.size() != (int)(getAttribute()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field ParkingLevelAttributeMap.attributeConditions: " +
                    attributeConditions_.size() + " != " + (int)(getAttribute()) + "!");
        }
        attributeConditions_.writePacked(out);
    }

    private static final class ZserioElementFactory_featureReferences implements zserio.runtime.array.PackableElementFactory<nds.core.types.Var4ByteId>
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

    private final class ZserioElementFactory_featureValidities implements zserio.runtime.array.ElementFactory<nds.core.attributemap.Validity>
    {
        @Override
        public nds.core.attributemap.Validity create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.core.attributemap.Validity(in, (byte)(getCoordShift()));
        }
    }

    private final class ZserioElementFactory_attributeValues implements zserio.runtime.array.PackableElementFactory<nds.venue.details.instantiations.ParkingLevelAttribute>
    {
        @Override
        public nds.venue.details.instantiations.ParkingLevelAttribute create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.venue.details.instantiations.ParkingLevelAttribute(in, getAttributeTypeCode());
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.venue.details.instantiations.ParkingLevelAttribute.ZserioPackingContext();
        }

        @Override
        public nds.venue.details.instantiations.ParkingLevelAttribute create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.venue.details.instantiations.ParkingLevelAttribute(context, in, getAttributeTypeCode());
        }
    }

    private static final class ZserioElementFactory_attributeProperties implements zserio.runtime.array.PackableElementFactory<nds.venue.details.instantiations.VenuePropertyList>
    {
        @Override
        public nds.venue.details.instantiations.VenuePropertyList create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.venue.details.instantiations.VenuePropertyList(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.venue.details.instantiations.VenuePropertyList.ZserioPackingContext();
        }

        @Override
        public nds.venue.details.instantiations.VenuePropertyList create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.venue.details.instantiations.VenuePropertyList(context, in);
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
    private nds.venue.details.attributes.ParkingLevelAttributeType attributeTypeCode_;
    private int feature_;
    private zserio.runtime.array.Array featureReferences_;
    private zserio.runtime.array.Array featureValidities_;
    private zserio.runtime.array.Array featureValuePtr_;
    private int attribute_;
    private zserio.runtime.array.Array attributeValues_;
    private zserio.runtime.array.Array attributeProperties_;
    private zserio.runtime.array.Array attributeConditions_;
}
