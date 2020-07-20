package com.kcg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThreadTest1 extends JFrame {
    JLabel jb;
    JButton b1, b2;
    ThreadTest1() {
        setTitle("쓰레드 연습");
        setSize(500,500);
        Container c = getContentPane();
        c.add(new North(), BorderLayout.NORTH);
        c.add(new South(), BorderLayout.SOUTH);
        c.add(new East(), BorderLayout.EAST);
        c.add(new West(), BorderLayout.WEST);
        c.add(new Center(), BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    class North extends JPanel {
        North() {
            setBackground(Color.BLUE);
        }
    }
    class South extends JPanel {
        South(){
            setBackground(Color.YELLOW);
        }
    }
    class East extends JPanel{
        East(){
            setBackground(Color.ORANGE);
        }
    }
    class West extends JPanel{
        West(){
            setBackground(Color.PINK);
        }
    }
    class Center extends JPanel implements ActionListener {
        Thread th;
        Center(){
            setBackground(Color.GRAY);
            jb=new JLabel("0");
            b1=new JButton("실행");
            b2=new JButton("멈춤");
            add(jb);
            add(b1);
            b1.addActionListener(this);
            add(b2);
        }

        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            if (b.getText().equals("실행")) {
                th = new CountThread();
                th.start();
            } else if (b.getText().equals("멈춤")) {
                th.suspend();
            }
        }

        class CountThread extends Thread{
            public void run()
            {
                int i = 0;
                while(true){
                    jb.setText(Integer.toString(i++));
                    try{
                        sleep(1000);
                    }catch(InterruptedException e){
                        return;
                    }

                }
            }
        }
    }

    public static void main(String[] args) {
        new ThreadTest1();
    }
}
