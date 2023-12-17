/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.color;

public class ColorRgba implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            red_ = new zserio.runtime.array.DeltaContext();
            green_ = new zserio.runtime.array.DeltaContext();
            blue_ = new zserio.runtime.array.DeltaContext();
            alpha_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getRed()
        {
            return red_;
        }

        public zserio.runtime.array.DeltaContext getGreen()
        {
            return green_;
        }

        public zserio.runtime.array.DeltaContext getBlue()
        {
            return blue_;
        }

        public zserio.runtime.array.DeltaContext getAlpha()
        {
            return alpha_;
        }

        private zserio.runtime.array.DeltaContext red_;
        private zserio.runtime.array.DeltaContext green_;
        private zserio.runtime.array.DeltaContext blue_;
        private zserio.runtime.array.DeltaContext alpha_;
    };

    public ColorRgba()
    {
    }

    public ColorRgba(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public ColorRgba(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public ColorRgba(
            short red_,
            short green_,
            short blue_,
            short alpha_)
    {
        setRed(red_);
        setGreen(green_);
        setBlue(blue_);
        setAlpha(alpha_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getRed().init(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(red_));
        zserioContext.getGreen().init(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(green_));
        zserioContext.getBlue().init(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(blue_));
        zserioContext.getAlpha().init(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(alpha_));
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

        endBitPosition += 8;
        endBitPosition += 8;
        endBitPosition += 8;
        endBitPosition += 8;

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getRed().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(red_));
        endBitPosition += zserioContext.getGreen().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(green_));
        endBitPosition += zserioContext.getBlue().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(blue_));
        endBitPosition += zserioContext.getAlpha().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(alpha_));

        return (int)(endBitPosition - bitPosition);
    }

    public short getRed()
    {
        return red_;
    }

    public void setRed(short red_)
    {
        this.red_ = red_;
    }

    public short getGreen()
    {
        return green_;
    }

    public void setGreen(short green_)
    {
        this.green_ = green_;
    }

    public short getBlue()
    {
        return blue_;
    }

    public void setBlue(short blue_)
    {
        this.blue_ = blue_;
    }

    public short getAlpha()
    {
        return alpha_;
    }

    public void setAlpha(short alpha_)
    {
        this.alpha_ = alpha_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof ColorRgba)
        {
            final ColorRgba that = (ColorRgba)obj;

            return
                    red_ == that.red_ &&
                    green_ == that.green_ &&
                    blue_ == that.blue_ &&
                    alpha_ == that.alpha_;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, red_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, green_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, blue_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, alpha_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        red_ = in.readUnsignedByte();

        green_ = in.readUnsignedByte();

        blue_ = in.readUnsignedByte();

        alpha_ = in.readUnsignedByte();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        red_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                zserioContext.getRed().read(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), in)).get();

        green_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                zserioContext.getGreen().read(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), in)).get();

        blue_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                zserioContext.getBlue().read(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), in)).get();

        alpha_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                zserioContext.getAlpha().read(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), in)).get();
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

        endBitPosition += 8;
        endBitPosition += 8;
        endBitPosition += 8;
        endBitPosition += 8;

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getRed().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(red_));
        endBitPosition += zserioContext.getGreen().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(green_));
        endBitPosition += zserioContext.getBlue().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(blue_));
        endBitPosition += zserioContext.getAlpha().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(alpha_));

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeUnsignedByte(red_);

        out.writeUnsignedByte(green_);

        out.writeUnsignedByte(blue_);

        out.writeUnsignedByte(alpha_);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getRed().write(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(red_));

        zserioContext.getGreen().write(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(green_));

        zserioContext.getBlue().write(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(blue_));

        zserioContext.getAlpha().write(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(alpha_));
    }

    private short red_;
    private short green_;
    private short blue_;
    private short alpha_;
}
