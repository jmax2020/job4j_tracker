package ru.job4j.oop;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point that) {
        return   sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point one = new Point(0, 0);
        Point two = new Point(3, 4);
        double result = one.distance(two);
        System.out.println("distance (0,0) to (3,4) " + result);
    }
}
