package kcg;

import java.util.Scanner;

class EMP {
    String name;
    int num;
    int pay;
    int tax() {
        return (int) (pay * 0.033);
    }

    int Money() {
        return pay - tax();
    }
    void show() {
        System.out.printf("%s 님의 월급은 %d원이며, 세금은 %d원 입니다.", name, pay, tax());
    }
    EMP() {}

    EMP(String name, int num) {
        this(name, num, 1200000);
    }

    EMP (String name, int num, int pay) {
        this.name = name; this.num = num; this.pay = pay;
    }
}

public class A_8 {
    public static void main(String[] args) {
        EMP[] arr = new EMP[2];
        Scanner sc = new Scanner(System.in);
        String name;
        int num, pay;
        int i;
        for(i = 0; i < arr.length; i++) {
            System.out.print("이름 >>> ");
            name = sc.next();
            System.out.print("사원번호 >>> ");
            num = sc.nextInt();
            System.out.print("월급 >>> ");
            pay = sc.nextInt();
            arr[i]  = new EMP(name, num, pay);
        }
    }
}
