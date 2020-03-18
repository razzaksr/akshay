package akshay.multithread;

import java.util.Scanner;

public class InterThread 
{
	public static void main(String[] args) 
	{
		Candidate can=new Candidate();Techie tech=new Techie(can);
		Thread t1=new Thread(can);Thread t2=new Thread(tech);
		t1.start();t2.start();
	}
}
class Candidate implements Runnable
{
	int cutOff=30, users;
	Scanner scan=new Scanner(System.in);
	@Override
	public void run() 
	{
		synchronized (scan) 
		{
			System.out.println("Enter the no of possible answers count: ");
			users=scan.nextInt();
			if(users<=30){
				System.out.println("Have to wait to clear cutt off");
				try {
					scan.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(users>=30){System.out.println("u r shortlisted");}
			else{System.out.println("U r not shortlisted");}
		}
	}
}
class Techie implements Runnable
{
	Candidate temp;
	public Techie(){}
	public Techie(Candidate cand)
	{temp=cand;}
	@Override
	public void run() 
	{
		synchronized (temp.scan) 
		{
			if(temp.users<temp.cutOff)
			{
				System.out.println("Techie going to help you");
				temp.users+=temp.cutOff-temp.users;
				temp.scan.notify();
			}
		}
		System.out.println("Invigilating the written test");
		System.out.println("Had a coffe");
	}
}