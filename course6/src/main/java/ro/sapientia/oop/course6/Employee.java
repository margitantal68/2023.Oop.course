package ro.sapientia.oop.course6;

import java.util.Objects;

public class Employee {
    protected String name;
    private final int birthYear;
    private int salary;

    public Employee(String name, int birthYear, int salary) {
        this.name = name;
        this.birthYear = birthYear;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return birthYear == employee.birthYear && salary == employee.salary && Objects.equals(name, employee.name);
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return birthYear == employee.birthYear && salary == employee.salary && Objects.equals(name, employee.name);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthYear, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", salary=" + salary +
                '}';
    }
}
