package ro.sapientia.oop.course3;

public class MainCourse3 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("n: " + n);
        passPrimitive(n);
        System.out.println("n: " + n);
    }

    private static void passPrimitive(int x){
        ++x;
    }
}
