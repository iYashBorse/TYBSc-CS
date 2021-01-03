/*Write a java program to calculate the sum and average of an array of 100 integers
(generated randomly) using 10 threads. Each thread calculates the sum of 10 integers.
Use these values to calculate average. [Use join method ]*/

import java.util.*;

class sumThread extends Thread{
  private int sum=0;
  Random r=new Random();
  public void run(){
    int arr[]=new int[10];
    for(int i=0;i<10;i++){
      arr[i]=r.nextInt(200);
      sum=sum+arr[i];
    }
  }
  int tsum(){
    System.out.println("I am done "+sum);
    return sum;
  }
}

public class sumNumbers{
  public static void main(String a[]) throws Exception{
    int tot=0;
    sumThread t[]=new sumThread[10];
    for(int i=0;i<10;i++){
      t[i]=new sumThread();
      t[i].start();
      t[i].join();
      tot=tot+t[i].tsum();
    }
    
    System.out.println("Sum of 100 integers generated randomly is "+tot);
    System.out.println("Their average is "+(tot/100));
    }
}
