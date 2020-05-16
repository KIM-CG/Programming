package kcg;

import java.util.Scanner;

class Sum {
    int Sum(int sum1, int sum2) {
        return sum1 + sum2;
    }
    int Sum(int sum1, int sum2, int sum3) {
        return sum1 + sum2 + sum3;
    }
    int Sum(int sum1, int sum2, int sum3, int sum4) {
        return sum1 + sum2 + sum3 + sum4;
    }
}

public class A_7 {
    public static void main(String[] args) {
        Sum sum = new Sum();
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 번 입력할까요? ( 2 ~ 4 ) >>> ");
        int i, num = sc.nextInt();
        int cal = 0;
        int [] val = new int[num];
        for (i = 0; i < num; i++) {
            System.out.print((i + 1) + "번째 수를 입력하세요 >>> ");
            val[i] = sc.nextInt();
        }

        if (val.length == 2) {
            cal = sum.Sum(val[0], val[1]);
        } else if (val.length == 3) {
            cal = sum.Sum(val[0], val[1], val[2]);
        } else if (val.length == 4) {
            cal = sum.Sum(val[0], val[1], val[2], val[3]);
        }

        System.out.println("합계 : " + cal);
    }
}
