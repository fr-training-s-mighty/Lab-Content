package com.simplilearn.service;

import java.util.List;

import com.simplilearn.model.Todo;

public interface TodoService {
	
	void addTodo(Todo  todo);
	void removeTodo(Integer id);
	void updateTodoStatus(Integer id,boolean completed);
	List<Todo> getAllTodos();


}
