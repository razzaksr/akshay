package akshay.advance;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenning 
{
	public static void main(String[] args) 
	{
		System.out.println("Type email to verify: ");
		String email=new Scanner(System.in).next();
		StringTokenizer tok=new StringTokenizer(email,"@.");
		String[] parts=new String[3];
		System.out.println(tok.countTokens());
		int index=0;
		while(tok.hasMoreTokens()&&index<parts.length)
		{
			parts[index]=tok.nextToken();index++;
		}
		if(parts[0].length()>=2&&parts[1].length()>=5&&parts[2].length()>=2)
		{
			System.out.println(email+" is Valid email");
		}
		else
		{
			System.out.println(email+" is not an Valid email");
		}
	}
}
