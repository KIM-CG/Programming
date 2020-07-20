import javax.swing.*;
import java.awt.*;

public class Graphic2 extends JFrame {
    Container c;
    Graphic2(String str){
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
            g.drawLine(50,50,100,100);
            g.setColor(Color.BLUE);
            g.drawOval(100,100,80,100);
            g.setColor(new Color(0,240,56));
            g.drawRect(100,80,200,200);
            g.setColor(new Color(255,240,255));
            g.drawRoundRect(100,200,100,200,40,60);
            g.setColor(new Color(255,240,25));
            g.drawArc(20,100,80,80,90,270);
        }
    }
    public static void main(String[] args) {
        new Graphic2("그래픽");
    }
}