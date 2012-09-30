/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fkysoft.action;

import com.fkysoft.bean.Customer;
import com.fkysoft.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author ThangND
 */
public class HelloWorldAction extends ActionSupport{
    private String message = "";
    
    Customer customer = new Customer();
    List<Customer> customerList = new ArrayList<Customer>();
    CustomerService customerService;

    // DI via Spring
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public Object getModel() {
        return customer;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    // save customer
    public void addCustomer() throws Exception {
        // save it
        customer.setCreatedDate(new Date());
        customerService.addCustomer(customer);

        // reload the customer list
        customerList = null;
        customerList = customerService.listCustomer();
    }

    // list all customers
    public void listCustomer() throws Exception {
        customerList = customerService.listCustomer();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    @Override
    public String execute(){
        System.out.println("SPRING ---- HIBERNATE");
        customerList = customerService.listCustomer();
        for (Customer customer1 : customerList) {
            System.out.println(customer1.getName());
        }
        
        return SUCCESS;
    }
}
