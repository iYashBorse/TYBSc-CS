import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



class ex5 extends JFrame 
{
JScrollPane p1;
JLabel lb;
JButton b1;
public ex5()
{
	setLayout(null);
	b1 = new JButton("OK");
	lb = new JLabel(new ImageIcon("img.png"));
	p1 = new JScrollPane(lb);
	b1.setBounds(10,10,400,50);
	p1.setBounds(10,70,400,400);
	add(b1); add(p1);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(700,700);
setVisible(true);
}

public static void main(String[] a)
{
ex5 e5=new ex5();
}
}