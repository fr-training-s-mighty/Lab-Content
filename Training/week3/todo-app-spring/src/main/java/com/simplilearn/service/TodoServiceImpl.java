package com.simplilearn.service;



import java.util.List;

import com.simplilearn.model.Todo;
import com.simplilearn.respository.TodoRepository;

public class TodoServiceImpl implements TodoService{
	
	// service depends on repository
	private TodoRepository todoRepository; 
	
	
	//code change for setter injection
	// default constructor
	public TodoServiceImpl() {
		
	}
	
	// called by spring container to inject todoRepository
	public void setTodoRepository(TodoRepository todoRepository) {
		System.out.println("setter method called by spring container to inject todoRepository");
		this.todoRepository = todoRepository;
	}
	
	public TodoServiceImpl(TodoRepository todoRepository) {
		System.out.println("constructor called by spring container to inject todoRepository");
		this.todoRepository = todoRepository;
	}
	

	@Override
	public void addTodo(String description) {
		Todo todo = new Todo(0, description, false);
		todoRepository.addTodo(todo);
	}

	@Override
	public void removeTodo(Integer id) {
		todoRepository.removeTodo(id);
		
	}

	@Override
	public void markCompleted(Integer id) {
		todoRepository.updateTodoStatus(id, true);
	}

	@Override
	public List<Todo> getAllTodos() {
		return todoRepository.getAllTodos();
	}

}
