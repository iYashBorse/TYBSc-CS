import java.awt.*;
import java.awt.event.*;
class userpassgrid extends Frame implements ActionListener
{
Button b1;
Label l1,l2,l3;
TextField t1,t2;
public userpassgrid()
{
setLayout(new GridLayout(2,3));
b1=new Button("Login");
l1=new Label("Enter User name,Password");
t1=new TextField(20);
t2=new TextField(20);
l3=new Label("Result");
b1.addActionListener(this);
add(t1);
add(t2);
add(b1);
add(l3);
add(l1);
addWindowListener(new win());
setSize(300,300);
setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
String un=t1.getText();
String ps=t2.getText();
if(un.equals("MIT") && ps.equals("WPU"))
l3.setText("Welocome ..");
else
l3.setText("Try again..");
}
class win extends WindowAdapter
{
public void windowClosing(WindowEvent w)
{
System.exit(0);
}
}
public static void main(String p[])
{
new userpassgrid();
}
}