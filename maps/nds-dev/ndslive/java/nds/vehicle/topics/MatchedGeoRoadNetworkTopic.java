/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.vehicle.topics;

public class MatchedGeoRoadNetworkTopic implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            stamp_ = new nds.core.types.TimeStamp.ZserioPackingContext();
            matchedRoadNetwork_ = new nds.vehicle.types.Horizon.ZserioPackingContext();
        }

        public nds.core.types.TimeStamp.ZserioPackingContext getStamp()
        {
            return stamp_;
        }

        public nds.vehicle.types.Horizon.ZserioPackingContext getMatchedRoadNetwork()
        {
            return matchedRoadNetwork_;
        }

        private nds.core.types.TimeStamp.ZserioPackingContext stamp_;
        private nds.vehicle.types.Horizon.ZserioPackingContext matchedRoadNetwork_;
    };

    public MatchedGeoRoadNetworkTopic()
    {
    }

    public MatchedGeoRoadNetworkTopic(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public MatchedGeoRoadNetworkTopic(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public MatchedGeoRoadNetworkTopic(
            nds.core.types.TimeStamp stamp_,
            nds.vehicle.types.Horizon matchedRoadNetwork_,
            int[] unmatchedPaths_)
    {
        setStamp(stamp_);
        setMatchedRoadNetwork(matchedRoadNetwork_);
        setUnmatchedPaths(unmatchedPaths_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        stamp_.initPackingContext(zserioContext.getStamp());
        matchedRoadNetwork_.initPackingContext(zserioContext.getMatchedRoadNetwork());
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

        endBitPosition += stamp_.bitSizeOf(endBitPosition);
        endBitPosition += matchedRoadNetwork_.bitSizeOf(endBitPosition);
        endBitPosition += unmatchedPaths_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += stamp_.bitSizeOf(zserioContext.getStamp(), endBitPosition);
        endBitPosition += matchedRoadNetwork_.bitSizeOf(zserioContext.getMatchedRoadNetwork(), endBitPosition);
        endBitPosition += unmatchedPaths_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.types.TimeStamp getStamp()
    {
        return stamp_;
    }

    public void setStamp(nds.core.types.TimeStamp stamp_)
    {
        this.stamp_ = stamp_;
    }

    public nds.vehicle.types.Horizon getMatchedRoadNetwork()
    {
        return matchedRoadNetwork_;
    }

    public void setMatchedRoadNetwork(nds.vehicle.types.Horizon matchedRoadNetwork_)
    {
        this.matchedRoadNetwork_ = matchedRoadNetwork_;
    }

    public int[] getUnmatchedPaths()
    {
        return (unmatchedPaths_ == null) ? null : unmatchedPaths_.getRawArray();
    }

    public void setUnmatchedPaths(int[] unmatchedPaths_)
    {
        this.unmatchedPaths_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.IntRawArray(unmatchedPaths_),
                new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                zserio.runtime.array.ArrayType.AUTO);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof MatchedGeoRoadNetworkTopic)
        {
            final MatchedGeoRoadNetworkTopic that = (MatchedGeoRoadNetworkTopic)obj;

            return
                    ((stamp_ == null) ? that.stamp_ == null : stamp_.equals(that.stamp_)) &&
                    ((matchedRoadNetwork_ == null) ? that.matchedRoadNetwork_ == null : matchedRoadNetwork_.equals(that.matchedRoadNetwork_)) &&
                    ((unmatchedPaths_ == null) ? that.unmatchedPaths_ == null : unmatchedPaths_.equals(that.unmatchedPaths_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, stamp_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, matchedRoadNetwork_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, unmatchedPaths_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        stamp_ = new nds.core.types.TimeStamp(in);

        matchedRoadNetwork_ = new nds.vehicle.types.Horizon(in);

        unmatchedPaths_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.IntRawArray(),
                new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                zserio.runtime.array.ArrayType.AUTO);
        unmatchedPaths_.read(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        stamp_ = new nds.core.types.TimeStamp(zserioContext.getStamp(), in);

        matchedRoadNetwork_ = new nds.vehicle.types.Horizon(zserioContext.getMatchedRoadNetwork(), in);

        unmatchedPaths_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.IntRawArray(),
                new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                zserio.runtime.array.ArrayType.AUTO);
        unmatchedPaths_.readPacked(in);
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

        endBitPosition = stamp_.initializeOffsets(endBitPosition);
        endBitPosition = matchedRoadNetwork_.initializeOffsets(endBitPosition);
        endBitPosition = unmatchedPaths_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = stamp_.initializeOffsets(zserioContext.getStamp(), endBitPosition);
        endBitPosition = matchedRoadNetwork_.initializeOffsets(zserioContext.getMatchedRoadNetwork(), endBitPosition);
        endBitPosition = unmatchedPaths_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        stamp_.write(out);

        matchedRoadNetwork_.write(out);

        unmatchedPaths_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        stamp_.write(zserioContext.getStamp(), out);

        matchedRoadNetwork_.write(zserioContext.getMatchedRoadNetwork(), out);

        unmatchedPaths_.writePacked(out);
    }

    private nds.core.types.TimeStamp stamp_;
    private nds.vehicle.types.Horizon matchedRoadNetwork_;
    private zserio.runtime.array.Array unmatchedPaths_;
}