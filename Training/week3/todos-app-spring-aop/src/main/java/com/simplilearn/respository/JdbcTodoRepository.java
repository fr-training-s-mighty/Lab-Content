package com.simplilearn.respository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.simplilearn.model.Todo;


@Repository
public class JdbcTodoRepository implements TodoRepository{
	
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JdbcTodoRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addTodo(Todo todo) {
		String sql = "INSERT INTO todos (description,completed) VALUES (?,?)";
		jdbcTemplate.update(sql, todo.getDescription(),todo.isCompleted());
	}

	@Override
	public void removeTodo(Integer id) {
		String sql = "DELETE FROM todos WHERE id = ?";
		jdbcTemplate.update(sql, id);
	}

	@Override
	public void updateTodoStatus(Integer id, boolean completed) {
		String sql = "UPDATE todos SET completed = ? WHERE id = ?";
		jdbcTemplate.update(sql,completed,id);
	}

	@Override
	public List<Todo> getAllTodos() {
		String sql = "SELECT * FROM todos";
		return jdbcTemplate.query(sql, new TodoRowMapper());
	}
	
	private static class TodoRowMapper implements RowMapper<Todo>{

		@Override
		public Todo mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			return new Todo(rs.getInt("id"), rs.getString("description"), rs.getBoolean("completed"));
		}
		
	}

}