package com.simplilearn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.simplilearn.model.*;
import com.simplilearn.respository.*;
import com.simplilearn.service.*;

public class AppConfig {

	//NOTE  : Bean Id == Method Name (default) , @Bean(name = "beanName")
	
	
		@Bean
		public TodoRepository todoRepository() {
			return new InMemoryTodoRepository();
		}
		
		@Bean
		public TodoService todoServiceSetter() {
			TodoServiceImpl todoService = new TodoServiceImpl();
			todoService.setTodoRepository(todoRepository());
			return todoService;
		}
		
		@Bean
		public TodoService todoServiceConsrtuctor() {
			return new TodoServiceImpl(todoRepository());
		}
		
		@Bean
		public TodoService todoServiceAuto() {
			return new TodoServiceImpl(todoRepository());
		}

	
}
