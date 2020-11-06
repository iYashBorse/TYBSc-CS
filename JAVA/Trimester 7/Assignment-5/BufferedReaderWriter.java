import java.io.*;
public class BufferedReaderWriter{
  public static void main(String[] ar){
    try{
      String data="";
      BufferedReader br=new BufferedReader(new FileReader("readFile.txt"));
      int i = br.read();
      while(i!=-1){
        data += (char)i;
        i = br.read();
      }
      //System.out.println(data);
      BufferedWriter bw=new BufferedWriter(new FileWriter("writeFile.txt"));
      bw.write(data);
      System.out.println("Successful!");
      br.close();
      bw.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
/* In this program, we don't need to convert string data to byte, BufferedReader
and BufferedWriter directly deals with the char type. But instead of FileInputStream
and FileOutputStream, we have to use FileReader and FileWriter, because these are defined
in the abstract class of Char Stream. */
