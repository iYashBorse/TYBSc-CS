import java.sql.Date;				//importing Date class
import java.util.Calendar;			//importing Calendar class

public class DateGreeting {
    public static void main(String[] args){
        Calendar today = Calendar.getInstance();	//Calendar object created
        System.out.println(today.get(Calendar.DATE) + " / " + today.get(Calendar.MONTH) + " / " + today.get(Calendar.YEAR));		//Displays today's date
        if(today.get(Calendar.HOUR_OF_DAY) <= 12)
            System.out.println("Good Morning");
        else if(today.get(Calendar.HOUR_OF_DAY) <= 16)
            System.out.println("Good Afternoon");
        else if(today.get(Calendar.HOUR_OF_DAY) <= 20)
            System.out.println("Good Evening");
        else
            System.out.println("Good Night");
	
	/* CodeLens- In line 8 to 15, we fetch hour using get method of Calendar class, HOUR_OF_DAY is
		     is used instead of HOUR because we require it in 24 hour format. Then we simply 
		     check conditions and greet accordingly.
	*/
    }
}