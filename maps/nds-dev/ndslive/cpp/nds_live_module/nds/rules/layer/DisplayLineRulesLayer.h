/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_LAYER_DISPLAY_LINE_RULES_LAYER_H
#define NDS_RULES_LAYER_DISPLAY_LINE_RULES_LAYER_H

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

#include <nds/core/geometry/CoordShift.h>
#include <nds/rules/instantiations/RulesDisplayLinePositionAttributeMapList.h>
#include <nds/rules/instantiations/RulesDisplayLinePositionAttributeSetList.h>
#include <nds/rules/instantiations/RulesDisplayLineRangeAttributeMapList.h>
#include <nds/rules/instantiations/RulesDisplayLineRangeAttributeSetList.h>
#include <nds/rules/metadata/DisplayLineRulesLayerContent.h>
#include <nds/system/types/LayerType.h>

namespace nds
{
namespace rules
{
namespace layer
{

class DisplayLineRulesLayer
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

        ::nds::rules::instantiations::RulesDisplayLineRangeAttributeMapList::ZserioPackingContext& getDisplayLineRangeAttributeMaps()
        {
            return m_displayLineRangeAttributeMaps_;
        }

        ::nds::rules::instantiations::RulesDisplayLinePositionAttributeMapList::ZserioPackingContext& getDisplayLinePositionAttributeMaps()
        {
            return m_displayLinePositionAttributeMaps_;
        }

        ::nds::rules::instantiations::RulesDisplayLineRangeAttributeSetList::ZserioPackingContext& getDisplayLineRangeAttributeSets()
        {
            return m_displayLineRangeAttributeSets_;
        }

        ::nds::rules::instantiations::RulesDisplayLinePositionAttributeSetList::ZserioPackingContext& getDisplayLinePositionAttributeSets()
        {
            return m_displayLinePositionAttributeSets_;
        }

    private:
        ::zserio::DeltaContext m_content_;
        ::zserio::DeltaContext m_shift_;
        ::nds::rules::instantiations::RulesDisplayLineRangeAttributeMapList::ZserioPackingContext m_displayLineRangeAttributeMaps_;
        ::nds::rules::instantiations::RulesDisplayLinePositionAttributeMapList::ZserioPackingContext m_displayLinePositionAttributeMaps_;
        ::nds::rules::instantiations::RulesDisplayLineRangeAttributeSetList::ZserioPackingContext m_displayLineRangeAttributeSets_;
        ::nds::rules::instantiations::RulesDisplayLinePositionAttributeSetList::ZserioPackingContext m_displayLinePositionAttributeSets_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    DisplayLineRulesLayer() noexcept :
            DisplayLineRulesLayer(allocator_type())
    {}

    explicit DisplayLineRulesLayer(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_displayLineRangeAttributeMaps = ::nds::rules::instantiations::RulesDisplayLineRangeAttributeMapList,
            typename ZSERIO_T_displayLinePositionAttributeMaps = ::nds::rules::instantiations::RulesDisplayLinePositionAttributeMapList,
            typename ZSERIO_T_displayLineRangeAttributeSets = ::nds::rules::instantiations::RulesDisplayLineRangeAttributeSetList,
            typename ZSERIO_T_displayLinePositionAttributeSets = ::nds::rules::instantiations::RulesDisplayLinePositionAttributeSetList>
    DisplayLineRulesLayer(
            ::nds::rules::metadata::DisplayLineRulesLayerContent content_,
            ::nds::core::geometry::CoordShift shift_,
            ZSERIO_T_displayLineRangeAttributeMaps&& displayLineRangeAttributeMaps_,
            ZSERIO_T_displayLinePositionAttributeMaps&& displayLinePositionAttributeMaps_,
            ZSERIO_T_displayLineRangeAttributeSets&& displayLineRangeAttributeSets_,
            ZSERIO_T_displayLinePositionAttributeSets&& displayLinePositionAttributeSets_,
            const allocator_type& allocator = allocator_type()) :
            DisplayLineRulesLayer(allocator)
    {
        m_content_ = content_;
        m_shift_ = shift_;
        m_displayLineRangeAttributeMaps_ = ::std::forward<ZSERIO_T_displayLineRangeAttributeMaps>(displayLineRangeAttributeMaps_);
        m_displayLinePositionAttributeMaps_ = ::std::forward<ZSERIO_T_displayLinePositionAttributeMaps>(displayLinePositionAttributeMaps_);
        m_displayLineRangeAttributeSets_ = ::std::forward<ZSERIO_T_displayLineRangeAttributeSets>(displayLineRangeAttributeSets_);
        m_displayLinePositionAttributeSets_ = ::std::forward<ZSERIO_T_displayLinePositionAttributeSets>(displayLinePositionAttributeSets_);
    }

    explicit DisplayLineRulesLayer(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit DisplayLineRulesLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~DisplayLineRulesLayer() = default;

    DisplayLineRulesLayer(const DisplayLineRulesLayer& other);
    DisplayLineRulesLayer& operator=(const DisplayLineRulesLayer& other);

    DisplayLineRulesLayer(DisplayLineRulesLayer&& other);
    DisplayLineRulesLayer& operator=(DisplayLineRulesLayer&& other);

    DisplayLineRulesLayer(::zserio::PropagateAllocatorT,
            const DisplayLineRulesLayer& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::rules::metadata::DisplayLineRulesLayerContent getContent() const;
    void setContent(::nds::rules::metadata::DisplayLineRulesLayerContent content_);

    ::nds::core::geometry::CoordShift getShift() const;
    void setShift(::nds::core::geometry::CoordShift shift_);

    const ::nds::rules::instantiations::RulesDisplayLineRangeAttributeMapList& getDisplayLineRangeAttributeMaps() const;
    ::nds::rules::instantiations::RulesDisplayLineRangeAttributeMapList& getDisplayLineRangeAttributeMaps();
    void setDisplayLineRangeAttributeMaps(const ::nds::rules::instantiations::RulesDisplayLineRangeAttributeMapList& displayLineRangeAttributeMaps_);
    void setDisplayLineRangeAttributeMaps(::nds::rules::instantiations::RulesDisplayLineRangeAttributeMapList&& displayLineRangeAttributeMaps_);
    bool isDisplayLineRangeAttributeMapsUsed() const;
    bool isDisplayLineRangeAttributeMapsSet() const;
    void resetDisplayLineRangeAttributeMaps();

    const ::nds::rules::instantiations::RulesDisplayLinePositionAttributeMapList& getDisplayLinePositionAttributeMaps() const;
    ::nds::rules::instantiations::RulesDisplayLinePositionAttributeMapList& getDisplayLinePositionAttributeMaps();
    void setDisplayLinePositionAttributeMaps(const ::nds::rules::instantiations::RulesDisplayLinePositionAttributeMapList& displayLinePositionAttributeMaps_);
    void setDisplayLinePositionAttributeMaps(::nds::rules::instantiations::RulesDisplayLinePositionAttributeMapList&& displayLinePositionAttributeMaps_);
    bool isDisplayLinePositionAttributeMapsUsed() const;
    bool isDisplayLinePositionAttributeMapsSet() const;
    void resetDisplayLinePositionAttributeMaps();

    const ::nds::rules::instantiations::RulesDisplayLineRangeAttributeSetList& getDisplayLineRangeAttributeSets() const;
    ::nds::rules::instantiations::RulesDisplayLineRangeAttributeSetList& getDisplayLineRangeAttributeSets();
    void setDisplayLineRangeAttributeSets(const ::nds::rules::instantiations::RulesDisplayLineRangeAttributeSetList& displayLineRangeAttributeSets_);
    void setDisplayLineRangeAttributeSets(::nds::rules::instantiations::RulesDisplayLineRangeAttributeSetList&& displayLineRangeAttributeSets_);
    bool isDisplayLineRangeAttributeSetsUsed() const;
    bool isDisplayLineRangeAttributeSetsSet() const;
    void resetDisplayLineRangeAttributeSets();

    const ::nds::rules::instantiations::RulesDisplayLinePositionAttributeSetList& getDisplayLinePositionAttributeSets() const;
    ::nds::rules::instantiations::RulesDisplayLinePositionAttributeSetList& getDisplayLinePositionAttributeSets();
    void setDisplayLinePositionAttributeSets(const ::nds::rules::instantiations::RulesDisplayLinePositionAttributeSetList& displayLinePositionAttributeSets_);
    void setDisplayLinePositionAttributeSets(::nds::rules::instantiations::RulesDisplayLinePositionAttributeSetList&& displayLinePositionAttributeSets_);
    bool isDisplayLinePositionAttributeSetsUsed() const;
    bool isDisplayLinePositionAttributeSetsSet() const;
    void resetDisplayLinePositionAttributeSets();

    ::nds::system::types::LayerType funcGetLayerType() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const DisplayLineRulesLayer& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::rules::metadata::DisplayLineRulesLayerContent readContent(::zserio::BitStreamReader& in);
    ::nds::rules::metadata::DisplayLineRulesLayerContent readContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::geometry::CoordShift readShift(::zserio::BitStreamReader& in);
    ::nds::core::geometry::CoordShift readShift(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesDisplayLineRangeAttributeMapList> readDisplayLineRangeAttributeMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesDisplayLineRangeAttributeMapList> readDisplayLineRangeAttributeMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesDisplayLinePositionAttributeMapList> readDisplayLinePositionAttributeMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesDisplayLinePositionAttributeMapList> readDisplayLinePositionAttributeMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesDisplayLineRangeAttributeSetList> readDisplayLineRangeAttributeSets(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesDisplayLineRangeAttributeSetList> readDisplayLineRangeAttributeSets(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesDisplayLinePositionAttributeSetList> readDisplayLinePositionAttributeSets(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesDisplayLinePositionAttributeSetList> readDisplayLinePositionAttributeSets(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::rules::metadata::DisplayLineRulesLayerContent m_content_;
    ::nds::core::geometry::CoordShift m_shift_;
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesDisplayLineRangeAttributeMapList> m_displayLineRangeAttributeMaps_;
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesDisplayLinePositionAttributeMapList> m_displayLinePositionAttributeMaps_;
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesDisplayLineRangeAttributeSetList> m_displayLineRangeAttributeSets_;
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesDisplayLinePositionAttributeSetList> m_displayLinePositionAttributeSets_;
};

} // namespace layer
} // namespace rules
} // namespace nds

#endif // NDS_RULES_LAYER_DISPLAY_LINE_RULES_LAYER_H
