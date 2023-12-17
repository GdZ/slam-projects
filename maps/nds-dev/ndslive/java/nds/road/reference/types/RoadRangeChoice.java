/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.road.reference.types;

public class RoadRangeChoice implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            validityRange_ = new nds.road.reference.types.RoadValidityRange.ZserioPackingContext();
            lengthRange_ = new nds.road.reference.types.RoadLengthRange.ZserioPackingContext();
            geometryRange_ = new nds.core.geometry.LineRangeUnchecked.ZserioPackingContext();
            geometryOffsetRange_ = new nds.core.geometry.LineRangeOffset2D.ZserioPackingContext();
            percentageRange_ = new nds.core.types.PercentageRange.ZserioPackingContext();
            roadLengthExtent_ = new zserio.runtime.array.DeltaContext();
        }

        public nds.road.reference.types.RoadValidityRange.ZserioPackingContext getValidityRange()
        {
            return validityRange_;
        }

        public nds.road.reference.types.RoadLengthRange.ZserioPackingContext getLengthRange()
        {
            return lengthRange_;
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

        public zserio.runtime.array.DeltaContext getRoadLengthExtent()
        {
            return roadLengthExtent_;
        }

        private nds.road.reference.types.RoadValidityRange.ZserioPackingContext validityRange_;
        private nds.road.reference.types.RoadLengthRange.ZserioPackingContext lengthRange_;
        private nds.core.geometry.LineRangeUnchecked.ZserioPackingContext geometryRange_;
        private nds.core.geometry.LineRangeOffset2D.ZserioPackingContext geometryOffsetRange_;
        private nds.core.types.PercentageRange.ZserioPackingContext percentageRange_;
        private zserio.runtime.array.DeltaContext roadLengthExtent_;
    };

    public RoadRangeChoice(
            nds.road.reference.types.RoadValidityType type_,
            byte shift_)
    {
        this.type_ = type_;
        this.shift_ = shift_;
    }

    public RoadRangeChoice(zserio.runtime.io.BitStreamReader in,
            nds.road.reference.types.RoadValidityType type_,
            byte shift_)
            throws java.io.IOException
    {
        this.type_ = type_;
        this.shift_ = shift_;

        read(in);
    }

    public RoadRangeChoice(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            nds.road.reference.types.RoadValidityType type_,
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
        case LENGTH:
            return CHOICE_lengthRange;
        case GEOMETRY:
            return CHOICE_geometryRange;
        case GEOMETRY_OFFSET:
            return CHOICE_geometryOffsetRange;
        case PERCENTAGE:
            return CHOICE_percentageRange;
        case EXTENT:
            return CHOICE_roadLengthExtent;
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
        case LENGTH:
            getLengthRange().initPackingContext(zserioContext.getLengthRange());
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
        case EXTENT:
            zserioContext.getRoadLengthExtent().init(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(getRoadLengthExtent()));
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RoadRangeChoice: " + getType() + "!");
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
        case LENGTH:
            endBitPosition += getLengthRange().bitSizeOf(endBitPosition);
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
        case EXTENT:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(getRoadLengthExtent());
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RoadRangeChoice: " + getType() + "!");
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
        case LENGTH:
            endBitPosition += getLengthRange().bitSizeOf(zserioContext.getLengthRange(), endBitPosition);
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
        case EXTENT:
            endBitPosition += zserioContext.getRoadLengthExtent().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(getRoadLengthExtent()));
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RoadRangeChoice: " + getType() + "!");
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.road.reference.types.RoadValidityType getType()
    {
        return this.type_;
    }

    public byte getShift()
    {
        return this.shift_;
    }

    public nds.road.reference.types.RoadValidityRange getValidityRange()
    {
        return (nds.road.reference.types.RoadValidityRange)objectChoice;
    }

    public void setValidityRange(nds.road.reference.types.RoadValidityRange validityRange_)
    {
        objectChoice = validityRange_;
    }

    public nds.road.reference.types.RoadLengthRange getLengthRange()
    {
        return (nds.road.reference.types.RoadLengthRange)objectChoice;
    }

    public void setLengthRange(nds.road.reference.types.RoadLengthRange lengthRange_)
    {
        objectChoice = lengthRange_;
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

    public int getRoadLengthExtent()
    {
        return (java.lang.Integer)objectChoice;
    }

    public void setRoadLengthExtent(int roadLengthExtent_)
    {
        objectChoice = roadLengthExtent_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RoadRangeChoice)
        {
            final RoadRangeChoice that = (RoadRangeChoice)obj;

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
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (nds.road.reference.types.RoadValidityRange)objectChoice);
                break;
            case LENGTH:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (nds.road.reference.types.RoadLengthRange)objectChoice);
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
            case EXTENT:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.Integer)objectChoice);
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
            objectChoice = new nds.road.reference.types.RoadValidityRange(in, (byte)(getShift()));
            break;
        case LENGTH:
            objectChoice = new nds.road.reference.types.RoadLengthRange(in);
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
        case EXTENT:
            objectChoice = in.readVarUInt32();
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RoadRangeChoice: " + getType() + "!");
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
            objectChoice = new nds.road.reference.types.RoadValidityRange(zserioContext.getValidityRange(), in, (byte)(getShift()));
            break;
        case LENGTH:
            objectChoice = new nds.road.reference.types.RoadLengthRange(zserioContext.getLengthRange(), in);
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
        case EXTENT:
            objectChoice = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                    zserioContext.getRoadLengthExtent().read(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), in)).get();
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RoadRangeChoice: " + getType() + "!");
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
        case LENGTH:
            {
                endBitPosition = getLengthRange().initializeOffsets(endBitPosition);
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
        case EXTENT:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(getRoadLengthExtent());
            }
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RoadRangeChoice: " + getType() + "!");
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
        case LENGTH:
            {
                endBitPosition = getLengthRange().initializeOffsets(zserioContext.getLengthRange(), endBitPosition);
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
        case EXTENT:
            {
                endBitPosition += zserioContext.getRoadLengthExtent().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                        new zserio.runtime.array.ArrayElement.IntArrayElement(getRoadLengthExtent()));
            }
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RoadRangeChoice: " + getType() + "!");
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
                throw new zserio.runtime.ZserioError("Write: Wrong parameter shift for field RoadRangeChoice.validityRange: " +
                        getValidityRange().getShift() + " != " + (byte)(getShift()) + "!");
            }
            getValidityRange().write(out);
            break;
        case LENGTH:
            getLengthRange().write(out);
            break;
        case GEOMETRY:
            getGeometryRange().write(out);
            break;
        case GEOMETRY_OFFSET:
            // check parameters
            if (getGeometryOffsetRange().getShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter shift for field RoadRangeChoice.geometryOffsetRange: " +
                        getGeometryOffsetRange().getShift() + " != " + (byte)(getShift()) + "!");
            }
            getGeometryOffsetRange().write(out);
            break;
        case PERCENTAGE:
            getPercentageRange().write(out);
            break;
        case EXTENT:
            out.writeVarUInt32(getRoadLengthExtent());
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RoadRangeChoice: " + getType() + "!");
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
        case LENGTH:
            getLengthRange().write(zserioContext.getLengthRange(), out);
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
        case EXTENT:
            zserioContext.getRoadLengthExtent().write(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.IntArrayElement(getRoadLengthExtent()));
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice RoadRangeChoice: " + getType() + "!");
        }
    }

    public static final int CHOICE_validityRange = 0;
    public static final int CHOICE_lengthRange = 1;
    public static final int CHOICE_geometryRange = 2;
    public static final int CHOICE_geometryOffsetRange = 3;
    public static final int CHOICE_percentageRange = 4;
    public static final int CHOICE_roadLengthExtent = 5;
    public static final int UNDEFINED_CHOICE = -1;

    private final nds.road.reference.types.RoadValidityType type_;
    private final byte shift_;
    private java.lang.Object objectChoice;
}
