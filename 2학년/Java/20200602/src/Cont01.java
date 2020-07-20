import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class frame02 extends JFrame {
    JButton [] jb = new JButton[3];
    JPanel[] jp = new JPanel[3];
    JLabel jl = new JLabel("시작");
    JLabel jl1 = new JLabel("시작버튼을 눌러주세요!");

    class mouseAdapter extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            if(e.getButton() == 1) {
                random();
            }
        }
    }

    class keyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                random();
            } else if (e.getKeyChar() == 'q' || e.getKeyChar() == 'Q') {
                System.exit(0);
            }
        }
    }

    frame02() {
        setTitle("게임");
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container con = getContentPane();
        con.setBackground(Color.CYAN);
        con.setLayout(new GridLayout(3,1));
        for(int i = 0; i < 3; i++) {
            jp[i] = new JPanel(new FlowLayout());
            jp[i].setBackground(Color.CYAN);
            con.add(jp[i]);
        }
        for(int i = 0; i < 3; i++) {
            int rand = (int) (Math.random()*4);
            jb[i] = new JButton(String.valueOf(rand));
            jb[i].setEnabled(false);
            jp[0].add(jb[i]);
        }
        // JPanel 1
            jp[1].add(jl);
            jp[1].addMouseListener(new mouseAdapter());
            jp[1].addKeyListener(new keyAdapter());
            jp[1].setFocusable(true);
            jp[1].requestFocus();
        // JPanel 2
            jp[2].add(jl1);
        setVisible(true);
    }

    public void random() {
        for(int i = 0; i < 3; i++) {
            int rand = (int) (Math.random()*4);
            jb[i].setText(String.valueOf(rand));
        }
        if (jb[0].getText().equals(jb[1].getText()) && jb[0].getText().equals(jb[2].getText())) {
            jl1.setText("축하합니다!!!");
            jl1.setForeground(Color.GREEN);
        } else {
            jl1.setText("아쉬워요...");
            jl1.setForeground(Color.YELLOW);
        }
    }
}

public class Cont01 {
    public static void main(String[] args) {
        new frame02();
    }
}
