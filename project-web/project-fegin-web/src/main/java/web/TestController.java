package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ServiceClient;

/**
 * Created by haddis on 2019/5/28.
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
