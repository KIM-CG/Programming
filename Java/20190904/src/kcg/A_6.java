package kcg;

import java.util.Scanner;

public class A_6 {
    public static void main(String[] args) {
        game();
    }

    public static String com() {
        int ran = (int) (Math.random()*3+1);
        if(ran == 1) return "가위";
        else if(ran == 2) return "바위";
        else if(ran == 3) return "보";
        else return null;
    }

    public static void game() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("가위바위보 게임입니다.\n가위 | 바위 | 보 중에서 입력하세요.\n게임을 중지하려면 종료를 입력하세요.");
            System.out.print("철수 >> ");
            String player = sc.next();
            String computer = com();
            if (player.equals("종료")) break;
            System.out.println("영희 >> " + computer);
            if ((player.equals("가위") && computer.equals("가위")) || (player.equals("바위") && computer.equals("바위")) || (player.equals("보") && computer.equals("보"))) System.out.println("가위바위보에서 비겼습니다.");
            else if ((player.equals("가위") && computer.equals("바위")) || (player.equals("바위") && computer.equals("보")) || (player.equals("보") && computer.equals("가위"))) System.out.println("영희가 가위바위보에서 이겼습니다.");
            else if ((player.equals("가위") && computer.equals("보")) || (player.equals("바위") && computer.equals("가위")) || (player.equals("보") && computer.equals("바위"))) System.out.println("철수가 가위바위보에서 이겼습니다.");
        }
    }
}
