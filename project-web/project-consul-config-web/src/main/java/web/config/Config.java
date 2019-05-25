package web.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by haddis on 2019/5/25.
 */
@ConfigurationProperties(prefix = "config")
public class Config {

    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
