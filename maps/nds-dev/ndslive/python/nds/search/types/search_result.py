# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.coord_shift
import nds.core.geometry.position2d
import nds.core.location.road_location_path
import nds.core.types.distance_meters
import nds.core.types.global_source_id
import nds.search.types.search_result_type
import nds.search.types.text_range
import nds.system.types.extern_data

class SearchResult:
    def __init__(
            self,
            has_distance_info_: bool,
            position_: typing.Union[nds.core.geometry.position2d.Position2D, None] = None,
            path_: typing.Optional[nds.core.location.road_location_path.RoadLocationPath] = None,
            distance_to_origin_: typing.Optional[nds.core.types.distance_meters.DistanceMeters] = None,
            has_travel_distance_: typing.Optional[bool] = None,
            travel_distance_to_origin_: typing.Optional[nds.core.types.distance_meters.DistanceMeters] = None,
            display_string_: str = str(),
            highlight_: typing.Optional[typing.List[nds.search.types.text_range.TextRange]] = None,
            type_: typing.Union[nds.search.types.search_result_type.SearchResultType, None] = None,
            global_source_id_: typing.Optional[nds.core.types.global_source_id.GlobalSourceId] = None,
            detailed_result_information_: typing.Optional[nds.system.types.extern_data.ExternData] = None) -> None:
        self._has_distance_info_ = has_distance_info_
        self._position_ = position_
        self._path_ = path_
        self._distance_to_origin_ = distance_to_origin_
        self._has_travel_distance_ = has_travel_distance_
        self._travel_distance_to_origin_ = travel_distance_to_origin_
        self._display_string_ = display_string_
        if highlight_ is None:
            self._highlight_ = None
        else:
            self._highlight_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_highlight()), highlight_, is_auto=True)
        self._type_ = type_
        self._global_source_id_ = global_source_id_
        self._detailed_result_information_ = detailed_result_information_

    @classmethod
    def from_reader(
            cls: typing.Type['SearchResult'],
            zserio_reader: zserio.BitStreamReader,
            has_distance_info_: bool) -> 'SearchResult':
        self = object.__new__(cls)
        self._has_distance_info_ = has_distance_info_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['SearchResult'],
            zserio_context: SearchResult.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            has_distance_info_: bool) -> 'SearchResult':
        self = object.__new__(cls)
        self._has_distance_info_ = has_distance_info_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, SearchResult):
            return (self._has_distance_info_ == other._has_distance_info_ and
                    (self._position_ == other._position_) and
                    (not other.is_path_used() if not self.is_path_used() else (self._path_ == other._path_)) and
                    (not other.is_distance_to_origin_used() if not self.is_distance_to_origin_used() else (self._distance_to_origin_ == other._distance_to_origin_)) and
                    (not other.is_has_travel_distance_used() if not self.is_has_travel_distance_used() else (self._has_travel_distance_ == other._has_travel_distance_)) and
                    (not other.is_travel_distance_to_origin_used() if not self.is_travel_distance_to_origin_used() else (self._travel_distance_to_origin_ == other._travel_distance_to_origin_)) and
                    (self._display_string_ == other._display_string_) and
                    (not other.is_highlight_used() if not self.is_highlight_used() else (self._highlight_ == other._highlight_)) and
                    (self._type_ == other._type_) and
                    (not other.is_global_source_id_used() if not self.is_global_source_id_used() else (self._global_source_id_ == other._global_source_id_)) and
                    (not other.is_detailed_result_information_used() if not self.is_detailed_result_information_used() else (self._detailed_result_information_ == other._detailed_result_information_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_bool(result, self._has_distance_info_)
        result = zserio.hashcode.calc_hashcode_object(result, self._position_)
        if self.is_path_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._path_)
        if self.is_distance_to_origin_used():
            result = zserio.hashcode.calc_hashcode_int32(result, self._distance_to_origin_)
        if self.is_has_travel_distance_used():
            result = zserio.hashcode.calc_hashcode_bool(result, self._has_travel_distance_)
        if self.is_travel_distance_to_origin_used():
            result = zserio.hashcode.calc_hashcode_int32(result, self._travel_distance_to_origin_)
        result = zserio.hashcode.calc_hashcode_string(result, self._display_string_)
        if self.is_highlight_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._highlight_)
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        if self.is_global_source_id_used():
            result = zserio.hashcode.calc_hashcode_string(result, self._global_source_id_)
        if self.is_detailed_result_information_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._detailed_result_information_)

        return result

    @property
    def has_distance_info(self) -> bool:
        return self._has_distance_info_

    @property
    def position(self) -> typing.Union[nds.core.geometry.position2d.Position2D, None]:
        return self._position_

    @position.setter
    def position(self, position_: typing.Union[nds.core.geometry.position2d.Position2D, None]) -> None:
        self._position_ = position_

    @property
    def path(self) -> typing.Optional[nds.core.location.road_location_path.RoadLocationPath]:
        return self._path_

    @path.setter
    def path(self, path_: typing.Optional[nds.core.location.road_location_path.RoadLocationPath]) -> None:
        self._path_ = path_

    def is_path_used(self) -> bool:
        return self.is_path_set()

    def is_path_set(self) -> bool:
        return not self._path_ is None

    def reset_path(self) -> None:
        self._path_ = None

    @property
    def distance_to_origin(self) -> typing.Optional[nds.core.types.distance_meters.DistanceMeters]:
        return self._distance_to_origin_

    @distance_to_origin.setter
    def distance_to_origin(self, distance_to_origin_: typing.Optional[nds.core.types.distance_meters.DistanceMeters]) -> None:
        self._distance_to_origin_ = distance_to_origin_

    def is_distance_to_origin_used(self) -> bool:
        return self._has_distance_info_

    def is_distance_to_origin_set(self) -> bool:
        return not self._distance_to_origin_ is None

    def reset_distance_to_origin(self) -> None:
        self._distance_to_origin_ = None

    @property
    def has_travel_distance(self) -> typing.Optional[bool]:
        return self._has_travel_distance_

    @has_travel_distance.setter
    def has_travel_distance(self, has_travel_distance_: typing.Optional[bool]) -> None:
        self._has_travel_distance_ = has_travel_distance_

    def is_has_travel_distance_used(self) -> bool:
        return self._has_distance_info_

    def is_has_travel_distance_set(self) -> bool:
        return not self._has_travel_distance_ is None

    def reset_has_travel_distance(self) -> None:
        self._has_travel_distance_ = None

    @property
    def travel_distance_to_origin(self) -> typing.Optional[nds.core.types.distance_meters.DistanceMeters]:
        return self._travel_distance_to_origin_

    @travel_distance_to_origin.setter
    def travel_distance_to_origin(self, travel_distance_to_origin_: typing.Optional[nds.core.types.distance_meters.DistanceMeters]) -> None:
        self._travel_distance_to_origin_ = travel_distance_to_origin_

    def is_travel_distance_to_origin_used(self) -> bool:
        return self._has_distance_info_ and self._has_travel_distance_

    def is_travel_distance_to_origin_set(self) -> bool:
        return not self._travel_distance_to_origin_ is None

    def reset_travel_distance_to_origin(self) -> None:
        self._travel_distance_to_origin_ = None

    @property
    def display_string(self) -> str:
        return self._display_string_

    @display_string.setter
    def display_string(self, display_string_: str) -> None:
        self._display_string_ = display_string_

    @property
    def highlight(self) -> typing.Optional[typing.List[nds.search.types.text_range.TextRange]]:
        return None if self._highlight_ is None else self._highlight_.raw_array

    @highlight.setter
    def highlight(self, highlight_: typing.Optional[typing.List[nds.search.types.text_range.TextRange]]) -> None:
        if highlight_ is None:
            self._highlight_ = None
        else:
            self._highlight_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_highlight()), highlight_, is_auto=True)

    def is_highlight_used(self) -> bool:
        return self.is_highlight_set()

    def is_highlight_set(self) -> bool:
        return not self._highlight_ is None

    def reset_highlight(self) -> None:
        self._highlight_ = None

    @property
    def type(self) -> typing.Union[nds.search.types.search_result_type.SearchResultType, None]:
        return self._type_

    @type.setter
    def type(self, type_: typing.Union[nds.search.types.search_result_type.SearchResultType, None]) -> None:
        self._type_ = type_

    @property
    def global_source_id(self) -> typing.Optional[nds.core.types.global_source_id.GlobalSourceId]:
        return self._global_source_id_

    @global_source_id.setter
    def global_source_id(self, global_source_id_: typing.Optional[nds.core.types.global_source_id.GlobalSourceId]) -> None:
        self._global_source_id_ = global_source_id_

    def is_global_source_id_used(self) -> bool:
        return self.is_global_source_id_set()

    def is_global_source_id_set(self) -> bool:
        return not self._global_source_id_ is None

    def reset_global_source_id(self) -> None:
        self._global_source_id_ = None

    @property
    def detailed_result_information(self) -> typing.Optional[nds.system.types.extern_data.ExternData]:
        return self._detailed_result_information_

    @detailed_result_information.setter
    def detailed_result_information(self, detailed_result_information_: typing.Optional[nds.system.types.extern_data.ExternData]) -> None:
        self._detailed_result_information_ = detailed_result_information_

    def is_detailed_result_information_used(self) -> bool:
        return self.is_detailed_result_information_set()

    def is_detailed_result_information_set(self) -> bool:
        return not self._detailed_result_information_ is None

    def reset_detailed_result_information(self) -> None:
        self._detailed_result_information_ = None

    def init_packing_context(self, zserio_context: SearchResult.ZserioPackingContext) -> None:
        self._position_.init_packing_context(zserio_context.position)
        if self.is_path_used():
            self._path_.init_packing_context(zserio_context.path)
        if self.is_distance_to_origin_used():
            zserio_context.distance_to_origin.init(zserio.array.VarUInt32ArrayTraits(), self._distance_to_origin_)
        if self.is_travel_distance_to_origin_used():
            zserio_context.travel_distance_to_origin.init(zserio.array.VarUInt32ArrayTraits(), self._travel_distance_to_origin_)
        self._type_.init_packing_context(zserio_context.type)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._position_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_path_used():
            end_bitposition += self._path_.bitsizeof(end_bitposition)
        if self.is_distance_to_origin_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._distance_to_origin_)
        if self.is_has_travel_distance_used():
            end_bitposition += 1
        if self.is_travel_distance_to_origin_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._travel_distance_to_origin_)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._display_string_)
        end_bitposition += 1
        if self.is_highlight_used():
            end_bitposition += self._highlight_.bitsizeof(end_bitposition)
        end_bitposition += self._type_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_global_source_id_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._global_source_id_)
        end_bitposition += 1
        if self.is_detailed_result_information_used():
            end_bitposition += self._detailed_result_information_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: SearchResult.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._position_.bitsizeof_packed(zserio_context.position, end_bitposition)
        end_bitposition += 1
        if self.is_path_used():
            end_bitposition += self._path_.bitsizeof_packed(zserio_context.path, end_bitposition)
        if self.is_distance_to_origin_used():
            end_bitposition += zserio_context.distance_to_origin.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._distance_to_origin_)
        if self.is_has_travel_distance_used():
            end_bitposition += 1
        if self.is_travel_distance_to_origin_used():
            end_bitposition += zserio_context.travel_distance_to_origin.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._travel_distance_to_origin_)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._display_string_)
        end_bitposition += 1
        if self.is_highlight_used():
            end_bitposition += self._highlight_.bitsizeof_packed(end_bitposition)
        end_bitposition += self._type_.bitsizeof_packed(zserio_context.type, end_bitposition)
        end_bitposition += 1
        if self.is_global_source_id_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._global_source_id_)
        end_bitposition += 1
        if self.is_detailed_result_information_used():
            end_bitposition += self._detailed_result_information_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._position_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_path_used():
            end_bitposition = self._path_.initialize_offsets(end_bitposition)
        if self.is_distance_to_origin_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._distance_to_origin_)
        if self.is_has_travel_distance_used():
            end_bitposition += 1
        if self.is_travel_distance_to_origin_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._travel_distance_to_origin_)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._display_string_)
        end_bitposition += 1
        if self.is_highlight_used():
            end_bitposition = self._highlight_.initialize_offsets(end_bitposition)
        end_bitposition = self._type_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_global_source_id_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._global_source_id_)
        end_bitposition += 1
        if self.is_detailed_result_information_used():
            end_bitposition = self._detailed_result_information_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: SearchResult.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._position_.initialize_offsets_packed(zserio_context.position, end_bitposition)
        end_bitposition += 1
        if self.is_path_used():
            end_bitposition = self._path_.initialize_offsets_packed(zserio_context.path, end_bitposition)
        if self.is_distance_to_origin_used():
            end_bitposition += zserio_context.distance_to_origin.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._distance_to_origin_)
        if self.is_has_travel_distance_used():
            end_bitposition += 1
        if self.is_travel_distance_to_origin_used():
            end_bitposition += zserio_context.travel_distance_to_origin.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._travel_distance_to_origin_)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._display_string_)
        end_bitposition += 1
        if self.is_highlight_used():
            end_bitposition = self._highlight_.initialize_offsets_packed(end_bitposition)
        end_bitposition = self._type_.initialize_offsets_packed(zserio_context.type, end_bitposition)
        end_bitposition += 1
        if self.is_global_source_id_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._global_source_id_)
        end_bitposition += 1
        if self.is_detailed_result_information_used():
            end_bitposition = self._detailed_result_information_.initialize_offsets(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._position_ = nds.core.geometry.position2d.Position2D.from_reader(zserio_reader, 0)
        if zserio_reader.read_bool():
            self._path_ = nds.core.location.road_location_path.RoadLocationPath.from_reader(zserio_reader)
        else:
            self._path_ = None
        if self.is_distance_to_origin_used():
            self._distance_to_origin_ = zserio_reader.read_varuint32()
        else:
            self._distance_to_origin_ = None
        if self.is_has_travel_distance_used():
            self._has_travel_distance_ = zserio_reader.read_bool()
        else:
            self._has_travel_distance_ = None
        if self.is_travel_distance_to_origin_used():
            self._travel_distance_to_origin_ = zserio_reader.read_varuint32()
        else:
            self._travel_distance_to_origin_ = None
        self._display_string_ = zserio_reader.read_string()
        if zserio_reader.read_bool():
            self._highlight_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_highlight()), zserio_reader, is_auto=True)
        else:
            self._highlight_ = None
        self._type_ = nds.search.types.search_result_type.SearchResultType.from_reader(zserio_reader)
        if zserio_reader.read_bool():
            self._global_source_id_ = zserio_reader.read_string()
        else:
            self._global_source_id_ = None
        if zserio_reader.read_bool():
            self._detailed_result_information_ = nds.system.types.extern_data.ExternData.from_reader(zserio_reader)
        else:
            self._detailed_result_information_ = None

    def read_packed(self, zserio_context: SearchResult.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._position_ = nds.core.geometry.position2d.Position2D.from_reader_packed(zserio_context.position, zserio_reader, 0)

        if zserio_reader.read_bool():
            self._path_ = nds.core.location.road_location_path.RoadLocationPath.from_reader_packed(zserio_context.path, zserio_reader)
        else:
            self._path_ = None

        if self.is_distance_to_origin_used():
            self._distance_to_origin_ = zserio_context.distance_to_origin.read(zserio.array.VarUInt32ArrayTraits(), zserio_reader)
        else:
            self._distance_to_origin_ = None

        if self.is_has_travel_distance_used():
            self._has_travel_distance_ = zserio_reader.read_bool()
        else:
            self._has_travel_distance_ = None

        if self.is_travel_distance_to_origin_used():
            self._travel_distance_to_origin_ = zserio_context.travel_distance_to_origin.read(zserio.array.VarUInt32ArrayTraits(), zserio_reader)
        else:
            self._travel_distance_to_origin_ = None

        self._display_string_ = zserio_reader.read_string()

        if zserio_reader.read_bool():
            self._highlight_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_highlight()), zserio_reader, is_auto=True)
        else:
            self._highlight_ = None

        self._type_ = nds.search.types.search_result_type.SearchResultType.from_reader_packed(zserio_context.type, zserio_reader)

        if zserio_reader.read_bool():
            self._global_source_id_ = zserio_reader.read_string()
        else:
            self._global_source_id_ = None

        if zserio_reader.read_bool():
            self._detailed_result_information_ = nds.system.types.extern_data.ExternData.from_reader(zserio_reader)
        else:
            self._detailed_result_information_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        # check parameters
        if self._position_.shift != (0):
            raise zserio.PythonRuntimeException("Wrong parameter shift for field SearchResult.position: "
                                                f"{self._position_.shift} != {0}!")
        self._position_.write(zserio_writer)

        if self.is_path_used():
            zserio_writer.write_bool(True)
            self._path_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)

        if self.is_distance_to_origin_used():
            zserio_writer.write_varuint32(self._distance_to_origin_)

        if self.is_has_travel_distance_used():
            zserio_writer.write_bool(self._has_travel_distance_)

        if self.is_travel_distance_to_origin_used():
            zserio_writer.write_varuint32(self._travel_distance_to_origin_)

        zserio_writer.write_string(self._display_string_)

        if self.is_highlight_used():
            zserio_writer.write_bool(True)
            self._highlight_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)

        self._type_.write(zserio_writer)

        if self.is_global_source_id_used():
            zserio_writer.write_bool(True)
            zserio_writer.write_string(self._global_source_id_)
        else:
            zserio_writer.write_bool(False)

        if self.is_detailed_result_information_used():
            zserio_writer.write_bool(True)
            self._detailed_result_information_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)

    def write_packed(self, zserio_context: SearchResult.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        # check parameters
        if self._position_.shift != (0):
            raise zserio.PythonRuntimeException("Wrong parameter shift for field SearchResult.position: "
                                                f"{self._position_.shift} != {0}!")
        self._position_.write_packed(zserio_context.position, zserio_writer)

        if self.is_path_used():
            zserio_writer.write_bool(True)
            self._path_.write_packed(zserio_context.path, zserio_writer)
        else:
            zserio_writer.write_bool(False)

        if self.is_distance_to_origin_used():
            zserio_context.distance_to_origin.write(zserio.array.VarUInt32ArrayTraits(), zserio_writer, self._distance_to_origin_)

        if self.is_has_travel_distance_used():
            zserio_writer.write_bool(self._has_travel_distance_)

        if self.is_travel_distance_to_origin_used():
            zserio_context.travel_distance_to_origin.write(zserio.array.VarUInt32ArrayTraits(), zserio_writer, self._travel_distance_to_origin_)

        zserio_writer.write_string(self._display_string_)

        if self.is_highlight_used():
            zserio_writer.write_bool(True)
            self._highlight_.write_packed(zserio_writer)
        else:
            zserio_writer.write_bool(False)

        self._type_.write_packed(zserio_context.type, zserio_writer)

        if self.is_global_source_id_used():
            zserio_writer.write_bool(True)
            zserio_writer.write_string(self._global_source_id_)
        else:
            zserio_writer.write_bool(False)

        if self.is_detailed_result_information_used():
            zserio_writer.write_bool(True)
            self._detailed_result_information_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)

    class ZserioPackingContext:
        def __init__(self):
            self._position_ = nds.core.geometry.position2d.Position2D.ZserioPackingContext()
            self._path_ = nds.core.location.road_location_path.RoadLocationPath.ZserioPackingContext()
            self._distance_to_origin_ = zserio.array.DeltaContext()
            self._travel_distance_to_origin_ = zserio.array.DeltaContext()
            self._type_ = zserio.array.DeltaContext()

        @property
        def position(self):
            return self._position_

        @property
        def path(self):
            return self._path_

        @property
        def distance_to_origin(self):
            return self._distance_to_origin_

        @property
        def travel_distance_to_origin(self):
            return self._travel_distance_to_origin_

        @property
        def type(self):
            return self._type_

    class _ZserioElementFactory_highlight:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.search.types.text_range.TextRange:
            del zserio_index
            return nds.search.types.text_range.TextRange.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.search.types.text_range.TextRange.ZserioPackingContext:
            return nds.search.types.text_range.TextRange.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.search.types.text_range.TextRange.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.search.types.text_range.TextRange:
            del zserio_index
            return nds.search.types.text_range.TextRange.from_reader_packed(zserio_context, zserio_reader)