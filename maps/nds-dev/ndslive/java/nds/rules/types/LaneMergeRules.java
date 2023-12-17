/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.rules.types;

public class LaneMergeRules implements zserio.runtime.io.Writer, zserio.runtime.SizeOf
{
    public LaneMergeRules()
    {
    }

    public LaneMergeRules(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public LaneMergeRules(
            boolean yieldToOngoingLane_,
            boolean yieldToCurb_,
            boolean yieldToTrafficAhead_,
            boolean noDividerYieldToCurb_)
    {
        setYieldToOngoingLane(yieldToOngoingLane_);
        setYieldToCurb(yieldToCurb_);
        setYieldToTrafficAhead(yieldToTrafficAhead_);
        setNoDividerYieldToCurb(noDividerYieldToCurb_);
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

        endBitPosition += 1;
        endBitPosition += 1;
        endBitPosition += 1;
        endBitPosition += 1;

        return (int)(endBitPosition - bitPosition);
    }

    public boolean getYieldToOngoingLane()
    {
        return yieldToOngoingLane_;
    }

    public void setYieldToOngoingLane(boolean yieldToOngoingLane_)
    {
        this.yieldToOngoingLane_ = yieldToOngoingLane_;
    }

    public boolean getYieldToCurb()
    {
        return yieldToCurb_;
    }

    public void setYieldToCurb(boolean yieldToCurb_)
    {
        this.yieldToCurb_ = yieldToCurb_;
    }

    public boolean getYieldToTrafficAhead()
    {
        return yieldToTrafficAhead_;
    }

    public void setYieldToTrafficAhead(boolean yieldToTrafficAhead_)
    {
        this.yieldToTrafficAhead_ = yieldToTrafficAhead_;
    }

    public boolean getNoDividerYieldToCurb()
    {
        return noDividerYieldToCurb_;
    }

    public void setNoDividerYieldToCurb(boolean noDividerYieldToCurb_)
    {
        this.noDividerYieldToCurb_ = noDividerYieldToCurb_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof LaneMergeRules)
        {
            final LaneMergeRules that = (LaneMergeRules)obj;

            return
                    yieldToOngoingLane_ == that.yieldToOngoingLane_ &&
                    yieldToCurb_ == that.yieldToCurb_ &&
                    yieldToTrafficAhead_ == that.yieldToTrafficAhead_ &&
                    noDividerYieldToCurb_ == that.noDividerYieldToCurb_;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, yieldToOngoingLane_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, yieldToCurb_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, yieldToTrafficAhead_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, noDividerYieldToCurb_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        yieldToOngoingLane_ = in.readBool();

        yieldToCurb_ = in.readBool();

        yieldToTrafficAhead_ = in.readBool();

        noDividerYieldToCurb_ = in.readBool();
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

        endBitPosition += 1;
        endBitPosition += 1;
        endBitPosition += 1;
        endBitPosition += 1;

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeBool(yieldToOngoingLane_);

        out.writeBool(yieldToCurb_);

        out.writeBool(yieldToTrafficAhead_);

        out.writeBool(noDividerYieldToCurb_);
    }

    private boolean yieldToOngoingLane_;
    private boolean yieldToCurb_;
    private boolean yieldToTrafficAhead_;
    private boolean noDividerYieldToCurb_;
}
