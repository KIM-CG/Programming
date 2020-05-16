import java.util.HashSet;

public class Lotto {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<Integer>();
        while(h1.size() != 6) {
            int rannum = (int) (Math.random()*45+1);
            if (!h1.contains(rannum)) {
                h1.add(rannum);
            } else {
                continue;
            }
        }
        System.out.println(h1);
    }
}
