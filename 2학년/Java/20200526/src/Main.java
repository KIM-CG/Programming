package com.kcg;

import javax.swing.*;
import java.awt.*;

class Data extends JFrame {
    JButton [] btn = new JButton[2];
    JLabel [] jl = new JLabel[2];
    JTextField [] jtf = new JTextField[1];
    String [] lstr = { "학과 : " };
    String [] tfstr = { "kim" };
    String [] bstr = { "사이버", "해킹보안" };
    Data() {
        setTitle("중간고사");
        setSize(300,200);
        getContentPane().setBackground(Color.YELLOW);
        setLayout(new FlowLayout(2));
        int x = (int) (Math.random()*10+1);
        jl[0] = new JLabel(lstr[0]);
        jl[1] = new JLabel(Integer.toString(x));
        btn[0] = new JButton(bstr[0]);
        btn[0].setBackground(Color.CYAN);
        btn[0].setForeground(Color.ORANGE);
        btn[1] = new JButton(bstr[1]);
        btn[1].setBackground(Color.GREEN);
        btn[1].setForeground(Color.RED);
        jtf[0] = new JTextField(tfstr[0], 10);
        add(jl[0]);
        add(btn[0]);
        add(btn[1]);
        add(jl[1]);
        add(jtf[0]);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}

public class Main {
    public static void main(String[] args) {
	    new Data();
    }
}
