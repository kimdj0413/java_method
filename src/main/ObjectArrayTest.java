package main;

import lib.Circle;

public class ObjectArrayTest {
    public static void main(String[] args) {
        Circle[] c = new Circle[5];

        c[0] = new Circle(0);
        c[1] = new Circle(1);
        c[2] = new Circle(2);
        c[3] = new Circle(3);
        c[4] = new Circle(4);

        for (int i = 0; i < 5; i++) {
            c[i] = new Circle(i);
        }
        System.out.println(c[0].getArea());
        System.out.println(c[1].getArea());
        System.out.println(c[2].getArea());
        System.out.println(c[3].getArea());
        System.out.println(c[4].getArea());
    }
}
