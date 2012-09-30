package com.fkysoft.service;

import java.util.List;

import com.fkysoft.bean.Customer;

public interface CustomerService {
	void addCustomer(Customer customer);

	List<Customer> listCustomer();
}
