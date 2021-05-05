import java.net.*;
import java.io.*;
import java.util.*;
class DBLoginClient
{
public static void main(String args[])
{
try
{
Socket s=new Socket("localhost",3333);
DataInputStream din=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
Scanner sc=new Scanner(System.in);
System.out.println("Enter user name and password to create a record..");
String un=sc.next();
String ps=sc.next();
dout.writeUTF(un);
dout.writeUTF(ps);
String str=din.readUTF();
System.out.println(str);
}catch(Exception e){System.out.println("unable to get the response from server..");}
}
}