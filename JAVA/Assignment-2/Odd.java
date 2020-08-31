Write a program in java which accepts series of numbers from user as a command line argument and create an array of only odd numbers and display the elements.





import java.util.*;
 public class odd
{
	public static void main(String args[])
	{
		int a[]=new int[50];
		int j=0;
		for(int i=0;i<args.length;i++)
		{
			int n=Integer.parseInt(args[i]);
			if(n%2!=0)
			{
				a[j]=n;
				j++;
			}
		}
		System.out.println("The odd elements are");
		for(int i=0;i<j;i++)
		{
			System.out.println(a[i]);
		}
	}
}
