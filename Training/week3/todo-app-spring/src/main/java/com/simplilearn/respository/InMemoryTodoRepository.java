package com.simplilearn.respository;
import java.util.ArrayList;
import java.util.List;

import com.simplilearn.model.Todo;

// InMemory == ArrayList
public class InMemoryTodoRepository implements TodoRepository{
	
	private List<Todo> todos;
	private int nextId;
	
	public InMemoryTodoRepository() {
		this.todos = new ArrayList<Todo>();
		this.nextId = 1;
	}

	public void addTodo(Todo todo) {
		todo.setId(nextId++);
		todos.add(todo);
	}

	public void removeTodo(Integer id) {
		todos.removeIf(todo -> todo.getId().equals(id));
	}

	public void updateTodoStatus(Integer id, boolean completed) {
		for ( Todo todo : todos ) {
			if ( todo.getId().equals(id)) {
				todo.setCompleted(completed);
				break;
			}
		}
		
	}

	public List<Todo> getAllTodos() {
		return todos;
	}

}
