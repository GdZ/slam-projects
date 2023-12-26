// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/brake.proto

#include "sensoris/protobuf/categories/brake.pb.h"

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
namespace brake {

inline constexpr BrakeSystemsStatus::Impl_::Impl_(
    ::_pbi::ConstantInitialized) noexcept
      : _cached_size_{0},
        envelope_{nullptr},
        abs_status_{static_cast< ::sensoris::protobuf::types::base::SystemStatus >(0)},
        esc_status_{static_cast< ::sensoris::protobuf::types::base::SystemStatus >(0)},
        tcs_status_{static_cast< ::sensoris::protobuf::types::base::SystemStatus >(0)},
        ebd_status_{static_cast< ::sensoris::protobuf::types::base::SystemStatus >(0)},
        eba_status_{static_cast< ::sensoris::protobuf::types::base::SystemStatus >(0)} {}

template <typename>
PROTOBUF_CONSTEXPR BrakeSystemsStatus::BrakeSystemsStatus(::_pbi::ConstantInitialized)
    : _impl_(::_pbi::ConstantInitialized()) {}
struct BrakeSystemsStatusDefaultTypeInternal {
  PROTOBUF_CONSTEXPR BrakeSystemsStatusDefaultTypeInternal() : _instance(::_pbi::ConstantInitialized{}) {}
  ~BrakeSystemsStatusDefaultTypeInternal() {}
  union {
    BrakeSystemsStatus _instance;
  };
};

PROTOBUF_ATTRIBUTE_NO_DESTROY PROTOBUF_CONSTINIT
    PROTOBUF_ATTRIBUTE_INIT_PRIORITY1 BrakeSystemsStatusDefaultTypeInternal _BrakeSystemsStatus_default_instance_;

inline constexpr BrakeCategory::Impl_::Impl_(
    ::_pbi::ConstantInitialized) noexcept
      : _cached_size_{0},
        brake_systems_status_{},
        envelope_{nullptr} {}

template <typename>
PROTOBUF_CONSTEXPR BrakeCategory::BrakeCategory(::_pbi::ConstantInitialized)
    : _impl_(::_pbi::ConstantInitialized()) {}
struct BrakeCategoryDefaultTypeInternal {
  PROTOBUF_CONSTEXPR BrakeCategoryDefaultTypeInternal() : _instance(::_pbi::ConstantInitialized{}) {}
  ~BrakeCategoryDefaultTypeInternal() {}
  union {
    BrakeCategory _instance;
  };
};

PROTOBUF_ATTRIBUTE_NO_DESTROY PROTOBUF_CONSTINIT
    PROTOBUF_ATTRIBUTE_INIT_PRIORITY1 BrakeCategoryDefaultTypeInternal _BrakeCategory_default_instance_;
}  // namespace brake
}  // namespace categories
}  // namespace protobuf
}  // namespace sensoris
static ::_pb::Metadata file_level_metadata_sensoris_2fprotobuf_2fcategories_2fbrake_2eproto[2];
static constexpr const ::_pb::EnumDescriptor**
    file_level_enum_descriptors_sensoris_2fprotobuf_2fcategories_2fbrake_2eproto = nullptr;
static constexpr const ::_pb::ServiceDescriptor**
    file_level_service_descriptors_sensoris_2fprotobuf_2fcategories_2fbrake_2eproto = nullptr;
const ::uint32_t TableStruct_sensoris_2fprotobuf_2fcategories_2fbrake_2eproto::offsets[] PROTOBUF_SECTION_VARIABLE(
    protodesc_cold) = {
    PROTOBUF_FIELD_OFFSET(::sensoris::protobuf::categories::brake::BrakeSystemsStatus, _impl_._has_bits_),
    PROTOBUF_FIELD_OFFSET(::sensoris::protobuf::categories::brake::BrakeSystemsStatus, _internal_metadata_),
    ~0u,  // no _extensions_
    ~0u,  // no _oneof_case_
    ~0u,  // no _weak_field_map_
    ~0u,  // no _inlined_string_donated_
    ~0u,  // no _split_
    ~0u,  // no sizeof(Split)
    PROTOBUF_FIELD_OFFSET(::sensoris::protobuf::categories::brake::BrakeSystemsStatus, _impl_.envelope_),
    PROTOBUF_FIELD_OFFSET(::sensoris::protobuf::categories::brake::BrakeSystemsStatus, _impl_.abs_status_),
    PROTOBUF_FIELD_OFFSET(::sensoris::protobuf::categories::brake::BrakeSystemsStatus, _impl_.esc_status_),
    PROTOBUF_FIELD_OFFSET(::sensoris::protobuf::categories::brake::BrakeSystemsStatus, _impl_.tcs_status_),
    PROTOBUF_FIELD_OFFSET(::sensoris::protobuf::categories::brake::BrakeSystemsStatus, _impl_.ebd_status_),
    PROTOBUF_FIELD_OFFSET(::sensoris::protobuf::categories::brake::BrakeSystemsStatus, _impl_.eba_status_),
    0,
    ~0u,
    ~0u,
    ~0u,
    ~0u,
    ~0u,
    PROTOBUF_FIELD_OFFSET(::sensoris::protobuf::categories::brake::BrakeCategory, _impl_._has_bits_),
    PROTOBUF_FIELD_OFFSET(::sensoris::protobuf::categories::brake::BrakeCategory, _internal_metadata_),
    ~0u,  // no _extensions_
    ~0u,  // no _oneof_case_
    ~0u,  // no _weak_field_map_
    ~0u,  // no _inlined_string_donated_
    ~0u,  // no _split_
    ~0u,  // no sizeof(Split)
    PROTOBUF_FIELD_OFFSET(::sensoris::protobuf::categories::brake::BrakeCategory, _impl_.envelope_),
    PROTOBUF_FIELD_OFFSET(::sensoris::protobuf::categories::brake::BrakeCategory, _impl_.brake_systems_status_),
    0,
    ~0u,
};

static const ::_pbi::MigrationSchema
    schemas[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
        {0, 14, -1, sizeof(::sensoris::protobuf::categories::brake::BrakeSystemsStatus)},
        {20, 30, -1, sizeof(::sensoris::protobuf::categories::brake::BrakeCategory)},
};

static const ::_pb::Message* const file_default_instances[] = {
    &::sensoris::protobuf::categories::brake::_BrakeSystemsStatus_default_instance_._instance,
    &::sensoris::protobuf::categories::brake::_BrakeCategory_default_instance_._instance,
};
const char descriptor_table_protodef_sensoris_2fprotobuf_2fcategories_2fbrake_2eproto[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
    "\n(sensoris/protobuf/categories/brake.pro"
    "to\022\"sensoris.protobuf.categories.brake\032\""
    "sensoris/protobuf/types/base.proto\"\223\003\n\022B"
    "rakeSystemsStatus\022=\n\010envelope\030\001 \001(\0132+.se"
    "nsoris.protobuf.types.base.EventEnvelope"
    "\022>\n\nabs_status\030\002 \001(\0162*.sensoris.protobuf"
    ".types.base.SystemStatus\022>\n\nesc_status\030\003"
    " \001(\0162*.sensoris.protobuf.types.base.Syst"
    "emStatus\022>\n\ntcs_status\030\004 \001(\0162*.sensoris."
    "protobuf.types.base.SystemStatus\022>\n\nebd_"
    "status\030\005 \001(\0162*.sensoris.protobuf.types.b"
    "ase.SystemStatus\022>\n\neba_status\030\006 \001(\0162*.s"
    "ensoris.protobuf.types.base.SystemStatus"
    "\"\247\001\n\rBrakeCategory\022@\n\010envelope\030\001 \001(\0132..s"
    "ensoris.protobuf.types.base.CategoryEnve"
    "lope\022T\n\024brake_systems_status\030\002 \003(\01326.sen"
    "soris.protobuf.categories.brake.BrakeSys"
    "temsStatusBh\n\035org.sensoris.categories.br"
    "akeB\025SensorisBrakeCategoryP\001Z+sensoris.o"
    "rg/specification/categories/brake\370\001\001b\006pr"
    "oto3"
};
static const ::_pbi::DescriptorTable* const descriptor_table_sensoris_2fprotobuf_2fcategories_2fbrake_2eproto_deps[1] =
    {
        &::descriptor_table_sensoris_2fprotobuf_2ftypes_2fbase_2eproto,
};
static ::absl::once_flag descriptor_table_sensoris_2fprotobuf_2fcategories_2fbrake_2eproto_once;
const ::_pbi::DescriptorTable descriptor_table_sensoris_2fprotobuf_2fcategories_2fbrake_2eproto = {
    false,
    false,
    804,
    descriptor_table_protodef_sensoris_2fprotobuf_2fcategories_2fbrake_2eproto,
    "sensoris/protobuf/categories/brake.proto",
    &descriptor_table_sensoris_2fprotobuf_2fcategories_2fbrake_2eproto_once,
    descriptor_table_sensoris_2fprotobuf_2fcategories_2fbrake_2eproto_deps,
    1,
    2,
    schemas,
    file_default_instances,
    TableStruct_sensoris_2fprotobuf_2fcategories_2fbrake_2eproto::offsets,
    file_level_metadata_sensoris_2fprotobuf_2fcategories_2fbrake_2eproto,
    file_level_enum_descriptors_sensoris_2fprotobuf_2fcategories_2fbrake_2eproto,
    file_level_service_descriptors_sensoris_2fprotobuf_2fcategories_2fbrake_2eproto,
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
PROTOBUF_ATTRIBUTE_WEAK const ::_pbi::DescriptorTable* descriptor_table_sensoris_2fprotobuf_2fcategories_2fbrake_2eproto_getter() {
  return &descriptor_table_sensoris_2fprotobuf_2fcategories_2fbrake_2eproto;
}
// Force running AddDescriptors() at dynamic initialization time.
PROTOBUF_ATTRIBUTE_INIT_PRIORITY2
static ::_pbi::AddDescriptorsRunner dynamic_init_dummy_sensoris_2fprotobuf_2fcategories_2fbrake_2eproto(&descriptor_table_sensoris_2fprotobuf_2fcategories_2fbrake_2eproto);
namespace sensoris {
namespace protobuf {
namespace categories {
namespace brake {
// ===================================================================

class BrakeSystemsStatus::_Internal {
 public:
  using HasBits = decltype(std::declval<BrakeSystemsStatus>()._impl_._has_bits_);
  static constexpr ::int32_t kHasBitsOffset =
    8 * PROTOBUF_FIELD_OFFSET(BrakeSystemsStatus, _impl_._has_bits_);
  static const ::sensoris::protobuf::types::base::EventEnvelope& envelope(const BrakeSystemsStatus* msg);
  static void set_has_envelope(HasBits* has_bits) {
    (*has_bits)[0] |= 1u;
  }
};

const ::sensoris::protobuf::types::base::EventEnvelope& BrakeSystemsStatus::_Internal::envelope(const BrakeSystemsStatus* msg) {
  return *msg->_impl_.envelope_;
}
void BrakeSystemsStatus::clear_envelope() {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  if (_impl_.envelope_ != nullptr) _impl_.envelope_->Clear();
  _impl_._has_bits_[0] &= ~0x00000001u;
}
BrakeSystemsStatus::BrakeSystemsStatus(::google::protobuf::Arena* arena)
    : ::google::protobuf::Message(arena) {
  SharedCtor(arena);
  // @@protoc_insertion_point(arena_constructor:sensoris.protobuf.categories.brake.BrakeSystemsStatus)
}
inline PROTOBUF_NDEBUG_INLINE BrakeSystemsStatus::Impl_::Impl_(
    ::google::protobuf::internal::InternalVisibility visibility, ::google::protobuf::Arena* arena,
    const Impl_& from)
      : _has_bits_{from._has_bits_},
        _cached_size_{0} {}

BrakeSystemsStatus::BrakeSystemsStatus(
    ::google::protobuf::Arena* arena,
    const BrakeSystemsStatus& from)
    : ::google::protobuf::Message(arena) {
  BrakeSystemsStatus* const _this = this;
  (void)_this;
  _internal_metadata_.MergeFrom<::google::protobuf::UnknownFieldSet>(
      from._internal_metadata_);
  new (&_impl_) Impl_(internal_visibility(), arena, from._impl_);
  ::uint32_t cached_has_bits = _impl_._has_bits_[0];
  _impl_.envelope_ = (cached_has_bits & 0x00000001u)
                ? CreateMaybeMessage<::sensoris::protobuf::types::base::EventEnvelope>(arena, *from._impl_.envelope_)
                : nullptr;
  ::memcpy(reinterpret_cast<char *>(&_impl_) +
               offsetof(Impl_, abs_status_),
           reinterpret_cast<const char *>(&from._impl_) +
               offsetof(Impl_, abs_status_),
           offsetof(Impl_, eba_status_) -
               offsetof(Impl_, abs_status_) +
               sizeof(Impl_::eba_status_));

  // @@protoc_insertion_point(copy_constructor:sensoris.protobuf.categories.brake.BrakeSystemsStatus)
}
inline PROTOBUF_NDEBUG_INLINE BrakeSystemsStatus::Impl_::Impl_(
    ::google::protobuf::internal::InternalVisibility visibility,
    ::google::protobuf::Arena* arena)
      : _cached_size_{0} {}

inline void BrakeSystemsStatus::SharedCtor(::_pb::Arena* arena) {
  new (&_impl_) Impl_(internal_visibility(), arena);
  ::memset(reinterpret_cast<char *>(&_impl_) +
               offsetof(Impl_, envelope_),
           0,
           offsetof(Impl_, eba_status_) -
               offsetof(Impl_, envelope_) +
               sizeof(Impl_::eba_status_));
}
BrakeSystemsStatus::~BrakeSystemsStatus() {
  // @@protoc_insertion_point(destructor:sensoris.protobuf.categories.brake.BrakeSystemsStatus)
  _internal_metadata_.Delete<::google::protobuf::UnknownFieldSet>();
  SharedDtor();
}
inline void BrakeSystemsStatus::SharedDtor() {
  ABSL_DCHECK(GetArena() == nullptr);
  delete _impl_.envelope_;
  _impl_.~Impl_();
}

PROTOBUF_NOINLINE void BrakeSystemsStatus::Clear() {
// @@protoc_insertion_point(message_clear_start:sensoris.protobuf.categories.brake.BrakeSystemsStatus)
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  ::uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  cached_has_bits = _impl_._has_bits_[0];
  if (cached_has_bits & 0x00000001u) {
    ABSL_DCHECK(_impl_.envelope_ != nullptr);
    _impl_.envelope_->Clear();
  }
  ::memset(&_impl_.abs_status_, 0, static_cast<::size_t>(
      reinterpret_cast<char*>(&_impl_.eba_status_) -
      reinterpret_cast<char*>(&_impl_.abs_status_)) + sizeof(_impl_.eba_status_));
  _impl_._has_bits_.Clear();
  _internal_metadata_.Clear<::google::protobuf::UnknownFieldSet>();
}

const char* BrakeSystemsStatus::_InternalParse(
    const char* ptr, ::_pbi::ParseContext* ctx) {
  ptr = ::_pbi::TcParser::ParseLoop(this, ptr, ctx, &_table_.header);
  return ptr;
}


PROTOBUF_CONSTINIT PROTOBUF_ATTRIBUTE_INIT_PRIORITY1
const ::_pbi::TcParseTable<3, 6, 1, 0, 2> BrakeSystemsStatus::_table_ = {
  {
    PROTOBUF_FIELD_OFFSET(BrakeSystemsStatus, _impl_._has_bits_),
    0, // no _extensions_
    6, 56,  // max_field_number, fast_idx_mask
    offsetof(decltype(_table_), field_lookup_table),
    4294967232,  // skipmap
    offsetof(decltype(_table_), field_entries),
    6,  // num_field_entries
    1,  // num_aux_entries
    offsetof(decltype(_table_), aux_entries),
    &_BrakeSystemsStatus_default_instance_._instance,
    ::_pbi::TcParser::GenericFallback,  // fallback
  }, {{
    {::_pbi::TcParser::MiniParse, {}},
    // .sensoris.protobuf.types.base.EventEnvelope envelope = 1;
    {::_pbi::TcParser::FastMtS1,
     {10, 0, 0, PROTOBUF_FIELD_OFFSET(BrakeSystemsStatus, _impl_.envelope_)}},
    // .sensoris.protobuf.types.base.SystemStatus abs_status = 2;
    {::_pbi::TcParser::SingularVarintNoZag1<::uint32_t, offsetof(BrakeSystemsStatus, _impl_.abs_status_), 63>(),
     {16, 63, 0, PROTOBUF_FIELD_OFFSET(BrakeSystemsStatus, _impl_.abs_status_)}},
    // .sensoris.protobuf.types.base.SystemStatus esc_status = 3;
    {::_pbi::TcParser::SingularVarintNoZag1<::uint32_t, offsetof(BrakeSystemsStatus, _impl_.esc_status_), 63>(),
     {24, 63, 0, PROTOBUF_FIELD_OFFSET(BrakeSystemsStatus, _impl_.esc_status_)}},
    // .sensoris.protobuf.types.base.SystemStatus tcs_status = 4;
    {::_pbi::TcParser::SingularVarintNoZag1<::uint32_t, offsetof(BrakeSystemsStatus, _impl_.tcs_status_), 63>(),
     {32, 63, 0, PROTOBUF_FIELD_OFFSET(BrakeSystemsStatus, _impl_.tcs_status_)}},
    // .sensoris.protobuf.types.base.SystemStatus ebd_status = 5;
    {::_pbi::TcParser::SingularVarintNoZag1<::uint32_t, offsetof(BrakeSystemsStatus, _impl_.ebd_status_), 63>(),
     {40, 63, 0, PROTOBUF_FIELD_OFFSET(BrakeSystemsStatus, _impl_.ebd_status_)}},
    // .sensoris.protobuf.types.base.SystemStatus eba_status = 6;
    {::_pbi::TcParser::SingularVarintNoZag1<::uint32_t, offsetof(BrakeSystemsStatus, _impl_.eba_status_), 63>(),
     {48, 63, 0, PROTOBUF_FIELD_OFFSET(BrakeSystemsStatus, _impl_.eba_status_)}},
    {::_pbi::TcParser::MiniParse, {}},
  }}, {{
    65535, 65535
  }}, {{
    // .sensoris.protobuf.types.base.EventEnvelope envelope = 1;
    {PROTOBUF_FIELD_OFFSET(BrakeSystemsStatus, _impl_.envelope_), _Internal::kHasBitsOffset + 0, 0,
    (0 | ::_fl::kFcOptional | ::_fl::kMessage | ::_fl::kTvTable)},
    // .sensoris.protobuf.types.base.SystemStatus abs_status = 2;
    {PROTOBUF_FIELD_OFFSET(BrakeSystemsStatus, _impl_.abs_status_), -1, 0,
    (0 | ::_fl::kFcSingular | ::_fl::kOpenEnum)},
    // .sensoris.protobuf.types.base.SystemStatus esc_status = 3;
    {PROTOBUF_FIELD_OFFSET(BrakeSystemsStatus, _impl_.esc_status_), -1, 0,
    (0 | ::_fl::kFcSingular | ::_fl::kOpenEnum)},
    // .sensoris.protobuf.types.base.SystemStatus tcs_status = 4;
    {PROTOBUF_FIELD_OFFSET(BrakeSystemsStatus, _impl_.tcs_status_), -1, 0,
    (0 | ::_fl::kFcSingular | ::_fl::kOpenEnum)},
    // .sensoris.protobuf.types.base.SystemStatus ebd_status = 5;
    {PROTOBUF_FIELD_OFFSET(BrakeSystemsStatus, _impl_.ebd_status_), -1, 0,
    (0 | ::_fl::kFcSingular | ::_fl::kOpenEnum)},
    // .sensoris.protobuf.types.base.SystemStatus eba_status = 6;
    {PROTOBUF_FIELD_OFFSET(BrakeSystemsStatus, _impl_.eba_status_), -1, 0,
    (0 | ::_fl::kFcSingular | ::_fl::kOpenEnum)},
  }}, {{
    {::_pbi::TcParser::GetTable<::sensoris::protobuf::types::base::EventEnvelope>()},
  }}, {{
  }},
};

::uint8_t* BrakeSystemsStatus::_InternalSerialize(
    ::uint8_t* target,
    ::google::protobuf::io::EpsCopyOutputStream* stream) const {
  // @@protoc_insertion_point(serialize_to_array_start:sensoris.protobuf.categories.brake.BrakeSystemsStatus)
  ::uint32_t cached_has_bits = 0;
  (void)cached_has_bits;

  cached_has_bits = _impl_._has_bits_[0];
  // .sensoris.protobuf.types.base.EventEnvelope envelope = 1;
  if (cached_has_bits & 0x00000001u) {
    target = ::google::protobuf::internal::WireFormatLite::InternalWriteMessage(
        1, _Internal::envelope(this),
        _Internal::envelope(this).GetCachedSize(), target, stream);
  }

  // .sensoris.protobuf.types.base.SystemStatus abs_status = 2;
  if (this->_internal_abs_status() != 0) {
    target = stream->EnsureSpace(target);
    target = ::_pbi::WireFormatLite::WriteEnumToArray(
        2, this->_internal_abs_status(), target);
  }

  // .sensoris.protobuf.types.base.SystemStatus esc_status = 3;
  if (this->_internal_esc_status() != 0) {
    target = stream->EnsureSpace(target);
    target = ::_pbi::WireFormatLite::WriteEnumToArray(
        3, this->_internal_esc_status(), target);
  }

  // .sensoris.protobuf.types.base.SystemStatus tcs_status = 4;
  if (this->_internal_tcs_status() != 0) {
    target = stream->EnsureSpace(target);
    target = ::_pbi::WireFormatLite::WriteEnumToArray(
        4, this->_internal_tcs_status(), target);
  }

  // .sensoris.protobuf.types.base.SystemStatus ebd_status = 5;
  if (this->_internal_ebd_status() != 0) {
    target = stream->EnsureSpace(target);
    target = ::_pbi::WireFormatLite::WriteEnumToArray(
        5, this->_internal_ebd_status(), target);
  }

  // .sensoris.protobuf.types.base.SystemStatus eba_status = 6;
  if (this->_internal_eba_status() != 0) {
    target = stream->EnsureSpace(target);
    target = ::_pbi::WireFormatLite::WriteEnumToArray(
        6, this->_internal_eba_status(), target);
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    target =
        ::_pbi::WireFormat::InternalSerializeUnknownFieldsToArray(
            _internal_metadata_.unknown_fields<::google::protobuf::UnknownFieldSet>(::google::protobuf::UnknownFieldSet::default_instance), target, stream);
  }
  // @@protoc_insertion_point(serialize_to_array_end:sensoris.protobuf.categories.brake.BrakeSystemsStatus)
  return target;
}

::size_t BrakeSystemsStatus::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:sensoris.protobuf.categories.brake.BrakeSystemsStatus)
  ::size_t total_size = 0;

  ::uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  // .sensoris.protobuf.types.base.EventEnvelope envelope = 1;
  cached_has_bits = _impl_._has_bits_[0];
  if (cached_has_bits & 0x00000001u) {
    total_size +=
        1 + ::google::protobuf::internal::WireFormatLite::MessageSize(*_impl_.envelope_);
  }

  // .sensoris.protobuf.types.base.SystemStatus abs_status = 2;
  if (this->_internal_abs_status() != 0) {
    total_size += 1 +
                  ::_pbi::WireFormatLite::EnumSize(this->_internal_abs_status());
  }

  // .sensoris.protobuf.types.base.SystemStatus esc_status = 3;
  if (this->_internal_esc_status() != 0) {
    total_size += 1 +
                  ::_pbi::WireFormatLite::EnumSize(this->_internal_esc_status());
  }

  // .sensoris.protobuf.types.base.SystemStatus tcs_status = 4;
  if (this->_internal_tcs_status() != 0) {
    total_size += 1 +
                  ::_pbi::WireFormatLite::EnumSize(this->_internal_tcs_status());
  }

  // .sensoris.protobuf.types.base.SystemStatus ebd_status = 5;
  if (this->_internal_ebd_status() != 0) {
    total_size += 1 +
                  ::_pbi::WireFormatLite::EnumSize(this->_internal_ebd_status());
  }

  // .sensoris.protobuf.types.base.SystemStatus eba_status = 6;
  if (this->_internal_eba_status() != 0) {
    total_size += 1 +
                  ::_pbi::WireFormatLite::EnumSize(this->_internal_eba_status());
  }

  return MaybeComputeUnknownFieldsSize(total_size, &_impl_._cached_size_);
}

const ::google::protobuf::Message::ClassData BrakeSystemsStatus::_class_data_ = {
    BrakeSystemsStatus::MergeImpl,
    nullptr,  // OnDemandRegisterArenaDtor
};
const ::google::protobuf::Message::ClassData* BrakeSystemsStatus::GetClassData() const {
  return &_class_data_;
}

void BrakeSystemsStatus::MergeImpl(::google::protobuf::Message& to_msg, const ::google::protobuf::Message& from_msg) {
  auto* const _this = static_cast<BrakeSystemsStatus*>(&to_msg);
  auto& from = static_cast<const BrakeSystemsStatus&>(from_msg);
  // @@protoc_insertion_point(class_specific_merge_from_start:sensoris.protobuf.categories.brake.BrakeSystemsStatus)
  ABSL_DCHECK_NE(&from, _this);
  ::uint32_t cached_has_bits = 0;
  (void) cached_has_bits;

  if ((from._impl_._has_bits_[0] & 0x00000001u) != 0) {
    _this->_internal_mutable_envelope()->::sensoris::protobuf::types::base::EventEnvelope::MergeFrom(
        from._internal_envelope());
  }
  if (from._internal_abs_status() != 0) {
    _this->_internal_set_abs_status(from._internal_abs_status());
  }
  if (from._internal_esc_status() != 0) {
    _this->_internal_set_esc_status(from._internal_esc_status());
  }
  if (from._internal_tcs_status() != 0) {
    _this->_internal_set_tcs_status(from._internal_tcs_status());
  }
  if (from._internal_ebd_status() != 0) {
    _this->_internal_set_ebd_status(from._internal_ebd_status());
  }
  if (from._internal_eba_status() != 0) {
    _this->_internal_set_eba_status(from._internal_eba_status());
  }
  _this->_internal_metadata_.MergeFrom<::google::protobuf::UnknownFieldSet>(from._internal_metadata_);
}

void BrakeSystemsStatus::CopyFrom(const BrakeSystemsStatus& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:sensoris.protobuf.categories.brake.BrakeSystemsStatus)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

PROTOBUF_NOINLINE bool BrakeSystemsStatus::IsInitialized() const {
  return true;
}

::_pbi::CachedSize* BrakeSystemsStatus::AccessCachedSize() const {
  return &_impl_._cached_size_;
}
void BrakeSystemsStatus::InternalSwap(BrakeSystemsStatus* PROTOBUF_RESTRICT other) {
  using std::swap;
  _internal_metadata_.InternalSwap(&other->_internal_metadata_);
  swap(_impl_._has_bits_[0], other->_impl_._has_bits_[0]);
  ::google::protobuf::internal::memswap<
      PROTOBUF_FIELD_OFFSET(BrakeSystemsStatus, _impl_.eba_status_)
      + sizeof(BrakeSystemsStatus::_impl_.eba_status_)
      - PROTOBUF_FIELD_OFFSET(BrakeSystemsStatus, _impl_.envelope_)>(
          reinterpret_cast<char*>(&_impl_.envelope_),
          reinterpret_cast<char*>(&other->_impl_.envelope_));
}

::google::protobuf::Metadata BrakeSystemsStatus::GetMetadata() const {
  return ::_pbi::AssignDescriptors(
      &descriptor_table_sensoris_2fprotobuf_2fcategories_2fbrake_2eproto_getter, &descriptor_table_sensoris_2fprotobuf_2fcategories_2fbrake_2eproto_once,
      file_level_metadata_sensoris_2fprotobuf_2fcategories_2fbrake_2eproto[0]);
}
// ===================================================================

class BrakeCategory::_Internal {
 public:
  using HasBits = decltype(std::declval<BrakeCategory>()._impl_._has_bits_);
  static constexpr ::int32_t kHasBitsOffset =
    8 * PROTOBUF_FIELD_OFFSET(BrakeCategory, _impl_._has_bits_);
  static const ::sensoris::protobuf::types::base::CategoryEnvelope& envelope(const BrakeCategory* msg);
  static void set_has_envelope(HasBits* has_bits) {
    (*has_bits)[0] |= 1u;
  }
};

const ::sensoris::protobuf::types::base::CategoryEnvelope& BrakeCategory::_Internal::envelope(const BrakeCategory* msg) {
  return *msg->_impl_.envelope_;
}
void BrakeCategory::clear_envelope() {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  if (_impl_.envelope_ != nullptr) _impl_.envelope_->Clear();
  _impl_._has_bits_[0] &= ~0x00000001u;
}
BrakeCategory::BrakeCategory(::google::protobuf::Arena* arena)
    : ::google::protobuf::Message(arena) {
  SharedCtor(arena);
  // @@protoc_insertion_point(arena_constructor:sensoris.protobuf.categories.brake.BrakeCategory)
}
inline PROTOBUF_NDEBUG_INLINE BrakeCategory::Impl_::Impl_(
    ::google::protobuf::internal::InternalVisibility visibility, ::google::protobuf::Arena* arena,
    const Impl_& from)
      : _has_bits_{from._has_bits_},
        _cached_size_{0},
        brake_systems_status_{visibility, arena, from.brake_systems_status_} {}

BrakeCategory::BrakeCategory(
    ::google::protobuf::Arena* arena,
    const BrakeCategory& from)
    : ::google::protobuf::Message(arena) {
  BrakeCategory* const _this = this;
  (void)_this;
  _internal_metadata_.MergeFrom<::google::protobuf::UnknownFieldSet>(
      from._internal_metadata_);
  new (&_impl_) Impl_(internal_visibility(), arena, from._impl_);
  ::uint32_t cached_has_bits = _impl_._has_bits_[0];
  _impl_.envelope_ = (cached_has_bits & 0x00000001u)
                ? CreateMaybeMessage<::sensoris::protobuf::types::base::CategoryEnvelope>(arena, *from._impl_.envelope_)
                : nullptr;

  // @@protoc_insertion_point(copy_constructor:sensoris.protobuf.categories.brake.BrakeCategory)
}
inline PROTOBUF_NDEBUG_INLINE BrakeCategory::Impl_::Impl_(
    ::google::protobuf::internal::InternalVisibility visibility,
    ::google::protobuf::Arena* arena)
      : _cached_size_{0},
        brake_systems_status_{visibility, arena} {}

inline void BrakeCategory::SharedCtor(::_pb::Arena* arena) {
  new (&_impl_) Impl_(internal_visibility(), arena);
  _impl_.envelope_ = {};
}
BrakeCategory::~BrakeCategory() {
  // @@protoc_insertion_point(destructor:sensoris.protobuf.categories.brake.BrakeCategory)
  _internal_metadata_.Delete<::google::protobuf::UnknownFieldSet>();
  SharedDtor();
}
inline void BrakeCategory::SharedDtor() {
  ABSL_DCHECK(GetArena() == nullptr);
  delete _impl_.envelope_;
  _impl_.~Impl_();
}

PROTOBUF_NOINLINE void BrakeCategory::Clear() {
// @@protoc_insertion_point(message_clear_start:sensoris.protobuf.categories.brake.BrakeCategory)
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  ::uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  _impl_.brake_systems_status_.Clear();
  cached_has_bits = _impl_._has_bits_[0];
  if (cached_has_bits & 0x00000001u) {
    ABSL_DCHECK(_impl_.envelope_ != nullptr);
    _impl_.envelope_->Clear();
  }
  _impl_._has_bits_.Clear();
  _internal_metadata_.Clear<::google::protobuf::UnknownFieldSet>();
}

const char* BrakeCategory::_InternalParse(
    const char* ptr, ::_pbi::ParseContext* ctx) {
  ptr = ::_pbi::TcParser::ParseLoop(this, ptr, ctx, &_table_.header);
  return ptr;
}


PROTOBUF_CONSTINIT PROTOBUF_ATTRIBUTE_INIT_PRIORITY1
const ::_pbi::TcParseTable<1, 2, 2, 0, 2> BrakeCategory::_table_ = {
  {
    PROTOBUF_FIELD_OFFSET(BrakeCategory, _impl_._has_bits_),
    0, // no _extensions_
    2, 8,  // max_field_number, fast_idx_mask
    offsetof(decltype(_table_), field_lookup_table),
    4294967292,  // skipmap
    offsetof(decltype(_table_), field_entries),
    2,  // num_field_entries
    2,  // num_aux_entries
    offsetof(decltype(_table_), aux_entries),
    &_BrakeCategory_default_instance_._instance,
    ::_pbi::TcParser::GenericFallback,  // fallback
  }, {{
    // repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;
    {::_pbi::TcParser::FastMtR1,
     {18, 63, 1, PROTOBUF_FIELD_OFFSET(BrakeCategory, _impl_.brake_systems_status_)}},
    // .sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;
    {::_pbi::TcParser::FastMtS1,
     {10, 0, 0, PROTOBUF_FIELD_OFFSET(BrakeCategory, _impl_.envelope_)}},
  }}, {{
    65535, 65535
  }}, {{
    // .sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;
    {PROTOBUF_FIELD_OFFSET(BrakeCategory, _impl_.envelope_), _Internal::kHasBitsOffset + 0, 0,
    (0 | ::_fl::kFcOptional | ::_fl::kMessage | ::_fl::kTvTable)},
    // repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;
    {PROTOBUF_FIELD_OFFSET(BrakeCategory, _impl_.brake_systems_status_), -1, 1,
    (0 | ::_fl::kFcRepeated | ::_fl::kMessage | ::_fl::kTvTable)},
  }}, {{
    {::_pbi::TcParser::GetTable<::sensoris::protobuf::types::base::CategoryEnvelope>()},
    {::_pbi::TcParser::GetTable<::sensoris::protobuf::categories::brake::BrakeSystemsStatus>()},
  }}, {{
  }},
};

::uint8_t* BrakeCategory::_InternalSerialize(
    ::uint8_t* target,
    ::google::protobuf::io::EpsCopyOutputStream* stream) const {
  // @@protoc_insertion_point(serialize_to_array_start:sensoris.protobuf.categories.brake.BrakeCategory)
  ::uint32_t cached_has_bits = 0;
  (void)cached_has_bits;

  cached_has_bits = _impl_._has_bits_[0];
  // .sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;
  if (cached_has_bits & 0x00000001u) {
    target = ::google::protobuf::internal::WireFormatLite::InternalWriteMessage(
        1, _Internal::envelope(this),
        _Internal::envelope(this).GetCachedSize(), target, stream);
  }

  // repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;
  for (unsigned i = 0,
      n = static_cast<unsigned>(this->_internal_brake_systems_status_size()); i < n; i++) {
    const auto& repfield = this->_internal_brake_systems_status().Get(i);
    target = ::google::protobuf::internal::WireFormatLite::
        InternalWriteMessage(2, repfield, repfield.GetCachedSize(), target, stream);
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    target =
        ::_pbi::WireFormat::InternalSerializeUnknownFieldsToArray(
            _internal_metadata_.unknown_fields<::google::protobuf::UnknownFieldSet>(::google::protobuf::UnknownFieldSet::default_instance), target, stream);
  }
  // @@protoc_insertion_point(serialize_to_array_end:sensoris.protobuf.categories.brake.BrakeCategory)
  return target;
}

::size_t BrakeCategory::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:sensoris.protobuf.categories.brake.BrakeCategory)
  ::size_t total_size = 0;

  ::uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  // repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;
  total_size += 1UL * this->_internal_brake_systems_status_size();
  for (const auto& msg : this->_internal_brake_systems_status()) {
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

const ::google::protobuf::Message::ClassData BrakeCategory::_class_data_ = {
    BrakeCategory::MergeImpl,
    nullptr,  // OnDemandRegisterArenaDtor
};
const ::google::protobuf::Message::ClassData* BrakeCategory::GetClassData() const {
  return &_class_data_;
}

void BrakeCategory::MergeImpl(::google::protobuf::Message& to_msg, const ::google::protobuf::Message& from_msg) {
  auto* const _this = static_cast<BrakeCategory*>(&to_msg);
  auto& from = static_cast<const BrakeCategory&>(from_msg);
  // @@protoc_insertion_point(class_specific_merge_from_start:sensoris.protobuf.categories.brake.BrakeCategory)
  ABSL_DCHECK_NE(&from, _this);
  ::uint32_t cached_has_bits = 0;
  (void) cached_has_bits;

  _this->_internal_mutable_brake_systems_status()->MergeFrom(
      from._internal_brake_systems_status());
  if ((from._impl_._has_bits_[0] & 0x00000001u) != 0) {
    _this->_internal_mutable_envelope()->::sensoris::protobuf::types::base::CategoryEnvelope::MergeFrom(
        from._internal_envelope());
  }
  _this->_internal_metadata_.MergeFrom<::google::protobuf::UnknownFieldSet>(from._internal_metadata_);
}

void BrakeCategory::CopyFrom(const BrakeCategory& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:sensoris.protobuf.categories.brake.BrakeCategory)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

PROTOBUF_NOINLINE bool BrakeCategory::IsInitialized() const {
  return true;
}

::_pbi::CachedSize* BrakeCategory::AccessCachedSize() const {
  return &_impl_._cached_size_;
}
void BrakeCategory::InternalSwap(BrakeCategory* PROTOBUF_RESTRICT other) {
  using std::swap;
  _internal_metadata_.InternalSwap(&other->_internal_metadata_);
  swap(_impl_._has_bits_[0], other->_impl_._has_bits_[0]);
  _impl_.brake_systems_status_.InternalSwap(&other->_impl_.brake_systems_status_);
  swap(_impl_.envelope_, other->_impl_.envelope_);
}

::google::protobuf::Metadata BrakeCategory::GetMetadata() const {
  return ::_pbi::AssignDescriptors(
      &descriptor_table_sensoris_2fprotobuf_2fcategories_2fbrake_2eproto_getter, &descriptor_table_sensoris_2fprotobuf_2fcategories_2fbrake_2eproto_once,
      file_level_metadata_sensoris_2fprotobuf_2fcategories_2fbrake_2eproto[1]);
}
// @@protoc_insertion_point(namespace_scope)
}  // namespace brake
}  // namespace categories
}  // namespace protobuf
}  // namespace sensoris
namespace google {
namespace protobuf {
}  // namespace protobuf
}  // namespace google
// @@protoc_insertion_point(global_scope)
#include "google/protobuf/port_undef.inc"
