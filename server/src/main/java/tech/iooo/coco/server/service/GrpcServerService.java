package tech.iooo.coco.server.service;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import tech.iooo.coco.api.HelloReply;
import tech.iooo.coco.api.HelloRequest;
import tech.iooo.coco.api.SimpleGrpc.SimpleImplBase;

/**
 * Created on 2019-01-21 15:59
 *
 * @author <a href="mailto:yangkizhang@gmail.com?subject=iooo-grpc-moomba">Ivan97</a>
 */
@GrpcService
public class GrpcServerService extends SimpleImplBase {

  @Override
  public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
    HelloReply reply = HelloReply.newBuilder().setMessage("[RESPONSE] : Hello ==> " + request.getName() + "!\n").build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }
}
