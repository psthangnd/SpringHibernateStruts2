package com.fkysoft.dao;

import java.util.List;

import com.fkysoft.bean.Customer;

public interface CustomerDao {
	void addCustomer(Customer customer);
	List<Customer> listCustomer();
}
