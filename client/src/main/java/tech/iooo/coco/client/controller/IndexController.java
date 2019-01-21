package tech.iooo.coco.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tech.iooo.coco.client.service.GrpcClientService;

/**
 * Created on 2019-01-21 16:12
 *
 * @author <a href="mailto:yangkizhang@gmail.com?subject=iooo-grpc-moomba">Ivan97</a>
 */
@RestController
public class IndexController {

  @Autowired
  private GrpcClientService service;

  @GetMapping("/")
  public String index(@RequestParam(value = "name", defaultValue = "iooo") String name) {
    return service.call(name).getMessage();
  }
}
