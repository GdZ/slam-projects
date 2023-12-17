/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_CONDITIONS_SLOW_ROAD_USERS_CONDITION_H
#define NDS_CORE_CONDITIONS_SLOW_ROAD_USERS_CONDITION_H

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
#include <zserio/ArrayTraits.h>

#include <nds/core/vehicle/SlowRoadUserTypes.h>

namespace nds
{
namespace core
{
namespace conditions
{

class SlowRoadUsersCondition
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getSlowRoadUsers()
        {
            return m_slowRoadUsers_;
        }

    private:
        ::zserio::DeltaContext m_slowRoadUsers_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    SlowRoadUsersCondition() noexcept :
            SlowRoadUsersCondition(allocator_type())
    {}

    explicit SlowRoadUsersCondition(const allocator_type& allocator) noexcept;

    SlowRoadUsersCondition(
            ::nds::core::vehicle::SlowRoadUserTypes slowRoadUsers_,
            bool isInclusive_,
            const allocator_type& allocator = allocator_type()) :
            SlowRoadUsersCondition(allocator)
    {
        m_slowRoadUsers_ = slowRoadUsers_;
        m_isInclusive_ = isInclusive_;
    }

    explicit SlowRoadUsersCondition(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit SlowRoadUsersCondition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~SlowRoadUsersCondition() = default;

    SlowRoadUsersCondition(const SlowRoadUsersCondition&) = default;
    SlowRoadUsersCondition& operator=(const SlowRoadUsersCondition&) = default;

    SlowRoadUsersCondition(SlowRoadUsersCondition&&) = default;
    SlowRoadUsersCondition& operator=(SlowRoadUsersCondition&&) = default;

    SlowRoadUsersCondition(::zserio::PropagateAllocatorT,
            const SlowRoadUsersCondition& other, const allocator_type& allocator);

    ::nds::core::vehicle::SlowRoadUserTypes getSlowRoadUsers() const;
    void setSlowRoadUsers(::nds::core::vehicle::SlowRoadUserTypes slowRoadUsers_);

    bool getIsInclusive() const;
    void setIsInclusive(bool isInclusive_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const SlowRoadUsersCondition& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::vehicle::SlowRoadUserTypes readSlowRoadUsers(::zserio::BitStreamReader& in);
    ::nds::core::vehicle::SlowRoadUserTypes readSlowRoadUsers(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    bool readIsInclusive(::zserio::BitStreamReader& in);

    ::nds::core::vehicle::SlowRoadUserTypes m_slowRoadUsers_;
    bool m_isInclusive_;
};

} // namespace conditions
} // namespace core
} // namespace nds

#endif // NDS_CORE_CONDITIONS_SLOW_ROAD_USERS_CONDITION_H