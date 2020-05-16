package kcg;

import java.util.Scanner;

public class A_3 {
    public static void main(String[] args) {
        String[] users = {"홍길동", "홍길순", "홍길영", "홍영순", "홍영동"};
        int [][] jumsu = {{27, 67, 100, 70, 20}, {100, 67, 100, 20, 96}, {40, 20, 10, 68, 89}};
        int [] sum = new int [users.length];
        float [] avg = new float [users.length];
        int i, j, dal = 2;
        System.out.print("\t\t");
        for (String str:users)
            System.out.print(str + "\t");
        System.out.println();

        for (i = 0; i < jumsu.length; i++) {
            dal++;
            if(dal < jumsu.length + users.length) {
                System.out.print(dal + "月\t\t");
            }
            for (j = 0; j < jumsu[0].length; j++) {
                if(dal < jumsu.length + users.length) {
                    System.out.print(jumsu[i][j] + "\t\t");
                }
            }
            System.out.println();
        }

        for(i = 0; i < jumsu.length; i++) {
            for (j = 0; j < jumsu[0].length; j++) {
                sum[j] += jumsu[i][j];
            }
        }
        System.out.println("======================================");

        System.out.print("합계\t\t");
        for (i = 0; i < jumsu[0].length; i++) {
            System.out.print(sum[i] + "\t\t");
        }
        System.out.println();

        for(i = 0; i < jumsu[0].length; i++) {
            avg[i] += (float)sum[i] / jumsu.length;
        }

        System.out.print("평균\t\t");
        for (i = 0; i < jumsu[0].length; i++) {
            System.out.printf("%.1f\t", avg[i]);
        }
        System.out.println();
    }
}