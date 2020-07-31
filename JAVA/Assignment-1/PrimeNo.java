// Ass-1 Set-B Q-1
/* Write a program in java that accepts n numbers as command 
line arguments from user and display only prime numbers. */
/* A number which is divisible by 1 and itself only is a prime number. */
public class PrimeNo{
  public static void main(String num[]){
    boolean flag = false;			//initializing a flag
    for(int i=0;i<num.length;i++){		//iterating through number of arguments
      flag = false;   				//reset flag for every value
      int n = Integer.parseInt(num[i]);		//Converting the argument(although number but a str type) into integer
      for(int j=2;j<n/2;j++){			//will divide number from 2 to half of its value
        if(n%j==0){				
          flag = true;				//if number is divisible by any other number flag sets true	
          break;
        }
      }
      if(flag==false){				//wil print only if flag is false
        System.out.println(n+" is Prime.");
      }
    }
  }
}
