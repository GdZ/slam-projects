/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_INSTRUCTIONS_LAYER_INSTRUCTIONS_IMAGE_LAYER_H
#define NDS_INSTRUCTIONS_LAYER_INSTRUCTIONS_IMAGE_LAYER_H

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

#include <nds/instructions/metadata/InstructionsImageLayerContent.h>
#include <nds/instructions/types/JunctionViewImageList.h>
#include <nds/instructions/types/SignpostImageList.h>
#include <nds/system/types/LayerType.h>

namespace nds
{
namespace instructions
{
namespace layer
{

class InstructionsImageLayer
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getContent()
        {
            return m_content_;
        }

        ::nds::instructions::types::SignpostImageList::ZserioPackingContext& getSignpostImageList()
        {
            return m_signpostImageList_;
        }

        ::nds::instructions::types::JunctionViewImageList::ZserioPackingContext& getJunctionViewImageList()
        {
            return m_junctionViewImageList_;
        }

    private:
        ::zserio::DeltaContext m_content_;
        ::nds::instructions::types::SignpostImageList::ZserioPackingContext m_signpostImageList_;
        ::nds::instructions::types::JunctionViewImageList::ZserioPackingContext m_junctionViewImageList_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    InstructionsImageLayer() noexcept :
            InstructionsImageLayer(allocator_type())
    {}

    explicit InstructionsImageLayer(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_signpostImageList = ::nds::instructions::types::SignpostImageList,
            typename ZSERIO_T_junctionViewImageList = ::nds::instructions::types::JunctionViewImageList>
    InstructionsImageLayer(
            ::nds::instructions::metadata::InstructionsImageLayerContent content_,
            ZSERIO_T_signpostImageList&& signpostImageList_,
            ZSERIO_T_junctionViewImageList&& junctionViewImageList_,
            const allocator_type& allocator = allocator_type()) :
            InstructionsImageLayer(allocator)
    {
        m_content_ = content_;
        m_signpostImageList_ = ::std::forward<ZSERIO_T_signpostImageList>(signpostImageList_);
        m_junctionViewImageList_ = ::std::forward<ZSERIO_T_junctionViewImageList>(junctionViewImageList_);
    }

    explicit InstructionsImageLayer(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit InstructionsImageLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~InstructionsImageLayer() = default;

    InstructionsImageLayer(const InstructionsImageLayer&) = default;
    InstructionsImageLayer& operator=(const InstructionsImageLayer&) = default;

    InstructionsImageLayer(InstructionsImageLayer&&) = default;
    InstructionsImageLayer& operator=(InstructionsImageLayer&&) = default;

    InstructionsImageLayer(::zserio::PropagateAllocatorT,
            const InstructionsImageLayer& other, const allocator_type& allocator);

    ::nds::instructions::metadata::InstructionsImageLayerContent getContent() const;
    void setContent(::nds::instructions::metadata::InstructionsImageLayerContent content_);

    const ::nds::instructions::types::SignpostImageList& getSignpostImageList() const;
    ::nds::instructions::types::SignpostImageList& getSignpostImageList();
    void setSignpostImageList(const ::nds::instructions::types::SignpostImageList& signpostImageList_);
    void setSignpostImageList(::nds::instructions::types::SignpostImageList&& signpostImageList_);
    bool isSignpostImageListUsed() const;
    bool isSignpostImageListSet() const;
    void resetSignpostImageList();

    const ::nds::instructions::types::JunctionViewImageList& getJunctionViewImageList() const;
    ::nds::instructions::types::JunctionViewImageList& getJunctionViewImageList();
    void setJunctionViewImageList(const ::nds::instructions::types::JunctionViewImageList& junctionViewImageList_);
    void setJunctionViewImageList(::nds::instructions::types::JunctionViewImageList&& junctionViewImageList_);
    bool isJunctionViewImageListUsed() const;
    bool isJunctionViewImageListSet() const;
    void resetJunctionViewImageList();

    ::nds::system::types::LayerType funcGetLayerType() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const InstructionsImageLayer& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::instructions::metadata::InstructionsImageLayerContent readContent(::zserio::BitStreamReader& in);
    ::nds::instructions::metadata::InstructionsImageLayerContent readContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::instructions::types::SignpostImageList> readSignpostImageList(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::instructions::types::SignpostImageList> readSignpostImageList(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::instructions::types::JunctionViewImageList> readJunctionViewImageList(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::instructions::types::JunctionViewImageList> readJunctionViewImageList(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::instructions::metadata::InstructionsImageLayerContent m_content_;
    ::zserio::InplaceOptionalHolder<::nds::instructions::types::SignpostImageList> m_signpostImageList_;
    ::zserio::InplaceOptionalHolder<::nds::instructions::types::JunctionViewImageList> m_junctionViewImageList_;
};

} // namespace layer
} // namespace instructions
} // namespace nds

#endif // NDS_INSTRUCTIONS_LAYER_INSTRUCTIONS_IMAGE_LAYER_H
