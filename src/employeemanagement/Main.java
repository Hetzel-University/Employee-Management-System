package employeemanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Sort Employees by ID");
            System.out.println("5. Sort Employees by Salary");
            System.out.println("6. Promote Full-Time Employee");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter employee type (1. Full-Time, 2. Part-Time): ");
                        int type = scanner.nextInt();
                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        System.out.print("Enter Name: ");
                        String name = scanner.next();
                        System.out.print("Enter Salary: ");
                        double salary = scanner.nextDouble();

                        if (type == 1) {
                            system.addEmployee(new FullTimeEmployee(id, name, salary));
                        } else if (type == 2) {
                            system.addEmployee(new PartTimeEmployee(id, name, salary));
                        } else {
                            System.out.println("Invalid employee type.");
                        }
                        break;

                    case 2:
                        System.out.print("Enter Employee ID to remove: ");
                        int removeId = scanner.nextInt();
                        system.removeEmployee(removeId);
                        break;

                    case 3:
                        system.displayAllEmployees();
                        break;

                    case 4:
                        system.sortEmployeesById();
                        break;

                    case 5:
                        system.sortEmployeesBySalary();
                        break;

                    case 6:
                        System.out.print("Enter Employee ID to promote: ");
                        int promoteId = scanner.nextInt();
                        System.out.print("Enter salary increase: ");
                        double salaryIncrease = scanner.nextDouble();
                        system.promoteEmployee(promoteId, salaryIncrease);
                        break;

                    case 7:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (EmployeeNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                scanner.nextLine(); // Clear the buffer
            }
        }
    }
}