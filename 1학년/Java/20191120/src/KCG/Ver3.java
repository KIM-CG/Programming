package KCG;

public class Ver3 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer();
        a.append ("고양이");
        a.append("바둑이");
        a.append("원숭이");
        System.out.println(a);
        a.append("고래");
        System.out.println(a);
        a.delete(3,6);
        System.out.println(a);
        a.insert(6,"호랑이");
        System.out.println(a);
        System.out.println(a.length());
        int j=0;
        for(int i=0;i<a.length();i++)
        {
            if('이' == a.charAt(i))
            {
                System.out.println("이는" + i +"번째 있습니다");
                j++;
            }
        }
        System.out.println("이는" +j +"개 있습니다.");
    }
}
