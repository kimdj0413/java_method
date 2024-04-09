package lib;

public class CircleforStudy {
    // String name; 접근 지정 없음(default) :
    // 같은 패키지만 접근 가능. 캡슐화 깨짐. CircleTest에서 직접 못가져다 씀.

    private String name; // pivate은 내부 멤버만 접근 가능.
    // CircleTest에서 직접 못가져다 씀.
    // 접근 지정자를 public으로 바꾸면 가져다 쓸 수 있지만 보호 깨짐.
    private int radious;

    public double getArea(int radious){
        this.radious = radious;
        return 3.14 * this.radious * this.radious;
        // this.radious 해야 멤버변수에서 호출.
        // this를 쓰지 않으면 다른 곳에서 찾아옴.
    }
    public void thisName(String name){
        this.name = name;
        System.out.println("이름 : "+name);
    }
}
