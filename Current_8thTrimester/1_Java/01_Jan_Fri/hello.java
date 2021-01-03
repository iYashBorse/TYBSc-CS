import java.awt.*;
class hello extends Frame
{
Button b1,b2;
public hello()
{
setLayout(new FlowLayout());
b1=new Button("Ok");
b2=new Button("Cancel");
add(b1);
add(b2);
setSize(300,300);
setVisible(true);
}
public static void main(String st[])
{
new hello();
}
}