package ro.sapientia.oop.course3;

import ro.sapientia.oop.course3.strings.TestJavaStrings;

public class MainCourse3 {
    public static void main(String[] args) {
//        Person person1 = new Person("Demeter Evelin", 2002);
//        Person person2 = new Person(person1);
//
//        System.out.println(person1);
//        System.out.println(person2);
        int n = 1000000;

        long start = System.currentTimeMillis();
        TestJavaStrings.concatenateStringBuilder(n);
        long stop = System.currentTimeMillis();
        System.out.println("StringBuilder - Elapsed time: " + (stop - start));

        start = System.currentTimeMillis();
        TestJavaStrings.concatenateStringBuffer(n);
        stop = System.currentTimeMillis();
        System.out.println("StringBuffer - Elapsed time: " + (stop - start));

        start = System.currentTimeMillis();
        TestJavaStrings.concatenateStrings(n);
        stop = System.currentTimeMillis();
        System.out.println("String - Elapsed time: " + (stop - start));

    }


    private static void passPrimitive(int x){
        ++x;
    }
}
