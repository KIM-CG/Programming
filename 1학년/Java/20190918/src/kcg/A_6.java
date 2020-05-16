package kcg;

class Car {
    String name;
    int speed;
    String color;
    void run()
    {
        System.out.printf("%s는 최고 속도가 %dKM이고, %s이다.\n", name, speed, color);
    }
    void parking()
    {
        System.out.println(name + "가 주차한다.");
    }
}


public class A_6 {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "람보르기니";
        car1.speed = 200;
        car1.color = "빨강색";
        car1.run();
        car1.parking();
        Car car2 = new Car();
        car2.name = "소나타";
        car2.speed = 150;
        car2.color = "파랑색";
        car2.run();
        car2.parking();
    }
}