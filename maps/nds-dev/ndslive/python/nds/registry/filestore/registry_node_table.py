# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import apsw

import nds.core.geometry.spatial_extent
import nds.registry.node.connection_costs
import nds.registry.node.node_type
import nds.registry.node.protocol_type
import nds.registry.node.service_information
import nds.system.types.module_definition
import nds.system.types.nds_node_legal_info
import nds.system.types.nds_node_token
import nds.system.types.nds_system_token
import zserio

class RegistryNodeTable:
    class Rows:
        def __init__(self, rows: typing.Iterator[typing.Tuple]) -> None:
            self._rows = rows

        def __iter__(self) -> typing.Iterator['RegistryNodeTable.ROW_ANNOTATION']:
            for row in self._rows:
                yield self._read_row(row)

        @staticmethod
        def _read_row(row: typing.Tuple) -> 'RegistryNodeTable.ROW_ANNOTATION':
            system_id_ = row[0]
            if system_id_ is not None:
                reader = zserio.BitStreamReader(system_id_)
                system_id_ = nds.system.types.nds_system_token.NdsSystemToken.from_reader(reader)
            node_token_ = row[1]
            if node_token_ is not None:
                reader = zserio.BitStreamReader(node_token_)
                node_token_ = nds.system.types.nds_node_token.NdsNodeToken.from_reader(reader)
            legal_info_ = row[2]
            if legal_info_ is not None:
                reader = zserio.BitStreamReader(legal_info_)
                legal_info_ = nds.system.types.nds_node_legal_info.NdsNodeLegalInfo.from_reader(reader)
            type_ = row[3]
            if type_ is not None:
                type_ = nds.registry.node.node_type.NodeType(type_)
            connection_costs_ = row[4]
            spatial_coverage_ = row[5]
            if spatial_coverage_ is not None:
                reader = zserio.BitStreamReader(spatial_coverage_)
                spatial_coverage_ = nds.core.geometry.spatial_extent.SpatialExtent.from_reader(reader)
            protocol_type_ = row[6]
            protocol_details_uri_ = row[7]
            node_name_ = row[8]
            host_name_ = row[9]
            port_ = row[10]
            service_information_ = row[11]
            if service_information_ is not None:
                reader = zserio.BitStreamReader(service_information_)
                service_information_ = nds.registry.node.service_information.ServiceInformation.from_reader(reader)
            registry_definition_ = row[12]
            if registry_definition_ is not None:
                reader = zserio.BitStreamReader(registry_definition_)
                registry_definition_ = nds.system.types.module_definition.ModuleDefinition.from_reader(reader)

            return (system_id_, node_token_, legal_info_, type_, connection_costs_, spatial_coverage_, protocol_type_, protocol_details_uri_, node_name_, host_name_, port_, service_information_, registry_definition_)

    def __init__(self, connection: apsw.Connection, table_name: str, attached_db_name: str = None) -> None:
        self._connection: apsw.Connection = connection
        self._table_name: str = table_name
        self._attached_db_name: str = attached_db_name

    def create_table(self) -> None:
        sql_query = self._get_create_table_query()
        cursor = self._connection.cursor()
        cursor.execute(sql_query)

    def delete_table(self) -> None:
        sql_query = "DROP TABLE "
        sql_query += self._get_table_name_in_query()
        cursor = self._connection.cursor()
        cursor.execute(sql_query)

    def read(self, condition: str = None) -> 'RegistryNodeTable.Rows':
        sql_query = ("SELECT "
                    "systemId, "
                    "nodeToken, "
                    "legalInfo, "
                    "type, "
                    "connectionCosts, "
                    "spatialCoverage, "
                    "protocolType, "
                    "protocolDetailsUri, "
                    "nodeName, "
                    "hostName, "
                    "port, "
                    "serviceInformation, "
                    "registryDefinition"
                    " FROM ")
        sql_query += self._get_table_name_in_query()
        if condition:
            sql_query += " WHERE " + condition

        cursor = self._connection.cursor()
        read_rows = cursor.execute(sql_query)

        return RegistryNodeTable.Rows(read_rows)

    def write(self, rows: typing.Sequence['RegistryNodeTable.ROW_ANNOTATION']) -> None:
        sql_query = "INSERT INTO "
        sql_query += self._get_table_name_in_query()
        sql_query += ("("
                     "systemId, "
                     "nodeToken, "
                     "legalInfo, "
                     "type, "
                     "connectionCosts, "
                     "spatialCoverage, "
                     "protocolType, "
                     "protocolDetailsUri, "
                     "nodeName, "
                     "hostName, "
                     "port, "
                     "serviceInformation, "
                     "registryDefinition"
                     ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")

        cursor = self._connection.cursor()
        has_autocommit = self._connection.getautocommit()
        if has_autocommit:
            cursor.execute("BEGIN")

        for row in rows:
            cursor.execute(sql_query, self._write_row(row))

        if has_autocommit:
            cursor.execute("COMMIT")

    def update(self, row: 'RegistryNodeTable.ROW_ANNOTATION', where_condition: str) -> None:
        sql_query = "UPDATE "
        sql_query += self._get_table_name_in_query()
        sql_query += (" SET"
                     " systemId=?,"
                     " nodeToken=?,"
                     " legalInfo=?,"
                     " type=?,"
                     " connectionCosts=?,"
                     " spatialCoverage=?,"
                     " protocolType=?,"
                     " protocolDetailsUri=?,"
                     " nodeName=?,"
                     " hostName=?,"
                     " port=?,"
                     " serviceInformation=?,"
                     " registryDefinition=?"
                     " WHERE ") + where_condition

        cursor = self._connection.cursor()
        cursor.execute(sql_query, self._write_row(row))

    def _get_table_name_in_query(self) -> str:
        return (self._attached_db_name + "." + self._table_name) if self._attached_db_name else self._table_name

    def _get_create_table_query(self) -> str:
        sql_query = "CREATE TABLE "
        sql_query += self._get_table_name_in_query()
        sql_query += ("(" +
                     "systemId BLOB" + " " + "NOT NULL" + "," +
                     "nodeToken BLOB" + " " + "NOT NULL" + "," +
                     "legalInfo BLOB" + " " + "NOT NULL" + "," +
                     "type INTEGER" + " " + "NOT NULL" + "," +
                     "connectionCosts INTEGER" + " " + "NOT NULL" + "," +
                     "spatialCoverage BLOB" + " " + "NOT NULL" + "," +
                     "protocolType INTEGER" + " " + "NOT NULL" + "," +
                     "protocolDetailsUri TEXT" + " " + "NOT NULL" + "," +
                     "nodeName TEXT" + " " + "NOT NULL" + "," +
                     "hostName TEXT" + " " + "NOT NULL" + "," +
                     "port INTEGER" + " " + "NOT NULL" + "," +
                     "serviceInformation BLOB" + " " + "NULL" + "," +
                     "registryDefinition BLOB" + " " + "NULL" +
                     ", " +
                     "primary key (systemId, nodeToken)" +
                     ")")

        return sql_query

    @staticmethod
    def _write_row(row: 'RegistryNodeTable.ROW_ANNOTATION') -> typing.List:
        row_in_list : typing.List = list(row)

        system_id_ = row_in_list[0]
        if isinstance(system_id_, nds.system.types.nds_system_token.NdsSystemToken):
            writer = zserio.BitStreamWriter()
            system_id_.write(writer)
            row_in_list[0] = writer.byte_array

        node_token_ = row_in_list[1]
        if isinstance(node_token_, nds.system.types.nds_node_token.NdsNodeToken):
            writer = zserio.BitStreamWriter()
            node_token_.write(writer)
            row_in_list[1] = writer.byte_array

        legal_info_ = row_in_list[2]
        if isinstance(legal_info_, nds.system.types.nds_node_legal_info.NdsNodeLegalInfo):
            writer = zserio.BitStreamWriter()
            legal_info_.write(writer)
            row_in_list[2] = writer.byte_array

        type_ = row_in_list[3]
        if isinstance(type_, nds.registry.node.node_type.NodeType):
            row_in_list[3] = type_.value

        spatial_coverage_ = row_in_list[5]
        if isinstance(spatial_coverage_, nds.core.geometry.spatial_extent.SpatialExtent):
            writer = zserio.BitStreamWriter()
            spatial_coverage_.write(writer)
            row_in_list[5] = writer.byte_array

        service_information_ = row_in_list[11]
        if isinstance(service_information_, nds.registry.node.service_information.ServiceInformation):
            writer = zserio.BitStreamWriter()
            service_information_.write(writer)
            row_in_list[11] = writer.byte_array

        registry_definition_ = row_in_list[12]
        if isinstance(registry_definition_, nds.system.types.module_definition.ModuleDefinition):
            writer = zserio.BitStreamWriter()
            registry_definition_.write(writer)
            row_in_list[12] = writer.byte_array

        return row_in_list

    ROW_ANNOTATION = typing.Tuple[
        nds.system.types.nds_system_token.NdsSystemToken,
        nds.system.types.nds_node_token.NdsNodeToken,
        nds.system.types.nds_node_legal_info.NdsNodeLegalInfo,
        nds.registry.node.node_type.NodeType,
        nds.registry.node.connection_costs.ConnectionCosts,
        nds.core.geometry.spatial_extent.SpatialExtent,
        nds.registry.node.protocol_type.ProtocolType,
        str,
        str,
        str,
        int,
        nds.registry.node.service_information.ServiceInformation,
        nds.system.types.module_definition.ModuleDefinition]
