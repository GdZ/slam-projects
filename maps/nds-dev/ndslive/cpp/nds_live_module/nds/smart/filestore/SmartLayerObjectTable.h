/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SMART_FILESTORE_SMART_LAYER_OBJECT_TABLE_H
#define NDS_SMART_FILESTORE_SMART_LAYER_OBJECT_TABLE_H

#include <zserio/CppRuntimeVersion.h>
#if CPP_EXTENSION_RUNTIME_VERSION_NUMBER != 2012000
    #error Version mismatch between Zserio runtime library and Zserio compiler!
    #error Please update your Zserio runtime library to the version 2.12.0.
#endif

#include <memory>
#include <sqlite3.h>
#include <zserio/Vector.h>
#include <zserio/ArrayTraits.h>
#include <zserio/String.h>
#include <zserio/AllocatorHolder.h>
#include <zserio/Span.h>
#include <zserio/StringView.h>
#include <zserio/SqliteConnection.h>
#include <zserio/SqliteFinalizer.h>
#include <zserio/OptionalHolder.h>
#include <zserio/ArrayTraits.h>

#include <nds/smart/object/SmartLayerObject.h>
#include <nds/smart/object/SmartLayerObjectClass.h>
#include <nds/smart/object/SmartLayerObjectId.h>
#include <nds/smart/types/SmartLayerHeader.h>

namespace nds
{
namespace smart
{
namespace filestore
{

class SmartLayerObjectTable : public ::zserio::AllocatorHolder<::std::allocator<uint8_t>>
{
public:
    class Row
    {
    public:
        ::nds::smart::object::SmartLayerObjectId getObjectId() const;
        void setObjectId(::nds::smart::object::SmartLayerObjectId objectId_);
        void resetObjectId();
        bool isObjectIdSet() const;

        ::nds::smart::object::SmartLayerObjectClass getObjectClass() const;
        void setObjectClass(::nds::smart::object::SmartLayerObjectClass objectClass_);
        void resetObjectClass();
        bool isObjectClassSet() const;

        ::nds::smart::object::SmartLayerObject& getSmartLayer();
        const ::nds::smart::object::SmartLayerObject& getSmartLayer() const;
        void setSmartLayer(const ::nds::smart::object::SmartLayerObject& smartLayer_);
        void setSmartLayer(::nds::smart::object::SmartLayerObject&& smartLayer_);
        void resetSmartLayer();
        bool isSmartLayerSet() const;

        ::nds::smart::types::SmartLayerHeader& getHeader();
        const ::nds::smart::types::SmartLayerHeader& getHeader() const;
        void setHeader(const ::nds::smart::types::SmartLayerHeader& header_);
        void setHeader(::nds::smart::types::SmartLayerHeader&& header_);
        void resetHeader();
        bool isHeaderSet() const;

        void initializeChildren();

    private:
        ::zserio::InplaceOptionalHolder<::nds::smart::object::SmartLayerObjectId> m_objectId_;
        ::zserio::InplaceOptionalHolder<::nds::smart::object::SmartLayerObjectClass> m_objectClass_;
        ::zserio::InplaceOptionalHolder<::nds::smart::object::SmartLayerObject> m_smartLayer_;
        ::zserio::InplaceOptionalHolder<::nds::smart::types::SmartLayerHeader> m_header_;
    };

    class Reader : public ::zserio::AllocatorHolder<::std::allocator<uint8_t>>
    {
    public:
        ~Reader() = default;

        Reader(const Reader&) = delete;
        Reader& operator=(const Reader&) = delete;

        Reader(Reader&&) = default;
        Reader& operator=(Reader&&) = delete;

        bool hasNext() const noexcept;
        Row next();

    private:
        explicit Reader(::zserio::SqliteConnection& db, const ::zserio::string<>& sqlQuery, const allocator_type& allocator = allocator_type());
        friend class SmartLayerObjectTable;

        void makeStep();

        ::std::unique_ptr<sqlite3_stmt, ::zserio::SqliteFinalizer> m_stmt;
        int m_lastResult;
    };

    SmartLayerObjectTable(::zserio::SqliteConnection& db, ::zserio::StringView tableName,
            ::zserio::StringView attachedDbName = ::zserio::StringView(),
            const allocator_type& allocator = allocator_type());
    SmartLayerObjectTable(::zserio::SqliteConnection& db, ::zserio::StringView tableName, const allocator_type& allocator);

    ~SmartLayerObjectTable() = default;

    SmartLayerObjectTable(const SmartLayerObjectTable&) = delete;
    SmartLayerObjectTable& operator=(const SmartLayerObjectTable&) = delete;

    SmartLayerObjectTable(SmartLayerObjectTable&&) = delete;
    SmartLayerObjectTable& operator=(SmartLayerObjectTable&&) = delete;

    void createTable();
    void deleteTable();

    Reader createReader(::zserio::StringView condition = ::zserio::StringView()) const;
    void write(::zserio::Span<Row> rows);
    void update(Row& row, ::zserio::StringView whereCondition);

private:
    void writeRow(Row& row, sqlite3_stmt& statement);

    void appendCreateTableToQuery(::zserio::string<>& sqlQuery) const;

    void appendTableNameToQuery(::zserio::string<>& sqlQuery) const;

    ::zserio::SqliteConnection& m_db;
    ::zserio::StringView m_name;
    ::zserio::StringView m_attachedDbName;
};

} // namespace filestore
} // namespace smart
} // namespace nds

#endif // NDS_SMART_FILESTORE_SMART_LAYER_OBJECT_TABLE_H
