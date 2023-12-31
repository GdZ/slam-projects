# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.display.metadata.display3d_style_layer_content
import nds.display.types.style3d_color
import nds.display.types.texture
import nds.system.types.layer_type

class Display3DStyleLayer:
    def __init__(
            self,
            content_: typing.Union[nds.display.metadata.display3d_style_layer_content.Display3DStyleLayerContent, None] = None,
            textures_: typing.Optional[typing.List[nds.display.types.texture.Texture]] = None,
            colors_: typing.Optional[typing.List[nds.display.types.style3d_color.Style3DColor]] = None) -> None:
        self._content_ = content_
        if textures_ is None:
            self._textures_ = None
        else:
            self._textures_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_textures()), textures_, is_auto=True)
        if colors_ is None:
            self._colors_ = None
        else:
            self._colors_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_colors()), colors_, is_auto=True)

    @classmethod
    def from_reader(
            cls: typing.Type['Display3DStyleLayer'],
            zserio_reader: zserio.BitStreamReader) -> 'Display3DStyleLayer':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['Display3DStyleLayer'],
            zserio_context: Display3DStyleLayer.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'Display3DStyleLayer':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, Display3DStyleLayer):
            return ((self._content_ == other._content_) and
                    (not other.is_textures_used() if not self.is_textures_used() else (self._textures_ == other._textures_)) and
                    (not other.is_colors_used() if not self.is_colors_used() else (self._colors_ == other._colors_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._content_)
        if self.is_textures_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._textures_)
        if self.is_colors_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._colors_)

        return result

    @property
    def content(self) -> typing.Union[nds.display.metadata.display3d_style_layer_content.Display3DStyleLayerContent, None]:
        return self._content_

    @content.setter
    def content(self, content_: typing.Union[nds.display.metadata.display3d_style_layer_content.Display3DStyleLayerContent, None]) -> None:
        self._content_ = content_

    @property
    def textures(self) -> typing.Optional[typing.List[nds.display.types.texture.Texture]]:
        return None if self._textures_ is None else self._textures_.raw_array

    @textures.setter
    def textures(self, textures_: typing.Optional[typing.List[nds.display.types.texture.Texture]]) -> None:
        if textures_ is None:
            self._textures_ = None
        else:
            self._textures_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_textures()), textures_, is_auto=True)

    def is_textures_used(self) -> bool:
        return self._content_.has_textures

    def is_textures_set(self) -> bool:
        return not self._textures_ is None

    def reset_textures(self) -> None:
        self._textures_ = None

    @property
    def colors(self) -> typing.Optional[typing.List[nds.display.types.style3d_color.Style3DColor]]:
        return None if self._colors_ is None else self._colors_.raw_array

    @colors.setter
    def colors(self, colors_: typing.Optional[typing.List[nds.display.types.style3d_color.Style3DColor]]) -> None:
        if colors_ is None:
            self._colors_ = None
        else:
            self._colors_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_colors()), colors_, is_auto=True)

    def is_colors_used(self) -> bool:
        return self._content_.has_colors

    def is_colors_set(self) -> bool:
        return not self._colors_ is None

    def reset_colors(self) -> None:
        self._colors_ = None

    def get_layer_type(self) -> nds.system.types.layer_type.LayerType:
        return nds.system.types.layer_type.LayerType.GEOMETRY

    def init_packing_context(self, zserio_context: Display3DStyleLayer.ZserioPackingContext) -> None:
        del zserio_context

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof(end_bitposition)
        if self.is_textures_used():
            end_bitposition += self._textures_.bitsizeof(end_bitposition)
        if self.is_colors_used():
            end_bitposition += self._colors_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: Display3DStyleLayer.ZserioPackingContext, bitposition: int = 0) -> int:
        del zserio_context

        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof(end_bitposition)
        if self.is_textures_used():
            end_bitposition += self._textures_.bitsizeof_packed(end_bitposition)
        if self.is_colors_used():
            end_bitposition += self._colors_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets(end_bitposition)
        if self.is_textures_used():
            end_bitposition = self._textures_.initialize_offsets(end_bitposition)
        if self.is_colors_used():
            end_bitposition = self._colors_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: Display3DStyleLayer.ZserioPackingContext, bitposition: int) -> int:
        del zserio_context

        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets(end_bitposition)
        if self.is_textures_used():
            end_bitposition = self._textures_.initialize_offsets_packed(end_bitposition)
        if self.is_colors_used():
            end_bitposition = self._colors_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.display.metadata.display3d_style_layer_content.Display3DStyleLayerContent.from_reader(zserio_reader)

        if self.is_textures_used():
            self._textures_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_textures()), zserio_reader, is_auto=True)
            # check constraint
            if not (len(self._textures_) > 0):
                raise zserio.PythonRuntimeException("Constraint violated for field Display3DStyleLayer.textures!")
        else:
            self._textures_ = None

        if self.is_colors_used():
            self._colors_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_colors()), zserio_reader, is_auto=True)
            # check constraint
            if not (len(self._colors_) > 0):
                raise zserio.PythonRuntimeException("Constraint violated for field Display3DStyleLayer.colors!")
        else:
            self._colors_ = None

    def read_packed(self, zserio_context: Display3DStyleLayer.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        del zserio_context

        self._content_ = nds.display.metadata.display3d_style_layer_content.Display3DStyleLayerContent.from_reader(zserio_reader)

        if self.is_textures_used():
            self._textures_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_textures()), zserio_reader, is_auto=True)
            # check constraint
            if not (len(self._textures_) > 0):
                raise zserio.PythonRuntimeException("Constraint violated for field Display3DStyleLayer.textures!")
        else:
            self._textures_ = None

        if self.is_colors_used():
            self._colors_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_colors()), zserio_reader, is_auto=True)
            # check constraint
            if not (len(self._colors_) > 0):
                raise zserio.PythonRuntimeException("Constraint violated for field Display3DStyleLayer.colors!")
        else:
            self._colors_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write(zserio_writer)

        if self.is_textures_used():
            # check constraint
            if not (len(self._textures_) > 0):
                raise zserio.PythonRuntimeException("Constraint violated for field Display3DStyleLayer.textures!")
            self._textures_.write(zserio_writer)

        if self.is_colors_used():
            # check constraint
            if not (len(self._colors_) > 0):
                raise zserio.PythonRuntimeException("Constraint violated for field Display3DStyleLayer.colors!")
            self._colors_.write(zserio_writer)

    def write_packed(self, zserio_context: Display3DStyleLayer.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        del zserio_context

        self._content_.write(zserio_writer)

        if self.is_textures_used():
            # check constraint
            if not (len(self._textures_) > 0):
                raise zserio.PythonRuntimeException("Constraint violated for field Display3DStyleLayer.textures!")
            self._textures_.write_packed(zserio_writer)

        if self.is_colors_used():
            # check constraint
            if not (len(self._colors_) > 0):
                raise zserio.PythonRuntimeException("Constraint violated for field Display3DStyleLayer.colors!")
            self._colors_.write_packed(zserio_writer)

    class ZserioPackingContext:
        pass

    class _ZserioElementFactory_textures:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.types.texture.Texture:
            del zserio_index
            return nds.display.types.texture.Texture.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.display.types.texture.Texture.ZserioPackingContext:
            return nds.display.types.texture.Texture.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.display.types.texture.Texture.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.types.texture.Texture:
            del zserio_index
            return nds.display.types.texture.Texture.from_reader_packed(zserio_context, zserio_reader)

    class _ZserioElementFactory_colors:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.types.style3d_color.Style3DColor:
            del zserio_index
            return nds.display.types.style3d_color.Style3DColor.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.display.types.style3d_color.Style3DColor.ZserioPackingContext:
            return nds.display.types.style3d_color.Style3DColor.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.display.types.style3d_color.Style3DColor.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.types.style3d_color.Style3DColor:
            del zserio_index
            return nds.display.types.style3d_color.Style3DColor.from_reader_packed(zserio_context, zserio_reader)
