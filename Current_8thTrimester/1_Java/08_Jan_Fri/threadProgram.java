import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class threadProgram extends Frame implements ActionListener,Runnable
{

  Thread t1;
  TextArea ta;
  Button b1,b2,b3,b4;
  static int cnt=1;
  boolean susf=false;
  boolean fg=false;
  boolean killf=false;
  public threadProgram(){
    setLayout(new FlowLayout());
    ta=new TextArea(4,50);
    b1=new Button("Start");
    b2=new Button("Suspend");

    add(ta);
    b1.addActionListener(this);
    b2.addActionListener(this);

    add(b1);
    add(b2);
    add(b3);
    add(b4);
    setSize(300,300);
    setVisible(true);
  }


synchronized void myresume(){
  susf=false;
  notify();
}

public void run(){
  try{

    if(fg){
      while(cnt<=100){
      ta.append(" "+cnt);
      Thread.sleep(500); 
        synchronized(this){
          if(killf){
            ta.setText("");
            t1=null; break;
          }
        while(susf)
        wait();
        }//syn
      cnt++;
      }//while
    }
  }catch(Exception p){
  System.out.println("error "+p);
  }//catch
}

public void actionPerformed(ActionEvent e){

  if(e.getSource()==b1){
    fg=true;
    killf=false;
    cnt=1;
    t1=new Thread(this);
    t1.start();
  }
  if(e.getSource()==b2){
    susf=true;
  }
  if (e.getSource()==b3){
    myresume();
  }
  if(e.getSource()==b4){
    killf=true;
  }
}
public static void main(String a[]){
  new threadProgram();
}
}