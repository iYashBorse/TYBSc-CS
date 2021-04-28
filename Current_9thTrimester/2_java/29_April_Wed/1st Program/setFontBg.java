import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class setFontBg extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
    PrintWriter out = res.getWriter();
  	res.setContentType("text/html");
  	String color = req.getParameter("color");
    String font = req.getParameter("font");

    out.println("<html><body bgcolor="+color+">");
    out.println("<font face="+font+">"+ "Hello World");
    //out.println("<a href='C:/xampp/tomcat/webapps/servlets/setFontBgcolor.html'>Set different color</a>");
  }
}
