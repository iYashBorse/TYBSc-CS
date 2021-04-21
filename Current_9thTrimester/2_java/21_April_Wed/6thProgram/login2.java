import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class login2 extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        PrintWriter out=res.getWriter();
        String uname=req.getParameter("uname");
        String pass=req.getParameter("pass");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","shaunthesheep");
            PreparedStatement st=con.prepareStatement("select * from user where username=? and password=?");
            st.setString(1,uname);
            st.setString(2,pass);
            ResultSet rs=st.executeQuery();
            if(rs.next())
              out.println("Welcome "+ uname);
            else
              out.println("Try again");
        }catch(Exception e){out.println(e);}
    }
}
