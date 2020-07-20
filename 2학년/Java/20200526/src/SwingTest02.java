import javax.swing.*;
import java.awt.*;
import java.util.Random;

class frame2 extends JFrame {
    Random rand = new Random();
    JPanel all = new JPanel();
    JPanel jpnorth = new JPanel();
    JPanel jpsouth = new JPanel();
    JButton [] jb = new JButton[24];
    String [] str = { "%", "CE", "C", "<-", "¹/x", "x²", "²√x", "÷", "7", "8", "9", "X", "4", "5", "6", "－", "1", "2", "3", "＋", "+/-", "0", ".", "="};

    public void setbuttontitle() {
        for (int i = 0; i < 24; i++) {
            float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();
            Color randcolor = new Color(r, g, b);
            jb[i] = new JButton(str[i]);
            jb[i].setBackground(randcolor);
            all.add(jb[i]);
        }
    }

    frame2() {
        setTitle("레이아웃");
        setSize(500, 400);
        all.setLayout(new GridLayout(6, 4, 5, 5));
        setLayout(new BorderLayout());
        jpnorth.setBackground(Color.green);
        jpnorth.add(new JLabel("이름 :"));
        jpnorth.add(new JTextField(10));
        add(jpnorth, BorderLayout.NORTH);
        setbuttontitle();
        all.setBackground(Color.orange);
        add(all, BorderLayout.CENTER);
        add(jpsouth, BorderLayout.SOUTH);
        jpsouth.setBackground(Color.CYAN);
        jpsouth.add(new JLabel("학과 :"));
        jpsouth.add(new JTextField(10));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}


public class SwingTest02 {
    public static void main(String[] args) {
        new frame2();
    }
}
