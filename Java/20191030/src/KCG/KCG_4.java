package KCG;

abstract class Calculator {
    abstract int add(int a, int b);
    abstract int subtract(int a, int b);
    abstract double average(int[] a);
    abstract int multiple(int a, int b);
}

class GoodCalc extends Calculator {

    @Override
    int add(int a, int b) {
        return a + b;
    }

    @Override
    int subtract(int a, int b) {
        return a - b;
    }

    @Override
    double average(int[] a) {
        double sum = 0;
        for(int s : a) {
            sum += s;
        }
        return sum/a.length;
    }

    @Override
    int multiple(int a, int b) {
        return a * b;
    }
}

public class KCG_4 {
    public static void main(String[] args) {
        int a[] = new int[2];
        a[0] = 7;
        a[1] = 5;
        GoodCalc gc = new GoodCalc();
        System.out.println(gc.add(2, 3));
        System.out.println(gc.subtract(5, 2));
        System.out.println(gc.average(a));
        System.out.println(gc.multiple(7,8));
    }
}
