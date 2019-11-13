package KCG.app;

import KCG.lib.Cpkg;

import java.util.Scanner;

public class Cpkgload implements Cpkg {
    public void show(int cm) {
        System.out.println(cm + "cm > " + cm * c + "mm");
    }

    public static void main(String[] args) {
        Cpkgload cl = new Cpkgload();
        Scanner sc = new Scanner(System.in);
        System.out.print("mm로 변환할 cm를 입력해주세요 >>> ");
        int data = sc.nextInt();
        cl.show(data);
    }
}
