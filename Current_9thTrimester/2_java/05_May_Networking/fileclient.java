import java.net.*;
import java.io.*;
import java.util.*;



class fileclient
{
public static void main(String args[])
{
try
{
Socket s=new Socket("localhost",3333);
DataInputStream din=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
Scanner sc=new Scanner(System.in);
System.out.println("Enter file name to read from server..");
String fn=sc.next();
dout.writeUTF(fn);
String str=din.readUTF();
System.out.println(str);
}catch(Exception e){System.out.println("unable to get the response from server..file may not exists");}
}
}