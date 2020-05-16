import javax.swing.*;
import java.awt.*;

class Test2 extends JFrame {
    public Test2(String title) {
        setTitle(title); // GUI 제목 == super("제목")
        setSize(300,300); // GUI 크기
        setVisible(true); // GUI 출력
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 프로세스 종료
    }
}

public class Test extends JFrame {

    public static void main(String[] args) {
        new Test2("스윙 프레임 생성");
    }
}
