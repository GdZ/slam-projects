/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.rules.types;

public class VehicleLightConditions implements zserio.runtime.io.Writer, zserio.runtime.SizeOf
{
    public VehicleLightConditions()
    {
    }

    public VehicleLightConditions(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public VehicleLightConditions(
            boolean alwaysRequired_,
            java.lang.Boolean afterSunset_,
            java.lang.Boolean withWindshieldWipers_,
            java.lang.Boolean lowVisibility_)
    {
        setAlwaysRequired(alwaysRequired_);
        setAfterSunset(afterSunset_);
        setWithWindshieldWipers(withWindshieldWipers_);
        setLowVisibility(lowVisibility_);
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
        if (isAfterSunsetUsed())
        {
            endBitPosition += 1;
        }
        if (isWithWindshieldWipersUsed())
        {
            endBitPosition += 1;
        }
        if (isLowVisibilityUsed())
        {
            endBitPosition += 1;
        }

        return (int)(endBitPosition - bitPosition);
    }

    public boolean getAlwaysRequired()
    {
        return alwaysRequired_;
    }

    public void setAlwaysRequired(boolean alwaysRequired_)
    {
        this.alwaysRequired_ = alwaysRequired_;
    }

    public java.lang.Boolean getAfterSunset()
    {
        return afterSunset_;
    }

    public void setAfterSunset(java.lang.Boolean afterSunset_)
    {
        this.afterSunset_ = afterSunset_;
    }

    public boolean isAfterSunsetUsed()
    {
        return (!getAlwaysRequired());
    }

    public boolean isAfterSunsetSet()
    {
        return (afterSunset_ != null);
    }

    public void resetAfterSunset()
    {
        this.afterSunset_ = null;
    }

    public java.lang.Boolean getWithWindshieldWipers()
    {
        return withWindshieldWipers_;
    }

    public void setWithWindshieldWipers(java.lang.Boolean withWindshieldWipers_)
    {
        this.withWindshieldWipers_ = withWindshieldWipers_;
    }

    public boolean isWithWindshieldWipersUsed()
    {
        return (!getAlwaysRequired());
    }

    public boolean isWithWindshieldWipersSet()
    {
        return (withWindshieldWipers_ != null);
    }

    public void resetWithWindshieldWipers()
    {
        this.withWindshieldWipers_ = null;
    }

    public java.lang.Boolean getLowVisibility()
    {
        return lowVisibility_;
    }

    public void setLowVisibility(java.lang.Boolean lowVisibility_)
    {
        this.lowVisibility_ = lowVisibility_;
    }

    public boolean isLowVisibilityUsed()
    {
        return (!getAlwaysRequired());
    }

    public boolean isLowVisibilitySet()
    {
        return (lowVisibility_ != null);
    }

    public void resetLowVisibility()
    {
        this.lowVisibility_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof VehicleLightConditions)
        {
            final VehicleLightConditions that = (VehicleLightConditions)obj;

            return
                    alwaysRequired_ == that.alwaysRequired_ &&
                    ((!isAfterSunsetUsed()) ? !that.isAfterSunsetUsed() :
                        ((afterSunset_ == null) ? that.afterSunset_ == null : afterSunset_.equals(that.afterSunset_))) &&
                    ((!isWithWindshieldWipersUsed()) ? !that.isWithWindshieldWipersUsed() :
                        ((withWindshieldWipers_ == null) ? that.withWindshieldWipers_ == null : withWindshieldWipers_.equals(that.withWindshieldWipers_))) &&
                    ((!isLowVisibilityUsed()) ? !that.isLowVisibilityUsed() :
                        ((lowVisibility_ == null) ? that.lowVisibility_ == null : lowVisibility_.equals(that.lowVisibility_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, alwaysRequired_);
        if (isAfterSunsetUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, afterSunset_);
        if (isWithWindshieldWipersUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, withWindshieldWipers_);
        if (isLowVisibilityUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, lowVisibility_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        alwaysRequired_ = in.readBool();

        if (!getAlwaysRequired())
        {
            afterSunset_ = in.readBool();
        }

        if (!getAlwaysRequired())
        {
            withWindshieldWipers_ = in.readBool();
        }

        if (!getAlwaysRequired())
        {
            lowVisibility_ = in.readBool();
        }
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
        if (isAfterSunsetUsed())
        {
            endBitPosition += 1;
        }
        if (isWithWindshieldWipersUsed())
        {
            endBitPosition += 1;
        }
        if (isLowVisibilityUsed())
        {
            endBitPosition += 1;
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeBool(alwaysRequired_);

        if (isAfterSunsetUsed())
        {
            out.writeBool(afterSunset_);
        }

        if (isWithWindshieldWipersUsed())
        {
            out.writeBool(withWindshieldWipers_);
        }

        if (isLowVisibilityUsed())
        {
            out.writeBool(lowVisibility_);
        }
    }

    private boolean alwaysRequired_;
    private java.lang.Boolean afterSunset_;
    private java.lang.Boolean withWindshieldWipers_;
    private java.lang.Boolean lowVisibility_;
}
