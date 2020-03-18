package akshay.oop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Arrays;
// model/ bean/ business class
public class Event 
{
	private String name, dept, org;
	private LocalDate date;
	private String[] part;
	private String Winner;
	private Integer price;
	public Event() {}
	public Event(String name, String dept, String org, String date, Integer price, int size) {
		super();
		this.name = name;
		this.dept = dept;
		this.org = org;
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.date = LocalDate.parse(date,format);
		this.price = price;
		this.part=new String[size];
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public void setDate(String date) {
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.date = LocalDate.parse(date,format);
	}
	public String[] getPart() {
		return part;
	}
	public void setPart(String[] part) {
		this.part = part;
	}
	public String getWinner() {
		return Winner;
	}
	public void setWinner(String winner) {
		Winner = winner;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Event [name=" + name + ", dept=" + dept + ", org=" + org
				+ ", date=" + date + ", part=" + Arrays.toString(part)
				+ ", Winner=" + Winner + ", price=" + price + "]";
	}
}
