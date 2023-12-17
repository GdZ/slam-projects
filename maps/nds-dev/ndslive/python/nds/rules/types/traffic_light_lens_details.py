# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.rules.types.traffic_light_inlay_type
import nds.rules.types.traffic_light_lens_color

class TrafficLightLensDetails:
    def __init__(
            self,
            color_: typing.Union[nds.rules.types.traffic_light_lens_color.TrafficLightLensColor, None] = None,
            is_inverted_: bool = bool(),
            inlay_type_: typing.Union[nds.rules.types.traffic_light_inlay_type.TrafficLightInlayType, None] = None) -> None:
        self._color_ = color_
        self._is_inverted_ = is_inverted_
        self._inlay_type_ = inlay_type_

    @classmethod
    def from_reader(
            cls: typing.Type['TrafficLightLensDetails'],
            zserio_reader: zserio.BitStreamReader) -> 'TrafficLightLensDetails':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['TrafficLightLensDetails'],
            zserio_context: TrafficLightLensDetails.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'TrafficLightLensDetails':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, TrafficLightLensDetails):
            return ((self._color_ == other._color_) and
                    (self._is_inverted_ == other._is_inverted_) and
                    (self._inlay_type_ == other._inlay_type_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._color_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_inverted_)
        result = zserio.hashcode.calc_hashcode_object(result, self._inlay_type_)

        return result

    @property
    def color(self) -> typing.Union[nds.rules.types.traffic_light_lens_color.TrafficLightLensColor, None]:
        return self._color_

    @color.setter
    def color(self, color_: typing.Union[nds.rules.types.traffic_light_lens_color.TrafficLightLensColor, None]) -> None:
        self._color_ = color_

    @property
    def is_inverted(self) -> bool:
        return self._is_inverted_

    @is_inverted.setter
    def is_inverted(self, is_inverted_: bool) -> None:
        self._is_inverted_ = is_inverted_

    @property
    def inlay_type(self) -> typing.Union[nds.rules.types.traffic_light_inlay_type.TrafficLightInlayType, None]:
        return self._inlay_type_

    @inlay_type.setter
    def inlay_type(self, inlay_type_: typing.Union[nds.rules.types.traffic_light_inlay_type.TrafficLightInlayType, None]) -> None:
        self._inlay_type_ = inlay_type_

    def init_packing_context(self, zserio_context: TrafficLightLensDetails.ZserioPackingContext) -> None:
        self._color_.init_packing_context(zserio_context.color)
        self._inlay_type_.init_packing_context(zserio_context.inlay_type)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._color_.bitsizeof(end_bitposition)
        end_bitposition += 1
        end_bitposition += self._inlay_type_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: TrafficLightLensDetails.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._color_.bitsizeof_packed(zserio_context.color, end_bitposition)
        end_bitposition += 1
        end_bitposition += self._inlay_type_.bitsizeof_packed(zserio_context.inlay_type, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._color_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        end_bitposition = self._inlay_type_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: TrafficLightLensDetails.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._color_.initialize_offsets_packed(zserio_context.color, end_bitposition)
        end_bitposition += 1
        end_bitposition = self._inlay_type_.initialize_offsets_packed(zserio_context.inlay_type, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._color_ = nds.rules.types.traffic_light_lens_color.TrafficLightLensColor.from_reader(zserio_reader)
        self._is_inverted_ = zserio_reader.read_bool()
        self._inlay_type_ = nds.rules.types.traffic_light_inlay_type.TrafficLightInlayType.from_reader(zserio_reader)

    def read_packed(self, zserio_context: TrafficLightLensDetails.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._color_ = nds.rules.types.traffic_light_lens_color.TrafficLightLensColor.from_reader_packed(zserio_context.color, zserio_reader)

        self._is_inverted_ = zserio_reader.read_bool()

        self._inlay_type_ = nds.rules.types.traffic_light_inlay_type.TrafficLightInlayType.from_reader_packed(zserio_context.inlay_type, zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._color_.write(zserio_writer)
        zserio_writer.write_bool(self._is_inverted_)
        self._inlay_type_.write(zserio_writer)

    def write_packed(self, zserio_context: TrafficLightLensDetails.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._color_.write_packed(zserio_context.color, zserio_writer)

        zserio_writer.write_bool(self._is_inverted_)

        self._inlay_type_.write_packed(zserio_context.inlay_type, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._color_ = zserio.array.DeltaContext()
            self._inlay_type_ = zserio.array.DeltaContext()

        @property
        def color(self):
            return self._color_

        @property
        def inlay_type(self):
            return self._inlay_type_
