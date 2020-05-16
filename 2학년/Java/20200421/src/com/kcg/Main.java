package com.kcg;

import java.util.Iterator;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<Integer>();
        v1.add(10);
        v1.add(50);
        v1.add(20);
        v1.add(50);
        v1.add(10);
        v1.add(50);
        v1.add(20);
        v1.add(50);
        v1.add(10);
        v1.add(50);
        v1.add(20);
        v1.add(50);
        v1.add(3, 30);
        System.out.println(v1);
        System.out.println("길이 : " + v1.size() + ", 용량 : " + v1.capacity());
        System.out.println(v1.get(1));
        v1.remove(2);
        System.out.println(v1);
        System.out.println(v1.get(1));
        int sum = 0;
        for (int i = 0; i < v1.size(); i++) {
            int k = v1.get(i);
            sum += k;
            System.out.print(k + ", ");
        }
        System.out.println("합 : " + sum);
        Iterator<Integer> it = v1.iterator();

        while (it.hasNext()) {
            int n = it.next();
            System.out.println(n);
        }
        for(Integer s : v1) {
            System.out.println(s);
        }
    }
}
