package main;

import lib.LgCalc;
import lib.Calculator;

public class CalcTest {

    public static void main(String[] args) {
        Calculator c = new LgCalc();
        System.out.println(c.add(2, 3));
        System.out.println(c.subract(2, 3));
        System.out.println(c.average(new int[] { 2, 3, 4, 5 }));
    }
}
