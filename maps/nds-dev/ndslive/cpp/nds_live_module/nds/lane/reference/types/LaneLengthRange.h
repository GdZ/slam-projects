/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LANE_REFERENCE_TYPES_LANE_LENGTH_RANGE_H
#define NDS_LANE_REFERENCE_TYPES_LANE_LENGTH_RANGE_H

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
#include <zserio/Types.h>

#include <nds/core/types/Range.h>
#include <nds/lane/reference/types/LaneLength.h>

namespace nds
{
namespace lane
{
namespace reference
{
namespace types
{

class LaneLengthRange
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getLength()
        {
            return m_length_;
        }

        ::nds::core::types::Range::ZserioPackingContext& getRange()
        {
            return m_range_;
        }

    private:
        ::zserio::DeltaContext m_length_;
        ::nds::core::types::Range::ZserioPackingContext m_range_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    LaneLengthRange() noexcept :
            LaneLengthRange(allocator_type())
    {}

    explicit LaneLengthRange(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_range = ::nds::core::types::Range>
    LaneLengthRange(
            ::nds::lane::reference::types::LaneLength length_,
            ZSERIO_T_range&& range_,
            const allocator_type& allocator = allocator_type()) :
            LaneLengthRange(allocator)
    {
        m_length_ = length_;
        m_range_ = ::std::forward<ZSERIO_T_range>(range_);
    }

    explicit LaneLengthRange(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit LaneLengthRange(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~LaneLengthRange() = default;

    LaneLengthRange(const LaneLengthRange& other);
    LaneLengthRange& operator=(const LaneLengthRange& other);

    LaneLengthRange(LaneLengthRange&& other);
    LaneLengthRange& operator=(LaneLengthRange&& other);

    LaneLengthRange(::zserio::PropagateAllocatorT,
            const LaneLengthRange& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::lane::reference::types::LaneLength getLength() const;
    void setLength(::nds::lane::reference::types::LaneLength length_);

    const ::nds::core::types::Range& getRange() const;
    ::nds::core::types::Range& getRange();
    void setRange(const ::nds::core::types::Range& range_);
    void setRange(::nds::core::types::Range&& range_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const LaneLengthRange& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::lane::reference::types::LaneLength readLength(::zserio::BitStreamReader& in);
    ::nds::lane::reference::types::LaneLength readLength(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::types::Range readRange(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::types::Range readRange(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::lane::reference::types::LaneLength m_length_;
    ::nds::core::types::Range m_range_;
};

} // namespace types
} // namespace reference
} // namespace lane
} // namespace nds

#endif // NDS_LANE_REFERENCE_TYPES_LANE_LENGTH_RANGE_H
