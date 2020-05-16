import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("반지름 : ");
        float x = sc.nextFloat();
        area(x);
        cir(x);
    }

    public static void area(float r) {
        final double PI = 3.141592;
        System.out.println(r * r * PI);
    }
    public static void cir(float r) {
        System.out.println(r * r);
    }
}
