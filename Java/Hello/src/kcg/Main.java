package kcg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String source_plain  = scan.nextLine();
        String source_encryption_key = scan.nextLine();
        char plain_text [] = new char[source_plain.length()];
        char encryption_key[] = new char[source_encryption_key.length()];
        for (int i = 0; i < source_plain.length();i++){
            encryption_key[i] = encryption_key.charAt(i);
            plain_text[i] = (char)(source_plain.charAt(i)-32);
            System.out.print(plain_text[i]);
        }
    }



    /*static char a[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z'};
    static char b[] = new char[26];
    static String ciper;
    static int shift=0;
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);



        System.out.println("암호문을 입력하시오");

        ciper =sc.next();

        System.out.println("shift를 입력하시오:");

        shift = sc.nextInt();

        shift();
        find();
    }
     public static void shift() {

         for (int i = 0; i < shift; i++) {


             for (int j = 0; j < 26; j++) {

             }

         }

     }
     public static void find() {




     }



 */
}
