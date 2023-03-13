package ro.sapientia.oop.course5;

import ro.sapientia.oop.course5.model.Course;
import ro.sapientia.oop.course5.model.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println(Student.getCounter());
        Student student1 = new Student("Baka", "Balint");
        Student student2 = new Student("Hegyi", "Julianna");
        Student student3 = new Student("Elekes", "Jeno");
        System.out.println(Student.getCounter());

        Course course1 = new Course("OOP");
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course1.enrollStudent(student3);
        course1.enrollStudent(student3);

        System.out.println("-------\n" + course1);
        course1.printStudents();

        course1.unenroll(student3);
        System.out.println("-------\nTorles utan\n" + course1);
        course1.printStudents();
//        IGY NE!!!
//        System.out.println(student1.getCounter());
//        System.out.println((new Student("X", "Y")).getCounter());
        Course course2 = new Course("DSA");
        course2.enrollStudent(student1);
        course2.enrollStudent(student2);
        course2.enrollStudent(student3);
        System.out.println("-------\n" + course2);
        course2.printStudents();

        System.out.println("Diak kurzusai: " + student1);
        student1.printCourses();
        System.out.println("Diak kurzusai: " + student3);
        student3.printCourses();
    }
}
