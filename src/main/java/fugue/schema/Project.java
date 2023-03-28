// automatically generated by the FlatBuffers compiler, do not modify

package fugue.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.BooleanVector;
import com.google.flatbuffers.ByteVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.DoubleVector;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.FloatVector;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.LongVector;
import com.google.flatbuffers.ShortVector;
import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Struct;
import com.google.flatbuffers.Table;
import com.google.flatbuffers.UnionVector;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class Project extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static Project getRootAsProject(ByteBuffer _bb) { return getRootAsProject(_bb, new Project()); }
  public static Project getRootAsProject(ByteBuffer _bb, Project obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public static boolean ProjectBufferHasIdentifier(ByteBuffer _bb) { return __has_identifier(_bb, "FuDb"); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Project __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public fugue.schema.Architecture architectures(int j) { return architectures(new fugue.schema.Architecture(), j); }
  public fugue.schema.Architecture architectures(fugue.schema.Architecture obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int architecturesLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public fugue.schema.Architecture.Vector architecturesVector() { return architecturesVector(new fugue.schema.Architecture.Vector()); }
  public fugue.schema.Architecture.Vector architecturesVector(fugue.schema.Architecture.Vector obj) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public fugue.schema.Segment segments(int j) { return segments(new fugue.schema.Segment(), j); }
  public fugue.schema.Segment segments(fugue.schema.Segment obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int segmentsLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public fugue.schema.Segment.Vector segmentsVector() { return segmentsVector(new fugue.schema.Segment.Vector()); }
  public fugue.schema.Segment.Vector segmentsVector(fugue.schema.Segment.Vector obj) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public fugue.schema.Function functions(int j) { return functions(new fugue.schema.Function(), j); }
  public fugue.schema.Function functions(fugue.schema.Function obj, int j) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int functionsLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public fugue.schema.Function.Vector functionsVector() { return functionsVector(new fugue.schema.Function.Vector()); }
  public fugue.schema.Function.Vector functionsVector(fugue.schema.Function.Vector obj) { int o = __offset(8); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public fugue.schema.Metadata metadata() { return metadata(new fugue.schema.Metadata()); }
  public fugue.schema.Metadata metadata(fugue.schema.Metadata obj) { int o = __offset(10); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public int auxiliary(int j) { int o = __offset(12); return o != 0 ? bb.get(__vector(o) + j * 1) & 0xFF : 0; }
  public int auxiliaryLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }
  public ByteVector auxiliaryVector() { return auxiliaryVector(new ByteVector()); }
  public ByteVector auxiliaryVector(ByteVector obj) { int o = __offset(12); return o != 0 ? obj.__assign(__vector(o), bb) : null; }
  public ByteBuffer auxiliaryAsByteBuffer() { return __vector_as_bytebuffer(12, 1); }
  public ByteBuffer auxiliaryInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 12, 1); }

  public static int createProject(FlatBufferBuilder builder,
      int architecturesOffset,
      int segmentsOffset,
      int functionsOffset,
      int metadataOffset,
      int auxiliaryOffset) {
    builder.startTable(5);
    Project.addAuxiliary(builder, auxiliaryOffset);
    Project.addMetadata(builder, metadataOffset);
    Project.addFunctions(builder, functionsOffset);
    Project.addSegments(builder, segmentsOffset);
    Project.addArchitectures(builder, architecturesOffset);
    return Project.endProject(builder);
  }

  public static void startProject(FlatBufferBuilder builder) { builder.startTable(5); }
  public static void addArchitectures(FlatBufferBuilder builder, int architecturesOffset) { builder.addOffset(0, architecturesOffset, 0); }
  public static int createArchitecturesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startArchitecturesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addSegments(FlatBufferBuilder builder, int segmentsOffset) { builder.addOffset(1, segmentsOffset, 0); }
  public static int createSegmentsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startSegmentsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addFunctions(FlatBufferBuilder builder, int functionsOffset) { builder.addOffset(2, functionsOffset, 0); }
  public static int createFunctionsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startFunctionsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addMetadata(FlatBufferBuilder builder, int metadataOffset) { builder.addOffset(3, metadataOffset, 0); }
  public static void addAuxiliary(FlatBufferBuilder builder, int auxiliaryOffset) { builder.addOffset(4, auxiliaryOffset, 0); }
  public static int createAuxiliaryVector(FlatBufferBuilder builder, byte[] data) { return builder.createByteVector(data); }
  public static int createAuxiliaryVector(FlatBufferBuilder builder, ByteBuffer data) { return builder.createByteVector(data); }
  public static void startAuxiliaryVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static int endProject(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishProjectBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset, "FuDb"); }
  public static void finishSizePrefixedProjectBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset, "FuDb"); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Project get(int j) { return get(new Project(), j); }
    public Project get(Project obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

