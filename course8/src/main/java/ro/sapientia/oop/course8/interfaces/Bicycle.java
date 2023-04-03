package ro.sapientia.oop.course8.interfaces;

public class Bicycle implements Driveable{
    @Override
    public void start() {
        System.out.println("Bicycle starts");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stops");
    }
}
