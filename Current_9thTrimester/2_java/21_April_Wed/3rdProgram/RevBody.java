package pack;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

public class RevBody extends BodyTagSupport {
   public int doEndTag() throws JspException{
	try{
      BodyContent bc=getBodyContent();
      StringBuffer buf=new StringBuffer(bc.getString());
      buf.reverse();
      bc.getEnclosingWriter().write(buf.toString());
	}catch(Exception e){}
	return EVAL_PAGE;
   }
}