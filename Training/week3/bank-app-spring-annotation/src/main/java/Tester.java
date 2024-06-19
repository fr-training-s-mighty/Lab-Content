import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simplilearn.config.AppConfig;
import com.simplilearn.model.Customer;
import com.simplilearn.repository.CustomerRepo;
import com.simplilearn.service.CustomerService;
import com.simplilearn.service.CustomerServiceImpl;

public class Tester {

	public static void main(String[] args) {
		
	
		ApplicationContext spring_container = new AnnotationConfigApplicationContext(AppConfig.class);
//		CustomerService cusService = spring_container.getBean("",CustomerService.class);
		
//		performOperations(cusService);
		String[] beans = spring_container.getBeanDefinitionNames();
		for (String bean : beans) {
		  System.out.println(bean);
		}  

	}

	private static void performOperations(CustomerService cusService) {
		
		cusService.add("Learn",  "Java");
		cusService.add("John","Ham");
		cusService.add("V","K");

		System.out.println("\n All Cus");
		displayCust(cusService.getAllCustomers());


		System.out.println("\n Removing Cus with  id 2 ...");
		cusService.remove(2);

		System.out.println("\n All Cust after removal:");
		displayCust(cusService.getAllCustomers());

	}

	private static void displayCust(List<Customer> allCust) {
		for (Customer cus : allCust) {
			System.out.println(cus);
		}

	}
}