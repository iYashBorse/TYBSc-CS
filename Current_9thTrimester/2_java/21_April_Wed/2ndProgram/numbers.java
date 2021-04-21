package pack;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

public class numbers extends SimpleTagSupport {
  public void doTag() throws JspException, IOException {
    JspWriter out = getJspContext().getOut();
    int sum = 0;
    for(int i = 1; i<=10; i++){
      sum += i;
    }
    out.println("Sum of 1 to 10 numbers is "+sum);
  }
}
