package com.simplilearn.model;

public class Todo {

	private Integer id;
	private String description;
	private boolean completed;
	
	public Todo(Integer id, String description, boolean completed) {
		super();
		this.id = id;
		this.description = description;
		this.completed = completed;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", description=" + description + ", completed=" + completed + "]";
	}
	

}
