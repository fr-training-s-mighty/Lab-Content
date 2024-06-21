package com.simplilearn.service;

import java.util.List;
import java.util.Optional;

import com.simplilearn.model.Todo;

public interface TodoService {
	
	void addTodo(String  todo);
	void removeTodo(Integer id);
	List<Todo> getAllTodos();
	void markCompleted(Integer id);
	boolean findById(Integer id);


}
