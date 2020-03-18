package akshay.oop;

public class Manipulate 
{
	public static void main(String[] args) 
	{
		Vehicle v=new PrivateVehicle();v.tax();
		v=new CommercialVehicle();v.tax();
	}
}

class PrivateVehicle extends Vehicle
{
	@Override
	public void tax() 
	{
		System.out.println("Private vehicle 6.5 percent tax");
		model="Avenger220";price=98700.8;
		price+=(price*6.5)/100;
		demo();
	}
}
class CommercialVehicle extends Vehicle
{
	@Override
	public void tax() 
	{
		System.out.println("Commercial vehicle 12.5 percent tax");
		model="Rapido";price=97700.8;
		price+=(price*12.5)/100;
		demo();
	}
}