/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ADAS_INSTANTIATIONS_ADAS_ROAD_FULL_ATTRIBUTE_H
#define NDS_ADAS_INSTANTIATIONS_ADAS_ROAD_FULL_ATTRIBUTE_H

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

#include <nds/adas/attributes/AdasRoadAttributeType.h>
#include <nds/adas/attributes/AdasRoadAttributeValue.h>
#include <nds/adas/instantiations/AdasPropertyList.h>
#include <nds/core/attributemap/ConditionList.h>

namespace nds
{
namespace adas
{
namespace instantiations
{

class AdasRoadFullAttribute
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getAttributeTypeCode()
        {
            return m_attributeTypeCode_;
        }

        ::nds::adas::attributes::AdasRoadAttributeValue::ZserioPackingContext& getAttributeValue()
        {
            return m_attributeValue_;
        }

        ::nds::adas::instantiations::AdasPropertyList::ZserioPackingContext& getProperties()
        {
            return m_properties_;
        }

        ::nds::core::attributemap::ConditionList::ZserioPackingContext& getConditions()
        {
            return m_conditions_;
        }

    private:
        ::zserio::DeltaContext m_attributeTypeCode_;
        ::nds::adas::attributes::AdasRoadAttributeValue::ZserioPackingContext m_attributeValue_;
        ::nds::adas::instantiations::AdasPropertyList::ZserioPackingContext m_properties_;
        ::nds::core::attributemap::ConditionList::ZserioPackingContext m_conditions_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    AdasRoadFullAttribute() noexcept :
            AdasRoadFullAttribute(allocator_type())
    {}

    explicit AdasRoadFullAttribute(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributeValue = ::nds::adas::attributes::AdasRoadAttributeValue,
            typename ZSERIO_T_properties = ::nds::adas::instantiations::AdasPropertyList,
            typename ZSERIO_T_conditions = ::nds::core::attributemap::ConditionList>
    AdasRoadFullAttribute(
            ::nds::adas::attributes::AdasRoadAttributeType attributeTypeCode_,
            ZSERIO_T_attributeValue&& attributeValue_,
            ZSERIO_T_properties&& properties_,
            ZSERIO_T_conditions&& conditions_,
            const allocator_type& allocator = allocator_type()) :
            AdasRoadFullAttribute(allocator)
    {
        m_attributeTypeCode_ = attributeTypeCode_;
        m_attributeValue_ = ::std::forward<ZSERIO_T_attributeValue>(attributeValue_);
        m_properties_ = ::std::forward<ZSERIO_T_properties>(properties_);
        m_conditions_ = ::std::forward<ZSERIO_T_conditions>(conditions_);
    }

    explicit AdasRoadFullAttribute(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit AdasRoadFullAttribute(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~AdasRoadFullAttribute() = default;

    AdasRoadFullAttribute(const AdasRoadFullAttribute& other);
    AdasRoadFullAttribute& operator=(const AdasRoadFullAttribute& other);

    AdasRoadFullAttribute(AdasRoadFullAttribute&& other);
    AdasRoadFullAttribute& operator=(AdasRoadFullAttribute&& other);

    AdasRoadFullAttribute(::zserio::PropagateAllocatorT,
            const AdasRoadFullAttribute& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::adas::attributes::AdasRoadAttributeType getAttributeTypeCode() const;
    void setAttributeTypeCode(::nds::adas::attributes::AdasRoadAttributeType attributeTypeCode_);

    const ::nds::adas::attributes::AdasRoadAttributeValue& getAttributeValue() const;
    ::nds::adas::attributes::AdasRoadAttributeValue& getAttributeValue();
    void setAttributeValue(const ::nds::adas::attributes::AdasRoadAttributeValue& attributeValue_);
    void setAttributeValue(::nds::adas::attributes::AdasRoadAttributeValue&& attributeValue_);

    const ::nds::adas::instantiations::AdasPropertyList& getProperties() const;
    ::nds::adas::instantiations::AdasPropertyList& getProperties();
    void setProperties(const ::nds::adas::instantiations::AdasPropertyList& properties_);
    void setProperties(::nds::adas::instantiations::AdasPropertyList&& properties_);
    bool isPropertiesUsed() const;
    bool isPropertiesSet() const;
    void resetProperties();

    const ::nds::core::attributemap::ConditionList& getConditions() const;
    ::nds::core::attributemap::ConditionList& getConditions();
    void setConditions(const ::nds::core::attributemap::ConditionList& conditions_);
    void setConditions(::nds::core::attributemap::ConditionList&& conditions_);
    bool isConditionsUsed() const;
    bool isConditionsSet() const;
    void resetConditions();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const AdasRoadFullAttribute& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::adas::attributes::AdasRoadAttributeType readAttributeTypeCode(::zserio::BitStreamReader& in);
    ::nds::adas::attributes::AdasRoadAttributeType readAttributeTypeCode(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::adas::attributes::AdasRoadAttributeValue readAttributeValue(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::adas::attributes::AdasRoadAttributeValue readAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::adas::instantiations::AdasPropertyList> readProperties(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::adas::instantiations::AdasPropertyList> readProperties(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::attributemap::ConditionList> readConditions(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::attributemap::ConditionList> readConditions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::adas::attributes::AdasRoadAttributeType m_attributeTypeCode_;
    ::nds::adas::attributes::AdasRoadAttributeValue m_attributeValue_;
    ::zserio::InplaceOptionalHolder<::nds::adas::instantiations::AdasPropertyList> m_properties_;
    ::zserio::InplaceOptionalHolder<::nds::core::attributemap::ConditionList> m_conditions_;
};

} // namespace instantiations
} // namespace adas
} // namespace nds

#endif // NDS_ADAS_INSTANTIATIONS_ADAS_ROAD_FULL_ATTRIBUTE_H
