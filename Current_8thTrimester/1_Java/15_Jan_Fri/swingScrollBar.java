import javax.swing.*;
import java.awt.*;
class swingScrollBar extends JFrame{
		JTextArea ta;
		JButton  b1;
		JScrollPane p;

	public swingScrollBar(){
		setLayout(new FlowLayout());
		b1=new JButton("Ok");
		ta=new JTextArea(3,20);
		p=new JScrollPane(ta);
		add(p);add(b1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] a){
		new swingScrollBar();
	}
}