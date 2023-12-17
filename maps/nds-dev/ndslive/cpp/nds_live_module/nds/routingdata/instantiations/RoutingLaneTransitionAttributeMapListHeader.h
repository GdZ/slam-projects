/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTINGDATA_INSTANTIATIONS_ROUTING_LANE_TRANSITION_ATTRIBUTE_MAP_LIST_HEADER_H
#define NDS_ROUTINGDATA_INSTANTIATIONS_ROUTING_LANE_TRANSITION_ATTRIBUTE_MAP_LIST_HEADER_H

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

#include <nds/core/attributemap/ConditionTypeCodeCollection.h>
#include <nds/routingdata/attributes/RoutingLaneTransitionAttributeType.h>

namespace nds
{
namespace routingdata
{
namespace instantiations
{

class RoutingLaneTransitionAttributeMapListHeader
{
public:
    class ZserioPackingContext
    {
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RoutingLaneTransitionAttributeMapListHeader() noexcept :
            RoutingLaneTransitionAttributeMapListHeader(allocator_type())
    {}

    explicit RoutingLaneTransitionAttributeMapListHeader(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributeTypeCode = ::zserio::vector<::nds::routingdata::attributes::RoutingLaneTransitionAttributeType>,
            typename ZSERIO_T_conditionType = ::zserio::vector<::nds::core::attributemap::ConditionTypeCodeCollection>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_attributeTypeCode, RoutingLaneTransitionAttributeMapListHeader, allocator_type> = 0>
    RoutingLaneTransitionAttributeMapListHeader(
            ZSERIO_T_attributeTypeCode&& attributeTypeCode_,
            ZSERIO_T_conditionType&& conditionType_,
            const allocator_type& allocator = allocator_type()) :
            RoutingLaneTransitionAttributeMapListHeader(allocator)
    {
        m_attributeTypeCode_ = ZserioArrayType_attributeTypeCode(::std::forward<ZSERIO_T_attributeTypeCode>(attributeTypeCode_));
        m_conditionType_ = ZserioArrayType_conditionType(::std::forward<ZSERIO_T_conditionType>(conditionType_));
    }

    explicit RoutingLaneTransitionAttributeMapListHeader(::zserio::BitStreamReader& in,
            uint16_t numMaps_, const allocator_type& allocator = allocator_type());
    explicit RoutingLaneTransitionAttributeMapListHeader(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            uint16_t numMaps_, const allocator_type& allocator = allocator_type());

    ~RoutingLaneTransitionAttributeMapListHeader() = default;

    RoutingLaneTransitionAttributeMapListHeader(const RoutingLaneTransitionAttributeMapListHeader& other);
    RoutingLaneTransitionAttributeMapListHeader& operator=(const RoutingLaneTransitionAttributeMapListHeader& other);

    RoutingLaneTransitionAttributeMapListHeader(RoutingLaneTransitionAttributeMapListHeader&& other);
    RoutingLaneTransitionAttributeMapListHeader& operator=(RoutingLaneTransitionAttributeMapListHeader&& other);

    RoutingLaneTransitionAttributeMapListHeader(::zserio::PropagateAllocatorT,
            const RoutingLaneTransitionAttributeMapListHeader& other, const allocator_type& allocator);

    void initialize(
            uint16_t numMaps_);
    bool isInitialized() const;

    uint16_t getNumMaps() const;

    const ::zserio::vector<::nds::routingdata::attributes::RoutingLaneTransitionAttributeType>& getAttributeTypeCode() const;
    ::zserio::vector<::nds::routingdata::attributes::RoutingLaneTransitionAttributeType>& getAttributeTypeCode();
    void setAttributeTypeCode(const ::zserio::vector<::nds::routingdata::attributes::RoutingLaneTransitionAttributeType>& attributeTypeCode_);
    void setAttributeTypeCode(::zserio::vector<::nds::routingdata::attributes::RoutingLaneTransitionAttributeType>&& attributeTypeCode_);

    const ::zserio::vector<::nds::core::attributemap::ConditionTypeCodeCollection>& getConditionType() const;
    ::zserio::vector<::nds::core::attributemap::ConditionTypeCodeCollection>& getConditionType();
    void setConditionType(const ::zserio::vector<::nds::core::attributemap::ConditionTypeCodeCollection>& conditionType_);
    void setConditionType(::zserio::vector<::nds::core::attributemap::ConditionTypeCodeCollection>&& conditionType_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RoutingLaneTransitionAttributeMapListHeader& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_conditionType
    {
    public:
        using OwnerType = RoutingLaneTransitionAttributeMapListHeader;

        static void create(RoutingLaneTransitionAttributeMapListHeader& owner,
                ::zserio::vector<::nds::core::attributemap::ConditionTypeCodeCollection>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(RoutingLaneTransitionAttributeMapListHeader& owner,
                ::zserio::vector<::nds::core::attributemap::ConditionTypeCodeCollection>& array,
                ::nds::core::attributemap::ConditionTypeCodeCollection::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_attributeTypeCode = ::zserio::Array<::zserio::vector<::nds::routingdata::attributes::RoutingLaneTransitionAttributeType>, ::zserio::EnumArrayTraits<::nds::routingdata::attributes::RoutingLaneTransitionAttributeType>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_conditionType = ::zserio::Array<::zserio::vector<::nds::core::attributemap::ConditionTypeCodeCollection>, ::zserio::ObjectArrayTraits<::nds::core::attributemap::ConditionTypeCodeCollection, ZserioElementFactory_conditionType>, ::zserio::ArrayType::NORMAL>;

    ZserioArrayType_attributeTypeCode readAttributeTypeCode(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_attributeTypeCode readAttributeTypeCode(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_conditionType readConditionType(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_conditionType readConditionType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    uint16_t m_numMaps_;
    bool m_isInitialized;
    ZserioArrayType_attributeTypeCode m_attributeTypeCode_;
    ZserioArrayType_conditionType m_conditionType_;
};

} // namespace instantiations
} // namespace routingdata
} // namespace nds

#endif // NDS_ROUTINGDATA_INSTANTIATIONS_ROUTING_LANE_TRANSITION_ATTRIBUTE_MAP_LIST_HEADER_H
