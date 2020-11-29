/*

Write a Java program to create a super class Vehicle having members Company and price.
Derive 2 different classes LightMotorVehicle (members – mileage) and HeavyMotorVehicle
(members – capacity-in-tons). Accept the information for n vehicles and display the information
in appropriate form. While taking data, ask the user about the type of vehicle first. 


Super Keyword : 

The super keyword refers to superclass (parent) objects. 
It is used to call superclass methods, and to access the
superclass constructor. The most common use of the super 
keyword is to eliminate the confusion between superclasses(i.eparent classes) 
and subclasses that have methods with the same name.

*/

import java.util.*;

class Vehicle{

    private String Company;
    private float price;

    Scanner sc=new Scanner(System.in); 


    void accept(){
      System.out.println("Enter Company name: ");
      Company = sc.next();
      System.out.println("Enter price: ");
      price = sc.nextFloat();
    }

    void display(){
      System.out.println("\nCompany name: "+Company+"\nPrice: "+price+" Lakhs.");
    }

}


class LMV extends Vehicle{

    private int mileage;

    void accept(){
      super.accept(); //Calling the accept() method from parent class Vehicle.
      System.out.println("Enter mileage: ");
      mileage = sc.nextInt();
    }


    void display(){
      super.display(); // Calling the display() method from parent class Vehicle
      System.out.println("Mileage: "+mileage+" kmph.\n");
    }

}

class HMV extends Vehicle{

    private int capacity;

    void accept(){
      super.accept();
      System.out.println("Enter capacity: ");
      capacity = sc.nextInt();
    }


    void display(){
      super.display();
      System.out.println("Capacity: "+capacity+" tons.\n");
    }
}

class VehicleMain{

  public static void main(String[] ninjaHattori){

    Scanner sc=new Scanner(System.in);

    System.out.println("1.LMV \n2.HMV \nWhich type of Vehicle: ");
    int ch= sc.nextInt();

    System.out.println("Enter number of vehicles: ");
    int n= sc.nextInt();

    switch(ch){
      case 1: // Array of Objects
      // ! Note that when we say Array of Objects it is not the object itself that is stored in the array but the reference of the object.
      // Syntax : Class_Name[] obj= new Class_Name[Array_Length];
      // Helpful Link : https://www.geeksforgeeks.org/how-to-create-array-of-objects-in-java/

              LMV[] l=new LMV[n];
              for(int i=0; i<l.length;i++){
                l[i]=new LMV();
                l[i].accept();
                l[i].display();
              }

              break;

      case 2:
              HMV[] h=new HMV[n];
              for(int i=0; i<h.length;i++){
                h[i]=new HMV();
                h[i].accept();
                h[i].display();
              }

              break;
              
      default:
              System.out.println("Invalid Choice!!!");
    } // Closing of switch case
  } // Closing of main method
} // Closing of VehicleMain class 
