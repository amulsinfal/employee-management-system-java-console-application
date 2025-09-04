# Employee Management System (Java Console Application)
This is a Java Console-based Employee Management System that I built using Core Java concepts and problem-solving approach. The application performes full CRUD operations (Create, Read, Update, Delete) on employees while applying proper input validation and exception handling.

The project demonstrates my understanding of:
1. Object-Oriented Programming (OOP) – modeling employees as real-world objects
2. Collections Framework – managing dynamic employee records with ArrayList
3. Exception Handling – ensuring invalid inputs don’t crash the program
4. Input Validation – applying business rules like employee ID format, alphabet-only names, and positive salary

---

### 🚀 Features I Implemented

- Add new employees with details: ID, Name, Designation, Salary
- View all employees in the system
- Search for a specific employee by ID
- Sort the employee by name
- Update employee details (name, designation, salary)
- Delete an employee by ID
- Exit option to quit the system gracefully

---

### 🛠️ Validations I Added
1. Employee ID must follow the format E-<number> (Example: E-1, E-101)  
2. Name should contain only alphabets and spaces. (Example: Amul)
3. Salary must be greater than 0
4. If the input doesn't meet these rules then the system throws an error message.  

---

### ⚡ Tech Stack I Used
- Java (Core Java 21 compatible)  
- Scanner for user input  
- Collections (ArrayList) to store employee records  
- Exception Handling with built-in exception (IllegalArgumentException)  

---

### 📂 Project Structure
<img width="464" height="154" alt="" src="https://github.com/user-attachments/assets/56842e2e-ca6f-4387-85cd-ad444c8c1633" />
 
--- 

### 📌 Class Explanations

1. Employee.java - This class defines the blueprint (model) of an employee.
   - This is a POJO (Plain Old Java Object) class that represents a single employee.  
   - It contains fields (attributes) like id, name, designation, and salary.  
   - It provides getters and setters to access and modify these fields.  
   - A constructor initializes the object when it’s created.  
   - The toString() method is overridden so the employee details print in a readable format.  

2. EmployeeManagement.java - This class is the controller/manager that handles CRUD operations and business rules.  
   - This is the business logic class of the system.  
   - It uses a List<Employee> employees to store all employees in memory.
   - It provides methods to perform operations on employees:
     - addEmployee(Employee employee) → Adds new employee (with validation).  
     - displayEmployees() → Prints all employees.  
     - searchEmployee(String empId) → Finds employee by ID.
     - updateEmployee(...) → Updates name, designation, or salary of an employee.
     - deleteEmployee(String empId) → Removes employee by ID.
     - sortEmployeesByName() → Sorts employees alphabetically by name.
     - It also contains private validation methods (validateEmpId, validateEmpName, etc.) that ensure data integrity.

3. EmployeeManagementSystem.java - This class acts as the UI layer where the user interacts with the system.
   - This is the main entry point of the application (contains main() method).
   - It creates an object of EmployeeManagement and shows a menu-driven console UI using Scanner.
   - Users can select options like Add, Search, Update, Delete, Sort, etc.
   - It keeps running in a loop until the user chooses to Exit.
 
 ---
