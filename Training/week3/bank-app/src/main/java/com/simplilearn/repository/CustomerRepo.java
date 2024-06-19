package com.simplilearn.repository;
import java.util.List;

import com.simplilearn.model.Customer;



public interface CustomerRepo {

	
	void addCus(Customer  cus);
	void removeCustoemr(Integer id);
	void updateCustomerStatus(Integer id,String fname,String lname);
	List<Customer> getAllCustomer();
}
