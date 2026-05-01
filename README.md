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
<b>🔹 Architecture & Design:</b><br>

The application follows a layered architecture, which includes:
•	Controller Layer → Handles HTTP requests and exposes REST APIs <br>
•	Service Layer → Contains business logic  <br>
•	Repository Layer → Handles database operations using Spring Data JPA <br>
This design improves maintainability, scalability, and separation of concerns.
<hr>

<b>🔹 Entity Layer:</b><br>

I created a Customer entity class mapped to a customers table using JPA annotations like @Entity and @Table.<br>
•	@Id with @GeneratedValue is used for primary key <br>
•	Fields like firstName, lastName, email, mobileNumber, and age are mapped to columns <br>
This allows Hibernate to automatically map Java objects to database records.
<hr>
<b>🔹 Repository Layer:</b><br>

I used Spring Data JPA (JpaRepository), which provides built-in methods like: <br>
•	save() → insert/update  <br>
•	findAll() → fetch all records  <br>
•	deleteById() → delete <br>
I also implemented derived query methods, such as: <br>
•	findByFirstName()  <br>
•	findByAgeLessThanEqual() <br>
•	findByEmail() <br>
These methods automatically generate SQL queries based on method names.
<hr>
<b>🔹 Service Layer:</b> <br>

The service layer contains the core business logic.
For example:
•	In update operations, I first fetch the existing customer using getCustomerById(), update specific fields <br> like email or mobile number, and then save it back using save() <br>
•	This ensures data consistency and proper update handling <br>
<hr>
<b>🔹 Controller Layer (REST APIs):</b><br>

I created multiple REST endpoints using annotations like @GetMapping, @PostMapping, @PutMapping, and @DeleteMapping.<br>
Some key APIs include:<br>
•	Insert Customer → /crm/insert <br>
•	Get All Customers → /crm/getAll <br>
•	Get Customer By ID → /crm/{id} <br>
•	Delete Customer → /crm/delete/{id} <br>
•	Bulk Insert → /crm/insert/All <br>
I also implemented search APIs, such as:<br>
•	Find by first name, last name, email <br>
•	Find customers with age less than or equal <br>
Additionally, I created field-specific update APIs, like updating only email, mobile number, or age, instead of updating the entire object.<br>
