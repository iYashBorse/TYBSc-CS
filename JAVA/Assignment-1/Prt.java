// Assign-1-Program-2 
// Write a Java program to accept principal, rate of interest and no. of years from user and calculate simple interest . 


public class Prt{
  public static void main(String ar[]){
    float si = 0;				//intializing simple interest as si
    int p = Integer.parseInt(ar[0]);		//converting p(prinicipal) into integer
    float r = Float.parseFloat(ar[1]);		//converting r(rate of interest) into float
    int t = Integer.parseInt(ar[2]);		//converting t(time) into integer
    si = si + (p*r*t)/100;			//simple interest formula
    System.out.println("Simple Interest is "+si);
  }
}
