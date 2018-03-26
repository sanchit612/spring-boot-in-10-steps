package com.sancz.springbootbasics.springbootin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//annotation indicates this is a spring context file
//enables something called autoconfiguration
//enables component scan - feature in spring that will automatically start scanning classes in this package
//for any beans. Rest controller is the annotation that is added in bookscontroller which will be added
//as component. Bookscontroller will be registered as bean and will be managed by spring controller
@SpringBootApplication
public class SpringBootIn10StepsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootIn10StepsApplication.class, args);
		
		for(String name : (applicationContext).getBeanDefinitionNames()) {
			System.out.println(name);

		}
	
	
	}
}
