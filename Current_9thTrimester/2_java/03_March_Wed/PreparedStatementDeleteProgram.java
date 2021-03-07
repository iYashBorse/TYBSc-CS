import java.sql.*;

class PreparedStatementDeleteProgram{
	
	public static void main(String[] ninjaHattori){
	try{

			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded successfully");

			Connection con = DriverManager.getConnection("jdbc:mysql://192.168.64.3/shaun","shaun","root");
			PreparedStatement stmt = con.prepareStatement("delete from employee where age =?");

			stmt.setInt(1,18);
			int i=stmt.executeUpdate();
			System.out.println(i+" records deleted successfully"); 

			stmt.close();
			con.close();

	  	}catch(Exception e){System.out.println(e);}
	}
}

