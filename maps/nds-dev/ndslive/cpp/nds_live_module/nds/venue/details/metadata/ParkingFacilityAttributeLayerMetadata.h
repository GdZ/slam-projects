/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_VENUE_DETAILS_METADATA_PARKING_FACILITY_ATTRIBUTE_LAYER_METADATA_H
#define NDS_VENUE_DETAILS_METADATA_PARKING_FACILITY_ATTRIBUTE_LAYER_METADATA_H

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

#include <nds/venue/details/instantiations/ParkingFacilityAttributeMetadata.h>
#include <nds/venue/details/instantiations/ParkingLevelAttributeMetadata.h>
#include <nds/venue/details/instantiations/ParkingRowAttributeMetadata.h>
#include <nds/venue/details/instantiations/ParkingSectionAttributeMetadata.h>
#include <nds/venue/details/instantiations/ParkingSpotAttributeMetadata.h>
#include <nds/venue/details/metadata/ParkingFacilityAttributeLayerContent.h>

namespace nds
{
namespace venue
{
namespace details
{
namespace metadata
{

class ParkingFacilityAttributeLayerMetadata
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getContent()
        {
            return m_content_;
        }

        ::nds::venue::details::instantiations::ParkingFacilityAttributeMetadata::ZserioPackingContext& getParkingFacilityAttributeMetadata()
        {
            return m_parkingFacilityAttributeMetadata_;
        }

        ::nds::venue::details::instantiations::ParkingLevelAttributeMetadata::ZserioPackingContext& getParkingLevelAttributeMetadata()
        {
            return m_parkingLevelAttributeMetadata_;
        }

        ::nds::venue::details::instantiations::ParkingSectionAttributeMetadata::ZserioPackingContext& getParkingSectionAttributeMetadata()
        {
            return m_parkingSectionAttributeMetadata_;
        }

        ::nds::venue::details::instantiations::ParkingRowAttributeMetadata::ZserioPackingContext& getParkingRowAttributeMetadata()
        {
            return m_parkingRowAttributeMetadata_;
        }

        ::nds::venue::details::instantiations::ParkingSpotAttributeMetadata::ZserioPackingContext& getParkingSpotAttributeMetadata()
        {
            return m_parkingSpotAttributeMetadata_;
        }

    private:
        ::zserio::DeltaContext m_content_;
        ::nds::venue::details::instantiations::ParkingFacilityAttributeMetadata::ZserioPackingContext m_parkingFacilityAttributeMetadata_;
        ::nds::venue::details::instantiations::ParkingLevelAttributeMetadata::ZserioPackingContext m_parkingLevelAttributeMetadata_;
        ::nds::venue::details::instantiations::ParkingSectionAttributeMetadata::ZserioPackingContext m_parkingSectionAttributeMetadata_;
        ::nds::venue::details::instantiations::ParkingRowAttributeMetadata::ZserioPackingContext m_parkingRowAttributeMetadata_;
        ::nds::venue::details::instantiations::ParkingSpotAttributeMetadata::ZserioPackingContext m_parkingSpotAttributeMetadata_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    ParkingFacilityAttributeLayerMetadata() noexcept :
            ParkingFacilityAttributeLayerMetadata(allocator_type())
    {}

    explicit ParkingFacilityAttributeLayerMetadata(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_parkingFacilityAttributeMetadata = ::nds::venue::details::instantiations::ParkingFacilityAttributeMetadata,
            typename ZSERIO_T_parkingLevelAttributeMetadata = ::nds::venue::details::instantiations::ParkingLevelAttributeMetadata,
            typename ZSERIO_T_parkingSectionAttributeMetadata = ::nds::venue::details::instantiations::ParkingSectionAttributeMetadata,
            typename ZSERIO_T_parkingRowAttributeMetadata = ::nds::venue::details::instantiations::ParkingRowAttributeMetadata,
            typename ZSERIO_T_parkingSpotAttributeMetadata = ::nds::venue::details::instantiations::ParkingSpotAttributeMetadata>
    ParkingFacilityAttributeLayerMetadata(
            ::nds::venue::details::metadata::ParkingFacilityAttributeLayerContent content_,
            ZSERIO_T_parkingFacilityAttributeMetadata&& parkingFacilityAttributeMetadata_,
            ZSERIO_T_parkingLevelAttributeMetadata&& parkingLevelAttributeMetadata_,
            ZSERIO_T_parkingSectionAttributeMetadata&& parkingSectionAttributeMetadata_,
            ZSERIO_T_parkingRowAttributeMetadata&& parkingRowAttributeMetadata_,
            ZSERIO_T_parkingSpotAttributeMetadata&& parkingSpotAttributeMetadata_,
            const allocator_type& allocator = allocator_type()) :
            ParkingFacilityAttributeLayerMetadata(allocator)
    {
        m_content_ = content_;
        m_parkingFacilityAttributeMetadata_ = ::std::forward<ZSERIO_T_parkingFacilityAttributeMetadata>(parkingFacilityAttributeMetadata_);
        m_parkingLevelAttributeMetadata_ = ::std::forward<ZSERIO_T_parkingLevelAttributeMetadata>(parkingLevelAttributeMetadata_);
        m_parkingSectionAttributeMetadata_ = ::std::forward<ZSERIO_T_parkingSectionAttributeMetadata>(parkingSectionAttributeMetadata_);
        m_parkingRowAttributeMetadata_ = ::std::forward<ZSERIO_T_parkingRowAttributeMetadata>(parkingRowAttributeMetadata_);
        m_parkingSpotAttributeMetadata_ = ::std::forward<ZSERIO_T_parkingSpotAttributeMetadata>(parkingSpotAttributeMetadata_);
    }

    explicit ParkingFacilityAttributeLayerMetadata(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit ParkingFacilityAttributeLayerMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~ParkingFacilityAttributeLayerMetadata() = default;

    ParkingFacilityAttributeLayerMetadata(const ParkingFacilityAttributeLayerMetadata&) = default;
    ParkingFacilityAttributeLayerMetadata& operator=(const ParkingFacilityAttributeLayerMetadata&) = default;

    ParkingFacilityAttributeLayerMetadata(ParkingFacilityAttributeLayerMetadata&&) = default;
    ParkingFacilityAttributeLayerMetadata& operator=(ParkingFacilityAttributeLayerMetadata&&) = default;

    ParkingFacilityAttributeLayerMetadata(::zserio::PropagateAllocatorT,
            const ParkingFacilityAttributeLayerMetadata& other, const allocator_type& allocator);

    ::nds::venue::details::metadata::ParkingFacilityAttributeLayerContent getContent() const;
    void setContent(::nds::venue::details::metadata::ParkingFacilityAttributeLayerContent content_);

    const ::nds::venue::details::instantiations::ParkingFacilityAttributeMetadata& getParkingFacilityAttributeMetadata() const;
    ::nds::venue::details::instantiations::ParkingFacilityAttributeMetadata& getParkingFacilityAttributeMetadata();
    void setParkingFacilityAttributeMetadata(const ::nds::venue::details::instantiations::ParkingFacilityAttributeMetadata& parkingFacilityAttributeMetadata_);
    void setParkingFacilityAttributeMetadata(::nds::venue::details::instantiations::ParkingFacilityAttributeMetadata&& parkingFacilityAttributeMetadata_);
    bool isParkingFacilityAttributeMetadataUsed() const;
    bool isParkingFacilityAttributeMetadataSet() const;
    void resetParkingFacilityAttributeMetadata();

    const ::nds::venue::details::instantiations::ParkingLevelAttributeMetadata& getParkingLevelAttributeMetadata() const;
    ::nds::venue::details::instantiations::ParkingLevelAttributeMetadata& getParkingLevelAttributeMetadata();
    void setParkingLevelAttributeMetadata(const ::nds::venue::details::instantiations::ParkingLevelAttributeMetadata& parkingLevelAttributeMetadata_);
    void setParkingLevelAttributeMetadata(::nds::venue::details::instantiations::ParkingLevelAttributeMetadata&& parkingLevelAttributeMetadata_);
    bool isParkingLevelAttributeMetadataUsed() const;
    bool isParkingLevelAttributeMetadataSet() const;
    void resetParkingLevelAttributeMetadata();

    const ::nds::venue::details::instantiations::ParkingSectionAttributeMetadata& getParkingSectionAttributeMetadata() const;
    ::nds::venue::details::instantiations::ParkingSectionAttributeMetadata& getParkingSectionAttributeMetadata();
    void setParkingSectionAttributeMetadata(const ::nds::venue::details::instantiations::ParkingSectionAttributeMetadata& parkingSectionAttributeMetadata_);
    void setParkingSectionAttributeMetadata(::nds::venue::details::instantiations::ParkingSectionAttributeMetadata&& parkingSectionAttributeMetadata_);
    bool isParkingSectionAttributeMetadataUsed() const;
    bool isParkingSectionAttributeMetadataSet() const;
    void resetParkingSectionAttributeMetadata();

    const ::nds::venue::details::instantiations::ParkingRowAttributeMetadata& getParkingRowAttributeMetadata() const;
    ::nds::venue::details::instantiations::ParkingRowAttributeMetadata& getParkingRowAttributeMetadata();
    void setParkingRowAttributeMetadata(const ::nds::venue::details::instantiations::ParkingRowAttributeMetadata& parkingRowAttributeMetadata_);
    void setParkingRowAttributeMetadata(::nds::venue::details::instantiations::ParkingRowAttributeMetadata&& parkingRowAttributeMetadata_);
    bool isParkingRowAttributeMetadataUsed() const;
    bool isParkingRowAttributeMetadataSet() const;
    void resetParkingRowAttributeMetadata();

    const ::nds::venue::details::instantiations::ParkingSpotAttributeMetadata& getParkingSpotAttributeMetadata() const;
    ::nds::venue::details::instantiations::ParkingSpotAttributeMetadata& getParkingSpotAttributeMetadata();
    void setParkingSpotAttributeMetadata(const ::nds::venue::details::instantiations::ParkingSpotAttributeMetadata& parkingSpotAttributeMetadata_);
    void setParkingSpotAttributeMetadata(::nds::venue::details::instantiations::ParkingSpotAttributeMetadata&& parkingSpotAttributeMetadata_);
    bool isParkingSpotAttributeMetadataUsed() const;
    bool isParkingSpotAttributeMetadataSet() const;
    void resetParkingSpotAttributeMetadata();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const ParkingFacilityAttributeLayerMetadata& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::venue::details::metadata::ParkingFacilityAttributeLayerContent readContent(::zserio::BitStreamReader& in);
    ::nds::venue::details::metadata::ParkingFacilityAttributeLayerContent readContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::venue::details::instantiations::ParkingFacilityAttributeMetadata> readParkingFacilityAttributeMetadata(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::venue::details::instantiations::ParkingFacilityAttributeMetadata> readParkingFacilityAttributeMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::venue::details::instantiations::ParkingLevelAttributeMetadata> readParkingLevelAttributeMetadata(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::venue::details::instantiations::ParkingLevelAttributeMetadata> readParkingLevelAttributeMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::venue::details::instantiations::ParkingSectionAttributeMetadata> readParkingSectionAttributeMetadata(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::venue::details::instantiations::ParkingSectionAttributeMetadata> readParkingSectionAttributeMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::venue::details::instantiations::ParkingRowAttributeMetadata> readParkingRowAttributeMetadata(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::venue::details::instantiations::ParkingRowAttributeMetadata> readParkingRowAttributeMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::venue::details::instantiations::ParkingSpotAttributeMetadata> readParkingSpotAttributeMetadata(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::venue::details::instantiations::ParkingSpotAttributeMetadata> readParkingSpotAttributeMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::venue::details::metadata::ParkingFacilityAttributeLayerContent m_content_;
    ::zserio::InplaceOptionalHolder<::nds::venue::details::instantiations::ParkingFacilityAttributeMetadata> m_parkingFacilityAttributeMetadata_;
    ::zserio::InplaceOptionalHolder<::nds::venue::details::instantiations::ParkingLevelAttributeMetadata> m_parkingLevelAttributeMetadata_;
    ::zserio::InplaceOptionalHolder<::nds::venue::details::instantiations::ParkingSectionAttributeMetadata> m_parkingSectionAttributeMetadata_;
    ::zserio::InplaceOptionalHolder<::nds::venue::details::instantiations::ParkingRowAttributeMetadata> m_parkingRowAttributeMetadata_;
    ::zserio::InplaceOptionalHolder<::nds::venue::details::instantiations::ParkingSpotAttributeMetadata> m_parkingSpotAttributeMetadata_;
};

} // namespace metadata
} // namespace details
} // namespace venue
} // namespace nds

#endif // NDS_VENUE_DETAILS_METADATA_PARKING_FACILITY_ATTRIBUTE_LAYER_METADATA_H
