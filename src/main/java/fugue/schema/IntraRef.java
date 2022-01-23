// automatically generated by the FlatBuffers compiler, do not modify

package fugue.schema;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class IntraRef extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static IntraRef getRootAsIntraRef(ByteBuffer _bb) { return getRootAsIntraRef(_bb, new IntraRef()); }
  public static IntraRef getRootAsIntraRef(ByteBuffer _bb, IntraRef obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public IntraRef __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long source() { int o = __offset(4); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public long target() { int o = __offset(6); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public long function() { int o = __offset(8); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public int auxiliary(int j) { int o = __offset(10); return o != 0 ? bb.get(__vector(o) + j * 1) & 0xFF : 0; }
  public int auxiliaryLength() { int o = __offset(10); return o != 0 ? __vector_len(o) : 0; }
  public ByteVector auxiliaryVector() { return auxiliaryVector(new ByteVector()); }
  public ByteVector auxiliaryVector(ByteVector obj) { int o = __offset(10); return o != 0 ? obj.__assign(__vector(o), bb) : null; }
  public ByteBuffer auxiliaryAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public ByteBuffer auxiliaryInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 10, 1); }

  public static int createIntraRef(FlatBufferBuilder builder,
      long source,
      long target,
      long function,
      int auxiliaryOffset) {
    builder.startTable(4);
    IntraRef.addTarget(builder, target);
    IntraRef.addSource(builder, source);
    IntraRef.addAuxiliary(builder, auxiliaryOffset);
    IntraRef.addFunction(builder, function);
    return IntraRef.endIntraRef(builder);
  }

  public static void startIntraRef(FlatBufferBuilder builder) { builder.startTable(4); }
  public static void addSource(FlatBufferBuilder builder, long source) { builder.addLong(0, source, 0L); }
  public static void addTarget(FlatBufferBuilder builder, long target) { builder.addLong(1, target, 0L); }
  public static void addFunction(FlatBufferBuilder builder, long function) { builder.addInt(2, (int)function, (int)0L); }
  public static void addAuxiliary(FlatBufferBuilder builder, int auxiliaryOffset) { builder.addOffset(3, auxiliaryOffset, 0); }
  public static int createAuxiliaryVector(FlatBufferBuilder builder, byte[] data) { return builder.createByteVector(data); }
  public static int createAuxiliaryVector(FlatBufferBuilder builder, ByteBuffer data) { return builder.createByteVector(data); }
  public static void startAuxiliaryVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static int endIntraRef(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public IntraRef get(int j) { return get(new IntraRef(), j); }
    public IntraRef get(IntraRef obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}
