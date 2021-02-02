import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

public class table extends JFrame{
  String str[] = {"Rno","Name","Weight"};
  Object obj[][] = {{"1","Geeta","56"},{"2","Reeta","66"},{"3","Geeta","77"}};
  JTable tb;
  JScrollPane p;

  public table(){
    setLayout(new FlowLayout());
    tb = new JTable(obj,str);
    p=new JScrollPane(tb);

    add(p); add(tb);
    setSize(300,300);
    setVisible(true);
  }

  public static void main(String[] ar){
    table t = new table();
  }
}
