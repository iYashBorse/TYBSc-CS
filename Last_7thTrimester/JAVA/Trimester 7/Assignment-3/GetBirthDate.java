import java.util.Calendar;
import java.util.Scanner;

public class GetBirthDate {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Your Birth Date : ");
        String birthDateString = input.nextLine();			//Accept birthdate from user

        String[] birthDate = birthDateString.split("/",3); 		//return array where the elements are birthdate
        int birthDay = Integer.parseInt(birthDate[0]);			//typecasting str to int
        int birthMonth = Integer.parseInt(birthDate[1]);		//typecasting str to int
        int birthYear = Integer.parseInt(birthDate[2]);			//typecasting str to int
        
        Calendar today = Calendar.getInstance();			//Calendar object created
        int todayDay = today.get(Calendar.DAY_OF_MONTH);		//fetching today's date	
        int todayMonth = today.get(Calendar.MONTH) + 1;			
        int todayYear = today.get(Calendar.YEAR);

        int years;
        int months;
        int days;

        int daysInCurrentMonth = today.getActualMaximum(Calendar.DAY_OF_MONTH);

        years = todayYear - birthYear;

/* CodeLens - In this nested if block we check every condition for calculating age perfectly.
One condition is permanent- Your birthyear is always less than today's year. 
Second condition has two possibilities- first, if today's month greater than or equal to birth month, no
worries simply subtract it but in second case if birth month is greater than today's month which means you haven't
grown that old yet, so we decrement a year because you weren't one year old the instance you were born. 
Also, you need to check if today's date is greater than or equal to your birth date, in the first case, if it is equal
to or greater than, then simply subtract it otherwise if its less than, then we increment month by 1 because you're 
already that many months old.
*/        

	if(todayMonth >= birthMonth){
            months = todayMonth - birthMonth;
            if(todayDay >= birthDay){
                days = todayDay - birthDay;
            }
            else{
                months--;
                days = (daysInCurrentMonth - birthDay) + todayDay;
            }
        }
        else{
            years--;
            months = 12 - (birthMonth - todayMonth);
            if(todayDay >= birthDay){
                days = todayDay - birthDay;
            }
            else{
                months--;
                days = (daysInCurrentMonth - birthDay) + todayDay;
            }
        }

        System.out.println(years + " Years " + months + " Months " + days + " days ");

        input.close();
        
    }
}