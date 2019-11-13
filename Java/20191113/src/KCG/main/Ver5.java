package KCG.main;

public class Ver5 {
    public static void main(String[] args) {
        String st[] = {"배유진", "이인범", "이하은", "한지성", "김채규"};
        String temp;
        for(int i = 0; i < st.length; i++) {
            for (int j = i+1; j < st.length; j++) {
                if (st[i].compareTo(st[j]) >= 0) {
                    temp = st[i];
                    st[i] = st[j];
                    st[j] = temp;
                }
            }
        }
        for(String str : st) {
            System.out.println(str);
        }
        System.out.println();
    }
}
