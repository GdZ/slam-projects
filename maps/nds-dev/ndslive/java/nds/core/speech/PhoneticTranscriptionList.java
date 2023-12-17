/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.speech;

public class PhoneticTranscriptionList implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            format_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getFormat()
        {
            return format_;
        }

        private zserio.runtime.array.DeltaContext format_;
    };

    public PhoneticTranscriptionList()
    {
    }

    public PhoneticTranscriptionList(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public PhoneticTranscriptionList(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public PhoneticTranscriptionList(
            nds.core.speech.PhoneticTranscriptionFormat format_,
            nds.core.speech.PhoneticTranscription[] transcriptions_)
    {
        setFormat(format_);
        setTranscriptions(transcriptions_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        format_.initPackingContext(zserioContext.getFormat());
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

        endBitPosition += format_.bitSizeOf(endBitPosition);
        endBitPosition += transcriptions_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += format_.bitSizeOf(zserioContext.getFormat(), endBitPosition);
        endBitPosition += transcriptions_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.speech.PhoneticTranscriptionFormat getFormat()
    {
        return format_;
    }

    public void setFormat(nds.core.speech.PhoneticTranscriptionFormat format_)
    {
        this.format_ = format_;
    }

    public nds.core.speech.PhoneticTranscription[] getTranscriptions()
    {
        return (transcriptions_ == null) ? null : transcriptions_.getRawArray();
    }

    public void setTranscriptions(nds.core.speech.PhoneticTranscription[] transcriptions_)
    {
        this.transcriptions_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.speech.PhoneticTranscription.class, transcriptions_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.speech.PhoneticTranscription>(new ZserioElementFactory_transcriptions()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof PhoneticTranscriptionList)
        {
            final PhoneticTranscriptionList that = (PhoneticTranscriptionList)obj;

            return
                    ((format_ == null) ? that.format_ == null : format_.getValue() == that.format_.getValue()) &&
                    ((transcriptions_ == null) ? that.transcriptions_ == null : transcriptions_.equals(that.transcriptions_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, format_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, transcriptions_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        format_ = nds.core.speech.PhoneticTranscriptionFormat.readEnum(in);

        transcriptions_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.speech.PhoneticTranscription.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.speech.PhoneticTranscription>(new ZserioElementFactory_transcriptions()),
                zserio.runtime.array.ArrayType.AUTO);
        transcriptions_.readPacked(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        format_ = nds.core.speech.PhoneticTranscriptionFormat.readEnum(zserioContext.getFormat(), in);

        transcriptions_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.speech.PhoneticTranscription.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.speech.PhoneticTranscription>(new ZserioElementFactory_transcriptions()),
                zserio.runtime.array.ArrayType.AUTO);
        transcriptions_.readPacked(in);
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

        endBitPosition += format_.bitSizeOf(endBitPosition);
        endBitPosition = transcriptions_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = format_.initializeOffsets(zserioContext.getFormat(), endBitPosition);
        endBitPosition = transcriptions_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        format_.write(out);

        transcriptions_.writePacked(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        format_.write(zserioContext.getFormat(), out);

        transcriptions_.writePacked(out);
    }

    private static final class ZserioElementFactory_transcriptions implements zserio.runtime.array.PackableElementFactory<nds.core.speech.PhoneticTranscription>
    {
        @Override
        public nds.core.speech.PhoneticTranscription create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.core.speech.PhoneticTranscription(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.core.speech.PhoneticTranscription.ZserioPackingContext();
        }

        @Override
        public nds.core.speech.PhoneticTranscription create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.core.speech.PhoneticTranscription(context, in);
        }
    }

    private nds.core.speech.PhoneticTranscriptionFormat format_;
    private zserio.runtime.array.Array transcriptions_;
}