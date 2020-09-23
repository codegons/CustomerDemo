package com.codegons.customer.service;



import java.util.List;
import java.util.Optional;

import com.codegons.customer.model.Customer;
public interface CustomerService {
	

	public List<Customer> getAllCustomer();

	public Optional<Customer> getCustomerById(int id);

	Customer saveAllCustomer(Customer customer);

}
