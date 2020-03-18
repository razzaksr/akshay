package akshay.exception;

import java.util.Scanner;

public class Manual 
{
	static int number;static String alpha;
	public static void geo()
	{
		try
		{
			number=Integer.parseInt(alpha);
			System.out.println(number+" shifted by 2 bits then "+(number<<2));
		}
		catch(NumberFormatException num)
		{
			System.out.println(num+" Inside an Method catch");
			throw num;
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			alpha=args[1];
			Manual.geo();
		}
		catch(NumberFormatException nu)
		{
			System.out.println(nu+" Inside a Main method catch");
			System.out.println("Enter only numerical data");
			alpha=new Scanner(System.in).next();number=Integer.parseInt(alpha);
			System.out.println(number+" shifted by 2 bits then "+(number<<2));
		}
	}
}