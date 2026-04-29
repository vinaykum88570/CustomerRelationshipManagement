package com.customerRelatioshipManagment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.customerRelatioshipManagment.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	// Fetch Customer By First Name
	public List<Customer> findByFirstName(String firstName);
	
	// Fetch Customers By Less Than Age
	public List<Customer> findByAgeLessThanEqual(Integer age);

	// Fetch Customer By Age
	public List<Customer> findByAge(int age);

	// Fetch Customer By Last Name
	@Query("SELECT c FROM Customer c WHERE c.lastName = :lastName")
	public List<Customer> findByLastName(String lastName);

	// Fetch Customer By Email
	public Customer findByEmail(String email);
	
	
	
}
