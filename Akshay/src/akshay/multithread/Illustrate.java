package akshay.multithread;

import java.util.Random;

public class Illustrate 
{
	public static void main(String[] args) 
	{
		Found f=new Found();
		Thread t1=new Thread(f,"Kumar");
		Thread t2=new Thread(f,"Revanth");
		Thread t3=new Thread(f,"Richard");
		Thread t4=new Thread(f,"Pawan");
		t1.start();t2.start();t3.start();t4.start();
	}
}
class Found implements Runnable
{
	public void ask()
	{
		System.out.println(new Random().nextInt(1000));
	}
	synchronized public void run()
	{
		System.out.print(Thread.currentThread().getName());
		System.out.println(" "+Thread.currentThread().getId());
		ask();
	}
}