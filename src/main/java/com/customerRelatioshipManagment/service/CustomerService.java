package com.customerRelatioshipManagment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerRelatioshipManagment.entity.Customer;
import com.customerRelatioshipManagment.repository.CustomerRepository;

@Service
public class CustomerService  {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	// Insert Customer
	public Customer insertCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	// Customer List 
	public List<Customer> getCustomersList() {
		return customerRepository.findAll();
	}

	// Single Customer
	public Customer getCustomerById(Integer id) {
		return customerRepository.findById(id).get();
	}

	// Update Email
	public Customer updateEmail(Integer id, String newEmail) {
		
		Customer customer = getCustomerById(id);
		customer.setEmail(newEmail);
		
		return customerRepository.save(customer);
	}

	// delete Customer
	public void deleteCustomerById(Integer id) {
		customerRepository.deleteById(id);
	}

	// Insert Multiple Customer
	public List<Customer> insertMultiCustomer(List<Customer> customerList) {
		return customerRepository.saveAll(customerList);
	}

	// Fetch Customer By First Name
	public List<Customer>findCustomersByFirstName(String firstName) {
		return customerRepository.findByFirstName(firstName);
	}

	// Fetch Customers By Less Than Age
	public List<Customer> findByAgeLessThanEqual(Integer age) {
		return customerRepository.findByAgeLessThanEqual(age);
	}

	// Fetch Customer By Age
	public List<Customer> findCustomersByAge(int age) {
		return customerRepository.findByAge(age);
	}

	// Fetch Customer By Last Name
	public List<Customer> findCustomersByLastName(String lastName) {
		return customerRepository.findByLastName(lastName);
	}

	 // Fetch Customer By Email
	public Customer findCustomersByEmail(String email) {
		return customerRepository.findByEmail(email);
	}

	// Update First Name
	public Customer updateFirstName(Integer id, String firstName) {
		Customer customer = getCustomerById(id);
		customer.setFirstName(firstName);
		
		return customerRepository.save(customer);	
	}

	// Update Last Name
	public Customer updateLastName(Integer id, String lastName) {
		Customer customer = getCustomerById(id);
		customer.setLastName(lastName);
		
		return customerRepository.save(customer);
	}

	// Update Mobile Number
	public Customer updateMobileNumber(Integer id, String mobileNumber) {
		Customer customer = getCustomerById(id);
		customer.setMobileNumber(mobileNumber);
		
		return customerRepository.save(customer);
	}

	// Update Age
	public Customer updateAge(Integer id, int age) {
		Customer customer = getCustomerById(id);
		customer.setAge(age);
		
		return customerRepository.save(customer);
	}
	
	
	
	
	
}
