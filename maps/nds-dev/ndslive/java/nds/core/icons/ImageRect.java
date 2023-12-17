/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.icons;

public class ImageRect implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            xTopLeftPos_ = new zserio.runtime.array.DeltaContext();
            yTopLeftPos_ = new zserio.runtime.array.DeltaContext();
            pixWidth_ = new zserio.runtime.array.DeltaContext();
            pixHeight_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getXTopLeftPos()
        {
            return xTopLeftPos_;
        }

        public zserio.runtime.array.DeltaContext getYTopLeftPos()
        {
            return yTopLeftPos_;
        }

        public zserio.runtime.array.DeltaContext getPixWidth()
        {
            return pixWidth_;
        }

        public zserio.runtime.array.DeltaContext getPixHeight()
        {
            return pixHeight_;
        }

        private zserio.runtime.array.DeltaContext xTopLeftPos_;
        private zserio.runtime.array.DeltaContext yTopLeftPos_;
        private zserio.runtime.array.DeltaContext pixWidth_;
        private zserio.runtime.array.DeltaContext pixHeight_;
    };

    public ImageRect()
    {
    }

    public ImageRect(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public ImageRect(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public ImageRect(
            int xTopLeftPos_,
            int yTopLeftPos_,
            int pixWidth_,
            int pixHeight_)
    {
        setXTopLeftPos(xTopLeftPos_);
        setYTopLeftPos(yTopLeftPos_);
        setPixWidth(pixWidth_);
        setPixHeight(pixHeight_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getXTopLeftPos().init(new zserio.runtime.array.ArrayTraits.VarInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(xTopLeftPos_));
        zserioContext.getYTopLeftPos().init(new zserio.runtime.array.ArrayTraits.VarInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(yTopLeftPos_));
        zserioContext.getPixWidth().init(new zserio.runtime.array.ArrayTraits.VarInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(pixWidth_));
        zserioContext.getPixHeight().init(new zserio.runtime.array.ArrayTraits.VarInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(pixHeight_));
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarInt32(xTopLeftPos_);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarInt32(yTopLeftPos_);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarInt32(pixWidth_);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarInt32(pixHeight_);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getXTopLeftPos().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(xTopLeftPos_));
        endBitPosition += zserioContext.getYTopLeftPos().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(yTopLeftPos_));
        endBitPosition += zserioContext.getPixWidth().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(pixWidth_));
        endBitPosition += zserioContext.getPixHeight().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(pixHeight_));

        return (int)(endBitPosition - bitPosition);
    }

    public int getXTopLeftPos()
    {
        return xTopLeftPos_;
    }

    public void setXTopLeftPos(int xTopLeftPos_)
    {
        this.xTopLeftPos_ = xTopLeftPos_;
    }

    public int getYTopLeftPos()
    {
        return yTopLeftPos_;
    }

    public void setYTopLeftPos(int yTopLeftPos_)
    {
        this.yTopLeftPos_ = yTopLeftPos_;
    }

    public int getPixWidth()
    {
        return pixWidth_;
    }

    public void setPixWidth(int pixWidth_)
    {
        this.pixWidth_ = pixWidth_;
    }

    public int getPixHeight()
    {
        return pixHeight_;
    }

    public void setPixHeight(int pixHeight_)
    {
        this.pixHeight_ = pixHeight_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof ImageRect)
        {
            final ImageRect that = (ImageRect)obj;

            return
                    xTopLeftPos_ == that.xTopLeftPos_ &&
                    yTopLeftPos_ == that.yTopLeftPos_ &&
                    pixWidth_ == that.pixWidth_ &&
                    pixHeight_ == that.pixHeight_;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, xTopLeftPos_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, yTopLeftPos_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, pixWidth_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, pixHeight_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        xTopLeftPos_ = in.readVarInt32();

        yTopLeftPos_ = in.readVarInt32();

        pixWidth_ = in.readVarInt32();

        pixHeight_ = in.readVarInt32();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        xTopLeftPos_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getXTopLeftPos().read(new zserio.runtime.array.ArrayTraits.VarInt32ArrayTraits(), in)).get();

        yTopLeftPos_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getYTopLeftPos().read(new zserio.runtime.array.ArrayTraits.VarInt32ArrayTraits(), in)).get();

        pixWidth_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getPixWidth().read(new zserio.runtime.array.ArrayTraits.VarInt32ArrayTraits(), in)).get();

        pixHeight_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getPixHeight().read(new zserio.runtime.array.ArrayTraits.VarInt32ArrayTraits(), in)).get();
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarInt32(xTopLeftPos_);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarInt32(yTopLeftPos_);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarInt32(pixWidth_);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarInt32(pixHeight_);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getXTopLeftPos().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(xTopLeftPos_));
        endBitPosition += zserioContext.getYTopLeftPos().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(yTopLeftPos_));
        endBitPosition += zserioContext.getPixWidth().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(pixWidth_));
        endBitPosition += zserioContext.getPixHeight().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(pixHeight_));

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarInt32(xTopLeftPos_);

        out.writeVarInt32(yTopLeftPos_);

        out.writeVarInt32(pixWidth_);

        out.writeVarInt32(pixHeight_);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getXTopLeftPos().write(new zserio.runtime.array.ArrayTraits.VarInt32ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(xTopLeftPos_));

        zserioContext.getYTopLeftPos().write(new zserio.runtime.array.ArrayTraits.VarInt32ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(yTopLeftPos_));

        zserioContext.getPixWidth().write(new zserio.runtime.array.ArrayTraits.VarInt32ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(pixWidth_));

        zserioContext.getPixHeight().write(new zserio.runtime.array.ArrayTraits.VarInt32ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(pixHeight_));
    }

    private int xTopLeftPos_;
    private int yTopLeftPos_;
    private int pixWidth_;
    private int pixHeight_;
}
