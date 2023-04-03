package ro.sapientia.oop.course8;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.hire( new Employee("Szasz Emese", 2000, 4500));
        company.hire( new Manager("Szabo Laszlo", 1900, 10000, "villamos"));
        company.hire( new Manager("Marosi Szilamer", 1995, 7000, "Mobile"));
        company.hire( new Manager("Marosi Alpar", 2000, 7000, "Web"));
        company.hire( new Employee("Benedek Janos", 2000, 4000));

        System.out.println("Eredeti sorrend: ");
        company.printEmployees();

        System.out.println("Fizetes szerinti sorrend: ");
        company.sortBySalary();
        company.printEmployees();

        System.out.println("Fizetes es nev szerinti sorrend: ");
        company.sortBySalaryAndName();
        company.printEmployees();

    }
}
