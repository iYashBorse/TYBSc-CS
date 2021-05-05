<html>

        <body bgcolor="SkyBlue"><div><center>
            <%@ page import = "java.sql.*"%>


            <%

            try{
               int total = 0;
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost/login","root","");
               //out.println("<br><br>connected");
               Statement stmt = con.createStatement();
               ResultSet rs = stmt.executeQuery("SELECT * from user;");

               out.println("<html><body><div><table border=1><tr><td>Customer no</td><td>Name</td><td>Cust Rep</td><td>Credit Limit</td></tr>");
               while(rs.next()){
                 out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2));
               }
               out.println("</table></div></body></html>");

               con.close();
             } catch(Exception e) {
             out.println(e);
            }

             %></center></div>
</body></html>
