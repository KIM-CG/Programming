package KCG;

public class Ver5 {
    static int list [] = new int[7];
    static int random() {
        boolean loop = true;
        while(true) {
            int ran = (int) (Math.random()*45+1);
            for(int i = 1; i < list.length; i++) {
                if (list[i-1] == ran) {
                    loop = true;
                    break;
                } else {
                    loop = false;
                }
            }
            if(!loop) {
                return ran;
            }
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i < 7; i++) {
            list[i] = random();
            System.out.println(i+1 + "번째 수 " + list[i]);
        }
    }
}