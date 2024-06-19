package com.simplilearn.service;

import java.util.List;

import com.simplilearn.model.Todo;
import com.simplilearn.respository.InMemoryTodoRepository;

public class TodoServicer implements TodoService {
	
	public static void main(String[] args) {
		
		TodoServicer todoService = new TodoServicer();
//		System.out.println("Adding Todos...");
//		todoService.addTodo("Learn  Java");
//		todoService.addTodo("Build a Todo Application");
//		todoService.addTodo("Refactor code using spring and spring boot");
//		
//		System.out.println("\n All Todos");
//		displayTodos(todoService.getAllTodos());
//		
//		System.out.println("\n Marking Todo with ID 1 as completed");
//		todoService.markCompleted(1);
//
//		System.out.println("\n All Todos after update:");
//		displayTodos(todoService.getAllTodos());
//		
//		System.out.println("\n Removing Todo with  id 2 ...");
//		todoService.removeTodo(2);
//
//		System.out.println("\n All Todos after removal:");
//		displayTodos(todoService.getAllTodos());
	}


	@Override
	public void addTodo(Todo todo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTodo(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTodoStatus(Integer id, boolean completed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Todo> getAllTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
