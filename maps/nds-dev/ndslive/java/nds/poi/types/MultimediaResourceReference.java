/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.poi.types;

public class MultimediaResourceReference implements zserio.runtime.io.Writer, zserio.runtime.SizeOf
{
    public MultimediaResourceReference()
    {
    }

    public MultimediaResourceReference(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public MultimediaResourceReference(
            java.lang.String mimeType_,
            java.lang.String uri_)
    {
        setMimeType(mimeType_);
        setUri(uri_);
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(mimeType_);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(uri_);

        return (int)(endBitPosition - bitPosition);
    }

    public java.lang.String getMimeType()
    {
        return mimeType_;
    }

    public void setMimeType(java.lang.String mimeType_)
    {
        this.mimeType_ = mimeType_;
    }

    public java.lang.String getUri()
    {
        return uri_;
    }

    public void setUri(java.lang.String uri_)
    {
        this.uri_ = uri_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof MultimediaResourceReference)
        {
            final MultimediaResourceReference that = (MultimediaResourceReference)obj;

            return
                    ((mimeType_ == null) ? that.mimeType_ == null : mimeType_.equals(that.mimeType_)) &&
                    ((uri_ == null) ? that.uri_ == null : uri_.equals(that.uri_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, mimeType_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, uri_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        mimeType_ = in.readString();

        uri_ = in.readString();
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(mimeType_);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(uri_);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeString(mimeType_);

        out.writeString(uri_);
    }

    private java.lang.String mimeType_;
    private java.lang.String uri_;
}
