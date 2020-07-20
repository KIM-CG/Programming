import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Two extends JFrame {
    int money = 0;
    JLabel jl = new JLabel("상품목록");
    JPanel[] jp = new JPanel[4];
    JRadioButton[] jrb = new JRadioButton[3];
    String[] rbstr = {"상", "중", "하"};
    JCheckBox[] jcb = new JCheckBox[3];
    String[] cbstr = {"사과", "배", "귤"};
    JTextField jtf = new JTextField(10);
    Two() {
        setTitle("상품목록");
        setSize(500,400);
        setLayout(new GridLayout(4, 1, 5, 5));
        Container c = getContentPane();
        jp[0] = new JPanel();
        jp[0].add(jl);
        jl.setFont(new Font("맑은 고딕", Font.PLAIN, 38));
        c.add(jp[0]);
        jp[1] = new JPanel();
        for(int i = 0; i < jrb.length; i++) {
            jrb[i] = new JRadioButton(rbstr[i]);
            jrb[i].addActionListener(new Radio());
            jp[1].add(jrb[i]);
        }
        c.add(jp[1]);
        jp[2] = new JPanel();
        for(int i = 0; i < jcb.length; i++) {
            jcb[i] = new JCheckBox(cbstr[i]);
            jcb[i].addActionListener(new Check());
            jp[2].add(jcb[i]);
        }
        c.add(jp[2]);
        jp[3] = new JPanel();
        jp[3].add(jtf);
        jtf.setText(String.valueOf(money));
        c.add(jp[3]);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class Check implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JCheckBox b = (JCheckBox) e.getSource();
            if (b.getText().equals("사과")) {
                if (money == 0) {
                    money += 100;
                } else if (b.isSelected()) {
                    money += 100;
                } else {
                    money -= 100;
                }
                jtf.setText(String.valueOf(money));
            } else if (b.getText().equals("배")) {
                if (money == 0) {
                    money += 1000;
                } else if (b.isSelected()) {
                    money += 1000;
                } else {
                    money -= 1000;
                }
                jtf.setText(String.valueOf(money));
            } else if (b.getText().equals("귤")) {
                if (money == 0) {
                    money += 10000;
                } else if (b.isSelected()) {
                    money += 10000;
                } else {
                    money -= 10000;
                }
                jtf.setText(String.valueOf(money));
            }
        }
    }

    class Radio implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JRadioButton b = (JRadioButton) e.getSource();
            if(b.getText().equals("상")) {
                b.setSelected(true);
                jrb[1].setSelected(false);
                jrb[2].setSelected(false);
            } else if (b.getText().equals("중")) {
                b.setSelected(true);
                jrb[0].setSelected(false);
                jrb[2].setSelected(false);
            } else if (b.getText().equals("하")) {
                b.setSelected(true);
                jrb[0].setSelected(false);
                jrb[1].setSelected(false);
            }
        }
    }

    public static void main(String[] args) {
        new Two();
    }
}
