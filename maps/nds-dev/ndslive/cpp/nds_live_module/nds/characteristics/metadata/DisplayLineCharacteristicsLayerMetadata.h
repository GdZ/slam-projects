/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CHARACTERISTICS_METADATA_DISPLAY_LINE_CHARACTERISTICS_LAYER_METADATA_H
#define NDS_CHARACTERISTICS_METADATA_DISPLAY_LINE_CHARACTERISTICS_LAYER_METADATA_H

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

#include <nds/characteristics/instantiations/CharacsDisplayLinePositionAttributeMetadata.h>
#include <nds/characteristics/instantiations/CharacsDisplayLineRangeAttributeMetadata.h>
#include <nds/characteristics/metadata/DisplayLineCharacsLayerContent.h>
#include <nds/characteristics/metadata/RoadLocationProviderDetails.h>

namespace nds
{
namespace characteristics
{
namespace metadata
{

class DisplayLineCharacteristicsLayerMetadata
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getContent()
        {
            return m_content_;
        }

        ::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeMetadata::ZserioPackingContext& getDisplayLineRangeAttributeMetadata()
        {
            return m_displayLineRangeAttributeMetadata_;
        }

        ::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeMetadata::ZserioPackingContext& getDisplayLinePositionAttributeMetadata()
        {
            return m_displayLinePositionAttributeMetadata_;
        }

        ::nds::characteristics::metadata::RoadLocationProviderDetails::ZserioPackingContext& getRoadLocationProviderDetails()
        {
            return m_roadLocationProviderDetails_;
        }

    private:
        ::zserio::DeltaContext m_content_;
        ::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeMetadata::ZserioPackingContext m_displayLineRangeAttributeMetadata_;
        ::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeMetadata::ZserioPackingContext m_displayLinePositionAttributeMetadata_;
        ::nds::characteristics::metadata::RoadLocationProviderDetails::ZserioPackingContext m_roadLocationProviderDetails_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    DisplayLineCharacteristicsLayerMetadata() noexcept :
            DisplayLineCharacteristicsLayerMetadata(allocator_type())
    {}

    explicit DisplayLineCharacteristicsLayerMetadata(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_displayLineRangeAttributeMetadata = ::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeMetadata,
            typename ZSERIO_T_displayLinePositionAttributeMetadata = ::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeMetadata,
            typename ZSERIO_T_roadLocationProviderDetails = ::nds::characteristics::metadata::RoadLocationProviderDetails>
    DisplayLineCharacteristicsLayerMetadata(
            ::nds::characteristics::metadata::DisplayLineCharacsLayerContent content_,
            ZSERIO_T_displayLineRangeAttributeMetadata&& displayLineRangeAttributeMetadata_,
            ZSERIO_T_displayLinePositionAttributeMetadata&& displayLinePositionAttributeMetadata_,
            ZSERIO_T_roadLocationProviderDetails&& roadLocationProviderDetails_,
            const allocator_type& allocator = allocator_type()) :
            DisplayLineCharacteristicsLayerMetadata(allocator)
    {
        m_content_ = content_;
        m_displayLineRangeAttributeMetadata_ = ::std::forward<ZSERIO_T_displayLineRangeAttributeMetadata>(displayLineRangeAttributeMetadata_);
        m_displayLinePositionAttributeMetadata_ = ::std::forward<ZSERIO_T_displayLinePositionAttributeMetadata>(displayLinePositionAttributeMetadata_);
        m_roadLocationProviderDetails_ = ::std::forward<ZSERIO_T_roadLocationProviderDetails>(roadLocationProviderDetails_);
    }

    explicit DisplayLineCharacteristicsLayerMetadata(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit DisplayLineCharacteristicsLayerMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~DisplayLineCharacteristicsLayerMetadata() = default;

    DisplayLineCharacteristicsLayerMetadata(const DisplayLineCharacteristicsLayerMetadata&) = default;
    DisplayLineCharacteristicsLayerMetadata& operator=(const DisplayLineCharacteristicsLayerMetadata&) = default;

    DisplayLineCharacteristicsLayerMetadata(DisplayLineCharacteristicsLayerMetadata&&) = default;
    DisplayLineCharacteristicsLayerMetadata& operator=(DisplayLineCharacteristicsLayerMetadata&&) = default;

    DisplayLineCharacteristicsLayerMetadata(::zserio::PropagateAllocatorT,
            const DisplayLineCharacteristicsLayerMetadata& other, const allocator_type& allocator);

    ::nds::characteristics::metadata::DisplayLineCharacsLayerContent getContent() const;
    void setContent(::nds::characteristics::metadata::DisplayLineCharacsLayerContent content_);

    const ::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeMetadata& getDisplayLineRangeAttributeMetadata() const;
    ::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeMetadata& getDisplayLineRangeAttributeMetadata();
    void setDisplayLineRangeAttributeMetadata(const ::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeMetadata& displayLineRangeAttributeMetadata_);
    void setDisplayLineRangeAttributeMetadata(::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeMetadata&& displayLineRangeAttributeMetadata_);
    bool isDisplayLineRangeAttributeMetadataUsed() const;
    bool isDisplayLineRangeAttributeMetadataSet() const;
    void resetDisplayLineRangeAttributeMetadata();

    const ::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeMetadata& getDisplayLinePositionAttributeMetadata() const;
    ::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeMetadata& getDisplayLinePositionAttributeMetadata();
    void setDisplayLinePositionAttributeMetadata(const ::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeMetadata& displayLinePositionAttributeMetadata_);
    void setDisplayLinePositionAttributeMetadata(::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeMetadata&& displayLinePositionAttributeMetadata_);
    bool isDisplayLinePositionAttributeMetadataUsed() const;
    bool isDisplayLinePositionAttributeMetadataSet() const;
    void resetDisplayLinePositionAttributeMetadata();

    const ::nds::characteristics::metadata::RoadLocationProviderDetails& getRoadLocationProviderDetails() const;
    ::nds::characteristics::metadata::RoadLocationProviderDetails& getRoadLocationProviderDetails();
    void setRoadLocationProviderDetails(const ::nds::characteristics::metadata::RoadLocationProviderDetails& roadLocationProviderDetails_);
    void setRoadLocationProviderDetails(::nds::characteristics::metadata::RoadLocationProviderDetails&& roadLocationProviderDetails_);
    bool isRoadLocationProviderDetailsUsed() const;
    bool isRoadLocationProviderDetailsSet() const;
    void resetRoadLocationProviderDetails();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const DisplayLineCharacteristicsLayerMetadata& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::characteristics::metadata::DisplayLineCharacsLayerContent readContent(::zserio::BitStreamReader& in);
    ::nds::characteristics::metadata::DisplayLineCharacsLayerContent readContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeMetadata> readDisplayLineRangeAttributeMetadata(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeMetadata> readDisplayLineRangeAttributeMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeMetadata> readDisplayLinePositionAttributeMetadata(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeMetadata> readDisplayLinePositionAttributeMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::characteristics::metadata::RoadLocationProviderDetails> readRoadLocationProviderDetails(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::characteristics::metadata::RoadLocationProviderDetails> readRoadLocationProviderDetails(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::characteristics::metadata::DisplayLineCharacsLayerContent m_content_;
    ::zserio::InplaceOptionalHolder<::nds::characteristics::instantiations::CharacsDisplayLineRangeAttributeMetadata> m_displayLineRangeAttributeMetadata_;
    ::zserio::InplaceOptionalHolder<::nds::characteristics::instantiations::CharacsDisplayLinePositionAttributeMetadata> m_displayLinePositionAttributeMetadata_;
    ::zserio::InplaceOptionalHolder<::nds::characteristics::metadata::RoadLocationProviderDetails> m_roadLocationProviderDetails_;
};

} // namespace metadata
} // namespace characteristics
} // namespace nds

#endif // NDS_CHARACTERISTICS_METADATA_DISPLAY_LINE_CHARACTERISTICS_LAYER_METADATA_H
