package tech.iooo.coco.client.service;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
import tech.iooo.coco.api.HelloReply;
import tech.iooo.coco.api.HelloRequest;
import tech.iooo.coco.api.SimpleGrpc;

/**
 * Created on 2019-01-21 16:01
 *
 * @author <a href="mailto:yangkizhang@gmail.com?subject=iooo-grpc-moomba">Ivan97</a>
 */
@Service
public class GrpcClientService {

  @GrpcClient("iooo")
  private SimpleGrpc.SimpleBlockingStub simpleBlockingStub;

  public HelloReply call(String name) {
    return simpleBlockingStub.sayHello(HelloRequest.newBuilder().setName(name).build());
  }
}
