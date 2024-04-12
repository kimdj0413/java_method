package lib;

public class ColorPoint extends Point {
    private String color;

    public void setColor(String color) {
        this.color = color;
        return;

    }

    public void showColorPoint() {
        super.showPoint();
        System.out.println(this.color);
    }
}
