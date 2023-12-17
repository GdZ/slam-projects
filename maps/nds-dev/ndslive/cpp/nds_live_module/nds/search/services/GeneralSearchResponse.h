/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SEARCH_SERVICES_GENERAL_SEARCH_RESPONSE_H
#define NDS_SEARCH_SERVICES_GENERAL_SEARCH_RESPONSE_H

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
#include <zserio/Types.h>
#include <zserio/Vector.h>

#include <nds/search/types/NextValidCharacterList.h>
#include <nds/search/types/SearchResult.h>
#include <nds/search/types/Suggestions.h>

namespace nds
{
namespace search
{
namespace services
{

class GeneralSearchResponse
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumResults()
        {
            return m_numResults_;
        }

    private:
        ::zserio::DeltaContext m_numResults_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    GeneralSearchResponse() noexcept :
            GeneralSearchResponse(allocator_type())
    {}

    explicit GeneralSearchResponse(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_suggestionList = ::nds::search::types::Suggestions,
            typename ZSERIO_T_nvcList = ::nds::search::types::NextValidCharacterList,
            typename ZSERIO_T_results = ::zserio::vector<::nds::search::types::SearchResult>>
    GeneralSearchResponse(
            bool hasDistanceInfo_,
            ZSERIO_T_suggestionList&& suggestionList_,
            ZSERIO_T_nvcList&& nvcList_,
            uint32_t numResults_,
            ZSERIO_T_results&& results_,
            const allocator_type& allocator = allocator_type()) :
            GeneralSearchResponse(allocator)
    {
        m_hasDistanceInfo_ = hasDistanceInfo_;
        m_suggestionList_ = ::std::forward<ZSERIO_T_suggestionList>(suggestionList_);
        m_nvcList_ = ::std::forward<ZSERIO_T_nvcList>(nvcList_);
        m_numResults_ = numResults_;
        m_results_ = ZserioArrayType_results(::std::forward<ZSERIO_T_results>(results_));
    }

    explicit GeneralSearchResponse(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit GeneralSearchResponse(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~GeneralSearchResponse() = default;

    GeneralSearchResponse(const GeneralSearchResponse& other);
    GeneralSearchResponse& operator=(const GeneralSearchResponse& other);

    GeneralSearchResponse(GeneralSearchResponse&& other);
    GeneralSearchResponse& operator=(GeneralSearchResponse&& other);

    GeneralSearchResponse(::zserio::PropagateAllocatorT,
            const GeneralSearchResponse& other, const allocator_type& allocator);

    void initializeChildren();

    bool getHasDistanceInfo() const;
    void setHasDistanceInfo(bool hasDistanceInfo_);

    const ::nds::search::types::Suggestions& getSuggestionList() const;
    ::nds::search::types::Suggestions& getSuggestionList();
    void setSuggestionList(const ::nds::search::types::Suggestions& suggestionList_);
    void setSuggestionList(::nds::search::types::Suggestions&& suggestionList_);
    bool isSuggestionListUsed() const;
    bool isSuggestionListSet() const;
    void resetSuggestionList();

    const ::nds::search::types::NextValidCharacterList& getNvcList() const;
    ::nds::search::types::NextValidCharacterList& getNvcList();
    void setNvcList(const ::nds::search::types::NextValidCharacterList& nvcList_);
    void setNvcList(::nds::search::types::NextValidCharacterList&& nvcList_);
    bool isNvcListUsed() const;
    bool isNvcListSet() const;
    void resetNvcList();

    uint32_t getNumResults() const;
    void setNumResults(uint32_t numResults_);

    const ::zserio::vector<::nds::search::types::SearchResult>& getResults() const;
    ::zserio::vector<::nds::search::types::SearchResult>& getResults();
    void setResults(const ::zserio::vector<::nds::search::types::SearchResult>& results_);
    void setResults(::zserio::vector<::nds::search::types::SearchResult>&& results_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const GeneralSearchResponse& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_results
    {
    public:
        using OwnerType = GeneralSearchResponse;

        static void initializeElement(GeneralSearchResponse& owner,
                ::nds::search::types::SearchResult& element, size_t index);
    };

    class ZserioElementFactory_results
    {
    public:
        using OwnerType = GeneralSearchResponse;

        static void create(GeneralSearchResponse& owner,
                ::zserio::vector<::nds::search::types::SearchResult>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(GeneralSearchResponse& owner,
                ::zserio::vector<::nds::search::types::SearchResult>& array,
                ::nds::search::types::SearchResult::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_results = ::zserio::Array<::zserio::vector<::nds::search::types::SearchResult>, ::zserio::ObjectArrayTraits<::nds::search::types::SearchResult, ZserioElementFactory_results>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_results>;

    bool readHasDistanceInfo(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::search::types::Suggestions> readSuggestionList(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::search::types::NextValidCharacterList> readNvcList(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    uint32_t readNumResults(::zserio::BitStreamReader& in);
    uint32_t readNumResults(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_results readResults(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_results readResults(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    bool m_hasDistanceInfo_;
    ::zserio::InplaceOptionalHolder<::nds::search::types::Suggestions> m_suggestionList_;
    ::zserio::InplaceOptionalHolder<::nds::search::types::NextValidCharacterList> m_nvcList_;
    uint32_t m_numResults_;
    ZserioArrayType_results m_results_;
};

} // namespace services
} // namespace search
} // namespace nds

#endif // NDS_SEARCH_SERVICES_GENERAL_SEARCH_RESPONSE_H