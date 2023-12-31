/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.venue.details.metadata;

public class ParkingFacilityAttributeLayerMetadata implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            content_ = new zserio.runtime.array.DeltaContext();
            parkingFacilityAttributeMetadata_ = new nds.venue.details.instantiations.ParkingFacilityAttributeMetadata.ZserioPackingContext();
            parkingLevelAttributeMetadata_ = new nds.venue.details.instantiations.ParkingLevelAttributeMetadata.ZserioPackingContext();
            parkingSectionAttributeMetadata_ = new nds.venue.details.instantiations.ParkingSectionAttributeMetadata.ZserioPackingContext();
            parkingRowAttributeMetadata_ = new nds.venue.details.instantiations.ParkingRowAttributeMetadata.ZserioPackingContext();
            parkingSpotAttributeMetadata_ = new nds.venue.details.instantiations.ParkingSpotAttributeMetadata.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getContent()
        {
            return content_;
        }

        public nds.venue.details.instantiations.ParkingFacilityAttributeMetadata.ZserioPackingContext getParkingFacilityAttributeMetadata()
        {
            return parkingFacilityAttributeMetadata_;
        }

        public nds.venue.details.instantiations.ParkingLevelAttributeMetadata.ZserioPackingContext getParkingLevelAttributeMetadata()
        {
            return parkingLevelAttributeMetadata_;
        }

        public nds.venue.details.instantiations.ParkingSectionAttributeMetadata.ZserioPackingContext getParkingSectionAttributeMetadata()
        {
            return parkingSectionAttributeMetadata_;
        }

        public nds.venue.details.instantiations.ParkingRowAttributeMetadata.ZserioPackingContext getParkingRowAttributeMetadata()
        {
            return parkingRowAttributeMetadata_;
        }

        public nds.venue.details.instantiations.ParkingSpotAttributeMetadata.ZserioPackingContext getParkingSpotAttributeMetadata()
        {
            return parkingSpotAttributeMetadata_;
        }

        private zserio.runtime.array.DeltaContext content_;
        private nds.venue.details.instantiations.ParkingFacilityAttributeMetadata.ZserioPackingContext parkingFacilityAttributeMetadata_;
        private nds.venue.details.instantiations.ParkingLevelAttributeMetadata.ZserioPackingContext parkingLevelAttributeMetadata_;
        private nds.venue.details.instantiations.ParkingSectionAttributeMetadata.ZserioPackingContext parkingSectionAttributeMetadata_;
        private nds.venue.details.instantiations.ParkingRowAttributeMetadata.ZserioPackingContext parkingRowAttributeMetadata_;
        private nds.venue.details.instantiations.ParkingSpotAttributeMetadata.ZserioPackingContext parkingSpotAttributeMetadata_;
    };

    public ParkingFacilityAttributeLayerMetadata()
    {
    }

    public ParkingFacilityAttributeLayerMetadata(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public ParkingFacilityAttributeLayerMetadata(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public ParkingFacilityAttributeLayerMetadata(
            nds.venue.details.metadata.ParkingFacilityAttributeLayerContent content_,
            nds.venue.details.instantiations.ParkingFacilityAttributeMetadata parkingFacilityAttributeMetadata_,
            nds.venue.details.instantiations.ParkingLevelAttributeMetadata parkingLevelAttributeMetadata_,
            nds.venue.details.instantiations.ParkingSectionAttributeMetadata parkingSectionAttributeMetadata_,
            nds.venue.details.instantiations.ParkingRowAttributeMetadata parkingRowAttributeMetadata_,
            nds.venue.details.instantiations.ParkingSpotAttributeMetadata parkingSpotAttributeMetadata_)
    {
        setContent(content_);
        setParkingFacilityAttributeMetadata(parkingFacilityAttributeMetadata_);
        setParkingLevelAttributeMetadata(parkingLevelAttributeMetadata_);
        setParkingSectionAttributeMetadata(parkingSectionAttributeMetadata_);
        setParkingRowAttributeMetadata(parkingRowAttributeMetadata_);
        setParkingSpotAttributeMetadata(parkingSpotAttributeMetadata_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.initPackingContext(zserioContext.getContent());
        if (isParkingFacilityAttributeMetadataUsed())
        {
            parkingFacilityAttributeMetadata_.initPackingContext(zserioContext.getParkingFacilityAttributeMetadata());
        }
        if (isParkingLevelAttributeMetadataUsed())
        {
            parkingLevelAttributeMetadata_.initPackingContext(zserioContext.getParkingLevelAttributeMetadata());
        }
        if (isParkingSectionAttributeMetadataUsed())
        {
            parkingSectionAttributeMetadata_.initPackingContext(zserioContext.getParkingSectionAttributeMetadata());
        }
        if (isParkingRowAttributeMetadataUsed())
        {
            parkingRowAttributeMetadata_.initPackingContext(zserioContext.getParkingRowAttributeMetadata());
        }
        if (isParkingSpotAttributeMetadataUsed())
        {
            parkingSpotAttributeMetadata_.initPackingContext(zserioContext.getParkingSpotAttributeMetadata());
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

        endBitPosition += content_.bitSizeOf(endBitPosition);
        if (isParkingFacilityAttributeMetadataUsed())
        {
            endBitPosition += parkingFacilityAttributeMetadata_.bitSizeOf(endBitPosition);
        }
        if (isParkingLevelAttributeMetadataUsed())
        {
            endBitPosition += parkingLevelAttributeMetadata_.bitSizeOf(endBitPosition);
        }
        if (isParkingSectionAttributeMetadataUsed())
        {
            endBitPosition += parkingSectionAttributeMetadata_.bitSizeOf(endBitPosition);
        }
        if (isParkingRowAttributeMetadataUsed())
        {
            endBitPosition += parkingRowAttributeMetadata_.bitSizeOf(endBitPosition);
        }
        if (isParkingSpotAttributeMetadataUsed())
        {
            endBitPosition += parkingSpotAttributeMetadata_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += content_.bitSizeOf(zserioContext.getContent(), endBitPosition);
        if (isParkingFacilityAttributeMetadataUsed())
        {
            endBitPosition += parkingFacilityAttributeMetadata_.bitSizeOf(zserioContext.getParkingFacilityAttributeMetadata(), endBitPosition);
        }
        if (isParkingLevelAttributeMetadataUsed())
        {
            endBitPosition += parkingLevelAttributeMetadata_.bitSizeOf(zserioContext.getParkingLevelAttributeMetadata(), endBitPosition);
        }
        if (isParkingSectionAttributeMetadataUsed())
        {
            endBitPosition += parkingSectionAttributeMetadata_.bitSizeOf(zserioContext.getParkingSectionAttributeMetadata(), endBitPosition);
        }
        if (isParkingRowAttributeMetadataUsed())
        {
            endBitPosition += parkingRowAttributeMetadata_.bitSizeOf(zserioContext.getParkingRowAttributeMetadata(), endBitPosition);
        }
        if (isParkingSpotAttributeMetadataUsed())
        {
            endBitPosition += parkingSpotAttributeMetadata_.bitSizeOf(zserioContext.getParkingSpotAttributeMetadata(), endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.venue.details.metadata.ParkingFacilityAttributeLayerContent getContent()
    {
        return content_;
    }

    public void setContent(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent content_)
    {
        this.content_ = content_;
    }

    public nds.venue.details.instantiations.ParkingFacilityAttributeMetadata getParkingFacilityAttributeMetadata()
    {
        return parkingFacilityAttributeMetadata_;
    }

    public void setParkingFacilityAttributeMetadata(nds.venue.details.instantiations.ParkingFacilityAttributeMetadata parkingFacilityAttributeMetadata_)
    {
        this.parkingFacilityAttributeMetadata_ = parkingFacilityAttributeMetadata_;
    }

    public boolean isParkingFacilityAttributeMetadataUsed()
    {
        return ((getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_FACILITY_MAPS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_FACILITY_MAPS) || (getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_FACILITY_SETS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_FACILITY_SETS));
    }

    public boolean isParkingFacilityAttributeMetadataSet()
    {
        return (parkingFacilityAttributeMetadata_ != null);
    }

    public void resetParkingFacilityAttributeMetadata()
    {
        this.parkingFacilityAttributeMetadata_ = null;
    }

    public nds.venue.details.instantiations.ParkingLevelAttributeMetadata getParkingLevelAttributeMetadata()
    {
        return parkingLevelAttributeMetadata_;
    }

    public void setParkingLevelAttributeMetadata(nds.venue.details.instantiations.ParkingLevelAttributeMetadata parkingLevelAttributeMetadata_)
    {
        this.parkingLevelAttributeMetadata_ = parkingLevelAttributeMetadata_;
    }

    public boolean isParkingLevelAttributeMetadataUsed()
    {
        return ((getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_LEVEL_MAPS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_LEVEL_MAPS) || (getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_LEVEL_SETS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_LEVEL_SETS));
    }

    public boolean isParkingLevelAttributeMetadataSet()
    {
        return (parkingLevelAttributeMetadata_ != null);
    }

    public void resetParkingLevelAttributeMetadata()
    {
        this.parkingLevelAttributeMetadata_ = null;
    }

    public nds.venue.details.instantiations.ParkingSectionAttributeMetadata getParkingSectionAttributeMetadata()
    {
        return parkingSectionAttributeMetadata_;
    }

    public void setParkingSectionAttributeMetadata(nds.venue.details.instantiations.ParkingSectionAttributeMetadata parkingSectionAttributeMetadata_)
    {
        this.parkingSectionAttributeMetadata_ = parkingSectionAttributeMetadata_;
    }

    public boolean isParkingSectionAttributeMetadataUsed()
    {
        return ((getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_SECTION_MAPS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_SECTION_MAPS) || (getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_SECTION_SETS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_SECTION_SETS));
    }

    public boolean isParkingSectionAttributeMetadataSet()
    {
        return (parkingSectionAttributeMetadata_ != null);
    }

    public void resetParkingSectionAttributeMetadata()
    {
        this.parkingSectionAttributeMetadata_ = null;
    }

    public nds.venue.details.instantiations.ParkingRowAttributeMetadata getParkingRowAttributeMetadata()
    {
        return parkingRowAttributeMetadata_;
    }

    public void setParkingRowAttributeMetadata(nds.venue.details.instantiations.ParkingRowAttributeMetadata parkingRowAttributeMetadata_)
    {
        this.parkingRowAttributeMetadata_ = parkingRowAttributeMetadata_;
    }

    public boolean isParkingRowAttributeMetadataUsed()
    {
        return ((getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_ROW_MAPS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_ROW_MAPS) || (getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_ROW_SETS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_ROW_SETS));
    }

    public boolean isParkingRowAttributeMetadataSet()
    {
        return (parkingRowAttributeMetadata_ != null);
    }

    public void resetParkingRowAttributeMetadata()
    {
        this.parkingRowAttributeMetadata_ = null;
    }

    public nds.venue.details.instantiations.ParkingSpotAttributeMetadata getParkingSpotAttributeMetadata()
    {
        return parkingSpotAttributeMetadata_;
    }

    public void setParkingSpotAttributeMetadata(nds.venue.details.instantiations.ParkingSpotAttributeMetadata parkingSpotAttributeMetadata_)
    {
        this.parkingSpotAttributeMetadata_ = parkingSpotAttributeMetadata_;
    }

    public boolean isParkingSpotAttributeMetadataUsed()
    {
        return ((getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_SPOT_MAPS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_SPOT_MAPS) || (getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_SPOT_SETS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_SPOT_SETS));
    }

    public boolean isParkingSpotAttributeMetadataSet()
    {
        return (parkingSpotAttributeMetadata_ != null);
    }

    public void resetParkingSpotAttributeMetadata()
    {
        this.parkingSpotAttributeMetadata_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof ParkingFacilityAttributeLayerMetadata)
        {
            final ParkingFacilityAttributeLayerMetadata that = (ParkingFacilityAttributeLayerMetadata)obj;

            return
                    ((content_ == null) ? that.content_ == null : content_.equals(that.content_)) &&
                    ((!isParkingFacilityAttributeMetadataUsed()) ? !that.isParkingFacilityAttributeMetadataUsed() :
                        ((parkingFacilityAttributeMetadata_ == null) ? that.parkingFacilityAttributeMetadata_ == null : parkingFacilityAttributeMetadata_.equals(that.parkingFacilityAttributeMetadata_))) &&
                    ((!isParkingLevelAttributeMetadataUsed()) ? !that.isParkingLevelAttributeMetadataUsed() :
                        ((parkingLevelAttributeMetadata_ == null) ? that.parkingLevelAttributeMetadata_ == null : parkingLevelAttributeMetadata_.equals(that.parkingLevelAttributeMetadata_))) &&
                    ((!isParkingSectionAttributeMetadataUsed()) ? !that.isParkingSectionAttributeMetadataUsed() :
                        ((parkingSectionAttributeMetadata_ == null) ? that.parkingSectionAttributeMetadata_ == null : parkingSectionAttributeMetadata_.equals(that.parkingSectionAttributeMetadata_))) &&
                    ((!isParkingRowAttributeMetadataUsed()) ? !that.isParkingRowAttributeMetadataUsed() :
                        ((parkingRowAttributeMetadata_ == null) ? that.parkingRowAttributeMetadata_ == null : parkingRowAttributeMetadata_.equals(that.parkingRowAttributeMetadata_))) &&
                    ((!isParkingSpotAttributeMetadataUsed()) ? !that.isParkingSpotAttributeMetadataUsed() :
                        ((parkingSpotAttributeMetadata_ == null) ? that.parkingSpotAttributeMetadata_ == null : parkingSpotAttributeMetadata_.equals(that.parkingSpotAttributeMetadata_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, content_);
        if (isParkingFacilityAttributeMetadataUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, parkingFacilityAttributeMetadata_);
        if (isParkingLevelAttributeMetadataUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, parkingLevelAttributeMetadata_);
        if (isParkingSectionAttributeMetadataUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, parkingSectionAttributeMetadata_);
        if (isParkingRowAttributeMetadataUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, parkingRowAttributeMetadata_);
        if (isParkingSpotAttributeMetadataUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, parkingSpotAttributeMetadata_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        content_ = new nds.venue.details.metadata.ParkingFacilityAttributeLayerContent(in);

        if ((getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_FACILITY_MAPS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_FACILITY_MAPS) || (getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_FACILITY_SETS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_FACILITY_SETS))
        {
            parkingFacilityAttributeMetadata_ = new nds.venue.details.instantiations.ParkingFacilityAttributeMetadata(in);
        }

        if ((getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_LEVEL_MAPS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_LEVEL_MAPS) || (getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_LEVEL_SETS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_LEVEL_SETS))
        {
            parkingLevelAttributeMetadata_ = new nds.venue.details.instantiations.ParkingLevelAttributeMetadata(in);
        }

        if ((getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_SECTION_MAPS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_SECTION_MAPS) || (getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_SECTION_SETS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_SECTION_SETS))
        {
            parkingSectionAttributeMetadata_ = new nds.venue.details.instantiations.ParkingSectionAttributeMetadata(in);
        }

        if ((getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_ROW_MAPS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_ROW_MAPS) || (getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_ROW_SETS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_ROW_SETS))
        {
            parkingRowAttributeMetadata_ = new nds.venue.details.instantiations.ParkingRowAttributeMetadata(in);
        }

        if ((getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_SPOT_MAPS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_SPOT_MAPS) || (getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_SPOT_SETS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_SPOT_SETS))
        {
            parkingSpotAttributeMetadata_ = new nds.venue.details.instantiations.ParkingSpotAttributeMetadata(in);
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_ = new nds.venue.details.metadata.ParkingFacilityAttributeLayerContent(zserioContext.getContent(), in);

        if ((getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_FACILITY_MAPS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_FACILITY_MAPS) || (getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_FACILITY_SETS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_FACILITY_SETS))
        {
            parkingFacilityAttributeMetadata_ = new nds.venue.details.instantiations.ParkingFacilityAttributeMetadata(zserioContext.getParkingFacilityAttributeMetadata(), in);
        }

        if ((getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_LEVEL_MAPS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_LEVEL_MAPS) || (getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_LEVEL_SETS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_LEVEL_SETS))
        {
            parkingLevelAttributeMetadata_ = new nds.venue.details.instantiations.ParkingLevelAttributeMetadata(zserioContext.getParkingLevelAttributeMetadata(), in);
        }

        if ((getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_SECTION_MAPS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_SECTION_MAPS) || (getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_SECTION_SETS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_SECTION_SETS))
        {
            parkingSectionAttributeMetadata_ = new nds.venue.details.instantiations.ParkingSectionAttributeMetadata(zserioContext.getParkingSectionAttributeMetadata(), in);
        }

        if ((getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_ROW_MAPS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_ROW_MAPS) || (getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_ROW_SETS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_ROW_SETS))
        {
            parkingRowAttributeMetadata_ = new nds.venue.details.instantiations.ParkingRowAttributeMetadata(zserioContext.getParkingRowAttributeMetadata(), in);
        }

        if ((getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_SPOT_MAPS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_SPOT_MAPS) || (getContent().and(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_SPOT_SETS)).equals(nds.venue.details.metadata.ParkingFacilityAttributeLayerContent.Values.PARKING_SPOT_SETS))
        {
            parkingSpotAttributeMetadata_ = new nds.venue.details.instantiations.ParkingSpotAttributeMetadata(zserioContext.getParkingSpotAttributeMetadata(), in);
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

        endBitPosition += content_.bitSizeOf(endBitPosition);
        if (isParkingFacilityAttributeMetadataUsed())
        {
            endBitPosition = parkingFacilityAttributeMetadata_.initializeOffsets(endBitPosition);
        }
        if (isParkingLevelAttributeMetadataUsed())
        {
            endBitPosition = parkingLevelAttributeMetadata_.initializeOffsets(endBitPosition);
        }
        if (isParkingSectionAttributeMetadataUsed())
        {
            endBitPosition = parkingSectionAttributeMetadata_.initializeOffsets(endBitPosition);
        }
        if (isParkingRowAttributeMetadataUsed())
        {
            endBitPosition = parkingRowAttributeMetadata_.initializeOffsets(endBitPosition);
        }
        if (isParkingSpotAttributeMetadataUsed())
        {
            endBitPosition = parkingSpotAttributeMetadata_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = content_.initializeOffsets(zserioContext.getContent(), endBitPosition);
        if (isParkingFacilityAttributeMetadataUsed())
        {
            endBitPosition = parkingFacilityAttributeMetadata_.initializeOffsets(zserioContext.getParkingFacilityAttributeMetadata(), endBitPosition);
        }
        if (isParkingLevelAttributeMetadataUsed())
        {
            endBitPosition = parkingLevelAttributeMetadata_.initializeOffsets(zserioContext.getParkingLevelAttributeMetadata(), endBitPosition);
        }
        if (isParkingSectionAttributeMetadataUsed())
        {
            endBitPosition = parkingSectionAttributeMetadata_.initializeOffsets(zserioContext.getParkingSectionAttributeMetadata(), endBitPosition);
        }
        if (isParkingRowAttributeMetadataUsed())
        {
            endBitPosition = parkingRowAttributeMetadata_.initializeOffsets(zserioContext.getParkingRowAttributeMetadata(), endBitPosition);
        }
        if (isParkingSpotAttributeMetadataUsed())
        {
            endBitPosition = parkingSpotAttributeMetadata_.initializeOffsets(zserioContext.getParkingSpotAttributeMetadata(), endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        content_.write(out);

        if (isParkingFacilityAttributeMetadataUsed())
        {
            parkingFacilityAttributeMetadata_.write(out);
        }

        if (isParkingLevelAttributeMetadataUsed())
        {
            parkingLevelAttributeMetadata_.write(out);
        }

        if (isParkingSectionAttributeMetadataUsed())
        {
            parkingSectionAttributeMetadata_.write(out);
        }

        if (isParkingRowAttributeMetadataUsed())
        {
            parkingRowAttributeMetadata_.write(out);
        }

        if (isParkingSpotAttributeMetadataUsed())
        {
            parkingSpotAttributeMetadata_.write(out);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.write(zserioContext.getContent(), out);

        if (isParkingFacilityAttributeMetadataUsed())
        {
            parkingFacilityAttributeMetadata_.write(zserioContext.getParkingFacilityAttributeMetadata(), out);
        }

        if (isParkingLevelAttributeMetadataUsed())
        {
            parkingLevelAttributeMetadata_.write(zserioContext.getParkingLevelAttributeMetadata(), out);
        }

        if (isParkingSectionAttributeMetadataUsed())
        {
            parkingSectionAttributeMetadata_.write(zserioContext.getParkingSectionAttributeMetadata(), out);
        }

        if (isParkingRowAttributeMetadataUsed())
        {
            parkingRowAttributeMetadata_.write(zserioContext.getParkingRowAttributeMetadata(), out);
        }

        if (isParkingSpotAttributeMetadataUsed())
        {
            parkingSpotAttributeMetadata_.write(zserioContext.getParkingSpotAttributeMetadata(), out);
        }
    }

    private nds.venue.details.metadata.ParkingFacilityAttributeLayerContent content_;
    private nds.venue.details.instantiations.ParkingFacilityAttributeMetadata parkingFacilityAttributeMetadata_;
    private nds.venue.details.instantiations.ParkingLevelAttributeMetadata parkingLevelAttributeMetadata_;
    private nds.venue.details.instantiations.ParkingSectionAttributeMetadata parkingSectionAttributeMetadata_;
    private nds.venue.details.instantiations.ParkingRowAttributeMetadata parkingRowAttributeMetadata_;
    private nds.venue.details.instantiations.ParkingSpotAttributeMetadata parkingSpotAttributeMetadata_;
}
