/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.name.instantiations;

public class NameTransitionAttributeMetadata implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            availableConditions_ = new nds.core.attributemap.ConditionTypeCodeCollection.ZserioPackingContext();
        }

        public nds.core.attributemap.ConditionTypeCodeCollection.ZserioPackingContext getAvailableConditions()
        {
            return availableConditions_;
        }

        private nds.core.attributemap.ConditionTypeCodeCollection.ZserioPackingContext availableConditions_;
    };

    public NameTransitionAttributeMetadata()
    {
    }

    public NameTransitionAttributeMetadata(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public NameTransitionAttributeMetadata(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public NameTransitionAttributeMetadata(
            nds.name.attributes.NameTransitionAttributeType[] availableAttributes_,
            nds.name.properties.NamePropertyType[] availableProperties_,
            nds.core.attributemap.ConditionTypeCodeCollection availableConditions_)
    {
        setAvailableAttributes(availableAttributes_);
        setAvailableProperties(availableProperties_);
        setAvailableConditions(availableConditions_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        availableConditions_.initPackingContext(zserioContext.getAvailableConditions());
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

        endBitPosition += availableAttributes_.bitSizeOfPacked(endBitPosition);
        endBitPosition += availableProperties_.bitSizeOfPacked(endBitPosition);
        endBitPosition += availableConditions_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += availableAttributes_.bitSizeOfPacked(endBitPosition);
        endBitPosition += availableProperties_.bitSizeOfPacked(endBitPosition);
        endBitPosition += availableConditions_.bitSizeOf(zserioContext.getAvailableConditions(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.name.attributes.NameTransitionAttributeType[] getAvailableAttributes()
    {
        return (availableAttributes_ == null) ? null : availableAttributes_.getRawArray();
    }

    public void setAvailableAttributes(nds.name.attributes.NameTransitionAttributeType[] availableAttributes_)
    {
        this.availableAttributes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.name.attributes.NameTransitionAttributeType.class, availableAttributes_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.name.attributes.NameTransitionAttributeType>(new ZserioElementFactory_availableAttributes()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public nds.name.properties.NamePropertyType[] getAvailableProperties()
    {
        return (availableProperties_ == null) ? null : availableProperties_.getRawArray();
    }

    public void setAvailableProperties(nds.name.properties.NamePropertyType[] availableProperties_)
    {
        this.availableProperties_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.name.properties.NamePropertyType.class, availableProperties_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.name.properties.NamePropertyType>(new ZserioElementFactory_availableProperties()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public nds.core.attributemap.ConditionTypeCodeCollection getAvailableConditions()
    {
        return availableConditions_;
    }

    public void setAvailableConditions(nds.core.attributemap.ConditionTypeCodeCollection availableConditions_)
    {
        this.availableConditions_ = availableConditions_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof NameTransitionAttributeMetadata)
        {
            final NameTransitionAttributeMetadata that = (NameTransitionAttributeMetadata)obj;

            return
                    ((availableAttributes_ == null) ? that.availableAttributes_ == null : availableAttributes_.equals(that.availableAttributes_)) &&
                    ((availableProperties_ == null) ? that.availableProperties_ == null : availableProperties_.equals(that.availableProperties_)) &&
                    ((availableConditions_ == null) ? that.availableConditions_ == null : availableConditions_.equals(that.availableConditions_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, availableAttributes_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, availableProperties_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, availableConditions_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        availableAttributes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.name.attributes.NameTransitionAttributeType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.name.attributes.NameTransitionAttributeType>(new ZserioElementFactory_availableAttributes()),
                zserio.runtime.array.ArrayType.AUTO);
        availableAttributes_.readPacked(in);

        availableProperties_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.name.properties.NamePropertyType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.name.properties.NamePropertyType>(new ZserioElementFactory_availableProperties()),
                zserio.runtime.array.ArrayType.AUTO);
        availableProperties_.readPacked(in);

        availableConditions_ = new nds.core.attributemap.ConditionTypeCodeCollection(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        availableAttributes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.name.attributes.NameTransitionAttributeType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.name.attributes.NameTransitionAttributeType>(new ZserioElementFactory_availableAttributes()),
                zserio.runtime.array.ArrayType.AUTO);
        availableAttributes_.readPacked(in);

        availableProperties_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.name.properties.NamePropertyType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.name.properties.NamePropertyType>(new ZserioElementFactory_availableProperties()),
                zserio.runtime.array.ArrayType.AUTO);
        availableProperties_.readPacked(in);

        availableConditions_ = new nds.core.attributemap.ConditionTypeCodeCollection(zserioContext.getAvailableConditions(), in);
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

        endBitPosition = availableAttributes_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = availableProperties_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = availableConditions_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = availableAttributes_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = availableProperties_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = availableConditions_.initializeOffsets(zserioContext.getAvailableConditions(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        availableAttributes_.writePacked(out);

        availableProperties_.writePacked(out);

        availableConditions_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        availableAttributes_.writePacked(out);

        availableProperties_.writePacked(out);

        availableConditions_.write(zserioContext.getAvailableConditions(), out);
    }

    private static final class ZserioElementFactory_availableAttributes implements zserio.runtime.array.PackableElementFactory<nds.name.attributes.NameTransitionAttributeType>
    {
        @Override
        public nds.name.attributes.NameTransitionAttributeType create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return nds.name.attributes.NameTransitionAttributeType.readEnum(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new zserio.runtime.array.DeltaContext();
        }

        @Override
        public nds.name.attributes.NameTransitionAttributeType create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return nds.name.attributes.NameTransitionAttributeType.readEnum(context, in);
        }
    }

    private static final class ZserioElementFactory_availableProperties implements zserio.runtime.array.PackableElementFactory<nds.name.properties.NamePropertyType>
    {
        @Override
        public nds.name.properties.NamePropertyType create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.name.properties.NamePropertyType(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.name.properties.NamePropertyType.ZserioPackingContext();
        }

        @Override
        public nds.name.properties.NamePropertyType create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.name.properties.NamePropertyType(context, in);
        }
    }

    private zserio.runtime.array.Array availableAttributes_;
    private zserio.runtime.array.Array availableProperties_;
    private nds.core.attributemap.ConditionTypeCodeCollection availableConditions_;
}
