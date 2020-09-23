package com.codegons.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codegons.customer.model.Customer;
import com.codegons.customer.repository.CustomerRepository;

@Service("CustomerService")
public class CustomerServiceImpl implements CustomerService 
{
	
	
	 @Autowired
	  private CustomerRepository CustomerRepository;

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		 return CustomerRepository.findAll();
	}

	@Override
	public Optional<Customer> getCustomerById(int id) {
		// TODO Auto-generated method stub
		return CustomerRepository.findById(id);
	}

	@Override
	public Customer saveAllCustomer(Customer customer) {
		// TODO Auto-generated method stub
		 return CustomerRepository.save(customer);
	}
	
}
