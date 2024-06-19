package com.simplilearn.model;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simplilearn.model.Todo;
import com.simplilearn.repository.InMemoryTodoRepository;
import com.simplilearn.service.TodoService;
import com.simplilearn.service.TodoServiceImpl;

public class Program {

	public static void main(String[] args) {
		
//		TodoService todoService = new TodoServiceImpl(new InMemoryTodoRepository());
		
		
		ApplicationContext spring_container = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TodoService todoService = spring_container.getBean("todoServiceSetter",TodoService.class);
			
		System.out.println("Adding Todos...");
		todoService.addTodo("Learn  Java");
		todoService.addTodo("Build a Todo Application");
		todoService.addTodo("Refactor code using spring and spring boot");
		
		System.out.println("\n All Todos");
		displayTodos(todoService.getAllTodos());
		
		System.out.println("\n Marking Todo with ID 1 as completed");
		todoService.markCompleted(1);

		System.out.println("\n All Todos after update:");
		displayTodos(todoService.getAllTodos());
		
		System.out.println("\n Removing Todo with  id 2 ...");
		todoService.removeTodo(2);

		System.out.println("\n All Todos after removal:");
		displayTodos(todoService.getAllTodos());
		
		
	}

	private static void displayTodos(List<Todo> allTodos) {
		for ( Todo todo : allTodos ) {
			System.out.println(todo);
		}
		
	}

}
