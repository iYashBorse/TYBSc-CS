//In this program, we will read a data from the file and write it into another file using BufferedInputStream and BufferedOutputStream
import java.io.*;

public class BufferedStream{
  public static void main(String[] ar){
   try{
      String data="";
      BufferedInputStream bis=new BufferedInputStream(new FileInputStream("readFile.txt"));
      int i = bis.read();
      while(i!=-1){
        data += (char)i;
        i = bis.read();
      }
      BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("writeFile.txt"));
      byte[] byteData= data.getBytes();
      bos.write(byteData);
      System.out.println("Successful!");
      bis.close();
      bos.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
/* BufferedInputStream and BufferedOutputStream deal with byte type of data
so we have to convert the string to byte in order to be able to use the write method. */
