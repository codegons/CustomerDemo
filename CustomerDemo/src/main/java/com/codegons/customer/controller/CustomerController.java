package com.codegons.customer.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codegons.customer.model.Customer;
import com.codegons.customer.service.CustomerService;
import com.codegons.exception.APIDataNotFoundException;


@RestController
@RequestMapping(value = "/services")
public class CustomerController{

	
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	
	public ResponseEntity<List<Customer>> getAllCustomer()  throws APIDataNotFoundException {
		logger.info("Returning all the ToDo´s");
		List<Customer> Customer=customerService.getAllCustomer();
		
		logger.info(Customer.get(0).toString());
		return new ResponseEntity<List<Customer>>(customerService.getAllCustomer(), HttpStatus.OK);

	}

	@RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
	public ResponseEntity<Customer> getCustomerById(@PathVariable("id") int id) throws APIDataNotFoundException {
		logger.info("ToDo id to return " + id);
		Optional<Customer> customer = customerService.getCustomerById(id);
		logger.info("customer::" + customer);
		if (customer == null || !customer.isPresent()) {
			logger.info("inside this");
			throw new APIDataNotFoundException("customer doesn´t exist", null, null, null);
		}
		
//		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
		return new ResponseEntity<Customer>(customer.get(), HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/customer/add", method = RequestMethod.POST)
	public ResponseEntity<Customer> saveAllCustomer(@RequestBody Customer customer) throws APIDataNotFoundException {
		
//		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
		logger.info("customer::" + customer);
		return new ResponseEntity<Customer>(customerService.saveAllCustomer(customer), HttpStatus.OK);
		
	}
}
