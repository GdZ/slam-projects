/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_INSTANTIATIONS_RULES_ROAD_POSITION_ATTRIBUTE_METADATA_H
#define NDS_RULES_INSTANTIATIONS_RULES_ROAD_POSITION_ATTRIBUTE_METADATA_H

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
#include <nds/rules/attributes/RulesRoadPositionAttributeType.h>
#include <nds/rules/properties/RulesPropertyType.h>

namespace nds
{
namespace rules
{
namespace instantiations
{

class RulesRoadPositionAttributeMetadata
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

    RulesRoadPositionAttributeMetadata() noexcept :
            RulesRoadPositionAttributeMetadata(allocator_type())
    {}

    explicit RulesRoadPositionAttributeMetadata(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_availableAttributes = ::zserio::vector<::nds::rules::attributes::RulesRoadPositionAttributeType>,
            typename ZSERIO_T_availableProperties = ::zserio::vector<::nds::rules::properties::RulesPropertyType>,
            typename ZSERIO_T_availableConditions = ::nds::core::attributemap::ConditionTypeCodeCollection,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_availableAttributes, RulesRoadPositionAttributeMetadata, allocator_type> = 0>
    RulesRoadPositionAttributeMetadata(
            ZSERIO_T_availableAttributes&& availableAttributes_,
            ZSERIO_T_availableProperties&& availableProperties_,
            ZSERIO_T_availableConditions&& availableConditions_,
            const allocator_type& allocator = allocator_type()) :
            RulesRoadPositionAttributeMetadata(allocator)
    {
        m_availableAttributes_ = ZserioArrayType_availableAttributes(::std::forward<ZSERIO_T_availableAttributes>(availableAttributes_));
        m_availableProperties_ = ZserioArrayType_availableProperties(::std::forward<ZSERIO_T_availableProperties>(availableProperties_));
        m_availableConditions_ = ::std::forward<ZSERIO_T_availableConditions>(availableConditions_);
    }

    explicit RulesRoadPositionAttributeMetadata(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RulesRoadPositionAttributeMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RulesRoadPositionAttributeMetadata() = default;

    RulesRoadPositionAttributeMetadata(const RulesRoadPositionAttributeMetadata&) = default;
    RulesRoadPositionAttributeMetadata& operator=(const RulesRoadPositionAttributeMetadata&) = default;

    RulesRoadPositionAttributeMetadata(RulesRoadPositionAttributeMetadata&&) = default;
    RulesRoadPositionAttributeMetadata& operator=(RulesRoadPositionAttributeMetadata&&) = default;

    RulesRoadPositionAttributeMetadata(::zserio::PropagateAllocatorT,
            const RulesRoadPositionAttributeMetadata& other, const allocator_type& allocator);

    const ::zserio::vector<::nds::rules::attributes::RulesRoadPositionAttributeType>& getAvailableAttributes() const;
    ::zserio::vector<::nds::rules::attributes::RulesRoadPositionAttributeType>& getAvailableAttributes();
    void setAvailableAttributes(const ::zserio::vector<::nds::rules::attributes::RulesRoadPositionAttributeType>& availableAttributes_);
    void setAvailableAttributes(::zserio::vector<::nds::rules::attributes::RulesRoadPositionAttributeType>&& availableAttributes_);

    const ::zserio::vector<::nds::rules::properties::RulesPropertyType>& getAvailableProperties() const;
    ::zserio::vector<::nds::rules::properties::RulesPropertyType>& getAvailableProperties();
    void setAvailableProperties(const ::zserio::vector<::nds::rules::properties::RulesPropertyType>& availableProperties_);
    void setAvailableProperties(::zserio::vector<::nds::rules::properties::RulesPropertyType>&& availableProperties_);

    const ::nds::core::attributemap::ConditionTypeCodeCollection& getAvailableConditions() const;
    ::nds::core::attributemap::ConditionTypeCodeCollection& getAvailableConditions();
    void setAvailableConditions(const ::nds::core::attributemap::ConditionTypeCodeCollection& availableConditions_);
    void setAvailableConditions(::nds::core::attributemap::ConditionTypeCodeCollection&& availableConditions_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RulesRoadPositionAttributeMetadata& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_availableProperties
    {
    public:
        using OwnerType = RulesRoadPositionAttributeMetadata;

        static void create(RulesRoadPositionAttributeMetadata& owner,
                ::zserio::vector<::nds::rules::properties::RulesPropertyType>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(RulesRoadPositionAttributeMetadata& owner,
                ::zserio::vector<::nds::rules::properties::RulesPropertyType>& array,
                ::nds::rules::properties::RulesPropertyType::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_availableAttributes = ::zserio::Array<::zserio::vector<::nds::rules::attributes::RulesRoadPositionAttributeType>, ::zserio::EnumArrayTraits<::nds::rules::attributes::RulesRoadPositionAttributeType>, ::zserio::ArrayType::AUTO>;
    using ZserioArrayType_availableProperties = ::zserio::Array<::zserio::vector<::nds::rules::properties::RulesPropertyType>, ::zserio::ObjectArrayTraits<::nds::rules::properties::RulesPropertyType, ZserioElementFactory_availableProperties>, ::zserio::ArrayType::AUTO>;

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
} // namespace rules
} // namespace nds

#endif // NDS_RULES_INSTANTIATIONS_RULES_ROAD_POSITION_ATTRIBUTE_METADATA_H