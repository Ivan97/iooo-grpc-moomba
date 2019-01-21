package tech.iooo.coco.core.logging;

import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created on 2019-01-21 22:47
 *
 * @author <a href="mailto:yangkizhang@gmail.com?subject=iooo-dubbo-moomba">Ivan97</a>
 */
public class ServerLogGrpcInterceptor implements ServerInterceptor {

  private static final Logger logger = LoggerFactory.getLogger(ServerLogGrpcInterceptor.class);

  @Override
  public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> serverCall, Metadata metadata, ServerCallHandler<ReqT, RespT> serverCallHandler) {
    logger.info(serverCall.getMethodDescriptor().getFullMethodName());
    return serverCallHandler.startCall(serverCall, metadata);
  }
}
