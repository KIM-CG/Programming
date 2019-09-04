package kcg;

import java.util.Scanner;

public class A_6 {
    public static void main(String[] args) {
        game();
    }

    public static void game() {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위바위보 게임입니다.\n가위 | 바위 | 보 중에서 입력하세요.");
        System.out.print("철수 >> ");
        String player1 = sc.next();
        int ran = (int) (Math.random()*3+1);

        switch(ran) {
            case 1:
                System.out.println("영희 >> 가위");
                if (player1.equals("가위")) System.out.println("가위바위보에서 비겼습니다.");
                else if (player1.equals("바위")) System.out.println("영희가 가위바위보에서 이겼습니다.");
                else if (player1.equals("보")) System.out.println("철수가 가위바위보에서 이겼습니다.");
                break;
            case 2:
                System.out.println("영희 >> 바위");
                if (player1.equals("가위")) System.out.println("철수가 가위바위보에서 이겼습니다.");
                else if (player1.equals("바위")) System.out.println("가위바위보에서 비겼습니다.");
                else if (player1.equals("보")) System.out.println("영희가 가위바위보에서 이겼습니다.");
                break;
            case 3:
                System.out.println("영희 >> 보");
                if (player1.equals("가위")) System.out.println("영희가 가위바위보에서 이겼습니다.");
                else if (player1.equals("바위")) System.out.println("철수가 가위바위보에서 이겼습니다.");
                else if (player1.equals("보")) System.out.println("가위바위보에서 비겼습니다.");
        }

    }
}
