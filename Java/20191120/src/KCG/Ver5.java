package KCG;

import java.util.Random;

public class Ver5 {
    public static void main(String[] args) {
        System.out.println("절대값:"+Math.abs(-5));
        System.out.println("최대값"+Math.max(5,7));
        System.out.println("최속값:"+Math.min(5,7));
        System.out.println("반올림:"+Math.round(5.9));
        System.out.println("올림:"+Math.ceil(5.4));
        System.out.println("내림:"+Math.floor(2.9));
        System.out.println("난수:"+Math.random());

        Random r= new Random();
        System.out.println("임의의 정수"+r.nextInt());

        System.out.println("1-100사이"+(int)(Math.random()*100+1));
        maxmin();
    }
    public static void maxmin()
    {
        int ma=0,mi=100000;
        int a [] = new int [10];
        for(int i=0;i<a.length;i++)
        {
            a[i] =(int)(Math.random()*100+1);

            System.out.println("무작위 숫자 10개중"+(i+1)+"개 = "+a[i]);
            if(i>0) {
                ma = Math.max(ma, a[i]);
                mi = Math.min(mi, a[i]);
            }
        }
        System.out.println("최대값="+ma+"\n"+"최속값=" +mi);
    }
}
