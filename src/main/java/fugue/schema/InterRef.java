// automatically generated by the FlatBuffers compiler, do not modify

package fugue.schema;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class InterRef extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static InterRef getRootAsInterRef(ByteBuffer _bb) { return getRootAsInterRef(_bb, new InterRef()); }
  public static InterRef getRootAsInterRef(ByteBuffer _bb, InterRef obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public InterRef __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long address() { int o = __offset(4); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public long source() { int o = __offset(6); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 4294967295L; }
  public long target() { int o = __offset(8); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public boolean call() { int o = __offset(10); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public int auxiliary(int j) { int o = __offset(12); return o != 0 ? bb.get(__vector(o) + j * 1) & 0xFF : 0; }
  public int auxiliaryLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }
  public ByteVector auxiliaryVector() { return auxiliaryVector(new ByteVector()); }
  public ByteVector auxiliaryVector(ByteVector obj) { int o = __offset(12); return o != 0 ? obj.__assign(__vector(o), bb) : null; }
  public ByteBuffer auxiliaryAsByteBuffer() { return __vector_as_bytebuffer(12, 1); }
  public ByteBuffer auxiliaryInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 12, 1); }

  public static int createInterRef(FlatBufferBuilder builder,
      long address,
      long source,
      long target,
      boolean call,
      int auxiliaryOffset) {
    builder.startTable(5);
    InterRef.addAddress(builder, address);
    InterRef.addAuxiliary(builder, auxiliaryOffset);
    InterRef.addTarget(builder, target);
    InterRef.addSource(builder, source);
    InterRef.addCall(builder, call);
    return InterRef.endInterRef(builder);
  }

  public static void startInterRef(FlatBufferBuilder builder) { builder.startTable(5); }
  public static void addAddress(FlatBufferBuilder builder, long address) { builder.addLong(0, address, 0L); }
  public static void addSource(FlatBufferBuilder builder, long source) { builder.addInt(1, (int)source, (int)4294967295L); }
  public static void addTarget(FlatBufferBuilder builder, long target) { builder.addInt(2, (int)target, (int)0L); }
  public static void addCall(FlatBufferBuilder builder, boolean call) { builder.addBoolean(3, call, false); }
  public static void addAuxiliary(FlatBufferBuilder builder, int auxiliaryOffset) { builder.addOffset(4, auxiliaryOffset, 0); }
  public static int createAuxiliaryVector(FlatBufferBuilder builder, byte[] data) { return builder.createByteVector(data); }
  public static int createAuxiliaryVector(FlatBufferBuilder builder, ByteBuffer data) { return builder.createByteVector(data); }
  public static void startAuxiliaryVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static int endInterRef(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public InterRef get(int j) { return get(new InterRef(), j); }
    public InterRef get(InterRef obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}
