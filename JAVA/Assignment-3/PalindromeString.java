//Ass-3 set-B Q1
import java.util.Scanner;

public class PalindromeString{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String str, revStr = "";
		char[] strChar = new char[20];

		System.out.println("Enter String to be reversed: ");
		str = scan.nextLine();
		strChar = str.toCharArray(); 
		// converts the string to a array of characters example : "Rutwik" -> {'R','u','t','w','i','k'}

		for(int i = strChar.length-1; i>=0; i--){
			revStr += strChar[i]; // iterated the function from the last index to 0th idex to get the 
								  // characters in the reverse order and then appended to the variable revStr
		}

		if (revStr.compareToIgnoreCase(str) == 0) // compareToIgnoreCase returns 0 if the revStr and str 
												  // have the same containts. It is case-insensitive . 
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");

        scan.close();
	}
}