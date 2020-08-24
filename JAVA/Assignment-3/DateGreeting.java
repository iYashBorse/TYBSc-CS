import java.sql.Date;
import java.util.Calendar;

public class DateGreeting {
    public static void main(String[] args){
        Calendar today = Calendar.getInstance();
        System.out.println(today.get(Calendar.DATE) + " / " + today.get(Calendar.MONTH) + " / " + today.get(Calendar.YEAR));
        if(today.get(Calendar.HOUR_OF_DAY) <= 12)
            System.out.println("Good Morning");
        else if(today.get(Calendar.HOUR_OF_DAY) <= 16)
            System.out.println("Good Afternoon");
        else if(today.get(Calendar.HOUR_OF_DAY) <= 20)
            System.out.println("Good Evening");
        else
            System.out.println("Good Night");
    }
}