package akshay.customs;

import java.io.IOException;
import java.util.Random;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class HandleFindMin extends TagSupport
{
	private int initiate,stop,current;
	private static int min;
	private Random ran=new Random();
	public void setInitiate(int initaite)
	{this.initiate=initaite;}
	public void setStop(int stop)
	{this.stop=stop;}
	
	public void doMin()
	{
		current=ran.nextInt(1000);
		JspWriter yet=pageContext.getOut();
		try {
			yet.println("<br>Random is:"+current+"<br>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(current<min)
		{min=current;}
	}
	
	@Override
	public int doAfterBody() throws JspException {
		// TODO Auto-generated method stub
		if(initiate==stop)
		{
			return SKIP_BODY;
		}
		else
		{
			doMin();
			initiate++;
			return EVAL_BODY_AGAIN;
		}
	}

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		JspWriter yet=pageContext.getOut();
		try {
			yet.println(min+" is minimum among random numbers");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		min=Integer.MAX_VALUE;
		return EVAL_BODY_INCLUDE;
	}
}
