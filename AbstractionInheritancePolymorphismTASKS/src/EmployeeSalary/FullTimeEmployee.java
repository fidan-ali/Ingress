package EmployeeSalary;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String name) {
        super(name);
    }
    @Override
    public double calculateSalary() {
        return 2000;
    }
}
