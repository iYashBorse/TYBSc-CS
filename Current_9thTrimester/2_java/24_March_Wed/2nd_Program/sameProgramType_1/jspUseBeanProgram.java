package pack;
import java.sql.*;

public  class jspUseBeanProgram{
	 private  String name;
     private String password;
   


  public void setPassword(String password){
  this.password = password;
  }

  public String getPassword(){
  return password;
  }


  public void setName(String name){
  this.name = name;
  }

  public String getName(){
  return name;
  }

    public void insert(){

  

		 try{     
		 	        Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver Loaded successfully");

					Connection con = DriverManager.getConnection("jdbc:mysql://192.168.64.3/trivial","shaun","root");
         			PreparedStatement stmt = con.prepareStatement("insert into user values(?,?)");
			         stmt.setString(1,getName());
			         stmt.setString(2,getPassword());
         			 stmt.executeUpdate();

		         	System.out.println("Successs");

					stmt.close();
					con.close();

			}       catch(Exception e){
			  		System.out.println(e);
			        }
	
	}

}
