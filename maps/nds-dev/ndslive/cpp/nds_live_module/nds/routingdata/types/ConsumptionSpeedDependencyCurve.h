/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTINGDATA_TYPES_CONSUMPTION_SPEED_DEPENDENCY_CURVE_H
#define NDS_ROUTINGDATA_TYPES_CONSUMPTION_SPEED_DEPENDENCY_CURVE_H

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
#include <zserio/Array.h>
#include <zserio/ArrayTraits.h>
#include <zserio/Types.h>
#include <zserio/Vector.h>

#include <nds/routingdata/types/ConsumptionSpeedValue.h>

namespace nds
{
namespace routingdata
{
namespace types
{

class ConsumptionSpeedDependencyCurve
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumberOfSpeedValuesAlongRoad()
        {
            return m_numberOfSpeedValuesAlongRoad_;
        }

    private:
        ::zserio::DeltaContext m_numberOfSpeedValuesAlongRoad_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    ConsumptionSpeedDependencyCurve() noexcept :
            ConsumptionSpeedDependencyCurve(allocator_type())
    {}

    explicit ConsumptionSpeedDependencyCurve(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_consumptionSpeedValue = ::zserio::vector<::nds::routingdata::types::ConsumptionSpeedValue>>
    ConsumptionSpeedDependencyCurve(
            uint8_t numberOfSpeedValuesAlongRoad_,
            ZSERIO_T_consumptionSpeedValue&& consumptionSpeedValue_,
            const allocator_type& allocator = allocator_type()) :
            ConsumptionSpeedDependencyCurve(allocator)
    {
        m_numberOfSpeedValuesAlongRoad_ = numberOfSpeedValuesAlongRoad_;
        m_consumptionSpeedValue_ = ZserioArrayType_consumptionSpeedValue(::std::forward<ZSERIO_T_consumptionSpeedValue>(consumptionSpeedValue_));
    }

    explicit ConsumptionSpeedDependencyCurve(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit ConsumptionSpeedDependencyCurve(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~ConsumptionSpeedDependencyCurve() = default;

    ConsumptionSpeedDependencyCurve(const ConsumptionSpeedDependencyCurve&) = default;
    ConsumptionSpeedDependencyCurve& operator=(const ConsumptionSpeedDependencyCurve&) = default;

    ConsumptionSpeedDependencyCurve(ConsumptionSpeedDependencyCurve&&) = default;
    ConsumptionSpeedDependencyCurve& operator=(ConsumptionSpeedDependencyCurve&&) = default;

    ConsumptionSpeedDependencyCurve(::zserio::PropagateAllocatorT,
            const ConsumptionSpeedDependencyCurve& other, const allocator_type& allocator);

    uint8_t getNumberOfSpeedValuesAlongRoad() const;
    void setNumberOfSpeedValuesAlongRoad(uint8_t numberOfSpeedValuesAlongRoad_);

    const ::zserio::vector<::nds::routingdata::types::ConsumptionSpeedValue>& getConsumptionSpeedValue() const;
    ::zserio::vector<::nds::routingdata::types::ConsumptionSpeedValue>& getConsumptionSpeedValue();
    void setConsumptionSpeedValue(const ::zserio::vector<::nds::routingdata::types::ConsumptionSpeedValue>& consumptionSpeedValue_);
    void setConsumptionSpeedValue(::zserio::vector<::nds::routingdata::types::ConsumptionSpeedValue>&& consumptionSpeedValue_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const ConsumptionSpeedDependencyCurve& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_consumptionSpeedValue
    {
    public:
        using OwnerType = ConsumptionSpeedDependencyCurve;

        static void create(ConsumptionSpeedDependencyCurve& owner,
                ::zserio::vector<::nds::routingdata::types::ConsumptionSpeedValue>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(ConsumptionSpeedDependencyCurve& owner,
                ::zserio::vector<::nds::routingdata::types::ConsumptionSpeedValue>& array,
                ::nds::routingdata::types::ConsumptionSpeedValue::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_consumptionSpeedValue = ::zserio::Array<::zserio::vector<::nds::routingdata::types::ConsumptionSpeedValue>, ::zserio::ObjectArrayTraits<::nds::routingdata::types::ConsumptionSpeedValue, ZserioElementFactory_consumptionSpeedValue>, ::zserio::ArrayType::NORMAL>;

    uint8_t readNumberOfSpeedValuesAlongRoad(::zserio::BitStreamReader& in);
    uint8_t readNumberOfSpeedValuesAlongRoad(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_consumptionSpeedValue readConsumptionSpeedValue(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_consumptionSpeedValue readConsumptionSpeedValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    uint8_t m_numberOfSpeedValuesAlongRoad_;
    ZserioArrayType_consumptionSpeedValue m_consumptionSpeedValue_;
};

} // namespace types
} // namespace routingdata
} // namespace nds

#endif // NDS_ROUTINGDATA_TYPES_CONSUMPTION_SPEED_DEPENDENCY_CURVE_H
