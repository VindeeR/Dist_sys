// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service2.proto

package my.project;

public final class Service2 {
  private Service2() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016service2.proto\022\021project.myservice\032\016ser" +
      "vice1.proto2\244\003\n\nMyService2\022S\n\021function1S" +
      "ervice2\022\035.project.myservice.MsgRequest\032\033" +
      ".project.myservice.MsgReply\"\0000\001\022S\n\021funct" +
      "ion2Service2\022\035.project.myservice.MsgRequ" +
      "est\032\033.project.myservice.MsgReply\"\000(\001\022K\n\013" +
      "addLocation\022\035.project.myservice.MsgReque" +
      "st\032\033.project.myservice.MsgReply\"\000\022N\n\016del" +
      "eteLocation\022\035.project.myservice.MsgReque" +
      "st\032\033.project.myservice.MsgReply\"\000\022O\n\013spe" +
      "cialSpot\022\035.project.myservice.MsgRequest\032" +
      "\033.project.myservice.MsgReply\"\000(\0010\001B\014\n\nmy" +
      ".projectb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          my.project.MyProjectProto.getDescriptor(),
        });
    my.project.MyProjectProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
