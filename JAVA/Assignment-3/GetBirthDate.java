import java.util.Calendar;
import java.util.Scanner;

public class GetBirthDate {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Your Birth Date : ");
        String birthDateString = input.nextLine();

        String[] birthDate = birthDateString.split("/",3); 
        int birthDay = Integer.parseInt(birthDate[0]);
        int birthMonth = Integer.parseInt(birthDate[1]);
        int birthYear = Integer.parseInt(birthDate[2]);
        
        Calendar today = Calendar.getInstance();
        int todayDay = today.get(Calendar.DAY_OF_MONTH);
        int todayMonth = today.get(Calendar.MONTH) + 1;
        int todayYear = today.get(Calendar.YEAR);

        int years;
        int months;
        int days;

        years = todayYear - birthYear;

        if(todayMonth >= birthMonth){
            months = todayMonth - birthMonth;
            if(todayDay >= birthDay){
                days = todayDay - birthDay;
            }
            else{
                months++;
                days = birthDay - todayDay ;
            }
        }
        else{
            years--;
            months = 12 - (birthMonth - todayMonth);
            if(todayDay >= birthDay){
                days = todayDay - birthDay;
            }
            else{
                months++;
                days = birthDay - todayDay ;
            }
        }

        System.out.println(years + " Years " + months + " Months " + days + " days ");
        
    }
}