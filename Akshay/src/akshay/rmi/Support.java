package akshay.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Support extends Remote
{
	public void readObject(Object object)throws RemoteException;
}
