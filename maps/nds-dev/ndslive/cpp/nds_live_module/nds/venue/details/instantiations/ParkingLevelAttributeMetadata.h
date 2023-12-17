/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_VENUE_DETAILS_INSTANTIATIONS_PARKING_LEVEL_ATTRIBUTE_METADATA_H
#define NDS_VENUE_DETAILS_INSTANTIATIONS_PARKING_LEVEL_ATTRIBUTE_METADATA_H

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
#include <zserio/Vector.h>

#include <nds/core/attributemap/ConditionTypeCodeCollection.h>
#include <nds/venue/details/attributes/ParkingLevelAttributeType.h>
#include <nds/venue/details/properties/VenuePropertyType.h>

namespace nds
{
namespace venue
{
namespace details
{
namespace instantiations
{

class ParkingLevelAttributeMetadata
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::core::attributemap::ConditionTypeCodeCollection::ZserioPackingContext& getAvailableConditions()
        {
            return m_availableConditions_;
        }

    private:
        ::nds::core::attributemap::ConditionTypeCodeCollection::ZserioPackingContext m_availableConditions_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    ParkingLevelAttributeMetadata() noexcept :
            ParkingLevelAttributeMetadata(allocator_type())
    {}

    explicit ParkingLevelAttributeMetadata(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_availableAttributes = ::zserio::vector<::nds::venue::details::attributes::ParkingLevelAttributeType>,
            typename ZSERIO_T_availableProperties = ::zserio::vector<::nds::venue::details::properties::VenuePropertyType>,
            typename ZSERIO_T_availableConditions = ::nds::core::attributemap::ConditionTypeCodeCollection,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_availableAttributes, ParkingLevelAttributeMetadata, allocator_type> = 0>
    ParkingLevelAttributeMetadata(
            ZSERIO_T_availableAttributes&& availableAttributes_,
            ZSERIO_T_availableProperties&& availableProperties_,
            ZSERIO_T_availableConditions&& availableConditions_,
            const allocator_type& allocator = allocator_type()) :
            ParkingLevelAttributeMetadata(allocator)
    {
        m_availableAttributes_ = ZserioArrayType_availableAttributes(::std::forward<ZSERIO_T_availableAttributes>(availableAttributes_));
        m_availableProperties_ = ZserioArrayType_availableProperties(::std::forward<ZSERIO_T_availableProperties>(availableProperties_));
        m_availableConditions_ = ::std::forward<ZSERIO_T_availableConditions>(availableConditions_);
    }

    explicit ParkingLevelAttributeMetadata(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit ParkingLevelAttributeMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~ParkingLevelAttributeMetadata() = default;

    ParkingLevelAttributeMetadata(const ParkingLevelAttributeMetadata&) = default;
    ParkingLevelAttributeMetadata& operator=(const ParkingLevelAttributeMetadata&) = default;

    ParkingLevelAttributeMetadata(ParkingLevelAttributeMetadata&&) = default;
    ParkingLevelAttributeMetadata& operator=(ParkingLevelAttributeMetadata&&) = default;

    ParkingLevelAttributeMetadata(::zserio::PropagateAllocatorT,
            const ParkingLevelAttributeMetadata& other, const allocator_type& allocator);

    const ::zserio::vector<::nds::venue::details::attributes::ParkingLevelAttributeType>& getAvailableAttributes() const;
    ::zserio::vector<::nds::venue::details::attributes::ParkingLevelAttributeType>& getAvailableAttributes();
    void setAvailableAttributes(const ::zserio::vector<::nds::venue::details::attributes::ParkingLevelAttributeType>& availableAttributes_);
    void setAvailableAttributes(::zserio::vector<::nds::venue::details::attributes::ParkingLevelAttributeType>&& availableAttributes_);

    const ::zserio::vector<::nds::venue::details::properties::VenuePropertyType>& getAvailableProperties() const;
    ::zserio::vector<::nds::venue::details::properties::VenuePropertyType>& getAvailableProperties();
    void setAvailableProperties(const ::zserio::vector<::nds::venue::details::properties::VenuePropertyType>& availableProperties_);
    void setAvailableProperties(::zserio::vector<::nds::venue::details::properties::VenuePropertyType>&& availableProperties_);

    const ::nds::core::attributemap::ConditionTypeCodeCollection& getAvailableConditions() const;
    ::nds::core::attributemap::ConditionTypeCodeCollection& getAvailableConditions();
    void setAvailableConditions(const ::nds::core::attributemap::ConditionTypeCodeCollection& availableConditions_);
    void setAvailableConditions(::nds::core::attributemap::ConditionTypeCodeCollection&& availableConditions_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const ParkingLevelAttributeMetadata& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_availableProperties
    {
    public:
        using OwnerType = ParkingLevelAttributeMetadata;

        static void create(ParkingLevelAttributeMetadata& owner,
                ::zserio::vector<::nds::venue::details::properties::VenuePropertyType>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(ParkingLevelAttributeMetadata& owner,
                ::zserio::vector<::nds::venue::details::properties::VenuePropertyType>& array,
                ::nds::venue::details::properties::VenuePropertyType::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_availableAttributes = ::zserio::Array<::zserio::vector<::nds::venue::details::attributes::ParkingLevelAttributeType>, ::zserio::EnumArrayTraits<::nds::venue::details::attributes::ParkingLevelAttributeType>, ::zserio::ArrayType::AUTO>;
    using ZserioArrayType_availableProperties = ::zserio::Array<::zserio::vector<::nds::venue::details::properties::VenuePropertyType>, ::zserio::ObjectArrayTraits<::nds::venue::details::properties::VenuePropertyType, ZserioElementFactory_availableProperties>, ::zserio::ArrayType::AUTO>;

    ZserioArrayType_availableAttributes readAvailableAttributes(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_availableAttributes readAvailableAttributes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_availableProperties readAvailableProperties(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_availableProperties readAvailableProperties(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::core::attributemap::ConditionTypeCodeCollection readAvailableConditions(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::attributemap::ConditionTypeCodeCollection readAvailableConditions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ZserioArrayType_availableAttributes m_availableAttributes_;
    ZserioArrayType_availableProperties m_availableProperties_;
    ::nds::core::attributemap::ConditionTypeCodeCollection m_availableConditions_;
};

} // namespace instantiations
} // namespace details
} // namespace venue
} // namespace nds

#endif // NDS_VENUE_DETAILS_INSTANTIATIONS_PARKING_LEVEL_ATTRIBUTE_METADATA_H
