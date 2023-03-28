package ro.sapientia.oop.course6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Janos", 1960, 5000));
        // Employee es Manager ROKONOK
        employees.add( new Manager("Jonathan", 1994, 8000, "HR"));
//        employees.add("Kinga"); Employee es String NEM ROKONOK
        for(Employee e: employees) {
            System.out.println( e.toString() );
        }
    }
}
