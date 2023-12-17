/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.rules.types;

public class RegionValidityValue implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            numLanes_ = new zserio.runtime.array.DeltaContext();
            minLanes_ = new zserio.runtime.array.DeltaContext();
            trafficZone_ = new zserio.runtime.array.DeltaContext();
            priorityRoadClass_ = new zserio.runtime.array.DeltaContext();
            roadMinimumWidth_ = new zserio.runtime.array.DeltaContext();
            roadMaximumWidth_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getNumLanes()
        {
            return numLanes_;
        }

        public zserio.runtime.array.DeltaContext getMinLanes()
        {
            return minLanes_;
        }

        public zserio.runtime.array.DeltaContext getTrafficZone()
        {
            return trafficZone_;
        }

        public zserio.runtime.array.DeltaContext getPriorityRoadClass()
        {
            return priorityRoadClass_;
        }

        public zserio.runtime.array.DeltaContext getRoadMinimumWidth()
        {
            return roadMinimumWidth_;
        }

        public zserio.runtime.array.DeltaContext getRoadMaximumWidth()
        {
            return roadMaximumWidth_;
        }

        private zserio.runtime.array.DeltaContext numLanes_;
        private zserio.runtime.array.DeltaContext minLanes_;
        private zserio.runtime.array.DeltaContext trafficZone_;
        private zserio.runtime.array.DeltaContext priorityRoadClass_;
        private zserio.runtime.array.DeltaContext roadMinimumWidth_;
        private zserio.runtime.array.DeltaContext roadMaximumWidth_;
    };

    public RegionValidityValue(
            nds.rules.types.RegionValidityType type_)
    {
        this.type_ = type_;
    }

    public RegionValidityValue(zserio.runtime.io.BitStreamReader in,
            nds.rules.types.RegionValidityType type_)
            throws java.io.IOException
    {
        this.type_ = type_;

        read(in);
    }

    public RegionValidityValue(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            nds.rules.types.RegionValidityType type_)
            throws java.io.IOException
    {
        this.type_ = type_;

        read(context, in);
    }

    public int choiceTag()
    {
        switch (getType())
        {
        case NUM_LANES:
            return CHOICE_numLanes;
        case MIN_LANES:
            return CHOICE_minLanes;
        case PAVED:
            return CHOICE_paved;
        case TRAFFIC_ZONE:
            return CHOICE_trafficZone;
        case PRIORITY_ROAD_CLASS:
            return CHOICE_priorityRoadClass;
        case BEGINNER:
            return UNDEFINED_CHOICE;
        case NO_MARKINGS:
            return UNDEFINED_CHOICE;
        case ROAD_MINIMUM_WIDTH:
            return CHOICE_roadMinimumWidth;
        case ROAD_MAXIMUM_WIDTH:
            return CHOICE_roadMaximumWidth;
        case HAS_STREET_LIGHTS:
            return UNDEFINED_CHOICE;
        case SHARED_ROAD_SURFACE_WITH_PEDESTRIANS:
            return UNDEFINED_CHOICE;
        case IN_BUSINESS_DISTRICT:
            return UNDEFINED_CHOICE;
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
        case NUM_LANES:
            zserioContext.getNumLanes().init(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(getNumLanes()));
            break;
        case MIN_LANES:
            zserioContext.getMinLanes().init(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(getMinLanes()));
            break;
        case PAVED:
            break;
        case TRAFFIC_ZONE:
            getTrafficZone().initPackingContext(zserioContext.getTrafficZone());
            break;
        case PRIORITY_ROAD_CLASS:
            zserioContext.getPriorityRoadClass().init(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(4)),
                    new zserio.runtime.array.ArrayElement.ByteArrayElement(getPriorityRoadClass()));
            break;
        case BEGINNER:
            // empty
            break;
        case NO_MARKINGS:
            // empty
            break;
        case ROAD_MINIMUM_WIDTH:
            zserioContext.getRoadMinimumWidth().init(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(getRoadMinimumWidth()));
            break;
        case ROAD_MAXIMUM_WIDTH:
            zserioContext.getRoadMaximumWidth().init(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(getRoadMaximumWidth()));
            break;
        case HAS_STREET_LIGHTS:
            // empty
            break;
        case SHARED_ROAD_SURFACE_WITH_PEDESTRIANS:
            // empty
            break;
        case IN_BUSINESS_DISTRICT:
            // empty
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RegionValidityValue: " + getType() + "!");
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
        case NUM_LANES:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(getNumLanes());
            break;
        case MIN_LANES:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(getMinLanes());
            break;
        case PAVED:
            endBitPosition += 1;
            break;
        case TRAFFIC_ZONE:
            endBitPosition += getTrafficZone().bitSizeOf(endBitPosition);
            break;
        case PRIORITY_ROAD_CLASS:
            endBitPosition += 4;
            break;
        case BEGINNER:
            // empty
            break;
        case NO_MARKINGS:
            // empty
            break;
        case ROAD_MINIMUM_WIDTH:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(getRoadMinimumWidth());
            break;
        case ROAD_MAXIMUM_WIDTH:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(getRoadMaximumWidth());
            break;
        case HAS_STREET_LIGHTS:
            // empty
            break;
        case SHARED_ROAD_SURFACE_WITH_PEDESTRIANS:
            // empty
            break;
        case IN_BUSINESS_DISTRICT:
            // empty
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RegionValidityValue: " + getType() + "!");
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
        case NUM_LANES:
            endBitPosition += zserioContext.getNumLanes().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(getNumLanes()));
            break;
        case MIN_LANES:
            endBitPosition += zserioContext.getMinLanes().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(getMinLanes()));
            break;
        case PAVED:
            endBitPosition += 1;
            break;
        case TRAFFIC_ZONE:
            endBitPosition += getTrafficZone().bitSizeOf(zserioContext.getTrafficZone(), endBitPosition);
            break;
        case PRIORITY_ROAD_CLASS:
            endBitPosition += zserioContext.getPriorityRoadClass().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(4)),
                    new zserio.runtime.array.ArrayElement.ByteArrayElement(getPriorityRoadClass()));
            break;
        case BEGINNER:
            // empty
            break;
        case NO_MARKINGS:
            // empty
            break;
        case ROAD_MINIMUM_WIDTH:
            endBitPosition += zserioContext.getRoadMinimumWidth().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(getRoadMinimumWidth()));
            break;
        case ROAD_MAXIMUM_WIDTH:
            endBitPosition += zserioContext.getRoadMaximumWidth().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(getRoadMaximumWidth()));
            break;
        case HAS_STREET_LIGHTS:
            // empty
            break;
        case SHARED_ROAD_SURFACE_WITH_PEDESTRIANS:
            // empty
            break;
        case IN_BUSINESS_DISTRICT:
            // empty
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RegionValidityValue: " + getType() + "!");
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.rules.types.RegionValidityType getType()
    {
        return this.type_;
    }

    public short getNumLanes()
    {
        return (java.lang.Short)objectChoice;
    }

    public void setNumLanes(short numLanes_)
    {
        objectChoice = numLanes_;
    }

    public short getMinLanes()
    {
        return (java.lang.Short)objectChoice;
    }

    public void setMinLanes(short minLanes_)
    {
        objectChoice = minLanes_;
    }

    public boolean getPaved()
    {
        return (java.lang.Boolean)objectChoice;
    }

    public void setPaved(boolean paved_)
    {
        objectChoice = paved_;
    }

    public nds.rules.types.TrafficZone getTrafficZone()
    {
        return (nds.rules.types.TrafficZone)objectChoice;
    }

    public void setTrafficZone(nds.rules.types.TrafficZone trafficZone_)
    {
        objectChoice = trafficZone_;
    }

    public byte getPriorityRoadClass()
    {
        return (java.lang.Byte)objectChoice;
    }

    public void setPriorityRoadClass(byte priorityRoadClass_)
    {
        objectChoice = priorityRoadClass_;
    }

    public int getRoadMinimumWidth()
    {
        return (java.lang.Integer)objectChoice;
    }

    public void setRoadMinimumWidth(int roadMinimumWidth_)
    {
        objectChoice = roadMinimumWidth_;
    }

    public int getRoadMaximumWidth()
    {
        return (java.lang.Integer)objectChoice;
    }

    public void setRoadMaximumWidth(int roadMaximumWidth_)
    {
        objectChoice = roadMaximumWidth_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RegionValidityValue)
        {
            final RegionValidityValue that = (RegionValidityValue)obj;

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
            case NUM_LANES:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.Short)objectChoice);
                break;
            case MIN_LANES:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.Short)objectChoice);
                break;
            case PAVED:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.Boolean)objectChoice);
                break;
            case TRAFFIC_ZONE:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (nds.rules.types.TrafficZone)objectChoice);
                break;
            case PRIORITY_ROAD_CLASS:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.Byte)objectChoice);
                break;
            case BEGINNER:
                // empty
                break;
            case NO_MARKINGS:
                // empty
                break;
            case ROAD_MINIMUM_WIDTH:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.Integer)objectChoice);
                break;
            case ROAD_MAXIMUM_WIDTH:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.Integer)objectChoice);
                break;
            case HAS_STREET_LIGHTS:
                // empty
                break;
            case SHARED_ROAD_SURFACE_WITH_PEDESTRIANS:
                // empty
                break;
            case IN_BUSINESS_DISTRICT:
                // empty
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
        case NUM_LANES:
            objectChoice = in.readVarUInt16();
            break;
        case MIN_LANES:
            objectChoice = in.readVarUInt16();
            break;
        case PAVED:
            objectChoice = in.readBool();
            break;
        case TRAFFIC_ZONE:
            objectChoice = nds.rules.types.TrafficZone.readEnum(in);
            break;
        case PRIORITY_ROAD_CLASS:
            objectChoice = (byte)in.readBits(4);
            break;
        case BEGINNER:
            // empty
            break;
        case NO_MARKINGS:
            // empty
            break;
        case ROAD_MINIMUM_WIDTH:
            objectChoice = in.readVarUInt32();
            break;
        case ROAD_MAXIMUM_WIDTH:
            objectChoice = in.readVarUInt32();
            break;
        case HAS_STREET_LIGHTS:
            // empty
            break;
        case SHARED_ROAD_SURFACE_WITH_PEDESTRIANS:
            // empty
            break;
        case IN_BUSINESS_DISTRICT:
            // empty
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RegionValidityValue: " + getType() + "!");
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        switch (getType())
        {
        case NUM_LANES:
            objectChoice = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                    zserioContext.getNumLanes().read(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), in)).get();
            break;
        case MIN_LANES:
            objectChoice = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                    zserioContext.getMinLanes().read(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), in)).get();
            break;
        case PAVED:
            objectChoice = in.readBool();
            break;
        case TRAFFIC_ZONE:
            objectChoice = nds.rules.types.TrafficZone.readEnum(zserioContext.getTrafficZone(), in);
            break;
        case PRIORITY_ROAD_CLASS:
            objectChoice = ((zserio.runtime.array.ArrayElement.ByteArrayElement)
                    zserioContext.getPriorityRoadClass().read(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(4)), in)).get();
            break;
        case BEGINNER:
            // empty
            break;
        case NO_MARKINGS:
            // empty
            break;
        case ROAD_MINIMUM_WIDTH:
            objectChoice = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                    zserioContext.getRoadMinimumWidth().read(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), in)).get();
            break;
        case ROAD_MAXIMUM_WIDTH:
            objectChoice = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                    zserioContext.getRoadMaximumWidth().read(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), in)).get();
            break;
        case HAS_STREET_LIGHTS:
            // empty
            break;
        case SHARED_ROAD_SURFACE_WITH_PEDESTRIANS:
            // empty
            break;
        case IN_BUSINESS_DISTRICT:
            // empty
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RegionValidityValue: " + getType() + "!");
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
        case NUM_LANES:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(getNumLanes());
            }
            break;
        case MIN_LANES:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(getMinLanes());
            }
            break;
        case PAVED:
            {
                endBitPosition += 1;
            }
            break;
        case TRAFFIC_ZONE:
            {
                endBitPosition += getTrafficZone().bitSizeOf(endBitPosition);
            }
            break;
        case PRIORITY_ROAD_CLASS:
            {
                endBitPosition += 4;
            }
            break;
        case BEGINNER:
            // empty
            break;
        case NO_MARKINGS:
            // empty
            break;
        case ROAD_MINIMUM_WIDTH:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(getRoadMinimumWidth());
            }
            break;
        case ROAD_MAXIMUM_WIDTH:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(getRoadMaximumWidth());
            }
            break;
        case HAS_STREET_LIGHTS:
            // empty
            break;
        case SHARED_ROAD_SURFACE_WITH_PEDESTRIANS:
            // empty
            break;
        case IN_BUSINESS_DISTRICT:
            // empty
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RegionValidityValue: " + getType() + "!");
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
        case NUM_LANES:
            {
                endBitPosition += zserioContext.getNumLanes().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                        new zserio.runtime.array.ArrayElement.ShortArrayElement(getNumLanes()));
            }
            break;
        case MIN_LANES:
            {
                endBitPosition += zserioContext.getMinLanes().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                        new zserio.runtime.array.ArrayElement.ShortArrayElement(getMinLanes()));
            }
            break;
        case PAVED:
            {
                endBitPosition += 1;
            }
            break;
        case TRAFFIC_ZONE:
            {
                endBitPosition = getTrafficZone().initializeOffsets(zserioContext.getTrafficZone(), endBitPosition);
            }
            break;
        case PRIORITY_ROAD_CLASS:
            {
                endBitPosition += zserioContext.getPriorityRoadClass().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(4)),
                        new zserio.runtime.array.ArrayElement.ByteArrayElement(getPriorityRoadClass()));
            }
            break;
        case BEGINNER:
            // empty
            break;
        case NO_MARKINGS:
            // empty
            break;
        case ROAD_MINIMUM_WIDTH:
            {
                endBitPosition += zserioContext.getRoadMinimumWidth().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                        new zserio.runtime.array.ArrayElement.IntArrayElement(getRoadMinimumWidth()));
            }
            break;
        case ROAD_MAXIMUM_WIDTH:
            {
                endBitPosition += zserioContext.getRoadMaximumWidth().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                        new zserio.runtime.array.ArrayElement.IntArrayElement(getRoadMaximumWidth()));
            }
            break;
        case HAS_STREET_LIGHTS:
            // empty
            break;
        case SHARED_ROAD_SURFACE_WITH_PEDESTRIANS:
            // empty
            break;
        case IN_BUSINESS_DISTRICT:
            // empty
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RegionValidityValue: " + getType() + "!");
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        switch (getType())
        {
        case NUM_LANES:
            out.writeVarUInt16(getNumLanes());
            break;
        case MIN_LANES:
            out.writeVarUInt16(getMinLanes());
            break;
        case PAVED:
            out.writeBool(getPaved());
            break;
        case TRAFFIC_ZONE:
            getTrafficZone().write(out);
            break;
        case PRIORITY_ROAD_CLASS:
            out.writeBits(getPriorityRoadClass(), 4);
            break;
        case BEGINNER:
            // empty
            break;
        case NO_MARKINGS:
            // empty
            break;
        case ROAD_MINIMUM_WIDTH:
            out.writeVarUInt32(getRoadMinimumWidth());
            break;
        case ROAD_MAXIMUM_WIDTH:
            out.writeVarUInt32(getRoadMaximumWidth());
            break;
        case HAS_STREET_LIGHTS:
            // empty
            break;
        case SHARED_ROAD_SURFACE_WITH_PEDESTRIANS:
            // empty
            break;
        case IN_BUSINESS_DISTRICT:
            // empty
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RegionValidityValue: " + getType() + "!");
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        switch (getType())
        {
        case NUM_LANES:
            zserioContext.getNumLanes().write(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(getNumLanes()));
            break;
        case MIN_LANES:
            zserioContext.getMinLanes().write(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(getMinLanes()));
            break;
        case PAVED:
            out.writeBool(getPaved());
            break;
        case TRAFFIC_ZONE:
            getTrafficZone().write(zserioContext.getTrafficZone(), out);
            break;
        case PRIORITY_ROAD_CLASS:
            zserioContext.getPriorityRoadClass().write(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(4)), out,
                    new zserio.runtime.array.ArrayElement.ByteArrayElement(getPriorityRoadClass()));
            break;
        case BEGINNER:
            // empty
            break;
        case NO_MARKINGS:
            // empty
            break;
        case ROAD_MINIMUM_WIDTH:
            zserioContext.getRoadMinimumWidth().write(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.IntArrayElement(getRoadMinimumWidth()));
            break;
        case ROAD_MAXIMUM_WIDTH:
            zserioContext.getRoadMaximumWidth().write(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.IntArrayElement(getRoadMaximumWidth()));
            break;
        case HAS_STREET_LIGHTS:
            // empty
            break;
        case SHARED_ROAD_SURFACE_WITH_PEDESTRIANS:
            // empty
            break;
        case IN_BUSINESS_DISTRICT:
            // empty
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RegionValidityValue: " + getType() + "!");
        }
    }

    public static final int CHOICE_numLanes = 0;
    public static final int CHOICE_minLanes = 1;
    public static final int CHOICE_paved = 2;
    public static final int CHOICE_trafficZone = 3;
    public static final int CHOICE_priorityRoadClass = 4;
    public static final int CHOICE_roadMinimumWidth = 5;
    public static final int CHOICE_roadMaximumWidth = 6;
    public static final int UNDEFINED_CHOICE = -1;

    private final nds.rules.types.RegionValidityType type_;
    private java.lang.Object objectChoice;
}
