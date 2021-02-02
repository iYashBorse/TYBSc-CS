import java.awt.*;
import java.awt.event.*;

public class textArea extends Frame implements ActionListener{
  Label l1;
  TextArea ta;
  TextField tf;
  Button b1,b2;

  public textArea(){
    setLayout(new FlowLayout());
    l1 = new Label("Enter a Number: ");
    b1 = new Button("Send Number");
    b2 = new Button("Clear Screen");
    tf = new TextField(20);
    ta = new TextArea(5,30);
    setBackground(Color.black); // Setting background color of the frame to black
	l1.setForeground(Color.white);
    addWindowListener(new win());
    b1.addActionListener(this);
    b2.addActionListener(this);
    add(l1); add(tf); add(b1);
    add(b2);
    add(ta);
    setSize(300,300);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource()==b1){
      int n = Integer.parseInt( tf.getText() );
      for(int i=1; i<=n; i++){
        if(i%10==0)
          ta.append(i+"\n");
        else
          ta.append(i+" ");
      }
    }

    if(e.getSource()==b2){
      tf.setText("");
      ta.setText("");
    }
  }

  class win extends WindowAdapter{
    public void windowClosing(WindowEvent w){
      System.exit(0);
    }
  }

  public static void main(String ar[]){
    new textArea();
  }
}
