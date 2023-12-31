/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SYSTEM_TYPES_NDS_SYSTEM_TOKEN_H
#define NDS_SYSTEM_TYPES_NDS_SYSTEM_TOKEN_H

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

#include <nds/system/types/UUID.h>

namespace nds
{
namespace system
{
namespace types
{

class NdsSystemToken
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::system::types::UUID::ZserioPackingContext& getMapId()
        {
            return m_mapId_;
        }

    private:
        ::nds::system::types::UUID::ZserioPackingContext m_mapId_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    NdsSystemToken() noexcept :
            NdsSystemToken(allocator_type())
    {}

    explicit NdsSystemToken(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_mapId = ::nds::system::types::UUID,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_mapId, NdsSystemToken, allocator_type> = 0>
    explicit NdsSystemToken(
            ZSERIO_T_mapId&& mapId_,
            const allocator_type& allocator = allocator_type()) :
            NdsSystemToken(allocator)
    {
        m_mapId_ = ::std::forward<ZSERIO_T_mapId>(mapId_);
    }

    explicit NdsSystemToken(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit NdsSystemToken(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~NdsSystemToken() = default;

    NdsSystemToken(const NdsSystemToken&) = default;
    NdsSystemToken& operator=(const NdsSystemToken&) = default;

    NdsSystemToken(NdsSystemToken&&) = default;
    NdsSystemToken& operator=(NdsSystemToken&&) = default;

    NdsSystemToken(::zserio::PropagateAllocatorT,
            const NdsSystemToken& other, const allocator_type& allocator);

    const ::nds::system::types::UUID& getMapId() const;
    ::nds::system::types::UUID& getMapId();
    void setMapId(const ::nds::system::types::UUID& mapId_);
    void setMapId(::nds::system::types::UUID&& mapId_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const NdsSystemToken& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::system::types::UUID readMapId(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::system::types::UUID readMapId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::system::types::UUID m_mapId_;
};

} // namespace types
} // namespace system
} // namespace nds

#endif // NDS_SYSTEM_TYPES_NDS_SYSTEM_TOKEN_H
