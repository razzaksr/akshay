package akshay.oop;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestReport 
{
	public static void main(String[] args) 
	{
		Result res=JUnitCore.runClasses(TestOrganise.class);
		List<Failure> fails=res.getFailures();
		for(Failure f:fails){System.out.println(f.toString());}
		System.out.println(res.wasSuccessful());
	}
}
