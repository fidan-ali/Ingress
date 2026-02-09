package EmployeeSalary;

public class Freelancer extends Employee{
    double projectPayment;
    public Freelancer(String name, double projectPayment) {
        super(name);
        this.projectPayment = projectPayment;
    }
    @Override
    public double calculateSalary() {
        return projectPayment;
    }
}
