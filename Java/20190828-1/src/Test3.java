public class Test3 {

    public static void main(String[] args) {
        int x = (int) (Math.random()*100+1);
        int y = (int) (Math.random()*100+1);
        int z = (int) (Math.random()*100+1);
        System.out.println("합 : " + sum(x, y, z));
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
