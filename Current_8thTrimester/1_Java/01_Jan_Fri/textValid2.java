import java.awt.*;
import java.awt.event.*;
class textValid2 extends Frame implements ActionListener{
  Label l1,l2,l3;
  Button b1;
  TextField tf1, tf2;
  public textValid2(){
    setLayout(new GridLayout(3,2));
    l1 = new Label("Username: ");
    tf1 = new TextField(20);
    l2 = new Label("Password: ");
    tf2 = new TextField(20);
    b1= new Button("Submit!");
    l3 = new Label("           ");
    b1.addActionListener(this);
    add(l1); add(tf1);
    add(l2); add(tf2);
    add(b1); add(l3);
    setSize(300,300);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==b1){
      if(tf1.getText().equals("MIT") && tf2.getText().equals("WPU")){
        l3.setText("Valid credentials.");
      }
      else{
        l3.setText("\nInvalid credentials!");
      }
    }
  }

  public static void main(String ar[]){
    new textValid2();
  }
}
