import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class findEmp extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
    PrintWriter out = res.getWriter();
  	res.setContentType("text/html");
    int eno = Integer.parseInt(req.getParameter("empno"));

    try{
      Class.forName("com.mysql.cj.jdbc.Driver"); //loads the Driver
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","root"); //Establishing a connections
      String sql = "SELECT * FROM employee2 WHERE eno="+eno+"";
      Statement stmt = con.createStatement();

      ResultSet rs = stmt.executeQuery(sql);

      out.println("<html><body bgcolor=Beige><div><table><tr><td>Employee no</td><td>Employee Name</td><td>Designation</td></tr>");
      while(rs.next()){
        out.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td></tr>");
      }
      out.println("</table></div></body></html>");

      stmt.close();
      con.close();
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
