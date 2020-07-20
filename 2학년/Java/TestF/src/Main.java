import java.util.Vector;

class MyClass<T> {
    T p;
    public MyClass() {
        p = new p();
    }
}

public class Main {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(4);
        for (int i = 1; i <= 10; i++) {
            if (v.size() != 0)
                System.out.println(v.size() + " : " + v.capacity());
            v.add(i);
        }
    }
}