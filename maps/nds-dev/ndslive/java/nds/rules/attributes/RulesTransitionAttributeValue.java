/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.rules.attributes;

public class RulesTransitionAttributeValue implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            rightOfWayType_ = new zserio.runtime.array.DeltaContext();
            automatedDrivingClearance_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getRightOfWayType()
        {
            return rightOfWayType_;
        }

        public zserio.runtime.array.DeltaContext getAutomatedDrivingClearance()
        {
            return automatedDrivingClearance_;
        }

        private zserio.runtime.array.DeltaContext rightOfWayType_;
        private zserio.runtime.array.DeltaContext automatedDrivingClearance_;
    };

    public RulesTransitionAttributeValue(
            nds.rules.attributes.RulesTransitionAttributeType type_)
    {
        this.type_ = type_;
    }

    public RulesTransitionAttributeValue(zserio.runtime.io.BitStreamReader in,
            nds.rules.attributes.RulesTransitionAttributeType type_)
            throws java.io.IOException
    {
        this.type_ = type_;

        read(in);
    }

    public RulesTransitionAttributeValue(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            nds.rules.attributes.RulesTransitionAttributeType type_)
            throws java.io.IOException
    {
        this.type_ = type_;

        read(context, in);
    }

    public int choiceTag()
    {
        switch (getType())
        {
        case RIGHT_OF_WAY_REGULATION:
            return CHOICE_rightOfWayType;
        case TURN_ON_RED_ALLOWED:
            return CHOICE_turnOnRedAllowed;
        case PROHIBITED_TRANSITION:
            return CHOICE_prohibitedTransition;
        case AUTOMATED_DRIVING_CLEARANCE:
            return CHOICE_automatedDrivingClearance;
        case PREFERRED_U_TURN:
            return CHOICE_preferredUTurn;
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
        case RIGHT_OF_WAY_REGULATION:
            getRightOfWayType().initPackingContext(zserioContext.getRightOfWayType());
            break;
        case TURN_ON_RED_ALLOWED:
            break;
        case PROHIBITED_TRANSITION:
            break;
        case AUTOMATED_DRIVING_CLEARANCE:
            getAutomatedDrivingClearance().initPackingContext(zserioContext.getAutomatedDrivingClearance());
            break;
        case PREFERRED_U_TURN:
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RulesTransitionAttributeValue: " + getType() + "!");
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
        case RIGHT_OF_WAY_REGULATION:
            endBitPosition += getRightOfWayType().bitSizeOf(endBitPosition);
            break;
        case TURN_ON_RED_ALLOWED:
            endBitPosition += 1;
            break;
        case PROHIBITED_TRANSITION:
            endBitPosition += getProhibitedTransition().bitSizeOf(endBitPosition);
            break;
        case AUTOMATED_DRIVING_CLEARANCE:
            endBitPosition += getAutomatedDrivingClearance().bitSizeOf(endBitPosition);
            break;
        case PREFERRED_U_TURN:
            endBitPosition += getPreferredUTurn().bitSizeOf(endBitPosition);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RulesTransitionAttributeValue: " + getType() + "!");
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
        case RIGHT_OF_WAY_REGULATION:
            endBitPosition += getRightOfWayType().bitSizeOf(zserioContext.getRightOfWayType(), endBitPosition);
            break;
        case TURN_ON_RED_ALLOWED:
            endBitPosition += 1;
            break;
        case PROHIBITED_TRANSITION:
            endBitPosition += getProhibitedTransition().bitSizeOf(endBitPosition);
            break;
        case AUTOMATED_DRIVING_CLEARANCE:
            endBitPosition += getAutomatedDrivingClearance().bitSizeOf(zserioContext.getAutomatedDrivingClearance(), endBitPosition);
            break;
        case PREFERRED_U_TURN:
            endBitPosition += getPreferredUTurn().bitSizeOf(endBitPosition);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RulesTransitionAttributeValue: " + getType() + "!");
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.rules.attributes.RulesTransitionAttributeType getType()
    {
        return this.type_;
    }

    public nds.rules.types.RightOfWayType getRightOfWayType()
    {
        return (nds.rules.types.RightOfWayType)objectChoice;
    }

    public void setRightOfWayType(nds.rules.types.RightOfWayType rightOfWayType_)
    {
        objectChoice = rightOfWayType_;
    }

    public boolean getTurnOnRedAllowed()
    {
        return (java.lang.Boolean)objectChoice;
    }

    public void setTurnOnRedAllowed(boolean turnOnRedAllowed_)
    {
        objectChoice = turnOnRedAllowed_;
    }

    public nds.core.types.Flag getProhibitedTransition()
    {
        return (nds.core.types.Flag)objectChoice;
    }

    public void setProhibitedTransition(nds.core.types.Flag prohibitedTransition_)
    {
        objectChoice = prohibitedTransition_;
    }

    public nds.rules.types.AutomatedDrivingClearance getAutomatedDrivingClearance()
    {
        return (nds.rules.types.AutomatedDrivingClearance)objectChoice;
    }

    public void setAutomatedDrivingClearance(nds.rules.types.AutomatedDrivingClearance automatedDrivingClearance_)
    {
        objectChoice = automatedDrivingClearance_;
    }

    public nds.core.types.Flag getPreferredUTurn()
    {
        return (nds.core.types.Flag)objectChoice;
    }

    public void setPreferredUTurn(nds.core.types.Flag preferredUTurn_)
    {
        objectChoice = preferredUTurn_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RulesTransitionAttributeValue)
        {
            final RulesTransitionAttributeValue that = (RulesTransitionAttributeValue)obj;

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
            case RIGHT_OF_WAY_REGULATION:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (nds.rules.types.RightOfWayType)objectChoice);
                break;
            case TURN_ON_RED_ALLOWED:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.Boolean)objectChoice);
                break;
            case PROHIBITED_TRANSITION:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (nds.core.types.Flag)objectChoice);
                break;
            case AUTOMATED_DRIVING_CLEARANCE:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (nds.rules.types.AutomatedDrivingClearance)objectChoice);
                break;
            case PREFERRED_U_TURN:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (nds.core.types.Flag)objectChoice);
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
        case RIGHT_OF_WAY_REGULATION:
            objectChoice = nds.rules.types.RightOfWayType.readEnum(in);
            break;
        case TURN_ON_RED_ALLOWED:
            objectChoice = in.readBool();
            break;
        case PROHIBITED_TRANSITION:
            objectChoice = new nds.core.types.Flag(in);
            break;
        case AUTOMATED_DRIVING_CLEARANCE:
            objectChoice = nds.rules.types.AutomatedDrivingClearance.readEnum(in);
            break;
        case PREFERRED_U_TURN:
            objectChoice = new nds.core.types.Flag(in);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RulesTransitionAttributeValue: " + getType() + "!");
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        switch (getType())
        {
        case RIGHT_OF_WAY_REGULATION:
            objectChoice = nds.rules.types.RightOfWayType.readEnum(zserioContext.getRightOfWayType(), in);
            break;
        case TURN_ON_RED_ALLOWED:
            objectChoice = in.readBool();
            break;
        case PROHIBITED_TRANSITION:
            objectChoice = new nds.core.types.Flag(in);
            break;
        case AUTOMATED_DRIVING_CLEARANCE:
            objectChoice = nds.rules.types.AutomatedDrivingClearance.readEnum(zserioContext.getAutomatedDrivingClearance(), in);
            break;
        case PREFERRED_U_TURN:
            objectChoice = new nds.core.types.Flag(in);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RulesTransitionAttributeValue: " + getType() + "!");
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
        case RIGHT_OF_WAY_REGULATION:
            {
                endBitPosition += getRightOfWayType().bitSizeOf(endBitPosition);
            }
            break;
        case TURN_ON_RED_ALLOWED:
            {
                endBitPosition += 1;
            }
            break;
        case PROHIBITED_TRANSITION:
            {
                endBitPosition = getProhibitedTransition().initializeOffsets(endBitPosition);
            }
            break;
        case AUTOMATED_DRIVING_CLEARANCE:
            {
                endBitPosition += getAutomatedDrivingClearance().bitSizeOf(endBitPosition);
            }
            break;
        case PREFERRED_U_TURN:
            {
                endBitPosition = getPreferredUTurn().initializeOffsets(endBitPosition);
            }
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RulesTransitionAttributeValue: " + getType() + "!");
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
        case RIGHT_OF_WAY_REGULATION:
            {
                endBitPosition = getRightOfWayType().initializeOffsets(zserioContext.getRightOfWayType(), endBitPosition);
            }
            break;
        case TURN_ON_RED_ALLOWED:
            {
                endBitPosition += 1;
            }
            break;
        case PROHIBITED_TRANSITION:
            {
                endBitPosition = getProhibitedTransition().initializeOffsets(endBitPosition);
            }
            break;
        case AUTOMATED_DRIVING_CLEARANCE:
            {
                endBitPosition = getAutomatedDrivingClearance().initializeOffsets(zserioContext.getAutomatedDrivingClearance(), endBitPosition);
            }
            break;
        case PREFERRED_U_TURN:
            {
                endBitPosition = getPreferredUTurn().initializeOffsets(endBitPosition);
            }
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RulesTransitionAttributeValue: " + getType() + "!");
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        switch (getType())
        {
        case RIGHT_OF_WAY_REGULATION:
            getRightOfWayType().write(out);
            break;
        case TURN_ON_RED_ALLOWED:
            out.writeBool(getTurnOnRedAllowed());
            break;
        case PROHIBITED_TRANSITION:
            getProhibitedTransition().write(out);
            break;
        case AUTOMATED_DRIVING_CLEARANCE:
            getAutomatedDrivingClearance().write(out);
            break;
        case PREFERRED_U_TURN:
            getPreferredUTurn().write(out);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RulesTransitionAttributeValue: " + getType() + "!");
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        switch (getType())
        {
        case RIGHT_OF_WAY_REGULATION:
            getRightOfWayType().write(zserioContext.getRightOfWayType(), out);
            break;
        case TURN_ON_RED_ALLOWED:
            out.writeBool(getTurnOnRedAllowed());
            break;
        case PROHIBITED_TRANSITION:
            getProhibitedTransition().write(out);
            break;
        case AUTOMATED_DRIVING_CLEARANCE:
            getAutomatedDrivingClearance().write(zserioContext.getAutomatedDrivingClearance(), out);
            break;
        case PREFERRED_U_TURN:
            getPreferredUTurn().write(out);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RulesTransitionAttributeValue: " + getType() + "!");
        }
    }

    public static final int CHOICE_rightOfWayType = 0;
    public static final int CHOICE_turnOnRedAllowed = 1;
    public static final int CHOICE_prohibitedTransition = 2;
    public static final int CHOICE_automatedDrivingClearance = 3;
    public static final int CHOICE_preferredUTurn = 4;
    public static final int UNDEFINED_CHOICE = -1;

    private final nds.rules.attributes.RulesTransitionAttributeType type_;
    private java.lang.Object objectChoice;
}
