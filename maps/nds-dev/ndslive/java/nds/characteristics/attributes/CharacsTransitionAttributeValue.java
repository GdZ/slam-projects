/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.characteristics.attributes;

public class CharacsTransitionAttributeValue implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            intersectionType_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getIntersectionType()
        {
            return intersectionType_;
        }

        private zserio.runtime.array.DeltaContext intersectionType_;
    };

    public CharacsTransitionAttributeValue(
            nds.characteristics.attributes.CharacsTransitionAttributeType type_)
    {
        this.type_ = type_;
    }

    public CharacsTransitionAttributeValue(zserio.runtime.io.BitStreamReader in,
            nds.characteristics.attributes.CharacsTransitionAttributeType type_)
            throws java.io.IOException
    {
        this.type_ = type_;

        read(in);
    }

    public CharacsTransitionAttributeValue(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            nds.characteristics.attributes.CharacsTransitionAttributeType type_)
            throws java.io.IOException
    {
        this.type_ = type_;

        read(context, in);
    }

    public int choiceTag()
    {
        switch (getType())
        {
        case INTERSECTION_TYPE:
            return CHOICE_intersectionType;
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
        case INTERSECTION_TYPE:
            getIntersectionType().initPackingContext(zserioContext.getIntersectionType());
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice CharacsTransitionAttributeValue: " + getType() + "!");
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
        case INTERSECTION_TYPE:
            endBitPosition += getIntersectionType().bitSizeOf(endBitPosition);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice CharacsTransitionAttributeValue: " + getType() + "!");
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
        case INTERSECTION_TYPE:
            endBitPosition += getIntersectionType().bitSizeOf(zserioContext.getIntersectionType(), endBitPosition);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice CharacsTransitionAttributeValue: " + getType() + "!");
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.characteristics.attributes.CharacsTransitionAttributeType getType()
    {
        return this.type_;
    }

    public nds.characteristics.types.IntersectionType getIntersectionType()
    {
        return (nds.characteristics.types.IntersectionType)objectChoice;
    }

    public void setIntersectionType(nds.characteristics.types.IntersectionType intersectionType_)
    {
        objectChoice = intersectionType_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof CharacsTransitionAttributeValue)
        {
            final CharacsTransitionAttributeValue that = (CharacsTransitionAttributeValue)obj;

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
            case INTERSECTION_TYPE:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (nds.characteristics.types.IntersectionType)objectChoice);
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
        case INTERSECTION_TYPE:
            objectChoice = nds.characteristics.types.IntersectionType.readEnum(in);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice CharacsTransitionAttributeValue: " + getType() + "!");
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        switch (getType())
        {
        case INTERSECTION_TYPE:
            objectChoice = nds.characteristics.types.IntersectionType.readEnum(zserioContext.getIntersectionType(), in);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice CharacsTransitionAttributeValue: " + getType() + "!");
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
        case INTERSECTION_TYPE:
            {
                endBitPosition += getIntersectionType().bitSizeOf(endBitPosition);
            }
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice CharacsTransitionAttributeValue: " + getType() + "!");
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
        case INTERSECTION_TYPE:
            {
                endBitPosition = getIntersectionType().initializeOffsets(zserioContext.getIntersectionType(), endBitPosition);
            }
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice CharacsTransitionAttributeValue: " + getType() + "!");
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        switch (getType())
        {
        case INTERSECTION_TYPE:
            getIntersectionType().write(out);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice CharacsTransitionAttributeValue: " + getType() + "!");
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        switch (getType())
        {
        case INTERSECTION_TYPE:
            getIntersectionType().write(zserioContext.getIntersectionType(), out);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice CharacsTransitionAttributeValue: " + getType() + "!");
        }
    }

    public static final int CHOICE_intersectionType = 0;
    public static final int UNDEFINED_CHOICE = -1;

    private final nds.characteristics.attributes.CharacsTransitionAttributeType type_;
    private java.lang.Object objectChoice;
}
