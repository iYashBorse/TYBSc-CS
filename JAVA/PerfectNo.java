// Assign-1-Program-3

/* A perfect number is a positive integer that is equal to the sum of its positive divisors, 
   excluding the number itself. For instance, 6 has divisors 1, 2 and 3, and 1 + 2 + 3 = 6, so 6 
   is a perfect number.  KudosYouGotIt.  ( source-Wikipedia ( excluding the kudos part )).
*/

// It's a java program to  find perfect numbers between 1-50 . 


public class PerfectNo{
  public static void main(String args[]){
      int i;
      for(int j=1;j<=50;j++){		//iterates through range 1 to 50
        int sum = 0;			//intializing sum to 0 for every number
        for(i=1;i<=j/2;i++){		// divides the number(j) with every number(i) smaller than it 
          if(j%i==0){
            sum += i;			//adds number(i) to sum if number(j) is divisible by it
          }
        }
        if(sum==j){			//if addition of factors is equal to the original number
          System.out.println(j+" is a perfect no.");
        }
      }
  }
}
