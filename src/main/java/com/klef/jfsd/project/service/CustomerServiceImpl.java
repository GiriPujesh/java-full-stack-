package com.klef.jfsd.project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.project.model.Customer;
import com.klef.jfsd.project.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService 
{
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer checkcustomerlogin(String email, String pwd)
	{
		return customerRepository.checkcustomerlogin(email, pwd);
	}

	@Override
	public String addcustomer(Customer c) {
			customerRepository.save(c);
			return "Customer Registered Successfully";
	}

	@Override
	public String updatecustomer(Customer c) {
		Customer c1=customerRepository.findById(c.getId()).get();
		c1.setFname(c.getFname());
		c1.setLname(c.getLname());
		c1.setContactno(c.getContactno());
		c1.setEmail(c.getEmail());
		c1.setPassword(c.getPassword());
		
		customerRepository.save(c1);
		
		return "Customer Updated Successfully";
		
		
	}

	@Override
	public Customer viewcustomerbyid(int cid) {
		Optional<Customer> obj=customerRepository.findById(cid);
		if(obj.isPresent()) {
			Customer c=obj.get();
			return c;
		}
		else {
		return null;
		}
	}

}
