package akshay.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;

public class Central extends UnicastRemoteObject implements Support
{
	Vector<Projects> store=new Vector<Projects>();
	public Central()throws RemoteException
	{
		try {
			Naming.rebind("localhost/akshay", this);
		} catch (RemoteException | MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws RemoteException 
	{
		Central cent=new Central();
		cent.store.add(new Projects(12, 34, "irctc", "India", "Java", "completed", "01/01/2020", "01/04/2020"));
		cent.store.add(new Projects(98, 123, "google pay", "google", "Angular", "completed", "01/01/2018", "28/09/2019"));
		cent.store.add(new Projects(43, 987, "google drive", "Google", "Dot net", "completed", "23/11/2008", "19/02/2011"));
	}
	@Override
	public void readObject(Object object) throws RemoteException 
	{
		for(Projects yet:store)
		{
			if(yet.getProclient().equals(object))
				System.out.println(store.indexOf(yet)+1);
		}
	}
}
