/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_TYPES_ROAD_CHARACTER_VALUED_H
#define NDS_CORE_TYPES_ROAD_CHARACTER_VALUED_H

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

#include <nds/core/types/RoadCharacter.h>

namespace nds
{
namespace core
{
namespace types
{

class RoadCharacterValued
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getCharacter()
        {
            return m_character_;
        }

    private:
        ::zserio::DeltaContext m_character_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RoadCharacterValued() noexcept :
            RoadCharacterValued(allocator_type())
    {}

    explicit RoadCharacterValued(const allocator_type& allocator) noexcept;

    RoadCharacterValued(
            ::nds::core::types::RoadCharacter character_,
            bool value_,
            const allocator_type& allocator = allocator_type()) :
            RoadCharacterValued(allocator)
    {
        m_character_ = character_;
        m_value_ = value_;
    }

    explicit RoadCharacterValued(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RoadCharacterValued(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RoadCharacterValued() = default;

    RoadCharacterValued(const RoadCharacterValued&) = default;
    RoadCharacterValued& operator=(const RoadCharacterValued&) = default;

    RoadCharacterValued(RoadCharacterValued&&) = default;
    RoadCharacterValued& operator=(RoadCharacterValued&&) = default;

    RoadCharacterValued(::zserio::PropagateAllocatorT,
            const RoadCharacterValued& other, const allocator_type& allocator);

    ::nds::core::types::RoadCharacter getCharacter() const;
    void setCharacter(::nds::core::types::RoadCharacter character_);

    bool getValue() const;
    void setValue(bool value_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RoadCharacterValued& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::types::RoadCharacter readCharacter(::zserio::BitStreamReader& in);
    ::nds::core::types::RoadCharacter readCharacter(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    bool readValue(::zserio::BitStreamReader& in);

    ::nds::core::types::RoadCharacter m_character_;
    bool m_value_;
};

} // namespace types
} // namespace core
} // namespace nds

#endif // NDS_CORE_TYPES_ROAD_CHARACTER_VALUED_H
