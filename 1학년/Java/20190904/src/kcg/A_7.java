package kcg;

import java.math.BigInteger;
import java.util.Scanner;

public class A_7 {

    public static void main(String[] args) {
        fact();
    }

    static void fact() {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger("1");
        BigInteger sum = new BigInteger("1");
        System.out.print("팩토리얼을 실행할 임의의 수를 입력하세요 : ");
        int num = sc.nextInt();
        sc.close();
        for(int i = 2; i <= num; i++) {
            a = a.add(BigInteger.ONE);
            sum = sum.multiply(a);
        }
        System.out.print(sum);
        System.out.println(num + " 팩토리얼 : " + sum);
    }
}
