import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 유가영_2019202077 extends JFrame {
    Thread th;
    JLabel jl;
    JButton jb1, jb2;
    int i = 0;
    유가영_2019202077() {
        setTitle("2-A반 기말테스트 두번째");
        setSize(600,600);
        Container con = getContentPane();
        con.add(new North(), BorderLayout.NORTH);
        con.add(new Center(), BorderLayout.CENTER);
        con.add(new South(), BorderLayout.SOUTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    class North extends JPanel {
        North() {
            jl = new JLabel("0");
            jb1 = new JButton("Timer");
            jb2 = new JButton("Stop");
            jl.setFont(new Font("Gothic", Font.BOLD, 25));
            add(jl);
            jb1.addActionListener(new MyAction());
            add(jb1);
            jb2.addActionListener(new MyAction());
            add(jb2);
        }

        class MyAction implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                JButton jb = (JButton) e.getSource();
                if (jb.getText().equals("Timer")) {
                    th = new MyTimer();
                    th.start();
                } else {
                    th.interrupt();
                }
            }
        }

        class MyTimer extends Thread {
            public void run() {
                while(true) {
                    jl.setText(String.valueOf(i++));
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        return;
                    }
                }
            }
        }
    }

    class Center extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            ImageIcon img = new ImageIcon("자두.jpg");
            Image m = img.getImage();
            g.drawImage(m, 1, 1, this.getWidth(),this.getHeight(),this);
        }
    }

    class South extends JPanel {
        South() {
            JLabel jl = new JLabel("작성자 : 유가영_2019202077");
            jl.setFont(new Font("Gothic", Font.BOLD, 25));
            add(jl);
        }
    }

    public static void main(String[] args) {
        new 유가영_2019202077();
    }
}
