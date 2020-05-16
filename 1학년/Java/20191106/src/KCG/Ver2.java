package KCG;

class Down extends Top implements Ainter, Sleep, Wakeup {
    public void show() {
        e = 999;
        System.out.println(name + "는 " + a + ", " + e);
        print();
    }
    public void print() {
        System.out.println(a+name);
    }

    public void getSleep(String name) {
        System.out.println(name + " 잘자");
    }

    public void getWakeup(String name) {
        System.out.println(name + " 일어나");
    }
}


public class Ver2 {
    public static void main(String[] args) {
        Down d = new Down();
        d.show();
        d.getSleep("유진");
        d.getWakeup("하은");
    }
}
