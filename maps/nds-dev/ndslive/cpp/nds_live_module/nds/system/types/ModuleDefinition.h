/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SYSTEM_TYPES_MODULE_DEFINITION_H
#define NDS_SYSTEM_TYPES_MODULE_DEFINITION_H

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

#include <nds/system/types/ModuleName.h>
#include <nds/system/types/ModuleVersion.h>

namespace nds
{
namespace system
{
namespace types
{

class ModuleDefinition
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    ModuleDefinition() noexcept :
            ModuleDefinition(allocator_type())
    {}

    explicit ModuleDefinition(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_name = ::nds::system::types::ModuleName,
            typename ZSERIO_T_version = ::nds::system::types::ModuleVersion,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_name, ModuleDefinition, allocator_type> = 0>
    ModuleDefinition(
            ZSERIO_T_name&& name_,
            ZSERIO_T_version&& version_,
            const allocator_type& allocator = allocator_type()) :
            ModuleDefinition(allocator)
    {
        m_name_ = ::std::forward<ZSERIO_T_name>(name_);
        m_version_ = ::std::forward<ZSERIO_T_version>(version_);
    }

    explicit ModuleDefinition(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~ModuleDefinition() = default;

    ModuleDefinition(const ModuleDefinition&) = default;
    ModuleDefinition& operator=(const ModuleDefinition&) = default;

    ModuleDefinition(ModuleDefinition&&) = default;
    ModuleDefinition& operator=(ModuleDefinition&&) = default;

    ModuleDefinition(::zserio::PropagateAllocatorT,
            const ModuleDefinition& other, const allocator_type& allocator);

    const ::nds::system::types::ModuleName& getName() const;
    ::nds::system::types::ModuleName& getName();
    void setName(const ::nds::system::types::ModuleName& name_);
    void setName(::nds::system::types::ModuleName&& name_);

    const ::nds::system::types::ModuleVersion& getVersion() const;
    ::nds::system::types::ModuleVersion& getVersion();
    void setVersion(const ::nds::system::types::ModuleVersion& version_);
    void setVersion(::nds::system::types::ModuleVersion&& version_);

    size_t bitSizeOf(size_t bitPosition = 0) const;

    size_t initializeOffsets(size_t bitPosition = 0);

    bool operator==(const ModuleDefinition& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;

private:
    ::nds::system::types::ModuleName readName(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::system::types::ModuleVersion readVersion(::zserio::BitStreamReader& in,
            const allocator_type& allocator);

    ::nds::system::types::ModuleName m_name_;
    ::nds::system::types::ModuleVersion m_version_;
};

} // namespace types
} // namespace system
} // namespace nds

#endif // NDS_SYSTEM_TYPES_MODULE_DEFINITION_H
