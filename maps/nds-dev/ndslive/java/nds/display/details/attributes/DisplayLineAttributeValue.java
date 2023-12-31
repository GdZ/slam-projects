/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.details.attributes;

public class DisplayLineAttributeValue implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            drawingOrder_ = new nds.display.details.types.DrawingOrder.ZserioPackingContext();
            zLevel_ = new zserio.runtime.array.DeltaContext();
            elevationDelta_ = new zserio.runtime.array.DeltaContext();
            elevationLevel_ = new zserio.runtime.array.DeltaContext();
        }

        public nds.display.details.types.DrawingOrder.ZserioPackingContext getDrawingOrder()
        {
            return drawingOrder_;
        }

        public zserio.runtime.array.DeltaContext getZLevel()
        {
            return zLevel_;
        }

        public zserio.runtime.array.DeltaContext getElevationDelta()
        {
            return elevationDelta_;
        }

        public zserio.runtime.array.DeltaContext getElevationLevel()
        {
            return elevationLevel_;
        }

        private nds.display.details.types.DrawingOrder.ZserioPackingContext drawingOrder_;
        private zserio.runtime.array.DeltaContext zLevel_;
        private zserio.runtime.array.DeltaContext elevationDelta_;
        private zserio.runtime.array.DeltaContext elevationLevel_;
    };

    public DisplayLineAttributeValue(
            nds.display.details.attributes.DisplayLineAttributeType type_)
    {
        this.type_ = type_;
    }

    public DisplayLineAttributeValue(zserio.runtime.io.BitStreamReader in,
            nds.display.details.attributes.DisplayLineAttributeType type_)
            throws java.io.IOException
    {
        this.type_ = type_;

        read(in);
    }

    public DisplayLineAttributeValue(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            nds.display.details.attributes.DisplayLineAttributeType type_)
            throws java.io.IOException
    {
        this.type_ = type_;

        read(context, in);
    }

    public int choiceTag()
    {
        switch (getType())
        {
        case DRAWING_ORDER:
            return CHOICE_drawingOrder;
        case Z_LEVEL:
            return CHOICE_zLevel;
        case DETACHED_FROM_TERRAIN:
            return CHOICE_detachedFromTerrain;
        case ELEVATION_DELTA:
            return CHOICE_elevationDelta;
        case ELEVATION_LEVEL:
            return CHOICE_elevationLevel;
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
        case DRAWING_ORDER:
            getDrawingOrder().initPackingContext(zserioContext.getDrawingOrder());
            break;
        case Z_LEVEL:
            zserioContext.getZLevel().init(new zserio.runtime.array.ArrayTraits.SignedBitFieldByteArrayTraits((int)(8)),
                    new zserio.runtime.array.ArrayElement.ByteArrayElement(getZLevel()));
            break;
        case DETACHED_FROM_TERRAIN:
            break;
        case ELEVATION_DELTA:
            zserioContext.getElevationDelta().init(new zserio.runtime.array.ArrayTraits.VarInt32ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(getElevationDelta()));
            break;
        case ELEVATION_LEVEL:
            zserioContext.getElevationLevel().init(new zserio.runtime.array.ArrayTraits.SignedBitFieldByteArrayTraits((int)(8)),
                    new zserio.runtime.array.ArrayElement.ByteArrayElement(getElevationLevel()));
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayLineAttributeValue: " + getType() + "!");
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
        case DRAWING_ORDER:
            endBitPosition += getDrawingOrder().bitSizeOf(endBitPosition);
            break;
        case Z_LEVEL:
            endBitPosition += 8;
            break;
        case DETACHED_FROM_TERRAIN:
            endBitPosition += getDetachedFromTerrain().bitSizeOf(endBitPosition);
            break;
        case ELEVATION_DELTA:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarInt32(getElevationDelta());
            break;
        case ELEVATION_LEVEL:
            endBitPosition += 8;
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayLineAttributeValue: " + getType() + "!");
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
        case DRAWING_ORDER:
            endBitPosition += getDrawingOrder().bitSizeOf(zserioContext.getDrawingOrder(), endBitPosition);
            break;
        case Z_LEVEL:
            endBitPosition += zserioContext.getZLevel().bitSizeOf(new zserio.runtime.array.ArrayTraits.SignedBitFieldByteArrayTraits((int)(8)),
                    new zserio.runtime.array.ArrayElement.ByteArrayElement(getZLevel()));
            break;
        case DETACHED_FROM_TERRAIN:
            endBitPosition += getDetachedFromTerrain().bitSizeOf(endBitPosition);
            break;
        case ELEVATION_DELTA:
            endBitPosition += zserioContext.getElevationDelta().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarInt32ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(getElevationDelta()));
            break;
        case ELEVATION_LEVEL:
            endBitPosition += zserioContext.getElevationLevel().bitSizeOf(new zserio.runtime.array.ArrayTraits.SignedBitFieldByteArrayTraits((int)(8)),
                    new zserio.runtime.array.ArrayElement.ByteArrayElement(getElevationLevel()));
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayLineAttributeValue: " + getType() + "!");
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.display.details.attributes.DisplayLineAttributeType getType()
    {
        return this.type_;
    }

    public nds.display.details.types.DrawingOrder getDrawingOrder()
    {
        return (nds.display.details.types.DrawingOrder)objectChoice;
    }

    public void setDrawingOrder(nds.display.details.types.DrawingOrder drawingOrder_)
    {
        objectChoice = drawingOrder_;
    }

    public byte getZLevel()
    {
        return (java.lang.Byte)objectChoice;
    }

    public void setZLevel(byte zLevel_)
    {
        objectChoice = zLevel_;
    }

    public nds.core.types.Flag getDetachedFromTerrain()
    {
        return (nds.core.types.Flag)objectChoice;
    }

    public void setDetachedFromTerrain(nds.core.types.Flag detachedFromTerrain_)
    {
        objectChoice = detachedFromTerrain_;
    }

    public int getElevationDelta()
    {
        return (java.lang.Integer)objectChoice;
    }

    public void setElevationDelta(int elevationDelta_)
    {
        objectChoice = elevationDelta_;
    }

    public byte getElevationLevel()
    {
        return (java.lang.Byte)objectChoice;
    }

    public void setElevationLevel(byte elevationLevel_)
    {
        objectChoice = elevationLevel_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof DisplayLineAttributeValue)
        {
            final DisplayLineAttributeValue that = (DisplayLineAttributeValue)obj;

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
            case DRAWING_ORDER:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (nds.display.details.types.DrawingOrder)objectChoice);
                break;
            case Z_LEVEL:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.Byte)objectChoice);
                break;
            case DETACHED_FROM_TERRAIN:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (nds.core.types.Flag)objectChoice);
                break;
            case ELEVATION_DELTA:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.Integer)objectChoice);
                break;
            case ELEVATION_LEVEL:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.Byte)objectChoice);
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
        case DRAWING_ORDER:
            objectChoice = new nds.display.details.types.DrawingOrder(in);
            break;
        case Z_LEVEL:
            objectChoice = in.readByte();
            break;
        case DETACHED_FROM_TERRAIN:
            objectChoice = new nds.core.types.Flag(in);
            break;
        case ELEVATION_DELTA:
            objectChoice = in.readVarInt32();
            break;
        case ELEVATION_LEVEL:
            objectChoice = in.readByte();
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayLineAttributeValue: " + getType() + "!");
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        switch (getType())
        {
        case DRAWING_ORDER:
            objectChoice = new nds.display.details.types.DrawingOrder(zserioContext.getDrawingOrder(), in);
            break;
        case Z_LEVEL:
            objectChoice = ((zserio.runtime.array.ArrayElement.ByteArrayElement)
                    zserioContext.getZLevel().read(new zserio.runtime.array.ArrayTraits.SignedBitFieldByteArrayTraits((int)(8)), in)).get();
            break;
        case DETACHED_FROM_TERRAIN:
            objectChoice = new nds.core.types.Flag(in);
            break;
        case ELEVATION_DELTA:
            objectChoice = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                    zserioContext.getElevationDelta().read(new zserio.runtime.array.ArrayTraits.VarInt32ArrayTraits(), in)).get();
            break;
        case ELEVATION_LEVEL:
            objectChoice = ((zserio.runtime.array.ArrayElement.ByteArrayElement)
                    zserioContext.getElevationLevel().read(new zserio.runtime.array.ArrayTraits.SignedBitFieldByteArrayTraits((int)(8)), in)).get();
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayLineAttributeValue: " + getType() + "!");
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
        case DRAWING_ORDER:
            {
                endBitPosition = getDrawingOrder().initializeOffsets(endBitPosition);
            }
            break;
        case Z_LEVEL:
            {
                endBitPosition += 8;
            }
            break;
        case DETACHED_FROM_TERRAIN:
            {
                endBitPosition = getDetachedFromTerrain().initializeOffsets(endBitPosition);
            }
            break;
        case ELEVATION_DELTA:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarInt32(getElevationDelta());
            }
            break;
        case ELEVATION_LEVEL:
            {
                endBitPosition += 8;
            }
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayLineAttributeValue: " + getType() + "!");
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
        case DRAWING_ORDER:
            {
                endBitPosition = getDrawingOrder().initializeOffsets(zserioContext.getDrawingOrder(), endBitPosition);
            }
            break;
        case Z_LEVEL:
            {
                endBitPosition += zserioContext.getZLevel().bitSizeOf(new zserio.runtime.array.ArrayTraits.SignedBitFieldByteArrayTraits((int)(8)),
                        new zserio.runtime.array.ArrayElement.ByteArrayElement(getZLevel()));
            }
            break;
        case DETACHED_FROM_TERRAIN:
            {
                endBitPosition = getDetachedFromTerrain().initializeOffsets(endBitPosition);
            }
            break;
        case ELEVATION_DELTA:
            {
                endBitPosition += zserioContext.getElevationDelta().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarInt32ArrayTraits(),
                        new zserio.runtime.array.ArrayElement.IntArrayElement(getElevationDelta()));
            }
            break;
        case ELEVATION_LEVEL:
            {
                endBitPosition += zserioContext.getElevationLevel().bitSizeOf(new zserio.runtime.array.ArrayTraits.SignedBitFieldByteArrayTraits((int)(8)),
                        new zserio.runtime.array.ArrayElement.ByteArrayElement(getElevationLevel()));
            }
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayLineAttributeValue: " + getType() + "!");
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        switch (getType())
        {
        case DRAWING_ORDER:
            getDrawingOrder().write(out);
            break;
        case Z_LEVEL:
            out.writeByte(getZLevel());
            break;
        case DETACHED_FROM_TERRAIN:
            getDetachedFromTerrain().write(out);
            break;
        case ELEVATION_DELTA:
            out.writeVarInt32(getElevationDelta());
            break;
        case ELEVATION_LEVEL:
            out.writeByte(getElevationLevel());
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayLineAttributeValue: " + getType() + "!");
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        switch (getType())
        {
        case DRAWING_ORDER:
            getDrawingOrder().write(zserioContext.getDrawingOrder(), out);
            break;
        case Z_LEVEL:
            zserioContext.getZLevel().write(new zserio.runtime.array.ArrayTraits.SignedBitFieldByteArrayTraits((int)(8)), out,
                    new zserio.runtime.array.ArrayElement.ByteArrayElement(getZLevel()));
            break;
        case DETACHED_FROM_TERRAIN:
            getDetachedFromTerrain().write(out);
            break;
        case ELEVATION_DELTA:
            zserioContext.getElevationDelta().write(new zserio.runtime.array.ArrayTraits.VarInt32ArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.IntArrayElement(getElevationDelta()));
            break;
        case ELEVATION_LEVEL:
            zserioContext.getElevationLevel().write(new zserio.runtime.array.ArrayTraits.SignedBitFieldByteArrayTraits((int)(8)), out,
                    new zserio.runtime.array.ArrayElement.ByteArrayElement(getElevationLevel()));
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice DisplayLineAttributeValue: " + getType() + "!");
        }
    }

    public static final int CHOICE_drawingOrder = 0;
    public static final int CHOICE_zLevel = 1;
    public static final int CHOICE_detachedFromTerrain = 2;
    public static final int CHOICE_elevationDelta = 3;
    public static final int CHOICE_elevationLevel = 4;
    public static final int UNDEFINED_CHOICE = -1;

    private final nds.display.details.attributes.DisplayLineAttributeType type_;
    private java.lang.Object objectChoice;
}
