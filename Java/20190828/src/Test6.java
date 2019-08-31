import java.util.Scanner;

public class Test6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        pass(x);
        sc.close();
    }
    public static void pass (int score) {
        char save;
        if (score >= 90) {
            save = 'A';
        } else if (score >= 80){
            save = 'B';
        } else if (score >= 70){
            save = 'B';
        } else if (score >= 60){
            save = 'B';
        } else {
            save = 'F';
        }
        System.out.println(save);
    }
}
