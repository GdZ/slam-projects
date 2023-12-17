/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_METADATA_DISPLAY_SCALE_TILE_LEVEL_MAPPING_H
#define NDS_DISPLAY_METADATA_DISPLAY_SCALE_TILE_LEVEL_MAPPING_H

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

#include <nds/core/types/ScaleRange.h>

namespace nds
{
namespace display
{
namespace metadata
{

class DisplayScaleTileLevelMapping
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumLevels()
        {
            return m_numLevels_;
        }

    private:
        ::zserio::DeltaContext m_numLevels_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    DisplayScaleTileLevelMapping() noexcept :
            DisplayScaleTileLevelMapping(allocator_type())
    {}

    explicit DisplayScaleTileLevelMapping(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_tileLevel = ::zserio::vector<uint8_t>,
            typename ZSERIO_T_scaleRange = ::zserio::vector<::nds::core::types::ScaleRange>>
    DisplayScaleTileLevelMapping(
            uint8_t numLevels_,
            ZSERIO_T_tileLevel&& tileLevel_,
            ZSERIO_T_scaleRange&& scaleRange_,
            const allocator_type& allocator = allocator_type()) :
            DisplayScaleTileLevelMapping(allocator)
    {
        m_numLevels_ = numLevels_;
        m_tileLevel_ = ZserioArrayType_tileLevel(::std::forward<ZSERIO_T_tileLevel>(tileLevel_));
        m_scaleRange_ = ZserioArrayType_scaleRange(::std::forward<ZSERIO_T_scaleRange>(scaleRange_));
    }

    explicit DisplayScaleTileLevelMapping(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit DisplayScaleTileLevelMapping(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~DisplayScaleTileLevelMapping() = default;

    DisplayScaleTileLevelMapping(const DisplayScaleTileLevelMapping&) = default;
    DisplayScaleTileLevelMapping& operator=(const DisplayScaleTileLevelMapping&) = default;

    DisplayScaleTileLevelMapping(DisplayScaleTileLevelMapping&&) = default;
    DisplayScaleTileLevelMapping& operator=(DisplayScaleTileLevelMapping&&) = default;

    DisplayScaleTileLevelMapping(::zserio::PropagateAllocatorT,
            const DisplayScaleTileLevelMapping& other, const allocator_type& allocator);

    uint8_t getNumLevels() const;
    void setNumLevels(uint8_t numLevels_);

    const ::zserio::vector<uint8_t>& getTileLevel() const;
    ::zserio::vector<uint8_t>& getTileLevel();
    void setTileLevel(const ::zserio::vector<uint8_t>& tileLevel_);
    void setTileLevel(::zserio::vector<uint8_t>&& tileLevel_);

    const ::zserio::vector<::nds::core::types::ScaleRange>& getScaleRange() const;
    ::zserio::vector<::nds::core::types::ScaleRange>& getScaleRange();
    void setScaleRange(const ::zserio::vector<::nds::core::types::ScaleRange>& scaleRange_);
    void setScaleRange(::zserio::vector<::nds::core::types::ScaleRange>&& scaleRange_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const DisplayScaleTileLevelMapping& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_scaleRange
    {
    public:
        using OwnerType = DisplayScaleTileLevelMapping;

        static void create(DisplayScaleTileLevelMapping& owner,
                ::zserio::vector<::nds::core::types::ScaleRange>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(DisplayScaleTileLevelMapping& owner,
                ::zserio::vector<::nds::core::types::ScaleRange>& array,
                ::nds::core::types::ScaleRange::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_tileLevel = ::zserio::Array<::zserio::vector<uint8_t>, ::zserio::BitFieldArrayTraits<uint8_t, UINT8_C(4)>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_scaleRange = ::zserio::Array<::zserio::vector<::nds::core::types::ScaleRange>, ::zserio::ObjectArrayTraits<::nds::core::types::ScaleRange, ZserioElementFactory_scaleRange>, ::zserio::ArrayType::NORMAL>;

    uint8_t readNumLevels(::zserio::BitStreamReader& in);
    uint8_t readNumLevels(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_tileLevel readTileLevel(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_tileLevel readTileLevel(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_scaleRange readScaleRange(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_scaleRange readScaleRange(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    uint8_t m_numLevels_;
    ZserioArrayType_tileLevel m_tileLevel_;
    ZserioArrayType_scaleRange m_scaleRange_;
};

} // namespace metadata
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_METADATA_DISPLAY_SCALE_TILE_LEVEL_MAPPING_H