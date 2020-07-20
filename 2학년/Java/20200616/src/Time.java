import java.awt.*;
import java.util.Calendar;

public class Time {
    private int n = 0;
    Calendar c = Calendar.getInstance();
    Time() {
        TimeThread t1 = new TimeThread();
        t1.start();
    }
    class TimeThread extends Thread {
        public void run() {
            System.out.println(c.getTime());
        }
    }

    public static void main(String[] args) {
        new Time();
    }
}
