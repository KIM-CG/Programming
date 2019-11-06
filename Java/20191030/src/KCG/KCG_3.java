package KCG;

class Calc {
    void calc(int a, int b) {

    }
}

class plus extends Calc {
    void calc(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a+b));
    }
}

class minus extends Calc {
    void calc(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a-b));
    }
}

class multiple extends Calc {
    void calc(int a, int b) {
        System.out.println(a + " * " + b + " = " + (a*b));
    }
}


public class KCG_3 {
    public static void main(String[] args) {
        //업캐스팅
        Calc c [] = new Calc[3];

        c[0] = new plus();
        c[1] = new minus();
        c[2] = new multiple();
        for(Calc cc : c) {
            cc.calc(5, 3);

        }
    }
}
