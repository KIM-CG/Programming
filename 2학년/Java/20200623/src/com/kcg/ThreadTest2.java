package com.kcg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;

public class ThreadTest2 extends JFrame {
    public static void main(String[] args) {
        new ThreadTest2();
    }

    JLabel jb;
    ThreadTest2() {
        setTitle("쓰레드");
        setSize(500, 500);
        Container c = getContentPane();
        c.add(new NorthTest(), BorderLayout.NORTH);
        c.add(new CenterTest(), BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    class CenterTest extends JPanel {
        Thread th;
        CenterTest() {
            setBackground(new Color(25,245,25));
            jb = new JLabel(cal());
            jb.setFont(new Font("돋움", Font.BOLD, 50));
            add(jb);
            addMouseListener(new MyMouse());
        }
        public String cal() {
            Calendar cal = Calendar.getInstance();
            int h = cal.get(Calendar.HOUR_OF_DAY);
            int m = cal.get(Calendar.MINUTE);
            int s = cal.get(Calendar.SECOND);
            String restr = h + "시 " + m + "분 " + s + "초";
            return restr;
        }

        class MyMouse extends MouseAdapter{
            public void mouseClicked(MouseEvent e) {
                th = new Threadtime();
                th.start();
            }

            public void mouseExited(MouseEvent e) {
                th.interrupt();
            }
        }

        class Threadtime extends Thread{
            public void run() {
                while(true){
                    jb.setText(cal());
                    try{
                        sleep(1000);
                    }catch(InterruptedException e){
                        return;
                    }

                }
            }
        }
    }

    class NorthTest extends JPanel {
        NorthTest() {
            setBackground(new Color(25,25,98));
        }
    }
}
