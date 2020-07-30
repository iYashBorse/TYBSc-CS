// Assign-1-Program-1
// As it is the first program  ,  if you want to know why the file name is same as the public class name 
// https://stackoverflow.com/questions/2134784/why-are-filenames-in-java-the-same-as-the-public-class-name  ( Don't be lazy , its really helpful ).
// It's not very  technical , the javaCreator decided to do , so they did. 

// This program is in java to accept String from user and display it on console.


public class StrDis{		//class declaration (same as file name)
  public static void main(String ar[]){		//main function declaration
    for(int i=0;i<ar.length;i++){		//accepting arguments from console
        System.out.print(ar[i]+" ");		//printing arguments (a string as sequence of characters)
    }
  }
}
/* The length function is used without parentheses while working with command line arguments. */
