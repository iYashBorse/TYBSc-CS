// 1.	Write a java program to demonstrate InputStream and OutputStream.

import java.io.*;                                             //IO package has the stream classes
public class Stream1{
  public static void main(String[] ar)throws IOException{     //I/O Exception are required to be handle while using Stream classes
    String data="";                                           //store the bytes that will be read from the file
    FileInputStream fin=new FileInputStream("testFile.txt");  //Creating instance of FileInputStream to read
    int i =0;
    while((i=fin.read())!=-1){                                //reads the byte till end of file is reached
      data = data+(char)i;
    }
    FileOutputStream out=new FileOutputStream("output.txt");  //Creating instance of FileOutputStream to write
    byte[] dataBytes= data.getBytes();                        //Converting the string into bytes

    out.write(dataBytes);                                    //writes data to the file
    System.out.println("Data is written in file!");          //just a msg indicating successful completion in console
    out.close();                                             //close the output stream
    fin.close();                                             //close the input stream
  }
}

/* The file from which you're reading data should exist and while giving the path, if the text file is in the same
directory as program file simply give the name of the file, otherwise mention the full path.
The file in which you're writing the data, if it doesn't exist already then a new file with the given name will be
created else if it exist then the existing file be overrided. */
