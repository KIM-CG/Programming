package KCG;

import java.util.Calendar;
import java.util.spi.CalendarDataProvider;
import java.util.spi.CalendarNameProvider;

public class Ver7 {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        System.out.println(now);
        Calendar birth=Calendar.getInstance();
        birth.clear();
        birth.set(1998,11,7);
        int y=now.get(Calendar.YEAR);
        int m=now.get(Calendar.MONTH);
        int d=now.get(Calendar.DAY_OF_MONTH);
        int w=now.get(Calendar.DAY_OF_WEEK);
        int age = y-birth.get(Calendar.YEAR);
        int day=birth.get(Calendar.DAY_OF_WEEK);
        week(w);
        System.out.println(y+"년"+m+"월"+d+"일"+week(w)+"요일");

        birth.clear();
        System.out.println("나의 나이는"+age+"태어난 요일은="+week(day)+" 태어난 일은="+day);
    }
    static String week(int k)
    {
        String str=null;
        switch(k)
        {
            case 1:str="일";break;
            case 2:str="월";break;
            case 3:str="화";break;
            case 4:str="수";break;
            case 5:str="목";break;
            case 6:str="금";break;
            case 7:str="토";break;
        }

        return str;
    }
}
