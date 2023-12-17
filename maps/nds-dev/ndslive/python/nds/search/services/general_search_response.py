# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.search.types.next_valid_character_list
import nds.search.types.search_result
import nds.search.types.suggestions

class GeneralSearchResponse:
    def __init__(
            self,
            has_distance_info_: bool = bool(),
            suggestion_list_: typing.Optional[nds.search.types.suggestions.Suggestions] = None,
            nvc_list_: typing.Optional[nds.search.types.next_valid_character_list.NextValidCharacterList] = None,
            num_results_: int = int(),
            results_: typing.List[nds.search.types.search_result.SearchResult] = None) -> None:
        self._has_distance_info_ = has_distance_info_
        self._suggestion_list_ = suggestion_list_
        self._nvc_list_ = nvc_list_
        self._num_results_ = num_results_
        self._results_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_results(self)), results_)

    @classmethod
    def from_reader(
            cls: typing.Type['GeneralSearchResponse'],
            zserio_reader: zserio.BitStreamReader) -> 'GeneralSearchResponse':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['GeneralSearchResponse'],
            zserio_context: GeneralSearchResponse.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'GeneralSearchResponse':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, GeneralSearchResponse):
            return ((self._has_distance_info_ == other._has_distance_info_) and
                    (not other.is_suggestion_list_used() if not self.is_suggestion_list_used() else (self._suggestion_list_ == other._suggestion_list_)) and
                    (not other.is_nvc_list_used() if not self.is_nvc_list_used() else (self._nvc_list_ == other._nvc_list_)) and
                    (self._num_results_ == other._num_results_) and
                    (self._results_ == other._results_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_bool(result, self._has_distance_info_)
        if self.is_suggestion_list_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._suggestion_list_)
        if self.is_nvc_list_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._nvc_list_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._num_results_)
        result = zserio.hashcode.calc_hashcode_object(result, self._results_)

        return result

    @property
    def has_distance_info(self) -> bool:
        return self._has_distance_info_

    @has_distance_info.setter
    def has_distance_info(self, has_distance_info_: bool) -> None:
        self._has_distance_info_ = has_distance_info_

    @property
    def suggestion_list(self) -> typing.Optional[nds.search.types.suggestions.Suggestions]:
        return self._suggestion_list_

    @suggestion_list.setter
    def suggestion_list(self, suggestion_list_: typing.Optional[nds.search.types.suggestions.Suggestions]) -> None:
        self._suggestion_list_ = suggestion_list_

    def is_suggestion_list_used(self) -> bool:
        return self.is_suggestion_list_set()

    def is_suggestion_list_set(self) -> bool:
        return not self._suggestion_list_ is None

    def reset_suggestion_list(self) -> None:
        self._suggestion_list_ = None

    @property
    def nvc_list(self) -> typing.Optional[nds.search.types.next_valid_character_list.NextValidCharacterList]:
        return self._nvc_list_

    @nvc_list.setter
    def nvc_list(self, nvc_list_: typing.Optional[nds.search.types.next_valid_character_list.NextValidCharacterList]) -> None:
        self._nvc_list_ = nvc_list_

    def is_nvc_list_used(self) -> bool:
        return self.is_nvc_list_set()

    def is_nvc_list_set(self) -> bool:
        return not self._nvc_list_ is None

    def reset_nvc_list(self) -> None:
        self._nvc_list_ = None

    @property
    def num_results(self) -> int:
        return self._num_results_

    @num_results.setter
    def num_results(self, num_results_: int) -> None:
        self._num_results_ = num_results_

    @property
    def results(self) -> typing.List[nds.search.types.search_result.SearchResult]:
        return self._results_.raw_array

    @results.setter
    def results(self, results_: typing.List[nds.search.types.search_result.SearchResult]) -> None:
        self._results_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_results(self)), results_)

    def init_packing_context(self, zserio_context: GeneralSearchResponse.ZserioPackingContext) -> None:
        zserio_context.num_results.init(zserio.array.VarUInt32ArrayTraits(), self._num_results_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1
        if self.is_suggestion_list_used():
            end_bitposition += self._suggestion_list_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_nvc_list_used():
            end_bitposition += self._nvc_list_.bitsizeof(end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._num_results_)
        end_bitposition += self._results_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: GeneralSearchResponse.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1
        if self.is_suggestion_list_used():
            end_bitposition += self._suggestion_list_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_nvc_list_used():
            end_bitposition += self._nvc_list_.bitsizeof(end_bitposition)
        end_bitposition += zserio_context.num_results.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._num_results_)
        end_bitposition += self._results_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1
        if self.is_suggestion_list_used():
            end_bitposition = self._suggestion_list_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_nvc_list_used():
            end_bitposition = self._nvc_list_.initialize_offsets(end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._num_results_)
        end_bitposition = self._results_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: GeneralSearchResponse.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1
        if self.is_suggestion_list_used():
            end_bitposition = self._suggestion_list_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_nvc_list_used():
            end_bitposition = self._nvc_list_.initialize_offsets(end_bitposition)
        end_bitposition += zserio_context.num_results.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._num_results_)
        end_bitposition = self._results_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._has_distance_info_ = zserio_reader.read_bool()
        if zserio_reader.read_bool():
            self._suggestion_list_ = nds.search.types.suggestions.Suggestions.from_reader(zserio_reader)
        else:
            self._suggestion_list_ = None
        if zserio_reader.read_bool():
            self._nvc_list_ = nds.search.types.next_valid_character_list.NextValidCharacterList.from_reader(zserio_reader)
        else:
            self._nvc_list_ = None
        self._num_results_ = zserio_reader.read_varuint32()
        self._results_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_results(self)), zserio_reader, self._num_results_)

    def read_packed(self, zserio_context: GeneralSearchResponse.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._has_distance_info_ = zserio_reader.read_bool()

        if zserio_reader.read_bool():
            self._suggestion_list_ = nds.search.types.suggestions.Suggestions.from_reader(zserio_reader)
        else:
            self._suggestion_list_ = None

        if zserio_reader.read_bool():
            self._nvc_list_ = nds.search.types.next_valid_character_list.NextValidCharacterList.from_reader(zserio_reader)
        else:
            self._nvc_list_ = None

        self._num_results_ = zserio_context.num_results.read(zserio.array.VarUInt32ArrayTraits(), zserio_reader)

        self._results_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_results(self)), zserio_reader, self._num_results_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bool(self._has_distance_info_)

        if self.is_suggestion_list_used():
            zserio_writer.write_bool(True)
            self._suggestion_list_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)

        if self.is_nvc_list_used():
            zserio_writer.write_bool(True)
            self._nvc_list_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)

        zserio_writer.write_varuint32(self._num_results_)

        # check array length
        if len(self._results_) != (self._num_results_):
            raise zserio.PythonRuntimeException("Wrong array length for field GeneralSearchResponse.results: "
                                                f"{len(self._results_)} != {self._num_results_}!")
        self._results_.write(zserio_writer)

    def write_packed(self, zserio_context: GeneralSearchResponse.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bool(self._has_distance_info_)

        if self.is_suggestion_list_used():
            zserio_writer.write_bool(True)
            self._suggestion_list_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)

        if self.is_nvc_list_used():
            zserio_writer.write_bool(True)
            self._nvc_list_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)

        zserio_context.num_results.write(zserio.array.VarUInt32ArrayTraits(), zserio_writer, self._num_results_)

        # check array length
        if len(self._results_) != (self._num_results_):
            raise zserio.PythonRuntimeException("Wrong array length for field GeneralSearchResponse.results: "
                                                f"{len(self._results_)} != {self._num_results_}!")
        self._results_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._num_results_ = zserio.array.DeltaContext()

        @property
        def num_results(self):
            return self._num_results_

    class _ZserioElementFactory_results:
        IS_OBJECT_PACKABLE = True

        def __init__(self, owner):
            self._owner = owner

        def create(self, zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.search.types.search_result.SearchResult:
            del zserio_index
            return nds.search.types.search_result.SearchResult.from_reader(zserio_reader, self._owner._has_distance_info_)

        @staticmethod
        def create_packing_context() -> nds.search.types.search_result.SearchResult.ZserioPackingContext:
            return nds.search.types.search_result.SearchResult.ZserioPackingContext()

        def create_packed(self, zserio_context: nds.search.types.search_result.SearchResult.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.search.types.search_result.SearchResult:
            del zserio_index
            return nds.search.types.search_result.SearchResult.from_reader_packed(zserio_context, zserio_reader, self._owner._has_distance_info_)
