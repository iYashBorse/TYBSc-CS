import java.awt.*;
import java.awt.event.*;
class trycontrols extends Frame 
{
Label l1,l2;
Button b1,b2;
Checkbox c1,c2;
Checkbox r1,r2;//radiobuttons
CheckboxGroup cb;
Choice ch;
TextField tf;
List lt;
public trycontrols()
{
setLayout(new FlowLayout());
l1=new Label("Name..");
l2=new Label("I am trying different GUI based controls");
b1=new Button("Red");
b2=new Button("Green");
cb=new CheckboxGroup();
r1=new Checkbox("Male",cb,true);
r2=new Checkbox("Female",cb,false);
c1=new Checkbox("Bold");
c2=new Checkbox("Italic");
tf=new TextField(20);
ch=new Choice();
ch.add("BCA");
ch.add("BBA");
ch.add("BSC Computer");
ch.add("MCA");
lt=new List(3,true);
lt.add("Pune");lt.add("Mumbai");lt.add("Nasik");
add(l1);add(l2);add(tf);add(b1);add(b2);
add(c1);add(c2);add(r1);add(r2);add(ch);add(lt);
setSize(300,300);
setVisible(true);
}
public static void main(String p[])
{
new trycontrols();
}
}