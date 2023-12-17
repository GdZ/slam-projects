/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.search.types;

public class Suggestions implements zserio.runtime.io.Writer, zserio.runtime.SizeOf
{
    public Suggestions()
    {
    }

    public Suggestions(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public Suggestions(
            java.lang.String[] suggestion_)
    {
        setSuggestion(suggestion_);
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

        endBitPosition += suggestion_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public java.lang.String[] getSuggestion()
    {
        return (suggestion_ == null) ? null : suggestion_.getRawArray();
    }

    public void setSuggestion(java.lang.String[] suggestion_)
    {
        this.suggestion_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.StringRawArray(suggestion_),
                new zserio.runtime.array.ArrayTraits.StringArrayTraits(),
                zserio.runtime.array.ArrayType.AUTO);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof Suggestions)
        {
            final Suggestions that = (Suggestions)obj;

            return
                    ((suggestion_ == null) ? that.suggestion_ == null : suggestion_.equals(that.suggestion_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, suggestion_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        suggestion_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.StringRawArray(),
                new zserio.runtime.array.ArrayTraits.StringArrayTraits(),
                zserio.runtime.array.ArrayType.AUTO);
        suggestion_.read(in);
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

        endBitPosition = suggestion_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        suggestion_.write(out);
    }

    private zserio.runtime.array.Array suggestion_;
}
