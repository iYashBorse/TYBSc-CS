import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 // Checkbox and radio button
class ex4 extends JFrame 
{
	JRadioButton r1, r2 , r3;
JCheckBox c1 , c2 , c3;
ButtonGroup bg;
public ex4()
{
	setLayout(new FlowLayout());
	bg = new ButtonGroup();
	r1 = new JRadioButton("Male");
	r2 = new JRadioButton("Female");
	r3 = new JRadioButton("Other");
	c1 = new JCheckBox("B.E");
	c2 = new JCheckBox("M.E");
	c3 = new JCheckBox("Ph.D.");
	add(c1);add(c2);add(c3);
	bg.add(r1);bg.add(r2);bg.add(r3);
	add(r1); add(r2); add(r3);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(300,300);
setVisible(true);
}

public static void main(String[] a)
{
ex4 e4=new ex4();
}
}