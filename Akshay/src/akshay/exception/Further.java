package akshay.exception;

import java.util.Scanner;

public class Further 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);int num=0, ind=0;
		int[] y={98,7,65,4,32,1,0};
		try
		{
			System.out.println("Enter the number you gonna divide");
			num=scan.nextInt();// 89
			ind=scan.nextInt();
			System.out.println(num/y[ind]);
		}
		catch(ArrayIndexOutOfBoundsException ain)
		{
			System.out.println(ain+" Enter less than: "+y.length);// 7
			ind=scan.nextInt();
			System.out.println(num/y[ind]);
		}
		catch(ArithmeticException arith)
		{
			System.out.println(arith+" Select index except 6 and less than "+y.length);
			ind=scan.nextInt();
			System.out.println(num/y[ind]);
		}
		catch(Exception e){}
		finally
		{System.out.println("Division done");}
	}
}
