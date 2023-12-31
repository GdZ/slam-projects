/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_NAME_TYPES_ADMINISTRATIVE_HIERARCHY_H
#define NDS_NAME_TYPES_ADMINISTRATIVE_HIERARCHY_H

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

#include <nds/name/types/AdminHierarchyElementId.h>

namespace nds
{
namespace name
{
namespace types
{

class AdministrativeHierarchy
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumElements()
        {
            return m_numElements_;
        }

    private:
        ::zserio::DeltaContext m_numElements_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    AdministrativeHierarchy() noexcept :
            AdministrativeHierarchy(allocator_type())
    {}

    explicit AdministrativeHierarchy(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_adminElements = ::zserio::vector<::nds::name::types::AdminHierarchyElementId>>
    AdministrativeHierarchy(
            uint32_t numElements_,
            ZSERIO_T_adminElements&& adminElements_,
            const allocator_type& allocator = allocator_type()) :
            AdministrativeHierarchy(allocator)
    {
        m_numElements_ = numElements_;
        m_adminElements_ = ZserioArrayType_adminElements(::std::forward<ZSERIO_T_adminElements>(adminElements_));
    }

    explicit AdministrativeHierarchy(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit AdministrativeHierarchy(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~AdministrativeHierarchy() = default;

    AdministrativeHierarchy(const AdministrativeHierarchy&) = default;
    AdministrativeHierarchy& operator=(const AdministrativeHierarchy&) = default;

    AdministrativeHierarchy(AdministrativeHierarchy&&) = default;
    AdministrativeHierarchy& operator=(AdministrativeHierarchy&&) = default;

    AdministrativeHierarchy(::zserio::PropagateAllocatorT,
            const AdministrativeHierarchy& other, const allocator_type& allocator);

    uint32_t getNumElements() const;
    void setNumElements(uint32_t numElements_);

    const ::zserio::vector<::nds::name::types::AdminHierarchyElementId>& getAdminElements() const;
    ::zserio::vector<::nds::name::types::AdminHierarchyElementId>& getAdminElements();
    void setAdminElements(const ::zserio::vector<::nds::name::types::AdminHierarchyElementId>& adminElements_);
    void setAdminElements(::zserio::vector<::nds::name::types::AdminHierarchyElementId>&& adminElements_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const AdministrativeHierarchy& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    using ZserioArrayType_adminElements = ::zserio::Array<::zserio::vector<::nds::name::types::AdminHierarchyElementId>, ::zserio::VarIntNNArrayTraits<::nds::name::types::AdminHierarchyElementId>, ::zserio::ArrayType::NORMAL>;

    uint32_t readNumElements(::zserio::BitStreamReader& in);
    uint32_t readNumElements(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_adminElements readAdminElements(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_adminElements readAdminElements(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    uint32_t m_numElements_;
    ZserioArrayType_adminElements m_adminElements_;
};

} // namespace types
} // namespace name
} // namespace nds

#endif // NDS_NAME_TYPES_ADMINISTRATIVE_HIERARCHY_H
