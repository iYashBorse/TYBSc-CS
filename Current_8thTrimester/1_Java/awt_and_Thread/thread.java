import java.awt.*;
import java.awt.event.*;

public class threadProgram extends Frame implements ActionListener{

  TextArea ta;
  Button b1,b2 ,b3,b4;

  public threadProgram(){
    setLayout(new FlowLayout());
    b1 = new Button("Start");
    b2 = new Button("Suspend");
    b3 = new Button("Resume");
    b4 = new Button("Kill");
    ta = new TextArea(5,30);
    setBackground(Color.black);
    addWindowListener(new win());
    b1.addActionListener(this);
    b2.addActionListener(this);
    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(ta);
    setSize(300,300);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e){
    
  }

  class win extends WindowAdapter{
    public void windowClosing(WindowEvent w){
      System.exit(0);
    }
  }

  public static void main(String ar[]){
    new threadProgram();
  }
}
