import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class One extends JFrame {
    JButton [] jb = new JButton[2];
    String [] str = {"사과", "오렌지"};
    One() {
        setTitle("My Name");
        setSize(300, 400);
        setLayout(new FlowLayout());
        Container con = getContentPane();
        jb[0] = new JButton(str[0]);
        jb[1] = new JButton(str[1]);
        con.add(jb[0]);
        con.add(jb[1]);
        jb[0].addActionListener(new MyClass());
        jb[1].addActionListener(new MyClass());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new One();
    }

    class MyClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            if (b.getText().equals("오렌지")) {
                b.setText("Orange");
            } else if (b.getText().equals("사과")) {
                b.setText("Apple");
            }
        }
    }
}
