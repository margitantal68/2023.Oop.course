package ro.sapientia.oop.course6;

public class Manager extends Employee{
    private String department;

    public Manager(String name, int birtYear, int salary, String department){
        super(name, birtYear, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public char getFirtsCharOfName(){
        return this.name.charAt(0);
    }

    @Override
    public String toString() {
        return "Manager{ " + super.toString() +", department: " + department +"}";
    }
}
