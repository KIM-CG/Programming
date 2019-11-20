package KCG;

import java.util.StringTokenizer;

public class Ver4 {

    public static void main(String[] args) {
        String a = "김준오/김채규/이진욱/이인직/이대현";
        StringTokenizer t = new StringTokenizer(a, "/");
        int n = t.countTokens();
        System.out.println("갯수 : " + n);
        for(int i = 0; i < n; i++) {
            System.out.println(t.nextToken());
        }

        String b = "바나나, 오렌지, 배, 귤, 수박, 사과";
        StringTokenizer t2 = new StringTokenizer(b, ", ");
        int n2 = t2.countTokens();
        System.out.println("갯수 : " + n2);
        while(t2.hasMoreTokens()) {
            System.out.println(t2.nextToken());
        }
    }
}
