import javax.swing.*;
import java.awt.*;

public class Graphic1 extends JFrame {
    Container c;
    Graphic1(String str){
        super(str);
        c = getContentPane();
        setContentPane(new Mypanel());
        setSize(600,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    // JPanel 패널
    class Mypanel extends JPanel{
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.drawString("오늘은 그래픽입니다",100,100);
        }
    }
    // JFrame 오버라이드
    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0; i < 5; i++) {
            int r1 = (int) (Math.random()*255);
            int g1 = (int) (Math.random()*255);
            int b1 = (int) (Math.random()*255);
            g.setFont(new Font("돋움", Font.BOLD, 30));
            g.setColor(new Color(r1,g1,b1));
            g.drawString("김채규", 30, ((i + 10) * 25));
        }
    }
    public static void main(String[] args) {
        new Graphic1("그래픽");
    }
}