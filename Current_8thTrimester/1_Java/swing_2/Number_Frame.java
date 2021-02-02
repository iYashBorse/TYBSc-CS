import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Number_Frame extends JFrame implements ActionListener
{
     JLabel textLabel, Label1, Label2;
     JTextField Text1, Text2, Text3;
     JButton ok, exit;
     JPanel pan1, pan2;
     int occurrences = 0, i = 0;
     public Number_Frame()
     {
          textLabel = new JLabel("Enter Number ",JLabel.CENTER);
          Label1 = new JLabel("Previous Number ",JLabel.CENTER);
          Label2 = new JLabel("Next Number ",JLabel.CENTER);
          Text1 = new JTextField(20);
          Text2 = new JTextField(20);
          Text3 = new JTextField(20);
          pan1 = new JPanel();
          pan1.setLayout(new GridLayout(4,2));
          pan1.add(textLabel);
          pan1.add(Text1);
          pan1.add(Label1);
          pan1.add(Text2);
          pan1.add(Label2);
          pan1.add(Text3);
          ok = new JButton("ok");
          exit = new JButton("Exit");
          ok.addActionListener(this);
          exit.addActionListener(this);
          pan2 = new JPanel();
          pan2.setLayout(new FlowLayout());
          pan2.add(ok);
          pan2.add(exit);
          add(pan1,"Center");
          add(pan2,"South");
          setTitle("Numnber Operation");
          setSize(300, 200);
          setVisible(true);
     }
     public void actionPerformed(ActionEvent ae)
     {
          JButton btn = (JButton)ae.getSource();
          if (btn == ok)
          {
               String  f = Text1.getText();
               int s=Integer.parseInt(f);
               s=s+1;
               Text3.setText(Integer.toString(s));
               int a=Integer.parseInt(f);
               a=a-1;
               Text2.setText(Integer.toString(a));  
          }
          if (btn == exit)
          {
               System.exit(0);
          }
     }
     public static void main(String[] args)
     {
          new Number_Frame();
     }
}