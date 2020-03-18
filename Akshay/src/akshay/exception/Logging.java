package akshay.exception;

import java.util.Random;
import java.util.Scanner;

public class Logging 
{
	static int generated, users, limit=2;
	static Scanner scan=new Scanner(System.in);
	public static void gen()
	{
		Random ran=new Random();
		String dummy="";
		for(int in=1;in<=4;in++)
		{dummy+=ran.nextInt(10);}
		generated=Integer.parseInt(dummy);
		System.out.println("OTP is generated: "+generated);
	}
	public static void attempt()
	{
		try
		{
			System.out.println("Enter OTP here to authenticate: ");
			users=scan.nextInt();
			if(generated==users){System.out.println("U r authorised to proceed");}
			else
			{throw new PinException();}
		}
		catch(PinException pin)
		{
			System.out.println(pin);if(limit>0){limit--;Logging.attempt();}
			else{System.out.println("Attempts are over card is blocked");}
		}
	}
	public static void main(String[] args) 
	{
		Logging.gen();
		Logging.attempt();
	}
}
class PinException extends Exception
{
	public PinException()
	{
		super("Pin Not Match");
	}
}