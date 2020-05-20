package com.springjpa.hibernate.examples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springjpa.hibernate.examples.Service.CustomerService;

public class CustomerTest {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.springjpa.hibernate.examples");
		context.refresh();
		CustomerService customerService=(CustomerService) context.getBean("customerService");
		customerService.test();
		
		context.close();
	}
}
