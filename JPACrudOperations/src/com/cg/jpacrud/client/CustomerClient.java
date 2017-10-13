package com.cg.jpacrud.client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import com.cg.jpacrud.entities.CustomerBean;
import com.cg.jpacrud.service.CustomerServiceImpl;


public class CustomerClient {
	

	public static void main(String[] args) {

	
	CustomerBean customer=new CustomerBean();   //bean class object
	CustomerServiceImpl service=new CustomerServiceImpl();  //service class object
	
	//Inserting data into table
	Scanner sc=new Scanner(System.in);
	System.out.println("\nEnter customer ID:");
	int Id=sc.nextInt();
	System.out.println("\nEnter customer Name:");
	String name=sc.next();
	System.out.println("\nEnter customer Phone Number:");
	int phone=sc.nextInt();
	System.out.println("\nEnter customer Email Id:");
	String email=sc.next();
	customer.setId(Id);
	customer.setName(name);
	customer.setPhone(phone);
	customer.setEmail(email);
	customer.setCustDob(new Date());
	service.addCustomer(customer);   //passing bean object to service layer using service layer object
	System.out.println("Customer data added successfully");
	/*
	System.out.println("************Listing All Customer*************");
	for(CustomerBean customer1:service.getAllCustomer()) {
		System.out.println(customer1);
	}
	//at this breakpoint, we are retrieving single row having entered ID(Primary key)

	        customer = service.findCustomerById(1005);
			System.out.print("ID:"+customer.getId());
			System.out.println("\nName:"+customer.getName());
			
	//at this breakpoint, we have updated record added in first section	
			customer = service.findCustomerById(1011);
			customer.setName("Ajita Chavan");
			service.updateCustomer(customer);
			customer = service.findCustomerById(1011);
			System.out.print("ID:"+customer.getId());
			System.out.println("\nName:"+customer.getName());
			
	//Retrieving single row having entered mobile number	
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			System.out.println("\nEnter mobile number:");
			int phone=sc.nextInt();
			customer= service.getCustomerByPhone(phone);
			System.out.println(customer);
			
	//Retrieving multiple row having entered mobile number		
			System.out.println("\nEnter mobile number:");
			int phone1=sc.nextInt();
			List<CustomerBean> list=new ArrayList<CustomerBean>();
			list= service.getCustomerByPhone1(phone1);
			for(CustomerBean out:list)
			{
				System.out.println("ID:"+out.getId());
				System.out.println("Name:"+out.getName());
			}
			
			
			
	//at this breakpoint, record is removed from table
			customer = service.findCustomerById(1011);
			service.removeCustomer(customer);
			System.out.println("End of program...");
		*/	
			
	}
}
