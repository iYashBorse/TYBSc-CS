import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class empRecord extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
    PrintWriter out = res.getWriter();
  	res.setContentType("text/html");
    int eno = Integer.parseInt(req.getParameter("empno"));
    String ename = req.getParameter("ename");
    String desig = req.getParameter("desig");

    try{
      Class.forName("com.mysql.cj.jdbc.Driver"); //loads the Driver
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","root"); //Establishing a connections

      PreparedStatement stmt = con.prepareStatement("INSERT INTO employee2 VALUES(?,?,?)");

      stmt.setInt(1,eno);

      stmt.setString(2,ename);

      stmt.setString(3,desig);

      int i = stmt.executeUpdate();
      if(i>0)
        out.println("<html><body bgcolor=Beige><h1>Table updated Successfully!</h1></body></html>");

      stmt.close();
      con.close();
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
