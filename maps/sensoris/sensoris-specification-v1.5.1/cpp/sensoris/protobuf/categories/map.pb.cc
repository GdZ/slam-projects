// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/map.proto

#include "sensoris/protobuf/categories/map.pb.h"

#include <algorithm>
#include "google/protobuf/io/coded_stream.h"
#include "google/protobuf/extension_set.h"
#include "google/protobuf/wire_format_lite.h"
#include "google/protobuf/descriptor.h"
#include "google/protobuf/generated_message_reflection.h"
#include "google/protobuf/reflection_ops.h"
#include "google/protobuf/wire_format.h"
#include "google/protobuf/generated_message_tctable_impl.h"
// @@protoc_insertion_point(includes)

// Must be included last.
#include "google/protobuf/port_def.inc"
PROTOBUF_PRAGMA_INIT_SEG
namespace _pb = ::google::protobuf;
namespace _pbi = ::google::protobuf::internal;
namespace _fl = ::google::protobuf::internal::field_layout;
namespace sensoris {
namespace protobuf {
namespace categories {
namespace map {

inline constexpr MapReference::Impl_::Impl_(
    ::_pbi::ConstantInitialized) noexcept
      : _cached_size_{0},
        envelope_{nullptr},
        location_reference_{nullptr} {}

template <typename>
PROTOBUF_CONSTEXPR MapReference::MapReference(::_pbi::ConstantInitialized)
    : _impl_(::_pbi::ConstantInitialized()) {}
struct MapReferenceDefaultTypeInternal {
  PROTOBUF_CONSTEXPR MapReferenceDefaultTypeInternal() : _instance(::_pbi::ConstantInitialized{}) {}
  ~MapReferenceDefaultTypeInternal() {}
  union {
    MapReference _instance;
  };
};

PROTOBUF_ATTRIBUTE_NO_DESTROY PROTOBUF_CONSTINIT
    PROTOBUF_ATTRIBUTE_INIT_PRIORITY1 MapReferenceDefaultTypeInternal _MapReference_default_instance_;

inline constexpr MapCategory::Impl_::Impl_(
    ::_pbi::ConstantInitialized) noexcept
      : _cached_size_{0},
        map_reference_{},
        envelope_{nullptr} {}

template <typename>
PROTOBUF_CONSTEXPR MapCategory::MapCategory(::_pbi::ConstantInitialized)
    : _impl_(::_pbi::ConstantInitialized()) {}
struct MapCategoryDefaultTypeInternal {
  PROTOBUF_CONSTEXPR MapCategoryDefaultTypeInternal() : _instance(::_pbi::ConstantInitialized{}) {}
  ~MapCategoryDefaultTypeInternal() {}
  union {
    MapCategory _instance;
  };
};

PROTOBUF_ATTRIBUTE_NO_DESTROY PROTOBUF_CONSTINIT
    PROTOBUF_ATTRIBUTE_INIT_PRIORITY1 MapCategoryDefaultTypeInternal _MapCategory_default_instance_;
}  // namespace map
}  // namespace categories
}  // namespace protobuf
}  // namespace sensoris
static ::_pb::Metadata file_level_metadata_sensoris_2fprotobuf_2fcategories_2fmap_2eproto[2];
static constexpr const ::_pb::EnumDescriptor**
    file_level_enum_descriptors_sensoris_2fprotobuf_2fcategories_2fmap_2eproto = nullptr;
static constexpr const ::_pb::ServiceDescriptor**
    file_level_service_descriptors_sensoris_2fprotobuf_2fcategories_2fmap_2eproto = nullptr;
const ::uint32_t TableStruct_sensoris_2fprotobuf_2fcategories_2fmap_2eproto::offsets[] PROTOBUF_SECTION_VARIABLE(
    protodesc_cold) = {
    PROTOBUF_FIELD_OFFSET(::sensoris::protobuf::categories::map::MapReference, _impl_._has_bits_),
    PROTOBUF_FIELD_OFFSET(::sensoris::protobuf::categories::map::MapReference, _internal_metadata_),
    ~0u,  // no _extensions_
    ~0u,  // no _oneof_case_
    ~0u,  // no _weak_field_map_
    ~0u,  // no _inlined_string_donated_
    ~0u,  // no _split_
    ~0u,  // no sizeof(Split)
    PROTOBUF_FIELD_OFFSET(::sensoris::protobuf::categories::map::MapReference, _impl_.envelope_),
    PROTOBUF_FIELD_OFFSET(::sensoris::protobuf::categories::map::MapReference, _impl_.location_reference_),
    0,
    1,
    PROTOBUF_FIELD_OFFSET(::sensoris::protobuf::categories::map::MapCategory, _impl_._has_bits_),
    PROTOBUF_FIELD_OFFSET(::sensoris::protobuf::categories::map::MapCategory, _internal_metadata_),
    ~0u,  // no _extensions_
    ~0u,  // no _oneof_case_
    ~0u,  // no _weak_field_map_
    ~0u,  // no _inlined_string_donated_
    ~0u,  // no _split_
    ~0u,  // no sizeof(Split)
    PROTOBUF_FIELD_OFFSET(::sensoris::protobuf::categories::map::MapCategory, _impl_.envelope_),
    PROTOBUF_FIELD_OFFSET(::sensoris::protobuf::categories::map::MapCategory, _impl_.map_reference_),
    0,
    ~0u,
};

static const ::_pbi::MigrationSchema
    schemas[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
        {0, 10, -1, sizeof(::sensoris::protobuf::categories::map::MapReference)},
        {12, 22, -1, sizeof(::sensoris::protobuf::categories::map::MapCategory)},
};

static const ::_pb::Message* const file_default_instances[] = {
    &::sensoris::protobuf::categories::map::_MapReference_default_instance_._instance,
    &::sensoris::protobuf::categories::map::_MapCategory_default_instance_._instance,
};
const char descriptor_table_protodef_sensoris_2fprotobuf_2fcategories_2fmap_2eproto[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
    "\n&sensoris/protobuf/categories/map.proto"
    "\022 sensoris.protobuf.categories.map\032\"sens"
    "oris/protobuf/types/base.proto\032%sensoris"
    "/protobuf/types/spatial.proto\"\240\001\n\014MapRef"
    "erence\022=\n\010envelope\030\001 \001(\0132+.sensoris.prot"
    "obuf.types.base.EventEnvelope\022Q\n\022locatio"
    "n_reference\030\002 \001(\01325.sensoris.protobuf.ty"
    "pes.spatial.MapLocationReference\"\226\001\n\013Map"
    "Category\022@\n\010envelope\030\001 \001(\0132..sensoris.pr"
    "otobuf.types.base.CategoryEnvelope\022E\n\rma"
    "p_reference\030\002 \003(\0132..sensoris.protobuf.ca"
    "tegories.map.MapReferenceBf\n\033org.sensori"
    "s.categories.mapB\023SensorisMapCategoryP\001Z"
    "-sensoris.org/specification/categories/m"
    "apping\370\001\001b\006proto3"
};
static const ::_pbi::DescriptorTable* const descriptor_table_sensoris_2fprotobuf_2fcategories_2fmap_2eproto_deps[2] =
    {
        &::descriptor_table_sensoris_2fprotobuf_2ftypes_2fbase_2eproto,
        &::descriptor_table_sensoris_2fprotobuf_2ftypes_2fspatial_2eproto,
};
static ::absl::once_flag descriptor_table_sensoris_2fprotobuf_2fcategories_2fmap_2eproto_once;
const ::_pbi::DescriptorTable descriptor_table_sensoris_2fprotobuf_2fcategories_2fmap_2eproto = {
    false,
    false,
    577,
    descriptor_table_protodef_sensoris_2fprotobuf_2fcategories_2fmap_2eproto,
    "sensoris/protobuf/categories/map.proto",
    &descriptor_table_sensoris_2fprotobuf_2fcategories_2fmap_2eproto_once,
    descriptor_table_sensoris_2fprotobuf_2fcategories_2fmap_2eproto_deps,
    2,
    2,
    schemas,
    file_default_instances,
    TableStruct_sensoris_2fprotobuf_2fcategories_2fmap_2eproto::offsets,
    file_level_metadata_sensoris_2fprotobuf_2fcategories_2fmap_2eproto,
    file_level_enum_descriptors_sensoris_2fprotobuf_2fcategories_2fmap_2eproto,
    file_level_service_descriptors_sensoris_2fprotobuf_2fcategories_2fmap_2eproto,
};

// This function exists to be marked as weak.
// It can significantly speed up compilation by breaking up LLVM's SCC
// in the .pb.cc translation units. Large translation units see a
// reduction of more than 35% of walltime for optimized builds. Without
// the weak attribute all the messages in the file, including all the
// vtables and everything they use become part of the same SCC through
// a cycle like:
// GetMetadata -> descriptor table -> default instances ->
//   vtables -> GetMetadata
// By adding a weak function here we break the connection from the
// individual vtables back into the descriptor table.
PROTOBUF_ATTRIBUTE_WEAK const ::_pbi::DescriptorTable* descriptor_table_sensoris_2fprotobuf_2fcategories_2fmap_2eproto_getter() {
  return &descriptor_table_sensoris_2fprotobuf_2fcategories_2fmap_2eproto;
}
// Force running AddDescriptors() at dynamic initialization time.
PROTOBUF_ATTRIBUTE_INIT_PRIORITY2
static ::_pbi::AddDescriptorsRunner dynamic_init_dummy_sensoris_2fprotobuf_2fcategories_2fmap_2eproto(&descriptor_table_sensoris_2fprotobuf_2fcategories_2fmap_2eproto);
namespace sensoris {
namespace protobuf {
namespace categories {
namespace map {
// ===================================================================

class MapReference::_Internal {
 public:
  using HasBits = decltype(std::declval<MapReference>()._impl_._has_bits_);
  static constexpr ::int32_t kHasBitsOffset =
    8 * PROTOBUF_FIELD_OFFSET(MapReference, _impl_._has_bits_);
  static const ::sensoris::protobuf::types::base::EventEnvelope& envelope(const MapReference* msg);
  static void set_has_envelope(HasBits* has_bits) {
    (*has_bits)[0] |= 1u;
  }
  static const ::sensoris::protobuf::types::spatial::MapLocationReference& location_reference(const MapReference* msg);
  static void set_has_location_reference(HasBits* has_bits) {
    (*has_bits)[0] |= 2u;
  }
};

const ::sensoris::protobuf::types::base::EventEnvelope& MapReference::_Internal::envelope(const MapReference* msg) {
  return *msg->_impl_.envelope_;
}
const ::sensoris::protobuf::types::spatial::MapLocationReference& MapReference::_Internal::location_reference(const MapReference* msg) {
  return *msg->_impl_.location_reference_;
}
void MapReference::clear_envelope() {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  if (_impl_.envelope_ != nullptr) _impl_.envelope_->Clear();
  _impl_._has_bits_[0] &= ~0x00000001u;
}
void MapReference::clear_location_reference() {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  if (_impl_.location_reference_ != nullptr) _impl_.location_reference_->Clear();
  _impl_._has_bits_[0] &= ~0x00000002u;
}
MapReference::MapReference(::google::protobuf::Arena* arena)
    : ::google::protobuf::Message(arena) {
  SharedCtor(arena);
  // @@protoc_insertion_point(arena_constructor:sensoris.protobuf.categories.map.MapReference)
}
inline PROTOBUF_NDEBUG_INLINE MapReference::Impl_::Impl_(
    ::google::protobuf::internal::InternalVisibility visibility, ::google::protobuf::Arena* arena,
    const Impl_& from)
      : _has_bits_{from._has_bits_},
        _cached_size_{0} {}

MapReference::MapReference(
    ::google::protobuf::Arena* arena,
    const MapReference& from)
    : ::google::protobuf::Message(arena) {
  MapReference* const _this = this;
  (void)_this;
  _internal_metadata_.MergeFrom<::google::protobuf::UnknownFieldSet>(
      from._internal_metadata_);
  new (&_impl_) Impl_(internal_visibility(), arena, from._impl_);
  ::uint32_t cached_has_bits = _impl_._has_bits_[0];
  _impl_.envelope_ = (cached_has_bits & 0x00000001u)
                ? CreateMaybeMessage<::sensoris::protobuf::types::base::EventEnvelope>(arena, *from._impl_.envelope_)
                : nullptr;
  _impl_.location_reference_ = (cached_has_bits & 0x00000002u)
                ? CreateMaybeMessage<::sensoris::protobuf::types::spatial::MapLocationReference>(arena, *from._impl_.location_reference_)
                : nullptr;

  // @@protoc_insertion_point(copy_constructor:sensoris.protobuf.categories.map.MapReference)
}
inline PROTOBUF_NDEBUG_INLINE MapReference::Impl_::Impl_(
    ::google::protobuf::internal::InternalVisibility visibility,
    ::google::protobuf::Arena* arena)
      : _cached_size_{0} {}

inline void MapReference::SharedCtor(::_pb::Arena* arena) {
  new (&_impl_) Impl_(internal_visibility(), arena);
  ::memset(reinterpret_cast<char *>(&_impl_) +
               offsetof(Impl_, envelope_),
           0,
           offsetof(Impl_, location_reference_) -
               offsetof(Impl_, envelope_) +
               sizeof(Impl_::location_reference_));
}
MapReference::~MapReference() {
  // @@protoc_insertion_point(destructor:sensoris.protobuf.categories.map.MapReference)
  _internal_metadata_.Delete<::google::protobuf::UnknownFieldSet>();
  SharedDtor();
}
inline void MapReference::SharedDtor() {
  ABSL_DCHECK(GetArena() == nullptr);
  delete _impl_.envelope_;
  delete _impl_.location_reference_;
  _impl_.~Impl_();
}

PROTOBUF_NOINLINE void MapReference::Clear() {
// @@protoc_insertion_point(message_clear_start:sensoris.protobuf.categories.map.MapReference)
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  ::uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  cached_has_bits = _impl_._has_bits_[0];
  if (cached_has_bits & 0x00000003u) {
    if (cached_has_bits & 0x00000001u) {
      ABSL_DCHECK(_impl_.envelope_ != nullptr);
      _impl_.envelope_->Clear();
    }
    if (cached_has_bits & 0x00000002u) {
      ABSL_DCHECK(_impl_.location_reference_ != nullptr);
      _impl_.location_reference_->Clear();
    }
  }
  _impl_._has_bits_.Clear();
  _internal_metadata_.Clear<::google::protobuf::UnknownFieldSet>();
}

const char* MapReference::_InternalParse(
    const char* ptr, ::_pbi::ParseContext* ctx) {
  ptr = ::_pbi::TcParser::ParseLoop(this, ptr, ctx, &_table_.header);
  return ptr;
}


PROTOBUF_CONSTINIT PROTOBUF_ATTRIBUTE_INIT_PRIORITY1
const ::_pbi::TcParseTable<1, 2, 2, 0, 2> MapReference::_table_ = {
  {
    PROTOBUF_FIELD_OFFSET(MapReference, _impl_._has_bits_),
    0, // no _extensions_
    2, 8,  // max_field_number, fast_idx_mask
    offsetof(decltype(_table_), field_lookup_table),
    4294967292,  // skipmap
    offsetof(decltype(_table_), field_entries),
    2,  // num_field_entries
    2,  // num_aux_entries
    offsetof(decltype(_table_), aux_entries),
    &_MapReference_default_instance_._instance,
    ::_pbi::TcParser::GenericFallback,  // fallback
  }, {{
    // .sensoris.protobuf.types.spatial.MapLocationReference location_reference = 2;
    {::_pbi::TcParser::FastMtS1,
     {18, 1, 1, PROTOBUF_FIELD_OFFSET(MapReference, _impl_.location_reference_)}},
    // .sensoris.protobuf.types.base.EventEnvelope envelope = 1;
    {::_pbi::TcParser::FastMtS1,
     {10, 0, 0, PROTOBUF_FIELD_OFFSET(MapReference, _impl_.envelope_)}},
  }}, {{
    65535, 65535
  }}, {{
    // .sensoris.protobuf.types.base.EventEnvelope envelope = 1;
    {PROTOBUF_FIELD_OFFSET(MapReference, _impl_.envelope_), _Internal::kHasBitsOffset + 0, 0,
    (0 | ::_fl::kFcOptional | ::_fl::kMessage | ::_fl::kTvTable)},
    // .sensoris.protobuf.types.spatial.MapLocationReference location_reference = 2;
    {PROTOBUF_FIELD_OFFSET(MapReference, _impl_.location_reference_), _Internal::kHasBitsOffset + 1, 1,
    (0 | ::_fl::kFcOptional | ::_fl::kMessage | ::_fl::kTvTable)},
  }}, {{
    {::_pbi::TcParser::GetTable<::sensoris::protobuf::types::base::EventEnvelope>()},
    {::_pbi::TcParser::GetTable<::sensoris::protobuf::types::spatial::MapLocationReference>()},
  }}, {{
  }},
};

::uint8_t* MapReference::_InternalSerialize(
    ::uint8_t* target,
    ::google::protobuf::io::EpsCopyOutputStream* stream) const {
  // @@protoc_insertion_point(serialize_to_array_start:sensoris.protobuf.categories.map.MapReference)
  ::uint32_t cached_has_bits = 0;
  (void)cached_has_bits;

  cached_has_bits = _impl_._has_bits_[0];
  // .sensoris.protobuf.types.base.EventEnvelope envelope = 1;
  if (cached_has_bits & 0x00000001u) {
    target = ::google::protobuf::internal::WireFormatLite::InternalWriteMessage(
        1, _Internal::envelope(this),
        _Internal::envelope(this).GetCachedSize(), target, stream);
  }

  // .sensoris.protobuf.types.spatial.MapLocationReference location_reference = 2;
  if (cached_has_bits & 0x00000002u) {
    target = ::google::protobuf::internal::WireFormatLite::InternalWriteMessage(
        2, _Internal::location_reference(this),
        _Internal::location_reference(this).GetCachedSize(), target, stream);
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    target =
        ::_pbi::WireFormat::InternalSerializeUnknownFieldsToArray(
            _internal_metadata_.unknown_fields<::google::protobuf::UnknownFieldSet>(::google::protobuf::UnknownFieldSet::default_instance), target, stream);
  }
  // @@protoc_insertion_point(serialize_to_array_end:sensoris.protobuf.categories.map.MapReference)
  return target;
}

::size_t MapReference::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:sensoris.protobuf.categories.map.MapReference)
  ::size_t total_size = 0;

  ::uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  cached_has_bits = _impl_._has_bits_[0];
  if (cached_has_bits & 0x00000003u) {
    // .sensoris.protobuf.types.base.EventEnvelope envelope = 1;
    if (cached_has_bits & 0x00000001u) {
      total_size +=
          1 + ::google::protobuf::internal::WireFormatLite::MessageSize(*_impl_.envelope_);
    }

    // .sensoris.protobuf.types.spatial.MapLocationReference location_reference = 2;
    if (cached_has_bits & 0x00000002u) {
      total_size +=
          1 + ::google::protobuf::internal::WireFormatLite::MessageSize(*_impl_.location_reference_);
    }

  }
  return MaybeComputeUnknownFieldsSize(total_size, &_impl_._cached_size_);
}

const ::google::protobuf::Message::ClassData MapReference::_class_data_ = {
    MapReference::MergeImpl,
    nullptr,  // OnDemandRegisterArenaDtor
};
const ::google::protobuf::Message::ClassData* MapReference::GetClassData() const {
  return &_class_data_;
}

void MapReference::MergeImpl(::google::protobuf::Message& to_msg, const ::google::protobuf::Message& from_msg) {
  auto* const _this = static_cast<MapReference*>(&to_msg);
  auto& from = static_cast<const MapReference&>(from_msg);
  // @@protoc_insertion_point(class_specific_merge_from_start:sensoris.protobuf.categories.map.MapReference)
  ABSL_DCHECK_NE(&from, _this);
  ::uint32_t cached_has_bits = 0;
  (void) cached_has_bits;

  cached_has_bits = from._impl_._has_bits_[0];
  if (cached_has_bits & 0x00000003u) {
    if (cached_has_bits & 0x00000001u) {
      _this->_internal_mutable_envelope()->::sensoris::protobuf::types::base::EventEnvelope::MergeFrom(
          from._internal_envelope());
    }
    if (cached_has_bits & 0x00000002u) {
      _this->_internal_mutable_location_reference()->::sensoris::protobuf::types::spatial::MapLocationReference::MergeFrom(
          from._internal_location_reference());
    }
  }
  _this->_internal_metadata_.MergeFrom<::google::protobuf::UnknownFieldSet>(from._internal_metadata_);
}

void MapReference::CopyFrom(const MapReference& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:sensoris.protobuf.categories.map.MapReference)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

PROTOBUF_NOINLINE bool MapReference::IsInitialized() const {
  return true;
}

::_pbi::CachedSize* MapReference::AccessCachedSize() const {
  return &_impl_._cached_size_;
}
void MapReference::InternalSwap(MapReference* PROTOBUF_RESTRICT other) {
  using std::swap;
  _internal_metadata_.InternalSwap(&other->_internal_metadata_);
  swap(_impl_._has_bits_[0], other->_impl_._has_bits_[0]);
  ::google::protobuf::internal::memswap<
      PROTOBUF_FIELD_OFFSET(MapReference, _impl_.location_reference_)
      + sizeof(MapReference::_impl_.location_reference_)
      - PROTOBUF_FIELD_OFFSET(MapReference, _impl_.envelope_)>(
          reinterpret_cast<char*>(&_impl_.envelope_),
          reinterpret_cast<char*>(&other->_impl_.envelope_));
}

::google::protobuf::Metadata MapReference::GetMetadata() const {
  return ::_pbi::AssignDescriptors(
      &descriptor_table_sensoris_2fprotobuf_2fcategories_2fmap_2eproto_getter, &descriptor_table_sensoris_2fprotobuf_2fcategories_2fmap_2eproto_once,
      file_level_metadata_sensoris_2fprotobuf_2fcategories_2fmap_2eproto[0]);
}
// ===================================================================

class MapCategory::_Internal {
 public:
  using HasBits = decltype(std::declval<MapCategory>()._impl_._has_bits_);
  static constexpr ::int32_t kHasBitsOffset =
    8 * PROTOBUF_FIELD_OFFSET(MapCategory, _impl_._has_bits_);
  static const ::sensoris::protobuf::types::base::CategoryEnvelope& envelope(const MapCategory* msg);
  static void set_has_envelope(HasBits* has_bits) {
    (*has_bits)[0] |= 1u;
  }
};

const ::sensoris::protobuf::types::base::CategoryEnvelope& MapCategory::_Internal::envelope(const MapCategory* msg) {
  return *msg->_impl_.envelope_;
}
void MapCategory::clear_envelope() {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  if (_impl_.envelope_ != nullptr) _impl_.envelope_->Clear();
  _impl_._has_bits_[0] &= ~0x00000001u;
}
MapCategory::MapCategory(::google::protobuf::Arena* arena)
    : ::google::protobuf::Message(arena) {
  SharedCtor(arena);
  // @@protoc_insertion_point(arena_constructor:sensoris.protobuf.categories.map.MapCategory)
}
inline PROTOBUF_NDEBUG_INLINE MapCategory::Impl_::Impl_(
    ::google::protobuf::internal::InternalVisibility visibility, ::google::protobuf::Arena* arena,
    const Impl_& from)
      : _has_bits_{from._has_bits_},
        _cached_size_{0},
        map_reference_{visibility, arena, from.map_reference_} {}

MapCategory::MapCategory(
    ::google::protobuf::Arena* arena,
    const MapCategory& from)
    : ::google::protobuf::Message(arena) {
  MapCategory* const _this = this;
  (void)_this;
  _internal_metadata_.MergeFrom<::google::protobuf::UnknownFieldSet>(
      from._internal_metadata_);
  new (&_impl_) Impl_(internal_visibility(), arena, from._impl_);
  ::uint32_t cached_has_bits = _impl_._has_bits_[0];
  _impl_.envelope_ = (cached_has_bits & 0x00000001u)
                ? CreateMaybeMessage<::sensoris::protobuf::types::base::CategoryEnvelope>(arena, *from._impl_.envelope_)
                : nullptr;

  // @@protoc_insertion_point(copy_constructor:sensoris.protobuf.categories.map.MapCategory)
}
inline PROTOBUF_NDEBUG_INLINE MapCategory::Impl_::Impl_(
    ::google::protobuf::internal::InternalVisibility visibility,
    ::google::protobuf::Arena* arena)
      : _cached_size_{0},
        map_reference_{visibility, arena} {}

inline void MapCategory::SharedCtor(::_pb::Arena* arena) {
  new (&_impl_) Impl_(internal_visibility(), arena);
  _impl_.envelope_ = {};
}
MapCategory::~MapCategory() {
  // @@protoc_insertion_point(destructor:sensoris.protobuf.categories.map.MapCategory)
  _internal_metadata_.Delete<::google::protobuf::UnknownFieldSet>();
  SharedDtor();
}
inline void MapCategory::SharedDtor() {
  ABSL_DCHECK(GetArena() == nullptr);
  delete _impl_.envelope_;
  _impl_.~Impl_();
}

PROTOBUF_NOINLINE void MapCategory::Clear() {
// @@protoc_insertion_point(message_clear_start:sensoris.protobuf.categories.map.MapCategory)
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  ::uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  _impl_.map_reference_.Clear();
  cached_has_bits = _impl_._has_bits_[0];
  if (cached_has_bits & 0x00000001u) {
    ABSL_DCHECK(_impl_.envelope_ != nullptr);
    _impl_.envelope_->Clear();
  }
  _impl_._has_bits_.Clear();
  _internal_metadata_.Clear<::google::protobuf::UnknownFieldSet>();
}

const char* MapCategory::_InternalParse(
    const char* ptr, ::_pbi::ParseContext* ctx) {
  ptr = ::_pbi::TcParser::ParseLoop(this, ptr, ctx, &_table_.header);
  return ptr;
}


PROTOBUF_CONSTINIT PROTOBUF_ATTRIBUTE_INIT_PRIORITY1
const ::_pbi::TcParseTable<1, 2, 2, 0, 2> MapCategory::_table_ = {
  {
    PROTOBUF_FIELD_OFFSET(MapCategory, _impl_._has_bits_),
    0, // no _extensions_
    2, 8,  // max_field_number, fast_idx_mask
    offsetof(decltype(_table_), field_lookup_table),
    4294967292,  // skipmap
    offsetof(decltype(_table_), field_entries),
    2,  // num_field_entries
    2,  // num_aux_entries
    offsetof(decltype(_table_), aux_entries),
    &_MapCategory_default_instance_._instance,
    ::_pbi::TcParser::GenericFallback,  // fallback
  }, {{
    // repeated .sensoris.protobuf.categories.map.MapReference map_reference = 2;
    {::_pbi::TcParser::FastMtR1,
     {18, 63, 1, PROTOBUF_FIELD_OFFSET(MapCategory, _impl_.map_reference_)}},
    // .sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;
    {::_pbi::TcParser::FastMtS1,
     {10, 0, 0, PROTOBUF_FIELD_OFFSET(MapCategory, _impl_.envelope_)}},
  }}, {{
    65535, 65535
  }}, {{
    // .sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;
    {PROTOBUF_FIELD_OFFSET(MapCategory, _impl_.envelope_), _Internal::kHasBitsOffset + 0, 0,
    (0 | ::_fl::kFcOptional | ::_fl::kMessage | ::_fl::kTvTable)},
    // repeated .sensoris.protobuf.categories.map.MapReference map_reference = 2;
    {PROTOBUF_FIELD_OFFSET(MapCategory, _impl_.map_reference_), -1, 1,
    (0 | ::_fl::kFcRepeated | ::_fl::kMessage | ::_fl::kTvTable)},
  }}, {{
    {::_pbi::TcParser::GetTable<::sensoris::protobuf::types::base::CategoryEnvelope>()},
    {::_pbi::TcParser::GetTable<::sensoris::protobuf::categories::map::MapReference>()},
  }}, {{
  }},
};

::uint8_t* MapCategory::_InternalSerialize(
    ::uint8_t* target,
    ::google::protobuf::io::EpsCopyOutputStream* stream) const {
  // @@protoc_insertion_point(serialize_to_array_start:sensoris.protobuf.categories.map.MapCategory)
  ::uint32_t cached_has_bits = 0;
  (void)cached_has_bits;

  cached_has_bits = _impl_._has_bits_[0];
  // .sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;
  if (cached_has_bits & 0x00000001u) {
    target = ::google::protobuf::internal::WireFormatLite::InternalWriteMessage(
        1, _Internal::envelope(this),
        _Internal::envelope(this).GetCachedSize(), target, stream);
  }

  // repeated .sensoris.protobuf.categories.map.MapReference map_reference = 2;
  for (unsigned i = 0,
      n = static_cast<unsigned>(this->_internal_map_reference_size()); i < n; i++) {
    const auto& repfield = this->_internal_map_reference().Get(i);
    target = ::google::protobuf::internal::WireFormatLite::
        InternalWriteMessage(2, repfield, repfield.GetCachedSize(), target, stream);
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    target =
        ::_pbi::WireFormat::InternalSerializeUnknownFieldsToArray(
            _internal_metadata_.unknown_fields<::google::protobuf::UnknownFieldSet>(::google::protobuf::UnknownFieldSet::default_instance), target, stream);
  }
  // @@protoc_insertion_point(serialize_to_array_end:sensoris.protobuf.categories.map.MapCategory)
  return target;
}

::size_t MapCategory::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:sensoris.protobuf.categories.map.MapCategory)
  ::size_t total_size = 0;

  ::uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  // repeated .sensoris.protobuf.categories.map.MapReference map_reference = 2;
  total_size += 1UL * this->_internal_map_reference_size();
  for (const auto& msg : this->_internal_map_reference()) {
    total_size +=
      ::google::protobuf::internal::WireFormatLite::MessageSize(msg);
  }
  // .sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;
  cached_has_bits = _impl_._has_bits_[0];
  if (cached_has_bits & 0x00000001u) {
    total_size +=
        1 + ::google::protobuf::internal::WireFormatLite::MessageSize(*_impl_.envelope_);
  }

  return MaybeComputeUnknownFieldsSize(total_size, &_impl_._cached_size_);
}

const ::google::protobuf::Message::ClassData MapCategory::_class_data_ = {
    MapCategory::MergeImpl,
    nullptr,  // OnDemandRegisterArenaDtor
};
const ::google::protobuf::Message::ClassData* MapCategory::GetClassData() const {
  return &_class_data_;
}

void MapCategory::MergeImpl(::google::protobuf::Message& to_msg, const ::google::protobuf::Message& from_msg) {
  auto* const _this = static_cast<MapCategory*>(&to_msg);
  auto& from = static_cast<const MapCategory&>(from_msg);
  // @@protoc_insertion_point(class_specific_merge_from_start:sensoris.protobuf.categories.map.MapCategory)
  ABSL_DCHECK_NE(&from, _this);
  ::uint32_t cached_has_bits = 0;
  (void) cached_has_bits;

  _this->_internal_mutable_map_reference()->MergeFrom(
      from._internal_map_reference());
  if ((from._impl_._has_bits_[0] & 0x00000001u) != 0) {
    _this->_internal_mutable_envelope()->::sensoris::protobuf::types::base::CategoryEnvelope::MergeFrom(
        from._internal_envelope());
  }
  _this->_internal_metadata_.MergeFrom<::google::protobuf::UnknownFieldSet>(from._internal_metadata_);
}

void MapCategory::CopyFrom(const MapCategory& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:sensoris.protobuf.categories.map.MapCategory)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

PROTOBUF_NOINLINE bool MapCategory::IsInitialized() const {
  return true;
}

::_pbi::CachedSize* MapCategory::AccessCachedSize() const {
  return &_impl_._cached_size_;
}
void MapCategory::InternalSwap(MapCategory* PROTOBUF_RESTRICT other) {
  using std::swap;
  _internal_metadata_.InternalSwap(&other->_internal_metadata_);
  swap(_impl_._has_bits_[0], other->_impl_._has_bits_[0]);
  _impl_.map_reference_.InternalSwap(&other->_impl_.map_reference_);
  swap(_impl_.envelope_, other->_impl_.envelope_);
}

::google::protobuf::Metadata MapCategory::GetMetadata() const {
  return ::_pbi::AssignDescriptors(
      &descriptor_table_sensoris_2fprotobuf_2fcategories_2fmap_2eproto_getter, &descriptor_table_sensoris_2fprotobuf_2fcategories_2fmap_2eproto_once,
      file_level_metadata_sensoris_2fprotobuf_2fcategories_2fmap_2eproto[1]);
}
// @@protoc_insertion_point(namespace_scope)
}  // namespace map
}  // namespace categories
}  // namespace protobuf
}  // namespace sensoris
namespace google {
namespace protobuf {
}  // namespace protobuf
}  // namespace google
// @@protoc_insertion_point(global_scope)
#include "google/protobuf/port_undef.inc"
