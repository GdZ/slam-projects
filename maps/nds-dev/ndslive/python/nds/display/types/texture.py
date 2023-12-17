# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.display.reference.types.texture_id
import nds.display.types.texture_condition_usage_type
import nds.display.types.texture_data
import nds.display.types.texture_format
import nds.display.types.texture_rendering_usage_type

class Texture:
    def __init__(
            self,
            texture_id_: nds.display.reference.types.texture_id.TextureId = nds.display.reference.types.texture_id.TextureId(),
            texture_rendering_usage_type_: typing.Union[nds.display.types.texture_rendering_usage_type.TextureRenderingUsageType, None] = None,
            format_: typing.Union[nds.display.types.texture_format.TextureFormat, None] = None,
            double_sided_: bool = bool(),
            texture_condition_usage_type_: typing.List[nds.display.types.texture_condition_usage_type.TextureConditionUsageType] = None,
            texture_data_: typing.List[nds.display.types.texture_data.TextureData] = None) -> None:
        self._texture_id_ = texture_id_
        self._texture_rendering_usage_type_ = texture_rendering_usage_type_
        self._format_ = format_
        self._double_sided_ = double_sided_
        self._texture_condition_usage_type_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_texture_condition_usage_type()), texture_condition_usage_type_, is_auto=True)
        self._texture_data_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_texture_data()), texture_data_, is_auto=True)

    @classmethod
    def from_reader(
            cls: typing.Type['Texture'],
            zserio_reader: zserio.BitStreamReader) -> 'Texture':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['Texture'],
            zserio_context: Texture.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'Texture':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, Texture):
            return ((self._texture_id_ == other._texture_id_) and
                    (self._texture_rendering_usage_type_ == other._texture_rendering_usage_type_) and
                    (self._format_ == other._format_) and
                    (self._double_sided_ == other._double_sided_) and
                    (self._texture_condition_usage_type_ == other._texture_condition_usage_type_) and
                    (self._texture_data_ == other._texture_data_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._texture_id_)
        result = zserio.hashcode.calc_hashcode_object(result, self._texture_rendering_usage_type_)
        result = zserio.hashcode.calc_hashcode_object(result, self._format_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._double_sided_)
        result = zserio.hashcode.calc_hashcode_object(result, self._texture_condition_usage_type_)
        result = zserio.hashcode.calc_hashcode_object(result, self._texture_data_)

        return result

    @property
    def texture_id(self) -> nds.display.reference.types.texture_id.TextureId:
        return self._texture_id_

    @texture_id.setter
    def texture_id(self, texture_id_: nds.display.reference.types.texture_id.TextureId) -> None:
        self._texture_id_ = texture_id_

    @property
    def texture_rendering_usage_type(self) -> typing.Union[nds.display.types.texture_rendering_usage_type.TextureRenderingUsageType, None]:
        return self._texture_rendering_usage_type_

    @texture_rendering_usage_type.setter
    def texture_rendering_usage_type(self, texture_rendering_usage_type_: typing.Union[nds.display.types.texture_rendering_usage_type.TextureRenderingUsageType, None]) -> None:
        self._texture_rendering_usage_type_ = texture_rendering_usage_type_

    @property
    def format(self) -> typing.Union[nds.display.types.texture_format.TextureFormat, None]:
        return self._format_

    @format.setter
    def format(self, format_: typing.Union[nds.display.types.texture_format.TextureFormat, None]) -> None:
        self._format_ = format_

    @property
    def double_sided(self) -> bool:
        return self._double_sided_

    @double_sided.setter
    def double_sided(self, double_sided_: bool) -> None:
        self._double_sided_ = double_sided_

    @property
    def texture_condition_usage_type(self) -> typing.List[nds.display.types.texture_condition_usage_type.TextureConditionUsageType]:
        return self._texture_condition_usage_type_.raw_array

    @texture_condition_usage_type.setter
    def texture_condition_usage_type(self, texture_condition_usage_type_: typing.List[nds.display.types.texture_condition_usage_type.TextureConditionUsageType]) -> None:
        self._texture_condition_usage_type_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_texture_condition_usage_type()), texture_condition_usage_type_, is_auto=True)

    @property
    def texture_data(self) -> typing.List[nds.display.types.texture_data.TextureData]:
        return self._texture_data_.raw_array

    @texture_data.setter
    def texture_data(self, texture_data_: typing.List[nds.display.types.texture_data.TextureData]) -> None:
        self._texture_data_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_texture_data()), texture_data_, is_auto=True)

    def init_packing_context(self, zserio_context: Texture.ZserioPackingContext) -> None:
        zserio_context.texture_id.init(zserio.array.VarUInt32ArrayTraits(), self._texture_id_)
        self._texture_rendering_usage_type_.init_packing_context(zserio_context.texture_rendering_usage_type)
        self._format_.init_packing_context(zserio_context.format)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._texture_id_)
        end_bitposition += self._texture_rendering_usage_type_.bitsizeof(end_bitposition)
        end_bitposition += self._format_.bitsizeof(end_bitposition)
        end_bitposition += 1
        end_bitposition += self._texture_condition_usage_type_.bitsizeof(end_bitposition)
        end_bitposition += self._texture_data_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: Texture.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.texture_id.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._texture_id_)
        end_bitposition += self._texture_rendering_usage_type_.bitsizeof_packed(zserio_context.texture_rendering_usage_type, end_bitposition)
        end_bitposition += self._format_.bitsizeof_packed(zserio_context.format, end_bitposition)
        end_bitposition += 1
        end_bitposition += self._texture_condition_usage_type_.bitsizeof_packed(end_bitposition)
        end_bitposition += self._texture_data_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._texture_id_)
        end_bitposition = self._texture_rendering_usage_type_.initialize_offsets(end_bitposition)
        end_bitposition = self._format_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        end_bitposition = self._texture_condition_usage_type_.initialize_offsets(end_bitposition)
        end_bitposition = self._texture_data_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: Texture.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.texture_id.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._texture_id_)
        end_bitposition = self._texture_rendering_usage_type_.initialize_offsets_packed(zserio_context.texture_rendering_usage_type, end_bitposition)
        end_bitposition = self._format_.initialize_offsets_packed(zserio_context.format, end_bitposition)
        end_bitposition += 1
        end_bitposition = self._texture_condition_usage_type_.initialize_offsets_packed(end_bitposition)
        end_bitposition = self._texture_data_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._texture_id_ = zserio_reader.read_varuint32()

        self._texture_rendering_usage_type_ = nds.display.types.texture_rendering_usage_type.TextureRenderingUsageType.from_reader(zserio_reader)

        self._format_ = nds.display.types.texture_format.TextureFormat.from_reader(zserio_reader)

        self._double_sided_ = zserio_reader.read_bool()

        self._texture_condition_usage_type_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_texture_condition_usage_type()), zserio_reader, is_auto=True)

        self._texture_data_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_texture_data()), zserio_reader, is_auto=True)
        # check constraint
        if not (len(self._texture_data_) == len(self._texture_condition_usage_type_)):
            raise zserio.PythonRuntimeException("Constraint violated for field Texture.textureData!")

    def read_packed(self, zserio_context: Texture.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._texture_id_ = zserio_context.texture_id.read(zserio.array.VarUInt32ArrayTraits(), zserio_reader)

        self._texture_rendering_usage_type_ = nds.display.types.texture_rendering_usage_type.TextureRenderingUsageType.from_reader_packed(zserio_context.texture_rendering_usage_type, zserio_reader)

        self._format_ = nds.display.types.texture_format.TextureFormat.from_reader_packed(zserio_context.format, zserio_reader)

        self._double_sided_ = zserio_reader.read_bool()

        self._texture_condition_usage_type_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_texture_condition_usage_type()), zserio_reader, is_auto=True)

        self._texture_data_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_texture_data()), zserio_reader, is_auto=True)
        # check constraint
        if not (len(self._texture_data_) == len(self._texture_condition_usage_type_)):
            raise zserio.PythonRuntimeException("Constraint violated for field Texture.textureData!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varuint32(self._texture_id_)

        self._texture_rendering_usage_type_.write(zserio_writer)

        self._format_.write(zserio_writer)

        zserio_writer.write_bool(self._double_sided_)

        self._texture_condition_usage_type_.write(zserio_writer)

        # check constraint
        if not (len(self._texture_data_) == len(self._texture_condition_usage_type_)):
            raise zserio.PythonRuntimeException("Constraint violated for field Texture.textureData!")
        self._texture_data_.write(zserio_writer)

    def write_packed(self, zserio_context: Texture.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.texture_id.write(zserio.array.VarUInt32ArrayTraits(), zserio_writer, self._texture_id_)

        self._texture_rendering_usage_type_.write_packed(zserio_context.texture_rendering_usage_type, zserio_writer)

        self._format_.write_packed(zserio_context.format, zserio_writer)

        zserio_writer.write_bool(self._double_sided_)

        self._texture_condition_usage_type_.write_packed(zserio_writer)

        # check constraint
        if not (len(self._texture_data_) == len(self._texture_condition_usage_type_)):
            raise zserio.PythonRuntimeException("Constraint violated for field Texture.textureData!")
        self._texture_data_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._texture_id_ = zserio.array.DeltaContext()
            self._texture_rendering_usage_type_ = zserio.array.DeltaContext()
            self._format_ = zserio.array.DeltaContext()

        @property
        def texture_id(self):
            return self._texture_id_

        @property
        def texture_rendering_usage_type(self):
            return self._texture_rendering_usage_type_

        @property
        def format(self):
            return self._format_

    class _ZserioElementFactory_texture_condition_usage_type:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.types.texture_condition_usage_type.TextureConditionUsageType:
            del zserio_index
            return nds.display.types.texture_condition_usage_type.TextureConditionUsageType.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> zserio.array.DeltaContext:
            return zserio.array.DeltaContext()

        @staticmethod
        def create_packed(zserio_context: zserio.array.DeltaContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.types.texture_condition_usage_type.TextureConditionUsageType:
            del zserio_index
            return nds.display.types.texture_condition_usage_type.TextureConditionUsageType.from_reader_packed(zserio_context, zserio_reader)

    class _ZserioElementFactory_texture_data:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.types.texture_data.TextureData:
            del zserio_index
            return nds.display.types.texture_data.TextureData.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.display.types.texture_data.TextureData.ZserioPackingContext:
            return nds.display.types.texture_data.TextureData.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.display.types.texture_data.TextureData.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.types.texture_data.TextureData:
            del zserio_index
            return nds.display.types.texture_data.TextureData.from_reader_packed(zserio_context, zserio_reader)