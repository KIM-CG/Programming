package KCG.main;

import java.util.Scanner;

public class Ver2 {
    void convert(Integer data) {
        System.out.println("2진수 : " + Integer.toBinaryString(data));
        System.out.println("8진수 : " + Integer.toOctalString(data));
        System.out.println("16진수 : " + Integer.toHexString(data));
    }
    public static void main(String[] args) {
        Ver2 v2 = new Ver2();
        Scanner sc = new Scanner(System.in);
        System.out.print("10진수를 입력해주세요 >>> ");
        Integer data = sc.nextInt();
        v2.convert(data);
    }
}
