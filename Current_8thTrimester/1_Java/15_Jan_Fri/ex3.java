import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 

class ex3 extends JFrame implements ActionListener
{
JLabel un,ps , lab3;
JTextField uname;
JPasswordField pass;
JButton b1;
JButton b2;
public ex3()
{
setLayout(new FlowLayout());
un=new JLabel("UserName");
ps=new JLabel("Password");
uname=new JTextField(20);
pass=new JPasswordField(20);
b1=new JButton("Login");
lab3 = new JLabel("");
add(un);add(uname);
add(ps);add(pass);
add(b1);add(lab3);
b1.addActionListener(this);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(300,300);
setVisible(true);
}
public void actionPerformed(ActionEvent e){
	String str1 = uname.getText();
 String str2 = new String(pass.getPassword());
	  if(str1.equals("Shinchan") && str2.equals("Shinchan")){
        JOptionPane.showMessageDialog(this,"Welcome ~"+uname.getText());
       }
     else{
                JOptionPane.showMessageDialog(this,"Try Again ~"+uname.getText());

     }
}

public static void main(String[] a)
{
ex3 e3=new ex3();
}
}