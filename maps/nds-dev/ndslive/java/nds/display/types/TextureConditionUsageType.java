/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.types;

public class TextureConditionUsageType implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioBitmask
{
    public TextureConditionUsageType()
    {
        this((long)0);
    }

    public TextureConditionUsageType(long value)
    {
        if (value < 0L || value > 144115188075855871L)
        {
            throw new java.lang.IllegalArgumentException(
                    "Value for bitmask 'TextureConditionUsageType' out of bounds: " + value + "!");
        }
        this.value = value;
    }

    public TextureConditionUsageType(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        value = in.readVarUInt64();
    }

    public TextureConditionUsageType(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        value = ((zserio.runtime.array.ArrayElement.LongArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.VarUInt64ArrayTraits(), in)).get();
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        deltaContext.init(
                new zserio.runtime.array.ArrayTraits.VarUInt64ArrayTraits(),
                new zserio.runtime.array.ArrayElement.LongArrayElement(value));
    }

    @Override
    public int bitSizeOf()
    {
        return bitSizeOf(0);
    }

    @Override
    public int bitSizeOf(long bitPosition)
    {
        return zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt64(value);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return deltaContext.bitSizeOf(
                new zserio.runtime.array.ArrayTraits.VarUInt64ArrayTraits(),
                new zserio.runtime.array.ArrayElement.LongArrayElement(value));
    }

    @Override
    public long initializeOffsets()
    {
        return initializeOffsets(0);
    }

    @Override
    public long initializeOffsets(long bitPosition)
    {
        return bitPosition + bitSizeOf(bitPosition);
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        return bitPosition + bitSizeOf(context, bitPosition);
    }

    @Override
    public boolean equals(java.lang.Object other)
    {
        if (!(other instanceof TextureConditionUsageType))
            return false;

        final TextureConditionUsageType otherTextureConditionUsageType = (TextureConditionUsageType)other;
        return value == otherTextureConditionUsageType.value;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, value);
        return result;
    }

    @Override
    public java.lang.String toString()
    {
        final java.lang.StringBuilder builder = new java.lang.StringBuilder();

        if (this.and(TextureConditionUsageType.Values.TIME_DAY).equals(TextureConditionUsageType.Values.TIME_DAY))
            builder.append(builder.length() == 0 ? "TIME_DAY" : " | TIME_DAY");
        if (this.and(TextureConditionUsageType.Values.TIME_NIGHT).equals(TextureConditionUsageType.Values.TIME_NIGHT))
            builder.append(builder.length() == 0 ? "TIME_NIGHT" : " | TIME_NIGHT");
        if (this.and(TextureConditionUsageType.Values.WEATHER_RAINY).equals(TextureConditionUsageType.Values.WEATHER_RAINY))
            builder.append(builder.length() == 0 ? "WEATHER_RAINY" : " | WEATHER_RAINY");
        if (this.and(TextureConditionUsageType.Values.WEATHER_CLOUDY).equals(TextureConditionUsageType.Values.WEATHER_CLOUDY))
            builder.append(builder.length() == 0 ? "WEATHER_CLOUDY" : " | WEATHER_CLOUDY");
        if (this.and(TextureConditionUsageType.Values.WEATHER_SUNNY).equals(TextureConditionUsageType.Values.WEATHER_SUNNY))
            builder.append(builder.length() == 0 ? "WEATHER_SUNNY" : " | WEATHER_SUNNY");
        if (this.and(TextureConditionUsageType.Values.WEATHER_SNOWY).equals(TextureConditionUsageType.Values.WEATHER_SNOWY))
            builder.append(builder.length() == 0 ? "WEATHER_SNOWY" : " | WEATHER_SNOWY");
        if (this.and(TextureConditionUsageType.Values.SEASONAL_WINTER).equals(TextureConditionUsageType.Values.SEASONAL_WINTER))
            builder.append(builder.length() == 0 ? "SEASONAL_WINTER" : " | SEASONAL_WINTER");
        if (this.and(TextureConditionUsageType.Values.SEASONAL_SPRING).equals(TextureConditionUsageType.Values.SEASONAL_SPRING))
            builder.append(builder.length() == 0 ? "SEASONAL_SPRING" : " | SEASONAL_SPRING");
        if (this.and(TextureConditionUsageType.Values.SEASONAL_SUMMER).equals(TextureConditionUsageType.Values.SEASONAL_SUMMER))
            builder.append(builder.length() == 0 ? "SEASONAL_SUMMER" : " | SEASONAL_SUMMER");
        if (this.and(TextureConditionUsageType.Values.SEASONAL_FALL).equals(TextureConditionUsageType.Values.SEASONAL_FALL))
            builder.append(builder.length() == 0 ? "SEASONAL_FALL" : " | SEASONAL_FALL");

        return java.lang.String.valueOf(value) + "[" + builder.toString() + "]";
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarUInt64(value);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        deltaContext.write(
                new zserio.runtime.array.ArrayTraits.VarUInt64ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.LongArrayElement(value));
    }

    public long getValue()
    {
        return value;
    }

    @Override
    public java.lang.Number getGenericValue()
    {
        return value;
    }

    public TextureConditionUsageType or(TextureConditionUsageType other)
    {
        return new TextureConditionUsageType((long)(value | other.value));
    }

    public TextureConditionUsageType and(TextureConditionUsageType other)
    {
        return new TextureConditionUsageType((long)(value & other.value));
    }

    public TextureConditionUsageType xor(TextureConditionUsageType other)
    {
        return new TextureConditionUsageType((long)(value ^ other.value));
    }

    public TextureConditionUsageType not()
    {
        return new TextureConditionUsageType((long)(~value & 144115188075855871L));
    }

    public static final class Values
    {
        public static final TextureConditionUsageType TIME_DAY = new TextureConditionUsageType(1L);
        public static final TextureConditionUsageType TIME_NIGHT = new TextureConditionUsageType(2L);
        public static final TextureConditionUsageType WEATHER_RAINY = new TextureConditionUsageType(4L);
        public static final TextureConditionUsageType WEATHER_CLOUDY = new TextureConditionUsageType(8L);
        public static final TextureConditionUsageType WEATHER_SUNNY = new TextureConditionUsageType(16L);
        public static final TextureConditionUsageType WEATHER_SNOWY = new TextureConditionUsageType(32L);
        public static final TextureConditionUsageType SEASONAL_WINTER = new TextureConditionUsageType(64L);
        public static final TextureConditionUsageType SEASONAL_SPRING = new TextureConditionUsageType(128L);
        public static final TextureConditionUsageType SEASONAL_SUMMER = new TextureConditionUsageType(256L);
        public static final TextureConditionUsageType SEASONAL_FALL = new TextureConditionUsageType(512L);
    }

    private long value;
}