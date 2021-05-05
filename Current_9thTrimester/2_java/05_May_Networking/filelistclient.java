import java.net.*;
import java.io.*;
class filelistclient{
public static void main(String args[])throws Exception{
Socket s=new Socket("localhost",3333);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
DataInputStream din=new DataInputStream(s.getInputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i=1;
for(;;)
{
System.out.println("Enter file name "+i);
String str=br.readLine();
dout.writeUTF(str);
dout.flush();
if(str.equals("stop"))
{
String cnt=din.readUTF();
System.out.println(cnt);
System.exit(0);
}
i++;
}
}
}