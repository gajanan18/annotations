package com.test.flyway.api;

import com.fasterxml.jackson.core.JsonParser;
import com.test.flyway.service.Pizza;
import com.test.flyway.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//PizzaController is default bean name which can be changed by putting name after @Component("pizzaBean)
//@Component
//@Component("pizzaBean")
public class PizzaController {
//    @Autowired //Field based dependency injection
    private Pizza pizza;
    //constructor based dependency injection
/*    @Autowired
    public PizzaController(@Qualifier("nonVegPizza") Pizza pizza) {
        this.pizza = pizza;
    }*/

    //primary annotation is used instead @Qualifier.
    @Autowired
    public PizzaController(Pizza pizza) {
        this.pizza = pizza;
    }

    //setter based dependency injection
/*    @Autowired
    public void setVegPizza(VegPizza vegPizza) {
        this.vegPizza = vegPizza;
    }*/

    public String getPizza(){
        return  pizza.getPizza();
    }

    public void init(){
        System.out.println("<<-- Initialisation logic -->>");
    }

    public void destroy() {
        System.out.println("<<-- Destruction logic -->>");
    }

}
