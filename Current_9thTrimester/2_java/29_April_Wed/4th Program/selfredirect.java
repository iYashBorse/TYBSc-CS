import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class selfredirect extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		int i,sum=0;
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		String num=req.getParameter("num");
		if(num!=null){				//When the first time is page is loaded it does'nt have any value
			int n=Integer.parseInt(num);
			for(i=1;i<=n;i++)
			sum=sum+i;
			out.println("Sum of 1 to n ="+sum);
		}
		out.println("<html><body bgcolor=beige><form action='http://localhost:8080/servlets/selfredirect'>");
		out.println("<font color=red>Enter Number to print addition of 1..n <input type=text size=20 name=num></font>");
		out.println("<input type=submit></form></body></html>");
	}
}
