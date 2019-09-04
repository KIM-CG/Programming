package kcg;

import java.util.Scanner;

public class A_5 {
    public static void main(String[] args) {
        coffee();
    }

    public static void coffee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== [ 메뉴 ] ====\n1. 에스프레소 [ 1500 ]\n2. 아메리카노 [ 2000 ]\n3. 녹차라떼 [ 3400 ]\n4. 카푸치노 [ 3800 ]");
        System.out.print("무슨 커피를 주문하시겠습니까? : ");
        String order = sc.next();
        System.out.print("몇 잔을 주문하시겠습니까? : ");
        int ea = sc.nextInt();
        int price = 0;
        switch (order) {
            case "에스프레소":
                price = 1500;
                break;
            case "아메리카노":
                price = 2000;
                break;
            case "녹차라떼":
                price = 3400;
                break;
            case "카푸치노":
                price = 3800;
                break;
        }
        System.out.println(order + " " + ea +"잔은 총 " + (price * ea) + "원 입니다.");
    }
}
