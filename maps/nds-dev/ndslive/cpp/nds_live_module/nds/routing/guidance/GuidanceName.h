/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTING_GUIDANCE_GUIDANCE_NAME_H
#define NDS_ROUTING_GUIDANCE_GUIDANCE_NAME_H

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
#include <zserio/Array.h>
#include <zserio/ArrayTraits.h>
#include <zserio/Types.h>
#include <zserio/Vector.h>

#include <nds/routing/guidance/GuidanceNameClass.h>
#include <nds/routing/guidance/GuidanceNameString.h>

namespace nds
{
namespace routing
{
namespace guidance
{

class GuidanceName
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getGuidanceNameClass()
        {
            return m_guidanceNameClass_;
        }

        ::zserio::DeltaContext& getNumNames()
        {
            return m_numNames_;
        }

    private:
        ::zserio::DeltaContext m_guidanceNameClass_;
        ::zserio::DeltaContext m_numNames_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    GuidanceName() noexcept :
            GuidanceName(allocator_type())
    {}

    explicit GuidanceName(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_nameStrings = ::zserio::vector<::nds::routing::guidance::GuidanceNameString>>
    GuidanceName(
            ::nds::routing::guidance::GuidanceNameClass guidanceNameClass_,
            uint8_t numNames_,
            ZSERIO_T_nameStrings&& nameStrings_,
            const allocator_type& allocator = allocator_type()) :
            GuidanceName(allocator)
    {
        m_guidanceNameClass_ = guidanceNameClass_;
        m_numNames_ = numNames_;
        m_nameStrings_ = ZserioArrayType_nameStrings(::std::forward<ZSERIO_T_nameStrings>(nameStrings_));
    }

    explicit GuidanceName(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit GuidanceName(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~GuidanceName() = default;

    GuidanceName(const GuidanceName& other);
    GuidanceName& operator=(const GuidanceName& other);

    GuidanceName(GuidanceName&& other);
    GuidanceName& operator=(GuidanceName&& other);

    GuidanceName(::zserio::PropagateAllocatorT,
            const GuidanceName& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::routing::guidance::GuidanceNameClass getGuidanceNameClass() const;
    void setGuidanceNameClass(::nds::routing::guidance::GuidanceNameClass guidanceNameClass_);

    uint8_t getNumNames() const;
    void setNumNames(uint8_t numNames_);

    const ::zserio::vector<::nds::routing::guidance::GuidanceNameString>& getNameStrings() const;
    ::zserio::vector<::nds::routing::guidance::GuidanceNameString>& getNameStrings();
    void setNameStrings(const ::zserio::vector<::nds::routing::guidance::GuidanceNameString>& nameStrings_);
    void setNameStrings(::zserio::vector<::nds::routing::guidance::GuidanceNameString>&& nameStrings_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const GuidanceName& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_nameStrings
    {
    public:
        using OwnerType = GuidanceName;

        static void initializeElement(GuidanceName& owner,
                ::nds::routing::guidance::GuidanceNameString& element, size_t index);
    };

    class ZserioElementFactory_nameStrings
    {
    public:
        using OwnerType = GuidanceName;

        static void create(GuidanceName& owner,
                ::zserio::vector<::nds::routing::guidance::GuidanceNameString>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(GuidanceName& owner,
                ::zserio::vector<::nds::routing::guidance::GuidanceNameString>& array,
                ::nds::routing::guidance::GuidanceNameString::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_nameStrings = ::zserio::Array<::zserio::vector<::nds::routing::guidance::GuidanceNameString>, ::zserio::ObjectArrayTraits<::nds::routing::guidance::GuidanceNameString, ZserioElementFactory_nameStrings>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_nameStrings>;

    ::nds::routing::guidance::GuidanceNameClass readGuidanceNameClass(::zserio::BitStreamReader& in);
    ::nds::routing::guidance::GuidanceNameClass readGuidanceNameClass(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    uint8_t readNumNames(::zserio::BitStreamReader& in);
    uint8_t readNumNames(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_nameStrings readNameStrings(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_nameStrings readNameStrings(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::routing::guidance::GuidanceNameClass m_guidanceNameClass_;
    uint8_t m_numNames_;
    ZserioArrayType_nameStrings m_nameStrings_;
};

} // namespace guidance
} // namespace routing
} // namespace nds

#endif // NDS_ROUTING_GUIDANCE_GUIDANCE_NAME_H