import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class 김채규_2019201189_2_A extends JFrame {
    JMenuBar mb = new JMenuBar();
    JMenu[] m = new JMenu[4];
    JMenuItem[] item = new JMenuItem[5];
    JLabel[] l = new JLabel[5];
    String[] mstr = {"File", "Edit", "Window", "Help"};
    String[] istr = {"New", "Open", "Save", "Exit", "Clear"};
    String[] lstr = {"학과", "학번", "이름", "점수", "학점"};
    JTextField[] tf = new JTextField[4];
    JButton b = new JButton("실행");
    김채규_2019201189_2_A() {
        setTitle("2-A반 기말테스트1");
        setSize(500,400);
        setLayout(new GridLayout(5, 2));
        setJMenuBar(mb);
        for(int i = 0; i < m.length; i++) {
            m[i] = new JMenu(mstr[i]);
            if (i == 0) {
                for (int j = 0; j < item.length; j++) {
                    item[j] = new JMenuItem(istr[j]);
                    m[i].add(item[j]).addActionListener(new MyMenu());
                }
            }
            mb.add(m[i]);
        }
        for (int i = 0; i < 10; i++) {
            if (i == 0 || i == 2 || i == 4 || i == 6 || i == 9) {
                switch (i) {
                    case 0:
                        l[0] = new JLabel(lstr[0]);
                        add(l[0]);
                        break;
                    case 2:
                        l[1] = new JLabel(lstr[1]);
                        add(l[1]);
                        break;
                    case 4:
                        l[2] = new JLabel(lstr[2]);
                        add(l[2]);
                        break;
                    case 6:
                        l[3] = new JLabel(lstr[3]);
                        add(l[3]);
                        break;
                    case 9:
                        l[4] = new JLabel(lstr[4]);
                        add(l[4]);
                        break;
                }
            } else if (i == 1 || i == 3 || i == 5 || i == 7) {
                switch (i) {
                    case 1:
                        tf[0] = new JTextField();
                        add(tf[0]);
                        break;
                    case 3:
                        tf[1] = new JTextField();
                        add(tf[1]);
                        break;
                    case 5:
                        tf[2] = new JTextField();
                        add(tf[2]);
                        break;
                    case 7:
                        tf[3] = new JTextField();
                        add(tf[3]);
                        break;
                }
            } else {
                add(b).addMouseListener(new MyMouse());
            }
        }
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class MyMenu implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String menu = e.getActionCommand();
            if (menu.equals("Open")) {
                l[4].setText("Open을 선택");
            } else if (menu.equals("Clear")) {
                for(int i = 0; i < tf.length; i++) {
                    tf[i].setText("");
                }
            }
        }
    }

    class MyMouse extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            String str = tf[3].getText();
            if (Integer.parseInt(str) >= 90) {
                l[4].setText(tf[2].getText() + "님의 학점 : A");
            } else if (Integer.parseInt(str) >= 80) {
                l[4].setText(tf[2].getText() + "님의 학점 : B");
            } else if (Integer.parseInt(str) >= 70) {
                l[4].setText(tf[2].getText() + "님의 학점 : C");
            } else if (Integer.parseInt(str) >= 60) {
                l[4].setText(tf[2].getText() + "님의 학점 : D");
            } else {
                l[4].setText(tf[2].getText() + "님의 학점 : F");
            }
        }
    }

    public static void main(String[] args) {
        new 김채규_2019201189_2_A();
    }
}
