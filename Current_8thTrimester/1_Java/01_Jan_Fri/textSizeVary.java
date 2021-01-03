import java.awt.*;
import java.awt.event.*;

class textSizeVary extends Frame implements ActionListener{
  TextField tf1;
  Checkbox c1,c2,c3,s1,s2,s3; //radiobuttons
  CheckboxGroup cb;
  Font f;
  Button b1;

  public textSizeVary(){
    setLayout(new FlowLayout());
    tf1 = new TextField(20);
    cb = new CheckboxGroup();
    c1 = new Checkbox("12",cb,true);
    c2 = new Checkbox("16",cb,false);
    c3 = new Checkbox("22",cb,false);
    s1 = new Checkbox("Plain");
    s2 = new Checkbox("Bold");
    s3 = new Checkbox("Italic");
    f = new Font("Arial", Font.PLAIN, 12);
    tf1.setFont(f);
    b1 = new Button("Apply");
    b1.addActionListener(this);
    addWindowListener(new win());
    add(tf1); add(b1); add(c1); add(c2); add(c3);
    add(s1); add(s2); add(s3);
    setSize(300,300);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae){
    int sz = 12; int s=Font.PLAIN;
    if(c1.getState()==true)
      sz = 12;
    if(c2.getState()==true)
      sz = 16;
    if(c3.getState()==true)
      sz = 22;
    if(s1.getState()==true)
      s=Font.PLAIN;
    if(s2.getState()==true)
      s=Font.BOLD;
    if(s3.getState()==true)
      s=Font.ITALIC;
    if(s1.getState()==true && s3.getState()==true)
      s=Font.PLAIN+Font.ITALIC;
    if(s2.getState()==true && s3.getState()==true)
      s=Font.BOLD+Font.ITALIC;
    f = new Font("Arial",s,sz);
    tf1.setFont(f);
    }

  class win extends WindowAdapter{
   public void windowClosing(WindowEvent w){
      System.exit(0);
   }
  }

  public static void main(String ar[]){
    new textSizeVary();
  }
}
