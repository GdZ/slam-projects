/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_VEHICLE_VEHICLE_POSE_H
#define NDS_CORE_VEHICLE_VEHICLE_POSE_H

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

#include <nds/core/vehicle/PoseGeoMatched.h>
#include <nds/core/vehicle/PoseRaw.h>

namespace nds
{
namespace core
{
namespace vehicle
{

class VehiclePose
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    enum ChoiceTag : int32_t
    {
        CHOICE_poseRaw = 0,
        CHOICE_poseGeoMatched = 1,
        UNDEFINED_CHOICE = -1
    };

    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getChoiceTag()
        {
            return m_choiceTag;
        }

        ::nds::core::vehicle::PoseRaw::ZserioPackingContext& getPoseRaw()
        {
            return m_poseRaw_;
        }

        ::nds::core::vehicle::PoseGeoMatched::ZserioPackingContext& getPoseGeoMatched()
        {
            return m_poseGeoMatched_;
        }

    private:
        ::zserio::DeltaContext m_choiceTag;
        ::nds::core::vehicle::PoseRaw::ZserioPackingContext m_poseRaw_;
        ::nds::core::vehicle::PoseGeoMatched::ZserioPackingContext m_poseGeoMatched_;
    };

    VehiclePose() noexcept :
            VehiclePose(allocator_type())
    {}

    explicit VehiclePose(const allocator_type& allocator) noexcept;

    explicit VehiclePose(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit VehiclePose(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~VehiclePose() = default;

    VehiclePose(const VehiclePose&) = default;
    VehiclePose& operator=(const VehiclePose&) = default;

    VehiclePose(VehiclePose&&) = default;
    VehiclePose& operator=(VehiclePose&&) = default;

    VehiclePose(::zserio::PropagateAllocatorT,
            const VehiclePose& other, const allocator_type& allocator);

    void initializeChildren();

    ChoiceTag choiceTag() const;

    const ::nds::core::vehicle::PoseRaw& getPoseRaw() const;
    ::nds::core::vehicle::PoseRaw& getPoseRaw();
    void setPoseRaw(const ::nds::core::vehicle::PoseRaw& poseRaw_);
    void setPoseRaw(::nds::core::vehicle::PoseRaw&& poseRaw_);

    const ::nds::core::vehicle::PoseGeoMatched& getPoseGeoMatched() const;
    ::nds::core::vehicle::PoseGeoMatched& getPoseGeoMatched();
    void setPoseGeoMatched(const ::nds::core::vehicle::PoseGeoMatched& poseGeoMatched_);
    void setPoseGeoMatched(::nds::core::vehicle::PoseGeoMatched&& poseGeoMatched_);
    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const VehiclePose& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ChoiceTag readChoiceTag(::zserio::BitStreamReader& in);
    ChoiceTag readChoiceTag(ZserioPackingContext& context, ::zserio::BitStreamReader& in);
    ::zserio::AnyHolder<> readObject(::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::AnyHolder<> readObject(ZserioPackingContext& context, ::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::AnyHolder<> copyObject(const allocator_type& allocator) const;

    ChoiceTag m_choiceTag;
    ::zserio::AnyHolder<> m_objectChoice;
};

} // namespace vehicle
} // namespace core
} // namespace nds

#endif // NDS_CORE_VEHICLE_VEHICLE_POSE_H
