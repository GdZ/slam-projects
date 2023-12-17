/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.conditions;

public enum Surface implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioEnum
{
    CLEAR((short)0),
    SNOW_COVERED((short)1),
    ICE((short)2),
    RAIN_COVERED((short)3),
    HAZARDOUS((short)4),
    FLOODING((short)5),
    AQUAPLANING((short)6),
    SURFACE_WATER_HAZARD((short)7),
    SLIPPERY_ROAD((short)8),
    MUD_ON_ROAD((short)9),
    LOOSE_CHIPPINGS((short)10),
    OIL_ON_ROAD((short)11),
    PETROL_ON_ROAD((short)12),
    BLACK_ICE((short)13),
    SNOW_DRIFTS((short)14),
    ICY_PATCHES((short)15),
    OBJECTS_ON_ROAD((short)16),
    SHED_LOADS((short)17),
    FALLEN_TREES((short)18),
    AVALANCHES((short)19),
    ROCKS((short)20),
    LANDSLIPS((short)21),
    ANIMALS_ON_ROAD((short)22),
    PEOPLE_ON_ROAD((short)23),
    CHILDREN_ON_ROAD((short)24),
    CYCLISTS_ON_ROAD((short)25),
    LARGE_ANIMALS_ON_ROAD((short)26),
    HERD_OF_ANIMALS_ON_ROAD((short)27),
    STONE_THROWING_PERSONS((short)28),
    BROKEN_DOWN_VEHICLES((short)29);

    private Surface(short value)
    {
        this.value = value;
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

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        deltaContext.init(
                new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits(8),
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
        return 8;
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return deltaContext.bitSizeOf(
                new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits(8),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(value));
    }

    @Override
    public long initializeOffsets()
    {
        return initializeOffsets(0);
    }

    @Override
    public long initializeOffsets(long bitPosition) throws zserio.runtime.ZserioError
    {
        return bitPosition + bitSizeOf(bitPosition);
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        return bitPosition + bitSizeOf(context, bitPosition);
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeUnsignedByte(getValue());
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        deltaContext.write(
                new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits(8), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(value));
    }

    public static Surface readEnum(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        return toEnum(in.readUnsignedByte());
    }

    public static Surface readEnum(zserio.runtime.array.PackingContext context,
            zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return toEnum(((zserio.runtime.array.ArrayElement.ShortArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits(8), in)).get());
    }

    public static Surface toEnum(short value)
    {
        switch (value)
        {
            case (short)0:
                return CLEAR;
            case (short)1:
                return SNOW_COVERED;
            case (short)2:
                return ICE;
            case (short)3:
                return RAIN_COVERED;
            case (short)4:
                return HAZARDOUS;
            case (short)5:
                return FLOODING;
            case (short)6:
                return AQUAPLANING;
            case (short)7:
                return SURFACE_WATER_HAZARD;
            case (short)8:
                return SLIPPERY_ROAD;
            case (short)9:
                return MUD_ON_ROAD;
            case (short)10:
                return LOOSE_CHIPPINGS;
            case (short)11:
                return OIL_ON_ROAD;
            case (short)12:
                return PETROL_ON_ROAD;
            case (short)13:
                return BLACK_ICE;
            case (short)14:
                return SNOW_DRIFTS;
            case (short)15:
                return ICY_PATCHES;
            case (short)16:
                return OBJECTS_ON_ROAD;
            case (short)17:
                return SHED_LOADS;
            case (short)18:
                return FALLEN_TREES;
            case (short)19:
                return AVALANCHES;
            case (short)20:
                return ROCKS;
            case (short)21:
                return LANDSLIPS;
            case (short)22:
                return ANIMALS_ON_ROAD;
            case (short)23:
                return PEOPLE_ON_ROAD;
            case (short)24:
                return CHILDREN_ON_ROAD;
            case (short)25:
                return CYCLISTS_ON_ROAD;
            case (short)26:
                return LARGE_ANIMALS_ON_ROAD;
            case (short)27:
                return HERD_OF_ANIMALS_ON_ROAD;
            case (short)28:
                return STONE_THROWING_PERSONS;
            case (short)29:
                return BROKEN_DOWN_VEHICLES;
            default:
                throw new java.lang.IllegalArgumentException(
                        "Unknown value for enumeration Surface: " + value + "!");
        }
    }

    public static Surface toEnum(java.lang.String itemName)
    {
        if (itemName.equals("CLEAR"))
            return CLEAR;
        if (itemName.equals("SNOW_COVERED"))
            return SNOW_COVERED;
        if (itemName.equals("ICE"))
            return ICE;
        if (itemName.equals("RAIN_COVERED"))
            return RAIN_COVERED;
        if (itemName.equals("HAZARDOUS"))
            return HAZARDOUS;
        if (itemName.equals("FLOODING"))
            return FLOODING;
        if (itemName.equals("AQUAPLANING"))
            return AQUAPLANING;
        if (itemName.equals("SURFACE_WATER_HAZARD"))
            return SURFACE_WATER_HAZARD;
        if (itemName.equals("SLIPPERY_ROAD"))
            return SLIPPERY_ROAD;
        if (itemName.equals("MUD_ON_ROAD"))
            return MUD_ON_ROAD;
        if (itemName.equals("LOOSE_CHIPPINGS"))
            return LOOSE_CHIPPINGS;
        if (itemName.equals("OIL_ON_ROAD"))
            return OIL_ON_ROAD;
        if (itemName.equals("PETROL_ON_ROAD"))
            return PETROL_ON_ROAD;
        if (itemName.equals("BLACK_ICE"))
            return BLACK_ICE;
        if (itemName.equals("SNOW_DRIFTS"))
            return SNOW_DRIFTS;
        if (itemName.equals("ICY_PATCHES"))
            return ICY_PATCHES;
        if (itemName.equals("OBJECTS_ON_ROAD"))
            return OBJECTS_ON_ROAD;
        if (itemName.equals("SHED_LOADS"))
            return SHED_LOADS;
        if (itemName.equals("FALLEN_TREES"))
            return FALLEN_TREES;
        if (itemName.equals("AVALANCHES"))
            return AVALANCHES;
        if (itemName.equals("ROCKS"))
            return ROCKS;
        if (itemName.equals("LANDSLIPS"))
            return LANDSLIPS;
        if (itemName.equals("ANIMALS_ON_ROAD"))
            return ANIMALS_ON_ROAD;
        if (itemName.equals("PEOPLE_ON_ROAD"))
            return PEOPLE_ON_ROAD;
        if (itemName.equals("CHILDREN_ON_ROAD"))
            return CHILDREN_ON_ROAD;
        if (itemName.equals("CYCLISTS_ON_ROAD"))
            return CYCLISTS_ON_ROAD;
        if (itemName.equals("LARGE_ANIMALS_ON_ROAD"))
            return LARGE_ANIMALS_ON_ROAD;
        if (itemName.equals("HERD_OF_ANIMALS_ON_ROAD"))
            return HERD_OF_ANIMALS_ON_ROAD;
        if (itemName.equals("STONE_THROWING_PERSONS"))
            return STONE_THROWING_PERSONS;
        if (itemName.equals("BROKEN_DOWN_VEHICLES"))
            return BROKEN_DOWN_VEHICLES;
        throw new java.lang.IllegalArgumentException(
                "Enum item '" + itemName + "' doesn't exist in enumeration Surface!");
    }

    private short value;
}