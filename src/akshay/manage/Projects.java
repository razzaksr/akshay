package akshay.manage;

import java.io.InputStream;
import java.util.Date;

public class Projects 
{
	private Integer pronum,promem;
	private String proname,proclient,protech,prostatus;
	private Date prokickstart,prodeadline;
	private InputStream proreq;
	@Override
	public String toString() {
		return "Projects [pronum=" + pronum + ", promem=" + promem + ", proname=" + proname + ", proclient=" + proclient
				+ ", protech=" + protech + ", prostatus=" + prostatus + ", prokickstart=" + prokickstart
				+ ", prodeadline=" + prodeadline + ", proreq=" + proreq + "]";
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
	public InputStream getProreq() {
		return proreq;
	}
	public void setProreq(InputStream proreq) {
		this.proreq = proreq;
	}
}
