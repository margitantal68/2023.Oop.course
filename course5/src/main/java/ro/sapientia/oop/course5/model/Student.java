package ro.sapientia.oop.course5.model;

import java.util.ArrayList;

public class Student {
    private int id;
    private static int counter;
    private String firstName;
    private String lastName;
    private ArrayList<Course> courses = new ArrayList<>();

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        ++counter;
        id = counter;
    }

    public boolean addCourse(Course course){
        if( !courses.contains(course)) {
            courses.add(course);
            return true;
        }
        return false;
    }

    public boolean removeCourse(Course course){
        return courses.remove(course);
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void printCourses() {
        for(Course course: courses) {
            System.out.println("\t" + course);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
