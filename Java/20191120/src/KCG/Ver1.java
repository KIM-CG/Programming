package KCG;

import javax.swing.*;

public class Ver1 extends JFrame {
        Ver1(){
            System.out.println("기본생성자");
            setTitle("메모장");
            setSize(300,400);
            setVisible(true);
        }
    public static void main(String[] args) {
        new Ver1();
    }
}
