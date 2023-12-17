/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LOCALIZATION_TYPES_FIDUCIAL_MARKER_DETAILS_H
#define NDS_LOCALIZATION_TYPES_FIDUCIAL_MARKER_DETAILS_H

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
#include <zserio/Types.h>

#include <nds/localization/types/FiducialMarkerSystemType.h>

namespace nds
{
namespace localization
{
namespace types
{

class FiducialMarkerDetails
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getType()
        {
            return m_type_;
        }

        ::zserio::DeltaContext& getDictionaryIndex()
        {
            return m_dictionaryIndex_;
        }

    private:
        ::zserio::DeltaContext m_type_;
        ::zserio::DeltaContext m_dictionaryIndex_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    FiducialMarkerDetails() noexcept :
            FiducialMarkerDetails(allocator_type())
    {}

    explicit FiducialMarkerDetails(const allocator_type& allocator) noexcept;

    FiducialMarkerDetails(
            ::nds::localization::types::FiducialMarkerSystemType type_,
            uint16_t dictionaryIndex_,
            const allocator_type& allocator = allocator_type()) :
            FiducialMarkerDetails(allocator)
    {
        m_type_ = type_;
        m_dictionaryIndex_ = dictionaryIndex_;
    }

    explicit FiducialMarkerDetails(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit FiducialMarkerDetails(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~FiducialMarkerDetails() = default;

    FiducialMarkerDetails(const FiducialMarkerDetails&) = default;
    FiducialMarkerDetails& operator=(const FiducialMarkerDetails&) = default;

    FiducialMarkerDetails(FiducialMarkerDetails&&) = default;
    FiducialMarkerDetails& operator=(FiducialMarkerDetails&&) = default;

    FiducialMarkerDetails(::zserio::PropagateAllocatorT,
            const FiducialMarkerDetails& other, const allocator_type& allocator);

    ::nds::localization::types::FiducialMarkerSystemType getType() const;
    void setType(::nds::localization::types::FiducialMarkerSystemType type_);

    uint16_t getDictionaryIndex() const;
    void setDictionaryIndex(uint16_t dictionaryIndex_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const FiducialMarkerDetails& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::localization::types::FiducialMarkerSystemType readType(::zserio::BitStreamReader& in);
    ::nds::localization::types::FiducialMarkerSystemType readType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    uint16_t readDictionaryIndex(::zserio::BitStreamReader& in);
    uint16_t readDictionaryIndex(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::nds::localization::types::FiducialMarkerSystemType m_type_;
    uint16_t m_dictionaryIndex_;
};

} // namespace types
} // namespace localization
} // namespace nds

#endif // NDS_LOCALIZATION_TYPES_FIDUCIAL_MARKER_DETAILS_H
