package lib;

public class LgCalc extends Calculator {

    @Override
    public int add(int a, int b) {
        System.out.println("LG calc Add");
        return a + b;
    }

    @Override
    public double average(int[] a) {
        System.out.println("LG Calc Avg");
        double sum = 0.0;
        for (int k : a) {
            sum = sum + k;
        }
        return sum / a.length;
    }

    @Override
    public int subract(int a, int b) {
        System.out.println("LG Calc sub");
        return a - b;
    }

}
