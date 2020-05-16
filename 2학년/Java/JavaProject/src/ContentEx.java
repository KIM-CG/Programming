import javax.swing.*;
import java.awt.*;

public class ContentEx extends JFrame {
    public ContentEx() {
        setTitle("ContentPane과 JFrame");
        setSize(300,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setBackground(Color.CYAN);
        c.setLayout(new FlowLayout());
        JButton b = new JButton("Yes");
        c.add(new JButton("OK"));
        c.add(new JButton("Cancel"));
        c.add(new JButton("Ignore"));
        c.add(b);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ContentEx();
    }
}
