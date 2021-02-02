import java.awt.*;
import java.awt.event.*;

class stateCity extends Frame implements ItemListener{
	Choice c1,c2;
	Label l1;
	public stateCity(){

		setLayout(new FlowLayout());
		l1 = new Label("select your state:");
		c1 = new Choice();
		c1.add("Maharashtra");
		c1.add("Gujrat");
		c1.add("Madhya Pradesh");
		c2 = new Choice();
		c2.add("Mumbai");
		c2.add("Pune");
		c2.add("Nasik");
		addWindowListener(new win());
		c1.addItemListener(this);
		add(l1);
		add(c1);
		add(c2);
		setSize(300,300);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent i)
{
String str=c1.getSelectedItem();
if(str.equals("Maharashtra"))
{
c2.removeAll();
c2.add("Mumbai");
c2.add("Pune");
c2.add("Nasik");
}
if(str.equals("Gujrat"))
{
c2.removeAll();
c2.add("Gandhinagar");
c2.add("Surat");
c2.add("Vadodara");
}
if(str.equals("Madhya Pradesh"))
{
c2.removeAll();
c2.add("Indore");
c2.add("Ratlam");
c2.add("Ujjain");
}
}
class win extends WindowAdapter
{
public void windowClosing(WindowEvent w)
{
System.exit(0);
}
}
public static void main(String a[])
{
new stateCity();
}
}
