package kcg;

public class A_3 {

    public static void main(String[] args) {

        int a = 1;
        for(int i=1; i <= 15; i++) {
            System.out.println("쉬프트 " + i + "번 : " + (a << i));
        }
    }

}
