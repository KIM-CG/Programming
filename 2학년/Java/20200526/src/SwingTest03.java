import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class ButtonAction implements ActionListener {
    Random rand = new Random();
    @Override
    public void actionPerformed(ActionEvent e) {
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        Color randcolor = new Color(r, g, b);
        JButton btn = (JButton) e.getSource();
        if (btn.getText().equals("사과")) {
            btn.setText("Apple");
            btn.setBackground(randcolor);
        } else if (btn.getText().equals("Apple")) {
            btn.setText("사과");
            btn.setBackground(randcolor);
        } else if (btn.getText().equals("바나나")) {
            btn.setText("Banana");
            btn.setBackground(randcolor);
        } else if (btn.getText().equals("Banana")) {
            btn.setText("바나나");
            btn.setBackground(randcolor);
        } else {
            btn.setText("Not Name");
        }
    }
}

class frame3 extends JFrame {
    Random rand = new Random();
    class ButtonAction2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();
            Color randcolor = new Color(r, g, b);
            JButton btn = (JButton) e.getSource();
            if (btn.getText().equals("사과")) {
                btn.setText("Apple");
                btn.setBackground(randcolor);
            } else if (btn.getText().equals("Apple")) {
                btn.setText("사과");
                btn.setBackground(randcolor);
            } else if (btn.getText().equals("바나나")) {
                btn.setText("Banana");
                btn.setBackground(randcolor);
            } else if (btn.getText().equals("Banana")) {
                btn.setText("바나나");
                btn.setBackground(randcolor);
            } else {
                btn.setText("Not Name");
            }
        }
    }
    frame3() {
        setTitle("이벤트 처리");
        setSize(500, 400);
        Container con = getContentPane();
        con.setBackground(Color.YELLOW);
        con.setLayout(new FlowLayout(1));
        JButton b1 = new JButton("사과");
        JButton b2 = new JButton("바나나");
        JButton b3 = new JButton("오렌지");
        b1.addActionListener(new ActionListener() { // 익명클래스 사용
            public void actionPerformed(ActionEvent e) {
                float r = rand.nextFloat();
                float g = rand.nextFloat();
                float b = rand.nextFloat();
                Color randcolor = new Color(r, g, b);
                JButton btn = (JButton) e.getSource();
                if (btn.getText().equals("사과")) {
                    btn.setText("Apple");
                    btn.setBackground(randcolor);
                } else if (btn.getText().equals("Apple")) {
                    btn.setText("사과");
                    btn.setBackground(randcolor);
                } else if (btn.getText().equals("바나나")) {
                    btn.setText("Banana");
                    btn.setBackground(randcolor);
                } else if (btn.getText().equals("Banana")) {
                    btn.setText("바나나");
                    btn.setBackground(randcolor);
                } else {
                    btn.setText("Not Name");
                }
            }
        });
        b2.addActionListener(new ButtonAction()); // 외부클래스 사용
        b3.addActionListener(new ButtonAction2()); // 내부클래스 사용
        con.add(b1);
        con.add(b2);
        con.add(b3);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class SwingTest03 {
    public static void main(String[] args) {
        new frame3();
    }
}
