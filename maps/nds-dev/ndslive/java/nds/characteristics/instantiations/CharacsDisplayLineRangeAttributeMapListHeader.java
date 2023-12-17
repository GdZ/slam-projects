/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.characteristics.instantiations;

public class CharacsDisplayLineRangeAttributeMapListHeader implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
    };

    public CharacsDisplayLineRangeAttributeMapListHeader(
            short numMaps_)
    {
        this.numMaps_ = numMaps_;
    }

    public CharacsDisplayLineRangeAttributeMapListHeader(zserio.runtime.io.BitStreamReader in,
            short numMaps_)
            throws java.io.IOException
    {
        this.numMaps_ = numMaps_;

        read(in);
    }

    public CharacsDisplayLineRangeAttributeMapListHeader(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            short numMaps_)
            throws java.io.IOException
    {
        this.numMaps_ = numMaps_;

        read(context, in);
    }

    public CharacsDisplayLineRangeAttributeMapListHeader(
            short numMaps_,
            nds.characteristics.attributes.CharacsDisplayLineRangeAttributeType[] attributeTypeCode_,
            nds.core.attributemap.ConditionTypeCodeCollection[] conditionType_)
    {
        this(numMaps_);

        setAttributeTypeCode(attributeTypeCode_);
        setConditionType(conditionType_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
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

        endBitPosition += attributeTypeCode_.bitSizeOfPacked(endBitPosition);
        endBitPosition += conditionType_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition += attributeTypeCode_.bitSizeOfPacked(endBitPosition);
        endBitPosition += conditionType_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public short getNumMaps()
    {
        return this.numMaps_;
    }

    public nds.characteristics.attributes.CharacsDisplayLineRangeAttributeType[] getAttributeTypeCode()
    {
        return (attributeTypeCode_ == null) ? null : attributeTypeCode_.getRawArray();
    }

    public void setAttributeTypeCode(nds.characteristics.attributes.CharacsDisplayLineRangeAttributeType[] attributeTypeCode_)
    {
        this.attributeTypeCode_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.characteristics.attributes.CharacsDisplayLineRangeAttributeType.class, attributeTypeCode_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.characteristics.attributes.CharacsDisplayLineRangeAttributeType>(new ZserioElementFactory_attributeTypeCode()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    public nds.core.attributemap.ConditionTypeCodeCollection[] getConditionType()
    {
        return (conditionType_ == null) ? null : conditionType_.getRawArray();
    }

    public void setConditionType(nds.core.attributemap.ConditionTypeCodeCollection[] conditionType_)
    {
        this.conditionType_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.attributemap.ConditionTypeCodeCollection.class, conditionType_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.attributemap.ConditionTypeCodeCollection>(new ZserioElementFactory_conditionType()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof CharacsDisplayLineRangeAttributeMapListHeader)
        {
            final CharacsDisplayLineRangeAttributeMapListHeader that = (CharacsDisplayLineRangeAttributeMapListHeader)obj;

            return
                    this.numMaps_ == that.numMaps_ &&
                    ((attributeTypeCode_ == null) ? that.attributeTypeCode_ == null : attributeTypeCode_.equals(that.attributeTypeCode_)) &&
                    ((conditionType_ == null) ? that.conditionType_ == null : conditionType_.equals(that.conditionType_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getNumMaps());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, attributeTypeCode_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, conditionType_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        attributeTypeCode_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.characteristics.attributes.CharacsDisplayLineRangeAttributeType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.characteristics.attributes.CharacsDisplayLineRangeAttributeType>(new ZserioElementFactory_attributeTypeCode()),
                zserio.runtime.array.ArrayType.NORMAL);
        attributeTypeCode_.readPacked(in, (int)(getNumMaps()));

        conditionType_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.attributemap.ConditionTypeCodeCollection.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.attributemap.ConditionTypeCodeCollection>(new ZserioElementFactory_conditionType()),
                zserio.runtime.array.ArrayType.NORMAL);
        conditionType_.readPacked(in, (int)(getNumMaps()));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        attributeTypeCode_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.characteristics.attributes.CharacsDisplayLineRangeAttributeType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.characteristics.attributes.CharacsDisplayLineRangeAttributeType>(new ZserioElementFactory_attributeTypeCode()),
                zserio.runtime.array.ArrayType.NORMAL);
        attributeTypeCode_.readPacked(in, (int)(getNumMaps()));

        conditionType_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.attributemap.ConditionTypeCodeCollection.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.attributemap.ConditionTypeCodeCollection>(new ZserioElementFactory_conditionType()),
                zserio.runtime.array.ArrayType.NORMAL);
        conditionType_.readPacked(in, (int)(getNumMaps()));
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

        endBitPosition = attributeTypeCode_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = conditionType_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition = attributeTypeCode_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = conditionType_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        if (attributeTypeCode_.size() != (int)(getNumMaps()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field CharacsDisplayLineRangeAttributeMapListHeader.attributeTypeCode: " +
                    attributeTypeCode_.size() + " != " + (int)(getNumMaps()) + "!");
        }
        attributeTypeCode_.writePacked(out);

        if (conditionType_.size() != (int)(getNumMaps()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field CharacsDisplayLineRangeAttributeMapListHeader.conditionType: " +
                    conditionType_.size() + " != " + (int)(getNumMaps()) + "!");
        }
        conditionType_.writePacked(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        if (attributeTypeCode_.size() != (int)(getNumMaps()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field CharacsDisplayLineRangeAttributeMapListHeader.attributeTypeCode: " +
                    attributeTypeCode_.size() + " != " + (int)(getNumMaps()) + "!");
        }
        attributeTypeCode_.writePacked(out);

        if (conditionType_.size() != (int)(getNumMaps()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field CharacsDisplayLineRangeAttributeMapListHeader.conditionType: " +
                    conditionType_.size() + " != " + (int)(getNumMaps()) + "!");
        }
        conditionType_.writePacked(out);
    }

    private static final class ZserioElementFactory_attributeTypeCode implements zserio.runtime.array.PackableElementFactory<nds.characteristics.attributes.CharacsDisplayLineRangeAttributeType>
    {
        @Override
        public nds.characteristics.attributes.CharacsDisplayLineRangeAttributeType create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return nds.characteristics.attributes.CharacsDisplayLineRangeAttributeType.readEnum(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new zserio.runtime.array.DeltaContext();
        }

        @Override
        public nds.characteristics.attributes.CharacsDisplayLineRangeAttributeType create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return nds.characteristics.attributes.CharacsDisplayLineRangeAttributeType.readEnum(context, in);
        }
    }

    private static final class ZserioElementFactory_conditionType implements zserio.runtime.array.PackableElementFactory<nds.core.attributemap.ConditionTypeCodeCollection>
    {
        @Override
        public nds.core.attributemap.ConditionTypeCodeCollection create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.core.attributemap.ConditionTypeCodeCollection(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.core.attributemap.ConditionTypeCodeCollection.ZserioPackingContext();
        }

        @Override
        public nds.core.attributemap.ConditionTypeCodeCollection create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.core.attributemap.ConditionTypeCodeCollection(context, in);
        }
    }

    private final short numMaps_;
    private zserio.runtime.array.Array attributeTypeCode_;
    private zserio.runtime.array.Array conditionType_;
}
