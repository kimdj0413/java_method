package main;

import lib.Student;// 패키지가 다를 경우 import

public class StudentTest {
    public static void main(String[] args){
//  첫번째 학생 공간 => object 생성
        Student hong = new Student("홍길동","202401"); 
//  두번째 학생 공간 => object 생성
        Student kim = new Student("김수한무","202402");

        // hong.setBan(10); 10으로 ban을 바꾸면 kim도 반이 바뀜.

        hong.printStudent();
        kim.printStudent();
    }
}
