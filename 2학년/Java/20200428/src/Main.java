import java.util.HashSet;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Double> v = new Vector<Double>();
        v.add(35.56);
        v.add(57.89);
        System.out.println(v);
        v.add(1, 55.55);
        System.out.println(v + "1번방" + v.get(1));
        HashSet<Integer> h = new HashSet<Integer>();
        h.add(5);
        h.add(3);
        System.out.println(h);

    }
}