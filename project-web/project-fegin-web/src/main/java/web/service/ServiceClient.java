package web.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.retry.annotation.Retryable;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by haddis on 2019/5/28.
 */
@Retryable
@FeignClient("EUREKA-SERVICE")
public interface ServiceClient {

    @GetMapping("/service/test")
    String test();
}
