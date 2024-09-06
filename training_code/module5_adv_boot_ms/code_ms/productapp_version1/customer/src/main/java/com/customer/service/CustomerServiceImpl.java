package com.customer.service;

import com.customer.exception.CustomerNotFoundException;
import com.customer.repo.Customer;
import com.customer.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public List<Customer> getAllCustomer() {
		return customerRepo.findAll();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		 customerRepo.save(customer);
		 return customer;
	}

	@Override
	public Customer getCustomerById(int id) {
		return customerRepo.findById(id).orElseThrow(CustomerNotFoundException:: new);
	}

}