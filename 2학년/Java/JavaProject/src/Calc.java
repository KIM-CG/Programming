import javax.swing.*;
import java.awt.*;

class form1 extends JFrame {
    public form1() {
        setTitle("계산기");
        setSize(300,500);
        setLayout(new GridLayout(6, 4, 5,5));
        Container c = getContentPane();
        c.add(new JButton("%"));
        c.add(new JButton("CE"));
        c.add(new JButton("C"));
        c.add(new JButton("<-"));
        c.add(new JButton("1/x"));
        c.add(new JButton("x²"));
        c.add(new JButton("2√x"));
        c.add(new JButton("÷"));
        c.add(new JButton("7"));
        c.add(new JButton("8"));
        c.add(new JButton("9"));
        c.add(new JButton("X"));
        c.add(new JButton("4"));
        c.add(new JButton("5"));
        c.add(new JButton("6"));
        c.add(new JButton("-"));
        c.add(new JButton("1"));
        c.add(new JButton("2"));
        c.add(new JButton("3"));
        c.add(new JButton("+"));
        c.add(new JButton("+/-"));
        c.add(new JButton("0"));
        c.add(new JButton("."));
        c.add(new JButton("="));
        setVisible(true);
    }
}

public class Calc {
    public static void main(String[] args) {
        new form1();
    }
}
