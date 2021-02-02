/* 
	
	Super Keyword  in java : 

	The super keyword refers to superclass (parent) objects. 
	It is used to call superclass methods, and to access the 
	superclass ( parent ) constructor. The most common use of the super
	keyword is to eliminate the confusion between superclasses ( parent class )
	and subclasses that have methods with the same name.   ( ref from  - W3school)

*/



import java.util.*;

class bank
{
	private int cno;
	private String cname;
		bank(){
			cno= 0;
			cname = "";

		}
		bank(int cno,String cname)
		{
		this.cno=cno;
		this.cname=cname;
		}

		void accept(){

			Scanner s = new Scanner(System.in);
			System.out.println("Enter customer  number and name ");
			cno = s.nextInt();
			cname = s.next();
		}
	
		void display(){
		System.out.println(cno+" "+cname);
		}
}


class combine extends bank{
private int balance;


	combine(){
		balance = 0;
	}

	combine(int balance)
		{
		super(33,"perman");
		this.balance=balance;
		}

	void accept(){
		super.accept();
		System.out.println("Enter balance amount for this customer");
		Scanner sc = new Scanner(System.in);
		balance = sc.nextInt();
	}

	void display(){
	super.display();
	System.out.print(""+balance+"\n");
	}

	public static void main(String a[]){


	 combine ac = new combine();
	 ac.accept();
	 	 ac.display();


	combine ca= new combine(15000);
	ca.display();



}	}
