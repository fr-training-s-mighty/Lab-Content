
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simplilearn.config.AppConfig;
import com.simplilearn.model.Todo;
import com.simplilearn.respository.InMemoryTodoRepository;
import com.simplilearn.service.TodoService;
import com.simplilearn.service.TodoServiceImpl;

public class program {

	public static void main(String[] args) {

		
		
		ApplicationContext spring_container = new AnnotationConfigApplicationContext(AppConfig.class);
		
		TodoService todoServiceSetter = spring_container.getBean("todoServiceSetter",TodoService.class);
		performOperations(todoServiceSetter,"setter injection");
		
		TodoService todoServiceConstructor = spring_container.getBean("todoServiceConstructor",TodoService.class);
		performOperations(todoServiceConstructor, "constructor injection");
		
		
		TodoService todoServiceAuto = spring_container.getBean("todoServiceAuto",TodoService.class);
		performOperations(todoServiceAuto, "Autowiring");
	
		
	}

	private static void performOperations(TodoService todoService, String injectionType) {
		System.out.println("\n" + injectionType  +"\n");
		System.out.println("Adding Todos...");
		todoService.addTodo("Learn  Java");
		todoService.addTodo("Build a Todo Application");
		todoService.addTodo("Refactor code using spring and spring boot");
		
		System.out.println("\n All Todos");
		displayTodos(todoService.getAllTodos());
		
		System.out.println("\n Marking Todo with ID 1 as completed");
		todoService.markCompleted(1);

		System.out.println("\n All Todos after update:");
		displayTodos(todoService.getAllTodos());
		
		System.out.println("\n Removing Todo with  id 2 ...");
//		todoService.removeTodo(2);

		System.out.println("\n All Todos after removal:");
		displayTodos(todoService.getAllTodos());
		
		
	}

	private static void displayTodos(List<Todo> allTodos) {
		for ( Todo todo : allTodos ) {
			System.out.println(todo);
		}
		
	}

}
