/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.road.road;

public class MatchedRoadSegment implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
    };

    public MatchedRoadSegment()
    {
    }

    public MatchedRoadSegment(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public MatchedRoadSegment(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public MatchedRoadSegment(
            nds.core.types.Var4ByteDirectedReference[] matchedRoads_)
    {
        setMatchedRoads(matchedRoads_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
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

        endBitPosition += matchedRoads_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition += matchedRoads_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.types.Var4ByteDirectedReference[] getMatchedRoads()
    {
        return (matchedRoads_ == null) ? null : matchedRoads_.getRawArray();
    }

    public void setMatchedRoads(nds.core.types.Var4ByteDirectedReference[] matchedRoads_)
    {
        this.matchedRoads_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Var4ByteDirectedReference.class, matchedRoads_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Var4ByteDirectedReference>(new ZserioElementFactory_matchedRoads()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof MatchedRoadSegment)
        {
            final MatchedRoadSegment that = (MatchedRoadSegment)obj;

            return
                    ((matchedRoads_ == null) ? that.matchedRoads_ == null : matchedRoads_.equals(that.matchedRoads_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, matchedRoads_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        matchedRoads_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Var4ByteDirectedReference.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Var4ByteDirectedReference>(new ZserioElementFactory_matchedRoads()),
                zserio.runtime.array.ArrayType.AUTO);
        matchedRoads_.readPacked(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        matchedRoads_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Var4ByteDirectedReference.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Var4ByteDirectedReference>(new ZserioElementFactory_matchedRoads()),
                zserio.runtime.array.ArrayType.AUTO);
        matchedRoads_.readPacked(in);
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

        endBitPosition = matchedRoads_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition = matchedRoads_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        matchedRoads_.writePacked(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        matchedRoads_.writePacked(out);
    }

    private static final class ZserioElementFactory_matchedRoads implements zserio.runtime.array.PackableElementFactory<nds.core.types.Var4ByteDirectedReference>
    {
        @Override
        public nds.core.types.Var4ByteDirectedReference create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.core.types.Var4ByteDirectedReference(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.core.types.Var4ByteDirectedReference.ZserioPackingContext();
        }

        @Override
        public nds.core.types.Var4ByteDirectedReference create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.core.types.Var4ByteDirectedReference(context, in);
        }
    }

    private zserio.runtime.array.Array matchedRoads_;
}
