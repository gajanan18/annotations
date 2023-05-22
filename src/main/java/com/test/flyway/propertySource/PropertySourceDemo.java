package com.test.flyway.propertySource;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
//@Getter
public class PropertySourceDemo {

    @Autowired
    private Environment environment;
    //can use either environment variable or value annotation

//    @Value("${gmail.host:}")
    private String host;

//    @Value("${gmail.email:}")
    private String mail;

//    @Value("${gmail.password:}")
    private String password;

//    @Value("${app.name:}")
    private String appName;

//    @Value("${app.description:}")
    private String appDesc;


    public String getHost() {
        return environment.getProperty("gmail.host");
    }

    public String getMail() {
        return environment.getProperty("gmail.email");
    }

    public String getPassword() {
        return environment.getProperty("gmail.password");
    }

    public String getAppName() {
        return environment.getProperty("app.name");
    }

    public String getAppDesc() {
        return environment.getProperty("app.description");
    }
}
