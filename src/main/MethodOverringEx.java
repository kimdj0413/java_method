package main;

import lib.Shape;
import lib.Star;
import lib.Atmos;
import lib.Line;
import lib.Rect;

public class MethodOverringEx {

    private static void paint(Shape p){
        p.draw();
    }

    public static void main(String[] args) {
        // Shape shape = new Shape();
        Shape shape = new Line();
        // Shape shape = new Rect();
        // Shape shape = new Atmos();
        // Shape shape = new Star();
        paint(shape);
        paint(new Line());
        paint(new Rect());
        paint(new Atmos());
        paint(new Star());
    }
}