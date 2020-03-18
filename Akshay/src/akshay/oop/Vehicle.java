package akshay.oop;

abstract public class Vehicle 
{
	String model;double price;
	public void demo()
	{
		System.out.println(model+" "+price);
	}
	abstract public void tax();
}
