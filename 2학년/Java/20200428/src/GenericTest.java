class Demo {
    int a;
    void setData(int a) {
        this.a = a;
    }
    int getData() {
        return a;
    }
}

class Data<T> { // extends Number : Number Class를 상속받음
    T a;
    void setData(T a) {
        this.a = a;
    }
    T getData() {
        return a;
    }
}

public class GenericTest {
    public static void main(String[] args) {
        Data d = new Data();
        d.setData(55.0);
        System.out.println(d.getData());

        Data<String> da = new Data<>();
        da.setData("hello");
        System.out.println(da.getData());
    }
}
