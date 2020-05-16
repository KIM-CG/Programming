package com.kcg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class HashTest {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<Integer>();

        h.add(7);
        h.add(5);
        h.add(8);
        System.out.println(h);
        h.add(5);
        System.out.println(h);

        HashMap<Integer, String> m = new HashMap<>(); // key, value, key는 중복할 수 없음
        m.put(1, "서울");
        m.put(3, "서울");
        m.put(2, "인천");
        System.out.println(m);

        HashMap<String, String> fruitdata = new HashMap<String, String>();

        fruitdata.put("사과", "Apple");
        fruitdata.put("오렌지", "Orange");
        fruitdata.put("바나나", "Banana");
        fruitdata.put("수박", "Watermelon");
        fruitdata.put("포도", "Grape");

        Scanner sc = new Scanner(System.in);
        String getkey = sc.next();
        System.out.println(fruitdata.get(getkey));
    }
}
