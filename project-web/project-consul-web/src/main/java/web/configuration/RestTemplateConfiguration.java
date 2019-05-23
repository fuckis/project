package web.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by haddis on 2019/5/23.
 */
@Configuration
public class RestTemplateConfiguration {

    @Bean
    @LoadBalanced
    public RestTemplate loadBalancedRestTemplate (){
        return new RestTemplate();
    }

    @Bean
    public RestTemplate restTemplate (){
        return new RestTemplate();
    }
}
