//Ass-3 set-A Q1

import java.util.Scanner;                                         //Scanner class is used take input from user
public class longestStr{
  public static void main(String ar[]){
    int n; String s[]=new String[10];                             //Creating an empty string array
    Scanner in= new Scanner(System.in);                           //Scanner class instance created
    System.out.println("How many strings you want to enter: ");
    n = in.nextInt();                                             //storing how many strings user has to provide
    in.nextLine();                                                //after int type input is accepted, this is required
    for(int i=0;i<n;i++){                                         //asking user to input one by one till n strings are accepted
      System.out.println("Enter String: ");
      s[i] = in.nextLine();                                       //nextLine() accepts the whole string
    }
    int maxlen = 0;                                               //storing the maximum length of string
    int idx = 0;                                                  //storing the index of that string
    for(int j=0; j<n; j++){
      if(s[j].length() > maxlen){                                //compares the n strings
        maxlen = s[j].length();
        idx = j;
      }
    }
    System.out.println("Maximum length of string is "+maxlen+" and the string is "+s[idx]);
    in.close();
  }
}
