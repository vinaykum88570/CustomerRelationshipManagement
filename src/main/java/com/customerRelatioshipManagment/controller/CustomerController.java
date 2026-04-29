package com.customerRelatioshipManagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customerRelatioshipManagment.entity.Customer;
import com.customerRelatioshipManagment.service.CustomerService;

@RestController
@RequestMapping(value="/crm")
public class CustomerController {

	
	@Autowired
	private CustomerService customerService;
	
	//1. Insert Customer
	@PostMapping(value="/insert")
	public Customer insertCustomer(@RequestBody Customer customer) {
		return customerService.insertCustomer(customer);
	}

	//2. List of Customer Fetch
	@GetMapping(value="/getAll")
	public List<Customer> getCustomersList() {
		return customerService.getCustomersList();
	}
	
	//3. Single Customer Fetch
	@PostMapping(value="/{id}")
	public Customer getCustomerById(@PathVariable("id") Integer id) {
		return customerService.getCustomerById(id);
	}
	
	//4. delete Customer
	@DeleteMapping(value="/delete/{id}")
	public void deleteCustomerById(@PathVariable("id") Integer id) {
	 customerService.deleteCustomerById(id);
	}
	
	//5. Insert List Of Customers
	@PostMapping(value="insert/All")
	public List<Customer> insertMultiCustomers(@RequestBody List<Customer> customerList){
		return customerService.insertMultiCustomer(customerList);
	}
	
	//6. Fetch Customer By First Name
	@GetMapping(value="/firstName/{firstName}")
	public List<Customer> findCustomersByFirstName(@PathVariable("firstName") String firstName){
		return customerService.findCustomersByFirstName(firstName);
	}
	
	//7. Fetch Customers By Less Than Age
	@GetMapping(value="/Age/{age}")
	public List<Customer> findByAgeLessThanEqual(@PathVariable("age") int age){
		return customerService.findByAgeLessThanEqual(age);
	}
	
	//8 Fetch Customer By Ag
    @GetMapping(value="/FindByAge/{age}")
	public List<Customer> findCustomersByAge(@PathVariable("age") int age){
		return customerService.findCustomersByAge(age);
	}
	
    //9. Fetch Customer By Last Name
 	@GetMapping(value="/lastName/{lastName}")
 	public List<Customer> findCustomersByLastName(@PathVariable("lastName") String lastName){
 		return customerService.findCustomersByLastName(lastName);
 	}
 	
    //10. Fetch Customer By Email
  	@GetMapping(value="/Email/{email}")
  	public Customer findCustomersByEmail(@PathVariable("email") String email){
  		return customerService.findCustomersByEmail(email);
  	}
  	
  	//11. Update First Name
  	@PutMapping(value="/updateFirstName/{id}/{firstName}")
	public Customer updateFirstName	(@PathVariable("id") Integer id,
                                 @PathVariable("firstName") String firstName) {
	   return customerService.updateFirstName(id,firstName);
	}
  	
    //12. Update Last Name
   	@PutMapping(value="/updateLastName/{id}/{lastName}")
 	public Customer updateLastName(@PathVariable("id") Integer id,
                                  @PathVariable("lastName") String lastName) {
 	   return customerService.updateLastName(id,lastName);
 	}
	
   //13. Update Customer Email 
 	@PutMapping(value="/update/{id}/{newEmail}")
 	public Customer updateEmail(@PathVariable("id") Integer id,
                                  @PathVariable("newEmail") String newEmail) {
 	   return customerService.updateEmail(id,newEmail);
 	}
 	
   //14. Update Mobile Number 
  	@PutMapping(value="/updatemobileNumber/{id}/{mobileNumber}")
  	public Customer updateMobileNumber(@PathVariable("id") Integer id,
                                   @PathVariable("mobileNumber") String mobileNumber) {
  	   return customerService.updateMobileNumber(id,mobileNumber);
  	}
  	
    //15. Update Age
   	@PutMapping(value="/updateAge/{id}/{age}")
   	public Customer updateAge(@PathVariable("id") Integer id,
                                    @PathVariable("age") int age) {
   	   return customerService.updateAge(id,age);
   	}
 	
}