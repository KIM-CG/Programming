package KCG.main;

public class Ver3 {
    public static void main(String[] args) {
        System.out.println("Long 최소값 : " + Long.MIN_VALUE + " Long 최대값 : " + Long.MAX_VALUE);
        System.out.println("Integer 최소값 : " + Integer.MIN_VALUE + " Integer 최대값 : " + Integer.MAX_VALUE);
        System.out.println("Float 최소값 : " + Float.MIN_VALUE + " Float 최대값 : " + Float.MAX_VALUE);
        System.out.println("Character 최소값 : " + Character.MIN_VALUE + " Character 최대값 : " + Character.MAX_VALUE);

        char a[] = {'b', ' ', '#', '7', 'T'};
        for(char st : a) {
            if(Character.isAlphabetic(st)) {
                System.out.println(st + "는 알파벳 입니다.");
            } else if (Character.isDigit(st)) {
                System.out.println(st + "는 숫자 입니다.");
            } else if (Character.isSpaceChar(st)) {
                System.out.println(st + "는 공백 입니다.");
            } else {
                System.out.println(st + "는 특수문자 입니다.");
            }
            System.out.print(st + "|");
            System.out.println();
        }
    }
}
