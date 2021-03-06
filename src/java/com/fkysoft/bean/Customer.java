package com.fkysoft.bean;
// Generated Sep 27, 2012 9:44:38 PM by Hibernate Tools 3.2.1.GA

import java.util.Date;

/**
 * Customer generated by hbm2java
 */
public class Customer implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private int customerId;
    private String name;
    private String address;
    private Date createdDate;

    public Customer() {
    }

    public Customer(int customerId, String name, String address, Date createdDate) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.createdDate = createdDate;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
