package akshay.oop;

public class Course 
{
	private String name;
	private int fee;
	public Course() {
		System.out.println("Course constructor default");
	}
	public Course(String name, int fee) {
		super();
		this.name = name;
		this.fee = fee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", fee=" + fee + "]";
	}
}
