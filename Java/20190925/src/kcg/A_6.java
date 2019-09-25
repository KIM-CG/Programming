package kcg;

import java.util.Scanner;

public class A_6 {
    public static void main(String[] args) {
        int i;
        Student [] stu = new Student[3];

        Scanner sc = new Scanner(System.in);
        for(i = 0; i < stu.length; i++) {
            System.out.print("이름 >>> ");
            String name = sc.next();
            System.out.print("국어 >>> ");
            int kor = sc.nextInt();
            System.out.print("수학 >>> ");
            int mat = sc.nextInt();
            System.out.print("영어 >>> ");
            int eng = sc.nextInt();
            stu[i] = new Student(name, kor, mat, eng);
        }

        for(i = 0; i < stu.length; i++) {
            System.out.printf("이름 : %s | 합계 : %d | 평균 : %.1f | 학점 : %c\n", stu[i].name, stu[i].Sum(), stu[i].Avg(), stu[i].Grade());
        }
        sc.close();
    }
}
