package kcg;

import java.util.Scanner;

public class A_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;

        System.out.print("인원수는 몇명인가요? >>> ");
        int usernum = sc.nextInt();
        String[] users = new String[usernum];
        for(i = 0; i < usernum; i++) {
            System.out.println((i + 1) + "번째 학생 : ");
            users[i] = sc.next();
        }

        System.out.print("몇월까지 기록할까요? >>> ");
        int dalnum = sc.nextInt();
        int [][] jumsu = new int [dalnum][usernum];
        for(i = 0; i < dalnum; i++) {
            for(j = 0; j < usernum; j++) {
                System.out.println(users[j] + " 학생 " + (i + 3) + "월 " + "점수 : ");
                jumsu[i][j] = sc.nextInt();
            }
        }

        int [] sum = new int [users.length];
        float [] avg = new float [users.length];

        System.out.print("\t\t");
        for (String str:users)
            System.out.print(str + "\t");
        System.out.println();

        for (i = 0; i < jumsu.length; i++) {
            if(dalnum < jumsu.length + users.length + 1) {
                System.out.print(dalnum + "月\t\t");
            }
            for (j = 0; j < jumsu[0].length; j++) {
                if(dalnum < jumsu.length + users.length + 1) {
                    System.out.print(jumsu[i][j] + "\t\t");
                }
            }
            dalnum++;
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