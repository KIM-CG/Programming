package KCG.app;

import KCG.lib.Coke;

public class CokeTest implements Coke {
    public void show(int radius) {
        System.out.println(radius * radius * pi);
    }

    public static void main(String[] args) {
        CokeTest c = new CokeTest();
        c.show(10);
    }
}
