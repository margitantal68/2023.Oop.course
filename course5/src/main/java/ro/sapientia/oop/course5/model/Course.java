package ro.sapientia.oop.course5.model;

import java.util.ArrayList;

public class Course {
    private String id;
    private static int counter;
    public final static String PREFIX = "Course_";
    private String name;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(String name) {
        this.name = name;
        ++counter;
        this.id = PREFIX + counter;
    }

    public String getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public boolean enrollStudent(Student student) {
        if( !students.contains(student)) {
            students.add(student);
            student.addCourse(this);
            return true;
        }
        return false;
    }

    public boolean unenroll(Student student) {
        boolean result = students.remove(student);
        if( result ) {
            student.removeCourse(this);
        }
        return result;
    }

    public void printStudents(){
        for(Student student: students) {
            System.out.println(student);
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
