/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_CONDITIONS_TIME_RANGE_OF_DAY_H
#define NDS_CORE_CONDITIONS_TIME_RANGE_OF_DAY_H

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

#include <nds/core/conditions/TimeOfDay.h>

namespace nds
{
namespace core
{
namespace conditions
{

class TimeRangeOfDay
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::core::conditions::TimeOfDay::ZserioPackingContext& getStartTime()
        {
            return m_startTime_;
        }

        ::nds::core::conditions::TimeOfDay::ZserioPackingContext& getEndTime()
        {
            return m_endTime_;
        }

    private:
        ::nds::core::conditions::TimeOfDay::ZserioPackingContext m_startTime_;
        ::nds::core::conditions::TimeOfDay::ZserioPackingContext m_endTime_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    TimeRangeOfDay() noexcept :
            TimeRangeOfDay(allocator_type())
    {}

    explicit TimeRangeOfDay(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_startTime = ::nds::core::conditions::TimeOfDay,
            typename ZSERIO_T_endTime = ::nds::core::conditions::TimeOfDay,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_startTime, TimeRangeOfDay, allocator_type> = 0>
    TimeRangeOfDay(
            ZSERIO_T_startTime&& startTime_,
            ZSERIO_T_endTime&& endTime_,
            bool isInclusive_,
            const allocator_type& allocator = allocator_type()) :
            TimeRangeOfDay(allocator)
    {
        m_startTime_ = ::std::forward<ZSERIO_T_startTime>(startTime_);
        m_endTime_ = ::std::forward<ZSERIO_T_endTime>(endTime_);
        m_isInclusive_ = isInclusive_;
    }

    explicit TimeRangeOfDay(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit TimeRangeOfDay(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~TimeRangeOfDay() = default;

    TimeRangeOfDay(const TimeRangeOfDay&) = default;
    TimeRangeOfDay& operator=(const TimeRangeOfDay&) = default;

    TimeRangeOfDay(TimeRangeOfDay&&) = default;
    TimeRangeOfDay& operator=(TimeRangeOfDay&&) = default;

    TimeRangeOfDay(::zserio::PropagateAllocatorT,
            const TimeRangeOfDay& other, const allocator_type& allocator);

    const ::nds::core::conditions::TimeOfDay& getStartTime() const;
    ::nds::core::conditions::TimeOfDay& getStartTime();
    void setStartTime(const ::nds::core::conditions::TimeOfDay& startTime_);
    void setStartTime(::nds::core::conditions::TimeOfDay&& startTime_);

    const ::nds::core::conditions::TimeOfDay& getEndTime() const;
    ::nds::core::conditions::TimeOfDay& getEndTime();
    void setEndTime(const ::nds::core::conditions::TimeOfDay& endTime_);
    void setEndTime(::nds::core::conditions::TimeOfDay&& endTime_);

    bool getIsInclusive() const;
    void setIsInclusive(bool isInclusive_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const TimeRangeOfDay& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::conditions::TimeOfDay readStartTime(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::conditions::TimeOfDay readStartTime(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::core::conditions::TimeOfDay readEndTime(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::conditions::TimeOfDay readEndTime(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    bool readIsInclusive(::zserio::BitStreamReader& in);

    ::nds::core::conditions::TimeOfDay m_startTime_;
    ::nds::core::conditions::TimeOfDay m_endTime_;
    bool m_isInclusive_;
};

} // namespace conditions
} // namespace core
} // namespace nds

#endif // NDS_CORE_CONDITIONS_TIME_RANGE_OF_DAY_H
