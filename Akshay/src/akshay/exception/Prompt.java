package akshay.exception;

import java.io.IOException;
import java.util.Scanner;

public class Prompt 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		Scanner scan=new Scanner(System.in);
		Runtime run=Runtime.getRuntime();
		String app="";
		System.out.println("Enter the first process you wish to open: ");
		Process pro;app=scan.next();Thread.sleep(5000);
		pro=run.exec(app);
		System.out.println("Enter the second process you wish to open: ");
		app=scan.next();Thread.sleep(5000);
		pro=run.exec(app);
	}
}
