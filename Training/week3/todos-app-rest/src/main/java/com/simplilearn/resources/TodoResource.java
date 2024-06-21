package com.simplilearn.resources;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.model.Todo;
import com.simplilearn.service.TodoService;

@RestController
@RequestMapping("/api/todos")
public class TodoResource {

	private final TodoService todoService;

	@Autowired
	public TodoResource(TodoService todoservice) {
		
		this.todoService = todoservice;
	}
	
	@GetMapping
	public List<Todo> getAllTodos(){
		return todoService.getAllTodos();
	}
	
	@GetMapping("/{id}")
	public Todo getTodo(@PathVariable int id) {
		return todoService.getAllTodos().get(id);
	}
	
	@PostMapping
	public void add(@RequestBody Todo theTodo) {
		todoService.addTodo(theTodo.getDescription());
		
	}
//	@PutMapping("/{id}")
//	public ResponseEntity<Todo> updateTodo(@PathVariable Integer id, @RequestBody Todo todo) {
//
//		Optional<Todo> existingTodo = todoService.findById(id);
//		if (existingTodo.isPresent()) {
//			todoService.updateTodoStatus(id, todo.isCompleted());
//		}
//		return ResponseEntity.noContent().build();
//
//	}
//	
	
	

  	@DeleteMapping("/{id}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void deleteTodById(@PathVariable Integer id) {
		boolean existingTodo = todoService.findById(id);
		if ( existingTodo) {
			todoService.removeTodo(id);
		}
	} 

	
}
