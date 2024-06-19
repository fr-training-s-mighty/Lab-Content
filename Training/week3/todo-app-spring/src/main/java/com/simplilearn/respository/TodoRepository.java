package com.simplilearn.respository;

import java.util.List;

import com.simplilearn.model.Todo;

public interface TodoRepository {
	
	void addTodo(Todo  todo);
	void removeTodo(Integer id);
	void updateTodoStatus(Integer id,boolean completed);
	List<Todo> getAllTodos();

}