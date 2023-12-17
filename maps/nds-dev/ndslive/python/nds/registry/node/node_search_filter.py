# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.registry.node.node_type
import nds.registry.node.service_information_filter
import nds.system.types.nds_system_token

class NodeSearchFilter:
    def __init__(
            self,
            system_id_: typing.Union[nds.system.types.nds_system_token.NdsSystemToken, None] = None,
            node_type_: typing.Union[nds.registry.node.node_type.NodeType, None] = None,
            service_info_filter_: typing.Optional[nds.registry.node.service_information_filter.ServiceInformationFilter] = None) -> None:
        self._system_id_ = system_id_
        self._node_type_ = node_type_
        self._service_info_filter_ = service_info_filter_

    @classmethod
    def from_reader(
            cls: typing.Type['NodeSearchFilter'],
            zserio_reader: zserio.BitStreamReader) -> 'NodeSearchFilter':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['NodeSearchFilter'],
            zserio_context: NodeSearchFilter.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'NodeSearchFilter':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, NodeSearchFilter):
            return ((self._system_id_ == other._system_id_) and
                    (self._node_type_ == other._node_type_) and
                    (not other.is_service_info_filter_used() if not self.is_service_info_filter_used() else (self._service_info_filter_ == other._service_info_filter_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._system_id_)
        result = zserio.hashcode.calc_hashcode_object(result, self._node_type_)
        if self.is_service_info_filter_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._service_info_filter_)

        return result

    @property
    def system_id(self) -> typing.Union[nds.system.types.nds_system_token.NdsSystemToken, None]:
        return self._system_id_

    @system_id.setter
    def system_id(self, system_id_: typing.Union[nds.system.types.nds_system_token.NdsSystemToken, None]) -> None:
        self._system_id_ = system_id_

    @property
    def node_type(self) -> typing.Union[nds.registry.node.node_type.NodeType, None]:
        return self._node_type_

    @node_type.setter
    def node_type(self, node_type_: typing.Union[nds.registry.node.node_type.NodeType, None]) -> None:
        self._node_type_ = node_type_

    @property
    def service_info_filter(self) -> typing.Optional[nds.registry.node.service_information_filter.ServiceInformationFilter]:
        return self._service_info_filter_

    @service_info_filter.setter
    def service_info_filter(self, service_info_filter_: typing.Optional[nds.registry.node.service_information_filter.ServiceInformationFilter]) -> None:
        self._service_info_filter_ = service_info_filter_

    def is_service_info_filter_used(self) -> bool:
        return self._node_type_ == nds.registry.node.node_type.NodeType.SERVICE

    def is_service_info_filter_set(self) -> bool:
        return not self._service_info_filter_ is None

    def reset_service_info_filter(self) -> None:
        self._service_info_filter_ = None

    def init_packing_context(self, zserio_context: NodeSearchFilter.ZserioPackingContext) -> None:
        self._system_id_.init_packing_context(zserio_context.system_id)
        self._node_type_.init_packing_context(zserio_context.node_type)
        if self.is_service_info_filter_used():
            self._service_info_filter_.init_packing_context(zserio_context.service_info_filter)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._system_id_.bitsizeof(end_bitposition)
        end_bitposition += self._node_type_.bitsizeof(end_bitposition)
        if self.is_service_info_filter_used():
            end_bitposition += self._service_info_filter_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: NodeSearchFilter.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._system_id_.bitsizeof_packed(zserio_context.system_id, end_bitposition)
        end_bitposition += self._node_type_.bitsizeof_packed(zserio_context.node_type, end_bitposition)
        if self.is_service_info_filter_used():
            end_bitposition += self._service_info_filter_.bitsizeof_packed(zserio_context.service_info_filter, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._system_id_.initialize_offsets(end_bitposition)
        end_bitposition = self._node_type_.initialize_offsets(end_bitposition)
        if self.is_service_info_filter_used():
            end_bitposition = self._service_info_filter_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: NodeSearchFilter.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._system_id_.initialize_offsets_packed(zserio_context.system_id, end_bitposition)
        end_bitposition = self._node_type_.initialize_offsets_packed(zserio_context.node_type, end_bitposition)
        if self.is_service_info_filter_used():
            end_bitposition = self._service_info_filter_.initialize_offsets_packed(zserio_context.service_info_filter, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._system_id_ = nds.system.types.nds_system_token.NdsSystemToken.from_reader(zserio_reader)
        self._node_type_ = nds.registry.node.node_type.NodeType.from_reader(zserio_reader)
        if self.is_service_info_filter_used():
            self._service_info_filter_ = nds.registry.node.service_information_filter.ServiceInformationFilter.from_reader(zserio_reader)
        else:
            self._service_info_filter_ = None

    def read_packed(self, zserio_context: NodeSearchFilter.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._system_id_ = nds.system.types.nds_system_token.NdsSystemToken.from_reader_packed(zserio_context.system_id, zserio_reader)

        self._node_type_ = nds.registry.node.node_type.NodeType.from_reader_packed(zserio_context.node_type, zserio_reader)

        if self.is_service_info_filter_used():
            self._service_info_filter_ = nds.registry.node.service_information_filter.ServiceInformationFilter.from_reader_packed(zserio_context.service_info_filter, zserio_reader)
        else:
            self._service_info_filter_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._system_id_.write(zserio_writer)
        self._node_type_.write(zserio_writer)
        if self.is_service_info_filter_used():
            self._service_info_filter_.write(zserio_writer)

    def write_packed(self, zserio_context: NodeSearchFilter.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._system_id_.write_packed(zserio_context.system_id, zserio_writer)

        self._node_type_.write_packed(zserio_context.node_type, zserio_writer)

        if self.is_service_info_filter_used():
            self._service_info_filter_.write_packed(zserio_context.service_info_filter, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._system_id_ = nds.system.types.nds_system_token.NdsSystemToken.ZserioPackingContext()
            self._node_type_ = zserio.array.DeltaContext()
            self._service_info_filter_ = nds.registry.node.service_information_filter.ServiceInformationFilter.ZserioPackingContext()

        @property
        def system_id(self):
            return self._system_id_

        @property
        def node_type(self):
            return self._node_type_

        @property
        def service_info_filter(self):
            return self._service_info_filter_
