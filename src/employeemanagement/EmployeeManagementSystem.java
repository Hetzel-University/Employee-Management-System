package employeemanagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeManagementSystem {
    private List<Employee> employees;

    public EmployeeManagementSystem() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added successfully!");
    }

    public void removeEmployee(int employeeId) throws EmployeeNotFoundException {
        Employee employeeToRemove = getEmployee(employeeId);
        if (employeeToRemove != null) {
            employees.remove(employeeToRemove);
        } else throw new EmployeeNotFoundException("Employe with ID: " + employeeId + "could not be found!");
    }

    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("There are no employees!");
        } else {
            for (Employee employee : employees) {
                employee.displayDetails();
            }
        }
    }

    public void sortEmployeesById(){
        Collections.sort(employees);
        System.out.println("Employees sorted by Id:");
        displayAllEmployees();
    }

    public void sortEmployeesBySalary() {
        employees.sort(new SalaryComparator());
        System.out.println("Employees sorted by Salary:");
        displayAllEmployees();
    }

    public void promoteEmployee(int employeeId, double salaryIncrease) throws EmployeeNotFoundException {
        Employee employeeToPromote = getEmployee(employeeId);
        if (employeeToPromote != null) {
            if(employeeToPromote instanceof FullTimeEmployee){
                ((FullTimeEmployee) employeeToPromote).promote(salaryIncrease);
            } else System.out.println("Employee with ID: " + employeeId + "is not a Full Time Employee!");
        } else throw new EmployeeNotFoundException("Employee with ID: " + employeeId + "could not be found!");
    }

    public Employee getEmployee(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getId() == employeeId) {
                return employee;
            }
        }
        return null;
    }
}
