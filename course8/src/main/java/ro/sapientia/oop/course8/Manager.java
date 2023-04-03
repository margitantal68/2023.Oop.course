package ro.sapientia.oop.course8;


public class Manager extends Employee{
    private String department;

    public Manager(String name, int birtYear, int salary, String department){
        super(name, birtYear, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }


    @Override
    public String toString() {
        return "Manager{ " + this.getName() + ", " + this.getBirthYear() + ", " + this.getSalary() + ", department: " + department + " }";
    }
}

