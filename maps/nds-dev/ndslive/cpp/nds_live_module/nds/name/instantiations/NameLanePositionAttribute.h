/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_NAME_INSTANTIATIONS_NAME_LANE_POSITION_ATTRIBUTE_H
#define NDS_NAME_INSTANTIATIONS_NAME_LANE_POSITION_ATTRIBUTE_H

#include <zserio/CppRuntimeVersion.h>
#if CPP_EXTENSION_RUNTIME_VERSION_NUMBER != 2012000
    #error Version mismatch between Zserio runtime library and Zserio compiler!
    #error Please update your Zserio runtime library to the version 2.12.0.
#endif

#include <zserio/Traits.h>
#include <zserio/BitStreamReader.h>
#include <zserio/BitStreamWriter.h>
#include <zserio/AllocatorPropagatingCopy.h>
#include <memory>
#include <zserio/ArrayTraits.h>

#include <nds/name/attributes/NameLanePositionAttributeType.h>
#include <nds/name/attributes/NameLanePositionAttributeValue.h>

namespace nds
{
namespace name
{
namespace instantiations
{

class NameLanePositionAttribute
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    NameLanePositionAttribute() noexcept :
            NameLanePositionAttribute(allocator_type())
    {}

    explicit NameLanePositionAttribute(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributeValue = ::nds::name::attributes::NameLanePositionAttributeValue,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_attributeValue, NameLanePositionAttribute, allocator_type> = 0>
    explicit NameLanePositionAttribute(
            ZSERIO_T_attributeValue&& attributeValue_,
            const allocator_type& allocator = allocator_type()) :
            NameLanePositionAttribute(allocator)
    {
        m_attributeValue_ = ::std::forward<ZSERIO_T_attributeValue>(attributeValue_);
    }

    explicit NameLanePositionAttribute(::zserio::BitStreamReader& in,
            ::nds::name::attributes::NameLanePositionAttributeType attributeTypeCode_, const allocator_type& allocator = allocator_type());

    ~NameLanePositionAttribute() = default;

    NameLanePositionAttribute(const NameLanePositionAttribute& other);
    NameLanePositionAttribute& operator=(const NameLanePositionAttribute& other);

    NameLanePositionAttribute(NameLanePositionAttribute&& other);
    NameLanePositionAttribute& operator=(NameLanePositionAttribute&& other);

    NameLanePositionAttribute(::zserio::PropagateAllocatorT,
            const NameLanePositionAttribute& other, const allocator_type& allocator);

    void initialize(
            ::nds::name::attributes::NameLanePositionAttributeType attributeTypeCode_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::name::attributes::NameLanePositionAttributeType getAttributeTypeCode() const;

    const ::nds::name::attributes::NameLanePositionAttributeValue& getAttributeValue() const;
    ::nds::name::attributes::NameLanePositionAttributeValue& getAttributeValue();
    void setAttributeValue(const ::nds::name::attributes::NameLanePositionAttributeValue& attributeValue_);
    void setAttributeValue(::nds::name::attributes::NameLanePositionAttributeValue&& attributeValue_);

    size_t bitSizeOf(size_t bitPosition = 0) const;

    size_t initializeOffsets(size_t bitPosition = 0);

    bool operator==(const NameLanePositionAttribute& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;

private:
    ::nds::name::attributes::NameLanePositionAttributeValue readAttributeValue(::zserio::BitStreamReader& in,
            const allocator_type& allocator);

    ::nds::name::attributes::NameLanePositionAttributeType m_attributeTypeCode_;
    bool m_isInitialized;
    ::nds::name::attributes::NameLanePositionAttributeValue m_attributeValue_;
};

} // namespace instantiations
} // namespace name
} // namespace nds

#endif // NDS_NAME_INSTANTIATIONS_NAME_LANE_POSITION_ATTRIBUTE_H
