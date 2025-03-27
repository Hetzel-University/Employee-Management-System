package employeemanagement;

public abstract class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) throws IllegalArgumentException{

        if (salary < 0) {
            throw new IllegalArgumentException("Salary must not be negative.");
        }
        if (id < 0) {
            throw new IllegalArgumentException("ID must not be negative.");
        }

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public abstract double calculateBonus();

    public abstract void displayDetails();

    @Override
    public int compareTo(Employee otherEmployee) {
        return Integer.compare(this.id, otherEmployee.id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
