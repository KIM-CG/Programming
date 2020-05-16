package KCG;

import KCG.Factory.Hello;

public class Ver2 implements Hello {
    public void show() {
        int a = 10;
        System.out.println(Integer.toBinaryString(a));
    }
    public void display(){
        String a = "자바";
        String b = "언어";
        String c = a.concat(b);
        System.out.println(c);
        System.out.println("바="+c.charAt(1));
        System.out.println("어="+c.charAt(3));
    }
    public static void main(String[] args) {
        Ver2 a = new Ver2();
        a.show();
        a.display();

    }
}
