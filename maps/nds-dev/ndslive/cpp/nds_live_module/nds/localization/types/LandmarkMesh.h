/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LOCALIZATION_TYPES_LANDMARK_MESH_H
#define NDS_LOCALIZATION_TYPES_LANDMARK_MESH_H

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

#include <nds/localization/types/LandmarkColor.h>
#include <nds/localization/types/LandmarkConfidence.h>
#include <nds/localization/types/LandmarkMeshType.h>

namespace nds
{
namespace localization
{
namespace types
{

class LandmarkMesh
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getType()
        {
            return m_type_;
        }

        ::nds::localization::types::LandmarkColor::ZserioPackingContext& getColor()
        {
            return m_color_;
        }

        ::zserio::DeltaContext& getConfidence()
        {
            return m_confidence_;
        }

    private:
        ::zserio::DeltaContext m_type_;
        ::nds::localization::types::LandmarkColor::ZserioPackingContext m_color_;
        ::zserio::DeltaContext m_confidence_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    LandmarkMesh() noexcept :
            LandmarkMesh(allocator_type())
    {}

    explicit LandmarkMesh(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_color = ::nds::localization::types::LandmarkColor,
            typename ZSERIO_T_confidence = ::nds::localization::types::LandmarkConfidence>
    LandmarkMesh(
            ::nds::localization::types::LandmarkMeshType type_,
            ZSERIO_T_color&& color_,
            ZSERIO_T_confidence&& confidence_,
            const allocator_type& allocator = allocator_type()) :
            LandmarkMesh(allocator)
    {
        m_type_ = type_;
        m_color_ = ::std::forward<ZSERIO_T_color>(color_);
        m_confidence_ = ::std::forward<ZSERIO_T_confidence>(confidence_);
    }

    explicit LandmarkMesh(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit LandmarkMesh(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~LandmarkMesh() = default;

    LandmarkMesh(const LandmarkMesh&) = default;
    LandmarkMesh& operator=(const LandmarkMesh&) = default;

    LandmarkMesh(LandmarkMesh&&) = default;
    LandmarkMesh& operator=(LandmarkMesh&&) = default;

    LandmarkMesh(::zserio::PropagateAllocatorT,
            const LandmarkMesh& other, const allocator_type& allocator);

    ::nds::localization::types::LandmarkMeshType getType() const;
    void setType(::nds::localization::types::LandmarkMeshType type_);

    const ::nds::localization::types::LandmarkColor& getColor() const;
    ::nds::localization::types::LandmarkColor& getColor();
    void setColor(const ::nds::localization::types::LandmarkColor& color_);
    void setColor(::nds::localization::types::LandmarkColor&& color_);
    bool isColorUsed() const;
    bool isColorSet() const;
    void resetColor();

    ::nds::localization::types::LandmarkConfidence getConfidence() const;
    void setConfidence(::nds::localization::types::LandmarkConfidence confidence_);
    bool isConfidenceUsed() const;
    bool isConfidenceSet() const;
    void resetConfidence();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const LandmarkMesh& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::localization::types::LandmarkMeshType readType(::zserio::BitStreamReader& in);
    ::nds::localization::types::LandmarkMeshType readType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::localization::types::LandmarkColor> readColor(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::localization::types::LandmarkColor> readColor(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::localization::types::LandmarkConfidence> readConfidence(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::localization::types::LandmarkConfidence> readConfidence(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::nds::localization::types::LandmarkMeshType m_type_;
    ::zserio::InplaceOptionalHolder<::nds::localization::types::LandmarkColor> m_color_;
    ::zserio::InplaceOptionalHolder<::nds::localization::types::LandmarkConfidence> m_confidence_;
};

} // namespace types
} // namespace localization
} // namespace nds

#endif // NDS_LOCALIZATION_TYPES_LANDMARK_MESH_H
