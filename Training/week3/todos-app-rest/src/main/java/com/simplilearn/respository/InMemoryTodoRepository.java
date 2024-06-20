package com.simplilearn.respository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.simplilearn.model.Todo;

@Repository(value = "todoRepository")
public class InMemoryTodoRepository implements TodoRepository{

    ArrayList <Todo> todos= new ArrayList<Todo>();
    public InMemoryTodoRepository() {
        
//        todos.add(new Todo(1, "Learn Spring MVC", false));
//        todos.add(new Todo(2, "Learn  Boot", false));
//        todos.add(new Todo(3, "Learn", false));
    }
	public void addTodo(Todo  todo) {
        todos.add(todo);

	}
	public void removeTodo(Integer id) {
        for(Todo todo:todos){
            if(todo.getId()==id){
                todos.remove(todo);
            }
        }
	}
	public void updateTodoStatus(Integer id,boolean completed) {
        for(Todo todo:todos){
            if(todo.getId()==id){
                todo.setCompleted(completed);
            }
        }
    
	}

	public List<Todo> getAllTodos() {
		return todos;
	}
}
