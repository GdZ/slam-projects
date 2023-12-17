/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_POI_POI_POI_DISPLAY_MESH3_DRELATION_VALUE_H
#define NDS_POI_POI_POI_DISPLAY_MESH3_DRELATION_VALUE_H

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

#include <nds/poi/poi/PoiDisplayMesh3DRelationType.h>
#include <nds/poi/poi/PoiEntranceAndExitReference.h>
#include <nds/poi/poi/PoiEntranceReference.h>
#include <nds/poi/poi/PoiExitReference.h>
#include <nds/poi/reference/types/PoiReference.h>

namespace nds
{
namespace poi
{
namespace poi
{

class PoiDisplayMesh3DRelationValue
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    enum ChoiceTag : int32_t
    {
        CHOICE_poiComplete = 0,
        CHOICE_poiEntrance = 1,
        CHOICE_poiExit = 2,
        CHOICE_poiEntranceAndExit = 3,
        UNDEFINED_CHOICE = -1
    };

    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getPoiComplete()
        {
            return m_poiComplete_;
        }

        ::zserio::DeltaContext& getPoiEntrance()
        {
            return m_poiEntrance_;
        }

        ::zserio::DeltaContext& getPoiExit()
        {
            return m_poiExit_;
        }

        ::zserio::DeltaContext& getPoiEntranceAndExit()
        {
            return m_poiEntranceAndExit_;
        }

    private:
        ::zserio::DeltaContext m_poiComplete_;
        ::zserio::DeltaContext m_poiEntrance_;
        ::zserio::DeltaContext m_poiExit_;
        ::zserio::DeltaContext m_poiEntranceAndExit_;
    };

    PoiDisplayMesh3DRelationValue() noexcept :
            PoiDisplayMesh3DRelationValue(allocator_type())
    {}

    explicit PoiDisplayMesh3DRelationValue(const allocator_type& allocator) noexcept;

    explicit PoiDisplayMesh3DRelationValue(::zserio::BitStreamReader& in,
            ::nds::poi::poi::PoiDisplayMesh3DRelationType type_, const allocator_type& allocator = allocator_type());
    explicit PoiDisplayMesh3DRelationValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::poi::poi::PoiDisplayMesh3DRelationType type_, const allocator_type& allocator = allocator_type());

    ~PoiDisplayMesh3DRelationValue() = default;

    PoiDisplayMesh3DRelationValue(const PoiDisplayMesh3DRelationValue& other);
    PoiDisplayMesh3DRelationValue& operator=(const PoiDisplayMesh3DRelationValue& other);

    PoiDisplayMesh3DRelationValue(PoiDisplayMesh3DRelationValue&& other);
    PoiDisplayMesh3DRelationValue& operator=(PoiDisplayMesh3DRelationValue&& other);

    PoiDisplayMesh3DRelationValue(::zserio::PropagateAllocatorT,
            const PoiDisplayMesh3DRelationValue& other, const allocator_type& allocator);

    void initialize(
            ::nds::poi::poi::PoiDisplayMesh3DRelationType type_);
    bool isInitialized() const;

    ChoiceTag choiceTag() const;

    ::nds::poi::poi::PoiDisplayMesh3DRelationType getType() const;

    ::nds::poi::reference::types::PoiReference getPoiComplete() const;
    void setPoiComplete(::nds::poi::reference::types::PoiReference poiComplete_);

    ::nds::poi::poi::PoiEntranceReference getPoiEntrance() const;
    void setPoiEntrance(::nds::poi::poi::PoiEntranceReference poiEntrance_);

    ::nds::poi::poi::PoiExitReference getPoiExit() const;
    void setPoiExit(::nds::poi::poi::PoiExitReference poiExit_);

    ::nds::poi::poi::PoiEntranceAndExitReference getPoiEntranceAndExit() const;
    void setPoiEntranceAndExit(::nds::poi::poi::PoiEntranceAndExitReference poiEntranceAndExit_);
    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const PoiDisplayMesh3DRelationValue& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::zserio::AnyHolder<> readObject(::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::AnyHolder<> readObject(ZserioPackingContext& context, ::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::AnyHolder<> copyObject(const allocator_type& allocator) const;

    ::nds::poi::poi::PoiDisplayMesh3DRelationType m_type_;
    bool m_isInitialized;
    ::zserio::AnyHolder<> m_objectChoice;
};

} // namespace poi
} // namespace poi
} // namespace nds

#endif // NDS_POI_POI_POI_DISPLAY_MESH3_DRELATION_VALUE_H
