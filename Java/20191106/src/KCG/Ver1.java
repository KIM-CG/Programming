package KCG;
abstract class Animal {
    String name;
    int age;
    abstract void show();
    void print() {
        System.out.println("부모 : " + name + ", " + age);
    }
    Animal() {}
    Animal(String name) {
        this.name = name;
    }
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Dog extends Animal {
    int kg;
    Dog(String name,  int age, int kg) {
        super(name, age);
        this.kg = kg;
    }

    void show() {
        System.out.println("개 : " + name + ", " + age + ", " + kg);
    }
}

class Cat extends Animal {
    float d;

    Cat(String name, int age, float d) {
        super(name, age);
        this.d = d;
    }

    void show() {
        System.out.println("고양이 : " + name + ", " + age + ", " + d);
    }
}

class Duck extends Animal{
    Duck(String name) {
        super(name);
        System.out.println("오리는 꽥꽥");

    }
    Duck() {
        System.out.println("오리는 꽥꽥");

    }
    void show() {
        System.out.println("오리 :" + name + ", " + age);
    }
}

public class Ver1 {

    public static void main(String[] args) {
        Animal d = new Dog("초롱이", 3, 7);
        d.show();
        d = new Cat("초코", 5, 100000);
        d.show();
        d = new Duck("꿀");
        d.show();
    }
}
