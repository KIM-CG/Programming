import com.sun.deploy.util.LinkMouseListener;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class GraphicThread extends JFrame {
    String name;
    JLabel j1;
    MyThread t = new MyThread();
    int i = 0;
    GraphicThread(String name) {
        this.name = name;
        setTitle(name);
        j1 = new JLabel(i + "번째 시작");
        setLayout(new FlowLayout());
        j1.setForeground(Color.RED);
        j1.setFont(new Font("돋움", Font.BOLD, 50));
        add(j1);
        t.start();
        JButton jb1 = new JButton("스타트");
        jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.resume();
            }
        });
        JButton jb2 = new JButton("스탑");
        jb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.suspend();
            }
        });
        add(jb1);
        add(jb2);
        setSize(600,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    class MyThread extends Thread {
        public void run() {
            while(i < 100) {
                try {
                    j1.setText(i + "번째 시작");
                    i++;
                    sleep(1000);
                } catch(InterruptedException e) {
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphicThread t1 = new GraphicThread("쓰레드");
    }
}
