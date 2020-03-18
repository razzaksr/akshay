package akshay.advance;

public class Course implements Comparable<Course>
{
	private String name;
	private Integer fee;
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
	@Override
	public int compareTo(Course arg0) 
	{
		//return arg0.name.compareTo(this.name);
		//return this.name.compareTo(arg0.name);
		//return this.fee.compareTo(arg0.fee);
		return arg0.fee.compareTo(this.fee);
	}
}
