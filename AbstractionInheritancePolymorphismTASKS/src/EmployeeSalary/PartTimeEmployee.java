package EmployeeSalary;

public class PartTimeEmployee extends Employee{
    int saatSayi;
    double saatliqOdenish;
    public PartTimeEmployee(String name, int hours, double hourlyRate) {
        super(name);
        this.saatSayi = saatSayi;
        this.saatliqOdenish = saatliqOdenish;
    }
    @Override
    public double calculateSalary() {
        return saatSayi * saatliqOdenish;
    }
}
