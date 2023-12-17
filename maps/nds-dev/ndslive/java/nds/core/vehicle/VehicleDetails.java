/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.vehicle;

public class VehicleDetails implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            vehicleType_ = new nds.core.vehicle.VehicleTypeInformation.ZserioPackingContext();
            vehicleClassSpecification_ = new nds.core.vehicle.VehicleClassSpecification.ZserioPackingContext();
            tunnelRestriction_ = new zserio.runtime.array.DeltaContext();
            maxSpeed_ = new zserio.runtime.array.DeltaContext();
            combustionConsumption_ = new nds.core.vehicle.CombustionConsumption.ZserioPackingContext();
            electricConsumption_ = new nds.core.vehicle.ElectricConsumption.ZserioPackingContext();
            engineManufacturingYear_ = new zserio.runtime.array.DeltaContext();
            currentOccupancy_ = new zserio.runtime.array.DeltaContext();
        }

        public nds.core.vehicle.VehicleTypeInformation.ZserioPackingContext getVehicleType()
        {
            return vehicleType_;
        }

        public nds.core.vehicle.VehicleClassSpecification.ZserioPackingContext getVehicleClassSpecification()
        {
            return vehicleClassSpecification_;
        }

        public zserio.runtime.array.DeltaContext getTunnelRestriction()
        {
            return tunnelRestriction_;
        }

        public zserio.runtime.array.DeltaContext getMaxSpeed()
        {
            return maxSpeed_;
        }

        public nds.core.vehicle.CombustionConsumption.ZserioPackingContext getCombustionConsumption()
        {
            return combustionConsumption_;
        }

        public nds.core.vehicle.ElectricConsumption.ZserioPackingContext getElectricConsumption()
        {
            return electricConsumption_;
        }

        public zserio.runtime.array.DeltaContext getEngineManufacturingYear()
        {
            return engineManufacturingYear_;
        }

        public zserio.runtime.array.DeltaContext getCurrentOccupancy()
        {
            return currentOccupancy_;
        }

        private nds.core.vehicle.VehicleTypeInformation.ZserioPackingContext vehicleType_;
        private nds.core.vehicle.VehicleClassSpecification.ZserioPackingContext vehicleClassSpecification_;
        private zserio.runtime.array.DeltaContext tunnelRestriction_;
        private zserio.runtime.array.DeltaContext maxSpeed_;
        private nds.core.vehicle.CombustionConsumption.ZserioPackingContext combustionConsumption_;
        private nds.core.vehicle.ElectricConsumption.ZserioPackingContext electricConsumption_;
        private zserio.runtime.array.DeltaContext engineManufacturingYear_;
        private zserio.runtime.array.DeltaContext currentOccupancy_;
    };

    public VehicleDetails()
    {
    }

    public VehicleDetails(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public VehicleDetails(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public VehicleDetails(
            nds.core.vehicle.VehicleTypeInformation vehicleType_,
            nds.core.vehicle.VehicleClassSpecification vehicleClassSpecification_,
            nds.core.vehicle.AdrTunnelRestriction tunnelRestriction_,
            short maxSpeed_,
            nds.core.vehicle.CombustionConsumption combustionConsumption_,
            nds.core.vehicle.ElectricConsumption electricConsumption_,
            java.lang.Short engineManufacturingYear_,
            java.lang.String licensePlate_,
            java.lang.String registrationCountry_,
            java.lang.Short currentOccupancy_)
    {
        setVehicleType(vehicleType_);
        setVehicleClassSpecification(vehicleClassSpecification_);
        setTunnelRestriction(tunnelRestriction_);
        setMaxSpeed(maxSpeed_);
        setCombustionConsumption(combustionConsumption_);
        setElectricConsumption(electricConsumption_);
        setEngineManufacturingYear(engineManufacturingYear_);
        setLicensePlate(licensePlate_);
        setRegistrationCountry(registrationCountry_);
        setCurrentOccupancy(currentOccupancy_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        vehicleType_.initPackingContext(zserioContext.getVehicleType());
        vehicleClassSpecification_.initPackingContext(zserioContext.getVehicleClassSpecification());
        tunnelRestriction_.initPackingContext(zserioContext.getTunnelRestriction());
        zserioContext.getMaxSpeed().init(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(maxSpeed_));
        if (isCombustionConsumptionUsed())
        {
            combustionConsumption_.initPackingContext(zserioContext.getCombustionConsumption());
        }
        if (isElectricConsumptionUsed())
        {
            electricConsumption_.initPackingContext(zserioContext.getElectricConsumption());
        }
        if (isEngineManufacturingYearUsed())
        {
            zserioContext.getEngineManufacturingYear().init(new zserio.runtime.array.ArrayTraits.SignedBitFieldShortArrayTraits((int)(16)),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(engineManufacturingYear_));
        }
        if (isCurrentOccupancyUsed())
        {
            zserioContext.getCurrentOccupancy().init(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(currentOccupancy_));
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

        endBitPosition += vehicleType_.bitSizeOf(endBitPosition);
        endBitPosition += vehicleClassSpecification_.bitSizeOf(endBitPosition);
        endBitPosition += tunnelRestriction_.bitSizeOf(endBitPosition);
        endBitPosition += 8;
        endBitPosition += 1;
        if (isCombustionConsumptionUsed())
        {
            endBitPosition += combustionConsumption_.bitSizeOf(endBitPosition);
        }
        endBitPosition += 1;
        if (isElectricConsumptionUsed())
        {
            endBitPosition += electricConsumption_.bitSizeOf(endBitPosition);
        }
        endBitPosition += 1;
        if (isEngineManufacturingYearUsed())
        {
            endBitPosition += 16;
        }
        endBitPosition += 1;
        if (isLicensePlateUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(licensePlate_);
        }
        endBitPosition += 1;
        if (isRegistrationCountryUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(registrationCountry_);
        }
        endBitPosition += 1;
        if (isCurrentOccupancyUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(currentOccupancy_);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += vehicleType_.bitSizeOf(zserioContext.getVehicleType(), endBitPosition);
        endBitPosition += vehicleClassSpecification_.bitSizeOf(zserioContext.getVehicleClassSpecification(), endBitPosition);
        endBitPosition += tunnelRestriction_.bitSizeOf(zserioContext.getTunnelRestriction(), endBitPosition);
        endBitPosition += zserioContext.getMaxSpeed().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(maxSpeed_));
        endBitPosition += 1;
        if (isCombustionConsumptionUsed())
        {
            endBitPosition += combustionConsumption_.bitSizeOf(zserioContext.getCombustionConsumption(), endBitPosition);
        }
        endBitPosition += 1;
        if (isElectricConsumptionUsed())
        {
            endBitPosition += electricConsumption_.bitSizeOf(zserioContext.getElectricConsumption(), endBitPosition);
        }
        endBitPosition += 1;
        if (isEngineManufacturingYearUsed())
        {
            endBitPosition += zserioContext.getEngineManufacturingYear().bitSizeOf(new zserio.runtime.array.ArrayTraits.SignedBitFieldShortArrayTraits((int)(16)),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(engineManufacturingYear_));
        }
        endBitPosition += 1;
        if (isLicensePlateUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(licensePlate_);
        }
        endBitPosition += 1;
        if (isRegistrationCountryUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(registrationCountry_);
        }
        endBitPosition += 1;
        if (isCurrentOccupancyUsed())
        {
            endBitPosition += zserioContext.getCurrentOccupancy().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(currentOccupancy_));
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.vehicle.VehicleTypeInformation getVehicleType()
    {
        return vehicleType_;
    }

    public void setVehicleType(nds.core.vehicle.VehicleTypeInformation vehicleType_)
    {
        this.vehicleType_ = vehicleType_;
    }

    public nds.core.vehicle.VehicleClassSpecification getVehicleClassSpecification()
    {
        return vehicleClassSpecification_;
    }

    public void setVehicleClassSpecification(nds.core.vehicle.VehicleClassSpecification vehicleClassSpecification_)
    {
        this.vehicleClassSpecification_ = vehicleClassSpecification_;
    }

    public nds.core.vehicle.AdrTunnelRestriction getTunnelRestriction()
    {
        return tunnelRestriction_;
    }

    public void setTunnelRestriction(nds.core.vehicle.AdrTunnelRestriction tunnelRestriction_)
    {
        this.tunnelRestriction_ = tunnelRestriction_;
    }

    public short getMaxSpeed()
    {
        return maxSpeed_;
    }

    public void setMaxSpeed(short maxSpeed_)
    {
        this.maxSpeed_ = maxSpeed_;
    }

    public nds.core.vehicle.CombustionConsumption getCombustionConsumption()
    {
        return combustionConsumption_;
    }

    public void setCombustionConsumption(nds.core.vehicle.CombustionConsumption combustionConsumption_)
    {
        this.combustionConsumption_ = combustionConsumption_;
    }

    public boolean isCombustionConsumptionUsed()
    {
        return isCombustionConsumptionSet();
    }

    public boolean isCombustionConsumptionSet()
    {
        return (combustionConsumption_ != null);
    }

    public void resetCombustionConsumption()
    {
        this.combustionConsumption_ = null;
    }

    public nds.core.vehicle.ElectricConsumption getElectricConsumption()
    {
        return electricConsumption_;
    }

    public void setElectricConsumption(nds.core.vehicle.ElectricConsumption electricConsumption_)
    {
        this.electricConsumption_ = electricConsumption_;
    }

    public boolean isElectricConsumptionUsed()
    {
        return isElectricConsumptionSet();
    }

    public boolean isElectricConsumptionSet()
    {
        return (electricConsumption_ != null);
    }

    public void resetElectricConsumption()
    {
        this.electricConsumption_ = null;
    }

    public java.lang.Short getEngineManufacturingYear()
    {
        return engineManufacturingYear_;
    }

    public void setEngineManufacturingYear(java.lang.Short engineManufacturingYear_)
    {
        this.engineManufacturingYear_ = engineManufacturingYear_;
    }

    public boolean isEngineManufacturingYearUsed()
    {
        return isEngineManufacturingYearSet();
    }

    public boolean isEngineManufacturingYearSet()
    {
        return (engineManufacturingYear_ != null);
    }

    public void resetEngineManufacturingYear()
    {
        this.engineManufacturingYear_ = null;
    }

    public java.lang.String getLicensePlate()
    {
        return licensePlate_;
    }

    public void setLicensePlate(java.lang.String licensePlate_)
    {
        this.licensePlate_ = licensePlate_;
    }

    public boolean isLicensePlateUsed()
    {
        return isLicensePlateSet();
    }

    public boolean isLicensePlateSet()
    {
        return (licensePlate_ != null);
    }

    public void resetLicensePlate()
    {
        this.licensePlate_ = null;
    }

    public java.lang.String getRegistrationCountry()
    {
        return registrationCountry_;
    }

    public void setRegistrationCountry(java.lang.String registrationCountry_)
    {
        this.registrationCountry_ = registrationCountry_;
    }

    public boolean isRegistrationCountryUsed()
    {
        return isRegistrationCountrySet();
    }

    public boolean isRegistrationCountrySet()
    {
        return (registrationCountry_ != null);
    }

    public void resetRegistrationCountry()
    {
        this.registrationCountry_ = null;
    }

    public java.lang.Short getCurrentOccupancy()
    {
        return currentOccupancy_;
    }

    public void setCurrentOccupancy(java.lang.Short currentOccupancy_)
    {
        this.currentOccupancy_ = currentOccupancy_;
    }

    public boolean isCurrentOccupancyUsed()
    {
        return isCurrentOccupancySet();
    }

    public boolean isCurrentOccupancySet()
    {
        return (currentOccupancy_ != null);
    }

    public void resetCurrentOccupancy()
    {
        this.currentOccupancy_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof VehicleDetails)
        {
            final VehicleDetails that = (VehicleDetails)obj;

            return
                    ((vehicleType_ == null) ? that.vehicleType_ == null : vehicleType_.equals(that.vehicleType_)) &&
                    ((vehicleClassSpecification_ == null) ? that.vehicleClassSpecification_ == null : vehicleClassSpecification_.equals(that.vehicleClassSpecification_)) &&
                    ((tunnelRestriction_ == null) ? that.tunnelRestriction_ == null : tunnelRestriction_.getValue() == that.tunnelRestriction_.getValue()) &&
                    maxSpeed_ == that.maxSpeed_ &&
                    ((!isCombustionConsumptionUsed()) ? !that.isCombustionConsumptionUsed() :
                        ((combustionConsumption_ == null) ? that.combustionConsumption_ == null : combustionConsumption_.equals(that.combustionConsumption_))) &&
                    ((!isElectricConsumptionUsed()) ? !that.isElectricConsumptionUsed() :
                        ((electricConsumption_ == null) ? that.electricConsumption_ == null : electricConsumption_.equals(that.electricConsumption_))) &&
                    ((!isEngineManufacturingYearUsed()) ? !that.isEngineManufacturingYearUsed() :
                        ((engineManufacturingYear_ == null) ? that.engineManufacturingYear_ == null : engineManufacturingYear_.equals(that.engineManufacturingYear_))) &&
                    ((!isLicensePlateUsed()) ? !that.isLicensePlateUsed() :
                        ((licensePlate_ == null) ? that.licensePlate_ == null : licensePlate_.equals(that.licensePlate_))) &&
                    ((!isRegistrationCountryUsed()) ? !that.isRegistrationCountryUsed() :
                        ((registrationCountry_ == null) ? that.registrationCountry_ == null : registrationCountry_.equals(that.registrationCountry_))) &&
                    ((!isCurrentOccupancyUsed()) ? !that.isCurrentOccupancyUsed() :
                        ((currentOccupancy_ == null) ? that.currentOccupancy_ == null : currentOccupancy_.equals(that.currentOccupancy_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, vehicleType_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, vehicleClassSpecification_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, tunnelRestriction_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, maxSpeed_);
        if (isCombustionConsumptionUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, combustionConsumption_);
        if (isElectricConsumptionUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, electricConsumption_);
        if (isEngineManufacturingYearUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, engineManufacturingYear_);
        if (isLicensePlateUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, licensePlate_);
        if (isRegistrationCountryUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, registrationCountry_);
        if (isCurrentOccupancyUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, currentOccupancy_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        vehicleType_ = new nds.core.vehicle.VehicleTypeInformation(in);

        vehicleClassSpecification_ = new nds.core.vehicle.VehicleClassSpecification(in);

        tunnelRestriction_ = nds.core.vehicle.AdrTunnelRestriction.readEnum(in);

        maxSpeed_ = in.readUnsignedByte();

        if (in.readBool())
        {
            combustionConsumption_ = new nds.core.vehicle.CombustionConsumption(in);
        }

        if (in.readBool())
        {
            electricConsumption_ = new nds.core.vehicle.ElectricConsumption(in);
        }

        if (in.readBool())
        {
            engineManufacturingYear_ = in.readShort();
        }

        if (in.readBool())
        {
            licensePlate_ = in.readString();
        }

        if (in.readBool())
        {
            registrationCountry_ = in.readString();
        }

        if (in.readBool())
        {
            currentOccupancy_ = in.readVarUInt16();
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        vehicleType_ = new nds.core.vehicle.VehicleTypeInformation(zserioContext.getVehicleType(), in);

        vehicleClassSpecification_ = new nds.core.vehicle.VehicleClassSpecification(zserioContext.getVehicleClassSpecification(), in);

        tunnelRestriction_ = nds.core.vehicle.AdrTunnelRestriction.readEnum(zserioContext.getTunnelRestriction(), in);

        maxSpeed_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                zserioContext.getMaxSpeed().read(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), in)).get();

        if (in.readBool())
        {
            combustionConsumption_ = new nds.core.vehicle.CombustionConsumption(zserioContext.getCombustionConsumption(), in);
        }

        if (in.readBool())
        {
            electricConsumption_ = new nds.core.vehicle.ElectricConsumption(zserioContext.getElectricConsumption(), in);
        }

        if (in.readBool())
        {
            engineManufacturingYear_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                    zserioContext.getEngineManufacturingYear().read(new zserio.runtime.array.ArrayTraits.SignedBitFieldShortArrayTraits((int)(16)), in)).get();
        }

        if (in.readBool())
        {
            licensePlate_ = in.readString();
        }

        if (in.readBool())
        {
            registrationCountry_ = in.readString();
        }

        if (in.readBool())
        {
            currentOccupancy_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                    zserioContext.getCurrentOccupancy().read(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), in)).get();
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

        endBitPosition = vehicleType_.initializeOffsets(endBitPosition);
        endBitPosition = vehicleClassSpecification_.initializeOffsets(endBitPosition);
        endBitPosition += tunnelRestriction_.bitSizeOf(endBitPosition);
        endBitPosition += 8;
        endBitPosition += 1;
        if (isCombustionConsumptionUsed())
        {
            endBitPosition = combustionConsumption_.initializeOffsets(endBitPosition);
        }
        endBitPosition += 1;
        if (isElectricConsumptionUsed())
        {
            endBitPosition = electricConsumption_.initializeOffsets(endBitPosition);
        }
        endBitPosition += 1;
        if (isEngineManufacturingYearUsed())
        {
            endBitPosition += 16;
        }
        endBitPosition += 1;
        if (isLicensePlateUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(licensePlate_);
        }
        endBitPosition += 1;
        if (isRegistrationCountryUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(registrationCountry_);
        }
        endBitPosition += 1;
        if (isCurrentOccupancyUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(currentOccupancy_);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = vehicleType_.initializeOffsets(zserioContext.getVehicleType(), endBitPosition);
        endBitPosition = vehicleClassSpecification_.initializeOffsets(zserioContext.getVehicleClassSpecification(), endBitPosition);
        endBitPosition = tunnelRestriction_.initializeOffsets(zserioContext.getTunnelRestriction(), endBitPosition);
        endBitPosition += zserioContext.getMaxSpeed().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(maxSpeed_));
        endBitPosition += 1;
        if (isCombustionConsumptionUsed())
        {
            endBitPosition = combustionConsumption_.initializeOffsets(zserioContext.getCombustionConsumption(), endBitPosition);
        }
        endBitPosition += 1;
        if (isElectricConsumptionUsed())
        {
            endBitPosition = electricConsumption_.initializeOffsets(zserioContext.getElectricConsumption(), endBitPosition);
        }
        endBitPosition += 1;
        if (isEngineManufacturingYearUsed())
        {
            endBitPosition += zserioContext.getEngineManufacturingYear().bitSizeOf(new zserio.runtime.array.ArrayTraits.SignedBitFieldShortArrayTraits((int)(16)),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(engineManufacturingYear_));
        }
        endBitPosition += 1;
        if (isLicensePlateUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(licensePlate_);
        }
        endBitPosition += 1;
        if (isRegistrationCountryUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(registrationCountry_);
        }
        endBitPosition += 1;
        if (isCurrentOccupancyUsed())
        {
            endBitPosition += zserioContext.getCurrentOccupancy().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(currentOccupancy_));
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        vehicleType_.write(out);

        vehicleClassSpecification_.write(out);

        tunnelRestriction_.write(out);

        out.writeUnsignedByte(maxSpeed_);

        if (isCombustionConsumptionUsed())
        {
            out.writeBool(true);
            combustionConsumption_.write(out);
        }
        else
        {
            out.writeBool(false);
        }

        if (isElectricConsumptionUsed())
        {
            out.writeBool(true);
            electricConsumption_.write(out);
        }
        else
        {
            out.writeBool(false);
        }

        if (isEngineManufacturingYearUsed())
        {
            out.writeBool(true);
            out.writeShort(engineManufacturingYear_);
        }
        else
        {
            out.writeBool(false);
        }

        if (isLicensePlateUsed())
        {
            out.writeBool(true);
            out.writeString(licensePlate_);
        }
        else
        {
            out.writeBool(false);
        }

        if (isRegistrationCountryUsed())
        {
            out.writeBool(true);
            out.writeString(registrationCountry_);
        }
        else
        {
            out.writeBool(false);
        }

        if (isCurrentOccupancyUsed())
        {
            out.writeBool(true);
            out.writeVarUInt16(currentOccupancy_);
        }
        else
        {
            out.writeBool(false);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        vehicleType_.write(zserioContext.getVehicleType(), out);

        vehicleClassSpecification_.write(zserioContext.getVehicleClassSpecification(), out);

        tunnelRestriction_.write(zserioContext.getTunnelRestriction(), out);

        zserioContext.getMaxSpeed().write(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(maxSpeed_));

        if (isCombustionConsumptionUsed())
        {
            out.writeBool(true);
            combustionConsumption_.write(zserioContext.getCombustionConsumption(), out);
        }
        else
        {
            out.writeBool(false);
        }

        if (isElectricConsumptionUsed())
        {
            out.writeBool(true);
            electricConsumption_.write(zserioContext.getElectricConsumption(), out);
        }
        else
        {
            out.writeBool(false);
        }

        if (isEngineManufacturingYearUsed())
        {
            out.writeBool(true);
            zserioContext.getEngineManufacturingYear().write(new zserio.runtime.array.ArrayTraits.SignedBitFieldShortArrayTraits((int)(16)), out,
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(engineManufacturingYear_));
        }
        else
        {
            out.writeBool(false);
        }

        if (isLicensePlateUsed())
        {
            out.writeBool(true);
            out.writeString(licensePlate_);
        }
        else
        {
            out.writeBool(false);
        }

        if (isRegistrationCountryUsed())
        {
            out.writeBool(true);
            out.writeString(registrationCountry_);
        }
        else
        {
            out.writeBool(false);
        }

        if (isCurrentOccupancyUsed())
        {
            out.writeBool(true);
            zserioContext.getCurrentOccupancy().write(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(currentOccupancy_));
        }
        else
        {
            out.writeBool(false);
        }
    }

    private nds.core.vehicle.VehicleTypeInformation vehicleType_;
    private nds.core.vehicle.VehicleClassSpecification vehicleClassSpecification_;
    private nds.core.vehicle.AdrTunnelRestriction tunnelRestriction_;
    private short maxSpeed_;
    private nds.core.vehicle.CombustionConsumption combustionConsumption_;
    private nds.core.vehicle.ElectricConsumption electricConsumption_;
    private java.lang.Short engineManufacturingYear_;
    private java.lang.String licensePlate_;
    private java.lang.String registrationCountry_;
    private java.lang.Short currentOccupancy_;
}
