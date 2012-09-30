package com.fkysoft.service;

import java.util.List;

import com.fkysoft.bean.Customer;
import com.fkysoft.dao.CustomerDao;

public class CustomerServiceImpl implements CustomerService {

    CustomerDao customerDAO;

    // DI via Spring
    public void setCustomerDAO(CustomerDao customerDAO) {
        this.customerDAO = customerDAO;
    }

    // call DAO to save customer
    public void addCustomer(Customer customer) {
        customerDAO.addCustomer(customer);
    }

    // call DAO to return customers
    public List<Customer> listCustomer() {
        return customerDAO.listCustomer();
    }
}
