package kcg;

class Person {
    String name;
    int age;
    void eat()
    {
        System.out.println(age + "살의 " + name + "이 먹는다.");
    }
    void sleep()
    {
        System.out.println(age + "살의 " + name + "이 잔다.");
    }
    //속성과 메소드 (정의)
}


public class A_5 {

    //속성과 메소드 (행위)
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "박아현";
        person1.age = 20;
        System.out.printf("이름 : %s | 나이 : %d\n", person1.name, person1.age);
        person1.eat();
        Person person2 = new Person();
        person2.name = "김채규";
        person2.age = 20;
        System.out.printf("이름 : %s | 나이 : %d\n", person2.name, person2.age);
        person2.sleep();
    }
}