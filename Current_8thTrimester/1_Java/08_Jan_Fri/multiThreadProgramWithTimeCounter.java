import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;  
public class multiThreadProgramWithTimeCounter extends Frame implements ActionListener, Runnable{

  Thread t1;
  TextArea ta;
  Button b1, b2;
  Label l1 ;

	static int cnt = 1;
	boolean susf = false;
	boolean fg = false;
	boolean killf = false;

  public multiThreadProgramWithTimeCounter(){
    setLayout(new FlowLayout());
		ta = new TextArea(4,50);
		b1 = new Button("Show");
		b2 = new Button("Stop");
		add(ta);
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(b1);
		add(b2);
		setBackground(Color.black);
		setForeground(Color.white);
		b1.setForeground(Color.black);
		b2.setForeground(Color.black);
		ta.setForeground(Color.black);

    l1 = new Label();
    add(l1);
		setSize(450,300);
		setVisible(true);
  }

  public void run() {
		try {
			if (fg) {
				while (cnt <= 100) {
					ta.append(" " + cnt);
					Thread.sleep(500);
					synchronized (this) {
						if (killf) {
							ta.setText("");
							t1 = null;
							break;
						}
					}
					cnt++;
				}
			}
		} catch (Exception p) {
			System.out.println("error " + p);
		}
    while(true){
        try{
            Thread.sleep(1000);
            l1.setText(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")).toString());
        }
        catch(Exception e){

        }
    }
  }

  public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			fg = true;
			killf = false;
			cnt = 1;
			t1 = new Thread(this);
			t1.start();
		}
		if (e.getSource() == b2) {
			killf = true;
		}
	}

  public static void main(String ar[]){
    new multiThreadProgramWithTimeCounter();
  }
}
