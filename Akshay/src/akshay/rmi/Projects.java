package akshay.rmi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Projects 
{
	private Integer pronum,promem;
	private String proname,proclient,protech,prostatus;
	private Date prokickstart,prodeadline;
	
	public Projects(Integer pronum, Integer promem, String proname, String proclient, String protech, String prostatus,
			String prokickstart, String prodeadline) {
		super();
		this.pronum = pronum;
		this.promem = promem;
		this.proname = proname;
		this.proclient = proclient;
		this.protech = protech;
		this.prostatus = prostatus;
		SimpleDateFormat simple=new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.prokickstart = simple.parse(prokickstart);
			this.prodeadline = simple.parse(prodeadline);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Projects [pronum=" + pronum + ", promem=" + promem + ", proname=" + proname + ", proclient=" + proclient
				+ ", protech=" + protech + ", prostatus=" + prostatus + ", prokickstart=" + prokickstart
				+ ", prodeadline=" + prodeadline + "]";
	}
	public Integer getPronum() {
		return pronum;
	}
	public void setPronum(Integer pronum) {
		this.pronum = pronum;
	}
	public Integer getPromem() {
		return promem;
	}
	public void setPromem(Integer promem) {
		this.promem = promem;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public String getProclient() {
		return proclient;
	}
	public void setProclient(String proclient) {
		this.proclient = proclient;
	}
	public String getProtech() {
		return protech;
	}
	public void setProtech(String protech) {
		this.protech = protech;
	}
	public String getProstatus() {
		return prostatus;
	}
	public void setProstatus(String prostatus) {
		this.prostatus = prostatus;
	}
	public Date getProkickstart() {
		return prokickstart;
	}
	public void setProkickstart(Date prokickstart) {
		this.prokickstart = prokickstart;
	}
	public Date getProdeadline() {
		return prodeadline;
	}
	public void setProdeadline(Date prodeadline) {
		this.prodeadline = prodeadline;
	}
}
