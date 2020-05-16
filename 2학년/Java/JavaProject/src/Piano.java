import javax.swing.*;
import java.awt.*;

class form3 extends JFrame {
    public void setLocation(JButton jbut, int x, int y) {
        Container c = getContentPane();
        jbut.setSize(70, 200);
        jbut.setLocation(x, y);
        c.add(jbut);
    }

    form3() {
        setTitle("피아노건반");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(920, 270);
        setLayout(null);
        for (int i = 0; i < 12; i++) {
            JButton b = new JButton("C" + (i+1));
            int x = 0;
            if (i != 0) {
                x = i*75;
            }
            setLocation(b, x, 30);
        }
        setVisible(true);
    }
}

public class Piano {
    public static void main(String[] args) {
        new form3();
    }
}
