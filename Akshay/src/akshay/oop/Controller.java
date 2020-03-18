package akshay.oop;

public class Controller
{
	public static void main(String[] args) 
	{
		Event eventOne=new Event();
		eventOne.setName("PPT");eventOne.setDept("CSE");eventOne.setOrg("Akshay");
		eventOne.setPrice(2000);eventOne.setDate("26/09/2019");
		System.out.println(eventOne);
		Event eventTwo=new Event("Quiz", "CSE", "Aravind", "27/09/2019", 3000,4);
		System.out.println(eventTwo.getName()+" "+eventTwo.getOrg()+" "+eventTwo.getDept()
				+" "+eventTwo.getPrice()+" "+eventTwo.getDate());
	}
}
