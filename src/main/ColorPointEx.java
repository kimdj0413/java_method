package main;

import lib.ColorPoint;
import lib.Point;

public class ColorPointEx {
    public static void main(String[] args) {
        Point point = new Point();
        point.setXY(1, 2);

        point.showPoint();

        ColorPoint colorPoint = new ColorPoint();
        colorPoint.setXY(3, 4);
        colorPoint.setColor("Red");

        colorPoint.showColorPoint();
    }
}