/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.name.attributes;

public class NameDisplayPointAttributeValue implements zserio.runtime.io.Writer, zserio.runtime.SizeOf
{
    public NameDisplayPointAttributeValue(
            nds.name.attributes.NameDisplayPointAttributeType type_)
    {
        this.type_ = type_;
    }

    public NameDisplayPointAttributeValue(zserio.runtime.io.BitStreamReader in,
            nds.name.attributes.NameDisplayPointAttributeType type_)
            throws java.io.IOException
    {
        this.type_ = type_;

        read(in);
    }

    public int choiceTag()
    {
        switch (getType())
        {
        case POINT_LABEL_NAME:
            return CHOICE_pointName;
        case ADMINISTRATIVE_AREA_CENTER_NAME:
            return CHOICE_administrativeAreaCenterName;
        case MOUNTAIN_NAME:
            return CHOICE_mountainName;
        case ISLAND_NAME:
            return CHOICE_islandName;
        case TOLL_STATION_NAME:
            return CHOICE_tollStationName;
        default:
            return UNDEFINED_CHOICE;
        }
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

        switch (getType())
        {
        case POINT_LABEL_NAME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getPointName());
            break;
        case ADMINISTRATIVE_AREA_CENTER_NAME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getAdministrativeAreaCenterName());
            break;
        case MOUNTAIN_NAME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getMountainName());
            break;
        case ISLAND_NAME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getIslandName());
            break;
        case TOLL_STATION_NAME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getTollStationName());
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice NameDisplayPointAttributeValue: " + getType() + "!");
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.name.attributes.NameDisplayPointAttributeType getType()
    {
        return this.type_;
    }

    public java.lang.String getPointName()
    {
        return (java.lang.String)objectChoice;
    }

    public void setPointName(java.lang.String pointName_)
    {
        objectChoice = pointName_;
    }

    public java.lang.String getAdministrativeAreaCenterName()
    {
        return (java.lang.String)objectChoice;
    }

    public void setAdministrativeAreaCenterName(java.lang.String administrativeAreaCenterName_)
    {
        objectChoice = administrativeAreaCenterName_;
    }

    public java.lang.String getMountainName()
    {
        return (java.lang.String)objectChoice;
    }

    public void setMountainName(java.lang.String mountainName_)
    {
        objectChoice = mountainName_;
    }

    public java.lang.String getIslandName()
    {
        return (java.lang.String)objectChoice;
    }

    public void setIslandName(java.lang.String islandName_)
    {
        objectChoice = islandName_;
    }

    public java.lang.String getTollStationName()
    {
        return (java.lang.String)objectChoice;
    }

    public void setTollStationName(java.lang.String tollStationName_)
    {
        objectChoice = tollStationName_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof NameDisplayPointAttributeValue)
        {
            final NameDisplayPointAttributeValue that = (NameDisplayPointAttributeValue)obj;

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
        if (objectChoice != null)
        {
            switch (getType())
            {
            case POINT_LABEL_NAME:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.String)objectChoice);
                break;
            case ADMINISTRATIVE_AREA_CENTER_NAME:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.String)objectChoice);
                break;
            case MOUNTAIN_NAME:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.String)objectChoice);
                break;
            case ISLAND_NAME:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.String)objectChoice);
                break;
            case TOLL_STATION_NAME:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.String)objectChoice);
                break;
            default:
                break;
            }
        }

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        switch (getType())
        {
        case POINT_LABEL_NAME:
            objectChoice = in.readString();
            break;
        case ADMINISTRATIVE_AREA_CENTER_NAME:
            objectChoice = in.readString();
            break;
        case MOUNTAIN_NAME:
            objectChoice = in.readString();
            break;
        case ISLAND_NAME:
            objectChoice = in.readString();
            break;
        case TOLL_STATION_NAME:
            objectChoice = in.readString();
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice NameDisplayPointAttributeValue: " + getType() + "!");
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

        switch (getType())
        {
        case POINT_LABEL_NAME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getPointName());
            }
            break;
        case ADMINISTRATIVE_AREA_CENTER_NAME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getAdministrativeAreaCenterName());
            }
            break;
        case MOUNTAIN_NAME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getMountainName());
            }
            break;
        case ISLAND_NAME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getIslandName());
            }
            break;
        case TOLL_STATION_NAME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getTollStationName());
            }
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice NameDisplayPointAttributeValue: " + getType() + "!");
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        switch (getType())
        {
        case POINT_LABEL_NAME:
            out.writeString(getPointName());
            break;
        case ADMINISTRATIVE_AREA_CENTER_NAME:
            out.writeString(getAdministrativeAreaCenterName());
            break;
        case MOUNTAIN_NAME:
            out.writeString(getMountainName());
            break;
        case ISLAND_NAME:
            out.writeString(getIslandName());
            break;
        case TOLL_STATION_NAME:
            out.writeString(getTollStationName());
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice NameDisplayPointAttributeValue: " + getType() + "!");
        }
    }

    public static final int CHOICE_pointName = 0;
    public static final int CHOICE_administrativeAreaCenterName = 1;
    public static final int CHOICE_mountainName = 2;
    public static final int CHOICE_islandName = 3;
    public static final int CHOICE_tollStationName = 4;
    public static final int UNDEFINED_CHOICE = -1;

    private final nds.name.attributes.NameDisplayPointAttributeType type_;
    private java.lang.Object objectChoice;
}