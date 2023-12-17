/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.details.metadata;

public class Display3dAttributeLayerContent implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioBitmask
{
    public Display3dAttributeLayerContent()
    {
        this((int)0);
    }

    public Display3dAttributeLayerContent(int value)
    {
        if (value < 0 || value > 536870911)
        {
            throw new java.lang.IllegalArgumentException(
                    "Value for bitmask 'Display3dAttributeLayerContent' out of bounds: " + value + "!");
        }
        this.value = value;
    }

    public Display3dAttributeLayerContent(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        value = in.readVarUInt32();
    }

    public Display3dAttributeLayerContent(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
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
        if (!(other instanceof Display3dAttributeLayerContent))
            return false;

        final Display3dAttributeLayerContent otherDisplay3dAttributeLayerContent = (Display3dAttributeLayerContent)other;
        return value == otherDisplay3dAttributeLayerContent.value;
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

        if (this.and(Display3dAttributeLayerContent.Values.DISPLAY_MESH_MAPS).equals(Display3dAttributeLayerContent.Values.DISPLAY_MESH_MAPS))
            builder.append(builder.length() == 0 ? "DISPLAY_MESH_MAPS" : " | DISPLAY_MESH_MAPS");
        if (this.and(Display3dAttributeLayerContent.Values.DISPLAY_MESH_SETS).equals(Display3dAttributeLayerContent.Values.DISPLAY_MESH_SETS))
            builder.append(builder.length() == 0 ? "DISPLAY_MESH_SETS" : " | DISPLAY_MESH_SETS");

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

    public Display3dAttributeLayerContent or(Display3dAttributeLayerContent other)
    {
        return new Display3dAttributeLayerContent((int)(value | other.value));
    }

    public Display3dAttributeLayerContent and(Display3dAttributeLayerContent other)
    {
        return new Display3dAttributeLayerContent((int)(value & other.value));
    }

    public Display3dAttributeLayerContent xor(Display3dAttributeLayerContent other)
    {
        return new Display3dAttributeLayerContent((int)(value ^ other.value));
    }

    public Display3dAttributeLayerContent not()
    {
        return new Display3dAttributeLayerContent((int)(~value & 536870911));
    }

    public static final class Values
    {
        public static final Display3dAttributeLayerContent DISPLAY_MESH_MAPS = new Display3dAttributeLayerContent(1);
        public static final Display3dAttributeLayerContent DISPLAY_MESH_SETS = new Display3dAttributeLayerContent(2);
    }

    private int value;
}
