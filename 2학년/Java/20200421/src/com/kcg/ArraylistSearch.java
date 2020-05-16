package com.kcg;

import java.util.*;

public class ArraylistSearch {
    ArrayList<String> a1 = new ArrayList<String>(5);
    Scanner sc = new Scanner(System.in);

    public void typing() {
        System.out.print("몇명을 입력할까요 ? ");
        int capacity = sc.nextInt();
        for (int i = 0; i < capacity; i++) {
            System.out.print((i+1) + "번째 이름을 입력하세요 : ");
            String nameset = sc.next();
            a1.add(nameset);
        }
        Collections.sort(a1);
    }

    public void print() {
        int i = 0;
        for(String s : a1) {
            i++;
            System.out.print(i + "번째 이름 : " + s + "\n");
        }
    }

    public void search() {
        System.out.print("찾으려는 이름을 입력해주세요 : ");
        String searchname = sc.next();
        int set = Collections.binarySearch(a1, searchname);
        if (set < 0) {
            System.out.println(searchname + "은 찾을 수 없습니다.");
        } else {
            System.out.println(searchname + "은 " + (set+1) + "번째에 있습니다.");
        }
    }

    public static void main(String[] args) {
        ArraylistSearch as = new ArraylistSearch();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. 입력하기");
            System.out.println("2. 출력하기");
            System.out.println("3. 검색하기");
            System.out.println("4. 종료하기");
            System.out.print("입력 : ");
            int sel = sc.nextInt();
            switch(sel) {
                case 1:
                    as.typing();
                    break;
                case 2:
                    as.print();
                    break;
                case 3:
                    as.search();
                    break;
                case 4:
                    break;
            }
        }
    }
}
