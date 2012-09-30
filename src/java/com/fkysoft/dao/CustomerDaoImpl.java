package com.fkysoft.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.fkysoft.bean.Customer;

public class CustomerDaoImpl implements CustomerDao {
	HibernateTemplate hibernateTemplate;
	
	// add the customer
	public void addCustomer(Customer customer) {
		getHibernateTemplate().save(customer);
	}

	// return all the customers in list
	@SuppressWarnings("unchecked")
	public List<Customer> listCustomer() {
		return getHibernateTemplate().find("from Customer");
	}

	/**
	 * @return the hibernateTemplate
	 */
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	/**
	 * @param hibernateTemplate the hibernateTemplate to set
	 */
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
