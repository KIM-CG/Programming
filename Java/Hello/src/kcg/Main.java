package kcg;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int i, j = 0;
        String plain;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("암호하려는 이진수 4비트를 입력해주세요 >>> ");
            plain = sc.next();
            if (plain.length() == 4) break;
            else System.out.println("4비트를 입력해주세요.");
        }
        char [] LE = new char[2], RE = new char[2], TMP1 = new char[2], TMP2 = new char[2];
        //반절 나누기
        for (i = 0; i < 2; i++) {
            LE[i] = plain.charAt(i);
            RE[i] = plain.charAt(i + 2);
        }
        for(i = 0; i < 2; i++) {
            if (i == 0) {
                if ((RE[0] == 0 && RE[1] == 0)) {
                    RE[0] = 1; RE[1] = 0;
                } else if ((RE[0] == 0 && RE[1] == 1)) {
                    RE[0] = 0; RE[1] = 0;
                } else if ((RE[0] == 1 && RE[1] == 0)) {
                    RE[0] = 1; RE[1] = 1;
                } else if ((RE[0] == 1 && RE[1] == 1)) {
                    RE[0] = 1; RE[1] = 0;
                }
                for(j = 0; j < 2; j++) {
                    TMP1[j] = RE[j];
                    TMP2[j] = (char) (LE[j] ^ RE[j]);
                    LE[j] = TMP1[j];
                    RE[j] = TMP2[j];
                }
            }
            else {
                if ((RE[0] == 0 && RE[1] == 0)) {
                    RE[0] = 0; RE[1] = 0;
                } else if ((RE[0] == 0 && RE[1] == 1)) {
                    RE[0] = 1; RE[1] = 1;
                } else if ((RE[0] == 1 && RE[1] == 0)) {
                    RE[0] = 1; RE[1] = 0;
                } else if ((RE[0] == 1 && RE[1] == 1)) {
                    RE[0] = 0; RE[1] = 1;
                }
                for(j = 0; j < 2; j++) {
                    TMP1[j] = RE[j];
                    TMP2[j] = (char) (LE[j] ^ RE[j]);
                    LE[j] = TMP1[j];
                    RE[j] = TMP2[j];
                }
            }
        }
        System.out.print("암호 : ");
        for (i = 0; i < 2; i++) {
            System.out.print(LE[i]);
        }
        for (i = 0; i < 2; i++) {
            System.out.print(RE[i]);
        }
    }
}