package KCG;

interface Ainter {
    String name = "길동";
    final int a = 100;
    //추상메소드에는 private를 할 수 없음
    abstract void show();
    void print(); // public abstaract 생략 가능
}

// interface에는 여러개를 상속 (extends) 할 수 있음

interface Binter {
    int c = 500;
}

interface Cinter {
    float d = 2.7f;
}

interface Sleep {
    int t = 1;
    void getSleep(String name);
}

interface Wakeup {
    void getWakeup(String name);
}

class Top {
    int e;
}


public class Ver3 {
}
