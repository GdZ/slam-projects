/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTING_ROUTE_ROUTE_OPTIONS_H
#define NDS_ROUTING_ROUTE_ROUTE_OPTIONS_H

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
#include <zserio/Types.h>

#include <nds/routing/types/RouteOptionType.h>

namespace nds
{
namespace routing
{
namespace route
{

class RouteOptions
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getWeight()
        {
            return m_weight_;
        }

        ::zserio::DeltaContext& getType()
        {
            return m_type_;
        }

    private:
        ::zserio::DeltaContext m_weight_;
        ::zserio::DeltaContext m_type_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RouteOptions() noexcept :
            RouteOptions(allocator_type())
    {}

    explicit RouteOptions(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_weight = uint8_t>
    RouteOptions(
            bool avoid_,
            ZSERIO_T_weight&& weight_,
            ::nds::routing::types::RouteOptionType type_,
            const allocator_type& allocator = allocator_type()) :
            RouteOptions(allocator)
    {
        m_avoid_ = avoid_;
        m_weight_ = ::std::forward<ZSERIO_T_weight>(weight_);
        m_type_ = type_;
    }

    explicit RouteOptions(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RouteOptions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RouteOptions() = default;

    RouteOptions(const RouteOptions&) = default;
    RouteOptions& operator=(const RouteOptions&) = default;

    RouteOptions(RouteOptions&&) = default;
    RouteOptions& operator=(RouteOptions&&) = default;

    RouteOptions(::zserio::PropagateAllocatorT,
            const RouteOptions& other, const allocator_type& allocator);

    bool getAvoid() const;
    void setAvoid(bool avoid_);

    uint8_t getWeight() const;
    void setWeight(uint8_t weight_);
    bool isWeightUsed() const;
    bool isWeightSet() const;
    void resetWeight();

    ::nds::routing::types::RouteOptionType getType() const;
    void setType(::nds::routing::types::RouteOptionType type_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RouteOptions& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    bool readAvoid(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<uint8_t> readWeight(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<uint8_t> readWeight(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::routing::types::RouteOptionType readType(::zserio::BitStreamReader& in);
    ::nds::routing::types::RouteOptionType readType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    bool m_avoid_;
    ::zserio::InplaceOptionalHolder<uint8_t> m_weight_;
    ::nds::routing::types::RouteOptionType m_type_;
};

} // namespace route
} // namespace routing
} // namespace nds

#endif // NDS_ROUTING_ROUTE_ROUTE_OPTIONS_H