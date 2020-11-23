/* 1.	Write a program in java which accepts series of numbers from user as a
command line argument and create an array of only odd numbers and display the elements.*/
public class OddArr{
  public static void main(String[] ar){
    int a[]=new int[ar.length];                     //Initializing array with size that of count of arguments passed in cmd
    System.out.println("Odd element array is: ");
    for(int i=0;i<ar.length;i++){                  //parsing through cmd line arguments
      int n= Integer.parseInt(ar[i]);              //as the arguments are in string type, typecasting them to Integer
      if(n%2!=0){                                 //checking if number is not even(then it's got to be odd)
        a[i] = n;                                 //if the number is odd it will be stored in array
        System.out.print(a[i]+" ");               //prints out the array of odd elements.
      }
    }
  }
}
