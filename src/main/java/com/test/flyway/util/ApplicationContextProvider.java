package com.test.flyway.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextProvider implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    private ApplicationContextProvider() {
    }

    public static <T> T getBean(Class<T> aClass) {
        return applicationContext.getBean(aClass);
    }

    public static <T> T getBean(String name){
        return (T) applicationContext.getBean(name);
    }
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        if (applicationContext == null) {
            applicationContext = context;
        }

    }
}
