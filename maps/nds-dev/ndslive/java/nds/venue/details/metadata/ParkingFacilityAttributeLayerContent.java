/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.venue.details.metadata;

public class ParkingFacilityAttributeLayerContent implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioBitmask
{
    public ParkingFacilityAttributeLayerContent()
    {
        this((int)0);
    }

    public ParkingFacilityAttributeLayerContent(int value)
    {
        if (value < 0 || value > 536870911)
        {
            throw new java.lang.IllegalArgumentException(
                    "Value for bitmask 'ParkingFacilityAttributeLayerContent' out of bounds: " + value + "!");
        }
        this.value = value;
    }

    public ParkingFacilityAttributeLayerContent(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        value = in.readVarUInt32();
    }

    public ParkingFacilityAttributeLayerContent(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        value = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), in)).get();
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        deltaContext.init(
                new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(value));
    }

    @Override
    public int bitSizeOf()
    {
        return bitSizeOf(0);
    }

    @Override
    public int bitSizeOf(long bitPosition)
    {
        return zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(value);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return deltaContext.bitSizeOf(
                new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(value));
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
        if (!(other instanceof ParkingFacilityAttributeLayerContent))
            return false;

        final ParkingFacilityAttributeLayerContent otherParkingFacilityAttributeLayerContent = (ParkingFacilityAttributeLayerContent)other;
        return value == otherParkingFacilityAttributeLayerContent.value;
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

        if (this.and(ParkingFacilityAttributeLayerContent.Values.PARKING_FACILITY_MAPS).equals(ParkingFacilityAttributeLayerContent.Values.PARKING_FACILITY_MAPS))
            builder.append(builder.length() == 0 ? "PARKING_FACILITY_MAPS" : " | PARKING_FACILITY_MAPS");
        if (this.and(ParkingFacilityAttributeLayerContent.Values.PARKING_FACILITY_SETS).equals(ParkingFacilityAttributeLayerContent.Values.PARKING_FACILITY_SETS))
            builder.append(builder.length() == 0 ? "PARKING_FACILITY_SETS" : " | PARKING_FACILITY_SETS");
        if (this.and(ParkingFacilityAttributeLayerContent.Values.PARKING_LEVEL_MAPS).equals(ParkingFacilityAttributeLayerContent.Values.PARKING_LEVEL_MAPS))
            builder.append(builder.length() == 0 ? "PARKING_LEVEL_MAPS" : " | PARKING_LEVEL_MAPS");
        if (this.and(ParkingFacilityAttributeLayerContent.Values.PARKING_LEVEL_SETS).equals(ParkingFacilityAttributeLayerContent.Values.PARKING_LEVEL_SETS))
            builder.append(builder.length() == 0 ? "PARKING_LEVEL_SETS" : " | PARKING_LEVEL_SETS");
        if (this.and(ParkingFacilityAttributeLayerContent.Values.PARKING_SECTION_MAPS).equals(ParkingFacilityAttributeLayerContent.Values.PARKING_SECTION_MAPS))
            builder.append(builder.length() == 0 ? "PARKING_SECTION_MAPS" : " | PARKING_SECTION_MAPS");
        if (this.and(ParkingFacilityAttributeLayerContent.Values.PARKING_SECTION_SETS).equals(ParkingFacilityAttributeLayerContent.Values.PARKING_SECTION_SETS))
            builder.append(builder.length() == 0 ? "PARKING_SECTION_SETS" : " | PARKING_SECTION_SETS");
        if (this.and(ParkingFacilityAttributeLayerContent.Values.PARKING_ROW_MAPS).equals(ParkingFacilityAttributeLayerContent.Values.PARKING_ROW_MAPS))
            builder.append(builder.length() == 0 ? "PARKING_ROW_MAPS" : " | PARKING_ROW_MAPS");
        if (this.and(ParkingFacilityAttributeLayerContent.Values.PARKING_ROW_SETS).equals(ParkingFacilityAttributeLayerContent.Values.PARKING_ROW_SETS))
            builder.append(builder.length() == 0 ? "PARKING_ROW_SETS" : " | PARKING_ROW_SETS");
        if (this.and(ParkingFacilityAttributeLayerContent.Values.PARKING_SPOT_MAPS).equals(ParkingFacilityAttributeLayerContent.Values.PARKING_SPOT_MAPS))
            builder.append(builder.length() == 0 ? "PARKING_SPOT_MAPS" : " | PARKING_SPOT_MAPS");
        if (this.and(ParkingFacilityAttributeLayerContent.Values.PARKING_SPOT_SETS).equals(ParkingFacilityAttributeLayerContent.Values.PARKING_SPOT_SETS))
            builder.append(builder.length() == 0 ? "PARKING_SPOT_SETS" : " | PARKING_SPOT_SETS");

        return java.lang.String.valueOf(value) + "[" + builder.toString() + "]";
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarUInt32(value);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        deltaContext.write(
                new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(value));
    }

    public int getValue()
    {
        return value;
    }

    @Override
    public java.lang.Number getGenericValue()
    {
        return value;
    }

    public ParkingFacilityAttributeLayerContent or(ParkingFacilityAttributeLayerContent other)
    {
        return new ParkingFacilityAttributeLayerContent((int)(value | other.value));
    }

    public ParkingFacilityAttributeLayerContent and(ParkingFacilityAttributeLayerContent other)
    {
        return new ParkingFacilityAttributeLayerContent((int)(value & other.value));
    }

    public ParkingFacilityAttributeLayerContent xor(ParkingFacilityAttributeLayerContent other)
    {
        return new ParkingFacilityAttributeLayerContent((int)(value ^ other.value));
    }

    public ParkingFacilityAttributeLayerContent not()
    {
        return new ParkingFacilityAttributeLayerContent((int)(~value & 536870911));
    }

    public static final class Values
    {
        public static final ParkingFacilityAttributeLayerContent PARKING_FACILITY_MAPS = new ParkingFacilityAttributeLayerContent(1);
        public static final ParkingFacilityAttributeLayerContent PARKING_FACILITY_SETS = new ParkingFacilityAttributeLayerContent(2);
        public static final ParkingFacilityAttributeLayerContent PARKING_LEVEL_MAPS = new ParkingFacilityAttributeLayerContent(4);
        public static final ParkingFacilityAttributeLayerContent PARKING_LEVEL_SETS = new ParkingFacilityAttributeLayerContent(8);
        public static final ParkingFacilityAttributeLayerContent PARKING_SECTION_MAPS = new ParkingFacilityAttributeLayerContent(16);
        public static final ParkingFacilityAttributeLayerContent PARKING_SECTION_SETS = new ParkingFacilityAttributeLayerContent(32);
        public static final ParkingFacilityAttributeLayerContent PARKING_ROW_MAPS = new ParkingFacilityAttributeLayerContent(64);
        public static final ParkingFacilityAttributeLayerContent PARKING_ROW_SETS = new ParkingFacilityAttributeLayerContent(128);
        public static final ParkingFacilityAttributeLayerContent PARKING_SPOT_MAPS = new ParkingFacilityAttributeLayerContent(256);
        public static final ParkingFacilityAttributeLayerContent PARKING_SPOT_SETS = new ParkingFacilityAttributeLayerContent(512);
    }

    private int value;
}
