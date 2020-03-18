package akshay.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Unmarshalling 
{
	public static void main(String[] args) throws JAXBException 
	{
		JAXBContext context=JAXBContext.newInstance(Projects.class);
		Unmarshaller unmarsh=context.createUnmarshaller();
		Projects p=(Projects)unmarsh.unmarshal(new File("C:\\Users\\DOLL\\workspace1\\Akshay\\kumar.xml"));
		System.out.println(p);
	}
}
