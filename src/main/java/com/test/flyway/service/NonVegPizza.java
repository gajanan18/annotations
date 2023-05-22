package com.test.flyway.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component//when we are using @Bean annotation no need to use @Component nd @Primary
//@Primary
public class NonVegPizza implements Pizza{

    @Override
    public String getPizza() {
        return "Non Veg Pizza";
    }
}
