/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_DETAILS_ATTRIBUTES_DISPLAY_AREA_ATTRIBUTE_VALUE_H
#define NDS_DISPLAY_DETAILS_ATTRIBUTES_DISPLAY_AREA_ATTRIBUTE_VALUE_H

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

#include <nds/core/geometry/DeltaElevation.h>
#include <nds/core/types/GlobalSourceId.h>
#include <nds/display/details/attributes/DisplayAreaAttributeType.h>
#include <nds/display/details/types/BuildingFloorCount.h>
#include <nds/display/details/types/BuildingHeight.h>
#include <nds/display/details/types/DrawingOrder.h>
#include <nds/display/details/types/ElevationLevel.h>
#include <nds/display/details/types/GroundHeight.h>
#include <nds/display/details/types/Has3dRepresentation.h>
#include <nds/display/details/types/RoofColor.h>
#include <nds/display/details/types/WallColor.h>

namespace nds
{
namespace display
{
namespace details
{
namespace attributes
{

class DisplayAreaAttributeValue
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    enum ChoiceTag : int32_t
    {
        CHOICE_drawingOrder = 0,
        CHOICE_buildingFloorCount = 1,
        CHOICE_buildingHeight = 2,
        CHOICE_groundHeight = 3,
        CHOICE_roofColor = 4,
        CHOICE_wallColor = 5,
        CHOICE_elevationDelta = 6,
        CHOICE_elevationLevel = 7,
        CHOICE_has3dRepresentation = 8,
        CHOICE_globalSourceId = 9,
        UNDEFINED_CHOICE = -1
    };

    class ZserioPackingContext
    {
    public:
        ::nds::display::details::types::DrawingOrder::ZserioPackingContext& getDrawingOrder()
        {
            return m_drawingOrder_;
        }

        ::zserio::DeltaContext& getBuildingFloorCount()
        {
            return m_buildingFloorCount_;
        }

        ::zserio::DeltaContext& getBuildingHeight()
        {
            return m_buildingHeight_;
        }

        ::zserio::DeltaContext& getGroundHeight()
        {
            return m_groundHeight_;
        }

        ::nds::display::details::types::RoofColor::ZserioPackingContext& getRoofColor()
        {
            return m_roofColor_;
        }

        ::nds::display::details::types::WallColor::ZserioPackingContext& getWallColor()
        {
            return m_wallColor_;
        }

        ::zserio::DeltaContext& getElevationDelta()
        {
            return m_elevationDelta_;
        }

        ::zserio::DeltaContext& getElevationLevel()
        {
            return m_elevationLevel_;
        }

    private:
        ::nds::display::details::types::DrawingOrder::ZserioPackingContext m_drawingOrder_;
        ::zserio::DeltaContext m_buildingFloorCount_;
        ::zserio::DeltaContext m_buildingHeight_;
        ::zserio::DeltaContext m_groundHeight_;
        ::nds::display::details::types::RoofColor::ZserioPackingContext m_roofColor_;
        ::nds::display::details::types::WallColor::ZserioPackingContext m_wallColor_;
        ::zserio::DeltaContext m_elevationDelta_;
        ::zserio::DeltaContext m_elevationLevel_;
    };

    DisplayAreaAttributeValue() noexcept :
            DisplayAreaAttributeValue(allocator_type())
    {}

    explicit DisplayAreaAttributeValue(const allocator_type& allocator) noexcept;

    explicit DisplayAreaAttributeValue(::zserio::BitStreamReader& in,
            ::nds::display::details::attributes::DisplayAreaAttributeType type_, const allocator_type& allocator = allocator_type());
    explicit DisplayAreaAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::display::details::attributes::DisplayAreaAttributeType type_, const allocator_type& allocator = allocator_type());

    ~DisplayAreaAttributeValue() = default;

    DisplayAreaAttributeValue(const DisplayAreaAttributeValue& other);
    DisplayAreaAttributeValue& operator=(const DisplayAreaAttributeValue& other);

    DisplayAreaAttributeValue(DisplayAreaAttributeValue&& other);
    DisplayAreaAttributeValue& operator=(DisplayAreaAttributeValue&& other);

    DisplayAreaAttributeValue(::zserio::PropagateAllocatorT,
            const DisplayAreaAttributeValue& other, const allocator_type& allocator);

    void initialize(
            ::nds::display::details::attributes::DisplayAreaAttributeType type_);
    bool isInitialized() const;

    ChoiceTag choiceTag() const;

    ::nds::display::details::attributes::DisplayAreaAttributeType getType() const;

    const ::nds::display::details::types::DrawingOrder& getDrawingOrder() const;
    ::nds::display::details::types::DrawingOrder& getDrawingOrder();
    void setDrawingOrder(const ::nds::display::details::types::DrawingOrder& drawingOrder_);
    void setDrawingOrder(::nds::display::details::types::DrawingOrder&& drawingOrder_);

    ::nds::display::details::types::BuildingFloorCount getBuildingFloorCount() const;
    void setBuildingFloorCount(::nds::display::details::types::BuildingFloorCount buildingFloorCount_);

    ::nds::display::details::types::BuildingHeight getBuildingHeight() const;
    void setBuildingHeight(::nds::display::details::types::BuildingHeight buildingHeight_);

    ::nds::display::details::types::GroundHeight getGroundHeight() const;
    void setGroundHeight(::nds::display::details::types::GroundHeight groundHeight_);

    const ::nds::display::details::types::RoofColor& getRoofColor() const;
    ::nds::display::details::types::RoofColor& getRoofColor();
    void setRoofColor(const ::nds::display::details::types::RoofColor& roofColor_);
    void setRoofColor(::nds::display::details::types::RoofColor&& roofColor_);

    const ::nds::display::details::types::WallColor& getWallColor() const;
    ::nds::display::details::types::WallColor& getWallColor();
    void setWallColor(const ::nds::display::details::types::WallColor& wallColor_);
    void setWallColor(::nds::display::details::types::WallColor&& wallColor_);

    ::nds::core::geometry::DeltaElevation getElevationDelta() const;
    void setElevationDelta(::nds::core::geometry::DeltaElevation elevationDelta_);

    ::nds::display::details::types::ElevationLevel getElevationLevel() const;
    void setElevationLevel(::nds::display::details::types::ElevationLevel elevationLevel_);

    const ::nds::display::details::types::Has3dRepresentation& getHas3dRepresentation() const;
    ::nds::display::details::types::Has3dRepresentation& getHas3dRepresentation();
    void setHas3dRepresentation(const ::nds::display::details::types::Has3dRepresentation& has3dRepresentation_);
    void setHas3dRepresentation(::nds::display::details::types::Has3dRepresentation&& has3dRepresentation_);

    const ::nds::core::types::GlobalSourceId& getGlobalSourceId() const;
    ::nds::core::types::GlobalSourceId& getGlobalSourceId();
    void setGlobalSourceId(const ::nds::core::types::GlobalSourceId& globalSourceId_);
    void setGlobalSourceId(::nds::core::types::GlobalSourceId&& globalSourceId_);
    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const DisplayAreaAttributeValue& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::zserio::AnyHolder<> readObject(::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::AnyHolder<> readObject(ZserioPackingContext& context, ::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::AnyHolder<> copyObject(const allocator_type& allocator) const;

    ::nds::display::details::attributes::DisplayAreaAttributeType m_type_;
    bool m_isInitialized;
    ::zserio::AnyHolder<> m_objectChoice;
};

} // namespace attributes
} // namespace details
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_DETAILS_ATTRIBUTES_DISPLAY_AREA_ATTRIBUTE_VALUE_H