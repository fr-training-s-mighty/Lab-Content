import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simplilearn.services.BankServicer;
import com.simplilearn.services.BankServicerImpl;

public class Program {

	public static void main(String[] args) {
		
	
		ApplicationContext spring_container = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		BankServicer cusService = spring_container.getBean("cusServiceConstructor",BankServicer.class);
		
//		BankServicer cusService = spring_container.getBean("cusRepositoryAuto",BankServicer.class);
//		
		
//		cusService.add("Learn" ,"Java");
		
		System.out.println("\n All Todos");
//		cusService.getAllCustomers();

	}
}
