package com.test.flyway.value;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ValueAnnotation {
    @Value("Default name ")
    private String defaultValue;

    @Value("${config.internal.mail-host:}")
    private String host;

    @Value("${config.internal.mail-email:}")
    private String email;

    @Value("${config.internal.mail-password:}")
    private String password;

    @Value("${java.home:}")
    private String javaHome;

    @Value("${HOME:}")
    private String homeDir;

}
