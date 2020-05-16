package com.kcg;

import java.util.ArrayList;

class Person {
    private String name;
    private int age;
    private String pnum;

    public Person(String name, int age, String pnum) {
        this.name = name;
        this.age = age;
        this.pnum = pnum;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPnum() {
        return pnum;
    }
}

public class PointEx {
    public static void main(String[] args) {
        ArrayList<Person> p = new ArrayList<Person>();
        p.add(new Person("이대현", 21, "010-5558-9454"));
        p.add(new Person("짭짭이", 20, "010-5551-9374"));
        p.add(new Person("길청이", 19, "010-5595-9154"));

        for (int i = 0; i < p.size(); i++) {
            Person ps = p.get(i);
            System.out.println("이름 : " + ps.getName() + "\n나이 : " + ps.getAge() + "\n전화번호 : " + ps.getPnum());
        }
    }
}
