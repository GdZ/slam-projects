/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.traffic.properties;

public class PropertyValue implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            eventId_ = new zserio.runtime.array.DeltaContext();
            eventUuid_ = new nds.system.types.UUID.ZserioPackingContext();
            advice_ = new zserio.runtime.array.DeltaContext();
            estimatedTravelTime_ = new zserio.runtime.array.DeltaContext();
            estimatedAverageSpeed_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getEventId()
        {
            return eventId_;
        }

        public nds.system.types.UUID.ZserioPackingContext getEventUuid()
        {
            return eventUuid_;
        }

        public zserio.runtime.array.DeltaContext getAdvice()
        {
            return advice_;
        }

        public zserio.runtime.array.DeltaContext getEstimatedTravelTime()
        {
            return estimatedTravelTime_;
        }

        public zserio.runtime.array.DeltaContext getEstimatedAverageSpeed()
        {
            return estimatedAverageSpeed_;
        }

        private zserio.runtime.array.DeltaContext eventId_;
        private nds.system.types.UUID.ZserioPackingContext eventUuid_;
        private zserio.runtime.array.DeltaContext advice_;
        private zserio.runtime.array.DeltaContext estimatedTravelTime_;
        private zserio.runtime.array.DeltaContext estimatedAverageSpeed_;
    };

    public PropertyValue(
            nds.traffic.properties.PropertyType type_)
    {
        this.type_ = type_;
    }

    public PropertyValue(zserio.runtime.io.BitStreamReader in,
            nds.traffic.properties.PropertyType type_)
            throws java.io.IOException
    {
        this.type_ = type_;

        read(in);
    }

    public PropertyValue(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            nds.traffic.properties.PropertyType type_)
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
        case TRAFFIC_EVENT_ID:
            return CHOICE_eventId;
        case TRAFFIC_EVENT_UUID:
            return CHOICE_eventUuid;
        case TRAFFIC_EVENT_ID_STRING:
            return CHOICE_eventIdString;
        case TRAFFIC_EVENT_ADVICE:
            return CHOICE_advice;
        case ESTIMATED_TRAVEL_TIME:
            return CHOICE_estimatedTravelTime;
        case ESTIMATED_AVERAGE_SPEED:
            return CHOICE_estimatedAverageSpeed;
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
        case TRAFFIC_EVENT_ID:
            zserioContext.getEventId().init(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(getEventId()));
            break;
        case TRAFFIC_EVENT_UUID:
            getEventUuid().initPackingContext(zserioContext.getEventUuid());
            break;
        case TRAFFIC_EVENT_ID_STRING:
            break;
        case TRAFFIC_EVENT_ADVICE:
            getAdvice().initPackingContext(zserioContext.getAdvice());
            break;
        case ESTIMATED_TRAVEL_TIME:
            zserioContext.getEstimatedTravelTime().init(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(getEstimatedTravelTime()));
            break;
        case ESTIMATED_AVERAGE_SPEED:
            zserioContext.getEstimatedAverageSpeed().init(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(getEstimatedAverageSpeed()));
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
        case TRAFFIC_EVENT_ID:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt(getEventId());
            break;
        case TRAFFIC_EVENT_UUID:
            endBitPosition += getEventUuid().bitSizeOf(endBitPosition);
            break;
        case TRAFFIC_EVENT_ID_STRING:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getEventIdString());
            break;
        case TRAFFIC_EVENT_ADVICE:
            endBitPosition += getAdvice().bitSizeOf(endBitPosition);
            break;
        case ESTIMATED_TRAVEL_TIME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt(getEstimatedTravelTime());
            break;
        case ESTIMATED_AVERAGE_SPEED:
            endBitPosition += 8;
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
        case TRAFFIC_EVENT_ID:
            endBitPosition += zserioContext.getEventId().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(getEventId()));
            break;
        case TRAFFIC_EVENT_UUID:
            endBitPosition += getEventUuid().bitSizeOf(zserioContext.getEventUuid(), endBitPosition);
            break;
        case TRAFFIC_EVENT_ID_STRING:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getEventIdString());
            break;
        case TRAFFIC_EVENT_ADVICE:
            endBitPosition += getAdvice().bitSizeOf(zserioContext.getAdvice(), endBitPosition);
            break;
        case ESTIMATED_TRAVEL_TIME:
            endBitPosition += zserioContext.getEstimatedTravelTime().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(getEstimatedTravelTime()));
            break;
        case ESTIMATED_AVERAGE_SPEED:
            endBitPosition += zserioContext.getEstimatedAverageSpeed().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(getEstimatedAverageSpeed()));
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice PropertyValue: " + getType() + "!");
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.traffic.properties.PropertyType getType()
    {
        return this.type_;
    }

    public java.math.BigInteger getEventId()
    {
        return (java.math.BigInteger)objectChoice;
    }

    public void setEventId(java.math.BigInteger eventId_)
    {
        objectChoice = eventId_;
    }

    public nds.system.types.UUID getEventUuid()
    {
        return (nds.system.types.UUID)objectChoice;
    }

    public void setEventUuid(nds.system.types.UUID eventUuid_)
    {
        objectChoice = eventUuid_;
    }

    public java.lang.String getEventIdString()
    {
        return (java.lang.String)objectChoice;
    }

    public void setEventIdString(java.lang.String eventIdString_)
    {
        objectChoice = eventIdString_;
    }

    public nds.traffic.types.TrafficEventAdvice getAdvice()
    {
        return (nds.traffic.types.TrafficEventAdvice)objectChoice;
    }

    public void setAdvice(nds.traffic.types.TrafficEventAdvice advice_)
    {
        objectChoice = advice_;
    }

    public java.math.BigInteger getEstimatedTravelTime()
    {
        return (java.math.BigInteger)objectChoice;
    }

    public void setEstimatedTravelTime(java.math.BigInteger estimatedTravelTime_)
    {
        objectChoice = estimatedTravelTime_;
    }

    public short getEstimatedAverageSpeed()
    {
        return (java.lang.Short)objectChoice;
    }

    public void setEstimatedAverageSpeed(short estimatedAverageSpeed_)
    {
        objectChoice = estimatedAverageSpeed_;
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
            case TRAFFIC_EVENT_ID:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.math.BigInteger)objectChoice);
                break;
            case TRAFFIC_EVENT_UUID:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (nds.system.types.UUID)objectChoice);
                break;
            case TRAFFIC_EVENT_ID_STRING:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.String)objectChoice);
                break;
            case TRAFFIC_EVENT_ADVICE:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (nds.traffic.types.TrafficEventAdvice)objectChoice);
                break;
            case ESTIMATED_TRAVEL_TIME:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.math.BigInteger)objectChoice);
                break;
            case ESTIMATED_AVERAGE_SPEED:
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
        case TRAFFIC_EVENT_ID:
            objectChoice = in.readVarUInt();
            break;
        case TRAFFIC_EVENT_UUID:
            objectChoice = new nds.system.types.UUID(in);
            break;
        case TRAFFIC_EVENT_ID_STRING:
            objectChoice = in.readString();
            break;
        case TRAFFIC_EVENT_ADVICE:
            objectChoice = nds.traffic.types.TrafficEventAdvice.readEnum(in);
            break;
        case ESTIMATED_TRAVEL_TIME:
            objectChoice = in.readVarUInt();
            break;
        case ESTIMATED_AVERAGE_SPEED:
            objectChoice = in.readUnsignedByte();
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
        case TRAFFIC_EVENT_ID:
            objectChoice = ((zserio.runtime.array.ArrayElement.BigIntegerArrayElement)
                    zserioContext.getEventId().read(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(), in)).get();
            break;
        case TRAFFIC_EVENT_UUID:
            objectChoice = new nds.system.types.UUID(zserioContext.getEventUuid(), in);
            break;
        case TRAFFIC_EVENT_ID_STRING:
            objectChoice = in.readString();
            break;
        case TRAFFIC_EVENT_ADVICE:
            objectChoice = nds.traffic.types.TrafficEventAdvice.readEnum(zserioContext.getAdvice(), in);
            break;
        case ESTIMATED_TRAVEL_TIME:
            objectChoice = ((zserio.runtime.array.ArrayElement.BigIntegerArrayElement)
                    zserioContext.getEstimatedTravelTime().read(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(), in)).get();
            break;
        case ESTIMATED_AVERAGE_SPEED:
            objectChoice = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                    zserioContext.getEstimatedAverageSpeed().read(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), in)).get();
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
        case TRAFFIC_EVENT_ID:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt(getEventId());
            }
            break;
        case TRAFFIC_EVENT_UUID:
            {
                endBitPosition = getEventUuid().initializeOffsets(endBitPosition);
            }
            break;
        case TRAFFIC_EVENT_ID_STRING:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getEventIdString());
            }
            break;
        case TRAFFIC_EVENT_ADVICE:
            {
                endBitPosition += getAdvice().bitSizeOf(endBitPosition);
            }
            break;
        case ESTIMATED_TRAVEL_TIME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt(getEstimatedTravelTime());
            }
            break;
        case ESTIMATED_AVERAGE_SPEED:
            {
                endBitPosition += 8;
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
        case TRAFFIC_EVENT_ID:
            {
                endBitPosition += zserioContext.getEventId().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                        new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(getEventId()));
            }
            break;
        case TRAFFIC_EVENT_UUID:
            {
                endBitPosition = getEventUuid().initializeOffsets(zserioContext.getEventUuid(), endBitPosition);
            }
            break;
        case TRAFFIC_EVENT_ID_STRING:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getEventIdString());
            }
            break;
        case TRAFFIC_EVENT_ADVICE:
            {
                endBitPosition = getAdvice().initializeOffsets(zserioContext.getAdvice(), endBitPosition);
            }
            break;
        case ESTIMATED_TRAVEL_TIME:
            {
                endBitPosition += zserioContext.getEstimatedTravelTime().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                        new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(getEstimatedTravelTime()));
            }
            break;
        case ESTIMATED_AVERAGE_SPEED:
            {
                endBitPosition += zserioContext.getEstimatedAverageSpeed().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                        new zserio.runtime.array.ArrayElement.ShortArrayElement(getEstimatedAverageSpeed()));
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
        case TRAFFIC_EVENT_ID:
            out.writeVarUInt(getEventId());
            break;
        case TRAFFIC_EVENT_UUID:
            getEventUuid().write(out);
            break;
        case TRAFFIC_EVENT_ID_STRING:
            out.writeString(getEventIdString());
            break;
        case TRAFFIC_EVENT_ADVICE:
            getAdvice().write(out);
            break;
        case ESTIMATED_TRAVEL_TIME:
            out.writeVarUInt(getEstimatedTravelTime());
            break;
        case ESTIMATED_AVERAGE_SPEED:
            out.writeUnsignedByte(getEstimatedAverageSpeed());
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
        case TRAFFIC_EVENT_ID:
            zserioContext.getEventId().write(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(getEventId()));
            break;
        case TRAFFIC_EVENT_UUID:
            getEventUuid().write(zserioContext.getEventUuid(), out);
            break;
        case TRAFFIC_EVENT_ID_STRING:
            out.writeString(getEventIdString());
            break;
        case TRAFFIC_EVENT_ADVICE:
            getAdvice().write(zserioContext.getAdvice(), out);
            break;
        case ESTIMATED_TRAVEL_TIME:
            zserioContext.getEstimatedTravelTime().write(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(getEstimatedTravelTime()));
            break;
        case ESTIMATED_AVERAGE_SPEED:
            zserioContext.getEstimatedAverageSpeed().write(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), out,
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(getEstimatedAverageSpeed()));
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice PropertyValue: " + getType() + "!");
        }
    }

    public static final int CHOICE_eventId = 0;
    public static final int CHOICE_eventUuid = 1;
    public static final int CHOICE_eventIdString = 2;
    public static final int CHOICE_advice = 3;
    public static final int CHOICE_estimatedTravelTime = 4;
    public static final int CHOICE_estimatedAverageSpeed = 5;
    public static final int UNDEFINED_CHOICE = -1;

    private final nds.traffic.properties.PropertyType type_;
    private java.lang.Object objectChoice;
}
