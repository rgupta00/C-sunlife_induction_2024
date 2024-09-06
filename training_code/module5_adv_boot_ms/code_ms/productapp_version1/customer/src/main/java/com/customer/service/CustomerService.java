package com.customer.service;

import com.customer.repo.Customer;

import java.util.List;

public interface CustomerService {
	public List<Customer> getAllCustomer();
	public Customer addCustomer(Customer customer);
	public Customer getCustomerById(int id);
}