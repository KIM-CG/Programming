package com.kcg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class StackTest {
    Stack<String> undos = new Stack<>();
    Stack<String> redos = new Stack<>();
    static Scanner sc = new Scanner(System.in);

    public void typing() {
        String sitename = "";
        while(true) {
            System.out.print("사이트 이름을 적어주세요 (끝내려면 '끝') : ");
            sitename = sc.next();
            if (sitename.equals("끝")) break;
            redos.push(sitename);
        }
    }

    public void print() {
        int i = 1;
        ArrayList<String> s1 = new ArrayList<String>();
        //undos > redos
        System.out.print("이전페이지 : ");
        for(String site : undos) {
            System.out.print(site + " ");
        }
        System.out.print("\n다음페이지 : ");
        for (String site : redos) {
            System.out.print(site + " ");
        }
        System.out.println();
    }

    public void undo() {
        if (!undos.empty()) {
            redos.push(undos.peek());
            undos.pop();
        } else {
            System.out.println("앞으로 갈 사이트가 없습니다.");
        }
    }

    public void redo() {
        if (!redos.empty()) {
            undos.push(redos.peek());
            redos.pop();
        } else {
            System.out.println("뒤로 갈 사이트가 없습니다.");
        }
    }

    public static void main(String[] args) {
        StackTest st = new StackTest();
        while(true) {
            System.out.println("1. 값넣기");
            System.out.println("2. 앞으로");
            System.out.println("3. 뒤로");
            System.out.println("4. 리스트");
            System.out.print("입력 : ");
            int sel = sc.nextInt();
            switch(sel) {
                case 1:
                    st.typing();
                    break;
                case 2:
                    st.redo();
                    break;
                case 3:
                    st.undo();
                    break;
                case 4:
                    st.print();
                    break;
            }
        }

    }
}
