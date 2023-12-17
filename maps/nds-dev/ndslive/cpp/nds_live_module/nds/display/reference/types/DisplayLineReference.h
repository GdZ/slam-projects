/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_REFERENCE_TYPES_DISPLAY_LINE_REFERENCE_H
#define NDS_DISPLAY_REFERENCE_TYPES_DISPLAY_LINE_REFERENCE_H

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

#include <nds/display/reference/types/DirectedDisplayLineReference.h>
#include <nds/display/reference/types/DisplayLineId.h>

namespace nds
{
namespace display
{
namespace reference
{
namespace types
{

class DisplayLineReference
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::display::reference::types::DirectedDisplayLineReference::ZserioPackingContext& getDirectedLineReference()
        {
            return m_directedLineReference_;
        }

        ::nds::display::reference::types::DisplayLineId::ZserioPackingContext& getLineReference()
        {
            return m_lineReference_;
        }

    private:
        ::nds::display::reference::types::DirectedDisplayLineReference::ZserioPackingContext m_directedLineReference_;
        ::nds::display::reference::types::DisplayLineId::ZserioPackingContext m_lineReference_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    DisplayLineReference() noexcept :
            DisplayLineReference(allocator_type())
    {}

    explicit DisplayLineReference(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_directedLineReference = ::nds::display::reference::types::DirectedDisplayLineReference,
            typename ZSERIO_T_lineReference = ::nds::display::reference::types::DisplayLineId>
    DisplayLineReference(
            bool isDirected_,
            ZSERIO_T_directedLineReference&& directedLineReference_,
            ZSERIO_T_lineReference&& lineReference_,
            const allocator_type& allocator = allocator_type()) :
            DisplayLineReference(allocator)
    {
        m_isDirected_ = isDirected_;
        m_directedLineReference_ = ::std::forward<ZSERIO_T_directedLineReference>(directedLineReference_);
        m_lineReference_ = ::std::forward<ZSERIO_T_lineReference>(lineReference_);
    }

    explicit DisplayLineReference(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit DisplayLineReference(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~DisplayLineReference() = default;

    DisplayLineReference(const DisplayLineReference&) = default;
    DisplayLineReference& operator=(const DisplayLineReference&) = default;

    DisplayLineReference(DisplayLineReference&&) = default;
    DisplayLineReference& operator=(DisplayLineReference&&) = default;

    DisplayLineReference(::zserio::PropagateAllocatorT,
            const DisplayLineReference& other, const allocator_type& allocator);

    bool getIsDirected() const;
    void setIsDirected(bool isDirected_);

    const ::nds::display::reference::types::DirectedDisplayLineReference& getDirectedLineReference() const;
    ::nds::display::reference::types::DirectedDisplayLineReference& getDirectedLineReference();
    void setDirectedLineReference(const ::nds::display::reference::types::DirectedDisplayLineReference& directedLineReference_);
    void setDirectedLineReference(::nds::display::reference::types::DirectedDisplayLineReference&& directedLineReference_);
    bool isDirectedLineReferenceUsed() const;
    bool isDirectedLineReferenceSet() const;
    void resetDirectedLineReference();

    const ::nds::display::reference::types::DisplayLineId& getLineReference() const;
    ::nds::display::reference::types::DisplayLineId& getLineReference();
    void setLineReference(const ::nds::display::reference::types::DisplayLineId& lineReference_);
    void setLineReference(::nds::display::reference::types::DisplayLineId&& lineReference_);
    bool isLineReferenceUsed() const;
    bool isLineReferenceSet() const;
    void resetLineReference();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const DisplayLineReference& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    bool readIsDirected(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::display::reference::types::DirectedDisplayLineReference> readDirectedLineReference(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::display::reference::types::DirectedDisplayLineReference> readDirectedLineReference(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::display::reference::types::DisplayLineId> readLineReference(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::display::reference::types::DisplayLineId> readLineReference(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_isDirected_;
    ::zserio::InplaceOptionalHolder<::nds::display::reference::types::DirectedDisplayLineReference> m_directedLineReference_;
    ::zserio::InplaceOptionalHolder<::nds::display::reference::types::DisplayLineId> m_lineReference_;
};

} // namespace types
} // namespace reference
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_REFERENCE_TYPES_DISPLAY_LINE_REFERENCE_H
