/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SMART_TYPES_DATA_LAYER_LIFETIME_INFO_H
#define NDS_SMART_TYPES_DATA_LAYER_LIFETIME_INFO_H

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
#include <zserio/AnyHolder.h>
#include <memory>
#include <zserio/ArrayTraits.h>

#include <nds/core/types/VersionId.h>
#include <nds/smart/types/DataLayerLifetimeType.h>
#include <nds/smart/types/DynamicDataLifetimeInfo.h>

namespace nds
{
namespace smart
{
namespace types
{

class DataLayerLifetimeInfo
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    enum ChoiceTag : int32_t
    {
        CHOICE_versionId = 0,
        CHOICE_dynamicDataLifetimeInfo = 1,
        UNDEFINED_CHOICE = -1
    };

    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getVersionId()
        {
            return m_versionId_;
        }

        ::nds::smart::types::DynamicDataLifetimeInfo::ZserioPackingContext& getDynamicDataLifetimeInfo()
        {
            return m_dynamicDataLifetimeInfo_;
        }

    private:
        ::zserio::DeltaContext m_versionId_;
        ::nds::smart::types::DynamicDataLifetimeInfo::ZserioPackingContext m_dynamicDataLifetimeInfo_;
    };

    DataLayerLifetimeInfo() noexcept :
            DataLayerLifetimeInfo(allocator_type())
    {}

    explicit DataLayerLifetimeInfo(const allocator_type& allocator) noexcept;

    explicit DataLayerLifetimeInfo(::zserio::BitStreamReader& in,
            ::nds::smart::types::DataLayerLifetimeType lifetime_, const allocator_type& allocator = allocator_type());
    explicit DataLayerLifetimeInfo(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::smart::types::DataLayerLifetimeType lifetime_, const allocator_type& allocator = allocator_type());

    ~DataLayerLifetimeInfo() = default;

    DataLayerLifetimeInfo(const DataLayerLifetimeInfo& other);
    DataLayerLifetimeInfo& operator=(const DataLayerLifetimeInfo& other);

    DataLayerLifetimeInfo(DataLayerLifetimeInfo&& other);
    DataLayerLifetimeInfo& operator=(DataLayerLifetimeInfo&& other);

    DataLayerLifetimeInfo(::zserio::PropagateAllocatorT,
            const DataLayerLifetimeInfo& other, const allocator_type& allocator);

    void initialize(
            ::nds::smart::types::DataLayerLifetimeType lifetime_);
    bool isInitialized() const;

    ChoiceTag choiceTag() const;

    ::nds::smart::types::DataLayerLifetimeType getLifetime() const;

    ::nds::core::types::VersionId getVersionId() const;
    void setVersionId(::nds::core::types::VersionId versionId_);

    const ::nds::smart::types::DynamicDataLifetimeInfo& getDynamicDataLifetimeInfo() const;
    ::nds::smart::types::DynamicDataLifetimeInfo& getDynamicDataLifetimeInfo();
    void setDynamicDataLifetimeInfo(const ::nds::smart::types::DynamicDataLifetimeInfo& dynamicDataLifetimeInfo_);
    void setDynamicDataLifetimeInfo(::nds::smart::types::DynamicDataLifetimeInfo&& dynamicDataLifetimeInfo_);
    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const DataLayerLifetimeInfo& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::zserio::AnyHolder<> readObject(::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::AnyHolder<> readObject(ZserioPackingContext& context, ::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::AnyHolder<> copyObject(const allocator_type& allocator) const;

    ::nds::smart::types::DataLayerLifetimeType m_lifetime_;
    bool m_isInitialized;
    ::zserio::AnyHolder<> m_objectChoice;
};

} // namespace types
} // namespace smart
} // namespace nds

#endif // NDS_SMART_TYPES_DATA_LAYER_LIFETIME_INFO_H
