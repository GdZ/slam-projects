/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.instructions.types;

public class SignpostInstruction implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            intersectionType_ = new zserio.runtime.array.DeltaContext();
            content_ = new zserio.runtime.array.DeltaContext();
            position_ = new nds.core.types.PercentagePosition.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getIntersectionType()
        {
            return intersectionType_;
        }

        public zserio.runtime.array.DeltaContext getContent()
        {
            return content_;
        }

        public nds.core.types.PercentagePosition.ZserioPackingContext getPosition()
        {
            return position_;
        }

        private zserio.runtime.array.DeltaContext intersectionType_;
        private zserio.runtime.array.DeltaContext content_;
        private nds.core.types.PercentagePosition.ZserioPackingContext position_;
    };

    public SignpostInstruction()
    {
    }

    public SignpostInstruction(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public SignpostInstruction(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public SignpostInstruction(
            nds.instructions.types.SignpostIntersectionType intersectionType_,
            nds.instructions.types.SignpostInstructionContent content_,
            nds.core.types.PercentagePosition position_,
            java.lang.String exitName_,
            java.lang.String exitNumber_,
            java.lang.String[] towardsName_,
            java.lang.String[] towardsNumber_,
            java.lang.String[] directionName_,
            java.lang.String[] directionNumber_)
    {
        setIntersectionType(intersectionType_);
        setContent(content_);
        setPosition(position_);
        setExitName(exitName_);
        setExitNumber(exitNumber_);
        setTowardsName(towardsName_);
        setTowardsNumber(towardsNumber_);
        setDirectionName(directionName_);
        setDirectionNumber(directionNumber_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        intersectionType_.initPackingContext(zserioContext.getIntersectionType());
        content_.initPackingContext(zserioContext.getContent());
        position_.initPackingContext(zserioContext.getPosition());
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

        endBitPosition += intersectionType_.bitSizeOf(endBitPosition);
        endBitPosition += content_.bitSizeOf(endBitPosition);
        endBitPosition += position_.bitSizeOf(endBitPosition);
        if (isExitNameUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(exitName_);
        }
        if (isExitNumberUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(exitNumber_);
        }
        if (isTowardsNameUsed())
        {
            endBitPosition += towardsName_.bitSizeOf(endBitPosition);
        }
        if (isTowardsNumberUsed())
        {
            endBitPosition += towardsNumber_.bitSizeOf(endBitPosition);
        }
        if (isDirectionNameUsed())
        {
            endBitPosition += directionName_.bitSizeOf(endBitPosition);
        }
        if (isDirectionNumberUsed())
        {
            endBitPosition += directionNumber_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += intersectionType_.bitSizeOf(zserioContext.getIntersectionType(), endBitPosition);
        endBitPosition += content_.bitSizeOf(zserioContext.getContent(), endBitPosition);
        endBitPosition += position_.bitSizeOf(zserioContext.getPosition(), endBitPosition);
        if (isExitNameUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(exitName_);
        }
        if (isExitNumberUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(exitNumber_);
        }
        if (isTowardsNameUsed())
        {
            endBitPosition += towardsName_.bitSizeOf(endBitPosition);
        }
        if (isTowardsNumberUsed())
        {
            endBitPosition += towardsNumber_.bitSizeOf(endBitPosition);
        }
        if (isDirectionNameUsed())
        {
            endBitPosition += directionName_.bitSizeOf(endBitPosition);
        }
        if (isDirectionNumberUsed())
        {
            endBitPosition += directionNumber_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.instructions.types.SignpostIntersectionType getIntersectionType()
    {
        return intersectionType_;
    }

    public void setIntersectionType(nds.instructions.types.SignpostIntersectionType intersectionType_)
    {
        this.intersectionType_ = intersectionType_;
    }

    public nds.instructions.types.SignpostInstructionContent getContent()
    {
        return content_;
    }

    public void setContent(nds.instructions.types.SignpostInstructionContent content_)
    {
        this.content_ = content_;
    }

    public nds.core.types.PercentagePosition getPosition()
    {
        return position_;
    }

    public void setPosition(nds.core.types.PercentagePosition position_)
    {
        this.position_ = position_;
    }

    public java.lang.String getExitName()
    {
        return exitName_;
    }

    public void setExitName(java.lang.String exitName_)
    {
        this.exitName_ = exitName_;
    }

    public boolean isExitNameUsed()
    {
        return ((getContent().and(nds.instructions.types.SignpostInstructionContent.Values.EXIT_NAME)).equals(nds.instructions.types.SignpostInstructionContent.Values.EXIT_NAME));
    }

    public boolean isExitNameSet()
    {
        return (exitName_ != null);
    }

    public void resetExitName()
    {
        this.exitName_ = null;
    }

    public java.lang.String getExitNumber()
    {
        return exitNumber_;
    }

    public void setExitNumber(java.lang.String exitNumber_)
    {
        this.exitNumber_ = exitNumber_;
    }

    public boolean isExitNumberUsed()
    {
        return ((getContent().and(nds.instructions.types.SignpostInstructionContent.Values.EXIT_NUMBER)).equals(nds.instructions.types.SignpostInstructionContent.Values.EXIT_NUMBER));
    }

    public boolean isExitNumberSet()
    {
        return (exitNumber_ != null);
    }

    public void resetExitNumber()
    {
        this.exitNumber_ = null;
    }

    public java.lang.String[] getTowardsName()
    {
        return (towardsName_ == null) ? null : towardsName_.getRawArray();
    }

    public void setTowardsName(java.lang.String[] towardsName_)
    {
        if (towardsName_ == null)
        {
            this.towardsName_ = null;
        }
        else
        {
            this.towardsName_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.StringRawArray(towardsName_),
                    new zserio.runtime.array.ArrayTraits.StringArrayTraits(),
                    zserio.runtime.array.ArrayType.AUTO);
        }
    }

    public boolean isTowardsNameUsed()
    {
        return ((getContent().and(nds.instructions.types.SignpostInstructionContent.Values.TOWARDS_NAME)).equals(nds.instructions.types.SignpostInstructionContent.Values.TOWARDS_NAME));
    }

    public boolean isTowardsNameSet()
    {
        return (towardsName_ != null);
    }

    public void resetTowardsName()
    {
        this.towardsName_ = null;
    }

    public java.lang.String[] getTowardsNumber()
    {
        return (towardsNumber_ == null) ? null : towardsNumber_.getRawArray();
    }

    public void setTowardsNumber(java.lang.String[] towardsNumber_)
    {
        if (towardsNumber_ == null)
        {
            this.towardsNumber_ = null;
        }
        else
        {
            this.towardsNumber_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.StringRawArray(towardsNumber_),
                    new zserio.runtime.array.ArrayTraits.StringArrayTraits(),
                    zserio.runtime.array.ArrayType.AUTO);
        }
    }

    public boolean isTowardsNumberUsed()
    {
        return ((getContent().and(nds.instructions.types.SignpostInstructionContent.Values.TOWARDS_NUMBER)).equals(nds.instructions.types.SignpostInstructionContent.Values.TOWARDS_NUMBER));
    }

    public boolean isTowardsNumberSet()
    {
        return (towardsNumber_ != null);
    }

    public void resetTowardsNumber()
    {
        this.towardsNumber_ = null;
    }

    public java.lang.String[] getDirectionName()
    {
        return (directionName_ == null) ? null : directionName_.getRawArray();
    }

    public void setDirectionName(java.lang.String[] directionName_)
    {
        if (directionName_ == null)
        {
            this.directionName_ = null;
        }
        else
        {
            this.directionName_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.StringRawArray(directionName_),
                    new zserio.runtime.array.ArrayTraits.StringArrayTraits(),
                    zserio.runtime.array.ArrayType.AUTO);
        }
    }

    public boolean isDirectionNameUsed()
    {
        return ((getContent().and(nds.instructions.types.SignpostInstructionContent.Values.DIRECTION_NAME)).equals(nds.instructions.types.SignpostInstructionContent.Values.DIRECTION_NAME));
    }

    public boolean isDirectionNameSet()
    {
        return (directionName_ != null);
    }

    public void resetDirectionName()
    {
        this.directionName_ = null;
    }

    public java.lang.String[] getDirectionNumber()
    {
        return (directionNumber_ == null) ? null : directionNumber_.getRawArray();
    }

    public void setDirectionNumber(java.lang.String[] directionNumber_)
    {
        if (directionNumber_ == null)
        {
            this.directionNumber_ = null;
        }
        else
        {
            this.directionNumber_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.StringRawArray(directionNumber_),
                    new zserio.runtime.array.ArrayTraits.StringArrayTraits(),
                    zserio.runtime.array.ArrayType.AUTO);
        }
    }

    public boolean isDirectionNumberUsed()
    {
        return ((getContent().and(nds.instructions.types.SignpostInstructionContent.Values.DIRECTION_NUMBER)).equals(nds.instructions.types.SignpostInstructionContent.Values.DIRECTION_NUMBER));
    }

    public boolean isDirectionNumberSet()
    {
        return (directionNumber_ != null);
    }

    public void resetDirectionNumber()
    {
        this.directionNumber_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof SignpostInstruction)
        {
            final SignpostInstruction that = (SignpostInstruction)obj;

            return
                    ((intersectionType_ == null) ? that.intersectionType_ == null : intersectionType_.getValue() == that.intersectionType_.getValue()) &&
                    ((content_ == null) ? that.content_ == null : content_.equals(that.content_)) &&
                    ((position_ == null) ? that.position_ == null : position_.equals(that.position_)) &&
                    ((!isExitNameUsed()) ? !that.isExitNameUsed() :
                        ((exitName_ == null) ? that.exitName_ == null : exitName_.equals(that.exitName_))) &&
                    ((!isExitNumberUsed()) ? !that.isExitNumberUsed() :
                        ((exitNumber_ == null) ? that.exitNumber_ == null : exitNumber_.equals(that.exitNumber_))) &&
                    ((!isTowardsNameUsed()) ? !that.isTowardsNameUsed() :
                        ((towardsName_ == null) ? that.towardsName_ == null : towardsName_.equals(that.towardsName_))) &&
                    ((!isTowardsNumberUsed()) ? !that.isTowardsNumberUsed() :
                        ((towardsNumber_ == null) ? that.towardsNumber_ == null : towardsNumber_.equals(that.towardsNumber_))) &&
                    ((!isDirectionNameUsed()) ? !that.isDirectionNameUsed() :
                        ((directionName_ == null) ? that.directionName_ == null : directionName_.equals(that.directionName_))) &&
                    ((!isDirectionNumberUsed()) ? !that.isDirectionNumberUsed() :
                        ((directionNumber_ == null) ? that.directionNumber_ == null : directionNumber_.equals(that.directionNumber_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, intersectionType_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, content_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, position_);
        if (isExitNameUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, exitName_);
        if (isExitNumberUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, exitNumber_);
        if (isTowardsNameUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, towardsName_);
        if (isTowardsNumberUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, towardsNumber_);
        if (isDirectionNameUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, directionName_);
        if (isDirectionNumberUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, directionNumber_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        intersectionType_ = nds.instructions.types.SignpostIntersectionType.readEnum(in);

        content_ = new nds.instructions.types.SignpostInstructionContent(in);

        position_ = new nds.core.types.PercentagePosition(in);

        if ((getContent().and(nds.instructions.types.SignpostInstructionContent.Values.EXIT_NAME)).equals(nds.instructions.types.SignpostInstructionContent.Values.EXIT_NAME))
        {
            exitName_ = in.readString();
        }

        if ((getContent().and(nds.instructions.types.SignpostInstructionContent.Values.EXIT_NUMBER)).equals(nds.instructions.types.SignpostInstructionContent.Values.EXIT_NUMBER))
        {
            exitNumber_ = in.readString();
        }

        if ((getContent().and(nds.instructions.types.SignpostInstructionContent.Values.TOWARDS_NAME)).equals(nds.instructions.types.SignpostInstructionContent.Values.TOWARDS_NAME))
        {
            towardsName_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.StringRawArray(),
                    new zserio.runtime.array.ArrayTraits.StringArrayTraits(),
                    zserio.runtime.array.ArrayType.AUTO);
            towardsName_.read(in);
        }

        if ((getContent().and(nds.instructions.types.SignpostInstructionContent.Values.TOWARDS_NUMBER)).equals(nds.instructions.types.SignpostInstructionContent.Values.TOWARDS_NUMBER))
        {
            towardsNumber_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.StringRawArray(),
                    new zserio.runtime.array.ArrayTraits.StringArrayTraits(),
                    zserio.runtime.array.ArrayType.AUTO);
            towardsNumber_.read(in);
        }

        if ((getContent().and(nds.instructions.types.SignpostInstructionContent.Values.DIRECTION_NAME)).equals(nds.instructions.types.SignpostInstructionContent.Values.DIRECTION_NAME))
        {
            directionName_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.StringRawArray(),
                    new zserio.runtime.array.ArrayTraits.StringArrayTraits(),
                    zserio.runtime.array.ArrayType.AUTO);
            directionName_.read(in);
        }

        if ((getContent().and(nds.instructions.types.SignpostInstructionContent.Values.DIRECTION_NUMBER)).equals(nds.instructions.types.SignpostInstructionContent.Values.DIRECTION_NUMBER))
        {
            directionNumber_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.StringRawArray(),
                    new zserio.runtime.array.ArrayTraits.StringArrayTraits(),
                    zserio.runtime.array.ArrayType.AUTO);
            directionNumber_.read(in);
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        intersectionType_ = nds.instructions.types.SignpostIntersectionType.readEnum(zserioContext.getIntersectionType(), in);

        content_ = new nds.instructions.types.SignpostInstructionContent(zserioContext.getContent(), in);

        position_ = new nds.core.types.PercentagePosition(zserioContext.getPosition(), in);

        if ((getContent().and(nds.instructions.types.SignpostInstructionContent.Values.EXIT_NAME)).equals(nds.instructions.types.SignpostInstructionContent.Values.EXIT_NAME))
        {
            exitName_ = in.readString();
        }

        if ((getContent().and(nds.instructions.types.SignpostInstructionContent.Values.EXIT_NUMBER)).equals(nds.instructions.types.SignpostInstructionContent.Values.EXIT_NUMBER))
        {
            exitNumber_ = in.readString();
        }

        if ((getContent().and(nds.instructions.types.SignpostInstructionContent.Values.TOWARDS_NAME)).equals(nds.instructions.types.SignpostInstructionContent.Values.TOWARDS_NAME))
        {
            towardsName_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.StringRawArray(),
                    new zserio.runtime.array.ArrayTraits.StringArrayTraits(),
                    zserio.runtime.array.ArrayType.AUTO);
            towardsName_.read(in);
        }

        if ((getContent().and(nds.instructions.types.SignpostInstructionContent.Values.TOWARDS_NUMBER)).equals(nds.instructions.types.SignpostInstructionContent.Values.TOWARDS_NUMBER))
        {
            towardsNumber_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.StringRawArray(),
                    new zserio.runtime.array.ArrayTraits.StringArrayTraits(),
                    zserio.runtime.array.ArrayType.AUTO);
            towardsNumber_.read(in);
        }

        if ((getContent().and(nds.instructions.types.SignpostInstructionContent.Values.DIRECTION_NAME)).equals(nds.instructions.types.SignpostInstructionContent.Values.DIRECTION_NAME))
        {
            directionName_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.StringRawArray(),
                    new zserio.runtime.array.ArrayTraits.StringArrayTraits(),
                    zserio.runtime.array.ArrayType.AUTO);
            directionName_.read(in);
        }

        if ((getContent().and(nds.instructions.types.SignpostInstructionContent.Values.DIRECTION_NUMBER)).equals(nds.instructions.types.SignpostInstructionContent.Values.DIRECTION_NUMBER))
        {
            directionNumber_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.StringRawArray(),
                    new zserio.runtime.array.ArrayTraits.StringArrayTraits(),
                    zserio.runtime.array.ArrayType.AUTO);
            directionNumber_.read(in);
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

        endBitPosition += intersectionType_.bitSizeOf(endBitPosition);
        endBitPosition += content_.bitSizeOf(endBitPosition);
        endBitPosition = position_.initializeOffsets(endBitPosition);
        if (isExitNameUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(exitName_);
        }
        if (isExitNumberUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(exitNumber_);
        }
        if (isTowardsNameUsed())
        {
            endBitPosition = towardsName_.initializeOffsets(endBitPosition);
        }
        if (isTowardsNumberUsed())
        {
            endBitPosition = towardsNumber_.initializeOffsets(endBitPosition);
        }
        if (isDirectionNameUsed())
        {
            endBitPosition = directionName_.initializeOffsets(endBitPosition);
        }
        if (isDirectionNumberUsed())
        {
            endBitPosition = directionNumber_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = intersectionType_.initializeOffsets(zserioContext.getIntersectionType(), endBitPosition);
        endBitPosition = content_.initializeOffsets(zserioContext.getContent(), endBitPosition);
        endBitPosition = position_.initializeOffsets(zserioContext.getPosition(), endBitPosition);
        if (isExitNameUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(exitName_);
        }
        if (isExitNumberUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(exitNumber_);
        }
        if (isTowardsNameUsed())
        {
            endBitPosition = towardsName_.initializeOffsets(endBitPosition);
        }
        if (isTowardsNumberUsed())
        {
            endBitPosition = towardsNumber_.initializeOffsets(endBitPosition);
        }
        if (isDirectionNameUsed())
        {
            endBitPosition = directionName_.initializeOffsets(endBitPosition);
        }
        if (isDirectionNumberUsed())
        {
            endBitPosition = directionNumber_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        intersectionType_.write(out);

        content_.write(out);

        position_.write(out);

        if (isExitNameUsed())
        {
            out.writeString(exitName_);
        }

        if (isExitNumberUsed())
        {
            out.writeString(exitNumber_);
        }

        if (isTowardsNameUsed())
        {
            towardsName_.write(out);
        }

        if (isTowardsNumberUsed())
        {
            towardsNumber_.write(out);
        }

        if (isDirectionNameUsed())
        {
            directionName_.write(out);
        }

        if (isDirectionNumberUsed())
        {
            directionNumber_.write(out);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        intersectionType_.write(zserioContext.getIntersectionType(), out);

        content_.write(zserioContext.getContent(), out);

        position_.write(zserioContext.getPosition(), out);

        if (isExitNameUsed())
        {
            out.writeString(exitName_);
        }

        if (isExitNumberUsed())
        {
            out.writeString(exitNumber_);
        }

        if (isTowardsNameUsed())
        {
            towardsName_.write(out);
        }

        if (isTowardsNumberUsed())
        {
            towardsNumber_.write(out);
        }

        if (isDirectionNameUsed())
        {
            directionName_.write(out);
        }

        if (isDirectionNumberUsed())
        {
            directionNumber_.write(out);
        }
    }

    private nds.instructions.types.SignpostIntersectionType intersectionType_;
    private nds.instructions.types.SignpostInstructionContent content_;
    private nds.core.types.PercentagePosition position_;
    private java.lang.String exitName_;
    private java.lang.String exitNumber_;
    private zserio.runtime.array.Array towardsName_;
    private zserio.runtime.array.Array towardsNumber_;
    private zserio.runtime.array.Array directionName_;
    private zserio.runtime.array.Array directionNumber_;
}
