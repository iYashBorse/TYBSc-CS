/*Write a program using threads which will accept a search
string from the user and display the line number where the
string was found in each file */

import java.io.*;
import java.util.Scanner;

public class ThreadStrSearch{
public static void main(String args[]) {
try {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string to search: ");
    String srch = sc.next();
    String folderpath = "D:\\Java\\";
    File f = new File(folderpath);
    String[] files = f.list();
    for (int i=0;i<files.length;i++)
    {
      boolean chk = files[i].contains(".java");
      if(chk){
        new FindLine( new File( folderpath+files[i] ), srch ).start();
      }
    }
    }catch(Exception e)
    {
    e.printStackTrace();
    }
    }
}

class FindLine extends Thread {
	File searchfile;
  String srch;
	FindLine(File searchfile, String srch)
	{
	this.searchfile = searchfile;
  this.srch = srch;
	}
	public void run()
	{
	try{
     FileReader reader = new FileReader(searchfile);
	   BufferedReader br = new BufferedReader(reader);
	   String s;
	   int i = 0;
  	while ((s = br.readLine()) != null){
      boolean flag = false;
    	i++;
      if( s.contains(srch) ){
        flag = true;
      }
      if (flag == true){
        System.out.println("The string '"+srch+"'was found at line number "+i+" in file "+searchfile.getName()+"\n");
      }
    }
  }catch (Exception e){
  	e.printStackTrace();
  }
  }
}
