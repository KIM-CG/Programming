public class Thread2 implements Runnable {
    String name;
    Thread2(String name) {
        this.name = name;
    }
    public void run() {
        System.out.println(name + "님 안녕하세요.");
    }

    public static void main(String[] args) {
        Thread2 t1 = new Thread2("홍길동");
        Thread th1 = new Thread(t1);
        th1.start();
        Thread2 t2 = new Thread2("이순신");
        Thread th2 = new Thread(t2);
        th2.start();










































































































































































































    }
}
