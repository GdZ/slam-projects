/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_CONDITIONS_DAY_OF_YEAR_H
#define NDS_CORE_CONDITIONS_DAY_OF_YEAR_H

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

#include <nds/core/conditions/DayOfMonth.h>
#include <nds/core/conditions/MonthOfYear.h>
#include <nds/core/types/Year.h>

namespace nds
{
namespace core
{
namespace conditions
{

class DayOfYear
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getYear()
        {
            return m_year_;
        }

        ::zserio::DeltaContext& getMonth()
        {
            return m_month_;
        }

        ::zserio::DeltaContext& getDay()
        {
            return m_day_;
        }

    private:
        ::zserio::DeltaContext m_year_;
        ::zserio::DeltaContext m_month_;
        ::zserio::DeltaContext m_day_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    DayOfYear() noexcept :
            DayOfYear(allocator_type())
    {}

    explicit DayOfYear(const allocator_type& allocator) noexcept;

    DayOfYear(
            ::nds::core::types::Year year_,
            ::nds::core::conditions::MonthOfYear month_,
            ::nds::core::conditions::DayOfMonth day_,
            bool isInclusive_,
            const allocator_type& allocator = allocator_type()) :
            DayOfYear(allocator)
    {
        m_year_ = year_;
        m_month_ = month_;
        m_day_ = day_;
        m_isInclusive_ = isInclusive_;
    }

    explicit DayOfYear(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit DayOfYear(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~DayOfYear() = default;

    DayOfYear(const DayOfYear&) = default;
    DayOfYear& operator=(const DayOfYear&) = default;

    DayOfYear(DayOfYear&&) = default;
    DayOfYear& operator=(DayOfYear&&) = default;

    DayOfYear(::zserio::PropagateAllocatorT,
            const DayOfYear& other, const allocator_type& allocator);

    ::nds::core::types::Year getYear() const;
    void setYear(::nds::core::types::Year year_);

    ::nds::core::conditions::MonthOfYear getMonth() const;
    void setMonth(::nds::core::conditions::MonthOfYear month_);

    ::nds::core::conditions::DayOfMonth getDay() const;
    void setDay(::nds::core::conditions::DayOfMonth day_);

    bool getIsInclusive() const;
    void setIsInclusive(bool isInclusive_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const DayOfYear& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::types::Year readYear(::zserio::BitStreamReader& in);
    ::nds::core::types::Year readYear(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::conditions::MonthOfYear readMonth(::zserio::BitStreamReader& in);
    ::nds::core::conditions::MonthOfYear readMonth(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::conditions::DayOfMonth readDay(::zserio::BitStreamReader& in);
    ::nds::core::conditions::DayOfMonth readDay(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    bool readIsInclusive(::zserio::BitStreamReader& in);

    ::nds::core::types::Year m_year_;
    ::nds::core::conditions::MonthOfYear m_month_;
    ::nds::core::conditions::DayOfMonth m_day_;
    bool m_isInclusive_;
};

} // namespace conditions
} // namespace core
} // namespace nds

#endif // NDS_CORE_CONDITIONS_DAY_OF_YEAR_H
