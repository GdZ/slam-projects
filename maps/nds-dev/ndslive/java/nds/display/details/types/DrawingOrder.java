/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.details.types;

public class DrawingOrder implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            primaryDrawingOrder_ = new zserio.runtime.array.DeltaContext();
            secondaryDrawingOrder_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getPrimaryDrawingOrder()
        {
            return primaryDrawingOrder_;
        }

        public zserio.runtime.array.DeltaContext getSecondaryDrawingOrder()
        {
            return secondaryDrawingOrder_;
        }

        private zserio.runtime.array.DeltaContext primaryDrawingOrder_;
        private zserio.runtime.array.DeltaContext secondaryDrawingOrder_;
    };

    public DrawingOrder()
    {
    }

    public DrawingOrder(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public DrawingOrder(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public DrawingOrder(
            short primaryDrawingOrder_,
            short secondaryDrawingOrder_)
    {
        setPrimaryDrawingOrder(primaryDrawingOrder_);
        setSecondaryDrawingOrder(secondaryDrawingOrder_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getPrimaryDrawingOrder().init(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(primaryDrawingOrder_));
        zserioContext.getSecondaryDrawingOrder().init(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(secondaryDrawingOrder_));
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(primaryDrawingOrder_);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(secondaryDrawingOrder_);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getPrimaryDrawingOrder().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(primaryDrawingOrder_));
        endBitPosition += zserioContext.getSecondaryDrawingOrder().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(secondaryDrawingOrder_));

        return (int)(endBitPosition - bitPosition);
    }

    public short getPrimaryDrawingOrder()
    {
        return primaryDrawingOrder_;
    }

    public void setPrimaryDrawingOrder(short primaryDrawingOrder_)
    {
        this.primaryDrawingOrder_ = primaryDrawingOrder_;
    }

    public short getSecondaryDrawingOrder()
    {
        return secondaryDrawingOrder_;
    }

    public void setSecondaryDrawingOrder(short secondaryDrawingOrder_)
    {
        this.secondaryDrawingOrder_ = secondaryDrawingOrder_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof DrawingOrder)
        {
            final DrawingOrder that = (DrawingOrder)obj;

            return
                    primaryDrawingOrder_ == that.primaryDrawingOrder_ &&
                    secondaryDrawingOrder_ == that.secondaryDrawingOrder_;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, primaryDrawingOrder_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, secondaryDrawingOrder_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        primaryDrawingOrder_ = in.readVarUInt16();

        secondaryDrawingOrder_ = in.readVarUInt16();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        primaryDrawingOrder_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                zserioContext.getPrimaryDrawingOrder().read(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), in)).get();

        secondaryDrawingOrder_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                zserioContext.getSecondaryDrawingOrder().read(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), in)).get();
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(primaryDrawingOrder_);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(secondaryDrawingOrder_);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getPrimaryDrawingOrder().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(primaryDrawingOrder_));
        endBitPosition += zserioContext.getSecondaryDrawingOrder().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(secondaryDrawingOrder_));

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarUInt16(primaryDrawingOrder_);

        out.writeVarUInt16(secondaryDrawingOrder_);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getPrimaryDrawingOrder().write(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(primaryDrawingOrder_));

        zserioContext.getSecondaryDrawingOrder().write(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(secondaryDrawingOrder_));
    }

    private short primaryDrawingOrder_;
    private short secondaryDrawingOrder_;
}
