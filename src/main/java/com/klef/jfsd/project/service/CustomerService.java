package com.klef.jfsd.project.service;

import com.klef.jfsd.project.model.Customer;


public interface CustomerService 
{	
	public String addcustomer(Customer c);
	public Customer checkcustomerlogin(String email,String pwd);
	public String updatecustomer(Customer c);
	public Customer viewcustomerbyid(int cid);
}
