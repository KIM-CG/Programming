package KCG;

import org.w3c.dom.ls.LSOutput;

class Parents {
    private String name;
    private int age;
    void show() {
        System.out.println("보여주기");
    }
}

class Child1 extends Parents {
    int a;
}

class Child2 extends Parents {
    int b;
    void show() {
        //System.out.println(name + age + b);
    }
}

class GrandSon extends Child1 {
    float c;

}


public class KCG_1 {
    public static void main(String[] args) {
        Child2 c2 = new Child2();
        c2.show();

    }
}
