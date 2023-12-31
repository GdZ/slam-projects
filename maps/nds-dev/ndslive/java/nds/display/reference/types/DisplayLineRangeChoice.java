/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.reference.types;

public class DisplayLineRangeChoice implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            validityRange_ = new nds.display.reference.types.DisplayLineValidityRange.ZserioPackingContext();
            geometryRange_ = new nds.core.geometry.LineRangeUnchecked.ZserioPackingContext();
            geometryOffsetRange_ = new nds.core.geometry.LineRangeOffset2D.ZserioPackingContext();
            percentageRange_ = new nds.core.types.PercentageRange.ZserioPackingContext();
            curvedLabelPositioningHint_ = new nds.display.reference.types.CurvedLabelPositioningHint.ZserioPackingContext();
        }

        public nds.display.reference.types.DisplayLineValidityRange.ZserioPackingContext getValidityRange()
        {
            return validityRange_;
        }

        public nds.core.geometry.LineRangeUnchecked.ZserioPackingContext getGeometryRange()
        {
            return geometryRange_;
        }

        public nds.core.geometry.LineRangeOffset2D.ZserioPackingContext getGeometryOffsetRange()
        {
            return geometryOffsetRange_;
        }

        public nds.core.types.PercentageRange.ZserioPackingContext getPercentageRange()
        {
            return percentageRange_;
        }

        public nds.display.reference.types.CurvedLabelPositioningHint.ZserioPackingContext getCurvedLabelPositioningHint()
        {
            return curvedLabelPositioningHint_;
        }

        private nds.display.reference.types.DisplayLineValidityRange.ZserioPackingContext validityRange_;
        private nds.core.geometry.LineRangeUnchecked.ZserioPackingContext geometryRange_;
        private nds.core.geometry.LineRangeOffset2D.ZserioPackingContext geometryOffsetRange_;
        private nds.core.types.PercentageRange.ZserioPackingContext percentageRange_;
        private nds.display.reference.types.CurvedLabelPositioningHint.ZserioPackingContext curvedLabelPositioningHint_;
    };

    public DisplayLineRangeChoice(
            nds.display.reference.types.DisplayLineValidityType type_,
            byte shift_)
    {
        this.type_ = type_;
        this.shift_ = shift_;
    }

    public DisplayLineRangeChoice(zserio.runtime.io.BitStreamReader in,
            nds.display.reference.types.DisplayLineValidityType type_,
            byte shift_)
            throws java.io.IOException
    {
        this.type_ = type_;
        this.shift_ = shift_;

        read(in);
    }

    public DisplayLineRangeChoice(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            nds.display.reference.types.DisplayLineValidityType type_,
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
        case POSITION:
            return CHOICE_validityRange;
        case GEOMETRY:
            return CHOICE_geometryRange;
        case GEOMETRY_OFFSET:
            return CHOICE_geometryOffsetRange;
        case PERCENTAGE:
            return CHOICE_percentageRange;
        case CURVED_LABEL_POSITIONING_HINT:
            return CHOICE_curvedLabelPositioningHint;
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
        case POSITION:
            getValidityRange().initPackingContext(zserioContext.getValidityRange());
            break;
        case GEOMETRY:
            getGeometryRange().initPackingContext(zserioContext.getGeometryRange());
            break;
        case GEOMETRY_OFFSET:
            getGeometryOffsetRange().initPackingContext(zserioContext.getGeometryOffsetRange());
            break;
        case PERCENTAGE:
            getPercentageRange().initPackingContext(zserioContext.getPercentageRange());
            break;
        case CURVED_LABEL_POSITIONING_HINT:
            getCurvedLabelPositioningHint().initPackingContext(zserioContext.getCurvedLabelPositioningHint());
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayLineRangeChoice: " + getType() + "!");
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
        case POSITION:
            endBitPosition += getValidityRange().bitSizeOf(endBitPosition);
            break;
        case GEOMETRY:
            endBitPosition += getGeometryRange().bitSizeOf(endBitPosition);
            break;
        case GEOMETRY_OFFSET:
            endBitPosition += getGeometryOffsetRange().bitSizeOf(endBitPosition);
            break;
        case PERCENTAGE:
            endBitPosition += getPercentageRange().bitSizeOf(endBitPosition);
            break;
        case CURVED_LABEL_POSITIONING_HINT:
            endBitPosition += getCurvedLabelPositioningHint().bitSizeOf(endBitPosition);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayLineRangeChoice: " + getType() + "!");
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
        case POSITION:
            endBitPosition += getValidityRange().bitSizeOf(zserioContext.getValidityRange(), endBitPosition);
            break;
        case GEOMETRY:
            endBitPosition += getGeometryRange().bitSizeOf(zserioContext.getGeometryRange(), endBitPosition);
            break;
        case GEOMETRY_OFFSET:
            endBitPosition += getGeometryOffsetRange().bitSizeOf(zserioContext.getGeometryOffsetRange(), endBitPosition);
            break;
        case PERCENTAGE:
            endBitPosition += getPercentageRange().bitSizeOf(zserioContext.getPercentageRange(), endBitPosition);
            break;
        case CURVED_LABEL_POSITIONING_HINT:
            endBitPosition += getCurvedLabelPositioningHint().bitSizeOf(zserioContext.getCurvedLabelPositioningHint(), endBitPosition);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayLineRangeChoice: " + getType() + "!");
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.display.reference.types.DisplayLineValidityType getType()
    {
        return this.type_;
    }

    public byte getShift()
    {
        return this.shift_;
    }

    public nds.display.reference.types.DisplayLineValidityRange getValidityRange()
    {
        return (nds.display.reference.types.DisplayLineValidityRange)objectChoice;
    }

    public void setValidityRange(nds.display.reference.types.DisplayLineValidityRange validityRange_)
    {
        objectChoice = validityRange_;
    }

    public nds.core.geometry.LineRangeUnchecked getGeometryRange()
    {
        return (nds.core.geometry.LineRangeUnchecked)objectChoice;
    }

    public void setGeometryRange(nds.core.geometry.LineRangeUnchecked geometryRange_)
    {
        objectChoice = geometryRange_;
    }

    public nds.core.geometry.LineRangeOffset2D getGeometryOffsetRange()
    {
        return (nds.core.geometry.LineRangeOffset2D)objectChoice;
    }

    public void setGeometryOffsetRange(nds.core.geometry.LineRangeOffset2D geometryOffsetRange_)
    {
        objectChoice = geometryOffsetRange_;
    }

    public nds.core.types.PercentageRange getPercentageRange()
    {
        return (nds.core.types.PercentageRange)objectChoice;
    }

    public void setPercentageRange(nds.core.types.PercentageRange percentageRange_)
    {
        objectChoice = percentageRange_;
    }

    public nds.display.reference.types.CurvedLabelPositioningHint getCurvedLabelPositioningHint()
    {
        return (nds.display.reference.types.CurvedLabelPositioningHint)objectChoice;
    }

    public void setCurvedLabelPositioningHint(nds.display.reference.types.CurvedLabelPositioningHint curvedLabelPositioningHint_)
    {
        objectChoice = curvedLabelPositioningHint_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof DisplayLineRangeChoice)
        {
            final DisplayLineRangeChoice that = (DisplayLineRangeChoice)obj;

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
            case POSITION:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (nds.display.reference.types.DisplayLineValidityRange)objectChoice);
                break;
            case GEOMETRY:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (nds.core.geometry.LineRangeUnchecked)objectChoice);
                break;
            case GEOMETRY_OFFSET:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (nds.core.geometry.LineRangeOffset2D)objectChoice);
                break;
            case PERCENTAGE:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (nds.core.types.PercentageRange)objectChoice);
                break;
            case CURVED_LABEL_POSITIONING_HINT:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (nds.display.reference.types.CurvedLabelPositioningHint)objectChoice);
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
        case POSITION:
            objectChoice = new nds.display.reference.types.DisplayLineValidityRange(in, (byte)(getShift()));
            break;
        case GEOMETRY:
            objectChoice = new nds.core.geometry.LineRangeUnchecked(in);
            break;
        case GEOMETRY_OFFSET:
            objectChoice = new nds.core.geometry.LineRangeOffset2D(in, (byte)(getShift()));
            break;
        case PERCENTAGE:
            objectChoice = new nds.core.types.PercentageRange(in);
            break;
        case CURVED_LABEL_POSITIONING_HINT:
            objectChoice = new nds.display.reference.types.CurvedLabelPositioningHint(in, (byte)(getShift()));
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayLineRangeChoice: " + getType() + "!");
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
        case POSITION:
            objectChoice = new nds.display.reference.types.DisplayLineValidityRange(zserioContext.getValidityRange(), in, (byte)(getShift()));
            break;
        case GEOMETRY:
            objectChoice = new nds.core.geometry.LineRangeUnchecked(zserioContext.getGeometryRange(), in);
            break;
        case GEOMETRY_OFFSET:
            objectChoice = new nds.core.geometry.LineRangeOffset2D(zserioContext.getGeometryOffsetRange(), in, (byte)(getShift()));
            break;
        case PERCENTAGE:
            objectChoice = new nds.core.types.PercentageRange(zserioContext.getPercentageRange(), in);
            break;
        case CURVED_LABEL_POSITIONING_HINT:
            objectChoice = new nds.display.reference.types.CurvedLabelPositioningHint(zserioContext.getCurvedLabelPositioningHint(), in, (byte)(getShift()));
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayLineRangeChoice: " + getType() + "!");
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
        case POSITION:
            {
                endBitPosition = getValidityRange().initializeOffsets(endBitPosition);
            }
            break;
        case GEOMETRY:
            {
                endBitPosition = getGeometryRange().initializeOffsets(endBitPosition);
            }
            break;
        case GEOMETRY_OFFSET:
            {
                endBitPosition = getGeometryOffsetRange().initializeOffsets(endBitPosition);
            }
            break;
        case PERCENTAGE:
            {
                endBitPosition = getPercentageRange().initializeOffsets(endBitPosition);
            }
            break;
        case CURVED_LABEL_POSITIONING_HINT:
            {
                endBitPosition = getCurvedLabelPositioningHint().initializeOffsets(endBitPosition);
            }
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayLineRangeChoice: " + getType() + "!");
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
        case POSITION:
            {
                endBitPosition = getValidityRange().initializeOffsets(zserioContext.getValidityRange(), endBitPosition);
            }
            break;
        case GEOMETRY:
            {
                endBitPosition = getGeometryRange().initializeOffsets(zserioContext.getGeometryRange(), endBitPosition);
            }
            break;
        case GEOMETRY_OFFSET:
            {
                endBitPosition = getGeometryOffsetRange().initializeOffsets(zserioContext.getGeometryOffsetRange(), endBitPosition);
            }
            break;
        case PERCENTAGE:
            {
                endBitPosition = getPercentageRange().initializeOffsets(zserioContext.getPercentageRange(), endBitPosition);
            }
            break;
        case CURVED_LABEL_POSITIONING_HINT:
            {
                endBitPosition = getCurvedLabelPositioningHint().initializeOffsets(zserioContext.getCurvedLabelPositioningHint(), endBitPosition);
            }
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayLineRangeChoice: " + getType() + "!");
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
        case POSITION:
            // check parameters
            if (getValidityRange().getShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter shift for field DisplayLineRangeChoice.validityRange: " +
                        getValidityRange().getShift() + " != " + (byte)(getShift()) + "!");
            }
            getValidityRange().write(out);
            break;
        case GEOMETRY:
            getGeometryRange().write(out);
            break;
        case GEOMETRY_OFFSET:
            // check parameters
            if (getGeometryOffsetRange().getShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter shift for field DisplayLineRangeChoice.geometryOffsetRange: " +
                        getGeometryOffsetRange().getShift() + " != " + (byte)(getShift()) + "!");
            }
            getGeometryOffsetRange().write(out);
            break;
        case PERCENTAGE:
            getPercentageRange().write(out);
            break;
        case CURVED_LABEL_POSITIONING_HINT:
            // check parameters
            if (getCurvedLabelPositioningHint().getShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter shift for field DisplayLineRangeChoice.curvedLabelPositioningHint: " +
                        getCurvedLabelPositioningHint().getShift() + " != " + (byte)(getShift()) + "!");
            }
            getCurvedLabelPositioningHint().write(out);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayLineRangeChoice: " + getType() + "!");
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
        case POSITION:
            getValidityRange().write(zserioContext.getValidityRange(), out);
            break;
        case GEOMETRY:
            getGeometryRange().write(zserioContext.getGeometryRange(), out);
            break;
        case GEOMETRY_OFFSET:
            getGeometryOffsetRange().write(zserioContext.getGeometryOffsetRange(), out);
            break;
        case PERCENTAGE:
            getPercentageRange().write(zserioContext.getPercentageRange(), out);
            break;
        case CURVED_LABEL_POSITIONING_HINT:
            getCurvedLabelPositioningHint().write(zserioContext.getCurvedLabelPositioningHint(), out);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayLineRangeChoice: " + getType() + "!");
        }
    }

    public static final int CHOICE_validityRange = 0;
    public static final int CHOICE_geometryRange = 1;
    public static final int CHOICE_geometryOffsetRange = 2;
    public static final int CHOICE_percentageRange = 3;
    public static final int CHOICE_curvedLabelPositioningHint = 4;
    public static final int UNDEFINED_CHOICE = -1;

    private final nds.display.reference.types.DisplayLineValidityType type_;
    private final byte shift_;
    private java.lang.Object objectChoice;
}
