package com.springjpa.hibernate.examples.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjpa.hibernate.examples.Entity.Customer;

@Service("customerService")
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	public void test() {
		Customer customer= new Customer();
		customer.setFirstName("Anu");
		customer.setLastName("Vasu");
		customerRepository.save(customer);
		
//		Iterable<Customer> iterator=customerRepository.findAll();
//		iterator.forEach(customer -> System.out.println(customer));

	}

}
