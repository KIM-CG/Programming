package kcg;

import java.util.Scanner;

public class A_8 {
    public static void main(String[] args) {
        String sel;
        Scanner sc = new Scanner(System.in);
        while (true) {
            game();
            System.out.print("다시하시겠습니까(Y / N) >> ");
            sel = sc.next();
            switch (sel) {
                case "y":
                case "Y":
                    break;
                default:
                    return;
            }
        }
    }

    public static int randomint() {
        int ran = (int) (Math.random()*99);
        return ran;
    }

    public static void game() {
        Scanner sc = new Scanner(System.in);
        int i = 1, num, rannum, numlow = 0, numhigh = 99;
        rannum = randomint();
        System.out.println("수를 결정하였습니다. 맞추어 보세요");
        while (true) {
            System.out.println(numlow + " - " + numhigh);
            System.out.print(i + " >> ");
            num = sc.nextInt();
            if(num < rannum) {
                numlow = num;
                System.out.println("더 높게");
            } else if (num > rannum) {
                numhigh = num;
                System.out.println("더 낮게");
            } else if (num == rannum) {
                System.out.println("맞았습니다.");
                break;
            }
            i++;
        }
    }
}
