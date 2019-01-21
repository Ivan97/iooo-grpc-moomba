package tech.iooo.coco.client.configuration;

import net.devh.boot.grpc.client.interceptor.GlobalClientInterceptorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.iooo.coco.core.logging.ClientLogGrpcInterceptor;

/**
 * Created on 2019-01-21 16:25
 *
 * @author <a href="mailto:yangkizhang@gmail.com?subject=iooo-grpc-moomba">Ivan97</a>
 */
@Configuration
public class ApplicationConfiguration {

  @Bean
  public GlobalClientInterceptorConfigurer globalInterceptorConfigurerAdapter() {
    return registry -> registry.addClientInterceptors(new ClientLogGrpcInterceptor());
  }
}
