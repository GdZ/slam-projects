# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.instructions.types.junction_view_content
import nds.instructions.types.junction_view_image_set_reference

class JunctionViewScene:
    def __init__(
            self,
            content_: typing.Union[nds.instructions.types.junction_view_content.JunctionViewContent, None] = None,
            intersection_id_: typing.List[nds.instructions.types.junction_view_image_set_reference.JunctionViewImageSetReference] = None,
            background_id_: typing.Optional[typing.List[nds.instructions.types.junction_view_image_set_reference.JunctionViewImageSetReference]] = None,
            signboard_id_: typing.Optional[typing.List[nds.instructions.types.junction_view_image_set_reference.JunctionViewImageSetReference]] = None,
            arrow_id_: typing.Optional[typing.List[nds.instructions.types.junction_view_image_set_reference.JunctionViewImageSetReference]] = None,
            signboard_arrow_id_: typing.Optional[typing.List[nds.instructions.types.junction_view_image_set_reference.JunctionViewImageSetReference]] = None) -> None:
        self._content_ = content_
        self._intersection_id_ = zserio.array.Array(zserio.array.VarUIntArrayTraits(), intersection_id_, is_auto=True)
        if background_id_ is None:
            self._background_id_ = None
        else:
            self._background_id_ = zserio.array.Array(zserio.array.VarUIntArrayTraits(), background_id_, is_auto=True)
        if signboard_id_ is None:
            self._signboard_id_ = None
        else:
            self._signboard_id_ = zserio.array.Array(zserio.array.VarUIntArrayTraits(), signboard_id_, is_auto=True)
        if arrow_id_ is None:
            self._arrow_id_ = None
        else:
            self._arrow_id_ = zserio.array.Array(zserio.array.VarUIntArrayTraits(), arrow_id_, is_auto=True)
        if signboard_arrow_id_ is None:
            self._signboard_arrow_id_ = None
        else:
            self._signboard_arrow_id_ = zserio.array.Array(zserio.array.VarUIntArrayTraits(), signboard_arrow_id_, is_auto=True)

    @classmethod
    def from_reader(
            cls: typing.Type['JunctionViewScene'],
            zserio_reader: zserio.BitStreamReader) -> 'JunctionViewScene':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['JunctionViewScene'],
            zserio_context: JunctionViewScene.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'JunctionViewScene':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, JunctionViewScene):
            return ((self._content_ == other._content_) and
                    (self._intersection_id_ == other._intersection_id_) and
                    (not other.is_background_id_used() if not self.is_background_id_used() else (self._background_id_ == other._background_id_)) and
                    (not other.is_signboard_id_used() if not self.is_signboard_id_used() else (self._signboard_id_ == other._signboard_id_)) and
                    (not other.is_arrow_id_used() if not self.is_arrow_id_used() else (self._arrow_id_ == other._arrow_id_)) and
                    (not other.is_signboard_arrow_id_used() if not self.is_signboard_arrow_id_used() else (self._signboard_arrow_id_ == other._signboard_arrow_id_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._content_)
        result = zserio.hashcode.calc_hashcode_object(result, self._intersection_id_)
        if self.is_background_id_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._background_id_)
        if self.is_signboard_id_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._signboard_id_)
        if self.is_arrow_id_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._arrow_id_)
        if self.is_signboard_arrow_id_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._signboard_arrow_id_)

        return result

    @property
    def content(self) -> typing.Union[nds.instructions.types.junction_view_content.JunctionViewContent, None]:
        return self._content_

    @content.setter
    def content(self, content_: typing.Union[nds.instructions.types.junction_view_content.JunctionViewContent, None]) -> None:
        self._content_ = content_

    @property
    def intersection_id(self) -> typing.List[nds.instructions.types.junction_view_image_set_reference.JunctionViewImageSetReference]:
        return self._intersection_id_.raw_array

    @intersection_id.setter
    def intersection_id(self, intersection_id_: typing.List[nds.instructions.types.junction_view_image_set_reference.JunctionViewImageSetReference]) -> None:
        self._intersection_id_ = zserio.array.Array(zserio.array.VarUIntArrayTraits(), intersection_id_, is_auto=True)

    @property
    def background_id(self) -> typing.Optional[typing.List[nds.instructions.types.junction_view_image_set_reference.JunctionViewImageSetReference]]:
        return None if self._background_id_ is None else self._background_id_.raw_array

    @background_id.setter
    def background_id(self, background_id_: typing.Optional[typing.List[nds.instructions.types.junction_view_image_set_reference.JunctionViewImageSetReference]]) -> None:
        if background_id_ is None:
            self._background_id_ = None
        else:
            self._background_id_ = zserio.array.Array(zserio.array.VarUIntArrayTraits(), background_id_, is_auto=True)

    def is_background_id_used(self) -> bool:
        return (self._content_ & nds.instructions.types.junction_view_content.JunctionViewContent.Values.BACKGROUND) == nds.instructions.types.junction_view_content.JunctionViewContent.Values.BACKGROUND

    def is_background_id_set(self) -> bool:
        return not self._background_id_ is None

    def reset_background_id(self) -> None:
        self._background_id_ = None

    @property
    def signboard_id(self) -> typing.Optional[typing.List[nds.instructions.types.junction_view_image_set_reference.JunctionViewImageSetReference]]:
        return None if self._signboard_id_ is None else self._signboard_id_.raw_array

    @signboard_id.setter
    def signboard_id(self, signboard_id_: typing.Optional[typing.List[nds.instructions.types.junction_view_image_set_reference.JunctionViewImageSetReference]]) -> None:
        if signboard_id_ is None:
            self._signboard_id_ = None
        else:
            self._signboard_id_ = zserio.array.Array(zserio.array.VarUIntArrayTraits(), signboard_id_, is_auto=True)

    def is_signboard_id_used(self) -> bool:
        return (self._content_ & nds.instructions.types.junction_view_content.JunctionViewContent.Values.SIGNBOARD) == nds.instructions.types.junction_view_content.JunctionViewContent.Values.SIGNBOARD

    def is_signboard_id_set(self) -> bool:
        return not self._signboard_id_ is None

    def reset_signboard_id(self) -> None:
        self._signboard_id_ = None

    @property
    def arrow_id(self) -> typing.Optional[typing.List[nds.instructions.types.junction_view_image_set_reference.JunctionViewImageSetReference]]:
        return None if self._arrow_id_ is None else self._arrow_id_.raw_array

    @arrow_id.setter
    def arrow_id(self, arrow_id_: typing.Optional[typing.List[nds.instructions.types.junction_view_image_set_reference.JunctionViewImageSetReference]]) -> None:
        if arrow_id_ is None:
            self._arrow_id_ = None
        else:
            self._arrow_id_ = zserio.array.Array(zserio.array.VarUIntArrayTraits(), arrow_id_, is_auto=True)

    def is_arrow_id_used(self) -> bool:
        return (self._content_ & nds.instructions.types.junction_view_content.JunctionViewContent.Values.ARROW) == nds.instructions.types.junction_view_content.JunctionViewContent.Values.ARROW

    def is_arrow_id_set(self) -> bool:
        return not self._arrow_id_ is None

    def reset_arrow_id(self) -> None:
        self._arrow_id_ = None

    @property
    def signboard_arrow_id(self) -> typing.Optional[typing.List[nds.instructions.types.junction_view_image_set_reference.JunctionViewImageSetReference]]:
        return None if self._signboard_arrow_id_ is None else self._signboard_arrow_id_.raw_array

    @signboard_arrow_id.setter
    def signboard_arrow_id(self, signboard_arrow_id_: typing.Optional[typing.List[nds.instructions.types.junction_view_image_set_reference.JunctionViewImageSetReference]]) -> None:
        if signboard_arrow_id_ is None:
            self._signboard_arrow_id_ = None
        else:
            self._signboard_arrow_id_ = zserio.array.Array(zserio.array.VarUIntArrayTraits(), signboard_arrow_id_, is_auto=True)

    def is_signboard_arrow_id_used(self) -> bool:
        return (self._content_ & nds.instructions.types.junction_view_content.JunctionViewContent.Values.SIGNBOARD_ARROW) == nds.instructions.types.junction_view_content.JunctionViewContent.Values.SIGNBOARD_ARROW

    def is_signboard_arrow_id_set(self) -> bool:
        return not self._signboard_arrow_id_ is None

    def reset_signboard_arrow_id(self) -> None:
        self._signboard_arrow_id_ = None

    def init_packing_context(self, zserio_context: JunctionViewScene.ZserioPackingContext) -> None:
        self._content_.init_packing_context(zserio_context.content)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof(end_bitposition)
        end_bitposition += self._intersection_id_.bitsizeof_packed(end_bitposition)
        if self.is_background_id_used():
            end_bitposition += self._background_id_.bitsizeof_packed(end_bitposition)
        if self.is_signboard_id_used():
            end_bitposition += self._signboard_id_.bitsizeof_packed(end_bitposition)
        if self.is_arrow_id_used():
            end_bitposition += self._arrow_id_.bitsizeof_packed(end_bitposition)
        if self.is_signboard_arrow_id_used():
            end_bitposition += self._signboard_arrow_id_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: JunctionViewScene.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof_packed(zserio_context.content, end_bitposition)
        end_bitposition += self._intersection_id_.bitsizeof_packed(end_bitposition)
        if self.is_background_id_used():
            end_bitposition += self._background_id_.bitsizeof_packed(end_bitposition)
        if self.is_signboard_id_used():
            end_bitposition += self._signboard_id_.bitsizeof_packed(end_bitposition)
        if self.is_arrow_id_used():
            end_bitposition += self._arrow_id_.bitsizeof_packed(end_bitposition)
        if self.is_signboard_arrow_id_used():
            end_bitposition += self._signboard_arrow_id_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets(end_bitposition)
        end_bitposition = self._intersection_id_.initialize_offsets_packed(end_bitposition)
        if self.is_background_id_used():
            end_bitposition = self._background_id_.initialize_offsets_packed(end_bitposition)
        if self.is_signboard_id_used():
            end_bitposition = self._signboard_id_.initialize_offsets_packed(end_bitposition)
        if self.is_arrow_id_used():
            end_bitposition = self._arrow_id_.initialize_offsets_packed(end_bitposition)
        if self.is_signboard_arrow_id_used():
            end_bitposition = self._signboard_arrow_id_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: JunctionViewScene.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets_packed(zserio_context.content, end_bitposition)
        end_bitposition = self._intersection_id_.initialize_offsets_packed(end_bitposition)
        if self.is_background_id_used():
            end_bitposition = self._background_id_.initialize_offsets_packed(end_bitposition)
        if self.is_signboard_id_used():
            end_bitposition = self._signboard_id_.initialize_offsets_packed(end_bitposition)
        if self.is_arrow_id_used():
            end_bitposition = self._arrow_id_.initialize_offsets_packed(end_bitposition)
        if self.is_signboard_arrow_id_used():
            end_bitposition = self._signboard_arrow_id_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.instructions.types.junction_view_content.JunctionViewContent.from_reader(zserio_reader)
        self._intersection_id_ = zserio.array.Array.from_reader_packed(zserio.array.VarUIntArrayTraits(), zserio_reader, is_auto=True)
        if self.is_background_id_used():
            self._background_id_ = zserio.array.Array.from_reader_packed(zserio.array.VarUIntArrayTraits(), zserio_reader, is_auto=True)
        else:
            self._background_id_ = None
        if self.is_signboard_id_used():
            self._signboard_id_ = zserio.array.Array.from_reader_packed(zserio.array.VarUIntArrayTraits(), zserio_reader, is_auto=True)
        else:
            self._signboard_id_ = None
        if self.is_arrow_id_used():
            self._arrow_id_ = zserio.array.Array.from_reader_packed(zserio.array.VarUIntArrayTraits(), zserio_reader, is_auto=True)
        else:
            self._arrow_id_ = None
        if self.is_signboard_arrow_id_used():
            self._signboard_arrow_id_ = zserio.array.Array.from_reader_packed(zserio.array.VarUIntArrayTraits(), zserio_reader, is_auto=True)
        else:
            self._signboard_arrow_id_ = None

    def read_packed(self, zserio_context: JunctionViewScene.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.instructions.types.junction_view_content.JunctionViewContent.from_reader_packed(zserio_context.content, zserio_reader)

        self._intersection_id_ = zserio.array.Array.from_reader_packed(zserio.array.VarUIntArrayTraits(), zserio_reader, is_auto=True)

        if self.is_background_id_used():
            self._background_id_ = zserio.array.Array.from_reader_packed(zserio.array.VarUIntArrayTraits(), zserio_reader, is_auto=True)
        else:
            self._background_id_ = None

        if self.is_signboard_id_used():
            self._signboard_id_ = zserio.array.Array.from_reader_packed(zserio.array.VarUIntArrayTraits(), zserio_reader, is_auto=True)
        else:
            self._signboard_id_ = None

        if self.is_arrow_id_used():
            self._arrow_id_ = zserio.array.Array.from_reader_packed(zserio.array.VarUIntArrayTraits(), zserio_reader, is_auto=True)
        else:
            self._arrow_id_ = None

        if self.is_signboard_arrow_id_used():
            self._signboard_arrow_id_ = zserio.array.Array.from_reader_packed(zserio.array.VarUIntArrayTraits(), zserio_reader, is_auto=True)
        else:
            self._signboard_arrow_id_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write(zserio_writer)
        self._intersection_id_.write_packed(zserio_writer)
        if self.is_background_id_used():
            self._background_id_.write_packed(zserio_writer)
        if self.is_signboard_id_used():
            self._signboard_id_.write_packed(zserio_writer)
        if self.is_arrow_id_used():
            self._arrow_id_.write_packed(zserio_writer)
        if self.is_signboard_arrow_id_used():
            self._signboard_arrow_id_.write_packed(zserio_writer)

    def write_packed(self, zserio_context: JunctionViewScene.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write_packed(zserio_context.content, zserio_writer)

        self._intersection_id_.write_packed(zserio_writer)

        if self.is_background_id_used():
            self._background_id_.write_packed(zserio_writer)

        if self.is_signboard_id_used():
            self._signboard_id_.write_packed(zserio_writer)

        if self.is_arrow_id_used():
            self._arrow_id_.write_packed(zserio_writer)

        if self.is_signboard_arrow_id_used():
            self._signboard_arrow_id_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._content_ = zserio.array.DeltaContext()

        @property
        def content(self):
            return self._content_