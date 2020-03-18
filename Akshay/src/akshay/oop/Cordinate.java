package akshay.oop;

public class Cordinate extends Course implements Skill
{
	public void decide()
	{
		if(this.getName().equalsIgnoreCase("Spring")||this.getName().equalsIgnoreCase("Hibernate"))
		{
			this.setFee(this.getFee()+1000);
		}
		else{this.setFee(this.getFee()-500);}
	}
	
	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Cordinate["+this.getName()+" "+this.getFee()+"]\n";
	}

	public static void main(String[] args) 
	{
		Cordinate cord=new Cordinate();
		cord.setFee(18000);cord.setName("Java");cord.decide();cord.refer();
		System.out.println(cord);
		Lead ld=new Lead();ld.setName("Python");ld.setFee(9000);ld.setDuration(80);
		System.out.println(ld);
	}

	@Override
	public void refer() 
	{
		this.setFee(this.getFee()-1000);
	}
}
interface Skill
{
	public void refer();// abstract method
}
class Lead extends Course
{
	private int duration;
	public int getDuration()// non abstract method 
	{
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		//return "Course [name=" + getName() + ", fee=" + getFee() + "]Lead [duration=" + duration + "]";
		System.out.println(super.toString());
		return "Lead [duration=" + duration + "]";
	}
}