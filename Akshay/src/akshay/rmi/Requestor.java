package akshay.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Requestor 
{
	Scanner scan=new Scanner(System.in);
	public Requestor()
	{
		try {
			Support sup=(Support)Naming.lookup("localhost/akshay");
			System.out.println("Tell us client name: ");
			sup.readObject(scan.next());
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		Requestor req=new Requestor();
		
	}
}
