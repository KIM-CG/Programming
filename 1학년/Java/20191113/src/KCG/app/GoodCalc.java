package KCG.app;

import KCG.lib.Calc;

public class GoodCalc extends Calc {
    public int add(int a, int b) {
        return a+b;
    }

    public int sub(int a, int b) {
        return a-b;
    }

    public int mul(int a, int b) {
        return a*b;
    }

    public static void main(String[] args) {
        GoodCalc g = new GoodCalc();
        System.out.println("add : " + g.add(6,4));
        System.out.println("sub : " + g.sub(5,3));
        System.out.println("mul : " + g.mul(4,2));

    }
}
