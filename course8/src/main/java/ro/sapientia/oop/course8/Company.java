package ro.sapientia.oop.course8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company {
    private List<Employee> employees = new ArrayList<>();

    public boolean hire( Employee e) {
        if( employees.contains( e ) ) {
            return false;
        }
        employees.add( e );
        return true;
    }

    public Employee getEmployeeById( int id ) {
        for( Employee e: employees) {
            if( e.getID() == id) {
                return e;
            }
        }
        return null;
    }

    public boolean fire( int id ) {
        Employee e = this.getEmployeeById(id);
        if( e == null ) {
            return false;
        }
        employees.remove(e);
        return false;
    }

    public int getNumEmployees() {
        return  employees.size();
    }

    public List<Manager> getManagers() {
        List<Manager> managers = new ArrayList<>();
        for( Employee e: employees ) {
            if( e.getClass() == Manager.class ) {
                managers.add( (Manager) e );
            }
        }
        return managers;
    }

    public void printEmployees() {
        for( Employee e: employees ) {
            System.out.println("\t" + e );
        }
    }

    public void sortBySalary(){
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary() - o2.getSalary();
            }
        });
    }
    public void sortBySalaryAndName(){
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if( o1.getSalary() == o2.getSalary()){
                    return o1.getName().compareTo(o2.getName());
                }
                return o1.getSalary() - o2.getSalary();
            }
        });
    }
}
