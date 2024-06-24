package com.simplilearn.exception;

public class TodoNotFoundException extends RuntimeException {
	
	public TodoNotFoundException ( Integer id ) {
		super("Todo with ID " + id  + "not found");
	}

}