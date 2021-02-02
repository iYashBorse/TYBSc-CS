import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ex6 extends JFrame 
{
JTabbedPane p;
JRadioButton r1, r2;
JCheckBox c1 , c2 ;
JLabel lb;
ButtonGroup bg;
JScrollPane p1;
JPanel p11 , p2 , p3;

public ex6()

{   p11 = new JPanel();
	p2 = new JPanel();
	p3 = new JPanel();
	bg = new ButtonGroup();

	r1 = new JRadioButton("Male");
	r2 = new JRadioButton("Female");

	c1 = new JCheckBox("B.E");
	c2 = new JCheckBox("M.E");
	// image scrolling isn't working , anyone interested can fix the bug.
	// Or Can mail the Program to  githubhelp@yahoo.com ( Appreciated. )
	lb = new JLabel(new ImageIcon("img.png"));
	p1 = new JScrollPane(lb);
	p3.add(lb);
	bg.add(r1); bg.add(r2);

	p11.add(c1); p11.add(c2);


	p2.add(r1); p2.add(r2); 
	p3.add(p1);
	p = new JTabbedPane();
	p.addTab("Check boxes",p11);
	p.addTab("Button ",p2);
	p.addTab("Image",p3);
	add(p);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(700,700);
setVisible(true);
}

public static void main(String[] a)
{
ex6 e6=new ex6();
}
}