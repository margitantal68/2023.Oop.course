package ro.sapientia.oop.course7;

import ro.sapientia.oop.course6.Director;
import ro.sapientia.oop.course6.Employee;
import ro.sapientia.oop.course6.Manager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> emps = new ArrayList<Employee>();
        emps.add( new Employee("Janos", 2000, 4500));
        emps.add( new Director("Domokos Jozsef", 1900, 10000, "villamos", "Sapi MVH"));
        emps.add( new Manager("Alpar", 2000, 7500, "Web"));
        emps.add( new Manager("Szilamer", 1995, 7000, "Mobile"));
        emps.add( new Employee("Emese", 2000, 3900));
        System.out.println("employees: ");
        for(Employee e: emps) {
            System.out.println(e);
        }
        System.out.println("#employees: " + emps.size());

        //1. valtozat - instanceof
        int numManagers = 0;
        for( Employee e: emps) {
            if( e instanceof Manager ) {
                ++numManagers;
            }
        }
        System.out.println("#managers (instanceof): " + numManagers);
        System.out.println("---------");
        //2. valtozat - getClass()
        int numManagers2 = 0;
        for( Employee e: emps) {
            if( e.getClass() == Manager.class ) {
                ++numManagers2;
            }
        }
        System.out.println("#strict managers (getClass): " + numManagers2);

        System.out.println("---------");

        System.out.println("Testing equals: ");
        Employee e1 = new Employee("Janos", 2000, 5600);
        Employee e2 = new Employee("Janos", 2000, 5600);
        System.out.println("e1: " + e1);
        System.out.println("e2: " + e2);
        System.out.println("e1 == e2: " + (e1 == e2));
        System.out.println("e1.equals(e2): " + e1.equals(e2));

        System.out.println("Testing equals: ");
        Employee e3 = new Employee("Janos", 2000, 5600);
        Employee e4 = new Manager("Janos", 2000, 5600, "MIT");
        System.out.println("e3: " + e3);
        System.out.println("e4: " + e4);
        System.out.println("e3.equals(e4): " + e3.equals(e4));
        System.out.println("e4.equals(e3): " + e3.equals(e4));



    }
}
