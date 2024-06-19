package com.simplilearn.repository;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.simplilearn.model.Customer;

import java.util.*;


@Repository(value = "todoRepository") 
public class InMemoryCustomerRepo implements CustomerRepo {

	ArrayList<Customer> customers = new ArrayList<Customer>();
	
	@Override
	public void addCus(Customer e) {
		// TODO Auto-generated method stub
		customers.add(e);
		
	}

	@Override
	public void removeCustoemr(Integer id) {
		// TODO Auto-generated method stub
		for(Customer cus:customers) {
			if(cus.getId()==id) {
				customers.remove(cus);
			}
		}
		
	}

	@Override
	public void updateCustomerStatus(Integer id,String fname,String lname) {
		// TODO Auto-generated method stub
		for(Customer cus:customers) {
			if(cus.getId()==id) {
				cus.setFname(fname);
				cus.setLname(lname);
			}
		}
		
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customers;
	}


}
