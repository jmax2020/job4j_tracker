package ru.job4j.oop;

public class Max {

    public static int max (int x, int y) {
        return Math.max(x, y);
    }

    public static int max (int x, int y, int z) {
        return max(x, max(y, z));
    }

    public static int max (int x, int y, int z, int p) {
        return max(max(x, y), max (z, p));
    }

    public static void main(String[] args) {
        System.out.println(max(4, 7));
        System.out.println(max(5, 6, 8));
        System.out.println(max(1,3,6,0));
    }
}
