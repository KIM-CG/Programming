import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sel;

        System.out.println("===========[ 2019201189 김채규 ]===========");
        System.out.println("1. 암호화");
        System.out.println("2. 복호화");
        System.out.print("실행 하려는 프로그램 번호를 입력해주세요 : ");
        sel = sc.nextInt();

        switch(sel) {
            case 1:
                en_text();
                break;
            case 2:
                de_text();
                break;
        }
    }


    static void en_text() {
        Scanner sc = new Scanner(System.in);
        String M;
        int key;

        System.out.println("\n문자는 최대 100자까지 입력이 가능합니다.");
        System.out.print("암호화 하려는 평문을 입력해주세요 : ");
        M = sc.next();
        System.out.println("\n키는 최대 26까지 입력이 가능합니다.");
        System.out.print("키 값을 입력해주세요 : ");
        key = sc.nextInt();
        en_change(M, key);
    }
    static void de_text() {
        Scanner sc = new Scanner(System.in);
        String C;
        int key;

        System.out.println("\n문자는 최대 100자까지 입력이 가능합니다.");
        System.out.print("복호화 하려는 암호문을 입력해주세요 : ");
        C = sc.next();
        System.out.println("\n키는 최대 26까지 입력이 가능합니다.");
        System.out.print("키 값을 입력해주세요 : ");
        key = sc.nextInt();
        de_change(C, key);
    }
    static void en_change(String TEXT, int key) {
        int index, size, len = TEXT.length();
        char clip;
        System.out.println("평문 : " + TEXT);
        System.out.println("키 : " + key);
        System.out.print("암호문 : ");
        for(index = 0; index < len; index++)
        {
            clip = TEXT.charAt(index);
            if(isalpha(clip)) {
                size = clip;
                size += key;
                if((isupper(clip) && size > 'Z')||(!isupper(clip) && size > 'z')) {
                    size -= 26;
                }
                System.out.printf("%c", size);
            }
            else {
                System.out.printf("%c", clip);
            }
        }
    }

    static void de_change(String TEXT, int key) {
        int index, size, len = TEXT.length();
        char clip;
        System.out.println("암호문 : " + TEXT);
        System.out.println("키 : " + key);
        System.out.print("평문 : ");
        for(index = 0; index < len; index++)
        {
            clip = TEXT.charAt(index);
            if(isalpha(clip)) {
                size = clip;
                size -= key;
                if((isupper(clip) && size > 'A')||(!isupper(clip) && size > 'a')) {
                    size += 26;
                }
                System.out.print(size);
            }
            else {
                System.out.print(clip);
            }
        }
    }

    static boolean isalpha(char sb) {
        return (sb >= 'A' && sb <= 'Z') || (sb >= 'a' && sb <= 'z');
    }

    static boolean isupper(char sb) {
        return sb >= 'A' && sb <= 'Z';
    }
}


