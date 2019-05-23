package service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by haddis on 2019/5/23.
 */
@RestController
@RequestMapping("/service")
public class ServiceController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
