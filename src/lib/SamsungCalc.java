package lib;

public class SamsungCalc extends Calculator {

    @Override
    public int add(int a, int b) {
        System.out.println("Samsung calc Add");
        return a + b;
    }

    @Override
    public int subract(int a, int b) {
        System.out.println("Samsung Calc sub");
        return a - b;
    }

    @Override
    public double average(int[] a) {
        System.out.println("Samsung Calc Avg");
        double sum = 0.0;
        for (int k : a) {
            sum = sum + k;
        }
        return sum / a.length;
    }
}