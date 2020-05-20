package com.springjpa.hibernate.examples.Service;

import org.springframework.data.repository.CrudRepository;

import com.springjpa.hibernate.examples.Entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {

}
