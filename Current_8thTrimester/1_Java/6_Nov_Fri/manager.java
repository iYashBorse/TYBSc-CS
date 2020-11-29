/*

	Define a class Employee having private members : id , name , department , and protected salary.
	Create a subclass called " Manager " with private member bonus.
	Define methods accept and display in both the classes. 
	Create " n" Objects of the manager class and display the details of the manager
	having the maximum total salary ( Salary + bonus )


	
	Super Keyword  in java : 

	The super keyword refers to superclass (parent) objects. 
	It is used to call superclass methods, and to access the 
	superclass ( parent ) constructor. The most common use of the super
	keyword is to eliminate the confusion between superclasses ( parent class )
	and subclasses that have methods with the same name.   ( ref from  - W3school)



*/


import java.util.*;

class emp{

	private int id;
	private String name , dn;
	protected  int sal;


	void accept(){

	Scanner input = new Scanner(System.in);
	System.out.println("Enter  Customer id(int) , name(char)  department(char) and salary(int) :");
	id = input.nextInt();
	name = input.next();
	dn = input.next();
	sal = input.nextInt();
	}


	void display(){
	System.out.println(id + " " + name+" "+dn+" "+sal);
	}

}

	class manager extends emp{

		private int bonus ;

		void accept(){

		super.accept();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Bonus :");
		bonus = input.nextInt();
		}

		void display(){
		super.display();
		System.out.println(""+bonus);
		}

		static void maxsal(manager m[] , int c){
			int i , tot = 0 , max = 0 , y = 0;
			for(i=0; i<c ; i++){
				tot = m[i].sal+m[i].bonus;
				if(tot>max){
					max = tot;
					y=i;
				}
			}
			System.out.println("Manager with highest salary is : ");
			m[y].display();
			System.out.println("Total salary = "+max);
		}



		public static void main(String[] ninjaHattori){
			int x = Integer.parseInt(ninjaHattori[0]);
			manager h[]=  new manager[x];
			for(int i =0; i<x; i++){
				h[i] = new manager();
				h[i].accept();
			}
			for(int i =0; i<x; i++)
				h[i].display();
			maxsal(h,x);
		}
	}


