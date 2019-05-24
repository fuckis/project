package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by haddis on 2019/5/24.
 */
@Service
@Retryable
public class ServiceClient {

    @Autowired
    private RestTemplate loadBalancedRestTemplate;

    public String test() {
        String result = loadBalancedRestTemplate.getForObject("http://consul-service/service/test", String.class);
        return result;
    }
}
