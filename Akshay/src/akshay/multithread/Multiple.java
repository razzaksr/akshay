package akshay.multithread;

import java.util.Random;
import java.util.Scanner;

public class Multiple 
{
	public static void main(String[] args) 
	{
		WetGames wet=new WetGames();
		DryGames dry=new DryGames();
		Thread t1=new Thread(wet,"Sukumar");
		Thread t2=new Thread(dry,"Aravind");
		t1.start();t2.start();
	}
}
class WetGames implements Runnable
{
	static int limit=30;int check;
	public void let()
	{
		if(limit==0){return;}
		else
		{
			check=new Random().nextInt(500);
			if(check>=300)
			{limit--;System.out.println("Person entered");}
		}
		let();
	}
	@Override
	public void run() 
	{System.out.println(Thread.currentThread().getName());let();}
}
class DryGames implements Runnable
{
	static int[] age=new int[5];int constrain;
	Scanner scan=new Scanner(System.in);
	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().getName());
		for(int index=0;index<age.length;index++)
		{
			System.out.println("Enter the age to verify: ");
			constrain=scan.nextInt();
			if(constrain>=21){age[index]=constrain;System.out.println(constrain+" entered");}
		}
	}
}