/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.routingdata.properties;

public class PropertyValue implements zserio.runtime.io.Writer, zserio.runtime.SizeOf
{
    public PropertyValue(
            nds.routingdata.properties.PropertyType type_)
    {
        this.type_ = type_;
    }

    public PropertyValue(zserio.runtime.io.BitStreamReader in,
            nds.routingdata.properties.PropertyType type_)
            throws java.io.IOException
    {
        this.type_ = type_;

        read(in);
    }

    public int choiceTag()
    {
        return UNDEFINED_CHOICE;
    }

    @Override
    public int bitSizeOf()
    {
        return bitSizeOf(0);
    }

    @Override
    public int bitSizeOf(long bitPosition)
    {
        return 0;
    }

    public nds.routingdata.properties.PropertyType getType()
    {
        return this.type_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof PropertyValue)
        {
            final PropertyValue that = (PropertyValue)obj;

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

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
    }

    @Override
    public long initializeOffsets()
    {
        return initializeOffsets(0);
    }

    @Override
    public long initializeOffsets(long bitPosition)
    {
        return bitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
    }

    public static final int UNDEFINED_CHOICE = -1;

    private final nds.routingdata.properties.PropertyType type_;
    private java.lang.Object objectChoice;
}
