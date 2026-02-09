package EmployeeSalary;

import java.util.ArrayList;

public class EmployeeMain {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("Samsum"));
        employees.add(new PartTimeEmployee("Fidan", 80, 10));
        employees.add(new Freelancer("Murad", 1500));

        for (Employee e : employees) {
            System.out.println(e.name + " salary: " + e.calculateSalary());
        }
    }
}
