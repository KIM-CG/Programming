package kcg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, num;
        System.out.print("입력하려는 수의 개수 >>> ");
        num = sc.nextInt();
        int [] list = new int [num];
        for(i = 0; i < num; i++) {
            System.out.print((i+1) + "번째 수 입력 >>> ");
            list[i] = sc.nextInt();
        }
        int temp = list[0], save;
        for (i = 1; i < num; i++) {
            if (list[i] > temp) {
                save = list[i];
                list[i] = temp;
                temp = save;
            }
        }
        for(int str:list) {
            System.out.print(str + " ");
        }
    }
}
