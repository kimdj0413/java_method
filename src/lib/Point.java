package lib;

public class Point {
    private int x;
    private int y;

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.println("(" + this.x + "," + this.y + ")");
    }
}