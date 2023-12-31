/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.adas.attributes;

public class AdasTransitionAttributeValue implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            turnGeometryCurvature_ = new zserio.runtime.array.DeltaContext();
            comfortableSpeed_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getTurnGeometryCurvature()
        {
            return turnGeometryCurvature_;
        }

        public zserio.runtime.array.DeltaContext getComfortableSpeed()
        {
            return comfortableSpeed_;
        }

        private zserio.runtime.array.DeltaContext turnGeometryCurvature_;
        private zserio.runtime.array.DeltaContext comfortableSpeed_;
    };

    public AdasTransitionAttributeValue(
            nds.adas.attributes.AdasTransitionAttributeType type_)
    {
        this.type_ = type_;
    }

    public AdasTransitionAttributeValue(zserio.runtime.io.BitStreamReader in,
            nds.adas.attributes.AdasTransitionAttributeType type_)
            throws java.io.IOException
    {
        this.type_ = type_;

        read(in);
    }

    public AdasTransitionAttributeValue(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            nds.adas.attributes.AdasTransitionAttributeType type_)
            throws java.io.IOException
    {
        this.type_ = type_;

        read(context, in);
    }

    public int choiceTag()
    {
        switch (getType())
        {
        case TURN_GEOMETRY_CURVATURE:
            return CHOICE_turnGeometryCurvature;
        case COMFORTABLE_SPEED:
            return CHOICE_comfortableSpeed;
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
        case TURN_GEOMETRY_CURVATURE:
            zserioContext.getTurnGeometryCurvature().init(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(10)),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(getTurnGeometryCurvature()));
            break;
        case COMFORTABLE_SPEED:
            zserioContext.getComfortableSpeed().init(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(getComfortableSpeed()));
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice AdasTransitionAttributeValue: " + getType() + "!");
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
        case TURN_GEOMETRY_CURVATURE:
            endBitPosition += 10;
            break;
        case COMFORTABLE_SPEED:
            endBitPosition += 8;
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice AdasTransitionAttributeValue: " + getType() + "!");
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
        case TURN_GEOMETRY_CURVATURE:
            endBitPosition += zserioContext.getTurnGeometryCurvature().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(10)),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(getTurnGeometryCurvature()));
            break;
        case COMFORTABLE_SPEED:
            endBitPosition += zserioContext.getComfortableSpeed().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(getComfortableSpeed()));
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice AdasTransitionAttributeValue: " + getType() + "!");
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.adas.attributes.AdasTransitionAttributeType getType()
    {
        return this.type_;
    }

    public short getTurnGeometryCurvature()
    {
        return (java.lang.Short)objectChoice;
    }

    public void setTurnGeometryCurvature(short turnGeometryCurvature_)
    {
        objectChoice = turnGeometryCurvature_;
    }

    public short getComfortableSpeed()
    {
        return (java.lang.Short)objectChoice;
    }

    public void setComfortableSpeed(short comfortableSpeed_)
    {
        objectChoice = comfortableSpeed_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof AdasTransitionAttributeValue)
        {
            final AdasTransitionAttributeValue that = (AdasTransitionAttributeValue)obj;

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
            case TURN_GEOMETRY_CURVATURE:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.Short)objectChoice);
                break;
            case COMFORTABLE_SPEED:
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
        case TURN_GEOMETRY_CURVATURE:
            objectChoice = (short)in.readBits(10);
            break;
        case COMFORTABLE_SPEED:
            objectChoice = in.readUnsignedByte();
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice AdasTransitionAttributeValue: " + getType() + "!");
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        switch (getType())
        {
        case TURN_GEOMETRY_CURVATURE:
            objectChoice = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                    zserioContext.getTurnGeometryCurvature().read(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(10)), in)).get();
            break;
        case COMFORTABLE_SPEED:
            objectChoice = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                    zserioContext.getComfortableSpeed().read(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), in)).get();
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice AdasTransitionAttributeValue: " + getType() + "!");
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
        case TURN_GEOMETRY_CURVATURE:
            {
                endBitPosition += 10;
            }
            break;
        case COMFORTABLE_SPEED:
            {
                endBitPosition += 8;
            }
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice AdasTransitionAttributeValue: " + getType() + "!");
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
        case TURN_GEOMETRY_CURVATURE:
            {
                endBitPosition += zserioContext.getTurnGeometryCurvature().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(10)),
                        new zserio.runtime.array.ArrayElement.ShortArrayElement(getTurnGeometryCurvature()));
            }
            break;
        case COMFORTABLE_SPEED:
            {
                endBitPosition += zserioContext.getComfortableSpeed().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                        new zserio.runtime.array.ArrayElement.ShortArrayElement(getComfortableSpeed()));
            }
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice AdasTransitionAttributeValue: " + getType() + "!");
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        switch (getType())
        {
        case TURN_GEOMETRY_CURVATURE:
            out.writeBits(getTurnGeometryCurvature(), 10);
            break;
        case COMFORTABLE_SPEED:
            out.writeUnsignedByte(getComfortableSpeed());
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice AdasTransitionAttributeValue: " + getType() + "!");
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        switch (getType())
        {
        case TURN_GEOMETRY_CURVATURE:
            zserioContext.getTurnGeometryCurvature().write(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(10)), out,
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(getTurnGeometryCurvature()));
            break;
        case COMFORTABLE_SPEED:
            zserioContext.getComfortableSpeed().write(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), out,
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(getComfortableSpeed()));
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice AdasTransitionAttributeValue: " + getType() + "!");
        }
    }

    public static final int CHOICE_turnGeometryCurvature = 0;
    public static final int CHOICE_comfortableSpeed = 1;
    public static final int UNDEFINED_CHOICE = -1;

    private final nds.adas.attributes.AdasTransitionAttributeType type_;
    private java.lang.Object objectChoice;
}
