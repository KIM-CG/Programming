import java.util.Scanner;

public class TVMain {

    public static void main(String[] args) {
        boolean loop = true;
	    SmartTv sm = new SmartTv(7, 10);
	    Scanner sc = new Scanner(System.in);
        while(loop) {
            System.out.println("1. 전원 ●\t3. 채널 ▲\t5. 볼륨 ▲");
            System.out.println("2. 전원 ○\t4. 채널 ▼\t6. 볼륨 ▼");
            System.out.print("TV 메뉴 선택 : ");
            int sel = sc.nextInt();
            switch (sel) {
                case 1:
                    loop = sm.tvon();
                    break;
                case 2:
                    loop = sm.tvoff();
                    break;
                case 3:
                    sm.chup();
                    break;
                case 4:
                    sm.chdown();
                    break;
                case 5:
                    sm.volup();
                    break;
                case 6:
                    sm.voldown();
                    break;
                default:
                    break;
            }
        }
    }
}
