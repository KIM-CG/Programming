package kcg;

import java.util.Scanner;

public class A_4 {
    public static void main(String[] args) {
        success();
    }

    public static void success() {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요 : ");
        int score = sc.nextInt();
        if (score > 100 || score < 0) System.out.println("잘못입력 되었습니다.");
        else if (score >= 90) System.out.println("상");
        else if (score >= 60 && score < 90) System.out.println("중");
        else if (score < 60) System.out.println("하");
        sc.close();
    }
}
