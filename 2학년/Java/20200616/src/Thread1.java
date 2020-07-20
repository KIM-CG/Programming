public class Thread1 extends Thread {
    String name;
    Thread1(String name) {
        this.name = name;
    }
    public void run() {
        System.out.println(name + "님 안녕하세요.");
    }

    public static void main(String[] args) {
        Thread1 th1 = new Thread1("홍길동");
        th1.start();
        Thread1 th2 = new Thread1("이순신");
        th2.start();
    }
}
