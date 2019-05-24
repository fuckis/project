package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Retryable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import web.service.ServiceClient;

/**
 * Created by haddis on 2019/5/22.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ServiceClient serviceClient;

    @GetMapping("/get")
    public String get() {
        return serviceClient.test();
    }
}
