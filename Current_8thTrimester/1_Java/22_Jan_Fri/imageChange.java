/* Create a program with JLabel, JCombobox and JList.
Attach itemlistener to JCombobox and display corresponding
images on the JLabel*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class imageChange extends JFrame implements ItemListener{
  //JButton b1;
  JList <String> jl;
  JLabel lb;
  String st[] = {"Java","Python","Php"};
  JComboBox<String> LanguageList;

  public imageChange(){
    setLayout(new FlowLayout());

    lb = new JLabel(new ImageIcon("java.jpg"));
    LanguageList = new JComboBox<>(st);
    jl = new JList<>(st);
    add(LanguageList); add(jl);  add(lb);
    LanguageList.addItemListener(this);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300,300);
    setVisible(true);
  }

  public void itemStateChanged(ItemEvent ie){
    String getItem = (String)LanguageList.getSelectedItem();

    if(getItem.equals(st[0]))
      lb.setIcon(new ImageIcon("java.jpg"));
      if(getItem.equals(st[1]))
        lb.setIcon(new ImageIcon("python.jpg"));
        if(getItem.equals(st[2]))
          lb.setIcon(new ImageIcon("php.jpg"));
  }

  public static void main(String ar[]){
    imageChange ec = new imageChange();
  }
}
