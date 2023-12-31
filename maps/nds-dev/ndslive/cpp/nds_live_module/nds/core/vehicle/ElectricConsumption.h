/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_VEHICLE_ELECTRIC_CONSUMPTION_H
#define NDS_CORE_VEHICLE_ELECTRIC_CONSUMPTION_H

#include <zserio/CppRuntimeVersion.h>
#if CPP_EXTENSION_RUNTIME_VERSION_NUMBER != 2012000
    #error Version mismatch between Zserio runtime library and Zserio compiler!
    #error Please update your Zserio runtime library to the version 2.12.0.
#endif

#include <zserio/Traits.h>
#include <zserio/BitStreamReader.h>
#include <zserio/BitStreamWriter.h>
#include <zserio/AllocatorPropagatingCopy.h>
#include <zserio/DeltaContext.h>
#include <memory>
#include <zserio/OptionalHolder.h>
#include <zserio/ArrayTraits.h>

#include <nds/core/vehicle/ConsumptionEfficiency.h>
#include <nds/core/vehicle/ElectricConsumptionCurve.h>
#include <nds/core/vehicle/Watt.h>
#include <nds/core/vehicle/WattHrs.h>
#include <nds/core/vehicle/WattHrsPerKm.h>

namespace nds
{
namespace core
{
namespace vehicle
{

class ElectricConsumption
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getMaxCharge()
        {
            return m_maxCharge_;
        }

        ::zserio::DeltaContext& getCurrentCharge()
        {
            return m_currentCharge_;
        }

        ::zserio::DeltaContext& getAuxConsumption()
        {
            return m_auxConsumption_;
        }

        ::nds::core::vehicle::ElectricConsumptionCurve::ZserioPackingContext& getNormalConsumption()
        {
            return m_normalConsumption_;
        }

        ::nds::core::vehicle::ElectricConsumptionCurve::ZserioPackingContext& getTrafficConsumption()
        {
            return m_trafficConsumption_;
        }

        ::nds::core::vehicle::ConsumptionEfficiency::ZserioPackingContext& getEfficiency()
        {
            return m_efficiency_;
        }

        ::zserio::DeltaContext& getConsumptionElevationGain()
        {
            return m_consumptionElevationGain_;
        }

        ::zserio::DeltaContext& getRecuperationElevationLoss()
        {
            return m_recuperationElevationLoss_;
        }

    private:
        ::zserio::DeltaContext m_maxCharge_;
        ::zserio::DeltaContext m_currentCharge_;
        ::zserio::DeltaContext m_auxConsumption_;
        ::nds::core::vehicle::ElectricConsumptionCurve::ZserioPackingContext m_normalConsumption_;
        ::nds::core::vehicle::ElectricConsumptionCurve::ZserioPackingContext m_trafficConsumption_;
        ::nds::core::vehicle::ConsumptionEfficiency::ZserioPackingContext m_efficiency_;
        ::zserio::DeltaContext m_consumptionElevationGain_;
        ::zserio::DeltaContext m_recuperationElevationLoss_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    ElectricConsumption() noexcept :
            ElectricConsumption(allocator_type())
    {}

    explicit ElectricConsumption(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_auxConsumption = ::nds::core::vehicle::Watt,
            typename ZSERIO_T_normalConsumption = ::nds::core::vehicle::ElectricConsumptionCurve,
            typename ZSERIO_T_trafficConsumption = ::nds::core::vehicle::ElectricConsumptionCurve,
            typename ZSERIO_T_efficiency = ::nds::core::vehicle::ConsumptionEfficiency,
            typename ZSERIO_T_consumptionElevationGain = ::nds::core::vehicle::WattHrsPerKm,
            typename ZSERIO_T_recuperationElevationLoss = ::nds::core::vehicle::WattHrsPerKm>
    ElectricConsumption(
            ::nds::core::vehicle::WattHrs maxCharge_,
            ::nds::core::vehicle::WattHrs currentCharge_,
            ZSERIO_T_auxConsumption&& auxConsumption_,
            ZSERIO_T_normalConsumption&& normalConsumption_,
            ZSERIO_T_trafficConsumption&& trafficConsumption_,
            ZSERIO_T_efficiency&& efficiency_,
            ZSERIO_T_consumptionElevationGain&& consumptionElevationGain_,
            ZSERIO_T_recuperationElevationLoss&& recuperationElevationLoss_,
            const allocator_type& allocator = allocator_type()) :
            ElectricConsumption(allocator)
    {
        m_maxCharge_ = maxCharge_;
        m_currentCharge_ = currentCharge_;
        m_auxConsumption_ = ::std::forward<ZSERIO_T_auxConsumption>(auxConsumption_);
        m_normalConsumption_ = ::std::forward<ZSERIO_T_normalConsumption>(normalConsumption_);
        m_trafficConsumption_ = ::std::forward<ZSERIO_T_trafficConsumption>(trafficConsumption_);
        m_efficiency_ = ::std::forward<ZSERIO_T_efficiency>(efficiency_);
        m_consumptionElevationGain_ = ::std::forward<ZSERIO_T_consumptionElevationGain>(consumptionElevationGain_);
        m_recuperationElevationLoss_ = ::std::forward<ZSERIO_T_recuperationElevationLoss>(recuperationElevationLoss_);
    }

    explicit ElectricConsumption(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit ElectricConsumption(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~ElectricConsumption() = default;

    ElectricConsumption(const ElectricConsumption&) = default;
    ElectricConsumption& operator=(const ElectricConsumption&) = default;

    ElectricConsumption(ElectricConsumption&&) = default;
    ElectricConsumption& operator=(ElectricConsumption&&) = default;

    ElectricConsumption(::zserio::PropagateAllocatorT,
            const ElectricConsumption& other, const allocator_type& allocator);

    ::nds::core::vehicle::WattHrs getMaxCharge() const;
    void setMaxCharge(::nds::core::vehicle::WattHrs maxCharge_);

    ::nds::core::vehicle::WattHrs getCurrentCharge() const;
    void setCurrentCharge(::nds::core::vehicle::WattHrs currentCharge_);

    ::nds::core::vehicle::Watt getAuxConsumption() const;
    void setAuxConsumption(::nds::core::vehicle::Watt auxConsumption_);
    bool isAuxConsumptionUsed() const;
    bool isAuxConsumptionSet() const;
    void resetAuxConsumption();

    const ::nds::core::vehicle::ElectricConsumptionCurve& getNormalConsumption() const;
    ::nds::core::vehicle::ElectricConsumptionCurve& getNormalConsumption();
    void setNormalConsumption(const ::nds::core::vehicle::ElectricConsumptionCurve& normalConsumption_);
    void setNormalConsumption(::nds::core::vehicle::ElectricConsumptionCurve&& normalConsumption_);

    const ::nds::core::vehicle::ElectricConsumptionCurve& getTrafficConsumption() const;
    ::nds::core::vehicle::ElectricConsumptionCurve& getTrafficConsumption();
    void setTrafficConsumption(const ::nds::core::vehicle::ElectricConsumptionCurve& trafficConsumption_);
    void setTrafficConsumption(::nds::core::vehicle::ElectricConsumptionCurve&& trafficConsumption_);
    bool isTrafficConsumptionUsed() const;
    bool isTrafficConsumptionSet() const;
    void resetTrafficConsumption();

    const ::nds::core::vehicle::ConsumptionEfficiency& getEfficiency() const;
    ::nds::core::vehicle::ConsumptionEfficiency& getEfficiency();
    void setEfficiency(const ::nds::core::vehicle::ConsumptionEfficiency& efficiency_);
    void setEfficiency(::nds::core::vehicle::ConsumptionEfficiency&& efficiency_);
    bool isEfficiencyUsed() const;
    bool isEfficiencySet() const;
    void resetEfficiency();

    ::nds::core::vehicle::WattHrsPerKm getConsumptionElevationGain() const;
    void setConsumptionElevationGain(::nds::core::vehicle::WattHrsPerKm consumptionElevationGain_);
    bool isConsumptionElevationGainUsed() const;
    bool isConsumptionElevationGainSet() const;
    void resetConsumptionElevationGain();

    ::nds::core::vehicle::WattHrsPerKm getRecuperationElevationLoss() const;
    void setRecuperationElevationLoss(::nds::core::vehicle::WattHrsPerKm recuperationElevationLoss_);
    bool isRecuperationElevationLossUsed() const;
    bool isRecuperationElevationLossSet() const;
    void resetRecuperationElevationLoss();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const ElectricConsumption& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::vehicle::WattHrs readMaxCharge(::zserio::BitStreamReader& in);
    ::nds::core::vehicle::WattHrs readMaxCharge(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::vehicle::WattHrs readCurrentCharge(::zserio::BitStreamReader& in);
    ::nds::core::vehicle::WattHrs readCurrentCharge(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::core::vehicle::Watt> readAuxConsumption(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::core::vehicle::Watt> readAuxConsumption(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::vehicle::ElectricConsumptionCurve readNormalConsumption(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::vehicle::ElectricConsumptionCurve readNormalConsumption(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::vehicle::ElectricConsumptionCurve> readTrafficConsumption(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::vehicle::ElectricConsumptionCurve> readTrafficConsumption(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::vehicle::ConsumptionEfficiency> readEfficiency(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::vehicle::ConsumptionEfficiency> readEfficiency(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::vehicle::WattHrsPerKm> readConsumptionElevationGain(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::core::vehicle::WattHrsPerKm> readConsumptionElevationGain(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::core::vehicle::WattHrsPerKm> readRecuperationElevationLoss(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::core::vehicle::WattHrsPerKm> readRecuperationElevationLoss(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::nds::core::vehicle::WattHrs m_maxCharge_;
    ::nds::core::vehicle::WattHrs m_currentCharge_;
    ::zserio::InplaceOptionalHolder<::nds::core::vehicle::Watt> m_auxConsumption_;
    ::nds::core::vehicle::ElectricConsumptionCurve m_normalConsumption_;
    ::zserio::InplaceOptionalHolder<::nds::core::vehicle::ElectricConsumptionCurve> m_trafficConsumption_;
    ::zserio::InplaceOptionalHolder<::nds::core::vehicle::ConsumptionEfficiency> m_efficiency_;
    ::zserio::InplaceOptionalHolder<::nds::core::vehicle::WattHrsPerKm> m_consumptionElevationGain_;
    ::zserio::InplaceOptionalHolder<::nds::core::vehicle::WattHrsPerKm> m_recuperationElevationLoss_;
};

} // namespace vehicle
} // namespace core
} // namespace nds

#endif // NDS_CORE_VEHICLE_ELECTRIC_CONSUMPTION_H
