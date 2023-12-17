/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SMART_TYPES_DATA_LAYER_LIFETIME_H
#define NDS_SMART_TYPES_DATA_LAYER_LIFETIME_H

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
#include <zserio/ArrayTraits.h>

#include <nds/smart/types/DataLayerLifetimeInfo.h>
#include <nds/smart/types/DataLayerLifetimeType.h>

namespace nds
{
namespace smart
{
namespace types
{

class DataLayerLifetime
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getLifetime()
        {
            return m_lifetime_;
        }

        ::nds::smart::types::DataLayerLifetimeInfo::ZserioPackingContext& getLayerLifetimeInfo()
        {
            return m_layerLifetimeInfo_;
        }

    private:
        ::zserio::DeltaContext m_lifetime_;
        ::nds::smart::types::DataLayerLifetimeInfo::ZserioPackingContext m_layerLifetimeInfo_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    DataLayerLifetime() noexcept :
            DataLayerLifetime(allocator_type())
    {}

    explicit DataLayerLifetime(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_layerLifetimeInfo = ::nds::smart::types::DataLayerLifetimeInfo>
    DataLayerLifetime(
            ::nds::smart::types::DataLayerLifetimeType lifetime_,
            ZSERIO_T_layerLifetimeInfo&& layerLifetimeInfo_,
            const allocator_type& allocator = allocator_type()) :
            DataLayerLifetime(allocator)
    {
        m_lifetime_ = lifetime_;
        m_layerLifetimeInfo_ = ::std::forward<ZSERIO_T_layerLifetimeInfo>(layerLifetimeInfo_);
    }

    explicit DataLayerLifetime(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit DataLayerLifetime(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~DataLayerLifetime() = default;

    DataLayerLifetime(const DataLayerLifetime& other);
    DataLayerLifetime& operator=(const DataLayerLifetime& other);

    DataLayerLifetime(DataLayerLifetime&& other);
    DataLayerLifetime& operator=(DataLayerLifetime&& other);

    DataLayerLifetime(::zserio::PropagateAllocatorT,
            const DataLayerLifetime& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::smart::types::DataLayerLifetimeType getLifetime() const;
    void setLifetime(::nds::smart::types::DataLayerLifetimeType lifetime_);

    const ::nds::smart::types::DataLayerLifetimeInfo& getLayerLifetimeInfo() const;
    ::nds::smart::types::DataLayerLifetimeInfo& getLayerLifetimeInfo();
    void setLayerLifetimeInfo(const ::nds::smart::types::DataLayerLifetimeInfo& layerLifetimeInfo_);
    void setLayerLifetimeInfo(::nds::smart::types::DataLayerLifetimeInfo&& layerLifetimeInfo_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const DataLayerLifetime& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::smart::types::DataLayerLifetimeType readLifetime(::zserio::BitStreamReader& in);
    ::nds::smart::types::DataLayerLifetimeType readLifetime(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::smart::types::DataLayerLifetimeInfo readLayerLifetimeInfo(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::smart::types::DataLayerLifetimeInfo readLayerLifetimeInfo(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::smart::types::DataLayerLifetimeType m_lifetime_;
    ::nds::smart::types::DataLayerLifetimeInfo m_layerLifetimeInfo_;
};

} // namespace types
} // namespace smart
} // namespace nds

#endif // NDS_SMART_TYPES_DATA_LAYER_LIFETIME_H
