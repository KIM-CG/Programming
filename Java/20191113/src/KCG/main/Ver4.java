package KCG.main;

public class Ver4 {
    public static void main(String[] args) {
        String a = "We are the world.";
        String b = "나는 자바를 사랑한다.";
        System.out.println(a.charAt(5));
        System.out.println(b.charAt(3));
        System.out.println(a.concat(b));
        System.out.println(b.substring(7, 9));

        int count = 0;
        int[] xyz = new int[a.length()];
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == 'e') {
                xyz[count] = i;
                count++;
            }
        }

        System.out.println("위치 : ");
        for(int i = 0; i < xyz.length; i++) {
            if(xyz[i] != 0) {
                System.out.print(xyz[i] + " ");
            }
        }
        System.out.println();
        System.out.println("개수 : " + count);

    }
}
