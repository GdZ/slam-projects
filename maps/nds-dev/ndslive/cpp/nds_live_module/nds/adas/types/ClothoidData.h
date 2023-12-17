/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ADAS_TYPES_CLOTHOID_DATA_H
#define NDS_ADAS_TYPES_CLOTHOID_DATA_H

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

#include <nds/adas/types/AdasGeometryPosition.h>
#include <nds/adas/types/ClothoidCurvature.h>
#include <nds/adas/types/ClothoidDataDescription.h>
#include <nds/adas/types/TangentArc.h>

namespace nds
{
namespace adas
{
namespace types
{

class ClothoidData
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::adas::types::ClothoidDataDescription::ZserioPackingContext& getClothoidDataDescription()
        {
            return m_clothoidDataDescription_;
        }

        ::zserio::DeltaContext& getClothoidPosition()
        {
            return m_clothoidPosition_;
        }

        ::zserio::DeltaContext& getTangentArcStart()
        {
            return m_tangentArcStart_;
        }

        ::zserio::DeltaContext& getTangentArcEnd()
        {
            return m_tangentArcEnd_;
        }

        ::zserio::DeltaContext& getCurvatureStart()
        {
            return m_curvatureStart_;
        }

        ::zserio::DeltaContext& getCurvatureEnd()
        {
            return m_curvatureEnd_;
        }

        ::zserio::DeltaContext& getDeltaChainage()
        {
            return m_deltaChainage_;
        }

    private:
        ::nds::adas::types::ClothoidDataDescription::ZserioPackingContext m_clothoidDataDescription_;
        ::zserio::DeltaContext m_clothoidPosition_;
        ::zserio::DeltaContext m_tangentArcStart_;
        ::zserio::DeltaContext m_tangentArcEnd_;
        ::zserio::DeltaContext m_curvatureStart_;
        ::zserio::DeltaContext m_curvatureEnd_;
        ::zserio::DeltaContext m_deltaChainage_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    ClothoidData() noexcept :
            ClothoidData(allocator_type())
    {}

    explicit ClothoidData(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_clothoidDataDescription = ::nds::adas::types::ClothoidDataDescription,
            typename ZSERIO_T_clothoidPosition = ::nds::adas::types::AdasGeometryPosition,
            typename ZSERIO_T_tangentArcStart = ::nds::adas::types::TangentArc,
            typename ZSERIO_T_tangentArcEnd = ::nds::adas::types::TangentArc,
            typename ZSERIO_T_curvatureStart = ::nds::adas::types::ClothoidCurvature,
            typename ZSERIO_T_curvatureEnd = ::nds::adas::types::ClothoidCurvature,
            typename ZSERIO_T_deltaChainage = uint32_t,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_clothoidDataDescription, ClothoidData, allocator_type> = 0>
    ClothoidData(
            ZSERIO_T_clothoidDataDescription&& clothoidDataDescription_,
            ZSERIO_T_clothoidPosition&& clothoidPosition_,
            ZSERIO_T_tangentArcStart&& tangentArcStart_,
            ZSERIO_T_tangentArcEnd&& tangentArcEnd_,
            ZSERIO_T_curvatureStart&& curvatureStart_,
            ZSERIO_T_curvatureEnd&& curvatureEnd_,
            ZSERIO_T_deltaChainage&& deltaChainage_,
            const allocator_type& allocator = allocator_type()) :
            ClothoidData(allocator)
    {
        m_clothoidDataDescription_ = ::std::forward<ZSERIO_T_clothoidDataDescription>(clothoidDataDescription_);
        m_clothoidPosition_ = ::std::forward<ZSERIO_T_clothoidPosition>(clothoidPosition_);
        m_tangentArcStart_ = ::std::forward<ZSERIO_T_tangentArcStart>(tangentArcStart_);
        m_tangentArcEnd_ = ::std::forward<ZSERIO_T_tangentArcEnd>(tangentArcEnd_);
        m_curvatureStart_ = ::std::forward<ZSERIO_T_curvatureStart>(curvatureStart_);
        m_curvatureEnd_ = ::std::forward<ZSERIO_T_curvatureEnd>(curvatureEnd_);
        m_deltaChainage_ = ::std::forward<ZSERIO_T_deltaChainage>(deltaChainage_);
    }

    explicit ClothoidData(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit ClothoidData(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~ClothoidData() = default;

    ClothoidData(const ClothoidData&) = default;
    ClothoidData& operator=(const ClothoidData&) = default;

    ClothoidData(ClothoidData&&) = default;
    ClothoidData& operator=(ClothoidData&&) = default;

    ClothoidData(::zserio::PropagateAllocatorT,
            const ClothoidData& other, const allocator_type& allocator);

    const ::nds::adas::types::ClothoidDataDescription& getClothoidDataDescription() const;
    ::nds::adas::types::ClothoidDataDescription& getClothoidDataDescription();
    void setClothoidDataDescription(const ::nds::adas::types::ClothoidDataDescription& clothoidDataDescription_);
    void setClothoidDataDescription(::nds::adas::types::ClothoidDataDescription&& clothoidDataDescription_);

    ::nds::adas::types::AdasGeometryPosition getClothoidPosition() const;
    void setClothoidPosition(::nds::adas::types::AdasGeometryPosition clothoidPosition_);
    bool isClothoidPositionUsed() const;
    bool isClothoidPositionSet() const;
    void resetClothoidPosition();

    ::nds::adas::types::TangentArc getTangentArcStart() const;
    void setTangentArcStart(::nds::adas::types::TangentArc tangentArcStart_);
    bool isTangentArcStartUsed() const;
    bool isTangentArcStartSet() const;
    void resetTangentArcStart();

    ::nds::adas::types::TangentArc getTangentArcEnd() const;
    void setTangentArcEnd(::nds::adas::types::TangentArc tangentArcEnd_);
    bool isTangentArcEndUsed() const;
    bool isTangentArcEndSet() const;
    void resetTangentArcEnd();

    ::nds::adas::types::ClothoidCurvature getCurvatureStart() const;
    void setCurvatureStart(::nds::adas::types::ClothoidCurvature curvatureStart_);
    bool isCurvatureStartUsed() const;
    bool isCurvatureStartSet() const;
    void resetCurvatureStart();

    ::nds::adas::types::ClothoidCurvature getCurvatureEnd() const;
    void setCurvatureEnd(::nds::adas::types::ClothoidCurvature curvatureEnd_);
    bool isCurvatureEndUsed() const;
    bool isCurvatureEndSet() const;
    void resetCurvatureEnd();

    uint32_t getDeltaChainage() const;
    void setDeltaChainage(uint32_t deltaChainage_);
    bool isDeltaChainageUsed() const;
    bool isDeltaChainageSet() const;
    void resetDeltaChainage();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const ClothoidData& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::adas::types::ClothoidDataDescription readClothoidDataDescription(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::adas::types::ClothoidDataDescription readClothoidDataDescription(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::adas::types::AdasGeometryPosition> readClothoidPosition(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::adas::types::AdasGeometryPosition> readClothoidPosition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::adas::types::TangentArc> readTangentArcStart(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::adas::types::TangentArc> readTangentArcStart(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::adas::types::TangentArc> readTangentArcEnd(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::adas::types::TangentArc> readTangentArcEnd(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::adas::types::ClothoidCurvature> readCurvatureStart(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::adas::types::ClothoidCurvature> readCurvatureStart(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::adas::types::ClothoidCurvature> readCurvatureEnd(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::adas::types::ClothoidCurvature> readCurvatureEnd(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<uint32_t> readDeltaChainage(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<uint32_t> readDeltaChainage(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::nds::adas::types::ClothoidDataDescription m_clothoidDataDescription_;
    ::zserio::InplaceOptionalHolder<::nds::adas::types::AdasGeometryPosition> m_clothoidPosition_;
    ::zserio::InplaceOptionalHolder<::nds::adas::types::TangentArc> m_tangentArcStart_;
    ::zserio::InplaceOptionalHolder<::nds::adas::types::TangentArc> m_tangentArcEnd_;
    ::zserio::InplaceOptionalHolder<::nds::adas::types::ClothoidCurvature> m_curvatureStart_;
    ::zserio::InplaceOptionalHolder<::nds::adas::types::ClothoidCurvature> m_curvatureEnd_;
    ::zserio::InplaceOptionalHolder<uint32_t> m_deltaChainage_;
};

} // namespace types
} // namespace adas
} // namespace nds

#endif // NDS_ADAS_TYPES_CLOTHOID_DATA_H
