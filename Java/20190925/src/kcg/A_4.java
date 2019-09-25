package kcg;

import java.util.Scanner;

class TV {
    String model;
    boolean status = false;
    int channel, volume;
    public TV(String model, int channel) {
        this.model = model;
        this.channel = channel;
    }
    public void on() {
        System.out.println(model + " 모델이 켜졌습니다. [ 현재 채널번호 : " + channel + " ]");
        this.status = true;
    }
    public void off() {
        System.out.println(model + " 모델이 꺼졌습니다.");
        return;
    }
    public void up() {
        if (status == false) {
            System.out.println("[ 현재 상태 : OFF ] 전원을 켜주세요.");
            return;
        }
        if (channel < 20) {
            channel++;
        } else {
            channel = 1;
        }
        System.out.println("[ 현재 채널번호 : " + channel + " ]");
    }
    public void down() {
        if (status == false) {
            System.out.println("[ 현재 상태 : OFF ] 전원을 켜주세요.");
            return;
        }
        if (channel > 1) {
            channel--;
        } else {
            channel = 20;
        }
        System.out.println("[ 현재 채널번호 : " + channel + " ]");
    }
}

public class A_4 {
    public static void main(String[] args) {
        String type;
        Scanner sc = new Scanner(System.in);
        TV t1 = new TV("LG wide", 1);
        while (true) {
            System.out.print("어떤 작업을 할까요? >>> ");
            type = sc.next();
            switch (type) {
                case "on":
                    t1.on();
                    break;
                case "off":
                    t1.off();
                    return;
                case "+":
                    t1.up();
                    break;
                case "-":
                    t1.down();
                    break;
            }
        }
    }
}
