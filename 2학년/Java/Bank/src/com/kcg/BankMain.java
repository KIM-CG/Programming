package com.kcg;

import java.util.Scanner;

class Bank {
    private String name;
    private String password;
    public int balance;

    public Bank(String name, String password, int balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
    }

    public void setInput(int bal) {
        int hasmoney = this.balance;
        this.balance += bal;
        System.out.println(name + "님의 계좌 입금 후 잔액조회 : " + hasmoney + " > " + this.balance);
    }

    public void setOutput(int bal) {
        int hasmoney = this.balance;
        if (hasmoney < bal) {
            System.out.println("소유중인 잔액이 부족합니다.");
        } else {
            this.balance -= bal;
            System.out.println(name + "님의 계좌 출금 후 잔액조회 : " + hasmoney + " > " + this.balance);
        }
    }

    public void getBalance() {
        System.out.println("잔액조회 : " + this.balance);
    }
}

public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank("김채규", "1234", 12500);
        while (true) {
            System.out.println("1. 입금하기");
            System.out.println("2. 출금하기");
            System.out.println("3. 잔액조회");
            System.out.print("작업을 선택해주세요 : ");
            int sel = sc.nextInt();
            int bal = 0;
            switch (sel) {
                case 1:
                    System.out.print("입금하려는 금액을 입력해주세요 : ");
                    bal = sc.nextInt();
                    b.setInput(bal);
                    break;
                case 2:
                    System.out.print("출금하려는 금액을 입력해주세요 : ");
                    bal = sc.nextInt();
                    b.setOutput(bal);
                    break;
                case 3:
                    b.getBalance();
                    break;
                default:
                    System.out.println("작업을 다시 선택해주세요.");
            }
        }
    }
}