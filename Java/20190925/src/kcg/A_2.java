package kcg;

import java.util.Scanner;

class Student {
    String name;
    int kor, mat, eng;
    char grade;
    public int Sum() {
        return kor + mat + eng;
    }
    public float Avg() {
        return (float) Sum() / 3;
    }
    public char Grade() {
        if (Avg() >= 90) {
            grade = 'A';
        } else if (Avg() >= 80) {
            grade = 'B';
        } else if (Avg() >= 70) {
            grade = 'C';
        } else if (Avg() >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }
    public Student() {
    }
    public Student(String name, int kor, int mat, int eng) {
        this.name = name;
        this.kor = kor;
        this.mat = mat;
        this.eng = eng;
    }
}
public class A_2 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름을 입력하세요 >>> ");
        stu1.name = sc.next();
        System.out.print("국어 점수를 입력하세요 >>> ");
        stu1.kor = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 >>> ");
        stu1.mat = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 >>> ");
        stu1.eng = sc.nextInt();
        System.out.println("이름 : " + stu1.name);
        System.out.print("국어 : " + stu1.kor);
        System.out.print(" | 수학 : " + stu1.mat);
        System.out.println(" | 영어 : " + stu1.eng);
        System.out.println("합계 : " + stu1.Sum());
        System.out.println("평균 : " + stu1.Avg());
        System.out.println("학점 : " + stu1.Grade());

    }
}
