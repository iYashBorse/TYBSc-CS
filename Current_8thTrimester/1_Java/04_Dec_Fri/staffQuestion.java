/*
 
Define an abstract class “Staff” with members name and address. 
Define two sub-classes of this class – 
“FullTimeStaff” (department, salary) and “PartTimeStaff” (number-of-hours, rate-perhour). 
Define appropriate constructors. Create n objects which could be of either FullTimeStaff
or PartTimeStaff class by asking the user’s choice. Display details of all “FullTimeStaff”
objects and all “PartTimeStaff” objects.

*/


import java.util.*;

 abstract class  Staff{

    private String name ="" , address ="";

    Scanner userInput=new Scanner(System.in); 


    void accept(){
      System.out.println("Enter name: ");
      name = userInput.nextLine();
      System.out.println("Enter Address: ");
      address = userInput.nextLine();
    }


    void display(){
      System.out.println("\nname: "+name+"\nAddress: "+address);
    }

}

// Full Time Staff 
class FTS extends Staff{

    private String  department;
    private int salary;

    void accept(){
      super.accept(); //Calling the accept() method from parent class Staff.
      System.out.println("Enter Department: ");
      department = userInput.nextLine();
      System.out.println("Enter Salary :");
      salary = userInput.nextInt();
    }


    void display(){
      super.display(); // Calling the display() method from parent class Staff
      System.out.println("Department : "+department+"\nSalary :"+salary+".\n");
    }

}
// Part Time Staff
class PTS extends Staff{
	// (number-of-hours , rate-perhour) 

    private int numberOfHours , ratePerHour;

    void accept(){
      super.accept();
      System.out.println("Enter numberOfHours: ");
      numberOfHours = userInput.nextInt();
      System.out.println("Enter ratePerHour :");
      ratePerHour = userInput.nextInt();
    }


    void display(){
      super.display();
      System.out.println("Number of Hour : "+numberOfHours+" Rate Per Hour :"+ratePerHour+"\n");
    }
}

class staffQuestion{

  public static void main(String[] ninjaHattori){

    Scanner userInput=new Scanner(System.in);

    System.out.println("1.PTS(Part Time Staff ) \n2.FTS(Full Time Staff) \nWhich type of Staff : ");
    int ch= userInput.nextInt();

    System.out.println("Enter number of Staff : ");
    int n= userInput.nextInt();

    switch(ch){
      case 1: // Array of Objects
      // ! Note that when we say Array of Objects it is not the object itself that is stored in the array but the reference of the object.
      // Syntax : Class_Name[] obj= new Class_Name[Array_Length];
      // Helpful Link : https://www.geeksforgeeks.org/how-to-create-array-of-objects-in-java/

              PTS[] l=new PTS[n];
              for(int i=0; i<l.length;i++){
                l[i]=new PTS();
                l[i].accept();
                l[i].display();
              }

              break;

      case 2:
              FTS[] h=new FTS[n];
              for(int i=0; i<h.length;i++){
                h[i]=new FTS();
                h[i].accept();
                h[i].display();
              }

              break;
              
      default:
              System.out.println("Invalid Choice!!!");
    } // Closing of switch case
  } // Closing of main method
} // Closing of Staff class 
