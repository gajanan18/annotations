package com.test.flyway.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    public String hello() {
        return "Hello String from controller ";
    }
}
