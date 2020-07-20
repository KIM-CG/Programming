import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class frame4 extends JFrame implements ActionListener {
    JTextField tf1, tf2;
    frame4() {
        setTitle("이벤트 처리");
        setSize(500, 400);
        Container con = getContentPane();
        con.setBackground(Color.YELLOW);
        con.setLayout(new FlowLayout(1));
        JButton b1 = new JButton("사과");
        JButton b2 = new JButton("바나나");
        tf1 = new JTextField(10);
        tf2 = new JTextField(10);
        b1.addActionListener(this);
        con.add(tf1);
        con.add(tf2);
        con.add(b1);
        con.add(b2);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        int x = (int) (Math.random()*100+1);
        int y = (int) (Math.random()*100+1);
        int z = Integer.parseInt(tf1.getText());
        if (btn.getText().equals("사과")) {
            tf2.setText(""+(x*200));
        } else {
            tf1.setText("" +200);
        }
    }
}

public class SwingTest04 {
    public static void main(String[] args) {
        new frame4();
    }
}
