package main;

import lib.Circle;

public class CircleTest {
    public static void main(String[] args) {
        /*  
        Circleclass에 멤버 변수의 접근 지정자가 public 일때는
        Circle pizza = new Circle();
        pizza.name = "피자";
        pizza.radious = "10";
        */
        Circle pizza = new Circle(10, "피자");
        Circle donut = new Circle(5, "도넛");

        System.out.print(pizza.getName()+" : ");
        System.out.println(pizza.getArea());
        System.out.print(donut.getName()+" : ");
        System.out.println(donut.getArea());
    }
}
