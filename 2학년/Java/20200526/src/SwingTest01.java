import javax.swing.*;
import java.awt.*;

class frame1 extends JFrame {
    JLabel[] jl = new JLabel[2];
    JButton[] jb = new JButton[3];
    JTextField[] jtf = new JTextField[2];
    frame1() {
        setTitle("레이아웃");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        Container con = getContentPane();
        JPanel jp = new JPanel();
        JPanel jp1 = new JPanel();
        jl[0] = new JLabel("이름 : ");
        jl[1] = new JLabel("학과 : ");
        jb[0] = new JButton("사이버");
        jb[1] = new JButton("해킹");
        jb[2] = new JButton("보안과");
        jtf[0] = new JTextField(10);
        jtf[1] = new JTextField(10);
        jp.setBackground(Color.GREEN);
        jp1.setBackground(Color.CYAN);
        jp.add(jl[0]);
        jp.add(jtf[0]);
        jp1.add(jl[1]);
        jp1.add(jtf[1]);
        con.add(jp, BorderLayout.NORTH);
        con.add(jb[0], BorderLayout.WEST);
        con.add(jb[1], BorderLayout.CENTER);
        con.add(jb[2], BorderLayout.EAST);
        con.add(jp1, BorderLayout.SOUTH);
        setVisible(true);
    }
}


public class SwingTest01 {
    public static void main(String[] args) {
        new frame1();
    }
}
