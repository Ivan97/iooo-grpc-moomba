package tech.iooo.coco.server.configuration;

import net.devh.boot.grpc.server.interceptor.GlobalServerInterceptorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.iooo.coco.core.logging.ServerLogGrpcInterceptor;

/**
 * Created on 2019-01-21 16:25
 *
 * @author <a href="mailto:yangkizhang@gmail.com?subject=iooo-grpc-moomba">Ivan97</a>
 */
@Configuration
public class ApplicationConfiguration {

  @Bean
  public GlobalServerInterceptorConfigurer globalInterceptorConfigurerAdapter() {
    return registry -> registry.addServerInterceptors(new ServerLogGrpcInterceptor());
  }
}
