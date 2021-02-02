import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 

class ex1 extends JFrame implements ActionListener
{
JLabel un,ps;
JTextField uname;
JPasswordField pass;
JButton b1;
JButton b2;
public ex1()
{
setLayout(new FlowLayout());
un=new JLabel("UserName");
ps=new JLabel("Password");
uname=new JTextField(20);
pass=new JPasswordField(20);
b1=new JButton("Login");
b2=new Button("Login");
add(un);add(uname);
add(ps);add(pass);
add(b1);add(b2);
b1.addActionListener(this);
b2.addActionListener(this);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(300,300);
setVisible(true);
}

public static void main(String[] a)
{
ex1 e1=new ex1();
}
}