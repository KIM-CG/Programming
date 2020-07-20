import javax.swing.*;
import java.awt.*;

public class GraphicSet1 extends JFrame {
    Container c;
    GraphicSet1(String str) {
        super(str);
        c = getContentPane();
        c.add(new GraphicSet1.Photo(), BorderLayout.CENTER);
        JPanel jp = new JPanel();
        JLabel jl = new JLabel("이름 : 김채규");
        jl.setFont(new Font("돋움", Font.BOLD, 30));
        jl.setForeground(Color.BLACK);
        jp.add(jl);
        c.add(jp, BorderLayout.SOUTH);
        setSize(600,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }


    class Photo extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            ImageIcon img = new ImageIcon("1.jpeg");
            Image m = img.getImage();
            g.drawImage(m, 1, 1, this.getWidth(),this.getHeight(),this);
        }
    }
    class Mypanel1 extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.fillArc(200,100,200,200,90,120);
            g.setColor(Color.BLUE);
            g.fillArc(200,100,200,200, 210, 120);
            g.setColor(Color.YELLOW);
            g.fillArc(200,100,200,200, 330, 120);
        }
    }

    class Mypanel2 extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLACK);
            g.setFont(new Font("돋움", Font.BOLD, 30));
            g.drawString("김채규", 0, 30);
        }
    }

    public static void main(String[] args) {
        new GraphicSet1("그래픽연습");
    }
}
