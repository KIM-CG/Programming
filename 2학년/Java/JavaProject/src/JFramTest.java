import javax.swing.*;
import java.awt.*;

class form extends JFrame {
    public form(String title) {
        super(title);
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container con = getContentPane();
        con.setLayout(new GridLayout(2, 3, 10, 20));
        con.add(new JButton("콤비네이션피자"), BorderLayout.WEST);
        con.add(new JButton("포테이토피자"), BorderLayout.CENTER);
        con.add(new JButton("불고기피자"), BorderLayout.EAST);
        con.add(new JButton("치즈피자"), BorderLayout.WEST);
        con.add(new JButton("트러플 버팔로피자"), BorderLayout.CENTER);
        con.add(new JButton("스테이크피자"), BorderLayout.EAST);

        setVisible(true);
    }
}


public class JFramTest {
    public static void main(String[] args) {
        new form("피자목록");
    }
}
