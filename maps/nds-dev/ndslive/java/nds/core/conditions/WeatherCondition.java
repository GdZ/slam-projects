/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.conditions;

public class WeatherCondition implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            weather_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getWeather()
        {
            return weather_;
        }

        private zserio.runtime.array.DeltaContext weather_;
    };

    public WeatherCondition()
    {
    }

    public WeatherCondition(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public WeatherCondition(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public WeatherCondition(
            nds.core.conditions.Weather weather_,
            boolean isInclusive_)
    {
        setWeather(weather_);
        setIsInclusive(isInclusive_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        weather_.initPackingContext(zserioContext.getWeather());
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

        endBitPosition += weather_.bitSizeOf(endBitPosition);
        endBitPosition += 1;

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += weather_.bitSizeOf(zserioContext.getWeather(), endBitPosition);
        endBitPosition += 1;

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.conditions.Weather getWeather()
    {
        return weather_;
    }

    public void setWeather(nds.core.conditions.Weather weather_)
    {
        this.weather_ = weather_;
    }

    public boolean getIsInclusive()
    {
        return isInclusive_;
    }

    public void setIsInclusive(boolean isInclusive_)
    {
        this.isInclusive_ = isInclusive_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof WeatherCondition)
        {
            final WeatherCondition that = (WeatherCondition)obj;

            return
                    ((weather_ == null) ? that.weather_ == null : weather_.getValue() == that.weather_.getValue()) &&
                    isInclusive_ == that.isInclusive_;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, weather_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, isInclusive_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        weather_ = nds.core.conditions.Weather.readEnum(in);

        isInclusive_ = in.readBool();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        weather_ = nds.core.conditions.Weather.readEnum(zserioContext.getWeather(), in);

        isInclusive_ = in.readBool();
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

        endBitPosition += weather_.bitSizeOf(endBitPosition);
        endBitPosition += 1;

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = weather_.initializeOffsets(zserioContext.getWeather(), endBitPosition);
        endBitPosition += 1;

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        weather_.write(out);

        out.writeBool(isInclusive_);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        weather_.write(zserioContext.getWeather(), out);

        out.writeBool(isInclusive_);
    }

    private nds.core.conditions.Weather weather_;
    private boolean isInclusive_;
}