# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.routing.guidance.guidance_name_class
import nds.routing.guidance.guidance_name_string

class GuidanceName:
    def __init__(
            self,
            guidance_name_class_: typing.Union[nds.routing.guidance.guidance_name_class.GuidanceNameClass, None] = None,
            num_names_: int = int(),
            name_strings_: typing.List[nds.routing.guidance.guidance_name_string.GuidanceNameString] = None) -> None:
        self._guidance_name_class_ = guidance_name_class_
        self._num_names_ = num_names_
        self._name_strings_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_name_strings(self)), name_strings_)

    @classmethod
    def from_reader(
            cls: typing.Type['GuidanceName'],
            zserio_reader: zserio.BitStreamReader) -> 'GuidanceName':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['GuidanceName'],
            zserio_context: GuidanceName.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'GuidanceName':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, GuidanceName):
            return ((self._guidance_name_class_ == other._guidance_name_class_) and
                    (self._num_names_ == other._num_names_) and
                    (self._name_strings_ == other._name_strings_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._guidance_name_class_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._num_names_)
        result = zserio.hashcode.calc_hashcode_object(result, self._name_strings_)

        return result

    @property
    def guidance_name_class(self) -> typing.Union[nds.routing.guidance.guidance_name_class.GuidanceNameClass, None]:
        return self._guidance_name_class_

    @guidance_name_class.setter
    def guidance_name_class(self, guidance_name_class_: typing.Union[nds.routing.guidance.guidance_name_class.GuidanceNameClass, None]) -> None:
        self._guidance_name_class_ = guidance_name_class_

    @property
    def num_names(self) -> int:
        return self._num_names_

    @num_names.setter
    def num_names(self, num_names_: int) -> None:
        self._num_names_ = num_names_

    @property
    def name_strings(self) -> typing.List[nds.routing.guidance.guidance_name_string.GuidanceNameString]:
        return self._name_strings_.raw_array

    @name_strings.setter
    def name_strings(self, name_strings_: typing.List[nds.routing.guidance.guidance_name_string.GuidanceNameString]) -> None:
        self._name_strings_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_name_strings(self)), name_strings_)

    def init_packing_context(self, zserio_context: GuidanceName.ZserioPackingContext) -> None:
        self._guidance_name_class_.init_packing_context(zserio_context.guidance_name_class)
        zserio_context.num_names.init(zserio.array.BitFieldArrayTraits(8), self._num_names_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._guidance_name_class_.bitsizeof(end_bitposition)
        end_bitposition += 8
        end_bitposition += self._name_strings_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: GuidanceName.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._guidance_name_class_.bitsizeof_packed(zserio_context.guidance_name_class, end_bitposition)
        end_bitposition += zserio_context.num_names.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._num_names_)
        end_bitposition += self._name_strings_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._guidance_name_class_.initialize_offsets(end_bitposition)
        end_bitposition += 8
        end_bitposition = self._name_strings_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: GuidanceName.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._guidance_name_class_.initialize_offsets_packed(zserio_context.guidance_name_class, end_bitposition)
        end_bitposition += zserio_context.num_names.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._num_names_)
        end_bitposition = self._name_strings_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._guidance_name_class_ = nds.routing.guidance.guidance_name_class.GuidanceNameClass.from_reader(zserio_reader)
        self._num_names_ = zserio_reader.read_bits(8)
        self._name_strings_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_name_strings(self)), zserio_reader, self._num_names_)

    def read_packed(self, zserio_context: GuidanceName.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._guidance_name_class_ = nds.routing.guidance.guidance_name_class.GuidanceNameClass.from_reader_packed(zserio_context.guidance_name_class, zserio_reader)

        self._num_names_ = zserio_context.num_names.read(zserio.array.BitFieldArrayTraits(8), zserio_reader)

        self._name_strings_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_name_strings(self)), zserio_reader, self._num_names_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._guidance_name_class_.write(zserio_writer)

        zserio_writer.write_bits(self._num_names_, 8)

        # check array length
        if len(self._name_strings_) != (self._num_names_):
            raise zserio.PythonRuntimeException("Wrong array length for field GuidanceName.nameStrings: "
                                                f"{len(self._name_strings_)} != {self._num_names_}!")
        self._name_strings_.write(zserio_writer)

    def write_packed(self, zserio_context: GuidanceName.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._guidance_name_class_.write_packed(zserio_context.guidance_name_class, zserio_writer)

        zserio_context.num_names.write(zserio.array.BitFieldArrayTraits(8), zserio_writer, self._num_names_)

        # check array length
        if len(self._name_strings_) != (self._num_names_):
            raise zserio.PythonRuntimeException("Wrong array length for field GuidanceName.nameStrings: "
                                                f"{len(self._name_strings_)} != {self._num_names_}!")
        self._name_strings_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._guidance_name_class_ = zserio.array.DeltaContext()
            self._num_names_ = zserio.array.DeltaContext()

        @property
        def guidance_name_class(self):
            return self._guidance_name_class_

        @property
        def num_names(self):
            return self._num_names_

    class _ZserioElementFactory_name_strings:
        IS_OBJECT_PACKABLE = True

        def __init__(self, owner):
            self._owner = owner

        def create(self, zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.routing.guidance.guidance_name_string.GuidanceNameString:
            del zserio_index
            return nds.routing.guidance.guidance_name_string.GuidanceNameString.from_reader(zserio_reader, self._owner._num_names_)

        @staticmethod
        def create_packing_context() -> nds.routing.guidance.guidance_name_string.GuidanceNameString.ZserioPackingContext:
            return nds.routing.guidance.guidance_name_string.GuidanceNameString.ZserioPackingContext()

        def create_packed(self, zserio_context: nds.routing.guidance.guidance_name_string.GuidanceNameString.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.routing.guidance.guidance_name_string.GuidanceNameString:
            del zserio_index
            return nds.routing.guidance.guidance_name_string.GuidanceNameString.from_reader_packed(zserio_context, zserio_reader, self._owner._num_names_)
