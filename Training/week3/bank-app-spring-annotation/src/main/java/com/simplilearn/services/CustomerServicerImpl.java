package com.simplilearn.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.model.Customer;
import com.simplilearn.repository.CustomerRepo;

@Service(value ="CustomerServicer")
public class CustomerServicerImpl implements CustomerService {

	@Autowired
	public CustomerRepo  repo;
	public int count = 0;

//	@Autowired
	public CustomerServicerImpl() {
		
	}
	
//	@Autowired
	public CustomerServicerImpl(CustomerRepo temp) {
		System.out.println("Const");
		repo = temp;
	}
	
	@Autowired
	public void setcusRepository(CustomerRepo cus) {
		System.out.println("setter method");
		repo = cus;
	}
	
	
	@Override
	public void add(String fname, String lname) {
		// TODO Auto-generated method stub
		repo.addCus(new Customer(count++,fname,lname));
		
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		repo.removeCustoemr(id);
		
	}

	@Override
	public void update(Integer id, String fname, String lname) {
		// TODO Auto-generated method stub
		repo.updateCustomerStatus(id, fname, lname);
		
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return repo.getAllCustomer();
	}

}
