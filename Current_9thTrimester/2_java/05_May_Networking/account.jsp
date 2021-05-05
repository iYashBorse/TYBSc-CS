<html>
<%! Connection con=null;%>
<%@ page import="java.sql.*"%>
<body>
<table border=1>
<tr><th>Customer Name <th>Account Number <th>Account Balance </tr>
<%
try
{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select cname,accno,bal from customer,acc where customer.cno=acc.cno");
while(rs.next())
{
%><tr><td><%=rs.getString(1)%><td><%=rs.getInt(2)%><td><%=rs.getInt(3)%></tr>
<%
}
}catch(Exception e)
{
out.println("Some Exception here...."+e);
}
%>
</body>
</html>