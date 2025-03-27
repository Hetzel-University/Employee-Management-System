package employeemanagement;

public class FullTimeEmployee extends Employee implements Promotable {

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary()*0.1;
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + getId() + ", Name: " + getName() + ", Salary: " + getSalary() + ", Bonus: " + calculateBonus());
    }

    @Override
    public void promote(double salaryIncrease) {
        if (salaryIncrease > 0) {
            setSalary(getSalary() + salaryIncrease);
            System.out.println("Employee promoted successfully! New Salary: " + getSalary());
        } else System.out.println("Employee not promoted because salary is not a positive amount!");
    }
}
