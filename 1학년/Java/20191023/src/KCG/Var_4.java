package KCG;

class Animal {
    protected String Name;
    protected int Num;
    void eat() {
        System.out.println(Name + "가 빵을 " + Num + "개 먹는다.");
    }
    void sleep() {
        System.out.println(Name + "가 " + Num + "일동안 잔다.");
    }
    Animal() { }
    Animal(String name, int num) { Name = name; Num = num; }
}

class Human extends Animal {
    private int Money;

    void work() {
        System.out.println(Name + "네는 가족수가 " + Num + "명이고, 생활비는 " + Money + "만원이다.");
    }
    Human(String name, int num, int money) {
        super(name, num); Money = money;
        work();
    }
}

class Turtle extends Animal {
    private String Color;
    private String Rice;

    void move() {
        System.out.println(Color + "의 " + Name + "는 " + Num + "개의 " + Rice + "을/를 먹기위해 움직인다.");
    }

    Turtle(String name, int num, String color, String rice) {
        super(name, num); Color = color; Rice = rice;
        move();
    }
}

public class Var_4 {
    public static void main(String[] args) {
        new Human("길동이", 5, 295);
        new Turtle("거북이", 4, "보라색", "토끼간");
    }
}
