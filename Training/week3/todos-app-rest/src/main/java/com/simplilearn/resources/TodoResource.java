package com.simplilearn.resources;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
}