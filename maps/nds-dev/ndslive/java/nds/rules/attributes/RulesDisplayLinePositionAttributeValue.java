/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.rules.attributes;

public class RulesDisplayLinePositionAttributeValue implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            trafficEnforcementCamera_ = new zserio.runtime.array.DeltaContext();
            movableWarningSign_ = new zserio.runtime.array.DeltaContext();
            warningSign_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getTrafficEnforcementCamera()
        {
            return trafficEnforcementCamera_;
        }

        public zserio.runtime.array.DeltaContext getMovableWarningSign()
        {
            return movableWarningSign_;
        }

        public zserio.runtime.array.DeltaContext getWarningSign()
        {
            return warningSign_;
        }

        private zserio.runtime.array.DeltaContext trafficEnforcementCamera_;
        private zserio.runtime.array.DeltaContext movableWarningSign_;
        private zserio.runtime.array.DeltaContext warningSign_;
    };

    public RulesDisplayLinePositionAttributeValue(
            nds.rules.attributes.RulesDisplayLinePositionAttributeType type_)
    {
        this.type_ = type_;
    }

    public RulesDisplayLinePositionAttributeValue(zserio.runtime.io.BitStreamReader in,
            nds.rules.attributes.RulesDisplayLinePositionAttributeType type_)
            throws java.io.IOException
    {
        this.type_ = type_;

        read(in);
    }

    public RulesDisplayLinePositionAttributeValue(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            nds.rules.attributes.RulesDisplayLinePositionAttributeType type_)
            throws java.io.IOException
    {
        this.type_ = type_;

        read(context, in);
    }

    public int choiceTag()
    {
        switch (getType())
        {
        case TRAFFIC_LIGHTS:
            return CHOICE_trafficLights;
        case TRAFFIC_ENFORCEMENT_CAMERA:
            return CHOICE_trafficEnforcementCamera;
        case MOVABLE_WARNING_SIGN:
            return CHOICE_movableWarningSign;
        case WARNING_SIGN:
            return CHOICE_warningSign;
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
        case TRAFFIC_LIGHTS:
            break;
        case TRAFFIC_ENFORCEMENT_CAMERA:
            getTrafficEnforcementCamera().initPackingContext(zserioContext.getTrafficEnforcementCamera());
            break;
        case MOVABLE_WARNING_SIGN:
            getMovableWarningSign().initPackingContext(zserioContext.getMovableWarningSign());
            break;
        case WARNING_SIGN:
            getWarningSign().initPackingContext(zserioContext.getWarningSign());
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RulesDisplayLinePositionAttributeValue: " + getType() + "!");
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
        case TRAFFIC_LIGHTS:
            endBitPosition += getTrafficLights().bitSizeOf(endBitPosition);
            break;
        case TRAFFIC_ENFORCEMENT_CAMERA:
            endBitPosition += getTrafficEnforcementCamera().bitSizeOf(endBitPosition);
            break;
        case MOVABLE_WARNING_SIGN:
            endBitPosition += getMovableWarningSign().bitSizeOf(endBitPosition);
            break;
        case WARNING_SIGN:
            endBitPosition += getWarningSign().bitSizeOf(endBitPosition);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RulesDisplayLinePositionAttributeValue: " + getType() + "!");
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
        case TRAFFIC_LIGHTS:
            endBitPosition += getTrafficLights().bitSizeOf(endBitPosition);
            break;
        case TRAFFIC_ENFORCEMENT_CAMERA:
            endBitPosition += getTrafficEnforcementCamera().bitSizeOf(zserioContext.getTrafficEnforcementCamera(), endBitPosition);
            break;
        case MOVABLE_WARNING_SIGN:
            endBitPosition += getMovableWarningSign().bitSizeOf(zserioContext.getMovableWarningSign(), endBitPosition);
            break;
        case WARNING_SIGN:
            endBitPosition += getWarningSign().bitSizeOf(zserioContext.getWarningSign(), endBitPosition);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RulesDisplayLinePositionAttributeValue: " + getType() + "!");
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.rules.attributes.RulesDisplayLinePositionAttributeType getType()
    {
        return this.type_;
    }

    public nds.core.types.Flag getTrafficLights()
    {
        return (nds.core.types.Flag)objectChoice;
    }

    public void setTrafficLights(nds.core.types.Flag trafficLights_)
    {
        objectChoice = trafficLights_;
    }

    public nds.core.types.TrafficEnforcementCameraType getTrafficEnforcementCamera()
    {
        return (nds.core.types.TrafficEnforcementCameraType)objectChoice;
    }

    public void setTrafficEnforcementCamera(nds.core.types.TrafficEnforcementCameraType trafficEnforcementCamera_)
    {
        objectChoice = trafficEnforcementCamera_;
    }

    public nds.signs.warning.WarningSign getMovableWarningSign()
    {
        return (nds.signs.warning.WarningSign)objectChoice;
    }

    public void setMovableWarningSign(nds.signs.warning.WarningSign movableWarningSign_)
    {
        objectChoice = movableWarningSign_;
    }

    public nds.signs.warning.WarningSign getWarningSign()
    {
        return (nds.signs.warning.WarningSign)objectChoice;
    }

    public void setWarningSign(nds.signs.warning.WarningSign warningSign_)
    {
        objectChoice = warningSign_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RulesDisplayLinePositionAttributeValue)
        {
            final RulesDisplayLinePositionAttributeValue that = (RulesDisplayLinePositionAttributeValue)obj;

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
            case TRAFFIC_LIGHTS:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (nds.core.types.Flag)objectChoice);
                break;
            case TRAFFIC_ENFORCEMENT_CAMERA:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (nds.core.types.TrafficEnforcementCameraType)objectChoice);
                break;
            case MOVABLE_WARNING_SIGN:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (nds.signs.warning.WarningSign)objectChoice);
                break;
            case WARNING_SIGN:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (nds.signs.warning.WarningSign)objectChoice);
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
        case TRAFFIC_LIGHTS:
            objectChoice = new nds.core.types.Flag(in);
            break;
        case TRAFFIC_ENFORCEMENT_CAMERA:
            objectChoice = nds.core.types.TrafficEnforcementCameraType.readEnum(in);
            break;
        case MOVABLE_WARNING_SIGN:
            objectChoice = nds.signs.warning.WarningSign.readEnum(in);
            break;
        case WARNING_SIGN:
            objectChoice = nds.signs.warning.WarningSign.readEnum(in);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RulesDisplayLinePositionAttributeValue: " + getType() + "!");
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        switch (getType())
        {
        case TRAFFIC_LIGHTS:
            objectChoice = new nds.core.types.Flag(in);
            break;
        case TRAFFIC_ENFORCEMENT_CAMERA:
            objectChoice = nds.core.types.TrafficEnforcementCameraType.readEnum(zserioContext.getTrafficEnforcementCamera(), in);
            break;
        case MOVABLE_WARNING_SIGN:
            objectChoice = nds.signs.warning.WarningSign.readEnum(zserioContext.getMovableWarningSign(), in);
            break;
        case WARNING_SIGN:
            objectChoice = nds.signs.warning.WarningSign.readEnum(zserioContext.getWarningSign(), in);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RulesDisplayLinePositionAttributeValue: " + getType() + "!");
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
        case TRAFFIC_LIGHTS:
            {
                endBitPosition = getTrafficLights().initializeOffsets(endBitPosition);
            }
            break;
        case TRAFFIC_ENFORCEMENT_CAMERA:
            {
                endBitPosition += getTrafficEnforcementCamera().bitSizeOf(endBitPosition);
            }
            break;
        case MOVABLE_WARNING_SIGN:
            {
                endBitPosition += getMovableWarningSign().bitSizeOf(endBitPosition);
            }
            break;
        case WARNING_SIGN:
            {
                endBitPosition += getWarningSign().bitSizeOf(endBitPosition);
            }
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RulesDisplayLinePositionAttributeValue: " + getType() + "!");
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
        case TRAFFIC_LIGHTS:
            {
                endBitPosition = getTrafficLights().initializeOffsets(endBitPosition);
            }
            break;
        case TRAFFIC_ENFORCEMENT_CAMERA:
            {
                endBitPosition = getTrafficEnforcementCamera().initializeOffsets(zserioContext.getTrafficEnforcementCamera(), endBitPosition);
            }
            break;
        case MOVABLE_WARNING_SIGN:
            {
                endBitPosition = getMovableWarningSign().initializeOffsets(zserioContext.getMovableWarningSign(), endBitPosition);
            }
            break;
        case WARNING_SIGN:
            {
                endBitPosition = getWarningSign().initializeOffsets(zserioContext.getWarningSign(), endBitPosition);
            }
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RulesDisplayLinePositionAttributeValue: " + getType() + "!");
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        switch (getType())
        {
        case TRAFFIC_LIGHTS:
            getTrafficLights().write(out);
            break;
        case TRAFFIC_ENFORCEMENT_CAMERA:
            getTrafficEnforcementCamera().write(out);
            break;
        case MOVABLE_WARNING_SIGN:
            getMovableWarningSign().write(out);
            break;
        case WARNING_SIGN:
            getWarningSign().write(out);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RulesDisplayLinePositionAttributeValue: " + getType() + "!");
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        switch (getType())
        {
        case TRAFFIC_LIGHTS:
            getTrafficLights().write(out);
            break;
        case TRAFFIC_ENFORCEMENT_CAMERA:
            getTrafficEnforcementCamera().write(zserioContext.getTrafficEnforcementCamera(), out);
            break;
        case MOVABLE_WARNING_SIGN:
            getMovableWarningSign().write(zserioContext.getMovableWarningSign(), out);
            break;
        case WARNING_SIGN:
            getWarningSign().write(zserioContext.getWarningSign(), out);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RulesDisplayLinePositionAttributeValue: " + getType() + "!");
        }
    }

    public static final int CHOICE_trafficLights = 0;
    public static final int CHOICE_trafficEnforcementCamera = 1;
    public static final int CHOICE_movableWarningSign = 2;
    public static final int CHOICE_warningSign = 3;
    public static final int UNDEFINED_CHOICE = -1;

    private final nds.rules.attributes.RulesDisplayLinePositionAttributeType type_;
    private java.lang.Object objectChoice;
}
