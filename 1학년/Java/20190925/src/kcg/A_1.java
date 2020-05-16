package kcg;

import java.util.Scanner;

class Rectangle {
    int width;
    int height;
    public Rectangle() {}
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getArea() { return width * height; }
    public int getRadius() { return (width + height) * 2; }
}


public class A_1 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.print("가로의 길이를 입력하세요 >>> ");
        rect.width = sc.nextInt();
        System.out.print("세로의 길이를 입력하세요 >>> ");
        rect.height = sc.nextInt();
        sc.close();
        System.out.println("사각형의 면적 : " + rect.getArea());
        System.out.println("사각형의 둘레 : " + rect.getRadius());
    }
}
