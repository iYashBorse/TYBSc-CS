import java.net.*;
import java.io.*;

class fileserver
{
public static void main(String args[])
{
try
{
ServerSocket ss=new ServerSocket(3333);
Socket s=ss.accept();
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
DataInputStream din=new DataInputStream(s.getInputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str=din.readUTF();
FileReader fr=new FileReader(str);
BufferedReader b=new BufferedReader(fr);
String line=null,data=null;
while((line=b.readLine())!=null)
data=data+line+"\n";
dout.writeUTF(data);
s.close();
ss.close();
}catch(FileNotFoundException e){System.out.println("Exception ..may be file not found..");}
catch(Exception q){System.out.println(q);}
}
}