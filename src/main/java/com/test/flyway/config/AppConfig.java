package com.test.flyway.config;

import com.test.flyway.api.PizzaController;
import com.test.flyway.service.NonVegPizza;
import com.test.flyway.service.Pizza;
import com.test.flyway.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "vegPizzaBean")//tells spring IOC container managing object of this class
    public Pizza vegPizza(){
        return new VegPizza();
    }

    @Bean(name = "nonVegPizzaBean")
    public Pizza nonVegPizza(){
        return new NonVegPizza();
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public PizzaController pizzaController() {
        return new PizzaController(nonVegPizza());
    }


}
