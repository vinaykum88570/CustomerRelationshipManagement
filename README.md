<h1 align="center">Hi there 👋, I'm Vinay Kumdale</h1>

<h3 align="center">
☕ Java Backend Developer | Spring Boot Enthusiast
</h3>

<p align="center">
  <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=22&pause=1000&color=44C2FD&center=true&vCenter=true&width=650&lines=Java+Backend+Developer;Spring+Boot+%7C+REST+APIs;MySQL+%7C+JPA+%7C+Hibernate;Backend+Architecture+%26+API+Development;Always+Learning+%26+Building" />
</p>

<hr>
<h2>🚀 Project Showcase (Customer Relationship Management - CRM)</h2>

<ul>
  <li>☕ Core Java</li>
  <li>🔌 Spring Boot</li>
  <li>📊 Spring Data JPA</li>
  <li>🗄️ MySQL</li>
  <li>💻 REST APIs</li>
</ul>

<b>✨ FEATURES:</b>
<ul>
  <li>➕ Add new customer records</li>
  <li>📋 View all customer details</li>
  <li>🔍 Search customers by name, email, and age</li>
  <li>✏️ Update customer information</li>
  <li>❌ Delete customer records</li>
  <li>🔄 Full CRUD functionality</li>
</ul>

<p>
📂 Repository: 
<a href="https://github.com/vinaykum88570/CustomerRelationshipManagement" target="_blank">
https://github.com/vinaykum88570/CustomerRelationshipManagement
</a>
</p>

<hr>
🔹 Architecture & Design
The application follows a layered architecture, which includes:
•	Controller Layer → Handles HTTP requests and exposes REST APIs 
•	Service Layer → Contains business logic 
•	Repository Layer → Handles database operations using Spring Data JPA 
This design improves maintainability, scalability, and separation of concerns.
<hr>
🔹 Entity Layer
I created a Customer entity class mapped to a customers table using JPA annotations like @Entity and @Table.
•	@Id with @GeneratedValue is used for primary key 
•	Fields like firstName, lastName, email, mobileNumber, and age are mapped to columns 
This allows Hibernate to automatically map Java objects to database records.
<hr>
🔹 Repository Layer
I used Spring Data JPA (JpaRepository), which provides built-in methods like:
•	save() → insert/update 
•	findAll() → fetch all records 
•	deleteById() → delete 
I also implemented derived query methods, such as:
•	findByFirstName() 
•	findByAgeLessThanEqual() 
•	findByEmail() 
These methods automatically generate SQL queries based on method names.
<hr>
🔹 Service Layer
The service layer contains the core business logic.
For example:
•	In update operations, I first fetch the existing customer using getCustomerById(), update specific fields like email or mobile number, and then save it back using save() 
•	This ensures data consistency and proper update handling 
<hr>
🔹 Controller Layer (REST APIs)
I created multiple REST endpoints using annotations like @GetMapping, @PostMapping, @PutMapping, and @DeleteMapping.
Some key APIs include:
•	Insert Customer → /crm/insert 
•		
•	Get All Customers → /crm/getAll 
•	Get Customer By ID → /crm/{id} 
•	Delete Customer → /crm/delete/{id} 
•	Bulk Insert → /crm/insert/All 
I also implemented search APIs, such as:
•	Find by first name, last name, email 
•	Find customers with age less than or equal 
Additionally, I created field-specific update APIs, like updating only email, mobile number, or age, instead of updating the entire object.





