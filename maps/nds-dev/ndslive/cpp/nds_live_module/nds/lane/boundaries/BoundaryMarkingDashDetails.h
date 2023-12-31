/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LANE_BOUNDARIES_BOUNDARY_MARKING_DASH_DETAILS_H
#define NDS_LANE_BOUNDARIES_BOUNDARY_MARKING_DASH_DETAILS_H

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

#include <nds/lane/boundaries/BoundaryMarkingDashLength.h>
#include <nds/lane/boundaries/BoundaryMarkingDashSpacing.h>

namespace nds
{
namespace lane
{
namespace boundaries
{

class BoundaryMarkingDashDetails
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getDashLength()
        {
            return m_dashLength_;
        }

        ::zserio::DeltaContext& getDashSpacing()
        {
            return m_dashSpacing_;
        }

    private:
        ::zserio::DeltaContext m_dashLength_;
        ::zserio::DeltaContext m_dashSpacing_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    BoundaryMarkingDashDetails() noexcept :
            BoundaryMarkingDashDetails(allocator_type())
    {}

    explicit BoundaryMarkingDashDetails(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_spaceAtStart = bool,
            typename ZSERIO_T_spaceAtEnd = bool>
    BoundaryMarkingDashDetails(
            ::nds::lane::boundaries::BoundaryMarkingDashLength dashLength_,
            ::nds::lane::boundaries::BoundaryMarkingDashSpacing dashSpacing_,
            ZSERIO_T_spaceAtStart&& spaceAtStart_,
            ZSERIO_T_spaceAtEnd&& spaceAtEnd_,
            const allocator_type& allocator = allocator_type()) :
            BoundaryMarkingDashDetails(allocator)
    {
        m_dashLength_ = dashLength_;
        m_dashSpacing_ = dashSpacing_;
        m_spaceAtStart_ = ::std::forward<ZSERIO_T_spaceAtStart>(spaceAtStart_);
        m_spaceAtEnd_ = ::std::forward<ZSERIO_T_spaceAtEnd>(spaceAtEnd_);
    }

    explicit BoundaryMarkingDashDetails(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit BoundaryMarkingDashDetails(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~BoundaryMarkingDashDetails() = default;

    BoundaryMarkingDashDetails(const BoundaryMarkingDashDetails&) = default;
    BoundaryMarkingDashDetails& operator=(const BoundaryMarkingDashDetails&) = default;

    BoundaryMarkingDashDetails(BoundaryMarkingDashDetails&&) = default;
    BoundaryMarkingDashDetails& operator=(BoundaryMarkingDashDetails&&) = default;

    BoundaryMarkingDashDetails(::zserio::PropagateAllocatorT,
            const BoundaryMarkingDashDetails& other, const allocator_type& allocator);

    ::nds::lane::boundaries::BoundaryMarkingDashLength getDashLength() const;
    void setDashLength(::nds::lane::boundaries::BoundaryMarkingDashLength dashLength_);

    ::nds::lane::boundaries::BoundaryMarkingDashSpacing getDashSpacing() const;
    void setDashSpacing(::nds::lane::boundaries::BoundaryMarkingDashSpacing dashSpacing_);

    bool getSpaceAtStart() const;
    void setSpaceAtStart(bool spaceAtStart_);
    bool isSpaceAtStartUsed() const;
    bool isSpaceAtStartSet() const;
    void resetSpaceAtStart();

    bool getSpaceAtEnd() const;
    void setSpaceAtEnd(bool spaceAtEnd_);
    bool isSpaceAtEndUsed() const;
    bool isSpaceAtEndSet() const;
    void resetSpaceAtEnd();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const BoundaryMarkingDashDetails& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::lane::boundaries::BoundaryMarkingDashLength readDashLength(::zserio::BitStreamReader& in);
    ::nds::lane::boundaries::BoundaryMarkingDashLength readDashLength(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::lane::boundaries::BoundaryMarkingDashSpacing readDashSpacing(::zserio::BitStreamReader& in);
    ::nds::lane::boundaries::BoundaryMarkingDashSpacing readDashSpacing(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<bool> readSpaceAtStart(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<bool> readSpaceAtEnd(::zserio::BitStreamReader& in);

    ::nds::lane::boundaries::BoundaryMarkingDashLength m_dashLength_;
    ::nds::lane::boundaries::BoundaryMarkingDashSpacing m_dashSpacing_;
    ::zserio::InplaceOptionalHolder<bool> m_spaceAtStart_;
    ::zserio::InplaceOptionalHolder<bool> m_spaceAtEnd_;
};

} // namespace boundaries
} // namespace lane
} // namespace nds

#endif // NDS_LANE_BOUNDARIES_BOUNDARY_MARKING_DASH_DETAILS_H
