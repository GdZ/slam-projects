/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.poi.properties;

public class PropertyValue implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            languageCode_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getLanguageCode()
        {
            return languageCode_;
        }

        private zserio.runtime.array.DeltaContext languageCode_;
    };

    public PropertyValue(
            nds.poi.properties.PropertyType type_)
    {
        this.type_ = type_;
    }

    public PropertyValue(zserio.runtime.io.BitStreamReader in,
            nds.poi.properties.PropertyType type_)
            throws java.io.IOException
    {
        this.type_ = type_;

        read(in);
    }

    public PropertyValue(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            nds.poi.properties.PropertyType type_)
            throws java.io.IOException
    {
        this.type_ = type_;

        read(context, in);
    }

    public int choiceTag()
    {
        switch (getType())
        {
        case CORE:
            return UNDEFINED_CHOICE;
        case LANGUAGE_CODE:
            return CHOICE_languageCode;
        default:
            return UNDEFINED_CHOICE;
        }
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        switch (getType())
        {
        case CORE:
            // empty
            break;
        case LANGUAGE_CODE:
            zserioContext.getLanguageCode().init(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(getLanguageCode()));
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice PropertyValue: " + getType() + "!");
        }
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

        switch (getType())
        {
        case CORE:
            // empty
            break;
        case LANGUAGE_CODE:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(getLanguageCode());
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice PropertyValue: " + getType() + "!");
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        switch (getType())
        {
        case CORE:
            // empty
            break;
        case LANGUAGE_CODE:
            endBitPosition += zserioContext.getLanguageCode().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(getLanguageCode()));
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice PropertyValue: " + getType() + "!");
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.poi.properties.PropertyType getType()
    {
        return this.type_;
    }

    public short getLanguageCode()
    {
        return (java.lang.Short)objectChoice;
    }

    public void setLanguageCode(short languageCode_)
    {
        objectChoice = languageCode_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof PropertyValue)
        {
            final PropertyValue that = (PropertyValue)obj;

            return
                    ((this.type_ == null) ? that.type_ == null : this.type_.getValue() == that.type_.getValue()) &&
                    (
                        (objectChoice == null && that.objectChoice == null) ||
                        (objectChoice != null && objectChoice.equals(that.objectChoice))
                    );
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getType());
        if (objectChoice != null)
        {
            switch (getType())
            {
            case CORE:
                // empty
                break;
            case LANGUAGE_CODE:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.Short)objectChoice);
                break;
            default:
                break;
            }
        }

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        switch (getType())
        {
        case CORE:
            // empty
            break;
        case LANGUAGE_CODE:
            objectChoice = in.readVarUInt16();
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice PropertyValue: " + getType() + "!");
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        switch (getType())
        {
        case CORE:
            // empty
            break;
        case LANGUAGE_CODE:
            objectChoice = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                    zserioContext.getLanguageCode().read(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), in)).get();
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice PropertyValue: " + getType() + "!");
        }
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

        switch (getType())
        {
        case CORE:
            // empty
            break;
        case LANGUAGE_CODE:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(getLanguageCode());
            }
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice PropertyValue: " + getType() + "!");
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        switch (getType())
        {
        case CORE:
            // empty
            break;
        case LANGUAGE_CODE:
            {
                endBitPosition += zserioContext.getLanguageCode().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                        new zserio.runtime.array.ArrayElement.ShortArrayElement(getLanguageCode()));
            }
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice PropertyValue: " + getType() + "!");
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        switch (getType())
        {
        case CORE:
            // empty
            break;
        case LANGUAGE_CODE:
            out.writeVarUInt16(getLanguageCode());
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice PropertyValue: " + getType() + "!");
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        switch (getType())
        {
        case CORE:
            // empty
            break;
        case LANGUAGE_CODE:
            zserioContext.getLanguageCode().write(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(getLanguageCode()));
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice PropertyValue: " + getType() + "!");
        }
    }

    public static final int CHOICE_languageCode = 0;
    public static final int UNDEFINED_CHOICE = -1;

    private final nds.poi.properties.PropertyType type_;
    private java.lang.Object objectChoice;
}
