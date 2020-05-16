package com.kcg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<Integer>(5);
        Vector<Double> v2 = new Vector<Double>();
        Vector<String> v3 = new Vector<String>();

        Vector v4 = new Vector<>();
        v4.add("문자");
        v4.add(5);
        v4.add(6.8);
        System.out.println(v4);

        ArrayList<String> a1 = new ArrayList<>();
        a1.add("사과");
        a1.add("복숭아");
        a1.add("포도");
        a1.add("귤");
        System.out.println(a1);

        Iterator<String> i1 = a1.iterator();
        while(i1.hasNext()) {
            System.out.println(i1.next());
        }
        Collections.sort(a1);
        System.out.println(a1);
        Collections.reverse(a1);
        System.out.println(a1);

        System.out.println(Collections.binarySearch(a1, "사과"));
    }
}
