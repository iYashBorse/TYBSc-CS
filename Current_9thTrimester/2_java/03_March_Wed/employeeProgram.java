// Must Read :  https://docs.oracle.com/javase/tutorial/jdbc/basics/processingsqlstatements.html

import java.sql.*; // step 1 : Importing the sql package 

class  employeeProgram{
	
	public static void main(String[]  ninjaHattori){

		try{

			Class.forName("com.mysql.jdbc.Driver"); // step 2 : Load and Register the Driver  , driver can be different for different db's 
													// using forName method , register the driver.
			// step 3 : Establish the connection 
			// To  establish the connection you need to  instantiate the  Connection interface 
			// but as you might know you "cannot"  instantiate interface directly , there is a getConnection() method
			// which someone else wrote for us to create the Object of interface Connection.
			// The parameters are " URL , UserName , Password" for getConnection() Method
			// getConnection method is a static method in class DriverManager.
			// The following URL written below  works for me. It might be different at your side.
			// Am using XAMPP ( myphpadmin ) to create db's.
			Connection con = DriverManager.getConnection("jdbc:mysql://192.168.64.3/shaun", "shaun",     "root");
			//											    	       "URL"	     db		UserName	Password			
			// step 4 : Create the statement 
			//A Statement is an interface that represents a SQL statement. 
			//You execute Statement objects, and they generate ResultSet objects, 
			//which is a table of data representing a database result set. 
			//You need a Connection object to create a Statement object.
			// Here, con is a reference to Connection interface used in previous step
			Statement stmt = con.createStatement();
			// step 5 : execute the query  :  to execute  a query you'll need  statement object
			// Here stmt  is the reference  to statement object.
			ResultSet rs = stmt.executeQuery("select * from employee");


			//There is a cursor ( or pointer ) which points to the row of the result set in our db 
			// the cursor is pointing the row before  the actual  row ( containing the data )
			// so we use next() method to move  to next row 
			// You can manually  move to next row  for example : 
			// rs.next(); 
			// System.out.println("rs.getString(1)+""+rs.getInt(2));
			//  rs.next();
			// System.out.println("rs.getString(1)+""+rs.getInt(2));
			// But it's tedious  to do  when you have  multiple rows. 
			// rather you can use  while loop and place ( rs.next() and it will check for next row until true)
			while(rs.next())
				// step 6 : Process the result
				System.out.println(rs.getString(1) +" "+rs.getInt(2));
				// step 7 , final step :  close the connections.
			    // When you are finished using a Connection, Statement, or ResultSet object, 
			    // call its close method to immediately release the resources it's using.

				stmt.close();
				con.close();

		}catch(Exception e){
			System.out.println(e);
		}
	}
}
// Reference's:  https://docs.oracle.com/javase/tutorial/jdbc/basics/processingsqlstatements.html
// 				 Youtube channel of Telusko.