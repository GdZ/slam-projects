/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.rules.types;

public class TrafficLightTargetGroup implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioBitmask
{
    public TrafficLightTargetGroup()
    {
        this((short)0);
    }

    public TrafficLightTargetGroup(short value)
    {
        if (value < (short)0)
        {
            throw new java.lang.IllegalArgumentException(
                    "Value for bitmask 'TrafficLightTargetGroup' out of bounds: " + value + "!");
        }
        this.value = value;
    }

    public TrafficLightTargetGroup(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        value = in.readVarUInt16();
    }

    public TrafficLightTargetGroup(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        value = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), in)).get();
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        deltaContext.init(
                new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(value));
    }

    @Override
    public int bitSizeOf()
    {
        return bitSizeOf(0);
    }

    @Override
    public int bitSizeOf(long bitPosition)
    {
        return zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(value);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return deltaContext.bitSizeOf(
                new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(value));
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
        if (!(other instanceof TrafficLightTargetGroup))
            return false;

        final TrafficLightTargetGroup otherTrafficLightTargetGroup = (TrafficLightTargetGroup)other;
        return value == otherTrafficLightTargetGroup.value;
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

        if (this.and(TrafficLightTargetGroup.Values.VEHICLE).equals(TrafficLightTargetGroup.Values.VEHICLE))
            builder.append(builder.length() == 0 ? "VEHICLE" : " | VEHICLE");
        if (this.and(TrafficLightTargetGroup.Values.PEDESTRIAN).equals(TrafficLightTargetGroup.Values.PEDESTRIAN))
            builder.append(builder.length() == 0 ? "PEDESTRIAN" : " | PEDESTRIAN");
        if (this.and(TrafficLightTargetGroup.Values.BICYCLE).equals(TrafficLightTargetGroup.Values.BICYCLE))
            builder.append(builder.length() == 0 ? "BICYCLE" : " | BICYCLE");
        if (this.and(TrafficLightTargetGroup.Values.PUBLIC_TRANSPORT).equals(TrafficLightTargetGroup.Values.PUBLIC_TRANSPORT))
            builder.append(builder.length() == 0 ? "PUBLIC_TRANSPORT" : " | PUBLIC_TRANSPORT");
        if (this.and(TrafficLightTargetGroup.Values.RAILWAY).equals(TrafficLightTargetGroup.Values.RAILWAY))
            builder.append(builder.length() == 0 ? "RAILWAY" : " | RAILWAY");

        return java.lang.String.valueOf(value) + "[" + builder.toString() + "]";
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarUInt16(value);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        deltaContext.write(
                new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(value));
    }

    public short getValue()
    {
        return value;
    }

    @Override
    public java.lang.Number getGenericValue()
    {
        return value;
    }

    public TrafficLightTargetGroup or(TrafficLightTargetGroup other)
    {
        return new TrafficLightTargetGroup((short)(value | other.value));
    }

    public TrafficLightTargetGroup and(TrafficLightTargetGroup other)
    {
        return new TrafficLightTargetGroup((short)(value & other.value));
    }

    public TrafficLightTargetGroup xor(TrafficLightTargetGroup other)
    {
        return new TrafficLightTargetGroup((short)(value ^ other.value));
    }

    public TrafficLightTargetGroup not()
    {
        return new TrafficLightTargetGroup((short)(~value & (short)32767));
    }

    public static final class Values
    {
        public static final TrafficLightTargetGroup VEHICLE = new TrafficLightTargetGroup((short)1);
        public static final TrafficLightTargetGroup PEDESTRIAN = new TrafficLightTargetGroup((short)2);
        public static final TrafficLightTargetGroup BICYCLE = new TrafficLightTargetGroup((short)4);
        public static final TrafficLightTargetGroup PUBLIC_TRANSPORT = new TrafficLightTargetGroup((short)8);
        public static final TrafficLightTargetGroup RAILWAY = new TrafficLightTargetGroup((short)16);
    }

    private short value;
}
