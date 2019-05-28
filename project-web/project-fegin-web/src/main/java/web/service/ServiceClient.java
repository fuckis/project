package web.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by haddis on 2019/5/28.
 */
@FeignClient(value = "EUREKA-SERVICE",
        fallback = ServiceFallbackClient.class
)
public interface ServiceClient {

    @GetMapping("/service/test")
    String test();
}

@Component
class ServiceFallbackClient implements ServiceClient {

    @Override
    public String test() {
        return "test";
    }
}
