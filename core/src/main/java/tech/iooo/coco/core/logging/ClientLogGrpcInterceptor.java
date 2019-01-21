package tech.iooo.coco.core.logging;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.MethodDescriptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created on 2019-01-21 22:47
 *
 * @author <a href="mailto:yangkizhang@gmail.com?subject=iooo-dubbo-moomba">Ivan97</a>
 */
public class ClientLogGrpcInterceptor implements ClientInterceptor {

  private static final Logger logger = LoggerFactory.getLogger(ClientLogGrpcInterceptor.class);

  @Override
  public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method, CallOptions callOptions, Channel next) {
    logger.info(method.getFullMethodName());
    return next.newCall(method, callOptions);
  }
}
