/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_CONDITIONS_NUM_TRAILERS_CONDITION_H
#define NDS_CORE_CONDITIONS_NUM_TRAILERS_CONDITION_H

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

#include <nds/core/vehicle/NumTrailers.h>

namespace nds
{
namespace core
{
namespace conditions
{

class NumTrailersCondition
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumTrailers()
        {
            return m_numTrailers_;
        }

    private:
        ::zserio::DeltaContext m_numTrailers_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    NumTrailersCondition() noexcept :
            NumTrailersCondition(allocator_type())
    {}

    explicit NumTrailersCondition(const allocator_type& allocator) noexcept;

    NumTrailersCondition(
            ::nds::core::vehicle::NumTrailers numTrailers_,
            bool isInclusive_,
            const allocator_type& allocator = allocator_type()) :
            NumTrailersCondition(allocator)
    {
        m_numTrailers_ = numTrailers_;
        m_isInclusive_ = isInclusive_;
    }

    explicit NumTrailersCondition(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit NumTrailersCondition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~NumTrailersCondition() = default;

    NumTrailersCondition(const NumTrailersCondition&) = default;
    NumTrailersCondition& operator=(const NumTrailersCondition&) = default;

    NumTrailersCondition(NumTrailersCondition&&) = default;
    NumTrailersCondition& operator=(NumTrailersCondition&&) = default;

    NumTrailersCondition(::zserio::PropagateAllocatorT,
            const NumTrailersCondition& other, const allocator_type& allocator);

    ::nds::core::vehicle::NumTrailers getNumTrailers() const;
    void setNumTrailers(::nds::core::vehicle::NumTrailers numTrailers_);

    bool getIsInclusive() const;
    void setIsInclusive(bool isInclusive_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const NumTrailersCondition& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::vehicle::NumTrailers readNumTrailers(::zserio::BitStreamReader& in);
    ::nds::core::vehicle::NumTrailers readNumTrailers(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    bool readIsInclusive(::zserio::BitStreamReader& in);

    ::nds::core::vehicle::NumTrailers m_numTrailers_;
    bool m_isInclusive_;
};

} // namespace conditions
} // namespace core
} // namespace nds

#endif // NDS_CORE_CONDITIONS_NUM_TRAILERS_CONDITION_H