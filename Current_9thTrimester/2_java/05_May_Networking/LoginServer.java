import java.net.*;
import java.io.*;
import java.util.*;
class LoginServer
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
if(uname.equals("admin") && pass.equals("pass"))
dout.writeUTF("Welcome..");
else
dout.writeUTF("Try Again..");
s.close();
ss.close();
}catch(FileNotFoundException e){System.out.println("Exception ..may be file not found..");}
catch(Exception q){System.out.println(q);}
}
}