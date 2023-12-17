/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_CONDITIONS_AUTHORIZATION_CONDITION_H
#define NDS_CORE_CONDITIONS_AUTHORIZATION_CONDITION_H

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

#include <nds/core/vehicle/Authorization.h>

namespace nds
{
namespace core
{
namespace conditions
{

class AuthorizationCondition
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getAuthorization()
        {
            return m_authorization_;
        }

    private:
        ::zserio::DeltaContext m_authorization_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    AuthorizationCondition() noexcept :
            AuthorizationCondition(allocator_type())
    {}

    explicit AuthorizationCondition(const allocator_type& allocator) noexcept;

    AuthorizationCondition(
            ::nds::core::vehicle::Authorization authorization_,
            bool isInclusive_,
            const allocator_type& allocator = allocator_type()) :
            AuthorizationCondition(allocator)
    {
        m_authorization_ = authorization_;
        m_isInclusive_ = isInclusive_;
    }

    explicit AuthorizationCondition(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit AuthorizationCondition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~AuthorizationCondition() = default;

    AuthorizationCondition(const AuthorizationCondition&) = default;
    AuthorizationCondition& operator=(const AuthorizationCondition&) = default;

    AuthorizationCondition(AuthorizationCondition&&) = default;
    AuthorizationCondition& operator=(AuthorizationCondition&&) = default;

    AuthorizationCondition(::zserio::PropagateAllocatorT,
            const AuthorizationCondition& other, const allocator_type& allocator);

    ::nds::core::vehicle::Authorization getAuthorization() const;
    void setAuthorization(::nds::core::vehicle::Authorization authorization_);

    bool getIsInclusive() const;
    void setIsInclusive(bool isInclusive_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const AuthorizationCondition& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::vehicle::Authorization readAuthorization(::zserio::BitStreamReader& in);
    ::nds::core::vehicle::Authorization readAuthorization(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    bool readIsInclusive(::zserio::BitStreamReader& in);

    ::nds::core::vehicle::Authorization m_authorization_;
    bool m_isInclusive_;
};

} // namespace conditions
} // namespace core
} // namespace nds

#endif // NDS_CORE_CONDITIONS_AUTHORIZATION_CONDITION_H
