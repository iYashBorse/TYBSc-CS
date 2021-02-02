import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;

class jmenu extends JFrame implements ActionListener{
	  JMenu color,edit,file;
	  JTextArea ta;
    JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9;
    public jmenu(){
		  setLayout(null);
		  ta=new JTextArea(4,30);
		  ta.setBounds(10,10,200,100);
	    JMenuBar mb=new JMenuBar();
	    color=new JMenu("Colors");
	    edit=new JMenu("Edit");
			file=new JMenu("File");
	    i1=new JMenuItem("Red");
	    i2=new JMenuItem("Green");
	    i3=new JMenuItem("Blue");
	    i4=new JMenuItem("Cut");
	    i5=new JMenuItem("Paste");
		  i6=new JMenuItem("Select Background Color");
		  i7=new JMenuItem("File Open");
		  i8=new JMenuItem("File Save");
			i9 = new JMenuItem("Copy");
	    color.add(i1); color.add(i2); color.add(i3); color.add(i6);
	    edit.add(i4); edit.add(i5); edit.add(i9);
			file.add(i7); file.add(i8);
			i2.addActionListener(this);
			i3.addActionListener(this);
			i4.addActionListener(this);
		  i6.addActionListener(this);
		  i5.addActionListener(this);
		  i1.addActionListener(this);
		  i7.addActionListener(this);
	 	  i8.addActionListener(this);
			i9.addActionListener(this);
	    mb.add(color);
			mb.add(edit);
			mb.add(file);
	    setJMenuBar(mb);
		  add(ta);
	    setSize(400,400);
	    setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource()==i1)
			ta.setForeground(Color.red);
		if(e.getSource()==i2)
			ta.setForeground(Color.green);
		if(e.getSource()==i3)
			ta.setForeground(Color.blue);
		if(e.getSource()==i4)
			ta.cut();
		if(e.getSource()==i5)
			ta.paste();
		if(e.getSource()==i6){
			Color initialcolor=Color.RED;
			Color color=JColorChooser.showDialog(this,"Select a color",initialcolor);
			ta.setBackground(color);
		}
		if(e.getSource()==i7){
			JFileChooser jf=new JFileChooser();
			jf.showOpenDialog(this);
			File f=jf.getSelectedFile();
			String filepath=f.getPath();
		        try{
			        BufferedReader br=new BufferedReader(new FileReader(filepath));
			        String s1="",s2="";
			        while((s1=br.readLine())!=null){
			        s2+=s1+"\n";
		        }
		        ta.setText(s2);
		        br.close();
		        }catch (Exception ex) {System.out.println(ex);  }
		}
		if(e.getSource()==i8){
			JFileChooser jf=new JFileChooser();
			jf.showSaveDialog(this);
			File f=jf.getSelectedFile();
			String filepath=f.getPath();
		}
		if(e.getSource()==i9){
			ta.copy();
		}
	}

	public static void main(String a[])
	{
		new jmenu();
	}
}
