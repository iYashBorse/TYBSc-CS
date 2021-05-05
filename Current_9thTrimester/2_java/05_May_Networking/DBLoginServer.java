import java.net.*;
import java.io.*;
import java.util.*;
import java.sql.*;
class DBLoginServer
{
public static void main(String args[])
{
try
{
ServerSocket ss=new ServerSocket(3333);
Socket s=ss.accept();
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
DataInputStream din=new DataInputStream(s.getInputStream());
String uname=din.readUTF();
String pass=din.readUTF();
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/login","root","shaunthesheep");
PreparedStatement st=con.prepareStatement("select * from user where username=? and password=?");
st.setString(1,uname);
st.setString(2,pass);
ResultSet rs=st.executeQuery();
if(rs.next())
dout.writeUTF("Welcome..");
else
dout.writeUTF("Try Again..");
s.close();
ss.close();
}catch(Exception e){System.out.println("Exception found..");}



}
}