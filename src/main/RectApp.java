package main;

import java.util.Scanner;

import lib.Rectangle;

public class RectApp {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Scanner scan = new Scanner(System.in);

        System.out.println("넓이와 높이 입력 : ");
        rect.width = scan.nextInt();
        rect.height = scan.nextInt();

        System.out.println("사각형의 면적 : "+rect.getArea());
        scan.close();
    }
}
