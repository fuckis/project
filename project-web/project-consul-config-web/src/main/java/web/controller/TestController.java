package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.config.Config;

/**
 * Created by haddis on 2019/5/25.
 */
@RestController
@RequestMapping("/config")
public class TestController {

    @Autowired
    private Config config;

    @GetMapping("/get")
    public String testConfig() {
        return config.getTest();
    }
}
