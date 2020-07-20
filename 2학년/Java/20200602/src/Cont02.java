import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.event.InputEvent.CTRL_DOWN_MASK;

class frame03 extends JFrame {
    JLabel jb = new JLabel("선택");
    frame03() {
        setTitle("메뉴만들기");
        setSize(500, 300);
        Container c = getContentPane();
        c.setLayout(null);
        jb.setLocation(200, 100);
        jb.setSize(200, 50);
        c.add(jb);
        createMenu();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }

    void createMenu() {
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("파일(F)");
        JMenuItem[] mi = new JMenuItem[8];
        String[] str = {"새로 만들기(N)", "새 창(W)", "열기(O)..", "저장(S)", "다른 이름으로 저장(A)..", "페이지 설정(U)..", "인쇄(P)..", "끝내기(X)"};
        for(int i = 0; i < 8; i++) {
            mi[i] = new JMenuItem(str[i]);
            switch (i) {
                case 0:
                    mi[i].setAccelerator(KeyStroke.getKeyStroke('N', CTRL_DOWN_MASK));
                    break;
                case 1:
                    mi[i].setAccelerator(KeyStroke.getKeyStroke('W', CTRL_DOWN_MASK));
                    break;
                case 2:
                    mi[i].setAccelerator(KeyStroke.getKeyStroke('O', CTRL_DOWN_MASK));
                    break;
                case 3:
                    mi[i].setAccelerator(KeyStroke.getKeyStroke('S', CTRL_DOWN_MASK));
                    break;
                case 4:
                    mi[i].setAccelerator(KeyStroke.getKeyStroke('A', CTRL_DOWN_MASK));
                    break;
                case 5:
                    mi[i].setAccelerator(KeyStroke.getKeyStroke('U', CTRL_DOWN_MASK));
                    break;
                case 6:
                    mi[i].setAccelerator(KeyStroke.getKeyStroke('P', CTRL_DOWN_MASK));
                    break;
                case 7:
                    mi[i].setAccelerator(KeyStroke.getKeyStroke('X', CTRL_DOWN_MASK));
            }
            file.add(mi[i]).addActionListener(new MyAction());
            if(i == 4 || i == 6) {
                file.addSeparator();
            }
        }
        mb.add(file);
        setJMenuBar(mb);
    }

    class MyAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String n = e.getActionCommand();
            jb.setText(n + "메뉴를 선택하였습니다.");
        }
    }
}

public class Cont02 {
    public static void main(String[] args) {
        new frame03();
    }
}
