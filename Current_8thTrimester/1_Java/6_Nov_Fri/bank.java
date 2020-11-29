/* 
	
	Super Keyword  in java : 

	The super keyword refers to superclass (parent) objects. 
	It is used to call superclass methods, and to access the 
	superclass ( parent ) constructor. The most common use of the super
	keyword is to eliminate the confusion between superclasses ( parent class )
	and subclasses that have methods with the same name.   ( ref from  - W3school)

*/

import java.util.*;

class bankcust
{
	private int cno;
	private String cname;

		void accept(){

			Scanner s = new Scanner(System.in);
			System.out.println("Enter customer number and name :");
			cno = s.nextInt();
			cname = s.next();
		}
	
		void display(){
		System.out.println(cno+" "+cname);
		}
}


class bank extends bankcust{
private int balance;
	void accept(){
		super.accept();
		System.out.println("Enter balance amount for this customer :");
		Scanner sc = new Scanner(System.in);
		balance = sc.nextInt();
	}

	void display(){
	super.display();
	System.out.print(""+balance+"\n");
	}

	public static void main(String[] ninjaHattori){
		
	bank ca= new bank();
	ca.accept();
	ca.display();
}	}
