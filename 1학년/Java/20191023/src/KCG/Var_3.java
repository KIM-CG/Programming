package KCG;

class Riding {
    protected String Name;
    protected int Speed;
    void run() {
        System.out.println(Name + "이(가) " + Speed + "KM 속도로 달린다.");
    }
    Riding() {
        this("몰라용", 0);
    }
    Riding(String name, int speed) {
        Name = name; Speed = speed;
    }
}

class Truck extends Riding {
    int Weight;
    void carry() {
        System.out.println(Name + "이(가) " + Speed + "KM 속도로 " + Weight + "톤을 싣고 간다.");
    }

    public Truck(String name, int speed, int weight) {
        super(name, speed); Weight = weight;
        carry();
    }
}

class Bus extends Riding {
    private int Custom;
    private int Pay;

    void move() {
        System.out.println(Name + "이(가) " + Speed + "KM로 " + Custom + "명 태우고 비용은 " + (Custom*Pay) + "원으로 간다.");
    }

    public Bus(String name, int speed, int custom, int pay) {
        super(name, speed); Custom = custom; Pay = pay;
        move();
    }
}

class Mycar extends Riding {
    private String Color;

    void pick() {
        System.out.println(Color + "의 " + Name + "를 타고 " + Speed + "KM 속도로 달린다.");
    }

    public Mycar(String name, int speed, String color) {
        super(name, speed); Color = color;
        pick();
    }
}

public class Var_3 {
    public static void main(String[] args) {
        new Truck("트럭", 120, 5);
        new Bus("버스", 60, 90, 1250);
        new Mycar("스포츠카", 200, "노란색");
    }
}
