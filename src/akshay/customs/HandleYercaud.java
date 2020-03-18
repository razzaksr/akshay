package akshay.customs;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class HandleYercaud extends TagSupport
{
	private int start,end;
	private String season="";
	public void setEnd(int end) {
		this.end = end;
	}

	public void setStart(int start) {
		this.start = start;
	}	
	@Override
	public int doAfterBody() throws JspException {
		// TODO Auto-generated method stub
		if(start>=2&&end<=3)
		{season="Little bit sunny";}
		else if(start>3&&end<=6)
		{season="Sunny with heavy temprature and you can see flower show";}
		else if(start>6&&end<=8)
		{season="Rainy season";}
		else if(start>8&&end<=12)
		{season="Winter season";}
		else {season="Not a valid interval";}
		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		JspWriter yet=pageContext.getOut();
		try {
			yet.println(start+" and "+end+" is "+season);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}

	@Override
	public int doStartTag() throws JspException {
		JspWriter yet=pageContext.getOut();
		season="";
		try {
			yet.println("<br>We gonna tell you what you can expext in "+start+" and "+end+"<br>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_BODY_INCLUDE;
	}
}