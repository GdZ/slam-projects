/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_TYPES_RANGE_POSITION_H
#define NDS_CORE_TYPES_RANGE_POSITION_H

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

namespace nds
{
namespace core
{
namespace types
{

class RangePosition
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getPosition()
        {
            return m_position_;
        }

    private:
        ::zserio::DeltaContext m_position_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RangePosition() noexcept :
            RangePosition(allocator_type())
    {}

    explicit RangePosition(const allocator_type& allocator) noexcept;

    explicit RangePosition(
            uint32_t position_,
            const allocator_type& allocator = allocator_type()) :
            RangePosition(allocator)
    {
        m_position_ = position_;
    }

    explicit RangePosition(::zserio::BitStreamReader& in,
            uint32_t length_, const allocator_type& allocator = allocator_type());
    explicit RangePosition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            uint32_t length_, const allocator_type& allocator = allocator_type());

    ~RangePosition() = default;

    RangePosition(const RangePosition& other);
    RangePosition& operator=(const RangePosition& other);

    RangePosition(RangePosition&& other);
    RangePosition& operator=(RangePosition&& other);

    RangePosition(::zserio::PropagateAllocatorT,
            const RangePosition& other, const allocator_type& allocator);

    void initialize(
            uint32_t length_);
    bool isInitialized() const;

    uint32_t getLength() const;

    uint32_t getPosition() const;
    void setPosition(uint32_t position_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RangePosition& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    uint32_t readPosition(::zserio::BitStreamReader& in);
    uint32_t readPosition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    uint32_t m_length_;
    bool m_isInitialized;
    uint32_t m_position_;
};

} // namespace types
} // namespace core
} // namespace nds

#endif // NDS_CORE_TYPES_RANGE_POSITION_H
