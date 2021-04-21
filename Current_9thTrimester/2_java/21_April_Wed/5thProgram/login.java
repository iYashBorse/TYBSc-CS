import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;



public class login extends HttpServlet{
		public void doGet(HttpServletRequest req , HttpServletResponse res)throws ServletException , IOException{
			PrintWriter out=res.getWriter();
			String uname=req.getParameter("uname");
			String pass=req.getParameter("pass");

			if(uname.equals("mitwpu")&&pass.equals("1234"))
				out.println("Welcome"+uname);
			else
				out.println("Error");
		}
}