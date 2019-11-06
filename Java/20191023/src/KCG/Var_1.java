package KCG;

class Test
{
    String name;
    protected static final int age=22;
    public static int MAX=100;
    void show()
    {
        System.out.println("Test Show");
    }
}

public class Var_1 {
    public static void main(String[] args) {
        Test test = new Test();
        test.name = "홍길순";
        System.out.println(Test.MAX);
        test.show();
        show();
        Var_1 var = new Var_1();
        var.print();
    }
    public static void show()
    {
        System.out.println("Static Show");
    }
    void print()
    {
        System.out.println("Print");
    }
}
