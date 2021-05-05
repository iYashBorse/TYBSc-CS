import java.net.*;
import java.io.*;
class filelistserver
{
public static void main(String args[])throws Exception
{
int cnt=0;
ServerSocket ss=new ServerSocket(3333);
Socket s=ss.accept();
DataInputStream din=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

String str="";
while(!str.equals("stop"))
{
str=din.readUTF();
File f=new File(str);
if(f.exists())
cnt++;
}

dout.writeUTF("Count of existing files is "+cnt);
din.close();
s.close();



ss.close();
}
}