import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class MykeyAdapter extends KeyAdapter {
    public void keyPressed(KeyEvent e) {
        if(e.getKeyChar() == 'q') {
            System.exit(0);
        } else if (e.getKeyCode() == KeyEvent.VK_F5) {
            System.exit(0);
        }
    }
}

class frame01 extends JFrame {
    class MymouseAdapter extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            j1.setLocation(e.getX(), e.getY());
        }
    }

    /*
    class Mymouse implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getButton() == 1) {
                j1.setText("좌 클릭");
            } else if (e.getButton() == 2) {
                j1.setText("휠 클릭");
            } else {
                j1.setText("우 클릭");
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            j1.setLocation(e.getX(), e.getY());
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
    */
    JLabel j1 = new JLabel("안녕");

    frame01() {
        setTitle("리스너");
        setSize(500,300);
        Container con = getContentPane();
        con.setLayout(null);
        con.setBackground(Color.YELLOW);
        //con.addMouseListener(new Mymouse());
        con.addMouseListener(new MymouseAdapter());
        con.addKeyListener(new MykeyAdapter());
        j1.setLocation(200, 80);
        j1.setSize(300,30);
        j1.setForeground(Color.RED);
        j1.setFont(new Font("돋움", Font.BOLD, 30));
        con.add(j1);
        con.setFocusable(true);
        con.requestFocus();

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

public class Main {

    public static void main(String[] args) {
        new frame01();
    }
}
