package KCG.app;

import KCG.lib.*;

public class ColaTest extends Calc implements Coke {

    public int add(int a, int b) {
        return a+b;
    }

    public int sub(int a, int b) {
        return a-b;
    }

    public int mul(int a, int b) {
        return a*b;
    }

    public void show(int radius) {
        int data1 = mul(radius, radius);
        double data2 = data1 * pi;
        System.out.println(data2);
    }

    public static void main(String[] args) {
        ColaTest ct = new ColaTest();
        ct.show(15);
    }
}
