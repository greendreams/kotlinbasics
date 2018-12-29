package com.supercluster.cosmos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.supercluster.cosmos.model.Customer;
import com.supercluster.cosmos.repository.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository repository;
	
	@PostMapping("/createcustomer")
	public void createCustomer(@RequestBody Customer customer)
	{
		repository.save(customer);
	}
	
	@GetMapping("/getcustomers")
	public List<Customer> getCustomer()
	{
		return repository.findAll();
	}
}
