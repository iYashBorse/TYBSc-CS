/* 

	product clasa with private members pno , prname and price ( as protected )
	accept and display methods . prdiscount is derived class with private
	memeber discount , accept and display methods. In prdiscount accept n records for 
	product and display all the recrods with netamount 
	payable


	Super Keyword  in java : 

	The super keyword refers to superclass (parent) objects. 
	It is used to call superclass methods, and to access the 
	superclass ( parent ) constructor. The most common use of the super
	keyword is to eliminate the confusion between superclasses ( parent class )
	and subclasses that have methods with the same name.   ( ref from  - W3school)


*/ 

import java.util.*;


class product{


	private int  pno ;
	private String  prname;
	protected int price ;


	void accept(){

	Scanner input = new Scanner(System.in);
	System.out.println("Enter product number , name and price ");
	pno = input.nextInt(); 
	prname = input.next();
	price = input.nextInt();

	}


	void display(){
	System.out.println(pno+" "+prname+" "+price);
	}

}

class prdiscount extends product{
	private int discount ;

	void accept(){
	super.accept(); // to accept the product details first
	System.out.println("Enter the discount amount for this product");
	Scanner input2 = new Scanner(System.in);
	discount = input2.nextInt();
	}


	void display(){
	super.display(); // to display the product details first
	System.out.println(" "+discount);
	}


	// Main Method 

	public static void main(String ninjaHattori[]){
		// To accept n number of details , so using array of Objects
		int x = Integer.parseInt(ninjaHattori[0]);
		prdiscount p[] = new prdiscount[x];

		// For accepting
		for(int i = 0; i<x; i++){
			p[i] = new prdiscount();
			p[i].accept();
		}
		// For displaying
		for(int i = 0 ; i<x; i++){
			p[i].display();

			//Calculating and printing in the same statement

			System.out.println("Total payable amount for the product  "+(i+1)+" is : "+(p[i].price-p[i].discount));
		}
	}

}