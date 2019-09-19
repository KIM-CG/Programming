package kcg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, num, min = 0;
        System.out.print("입력하려는 수의 개수 >>> ");
        num = sc.nextInt();
        int [] list = new int [num];
        int [] save = new int [num];
        for(i = 0; i < num; i++) {
            System.out.print((i+1) + "번째 수 입력 >>> ");
            list[i] = sc.nextInt();
        }
        for(i = 0; i < num; i++) {
            for (j = 0; j < list.length; j++) {
                if(list[j] < min) {
                    min = list[j];
                }
            }

            save[i] = min;
            min = 0;
        }
        for(int str:save) {
            System.out.print(str + " ");
        }
    }
}
