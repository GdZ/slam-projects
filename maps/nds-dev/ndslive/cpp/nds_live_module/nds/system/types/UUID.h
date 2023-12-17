/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SYSTEM_TYPES_UUID_H
#define NDS_SYSTEM_TYPES_UUID_H

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

namespace nds
{
namespace system
{
namespace types
{

class UUID
{
public:
    class ZserioPackingContext
    {
    };

    using allocator_type = ::std::allocator<uint8_t>;

    UUID() noexcept :
            UUID(allocator_type())
    {}

    explicit UUID(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_uuid = ::zserio::vector<uint8_t>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_uuid, UUID, allocator_type> = 0>
    explicit UUID(
            ZSERIO_T_uuid&& uuid_,
            const allocator_type& allocator = allocator_type()) :
            UUID(allocator)
    {
        m_uuid_ = ZserioArrayType_uuid(::std::forward<ZSERIO_T_uuid>(uuid_));
    }

    explicit UUID(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit UUID(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~UUID() = default;

    UUID(const UUID&) = default;
    UUID& operator=(const UUID&) = default;

    UUID(UUID&&) = default;
    UUID& operator=(UUID&&) = default;

    UUID(::zserio::PropagateAllocatorT,
            const UUID& other, const allocator_type& allocator);

    const ::zserio::vector<uint8_t>& getUuid() const;
    ::zserio::vector<uint8_t>& getUuid();
    void setUuid(const ::zserio::vector<uint8_t>& uuid_);
    void setUuid(::zserio::vector<uint8_t>&& uuid_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const UUID& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    using ZserioArrayType_uuid = ::zserio::Array<::zserio::vector<uint8_t>, ::zserio::StdIntArrayTraits<uint8_t>, ::zserio::ArrayType::NORMAL>;

    ZserioArrayType_uuid readUuid(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_uuid readUuid(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ZserioArrayType_uuid m_uuid_;
};

} // namespace types
} // namespace system
} // namespace nds

#endif // NDS_SYSTEM_TYPES_UUID_H
