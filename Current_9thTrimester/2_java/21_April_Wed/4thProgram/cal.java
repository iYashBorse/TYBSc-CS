import javax.servlet.*;
import java.io.*;


public class cal extends GenericServlet{
	public void service(ServletRequest req , ServletResponse res)throws ServletException,IOException{
	PrintWriter out = res.getWriter();
	String a=req.getParameter("a");
	String b=req.getParameter("b");
	int x = Integer.parseInt(a);
	int y= Integer.parseInt(b);
	out.print("Multiplication ::"+(x*y));
	out.print("Substraction ::"+(x-y));
	}
}