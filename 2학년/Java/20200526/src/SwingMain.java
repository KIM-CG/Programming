import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class frame5 extends JFrame implements ActionListener {
    JLabel[] jl = new JLabel[3];
    JTextField[] jtf = new JTextField[3];
    JButton[] jb = new JButton[5];
    String[] lstr = { "첫번째수", "두번째수", "결과" };
    String[] str = { "+", "-", "*", "/", "C" };

    frame5() {
        setTitle("채규의 계산기");
        setSize(400,300);
        JPanel jp = new JPanel();
        JPanel jp1 = new JPanel();
        jp.setLayout(new GridLayout(1, 5));
        jp1.setLayout(new GridLayout(3, 2));
        for (int i = 0; i < 3; i++) {
            int x = (int) (Math.random()*100+1);
            jl[i] = new JLabel(lstr[i]);
            if (i == 2) {
                jtf[i] = new JTextField();
            } else {
                jtf[i] = new JTextField("" + x);
            }
            jp1.add(jl[i]);
            jp1.add(jtf[i]);
        }

        for (int i = 0; i < 5; i++) {
            jb[i] = new JButton(str[i]);
            jb[i].addActionListener(this);
            jp.add(jb[i]);
        }
        add(jp1);
        add(jp, BorderLayout.SOUTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if (!(jtf[0].getText().equals("") && jtf[1].getText().equals(""))) {
            int a = Integer.parseInt(jtf[0].getText());
            int b = Integer.parseInt(jtf[1].getText());
            if (btn.getText().equals("+")) {
                jtf[2].setText("" + (a + b));
            } else if (btn.getText().equals("-")) {
                jtf[2].setText("" + (a - b));
            } else if (btn.getText().equals("*")) {
                jtf[2].setText("" + (a * b));
            } else if (btn.getText().equals("/")) {
                jtf[2].setText("" + (a / b));
            } else {
                jtf[0].setText("");
                jtf[1].setText("");
                jtf[2].setText("");
            }
        }
    }
}

public class SwingMain {
    public static void main(String[] args) {
        new frame5();
    }
}
