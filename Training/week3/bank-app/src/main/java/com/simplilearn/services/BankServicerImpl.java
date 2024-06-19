package com.simplilearn.services;
import java.util.List;

import com.simplilearn.model.Customer;
import com.simplilearn.repository.CustomerRepo;

public class BankServicerImpl implements BankServicer {

	public CustomerRepo  repo;
	public int count = 0;
	
	public BankServicerImpl() {
		
	}
	
	public BankServicerImpl(CustomerRepo temp) {
		System.out.println("Const");
		repo = temp;
	}
	
	
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
