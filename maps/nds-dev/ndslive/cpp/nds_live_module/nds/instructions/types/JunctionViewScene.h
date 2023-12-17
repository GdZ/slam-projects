/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_INSTRUCTIONS_TYPES_JUNCTION_VIEW_SCENE_H
#define NDS_INSTRUCTIONS_TYPES_JUNCTION_VIEW_SCENE_H

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
#include <zserio/Array.h>
#include <zserio/ArrayTraits.h>
#include <zserio/Vector.h>

#include <nds/instructions/types/JunctionViewContent.h>
#include <nds/instructions/types/JunctionViewImageSetReference.h>

namespace nds
{
namespace instructions
{
namespace types
{

class JunctionViewScene
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getContent()
        {
            return m_content_;
        }

    private:
        ::zserio::DeltaContext m_content_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    JunctionViewScene() noexcept :
            JunctionViewScene(allocator_type())
    {}

    explicit JunctionViewScene(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_intersectionId = ::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>,
            typename ZSERIO_T_backgroundId = ::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>,
            typename ZSERIO_T_signboardId = ::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>,
            typename ZSERIO_T_arrowId = ::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>,
            typename ZSERIO_T_signboardArrowId = ::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>>
    JunctionViewScene(
            ::nds::instructions::types::JunctionViewContent content_,
            ZSERIO_T_intersectionId&& intersectionId_,
            ZSERIO_T_backgroundId&& backgroundId_,
            ZSERIO_T_signboardId&& signboardId_,
            ZSERIO_T_arrowId&& arrowId_,
            ZSERIO_T_signboardArrowId&& signboardArrowId_,
            const allocator_type& allocator = allocator_type()) :
            JunctionViewScene(allocator)
    {
        m_content_ = content_;
        m_intersectionId_ = ZserioArrayType_intersectionId(::std::forward<ZSERIO_T_intersectionId>(intersectionId_));
        m_backgroundId_ = ::zserio::createOptionalArray<ZserioArrayType_backgroundId>(::std::forward<ZSERIO_T_backgroundId>(backgroundId_));
        m_signboardId_ = ::zserio::createOptionalArray<ZserioArrayType_signboardId>(::std::forward<ZSERIO_T_signboardId>(signboardId_));
        m_arrowId_ = ::zserio::createOptionalArray<ZserioArrayType_arrowId>(::std::forward<ZSERIO_T_arrowId>(arrowId_));
        m_signboardArrowId_ = ::zserio::createOptionalArray<ZserioArrayType_signboardArrowId>(::std::forward<ZSERIO_T_signboardArrowId>(signboardArrowId_));
    }

    explicit JunctionViewScene(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit JunctionViewScene(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~JunctionViewScene() = default;

    JunctionViewScene(const JunctionViewScene&) = default;
    JunctionViewScene& operator=(const JunctionViewScene&) = default;

    JunctionViewScene(JunctionViewScene&&) = default;
    JunctionViewScene& operator=(JunctionViewScene&&) = default;

    JunctionViewScene(::zserio::PropagateAllocatorT,
            const JunctionViewScene& other, const allocator_type& allocator);

    ::nds::instructions::types::JunctionViewContent getContent() const;
    void setContent(::nds::instructions::types::JunctionViewContent content_);

    const ::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>& getIntersectionId() const;
    ::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>& getIntersectionId();
    void setIntersectionId(const ::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>& intersectionId_);
    void setIntersectionId(::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>&& intersectionId_);

    const ::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>& getBackgroundId() const;
    ::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>& getBackgroundId();
    void setBackgroundId(const ::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>& backgroundId_);
    void setBackgroundId(::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>&& backgroundId_);
    bool isBackgroundIdUsed() const;
    bool isBackgroundIdSet() const;
    void resetBackgroundId();

    const ::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>& getSignboardId() const;
    ::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>& getSignboardId();
    void setSignboardId(const ::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>& signboardId_);
    void setSignboardId(::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>&& signboardId_);
    bool isSignboardIdUsed() const;
    bool isSignboardIdSet() const;
    void resetSignboardId();

    const ::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>& getArrowId() const;
    ::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>& getArrowId();
    void setArrowId(const ::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>& arrowId_);
    void setArrowId(::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>&& arrowId_);
    bool isArrowIdUsed() const;
    bool isArrowIdSet() const;
    void resetArrowId();

    const ::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>& getSignboardArrowId() const;
    ::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>& getSignboardArrowId();
    void setSignboardArrowId(const ::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>& signboardArrowId_);
    void setSignboardArrowId(::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>&& signboardArrowId_);
    bool isSignboardArrowIdUsed() const;
    bool isSignboardArrowIdSet() const;
    void resetSignboardArrowId();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const JunctionViewScene& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    using ZserioArrayType_intersectionId = ::zserio::Array<::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>, ::zserio::VarIntArrayTraits<::nds::instructions::types::JunctionViewImageSetReference>, ::zserio::ArrayType::AUTO>;
    using ZserioArrayType_backgroundId = ::zserio::Array<::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>, ::zserio::VarIntArrayTraits<::nds::instructions::types::JunctionViewImageSetReference>, ::zserio::ArrayType::AUTO>;
    using ZserioArrayType_signboardId = ::zserio::Array<::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>, ::zserio::VarIntArrayTraits<::nds::instructions::types::JunctionViewImageSetReference>, ::zserio::ArrayType::AUTO>;
    using ZserioArrayType_arrowId = ::zserio::Array<::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>, ::zserio::VarIntArrayTraits<::nds::instructions::types::JunctionViewImageSetReference>, ::zserio::ArrayType::AUTO>;
    using ZserioArrayType_signboardArrowId = ::zserio::Array<::zserio::vector<::nds::instructions::types::JunctionViewImageSetReference>, ::zserio::VarIntArrayTraits<::nds::instructions::types::JunctionViewImageSetReference>, ::zserio::ArrayType::AUTO>;

    ::nds::instructions::types::JunctionViewContent readContent(::zserio::BitStreamReader& in);
    ::nds::instructions::types::JunctionViewContent readContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_intersectionId readIntersectionId(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_intersectionId readIntersectionId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_backgroundId> readBackgroundId(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_backgroundId> readBackgroundId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_signboardId> readSignboardId(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_signboardId> readSignboardId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_arrowId> readArrowId(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_arrowId> readArrowId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_signboardArrowId> readSignboardArrowId(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_signboardArrowId> readSignboardArrowId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::instructions::types::JunctionViewContent m_content_;
    ZserioArrayType_intersectionId m_intersectionId_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_backgroundId> m_backgroundId_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_signboardId> m_signboardId_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_arrowId> m_arrowId_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_signboardArrowId> m_signboardArrowId_;
};

} // namespace types
} // namespace instructions
} // namespace nds

#endif // NDS_INSTRUCTIONS_TYPES_JUNCTION_VIEW_SCENE_H
