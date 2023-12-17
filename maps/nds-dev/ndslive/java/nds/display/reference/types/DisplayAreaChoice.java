/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.reference.types;

public class DisplayAreaChoice implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            hint_ = new nds.display.reference.types.LabelPositioningHint.ZserioPackingContext();
        }

        public nds.display.reference.types.LabelPositioningHint.ZserioPackingContext getHint()
        {
            return hint_;
        }

        private nds.display.reference.types.LabelPositioningHint.ZserioPackingContext hint_;
    };

    public DisplayAreaChoice(
            nds.display.reference.types.DisplayAreaValidityType type_,
            byte shift_)
    {
        this.type_ = type_;
        this.shift_ = shift_;
    }

    public DisplayAreaChoice(zserio.runtime.io.BitStreamReader in,
            nds.display.reference.types.DisplayAreaValidityType type_,
            byte shift_)
            throws java.io.IOException
    {
        this.type_ = type_;
        this.shift_ = shift_;

        read(in);
    }

    public DisplayAreaChoice(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            nds.display.reference.types.DisplayAreaValidityType type_,
            byte shift_)
            throws java.io.IOException
    {
        this.type_ = type_;
        this.shift_ = shift_;

        read(context, in);
    }

    public int choiceTag()
    {
        switch (getType())
        {
        case COMPLETE:
            return UNDEFINED_CHOICE;
        case LABEL_POSITIONING_HINT:
            return CHOICE_hint;
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
        case COMPLETE:
            // empty
            break;
        case LABEL_POSITIONING_HINT:
            getHint().initPackingContext(zserioContext.getHint());
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayAreaChoice: " + getType() + "!");
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
        case COMPLETE:
            // empty
            break;
        case LABEL_POSITIONING_HINT:
            endBitPosition += getHint().bitSizeOf(endBitPosition);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayAreaChoice: " + getType() + "!");
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
        case COMPLETE:
            // empty
            break;
        case LABEL_POSITIONING_HINT:
            endBitPosition += getHint().bitSizeOf(zserioContext.getHint(), endBitPosition);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayAreaChoice: " + getType() + "!");
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.display.reference.types.DisplayAreaValidityType getType()
    {
        return this.type_;
    }

    public byte getShift()
    {
        return this.shift_;
    }

    public nds.display.reference.types.LabelPositioningHint getHint()
    {
        return (nds.display.reference.types.LabelPositioningHint)objectChoice;
    }

    public void setHint(nds.display.reference.types.LabelPositioningHint hint_)
    {
        objectChoice = hint_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof DisplayAreaChoice)
        {
            final DisplayAreaChoice that = (DisplayAreaChoice)obj;

            return
                    ((this.type_ == null) ? that.type_ == null : this.type_.getValue() == that.type_.getValue()) &&
                    this.shift_ == that.shift_ &&
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
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getShift());
        if (objectChoice != null)
        {
            switch (getType())
            {
            case COMPLETE:
                // empty
                break;
            case LABEL_POSITIONING_HINT:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (nds.display.reference.types.LabelPositioningHint)objectChoice);
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
        case COMPLETE:
            // empty
            break;
        case LABEL_POSITIONING_HINT:
            objectChoice = new nds.display.reference.types.LabelPositioningHint(in, (byte)(getShift()));
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayAreaChoice: " + getType() + "!");
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        switch (getType())
        {
        case COMPLETE:
            // empty
            break;
        case LABEL_POSITIONING_HINT:
            objectChoice = new nds.display.reference.types.LabelPositioningHint(zserioContext.getHint(), in, (byte)(getShift()));
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayAreaChoice: " + getType() + "!");
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
        case COMPLETE:
            // empty
            break;
        case LABEL_POSITIONING_HINT:
            {
                endBitPosition = getHint().initializeOffsets(endBitPosition);
            }
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayAreaChoice: " + getType() + "!");
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
        case COMPLETE:
            // empty
            break;
        case LABEL_POSITIONING_HINT:
            {
                endBitPosition = getHint().initializeOffsets(zserioContext.getHint(), endBitPosition);
            }
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayAreaChoice: " + getType() + "!");
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        switch (getType())
        {
        case COMPLETE:
            // empty
            break;
        case LABEL_POSITIONING_HINT:
            // check parameters
            if (getHint().getShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter shift for field DisplayAreaChoice.hint: " +
                        getHint().getShift() + " != " + (byte)(getShift()) + "!");
            }
            getHint().write(out);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayAreaChoice: " + getType() + "!");
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        switch (getType())
        {
        case COMPLETE:
            // empty
            break;
        case LABEL_POSITIONING_HINT:
            getHint().write(zserioContext.getHint(), out);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayAreaChoice: " + getType() + "!");
        }
    }

    public static final int CHOICE_hint = 0;
    public static final int UNDEFINED_CHOICE = -1;

    private final nds.display.reference.types.DisplayAreaValidityType type_;
    private final byte shift_;
    private java.lang.Object objectChoice;
}
