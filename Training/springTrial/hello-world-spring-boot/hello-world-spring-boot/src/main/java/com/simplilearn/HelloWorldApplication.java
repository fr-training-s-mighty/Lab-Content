
package com.simplilearn;


import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {
	
	public static void main(String[] args) {
		
		
//		ApplicationContext context = new ApplicationContext(context)
		SpringApplication.run(HelloWorldApplication.class,args);
		
	}

}