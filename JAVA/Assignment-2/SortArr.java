/*3.	Write a program using java that accepts elements of array and display them in ascending order.*/
import java.util.Scanner;
public class SortArr{
  public static void main(String[] ar){
    Scanner sc=new Scanner(System.in);
    System.out.println("How many elements:");                       //number of elements you want to store
    int n = sc.nextInt();

    int[] arr = new int[n];                                        //Initializing array with size 'n'

    System.out.println("Enter elements of array: ");
    for(int i=0;i<arr.length;++i){                                 //accepting elements of array
        arr[i] = sc.nextInt();
    }

  /*  System.out.println("Descending order array is: ");          //you can use this block for Descending order
    for(int i=0; i<arr.length-1;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]<arr[j]){
          int temp= arr[i];
          arr[i]=arr[j];
          arr[j]= temp;
        }
      }
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    } */

    System.out.println("\n Ascending order array is: ");
    /* CodeLens- We use two for loops, first for loop for selecting current element of array(starting by index 0).
                 Second for loop is for selecting the next element(beginning with index 1). Then we compare the
                 current element and the next element, if current element is bigger than next element, we replace them.
                 We continue to do so for every element. This type of sorting is called bubble sorting.*/
    for(int i=0; i<arr.length-1;i++){           //if size of array is 5, in this loop we will go till second last element
      for(int j=i+1;j<arr.length;j++){          //here we skip first element and go till the last element
        if(arr[i]>arr[j]){
          int temp= arr[i];                     //swapping if condition is true
          arr[i]=arr[j];
          arr[j]= temp;
        }
      }
    }
    for(int i=0;i<arr.length;i++){            //print out the elements in sorted order
        System.out.print(arr[i]+" ");
    }
  }
}

/* Logic for descending order is same except there is a change in if condition. */
