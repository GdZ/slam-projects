/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTING_TYPES_DRIVER_PROFILE_H
#define NDS_ROUTING_TYPES_DRIVER_PROFILE_H

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
#include <zserio/Types.h>

#include <nds/core/geometry/CoordShift.h>
#include <nds/core/geometry/Position2D.h>

namespace nds
{
namespace routing
{
namespace types
{

class DriverProfile
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getAggressiveness()
        {
            return m_aggressiveness_;
        }

        ::nds::core::geometry::Position2D::ZserioPackingContext& getHomeAddress()
        {
            return m_homeAddress_;
        }

        ::nds::core::geometry::Position2D::ZserioPackingContext& getWorkAddress()
        {
            return m_workAddress_;
        }

    private:
        ::zserio::DeltaContext m_aggressiveness_;
        ::nds::core::geometry::Position2D::ZserioPackingContext m_homeAddress_;
        ::nds::core::geometry::Position2D::ZserioPackingContext m_workAddress_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    DriverProfile() noexcept :
            DriverProfile(allocator_type())
    {}

    explicit DriverProfile(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_aggressiveness = uint8_t,
            typename ZSERIO_T_isDisabledPerson = bool,
            typename ZSERIO_T_homeAddress = ::nds::core::geometry::Position2D,
            typename ZSERIO_T_workAddress = ::nds::core::geometry::Position2D,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_aggressiveness, DriverProfile, allocator_type> = 0>
    DriverProfile(
            ZSERIO_T_aggressiveness&& aggressiveness_,
            ZSERIO_T_isDisabledPerson&& isDisabledPerson_,
            ZSERIO_T_homeAddress&& homeAddress_,
            ZSERIO_T_workAddress&& workAddress_,
            const allocator_type& allocator = allocator_type()) :
            DriverProfile(allocator)
    {
        m_aggressiveness_ = ::std::forward<ZSERIO_T_aggressiveness>(aggressiveness_);
        m_isDisabledPerson_ = ::std::forward<ZSERIO_T_isDisabledPerson>(isDisabledPerson_);
        m_homeAddress_ = ::std::forward<ZSERIO_T_homeAddress>(homeAddress_);
        m_workAddress_ = ::std::forward<ZSERIO_T_workAddress>(workAddress_);
    }

    explicit DriverProfile(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit DriverProfile(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~DriverProfile() = default;

    DriverProfile(const DriverProfile& other);
    DriverProfile& operator=(const DriverProfile& other);

    DriverProfile(DriverProfile&& other);
    DriverProfile& operator=(DriverProfile&& other);

    DriverProfile(::zserio::PropagateAllocatorT,
            const DriverProfile& other, const allocator_type& allocator);

    void initializeChildren();

    uint8_t getAggressiveness() const;
    void setAggressiveness(uint8_t aggressiveness_);
    bool isAggressivenessUsed() const;
    bool isAggressivenessSet() const;
    void resetAggressiveness();

    bool getIsDisabledPerson() const;
    void setIsDisabledPerson(bool isDisabledPerson_);
    bool isIsDisabledPersonUsed() const;
    bool isIsDisabledPersonSet() const;
    void resetIsDisabledPerson();

    const ::nds::core::geometry::Position2D& getHomeAddress() const;
    ::nds::core::geometry::Position2D& getHomeAddress();
    void setHomeAddress(const ::nds::core::geometry::Position2D& homeAddress_);
    void setHomeAddress(::nds::core::geometry::Position2D&& homeAddress_);
    bool isHomeAddressUsed() const;
    bool isHomeAddressSet() const;
    void resetHomeAddress();

    const ::nds::core::geometry::Position2D& getWorkAddress() const;
    ::nds::core::geometry::Position2D& getWorkAddress();
    void setWorkAddress(const ::nds::core::geometry::Position2D& workAddress_);
    void setWorkAddress(::nds::core::geometry::Position2D&& workAddress_);
    bool isWorkAddressUsed() const;
    bool isWorkAddressSet() const;
    void resetWorkAddress();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const DriverProfile& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::zserio::InplaceOptionalHolder<uint8_t> readAggressiveness(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<uint8_t> readAggressiveness(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<bool> readIsDisabledPerson(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::core::geometry::Position2D> readHomeAddress(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::geometry::Position2D> readHomeAddress(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::geometry::Position2D> readWorkAddress(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::geometry::Position2D> readWorkAddress(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::zserio::InplaceOptionalHolder<uint8_t> m_aggressiveness_;
    ::zserio::InplaceOptionalHolder<bool> m_isDisabledPerson_;
    ::zserio::InplaceOptionalHolder<::nds::core::geometry::Position2D> m_homeAddress_;
    ::zserio::InplaceOptionalHolder<::nds::core::geometry::Position2D> m_workAddress_;
};

} // namespace types
} // namespace routing
} // namespace nds

#endif // NDS_ROUTING_TYPES_DRIVER_PROFILE_H
