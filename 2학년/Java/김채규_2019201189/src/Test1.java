import javax.swing.*;
import java.awt.*;

public class Test1 extends JFrame {
    Container c;
    JLabel jb;
    ImageIcon icon = new ImageIcon("pig.png");
    JButton btn;
    JTextField tf;
    JCheckBox box1, box2, box3;
    JRadioButton rad1, rad2;
    JTextArea ar;
    JList jl;
    JComboBox cbox;
    JSlider js;
    String str[]={"사과","포도","오렌지","딸기","배","멜론"};

    Test1()
    {
        setTitle("스윙 컴포넌트");
        setSize(500,400);
        c=getContentPane();
        c.setLayout(new FlowLayout());
        jb = new JLabel("레이블",icon,SwingConstants.LEFT);
        jb.setForeground(Color.GREEN);
        tf=new JTextField("0",20);
        c.add(jb);
        c.add(tf);
        box1=new JCheckBox();
        box2=new JCheckBox();
        box3=new JCheckBox();
        c.add(box1);c.add(box2);c.add(box3);
        ButtonGroup p = new ButtonGroup();
        rad1=new JRadioButton("남성");
        rad2=new JRadioButton("여성");
        p.add(rad1);p.add(rad2);
        c.add(rad1);c.add(rad2);
        ar=new JTextArea();
        c.add(ar);
        jl=new JList(str);
        c.add(jl);
        cbox=new JComboBox(str);
        c.add(cbox);
        js=new JSlider(JSlider.HORIZONTAL,0,200,100);
        js.setPaintLabels(true);js.setPaintTicks(true);
        c.add(js);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Test1();
    }
}
