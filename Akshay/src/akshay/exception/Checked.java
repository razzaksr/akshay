package akshay.exception;

import java.io.IOException;
import java.util.InputMismatchException;

public class Checked 
{
	public static void main(String[] args) throws ClassNotFoundException, IOException, InterruptedException 
	{
		AkshayOwn akshay=new AkshayOwn();
		for(double temp:akshay.genOne(1))
		{
			System.out.println(temp);
		}
		System.out.println("data by row,col: "+akshay.genTwo(0, 3));
	}
}
class AkshayOwn
{
	double[][] y={{3.4,9.2,8.9,5.5},{12.4,9.2,15.6,2.1}};
	public double[] genOne(int row)throws ClassNotFoundException, InputMismatchException
	{
		return y[row];
	}
	public double genTwo(int row, int col)throws IOException, InterruptedException
	{
		return y[row][col];
	}
}