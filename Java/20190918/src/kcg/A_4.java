package kcg;

public class A_4 {
    public static void main(String[] args) {
        try {
            int a = 7, b = 6;
            int c = a/b;
            System.out.println("몫 = " + c);
        } catch(ArithmeticException e) {
            System.out.println("나누는 값이 없습니다.");
        }
    }
}