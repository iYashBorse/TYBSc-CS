import java.awt.*;
import java.awt.event.*;
class colortest2 extends Frame implements ActionListener
{
Button b1,b2,b3;
TextField tf;
public colortest2()
{
setLayout(new FlowLayout());
b1=new Button("Red");
b2=new Button("Green");
b3=new Button("Blue");
tf=new TextField(20);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
add(tf);add(b1);add(b2);add(b3);
setSize(300,300);
setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
setBackground(Color.red);

if(ae.getSource()==b2)
setBackground(Color.green);

if(ae.getSource()==b3)
setBackground(Color.blue);
}
public static void main(String p[])
{
new colortest2();
}
}