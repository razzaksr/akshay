package akshay.oop;


import junit.framework.Assert;


import org.junit.BeforeClass;
import org.junit.Test;

public class TestOrganise 
{
	static Organise org;
	@BeforeClass
	public static void ask()
	{
		org=new Organise();
		org.addAnEvent(new Event("PPT","CSE","someone","12/12/2019",2000,5));
	}
	@Test
	public void testAddAnEvent()
	{
		Assert.assertEquals("PPT", org.eve[0].getName());
	}
	@Test
	public void testReadAnEvent()
	{
		Assert.assertNotNull(org.readAnEvent("PPT"));
	}
}
