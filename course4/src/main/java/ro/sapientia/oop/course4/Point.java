package ro.sapientia.oop.course4;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        if( x >= 0 && y >= 0) {
            this.x = x;
            this.y = y;
        }
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }
}
