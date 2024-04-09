package lib;


public class Student {
//  반, 이름, 학점 멤버(this로 접근) 변수(object에 생성되는 변수)
    private static int ban = 1; //static을 붙이는 이유는 공유하기 위해.
    private String name;
    private String hakbun;

    public Student(String name, String hakbun){
        this.name = name;
        this.hakbun = hakbun;
    }
    public void printName(){
        System.out.println("이름 : " + this.name);
    }
    public void printBan(){
        System.out.println("반 : " + this.ban);
    }
    public void printHakbun(){
        System.out.println("학번 : " + this.hakbun);
    }
    public void printStudent(){
        printBan();
        printHakbun();
        printName();
    }
    public void setBan(int ban){
        this.ban = ban;
    }
}