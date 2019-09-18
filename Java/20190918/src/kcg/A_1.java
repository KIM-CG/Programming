package kcg;

public class A_1 {
    public static void main(String[] args) {
        char[] message1 = {'h', 'a', 'p', 'p', 'y'};
        String[] message2 = { "Hello", "What's", "your", "name?"};
        for(char str1:message1)
            System.out.print(str1 + " ");
        System.out.println();
        for(String str2:message2)
            System.out.print(str2 + " ");
        System.out.println();

        int s[] = new int [10];
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < 10; i++) {
            int x = (int) (Math.random() * 100 + 1);
            s[i] = x;
        }
        for(int num:s) {
            sum += num;
            System.out.print(num + " ");
        }
        System.out.println();

        avg = sum / s.length;
        int max = s[0], min = s[0];
        for(int i=0; i < s.length; i++) {
            if(max < s[i]) {
                max = s[i];
            }

            if(min > s[i]) {
                min = s[i];
            }
        }
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + (int) avg);
        System.out.println("최소값 : " + min);
        System.out.println("최대값 : " + max);
    }
}
