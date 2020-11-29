/* pretty Straight forward question 
   a abstract class "figure"  with two abstract method area() and perimeter()
   and members are a and b of type integer.
   and two more classes extending the abstract class "figure" ( square and rectangle )
   You can accept the values using scanner class also , but for as  of now constructor 
   are used to initialize the values with hardcoded values.


   To understand abstract class in detail : 
   ( refer the following links )
   http://tutorials.jenkov.com/java/abstract-classes.html
   https://www.journaldev.com/1582/abstract-class-in-java


*/

import java.util.*;

abstract class figure{
	int a,b;
	abstract void area();
	abstract void perimeter();
}


class square extends figure{

	//Constructor
	square(int a){
	this.a = a;
	}

	void area(){
	int ar=a*a;
	System.out.println("\n The area of square is: "+ar);
	}

	void perimeter(){
	int pr=4*a;
	System.out.println("\n The perimeter of square is: "+pr);
	}
}



class rectangle extends figure{

	//Constructor
	rectangle(int a , int b){
	this.a = a;
	this.b = b ;
	}


	void area(){
	int ar=a*b;
	System.out.println("\n The area of rectangle is: "+ar);
	}

	void perimeter(){
	int pr=2*(a+b);
	System.out.println("\n The perimeter of rectangle is: "+pr);
	}
}


class abstrcls{

	public static void main(String ninjaHattori[]){
		square s=new square(5);
		s.area();
		s.perimeter();
		rectangle r=new rectangle(2 , 3);
		r.area();
		r.perimeter();
	}
}
