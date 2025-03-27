package employeemanagement;

public class PartTimeEmployee extends Employee {

    public PartTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary()*0.05;
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + getId() + ", Name: " + getName() + ", Salary: " + getSalary() + ", Bonus: " + calculateBonus());
    }
}
