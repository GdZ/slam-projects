/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CHARACTERISTICS_LAYER_DISPLAY_LINE_CHARACTERISTICS_LAYER_H
#define NDS_CHARACTERISTICS_LAYER_DISPLAY_LINE_CHARACTERISTICS_LAYER_H

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

#include <nds/characteristics/instantiations/CharacsDisplayLinePositionAttributeMapList.h>
#include <nds/characteristics/instantiations/CharacsDisplayLinePositionAttributeSetList.h>
#include <nds/characteristics/instantiations/CharacsDisplayLineRangeAttributeMapList.h>
#include <nds/characteristics/instantiations/CharacsDisplayLineRangeAttributeSetList.h>
#include <nds/characteristics/metadata/DisplayLineCharacsLayerContent.h>
#include <nds/core/geometry/CoordShift.h>
#include <nds/system/types/LayerType.h>

namespace nds
{
namespace characteristics
{
namespace layer
{

class DisplayLineCharacteristicsLayer
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getContent()
        {
            return m_content_;
        }

        ::zserio::DeltaContext& getShift()
        {
            return m_shift_;
        }

        ::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeMapList::ZserioPackingContext& getCharacsDisplayLineRangeMaps()
        {
            return m_characsDisplayLineRangeMaps_;
        }

        ::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeMapList::ZserioPackingContext& getCharacsDisplayLinePositionMaps()
        {
            return m_characsDisplayLinePositionMaps_;
        }

        ::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeSetList::ZserioPackingContext& getCharacsDisplayLineRangeSets()
        {
            return m_characsDisplayLineRangeSets_;
        }

        ::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeSetList::ZserioPackingContext& getCharacsDisplayLinePositionSets()
        {
            return m_characsDisplayLinePositionSets_;
        }

    private:
        ::zserio::DeltaContext m_content_;
        ::zserio::DeltaContext m_shift_;
        ::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeMapList::ZserioPackingContext m_characsDisplayLineRangeMaps_;
        ::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeMapList::ZserioPackingContext m_characsDisplayLinePositionMaps_;
        ::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeSetList::ZserioPackingContext m_characsDisplayLineRangeSets_;
        ::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeSetList::ZserioPackingContext m_characsDisplayLinePositionSets_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    DisplayLineCharacteristicsLayer() noexcept :
            DisplayLineCharacteristicsLayer(allocator_type())
    {}

    explicit DisplayLineCharacteristicsLayer(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_characsDisplayLineRangeMaps = ::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeMapList,
            typename ZSERIO_T_characsDisplayLinePositionMaps = ::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeMapList,
            typename ZSERIO_T_characsDisplayLineRangeSets = ::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeSetList,
            typename ZSERIO_T_characsDisplayLinePositionSets = ::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeSetList>
    DisplayLineCharacteristicsLayer(
            ::nds::characteristics::metadata::DisplayLineCharacsLayerContent content_,
            ::nds::core::geometry::CoordShift shift_,
            ZSERIO_T_characsDisplayLineRangeMaps&& characsDisplayLineRangeMaps_,
            ZSERIO_T_characsDisplayLinePositionMaps&& characsDisplayLinePositionMaps_,
            ZSERIO_T_characsDisplayLineRangeSets&& characsDisplayLineRangeSets_,
            ZSERIO_T_characsDisplayLinePositionSets&& characsDisplayLinePositionSets_,
            const allocator_type& allocator = allocator_type()) :
            DisplayLineCharacteristicsLayer(allocator)
    {
        m_content_ = content_;
        m_shift_ = shift_;
        m_characsDisplayLineRangeMaps_ = ::std::forward<ZSERIO_T_characsDisplayLineRangeMaps>(characsDisplayLineRangeMaps_);
        m_characsDisplayLinePositionMaps_ = ::std::forward<ZSERIO_T_characsDisplayLinePositionMaps>(characsDisplayLinePositionMaps_);
        m_characsDisplayLineRangeSets_ = ::std::forward<ZSERIO_T_characsDisplayLineRangeSets>(characsDisplayLineRangeSets_);
        m_characsDisplayLinePositionSets_ = ::std::forward<ZSERIO_T_characsDisplayLinePositionSets>(characsDisplayLinePositionSets_);
    }

    explicit DisplayLineCharacteristicsLayer(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit DisplayLineCharacteristicsLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~DisplayLineCharacteristicsLayer() = default;

    DisplayLineCharacteristicsLayer(const DisplayLineCharacteristicsLayer& other);
    DisplayLineCharacteristicsLayer& operator=(const DisplayLineCharacteristicsLayer& other);

    DisplayLineCharacteristicsLayer(DisplayLineCharacteristicsLayer&& other);
    DisplayLineCharacteristicsLayer& operator=(DisplayLineCharacteristicsLayer&& other);

    DisplayLineCharacteristicsLayer(::zserio::PropagateAllocatorT,
            const DisplayLineCharacteristicsLayer& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::characteristics::metadata::DisplayLineCharacsLayerContent getContent() const;
    void setContent(::nds::characteristics::metadata::DisplayLineCharacsLayerContent content_);

    ::nds::core::geometry::CoordShift getShift() const;
    void setShift(::nds::core::geometry::CoordShift shift_);

    const ::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeMapList& getCharacsDisplayLineRangeMaps() const;
    ::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeMapList& getCharacsDisplayLineRangeMaps();
    void setCharacsDisplayLineRangeMaps(const ::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeMapList& characsDisplayLineRangeMaps_);
    void setCharacsDisplayLineRangeMaps(::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeMapList&& characsDisplayLineRangeMaps_);
    bool isCharacsDisplayLineRangeMapsUsed() const;
    bool isCharacsDisplayLineRangeMapsSet() const;
    void resetCharacsDisplayLineRangeMaps();

    const ::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeMapList& getCharacsDisplayLinePositionMaps() const;
    ::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeMapList& getCharacsDisplayLinePositionMaps();
    void setCharacsDisplayLinePositionMaps(const ::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeMapList& characsDisplayLinePositionMaps_);
    void setCharacsDisplayLinePositionMaps(::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeMapList&& characsDisplayLinePositionMaps_);
    bool isCharacsDisplayLinePositionMapsUsed() const;
    bool isCharacsDisplayLinePositionMapsSet() const;
    void resetCharacsDisplayLinePositionMaps();

    const ::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeSetList& getCharacsDisplayLineRangeSets() const;
    ::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeSetList& getCharacsDisplayLineRangeSets();
    void setCharacsDisplayLineRangeSets(const ::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeSetList& characsDisplayLineRangeSets_);
    void setCharacsDisplayLineRangeSets(::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeSetList&& characsDisplayLineRangeSets_);
    bool isCharacsDisplayLineRangeSetsUsed() const;
    bool isCharacsDisplayLineRangeSetsSet() const;
    void resetCharacsDisplayLineRangeSets();

    const ::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeSetList& getCharacsDisplayLinePositionSets() const;
    ::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeSetList& getCharacsDisplayLinePositionSets();
    void setCharacsDisplayLinePositionSets(const ::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeSetList& characsDisplayLinePositionSets_);
    void setCharacsDisplayLinePositionSets(::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeSetList&& characsDisplayLinePositionSets_);
    bool isCharacsDisplayLinePositionSetsUsed() const;
    bool isCharacsDisplayLinePositionSetsSet() const;
    void resetCharacsDisplayLinePositionSets();

    ::nds::system::types::LayerType funcGetLayerType() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const DisplayLineCharacteristicsLayer& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::characteristics::metadata::DisplayLineCharacsLayerContent readContent(::zserio::BitStreamReader& in);
    ::nds::characteristics::metadata::DisplayLineCharacsLayerContent readContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::geometry::CoordShift readShift(::zserio::BitStreamReader& in);
    ::nds::core::geometry::CoordShift readShift(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeMapList> readCharacsDisplayLineRangeMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeMapList> readCharacsDisplayLineRangeMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeMapList> readCharacsDisplayLinePositionMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeMapList> readCharacsDisplayLinePositionMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeSetList> readCharacsDisplayLineRangeSets(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeSetList> readCharacsDisplayLineRangeSets(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeSetList> readCharacsDisplayLinePositionSets(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeSetList> readCharacsDisplayLinePositionSets(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::characteristics::metadata::DisplayLineCharacsLayerContent m_content_;
    ::nds::core::geometry::CoordShift m_shift_;
    ::zserio::InplaceOptionalHolder<::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeMapList> m_characsDisplayLineRangeMaps_;
    ::zserio::InplaceOptionalHolder<::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeMapList> m_characsDisplayLinePositionMaps_;
    ::zserio::InplaceOptionalHolder<::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeSetList> m_characsDisplayLineRangeSets_;
    ::zserio::InplaceOptionalHolder<::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeSetList> m_characsDisplayLinePositionSets_;
};

} // namespace layer
} // namespace characteristics
} // namespace nds

#endif // NDS_CHARACTERISTICS_LAYER_DISPLAY_LINE_CHARACTERISTICS_LAYER_H
