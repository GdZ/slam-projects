/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.name.attributes;

public class NameDisplayLineRangeAttributeValue implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            administrativeHierarchy_ = new nds.name.types.AdministrativeHierarchy.ZserioPackingContext();
        }

        public nds.name.types.AdministrativeHierarchy.ZserioPackingContext getAdministrativeHierarchy()
        {
            return administrativeHierarchy_;
        }

        private nds.name.types.AdministrativeHierarchy.ZserioPackingContext administrativeHierarchy_;
    };

    public NameDisplayLineRangeAttributeValue(
            nds.name.attributes.NameDisplayLineRangeAttributeType type_)
    {
        this.type_ = type_;
    }

    public NameDisplayLineRangeAttributeValue(zserio.runtime.io.BitStreamReader in,
            nds.name.attributes.NameDisplayLineRangeAttributeType type_)
            throws java.io.IOException
    {
        this.type_ = type_;

        read(in);
    }

    public NameDisplayLineRangeAttributeValue(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            nds.name.attributes.NameDisplayLineRangeAttributeType type_)
            throws java.io.IOException
    {
        this.type_ = type_;

        read(context, in);
    }

    public int choiceTag()
    {
        switch (getType())
        {
        case ROAD_NAME:
            return CHOICE_roadName;
        case BRIDGE_NAME:
            return CHOICE_bridgeName;
        case TUNNEL_NAME:
            return CHOICE_tunnelName;
        case ROUTE_NAME:
            return CHOICE_routeName;
        case ROAD_NUMBER:
            return CHOICE_roadNumber;
        case ADMINISTRATIVE_HIERARCHY:
            return CHOICE_administrativeHierarchy;
        case LINE_LABEL_NAME:
            return CHOICE_labelName;
        case WATER_NAME:
            return CHOICE_waterName;
        case PUBLIC_TRANSPORT_NAME:
            return CHOICE_publicTransportName;
        case BORDER_NAME:
            return CHOICE_borderName;
        case SERVICE_AREA_NAME:
            return CHOICE_serviceAreaName;
        case INTERSECTION_NAME:
            return CHOICE_intersectionName;
        default:
            return UNDEFINED_CHOICE;
        }
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        switch (getType())
        {
        case ROAD_NAME:
            break;
        case BRIDGE_NAME:
            break;
        case TUNNEL_NAME:
            break;
        case ROUTE_NAME:
            break;
        case ROAD_NUMBER:
            break;
        case ADMINISTRATIVE_HIERARCHY:
            getAdministrativeHierarchy().initPackingContext(zserioContext.getAdministrativeHierarchy());
            break;
        case LINE_LABEL_NAME:
            break;
        case WATER_NAME:
            break;
        case PUBLIC_TRANSPORT_NAME:
            break;
        case BORDER_NAME:
            break;
        case SERVICE_AREA_NAME:
            break;
        case INTERSECTION_NAME:
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice NameDisplayLineRangeAttributeValue: " + getType() + "!");
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
        case ROAD_NAME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getRoadName());
            break;
        case BRIDGE_NAME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getBridgeName());
            break;
        case TUNNEL_NAME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getTunnelName());
            break;
        case ROUTE_NAME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getRouteName());
            break;
        case ROAD_NUMBER:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getRoadNumber());
            break;
        case ADMINISTRATIVE_HIERARCHY:
            endBitPosition += getAdministrativeHierarchy().bitSizeOf(endBitPosition);
            break;
        case LINE_LABEL_NAME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getLabelName());
            break;
        case WATER_NAME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getWaterName());
            break;
        case PUBLIC_TRANSPORT_NAME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getPublicTransportName());
            break;
        case BORDER_NAME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getBorderName());
            break;
        case SERVICE_AREA_NAME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getServiceAreaName());
            break;
        case INTERSECTION_NAME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getIntersectionName());
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice NameDisplayLineRangeAttributeValue: " + getType() + "!");
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        switch (getType())
        {
        case ROAD_NAME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getRoadName());
            break;
        case BRIDGE_NAME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getBridgeName());
            break;
        case TUNNEL_NAME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getTunnelName());
            break;
        case ROUTE_NAME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getRouteName());
            break;
        case ROAD_NUMBER:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getRoadNumber());
            break;
        case ADMINISTRATIVE_HIERARCHY:
            endBitPosition += getAdministrativeHierarchy().bitSizeOf(zserioContext.getAdministrativeHierarchy(), endBitPosition);
            break;
        case LINE_LABEL_NAME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getLabelName());
            break;
        case WATER_NAME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getWaterName());
            break;
        case PUBLIC_TRANSPORT_NAME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getPublicTransportName());
            break;
        case BORDER_NAME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getBorderName());
            break;
        case SERVICE_AREA_NAME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getServiceAreaName());
            break;
        case INTERSECTION_NAME:
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getIntersectionName());
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice NameDisplayLineRangeAttributeValue: " + getType() + "!");
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.name.attributes.NameDisplayLineRangeAttributeType getType()
    {
        return this.type_;
    }

    public java.lang.String getRoadName()
    {
        return (java.lang.String)objectChoice;
    }

    public void setRoadName(java.lang.String roadName_)
    {
        objectChoice = roadName_;
    }

    public java.lang.String getBridgeName()
    {
        return (java.lang.String)objectChoice;
    }

    public void setBridgeName(java.lang.String bridgeName_)
    {
        objectChoice = bridgeName_;
    }

    public java.lang.String getTunnelName()
    {
        return (java.lang.String)objectChoice;
    }

    public void setTunnelName(java.lang.String tunnelName_)
    {
        objectChoice = tunnelName_;
    }

    public java.lang.String getRouteName()
    {
        return (java.lang.String)objectChoice;
    }

    public void setRouteName(java.lang.String routeName_)
    {
        objectChoice = routeName_;
    }

    public java.lang.String getRoadNumber()
    {
        return (java.lang.String)objectChoice;
    }

    public void setRoadNumber(java.lang.String roadNumber_)
    {
        objectChoice = roadNumber_;
    }

    public nds.name.types.AdministrativeHierarchy getAdministrativeHierarchy()
    {
        return (nds.name.types.AdministrativeHierarchy)objectChoice;
    }

    public void setAdministrativeHierarchy(nds.name.types.AdministrativeHierarchy administrativeHierarchy_)
    {
        objectChoice = administrativeHierarchy_;
    }

    public java.lang.String getLabelName()
    {
        return (java.lang.String)objectChoice;
    }

    public void setLabelName(java.lang.String labelName_)
    {
        objectChoice = labelName_;
    }

    public java.lang.String getWaterName()
    {
        return (java.lang.String)objectChoice;
    }

    public void setWaterName(java.lang.String waterName_)
    {
        objectChoice = waterName_;
    }

    public java.lang.String getPublicTransportName()
    {
        return (java.lang.String)objectChoice;
    }

    public void setPublicTransportName(java.lang.String publicTransportName_)
    {
        objectChoice = publicTransportName_;
    }

    public java.lang.String getBorderName()
    {
        return (java.lang.String)objectChoice;
    }

    public void setBorderName(java.lang.String borderName_)
    {
        objectChoice = borderName_;
    }

    public java.lang.String getServiceAreaName()
    {
        return (java.lang.String)objectChoice;
    }

    public void setServiceAreaName(java.lang.String serviceAreaName_)
    {
        objectChoice = serviceAreaName_;
    }

    public java.lang.String getIntersectionName()
    {
        return (java.lang.String)objectChoice;
    }

    public void setIntersectionName(java.lang.String intersectionName_)
    {
        objectChoice = intersectionName_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof NameDisplayLineRangeAttributeValue)
        {
            final NameDisplayLineRangeAttributeValue that = (NameDisplayLineRangeAttributeValue)obj;

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
            case ROAD_NAME:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.String)objectChoice);
                break;
            case BRIDGE_NAME:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.String)objectChoice);
                break;
            case TUNNEL_NAME:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.String)objectChoice);
                break;
            case ROUTE_NAME:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.String)objectChoice);
                break;
            case ROAD_NUMBER:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.String)objectChoice);
                break;
            case ADMINISTRATIVE_HIERARCHY:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (nds.name.types.AdministrativeHierarchy)objectChoice);
                break;
            case LINE_LABEL_NAME:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.String)objectChoice);
                break;
            case WATER_NAME:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.String)objectChoice);
                break;
            case PUBLIC_TRANSPORT_NAME:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.String)objectChoice);
                break;
            case BORDER_NAME:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.String)objectChoice);
                break;
            case SERVICE_AREA_NAME:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (java.lang.String)objectChoice);
                break;
            case INTERSECTION_NAME:
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
        case ROAD_NAME:
            objectChoice = in.readString();
            break;
        case BRIDGE_NAME:
            objectChoice = in.readString();
            break;
        case TUNNEL_NAME:
            objectChoice = in.readString();
            break;
        case ROUTE_NAME:
            objectChoice = in.readString();
            break;
        case ROAD_NUMBER:
            objectChoice = in.readString();
            break;
        case ADMINISTRATIVE_HIERARCHY:
            objectChoice = new nds.name.types.AdministrativeHierarchy(in);
            break;
        case LINE_LABEL_NAME:
            objectChoice = in.readString();
            break;
        case WATER_NAME:
            objectChoice = in.readString();
            break;
        case PUBLIC_TRANSPORT_NAME:
            objectChoice = in.readString();
            break;
        case BORDER_NAME:
            objectChoice = in.readString();
            break;
        case SERVICE_AREA_NAME:
            objectChoice = in.readString();
            break;
        case INTERSECTION_NAME:
            objectChoice = in.readString();
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice NameDisplayLineRangeAttributeValue: " + getType() + "!");
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        switch (getType())
        {
        case ROAD_NAME:
            objectChoice = in.readString();
            break;
        case BRIDGE_NAME:
            objectChoice = in.readString();
            break;
        case TUNNEL_NAME:
            objectChoice = in.readString();
            break;
        case ROUTE_NAME:
            objectChoice = in.readString();
            break;
        case ROAD_NUMBER:
            objectChoice = in.readString();
            break;
        case ADMINISTRATIVE_HIERARCHY:
            objectChoice = new nds.name.types.AdministrativeHierarchy(zserioContext.getAdministrativeHierarchy(), in);
            break;
        case LINE_LABEL_NAME:
            objectChoice = in.readString();
            break;
        case WATER_NAME:
            objectChoice = in.readString();
            break;
        case PUBLIC_TRANSPORT_NAME:
            objectChoice = in.readString();
            break;
        case BORDER_NAME:
            objectChoice = in.readString();
            break;
        case SERVICE_AREA_NAME:
            objectChoice = in.readString();
            break;
        case INTERSECTION_NAME:
            objectChoice = in.readString();
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice NameDisplayLineRangeAttributeValue: " + getType() + "!");
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
        case ROAD_NAME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getRoadName());
            }
            break;
        case BRIDGE_NAME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getBridgeName());
            }
            break;
        case TUNNEL_NAME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getTunnelName());
            }
            break;
        case ROUTE_NAME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getRouteName());
            }
            break;
        case ROAD_NUMBER:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getRoadNumber());
            }
            break;
        case ADMINISTRATIVE_HIERARCHY:
            {
                endBitPosition = getAdministrativeHierarchy().initializeOffsets(endBitPosition);
            }
            break;
        case LINE_LABEL_NAME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getLabelName());
            }
            break;
        case WATER_NAME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getWaterName());
            }
            break;
        case PUBLIC_TRANSPORT_NAME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getPublicTransportName());
            }
            break;
        case BORDER_NAME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getBorderName());
            }
            break;
        case SERVICE_AREA_NAME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getServiceAreaName());
            }
            break;
        case INTERSECTION_NAME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getIntersectionName());
            }
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice NameDisplayLineRangeAttributeValue: " + getType() + "!");
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        switch (getType())
        {
        case ROAD_NAME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getRoadName());
            }
            break;
        case BRIDGE_NAME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getBridgeName());
            }
            break;
        case TUNNEL_NAME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getTunnelName());
            }
            break;
        case ROUTE_NAME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getRouteName());
            }
            break;
        case ROAD_NUMBER:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getRoadNumber());
            }
            break;
        case ADMINISTRATIVE_HIERARCHY:
            {
                endBitPosition = getAdministrativeHierarchy().initializeOffsets(zserioContext.getAdministrativeHierarchy(), endBitPosition);
            }
            break;
        case LINE_LABEL_NAME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getLabelName());
            }
            break;
        case WATER_NAME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getWaterName());
            }
            break;
        case PUBLIC_TRANSPORT_NAME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getPublicTransportName());
            }
            break;
        case BORDER_NAME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getBorderName());
            }
            break;
        case SERVICE_AREA_NAME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getServiceAreaName());
            }
            break;
        case INTERSECTION_NAME:
            {
                endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(getIntersectionName());
            }
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice NameDisplayLineRangeAttributeValue: " + getType() + "!");
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        switch (getType())
        {
        case ROAD_NAME:
            out.writeString(getRoadName());
            break;
        case BRIDGE_NAME:
            out.writeString(getBridgeName());
            break;
        case TUNNEL_NAME:
            out.writeString(getTunnelName());
            break;
        case ROUTE_NAME:
            out.writeString(getRouteName());
            break;
        case ROAD_NUMBER:
            out.writeString(getRoadNumber());
            break;
        case ADMINISTRATIVE_HIERARCHY:
            getAdministrativeHierarchy().write(out);
            break;
        case LINE_LABEL_NAME:
            out.writeString(getLabelName());
            break;
        case WATER_NAME:
            out.writeString(getWaterName());
            break;
        case PUBLIC_TRANSPORT_NAME:
            out.writeString(getPublicTransportName());
            break;
        case BORDER_NAME:
            out.writeString(getBorderName());
            break;
        case SERVICE_AREA_NAME:
            out.writeString(getServiceAreaName());
            break;
        case INTERSECTION_NAME:
            out.writeString(getIntersectionName());
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice NameDisplayLineRangeAttributeValue: " + getType() + "!");
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        switch (getType())
        {
        case ROAD_NAME:
            out.writeString(getRoadName());
            break;
        case BRIDGE_NAME:
            out.writeString(getBridgeName());
            break;
        case TUNNEL_NAME:
            out.writeString(getTunnelName());
            break;
        case ROUTE_NAME:
            out.writeString(getRouteName());
            break;
        case ROAD_NUMBER:
            out.writeString(getRoadNumber());
            break;
        case ADMINISTRATIVE_HIERARCHY:
            getAdministrativeHierarchy().write(zserioContext.getAdministrativeHierarchy(), out);
            break;
        case LINE_LABEL_NAME:
            out.writeString(getLabelName());
            break;
        case WATER_NAME:
            out.writeString(getWaterName());
            break;
        case PUBLIC_TRANSPORT_NAME:
            out.writeString(getPublicTransportName());
            break;
        case BORDER_NAME:
            out.writeString(getBorderName());
            break;
        case SERVICE_AREA_NAME:
            out.writeString(getServiceAreaName());
            break;
        case INTERSECTION_NAME:
            out.writeString(getIntersectionName());
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice NameDisplayLineRangeAttributeValue: " + getType() + "!");
        }
    }

    public static final int CHOICE_roadName = 0;
    public static final int CHOICE_bridgeName = 1;
    public static final int CHOICE_tunnelName = 2;
    public static final int CHOICE_routeName = 3;
    public static final int CHOICE_roadNumber = 4;
    public static final int CHOICE_administrativeHierarchy = 5;
    public static final int CHOICE_labelName = 6;
    public static final int CHOICE_waterName = 7;
    public static final int CHOICE_publicTransportName = 8;
    public static final int CHOICE_borderName = 9;
    public static final int CHOICE_serviceAreaName = 10;
    public static final int CHOICE_intersectionName = 11;
    public static final int UNDEFINED_CHOICE = -1;

    private final nds.name.attributes.NameDisplayLineRangeAttributeType type_;
    private java.lang.Object objectChoice;
}
