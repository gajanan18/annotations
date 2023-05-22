package com.test.flyway.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)//by default spring provides singleton scope even if don't mention scope
public class SingletonClass {
    public SingletonClass(){
        System.out.println("<<-- SingletonClass -->>");
    }
}
