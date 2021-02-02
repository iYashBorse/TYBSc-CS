/*
Helpful Links : 	http://tutorials.jenkov.com/java/abstract-classes.html
					https://www.journaldev.com/1582/abstract-class-in-java

Create an abstract class Shape with methods calc_area and calc_volume. Derive three classes
Sphere(radius) , Cone(radius, height) and Cylinder(radius, height), Box(length, breadth, height)
from it. Calculate area and volume of all. (Use Method overriding).

Area of Sphere : A = 4πr2
Volume of Sphere : V = 4/3*(πr^3)

Area of Cone : A = πr*(r+h^2+r^2)
Volume of Cone : V = πr^2*(h/3)

Area of Cylinder : A = 2πrh + 2πr^2
Volume of Cylinder : V = πr^2h

Area of Box :  A =  2(h × b) + 2(h × l) + 2(b × l) // Surface area of a box. 
Volume of Box : V = h × b × l 


*/

import java.util.*;


abstract class Shape{
	double pi = 3.14;
	int radius , height , breadth , length; 

	abstract void area(); 
	abstract void volume();
}


class Sphere extends Shape{
		//Area of Sphere : A = 4πr2
		//Volume of Sphere : V = 4/3*(πr^3)

		//Constructor to initialize  the radius
		// Here in this program instead of using user inputs we are using hardcoded values.
		// You can simply use Scanner class to take inputs rather than constructors.
		Sphere(int radius){
		this.radius = radius;
		}


		void area(){
		double ar = 4*pi*radius*radius;
		System.out.println("\n The area of sphere is: "+ar);
		}


		void volume(){
		double vl = 4/3*(pi*(radius*radius*radius));
		System.out.println("\n The Volume  of Sphere is: "+vl);
		}
}


class Cone  extends Shape{
	//Area of Cone : A = πr*(r+h^2+r^2)
	// Volume of Cone : V = πr^2*(h/3)
		int radius , height ;
		Cone(int radius , int height){
		this.radius = radius;
		this.height = height ;
		}


		void area(){
		double ar= pi*radius*(radius + (height*height)+( radius * radius));
		System.out.println("\n The area of Cone is: "+ar);
		}


		void volume(){
		double vl= pi*(radius * radius)*(height/3);
		System.out.println("\n The Volume of Cone is: "+vl);
		}
}



class Cylinder  extends Shape{

	//Area of Cylinder : A = 2πrh + 2πr^2
	//Volume of Cylinder : V = πr^2h

		Cylinder(int radius , int height){
		this.radius = radius;
		this.height= height ;
		}


		void area(){
		double ar= (2*pi*radius*height) + (2*pi*(radius*radius));
		System.out.println("\n The area of Cylinder is: "+ar);
		}


		void volume(){
		double vl= pi*(radius*radius)*height;
		System.out.println("\n The Volume of Cylinder is: "+vl);
		}
}
class Box  extends Shape{
	//Area of Box :  2(h × b) + 2(h × l) + 2(b × l)  Surface Area.
	//Volume of Box : h × b × l

		Box(int length , int breadth , int height){
		this.length = length;
		this.breadth = breadth;
		this.height = height;
		}


		void area(){
		double ar=2*(height*breadth)+2*(height*length) +2*(breadth*length);
		System.out.println("\n The area of Box is: "+ar);
		}


		void volume(){
		double vl=length*breadth*height;
		System.out.println("\n The Volume of Box is: "+vl+"\n");
		}
}


class abstractShape
{
	public static void main(String ninjaHattori[]){

			Sphere s=new Sphere(7);
			s.area();
			s.volume();
			Cone c=new Cone(2 , 3);
			c.area();
			c.volume();
			Cylinder cy = new Cylinder(3 , 4 );
			cy.area();
			cy.volume();
			Box b = new Box(2 , 3 , 4 );
			b.area();
			b.volume();
	}
}
