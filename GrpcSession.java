package edu.hawaii.cfht.protos.authorization;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: edu/hawaii/cfht/authorization/authorization_service.proto")
public class SessionGrpc {

  private SessionGrpc() {}

  public static final String SERVICE_NAME = "edu.hawaii.cfht.authorization.Session";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<edu.hawaii.cfht.protos.authorization.CreateSessionRequest,
      edu.hawaii.cfht.protos.authorization.CreateSessionResponse> METHOD_CREATE_SESSION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "edu.hawaii.cfht.authorization.Session", "CreateSession"),
          io.grpc.protobuf.ProtoUtils.marshaller(edu.hawaii.cfht.protos.authorization.CreateSessionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(edu.hawaii.cfht.protos.authorization.CreateSessionResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<edu.hawaii.cfht.protos.authorization.DestroySessionRequest,
      edu.hawaii.cfht.protos.authorization.DestroySessionResponse> METHOD_DESTROY_SESSION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "edu.hawaii.cfht.authorization.Session", "DestroySession"),
          io.grpc.protobuf.ProtoUtils.marshaller(edu.hawaii.cfht.protos.authorization.DestroySessionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(edu.hawaii.cfht.protos.authorization.DestroySessionResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SessionStub newStub(io.grpc.Channel channel) {
    return new SessionStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SessionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SessionBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static SessionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SessionFutureStub(channel);
  }

  /**
   */
  public static abstract class SessionImplBase implements io.grpc.BindableService, CreateSession, DestroySession {

    /**
     * <pre>
     **
     * Provide a valid credential and receive a session which will
     * be used for access to authenticated APIs
     * </pre>
     */
    @java.lang.Override public void createSession(edu.hawaii.cfht.protos.authorization.CreateSessionRequest request,
        io.grpc.stub.StreamObserver<edu.hawaii.cfht.protos.authorization.CreateSessionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_SESSION, responseObserver);
    }

    /**
     * <pre>
     **
     * Logout a user or destroy a one time token
     * </pre>
     */
    @java.lang.Override public void destroySession(edu.hawaii.cfht.protos.authorization.DestroySessionRequest request,
        io.grpc.stub.StreamObserver<edu.hawaii.cfht.protos.authorization.DestroySessionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DESTROY_SESSION, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_SESSION,
            asyncUnaryCall(
              new MethodHandlers<
                edu.hawaii.cfht.protos.authorization.CreateSessionRequest,
                edu.hawaii.cfht.protos.authorization.CreateSessionResponse>(
                  this, METHODID_CREATE_SESSION)))
          .addMethod(
            METHOD_DESTROY_SESSION,
            asyncUnaryCall(
              new MethodHandlers<
                edu.hawaii.cfht.protos.authorization.DestroySessionRequest,
                edu.hawaii.cfht.protos.authorization.DestroySessionResponse>(
                  this, METHODID_DESTROY_SESSION)))
          .build();
    }
  }

  /**
   */
  public static final class SessionStub extends io.grpc.stub.AbstractStub<SessionStub> {
    private SessionStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SessionStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SessionStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * Provide a valid credential and receive a session which will
     * be used for access to authenticated APIs
     * </pre>
     */
    public void createSession(edu.hawaii.cfht.protos.authorization.CreateSessionRequest request,
        io.grpc.stub.StreamObserver<edu.hawaii.cfht.protos.authorization.CreateSessionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_SESSION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * Logout a user or destroy a one time token
     * </pre>
     */
    public void destroySession(edu.hawaii.cfht.protos.authorization.DestroySessionRequest request,
        io.grpc.stub.StreamObserver<edu.hawaii.cfht.protos.authorization.DestroySessionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DESTROY_SESSION, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SessionBlockingStub extends io.grpc.stub.AbstractStub<SessionBlockingStub> {
    private SessionBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SessionBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SessionBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * Provide a valid credential and receive a session which will
     * be used for access to authenticated APIs
     * </pre>
     */
    public edu.hawaii.cfht.protos.authorization.CreateSessionResponse createSession(edu.hawaii.cfht.protos.authorization.CreateSessionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_SESSION, getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * Logout a user or destroy a one time token
     * </pre>
     */
    public edu.hawaii.cfht.protos.authorization.DestroySessionResponse destroySession(edu.hawaii.cfht.protos.authorization.DestroySessionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DESTROY_SESSION, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SessionFutureStub extends io.grpc.stub.AbstractStub<SessionFutureStub> {
    private SessionFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SessionFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SessionFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * Provide a valid credential and receive a session which will
     * be used for access to authenticated APIs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.hawaii.cfht.protos.authorization.CreateSessionResponse> createSession(
        edu.hawaii.cfht.protos.authorization.CreateSessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_SESSION, getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * Logout a user or destroy a one time token
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.hawaii.cfht.protos.authorization.DestroySessionResponse> destroySession(
        edu.hawaii.cfht.protos.authorization.DestroySessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DESTROY_SESSION, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SESSION = 0;
  private static final int METHODID_DESTROY_SESSION = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SessionImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(SessionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SESSION:
          serviceImpl.createSession((edu.hawaii.cfht.protos.authorization.CreateSessionRequest) request,
              (io.grpc.stub.StreamObserver<edu.hawaii.cfht.protos.authorization.CreateSessionResponse>) responseObserver);
          break;
        case METHODID_DESTROY_SESSION:
          serviceImpl.destroySession((edu.hawaii.cfht.protos.authorization.DestroySessionRequest) request,
              (io.grpc.stub.StreamObserver<edu.hawaii.cfht.protos.authorization.DestroySessionResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_CREATE_SESSION,
        METHOD_DESTROY_SESSION);
  }

  public static interface CreateSession {
    /**
     * <pre>
     **
     * Provide a valid credential and receive a session which will
     * be used for access to authenticated APIs
     * </pre>
     */
    public void createSession(edu.hawaii.cfht.protos.authorization.CreateSessionRequest request,
        io.grpc.stub.StreamObserver<edu.hawaii.cfht.protos.authorization.CreateSessionResponse> responseObserver);
  }

  public static interface DestroySession {
    /**
     * <pre>
     **
     * Logout a user or destroy a one time token
     * </pre>
     */
    public void destroySession(edu.hawaii.cfht.protos.authorization.DestroySessionRequest request,
        io.grpc.stub.StreamObserver<edu.hawaii.cfht.protos.authorization.DestroySessionResponse> responseObserver);
  }
}
