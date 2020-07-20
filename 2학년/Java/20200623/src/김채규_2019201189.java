import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 김채규_2019201189 extends JFrame {
    Thread th;
    JLabel jl;
    JButton b1, b2;
    김채규_2019201189() {
        setTitle("2-A반 기말테스트 두번째");
        setSize(500,500);
        add(new TestNORTH(), BorderLayout.NORTH);
        add(new TestCENTER(), BorderLayout.CENTER);
        add(new TestSOUTH(), BorderLayout.SOUTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    class TestNORTH extends JPanel {
        TestNORTH() {
            jl = new JLabel("0");
            b1 = new JButton("Timer");
            b2 = new JButton("Stop");
            jl.setForeground(Color.BLUE);
            jl.setFont(new Font("돋움", Font.BOLD, 30));
            add(jl);
            b1.addActionListener(new MyAction1());
            add(b1);
            b2.addActionListener(new MyAction1());
            add(b2);
        }

        class MyAction1 implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                JButton jb = (JButton) e.getSource();
                if (jb.getText().equals("Timer")) {
                    th = new TimerThread();
                    th.start();
                } else {
                    th.interrupt();
                }
            }
        }

        class TimerThread extends Thread {
            public void run() {
                int i = Integer.parseInt(jl.getText());
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

    class TestCENTER extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            ImageIcon img = new ImageIcon("123.jpg");
            Image m = img.getImage();
            g.drawImage(m, 1, 1, this.getWidth(),this.getHeight(),this);
        }
    }

    class TestSOUTH extends JPanel {
        TestSOUTH() {
            JLabel jl = new JLabel("작성자 : 김채규_2019201189");
            jl.setFont(new Font("돋움", Font.BOLD, 25));
            add(jl);
        }
    }

    public static void main(String[] args) {
        new 김채규_2019201189();
    }
}
