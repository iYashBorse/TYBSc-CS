/* 2.	Write a program using java that accepts elements
of array and display them in reverse order.*/
import java.util.Scanner;
public class RevArr{
  public static void main(String ar[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of elements: ");           //Accepting number of elements we want to store
    int n= sc.nextInt();
    int[] a= new int[n];                                        //Initializing array with size 'n'
    for(int i=0;i<n;i++){                                       //Accepting elements of array
      System.out.println("Enter element "+(i+1)+": ");
      a[i]=sc.nextInt();
    }

    System.out.println("Original order: ");
    for(int i=0;i<n;i++){                                       //firstly, we print the orignal order
      System.out.print(a[i]+" ");
    }

    System.out.println("\nReverse order:");
    for(int i=a.length-1;i>=0;i--){                             //starting printing from last to first(i.e. reverse order)
      System.out.print(a[i]+" ");
    }
  }
}
