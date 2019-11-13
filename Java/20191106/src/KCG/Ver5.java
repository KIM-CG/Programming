package KCG;

import java.util.Scanner;

class Change implements Length, Temperature, Capacity {
    public void calc() {
        while(true) {
            Scanner sc = new Scanner(System.in);
            int sel, num;
            System.out.println("1. Inch -> CM");
            System.out.println("2. CM -> M");
            System.out.println("3. 섭씨 -> 화씨");
            System.out.println("4. 화씨 -> 섭씨");
            System.out.println("5. Bit -> Byte");
            System.out.println("6. MB -> KB");
            System.out.println("7. 종료");
            System.out.println("==================");
            System.out.print("입력하세요 >>> ");
            sel = sc.nextInt();
            if(sel == 7) {
                return;
            }
            System.out.print("수를 입력해주세요 >>> ");
            num = sc.nextInt();
            switch(sel) {
                case 1:
                    Inch(num);
                    break;
                case 2:
                    Cm(num);
                    break;
                case 3:
                    Ceislus(num);
                    break;
                case 4:
                    Fahrenheit(num);
                    break;
                case 5:
                    Bit(num);
                    break;
                case 6:
                    Mb(num);
                    break;
                default:
                    break;
            }
        }
    }

    public void Inch(int num) {
        double result = num * tempcm;
        System.out.println("CM : " + result);
    }

    public void Cm(int num) {
        double result = num * tempm;
        System.out.println("M : " + result);
    }

    public void Ceislus(int num) {
        double result = ((double)num * 9/5) + data;
        System.out.println("화씨 : " + result);
    }

    public void Fahrenheit(int num) {
        double result = ((double)num - data) * 5/9;
        System.out.println("섭씨 : " + result);
    }

    public void Bit(int num) {
        double result = (double)num / tempbyte;
        System.out.println("Byte : " + result);
    }

    public void Mb(int num) {
        int result = num * tempkb;
        System.out.println("KB : " + result);
    }
}

interface Length {
    double tempcm = 2.54;
    double tempm = 0.01;
    void Inch(int num);
    void Cm(int num);
}

interface Temperature {
    int data = 32;
    void Ceislus(int num);
    void Fahrenheit(int num);
}

interface Capacity {
    int tempbyte = 8;
    int tempkb = 1000;
    void Bit(int num);
    void Mb(int num);
}

public class Ver5 {
    public static void main(String[] args) {
        Change cg = new Change();
        cg.calc();
    }
}