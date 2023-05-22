package com.test.flyway;

import com.test.flyway.api.MyController;
import com.test.flyway.api.PizzaController;
import com.test.flyway.propertySource.PropertySourceDemo;
import com.test.flyway.util.ApplicationContextProvider;
import com.test.flyway.lazy.LazyLoader;
import com.test.flyway.scope.PrototypeClass;
import com.test.flyway.scope.SingletonClass;
import com.test.flyway.service.MyService;
import com.test.flyway.value.ValueAnnotation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlywayApplication {

	public static void main(String[] args) {
		var context  = SpringApplication.run(FlywayApplication.class, args);
//		PizzaController pizzaController = context.getBean(PizzaController.class);
		PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
		System.out.println(pizzaController.getPizza());

//		VegPizza vegPizza = context.getBean(VegPizza.class);
//		VegPizza vegPizza = (VegPizza) context.getBean("vegPizzaBean");
//		System.out.println("Java based configuration using @Bean: "+vegPizza.getPizza());

		MyController myController = ApplicationContextProvider.getBean("myController");
		System.out.println(myController.hello());

		MyService myService = context.getBean(MyService.class);
		System.out.println(myService.hello());

		LazyLoader lazyLoader = context.getBean(LazyLoader.class);


		SingletonClass singletonClass1 = context.getBean(SingletonClass.class);
		System.out.println(singletonClass1.hashCode());
		SingletonClass singletonClass2 = context.getBean(SingletonClass.class);
		System.out.println(singletonClass2.hashCode());
		SingletonClass singletonClass3 = context.getBean(SingletonClass.class);
		System.out.println(singletonClass3.hashCode());

		PrototypeClass prototypeClass = context.getBean(PrototypeClass.class);
		System.out.println(prototypeClass.hashCode());
		PrototypeClass prototypeClass2 = context.getBean(PrototypeClass.class);
		System.out.println(prototypeClass2.hashCode());
		PrototypeClass prototypeClass3 = context.getBean(PrototypeClass.class);
		System.out.println(prototypeClass3.hashCode());


		ValueAnnotation valueAnnotation = context.getBean(ValueAnnotation.class);
		System.out.println(valueAnnotation.getDefaultValue()+"\n"+valueAnnotation.getHost()+"\n"+valueAnnotation.getEmail());
		System.out.println("Environment variables "+ valueAnnotation.getJavaHome()+"\n"+"Home directory "+valueAnnotation+ valueAnnotation.getHomeDir());


		PropertySourceDemo pSourceDemo = context.getBean(PropertySourceDemo.class);
		System.out.println(pSourceDemo.getHost()+"\n"+pSourceDemo.getMail());
		System.out.println(pSourceDemo.getAppName()+"\n"+pSourceDemo.getAppDesc());



	}

}
