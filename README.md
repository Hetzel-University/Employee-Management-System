Übung Vertiefung Softwareentwicklung SS 2025
Übung 03
Employee Management System
Deadline What to submit?
March 27, 2025, 10:15 Java source code in zip file & Java source
code as a PDF file
Objective:
The goal of this assignment is to create an Employee Management System that allows users
to manage and analyze employee data. The system should involve multiple classes, abstract
classes, interfaces, and the use of Comparator and Comparable for sorting employees.
Tasks:
• Employee Class Hierarchy: [4 points]
Create an abstract class Employee with the following aKributes:
§ id: Unique identifier for the employee.
§ name: Name of the employee.
§ salary: Salary of the employee.
Include abstract methods
§ calculateBonus(): Calculates the bonus for the employee.
§ displayDetails(): Displays the employee's details.
Create two subclasses of Employee
§ FullTimeEmployee: Represents full-time employees. The bonus is calculated as
10% of the salary.
§ PartTimeEmployee: Represents part-time employees. The bonus is calculated as
5% of the salary.
Warning: You should avoid using double to represent money (e.g., salary) in Java due to
precision issues. For financial applications, always use BigDecimal or long (in cents)
instead of double. However, if you’re not familiar with BigDecimal or long, you can
simply use double for this assignment for simplicity.
• Interfaces: [4 points]
Create an interface Promotable with the following method:
§ promote(double salaryIncrease): Increases the employee's salary by the
specified amount.
§ Implement this interface in the FullTimeEmployee class. When a full-time
employee is promoted, their salary increases by the specified amount.
Übung Vertiefung Softwareentwicklung SS 2025
• Comparable and Comparator: [4 points]
§ Make the Employee class implement Comparable to allow sorting employees by
their id.
§ Create a custom Comparator class SalaryComparator to sort employees by
their salary in descending order.
• Exception Handling: [4 points]
§ Handle exceptions for invalid inputs (e.g., negative salary, invalid employee ID).
§ Throw a custom exception EmployeeNotFoundException when trying to remove
or promote an employee that does not exist.
• Employee Management System: [8 points]
Create a class EmployeeManagementSystem with the following functionality:
§ A list to store employees.
§ Methods to:
• Add an employee.
• Remove an employee by id.
• Display all employees.
• Sort employees by id (using Comparable).
• Sort employees by salary (using Comparator).
• Promote a full-time employee (using the Promotable interface).
• The Main class: (Provided to you)
The main class demonstrates the functionality of the system in the form of a menu-
driven program that allows the user to::
§ Add employees.
§ Remove employees.
§ Display all employees.
§ Sort employees by ID or salary.
§ Promote a full-time employee.
§ Exit the program.
• Example Output:
Employee Management System
1. Add Employee
2. Remove Employee
3. Display All Employees
4. Sort Employees by ID
5. Sort Employees by Salary
6. Promote Full-Time Employee
7. Exit
Enter your choice: 1
Übung Vertiefung Softwareentwicklung SS 2025
Enter employee type (1. Full-Time, 2. Part-Time): 1
Enter ID: 101
Enter Name: John Doe
Enter Salary: 50000
Employee added successfully!
Enter your choice: 3
Employee Details:
ID: 101, Name: John Doe, Salary: 50000.0, Bonus: 5000.0
Enter your choice: 6
Enter Employee ID to promote: 101
Enter salary increase: 10000
Employee promoted successfully! New Salary: 60000.0
Enter your choice: 5
Employees sorted by salary:
ID: 101, Name: John Doe, Salary: 60000.0, Bonus: 6000.0
