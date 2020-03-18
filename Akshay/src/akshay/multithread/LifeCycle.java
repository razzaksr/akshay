package akshay.multithread;

import java.util.Scanner;

public class LifeCycle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Action action=new Action(98765456L,2340.8);
		Thread t1=new Thread(action,"Thursday");
		Thread t2=new Thread(action,"Tuesday");
		Thread t3=new Thread(action,"Saturday");
		t1.start();t1.join();t2.start();t2.join();t3.start();
	}
}

class Account
{protected long accNo;double balance;}

class Action extends Account implements Runnable
{
	public Action(){}
	public Action(long a,double b){accNo=a;balance=b;}
	Scanner scan=new Scanner(System.in);
	
	public String toString(){return "Account details: "+this.accNo+" "+this.balance+"\n";}
	
	public void credit()
	{
		System.out.println("Enter the amount to credit: "+this.accNo);
		balance+=scan.nextInt();
	}
	
	public void debit()
	{
		System.out.println("Enter the amount to debit: "+this.accNo);
		int temp=scan.nextInt();
		if(temp<=balance)
		{balance-=temp;System.out.println("Requested amount "+temp+" debited");}
		else{System.out.println("Insufficient balance");}
	}
	
	@Override
	public void run() 
	{
		credit();
		if(Thread.currentThread().getName().equals("Saturday"))
		{Thread.currentThread().stop();}
		if(Thread.currentThread().getName().equals("Tuesday"))
		{try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		debit();System.out.println(this);
	}
}