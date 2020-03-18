package akshay.exception;

public class Intention 
{
	public static void main(String[] args) 
	{
		String make=null;
		try
		{
			System.out.println(make.charAt(0));
		}
		catch(NullPointerException np)
		{
			//np.printStackTrace();
			System.out.println(np+" Space not allocated for data");
			make="donut";
			//make=new String();//-1
			System.out.println(make.charAt(0));
		}
		finally
		{System.out.println("Extraction done");}
	}
}