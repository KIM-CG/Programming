package kcg;

public class A_3 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.width = 5;
        r.height = 10;
        System.out.println(r.getRadius());

        Rectangle r2 = new Rectangle(7 , 8);
        System.out.println(r2.getArea());
    }
}
