package lib;

public class Circle {
    // 변수선언
    private int radius;
    private String name;

    // 생성자 선언 : 멤버변수 초기화
    public Circle(){
        this.radius = 1;
        this.name = ""; // NULL을 의미
    }

    // 이름은 동일하고 파라미터가 상이하게 메소드 선언 : 메소드 오버로딩
    public Circle(int radius, String name){
        this.radius = radius;
        this.name = name;
    }

    // 메소드 선언
    public double getArea(){
        return 3.14 * this.radius * this.radius;
    }

    // name 꺼내주는 메소드
    public String getName(){
        return this.name;
    }

}
